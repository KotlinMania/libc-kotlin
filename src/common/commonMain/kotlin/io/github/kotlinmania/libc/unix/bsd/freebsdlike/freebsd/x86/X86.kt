// port-lint: source unix/bsd/freebsdlike/freebsd/x86.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT

public typealias ClockT = CUlong

public typealias WcharT = Int

public typealias TimeT = Int

public typealias SusecondsT = Int

public typealias RegisterT = Int

public class McontextT(
    public var mcOnstack: RegisterT = 0,
    public var mcGs: RegisterT = 0,
    public var mcFs: RegisterT = 0,
    public var mcEs: RegisterT = 0,
    public var mcDs: RegisterT = 0,
    public var mcEdi: RegisterT = 0,
    public var mcEsi: RegisterT = 0,
    public var mcEbp: RegisterT = 0,
    public var mcIsp: RegisterT = 0,
    public var mcEbx: RegisterT = 0,
    public var mcEdx: RegisterT = 0,
    public var mcEcx: RegisterT = 0,
    public var mcEax: RegisterT = 0,
    public var mcTrapno: RegisterT = 0,
    public var mcErr: RegisterT = 0,
    public var mcEip: RegisterT = 0,
    public var mcCs: RegisterT = 0,
    public var mcEflags: RegisterT = 0,
    public var mcEsp: RegisterT = 0,
    public var mcSs: RegisterT = 0,
    public var mcLen: CInt = 0,
    public var mcFpformat: CInt = 0,
    public var mcOwnedfp: CInt = 0,
    public var mcFlags: RegisterT = 0,
    public var mcFpstate: IntArray = IntArray(128),
    public var mcFsbase: RegisterT = 0,
    public var mcGsbase: RegisterT = 0,
    public var mcXfpustate: RegisterT = 0,
    public var mcXfpustateLen: RegisterT = 0,
    public var mcSpare2: IntArray = IntArray(4),
)

public val MINSIGSTKSZ: SizeT = 2048uL

// 512 * 4
public val BIOCSRTIMEOUT: CUlong = 0x8008426duL

public val BIOCGRTIMEOUT: CUlong = 0x4008426euL

public val KINFO_FILE_SIZE: CInt = 1392

public val TIOCTIMESTAMP: CUlong = 0x40087459uL

internal val ALIGNBYTES: Int = 8 - 1
