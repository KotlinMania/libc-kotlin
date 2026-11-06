package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.COpaquePointer

public actual fun getcontext(ucp: UcontextT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getcontext(ucp?.toLong() ?: 0L)") as CInt

public actual fun setcontext(ucp: UcontextT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setcontext(ucp?.toLong() ?: 0L)") as CInt

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').swapcontext(uocp?.toLong() ?: 0L, ucp?.toLong() ?: 0L)") as CInt
