package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Elf64Sym(
    val stName: UInt,
    val stInfo: UByte,
    val stOther: UByte,
    val stShndx: UShort,
    val stValue: ULong,
    val stSize: ULong,
)
