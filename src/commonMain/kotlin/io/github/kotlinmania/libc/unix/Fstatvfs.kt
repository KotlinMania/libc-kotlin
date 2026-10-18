package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.unix.bsd.apple.Statvfs

import io.github.kotlinmania.libc.*

public expect fun fstatvfs(fd: Int, buf: Statvfs?): Int
