package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)
