// port-lint: source unix/nuttx/mod.rs
package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias NlinkT = UShort
public typealias InoT = UShort
public typealias BlkcntT = ULong
public typealias BlksizeT = Short
public typealias CcT = UByte
public typealias ClockT = Long
public typealias DevT = Int
public typealias FsblkcntT = ULong
public typealias LocaleT = COpaquePointer?
public typealias ModeT = UInt
public typealias NfdsT = UInt
public typealias OffT = Long
public typealias PthreadKeyT = Int
public typealias PthreadMutexattrT = UByte
public typealias PthreadRwlockattrT = Int
public typealias PthreadT = Int
public typealias RlimT = Long
public typealias SaFamilyT = UShort
public typealias SocklenT = UInt
public typealias SpeedT = ULong
public typealias SusecondsT = Int
public typealias TcflagT = UInt
public typealias ClockidT = Int
public typealias TimeT = Long
public typealias WcharT = Int

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: DevT,
    val stSize: OffT,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
    val stBlksize: BlksizeT,
    val stBlocks: Long,
)

public data class Sockaddr(
    val saFamily: SaFamilyT,
    val saData: UByteArray,
)

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UInt,
    val pwGid: UInt,
    val pwGecos: String?,
    val pwDir: String?,
    val pwShell: String?,
)

public data class SemT(
    val `val`: List<ULong>,
)

public data class PthreadAttrT(
    val `val`: List<ULong>,
)

public data class PthreadMutexT(
    val `val`: List<ULong>,
)

public data class PthreadCondT(
    val `val`: List<ULong>,
)

