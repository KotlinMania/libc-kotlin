@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.bsd.apple.b32.cinterop.libcUnixBsdAppleB32Exchangedata
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun exchangedata(path1: ConstPtr, path2: ConstPtr, options: CUlong): CInt =
    libcUnixBsdAppleB32Exchangedata(path1.rawAddress.toCPointer<ByteVar>(), path2.rawAddress.toCPointer<ByteVar>(), options)
