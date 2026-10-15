// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

internal const val T_TYPE: UInt = 0x54u

internal const val _IOC_NRBITS: Int = 8

internal const val _IOC_TYPEBITS: Int = 8

internal const val _IOC_SIZEBITS: Int = 14

internal const val _IOC_DIRBITS: Int = 2

internal const val _IOC_NRMASK: UInt = 0xFFu

internal const val _IOC_TYPEMASK: UInt = 0xFFu

internal const val _IOC_SIZEMASK: UInt = 0x3FFFu

internal const val _IOC_DIRMASK: UInt = 0x3u

internal const val _IOC_NRSHIFT: Int = 0

internal const val _IOC_TYPESHIFT: Int = 8

internal const val _IOC_SIZESHIFT: Int = 16

internal const val _IOC_DIRSHIFT: Int = 30

internal const val _IOC_NONE: UInt = 0u

internal const val _IOC_WRITE: UInt = 1u

internal const val _IOC_READ: UInt = 2u

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

public const val CLOCK_TAI: Int = 11

public const val TIMER_ABSTIME: Int = 1

public const val RUSAGE_SELF: Int = 0

public const val O_RDONLY: Int = 0

public const val O_WRONLY: Int = 1

public const val O_RDWR: Int = 2

public const val O_CLOEXEC: Int = 0x80000

public const val O_EXCL: Int = 0x80

public const val O_DIRECTORY: Int = 0x10000

public const val ENODATA: Int = 61

public const val NLMSG_MIN_TYPE: Int = 0x10

public const val NLMSG_OVERRUN: Int = 0x4

public const val EOPNOTSUPP: Int = 95

public const val SOCK_CLOEXEC: Int = O_CLOEXEC

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

public const val XATTR_CREATE: Int = 0x1

public const val XATTR_REPLACE: Int = 0x2

public val RLIM64_INFINITY: ULong = 0uL.inv()

public const val LC_CTYPE: Int = 0

public const val LC_NUMERIC: Int = 1

public const val LC_TIME: Int = 2

public const val LC_COLLATE: Int = 3

public const val LC_MONETARY: Int = 4

public const val LC_MESSAGES: Int = 5

public const val LC_PAPER: Int = 6

public const val LC_NAME: Int = 7

public const val LC_ADDRESS: Int = 8

public const val LC_TELEPHONE: Int = 9

public const val LC_MEASUREMENT: Int = 10

public const val LC_IDENTIFICATION: Int = 11

public const val LC_ALL: Int = 12

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

public const val MS_NOSYMFOLLOW: ULong = 0x100uL

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

public const val MS_LAZYTIME: ULong = 0x2000000uL

public const val MS_ACTIVE: ULong = 0x40000000uL

public const val MS_MGC_VAL: ULong = 0xc0ed0000uL

public const val MS_MGC_MSK: ULong = 0xffff0000uL

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

public const val MADV_WIPEONFORK: Int = 18

public const val MADV_KEEPONFORK: Int = 19

public const val MADV_COLD: Int = 20

public const val MADV_PAGEOUT: Int = 21

public const val MADV_HWPOISON: Int = 100

public const val MADV_POPULATE_READ: Int = 22

public const val MADV_POPULATE_WRITE: Int = 23

public const val MADV_DONTNEED_LOCKED: Int = 24

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

public const val SOL_BLUETOOTH: Int = 274

public const val SOL_ALG: Int = 279

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

// SO_TIMESTAMP and SCM_TIMESTAMP are defined per arch sub-module.
public const val SOCK_RAW: Int = 3

public const val SOCK_RDM: Int = 4

public const val IP_TOS: Int = 1

public const val IP_TTL: Int = 2

public const val IP_HDRINCL: Int = 3

public const val IP_OPTIONS: Int = 4

public const val IP_ROUTER_ALERT: Int = 5

public const val IP_RECVOPTS: Int = 6

public const val IP_RETOPTS: Int = 7

public const val IP_PKTINFO: Int = 8

public const val IP_PKTOPTIONS: Int = 9

public const val IP_MTU_DISCOVER: Int = 10

