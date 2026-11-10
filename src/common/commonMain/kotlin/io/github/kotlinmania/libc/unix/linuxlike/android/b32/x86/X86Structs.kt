@file:OptIn(ExperimentalUnsignedTypes::class)

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
)

public data class McontextT(
    public var gregs: IntArray = IntArray(19),
    public var fpregs: LibcFpstate? = null,
    public var oldmask: CUlong = 0uL,
    public var cr2: CUlong = 0uL,
) {
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
}

public data class CAnonymousUcSigmaskWithPadding(
    public var ucSigmask: SigsetT = 0uL,
    // Android has a wrong (smaller) sigsetT on x86.
    public var paddingRtSigset: UInt = 0u,
)

public data class UcontextT(
    public var ucFlags: CUlong = 0uL,
    public var ucLink: UcontextT? = null,
    public var ucStack: StackT = StackT(),
    public var ucMcontext: McontextT = McontextT(),
    public var ucSigmaskCAnonymousUnion: CAnonymousUcSigmask = CAnonymousUcSigmask(),
    public var paddingRtSigset: UInt = 0u,
    public var fpregsMem: LibcFpstate = LibcFpstate(),
)

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
}
