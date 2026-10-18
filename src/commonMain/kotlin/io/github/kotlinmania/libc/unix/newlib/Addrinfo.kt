package io.github.kotlinmania.libc.unix.newlib
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

import io.github.kotlinmania.libc.*

public data class Addrinfo(
    val aiFlags: Int,
    val aiFamily: Int,
    val aiSocktype: Int,
    val aiProtocol: Int,
    val aiAddrlen: UInt,
    val aiAddr: Sockaddr?,
    val aiCanonname: String?,
    val aiAddr2: Sockaddr?,
    val aiNext: Addrinfo?,
)
