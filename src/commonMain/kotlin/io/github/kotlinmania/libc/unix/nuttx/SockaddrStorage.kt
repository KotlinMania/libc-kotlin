package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public data class SockaddrStorage(
    val ssFamily: UShort,
    val ssData: UIntArray,
)
