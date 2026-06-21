// port-lint: source new/netbsd/utmpx_.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*

/**
 * Header: `utmpx.h`
 *
 * https://github.com/NetBSD/src/blob/master/include/utmp.h
 */

// _PATH_UTMPX     = "/var/run/utmpx"
// _PATH_WTMPX     = "/var/log/wtmpx"
// _PATH_LASTLOGX  = "/var/log/lastlogx"
// _PATH_UTMP_UPDATE = "/usr/libexec/utmp_update"

public const val _UTX_USERSIZE: Int = 32
public const val _UTX_LINESIZE: Int = 32
public const val _UTX_IDSIZE: Int = 4
public const val _UTX_HOSTSIZE: Int = 256

public const val EMPTY: UShort = 0u
public const val RUN_LVL: UShort = 1u
public const val BOOT_TIME: UShort = 2u
public const val OLD_TIME: UShort = 3u
public const val NEW_TIME: UShort = 4u
public const val INIT_PROCESS: UShort = 5u
public const val LOGIN_PROCESS: UShort = 6u
public const val USER_PROCESS: UShort = 7u
public const val DEAD_PROCESS: UShort = 8u
public const val ACCOUNTING: UShort = 9u
public const val SIGNATURE: UShort = 10u
public const val DOWN_TIME: UShort = 11u

// _UTX_PADSIZE is 36 on 64-bit targets, 40 otherwise.
public const val _UTX_PADSIZE: Int = 36

// ut_pad is layout padding.
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
