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

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct = apply {
        fields.add("$name: $value")
    }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append(name).append(" { ").append(fields.joinToString(", ")).append(" }")
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

public data class LibcXmmreg(public var element: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LibcXmmreg) return false
        if (!this.element.contentEquals(other.element)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.element.contentHashCode()
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

public class User(
    public var regs: UserRegsStruct = UserRegsStruct(),
    public var uFpvalid: CInt = 0,
    public var i387: UserFpregsStruct = UserFpregsStruct(),
    public var uTsize: CUlong = 0uL,
    public var uDsize: CUlong = 0uL,
    public var uSsize: CUlong = 0uL,
    public var startCode: CUlong = 0uL,
    public var startStack: CUlong = 0uL,
    public var signal: CLong = 0L,
    public var reserved: CInt = 0,
    public var uAr0: UserRegsStruct? = null,
    public var uFpstate: UserFpregsStruct? = null,
    public var magic: CUlong = 0uL,
    public var uComm: UByteArray = UByteArray(32),
    public var uDebugreg: ULongArray = ULongArray(8),
    public var errorCode: CUlong = 0uL,
    public var faultAddress: CUlong = 0uL,
)

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

public data class McontextT(
    public var gregs: LongArray = LongArray(23),
    public var fpregs: LibcFpstate? = null,
    public var private: ULongArray = ULongArray(8),
) {
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
}

public data class UcontextT(
    public var ucFlags: CUlong = 0uL,
    public var ucLink: UcontextT? = null,
    public var ucStack: StackT = StackT(),
    public var ucMcontext: McontextT = McontextT(),
    public var ucSigmask64: CAnonymousUcSigmask = CAnonymousUcSigmask(),
    public var fpregsMem: LibcFpstate = LibcFpstate(),
)

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

public data class CAnonymousUcSigmask(public var ucSigmask: SigsetT = SigsetT(), public var ucSigmask64: Sigset64T = Sigset64T()) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_uc_sigmask").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousUcSigmask): Boolean {
        return this.ucSigmask == other.ucSigmask
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.ucSigmask).hashCode()
        return state
    }
}

public data class MaxAlignT(public var priv: DoubleArray = DoubleArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.priv.contentHashCode()
    }
}
