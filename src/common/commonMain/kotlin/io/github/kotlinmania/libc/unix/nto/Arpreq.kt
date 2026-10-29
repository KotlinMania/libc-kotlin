package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Arpreq(
    val arpPa: Sockaddr,
    val arpHa: Sockaddr,
    val arpFlags: Int,
)
