package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public expect fun pwritev64v2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long
