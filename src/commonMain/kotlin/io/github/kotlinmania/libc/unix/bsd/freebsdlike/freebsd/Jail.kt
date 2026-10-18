package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.InAddr

public data class Jail(
    val version: UInt,
    val path: String?,
    val hostname: String?,
    val jailname: String?,
    val ip4s: UInt,
    val ip6s: UInt,
    val ip4: InAddr?,
    val ip6: In6Addr?,
)
