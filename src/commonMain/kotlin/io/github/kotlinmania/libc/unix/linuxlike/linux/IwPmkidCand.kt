package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

import io.github.kotlinmania.libc.*

public data class IwPmkidCand(
    val flags: UInt,
    val index: UInt,
    val bssid: Sockaddr,
)
