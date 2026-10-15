package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public data class Ipv6Mreq(
    val ipv6mrMultiaddr: In6Addr,
    val ipv6mrInterface: UInt,
)
