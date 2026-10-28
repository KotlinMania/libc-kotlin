package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Ifstat(
    val ifsName: ByteArray,
    val ascii: ByteArray,
)
