package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT

public open class Sockaddr(
    public var saLen: UByte,
    public var saFamily: SaFamilyT,
    public var saData: List<CChar>,
)

public open class SockaddrIn6(
    public var sin6Len: UByte,
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwChange: TimeT,
    public var pwClass: COpaquePointer?,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
    public var pwExpire: TimeT,
    public var pwFields: CInt,
)

public open class Ifaddrs(
    public var ifaNext: Ifaddrs?,
    public var ifaName: COpaquePointer?,
    public var ifaFlags: CUint,
    public var ifaAddr: Sockaddr?,
    public var ifaNetmask: Sockaddr?,
    public var ifaDstaddr: Sockaddr?,
    public var ifaData: COpaquePointer?,
    public var ifaAddrflags: CUint,
)

public open class FdSet(public var fdsBits: List<Long>)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SocklenT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: SocklenT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class FsidT(public var fsidVal: List<Int>)

public open class IfNameindex(public var ifIndex: CUint, public var ifName: COpaquePointer?)

public open class RegexT(
    public var reMagic: CInt,
    public var reNsub: SizeT,
    public var reEndp: COpaquePointer?,
    public var reG: COpaquePointer?,
)

public open class RegmatchT(public var rmSo: RegoffT, public var rmEo: RegoffT)

public open class Option(
    public var name: COpaquePointer?,
    public var hasArg: CInt,
    public var flag: CInt?,
    public var value: CInt,
)

public open class SockaddrUn(
    public var sunLen: UByte,
    public var sunFamily: SaFamilyT,
    public var sunPath: List<CChar>,
)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
)
