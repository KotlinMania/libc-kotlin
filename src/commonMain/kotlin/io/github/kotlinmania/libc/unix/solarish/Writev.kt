package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long
