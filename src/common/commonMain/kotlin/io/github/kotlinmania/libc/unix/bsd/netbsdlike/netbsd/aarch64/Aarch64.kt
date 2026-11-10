// port-lint: source unix/bsd/netbsdlike/netbsd/aarch64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.U128
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.StackT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PT_FIRSTMACH
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SigsetT

public typealias GregT = ULong

public typealias CpuSimpleLockNvT = CUchar

public data class Fregset(
    public var qregs: List<CAnonymousFreg> = List(32) { CAnonymousFreg() },
    public var fpcr: UInt = 0u,
    public var fpsr: UInt = 0u,
)

public data class McontextT(
    public var gregs: ULongArray = ULongArray(32),
    public var fregs: Fregset = Fregset(),
    public var spare: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (!this.gregs.contentEquals(other.gregs)) return false
        if (this.fregs != other.fregs) return false
        if (!this.spare.contentEquals(other.spare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gregs.contentHashCode()
        result = 31 * result + this.fregs.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        return result
    }
}

public data class UcontextT(
    public var ucFlags: CUint = 0u,
    public var ucLink: UcontextT? = null,
    public var ucSigmask: SigsetT = SigsetT(),
    public var ucStack: StackT = StackT(),
    public var ucMcontext: McontextT = McontextT(),
)

public data class CAnonymousFreg(
    public var b8: UByteArray = UByteArray(16),
    public var h16: UShortArray = UShortArray(8),
    public var s32: UIntArray = UIntArray(4),
    public var d64: ULongArray = ULongArray(2),
    public var q128: List<U128> = List(1) { U128() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousFreg) return false
        if (!this.b8.contentEquals(other.b8)) return false
        if (!this.h16.contentEquals(other.h16)) return false
        if (!this.s32.contentEquals(other.s32)) return false
        if (!this.d64.contentEquals(other.d64)) return false
        if (this.q128 != other.q128) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.b8.contentHashCode()
        result = 31 * result + this.h16.contentHashCode()
        result = 31 * result + this.s32.contentHashCode()
        result = 31 * result + this.d64.contentHashCode()
        result = 31 * result + this.q128.hashCode()
        return result
    }

    public fun eq(other: CAnonymousFreg): Boolean {
        return this.b8.contentEquals(other.b8) || this.h16.contentEquals(other.h16) || this.s32.contentEquals(other.s32) || this.d64.contentEquals(other.d64) || this.q128 == other.q128
    }
}

internal val ALIGNBYTES: Int = 8 - 1

public val PT_GETREGS: CInt = PT_FIRSTMACH + 0

public val PT_SETREGS: CInt = PT_FIRSTMACH + 1

public val PT_GETFPREGS: CInt = PT_FIRSTMACH + 2

public val PT_SETFPREGS: CInt = PT_FIRSTMACH + 3

public val REG_R0: CInt = 0

public val REG_R1: CInt = 1

public val REG_R2: CInt = 2

public val REG_R3: CInt = 3

public val REG_R4: CInt = 4

public val REG_R5: CInt = 5

public val REG_R6: CInt = 6

public val REG_R7: CInt = 7

public val REG_R8: CInt = 8

public val REG_R9: CInt = 9

public val REG_R10: CInt = 10

public val REG_R11: CInt = 11

public val REG_R12: CInt = 12

public val REG_R13: CInt = 13

public val REG_R14: CInt = 14

public val REG_R15: CInt = 15

public val REG_CPSR: CInt = 16

public val REG_X0: CInt = 0

public val REG_X1: CInt = 1

public val REG_X2: CInt = 2

public val REG_X3: CInt = 3

public val REG_X4: CInt = 4

public val REG_X5: CInt = 5

public val REG_X6: CInt = 6

public val REG_X7: CInt = 7

public val REG_X8: CInt = 8

public val REG_X9: CInt = 9

public val REG_X10: CInt = 10

public val REG_X11: CInt = 11

public val REG_X12: CInt = 12

public val REG_X13: CInt = 13

public val REG_X14: CInt = 14

public val REG_X15: CInt = 15

public val REG_X16: CInt = 16

public val REG_X17: CInt = 17

public val REG_X18: CInt = 18

public val REG_X19: CInt = 19

public val REG_X20: CInt = 20

public val REG_X21: CInt = 21

public val REG_X22: CInt = 22

public val REG_X23: CInt = 23

public val REG_X24: CInt = 24

public val REG_X25: CInt = 25

public val REG_X26: CInt = 26

public val REG_X27: CInt = 27

public val REG_X28: CInt = 28

public val REG_X29: CInt = 29

public val REG_X30: CInt = 30

public val REG_X31: CInt = 31

public val REG_ELR: CInt = 32

public val REG_SPSR: CInt = 33

public val REG_TIPDR: CInt = 34

public val REG_RV: CInt = REG_X0

public val REG_FP: CInt = REG_X29

public val REG_LR: CInt = REG_X30

public val REG_SP: CInt = REG_X31

public val REG_PC: CInt = REG_ELR
