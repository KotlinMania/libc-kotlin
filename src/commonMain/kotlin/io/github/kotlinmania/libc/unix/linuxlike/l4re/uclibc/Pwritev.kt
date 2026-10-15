package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public expect fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
