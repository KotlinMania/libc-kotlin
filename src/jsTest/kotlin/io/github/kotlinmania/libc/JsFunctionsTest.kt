package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.vxworks.isalpha
import io.github.kotlinmania.libc.vxworks.isdigit
import io.github.kotlinmania.libc.vxworks.strlen
import io.github.kotlinmania.libc.vxworks.calloc
import io.github.kotlinmania.libc.vxworks.malloc
import io.github.kotlinmania.libc.vxworks.free
import kotlin.test.Test
import kotlin.test.assertFailsWith

/**
 * JS tests verifying that the FFI bridge throws honestly when no
 * N-API addon is available. These will be replaced with real tests
 * when the N-API addon is implemented per FFI_DESIGN.md.
 */
class JsFunctionsTest {

    @Test
    fun mallocThrowsOnJs() {
        assertFailsWith<UnsupportedOperationException> {
            malloc(1024uL)
        }
    }

    @Test
    fun callocThrowsOnJs() {
        assertFailsWith<UnsupportedOperationException> {
            calloc(10uL, 4uL)
        }
    }

    @Test
    fun freeThrowsOnJs() {
        assertFailsWith<UnsupportedOperationException> {
            free(null)
        }
    }

    @Test
    fun strlenThrowsOnJs() {
        assertFailsWith<UnsupportedOperationException> {
            strlen("hello")
        }
    }

    @Test
    fun isalphaThrowsOnJs() {
        assertFailsWith<UnsupportedOperationException> {
            isalpha('a'.code)
        }
    }

    @Test
    fun isdigitThrowsOnJs() {
        assertFailsWith<UnsupportedOperationException> {
            isdigit('0'.code)
        }
    }
}