// port-lint: source unix/linux_like/linux/uclibc/uclibc_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FsblkcntT
import io.github.kotlinmania.libc.FsfilcntT
import io.github.kotlinmania.libc.IdT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.MS_I_VERSION
import io.github.kotlinmania.libc.MS_MANDLOCK
import io.github.kotlinmania.libc.MS_RDONLY
import io.github.kotlinmania.libc.MS_SYNCHRONOUS
import io.github.kotlinmania.libc.Mmsghdr
import io.github.kotlinmania.libc.NlItem
import io.github.kotlinmania.libc.Off64T
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.PthreadRwlockattrT
import io.github.kotlinmania.libc.Rlimit
import io.github.kotlinmania.libc.Rlimit64
import io.github.kotlinmania.libc.S32
import io.github.kotlinmania.libc.Sigval
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.TcflagT
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.Timezone
import io.github.kotlinmania.libc.U32
import io.github.kotlinmania.libc.U64
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.Winsize

public typealias ShmattT = CUlong

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias RegoffT = CInt

public typealias RlimT = CUlong

public typealias RlimitResourceT = CUlong

public typealias PriorityWhichT = CUint

public typealias Ioctl = CUlong

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

public open class PtracePeeksiginfoArgs(
    public var off: U64,
    public var flags: U32,
    public var nr: S32,
)

public open class PthreadMutexattrT(public var size: List<UByte>)

public open class PthreadCondattrT(public var size: List<UByte>)

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

