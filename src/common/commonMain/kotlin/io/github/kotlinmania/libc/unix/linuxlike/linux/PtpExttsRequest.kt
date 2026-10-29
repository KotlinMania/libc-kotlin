package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class PtpExttsRequest(
    val index: UInt,
    val flags: UInt,
    val rsv: UIntArray,
)
