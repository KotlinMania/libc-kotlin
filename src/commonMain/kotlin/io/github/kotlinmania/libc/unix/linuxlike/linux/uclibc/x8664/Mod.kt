// port-lint: source unix/linux_like/linux/uclibc/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public typealias BlkcntT = Long
public typealias BlksizeT = Long
public typealias ClockT = Long
public typealias FsblkcntT = CULong
public typealias FsfilcntT = CULong
public typealias FswordT = CLong
public typealias InoT = CULong
public typealias NlinkT = CUInt
public typealias OffT = CLong
public typealias Stat64 = Stat
public typealias SusecondsT = CLong
public typealias TimeT = CInt
public typealias WcharT = CInt
public typealias PthreadT = CULong
public typealias Fsblkcnt64T = ULong
public typealias Fsfilcnt64T = ULong
public typealias U64 = CULong
public typealias S64 = CLong

public data class IpcPerm(
    val key: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: CUShort,
    val seq: CUShort,
)

public data class PthreadAttrT(
    val detachstate: CInt,
    val schedpolicy: CInt,
    val schedparam: SchedParam,
    val inheritsched: CInt,
    val scope: CInt,
    val guardsize: ULong,
    val stackaddrSet: CInt,
    val stackaddr: COpaquePointer?,
    val stacksize: ULong,
)

public data class SchedParam(
    val schedPriority: CInt,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val pad: IntArray,
    val align: List<ULong>,
    val siAddr: COpaquePointer? = null,
    val siValue: Sigval? = null,
    val siPid: PidT? = null,
    val siUid: UidT? = null,
    val siStatus: CInt? = null,
    val siUtime: CLong? = null,
    val siStime: CLong? = null,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmCpid: PidT,
    val shmLpid: PidT,
    val shmNattch: ShmattT,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgStime: TimeT,
    val msgRtime: TimeT,
    val msgCtime: TimeT,
    val msgCbytes: CULong,
    val msgQnum: MsgqnumT,
    val msgQbytes: MsglenT,
    val msgLspid: PidT,
    val msgLrpid: PidT,
    val ignored1: CULong,
    val ignored2: CULong,
)

public data class Sockaddr(
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class SockaddrIn(
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: UByteArray,
)

public data class SockaddrIn6(
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public class InAddr

public class In6Addr

public data class Stat(
    val stDev: CULong,
    val stIno: InoT,
    val stNlink: NlinkT,
    val stMode: ModeT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: CULong,
    val stSize: OffT,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAtime: TimeT,
    val stAtimeNsec: CULong,
    val stMtime: TimeT,
    val stMtimeNsec: CULong,
    val stCtime: TimeT,
    val stCtimeNsec: CULong,
)

public data class Sigaction(
    val saHandler: SighandlerT,
    val saFlags: CULong,
    val saRestorer: (() -> Unit)?,
    val saMask: SigsetT,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
)

public data class Statfs(
    val fType: FswordT,
    val fBsize: FswordT,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFsid: FsidT,
    val fNamelen: FswordT,
    val fFrsize: FswordT,
    val fSpare: List<FswordT>,
)

public data class Statfs64(
    val fType: CInt,
    val fBsize: CInt,
    val fBlocks: Fsblkcnt64T,
    val fBfree: Fsblkcnt64T,
    val fBavail: Fsblkcnt64T,
    val fFiles: Fsfilcnt64T,
    val fFfree: Fsfilcnt64T,
    val fFsid: FsidT,
    val fNamelen: CInt,
    val fFrsize: CInt,
    val fFlags: CInt,
    val fSpare: IntArray,
)

public data class Statvfs64(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fSpare: IntArray,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: CInt,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CcT,
    val cCc: List<CcT>,
)

public data class SigsetT(
    val value: ULongArray,
)

public data class Sysinfo(
    val uptime: CLong,
    val loads: ULongArray,
    val totalram: CULong,
    val freeram: CULong,
    val sharedram: CULong,
    val bufferram: CULong,
    val totalswap: CULong,
    val freeswap: CULong,
    val procs: CUShort,
    val pad: CUShort,
    val totalhigh: CULong,
    val freehigh: CULong,
    val memUnit: CUInt,
    val f: ByteArray,
)

public data class GlobT(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: CInt,
)

public data class CpuSetT(
    val bits: UIntArray,
    val bits2: ULongArray,
)

public data class FsidT(
    val value: IntArray,
)

public data class SemT(
    val size: ByteArray,
    val size2: ByteArray,
    val align: LongArray,
)

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class Dirent(
    val dIno: Ino64T,
    val dOff: Off64T,
    val dReclen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)

public const val ENAMETOOLONG: CInt = 36
public const val ENOTEMPTY: CInt = 39
public const val ELOOP: CInt = 40
public const val EADDRINUSE: CInt = 98
public const val EADDRNOTAVAIL: CInt = 99
public const val ENETDOWN: CInt = 100
public const val ENETUNREACH: CInt = 101
public const val ECONNABORTED: CInt = 103
public const val ECONNREFUSED: CInt = 111
public const val ECONNRESET: CInt = 104
public const val EDEADLK: CInt = 35
public const val ENOSYS: CInt = 38
public const val ENOTCONN: CInt = 107
public const val ETIMEDOUT: CInt = 110
public const val ESTALE: CInt = 116
public const val EHOSTUNREACH: CInt = 113
public const val EDQUOT: CInt = 122
public const val EOPNOTSUPP: CInt = 0x5f
public const val ENODATA: CInt = 0x3d
public const val O_APPEND: CInt = 1024
public const val O_ACCMODE: CInt = 3
public const val O_CLOEXEC: CInt = 0x80000
public const val O_CREAT: CInt = 64
public const val O_DIRECTORY: CInt = 65536
public const val O_EXCL: CInt = 128
public const val O_NOFOLLOW: CInt = 0x20000
public const val O_NONBLOCK: CInt = 2048
public const val O_TRUNC: CInt = 512
public const val NCCS: ULong = 32uL
public const val SIG_SETMASK: CInt = 2
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_STREAM: CInt = 1
public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL
public const val PTHREAD_STACK_MIN: ULong = 16384uL
