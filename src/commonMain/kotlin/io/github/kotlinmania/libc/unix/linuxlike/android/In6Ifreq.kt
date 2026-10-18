package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.In6Addr

public data class In6Ifreq(
    val ifr6Addr: In6Addr,
    val ifr6Prefixlen: UInt,
    val ifr6Ifindex: Int,
)
