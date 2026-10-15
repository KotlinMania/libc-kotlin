package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int
