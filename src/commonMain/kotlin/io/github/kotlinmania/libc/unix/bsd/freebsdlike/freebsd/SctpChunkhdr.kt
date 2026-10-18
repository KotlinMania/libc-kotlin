package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpChunkhdr(
    val chunkType: UByte,
    val chunkFlags: UByte,
    val chunkLength: UShort,
)
