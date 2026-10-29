package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class PollCtl(
    val cmd: Short,
    val events: Short,
    val fd: Int,
)
