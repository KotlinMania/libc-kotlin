// port-lint: source unix/linux_like/linux/uclibc/x86_64/x86_64_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CcT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.In6Addr
import io.github.kotlinmania.libc.InAddr
import io.github.kotlinmania.libc.InPortT
import io.github.kotlinmania.libc.Ino64T
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.KeyT
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.MsglenT
import io.github.kotlinmania.libc.MsgqnumT
import io.github.kotlinmania.libc.Off64T
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.SaFamilyT
import io.github.kotlinmania.libc.ShmattT
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.TcflagT
import io.github.kotlinmania.libc.UidT

// Definitions for uclibc on 64bit systems

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public typealias BlkcntT = Long

public typealias BlksizeT = Long

public typealias ClockT = Long

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias FswordT = CLong

public typealias InoT = CUlong

public typealias NlinkT = CUint

public typealias OffT = CLong

// [uClibc docs] Note stat64 has the same shape as stat for x86-64.
public typealias Stat64 = Stat

public typealias SusecondsT = CLong

public typealias TimeT = CInt

public typealias WcharT = CInt

public typealias PthreadT = CUlong

public typealias Fsblkcnt64T = ULong

public typealias Fsfilcnt64T = ULong

public typealias U64 = CUlong

public typealias S64 = CLong

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
    public var shmPerm: io.github.kotlinmania.libc.IpcPerm,
    public var shmSegsz: SizeT,
    // segment size in bytes
    public var shmAtime: io.github.kotlinmania.libc.TimeT,
    // time of last shmat()
    public var shmDtime: io.github.kotlinmania.libc.TimeT,
    public var shmCtime: io.github.kotlinmania.libc.TimeT,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: ShmattT,
    public var unused1: CUlong,
    public var unused2: CUlong,
)

public open class MsqidDs(
    public var msgPerm: io.github.kotlinmania.libc.IpcPerm,
    public var msgStime: io.github.kotlinmania.libc.TimeT,
    public var msgRtime: io.github.kotlinmania.libc.TimeT,
    public var msgCtime: io.github.kotlinmania.libc.TimeT,
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
    public var stIno: io.github.kotlinmania.libc.InoT,
    // According to uclibc/libc/sysdeps/linux/x8664/bits/stat.h, order of
    // nlink and mode are swapped on 64 bit systems.
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stMode: ModeT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlong,
    // devT
    public var stSize: OffT,
    // file size
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var stBlocks: io.github.kotlinmania.libc.BlkcntT,
    public var stAtime: io.github.kotlinmania.libc.TimeT,
    public var stAtimeNsec: CUlong,
    public var stMtime: io.github.kotlinmania.libc.TimeT,
    public var stMtimeNsec: CUlong,
    public var stCtime: io.github.kotlinmania.libc.TimeT,
    public var stCtimeNsec: CUlong,
    public var stPad4: List<CLong>,
)

public open class Sigaction(
    public var saHandler: SighandlerT,
    public var saFlags: CUlong,
    public var saRestorer: SigactionSaRestorerCallback?,
    public var saMask: io.github.kotlinmania.libc.SigsetT,
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
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFsid: io.github.kotlinmania.libc.FsidT,
    public var fNamelen: FswordT,
    public var fFrsize: FswordT,
    public var fSpare: List<FswordT>,
)

public open class Statfs64(
    public var fType: CInt,
    public var fBsize: CInt,
    public var fBlocks: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fBfree: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fBavail: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fFiles: io.github.kotlinmania.libc.Fsfilcnt64T,
    public var fFfree: io.github.kotlinmania.libc.Fsfilcnt64T,
    public var fFsid: io.github.kotlinmania.libc.FsidT,
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

// constants
public val ENAMETOOLONG: CInt = 36

// File name too long
public val ENOTEMPTY: CInt = 39

// Directory not empty
public val ELOOP: CInt = 40

// Too many symbolic links encountered
public val EADDRINUSE: CInt = 98

// Address already in use
public val EADDRNOTAVAIL: CInt = 99

// Cannot assign requested address
public val ENETDOWN: CInt = 100

// Network is down
public val ENETUNREACH: CInt = 101

// Network is unreachable
public val ECONNABORTED: CInt = 103

// Software caused connection abort
public val ECONNREFUSED: CInt = 111

// Connection refused
public val ECONNRESET: CInt = 104

// Connection reset by peer
public val EDEADLK: CInt = 35

// Resource deadlock would occur
public val ENOSYS: CInt = 38

// Function not implemented
public val ENOTCONN: CInt = 107

// Transport endpoint is not connected
public val ETIMEDOUT: CInt = 110

// connection timed out
public val ESTALE: CInt = 116

// Stale file handle
public val EHOSTUNREACH: CInt = 113

// No route to host
public val EDQUOT: CInt = 122

// Quota exceeded
public val EOPNOTSUPP: CInt = 0x5f

public val ENODATA: CInt = 0x3d

public val O_APPEND: CInt = 1024

public val O_ACCMODE: CInt = 3

public val O_CLOEXEC: CInt = 0x80000

public val O_CREAT: CInt = 100

public val O_DIRECTORY: CInt = 65536

public val O_EXCL: CInt = 128

public val O_NOFOLLOW: CInt = 0x20000

public val O_NONBLOCK: CInt = 2048

public val O_TRUNC: CInt = 512

public val NCCS: Int = 32

public val SIG_SETMASK: CInt = 2

// Set the set of blocked signals
public val SIZEOF_PTHREAD_MUTEX_T: Int = 40

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SOCK_DGRAM: CInt = 2

// connectionless, unreliable datagrams
public val SOCK_STREAM: CInt = 1

// …/common/bits/socketType.h
public val SIZEOF_PTHREAD_COND_T: Int = 48

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 56

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

public val SIZEOF_PTHREAD_BARRIER_T: Int = 32

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val PTHREAD_STACK_MIN: Int = 16384
