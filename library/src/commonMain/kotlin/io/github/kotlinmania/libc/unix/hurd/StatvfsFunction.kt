package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun statvfs(file: String?, buf: Statvfs?): Int
