package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun faccessat(fd: Int, path: String?, amode: Int, flag: Int): Int
