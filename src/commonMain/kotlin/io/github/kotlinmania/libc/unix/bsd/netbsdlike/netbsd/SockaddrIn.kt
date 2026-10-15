package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: UShort,
    val sinPort: UShort,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)
