@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.DevT
import io.github.kotlinmania.libc.unix.linuxlike.android.InoT
import io.github.kotlinmania.libc.unix.linuxlike.android.StackT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Sigset64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SigsetT
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

public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stNlink: CUlong = 0uL,
    public var stMode: CUint = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stSize: Off64T = 0L,
    public var stBlksize: CLong = 0L,
    public var stBlocks: CLong = 0L,
    public var stAtime: CLong = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: CLong = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: CLong = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var unused: LongArray = LongArray(3),
)

public class Stat64(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stNlink: CUlong = 0uL,
    public var stMode: CUint = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stSize: Off64T = 0L,
    public var stBlksize: CLong = 0L,
    public var stBlocks: CLong = 0L,
    public var stAtime: CLong = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: CLong = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: CLong = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var unused: LongArray = LongArray(3),
)

public data class LibcXmmreg(
    public var element: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LibcXmmreg) return false
        if (!this.element.contentEquals(other.element)) return false
        return true
    }

    override fun hashCode(): Int = this.element.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LibcXmmreg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LibcXmmreg> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): LibcXmmreg =
                    LibcXmmreg(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: LibcXmmreg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.element)
                }
            }
    }
}

public class UserRegsStruct(
    public var r15: CUlong = 0uL,
    public var r14: CUlong = 0uL,
    public var r13: CUlong = 0uL,
    public var r12: CUlong = 0uL,
    public var rbp: CUlong = 0uL,
    public var rbx: CUlong = 0uL,
    public var r11: CUlong = 0uL,
    public var r10: CUlong = 0uL,
    public var r9: CUlong = 0uL,
    public var r8: CUlong = 0uL,
    public var rax: CUlong = 0uL,
    public var rcx: CUlong = 0uL,
    public var rdx: CUlong = 0uL,
    public var rsi: CUlong = 0uL,
    public var rdi: CUlong = 0uL,
    public var origRax: CUlong = 0uL,
    public var rip: CUlong = 0uL,
    public var cs: CUlong = 0uL,
    public var eflags: CUlong = 0uL,
    public var rsp: CUlong = 0uL,
    public var ss: CUlong = 0uL,
    public var fsBase: CUlong = 0uL,
    public var gsBase: CUlong = 0uL,
    public var ds: CUlong = 0uL,
    public var es: CUlong = 0uL,
    public var fs: CUlong = 0uL,
    public var gs: CUlong = 0uL,
)

public class User internal constructor(
    public var regs: UserRegsStruct,
    public var uFpvalid: CInt,
    public var i387: UserFpregsStruct,
    public var uTsize: CUlong,
    public var uDsize: CUlong,
    public var uSsize: CUlong,
    public var startCode: CUlong,
    public var startStack: CUlong,
    public var signal: CLong,
    public var reserved: CInt,
    uAr0CtorArg: MutPtr<UserRegsStruct>,
    uFpstateCtorArg: MutPtr<UserFpregsStruct>,
    public var magic: CUlong,
    public var uComm: UByteArray,
    public var uDebugreg: ULongArray,
    public var errorCode: CUlong,
    public var faultAddress: CUlong,
) {
    public var uAr0: MutPtr<UserRegsStruct> = uAr0CtorArg
        internal set

    public var uFpstate: MutPtr<UserFpregsStruct> = uFpstateCtorArg
        internal set

    public constructor() : this(
        regs = UserRegsStruct(),
        uFpvalid = 0,
        i387 = UserFpregsStruct(),
        uTsize = 0uL,
        uDsize = 0uL,
        uSsize = 0uL,
        startCode = 0uL,
        startStack = 0uL,
        signal = 0L,
        reserved = 0,
        uAr0CtorArg = MutPtr(0L),
        uFpstateCtorArg = MutPtr(0L),
        magic = 0uL,
        uComm = UByteArray(32),
        uDebugreg = ULongArray(8),
        errorCode = 0uL,
        faultAddress = 0uL,
    )

    public companion object {
        public operator fun invoke(
            regs: UserRegsStruct = UserRegsStruct(),
            uFpvalid: CInt = 0,
            i387: UserFpregsStruct = UserFpregsStruct(),
            uTsize: CUlong = 0uL,
            uDsize: CUlong = 0uL,
            uSsize: CUlong = 0uL,
            startCode: CUlong = 0uL,
            startStack: CUlong = 0uL,
            signal: CLong = 0L,
            reserved: CInt = 0,
            uAr0: MutPtr<UserRegsStruct> = MutPtr(0L),
            uFpstate: MutPtr<UserFpregsStruct> = MutPtr(0L),
            magic: CUlong = 0uL,
            uComm: UByteArray = UByteArray(32),
            uDebugreg: ULongArray = ULongArray(8),
            errorCode: CUlong = 0uL,
            faultAddress: CUlong = 0uL,
        ): User =
            User(
                regs = regs,
                uFpvalid = uFpvalid,
                i387 = i387,
                uTsize = uTsize,
                uDsize = uDsize,
                uSsize = uSsize,
                startCode = startCode,
                startStack = startStack,
                signal = signal,
                reserved = reserved,
                uAr0CtorArg = uAr0,
                uFpstateCtorArg = uFpstate,
                magic = magic,
                uComm = uComm,
                uDebugreg = uDebugreg,
                errorCode = errorCode,
                faultAddress = faultAddress,
            )
    }
}

