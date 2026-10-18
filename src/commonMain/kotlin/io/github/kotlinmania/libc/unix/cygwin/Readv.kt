package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public expect fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long
