// port-lint: source unix/bsd/netbsdlike/netbsd/aarch64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public typealias GregT = ULong
public typealias CpuSimpleLockNvT = CUChar

public data class Fregset(
    val qregs: List<CAnonymousFreg>,
    val fpcr: UInt,
    val fpsr: UInt,
)

public data class McontextT(
    val gregs: List<GregT>,
    val fregs: Fregset,
    val spare: List<GregT>,
)

public data class UcontextT(
    val ucFlags: CUInt,
    val ucLink: UcontextT?,
    val ucSigmask: SigsetT,
    val ucStack: StackT,
    val ucMcontext: McontextT,
)

// C union; only one variant is valid at a time.
public data class CAnonymousFreg(
    val b8: UByteArray? = null,
    val h16: UShortArray? = null,
    val s32: UIntArray? = null,
    val d64: ULongArray? = null,
    val q128: List<ByteArray>? = null,
)

public const val PT_GETREGS: CInt = PT_FIRSTMACH + 0
public const val PT_SETREGS: CInt = PT_FIRSTMACH + 1
public const val PT_GETFPREGS: CInt = PT_FIRSTMACH + 2
public const val PT_SETFPREGS: CInt = PT_FIRSTMACH + 3
public const val _REG_R0: CInt = 0
public const val _REG_R1: CInt = 1
public const val _REG_R2: CInt = 2
public const val _REG_R3: CInt = 3
public const val _REG_R4: CInt = 4
public const val _REG_R5: CInt = 5
public const val _REG_R6: CInt = 6
public const val _REG_R7: CInt = 7
public const val _REG_R8: CInt = 8
public const val _REG_R9: CInt = 9
public const val _REG_R10: CInt = 10
public const val _REG_R11: CInt = 11
public const val _REG_R12: CInt = 12
public const val _REG_R13: CInt = 13
public const val _REG_R14: CInt = 14
public const val _REG_R15: CInt = 15
public const val _REG_CPSR: CInt = 16
public const val _REG_X0: CInt = 0
public const val _REG_X1: CInt = 1
public const val _REG_X2: CInt = 2
public const val _REG_X3: CInt = 3
public const val _REG_X4: CInt = 4
public const val _REG_X5: CInt = 5
public const val _REG_X6: CInt = 6
public const val _REG_X7: CInt = 7
public const val _REG_X8: CInt = 8
public const val _REG_X9: CInt = 9
public const val _REG_X10: CInt = 10
public const val _REG_X11: CInt = 11
public const val _REG_X12: CInt = 12
public const val _REG_X13: CInt = 13
public const val _REG_X14: CInt = 14
public const val _REG_X15: CInt = 15
public const val _REG_X16: CInt = 16
public const val _REG_X17: CInt = 17
public const val _REG_X18: CInt = 18
public const val _REG_X19: CInt = 19
public const val _REG_X20: CInt = 20
public const val _REG_X21: CInt = 21
public const val _REG_X22: CInt = 22
public const val _REG_X23: CInt = 23
public const val _REG_X24: CInt = 24
public const val _REG_X25: CInt = 25
public const val _REG_X26: CInt = 26
public const val _REG_X27: CInt = 27
public const val _REG_X28: CInt = 28
public const val _REG_X29: CInt = 29
public const val _REG_X30: CInt = 30
public const val _REG_X31: CInt = 31
public const val _REG_ELR: CInt = 32
public const val _REG_SPSR: CInt = 33
public const val _REG_TIPDR: CInt = 34
public const val _REG_RV: CInt = _REG_X0
public const val _REG_FP: CInt = _REG_X29
public const val _REG_LR: CInt = _REG_X30
public const val _REG_SP: CInt = _REG_X31
public const val _REG_PC: CInt = _REG_ELR
