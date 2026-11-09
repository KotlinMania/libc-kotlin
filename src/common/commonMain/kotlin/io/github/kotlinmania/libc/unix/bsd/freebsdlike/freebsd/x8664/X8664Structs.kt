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

public open class Reg32(
    public var rFs: UInt,
    public var rEs: UInt,
    public var rDs: UInt,
    public var rEdi: UInt,
    public var rEsi: UInt,
    public var rEbp: UInt,
    public var rIsp: UInt,
    public var rEbx: UInt,
    public var rEdx: UInt,
    public var rEcx: UInt,
    public var rEax: UInt,
    public var rTrapno: UInt,
    public var rErr: UInt,
    public var rEip: UInt,
    public var rCs: UInt,
    public var rEflags: UInt,
    public var rEsp: UInt,
    public var rSs: UInt,
    public var rGs: UInt,
)

public open class Reg(
    public var rR15: Long,
    public var rR14: Long,
    public var rR13: Long,
    public var rR12: Long,
    public var rR11: Long,
    public var rR10: Long,
    public var rR9: Long,
    public var rR8: Long,
    public var rRdi: Long,
    public var rRsi: Long,
    public var rRbp: Long,
    public var rRbx: Long,
    public var rRdx: Long,
    public var rRcx: Long,
    public var rRax: Long,
    public var rTrapno: UInt,
    public var rFs: UShort,
    public var rGs: UShort,
    public var rErr: UInt,
    public var rEs: UShort,
    public var rDs: UShort,
    public var rRip: Long,
    public var rCs: Long,
    public var rRflags: Long,
    public var rRsp: Long,
    public var rSs: Long,
)

public open class Fpreg32(
    public var fprEnv: List<UInt>,
    public var fprAcc: List<List<UByte>>,
    public var fprExSw: UInt,
    public var fprPad: List<UByte>,
)

public open class Fpreg(
    public var fprEnv: List<ULong>,
    public var fprAcc: List<List<UByte>>,
    public var fprXacc: List<List<UByte>>,
    public var fprSpare: List<ULong>,
)

public open class Xmmreg(
    public var xmmEnv: List<UInt>,
    public var xmmAcc: List<List<UByte>>,
    public var xmmReg: List<List<UByte>>,
    public var xmmPad: List<UByte>,
)

public open class McontextT(
    public var mcOnstack: RegisterT,
    public var mcRdi: RegisterT,
    public var mcRsi: RegisterT,
    public var mcRdx: RegisterT,
    public var mcRcx: RegisterT,
    public var mcR8: RegisterT,
    public var mcR9: RegisterT,
    public var mcRax: RegisterT,
    public var mcRbx: RegisterT,
    public var mcRbp: RegisterT,
    public var mcR10: RegisterT,
    public var mcR11: RegisterT,
    public var mcR12: RegisterT,
    public var mcR13: RegisterT,
    public var mcR14: RegisterT,
    public var mcR15: RegisterT,
    public var mcTrapno: UInt,
    public var mcFs: UShort,
    public var mcGs: UShort,
    public var mcAddr: RegisterT,
    public var mcFlags: UInt,
    public var mcEs: UShort,
    public var mcDs: UShort,
    public var mcErr: RegisterT,
    public var mcRip: RegisterT,
    public var mcCs: RegisterT,
    public var mcRflags: RegisterT,
    public var mcRsp: RegisterT,
    public var mcSs: RegisterT,
    public var mcLen: CLong,
    public var mcFpformat: CLong,
    public var mcOwnedfp: CLong,
    public var mcFpstate: List<CLong>,
    public var mcFsbase: RegisterT,
    public var mcGsbase: RegisterT,
    public var mcXfpustate: RegisterT,
    public var mcXfpustateLen: RegisterT,
    // freebsd < 15
    public var mcSpare: List<CLong>,
    // freebsd >= 15
    public var mcTlsbase: RegisterT,
)

public open class CAnonymousElf64AuxvUnion(
    public var aVal: CLong? = null,
    public var aPtr: COpaquePointer?? = null,
    public var aFcn: CAnonymousElf64AuxvUnionAFcnCallback? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_elf64_auxv_union").finishNonExhaustive()
    }

    // Note(msrv): suggested method was added in 1.85
    public open fun eq(other: CAnonymousElf64AuxvUnion): Boolean {
        return this.aVal == other.aVal || this.aPtr == other.aPtr || this.aFcn == other.aFcn
    }
}

public open class Elf64Auxinfo(public var aType: CLong, public var aUn: CAnonymousElf64AuxvUnion)

public open class MaxAlignT(public var priv: List<Double>)
