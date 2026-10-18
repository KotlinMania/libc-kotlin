package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun pwritev64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
