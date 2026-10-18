package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun lseek(fd: Int, offset: Long, whence: Int): Long
