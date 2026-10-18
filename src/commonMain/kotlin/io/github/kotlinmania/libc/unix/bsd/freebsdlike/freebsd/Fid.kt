package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Fid(
    val fidLen: UShort,
    val fidData0: UShort,
    val fidData: ByteArray,
)
