package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval

public data class BpfHdr(
    val bhTstamp: Timeval,
    val bhCaplen: UInt,
    val bhDatalen: UInt,
    val bhHdrlen: UShort,
)
