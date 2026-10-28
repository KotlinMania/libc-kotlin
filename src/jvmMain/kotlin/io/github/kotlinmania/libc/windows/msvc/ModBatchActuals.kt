package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*

public actual fun stricmp(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("stricmp not available on JVM — no C library access")

public actual fun strnicmp(s1: String?, s2: String?, n: ULong): Int =
    throw UnsupportedOperationException("strnicmp not available on JVM — no C library access")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: Int, count: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy not available on JVM — no C library access")
