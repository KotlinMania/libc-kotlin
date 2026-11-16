package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.calloc
import io.github.kotlinmania.libc.unix.free
import io.github.kotlinmania.libc.unix.malloc
import io.github.kotlinmania.libc.unix.memcmp
import io.github.kotlinmania.libc.unix.memcpy
import io.github.kotlinmania.libc.unix.memset
import io.github.kotlinmania.libc.unix.realloc
import io.github.kotlinmania.libc.unix.strlen
import io.github.kotlinmania.rustlang.alloc.ffi.CString
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

internal inline fun <R> withCString(
    text: String,
    block: (ConstPtr) -> R,
): R {
    val cstr = CString.new(text).unwrap()
    return try {
        block(cstr.asPtr())
    } finally {
        cstr.deallocate()
    }
}

/**
 * Shared memory scenarios derived from RUST_CALLERS.md caller patterns.
 *
 * Callers (codex, memmap2, getrandom) use malloc/free/calloc/realloc/memcpy/memset/memcmp
 * to manage heap memory and buffer contents. These scenarios exercise the same
 * FFI paths those callers depend on.
 */
internal fun verifyCallerMemory() {
    var source = malloc(64uL)
    assertFalse(source.isNull())
    val destination = calloc(64uL, 1uL)
    assertFalse(destination.isNull())
    try {
        assertEquals(source.rawAddress, memset(source, 0xAB, 64uL).rawAddress)
        assertNotEquals(0, memcmp(source.castConst(), destination.castConst(), 64uL))
        assertEquals(destination.rawAddress, memcpy(destination, source.castConst(), 64uL).rawAddress)
        assertEquals(0, memcmp(source.castConst(), destination.castConst(), 64uL))
        source = realloc(source, 128uL)
        assertFalse(source.isNull())
        assertEquals(0, memcmp(source.castConst(), destination.castConst(), 64uL))
    } finally {
        free(source)
        free(destination)
    }
    free(MutPtr(0L))
}

/**
 * String scenarios: callers (core-foundation, openssl-sys) use strlen
 * to measure C-string lengths at FFI boundaries.
 */
internal fun verifyCallerString() {
    withCString("") { assertEquals(0uL, strlen(it)) }
    withCString("hello") { assertEquals(5uL, strlen(it)) }
    withCString("hello, world!") { assertEquals(13uL, strlen(it)) }
}
