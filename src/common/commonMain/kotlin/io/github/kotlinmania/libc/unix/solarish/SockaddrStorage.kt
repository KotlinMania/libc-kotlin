package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class SockaddrStorage(
    val ssFamily: UShort,
    val ssAlign: Long,
)
