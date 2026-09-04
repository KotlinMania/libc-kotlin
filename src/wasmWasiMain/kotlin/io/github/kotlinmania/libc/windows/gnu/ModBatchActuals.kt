// port-lint: source Mod.rs
package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcasecmp not available on WASI — no C library access")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncasecmp not available on WASI — no C library access")

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr not available on WASI — no C library access")

