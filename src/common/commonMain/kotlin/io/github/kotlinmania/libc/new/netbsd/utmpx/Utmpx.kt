// port-lint: source new/netbsd/utmpx_.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.Timeval
import io.github.kotlinmania.libc.new.qurt.UidT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SockaddrStorage

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

public data class Utmpx(
    public var utName: UByteArray = UByteArray(UTX_USERSIZE),
    public var utId: UByteArray = UByteArray(UTX_IDSIZE),
    public var utLine: UByteArray = UByteArray(UTX_LINESIZE),
    public var utHost: UByteArray = UByteArray(UTX_HOSTSIZE),
    public var utSession: UShort = 0u,
    public var utType: UShort = 0u,
    public var utPid: PidT = 0,
    public var utExit: ExitStatus = ExitStatus(),
    // Note(netbsd): when anonymous struct are supported
    public var utSs: SockaddrStorage = SockaddrStorage(),
    public var utTv: Timeval = Timeval(),
    public var utPad: UByteArray = UByteArray(UTX_PADSIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (!this.utName.contentEquals(other.utName)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.utSession != other.utSession) return false
        if (this.utType != other.utType) return false
        if (this.utPid != other.utPid) return false
        if (this.utExit != other.utExit) return false
        if (this.utSs != other.utSs) return false
        if (this.utTv != other.utTv) return false
        if (!this.utPad.contentEquals(other.utPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utName.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utSession.hashCode()
        result = 31 * result + this.utType.hashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utExit.hashCode()
        result = 31 * result + this.utSs.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utPad.contentHashCode()
        return result
    }
}

public data class ExitStatus(public var eTermination: UShort = 0u, public var eExit: UShort = 0u)

public data class Lastlogx(
    public var llTv: Timeval = Timeval(),
    public var llLine: UByteArray = UByteArray(UTX_LINESIZE),
    public var llHost: UByteArray = UByteArray(UTX_HOSTSIZE),
    public var llSs: SockaddrStorage = SockaddrStorage(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lastlogx) return false
        if (this.llTv != other.llTv) return false
        if (!this.llLine.contentEquals(other.llLine)) return false
        if (!this.llHost.contentEquals(other.llHost)) return false
        if (this.llSs != other.llSs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.llTv.hashCode()
        result = 31 * result + this.llLine.contentHashCode()
        result = 31 * result + this.llHost.contentHashCode()
        result = 31 * result + this.llSs.hashCode()
        return result
    }
}

public expect fun setutxent()

public expect fun endutxent()

public expect fun getutxent(): COpaquePointer?

public expect fun getutxid(ut: COpaquePointer?): COpaquePointer?

public expect fun getutxline(ut: COpaquePointer?): COpaquePointer?

public expect fun pututxline(ut: COpaquePointer?): COpaquePointer?

public expect fun updwtmpx(file: String?, ut: COpaquePointer?): CInt

public expect fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer?

public expect fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt

public expect fun getutmp(ux: COpaquePointer?, u: COpaquePointer?)

public expect fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?)

public expect fun utmpxname(file: String?): CInt
