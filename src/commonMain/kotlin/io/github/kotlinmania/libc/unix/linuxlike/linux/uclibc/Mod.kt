// port-lint: source unix/linux_like/linux/uclibc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*

public const val B19200: SpeedT = 19200u
public const val B38400: SpeedT = 38400u
public const val EDEADLK: CInt = 35
public const val EOPNOTSUPP: CInt = 95
public const val O_DIRECTORY: CInt = 0x10000
public typealias ShmattT = CULong
public typealias MsgqnumT = CULong
public typealias MsglenT = CULong
public typealias RegoffT = CInt
public typealias RlimT = CULong
public typealias RlimitResourceT = CULong
public typealias PriorityWhichT = CUInt
public typealias Ioctl = CULong

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
    val fFsid2: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fSpare: IntArray,
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

public data class PtracePeeksiginfoArgs(
    val off: U64,
    val flags: U32,
    val nr: S32,
)

public data class PthreadMutexattrT(
    val size: UByteArray,
)

public data class PthreadCondattrT(
    val size: UByteArray,
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

public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val MCL_ONFAULT: CInt = 0x0004
public const val SIGEV_THREAD_ID: CInt = 4
public const val AF_VSOCK: CInt = 40
public const val BINDERFS_SUPER_MAGIC: CLong = 0x6c6f6f70
public const val XFS_SUPER_MAGIC: CLong = 0x58465342
public const val PTRACE_TRACEME: CInt = 0
public const val PTRACE_PEEKTEXT: CInt = 1
public const val PTRACE_PEEKDATA: CInt = 2
public const val PTRACE_PEEKUSER: CInt = 3
public const val PTRACE_POKETEXT: CInt = 4
public const val PTRACE_POKEDATA: CInt = 5
public const val PTRACE_POKEUSER: CInt = 6
public const val PTRACE_CONT: CInt = 7
public const val PTRACE_KILL: CInt = 8
public const val PTRACE_SINGLESTEP: CInt = 9
public const val PTRACE_GETREGS: CInt = 12
public const val PTRACE_SETREGS: CInt = 13
public const val PTRACE_GETFPREGS: CInt = 14
public const val PTRACE_SETFPREGS: CInt = 15
public const val PTRACE_ATTACH: CInt = 16
public const val PTRACE_DETACH: CInt = 17
public const val PTRACE_GETFPXREGS: CInt = 18
public const val PTRACE_SETFPXREGS: CInt = 19
public const val PTRACE_SYSCALL: CInt = 24
public const val PTRACE_SETOPTIONS: CInt = 0x4200
public const val PTRACE_GETEVENTMSG: CInt = 0x4201
public const val PTRACE_GETSIGINFO: CInt = 0x4202
public const val PTRACE_SETSIGINFO: CInt = 0x4203
public const val PTRACE_GETREGSET: CInt = 0x4204
public const val PTRACE_SETREGSET: CInt = 0x4205
public const val PTRACE_SEIZE: CInt = 0x4206
public const val PTRACE_INTERRUPT: CInt = 0x4207
public const val PTRACE_LISTEN: CInt = 0x4208
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
public const val ABDAY_1: NlItem = 0x300
public const val ABDAY_2: NlItem = 0x301
public const val ABDAY_3: NlItem = 0x302
public const val ABDAY_4: NlItem = 0x303
public const val ABDAY_5: NlItem = 0x304
public const val ABDAY_6: NlItem = 0x305
public const val ABDAY_7: NlItem = 0x306
public const val DAY_1: NlItem = 0x307
public const val DAY_2: NlItem = 0x308
public const val DAY_3: NlItem = 0x309
public const val DAY_4: NlItem = 0x30A
public const val DAY_5: NlItem = 0x30B
public const val DAY_6: NlItem = 0x30C
public const val DAY_7: NlItem = 0x30D
public const val ABMON_1: NlItem = 0x30E
public const val ABMON_2: NlItem = 0x30F
public const val ABMON_3: NlItem = 0x310
public const val ABMON_4: NlItem = 0x311
public const val ABMON_5: NlItem = 0x312
public const val ABMON_6: NlItem = 0x313
public const val ABMON_7: NlItem = 0x314
public const val ABMON_8: NlItem = 0x315
public const val ABMON_9: NlItem = 0x316
public const val ABMON_10: NlItem = 0x317
public const val ABMON_11: NlItem = 0x318
public const val ABMON_12: NlItem = 0x319
public const val MON_1: NlItem = 0x31A
public const val MON_2: NlItem = 0x31B
public const val MON_3: NlItem = 0x31C
public const val MON_4: NlItem = 0x31D
public const val MON_5: NlItem = 0x31E
public const val MON_6: NlItem = 0x31F
public const val MON_7: NlItem = 0x320
public const val MON_8: NlItem = 0x321
public const val MON_9: NlItem = 0x322
public const val MON_10: NlItem = 0x323
public const val MON_11: NlItem = 0x324
public const val MON_12: NlItem = 0x325
public const val AM_STR: NlItem = 0x326
public const val PM_STR: NlItem = 0x327
public const val D_T_FMT: NlItem = 0x328
public const val D_FMT: NlItem = 0x329
public const val T_FMT: NlItem = 0x32A
public const val T_FMT_AMPM: NlItem = 0x32B
public const val ERA: NlItem = 0x32C
public const val ERA_D_FMT: NlItem = 0x32E
public const val ALT_DIGITS: NlItem = 0x32F
public const val ERA_D_T_FMT: NlItem = 0x330
public const val ERA_T_FMT: NlItem = 0x331
public const val CODESET: NlItem = 10
public const val CRNCYSTR: NlItem = 0x215
public const val RADIXCHAR: NlItem = 0x100
public const val THOUSEP: NlItem = 0x101
public const val NOEXPR: NlItem = 0x501
public const val YESSTR: NlItem = 0x502
public const val NOSTR: NlItem = 0x503
public const val FILENAME_MAX: CUInt = 4095u
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
public const val SOMAXCONN: CInt = 128
public const val ST_RELATIME: CULong = 4096uL
public val AF_NFC: CInt = PF_NFC
public const val BUFSIZ: CInt = 4096
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
public const val MINSIGSTKSZ: CInt = 2048
public const val MSG_COPY: CInt = 16384
public const val NI_MAXHOST: SocklenT = 1025u
public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY
public const val PACKET_MR_UNICAST: CInt = 3
public const val PF_NFC: CInt = 39
public const val PF_VSOCK: CInt = 40
public const val PTRACE_EVENT_STOP: CInt = 128
public const val PTRACE_GETSIGMASK: CUInt = 0x420au
public const val PTRACE_PEEKSIGINFO: CInt = 0x4209
public const val PTRACE_SETSIGMASK: CUInt = 0x420bu
public const val RTLD_NOLOAD: CInt = 0x00004
public const val RUSAGE_THREAD: CInt = 1
public const val SHM_EXEC: CInt = 32768
public const val SIGPOLL: CInt = 29
public const val SOCK_DCCP: CInt = 6
public const val SOCK_PACKET: CInt = 10
public const val TCP_COOKIE_TRANSACTIONS: CInt = 15
public const val UDP_GRO: CInt = 104
public const val UDP_SEGMENT: CInt = 103
public val YESEXPR: CInt = ((5) shl 8) or (0)

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt

public expect fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, `val`: CInt?): CInt

public expect fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, `val`: CInt): CInt

public expect fun ptrace(request: CUInt, vararg args: Any?): CLong

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt

public expect fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun sethostid(hostid: CLong): CInt

public expect fun fanotifyMark(fd: CInt, flags: CUInt, mask: ULong, dirfd: CInt, path: String?): CInt

public expect fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt

public expect fun getpriority(which: PriorityWhichT, who: IdT): CInt

public expect fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt

public expect fun getauxval(type: CULong): CULong
