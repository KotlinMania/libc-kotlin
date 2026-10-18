package io.github.kotlinmania.libc.unix.redox
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.Timezone

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): Int
