package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public expect fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long
