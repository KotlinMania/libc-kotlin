// port-lint: source unix/nto/x86_64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias WcharT = UInt

public typealias TimeT = Long

public class X8664CpuRegisters(
    public var rdi: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var r10: ULong = 0uL,
    public var r8: ULong = 0uL,
    public var r9: ULong = 0uL,
    public var rax: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var rbp: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var r11: ULong = 0uL,
    public var r12: ULong = 0uL,
    public var r13: ULong = 0uL,
    public var r14: ULong = 0uL,
    public var r15: ULong = 0uL,
    public var rip: ULong = 0uL,
    public var cs: UInt = 0u,
    public var rsvd1: UInt = 0u,
    public var rflags: ULong = 0uL,
    public var rsp: ULong = 0uL,
    public var ss: UInt = 0u,
    public var rsvd2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<X8664CpuRegisters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<X8664CpuRegisters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 160L
                override fun readNative(addr: Long): X8664CpuRegisters =
                    X8664CpuRegisters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                    )
                override fun writeNative(addr: Long, value: X8664CpuRegisters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rdi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rsi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.rdx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.r10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.r8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.r9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.rax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.rbx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.rbp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.rcx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.r11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.r12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.r13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.r14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.r15)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.rip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.cs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.rsvd1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.rflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.rsp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.ss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.rsvd2)
                }
            }
    }
}

public data class McontextT(
    public var cpu: X8664CpuRegisters = X8664CpuRegisters(),
    public var fpu: X8664FpuRegisters = X8664FpuRegisters(),
)

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
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ssSize)
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

public data class FsaveArea64(
    public var fpuControlWord: UInt = 0u,
    public var fpuStatusWord: UInt = 0u,
    public var fpuTagWord: UInt = 0u,
    public var fpuIp: UInt = 0u,
    public var fpuCs: UInt = 0u,
    public var fpuOp: UInt = 0u,
    public var fpuDs: UInt = 0u,
    public var stRegs: UByteArray = UByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsaveArea64) return false
        if (this.fpuControlWord != other.fpuControlWord) return false
        if (this.fpuStatusWord != other.fpuStatusWord) return false
        if (this.fpuTagWord != other.fpuTagWord) return false
        if (this.fpuIp != other.fpuIp) return false
        if (this.fpuCs != other.fpuCs) return false
        if (this.fpuOp != other.fpuOp) return false
        if (this.fpuDs != other.fpuDs) return false
        if (!this.stRegs.contentEquals(other.stRegs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fpuControlWord.hashCode()
        result = 31 * result + this.fpuStatusWord.hashCode()
        result = 31 * result + this.fpuTagWord.hashCode()
        result = 31 * result + this.fpuIp.hashCode()
        result = 31 * result + this.fpuCs.hashCode()
        result = 31 * result + this.fpuOp.hashCode()
        result = 31 * result + this.fpuDs.hashCode()
        result = 31 * result + this.stRegs.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsaveArea64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsaveArea64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 108L
                override fun readNative(addr: Long): FsaveArea64 =
                    FsaveArea64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FsaveArea64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fpuControlWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fpuStatusWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fpuTagWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fpuIp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fpuCs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.fpuOp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.fpuDs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 28L, value.stRegs.toList())
                }
            }
    }
}

