package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun ftruncate64(fd: Int, length: Long): Int
