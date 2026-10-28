@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.value
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/** Executes the actual wrapper symbols whose system libraries were missing at final link. */
class LinuxSystemLibraryLinkTest {
    @Test
    fun openptyCreatesAndClosesRealDescriptors() =
        memScoped {
            val master = alloc<IntVar>()
            val slave = alloc<IntVar>()
            master.value = -1
            slave.value = -1
            try {
                assertEquals(0, libc.cinterop.libc_openpty(master.ptr, slave.ptr, null, null, null))
                assertTrue(master.value >= 0)
                assertTrue(slave.value >= 0)
                assertTrue(master.value != slave.value)
            } finally {
                val masterClose = if (master.value >= 0) libc.cinterop.libc_close(master.value) else 0
                val slaveClose = if (slave.value >= 0) libc.cinterop.libc_close(slave.value) else 0
                assertEquals(0, masterClose)
                assertEquals(0, slaveClose)
            }
        }

    @Test
    fun sharedMemoryCreatesResizesAndUnlinksRealObject() {
        val name = "/km_libc_${platform.posix.getpid()}_${Random.nextLong().toULong()}"
        val fd =
            libc.cinterop.libc_shm_open(
                name,
                platform.posix.O_CREAT or platform.posix.O_EXCL or platform.posix.O_RDWR,
                0x180,
            )
        assertTrue(fd >= 0, "Expected a real exclusive POSIX shared-memory descriptor")
        try {
            assertEquals(0, libc.cinterop.libc_ftruncate(fd, 4096))
        } finally {
            val closed = libc.cinterop.libc_close(fd)
            val unlinked = libc.cinterop.libc_shm_unlink(name)
            assertEquals(0, closed)
            assertEquals(0, unlinked)
        }
    }
}
