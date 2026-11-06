package io.github.kotlinmania.libc

// Definitions found commonly among almost all Unix derivatives
//
// More functions and definitions can be found in the more specific modules
// according to the platform in question.

public fun interface AtexitCbCallback {
    public operator fun invoke()
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface CloneCbCallback {
    public operator fun invoke(arg0: COpaquePointer?): CInt
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: DlPhdrInfo?, size: SizeT, data: COpaquePointer?): CInt
}

// PUB_TYPE
public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias LocaleT = COpaquePointer?

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public typealias PidT = Int

public typealias UidT = UInt

public typealias GidT = UInt

public typealias InAddrT = UInt

public typealias InPortT = UShort

public typealias SighandlerT = SizeT

public typealias CcT = CUchar

public typealias SaFamilyT = UShort

public typealias PthreadKeyT = CUint

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias ClockidT = CInt

public typealias KeyT = CInt

public typealias IdT = CUint

public typealias UsecondsT = UInt

public typealias DevT = ULong

public typealias SocklenT = UInt

public typealias PthreadT = CUlong

public typealias ModeT = UInt

public typealias Ino64T = ULong

public typealias Off64T = Long

public typealias Blkcnt64T = Long

public typealias Rlim64T = ULong

public typealias MqdT = CInt

public typealias NfdsT = CUlong

public typealias NlItem = CInt

public typealias IdtypeT = CUint

public typealias LoffT = CLonglong

public typealias U8 = CUchar

public typealias U16 = CUshort

public typealias S16 = CShort

public typealias U32 = CUint

public typealias S32 = CInt

public typealias Elf32Half = UShort

public typealias Elf32Word = UInt

public typealias Elf32Off = UInt

public typealias Elf32Addr = UInt

public typealias Elf64Half = UShort

public typealias Elf64Word = UInt

public typealias Elf64Off = ULong

public typealias Elf64Addr = ULong

public typealias Elf64Xword = ULong

public typealias ClockT = CLong

public typealias TimeT = CLong

public typealias SusecondsT = CLong

public typealias InoT = ULong

public typealias OffT = Long

public typealias BlkcntT = Long

public typealias ShmattT = CUlong

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias FsblkcntT = CUlonglong

public typealias FsfilcntT = CUlonglong

public typealias RlimT = CUlonglong

// PUB_CONST
public val INT_MIN: CInt = -2147483648

public val INT_MAX: CInt = 2147483647

public val SIG_DFL: SighandlerT = 0.toULong()

public val SIG_IGN: SighandlerT = 1.toULong()

public val SIG_ERR: SighandlerT = (0.inv()).toULong()

public val DT_UNKNOWN: UByte = 0u

public val DT_FIFO: UByte = 1u

public val DT_CHR: UByte = 2u

public val DT_DIR: UByte = 4u

public val DT_BLK: UByte = 6u

public val DT_REG: UByte = 8u

public val DT_LNK: UByte = 10u

public val DT_SOCK: UByte = 12u

public val FD_CLOEXEC: CInt = 0x1

public val USRQUOTA: CInt = 0

public val GRPQUOTA: CInt = 1

public val SIGIOT: CInt = 6

public val S_ISUID: ModeT = 2048u

public val S_ISGID: ModeT = 1024u

public val S_ISVTX: ModeT = 512u

public val IF_NAMESIZE: SizeT = 16uL

public val IFNAMSIZ: SizeT = IF_NAMESIZE

public val LOG_EMERG: CInt = 0

public val LOG_ALERT: CInt = 1

public val LOG_CRIT: CInt = 2

public val LOG_ERR: CInt = 3

public val LOG_WARNING: CInt = 4

public val LOG_NOTICE: CInt = 5

public val LOG_INFO: CInt = 6

public val LOG_DEBUG: CInt = 7

public val LOG_KERN: CInt = 0

public val LOG_USER: CInt = 1 shl 3

public val LOG_MAIL: CInt = 2 shl 3

public val LOG_DAEMON: CInt = 3 shl 3

public val LOG_AUTH: CInt = 4 shl 3

public val LOG_SYSLOG: CInt = 5 shl 3

public val LOG_LPR: CInt = 6 shl 3

public val LOG_NEWS: CInt = 7 shl 3

public val LOG_UUCP: CInt = 8 shl 3

public val LOG_LOCAL0: CInt = 16 shl 3

public val LOG_LOCAL1: CInt = 17 shl 3

public val LOG_LOCAL2: CInt = 18 shl 3

public val LOG_LOCAL3: CInt = 19 shl 3

public val LOG_LOCAL4: CInt = 20 shl 3

public val LOG_LOCAL5: CInt = 21 shl 3

public val LOG_LOCAL6: CInt = 22 shl 3

public val LOG_LOCAL7: CInt = 23 shl 3

public val LOG_PID: CInt = 0x01

public val LOG_CONS: CInt = 0x02

public val LOG_ODELAY: CInt = 0x04

public val LOG_NDELAY: CInt = 0x08

public val LOG_NOWAIT: CInt = 0x10

public val LOG_PRIMASK: CInt = 7

public val LOG_FACMASK: CInt = 0x3f8

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val PRIO_MIN: CInt = -20

public val PRIO_MAX: CInt = 20

public val IPPROTO_ICMP: CInt = 1

public val IPPROTO_ICMPV6: CInt = 58

public val IPPROTO_TCP: CInt = 6

public val IPPROTO_UDP: CInt = 17

public val IPPROTO_IP: CInt = 0

public val IPPROTO_IPV6: CInt = 41

public val INADDR_LOOPBACK: InAddrT = 2130706433u

public val INADDR_ANY: InAddrT = 0u

public val INADDR_BROADCAST: InAddrT = 4294967295u

public val INADDR_NONE: InAddrT = 4294967295u

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

public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_MONOTONIC: ClockidT = 1

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 3

public val CLOCK_MONOTONIC_RAW: ClockidT = 4

public val CLOCK_REALTIME_COARSE: ClockidT = 5

public val CLOCK_MONOTONIC_COARSE: ClockidT = 6

public val CLOCK_BOOTTIME: ClockidT = 7

public val CLOCK_REALTIME_ALARM: ClockidT = 8

public val CLOCK_BOOTTIME_ALARM: ClockidT = 9

public val CLOCK_SGI_CYCLE: ClockidT = 10

public val CLOCK_TAI: ClockidT = 11

public val TIMER_ABSTIME: CInt = 1

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_LOCKS: CInt = 10

public val RLIMIT_SIGPENDING: CInt = 11

public val RLIMIT_MSGQUEUE: CInt = 12

public val RLIMIT_NICE: CInt = 13

public val RLIMIT_RTPRIO: CInt = 14

public val RUSAGE_SELF: CInt = 0

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

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

public val LC_CTYPE: CInt = 0

public val LC_NUMERIC: CInt = 1

public val LC_TIME: CInt = 2

public val LC_COLLATE: CInt = 3

public val LC_MONETARY: CInt = 4

public val LC_MESSAGES: CInt = 5

public val LC_ALL: CInt = 6

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

public val MS_ACTIVE: CUlong = 0x40000000uL

public val MS_NOUSER: CUlong = 0x80000000uL

public val MS_MGC_VAL: CUlong = 0xc0ed0000uL

public val MS_MGC_MSK: CUlong = 0xffff0000uL

public val MS_RMT_MASK: CUlong = 0x800051uL

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

public val ENOTBLK: CInt = 15

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

public val EWOULDBLOCK: CInt = EAGAIN

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

public val MADV_HWPOISON: CInt = 100

public val MADV_SOFT_OFFLINE: CInt = 101

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

public val IFF_TUN: CInt = 0x0001

public val IFF_TAP: CInt = 0x0002

public val IFF_NO_PI: CInt = 0x1000

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

public val SOMAXCONN: CInt = 128

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

public val IP_RECVTOS: CInt = 13

public val IP_FREEBIND: CInt = 15

public val IP_TRANSPARENT: CInt = 19

public val IP_MULTICAST_IF: CInt = 32

public val IP_MULTICAST_TTL: CInt = 33

public val IP_MULTICAST_LOOP: CInt = 34

public val IP_ADD_MEMBERSHIP: CInt = 35

public val IP_DROP_MEMBERSHIP: CInt = 36

public val IPV6_UNICAST_HOPS: CInt = 16

public val IPV6_MULTICAST_IF: CInt = 17

public val IPV6_MULTICAST_HOPS: CInt = 18

public val IPV6_MULTICAST_LOOP: CInt = 19

public val IPV6_ADD_MEMBERSHIP: CInt = 20

public val IPV6_DROP_MEMBERSHIP: CInt = 21

public val IPV6_V6ONLY: CInt = 26

public val IPV6_RECVPKTINFO: CInt = 49

public val IPV6_RECVTCLASS: CInt = 66

public val IPV6_TCLASS: CInt = 67

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

public val PATH_MAX: CInt = 4096

public val FD_SETSIZE: Int = 1024

public val EPOLLIN: CInt = 0x1

public val EPOLLPRI: CInt = 0x2

public val EPOLLOUT: CInt = 0x4

public val EPOLLRDNORM: CInt = 0x40

public val EPOLLRDBAND: CInt = 0x80

public val EPOLLWRNORM: CInt = 0x100

public val EPOLLWRBAND: CInt = 0x200

public val EPOLLMSG: CInt = 0x400

public val EPOLLERR: CInt = 0x8

public val EPOLLHUP: CInt = 0x10

public val EPOLLET: CInt = 0x80000000

public val EPOLL_CTL_ADD: CInt = 1

public val EPOLL_CTL_MOD: CInt = 3

public val EPOLL_CTL_DEL: CInt = 2

public val MNT_DETACH: CInt = 0x2

public val MNT_EXPIRE: CInt = 0x4

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

public val MNT_FORCE: CInt = 0x1

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

public val NL0: CInt = 0x00000000

public val NL1: CInt = 0x00000100

public val TAB0: CInt = 0x00000000

public val CR0: CInt = 0x00000000

public val FF0: CInt = 0x00000000

public val BS0: CInt = 0x00000000

public val VT0: CInt = 0x00000000

public val VERASE: Int = 2

public val VKILL: Int = 3

public val VINTR: Int = 0

public val VQUIT: Int = 1

public val VLNEXT: Int = 15

public val IGNBRK: TcflagT = 0x00000001u

public val BRKINT: TcflagT = 0x00000002u

public val IGNPAR: TcflagT = 0x00000004u

public val PARMRK: TcflagT = 0x00000008u

public val INPCK: TcflagT = 0x00000010u

public val ISTRIP: TcflagT = 0x00000020u

public val INLCR: TcflagT = 0x00000040u

public val IGNCR: TcflagT = 0x00000080u

public val ICRNL: TcflagT = 0x00000100u

public val IXANY: TcflagT = 0x00000800u

public val IMAXBEL: TcflagT = 0x00002000u

public val OPOST: TcflagT = 0x1u

public val CS5: TcflagT = 0x00000000u

public val CRTSCTS: TcflagT = 0x80000000u

public val ECHO: TcflagT = 0x00000008u

public val OCRNL: TcflagT = 8u

public val ONOCR: TcflagT = 16u

public val ONLRET: TcflagT = 32u

public val OFILL: TcflagT = 64u

public val OFDEL: TcflagT = 128u

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

public val CLONE_NEWUTS: CInt = 0x04000000

public val CLONE_NEWIPC: CInt = 0x08000000

public val CLONE_NEWUSER: CInt = 0x10000000

public val CLONE_NEWPID: CInt = 0x20000000

public val CLONE_NEWNET: CInt = 0x40000000

public val CLONE_IO: CInt = 0x80000000

public val CLONE_NEWCGROUP: CInt = 0x02000000

public val WNOHANG: CInt = 0x00000001

public val WUNTRACED: CInt = 0x00000002

public val WSTOPPED: CInt = WUNTRACED

public val WEXITED: CInt = 0x00000004

public val WCONTINUED: CInt = 0x00000008

public val WNOWAIT: CInt = 0x01000000

// Options set using PTRACE_SETOPTIONS.
public val PTRACE_O_TRACESYSGOOD: CInt = 0x00000001

public val PTRACE_O_TRACEFORK: CInt = 0x00000002

public val PTRACE_O_TRACEVFORK: CInt = 0x00000004

public val PTRACE_O_TRACECLONE: CInt = 0x00000008

public val PTRACE_O_TRACEEXEC: CInt = 0x00000010

public val PTRACE_O_TRACEVFORKDONE: CInt = 0x00000020

public val PTRACE_O_TRACEEXIT: CInt = 0x00000040

public val PTRACE_O_TRACESECCOMP: CInt = 0x00000080

public val PTRACE_O_EXITKILL: CInt = 0x00100000

public val PTRACE_O_SUSPEND_SECCOMP: CInt = 0x00200000

public val PTRACE_O_MASK: CInt = 0x003000ff

// Wait extended result codes for the above trace options.
public val PTRACE_EVENT_FORK: CInt = 1

public val PTRACE_EVENT_VFORK: CInt = 2

public val PTRACE_EVENT_CLONE: CInt = 3

public val PTRACE_EVENT_EXEC: CInt = 4

public val PTRACE_EVENT_VFORK_DONE: CInt = 5

public val PTRACE_EVENT_EXIT: CInt = 6

public val PTRACE_EVENT_SECCOMP: CInt = 7

// PTRACE_EVENT_STOP was added to glibc in 2.26
// pub const PTRACE_EVENT_STOP: cInt = 128;
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

public val AT_EACCESS: CInt = 0x200

public val AT_SYMLINK_FOLLOW: CInt = 0x400

public val AT_NO_AUTOMOUNT: CInt = 0x800

public val AT_EMPTY_PATH: CInt = 0x1000

public val LOG_CRON: CInt = 9 shl 3

public val LOG_AUTHPRIV: CInt = 10 shl 3

public val LOG_FTP: CInt = 11 shl 3

public val LOG_PERROR: CInt = 0x20

public val PIPE_BUF: Int = 4096

public val SI_LOAD_SHIFT: CUint = 16u

public val CLD_EXITED: CInt = 1

public val CLD_KILLED: CInt = 2

public val CLD_DUMPED: CInt = 3

public val CLD_TRAPPED: CInt = 4

public val CLD_STOPPED: CInt = 5

public val CLD_CONTINUED: CInt = 6

public val SIGEV_SIGNAL: CInt = 0

public val SIGEV_NONE: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val P_ALL: IdtypeT = 0u

public val P_PID: IdtypeT = 1u

public val P_PGID: IdtypeT = 2u

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

public val ABDAY_1: NlItem = 0x20000

public val ABDAY_2: NlItem = 0x20001

public val ABDAY_3: NlItem = 0x20002

public val ABDAY_4: NlItem = 0x20003

public val ABDAY_5: NlItem = 0x20004

public val ABDAY_6: NlItem = 0x20005

public val ABDAY_7: NlItem = 0x20006

public val DAY_1: NlItem = 0x20007

public val DAY_2: NlItem = 0x20008

public val DAY_3: NlItem = 0x20009

public val DAY_4: NlItem = 0x2000A

public val DAY_5: NlItem = 0x2000B

public val DAY_6: NlItem = 0x2000C

public val DAY_7: NlItem = 0x2000D

public val ABMON_1: NlItem = 0x2000E

public val ABMON_2: NlItem = 0x2000F

public val ABMON_3: NlItem = 0x20010

public val ABMON_4: NlItem = 0x20011

public val ABMON_5: NlItem = 0x20012

