// port-lint: source unix/bsd/freebsdlike/freebsd/arm.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT

public typealias ClockT = UInt

public typealias WcharT = UInt

public typealias TimeT = Long

public typealias SusecondsT = Int

public typealias RegisterT = Int

public typealias GregT = CUint

public typealias GregsetT = List<GregT>

public open class McontextT(
    public var gregs: GregsetT,
    public var mcVfpSize: Int,
    public var mcVfpPtr: COpaquePointer?,
    public var mcSpare: List<CUint>,
)

internal val ALIGNBYTES: Int = sizeOf<CInt>() - 1

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val MAP_32BIT: CInt = 0x00080000

public val MINSIGSTKSZ: SizeT = 4096uL

// 1024 * 4
public val TIOCTIMESTAMP: CUlong = 0x40107459uL
