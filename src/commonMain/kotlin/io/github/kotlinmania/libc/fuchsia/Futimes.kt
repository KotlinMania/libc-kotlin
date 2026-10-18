package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun futimes(fd: Int, times: Timeval?): Int
