package io.github.kotlinmania.libc.unix.redox
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
