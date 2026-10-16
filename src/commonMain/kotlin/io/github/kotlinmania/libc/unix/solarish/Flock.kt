package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class Flock(
    val lType: Short,
    val lWhence: Short,
    val lStart: Long,
    val lLen: Long,
    val lSysid: Int,
    val lPid: Int,
    val lPad: LongArray,
)
