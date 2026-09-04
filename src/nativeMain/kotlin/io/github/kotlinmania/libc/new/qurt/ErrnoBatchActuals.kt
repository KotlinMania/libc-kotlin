// port-lint: source Errno.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")
