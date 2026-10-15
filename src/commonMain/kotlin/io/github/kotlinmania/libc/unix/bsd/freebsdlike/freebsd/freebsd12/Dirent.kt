package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dFileno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dType: UByte,
    val dNamlen: UShort,
    val dName: ByteArray,
)
