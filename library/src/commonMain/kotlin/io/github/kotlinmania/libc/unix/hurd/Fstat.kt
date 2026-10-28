package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun fstat(fd: Int, buf: Stat?): Int
