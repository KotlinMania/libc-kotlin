package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int
