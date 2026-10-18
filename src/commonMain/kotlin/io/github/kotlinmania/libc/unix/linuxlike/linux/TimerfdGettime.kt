package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Itimerspec

public expect fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int
