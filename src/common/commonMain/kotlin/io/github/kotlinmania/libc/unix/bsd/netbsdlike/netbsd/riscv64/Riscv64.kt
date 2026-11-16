// port-lint: source unix/bsd/netbsdlike/netbsd/riscv64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.riscv64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PT_FIRSTMACH

public typealias GregT = ULong

public typealias CpuSimpleLockNvT = CUint

public typealias GregsetT = ULongArray

public typealias FregsetT = List<Fpreg>

public data class Fpreg(
    public var uU64: ULong = 0uL,
    public var uD: CDouble = 0.0,
) {
    public fun eq(other: Fpreg): Boolean = this.uU64 == other.uU64 || this.uD == other.uD

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.uU64).hashCode()
        }
        return state
    }
}

public data class McontextT(
    public var gregs: GregsetT = ULongArray(NGREG),
    public var fregs: FregsetT = List(NFREG) { Fpreg() },
    public var spare: ULongArray = ULongArray(7),
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

// gcc for riscv64 defines `BIGGEST_ALIGNMENT`, but it's mesured in bits.
internal val BIGGEST_ALIGNMENT_IN_BITS: Int = 128

// `_ALIGNBYTES` is measured in, well, bytes.
internal val ALIGNBYTES: Int = (BIGGEST_ALIGNMENT_IN_BITS / 8) - 1

public val PT_GETREGS: CInt = PT_FIRSTMACH + 0

public val PT_SETREGS: CInt = PT_FIRSTMACH + 1

public val PT_GETFPREGS: CInt = PT_FIRSTMACH + 2

public val PT_SETFPREGS: CInt = PT_FIRSTMACH + 3

public val NGREG: Int = 32

public val NFREG: Int = 33

public val REG_X1: CInt = 0

public val REG_X2: CInt = 1

public val REG_X3: CInt = 2

public val REG_X4: CInt = 3

public val REG_X5: CInt = 4

public val REG_X6: CInt = 5

public val REG_X7: CInt = 6

public val REG_X8: CInt = 7

public val REG_X9: CInt = 8

public val REG_X10: CInt = 9

public val REG_X11: CInt = 10

public val REG_X12: CInt = 11

public val REG_X13: CInt = 12

public val REG_X14: CInt = 13

public val REG_X15: CInt = 14

public val REG_X16: CInt = 15

public val REG_X17: CInt = 16

public val REG_X18: CInt = 17

public val REG_X19: CInt = 18

public val REG_X20: CInt = 19

public val REG_X21: CInt = 20

public val REG_X22: CInt = 21

public val REG_X23: CInt = 22

public val REG_X24: CInt = 23

public val REG_X25: CInt = 24

public val REG_X26: CInt = 25

public val REG_X27: CInt = 26

public val REG_X28: CInt = 27

public val REG_X29: CInt = 28

public val REG_X30: CInt = 29

public val REG_X31: CInt = 30

public val REG_PC: CInt = 31

public val REG_RA: CInt = REG_X1

public val REG_SP: CInt = REG_X2

public val REG_GP: CInt = REG_X3

public val REG_TP: CInt = REG_X4

public val REG_S0: CInt = REG_X8

public val REG_RV: CInt = REG_X10

public val REG_A0: CInt = REG_X10

public val REG_F0: CInt = 0

public val REG_FPCSR: CInt = 32
