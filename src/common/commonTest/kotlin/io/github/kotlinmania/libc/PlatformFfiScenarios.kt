package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.new.common.posix.pthread.pthreadBarrierDestroy
import io.github.kotlinmania.libc.new.common.posix.pthread.pthreadBarrierInit
import io.github.kotlinmania.libc.new.common.posix.pthread.pthreadCancel
import io.github.kotlinmania.libc.unix.atexit
import io.github.kotlinmania.libc.unix.bsd.apple.error
import io.github.kotlinmania.libc.unix.bsd.apple.iconv
import io.github.kotlinmania.libc.unix.bsd.apple.iconvClose
import io.github.kotlinmania.libc.unix.bsd.apple.iconvOpen
import io.github.kotlinmania.libc.unix.calloc
import io.github.kotlinmania.libc.unix.close
import io.github.kotlinmania.libc.unix.dlsym
import io.github.kotlinmania.libc.unix.free
import io.github.kotlinmania.libc.unix.linuxlike.android.b32.timegm64
import io.github.kotlinmania.libc.unix.linuxlike.android.epollCreate1
import io.github.kotlinmania.libc.unix.linuxlike.android.errno
import io.github.kotlinmania.libc.unix.linuxlike.android.getrandom
import io.github.kotlinmania.libc.unix.linuxlike.android.prctl
import io.github.kotlinmania.libc.unix.memcmp
import io.github.kotlinmania.libc.unix.memset
import io.github.kotlinmania.libc.unix.open
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

private fun writeInt32Le(
    base: COpaquePointer,
    byteOffset: Long,
    value: Int,
) {
    memset(COpaquePointer(base.value + byteOffset), value and 0xFF, 1uL)
    memset(COpaquePointer(base.value + byteOffset + 1L), (value ushr 8) and 0xFF, 1uL)
    memset(COpaquePointer(base.value + byteOffset + 2L), (value ushr 16) and 0xFF, 1uL)
    memset(COpaquePointer(base.value + byteOffset + 3L), (value ushr 24) and 0xFF, 1uL)
}

private fun writeInt64Le(
    base: COpaquePointer,
    byteOffset: Long,
    value: Long,
) {
    for (i in 0 until 8) {
        val byteVal = ((value ushr (i * 8)) and 0xFFL).toInt()
        memset(COpaquePointer(base.value + byteOffset + i.toLong()), byteVal, 1uL)
    }
}

internal fun verifyAndroidBionicFfi() {
    val errnoPtr = assertNotNull(errno())
    assertNotEquals(0L, errnoPtr.value)

    val expectedInt = assertNotNull(calloc(4uL, 1uL))
    val nameBuf = assertNotNull(calloc(32uL, 1uL))
    val randBuf = assertNotNull(calloc(16uL, 1uL))
    val zeroBuf = assertNotNull(calloc(16uL, 1uL))
    val tmBuf = assertNotNull(calloc(64uL, 1uL))
    val barrierBuf = assertNotNull(calloc(64uL, 1uL))
    try {
        // 1. Bionic __errno() thread-local errno pointer updates on failed open()
        writeInt32Le(errnoPtr, 0L, 0)
        writeInt32Le(expectedInt, 0L, BIONIC_ENOENT)
        assertEquals(-1, open("/nonexistent-km-bionic-errno-probe-7a9b", 0))
        val afterErrnoPtr = assertNotNull(errno())
        assertEquals(errnoPtr, afterErrnoPtr)
        assertEquals(0, memcmp(afterErrnoPtr, expectedInt, 4uL))

        // 2. Bionic epoll_create1 + close
        val epfd = epollCreate1(0)
        assertTrue(epfd >= 0, "epollCreate1(0) should return valid fd on Bionic")
        assertEquals(0, close(epfd))

        // 3. Bionic prctl(PR_GET_NAME, ...)
        assertEquals(0, prctl(BIONIC_PR_GET_NAME, nameBuf.value, 0L, 0L, 0L))

        // 4. Bionic getrandom()
        assertEquals(16L, getrandom(randBuf, 16uL, 0u))
        assertNotEquals(0, memcmp(randBuf, zeroBuf, 16uL))

        // 5. 64-bit Bionic timegm64 -> timegm fallback (2000-01-01T00:00:00Z = 946684800)
        writeInt32Le(tmBuf, 12L, 1)
        writeInt32Le(tmBuf, 20L, 100)
        assertEquals(EPOCH_2000_01_01_UTC, timegm64(tmBuf))

        // 6. Bionic atexit is crtbegin-static (not in dynamic libc.so) and rejects null with EINVAL (not ENOSYS)
        assertNull(dlsym(null, "atexit"))
        writeInt32Le(errnoPtr, 0L, 0)
        writeInt32Le(expectedInt, 0L, BIONIC_EINVAL)
        assertEquals(-1, atexit {})
        assertEquals(0, memcmp(assertNotNull(errno()), expectedInt, 4uL))

        // 7. POSIX pthread direct error return (ENOSYS = 38 for omitted pthread_cancel; 0 for API 24+ barriers)
        assertEquals(BIONIC_ENOSYS, pthreadCancel(0u))
        assertEquals(0, pthreadBarrierInit(barrierBuf, null, 1u))
        assertEquals(0, pthreadBarrierDestroy(barrierBuf))
    } finally {
        free(expectedInt)
        free(nameBuf)
        free(randBuf)
        free(zeroBuf)
        free(tmBuf)
        free(barrierBuf)
    }
}

