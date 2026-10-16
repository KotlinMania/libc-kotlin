package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class In6Ifreq(
    val ifr6Addr: In6Addr,
    val ifr6Prefixlen: UInt,
    val ifr6Ifindex: Int,
)
