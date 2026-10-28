// port-lint: source unix/bsd/netbsdlike/netbsd/aarch64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.StackT

public data class Fregset(
    val qregs: List<CAnonymousFreg>,
    val fpcr: UInt,
    val fpsr: UInt,
)

public data class McontextT(
    val gregs: List<ULong>,
    val fregs: Fregset,
    val spare: List<ULong>,
)

public data class UcontextT(
    val ucFlags: UInt,
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

public const val PT_GETREGS: Int = PT_FIRSTMACH + 0
public const val PT_SETREGS: Int = PT_FIRSTMACH + 1
public const val PT_GETFPREGS: Int = PT_FIRSTMACH + 2
public const val PT_SETFPREGS: Int = PT_FIRSTMACH + 3
public const val _REG_R0: Int = 0
public const val _REG_R1: Int = 1
public const val _REG_R2: Int = 2
public const val _REG_R3: Int = 3
public const val _REG_R4: Int = 4
public const val _REG_R5: Int = 5
public const val _REG_R6: Int = 6
public const val _REG_R7: Int = 7
public const val _REG_R8: Int = 8
public const val _REG_R9: Int = 9
public const val _REG_R10: Int = 10
public const val _REG_R11: Int = 11
public const val _REG_R12: Int = 12
public const val _REG_R13: Int = 13
public const val _REG_R14: Int = 14
public const val _REG_R15: Int = 15
public const val _REG_CPSR: Int = 16
public const val _REG_X0: Int = 0
public const val _REG_X1: Int = 1
public const val _REG_X2: Int = 2
public const val _REG_X3: Int = 3
public const val _REG_X4: Int = 4
public const val _REG_X5: Int = 5
public const val _REG_X6: Int = 6
public const val _REG_X7: Int = 7
public const val _REG_X8: Int = 8
public const val _REG_X9: Int = 9
public const val _REG_X10: Int = 10
public const val _REG_X11: Int = 11
public const val _REG_X12: Int = 12
public const val _REG_X13: Int = 13
public const val _REG_X14: Int = 14
public const val _REG_X15: Int = 15
public const val _REG_X16: Int = 16
public const val _REG_X17: Int = 17
public const val _REG_X18: Int = 18
public const val _REG_X19: Int = 19
public const val _REG_X20: Int = 20
public const val _REG_X21: Int = 21
public const val _REG_X22: Int = 22
public const val _REG_X23: Int = 23
public const val _REG_X24: Int = 24
public const val _REG_X25: Int = 25
public const val _REG_X26: Int = 26
public const val _REG_X27: Int = 27
public const val _REG_X28: Int = 28
public const val _REG_X29: Int = 29
public const val _REG_X30: Int = 30
public const val _REG_X31: Int = 31
public const val _REG_ELR: Int = 32
public const val _REG_SPSR: Int = 33
public const val _REG_TIPDR: Int = 34
public const val _REG_RV: Int = _REG_X0
public const val _REG_FP: Int = _REG_X29
public const val _REG_LR: Int = _REG_X30
public const val _REG_SP: Int = _REG_X31
public const val _REG_PC: Int = _REG_ELR
