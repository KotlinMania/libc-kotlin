package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.*

public data class BpfHdr(
    val bhTstamp: Timeval32,
    val bhCaplen: UInt,
    val bhDatalen: UInt,
    val bhHdrlen: UShort,
)
