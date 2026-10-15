package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public const val INT_MIN: Int = -2147483648

public const val INT_MAX: Int = 2147483647

public val SIG_DFL: ULong = 0.toULong()

public val SIG_IGN: ULong = 1.toULong()

public val SIG_ERR: ULong = 0.toULong().inv()

public val DT_UNKNOWN: UByte = (0).toUByte()

public val DT_FIFO: UByte = (1).toUByte()

public val DT_CHR: UByte = (2).toUByte()

public val DT_DIR: UByte = (4).toUByte()

public val DT_BLK: UByte = (6).toUByte()

public val DT_REG: UByte = (8).toUByte()

public val DT_LNK: UByte = (10).toUByte()

public val DT_SOCK: UByte = (12).toUByte()

public const val FD_CLOEXEC: Int = 0x1

public const val USRQUOTA: Int = 0

public const val GRPQUOTA: Int = 1

public const val SIGIOT: Int = 6

public const val S_ISUID: UInt = 2048u

public const val S_ISGID: UInt = 1024u

public const val S_ISVTX: UInt = 512u

public const val IF_NAMESIZE: ULong = 16uL

public const val IFNAMSIZ: ULong = IF_NAMESIZE

public const val LOG_EMERG: Int = 0

public const val LOG_ALERT: Int = 1

public const val LOG_CRIT: Int = 2

public const val LOG_ERR: Int = 3

public const val LOG_WARNING: Int = 4

public const val LOG_NOTICE: Int = 5

public const val LOG_INFO: Int = 6

public const val LOG_DEBUG: Int = 7

public const val LOG_KERN: Int = 0

public val LOG_USER: Int = 1 shl 3

public val LOG_MAIL: Int = 2 shl 3

public val LOG_DAEMON: Int = 3 shl 3

public val LOG_AUTH: Int = 4 shl 3

public val LOG_SYSLOG: Int = 5 shl 3

public val LOG_LPR: Int = 6 shl 3

public val LOG_NEWS: Int = 7 shl 3

public val LOG_UUCP: Int = 8 shl 3

public val LOG_LOCAL0: Int = 16 shl 3

public val LOG_LOCAL1: Int = 17 shl 3

public val LOG_LOCAL2: Int = 18 shl 3

public val LOG_LOCAL3: Int = 19 shl 3

public val LOG_LOCAL4: Int = 20 shl 3

public val LOG_LOCAL5: Int = 21 shl 3

public val LOG_LOCAL6: Int = 22 shl 3

public val LOG_LOCAL7: Int = 23 shl 3

public const val LOG_PID: Int = 0x01

public const val LOG_CONS: Int = 0x02

public const val LOG_ODELAY: Int = 0x04

public const val LOG_NDELAY: Int = 0x08

public const val LOG_NOWAIT: Int = 0x10

public const val LOG_PRIMASK: Int = 7

public const val LOG_FACMASK: Int = 0x3f8

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val PRIO_MIN: Int = -20

public const val PRIO_MAX: Int = 20

public const val IPPROTO_ICMP: Int = 1

public const val IPPROTO_ICMPV6: Int = 58

public const val IPPROTO_TCP: Int = 6

public const val IPPROTO_UDP: Int = 17

public const val IPPROTO_IP: Int = 0

public const val IPPROTO_IPV6: Int = 41

public const val INADDR_LOOPBACK: UInt = 2130706433u

public const val INADDR_ANY: UInt = 0u

public const val INADDR_BROADCAST: UInt = 4294967295u

public const val INADDR_NONE: UInt = 4294967295u

public const val EXIT_FAILURE: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val RAND_MAX: Int = 2147483647

public const val EOF: Int = -1

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val _IOFBF: Int = 0

public const val _IONBF: Int = 2

public const val _IOLBF: Int = 1

public const val F_DUPFD: Int = 0

public const val F_GETFD: Int = 1

public const val F_SETFD: Int = 2

public const val F_GETFL: Int = 3

public const val F_SETFL: Int = 4

public const val F_SETLEASE: Int = 1024

public const val F_GETLEASE: Int = 1025

public const val F_NOTIFY: Int = 1026

public const val F_CANCELLK: Int = 1029

public const val F_DUPFD_CLOEXEC: Int = 1030

public const val F_SETPIPE_SZ: Int = 1031

public const val F_GETPIPE_SZ: Int = 1032

public const val F_ADD_SEALS: Int = 1033

public const val F_GET_SEALS: Int = 1034

public const val F_SEAL_SEAL: Int = 0x0001

public const val F_SEAL_SHRINK: Int = 0x0002

public const val F_SEAL_GROW: Int = 0x0004

public const val F_SEAL_WRITE: Int = 0x0008

public const val SIGTRAP: Int = 5

public const val PTHREAD_CREATE_JOINABLE: Int = 0

public const val PTHREAD_CREATE_DETACHED: Int = 1

public const val CLOCK_REALTIME: Int = 0

public const val CLOCK_MONOTONIC: Int = 1

public const val CLOCK_PROCESS_CPUTIME_ID: Int = 2

public const val CLOCK_THREAD_CPUTIME_ID: Int = 3

public const val CLOCK_MONOTONIC_RAW: Int = 4

public const val CLOCK_REALTIME_COARSE: Int = 5

public const val CLOCK_MONOTONIC_COARSE: Int = 6

public const val CLOCK_BOOTTIME: Int = 7

public const val CLOCK_REALTIME_ALARM: Int = 8

public const val CLOCK_BOOTTIME_ALARM: Int = 9

public const val CLOCK_SGI_CYCLE: Int = 10

public const val CLOCK_TAI: Int = 11

public const val TIMER_ABSTIME: Int = 1

public const val RLIMIT_CPU: Int = 0

public const val RLIMIT_FSIZE: Int = 1

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_STACK: Int = 3

public const val RLIMIT_CORE: Int = 4

public const val RLIMIT_LOCKS: Int = 10

public const val RLIMIT_SIGPENDING: Int = 11

public const val RLIMIT_MSGQUEUE: Int = 12

public const val RLIMIT_NICE: Int = 13

public const val RLIMIT_RTPRIO: Int = 14

public const val RUSAGE_SELF: Int = 0

public const val O_RDONLY: Int = 0

public const val O_WRONLY: Int = 1

public const val O_RDWR: Int = 2

public const val S_IFIFO: UInt = 4096u

public const val S_IFCHR: UInt = 8192u

public const val S_IFBLK: UInt = 24576u

public const val S_IFDIR: UInt = 16384u

public const val S_IFREG: UInt = 32768u

public const val S_IFLNK: UInt = 40960u

public const val S_IFSOCK: UInt = 49152u

public const val S_IFMT: UInt = 61440u

public const val S_IRWXU: UInt = 448u

public const val S_IXUSR: UInt = 64u

public const val S_IWUSR: UInt = 128u

public const val S_IRUSR: UInt = 256u

public const val S_IRWXG: UInt = 56u

public const val S_IXGRP: UInt = 8u

public const val S_IWGRP: UInt = 16u

public const val S_IRGRP: UInt = 32u

public const val S_IRWXO: UInt = 7u

public const val S_IXOTH: UInt = 1u

public const val S_IWOTH: UInt = 2u

public const val S_IROTH: UInt = 4u

public const val F_OK: Int = 0

public const val R_OK: Int = 4

public const val W_OK: Int = 2

public const val X_OK: Int = 1

public const val SIGHUP: Int = 1

public const val SIGINT: Int = 2

public const val SIGQUIT: Int = 3

public const val SIGILL: Int = 4

public const val SIGABRT: Int = 6

public const val SIGFPE: Int = 8

public const val SIGKILL: Int = 9

public const val SIGSEGV: Int = 11

public const val SIGPIPE: Int = 13

public const val SIGALRM: Int = 14

public const val SIGTERM: Int = 15

public const val PROT_NONE: Int = 0

public const val PROT_READ: Int = 1

public const val PROT_WRITE: Int = 2

public const val PROT_EXEC: Int = 4

public const val LC_CTYPE: Int = 0

public const val LC_NUMERIC: Int = 1

public const val LC_TIME: Int = 2

public const val LC_COLLATE: Int = 3

public const val LC_MONETARY: Int = 4

public const val LC_MESSAGES: Int = 5

public const val LC_ALL: Int = 6

public val LC_CTYPE_MASK: Int = 1 shl LC_CTYPE

public val LC_NUMERIC_MASK: Int = 1 shl LC_NUMERIC

public val LC_TIME_MASK: Int = 1 shl LC_TIME

public val LC_COLLATE_MASK: Int = 1 shl LC_COLLATE

public val LC_MONETARY_MASK: Int = 1 shl LC_MONETARY

public val LC_MESSAGES_MASK: Int = 1 shl LC_MESSAGES

public const val MAP_FILE: Int = 0x0000

public const val MAP_SHARED: Int = 0x0001

public const val MAP_PRIVATE: Int = 0x0002

public const val MAP_FIXED: Int = 0x0010

public const val MS_ASYNC: Int = 0x0001

public const val MS_INVALIDATE: Int = 0x0002

public const val MS_SYNC: Int = 0x0004

public const val MS_RDONLY: ULong = 0x01uL

public const val MS_NOSUID: ULong = 0x02uL

public const val MS_NODEV: ULong = 0x04uL

public const val MS_NOEXEC: ULong = 0x08uL

public const val MS_SYNCHRONOUS: ULong = 0x10uL

public const val MS_REMOUNT: ULong = 0x20uL

public const val MS_MANDLOCK: ULong = 0x40uL

public const val MS_DIRSYNC: ULong = 0x80uL

public const val MS_NOATIME: ULong = 0x0400uL

public const val MS_NODIRATIME: ULong = 0x0800uL

public const val MS_BIND: ULong = 0x1000uL

public const val MS_MOVE: ULong = 0x2000uL

public const val MS_REC: ULong = 0x4000uL

public const val MS_SILENT: ULong = 0x8000uL

