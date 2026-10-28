package io.github.kotlinmania.libc.unix.linuxlike

public data class IpMreqSource(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
    val imrSourceaddr: InAddr,
)
