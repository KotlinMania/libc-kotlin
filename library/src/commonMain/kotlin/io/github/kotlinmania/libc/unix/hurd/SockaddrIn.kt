package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: UByte,
    val sinPort: UShort,
    val sinAddr: InAddr,
    val sinZero: UByteArray,
)
