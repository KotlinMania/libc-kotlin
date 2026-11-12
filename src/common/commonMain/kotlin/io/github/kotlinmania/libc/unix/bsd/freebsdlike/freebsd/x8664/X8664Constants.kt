package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val MAP_32BIT: CInt = 0x00080000

public val MINSIGSTKSZ: SizeT = 2048uL

// 512 * 4
public val MC_HASSEGS: UInt = 0x1u

public val MC_HASBASES: UInt = 0x2u

public val MC_HASFPXSTATE: UInt = 0x4u

public val MC_FPFMT_NODEV: CLong = 0x10000L

public val MC_FPFMT_XMM: CLong = 0x10002L

public val MC_FPOWNED_NONE: CLong = 0x20000L

public val MC_FPOWNED_FPU: CLong = 0x20001L

public val MC_FPOWNED_PCB: CLong = 0x20002L

public val KINFO_FILE_SIZE: CInt = 1392

public val TIOCTIMESTAMP: CUlong = 0x40107459uL

internal val ALIGNBYTES: Int = sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>()) - 1
