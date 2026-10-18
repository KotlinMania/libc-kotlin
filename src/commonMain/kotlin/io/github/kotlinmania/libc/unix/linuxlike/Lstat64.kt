package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun lstat64(path: String?, buf: Stat64?): Int
