// port-lint: source Fcntl.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun open(pathname: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun creat(pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat requires FFI bridge")

public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl requires manual FFI bridge — not yet implemented")
