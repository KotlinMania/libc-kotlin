// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun exchangedata(path1: String?, path2: String?, options: CULong): CInt =
    libc.cinterop.libc_exchangedata(path1, path2, options)
