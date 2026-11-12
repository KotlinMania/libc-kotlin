// port-lint: source unix/haiku/x86_64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.haiku.SigsetT
import io.github.kotlinmania.libc.unix.haiku.StackT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public data class FpuState(
    public var control: CUshort = 0u,
    public var status: CUshort = 0u,
    public var tag: CUshort = 0u,
    public var opcode: CUshort = 0u,
    public var rip: CUlong = 0uL,
    public var rdp: CUlong = 0uL,
    public var mxcsr: CUint = 0u,
    public var mscsrMask: CUint = 0u,
    public var fpreg: List<UByteArray> = List(16) { UByteArray(0) },
    public var xmm: List<UByteArray> = List(16) { UByteArray(0) },
    public var reserved416511: UByteArray = UByteArray(96),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FpuState) return false
        if (this.control != other.control) return false
        if (this.status != other.status) return false
        if (this.tag != other.tag) return false
        if (this.opcode != other.opcode) return false
        if (this.rip != other.rip) return false
        if (this.rdp != other.rdp) return false
        if (this.mxcsr != other.mxcsr) return false
        if (this.mscsrMask != other.mscsrMask) return false
        if (this.fpreg != other.fpreg) return false
        if (this.xmm != other.xmm) return false
        if (!this.reserved416511.contentEquals(other.reserved416511)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.control.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.tag.hashCode()
        result = 31 * result + this.opcode.hashCode()
        result = 31 * result + this.rip.hashCode()
        result = 31 * result + this.rdp.hashCode()
        result = 31 * result + this.mxcsr.hashCode()
        result = 31 * result + this.mscsrMask.hashCode()
        result = 31 * result + this.fpreg.hashCode()
        result = 31 * result + this.xmm.hashCode()
        result = 31 * result + this.reserved416511.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FpuState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FpuState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 512L
                override fun readNative(addr: Long): FpuState =
                    FpuState(
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
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt()),
                                    (16).toInt(),
                                )
                        ).readNative(addr + 32L).map { it.toUByteArray() },
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                    (16).toInt(),
                                )
                        ).readNative(addr + 160L).map { it.toUByteArray() },
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (96).toInt())
                        ).readNative(addr + 416L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FpuState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.control)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.opcode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.rdp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.mxcsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.mscsrMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt()),
                                (16).toInt(),
                            )
                    ).writeNative(addr + 32L, value.fpreg.map { it.toList() })
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                (16).toInt(),
                            )
                    ).writeNative(addr + 160L, value.xmm.map { it.toList() })
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (96).toInt())
                    ).writeNative(addr + 416L, value.reserved416511.toList())
                }
            }
    }
}

public data class XstateHdr(
    public var bv: CUlong = 0uL,
    public var xcompBv: CUlong = 0uL,
    public var reserved: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XstateHdr) return false
        if (this.bv != other.bv) return false
        if (this.xcompBv != other.xcompBv) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bv.hashCode()
        result = 31 * result + this.xcompBv.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateHdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): XstateHdr =
                    XstateHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: XstateHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.xcompBv)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                    ).writeNative(addr + 16L, value.reserved.toList())
                }
            }
    }
}

public data class Savefpu(
    public var fpFxsave: FpuState = FpuState(),
    public var fpXstate: XstateHdr = XstateHdr(),
    public var fpYmm: List<UByteArray> = List(16) { UByteArray(0) },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Savefpu> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Savefpu> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 832L
                override fun readNative(addr: Long): Savefpu =
                    Savefpu(
                        (FpuState.typeLayout()).readNative(addr),
                        (XstateHdr.typeLayout()).readNative(addr + 512L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                    (16).toInt(),
                                )
                        ).readNative(addr + 576L).map { it.toUByteArray() },
                    )
                override fun writeNative(addr: Long, value: Savefpu) {
                    (FpuState.typeLayout()).writeNative(addr, value.fpFxsave)
                    (XstateHdr.typeLayout()).writeNative(addr + 512L, value.fpXstate)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt()),
                                (16).toInt(),
                            )
                    ).writeNative(addr + 576L, value.fpYmm.map { it.toList() })
                }
            }
    }
}

public class McontextT(
    public var rax: CUlong = 0uL,
    public var rbx: CUlong = 0uL,
    public var rcx: CUlong = 0uL,
    public var rdx: CUlong = 0uL,
    public var rdi: CUlong = 0uL,
    public var rsi: CUlong = 0uL,
    public var rbp: CUlong = 0uL,
    public var r8: CUlong = 0uL,
    public var r9: CUlong = 0uL,
    public var r10: CUlong = 0uL,
    public var r11: CUlong = 0uL,
    public var r12: CUlong = 0uL,
    public var r13: CUlong = 0uL,
    public var r14: CUlong = 0uL,
    public var r15: CUlong = 0uL,
    public var rsp: CUlong = 0uL,
    public var rip: CUlong = 0uL,
    public var rflags: CUlong = 0uL,
    public var fpu: Savefpu = Savefpu(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 976L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
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
                        (Savefpu.typeLayout()).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rbx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.rcx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.rdx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.rdi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.rsi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.rbp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.r8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.r9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.r10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.r11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.r12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.r13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.r14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.r15)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.rsp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.rip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.rflags)
                    (Savefpu.typeLayout()).writeNative(addr + 144L, value.fpu)
                }
            }
    }
}

public class UcontextT internal constructor(
    ucLinkCtorArg: MutPtr<UcontextT>,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    ucMcontextCtorArg: McontextT,
) {
    public var ucLink: MutPtr<UcontextT> = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public constructor() : this(
        ucLinkCtorArg = MutPtr(0L),
        ucSigmask = 0uL,
        ucStack = StackT(),
        ucMcontextCtorArg = McontextT(),
    )

    public operator fun component1(): MutPtr<UcontextT> = this.ucLink

    public operator fun component2(): SigsetT = this.ucSigmask

    public operator fun component3(): StackT = this.ucStack

    public operator fun component4(): McontextT = this.ucMcontext

    public fun copy(ucLink: MutPtr<UcontextT> = this.ucLink, ucSigmask: SigsetT = this.ucSigmask, ucStack: StackT = this.ucStack, ucMcontext: McontextT = this.ucMcontext): UcontextT = UcontextT(ucLinkCtorArg = ucLink, ucSigmask = ucSigmask, ucStack = ucStack, ucMcontextCtorArg = ucMcontext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucMcontext != other.ucMcontext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLink.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucLink: MutPtr<UcontextT> = MutPtr(0L),
            ucSigmask: SigsetT = 0uL,
            ucStack: StackT = StackT(),
            ucMcontext: McontextT = McontextT(),
        ): UcontextT =
            UcontextT(
                ucLinkCtorArg = ucLink,
                ucSigmask = ucSigmask,
                ucStack = ucStack,
                ucMcontextCtorArg = ucMcontext,
            )
    }
}
