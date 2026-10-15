package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public data class Timeval(
    val handle: Long = 0L,
    val tvSec: Long,
    val tvUsec: Long,
)
