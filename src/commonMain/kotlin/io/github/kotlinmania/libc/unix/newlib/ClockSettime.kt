package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public expect fun clockSettime(clockId: ULong, tp: Timespec?): Int
