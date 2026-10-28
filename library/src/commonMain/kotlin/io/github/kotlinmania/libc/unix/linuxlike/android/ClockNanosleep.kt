package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int
