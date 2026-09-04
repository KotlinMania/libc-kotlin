// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public typealias WcharT = Int
public typealias BlkcntT = CULong
public typealias BlksizeT = CLong
public typealias ClockT = CLong
public typealias ClockidT = CInt
public typealias DevT = CULongLong
public typealias FsblkcntT = CULong
public typealias FsfilcntT = CULong
public typealias InoT = CULongLong
public typealias ModeT = CInt
public typealias NfdsT = CULong
public typealias NlinkT = CULong
public typealias OffT = CLongLong
public typealias PthreadT = COpaquePointer?
public typealias PthreadKeyT = ULong
public typealias RlimT = CULongLong
public typealias SaFamilyT = UShort
public typealias SemT = COpaquePointer?
public typealias SigsetT = CULongLong
public typealias SocklenT = UInt
public typealias SpeedT = UInt
public typealias SusecondsT = CInt
public typealias TcflagT = UInt
public typealias TimeT = CLongLong
public typealias IdT = CUInt
public typealias UidT = CInt
public typealias GidT = CInt

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
    val domainname: ByteArray,
)

public data class Dirent(
    val dIno: InoT,
    val dOff: OffT,
    val dReclen: CUShort,
    val dType: CUChar,
    val dName: ByteArray,
)

public data class SockaddrUn(
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class SockaddrStorage(
    val ssFamily: SaFamilyT,
    val ssAlign: CULong,
)

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: ULong,
    val aiCanonname: String?,
    val aiAddr: Sockaddr?,
    val aiNext: Addrinfo?,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class EpollEvent(
    val events: UInt,
    val u64: ULong,
    val pad: ULong,
)

public data class FdSet(
    val fdsBits: ULongArray,
)

public data class InAddr(
    val sAddr: InAddrT,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class Lconv(
    val currencySymbol: String?,
    val decimalPoint: String?,
    val fracDigits: CChar,
    val grouping: String?,
    val intCurrSymbol: String?,
    val intFracDigits: CChar,
    val monDecimalPoint: String?,
    val monGrouping: String?,
    val monThousandsSep: String?,
    val negativeSign: String?,
    val nCsPrecedes: CChar,
    val nSepBySpace: CChar,
    val nSignPosn: CChar,
    val positiveSign: String?,
    val pCsPrecedes: CChar,
    val pSepBySpace: CChar,
    val pSignPosn: CChar,
    val thousandsSep: String?,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: CInt,
)

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
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

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saFlags: CULong,
    val saRestorer: (() -> Unit)?,
    val saMask: SigsetT,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val align: List<ULong>,
    val siAddr: COpaquePointer? = null,
    val siValue: Sigval? = null,
    val siPid: PidT? = null,
    val siUid: UidT? = null,
    val siStatus: CInt? = null,
    val siUtime: CLong? = null,
    val siStime: CLong? = null,
)

public data class Sockaddr(
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class SockaddrIn(
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class SockaddrIn6(
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stNlink: NlinkT,
    val stMode: ModeT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
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
    val fFlag: CULong,
    val fNamemax: CULong,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CcT,
    val cCc: List<CcT>,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class Tm(
    val tmSec: CInt,
    val tmMin: CInt,
    val tmHour: CInt,
    val tmMday: CInt,
    val tmMon: CInt,
    val tmYear: CInt,
    val tmWday: CInt,
    val tmYday: CInt,
    val tmIsdst: CInt,
    val tmGmtoff: CLong,
    val tmZone: String?,
)

public data class Ucred(
    val pid: PidT,
    val uid: UidT,
    val gid: GidT,
)

public data class PthreadAttrT(
    val bytes: UByteArray,
)

public data class PthreadBarrierT(
    val bytes: UByteArray,
)

public data class PthreadBarrierattrT(
    val bytes: UByteArray,
)

public data class PthreadMutexT(
    val bytes: UByteArray,
)

public data class PthreadRwlockT(
    val bytes: UByteArray,
)

public data class PthreadMutexattrT(
    val bytes: UByteArray,
)

public data class PthreadRwlockattrT(
    val bytes: UByteArray,
)

public data class PthreadCondT(
    val bytes: UByteArray,
)

public data class PthreadCondattrT(
    val bytes: UByteArray,
)

public data class PthreadOnceT(
    val bytes: UByteArray,
)

public data class PthreadSpinlockT(
    val bytes: UByteArray,
)

public const val UTSLENGTH: ULong = 65uL
public const val PATH_MAX: CInt = 4096
public const val F_GETLK: CInt = 5
public const val F_SETLK: CInt = 6
public const val F_SETLKW: CInt = 7
public const val F_ULOCK: CInt = 0
public const val F_LOCK: CInt = 1
public const val F_TLOCK: CInt = 2
public const val F_TEST: CInt = 3
public const val AT_FDCWD: CInt = -100
public const val RTLD_LAZY: CInt = 0x0001
public const val RTLD_NOW: CInt = 0x0002
public const val RTLD_GLOBAL: CInt = 0x0100
public const val RTLD_LOCAL: CInt = 0x0000
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
public const val EAGAIN: CInt = 11
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
public const val EDEADLK: CInt = 35
public const val ENAMETOOLONG: CInt = 36
public const val ENOLCK: CInt = 37
public const val ENOSYS: CInt = 38
public const val ENOTEMPTY: CInt = 39
public const val ELOOP: CInt = 40
public const val EWOULDBLOCK: CInt = 41
public const val ENOMSG: CInt = 42
public const val EIDRM: CInt = 43
public const val ECHRNG: CInt = 44
public const val EL2NSYNC: CInt = 45
public const val EL3HLT: CInt = 46
public const val EL3RST: CInt = 47
public const val ELNRNG: CInt = 48
public const val EUNATCH: CInt = 49
public const val ENOCSI: CInt = 50
public const val EL2HLT: CInt = 51
public const val EBADE: CInt = 52
public const val EBADR: CInt = 53
public const val EXFULL: CInt = 54
public const val ENOANO: CInt = 55
public const val EBADRQC: CInt = 56
public const val EBADSLT: CInt = 57
public const val EDEADLOCK: CInt = 58
public const val EBFONT: CInt = 59
public const val ENOSTR: CInt = 60
public const val ENODATA: CInt = 61
public const val ETIME: CInt = 62
public const val ENOSR: CInt = 63
public const val ENONET: CInt = 64
public const val ENOPKG: CInt = 65
public const val EREMOTE: CInt = 66
public const val ENOLINK: CInt = 67
public const val EADV: CInt = 68
public const val ESRMNT: CInt = 69
public const val ECOMM: CInt = 70
public const val EPROTO: CInt = 71
public const val EMULTIHOP: CInt = 72
public const val EDOTDOT: CInt = 73
public const val EBADMSG: CInt = 74
public const val EOVERFLOW: CInt = 75
public const val ENOTUNIQ: CInt = 76
public const val EBADFD: CInt = 77
public const val EREMCHG: CInt = 78
public const val ELIBACC: CInt = 79
public const val ELIBBAD: CInt = 80
public const val ELIBSCN: CInt = 81
public const val ELIBMAX: CInt = 82
public const val ELIBEXEC: CInt = 83
public const val EILSEQ: CInt = 84
public const val ERESTART: CInt = 85
public const val ESTRPIPE: CInt = 86
public const val EUSERS: CInt = 87
public const val ENOTSOCK: CInt = 88
public const val EDESTADDRREQ: CInt = 89
public const val EMSGSIZE: CInt = 90
public const val EPROTOTYPE: CInt = 91
public const val ENOPROTOOPT: CInt = 92
public const val EPROTONOSUPPORT: CInt = 93
public const val ESOCKTNOSUPPORT: CInt = 94
public const val EOPNOTSUPP: CInt = 95
public const val ENOTSUP: CInt = EOPNOTSUPP
public const val EPFNOSUPPORT: CInt = 96
public const val EAFNOSUPPORT: CInt = 97
public const val EADDRINUSE: CInt = 98
public const val EADDRNOTAVAIL: CInt = 99
public const val ENETDOWN: CInt = 100
public const val ENETUNREACH: CInt = 101
public const val ENETRESET: CInt = 102
public const val ECONNABORTED: CInt = 103
public const val ECONNRESET: CInt = 104
public const val ENOBUFS: CInt = 105
public const val EISCONN: CInt = 106
public const val ENOTCONN: CInt = 107
public const val ESHUTDOWN: CInt = 108
public const val ETOOMANYREFS: CInt = 109
public const val ETIMEDOUT: CInt = 110
public const val ECONNREFUSED: CInt = 111
public const val EHOSTDOWN: CInt = 112
public const val EHOSTUNREACH: CInt = 113
public const val EALREADY: CInt = 114
public const val EINPROGRESS: CInt = 115
public const val ESTALE: CInt = 116
public const val EUCLEAN: CInt = 117
public const val ENOTNAM: CInt = 118
public const val ENAVAIL: CInt = 119
public const val EISNAM: CInt = 120
public const val EREMOTEIO: CInt = 121
public const val EDQUOT: CInt = 122
public const val ENOMEDIUM: CInt = 123
public const val EMEDIUMTYPE: CInt = 124
public const val ECANCELED: CInt = 125
public const val ENOKEY: CInt = 126
public const val EKEYEXPIRED: CInt = 127
public const val EKEYREVOKED: CInt = 128
public const val EKEYREJECTED: CInt = 129
public const val EOWNERDEAD: CInt = 130
public const val ENOTRECOVERABLE: CInt = 131
public const val F_DUPFD: CInt = 0
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val F_DUPFD_CLOEXEC: CInt = F_DUPFD
public const val FD_CLOEXEC: CInt = 0x0100_0000
public const val O_RDONLY: CInt = 0x0001_0000
public const val O_WRONLY: CInt = 0x0002_0000
public const val O_RDWR: CInt = 0x0003_0000
public const val O_ACCMODE: CInt = 0x0003_0000
public const val O_NONBLOCK: CInt = 0x0004_0000
public const val O_NDELAY: CInt = O_NONBLOCK
public const val O_APPEND: CInt = 0x0008_0000
public const val O_SHLOCK: CInt = 0x0010_0000
public const val O_EXLOCK: CInt = 0x0020_0000
public const val O_ASYNC: CInt = 0x0040_0000
public const val O_FSYNC: CInt = 0x0080_0000
public const val O_CLOEXEC: CInt = 0x0100_0000
public const val O_CREAT: CInt = 0x0200_0000
public const val O_TRUNC: CInt = 0x0400_0000
public const val O_EXCL: CInt = 0x0800_0000
public const val O_DIRECTORY: CInt = 0x1000_0000
public const val O_PATH: CInt = 0x2000_0000
public const val O_SYMLINK: CInt = 0x4000_0000
public const val O_NOFOLLOW: CInt = -0x8000_0000
public const val O_NOCTTY: CInt = 0x00000200
public const val LC_ALL: CInt = 0
public const val LC_COLLATE: CInt = 1
public const val LC_CTYPE: CInt = 2
public const val LC_MESSAGES: CInt = 3
public const val LC_MONETARY: CInt = 4
public const val LC_NUMERIC: CInt = 5
public const val LC_TIME: CInt = 6
public const val AI_PASSIVE: CInt = 0x0001
public const val AI_CANONNAME: CInt = 0x0002
public const val AI_NUMERICHOST: CInt = 0x0004
public const val AI_V4MAPPED: CInt = 0x0008
public const val AI_ALL: CInt = 0x0010
public const val AI_ADDRCONFIG: CInt = 0x0020
public const val AI_NUMERICSERV: CInt = 0x0400
public const val EAI_BADFLAGS: CInt = -1
public const val EAI_NONAME: CInt = -2
public const val EAI_AGAIN: CInt = -3
public const val EAI_FAIL: CInt = -4
public const val EAI_NODATA: CInt = -5
public const val EAI_FAMILY: CInt = -6
public const val EAI_SOCKTYPE: CInt = -7
public const val EAI_SERVICE: CInt = -8
public const val EAI_ADDRFAMILY: CInt = -9
public const val EAI_MEMORY: CInt = -10
public const val EAI_SYSTEM: CInt = -11
public const val EAI_OVERFLOW: CInt = -12
public const val NI_MAXHOST: CInt = 1025
public const val NI_MAXSERV: CInt = 32
public const val NI_NUMERICHOST: CInt = 0x0001
public const val NI_NUMERICSERV: CInt = 0x0002
public const val NI_NOFQDN: CInt = 0x0004
public const val NI_NAMEREQD: CInt = 0x0008
public const val NI_DGRAM: CInt = 0x0010
public const val IP_TTL: CInt = 2
public const val IPV6_UNICAST_HOPS: CInt = 16
public const val IPV6_MULTICAST_IF: CInt = 17
public const val IPV6_MULTICAST_HOPS: CInt = 18
public const val IPV6_MULTICAST_LOOP: CInt = 19
public const val IPV6_ADD_MEMBERSHIP: CInt = 20
public const val IPV6_DROP_MEMBERSHIP: CInt = 21
public const val IPV6_V6ONLY: CInt = 26
public const val IP_MULTICAST_IF: CInt = 32
public const val IP_MULTICAST_TTL: CInt = 33
public const val IP_MULTICAST_LOOP: CInt = 34
public const val IP_ADD_MEMBERSHIP: CInt = 35
public const val IP_DROP_MEMBERSHIP: CInt = 36
public const val IP_TOS: CInt = 1
public const val IP_RECVTOS: CInt = 2
public const val IPPROTO_IGMP: CInt = 2
public const val IPPROTO_PUP: CInt = 12
public const val IPPROTO_IDP: CInt = 22
public const val IPPROTO_RAW: CInt = 255
public const val IPPROTO_MAX: CInt = 255
public const val TCP_NODELAY: CInt = 1
public const val TCP_KEEPIDLE: CInt = 1
public const val POLLIN: CShort = 0x001
public const val POLLPRI: CShort = 0x002
public const val POLLOUT: CShort = 0x004
public const val POLLERR: CShort = 0x008
public const val POLLHUP: CShort = 0x010
public const val POLLNVAL: CShort = 0x020
public const val POLLRDNORM: CShort = 0x040
public const val POLLRDBAND: CShort = 0x080
public const val POLLWRNORM: CShort = 0x100
public const val POLLWRBAND: CShort = 0x200
public const val PTHREAD_MUTEX_DEFAULT: CInt = 0
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 1
public const val PTHREAD_MUTEX_NORMAL: CInt = 2
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 3
public const val PTHREAD_MUTEX_ROBUST: CInt = 0
public const val PTHREAD_MUTEX_STALLED: CInt = 1

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = crate::pthread_mutex_t { bytes: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = crate::pthread_cond_t { bytes: [0 (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = crate::pthread_rwlock_t { bytes: [0 (initializer represented at the FFI boundary)
public const val PTHREAD_STACK_MIN: ULong = 4096uL
public const val SIG_BLOCK: CInt = 0
public const val SIG_UNBLOCK: CInt = 1
public const val SIG_SETMASK: CInt = 2
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGTRAP: CInt = 5
public const val SIGABRT: CInt = 6
public const val SIGBUS: CInt = 7
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGUSR1: CInt = 10
public const val SIGSEGV: CInt = 11
public const val SIGUSR2: CInt = 12
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val SIGSTKFLT: CInt = 16
public const val SIGCHLD: CInt = 17
public const val SIGCONT: CInt = 18
public const val SIGSTOP: CInt = 19
public const val SIGTSTP: CInt = 20
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGURG: CInt = 23
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGWINCH: CInt = 28
public const val SIGIO: CInt = 29
public const val SIGPWR: CInt = 30
public const val SIGSYS: CInt = 31
public const val NSIG: CInt = 32
public const val SA_NOCLDWAIT: CULong = 0x00000002uL
public const val SA_RESTORER: CULong = 0x00000004uL
public const val SA_SIGINFO: CULong = 0x02000000uL
public const val SA_ONSTACK: CULong = 0x04000000uL
public const val SA_RESTART: CULong = 0x08000000uL
public const val SA_NODEFER: CULong = 0x10000000uL
public const val SA_RESETHAND: CULong = 0x20000000uL
public const val SA_NOCLDSTOP: CULong = 0x40000000uL
public const val LOCK_SH: CInt = 1
public const val LOCK_EX: CInt = 2
public const val LOCK_NB: CInt = 4
public const val LOCK_UN: CInt = 8
public const val EPOLL_CLOEXEC: CInt = 0x0100_0000
public const val EPOLL_CTL_ADD: CInt = 1
public const val EPOLL_CTL_DEL: CInt = 2
public const val EPOLL_CTL_MOD: CInt = 3
public const val EPOLLIN: CInt = 0x001
public const val EPOLLPRI: CInt = 0x002
public const val EPOLLOUT: CInt = 0x004
public const val EPOLLERR: CInt = 0x008
public const val EPOLLHUP: CInt = 0x010
public const val EPOLLNVAL: CInt = 0x020
public const val EPOLLRDNORM: CInt = 0x040
public const val EPOLLRDBAND: CInt = 0x080
public const val EPOLLWRNORM: CInt = 0x100
public const val EPOLLWRBAND: CInt = 0x200
public const val EPOLLMSG: CInt = 0x400
public const val EPOLLRDHUP: CInt = 0x2000
public val EPOLLEXCLUSIVE: CInt = 1 shl 28
public val EPOLLWAKEUP: CInt = 1 shl 29
public val EPOLLONESHOT: CInt = 1 shl 30
public val EPOLLET: CInt = 1 shl 31
public const val S_IFMT: CInt = 61440
public const val S_IFDIR: CInt = 16384
public const val S_IFCHR: CInt = 8192
public const val S_IFBLK: CInt = 24576
public const val S_IFREG: CInt = 32768
public const val S_IFIFO: CInt = 4096
public const val S_IFLNK: CInt = 40960
public const val S_IFSOCK: CInt = 49152
public const val S_IRWXU: CInt = 448
public const val S_IRUSR: CInt = 256
public const val S_IWUSR: CInt = 128
public const val S_IXUSR: CInt = 64
public const val S_IRWXG: CInt = 56
public const val S_IRGRP: CInt = 32
public const val S_IWGRP: CInt = 16
public const val S_IXGRP: CInt = 8
public const val S_IRWXO: CInt = 7
public const val S_IROTH: CInt = 4
public const val S_IWOTH: CInt = 2
public const val S_IXOTH: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val EXIT_FAILURE: CInt = 1
public const val FIONREAD: CULong = 0x541BuL
public const val FIONBIO: CULong = 0x5421uL
public const val FIOCLEX: CULong = 0x5451uL
public const val TCGETS: CULong = 0x5401uL
public const val TCSETS: CULong = 0x5402uL
public const val TCFLSH: CULong = 0x540BuL
public const val TIOCSCTTY: CULong = 0x540EuL
public const val TIOCGPGRP: CULong = 0x540FuL
public const val TIOCSPGRP: CULong = 0x5410uL
public const val TIOCGWINSZ: CULong = 0x5413uL
public const val TIOCSWINSZ: CULong = 0x5414uL
public const val PROT_NONE: CInt = 0x0000
public const val PROT_READ: CInt = 0x0004
public const val PROT_WRITE: CInt = 0x0002
public const val PROT_EXEC: CInt = 0x0001
public const val MADV_NORMAL: CInt = 0
public const val MADV_RANDOM: CInt = 1
public const val MADV_SEQUENTIAL: CInt = 2
public const val MADV_WILLNEED: CInt = 3
public const val MADV_DONTNEED: CInt = 4
public const val MAP_SHARED: CInt = 0x0001
public const val MAP_PRIVATE: CInt = 0x0002
public const val MAP_ANON: CInt = 0x0020
public const val MAP_ANONYMOUS: CInt = MAP_ANON
public const val MAP_FIXED: CInt = 0x0004
public const val MS_ASYNC: CInt = 0x0001
public const val MS_INVALIDATE: CInt = 0x0002
public const val MS_SYNC: CInt = 0x0004
public val RLIM_INFINITY: RlimT = 0uL.inv()
public val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY
public val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY
public const val RLIMIT_CPU: CInt = 0
public const val RLIMIT_FSIZE: CInt = 1
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_STACK: CInt = 3
public const val RLIMIT_CORE: CInt = 4
public const val RLIMIT_RSS: CInt = 5
public const val RLIMIT_NPROC: CInt = 6
public const val RLIMIT_NOFILE: CInt = 7
public const val RLIMIT_MEMLOCK: CInt = 8
public const val RLIMIT_AS: CInt = 9
public const val RLIMIT_LOCKS: CInt = 10
public const val RLIMIT_SIGPENDING: CInt = 11
public const val RLIMIT_MSGQUEUE: CInt = 12
public const val RLIMIT_NICE: CInt = 13
public const val RLIMIT_RTPRIO: CInt = 14
public const val RLIMIT_NLIMITS: CInt = 15
public const val RUSAGE_SELF: CInt = 0
public const val RUSAGE_CHILDREN: CInt = -1
public const val RUSAGE_BOTH: CInt = -2
public const val RUSAGE_THREAD: CInt = 1
public const val FD_SETSIZE: ULong = 1024uL
public const val AF_INET: CInt = 2
public const val AF_INET6: CInt = 10
public const val AF_UNIX: CInt = 1
public const val AF_UNSPEC: CInt = 0
public const val PF_INET: CInt = 2
public const val PF_INET6: CInt = 10
public const val PF_UNIX: CInt = 1
public const val PF_UNSPEC: CInt = 0
public const val MSG_CTRUNC: CInt = 8
public const val MSG_DONTROUTE: CInt = 4
public const val MSG_EOR: CInt = 128
public const val MSG_OOB: CInt = 1
public const val MSG_PEEK: CInt = 2
public const val MSG_TRUNC: CInt = 32
public const val MSG_DONTWAIT: CInt = 64
public const val MSG_WAITALL: CInt = 256
public const val SCM_RIGHTS: CInt = 1
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val SO_DEBUG: CInt = 1
public const val SO_REUSEADDR: CInt = 2
public const val SO_TYPE: CInt = 3
public const val SO_ERROR: CInt = 4
public const val SO_DONTROUTE: CInt = 5
public const val SO_BROADCAST: CInt = 6
public const val SO_SNDBUF: CInt = 7
public const val SO_RCVBUF: CInt = 8
public const val SO_KEEPALIVE: CInt = 9
public const val SO_OOBINLINE: CInt = 10
public const val SO_NO_CHECK: CInt = 11
public const val SO_PRIORITY: CInt = 12
public const val SO_LINGER: CInt = 13
public const val SO_BSDCOMPAT: CInt = 14
public const val SO_REUSEPORT: CInt = 15
public const val SO_PASSCRED: CInt = 16
public const val SO_PEERCRED: CInt = 17
public const val SO_RCVLOWAT: CInt = 18
public const val SO_SNDLOWAT: CInt = 19
public const val SO_RCVTIMEO: CInt = 20
public const val SO_SNDTIMEO: CInt = 21
public const val SO_ACCEPTCONN: CInt = 30
public const val SO_PEERSEC: CInt = 31
public const val SO_SNDBUFFORCE: CInt = 32
public const val SO_RCVBUFFORCE: CInt = 33
public const val SO_PROTOCOL: CInt = 38
public const val SO_DOMAIN: CInt = 39
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_RAW: CInt = 3
public const val SOCK_NONBLOCK: CInt = 2048
public const val SOCK_CLOEXEC: CInt = 524288
public const val SOCK_SEQPACKET: CInt = 5
public const val SOL_SOCKET: CInt = 1
public const val SOMAXCONN: CInt = 128
public const val VEOF: ULong = 0uL
public const val VEOL: ULong = 1uL
public const val VEOL2: ULong = 2uL
public const val VERASE: ULong = 3uL
public const val VWERASE: ULong = 4uL
public const val VKILL: ULong = 5uL
public const val VREPRINT: ULong = 6uL
public const val VSWTC: ULong = 7uL
public const val VINTR: ULong = 8uL
public const val VQUIT: ULong = 9uL
public const val VSUSP: ULong = 10uL
public const val VSTART: ULong = 12uL
public const val VSTOP: ULong = 13uL
public const val VLNEXT: ULong = 14uL
public const val VDISCARD: ULong = 15uL
public const val VMIN: ULong = 16uL
public const val VTIME: ULong = 17uL
public const val NCCS: ULong = 32uL
public const val IGNBRK: TcflagT = 1u
public const val BRKINT: TcflagT = 2u
public const val IGNPAR: TcflagT = 4u
public const val PARMRK: TcflagT = 8u
public const val INPCK: TcflagT = 16u
public const val ISTRIP: TcflagT = 32u
public const val INLCR: TcflagT = 64u
public const val IGNCR: TcflagT = 128u
public const val ICRNL: TcflagT = 256u
public const val IXON: TcflagT = 512u
public const val IXOFF: TcflagT = 1024u
public const val OPOST: TcflagT = 1u
public const val ONLCR: TcflagT = 2u
public const val OLCUC: TcflagT = 4u
public const val OCRNL: TcflagT = 8u
public const val ONOCR: TcflagT = 16u
public const val ONLRET: TcflagT = 32u
public const val OFILL: TcflagT = 64u
public const val OFDEL: TcflagT = 128u
public const val B0: SpeedT = 0u
public const val B50: SpeedT = 1u
public const val B75: SpeedT = 2u
public const val B110: SpeedT = 3u
public const val B134: SpeedT = 4u
public const val B150: SpeedT = 5u
public const val B200: SpeedT = 6u
public const val B300: SpeedT = 7u
public const val B600: SpeedT = 8u
public const val B1200: SpeedT = 9u
public const val B1800: SpeedT = 10u
public const val B2400: SpeedT = 11u
public const val B4800: SpeedT = 12u
public const val B9600: SpeedT = 13u
public const val B19200: SpeedT = 14u
public const val B38400: SpeedT = 15u
public const val B57600: SpeedT = 16u
public const val B115200: SpeedT = 17u
public const val B230400: SpeedT = 18u
public const val B460800: SpeedT = 19u
public const val B500000: SpeedT = 20u
public const val B576000: SpeedT = 21u
public const val B921600: SpeedT = 22u
public const val B1000000: SpeedT = 23u
public const val B1152000: SpeedT = 24u
public const val B1500000: SpeedT = 25u
public const val B2000000: SpeedT = 26u
public const val B2500000: SpeedT = 27u
public const val B3000000: SpeedT = 28u
public const val B3500000: SpeedT = 29u
public const val B4000000: SpeedT = 30u
public const val CSIZE: TcflagT = 768u
public const val CS5: TcflagT = 0u
public const val CS6: TcflagT = 256u
public const val CS7: TcflagT = 512u
public const val CS8: TcflagT = 768u
public const val CSTOPB: TcflagT = 1024u
public const val CREAD: TcflagT = 2048u
public const val PARENB: TcflagT = 4096u
public const val PARODD: TcflagT = 8192u
public const val HUPCL: TcflagT = 16384u
public const val CLOCAL: TcflagT = 32768u
public const val ISIG: TcflagT = 0x00000080u
public const val ICANON: TcflagT = 0x00000100u
public const val ECHO: TcflagT = 0x00000008u
public const val ECHOE: TcflagT = 0x00000002u
public const val ECHOK: TcflagT = 0x00000004u
public const val ECHONL: TcflagT = 0x00000010u
public const val NOFLSH: TcflagT = 0x8000_0000u
public const val TOSTOP: TcflagT = 0x00400000u
public const val IEXTEN: TcflagT = 0x00000400u
public const val TCOOFF: CInt = 0
public const val TCOON: CInt = 1
public const val TCIOFF: CInt = 2
public const val TCION: CInt = 3
public const val TCIFLUSH: CInt = 0
public const val TCOFLUSH: CInt = 1
public const val TCIOFLUSH: CInt = 2
public const val TCSANOW: CInt = 0
public const val TCSADRAIN: CInt = 1
public const val TCSAFLUSH: CInt = 2
public const val _POSIX_VDISABLE: CcT = 0u
public const val WNOHANG: CInt = 1
public const val WUNTRACED: CInt = 2
public const val WSTOPPED: CInt = 2
public const val WEXITED: CInt = 4
public const val WCONTINUED: CInt = 8
public const val WNOWAIT: CInt = 0x0100_0000
public const val __WNOTHREAD: CInt = 0x2000_0000
public const val __WALL: CInt = 0x4000_0000
public const val __WCLONE: CInt = 0x8000_0000.toInt()
public const val CLOCK_REALTIME: CInt = 1
public const val CLOCK_MONOTONIC: CInt = 4
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2
public const val CLOCKS_PER_SEC: ClockT = 1_000_000
public const val _SC_ARG_MAX: CInt = 0
public const val _SC_CHILD_MAX: CInt = 1
public const val _SC_CLK_TCK: CInt = 2
public const val _SC_NGROUPS_MAX: CInt = 3
public const val _SC_OPEN_MAX: CInt = 4
public const val _SC_STREAM_MAX: CInt = 5
public const val _SC_TZNAME_MAX: CInt = 6
public const val _SC_VERSION: CInt = 29
public const val _SC_PAGESIZE: CInt = 30
public const val _SC_PAGE_SIZE: CInt = 30
public const val _SC_RE_DUP_MAX: CInt = 44
public const val _SC_NPROCESSORS_CONF: CInt = 57
public const val _SC_NPROCESSORS_ONLN: CInt = 58
public const val _SC_GETGR_R_SIZE_MAX: CInt = 69
public const val _SC_GETPW_R_SIZE_MAX: CInt = 70
public const val _SC_LOGIN_NAME_MAX: CInt = 71
public const val _SC_TTY_NAME_MAX: CInt = 72
public const val _SC_SYMLOOP_MAX: CInt = 173
public const val _SC_HOST_NAME_MAX: CInt = 180
public const val _SC_SIGQUEUE_MAX: CInt = 190
public const val _SC_REALTIME_SIGNALS: CInt = 191
public const val _CS_PATH: CInt = 0
public const val _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS: CInt = 1
public const val _CS_POSIX_V5_WIDTH_RESTRICTED_ENVS: CInt = 4
public const val _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS: CInt = 5
public const val _CS_POSIX_V6_ILP32_OFF32_CFLAGS: CInt = 1116
public const val _CS_POSIX_V6_ILP32_OFF32_LDFLAGS: CInt = 1117
public const val _CS_POSIX_V6_ILP32_OFF32_LIBS: CInt = 1118
public const val _CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: CInt = 1119
public const val _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: CInt = 1120
public const val _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: CInt = 1121
public const val _CS_POSIX_V6_ILP32_OFFBIG_LIBS: CInt = 1122
public const val _CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: CInt = 1123
public const val _CS_POSIX_V6_LP64_OFF64_CFLAGS: CInt = 1124
public const val _CS_POSIX_V6_LP64_OFF64_LDFLAGS: CInt = 1125
public const val _CS_POSIX_V6_LP64_OFF64_LIBS: CInt = 1126
public const val _CS_POSIX_V6_LP64_OFF64_LINTFLAGS: CInt = 1127
public const val _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: CInt = 1128
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: CInt = 1129
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LIBS: CInt = 1130
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: CInt = 1131
public const val _CS_POSIX_V7_ILP32_OFF32_CFLAGS: CInt = 1132
public const val _CS_POSIX_V7_ILP32_OFF32_LDFLAGS: CInt = 1133
public const val _CS_POSIX_V7_ILP32_OFF32_LIBS: CInt = 1134
public const val _CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: CInt = 1135
public const val _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: CInt = 1136
public const val _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: CInt = 1137
public const val _CS_POSIX_V7_ILP32_OFFBIG_LIBS: CInt = 1138
public const val _CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: CInt = 1139
public const val _CS_POSIX_V7_LP64_OFF64_CFLAGS: CInt = 1140
public const val _CS_POSIX_V7_LP64_OFF64_LDFLAGS: CInt = 1141
public const val _CS_POSIX_V7_LP64_OFF64_LIBS: CInt = 1142
public const val _CS_POSIX_V7_LP64_OFF64_LINTFLAGS: CInt = 1143
public const val _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: CInt = 1144
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: CInt = 1145
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LIBS: CInt = 1146
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: CInt = 1147
public const val F_OK: CInt = 0
public const val R_OK: CInt = 4
public const val W_OK: CInt = 2
public const val X_OK: CInt = 1
public const val BUFSIZ: CUInt = 1024u
public const val _IOFBF: CInt = 0
public const val _IOLBF: CInt = 1
public const val _IONBF: CInt = 2
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val _PC_LINK_MAX: CInt = 0
public const val _PC_MAX_CANON: CInt = 1
public const val _PC_MAX_INPUT: CInt = 2
public const val _PC_NAME_MAX: CInt = 3
public const val _PC_PATH_MAX: CInt = 4
public const val _PC_PIPE_BUF: CInt = 5
public const val _PC_CHOWN_RESTRICTED: CInt = 6
public const val _PC_NO_TRUNC: CInt = 7
public const val _PC_VDISABLE: CInt = 8
public const val _PC_SYNC_IO: CInt = 9
public const val _PC_ASYNC_IO: CInt = 10
public const val _PC_PRIO_IO: CInt = 11
public const val _PC_SOCK_MAXBUF: CInt = 12
public const val _PC_FILESIZEBITS: CInt = 13
public const val _PC_REC_INCR_XFER_SIZE: CInt = 14
public const val _PC_REC_MAX_XFER_SIZE: CInt = 15
public const val _PC_REC_MIN_XFER_SIZE: CInt = 16
public const val _PC_REC_XFER_ALIGN: CInt = 17
public const val _PC_ALLOC_SIZE_MIN: CInt = 18
public const val _PC_SYMLINK_MAX: CInt = 19
public const val _PC_2_SYMLINKS: CInt = 20
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
public const val RENAME_NOREPLACE: CUInt = 1u

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun fDCLR(fd: CInt, set: FdSet?)
public expect fun fDISSET(fd: CInt, set: FdSet?): Boolean 
public expect fun fDSET(fd: CInt, set: FdSet?)
public expect fun fDZERO(set: FdSet?)
public expect fun errnoLocation(): CInt? 
public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt 
public expect fun dirfd(dirp: DIR?): CInt 
public expect fun pipe2(fds: CInt?, flags: CInt): CInt 
public expect fun getdtablesize(): CInt 
public expect fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt 
public expect fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt 
public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt 
public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt 
public expect fun getgrent(): Group? 
public expect fun setgrent()
public expect fun endgrent()
public expect fun getgrgid(gid: GidT): Group? 
public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt 
public expect fun getgrnam(name: String?): Group? 
public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt 
public expect fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt 
public expect fun memalign(align: ULong, size: ULong): COpaquePointer? 
public expect fun getnameinfo(addr: Sockaddr?, addrlen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt 
public fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt = -1

public fun pthreadCreate(tid: PthreadT, attr: PthreadAttrT?, start: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): CInt = -1

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt 
public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt 
public expect fun getpwent(): Passwd? 
public expect fun setpwent()
public expect fun endpwent()
public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt 
public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt 
public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt 
public expect fun pthreadCancel(thread: PthreadT): CInt 
public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt 
public expect fun sigtimedwait(set: SigsetT?, sig: SiginfoT?, timeout: Timespec?): CInt 
public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt 
public expect fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt 
public expect fun mkostemp(template: String?, flags: CInt): CInt 
public expect fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt 
public expect fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? 
public expect fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUInt): CInt 
public expect fun explicitBzero(p: COpaquePointer?, len: ULong)
public expect fun strlcat(dst: String?, src: String?, siz: ULong): ULong 
public expect fun strlcpy(dst: String?, src: String?, siz: ULong): ULong 
public expect fun epollCreate(size: CInt): CInt 
public expect fun epollCreate1(flags: CInt): CInt 
public expect fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt 
public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt 
public expect fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt 
public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt 
public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt 
public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt 
public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt 
public expect fun shmUnlink(name: String?): CInt 
public expect fun getpriority(which: CInt, who: IdT): CInt 
public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt 
public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt 
public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt 
public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? 
public expect fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? 
public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? 
public expect fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt 
public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT 
public expect fun recvmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT 
public expect fun sendmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT 
public expect fun futimens(fd: CInt, times: Timespec?): CInt 
public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT 
public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT 
public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT 
public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT 
public expect fun uname(utsname: Utsname?): CInt 
public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt 
public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt 
public expect fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong 
public expect fun loginTty(fd: CInt): CInt 