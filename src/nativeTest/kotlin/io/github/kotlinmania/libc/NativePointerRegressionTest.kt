@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.alignedFree
import io.github.kotlinmania.libc.unix.alignedAlloc
import io.github.kotlinmania.libc.unix.free
import io.github.kotlinmania.libc.unix.getcwd
import io.github.kotlinmania.libc.unix.malloc
import io.github.kotlinmania.libc.unix.realloc
import io.github.kotlinmania.libc.unix.strndup
import io.github.kotlinmania.libc.unix.strtol
import io.github.kotlinmania.libc.unix.strtoll
import io.github.kotlinmania.libc.unix.strtoul
import io.github.kotlinmania.libc.unix.strtoull
import io.github.kotlinmania.libc.unix.strxfrm
import kotlinx.cinterop.*
import kotlin.test.*

class NativePointerRegressionTest {
    @Test
    fun numericEndPointersRemainInsideCallerStorage() = memScoped {
        val input = "123tail".cstr.getPointer(this)
        val end = alloc<CPointerVar<ByteVar>>()
        val source = COpaquePointer(input.toLong())
        val destination = COpaquePointer(end.ptr.toLong())
        assertEquals(123L, strtol(source, destination, 10))
        assertEquals("tail", end.value?.toKString())
        assertEquals(input.toLong() + 3, end.value?.toLong())
        assertEquals(123L, strtoll(source, destination, 10))
        assertEquals(input.toLong() + 3, end.value?.toLong())
        assertEquals(123uL, strtoul(source, destination, 10))
        assertEquals(input.toLong() + 3, end.value?.toLong())
        assertEquals(123uL, strtoull(source, destination, 10))
        assertEquals("tail", end.value?.toKString())
    }

    @Test
    fun numericConversionPreservesNoConversionAndFullConsumption() = memScoped {
        val end = alloc<CPointerVar<ByteVar>>()
        val destination = COpaquePointer(end.ptr.toLong())
        val invalid = "tail".cstr.getPointer(this)
        assertEquals(0L, strtol(COpaquePointer(invalid.toLong()), destination, 10))
        assertEquals(invalid.toLong(), end.value?.toLong())
        val hexadecimal = "-7f".cstr.getPointer(this)
        assertEquals(-127L, strtoll(COpaquePointer(hexadecimal.toLong()), destination, 16))
        assertEquals("", end.value?.toKString())
        assertEquals(-127L, strtoll(COpaquePointer(hexadecimal.toLong()), null, 16))
    }

    @Test
    fun transformWritesCallerBufferAndSupportsSizeQuery() = memScoped {
        val required = strxfrm(null, "abc", 0uL)
        val destination = allocArray<ByteVar>((required + 2uL).toInt())
        destination[required.toInt() + 1] = 90
        assertEquals(required, strxfrm(COpaquePointer(destination.toLong()), "abc", required + 1uL))
        assertEquals("abc", destination.toKString())
        assertEquals(90.toByte(), destination[required.toInt() + 1])
    }

    @Test
    fun transformDoesNotWriteBeyondCapacity() = memScoped {
        val destination = allocArray<ByteVar>(2)
        destination[1] = 90
        assertTrue(strxfrm(COpaquePointer(destination.toLong()), "abcdef", 1uL) >= 1uL)
        assertEquals(90.toByte(), destination[1])
    }

    @Test
    fun boundedDuplicationCopiesAndReleasesItsAllocation() {
        assertNull(strndup(null, 2uL))
        assertEquals("", strndup("abc", 0uL))
        assertEquals("ab", strndup("abcdef", 2uL))
        assertEquals("abc", strndup("abc", 20uL))
        repeat(1000) { assertEquals("abcd", strndup("abcdef", 4uL)) }
    }

    @Test
    fun alignedAllocationCanBeReallocatedAndFreedThroughPublicApi() {
        val pointer = assertNotNull(alignedAlloc(64uL, 128uL))
        assertEquals(0L, pointer.value % 64)
        val bytes = assertNotNull(pointer.value.toCPointer<ByteVar>())
        bytes[0] = 42
        val grown = assertNotNull(realloc(pointer, 256uL))
        assertEquals(42.toByte(), grown.value.toCPointer<ByteVar>()!![0])
        // POSIX realloc does not promise to retain alignment; Windows aligned realloc does.
        free(grown)
        free(null)
    }

    @Test
    fun alignedAllocationAddressRoundTripHasExplicitMatchingRelease() {
        val pointer = assertNotNull(alignedAlloc(64uL, 128uL))
        alignedFree(COpaquePointer(pointer.value))
        alignedFree(null)
    }

    @Test
    fun ordinaryAllocationStillUsesOrdinaryRelease() {
        val pointer = assertNotNull(malloc(32uL))
        assertEquals(0uL, pointer.allocationAlignment)
        free(pointer)
    }

    @Test
    fun getcwdWritesIntoCallerOwnedDestination() = memScoped {
        val size = 1024uL
        val buffer = allocArray<ByteVar>(size.toInt())
        val destination = COpaquePointer(buffer.toLong())
        val result = assertNotNull(getcwd(destination, size))
        assertEquals(destination.value, result.value)
        val cwdStr = assertNotNull(result.value.toCPointer<ByteVar>()?.toKString())
        assertTrue(cwdStr.isNotEmpty())
    }

    @Test
    fun putenvSetsEnvironmentVariable() {
        assertEquals(0, io.github.kotlinmania.libc.unix.putenv("KOTLINMANIA_TEST_ENV=test_val_123"))
        assertEquals("test_val_123", io.github.kotlinmania.libc.unix.getenv("KOTLINMANIA_TEST_ENV"))
    }