public const val IP_RECVERR: Int = 11

public const val IP_RECVTTL: Int = 12

public const val IP_RECVTOS: Int = 13

public const val IP_MTU: Int = 14

public const val IP_FREEBIND: Int = 15

public const val IP_IPSEC_POLICY: Int = 16

public const val IP_XFRM_POLICY: Int = 17

public const val IP_PASSSEC: Int = 18

public const val IP_TRANSPARENT: Int = 19

public const val IP_ORIGDSTADDR: Int = 20

public const val IP_RECVORIGDSTADDR: Int = IP_ORIGDSTADDR

public const val IP_MINTTL: Int = 21

public const val IP_NODEFRAG: Int = 22

public const val IP_CHECKSUM: Int = 23

public const val IP_BIND_ADDRESS_NO_PORT: Int = 24

public const val IP_MULTICAST_IF: Int = 32

public const val IP_MULTICAST_TTL: Int = 33

public const val IP_MULTICAST_LOOP: Int = 34

public const val IP_ADD_MEMBERSHIP: Int = 35

public const val IP_DROP_MEMBERSHIP: Int = 36

public const val IP_UNBLOCK_SOURCE: Int = 37

public const val IP_BLOCK_SOURCE: Int = 38

public const val IP_ADD_SOURCE_MEMBERSHIP: Int = 39

public const val IP_DROP_SOURCE_MEMBERSHIP: Int = 40

public const val IP_MSFILTER: Int = 41

public const val IP_MULTICAST_ALL: Int = 49

public const val IP_UNICAST_IF: Int = 50

public const val IP_DEFAULT_MULTICAST_TTL: Int = 1

public const val IP_DEFAULT_MULTICAST_LOOP: Int = 1

public const val IP_PMTUDISC_DONT: Int = 0

public const val IP_PMTUDISC_WANT: Int = 1

public const val IP_PMTUDISC_DO: Int = 2

public const val IP_PMTUDISC_PROBE: Int = 3

public const val IP_PMTUDISC_INTERFACE: Int = 4

public const val IP_PMTUDISC_OMIT: Int = 5

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

public const val IPPROTO_ENCAP: Int = 98

public const val IPPROTO_PIM: Int = 103

public const val IPPROTO_COMP: Int = 108

public const val IPPROTO_SCTP: Int = 132

public const val IPPROTO_MH: Int = 135

public const val IPPROTO_UDPLITE: Int = 136

public const val IPPROTO_RAW: Int = 255

public const val IPPROTO_BEETPH: Int = 94

public const val IPPROTO_MPLS: Int = 137

public const val IPPROTO_MPTCP: Int = 262

public const val IPPROTO_ETHERNET: Int = 143

public const val MCAST_EXCLUDE: Int = 0

public const val MCAST_INCLUDE: Int = 1

public const val MCAST_JOIN_GROUP: Int = 42

public const val MCAST_BLOCK_SOURCE: Int = 43

public const val MCAST_UNBLOCK_SOURCE: Int = 44

public const val MCAST_LEAVE_GROUP: Int = 45

public const val MCAST_JOIN_SOURCE_GROUP: Int = 46

public const val MCAST_LEAVE_SOURCE_GROUP: Int = 47

public const val MCAST_MSFILTER: Int = 48

public const val IPV6_ADDRFORM: Int = 1

public const val IPV6_2292PKTINFO: Int = 2

public const val IPV6_2292HOPOPTS: Int = 3

public const val IPV6_2292DSTOPTS: Int = 4

public const val IPV6_2292RTHDR: Int = 5

public const val IPV6_2292PKTOPTIONS: Int = 6

public const val IPV6_CHECKSUM: Int = 7

public const val IPV6_2292HOPLIMIT: Int = 8

public const val IPV6_NEXTHOP: Int = 9

public const val IPV6_AUTHHDR: Int = 10

public const val IPV6_UNICAST_HOPS: Int = 16

public const val IPV6_MULTICAST_IF: Int = 17

public const val IPV6_MULTICAST_HOPS: Int = 18

public const val IPV6_MULTICAST_LOOP: Int = 19

