package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int
