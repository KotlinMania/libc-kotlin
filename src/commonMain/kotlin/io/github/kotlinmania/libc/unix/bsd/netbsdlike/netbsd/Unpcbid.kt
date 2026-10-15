// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class Unpcbid(
    val unpPid: Int,
    val unpEuid: UInt,
    val unpEgid: UInt,
)
