package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class FdSet(
    val fdsBits: List<ULong>,
)
