package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TpacketAuxdata(
    val tpStatus: UInt,
    val tpLen: UInt,
    val tpSnaplen: UInt,
    val tpMac: UShort,
    val tpNet: UShort,
    val tpVlanTci: UShort,
    val tpVlanTpid: UShort,
)
