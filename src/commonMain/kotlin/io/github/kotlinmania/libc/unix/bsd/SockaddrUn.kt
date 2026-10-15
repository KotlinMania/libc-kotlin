package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public data class SockaddrUn(
    val sunLen: UByte,
    val sunFamily: UByte,
    val sunPath: ByteArray,
)
