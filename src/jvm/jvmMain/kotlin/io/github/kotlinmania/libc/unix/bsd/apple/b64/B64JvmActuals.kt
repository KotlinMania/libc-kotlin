@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint

private object UnixBsdAppleB64JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_apple_b64_exchangedata(path1: String?, path2: String?, options: Int): Int
}

public actual fun exchangedata(path1: String?, path2: String?, options: CUint): CInt =
    UnixBsdAppleB64JniBridge.libc_unix_bsd_apple_b64_exchangedata(path1, path2, options.toInt())
