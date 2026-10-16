package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class PtpPeroutRequest(
    val anonymous1: CAnonymousPtpPeroutRequest1,
    val period: PtpClockTime,
    val index: UInt,
    val flags: UInt,
    val anonymous2: CAnonymousPtpPeroutRequest2,
)
