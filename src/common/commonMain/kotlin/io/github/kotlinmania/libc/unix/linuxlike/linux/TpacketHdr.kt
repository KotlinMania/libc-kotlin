package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TpacketHdr(
    val tpStatus: ULong,
    val tpLen: UInt,
    val tpSnaplen: UInt,
    val tpMac: UShort,
    val tpNet: UShort,
    val tpSec: UInt,
    val tpUsec: UInt,
)
