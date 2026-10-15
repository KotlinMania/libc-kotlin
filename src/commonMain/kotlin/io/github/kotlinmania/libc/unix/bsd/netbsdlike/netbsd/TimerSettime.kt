package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun timerSettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int
