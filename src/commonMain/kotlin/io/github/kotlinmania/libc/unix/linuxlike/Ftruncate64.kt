package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun ftruncate64(fd: Int, length: Long): Int
