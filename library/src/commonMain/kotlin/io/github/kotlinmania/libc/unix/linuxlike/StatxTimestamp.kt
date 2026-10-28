package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class StatxTimestamp(
    val tvSec: Long,
    val tvNsec: UInt,
)
