package io.github.kotlinmania.libc.unix.newlib.vita
import io.github.kotlinmania.libc.unix.newlib.InAddr

import io.github.kotlinmania.libc.*

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: UShort,
    val sinPort: UShort,
    val sinAddr: InAddr,
    val sinVport: UShort,
    val sinZero: UByteArray,
)
