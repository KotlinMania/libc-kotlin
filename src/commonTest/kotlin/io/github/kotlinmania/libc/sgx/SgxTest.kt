// port-lint: tests sgx.rs
package io.github.kotlinmania.libc.sgx

import kotlin.test.Test
import kotlin.test.assertEquals

class SgxTest {
    @Test
    fun testSgxConstants() {
        assertEquals(-2147483648, INT_MIN)
        assertEquals(2147483647, INT_MAX)
    }
}
