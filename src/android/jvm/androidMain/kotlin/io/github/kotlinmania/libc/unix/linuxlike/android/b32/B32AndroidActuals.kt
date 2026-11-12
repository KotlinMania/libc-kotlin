@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Tm
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

private object UnixLinuxlikeAndroidB32JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidB32Timegm64(tm: Long): Long
}

public actual fun timegm64(tm: ConstPtr<Tm>): Time64T =
    UnixLinuxlikeAndroidB32JniBridge.libcUnixLinuxlikeAndroidB32Timegm64(tm.rawAddress)
