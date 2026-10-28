package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class Addrinfo(
    val aiFlags: Int,
    val aiFamily: Int,
    val aiSocktype: Int,
    val aiProtocol: Int,
    val aiAddrlen: Int,
    val aiCanonname: String?,
    val aiAddr: Sockaddr?,
    val aiNext: Addrinfo?,
)
