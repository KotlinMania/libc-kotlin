package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public data class BpfInsn(
    val code: UShort,
    val jt: UByte,
    val jf: UByte,
    val k: UInt,
)
