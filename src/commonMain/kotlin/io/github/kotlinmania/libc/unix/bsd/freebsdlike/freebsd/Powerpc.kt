// port-lint: source unix/bsd/freebsdlike/freebsd/powerpc.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public typealias ClockT = UInt

public typealias WcharT = Int

public typealias TimeT = Long

public typealias SusecondsT = Int

public typealias RegisterT = Int

public data class McontextT(
    val mcVers: CInt,
    val mcFlags: CInt,
    val mcOnstack: CInt,
    val mcLen: CInt,
    val mcAvec: ULongArray,
    val mcAv: UIntArray,
    val mcFrame: IntArray,
    val mcFpreg: ULongArray,
    val mcVsxfpreg: ULongArray,
) {
    init {
        require(mcAvec.size == 64) { "mc_avec must be 64 entries" }
        require(mcAv.size == 2) { "mc_av must be 2 entries" }
        require(mcFrame.size == 42) { "mc_frame must be 42 entries" }
        require(mcFpreg.size == 33) { "mc_fpreg must be 33 entries" }
        require(mcVsxfpreg.size == 32) { "mc_vsxfpreg must be 32 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as McontextT
        return mcVers == other.mcVers && mcFlags == other.mcFlags && mcOnstack == other.mcOnstack &&
            mcLen == other.mcLen && mcAvec.contentEquals(other.mcAvec) && mcAv.contentEquals(other.mcAv) &&
            mcFrame.contentEquals(other.mcFrame) && mcFpreg.contentEquals(other.mcFpreg) &&
            mcVsxfpreg.contentEquals(other.mcVsxfpreg)
    }

    override fun hashCode(): Int {
        var result = mcVers
        result = 31 * result + mcAvec.contentHashCode()
        result = 31 * result + mcFrame.contentHashCode()
        result = 31 * result + mcFpreg.contentHashCode()
        return result
    }
}

// _ALIGNBYTES = size_of::<c_int>() - 1
internal const val ALIGNBYTES: Int = 3

public const val BIOCSRTIMEOUT: CULong = 0x8010426du
public const val BIOCGRTIMEOUT: CULong = 0x4010426eu
public const val MAP_32BIT: CInt = 0x00080000
public const val MINSIGSTKSZ: ULong = 2048uL
public const val TIOCTIMESTAMP: CULong = 0x40107459u
