package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun statfs64(file: String?, buf: Statfs64?): Int
