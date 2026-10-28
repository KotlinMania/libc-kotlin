package io.github.kotlinmania.libc.unix.nto
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun clockSettime(clkId: Int, tp: Timespec?): Int
