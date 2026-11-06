package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64

import io.github.kotlinmania.libc.COpaquePointer

public actual fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun getcontext(ucp: io.github.kotlinmania.libc.UcontextT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getcontext(ucp?.toLong() ?: 0L)") as CInt

public actual fun setcontext(ucp: io.github.kotlinmania.libc.UcontextT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setcontext(ucp?.toLong() ?: 0L)") as CInt

public actual fun swapcontext(uocp: io.github.kotlinmania.libc.UcontextT?, ucp: io.github.kotlinmania.libc.UcontextT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').swapcontext(uocp?.toLong() ?: 0L, ucp?.toLong() ?: 0L)") as CInt
