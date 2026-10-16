package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun gettimeofday(tv: Timeval?, tz: COpaquePointer?): Int
