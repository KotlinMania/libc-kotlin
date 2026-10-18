package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public expect fun futimens(fd: Int, times: Timespec?): Int
