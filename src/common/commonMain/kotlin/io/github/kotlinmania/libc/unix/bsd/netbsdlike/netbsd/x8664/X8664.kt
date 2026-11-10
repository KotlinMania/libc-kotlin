// port-lint: source unix/bsd/netbsdlike/netbsd/x86_64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.StackT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PT_FIRSTMACH
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SigsetT

public typealias CGregT = ULong

public typealias CpuSimpleLockNvT = CUchar

// Note(alignment): Type is `__aligned(8)`
public typealias FpregsetT = UByteArray

public data class McontextT(
    public var gregs: ULongArray = ULongArray(26),
    public var mcTlsbase: CGregT = 0uL,
    public var fpregs: FpregsetT = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (!this.gregs.contentEquals(other.gregs)) return false
        if (this.mcTlsbase != other.mcTlsbase) return false
        if (!this.fpregs.contentEquals(other.fpregs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gregs.contentHashCode()
        result = 31 * result + this.mcTlsbase.hashCode()
        result = 31 * result + this.fpregs.contentHashCode()
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

public val PT_STEP: CInt = PT_FIRSTMACH + 0

public val PT_GETREGS: CInt = PT_FIRSTMACH + 1

public val PT_SETREGS: CInt = PT_FIRSTMACH + 2

public val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3

public val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4

public val REG_RDI: CInt = 0

public val REG_RSI: CInt = 1

public val REG_RDX: CInt = 2

public val REG_RCX: CInt = 3

public val REG_R8: CInt = 4

public val REG_R9: CInt = 5

public val REG_R10: CInt = 6

public val REG_R11: CInt = 7

public val REG_R12: CInt = 8

public val REG_R13: CInt = 9

public val REG_R14: CInt = 10

public val REG_R15: CInt = 11

public val REG_RBP: CInt = 12

public val REG_RBX: CInt = 13

public val REG_RAX: CInt = 14

public val REG_GS: CInt = 15

public val REG_FS: CInt = 16

public val REG_ES: CInt = 17

public val REG_DS: CInt = 18

public val REG_TRAPNO: CInt = 19

public val REG_ERR: CInt = 20

public val REG_RIP: CInt = 21

public val REG_CS: CInt = 22

public val REG_RFLAGS: CInt = 23

public val REG_RSP: CInt = 24

public val REG_SS: CInt = 25

internal val ALIGNBYTES: Int = 8 - 1
