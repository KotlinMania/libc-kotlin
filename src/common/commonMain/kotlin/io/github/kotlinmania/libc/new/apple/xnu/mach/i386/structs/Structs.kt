// port-lint: source new/apple/xnu/mach/i386/_structs.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.xnu.mach.i386.structs

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

// Header: `i386 / _structs.h`
//
// <https://github.com/apple-oss-distributions/xnu/blob/main/osfmk/mach/i386/_structs.h>

public data class DarwinMmstReg(
    public var mmstReg: UByteArray = UByteArray(10),
    public var mmstRsrv: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DarwinMmstReg) return false
        if (!this.mmstReg.contentEquals(other.mmstReg)) return false
        if (!this.mmstRsrv.contentEquals(other.mmstRsrv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mmstReg.contentHashCode()
        result = 31 * result + this.mmstRsrv.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinMmstReg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinMmstReg> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DarwinMmstReg =
                    DarwinMmstReg(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (10).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (6).toInt())
                        ).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: DarwinMmstReg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (10).toInt())
                    ).writeNative(addr, value.mmstReg)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (6).toInt())
                    ).writeNative(addr + 10L, value.mmstRsrv)
                }
            }
    }
}

public data class DarwinXmmReg(
    public var xmmReg: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DarwinXmmReg) return false
        if (!this.xmmReg.contentEquals(other.xmmReg)) return false
        return true
    }

    override fun hashCode(): Int = this.xmmReg.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinXmmReg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinXmmReg> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DarwinXmmReg =
                    DarwinXmmReg(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DarwinXmmReg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr, value.xmmReg)
                }
            }
    }
}

public class DarwinX86ThreadState64(
    public var rax: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var rdi: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rbp: ULong = 0uL,
    public var rsp: ULong = 0uL,
    public var r8: ULong = 0uL,
    public var r9: ULong = 0uL,
    public var r10: ULong = 0uL,
    public var r11: ULong = 0uL,
    public var r12: ULong = 0uL,
    public var r13: ULong = 0uL,
    public var r14: ULong = 0uL,
    public var r15: ULong = 0uL,
    public var rip: ULong = 0uL,
    public var rflags: ULong = 0uL,
    public var cs: ULong = 0uL,
    public var fs: ULong = 0uL,
    public var gs: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinX86ThreadState64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinX86ThreadState64> {
                override val sizeBytes: Long = 168L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DarwinX86ThreadState64 =
                    DarwinX86ThreadState64(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                    )
                override fun writeNative(addr: Long, value: DarwinX86ThreadState64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rbx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.rcx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.rdx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.rdi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.rsi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.rbp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.rsp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.r8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.r9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.r10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.r11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.r12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.r13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.r14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.r15)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.rip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.rflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.cs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.fs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.gs)
                }
            }
    }
}

public data class DarwinX86ExceptionState64(
    public var trapno: UShort = 0u,
    public var cpu: UShort = 0u,
    public var err: UInt = 0u,
    public var faultvaddr: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinX86ExceptionState64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinX86ExceptionState64> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DarwinX86ExceptionState64 =
                    DarwinX86ExceptionState64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DarwinX86ExceptionState64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.trapno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.cpu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.err)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.faultvaddr)
                }
            }
    }
}

