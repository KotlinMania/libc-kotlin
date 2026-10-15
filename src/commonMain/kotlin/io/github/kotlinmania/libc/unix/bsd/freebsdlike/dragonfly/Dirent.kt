package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dFileno: ULong,
    val dNamlen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)
