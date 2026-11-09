package io.github.kotlinmania.libc.unix.linuxlike.android.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
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

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stNlink: CUlong,
    public var stMode: CUint,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stSize: Off64T,
    public var stBlksize: CLong,
    public var stBlocks: CLong,
    public var stAtime: CLong,
    public var stAtimeNsec: CLong,
    public var stMtime: CLong,
    public var stMtimeNsec: CLong,
    public var stCtime: CLong,
    public var stCtimeNsec: CLong,
    public var unused: List<CLong>,
)

public open class Stat64(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stNlink: CUlong,
    public var stMode: CUint,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stSize: Off64T,
    public var stBlksize: CLong,
    public var stBlocks: CLong,
    public var stAtime: CLong,
    public var stAtimeNsec: CLong,
    public var stMtime: CLong,
    public var stMtimeNsec: CLong,
    public var stCtime: CLong,
    public var stCtimeNsec: CLong,
    public var unused: List<CLong>,
)

public open class LibcXmmreg(public var element: List<UInt>)

public open class UserRegsStruct(
    public var r15: CUlong,
    public var r14: CUlong,
    public var r13: CUlong,
    public var r12: CUlong,
    public var rbp: CUlong,
    public var rbx: CUlong,
    public var r11: CUlong,
    public var r10: CUlong,
    public var r9: CUlong,
    public var r8: CUlong,
    public var rax: CUlong,
    public var rcx: CUlong,
    public var rdx: CUlong,
    public var rsi: CUlong,
    public var rdi: CUlong,
    public var origRax: CUlong,
    public var rip: CUlong,
    public var cs: CUlong,
    public var eflags: CUlong,
    public var rsp: CUlong,
    public var ss: CUlong,
    public var fsBase: CUlong,
    public var gsBase: CUlong,
    public var ds: CUlong,
    public var es: CUlong,
    public var fs: CUlong,
    public var gs: CUlong,
)

public open class User(
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
    public var uAr0: UserRegsStruct?,
    public var uFpstate: UserFpregsStruct?,
    public var magic: CUlong,
    public var uComm: List<CChar>,
    public var uDebugreg: List<CUlong>,
    public var errorCode: CUlong,
    public var faultAddress: CUlong,
)

public open class LibcFpxreg(
    public var significand: List<UShort>,
    public var exponent: UShort,
    public var padding: List<UShort>,
)

public open class LibcFpstate(
    public var cwd: UShort,
    public var swd: UShort,
    public var ftw: UShort,
    public var fop: UShort,
    public var rip: ULong,
    public var rdp: ULong,
    public var mxcsr: UInt,
    public var mxcrMask: UInt,
    public var st: List<LibcFpxreg>,
    public var xmm: List<LibcXmmreg>,
    public var private: List<UInt>,
)

public open class McontextT(
    public var gregs: List<GregT>,
    public var fpregs: LibcFpstate?,
    public var private: List<ULong>,
)

public open class UcontextT(
    public var ucFlags: CUlong,
    public var ucLink: UcontextT?,
    public var ucStack: StackT,
    public var ucMcontext: McontextT,
    public var ucSigmask64: CAnonymousUcSigmask,
    public var fpregsMem: LibcFpstate,
)

public open class UserFpregsStruct(
    public var cwd: CUshort,
    public var swd: CUshort,
    public var ftw: CUshort,
    public var fop: CUshort,
    public var rip: CUlong,
    public var rdp: CUlong,
    public var mxcsr: CUint,
    public var mxcrMask: CUint,
    public var stSpace: List<CUint>,
    public var xmmSpace: List<CUint>,
    public var padding: List<CUint>,
)

public open class CAnonymousUcSigmask(public var ucSigmask: SigsetT? = null, public var ucSigmask64: Sigset64T? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_uc_sigmask").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousUcSigmask): Boolean {
        return this.ucSigmask == other.ucSigmask
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.ucSigmask).hashCode()
        return state
    }
}

public open class MaxAlignT(public var priv: List<Double>)