public const val MS_POSIXACL: ULong = 0x010000uL

public const val MS_UNBINDABLE: ULong = 0x020000uL

public const val MS_PRIVATE: ULong = 0x040000uL

public const val MS_SLAVE: ULong = 0x080000uL

public const val MS_SHARED: ULong = 0x100000uL

public const val MS_RELATIME: ULong = 0x200000uL

public const val MS_KERNMOUNT: ULong = 0x400000uL

public const val MS_I_VERSION: ULong = 0x800000uL

public const val MS_STRICTATIME: ULong = 0x1000000uL

public const val MS_ACTIVE: ULong = 0x40000000uL

public const val MS_NOUSER: ULong = 0x80000000uL

public const val MS_MGC_VAL: ULong = 0xc0ed0000uL

public const val MS_MGC_MSK: ULong = 0xffff0000uL

public const val MS_RMT_MASK: ULong = 0x800051uL

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

public const val EWOULDBLOCK: Int = EAGAIN

public const val SCM_RIGHTS: Int = 0x01

public const val SCM_CREDENTIALS: Int = 0x02

public const val PROT_GROWSDOWN: Int = 0x1000000

public const val PROT_GROWSUP: Int = 0x2000000

public const val MAP_TYPE: Int = 0x000f

public const val MADV_NORMAL: Int = 0

public const val MADV_RANDOM: Int = 1

public const val MADV_SEQUENTIAL: Int = 2

public const val MADV_WILLNEED: Int = 3

public const val MADV_DONTNEED: Int = 4

public const val MADV_FREE: Int = 8

public const val MADV_REMOVE: Int = 9

public const val MADV_DONTFORK: Int = 10

public const val MADV_DOFORK: Int = 11

public const val MADV_MERGEABLE: Int = 12

public const val MADV_UNMERGEABLE: Int = 13

public const val MADV_HUGEPAGE: Int = 14

public const val MADV_NOHUGEPAGE: Int = 15

public const val MADV_DONTDUMP: Int = 16

public const val MADV_DODUMP: Int = 17

public const val MADV_HWPOISON: Int = 100

public const val MADV_SOFT_OFFLINE: Int = 101

public const val IFF_UP: Int = 0x1

public const val IFF_BROADCAST: Int = 0x2

public const val IFF_DEBUG: Int = 0x4

public const val IFF_LOOPBACK: Int = 0x8

public const val IFF_POINTOPOINT: Int = 0x10

public const val IFF_NOTRAILERS: Int = 0x20

public const val IFF_RUNNING: Int = 0x40

public const val IFF_NOARP: Int = 0x80

public const val IFF_PROMISC: Int = 0x100

public const val IFF_ALLMULTI: Int = 0x200

public const val IFF_MASTER: Int = 0x400

public const val IFF_SLAVE: Int = 0x800

public const val IFF_MULTICAST: Int = 0x1000

public const val IFF_PORTSEL: Int = 0x2000

public const val IFF_AUTOMEDIA: Int = 0x4000

public const val IFF_DYNAMIC: Int = 0x8000

public const val IFF_TUN: Int = 0x0001

public const val IFF_TAP: Int = 0x0002

public const val IFF_NO_PI: Int = 0x1000

public const val SOL_IP: Int = 0

public const val SOL_TCP: Int = 6

public const val SOL_UDP: Int = 17

public const val SOL_IPV6: Int = 41

public const val SOL_ICMPV6: Int = 58

public const val SOL_RAW: Int = 255

public const val SOL_DECNET: Int = 261

public const val SOL_X25: Int = 262

public const val SOL_PACKET: Int = 263

public const val SOL_ATM: Int = 264

public const val SOL_AAL: Int = 265

public const val SOL_IRDA: Int = 266

public const val SOL_NETBEUI: Int = 267

public const val SOL_LLC: Int = 268

public const val SOL_DCCP: Int = 269

public const val SOL_NETLINK: Int = 270

public const val SOL_TIPC: Int = 271

public const val AF_UNSPEC: Int = 0

public const val AF_UNIX: Int = 1

public const val AF_LOCAL: Int = 1

public const val AF_INET: Int = 2

public const val AF_AX25: Int = 3

public const val AF_IPX: Int = 4

public const val AF_APPLETALK: Int = 5

public const val AF_NETROM: Int = 6

public const val AF_BRIDGE: Int = 7

public const val AF_ATMPVC: Int = 8

public const val AF_X25: Int = 9

public const val AF_INET6: Int = 10

public const val AF_ROSE: Int = 11

public const val AF_DECnet: Int = 12

public const val AF_NETBEUI: Int = 13

public const val AF_SECURITY: Int = 14

public const val AF_KEY: Int = 15

public const val AF_NETLINK: Int = 16

public const val AF_ROUTE: Int = AF_NETLINK

public const val AF_PACKET: Int = 17

public const val AF_ASH: Int = 18

public const val AF_ECONET: Int = 19

public const val AF_ATMSVC: Int = 20

public const val AF_RDS: Int = 21

public const val AF_SNA: Int = 22

public const val AF_IRDA: Int = 23

public const val AF_PPPOX: Int = 24

public const val AF_WANPIPE: Int = 25

public const val AF_LLC: Int = 26

public const val AF_CAN: Int = 29

public const val AF_TIPC: Int = 30

public const val AF_BLUETOOTH: Int = 31

public const val AF_IUCV: Int = 32

public const val AF_RXRPC: Int = 33

public const val AF_ISDN: Int = 34

public const val AF_PHONET: Int = 35

public const val AF_IEEE802154: Int = 36

public const val AF_CAIF: Int = 37

public const val AF_ALG: Int = 38

public const val PF_UNSPEC: Int = AF_UNSPEC

public const val PF_UNIX: Int = AF_UNIX

public const val PF_LOCAL: Int = AF_LOCAL

public const val PF_INET: Int = AF_INET

public const val PF_AX25: Int = AF_AX25

public const val PF_IPX: Int = AF_IPX

public const val PF_APPLETALK: Int = AF_APPLETALK

public const val PF_NETROM: Int = AF_NETROM

public const val PF_BRIDGE: Int = AF_BRIDGE

public const val PF_ATMPVC: Int = AF_ATMPVC

public const val PF_X25: Int = AF_X25

public const val PF_INET6: Int = AF_INET6

public const val PF_ROSE: Int = AF_ROSE

public const val PF_DECnet: Int = AF_DECnet

public const val PF_NETBEUI: Int = AF_NETBEUI

public const val PF_SECURITY: Int = AF_SECURITY

public const val PF_KEY: Int = AF_KEY

public const val PF_NETLINK: Int = AF_NETLINK

public const val PF_ROUTE: Int = AF_ROUTE

public const val PF_PACKET: Int = AF_PACKET

public const val PF_ASH: Int = AF_ASH

public const val PF_ECONET: Int = AF_ECONET

public const val PF_ATMSVC: Int = AF_ATMSVC

public const val PF_RDS: Int = AF_RDS

public const val PF_SNA: Int = AF_SNA

public const val PF_IRDA: Int = AF_IRDA

public const val PF_PPPOX: Int = AF_PPPOX

public const val PF_WANPIPE: Int = AF_WANPIPE

public const val PF_LLC: Int = AF_LLC

public const val PF_CAN: Int = AF_CAN

public const val PF_TIPC: Int = AF_TIPC

public const val PF_BLUETOOTH: Int = AF_BLUETOOTH

public const val PF_IUCV: Int = AF_IUCV

public const val PF_RXRPC: Int = AF_RXRPC

public const val PF_ISDN: Int = AF_ISDN

public const val PF_PHONET: Int = AF_PHONET

public const val PF_IEEE802154: Int = AF_IEEE802154

public const val PF_CAIF: Int = AF_CAIF

public const val PF_ALG: Int = AF_ALG

public const val SOMAXCONN: Int = 128

public const val MSG_OOB: Int = 1

public const val MSG_PEEK: Int = 2

public const val MSG_DONTROUTE: Int = 4

public const val MSG_CTRUNC: Int = 8

public const val MSG_TRUNC: Int = 0x20

public const val MSG_DONTWAIT: Int = 0x40

public const val MSG_EOR: Int = 0x80

public const val MSG_WAITALL: Int = 0x100

public const val MSG_FIN: Int = 0x200

public const val MSG_SYN: Int = 0x400

public const val MSG_CONFIRM: Int = 0x800

public const val MSG_RST: Int = 0x1000

public const val MSG_ERRQUEUE: Int = 0x2000

public const val MSG_NOSIGNAL: Int = 0x4000

public const val MSG_MORE: Int = 0x8000

public const val MSG_WAITFORONE: Int = 0x10000

public const val MSG_FASTOPEN: Int = 0x20000000

public const val MSG_CMSG_CLOEXEC: Int = 0x40000000

public val SCM_TIMESTAMP: Int = SO_TIMESTAMP

public const val SOCK_RAW: Int = 3

public const val SOCK_RDM: Int = 4

public const val IP_TOS: Int = 1

public const val IP_TTL: Int = 2

public const val IP_HDRINCL: Int = 3

public const val IP_RECVTOS: Int = 13

public const val IP_FREEBIND: Int = 15

public const val IP_TRANSPARENT: Int = 19

public const val IP_MULTICAST_IF: Int = 32

public const val IP_MULTICAST_TTL: Int = 33

public const val IP_MULTICAST_LOOP: Int = 34

public const val IP_ADD_MEMBERSHIP: Int = 35

public const val IP_DROP_MEMBERSHIP: Int = 36

public const val IPV6_UNICAST_HOPS: Int = 16

public const val IPV6_MULTICAST_IF: Int = 17

public const val IPV6_MULTICAST_HOPS: Int = 18

public const val IPV6_MULTICAST_LOOP: Int = 19

public const val IPV6_ADD_MEMBERSHIP: Int = 20

public const val IPV6_DROP_MEMBERSHIP: Int = 21

public const val IPV6_V6ONLY: Int = 26

