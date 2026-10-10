// port-lint: tests trusty.rs
package io.github.kotlinmania.libc.trusty

import kotlin.test.Test
import kotlin.test.assertEquals

class TrustyTest {
    @Test
    fun testTrustyConstants() {
        assertEquals(1, PROT_READ)
        assertEquals(2, PROT_WRITE)
        assertEquals(7, CLOCK_BOOTTIME)
        assertEquals(1, STDOUT_FILENO)
        assertEquals(2, STDERR_FILENO)
        assertEquals(6uL, AT_PAGESZ)
        assertEquals(-1L, MAP_FAILED)
    }

    @Test
    fun testTrustyDataClasses() {
        val iov = Iovec(0L, iovBase = 0x1234L, iovLen = 64uL)
        assertEquals(0x1234L, iov.iovBase)
        assertEquals(64uL, iov.iovLen)

        val ts = Timespec(0L, tvSec = 12L, tvNsec = 345L)
        assertEquals(12L, ts.tvSec)
        assertEquals(345L, ts.tvNsec)
    }

    @Test
    fun testTrustyTypeAliases() {
        val sizeVal: SizeT = 42uL
        val ssizeVal: SsizeT = -1L
        val offVal: OffT = 1024L
        val u8Val: CUint8T = 255u.toUByte()
        val u16Val: CUint16T = 65535u.toUShort()
        val u32Val: CUint32T = 4294967295u
        val u64Val: CUint64T = 18446744073709551615uL
        val i8Val: CInt8T = (-128).toByte()
        val i16Val: CInt16T = (-32768).toShort()
        val i32Val: CInt32T = -2147483648
        val i64Val: CInt64T = -9223372036854775807L - 1L
        val intptrVal: IntptrT = 0x7fffL
        val uintptrVal: UintptrT = 0x7fffuL
        val timeVal: TimeT = 1700000000L
        val clockidVal: ClockidT = CLOCK_BOOTTIME

        assertEquals(42uL, sizeVal)
        assertEquals(-1L, ssizeVal)
        assertEquals(1024L, offVal)
        assertEquals(255u.toUByte(), u8Val)
        assertEquals(65535u.toUShort(), u16Val)
        assertEquals(4294967295u, u32Val)
        assertEquals(18446744073709551615uL, u64Val)
        assertEquals((-128).toByte(), i8Val)
        assertEquals((-32768).toShort(), i16Val)
        assertEquals(-2147483648, i32Val)
        assertEquals(-9223372036854775807L - 1L, i64Val)
        assertEquals(0x7fffL, intptrVal)
        assertEquals(0x7fffuL, uintptrVal)
        assertEquals(1700000000L, timeVal)
        assertEquals(7, clockidVal)
    }

    @Test
    fun testTrustyBackwardCompatibility() {
        val newSize: SizeT = 128uL
        val legacySize: Size = newSize
        assertEquals(newSize, legacySize)

        val newSsize: SsizeT = -10L
        val legacySsize: Ssize = newSsize
        assertEquals(newSsize, legacySsize)

        val newOff: OffT = 2048L
        val legacyOff: Off = newOff
        assertEquals(newOff, legacyOff)

        val newIntptr: IntptrT = 0x1000L
        val legacyIntptr: Intptr = newIntptr
        assertEquals(newIntptr, legacyIntptr)

        val newUintptr: UintptrT = 0x1000uL
        val legacyUintptr: Uintptr = newUintptr
        assertEquals(newUintptr, legacyUintptr)

        val newTime: TimeT = 999999L
        val legacyTime: Time = newTime
        assertEquals(newTime, legacyTime)

        val newClockid: ClockidT = 7
        val legacyClockId: ClockId = newClockid
        assertEquals(newClockid, legacyClockId)

        // Verify data classes accept both new and legacy types
        val iovFromNew = Iovec(0L, iovBase = 0x2000L, iovLen = newSize)
        val iovFromLegacy = Iovec(0L, iovBase = 0x2000L, iovLen = legacySize)
        assertEquals(iovFromNew.iovLen, iovFromLegacy.iovLen)

        val tsFromNew = Timespec(0L, tvSec = newTime, tvNsec = 500L)
        val tsFromLegacy = Timespec(0L, tvSec = legacyTime, tvNsec = 500L)
        assertEquals(tsFromNew.tvSec, tsFromLegacy.tvSec)
    }
}
