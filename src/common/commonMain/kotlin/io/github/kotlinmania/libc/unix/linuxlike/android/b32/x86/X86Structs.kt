@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.linuxlike.android.StackT
import io.github.kotlinmania.libc.unix.linuxlike.android.b32.Sigset64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b32.SigsetT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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

public data class LibcFpreg(
    public var significand: UShortArray = UShortArray(4),
    public var exponent: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LibcFpreg) return false
        if (!this.significand.contentEquals(other.significand)) return false
        if (this.exponent != other.exponent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.significand.contentHashCode()
        result = 31 * result + this.exponent.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LibcFpreg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LibcFpreg> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): LibcFpreg =
                    LibcFpreg(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LibcFpreg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr, value.significand.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.exponent)
                }
            }
    }
}

public data class LibcFpstate(
    public var cw: CUlong = 0uL,
    public var sw: CUlong = 0uL,
    public var tag: CUlong = 0uL,
    public var ipoff: CUlong = 0uL,
    public var cssel: CUlong = 0uL,
    public var dataoff: CUlong = 0uL,
    public var datasel: CUlong = 0uL,
    public var st: List<LibcFpreg> = List(8) { LibcFpreg() },
    public var status: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LibcFpstate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LibcFpstate> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): LibcFpstate =
                    LibcFpstate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(LibcFpreg.typeLayout(), (8).toInt())
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: LibcFpstate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.cw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.sw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ipoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.cssel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.dataoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.datasel)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(LibcFpreg.typeLayout(), (8).toInt())
                    ).writeNative(addr + 56L, value.st)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.status)
                }
            }
    }
}

public class McontextT internal constructor(
    public var gregs: IntArray,
    fpregsCtorArg: MutPtr,
    public var oldmask: CUlong,
    public var cr2: CUlong,
) {
    public var fpregs: MutPtr = fpregsCtorArg
        internal set

    public constructor() : this(
        gregs = IntArray(19),
        fpregsCtorArg = MutPtr(0L),
        oldmask = 0uL,
        cr2 = 0uL,
    )

    public operator fun component1(): IntArray = this.gregs

    public operator fun component2(): MutPtr = this.fpregs

    public operator fun component3(): CUlong = this.oldmask

    public operator fun component4(): CUlong = this.cr2

    public fun copy(gregs: IntArray = this.gregs, fpregs: MutPtr = this.fpregs, oldmask: CUlong = this.oldmask, cr2: CUlong = this.cr2): McontextT = McontextT(gregs = gregs, fpregsCtorArg = fpregs, oldmask = oldmask, cr2 = cr2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (!this.gregs.contentEquals(other.gregs)) return false
        if (this.fpregs != other.fpregs) return false
        if (this.oldmask != other.oldmask) return false
        if (this.cr2 != other.cr2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gregs.contentHashCode()
        result = 31 * result + this.fpregs.hashCode()
        result = 31 * result + this.oldmask.hashCode()
        result = 31 * result + this.cr2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (19).toInt())
                        ).readNative(addr).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (19).toInt())
                    ).writeNative(addr, value.gregs.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 80L, value.fpregs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.oldmask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.cr2)
                }
            }

        public operator fun invoke(
            gregs: IntArray = IntArray(19),
            fpregs: MutPtr = MutPtr(0L),
            oldmask: CUlong = 0uL,
            cr2: CUlong = 0uL,
        ): McontextT =
            McontextT(
                gregs = gregs,
                fpregsCtorArg = fpregs,
                oldmask = oldmask,
                cr2 = cr2,
            )
    }
}

public data class CAnonymousUcSigmaskWithPadding(
    public var ucSigmask: SigsetT = 0uL,
    // Android has a wrong (smaller) sigsetT on x86.
    public var paddingRtSigset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousUcSigmaskWithPadding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousUcSigmaskWithPadding> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CAnonymousUcSigmaskWithPadding =
                    CAnonymousUcSigmaskWithPadding(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousUcSigmaskWithPadding) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ucSigmask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.paddingRtSigset)
                }
            }
    }
}

