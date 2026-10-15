package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TpacketHdrVariant1(
    val tpRxhash: UInt,
    val tpVlanTci: UInt,
    val tpVlanTpid: UShort,
    val tpPadding: UShort,
)
