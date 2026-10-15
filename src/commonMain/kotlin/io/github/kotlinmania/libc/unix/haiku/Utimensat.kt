package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun utimensat(fd: Int, path: String?, times: Timespec?, flag: Int): Int
