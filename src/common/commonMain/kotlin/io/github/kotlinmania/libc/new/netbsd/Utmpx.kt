// port-lint: source new/netbsd/utmpx_.rs
package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.SockaddrStorage
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.new.qurt.UidT

// Header: `utmpx.h`
//
// <https://github.com/NetBSD/src/blob/master/include/utmp.h>

// pub const _PATH_UTMPX: &[cChar; 14] = b"/var/run/utmpx";
// pub const _PATH_WTMPX: &[cChar; 14] = b"/var/log/wtmpx";
// pub const _PATH_LASTLOGX: &[cChar; 17] = b"/var/log/lastlogx";
// pub const _PATH_UTMP_UPDATE: &[cChar; 24] = b"/usr/libexec/utmpUpdate";
public val UTX_USERSIZE: Int = 32

public val UTX_LINESIZE: Int = 32

public val UTX_IDSIZE: Int = 4

public val UTX_HOSTSIZE: Int = 256

public val EMPTY: UShort = 0u

public val RUN_LVL: UShort = 1u

public val BOOT_TIME: UShort = 2u

public val OLD_TIME: UShort = 3u

public val NEW_TIME: UShort = 4u

public val INIT_PROCESS: UShort = 5u

public val LOGIN_PROCESS: UShort = 6u

public val USER_PROCESS: UShort = 7u

public val DEAD_PROCESS: UShort = 8u

public val ACCOUNTING: UShort = 9u

public val SIGNATURE: UShort = 10u

public val DOWN_TIME: UShort = 11u

// Expression based on the comment in NetBSD source.
public val UTX_PADSIZE: Int = if (true) {
    36
} else {
    40
}

public open class Utmpx(
    public var utName: List<CChar>,
    public var utId: List<CChar>,
    public var utLine: List<CChar>,
    public var utHost: List<CChar>,
    public var utSession: UShort,
    public var utType: UShort,
    public var utPid: PidT,
    public var utExit: ExitStatus,
    // Note(netbsd): when anonymous struct are supported
    public var utSs: SockaddrStorage,
    public var utTv: Timeval,
    public var utPad: List<UByte>,
)

public open class ExitStatus(public var eTermination: UShort, public var eExit: UShort)

public open class Lastlogx(
    public var llTv: Timeval,
    public var llLine: List<CChar>,
    public var llHost: List<CChar>,
    public var llSs: SockaddrStorage,
)

public fun setutxent() {
    LibcDynamicFfi.invoke("setutxent", -1, longArrayOf())
}

public fun endutxent() {
    LibcDynamicFfi.invoke("endutxent", -1, longArrayOf())
}

public fun getutxent(): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("__getutxent50", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxid(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("__getutxid50", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("__getutxline50", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pututxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("__pututxline50", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun updwtmpx(file: String?, ut: Utmpx?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("__updwtmpx50", -1, longArrayOf(__cstr_0, ut?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? {
    val __cstr_0 = if (fname == null) 0L else LibcDynamicFfi.allocUtf8CString(fname)
    try {
        val rawRet = LibcDynamicFfi.invoke("__getlastlogx50", -1, longArrayOf(__cstr_0, uid.toLong(), ll?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt {
    val __cstr_0 = if (fname == null) 0L else LibcDynamicFfi.allocUtf8CString(fname)
    try {
        return LibcDynamicFfi.invoke("__updlastlogx50", -1, longArrayOf(__cstr_0, uid.toLong(), ll?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getutmp(ux: Utmpx?, u: Utmp?) {
    LibcDynamicFfi.invoke("__getutmp50", -1, longArrayOf(ux?.value ?: 0L, u?.value ?: 0L))
}

public fun getutmpx(u: Utmp?, ux: Utmpx?) {
    LibcDynamicFfi.invoke("__getutmpx50", -1, longArrayOf(u?.value ?: 0L, ux?.value ?: 0L))
}

public fun utmpxname(file: String?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utmpxname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}
