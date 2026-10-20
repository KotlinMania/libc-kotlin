package consumer

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.calloc
import io.github.kotlinmania.libc.unix.close
import io.github.kotlinmania.libc.unix.descriptorCommands
import io.github.kotlinmania.libc.unix.fcntl
import io.github.kotlinmania.libc.unix.fileOpenFlags
import io.github.kotlinmania.libc.unix.free
import io.github.kotlinmania.libc.unix.lastErrorNumber
import io.github.kotlinmania.libc.unix.lseek
import io.github.kotlinmania.libc.unix.malloc
import io.github.kotlinmania.libc.unix.memcmp
import io.github.kotlinmania.libc.unix.memcpy
import io.github.kotlinmania.libc.unix.memset
import io.github.kotlinmania.libc.unix.open
import io.github.kotlinmania.libc.unix.read
import io.github.kotlinmania.libc.unix.realloc
import io.github.kotlinmania.libc.unix.unlink
import io.github.kotlinmania.libc.unix.write
import kotlin.random.Random
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

internal fun verifyHostMemory() {
    var source = assertNotNull(malloc(64uL))
    val destination = assertNotNull(calloc(64uL, 1uL))
    try {
        assertEquals(source.value, assertNotNull(memset(source, 0xAB, 64uL)).value)
        assertNotEquals(0, memcmp(source, destination, 64uL))
        assertEquals(destination.value, assertNotNull(memcpy(destination, source, 64uL)).value)
        assertEquals(0, memcmp(source, destination, 64uL))
        source = assertNotNull(realloc(source, 128uL))
        assertEquals(0, memcmp(source, destination, 64uL))
    } finally {
        free(source)
        free(destination)
    }
    free(null)
}

internal fun verifyHostDescriptorIo(directory: String = ".") {
    val flags = fileOpenFlags()
    val path = "$directory/km-libc-roundtrip-${Random.nextLong().toULong()}.bin"
    val source = assertNotNull(malloc(513uL))
    val destination = assertNotNull(calloc(513uL, 1uL))
    var fd = -1
    try {
        memset(source, 0xAB, 513uL)
        memset(source, 0x0A, 1uL)
        memset(COpaquePointer(source.value + 1), 0x0D, 1uL)
        memset(COpaquePointer(source.value + 2), 0x1A, 1uL)
        fd = open(path, flags.readWrite or flags.create or flags.truncate or flags.binary, 0x180u)
        assertTrue(fd >= 0, "Host open failed with error ${lastErrorNumber()}")
        assertEquals(513L, write(fd, source, 513uL))
        assertEquals(0x1_0000_0001L, lseek(fd, 0x1_0000_0001L, flags.seekStart))
        assertEquals(0L, lseek(fd, 0L, flags.seekStart))
        assertEquals(513L, read(fd, destination, 513uL))
        assertEquals(0, memcmp(source, destination, 513uL))
        assertEquals(0L, read(fd, destination, 1uL))
        val commands = descriptorCommands()
        if (commands != null) {
            val original = fcntl(fd, commands.getFlags)
            assertTrue(original >= 0)
            assertEquals(0, fcntl(fd, commands.setFlags, original or commands.closeOnExec))
            assertTrue((fcntl(fd, commands.getFlags) and commands.closeOnExec) != 0)
            assertEquals(-1, fcntl(-1, commands.getFlags))
            assertEquals(commands.badDescriptor, lastErrorNumber())
            assertEquals(-1, fcntl(-1, commands.getFlags, null))
            assertEquals(commands.badDescriptor, lastErrorNumber())
        } else {
            assertFailsWith<UnsupportedOperationException> { fcntl(fd, 0) }
            assertFailsWith<UnsupportedOperationException> { fcntl(fd, 0, 0) }
            assertFailsWith<UnsupportedOperationException> { fcntl(fd, 0, null) }
        }
        assertEquals(0, close(fd))
        fd = -1
        val reopened = open(path, flags.readOnly or flags.binary)
        assertTrue(reopened >= 0)
        try {
            assertEquals(1L, read(reopened, destination, 1uL))
            assertEquals(-1L, write(reopened, source, 1uL))
            assertTrue(lastErrorNumber() != 0)
        } finally {
            assertEquals(0, close(reopened))
        }
    } finally {
        if (fd >= 0) close(fd)
        free(source)
        free(destination)
        assertEquals(0, unlink(path))
    }
}
