package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.COpaquePointer

public actual fun stat(pathname: String?, statbuf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stat(pathname, statbuf?.toLong() ?: 0L)") as CInt

public actual fun fstat(fd: CInt, statbuf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstat(fd, statbuf?.toLong() ?: 0L)") as CInt
