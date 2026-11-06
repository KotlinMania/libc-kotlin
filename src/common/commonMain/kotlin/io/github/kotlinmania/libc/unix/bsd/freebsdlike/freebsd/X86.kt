// port-lint: source unix/bsd/freebsdlike/freebsd/x86.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT

public typealias ClockT = CUlong

public typealias WcharT = Int

public typealias TimeT = Int

public typealias SusecondsT = Int

public typealias RegisterT = Int

public open class McontextT(
    public var mcOnstack: RegisterT,
    public var mcGs: RegisterT,
    public var mcFs: RegisterT,
    public var mcEs: RegisterT,
    public var mcDs: RegisterT,
    public var mcEdi: RegisterT,
    public var mcEsi: RegisterT,
    public var mcEbp: RegisterT,
    public var mcIsp: RegisterT,
    public var mcEbx: RegisterT,
    public var mcEdx: RegisterT,
    public var mcEcx: RegisterT,
    public var mcEax: RegisterT,
    public var mcTrapno: RegisterT,
    public var mcErr: RegisterT,
    public var mcEip: RegisterT,
    public var mcCs: RegisterT,
    public var mcEflags: RegisterT,
    public var mcEsp: RegisterT,
    public var mcSs: RegisterT,
    public var mcLen: CInt,
    public var mcFpformat: CInt,
    public var mcOwnedfp: CInt,
    public var mcFlags: RegisterT,
    public var mcFpstate: List<CInt>,
    public var mcFsbase: RegisterT,
    public var mcGsbase: RegisterT,
    public var mcXfpustate: RegisterT,
    public var mcXfpustateLen: RegisterT,
    public var mcSpare2: List<CInt>,
)

internal val ALIGNBYTES: Int = sizeOf<CLong>() - 1

public val MINSIGSTKSZ: SizeT = 2048uL

// 512 * 4
public val BIOCSRTIMEOUT: CUlong = 0x8008426duL

public val BIOCGRTIMEOUT: CUlong = 0x4008426euL

public val KINFO_FILE_SIZE: CInt = 1392

public val TIOCTIMESTAMP: CUlong = 0x40087459uL
