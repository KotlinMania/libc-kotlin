// port-lint: source unix/linux_like/linux/gnu/b32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadMutexT

public typealias ClockT = Int
public typealias ShmattT = CULong
public typealias MsgqnumT = CULong
public typealias MsglenT = CULong
public typealias NlinkT = UInt
public typealias U64 = CULongLong
public typealias S64 = CLongLong
public typealias FswordT = Int
public typealias Fsblkcnt64T = ULong
public typealias Fsfilcnt64T = ULong
public typealias SyscallUlongT = CULong
public typealias Suseconds64T = Long
public typealias TimeT = Long
public typealias SusecondsT = Long
public typealias InoT = Ino64T
public typealias OffT = Long
public typealias BlkcntT = Long
public typealias FsblkcntT = ULong
public typealias FsfilcntT = ULong
public typealias RlimT = ULong
public typealias BlksizeT = Long

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stIno2: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stIno3: InoT,
)

public data class Statvfs(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFavail: FsfilcntT,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fSpare: IntArray,
)

public data class PthreadAttrT(
    val size: UIntArray,
)

public data class SigsetT(
    val `val`: ULongArray,
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

public data class SemidDs(
    val semPerm: IpcPerm,
    val semOtime: TimeT,
    val semCtime: TimeT,
    val semNsems: SyscallUlongT,
)

public data class Timex(
    val modes: CUInt,
    val offset: CLongLong,
    val freq: CLongLong,
    val maxerror: CLongLong,
    val esterror: CLongLong,
    val status: CInt,
    val constant: CLongLong,
    val precision: CLongLong,
    val tolerance: CLongLong,
    val time: Timeval,
    val tick: CLongLong,
    val ppsfreq: CLongLong,
    val jitter: CLongLong,
    val shift: CInt,
    val stabil: CLongLong,
    val jitcnt: CLongLong,
    val calcnt: CLongLong,
    val errcnt: CLongLong,
    val stbcnt: CLongLong,
    val tai: CInt,
    val unused1: Int,
    val unused2: Int,
    val unused3: Int,
    val unused4: Int,
    val unused5: Int,
    val unused6: Int,
    val unused7: Int,
    val unused8: Int,
    val unused9: Int,
    val unused10: Int,
    val unused11: Int,
)

public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val F_OFD_GETLK: CInt = 36
public const val F_OFD_SETLK: CInt = 37
public const val F_OFD_SETLKW: CInt = 38
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 24uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 20uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL
public const val O_NOATIME: CInt = 0x200000
public const val O_PATH: CInt = 0x1000000
public val O_TMPFILE: CInt = 0x2000000 or O_DIRECTORY
public const val SA_ONSTACK: CInt = 1
public const val PTRACE_DETACH: CUInt = 11u
public const val F_RDLCK: CInt = 1
public const val F_WRLCK: CInt = 2
public const val F_UNLCK: CInt = 3
public const val SFD_CLOEXEC: CInt = 0x400000
public const val NCCS: ULong = 17uL
public const val O_TRUNC: CInt = 0x400
public const val O_CLOEXEC: CInt = 0x400000
public const val EBFONT: CInt = 109
public const val ENOSTR: CInt = 72
public const val ENODATA: CInt = 111
public const val ETIME: CInt = 73
public const val ENOSR: CInt = 74
public const val ENONET: CInt = 80
public const val ENOPKG: CInt = 113
public const val EREMOTE: CInt = 71
public const val ENOLINK: CInt = 82
public const val EADV: CInt = 83
public const val ESRMNT: CInt = 84
public const val ECOMM: CInt = 85
public const val EPROTO: CInt = 86
public const val EDOTDOT: CInt = 88
public const val SA_NODEFER: CInt = 0x20
public const val SA_RESETHAND: CInt = 0x4
public const val SA_RESTART: CInt = 0x2
public const val SA_NOCLDSTOP: CInt = 0x00000008
public const val EPOLL_CLOEXEC: CInt = 0x400000
public const val EFD_CLOEXEC: CInt = 0x400000
public const val F_SETLK: CInt = 8
public const val F_SETLKW: CInt = 9
public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
public const val PTRACE_GETFPREGS: CUInt = 14u
public const val PTRACE_SETFPREGS: CUInt = 15u
public const val PTRACE_GETREGS: CUInt = 12u
public const val PTRACE_SETREGS: CUInt = 13u

public fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt = -1
