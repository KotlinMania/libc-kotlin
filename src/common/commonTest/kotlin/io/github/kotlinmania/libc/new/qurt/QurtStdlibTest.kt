package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.new.qurt.sys.CpuSetT
import kotlin.test.Test
import kotlin.test.assertEquals

class QurtStdlibTest {
    @Test
    fun testQurtDivisionsAndTypes() {
        val d = div(17, 5)
        assertEquals(3, d.quot)
        assertEquals(2, d.rem)

        val ld = ldiv(-23L, 6L)
        assertEquals(-3L, ld.quot)
        assertEquals(-5L, ld.rem)

        val lld = lldiv(100L, 9L)
        assertEquals(11L, lld.quot)
        assertEquals(1L, lld.rem)

        val mask: CpuSetT = 0x0Fu
        assertEquals(15u, mask)
    }
}
