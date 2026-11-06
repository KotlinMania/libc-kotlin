package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.COpaquePointer

internal object X86ModRawLibc {
    external fun getcontext(ucp: Long): Int
    external fun setcontext(ucp: Long): Int
    external fun swapcontext(uocp: Long, ucp: Long): Int
}

public actual fun getcontext(ucp: UcontextT?): CInt =
    X86ModRawLibc.getcontext(ucp?.toLong() ?: 0L)

public actual fun setcontext(ucp: UcontextT?): CInt =
    X86ModRawLibc.setcontext(ucp?.toLong() ?: 0L)

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    X86ModRawLibc.swapcontext(uocp?.toLong() ?: 0L, ucp?.toLong() ?: 0L)
