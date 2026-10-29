package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public data class Termios(
    val cIflag: UShort,
    val cOflag: UShort,
    val cCflag: UShort,
    val cLflag: UShort,
    val cLine: UByte,
    val cCc: List<UByte>,
    val cIspeed: UInt,
    val cOspeed: UInt,
)