public const val IPV6_ADD_MEMBERSHIP: Int = 20

public const val IPV6_DROP_MEMBERSHIP: Int = 21

public const val IPV6_ROUTER_ALERT: Int = 22

public const val IPV6_MTU_DISCOVER: Int = 23

public const val IPV6_MTU: Int = 24

public const val IPV6_RECVERR: Int = 25

public const val IPV6_V6ONLY: Int = 26

public const val IPV6_JOIN_ANYCAST: Int = 27

public const val IPV6_LEAVE_ANYCAST: Int = 28

public const val IPV6_IPSEC_POLICY: Int = 34

public const val IPV6_XFRM_POLICY: Int = 35

public const val IPV6_HDRINCL: Int = 36

public const val IPV6_RECVPKTINFO: Int = 49

public const val IPV6_PKTINFO: Int = 50

public const val IPV6_RECVHOPLIMIT: Int = 51

public const val IPV6_HOPLIMIT: Int = 52

public const val IPV6_RECVHOPOPTS: Int = 53

public const val IPV6_HOPOPTS: Int = 54

public const val IPV6_RTHDRDSTOPTS: Int = 55

public const val IPV6_RECVRTHDR: Int = 56

public const val IPV6_RTHDR: Int = 57

public const val IPV6_RECVDSTOPTS: Int = 58

public const val IPV6_DSTOPTS: Int = 59

public const val IPV6_RECVPATHMTU: Int = 60

public const val IPV6_PATHMTU: Int = 61

public const val IPV6_DONTFRAG: Int = 62

public const val IPV6_RECVTCLASS: Int = 66

public const val IPV6_TCLASS: Int = 67

public const val IPV6_AUTOFLOWLABEL: Int = 70

public const val IPV6_ADDR_PREFERENCES: Int = 72

public const val IPV6_MINHOPCOUNT: Int = 73

public const val IPV6_ORIGDSTADDR: Int = 74

public const val IPV6_RECVORIGDSTADDR: Int = IPV6_ORIGDSTADDR

public const val IPV6_TRANSPARENT: Int = 75

public const val IPV6_UNICAST_IF: Int = 76

public const val IPV6_PREFER_SRC_TMP: Int = 0x0001

public const val IPV6_PREFER_SRC_PUBLIC: Int = 0x0002

public const val IPV6_PREFER_SRC_PUBTMP_DEFAULT: Int = 0x0100

public const val IPV6_PREFER_SRC_COA: Int = 0x0004

public const val IPV6_PREFER_SRC_HOME: Int = 0x0400

public const val IPV6_PREFER_SRC_CGA: Int = 0x0008

public const val IPV6_PREFER_SRC_NONCGA: Int = 0x0800

public const val IPV6_PMTUDISC_DONT: Int = 0

public const val IPV6_PMTUDISC_WANT: Int = 1

public const val IPV6_PMTUDISC_DO: Int = 2

public const val IPV6_PMTUDISC_PROBE: Int = 3

public const val IPV6_PMTUDISC_INTERFACE: Int = 4

public const val IPV6_PMTUDISC_OMIT: Int = 5

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

public const val TCP_MD5SIG: Int = 14

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

public const val TCP_NOTSENT_LOWAT: Int = 25

public const val TCP_CC_INFO: Int = 26

public const val TCP_SAVE_SYN: Int = 27

public const val TCP_SAVED_SYN: Int = 28

public const val TCP_REPAIR_WINDOW: Int = 29

public const val TCP_FASTOPEN_CONNECT: Int = 30

public const val TCP_ULP: Int = 31

public const val TCP_MD5SIG_EXT: Int = 32

public const val TCP_FASTOPEN_KEY: Int = 33

public const val TCP_FASTOPEN_NO_COOKIE: Int = 34

public const val TCP_ZEROCOPY_RECEIVE: Int = 35

public const val TCP_INQ: Int = 36

public const val TCP_CM_INQ: Int = TCP_INQ

public const val TCP_TX_DELAY: Int = 37

public const val TCP_MD5SIG_MAXKEYLEN: ULong = 80uL

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

public const val NAME_MAX: Int = 255

