package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public data class IwPmksa(
    val cmd: UInt,
    val bssid: Sockaddr,
    val pmkid: List<UByte>,
)
