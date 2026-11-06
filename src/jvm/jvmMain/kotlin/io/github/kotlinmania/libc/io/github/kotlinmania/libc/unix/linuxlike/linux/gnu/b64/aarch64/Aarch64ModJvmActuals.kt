package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64

import io.github.kotlinmania.libc.COpaquePointer

internal object Aarch64ModRawLibc {
    external fun sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun getcontext(ucp: Long): Int
    external fun setcontext(ucp: Long): Int
    external fun swapcontext(uocp: Long, ucp: Long): Int
}

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    Aarch64ModRawLibc.sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun getcontext(ucp: UcontextT?): CInt =
    Aarch64ModRawLibc.getcontext(ucp?.toLong() ?: 0L)

public actual fun setcontext(ucp: UcontextT?): CInt =
    Aarch64ModRawLibc.setcontext(ucp?.toLong() ?: 0L)

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    Aarch64ModRawLibc.swapcontext(uocp?.toLong() ?: 0L, ucp?.toLong() ?: 0L)
