// port-lint: source unix/bsd/freebsdlike/freebsd/arm.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias ClockT = UInt

public typealias WcharT = UInt

public typealias TimeT = Long

public typealias SusecondsT = Int

public typealias RegisterT = Int

public typealias GregT = CUint

public typealias GregsetT = UIntArray

public class McontextT internal constructor(
    public var gregs: GregsetT,
    public var mcVfpSize: Int,
    mcVfpPtrCtorArg: MutPtr<CVoid>,
    public var mcSpare: UIntArray,
) {
    public var mcVfpPtr: MutPtr<CVoid> = mcVfpPtrCtorArg
        internal set

    public constructor() : this(
        gregs = UIntArray(17),
        mcVfpSize = 0,
        mcVfpPtrCtorArg = MutPtr(0L),
        mcSpare = UIntArray(33),
    )

    public operator fun component1(): GregsetT = this.gregs

    public operator fun component2(): Int = this.mcVfpSize

    public operator fun component3(): MutPtr<CVoid> = this.mcVfpPtr

    public operator fun component4(): UIntArray = this.mcSpare

    public fun copy(gregs: GregsetT = this.gregs, mcVfpSize: Int = this.mcVfpSize, mcVfpPtr: MutPtr<CVoid> = this.mcVfpPtr, mcSpare: UIntArray = this.mcSpare): McontextT = McontextT(gregs = gregs, mcVfpSize = mcVfpSize, mcVfpPtrCtorArg = mcVfpPtr, mcSpare = mcSpare)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (!this.gregs.contentEquals(other.gregs)) return false
        if (this.mcVfpSize != other.mcVfpSize) return false
        if (this.mcVfpPtr != other.mcVfpPtr) return false
        if (!this.mcSpare.contentEquals(other.mcSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gregs.contentHashCode()
        result = 31 * result + this.mcVfpSize.hashCode()
        result = 31 * result + this.mcVfpPtr.hashCode()
        result = 31 * result + this.mcSpare.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 224L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (17).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (33).toInt())
                        ).readNative(addr + 88L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (17).toInt())
                    ).writeNative(addr, value.gregs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 72L, value.mcVfpSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 80L, value.mcVfpPtr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (33).toInt())
                    ).writeNative(addr + 88L, value.mcSpare.toList())
                }
            }

        public operator fun invoke(
            gregs: GregsetT = UIntArray(17),
            mcVfpSize: Int = 0,
            mcVfpPtr: MutPtr<CVoid> = MutPtr(0L),
            mcSpare: UIntArray = UIntArray(33),
        ): McontextT =
            McontextT(
                gregs = gregs,
                mcVfpSize = mcVfpSize,
                mcVfpPtrCtorArg = mcVfpPtr,
                mcSpare = mcSpare,
            )
    }
}

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val MAP_32BIT: CInt = 0x00080000

public val MINSIGSTKSZ: SizeT = 4096uL

// 1024 * 4
public val TIOCTIMESTAMP: CUlong = 0x40107459uL

internal val ALIGNBYTES: Int = sizeOf<CInt>(typeLayoutT = ObjectSlotLayout<CInt>()) - 1
