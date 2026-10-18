package io.github.kotlinmania.libc.unix.hurd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Timezone

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): Int
