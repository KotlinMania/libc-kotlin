package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun fstatvfs(fd: Int, buf: Statvfs?): Int
