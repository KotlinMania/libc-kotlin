package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.unix.Timeval

import io.github.kotlinmania.libc.*

public expect fun settimeofday(tp: Timeval?, tz: COpaquePointer?): Int
