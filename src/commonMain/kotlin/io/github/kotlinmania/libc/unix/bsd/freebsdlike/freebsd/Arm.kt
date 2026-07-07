// port-lint: source unix/bsd/freebsdlike/freebsd/arm.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public typealias ClockT = UInt
public typealias WcharT = UInt
public typealias TimeT = Long
public typealias SusecondsT = Int
public typealias RegisterT = Int
public typealias GregT = CUInt
public typealias GregsetT = LongArray

public data class McontextT(
    val gregs: GregsetT,
    val mcVfpSize: ULong,
    val mcVfpPtr: COpaquePointer?,
    val mcSpare: UIntArray,
)

public const val BIOCSRTIMEOUT: CULong = 0x8010426duL
public const val BIOCGRTIMEOUT: CULong = 0x4010426euL
public const val MAP_32BIT: CInt = 0x00080000
public const val MINSIGSTKSZ: ULong = 4096uL
public const val TIOCTIMESTAMP: CULong = 0x40107459uL
