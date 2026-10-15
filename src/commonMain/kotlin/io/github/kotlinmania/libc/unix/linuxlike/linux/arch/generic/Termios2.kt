// port-lint: source unix/linux_like/linux/arch/generic/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.arch.generic

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
