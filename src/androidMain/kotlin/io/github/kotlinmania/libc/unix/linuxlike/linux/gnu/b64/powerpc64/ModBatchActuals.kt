// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*

public actual fun sysctl(name: Int?, namelen: Int, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl not available on Android host — use androidNative target for FFI")

public actual fun getcontext(ucp: UcontextT?): Int =
    throw UnsupportedOperationException("getcontext not available on Android host — use androidNative target for FFI")

public actual fun setcontext(ucp: UcontextT?): Int =
    throw UnsupportedOperationException("setcontext not available on Android host — use androidNative target for FFI")

public actual fun swapcontext(oucp: UcontextT?, ucp: UcontextT?): Int =
    throw UnsupportedOperationException("swapcontext not available on Android host — use androidNative target for FFI")

public actual fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: Int, vararg args: Any?): Unit = throw UnsupportedOperationException("makecontext not available on Android host — use androidNative target for FFI")
