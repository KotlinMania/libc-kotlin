package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
