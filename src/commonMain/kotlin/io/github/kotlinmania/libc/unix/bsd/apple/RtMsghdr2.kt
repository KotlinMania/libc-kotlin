package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class RtMsghdr2(
    val rtmMsglen: UShort,
    val rtmVersion: UByte,
    val rtmType: UByte,
    val rtmIndex: UShort,
    val rtmFlags: Int,
    val rtmAddrs: Int,
    val rtmRefcnt: Int,
    val rtmParentflags: Int,
    val rtmReserved: Int,
    val rtmUse: Int,
    val rtmInits: UInt,
    val rtmRmx: RtMetrics,
)