public val ABMON_6: NlItem = 0x20013

public val ABMON_7: NlItem = 0x20014

public val ABMON_8: NlItem = 0x20015

public val ABMON_9: NlItem = 0x20016

public val ABMON_10: NlItem = 0x20017

public val ABMON_11: NlItem = 0x20018

public val ABMON_12: NlItem = 0x20019

public val MON_1: NlItem = 0x2001A

public val MON_2: NlItem = 0x2001B

public val MON_3: NlItem = 0x2001C

public val MON_4: NlItem = 0x2001D

public val MON_5: NlItem = 0x2001E

public val MON_6: NlItem = 0x2001F

public val MON_7: NlItem = 0x20020

public val MON_8: NlItem = 0x20021

public val MON_9: NlItem = 0x20022

public val MON_10: NlItem = 0x20023

public val MON_11: NlItem = 0x20024

public val MON_12: NlItem = 0x20025

public val AM_STR: NlItem = 0x20026

public val PM_STR: NlItem = 0x20027

public val D_T_FMT: NlItem = 0x20028

public val D_FMT: NlItem = 0x20029

public val T_FMT: NlItem = 0x2002A

public val T_FMT_AMPM: NlItem = 0x2002B

public val ERA: NlItem = 0x2002C

public val ERA_D_FMT: NlItem = 0x2002E

public val ALT_DIGITS: NlItem = 0x2002F

public val ERA_D_T_FMT: NlItem = 0x20030

public val ERA_T_FMT: NlItem = 0x20031

public val CODESET: NlItem = 14

public val CRNCYSTR: NlItem = 0x4000F

public val RUSAGE_THREAD: CInt = 1

public val RUSAGE_CHILDREN: CInt = -1

public val RADIXCHAR: NlItem = 0x10000

public val THOUSEP: NlItem = 0x10001

public val YESEXPR: NlItem = 0x50000

public val NOEXPR: NlItem = 0x50001

public val YESSTR: NlItem = 0x50002

public val NOSTR: NlItem = 0x50003

public val FILENAME_MAX: CUint = 4096u

public val L_TMPNAM: CUint = 20u

public val PC_LINK_MAX: CInt = 0

public val PC_MAX_CANON: CInt = 1

public val PC_MAX_INPUT: CInt = 2

public val PC_NAME_MAX: CInt = 3

public val PC_PATH_MAX: CInt = 4

public val PC_PIPE_BUF: CInt = 5

public val PC_CHOWN_RESTRICTED: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_SYNC_IO: CInt = 9

public val PC_ASYNC_IO: CInt = 10

public val PC_PRIO_IO: CInt = 11

public val PC_SOCK_MAXBUF: CInt = 12

public val PC_FILESIZEBITS: CInt = 13

public val PC_REC_INCR_XFER_SIZE: CInt = 14

public val PC_REC_MAX_XFER_SIZE: CInt = 15

public val PC_REC_MIN_XFER_SIZE: CInt = 16

public val PC_REC_XFER_ALIGN: CInt = 17

public val PC_ALLOC_SIZE_MIN: CInt = 18

public val PC_SYMLINK_MAX: CInt = 19

public val PC_2_SYMLINKS: CInt = 20

public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_STREAM_MAX: CInt = 5

public val SC_TZNAME_MAX: CInt = 6

public val SC_JOB_CONTROL: CInt = 7

public val SC_SAVED_IDS: CInt = 8

public val SC_REALTIME_SIGNALS: CInt = 9

public val SC_PRIORITY_SCHEDULING: CInt = 10

public val SC_TIMERS: CInt = 11

public val SC_ASYNCHRONOUS_IO: CInt = 12

public val SC_PRIORITIZED_IO: CInt = 13

public val SC_SYNCHRONIZED_IO: CInt = 14

public val SC_FSYNC: CInt = 15

public val SC_MAPPED_FILES: CInt = 16

public val SC_MEMLOCK: CInt = 17

public val SC_MEMLOCK_RANGE: CInt = 18

public val SC_MEMORY_PROTECTION: CInt = 19

public val SC_MESSAGE_PASSING: CInt = 20

public val SC_SEMAPHORES: CInt = 21

public val SC_SHARED_MEMORY_OBJECTS: CInt = 22

public val SC_AIO_LISTIO_MAX: CInt = 23

public val SC_AIO_MAX: CInt = 24

public val SC_AIO_PRIO_DELTA_MAX: CInt = 25

public val SC_DELAYTIMER_MAX: CInt = 26

public val SC_MQ_OPEN_MAX: CInt = 27

public val SC_MQ_PRIO_MAX: CInt = 28

public val SC_VERSION: CInt = 29

public val SC_PAGESIZE: CInt = 30

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_RTSIG_MAX: CInt = 31

public val SC_SEM_NSEMS_MAX: CInt = 32

public val SC_SEM_VALUE_MAX: CInt = 33

public val SC_SIGQUEUE_MAX: CInt = 34

public val SC_TIMER_MAX: CInt = 35

public val SC_BC_BASE_MAX: CInt = 36

public val SC_BC_DIM_MAX: CInt = 37

public val SC_BC_SCALE_MAX: CInt = 38

public val SC_BC_STRING_MAX: CInt = 39

public val SC_COLL_WEIGHTS_MAX: CInt = 40

public val SC_EXPR_NEST_MAX: CInt = 42

public val SC_LINE_MAX: CInt = 43

public val SC_RE_DUP_MAX: CInt = 44

public val SC_2_VERSION: CInt = 46

public val SC_2_C_BIND: CInt = 47

public val SC_2_C_DEV: CInt = 48

public val SC_2_FORT_DEV: CInt = 49

public val SC_2_FORT_RUN: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_LOCALEDEF: CInt = 52

public val SC_UIO_MAXIOV: CInt = 60

public val SC_IOV_MAX: CInt = 60

public val SC_THREADS: CInt = 67

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 68

public val SC_GETGR_R_SIZE_MAX: CInt = 69

public val SC_GETPW_R_SIZE_MAX: CInt = 70

public val SC_LOGIN_NAME_MAX: CInt = 71

public val SC_TTY_NAME_MAX: CInt = 72

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 73

public val SC_THREAD_KEYS_MAX: CInt = 74

public val SC_THREAD_STACK_MIN: CInt = 75

public val SC_THREAD_THREADS_MAX: CInt = 76

public val SC_THREAD_ATTR_STACKADDR: CInt = 77

public val SC_THREAD_ATTR_STACKSIZE: CInt = 78

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 79

public val SC_THREAD_PRIO_INHERIT: CInt = 80

public val SC_THREAD_PRIO_PROTECT: CInt = 81

public val SC_THREAD_PROCESS_SHARED: CInt = 82

public val SC_NPROCESSORS_CONF: CInt = 83

public val SC_NPROCESSORS_ONLN: CInt = 84

public val SC_PHYS_PAGES: CInt = 85

public val SC_AVPHYS_PAGES: CInt = 86

public val SC_ATEXIT_MAX: CInt = 87

public val SC_PASS_MAX: CInt = 88

public val SC_XOPEN_VERSION: CInt = 89

public val SC_XOPEN_XCU_VERSION: CInt = 90

public val SC_XOPEN_UNIX: CInt = 91

public val SC_XOPEN_CRYPT: CInt = 92

public val SC_XOPEN_ENH_I18N: CInt = 93

public val SC_XOPEN_SHM: CInt = 94

public val SC_2_CHAR_TERM: CInt = 95

public val SC_2_UPE: CInt = 97

public val SC_XOPEN_XPG2: CInt = 98

public val SC_XOPEN_XPG3: CInt = 99

public val SC_XOPEN_XPG4: CInt = 100

public val SC_NZERO: CInt = 109

public val SC_XBS5_ILP32_OFF32: CInt = 125

public val SC_XBS5_ILP32_OFFBIG: CInt = 126

public val SC_XBS5_LP64_OFF64: CInt = 127

public val SC_XBS5_LPBIG_OFFBIG: CInt = 128

public val SC_XOPEN_LEGACY: CInt = 129

public val SC_XOPEN_REALTIME: CInt = 130

public val SC_XOPEN_REALTIME_THREADS: CInt = 131

public val SC_ADVISORY_INFO: CInt = 132

public val SC_BARRIERS: CInt = 133

public val SC_CLOCK_SELECTION: CInt = 137

public val SC_CPUTIME: CInt = 138

public val SC_THREAD_CPUTIME: CInt = 139

public val SC_MONOTONIC_CLOCK: CInt = 149

public val SC_READER_WRITER_LOCKS: CInt = 153

public val SC_SPIN_LOCKS: CInt = 154

public val SC_REGEXP: CInt = 155

public val SC_SHELL: CInt = 157

public val SC_SPAWN: CInt = 159

public val SC_SPORADIC_SERVER: CInt = 160

public val SC_THREAD_SPORADIC_SERVER: CInt = 161

public val SC_TIMEOUTS: CInt = 164

public val SC_TYPED_MEMORY_OBJECTS: CInt = 165

public val SC_2_PBS: CInt = 168

public val SC_2_PBS_ACCOUNTING: CInt = 169

public val SC_2_PBS_LOCATE: CInt = 170

public val SC_2_PBS_MESSAGE: CInt = 171

public val SC_2_PBS_TRACK: CInt = 172

public val SC_SYMLOOP_MAX: CInt = 173

public val SC_STREAMS: CInt = 174

public val SC_2_PBS_CHECKPOINT: CInt = 175

public val SC_V6_ILP32_OFF32: CInt = 176

public val SC_V6_ILP32_OFFBIG: CInt = 177

public val SC_V6_LP64_OFF64: CInt = 178

public val SC_V6_LPBIG_OFFBIG: CInt = 179

public val SC_HOST_NAME_MAX: CInt = 180

public val SC_TRACE: CInt = 181

public val SC_TRACE_EVENT_FILTER: CInt = 182

public val SC_TRACE_INHERIT: CInt = 183

public val SC_TRACE_LOG: CInt = 184

public val SC_IPV6: CInt = 235

public val SC_RAW_SOCKETS: CInt = 236

public val SC_V7_ILP32_OFF32: CInt = 237

public val SC_V7_ILP32_OFFBIG: CInt = 238

public val SC_V7_LP64_OFF64: CInt = 239

public val SC_V7_LPBIG_OFFBIG: CInt = 240

public val SC_SS_REPL_MAX: CInt = 241

public val SC_TRACE_EVENT_NAME_MAX: CInt = 242

public val SC_TRACE_NAME_MAX: CInt = 243

public val SC_TRACE_SYS_MAX: CInt = 244

public val SC_TRACE_USER_EVENT_MAX: CInt = 245

public val SC_XOPEN_STREAMS: CInt = 246

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 247

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 248

public val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY

public val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY

public val GLOB_ERR: CInt = 1 shl 0

public val GLOB_MARK: CInt = 1 shl 1

public val GLOB_NOSORT: CInt = 1 shl 2

public val GLOB_DOOFFS: CInt = 1 shl 3

public val GLOB_NOCHECK: CInt = 1 shl 4

public val GLOB_APPEND: CInt = 1 shl 5

public val GLOB_NOESCAPE: CInt = 1 shl 6

public val GLOB_NOSPACE: CInt = 1

public val GLOB_ABORTED: CInt = 2

public val GLOB_NOMATCH: CInt = 3

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val S_IEXEC: ModeT = 64u

public val S_IWRITE: ModeT = 128u

public val S_IREAD: ModeT = 256u

public val F_LOCK: CInt = 1

public val F_TEST: CInt = 3

public val F_TLOCK: CInt = 2

public val F_ULOCK: CInt = 0

public val IFF_LOWER_UP: CInt = 0x10000

public val IFF_DORMANT: CInt = 0x20000

public val IFF_ECHO: CInt = 0x40000

public val ST_RDONLY: CUlong = 1uL

public val ST_NOSUID: CUlong = 2uL

public val ST_NODEV: CUlong = 4uL

public val ST_NOEXEC: CUlong = 8uL

public val ST_SYNCHRONOUS: CUlong = 16uL

public val ST_MANDLOCK: CUlong = 64uL

public val ST_WRITE: CUlong = 128uL

public val ST_APPEND: CUlong = 256uL

public val ST_IMMUTABLE: CUlong = 512uL

public val ST_NOATIME: CUlong = 1024uL

public val ST_NODIRATIME: CUlong = 2048uL

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1L).toLong())

public val RTLD_DEFAULT: COpaquePointer? = null

public val RTLD_NODELETE: CInt = 0x1000

public val RTLD_NOW: CInt = 0x2

public val TCP_MD5SIG: CInt = 14

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(size = List(SIZEOF_PTHREAD_MUTEX_T) { 0 })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(size = List(SIZEOF_PTHREAD_COND_T) { 0 })

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(size = List(SIZEOF_PTHREAD_RWLOCK_T) { 0 })

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_PROCESS_PRIVATE: CInt = 0

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val SIZEOF_PTHREAD_COND_T: Int = 48

public val RENAME_NOREPLACE: CInt = 1

public val RENAME_EXCHANGE: CInt = 2

public val RENAME_WHITEOUT: CInt = 4

public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val SCHED_BATCH: CInt = 3

public val SCHED_IDLE: CInt = 5

// netinet/in.h
// NOTE: These are in addition to the constants defined in src/unix/mod.rs
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

public val IPPROTO_BEETPH: CInt = 94

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

public val IPPROTO_MPLS: CInt = 137

/**
 * raw IP packet
 */
public val IPPROTO_RAW: CInt = 255

public val IPPROTO_MAX: CInt = 256

public val AF_IB: CInt = 27

public val AF_MPLS: CInt = 28

public val AF_NFC: CInt = 39

public val AF_VSOCK: CInt = 40

public val PF_IB: CInt = AF_IB

public val PF_MPLS: CInt = AF_MPLS

public val PF_NFC: CInt = AF_NFC

public val PF_VSOCK: CInt = AF_VSOCK

// System V IPC
public val IPC_PRIVATE: KeyT = 0

public val IPC_CREAT: CInt = 512

public val IPC_EXCL: CInt = 1024

public val IPC_NOWAIT: CInt = 2048

public val IPC_RMID: CInt = 0

public val IPC_SET: CInt = 1

public val IPC_STAT: CInt = 2

public val IPC_INFO: CInt = 3

public val MSG_STAT: CInt = 11

public val MSG_INFO: CInt = 12

public val MSG_NOERROR: CInt = 4096

public val MSG_EXCEPT: CInt = 8192

public val MSG_COPY: CInt = 16384

public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_REMAP: CInt = 16384

public val SHM_EXEC: CInt = 32768

public val SHM_LOCK: CInt = 11

public val SHM_UNLOCK: CInt = 12

public val SHM_HUGETLB: CInt = 2048

public val SHM_NORESERVE: CInt = 4096

public val EPOLLRDHUP: CInt = 0x2000

public val EPOLLEXCLUSIVE: CInt = 0x10000000

public val EPOLLONESHOT: CInt = 0x40000000

public val QFMT_VFS_OLD: CInt = 1

public val QFMT_VFS_V0: CInt = 2

public val QFMT_VFS_V1: CInt = 4

public val EFD_SEMAPHORE: CInt = 0x1

public val LOG_NFACILITIES: CInt = 24

public val SEM_FAILED: SemT? = null

public val RB_AUTOBOOT: CInt = 0x01234567u.toInt()

public val RB_HALT_SYSTEM: CInt = 0xcdef0123u.toInt()

