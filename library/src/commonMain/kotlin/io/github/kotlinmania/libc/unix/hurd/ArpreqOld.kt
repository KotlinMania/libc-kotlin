package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class ArpreqOld(
    val arpPa: Sockaddr,
    val arpHa: Sockaddr,
    val arpFlags: Int,
    val arpNetmask: Sockaddr,
)
