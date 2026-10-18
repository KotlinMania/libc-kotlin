package io.github.kotlinmania.libc.unix.haiku
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public expect fun readv(fd: Int, iov: Iovec?, count: Int): Long
