package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun fstatvfs64(fd: Int, buf: Statvfs64?): Int
