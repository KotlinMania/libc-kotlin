package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.COpaquePointer

internal object X8664ModRawLibc {
    external fun getcontext(ucp: Long): Int
    external fun setcontext(ucp: Long): Int
    external fun swapcontext(uocp: Long, ucp: Long): Int
}

public actual fun getcontext(ucp: UcontextT?): CInt =
    X8664ModRawLibc.getcontext(ucp?.toLong() ?: 0L)

public actual fun setcontext(ucp: UcontextT?): CInt =
    X8664ModRawLibc.setcontext(ucp?.toLong() ?: 0L)

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    X8664ModRawLibc.swapcontext(uocp?.toLong() ?: 0L, ucp?.toLong() ?: 0L)
