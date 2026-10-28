package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun flock(fd: Int, operation: Int): Int