public fun SiginfoT.siAddr(): COpaquePointer? {
    open class SiginfoSigfault(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var siAddr: COpaquePointer?,
    )
    return (((this as SiginfoT?) as SiginfoSigfault?)).siAddr
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
    return (((this as SiginfoT?) as SiginfoSiValue?)).siValue
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
    return (((this as SiginfoT?) as SiginfoF?)).sifields
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

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public val BINDERFS_SUPER_MAGIC: CLong = 0x6c6f6f70L

public val XFS_SUPER_MAGIC: CLong = 0x58465342L

public val PTRACE_TRACEME: CInt = 0

public val PTRACE_PEEKTEXT: CInt = 1

public val PTRACE_PEEKDATA: CInt = 2

public val PTRACE_PEEKUSER: CInt = 3

public val PTRACE_POKETEXT: CInt = 4

public val PTRACE_POKEDATA: CInt = 5

public val PTRACE_POKEUSER: CInt = 6

public val PTRACE_CONT: CInt = 7

public val PTRACE_KILL: CInt = 8

public val PTRACE_SINGLESTEP: CInt = 9

public val PTRACE_GETREGS: CInt = 12

public val PTRACE_SETREGS: CInt = 13

public val PTRACE_GETFPREGS: CInt = 14

public val PTRACE_SETFPREGS: CInt = 15

public val PTRACE_ATTACH: CInt = 16

public val PTRACE_DETACH: CInt = 17

public val PTRACE_GETFPXREGS: CInt = 18

public val PTRACE_SETFPXREGS: CInt = 19

public val PTRACE_SYSCALL: CInt = 24

public val PTRACE_SETOPTIONS: CInt = 0x4200

public val PTRACE_GETEVENTMSG: CInt = 0x4201

public val PTRACE_GETSIGINFO: CInt = 0x4202

public val PTRACE_SETSIGINFO: CInt = 0x4203

public val PTRACE_GETREGSET: CInt = 0x4204

public val PTRACE_SETREGSET: CInt = 0x4205

public val PTRACE_SEIZE: CInt = 0x4206

public val PTRACE_INTERRUPT: CInt = 0x4207

public val PTRACE_LISTEN: CInt = 0x4208

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

// These are different from GNU
public val ABDAY_1: NlItem = 0x300

public val ABDAY_2: NlItem = 0x301

public val ABDAY_3: NlItem = 0x302

public val ABDAY_4: NlItem = 0x303

public val ABDAY_5: NlItem = 0x304

public val ABDAY_6: NlItem = 0x305

public val ABDAY_7: NlItem = 0x306

public val DAY_1: NlItem = 0x307

public val DAY_2: NlItem = 0x308

public val DAY_3: NlItem = 0x309

public val DAY_4: NlItem = 0x30A

public val DAY_5: NlItem = 0x30B

public val DAY_6: NlItem = 0x30C

public val DAY_7: NlItem = 0x30D

public val ABMON_1: NlItem = 0x30E

public val ABMON_2: NlItem = 0x30F

public val ABMON_3: NlItem = 0x310

public val ABMON_4: NlItem = 0x311

public val ABMON_5: NlItem = 0x312

public val ABMON_6: NlItem = 0x313

public val ABMON_7: NlItem = 0x314

public val ABMON_8: NlItem = 0x315

public val ABMON_9: NlItem = 0x316

public val ABMON_10: NlItem = 0x317

public val ABMON_11: NlItem = 0x318

public val ABMON_12: NlItem = 0x319

public val MON_1: NlItem = 0x31A

public val MON_2: NlItem = 0x31B

public val MON_3: NlItem = 0x31C

public val MON_4: NlItem = 0x31D

public val MON_5: NlItem = 0x31E

public val MON_6: NlItem = 0x31F

public val MON_7: NlItem = 0x320

public val MON_8: NlItem = 0x321

public val MON_9: NlItem = 0x322

public val MON_10: NlItem = 0x323

public val MON_11: NlItem = 0x324

public val MON_12: NlItem = 0x325

public val AM_STR: NlItem = 0x326

public val PM_STR: NlItem = 0x327

public val D_T_FMT: NlItem = 0x328

public val D_FMT: NlItem = 0x329

public val T_FMT: NlItem = 0x32A

public val T_FMT_AMPM: NlItem = 0x32B

public val ERA: NlItem = 0x32C

public val ERA_D_FMT: NlItem = 0x32E

public val ALT_DIGITS: NlItem = 0x32F

public val ERA_D_T_FMT: NlItem = 0x330

public val ERA_T_FMT: NlItem = 0x331

public val CODESET: NlItem = 10

public val CRNCYSTR: NlItem = 0x215

public val RADIXCHAR: NlItem = 0x100

public val THOUSEP: NlItem = 0x101

public val NOEXPR: NlItem = 0x501

public val YESSTR: NlItem = 0x502

public val NOSTR: NlItem = 0x503

// Different than Gnu.
public val FILENAME_MAX: CUint = 4095u

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val SOMAXCONN: CInt = 128

public val ST_RELATIME: CUlong = 4096uL

public val AF_NFC: CInt = PF_NFC

public val BUFSIZ: CInt = 4096

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

public val MAP_HUGE_64KB: CInt = 16 shl MAP_HUGE_SHIFT

public val MAP_HUGE_512KB: CInt = 19 shl MAP_HUGE_SHIFT

public val MAP_HUGE_1MB: CInt = 20 shl MAP_HUGE_SHIFT

public val MAP_HUGE_2MB: CInt = 21 shl MAP_HUGE_SHIFT

public val MAP_HUGE_8MB: CInt = 23 shl MAP_HUGE_SHIFT

public val MAP_HUGE_16MB: CInt = 24 shl MAP_HUGE_SHIFT

public val MAP_HUGE_32MB: CInt = 25 shl MAP_HUGE_SHIFT

public val MAP_HUGE_256MB: CInt = 28 shl MAP_HUGE_SHIFT

public val MAP_HUGE_512MB: CInt = 29 shl MAP_HUGE_SHIFT

public val MAP_HUGE_1GB: CInt = 30 shl MAP_HUGE_SHIFT

public val MAP_HUGE_2GB: CInt = 31 shl MAP_HUGE_SHIFT

public val MAP_HUGE_16GB: CInt = 34 shl MAP_HUGE_SHIFT

public val MINSIGSTKSZ: CInt = 2048

public val MSG_COPY: CInt = 16384

public val NI_MAXHOST: SocklenT = 1025u

public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY

public val PACKET_MR_UNICAST: CInt = 3

public val PF_NFC: CInt = 39

public val PF_VSOCK: CInt = 40

public val PTRACE_EVENT_STOP: CInt = 128

public val PTRACE_GETSIGMASK: CUint = 0x420au

public val PTRACE_PEEKSIGINFO: CInt = 0x4209

public val PTRACE_SETSIGMASK: CUint = 0x420bu

public val RTLD_NOLOAD: CInt = 0x00004

public val RUSAGE_THREAD: CInt = 1

public val SHM_EXEC: CInt = 32768

public val SIGPOLL: CInt = SIGIO

public val SOCK_DCCP: CInt = 6

public val SOCK_PACKET: CInt = 10

public val TCP_COOKIE_TRANSACTIONS: CInt = 15

public val UDP_GRO: CInt = 104

public val UDP_SEGMENT: CInt = 103

public val YESEXPR: CInt = ((5) shl 8) or (0)

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt

public expect fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, value: CInt?): CInt

public expect fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, value: CInt): CInt

public expect fun ptrace(request: CUint, vararg variadicArgs: Long): CLong

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt

public expect fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun sethostid(hostid: CLong): CInt

public expect fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt

public expect fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt

public expect fun getpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT): CInt

public expect fun setpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT, prio: CInt): CInt

public expect fun getauxval(type: CUlong): CUlong
