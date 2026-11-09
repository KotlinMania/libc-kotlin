// port-lint: source unix/bsd/freebsdlike/freebsd/aarch64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.U128
import io.github.kotlinmania.libc.unix.SizeT

public typealias ClockT = Int

public typealias WcharT = UInt

public typealias TimeT = Long

public typealias SusecondsT = Long

public typealias RegisterT = Long

public data class Gpregs(
    public var gpX: LongArray = LongArray(30),
    public var gpLr: RegisterT = 0L,
    public var gpSp: RegisterT = 0L,
    public var gpElr: RegisterT = 0L,
    public var gpSpsr: UInt = 0u,
    public var gpPad: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Gpregs) return false
        if (!this.gpX.contentEquals(other.gpX)) return false
        if (this.gpLr != other.gpLr) return false
        if (this.gpSp != other.gpSp) return false
        if (this.gpElr != other.gpElr) return false
        if (this.gpSpsr != other.gpSpsr) return false
        if (this.gpPad != other.gpPad) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gpX.contentHashCode()
        result = 31 * result + this.gpLr.hashCode()
        result = 31 * result + this.gpSp.hashCode()
        result = 31 * result + this.gpElr.hashCode()
        result = 31 * result + this.gpSpsr.hashCode()
        result = 31 * result + this.gpPad.hashCode()
        return result
    }
}

public data class Fpregs(
    public var fpQ: U128 = U128(),
    public var fpSr: UInt = 0u,
    public var fpCr: UInt = 0u,
    public var fpFlags: CInt = 0,
    public var fpPad: CInt = 0,
)

public data class McontextT(
    public var mcGpregs: Gpregs = Gpregs(),
    public var mcFpregs: Fpregs = Fpregs(),
    public var mcFlags: CInt = 0,
    public var mcPad: CInt = 0,
    public var mcSpare: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (this.mcGpregs != other.mcGpregs) return false
        if (this.mcFpregs != other.mcFpregs) return false
        if (this.mcFlags != other.mcFlags) return false
        if (this.mcPad != other.mcPad) return false
        if (!this.mcSpare.contentEquals(other.mcSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mcGpregs.hashCode()
        result = 31 * result + this.mcFpregs.hashCode()
        result = 31 * result + this.mcFlags.hashCode()
        result = 31 * result + this.mcPad.hashCode()
        result = 31 * result + this.mcSpare.contentHashCode()
        return result
    }
}

internal val ALIGNBYTES: Int = 8 - 1

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val MAP_32BIT: CInt = 0x00080000

public val MINSIGSTKSZ: SizeT = 4096uL

// 1024 * 4
public val TIOCTIMESTAMP: CUlong = 0x40107459uL
