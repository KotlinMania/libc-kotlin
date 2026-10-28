package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)
