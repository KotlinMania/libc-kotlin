// port-lint: source unix/linux_like/android/b64/b64_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FsidT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.PropInfo
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.syscall

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

// The following definitions are correct for aarch64 and x8664,
// but may be wrong for mips64
public typealias ModeT = UInt

public typealias Off64T = Long

public typealias SocklenT = UInt

public open class SigsetT(public var value: List<CUlong>)

public open class Sigaction(
    public var saFlags: CInt,
    public var saSigaction: SighandlerT,
    public var saMask: io.github.kotlinmania.libc.SigsetT,
    public var saRestorer: SigactionSaRestorerCallback?,
)

public open class Rlimit64(public var rlimCur: CUlonglong, public var rlimMax: CUlonglong)

public open class PthreadAttrT(
    public var flags: UInt,
    public var stackBase: COpaquePointer?,
    public var stackSize: SizeT,
    public var guardSize: SizeT,
    public var schedPolicy: Int,
    public var schedPriority: Int,
    public var reserved: List<CChar>,
)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class Statfs(
    public var fType: ULong,
    public var fBsize: ULong,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fNamelen: ULong,
    public var fFrsize: ULong,
    public var fFlags: ULong,
    public var fSpare: List<ULong>,
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

public open class Statfs64(
    public var fType: ULong,
    public var fBsize: ULong,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fNamelen: ULong,
    public var fFrsize: ULong,
    public var fFlags: ULong,
    public var fSpare: List<ULong>,
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
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class PthreadBarrierT(public var private: List<Long>)

public open class PthreadSpinlockT(public var private: Long)

public open class PthreadMutexT(public var value: CInt, public var reserved: List<CChar>)

public open class PthreadCondT(public var value: CInt, public var reserved: List<CChar>)

public open class PthreadRwlockT(
    public var numLocks: CInt,
    public var writerThreadId: CInt,
    public var pendingReaders: CInt,
    public var pendingWriters: CInt,
    public var attr: Int,
    public var reserved: List<CChar>,
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

public val RTLD_GLOBAL: CInt = 0x00100

public val RTLD_NOW: CInt = 2

public val RTLD_DEFAULT: COpaquePointer? = null

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(value = 0, reserved = 0)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(value = 0, reserved = 0)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(numLocks = 0, writerThreadId = 0, pendingReaders = 0, pendingWriters = 0, attr = 0, reserved = 0)

public val PTHREAD_STACK_MIN: SizeT = 4096uL * 4uL

public val CPU_SETSIZE: SizeT = 1024uL

public val CPU_BITS: SizeT = 64uL

public val UT_LINESIZE: Int = 32

public val UT_NAMESIZE: Int = 32

public val UT_HOSTSIZE: Int = 256

public fun accept4(fd: CInt, addr: Sockaddr?, len: UInt?, flg: CInt): CInt {
    return syscall(SysAccept4, fd, addr, len, flg).toInt()
}

public expect fun systemPropertyWait(pi: PropInfo?, oldSerial: UInt, newSerialPtr: UInt?, relativeTimeout: Timespec?): Boolean
