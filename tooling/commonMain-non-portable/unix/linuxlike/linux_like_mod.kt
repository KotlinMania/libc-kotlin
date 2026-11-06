// port-lint: source unix/linux_like/linux_like_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.Cmsghdr
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.Dirent64
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.IFF_TAP
import io.github.kotlinmania.libc.IFF_TUN
import io.github.kotlinmania.libc.IPTOS_ECN_MASK
import io.github.kotlinmania.libc.In6Addr
import io.github.kotlinmania.libc.InAddrT
import io.github.kotlinmania.libc.InPortT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.Itimerval
import io.github.kotlinmania.libc.LocaleT
import io.github.kotlinmania.libc.Msghdr
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.Rlim64T
import io.github.kotlinmania.libc.Rusage
import io.github.kotlinmania.libc.S32
import io.github.kotlinmania.libc.S64
import io.github.kotlinmania.libc.SiginfoT
import io.github.kotlinmania.libc.Sigval
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.U16
import io.github.kotlinmania.libc.U32
import io.github.kotlinmania.libc.U64
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.Winsize

public typealias SaFamilyT = UShort

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias ClockidT = CInt

public typealias TimerT = COpaquePointer?

public typealias UsecondsT = UInt

public typealias KeyT = CInt

public typealias IdT = CUint

// intentionally not public, only used for fdSet
// https://github.com/search?q=repo%3Atorvalds%2Flinux+%22%23define+_IOC_NONE%22&type=code
// LFS64 extensions
//
// * musl and Emscripten has 64-bit versions only so aliases the LFS64 symbols to the standard ones
// * ulibc doesn't have preadv64/pwritev64
// The statx syscall, available on some libcs.
public sealed class Timezone {
}

public open class InAddr(public var sAddr: InAddrT)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class IpMreqn(
    public var imrMultiaddr: InAddr,
    public var imrAddress: InAddr,
    public var imrIfindex: CInt,
)

public open class IpMreqSource(
    public var imrMultiaddr: InAddr,
    public var imrInterface: InAddr,
    public var imrSourceaddr: InAddr,
)

public open class Sockaddr(public var saFamily: SaFamilyT, public var saData: List<CChar>)

public open class SockaddrIn(
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: io.github.kotlinmania.libc.InAddr,
    public var sinZero: List<UByte>,
)

public open class SockaddrIn6(
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

// The order of the `aiAddr` field in this struct is crucial
// for converting between the Rust and C types.
public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    public var aiAddr: io.github.kotlinmania.libc.Sockaddr?,
    public var aiCanonname: COpaquePointer?,
    public var aiNext: Addrinfo?,
)

public open class SockaddrLl(
    public var sllFamily: CUshort,
    public var sllProtocol: CUshort,
    public var sllIfindex: CInt,
    public var sllHatype: CUshort,
    public var sllPkttype: CUchar,
    public var sllHalen: CUchar,
    public var sllAddr: List<CUchar>,
)

public open class FdSet(public var fdsBits: List<CUlong>)

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
    public var tmGmtoff: CLong,
    public var tmZone: COpaquePointer?,
)

public open class SchedParam(public var schedPriority: CInt)

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

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
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var intNSignPosn: CChar,
)

public open class InPktinfo(
    public var ipiIfindex: CInt,
    public var ipiSpecDst: io.github.kotlinmania.libc.InAddr,
    public var ipiAddr: io.github.kotlinmania.libc.InAddr,
)

public open class Ifaddrs(
    public var ifaNext: Ifaddrs?,
    public var ifaName: COpaquePointer?,
    public var ifaFlags: CUint,
    public var ifaAddr: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaNetmask: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaIfu: io.github.kotlinmania.libc.Sockaddr?,
    // Note(union) This should be a union
    public var ifaData: COpaquePointer?,
)

public open class In6Rtmsg(
    public var rtmsgDst: In6Addr,
    public var rtmsgSrc: In6Addr,
    public var rtmsgGateway: In6Addr,
    public var rtmsgType: UInt,
    public var rtmsgDstLen: UShort,
    public var rtmsgSrcLen: UShort,
    public var rtmsgMetric: UInt,
    public var rtmsgInfo: CUlong,
    public var rtmsgFlags: UInt,
    public var rtmsgIfindex: CInt,
)

public open class Arpreq(
    public var arpPa: io.github.kotlinmania.libc.Sockaddr,
    public var arpHa: io.github.kotlinmania.libc.Sockaddr,
    public var arpFlags: CInt,
    public var arpNetmask: io.github.kotlinmania.libc.Sockaddr,
    public var arpDev: List<CChar>,
)

public open class ArpreqOld(
    public var arpPa: io.github.kotlinmania.libc.Sockaddr,
    public var arpHa: io.github.kotlinmania.libc.Sockaddr,
    public var arpFlags: CInt,
    public var arpNetmask: io.github.kotlinmania.libc.Sockaddr,
)

public open class Arphdr(
    public var arHrd: UShort,
    public var arPro: UShort,
    public var arHln: UByte,
    public var arPln: UByte,
    public var arOp: UShort,
)

public open class Mmsghdr(public var msgHdr: Msghdr, public var msgLen: CUint)

public open class SockaddrUn(public var sunFamily: SaFamilyT, public var sunPath: List<CChar>)

public open class SockaddrStorage(
    public var ssFamily: SaFamilyT,
    public var ssPad2: List<UByte>,
    public var ssAlign: SizeT,
)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
    public var domainname: List<CChar>,
)

public open class IfNameindex(public var ifIndex: CUint, public var ifName: COpaquePointer?)

public open class FileCloneRange(
    public var srcFd: S64,
    public var srcOffset: U64,
    public var srcLength: U64,
    public var destOffset: U64,
)

// linux/filter.h
public open class SockFilter(
    public var code: U16,
    public var jt: U8,
    public var jf: U8,
    public var k: U32,
)

public open class SockFprog(public var len: CUshort, public var filter: SockFilter?)

public open class Statx(
    public var stxMask: U32,
    public var stxBlksize: U32,
    public var stxAttributes: U64,
    public var stxNlink: U32,
    public var stxUid: U32,
    public var stxGid: U32,
    public var stxMode: U16,
    public var statxPad1: List<U16>,
    public var stxIno: U64,
    public var stxSize: U64,
    public var stxBlocks: U64,
    public var stxAttributesMask: U64,
    public var stxAtime: StatxTimestamp,
    public var stxBtime: StatxTimestamp,
    public var stxCtime: StatxTimestamp,
    public var stxMtime: StatxTimestamp,
    public var stxRdevMajor: U32,
    public var stxRdevMinor: U32,
    public var stxDevMajor: U32,
    public var stxDevMinor: U32,
    public var stxMntId: U64,
    public var stxDioMemAlign: U32,
    public var stxDioOffsetAlign: U32,
    public var statxPad3: List<U64>,
)

public open class StatxTimestamp(
    public var tvSec: S64,
    public var tvNsec: U32,
    public var statxTimestampPad1: List<S32>,
)

public open class EpollEvent(public var events: UInt, public var u64: ULong) {
    public open fun eq(other: EpollEvent): Boolean {
        return this.events == other.events && this.u64 == other.u64
    }

    public override fun hashCode(): Int {
        var state = 0
        val events = this.events
        val u64 = this.u64
        state = 31 * state + (events).hashCode()
        state = 31 * state + (u64).hashCode()
        return state
    }
}

public open class Sigevent(
    public var sigevValue: Sigval,
    public var sigevSigno: CInt,
    public var sigevNotify: CInt,
    // Actually a union.  We only expose sigevNotifyThreadId because it's
    // the most useful member
    public var sigevNotifyThreadId: CInt,
    public var unused1: List<CInt>,
) {
    public open fun eq(other: Sigevent): Boolean {
        return this.sigevValue == other.sigevValue && this.sigevSigno == other.sigevSigno && this.sigevNotify == other.sigevNotify && this.sigevNotifyThreadId == other.sigevNotifyThreadId
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.sigevValue).hashCode()
        state = 31 * state + (this.sigevSigno).hashCode()
        state = 31 * state + (this.sigevNotify).hashCode()
        state = 31 * state + (this.sigevNotifyThreadId).hashCode()
        return state
    }
}

public val ULONG_SIZE: Int = 64

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 2147483647

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val IOFBF: CInt = 0

public val IONBF: CInt = 2

public val IOLBF: CInt = 1

public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

// Linux-specific fcntls
public val F_SETLEASE: CInt = 1024

public val F_GETLEASE: CInt = 1025

public val F_NOTIFY: CInt = 1026

public val F_CANCELLK: CInt = 1029

public val F_DUPFD_CLOEXEC: CInt = 1030

public val F_SETPIPE_SZ: CInt = 1031

public val F_GETPIPE_SZ: CInt = 1032

public val F_ADD_SEALS: CInt = 1033

public val F_GET_SEALS: CInt = 1034

public val F_SEAL_SEAL: CInt = 0x0001

public val F_SEAL_SHRINK: CInt = 0x0002

public val F_SEAL_GROW: CInt = 0x0004

public val F_SEAL_WRITE: CInt = 0x0008

// Note(#235): Include file sealing fcntls once we have a way to verify them.
public val SIGTRAP: CInt = 5

public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_CREATE_DETACHED: CInt = 1

public val CLOCK_REALTIME: io.github.kotlinmania.libc.ClockidT = 0

public val CLOCK_MONOTONIC: io.github.kotlinmania.libc.ClockidT = 1

public val CLOCK_PROCESS_CPUTIME_ID: io.github.kotlinmania.libc.ClockidT = 2

public val CLOCK_THREAD_CPUTIME_ID: io.github.kotlinmania.libc.ClockidT = 3

public val CLOCK_MONOTONIC_RAW: io.github.kotlinmania.libc.ClockidT = 4

public val CLOCK_REALTIME_COARSE: io.github.kotlinmania.libc.ClockidT = 5

