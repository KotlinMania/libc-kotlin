@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b64

public actual fun exchangedata(path1: String?, path2: String?, options: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.b64.cinterop.libc_b64_mod_exchangedata(path1, path2, options)
