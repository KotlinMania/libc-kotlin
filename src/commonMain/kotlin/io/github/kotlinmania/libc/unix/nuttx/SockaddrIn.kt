package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public data class SockaddrIn(
    val sinFamily: UShort,
    val sinPort: UShort,
    val sinAddr: InAddr,
    val sinZero: UByteArray,
)
