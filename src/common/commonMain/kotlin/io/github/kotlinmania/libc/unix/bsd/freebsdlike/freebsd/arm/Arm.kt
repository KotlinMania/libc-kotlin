// port-lint: source unix/bsd/freebsdlike/freebsd/arm.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT

public typealias ClockT = UInt

public typealias WcharT = UInt

public typealias TimeT = Long

public typealias SusecondsT = Int

public typealias RegisterT = Int

public typealias GregT = CUint

public typealias GregsetT = UIntArray

public data class McontextT(
    public var gregs: GregsetT = UIntArray(17),
    public var mcVfpSize: Int = 0,
    public var mcVfpPtr: COpaquePointer? = null,
    public var mcSpare: UIntArray = UIntArray(33),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (this.gregs != other.gregs) return false
        if (this.mcVfpSize != other.mcVfpSize) return false
        if (this.mcVfpPtr != other.mcVfpPtr) return false
        if (!this.mcSpare.contentEquals(other.mcSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gregs.hashCode()
        result = 31 * result + this.mcVfpSize.hashCode()
        result = 31 * result + this.mcVfpPtr.hashCode()
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
