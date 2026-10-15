package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun setpflags(flags: UInt, value: UInt): Int
