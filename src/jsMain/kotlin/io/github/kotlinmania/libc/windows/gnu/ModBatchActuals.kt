// port-lint: source Mod.rs
package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcasecmp requires N-API addon")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncasecmp requires N-API addon")

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr requires N-API addon")

