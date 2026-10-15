// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Termios2(
    val cIflag: UInt,
    val cOflag: UInt,
    val cCflag: UInt,
    val cLflag: UInt,
    val cLine: UByte,
    val cCc: List<UByte>,
    val cIspeed: UInt,
    val cOspeed: UInt,
)
