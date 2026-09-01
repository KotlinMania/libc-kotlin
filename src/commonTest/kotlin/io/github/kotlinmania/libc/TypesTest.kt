// port-lint: tests types.rs
package io.github.kotlinmania.libc

import kotlin.test.Test
import kotlin.test.assertEquals

class TypesTest {
    @Test
    fun testPadding() {
        val pad = Padding.uninit("pad-value")
        assertEquals("pad-value", pad.value)
    }
}
