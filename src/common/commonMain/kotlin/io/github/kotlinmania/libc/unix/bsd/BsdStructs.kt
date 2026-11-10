@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.FD_SETSIZE
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT

public data class Sockaddr(
    public var saLen: UByte = 0u,
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saLen != other.saLen) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saLen.hashCode()
        result = 31 * result + this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }
}

public data class SockaddrIn6(
    public var sin6Len: UByte = 0u,
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

public data class Passwd(
    public var pwName: COpaquePointer? = null,
    public var pwPasswd: COpaquePointer? = null,
    public var pwUid: UidT = 0u,
    public var pwGid: GidT = 0u,
    public var pwChange: TimeT = 0L,
    public var pwClass: COpaquePointer? = null,
    public var pwGecos: COpaquePointer? = null,
    public var pwDir: COpaquePointer? = null,
    public var pwShell: COpaquePointer? = null,
    public var pwExpire: TimeT = 0L,
    public var pwFields: CInt = 0,
)

public data class Ifaddrs(
    public var ifaNext: Ifaddrs? = null,
    public var ifaName: COpaquePointer? = null,
    public var ifaFlags: CUint = 0u,
    public var ifaAddr: Sockaddr? = null,
    public var ifaNetmask: Sockaddr? = null,
    public var ifaDstaddr: Sockaddr? = null,
    public var ifaData: COpaquePointer? = null,
    public var ifaAddrflags: CUint = 0u,
)

public data class FdSet(public var fdsBits: LongArray = LongArray(FD_SETSIZE / 64)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (!this.fdsBits.contentEquals(other.fdsBits)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.fdsBits.contentHashCode()
    }
}

public data class Msghdr(
    public var msgName: COpaquePointer? = null,
    public var msgNamelen: SocklenT = 0u,
    public var msgIov: Iovec? = null,
    public var msgIovlen: CInt = 0,
    public var msgControl: COpaquePointer? = null,
    public var msgControllen: SocklenT = 0u,
    public var msgFlags: CInt = 0,
)

public data class Cmsghdr(
    public var cmsgLen: SocklenT = 0u,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
)

public data class FsidT(public var fsidVal: IntArray = IntArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsidT) return false
        if (!this.fsidVal.contentEquals(other.fsidVal)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.fsidVal.contentHashCode()
    }
}

public data class IfNameindex(public var ifIndex: CUint = 0u, public var ifName: COpaquePointer? = null)

public data class RegexT(
    public var reMagic: CInt = 0,
    public var reNsub: SizeT = 0uL,
    public var reEndp: COpaquePointer? = null,
    public var reG: COpaquePointer? = null,
)

public data class RegmatchT(public var rmSo: RegoffT = 0L, public var rmEo: RegoffT = 0L)

public data class Option(
    public var name: COpaquePointer? = null,
    public var hasArg: CInt = 0,
    public var flag: CInt? = null,
    public var value: CInt = 0,
)

public data class SockaddrUn(
    public var sunLen: UByte = 0u,
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(104),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunLen != other.sunLen) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunLen.hashCode()
        result = 31 * result + this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }
}

public data class Utsname(
    public var sysname: UByteArray = UByteArray(256),
    public var nodename: UByteArray = UByteArray(256),
    public var release: UByteArray = UByteArray(256),
    public var version: UByteArray = UByteArray(256),
    public var machine: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utsname) return false
        if (!this.sysname.contentEquals(other.sysname)) return false
        if (!this.nodename.contentEquals(other.nodename)) return false
        if (!this.release.contentEquals(other.release)) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.machine.contentEquals(other.machine)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sysname.contentHashCode()
        result = 31 * result + this.nodename.contentHashCode()
        result = 31 * result + this.release.contentHashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.machine.contentHashCode()
        return result
    }
}
