// port-lint: source unix/bsd/freebsdlike/freebsd/riscv64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.riscv64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Gpregs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Gpregs> {
                override val sizeBytes: Long = 264L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Gpregs =
                    Gpregs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (7).toInt())
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (12).toInt())
                        ).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (8).toInt())
                        ).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 256L),
                    )
                override fun writeNative(addr: Long, value: Gpregs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.gpRa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.gpSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.gpGp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.gpTp)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (7).toInt())
                    ).writeNative(addr + 32L, value.gpT)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (12).toInt())
                    ).writeNative(addr + 88L, value.gpS)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (8).toInt())
                    ).writeNative(addr + 184L, value.gpA)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 248L, value.gpSepc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 256L, value.gpSstatus)
                }
            }
    }
}

public data class Fpregs(
    public var fpX: List<ULongArray> = List(32) { ULongArray(0) },
    public var fpFcsr: ULong = 0uL,
    public var fpFlags: CInt = 0,
    public var pad: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpregs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpregs> {
                override val sizeBytes: Long = 528L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Fpregs =
                    Fpregs(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt()),
                                    (32).toInt(),
                                )
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 512L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 520L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 524L),
                    )
                override fun writeNative(addr: Long, value: Fpregs) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt()),
                                (32).toInt(),
                            )
                    ).writeNative(addr, value.fpX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 512L, value.fpFcsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 520L, value.fpFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 524L, value.pad)
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
                override val sizeBytes: Long = 864L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (Gpregs.typeLayout()).readNative(addr),
                        (Fpregs.typeLayout()).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 792L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 796L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 800L),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (Gpregs.typeLayout()).writeNative(addr, value.mcGpregs)
                    (Fpregs.typeLayout()).writeNative(addr + 264L, value.mcFpregs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 792L, value.mcFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 796L, value.mcPad)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 800L, value.mcSpare)
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

internal val ALIGNBYTES: Int = sizeOf<CLonglong>(typeLayoutT = ObjectSlotLayout<CLonglong>()) - 1
