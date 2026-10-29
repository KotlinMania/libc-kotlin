package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class BpfInsn(
    val code: UShort,
    val jt: UByte,
    val jf: UByte,
    val k: UInt,
)
