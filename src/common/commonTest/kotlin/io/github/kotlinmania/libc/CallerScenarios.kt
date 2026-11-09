package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.calloc
import io.github.kotlinmania.libc.unix.free
import io.github.kotlinmania.libc.unix.malloc
import io.github.kotlinmania.libc.unix.memcmp
import io.github.kotlinmania.libc.unix.memcpy
import io.github.kotlinmania.libc.unix.memset
import io.github.kotlinmania.libc.unix.realloc
import io.github.kotlinmania.libc.unix.strlen
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull

/**
 * Shared memory scenarios derived from RUST_CALLERS.md caller patterns.
 *
 * Callers (codex, memmap2, getrandom) use malloc/free/calloc/realloc/memcpy/memset/memcmp
 * to manage heap memory and buffer contents. These scenarios exercise the same
 * FFI paths those callers depend on.
 */
internal fun verifyCallerMemory() {
    val source = assertNotNull(malloc(64uL))
    val destination = assertNotNull(calloc(64uL, 1uL))
    try {
        assertEquals(source, assertNotNull(memset(source, 0xAB, 64uL)))
        assertNotEquals(0, memcmp(source, destination, 64uL))
        assertEquals(destination, assertNotNull(memcpy(destination, source, 64uL)))
        assertEquals(0, memcmp(source, destination, 64uL))
        val resized = assertNotNull(realloc(source, 128uL))
        assertEquals(0, memcmp(resized, destination, 64uL))
    } finally {
        free(source)
        free(destination)
    }
    free(null)
}

/**
 * String scenarios: callers (core-foundation, openssl-sys) use strlen
 * to measure C-string lengths at FFI boundaries.
 */
internal fun verifyCallerString() {
    assertEquals(0uL, strlen(""))
    assertEquals(5uL, strlen("hello"))
    assertEquals(13uL, strlen("hello, world!"))
}