public const val PATH_MAX: Int = 4096

public const val UIO_MAXIOV: Int = 1024

public const val FD_SETSIZE: ULong = 1024uL

public const val EPOLLIN: Int = 0x1

public const val EPOLLPRI: Int = 0x2

public const val EPOLLOUT: Int = 0x4

public const val EPOLLERR: Int = 0x8

public const val EPOLLHUP: Int = 0x10

public const val EPOLLRDNORM: Int = 0x40

public const val EPOLLRDBAND: Int = 0x80

public const val EPOLLWRNORM: Int = 0x100

public const val EPOLLWRBAND: Int = 0x200

public const val EPOLLMSG: Int = 0x400

public const val EPOLLRDHUP: Int = 0x2000

public const val EPOLLEXCLUSIVE: Int = 0x10000000

public const val EPOLLWAKEUP: Int = 0x20000000

public const val EPOLLONESHOT: Int = 0x40000000

public const val EPOLLET: Int = 0x80000000.toInt()

public const val EPOLL_CTL_ADD: Int = 1

public const val EPOLL_CTL_MOD: Int = 3

public const val EPOLL_CTL_DEL: Int = 2

public const val MNT_FORCE: Int = 0x1

public const val MNT_DETACH: Int = 0x2

public const val MNT_EXPIRE: Int = 0x4

public const val UMOUNT_NOFOLLOW: Int = 0x8

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

public const val NL0: UInt = 0x00000000u

public const val NL1: UInt = 0x00000100u

public const val TAB0: UInt = 0x00000000u

public const val CR0: UInt = 0x00000000u

public const val FF0: UInt = 0x00000000u

public const val BS0: UInt = 0x00000000u

public const val VT0: UInt = 0x00000000u

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

public const val CLONE_NEWCGROUP: Int = 0x02000000

public const val CLONE_NEWUTS: Int = 0x04000000

public const val CLONE_NEWIPC: Int = 0x08000000

public const val CLONE_NEWUSER: Int = 0x10000000

public const val CLONE_NEWPID: Int = 0x20000000

public const val CLONE_NEWNET: Int = 0x40000000

public const val CLONE_IO: Int = 0x80000000.toInt()

public const val WNOHANG: Int = 0x00000001

public const val WUNTRACED: Int = 0x00000002

public const val WSTOPPED: Int = WUNTRACED

public const val WEXITED: Int = 0x00000004

public const val WCONTINUED: Int = 0x00000008

public const val WNOWAIT: Int = 0x01000000

public const val ADDR_NO_RANDOMIZE: Int = 0x0040000

public const val MMAP_PAGE_ZERO: Int = 0x0100000

public const val ADDR_COMPAT_LAYOUT: Int = 0x0200000

public const val READ_IMPLIES_EXEC: Int = 0x0400000

public const val ADDR_LIMIT_32BIT: Int = 0x0800000

public const val SHORT_INODE: Int = 0x1000000

public const val WHOLE_SECONDS: Int = 0x2000000

public const val STICKY_TIMEOUTS: Int = 0x4000000

public const val ADDR_LIMIT_3GB: Int = 0x8000000

public const val PTRACE_O_TRACESYSGOOD: Int = 0x00000001

public const val PTRACE_O_TRACEFORK: Int = 0x00000002

public const val PTRACE_O_TRACEVFORK: Int = 0x00000004

public const val PTRACE_O_TRACECLONE: Int = 0x00000008

public const val PTRACE_O_TRACEEXEC: Int = 0x00000010

public const val PTRACE_O_TRACEVFORKDONE: Int = 0x00000020

public const val PTRACE_O_TRACEEXIT: Int = 0x00000040

public const val PTRACE_O_TRACESECCOMP: Int = 0x00000080

public const val PTRACE_O_SUSPEND_SECCOMP: Int = 0x00200000

public const val PTRACE_O_EXITKILL: Int = 0x00100000

public const val PTRACE_O_MASK: Int = 0x003000ff

public const val PTRACE_EVENT_FORK: Int = 1

public const val PTRACE_EVENT_VFORK: Int = 2

