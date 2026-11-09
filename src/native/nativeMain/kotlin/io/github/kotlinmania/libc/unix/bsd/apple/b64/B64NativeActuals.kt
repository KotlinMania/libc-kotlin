@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint

public actual fun exchangedata(path1: String?, path2: String?, options: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.b64.cinterop.libc_unix_bsd_apple_b64_exchangedata(path1, path2, options)
