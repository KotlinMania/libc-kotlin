// port-lint: source Mod.rs
package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*

public actual fun stricmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("stricmp not available on WASI — no C library access")

public actual fun strnicmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strnicmp not available on WASI — no C library access")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy not available on WASI — no C library access")

