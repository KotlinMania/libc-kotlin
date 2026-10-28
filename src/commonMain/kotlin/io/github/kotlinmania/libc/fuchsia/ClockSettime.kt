package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun clockSettime(clkId: Int, tp: Timespec?): Int
