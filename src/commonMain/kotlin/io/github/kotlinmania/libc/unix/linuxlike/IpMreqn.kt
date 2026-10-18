package io.github.kotlinmania.libc.unix.linuxlike

public data class IpMreqn(
    val imrMultiaddr: InAddr,
    val imrAddress: InAddr,
    val imrIfindex: Int,
)
