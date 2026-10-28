package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
