// port-lint: source libc/src/unix/bsd/freebsdlike/freebsd/aarch64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public typealias ClockT = Int
public typealias WcharT = UInt
public typealias TimeT = Long
public typealias SusecondsT = Long
public typealias RegisterT = Long

public data class Gpregs(
    val gpX: List<RegisterT>,
    val gpLr: RegisterT,
    val gpSp: RegisterT,
    val gpElr: RegisterT,
    val gpSpsr: UInt,
    val gpPad: CInt,
)

public data class Fpregs(
    val fpQ: ByteArray,
    val fpSr: UInt,
    val fpCr: UInt,
    val fpFlags: CInt,
    val fpPad: CInt,
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
