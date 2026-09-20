// port-lint: source Netlink.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.linuxuapi.linux

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun nLAALIGN(len: CInt): CInt =
    throw UnsupportedOperationException("nLAALIGN requires manual FFI bridge — not yet implemented")
