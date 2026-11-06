package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.COpaquePointer

internal object StatRawLibc {
    external fun stat(pathname: String?, statbuf: Long): Int
    external fun fstat(fd: Int, statbuf: Long): Int
}

public actual fun stat(pathname: String?, statbuf: Stat?): CInt =
    StatRawLibc.stat(pathname, statbuf?.toLong() ?: 0L)

public actual fun fstat(fd: CInt, statbuf: Stat?): CInt =
    StatRawLibc.fstat(fd, statbuf?.toLong() ?: 0L)
