// port-lint: source Errno.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun errno(): Int? =
    throw UnsupportedOperationException("errno requires manual FFI bridge — not yet implemented")

public actual fun setErrno(value: Int): Unit =
    throw UnsupportedOperationException("setErrno requires manual FFI bridge — not yet implemented")