public const val PTRACE_EVENT_CLONE: Int = 3

public const val PTRACE_EVENT_EXEC: Int = 4

public const val PTRACE_EVENT_VFORK_DONE: Int = 5

public const val PTRACE_EVENT_EXIT: Int = 6

public const val PTRACE_EVENT_SECCOMP: Int = 7

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

public const val AT_SYMLINK_FOLLOW: Int = 0x400

public const val AT_NO_AUTOMOUNT: Int = 0x800

public const val AT_EMPTY_PATH: Int = 0x1000

public const val AT_RECURSIVE: Int = 0x8000

public val LOG_CRON: Int = 9 shl 3

public val LOG_AUTHPRIV: Int = 10 shl 3

public val LOG_FTP: Int = 11 shl 3

public const val LOG_PERROR: Int = 0x20

public const val PIPE_BUF: ULong = 4096uL

public const val SI_LOAD_SHIFT: UInt = 16u

public const val SI_USER: Int = 0

public const val SI_KERNEL: Int = 0x80

public const val SI_QUEUE: Int = -1

public const val SI_TIMER: Int = -2

public const val SI_MESGQ: Int = -3

public const val SI_ASYNCIO: Int = -4

public const val SI_SIGIO: Int = -5

public const val SI_TKILL: Int = -6

public const val SI_ASYNCNL: Int = -60

public const val BUS_ADRALN: Int = 1

public const val BUS_ADRERR: Int = 2

public const val BUS_OBJERR: Int = 3

public const val BUS_MCEERR_AR: Int = 4

public const val BUS_MCEERR_AO: Int = 5

public const val TRAP_BRKPT: Int = 1

public const val TRAP_TRACE: Int = 2

public const val TRAP_BRANCH: Int = 3

public const val TRAP_HWBKPT: Int = 4

public const val TRAP_UNK: Int = 5

public const val CLD_EXITED: Int = 1

public const val CLD_KILLED: Int = 2

public const val CLD_DUMPED: Int = 3

public const val CLD_TRAPPED: Int = 4

public const val CLD_STOPPED: Int = 5

public const val CLD_CONTINUED: Int = 6

public const val SIGEV_SIGNAL: Int = 0

public const val SIGEV_NONE: Int = 1

public const val SIGEV_THREAD: Int = 2

public const val P_ALL: Int = 0

public const val P_PID: Int = 1

public const val P_PGID: Int = 2

public const val P_PIDFD: Int = 3

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

public const val POLLRDHUP: Short = 0x2000

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

public val IPOPT_END: UByte = 0.toUByte() or IPOPT_CONTROL

public val IPOPT_NOOP: UByte = 1.toUByte() or IPOPT_CONTROL

public val IPOPT_SEC: UByte = 2.toUByte() or IPOPT_CONTROL or IPOPT_COPY

public val IPOPT_LSRR: UByte = 3.toUByte() or IPOPT_CONTROL or IPOPT_COPY

public val IPOPT_TIMESTAMP: UByte = 4.toUByte() or IPOPT_MEASUREMENT

public val IPOPT_RR: UByte = 7.toUByte() or IPOPT_CONTROL

public val IPOPT_SID: UByte = 8.toUByte() or IPOPT_CONTROL or IPOPT_COPY

public val IPOPT_SSRR: UByte = 9.toUByte() or IPOPT_CONTROL or IPOPT_COPY

public val IPOPT_RA: UByte = 20.toUByte() or IPOPT_CONTROL or IPOPT_COPY

public const val IPVERSION: UByte = 4u

public const val MAXTTL: UByte = 255u

public const val IPDEFTTL: UByte = 64u

public const val IPOPT_OPTVAL: UByte = 0u

public const val IPOPT_OLEN: UByte = 1u

public const val IPOPT_OFFSET: UByte = 2u

public const val IPOPT_MINOFF: UByte = 4u

public const val MAX_IPOPTLEN: UByte = 40u

public val IPOPT_NOP: UByte = IPOPT_NOOP

public val IPOPT_EOL: UByte = IPOPT_END

public val IPOPT_TS: UByte = IPOPT_TIMESTAMP

