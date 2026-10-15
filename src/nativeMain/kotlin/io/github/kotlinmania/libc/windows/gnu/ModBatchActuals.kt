// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import libc.cinterop.libc_strcasecmp
import libc.cinterop.libc_strncasecmp

public actual fun strcasecmp(s1: String?, s2: String?): Int {
    if (s1 == null) return -1
    if (s2 == null) return -1
    return libc.cinterop.libc_strcasecmp(s1, s2)
}

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): Int =
    libc.cinterop.libc_strncasecmp(s1, s2, n)

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr requires manual FFI bridge — not yet implemented")
