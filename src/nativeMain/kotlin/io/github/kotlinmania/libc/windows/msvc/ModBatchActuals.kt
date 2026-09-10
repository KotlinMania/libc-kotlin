// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toLong
import kotlinx.cinterop.toCPointer

public actual fun stricmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("stricmp requires manual FFI bridge — not yet implemented")

public actual fun strnicmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strnicmp requires manual FFI bridge — not yet implemented")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: ULong): COpaquePointer? =
    libc.cinterop.libc_memccpy(dest?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), src?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), c, count)?.let { COpaquePointer(it.toLong()) }
