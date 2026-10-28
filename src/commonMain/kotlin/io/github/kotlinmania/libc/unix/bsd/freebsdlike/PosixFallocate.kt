package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun posixFallocate(fd: Int, offset: Long, len: Long): Int
