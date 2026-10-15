package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class In6Rtmsg(
    val rtmsgDst: In6Addr,
    val rtmsgSrc: In6Addr,
    val rtmsgGateway: In6Addr,
    val rtmsgType: UInt,
    val rtmsgDstLen: UShort,
    val rtmsgSrcLen: UShort,
    val rtmsgMetric: UInt,
    val rtmsgInfo: ULong,
    val rtmsgFlags: UInt,
    val rtmsgIfindex: Int,
)
