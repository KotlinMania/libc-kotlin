@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer

public fun interface CAnonymousElf64AuxvUnionAFcnCallback {
    public operator fun invoke()
}

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

public class Reg32(
    public var rFs: UInt = 0u,
    public var rEs: UInt = 0u,
    public var rDs: UInt = 0u,
    public var rEdi: UInt = 0u,
    public var rEsi: UInt = 0u,
    public var rEbp: UInt = 0u,
    public var rIsp: UInt = 0u,
    public var rEbx: UInt = 0u,
    public var rEdx: UInt = 0u,
    public var rEcx: UInt = 0u,
    public var rEax: UInt = 0u,
    public var rTrapno: UInt = 0u,
    public var rErr: UInt = 0u,
    public var rEip: UInt = 0u,
    public var rCs: UInt = 0u,
    public var rEflags: UInt = 0u,
    public var rEsp: UInt = 0u,
    public var rSs: UInt = 0u,
    public var rGs: UInt = 0u,
)

public class Reg(
    public var rR15: Long = 0L,
    public var rR14: Long = 0L,
    public var rR13: Long = 0L,
    public var rR12: Long = 0L,
    public var rR11: Long = 0L,
    public var rR10: Long = 0L,
    public var rR9: Long = 0L,
    public var rR8: Long = 0L,
    public var rRdi: Long = 0L,
    public var rRsi: Long = 0L,
    public var rRbp: Long = 0L,
    public var rRbx: Long = 0L,
    public var rRdx: Long = 0L,
    public var rRcx: Long = 0L,
    public var rRax: Long = 0L,
    public var rTrapno: UInt = 0u,
    public var rFs: UShort = 0u,
    public var rGs: UShort = 0u,
    public var rErr: UInt = 0u,
    public var rEs: UShort = 0u,
    public var rDs: UShort = 0u,
    public var rRip: Long = 0L,
    public var rCs: Long = 0L,
    public var rRflags: Long = 0L,
    public var rRsp: Long = 0L,
    public var rSs: Long = 0L,
)

public data class Fpreg32(
    public var fprEnv: UIntArray = UIntArray(7),
    public var fprAcc: List<UByteArray> = List(8) { UByteArray(0) },
    public var fprExSw: UInt = 0u,
    public var fprPad: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fpreg32) return false
        if (!this.fprEnv.contentEquals(other.fprEnv)) return false
        if (this.fprAcc != other.fprAcc) return false
        if (this.fprExSw != other.fprExSw) return false
        if (!this.fprPad.contentEquals(other.fprPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fprEnv.contentHashCode()
        result = 31 * result + this.fprAcc.hashCode()
        result = 31 * result + this.fprExSw.hashCode()
        result = 31 * result + this.fprPad.contentHashCode()
        return result
    }
}

public data class Fpreg(
    public var fprEnv: ULongArray = ULongArray(4),
    public var fprAcc: List<UByteArray> = List(8) { UByteArray(0) },
    public var fprXacc: List<UByteArray> = List(16) { UByteArray(0) },
    public var fprSpare: ULongArray = ULongArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fpreg) return false
        if (!this.fprEnv.contentEquals(other.fprEnv)) return false
        if (this.fprAcc != other.fprAcc) return false
        if (this.fprXacc != other.fprXacc) return false
        if (!this.fprSpare.contentEquals(other.fprSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fprEnv.contentHashCode()
        result = 31 * result + this.fprAcc.hashCode()
        result = 31 * result + this.fprXacc.hashCode()
        result = 31 * result + this.fprSpare.contentHashCode()
        return result
    }
}

public data class Xmmreg(
    public var xmmEnv: UIntArray = UIntArray(8),
    public var xmmAcc: List<UByteArray> = List(8) { UByteArray(0) },
    public var xmmReg: List<UByteArray> = List(8) { UByteArray(0) },
    public var xmmPad: UByteArray = UByteArray(224),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xmmreg) return false
        if (!this.xmmEnv.contentEquals(other.xmmEnv)) return false
        if (this.xmmAcc != other.xmmAcc) return false
        if (this.xmmReg != other.xmmReg) return false
        if (!this.xmmPad.contentEquals(other.xmmPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.xmmEnv.contentHashCode()
        result = 31 * result + this.xmmAcc.hashCode()
        result = 31 * result + this.xmmReg.hashCode()
        result = 31 * result + this.xmmPad.contentHashCode()
        return result
    }
}

public class McontextT(
    public var mcOnstack: RegisterT = 0L,
    public var mcRdi: RegisterT = 0L,
    public var mcRsi: RegisterT = 0L,
    public var mcRdx: RegisterT = 0L,
    public var mcRcx: RegisterT = 0L,
    public var mcR8: RegisterT = 0L,
    public var mcR9: RegisterT = 0L,
    public var mcRax: RegisterT = 0L,
    public var mcRbx: RegisterT = 0L,
    public var mcRbp: RegisterT = 0L,
    public var mcR10: RegisterT = 0L,
    public var mcR11: RegisterT = 0L,
    public var mcR12: RegisterT = 0L,
    public var mcR13: RegisterT = 0L,
    public var mcR14: RegisterT = 0L,
    public var mcR15: RegisterT = 0L,
    public var mcTrapno: UInt = 0u,
    public var mcFs: UShort = 0u,
    public var mcGs: UShort = 0u,
    public var mcAddr: RegisterT = 0L,
    public var mcFlags: UInt = 0u,
    public var mcEs: UShort = 0u,
    public var mcDs: UShort = 0u,
    public var mcErr: RegisterT = 0L,
    public var mcRip: RegisterT = 0L,
    public var mcCs: RegisterT = 0L,
    public var mcRflags: RegisterT = 0L,
    public var mcRsp: RegisterT = 0L,
    public var mcSs: RegisterT = 0L,
    public var mcLen: CLong = 0L,
    public var mcFpformat: CLong = 0L,
    public var mcOwnedfp: CLong = 0L,
    public var mcFpstate: LongArray = LongArray(64),
    public var mcFsbase: RegisterT = 0L,
    public var mcGsbase: RegisterT = 0L,
    public var mcXfpustate: RegisterT = 0L,
    public var mcXfpustateLen: RegisterT = 0L,
    // freebsd < 15
    public var mcSpare: LongArray = LongArray(4),
    // freebsd >= 15
    public var mcTlsbase: RegisterT = 0L,
)

public data class CAnonymousElf64AuxvUnion(
    public var aVal: CLong = 0L,
    public var aPtr: COpaquePointer? = null,
    public var aFcn: CAnonymousElf64AuxvUnionAFcnCallback = CAnonymousElf64AuxvUnionAFcnCallback {},
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_elf64_auxv_union").finishNonExhaustive()
    }

    // Note(msrv): suggested method was added in 1.85
    public fun eq(other: CAnonymousElf64AuxvUnion): Boolean = this.aVal == other.aVal || this.aPtr == other.aPtr || this.aFcn == other.aFcn
}

public data class Elf64Auxinfo(
    public var aType: CLong = 0L,
    public var aUn: CAnonymousElf64AuxvUnion = CAnonymousElf64AuxvUnion(),
)

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
}
