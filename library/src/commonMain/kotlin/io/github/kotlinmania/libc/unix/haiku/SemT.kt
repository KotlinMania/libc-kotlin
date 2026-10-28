package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class SemT(
    val type: Int,
    val namedSemId: Int,
)
