package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public data class IwPmkidCand(
    val flags: UInt,
    val index: UInt,
    val bssid: Sockaddr,
)
