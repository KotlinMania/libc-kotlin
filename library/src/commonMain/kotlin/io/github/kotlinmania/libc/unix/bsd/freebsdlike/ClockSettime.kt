package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun clockSettime(clkId: Int, tp: Timespec?): Int
