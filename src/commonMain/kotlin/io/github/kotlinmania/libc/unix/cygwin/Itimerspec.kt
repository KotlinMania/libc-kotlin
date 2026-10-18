package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)