public val CLOCK_MONOTONIC_COARSE: io.github.kotlinmania.libc.ClockidT = 6

public val CLOCK_BOOTTIME: io.github.kotlinmania.libc.ClockidT = 7

public val CLOCK_REALTIME_ALARM: io.github.kotlinmania.libc.ClockidT = 8

public val CLOCK_BOOTTIME_ALARM: io.github.kotlinmania.libc.ClockidT = 9

public val CLOCK_TAI: io.github.kotlinmania.libc.ClockidT = 11

public val TIMER_ABSTIME: CInt = 1

public val RUSAGE_SELF: CInt = 0

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val SOCK_CLOEXEC: CInt = O_CLOEXEC

public val S_IFIFO: ModeT = 4096u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFMT: ModeT = 61440u

public val S_IRWXU: ModeT = 448u

public val S_IXUSR: ModeT = 64u

public val S_IWUSR: ModeT = 128u

public val S_IRUSR: ModeT = 256u

public val S_IRWXG: ModeT = 56u

public val S_IXGRP: ModeT = 8u

public val S_IWGRP: ModeT = 16u

public val S_IRGRP: ModeT = 32u

public val S_IRWXO: ModeT = 7u

public val S_IXOTH: ModeT = 1u

public val S_IWOTH: ModeT = 2u

public val S_IROTH: ModeT = 4u

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGABRT: CInt = 6

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGSEGV: CInt = 11

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val XATTR_CREATE: CInt = 0x1

public val XATTR_REPLACE: CInt = 0x2

public val RLIM64_INFINITY: CUlonglong = 0uL.inv()

public val RLIM64_INFINITY1: Rlim64T = 0.inv()

public val LC_CTYPE: CInt = 0

public val LC_NUMERIC: CInt = 1

public val LC_TIME: CInt = 2

public val LC_COLLATE: CInt = 3

public val LC_MONETARY: CInt = 4

public val LC_MESSAGES: CInt = 5

public val LC_PAPER: CInt = 6

public val LC_NAME: CInt = 7

public val LC_ADDRESS: CInt = 8

public val LC_TELEPHONE: CInt = 9

public val LC_MEASUREMENT: CInt = 10

public val LC_IDENTIFICATION: CInt = 11

public val LC_ALL: CInt = 12

public val LC_CTYPE1: CInt = 0

public val LC_NUMERIC1: CInt = 1

public val LC_TIME1: CInt = 2

public val LC_COLLATE1: CInt = 3

public val LC_MONETARY1: CInt = 4

public val LC_MESSAGES1: CInt = 5

public val LC_ALL1: CInt = 6

public val LC_CTYPE_MASK: CInt = 1 shl LC_CTYPE

public val LC_NUMERIC_MASK: CInt = 1 shl LC_NUMERIC

public val LC_TIME_MASK: CInt = 1 shl LC_TIME

public val LC_COLLATE_MASK: CInt = 1 shl LC_COLLATE

public val LC_MONETARY_MASK: CInt = 1 shl LC_MONETARY

public val LC_MESSAGES_MASK: CInt = 1 shl LC_MESSAGES

// LC_ALL_MASK defined per platform
public val MAP_FILE: CInt = 0x0000

public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_FIXED: CInt = 0x0010

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

// MS_ flags for msync(2)
public val MS_ASYNC: CInt = 0x0001

public val MS_INVALIDATE: CInt = 0x0002

public val MS_SYNC: CInt = 0x0004

// MS_ flags for mount(2)
public val MS_RDONLY: CUlong = 0x01uL

public val MS_NOSUID: CUlong = 0x02uL

public val MS_NODEV: CUlong = 0x04uL

public val MS_NOEXEC: CUlong = 0x08uL

public val MS_SYNCHRONOUS: CUlong = 0x10uL

public val MS_REMOUNT: CUlong = 0x20uL

public val MS_MANDLOCK: CUlong = 0x40uL

public val MS_DIRSYNC: CUlong = 0x80uL

public val MS_NOSYMFOLLOW: CUlong = 0x100uL

public val MS_NOATIME: CUlong = 0x0400uL

public val MS_NODIRATIME: CUlong = 0x0800uL

public val MS_BIND: CUlong = 0x1000uL

public val MS_MOVE: CUlong = 0x2000uL

public val MS_REC: CUlong = 0x4000uL

public val MS_SILENT: CUlong = 0x8000uL

public val MS_POSIXACL: CUlong = 0x010000uL

public val MS_UNBINDABLE: CUlong = 0x020000uL

public val MS_PRIVATE: CUlong = 0x040000uL

public val MS_SLAVE: CUlong = 0x080000uL

public val MS_SHARED: CUlong = 0x100000uL

public val MS_RELATIME: CUlong = 0x200000uL

public val MS_KERNMOUNT: CUlong = 0x400000uL

public val MS_I_VERSION: CUlong = 0x800000uL

public val MS_STRICTATIME: CUlong = 0x1000000uL

public val MS_LAZYTIME: CUlong = 0x2000000uL

public val MS_ACTIVE: CUlong = 0x40000000uL

public val MS_MGC_VAL: CUlong = 0xc0ed0000uL

public val MS_MGC_MSK: CUlong = 0xffff0000uL

public val SCM_RIGHTS: CInt = 0x01

public val SCM_CREDENTIALS: CInt = 0x02

public val PROT_GROWSDOWN: CInt = 0x1000000

public val PROT_GROWSUP: CInt = 0x2000000

public val MAP_TYPE: CInt = 0x000f

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val MADV_FREE: CInt = 8

public val MADV_REMOVE: CInt = 9

public val MADV_DONTFORK: CInt = 10

public val MADV_DOFORK: CInt = 11

public val MADV_MERGEABLE: CInt = 12

public val MADV_UNMERGEABLE: CInt = 13

public val MADV_HUGEPAGE: CInt = 14

public val MADV_NOHUGEPAGE: CInt = 15

public val MADV_DONTDUMP: CInt = 16

public val MADV_DODUMP: CInt = 17

public val MADV_WIPEONFORK: CInt = 18

public val MADV_KEEPONFORK: CInt = 19

public val MADV_COLD: CInt = 20

public val MADV_PAGEOUT: CInt = 21

public val MADV_HWPOISON: CInt = 100

public val MADV_POPULATE_READ: CInt = 22

public val MADV_POPULATE_WRITE: CInt = 23

public val MADV_DONTNEED_LOCKED: CInt = 24

public val IFF_UP: CInt = 0x1

public val IFF_BROADCAST: CInt = 0x2

public val IFF_DEBUG: CInt = 0x4

public val IFF_LOOPBACK: CInt = 0x8

public val IFF_POINTOPOINT: CInt = 0x10

public val IFF_NOTRAILERS: CInt = 0x20

public val IFF_RUNNING: CInt = 0x40

public val IFF_NOARP: CInt = 0x80

public val IFF_PROMISC: CInt = 0x100

public val IFF_ALLMULTI: CInt = 0x200

public val IFF_MASTER: CInt = 0x400

public val IFF_SLAVE: CInt = 0x800

public val IFF_MULTICAST: CInt = 0x1000

public val IFF_PORTSEL: CInt = 0x2000

public val IFF_AUTOMEDIA: CInt = 0x4000

public val IFF_DYNAMIC: CInt = 0x8000

public val SOL_IP: CInt = 0

public val SOL_TCP: CInt = 6

public val SOL_UDP: CInt = 17

public val SOL_IPV6: CInt = 41

public val SOL_ICMPV6: CInt = 58

public val SOL_RAW: CInt = 255

public val SOL_DECNET: CInt = 261

public val SOL_X25: CInt = 262

public val SOL_PACKET: CInt = 263

public val SOL_ATM: CInt = 264

public val SOL_AAL: CInt = 265

public val SOL_IRDA: CInt = 266

public val SOL_NETBEUI: CInt = 267

public val SOL_LLC: CInt = 268

public val SOL_DCCP: CInt = 269

public val SOL_NETLINK: CInt = 270

public val SOL_TIPC: CInt = 271

public val SOL_BLUETOOTH: CInt = 274

public val SOL_ALG: CInt = 279

public val AF_UNSPEC: CInt = 0

public val AF_UNIX: CInt = 1

public val AF_LOCAL: CInt = 1

public val AF_INET: CInt = 2

public val AF_AX25: CInt = 3

public val AF_IPX: CInt = 4

public val AF_APPLETALK: CInt = 5

public val AF_NETROM: CInt = 6

public val AF_BRIDGE: CInt = 7

public val AF_ATMPVC: CInt = 8

public val AF_X25: CInt = 9

public val AF_INET6: CInt = 10

public val AF_ROSE: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_NETBEUI: CInt = 13

public val AF_SECURITY: CInt = 14

public val AF_KEY: CInt = 15

public val AF_NETLINK: CInt = 16

public val AF_ROUTE: CInt = AF_NETLINK

public val AF_PACKET: CInt = 17

public val AF_ASH: CInt = 18

public val AF_ECONET: CInt = 19

public val AF_ATMSVC: CInt = 20

public val AF_RDS: CInt = 21

public val AF_SNA: CInt = 22

public val AF_IRDA: CInt = 23

public val AF_PPPOX: CInt = 24

public val AF_WANPIPE: CInt = 25

public val AF_LLC: CInt = 26

public val AF_CAN: CInt = 29

public val AF_TIPC: CInt = 30

public val AF_BLUETOOTH: CInt = 31

public val AF_IUCV: CInt = 32

public val AF_RXRPC: CInt = 33

public val AF_ISDN: CInt = 34

public val AF_PHONET: CInt = 35

public val AF_IEEE802154: CInt = 36

public val AF_CAIF: CInt = 37

public val AF_ALG: CInt = 38

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_UNIX: CInt = AF_UNIX

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_INET: CInt = AF_INET

public val PF_AX25: CInt = AF_AX25

public val PF_IPX: CInt = AF_IPX

