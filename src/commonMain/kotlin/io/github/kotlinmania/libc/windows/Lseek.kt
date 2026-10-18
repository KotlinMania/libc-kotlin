package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun lseek(fd: Int, offset: Long, origin: Int): Long
