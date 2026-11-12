@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.windows.SizeT
import io.github.kotlinmania.libc.windows.msvc.cinterop.libcWindowsMsvcMemccpy
import io.github.kotlinmania.libc.windows.msvc.cinterop.libcWindowsMsvcStricmp
import io.github.kotlinmania.libc.windows.msvc.cinterop.libcWindowsMsvcStrnicmp
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun stricmp(s1: ConstPtr, s2: ConstPtr): CInt =
    libcWindowsMsvcStricmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strnicmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    libcWindowsMsvcStrnicmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, count: SizeT): MutPtr =
    MutPtr(libcWindowsMsvcMemccpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), c, count)?.toLong() ?: 0L)
