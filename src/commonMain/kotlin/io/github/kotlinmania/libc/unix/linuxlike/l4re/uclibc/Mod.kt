// port-lint: source unix/linux_like/l4re/uclibc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public typealias ShmattT = CULong
public typealias RegoffT = CInt
public typealias RlimT = CULong
public typealias RlimitResourceT = CInt
public typealias PriorityWhichT = CUInt
public typealias PthreadDescr = COpaquePointer?
public typealias PthreadCondAlignT = CLong
public typealias Ioctl = CULong

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: CInt,
    val msgIovlen2: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: SocklenT,
    val msgControllen2: ULong,
    val msgFlags: CInt,
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
    val fFlags: FswordT,
    val fSpare: List<FswordT>,
)

public data class Statfs64(
    val fType: FswordT,
    val fBsize: FswordT,
    val fBlocks: Fsblkcnt64T,
    val fBfree: Fsblkcnt64T,
    val fBavail: Fsblkcnt64T,
    val fFiles: Fsfilcnt64T,
    val fFfree: Fsfilcnt64T,
    val fFsid: FsidT,
    val fNamelen: FswordT,
    val fFrsize: FswordT,
    val fFlags: FswordT,
    val fSpare: List<FswordT>,
)

public data class Statvfs64(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: Fsfilcnt64T,
    val fBfree: Fsfilcnt64T,
    val fBavail: Fsfilcnt64T,
    val fFiles: Fsfilcnt64T,
    val fFfree: Fsfilcnt64T,
    val fFavail: Fsfilcnt64T,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fSpare: IntArray,
)

public data class IpcPerm(
    val key: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: CUShort,
    val mode2: CUInt,
    val pad1: CUShort,
    val seq: CUShort,
    val pad2: CUShort,
    val unused1: CULong,
    val unused2: CULong,
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
    val fUnused: CInt,
    val fFsid2: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fSpare: IntArray,
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
    val f2: ByteArray,
)

public data class RegexT(
    val buffer: COpaquePointer?,
    val allocated: ULong,
    val used: ULong,
    val syntax: CULong,
    val fastmap: String?,
    val translate: String?,
    val reNsub: ULong,
    val bitfield: UByte,
)

public data class Rtentry(
    val rtPad1: CULong,
    val rtDst: Sockaddr,
    val rtGateway: Sockaddr,
    val rtGenmask: Sockaddr,
    val rtFlags: CUShort,
    val rtPad2: CShort,
    val rtPad3: CULong,
    val rtTos: CUChar,
    val rtClass: CUChar,
    val rtPad4: ShortArray,
    val rtPad42: CShort,
    val rtMetric: CShort,
    val rtDev: String?,
    val rtMtu: CULong,
    val rtWindow: CULong,
    val rtIrtt: CUShort,
)

public data class ExitStatus(
    val eTermination: CShort,
    val eExit: CShort,
)

public data class TcpInfo(
    val tcpiState: UByte,
    val tcpiCaState: UByte,
    val tcpiRetransmits: UByte,
    val tcpiProbes: UByte,
    val tcpiBackoff: UByte,
    val tcpiOptions: UByte,
    val tcpiSndRcvWscale: UByte,
    val tcpiRto: UInt,
    val tcpiAto: UInt,
    val tcpiSndMss: UInt,
    val tcpiRcvMss: UInt,
    val tcpiUnacked: UInt,
    val tcpiSacked: UInt,
    val tcpiLost: UInt,
    val tcpiRetrans: UInt,
    val tcpiFackets: UInt,
    val tcpiLastDataSent: UInt,
    val tcpiLastAckSent: UInt,
    val tcpiLastDataRecv: UInt,
    val tcpiLastAckRecv: UInt,
    val tcpiPmtu: UInt,
    val tcpiRcvSsthresh: UInt,
    val tcpiRtt: UInt,
    val tcpiRttvar: UInt,
    val tcpiSndSsthresh: UInt,
    val tcpiSndCwnd: UInt,
    val tcpiAdvmss: UInt,
    val tcpiReordering: UInt,
    val tcpiRcvRtt: UInt,
    val tcpiRcvSpace: UInt,
    val tcpiTotalRetrans: UInt,
)

public data class SchedParam(
    val schedPriority: CInt,
)

public data class PthreadFastlock(
    val status: CLong,
    val spinlock: CInt,
)

public data class PthreadCondT(
    val cLock: PthreadFastlock,
    val cWaiting: PthreadDescr,
    val padding: UByteArray,
    val align: PthreadCondAlignT,
)

public data class PthreadCondattrT(
    val dummy: CInt,
)

public data class PthreadMutexT(
    val mReserved: CInt,
    val mCount: CInt,
    val mOwner: PthreadDescr,
    val mKind: CInt,
    val mLock: PthreadFastlock,
)

public data class PthreadMutexattrT(
    val mutexkind: CInt,
)

public data class PthreadRwlockT(
    val rwLock: PthreadFastlock,
    val rwReaders: CInt,
    val rwWriter: PthreadDescr,
    val rwReadWaiting: PthreadDescr,
    val rwWriteWaiting: PthreadDescr,
    val rwKind: CInt,
    val rwPshared: CInt,
)

