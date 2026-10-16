package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dIno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dName: ByteArray,
)
