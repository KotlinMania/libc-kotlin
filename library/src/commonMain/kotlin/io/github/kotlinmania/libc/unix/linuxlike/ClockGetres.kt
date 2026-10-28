package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun clockGetres(clkId: Int, tp: Timespec?): Int
