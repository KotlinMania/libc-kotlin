package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class SendfilevecT(
    val sfvFd: Int,
    val sfvFlag: UInt,
    val sfvOff: Long,
    val sfvLen: ULong,
)
