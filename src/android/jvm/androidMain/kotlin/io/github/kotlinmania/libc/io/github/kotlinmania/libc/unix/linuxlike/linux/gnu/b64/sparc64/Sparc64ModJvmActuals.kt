package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.sparc64

import io.github.kotlinmania.libc.COpaquePointer

internal object Sparc64ModRawLibc {
    external fun sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
}

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    Sparc64ModRawLibc.sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)
