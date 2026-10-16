package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class PtpSysOffset(
    val nSamples: UInt,
    val rsv: UIntArray,
    val ts: List<PtpClockTime>,
)
