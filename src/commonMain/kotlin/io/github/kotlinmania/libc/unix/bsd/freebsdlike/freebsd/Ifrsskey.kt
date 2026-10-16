package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Ifrsskey(
    val ifrkName: ByteArray,
    val ifrkFunc: UByte,
    val ifrkSpare0: UByte,
    val ifrkKeylen: UShort,
    val ifrkKey: UByteArray,
)