public data class LibcFpxreg(
    public var significand: UShortArray = UShortArray(4),
    public var exponent: UShort = 0u,
    public var padding: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LibcFpxreg) return false
        if (!this.significand.contentEquals(other.significand)) return false
        if (this.exponent != other.exponent) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.significand.contentHashCode()
        result = 31 * result + this.exponent.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class LibcFpstate(
    public var cwd: UShort = 0u,
    public var swd: UShort = 0u,
    public var ftw: UShort = 0u,
    public var fop: UShort = 0u,
    public var rip: ULong = 0uL,
    public var rdp: ULong = 0uL,
    public var mxcsr: UInt = 0u,
    public var mxcrMask: UInt = 0u,
    public var st: List<LibcFpxreg> = List(8) { LibcFpxreg() },
    public var xmm: List<LibcXmmreg> = List(16) { LibcXmmreg() },
    public var private: UIntArray = UIntArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LibcFpstate) return false
        if (this.cwd != other.cwd) return false
        if (this.swd != other.swd) return false
        if (this.ftw != other.ftw) return false
        if (this.fop != other.fop) return false
        if (this.rip != other.rip) return false
        if (this.rdp != other.rdp) return false
        if (this.mxcsr != other.mxcsr) return false
        if (this.mxcrMask != other.mxcrMask) return false
        if (this.st != other.st) return false
        if (this.xmm != other.xmm) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cwd.hashCode()
        result = 31 * result + this.swd.hashCode()
        result = 31 * result + this.ftw.hashCode()
        result = 31 * result + this.fop.hashCode()
        result = 31 * result + this.rip.hashCode()
        result = 31 * result + this.rdp.hashCode()
        result = 31 * result + this.mxcsr.hashCode()
        result = 31 * result + this.mxcrMask.hashCode()
        result = 31 * result + this.st.hashCode()
        result = 31 * result + this.xmm.hashCode()
        result = 31 * result + this.private.contentHashCode()
        return result
    }
}

public class McontextT internal constructor(
    public var gregs: LongArray,
    fpregsCtorArg: MutPtr<LibcFpstate>,
    public var private: ULongArray,
) {
    public var fpregs: MutPtr<LibcFpstate> = fpregsCtorArg
        internal set

    public constructor() : this(
        gregs = LongArray(23),
        fpregsCtorArg = MutPtr(0L),
        private = ULongArray(8),
    )

    public operator fun component1(): LongArray = this.gregs

    public operator fun component2(): MutPtr<LibcFpstate> = this.fpregs

    public operator fun component3(): ULongArray = this.private

    public fun copy(gregs: LongArray = this.gregs, fpregs: MutPtr<LibcFpstate> = this.fpregs, private: ULongArray = this.private): McontextT = McontextT(gregs = gregs, fpregsCtorArg = fpregs, private = private)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (!this.gregs.contentEquals(other.gregs)) return false
        if (this.fpregs != other.fpregs) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gregs.contentHashCode()
        result = 31 * result + this.fpregs.hashCode()
        result = 31 * result + this.private.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val sizeBytes: Long = 256L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (23).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LibcFpstate>(64)
                        ).readNative(addr + 184L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 192L),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (23).toInt())
                    ).writeNative(addr, value.gregs)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LibcFpstate>(64)
                    ).writeNative(addr + 184L, value.fpregs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 192L, value.private)
                }
            }

        public operator fun invoke(
            gregs: LongArray = LongArray(23),
            fpregs: MutPtr<LibcFpstate> = MutPtr(0L),
            private: ULongArray = ULongArray(8),
        ): McontextT =
            McontextT(
                gregs = gregs,
                fpregsCtorArg = fpregs,
                private = private,
            )
    }
}

