package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Rlimit64(
    val handle: Long = 0L,
    val rlimCur: ULong,
    val rlimMax: ULong,
)