public const val IPV6_RECVPKTINFO: Int = 49

public const val IPV6_RECVTCLASS: Int = 66

public const val IPV6_TCLASS: Int = 67

public const val TCP_NODELAY: Int = 1

public const val TCP_MAXSEG: Int = 2

public const val TCP_CORK: Int = 3

public const val TCP_KEEPIDLE: Int = 4

public const val TCP_KEEPINTVL: Int = 5

public const val TCP_KEEPCNT: Int = 6

public const val TCP_SYNCNT: Int = 7

public const val TCP_LINGER2: Int = 8

public const val TCP_DEFER_ACCEPT: Int = 9

public const val TCP_WINDOW_CLAMP: Int = 10

public const val TCP_INFO: Int = 11

public const val TCP_QUICKACK: Int = 12

public const val TCP_CONGESTION: Int = 13

public const val SO_DEBUG: Int = 1

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val LOCK_SH: Int = 1

public const val LOCK_EX: Int = 2

public const val LOCK_NB: Int = 4

public const val LOCK_UN: Int = 8

public const val SS_ONSTACK: Int = 1

public const val SS_DISABLE: Int = 2

public const val PATH_MAX: Int = 4096

public const val FD_SETSIZE: ULong = 1024uL

public const val EPOLLIN: Int = 0x1

public const val EPOLLPRI: Int = 0x2

public const val EPOLLOUT: Int = 0x4

public const val EPOLLRDNORM: Int = 0x40

public const val EPOLLRDBAND: Int = 0x80

public const val EPOLLWRNORM: Int = 0x100

public const val EPOLLWRBAND: Int = 0x200

public const val EPOLLMSG: Int = 0x400

public const val EPOLLERR: Int = 0x8

public const val EPOLLHUP: Int = 0x10

public const val EPOLLET: Int = 0x80000000.toInt()

public const val EPOLL_CTL_ADD: Int = 1

public const val EPOLL_CTL_MOD: Int = 3

public const val EPOLL_CTL_DEL: Int = 2

public const val MNT_DETACH: Int = 0x2

public const val MNT_EXPIRE: Int = 0x4

public const val Q_GETFMT: Int = 0x800004

public const val Q_GETINFO: Int = 0x800005

public const val Q_SETINFO: Int = 0x800006

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

public const val MNT_FORCE: Int = 0x1

public const val Q_SYNC: Int = 0x800001

public const val Q_QUOTAON: Int = 0x800002

public const val Q_QUOTAOFF: Int = 0x800003

public const val Q_GETQUOTA: Int = 0x800007

public const val Q_SETQUOTA: Int = 0x800008

public const val TCIOFF: Int = 2

public const val TCION: Int = 3

public const val TCOOFF: Int = 0

public const val TCOON: Int = 1

public const val TCIFLUSH: Int = 0

public const val TCOFLUSH: Int = 1

public const val TCIOFLUSH: Int = 2

public const val NL0: Int = 0x00000000

public const val NL1: Int = 0x00000100

public const val TAB0: Int = 0x00000000

public const val CR0: Int = 0x00000000

public const val FF0: Int = 0x00000000

public const val BS0: Int = 0x00000000

public const val VT0: Int = 0x00000000

public const val VERASE: ULong = 2uL

public const val VKILL: ULong = 3uL

public const val VINTR: ULong = 0uL

public const val VQUIT: ULong = 1uL

public const val VLNEXT: ULong = 15uL

public const val IGNBRK: UInt = 0x00000001u

public const val BRKINT: UInt = 0x00000002u

public const val IGNPAR: UInt = 0x00000004u

public const val PARMRK: UInt = 0x00000008u

public const val INPCK: UInt = 0x00000010u

public const val ISTRIP: UInt = 0x00000020u

public const val INLCR: UInt = 0x00000040u

public const val IGNCR: UInt = 0x00000080u

public const val ICRNL: UInt = 0x00000100u

public const val IXANY: UInt = 0x00000800u

public const val IMAXBEL: UInt = 0x00002000u

public const val OPOST: UInt = 0x1u

public const val CS5: UInt = 0x00000000u

public const val CRTSCTS: UInt = 0x80000000u

public const val ECHO: UInt = 0x00000008u

public const val OCRNL: UInt = 8u

public const val ONOCR: UInt = 16u

public const val ONLRET: UInt = 32u

public const val OFILL: UInt = 64u

public const val OFDEL: UInt = 128u

public const val CLONE_VM: Int = 0x100

public const val CLONE_FS: Int = 0x200

public const val CLONE_FILES: Int = 0x400

public const val CLONE_SIGHAND: Int = 0x800

public const val CLONE_PTRACE: Int = 0x2000

public const val CLONE_VFORK: Int = 0x4000

public const val CLONE_PARENT: Int = 0x8000

public const val CLONE_THREAD: Int = 0x10000

public const val CLONE_NEWNS: Int = 0x20000

public const val CLONE_SYSVSEM: Int = 0x40000

public const val CLONE_SETTLS: Int = 0x80000

public const val CLONE_PARENT_SETTID: Int = 0x100000

public const val CLONE_CHILD_CLEARTID: Int = 0x200000

public const val CLONE_DETACHED: Int = 0x400000

public const val CLONE_UNTRACED: Int = 0x800000

public const val CLONE_CHILD_SETTID: Int = 0x01000000

public const val CLONE_NEWUTS: Int = 0x04000000

public const val CLONE_NEWIPC: Int = 0x08000000

public const val CLONE_NEWUSER: Int = 0x10000000

public const val CLONE_NEWPID: Int = 0x20000000

public const val CLONE_NEWNET: Int = 0x40000000

public const val CLONE_IO: Int = 0x80000000.toInt()

public const val CLONE_NEWCGROUP: Int = 0x02000000

public const val WNOHANG: Int = 0x00000001

public const val WUNTRACED: Int = 0x00000002

public const val WSTOPPED: Int = WUNTRACED

public const val WEXITED: Int = 0x00000004

public const val WCONTINUED: Int = 0x00000008

public const val WNOWAIT: Int = 0x01000000

public const val PTRACE_O_TRACESYSGOOD: Int = 0x00000001

public const val PTRACE_O_TRACEFORK: Int = 0x00000002

public const val PTRACE_O_TRACEVFORK: Int = 0x00000004

public const val PTRACE_O_TRACECLONE: Int = 0x00000008

public const val PTRACE_O_TRACEEXEC: Int = 0x00000010

public const val PTRACE_O_TRACEVFORKDONE: Int = 0x00000020

public const val PTRACE_O_TRACEEXIT: Int = 0x00000040

public const val PTRACE_O_TRACESECCOMP: Int = 0x00000080

public const val PTRACE_O_EXITKILL: Int = 0x00100000

public const val PTRACE_O_SUSPEND_SECCOMP: Int = 0x00200000

public const val PTRACE_O_MASK: Int = 0x003000ff

public const val PTRACE_EVENT_FORK: Int = 1

public const val PTRACE_EVENT_VFORK: Int = 2

public const val PTRACE_EVENT_CLONE: Int = 3

public const val PTRACE_EVENT_EXEC: Int = 4

public const val PTRACE_EVENT_VFORK_DONE: Int = 5

public const val PTRACE_EVENT_EXIT: Int = 6

public const val PTRACE_EVENT_SECCOMP: Int = 7

public const val PTRACE_EVENT_STOP: Int = 128

public const val __WNOTHREAD: Int = 0x20000000

public const val __WALL: Int = 0x40000000

public const val __WCLONE: Int = 0x80000000.toInt()

public const val SPLICE_F_MOVE: UInt = 0x01u

public const val SPLICE_F_NONBLOCK: UInt = 0x02u

public const val SPLICE_F_MORE: UInt = 0x04u

public const val SPLICE_F_GIFT: UInt = 0x08u

public const val RTLD_LOCAL: Int = 0

public const val RTLD_LAZY: Int = 1

public const val POSIX_FADV_NORMAL: Int = 0

public const val POSIX_FADV_RANDOM: Int = 1

public const val POSIX_FADV_SEQUENTIAL: Int = 2

public const val POSIX_FADV_WILLNEED: Int = 3

public const val AT_FDCWD: Int = -100

public const val AT_SYMLINK_NOFOLLOW: Int = 0x100

public const val AT_REMOVEDIR: Int = 0x200

public const val AT_EACCESS: Int = 0x200

public const val AT_SYMLINK_FOLLOW: Int = 0x400

public const val AT_NO_AUTOMOUNT: Int = 0x800

public const val AT_EMPTY_PATH: Int = 0x1000

public val LOG_CRON: Int = 9 shl 3

public val LOG_AUTHPRIV: Int = 10 shl 3

public val LOG_FTP: Int = 11 shl 3

public const val LOG_PERROR: Int = 0x20

public const val PIPE_BUF: ULong = 4096uL

public const val SI_LOAD_SHIFT: UInt = 16u

public const val CLD_EXITED: Int = 1

public const val CLD_KILLED: Int = 2

public const val CLD_DUMPED: Int = 3

public const val CLD_TRAPPED: Int = 4

public const val CLD_STOPPED: Int = 5

public const val CLD_CONTINUED: Int = 6

public const val SIGEV_SIGNAL: Int = 0

public const val SIGEV_NONE: Int = 1

public const val SIGEV_THREAD: Int = 2

public const val P_ALL: UInt = 0u

public const val P_PID: UInt = 1u

public const val P_PGID: UInt = 2u

public const val UTIME_OMIT: Long = 1073741822

public const val UTIME_NOW: Long = 1073741823

public const val POLLIN: Short = 0x1

public const val POLLPRI: Short = 0x2

public const val POLLOUT: Short = 0x4

public const val POLLERR: Short = 0x8

public const val POLLHUP: Short = 0x10

public const val POLLNVAL: Short = 0x20

public const val POLLRDNORM: Short = 0x040

public const val POLLRDBAND: Short = 0x080

