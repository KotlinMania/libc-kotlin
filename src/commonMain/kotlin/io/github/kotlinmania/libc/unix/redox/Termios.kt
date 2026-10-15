// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public data class Termios(
    val cIflag: UInt,
    val cOflag: UInt,
    val cCflag: UInt,
    val cLflag: UInt,
    val cLine: UByte,
    val cCc: List<UByte>,
    val cIspeed: UInt,
    val cOspeed: UInt,
)
