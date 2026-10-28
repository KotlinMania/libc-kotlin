package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun ftruncate(fd: Int, length: Long): Int
