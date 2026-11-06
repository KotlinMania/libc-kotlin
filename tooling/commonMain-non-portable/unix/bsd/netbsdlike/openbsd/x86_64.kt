// port-lint: source unix/bsd/netbsdlike/openbsd/x86_64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.PT_FIRSTMACH

public typealias UcontextT = Sigcontext

public open class Sigcontext(
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
    public var scFpstate: Fxsave64?,
    public var scUnused: CInt,
    public var scMask: CInt,
    public var scCookie: CLong,
)

public open class Fxsave64(
    public var fxFcw: UShort,
    public var fxFsw: UShort,
    public var fxFtw: UByte,
    public var fxUnused1: UByte,
    public var fxFop: UShort,
    public var fxRip: ULong,
    public var fxRdp: ULong,
    public var fxMxcsr: UInt,
    public var fxMxcsrMask: UInt,
    public var fxSt: List<List<ULong>>,
    public var fxXmm: List<List<ULong>>,
    public var fxUnused3: List<UByte>,
)

internal val ALIGNBYTES: Int = sizeOf<CLong>() - 1

public val MAX_PAGE_SHIFT: UInt = 12u

public val PT_STEP: CInt = PT_FIRSTMACH + 0

public val PT_GETREGS: CInt = PT_FIRSTMACH + 1

public val PT_SETREGS: CInt = PT_FIRSTMACH + 2

public val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3

public val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4
