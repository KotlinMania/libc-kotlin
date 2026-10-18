package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Itimerval

public expect fun getitimer(which: Int, currValue: Itimerval?): Int
