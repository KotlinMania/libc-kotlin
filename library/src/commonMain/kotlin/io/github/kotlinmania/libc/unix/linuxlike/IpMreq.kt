package io.github.kotlinmania.libc.unix.linuxlike

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)
