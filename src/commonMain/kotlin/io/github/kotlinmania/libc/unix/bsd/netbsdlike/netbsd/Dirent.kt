package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dFileno: ULong,
    val dReclen: UShort,
    val dNamlen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)
