package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int
