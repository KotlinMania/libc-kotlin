package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Termios(
    val cIflag: UInt,
    val cOflag: UInt,
    val cCflag: UInt,
    val cLflag: UInt,
    val cCc: List<UByte>,
    val ispeed: Int,
    val ospeed: Int,
)
