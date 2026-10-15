// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class IpMreqSource(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
    val imrSourceaddr: InAddr,
)
