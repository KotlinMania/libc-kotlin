@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.NativeDirectoryEntryBuffer
import io.github.kotlinmania.libc.unix.closedir
import io.github.kotlinmania.libc.unix.fdopendir
import io.github.kotlinmania.libc.unix.opendir
import io.github.kotlinmania.libc.unix.readdir
import io.github.kotlinmania.libc.unix.readdirR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class DirectoryRuntimeTest {
    @Test
    fun readNamesRemainStableAfterSubsequentReadAndClose() =
        withDirectory { path ->
            val stream = assertNotNull(opendir(path))
            val first =
                try {
                    val initial = assertNotNull(readdir(stream))
                    val original = initial.dName.copyOf()
                    val names = mutableSetOf(initial.dName.directoryName())
                    var reads = 0
                    while (true) {
                        libc.cinterop.libc_set_errno(0)
                        val next = readdir(stream)
                        if (next == null) {
                            assertEquals(0, libc.cinterop.libc_get_errno())
                            break
                        }
                        names += next.dName.directoryName()
                        assertTrue(++reads < 100, "Directory traversal did not terminate")
                    }
                    assertTrue("first" in names)
                    assertTrue("second" in names)
                    initial to original
                } finally {
                    assertEquals(0, closedir(stream))
                }
            assertContentEquals(first.second, first.first.dName)
        }

    @Test
    fun fdopendirTransfersDescriptorAndFailureRetainsIt() =
        withDirectory { path ->
            val fd = libc.cinterop.libc_open(path, platform.posix.O_RDONLY or platform.posix.O_DIRECTORY, 0u)
            assertTrue(fd >= 0)
            val stream = fdopendir(fd)
            if (stream == null) {
                libc.cinterop.libc_close(fd)
                error("fdopendir failed; errno=${libc.cinterop.libc_get_errno()}")
            }
            try {
                assertNotNull(readdir(stream))
            } finally {
                assertEquals(0, closedir(stream))
            }
            libc.cinterop.libc_set_errno(0)
            assertEquals(-1, libc.cinterop.libc_close(fd))
            assertEquals(platform.posix.EBADF, libc.cinterop.libc_get_errno())

            val file = libc.cinterop.libc_open("$path/first", platform.posix.O_RDONLY, 0u)
            assertTrue(file >= 0)
            try {
                assertNull(fdopendir(file))
                assertEquals(platform.posix.ENOTDIR, libc.cinterop.libc_get_errno())
            } finally {
                assertEquals(0, libc.cinterop.libc_close(file))
            }
        }

    @Test
    fun readdirRUsesCallerStorageAndReportsEndOfDirectory() =
        withDirectory { path ->
            val stream = assertNotNull(opendir(path))
            try {
                val buffer = NativeDirectoryEntryBuffer(stream)
                val result = COpaquePointer()
                val names = mutableSetOf<String>()
                try {
                    var reads = 0
                    while (true) {
                        result.value = -1L
                        assertEquals(0, readdirR(stream, buffer.entry, result))
                        if (result.value == 0L) break
                        assertEquals(buffer.address, result.value)
                        names += buffer.entry.dName.directoryName()
                        assertTrue(++reads < 100, "Reentrant traversal did not terminate")
                    }
                    assertTrue("first" in names)
                    assertTrue("second" in names)
                } finally {
                    buffer.close()
                }
                assertEquals(0L, buffer.address)
                assertFailsWith<IllegalArgumentException> { readdirR(stream, buffer.entry, result) }
                buffer.close()
            } finally {
                assertEquals(0, closedir(stream))
            }
        }

    @Test
    fun missingDirectoryReportsRealErrno() =
        withDirectory { path ->
            libc.cinterop.libc_set_errno(0)
            assertNull(opendir("$path/missing"))
            assertEquals(platform.posix.ENOENT, libc.cinterop.libc_get_errno())
            assertNull(opendir("$path/first"))
            assertEquals(platform.posix.ENOTDIR, libc.cinterop.libc_get_errno())
        }

    @Test
    fun concurrentReadersShareStreamWithoutOverwritingNames() =
        withDirectory { path ->
            val stream = assertNotNull(opendir(path))
            try {
                val tasks = listOf(DirectoryReadTask(stream, false), DirectoryReadTask(stream, true))
                val first = StableRef.create(tasks[0])
                val second = StableRef.create(tasks[1])
                try {
                    assertEquals(
                        0,
                        libc.cinterop.libc_directory_test_parallel(
                            staticCFunction(::readDirectoryOnThread),
                            first.asCPointer(),
                            second.asCPointer(),
                        ),
                    )
                    tasks.forEach { task -> task.failure?.let { throw it } }
                    val names = tasks.flatMap { it.names }
                    assertEquals(4, names.size)
                    assertEquals(setOf(".", "..", "first", "second"), names.toSet())
                } finally {
                    first.dispose()
                    second.dispose()
                }
            } finally {
                assertEquals(0, closedir(stream))
            }
        }

    @Test
    fun readdirRErrorReturnsCodeAndPreservesErrno() =
        withDirectory { path ->
            val stream = assertNotNull(opendir(path))
            try {
                val buffer = NativeDirectoryEntryBuffer(stream)
                try {
                    assertTrue(buffer.capacity > 0uL)
                    val descriptor = libc.cinterop.libc_dirfd(stream.handle.toCPointer<ByteVar>())
                    val backup = libc.cinterop.libc_dup(descriptor)
                    assertTrue(backup >= 0)
                    try {
                        assertEquals(0, libc.cinterop.libc_close(descriptor))
                        try {
                            val result = COpaquePointer(-1)
                            libc.cinterop.libc_set_errno(platform.posix.EACCES)
                            assertEquals(platform.posix.EBADF, readdirR(stream, buffer.entry, result))
                            assertEquals(platform.posix.EACCES, libc.cinterop.libc_get_errno())
                            assertEquals(0L, result.value)
                        } finally {
                            assertEquals(descriptor, libc.cinterop.libc_dup2(backup, descriptor))
                        }
                    } finally {
                        assertEquals(0, libc.cinterop.libc_close(backup))
                    }
                } finally {
                    buffer.close()
                }
                assertEquals(0uL, buffer.capacity)
            } finally {
                assertEquals(0, closedir(stream))
            }
        }

    private fun ByteArray.directoryName(): String = decodeToString().substringBefore('\u0000')

    private fun withDirectory(block: (String) -> Unit) =
        memScoped {
            val temporary = platform.posix.getenv("TMPDIR")?.toKString() ?: "/tmp"
            val template = "${temporary.trimEnd('/')}/km-directory-XXXXXX".cstr.getPointer(this)
            val path = assertNotNull(libc.cinterop.libc_mkdtemp(template)).toKString()
            try {
                for (name in listOf("first", "second")) {
                    val file = assertNotNull(libc.cinterop.libc_fopen("$path/$name", "wb"))
                    assertEquals(0, libc.cinterop.libc_fclose(file))
                }
                block(path)
            } finally {
                val first = libc.cinterop.libc_unlink("$path/first")
                val second = libc.cinterop.libc_unlink("$path/second")
                val directory = libc.cinterop.libc_rmdir(path)
                assertEquals(0, first)
                assertEquals(0, second)
                assertEquals(0, directory)
            }
        }
}

