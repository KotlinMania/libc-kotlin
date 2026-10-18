package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Timezone

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): Int