public data class PthreadRwlockattrT(
    val lockkind: CInt,
    val pshared: CInt,
)

public data class PthreadBarrierT(
    val baLock: PthreadFastlock,
    val baRequired: CInt,
    val baPresent: CInt,
    val baWaiting: PthreadDescr,
)

public data class PthreadBarrierattrT(
    val pshared: CInt,
)

public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val MCL_ONFAULT: CInt = 0x0004
public const val SIGEV_THREAD_ID: CInt = 4
public const val AF_VSOCK: CInt = 40
public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val LC_CTYPE: CInt = 0
public const val LC_NUMERIC: CInt = 1
public const val LC_TIME: CInt = 3
public const val LC_COLLATE: CInt = 4
public const val LC_MONETARY: CInt = 2
public const val LC_MESSAGES: CInt = 5
public const val LC_ALL: CInt = 6
public const val ENOTSUP: CInt = EOPNOTSUPP
public const val IPV6_JOIN_GROUP: CInt = 20
public const val IPV6_LEAVE_GROUP: CInt = 21
public const val FILENAME_MAX: CUInt = 4095u
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
public const val SOMAXCONN: CInt = 128
public const val ST_RELATIME: CULong = 4096uL
public const val SO_TIMESTAMP: CInt = 29
public val RLIM_INFINITY: RlimT = 0uL.inv()
public const val AF_NFC: CInt = PF_NFC
public const val BUFSIZ: CInt = 256
public const val EDEADLK: CInt = 0x23
public const val EDEADLOCK: CInt = EDEADLK
public const val EXTA: CUInt = B19200
public const val EXTB: CUInt = B38400
public const val EXTPROC: TcflagT = 65536u
public const val FOPEN_MAX: CInt = 16
public const val F_GETOWN: CInt = 9
public const val F_OFD_GETLK: CInt = 36
public const val F_OFD_SETLK: CInt = 37
public const val F_OFD_SETLKW: CInt = 38
public const val F_RDLCK: CInt = 0
public const val F_SETOWN: CInt = 8
public const val F_UNLCK: CInt = 2
public const val F_WRLCK: CInt = 1
public const val IPV6_MULTICAST_ALL: CInt = 29
public const val IPV6_ROUTER_ALERT_ISOLATE: CInt = 30
public const val MAP_HUGE_SHIFT: CInt = 26
public const val MAP_HUGE_MASK: CInt = 0x3f
public const val MSG_COPY: CInt = 16384
public const val NI_MAXHOST: SocklenT = 1025u
public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY
public const val PACKET_MR_UNICAST: CInt = 3
public const val PF_NFC: CInt = 39
public const val PF_VSOCK: CInt = 40
public const val RTLD_NOLOAD: CInt = 0x00004
public const val RUSAGE_THREAD: CInt = 1
public const val SHM_EXEC: CInt = 32768
public const val SOCK_DCCP: CInt = 6
public const val SOCK_PACKET: CInt = 10
public const val TCP_COOKIE_TRANSACTIONS: CInt = 15
public const val UDP_GRO: CInt = 104
public const val UDP_SEGMENT: CInt = 103
public const val PTHREAD_RWLOCK_PREFER_READER_NP: CInt = 0
public const val PTHREAD_RWLOCK_PREFER_WRITER_NP: CInt = 1
public const val PTHREAD_RWLOCK_PREFER_WRITER_NONRECURSIVE_NP: CInt = 2
public const val PTHREAD_RWLOCK_DEFAULT_NP: CInt = PTHREAD_RWLOCK_PREFER_WRITER_NP
public const val PTHREAD_MUTEX_TIMED_NP: CInt = 0
public const val PTHREAD_MUTEX_RECURSIVE_NP: CInt = 1
public const val PTHREAD_MUTEX_ERRORCHECK_NP: CInt = 2
public const val PTHREAD_MUTEX_ADAPTIVE_NP: CInt = 3
public const val __LT_SPINLOCK_INIT: CInt = 0
public val __LOCK_INITIALIZER: PthreadFastlock = PthreadFastlock(status = 0, spinlock = __LT_SPINLOCK_INIT)
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(mReserved = 0, mCount = 0, mOwner = null_mut(), mKind = PTHREAD_MUTEX_TIMED_NP, mLock = __LOCK_INITIALIZER)

// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { __c_lock: __LOCK_INITIALIZER, __c_waiting: core::ptr::null_mut(), __padding: [0 (initializer represented at the FFI boundary)
public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(rwLock = __LOCK_INITIALIZER, rwReaders = 0, rwWriter = null_mut(), rwReadWaiting = null_mut(), rwWriteWaiting = null_mut(), rwKind = PTHREAD_RWLOCK_DEFAULT_NP, rwPshared = PTHREAD_PROCESS_PRIVATE)

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt

public expect fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, `val`: CInt?): CInt

public expect fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, `val`: CInt): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt

public expect fun getauxval(type: CULong): CULong
