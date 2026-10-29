package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class PtpSysOffsetExtended(
    val nSamples: UInt,
    val clockid: Int,
    val rsv: UIntArray,
    val ts: List<PtpClockTime>,
)
