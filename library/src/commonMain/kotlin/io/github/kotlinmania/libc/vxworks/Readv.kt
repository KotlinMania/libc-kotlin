package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long
