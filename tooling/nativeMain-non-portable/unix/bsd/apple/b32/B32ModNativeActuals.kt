@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b32

public actual fun exchangedata(path1: String?, path2: String?, options: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.b32.cinterop.libc_b32_mod_exchangedata(path1, path2, options)
