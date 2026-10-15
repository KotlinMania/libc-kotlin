package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class IwPmksa(
    val cmd: UInt,
    val bssid: Sockaddr,
    val pmkid: List<UByte>,
)
