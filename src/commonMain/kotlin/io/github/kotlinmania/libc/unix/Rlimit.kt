package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public data class Rlimit(
    val handle: Long = 0L,
    val rlimCur: ULong,
    val rlimMax: ULong,
)
