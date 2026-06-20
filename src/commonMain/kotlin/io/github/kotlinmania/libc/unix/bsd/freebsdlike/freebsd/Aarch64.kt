// port-lint: source unix/bsd/freebsdlike/freebsd/aarch64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public typealias ClockT = Int

public typealias WcharT = UInt

public typealias TimeT = Long

public typealias SusecondsT = Long

public typealias RegisterT = Long

public data class Gpregs(
    val gpX: LongArray,
    val gpLr: RegisterT,
    val gpSp: RegisterT,
    val gpElr: RegisterT,
    val gpSpsr: UInt,
    val gpPad: CInt,
) {
    init {
        require(gpX.size == 30) { "gp_x must be 30 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Gpregs
        if (!gpX.contentEquals(other.gpX)) return false
        if (gpLr != other.gpLr) return false
        if (gpSp != other.gpSp) return false
        if (gpElr != other.gpElr) return false
        if (gpSpsr != other.gpSpsr) return false
        if (gpPad != other.gpPad) return false
        return true
    }

    override fun hashCode(): Int {
        var result = gpX.contentHashCode()
        result = 31 * result + gpLr.hashCode()
        result = 31 * result + gpSp.hashCode()
        result = 31 * result + gpElr.hashCode()
        result = 31 * result + gpSpsr.hashCode()
        result = 31 * result + gpPad
        return result
    }
}

// fp_q is `u128`; Kotlin has no 128-bit integer, represented as 16 raw bytes.
public data class Fpregs(
    val fpQ: ByteArray,
    val fpSr: UInt,
    val fpCr: UInt,
    val fpFlags: CInt,
    val fpPad: CInt,
) {
    init {
        require(fpQ.size == 16) { "fp_q must be 16 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Fpregs
        if (!fpQ.contentEquals(other.fpQ)) return false
        if (fpSr != other.fpSr) return false
        if (fpCr != other.fpCr) return false
        if (fpFlags != other.fpFlags) return false
        if (fpPad != other.fpPad) return false
        return true
    }

    override fun hashCode(): Int {
        var result = fpQ.contentHashCode()
        result = 31 * result + fpSr.hashCode()
        result = 31 * result + fpCr.hashCode()
        result = 31 * result + fpFlags
        result = 31 * result + fpPad
        return result
    }
}

public data class McontextT(
    val mcGpregs: Gpregs,
    val mcFpregs: Fpregs,
    val mcFlags: CInt,
    val mcPad: CInt,
    val mcSpare: ULongArray,
) {
    init {
        require(mcSpare.size == 8) { "mc_spare must be 8 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as McontextT
        if (mcGpregs != other.mcGpregs) return false
        if (mcFpregs != other.mcFpregs) return false
        if (mcFlags != other.mcFlags) return false
        if (mcPad != other.mcPad) return false
        if (!mcSpare.contentEquals(other.mcSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = mcGpregs.hashCode()
        result = 31 * result + mcFpregs.hashCode()
        result = 31 * result + mcFlags
        result = 31 * result + mcPad
        result = 31 * result + mcSpare.contentHashCode()
        return result
    }
}

// _ALIGNBYTES = size_of::<c_longlong>() - 1
internal const val ALIGNBYTES: Int = 7

public const val BIOCSRTIMEOUT: CULong = 0x8010426du
public const val BIOCGRTIMEOUT: CULong = 0x4010426eu
public const val MAP_32BIT: CInt = 0x00080000
public const val MINSIGSTKSZ: ULong = 4096uL
public const val TIOCTIMESTAMP: CULong = 0x40107459u
