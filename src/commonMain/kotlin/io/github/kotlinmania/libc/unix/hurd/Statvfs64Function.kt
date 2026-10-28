package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun statvfs64(file: String?, buf: Statvfs64?): Int
