package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class SockaddrDl(
    val sdlLen: UByte,
    val sdlFamily: UByte,
    val sdlIndex: UShort,
    val sdlType: UByte,
    val sdlNlen: UByte,
    val sdlAlen: UByte,
    val sdlSlen: UByte,
    val sdlData: ByteArray,
)
