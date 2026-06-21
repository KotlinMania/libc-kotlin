// port-lint: source unix/bsd/freebsdlike/freebsd/powerpc64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias ClockT = UInt
public typealias WcharT = Int
public typealias TimeT = Long
public typealias SusecondsT = Long
public typealias RegisterT = Long

public data class McontextT(
    val mcVers: CInt,
    val mcFlags: CInt,
    val mcOnstack: CInt,
    val mcLen: CInt,
    val mcAvec: ULongArray,
    val mcAv: UIntArray,
    val mcFrame: List<RegisterT>,
    val mcFpreg: ULongArray,
    val mcVsxfpreg: ULongArray,
)

public const val BIOCSRTIMEOUT: CULong = 0x8010426duL
public const val BIOCGRTIMEOUT: CULong = 0x4010426euL
public const val MAP_32BIT: CInt = 0x00080000
public const val MINSIGSTKSZ: ULong = 2048uL
public const val TIOCTIMESTAMP: CULong = 0x40107459uL
