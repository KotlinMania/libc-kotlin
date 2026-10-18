package io.github.kotlinmania.libc.unix.aix
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun clockNanosleep(clkId: Long, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int
