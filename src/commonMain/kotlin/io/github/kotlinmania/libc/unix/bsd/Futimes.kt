package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.unix.Timeval

import io.github.kotlinmania.libc.*

public expect fun futimes(fd: Int, times: Timeval?): Int
