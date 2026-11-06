package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.COpaquePointer

internal object Powerpc64ModRawLibc {
    external fun sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun getcontext(ucp: Long): Int
    external fun setcontext(ucp: Long): Int
    external fun swapcontext(oucp: Long, ucp: Long): Int
}

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    Powerpc64ModRawLibc.sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun getcontext(ucp: UcontextT?): CInt =
    Powerpc64ModRawLibc.getcontext(ucp?.toLong() ?: 0L)

public actual fun setcontext(ucp: UcontextT?): CInt =
    Powerpc64ModRawLibc.setcontext(ucp?.toLong() ?: 0L)

public actual fun swapcontext(oucp: UcontextT?, ucp: UcontextT?): CInt =
    Powerpc64ModRawLibc.swapcontext(oucp?.toLong() ?: 0L, ucp?.toLong() ?: 0L)
