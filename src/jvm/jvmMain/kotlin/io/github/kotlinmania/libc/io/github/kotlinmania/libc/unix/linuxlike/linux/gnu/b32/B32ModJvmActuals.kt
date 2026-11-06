package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.COpaquePointer

internal object B32ModRawLibc {
    external fun sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun timegm64(tm: Long): Long
    external fun exchangedata(path1: String?, path2: String?, options: Long): Int
}

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    B32ModRawLibc.sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun timegm64(tm: Tm?): io.github.kotlinmania.libc.Time64T =
    B32ModRawLibc.timegm64(tm?.toLong() ?: 0L)

public actual fun exchangedata(path1: String?, path2: String?, options: CUlong): CInt =
    B32ModRawLibc.exchangedata(path1, path2, options)
