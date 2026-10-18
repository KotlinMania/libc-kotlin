package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public expect fun clockGettime(clockId: ULong, tp: Timespec?): Int
