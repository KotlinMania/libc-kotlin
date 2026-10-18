package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public data class SockaddrStorage(
    val ssFamily: UShort,
    val ssAlign: ULong,
)
