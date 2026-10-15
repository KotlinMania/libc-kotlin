package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class SockaddrDl(
    val sdlLen: UByte,
    val sdlFamily: UByte,
    val sdlEType: UShort,
    val sdlIndex: UInt,
    val sdlType: UByte,
    val sdlNlen: UByte,
    val sdlAlen: UByte,
    val sdlSlen: UByte,
    val sdlData: UByteArray,
)
