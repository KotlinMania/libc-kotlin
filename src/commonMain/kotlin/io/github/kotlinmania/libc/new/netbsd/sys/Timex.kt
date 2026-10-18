// port-lint: source new/netbsd/sys/timex.rs
package io.github.kotlinmania.libc.new.netbsd.sys
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public data class Ntptimeval(
    val time: Timespec,
    val maxerror: Long,
    val esterror: Long,
    val tai: Long,
    val timeState: Int,
)

public data class Timex(
    val modes: UInt,
    val offset: Long,
    val freq: Long,
    val maxerror: Long,
    val esterror: Long,
    val status: Int,
    val constant: Long,
    val precision: Long,
    val tolerance: Long,
    val ppsfreq: Long,
    val jitter: Long,
    val shift: Int,
    val stabil: Long,
    val jitcnt: Long,
    val calcnt: Long,
    val errcnt: Long,
    val stbcnt: Long,
)

public const val MAXPHASE: Long = 500000000
public const val MAXFREQ: Long = 500000
public const val MINSEC: Int = 256
public const val MAXSEC: Int = 2048
public const val NANOSECOND: Long = 1000000000
public const val SCALE_PPM: Int = 65
public const val MAXTC: Int = 10
public const val MOD_OFFSET: UInt = 0x0001u
public const val MOD_FREQUENCY: UInt = 0x0002u
public const val MOD_MAXERROR: UInt = 0x0004u
public const val MOD_ESTERROR: UInt = 0x0008u
public const val MOD_STATUS: UInt = 0x0010u
public const val MOD_TIMECONST: UInt = 0x0020u
public const val MOD_PPSMAX: UInt = 0x0040u
public const val MOD_TAI: UInt = 0x0080u
public const val MOD_MICRO: UInt = 0x1000u
public const val MOD_NANO: UInt = 0x2000u
public const val MOD_CLKB: UInt = 0x4000u
public const val MOD_CLKA: UInt = 0x8000u
public const val STA_PLL: Int = 0x0001
public const val STA_PPSFREQ: Int = 0x0002
public const val STA_PPSTIME: Int = 0x0004
public const val STA_FLL: Int = 0x0008
public const val STA_INS: Int = 0x0010
public const val STA_DEL: Int = 0x0020
public const val STA_UNSYNC: Int = 0x0040
public const val STA_FREQHOLD: Int = 0x0080
public const val STA_PPSSIGNAL: Int = 0x0100
public const val STA_PPSJITTER: Int = 0x0200
public const val STA_PPSWANDER: Int = 0x0400
public const val STA_PPSERROR: Int = 0x0800
public const val STA_CLOCKERR: Int = 0x1000
public const val STA_NANO: Int = 0x2000
public const val STA_MODE: Int = 0x4000
public const val STA_CLK: Int = 0x8000
public val STA_RONLY: Int = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK
public const val TIME_OK: Int = 0
public const val TIME_INS: Int = 1
public const val TIME_DEL: Int = 2
public const val TIME_OOP: Int = 3
public const val TIME_WAIT: Int = 4
public const val TIME_ERROR: Int = 5

public expect fun ntpGettime(buf: Ntptimeval?): Int

public expect fun ntpAdjtime(buf: Timex?): Int