public val RB_ENABLE_CAD: CInt = 0x89abcdefu.toInt()

public val RB_DISABLE_CAD: CInt = 0x00000000u.toInt()

public val RB_POWER_OFF: CInt = 0x4321fedcu.toInt()

public val RB_SW_SUSPEND: CInt = 0xd000fce2u.toInt()

public val RB_KEXEC: CInt = 0x45584543u.toInt()

public val AI_PASSIVE: CInt = 0x0001

public val AI_CANONNAME: CInt = 0x0002

public val AI_NUMERICHOST: CInt = 0x0004

public val AI_V4MAPPED: CInt = 0x0008

public val AI_ALL: CInt = 0x0010

public val AI_ADDRCONFIG: CInt = 0x0020

public val AI_NUMERICSERV: CInt = 0x0400

public val EAI_BADFLAGS: CInt = -1

public val EAI_NONAME: CInt = -2

public val EAI_AGAIN: CInt = -3

public val EAI_FAIL: CInt = -4

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_MEMORY: CInt = -10

public val EAI_OVERFLOW: CInt = -12

public val NI_NUMERICHOST: CInt = 1

public val NI_NUMERICSERV: CInt = 2

public val NI_NOFQDN: CInt = 4

public val NI_NAMEREQD: CInt = 8

public val NI_DGRAM: CInt = 16

public val SYNC_FILE_RANGE_WAIT_BEFORE: CUint = 1u

public val SYNC_FILE_RANGE_WRITE: CUint = 2u

public val SYNC_FILE_RANGE_WAIT_AFTER: CUint = 4u

public val EAI_SYSTEM: CInt = -11

public val AIO_CANCELED: CInt = 0

public val AIO_NOTCANCELED: CInt = 1

public val AIO_ALLDONE: CInt = 2

public val LIO_READ: CInt = 0

public val LIO_WRITE: CInt = 1

public val LIO_NOP: CInt = 2

public val LIO_WAIT: CInt = 0

public val LIO_NOWAIT: CInt = 1

public val MREMAP_MAYMOVE: CInt = 1

public val MREMAP_FIXED: CInt = 2

public val PR_SET_PDEATHSIG: CInt = 1

public val PR_GET_PDEATHSIG: CInt = 2

public val PR_GET_DUMPABLE: CInt = 3

public val PR_SET_DUMPABLE: CInt = 4

public val PR_GET_UNALIGN: CInt = 5

public val PR_SET_UNALIGN: CInt = 6

public val PR_UNALIGN_NOPRINT: CInt = 1

public val PR_UNALIGN_SIGBUS: CInt = 2

public val PR_GET_KEEPCAPS: CInt = 7

public val PR_SET_KEEPCAPS: CInt = 8

public val PR_GET_FPEMU: CInt = 9

public val PR_SET_FPEMU: CInt = 10

public val PR_FPEMU_NOPRINT: CInt = 1

public val PR_FPEMU_SIGFPE: CInt = 2

public val PR_GET_FPEXC: CInt = 11

public val PR_SET_FPEXC: CInt = 12

public val PR_FP_EXC_SW_ENABLE: CInt = 0x80

public val PR_FP_EXC_DIV: CInt = 0x010000

public val PR_FP_EXC_OVF: CInt = 0x020000

public val PR_FP_EXC_UND: CInt = 0x040000

public val PR_FP_EXC_RES: CInt = 0x080000

public val PR_FP_EXC_INV: CInt = 0x100000

public val PR_FP_EXC_DISABLED: CInt = 0

public val PR_FP_EXC_NONRECOV: CInt = 1

public val PR_FP_EXC_ASYNC: CInt = 2

public val PR_FP_EXC_PRECISE: CInt = 3

public val PR_GET_TIMING: CInt = 13

public val PR_SET_TIMING: CInt = 14

public val PR_TIMING_STATISTICAL: CInt = 0

public val PR_TIMING_TIMESTAMP: CInt = 1

public val PR_SET_NAME: CInt = 15

public val PR_GET_NAME: CInt = 16

public val PR_GET_ENDIAN: CInt = 19

public val PR_SET_ENDIAN: CInt = 20

public val PR_ENDIAN_BIG: CInt = 0

public val PR_ENDIAN_LITTLE: CInt = 1

public val PR_ENDIAN_PPC_LITTLE: CInt = 2

public val PR_GET_SECCOMP: CInt = 21

public val PR_SET_SECCOMP: CInt = 22

public val PR_CAPBSET_READ: CInt = 23

public val PR_CAPBSET_DROP: CInt = 24

public val PR_GET_TSC: CInt = 25

public val PR_SET_TSC: CInt = 26

public val PR_TSC_ENABLE: CInt = 1

public val PR_TSC_SIGSEGV: CInt = 2

public val PR_GET_SECUREBITS: CInt = 27

public val PR_SET_SECUREBITS: CInt = 28

public val PR_SET_TIMERSLACK: CInt = 29

public val PR_GET_TIMERSLACK: CInt = 30

public val PR_TASK_PERF_EVENTS_DISABLE: CInt = 31

public val PR_TASK_PERF_EVENTS_ENABLE: CInt = 32

public val PR_MCE_KILL: CInt = 33

public val PR_MCE_KILL_CLEAR: CInt = 0

public val PR_MCE_KILL_SET: CInt = 1

public val PR_MCE_KILL_LATE: CInt = 0

public val PR_MCE_KILL_EARLY: CInt = 1

public val PR_MCE_KILL_DEFAULT: CInt = 2

public val PR_MCE_KILL_GET: CInt = 34

public val PR_SET_MM: CInt = 35

public val PR_SET_MM_START_CODE: CInt = 1

public val PR_SET_MM_END_CODE: CInt = 2

public val PR_SET_MM_START_DATA: CInt = 3

public val PR_SET_MM_END_DATA: CInt = 4

public val PR_SET_MM_START_STACK: CInt = 5

public val PR_SET_MM_START_BRK: CInt = 6

public val PR_SET_MM_BRK: CInt = 7

public val PR_SET_MM_ARG_START: CInt = 8

public val PR_SET_MM_ARG_END: CInt = 9

public val PR_SET_MM_ENV_START: CInt = 10

public val PR_SET_MM_ENV_END: CInt = 11

public val PR_SET_MM_AUXV: CInt = 12

public val PR_SET_MM_EXE_FILE: CInt = 13

public val PR_SET_MM_MAP: CInt = 14

public val PR_SET_MM_MAP_SIZE: CInt = 15

public val PR_SET_PTRACER: CInt = 0x59616d61

public val PR_SET_PTRACER_ANY: CUlong = 0xffffffffffffffffuL

public val PR_SET_CHILD_SUBREAPER: CInt = 36

public val PR_GET_CHILD_SUBREAPER: CInt = 37

public val PR_SET_NO_NEW_PRIVS: CInt = 38

public val PR_GET_NO_NEW_PRIVS: CInt = 39

public val PR_GET_TID_ADDRESS: CInt = 40

public val PR_SET_THP_DISABLE: CInt = 41

public val PR_GET_THP_DISABLE: CInt = 42

public val PR_MPX_ENABLE_MANAGEMENT: CInt = 43

public val PR_MPX_DISABLE_MANAGEMENT: CInt = 44

public val PR_SET_FP_MODE: CInt = 45

public val PR_GET_FP_MODE: CInt = 46

public val PR_FP_MODE_FR: CInt = 1 shl 0

public val PR_FP_MODE_FRE: CInt = 1 shl 1

public val PR_CAP_AMBIENT: CInt = 47

public val PR_CAP_AMBIENT_IS_SET: CInt = 1

public val PR_CAP_AMBIENT_RAISE: CInt = 2

public val PR_CAP_AMBIENT_LOWER: CInt = 3

public val PR_CAP_AMBIENT_CLEAR_ALL: CInt = 4

public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

public val TFD_CLOEXEC: CInt = O_CLOEXEC

public val TFD_NONBLOCK: CInt = O_NONBLOCK

public val TFD_TIMER_ABSTIME: CInt = 1

public val XATTR_CREATE: CInt = 0x1

public val XATTR_REPLACE: CInt = 0x2

public val POSIX_VDISABLE: CcT = 0u

public val FALLOC_FL_KEEP_SIZE: CInt = 0x01

public val FALLOC_FL_PUNCH_HOLE: CInt = 0x02

public val FALLOC_FL_COLLAPSE_RANGE: CInt = 0x08

public val FALLOC_FL_ZERO_RANGE: CInt = 0x10

public val FALLOC_FL_INSERT_RANGE: CInt = 0x20

public val FALLOC_FL_UNSHARE_RANGE: CInt = 0x40

// On Linux, libc doesn't define this constant, libattr does instead.
// We still define it for Linux as it's defined by libc on other platforms,
// and it's mentioned in the man pages for getxattr and setxattr.
public val ENOATTR: CInt = ENODATA

public val SO_ORIGINAL_DST: CInt = 80

public val IUTF8: TcflagT = 0x00004000u

public val CMSPAR: TcflagT = 1073741824u

public val MFD_CLOEXEC: CUint = 0x0001u

public val MFD_ALLOW_SEALING: CUint = 0x0002u

// these are used in the pType field of Elf32Phdr and Elf64Phdr, which has
// the type Elf32Word and Elf64Word respectively. Luckily, both of those are u32
// so we can use that type here to avoid having to cast.
public val PT_NULL: UInt = 0u

public val PT_LOAD: UInt = 1u

public val PT_DYNAMIC: UInt = 2u

public val PT_INTERP: UInt = 3u

public val PT_NOTE: UInt = 4u

public val PT_SHLIB: UInt = 5u

public val PT_PHDR: UInt = 6u

public val PT_TLS: UInt = 7u

public val PT_NUM: UInt = 8u

public val PT_LOOS: UInt = 0x60000000u

public val PT_GNU_EH_FRAME: UInt = 0x6474e550u

public val PT_GNU_STACK: UInt = 0x6474e551u

public val PT_GNU_RELRO: UInt = 0x6474e552u

// Ethernet protocol IDs.
public val ETH_P_LOOP: CInt = 0x0060

public val ETH_P_PUP: CInt = 0x0200

public val ETH_P_PUPAT: CInt = 0x0201

public val ETH_P_IP: CInt = 0x0800

public val ETH_P_X25: CInt = 0x0805

public val ETH_P_ARP: CInt = 0x0806

public val ETH_P_BPQ: CInt = 0x08FF

public val ETH_P_IEEEPUP: CInt = 0x0a00

public val ETH_P_IEEEPUPAT: CInt = 0x0a01

public val ETH_P_BATMAN: CInt = 0x4305

public val ETH_P_DEC: CInt = 0x6000

public val ETH_P_DNA_DL: CInt = 0x6001

public val ETH_P_DNA_RC: CInt = 0x6002

public val ETH_P_DNA_RT: CInt = 0x6003

public val ETH_P_LAT: CInt = 0x6004

public val ETH_P_DIAG: CInt = 0x6005

public val ETH_P_CUST: CInt = 0x6006

public val ETH_P_SCA: CInt = 0x6007

public val ETH_P_TEB: CInt = 0x6558

public val ETH_P_RARP: CInt = 0x8035

public val ETH_P_ATALK: CInt = 0x809B

public val ETH_P_AARP: CInt = 0x80F3

public val ETH_P_8021Q: CInt = 0x8100

public val ETH_P_IPX: CInt = 0x8137

public val ETH_P_IPV6: CInt = 0x86DD

public val ETH_P_PAUSE: CInt = 0x8808

public val ETH_P_SLOW: CInt = 0x8809

public val ETH_P_WCCP: CInt = 0x883E

public val ETH_P_MPLS_UC: CInt = 0x8847

public val ETH_P_MPLS_MC: CInt = 0x8848

public val ETH_P_ATMMPOA: CInt = 0x884c

public val ETH_P_PPP_DISC: CInt = 0x8863

public val ETH_P_PPP_SES: CInt = 0x8864

public val ETH_P_LINK_CTL: CInt = 0x886c

public val ETH_P_ATMFATE: CInt = 0x8884

public val ETH_P_PAE: CInt = 0x888E

public val ETH_P_AOE: CInt = 0x88A2

public val ETH_P_8021AD: CInt = 0x88A8

public val ETH_P_802_EX1: CInt = 0x88B5

public val ETH_P_TIPC: CInt = 0x88CA

public val ETH_P_8021AH: CInt = 0x88E7

public val ETH_P_MVRP: CInt = 0x88F5

public val ETH_P_1588: CInt = 0x88F7

public val ETH_P_PRP: CInt = 0x88FB

public val ETH_P_FCOE: CInt = 0x8906

public val ETH_P_TDLS: CInt = 0x890D

public val ETH_P_FIP: CInt = 0x8914

public val ETH_P_80221: CInt = 0x8917

public val ETH_P_LOOPBACK: CInt = 0x9000

public val ETH_P_QINQ1: CInt = 0x9100

public val ETH_P_QINQ2: CInt = 0x9200

public val ETH_P_QINQ3: CInt = 0x9300

public val ETH_P_EDSA: CInt = 0xDADA

public val ETH_P_AF_IUCV: CInt = 0xFBFB

public val ETH_P_802_3_MIN: CInt = 0x0600

public val ETH_P_802_3: CInt = 0x0001

public val ETH_P_AX25: CInt = 0x0002

public val ETH_P_ALL: CInt = 0x0003

public val ETH_P_802_2: CInt = 0x0004

public val ETH_P_SNAP: CInt = 0x0005

public val ETH_P_DDCMP: CInt = 0x0006

public val ETH_P_WAN_PPP: CInt = 0x0007

public val ETH_P_PPP_MP: CInt = 0x0008

public val ETH_P_LOCALTALK: CInt = 0x0009

public val ETH_P_CAN: CInt = 0x000C

public val ETH_P_CANFD: CInt = 0x000D

public val ETH_P_PPPTALK: CInt = 0x0010

public val ETH_P_TR_802_2: CInt = 0x0011

public val ETH_P_MOBITEX: CInt = 0x0015

public val ETH_P_CONTROL: CInt = 0x0016

public val ETH_P_IRDA: CInt = 0x0017

public val ETH_P_ECONET: CInt = 0x0018

public val ETH_P_HDLC: CInt = 0x0019

public val ETH_P_ARCNET: CInt = 0x001A

public val ETH_P_DSA: CInt = 0x001B

public val ETH_P_TRAILER: CInt = 0x001C

public val ETH_P_PHONET: CInt = 0x00F5

public val ETH_P_IEEE802154: CInt = 0x00F6

public val ETH_P_CAIF: CInt = 0x00F7

public val SFD_CLOEXEC: CInt = 0x080000

public val NCCS: Int = 32

public val O_TRUNC: CInt = 0x00040000

public val O_NOATIME: CInt = 0x00002000

public val O_CLOEXEC: CInt = 0x00000100

public val O_TMPFILE: CInt = 0x00004000

public val EBFONT: CInt = 59

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENONET: CInt = 64

public val ENOPKG: CInt = 65

public val EREMOTE: CInt = 66

public val ENOLINK: CInt = 67

public val EADV: CInt = 68

public val ESRMNT: CInt = 69

public val ECOMM: CInt = 70

public val EPROTO: CInt = 71

public val EDOTDOT: CInt = 73

public val SA_NODEFER: CInt = 0x40000000

public val SA_RESETHAND: CInt = 0x80000000

public val SA_RESTART: CInt = 0x10000000

public val SA_NOCLDSTOP: CInt = 0x00000001

