package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun preadv64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
