package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TpacketStatsV3(
    val tpPackets: UInt,
    val tpDrops: UInt,
    val tpFreezeQCnt: UInt,
)
