package io.github.kotlinmania.libc.unix.newlib.arm
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.newlib.InAddr

public data class SockaddrIn(
    val sinFamily: UShort,
    val sinPort: UShort,
    val sinAddr: InAddr,
    val sinZero: UByteArray,
)
