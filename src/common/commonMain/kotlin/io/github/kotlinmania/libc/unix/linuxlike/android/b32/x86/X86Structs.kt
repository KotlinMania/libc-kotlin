package io.github.kotlinmania.libc.unix.linuxlike.android.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.linuxlike.android.StackT
import io.github.kotlinmania.libc.unix.linuxlike.android.b32.Sigset64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b32.SigsetT

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

public open class LibcFpreg(public var significand: List<UShort>, public var exponent: UShort)

public open class LibcFpstate(
    public var cw: CUlong,
    public var sw: CUlong,
    public var tag: CUlong,
    public var ipoff: CUlong,
    public var cssel: CUlong,
    public var dataoff: CUlong,
    public var datasel: CUlong,
    public var st: List<LibcFpreg>,
    public var status: CUlong,
)

public open class McontextT(
    public var gregs: List<GregT>,
    public var fpregs: LibcFpstate?,
    public var oldmask: CUlong,
    public var cr2: CUlong,
)

public open class CAnonymousUcSigmaskWithPadding(
    public var ucSigmask: SigsetT,
    // Android has a wrong (smaller) sigsetT on x86.
    public var paddingRtSigset: UInt,
)

public open class UcontextT(
    public var ucFlags: CUlong,
    public var ucLink: UcontextT?,
    public var ucStack: StackT,
    public var ucMcontext: McontextT,
    public var ucSigmaskCAnonymousUnion: CAnonymousUcSigmask,
    public var paddingRtSigset: UInt,
    public var fpregsMem: LibcFpstate,
)

public open class CAnonymousUcSigmask(public var ucSigmask: CAnonymousUcSigmaskWithPadding? = null, public var ucSigmask64: Sigset64T? = null) {
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
