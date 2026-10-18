package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.unix.Timeval

import io.github.kotlinmania.libc.*

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int
