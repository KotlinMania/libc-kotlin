@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface CAnonymousElf64AuxvUnionAFcnCallback {
    public operator fun invoke()
}

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct =
        apply {
            fields.add("$name: $value")
        }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append("$name { ${fields.joinToString(", ")} }")
        }
    }

    public fun finishNonExhaustive() {
        fields.add("..")
        finish()
    }
}

public class Reg32(
    public var rFs: UInt = 0u,
    public var rEs: UInt = 0u,
    public var rDs: UInt = 0u,
    public var rEdi: UInt = 0u,
    public var rEsi: UInt = 0u,
    public var rEbp: UInt = 0u,
    public var rIsp: UInt = 0u,
    public var rEbx: UInt = 0u,
    public var rEdx: UInt = 0u,
    public var rEcx: UInt = 0u,
    public var rEax: UInt = 0u,
    public var rTrapno: UInt = 0u,
    public var rErr: UInt = 0u,
    public var rEip: UInt = 0u,
    public var rCs: UInt = 0u,
    public var rEflags: UInt = 0u,
    public var rEsp: UInt = 0u,
    public var rSs: UInt = 0u,
    public var rGs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Reg32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Reg32> {
                override val sizeBytes: Long = 76L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Reg32 =
                    Reg32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: Reg32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rFs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rEs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.rDs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.rEdi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.rEsi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.rEbp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.rIsp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.rEbx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.rEdx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.rEcx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.rEax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.rTrapno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.rErr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.rEip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.rCs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.rEflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.rEsp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.rSs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.rGs)
                }
            }
    }
}

public class Reg(
    public var rR15: Long = 0L,
    public var rR14: Long = 0L,
    public var rR13: Long = 0L,
    public var rR12: Long = 0L,
    public var rR11: Long = 0L,
    public var rR10: Long = 0L,
    public var rR9: Long = 0L,
    public var rR8: Long = 0L,
    public var rRdi: Long = 0L,
    public var rRsi: Long = 0L,
    public var rRbp: Long = 0L,
    public var rRbx: Long = 0L,
    public var rRdx: Long = 0L,
    public var rRcx: Long = 0L,
    public var rRax: Long = 0L,
    public var rTrapno: UInt = 0u,
    public var rFs: UShort = 0u,
    public var rGs: UShort = 0u,
    public var rErr: UInt = 0u,
    public var rEs: UShort = 0u,
    public var rDs: UShort = 0u,
    public var rRip: Long = 0L,
    public var rCs: Long = 0L,
    public var rRflags: Long = 0L,
    public var rRsp: Long = 0L,
    public var rSs: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Reg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Reg> {
                override val sizeBytes: Long = 176L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Reg =
                    Reg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 126L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 134L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 168L),
                    )
                override fun writeNative(addr: Long, value: Reg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.rR15)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.rR14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.rR13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.rR12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.rR11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.rR10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.rR9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.rR8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.rRdi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.rRsi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.rRbp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.rRbx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.rRdx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.rRcx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.rRax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.rTrapno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 124L, value.rFs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 126L, value.rGs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.rErr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 132L, value.rEs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 134L, value.rDs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 136L, value.rRip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 144L, value.rCs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 152L, value.rRflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 160L, value.rRsp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 168L, value.rSs)
                }
            }
    }
}

public data class Fpreg32(
    public var fprEnv: UIntArray = UIntArray(7),
    public var fprAcc: List<UByteArray> = List(8) { UByteArray(0) },
    public var fprExSw: UInt = 0u,
    public var fprPad: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fpreg32) return false
        if (!this.fprEnv.contentEquals(other.fprEnv)) return false
        if (this.fprAcc != other.fprAcc) return false
        if (this.fprExSw != other.fprExSw) return false
        if (!this.fprPad.contentEquals(other.fprPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fprEnv.contentHashCode()
        result = 31 * result + this.fprAcc.hashCode()
        result = 31 * result + this.fprExSw.hashCode()
        result = 31 * result + this.fprPad.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpreg32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpreg32> {
                override val sizeBytes: Long = 176L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Fpreg32 =
                    Fpreg32(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (7).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (10).toInt()),
                                    (8).toInt(),
                                )
                        ).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 112L),
                    )
                override fun writeNative(addr: Long, value: Fpreg32) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (7).toInt())
                    ).writeNative(addr, value.fprEnv)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (10).toInt()),
                                (8).toInt(),
                            )
                    ).writeNative(addr + 28L, value.fprAcc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.fprExSw)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 112L, value.fprPad)
                }
            }
    }
}

