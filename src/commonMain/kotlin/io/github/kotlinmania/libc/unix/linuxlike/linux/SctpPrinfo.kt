package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SctpPrinfo(
    val prPolicy: UShort,
    val prValue: UInt,
)
