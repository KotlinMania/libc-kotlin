package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: UByte,
    val ssAlign: UInt,
)
