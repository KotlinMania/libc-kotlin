package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun settimeofday(tv: Timeval?, tz: COpaquePointer?): Int
