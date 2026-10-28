package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x8664

import io.github.kotlinmania.libc.*

public data class Reg(
    val rR15: Long,
    val rR14: Long,
    val rR13: Long,
    val rR12: Long,
    val rR11: Long,
    val rR10: Long,
    val rR9: Long,
    val rR8: Long,
    val rRdi: Long,
    val rRsi: Long,
    val rRbp: Long,
    val rRbx: Long,
    val rRdx: Long,
    val rRcx: Long,
    val rRax: Long,
    val rTrapno: UInt,
    val rFs: UShort,
    val rGs: UShort,
    val rErr: UInt,
    val rEs: UShort,
    val rDs: UShort,
    val rRip: Long,
    val rCs: Long,
    val rRflags: Long,
    val rRsp: Long,
    val rSs: Long,
)
