package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun fstat64(fildes: Int, buf: Stat64?): Int
