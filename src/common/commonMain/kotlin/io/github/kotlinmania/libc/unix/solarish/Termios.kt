package io.github.kotlinmania.libc.unix.solarish

public data class Termios(
    var cIflag: UInt,
    var cOflag: UInt,
    var cCflag: UInt,
    var cLflag: UInt,
    var cCc: List<UByte>,
)
