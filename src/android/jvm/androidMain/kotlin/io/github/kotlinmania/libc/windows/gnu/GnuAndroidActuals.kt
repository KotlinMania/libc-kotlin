@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.windows.SizeT
import io.github.kotlinmania.libc.windows.WcharT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WindowsGnuJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcWindowsGnuStrcasecmp(s1: Long, s2: Long): Int

    @JvmStatic
    external fun libcWindowsGnuStrncasecmp(s1: Long, s2: Long, n: Long): Int

    @JvmStatic
    external fun libcWindowsGnuWmemchr(cx: Long, c: Short, n: Long): Long
}

public actual fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    WindowsGnuJniBridge.libcWindowsGnuStrcasecmp(s1.rawAddress, s2.rawAddress)

public actual fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    WindowsGnuJniBridge.libcWindowsGnuStrncasecmp(s1.rawAddress, s2.rawAddress, n.toLong())

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    MutPtr(WindowsGnuJniBridge.libcWindowsGnuWmemchr(cx.rawAddress, c.toShort(), n.toLong()))
