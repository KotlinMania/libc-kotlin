package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Nlist(
    val nName: String?,
    val nType: UByte,
    val nOther: Byte,
    val nDesc: Short,
    val nValue: ULong,
)
