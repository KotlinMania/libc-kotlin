// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: UInt,
)
