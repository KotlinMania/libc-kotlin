package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Itimerval

public expect fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int
