package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class SockaddrDl(
    val sdlFamily: UShort,
    val sdlIndex: UShort,
    val sdlType: UByte,
    val sdlNlen: UByte,
    val sdlAlen: UByte,
    val sdlSlen: UByte,
    val sdlData: ByteArray,
)
