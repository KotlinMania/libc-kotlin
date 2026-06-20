// port-lint: source new/netbsd/sys/timex.rs
package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.*

/**
 * Header: `sys/timex.h`.
 */

public const val MAXPHASE: CLong = 500000000
public const val MAXFREQ: CLong = 500000
public const val MINSEC: CInt = 256
public const val MAXSEC: CInt = 2048
public const val NANOSECOND: CLong = 1000000000
public const val SCALE_PPM: CInt = 65
public const val MAXTC: CInt = 10

public const val MOD_OFFSET: CUInt = 0x0001u
public const val MOD_FREQUENCY: CUInt = 0x0002u
public const val MOD_MAXERROR: CUInt = 0x0004u
public const val MOD_ESTERROR: CUInt = 0x0008u
public const val MOD_STATUS: CUInt = 0x0010u
public const val MOD_TIMECONST: CUInt = 0x0020u
public const val MOD_PPSMAX: CUInt = 0x0040u
public const val MOD_TAI: CUInt = 0x0080u
public const val MOD_MICRO: CUInt = 0x1000u
public const val MOD_NANO: CUInt = 0x2000u
public const val MOD_CLKB: CUInt = 0x4000u
public const val MOD_CLKA: CUInt = 0x8000u

public const val STA_PLL: CInt = 0x0001
public const val STA_PPSFREQ: CInt = 0x0002
public const val STA_PPSTIME: CInt = 0x0004
public const val STA_FLL: CInt = 0x0008
public const val STA_INS: CInt = 0x0010
public const val STA_DEL: CInt = 0x0020
public const val STA_UNSYNC: CInt = 0x0040
public const val STA_FREQHOLD: CInt = 0x0080
public const val STA_PPSSIGNAL: CInt = 0x0100
public const val STA_PPSJITTER: CInt = 0x0200
public const val STA_PPSWANDER: CInt = 0x0400
public const val STA_PPSERROR: CInt = 0x0800
public const val STA_CLOCKERR: CInt = 0x1000
public const val STA_NANO: CInt = 0x2000
public const val STA_MODE: CInt = 0x4000
public const val STA_CLK: CInt = 0x8000

public val STA_RONLY: CInt = STA_PPSSIGNAL or
    STA_PPSJITTER or
    STA_PPSWANDER or
    STA_PPSERROR or
    STA_CLOCKERR or
    STA_NANO or
    STA_MODE or
    STA_CLK

public const val TIME_OK: CInt = 0
public const val TIME_INS: CInt = 1
public const val TIME_DEL: CInt = 2
public const val TIME_OOP: CInt = 3
public const val TIME_WAIT: CInt = 4
public const val TIME_ERROR: CInt = 5

public data class Ntptimeval(
    val time: Timespec,
    val maxerror: CLong,
    val esterror: CLong,
    val tai: CLong,
    val timeState: CInt,
)

public data class Timex(
    val modes: CUInt,
    val offset: CLong,
    val freq: CLong,
    val maxerror: CLong,
    val esterror: CLong,
    val status: CInt,
    val constant: CLong,
    val precision: CLong,
    val tolerance: CLong,
    val ppsfreq: CLong,
    val jitter: CLong,
    val shift: CInt,
    val stabil: CLong,
    val jitcnt: CLong,
    val calcnt: CLong,
    val errcnt: CLong,
    val stbcnt: CLong,
)

// Linked as "__ntp_gettime50".
public expect fun ntpGettime(buf: Ntptimeval?): CInt

public expect fun ntpAdjtime(buf: Timex?): CInt
