package io.github.kotlinmania.libc.unix.newlib.vita
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long
