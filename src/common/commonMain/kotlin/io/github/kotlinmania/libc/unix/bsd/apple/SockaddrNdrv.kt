package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class SockaddrNdrv(
    val sndLen: UByte,
    val sndFamily: UByte,
    val sndName: UByteArray,
)
