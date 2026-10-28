package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Ifrsshash(
    val ifrhName: ByteArray,
    val ifrhFunc: UByte,
    val ifrhSpare0: UByte,
    val ifrhSpare1: UShort,
    val ifrhTypes: UInt,
)