public val EPOLL_CLOEXEC: CInt = 0x80000

public val EFD_CLOEXEC: CInt = 0x80000

public val BUFSIZ: CUint = 1024u

public val TMP_MAX: CUint = 10000u

public val FOPEN_MAX: CUint = 1000u

public val O_PATH: CInt = 0x00400000

public val O_EXEC: CInt = O_PATH

public val O_SEARCH: CInt = O_PATH

public val O_ACCMODE: CInt = 3 or O_SEARCH

public val O_NDELAY: CInt = O_NONBLOCK

public val NI_MAXHOST: SocklenT = 255u

public val PTHREAD_STACK_MIN: SizeT = 2048uL

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val POSIX_MADV_DONTNEED: CInt = 4

public val RLIM_INFINITY: RlimT = 0uL.inv()

public val RLIMIT_RTTIME: CInt = 15

public val RLIMIT_NLIMITS: CInt = 16

public val RLIM_NLIMITS: CInt = RLIMIT_NLIMITS

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val SOCK_DCCP: CInt = 6

public val SOCK_PACKET: CInt = 10

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

public val SIGUNUSED: CInt = SIGSYS

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

public val CPU_SETSIZE: CInt = 128

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

public val PTRACE_PEEKSIGINFO: CInt = 0x4209

public val EPOLLWAKEUP: CInt = 0x20000000

public val EFD_NONBLOCK: CInt = O_NONBLOCK

public val SFD_NONBLOCK: CInt = O_NONBLOCK

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val TIOCINQ: CInt = FIONREAD

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_NOLOAD: CInt = 0x4

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val CBAUD: TcflagT = 4111u

public val TAB1: CInt = 0x00000800

public val TAB2: CInt = 0x00001000

public val TAB3: CInt = 0x00001800

public val CR1: CInt = 0x00000200

public val CR2: CInt = 0x00000400

public val CR3: CInt = 0x00000600

public val FF1: CInt = 0x00008000

public val BS1: CInt = 0x00002000

public val VT1: CInt = 0x00004000

public val VWERASE: Int = 14

public val VREPRINT: Int = 12

public val VSUSP: Int = 10

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VDISCARD: Int = 13

public val VTIME: Int = 5

public val IXON: TcflagT = 0x00000400u

public val IXOFF: TcflagT = 0x00001000u

public val ONLCR: TcflagT = 0x4u

public val CSIZE: TcflagT = 0x00000030u

public val CS6: TcflagT = 0x00000010u

public val CS7: TcflagT = 0x00000020u

public val CS8: TcflagT = 0x00000030u

public val CSTOPB: TcflagT = 0x00000040u

public val CREAD: TcflagT = 0x00000080u

public val PARENB: TcflagT = 0x00000100u

public val PARODD: TcflagT = 0x00000200u

public val HUPCL: TcflagT = 0x00000400u

public val CLOCAL: TcflagT = 0x00000800u

public val ECHOKE: TcflagT = 0x00000800u

public val ECHOE: TcflagT = 0x00000010u

public val ECHOK: TcflagT = 0x00000020u

public val ECHONL: TcflagT = 0x00000040u

public val ECHOPRT: TcflagT = 0x00000400u

public val ECHOCTL: TcflagT = 0x00000200u

public val ISIG: TcflagT = 0x00000001u

public val ICANON: TcflagT = 0x00000002u

public val PENDIN: TcflagT = 0x00004000u

public val NOFLSH: TcflagT = 0x00000080u

public val CIBAUD: TcflagT = 269418496u

public val CBAUDEX: TcflagT = 4096u

public val VSWTC: Int = 7

public val OLCUC: TcflagT = 2u

public val NLDLY: TcflagT = 256u

public val CRDLY: TcflagT = 1536u

public val TABDLY: TcflagT = 6144u

public val BSDLY: TcflagT = 8192u

public val FFDLY: TcflagT = 32768u

public val VTDLY: TcflagT = 16384u

public val XTABS: TcflagT = 6144u

public val B0: SpeedT = 0u

public val B50: SpeedT = 1u

public val B75: SpeedT = 2u

public val B110: SpeedT = 3u

public val B134: SpeedT = 4u

public val B150: SpeedT = 5u

public val B200: SpeedT = 6u

public val B300: SpeedT = 7u

public val B600: SpeedT = 8u

public val B1200: SpeedT = 9u

public val B1800: SpeedT = 10u

public val B2400: SpeedT = 11u

public val B4800: SpeedT = 12u

public val B9600: SpeedT = 13u

public val B19200: SpeedT = 14u

public val B38400: SpeedT = 15u

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val B57600: SpeedT = 4097u

public val B115200: SpeedT = 4098u

public val B230400: SpeedT = 4099u

public val B460800: SpeedT = 4100u

public val B500000: SpeedT = 4101u

public val B576000: SpeedT = 4102u

public val B921600: SpeedT = 4103u

public val B1000000: SpeedT = 4104u

public val B1152000: SpeedT = 4105u

public val B1500000: SpeedT = 4106u

public val B2000000: SpeedT = 4107u

public val B2500000: SpeedT = 4108u

public val B3000000: SpeedT = 4109u

public val B3500000: SpeedT = 4110u

public val B4000000: SpeedT = 4111u

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 56

public val SIZEOF_PTHREAD_MUTEX_T: Int = 40

public val O_ASYNC: CInt = 0x00000400

public val FIOCLEX: CInt = 0x5451

public val FIONBIO: CInt = 0x5421

public val RLIMIT_RSS: CInt = 5

public val RLIMIT_NOFILE: CInt = 7

public val RLIMIT_AS: CInt = 9

public val RLIMIT_NPROC: CInt = 6

public val RLIMIT_MEMLOCK: CInt = 8

public val O_APPEND: CInt = 0x00100000

public val O_CREAT: CInt = 0x00010000

public val O_EXCL: CInt = 0x00020000

public val O_NOCTTY: CInt = 0x00000200

public val O_NONBLOCK: CInt = 0x00000010

public val O_SYNC: CInt = 0x00000040 or O_DSYNC

public val O_RSYNC: CInt = O_SYNC

public val O_DSYNC: CInt = 0x00000020

public val SOCK_CLOEXEC: CInt = 524288

public val SOCK_NONBLOCK: CInt = 2048

public val MAP_ANON: CInt = 0x0020

public val MAP_GROWSDOWN: CInt = 0x0100

public val MAP_DENYWRITE: CInt = 0x0800

public val MAP_EXECUTABLE: CInt = 0x01000

public val MAP_LOCKED: CInt = 0x02000

public val MAP_NORESERVE: CInt = 0x04000

public val MAP_POPULATE: CInt = 0x08000

public val MAP_NONBLOCK: CInt = 0x010000

public val MAP_STACK: CInt = 0x020000

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_SEQPACKET: CInt = 5

public val SOL_SOCKET: CInt = 1

public val EDEADLK: CInt = 35

public val ENAMETOOLONG: CInt = 36

public val ENOLCK: CInt = 37

public val ENOSYS: CInt = 38

public val ENOTEMPTY: CInt = 39

public val ELOOP: CInt = 40

public val ENOMSG: CInt = 42

public val EIDRM: CInt = 43

public val ECHRNG: CInt = 44

public val EL2NSYNC: CInt = 45

public val EL3HLT: CInt = 46

public val EL3RST: CInt = 47

public val ELNRNG: CInt = 48

public val EUNATCH: CInt = 49

public val ENOCSI: CInt = 50

public val EL2HLT: CInt = 51

public val EBADE: CInt = 52

public val EBADR: CInt = 53

public val EXFULL: CInt = 54

public val ENOANO: CInt = 55

public val EBADRQC: CInt = 56

public val EBADSLT: CInt = 57

public val EDEADLOCK: CInt = EDEADLK

public val EMULTIHOP: CInt = 72

public val EBADMSG: CInt = 74

public val EOVERFLOW: CInt = 75

public val ENOTUNIQ: CInt = 76

public val EBADFD: CInt = 77

public val EREMCHG: CInt = 78

public val ELIBACC: CInt = 79

public val ELIBBAD: CInt = 80

public val ELIBSCN: CInt = 81

public val ELIBMAX: CInt = 82

public val ELIBEXEC: CInt = 83

public val EILSEQ: CInt = 84

public val ERESTART: CInt = 85

public val ESTRPIPE: CInt = 86

public val EUSERS: CInt = 87

public val ENOTSOCK: CInt = 88

public val EDESTADDRREQ: CInt = 89

public val EMSGSIZE: CInt = 90

public val EPROTOTYPE: CInt = 91

public val ENOPROTOOPT: CInt = 92

public val EPROTONOSUPPORT: CInt = 93

public val ESOCKTNOSUPPORT: CInt = 94

public val EOPNOTSUPP: CInt = 95

public val ENOTSUP: CInt = EOPNOTSUPP

public val EPFNOSUPPORT: CInt = 96

public val EAFNOSUPPORT: CInt = 97

public val EADDRINUSE: CInt = 98

public val EADDRNOTAVAIL: CInt = 99

public val ENETDOWN: CInt = 100

public val ENETUNREACH: CInt = 101

public val ENETRESET: CInt = 102

public val ECONNABORTED: CInt = 103

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EISCONN: CInt = 106

public val ENOTCONN: CInt = 107

public val ESHUTDOWN: CInt = 108

public val ETOOMANYREFS: CInt = 109

public val ETIMEDOUT: CInt = 110

public val ECONNREFUSED: CInt = 111

public val EHOSTDOWN: CInt = 112

public val EHOSTUNREACH: CInt = 113

public val EALREADY: CInt = 114

public val EINPROGRESS: CInt = 115

public val ESTALE: CInt = 116

public val EUCLEAN: CInt = 117

public val ENOTNAM: CInt = 118

public val ENAVAIL: CInt = 119

public val EISNAM: CInt = 120

public val EREMOTEIO: CInt = 121

public val EDQUOT: CInt = 122

public val ENOMEDIUM: CInt = 123

public val EMEDIUMTYPE: CInt = 124

public val ECANCELED: CInt = 125

public val ENOKEY: CInt = 126

public val EKEYEXPIRED: CInt = 127

public val EKEYREVOKED: CInt = 128

public val EKEYREJECTED: CInt = 129

public val EOWNERDEAD: CInt = 130

public val ENOTRECOVERABLE: CInt = 131

public val ERFKILL: CInt = 132

public val EHWPOISON: CInt = 133

public val SO_REUSEADDR: CInt = 2

public val SO_TYPE: CInt = 3

public val SO_ERROR: CInt = 4

public val SO_DONTROUTE: CInt = 5

public val SO_BROADCAST: CInt = 6

public val SO_SNDBUF: CInt = 7

public val SO_RCVBUF: CInt = 8

public val SO_KEEPALIVE: CInt = 9

public val SO_OOBINLINE: CInt = 10

public val SO_NO_CHECK: CInt = 11

public val SO_PRIORITY: CInt = 12

public val SO_LINGER: CInt = 13

public val SO_BSDCOMPAT: CInt = 14

public val SO_REUSEPORT: CInt = 15

public val SO_PASSCRED: CInt = 16

public val SO_PEERCRED: CInt = 17

public val SO_RCVLOWAT: CInt = 18

public val SO_SNDLOWAT: CInt = 19

public val SO_RCVTIMEO: CInt = 20

public val SO_SNDTIMEO: CInt = 21

public val SO_BINDTODEVICE: CInt = 25

public val SO_TIMESTAMP: CInt = 29

public val SO_ACCEPTCONN: CInt = 30

public val SO_SNDBUFFORCE: CInt = 32

public val SO_RCVBUFFORCE: CInt = 33

public val SO_TIMESTAMPNS: CInt = 35

public val SO_MARK: CInt = 36

public val SO_PROTOCOL: CInt = 38

public val SO_DOMAIN: CInt = 39

public val SO_RXQ_OVFL: CInt = 40

public val SO_PEEK_OFF: CInt = 42

public val SO_BUSY_POLL: CInt = 46

public val SO_COOKIE: CInt = 57

public val SO_BINDTOIFINDEX: CInt = 62

public val SO_FUCHSIA_MARK: CInt = 10000

public val SA_ONSTACK: CInt = 0x08000000

public val SA_SIGINFO: CInt = 0x00000004

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SIGCHLD: CInt = 17

public val SIGBUS: CInt = 7

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGUSR1: CInt = 10

public val SIGUSR2: CInt = 12

public val SIGCONT: CInt = 18

public val SIGSTOP: CInt = 19

public val SIGTSTP: CInt = 20

public val SIGURG: CInt = 23

public val SIGIO: CInt = 29

public val SIGSYS: CInt = 31

public val SIGSTKFLT: CInt = 16

public val SIGPOLL: CInt = 29

public val SIGPWR: CInt = 30

public val SIG_SETMASK: CInt = 2

public val SIG_BLOCK: CInt = 0x000000

public val SIG_UNBLOCK: CInt = 0x01

public val EXTPROC: TcflagT = 0x00010000u

public val MAP_HUGETLB: CInt = 0x040000

public val F_GETLK: CInt = 5

public val F_GETOWN: CInt = 9

public val F_SETLK: CInt = 6

public val F_SETLKW: CInt = 7

public val F_SETOWN: CInt = 8

public val VEOF: Int = 4

public val VEOL: Int = 11

public val VEOL2: Int = 16

public val VMIN: Int = 6

public val IEXTEN: TcflagT = 0x00008000u

public val TOSTOP: TcflagT = 0x00000100u

public val FLUSHO: TcflagT = 0x00001000u

public val TCGETS: CInt = 0x5401

public val TCSETS: CInt = 0x5402

public val TCSETSW: CInt = 0x5403

public val TCSETSF: CInt = 0x5404

public val TCGETA: CInt = 0x5405

public val TCSETA: CInt = 0x5406

public val TCSETAW: CInt = 0x5407

public val TCSETAF: CInt = 0x5408

public val TCSBRK: CInt = 0x5409

public val TCXONC: CInt = 0x540A

public val TCFLSH: CInt = 0x540B

public val TIOCGSOFTCAR: CInt = 0x5419

public val TIOCSSOFTCAR: CInt = 0x541A

public val TIOCLINUX: CInt = 0x541C

public val TIOCGSERIAL: CInt = 0x541E

public val TIOCEXCL: CInt = 0x540C

public val TIOCNXCL: CInt = 0x540D

public val TIOCSCTTY: CInt = 0x540E

public val TIOCGPGRP: CInt = 0x540F

public val TIOCSPGRP: CInt = 0x5410

public val TIOCOUTQ: CInt = 0x5411

public val TIOCSTI: CInt = 0x5412

public val TIOCGWINSZ: CInt = 0x5413

public val TIOCSWINSZ: CInt = 0x5414

public val TIOCMGET: CInt = 0x5415

public val TIOCMBIS: CInt = 0x5416

public val TIOCMBIC: CInt = 0x5417

public val TIOCMSET: CInt = 0x5418

public val FIONREAD: CInt = 0x541B

public val TIOCCONS: CInt = 0x541D

public val POLLWRNORM: CShort = 0x100

public val POLLWRBAND: CShort = 0x200

public val TIOCM_LE: CInt = 0x001

public val TIOCM_DTR: CInt = 0x002

public val TIOCM_RTS: CInt = 0x004

public val TIOCM_ST: CInt = 0x008

public val TIOCM_SR: CInt = 0x010

public val TIOCM_CTS: CInt = 0x020

public val TIOCM_CAR: CInt = 0x040

public val TIOCM_RNG: CInt = 0x080

