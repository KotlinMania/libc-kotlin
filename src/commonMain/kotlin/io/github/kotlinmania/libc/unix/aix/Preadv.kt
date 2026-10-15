package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
