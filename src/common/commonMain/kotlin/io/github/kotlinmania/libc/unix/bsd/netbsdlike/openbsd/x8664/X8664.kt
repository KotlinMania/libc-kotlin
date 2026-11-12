// port-lint: source unix/bsd/netbsdlike/openbsd/x86_64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.PT_FIRSTMACH
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias UcontextT = Sigcontext

public class Sigcontext internal constructor(
    public var scRdi: CLong,
    public var scRsi: CLong,
    public var scRdx: CLong,
    public var scRcx: CLong,
    public var scR8: CLong,
    public var scR9: CLong,
    public var scR10: CLong,
    public var scR11: CLong,
    public var scR12: CLong,
    public var scR13: CLong,
    public var scR14: CLong,
    public var scR15: CLong,
    public var scRbp: CLong,
    public var scRbx: CLong,
    public var scRax: CLong,
    public var scGs: CLong,
    public var scFs: CLong,
    public var scEs: CLong,
    public var scDs: CLong,
    public var scTrapno: CLong,
    public var scErr: CLong,
    public var scRip: CLong,
    public var scCs: CLong,
    public var scRflags: CLong,
    public var scRsp: CLong,
    public var scSs: CLong,
    scFpstateCtorArg: MutPtr<Fxsave64>,
    public var scUnused: CInt,
    public var scMask: CInt,
    public var scCookie: CLong,
) {
    public var scFpstate: MutPtr<Fxsave64> = scFpstateCtorArg
        internal set

    public constructor() : this(
        scRdi = 0L,
        scRsi = 0L,
        scRdx = 0L,
        scRcx = 0L,
        scR8 = 0L,
        scR9 = 0L,
        scR10 = 0L,
        scR11 = 0L,
        scR12 = 0L,
        scR13 = 0L,
        scR14 = 0L,
        scR15 = 0L,
        scRbp = 0L,
        scRbx = 0L,
        scRax = 0L,
        scGs = 0L,
        scFs = 0L,
        scEs = 0L,
        scDs = 0L,
        scTrapno = 0L,
        scErr = 0L,
        scRip = 0L,
        scCs = 0L,
        scRflags = 0L,
        scRsp = 0L,
        scSs = 0L,
        scFpstateCtorArg = MutPtr(0L),
        scUnused = 0,
        scMask = 0,
        scCookie = 0L,
    )

    public companion object {
        public operator fun invoke(
            scRdi: CLong = 0L,
            scRsi: CLong = 0L,
            scRdx: CLong = 0L,
            scRcx: CLong = 0L,
            scR8: CLong = 0L,
            scR9: CLong = 0L,
            scR10: CLong = 0L,
            scR11: CLong = 0L,
            scR12: CLong = 0L,
            scR13: CLong = 0L,
            scR14: CLong = 0L,
            scR15: CLong = 0L,
            scRbp: CLong = 0L,
            scRbx: CLong = 0L,
            scRax: CLong = 0L,
            scGs: CLong = 0L,
            scFs: CLong = 0L,
            scEs: CLong = 0L,
            scDs: CLong = 0L,
            scTrapno: CLong = 0L,
            scErr: CLong = 0L,
            scRip: CLong = 0L,
            scCs: CLong = 0L,
            scRflags: CLong = 0L,
            scRsp: CLong = 0L,
            scSs: CLong = 0L,
            scFpstate: MutPtr<Fxsave64> = MutPtr(0L),
            scUnused: CInt = 0,
            scMask: CInt = 0,
            scCookie: CLong = 0L,
        ): Sigcontext =
            Sigcontext(
                scRdi = scRdi,
                scRsi = scRsi,
                scRdx = scRdx,
                scRcx = scRcx,
                scR8 = scR8,
                scR9 = scR9,
                scR10 = scR10,
                scR11 = scR11,
                scR12 = scR12,
                scR13 = scR13,
                scR14 = scR14,
                scR15 = scR15,
                scRbp = scRbp,
                scRbx = scRbx,
                scRax = scRax,
                scGs = scGs,
                scFs = scFs,
                scEs = scEs,
                scDs = scDs,
                scTrapno = scTrapno,
                scErr = scErr,
                scRip = scRip,
                scCs = scCs,
                scRflags = scRflags,
                scRsp = scRsp,
                scSs = scSs,
                scFpstateCtorArg = scFpstate,
                scUnused = scUnused,
                scMask = scMask,
                scCookie = scCookie,
            )
    }
}

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

public val MAX_PAGE_SHIFT: UInt = 12u

public val PT_STEP: CInt = PT_FIRSTMACH + 0

public val PT_GETREGS: CInt = PT_FIRSTMACH + 1

public val PT_SETREGS: CInt = PT_FIRSTMACH + 2

public val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3

public val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4

internal val ALIGNBYTES: Int = sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>()) - 1
