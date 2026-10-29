package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dIno: ULong,
    val dName: ByteArray,
    val dType: UByte,
)
