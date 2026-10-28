package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Itimerval(
    val itInterval: Timeval,
    val itValue: Timeval,
)
