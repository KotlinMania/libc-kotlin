package io.github.kotlinmania.libc.unix.haiku
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun readv(fd: Int, iov: Iovec?, count: Int): Long
