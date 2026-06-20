// port-lint: source unix/bsd/freebsdlike/freebsd/arm.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias ClockT = UInt

public typealias WcharT = UInt

public typealias TimeT = Long

public typealias SusecondsT = Int

public typealias RegisterT = Int

public typealias GregT = CUInt

// __gregset_t = [__greg_t; 17]
public typealias GregsetT = UIntArray

public data class McontextT(
    val gregs: GregsetT,
    val mcVfpSize: ULong,
    val mcVfpPtr: COpaquePointer?,
    val mcSpare: UIntArray,
) {
    init {
        require(gregs.size == 17) { "__gregs must be 17 entries" }
        require(mcSpare.size == 33) { "mc_spare must be 33 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as McontextT
        if (!gregs.contentEquals(other.gregs)) return false
        if (mcVfpSize != other.mcVfpSize) return false
        if (mcVfpPtr != other.mcVfpPtr) return false
        if (!mcSpare.contentEquals(other.mcSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = gregs.contentHashCode()
        result = 31 * result + mcVfpSize.hashCode()
        result = 31 * result + (mcVfpPtr?.hashCode() ?: 0)
        result = 31 * result + mcSpare.contentHashCode()
        return result
    }
}

// _ALIGNBYTES = size_of::<c_int>() - 1
internal const val ALIGNBYTES: Int = 3

public const val BIOCSRTIMEOUT: CULong = 0x8010426du
public const val BIOCGRTIMEOUT: CULong = 0x4010426eu
public const val MAP_32BIT: CInt = 0x00080000
public const val MINSIGSTKSZ: ULong = 4096uL
public const val TIOCTIMESTAMP: CULong = 0x40107459u
