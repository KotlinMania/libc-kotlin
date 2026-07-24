// port-lint: source unix/newlib/mod.rs
package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public typealias BlkcntT = Int
public typealias BlksizeT = Int
public typealias ClockidT = CULong
public typealias DevT = CShort
public typealias InoT = CUShort
public typealias OffT = CLong
public typealias FsblkcntT = ULong
public typealias FsfilcntT = UInt
public typealias IdT = UInt
public typealias KeyT = CInt
public typealias LoffT = CLongLong
public typealias ModeT = CUInt
public typealias NfdsT = UInt
public typealias NlinkT = CUShort
public typealias PthreadT = CULong
public typealias PthreadKeyT = CUInt
public typealias RlimT = UInt
public typealias SaFamilyT = UShort
public typealias SocklenT = UInt
public typealias SpeedT = UInt
public typealias SusecondsT = Int
public typealias TcflagT = UShort
public typealias UsecondsT = UInt
public typealias TimeT = CLongLong

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: SocklenT,
    val aiAddr: Sockaddr?,
    val aiCanonname: String?,
    val aiAddr2: Sockaddr?,
    val aiNext: Addrinfo?,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class InAddr(
    val sAddr: InAddrT,
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
    val intFracDigits: CChar,
    val fracDigits: CChar,
    val pCsPrecedes: CChar,
    val pSepBySpace: CChar,
    val nCsPrecedes: CChar,
    val nSepBySpace: CChar,
    val pSignPosn: CChar,
    val nSignPosn: CChar,
    val intNCsPrecedes: CChar,
    val intNSepBySpace: CChar,
    val intNSignPosn: CChar,
    val intPCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intPSignPosn: CChar,
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

public data class Sigaction(
    val saHandler: ((CInt) -> Unit)?,
    val saMask: SigsetT,
    val saFlags: CInt,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
)

public data class FdSet(
    val fdsBits: ULongArray,
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

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CcT,
    val cCc: List<CcT>,
    val cIspeed: UInt,
    val cOspeed: UInt,
)

public data class SemT(
    val size: ByteArray,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
    val domainname: ByteArray,
)

public data class CpuSetT(
    val bits: UIntArray,
)

public data class PthreadAttrT(
    val size: UByteArray,
    val isInitialized: Int,
    val stackaddr: COpaquePointer?,
    val stacksize: Int,
    val contentionscope: Int,
    val inheritsched: Int,
    val schedpolicy: Int,
    val schedparam: Int,
    val detachstate: Int,
)

public data class PthreadRwlockattrT(
    val size: UByteArray,
)

public data class PthreadMutexT(
    val size: UByteArray,
)

public data class PthreadRwlockT(
    val size: UByteArray,
)

public data class PthreadMutexattrT(
    val size: UByteArray,
)

public data class PthreadCondT(
    val size: UByteArray,
)

public data class PthreadCondattrT(
    val size: UByteArray,
)

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { size: [__PTHREAD_INITIALIZER_BYTE (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { size: [__PTHREAD_INITIALIZER_BYTE (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { size: [__PTHREAD_INITIALIZER_BYTE (initializer represented at the FFI boundary)
public const val NCCS: ULong = 11uL
public const val NCCS: ULong = 32uL
public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 12uL
public const val __SIZEOF_PTHREAD_COND_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 12uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_COND_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 96uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 64uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 24uL
public const val __SIZEOF_PTHREAD_COND_T: ULong = 28uL
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 24uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 56uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL
public const val __PTHREAD_MUTEX_HAVE_PREV: ULong = 1uL
public const val __PTHREAD_RWLOCK_INT_FLAGS_SHARED: ULong = 1uL
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 1
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 2
public const val FD_SETSIZE: ULong = 64uL
public const val FD_SETSIZE: ULong = 256uL
public const val FD_SETSIZE: ULong = 1024uL
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
public const val ENOMSG: CInt = 35
public const val EIDRM: CInt = 36
public const val EDEADLK: CInt = 45
public const val ENOLCK: CInt = 46
public const val ENOSTR: CInt = 60
public const val ENODATA: CInt = 61
public const val ETIME: CInt = 62
public const val ENOSR: CInt = 63
public const val ENOLINK: CInt = 67
public const val EPROTO: CInt = 71
public const val EMULTIHOP: CInt = 74
public const val EBADMSG: CInt = 77
public const val EFTYPE: CInt = 79
public const val ENOSYS: CInt = 88
public const val ENOTEMPTY: CInt = 90
public const val ENAMETOOLONG: CInt = 91
public const val ELOOP: CInt = 92
public const val EOPNOTSUPP: CInt = 95
public const val EPFNOSUPPORT: CInt = 96
public const val ECONNRESET: CInt = 104
public const val ENOBUFS: CInt = 105
public const val EAFNOSUPPORT: CInt = 106
public const val EPROTOTYPE: CInt = 107
public const val ENOTSOCK: CInt = 108
public const val ENOPROTOOPT: CInt = 109
public const val ECONNREFUSED: CInt = 111
public const val EADDRINUSE: CInt = 112
public const val ECONNABORTED: CInt = 113
public const val ENETUNREACH: CInt = 114
public const val ENETDOWN: CInt = 115
public const val ETIMEDOUT: CInt = 116
public const val EHOSTDOWN: CInt = 117
public const val EHOSTUNREACH: CInt = 118
public const val EINPROGRESS: CInt = 119
public const val EALREADY: CInt = 120
public const val EDESTADDRREQ: CInt = 121
public const val EMSGSIZE: CInt = 122
public const val EPROTONOSUPPORT: CInt = 123
public const val EADDRNOTAVAIL: CInt = 125
public const val ENETRESET: CInt = 126
public const val EISCONN: CInt = 127
public const val ENOTCONN: CInt = 128
public const val ETOOMANYREFS: CInt = 129
public const val EDQUOT: CInt = 132
public const val ESTALE: CInt = 133
public const val ENOTSUP: CInt = 134
public const val EILSEQ: CInt = 138
public const val EOVERFLOW: CInt = 139
public const val ECANCELED: CInt = 140
public const val ENOTRECOVERABLE: CInt = 141
public const val EOWNERDEAD: CInt = 142
public const val EWOULDBLOCK: CInt = 11
public const val F_DUPFD: CInt = 0
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val F_GETOWN: CInt = 5
public const val F_SETOWN: CInt = 6
public const val F_GETLK: CInt = 7
public const val F_SETLK: CInt = 8
public const val F_SETLKW: CInt = 9
public const val F_RGETLK: CInt = 10
public const val F_RSETLK: CInt = 11
public const val F_CNVT: CInt = 12
public const val F_RSETLKW: CInt = 13
public const val F_DUPFD_CLOEXEC: CInt = 14
public const val O_RDONLY: CInt = 0
public const val O_WRONLY: CInt = 1
public const val O_RDWR: CInt = 2
public const val O_APPEND: CInt = 8
public const val O_CREAT: CInt = 512
public const val O_TRUNC: CInt = 1024
public const val O_EXCL: CInt = 2048
public const val O_SYNC: CInt = 8192
public const val O_NONBLOCK: CInt = 16384
public const val O_ACCMODE: CInt = 3
public const val O_CLOEXEC: CInt = 0x40000
public const val O_CLOEXEC: CInt = 0x80000
public const val RTLD_LAZY: CInt = 0x1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val FIOCLEX: CULong = 0x20006601uL
public const val FIONCLEX: CULong = 0x20006602uL
public const val S_BLKSIZE: ModeT = 1024u
public const val S_IREAD: ModeT = 256u
public const val S_IWRITE: ModeT = 128u
public const val S_IEXEC: ModeT = 64u
public const val S_ENFMT: ModeT = 1024u
public const val S_IFMT: ModeT = 61440u
public const val S_IFDIR: ModeT = 16384u
public const val S_IFCHR: ModeT = 8192u
public const val S_IFBLK: ModeT = 24576u
public const val S_IFREG: ModeT = 32768u
public const val S_IFLNK: ModeT = 40960u
public const val S_IFSOCK: ModeT = 49152u
public const val S_IFIFO: ModeT = 4096u
public const val S_IRUSR: ModeT = 256u
public const val S_IWUSR: ModeT = 128u
public const val S_IXUSR: ModeT = 64u
public const val S_IRGRP: ModeT = 32u
public const val S_IWGRP: ModeT = 16u
public const val S_IXGRP: ModeT = 8u
public const val S_IROTH: ModeT = 4u
public const val S_IWOTH: ModeT = 2u
public const val S_IXOTH: ModeT = 1u
public const val SOL_TCP: CInt = 6
public const val PF_UNSPEC: CInt = 0
public const val PF_INET: CInt = 2
public const val PF_INET6: CInt = 10
public const val PF_INET6: CInt = 23
public const val AF_UNSPEC: CInt = 0
public const val AF_INET: CInt = 2
public const val CLOCK_REALTIME: ClockidT = 1
public const val CLOCK_MONOTONIC: ClockidT = 4
public const val CLOCK_BOOTTIME: ClockidT = 4
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val SO_BINTIME: CInt = 0x2000
public const val SO_NO_OFFLOAD: CInt = 0x4000
public const val SO_NO_DDP: CInt = 0x8000
public const val SO_REUSEPORT_LB: CInt = 0x10000
public const val SO_LABEL: CInt = 0x1009
public const val SO_PEERLABEL: CInt = 0x1010
public const val SO_LISTENQLIMIT: CInt = 0x1011
public const val SO_LISTENQLEN: CInt = 0x1012
public const val SO_LISTENINCQLEN: CInt = 0x1013
public const val SO_SETFIB: CInt = 0x1014
public const val SO_USER_COOKIE: CInt = 0x1015
public const val SO_PROTOCOL: CInt = 0x1016
public const val SO_PROTOTYPE: CInt = SO_PROTOCOL
public const val SO_VENDOR: CInt = 0x80000000
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
public const val SO_TIMESTAMP: CInt = 0x0400
public const val SO_NOSIGPIPE: CInt = 0x0800
public const val SO_ACCEPTFILTER: CInt = 0x1000
public const val SO_SNDBUF: CInt = 0x1001
public const val SO_RCVBUF: CInt = 0x1002
public const val SO_SNDLOWAT: CInt = 0x1003
public const val SO_RCVLOWAT: CInt = 0x1004
public const val SO_SNDTIMEO: CInt = 0x1005
public const val SO_RCVTIMEO: CInt = 0x1006
public const val SO_ERROR: CInt = 0x1009
public const val SO_ERROR: CInt = 0x1007
public const val SO_TYPE: CInt = 0x1008
public const val SOCK_CLOEXEC: CInt = O_CLOEXEC
public const val INET_ADDRSTRLEN: CInt = 16
public const val IFF_UP: CInt = 0x1
public const val IFF_BROADCAST: CInt = 0x2
public const val IFF_DEBUG: CInt = 0x4
public const val IFF_LOOPBACK: CInt = 0x8
public const val IFF_POINTOPOINT: CInt = 0x10
public const val IFF_NOTRAILERS: CInt = 0x20
public const val IFF_RUNNING: CInt = 0x40
public const val IFF_NOARP: CInt = 0x80
public const val IFF_PROMISC: CInt = 0x100
public const val IFF_ALLMULTI: CInt = 0x200
public const val IFF_OACTIVE: CInt = 0x400
public const val IFF_SIMPLEX: CInt = 0x800
public const val IFF_LINK0: CInt = 0x1000
public const val IFF_LINK1: CInt = 0x2000
public const val IFF_LINK2: CInt = 0x4000
public const val IFF_ALTPHYS: CInt = IFF_LINK2
public const val IFF_MULTICAST: CInt = 0x8000
public const val TCP_NODELAY: CInt = 1
public const val TCP_MAXSEG: CInt = 2
public const val TCP_NODELAY: CInt = 1
public const val TCP_MAXSEG: CInt = 8194
public const val TCP_NODELAY: CInt = 8193
public const val TCP_MAXSEG: CInt = 8194
public const val TCP_NOPUSH: CInt = 4
public const val TCP_NOOPT: CInt = 8
public const val TCP_KEEPIDLE: CInt = 3
public const val TCP_KEEPINTVL: CInt = 4
public const val TCP_KEEPCNT: CInt = 5
public const val TCP_KEEPIDLE: CInt = 256
public const val TCP_KEEPINTVL: CInt = 512
public const val TCP_KEEPCNT: CInt = 1024
public const val IP_TOS: CInt = 7
public const val IP_TOS: CInt = 1
public const val IP_TOS: CInt = 3
public const val IP_TTL: CInt = 4
public const val IP_TTL: CInt = 2
public const val IP_TTL: CInt = 8
public const val IP_MULTICAST_IF: CInt = 6
public const val IP_MULTICAST_TTL: CInt = 5
public const val IP_MULTICAST_LOOP: CInt = 7
public const val IP_MULTICAST_IF: CInt = 9
public const val IP_MULTICAST_TTL: CInt = 10
public const val IP_MULTICAST_LOOP: CInt = 11
public const val IP_ADD_MEMBERSHIP: CInt = 12
public const val IP_DROP_MEMBERSHIP: CInt = 13
public const val IP_ADD_MEMBERSHIP: CInt = 3
public const val IP_DROP_MEMBERSHIP: CInt = 4
public const val IP_ADD_MEMBERSHIP: CInt = 11
public const val IP_DROP_MEMBERSHIP: CInt = 12
public const val IPV6_UNICAST_HOPS: CInt = 4
public const val IPV6_MULTICAST_IF: CInt = 768
public const val IPV6_MULTICAST_HOPS: CInt = 769
public const val IPV6_MULTICAST_LOOP: CInt = 770
public const val IPV6_MULTICAST_IF: CInt = 9
public const val IPV6_MULTICAST_HOPS: CInt = 10
public const val IPV6_MULTICAST_LOOP: CInt = 11
public const val IPV6_V6ONLY: CInt = 27
public const val IPV6_JOIN_GROUP: CInt = 12
public const val IPV6_LEAVE_GROUP: CInt = 13
public const val IPV6_ADD_MEMBERSHIP: CInt = 12
public const val IPV6_DROP_MEMBERSHIP: CInt = 13
public const val HOST_NOT_FOUND: CInt = 210
public const val NO_DATA: CInt = 211
public const val NO_RECOVERY: CInt = 212
public const val TRY_AGAIN: CInt = 213
public const val HOST_NOT_FOUND: CInt = 1
public const val NO_DATA: CInt = 2
public const val NO_RECOVERY: CInt = 3
public const val TRY_AGAIN: CInt = 4
public const val NO_ADDRESS: CInt = 2
public const val AI_PASSIVE: CInt = 1
public const val AI_CANONNAME: CInt = 2
public const val AI_NUMERICHOST: CInt = 4
public const val AI_NUMERICSERV: CInt = 8
public const val AI_ADDRCONFIG: CInt = 64
public const val AI_NUMERICSERV: CInt = 0
public const val AI_ADDRCONFIG: CInt = 0
public const val NI_MAXHOST: CInt = 1025
public const val NI_MAXSERV: CInt = 32
public const val NI_NOFQDN: CInt = 1
public const val NI_NUMERICHOST: CInt = 2
public const val NI_NAMEREQD: CInt = 4
public const val NI_NUMERICSERV: CInt = 8
public const val NI_DGRAM: CInt = 16
public const val NI_NUMERICSERV: CInt = 0
public const val NI_DGRAM: CInt = 0
public const val EAI_FAMILY: CInt = 204
public const val EAI_MEMORY: CInt = 203
public const val EAI_NONAME: CInt = 200
public const val EAI_SOCKTYPE: CInt = 10
public const val EAI_FAMILY: CInt = -303
public const val EAI_MEMORY: CInt = -304
public const val EAI_NONAME: CInt = -305
public const val EAI_SOCKTYPE: CInt = -307
public const val EXIT_SUCCESS: CInt = 0
public const val EXIT_FAILURE: CInt = 1
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun fDCLR(fd: CInt, set: FdSet?)

public expect fun fDISSET(fd: CInt, set: FdSet?): Boolean

public expect fun fDSET(fd: CInt, set: FdSet?)

public expect fun fDZERO(set: FdSet?)

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUInt)

public expect fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt

public expect fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt

public expect fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt

public expect fun clockGetres(clockId: ClockidT, res: Timespec?): CInt

public expect fun closesocket(sockfd: CInt): CInt

public expect fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt

public expect fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: Sockaddr?, addrLen: SocklenT?): Long

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt

public expect fun memalign(align: ULong, size: ULong): COpaquePointer?

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun semClose(sem: SemT?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT?

public expect fun getgrnam(name: String?): Group?

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt

public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt

public expect fun getgrgid(gid: GidT): Group?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun uname(buf: Utsname?): CInt
