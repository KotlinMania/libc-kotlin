// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun exchangedata(path1: String?, path2: String?, options: CUInt): CInt =
    throw UnsupportedOperationException("exchangedata requires manual FFI bridge — not yet implemented")
