package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun fstatfs(fd: Int, buf: Statfs?): Int
