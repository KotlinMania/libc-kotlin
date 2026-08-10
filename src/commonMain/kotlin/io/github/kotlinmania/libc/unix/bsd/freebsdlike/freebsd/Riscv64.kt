// port-lint: source unix/bsd/freebsdlike/freebsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*


public data class Gpregs(
    val gpRa: RegisterT,
    val gpSp: RegisterT,
    val gpGp: RegisterT,
    val gpTp: RegisterT,
    val gpT: List<RegisterT>,
    val gpS: List<RegisterT>,
    val gpA: List<RegisterT>,
    val gpSepc: RegisterT,
    val gpSstatus: RegisterT,
)

public data class Fpregs(
    val fpX: List<ULongArray>,
    val fpFcsr: ULong,
    val fpFlags: CInt,
    val pad: CInt,
)

public data class McontextT(
    val mcGpregs: Gpregs,
    val mcFpregs: Fpregs,
    val mcFlags: CInt,
    val mcPad: CInt,
    val mcSpare: ULongArray,
)

