// port-lint: source unix/bsd/netbsdlike/openbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)