public data class FxsaveArea64(
    public var fpuControlWord: UShort = 0u,
    public var fpuStatusWord: UShort = 0u,
    public var fpuTagWord: UShort = 0u,
    public var fpuOperand: UShort = 0u,
    public var fpuRip: ULong = 0uL,
    public var fpuRdp: ULong = 0uL,
    public var mxcsr: UInt = 0u,
    public var mxcsrMask: UInt = 0u,
    public var stRegs: UByteArray = UByteArray(128),
    public var xmmRegs: UByteArray = UByteArray(128),
    public var reserved2: UByteArray = UByteArray(224),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FxsaveArea64) return false
        if (this.fpuControlWord != other.fpuControlWord) return false
        if (this.fpuStatusWord != other.fpuStatusWord) return false
        if (this.fpuTagWord != other.fpuTagWord) return false
        if (this.fpuOperand != other.fpuOperand) return false
        if (this.fpuRip != other.fpuRip) return false
        if (this.fpuRdp != other.fpuRdp) return false
        if (this.mxcsr != other.mxcsr) return false
        if (this.mxcsrMask != other.mxcsrMask) return false
        if (!this.stRegs.contentEquals(other.stRegs)) return false
        if (!this.xmmRegs.contentEquals(other.xmmRegs)) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fpuControlWord.hashCode()
        result = 31 * result + this.fpuStatusWord.hashCode()
        result = 31 * result + this.fpuTagWord.hashCode()
        result = 31 * result + this.fpuOperand.hashCode()
        result = 31 * result + this.fpuRip.hashCode()
        result = 31 * result + this.fpuRdp.hashCode()
        result = 31 * result + this.mxcsr.hashCode()
        result = 31 * result + this.mxcsrMask.hashCode()
        result = 31 * result + this.stRegs.contentHashCode()
        result = 31 * result + this.xmmRegs.contentHashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FxsaveArea64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FxsaveArea64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 512L
                override fun readNative(addr: Long): FxsaveArea64 =
                    FxsaveArea64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr + 160L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (224).toInt())
                        ).readNative(addr + 288L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FxsaveArea64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.fpuControlWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.fpuStatusWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.fpuTagWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.fpuOperand)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fpuRip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fpuRdp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.mxcsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.mxcsrMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr + 32L, value.stRegs.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr + 160L, value.xmmRegs.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (224).toInt())
                    ).writeNative(addr + 288L, value.reserved2.toList())
                }
            }
    }
}

public data class FpuExtentionSavearea64(
    public var other: UByteArray = UByteArray(512),
    public var xstateBv: ULong = 0uL,
    public var xstateUndef: ULongArray = ULongArray(7),
    public var xstateInfo: UByteArray = UByteArray(224),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FpuExtentionSavearea64) return false
        if (!this.other.contentEquals(other.other)) return false
        if (this.xstateBv != other.xstateBv) return false
        if (!this.xstateUndef.contentEquals(other.xstateUndef)) return false
        if (!this.xstateInfo.contentEquals(other.xstateInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.other.contentHashCode()
        result = 31 * result + this.xstateBv.hashCode()
        result = 31 * result + this.xstateUndef.contentHashCode()
        result = 31 * result + this.xstateInfo.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FpuExtentionSavearea64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FpuExtentionSavearea64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 800L
                override fun readNative(addr: Long): FpuExtentionSavearea64 =
                    FpuExtentionSavearea64(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 512L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (7).toInt())
                        ).readNative(addr + 520L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (224).toInt())
                        ).readNative(addr + 576L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FpuExtentionSavearea64) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                    ).writeNative(addr, value.other.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 512L, value.xstateBv)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (7).toInt())
                    ).writeNative(addr + 520L, value.xstateUndef.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (224).toInt())
                    ).writeNative(addr + 576L, value.xstateInfo.toList())
                }
            }
    }
}

public data class X8664FpuRegisters(
    public var fsaveArea: FsaveArea64 = FsaveArea64(),
    public var fxsaveArea: FxsaveArea64 = FxsaveArea64(),
    public var xsaveArea: FpuExtentionSavearea64 = FpuExtentionSavearea64(),
    public var data: UByteArray = UByteArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is X8664FpuRegisters) return false
        if (this.fsaveArea != other.fsaveArea) return false
        if (this.fxsaveArea != other.fxsaveArea) return false
        if (this.xsaveArea != other.xsaveArea) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fsaveArea.hashCode()
        result = 31 * result + this.fxsaveArea.hashCode()
        result = 31 * result + this.xsaveArea.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public fun eq(other: X8664FpuRegisters): Boolean = this.fsaveArea == other.fsaveArea || this.fxsaveArea == other.fxsaveArea || this.xsaveArea == other.xsaveArea
}
