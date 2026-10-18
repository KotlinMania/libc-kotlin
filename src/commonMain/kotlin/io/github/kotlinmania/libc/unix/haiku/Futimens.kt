package io.github.kotlinmania.libc.unix.haiku
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun futimens(fd: Int, times: Timespec?): Int
