package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun futimens(fd: Int, times: Timespec?): Int
