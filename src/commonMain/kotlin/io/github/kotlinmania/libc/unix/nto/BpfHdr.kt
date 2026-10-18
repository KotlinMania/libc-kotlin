package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class BpfHdr(
    val bhTstamp: Timeval,
    val bhCaplen: UInt,
    val bhDatalen: UInt,
    val bhHdrlen: UShort,
)
