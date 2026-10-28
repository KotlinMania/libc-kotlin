package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun preadv64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Int
