// port-lint: source libc/src/unix/linux_like/android/b32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*

public typealias ModeT = UShort
public typealias Off64T = CLongLong
public typealias SigsetT = CULong
public typealias SocklenT = Int
public typealias Time64T = Long
public typealias U64 = CULongLong
public typealias S64 = CLongLong

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
    val saRestorer: (() -> Unit)?,
)

public data class Rlimit64(
    val rlimCur: ULong,
    val rlimMax: ULong,
)

public data class Stat(
    val stDev: CULongLong,
    val stIno: InoT,
    val stMode: CUInt,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: CULongLong,
    val stSize: CLongLong,
    val stBlksize: BlksizeT,
    val stBlocks: CULongLong,
    val stAtime: CLong,
    val stAtimeNsec: CLong,
    val stMtime: CLong,
    val stMtimeNsec: CLong,
    val stCtime: CLong,
    val stCtimeNsec: CLong,
    val stIno2: CULongLong,
)

public data class Stat64(
    val stDev: CULongLong,
    val stIno: InoT,
    val stMode: CUInt,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: CULongLong,
    val stSize: CLongLong,
    val stBlksize: BlksizeT,
    val stBlocks: CULongLong,
    val stAtime: CLong,
    val stAtimeNsec: CLong,
    val stMtime: CLong,
    val stMtimeNsec: CLong,
    val stCtime: CLong,
    val stCtimeNsec: CLong,
    val stIno2: CULongLong,
)

public data class Statfs64(
    val fType: UInt,
    val fBsize: UInt,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: FsidT,
    val fNamelen: UInt,
    val fFrsize: UInt,
    val fFlags: UInt,
    val fSpare: UIntArray,
)

public data class Statvfs64(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: CULong,
    val fBfree: CULong,
    val fBavail: CULong,
    val fFiles: CULong,
    val fFfree: CULong,
    val fFavail: CULong,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
)

public data class PthreadAttrT(
    val flags: UInt,
    val stackBase: COpaquePointer?,
    val stackSize: ULong,
    val guardSize: ULong,
    val schedPolicy: Int,
    val schedPriority: Int,
)

public data class PthreadMutexT(
    val value: CInt,
)

public data class PthreadCondT(
    val value: CInt,
)

public data class PthreadRwlockT(
    val lock: PthreadMutexT,
    val cond: PthreadCondT,
    val numLocks: CInt,
    val writerThreadId: CInt,
    val pendingReaders: CInt,
    val pendingWriters: CInt,
    val attr: Int,
)

public data class PthreadBarrierT(
    val private: IntArray,
)

public data class PthreadSpinlockT(
    val private: IntArray,
)

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UidT,
    val pwGid: GidT,
    val pwDir: String?,
    val pwShell: String?,
)

public data class Statfs(
    val fType: UInt,
    val fBsize: UInt,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: FsidT,
    val fNamelen: UInt,
    val fFrsize: UInt,
    val fFlags: UInt,
    val fSpare: UIntArray,
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
public const val RTLD_GLOBAL: CInt = 2
public const val RTLD_NOW: CInt = 0
public const val PTRACE_GETFPREGS: CInt = 14
public const val PTRACE_SETFPREGS: CInt = 15
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(value = 0)
public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(value = 0)
public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(lock = PTHREAD_MUTEX_INITIALIZER, cond = PTHREAD_COND_INITIALIZER, numLocks = 0, writerThreadId = 0, pendingReaders = 0, pendingWriters = 0, attr = 0)
public val PTHREAD_STACK_MIN: ULong = 4096uL * 2uL
public const val CPU_SETSIZE: ULong = 32uL
public const val __CPU_BITS: ULong = 32uL
public const val UT_LINESIZE: ULong = 8uL
public const val UT_NAMESIZE: ULong = 8uL
public const val UT_HOSTSIZE: ULong = 16uL
public const val SIGSTKSZ: ULong = 8192uL
public const val MINSIGSTKSZ: ULong = 2048uL

public fun timegm64(tm: Tm?): Time64T = throw UnsupportedOperationException("Not implemented on this platform")
