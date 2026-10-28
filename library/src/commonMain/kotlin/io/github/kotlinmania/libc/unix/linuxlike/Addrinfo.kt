package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.COpaquePointer

public data class Addrinfo(
    var aiFlags: Int = 0,
    var aiFamily: Int = 0,
    var aiSocktype: Int = 0,
    var aiProtocol: Int = 0,
    var aiAddrlen: UInt = 0u,
    var aiAddr: COpaquePointer? = null,
    var aiCanonname: String? = null,
    var aiNext: Addrinfo? = null,
    var aiSockaddr: Sockaddr? = null,
)
