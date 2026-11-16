// port-lint: source unix/linux_like/l4re/uclibc/uclibc_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.Fsblkcnt64T
import io.github.kotlinmania.libc.FsblkcntT
import io.github.kotlinmania.libc.Fsfilcnt64T
import io.github.kotlinmania.libc.FsfilcntT
import io.github.kotlinmania.libc.FsidT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.KeyT
import io.github.kotlinmania.libc.MS_I_VERSION
import io.github.kotlinmania.libc.MS_MANDLOCK
import io.github.kotlinmania.libc.MS_RDONLY
import io.github.kotlinmania.libc.MS_SYNCHRONOUS
import io.github.kotlinmania.libc.Off64T
import io.github.kotlinmania.libc.PTHREAD_PROCESS_PRIVATE
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.Rlimit
import io.github.kotlinmania.libc.Rlimit64
import io.github.kotlinmania.libc.Sigval
import io.github.kotlinmania.libc.SizeT
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.TcflagT
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.Timezone
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.Winsize

public typealias ShmattT = CUlong

public typealias RegoffT = CInt

public typealias RlimT = CUlong

public typealias RlimitResourceT = CInt

public typealias PriorityWhichT = CUint

public typealias PthreadDescr = COpaquePointer?

public typealias PthreadCondAlignT = CLong

public typealias Ioctl = CUlong

public open class Cmsghdr(
    public var cmsgLen: SizeT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: SizeT,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SizeT,
    public var msgFlags: CInt,
)

public open class Statfs(
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
    public var fFlags: FswordT,
    public var fSpare: List<FswordT>,
)

public open class Statfs64(
    public var fType: FswordT,
    public var fBsize: FswordT,
    public var fBlocks: Fsblkcnt64T,
    public var fBfree: Fsblkcnt64T,
    public var fBavail: Fsblkcnt64T,
    public var fFiles: Fsfilcnt64T,
    public var fFfree: Fsfilcnt64T,
    public var fFsid: FsidT,
    public var fNamelen: FswordT,
    public var fFrsize: FswordT,
    public var fFlags: FswordT,
    public var fSpare: List<FswordT>,
)