    @Test
    fun pollHandlesNullFdsWithZeroTimeout() {
        val result = io.github.kotlinmania.libc.unix.poll(null, 0u, 0)
        assertTrue(result >= 0)
    }

    @Test
    fun gethostnameWritesIntoCallerOwnedDestination() = memScoped {
        val size = 256uL
        val buffer = allocArray<ByteVar>(size.toInt())
        val destination = COpaquePointer(buffer.toLong())
        val result = io.github.kotlinmania.libc.unix.gethostname(destination, size)
        assertEquals(0, result)
        val hostStr = assertNotNull(buffer.toKString())
        assertTrue(hostStr.isNotEmpty())
    }

    @Test
    fun readlinkReadsSymlinkTarget() = memScoped {
        val target = "/usr/bin"
        val linkPath = "build/test_symlink_${io.github.kotlinmania.libc.unix.getpid()}"
        io.github.kotlinmania.libc.unix.unlink(linkPath)
        val symlinkRes = io.github.kotlinmania.libc.unix.symlink(target, linkPath)
        if (symlinkRes == 0) {
            try {
                val size = 256uL
                val buffer = allocArray<ByteVar>(size.toInt())
                val destination = COpaquePointer(buffer.toLong())
                val bytesRead = io.github.kotlinmania.libc.unix.readlink(linkPath, destination, size)
                assertTrue(bytesRead > 0)
                buffer[bytesRead] = 0.toByte()
                assertEquals(target, buffer.toKString())
            } finally {
                io.github.kotlinmania.libc.unix.unlink(linkPath)
            }
        }
    }

    @Test
    fun strncpyCopiesUpToSpecifiedCount() {
        val result = io.github.kotlinmania.libc.unix.strncpy(null, "hello world", 5uL)
        assertEquals("hello", result)
    }

    @Test
    fun strncatAppendsUpToSpecifiedCount() {
        val result = io.github.kotlinmania.libc.unix.strncat("hello ", "world beyond", 5uL)
        assertEquals("hello world", result)
    }

    @Test
    fun windowsAlignedAllocationRoundTrip() {
        val ptr = assertNotNull(io.github.kotlinmania.libc.windows.alignedMalloc(128uL, 64uL))
        assertEquals(0L, ptr.value % 64)
        val bytes = assertNotNull(ptr.value.toCPointer<ByteVar>())
        bytes[0] = 42
        val grown = assertNotNull(io.github.kotlinmania.libc.windows.alignedRealloc(ptr, 256uL, 64uL))
        assertEquals(42.toByte(), grown.value.toCPointer<ByteVar>()!![0])
        io.github.kotlinmania.libc.windows.alignedFree(grown)
    }

    @Test
    fun windowsStringAndMemoryOperations() = memScoped {
        val str = io.github.kotlinmania.libc.windows.strncpy(null, "windows test", 7uL)
        assertEquals("windows", str)
        val cat = io.github.kotlinmania.libc.windows.strncat("win", "dows 11", 4uL)
        assertEquals("windows", cat)

        val src = "memory test".cstr.getPointer(this)
        val dst = allocArray<ByteVar>(32)
        val srcPtr = COpaquePointer(src.toLong())
        val dstPtr = COpaquePointer(dst.toLong())
        assertNotNull(io.github.kotlinmania.libc.windows.memcpy(dstPtr, srcPtr, 11uL))
        assertEquals(0, io.github.kotlinmania.libc.windows.memcmp(dstPtr, srcPtr, 11uL))
    }

    @Test
    fun windowsNumericAndEnvironmentOperations() {
        assertEquals(456L, io.github.kotlinmania.libc.windows.strtol("456abc", null, 10))
        assertEquals(789L, io.github.kotlinmania.libc.windows.strtoll("789xyz", null, 10))
        assertEquals(123uL, io.github.kotlinmania.libc.windows.strtoul("123", null, 10))
        assertEquals(456uL, io.github.kotlinmania.libc.windows.strtoull("456", null, 10))

        assertEquals(0, io.github.kotlinmania.libc.windows.putenv("WIN_TEST_ENV=windows_val_999"))
        assertEquals("windows_val_999", io.github.kotlinmania.libc.windows.getenv("WIN_TEST_ENV"))
    }

    @Test
    fun unixPipeAndMemalignOperations() = memScoped {
        val pipeRes = io.github.kotlinmania.libc.unix.pipe(null)
        assertEquals(0, pipeRes)
        val outPtr = alloc<CPointerVar<ByteVar>>()
        val opaque = COpaquePointer(outPtr.ptr.toLong())
        val res = io.github.kotlinmania.libc.unix.posixMemalign(opaque, 64uL, 128uL)
        assertEquals(0, res)
        assertNotNull(outPtr.value)
        io.github.kotlinmania.libc.unix.free(COpaquePointer(outPtr.value.toLong()))
    }

    @Test
    fun appleWiredBindingsExecute() {
        val tp = io.github.kotlinmania.libc.Timespec(0L, 0L, 0L)
        val res = io.github.kotlinmania.libc.unix.bsd.apple.clockGettime(0u, tp)
        assertTrue(res == 0 || res == -1)
    }

    @Test
    fun windowsWiredBindingsExecute() {
        val pipeRes = io.github.kotlinmania.libc.windows.pipe(null, 0u, 0)
        assertTrue(pipeRes == 0 || pipeRes == -1)
        val cwd = io.github.kotlinmania.libc.windows.getcwd(null, 1024)
        assertNotNull(cwd)
        assertTrue(cwd.isNotEmpty())
    }
}
