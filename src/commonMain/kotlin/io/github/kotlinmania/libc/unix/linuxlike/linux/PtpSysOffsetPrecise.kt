package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class PtpSysOffsetPrecise(
    val device: PtpClockTime,
    val sysRealtime: PtpClockTime,
    val sysMonoraw: PtpClockTime,
    val rsv: UIntArray,
)
