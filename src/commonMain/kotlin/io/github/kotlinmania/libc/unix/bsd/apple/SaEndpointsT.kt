package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.unix.bsd.Sockaddr

import io.github.kotlinmania.libc.*

public data class SaEndpointsT(
    val saeSrcif: UInt,
    val saeSrcaddr: Sockaddr?,
    val saeSrcaddrlen: UInt,
    val saeDstaddr: Sockaddr?,
    val saeDstaddrlen: UInt,
)
