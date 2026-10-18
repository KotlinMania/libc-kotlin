package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpSendvSpa(
    val sendvFlags: UInt,
    val sendvSndinfo: SctpSndinfo,
    val sendvPrinfo: SctpPrinfo,
    val sendvAuthinfo: SctpAuthinfo,
)
