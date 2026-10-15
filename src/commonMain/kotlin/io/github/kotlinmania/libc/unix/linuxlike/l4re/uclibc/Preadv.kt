package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public expect fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