public class DarwinX86FloatState64(
    public var fpuReserved: IntArray = IntArray(2),
    public var fpuFcw: CShort = 0,
    public var fpuFsw: CShort = 0,
    public var fpuFtw: UByte = 0u,
    public var fpuRsrv1: UByte = 0u,
    public var fpuFop: UShort = 0u,
    public var fpuIp: UInt = 0u,
    public var fpuCs: UShort = 0u,
    public var fpuRsrv2: UShort = 0u,
    public var fpuDp: UInt = 0u,
    public var fpuDs: UShort = 0u,
    public var fpuRsrv3: UShort = 0u,
    public var fpuMxcsr: UInt = 0u,
    public var fpuMxcsrmask: UInt = 0u,
    public var fpuStmm0: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm1: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm2: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm3: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm4: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm5: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm6: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm7: DarwinMmstReg = DarwinMmstReg(),
    public var fpuXmm0: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm1: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm2: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm3: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm4: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm5: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm6: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm7: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm8: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm9: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm10: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm11: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm12: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm13: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm14: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm15: DarwinXmmReg = DarwinXmmReg(),
    // Note(apple): this field is actually [u8; 96], but defining it with a bigger type allows
    // us to auto-implement traits for it since the length of the array is less than 32
    public var fpuRsrv4: UIntArray = UIntArray(24),
    public var fpuReserved1: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinX86FloatState64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinX86FloatState64> {
                override val sizeBytes: Long = 524L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DarwinX86FloatState64 =
                    DarwinX86FloatState64(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (DarwinMmstReg.typeLayout()).readNative(addr + 40L),
                        (DarwinMmstReg.typeLayout()).readNative(addr + 56L),
                        (DarwinMmstReg.typeLayout()).readNative(addr + 72L),
                        (DarwinMmstReg.typeLayout()).readNative(addr + 88L),
                        (DarwinMmstReg.typeLayout()).readNative(addr + 104L),
                        (DarwinMmstReg.typeLayout()).readNative(addr + 120L),
                        (DarwinMmstReg.typeLayout()).readNative(addr + 136L),
                        (DarwinMmstReg.typeLayout()).readNative(addr + 152L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 168L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 184L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 200L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 216L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 232L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 248L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 264L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 280L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 296L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 312L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 328L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 344L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 360L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 376L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 392L),
                        (DarwinXmmReg.typeLayout()).readNative(addr + 408L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (24).toInt())
                        ).readNative(addr + 424L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 520L),
                    )
                override fun writeNative(addr: Long, value: DarwinX86FloatState64) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                    ).writeNative(addr, value.fpuReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.fpuFcw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.fpuFsw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.fpuFtw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.fpuRsrv1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.fpuFop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fpuIp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.fpuCs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.fpuRsrv2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.fpuDp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.fpuDs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 30L, value.fpuRsrv3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.fpuMxcsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.fpuMxcsrmask)
                    (DarwinMmstReg.typeLayout()).writeNative(addr + 40L, value.fpuStmm0)
                    (DarwinMmstReg.typeLayout()).writeNative(addr + 56L, value.fpuStmm1)
                    (DarwinMmstReg.typeLayout()).writeNative(addr + 72L, value.fpuStmm2)
                    (DarwinMmstReg.typeLayout()).writeNative(addr + 88L, value.fpuStmm3)
                    (DarwinMmstReg.typeLayout()).writeNative(addr + 104L, value.fpuStmm4)
                    (DarwinMmstReg.typeLayout()).writeNative(addr + 120L, value.fpuStmm5)
                    (DarwinMmstReg.typeLayout()).writeNative(addr + 136L, value.fpuStmm6)
                    (DarwinMmstReg.typeLayout()).writeNative(addr + 152L, value.fpuStmm7)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 168L, value.fpuXmm0)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 184L, value.fpuXmm1)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 200L, value.fpuXmm2)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 216L, value.fpuXmm3)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 232L, value.fpuXmm4)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 248L, value.fpuXmm5)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 264L, value.fpuXmm6)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 280L, value.fpuXmm7)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 296L, value.fpuXmm8)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 312L, value.fpuXmm9)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 328L, value.fpuXmm10)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 344L, value.fpuXmm11)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 360L, value.fpuXmm12)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 376L, value.fpuXmm13)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 392L, value.fpuXmm14)
                    (DarwinXmmReg.typeLayout()).writeNative(addr + 408L, value.fpuXmm15)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (24).toInt())
                    ).writeNative(addr + 424L, value.fpuRsrv4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 520L, value.fpuReserved1)
                }
            }
    }
}
