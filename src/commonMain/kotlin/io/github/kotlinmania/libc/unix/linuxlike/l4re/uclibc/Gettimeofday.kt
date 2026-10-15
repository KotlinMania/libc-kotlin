package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): Int
