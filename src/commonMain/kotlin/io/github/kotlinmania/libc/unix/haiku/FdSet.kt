package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class FdSet(
    val fdsBits: List<UInt>,
)
