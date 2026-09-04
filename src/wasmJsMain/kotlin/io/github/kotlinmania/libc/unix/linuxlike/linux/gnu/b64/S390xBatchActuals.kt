// port-lint: source S390x.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64

import io.github.kotlinmania.libc.*

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl requires N-API addon")

public actual fun getcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("getcontext requires N-API addon")

public actual fun setcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("setcontext requires N-API addon")

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("swapcontext requires N-API addon")

