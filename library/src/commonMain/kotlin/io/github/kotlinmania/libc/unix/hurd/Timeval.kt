package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Timeval(
    val handle: Long = 0L,
    val tvSec: Int,
    val tvUsec: Int,
)
