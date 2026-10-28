package io.github.kotlinmania.libc.unix.nto
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Itimerval

public expect fun setitimer(which: Int, value: Itimerval?, ovalue: Itimerval?): Int
