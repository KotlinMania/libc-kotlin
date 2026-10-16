package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: UByte,
)
