package io.github.kotlinmania.libc.unix.newlib.arm

import io.github.kotlinmania.libc.*

public data class Sockaddr(
    val saFamily: UShort,
    val saData: ByteArray,
)
