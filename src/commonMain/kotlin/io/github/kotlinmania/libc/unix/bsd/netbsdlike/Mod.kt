// port-lint: source unix/bsd/netbsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias WcharT = Int
public typealias TimeT = Long
public typealias ModeT = UInt
public typealias NlinkT = UInt
public typealias InoT = ULong
public typealias PthreadKeyT = CInt
public typealias RlimT = ULong
public typealias SpeedT = CUInt
public typealias TcflagT = CUInt
public typealias NlItem = CLong
public typealias ClockidT = CInt
public typealias IdT = UInt
public typealias SemT = Sem?
public typealias KeyT = CLong

public data class SchedParam(
    val schedPriority: CInt,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: CUInt,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cCc: List<CcT>,
    val cIspeed: CInt,
    val cOspeed: CInt,
)

public data class Flock(
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
    val lType: CShort,
    val lWhence: CShort,
)

public data class PtraceIoDesc(
    val piodOp: CInt,
    val piodOffs: COpaquePointer?,
    val piodAddr: COpaquePointer?,
    val piodLen: ULong,
)

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: CUInt,
)

public const val D_T_FMT: NlItem = 0
public const val D_FMT: NlItem = 1
public const val T_FMT: NlItem = 2
public const val T_FMT_AMPM: NlItem = 3
public const val AM_STR: NlItem = 4
public const val PM_STR: NlItem = 5
public const val DAY_1: NlItem = 6
public const val DAY_2: NlItem = 7
public const val DAY_3: NlItem = 8
public const val DAY_4: NlItem = 9
public const val DAY_5: NlItem = 10
public const val DAY_6: NlItem = 11
public const val DAY_7: NlItem = 12
public const val ABDAY_1: NlItem = 13
public const val ABDAY_2: NlItem = 14
public const val ABDAY_3: NlItem = 15
public const val ABDAY_4: NlItem = 16
public const val ABDAY_5: NlItem = 17
public const val ABDAY_6: NlItem = 18
public const val ABDAY_7: NlItem = 19
public const val MON_1: NlItem = 20
public const val MON_2: NlItem = 21
public const val MON_3: NlItem = 22
public const val MON_4: NlItem = 23
public const val MON_5: NlItem = 24
public const val MON_6: NlItem = 25
public const val MON_7: NlItem = 26
public const val MON_8: NlItem = 27
public const val MON_9: NlItem = 28
public const val MON_10: NlItem = 29
public const val MON_11: NlItem = 30
public const val MON_12: NlItem = 31
public const val ABMON_1: NlItem = 32
public const val ABMON_2: NlItem = 33
public const val ABMON_3: NlItem = 34
public const val ABMON_4: NlItem = 35
public const val ABMON_5: NlItem = 36
public const val ABMON_6: NlItem = 37
public const val ABMON_7: NlItem = 38
public const val ABMON_8: NlItem = 39
public const val ABMON_9: NlItem = 40
public const val ABMON_10: NlItem = 41
public const val ABMON_11: NlItem = 42
public const val ABMON_12: NlItem = 43
public const val RADIXCHAR: NlItem = 44
public const val THOUSEP: NlItem = 45
public const val YESSTR: NlItem = 46
public const val YESEXPR: NlItem = 47
public const val NOSTR: NlItem = 48
public const val NOEXPR: NlItem = 49
public const val CRNCYSTR: NlItem = 50
public const val CODESET: NlItem = 51
public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val RAND_MAX: CInt = 2147483647
public const val EOF: CInt = -1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val _IOFBF: CInt = 0
public const val _IONBF: CInt = 2
public const val _IOLBF: CInt = 1
public const val BUFSIZ: CUInt = 1024u
public const val FOPEN_MAX: CUInt = 20u
public const val FILENAME_MAX: CUInt = 1024u
public const val L_tmpnam: CUInt = 1024u
public const val O_NOCTTY: CInt = 32768
public const val S_IFIFO: ModeT = 4096
public const val S_IFCHR: ModeT = 8192
public const val S_IFBLK: ModeT = 24576
public const val S_IFDIR: ModeT = 16384
public const val S_IFREG: ModeT = 32768
public const val S_IFLNK: ModeT = 40960
public const val S_IFSOCK: ModeT = 49152
public const val S_IFMT: ModeT = 61440
public const val S_IEXEC: ModeT = 64
public const val S_IWRITE: ModeT = 128
public const val S_IREAD: ModeT = 256
public const val S_IRWXU: ModeT = 448
public const val S_IXUSR: ModeT = 64
public const val S_IWUSR: ModeT = 128
public const val S_IRUSR: ModeT = 256
public const val S_IRWXG: ModeT = 56
public const val S_IXGRP: ModeT = 8
public const val S_IWGRP: ModeT = 16
public const val S_IRGRP: ModeT = 32
public const val S_IRWXO: ModeT = 7
public const val S_IXOTH: ModeT = 1
public const val S_IWOTH: ModeT = 2
public const val S_IROTH: ModeT = 4
public const val F_OK: CInt = 0
public const val R_OK: CInt = 4
public const val W_OK: CInt = 2
public const val X_OK: CInt = 1
public const val F_LOCK: CInt = 1
public const val F_TEST: CInt = 3
public const val F_TLOCK: CInt = 2
public const val F_ULOCK: CInt = 0
public const val F_GETLK: CInt = 7
public const val F_SETLK: CInt = 8
public const val F_SETLKW: CInt = 9
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGABRT: CInt = 6
public const val SIGEMT: CInt = 7
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGSEGV: CInt = 11
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val PROT_NONE: CInt = 0
public const val PROT_READ: CInt = 1
public const val PROT_WRITE: CInt = 2
public const val PROT_EXEC: CInt = 4
public const val MAP_FILE: CInt = 0x0000
public const val MAP_SHARED: CInt = 0x0001
public const val MAP_PRIVATE: CInt = 0x0002
public const val MAP_FIXED: CInt = 0x0010
public const val MAP_ANON: CInt = 0x1000
public const val MAP_ANONYMOUS: CInt = MAP_ANON
public const val IPC_CREAT: CInt = 512
public const val IPC_EXCL: CInt = 1024
public const val IPC_NOWAIT: CInt = 2048
public const val IPC_PRIVATE: KeyT = 0
public const val IPC_RMID: CInt = 0
public const val IPC_SET: CInt = 1
public const val IPC_STAT: CInt = 2
public const val IPC_R: CInt = 256
public const val IPC_W: CInt = 128
public const val IPC_M: CInt = 4096
public const val SHM_R: CInt = IPC_R
public const val SHM_W: CInt = IPC_W
public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val MS_ASYNC: CInt = 0x0001
public const val EPERM: CInt = 1
public const val ENOENT: CInt = 2
public const val ESRCH: CInt = 3
public const val EINTR: CInt = 4
public const val EIO: CInt = 5
public const val ENXIO: CInt = 6
public const val E2BIG: CInt = 7
public const val ENOEXEC: CInt = 8
public const val EBADF: CInt = 9
public const val ECHILD: CInt = 10
public const val EDEADLK: CInt = 11
public const val ENOMEM: CInt = 12
public const val EACCES: CInt = 13
public const val EFAULT: CInt = 14
public const val ENOTBLK: CInt = 15
public const val EBUSY: CInt = 16
public const val EEXIST: CInt = 17
public const val EXDEV: CInt = 18
public const val ENODEV: CInt = 19
public const val ENOTDIR: CInt = 20
public const val EISDIR: CInt = 21
public const val EINVAL: CInt = 22
public const val ENFILE: CInt = 23
public const val EMFILE: CInt = 24
public const val ENOTTY: CInt = 25
public const val ETXTBSY: CInt = 26
public const val EFBIG: CInt = 27
public const val ENOSPC: CInt = 28
public const val ESPIPE: CInt = 29
public const val EROFS: CInt = 30
public const val EMLINK: CInt = 31
public const val EPIPE: CInt = 32
public const val EDOM: CInt = 33
public const val ERANGE: CInt = 34
public const val EAGAIN: CInt = 35
public const val EWOULDBLOCK: CInt = 35
public const val EINPROGRESS: CInt = 36
public const val EALREADY: CInt = 37
public const val ENOTSOCK: CInt = 38
public const val EDESTADDRREQ: CInt = 39
public const val EMSGSIZE: CInt = 40
public const val EPROTOTYPE: CInt = 41
public const val ENOPROTOOPT: CInt = 42
public const val EPROTONOSUPPORT: CInt = 43
public const val ESOCKTNOSUPPORT: CInt = 44
public const val EOPNOTSUPP: CInt = 45
public const val EPFNOSUPPORT: CInt = 46
public const val EAFNOSUPPORT: CInt = 47
public const val EADDRINUSE: CInt = 48
public const val EADDRNOTAVAIL: CInt = 49
public const val ENETDOWN: CInt = 50
public const val ENETUNREACH: CInt = 51
public const val ENETRESET: CInt = 52
public const val ECONNABORTED: CInt = 53
public const val ECONNRESET: CInt = 54
public const val ENOBUFS: CInt = 55
public const val EISCONN: CInt = 56
public const val ENOTCONN: CInt = 57
public const val ESHUTDOWN: CInt = 58
public const val ETOOMANYREFS: CInt = 59
public const val ETIMEDOUT: CInt = 60
public const val ECONNREFUSED: CInt = 61
public const val ELOOP: CInt = 62
public const val ENAMETOOLONG: CInt = 63
public const val EHOSTDOWN: CInt = 64
public const val EHOSTUNREACH: CInt = 65
public const val ENOTEMPTY: CInt = 66
public const val EPROCLIM: CInt = 67
public const val EUSERS: CInt = 68
public const val EDQUOT: CInt = 69
public const val ESTALE: CInt = 70
public const val EREMOTE: CInt = 71
public const val EBADRPC: CInt = 72
public const val ERPCMISMATCH: CInt = 73
public const val EPROGUNAVAIL: CInt = 74
public const val EPROGMISMATCH: CInt = 75
public const val EPROCUNAVAIL: CInt = 76
public const val ENOLCK: CInt = 77
public const val ENOSYS: CInt = 78
public const val EFTYPE: CInt = 79
public const val EAUTH: CInt = 80
public const val ENEEDAUTH: CInt = 81
public const val F_DUPFD: CInt = 0
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val SIGTRAP: CInt = 5
public const val GLOB_APPEND: CInt = 0x0001
public const val GLOB_DOOFFS: CInt = 0x0002
public const val GLOB_ERR: CInt = 0x0004
public const val GLOB_MARK: CInt = 0x0008
public const val GLOB_NOCHECK: CInt = 0x0010
public const val GLOB_NOSORT: CInt = 0x0020
public const val GLOB_NOESCAPE: CInt = 0x1000
public const val GLOB_NOSPACE: CInt = -1
public const val GLOB_ABORTED: CInt = -2
public const val GLOB_NOMATCH: CInt = -3
public const val GLOB_NOSYS: CInt = -4
public const val POSIX_MADV_NORMAL: CInt = 0
public const val POSIX_MADV_RANDOM: CInt = 1
public const val POSIX_MADV_SEQUENTIAL: CInt = 2
public const val POSIX_MADV_WILLNEED: CInt = 3
public const val POSIX_MADV_DONTNEED: CInt = 4
public const val POSIX_SPAWN_RESETIDS: CInt = 0x01
public const val POSIX_SPAWN_SETPGROUP: CInt = 0x02
public const val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x04
public const val POSIX_SPAWN_SETSCHEDULER: CInt = 0x08
public const val POSIX_SPAWN_SETSIGDEF: CInt = 0x10
public const val POSIX_SPAWN_SETSIGMASK: CInt = 0x20
public const val PTHREAD_CREATE_JOINABLE: CInt = 0
public const val PTHREAD_CREATE_DETACHED: CInt = 1
public const val PIOD_READ_D: CInt = 1
public const val PIOD_WRITE_D: CInt = 2
public const val PIOD_READ_I: CInt = 3
public const val PIOD_WRITE_I: CInt = 4
public const val PIOD_READ_AUXV: CInt = 5
public const val PT_TRACE_ME: CInt = 0
public const val PT_READ_I: CInt = 1
public const val PT_READ_D: CInt = 2
public const val PT_WRITE_I: CInt = 4
public const val PT_WRITE_D: CInt = 5
public const val PT_CONTINUE: CInt = 7
public const val PT_KILL: CInt = 8
public const val PT_ATTACH: CInt = 9
public const val PT_DETACH: CInt = 10
public const val PT_IO: CInt = 11
public const val CLOCK_REALTIME: ClockidT = 0
public const val CLOCK_MONOTONIC: ClockidT = 3
public const val RLIMIT_CPU: CInt = 0
public const val RLIMIT_FSIZE: CInt = 1
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_STACK: CInt = 3
public const val RLIMIT_CORE: CInt = 4
public const val RLIMIT_RSS: CInt = 5
public const val RLIMIT_MEMLOCK: CInt = 6
public const val RLIMIT_NPROC: CInt = 7
public const val RLIMIT_NOFILE: CInt = 8
public const val RLIM_INFINITY: RlimT = 0x7fff_ffff_ffff_ffff
public const val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY
public const val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY
public const val RUSAGE_SELF: CInt = 0
public const val RUSAGE_CHILDREN: CInt = -1
public const val MADV_NORMAL: CInt = 0
public const val MADV_RANDOM: CInt = 1
public const val MADV_SEQUENTIAL: CInt = 2
public const val MADV_WILLNEED: CInt = 3
public const val MADV_DONTNEED: CInt = 4
public const val MADV_FREE: CInt = 6
public const val MNT_NODEV: CInt = 0x00000010
public const val MNT_LOCAL: CInt = 0x00001000
public const val MNT_QUOTA: CInt = 0x00002000
public const val IOCPARM_MASK: UInt = 0x1fffu
public const val IOC_VOID: CULong = 0x20000000uL
public const val IOC_OUT: CULong = 0x40000000uL
public const val IOC_IN: CULong = 0x80000000uL
public val IOC_INOUT: CULong = IOC_IN or IOC_OUT
public const val IOC_DIRMASK: CULong = 0xe0000000uL
public const val AF_UNSPEC: CInt = 0
public const val AF_LOCAL: CInt = 1
public const val AF_UNIX: CInt = AF_LOCAL
public const val AF_INET: CInt = 2
public const val AF_IMPLINK: CInt = 3
public const val AF_PUP: CInt = 4
public const val AF_CHAOS: CInt = 5
public const val AF_NS: CInt = 6
public const val AF_ISO: CInt = 7
public const val AF_OSI: CInt = AF_ISO
public const val AF_DATAKIT: CInt = 9
public const val AF_CCITT: CInt = 10
public const val AF_SNA: CInt = 11
public const val AF_DECnet: CInt = 12
public const val AF_DLI: CInt = 13
public const val AF_LAT: CInt = 14
public const val AF_HYLINK: CInt = 15
public const val AF_APPLETALK: CInt = 16
public const val AF_LINK: CInt = 18
public const val pseudo_AF_XTP: CInt = 19
public const val AF_COIP: CInt = 20
public const val AF_CNT: CInt = 21
public const val pseudo_AF_RTIP: CInt = 22
public const val AF_IPX: CInt = 23
public const val AF_INET6: CInt = 24
public const val pseudo_AF_PIP: CInt = 25
public const val AF_ISDN: CInt = 26
public const val AF_E164: CInt = AF_ISDN
public const val AF_NATM: CInt = 27
public const val PF_UNSPEC: CInt = AF_UNSPEC
public const val PF_LOCAL: CInt = AF_LOCAL
public const val PF_UNIX: CInt = PF_LOCAL
public const val PF_INET: CInt = AF_INET
public const val PF_IMPLINK: CInt = AF_IMPLINK
public const val PF_PUP: CInt = AF_PUP
public const val PF_CHAOS: CInt = AF_CHAOS
public const val PF_NS: CInt = AF_NS
public const val PF_ISO: CInt = AF_ISO
public const val PF_OSI: CInt = AF_ISO
public const val PF_DATAKIT: CInt = AF_DATAKIT
public const val PF_CCITT: CInt = AF_CCITT
public const val PF_SNA: CInt = AF_SNA
public const val PF_DECnet: CInt = AF_DECnet
public const val PF_DLI: CInt = AF_DLI
public const val PF_LAT: CInt = AF_LAT
public const val PF_HYLINK: CInt = AF_HYLINK
public const val PF_APPLETALK: CInt = AF_APPLETALK
public const val PF_LINK: CInt = AF_LINK
public const val PF_XTP: CInt = pseudo_AF_XTP
public const val PF_COIP: CInt = AF_COIP
public const val PF_CNT: CInt = AF_CNT
public const val PF_IPX: CInt = AF_IPX
public const val PF_INET6: CInt = AF_INET6
public const val PF_RTIP: CInt = pseudo_AF_RTIP
public const val PF_PIP: CInt = pseudo_AF_PIP
public const val PF_ISDN: CInt = AF_ISDN
public const val PF_NATM: CInt = AF_NATM
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_RAW: CInt = 3
public const val SOCK_RDM: CInt = 4
public const val SOCK_SEQPACKET: CInt = 5
public const val IP_TTL: CInt = 4
public const val IP_HDRINCL: CInt = 2
public const val IP_ADD_MEMBERSHIP: CInt = 12
public const val IP_DROP_MEMBERSHIP: CInt = 13
public const val IPV6_RECVPKTINFO: CInt = 36
public const val IPV6_PKTINFO: CInt = 46
public const val IPV6_RECVTCLASS: CInt = 57
public const val IPV6_TCLASS: CInt = 61
public const val SOL_SOCKET: CInt = 0xffff
public const val SO_DEBUG: CInt = 0x01
public const val SO_ACCEPTCONN: CInt = 0x0002
public const val SO_REUSEADDR: CInt = 0x0004
public const val SO_KEEPALIVE: CInt = 0x0008
public const val SO_DONTROUTE: CInt = 0x0010
public const val SO_BROADCAST: CInt = 0x0020
public const val SO_USELOOPBACK: CInt = 0x0040
public const val SO_LINGER: CInt = 0x0080
public const val SO_OOBINLINE: CInt = 0x0100
public const val SO_REUSEPORT: CInt = 0x0200
public const val SO_SNDBUF: CInt = 0x1001
public const val SO_RCVBUF: CInt = 0x1002
public const val SO_SNDLOWAT: CInt = 0x1003
public const val SO_RCVLOWAT: CInt = 0x1004
public const val SO_ERROR: CInt = 0x1007
public const val SO_TYPE: CInt = 0x1008
public const val SOMAXCONN: CInt = 128
public const val MSG_OOB: CInt = 0x1
public const val MSG_PEEK: CInt = 0x2
public const val MSG_DONTROUTE: CInt = 0x4
public const val MSG_EOR: CInt = 0x8
public const val MSG_TRUNC: CInt = 0x10
public const val MSG_CTRUNC: CInt = 0x20
public const val MSG_WAITALL: CInt = 0x40
public const val MSG_DONTWAIT: CInt = 0x80
public const val MSG_BCAST: CInt = 0x100
public const val MSG_MCAST: CInt = 0x200
public const val MSG_NOSIGNAL: CInt = 0x400
public const val MSG_CMSG_CLOEXEC: CInt = 0x800
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val LOCK_SH: CInt = 1
public const val LOCK_EX: CInt = 2
public const val LOCK_NB: CInt = 4
public const val LOCK_UN: CInt = 8
public const val IPPROTO_RAW: CInt = 255
public const val _SC_ARG_MAX: CInt = 1
public const val _SC_CHILD_MAX: CInt = 2
public const val _SC_NGROUPS_MAX: CInt = 4
public const val _SC_OPEN_MAX: CInt = 5
public const val _SC_JOB_CONTROL: CInt = 6
public const val _SC_SAVED_IDS: CInt = 7
public const val _SC_VERSION: CInt = 8
public const val _SC_BC_BASE_MAX: CInt = 9
public const val _SC_BC_DIM_MAX: CInt = 10
public const val _SC_BC_SCALE_MAX: CInt = 11
public const val _SC_BC_STRING_MAX: CInt = 12
public const val _SC_COLL_WEIGHTS_MAX: CInt = 13
public const val _SC_EXPR_NEST_MAX: CInt = 14
public const val _SC_LINE_MAX: CInt = 15
public const val _SC_RE_DUP_MAX: CInt = 16
public const val _SC_2_VERSION: CInt = 17
public const val _SC_2_C_BIND: CInt = 18
public const val _SC_2_C_DEV: CInt = 19
public const val _SC_2_CHAR_TERM: CInt = 20
public const val _SC_2_FORT_DEV: CInt = 21
public const val _SC_2_FORT_RUN: CInt = 22
public const val _SC_2_LOCALEDEF: CInt = 23
public const val _SC_2_SW_DEV: CInt = 24
public const val _SC_2_UPE: CInt = 25
public const val _SC_STREAM_MAX: CInt = 26
public const val _SC_TZNAME_MAX: CInt = 27
public const val _SC_PAGESIZE: CInt = 28
public const val _SC_PAGE_SIZE: CInt = _SC_PAGESIZE
public const val _SC_FSYNC: CInt = 29
public const val _SC_XOPEN_SHM: CInt = 30
public const val Q_GETQUOTA: CInt = 0x300
public const val Q_SETQUOTA: CInt = 0x400
public const val RTLD_GLOBAL: CInt = 0x100
public const val LOG_NFACILITIES: CInt = 24
public const val HW_NCPU: CInt = 3
public const val B0: SpeedT = 0
public const val B50: SpeedT = 50
public const val B75: SpeedT = 75
public const val B110: SpeedT = 110
public const val B134: SpeedT = 134
public const val B150: SpeedT = 150
public const val B200: SpeedT = 200
public const val B300: SpeedT = 300
public const val B600: SpeedT = 600
public const val B1200: SpeedT = 1200
public const val B1800: SpeedT = 1800
public const val B2400: SpeedT = 2400
public const val B4800: SpeedT = 4800
public const val B9600: SpeedT = 9600
public const val B19200: SpeedT = 19200
public const val B38400: SpeedT = 38400
public const val B7200: SpeedT = 7200
public const val B14400: SpeedT = 14400
public const val B28800: SpeedT = 28800
public const val B57600: SpeedT = 57600
public const val B76800: SpeedT = 76800
public const val B115200: SpeedT = 115200
public const val B230400: SpeedT = 230400
public const val EXTA: SpeedT = 19200
public const val EXTB: SpeedT = 38400
public const val CRTSCTS: TcflagT = 0x00010000
public const val CRTS_IFLOW: TcflagT = CRTSCTS
public const val CCTS_OFLOW: TcflagT = CRTSCTS
public const val OCRNL: TcflagT = 0x10
public const val TIOCEXCL: CULong = 0x2000740duL
public const val TIOCNXCL: CULong = 0x2000740euL
public const val TIOCFLUSH: CULong = 0x80047410uL
public const val TIOCGETA: CULong = 0x402c7413uL
public const val TIOCSETA: CULong = 0x802c7414uL
public const val TIOCSETAW: CULong = 0x802c7415uL
public const val TIOCSETAF: CULong = 0x802c7416uL
public const val TIOCGETD: CULong = 0x4004741auL
public const val TIOCSETD: CULong = 0x8004741buL
public const val TIOCMGET: CULong = 0x4004746auL
public const val TIOCMBIC: CULong = 0x8004746buL
public const val TIOCMBIS: CULong = 0x8004746cuL
public const val TIOCMSET: CULong = 0x8004746duL
public const val TIOCSTART: CULong = 0x2000746euL
public const val TIOCSTOP: CULong = 0x2000746fuL
public const val TIOCSCTTY: CULong = 0x20007461uL
public const val TIOCGWINSZ: CULong = 0x40087468uL
public const val TIOCSWINSZ: CULong = 0x80087467uL
public const val TIOCM_LE: CInt = 1
public const val TIOCM_DTR: CInt = 2
public const val TIOCM_RTS: CInt = 4
public const val TIOCM_ST: CInt = 8
public const val TIOCM_SR: CInt = 16
public const val TIOCM_CTS: CInt = 32
public const val TIOCM_CAR: CInt = 64
public const val TIOCM_RNG: CInt = 128
public const val TIOCM_DSR: CInt = 256
public const val TIOCM_CD: CInt = TIOCM_CAR
public const val TIOCM_RI: CInt = TIOCM_RNG
public const val TIMER_ABSTIME: CInt = 1
public const val RB_AUTOBOOT: CInt = 0
public const val TCP_INFO: CInt = 9

