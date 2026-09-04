// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl not available on WASI — no C library access")

public actual fun getcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("getcontext not available on WASI — no C library access")

public actual fun setcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("setcontext not available on WASI — no C library access")

public actual fun swapcontext(oucp: UcontextT?, ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("swapcontext not available on WASI — no C library access")

