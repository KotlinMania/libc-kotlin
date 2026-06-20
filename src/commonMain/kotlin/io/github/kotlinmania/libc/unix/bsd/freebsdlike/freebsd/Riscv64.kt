// port-lint: source unix/bsd/freebsdlike/freebsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public typealias ClockT = Int

public typealias WcharT = CInt

public typealias TimeT = Long

public typealias SusecondsT = CLong

public typealias RegisterT = Long

public data class Gpregs(
    val gpRa: RegisterT,
    val gpSp: RegisterT,
    val gpGp: RegisterT,
    val gpTp: RegisterT,
    val gpT: LongArray,
    val gpS: LongArray,
    val gpA: LongArray,
    val gpSepc: RegisterT,
    val gpSstatus: RegisterT,
) {
    init {
        require(gpT.size == 7) { "gp_t must be 7 entries" }
        require(gpS.size == 12) { "gp_s must be 12 entries" }
        require(gpA.size == 8) { "gp_a must be 8 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Gpregs
        return gpRa == other.gpRa && gpSp == other.gpSp && gpGp == other.gpGp && gpTp == other.gpTp &&
            gpT.contentEquals(other.gpT) && gpS.contentEquals(other.gpS) && gpA.contentEquals(other.gpA) &&
            gpSepc == other.gpSepc && gpSstatus == other.gpSstatus
    }

    override fun hashCode(): Int {
        var result = gpRa.hashCode()
        result = 31 * result + gpT.contentHashCode()
        result = 31 * result + gpS.contentHashCode()
        result = 31 * result + gpA.contentHashCode()
        return result
    }
}

// fp_x is `[[u64; 2]; 32]`, flattened to a 64-entry ULongArray.
public data class Fpregs(
    val fpX: ULongArray,
    val fpFcsr: ULong,
    val fpFlags: CInt,
    val pad: CInt,
) {
    init {
        require(fpX.size == 64) { "fp_x must be 64 entries (32 x 2)" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Fpregs
        if (!fpX.contentEquals(other.fpX)) return false
        if (fpFcsr != other.fpFcsr) return false
        if (fpFlags != other.fpFlags) return false
        if (pad != other.pad) return false
        return true
    }

    override fun hashCode(): Int {
        var result = fpX.contentHashCode()
        result = 31 * result + fpFcsr.hashCode()
        result = 31 * result + fpFlags
        result = 31 * result + pad
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