public open class Statvfs64(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: Fsfilcnt64T,
    public var fBfree: Fsfilcnt64T,
    public var fBavail: Fsfilcnt64T,
    public var fFiles: Fsfilcnt64T,
    public var fFfree: Fsfilcnt64T,
    public var fFavail: Fsfilcnt64T,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class IpcPerm(
    public var key: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: CUint,
    public var seq: CUshort,
    public var pad2: CUshort,
    public var unused1: CUlong,
    public var unused2: CUlong,
)

public open class Statvfs(
    // Different than GNU!
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFavail: FsfilcntT,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
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

public open class RegexT(
    public var buffer: COpaquePointer?,
    public var allocated: SizeT,
    public var used: SizeT,
    public var syntax: CUlong,
    public var fastmap: COpaquePointer?,
    public var translate: COpaquePointer?,
    public var reNsub: SizeT,
    public var bitfield: UByte,
)

public open class Rtentry(
    public var rtPad1: CUlong,
    public var rtDst: Sockaddr,
    public var rtGateway: Sockaddr,
    public var rtGenmask: Sockaddr,
    public var rtFlags: CUshort,
    public var rtPad2: CShort,
    public var rtPad3: CUlong,
    public var rtTos: CUchar,
    public var rtClass: CUchar,
    public var rtPad4: List<CShort>,
    public var rtMetric: CShort,
    public var rtDev: COpaquePointer?,
    public var rtMtu: CUlong,
    public var rtWindow: CUlong,
    public var rtIrtt: CUshort,
)

public open class ExitStatus(public var eTermination: CShort, public var eExit: CShort)

public open class TcpInfo(
    public var tcpiState: UByte,
    public var tcpiCaState: UByte,
    public var tcpiRetransmits: UByte,
    public var tcpiProbes: UByte,
    public var tcpiBackoff: UByte,
    public var tcpiOptions: UByte,
    /**
     * This contains the bitfields `tcpiSndWscale` and `tcpiRcvWscale`.
     * Each is 4 bits.
     */
    public var tcpiSndRcvWscale: UByte,
    public var tcpiRto: UInt,
    public var tcpiAto: UInt,
    public var tcpiSndMss: UInt,
    public var tcpiRcvMss: UInt,
    public var tcpiUnacked: UInt,
    public var tcpiSacked: UInt,
    public var tcpiLost: UInt,
    public var tcpiRetrans: UInt,
    public var tcpiFackets: UInt,
    public var tcpiLastDataSent: UInt,
    public var tcpiLastAckSent: UInt,
    public var tcpiLastDataRecv: UInt,
    public var tcpiLastAckRecv: UInt,
    public var tcpiPmtu: UInt,
    public var tcpiRcvSsthresh: UInt,
    public var tcpiRtt: UInt,
    public var tcpiRttvar: UInt,
    public var tcpiSndSsthresh: UInt,
    public var tcpiSndCwnd: UInt,
    public var tcpiAdvmss: UInt,
    public var tcpiReordering: UInt,
    public var tcpiRcvRtt: UInt,
    public var tcpiRcvSpace: UInt,
    public var tcpiTotalRetrans: UInt,
)

public open class SchedParam(public var schedPriority: CInt)

public open class PthreadFastlock(public var status: CLong, public var spinlock: CInt)

public open class PthreadCondT(
    public var cLock: PthreadFastlock,
    public var cWaiting: PthreadDescr,
    public var padding: List<UByte>,
    public var align: PthreadCondAlignT,
)

public open class PthreadCondattrT(public var dummy: CInt)

public open class PthreadMutexT(
    public var mReserved: CInt,
    public var mCount: CInt,
    public var mOwner: PthreadDescr,
    public var mKind: CInt,
    public var mLock: PthreadFastlock,
)

public open class PthreadMutexattrT(public var mutexkind: CInt)

public open class PthreadRwlockT(
    public var rwLock: PthreadFastlock,
    public var rwReaders: CInt,
    public var rwWriter: PthreadDescr,
    public var rwReadWaiting: PthreadDescr,
    public var rwWriteWaiting: PthreadDescr,
    public var rwKind: CInt,
    public var rwPshared: CInt,
)

public open class PthreadRwlockattrT(public var lockkind: CInt, public var pshared: CInt)

public open class PthreadBarrierT(
    public var baLock: PthreadFastlock,
    public var baRequired: CInt,
    public var baPresent: CInt,
    public var baWaiting: PthreadDescr,
)

public open class PthreadBarrierattrT(public var pshared: CInt)

public fun SiginfoT.siAddr(): COpaquePointer? {
    open class SiginfoSigfault(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var siAddr: COpaquePointer?,
    )
    return (if (fromRef(this) == null) null else SiginfoSigfault()).siAddr
}

public fun SiginfoT.siValue(): Sigval {
    open class SiginfoSiValue(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var siTimerid: CInt,
        public var siOverrun: CInt,
        public var siValue: Sigval,
    )
    return (if (fromRef(this) == null) null else SiginfoSiValue()).siValue
}

public open class SifieldsSigchld(
    public var siPid: PidT,
    public var siUid: UidT,
    public var siStatus: CInt,
    public var siUtime: CLong,
    public var siStime: CLong,
)

public open class Sifields(public var alignPointer: COpaquePointer?? = null, public var sigchld: SifieldsSigchld? = null)

public open class SiginfoF(public var siginfoBase: List<CInt>, public var sifields: Sifields)

public fun SiginfoT.sifields(): Sifields {
    return (if (fromRef(this) == null) null else SiginfoF()).sifields
}

public fun SiginfoT.siPid(): PidT {
    return this.sifields().sigchld.siPid
}

public fun SiginfoT.siUid(): UidT {
    return this.sifields().sigchld.siUid
}

public fun SiginfoT.siStatus(): CInt {
    return this.sifields().sigchld.siStatus
}

public fun SiginfoT.siUtime(): CLong {
    return this.sifields().sigchld.siUtime
}

public fun SiginfoT.siStime(): CLong {
    return this.sifields().sigchld.siStime
}

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MCL_ONFAULT: CInt = 0x0004

public val SIGEV_THREAD_ID: CInt = 4

public val AF_VSOCK: CInt = 40

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

// These are different than GNU!
public val LC_CTYPE: CInt = 0

public val LC_NUMERIC: CInt = 1

public val LC_TIME: CInt = 3

public val LC_COLLATE: CInt = 4

public val LC_MONETARY: CInt = 2

public val LC_MESSAGES: CInt = 5

public val LC_ALL: CInt = 6

// end different section
// MS_ flags for mount(2)
public val MS_RMT_MASK: CUlong = MS_RDONLY or MS_SYNCHRONOUS or MS_MANDLOCK or MS_I_VERSION

public val ENOTSUP: CInt = EOPNOTSUPP

public val IPV6_JOIN_GROUP: CInt = 20

public val IPV6_LEAVE_GROUP: CInt = 21

// Different than Gnu.
public val FILENAME_MAX: CUint = 4095u

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val SOMAXCONN: CInt = 128

public val ST_RELATIME: CUlong = 4096uL

public val SO_TIMESTAMP: CInt = 29

public val RLIM_INFINITY: io.github.kotlinmania.libc.RlimT = 0uL.inv()

public val AF_NFC: CInt = PF_NFC

public val BUFSIZ: CInt = 256

public val EDEADLK: CInt = 0x23

public val EDEADLOCK: CInt = EDEADLK

public val EXTA: CUint = B19200

public val EXTB: CUint = B38400

public val EXTPROC: TcflagT = 65536

public val FOPEN_MAX: CInt = 16

public val F_GETOWN: CInt = 9

public val F_OFD_GETLK: CInt = 36

public val F_OFD_SETLK: CInt = 37

public val F_OFD_SETLKW: CInt = 38

public val F_RDLCK: CInt = 0

public val F_SETOWN: CInt = 8

public val F_UNLCK: CInt = 2

public val F_WRLCK: CInt = 1

public val IPV6_MULTICAST_ALL: CInt = 29

public val IPV6_ROUTER_ALERT_ISOLATE: CInt = 30

public val MAP_HUGE_SHIFT: CInt = 26

public val MAP_HUGE_MASK: CInt = 0x3f

public val MSG_COPY: CInt = 16384

public val NI_MAXHOST: SocklenT = 1025u

public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY

public val PACKET_MR_UNICAST: CInt = 3

public val PF_NFC: CInt = 39

public val PF_VSOCK: CInt = 40

public val RTLD_NOLOAD: CInt = 0x00004

public val RUSAGE_THREAD: CInt = 1

public val SHM_EXEC: CInt = 32768

public val SOCK_DCCP: CInt = 6

public val SOCK_PACKET: CInt = 10

public val TCP_COOKIE_TRANSACTIONS: CInt = 15

public val UDP_GRO: CInt = 104

public val UDP_SEGMENT: CInt = 103

public val PTHREAD_RWLOCK_PREFER_READER_NP: CInt = 0

public val PTHREAD_RWLOCK_PREFER_WRITER_NP: CInt = 1

public val PTHREAD_RWLOCK_PREFER_WRITER_NONRECURSIVE_NP: CInt = 2

public val PTHREAD_RWLOCK_DEFAULT_NP: CInt = PTHREAD_RWLOCK_PREFER_WRITER_NP

public val PTHREAD_MUTEX_TIMED_NP: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE_NP: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK_NP: CInt = 2

public val PTHREAD_MUTEX_ADAPTIVE_NP: CInt = 3

public val LT_SPINLOCK_INIT: CInt = 0

public val LOCK_INITIALIZER: PthreadFastlock = pthreadFastlock(status = 0, spinlock = LT_SPINLOCK_INIT)

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(mReserved = 0, mCount = 0, mOwner = null, mKind = PTHREAD_MUTEX_TIMED_NP, mLock = LOCK_INITIALIZER)

public val PTHREAD_COND_PADDING_SIZE: Int = 48 - sizeOf<PthreadFastlock>() - sizeOf<PthreadDescr>() - sizeOf<PthreadCondAlignT>()

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(cLock = LOCK_INITIALIZER, cWaiting = null, padding = List(PTHREAD_COND_PADDING_SIZE) { 0 }, align = 0)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(rwLock = LOCK_INITIALIZER, rwReaders = 0, rwWriter = null, rwReadWaiting = null, rwWriteWaiting = null, rwKind = PTHREAD_RWLOCK_DEFAULT_NP, rwPshared = PTHREAD_PROCESS_PRIVATE)

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt

public expect fun pthreadRwlockattrGetkindNp(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, value: CInt?): CInt

public expect fun pthreadRwlockattrSetkindNp(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, value: CInt): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt

public expect fun getauxval(type: CUlong): CUlong
