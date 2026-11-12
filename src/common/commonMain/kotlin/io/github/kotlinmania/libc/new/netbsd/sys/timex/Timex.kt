// port-lint: source new/netbsd/sys/timex.rs
package io.github.kotlinmania.libc.new.netbsd.sys.timex

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `sys / timex.h`
//
// <https://github.com/NetBSD/src/tree/trunk/sys/sys/timex.h>

public val MAXPHASE: CLong = 500000000L

public val MAXFREQ: CLong = 500000L

public val MINSEC: CInt = 256

public val MAXSEC: CInt = 2048

public val NANOSECOND: CLong = 1000000000L

public val SCALE_PPM: CInt = 65

public val MAXTC: CInt = 10

public val MOD_OFFSET: CUint = 0x0001u

public val MOD_FREQUENCY: CUint = 0x0002u

public val MOD_MAXERROR: CUint = 0x0004u

public val MOD_ESTERROR: CUint = 0x0008u

public val MOD_STATUS: CUint = 0x0010u

public val MOD_TIMECONST: CUint = 0x0020u

public val MOD_PPSMAX: CUint = 0x0040u

public val MOD_TAI: CUint = 0x0080u

public val MOD_MICRO: CUint = 0x1000u

public val MOD_NANO: CUint = 0x2000u

public val MOD_CLKB: CUint = 0x4000u

public val MOD_CLKA: CUint = 0x8000u

public val STA_PLL: CInt = 0x0001

public val STA_PPSFREQ: CInt = 0x0002

public val STA_PPSTIME: CInt = 0x0004

public val STA_FLL: CInt = 0x0008

public val STA_INS: CInt = 0x0010

public val STA_DEL: CInt = 0x0020

public val STA_UNSYNC: CInt = 0x0040

public val STA_FREQHOLD: CInt = 0x0080

public val STA_PPSSIGNAL: CInt = 0x0100

public val STA_PPSJITTER: CInt = 0x0200

public val STA_PPSWANDER: CInt = 0x0400

public val STA_PPSERROR: CInt = 0x0800

public val STA_CLOCKERR: CInt = 0x1000

public val STA_NANO: CInt = 0x2000

public val STA_MODE: CInt = 0x4000

public val STA_CLK: CInt = 0x8000

public val STA_RONLY: CInt = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK

public val TIME_OK: CInt = 0

public val TIME_INS: CInt = 1

public val TIME_DEL: CInt = 2

public val TIME_OOP: CInt = 3

public val TIME_WAIT: CInt = 4

public val TIME_ERROR: CInt = 5

public data class Ntptimeval(
    public var time: Timespec = Timespec(),
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
    public var tai: CLong = 0L,
    public var timeState: CInt = 0,
)

public class Timex(
    public var modes: CUint = 0u,
    public var offset: CLong = 0L,
    public var freq: CLong = 0L,
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
    public var status: CInt = 0,
    public var constant: CLong = 0L,
    public var precision: CLong = 0L,
    public var tolerance: CLong = 0L,
    public var ppsfreq: CLong = 0L,
    public var jitter: CLong = 0L,
    public var shift: CInt = 0,
    public var stabil: CLong = 0L,
    public var jitcnt: CLong = 0L,
    public var calcnt: CLong = 0L,
    public var errcnt: CLong = 0L,
    public var stbcnt: CLong = 0L,
)

public expect fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt

public expect fun ntpAdjtime(buf: MutPtr<Timex>): CInt
