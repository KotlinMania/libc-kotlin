// port-lint: source unix/linux_like/android/b64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.android.PropInfo

public typealias ModeT = UInt
public typealias Off64T = Long
public typealias SocklenT = UInt

public data class SigsetT(
    val `val`: ULongArray,
)

public data class Sigaction(
    val saFlags: CInt,
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saRestorer: (() -> Unit)?,
)

public data class Rlimit64(
    val rlimCur: CULongLong,
    val rlimMax: CULongLong,
)

public data class PthreadAttrT(
    val flags: UInt,
    val stackBase: COpaquePointer?,
    val stackSize: ULong,
    val guardSize: ULong,
    val schedPolicy: Int,
    val schedPriority: Int,
)

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UidT,
    val pwGid: GidT,
    val pwGecos: String?,
    val pwDir: String?,
    val pwShell: String?,
)

public data class Statfs(
    val fType: ULong,
    val fBsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: FsidT,
    val fNamelen: ULong,
    val fFrsize: ULong,
    val fFlags: ULong,
    val fSpare: ULongArray,
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

public data class Statfs64(
    val fType: ULong,
    val fBsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: FsidT,
    val fNamelen: ULong,
    val fFrsize: ULong,
    val fFlags: ULong,
    val fSpare: ULongArray,
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

public data class PthreadBarrierT(
    val private: LongArray,
)

public data class PthreadSpinlockT(
    val private: Long,
)

public data class PthreadMutexT(
    val value: CInt,
)

public data class PthreadCondT(
    val value: CInt,
)

public data class PthreadRwlockT(
    val numLocks: CInt,
    val writerThreadId: CInt,
    val pendingReaders: CInt,
    val pendingWriters: CInt,
    val attr: Int,
)

public data class Sigset64T(
    val bits: ULongArray,
)

public const val SA_NOCLDSTOP: CInt = 0x00000001
public const val SA_NOCLDWAIT: CInt = 0x00000002
public const val SA_NODEFER: CInt = 0x40000000
public const val SA_ONSTACK: CInt = 0x08000000
public const val SA_RESETHAND: CInt = 0x80000000.toInt()
public const val SA_RESTART: CInt = 0x10000000
public const val SA_SIGINFO: CInt = 0x00000004
public const val RTLD_GLOBAL: CInt = 0x00100
public const val RTLD_NOW: CInt = 2
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(value = 0)
public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(value = 0)
public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(numLocks = 0, writerThreadId = 0, pendingReaders = 0, pendingWriters = 0, attr = 0)
public val PTHREAD_STACK_MIN: ULong = 4096uL * 4uL
public const val CPU_SETSIZE: ULong = 1024uL
public const val __CPU_BITS: ULong = 64uL
public const val UT_LINESIZE: ULong = 32uL
public const val UT_NAMESIZE: ULong = 32uL
public const val UT_HOSTSIZE: ULong = 256uL

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt = -1

public fun systemPropertyWait(pi: PropInfo?, oldSerial: UInt, newSerialPtr: UInt?, relativeTimeout: Timespec?): Boolean = false
