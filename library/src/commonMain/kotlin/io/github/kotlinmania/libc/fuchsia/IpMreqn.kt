package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class IpMreqn(
    val imrMultiaddr: InAddr,
    val imrAddress: InAddr,
    val imrIfindex: Int,
)
