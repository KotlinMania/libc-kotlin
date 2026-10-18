package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun clockGetres(clkId: Int, tp: Timespec?): Int