public val PF_APPLETALK: CInt = AF_APPLETALK

public val PF_NETROM: CInt = AF_NETROM

public val PF_BRIDGE: CInt = AF_BRIDGE

public val PF_ATMPVC: CInt = AF_ATMPVC

public val PF_X25: CInt = AF_X25

public val PF_INET6: CInt = AF_INET6

public val PF_ROSE: CInt = AF_ROSE

public val PF_DE_CNET: CInt = AF_DE_CNET

public val PF_NETBEUI: CInt = AF_NETBEUI

public val PF_SECURITY: CInt = AF_SECURITY

public val PF_KEY: CInt = AF_KEY

public val PF_NETLINK: CInt = AF_NETLINK

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_PACKET: CInt = AF_PACKET

public val PF_ASH: CInt = AF_ASH

public val PF_ECONET: CInt = AF_ECONET

public val PF_ATMSVC: CInt = AF_ATMSVC

public val PF_RDS: CInt = AF_RDS

public val PF_SNA: CInt = AF_SNA

public val PF_IRDA: CInt = AF_IRDA

public val PF_PPPOX: CInt = AF_PPPOX

public val PF_WANPIPE: CInt = AF_WANPIPE

public val PF_LLC: CInt = AF_LLC

public val PF_CAN: CInt = AF_CAN

public val PF_TIPC: CInt = AF_TIPC

public val PF_BLUETOOTH: CInt = AF_BLUETOOTH

public val PF_IUCV: CInt = AF_IUCV

public val PF_RXRPC: CInt = AF_RXRPC

public val PF_ISDN: CInt = AF_ISDN

public val PF_PHONET: CInt = AF_PHONET

public val PF_IEEE802154: CInt = AF_IEEE802154

public val PF_CAIF: CInt = AF_CAIF

public val PF_ALG: CInt = AF_ALG

public val MSG_OOB: CInt = 1

public val MSG_PEEK: CInt = 2

public val MSG_DONTROUTE: CInt = 4

public val MSG_CTRUNC: CInt = 8

public val MSG_TRUNC: CInt = 0x20

public val MSG_DONTWAIT: CInt = 0x40

public val MSG_EOR: CInt = 0x80

public val MSG_WAITALL: CInt = 0x100

public val MSG_FIN: CInt = 0x200

public val MSG_SYN: CInt = 0x400

public val MSG_CONFIRM: CInt = 0x800

public val MSG_RST: CInt = 0x1000

public val MSG_ERRQUEUE: CInt = 0x2000

public val MSG_NOSIGNAL: CInt = 0x4000

public val MSG_MORE: CInt = 0x8000

public val MSG_WAITFORONE: CInt = 0x10000

public val MSG_FASTOPEN: CInt = 0x20000000

public val MSG_CMSG_CLOEXEC: CInt = 0x40000000

public val SCM_TIMESTAMP: CInt = SO_TIMESTAMP

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val IP_TOS: CInt = 1

public val IP_TTL: CInt = 2

public val IP_HDRINCL: CInt = 3

public val IP_OPTIONS: CInt = 4

public val IP_ROUTER_ALERT: CInt = 5

public val IP_RECVOPTS: CInt = 6

public val IP_RETOPTS: CInt = 7

public val IP_PKTINFO: CInt = 8

public val IP_PKTOPTIONS: CInt = 9

public val IP_MTU_DISCOVER: CInt = 10

public val IP_RECVERR: CInt = 11

public val IP_RECVTTL: CInt = 12

public val IP_RECVTOS: CInt = 13

public val IP_MTU: CInt = 14

public val IP_FREEBIND: CInt = 15

public val IP_IPSEC_POLICY: CInt = 16

public val IP_XFRM_POLICY: CInt = 17

public val IP_PASSSEC: CInt = 18

public val IP_TRANSPARENT: CInt = 19

public val IP_ORIGDSTADDR: CInt = 20

public val IP_RECVORIGDSTADDR: CInt = IP_ORIGDSTADDR

public val IP_MINTTL: CInt = 21

public val IP_NODEFRAG: CInt = 22

public val IP_CHECKSUM: CInt = 23

public val IP_BIND_ADDRESS_NO_PORT: CInt = 24

public val IP_MULTICAST_IF: CInt = 32

public val IP_MULTICAST_TTL: CInt = 33

public val IP_MULTICAST_LOOP: CInt = 34

public val IP_ADD_MEMBERSHIP: CInt = 35

public val IP_DROP_MEMBERSHIP: CInt = 36

public val IP_UNBLOCK_SOURCE: CInt = 37

public val IP_BLOCK_SOURCE: CInt = 38

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 39

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 40

public val IP_MSFILTER: CInt = 41

public val IP_MULTICAST_ALL: CInt = 49

public val IP_UNICAST_IF: CInt = 50

public val IP_DEFAULT_MULTICAST_TTL: CInt = 1

public val IP_DEFAULT_MULTICAST_LOOP: CInt = 1

public val IP_PMTUDISC_DONT: CInt = 0

public val IP_PMTUDISC_WANT: CInt = 1

public val IP_PMTUDISC_DO: CInt = 2

public val IP_PMTUDISC_PROBE: CInt = 3

public val IP_PMTUDISC_INTERFACE: CInt = 4

public val IP_PMTUDISC_OMIT: CInt = 5

// IPPROTO_IP defined in src/unix/mod.rs
/**
 * Hop-by-hop option header
 */
public val IPPROTO_HOPOPTS: CInt = 0

// IPPROTO_ICMP defined in src/unix/mod.rs
/**
 * group mgmt protocol
 */
public val IPPROTO_IGMP: CInt = 2

/**
 * for compatibility
 */
public val IPPROTO_IPIP: CInt = 4

// IPPROTO_TCP defined in src/unix/mod.rs
/**
 * exterior gateway protocol
 */
public val IPPROTO_EGP: CInt = 8

/**
 * pup
 */
public val IPPROTO_PUP: CInt = 12

// IPPROTO_UDP defined in src/unix/mod.rs
/**
 * xns idp
 */
public val IPPROTO_IDP: CInt = 22

/**
 * tp-4 w/ class negotiation
 */
public val IPPROTO_TP: CInt = 29

/**
 * DCCP
 */
public val IPPROTO_DCCP: CInt = 33

// IPPROTO_IPV6 defined in src/unix/mod.rs
/**
 * IP6 routing header
 */
public val IPPROTO_ROUTING: CInt = 43

/**
 * IP6 fragmentation header
 */
public val IPPROTO_FRAGMENT: CInt = 44

/**
 * resource reservation
 */
public val IPPROTO_RSVP: CInt = 46

/**
 * General Routing Encap.
 */
public val IPPROTO_GRE: CInt = 47

/**
 * IP6 Encap Sec. Payload
 */
public val IPPROTO_ESP: CInt = 50

/**
 * IP6 Auth Header
 */
public val IPPROTO_AH: CInt = 51

// IPPROTO_ICMPV6 defined in src/unix/mod.rs
/**
 * IP6 no next header
 */
public val IPPROTO_NONE: CInt = 59

/**
 * IP6 destination option
 */
public val IPPROTO_DSTOPTS: CInt = 60

public val IPPROTO_MTP: CInt = 92

/**
 * encapsulation header
 */
public val IPPROTO_ENCAP: CInt = 98

/**
 * Protocol indep. multicast
 */
public val IPPROTO_PIM: CInt = 103

/**
 * IP Payload Comp. Protocol
 */
public val IPPROTO_COMP: CInt = 108

/**
 * SCTP
 */
public val IPPROTO_SCTP: CInt = 132

public val IPPROTO_MH: CInt = 135

public val IPPROTO_UDPLITE: CInt = 136

/**
 * raw IP packet
 */
public val IPPROTO_RAW: CInt = 255

public val IPPROTO_BEETPH: CInt = 94

public val IPPROTO_MPLS: CInt = 137

/**
 * Multipath TCP
 */
public val IPPROTO_MPTCP: CInt = 262

/**
 * Ethernet-within-IPv6 encapsulation.
 */
public val IPPROTO_ETHERNET: CInt = 143

public val MCAST_EXCLUDE: CInt = 0

public val MCAST_INCLUDE: CInt = 1

public val MCAST_JOIN_GROUP: CInt = 42

public val MCAST_BLOCK_SOURCE: CInt = 43

public val MCAST_UNBLOCK_SOURCE: CInt = 44

public val MCAST_LEAVE_GROUP: CInt = 45

public val MCAST_JOIN_SOURCE_GROUP: CInt = 46

public val MCAST_LEAVE_SOURCE_GROUP: CInt = 47

public val MCAST_MSFILTER: CInt = 48

public val IPV6_ADDRFORM: CInt = 1

public val IPV6_2292PKTINFO: CInt = 2

public val IPV6_2292HOPOPTS: CInt = 3

public val IPV6_2292DSTOPTS: CInt = 4

public val IPV6_2292RTHDR: CInt = 5

public val IPV6_2292PKTOPTIONS: CInt = 6

public val IPV6_CHECKSUM: CInt = 7

public val IPV6_2292HOPLIMIT: CInt = 8

public val IPV6_NEXTHOP: CInt = 9

public val IPV6_AUTHHDR: CInt = 10

public val IPV6_UNICAST_HOPS: CInt = 16

public val IPV6_MULTICAST_IF: CInt = 17

public val IPV6_MULTICAST_HOPS: CInt = 18

public val IPV6_MULTICAST_LOOP: CInt = 19

public val IPV6_ADD_MEMBERSHIP: CInt = 20

public val IPV6_DROP_MEMBERSHIP: CInt = 21

public val IPV6_ROUTER_ALERT: CInt = 22

public val IPV6_MTU_DISCOVER: CInt = 23

public val IPV6_MTU: CInt = 24

public val IPV6_RECVERR: CInt = 25

public val IPV6_V6ONLY: CInt = 26

public val IPV6_JOIN_ANYCAST: CInt = 27

