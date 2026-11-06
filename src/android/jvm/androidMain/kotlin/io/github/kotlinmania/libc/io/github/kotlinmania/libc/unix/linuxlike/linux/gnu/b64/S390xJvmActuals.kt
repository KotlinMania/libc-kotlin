package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64

import io.github.kotlinmania.libc.COpaquePointer

internal object S390xRawLibc {
    external fun sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun getcontext(ucp: Long): Int
    external fun setcontext(ucp: Long): Int
    external fun swapcontext(uocp: Long, ucp: Long): Int
}

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    S390xRawLibc.sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun getcontext(ucp: io.github.kotlinmania.libc.UcontextT?): CInt =
    S390xRawLibc.getcontext(ucp?.toLong() ?: 0L)

public actual fun setcontext(ucp: io.github.kotlinmania.libc.UcontextT?): CInt =
    S390xRawLibc.setcontext(ucp?.toLong() ?: 0L)

public actual fun swapcontext(uocp: io.github.kotlinmania.libc.UcontextT?, ucp: io.github.kotlinmania.libc.UcontextT?): CInt =
    S390xRawLibc.swapcontext(uocp?.toLong() ?: 0L, ucp?.toLong() ?: 0L)
