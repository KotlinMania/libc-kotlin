package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval

public expect fun futimes(fd: Int, times: Timeval?): Int
