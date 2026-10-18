package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun clockGetres(clkId: UInt, tp: Timespec?): Int
