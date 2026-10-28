package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dOffset: ULong,
    val dIno: ULong,
    val dReclen: UShort,
    val dNamlen: UShort,
    val dName: ByteArray,
)
