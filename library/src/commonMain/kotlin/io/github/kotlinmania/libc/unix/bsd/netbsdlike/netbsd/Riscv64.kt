// port-lint: source unix/bsd/netbsdlike/netbsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class Fpreg(
    val uU64: ULong? = null,
    val uD: Double? = null,
)

public const val _NGREG: ULong = 32uL
public const val _NFREG: ULong = 33uL
public const val _REG_RA: Int = _REG_X1
public const val _REG_GP: Int = _REG_X3
public const val _REG_TP: Int = _REG_X4
public const val _REG_S0: Int = _REG_X8
public const val _REG_A0: Int = _REG_X10
public const val _REG_F0: Int = 0
public const val _REG_FPCSR: Int = 32
