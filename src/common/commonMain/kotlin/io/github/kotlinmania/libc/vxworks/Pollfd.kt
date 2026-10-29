package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Pollfd(
    val fd: Int,
    val events: Short,
    val revents: Short,
)