public data class PthreadCondattrT(
    val `val`: List<ULong>,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class Lconv(
    val decimalPoint: String?,
    val thousandsSep: String?,
    val grouping: String?,
    val intCurrSymbol: String?,
    val currencySymbol: String?,
    val monDecimalPoint: String?,
    val monThousandsSep: String?,
    val monGrouping: String?,
    val positiveSign: String?,
    val negativeSign: String?,
    val intFracDigits: Byte,
    val fracDigits: Byte,
    val pCsPrecedes: Byte,
    val pSepBySpace: Byte,
    val nCsPrecedes: Byte,
    val nSepBySpace: Byte,
    val pSignPosn: Byte,
    val nSignPosn: Byte,
    val intNCsPrecedes: Byte,
    val intNSepBySpace: Byte,
    val intNSignPosn: Byte,
    val intPCsPrecedes: Byte,
    val intPSepBySpace: Byte,
    val intPSignPosn: Byte,
)

public data class Tm(
    val tmSec: Int,
    val tmMin: Int,
    val tmHour: Int,
    val tmMday: Int,
    val tmMon: Int,
    val tmYear: Int,
    val tmWday: Int,
    val tmYday: Int,
    val tmIsdst: Int,
    val tmGmtoff: Long,
    val tmZone: String?,
)

public data class Addrinfo(
    val aiFlags: Int,
    val aiFamily: Int,
    val aiSocktype: Int,
    val aiProtocol: Int,
    val aiAddrlen: SocklenT,
    val aiAddr: Sockaddr?,
    val aiCanonname: String?,
    val aiNext: Addrinfo?,
)

public data class PthreadRwlockT(
    val `val`: List<ULong>,
)

public data class Statvfs(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsblkcntT,
    val fFfree: FsblkcntT,
    val fFavail: FsblkcntT,
    val fFsid: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
)

public data class Dirent(
    val dType: UByte,
    val dName: ByteArray,
)

public data class FdSet(
    val `val`: UIntArray,
)

public data class SigsetT(
    val `val`: UIntArray,
)

public data class Sigaction(
    val saHandler: ULong,
    val saMask: SigsetT,
    val saFlags: Int,
    val saUser: ULong,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cCc: List<CcT>,
    val cSpeed: SpeedT,
)

public data class InAddr(
    val sAddr: InAddrT,
)

public data class SockaddrIn(
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: UByteArray,
)

public data class SockaddrIn6(
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class SockaddrUn(
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class SockaddrStorage(
    val ssFamily: SaFamilyT,
    val ssData: UIntArray,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class Ipv6Mreq(
    val ipv6mrMultiaddr: In6Addr,
    val ipv6mrInterface: UInt,
)

// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { __val: [0 (initializer represented at the FFI boundary)
// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { __val: [0 (initializer represented at the FFI boundary)
public const val EXIT_SUCCESS: Int = 0
public const val EXIT_FAILURE: Int = 1
public const val CLOCK_REALTIME: Int = 0
public const val CLOCK_MONOTONIC: Int = 1
public const val EPERM: Int = 1
public const val ENOENT: Int = 2
public const val ESRCH: Int = 3
public const val EINTR: Int = 4
public const val EIO: Int = 5
public const val ENXIO: Int = 6
public const val E2BIG: Int = 7
public const val ENOEXEC: Int = 8
public const val EBADF: Int = 9
public const val ECHILD: Int = 10
public const val EAGAIN: Int = 11
public const val ENOMEM: Int = 12
public const val EACCES: Int = 13
public const val EFAULT: Int = 14
public const val ENOTBLK: Int = 15
public const val EBUSY: Int = 16
public const val EEXIST: Int = 17
public const val EXDEV: Int = 18
public const val ENODEV: Int = 19
public const val ENOTDIR: Int = 20
public const val EISDIR: Int = 21
public const val EINVAL: Int = 22
public const val ENFILE: Int = 23
public const val EMFILE: Int = 24
public const val ENOTTY: Int = 25
public const val ETXTBSY: Int = 26
public const val EFBIG: Int = 27
public const val ENOSPC: Int = 28
public const val ESPIPE: Int = 29
public const val EROFS: Int = 30
public const val EMLINK: Int = 31
public const val EPIPE: Int = 32
public const val EDOM: Int = 33
public const val ERANGE: Int = 34
public const val EDEADLK: Int = 35
public const val ENAMETOOLONG: Int = 36
public const val ENOLCK: Int = 37
public const val ENOSYS: Int = 38
public const val ENOTEMPTY: Int = 39
public const val ELOOP: Int = 40
public const val EWOULDBLOCK: Int = EAGAIN
public const val ENOMSG: Int = 42
public const val EIDRM: Int = 43
public const val ECHRNG: Int = 44
public const val EL2NSYNC: Int = 45
public const val EL3HLT: Int = 46
public const val EL3RST: Int = 47
public const val ELNRNG: Int = 48
public const val EUNATCH: Int = 49
public const val ENOCSI: Int = 50
public const val EL2HLT: Int = 51
public const val EBADE: Int = 52
public const val EBADR: Int = 53
public const val EXFULL: Int = 54
public const val ENOANO: Int = 55
public const val EBADRQC: Int = 56
public const val EBADSLT: Int = 57
public const val EDEADLOCK: Int = EDEADLK
public const val EBFONT: Int = 59
public const val ENOSTR: Int = 60
public const val ENODATA: Int = 61
public const val ETIME: Int = 62
public const val ENOSR: Int = 63
public const val ENONET: Int = 64
public const val ENOPKG: Int = 65
public const val EREMOTE: Int = 66
public const val ENOLINK: Int = 67
public const val EADV: Int = 68
public const val ESRMNT: Int = 69
public const val ECOMM: Int = 70
public const val EPROTO: Int = 71
public const val EMULTIHOP: Int = 72
public const val EDOTDOT: Int = 73
public const val EBADMSG: Int = 74
public const val EOVERFLOW: Int = 75
public const val ENOTUNIQ: Int = 76
public const val EBADFD: Int = 77
public const val EREMCHG: Int = 78
public const val ELIBACC: Int = 79
public const val ELIBBAD: Int = 80
public const val ELIBSCN: Int = 81
public const val ELIBMAX: Int = 82
public const val ELIBEXEC: Int = 83
public const val EILSEQ: Int = 84
public const val ERESTART: Int = 85
public const val ESTRPIPE: Int = 86
public const val EUSERS: Int = 87
public const val ENOTSOCK: Int = 88
public const val EDESTADDRREQ: Int = 89
public const val EMSGSIZE: Int = 90
public const val EPROTOTYPE: Int = 91
public const val ENOPROTOOPT: Int = 92
public const val EPROTONOSUPPORT: Int = 93
public const val ESOCKTNOSUPPORT: Int = 94
public const val EOPNOTSUPP: Int = 95
public const val EPFNOSUPPORT: Int = 96
public const val EAFNOSUPPORT: Int = 97
public const val EADDRINUSE: Int = 98
public const val EADDRNOTAVAIL: Int = 99
public const val ENETDOWN: Int = 100
public const val ENETUNREACH: Int = 101
public const val ENETRESET: Int = 102
public const val ECONNABORTED: Int = 103
public const val ECONNRESET: Int = 104
public const val ENOBUFS: Int = 105
public const val EISCONN: Int = 106
public const val ENOTCONN: Int = 107
public const val ESHUTDOWN: Int = 108
public const val ETOOMANYREFS: Int = 109
public const val ETIMEDOUT: Int = 110
public const val ECONNREFUSED: Int = 111
public const val EHOSTDOWN: Int = 112
public const val EHOSTUNREACH: Int = 113
public const val EALREADY: Int = 114
public const val EINPROGRESS: Int = 115
public const val ESTALE: Int = 116
public const val EUCLEAN: Int = 117
public const val ENOTNAM: Int = 118
public const val ENAVAIL: Int = 119
public const val EISNAM: Int = 120
public const val EREMOTEIO: Int = 121
public const val EDQUOT: Int = 122
public const val ENOMEDIUM: Int = 123
public const val EMEDIUMTYPE: Int = 124
public const val ECANCELED: Int = 125
public const val ENOKEY: Int = 126
public const val EKEYEXPIRED: Int = 127
public const val EKEYREVOKED: Int = 128
public const val EKEYREJECTED: Int = 129
public const val EOWNERDEAD: Int = 130
public const val ENOTRECOVERABLE: Int = 131
public const val ERFKILL: Int = 132
public const val EHWPOISON: Int = 133
public const val ELBIN: Int = 134
public const val EFTYPE: Int = 135
public const val ENMFILE: Int = 136
public const val EPROCLIM: Int = 137
public const val ENOTSUP: Int = 138
public const val ENOSHARE: Int = 139
public const val ECASECLASH: Int = 140
public const val FIOCLEX: Int = 0x30b
public const val F_SETFL: Int = 0x9
public const val F_DUPFD_CLOEXEC: Int = 0x12
public const val F_GETFD: Int = 0x1
public const val F_GETFL: Int = 0x2
public const val O_RDONLY: Int = 0x1
public const val O_WRONLY: Int = 0x2
public const val O_RDWR: Int = 0x3
public const val O_CREAT: Int = 0x4
public const val O_EXCL: Int = 0x8
public const val O_NOCTTY: Int = 0x0
public const val O_TRUNC: Int = 0x20
public const val O_APPEND: Int = 0x10
public const val O_NONBLOCK: Int = 0x40
public const val O_DSYNC: Int = 0x80
public const val O_DIRECT: Int = 0x200
public const val O_LARGEFILE: Int = 0x2000
public const val O_DIRECTORY: Int = 0x800
public const val O_NOFOLLOW: Int = 0x1000
public const val O_NOATIME: Int = 0x40000
public const val O_CLOEXEC: Int = 0x400
public const val O_ACCMODE: Int = 0x0003
public const val AT_FDCWD: Int = -100
public const val AT_REMOVEDIR: Int = 0x200
public const val SEEK_SET: Int = 0
public const val SEEK_CUR: Int = 1
public const val SEEK_END: Int = 2
public const val S_IFDIR: UInt = 0x4000u
public const val S_IFLNK: UInt = 0xA000u
public const val S_IFREG: UInt = 0x8000u
public const val S_IFMT: UInt = 0xF000u
public const val S_IFIFO: UInt = 0x1000u
public const val S_IFSOCK: UInt = 0xc000u
public const val S_IFBLK: UInt = 0x6000u
public const val S_IFCHR: UInt = 0x2000u
public const val S_IRUSR: UInt = 0x100u
public const val S_IWUSR: UInt = 0x80u
public const val S_IXUSR: UInt = 0x40u
public const val S_IRGRP: UInt = 0x20u
public const val S_IWGRP: UInt = 0x10u
public const val S_IXGRP: UInt = 0x8u
public const val S_IROTH: UInt = 0x004u
public const val S_IWOTH: UInt = 0x002u
public const val S_IXOTH: UInt = 0x001u
public const val POLLIN: Short = 0x01
public const val POLLOUT: Short = 0x04
public const val POLLHUP: Short = 0x10
public const val POLLERR: Short = 0x08
public const val POLLNVAL: Short = 0x20
public const val AF_UNIX: Int = 1
public const val SOCK_DGRAM: Int = 2
public const val SOCK_STREAM: Int = 1
public const val AF_INET: Int = 2
public const val AF_INET6: Int = 10
public const val MSG_PEEK: Int = 0x02
public const val SOL_SOCKET: Int = 1
public const val SHUT_WR: Int = 2
public const val SHUT_RD: Int = 1
public const val SHUT_RDWR: Int = 3
public const val SO_ERROR: Int = 4
public const val SO_REUSEADDR: Int = 11
public const val SOMAXCONN: Int = 8
public const val SO_LINGER: Int = 6
public const val SO_RCVTIMEO: Int = 0xa
public const val SO_SNDTIMEO: Int = 0xe
public const val SO_BROADCAST: Int = 1
public const val TCP_NODELAY: Int = 0x10
public const val FIONBIO: Int = 0x30a
public const val _SC_PAGESIZE: Int = 0x36
public const val _SC_THREAD_STACK_MIN: Int = 0x58
public const val _SC_GETPW_R_SIZE_MAX: Int = 0x25
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
public const val SIGPOLL: CInt = SIGIO
public const val SIGPWR: CInt = 30
public const val SIGSYS: CInt = 31
public const val PTHREAD_MUTEX_NORMAL: Int = 0
public const val IP_TTL: Int = 0x1e
public const val IPV6_V6ONLY: Int = 0x17
public const val IPV6_JOIN_GROUP: Int = 0x11
public const val IPV6_LEAVE_GROUP: Int = 0x12
public const val IP_MULTICAST_LOOP: Int = 0x13
public const val IPV6_MULTICAST_LOOP: Int = 0x15
public const val IP_MULTICAST_TTL: Int = 0x12
public const val IP_ADD_MEMBERSHIP: Int = 0x14
public const val IP_DROP_MEMBERSHIP: Int = 0x15

public expect fun errno(): CInt?
public expect fun bind(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int
public expect fun ioctl(fd: Int, request: Int, ...): Int
public expect fun dirfd(dirp: DIR?): Int
public expect fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: Sockaddr?, addrlen: SocklenT?): Int
public expect fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int
public expect fun clockGettime(clockid: ClockidT, tp: Timespec?): Int
public expect fun futimens(fd: Int, times: Timespec?): Int
public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): Int
public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): Int
public expect fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): Int
public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long
public expect fun arc4random(): UInt
public expect fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong)