public val IPV6_LEAVE_ANYCAST: CInt = 28

public val IPV6_IPSEC_POLICY: CInt = 34

public val IPV6_XFRM_POLICY: CInt = 35

public val IPV6_HDRINCL: CInt = 36

public val IPV6_RECVPKTINFO: CInt = 49

public val IPV6_PKTINFO: CInt = 50

public val IPV6_RECVHOPLIMIT: CInt = 51

public val IPV6_HOPLIMIT: CInt = 52

public val IPV6_RECVHOPOPTS: CInt = 53

public val IPV6_HOPOPTS: CInt = 54

public val IPV6_RTHDRDSTOPTS: CInt = 55

public val IPV6_RECVRTHDR: CInt = 56

public val IPV6_RTHDR: CInt = 57

public val IPV6_RECVDSTOPTS: CInt = 58

public val IPV6_DSTOPTS: CInt = 59

public val IPV6_RECVPATHMTU: CInt = 60

public val IPV6_PATHMTU: CInt = 61

public val IPV6_DONTFRAG: CInt = 62

public val IPV6_RECVTCLASS: CInt = 66

public val IPV6_TCLASS: CInt = 67

public val IPV6_AUTOFLOWLABEL: CInt = 70

public val IPV6_ADDR_PREFERENCES: CInt = 72

public val IPV6_MINHOPCOUNT: CInt = 73

public val IPV6_ORIGDSTADDR: CInt = 74

public val IPV6_RECVORIGDSTADDR: CInt = IPV6_ORIGDSTADDR

public val IPV6_TRANSPARENT: CInt = 75

public val IPV6_UNICAST_IF: CInt = 76

public val IPV6_PREFER_SRC_TMP: CInt = 0x0001

public val IPV6_PREFER_SRC_PUBLIC: CInt = 0x0002

public val IPV6_PREFER_SRC_PUBTMP_DEFAULT: CInt = 0x0100

public val IPV6_PREFER_SRC_COA: CInt = 0x0004

public val IPV6_PREFER_SRC_HOME: CInt = 0x0400

public val IPV6_PREFER_SRC_CGA: CInt = 0x0008

public val IPV6_PREFER_SRC_NONCGA: CInt = 0x0800

public val IPV6_PMTUDISC_DONT: CInt = 0

public val IPV6_PMTUDISC_WANT: CInt = 1

public val IPV6_PMTUDISC_DO: CInt = 2

public val IPV6_PMTUDISC_PROBE: CInt = 3

public val IPV6_PMTUDISC_INTERFACE: CInt = 4

public val IPV6_PMTUDISC_OMIT: CInt = 5

public val TCP_NODELAY: CInt = 1

public val TCP_MAXSEG: CInt = 2

public val TCP_CORK: CInt = 3

public val TCP_KEEPIDLE: CInt = 4

public val TCP_KEEPINTVL: CInt = 5

public val TCP_KEEPCNT: CInt = 6

public val TCP_SYNCNT: CInt = 7

public val TCP_LINGER2: CInt = 8

public val TCP_DEFER_ACCEPT: CInt = 9

public val TCP_WINDOW_CLAMP: CInt = 10

public val TCP_INFO: CInt = 11

public val TCP_QUICKACK: CInt = 12

public val TCP_CONGESTION: CInt = 13

public val TCP_MD5SIG: CInt = 14

// WARN: deprecated
public val TCP_COOKIE_TRANSACTIONS: CInt = 15

public val TCP_THIN_LINEAR_TIMEOUTS: CInt = 16

public val TCP_THIN_DUPACK: CInt = 17

public val TCP_USER_TIMEOUT: CInt = 18

public val TCP_REPAIR: CInt = 19

public val TCP_REPAIR_QUEUE: CInt = 20

public val TCP_QUEUE_SEQ: CInt = 21

public val TCP_REPAIR_OPTIONS: CInt = 22

public val TCP_FASTOPEN: CInt = 23

public val TCP_TIMESTAMP: CInt = 24

public val TCP_NOTSENT_LOWAT: CInt = 25

public val TCP_CC_INFO: CInt = 26

public val TCP_SAVE_SYN: CInt = 27

public val TCP_SAVED_SYN: CInt = 28

// NOTE: emscripten doesn't support these options yet.
public val TCP_REPAIR_WINDOW: CInt = 29

public val TCP_FASTOPEN_CONNECT: CInt = 30

public val TCP_ULP: CInt = 31

public val TCP_MD5SIG_EXT: CInt = 32

public val TCP_FASTOPEN_KEY: CInt = 33

public val TCP_FASTOPEN_NO_COOKIE: CInt = 34

public val TCP_ZEROCOPY_RECEIVE: CInt = 35

public val TCP_INQ: CInt = 36

public val TCP_CM_INQ: CInt = TCP_INQ

// NOTE: Some CI images doesn't have this option yet.
// pub const TCP_TX_DELAY: cInt = 37;
public val TCP_MD5SIG_MAXKEYLEN: Int = 80

public val SO_DEBUG: CInt = 1

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_NB: CInt = 4

public val LOCK_UN: CInt = 8

public val SS_ONSTACK: CInt = 1

public val SS_DISABLE: CInt = 2

public val NAME_MAX: CInt = 255

public val PATH_MAX: CInt = 4096

public val UIO_MAXIOV: CInt = 1024

public val FD_SETSIZE: Int = 1024

public val EPOLLIN: CInt = 0x1

public val EPOLLPRI: CInt = 0x2

public val EPOLLOUT: CInt = 0x4

public val EPOLLERR: CInt = 0x8

public val EPOLLHUP: CInt = 0x10

public val EPOLLRDNORM: CInt = 0x40

public val EPOLLRDBAND: CInt = 0x80

public val EPOLLWRNORM: CInt = 0x100

public val EPOLLWRBAND: CInt = 0x200

public val EPOLLMSG: CInt = 0x400

public val EPOLLRDHUP: CInt = 0x2000

public val EPOLLEXCLUSIVE: CInt = 0x10000000

public val EPOLLWAKEUP: CInt = 0x20000000

public val EPOLLONESHOT: CInt = 0x40000000

public val EPOLLET: CInt = 0x80000000

public val EPOLL_CTL_ADD: CInt = 1

public val EPOLL_CTL_MOD: CInt = 3

public val EPOLL_CTL_DEL: CInt = 2

public val MNT_FORCE: CInt = 0x1

public val MNT_DETACH: CInt = 0x2

public val MNT_EXPIRE: CInt = 0x4

public val UMOUNT_NOFOLLOW: CInt = 0x8

public val Q_GETFMT: CInt = 0x800004

public val Q_GETINFO: CInt = 0x800005

public val Q_SETINFO: CInt = 0x800006

public val QIF_BLIMITS: UInt = 1u

public val QIF_SPACE: UInt = 2u

public val QIF_ILIMITS: UInt = 4u

public val QIF_INODES: UInt = 8u

public val QIF_BTIME: UInt = 16u

public val QIF_ITIME: UInt = 32u

public val QIF_LIMITS: UInt = 5u

public val QIF_USAGE: UInt = 10u

public val QIF_TIMES: UInt = 48u

public val QIF_ALL: UInt = 63u

public val Q_SYNC: CInt = 0x800001

public val Q_QUOTAON: CInt = 0x800002

public val Q_QUOTAOFF: CInt = 0x800003

public val Q_GETQUOTA: CInt = 0x800007

public val Q_SETQUOTA: CInt = 0x800008

public val TCIOFF: CInt = 2

public val TCION: CInt = 3

public val TCOOFF: CInt = 0

public val TCOON: CInt = 1

public val TCIFLUSH: CInt = 0

public val TCOFLUSH: CInt = 1

public val TCIOFLUSH: CInt = 2

public val NL0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val NL1: io.github.kotlinmania.libc.TcflagT = 0x00000100u

public val TAB0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val CR0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val FF0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val BS0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val VT0: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val VERASE: Int = 2

public val VKILL: Int = 3

public val VINTR: Int = 0

public val VQUIT: Int = 1

public val VLNEXT: Int = 15

public val IGNBRK: io.github.kotlinmania.libc.TcflagT = 0x00000001u

public val BRKINT: io.github.kotlinmania.libc.TcflagT = 0x00000002u

public val IGNPAR: io.github.kotlinmania.libc.TcflagT = 0x00000004u

public val PARMRK: io.github.kotlinmania.libc.TcflagT = 0x00000008u

public val INPCK: io.github.kotlinmania.libc.TcflagT = 0x00000010u

public val ISTRIP: io.github.kotlinmania.libc.TcflagT = 0x00000020u

public val INLCR: io.github.kotlinmania.libc.TcflagT = 0x00000040u

public val IGNCR: io.github.kotlinmania.libc.TcflagT = 0x00000080u

public val ICRNL: io.github.kotlinmania.libc.TcflagT = 0x00000100u

public val IXANY: io.github.kotlinmania.libc.TcflagT = 0x00000800u

public val IMAXBEL: io.github.kotlinmania.libc.TcflagT = 0x00002000u

public val OPOST: io.github.kotlinmania.libc.TcflagT = 0x1u

public val CS5: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val CRTSCTS: io.github.kotlinmania.libc.TcflagT = 0x80000000u

public val ECHO: io.github.kotlinmania.libc.TcflagT = 0x00000008u

public val OCRNL: io.github.kotlinmania.libc.TcflagT = 8u

public val ONOCR: io.github.kotlinmania.libc.TcflagT = 16u

public val ONLRET: io.github.kotlinmania.libc.TcflagT = 32u

public val OFILL: io.github.kotlinmania.libc.TcflagT = 64u

public val OFDEL: io.github.kotlinmania.libc.TcflagT = 128u

public val CLONE_VM: CInt = 0x100

public val CLONE_FS: CInt = 0x200

public val CLONE_FILES: CInt = 0x400

public val CLONE_SIGHAND: CInt = 0x800

