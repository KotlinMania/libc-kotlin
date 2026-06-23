// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias SaFamilyT = UShort
public typealias SpeedT = CUInt
public typealias TcflagT = CUInt
public typealias ClockidT = CInt
public typealias TimerT = COpaquePointer?
public typealias UsecondsT = UInt
public typealias KeyT = CInt
public typealias IdT = CUInt

public data class InAddr(
    val sAddr: InAddrT,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class IpMreqn(
    val imrMultiaddr: InAddr,
    val imrAddress: InAddr,
    val imrIfindex: CInt,
)

public data class IpMreqSource(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
    val imrSourceaddr: InAddr,
)

public data class Sockaddr(
    val saFamily: SaFamilyT,
    val saData: ByteArray,
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

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: SocklenT,
    val aiAddr: Sockaddr?,
    val aiCanonname: String?,
    val aiAddr: Sockaddr?,
    val aiNext: Addrinfo?,
)

public data class SockaddrLl(
    val sllFamily: CUShort,
    val sllProtocol: CUShort,
    val sllIfindex: CInt,
    val sllHatype: CUShort,
    val sllPkttype: CUChar,
    val sllHalen: CUChar,
    val sllAddr: UByteArray,
)

public data class FdSet(
    val fdsBits: ULongArray,
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

public data class SchedParam(
    val schedPriority: CInt,
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
    val intFracDigits: CChar,
    val fracDigits: CChar,
    val pCsPrecedes: CChar,
    val pSepBySpace: CChar,
    val nCsPrecedes: CChar,
    val nSepBySpace: CChar,
    val pSignPosn: CChar,
    val nSignPosn: CChar,
    val intPCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intNCsPrecedes: CChar,
    val intNSepBySpace: CChar,
    val intPSignPosn: CChar,
    val intNSignPosn: CChar,
)

public data class InPktinfo(
    val ipiIfindex: CInt,
    val ipiSpecDst: InAddr,
    val ipiAddr: InAddr,
)

public data class Ifaddrs(
    val ifaNext: Ifaddrs?,
    val ifaName: String?,
    val ifaFlags: CUInt,
    val ifaAddr: Sockaddr?,
    val ifaNetmask: Sockaddr?,
    val ifaIfu: Sockaddr?,
    val ifaData: COpaquePointer?,
)

public data class In6Rtmsg(
    val rtmsgDst: In6Addr,
    val rtmsgSrc: In6Addr,
    val rtmsgGateway: In6Addr,
    val rtmsgType: UInt,
    val rtmsgDstLen: UShort,
    val rtmsgSrcLen: UShort,
    val rtmsgMetric: UInt,
    val rtmsgInfo: CULong,
    val rtmsgFlags: UInt,
    val rtmsgIfindex: CInt,
)

public data class Arpreq(
    val arpPa: Sockaddr,
    val arpHa: Sockaddr,
    val arpFlags: CInt,
    val arpNetmask: Sockaddr,
    val arpDev: ByteArray,
)

public data class ArpreqOld(
    val arpPa: Sockaddr,
    val arpHa: Sockaddr,
    val arpFlags: CInt,
    val arpNetmask: Sockaddr,
)

public data class Arphdr(
    val arHrd: UShort,
    val arPro: UShort,
    val arHln: UByte,
    val arPln: UByte,
    val arOp: UShort,
)

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: CUInt,
)

public data class SockaddrUn(
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class SockaddrStorage(
    val ssFamily: SaFamilyT,
    val ssAlign: ULong,
)

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
    val domainname: ByteArray,
)

public data class IfNameindex(
    val ifIndex: CUInt,
    val ifName: String?,
)

public data class FileCloneRange(
    val srcFd: S64,
    val srcOffset: U64,
    val srcLength: U64,
    val destOffset: U64,
)

public data class SockFilter(
    val code: U16,
    val jt: U8,
    val jf: U8,
    val k: U32,
)

public data class SockFprog(
    val len: CUShort,
    val filter: SockFilter?,
)

public data class Statx(
    val stxMask: U32,
    val stxBlksize: U32,
    val stxAttributes: U64,
    val stxNlink: U32,
    val stxUid: U32,
    val stxGid: U32,
    val stxMode: U16,
    val stxIno: U64,
    val stxSize: U64,
    val stxBlocks: U64,
    val stxAttributesMask: U64,
    val stxAtime: StatxTimestamp,
    val stxBtime: StatxTimestamp,
    val stxCtime: StatxTimestamp,
    val stxMtime: StatxTimestamp,
    val stxRdevMajor: U32,
    val stxRdevMinor: U32,
    val stxDevMajor: U32,
    val stxDevMinor: U32,
    val stxMntId: U64,
    val stxDioMemAlign: U32,
    val stxDioOffsetAlign: U32,
)

public data class StatxTimestamp(
    val tvSec: S64,
    val tvNsec: U32,
)

public data class EpollEvent(
    val events: UInt,
    val u64: ULong,
)

public data class Sigevent(
    val sigevValue: Sigval,
    val sigevSigno: CInt,
    val sigevNotify: CInt,
    val sigevNotifyThreadId: CInt,
)

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
public const val F_DUPFD: CInt = 0
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val F_SETLEASE: CInt = 1024
public const val F_GETLEASE: CInt = 1025
public const val F_NOTIFY: CInt = 1026
public const val F_CANCELLK: CInt = 1029
public const val F_DUPFD_CLOEXEC: CInt = 1030
public const val F_SETPIPE_SZ: CInt = 1031
public const val F_GETPIPE_SZ: CInt = 1032
public const val F_ADD_SEALS: CInt = 1033
public const val F_GET_SEALS: CInt = 1034
public const val F_SEAL_SEAL: CInt = 0x0001
public const val F_SEAL_SHRINK: CInt = 0x0002
public const val F_SEAL_GROW: CInt = 0x0004
public const val F_SEAL_WRITE: CInt = 0x0008
public const val SIGTRAP: CInt = 5
public const val PTHREAD_CREATE_JOINABLE: CInt = 0
public const val PTHREAD_CREATE_DETACHED: CInt = 1
public const val CLOCK_REALTIME: ClockidT = 0
public const val CLOCK_MONOTONIC: ClockidT = 1
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2
public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 3
public const val CLOCK_MONOTONIC_RAW: ClockidT = 4
public const val CLOCK_REALTIME_COARSE: ClockidT = 5
public const val CLOCK_MONOTONIC_COARSE: ClockidT = 6
public const val CLOCK_BOOTTIME: ClockidT = 7
public const val CLOCK_REALTIME_ALARM: ClockidT = 8
public const val CLOCK_BOOTTIME_ALARM: ClockidT = 9
public const val CLOCK_TAI: ClockidT = 11
public const val TIMER_ABSTIME: CInt = 1
public const val RUSAGE_SELF: CInt = 0
public const val O_RDONLY: CInt = 0
public const val O_WRONLY: CInt = 1
public const val O_RDWR: CInt = 2
public const val SOCK_CLOEXEC: CInt = O_CLOEXEC
public const val S_IFIFO: ModeT = 4096u
public const val S_IFCHR: ModeT = 8192u
public const val S_IFBLK: ModeT = 24576u
public const val S_IFDIR: ModeT = 16384u
public const val S_IFREG: ModeT = 32768u
public const val S_IFLNK: ModeT = 40960u
public const val S_IFSOCK: ModeT = 49152u
public const val S_IFMT: ModeT = 61440u
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
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGABRT: CInt = 6
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
public const val XATTR_CREATE: CInt = 0x1
public const val XATTR_REPLACE: CInt = 0x2
public val RLIM64_INFINITY: CULongLong = 0.inv()
public val RLIM64_INFINITY: Rlim64T = 0.inv()
public const val LC_CTYPE: CInt = 0
public const val LC_NUMERIC: CInt = 1
public const val LC_TIME: CInt = 2
public const val LC_COLLATE: CInt = 3
public const val LC_MONETARY: CInt = 4
public const val LC_MESSAGES: CInt = 5
public const val LC_PAPER: CInt = 6
public const val LC_NAME: CInt = 7
public const val LC_ADDRESS: CInt = 8
public const val LC_TELEPHONE: CInt = 9
public const val LC_MEASUREMENT: CInt = 10
public const val LC_IDENTIFICATION: CInt = 11
public const val LC_ALL: CInt = 12
public const val LC_CTYPE: CInt = 0
public const val LC_NUMERIC: CInt = 1
public const val LC_TIME: CInt = 2
public const val LC_COLLATE: CInt = 3
public const val LC_MONETARY: CInt = 4
public const val LC_MESSAGES: CInt = 5
public const val LC_ALL: CInt = 6
public val LC_CTYPE_MASK: CInt = 1 shl LC_CTYPE
public val LC_NUMERIC_MASK: CInt = 1 shl LC_NUMERIC
public val LC_TIME_MASK: CInt = 1 shl LC_TIME
public val LC_COLLATE_MASK: CInt = 1 shl LC_COLLATE
public val LC_MONETARY_MASK: CInt = 1 shl LC_MONETARY
public val LC_MESSAGES_MASK: CInt = 1 shl LC_MESSAGES
public const val MAP_FILE: CInt = 0x0000
public const val MAP_SHARED: CInt = 0x0001
public const val MAP_PRIVATE: CInt = 0x0002
public const val MAP_FIXED: CInt = 0x0010
public const val MS_ASYNC: CInt = 0x0001
public const val MS_INVALIDATE: CInt = 0x0002
public const val MS_SYNC: CInt = 0x0004
public const val MS_RDONLY: CULong = 0x01uL
public const val MS_NOSUID: CULong = 0x02uL
public const val MS_NODEV: CULong = 0x04uL
public const val MS_NOEXEC: CULong = 0x08uL
public const val MS_SYNCHRONOUS: CULong = 0x10uL
public const val MS_REMOUNT: CULong = 0x20uL
public const val MS_MANDLOCK: CULong = 0x40uL
public const val MS_DIRSYNC: CULong = 0x80uL
public const val MS_NOSYMFOLLOW: CULong = 0x100uL
public const val MS_NOATIME: CULong = 0x0400uL
public const val MS_NODIRATIME: CULong = 0x0800uL
public const val MS_BIND: CULong = 0x1000uL
public const val MS_MOVE: CULong = 0x2000uL
public const val MS_REC: CULong = 0x4000uL
public const val MS_SILENT: CULong = 0x8000uL
public const val MS_POSIXACL: CULong = 0x010000uL
public const val MS_UNBINDABLE: CULong = 0x020000uL
public const val MS_PRIVATE: CULong = 0x040000uL
public const val MS_SLAVE: CULong = 0x080000uL
public const val MS_SHARED: CULong = 0x100000uL
public const val MS_RELATIME: CULong = 0x200000uL
public const val MS_KERNMOUNT: CULong = 0x400000uL
public const val MS_I_VERSION: CULong = 0x800000uL
public const val MS_STRICTATIME: CULong = 0x1000000uL
public const val MS_LAZYTIME: CULong = 0x2000000uL
public const val MS_ACTIVE: CULong = 0x40000000uL
public const val MS_MGC_VAL: CULong = 0xc0ed0000uL
public const val MS_MGC_MSK: CULong = 0xffff0000uL
public const val SCM_RIGHTS: CInt = 0x01
public const val SCM_CREDENTIALS: CInt = 0x02
public const val PROT_GROWSDOWN: CInt = 0x1000000
public const val PROT_GROWSUP: CInt = 0x2000000
public const val MAP_TYPE: CInt = 0x000f
public const val MADV_NORMAL: CInt = 0
public const val MADV_RANDOM: CInt = 1
public const val MADV_SEQUENTIAL: CInt = 2
public const val MADV_WILLNEED: CInt = 3
public const val MADV_DONTNEED: CInt = 4
public const val MADV_FREE: CInt = 8
public const val MADV_REMOVE: CInt = 9
public const val MADV_DONTFORK: CInt = 10
public const val MADV_DOFORK: CInt = 11
public const val MADV_MERGEABLE: CInt = 12
public const val MADV_UNMERGEABLE: CInt = 13
public const val MADV_HUGEPAGE: CInt = 14
public const val MADV_NOHUGEPAGE: CInt = 15
public const val MADV_DONTDUMP: CInt = 16
public const val MADV_DODUMP: CInt = 17
public const val MADV_WIPEONFORK: CInt = 18
public const val MADV_KEEPONFORK: CInt = 19
public const val MADV_COLD: CInt = 20
public const val MADV_PAGEOUT: CInt = 21
public const val MADV_HWPOISON: CInt = 100
public const val MADV_POPULATE_READ: CInt = 22
public const val MADV_POPULATE_WRITE: CInt = 23
public const val MADV_DONTNEED_LOCKED: CInt = 24
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
public const val IFF_MASTER: CInt = 0x400
public const val IFF_SLAVE: CInt = 0x800
public const val IFF_MULTICAST: CInt = 0x1000
public const val IFF_PORTSEL: CInt = 0x2000
public const val IFF_AUTOMEDIA: CInt = 0x4000
public const val IFF_DYNAMIC: CInt = 0x8000
public const val SOL_IP: CInt = 0
public const val SOL_TCP: CInt = 6
public const val SOL_UDP: CInt = 17
public const val SOL_IPV6: CInt = 41
public const val SOL_ICMPV6: CInt = 58
public const val SOL_RAW: CInt = 255
public const val SOL_DECNET: CInt = 261
public const val SOL_X25: CInt = 262
public const val SOL_PACKET: CInt = 263
public const val SOL_ATM: CInt = 264
public const val SOL_AAL: CInt = 265
public const val SOL_IRDA: CInt = 266
public const val SOL_NETBEUI: CInt = 267
public const val SOL_LLC: CInt = 268
public const val SOL_DCCP: CInt = 269
public const val SOL_NETLINK: CInt = 270
public const val SOL_TIPC: CInt = 271
public const val SOL_BLUETOOTH: CInt = 274
public const val SOL_ALG: CInt = 279
public const val AF_UNSPEC: CInt = 0
public const val AF_UNIX: CInt = 1
public const val AF_LOCAL: CInt = 1
public const val AF_INET: CInt = 2
public const val AF_AX25: CInt = 3
public const val AF_IPX: CInt = 4
public const val AF_APPLETALK: CInt = 5
public const val AF_NETROM: CInt = 6
public const val AF_BRIDGE: CInt = 7
public const val AF_ATMPVC: CInt = 8
public const val AF_X25: CInt = 9
public const val AF_INET6: CInt = 10
public const val AF_ROSE: CInt = 11
public const val AF_DECnet: CInt = 12
public const val AF_NETBEUI: CInt = 13
public const val AF_SECURITY: CInt = 14
public const val AF_KEY: CInt = 15
public const val AF_NETLINK: CInt = 16
public const val AF_ROUTE: CInt = AF_NETLINK
public const val AF_PACKET: CInt = 17
public const val AF_ASH: CInt = 18
public const val AF_ECONET: CInt = 19
public const val AF_ATMSVC: CInt = 20
public const val AF_RDS: CInt = 21
public const val AF_SNA: CInt = 22
public const val AF_IRDA: CInt = 23
public const val AF_PPPOX: CInt = 24
public const val AF_WANPIPE: CInt = 25
public const val AF_LLC: CInt = 26
public const val AF_CAN: CInt = 29
public const val AF_TIPC: CInt = 30
public const val AF_BLUETOOTH: CInt = 31
public const val AF_IUCV: CInt = 32
public const val AF_RXRPC: CInt = 33
public const val AF_ISDN: CInt = 34
public const val AF_PHONET: CInt = 35
public const val AF_IEEE802154: CInt = 36
public const val AF_CAIF: CInt = 37
public const val AF_ALG: CInt = 38
public const val PF_UNSPEC: CInt = AF_UNSPEC
public const val PF_UNIX: CInt = AF_UNIX
public const val PF_LOCAL: CInt = AF_LOCAL
public const val PF_INET: CInt = AF_INET
public const val PF_AX25: CInt = AF_AX25
public const val PF_IPX: CInt = AF_IPX
public const val PF_APPLETALK: CInt = AF_APPLETALK
public const val PF_NETROM: CInt = AF_NETROM
public const val PF_BRIDGE: CInt = AF_BRIDGE
public const val PF_ATMPVC: CInt = AF_ATMPVC
public const val PF_X25: CInt = AF_X25
public const val PF_INET6: CInt = AF_INET6
public const val PF_ROSE: CInt = AF_ROSE
public const val PF_DECnet: CInt = AF_DECnet
public const val PF_NETBEUI: CInt = AF_NETBEUI
public const val PF_SECURITY: CInt = AF_SECURITY
public const val PF_KEY: CInt = AF_KEY
public const val PF_NETLINK: CInt = AF_NETLINK
public const val PF_ROUTE: CInt = AF_ROUTE
public const val PF_PACKET: CInt = AF_PACKET
public const val PF_ASH: CInt = AF_ASH
public const val PF_ECONET: CInt = AF_ECONET
public const val PF_ATMSVC: CInt = AF_ATMSVC
public const val PF_RDS: CInt = AF_RDS
public const val PF_SNA: CInt = AF_SNA
public const val PF_IRDA: CInt = AF_IRDA
public const val PF_PPPOX: CInt = AF_PPPOX
public const val PF_WANPIPE: CInt = AF_WANPIPE
public const val PF_LLC: CInt = AF_LLC
public const val PF_CAN: CInt = AF_CAN
public const val PF_TIPC: CInt = AF_TIPC
public const val PF_BLUETOOTH: CInt = AF_BLUETOOTH
public const val PF_IUCV: CInt = AF_IUCV
public const val PF_RXRPC: CInt = AF_RXRPC
public const val PF_ISDN: CInt = AF_ISDN
public const val PF_PHONET: CInt = AF_PHONET
public const val PF_IEEE802154: CInt = AF_IEEE802154
public const val PF_CAIF: CInt = AF_CAIF
public const val PF_ALG: CInt = AF_ALG
public const val MSG_OOB: CInt = 1
public const val MSG_PEEK: CInt = 2
public const val MSG_DONTROUTE: CInt = 4
public const val MSG_CTRUNC: CInt = 8
public const val MSG_TRUNC: CInt = 0x20
public const val MSG_DONTWAIT: CInt = 0x40
public const val MSG_EOR: CInt = 0x80
public const val MSG_WAITALL: CInt = 0x100
public const val MSG_FIN: CInt = 0x200
public const val MSG_SYN: CInt = 0x400
public const val MSG_CONFIRM: CInt = 0x800
public const val MSG_RST: CInt = 0x1000
public const val MSG_ERRQUEUE: CInt = 0x2000
public const val MSG_NOSIGNAL: CInt = 0x4000
public const val MSG_MORE: CInt = 0x8000
public const val MSG_WAITFORONE: CInt = 0x10000
public const val MSG_FASTOPEN: CInt = 0x20000000
public const val MSG_CMSG_CLOEXEC: CInt = 0x40000000
public const val SCM_TIMESTAMP: CInt = SO_TIMESTAMP
public const val SOCK_RAW: CInt = 3
public const val SOCK_RDM: CInt = 4
public const val IP_TOS: CInt = 1
public const val IP_TTL: CInt = 2
public const val IP_HDRINCL: CInt = 3
public const val IP_OPTIONS: CInt = 4
public const val IP_ROUTER_ALERT: CInt = 5
public const val IP_RECVOPTS: CInt = 6
public const val IP_RETOPTS: CInt = 7
public const val IP_PKTINFO: CInt = 8
public const val IP_PKTOPTIONS: CInt = 9
public const val IP_MTU_DISCOVER: CInt = 10
public const val IP_RECVERR: CInt = 11
public const val IP_RECVTTL: CInt = 12
public const val IP_RECVTOS: CInt = 13
public const val IP_MTU: CInt = 14
public const val IP_FREEBIND: CInt = 15
public const val IP_IPSEC_POLICY: CInt = 16
public const val IP_XFRM_POLICY: CInt = 17
public const val IP_PASSSEC: CInt = 18
public const val IP_TRANSPARENT: CInt = 19
public const val IP_ORIGDSTADDR: CInt = 20
public const val IP_RECVORIGDSTADDR: CInt = IP_ORIGDSTADDR
public const val IP_MINTTL: CInt = 21
public const val IP_NODEFRAG: CInt = 22
public const val IP_CHECKSUM: CInt = 23
public const val IP_BIND_ADDRESS_NO_PORT: CInt = 24
public const val IP_MULTICAST_IF: CInt = 32
public const val IP_MULTICAST_TTL: CInt = 33
public const val IP_MULTICAST_LOOP: CInt = 34
public const val IP_ADD_MEMBERSHIP: CInt = 35
public const val IP_DROP_MEMBERSHIP: CInt = 36
public const val IP_UNBLOCK_SOURCE: CInt = 37
public const val IP_BLOCK_SOURCE: CInt = 38
public const val IP_ADD_SOURCE_MEMBERSHIP: CInt = 39
public const val IP_DROP_SOURCE_MEMBERSHIP: CInt = 40
public const val IP_MSFILTER: CInt = 41
public const val IP_MULTICAST_ALL: CInt = 49
public const val IP_UNICAST_IF: CInt = 50
public const val IP_DEFAULT_MULTICAST_TTL: CInt = 1
public const val IP_DEFAULT_MULTICAST_LOOP: CInt = 1
public const val IP_PMTUDISC_DONT: CInt = 0
public const val IP_PMTUDISC_WANT: CInt = 1
public const val IP_PMTUDISC_DO: CInt = 2
public const val IP_PMTUDISC_PROBE: CInt = 3
public const val IP_PMTUDISC_INTERFACE: CInt = 4
public const val IP_PMTUDISC_OMIT: CInt = 5
public const val IPPROTO_HOPOPTS: CInt = 0
public const val IPPROTO_IGMP: CInt = 2
public const val IPPROTO_IPIP: CInt = 4
public const val IPPROTO_EGP: CInt = 8
public const val IPPROTO_PUP: CInt = 12
public const val IPPROTO_IDP: CInt = 22
public const val IPPROTO_TP: CInt = 29
public const val IPPROTO_DCCP: CInt = 33
public const val IPPROTO_ROUTING: CInt = 43
public const val IPPROTO_FRAGMENT: CInt = 44
public const val IPPROTO_RSVP: CInt = 46
public const val IPPROTO_GRE: CInt = 47
public const val IPPROTO_ESP: CInt = 50
public const val IPPROTO_AH: CInt = 51
public const val IPPROTO_NONE: CInt = 59
public const val IPPROTO_DSTOPTS: CInt = 60
public const val IPPROTO_MTP: CInt = 92
public const val IPPROTO_ENCAP: CInt = 98
public const val IPPROTO_PIM: CInt = 103
public const val IPPROTO_COMP: CInt = 108
public const val IPPROTO_SCTP: CInt = 132
public const val IPPROTO_MH: CInt = 135
public const val IPPROTO_UDPLITE: CInt = 136
public const val IPPROTO_RAW: CInt = 255
public const val IPPROTO_BEETPH: CInt = 94
public const val IPPROTO_MPLS: CInt = 137
public const val IPPROTO_MPTCP: CInt = 262
public const val IPPROTO_ETHERNET: CInt = 143
public const val MCAST_EXCLUDE: CInt = 0
public const val MCAST_INCLUDE: CInt = 1
public const val MCAST_JOIN_GROUP: CInt = 42
public const val MCAST_BLOCK_SOURCE: CInt = 43
public const val MCAST_UNBLOCK_SOURCE: CInt = 44
public const val MCAST_LEAVE_GROUP: CInt = 45
public const val MCAST_JOIN_SOURCE_GROUP: CInt = 46
public const val MCAST_LEAVE_SOURCE_GROUP: CInt = 47
public const val MCAST_MSFILTER: CInt = 48
public const val IPV6_ADDRFORM: CInt = 1
public const val IPV6_2292PKTINFO: CInt = 2
public const val IPV6_2292HOPOPTS: CInt = 3
public const val IPV6_2292DSTOPTS: CInt = 4
public const val IPV6_2292RTHDR: CInt = 5
public const val IPV6_2292PKTOPTIONS: CInt = 6
public const val IPV6_CHECKSUM: CInt = 7
public const val IPV6_2292HOPLIMIT: CInt = 8
public const val IPV6_NEXTHOP: CInt = 9
public const val IPV6_AUTHHDR: CInt = 10
public const val IPV6_UNICAST_HOPS: CInt = 16
public const val IPV6_MULTICAST_IF: CInt = 17
public const val IPV6_MULTICAST_HOPS: CInt = 18
public const val IPV6_MULTICAST_LOOP: CInt = 19
public const val IPV6_ADD_MEMBERSHIP: CInt = 20
public const val IPV6_DROP_MEMBERSHIP: CInt = 21
public const val IPV6_ROUTER_ALERT: CInt = 22
public const val IPV6_MTU_DISCOVER: CInt = 23
public const val IPV6_MTU: CInt = 24
public const val IPV6_RECVERR: CInt = 25
public const val IPV6_V6ONLY: CInt = 26
public const val IPV6_JOIN_ANYCAST: CInt = 27
public const val IPV6_LEAVE_ANYCAST: CInt = 28
public const val IPV6_IPSEC_POLICY: CInt = 34
public const val IPV6_XFRM_POLICY: CInt = 35
public const val IPV6_HDRINCL: CInt = 36
public const val IPV6_RECVPKTINFO: CInt = 49
public const val IPV6_PKTINFO: CInt = 50
public const val IPV6_RECVHOPLIMIT: CInt = 51
public const val IPV6_HOPLIMIT: CInt = 52
public const val IPV6_RECVHOPOPTS: CInt = 53
public const val IPV6_HOPOPTS: CInt = 54
public const val IPV6_RTHDRDSTOPTS: CInt = 55
public const val IPV6_RECVRTHDR: CInt = 56
public const val IPV6_RTHDR: CInt = 57
public const val IPV6_RECVDSTOPTS: CInt = 58
public const val IPV6_DSTOPTS: CInt = 59
public const val IPV6_RECVPATHMTU: CInt = 60
public const val IPV6_PATHMTU: CInt = 61
public const val IPV6_DONTFRAG: CInt = 62
public const val IPV6_RECVTCLASS: CInt = 66
public const val IPV6_TCLASS: CInt = 67
public const val IPV6_AUTOFLOWLABEL: CInt = 70
public const val IPV6_ADDR_PREFERENCES: CInt = 72
public const val IPV6_MINHOPCOUNT: CInt = 73
public const val IPV6_ORIGDSTADDR: CInt = 74
public const val IPV6_RECVORIGDSTADDR: CInt = IPV6_ORIGDSTADDR
public const val IPV6_TRANSPARENT: CInt = 75
public const val IPV6_UNICAST_IF: CInt = 76
public const val IPV6_PREFER_SRC_TMP: CInt = 0x0001
public const val IPV6_PREFER_SRC_PUBLIC: CInt = 0x0002
public const val IPV6_PREFER_SRC_PUBTMP_DEFAULT: CInt = 0x0100
public const val IPV6_PREFER_SRC_COA: CInt = 0x0004
public const val IPV6_PREFER_SRC_HOME: CInt = 0x0400
public const val IPV6_PREFER_SRC_CGA: CInt = 0x0008
public const val IPV6_PREFER_SRC_NONCGA: CInt = 0x0800
public const val IPV6_PMTUDISC_DONT: CInt = 0
public const val IPV6_PMTUDISC_WANT: CInt = 1
public const val IPV6_PMTUDISC_DO: CInt = 2
public const val IPV6_PMTUDISC_PROBE: CInt = 3
public const val IPV6_PMTUDISC_INTERFACE: CInt = 4
public const val IPV6_PMTUDISC_OMIT: CInt = 5
public const val TCP_NODELAY: CInt = 1
public const val TCP_MAXSEG: CInt = 2
public const val TCP_CORK: CInt = 3
public const val TCP_KEEPIDLE: CInt = 4
public const val TCP_KEEPINTVL: CInt = 5
public const val TCP_KEEPCNT: CInt = 6
public const val TCP_SYNCNT: CInt = 7
public const val TCP_LINGER2: CInt = 8
public const val TCP_DEFER_ACCEPT: CInt = 9
public const val TCP_WINDOW_CLAMP: CInt = 10
public const val TCP_INFO: CInt = 11
public const val TCP_QUICKACK: CInt = 12
public const val TCP_CONGESTION: CInt = 13
public const val TCP_MD5SIG: CInt = 14
public const val TCP_COOKIE_TRANSACTIONS: CInt = 15
public const val TCP_THIN_LINEAR_TIMEOUTS: CInt = 16
public const val TCP_THIN_DUPACK: CInt = 17
public const val TCP_USER_TIMEOUT: CInt = 18
public const val TCP_REPAIR: CInt = 19
public const val TCP_REPAIR_QUEUE: CInt = 20
public const val TCP_QUEUE_SEQ: CInt = 21
public const val TCP_REPAIR_OPTIONS: CInt = 22
public const val TCP_FASTOPEN: CInt = 23
public const val TCP_TIMESTAMP: CInt = 24
public const val TCP_NOTSENT_LOWAT: CInt = 25
public const val TCP_CC_INFO: CInt = 26
public const val TCP_SAVE_SYN: CInt = 27
public const val TCP_SAVED_SYN: CInt = 28
public const val TCP_REPAIR_WINDOW: CInt = 29
public const val TCP_FASTOPEN_CONNECT: CInt = 30
public const val TCP_ULP: CInt = 31
public const val TCP_MD5SIG_EXT: CInt = 32
public const val TCP_FASTOPEN_KEY: CInt = 33
public const val TCP_FASTOPEN_NO_COOKIE: CInt = 34
public const val TCP_ZEROCOPY_RECEIVE: CInt = 35
public const val TCP_INQ: CInt = 36
public const val TCP_CM_INQ: CInt = TCP_INQ
public const val TCP_TX_DELAY: CInt = 37
public const val TCP_MD5SIG_MAXKEYLEN: ULong = 80uL
public const val SO_DEBUG: CInt = 1
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val LOCK_SH: CInt = 1
public const val LOCK_EX: CInt = 2
public const val LOCK_NB: CInt = 4
public const val LOCK_UN: CInt = 8
public const val SS_ONSTACK: CInt = 1
public const val SS_DISABLE: CInt = 2
public const val NAME_MAX: CInt = 255
public const val PATH_MAX: CInt = 4096
public const val UIO_MAXIOV: CInt = 1024
public const val FD_SETSIZE: ULong = 1024uL
public const val EPOLLIN: CInt = 0x1
public const val EPOLLPRI: CInt = 0x2
public const val EPOLLOUT: CInt = 0x4
public const val EPOLLERR: CInt = 0x8
public const val EPOLLHUP: CInt = 0x10
public const val EPOLLRDNORM: CInt = 0x40
public const val EPOLLRDBAND: CInt = 0x80
public const val EPOLLWRNORM: CInt = 0x100
public const val EPOLLWRBAND: CInt = 0x200
public const val EPOLLMSG: CInt = 0x400
public const val EPOLLRDHUP: CInt = 0x2000
public const val EPOLLEXCLUSIVE: CInt = 0x10000000
public const val EPOLLWAKEUP: CInt = 0x20000000
public const val EPOLLONESHOT: CInt = 0x40000000
public const val EPOLLET: CInt = 0x80000000
public const val EPOLL_CTL_ADD: CInt = 1
public const val EPOLL_CTL_MOD: CInt = 3
public const val EPOLL_CTL_DEL: CInt = 2
public const val MNT_FORCE: CInt = 0x1
public const val MNT_DETACH: CInt = 0x2
public const val MNT_EXPIRE: CInt = 0x4
public const val UMOUNT_NOFOLLOW: CInt = 0x8
public const val Q_GETFMT: CInt = 0x800004
public const val Q_GETINFO: CInt = 0x800005
public const val Q_SETINFO: CInt = 0x800006
public const val QIF_BLIMITS: UInt = 1u
public const val QIF_SPACE: UInt = 2u
public const val QIF_ILIMITS: UInt = 4u
public const val QIF_INODES: UInt = 8u
public const val QIF_BTIME: UInt = 16u
public const val QIF_ITIME: UInt = 32u
public const val QIF_LIMITS: UInt = 5u
public const val QIF_USAGE: UInt = 10u
public const val QIF_TIMES: UInt = 48u
public const val QIF_ALL: UInt = 63u
public const val Q_SYNC: CInt = 0x800001
public const val Q_QUOTAON: CInt = 0x800002
public const val Q_QUOTAOFF: CInt = 0x800003
public const val Q_GETQUOTA: CInt = 0x800007
public const val Q_SETQUOTA: CInt = 0x800008
public const val TCIOFF: CInt = 2
public const val TCION: CInt = 3
public const val TCOOFF: CInt = 0
public const val TCOON: CInt = 1
public const val TCIFLUSH: CInt = 0
public const val TCOFLUSH: CInt = 1
public const val TCIOFLUSH: CInt = 2
public const val NL0: TcflagT = 0x00000000
public const val NL1: TcflagT = 0x00000100
public const val TAB0: TcflagT = 0x00000000
public const val CR0: TcflagT = 0x00000000
public const val FF0: TcflagT = 0x00000000
public const val BS0: TcflagT = 0x00000000
public const val VT0: TcflagT = 0x00000000
public const val VERASE: ULong = 2uL
public const val VKILL: ULong = 3uL
public const val VINTR: ULong = 0uL
public const val VQUIT: ULong = 1uL
public const val VLNEXT: ULong = 15uL
public const val IGNBRK: TcflagT = 0x00000001
public const val BRKINT: TcflagT = 0x00000002
public const val IGNPAR: TcflagT = 0x00000004
public const val PARMRK: TcflagT = 0x00000008
public const val INPCK: TcflagT = 0x00000010
public const val ISTRIP: TcflagT = 0x00000020
public const val INLCR: TcflagT = 0x00000040
public const val IGNCR: TcflagT = 0x00000080
public const val ICRNL: TcflagT = 0x00000100
public const val IXANY: TcflagT = 0x00000800
public const val IMAXBEL: TcflagT = 0x00002000
public const val OPOST: TcflagT = 0x1
public const val CS5: TcflagT = 0x00000000
public const val CRTSCTS: TcflagT = 0x80000000
public const val ECHO: TcflagT = 0x00000008
public const val OCRNL: TcflagT = 8
public const val ONOCR: TcflagT = 16
public const val ONLRET: TcflagT = 32
public const val OFILL: TcflagT = 64
public const val OFDEL: TcflagT = 128
public const val CLONE_VM: CInt = 0x100
public const val CLONE_FS: CInt = 0x200
public const val CLONE_FILES: CInt = 0x400
public const val CLONE_SIGHAND: CInt = 0x800
public const val CLONE_PTRACE: CInt = 0x2000
public const val CLONE_VFORK: CInt = 0x4000
public const val CLONE_PARENT: CInt = 0x8000
public const val CLONE_THREAD: CInt = 0x10000
public const val CLONE_NEWNS: CInt = 0x20000
public const val CLONE_SYSVSEM: CInt = 0x40000
public const val CLONE_SETTLS: CInt = 0x80000
public const val CLONE_PARENT_SETTID: CInt = 0x100000
public const val CLONE_CHILD_CLEARTID: CInt = 0x200000
public const val CLONE_DETACHED: CInt = 0x400000
public const val CLONE_UNTRACED: CInt = 0x800000
public const val CLONE_CHILD_SETTID: CInt = 0x01000000
public const val CLONE_NEWCGROUP: CInt = 0x02000000
public const val CLONE_NEWUTS: CInt = 0x04000000
public const val CLONE_NEWIPC: CInt = 0x08000000
public const val CLONE_NEWUSER: CInt = 0x10000000
public const val CLONE_NEWPID: CInt = 0x20000000
public const val CLONE_NEWNET: CInt = 0x40000000
public const val CLONE_IO: CInt = 0x80000000
public const val WNOHANG: CInt = 0x00000001
public const val WUNTRACED: CInt = 0x00000002
public const val WSTOPPED: CInt = WUNTRACED
public const val WEXITED: CInt = 0x00000004
public const val WCONTINUED: CInt = 0x00000008
public const val WNOWAIT: CInt = 0x01000000
public const val ADDR_NO_RANDOMIZE: CInt = 0x0040000
public const val MMAP_PAGE_ZERO: CInt = 0x0100000
public const val ADDR_COMPAT_LAYOUT: CInt = 0x0200000
public const val READ_IMPLIES_EXEC: CInt = 0x0400000
public const val ADDR_LIMIT_32BIT: CInt = 0x0800000
public const val SHORT_INODE: CInt = 0x1000000
public const val WHOLE_SECONDS: CInt = 0x2000000
public const val STICKY_TIMEOUTS: CInt = 0x4000000
public const val ADDR_LIMIT_3GB: CInt = 0x8000000
public const val PTRACE_O_TRACESYSGOOD: CInt = 0x00000001
public const val PTRACE_O_TRACEFORK: CInt = 0x00000002
public const val PTRACE_O_TRACEVFORK: CInt = 0x00000004
public const val PTRACE_O_TRACECLONE: CInt = 0x00000008
public const val PTRACE_O_TRACEEXEC: CInt = 0x00000010
public const val PTRACE_O_TRACEVFORKDONE: CInt = 0x00000020
public const val PTRACE_O_TRACEEXIT: CInt = 0x00000040
public const val PTRACE_O_TRACESECCOMP: CInt = 0x00000080
public const val PTRACE_O_SUSPEND_SECCOMP: CInt = 0x00200000
public const val PTRACE_O_EXITKILL: CInt = 0x00100000
public const val PTRACE_O_MASK: CInt = 0x003000ff
public const val PTRACE_EVENT_FORK: CInt = 1
public const val PTRACE_EVENT_VFORK: CInt = 2
public const val PTRACE_EVENT_CLONE: CInt = 3
public const val PTRACE_EVENT_EXEC: CInt = 4
public const val PTRACE_EVENT_VFORK_DONE: CInt = 5
public const val PTRACE_EVENT_EXIT: CInt = 6
public const val PTRACE_EVENT_SECCOMP: CInt = 7
public const val __WNOTHREAD: CInt = 0x20000000
public const val __WALL: CInt = 0x40000000
public const val __WCLONE: CInt = 0x80000000
public const val SPLICE_F_MOVE: CUInt = 0x01u
public const val SPLICE_F_NONBLOCK: CUInt = 0x02u
public const val SPLICE_F_MORE: CUInt = 0x04u
public const val SPLICE_F_GIFT: CUInt = 0x08u
public const val RTLD_LOCAL: CInt = 0
public const val RTLD_LAZY: CInt = 1
public const val POSIX_FADV_NORMAL: CInt = 0
public const val POSIX_FADV_RANDOM: CInt = 1
public const val POSIX_FADV_SEQUENTIAL: CInt = 2
public const val POSIX_FADV_WILLNEED: CInt = 3
public const val AT_FDCWD: CInt = -100
public const val AT_SYMLINK_NOFOLLOW: CInt = 0x100
public const val AT_REMOVEDIR: CInt = 0x200
public const val AT_SYMLINK_FOLLOW: CInt = 0x400
public const val AT_NO_AUTOMOUNT: CInt = 0x800
public const val AT_EMPTY_PATH: CInt = 0x1000
public const val AT_RECURSIVE: CInt = 0x8000
public val LOG_CRON: CInt = 9 shl 3
public val LOG_AUTHPRIV: CInt = 10 shl 3
public val LOG_FTP: CInt = 11 shl 3
public const val LOG_PERROR: CInt = 0x20
public const val PIPE_BUF: ULong = 4096uL
public const val SI_LOAD_SHIFT: CUInt = 16u
public const val SI_USER: CInt = 0
public const val SI_KERNEL: CInt = 0x80
public const val SI_QUEUE: CInt = -1
public const val SI_TIMER: CInt = -2
public const val SI_MESGQ: CInt = -3
public const val SI_ASYNCIO: CInt = -4
public const val SI_TIMER: CInt = -3
public const val SI_MESGQ: CInt = -4
public const val SI_ASYNCIO: CInt = -2
public const val SI_SIGIO: CInt = -5
public const val SI_TKILL: CInt = -6
public const val SI_ASYNCNL: CInt = -60
public const val BUS_ADRALN: CInt = 1
public const val BUS_ADRERR: CInt = 2
public const val BUS_OBJERR: CInt = 3
public const val BUS_MCEERR_AR: CInt = 4
public const val BUS_MCEERR_AO: CInt = 5
public const val TRAP_BRKPT: CInt = 1
public const val TRAP_TRACE: CInt = 2
public const val TRAP_BRANCH: CInt = 3
public const val TRAP_HWBKPT: CInt = 4
public const val TRAP_UNK: CInt = 5
public const val CLD_EXITED: CInt = 1
public const val CLD_KILLED: CInt = 2
public const val CLD_DUMPED: CInt = 3
public const val CLD_TRAPPED: CInt = 4
public const val CLD_STOPPED: CInt = 5
public const val CLD_CONTINUED: CInt = 6
public const val SIGEV_SIGNAL: CInt = 0
public const val SIGEV_NONE: CInt = 1
public const val SIGEV_THREAD: CInt = 2
public const val P_ALL: IdtypeT = 0
public const val P_PID: IdtypeT = 1
public const val P_PGID: IdtypeT = 2
public const val P_PIDFD: IdtypeT = 3
public const val UTIME_OMIT: CLong = 1073741822
public const val UTIME_NOW: CLong = 1073741823
public const val POLLIN: CShort = 0x1
public const val POLLPRI: CShort = 0x2
public const val POLLOUT: CShort = 0x4
public const val POLLERR: CShort = 0x8
public const val POLLHUP: CShort = 0x10
public const val POLLNVAL: CShort = 0x20
public const val POLLRDNORM: CShort = 0x040
public const val POLLRDBAND: CShort = 0x080
public const val POLLRDHUP: CShort = 0x2000
public const val POLLRDHUP: CShort = 0x800
public const val IPTOS_LOWDELAY: UByte = 0x10u
public const val IPTOS_THROUGHPUT: UByte = 0x08u
public const val IPTOS_RELIABILITY: UByte = 0x04u
public const val IPTOS_MINCOST: UByte = 0x02u
public const val IPTOS_PREC_NETCONTROL: UByte = 0xe0u
public const val IPTOS_PREC_INTERNETCONTROL: UByte = 0xc0u
public const val IPTOS_PREC_CRITIC_ECP: UByte = 0xa0u
public const val IPTOS_PREC_FLASHOVERRIDE: UByte = 0x80u
public const val IPTOS_PREC_FLASH: UByte = 0x60u
public const val IPTOS_PREC_IMMEDIATE: UByte = 0x40u
public const val IPTOS_PREC_PRIORITY: UByte = 0x20u
public const val IPTOS_PREC_ROUTINE: UByte = 0x00u
public const val IPTOS_ECN_MASK: UByte = 0x03u
public const val IPTOS_ECN_ECT1: UByte = 0x01u
public const val IPTOS_ECN_ECT0: UByte = 0x02u
public const val IPTOS_ECN_CE: UByte = 0x03u
public const val IPOPT_COPY: UByte = 0x80u
public const val IPOPT_CLASS_MASK: UByte = 0x60u
public const val IPOPT_NUMBER_MASK: UByte = 0x1fu
public const val IPOPT_CONTROL: UByte = 0x00u
public const val IPOPT_RESERVED1: UByte = 0x20u
public const val IPOPT_MEASUREMENT: UByte = 0x40u
public const val IPOPT_RESERVED2: UByte = 0x60u
public val IPOPT_END: UByte = 0 or IPOPT_CONTROL
public val IPOPT_NOOP: UByte = 1 or IPOPT_CONTROL
public val IPOPT_SEC: UByte = 2 or IPOPT_CONTROL or IPOPT_COPY
public val IPOPT_LSRR: UByte = 3 or IPOPT_CONTROL or IPOPT_COPY
public val IPOPT_TIMESTAMP: UByte = 4 or IPOPT_MEASUREMENT
public val IPOPT_RR: UByte = 7 or IPOPT_CONTROL
public val IPOPT_SID: UByte = 8 or IPOPT_CONTROL or IPOPT_COPY
public val IPOPT_SSRR: UByte = 9 or IPOPT_CONTROL or IPOPT_COPY
public val IPOPT_RA: UByte = 20 or IPOPT_CONTROL or IPOPT_COPY
public const val IPVERSION: UByte = 4u
public const val MAXTTL: UByte = 255u
public const val IPDEFTTL: UByte = 64u
public const val IPOPT_OPTVAL: UByte = 0u
public const val IPOPT_OLEN: UByte = 1u
public const val IPOPT_OFFSET: UByte = 2u
public const val IPOPT_MINOFF: UByte = 4u
public const val MAX_IPOPTLEN: UByte = 40u
public const val IPOPT_NOP: UByte = IPOPT_NOOP
public const val IPOPT_EOL: UByte = IPOPT_END
public const val IPOPT_TS: UByte = IPOPT_TIMESTAMP
public const val IPOPT_TS_TSONLY: UByte = 0u
public const val IPOPT_TS_TSANDADDR: UByte = 1u
public const val IPOPT_TS_PRESPEC: UByte = 3u
public const val ARPOP_RREQUEST: UShort = 3u
public const val ARPOP_RREPLY: UShort = 4u
public const val ARPOP_InREQUEST: UShort = 8u
public const val ARPOP_InREPLY: UShort = 9u
public const val ARPOP_NAK: UShort = 10u
public const val ATF_NETMASK: CInt = 0x20
public const val ATF_DONTPUB: CInt = 0x40
public const val ARPHRD_NETROM: UShort = 0u
public const val ARPHRD_ETHER: UShort = 1u
public const val ARPHRD_EETHER: UShort = 2u
public const val ARPHRD_AX25: UShort = 3u
public const val ARPHRD_PRONET: UShort = 4u
public const val ARPHRD_CHAOS: UShort = 5u
public const val ARPHRD_IEEE802: UShort = 6u
public const val ARPHRD_ARCNET: UShort = 7u
public const val ARPHRD_APPLETLK: UShort = 8u
public const val ARPHRD_DLCI: UShort = 15u
public const val ARPHRD_ATM: UShort = 19u
public const val ARPHRD_METRICOM: UShort = 23u
public const val ARPHRD_IEEE1394: UShort = 24u
public const val ARPHRD_EUI64: UShort = 27u
public const val ARPHRD_INFINIBAND: UShort = 32u
public const val ARPHRD_SLIP: UShort = 256u
public const val ARPHRD_CSLIP: UShort = 257u
public const val ARPHRD_SLIP6: UShort = 258u
public const val ARPHRD_CSLIP6: UShort = 259u
public const val ARPHRD_RSRVD: UShort = 260u
public const val ARPHRD_ADAPT: UShort = 264u
public const val ARPHRD_ROSE: UShort = 270u
public const val ARPHRD_X25: UShort = 271u
public const val ARPHRD_HWX25: UShort = 272u
public const val ARPHRD_CAN: UShort = 280u
public const val ARPHRD_PPP: UShort = 512u
public const val ARPHRD_CISCO: UShort = 513u
public const val ARPHRD_HDLC: UShort = ARPHRD_CISCO
public const val ARPHRD_LAPB: UShort = 516u
public const val ARPHRD_DDCMP: UShort = 517u
public const val ARPHRD_RAWHDLC: UShort = 518u
public const val ARPHRD_TUNNEL: UShort = 768u
public const val ARPHRD_TUNNEL6: UShort = 769u
public const val ARPHRD_FRAD: UShort = 770u
public const val ARPHRD_SKIP: UShort = 771u
public const val ARPHRD_LOOPBACK: UShort = 772u
public const val ARPHRD_LOCALTLK: UShort = 773u
public const val ARPHRD_FDDI: UShort = 774u
public const val ARPHRD_BIF: UShort = 775u
public const val ARPHRD_SIT: UShort = 776u
public const val ARPHRD_IPDDP: UShort = 777u
public const val ARPHRD_IPGRE: UShort = 778u
public const val ARPHRD_PIMREG: UShort = 779u
public const val ARPHRD_HIPPI: UShort = 780u
public const val ARPHRD_ASH: UShort = 781u
public const val ARPHRD_ECONET: UShort = 782u
public const val ARPHRD_IRDA: UShort = 783u
public const val ARPHRD_FCPP: UShort = 784u
public const val ARPHRD_FCAL: UShort = 785u
public const val ARPHRD_FCPL: UShort = 786u
public const val ARPHRD_FCFABRIC: UShort = 787u
public const val ARPHRD_IEEE802_TR: UShort = 800u
public const val ARPHRD_IEEE80211: UShort = 801u
public const val ARPHRD_IEEE80211_PRISM: UShort = 802u
public const val ARPHRD_IEEE80211_RADIOTAP: UShort = 803u
public const val ARPHRD_IEEE802154: UShort = 804u
public const val ARPHRD_VOID: UShort = 0xFFFFu
public const val ARPHRD_NONE: UShort = 0xFFFEu
public const val IFF_TUN: CInt = 0x0001
public const val IFF_TAP: CInt = 0x0002
public const val IFF_NAPI: CInt = 0x0010
public const val IFF_NAPI_FRAGS: CInt = 0x0020
public const val IFF_NO_CARRIER: CInt = 0x0040
public const val IFF_NO_PI: CInt = 0x1000
public const val TUN_READQ_SIZE: CShort = 500
public val TUN_TUN_DEV: CShort = IFF_TUN.toShort()
public val TUN_TAP_DEV: CShort = IFF_TAP.toShort()
public const val TUN_TYPE_MASK: CShort = 0x000f
public const val IFF_ONE_QUEUE: CInt = 0x2000
public const val IFF_VNET_HDR: CInt = 0x4000
public const val IFF_TUN_EXCL: CInt = 0x8000
public const val IFF_MULTI_QUEUE: CInt = 0x0100
public const val IFF_ATTACH_QUEUE: CInt = 0x0200
public const val IFF_DETACH_QUEUE: CInt = 0x0400
public const val IFF_PERSIST: CInt = 0x0800
public const val IFF_NOFILTER: CInt = 0x1000
public const val TUN_TX_TIMESTAMP: CInt = 1
public const val TUN_F_CSUM: CUInt = 0x01u
public const val TUN_F_TSO4: CUInt = 0x02u
public const val TUN_F_TSO6: CUInt = 0x04u
public const val TUN_F_TSO_ECN: CUInt = 0x08u
public const val TUN_F_UFO: CUInt = 0x10u
public const val TUN_F_USO4: CUInt = 0x20u
public const val TUN_F_USO6: CUInt = 0x40u
public const val TUN_PKT_STRIP: CInt = 0x0001
public const val TUN_FLT_ALLMULTI: CInt = 0x0001
public const val TUNSETNOCSUM: Ioctl = <c_int>(T_TYPE, 200)
public const val TUNSETDEBUG: Ioctl = <c_int>(T_TYPE, 201)
public const val TUNSETIFF: Ioctl = <c_int>(T_TYPE, 202)
public const val TUNSETPERSIST: Ioctl = <c_int>(T_TYPE, 203)
public const val TUNSETOWNER: Ioctl = <c_int>(T_TYPE, 204)
public const val TUNSETLINK: Ioctl = <c_int>(T_TYPE, 205)
public const val TUNSETGROUP: Ioctl = <c_int>(T_TYPE, 206)
public const val TUNGETFEATURES: Ioctl = <c_int>(T_TYPE, 207)
public const val TUNSETOFFLOAD: Ioctl = <c_int>(T_TYPE, 208)
public const val TUNSETTXFILTER: Ioctl = <c_int>(T_TYPE, 209)
public const val TUNGETIFF: Ioctl = <c_int>(T_TYPE, 210)
public const val TUNGETSNDBUF: Ioctl = <c_int>(T_TYPE, 211)
public const val TUNSETSNDBUF: Ioctl = <c_int>(T_TYPE, 212)
public const val TUNATTACHFILTER: Ioctl = <sock_fprog>(T_TYPE, 213)
public const val TUNDETACHFILTER: Ioctl = <sock_fprog>(T_TYPE, 214)
public const val TUNGETVNETHDRSZ: Ioctl = <c_int>(T_TYPE, 215)
public const val TUNSETVNETHDRSZ: Ioctl = <c_int>(T_TYPE, 216)
public const val TUNSETQUEUE: Ioctl = <c_int>(T_TYPE, 217)
public const val TUNSETIFINDEX: Ioctl = <c_int>(T_TYPE, 218)
public const val TUNGETFILTER: Ioctl = <sock_fprog>(T_TYPE, 219)
public const val TUNSETVNETLE: Ioctl = <c_int>(T_TYPE, 220)
public const val TUNGETVNETLE: Ioctl = <c_int>(T_TYPE, 221)
public const val TUNSETVNETBE: Ioctl = <c_int>(T_TYPE, 222)
public const val TUNGETVNETBE: Ioctl = <c_int>(T_TYPE, 223)
public const val TUNSETSTEERINGEBPF: Ioctl = <c_int>(T_TYPE, 224)
public const val TUNSETFILTEREBPF: Ioctl = <c_int>(T_TYPE, 225)
public const val TUNSETCARRIER: Ioctl = <c_int>(T_TYPE, 226)
public const val TUNGETDEVNETNS: Ioctl = _IO(T_TYPE, 227)
public val FS_IOC_GETFLAGS: Ioctl = <c_long>('f'.toUInt(), 1)
public val FS_IOC_SETFLAGS: Ioctl = <c_long>('f'.toUInt(), 2)
public val FS_IOC_GETVERSION: Ioctl = <c_long>('v'.toUInt(), 1)
public val FS_IOC_SETVERSION: Ioctl = <c_long>('v'.toUInt(), 2)
public val FS_IOC32_GETFLAGS: Ioctl = <c_int>('f'.toUInt(), 1)
public val FS_IOC32_SETFLAGS: Ioctl = <c_int>('f'.toUInt(), 2)
public val FS_IOC32_GETVERSION: Ioctl = <c_int>('v'.toUInt(), 1)
public val FS_IOC32_SETVERSION: Ioctl = <c_int>('v'.toUInt(), 2)
public const val FICLONE: Ioctl = <c_int>(0x94, 9)
public const val FICLONERANGE: Ioctl = <file_clone_range>(0x94, 13)
public const val ADFS_SUPER_MAGIC: CLong = 0x0000adf5
public const val AFFS_SUPER_MAGIC: CLong = 0x0000adff
public const val AFS_SUPER_MAGIC: CLong = 0x5346414f
public const val AUTOFS_SUPER_MAGIC: CLong = 0x0187
public const val BPF_FS_MAGIC: CLong = 0xcafe4a11
public const val BTRFS_SUPER_MAGIC: CLong = 0x9123683e
public const val CGROUP2_SUPER_MAGIC: CLong = 0x63677270
public const val CGROUP_SUPER_MAGIC: CLong = 0x27e0eb
public const val CODA_SUPER_MAGIC: CLong = 0x73757245
public const val CRAMFS_MAGIC: CLong = 0x28cd3d45
public const val DEBUGFS_MAGIC: CLong = 0x64626720
public const val DEVPTS_SUPER_MAGIC: CLong = 0x1cd1
public const val ECRYPTFS_SUPER_MAGIC: CLong = 0xf15f
public const val EFS_SUPER_MAGIC: CLong = 0x00414a53
public const val EXT2_SUPER_MAGIC: CLong = 0x0000ef53
public const val EXT3_SUPER_MAGIC: CLong = 0x0000ef53
public const val EXT4_SUPER_MAGIC: CLong = 0x0000ef53
public const val F2FS_SUPER_MAGIC: CLong = 0xf2f52010
public const val FUSE_SUPER_MAGIC: CLong = 0x65735546
public const val FUTEXFS_SUPER_MAGIC: CLong = 0xbad1dea
public const val HOSTFS_SUPER_MAGIC: CLong = 0x00c0ffee
public const val HPFS_SUPER_MAGIC: CLong = 0xf995e849
public const val HUGETLBFS_MAGIC: CLong = 0x958458f6
public const val ISOFS_SUPER_MAGIC: CLong = 0x00009660
public const val JFFS2_SUPER_MAGIC: CLong = 0x000072b6
public const val MINIX2_SUPER_MAGIC2: CLong = 0x00002478
public const val MINIX2_SUPER_MAGIC: CLong = 0x00002468
public const val MINIX3_SUPER_MAGIC: CLong = 0x4d5a
public const val MINIX_SUPER_MAGIC2: CLong = 0x0000138f
public const val MINIX_SUPER_MAGIC: CLong = 0x0000137f
public const val MSDOS_SUPER_MAGIC: CLong = 0x00004d44
public const val NCP_SUPER_MAGIC: CLong = 0x0000564c
public const val NFS_SUPER_MAGIC: CLong = 0x00006969
public const val NILFS_SUPER_MAGIC: CLong = 0x3434
public const val OCFS2_SUPER_MAGIC: CLong = 0x7461636f
public const val OPENPROM_SUPER_MAGIC: CLong = 0x00009fa1
public const val OVERLAYFS_SUPER_MAGIC: CLong = 0x794c7630
public const val PROC_SUPER_MAGIC: CLong = 0x00009fa0
public const val QNX4_SUPER_MAGIC: CLong = 0x0000002f
public const val QNX6_SUPER_MAGIC: CLong = 0x68191122
public const val RDTGROUP_SUPER_MAGIC: CLong = 0x7655821
public const val REISERFS_SUPER_MAGIC: CLong = 0x52654973
public const val SECURITYFS_MAGIC: CLong = 0x73636673
public const val SELINUX_MAGIC: CLong = 0xf97cff8c
public const val SMACK_MAGIC: CLong = 0x43415d53
public const val SMB_SUPER_MAGIC: CLong = 0x0000517b
public const val SYSFS_MAGIC: CLong = 0x62656572
public const val TMPFS_MAGIC: CLong = 0x01021994
public const val TRACEFS_MAGIC: CLong = 0x74726163
public const val UDF_SUPER_MAGIC: CLong = 0x15013346
public const val USBDEVICE_SUPER_MAGIC: CLong = 0x00009fa2
public const val XENFS_SUPER_MAGIC: CLong = 0xabba1974
public const val NSFS_MAGIC: CLong = 0x6e736673
public const val ADFS_SUPER_MAGIC: CUInt = 0x0000adf5u
public const val AFFS_SUPER_MAGIC: CUInt = 0x0000adffu
public const val AFS_SUPER_MAGIC: CUInt = 0x5346414fu
public const val AUTOFS_SUPER_MAGIC: CUInt = 0x0187u
public const val BPF_FS_MAGIC: CUInt = 0xcafe4a11u
public const val BTRFS_SUPER_MAGIC: CUInt = 0x9123683eu
public const val CGROUP2_SUPER_MAGIC: CUInt = 0x63677270u
public const val CGROUP_SUPER_MAGIC: CUInt = 0x27e0ebu
public const val CODA_SUPER_MAGIC: CUInt = 0x73757245u
public const val CRAMFS_MAGIC: CUInt = 0x28cd3d45u
public const val DEBUGFS_MAGIC: CUInt = 0x64626720u
public const val DEVPTS_SUPER_MAGIC: CUInt = 0x1cd1u
public const val ECRYPTFS_SUPER_MAGIC: CUInt = 0xf15fu
public const val EFS_SUPER_MAGIC: CUInt = 0x00414a53u
public const val EXT2_SUPER_MAGIC: CUInt = 0x0000ef53u
public const val EXT3_SUPER_MAGIC: CUInt = 0x0000ef53u
public const val EXT4_SUPER_MAGIC: CUInt = 0x0000ef53u
public const val F2FS_SUPER_MAGIC: CUInt = 0xf2f52010u
public const val FUSE_SUPER_MAGIC: CUInt = 0x65735546u
public const val FUTEXFS_SUPER_MAGIC: CUInt = 0xbad1deau
public const val HOSTFS_SUPER_MAGIC: CUInt = 0x00c0ffeeu
public const val HPFS_SUPER_MAGIC: CUInt = 0xf995e849u
public const val HUGETLBFS_MAGIC: CUInt = 0x958458f6u
public const val ISOFS_SUPER_MAGIC: CUInt = 0x00009660u
public const val JFFS2_SUPER_MAGIC: CUInt = 0x000072b6u
public const val MINIX2_SUPER_MAGIC2: CUInt = 0x00002478u
public const val MINIX2_SUPER_MAGIC: CUInt = 0x00002468u
public const val MINIX3_SUPER_MAGIC: CUInt = 0x4d5au
public const val MINIX_SUPER_MAGIC2: CUInt = 0x0000138fu
public const val MINIX_SUPER_MAGIC: CUInt = 0x0000137fu
public const val MSDOS_SUPER_MAGIC: CUInt = 0x00004d44u
public const val NCP_SUPER_MAGIC: CUInt = 0x0000564cu
public const val NFS_SUPER_MAGIC: CUInt = 0x00006969u
public const val NILFS_SUPER_MAGIC: CUInt = 0x3434u
public const val OCFS2_SUPER_MAGIC: CUInt = 0x7461636fu
public const val OPENPROM_SUPER_MAGIC: CUInt = 0x00009fa1u
public const val OVERLAYFS_SUPER_MAGIC: CUInt = 0x794c7630u
public const val PROC_SUPER_MAGIC: CUInt = 0x00009fa0u
public const val QNX4_SUPER_MAGIC: CUInt = 0x0000002fu
public const val QNX6_SUPER_MAGIC: CUInt = 0x68191122u
public const val RDTGROUP_SUPER_MAGIC: CUInt = 0x7655821u
public const val REISERFS_SUPER_MAGIC: CUInt = 0x52654973u
public const val SECURITYFS_MAGIC: CUInt = 0x73636673u
public const val SELINUX_MAGIC: CUInt = 0xf97cff8cu
public const val SMACK_MAGIC: CUInt = 0x43415d53u
public const val SMB_SUPER_MAGIC: CUInt = 0x0000517bu
public const val SYSFS_MAGIC: CUInt = 0x62656572u
public const val TMPFS_MAGIC: CUInt = 0x01021994u
public const val TRACEFS_MAGIC: CUInt = 0x74726163u
public const val UDF_SUPER_MAGIC: CUInt = 0x15013346u
public const val USBDEVICE_SUPER_MAGIC: CUInt = 0x00009fa2u
public const val XENFS_SUPER_MAGIC: CUInt = 0xabba1974u
public const val NSFS_MAGIC: CUInt = 0x6e736673u
public const val AT_STATX_SYNC_TYPE: CInt = 0x6000
public const val AT_STATX_SYNC_AS_STAT: CInt = 0x0000
public const val AT_STATX_FORCE_SYNC: CInt = 0x2000
public const val AT_STATX_DONT_SYNC: CInt = 0x4000
public const val STATX_TYPE: CUInt = 0x0001u
public const val STATX_MODE: CUInt = 0x0002u
public const val STATX_NLINK: CUInt = 0x0004u
public const val STATX_UID: CUInt = 0x0008u
public const val STATX_GID: CUInt = 0x0010u
public const val STATX_ATIME: CUInt = 0x0020u
public const val STATX_MTIME: CUInt = 0x0040u
public const val STATX_CTIME: CUInt = 0x0080u
public const val STATX_INO: CUInt = 0x0100u
public const val STATX_SIZE: CUInt = 0x0200u
public const val STATX_BLOCKS: CUInt = 0x0400u
public const val STATX_BASIC_STATS: CUInt = 0x07ffu
public const val STATX_BTIME: CUInt = 0x0800u
public const val STATX_ALL: CUInt = 0x0fffu
public const val STATX_MNT_ID: CUInt = 0x1000u
public const val STATX_DIOALIGN: CUInt = 0x2000u
public const val STATX__RESERVED: CInt = 0x80000000
public const val STATX_ATTR_COMPRESSED: CInt = 0x0004
public const val STATX_ATTR_IMMUTABLE: CInt = 0x0010
public const val STATX_ATTR_APPEND: CInt = 0x0020
public const val STATX_ATTR_NODUMP: CInt = 0x0040
public const val STATX_ATTR_ENCRYPTED: CInt = 0x0800
public const val STATX_ATTR_AUTOMOUNT: CInt = 0x1000
public const val STATX_ATTR_MOUNT_ROOT: CInt = 0x2000
public const val STATX_ATTR_VERITY: CInt = 0x100000
public const val STATX_ATTR_DAX: CInt = 0x200000

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr?
public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?
public expect fun fDCLR(fd: CInt, set: FdSet?)
public expect fun fDISSET(fd: CInt, set: FdSet?): Boolean
public expect fun fDSET(fd: CInt, set: FdSet?)
public expect fun fDZERO(set: FdSet?)
public expect fun sIGRTMAX(): CInt
public expect fun sIGRTMIN(): CInt

public expect fun ioctl(fd: CInt, request: Ioctl, vararg args: Any?): CInt
public expect fun libcCurrentSigrtmax(): CInt
public expect fun libcCurrentSigrtmin(): CInt
public expect fun semDestroy(sem: SemT?): CInt
public expect fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt
public expect fun fdatasync(fd: CInt): CInt
public expect fun mincore(addr: COpaquePointer?, len: ULong, vec: COpaquePointer?): CInt
public expect fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt
public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt
public expect fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt
public expect fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt
public expect fun getitimer(which: CInt, currValue: Itimerval?): CInt
public expect fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt
public expect fun dirfd(dirp: DIR?): CInt
public expect fun memalign(align: ULong, size: ULong): COpaquePointer?
public expect fun setgroups(ngroups: ULong, ptr: GidT?): CInt
public expect fun pipe2(fds: CInt?, flags: CInt): CInt
public expect fun statfs(path: String?, buf: Statfs?): CInt
public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt
public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?
public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt
public expect fun futimens(fd: CInt, times: Timespec?): CInt
public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt
public expect fun duplocale(base: LocaleT): LocaleT
public expect fun freelocale(loc: LocaleT)
public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT
public expect fun uselocale(loc: LocaleT): LocaleT
public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt
public expect fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt
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
public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun getifaddrs(ifap: COpaquePointer?): CInt
public expect fun freeifaddrs(ifa: Ifaddrs?)
public expect fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt
public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT
public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT
public expect fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT
public expect fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT
public expect fun uname(buf: Utsname?): CInt
public expect fun strchrnul(s: String?, c: CInt): String?
public expect fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong
public expect fun strftimeL(s: String?, max: ULong, format: String?, tm: Tm?, locale: LocaleT): ULong
public expect fun strptime(s: String?, format: String?, tm: Tm?): String?
public expect fun mkostemp(template: String?, flags: CInt): CInt
public expect fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt
public expect fun getdomainname(name: String?, len: ULong): CInt
public expect fun setdomainname(name: String?, len: ULong): CInt
public expect fun ifNameindex(): IfNameindex?
public expect fun ifFreenameindex(ptr: IfNameindex?)
public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
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
public expect fun mmap64(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer?
public expect fun open64(path: String?, oflag: CInt, vararg args: Any?): CInt
public expect fun openat64(fd: CInt, path: String?, oflag: CInt, vararg args: Any?): CInt
public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt
public expect fun pread64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT
public expect fun pwrite64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT
public expect fun readdir64(dirp: DIR?): Dirent64?
public expect fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): CInt
public expect fun stat64(path: String?, buf: Stat64?): CInt
public expect fun truncate64(path: String?, length: Off64T): CInt
public expect fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT
public expect fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT
public expect fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT
public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt
public expect fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUInt, statxbuf: Statx?): CInt
