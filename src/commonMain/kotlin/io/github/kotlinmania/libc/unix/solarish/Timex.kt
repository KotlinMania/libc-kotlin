package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class Timex(
    val modes: UInt,
    val offset: Int,
    val freq: Int,
    val maxerror: Int,
    val esterror: Int,
    val status: Int,
    val constant: Int,
    val precision: Int,
    val tolerance: Int,
    val ppsfreq: Int,
    val jitter: Int,
    val shift: Int,
    val stabil: Int,
    val jitcnt: Int,
    val calcnt: Int,
    val errcnt: Int,
    val stbcnt: Int,
)
