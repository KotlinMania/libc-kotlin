package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class FdSet(
    val fdsBits: ULongArray,
)
