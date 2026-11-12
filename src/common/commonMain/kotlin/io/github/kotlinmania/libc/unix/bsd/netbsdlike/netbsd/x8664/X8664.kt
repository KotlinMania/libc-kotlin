// port-lint: source unix/bsd/netbsdlike/netbsd/x86_64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.StackT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PT_FIRSTMACH
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SigsetT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias CGregT = ULong

public typealias CpuSimpleLockNvT = CUchar

// Note(alignment): Type is `__aligned(8)`
public typealias FpregsetT = UByteArray

public data class McontextT(
    public var gregs: ULongArray = ULongArray(26),
    public var mcTlsbase: CGregT = 0uL,
    public var fpregs: FpregsetT = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (!this.gregs.contentEquals(other.gregs)) return false
        if (this.mcTlsbase != other.mcTlsbase) return false
        if (!this.fpregs.contentEquals(other.fpregs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gregs.contentHashCode()
        result = 31 * result + this.mcTlsbase.hashCode()
        result = 31 * result + this.fpregs.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 728L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (26).toInt())
                        ).readNative(addr).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 208L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                        ).readNative(addr + 216L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (26).toInt())
                    ).writeNative(addr, value.gregs.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 208L, value.mcTlsbase)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                    ).writeNative(addr + 216L, value.fpregs.toList())
                }
            }
    }
}

public class UcontextT internal constructor(
    public var ucFlags: CUint,
    ucLinkCtorArg: MutPtr,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    ucMcontextCtorArg: McontextT,
) {
    public var ucLink: MutPtr = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public constructor() : this(
        ucFlags = 0u,
        ucLinkCtorArg = MutPtr(0L),
        ucSigmask = SigsetT(),
        ucStack = StackT(),
        ucMcontextCtorArg = McontextT(),
    )

    public operator fun component1(): CUint = this.ucFlags

    public operator fun component2(): MutPtr = this.ucLink

    public operator fun component3(): SigsetT = this.ucSigmask

    public operator fun component4(): StackT = this.ucStack

    public operator fun component5(): McontextT = this.ucMcontext

    public fun copy(ucFlags: CUint = this.ucFlags, ucLink: MutPtr = this.ucLink, ucSigmask: SigsetT = this.ucSigmask, ucStack: StackT = this.ucStack, ucMcontext: McontextT = this.ucMcontext): UcontextT = UcontextT(ucFlags = ucFlags, ucLinkCtorArg = ucLink, ucSigmask = ucSigmask, ucStack = ucStack, ucMcontextCtorArg = ucMcontext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucFlags != other.ucFlags) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucMcontext != other.ucMcontext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucFlags.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucFlags: CUint = 0u,
            ucLink: MutPtr = MutPtr(0L),
            ucSigmask: SigsetT = SigsetT(),
            ucStack: StackT = StackT(),
            ucMcontext: McontextT = McontextT(),
        ): UcontextT =
            UcontextT(
                ucFlags = ucFlags,
                ucLinkCtorArg = ucLink,
                ucSigmask = ucSigmask,
                ucStack = ucStack,
                ucMcontextCtorArg = ucMcontext,
            )
    }
}

public val PT_STEP: CInt = PT_FIRSTMACH + 0

public val PT_GETREGS: CInt = PT_FIRSTMACH + 1

public val PT_SETREGS: CInt = PT_FIRSTMACH + 2

public val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3

public val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4

public val REG_RDI: CInt = 0

public val REG_RSI: CInt = 1

public val REG_RDX: CInt = 2

public val REG_RCX: CInt = 3

public val REG_R8: CInt = 4

public val REG_R9: CInt = 5

public val REG_R10: CInt = 6

public val REG_R11: CInt = 7

public val REG_R12: CInt = 8

public val REG_R13: CInt = 9

public val REG_R14: CInt = 10

public val REG_R15: CInt = 11

public val REG_RBP: CInt = 12

public val REG_RBX: CInt = 13

public val REG_RAX: CInt = 14

public val REG_GS: CInt = 15

public val REG_FS: CInt = 16

public val REG_ES: CInt = 17

public val REG_DS: CInt = 18

public val REG_TRAPNO: CInt = 19

public val REG_ERR: CInt = 20

public val REG_RIP: CInt = 21

public val REG_CS: CInt = 22

public val REG_RFLAGS: CInt = 23

public val REG_RSP: CInt = 24

public val REG_SS: CInt = 25

internal val ALIGNBYTES: Int = sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64) - 1
