package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Sync(
    val union: UInt,
    val owner: UInt,
)
