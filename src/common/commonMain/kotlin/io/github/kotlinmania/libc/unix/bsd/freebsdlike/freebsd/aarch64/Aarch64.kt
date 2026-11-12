// port-lint: source unix/bsd/freebsdlike/freebsd/aarch64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.U128
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.mem.sizeOf

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Gpregs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Gpregs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): Gpregs =
                    Gpregs(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (30).toInt())
                        ).readNative(addr).toLongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 268L),
                    )
                override fun writeNative(addr: Long, value: Gpregs) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (30).toInt())
                    ).writeNative(addr, value.gpX.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 240L, value.gpLr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 248L, value.gpSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 256L, value.gpElr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 264L, value.gpSpsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 268L, value.gpPad)
                }
            }
    }
}

public data class Fpregs(
    public var fpQ: U128 = U128(),
    public var fpSr: UInt = 0u,
    public var fpCr: UInt = 0u,
    public var fpFlags: CInt = 0,
    public var fpPad: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpregs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpregs> {
                override val alignBytes: Long = 16L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Fpregs =
                    Fpregs(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .u128Layout(::U128, { it.high }, { it.low })
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Fpregs) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .u128Layout(::U128, { it.high }, { it.low })
                    ).writeNative(addr, value.fpQ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fpSr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.fpCr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.fpFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.fpPad)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val alignBytes: Long = 16L
                override val sizeBytes: Long = 384L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (Gpregs.typeLayout()).readNative(addr),
                        (Fpregs.typeLayout()).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 304L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 308L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 312L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (Gpregs.typeLayout()).writeNative(addr, value.mcGpregs)
                    (Fpregs.typeLayout()).writeNative(addr + 272L, value.mcFpregs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 304L, value.mcFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 308L, value.mcPad)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 312L, value.mcSpare.toList())
                }
            }
    }
}

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val MAP_32BIT: CInt = 0x00080000

public val MINSIGSTKSZ: SizeT = 4096uL

// 1024 * 4
public val TIOCTIMESTAMP: CUlong = 0x40107459uL

internal val ALIGNBYTES: Int = sizeOf<CLonglong>(typeLayoutT = PrimitiveLayouts.I64) - 1
