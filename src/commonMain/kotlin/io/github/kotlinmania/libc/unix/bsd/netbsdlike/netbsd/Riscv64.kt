// port-lint: source unix/bsd/netbsdlike/netbsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias GregT = ULong
public typealias CpuSimpleLockNvT = CUInt
public typealias GregsetT = [GregT
public typealias FregsetT = [Fpreg

public data class McontextT(
    val gregs: GregsetT,
    val fregs: FregsetT,
    val spare: List<GregT>,
)

// C union; only one variant is valid at a time.
public data class Fpreg(
    val uU64: ULong? = null,
    val uD: CDouble? = null,
)

public const val PT_GETREGS: CInt = PT_FIRSTMACH + 0
public const val PT_SETREGS: CInt = PT_FIRSTMACH + 1
public const val PT_GETFPREGS: CInt = PT_FIRSTMACH + 2
public const val PT_SETFPREGS: CInt = PT_FIRSTMACH + 3
public const val _NGREG: ULong = 32uL
public const val _NFREG: ULong = 33uL
public const val _REG_X1: CInt = 0
public const val _REG_X2: CInt = 1
public const val _REG_X3: CInt = 2
public const val _REG_X4: CInt = 3
public const val _REG_X5: CInt = 4
public const val _REG_X6: CInt = 5
public const val _REG_X7: CInt = 6
public const val _REG_X8: CInt = 7
public const val _REG_X9: CInt = 8
public const val _REG_X10: CInt = 9
public const val _REG_X11: CInt = 10
public const val _REG_X12: CInt = 11
public const val _REG_X13: CInt = 12
public const val _REG_X14: CInt = 13
public const val _REG_X15: CInt = 14
public const val _REG_X16: CInt = 15
public const val _REG_X17: CInt = 16
public const val _REG_X18: CInt = 17
public const val _REG_X19: CInt = 18
public const val _REG_X20: CInt = 19
public const val _REG_X21: CInt = 20
public const val _REG_X22: CInt = 21
public const val _REG_X23: CInt = 22
public const val _REG_X24: CInt = 23
public const val _REG_X25: CInt = 24
public const val _REG_X26: CInt = 25
public const val _REG_X27: CInt = 26
public const val _REG_X28: CInt = 27
public const val _REG_X29: CInt = 28
public const val _REG_X30: CInt = 29
public const val _REG_X31: CInt = 30
public const val _REG_PC: CInt = 31
public const val _REG_RA: CInt = _REG_X1
public const val _REG_SP: CInt = _REG_X2
public const val _REG_GP: CInt = _REG_X3
public const val _REG_TP: CInt = _REG_X4
public const val _REG_S0: CInt = _REG_X8
public const val _REG_RV: CInt = _REG_X10
public const val _REG_A0: CInt = _REG_X10
public const val _REG_F0: CInt = 0
public const val _REG_FPCSR: CInt = 32