public const val IPOPT_TS_TSONLY: UByte = 0u

public const val IPOPT_TS_TSANDADDR: UByte = 1u

public const val IPOPT_TS_PRESPEC: UByte = 3u

public const val ARPOP_RREQUEST: UShort = 3u

public const val ARPOP_RREPLY: UShort = 4u

public const val ARPOP_InREQUEST: UShort = 8u

public const val ARPOP_InREPLY: UShort = 9u

public const val ARPOP_NAK: UShort = 10u

public const val ATF_NETMASK: Int = 0x20

public const val ATF_DONTPUB: Int = 0x40

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

public const val IFF_TUN: Int = 0x0001

public const val IFF_TAP: Int = 0x0002

public const val IFF_NAPI: Int = 0x0010

public const val IFF_NAPI_FRAGS: Int = 0x0020

public const val IFF_NO_CARRIER: Int = 0x0040

public const val IFF_NO_PI: Int = 0x1000

public const val TUN_READQ_SIZE: Short = 500

public val TUN_TUN_DEV: Short = IFF_TUN.toShort()

public val TUN_TAP_DEV: Short = IFF_TAP.toShort()

public const val TUN_TYPE_MASK: Short = 0x000f

public const val IFF_ONE_QUEUE: Int = 0x2000

public const val IFF_VNET_HDR: Int = 0x4000

public const val IFF_TUN_EXCL: Int = 0x8000

public const val IFF_MULTI_QUEUE: Int = 0x0100

public const val IFF_ATTACH_QUEUE: Int = 0x0200

public const val IFF_DETACH_QUEUE: Int = 0x0400

public const val IFF_PERSIST: Int = 0x0800

public const val IFF_NOFILTER: Int = 0x1000

public const val TUN_TX_TIMESTAMP: Int = 1

public const val TUN_F_CSUM: UInt = 0x01u

public const val TUN_F_TSO4: UInt = 0x02u

public const val TUN_F_TSO6: UInt = 0x04u

public const val TUN_F_TSO_ECN: UInt = 0x08u

public const val TUN_F_UFO: UInt = 0x10u

public const val TUN_F_USO4: UInt = 0x20u

public const val TUN_F_USO6: UInt = 0x40u

public const val TUN_PKT_STRIP: Int = 0x0001

public const val TUN_FLT_ALLMULTI: Int = 0x0001

public val TUNSETNOCSUM: Int = ioctlCode<Int>(T_TYPE, 200u)

public val TUNSETDEBUG: Int = ioctlCode<Int>(T_TYPE, 201u)

public val TUNSETIFF: Int = ioctlCode<Int>(T_TYPE, 202u)

public val TUNSETPERSIST: Int = ioctlCode<Int>(T_TYPE, 203u)

public val TUNSETOWNER: Int = ioctlCode<Int>(T_TYPE, 204u)

public val TUNSETLINK: Int = ioctlCode<Int>(T_TYPE, 205u)

public val TUNSETGROUP: Int = ioctlCode<Int>(T_TYPE, 206u)

public val TUNGETFEATURES: Int = ioctlCode<Int>(T_TYPE, 207u)

public val TUNSETOFFLOAD: Int = ioctlCode<Int>(T_TYPE, 208u)

public val TUNSETTXFILTER: Int = ioctlCode<Int>(T_TYPE, 209u)

public val TUNGETIFF: Int = ioctlCode<Int>(T_TYPE, 210u)

public val TUNGETSNDBUF: Int = ioctlCode<Int>(T_TYPE, 211u)

public val TUNSETSNDBUF: Int = ioctlCode<Int>(T_TYPE, 212u)

public val TUNATTACHFILTER: Int = ioctlCode<SockFprog>(T_TYPE, 213u)

public val TUNDETACHFILTER: Int = ioctlCode<SockFprog>(T_TYPE, 214u)

public val TUNGETVNETHDRSZ: Int = ioctlCode<Int>(T_TYPE, 215u)

public val TUNSETVNETHDRSZ: Int = ioctlCode<Int>(T_TYPE, 216u)

