@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.windows.SizeT
import io.github.kotlinmania.libc.windows.WcharT

private object WindowsGnuJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_windows_gnu_strcasecmp(s1: String?, s2: String?): Int

    @JvmStatic
    external fun libc_windows_gnu_strncasecmp(s1: String?, s2: String?, n: Long): Int

    @JvmStatic
    external fun libc_windows_gnu_wmemchr(cx: Long, c: Short, n: Long): Long
}

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    WindowsGnuJniBridge.libc_windows_gnu_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    WindowsGnuJniBridge.libc_windows_gnu_strncasecmp(s1, s2, n.toLong())

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    WindowsGnuJniBridge.libc_windows_gnu_wmemchr((cx?.value ?: 0L), c.toShort(), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }
