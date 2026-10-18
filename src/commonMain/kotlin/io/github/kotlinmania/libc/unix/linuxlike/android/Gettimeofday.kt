package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): Int
