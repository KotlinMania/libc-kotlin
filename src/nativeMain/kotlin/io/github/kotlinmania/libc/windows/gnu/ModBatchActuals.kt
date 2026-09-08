// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    libc.cinterop.libc_strcasecmp(s1, s2)
public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    libc.cinterop.libc_strncasecmp(s1, s2, n)
public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr requires manual FFI bridge — not yet implemented")
