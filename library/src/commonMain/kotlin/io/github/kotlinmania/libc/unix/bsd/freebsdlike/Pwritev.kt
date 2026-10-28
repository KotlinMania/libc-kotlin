package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
