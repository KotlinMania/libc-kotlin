// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Sctphdr(
    val srcPort: UShort,
    val destPort: UShort,
    val vTag: UInt,
    val checksum: UInt,
)
