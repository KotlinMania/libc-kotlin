// port-lint: source unix/linux_like/linux/gnu/b32/b32_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DevT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.PthreadMutexT
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.pthreadMutexT

// 32-bit specific definitions for linux-like values

public typealias ClockT = Int

public typealias ShmattT = CUlong

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias NlinkT = UInt

public typealias U64 = CUlonglong

public typealias S64 = CLonglong

public typealias FswordT = Int

public typealias Fsblkcnt64T = ULong

public typealias Fsfilcnt64T = ULong

public typealias SyscallUlongT = CUlong

public typealias Suseconds64T = Long

public typealias TimeT = Long

public typealias SusecondsT = Int

public typealias InoT = CUlong

public typealias Ino64T = ULong

public typealias OffT = Long

public typealias BlkcntT = Long

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias RlimT = ULong

public typealias BlksizeT = Int

public open class Stat(
    public var stDev: DevT,
    public var pad1: CUint,
    public var stIno: io.github.kotlinmania.libc.InoT,
    public var stMode: ModeT,
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var pad2: CUint,
    public var stSize: OffT,
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var stBlocks: io.github.kotlinmania.libc.BlkcntT,
    public var stAtime: io.github.kotlinmania.libc.TimeT,
    public var stAtimeNsec: CLong,
    public var atimePad: CInt,
    public var stMtime: io.github.kotlinmania.libc.TimeT,
    public var stMtimeNsec: CLong,
    public var mtimePad: CInt,
    public var stCtime: io.github.kotlinmania.libc.TimeT,
    public var stCtimeNsec: CLong,
    public var ctimePad: CInt,
    public var glibcReserved4: CLong,
    public var glibcReserved5: CLong,
)

public open class Statvfs(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFavail: io.github.kotlinmania.libc.FsfilcntT,
    public var fFsid: CUlong,
    public var fUnused: CInt,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class PthreadAttrT(public var size: List<UInt>)

public open class SigsetT(public var value: List<CUlong>)

public open class Sysinfo(
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

public open class SemidDs(
    public var semPerm: IpcPerm,
    public var semOtime: io.github.kotlinmania.libc.TimeT,
    public var reserved: io.github.kotlinmania.libc.SyscallUlongT,
    public var semCtime: io.github.kotlinmania.libc.TimeT,
    public var reserved2: io.github.kotlinmania.libc.SyscallUlongT,
    public var semNsems: io.github.kotlinmania.libc.SyscallUlongT,
    public var glibcReserved3: io.github.kotlinmania.libc.SyscallUlongT,
    public var glibcReserved4: io.github.kotlinmania.libc.SyscallUlongT,
)

public open class Timex(
    public var modes: CUint,
    public var pad1: CInt,
    public var offset: CLonglong,
    public var freq: CLonglong,
    public var maxerror: CLonglong,
    public var esterror: CLonglong,
    public var status: CInt,
    public var pad2: CInt,
    public var constant: CLonglong,
    public var precision: CLonglong,
    public var tolerance: CLonglong,
    public var time: Timeval,
    public var tick: CLonglong,
    public var ppsfreq: CLonglong,
    public var jitter: CLonglong,
    public var shift: CInt,
    public var pad3: CInt,
    public var stabil: CLonglong,
    public var jitcnt: CLonglong,
    public var calcnt: CLonglong,
    public var errcnt: CLonglong,
    public var stbcnt: CLonglong,
    public var tai: CInt,
    public var unused1: Int,
    public var unused2: Int,
    public var unused3: Int,
    public var unused4: Int,
    public var unused5: Int,
    public var unused6: Int,
    public var unused7: Int,
    public var unused8: Int,
    public var unused9: Int,
    public var unused10: Int,
    public var unused11: Int,
)

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val F_OFD_GETLK: CInt = 36

public val F_OFD_SETLK: CInt = 37

public val F_OFD_SETLKW: CInt = 38

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_MUTEX_T: Int = 24

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 32

public val SIZEOF_PTHREAD_BARRIER_T: Int = 20

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val O_NOATIME: CInt = 262144

public val O_PATH: CInt = 2097152

public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY

public val SA_ONSTACK: CInt = 0x08000000

public val PTRACE_DETACH: CUint = 17u

public val F_RDLCK: CInt = 0

public val F_WRLCK: CInt = 1

public val F_UNLCK: CInt = 2

public val SFD_CLOEXEC: CInt = 0x080000

public val NCCS: Int = 32

public val O_TRUNC: CInt = 512

public val O_CLOEXEC: CInt = 0x80000

public val EBFONT: CInt = 59

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENONET: CInt = 64

public val ENOPKG: CInt = 65

public val EREMOTE: CInt = 66

public val ENOLINK: CInt = 67

public val EADV: CInt = 68

public val ESRMNT: CInt = 69

public val ECOMM: CInt = 70

public val EPROTO: CInt = 71

public val EDOTDOT: CInt = 73

public val SA_NODEFER: CInt = 0x40000000

public val SA_RESETHAND: CInt = 0x80000000

public val SA_RESTART: CInt = 0x10000000

public val SA_NOCLDSTOP: CInt = 0x00000001

public val EPOLL_CLOEXEC: CInt = 0x80000

public val EFD_CLOEXEC: CInt = 0x80000

public val F_SETLK: CInt = 13

public val F_SETLKW: CInt = 14

public val F_SETLK1: CInt = 6

public val F_SETLKW1: CInt = 7

public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = pthreadmutext(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTRACE_GETFPREGS: CUint = 14u

public val PTRACE_SETFPREGS: CUint = 15u

public val PTRACE_GETREGS: CUint = 12u

public val PTRACE_SETREGS: CUint = 13u

public expect fun sysctl(name: CInt?, namelen: CInt, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt
