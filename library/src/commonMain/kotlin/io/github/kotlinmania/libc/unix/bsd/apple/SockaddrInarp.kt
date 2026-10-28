package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class SockaddrInarp(
    val sinLen: UByte,
    val sinFamily: UByte,
    val sinPort: UShort,
    val sinAddr: InAddr,
    val sinSrcaddr: InAddr,
    val sinTos: UShort,
    val sinOther: UShort,
)
