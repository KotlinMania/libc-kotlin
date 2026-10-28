package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun clockSettime(clkId: ULong, tp: Timespec?): Int
