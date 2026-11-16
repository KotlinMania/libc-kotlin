@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.windows.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WindowsMsvcJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcWindowsMsvcStricmp(s1: Long, s2: Long): Int

    @JvmStatic
    external fun libcWindowsMsvcStrnicmp(s1: Long, s2: Long, n: Long): Int

    @JvmStatic
    external fun libcWindowsMsvcMemccpy(dest: Long, src: Long, c: Int, count: Long): Long
}

public actual fun stricmp(s1: ConstPtr, s2: ConstPtr): CInt =
    WindowsMsvcJniBridge.libcWindowsMsvcStricmp(s1.rawAddress, s2.rawAddress)

public actual fun strnicmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    WindowsMsvcJniBridge.libcWindowsMsvcStrnicmp(s1.rawAddress, s2.rawAddress, n.toLong())

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, count: SizeT): MutPtr =
    MutPtr(WindowsMsvcJniBridge.libcWindowsMsvcMemccpy(dest.rawAddress, src.rawAddress, c, count.toLong()))
