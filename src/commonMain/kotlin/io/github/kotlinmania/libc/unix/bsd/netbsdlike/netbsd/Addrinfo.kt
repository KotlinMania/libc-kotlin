// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class Addrinfo(
    val aiFlags: Int,
    val aiFamily: Int,
    val aiSocktype: Int,
    val aiProtocol: Int,
    val aiAddrlen: UInt,
    val aiCanonname: String?,
    val aiAddr: Sockaddr?,
    val aiNext: Addrinfo?,
)
