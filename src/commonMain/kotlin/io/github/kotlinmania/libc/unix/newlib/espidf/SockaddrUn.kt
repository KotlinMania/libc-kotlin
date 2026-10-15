package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*

public data class SockaddrUn(
    val sunFamily: UShort,
    val sunPath: ByteArray,
)
