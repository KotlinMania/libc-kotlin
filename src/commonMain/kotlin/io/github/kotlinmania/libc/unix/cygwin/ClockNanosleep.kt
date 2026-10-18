package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun clockNanosleep(clkId: ULong, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int
