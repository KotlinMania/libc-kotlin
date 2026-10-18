package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int
