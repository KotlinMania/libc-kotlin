package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class FdSet(
    val fdsBits: UIntArray,
)
