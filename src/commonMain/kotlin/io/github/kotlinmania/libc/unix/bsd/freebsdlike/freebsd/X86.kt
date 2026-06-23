// port-lint: source unix/bsd/freebsdlike/freebsd/x86.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias ClockT = CULong
public typealias WcharT = Int
public typealias TimeT = Int
public typealias SusecondsT = Int
public typealias RegisterT = Int

public data class McontextT(
    val mcOnstack: RegisterT,
    val mcGs: RegisterT,
    val mcFs: RegisterT,
    val mcEs: RegisterT,
    val mcDs: RegisterT,
    val mcEdi: RegisterT,
    val mcEsi: RegisterT,
    val mcEbp: RegisterT,
    val mcIsp: RegisterT,
    val mcEbx: RegisterT,
    val mcEdx: RegisterT,
    val mcEcx: RegisterT,
    val mcEax: RegisterT,
    val mcTrapno: RegisterT,
    val mcErr: RegisterT,
    val mcEip: RegisterT,
    val mcCs: RegisterT,
    val mcEflags: RegisterT,
    val mcEsp: RegisterT,
    val mcSs: RegisterT,
    val mcLen: CInt,
    val mcFpformat: CInt,
    val mcOwnedfp: CInt,
    val mcFlags: RegisterT,
    val mcFpstate: IntArray,
    val mcFsbase: RegisterT,
    val mcGsbase: RegisterT,
    val mcXfpustate: RegisterT,
    val mcXfpustateLen: RegisterT,
    val mcSpare2: IntArray,
)

public const val MINSIGSTKSZ: ULong = 2048uL
public const val BIOCSRTIMEOUT: CULong = 0x8008426duL
public const val BIOCGRTIMEOUT: CULong = 0x4008426euL
public const val KINFO_FILE_SIZE: CInt = 1392
public const val TIOCTIMESTAMP: CULong = 0x40087459uL
