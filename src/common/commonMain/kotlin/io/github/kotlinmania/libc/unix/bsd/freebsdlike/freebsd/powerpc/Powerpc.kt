// port-lint: source unix/bsd/freebsdlike/freebsd/powerpc.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.powerpc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT

public typealias ClockT = UInt

public typealias WcharT = Int

public typealias TimeT = Long

public typealias SusecondsT = Int

public typealias RegisterT = Int

public data class McontextT(
    public var mcVers: CInt = 0,
    public var mcFlags: CInt = 0,
    public var mcOnstack: CInt = 0,
    public var mcLen: CInt = 0,
    public var mcAvec: ULongArray = ULongArray(64),
    public var mcAv: UIntArray = UIntArray(2),
    public var mcFrame: IntArray = IntArray(42),
    public var mcFpreg: ULongArray = ULongArray(33),
    public var mcVsxfpreg: ULongArray = ULongArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (this.mcVers != other.mcVers) return false
        if (this.mcFlags != other.mcFlags) return false
        if (this.mcOnstack != other.mcOnstack) return false
        if (this.mcLen != other.mcLen) return false
        if (!this.mcAvec.contentEquals(other.mcAvec)) return false
        if (!this.mcAv.contentEquals(other.mcAv)) return false
        if (!this.mcFrame.contentEquals(other.mcFrame)) return false
        if (!this.mcFpreg.contentEquals(other.mcFpreg)) return false
        if (!this.mcVsxfpreg.contentEquals(other.mcVsxfpreg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mcVers.hashCode()
        result = 31 * result + this.mcFlags.hashCode()
        result = 31 * result + this.mcOnstack.hashCode()
        result = 31 * result + this.mcLen.hashCode()
        result = 31 * result + this.mcAvec.contentHashCode()
        result = 31 * result + this.mcAv.contentHashCode()
        result = 31 * result + this.mcFrame.contentHashCode()
        result = 31 * result + this.mcFpreg.contentHashCode()
        result = 31 * result + this.mcVsxfpreg.contentHashCode()
        return result
    }
}

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val MAP_32BIT: CInt = 0x00080000

public val MINSIGSTKSZ: SizeT = 2048uL

// 512 * 4
public val TIOCTIMESTAMP: CUlong = 0x40107459uL

internal val ALIGNBYTES: Int = 8 - 1
