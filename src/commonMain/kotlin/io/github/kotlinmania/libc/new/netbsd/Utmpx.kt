// port-lint: source new/netbsd/utmpx_.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*

public data class Utmpx(
    val utName: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utHost: ByteArray,
    val utSession: UShort,
    val utType: UShort,
    val utPid: PidT,
    val utExit: ExitStatus,
    val utSs: SockaddrStorage,
    val utTv: Timeval,
)

public data class ExitStatus(
    val eTermination: UShort,
    val eExit: UShort,
)

public data class Lastlogx(
    val llTv: Timeval,
    val llLine: ByteArray,
    val llHost: ByteArray,
    val llSs: SockaddrStorage,
)

public const val _UTX_USERSIZE: ULong = 32uL
public const val _UTX_LINESIZE: ULong = 32uL
public const val _UTX_IDSIZE: ULong = 4uL
public const val _UTX_HOSTSIZE: ULong = 256uL
public val EMPTY: UShort = (0).toUShort()
public val RUN_LVL: UShort = (1).toUShort()
public val BOOT_TIME: UShort = (2).toUShort()
public val OLD_TIME: UShort = (3).toUShort()
public val NEW_TIME: UShort = (4).toUShort()
public val INIT_PROCESS: UShort = (5).toUShort()
public val LOGIN_PROCESS: UShort = (6).toUShort()
public val USER_PROCESS: UShort = (7).toUShort()
public val DEAD_PROCESS: UShort = (8).toUShort()
public val ACCOUNTING: UShort = (9).toUShort()
public val SIGNATURE: UShort = (10).toUShort()
public val DOWN_TIME: UShort = (11).toUShort()

// _UTX_PADSIZE is 40 on 32-bit targets.
public const val _UTX_PADSIZE: ULong = 36uL

public expect fun setutxent()
public expect fun endutxent()
public expect fun getutxent(): Utmpx? 
public expect fun getutxid(ut: Utmpx?): Utmpx? 
public expect fun getutxline(ut: Utmpx?): Utmpx? 
public expect fun pututxline(ut: Utmpx?): Utmpx? 
public expect fun updwtmpx(file: String?, ut: Utmpx?): CInt 
public expect fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? 
public expect fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt 
public expect fun getutmp(ux: Utmpx?, u: Utmp?)
public expect fun getutmpx(u: Utmp?, ux: Utmpx?)
public expect fun utmpxname(file: String?): CInt 