package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.vxworks.calloc
import io.github.kotlinmania.libc.vxworks.free
import io.github.kotlinmania.libc.vxworks.isalpha
import io.github.kotlinmania.libc.vxworks.isdigit
import io.github.kotlinmania.libc.vxworks.malloc
import io.github.kotlinmania.libc.vxworks.strlen
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull

/**
 * JS tests verifying that the FFI bridge functions succeed when
 * N-API addon is available, or fail honestly where not yet implemented.
 */
class JsFunctionsTest {
    @Test
    fun mallocWorksOnJs() {
        val ptr = malloc(1024uL)
        assertNotNull(ptr)
        free(ptr)
    }

    @Test
    fun callocWorksOnJs() {
        val ptr = calloc(10uL, 4uL)
        assertNotNull(ptr)
        free(ptr)
    }

    @Test
    fun freeWorksOnJs() {
        free(null)
    }

    @Test
    fun strlenWorksOnJs() {
        assertEquals(5uL, strlen("hello"))
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
