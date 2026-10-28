package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: UShort,
)