public val CLONE_PTRACE: CInt = 0x2000

public val CLONE_VFORK: CInt = 0x4000

public val CLONE_PARENT: CInt = 0x8000

public val CLONE_THREAD: CInt = 0x10000

public val CLONE_NEWNS: CInt = 0x20000

public val CLONE_SYSVSEM: CInt = 0x40000

public val CLONE_SETTLS: CInt = 0x80000

public val CLONE_PARENT_SETTID: CInt = 0x100000

public val CLONE_CHILD_CLEARTID: CInt = 0x200000

public val CLONE_DETACHED: CInt = 0x400000

public val CLONE_UNTRACED: CInt = 0x800000

public val CLONE_CHILD_SETTID: CInt = 0x01000000

public val CLONE_NEWCGROUP: CInt = 0x02000000

public val CLONE_NEWUTS: CInt = 0x04000000

public val CLONE_NEWIPC: CInt = 0x08000000

public val CLONE_NEWUSER: CInt = 0x10000000

public val CLONE_NEWPID: CInt = 0x20000000

public val CLONE_NEWNET: CInt = 0x40000000

public val CLONE_IO: CInt = 0x80000000

public val WNOHANG: CInt = 0x00000001

public val WUNTRACED: CInt = 0x00000002

public val WSTOPPED: CInt = WUNTRACED

public val WEXITED: CInt = 0x00000004

public val WCONTINUED: CInt = 0x00000008

public val WNOWAIT: CInt = 0x01000000

// Options for personality(2).
public val ADDR_NO_RANDOMIZE: CInt = 0x0040000

public val MMAP_PAGE_ZERO: CInt = 0x0100000

public val ADDR_COMPAT_LAYOUT: CInt = 0x0200000

public val READ_IMPLIES_EXEC: CInt = 0x0400000

public val ADDR_LIMIT_32BIT: CInt = 0x0800000

public val SHORT_INODE: CInt = 0x1000000

public val WHOLE_SECONDS: CInt = 0x2000000

public val STICKY_TIMEOUTS: CInt = 0x4000000

public val ADDR_LIMIT_3GB: CInt = 0x8000000

// Options set using PTRACE_SETOPTIONS.
public val PTRACE_O_TRACESYSGOOD: CInt = 0x00000001

public val PTRACE_O_TRACEFORK: CInt = 0x00000002

public val PTRACE_O_TRACEVFORK: CInt = 0x00000004

public val PTRACE_O_TRACECLONE: CInt = 0x00000008

public val PTRACE_O_TRACEEXEC: CInt = 0x00000010

public val PTRACE_O_TRACEVFORKDONE: CInt = 0x00000020

public val PTRACE_O_TRACEEXIT: CInt = 0x00000040

public val PTRACE_O_TRACESECCOMP: CInt = 0x00000080

public val PTRACE_O_SUSPEND_SECCOMP: CInt = 0x00200000

public val PTRACE_O_EXITKILL: CInt = 0x00100000

public val PTRACE_O_MASK: CInt = 0x003000ff

// Wait extended result codes for the above trace options.
public val PTRACE_EVENT_FORK: CInt = 1

public val PTRACE_EVENT_VFORK: CInt = 2

public val PTRACE_EVENT_CLONE: CInt = 3

public val PTRACE_EVENT_EXEC: CInt = 4

public val PTRACE_EVENT_VFORK_DONE: CInt = 5

public val PTRACE_EVENT_EXIT: CInt = 6

public val PTRACE_EVENT_SECCOMP: CInt = 7

public val WNOTHREAD: CInt = 0x20000000

public val WALL: CInt = 0x40000000

public val WCLONE: CInt = 0x80000000

public val SPLICE_F_MOVE: CUint = 0x01u

public val SPLICE_F_NONBLOCK: CUint = 0x02u

public val SPLICE_F_MORE: CUint = 0x04u

public val SPLICE_F_GIFT: CUint = 0x08u

public val RTLD_LOCAL: CInt = 0

public val RTLD_LAZY: CInt = 1

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_RANDOM: CInt = 1

public val POSIX_FADV_SEQUENTIAL: CInt = 2

public val POSIX_FADV_WILLNEED: CInt = 3

public val AT_FDCWD: CInt = -100

public val AT_SYMLINK_NOFOLLOW: CInt = 0x100

public val AT_REMOVEDIR: CInt = 0x200

public val AT_SYMLINK_FOLLOW: CInt = 0x400

public val AT_NO_AUTOMOUNT: CInt = 0x800

public val AT_EMPTY_PATH: CInt = 0x1000

public val AT_RECURSIVE: CInt = 0x8000

public val LOG_CRON: CInt = 9 shl 3

public val LOG_AUTHPRIV: CInt = 10 shl 3

public val LOG_FTP: CInt = 11 shl 3

public val LOG_PERROR: CInt = 0x20

public val PIPE_BUF: Int = 4096

public val SI_LOAD_SHIFT: CUint = 16u

// siCode values
public val SI_USER: CInt = 0

public val SI_KERNEL: CInt = 0x80

public val SI_QUEUE: CInt = -1

public val SI_TIMER: CInt = -2

public val SI_MESGQ: CInt = -3

public val SI_ASYNCIO: CInt = -4

public val SI_TIMER1: CInt = -3

public val SI_MESGQ1: CInt = -4

public val SI_ASYNCIO1: CInt = -2

public val SI_SIGIO: CInt = -5

public val SI_TKILL: CInt = -6

public val SI_ASYNCNL: CInt = -60

// siCode values for SIGBUS signal
public val BUS_ADRALN: CInt = 1

public val BUS_ADRERR: CInt = 2

public val BUS_OBJERR: CInt = 3

// Linux-specific siCode values for SIGBUS signal
public val BUS_MCEERR_AR: CInt = 4

public val BUS_MCEERR_AO: CInt = 5

// siCode values for SIGTRAP
public val TRAP_BRKPT: CInt = 1

public val TRAP_TRACE: CInt = 2

public val TRAP_BRANCH: CInt = 3

public val TRAP_HWBKPT: CInt = 4

public val TRAP_UNK: CInt = 5

// siCode values for SIGCHLD signal
public val CLD_EXITED: CInt = 1

public val CLD_KILLED: CInt = 2

public val CLD_DUMPED: CInt = 3

public val CLD_TRAPPED: CInt = 4

public val CLD_STOPPED: CInt = 5

public val CLD_CONTINUED: CInt = 6

public val SIGEV_SIGNAL: CInt = 0

public val SIGEV_NONE: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val P_ALL: IdtypeT = 0

public val P_PID: IdtypeT = 1

public val P_PGID: IdtypeT = 2

public val P_PIDFD: IdtypeT = 3

public val UTIME_OMIT: CLong = 1073741822L

public val UTIME_NOW: CLong = 1073741823L

public val POLLIN: CShort = 0x1

public val POLLPRI: CShort = 0x2

public val POLLOUT: CShort = 0x4

public val POLLERR: CShort = 0x8

public val POLLHUP: CShort = 0x10

public val POLLNVAL: CShort = 0x20

public val POLLRDNORM: CShort = 0x040

public val POLLRDBAND: CShort = 0x080

public val POLLRDHUP: CShort = 0x2000

public val POLLRDHUP1: CShort = 0x800

public val IPTOS_LOWDELAY: UByte = 0x10u

public val IPTOS_THROUGHPUT: UByte = 0x08u

public val IPTOS_RELIABILITY: UByte = 0x04u

public val IPTOS_MINCOST: UByte = 0x02u

public val IPTOS_PREC_NETCONTROL: UByte = 0xe0u

public val IPTOS_PREC_INTERNETCONTROL: UByte = 0xc0u

public val IPTOS_PREC_CRITIC_ECP: UByte = 0xa0u

public val IPTOS_PREC_FLASHOVERRIDE: UByte = 0x80u

public val IPTOS_PREC_FLASH: UByte = 0x60u

public val IPTOS_PREC_IMMEDIATE: UByte = 0x40u

public val IPTOS_PREC_PRIORITY: UByte = 0x20u

public val IPTOS_PREC_ROUTINE: UByte = 0x00u

public val IPTOS_ECN_MASK: UByte = 0x03u

public val IPTOS_ECN_ECT1: UByte = 0x01u

public val IPTOS_ECN_ECT0: UByte = 0x02u

public val IPTOS_ECN_CE: UByte = 0x03u

public val IPOPT_COPY: UByte = 0x80u

public val IPOPT_CLASS_MASK: UByte = 0x60u

public val IPOPT_NUMBER_MASK: UByte = 0x1fu

public val IPOPT_CONTROL: UByte = 0x00u

public val IPOPT_RESERVED1: UByte = 0x20u

public val IPOPT_MEASUREMENT: UByte = 0x40u

public val IPOPT_RESERVED2: UByte = 0x60u

public val IPOPT_END: UByte = (0u or IPOPT_CONTROL).toUByte()

public val IPOPT_NOOP: UByte = (1u or IPOPT_CONTROL).toUByte()

