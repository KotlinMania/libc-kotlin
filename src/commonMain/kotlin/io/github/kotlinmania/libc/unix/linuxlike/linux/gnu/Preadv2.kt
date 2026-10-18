package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun preadv2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long
