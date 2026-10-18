package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class Bintime(
    val sec: Long,
    val frac: ULong,
)
