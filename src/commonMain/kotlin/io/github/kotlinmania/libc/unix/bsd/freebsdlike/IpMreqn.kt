// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public data class IpMreqn(
    val imrMultiaddr: InAddr,
    val imrAddress: InAddr,
    val imrIfindex: Int,
)
