// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Termios(
    val cIflag: ULong,
    val cOflag: ULong,
    val cCflag: ULong,
    val cLflag: ULong,
    val cCc: List<UByte>,
    val cIspeed: ULong,
    val cOspeed: ULong,
)
