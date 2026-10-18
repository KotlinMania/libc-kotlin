package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*

public data class Pollfd(
    val fd: Int,
    val events: Int,
    val revents: Int,
)
