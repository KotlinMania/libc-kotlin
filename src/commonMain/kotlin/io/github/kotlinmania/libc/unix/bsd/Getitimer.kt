package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.unix.Itimerval

import io.github.kotlinmania.libc.*

public expect fun getitimer(which: Int, currValue: Itimerval?): Int
