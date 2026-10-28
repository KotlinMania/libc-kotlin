package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun pwritev(fd: Int, iov: Iovec?, count: Int, offset: Long): Long
