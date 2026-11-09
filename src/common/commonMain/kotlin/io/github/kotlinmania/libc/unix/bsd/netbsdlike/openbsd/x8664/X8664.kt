// port-lint: source unix/bsd/netbsdlike/openbsd/x86_64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.PT_FIRSTMACH

public typealias UcontextT = Sigcontext

public class Sigcontext(
    public var scRdi: CLong = 0L,
    public var scRsi: CLong = 0L,
    public var scRdx: CLong = 0L,
    public var scRcx: CLong = 0L,
    public var scR8: CLong = 0L,
    public var scR9: CLong = 0L,
    public var scR10: CLong = 0L,
    public var scR11: CLong = 0L,
    public var scR12: CLong = 0L,
    public var scR13: CLong = 0L,
    public var scR14: CLong = 0L,
    public var scR15: CLong = 0L,
    public var scRbp: CLong = 0L,
    public var scRbx: CLong = 0L,
    public var scRax: CLong = 0L,
    public var scGs: CLong = 0L,
    public var scFs: CLong = 0L,
    public var scEs: CLong = 0L,
    public var scDs: CLong = 0L,
    public var scTrapno: CLong = 0L,
    public var scErr: CLong = 0L,
    public var scRip: CLong = 0L,
    public var scCs: CLong = 0L,
    public var scRflags: CLong = 0L,
    public var scRsp: CLong = 0L,
    public var scSs: CLong = 0L,
    public var scFpstate: Fxsave64? = null,
    public var scUnused: CInt = 0,
    public var scMask: CInt = 0,
    public var scCookie: CLong = 0L,
)

public data class Fxsave64(
    public var fxFcw: UShort = 0u,
    public var fxFsw: UShort = 0u,
    public var fxFtw: UByte = 0u,
    public var fxUnused1: UByte = 0u,
    public var fxFop: UShort = 0u,
    public var fxRip: ULong = 0uL,
    public var fxRdp: ULong = 0uL,
    public var fxMxcsr: UInt = 0u,
    public var fxMxcsrMask: UInt = 0u,
    public var fxSt: List<ULongArray> = List(8) { ULongArray(0) },
    public var fxXmm: List<ULongArray> = List(16) { ULongArray(0) },
    public var fxUnused3: UByteArray = UByteArray(96),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fxsave64) return false
        if (this.fxFcw != other.fxFcw) return false
        if (this.fxFsw != other.fxFsw) return false
        if (this.fxFtw != other.fxFtw) return false
        if (this.fxUnused1 != other.fxUnused1) return false
        if (this.fxFop != other.fxFop) return false
        if (this.fxRip != other.fxRip) return false
        if (this.fxRdp != other.fxRdp) return false
        if (this.fxMxcsr != other.fxMxcsr) return false
        if (this.fxMxcsrMask != other.fxMxcsrMask) return false
        if (this.fxSt != other.fxSt) return false
        if (this.fxXmm != other.fxXmm) return false
        if (!this.fxUnused3.contentEquals(other.fxUnused3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fxFcw.hashCode()
        result = 31 * result + this.fxFsw.hashCode()
        result = 31 * result + this.fxFtw.hashCode()
        result = 31 * result + this.fxUnused1.hashCode()
        result = 31 * result + this.fxFop.hashCode()
        result = 31 * result + this.fxRip.hashCode()
        result = 31 * result + this.fxRdp.hashCode()
        result = 31 * result + this.fxMxcsr.hashCode()
        result = 31 * result + this.fxMxcsrMask.hashCode()
        result = 31 * result + this.fxSt.hashCode()
        result = 31 * result + this.fxXmm.hashCode()
        result = 31 * result + this.fxUnused3.contentHashCode()
        return result
    }
}

internal val ALIGNBYTES: Int = 8 - 1

public val MAX_PAGE_SHIFT: UInt = 12u

public val PT_STEP: CInt = PT_FIRSTMACH + 0

public val PT_GETREGS: CInt = PT_FIRSTMACH + 1

public val PT_SETREGS: CInt = PT_FIRSTMACH + 2

public val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3

public val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4
