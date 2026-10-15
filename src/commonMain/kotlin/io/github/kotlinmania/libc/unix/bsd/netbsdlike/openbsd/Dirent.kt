package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dFileno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dType: UByte,
    val dNamlen: UByte,
    val dName: ByteArray,
)
