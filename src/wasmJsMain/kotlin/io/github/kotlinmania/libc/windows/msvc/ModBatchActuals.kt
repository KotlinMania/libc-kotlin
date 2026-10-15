// port-lint: source Mod.rs
package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*

public actual fun stricmp(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("stricmp requires N-API addon")

public actual fun strnicmp(s1: String?, s2: String?, n: ULong): Int =
    throw UnsupportedOperationException("strnicmp requires N-API addon")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: Int, count: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy requires N-API addon")
