package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.COpaquePointer

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun timegm64(tm: Tm?): io.github.kotlinmania.libc.Time64T =
    js("require('@kotlinmania/libc-native-bindings').timegm64(tm?.toLong() ?: 0L)") as io.github.kotlinmania.libc.Time64T

public actual fun exchangedata(path1: String?, path2: String?, options: CUlong): CInt =
    js("require('@kotlinmania/libc-native-bindings').exchangedata(path1, path2, options)") as CInt
