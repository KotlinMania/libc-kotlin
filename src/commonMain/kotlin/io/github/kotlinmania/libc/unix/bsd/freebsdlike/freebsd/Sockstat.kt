package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SockaddrStorage

import io.github.kotlinmania.libc.*

public data class Sockstat(
    val inpPpcb: ULong,
    val soAddr: ULong,
    val soPcb: ULong,
    val unpConn: ULong,
    val domFamily: Int,
    val proto: Int,
    val soRcvSbState: Int,
    val soSndSbState: Int,
    val saLocal: SockaddrStorage,
    val saPeer: SockaddrStorage,
    val type: Int,
    val dname: ByteArray,
    val sendq: UInt,
    val recvq: UInt,
)
