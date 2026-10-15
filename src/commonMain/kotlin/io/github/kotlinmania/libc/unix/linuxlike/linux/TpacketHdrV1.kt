package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TpacketHdrV1(
    val blockStatus: UInt,
    val numPkts: UInt,
    val offsetToFirstPkt: UInt,
    val blkLen: UInt,
    val seqNum: ULong,
    val tsFirstPkt: TpacketBdTs,
    val tsLastPkt: TpacketBdTs,
)
