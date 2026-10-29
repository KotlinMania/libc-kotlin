package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class PtpClockTime(
    val sec: Long,
    val nsec: UInt,
    val reserved: UInt,
)
