// port-lint: source unix/bsd/freebsdlike/freebsd/riscv64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.riscv64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT

public typealias ClockT = Int

public typealias WcharT = CInt

public typealias TimeT = Long

public typealias SusecondsT = CLong

public typealias RegisterT = Long

public data class Gpregs(
    public var gpRa: RegisterT = 0L,
    public var gpSp: RegisterT = 0L,
    public var gpGp: RegisterT = 0L,
    public var gpTp: RegisterT = 0L,
    public var gpT: LongArray = LongArray(7),
    public var gpS: LongArray = LongArray(12),
    public var gpA: LongArray = LongArray(8),
    public var gpSepc: RegisterT = 0L,
    public var gpSstatus: RegisterT = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Gpregs) return false
        if (this.gpRa != other.gpRa) return false
        if (this.gpSp != other.gpSp) return false
        if (this.gpGp != other.gpGp) return false
        if (this.gpTp != other.gpTp) return false
        if (!this.gpT.contentEquals(other.gpT)) return false
        if (!this.gpS.contentEquals(other.gpS)) return false
        if (!this.gpA.contentEquals(other.gpA)) return false
        if (this.gpSepc != other.gpSepc) return false
        if (this.gpSstatus != other.gpSstatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gpRa.hashCode()
        result = 31 * result + this.gpSp.hashCode()
        result = 31 * result + this.gpGp.hashCode()
        result = 31 * result + this.gpTp.hashCode()
        result = 31 * result + this.gpT.contentHashCode()
        result = 31 * result + this.gpS.contentHashCode()
        result = 31 * result + this.gpA.contentHashCode()
        result = 31 * result + this.gpSepc.hashCode()
        result = 31 * result + this.gpSstatus.hashCode()
        return result
    }
}

public data class Fpregs(
    public var fpX: List<ULongArray> = List(32) { ULongArray(0) },
    public var fpFcsr: ULong = 0uL,
    public var fpFlags: CInt = 0,
    public var pad: CInt = 0,
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

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val MAP_32BIT: CInt = 0x00080000

public val MINSIGSTKSZ: SizeT = 4096uL

// 1024 * 4
public val TIOCTIMESTAMP: CUlong = 0x40107459uL

internal val ALIGNBYTES: Int = 8 - 1
