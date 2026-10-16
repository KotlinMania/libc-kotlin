package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public data class Sockaddr(
    val saFamily: UShort,
    val saData: UByteArray,
)
