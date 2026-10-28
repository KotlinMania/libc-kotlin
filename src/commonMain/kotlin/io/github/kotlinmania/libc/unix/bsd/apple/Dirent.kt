package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dIno: ULong,
    val dSeekoff: ULong,
    val dReclen: UShort,
    val dNamlen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)
