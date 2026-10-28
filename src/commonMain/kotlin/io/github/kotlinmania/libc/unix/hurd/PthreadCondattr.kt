package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class PthreadCondattr(
    val pshared: UInt,
    val clock: Int,
)
