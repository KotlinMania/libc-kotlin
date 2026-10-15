package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun fstatfs64(fd: Int, buf: Statfs64?): Int
