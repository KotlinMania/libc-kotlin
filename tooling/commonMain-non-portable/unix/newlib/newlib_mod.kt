// port-lint: source unix/newlib/newlib_mod.rs
package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CcT
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.Group
import io.github.kotlinmania.libc.InAddrT
import io.github.kotlinmania.libc.Rlimit
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.UidT

public fun interface SigactionSaHandlerCallback {
    public operator fun invoke(arg1: CInt)
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public typealias BlkcntT = Int

public typealias BlksizeT = Int

public typealias ClockidT = CUlong

// supports multicast
public typealias DevT = CShort

public typealias InoT = CUshort

public typealias OffT = CLong

public typealias FsblkcntT = ULong

public typealias FsfilcntT = UInt

public typealias IdT = UInt

public typealias KeyT = CInt

public typealias LoffT = CLonglong

public typealias ModeT = CUint

public typealias NfdsT = UInt

public typealias NlinkT = CUshort

public typealias PthreadT = CUlong

public typealias PthreadKeyT = CUint

public typealias RlimT = UInt

public typealias SaFamilyT = UShort

public typealias SocklenT = UInt

public typealias SpeedT = UInt

public typealias SusecondsT = Int

public typealias TcflagT = UShort

public typealias UsecondsT = UInt

public typealias TimeT = CLonglong

// The order of the `aiAddr` field in this struct is crucial
// for converting between the Rust and C types.
public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    public var aiAddr: Sockaddr?,
    public var aiCanonname: COpaquePointer?,
    public var aiNext: Addrinfo?,
)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class InAddr(public var sAddr: InAddrT)

public open class Lconv(
    public var decimalPoint: COpaquePointer?,
    public var thousandsSep: COpaquePointer?,
    public var grouping: COpaquePointer?,
    public var intCurrSymbol: COpaquePointer?,
    public var currencySymbol: COpaquePointer?,
    public var monDecimalPoint: COpaquePointer?,
    public var monThousandsSep: COpaquePointer?,
    public var monGrouping: COpaquePointer?,
    public var positiveSign: COpaquePointer?,
    public var negativeSign: COpaquePointer?,
    public var intFracDigits: CChar,
    public var fracDigits: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var nSignPosn: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intNSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intPSignPosn: CChar,
)

public open class Tm(
    public var tmSec: CInt,
    public var tmMin: CInt,
    public var tmHour: CInt,
    public var tmMday: CInt,
    public var tmMon: CInt,
    public var tmYear: CInt,
    public var tmWday: CInt,
    public var tmYday: CInt,
    public var tmIsdst: CInt,
)

public open class Statvfs(
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
)

public open class Sigaction(
    public var saHandler: SigactionSaHandlerCallback,
    public var saMask: SigsetT,
    public var saFlags: CInt,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: Int,
)

public open class FdSet(
    // Unverified
    public var fdsBits: List<CUlong>,
)

