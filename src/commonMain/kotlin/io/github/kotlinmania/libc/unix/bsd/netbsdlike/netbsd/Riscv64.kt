// port-lint: source unix/bsd/netbsdlike/netbsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public typealias GregsetT = LongArray
public typealias FregsetT = List<Fpreg>

    val gregs: GregsetT,
    val fregs: FregsetT,
    val spare: List<GregT>,
)

// C union; only one variant is valid at a time.
public data class Fpreg(
    val uU64: ULong? = null,
    val uD: CDouble? = null,
)

public const val _NGREG: ULong = 32uL
public const val _NFREG: ULong = 33uL
public const val _REG_RA: CInt = _REG_X1
public const val _REG_GP: CInt = _REG_X3
public const val _REG_TP: CInt = _REG_X4
public const val _REG_S0: CInt = _REG_X8
public const val _REG_A0: CInt = _REG_X10
public const val _REG_F0: CInt = 0
public const val _REG_FPCSR: CInt = 32
