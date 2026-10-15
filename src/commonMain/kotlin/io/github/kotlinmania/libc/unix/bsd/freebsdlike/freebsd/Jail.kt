// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

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
