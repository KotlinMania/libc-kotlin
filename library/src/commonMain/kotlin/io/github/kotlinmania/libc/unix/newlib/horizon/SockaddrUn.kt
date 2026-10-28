package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*

public data class SockaddrUn(
    val sunLen: UByte,
    val sunFamily: UShort,
    val sunPath: ByteArray,
)
