package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)
