@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

private object UnixBsdAppleB32JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixBsdAppleB32Exchangedata(path1: Long, path2: Long, options: Long): Int
}

public actual fun exchangedata(path1: ConstPtr, path2: ConstPtr, options: CUlong): CInt =
    UnixBsdAppleB32JniBridge.libcUnixBsdAppleB32Exchangedata(path1.rawAddress, path2.rawAddress, options.toLong())