public data class Fpreg(
    public var fprEnv: ULongArray = ULongArray(4),
    public var fprAcc: List<UByteArray> = List(8) { UByteArray(0) },
    public var fprXacc: List<UByteArray> = List(16) { UByteArray(0) },
    public var fprSpare: ULongArray = ULongArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fpreg) return false
        if (!this.fprEnv.contentEquals(other.fprEnv)) return false
        if (this.fprAcc != other.fprAcc) return false
        if (this.fprXacc != other.fprXacc) return false
        if (!this.fprSpare.contentEquals(other.fprSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fprEnv.contentHashCode()
        result = 31 * result + this.fprAcc.hashCode()
        result = 31 * result + this.fprXacc.hashCode()
        result = 31 * result + this.fprSpare.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpreg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpreg> {
                override val sizeBytes: Long = 512L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Fpreg =
                    Fpreg(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                    (8).toInt(),
                                )
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                    (16).toInt(),
                                )
                        ).readNative(addr + 160L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (12).toInt())
                        ).readNative(addr + 416L),
                    )
                override fun writeNative(addr: Long, value: Fpreg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr, value.fprEnv)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                (8).toInt(),
                            )
                    ).writeNative(addr + 32L, value.fprAcc)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                (16).toInt(),
                            )
                    ).writeNative(addr + 160L, value.fprXacc)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (12).toInt())
                    ).writeNative(addr + 416L, value.fprSpare)
                }
            }
    }
}

public data class Xmmreg(
    public var xmmEnv: UIntArray = UIntArray(8),
    public var xmmAcc: List<UByteArray> = List(8) { UByteArray(0) },
    public var xmmReg: List<UByteArray> = List(8) { UByteArray(0) },
    public var xmmPad: UByteArray = UByteArray(224),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xmmreg) return false
        if (!this.xmmEnv.contentEquals(other.xmmEnv)) return false
        if (this.xmmAcc != other.xmmAcc) return false
        if (this.xmmReg != other.xmmReg) return false
        if (!this.xmmPad.contentEquals(other.xmmPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.xmmEnv.contentHashCode()
        result = 31 * result + this.xmmAcc.hashCode()
        result = 31 * result + this.xmmReg.hashCode()
        result = 31 * result + this.xmmPad.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xmmreg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xmmreg> {
                override val sizeBytes: Long = 512L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Xmmreg =
                    Xmmreg(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                    (8).toInt(),
                                )
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                    (8).toInt(),
                                )
                        ).readNative(addr + 160L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (224).toInt())
                        ).readNative(addr + 288L),
                    )
                override fun writeNative(addr: Long, value: Xmmreg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                    ).writeNative(addr, value.xmmEnv)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                (8).toInt(),
                            )
                    ).writeNative(addr + 32L, value.xmmAcc)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                (8).toInt(),
                            )
                    ).writeNative(addr + 160L, value.xmmReg)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (224).toInt())
                    ).writeNative(addr + 288L, value.xmmPad)
                }
            }
    }
}

