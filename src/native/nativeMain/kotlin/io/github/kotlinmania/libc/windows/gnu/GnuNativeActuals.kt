@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.windows.SizeT
import io.github.kotlinmania.libc.windows.WcharT
import io.github.kotlinmania.libc.windows.gnu.cinterop.libcWindowsGnuStrcasecmp
import io.github.kotlinmania.libc.windows.gnu.cinterop.libcWindowsGnuStrncasecmp
import io.github.kotlinmania.libc.windows.gnu.cinterop.libcWindowsGnuWmemchr
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    libcWindowsGnuStrcasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    libcWindowsGnuStrncasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    MutPtr(libcWindowsGnuWmemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)
