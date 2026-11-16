// port-lint: source unix/bsd/freebsdlike/freebsd/powerpc.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public typealias ClockT = UInt

public typealias WcharT = Int

public typealias TimeT = Long

public typealias SusecondsT = Int

public typealias RegisterT = Int

public open class McontextT(
    public var mcVers: CInt,
    public var mcFlags: CInt,
    public var mcOnstack: CInt,
    public var mcLen: CInt,
    public var mcAvec: List<ULong>,
    public var mcAv: List<UInt>,
    public var mcFrame: List<io.github.kotlinmania.libc.RegisterT>,
    public var mcFpreg: List<ULong>,
    public var mcVsxfpreg: List<ULong>,
)

internal val ALIGNBYTES: Int = sizeOf<CInt>() - 1

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val MAP_32BIT: CInt = 0x00080000

public val MINSIGSTKSZ: SizeT = 2048uL

// 512 * 4
public val TIOCTIMESTAMP: CUlong = 0x40107459uL
