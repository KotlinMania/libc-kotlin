// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: UInt,
)
