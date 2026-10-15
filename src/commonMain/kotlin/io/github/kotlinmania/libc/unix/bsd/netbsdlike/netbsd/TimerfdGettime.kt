package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int