public val TUNSETQUEUE: Int = ioctlCode<Int>(T_TYPE, 217u)

public val TUNSETIFINDEX: Int = ioctlCode<Int>(T_TYPE, 218u)

public val TUNGETFILTER: Int = ioctlCode<SockFprog>(T_TYPE, 219u)

public val TUNSETVNETLE: Int = ioctlCode<Int>(T_TYPE, 220u)

public val TUNGETVNETLE: Int = ioctlCode<Int>(T_TYPE, 221u)

public val TUNSETVNETBE: Int = ioctlCode<Int>(T_TYPE, 222u)

public val TUNGETVNETBE: Int = ioctlCode<Int>(T_TYPE, 223u)

public val TUNSETSTEERINGEBPF: Int = ioctlCode<Int>(T_TYPE, 224u)

public val TUNSETFILTEREBPF: Int = ioctlCode<Int>(T_TYPE, 225u)

public val TUNSETCARRIER: Int = ioctlCode<Int>(T_TYPE, 226u)

public val TUNGETDEVNETNS: Int = ioctlCode<Int>(T_TYPE, 227u)

internal const val F_TYPE: UInt = 0x66u

internal const val V_TYPE: UInt = 0x76u

public val FS_IOC_GETFLAGS: Int = ioctlCode<Long>(F_TYPE, 1u)

public val FS_IOC_SETFLAGS: Int = ioctlCode<Long>(F_TYPE, 2u)

public val FS_IOC_GETVERSION: Int = ioctlCode<Long>(V_TYPE, 1u)

public val FS_IOC_SETVERSION: Int = ioctlCode<Long>(V_TYPE, 2u)

public val FS_IOC32_GETFLAGS: Int = ioctlCode<Int>(F_TYPE, 1u)

public val FS_IOC32_SETFLAGS: Int = ioctlCode<Int>(F_TYPE, 2u)

public val FS_IOC32_GETVERSION: Int = ioctlCode<Int>(V_TYPE, 1u)

public val FS_IOC32_SETVERSION: Int = ioctlCode<Int>(V_TYPE, 2u)

public val FICLONE: Int = ioctlCode<Int>(0x94u, 9u)

public val FICLONERANGE: Int = ioctlCode<FileCloneRange>(0x94u, 13u)

public const val ADFS_SUPER_MAGIC: Long = 0x0000adf5

public const val AFFS_SUPER_MAGIC: Long = 0x0000adff

public const val AFS_SUPER_MAGIC: Long = 0x5346414f

public const val AUTOFS_SUPER_MAGIC: Long = 0x0187

public const val BPF_FS_MAGIC: Long = 0xcafe4a11

public const val BTRFS_SUPER_MAGIC: Long = 0x9123683e

public const val CGROUP2_SUPER_MAGIC: Long = 0x63677270

public const val CGROUP_SUPER_MAGIC: Long = 0x27e0eb

public const val CODA_SUPER_MAGIC: Long = 0x73757245

public const val CRAMFS_MAGIC: Long = 0x28cd3d45

public const val DEBUGFS_MAGIC: Long = 0x64626720

public const val DEVPTS_SUPER_MAGIC: Long = 0x1cd1

public const val ECRYPTFS_SUPER_MAGIC: Long = 0xf15f

public const val EFS_SUPER_MAGIC: Long = 0x00414a53

public const val EXT2_SUPER_MAGIC: Long = 0x0000ef53

public const val EXT3_SUPER_MAGIC: Long = 0x0000ef53

public const val EXT4_SUPER_MAGIC: Long = 0x0000ef53

public const val F2FS_SUPER_MAGIC: Long = 0xf2f52010

public const val FUSE_SUPER_MAGIC: Long = 0x65735546

public const val FUTEXFS_SUPER_MAGIC: Long = 0xbad1dea

public const val HOSTFS_SUPER_MAGIC: Long = 0x00c0ffee

public const val HPFS_SUPER_MAGIC: Long = 0xf995e849

public const val HUGETLBFS_MAGIC: Long = 0x958458f6

public const val ISOFS_SUPER_MAGIC: Long = 0x00009660

