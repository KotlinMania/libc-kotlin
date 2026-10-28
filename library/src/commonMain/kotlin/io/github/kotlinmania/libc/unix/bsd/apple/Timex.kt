package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Timex(
    val modes: UInt,
    val offset: Long,
    val freq: Long,
    val maxerror: Long,
    val esterror: Long,
    val status: Int,
    val constant: Long,
    val precision: Long,
    val tolerance: Long,
    val ppsfreq: Long,
    val jitter: Long,
    val shift: Int,
    val stabil: Long,
    val jitcnt: Long,
    val calcnt: Long,
    val errcnt: Long,
    val stbcnt: Long,
)
