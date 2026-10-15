package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*

public expect fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long
