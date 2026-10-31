// port-lint: tests types.rs
package io.github.kotlinmania.libc

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TypesTest {
    @Test
    fun testPadding() {
        val pad = Padding.uninit("pad-value")
        assertEquals("pad-value", pad.value)
        val def = Padding.default<String>()
        val empty = Padding.uninit<String>()
        assertTrue(pad.eq(def))
        assertEquals(pad, empty)
        assertEquals(0, pad.hashCode())
        assertEquals("Padding", pad.toString())
    }
}
