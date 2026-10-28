package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun fstatfs(fd: Int, buf: Statfs?): Int
