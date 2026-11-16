@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.bsd.apple.b64.cinterop.libcUnixBsdAppleB64Exchangedata
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun exchangedata(path1: ConstPtr, path2: ConstPtr, options: CUint): CInt =
    libcUnixBsdAppleB64Exchangedata(path1.rawAddress.toCPointer<ByteVar>(), path2.rawAddress.toCPointer<ByteVar>(), options)