public val TIOCM_DSR: CInt = 0x100

public val TIOCM_CD: CInt = TIOCM_CAR

public val TIOCM_RI: CInt = TIOCM_RNG

public val O_DIRECTORY: CInt = 0x00080000

public val O_DIRECT: CInt = 0x00000800

public val O_LARGEFILE: CInt = 0x00001000

public val O_NOFOLLOW: CInt = 0x00000080

public val HUGETLB_FLAG_ENCODE_SHIFT: UInt = 26u

public val MAP_HUGE_SHIFT: UInt = 26u

public fun cmsgLen(cmsg: Cmsghdr?): SsizeT {
    return (((cmsg!!.cmsgLen).toULong() + sizeOf<CLong>() - 1) and (sizeOf<CLong>() - 1).inv()).toLong()
}

public fun cmsgNext(cmsg: Cmsghdr?): CUchar? {
    return ((cmsg)?.let { COpaquePointer(it.hashCode().toLong() + (CMSG_LEN(cmsg)).toLong()) }).toUByte()
}

public fun mhdrEnd(mhdr: Msghdr?): CUchar? {
    return mhdr!!.msgControl.offset((mhdr!!.msgControllen).toInt()).cast()
}

public fun isalnum(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isalnum", -1, longArrayOf(c.toLong())).toInt()
}

public fun isalpha(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isalpha", -1, longArrayOf(c.toLong())).toInt()
}

public fun iscntrl(c: CInt): CInt {
    return LibcDynamicFfi.invoke("iscntrl", -1, longArrayOf(c.toLong())).toInt()
}

public fun isdigit(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isdigit", -1, longArrayOf(c.toLong())).toInt()
}

public fun isgraph(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isgraph", -1, longArrayOf(c.toLong())).toInt()
}

public fun islower(c: CInt): CInt {
    return LibcDynamicFfi.invoke("islower", -1, longArrayOf(c.toLong())).toInt()
}

public fun isprint(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isprint", -1, longArrayOf(c.toLong())).toInt()
}

public fun ispunct(c: CInt): CInt {
    return LibcDynamicFfi.invoke("ispunct", -1, longArrayOf(c.toLong())).toInt()
}

public fun isspace(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isspace", -1, longArrayOf(c.toLong())).toInt()
}

public fun isupper(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isupper", -1, longArrayOf(c.toLong())).toInt()
}

public fun isxdigit(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isxdigit", -1, longArrayOf(c.toLong())).toInt()
}

public fun isblank(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isblank", -1, longArrayOf(c.toLong())).toInt()
}

public fun tolower(c: CInt): CInt {
    return LibcDynamicFfi.invoke("tolower", -1, longArrayOf(c.toLong())).toInt()
}

public fun toupper(c: CInt): CInt {
    return LibcDynamicFfi.invoke("toupper", -1, longArrayOf(c.toLong())).toInt()
}

