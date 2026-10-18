package io.github.kotlinmania.libc.unix.linuxlike

public data class Sockaddr(
    val saFamily: UShort,
    val saData: ByteArray,
)