public const val ABDAY_1: Int = 0x20000

public const val ABDAY_2: Int = 0x20001

public const val ABDAY_3: Int = 0x20002

public const val ABDAY_4: Int = 0x20003

public const val ABDAY_5: Int = 0x20004

public const val ABDAY_6: Int = 0x20005

public const val ABDAY_7: Int = 0x20006

public const val DAY_1: Int = 0x20007

public const val DAY_2: Int = 0x20008

public const val DAY_3: Int = 0x20009

public const val DAY_4: Int = 0x2000A

public const val DAY_5: Int = 0x2000B

public const val DAY_6: Int = 0x2000C

public const val DAY_7: Int = 0x2000D

public const val ABMON_1: Int = 0x2000E

public const val ABMON_2: Int = 0x2000F

public const val ABMON_3: Int = 0x20010

public const val ABMON_4: Int = 0x20011

public const val ABMON_5: Int = 0x20012

public const val ABMON_6: Int = 0x20013

public const val ABMON_7: Int = 0x20014

public const val ABMON_8: Int = 0x20015

public const val ABMON_9: Int = 0x20016

public const val ABMON_10: Int = 0x20017

public const val ABMON_11: Int = 0x20018

public const val ABMON_12: Int = 0x20019

public const val MON_1: Int = 0x2001A

public const val MON_2: Int = 0x2001B

public const val MON_3: Int = 0x2001C

public const val MON_4: Int = 0x2001D

public const val MON_5: Int = 0x2001E

public const val MON_6: Int = 0x2001F

public const val MON_7: Int = 0x20020

public const val MON_8: Int = 0x20021

public const val MON_9: Int = 0x20022

public const val MON_10: Int = 0x20023

public const val MON_11: Int = 0x20024

public const val MON_12: Int = 0x20025

public const val AM_STR: Int = 0x20026

public const val PM_STR: Int = 0x20027

public const val D_T_FMT: Int = 0x20028

public const val D_FMT: Int = 0x20029

public const val T_FMT: Int = 0x2002A

public const val T_FMT_AMPM: Int = 0x2002B

public const val ERA: Int = 0x2002C

public const val ERA_D_FMT: Int = 0x2002E

public const val ALT_DIGITS: Int = 0x2002F

public const val ERA_D_T_FMT: Int = 0x20030

public const val ERA_T_FMT: Int = 0x20031

public const val CODESET: Int = 14

public const val CRNCYSTR: Int = 0x4000F

public const val RUSAGE_THREAD: Int = 1

public const val RUSAGE_CHILDREN: Int = -1

public const val RADIXCHAR: Int = 0x10000

public const val THOUSEP: Int = 0x10001

public const val YESEXPR: Int = 0x50000

public const val NOEXPR: Int = 0x50001

public const val YESSTR: Int = 0x50002

public const val NOSTR: Int = 0x50003

public const val FILENAME_MAX: UInt = 4096u

public const val L_tmpnam: UInt = 20u

public const val _PC_LINK_MAX: Int = 0

public const val _PC_MAX_CANON: Int = 1

public const val _PC_MAX_INPUT: Int = 2

public const val _PC_NAME_MAX: Int = 3

public const val _PC_PATH_MAX: Int = 4

public const val _PC_PIPE_BUF: Int = 5

public const val _PC_CHOWN_RESTRICTED: Int = 6

public const val _PC_NO_TRUNC: Int = 7

public const val _PC_VDISABLE: Int = 8

public const val _PC_SYNC_IO: Int = 9

public const val _PC_ASYNC_IO: Int = 10

public const val _PC_PRIO_IO: Int = 11

public const val _PC_SOCK_MAXBUF: Int = 12

public const val _PC_FILESIZEBITS: Int = 13

public const val _PC_REC_INCR_XFER_SIZE: Int = 14

public const val _PC_REC_MAX_XFER_SIZE: Int = 15

public const val _PC_REC_MIN_XFER_SIZE: Int = 16

public const val _PC_REC_XFER_ALIGN: Int = 17

public const val _PC_ALLOC_SIZE_MIN: Int = 18

public const val _PC_SYMLINK_MAX: Int = 19

public const val _PC_2_SYMLINKS: Int = 20

public const val _SC_ARG_MAX: Int = 0

public const val _SC_CHILD_MAX: Int = 1

public const val _SC_CLK_TCK: Int = 2

public const val _SC_NGROUPS_MAX: Int = 3

public const val _SC_OPEN_MAX: Int = 4

public const val _SC_STREAM_MAX: Int = 5

public const val _SC_TZNAME_MAX: Int = 6

public const val _SC_JOB_CONTROL: Int = 7

public const val _SC_SAVED_IDS: Int = 8

public const val _SC_REALTIME_SIGNALS: Int = 9

public const val _SC_PRIORITY_SCHEDULING: Int = 10

public const val _SC_TIMERS: Int = 11

public const val _SC_ASYNCHRONOUS_IO: Int = 12

public const val _SC_PRIORITIZED_IO: Int = 13

public const val _SC_SYNCHRONIZED_IO: Int = 14

public const val _SC_FSYNC: Int = 15

public const val _SC_MAPPED_FILES: Int = 16

public const val _SC_MEMLOCK: Int = 17

public const val _SC_MEMLOCK_RANGE: Int = 18

public const val _SC_MEMORY_PROTECTION: Int = 19

public const val _SC_MESSAGE_PASSING: Int = 20

public const val _SC_SEMAPHORES: Int = 21

public const val _SC_SHARED_MEMORY_OBJECTS: Int = 22

public const val _SC_AIO_LISTIO_MAX: Int = 23

public const val _SC_AIO_MAX: Int = 24

public const val _SC_AIO_PRIO_DELTA_MAX: Int = 25

public const val _SC_DELAYTIMER_MAX: Int = 26

public const val _SC_MQ_OPEN_MAX: Int = 27

public const val _SC_MQ_PRIO_MAX: Int = 28

public const val _SC_VERSION: Int = 29

public const val _SC_PAGESIZE: Int = 30

public const val _SC_PAGE_SIZE: Int = _SC_PAGESIZE

public const val _SC_RTSIG_MAX: Int = 31

public const val _SC_SEM_NSEMS_MAX: Int = 32

public const val _SC_SEM_VALUE_MAX: Int = 33

public const val _SC_SIGQUEUE_MAX: Int = 34

public const val _SC_TIMER_MAX: Int = 35

public const val _SC_BC_BASE_MAX: Int = 36

public const val _SC_BC_DIM_MAX: Int = 37

public const val _SC_BC_SCALE_MAX: Int = 38

public const val _SC_BC_STRING_MAX: Int = 39

public const val _SC_COLL_WEIGHTS_MAX: Int = 40

public const val _SC_EXPR_NEST_MAX: Int = 42

public const val _SC_LINE_MAX: Int = 43

public const val _SC_RE_DUP_MAX: Int = 44

public const val _SC_2_VERSION: Int = 46

public const val _SC_2_C_BIND: Int = 47

public const val _SC_2_C_DEV: Int = 48

public const val _SC_2_FORT_DEV: Int = 49

public const val _SC_2_FORT_RUN: Int = 50

public const val _SC_2_SW_DEV: Int = 51

public const val _SC_2_LOCALEDEF: Int = 52

public const val _SC_UIO_MAXIOV: Int = 60

public const val _SC_IOV_MAX: Int = 60

public const val _SC_THREADS: Int = 67

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 68

public const val _SC_GETGR_R_SIZE_MAX: Int = 69

public const val _SC_GETPW_R_SIZE_MAX: Int = 70

public const val _SC_LOGIN_NAME_MAX: Int = 71

public const val _SC_TTY_NAME_MAX: Int = 72

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 73

public const val _SC_THREAD_KEYS_MAX: Int = 74

public const val _SC_THREAD_STACK_MIN: Int = 75

public const val _SC_THREAD_THREADS_MAX: Int = 76

public const val _SC_THREAD_ATTR_STACKADDR: Int = 77

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 78

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 79

public const val _SC_THREAD_PRIO_INHERIT: Int = 80

public const val _SC_THREAD_PRIO_PROTECT: Int = 81

public const val _SC_THREAD_PROCESS_SHARED: Int = 82

public const val _SC_NPROCESSORS_CONF: Int = 83

public const val _SC_NPROCESSORS_ONLN: Int = 84

public const val _SC_PHYS_PAGES: Int = 85

public const val _SC_AVPHYS_PAGES: Int = 86

public const val _SC_ATEXIT_MAX: Int = 87

public const val _SC_PASS_MAX: Int = 88

public const val _SC_XOPEN_VERSION: Int = 89

public const val _SC_XOPEN_XCU_VERSION: Int = 90

public const val _SC_XOPEN_UNIX: Int = 91

public const val _SC_XOPEN_CRYPT: Int = 92

public const val _SC_XOPEN_ENH_I18N: Int = 93

public const val _SC_XOPEN_SHM: Int = 94

public const val _SC_2_CHAR_TERM: Int = 95

public const val _SC_2_UPE: Int = 97

public const val _SC_XOPEN_XPG2: Int = 98

public const val _SC_XOPEN_XPG3: Int = 99

public const val _SC_XOPEN_XPG4: Int = 100

public const val _SC_NZERO: Int = 109

public const val _SC_XBS5_ILP32_OFF32: Int = 125

public const val _SC_XBS5_ILP32_OFFBIG: Int = 126

public const val _SC_XBS5_LP64_OFF64: Int = 127

public const val _SC_XBS5_LPBIG_OFFBIG: Int = 128

public const val _SC_XOPEN_LEGACY: Int = 129

public const val _SC_XOPEN_REALTIME: Int = 130

public const val _SC_XOPEN_REALTIME_THREADS: Int = 131

public const val _SC_ADVISORY_INFO: Int = 132

public const val _SC_BARRIERS: Int = 133

public const val _SC_CLOCK_SELECTION: Int = 137

public const val _SC_CPUTIME: Int = 138

