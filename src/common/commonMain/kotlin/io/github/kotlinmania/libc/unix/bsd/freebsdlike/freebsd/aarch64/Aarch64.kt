// port-lint: source unix/bsd/freebsdlike/freebsd/aarch64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.U128
import io.github.kotlinmania.libc.unix.SizeT

public typealias ClockT = Int

public typealias WcharT = UInt

public typealias TimeT = Long

public typealias SusecondsT = Long

public typealias RegisterT = Long

public open class Gpregs(
    public var gpX: List<RegisterT>,
    public var gpLr: RegisterT,
    public var gpSp: RegisterT,
    public var gpElr: RegisterT,
    public var gpSpsr: UInt,
    public var gpPad: CInt,
)

public open class Fpregs(
    public var fpQ: U128,
    public var fpSr: UInt,
    public var fpCr: UInt,
    public var fpFlags: CInt,
    public var fpPad: CInt,
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
