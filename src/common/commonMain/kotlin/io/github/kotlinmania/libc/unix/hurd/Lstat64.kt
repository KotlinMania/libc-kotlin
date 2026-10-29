package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun lstat64(file: String?, buf: Stat64?): Int
