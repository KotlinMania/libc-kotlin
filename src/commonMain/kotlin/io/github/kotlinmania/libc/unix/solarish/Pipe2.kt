package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun pipe2(fds: Int?, flags: Int): Int
