package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*

public expect fun pwritev2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long
