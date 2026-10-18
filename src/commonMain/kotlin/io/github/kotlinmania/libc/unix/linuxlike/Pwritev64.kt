package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public expect fun pwritev64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
