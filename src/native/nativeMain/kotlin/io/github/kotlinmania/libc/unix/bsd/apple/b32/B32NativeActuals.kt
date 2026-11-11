@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.bsd.apple.b32.cinterop.libc_unix_bsd_apple_b32_exchangedata

public actual fun exchangedata(path1: String?, path2: String?, options: CUlong): CInt =
    libc_unix_bsd_apple_b32_exchangedata(path1, path2, options)
