// port-lint: source unix/bsd/freebsdlike/freebsd/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x8664

import io.github.kotlinmania.libc.*

public data class Reg32(
    val rFs: UInt,
    val rEs: UInt,
    val rDs: UInt,
    val rEdi: UInt,
    val rEsi: UInt,
    val rEbp: UInt,
    val rIsp: UInt,
    val rEbx: UInt,
    val rEdx: UInt,
    val rEcx: UInt,
    val rEax: UInt,
    val rTrapno: UInt,
    val rErr: UInt,
    val rEip: UInt,
    val rCs: UInt,
    val rEflags: UInt,
    val rEsp: UInt,
    val rSs: UInt,
    val rGs: UInt,
)
