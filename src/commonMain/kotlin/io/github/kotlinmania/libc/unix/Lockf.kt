package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun lockf(fd: Int, cmd: Int, len: Long): Int
