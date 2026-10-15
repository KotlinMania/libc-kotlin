package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int
