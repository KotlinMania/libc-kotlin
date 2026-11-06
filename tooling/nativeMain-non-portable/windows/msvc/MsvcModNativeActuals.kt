@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun stricmp(s1: String?, s2: String?): CInt =
    io.github.kotlinmania.libc.windows.msvc.cinterop.libc_msvc_mod_stricmp(s1, s2)

public actual fun strnicmp(s1: String?, s2: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.windows.msvc.cinterop.libc_msvc_mod_strnicmp(s1, s2, n)

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.msvc.cinterop.libc_msvc_mod_memccpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), c, count)?.let { COpaquePointer(it.toLong()) }