private class DirectoryReadTask(
    val stream: DIR,
    val reentrant: Boolean,
) {
    val names = mutableListOf<String>()
    var failure: Throwable? = null
}

private fun readDirectoryOnThread(pointer: kotlinx.cinterop.COpaquePointer?): kotlinx.cinterop.COpaquePointer? {
    val task = requireNotNull(pointer).asStableRef<DirectoryReadTask>().get()
    try {
        val buffer = if (task.reentrant) NativeDirectoryEntryBuffer(task.stream) else null
        try {
            val result = COpaquePointer()
            var reads = 0
            while (true) {
                val entry =
                    if (buffer == null) {
                        libc.cinterop.libc_set_errno(0)
                        val next = readdir(task.stream)
                        if (next == null) assertEquals(0, libc.cinterop.libc_get_errno())
                        next
                    } else {
                        assertEquals(0, readdirR(task.stream, buffer.entry, result))
                        if (result.value == 0L) null else buffer.entry
                    } ?: break
                platform.posix.sched_yield()
                task.names += entry.dName.decodeToString().substringBefore('\u0000')
                assertTrue(++reads < 100, "Concurrent directory traversal did not terminate")
            }
        } finally {
            buffer?.close()
        }
    } catch (failure: Throwable) {
        task.failure = failure
    }
    return null
}
