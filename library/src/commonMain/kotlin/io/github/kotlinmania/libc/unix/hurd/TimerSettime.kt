package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun timerSettime(timerid: UInt, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int
