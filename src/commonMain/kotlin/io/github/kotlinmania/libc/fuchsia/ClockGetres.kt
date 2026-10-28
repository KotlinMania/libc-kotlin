package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun clockGetres(clkId: Int, tp: Timespec?): Int
