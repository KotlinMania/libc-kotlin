package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public data class Termios(
    val cIflag: UInt,
    val cOflag: UInt,
    val cCflag: UInt,
    val cLflag: UInt,
    val cCc: List<UByte>,
    val cIspeed: Int,
    val cOspeed: Int,
)
