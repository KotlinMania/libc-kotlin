package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun lseek(fd: Int, offset: Long, whence: Int): Long