public class UcontextT internal constructor(
    public var ucFlags: CUlong,
    ucLinkCtorArg: MutPtr,
    public var ucStack: StackT,
    ucMcontextCtorArg: McontextT,
    public var ucSigmaskCAnonymousUnion: CAnonymousUcSigmask,
    public var paddingRtSigset: UInt,
    public var fpregsMem: LibcFpstate,
) {
    public var ucLink: MutPtr = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public constructor() : this(
        ucFlags = 0uL,
        ucLinkCtorArg = MutPtr(0L),
        ucStack = StackT(),
        ucMcontextCtorArg = McontextT(),
        ucSigmaskCAnonymousUnion = CAnonymousUcSigmask(),
        paddingRtSigset = 0u,
        fpregsMem = LibcFpstate(),
    )

    public operator fun component1(): CUlong = this.ucFlags

    public operator fun component2(): MutPtr = this.ucLink

    public operator fun component3(): StackT = this.ucStack

    public operator fun component4(): McontextT = this.ucMcontext

    public operator fun component5(): CAnonymousUcSigmask = this.ucSigmaskCAnonymousUnion

    public operator fun component6(): UInt = this.paddingRtSigset

    public operator fun component7(): LibcFpstate = this.fpregsMem

    public fun copy(ucFlags: CUlong = this.ucFlags, ucLink: MutPtr = this.ucLink, ucStack: StackT = this.ucStack, ucMcontext: McontextT = this.ucMcontext, ucSigmaskCAnonymousUnion: CAnonymousUcSigmask = this.ucSigmaskCAnonymousUnion, paddingRtSigset: UInt = this.paddingRtSigset, fpregsMem: LibcFpstate = this.fpregsMem): UcontextT = UcontextT(ucFlags = ucFlags, ucLinkCtorArg = ucLink, ucStack = ucStack, ucMcontextCtorArg = ucMcontext, ucSigmaskCAnonymousUnion = ucSigmaskCAnonymousUnion, paddingRtSigset = paddingRtSigset, fpregsMem = fpregsMem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucFlags != other.ucFlags) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucSigmaskCAnonymousUnion != other.ucSigmaskCAnonymousUnion) return false
        if (this.paddingRtSigset != other.paddingRtSigset) return false
        if (this.fpregsMem != other.fpregsMem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucFlags.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucSigmaskCAnonymousUnion.hashCode()
        result = 31 * result + this.paddingRtSigset.hashCode()
        result = 31 * result + this.fpregsMem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucFlags: CUlong = 0uL,
            ucLink: MutPtr = MutPtr(0L),
            ucStack: StackT = StackT(),
            ucMcontext: McontextT = McontextT(),
            ucSigmaskCAnonymousUnion: CAnonymousUcSigmask = CAnonymousUcSigmask(),
            paddingRtSigset: UInt = 0u,
            fpregsMem: LibcFpstate = LibcFpstate(),
        ): UcontextT =
            UcontextT(
                ucFlags = ucFlags,
                ucLinkCtorArg = ucLink,
                ucStack = ucStack,
                ucMcontextCtorArg = ucMcontext,
                ucSigmaskCAnonymousUnion = ucSigmaskCAnonymousUnion,
                paddingRtSigset = paddingRtSigset,
                fpregsMem = fpregsMem,
            )
    }
}

public data class CAnonymousUcSigmask(
    public var ucSigmask: CAnonymousUcSigmaskWithPadding = CAnonymousUcSigmaskWithPadding(),
    public var ucSigmask64: Sigset64T = Sigset64T(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_uc_sigmask").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousUcSigmask): Boolean = this.ucSigmask == other.ucSigmask

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.ucSigmask).hashCode()
        return state
    }
}

public data class MaxAlignT(
    public var priv: DoubleArray = DoubleArray(2),
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
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MaxAlignT =
                    MaxAlignT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (2).toInt())
                        ).readNative(addr).toDoubleArray(),
                    )
                override fun writeNative(addr: Long, value: MaxAlignT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (2).toInt())
                    ).writeNative(addr, value.priv.toList())
                }
            }
    }
}
