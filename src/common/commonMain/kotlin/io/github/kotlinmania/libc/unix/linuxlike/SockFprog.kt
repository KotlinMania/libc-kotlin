package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class SockFprog(
    val len: UShort,
    val filter: SockFilter?,
)
