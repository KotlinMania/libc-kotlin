@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

private object UnixLinuxlikeAndroidB32JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_android_b32_timegm64(tm: Long): Long
}

public actual fun timegm64(tm: COpaquePointer?): Time64T =
    UnixLinuxlikeAndroidB32JniBridge.libc_unix_linuxlike_android_b32_timegm64((tm?.value ?: 0L))