public class McontextT(
    public var mcOnstack: RegisterT = 0L,
    public var mcRdi: RegisterT = 0L,
    public var mcRsi: RegisterT = 0L,
    public var mcRdx: RegisterT = 0L,
    public var mcRcx: RegisterT = 0L,
    public var mcR8: RegisterT = 0L,
    public var mcR9: RegisterT = 0L,
    public var mcRax: RegisterT = 0L,
    public var mcRbx: RegisterT = 0L,
    public var mcRbp: RegisterT = 0L,
    public var mcR10: RegisterT = 0L,
    public var mcR11: RegisterT = 0L,
    public var mcR12: RegisterT = 0L,
    public var mcR13: RegisterT = 0L,
    public var mcR14: RegisterT = 0L,
    public var mcR15: RegisterT = 0L,
    public var mcTrapno: UInt = 0u,
    public var mcFs: UShort = 0u,
    public var mcGs: UShort = 0u,
    public var mcAddr: RegisterT = 0L,
    public var mcFlags: UInt = 0u,
    public var mcEs: UShort = 0u,
    public var mcDs: UShort = 0u,
    public var mcErr: RegisterT = 0L,
    public var mcRip: RegisterT = 0L,
    public var mcCs: RegisterT = 0L,
    public var mcRflags: RegisterT = 0L,
    public var mcRsp: RegisterT = 0L,
    public var mcSs: RegisterT = 0L,
    public var mcLen: CLong = 0L,
    public var mcFpformat: CLong = 0L,
    public var mcOwnedfp: CLong = 0L,
    public var mcFpstate: LongArray = LongArray(64),
    public var mcFsbase: RegisterT = 0L,
    public var mcGsbase: RegisterT = 0L,
    public var mcXfpustate: RegisterT = 0L,
    public var mcXfpustateLen: RegisterT = 0L,
    // freebsd < 15
    public var mcSpare: LongArray = LongArray(4),
    // freebsd >= 15
    public var mcTlsbase: RegisterT = 0L,
)

public class CAnonymousElf64AuxvUnion internal constructor(
    public var aVal: CLong,
    aPtrCtorArg: MutPtr<CVoid>,
    public var aFcn: CAnonymousElf64AuxvUnionAFcnCallback,
) {
    public var aPtr: MutPtr<CVoid> = aPtrCtorArg
        internal set

    public constructor() : this(
        aVal = 0L,
        aPtrCtorArg = MutPtr(0L),
        aFcn = CAnonymousElf64AuxvUnionAFcnCallback {},
    )

    public operator fun component1(): CLong = this.aVal

    public operator fun component2(): MutPtr<CVoid> = this.aPtr

    public operator fun component3(): CAnonymousElf64AuxvUnionAFcnCallback = this.aFcn

    public fun copy(aVal: CLong = this.aVal, aPtr: MutPtr<CVoid> = this.aPtr, aFcn: CAnonymousElf64AuxvUnionAFcnCallback = this.aFcn): CAnonymousElf64AuxvUnion = CAnonymousElf64AuxvUnion(aVal = aVal, aPtrCtorArg = aPtr, aFcn = aFcn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousElf64AuxvUnion) return false
        if (this.aVal != other.aVal) return false
        if (this.aPtr != other.aPtr) return false
        if (this.aFcn != other.aFcn) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aVal.hashCode()
        result = 31 * result + this.aPtr.hashCode()
        result = 31 * result + this.aFcn.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_elf64_auxv_union").finishNonExhaustive()
    }

    // Note(msrv): suggested method was added in 1.85
    public fun eq(other: CAnonymousElf64AuxvUnion): Boolean = this.aVal == other.aVal || ((this.aPtr).rawAddress.toULong() == (other.aPtr).rawAddress.toULong()) || this.aFcn == other.aFcn

    public companion object {
        public operator fun invoke(
            aVal: CLong = 0L,
            aPtr: MutPtr<CVoid> = MutPtr(0L),
            aFcn: CAnonymousElf64AuxvUnionAFcnCallback = CAnonymousElf64AuxvUnionAFcnCallback {},
        ): CAnonymousElf64AuxvUnion =
            CAnonymousElf64AuxvUnion(
                aVal = aVal,
                aPtrCtorArg = aPtr,
                aFcn = aFcn,
            )
    }
}

public data class Elf64Auxinfo(
    public var aType: CLong = 0L,
    public var aUn: CAnonymousElf64AuxvUnion = CAnonymousElf64AuxvUnion(),
)

public data class MaxAlignT(
    public var priv: DoubleArray = DoubleArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): MaxAlignT =
                    MaxAlignT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (4).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MaxAlignT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (4).toInt())
                    ).writeNative(addr, value.priv)
                }
            }
    }
}
