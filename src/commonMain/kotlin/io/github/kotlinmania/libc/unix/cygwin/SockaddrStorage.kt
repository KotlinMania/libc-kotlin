package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class SockaddrStorage(
    val ssFamily: UShort,
    val ssAlign: Long,
)
