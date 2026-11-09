@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong

private object UnixBsdAppleB32JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_apple_b32_exchangedata(path1: String?, path2: String?, options: Long): Int
}

public actual fun exchangedata(path1: String?, path2: String?, options: CUlong): CInt =
    UnixBsdAppleB32JniBridge.libc_unix_bsd_apple_b32_exchangedata(path1, path2, options.toLong())
