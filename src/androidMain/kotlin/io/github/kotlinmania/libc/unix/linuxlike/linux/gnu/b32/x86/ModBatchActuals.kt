// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*

public actual fun getcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("getcontext not available on Android host — use androidNative target for FFI")

public actual fun setcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("setcontext not available on Android host — use androidNative target for FFI")

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("swapcontext not available on Android host — use androidNative target for FFI")