public const val JFFS2_SUPER_MAGIC: Long = 0x000072b6

public const val MINIX2_SUPER_MAGIC2: Long = 0x00002478

public const val MINIX2_SUPER_MAGIC: Long = 0x00002468

public const val MINIX3_SUPER_MAGIC: Long = 0x4d5a

public const val MINIX_SUPER_MAGIC2: Long = 0x0000138f

public const val MINIX_SUPER_MAGIC: Long = 0x0000137f

public const val MSDOS_SUPER_MAGIC: Long = 0x00004d44

public const val NCP_SUPER_MAGIC: Long = 0x0000564c

public const val NFS_SUPER_MAGIC: Long = 0x00006969

public const val NILFS_SUPER_MAGIC: Long = 0x3434

public const val OCFS2_SUPER_MAGIC: Long = 0x7461636f

public const val OPENPROM_SUPER_MAGIC: Long = 0x00009fa1

public const val OVERLAYFS_SUPER_MAGIC: Long = 0x794c7630

public const val PROC_SUPER_MAGIC: Long = 0x00009fa0

public const val QNX4_SUPER_MAGIC: Long = 0x0000002f

public const val QNX6_SUPER_MAGIC: Long = 0x68191122

public const val RDTGROUP_SUPER_MAGIC: Long = 0x7655821

public const val REISERFS_SUPER_MAGIC: Long = 0x52654973

public const val SECURITYFS_MAGIC: Long = 0x73636673

public const val SELINUX_MAGIC: Long = 0xf97cff8c

public const val SMACK_MAGIC: Long = 0x43415d53

public const val SMB_SUPER_MAGIC: Long = 0x0000517b

public const val SYSFS_MAGIC: Long = 0x62656572

public const val TMPFS_MAGIC: Long = 0x01021994

public const val TRACEFS_MAGIC: Long = 0x74726163

public const val UDF_SUPER_MAGIC: Long = 0x15013346

public const val USBDEVICE_SUPER_MAGIC: Long = 0x00009fa2

public const val XENFS_SUPER_MAGIC: Long = 0xabba1974

public const val NSFS_MAGIC: Long = 0x6e736673

public const val AT_STATX_SYNC_TYPE: Int = 0x6000

public const val AT_STATX_SYNC_AS_STAT: Int = 0x0000

public const val AT_STATX_FORCE_SYNC: Int = 0x2000

public const val AT_STATX_DONT_SYNC: Int = 0x4000

public const val STATX_TYPE: UInt = 0x0001u

public const val STATX_MODE: UInt = 0x0002u

public const val STATX_NLINK: UInt = 0x0004u

public const val STATX_UID: UInt = 0x0008u

public const val STATX_GID: UInt = 0x0010u

public const val STATX_ATIME: UInt = 0x0020u

public const val STATX_MTIME: UInt = 0x0040u

public const val STATX_CTIME: UInt = 0x0080u

public const val STATX_INO: UInt = 0x0100u

public const val STATX_SIZE: UInt = 0x0200u

public const val STATX_BLOCKS: UInt = 0x0400u

public const val STATX_BASIC_STATS: UInt = 0x07ffu

public const val STATX_BTIME: UInt = 0x0800u

public const val STATX_ALL: UInt = 0x0fffu

public const val STATX_MNT_ID: UInt = 0x1000u

public const val STATX_DIOALIGN: UInt = 0x2000u

public const val STATX__RESERVED: Int = 0x80000000.toInt()

public const val STATX_ATTR_COMPRESSED: Int = 0x0004

public const val STATX_ATTR_IMMUTABLE: Int = 0x0010

public const val STATX_ATTR_APPEND: Int = 0x0020

public const val STATX_ATTR_NODUMP: Int = 0x0040

public const val STATX_ATTR_ENCRYPTED: Int = 0x0800

public const val STATX_ATTR_AUTOMOUNT: Int = 0x1000

public const val STATX_ATTR_MOUNT_ROOT: Int = 0x2000

public const val STATX_ATTR_VERITY: Int = 0x100000

public const val STATX_ATTR_DAX: Int = 0x200000
