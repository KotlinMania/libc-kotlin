package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*

public actual fun getcontext(ucp: UcontextT?): Int =
    throw UnsupportedOperationException("getcontext requires N-API addon")

public actual fun setcontext(ucp: UcontextT?): Int =
    throw UnsupportedOperationException("setcontext requires N-API addon")

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): Int =
    throw UnsupportedOperationException("swapcontext requires N-API addon")

public actual fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: Int, vararg args: Any?): Unit = throw UnsupportedOperationException("makecontext requires N-API addon")
