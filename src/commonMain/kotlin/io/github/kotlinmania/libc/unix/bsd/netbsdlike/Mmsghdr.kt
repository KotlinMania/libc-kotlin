// port-lint: source unix/bsd/netbsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: UInt,
)