public expect fun setgrent()
public expect fun semDestroy(sem: SemT?): CInt
public expect fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt
public expect fun daemon(nochdir: CInt, noclose: CInt): CInt
public expect fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt
public expect fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): CInt
public expect fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt
public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt
public expect fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt
public expect fun errno(): CInt?
public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt
public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?
public expect fun mkostemp(template: String?, flags: CInt): CInt
public expect fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt
public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT
public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT
public expect fun futimens(fd: CInt, times: Timespec?): CInt
public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt
public expect fun fdatasync(fd: CInt): CInt
public expect fun loginTty(fd: CInt): CInt
public expect fun getpriority(which: CInt, who: IdT): CInt
public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt
public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt
public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt
public expect fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt
public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt
public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt
public expect fun sethostname(name: String?, len: ULong): CInt
public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt
public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt
public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt
public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt
public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt
public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt
public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt
public expect fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt
public expect fun pipe2(fds: CInt?, flags: CInt): CInt
public expect fun ppoll(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: SigsetT?): CInt
public expect fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt
public expect fun initgroups(name: String?, basegid: GidT): CInt
public expect fun getdomainname(name: String?, len: ULong): CInt
public expect fun setdomainname(name: String?, len: ULong): CInt
public expect fun uname(buf: Utsname?): CInt
public expect fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt
public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?
public expect fun shmdt(shmaddr: COpaquePointer?): CInt
public expect fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt
public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt
public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt
public expect fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt
public expect fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt
public expect fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt
public expect fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt
public expect fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt
public expect fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt
public expect fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt
public expect fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt
public expect fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt
public expect fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt
public expect fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt
public expect fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt
public expect fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt
public expect fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt
public expect fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer?
public expect fun gethostid(): CLong
public expect fun sethostid(hostid: CLong): CInt
public expect fun ftok(path: String?, id: CInt): KeyT
public expect fun dirname(path: String?): String?
public expect fun basename(path: String?): String?
public expect fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt
public expect fun sendmmsg(sockfd: CInt, mmsg: Mmsghdr?, vlen: CUInt, flags: CInt): CInt
public expect fun recvmmsg(sockfd: CInt, mmsg: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt
public expect fun closefrom(lowfd: CInt): CInt