public fun fopen(filename: String?, mode: String?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("fopen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun freopen(filename: String?, mode: String?, file: FILE?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("freopen", -1, longArrayOf(__cstr_0, __cstr_1, file?.handle ?: 0L))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fflush(file: FILE?): CInt {
    return LibcDynamicFfi.invoke("fflush", -1, longArrayOf(file?.handle ?: 0L)).toInt()
}

public fun fclose(file: FILE?): CInt {
    return LibcDynamicFfi.invoke("fclose", -1, longArrayOf(file?.handle ?: 0L)).toInt()
}

public fun remove(filename: String?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("remove", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun rename(oldname: String?, newname: String?): CInt {
    val __cstr_0 = if (oldname == null) 0L else LibcDynamicFfi.allocUtf8CString(oldname)
    val __cstr_1 = if (newname == null) 0L else LibcDynamicFfi.allocUtf8CString(newname)
    try {
        return LibcDynamicFfi.invoke("rename", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun tmpfile(): FILE? {
    val rawRet = LibcDynamicFfi.invoke("tmpfile", -1, longArrayOf())
    return if (rawRet == 0L) null else FILE(rawRet)
}

public fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("setvbuf", -1, longArrayOf(stream?.handle ?: 0L, buffer?.value ?: 0L, mode.toLong(), size.toLong())).toInt()
}

public fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    LibcDynamicFfi.invoke("setbuf", -1, longArrayOf(stream?.handle ?: 0L, buf?.value ?: 0L))
}

public fun getchar(): CInt {
    return LibcDynamicFfi.invoke("getchar", -1, longArrayOf()).toInt()
}

public fun putchar(c: CInt): CInt {
    return LibcDynamicFfi.invoke("putchar", -1, longArrayOf(c.toLong())).toInt()
}

public fun fgetc(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fgetc", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("fgets", -1, longArrayOf(buf?.value ?: 0L, n.toLong(), stream?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fputc(c: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fputc", -1, longArrayOf(c.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun fputs(s: String?, stream: FILE?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("fputs", -1, longArrayOf(__cstr_0, stream?.handle ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun puts(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("puts", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ungetc(c: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("ungetc", -1, longArrayOf(c.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fread", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), nobj.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fwrite", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), nobj.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt {
    return LibcDynamicFfi.invoke("fseek", -1, longArrayOf(stream?.handle ?: 0L, offset, whence.toLong())).toInt()
}

public fun ftell(stream: FILE?): CLong {
    return LibcDynamicFfi.invoke("ftell", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun rewind(stream: FILE?) {
    LibcDynamicFfi.invoke("rewind", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun fgetpos(stream: FILE?, ptr: FposT?): CInt {
    return LibcDynamicFfi.invoke("fgetpos", -1, longArrayOf(stream?.handle ?: 0L, ptr?.value ?: 0L)).toInt()
}

public fun fsetpos(stream: FILE?, ptr: FposT?): CInt {
    return LibcDynamicFfi.invoke("fsetpos", -1, longArrayOf(stream?.handle ?: 0L, ptr?.value ?: 0L)).toInt()
}

public fun feof(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("feof", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun ferror(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("ferror", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun perror(s: String?) {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        LibcDynamicFfi.invoke("perror", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atof(s: String?): CDouble {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("atof", 0, false, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atoi(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atoi", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atol(s: String?): CLong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atol", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atoll(s: String?): CLonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atoll", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtod(s: String?, endp: COpaquePointer?): CDouble {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("strtod", 0, false, longArrayOf(__cstr_0, endp?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtof(s: String?, endp: COpaquePointer?): CFloat {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("strtof", 0, true, longArrayOf(__cstr_0, endp?.value ?: 0L)).toFloat()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtol", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoll", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoul", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoull", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("calloc", -1, longArrayOf(nobj.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun malloc(size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("malloc", -1, longArrayOf(size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("realloc", -1, longArrayOf(p?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun free(p: COpaquePointer?) {
    LibcDynamicFfi.invoke("free", -1, longArrayOf(p?.value ?: 0L))
}

public fun abort(): Nothing {
    LibcDynamicFfi.invoke("abort", -1, longArrayOf())
    error("unreachable")
}

public fun exit(status: CInt): Nothing {
    LibcDynamicFfi.invoke("exit", -1, longArrayOf(status.toLong()))
    error("unreachable")
}

public fun atexit(cb: AtexitCbCallback): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("atexit", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun system(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("system", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getenv(s: String?): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("getenv", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcpy", -1, longArrayOf(dst?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncpy", -1, longArrayOf(dst?.value ?: 0L, __cstr_1, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcat", -1, longArrayOf(s?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncat", -1, longArrayOf(s?.value ?: 0L, __cstr_1, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcmp(cs: String?, ct: String?): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncmp(cs: String?, ct: String?, n: SizeT): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strncmp", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcoll(cs: String?, ct: String?): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcoll", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strchr(cs: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strrchr(cs: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strrchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strspn(cs: String?, ct: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcspn(cs: String?, ct: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strdup(cs: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strdup", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strpbrk(cs: String?, ct: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strpbrk", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strstr(cs: String?, ct: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strstr", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strlen(cs: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        return LibcDynamicFfi.invoke("strlen", -1, longArrayOf(__cstr_0)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strnlen(cs: String?, maxlen: SizeT): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        return LibcDynamicFfi.invoke("strnlen", -1, longArrayOf(__cstr_0, maxlen.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strerror(n: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("strerror", -1, longArrayOf(n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? {
    val __cstr_1 = if (t == null) 0L else LibcDynamicFfi.allocUtf8CString(t)
    try {
        val rawRet = LibcDynamicFfi.invoke("strtok", -1, longArrayOf(s?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strxfrm", -1, longArrayOf(s?.value ?: 0L, __cstr_1, n.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wcslen(buf: WcharT?): SizeT {
    val __slot_0 = if (buf == null) 0L else LibcDynamicFfi.allocScalarSlot(buf.toLong())
    try {
        return LibcDynamicFfi.invoke("wcslen", -1, longArrayOf(__slot_0)).toULong()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT {
    val __slot_1 = if (src == null) 0L else LibcDynamicFfi.allocScalarSlot(src.toLong())
    try {
        return LibcDynamicFfi.invoke("wcstombs", -1, longArrayOf(dest?.value ?: 0L, __slot_1, n.toLong())).toULong()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? {
    val __slot_0 = if (cx == null) 0L else LibcDynamicFfi.allocScalarSlot(cx.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("wmemchr", -1, longArrayOf(__slot_0, c.toLong(), n.toLong()))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt {
    return LibcDynamicFfi.invoke("memcmp", -1, longArrayOf(cx?.value ?: 0L, ct?.value ?: 0L, n.toLong())).toInt()
}

public fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memcpy", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmove", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memset", -1, longArrayOf(dest?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun abs(i: CInt): CInt {
    return LibcDynamicFfi.invoke("abs", -1, longArrayOf(i.toLong())).toInt()
}

public fun labs(i: CLong): CLong {
    return LibcDynamicFfi.invoke("labs", -1, longArrayOf(i))
}

public fun rand(): CInt {
    return LibcDynamicFfi.invoke("rand", -1, longArrayOf()).toInt()
}

public fun srand(seed: CUint) {
    LibcDynamicFfi.invoke("srand", -1, longArrayOf(seed.toLong()))
}

public fun getpwnam(name: String?): Passwd? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getpwnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getpwuid(uid: UidT): Passwd? {
    val rawRet = LibcDynamicFfi.invoke("getpwuid", -1, longArrayOf(uid.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("fprintf", 2, longArrayOf(stream?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun printf(format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("printf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("snprintf", 3, longArrayOf(s?.value ?: 0L, n.toLong(), __cstr_2) + variadicArgs).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("sprintf", 2, longArrayOf(s?.value ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("fscanf", 2, longArrayOf(stream?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun scanf(format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("scanf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("sscanf", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getcharUnlocked(): CInt {
    return LibcDynamicFfi.invoke("getchar_unlocked", -1, longArrayOf()).toInt()
}

public fun putcharUnlocked(c: CInt): CInt {
    return LibcDynamicFfi.invoke("putchar_unlocked", -1, longArrayOf(c.toLong())).toInt()
}

public fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt {
    return LibcDynamicFfi.invoke("socket", -1, longArrayOf(domain.toLong(), ty.toLong(), protocol.toLong())).toInt()
}

public fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt {
    return LibcDynamicFfi.invoke("connect", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, len.toLong())).toInt()
}

public fun listen(socket: CInt, backlog: CInt): CInt {
    return LibcDynamicFfi.invoke("listen", -1, longArrayOf(socket.toLong(), backlog.toLong())).toInt()
}

public fun accept(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt {
    val __slot_2 = if (addressLen == null) 0L else LibcDynamicFfi.allocScalarSlot(addressLen.toLong())
    try {
        return LibcDynamicFfi.invoke("accept", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getpeername(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt {
    val __slot_2 = if (addressLen == null) 0L else LibcDynamicFfi.allocScalarSlot(addressLen.toLong())
    try {
        return LibcDynamicFfi.invoke("getpeername", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getsockname(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt {
    val __slot_2 = if (addressLen == null) 0L else LibcDynamicFfi.allocScalarSlot(addressLen.toLong())
    try {
        return LibcDynamicFfi.invoke("getsockname", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("setsockopt", -1, longArrayOf(socket.toLong(), level.toLong(), name.toLong(), value?.value ?: 0L, optionLen.toLong())).toInt()
}

public fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt {
    val __slot_3 = if (socketVector == null) 0L else LibcDynamicFfi.allocScalarSlot(socketVector.toLong())
    try {
        return LibcDynamicFfi.invoke("socketpair", -1, longArrayOf(domain.toLong(), type.toLong(), protocol.toLong(), __slot_3)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT {
    return LibcDynamicFfi.invoke("sendto", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), addr?.value ?: 0L, addrlen.toLong()))
}

public fun shutdown(socket: CInt, how: CInt): CInt {
    return LibcDynamicFfi.invoke("shutdown", -1, longArrayOf(socket.toLong(), how.toLong())).toInt()
}

public fun chmod(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("chmod", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fchmod(fd: CInt, mode: ModeT): CInt {
    return LibcDynamicFfi.invoke("fchmod", -1, longArrayOf(fd.toLong(), mode.toLong())).toInt()
}

public fun fstat(fildes: CInt, buf: Stat?): CInt {
    return LibcDynamicFfi.invoke("fstat", -1, longArrayOf(fildes.toLong(), buf?.value ?: 0L)).toInt()
}

public fun mkdir(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("mkdir", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun stat(path: String?, buf: Stat?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("stat", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pclose(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("pclose", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun fdopen(fd: CInt, mode: String?): FILE? {
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("fdopen", -1, longArrayOf(fd.toLong(), __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fileno(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fileno", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun creat(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("creat", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("fcntl", 2, longArrayOf(fd.toLong(), cmd.toLong()) + variadicArgs).toInt()
}

public fun opendir(dirname: String?): DIR? {
    val __cstr_0 = if (dirname == null) 0L else LibcDynamicFfi.allocUtf8CString(dirname)
    try {
        val rawRet = LibcDynamicFfi.invoke("opendir", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else DIR(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun readdir(dirp: DIR?): Dirent? {
    val rawRet = LibcDynamicFfi.invoke("readdir", -1, longArrayOf(dirp?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("readdir_r", -1, longArrayOf(dirp?.handle ?: 0L, entry?.value ?: 0L, result?.value ?: 0L)).toInt()
}

public fun closedir(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("closedir", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

public fun rewinddir(dirp: DIR?) {
    LibcDynamicFfi.invoke("rewinddir", -1, longArrayOf(dirp?.handle ?: 0L))
}

public fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("openat", 3, longArrayOf(dirfd.toLong(), __cstr_1, flags.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("fchmodat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fchown(fd: CInt, owner: UidT, group: GidT): CInt {
    return LibcDynamicFfi.invoke("fchown", -1, longArrayOf(fd.toLong(), owner.toLong(), group.toLong())).toInt()
}

public fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("fchownat", -1, longArrayOf(dirfd.toLong(), __cstr_1, owner.toLong(), group.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("fstatat", -1, longArrayOf(dirfd.toLong(), __cstr_1, buf?.value ?: 0L, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_3 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("linkat", -1, longArrayOf(olddirfd.toLong(), __cstr_1, newdirfd.toLong(), __cstr_3, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mkdirat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("readlinkat", -1, longArrayOf(dirfd.toLong(), __cstr_1, buf?.value ?: 0L, bufsiz.toLong()))
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_3 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("renameat", -1, longArrayOf(olddirfd.toLong(), __cstr_1, newdirfd.toLong(), __cstr_3)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt {
    val __cstr_0 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    val __cstr_2 = if (linkpath == null) 0L else LibcDynamicFfi.allocUtf8CString(linkpath)
    try {
        return LibcDynamicFfi.invoke("symlinkat", -1, longArrayOf(__cstr_0, newdirfd.toLong(), __cstr_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("unlinkat", -1, longArrayOf(dirfd.toLong(), __cstr_1, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun access(path: String?, amode: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("access", -1, longArrayOf(__cstr_0, amode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun alarm(seconds: CUint): CUint {
    return LibcDynamicFfi.invoke("alarm", -1, longArrayOf(seconds.toLong())).toUInt()
}

public fun chdir(dir: String?): CInt {
    val __cstr_0 = if (dir == null) 0L else LibcDynamicFfi.allocUtf8CString(dir)
    try {
        return LibcDynamicFfi.invoke("chdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun chown(path: String?, uid: UidT, gid: GidT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("chown", -1, longArrayOf(__cstr_0, uid.toLong(), gid.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun lchown(path: String?, uid: UidT, gid: GidT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("lchown", -1, longArrayOf(__cstr_0, uid.toLong(), gid.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun close(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("close", -1, longArrayOf(fd.toLong())).toInt()
}

public fun dup(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("dup", -1, longArrayOf(fd.toLong())).toInt()
}

public fun dup2(src: CInt, dst: CInt): CInt {
    return LibcDynamicFfi.invoke("dup2", -1, longArrayOf(src.toLong(), dst.toLong())).toInt()
}

public fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg0)
    try {
        return LibcDynamicFfi.invoke("execl", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg0)
    try {
        return LibcDynamicFfi.invoke("execle", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    val __cstr_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg0)
    try {
        return LibcDynamicFfi.invoke("execlp", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// DIFF(main): changed to `* const *` in e77f551de9
public fun execv(prog: String?, argv: COpaquePointer?): CInt {
    val __cstr_0 = if (prog == null) 0L else LibcDynamicFfi.allocUtf8CString(prog)
    try {
        return LibcDynamicFfi.invoke("execv", -1, longArrayOf(__cstr_0, argv?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __cstr_0 = if (prog == null) 0L else LibcDynamicFfi.allocUtf8CString(prog)
    try {
        return LibcDynamicFfi.invoke("execve", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun execvp(c: String?, argv: COpaquePointer?): CInt {
    val __cstr_0 = if (c == null) 0L else LibcDynamicFfi.allocUtf8CString(c)
    try {
        return LibcDynamicFfi.invoke("execvp", -1, longArrayOf(__cstr_0, argv?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fork(): PidT {
    return LibcDynamicFfi.invoke("fork", -1, longArrayOf()).toInt()
}

public fun fpathconf(filedes: CInt, name: CInt): CLong {
    return LibcDynamicFfi.invoke("fpathconf", -1, longArrayOf(filedes.toLong(), name.toLong()))
}

public fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getcwd", -1, longArrayOf(buf?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getegid(): GidT {
    return LibcDynamicFfi.invoke("getegid", -1, longArrayOf()).toUInt()
}

public fun geteuid(): UidT {
    return LibcDynamicFfi.invoke("geteuid", -1, longArrayOf()).toUInt()
}

public fun getgid(): GidT {
    return LibcDynamicFfi.invoke("getgid", -1, longArrayOf()).toUInt()
}

public fun getgroups(ngroupsMax: CInt, groups: UInt?): CInt {
    val __slot_1 = if (groups == null) 0L else LibcDynamicFfi.allocScalarSlot(groups.toLong())
    try {
        return LibcDynamicFfi.invoke("getgroups", -1, longArrayOf(ngroupsMax.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getlogin(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getlogin", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt {
    val __cstr_2 = if (optstr == null) 0L else LibcDynamicFfi.allocUtf8CString(optstr)
    try {
        return LibcDynamicFfi.invoke("getopt", -1, longArrayOf(argc.toLong(), argv?.value ?: 0L, __cstr_2)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun getpgid(pid: PidT): PidT {
    return LibcDynamicFfi.invoke("getpgid", -1, longArrayOf(pid.toLong())).toInt()
}

public fun getpgrp(): PidT {
    return LibcDynamicFfi.invoke("getpgrp", -1, longArrayOf()).toInt()
}

public fun getpid(): PidT {
    return LibcDynamicFfi.invoke("getpid", -1, longArrayOf()).toInt()
}

public fun getppid(): PidT {
    return LibcDynamicFfi.invoke("getppid", -1, longArrayOf()).toInt()
}

public fun getuid(): UidT {
    return LibcDynamicFfi.invoke("getuid", -1, longArrayOf()).toUInt()
}

public fun isatty(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("isatty", -1, longArrayOf(fd.toLong())).toInt()
}

public fun link(src: String?, dst: String?): CInt {
    val __cstr_0 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    val __cstr_1 = if (dst == null) 0L else LibcDynamicFfi.allocUtf8CString(dst)
    try {
        return LibcDynamicFfi.invoke("link", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT {
    return LibcDynamicFfi.invoke("lseek", -1, longArrayOf(fd.toLong(), offset, whence.toLong()))
}

public fun pathconf(path: String?, name: CInt): CLong {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("pathconf", -1, longArrayOf(__cstr_0, name.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pause(): CInt {
    return LibcDynamicFfi.invoke("pause", -1, longArrayOf()).toInt()
}

public fun pipe(fds: CInt?): CInt {
    val __slot_0 = if (fds == null) 0L else LibcDynamicFfi.allocScalarSlot(fds.toLong())
    try {
        return LibcDynamicFfi.invoke("pipe", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("posix_memalign", -1, longArrayOf(memptr?.value ?: 0L, align.toLong(), size.toLong())).toInt()
}

public fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("read", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong()))
}

public fun rmdir(path: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("rmdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun seteuid(uid: UidT): CInt {
    return LibcDynamicFfi.invoke("seteuid", -1, longArrayOf(uid.toLong())).toInt()
}

public fun setegid(gid: GidT): CInt {
    return LibcDynamicFfi.invoke("setegid", -1, longArrayOf(gid.toLong())).toInt()
}

public fun setgid(gid: GidT): CInt {
    return LibcDynamicFfi.invoke("setgid", -1, longArrayOf(gid.toLong())).toInt()
}

public fun setpgid(pid: PidT, pgid: PidT): CInt {
    return LibcDynamicFfi.invoke("setpgid", -1, longArrayOf(pid.toLong(), pgid.toLong())).toInt()
}

public fun setsid(): PidT {
    return LibcDynamicFfi.invoke("setsid", -1, longArrayOf()).toInt()
}

public fun setuid(uid: UidT): CInt {
    return LibcDynamicFfi.invoke("setuid", -1, longArrayOf(uid.toLong())).toInt()
}

public fun sleep(secs: CUint): CUint {
    return LibcDynamicFfi.invoke("sleep", -1, longArrayOf(secs.toLong())).toUInt()
}

public fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("nanosleep", -1, longArrayOf(rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}

public fun tcgetpgrp(fd: CInt): PidT {
    return LibcDynamicFfi.invoke("tcgetpgrp", -1, longArrayOf(fd.toLong())).toInt()
}

public fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt {
    return LibcDynamicFfi.invoke("tcsetpgrp", -1, longArrayOf(fd.toLong(), pgrp.toLong())).toInt()
}

public fun ttyname(fd: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ttyname", -1, longArrayOf(fd.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun unlink(c: String?): CInt {
    val __cstr_0 = if (c == null) 0L else LibcDynamicFfi.allocUtf8CString(c)
    try {
        return LibcDynamicFfi.invoke("unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wait(status: CInt?): PidT {
    val __slot_0 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("wait", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT {
    val __slot_1 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("waitpid", -1, longArrayOf(pid.toLong(), __slot_1, options.toLong())).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("write", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong()))
}

public fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pread", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong(), offset))
}

public fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pwrite", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong(), offset))
}

public fun umask(mask: ModeT): ModeT {
    return LibcDynamicFfi.invoke("umask", -1, longArrayOf(mask.toLong())).toUInt()
}

public fun utime(file: String?, buf: Utimbuf?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utime", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun kill(pid: PidT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("kill", -1, longArrayOf(pid.toLong(), sig.toLong())).toInt()
}

public fun mlock(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("mlock", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun munlock(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("munlock", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun mlockall(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mlockall", -1, longArrayOf(flags.toLong())).toInt()
}

public fun munlockall(): CInt {
    return LibcDynamicFfi.invoke("munlockall", -1, longArrayOf()).toInt()
}

public fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong(), flags.toLong(), fd.toLong(), offset))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun munmap(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("munmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun ifNametoindex(ifname: String?): CUint {
    val __cstr_0 = if (ifname == null) 0L else LibcDynamicFfi.allocUtf8CString(ifname)
    try {
        return LibcDynamicFfi.invoke("if_nametoindex", -1, longArrayOf(__cstr_0)).toUInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("if_indextoname", -1, longArrayOf(ifindex.toLong(), ifname?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun lstat(path: String?, buf: Stat?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("lstat", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fsync(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("fsync", -1, longArrayOf(fd.toLong())).toInt()
}

public fun setenv(name: String?, value: String?, overwrite: CInt): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __cstr_1 = if (value == null) 0L else LibcDynamicFfi.allocUtf8CString(value)
    try {
        return LibcDynamicFfi.invoke("setenv", -1, longArrayOf(__cstr_0, __cstr_1, overwrite.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun unsetenv(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("unsetenv", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun symlink(path1: String?, path2: String?): CInt {
    val __cstr_0 = if (path1 == null) 0L else LibcDynamicFfi.allocUtf8CString(path1)
    val __cstr_1 = if (path2 == null) 0L else LibcDynamicFfi.allocUtf8CString(path2)
    try {
        return LibcDynamicFfi.invoke("symlink", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun ftruncate(fd: CInt, length: OffT): CInt {
    return LibcDynamicFfi.invoke("ftruncate", -1, longArrayOf(fd.toLong(), length)).toInt()
}

public fun signal(signum: CInt, handler: SighandlerT): SighandlerT {
    return LibcDynamicFfi.invoke("signal", -1, longArrayOf(signum.toLong(), handler.toLong())).toULong()
}

public fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        val rawRet = LibcDynamicFfi.invoke("realpath", -1, longArrayOf(__cstr_0, resolved?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun flock(fd: CInt, operation: CInt): CInt {
    return LibcDynamicFfi.invoke("flock", -1, longArrayOf(fd.toLong(), operation.toLong())).toInt()
}

public fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun times(buf: Tms?): ClockT {
    return LibcDynamicFfi.invoke("times", -1, longArrayOf(buf?.value ?: 0L))
}

public fun pthreadSelf(): PthreadT {
    return LibcDynamicFfi.invoke("pthread_self", -1, longArrayOf()).toULong()
}

public fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_join", -1, longArrayOf(native.toLong(), value?.value ?: 0L)).toInt()
}

public fun pthreadExit(value: COpaquePointer?): Nothing {
    LibcDynamicFfi.invoke("pthread_exit", -1, longArrayOf(value?.value ?: 0L))
    error("unreachable")
}

public fun pthreadAttrInit(attr: PthreadAttrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt {
    val __slot_1 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstacksize", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setstacksize", -1, longArrayOf(attr?.value ?: 0L, stackSize.toLong())).toInt()
}

public fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setdetachstate", -1, longArrayOf(attr?.value ?: 0L, state.toLong())).toInt()
}

public fun pthreadDetach(thread: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_detach", -1, longArrayOf(thread.toLong())).toInt()
}

public fun schedYield(): CInt {
    return LibcDynamicFfi.invoke("sched_yield", -1, longArrayOf()).toInt()
}

public fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt {
    val __slot_0 = if (key == null) 0L else LibcDynamicFfi.allocScalarSlot(key.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_key_create", -1, longArrayOf(__slot_0, dtor?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadKeyDelete(key: PthreadKeyT): CInt {
    return LibcDynamicFfi.invoke("pthread_key_delete", -1, longArrayOf(key.toLong())).toInt()
}

public fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("pthread_getspecific", -1, longArrayOf(key.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_setspecific", -1, longArrayOf(key.toLong(), value?.value ?: 0L)).toInt()
}

public fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_init", -1, longArrayOf(lock?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_destroy", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexLock(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_lock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_trylock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_unlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_settype", -1, longArrayOf(attr?.value ?: 0L, type.toLong())).toInt()
}

public fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_init", -1, longArrayOf(cond?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_wait", -1, longArrayOf(cond?.value ?: 0L, lock?.value ?: 0L)).toInt()
}

public fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_timedwait", -1, longArrayOf(cond?.value ?: 0L, lock?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun pthreadCondSignal(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_signal", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

public fun pthreadCondBroadcast(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_broadcast", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

public fun pthreadCondDestroy(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_destroy", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

public fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_init", -1, longArrayOf(lock?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_destroy", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_rdlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_tryrdlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_wrlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_trywrlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_unlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_getname_np", -1, longArrayOf(thread.toLong(), name?.value ?: 0L, len.toLong())).toInt()
}

public fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("pthread_setname_np", -1, longArrayOf(thread.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("strerror_r", -1, longArrayOf(errnum.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: UInt?): CInt {
    val __slot_4 = if (optlen == null) 0L else LibcDynamicFfi.allocScalarSlot(optlen.toLong())
    try {
        return LibcDynamicFfi.invoke("getsockopt", -1, longArrayOf(sockfd.toLong(), level.toLong(), optname.toLong(), optval?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun raise(signum: CInt): CInt {
    return LibcDynamicFfi.invoke("raise", -1, longArrayOf(signum.toLong())).toInt()
}

public fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt {
    return LibcDynamicFfi.invoke("sigaction", -1, longArrayOf(signum.toLong(), act?.value ?: 0L, oldact?.value ?: 0L)).toInt()
}

public fun utimes(filename: String?, times: Timeval?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("utimes", -1, longArrayOf(__cstr_0, times?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun dlopen(filename: String?, flag: CInt): COpaquePointer? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        val rawRet = LibcDynamicFfi.invoke("dlopen", -1, longArrayOf(__cstr_0, flag.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun dlerror(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("dlerror", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? {
    val __cstr_1 = if (symbol == null) 0L else LibcDynamicFfi.allocUtf8CString(symbol)
    try {
        val rawRet = LibcDynamicFfi.invoke("dlsym", -1, longArrayOf(handle?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun dlclose(handle: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dlclose", -1, longArrayOf(handle?.value ?: 0L)).toInt()
}

public fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt {
    return LibcDynamicFfi.invoke("dladdr", -1, longArrayOf(addr?.value ?: 0L, info?.value ?: 0L)).toInt()
}

public fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt {
    val __cstr_0 = if (node == null) 0L else LibcDynamicFfi.allocUtf8CString(node)
    val __cstr_1 = if (service == null) 0L else LibcDynamicFfi.allocUtf8CString(service)
    try {
        return LibcDynamicFfi.invoke("getaddrinfo", -1, longArrayOf(__cstr_0, __cstr_1, hints?.value ?: 0L, res?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun freeaddrinfo(res: Addrinfo?) {
    LibcDynamicFfi.invoke("freeaddrinfo", -1, longArrayOf(res?.value ?: 0L))
}

public fun gaiStrerror(errcode: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("gai_strerror", -1, longArrayOf(errcode.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun resInit(): CInt {
    return LibcDynamicFfi.invoke("res_init", -1, longArrayOf()).toInt()
}

public fun gmtimeR(timeP: CLong?, result: Tm?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime_r", -1, longArrayOf(__slot_0, result?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtimeR(timeP: CLong?, result: Tm?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime_r", -1, longArrayOf(__slot_0, result?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun mktime(tm: Tm?): TimeT {
    return LibcDynamicFfi.invoke("mktime", -1, longArrayOf(tm?.value ?: 0L))
}

public fun time(time: CLong?): TimeT {
    val __slot_0 = if (time == null) 0L else LibcDynamicFfi.allocScalarSlot(time)
    try {
        return LibcDynamicFfi.invoke("time", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun gmtime(timeP: CLong?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtime(timeP: CLong?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mknod", -1, longArrayOf(__cstr_0, mode.toLong(), dev.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun uname(buf: Utsname?): CInt {
    return LibcDynamicFfi.invoke("uname", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun gethostname(name: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("gethostname", -1, longArrayOf(name?.value ?: 0L, len.toLong())).toInt()
}

public fun getservbyname(name: String?, proto: String?): Servent? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __cstr_1 = if (proto == null) 0L else LibcDynamicFfi.allocUtf8CString(proto)
    try {
        val rawRet = LibcDynamicFfi.invoke("getservbyname", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getprotobyname(name: String?): Protoent? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getprotobyname", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getprotobynumber(proto: CInt): Protoent? {
    val rawRet = LibcDynamicFfi.invoke("getprotobynumber", -1, longArrayOf(proto.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun usleep(secs: CUint): CInt {
    return LibcDynamicFfi.invoke("usleep", -1, longArrayOf(secs.toLong())).toInt()
}

public fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("send", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong()))
}

public fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("recv", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong()))
}

public fun putenv(string: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("putenv", -1, longArrayOf(string?.value ?: 0L)).toInt()
}

public fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt {
    return LibcDynamicFfi.invoke("poll", -1, longArrayOf(fds?.value ?: 0L, nfds.toLong(), timeout.toLong())).toInt()
}

public fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt {
    return LibcDynamicFfi.invoke("select", -1, longArrayOf(nfds.toLong(), readfds?.value ?: 0L, writefds?.value ?: 0L, errorfds?.value ?: 0L, timeout?.value ?: 0L)).toInt()
}

public fun setlocale(category: CInt, locale: String?): COpaquePointer? {
    val __cstr_1 = if (locale == null) 0L else LibcDynamicFfi.allocUtf8CString(locale)
    try {
        val rawRet = LibcDynamicFfi.invoke("setlocale", -1, longArrayOf(category.toLong(), __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun localeconv(): Lconv? {
    val rawRet = LibcDynamicFfi.invoke("localeconv", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun semDestroy(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_destroy", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semWait(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_wait", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semTrywait(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_trywait", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semPost(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_post", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt {
    return LibcDynamicFfi.invoke("sem_init", -1, longArrayOf(sem?.value ?: 0L, pshared.toLong(), value.toLong())).toInt()
}

public fun statvfs(path: String?, buf: Statvfs?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("statvfs", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fstatvfs(fd: CInt, buf: Statvfs?): CInt {
    return LibcDynamicFfi.invoke("fstatvfs", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("readlink", -1, longArrayOf(__cstr_0, buf?.value ?: 0L, bufsz.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun sigemptyset(set: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigemptyset", -1, longArrayOf(set?.value ?: 0L)).toInt()
}

public fun sigaddset(set: SigsetT?, signum: CInt): CInt {
    return LibcDynamicFfi.invoke("sigaddset", -1, longArrayOf(set?.value ?: 0L, signum.toLong())).toInt()
}

public fun sigfillset(set: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigfillset", -1, longArrayOf(set?.value ?: 0L)).toInt()
}

public fun sigdelset(set: SigsetT?, signum: CInt): CInt {
    return LibcDynamicFfi.invoke("sigdelset", -1, longArrayOf(set?.value ?: 0L, signum.toLong())).toInt()
}

public fun sigismember(set: SigsetT?, signum: CInt): CInt {
    return LibcDynamicFfi.invoke("sigismember", -1, longArrayOf(set?.value ?: 0L, signum.toLong())).toInt()
}

public fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigprocmask", -1, longArrayOf(how.toLong(), set?.value ?: 0L, oldset?.value ?: 0L)).toInt()
}

public fun sigpending(set: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigpending", -1, longArrayOf(set?.value ?: 0L)).toInt()
}

public fun timegm(tm: Tm?): TimeT {
    return LibcDynamicFfi.invoke("timegm", -1, longArrayOf(tm?.value ?: 0L))
}

public fun getsid(pid: PidT): PidT {
    return LibcDynamicFfi.invoke("getsid", -1, longArrayOf(pid.toLong())).toInt()
}

public fun sysconf(name: CInt): CLong {
    return LibcDynamicFfi.invoke("sysconf", -1, longArrayOf(name.toLong()))
}

public fun mkfifo(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("mkfifo", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("pselect", -1, longArrayOf(nfds.toLong(), readfds?.value ?: 0L, writefds?.value ?: 0L, errorfds?.value ?: 0L, timeout?.value ?: 0L, sigmask?.value ?: 0L)).toInt()
}

public fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt {
    return LibcDynamicFfi.invoke("fseeko", -1, longArrayOf(stream?.handle ?: 0L, offset, whence.toLong())).toInt()
}

public fun ftello(stream: FILE?): OffT {
    return LibcDynamicFfi.invoke("ftello", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun tcdrain(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("tcdrain", -1, longArrayOf(fd.toLong())).toInt()
}

public fun cfgetispeed(termios: Termios?): SpeedT {
    return LibcDynamicFfi.invoke("cfgetispeed", -1, longArrayOf(termios?.value ?: 0L)).toUInt()
}

public fun cfgetospeed(termios: Termios?): SpeedT {
    return LibcDynamicFfi.invoke("cfgetospeed", -1, longArrayOf(termios?.value ?: 0L)).toUInt()
}

public fun cfmakeraw(termios: Termios?) {
    LibcDynamicFfi.invoke("cfmakeraw", -1, longArrayOf(termios?.value ?: 0L))
}

public fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt {
    return LibcDynamicFfi.invoke("cfsetispeed", -1, longArrayOf(termios?.value ?: 0L, speed.toLong())).toInt()
}

public fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt {
    return LibcDynamicFfi.invoke("cfsetospeed", -1, longArrayOf(termios?.value ?: 0L, speed.toLong())).toInt()
}

public fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt {
    return LibcDynamicFfi.invoke("cfsetspeed", -1, longArrayOf(termios?.value ?: 0L, speed.toLong())).toInt()
}

public fun tcgetattr(fd: CInt, termios: Termios?): CInt {
    return LibcDynamicFfi.invoke("tcgetattr", -1, longArrayOf(fd.toLong(), termios?.value ?: 0L)).toInt()
}

public fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt {
    return LibcDynamicFfi.invoke("tcsetattr", -1, longArrayOf(fd.toLong(), optionalActions.toLong(), termios?.value ?: 0L)).toInt()
}

public fun tcflow(fd: CInt, action: CInt): CInt {
    return LibcDynamicFfi.invoke("tcflow", -1, longArrayOf(fd.toLong(), action.toLong())).toInt()
}

public fun tcflush(fd: CInt, action: CInt): CInt {
    return LibcDynamicFfi.invoke("tcflush", -1, longArrayOf(fd.toLong(), action.toLong())).toInt()
}

public fun tcgetsid(fd: CInt): PidT {
    return LibcDynamicFfi.invoke("tcgetsid", -1, longArrayOf(fd.toLong())).toInt()
}

public fun tcsendbreak(fd: CInt, duration: CInt): CInt {
    return LibcDynamicFfi.invoke("tcsendbreak", -1, longArrayOf(fd.toLong(), duration.toLong())).toInt()
}

public fun mkstemp(template: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("mkstemp", -1, longArrayOf(template?.value ?: 0L)).toInt()
}

public fun mkdtemp(template: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mkdtemp", -1, longArrayOf(template?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun tmpnam(ptr: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("tmpnam", -1, longArrayOf(ptr?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    val __cstr_0 = if (ident == null) 0L else LibcDynamicFfi.allocUtf8CString(ident)
    try {
        LibcDynamicFfi.invoke("openlog", -1, longArrayOf(__cstr_0, logopt.toLong(), facility.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun closelog() {
    LibcDynamicFfi.invoke("closelog", -1, longArrayOf())
}

public fun setlogmask(maskpri: CInt): CInt {
    return LibcDynamicFfi.invoke("setlogmask", -1, longArrayOf(maskpri.toLong())).toInt()
}

public fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
    val __cstr_1 = if (message == null) 0L else LibcDynamicFfi.allocUtf8CString(message)
    try {
        LibcDynamicFfi.invoke("syslog", 2, longArrayOf(priority.toLong(), __cstr_1) + variadicArgs)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun grantpt(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("grantpt", -1, longArrayOf(fd.toLong())).toInt()
}

public fun posixOpenpt(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_openpt", -1, longArrayOf(flags.toLong())).toInt()
}

public fun ptsname(fd: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ptsname", -1, longArrayOf(fd.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun unlockpt(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("unlockpt", -1, longArrayOf(fd.toLong())).toInt()
}

public fun fdatasync(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("fdatasync", -1, longArrayOf(fd.toLong())).toInt()
}

public fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_getres", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_settime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun dirfd(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("dirfd", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

public fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_getattr_np", -1, longArrayOf(native.toLong(), attr?.value ?: 0L)).toInt()
}

public fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt {
    val __slot_2 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstack", -1, longArrayOf(attr?.value ?: 0L, stackaddr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun memalign(align: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memalign", -1, longArrayOf(align.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setgroups(ngroups: SizeT, ptr: UInt?): CInt {
    val __slot_1 = if (ptr == null) 0L else LibcDynamicFfi.allocScalarSlot(ptr.toLong())
    try {
        return LibcDynamicFfi.invoke("setgroups", -1, longArrayOf(ngroups.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pipe2(fds: CInt?, flags: CInt): CInt {
    val __slot_0 = if (fds == null) 0L else LibcDynamicFfi.allocScalarSlot(fds.toLong())
    try {
        return LibcDynamicFfi.invoke("pipe2", -1, longArrayOf(__slot_0, flags.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun statfs(path: String?, buf: Statfs?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("statfs", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fstatfs(fd: CInt, buf: Statfs?): CInt {
    return LibcDynamicFfi.invoke("fstatfs", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memrchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_fadvise", -1, longArrayOf(fd.toLong(), offset, len, advise.toLong())).toInt()
}

public fun futimens(fd: CInt, times: Timespec?): CInt {
    return LibcDynamicFfi.invoke("futimens", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("utimensat", -1, longArrayOf(dirfd.toLong(), __cstr_1, times?.value ?: 0L, flag.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun duplocale(base: LocaleT): LocaleT {
    val rawRet = LibcDynamicFfi.invoke("duplocale", -1, longArrayOf(base?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun freelocale(loc: LocaleT) {
    LibcDynamicFfi.invoke("freelocale", -1, longArrayOf(loc?.value ?: 0L))
}

public fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT {
    val __cstr_1 = if (locale == null) 0L else LibcDynamicFfi.allocUtf8CString(locale)
    try {
        val rawRet = LibcDynamicFfi.invoke("newlocale", -1, longArrayOf(mask.toLong(), __cstr_1, base?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun uselocale(loc: LocaleT): LocaleT {
    val rawRet = LibcDynamicFfi.invoke("uselocale", -1, longArrayOf(loc?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fdopendir(fd: CInt): DIR? {
    val rawRet = LibcDynamicFfi.invoke("fdopendir", -1, longArrayOf(fd.toLong()))
    return if (rawRet == 0L) null else DIR(rawRet)
}

public fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mknodat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), dev.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: CInt?): CInt {
    val __slot_1 = if (clockId == null) 0L else LibcDynamicFfi.allocScalarSlot(clockId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_getclock", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setclock", -1, longArrayOf(attr?.value ?: 0L, clockId.toLong())).toInt()
}

public fun accept4(fd: CInt, addr: Sockaddr?, len: UInt?, flg: CInt): CInt {
    val __slot_2 = if (len == null) 0L else LibcDynamicFfi.allocScalarSlot(len.toLong())
    try {
        return LibcDynamicFfi.invoke("accept4", -1, longArrayOf(fd.toLong(), addr?.value ?: 0L, __slot_2, flg.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("ptsname_r", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun clearenv(): CInt {
    return LibcDynamicFfi.invoke("clearenv", -1, longArrayOf()).toInt()
}

public fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt {
    return LibcDynamicFfi.invoke("waitid", -1, longArrayOf(idtype.toLong(), id.toLong(), infop?.value ?: 0L, options.toLong())).toInt()
}

public fun setreuid(ruid: UidT, euid: UidT): CInt {
    return LibcDynamicFfi.invoke("setreuid", -1, longArrayOf(ruid.toLong(), euid.toLong())).toInt()
}

public fun setregid(rgid: GidT, egid: GidT): CInt {
    return LibcDynamicFfi.invoke("setregid", -1, longArrayOf(rgid.toLong(), egid.toLong())).toInt()
}

public fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): CInt {
    val __slot_0 = if (ruid == null) 0L else LibcDynamicFfi.allocScalarSlot(ruid.toLong())
    val __slot_1 = if (euid == null) 0L else LibcDynamicFfi.allocScalarSlot(euid.toLong())
    val __slot_2 = if (suid == null) 0L else LibcDynamicFfi.allocScalarSlot(suid.toLong())
    try {
        return LibcDynamicFfi.invoke("getresuid", -1, longArrayOf(__slot_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): CInt {
    val __slot_0 = if (rgid == null) 0L else LibcDynamicFfi.allocScalarSlot(rgid.toLong())
    val __slot_1 = if (egid == null) 0L else LibcDynamicFfi.allocScalarSlot(egid.toLong())
    val __slot_2 = if (sgid == null) 0L else LibcDynamicFfi.allocScalarSlot(sgid.toLong())
    try {
        return LibcDynamicFfi.invoke("getresgid", -1, longArrayOf(__slot_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun acct(filename: String?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("acct", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun brk(addr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("brk", -1, longArrayOf(addr?.value ?: 0L)).toInt()
}

public fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt {
    return LibcDynamicFfi.invoke("setresgid", -1, longArrayOf(rgid.toLong(), egid.toLong(), sgid.toLong())).toInt()
}

public fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt {
    return LibcDynamicFfi.invoke("setresuid", -1, longArrayOf(ruid.toLong(), euid.toLong(), suid.toLong())).toInt()
}

public fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    val __slot_1 = if (aslave == null) 0L else LibcDynamicFfi.allocScalarSlot(aslave.toLong())
    try {
        return LibcDynamicFfi.invoke("openpty", -1, longArrayOf(__slot_0, __slot_1, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// DIFF(main): changed to `* const *` in e77f551de9
public fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("execvpe", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fexecve", -1, longArrayOf(fd.toLong(), argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
}

public fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("ioctl", 2, longArrayOf(fd.toLong(), request.toLong()) + variadicArgs).toInt()
}

public fun lutimes(file: String?, times: Timeval?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("lutimes", -1, longArrayOf(__cstr_0, times?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun setpwent() {
    LibcDynamicFfi.invoke("setpwent", -1, longArrayOf())
}

public fun endpwent() {
    LibcDynamicFfi.invoke("endpwent", -1, longArrayOf())
}

public fun getpwent(): Passwd? {
    val rawRet = LibcDynamicFfi.invoke("getpwent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_open", -1, longArrayOf(__cstr_0, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// System V IPC
public fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt {
    return LibcDynamicFfi.invoke("shmget", -1, longArrayOf(key.toLong(), size.toLong(), shmflg.toLong())).toInt()
}

public fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("shmat", -1, longArrayOf(shmid.toLong(), shmaddr?.value ?: 0L, shmflg.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun shmdt(shmaddr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("shmdt", -1, longArrayOf(shmaddr?.value ?: 0L)).toInt()
}

public fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt {
    return LibcDynamicFfi.invoke("shmctl", -1, longArrayOf(shmid.toLong(), cmd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun ftok(pathname: String?, projId: CInt): KeyT {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("ftok", -1, longArrayOf(__cstr_0, projId.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt {
    return LibcDynamicFfi.invoke("semget", -1, longArrayOf(key.toLong(), nsems.toLong(), semflag.toLong())).toInt()
}

public fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt {
    return LibcDynamicFfi.invoke("semop", -1, longArrayOf(semid.toLong(), sops?.value ?: 0L, nsops.toLong())).toInt()
}

public fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("semctl", 3, longArrayOf(semid.toLong(), semnum.toLong(), cmd.toLong()) + variadicArgs).toInt()
}

public fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt {
    return LibcDynamicFfi.invoke("msgctl", -1, longArrayOf(msqid.toLong(), cmd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun msgget(key: KeyT, msgflg: CInt): CInt {
    return LibcDynamicFfi.invoke("msgget", -1, longArrayOf(key.toLong(), msgflg.toLong())).toInt()
}

public fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT {
    return LibcDynamicFfi.invoke("msgrcv", -1, longArrayOf(msqid.toLong(), msgp?.value ?: 0L, msgsz.toLong(), msgtyp, msgflg.toLong()))
}

public fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt {
    return LibcDynamicFfi.invoke("msgsnd", -1, longArrayOf(msqid.toLong(), msgp?.value ?: 0L, msgsz.toLong(), msgflg.toLong())).toInt()
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun errnoLocation(): CInt? {
    val rawRet = LibcDynamicFfi.invoke("__errno_location", -1, longArrayOf())
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
}

public fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt {
    return LibcDynamicFfi.invoke("fallocate", -1, longArrayOf(fd.toLong(), mode.toLong(), offset, len)).toInt()
}

public fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt {
    return LibcDynamicFfi.invoke("posix_fallocate", -1, longArrayOf(fd.toLong(), offset, len)).toInt()
}

public fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("readahead", -1, longArrayOf(fd.toLong(), offset, count.toLong()))
}

public fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("signalfd", -1, longArrayOf(fd.toLong(), mask?.value ?: 0L, flags.toLong())).toInt()
}

public fun timerfdCreate(clockid: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("timerfd_create", -1, longArrayOf(clockid.toLong(), flags.toLong())).toInt()
}

public fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timerfd_gettime", -1, longArrayOf(fd.toLong(), currValue?.value ?: 0L)).toInt()
}

public fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timerfd_settime", -1, longArrayOf(fd.toLong(), flags.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
}

public fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pwritev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("preadv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt {
    val __cstr_1 = if (special == null) 0L else LibcDynamicFfi.allocUtf8CString(special)
    try {
        return LibcDynamicFfi.invoke("quotactl", -1, longArrayOf(cmd.toLong(), __cstr_1, id.toLong(), data?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("dup3", -1, longArrayOf(oldfd.toLong(), newfd.toLong(), flags.toLong())).toInt()
}

public fun mkostemp(template: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemp", -1, longArrayOf(template?.value ?: 0L, flags.toLong())).toInt()
}

public fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong(), flags.toLong())).toInt()
}

public fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sigtimedwait", -1, longArrayOf(set?.value ?: 0L, info?.value ?: 0L, timeout?.value ?: 0L)).toInt()
}

public fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt {
    return LibcDynamicFfi.invoke("sigwaitinfo", -1, longArrayOf(set?.value ?: 0L, info?.value ?: 0L)).toInt()
}

public fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo_l", -1, longArrayOf(item.toLong(), locale?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(sa?.value ?: 0L, salen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, servlen.toLong(), flags.toLong())).toInt()
}

public fun reboot(howTo: CInt): CInt {
    return LibcDynamicFfi.invoke("reboot", -1, longArrayOf(howTo.toLong())).toInt()
}

public fun setfsgid(gid: GidT): CInt {
    return LibcDynamicFfi.invoke("setfsgid", -1, longArrayOf(gid.toLong())).toInt()
}

public fun setfsuid(uid: UidT): CInt {
    return LibcDynamicFfi.invoke("setfsuid", -1, longArrayOf(uid.toLong())).toInt()
}

// Not available now on Android
public fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mkfifoat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun ifNameindex(): IfNameindex? {
    val rawRet = LibcDynamicFfi.invoke("if_nameindex", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ifFreenameindex(ptr: IfNameindex?) {
    LibcDynamicFfi.invoke("if_freenameindex", -1, longArrayOf(ptr?.value ?: 0L))
}

public fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("sync_file_range", -1, longArrayOf(fd.toLong(), offset, nbytes, flags.toLong())).toInt()
}

public fun getifaddrs(ifap: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getifaddrs", -1, longArrayOf(ifap?.value ?: 0L)).toInt()
}

public fun freeifaddrs(ifa: Ifaddrs?) {
    LibcDynamicFfi.invoke("freeifaddrs", -1, longArrayOf(ifa?.value ?: 0L))
}

public fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: GlobT?): CInt {
    val __cstr_0 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    try {
        return LibcDynamicFfi.invoke("glob", -1, longArrayOf(__cstr_0, flags.toLong(), errfunc?.value ?: 0L, pglob?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun globfree(pglob: GlobT?) {
    LibcDynamicFfi.invoke("globfree", -1, longArrayOf(pglob?.value ?: 0L))
}

public fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun shmUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun seekdir(dirp: DIR?, loc: CLong) {
    LibcDynamicFfi.invoke("seekdir", -1, longArrayOf(dirp?.handle ?: 0L, loc))
}

public fun telldir(dirp: DIR?): CLong {
    return LibcDynamicFfi.invoke("telldir", -1, longArrayOf(dirp?.handle ?: 0L))
}

public fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("msync", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: UInt?): SsizeT {
    val __slot_5 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), addr?.value ?: 0L, __slot_5))
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt {
    return LibcDynamicFfi.invoke("mkstemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong())).toInt()
}

public fun futimes(fd: CInt, times: Timeval?): CInt {
    return LibcDynamicFfi.invoke("futimes", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun nlLanginfo(item: NlItem): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo", -1, longArrayOf(item.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("bind", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, addressLen.toLong())).toInt()
}

public fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("readv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("sendmsg", -1, longArrayOf(fd.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("recvmsg", -1, longArrayOf(fd.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun getdomainname(name: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("getdomainname", -1, longArrayOf(name?.value ?: 0L, len.toLong())).toInt()
}

public fun setdomainname(name: String?, len: SizeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("setdomainname", -1, longArrayOf(__cstr_0, len.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun vhangup(): CInt {
    return LibcDynamicFfi.invoke("vhangup", -1, longArrayOf()).toInt()
}

public fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("sendmmsg", -1, longArrayOf(sockfd.toLong(), msgvec?.value ?: 0L, vlen.toLong(), flags.toLong())).toInt()
}

public fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("recvmmsg", -1, longArrayOf(sockfd.toLong(), msgvec?.value ?: 0L, vlen.toLong(), flags.toLong(), timeout?.value ?: 0L)).toInt()
}

public fun sync() {
    LibcDynamicFfi.invoke("sync", -1, longArrayOf())
}

public fun syscall(num: CLong, vararg variadicArgs: Long): CLong {
    return LibcDynamicFfi.invoke("syscall", 1, longArrayOf(num) + variadicArgs)
}

public fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("sched_getaffinity", -1, longArrayOf(pid.toLong(), cpusetsize.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("sched_setaffinity", -1, longArrayOf(pid.toLong(), cpusetsize.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun umount(target: String?): CInt {
    val __cstr_0 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    try {
        return LibcDynamicFfi.invoke("umount", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun schedGetPriorityMax(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_max", -1, longArrayOf(policy.toLong())).toInt()
}

public fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("tee", -1, longArrayOf(fdIn.toLong(), fdOut.toLong(), len.toLong(), flags.toLong()))
}

public fun settimeofday(tv: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("settimeofday", -1, longArrayOf(tv?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT {
    val __slot_1 = if (offIn == null) 0L else LibcDynamicFfi.allocScalarSlot(offIn)
    val __slot_3 = if (offOut == null) 0L else LibcDynamicFfi.allocScalarSlot(offOut)
    try {
        return LibcDynamicFfi.invoke("splice", -1, longArrayOf(fdIn.toLong(), __slot_1, fdOut.toLong(), __slot_3, len.toLong(), flags.toLong()))
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun eventfd(initval: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("eventfd", -1, longArrayOf(initval.toLong(), flags.toLong())).toInt()
}

public fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sched_rr_get_interval", -1, longArrayOf(pid.toLong(), tp?.value ?: 0L)).toInt()
}

public fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sem_timedwait", -1, longArrayOf(sem?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun semGetvalue(sem: SemT?, sval: CInt?): CInt {
    val __slot_1 = if (sval == null) 0L else LibcDynamicFfi.allocScalarSlot(sval.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_getvalue", -1, longArrayOf(sem?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun schedSetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun swapoff(puath: String?): CInt {
    val __cstr_0 = if (puath == null) 0L else LibcDynamicFfi.allocUtf8CString(puath)
    try {
        return LibcDynamicFfi.invoke("swapoff", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("vmsplice", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, nrSegs.toLong(), flags.toLong()))
}

public fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt {
    val __cstr_0 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    val __cstr_1 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    val __cstr_2 = if (fstype == null) 0L else LibcDynamicFfi.allocUtf8CString(fstype)
    try {
        return LibcDynamicFfi.invoke("mount", -1, longArrayOf(__cstr_0, __cstr_1, __cstr_2, flags.toLong(), data?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun personality(persona: CUlong): CInt {
    return LibcDynamicFfi.invoke("personality", -1, longArrayOf(persona.toLong())).toInt()
}

public fun schedGetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_getparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("ppoll", -1, longArrayOf(fds?.value ?: 0L, nfds.toLong(), timeout?.value ?: 0L, sigmask?.value ?: 0L)).toInt()
}

public fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_timedlock", -1, longArrayOf(lock?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("clone", 4, longArrayOf(__scratch_0, childStack?.value ?: 0L, flags.toLong(), arg?.value ?: 0L) + variadicArgs).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun schedGetscheduler(pid: PidT): CInt {
    return LibcDynamicFfi.invoke("sched_getscheduler", -1, longArrayOf(pid.toLong())).toInt()
}

public fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_nanosleep", -1, longArrayOf(clkId.toLong(), flags.toLong(), rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}

public fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt {
    val __slot_1 = if (guardsize == null) 0L else LibcDynamicFfi.allocScalarSlot(guardsize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getguardsize", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setguardsize", -1, longArrayOf(attr?.value ?: 0L, guardsize.toLong())).toInt()
}

public fun sethostname(name: String?, len: SizeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sethostname", -1, longArrayOf(__cstr_0, len.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun schedGetPriorityMin(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_min", -1, longArrayOf(policy.toLong())).toInt()
}

public fun umount2(target: String?, flags: CInt): CInt {
    val __cstr_0 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    try {
        return LibcDynamicFfi.invoke("umount2", -1, longArrayOf(__cstr_0, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun swapon(path: String?, swapflags: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("swapon", -1, longArrayOf(__cstr_0, swapflags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setscheduler", -1, longArrayOf(pid.toLong(), policy.toLong(), param?.value ?: 0L)).toInt()
}

public fun sigsuspend(mask: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigsuspend", -1, longArrayOf(mask?.value ?: 0L)).toInt()
}

public fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrgid_r", -1, longArrayOf(gid.toLong(), grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun sigaltstack(ss: StackT?, oss: StackT?): CInt {
    return LibcDynamicFfi.invoke("sigaltstack", -1, longArrayOf(ss?.value ?: 0L, oss?.value ?: 0L)).toInt()
}

public fun semClose(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_close", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun getdtablesize(): CInt {
    return LibcDynamicFfi.invoke("getdtablesize", -1, longArrayOf()).toInt()
}

public fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getgrnam_r", -1, longArrayOf(__cstr_0, grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun initgroups(user: String?, group: GidT): CInt {
    val __cstr_0 = if (user == null) 0L else LibcDynamicFfi.allocUtf8CString(user)
    try {
        return LibcDynamicFfi.invoke("initgroups", -1, longArrayOf(__cstr_0, group.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("pthread_sigmask", -1, longArrayOf(how.toLong(), set?.value ?: 0L, oldset?.value ?: 0L)).toInt()
}

public fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): SemT? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("sem_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs)
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getgrnam(name: String?): Group? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getgrnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pthreadCancel(thread: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_cancel", -1, longArrayOf(thread.toLong())).toInt()
}

public fun pthreadKill(thread: PthreadT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_kill", -1, longArrayOf(thread.toLong(), sig.toLong())).toInt()
}

public fun semUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sem_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun daemon(nochdir: CInt, noclose: CInt): CInt {
    return LibcDynamicFfi.invoke("daemon", -1, longArrayOf(nochdir.toLong(), noclose.toLong())).toInt()
}

public fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getpwnam_r", -1, longArrayOf(__cstr_0, pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getpwuid_r", -1, longArrayOf(uid.toLong(), pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun sigwait(set: SigsetT?, sig: CInt?): CInt {
    val __slot_1 = if (sig == null) 0L else LibcDynamicFfi.allocScalarSlot(sig.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwait", -1, longArrayOf(set?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt {
    return LibcDynamicFfi.invoke("pthread_atfork", -1, longArrayOf(prepare?.value ?: 0L, parent?.value ?: 0L, child?.value ?: 0L)).toInt()
}

public fun getgrgid(gid: GidT): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrgid", -1, longArrayOf(gid.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setgrent() {
    LibcDynamicFfi.invoke("setgrent", -1, longArrayOf())
}

public fun endgrent() {
    LibcDynamicFfi.invoke("endgrent", -1, longArrayOf())
}

public fun getgrent(): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getgrouplist(user: String?, group: GidT, groups: UInt?, ngroups: CInt?): CInt {
    val __cstr_0 = if (user == null) 0L else LibcDynamicFfi.allocUtf8CString(user)
    val __slot_2 = if (groups == null) 0L else LibcDynamicFfi.allocScalarSlot(groups.toLong())
    val __slot_3 = if (ngroups == null) 0L else LibcDynamicFfi.allocScalarSlot(ngroups.toLong())
    try {
        return LibcDynamicFfi.invoke("getgrouplist", -1, longArrayOf(__cstr_0, group.toLong(), __slot_2, __slot_3)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun popen(command: String?, mode: String?): FILE? {
    val __cstr_0 = if (command == null) 0L else LibcDynamicFfi.allocUtf8CString(command)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("popen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("faccessat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun pthreadCreate(native: CUlong?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt {
    val __slot_0 = if (native == null) 0L else LibcDynamicFfi.allocScalarSlot(native.toLong())
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(__slot_0, attr?.value ?: 0L, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dl_iterate_phdr", -1, longArrayOf(callback?.value ?: 0L, data?.value ?: 0L)).toInt()
}
