// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*

public actual fun getcontext(ucp: UcontextT?): Int =
    throw UnsupportedOperationException("getcontext not available on WASI — no C library access")

public actual fun setcontext(ucp: UcontextT?): Int =
    throw UnsupportedOperationException("setcontext not available on WASI — no C library access")

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): Int =
    throw UnsupportedOperationException("swapcontext not available on WASI — no C library access")

public actual fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: Int, vararg args: Any?): Unit = throw UnsupportedOperationException("makecontext not available on WASI — no C library access")