public class UcontextT internal constructor(
    public var ucFlags: CUlong,
    ucLinkCtorArg: MutPtr<UcontextT>,
    public var ucStack: StackT,
    ucMcontextCtorArg: McontextT,
    public var ucSigmask64: CAnonymousUcSigmask,
    public var fpregsMem: LibcFpstate,
) {
    public var ucLink: MutPtr<UcontextT> = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public constructor() : this(
        ucFlags = 0uL,
        ucLinkCtorArg = MutPtr(0L),
        ucStack = StackT(),
        ucMcontextCtorArg = McontextT(),
        ucSigmask64 = CAnonymousUcSigmask(),
        fpregsMem = LibcFpstate(),
    )

    public operator fun component1(): CUlong = this.ucFlags

    public operator fun component2(): MutPtr<UcontextT> = this.ucLink

    public operator fun component3(): StackT = this.ucStack

    public operator fun component4(): McontextT = this.ucMcontext

    public operator fun component5(): CAnonymousUcSigmask = this.ucSigmask64

    public operator fun component6(): LibcFpstate = this.fpregsMem

    public fun copy(ucFlags: CUlong = this.ucFlags, ucLink: MutPtr<UcontextT> = this.ucLink, ucStack: StackT = this.ucStack, ucMcontext: McontextT = this.ucMcontext, ucSigmask64: CAnonymousUcSigmask = this.ucSigmask64, fpregsMem: LibcFpstate = this.fpregsMem): UcontextT = UcontextT(ucFlags = ucFlags, ucLinkCtorArg = ucLink, ucStack = ucStack, ucMcontextCtorArg = ucMcontext, ucSigmask64 = ucSigmask64, fpregsMem = fpregsMem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucFlags != other.ucFlags) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucSigmask64 != other.ucSigmask64) return false
        if (this.fpregsMem != other.fpregsMem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucFlags.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucSigmask64.hashCode()
        result = 31 * result + this.fpregsMem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucFlags: CUlong = 0uL,
            ucLink: MutPtr<UcontextT> = MutPtr(0L),
            ucStack: StackT = StackT(),
            ucMcontext: McontextT = McontextT(),
            ucSigmask64: CAnonymousUcSigmask = CAnonymousUcSigmask(),
            fpregsMem: LibcFpstate = LibcFpstate(),
        ): UcontextT =
            UcontextT(
                ucFlags = ucFlags,
                ucLinkCtorArg = ucLink,
                ucStack = ucStack,
                ucMcontextCtorArg = ucMcontext,
                ucSigmask64 = ucSigmask64,
                fpregsMem = fpregsMem,
            )
    }
}

public data class UserFpregsStruct(
    public var cwd: CUshort = 0u,
    public var swd: CUshort = 0u,
    public var ftw: CUshort = 0u,
    public var fop: CUshort = 0u,
    public var rip: CUlong = 0uL,
    public var rdp: CUlong = 0uL,
    public var mxcsr: CUint = 0u,
    public var mxcrMask: CUint = 0u,
    public var stSpace: UIntArray = UIntArray(32),
    public var xmmSpace: UIntArray = UIntArray(64),
    public var padding: UIntArray = UIntArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserFpregsStruct) return false
        if (this.cwd != other.cwd) return false
        if (this.swd != other.swd) return false
        if (this.ftw != other.ftw) return false
        if (this.fop != other.fop) return false
        if (this.rip != other.rip) return false
        if (this.rdp != other.rdp) return false
        if (this.mxcsr != other.mxcsr) return false
        if (this.mxcrMask != other.mxcrMask) return false
        if (!this.stSpace.contentEquals(other.stSpace)) return false
        if (!this.xmmSpace.contentEquals(other.xmmSpace)) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cwd.hashCode()
        result = 31 * result + this.swd.hashCode()
        result = 31 * result + this.ftw.hashCode()
        result = 31 * result + this.fop.hashCode()
        result = 31 * result + this.rip.hashCode()
        result = 31 * result + this.rdp.hashCode()
        result = 31 * result + this.mxcsr.hashCode()
        result = 31 * result + this.mxcrMask.hashCode()
        result = 31 * result + this.stSpace.contentHashCode()
        result = 31 * result + this.xmmSpace.contentHashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class CAnonymousUcSigmask(
    public var ucSigmask: SigsetT = SigsetT(),
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
