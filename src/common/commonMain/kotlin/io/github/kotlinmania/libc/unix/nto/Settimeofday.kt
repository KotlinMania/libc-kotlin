package io.github.kotlinmania.libc.unix.nto
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval

public expect fun settimeofday(tv: Timeval?, tz: COpaquePointer?): Int
