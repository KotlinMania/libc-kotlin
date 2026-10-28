package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class StatxTimestamp(
    val tvSec: Long,
    val tvNsec: UInt,
    val statxTimestampPad1: IntArray,
)
