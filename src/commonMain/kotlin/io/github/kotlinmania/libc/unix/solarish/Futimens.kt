package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun futimens(dirfd: Int, times: Timespec?): Int
