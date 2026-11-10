@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong

// PUB_CONST
public val INT_MIN: CInt = -2147483648.toInt()

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

public val MAP_FAILED: COpaquePointer? = ((0.inv() as Any?) as COpaquePointer?)

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

public val SO_TIMESTAMP: CInt = 29

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

public val EPOLLET: CInt = 0x80000000.toInt()

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

public val CLONE_IO: CInt = 0x80000000.toInt()

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

public val WCLONE: CInt = 0x80000000.toInt()

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

public val RLIM_INFINITY: RlimT = 0uL.inv()

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

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1L))

public val RTLD_DEFAULT: COpaquePointer? = null

public val RTLD_NODELETE: CInt = 0x1000

public val RTLD_NOW: CInt = 0x2

public val TCP_MD5SIG: CInt = 14

public val SIZEOF_PTHREAD_MUTEX_T: Int = 40

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(size = UByteArray(SIZEOF_PTHREAD_MUTEX_T) { 0u.toUByte() })

public val SIZEOF_PTHREAD_COND_T: Int = 48

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(size = UByteArray(SIZEOF_PTHREAD_COND_T) { 0u.toUByte() })

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 56

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(size = UByteArray(SIZEOF_PTHREAD_RWLOCK_T) { 0u.toUByte() })

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_PROCESS_PRIVATE: CInt = 0

public val PTHREAD_PROCESS_SHARED: CInt = 1

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

public val O_CLOEXEC: CInt = 0x00000100

public val TFD_CLOEXEC: CInt = O_CLOEXEC

public val O_NONBLOCK: CInt = 0x00000010

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

public val ENODATA: CInt = 61

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

public val O_TMPFILE: CInt = 0x00004000

public val EBFONT: CInt = 59

public val ENOSTR: CInt = 60

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

public val SA_RESETHAND: CInt = 0x80000000.toInt()

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

public val RLIMIT_RTTIME: CInt = 15

public val RLIMIT_NLIMITS: CInt = 16

public val RLIM_NLIMITS: CInt = RLIMIT_NLIMITS

public val MAP_ANON: CInt = 0x0020

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

public val SIGSYS: CInt = 31

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

public val FIONREAD: CInt = 0x541B

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

public val O_DSYNC: CInt = 0x00000020

public val O_SYNC: CInt = 0x00000040 or O_DSYNC

public val O_RSYNC: CInt = O_SYNC

public val SOCK_CLOEXEC: CInt = 524288

public val SOCK_NONBLOCK: CInt = 2048

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
