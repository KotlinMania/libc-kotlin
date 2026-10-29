package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public data class Sockaddr(
    val saLen: UByte,
    val saFamily: UByte,
    val saData: ByteArray,
)
