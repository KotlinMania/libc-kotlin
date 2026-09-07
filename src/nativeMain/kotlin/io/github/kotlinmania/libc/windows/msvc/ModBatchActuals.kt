// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun stricmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("stricmp requires manual FFI bridge — not yet implemented")

public actual fun strnicmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strnicmp requires manual FFI bridge — not yet implemented")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy requires manual FFI bridge — not yet implemented")
