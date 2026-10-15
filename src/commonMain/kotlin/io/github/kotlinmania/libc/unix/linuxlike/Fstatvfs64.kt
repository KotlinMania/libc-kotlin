package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun fstatvfs64(fd: Int, buf: Statvfs64?): Int
