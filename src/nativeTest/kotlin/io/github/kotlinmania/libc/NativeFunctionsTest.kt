@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.vxworks.calloc
import io.github.kotlinmania.libc.vxworks.free
import io.github.kotlinmania.libc.vxworks.getenv
import io.github.kotlinmania.libc.vxworks.isalpha
import io.github.kotlinmania.libc.vxworks.isdigit
import io.github.kotlinmania.libc.vxworks.islower
import io.github.kotlinmania.libc.vxworks.isupper
import io.github.kotlinmania.libc.vxworks.malloc
import io.github.kotlinmania.libc.vxworks.memcmp
import io.github.kotlinmania.libc.vxworks.memcpy
import io.github.kotlinmania.libc.vxworks.memset
import io.github.kotlinmania.libc.vxworks.realloc
import io.github.kotlinmania.libc.vxworks.strerror
import io.github.kotlinmania.libc.vxworks.strlen
import io.github.kotlinmania.libc.vxworks.tolower
import io.github.kotlinmania.libc.vxworks.toupper
import kotlinx.cinterop.ExperimentalForeignApi
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

/**
 * Native tests exercising real C library calls via platform.posix.
 * Memory/CMSG functions require per-platform actuals (size_t width differs
 * across 32-bit and 64-bit native targets), so they throw on shared nativeMain.
 * The ctype/string/env functions use CInt params and work on all targets.
 */
class NativeFunctionsTest {
    @Test
    fun mallocReturnsNonNull() {
        val ptr = malloc(1024uL)
        assertNotNull(ptr)
        free(ptr)
    }

    @Test
    fun callocReturnsNonNull() {
        val ptr = calloc(10uL, 4uL)
        assertNotNull(ptr)
        free(ptr)
    }

    @Test
    fun freeNullIsNoop() {
        free(null) // should not throw
    }

    @Test
    fun reallocResizesAllocation() {
        val ptr = malloc(16uL)
        assertNotNull(ptr)
        val resized = realloc(ptr, 64uL)
        assertNotNull(resized)
        free(resized)
    }

    @Test
    fun memsetAndMemcmpWork() {
        val p1 = malloc(16uL)
        val p2 = malloc(16uL)
        assertNotNull(p1)
        assertNotNull(p2)
        memset(p1, 0x41, 16uL)
        memset(p2, 0x41, 16uL)
        assertEquals(0, memcmp(p1, p2, 16uL))
        memset(p2, 0x42, 16uL)
        assertNotEquals(0, memcmp(p1, p2, 16uL))
        free(p1)
        free(p2)
    }

    @Test
    fun memcpyCopiesData() {
        val src = malloc(16uL)
        val dst = malloc(16uL)
        assertNotNull(src)
        assertNotNull(dst)
        memset(src, 0x7A, 16uL)
        memset(dst, 0, 16uL)
        assertNotEquals(0, memcmp(src, dst, 16uL))
        memcpy(dst, src, 16uL)
        assertEquals(0, memcmp(src, dst, 16uL))
        free(src)
        free(dst)
    }

    @Test
    fun strlenReturnsCorrectLength() {
        assertEquals(5uL, strlen("hello"))
        assertEquals(0uL, strlen(""))
        assertEquals(0uL, strlen(null))
    }

    @Test
    fun isalphaRecognizesLetters() {
        assertNotEquals(0, isalpha('a'.code), "'a' should be alphabetic")
        assertNotEquals(0, isalpha('Z'.code), "'Z' should be alphabetic")
        assertEquals(0, isalpha('0'.code), "'0' should not be alphabetic")
        assertEquals(0, isalpha(' '.code), "' ' should not be alphabetic")
    }

    @Test
    fun isdigitRecognizesDigits() {
        assertNotEquals(0, isdigit('0'.code), "'0' should be a digit")
        assertNotEquals(0, isdigit('9'.code), "'9' should be a digit")
        assertEquals(0, isdigit('a'.code), "'a' should not be a digit")
    }

    @Test
    fun islowerAndIsupper() {
        assertNotEquals(0, islower('a'.code), "'a' should be lowercase")
        assertEquals(0, islower('A'.code), "'A' should not be lowercase")
        assertNotEquals(0, isupper('A'.code), "'A' should be uppercase")
        assertEquals(0, isupper('a'.code), "'a' should not be uppercase")
    }

    @Test
    fun tolowerConvertsUppercase() {
        assertEquals('a'.code, tolower('A'.code), "tolower('A') should be 'a'")
        assertEquals('z'.code, tolower('Z'.code), "tolower('Z') should be 'z'")
        assertEquals('0'.code, tolower('0'.code), "tolower('0') should be '0' (unchanged)")
    }

    @Test
    fun toupperConvertsLowercase() {
        assertEquals('A'.code, toupper('a'.code), "toupper('a') should be 'A'")
        assertEquals('Z'.code, toupper('z'.code), "toupper('z') should be 'Z'")
        assertEquals('0'.code, toupper('0'.code), "toupper('0') should be '0' (unchanged)")
    }

    @Test
    fun strerrorReturnsMessage() {
        val msg = strerror(2)
        assertNotNull(msg, "strerror(2) should return a message")
        assertTrue(msg.isNotEmpty(), "strerror message should not be empty")
    }

    @Test
    fun getenvReturnsNullForMissingVar() {
        val result = getenv("THIS_ENV_VAR_SHOULD_NOT_EXIST_12345")
        if (result != null) {
            assertTrue(result.isEmpty(), "non-existent env var should return null or empty")
        }
    }

    @Test
    fun getenvReturnsValueForExistingVar() {
        val result = getenv("PATH")
        if (result != null) {
            assertTrue(result.isNotEmpty(), "PATH should be non-empty if it exists")
        }
    }
}
