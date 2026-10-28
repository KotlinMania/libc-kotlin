package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class FdSet(
    val fdsBits: List<Long>,
)
