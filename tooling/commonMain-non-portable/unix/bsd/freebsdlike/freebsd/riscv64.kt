// port-lint: source unix/bsd/freebsdlike/freebsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public typealias ClockT = Int

public typealias WcharT = CInt

public typealias TimeT = Long

public typealias SusecondsT = CLong

public typealias RegisterT = Long

public open class Gpregs(
    public var gpRa: io.github.kotlinmania.libc.RegisterT,
    public var gpSp: io.github.kotlinmania.libc.RegisterT,
    public var gpGp: io.github.kotlinmania.libc.RegisterT,
    public var gpTp: io.github.kotlinmania.libc.RegisterT,
    public var gpT: List<io.github.kotlinmania.libc.RegisterT>,
    public var gpS: List<io.github.kotlinmania.libc.RegisterT>,
    public var gpA: List<io.github.kotlinmania.libc.RegisterT>,
    public var gpSepc: io.github.kotlinmania.libc.RegisterT,
    public var gpSstatus: io.github.kotlinmania.libc.RegisterT,
)

public open class Fpregs(
    public var fpX: List<List<ULong>>,
    public var fpFcsr: ULong,
    public var fpFlags: CInt,
    public var pad: CInt,
)

public open class McontextT(
    public var mcGpregs: Gpregs,
    public var mcFpregs: Fpregs,
    public var mcFlags: CInt,
    public var mcPad: CInt,
    public var mcSpare: List<ULong>,
)

internal val ALIGNBYTES: Int = sizeOf<CLonglong>() - 1

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val MAP_32BIT: CInt = 0x00080000

public val MINSIGSTKSZ: SizeT = 4096uL

// 1024 * 4
public val TIOCTIMESTAMP: CUlong = 0x40107459uL
