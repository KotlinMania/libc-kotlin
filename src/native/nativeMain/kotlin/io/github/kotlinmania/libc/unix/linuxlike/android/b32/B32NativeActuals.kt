@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.unix.linuxlike.android.b32.cinterop.libcUnixLinuxlikeAndroidB32Timegm64
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun timegm64(tm: ConstPtr): Time64T =
    libcUnixLinuxlikeAndroidB32Timegm64(tm.rawAddress.toCPointer<ByteVar>())
