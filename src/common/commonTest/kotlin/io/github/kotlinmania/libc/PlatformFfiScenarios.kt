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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

private fun writeInt32Le(
    base: MutPtr,
    byteOffset: Long,
    value: Int,
) {
    memset(MutPtr(base.rawAddress + byteOffset), value and 0xFF, 1uL)
    memset(MutPtr(base.rawAddress + byteOffset + 1L), (value ushr 8) and 0xFF, 1uL)
    memset(MutPtr(base.rawAddress + byteOffset + 2L), (value ushr 16) and 0xFF, 1uL)
    memset(MutPtr(base.rawAddress + byteOffset + 3L), (value ushr 24) and 0xFF, 1uL)
}

private fun writeInt64Le(
    base: MutPtr,
    byteOffset: Long,
    value: Long,
) {
    for (i in 0 until 8) {
        val byteVal = ((value ushr (i * 8)) and 0xFFL).toInt()
        memset(MutPtr(base.rawAddress + byteOffset + i.toLong()), byteVal, 1uL)
    }
}

internal fun verifyAndroidBionicFfi() {
    val errnoPtr = errno()
    assertFalse(errnoPtr.isNull())

    val expectedInt = calloc(4uL, 1uL)
    assertFalse(expectedInt.isNull())
    val nameBuf = calloc(32uL, 1uL)
    assertFalse(nameBuf.isNull())
    val randBuf = calloc(16uL, 1uL)
    assertFalse(randBuf.isNull())
    val zeroBuf = calloc(16uL, 1uL)
    assertFalse(zeroBuf.isNull())
    val tmBuf = calloc(64uL, 1uL)
    assertFalse(tmBuf.isNull())
    val barrierBuf = calloc(64uL, 1uL)
    assertFalse(barrierBuf.isNull())
    try {
        // 1. Bionic __errno() thread-local errno pointer updates on failed open()
        writeInt32Le(errnoPtr, 0L, 0)
        writeInt32Le(expectedInt, 0L, BIONIC_ENOENT)
        withCString("/nonexistent-km-bionic-errno-probe-7a9b") { probePath ->
            assertEquals(-1, open(probePath, 0))
        }
        val afterErrnoPtr = errno()
        assertFalse(afterErrnoPtr.isNull())
        assertEquals(errnoPtr.rawAddress, afterErrnoPtr.rawAddress)
        assertEquals(0, memcmp(afterErrnoPtr.castConst().cast(), expectedInt.castConst(), 4uL))

        // 2. Bionic epoll_create1 + close
        val epfd = epollCreate1(0)
        assertTrue(epfd >= 0, "epollCreate1(0) should return valid fd on Bionic")
        assertEquals(0, close(epfd))

        // 3. Bionic prctl(PR_GET_NAME, ...)
        assertEquals(0, prctl(BIONIC_PR_GET_NAME, nameBuf.rawAddress, 0L, 0L, 0L))

        // 4. Bionic getrandom()
        assertEquals(16L, getrandom(randBuf, 16uL, 0u))
        assertNotEquals(0, memcmp(randBuf.castConst(), zeroBuf.castConst(), 16uL))

        // 5. 64-bit Bionic timegm64 -> timegm fallback (2000-01-01T00:00:00Z = 946684800)
        writeInt32Le(tmBuf, 12L, 1)
        writeInt32Le(tmBuf, 20L, 100)
        assertEquals(EPOCH_2000_01_01_UTC, timegm64(ConstPtr(tmBuf.rawAddress)))

        // 6. Bionic atexit is crtbegin-static (not in dynamic libc.so) and rejects null with EINVAL (not ENOSYS)
        withCString("atexit") { sym ->
            assertTrue(dlsym(MutPtr(0L), sym).isNull())
        }
        writeInt32Le(errnoPtr, 0L, 0)
        writeInt32Le(expectedInt, 0L, BIONIC_EINVAL)
        assertEquals(-1, atexit {})
        assertEquals(0, memcmp(ConstPtr(errno().rawAddress), expectedInt.castConst(), 4uL))

        // 7. POSIX pthread direct error return (ENOSYS = 38 for omitted pthread_cancel; 0 for API 24+ barriers)
        assertEquals(BIONIC_ENOSYS, pthreadCancel(0u))
        assertEquals(0, pthreadBarrierInit(barrierBuf.cast(), ConstPtr(0L), 1u))
        assertEquals(0, pthreadBarrierDestroy(barrierBuf.cast()))
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
    val errPtr = error()
    assertFalse(errPtr.isNull())

    val expectedInt = calloc(4uL, 1uL)
    assertFalse(expectedInt.isNull())
    val inBytes = calloc(4uL, 1uL)
    assertFalse(inBytes.isNull())
    val outBytes = calloc(4uL, 1uL)
    assertFalse(outBytes.isNull())
    val inPtrCell = calloc(8uL, 1uL)
    assertFalse(inPtrCell.isNull())
    val inLeftCell = calloc(8uL, 1uL)
    assertFalse(inLeftCell.isNull())
    val outPtrCell = calloc(8uL, 1uL)
    assertFalse(outPtrCell.isNull())
    val outLeftCell = calloc(8uL, 1uL)
    assertFalse(outLeftCell.isNull())
    val barrierBuf = calloc(64uL, 1uL)
    assertFalse(barrierBuf.isNull())
    try {
        // 1. Darwin __error() thread-local errno pointer updates on failed open()
        writeInt32Le(errPtr, 0L, 0)
        writeInt32Le(expectedInt, 0L, DARWIN_ENOENT)
        withCString("/nonexistent-km-darwin-error-probe-7a9b") { probePath ->
            assertEquals(-1, open(probePath, 0))
        }
        val afterErrPtr = error()
        assertFalse(afterErrPtr.isNull())
        assertEquals(errPtr.rawAddress, afterErrPtr.rawAddress)
        assertEquals(0, memcmp(ConstPtr(afterErrPtr.rawAddress), expectedInt.castConst(), 4uL))

        // 2. Darwin #[link(name = "iconv")] dyld shared-cache /usr/lib/libiconv.dylib resolution
        val cd =
            withCString("UTF-8") { toCode ->
                withCString("ASCII") { fromCode ->
                    iconvOpen(toCode, fromCode)
                }
            }
        assertFalse(cd.isNull())
        assertNotEquals(-1L, cd.rawAddress)
        try {
            memset(inBytes, 0x4F, 1uL)
            memset(MutPtr(inBytes.rawAddress + 1L), 0x4B, 1uL)
            writeInt64Le(inPtrCell, 0L, inBytes.rawAddress)
            writeInt64Le(inLeftCell, 0L, 2L)
            writeInt64Le(outPtrCell, 0L, outBytes.rawAddress)
            writeInt64Le(outLeftCell, 0L, 4L)
            assertEquals(0uL, iconv(cd, inPtrCell.cast(), inLeftCell.cast(), outPtrCell.cast(), outLeftCell.cast()))
            assertEquals(0, memcmp(inBytes.castConst(), outBytes.castConst(), 2uL))
        } finally {
            assertEquals(0, iconvClose(cd))
        }

        // 3. Darwin POSIX pthread_barrier_init direct ENOSYS (78) return
        assertEquals(DARWIN_ENOSYS, pthreadBarrierInit(barrierBuf.cast(), ConstPtr(0L), 2u))
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
    val machSym =
        withCString("mach_absolute_time") { sym ->
            dlsym(MutPtr(0L), sym)
        }
    if (!machSym.isNull()) {
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
