package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.InAddr
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.SaFamilyT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Ino64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.MsglenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.MsgqnumT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.ShmattT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public open class IpcPerm(
    public var key: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: CUshort,
    // read / write
    public var pad1: CUshort,
    public var seq: CUshort,
    public var pad2: CUshort,
    public var unused1: CUlong,
    public var unused2: CUlong,
)

public open class PthreadAttrT(
    public var detachstate: CInt,
    public var schedpolicy: CInt,
    public var schedparam: SchedParam,
    public var inheritsched: CInt,
    public var scope: CInt,
    public var guardsize: SizeT,
    public var stackaddrSet: CInt,
    public var stackaddr: COpaquePointer?,
    // better don't use it
    public var stacksize: SizeT,
)

public open class SchedParam(public var schedPriority: CInt)

public open class SiginfoT(
    public var siSigno: CInt,
    // signal number
    public var siErrno: CInt,
    // if not zero: error value of signal, see errno.h
    public var siCode: CInt,
    // signal code
    public var pad: List<CInt>,
    // unported union
    public var align: List<Int>,
)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    // segment size in bytes
    public var shmAtime: TimeT,
    // time of last shmat()
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: ShmattT,
    public var unused1: CUlong,
    public var unused2: CUlong,
)

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var msgStime: TimeT,
    public var msgRtime: TimeT,
    public var msgCtime: TimeT,
    public var msgCbytes: CUlong,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var ignored1: CUlong,
    public var ignored2: CUlong,
)

public open class Sockaddr(public var saFamily: SaFamilyT, public var saData: List<CChar>)

public open class SockaddrIn(
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<UByte>,
)

public open class SockaddrIn6(
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

// ------------------------------------------------------------
// definitions below are *unverified* and might **break** the software
//
// pub struct inAddr {
// pub sAddr: inAddrT,
// }
//
// pub struct in6Addr {
// pub s6Addr: [u8; 16],
// }
public open class Stat(
    public var stDev: CUlong,
    public var stIno: InoT,
    // According to uclibc/libc/sysdeps/linux/x8664/bits/stat.h, order of
    // nlink and mode are swapped on 64 bit systems.
    public var stNlink: NlinkT,
    public var stMode: ModeT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlong,
    // devT
    public var stSize: OffT,
    // file size
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CUlong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CUlong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CUlong,
    public var stPad4: List<CLong>,
)

public open class Sigaction(
    public var saHandler: SighandlerT,
    public var saFlags: CUlong,
    public var saRestorer: SigactionSaRestorerCallback?,
    public var saMask: SigsetT,
)

public open class StackT(
    // Note(ulibc)
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
)

public open class Statfs(
    // Note(ulibc)
    public var fType: FswordT,
    public var fBsize: FswordT,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFsid: FsidT,
    public var fNamelen: FswordT,
    public var fFrsize: FswordT,
    public var fSpare: List<FswordT>,
)

public open class Statfs64(
    public var fType: CInt,
    public var fBsize: CInt,
    public var fBlocks: Fsblkcnt64T,
    public var fBfree: Fsblkcnt64T,
    public var fBavail: Fsblkcnt64T,
    public var fFiles: Fsfilcnt64T,
    public var fFfree: Fsfilcnt64T,
    public var fFsid: FsidT,
    public var fNamelen: CInt,
    public var fFrsize: CInt,
    public var fFlags: CInt,
    public var fSpare: List<CInt>,
)

public open class Statvfs64(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFavail: ULong,
    public var fFsid: CUlong,
    public var fUnused: CInt,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class Msghdr(
    // Note(ulibc)
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: SizeT,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SizeT,
    public var msgFlags: CInt,
)

public open class Termios(
    // Note(ulibc)
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cLine: CcT,
    public var cCc: List<CcT>,
)

public open class SigsetT(
    // Note(ulibc)
    public var value: List<CUlong>,
)

public open class Sysinfo(
    // Note(ulibc)
    public var uptime: CLong,
    public var loads: List<CUlong>,
    public var totalram: CUlong,
    public var freeram: CUlong,
    public var sharedram: CUlong,
    public var bufferram: CUlong,
    public var totalswap: CUlong,
    public var freeswap: CUlong,
    public var procs: CUshort,
    public var pad: CUshort,
    public var totalhigh: CUlong,
    public var freehigh: CUlong,
    public var memUnit: CUint,
    public var f: List<CChar>,
)

public open class GlobT(
    // Note(ulibc)
    public var glPathc: SizeT,
    public var glPathv: COpaquePointer?,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    public var unused1: COpaquePointer?,
    public var unused2: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
)

public open class CpuSetT(public var bits: List<ULong>)

public open class FsidT(
    // Note(ulibc)
    public var value: List<CInt>,
)

// Note(1.0): this is actually a union
public open class SemT(public var size: List<CChar>, public var align: List<CLong>)

public open class Cmsghdr(
    public var cmsgLen: SizeT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class Dirent(
    public var dIno: Ino64T,
    public var dOff: Off64T,
    public var dReclen: UShort,
    public var dType: UByte,
    public var dName: List<CChar>,
)
