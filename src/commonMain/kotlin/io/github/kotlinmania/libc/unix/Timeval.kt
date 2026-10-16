package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public data class Timeval(
    val handle: Long = 0L,
    val tvSec: Long,
    val tvUsec: Long,
    val tvUsec2: Long,
)
