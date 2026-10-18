package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*

public actual fun strcasecmp(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("strcasecmp not available on WASI — no C library access")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncasecmp not available on WASI — no C library access")

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr not available on WASI — no C library access")
