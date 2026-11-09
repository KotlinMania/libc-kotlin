// port-lint: source unix/bsd/freebsdlike/freebsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.riscv64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT

public typealias ClockT = Int

public typealias WcharT = CInt

public typealias TimeT = Long

public typealias SusecondsT = CLong

public typealias RegisterT = Long

public open class Gpregs(
    public var gpRa: RegisterT,
    public var gpSp: RegisterT,
    public var gpGp: RegisterT,
    public var gpTp: RegisterT,
    public var gpT: List<RegisterT>,
    public var gpS: List<RegisterT>,
    public var gpA: List<RegisterT>,
    public var gpSepc: RegisterT,
    public var gpSstatus: RegisterT,
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
