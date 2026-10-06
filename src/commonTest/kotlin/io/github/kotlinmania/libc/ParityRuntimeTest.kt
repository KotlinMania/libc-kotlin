@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.teeos.CpuSetT
import io.github.kotlinmania.libc.teeos.cpuCount
import io.github.kotlinmania.libc.teeos.cpuCountS
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.io
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ioR
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ioW
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ioWR
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ParityRuntimeTest {
    @Test
    fun countsOnlyCompleteMasksWithinSize() {
        val bits = ULongArray(16)
        bits[0] = 0x8000000000000001uL
        bits[1] = ULong.MAX_VALUE
        bits[15] = 0x100uL
        val set = CpuSetT(bits)
        assertEquals(0, cpuCountS(0uL, set))
        assertEquals(0, cpuCountS(7uL, set))
        assertEquals(2, cpuCountS(8uL, set))
        assertEquals(2, cpuCountS(15uL, set))
        assertEquals(66, cpuCountS(16uL, set))
        assertEquals(67, cpuCount(set))
        assertFailsWith<IllegalArgumentException> { cpuCountS(136uL, set) }
    }

    @Test
    fun encodesDirectionAndCParameterSize() {
        assertEquals(0x20006601uL, io(0x66uL, 1uL))
        assertEquals(0x40046601uL, ioR(0x66uL, 1uL, 4uL))
        assertEquals(0x80086601uL, ioW(0x66uL, 1uL, 8uL))
        assertEquals(0xc0106601uL, ioWR(0x66uL, 1uL, 16uL))
        assertEquals(0x40016601uL, ioR(0x66uL, 1uL, 0x2001uL))
    }
}