public const val _SC_THREAD_CPUTIME: Int = 139

public const val _SC_MONOTONIC_CLOCK: Int = 149

public const val _SC_READER_WRITER_LOCKS: Int = 153

public const val _SC_SPIN_LOCKS: Int = 154

public const val _SC_REGEXP: Int = 155

public const val _SC_SHELL: Int = 157

public const val _SC_SPAWN: Int = 159

public const val _SC_SPORADIC_SERVER: Int = 160

public const val _SC_THREAD_SPORADIC_SERVER: Int = 161

public const val _SC_TIMEOUTS: Int = 164

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 165

public const val _SC_2_PBS: Int = 168

public const val _SC_2_PBS_ACCOUNTING: Int = 169

public const val _SC_2_PBS_LOCATE: Int = 170

public const val _SC_2_PBS_MESSAGE: Int = 171

public const val _SC_2_PBS_TRACK: Int = 172

public const val _SC_SYMLOOP_MAX: Int = 173

public const val _SC_STREAMS: Int = 174

public const val _SC_2_PBS_CHECKPOINT: Int = 175

public const val _SC_V6_ILP32_OFF32: Int = 176

public const val _SC_V6_ILP32_OFFBIG: Int = 177

public const val _SC_V6_LP64_OFF64: Int = 178

public const val _SC_V6_LPBIG_OFFBIG: Int = 179

public const val _SC_HOST_NAME_MAX: Int = 180

public const val _SC_TRACE: Int = 181

public const val _SC_TRACE_EVENT_FILTER: Int = 182

public const val _SC_TRACE_INHERIT: Int = 183

public const val _SC_TRACE_LOG: Int = 184

public const val _SC_IPV6: Int = 235

public const val _SC_RAW_SOCKETS: Int = 236

public const val _SC_V7_ILP32_OFF32: Int = 237

public const val _SC_V7_ILP32_OFFBIG: Int = 238

public const val _SC_V7_LP64_OFF64: Int = 239

public const val _SC_V7_LPBIG_OFFBIG: Int = 240

public const val _SC_SS_REPL_MAX: Int = 241

public const val _SC_TRACE_EVENT_NAME_MAX: Int = 242

public const val _SC_TRACE_NAME_MAX: Int = 243

public const val _SC_TRACE_SYS_MAX: Int = 244

public const val _SC_TRACE_USER_EVENT_MAX: Int = 245

public const val _SC_XOPEN_STREAMS: Int = 246

public const val _SC_THREAD_ROBUST_PRIO_INHERIT: Int = 247

public const val _SC_THREAD_ROBUST_PRIO_PROTECT: Int = 248

public val RLIM_SAVED_MAX: ULong = RLIM_INFINITY

public val RLIM_SAVED_CUR: ULong = RLIM_INFINITY

public val GLOB_ERR: Int = 1 shl 0

public val GLOB_MARK: Int = 1 shl 1

public val GLOB_NOSORT: Int = 1 shl 2

public val GLOB_DOOFFS: Int = 1 shl 3

public val GLOB_NOCHECK: Int = 1 shl 4

public val GLOB_APPEND: Int = 1 shl 5

public val GLOB_NOESCAPE: Int = 1 shl 6

public const val GLOB_NOSPACE: Int = 1

public const val GLOB_ABORTED: Int = 2

public const val GLOB_NOMATCH: Int = 3

public const val POSIX_MADV_NORMAL: Int = 0

public const val POSIX_MADV_RANDOM: Int = 1

public const val POSIX_MADV_SEQUENTIAL: Int = 2

public const val POSIX_MADV_WILLNEED: Int = 3

public const val S_IEXEC: UInt = 64u

public const val S_IWRITE: UInt = 128u

public const val S_IREAD: UInt = 256u

public const val F_LOCK: Int = 1

public const val F_TEST: Int = 3

public const val F_TLOCK: Int = 2

public const val F_ULOCK: Int = 0

public const val IFF_LOWER_UP: Int = 0x10000

public const val IFF_DORMANT: Int = 0x20000

public const val IFF_ECHO: Int = 0x40000

public const val ST_RDONLY: ULong = 1uL

public const val ST_NOSUID: ULong = 2uL

public const val ST_NODEV: ULong = 4uL

public const val ST_NOEXEC: ULong = 8uL

public const val ST_SYNCHRONOUS: ULong = 16uL

public const val ST_MANDLOCK: ULong = 64uL

public const val ST_WRITE: ULong = 128uL

public const val ST_APPEND: ULong = 256uL

public const val ST_IMMUTABLE: ULong = 512uL

public const val ST_NOATIME: ULong = 1024uL

public const val ST_NODIRATIME: ULong = 2048uL

public const val RTLD_NODELETE: Int = 0x1000

public const val RTLD_NOW: Int = 0x2

