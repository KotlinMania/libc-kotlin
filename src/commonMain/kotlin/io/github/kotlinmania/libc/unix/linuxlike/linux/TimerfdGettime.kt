package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int
