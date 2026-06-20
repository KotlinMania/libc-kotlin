// port-lint: source unix/bsd/netbsdlike/openbsd/x86_64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public typealias UcontextT = Sigcontext

// __sc_unused is layout padding.
public data class Sigcontext(
    val scRdi: CLong,
    val scRsi: CLong,
    val scRdx: CLong,
    val scRcx: CLong,
    val scR8: CLong,
    val scR9: CLong,
    val scR10: CLong,
    val scR11: CLong,
    val scR12: CLong,
    val scR13: CLong,
    val scR14: CLong,
    val scR15: CLong,
    val scRbp: CLong,
    val scRbx: CLong,
    val scRax: CLong,
    val scGs: CLong,
    val scFs: CLong,
    val scEs: CLong,
    val scDs: CLong,
    val scTrapno: CLong,
    val scErr: CLong,
    val scRip: CLong,
    val scCs: CLong,
    val scRflags: CLong,
    val scRsp: CLong,
    val scSs: CLong,
    val scFpstate: Fxsave64?,
    val scMask: CInt,
    val scCookie: CLong,
)

// repr(packed). __fx_unused1 / __fx_unused3 are layout padding.
// fx_st is [[u64; 2]; 8] (flattened to 16) and fx_xmm is [[u64; 2]; 16] (flattened to 32).
public data class Fxsave64(
    val fxFcw: UShort,
    val fxFsw: UShort,
    val fxFtw: UByte,
    val fxFop: UShort,
    val fxRip: ULong,
    val fxRdp: ULong,
    val fxMxcsr: UInt,
    val fxMxcsrMask: UInt,
    val fxSt: ULongArray,
    val fxXmm: ULongArray,
) {
    init {
        require(fxSt.size == 16) { "fx_st must be 16 entries (8 x 2)" }
        require(fxXmm.size == 32) { "fx_xmm must be 32 entries (16 x 2)" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Fxsave64
        return fxFcw == other.fxFcw && fxFsw == other.fxFsw && fxFtw == other.fxFtw &&
            fxFop == other.fxFop && fxRip == other.fxRip && fxRdp == other.fxRdp &&
            fxMxcsr == other.fxMxcsr && fxMxcsrMask == other.fxMxcsrMask &&
            fxSt.contentEquals(other.fxSt) && fxXmm.contentEquals(other.fxXmm)
    }

    override fun hashCode(): Int {
        var result = fxFcw.hashCode()
        result = 31 * result + fxSt.contentHashCode()
        result = 31 * result + fxXmm.contentHashCode()
        return result
    }
}

// _ALIGNBYTES = size_of::<c_long>() - 1
internal const val ALIGNBYTES: Int = 7

public const val MAX_PAGE_SHIFT: UInt = 12u

public const val PT_STEP: CInt = PT_FIRSTMACH + 0
public const val PT_GETREGS: CInt = PT_FIRSTMACH + 1
public const val PT_SETREGS: CInt = PT_FIRSTMACH + 2
public const val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3
public const val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4
