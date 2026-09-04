// port-lint: source S390x.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl requires manual FFI bridge — not yet implemented")

public actual fun getcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("getcontext requires manual FFI bridge — not yet implemented")

public actual fun setcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("setcontext requires manual FFI bridge — not yet implemented")

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("swapcontext requires manual FFI bridge — not yet implemented")
