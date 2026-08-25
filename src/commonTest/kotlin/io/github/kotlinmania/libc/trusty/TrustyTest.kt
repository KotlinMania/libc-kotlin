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
        val iov = Iovec(iovBase = 0x1234L, iovLen = 64uL)
        assertEquals(0x1234L, iov.iovBase)
        assertEquals(64uL, iov.iovLen)

        val ts = Timespec(tvSec = 12L, tvNsec = 345L)
        assertEquals(12L, ts.tvSec)
        assertEquals(345L, ts.tvNsec)
    }
}
