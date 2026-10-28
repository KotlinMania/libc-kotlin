package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun fstatfs64(fd: Int, buf: Statfs64?): Int
