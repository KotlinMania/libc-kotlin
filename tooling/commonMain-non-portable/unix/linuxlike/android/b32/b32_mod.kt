// port-lint: source unix/linux_like/android/b32/b32_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.BlksizeT
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FsidT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.InoT
import io.github.kotlinmania.libc.NlinkT
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.Tm
import io.github.kotlinmania.libc.UidT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

// The following definitions are correct for arm and i686,
// but may be wrong for mips
public typealias ModeT = UShort

public typealias Off64T = CLonglong

public typealias SigsetT = CUlong

public typealias SocklenT = Int

public typealias Time64T = Long

public typealias U64 = CUlonglong

public typealias S64 = CLonglong

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: io.github.kotlinmania.libc.SigsetT,
    public var saFlags: CInt,
    public var saRestorer: SigactionSaRestorerCallback?,
)

public open class Rlimit64(public var rlimCur: ULong, public var rlimMax: ULong)

public open class Stat(
    public var stDev: CUlonglong,
    public var pad0: List<CUchar>,
    public var stIno: InoT,
    public var stMode: CUint,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlonglong,
    public var pad3: List<CUchar>,
    public var stSize: CLonglong,
    public var stBlksize: BlksizeT,
    public var stBlocks: CUlonglong,
    public var stAtime: CLong,
    public var stAtimeNsec: CLong,
    public var stMtime: CLong,
    public var stMtimeNsec: CLong,
    public var stCtime: CLong,
    public var stCtimeNsec: CLong,
)

public open class Stat64(
    public var stDev: CUlonglong,
    public var pad0: List<CUchar>,
    public var stIno: InoT,
    public var stMode: CUint,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlonglong,
    public var pad3: List<CUchar>,
    public var stSize: CLonglong,
    public var stBlksize: BlksizeT,
    public var stBlocks: CUlonglong,
    public var stAtime: CLong,
    public var stAtimeNsec: CLong,
    public var stMtime: CLong,
    public var stMtimeNsec: CLong,
    public var stCtime: CLong,
    public var stCtimeNsec: CLong,
)

public open class Statfs64(
    public var fType: UInt,
    public var fBsize: UInt,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fNamelen: UInt,
    public var fFrsize: UInt,
    public var fFlags: UInt,
    public var fSpare: List<UInt>,
)

public open class Statvfs64(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: CUlong,
    public var fBfree: CUlong,
    public var fBavail: CUlong,
    public var fFiles: CUlong,
    public var fFfree: CUlong,
    public var fFavail: CUlong,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
)

public open class PthreadAttrT(
    public var flags: UInt,
    public var stackBase: COpaquePointer?,
    public var stackSize: SizeT,
    public var guardSize: SizeT,
    public var schedPolicy: Int,
    public var schedPriority: Int,
)

public open class PthreadMutexT(public var value: CInt)

public open class PthreadCondT(public var value: CInt)

public open class PthreadRwlockT(
    public var lock: PthreadMutexT,
    public var cond: PthreadCondT,
    public var numLocks: CInt,
    public var writerThreadId: CInt,
    public var pendingReaders: CInt,
    public var pendingWriters: CInt,
    public var attr: Int,
    public var reserved: List<CChar>,
)

public open class PthreadBarrierT(public var private: List<Int>)

public open class PthreadSpinlockT(public var private: List<Int>)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class Statfs(
    public var fType: UInt,
    public var fBsize: UInt,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fNamelen: UInt,
    public var fFrsize: UInt,
    public var fFlags: UInt,
    public var fSpare: List<UInt>,
)

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

public open class Sigset64T(public var bits: List<CUlong>)

// These constants must be of the same type of sigaction.saFlags
public val SA_NOCLDSTOP: CInt = 0x00000001

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SA_NODEFER: CInt = 0x40000000

public val SA_ONSTACK: CInt = 0x08000000

public val SA_RESETHAND: CInt = 0x80000000

public val SA_RESTART: CInt = 0x10000000

public val SA_SIGINFO: CInt = 0x00000004

public val RTLD_GLOBAL: CInt = 2

public val RTLD_NOW: CInt = 0

public val RTLD_DEFAULT: COpaquePointer? = COpaquePointer((-1).toLong())

public val PTRACE_GETFPREGS: CInt = 14

public val PTRACE_SETFPREGS: CInt = 15

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(value = 0)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(value = 0)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(lock = PTHREAD_MUTEX_INITIALIZER, cond = PTHREAD_COND_INITIALIZER, numLocks = 0, writerThreadId = 0, pendingReaders = 0, pendingWriters = 0, attr = 0, reserved = 0)

public val PTHREAD_STACK_MIN: SizeT = 4096uL * 2uL

public val CPU_SETSIZE: SizeT = 32uL

public val CPU_BITS: SizeT = 32uL

public val UT_LINESIZE: Int = 8

public val UT_NAMESIZE: Int = 8

public val UT_HOSTSIZE: Int = 16

public val SIGSTKSZ: SizeT = 8192uL

public val MINSIGSTKSZ: SizeT = 2048uL

public expect fun timegm64(tm: Tm?): io.github.kotlinmania.libc.Time64T
