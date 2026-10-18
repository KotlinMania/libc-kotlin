package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class SockaddrStorage(
    val ssFamily: UShort,
    val ssPad2: ByteArray = ByteArray(118),
    val ssAlign: ULong = 0uL,
)
