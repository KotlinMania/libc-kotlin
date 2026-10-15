// port-lint: source unix/bsd/netbsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: UInt,
)
