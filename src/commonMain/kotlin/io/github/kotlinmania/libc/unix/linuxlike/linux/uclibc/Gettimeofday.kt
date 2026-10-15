package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): Int
