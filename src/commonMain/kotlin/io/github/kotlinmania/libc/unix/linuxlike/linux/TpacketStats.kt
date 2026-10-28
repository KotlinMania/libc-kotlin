package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TpacketStats(
    val tpPackets: UInt,
    val tpDrops: UInt,
)