public val IPOPT_SEC: UByte = (2u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_LSRR: UByte = (3u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_TIMESTAMP: UByte = (4u or IPOPT_MEASUREMENT).toUByte()

public val IPOPT_RR: UByte = (7u or IPOPT_CONTROL).toUByte()

public val IPOPT_SID: UByte = (8u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_SSRR: UByte = (9u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_RA: UByte = (20u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPVERSION: UByte = 4u

public val MAXTTL: UByte = 255u

public val IPDEFTTL: UByte = 64u

public val IPOPT_OPTVAL: UByte = 0u

public val IPOPT_OLEN: UByte = 1u

public val IPOPT_OFFSET: UByte = 2u

public val IPOPT_MINOFF: UByte = 4u

public val MAX_IPOPTLEN: UByte = 40u

public val IPOPT_NOP: UByte = IPOPT_NOOP

public val IPOPT_EOL: UByte = IPOPT_END

public val IPOPT_TS: UByte = IPOPT_TIMESTAMP

public val IPOPT_TS_TSONLY: UByte = 0u

public val IPOPT_TS_TSANDADDR: UByte = 1u

public val IPOPT_TS_PRESPEC: UByte = 3u

public val ARPOP_RREQUEST: UShort = 3u

public val ARPOP_RREPLY: UShort = 4u

public val ARPOP_IN_REQUEST: UShort = 8u

public val ARPOP_IN_REPLY: UShort = 9u

public val ARPOP_NAK: UShort = 10u

public val ATF_NETMASK: CInt = 0x20

public val ATF_DONTPUB: CInt = 0x40

public val ARPHRD_NETROM: UShort = 0u

public val ARPHRD_ETHER: UShort = 1u

public val ARPHRD_EETHER: UShort = 2u

public val ARPHRD_AX25: UShort = 3u

public val ARPHRD_PRONET: UShort = 4u

public val ARPHRD_CHAOS: UShort = 5u

public val ARPHRD_IEEE802: UShort = 6u

public val ARPHRD_ARCNET: UShort = 7u

public val ARPHRD_APPLETLK: UShort = 8u

public val ARPHRD_DLCI: UShort = 15u

public val ARPHRD_ATM: UShort = 19u

public val ARPHRD_METRICOM: UShort = 23u

public val ARPHRD_IEEE1394: UShort = 24u

public val ARPHRD_EUI64: UShort = 27u

public val ARPHRD_INFINIBAND: UShort = 32u

public val ARPHRD_SLIP: UShort = 256u

public val ARPHRD_CSLIP: UShort = 257u

public val ARPHRD_SLIP6: UShort = 258u

public val ARPHRD_CSLIP6: UShort = 259u

public val ARPHRD_RSRVD: UShort = 260u

public val ARPHRD_ADAPT: UShort = 264u

public val ARPHRD_ROSE: UShort = 270u

public val ARPHRD_X25: UShort = 271u

public val ARPHRD_HWX25: UShort = 272u

public val ARPHRD_CAN: UShort = 280u

public val ARPHRD_PPP: UShort = 512u

public val ARPHRD_CISCO: UShort = 513u

public val ARPHRD_HDLC: UShort = ARPHRD_CISCO

public val ARPHRD_LAPB: UShort = 516u

public val ARPHRD_DDCMP: UShort = 517u

public val ARPHRD_RAWHDLC: UShort = 518u

public val ARPHRD_TUNNEL: UShort = 768u

public val ARPHRD_TUNNEL6: UShort = 769u

public val ARPHRD_FRAD: UShort = 770u

public val ARPHRD_SKIP: UShort = 771u

public val ARPHRD_LOOPBACK: UShort = 772u

public val ARPHRD_LOCALTLK: UShort = 773u

public val ARPHRD_FDDI: UShort = 774u

public val ARPHRD_BIF: UShort = 775u

public val ARPHRD_SIT: UShort = 776u

public val ARPHRD_IPDDP: UShort = 777u

public val ARPHRD_IPGRE: UShort = 778u

public val ARPHRD_PIMREG: UShort = 779u

public val ARPHRD_HIPPI: UShort = 780u

public val ARPHRD_ASH: UShort = 781u

public val ARPHRD_ECONET: UShort = 782u

public val ARPHRD_IRDA: UShort = 783u

public val ARPHRD_FCPP: UShort = 784u

public val ARPHRD_FCAL: UShort = 785u

public val ARPHRD_FCPL: UShort = 786u

public val ARPHRD_FCFABRIC: UShort = 787u

public val ARPHRD_IEEE802_TR: UShort = 800u

public val ARPHRD_IEEE80211: UShort = 801u

public val ARPHRD_IEEE80211_PRISM: UShort = 802u

public val ARPHRD_IEEE80211_RADIOTAP: UShort = 803u

public val ARPHRD_IEEE802154: UShort = 804u

public val ARPHRD_VOID: UShort = 0xFFFFu

public val ARPHRD_NONE: UShort = 0xFFFEu

// linux/ifTun.h
// TUNSETIFF ifr flags
public val IFF_TUN: CInt = 0x0001

public val IFF_TAP: CInt = 0x0002

public val IFF_NAPI: CInt = 0x0010

public val IFF_NAPI_FRAGS: CInt = 0x0020

// Used in TUNSETIFF to bring up tun/tap without carrier
public val IFF_NO_CARRIER: CInt = 0x0040

public val IFF_NO_PI: CInt = 0x1000

// Read queue size
public val TUN_READQ_SIZE: CShort = 500

// TUN device type flags: deprecated. Use IFF_TUN/IFF_TAP instead.
public val TUN_TUN_DEV: CShort = IFF_TUN.toShort()

public val TUN_TAP_DEV: CShort = IFF_TAP.toShort()

public val TUN_TYPE_MASK: CShort = 0x000f

// This flag has no real effect
public val IFF_ONE_QUEUE: CInt = 0x2000

public val IFF_VNET_HDR: CInt = 0x4000

public val IFF_TUN_EXCL: CInt = 0x8000

public val IFF_MULTI_QUEUE: CInt = 0x0100

public val IFF_ATTACH_QUEUE: CInt = 0x0200

public val IFF_DETACH_QUEUE: CInt = 0x0400

// read-only flag
public val IFF_PERSIST: CInt = 0x0800

public val IFF_NOFILTER: CInt = 0x1000

// Socket options
public val TUN_TX_TIMESTAMP: CInt = 1

// Features for GSO (TUNSETOFFLOAD)
public val TUN_F_CSUM: CUint = 0x01u

public val TUN_F_TSO4: CUint = 0x02u

public val TUN_F_TSO6: CUint = 0x04u

public val TUN_F_TSO_ECN: CUint = 0x08u

public val TUN_F_UFO: CUint = 0x10u

public val TUN_F_USO4: CUint = 0x20u

public val TUN_F_USO6: CUint = 0x40u

// Protocol info prepended to the packets (when IFF_NO_PI is not set)
public val TUN_PKT_STRIP: CInt = 0x0001

// Accept all multicast packets
public val TUN_FLT_ALLMULTI: CInt = 0x0001

// Ioctl operation codes
public val T_TYPE: UInt = 84u.toUInt()

public val TUNSETNOCSUM: Ioctl = IOW<CInt>(T_TYPE, 200)

public val TUNSETDEBUG: Ioctl = IOW<CInt>(T_TYPE, 201)

public val TUNSETIFF: Ioctl = IOW<CInt>(T_TYPE, 202)

public val TUNSETPERSIST: Ioctl = IOW<CInt>(T_TYPE, 203)

public val TUNSETOWNER: Ioctl = IOW<CInt>(T_TYPE, 204)

public val TUNSETLINK: Ioctl = IOW<CInt>(T_TYPE, 205)

public val TUNSETGROUP: Ioctl = IOW<CInt>(T_TYPE, 206)

public val TUNGETFEATURES: Ioctl = IOR<CInt>(T_TYPE, 207)

public val TUNSETOFFLOAD: Ioctl = IOW<CInt>(T_TYPE, 208)

public val TUNSETTXFILTER: Ioctl = IOW<CInt>(T_TYPE, 209)

public val TUNGETIFF: Ioctl = IOR<CInt>(T_TYPE, 210)

public val TUNGETSNDBUF: Ioctl = IOR<CInt>(T_TYPE, 211)

public val TUNSETSNDBUF: Ioctl = IOW<CInt>(T_TYPE, 212)

public val TUNATTACHFILTER: Ioctl = IOW<SockFprog>(T_TYPE, 213)

public val TUNDETACHFILTER: Ioctl = IOW<SockFprog>(T_TYPE, 214)

public val TUNGETVNETHDRSZ: Ioctl = IOR<CInt>(T_TYPE, 215)

public val TUNSETVNETHDRSZ: Ioctl = IOW<CInt>(T_TYPE, 216)

public val TUNSETQUEUE: Ioctl = IOW<CInt>(T_TYPE, 217)

public val TUNSETIFINDEX: Ioctl = IOW<CInt>(T_TYPE, 218)

public val TUNGETFILTER: Ioctl = IOR<SockFprog>(T_TYPE, 219)

public val TUNSETVNETLE: Ioctl = IOW<CInt>(T_TYPE, 220)

public val TUNGETVNETLE: Ioctl = IOR<CInt>(T_TYPE, 221)

public val TUNSETVNETBE: Ioctl = IOW<CInt>(T_TYPE, 222)

public val TUNGETVNETBE: Ioctl = IOR<CInt>(T_TYPE, 223)

public val TUNSETSTEERINGEBPF: Ioctl = IOR<CInt>(T_TYPE, 224)

public val TUNSETFILTEREBPF: Ioctl = IOR<CInt>(T_TYPE, 225)

public val TUNSETCARRIER: Ioctl = IOW<CInt>(T_TYPE, 226)

public val TUNGETDEVNETNS: Ioctl = IO(T_TYPE, 227)

// linux/fs.h
public val FS_IOC_GETFLAGS: Ioctl = IOR<CLong>('f'.toUInt(), 1)

public val FS_IOC_SETFLAGS: Ioctl = IOW<CLong>('f'.toUInt(), 2)

public val FS_IOC_GETVERSION: Ioctl = IOR<CLong>('v'.toUInt(), 1)

public val FS_IOC_SETVERSION: Ioctl = IOW<CLong>('v'.toUInt(), 2)

public val FS_IOC32_GETFLAGS: Ioctl = IOR<CInt>('f'.toUInt(), 1)

public val FS_IOC32_SETFLAGS: Ioctl = IOW<CInt>('f'.toUInt(), 2)

public val FS_IOC32_GETVERSION: Ioctl = IOR<CInt>('v'.toUInt(), 1)

public val FS_IOC32_SETVERSION: Ioctl = IOW<CInt>('v'.toUInt(), 2)

public val FICLONE: Ioctl = IOW<CInt>(0x94, 9)

public val FICLONERANGE: Ioctl = IOW<io.github.kotlinmania.libc.FileCloneRange>(0x94, 13)

public val ADFS_SUPER_MAGIC: CLong = 0x0000adf5L

public val AFFS_SUPER_MAGIC: CLong = 0x0000adffL

public val AFS_SUPER_MAGIC: CLong = 0x5346414fL

public val AUTOFS_SUPER_MAGIC: CLong = 0x0187L

public val BPF_FS_MAGIC: CLong = 0xcafe4a11L

public val BTRFS_SUPER_MAGIC: CLong = 0x9123683eL

public val CGROUP2_SUPER_MAGIC: CLong = 0x63677270L

public val CGROUP_SUPER_MAGIC: CLong = 0x27e0ebL

public val CODA_SUPER_MAGIC: CLong = 0x73757245L

public val CRAMFS_MAGIC: CLong = 0x28cd3d45L

public val DEBUGFS_MAGIC: CLong = 0x64626720L

public val DEVPTS_SUPER_MAGIC: CLong = 0x1cd1L

public val ECRYPTFS_SUPER_MAGIC: CLong = 0xf15fL

public val EFS_SUPER_MAGIC: CLong = 0x00414a53L

public val EXT2_SUPER_MAGIC: CLong = 0x0000ef53L

public val EXT3_SUPER_MAGIC: CLong = 0x0000ef53L

public val EXT4_SUPER_MAGIC: CLong = 0x0000ef53L

public val F2FS_SUPER_MAGIC: CLong = 0xf2f52010L

public val FUSE_SUPER_MAGIC: CLong = 0x65735546L

public val FUTEXFS_SUPER_MAGIC: CLong = 0xbad1deaL

public val HOSTFS_SUPER_MAGIC: CLong = 0x00c0ffeeL

public val HPFS_SUPER_MAGIC: CLong = 0xf995e849L

public val HUGETLBFS_MAGIC: CLong = 0x958458f6L

public val ISOFS_SUPER_MAGIC: CLong = 0x00009660L

public val JFFS2_SUPER_MAGIC: CLong = 0x000072b6L

public val MINIX2_SUPER_MAGIC2: CLong = 0x00002478L

public val MINIX2_SUPER_MAGIC: CLong = 0x00002468L

public val MINIX3_SUPER_MAGIC: CLong = 0x4d5aL

public val MINIX_SUPER_MAGIC2: CLong = 0x0000138fL

public val MINIX_SUPER_MAGIC: CLong = 0x0000137fL

public val MSDOS_SUPER_MAGIC: CLong = 0x00004d44L

public val NCP_SUPER_MAGIC: CLong = 0x0000564cL

public val NFS_SUPER_MAGIC: CLong = 0x00006969L

public val NILFS_SUPER_MAGIC: CLong = 0x3434L

public val OCFS2_SUPER_MAGIC: CLong = 0x7461636fL

public val OPENPROM_SUPER_MAGIC: CLong = 0x00009fa1L

public val OVERLAYFS_SUPER_MAGIC: CLong = 0x794c7630L

public val PROC_SUPER_MAGIC: CLong = 0x00009fa0L

public val QNX4_SUPER_MAGIC: CLong = 0x0000002fL

public val QNX6_SUPER_MAGIC: CLong = 0x68191122L

public val RDTGROUP_SUPER_MAGIC: CLong = 0x7655821L

public val REISERFS_SUPER_MAGIC: CLong = 0x52654973L

public val SECURITYFS_MAGIC: CLong = 0x73636673L

public val SELINUX_MAGIC: CLong = 0xf97cff8cL

public val SMACK_MAGIC: CLong = 0x43415d53L

public val SMB_SUPER_MAGIC: CLong = 0x0000517bL

public val SYSFS_MAGIC: CLong = 0x62656572L

public val TMPFS_MAGIC: CLong = 0x01021994L

public val TRACEFS_MAGIC: CLong = 0x74726163L

public val UDF_SUPER_MAGIC: CLong = 0x15013346L

public val USBDEVICE_SUPER_MAGIC: CLong = 0x00009fa2L

public val XENFS_SUPER_MAGIC: CLong = 0xabba1974L

public val NSFS_MAGIC: CLong = 0x6e736673L

public val ADFS_SUPER_MAGIC1: CUint = 0x0000adf5u

public val AFFS_SUPER_MAGIC1: CUint = 0x0000adffu

public val AFS_SUPER_MAGIC1: CUint = 0x5346414fu

public val AUTOFS_SUPER_MAGIC1: CUint = 0x0187u

public val BPF_FS_MAGIC1: CUint = 0xcafe4a11u

public val BTRFS_SUPER_MAGIC1: CUint = 0x9123683eu

public val CGROUP2_SUPER_MAGIC1: CUint = 0x63677270u

public val CGROUP_SUPER_MAGIC1: CUint = 0x27e0ebu

public val CODA_SUPER_MAGIC1: CUint = 0x73757245u

public val CRAMFS_MAGIC1: CUint = 0x28cd3d45u

public val DEBUGFS_MAGIC1: CUint = 0x64626720u

public val DEVPTS_SUPER_MAGIC1: CUint = 0x1cd1u

public val ECRYPTFS_SUPER_MAGIC1: CUint = 0xf15fu

public val EFS_SUPER_MAGIC1: CUint = 0x00414a53u

public val EXT2_SUPER_MAGIC1: CUint = 0x0000ef53u

public val EXT3_SUPER_MAGIC1: CUint = 0x0000ef53u

public val EXT4_SUPER_MAGIC1: CUint = 0x0000ef53u

public val F2FS_SUPER_MAGIC1: CUint = 0xf2f52010u

public val FUSE_SUPER_MAGIC1: CUint = 0x65735546u

public val FUTEXFS_SUPER_MAGIC1: CUint = 0xbad1deau

public val HOSTFS_SUPER_MAGIC1: CUint = 0x00c0ffeeu

public val HPFS_SUPER_MAGIC1: CUint = 0xf995e849u

public val HUGETLBFS_MAGIC1: CUint = 0x958458f6u

public val ISOFS_SUPER_MAGIC1: CUint = 0x00009660u

public val JFFS2_SUPER_MAGIC1: CUint = 0x000072b6u

public val MINIX2_SUPER_MAGIC21: CUint = 0x00002478u

public val MINIX2_SUPER_MAGIC1: CUint = 0x00002468u

public val MINIX3_SUPER_MAGIC1: CUint = 0x4d5au

public val MINIX_SUPER_MAGIC21: CUint = 0x0000138fu

public val MINIX_SUPER_MAGIC1: CUint = 0x0000137fu

public val MSDOS_SUPER_MAGIC1: CUint = 0x00004d44u

public val NCP_SUPER_MAGIC1: CUint = 0x0000564cu

public val NFS_SUPER_MAGIC1: CUint = 0x00006969u

public val NILFS_SUPER_MAGIC1: CUint = 0x3434u

public val OCFS2_SUPER_MAGIC1: CUint = 0x7461636fu

public val OPENPROM_SUPER_MAGIC1: CUint = 0x00009fa1u

public val OVERLAYFS_SUPER_MAGIC1: CUint = 0x794c7630u

public val PROC_SUPER_MAGIC1: CUint = 0x00009fa0u

public val QNX4_SUPER_MAGIC1: CUint = 0x0000002fu

public val QNX6_SUPER_MAGIC1: CUint = 0x68191122u

public val RDTGROUP_SUPER_MAGIC1: CUint = 0x7655821u

public val REISERFS_SUPER_MAGIC1: CUint = 0x52654973u

public val SECURITYFS_MAGIC1: CUint = 0x73636673u

public val SELINUX_MAGIC1: CUint = 0xf97cff8cu

public val SMACK_MAGIC1: CUint = 0x43415d53u

public val SMB_SUPER_MAGIC1: CUint = 0x0000517bu

public val SYSFS_MAGIC1: CUint = 0x62656572u

public val TMPFS_MAGIC1: CUint = 0x01021994u

public val TRACEFS_MAGIC1: CUint = 0x74726163u

public val UDF_SUPER_MAGIC1: CUint = 0x15013346u

public val USBDEVICE_SUPER_MAGIC1: CUint = 0x00009fa2u

public val XENFS_SUPER_MAGIC1: CUint = 0xabba1974u

public val NSFS_MAGIC1: CUint = 0x6e736673u

public val AT_STATX_SYNC_TYPE: CInt = 0x6000

public val AT_STATX_SYNC_AS_STAT: CInt = 0x0000

public val AT_STATX_FORCE_SYNC: CInt = 0x2000

public val AT_STATX_DONT_SYNC: CInt = 0x4000

public val STATX_TYPE: CUint = 0x0001u

public val STATX_MODE: CUint = 0x0002u

public val STATX_NLINK: CUint = 0x0004u

public val STATX_UID: CUint = 0x0008u

public val STATX_GID: CUint = 0x0010u

public val STATX_ATIME: CUint = 0x0020u

public val STATX_MTIME: CUint = 0x0040u

public val STATX_CTIME: CUint = 0x0080u

public val STATX_INO: CUint = 0x0100u

public val STATX_SIZE: CUint = 0x0200u

public val STATX_BLOCKS: CUint = 0x0400u

public val STATX_BASIC_STATS: CUint = 0x07ffu

public val STATX_BTIME: CUint = 0x0800u

public val STATX_ALL: CUint = 0x0fffu

public val STATX_MNT_ID: CUint = 0x1000u

public val STATX_DIOALIGN: CUint = 0x2000u

public val STATX__RESERVED: CInt = 0x80000000

public val STATX_ATTR_COMPRESSED: CInt = 0x0004

public val STATX_ATTR_IMMUTABLE: CInt = 0x0010

public val STATX_ATTR_APPEND: CInt = 0x0020

public val STATX_ATTR_NODUMP: CInt = 0x0040

public val STATX_ATTR_ENCRYPTED: CInt = 0x0800

public val STATX_ATTR_AUTOMOUNT: CInt = 0x1000

public val STATX_ATTR_MOUNT_ROOT: CInt = 0x2000

public val STATX_ATTR_VERITY: CInt = 0x100000

public val STATX_ATTR_DAX: CInt = 0x200000

public val IOC_NRBITS: UInt = 8u

public val IOC_TYPEBITS: UInt = 8u

// https://github.com/torvalds/linux/blob/b311c1b497e51a628aa89e7cb954481e5f9dced2/arch/powerpc/include/uapi/asm/ioctl.h
// https://github.com/torvalds/linux/blob/b311c1b497e51a628aa89e7cb954481e5f9dced2/arch/sparc/include/uapi/asm/ioctl.h
// https://github.com/torvalds/linux/blob/b311c1b497e51a628aa89e7cb954481e5f9dced2/arch/mips/include/uapi/asm/ioctl.h
public val IOC_SIZEBITS: UInt = 13u

public val IOC_DIRBITS: UInt = 3u

public val IOC_NONE: UInt = 1u

public val IOC_READ: UInt = 2u

public val IOC_WRITE: UInt = 4u

// https://github.com/torvalds/linux/blob/b311c1b497e51a628aa89e7cb954481e5f9dced2/include/uapi/asm-generic/ioctl.h
public val IOC_SIZEBITS1: UInt = 14u

public val IOC_DIRBITS1: UInt = 2u

public val IOC_NONE1: UInt = 0u

public val IOC_WRITE1: UInt = 1u

public val IOC_READ1: UInt = 2u

public val IOC_NRMASK: UInt = (1u shl IOC_NRBITS.toInt()) - 1u

public val IOC_TYPEMASK: UInt = (1u shl IOC_TYPEBITS.toInt()) - 1u

public val IOC_SIZEMASK: UInt = (1u shl IOC_SIZEBITS.toInt()) - 1u

public val IOC_DIRMASK: UInt = (1u shl IOC_DIRBITS.toInt()) - 1u

public val IOC_NRSHIFT: UInt = 0u

public val IOC_TYPESHIFT: UInt = IOC_NRSHIFT + IOC_NRBITS

public val IOC_SIZESHIFT: UInt = IOC_TYPESHIFT + IOC_TYPEBITS

public val IOC_DIRSHIFT: UInt = IOC_SIZESHIFT + IOC_SIZEBITS

// adapted from https://github.com/torvalds/linux/blob/8a696a29c6905594e4abf78eaafcb62165ac61f1/rust/kernel/ioctl.rs
/**
 * Build an ioctl number, analogous to the C macro of the same name.
 */
public fun ioc(dir: UInt, ty: UInt, nr: UInt, size: Int): Ioctl {
    check(dir <= IOC_DIRMASK)
    check(ty <= IOC_TYPEMASK)
    check(nr <= IOC_NRMASK)
    check(size <= (IOC_SIZEMASK.toInt()))
    return (((dir shl IOC_DIRSHIFT.toInt()) or (ty shl IOC_TYPESHIFT.toInt()) or (nr shl IOC_NRSHIFT.toInt()) or ((size.toUInt()) shl IOC_SIZESHIFT.toInt())) as Ioctl)
}

/**
 * Build an ioctl number for an argumentless ioctl.
 */
public fun io(ty: UInt, nr: UInt): Ioctl {
    return IOC(IOC_NONE, ty, nr, 0)
}

/**
 * Build an ioctl number for an read-only ioctl.
 */
public fun <T> ior(ty: UInt, nr: UInt): Ioctl {
    return IOC(IOC_READ, ty, nr, sizeOf<T>())
}

/**
 * Build an ioctl number for an write-only ioctl.
 */
public fun <T> iow(ty: UInt, nr: UInt): Ioctl {
    return IOC(IOC_WRITE, ty, nr, sizeOf<T>())
}

/**
 * Build an ioctl number for a read-write ioctl.
 */
public fun <T> iowr(ty: UInt, nr: UInt): Ioctl {
    return IOC(IOC_READ or IOC_WRITE, ty, nr, sizeOf<T>())
}

public expect fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt

public fun cmsgAlign(len: Int): Int {
    return (len + sizeOf<Int>() - 1) and (sizeOf<Int>() - 1).inv()
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toInt() >= sizeOf<Cmsghdr>()) {
        (if (mhdr!!.msgControl == null) null else Cmsghdr())
    } else {
        nullMut<Cmsghdr>()
    }
}

public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    return ((cmsg)?.let { COpaquePointer(it.hashCode().toLong() + (1).toLong()) }).toUByte()
}

public fun cmsgSpace(length: CUint): CUint {
    return (CMSG_ALIGN(length.toInt()) + CMSG_ALIGN(sizeOf<Cmsghdr>())).toUInt()
}

public fun cmsgLen(length: CUint): CUint {
    return CMSG_ALIGN(sizeOf<Cmsghdr>()).toUInt() + length
}

public fun fdClr(fd: CInt, set: FdSet?) {
    val fd1 = fd.toInt()
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set!!.fdsBits[fd1 / size] and (1 shl (fd1 % size)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val fd1 = fd.toInt()
    val size = 8 * 8
    return (set!!.fdsBits[fd1 / size] and (1 shl (fd1 % size))) != 0
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val fd1 = fd.toInt()
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set!!.fdsBits[fd1 / size] or (1 shl (fd1 % size))
    return
}

public fun fdZero(set: FdSet?) {
    for (idx in (set!!.fdsBits).indices) {
        (set!!.fdsBits)[idx] = 0
    }
}

public fun sigrtmax(): CInt {
    return libcCurrentSigrtmax()
}

public fun sigrtmin(): CInt {
    return libcCurrentSigrtmin()
}

public fun wifstopped(status: CInt): Boolean {
    return (status and 0xff) == 0x7f
}

public fun wstopsig(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wifcontinued(status: CInt): Boolean {
    return status == 0xffff
}

public fun wifsignaled(status: CInt): Boolean {
    return ((status and 0x7f) + 1).toByte() >= 2.toByte()
}

public fun wtermsig(status: CInt): CInt {
    return status and 0x7f
}

public fun wifexited(status: CInt): Boolean {
    return (status and 0x7f) == 0
}

public fun wexitstatus(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wcoredump(status: CInt): Boolean {
    return (status and 0x80) != 0
}

public fun wExitcode(ret: CInt, sig: CInt): CInt {
    return (ret shl 8) or sig
}

public fun wStopcode(sig: CInt): CInt {
    return (sig shl 8) or 0x7f
}

public fun qcmd(cmd: CInt, type: CInt): CInt {
    return (cmd shl 8) or (type and 0x00ff)
}

public fun ipoptCopied(o: UByte): UByte {
    return (o and IPOPT_COPY).toUByte()
}

public fun ipoptClass(o: UByte): UByte {
    return (o and IPOPT_CLASS_MASK).toUByte()
}

public fun ipoptNumber(o: UByte): UByte {
    return (o and IPOPT_NUMBER_MASK).toUByte()
}

public fun iptosEcn(x: UByte): UByte {
    return (x and IPTOS_ECN_MASK).toUByte()
}

public fun kernelVersion(a: UInt, b: UInt, c: UInt): UInt {
    return ((a shl 16) + (b shl 8)) + if (c > 255u) {
        255u
    } else {
        c
    }
}

public expect fun libcCurrentSigrtmax(): CInt

public expect fun libcCurrentSigrtmin(): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun mincore(addr: COpaquePointer?, len: SizeT, vec: CUchar?): CInt

public expect fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: CInt?): CInt

public expect fun getitimer(which: CInt, currValue: Itimerval?): CInt

public expect fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun setgroups(ngroups: SizeT, ptr: GidT?): CInt

public expect fun pipe2(fds: CInt?, flags: CInt): CInt

public expect fun statfs(path: String?, buf: Statfs?): CInt

public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun clearenv(): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt

public expect fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt

public expect fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt

public expect fun acct(filename: String?): CInt

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun vfork(): PidT

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT

public expect fun loginTty(fd: CInt): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?)

public expect fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt

public expect fun strchrnul(s: String?, c: CInt): COpaquePointer?

public expect fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?): SizeT

public expect fun strftimeL(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?, locale: LocaleT): SizeT

public expect fun strptime(s: String?, format: String?, tm: io.github.kotlinmania.libc.Tm?): COpaquePointer?

public expect fun mkostemp(template: COpaquePointer?, flags: CInt): CInt

public expect fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt

public expect fun getdomainname(name: COpaquePointer?, len: SizeT): CInt

public expect fun setdomainname(name: String?, len: SizeT): CInt

public expect fun ifNameindex(): IfNameindex?

public expect fun ifFreenameindex(ptr: IfNameindex?)

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun fstatfs64(fd: CInt, buf: Statfs64?): CInt

public expect fun statvfs64(path: String?, buf: Statvfs64?): CInt

public expect fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt

public expect fun statfs64(path: String?, buf: Statfs64?): CInt

public expect fun creat64(path: String?, mode: ModeT): CInt

public expect fun fstat64(fildes: CInt, buf: Stat64?): CInt

public expect fun fstatat64(dirfd: CInt, pathname: String?, buf: Stat64?, flags: CInt): CInt

public expect fun ftruncate64(fd: CInt, length: Off64T): CInt

public expect fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T

public expect fun lstat64(path: String?, buf: Stat64?): CInt

public expect fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer?

public expect fun open64(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun openat64(fd: CInt, path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt

public expect fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT

public expect fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT

public expect fun readdir64(dirp: DIR?): Dirent64?

public expect fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): CInt

public expect fun stat64(path: String?, buf: Stat64?): CInt

public expect fun truncate64(path: String?, length: Off64T): CInt

public expect fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

// uclibc has separate non-const version of this function
public expect fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT

// uclibc has separate non-const version of this function
public expect fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt

public expect fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: Statx?): CInt
