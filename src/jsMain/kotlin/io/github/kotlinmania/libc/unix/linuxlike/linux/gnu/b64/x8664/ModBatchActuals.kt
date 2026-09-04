// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*

public actual fun getcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("getcontext requires N-API addon")

public actual fun setcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("setcontext requires N-API addon")

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("swapcontext requires N-API addon")

