// port-lint: source unix/bsd/freebsdlike/freebsd/powerpc64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.powerpc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public typealias ClockT = UInt

public typealias WcharT = Int

public typealias TimeT = Long

public typealias SusecondsT = Long

public typealias RegisterT = Long

public data class McontextT(
    public var mcVers: CInt = 0,
    public var mcFlags: CInt = 0,
    public var mcOnstack: CInt = 0,
    public var mcLen: CInt = 0,
    public var mcAvec: ULongArray = ULongArray(64),
    public var mcAv: UIntArray = UIntArray(2),
    public var mcFrame: LongArray = LongArray(42),
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val sizeBytes: Long = 1392L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (64).toInt())
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 528L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (42).toInt())
                        ).readNative(addr + 536L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (33).toInt())
                        ).readNative(addr + 872L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr + 1136L),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mcVers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.mcFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.mcOnstack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.mcLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (64).toInt())
                    ).writeNative(addr + 16L, value.mcAvec)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 528L, value.mcAv)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (42).toInt())
                    ).writeNative(addr + 536L, value.mcFrame)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (33).toInt())
                    ).writeNative(addr + 872L, value.mcFpreg)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr + 1136L, value.mcVsxfpreg)
                }
            }
    }
}

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val MAP_32BIT: CInt = 0x00080000

public val MINSIGSTKSZ: SizeT = 2048uL

// 512 * 4
public val TIOCTIMESTAMP: CUlong = 0x40107459uL

internal val ALIGNBYTES: Int = sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>()) - 1
