// port-lint: tests libc/src/xous.rs
package io.github.kotlinmania.libc.xous

import kotlin.test.Test
import kotlin.test.assertEquals

class XousTest {
    @Test
    fun testXousConstants() {
        assertEquals(-2147483648, INT_MIN)
        assertEquals(2147483647, INT_MAX)
    }
}
