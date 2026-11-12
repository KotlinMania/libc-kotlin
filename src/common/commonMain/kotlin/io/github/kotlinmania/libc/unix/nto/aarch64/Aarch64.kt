// port-lint: source unix/nto/aarch64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias WcharT = UInt

public typealias TimeT = Long

public data class Aarch64QregT(
    public var qlo: ULong = 0uL,
    public var qhi: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aarch64QregT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aarch64QregT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Aarch64QregT =
                    Aarch64QregT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Aarch64QregT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.qlo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.qhi)
                }
            }
    }
}

public data class Aarch64FpuRegisters(
    public var reg: List<Aarch64QregT> = List(32) { Aarch64QregT() },
    public var fpsr: UInt = 0u,
    public var fpcr: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aarch64FpuRegisters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aarch64FpuRegisters> {
                override val sizeBytes: Long = 520L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Aarch64FpuRegisters =
                    Aarch64FpuRegisters(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Aarch64QregT.typeLayout(), (32).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 512L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 516L),
                    )
                override fun writeNative(addr: Long, value: Aarch64FpuRegisters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Aarch64QregT.typeLayout(), (32).toInt())
                    ).writeNative(addr, value.reg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 512L, value.fpsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 516L, value.fpcr)
                }
            }
    }
}

public data class Aarch64CpuRegisters(
    public var gpr: ULongArray = ULongArray(32),
    public var elr: ULong = 0uL,
    public var pstate: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aarch64CpuRegisters) return false
        if (!this.gpr.contentEquals(other.gpr)) return false
        if (this.elr != other.elr) return false
        if (this.pstate != other.pstate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gpr.contentHashCode()
        result = 31 * result + this.elr.hashCode()
        result = 31 * result + this.pstate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aarch64CpuRegisters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aarch64CpuRegisters> {
                override val sizeBytes: Long = 272L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Aarch64CpuRegisters =
                    Aarch64CpuRegisters(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 264L),
                    )
                override fun writeNative(addr: Long, value: Aarch64CpuRegisters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr, value.gpr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 256L, value.elr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 264L, value.pstate)
                }
            }
    }
}

public data class McontextT(
    public var cpu: Aarch64CpuRegisters = Aarch64CpuRegisters(),
    public var fpu: Aarch64FpuRegisters = Aarch64FpuRegisters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val sizeBytes: Long = 800L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (Aarch64CpuRegisters.typeLayout()).readNative(addr),
                        (Aarch64FpuRegisters.typeLayout()).readNative(addr + 272L),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (Aarch64CpuRegisters.typeLayout()).writeNative(addr, value.cpu)
                    (Aarch64FpuRegisters.typeLayout()).writeNative(addr + 272L, value.fpu)
                }
            }
    }
}

public class StackT internal constructor(
    ssSpCtorArg: MutPtr<CVoid>,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
) {
    public var ssSp: MutPtr<CVoid> = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssSize = 0uL,
        ssFlags = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.ssSp

    public operator fun component2(): SizeT = this.ssSize

    public operator fun component3(): CInt = this.ssFlags

    public fun copy(ssSp: MutPtr<CVoid> = this.ssSp, ssSize: SizeT = this.ssSize, ssFlags: CInt = this.ssFlags): StackT = StackT(ssSpCtorArg = ssSp, ssSize = ssSize, ssFlags = ssFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackT) return false
        if (this.ssSp != other.ssSp) return false
        if (this.ssSize != other.ssSize) return false
        if (this.ssFlags != other.ssFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssSp.hashCode()
        result = 31 * result + this.ssSize.hashCode()
        result = 31 * result + this.ssFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.ssSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ssFlags)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr<CVoid> = MutPtr(0L),
            ssSize: SizeT = 0uL,
            ssFlags: CInt = 0,
        ): StackT =
            StackT(
                ssSpCtorArg = ssSp,
                ssSize = ssSize,
                ssFlags = ssFlags,
            )
    }
}
