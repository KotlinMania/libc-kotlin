package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun pOnline(processorid: Int, flag: Int): Int