public open class Passwd(
    // Unverified
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class Termios(
    // Unverified
    public var cIflag: io.github.kotlinmania.libc.TcflagT,
    public var cOflag: io.github.kotlinmania.libc.TcflagT,
    public var cCflag: io.github.kotlinmania.libc.TcflagT,
    public var cLflag: io.github.kotlinmania.libc.TcflagT,
    public var cLine: CcT,
    public var cCc: List<CcT>,
    public var cIspeed: UInt,
    public var cOspeed: UInt,
)

public open class SemT(
    // Unverified
    public var size: List<CChar>,
)

public open class DlInfo(
    // Unverified
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class Utsname(
    // Unverified
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
    public var domainname: List<CChar>,
)

public open class CpuSetT(
    // Unverified
    public var bits: List<UInt>,
)

public open class PthreadAttrT(
    // Unverified
    public var size: List<UByte>,
    public var isInitialized: Int,
    public var stackaddr: COpaquePointer?,
    public var stacksize: Int,
    public var contentionscope: Int,
    public var inheritsched: Int,
    public var schedpolicy: Int,
    public var schedparam: Int,
    public var detachstate: Int,
)

public open class PthreadRwlockattrT(
    // Unverified
    public var size: List<UByte>,
)

public open class PthreadMutexT(
    // Unverified
    public var size: List<UByte>,
)

public open class PthreadRwlockT(
    // Unverified
    public var size: List<UByte>,
)

public open class PthreadMutexattrT(
    // Unverified
    public var size: List<UByte>,
)

public open class PthreadCondT(
    // Unverified
    public var size: List<UByte>,
)

public open class PthreadCondattrT(
    // Unverified
    public var size: List<UByte>,
)

// unverified constants
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(size = List(SIZEOF_PTHREAD_MUTEX_T) { PTHREAD_INITIALIZER_BYTE })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(size = List(SIZEOF_PTHREAD_COND_T) { PTHREAD_INITIALIZER_BYTE })

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(size = List(SIZEOF_PTHREAD_RWLOCK_T) { PTHREAD_INITIALIZER_BYTE })

public val NCCS: Int = 11

public val NCCS1: Int = 32

public val PTHREAD_INITIALIZER_BYTE: UByte = 0xffu

public val SIZEOF_PTHREAD_ATTR_T: Int = 32

public val SIZEOF_PTHREAD_MUTEX_T: Int = 4

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 12

public val SIZEOF_PTHREAD_COND_T: Int = 4

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 8

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 12

public val SIZEOF_PTHREAD_BARRIER_T: Int = 32

public val PTHREAD_INITIALIZER_BYTE1: UByte = 0xffu

public val SIZEOF_PTHREAD_ATTR_T1: Int = 4

public val SIZEOF_PTHREAD_MUTEX_T1: Int = 4

public val SIZEOF_PTHREAD_MUTEXATTR_T1: Int = 4

public val SIZEOF_PTHREAD_COND_T1: Int = 4

public val SIZEOF_PTHREAD_CONDATTR_T1: Int = 4

public val SIZEOF_PTHREAD_RWLOCK_T1: Int = 4

public val SIZEOF_PTHREAD_RWLOCKATTR_T1: Int = 4

public val SIZEOF_PTHREAD_BARRIER_T1: Int = 4

public val PTHREAD_INITIALIZER_BYTE2: UByte = 0x00u

public val SIZEOF_PTHREAD_ATTR_T2: Int = 96

public val SIZEOF_PTHREAD_MUTEX_T2: Int = 64

public val SIZEOF_PTHREAD_MUTEXATTR_T2: Int = 24

public val SIZEOF_PTHREAD_COND_T2: Int = 28

public val SIZEOF_PTHREAD_CONDATTR_T2: Int = 24

public val SIZEOF_PTHREAD_RWLOCK_T2: Int = 32

public val SIZEOF_PTHREAD_RWLOCKATTR_T2: Int = 8

public val SIZEOF_PTHREAD_BARRIER_T2: Int = 32

public val PTHREAD_INITIALIZER_BYTE3: UByte = 0u

public val SIZEOF_PTHREAD_ATTR_T3: Int = 56

public val SIZEOF_PTHREAD_MUTEX_T3: Int = 40

public val SIZEOF_PTHREAD_MUTEXATTR_T3: Int = 4

public val SIZEOF_PTHREAD_COND_T3: Int = 48

public val SIZEOF_PTHREAD_CONDATTR_T3: Int = 4

public val SIZEOF_PTHREAD_RWLOCK_T3: Int = 56

public val SIZEOF_PTHREAD_RWLOCKATTR_T3: Int = 8

public val SIZEOF_PTHREAD_BARRIER_T3: Int = 32

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val PTHREAD_MUTEX_HAVE_PREV: Int = 1

public val PTHREAD_RWLOCK_INT_FLAGS_SHARED: Int = 1

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val FD_SETSIZE: Int = 64

public val FD_SETSIZE1: Int = 256

public val FD_SETSIZE2: Int = 1024

// intentionally not public, only used for fdSet
public val ULONG_SIZE: Int = 32

// Other constants
public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val ENOMSG: CInt = 35

public val EIDRM: CInt = 36

public val EDEADLK: CInt = 45

public val ENOLCK: CInt = 46

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENOLINK: CInt = 67

public val EPROTO: CInt = 71

public val EMULTIHOP: CInt = 74

public val EBADMSG: CInt = 77

public val EFTYPE: CInt = 79

public val ENOSYS: CInt = 88

public val ENOTEMPTY: CInt = 90

public val ENAMETOOLONG: CInt = 91

public val ELOOP: CInt = 92

public val EOPNOTSUPP: CInt = 95

public val EPFNOSUPPORT: CInt = 96

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EAFNOSUPPORT: CInt = 106

public val EPROTOTYPE: CInt = 107

public val ENOTSOCK: CInt = 108

public val ENOPROTOOPT: CInt = 109

public val ECONNREFUSED: CInt = 111

public val EADDRINUSE: CInt = 112

public val ECONNABORTED: CInt = 113

public val ENETUNREACH: CInt = 114

public val ENETDOWN: CInt = 115

public val ETIMEDOUT: CInt = 116

public val EHOSTDOWN: CInt = 117

public val EHOSTUNREACH: CInt = 118

public val EINPROGRESS: CInt = 119

public val EALREADY: CInt = 120

public val EDESTADDRREQ: CInt = 121

public val EMSGSIZE: CInt = 122

public val EPROTONOSUPPORT: CInt = 123

public val EADDRNOTAVAIL: CInt = 125

public val ENETRESET: CInt = 126

public val EISCONN: CInt = 127

public val ENOTCONN: CInt = 128

public val ETOOMANYREFS: CInt = 129

public val EDQUOT: CInt = 132

public val ESTALE: CInt = 133

public val ENOTSUP: CInt = 134

public val EILSEQ: CInt = 138

public val EOVERFLOW: CInt = 139

public val ECANCELED: CInt = 140

public val ENOTRECOVERABLE: CInt = 141

public val EOWNERDEAD: CInt = 142

public val EWOULDBLOCK: CInt = 11

public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETOWN: CInt = 5

public val F_SETOWN: CInt = 6

public val F_GETLK: CInt = 7

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val F_RGETLK: CInt = 10

public val F_RSETLK: CInt = 11

public val F_CNVT: CInt = 12

public val F_RSETLKW: CInt = 13

public val F_DUPFD_CLOEXEC: CInt = 14

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val O_APPEND: CInt = 8

public val O_CREAT: CInt = 512

public val O_TRUNC: CInt = 1024

public val O_EXCL: CInt = 2048

public val O_SYNC: CInt = 8192

public val O_NONBLOCK: CInt = 16384

public val O_ACCMODE: CInt = 3

public val O_CLOEXEC: CInt = 0x40000

public val O_CLOEXEC1: CInt = 0x80000

public val RTLD_LAZY: CInt = 0x1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val FIOCLEX: CUlong = 0x20006601uL

public val FIONCLEX: CUlong = 0x20006602uL

public val S_BLKSIZE: ModeT = 1024u

public val S_IREAD: ModeT = 256u

public val S_IWRITE: ModeT = 128u

public val S_IEXEC: ModeT = 64u

public val S_ENFMT: ModeT = 1024u

public val S_IFMT: ModeT = 61440u

public val S_IFDIR: ModeT = 16384u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFIFO: ModeT = 4096u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public val SOL_TCP: CInt = 6

public val PF_UNSPEC: CInt = 0

public val PF_INET: CInt = 2

public val PF_INET6: CInt = 10

public val PF_INET61: CInt = 23

public val AF_UNSPEC: CInt = 0

public val AF_INET: CInt = 2

public val CLOCK_REALTIME: io.github.kotlinmania.libc.ClockidT = 1uL

public val CLOCK_MONOTONIC: io.github.kotlinmania.libc.ClockidT = 4uL

public val CLOCK_BOOTTIME: io.github.kotlinmania.libc.ClockidT = 4uL

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val SO_BINTIME: CInt = 0x2000

public val SO_NO_OFFLOAD: CInt = 0x4000

public val SO_NO_DDP: CInt = 0x8000

public val SO_REUSEPORT_LB: CInt = 0x10000

public val SO_LABEL: CInt = 0x1009

public val SO_PEERLABEL: CInt = 0x1010

public val SO_LISTENQLIMIT: CInt = 0x1011

public val SO_LISTENQLEN: CInt = 0x1012

public val SO_LISTENINCQLEN: CInt = 0x1013

public val SO_SETFIB: CInt = 0x1014

public val SO_USER_COOKIE: CInt = 0x1015

public val SO_PROTOCOL: CInt = 0x1016

public val SO_PROTOTYPE: CInt = SO_PROTOCOL

public val SO_VENDOR: CInt = 0x80000000

public val SO_DEBUG: CInt = 0x01

public val SO_ACCEPTCONN: CInt = 0x0002

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_OOBINLINE: CInt = 0x0100

public val SO_REUSEPORT: CInt = 0x0200

public val SO_TIMESTAMP: CInt = 0x0400

public val SO_NOSIGPIPE: CInt = 0x0800

public val SO_ACCEPTFILTER: CInt = 0x1000

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1009

public val SO_ERROR1: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SOCK_CLOEXEC: CInt = O_CLOEXEC

public val INET_ADDRSTRLEN: CInt = 16

// https://github.com/bminor/newlib/blob/HEAD/newlib/libc/sys/linux/include/net/if.h#L121
public val IFF_UP: CInt = 0x1

// interface is up
public val IFF_BROADCAST: CInt = 0x2

// broadcast address valid
public val IFF_DEBUG: CInt = 0x4

// turn on debugging
public val IFF_LOOPBACK: CInt = 0x8

// is a loopback net
public val IFF_POINTOPOINT: CInt = 0x10

// interface is point-to-point link
public val IFF_NOTRAILERS: CInt = 0x20

// avoid use of trailers
public val IFF_RUNNING: CInt = 0x40

// resources allocated
public val IFF_NOARP: CInt = 0x80

// no address resolution protocol
public val IFF_PROMISC: CInt = 0x100

// receive all packets
public val IFF_ALLMULTI: CInt = 0x200

// receive all multicast packets
public val IFF_OACTIVE: CInt = 0x400

// transmission in progress
public val IFF_SIMPLEX: CInt = 0x800

// can't hear own transmissions
public val IFF_LINK0: CInt = 0x1000

// per link layer defined bit
public val IFF_LINK1: CInt = 0x2000

// per link layer defined bit
public val IFF_LINK2: CInt = 0x4000

// per link layer defined bit
public val IFF_ALTPHYS: CInt = IFF_LINK2

// use alternate physical connection
public val IFF_MULTICAST: CInt = 0x8000

public val TCP_NODELAY: CInt = 1

public val TCP_MAXSEG: CInt = 2

public val TCP_NODELAY1: CInt = 1

public val TCP_MAXSEG1: CInt = 8194

public val TCP_NODELAY2: CInt = 8193

public val TCP_MAXSEG2: CInt = 8194

public val TCP_NOPUSH: CInt = 4

public val TCP_NOOPT: CInt = 8

public val TCP_KEEPIDLE: CInt = 3

public val TCP_KEEPINTVL: CInt = 4

public val TCP_KEEPCNT: CInt = 5

public val TCP_KEEPIDLE1: CInt = 256

public val TCP_KEEPINTVL1: CInt = 512

public val TCP_KEEPCNT1: CInt = 1024

public val IP_TOS: CInt = 7

public val IP_TOS1: CInt = 1

public val IP_TOS2: CInt = 3

public val IP_TTL: CInt = 4

public val IP_TTL1: CInt = 2

public val IP_TTL2: CInt = 8

public val IP_MULTICAST_IF: CInt = 6

public val IP_MULTICAST_TTL: CInt = 5

public val IP_MULTICAST_LOOP: CInt = 7

public val IP_MULTICAST_IF1: CInt = 9

public val IP_MULTICAST_TTL1: CInt = 10

public val IP_MULTICAST_LOOP1: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IP_ADD_MEMBERSHIP1: CInt = 3

public val IP_DROP_MEMBERSHIP1: CInt = 4

public val IP_ADD_MEMBERSHIP2: CInt = 11

public val IP_DROP_MEMBERSHIP2: CInt = 12

public val IPV6_UNICAST_HOPS: CInt = 4

public val IPV6_MULTICAST_IF: CInt = 768

public val IPV6_MULTICAST_HOPS: CInt = 769

public val IPV6_MULTICAST_LOOP: CInt = 770

public val IPV6_MULTICAST_IF1: CInt = 9

public val IPV6_MULTICAST_HOPS1: CInt = 10

public val IPV6_MULTICAST_LOOP1: CInt = 11

public val IPV6_V6ONLY: CInt = 27

public val IPV6_JOIN_GROUP: CInt = 12

public val IPV6_LEAVE_GROUP: CInt = 13

public val IPV6_ADD_MEMBERSHIP: CInt = 12

public val IPV6_DROP_MEMBERSHIP: CInt = 13

public val HOST_NOT_FOUND: CInt = 210

public val NO_DATA: CInt = 211

public val NO_RECOVERY: CInt = 212

public val TRY_AGAIN: CInt = 213

public val HOST_NOT_FOUND1: CInt = 1

public val NO_DATA1: CInt = 2

public val NO_RECOVERY1: CInt = 3

public val TRY_AGAIN1: CInt = 4

public val NO_ADDRESS: CInt = 2

public val AI_PASSIVE: CInt = 1

public val AI_CANONNAME: CInt = 2

public val AI_NUMERICHOST: CInt = 4

public val AI_NUMERICSERV: CInt = 8

public val AI_ADDRCONFIG: CInt = 64

public val AI_NUMERICSERV1: CInt = 0

public val AI_ADDRCONFIG1: CInt = 0

public val NI_MAXHOST: CInt = 1025

public val NI_MAXSERV: CInt = 32

public val NI_NOFQDN: CInt = 1

public val NI_NUMERICHOST: CInt = 2

public val NI_NAMEREQD: CInt = 4

public val NI_NUMERICSERV: CInt = 8

public val NI_DGRAM: CInt = 16

public val NI_NUMERICSERV1: CInt = 0

public val NI_DGRAM1: CInt = 0

public val EAI_FAMILY: CInt = 204

public val EAI_MEMORY: CInt = 203

public val EAI_NONAME: CInt = 200

public val EAI_SOCKTYPE: CInt = 10

public val EAI_FAMILY1: CInt = -303

public val EAI_MEMORY1: CInt = -304

public val EAI_NONAME1: CInt = -305

public val EAI_SOCKTYPE1: CInt = -307

public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public fun fdClr(fd: CInt, set: FdSet?) {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    set!!.fdsBits[fd1 / bits] = set!!.fdsBits[fd1 / bits] and (1 shl (fd1 % bits)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    return (set!!.fdsBits[fd1 / bits] and (1 shl (fd1 % bits))) != 0
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    set!!.fdsBits[fd1 / bits] = set!!.fdsBits[fd1 / bits] or (1 shl (fd1 % bits))
    return
}

public fun fdZero(set: FdSet?) {
    for (slot in set!!.fdsBits.iterMut()) {
        slot = 0
    }
}

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt

public expect fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun clockGettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun clockGetres(clockId: io.github.kotlinmania.libc.ClockidT, res: Timespec?): CInt

public expect fun closesocket(sockfd: CInt): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: Sockaddr?, addrLen: UInt?): Long

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun semClose(sem: SemT?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): SemT?

public expect fun getgrnam(name: String?): Group?

public expect fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): Group?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt
