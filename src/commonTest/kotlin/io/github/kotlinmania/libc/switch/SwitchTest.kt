// port-lint: tests libc/src/switch.rs
package io.github.kotlinmania.libc.switch

import kotlin.test.Test
import kotlin.test.assertEquals

class SwitchTest {
    @Test
    fun testSwitchConstants() {
        assertEquals(-2147483648, INT_MIN)
        assertEquals(2147483647, INT_MAX)
    }
}
