package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dFileno: UInt,
    val dReclen: UShort,
    val dType: UByte,
    val dNamlen: UByte,
    val dName: ByteArray,
)