internal fun verifyAppleDarwinFfi() {
    val errPtr = assertNotNull(error())
    assertNotEquals(0L, errPtr.value)

    val expectedInt = assertNotNull(calloc(4uL, 1uL))
    val inBytes = assertNotNull(calloc(4uL, 1uL))
    val outBytes = assertNotNull(calloc(4uL, 1uL))
    val inPtrCell = assertNotNull(calloc(8uL, 1uL))
    val inLeftCell = assertNotNull(calloc(8uL, 1uL))
    val outPtrCell = assertNotNull(calloc(8uL, 1uL))
    val outLeftCell = assertNotNull(calloc(8uL, 1uL))
    val barrierBuf = assertNotNull(calloc(64uL, 1uL))
    try {
        // 1. Darwin __error() thread-local errno pointer updates on failed open()
        writeInt32Le(errPtr, 0L, 0)
        writeInt32Le(expectedInt, 0L, DARWIN_ENOENT)
        assertEquals(-1, open("/nonexistent-km-darwin-error-probe-7a9b", 0))
        val afterErrPtr = assertNotNull(error())
        assertEquals(errPtr, afterErrPtr)
        assertEquals(0, memcmp(afterErrPtr, expectedInt, 4uL))

        // 2. Darwin #[link(name = "iconv")] dyld shared-cache /usr/lib/libiconv.dylib resolution
        val cd = assertNotNull(iconvOpen("UTF-8", "ASCII"))
        assertNotEquals(-1L, cd.value)
        try {
            memset(inBytes, 0x4F, 1uL)
            memset(COpaquePointer(inBytes.value + 1L), 0x4B, 1uL)
            writeInt64Le(inPtrCell, 0L, inBytes.value)
            writeInt64Le(inLeftCell, 0L, 2L)
            writeInt64Le(outPtrCell, 0L, outBytes.value)
            writeInt64Le(outLeftCell, 0L, 4L)
            assertEquals(0uL, iconv(cd, inPtrCell, inLeftCell, outPtrCell, outLeftCell))
            assertEquals(0, memcmp(inBytes, outBytes, 2uL))
        } finally {
            assertEquals(0, iconvClose(cd))
        }

        // 3. Darwin POSIX pthread_barrier_init direct ENOSYS (78) return
        assertEquals(DARWIN_ENOSYS, pthreadBarrierInit(barrierBuf, null, 2u))
    } finally {
        free(expectedInt)
        free(inBytes)
        free(outBytes)
        free(inPtrCell)
        free(inLeftCell)
        free(outPtrCell)
        free(outLeftCell)
        free(barrierBuf)
    }
}

internal fun verifyHostAppleDarwinIfPresent() {
    if (dlsym(null, "mach_absolute_time") != null) {
        verifyAppleDarwinFfi()
    }
}

private const val BIONIC_ENOENT: CInt = 2
private const val BIONIC_EINVAL: CInt = 22
private const val BIONIC_ENOSYS: CInt = 38
private const val BIONIC_PR_GET_NAME: CInt = 16
private const val DARWIN_ENOENT: CInt = 2
private const val DARWIN_ENOSYS: CInt = 78
private const val EPOCH_2000_01_01_UTC: Long = 946_684_800L