public const val TCP_MD5SIG: Int = 14

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { size: [0 (initializer represented at the FFI boundary)
public const val PTHREAD_MUTEX_NORMAL: Int = 0

public const val PTHREAD_MUTEX_RECURSIVE: Int = 1

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 2

public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL

public const val PTHREAD_PROCESS_PRIVATE: Int = 0

public const val PTHREAD_PROCESS_SHARED: Int = 1

public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL

public const val RENAME_NOREPLACE: Int = 1

public const val RENAME_EXCHANGE: Int = 2

public const val RENAME_WHITEOUT: Int = 4

public const val SCHED_OTHER: Int = 0

public const val SCHED_FIFO: Int = 1

public const val SCHED_RR: Int = 2

public const val SCHED_BATCH: Int = 3

public const val SCHED_IDLE: Int = 5

public const val IPPROTO_HOPOPTS: Int = 0

public const val IPPROTO_IGMP: Int = 2

public const val IPPROTO_IPIP: Int = 4

public const val IPPROTO_EGP: Int = 8

public const val IPPROTO_PUP: Int = 12

public const val IPPROTO_IDP: Int = 22

public const val IPPROTO_TP: Int = 29

public const val IPPROTO_DCCP: Int = 33

public const val IPPROTO_ROUTING: Int = 43

public const val IPPROTO_FRAGMENT: Int = 44

public const val IPPROTO_RSVP: Int = 46

public const val IPPROTO_GRE: Int = 47

public const val IPPROTO_ESP: Int = 50

public const val IPPROTO_AH: Int = 51

public const val IPPROTO_NONE: Int = 59

public const val IPPROTO_DSTOPTS: Int = 60

public const val IPPROTO_MTP: Int = 92

public const val IPPROTO_BEETPH: Int = 94

public const val IPPROTO_ENCAP: Int = 98

public const val IPPROTO_PIM: Int = 103

public const val IPPROTO_COMP: Int = 108

public const val IPPROTO_SCTP: Int = 132

public const val IPPROTO_MH: Int = 135

public const val IPPROTO_UDPLITE: Int = 136

public const val IPPROTO_MPLS: Int = 137

public const val IPPROTO_RAW: Int = 255

public const val IPPROTO_MAX: Int = 256

public const val AF_IB: Int = 27

public const val AF_MPLS: Int = 28

public const val AF_NFC: Int = 39

public const val AF_VSOCK: Int = 40

public const val PF_IB: Int = AF_IB

public const val PF_MPLS: Int = AF_MPLS

public const val PF_NFC: Int = AF_NFC

public const val PF_VSOCK: Int = AF_VSOCK

public const val IPC_PRIVATE: Int = 0

public const val IPC_CREAT: Int = 512

public const val IPC_EXCL: Int = 1024

public const val IPC_NOWAIT: Int = 2048

public const val IPC_RMID: Int = 0

public const val IPC_SET: Int = 1

public const val IPC_STAT: Int = 2

public const val IPC_INFO: Int = 3

public const val MSG_STAT: Int = 11

public const val MSG_INFO: Int = 12

public const val MSG_NOERROR: Int = 4096

public const val MSG_EXCEPT: Int = 8192

public const val MSG_COPY: Int = 16384

public const val SHM_R: Int = 256

public const val SHM_W: Int = 128

public const val SHM_RDONLY: Int = 4096

public const val SHM_RND: Int = 8192

public const val SHM_REMAP: Int = 16384

public const val SHM_EXEC: Int = 32768

public const val SHM_LOCK: Int = 11

public const val SHM_UNLOCK: Int = 12

public const val SHM_HUGETLB: Int = 2048

public const val SHM_NORESERVE: Int = 4096

public const val EPOLLRDHUP: Int = 0x2000

public const val EPOLLEXCLUSIVE: Int = 0x10000000

public const val EPOLLONESHOT: Int = 0x40000000

public const val QFMT_VFS_OLD: Int = 1

public const val QFMT_VFS_V0: Int = 2

public const val QFMT_VFS_V1: Int = 4

public const val EFD_SEMAPHORE: Int = 0x1

public const val LOG_NFACILITIES: Int = 24

public val RB_AUTOBOOT: Int = 0x01234567.toInt()

public val RB_HALT_SYSTEM: Int = 0xcdef0123.toInt()

public val RB_ENABLE_CAD: Int = 0x89abcdef.toInt()

public val RB_DISABLE_CAD: Int = 0x00000000.toInt()

public val RB_POWER_OFF: Int = 0x4321fedc.toInt()

public val RB_SW_SUSPEND: Int = 0xd000fce2.toInt()

public val RB_KEXEC: Int = 0x45584543.toInt()

public const val AI_PASSIVE: Int = 0x0001

public const val AI_CANONNAME: Int = 0x0002

public const val AI_NUMERICHOST: Int = 0x0004

public const val AI_V4MAPPED: Int = 0x0008

public const val AI_ALL: Int = 0x0010

public const val AI_ADDRCONFIG: Int = 0x0020

public const val AI_NUMERICSERV: Int = 0x0400

public const val EAI_BADFLAGS: Int = -1

public const val EAI_NONAME: Int = -2

public const val EAI_AGAIN: Int = -3

public const val EAI_FAIL: Int = -4

public const val EAI_FAMILY: Int = -6

public const val EAI_SOCKTYPE: Int = -7

public const val EAI_SERVICE: Int = -8

public const val EAI_MEMORY: Int = -10

public const val EAI_OVERFLOW: Int = -12

public const val NI_NUMERICHOST: Int = 1

public const val NI_NUMERICSERV: Int = 2

public const val NI_NOFQDN: Int = 4

public const val NI_NAMEREQD: Int = 8

public const val NI_DGRAM: Int = 16

public const val SYNC_FILE_RANGE_WAIT_BEFORE: UInt = 1u

public const val SYNC_FILE_RANGE_WRITE: UInt = 2u

public const val SYNC_FILE_RANGE_WAIT_AFTER: UInt = 4u

public const val EAI_SYSTEM: Int = -11

public const val AIO_CANCELED: Int = 0

public const val AIO_NOTCANCELED: Int = 1

public const val AIO_ALLDONE: Int = 2

public const val LIO_READ: Int = 0

public const val LIO_WRITE: Int = 1

public const val LIO_NOP: Int = 2

public const val LIO_WAIT: Int = 0

public const val LIO_NOWAIT: Int = 1

public const val MREMAP_MAYMOVE: Int = 1

public const val MREMAP_FIXED: Int = 2

public const val PR_SET_PDEATHSIG: Int = 1

public const val PR_GET_PDEATHSIG: Int = 2

public const val PR_GET_DUMPABLE: Int = 3

public const val PR_SET_DUMPABLE: Int = 4

public const val PR_GET_UNALIGN: Int = 5

public const val PR_SET_UNALIGN: Int = 6

public const val PR_UNALIGN_NOPRINT: Int = 1

public const val PR_UNALIGN_SIGBUS: Int = 2

public const val PR_GET_KEEPCAPS: Int = 7

public const val PR_SET_KEEPCAPS: Int = 8

public const val PR_GET_FPEMU: Int = 9

public const val PR_SET_FPEMU: Int = 10

public const val PR_FPEMU_NOPRINT: Int = 1

public const val PR_FPEMU_SIGFPE: Int = 2

public const val PR_GET_FPEXC: Int = 11

public const val PR_SET_FPEXC: Int = 12

public const val PR_FP_EXC_SW_ENABLE: Int = 0x80

public const val PR_FP_EXC_DIV: Int = 0x010000

public const val PR_FP_EXC_OVF: Int = 0x020000

public const val PR_FP_EXC_UND: Int = 0x040000

public const val PR_FP_EXC_RES: Int = 0x080000

public const val PR_FP_EXC_INV: Int = 0x100000

public const val PR_FP_EXC_DISABLED: Int = 0

public const val PR_FP_EXC_NONRECOV: Int = 1

public const val PR_FP_EXC_ASYNC: Int = 2

public const val PR_FP_EXC_PRECISE: Int = 3

public const val PR_GET_TIMING: Int = 13

public const val PR_SET_TIMING: Int = 14

public const val PR_TIMING_STATISTICAL: Int = 0

public const val PR_TIMING_TIMESTAMP: Int = 1

public const val PR_SET_NAME: Int = 15

public const val PR_GET_NAME: Int = 16

public const val PR_GET_ENDIAN: Int = 19

public const val PR_SET_ENDIAN: Int = 20

public const val PR_ENDIAN_BIG: Int = 0

public const val PR_ENDIAN_LITTLE: Int = 1

public const val PR_ENDIAN_PPC_LITTLE: Int = 2

public const val PR_GET_SECCOMP: Int = 21

public const val PR_SET_SECCOMP: Int = 22

public const val PR_CAPBSET_READ: Int = 23

public const val PR_CAPBSET_DROP: Int = 24

public const val PR_GET_TSC: Int = 25

public const val PR_SET_TSC: Int = 26

public const val PR_TSC_ENABLE: Int = 1

public const val PR_TSC_SIGSEGV: Int = 2

public const val PR_GET_SECUREBITS: Int = 27

public const val PR_SET_SECUREBITS: Int = 28

public const val PR_SET_TIMERSLACK: Int = 29

public const val PR_GET_TIMERSLACK: Int = 30

public const val PR_TASK_PERF_EVENTS_DISABLE: Int = 31

public const val PR_TASK_PERF_EVENTS_ENABLE: Int = 32

public const val PR_MCE_KILL: Int = 33

public const val PR_MCE_KILL_CLEAR: Int = 0

public const val PR_MCE_KILL_SET: Int = 1

public const val PR_MCE_KILL_LATE: Int = 0

public const val PR_MCE_KILL_EARLY: Int = 1

public const val PR_MCE_KILL_DEFAULT: Int = 2

public const val PR_MCE_KILL_GET: Int = 34

public const val PR_SET_MM: Int = 35

public const val PR_SET_MM_START_CODE: Int = 1

public const val PR_SET_MM_END_CODE: Int = 2

public const val PR_SET_MM_START_DATA: Int = 3

public const val PR_SET_MM_END_DATA: Int = 4

public const val PR_SET_MM_START_STACK: Int = 5

public const val PR_SET_MM_START_BRK: Int = 6

public const val PR_SET_MM_BRK: Int = 7

public const val PR_SET_MM_ARG_START: Int = 8

public const val PR_SET_MM_ARG_END: Int = 9

public const val PR_SET_MM_ENV_START: Int = 10

public const val PR_SET_MM_ENV_END: Int = 11

public const val PR_SET_MM_AUXV: Int = 12

public const val PR_SET_MM_EXE_FILE: Int = 13

public const val PR_SET_MM_MAP: Int = 14

public const val PR_SET_MM_MAP_SIZE: Int = 15

public const val PR_SET_PTRACER: Int = 0x59616d61

public const val PR_SET_PTRACER_ANY: ULong = 0xffffffffffffffffuL

public const val PR_SET_CHILD_SUBREAPER: Int = 36

public const val PR_GET_CHILD_SUBREAPER: Int = 37

public const val PR_SET_NO_NEW_PRIVS: Int = 38

public const val PR_GET_NO_NEW_PRIVS: Int = 39

public const val PR_GET_TID_ADDRESS: Int = 40

public const val PR_SET_THP_DISABLE: Int = 41

public const val PR_GET_THP_DISABLE: Int = 42

public const val PR_MPX_ENABLE_MANAGEMENT: Int = 43

public const val PR_MPX_DISABLE_MANAGEMENT: Int = 44

public const val PR_SET_FP_MODE: Int = 45

public const val PR_GET_FP_MODE: Int = 46

public val PR_FP_MODE_FR: Int = 1 shl 0

public val PR_FP_MODE_FRE: Int = 1 shl 1

public const val PR_CAP_AMBIENT: Int = 47

public const val PR_CAP_AMBIENT_IS_SET: Int = 1

public const val PR_CAP_AMBIENT_RAISE: Int = 2

public const val PR_CAP_AMBIENT_LOWER: Int = 3

public const val PR_CAP_AMBIENT_CLEAR_ALL: Int = 4

public const val ITIMER_REAL: Int = 0

public const val ITIMER_VIRTUAL: Int = 1

public const val ITIMER_PROF: Int = 2

public val TFD_CLOEXEC: Int = O_CLOEXEC

public val TFD_NONBLOCK: Int = O_NONBLOCK

public const val TFD_TIMER_ABSTIME: Int = 1

public const val XATTR_CREATE: Int = 0x1

public const val XATTR_REPLACE: Int = 0x2

public const val _POSIX_VDISABLE: UByte = 0u

public const val FALLOC_FL_KEEP_SIZE: Int = 0x01

public const val FALLOC_FL_PUNCH_HOLE: Int = 0x02

public const val FALLOC_FL_COLLAPSE_RANGE: Int = 0x08

public const val FALLOC_FL_ZERO_RANGE: Int = 0x10

public const val FALLOC_FL_INSERT_RANGE: Int = 0x20

public const val FALLOC_FL_UNSHARE_RANGE: Int = 0x40

public val ENOATTR: Int = ENODATA

public const val SO_ORIGINAL_DST: Int = 80

public const val IUTF8: UInt = 0x00004000u

public const val CMSPAR: UInt = 1073741824u

public const val MFD_CLOEXEC: UInt = 0x0001u

public const val MFD_ALLOW_SEALING: UInt = 0x0002u

public const val PT_NULL: UInt = 0u

public const val PT_LOAD: UInt = 1u

public const val PT_DYNAMIC: UInt = 2u

public const val PT_INTERP: UInt = 3u

public const val PT_NOTE: UInt = 4u

public const val PT_SHLIB: UInt = 5u

public const val PT_PHDR: UInt = 6u

public const val PT_TLS: UInt = 7u

public const val PT_NUM: UInt = 8u

public const val PT_LOOS: UInt = 0x60000000u

public const val PT_GNU_EH_FRAME: UInt = 0x6474e550u

public const val PT_GNU_STACK: UInt = 0x6474e551u

public const val PT_GNU_RELRO: UInt = 0x6474e552u

public const val ETH_P_LOOP: Int = 0x0060

public const val ETH_P_PUP: Int = 0x0200

public const val ETH_P_PUPAT: Int = 0x0201

public const val ETH_P_IP: Int = 0x0800

public const val ETH_P_X25: Int = 0x0805

public const val ETH_P_ARP: Int = 0x0806

public const val ETH_P_BPQ: Int = 0x08FF

public const val ETH_P_IEEEPUP: Int = 0x0a00

public const val ETH_P_IEEEPUPAT: Int = 0x0a01

public const val ETH_P_BATMAN: Int = 0x4305

public const val ETH_P_DEC: Int = 0x6000

public const val ETH_P_DNA_DL: Int = 0x6001

public const val ETH_P_DNA_RC: Int = 0x6002

public const val ETH_P_DNA_RT: Int = 0x6003

public const val ETH_P_LAT: Int = 0x6004

public const val ETH_P_DIAG: Int = 0x6005

public const val ETH_P_CUST: Int = 0x6006

public const val ETH_P_SCA: Int = 0x6007

public const val ETH_P_TEB: Int = 0x6558

public const val ETH_P_RARP: Int = 0x8035

public const val ETH_P_ATALK: Int = 0x809B

public const val ETH_P_AARP: Int = 0x80F3

public const val ETH_P_8021Q: Int = 0x8100

public const val ETH_P_IPX: Int = 0x8137

public const val ETH_P_IPV6: Int = 0x86DD

public const val ETH_P_PAUSE: Int = 0x8808

public const val ETH_P_SLOW: Int = 0x8809

public const val ETH_P_WCCP: Int = 0x883E

public const val ETH_P_MPLS_UC: Int = 0x8847

public const val ETH_P_MPLS_MC: Int = 0x8848

public const val ETH_P_ATMMPOA: Int = 0x884c

public const val ETH_P_PPP_DISC: Int = 0x8863

public const val ETH_P_PPP_SES: Int = 0x8864

public const val ETH_P_LINK_CTL: Int = 0x886c

public const val ETH_P_ATMFATE: Int = 0x8884

public const val ETH_P_PAE: Int = 0x888E

public const val ETH_P_AOE: Int = 0x88A2

public const val ETH_P_8021AD: Int = 0x88A8

public const val ETH_P_802_EX1: Int = 0x88B5

public const val ETH_P_TIPC: Int = 0x88CA

public const val ETH_P_8021AH: Int = 0x88E7

public const val ETH_P_MVRP: Int = 0x88F5

public const val ETH_P_1588: Int = 0x88F7

public const val ETH_P_PRP: Int = 0x88FB

public const val ETH_P_FCOE: Int = 0x8906

public const val ETH_P_TDLS: Int = 0x890D

public const val ETH_P_FIP: Int = 0x8914

public const val ETH_P_80221: Int = 0x8917

public const val ETH_P_LOOPBACK: Int = 0x9000

public const val ETH_P_QINQ1: Int = 0x9100

public const val ETH_P_QINQ2: Int = 0x9200

public const val ETH_P_QINQ3: Int = 0x9300

public const val ETH_P_EDSA: Int = 0xDADA

public const val ETH_P_AF_IUCV: Int = 0xFBFB

public const val ETH_P_802_3_MIN: Int = 0x0600

public const val ETH_P_802_3: Int = 0x0001

public const val ETH_P_AX25: Int = 0x0002

public const val ETH_P_ALL: Int = 0x0003

public const val ETH_P_802_2: Int = 0x0004

public const val ETH_P_SNAP: Int = 0x0005

public const val ETH_P_DDCMP: Int = 0x0006

public const val ETH_P_WAN_PPP: Int = 0x0007

public const val ETH_P_PPP_MP: Int = 0x0008

public const val ETH_P_LOCALTALK: Int = 0x0009

public const val ETH_P_CAN: Int = 0x000C

public const val ETH_P_CANFD: Int = 0x000D

public const val ETH_P_PPPTALK: Int = 0x0010

public const val ETH_P_TR_802_2: Int = 0x0011

public const val ETH_P_MOBITEX: Int = 0x0015

public const val ETH_P_CONTROL: Int = 0x0016

public const val ETH_P_IRDA: Int = 0x0017

public const val ETH_P_ECONET: Int = 0x0018

public const val ETH_P_HDLC: Int = 0x0019

public const val ETH_P_ARCNET: Int = 0x001A

public const val ETH_P_DSA: Int = 0x001B

public const val ETH_P_TRAILER: Int = 0x001C

public const val ETH_P_PHONET: Int = 0x00F5

public const val ETH_P_IEEE802154: Int = 0x00F6

public const val ETH_P_CAIF: Int = 0x00F7

public const val SFD_CLOEXEC: Int = 0x080000

public const val NCCS: ULong = 32uL

public const val O_TRUNC: Int = 0x00040000

public const val O_NOATIME: Int = 0x00002000

public const val O_CLOEXEC: Int = 0x00000100

public const val O_TMPFILE: Int = 0x00004000

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

public const val EDOTDOT: Int = 73

public const val SA_NODEFER: Int = 0x40000000

public const val SA_RESETHAND: Int = 0x80000000.toInt()

public const val SA_RESTART: Int = 0x10000000

public const val SA_NOCLDSTOP: Int = 0x00000001

public const val EPOLL_CLOEXEC: Int = 0x80000

public const val EFD_CLOEXEC: Int = 0x80000

public const val BUFSIZ: UInt = 1024u

public const val TMP_MAX: UInt = 10000u

public const val FOPEN_MAX: UInt = 1000u

public const val O_PATH: Int = 0x00400000

public const val O_EXEC: Int = O_PATH

public const val O_SEARCH: Int = O_PATH

public val O_ACCMODE: Int = 3 or O_SEARCH

public val O_NDELAY: Int = O_NONBLOCK

public const val NI_MAXHOST: UInt = 255u

public const val PTHREAD_STACK_MIN: ULong = 2048uL

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val POSIX_MADV_DONTNEED: Int = 4

public const val RLIM_INFINITY: ULong = 0xFFFFFFFFFFFFFFFFuL

public const val RLIMIT_RTTIME: Int = 15

public const val RLIMIT_NLIMITS: Int = 16

public const val RLIM_NLIMITS: Int = RLIMIT_NLIMITS

public val MAP_ANONYMOUS: Int = MAP_ANON

public const val SOCK_DCCP: Int = 6

public const val SOCK_PACKET: Int = 10

public const val TCP_COOKIE_TRANSACTIONS: Int = 15

public const val TCP_THIN_LINEAR_TIMEOUTS: Int = 16

public const val TCP_THIN_DUPACK: Int = 17

public const val TCP_USER_TIMEOUT: Int = 18

public const val TCP_REPAIR: Int = 19

public const val TCP_REPAIR_QUEUE: Int = 20

public const val TCP_QUEUE_SEQ: Int = 21

public const val TCP_REPAIR_OPTIONS: Int = 22

public const val TCP_FASTOPEN: Int = 23

public const val TCP_TIMESTAMP: Int = 24

public val SIGUNUSED: Int = SIGSYS

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL

public const val CPU_SETSIZE: Int = 128

public const val PTRACE_TRACEME: Int = 0

public const val PTRACE_PEEKTEXT: Int = 1

public const val PTRACE_PEEKDATA: Int = 2

public const val PTRACE_PEEKUSER: Int = 3

public const val PTRACE_POKETEXT: Int = 4

public const val PTRACE_POKEDATA: Int = 5

public const val PTRACE_POKEUSER: Int = 6

public const val PTRACE_CONT: Int = 7

public const val PTRACE_KILL: Int = 8

public const val PTRACE_SINGLESTEP: Int = 9

public const val PTRACE_GETREGS: Int = 12

public const val PTRACE_SETREGS: Int = 13

public const val PTRACE_GETFPREGS: Int = 14

public const val PTRACE_SETFPREGS: Int = 15

public const val PTRACE_ATTACH: Int = 16

public const val PTRACE_DETACH: Int = 17

public const val PTRACE_GETFPXREGS: Int = 18

public const val PTRACE_SETFPXREGS: Int = 19

public const val PTRACE_SYSCALL: Int = 24

public const val PTRACE_SETOPTIONS: Int = 0x4200

public const val PTRACE_GETEVENTMSG: Int = 0x4201

public const val PTRACE_GETSIGINFO: Int = 0x4202

public const val PTRACE_SETSIGINFO: Int = 0x4203

public const val PTRACE_GETREGSET: Int = 0x4204

public const val PTRACE_SETREGSET: Int = 0x4205

public const val PTRACE_SEIZE: Int = 0x4206

public const val PTRACE_INTERRUPT: Int = 0x4207

public const val PTRACE_LISTEN: Int = 0x4208

public const val PTRACE_PEEKSIGINFO: Int = 0x4209

public const val EPOLLWAKEUP: Int = 0x20000000

public val EFD_NONBLOCK: Int = O_NONBLOCK

public val SFD_NONBLOCK: Int = O_NONBLOCK

public const val TCSANOW: Int = 0

public const val TCSADRAIN: Int = 1

public const val TCSAFLUSH: Int = 2

public val TIOCINQ: Int = FIONREAD

public const val RTLD_GLOBAL: Int = 0x100

public const val RTLD_NOLOAD: Int = 0x4

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val CBAUD: UInt = 4111u

public const val TAB1: Int = 0x00000800

public const val TAB2: Int = 0x00001000

public const val TAB3: Int = 0x00001800

public const val CR1: Int = 0x00000200

public const val CR2: Int = 0x00000400

public const val CR3: Int = 0x00000600

public const val FF1: Int = 0x00008000

public const val BS1: Int = 0x00002000

public const val VT1: Int = 0x00004000

public const val VWERASE: ULong = 14uL

public const val VREPRINT: ULong = 12uL

public const val VSUSP: ULong = 10uL

public const val VSTART: ULong = 8uL

public const val VSTOP: ULong = 9uL

public const val VDISCARD: ULong = 13uL

public const val VTIME: ULong = 5uL

public const val IXON: UInt = 0x00000400u

public const val IXOFF: UInt = 0x00001000u

public const val ONLCR: UInt = 0x4u

public const val CSIZE: UInt = 0x00000030u

public const val CS6: UInt = 0x00000010u

public const val CS7: UInt = 0x00000020u

public const val CS8: UInt = 0x00000030u

public const val CSTOPB: UInt = 0x00000040u

public const val CREAD: UInt = 0x00000080u

public const val PARENB: UInt = 0x00000100u

public const val PARODD: UInt = 0x00000200u

public const val HUPCL: UInt = 0x00000400u

public const val CLOCAL: UInt = 0x00000800u

public const val ECHOKE: UInt = 0x00000800u

public const val ECHOE: UInt = 0x00000010u

public const val ECHOK: UInt = 0x00000020u

public const val ECHONL: UInt = 0x00000040u

public const val ECHOPRT: UInt = 0x00000400u

public const val ECHOCTL: UInt = 0x00000200u

public const val ISIG: UInt = 0x00000001u

public const val ICANON: UInt = 0x00000002u

public const val PENDIN: UInt = 0x00004000u

public const val NOFLSH: UInt = 0x00000080u

public const val CIBAUD: UInt = 269418496u

public const val CBAUDEX: UInt = 4096u

public const val VSWTC: ULong = 7uL

public const val OLCUC: UInt = 2u

public const val NLDLY: UInt = 256u

public const val CRDLY: UInt = 1536u

public const val TABDLY: UInt = 6144u

public const val BSDLY: UInt = 8192u

public const val FFDLY: UInt = 32768u

public const val VTDLY: UInt = 16384u

public const val XTABS: UInt = 6144u

public const val B0: UInt = 0u

public const val B50: UInt = 1u

public const val B75: UInt = 2u

public const val B110: UInt = 3u

public const val B134: UInt = 4u

public const val B150: UInt = 5u

public const val B200: UInt = 6u

public const val B300: UInt = 7u

public const val B600: UInt = 8u

public const val B1200: UInt = 9u

public const val B1800: UInt = 10u

public const val B2400: UInt = 11u

public const val B4800: UInt = 12u

public const val B9600: UInt = 13u

public const val B19200: UInt = 14u

public const val B38400: UInt = 15u

public const val EXTA: UInt = B19200

public const val EXTB: UInt = B38400

public const val B57600: UInt = 4097u

public const val B115200: UInt = 4098u

public const val B230400: UInt = 4099u

public const val B460800: UInt = 4100u

public const val B500000: UInt = 4101u

public const val B576000: UInt = 4102u

public const val B921600: UInt = 4103u

public const val B1000000: UInt = 4104u

public const val B1152000: UInt = 4105u

public const val B1500000: UInt = 4106u

public const val B2000000: UInt = 4107u

public const val B2500000: UInt = 4108u

public const val B3000000: UInt = 4109u

public const val B3500000: UInt = 4110u

public const val B4000000: UInt = 4111u

public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL

public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL

public const val O_ASYNC: Int = 0x00000400

public const val FIOCLEX: Int = 0x5451

public const val FIONBIO: Int = 0x5421

public const val RLIMIT_RSS: Int = 5

public const val RLIMIT_NOFILE: Int = 7

public const val RLIMIT_AS: Int = 9

public const val RLIMIT_NPROC: Int = 6

public const val RLIMIT_MEMLOCK: Int = 8

public const val O_APPEND: Int = 0x00100000

public const val O_CREAT: Int = 0x00010000

public const val O_EXCL: Int = 0x00020000

public const val O_NOCTTY: Int = 0x00000200

public const val O_NONBLOCK: Int = 0x00000010

public val O_SYNC: Int = 0x00000040 or O_DSYNC

public val O_RSYNC: Int = O_SYNC

public const val O_DSYNC: Int = 0x00000020

public const val SOCK_CLOEXEC: Int = 524288

public const val SOCK_NONBLOCK: Int = 2048

public const val MAP_ANON: Int = 0x0020

public const val MAP_GROWSDOWN: Int = 0x0100

public const val MAP_DENYWRITE: Int = 0x0800

public const val MAP_EXECUTABLE: Int = 0x01000

public const val MAP_LOCKED: Int = 0x02000

public const val MAP_NORESERVE: Int = 0x04000

public const val MAP_POPULATE: Int = 0x08000

public const val MAP_NONBLOCK: Int = 0x010000

public const val MAP_STACK: Int = 0x020000

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_SEQPACKET: Int = 5

public const val SOL_SOCKET: Int = 1

public const val EDEADLK: Int = 35

public const val ENAMETOOLONG: Int = 36

public const val ENOLCK: Int = 37

public const val ENOSYS: Int = 38

public const val ENOTEMPTY: Int = 39

public const val ELOOP: Int = 40

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

public const val EMULTIHOP: Int = 72

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

public const val ENOTSUP: Int = EOPNOTSUPP

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

public const val SO_REUSEADDR: Int = 2

public const val SO_TYPE: Int = 3

public const val SO_ERROR: Int = 4

public const val SO_DONTROUTE: Int = 5

public const val SO_BROADCAST: Int = 6

public const val SO_SNDBUF: Int = 7

public const val SO_RCVBUF: Int = 8

public const val SO_KEEPALIVE: Int = 9

public const val SO_OOBINLINE: Int = 10

public const val SO_NO_CHECK: Int = 11

public const val SO_PRIORITY: Int = 12

public const val SO_LINGER: Int = 13

public const val SO_BSDCOMPAT: Int = 14

public const val SO_REUSEPORT: Int = 15

public const val SO_PASSCRED: Int = 16

public const val SO_PEERCRED: Int = 17

public const val SO_RCVLOWAT: Int = 18

public const val SO_SNDLOWAT: Int = 19

public const val SO_RCVTIMEO: Int = 20

public const val SO_SNDTIMEO: Int = 21

public const val SO_BINDTODEVICE: Int = 25

public const val SO_TIMESTAMP: Int = 29

public const val SO_ACCEPTCONN: Int = 30

public const val SO_SNDBUFFORCE: Int = 32

public const val SO_RCVBUFFORCE: Int = 33

public const val SO_TIMESTAMPNS: Int = 35

public const val SO_MARK: Int = 36

public const val SO_PROTOCOL: Int = 38

public const val SO_DOMAIN: Int = 39

public const val SO_RXQ_OVFL: Int = 40

public const val SO_PEEK_OFF: Int = 42

public const val SO_BUSY_POLL: Int = 46

public const val SO_COOKIE: Int = 57

public const val SO_BINDTOIFINDEX: Int = 62

public const val SO_FUCHSIA_MARK: Int = 10000

public const val SA_ONSTACK: Int = 0x08000000

public const val SA_SIGINFO: Int = 0x00000004

public const val SA_NOCLDWAIT: Int = 0x00000002

public const val SIGCHLD: Int = 17

public const val SIGBUS: Int = 7

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGUSR1: Int = 10

public const val SIGUSR2: Int = 12

public const val SIGCONT: Int = 18

public const val SIGSTOP: Int = 19

public const val SIGTSTP: Int = 20

public const val SIGURG: Int = 23

public const val SIGIO: Int = 29

public const val SIGSYS: Int = 31

public const val SIGSTKFLT: Int = 16

public const val SIGPOLL: Int = 29

public const val SIGPWR: Int = 30

public const val SIG_SETMASK: Int = 2

public const val SIG_BLOCK: Int = 0x000000

public const val SIG_UNBLOCK: Int = 0x01

public const val EXTPROC: UInt = 0x00010000u

public const val MAP_HUGETLB: Int = 0x040000

public const val F_GETLK: Int = 5

public const val F_GETOWN: Int = 9

public const val F_SETLK: Int = 6

public const val F_SETLKW: Int = 7

public const val F_SETOWN: Int = 8

public const val VEOF: ULong = 4uL

public const val VEOL: ULong = 11uL

public const val VEOL2: ULong = 16uL

public const val VMIN: ULong = 6uL

public const val IEXTEN: UInt = 0x00008000u

public const val TOSTOP: UInt = 0x00000100u

public const val FLUSHO: UInt = 0x00001000u

public const val TCGETS: Int = 0x5401

public const val TCSETS: Int = 0x5402

public const val TCSETSW: Int = 0x5403

public const val TCSETSF: Int = 0x5404

public const val TCGETA: Int = 0x5405

public const val TCSETA: Int = 0x5406

public const val TCSETAW: Int = 0x5407

public const val TCSETAF: Int = 0x5408

public const val TCSBRK: Int = 0x5409

public const val TCXONC: Int = 0x540A

public const val TCFLSH: Int = 0x540B

public const val TIOCGSOFTCAR: Int = 0x5419

public const val TIOCSSOFTCAR: Int = 0x541A

public const val TIOCLINUX: Int = 0x541C

public const val TIOCGSERIAL: Int = 0x541E

public const val TIOCEXCL: Int = 0x540C

public const val TIOCNXCL: Int = 0x540D

public const val TIOCSCTTY: Int = 0x540E

public const val TIOCGPGRP: Int = 0x540F

public const val TIOCSPGRP: Int = 0x5410

public const val TIOCOUTQ: Int = 0x5411

public const val TIOCSTI: Int = 0x5412

public const val TIOCGWINSZ: Int = 0x5413

public const val TIOCSWINSZ: Int = 0x5414

public const val TIOCMGET: Int = 0x5415

public const val TIOCMBIS: Int = 0x5416

public const val TIOCMBIC: Int = 0x5417

public const val TIOCMSET: Int = 0x5418

public const val FIONREAD: Int = 0x541B

public const val TIOCCONS: Int = 0x541D

public const val POLLWRNORM: Short = 0x100

public const val POLLWRBAND: Short = 0x200

public const val TIOCM_LE: Int = 0x001

public const val TIOCM_DTR: Int = 0x002

public const val TIOCM_RTS: Int = 0x004

public const val TIOCM_ST: Int = 0x008

public const val TIOCM_SR: Int = 0x010

public const val TIOCM_CTS: Int = 0x020

public const val TIOCM_CAR: Int = 0x040

public const val TIOCM_RNG: Int = 0x080

public const val TIOCM_DSR: Int = 0x100

public const val TIOCM_CD: Int = TIOCM_CAR

public const val TIOCM_RI: Int = TIOCM_RNG

public const val O_DIRECTORY: Int = 0x00080000

public const val O_DIRECT: Int = 0x00000800

public const val O_LARGEFILE: Int = 0x00001000

public const val O_NOFOLLOW: Int = 0x00000080

public const val HUGETLB_FLAG_ENCODE_SHIFT: UInt = 26u

public const val MAP_HUGE_SHIFT: UInt = 26u
