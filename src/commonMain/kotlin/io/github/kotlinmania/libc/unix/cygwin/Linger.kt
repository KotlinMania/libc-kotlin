package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class Linger(
    val lOnoff: UShort,
    val lLinger: UShort,
)
