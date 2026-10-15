package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips64

import io.github.kotlinmania.libc.*

public data class Termios(
    val cIflag: UInt,
    val cOflag: UInt,
    val cCflag: UInt,
    val cLflag: UInt,
    val cLine: UByte,
    val cCc: List<UByte>,
)
