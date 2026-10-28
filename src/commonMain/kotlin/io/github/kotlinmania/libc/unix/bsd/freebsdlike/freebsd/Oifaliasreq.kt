package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.Sockaddr

public data class Oifaliasreq(
    val ifraName: ByteArray,
    val ifraAddr: Sockaddr,
    val ifraBroadaddr: Sockaddr,
    val ifraMask: Sockaddr,
)
