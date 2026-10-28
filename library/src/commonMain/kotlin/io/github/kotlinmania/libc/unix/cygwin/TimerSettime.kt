package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun timerSettime(timerid: ULong, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int
