package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public expect fun preadv(fd: Int, iov: Iovec?, count: Int, offset: Long): Long
