// port-lint: source unix/bsd/freebsdlike/freebsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public typealias ClockT = Int
public typealias WcharT = CInt
public typealias TimeT = Long
public typealias SusecondsT = CLong
public typealias RegisterT = Long

public data class Gpregs(
    val gpRa: RegisterT,
    val gpSp: RegisterT,
    val gpGp: RegisterT,
    val gpTp: RegisterT,
    val gpT: List<RegisterT>,
    val gpS: List<RegisterT>,
    val gpA: List<RegisterT>,
    val gpSepc: RegisterT,
    val gpSstatus: RegisterT,
)

public data class Fpregs(
    val fpX: List<ULongArray>,
    val fpFcsr: ULong,
    val fpFlags: CInt,
    val pad: CInt,
)

public data class McontextT(
    val mcGpregs: Gpregs,
    val mcFpregs: Fpregs,
    val mcFlags: CInt,
    val mcPad: CInt,
    val mcSpare: ULongArray,
)

public const val BIOCSRTIMEOUT: CULong = 0x8010426duL
public const val BIOCGRTIMEOUT: CULong = 0x4010426euL
public const val MAP_32BIT: CInt = 0x00080000
public const val MINSIGSTKSZ: ULong = 4096uL
public const val TIOCTIMESTAMP: CULong = 0x40107459uL
