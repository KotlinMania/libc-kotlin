package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int
