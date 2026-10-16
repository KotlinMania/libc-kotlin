package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)
