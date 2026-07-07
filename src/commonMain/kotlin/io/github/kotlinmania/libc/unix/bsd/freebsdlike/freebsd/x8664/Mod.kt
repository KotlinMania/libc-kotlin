// port-lint: source unix/bsd/freebsdlike/freebsd/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x8664

import io.github.kotlinmania.libc.*

public typealias ClockT = Int
public typealias WcharT = Int
public typealias TimeT = Long
public typealias SusecondsT = Long
public typealias RegisterT = Long

public data class Reg32(
    val rFs: UInt,
    val rEs: UInt,
    val rDs: UInt,
    val rEdi: UInt,
    val rEsi: UInt,
    val rEbp: UInt,
    val rIsp: UInt,
    val rEbx: UInt,
    val rEdx: UInt,
    val rEcx: UInt,
    val rEax: UInt,
    val rTrapno: UInt,
    val rErr: UInt,
    val rEip: UInt,
    val rCs: UInt,
    val rEflags: UInt,
    val rEsp: UInt,
    val rSs: UInt,
    val rGs: UInt,
)

public data class Reg(
    val rR15: Long,
    val rR14: Long,
    val rR13: Long,
    val rR12: Long,
    val rR11: Long,
    val rR10: Long,
    val rR9: Long,
    val rR8: Long,
    val rRdi: Long,
    val rRsi: Long,
    val rRbp: Long,
    val rRbx: Long,
    val rRdx: Long,
    val rRcx: Long,
    val rRax: Long,
    val rTrapno: UInt,
    val rFs: UShort,
    val rGs: UShort,
    val rErr: UInt,
    val rEs: UShort,
    val rDs: UShort,
    val rRip: Long,
    val rCs: Long,
    val rRflags: Long,
    val rRsp: Long,
    val rSs: Long,
)

public data class Fpreg32(
    val fprEnv: UIntArray,
    val fprAcc: List<UByteArray>,
    val fprExSw: UInt,
    val fprPad: UByteArray,
)

public data class Fpreg(
    val fprEnv: ULongArray,
    val fprAcc: List<UByteArray>,
    val fprXacc: List<UByteArray>,
    val fprSpare: ULongArray,
)

public data class Xmmreg(
    val xmmEnv: UIntArray,
    val xmmAcc: List<UByteArray>,
    val xmmReg: List<UByteArray>,
    val xmmPad: UByteArray,
)

public data class McontextT(
    val mcOnstack: RegisterT,
    val mcRdi: RegisterT,
    val mcRsi: RegisterT,
    val mcRdx: RegisterT,
    val mcRcx: RegisterT,
    val mcR8: RegisterT,
    val mcR9: RegisterT,
    val mcRax: RegisterT,
    val mcRbx: RegisterT,
    val mcRbp: RegisterT,
    val mcR10: RegisterT,
    val mcR11: RegisterT,
    val mcR12: RegisterT,
    val mcR13: RegisterT,
    val mcR14: RegisterT,
    val mcR15: RegisterT,
    val mcTrapno: UInt,
    val mcFs: UShort,
    val mcGs: UShort,
    val mcAddr: RegisterT,
    val mcFlags: UInt,
    val mcEs: UShort,
    val mcDs: UShort,
    val mcErr: RegisterT,
    val mcRip: RegisterT,
    val mcCs: RegisterT,
    val mcRflags: RegisterT,
    val mcRsp: RegisterT,
    val mcSs: RegisterT,
    val mcLen: CLong,
    val mcFpformat: CLong,
    val mcOwnedfp: CLong,
    val mcFpstate: LongArray,
    val mcFsbase: RegisterT,
    val mcGsbase: RegisterT,
    val mcXfpustate: RegisterT,
    val mcXfpustateLen: RegisterT,
    val mcSpare: LongArray,
    val mcTlsbase: RegisterT,
    val mcSpare: LongArray,
)

public data class Elf64Auxinfo(
    val aType: CLong,
    val aUn: CAnonymousElf64AuxvUnion,
)

public data class MaxAlignT(
    val priv: List<Double>,
)

// C union; only one variant is valid at a time.
public data class CAnonymousElf64AuxvUnion(
    val aVal: CLong? = null,
    val aPtr: COpaquePointer? = null,
    val aFcn: (() -> Unit)? = null,
)

public const val BIOCSRTIMEOUT: CULong = 0x8010426duL
public const val BIOCGRTIMEOUT: CULong = 0x4010426euL
public const val MAP_32BIT: CInt = 0x00080000
public const val MINSIGSTKSZ: ULong = 2048uL
public const val _MC_HASSEGS: UInt = 0x1u
public const val _MC_HASBASES: UInt = 0x2u
public const val _MC_HASFPXSTATE: UInt = 0x4u
public const val _MC_FPFMT_NODEV: CLong = 0x10000
public const val _MC_FPFMT_XMM: CLong = 0x10002
public const val _MC_FPOWNED_NONE: CLong = 0x20000
public const val _MC_FPOWNED_FPU: CLong = 0x20001
public const val _MC_FPOWNED_PCB: CLong = 0x20002
public const val KINFO_FILE_SIZE: CInt = 1392
public const val TIOCTIMESTAMP: CULong = 0x40107459uL
