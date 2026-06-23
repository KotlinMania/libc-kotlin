// port-lint: source unix/bsd/netbsdlike/openbsd/x86_64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias UcontextT = Sigcontext

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

public data class Fxsave64(
    val fxFcw: UShort,
    val fxFsw: UShort,
    val fxFtw: UByte,
    val fxFop: UShort,
    val fxRip: ULong,
    val fxRdp: ULong,
    val fxMxcsr: UInt,
    val fxMxcsrMask: UInt,
    val fxSt: List<ULongArray>,
    val fxXmm: List<ULongArray>,
)

public const val _MAX_PAGE_SHIFT: UInt = 12u
public const val PT_STEP: CInt = PT_FIRSTMACH + 0
public const val PT_GETREGS: CInt = PT_FIRSTMACH + 1
public const val PT_SETREGS: CInt = PT_FIRSTMACH + 2
public const val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3
public const val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4
