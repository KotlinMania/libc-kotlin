@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    io.github.kotlinmania.libc.windows.gnu.cinterop.libc_gnu_mod_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.windows.gnu.cinterop.libc_gnu_mod_strncasecmp(s1, s2, n)

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? =
    io.github.kotlinmania.libc.windows.gnu.cinterop.libc_gnu_mod_wmemchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }
