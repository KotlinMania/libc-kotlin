@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

private object UnixBsdAppleB64JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixBsdAppleB64Exchangedata(path1: Long, path2: Long, options: Int): Int
}

public actual fun exchangedata(path1: ConstPtr, path2: ConstPtr, options: CUint): CInt =
    UnixBsdAppleB64JniBridge.libcUnixBsdAppleB64Exchangedata(path1.rawAddress, path2.rawAddress, options.toInt())
