// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import libc.cinterop.libc_exchangedata

public actual fun exchangedata(path1: String?, path2: String?, options: CULong): CInt {
    if (path1 == null) return -1
    if (path2 == null) return -1
    return libc.cinterop.libc_exchangedata(path1, path2, options)
}
