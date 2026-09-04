// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun getcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("getcontext requires manual FFI bridge — not yet implemented")

public actual fun setcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("setcontext requires manual FFI bridge — not yet implemented")

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("swapcontext requires manual FFI bridge — not yet implemented")
