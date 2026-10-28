package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class FdSet(
    val fdsBits: ULongArray,
)
