package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Itimerspec

public expect fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int
