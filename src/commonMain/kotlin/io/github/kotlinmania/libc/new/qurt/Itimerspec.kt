package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)
