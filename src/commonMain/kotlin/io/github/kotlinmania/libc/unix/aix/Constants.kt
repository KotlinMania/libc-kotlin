package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public const val RTLD_LAZY: Int = 0x4

public const val RTLD_NOW: Int = 0x2

public const val RTLD_GLOBAL: Int = 0x10000

public const val RTLD_LOCAL: Int = 0x80000

public const val RTLD_MEMBER: Int = 0x40000

public const val RTLD_NOAUTODEFER: Int = 0x20000

public const val O_RDONLY: Int = 0x0

public const val O_WRONLY: Int = 0x1

public const val O_RDWR: Int = 0x2

public const val O_NDELAY: Int = 0x8000

public const val O_APPEND: Int = 0x8

public const val O_DSYNC: Int = 0x400000

public const val O_CREAT: Int = 0x100

public const val O_EXCL: Int = 0x400

public const val O_NOCTTY: Int = 0x800

public const val O_TRUNC: Int = 0x200

public const val O_NOFOLLOW: Int = 0x1000000

public const val O_DIRECTORY: Int = 0x80000

public const val O_SEARCH: Int = 0x20

public const val O_EXEC: Int = 0x20

public const val O_CLOEXEC: Int = 0x800000

public val O_ACCMODE: Int = O_RDONLY or O_WRONLY or O_RDWR or O_EXEC or O_SEARCH

public const val O_DIRECT: Int = 0x8000000

public const val O_TTY_INIT: Int = 0

public const val O_RSYNC: Int = 0x200000

public const val O_LARGEFILE: Int = 0x4000000

public const val F_DUPFD: Int = 0

public const val F_DUPFD_CLOEXEC: Int = 16

public const val F_GETFD: Int = 1

public const val F_SETFD: Int = 2

public const val F_GETFL: Int = 3

public const val F_SETFL: Int = 4

public val F_GETLK: Int = F_GETLK64

public val F_SETLK: Int = F_SETLK64

public val F_SETLKW: Int = F_SETLKW64

public const val F_GETOWN: Int = 8

public const val F_SETOWN: Int = 9

public const val F_CLOSEM: Int = 10

public const val F_GETLK64: Int = 11

public const val F_SETLK64: Int = 12

public const val F_SETLKW64: Int = 13

public const val F_DUP2FD: Int = 14

public const val F_TSTLK: Int = 15

public const val AT_FDCWD: Int = -2

public const val AT_SYMLINK_NOFOLLOW: Int = 1

public const val AT_SYMLINK_FOLLOW: Int = 2

public const val AT_REMOVEDIR: Int = 1

public const val AT_EACCESS: Int = 1

public const val O_SYNC: Int = 16

public const val O_NONBLOCK: Int = 4

public const val FASYNC: Int = 0x20000

public const val POSIX_FADV_NORMAL: Int = 1

public const val POSIX_FADV_SEQUENTIAL: Int = 2

public const val POSIX_FADV_RANDOM: Int = 3

public const val POSIX_FADV_WILLNEED: Int = 4

public const val POSIX_FADV_DONTNEED: Int = 5

public const val POSIX_FADV_NOREUSE: Int = 6

public const val GLOB_APPEND: Int = 0x1

public const val GLOB_DOOFFS: Int = 0x2

public const val GLOB_ERR: Int = 0x4

public const val GLOB_MARK: Int = 0x8

public const val GLOB_NOCHECK: Int = 0x10

public const val GLOB_NOSORT: Int = 0x20

public const val GLOB_NOESCAPE: Int = 0x80

public const val GLOB_NOSPACE: Int = 0x2000

public const val GLOB_ABORTED: Int = 0x1000

public const val GLOB_NOMATCH: Int = 0x4000

public const val GLOB_NOSYS: Int = 0x8000

public const val DAY_1: Int = 13

public const val DAY_2: Int = 14

public const val DAY_3: Int = 15

public const val DAY_4: Int = 16

public const val DAY_5: Int = 17

public const val DAY_6: Int = 18

public const val DAY_7: Int = 19

public const val ABDAY_1: Int = 6

public const val ABDAY_2: Int = 7

public const val ABDAY_3: Int = 8

public const val ABDAY_4: Int = 9

public const val ABDAY_5: Int = 10

public const val ABDAY_6: Int = 11

public const val ABDAY_7: Int = 12

public const val MON_1: Int = 32

public const val MON_2: Int = 33

public const val MON_3: Int = 34

public const val MON_4: Int = 35

public const val MON_5: Int = 36

public const val MON_6: Int = 37

public const val MON_7: Int = 38

public const val MON_8: Int = 39

public const val MON_9: Int = 40

public const val MON_10: Int = 41

public const val MON_11: Int = 42

public const val MON_12: Int = 43

public const val ABMON_1: Int = 20

public const val ABMON_2: Int = 21

public const val ABMON_3: Int = 22

public const val ABMON_4: Int = 23

public const val ABMON_5: Int = 24

public const val ABMON_6: Int = 25

public const val ABMON_7: Int = 26

public const val ABMON_8: Int = 27

public const val ABMON_9: Int = 28

public const val ABMON_10: Int = 29

public const val ABMON_11: Int = 30

public const val ABMON_12: Int = 31

public const val RADIXCHAR: Int = 44

public const val THOUSEP: Int = 45

public const val YESSTR: Int = 46

public const val NOSTR: Int = 47

public const val CRNCYSTR: Int = 48

public const val D_T_FMT: Int = 1

public const val D_FMT: Int = 2

public const val T_FMT: Int = 3

public const val AM_STR: Int = 4

public const val PM_STR: Int = 5

public const val CODESET: Int = 49

public const val T_FMT_AMPM: Int = 55

public const val ERA: Int = 56

public const val ERA_D_FMT: Int = 57

public const val ERA_D_T_FMT: Int = 58

public const val ERA_T_FMT: Int = 59

public const val ALT_DIGITS: Int = 60

public const val YESEXPR: Int = 61

public const val NOEXPR: Int = 62

public val LC_GLOBAL_LOCALE: io.github.kotlinmania.libc.COpaquePointer? = io.github.kotlinmania.libc.COpaquePointer(-1L)

public const val LC_COLLATE: Int = 0

public const val LC_CTYPE: Int = 1

public const val LC_MONETARY: Int = 2

public const val LC_NUMERIC: Int = 3

public const val LC_TIME: Int = 4

public const val LC_MESSAGES: Int = 5

public const val LC_ALL: Int = -1

public const val LC_COLLATE_MASK: Int = 1

public const val LC_CTYPE_MASK: Int = 2

public const val LC_MESSAGES_MASK: Int = 4

public const val LC_MONETARY_MASK: Int = 8

public const val LC_NUMERIC_MASK: Int = 16

public const val LC_TIME_MASK: Int = 32

public val LC_ALL_MASK: Int = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK

public const val NI_MAXHOST: UInt = 1025u

public const val NI_MAXSERV: UInt = 32u

public const val NI_NOFQDN: UInt = 0x1u

public const val NI_NUMERICHOST: UInt = 0x2u

public const val NI_NAMEREQD: UInt = 0x4u

public const val NI_NUMERICSERV: UInt = 0x8u

public const val NI_DGRAM: UInt = 0x10u

public const val NI_NUMERICSCOPE: UInt = 0x40u

public const val EAI_AGAIN: Int = 2

public const val EAI_BADFLAGS: Int = 3

public const val EAI_FAIL: Int = 4

public const val EAI_FAMILY: Int = 5

public const val EAI_MEMORY: Int = 6

public const val EAI_NODATA: Int = 7

public const val EAI_NONAME: Int = 8

public const val EAI_SERVICE: Int = 9

public const val EAI_SOCKTYPE: Int = 10

public const val EAI_SYSTEM: Int = 11

public const val EAI_OVERFLOW: Int = 13

public const val AI_CANONNAME: Int = 0x01

public const val AI_PASSIVE: Int = 0x02

public const val AI_NUMERICHOST: Int = 0x04

public const val AI_ADDRCONFIG: Int = 0x08

public const val AI_V4MAPPED: Int = 0x10

public const val AI_ALL: Int = 0x20

public const val AI_NUMERICSERV: Int = 0x40

public const val AI_EXTFLAGS: Int = 0x80

public val AI_DEFAULT: Int = AI_V4MAPPED or AI_ADDRCONFIG

public const val IPV6_ADDRFORM: Int = 22

public const val IPV6_ADDR_PREFERENCES: Int = 74

public const val IPV6_CHECKSUM: Int = 39

public const val IPV6_DONTFRAG: Int = 45

public const val IPV6_DSTOPTS: Int = 54

public const val IPV6_FLOWINFO_FLOWLABEL: Int = 0x00ffffff

public const val IPV6_FLOWINFO_PRIORITY: Int = 0x0f000000

public const val IPV6_FLOWINFO_PRIFLOW: Int = 0x0fffffff

public const val IPV6_FLOWINFO_SRFLAG: Int = 0x10000000

public const val IPV6_FLOWINFO_VERSION: Int = 0xf0000000.toInt()

public const val IPV6_HOPLIMIT: Int = 40

public const val IPV6_HOPOPTS: Int = 52

public const val IPV6_NEXTHOP: Int = 48

public const val IPV6_PATHMTU: Int = 46

public const val IPV6_PKTINFO: Int = 33

public const val IPV6_PREFER_SRC_CGA: Int = 16

public const val IPV6_PREFER_SRC_COA: Int = 2

public const val IPV6_PREFER_SRC_HOME: Int = 1

public const val IPV6_PREFER_SRC_NONCGA: Int = 32

public const val IPV6_PREFER_SRC_PUBLIC: Int = 4

public const val IPV6_PREFER_SRC_TMP: Int = 8

public const val IPV6_RECVDSTOPTS: Int = 56

public const val IPV6_RECVHOPLIMIT: Int = 41

public const val IPV6_RECVHOPOPTS: Int = 53

public const val IPV6_RECVPATHMTU: Int = 47

public const val IPV6_RECVRTHDR: Int = 51

public const val IPV6_RECVTCLASS: Int = 42

public const val IPV6_RTHDR: Int = 50

public const val IPV6_RTHDRDSTOPTS: Int = 55

public const val IPV6_TCLASS: Int = 43

public const val DLT_NULL: Int = 0x18

public const val DLT_EN10MB: Int = 0x6

public const val DLT_EN3MB: Int = 0x1a

public const val DLT_AX25: Int = 0x5

public const val DLT_PRONET: Int = 0xd

public const val DLT_IEEE802: Int = 0x7

public const val DLT_ARCNET: Int = 0x23

public const val DLT_SLIP: Int = 0x1c

public const val DLT_PPP: Int = 0x17

public const val DLT_FDDI: Int = 0xf

public const val DLT_ATM: Int = 0x25

public const val DLT_IPOIB: Int = 0xc7

public const val BIOCSETF: Int = 0x80104267.toInt()

public const val BIOCGRTIMEOUT: Int = 0x4010426e

public const val BIOCGBLEN: Int = 0x40044266

public const val BIOCSBLEN: Int = 0xc0044266.toInt()

public const val BIOCFLUSH: Int = 0x20004268

public const val BIOCPROMISC: Int = 0x20004269

public const val BIOCGDLT: Int = 0x4004426a

public const val BIOCSRTIMEOUT: Int = 0x8010426d.toInt()

public const val BIOCGSTATS: Int = 0x4008426f

public const val BIOCIMMEDIATE: Int = 0x80044270.toInt()

public const val BIOCVERSION: Int = 0x40044271

public const val BIOCSDEVNO: Int = 0x20004272

public const val BIOCGETIF: Int = 0x4020426b

public const val BIOCSETIF: Int = 0x8020426c.toInt()

public const val BPF_ABS: Int = 32

public const val BPF_ADD: Int = 0

public const val BPF_ALIGNMENT: ULong = 4uL

public const val BPF_ALU: Int = 4

public const val BPF_AND: Int = 80

public const val BPF_B: Int = 16

public const val BPF_DIV: Int = 48

public const val BPF_H: Int = 8

public const val BPF_IMM: Int = 0

public const val BPF_IND: Int = 64

public const val BPF_JA: Int = 0

public const val BPF_JEQ: Int = 16

public const val BPF_JGE: Int = 48

public const val BPF_JGT: Int = 32

public const val BPF_JMP: Int = 5

public const val BPF_JSET: Int = 64

public const val BPF_K: Int = 0

public const val BPF_LD: Int = 0

public const val BPF_LDX: Int = 1

public const val BPF_LEN: Int = 128

public const val BPF_LSH: Int = 96

public const val BPF_MAXINSNS: Int = 512

public const val BPF_MEM: Int = 96

public const val BPF_MEMWORDS: Int = 16

public const val BPF_MISC: Int = 7

public const val BPF_MSH: Int = 160

public const val BPF_MUL: Int = 32

public const val BPF_NEG: Int = 128

public const val BPF_OR: Int = 64

public const val BPF_RET: Int = 6

public const val BPF_RSH: Int = 112

public const val BPF_ST: Int = 2

public const val BPF_STX: Int = 3

public const val BPF_SUB: Int = 16

public const val BPF_W: Int = 0

public const val BPF_X: Int = 8

public const val IFNET_SLOWHZ: Int = 1

public const val IFQ_MAXLEN: Int = 50

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

public const val IFF_MULTICAST: Int = 0x80000

public const val IFF_LINK0: Int = 0x100000

public const val IFF_LINK1: Int = 0x200000

public const val IFF_LINK2: Int = 0x400000

public const val IFF_OACTIVE: Int = 0x400

public const val IFF_SIMPLEX: Int = 0x800

public const val ARPHRD_ETHER: Int = 1

public const val ARPHRD_802_5: Int = 6

public const val ARPHRD_802_3: Int = 6

public const val ARPHRD_FDDI: Int = 1

public const val RTM_ADD: Int = 0x1

public const val RTM_DELETE: Int = 0x2

public const val RTM_CHANGE: Int = 0x3

public const val RTM_GET: Int = 0x4

public const val RTM_LOSING: Int = 0x5

public const val RTM_REDIRECT: Int = 0x6

public const val RTM_MISS: Int = 0x7

public const val RTM_LOCK: Int = 0x8

public const val RTM_OLDADD: Int = 0x9

public const val RTM_OLDDEL: Int = 0xa

public const val RTM_RESOLVE: Int = 0xb

public const val RTM_NEWADDR: Int = 0xc

public const val RTM_DELADDR: Int = 0xd

public const val RTM_IFINFO: Int = 0xe

public const val RTM_EXPIRE: Int = 0xf

public const val RTM_RTLOST: Int = 0x10

public const val RTM_GETNEXT: Int = 0x11

public const val RTM_SAMEADDR: Int = 0x12

public const val RTM_SET: Int = 0x13

public const val RTV_MTU: Int = 0x1

public const val RTV_HOPCOUNT: Int = 0x2

public const val RTV_EXPIRE: Int = 0x4

public const val RTV_RPIPE: Int = 0x8

public const val RTV_SPIPE: Int = 0x10

public const val RTV_SSTHRESH: Int = 0x20

public const val RTV_RTT: Int = 0x40

public const val RTV_RTTVAR: Int = 0x80

public const val RTA_DST: Int = 0x1

public const val RTA_GATEWAY: Int = 0x2

public const val RTA_NETMASK: Int = 0x4

public const val RTA_GENMASK: Int = 0x8

public const val RTA_IFP: Int = 0x10

public const val RTA_IFA: Int = 0x20

public const val RTA_AUTHOR: Int = 0x40

public const val RTA_BRD: Int = 0x80

public const val RTA_DOWNSTREAM: Int = 0x100

public const val RTAX_DST: Int = 0

public const val RTAX_GATEWAY: Int = 1

public const val RTAX_NETMASK: Int = 2

public const val RTAX_GENMASK: Int = 3

public const val RTAX_IFP: Int = 4

public const val RTAX_IFA: Int = 5

public const val RTAX_AUTHOR: Int = 6

public const val RTAX_BRD: Int = 7

public const val RTAX_MAX: Int = 8

public const val RTF_UP: Int = 0x1

public const val RTF_GATEWAY: Int = 0x2

public const val RTF_HOST: Int = 0x4

public const val RTF_REJECT: Int = 0x8

public const val RTF_DYNAMIC: Int = 0x10

public const val RTF_MODIFIED: Int = 0x20

public const val RTF_DONE: Int = 0x40

public const val RTF_MASK: Int = 0x80

public const val RTF_CLONING: Int = 0x100

public const val RTF_XRESOLVE: Int = 0x200

public const val RTF_LLINFO: Int = 0x400

public const val RTF_STATIC: Int = 0x800

public const val RTF_BLACKHOLE: Int = 0x1000

public const val RTF_BUL: Int = 0x2000

public const val RTF_PROTO2: Int = 0x4000

public const val RTF_PROTO1: Int = 0x8000

public const val RTF_CLONE: Int = 0x10000

public const val RTF_CLONED: Int = 0x20000

public const val RTF_PROTO3: Int = 0x40000

public const val RTF_BCE: Int = 0x80000

public const val RTF_PINNED: Int = 0x100000

public const val RTF_LOCAL: Int = 0x200000

public const val RTF_BROADCAST: Int = 0x400000

public const val RTF_MULTICAST: Int = 0x800000

public const val RTF_ACTIVE_DGD: Int = 0x1000000

public const val RTF_STOPSRCH: Int = 0x2000000

public const val RTF_FREE_IN_PROG: Int = 0x4000000

public const val RTF_PERMANENT6: Int = 0x8000000

public const val RTF_UNREACHABLE: Int = 0x10000000

public const val RTF_CACHED: Int = 0x20000000

public const val RTF_SMALLMTU: Int = 0x40000

public const val IPPROTO_HOPOPTS: Int = 0

public const val IPPROTO_IGMP: Int = 2

public const val IPPROTO_GGP: Int = 3

public const val IPPROTO_IPIP: Int = 4

public const val IPPROTO_EGP: Int = 8

public const val IPPROTO_PUP: Int = 12

public const val IPPROTO_IDP: Int = 22

public const val IPPROTO_TP: Int = 29

public const val IPPROTO_ROUTING: Int = 43

public const val IPPROTO_FRAGMENT: Int = 44

public const val IPPROTO_QOS: Int = 45

public const val IPPROTO_RSVP: Int = 46

public const val IPPROTO_GRE: Int = 47

public const val IPPROTO_ESP: Int = 50

public const val IPPROTO_AH: Int = 51

public const val IPPROTO_NONE: Int = 59

public const val IPPROTO_DSTOPTS: Int = 60

public const val IPPROTO_LOCAL: Int = 63

public const val IPPROTO_EON: Int = 80

public const val IPPROTO_BIP: Int = 0x53

public const val IPPROTO_SCTP: Int = 132

public const val IPPROTO_MH: Int = 135

public const val IPPROTO_GIF: Int = 140

public const val IPPROTO_RAW: Int = 255

public const val IP_OPTIONS: Int = 1

public const val IP_HDRINCL: Int = 2

public const val IP_TOS: Int = 3

public const val IP_TTL: Int = 4

public const val IP_UNICAST_HOPS: Int = 4

public const val IP_RECVOPTS: Int = 5

public const val IP_RECVRETOPTS: Int = 6

public const val IP_RECVDSTADDR: Int = 7

public const val IP_RETOPTS: Int = 8

public const val IP_MULTICAST_IF: Int = 9

public const val IP_MULTICAST_TTL: Int = 10

public const val IP_MULTICAST_HOPS: Int = 10

public const val IP_MULTICAST_LOOP: Int = 11

public const val IP_ADD_MEMBERSHIP: Int = 12

public const val IP_DROP_MEMBERSHIP: Int = 13

public const val IP_RECVMACHDR: Int = 14

public const val IP_RECVIFINFO: Int = 15

public const val IP_BROADCAST_IF: Int = 16

public const val IP_DHCPMODE: Int = 17

public const val IP_RECVIF: Int = 20

public const val IP_ADDRFORM: Int = 22

public const val IP_DONTFRAG: Int = 25

public const val IP_FINDPMTU: Int = 26

public const val IP_PMTUAGE: Int = 27

public const val IP_RECVINTERFACE: Int = 32

public const val IP_RECVTTL: Int = 34

public const val IP_BLOCK_SOURCE: Int = 58

public const val IP_UNBLOCK_SOURCE: Int = 59

public const val IP_ADD_SOURCE_MEMBERSHIP: Int = 60

public const val IP_DROP_SOURCE_MEMBERSHIP: Int = 61

public const val IP_DEFAULT_MULTICAST_TTL: Int = 1

public const val IP_DEFAULT_MULTICAST_LOOP: Int = 1

public const val IP_INC_MEMBERSHIPS: Int = 20

public const val IP_INIT_MEMBERSHIP: Int = 20

public const val IPV6_UNICAST_HOPS: Int = IP_TTL

public const val IPV6_MULTICAST_IF: Int = IP_MULTICAST_IF

public const val IPV6_MULTICAST_HOPS: Int = IP_MULTICAST_TTL

public const val IPV6_MULTICAST_LOOP: Int = IP_MULTICAST_LOOP

public const val IPV6_RECVPKTINFO: Int = 35

public const val IPV6_V6ONLY: Int = 37

public const val IPV6_ADD_MEMBERSHIP: Int = IP_ADD_MEMBERSHIP

public const val IPV6_DROP_MEMBERSHIP: Int = IP_DROP_MEMBERSHIP

public const val IPV6_JOIN_GROUP: Int = IP_ADD_MEMBERSHIP

public const val IPV6_LEAVE_GROUP: Int = IP_DROP_MEMBERSHIP

public const val MCAST_BLOCK_SOURCE: Int = 64

public const val MCAST_EXCLUDE: Int = 2

public const val MCAST_INCLUDE: Int = 1

public const val MCAST_JOIN_GROUP: Int = 62

public const val MCAST_JOIN_SOURCE_GROUP: Int = 66

public const val MCAST_LEAVE_GROUP: Int = 63

public const val MCAST_LEAVE_SOURCE_GROUP: Int = 67

public const val MCAST_UNBLOCK_SOURCE: Int = 65

public const val MAXTTL: Int = 255

public const val IPDEFTTL: Int = 64

public const val IPOPT_CONTROL: Int = 0

public const val IPOPT_EOL: Int = 0

public const val IPOPT_LSRR: Int = 131

public const val IPOPT_MINOFF: Int = 4

public const val IPOPT_NOP: Int = 1

public const val IPOPT_OFFSET: Int = 2

public const val IPOPT_OLEN: Int = 1

public const val IPOPT_OPTVAL: Int = 0

public const val IPOPT_RESERVED1: Int = 0x20

public const val IPOPT_RESERVED2: Int = 0x60

public const val IPOPT_RR: Int = 7

public const val IPOPT_SSRR: Int = 137

public const val IPOPT_TS: Int = 68

public const val IPOPT_TS_PRESPEC: Int = 3

public const val IPOPT_TS_TSANDADDR: Int = 1

public const val IPOPT_TS_TSONLY: Int = 0

public const val IPTOS_LOWDELAY: Int = 16

public const val IPTOS_PREC_CRITIC_ECP: Int = 160

public const val IPTOS_PREC_FLASH: Int = 96

public const val IPTOS_PREC_FLASHOVERRIDE: Int = 128

public const val IPTOS_PREC_IMMEDIATE: Int = 64

public const val IPTOS_PREC_INTERNETCONTROL: Int = 192

public const val IPTOS_PREC_NETCONTROL: Int = 224

public const val IPTOS_PREC_PRIORITY: Int = 32

public const val IPTOS_PREC_ROUTINE: Int = 16

public const val IPTOS_RELIABILITY: Int = 4

public const val IPTOS_THROUGHPUT: Int = 8

public const val IPVERSION: Int = 4

public const val TCP_NODELAY: Int = 0x1

public const val TCP_MAXSEG: Int = 0x2

public const val TCP_RFC1323: Int = 0x4

public const val TCP_KEEPALIVE: Int = 0x8

public const val TCP_KEEPIDLE: Int = 0x11

public const val TCP_KEEPINTVL: Int = 0x12

public const val TCP_KEEPCNT: Int = 0x13

public const val TCP_NODELAYACK: Int = 0x14

public const val PTHREAD_BARRIER_SERIAL_THREAD: Int = 2

public const val PTHREAD_CREATE_JOINABLE: Int = 0

public const val PTHREAD_CREATE_DETACHED: Int = 1

public const val PTHREAD_PROCESS_SHARED: Int = 0

public val PTHREAD_PROCESS_PRIVATE: UShort = (1).toUShort()

public val PTHREAD_STACK_MIN: ULong = PAGESIZE.toULong() * 4u

public const val PTHREAD_MUTEX_NORMAL: Int = 5

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 3

public const val PTHREAD_MUTEX_RECURSIVE: Int = 4

public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL

public const val PTHREAD_MUTEX_ROBUST: Int = 1

public const val PTHREAD_MUTEX_STALLED: Int = 0

public const val PTHREAD_PRIO_INHERIT: Int = 3

public const val PTHREAD_PRIO_NONE: Int = 1

public const val PTHREAD_PRIO_PROTECT: Int = 2

public const val REG_EXTENDED: Int = 1

public const val REG_ICASE: Int = 2

public const val REG_NEWLINE: Int = 4

public const val REG_NOSUB: Int = 8

public const val REG_NOTBOL: Int = 0x100

public const val REG_NOTEOL: Int = 0x200

public const val REG_NOMATCH: Int = 1

public const val REG_BADPAT: Int = 2

public const val REG_ECOLLATE: Int = 3

public const val REG_ECTYPE: Int = 4

public const val REG_EESCAPE: Int = 5

public const val REG_ESUBREG: Int = 6

public const val REG_EBRACK: Int = 7

public const val REG_EPAREN: Int = 8

public const val REG_EBRACE: Int = 9

public const val REG_BADBR: Int = 10

public const val REG_ERANGE: Int = 11

public const val REG_ESPACE: Int = 12

public const val REG_BADRPT: Int = 13

public const val REG_ECHAR: Int = 14

public const val REG_EBOL: Int = 15

public const val REG_EEOL: Int = 16

public const val REG_ENOSYS: Int = 17

public const val NFSMNT_SOFT: Int = 0x001

public const val NFSMNT_WSIZE: Int = 0x002

public const val NFSMNT_RSIZE: Int = 0x004

public const val NFSMNT_TIMEO: Int = 0x008

public const val NFSMNT_RETRANS: Int = 0x010

public const val NFSMNT_HOSTNAME: Int = 0x020

public const val NFSMNT_INT: Int = 0x040

public const val NFSMNT_NOAC: Int = 0x080

public const val NFSMNT_ACREGMIN: Int = 0x0100

public const val NFSMNT_ACREGMAX: Int = 0x0200

public const val NFSMNT_ACDIRMIN: Int = 0x0400

public const val NFSMNT_ACDIRMAX: Int = 0x0800

public const val CPUSTATES: Int = 4

public const val POSIX_SPAWN_SETPGROUP: Int = 0x1

public const val POSIX_SPAWN_SETSIGMASK: Int = 0x2

public const val POSIX_SPAWN_SETSIGDEF: Int = 0x4

public const val POSIX_SPAWN_SETSCHEDULER: Int = 0x8

public const val POSIX_SPAWN_SETSCHEDPARAM: Int = 0x10

public const val POSIX_SPAWN_RESETIDS: Int = 0x20

public const val POSIX_SPAWN_FORK_HANDLERS: Int = 0x1000

public const val EOF: Int = -1

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val _IOFBF: Int = 0

public const val _IONBF: Int = 4

public const val _IOLBF: Int = 64

public const val BUFSIZ: UInt = 4096u

public const val FOPEN_MAX: UInt = 32767u

public const val FILENAME_MAX: UInt = 255u

public const val L_tmpnam: UInt = 21u

public const val TMP_MAX: UInt = 16384u

public const val EXIT_FAILURE: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val RAND_MAX: Int = 32767

public const val F_OK: Int = 0

public const val R_OK: Int = 4

public const val W_OK: Int = 2

public const val X_OK: Int = 1

public const val LIO_NOP: Int = 0

public const val LIO_READ: Int = 1

public const val LIO_WRITE: Int = 2

public const val LIO_NOWAIT: Int = 0

public const val LIO_WAIT: Int = 1

public const val AIO_ALLDONE: Int = 2

public const val AIO_CANCELED: Int = 0

public const val AIO_NOTCANCELED: Int = 1

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

public const val ENOMSG: Int = 35

public const val EIDRM: Int = 36

public const val ECHRNG: Int = 37

public const val EL2NSYNC: Int = 38

public const val EL3HLT: Int = 39

public const val EL3RST: Int = 40

public const val ELNRNG: Int = 41

public const val EUNATCH: Int = 42

public const val ENOCSI: Int = 43

public const val EL2HLT: Int = 44

public const val EDEADLK: Int = 45

public const val ENOTREADY: Int = 46

public const val EWRPROTECT: Int = 47

public const val EFORMAT: Int = 48

public const val ENOLCK: Int = 49

public const val ENOCONNECT: Int = 50

public const val ESTALE: Int = 52

public const val EDIST: Int = 53

public const val EWOULDBLOCK: Int = EAGAIN

public const val EINPROGRESS: Int = 55

public const val EALREADY: Int = 56

public const val ENOTSOCK: Int = 57

public const val EDESTADDRREQ: Int = 58

public const val EMSGSIZE: Int = 59

public const val EPROTOTYPE: Int = 60

public const val ENOPROTOOPT: Int = 61

public const val EPROTONOSUPPORT: Int = 62

public const val ESOCKTNOSUPPORT: Int = 63

public const val EOPNOTSUPP: Int = 64

public const val EPFNOSUPPORT: Int = 65

public const val EAFNOSUPPORT: Int = 66

public const val EADDRINUSE: Int = 67

public const val EADDRNOTAVAIL: Int = 68

public const val ENETDOWN: Int = 69

public const val ENETUNREACH: Int = 70

public const val ENETRESET: Int = 71

public const val ECONNABORTED: Int = 72

public const val ECONNRESET: Int = 73

public const val ENOBUFS: Int = 74

public const val EISCONN: Int = 75

public const val ENOTCONN: Int = 76

public const val ESHUTDOWN: Int = 77

public const val ETIMEDOUT: Int = 78

public const val ECONNREFUSED: Int = 79

public const val EHOSTDOWN: Int = 80

public const val EHOSTUNREACH: Int = 81

public const val ERESTART: Int = 82

public const val EPROCLIM: Int = 83

public const val EUSERS: Int = 84

public const val ELOOP: Int = 85

public const val ENAMETOOLONG: Int = 86

public const val ENOTEMPTY: Int = 87

public const val EDQUOT: Int = 88

public const val ECORRUPT: Int = 89

public const val ESYSERROR: Int = 90

public const val EREMOTE: Int = 93

public const val ENOTRECOVERABLE: Int = 94

public const val EOWNERDEAD: Int = 95

public const val ENOSYS: Int = 109

public const val EMEDIA: Int = 110

public const val ESOFT: Int = 111

public const val ENOATTR: Int = 112

public const val ESAD: Int = 113

public const val ENOTRUST: Int = 114

public const val ETOOMANYREFS: Int = 115

public const val EILSEQ: Int = 116

public const val ECANCELED: Int = 117

public const val ENOSR: Int = 118

public const val ETIME: Int = 119

public const val EBADMSG: Int = 120

public const val EPROTO: Int = 121

public const val ENODATA: Int = 122

public const val ENOSTR: Int = 123

public const val ENOTSUP: Int = 124

public const val EMULTIHOP: Int = 125

public const val ENOLINK: Int = 126

public const val EOVERFLOW: Int = 127

public const val LPAR_INFO_FORMAT1: Int = 1

public const val LPAR_INFO_FORMAT2: Int = 2

public const val WPAR_INFO_FORMAT: Int = 3

public const val PROC_MODULE_INFO: Int = 4

public const val NUM_PROC_MODULE_TYPES: Int = 5

public const val LPAR_INFO_VRME_NUM_POOLS: Int = 6

public const val LPAR_INFO_VRME_POOLS: Int = 7

public const val LPAR_INFO_VRME_LPAR: Int = 8

public const val LPAR_INFO_VRME_RESET_HWMARKS: Int = 9

public const val LPAR_INFO_VRME_ALLOW_DESIRED: Int = 10

public const val EMTP_INFO_FORMAT: Int = 11

public const val LPAR_INFO_LPM_CAPABILITY: Int = 12

public const val ENERGYSCALE_INFO: Int = 13

public const val LOCK_SH: Int = 1

public const val LOCK_EX: Int = 2

public const val LOCK_NB: Int = 4

public const val LOCK_UN: Int = 8

public const val F_RDLCK: Short = 1

public const val F_WRLCK: Short = 2

public const val F_UNLCK: Short = 3

public const val Q_QUOTAON: Int = 0x100

public const val Q_QUOTAOFF: Int = 0x200

public const val Q_SETUSE: Int = 0x500

public const val Q_SYNC: Int = 0x600

public const val Q_GETQUOTA: Int = 0x300

public const val Q_SETQLIM: Int = 0x400

public const val Q_SETQUOTA: Int = 0x400

public const val IOCPARM_MASK: Int = 0x7f

public const val IOC_VOID: Int = 0x20000000

public const val IOC_OUT: Int = 0x40000000

public val IOC_IN: Int = 0x40000000 shl 1

public val IOC_INOUT: Int = IOC_IN or IOC_OUT

public const val FIOCLEX: Int = 0x20006601

public const val FIONCLEX: Int = 0x20006602

public const val FIONREAD: Int = 0x4004667f

public const val FIONBIO: Int = 0x8004667e.toInt()

public const val FIOASYNC: Int = 0x8004667d.toInt()

public const val FIOSETOWN: Int = 0x8004667c.toInt()

public const val FIOGETOWN: Int = 0x4004667b

public const val TIOCGETD: Int = 0x40047400

public const val TIOCSETD: Int = 0x80047401.toInt()

public const val TIOCHPCL: Int = 0x20007402

public const val TIOCMODG: Int = 0x40047403

public const val TIOCMODS: Int = 0x80047404.toInt()

public const val TIOCM_LE: Int = 0x1

public const val TIOCM_DTR: Int = 0x2

public const val TIOCM_RTS: Int = 0x4

public const val TIOCM_ST: Int = 0x8

public const val TIOCM_SR: Int = 0x10

public const val TIOCM_CTS: Int = 0x20

public const val TIOCM_CAR: Int = 0x40

public const val TIOCM_CD: Int = 0x40

public const val TIOCM_RNG: Int = 0x80

public const val TIOCM_RI: Int = 0x80

public const val TIOCM_DSR: Int = 0x100

public const val TIOCGETP: Int = 0x40067408

public const val TIOCSETP: Int = 0x80067409.toInt()

public const val TIOCSETN: Int = 0x8006740a.toInt()

public const val TIOCEXCL: Int = 0x2000740d

public const val TIOCNXCL: Int = 0x2000740e

public const val TIOCFLUSH: Int = 0x80047410.toInt()

public const val TIOCSETC: Int = 0x80067411.toInt()

public const val TIOCGETC: Int = 0x40067412

public const val TANDEM: Int = 0x1

public const val CBREAK: Int = 0x2

public const val LCASE: Int = 0x4

public const val MDMBUF: Int = 0x800000

public const val XTABS: Int = 0xc00

public const val SIOCADDMULTI: Int = 0x80206931.toInt()

public const val SIOCADDRT: Int = 0x8038720a.toInt()

public const val SIOCDARP: Int = 0x804c6920.toInt()

public const val SIOCDELMULTI: Int = 0x80206932.toInt()

public const val SIOCDELRT: Int = 0x8038720b.toInt()

public const val SIOCDIFADDR: Int = 0x80286919.toInt()

public const val SIOCGARP: Int = 0xc04c6926.toInt()

public const val SIOCGIFADDR: Int = 0xc0286921.toInt()

public const val SIOCGIFBRDADDR: Int = 0xc0286923.toInt()

public const val SIOCGIFCONF: Int = 0xc0106945.toInt()

public const val SIOCGIFDSTADDR: Int = 0xc0286922.toInt()

public const val SIOCGIFFLAGS: Int = 0xc0286911.toInt()

public const val SIOCGIFHWADDR: Int = 0xc0546995.toInt()

public const val SIOCGIFMETRIC: Int = 0xc0286917.toInt()

public const val SIOCGIFMTU: Int = 0xc0286956.toInt()

public const val SIOCGIFNETMASK: Int = 0xc0286925.toInt()

public const val SIOCSARP: Int = 0x804c691e.toInt()

public const val SIOCSIFADDR: Int = 0x8028690c.toInt()

public const val SIOCSIFBRDADDR: Int = 0x80286913.toInt()

public const val SIOCSIFDSTADDR: Int = 0x8028690e.toInt()

public const val SIOCSIFFLAGS: Int = 0x80286910.toInt()

public const val SIOCSIFMETRIC: Int = 0x80286918.toInt()

public const val SIOCSIFMTU: Int = 0x80286958.toInt()

public const val SIOCSIFNETMASK: Int = 0x80286916.toInt()

public const val TIOCUCNTL: Int = 0x80047466.toInt()

public const val TIOCCONS: Int = 0x80047462.toInt()

public const val TIOCPKT: Int = 0x80047470.toInt()

public const val TIOCPKT_DATA: Int = 0

public const val TIOCPKT_FLUSHREAD: Int = 1

public const val TIOCPKT_FLUSHWRITE: Int = 2

public const val TIOCPKT_NOSTOP: Int = 0x10

public const val TIOCPKT_DOSTOP: Int = 0x20

public const val TIOCPKT_START: Int = 8

public const val TIOCPKT_STOP: Int = 4

public const val IPC_ALLOC: Int = 32768

public const val IPC_CREAT: Int = 8192

public const val IPC_EXCL: Int = 1024

public const val IPC_NOWAIT: Int = 2048

public const val IPC_RMID: Int = 0

public const val IPC_SET: Int = 101

public const val IPC_R: Int = 256

public const val IPC_W: Int = 128

public const val IPC_O: Int = 512

public const val IPC_NOERROR: Int = 4096

public const val IPC_STAT: Int = 102

public const val IPC_PRIVATE: Int = -1

public const val SHM_LOCK: Int = 201

public const val SHM_UNLOCK: Int = 202

public const val L_GETMESSAGES: Int = 1

public const val L_GETINFO: Int = 2

public const val L_GETLIBPATH: Int = 3

public const val L_GETKERNINFO: Int = 4

public const val L_GETLIB32INFO: Int = 5

public const val L_GETLIB64INFO: Int = 6

public const val L_GETPROCINFO: Int = 7

public const val L_GETXINFO: Int = 8

public const val PATH_MAX: Int = 1023

public const val PAGESIZE: Int = 4096

public const val IOV_MAX: Int = 16

public const val AIO_LISTIO_MAX: Int = 4096

public const val PIPE_BUF: ULong = 32768uL

public const val OPEN_MAX: Int = 65534

public const val MAX_INPUT: Int = 512

public const val MAX_CANON: Int = 256

public const val ARG_MAX: Int = 1048576

public const val BC_BASE_MAX: Int = 99

public const val BC_DIM_MAX: Int = 0x800

public const val BC_SCALE_MAX: Int = 99

public const val BC_STRING_MAX: Int = 0x800

public const val CHARCLASS_NAME_MAX: Int = 14

public const val CHILD_MAX: Int = 128

public const val COLL_WEIGHTS_MAX: Int = 4

public const val EXPR_NEST_MAX: Int = 32

public const val NZERO: Int = 20

public const val F_LOCK: Int = 1

public const val F_TEST: Int = 3

public const val F_TLOCK: Int = 2

public const val F_ULOCK: Int = 0

public const val BIG_ENDIAN: Int = 4321

public const val LITTLE_ENDIAN: Int = 1234

public const val PDP_ENDIAN: Int = 3412

public const val PROT_NONE: Int = 0

public const val PROT_READ: Int = 1

public const val PROT_WRITE: Int = 2

public const val PROT_EXEC: Int = 4

public const val MAP_FILE: Int = 0

public const val MAP_SHARED: Int = 1

public const val MAP_PRIVATE: Int = 2

public const val MAP_FIXED: Int = 0x100

public const val MAP_ANON: Int = 0x10

public const val MAP_ANONYMOUS: Int = 0x10

public const val MAP_TYPE: Int = 0xf0

public const val MCL_CURRENT: Int = 0x100

public const val MCL_FUTURE: Int = 0x200

public const val MS_SYNC: Int = 0x20

public const val MS_ASYNC: Int = 0x10

public const val MS_INVALIDATE: Int = 0x40

public const val POSIX_MADV_NORMAL: Int = 1

public const val POSIX_MADV_RANDOM: Int = 3

public const val POSIX_MADV_SEQUENTIAL: Int = 2

public const val POSIX_MADV_WILLNEED: Int = 4

public const val POSIX_MADV_DONTNEED: Int = 5

public const val MADV_NORMAL: Int = 0

public const val MADV_RANDOM: Int = 1

public const val MADV_SEQUENTIAL: Int = 2

public const val MADV_WILLNEED: Int = 3

public const val MADV_DONTNEED: Int = 4

public const val S_IFMT: UInt = 61440u

public const val S_IFREG: UInt = 32768u

public const val S_IFDIR: UInt = 16384u

public const val S_IFBLK: UInt = 24576u

public const val S_IFCHR: UInt = 8192u

public const val S_IFIFO: UInt = 4096u

public const val S_IRWXU: UInt = 448u

public const val S_IRUSR: UInt = 256u

public const val S_IWUSR: UInt = 128u

public const val S_IXUSR: UInt = 64u

public const val S_IRWXG: UInt = 56u

public const val S_IRGRP: UInt = 32u

public const val S_IWGRP: UInt = 16u

public const val S_IXGRP: UInt = 8u

public const val S_IRWXO: UInt = 7u

public const val S_IROTH: UInt = 4u

public const val S_IWOTH: UInt = 2u

public const val S_IXOTH: UInt = 1u

public const val S_IFLNK: UInt = 40960u

public const val S_IFSOCK: UInt = 49152u

public const val S_IEXEC: UInt = 64u

public const val S_IWRITE: UInt = 128u

public const val S_IREAD: UInt = 256u

public const val MSG_NOERROR: Int = 4096

public const val SIGSTKSZ: ULong = 4096uL

public const val MINSIGSTKSZ: ULong = 1200uL

public const val MAXPATHLEN: Int = PATH_MAX + 1

public const val MAXSYMLINKS: Int = 20

public const val MAXHOSTNAMELEN: Int = 256

public const val MAXUPRC: Int = 128

public const val NGROUPS_MAX: ULong = 2048uL

public const val NGROUPS: ULong = NGROUPS_MAX

public const val NOFILE: Int = OPEN_MAX

public const val POLLIN: Short = 0x0001

public const val POLLPRI: Short = 0x0004

public const val POLLOUT: Short = 0x0002

public const val POLLERR: Short = 0x4000

public const val POLLHUP: Short = 0x2000

public const val POLLMSG: Short = 0x0080

public const val POLLSYNC: Short = 0x8000.toShort()

public const val POLLNVAL: Short = POLLSYNC

public const val POLLNORM: Short = POLLIN

public const val POLLRDNORM: Short = 0x0010

public const val POLLWRNORM: Short = POLLOUT

public const val POLLRDBAND: Short = 0x0020

public const val POLLWRBAND: Short = 0x0040

public val PS_ADD: UByte = (0).toUByte()

public val PS_MOD: UByte = (1).toUByte()

public val PS_DELETE: UByte = (2).toUByte()

public val PS_REPLACE: UByte = (3).toUByte()

public const val PT_TRACE_ME: Int = 0

public const val PT_READ_I: Int = 1

public const val PT_READ_D: Int = 2

public const val PT_WRITE_I: Int = 4

public const val PT_WRITE_D: Int = 5

public const val PT_CONTINUE: Int = 7

public const val PT_KILL: Int = 8

public const val PT_STEP: Int = 9

public const val PT_READ_GPR: Int = 11

public const val PT_READ_FPR: Int = 12

public const val PT_WRITE_GPR: Int = 14

public const val PT_WRITE_FPR: Int = 15

public const val PT_READ_BLOCK: Int = 17

public const val PT_WRITE_BLOCK: Int = 19

public const val PT_ATTACH: Int = 30

public const val PT_DETACH: Int = 31

public const val PT_REGSET: Int = 32

public const val PT_REATT: Int = 33

public const val PT_LDINFO: Int = 34

public const val PT_MULTI: Int = 35

public const val PT_NEXT: Int = 36

public const val PT_SET: Int = 37

public const val PT_CLEAR: Int = 38

public const val PT_LDXINFO: Int = 39

public const val PT_QUERY: Int = 40

public const val PT_WATCH: Int = 41

public const val PTT_CONTINUE: Int = 50

public const val PTT_STEP: Int = 51

public const val PTT_READ_SPRS: Int = 52

public const val PTT_WRITE_SPRS: Int = 53

public const val PTT_READ_GPRS: Int = 54

public const val PTT_WRITE_GPRS: Int = 55

public const val PTT_READ_FPRS: Int = 56

public const val PTT_WRITE_FPRS: Int = 57

public const val PTT_READ_VEC: Int = 58

public const val PTT_WRITE_VEC: Int = 59

public const val PTT_WATCH: Int = 60

public const val PTT_SET_TRAP: Int = 61

public const val PTT_CLEAR_TRAP: Int = 62

public const val PTT_READ_UKEYSET: Int = 63

public const val PT_GET_UKEY: Int = 64

public const val PTT_READ_FPSCR_HI: Int = 65

public const val PTT_WRITE_FPSCR_HI: Int = 66

public const val PTT_READ_VSX: Int = 67

public const val PTT_WRITE_VSX: Int = 68

public const val PTT_READ_TM: Int = 69

public const val PTRACE_ATTACH: Int = 14

public const val PTRACE_CONT: Int = 7

public const val PTRACE_DETACH: Int = 15

public const val PTRACE_GETFPREGS: Int = 12

public const val PTRACE_GETREGS: Int = 10

public const val PTRACE_KILL: Int = 8

public const val PTRACE_PEEKDATA: Int = 2

public const val PTRACE_PEEKTEXT: Int = 1

public const val PTRACE_PEEKUSER: Int = 3

public const val PTRACE_POKEDATA: Int = 5

public const val PTRACE_POKETEXT: Int = 4

public const val PTRACE_POKEUSER: Int = 6

public const val PTRACE_SETFPREGS: Int = 13

public const val PTRACE_SETREGS: Int = 11

public const val PTRACE_SINGLESTEP: Int = 9

public const val PTRACE_SYSCALL: Int = 16

public const val PTRACE_TRACEME: Int = 0

public const val RLIMIT_CPU: Int = 0

public const val RLIMIT_FSIZE: Int = 1

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_STACK: Int = 3

public const val RLIMIT_CORE: Int = 4

public const val RLIMIT_RSS: Int = 5

public const val RLIMIT_AS: Int = 6

public const val RLIMIT_NOFILE: Int = 7

public const val RLIMIT_THREADS: Int = 8

public const val RLIMIT_NPROC: Int = 9

public const val RUSAGE_SELF: Int = 0

public const val RUSAGE_CHILDREN: Int = -1

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val RUSAGE_THREAD: Int = 1

public val RLIM_SAVED_MAX: ULong = RLIM_INFINITY - 1u

public val RLIM_SAVED_CUR: ULong = RLIM_INFINITY - 2u

public const val RLIM_NLIMITS: Int = 10

public const val SCHED_OTHER: Int = 0

public const val SCHED_FIFO: Int = 1

public const val SCHED_RR: Int = 2

public const val SCHED_LOCAL: Int = 3

public const val SCHED_GLOBAL: Int = 4

public const val SCHED_FIFO2: Int = 5

public const val SCHED_FIFO3: Int = 6

public const val SCHED_FIFO4: Int = 7

public const val SEM_UNDO: Int = 4096

public const val GETNCNT: Int = 3

public const val GETPID: Int = 4

public const val GETVAL: Int = 5

public const val GETALL: Int = 6

public const val GETZCNT: Int = 7

public const val SETVAL: Int = 8

public const val SETALL: Int = 9

public const val SHMLBA: Int = 0x10000000

public const val SHMLBA_EXTSHM: Int = 0x1000

public const val SHM_SHMAT: Int = 0x80000000.toInt()

public const val SHM_RDONLY: Int = 4096

public const val SHM_RND: Int = 8192

public const val SHM_PIN: Int = 2048

public const val SHM_LGPAGE: Int = 2147483648.toInt()

public const val SHM_MAP: Int = 2048

public const val SHM_FMAP: Int = 1024

public const val SHM_COPY: Int = 16384

public const val SHM_CLEAR: Int = 0

public const val SHM_HGSEG: Int = 1073741824

public const val SHM_R: Int = IPC_R

public const val SHM_W: Int = IPC_W

public const val SHM_DEST: Int = 1024

public const val SA_ONSTACK: Int = 0x00000001

public const val SA_RESETHAND: Int = 0x00000002

public const val SA_RESTART: Int = 0x00000008

public const val SA_SIGINFO: Int = 0x00000100

public const val SA_NODEFER: Int = 0x00000200

public const val SA_NOCLDWAIT: Int = 0x00000400

public const val SA_NOCLDSTOP: Int = 0x00000004

public const val SS_ONSTACK: Int = 0x00000001

public const val SS_DISABLE: Int = 0x00000002

public const val SIGCHLD: Int = 20

public const val SIGBUS: Int = 10

public const val SIG_BLOCK: Int = 0

public const val SIG_UNBLOCK: Int = 1

public const val SIG_SETMASK: Int = 2

public const val SIGEV_NONE: Int = 1

public const val SIGEV_SIGNAL: Int = 2

public const val SIGEV_THREAD: Int = 3

public const val SIGHUP: Int = 1

public const val SIGINT: Int = 2

public const val SIGQUIT: Int = 3

public const val SIGILL: Int = 4

public const val SIGABRT: Int = 6

public const val SIGEMT: Int = 7

public const val SIGFPE: Int = 8

public const val SIGKILL: Int = 9

public const val SIGSEGV: Int = 11

public const val SIGSYS: Int = 12

public const val SIGPIPE: Int = 13

public const val SIGALRM: Int = 14

public const val SIGTERM: Int = 15

public const val SIGUSR1: Int = 30

public const val SIGUSR2: Int = 31

public const val SIGPWR: Int = 29

public const val SIGWINCH: Int = 28

public const val SIGURG: Int = 16

public val SIGPOLL: Int = SIGIO

public const val SIGIO: Int = 23

public const val SIGSTOP: Int = 17

public const val SIGTSTP: Int = 18

public const val SIGCONT: Int = 19

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGVTALRM: Int = 34

public const val SIGPROF: Int = 32

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGTRAP: Int = 5

public const val SIGCLD: Int = 20

public const val SIGRTMAX: Int = 57

public const val SIGRTMIN: Int = 50

public const val SI_USER: Int = 0

public const val SI_UNDEFINED: Int = 8

public const val SI_EMPTY: Int = 9

public const val BUS_ADRALN: Int = 1

public const val BUS_ADRERR: Int = 2

public const val BUS_OBJERR: Int = 3

public const val BUS_UEGARD: Int = 4

public const val CLD_EXITED: Int = 10

public const val CLD_KILLED: Int = 11

public const val CLD_DUMPED: Int = 12

public const val CLD_TRAPPED: Int = 13

public const val CLD_STOPPED: Int = 14

public const val CLD_CONTINUED: Int = 15

public const val FPE_INTDIV: Int = 20

public const val FPE_INTOVF: Int = 21

public const val FPE_FLTDIV: Int = 22

public const val FPE_FLTOVF: Int = 23

public const val FPE_FLTUND: Int = 24

public const val FPE_FLTRES: Int = 25

public const val FPE_FLTINV: Int = 26

public const val FPE_FLTSUB: Int = 27

public const val ILL_ILLOPC: Int = 30

public const val ILL_ILLOPN: Int = 31

public const val ILL_ILLADR: Int = 32

public const val ILL_ILLTRP: Int = 33

public const val ILL_PRVOPC: Int = 34

public const val ILL_PRVREG: Int = 35

public const val ILL_COPROC: Int = 36

public const val ILL_BADSTK: Int = 37

public const val ILL_TMBADTHING: Int = 38

public const val POLL_IN: Int = 40

public const val POLL_OUT: Int = 41

public const val POLL_MSG: Int = -3

public const val POLL_ERR: Int = 43

public const val POLL_PRI: Int = 44

public const val POLL_HUP: Int = 45

public const val SEGV_MAPERR: Int = 50

public const val SEGV_ACCERR: Int = 51

public const val SEGV_KEYERR: Int = 52

public const val TRAP_BRKPT: Int = 60

public const val TRAP_TRACE: Int = 61

public const val SI_QUEUE: Int = 71

public const val SI_TIMER: Int = 72

public const val SI_ASYNCIO: Int = 73

public const val SI_MESGQ: Int = 74

public const val AF_UNSPEC: Int = 0

public const val AF_UNIX: Int = 1

public const val AF_INET: Int = 2

public const val AF_IMPLINK: Int = 3

public const val AF_PUP: Int = 4

public const val AF_CHAOS: Int = 5

public const val AF_NS: Int = 6

public const val AF_ECMA: Int = 8

public const val AF_DATAKIT: Int = 9

public const val AF_CCITT: Int = 10

public const val AF_SNA: Int = 11

public const val AF_DECnet: Int = 12

public const val AF_DLI: Int = 13

public const val AF_LAT: Int = 14

public const val SO_TIMESTAMPNS: Int = 0x100a

public const val SOMAXCONN: Int = 1024

public const val AF_LOCAL: Int = AF_UNIX

public const val UIO_MAXIOV: Int = 1024

public const val pseudo_AF_XTP: Int = 19

public const val AF_HYLINK: Int = 15

public const val AF_APPLETALK: Int = 16

public const val AF_ISO: Int = 7

public const val AF_OSI: Int = AF_ISO

public const val AF_ROUTE: Int = 17

public const val AF_LINK: Int = 18

public const val AF_INET6: Int = 24

public const val AF_INTF: Int = 20

public const val AF_RIF: Int = 21

public const val AF_NDD: Int = 23

public const val AF_MAX: Int = 30

public const val PF_UNSPEC: Int = AF_UNSPEC

public const val PF_UNIX: Int = AF_UNIX

public const val PF_INET: Int = AF_INET

public const val PF_IMPLINK: Int = AF_IMPLINK

public const val PF_PUP: Int = AF_PUP

public const val PF_CHAOS: Int = AF_CHAOS

public const val PF_NS: Int = AF_NS

public const val PF_ISO: Int = AF_ISO

public const val PF_OSI: Int = AF_ISO

public const val PF_ECMA: Int = AF_ECMA

public const val PF_DATAKIT: Int = AF_DATAKIT

public const val PF_CCITT: Int = AF_CCITT

public const val PF_SNA: Int = AF_SNA

public const val PF_DECnet: Int = AF_DECnet

public const val PF_DLI: Int = AF_DLI

public const val PF_LAT: Int = AF_LAT

public const val PF_HYLINK: Int = AF_HYLINK

public const val PF_APPLETALK: Int = AF_APPLETALK

public const val PF_ROUTE: Int = AF_ROUTE

public const val PF_LINK: Int = AF_LINK

public const val PF_XTP: Int = 19

public const val PF_RIF: Int = AF_RIF

public const val PF_INTF: Int = AF_INTF

public const val PF_NDD: Int = AF_NDD

public const val PF_INET6: Int = AF_INET6

public const val PF_MAX: Int = AF_MAX

public const val SF_CLOSE: Int = 1

public const val SF_REUSE: Int = 2

public const val SF_DONT_CACHE: Int = 4

public const val SF_SYNC_CACHE: Int = 8

public const val SOCK_DGRAM: Int = 2

public const val SOCK_STREAM: Int = 1

public const val SOCK_RAW: Int = 3

public const val SOCK_RDM: Int = 4

public const val SOCK_SEQPACKET: Int = 5

public const val SOL_SOCKET: Int = 0xffff

public const val SO_DEBUG: Int = 0x0001

public const val SO_ACCEPTCONN: Int = 0x0002

public const val SO_REUSEADDR: Int = 0x0004

public const val SO_KEEPALIVE: Int = 0x0008

public const val SO_DONTROUTE: Int = 0x0010

public const val SO_BROADCAST: Int = 0x0020

public const val SO_USELOOPBACK: Int = 0x0040

public const val SO_LINGER: Int = 0x0080

public const val SO_OOBINLINE: Int = 0x0100

public const val SO_REUSEPORT: Int = 0x0200

public const val SO_USE_IFBUFS: Int = 0x0400

public const val SO_CKSUMRECV: Int = 0x0800

public const val SO_NOREUSEADDR: Int = 0x1000

public const val SO_KERNACCEPT: Int = 0x2000

public const val SO_NOMULTIPATH: Int = 0x4000

public const val SO_AUDIT: Int = 0x8000

public const val SO_SNDBUF: Int = 0x1001

public const val SO_RCVBUF: Int = 0x1002

public const val SO_SNDLOWAT: Int = 0x1003

public const val SO_RCVLOWAT: Int = 0x1004

public const val SO_SNDTIMEO: Int = 0x1005

public const val SO_RCVTIMEO: Int = 0x1006

public const val SO_ERROR: Int = 0x1007

public const val SO_TYPE: Int = 0x1008

public const val SCM_RIGHTS: Int = 0x01

public const val MSG_OOB: Int = 0x1

public const val MSG_PEEK: Int = 0x2

public const val MSG_DONTROUTE: Int = 0x4

public const val MSG_EOR: Int = 0x8

public const val MSG_TRUNC: Int = 0x10

public const val MSG_CTRUNC: Int = 0x20

public const val MSG_WAITALL: Int = 0x40

public const val MSG_MPEG2: Int = 0x80

public const val MSG_NOSIGNAL: Int = 0x100

public const val MSG_WAITFORONE: Int = 0x200

public const val MSG_ARGEXT: Int = 0x400

public const val MSG_NONBLOCK: Int = 0x4000

public const val MSG_COMPAT: Int = 0x8000

public const val MSG_MAXIOVLEN: Int = 16

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val UTIME_NOW: Int = -2

public const val UTIME_OMIT: Int = -3

public const val ST_RDONLY: ULong = 0x0001uL

public const val ST_NOSUID: ULong = 0x0040uL

public const val ST_NODEV: ULong = 0x0080uL

public const val I_NREAD: Int = 0x20005301

public const val I_PUSH: Int = 0x20005302

public const val I_POP: Int = 0x20005303

public const val I_LOOK: Int = 0x20005304

public const val I_FLUSH: Int = 0x20005305

public const val I_SRDOPT: Int = 0x20005306

public const val I_GRDOPT: Int = 0x20005307

public const val I_STR: Int = 0x20005308

public const val I_SETSIG: Int = 0x20005309

public const val I_GETSIG: Int = 0x2000530a

public const val I_FIND: Int = 0x2000530b

public const val I_LINK: Int = 0x2000530c

public const val I_UNLINK: Int = 0x2000530d

public const val I_PEEK: Int = 0x2000530f

public const val I_FDINSERT: Int = 0x20005310

public const val I_SENDFD: Int = 0x20005311

public const val I_RECVFD: Int = 0x20005312

public const val I_SWROPT: Int = 0x20005314

public const val I_GWROPT: Int = 0x20005315

public const val I_LIST: Int = 0x20005316

public const val I_PLINK: Int = 0x2000531d

public const val I_PUNLINK: Int = 0x2000531e

public const val I_FLUSHBAND: Int = 0x20005313

public const val I_CKBAND: Int = 0x20005318

public const val I_GETBAND: Int = 0x20005319

public const val I_ATMARK: Int = 0x20005317

public const val I_SETCLTIME: Int = 0x2000531b

public const val I_GETCLTIME: Int = 0x2000531c

public const val I_CANPUT: Int = 0x2000531a

public val LOG_CRON: Int = 9 shl 3

public val LOG_AUTHPRIV: Int = 10 shl 3

public const val LOG_NFACILITIES: Int = 24

public const val LOG_PERROR: Int = 0x20

public const val SC_ARCH: Int = 1

public const val SC_IMPL: Int = 2

public const val SC_VERS: Int = 3

public const val SC_WIDTH: Int = 4

public const val SC_NCPUS: Int = 5

public const val SC_L1C_ATTR: Int = 6

public const val SC_L1C_ISZ: Int = 7

public const val SC_L1C_DSZ: Int = 8

public const val SC_L1C_ICA: Int = 9

public const val SC_L1C_DCA: Int = 10

public const val SC_L1C_IBS: Int = 11

public const val SC_L1C_DBS: Int = 12

public const val SC_L1C_ILS: Int = 13

public const val SC_L1C_DLS: Int = 14

public const val SC_L2C_SZ: Int = 15

public const val SC_L2C_AS: Int = 16

public const val SC_TLB_ATTR: Int = 17

public const val SC_ITLB_SZ: Int = 18

public const val SC_DTLB_SZ: Int = 19

public const val SC_ITLB_ATT: Int = 20

public const val SC_DTLB_ATT: Int = 21

public const val SC_RESRV_SZ: Int = 22

public const val SC_PRI_LC: Int = 23

public const val SC_PRO_LC: Int = 24

public const val SC_RTC_TYPE: Int = 25

public const val SC_VIRT_AL: Int = 26

public const val SC_CAC_CONG: Int = 27

public const val SC_MOD_ARCH: Int = 28

public const val SC_MOD_IMPL: Int = 29

public const val SC_XINT: Int = 30

public const val SC_XFRAC: Int = 31

public const val SC_KRN_ATTR: Int = 32

public const val SC_PHYSMEM: Int = 33

public const val SC_SLB_ATTR: Int = 34

public const val SC_SLB_SZ: Int = 35

public const val SC_MAX_NCPUS: Int = 37

public const val SC_MAX_REALADDR: Int = 38

public const val SC_ORIG_ENT_CAP: Int = 39

public const val SC_ENT_CAP: Int = 40

public const val SC_DISP_WHE: Int = 41

public const val SC_CAPINC: Int = 42

public const val SC_VCAPW: Int = 43

public const val SC_SPLP_STAT: Int = 44

public const val SC_SMT_STAT: Int = 45

public const val SC_SMT_TC: Int = 46

public const val SC_VMX_VER: Int = 47

public const val SC_LMB_SZ: Int = 48

public const val SC_MAX_XCPU: Int = 49

public const val SC_EC_LVL: Int = 50

public const val SC_AME_STAT: Int = 51

public const val SC_ECO_STAT: Int = 52

public const val SC_DFP_VER: Int = 53

public const val SC_VRM_STAT: Int = 54

public const val SC_PHYS_IMP: Int = 55

public const val SC_PHYS_VER: Int = 56

public const val SC_SPCM_STATUS: Int = 57

public const val SC_SPCM_MAX: Int = 58

public const val SC_TM_VER: Int = 59

public const val SC_NX_CAP: Int = 60

public const val SC_PKS_STATE: Int = 61

public const val SC_MMA_VER: Int = 62

public const val POWER_RS: Int = 1

public const val POWER_PC: Int = 2

public const val IA64: Int = 3

public const val POWER_RS1: Int = 0x1

public const val POWER_RSC: Int = 0x2

public const val POWER_RS2: Int = 0x4

public const val POWER_601: Int = 0x8

public const val POWER_604: Int = 0x10

public const val POWER_603: Int = 0x20

public const val POWER_620: Int = 0x40

public const val POWER_630: Int = 0x80

public const val POWER_A35: Int = 0x100

public const val POWER_RS64II: Int = 0x200

public const val POWER_RS64III: Int = 0x400

public const val POWER_4: Int = 0x800

public const val POWER_RS64IV: Int = POWER_4

public const val POWER_MPC7450: Int = 0x1000

public const val POWER_5: Int = 0x2000

public const val POWER_6: Int = 0x4000

public const val POWER_7: Int = 0x8000

public const val POWER_8: Int = 0x10000

public const val POWER_9: Int = 0x20000

public const val FD_SETSIZE: ULong = 65534uL

public const val TIMEOFDAY: Int = 9

public val CLOCK_REALTIME: Long = TIMEOFDAY.toLong()

public const val CLOCK_MONOTONIC: Long = 10

public const val TIMER_ABSTIME: Int = 999

public const val ITIMER_REAL: Int = 0

public const val ITIMER_VIRTUAL: Int = 1

public const val ITIMER_PROF: Int = 2

public const val ITIMER_VIRT: Int = 3

public const val ITIMER_REAL1: Int = 20

public const val ITIMER_REAL_TH: Int = ITIMER_REAL1

public const val DST_AUST: Int = 2

public const val DST_CAN: Int = 6

public const val DST_EET: Int = 5

public const val DST_MET: Int = 4

public const val DST_NONE: Int = 0

public const val DST_USA: Int = 1

public const val DST_WET: Int = 3

public const val CSTART: UInt = 17u

public const val CSTOP: UInt = 19u

public val TCGETA: Int = TIOC or 5

public val TCSETA: Int = TIOC or 6

public val TCSETAW: Int = TIOC or 7

public val TCSETAF: Int = TIOC or 8

public val TCSBRK: Int = TIOC or 9

public val TCXONC: Int = TIOC or 11

public val TCFLSH: Int = TIOC or 12

public val TCGETS: Int = TIOC or 1

public val TCSETS: Int = TIOC or 2

public const val TCSANOW: Int = 0

public val TCSETSW: Int = TIOC or 3

public const val TCSADRAIN: Int = 1

public val TCSETSF: Int = TIOC or 4

public const val TCSAFLUSH: Int = 2

public const val TCIFLUSH: Int = 0

public const val TCOFLUSH: Int = 1

public const val TCIOFLUSH: Int = 2

public const val TCOOFF: Int = 0

public const val TCOON: Int = 1

public const val TCIOFF: Int = 2

public const val TCION: Int = 3

public const val TIOC: Int = 0x5400

public const val TIOCGWINSZ: Int = 0x40087468

public const val TIOCSWINSZ: Int = 0x80087467.toInt()

public const val TIOCLBIS: Int = 0x8004747f.toInt()

public const val TIOCLBIC: Int = 0x8004747e.toInt()

public const val TIOCLSET: Int = 0x8004747d.toInt()

public const val TIOCLGET: Int = 0x4004747c

public const val TIOCSBRK: Int = 0x2000747b

public const val TIOCCBRK: Int = 0x2000747a

public const val TIOCSDTR: Int = 0x20007479

public const val TIOCCDTR: Int = 0x20007478

public const val TIOCSLTC: Int = 0x80067475.toInt()

public const val TIOCGLTC: Int = 0x40067474

public const val TIOCOUTQ: Int = 0x40047473

public const val TIOCNOTTY: Int = 0x20007471

public const val TIOCSTOP: Int = 0x2000746f

public const val TIOCSTART: Int = 0x2000746e

public const val TIOCGPGRP: Int = 0x40047477

public const val TIOCSPGRP: Int = 0x80047476.toInt()

public const val TIOCGSID: Int = 0x40047448

public const val TIOCSTI: Int = 0x80017472.toInt()

public const val TIOCMSET: Int = 0x8004746d.toInt()

public const val TIOCMBIS: Int = 0x8004746c.toInt()

public const val TIOCMBIC: Int = 0x8004746b.toInt()

public const val TIOCMGET: Int = 0x4004746a

public const val TIOCREMOTE: Int = 0x80047469.toInt()

public const val MAXCOMLEN: Int = 32

public const val UF_SYSTEM: Int = 0x1000

public const val AT_FLAGS: Int = 0x80

public const val AT_GID: Int = 8

public const val AT_UID: Int = 4

public const val P_ALL: UInt = 0u

public const val P_PID: UInt = 1u

public const val P_PGID: UInt = 2u

public const val WNOHANG: Int = 0x1

public const val WUNTRACED: Int = 0x2

public const val WEXITED: Int = 0x04

public const val WCONTINUED: Int = 0x01000000

public const val WNOWAIT: Int = 0x10

public val WSTOPPED: Int = _W_STOPPED

public const val _W_STOPPED: Int = 0x00000040

public const val _W_SLWTED: Int = 0x0000007c

public const val _W_SEWTED: Int = 0x0000007d

public const val _W_SFWTED: Int = 0x0000007e

public const val _W_STRC: Int = 0x0000007f

public const val NCCS: ULong = 16uL

public const val OLCUC: UInt = 2u

public const val CSIZE: UInt = 0x00000030u

public const val CS5: UInt = 0x00000000u

public const val CS6: UInt = 0x00000010u

public const val CS7: UInt = 0x00000020u

public const val CS8: UInt = 0x00000030u

public const val CSTOPB: UInt = 0x00000040u

public const val ECHO: UInt = 0x00000008u

public const val ECHOE: UInt = 0x00000010u

public const val ECHOK: UInt = 0x00000020u

public const val ECHONL: UInt = 0x00000040u

public const val ECHOCTL: UInt = 0x00020000u

public const val ECHOPRT: UInt = 0x00040000u

public const val ECHOKE: UInt = 0x00080000u

public const val IGNBRK: UInt = 0x00000001u

public const val BRKINT: UInt = 0x00000002u

public const val IGNPAR: UInt = 0x00000004u

public const val PARMRK: UInt = 0x00000008u

public const val INPCK: UInt = 0x00000010u

public const val ISTRIP: UInt = 0x00000020u

public const val INLCR: UInt = 0x00000040u

public const val IGNCR: UInt = 0x00000080u

public const val ICRNL: UInt = 0x00000100u

public const val IXON: UInt = 0x00000200u

public const val IXOFF: UInt = 0x00000400u

public const val IXANY: UInt = 0x00001000u

public const val IMAXBEL: UInt = 0x00010000u

public const val OPOST: UInt = 0x00000001u

public const val ONLCR: UInt = 0x00000004u

public const val OCRNL: UInt = 0x00000008u

public const val ONOCR: UInt = 0x00000010u

public const val ONLRET: UInt = 0x00000020u

public const val CREAD: UInt = 0x00000080u

public const val IEXTEN: UInt = 0x00200000u

public const val TOSTOP: UInt = 0x00010000u

public const val FLUSHO: UInt = 0x00100000u

public const val PENDIN: UInt = 0x20000000u

public const val NOFLSH: UInt = 0x00000080u

public const val VINTR: ULong = 0uL

public const val VQUIT: ULong = 1uL

public const val VERASE: ULong = 2uL

public const val VKILL: ULong = 3uL

public const val VEOF: ULong = 4uL

public const val VEOL: ULong = 5uL

public const val VSTART: ULong = 7uL

public const val VSTOP: ULong = 8uL

public const val VSUSP: ULong = 9uL

public const val VMIN: ULong = 4uL

public const val VTIME: ULong = 5uL

public const val VEOL2: ULong = 6uL

public const val VDSUSP: ULong = 10uL

public const val VREPRINT: ULong = 11uL

public const val VDISCRD: ULong = 12uL

public const val VWERSE: ULong = 13uL

public const val VLNEXT: ULong = 14uL

public const val B0: UInt = 0x0u

public const val B50: UInt = 0x1u

public const val B75: UInt = 0x2u

public const val B110: UInt = 0x3u

public const val B134: UInt = 0x4u

public const val B150: UInt = 0x5u

public const val B200: UInt = 0x6u

public const val B300: UInt = 0x7u

public const val B600: UInt = 0x8u

public const val B1200: UInt = 0x9u

public const val B1800: UInt = 0xau

public const val B2400: UInt = 0xbu

public const val B4800: UInt = 0xcu

public const val B9600: UInt = 0xdu

public const val B19200: UInt = 0xeu

public const val B38400: UInt = 0xfu

public const val EXTA: UInt = B19200

public const val EXTB: UInt = B38400

public const val IUCLC: UInt = 0x00000800u

public const val OFILL: UInt = 0x00000040u

public const val OFDEL: UInt = 0x00000080u

public const val CRDLY: UInt = 0x00000300u

public const val CR0: UInt = 0x00000000u

public const val CR1: UInt = 0x00000100u

public const val CR2: UInt = 0x00000200u

public const val CR3: UInt = 0x00000300u

public const val TABDLY: UInt = 0x00000c00u

public const val TAB0: UInt = 0x00000000u

public const val TAB1: UInt = 0x00000400u

public const val TAB2: UInt = 0x00000800u

public const val TAB3: UInt = 0x00000c00u

public const val BSDLY: UInt = 0x00001000u

public const val BS0: UInt = 0x00000000u

public const val BS1: UInt = 0x00001000u

public const val FFDLY: UInt = 0x00002000u

public const val FF0: UInt = 0x00000000u

public const val FF1: UInt = 0x00002000u

public const val NLDLY: UInt = 0x00004000u

public const val NL0: UInt = 0x00000000u

public const val NL1: UInt = 0x00004000u

public const val VTDLY: UInt = 0x00008000u

public const val VT0: UInt = 0x00000000u

public const val VT1: UInt = 0x00008000u

public const val OXTABS: UInt = 0x00040000u

public const val ONOEOT: UInt = 0x00080000u

public const val CBAUD: UInt = 0x0000000fu

public const val PARENB: UInt = 0x00000100u

public const val PARODD: UInt = 0x00000200u

public const val HUPCL: UInt = 0x00000400u

public const val CLOCAL: UInt = 0x00000800u

public const val CIBAUD: UInt = 0x000f0000u

public const val IBSHIFT: UInt = 16u

public const val PAREXT: UInt = 0x00100000u

public const val ISIG: UInt = 0x00000001u

public const val ICANON: UInt = 0x00000002u

public const val XCASE: UInt = 0x00000004u

public const val ALTWERASE: UInt = 0x00400000u

public const val CLOCK_PROCESS_CPUTIME_ID: Long = 11

public const val CLOCK_THREAD_CPUTIME_ID: Long = 12

public const val _POSIX_VDISABLE: Int = 0xff

public const val _PC_LINK_MAX: Int = 11

public const val _PC_MAX_CANON: Int = 12

public const val _PC_MAX_INPUT: Int = 13

public const val _PC_NAME_MAX: Int = 14

public const val _PC_PATH_MAX: Int = 16

public const val _PC_PIPE_BUF: Int = 17

public const val _PC_NO_TRUNC: Int = 15

public const val _PC_VDISABLE: Int = 18

public const val _PC_CHOWN_RESTRICTED: Int = 10

public const val _PC_ASYNC_IO: Int = 19

public const val _PC_PRIO_IO: Int = 21

public const val _PC_SYNC_IO: Int = 20

public const val _PC_ALLOC_SIZE_MIN: Int = 26

public const val _PC_REC_INCR_XFER_SIZE: Int = 27

public const val _PC_REC_MAX_XFER_SIZE: Int = 28

public const val _PC_REC_MIN_XFER_SIZE: Int = 29

public const val _PC_REC_XFER_ALIGN: Int = 30

public const val _PC_SYMLINK_MAX: Int = 25

public const val _PC_2_SYMLINKS: Int = 31

public const val _PC_TIMESTAMP_RESOLUTION: Int = 32

public const val _PC_FILESIZEBITS: Int = 22

public const val _SC_ARG_MAX: Int = 0

public const val _SC_CHILD_MAX: Int = 1

public const val _SC_CLK_TCK: Int = 2

public const val _SC_NGROUPS_MAX: Int = 3

public const val _SC_OPEN_MAX: Int = 4

public const val _SC_JOB_CONTROL: Int = 7

public const val _SC_SAVED_IDS: Int = 8

public const val _SC_VERSION: Int = 9

public const val _SC_PASS_MAX: Int = 45

public val _SC_PAGESIZE: Int = _SC_PAGE_SIZE

public const val _SC_PAGE_SIZE: Int = 48

public const val _SC_XOPEN_VERSION: Int = 46

public const val _SC_NPROCESSORS_CONF: Int = 71

public const val _SC_NPROCESSORS_ONLN: Int = 72

public const val _SC_STREAM_MAX: Int = 5

public const val _SC_TZNAME_MAX: Int = 6

public const val _SC_AIO_LISTIO_MAX: Int = 75

public const val _SC_AIO_MAX: Int = 76

public const val _SC_AIO_PRIO_DELTA_MAX: Int = 77

public const val _SC_ASYNCHRONOUS_IO: Int = 78

public const val _SC_DELAYTIMER_MAX: Int = 79

public const val _SC_FSYNC: Int = 80

public const val _SC_MAPPED_FILES: Int = 84

public const val _SC_MEMLOCK: Int = 85

public const val _SC_MEMLOCK_RANGE: Int = 86

public const val _SC_MEMORY_PROTECTION: Int = 87

public const val _SC_MESSAGE_PASSING: Int = 88

public const val _SC_MQ_OPEN_MAX: Int = 89

public const val _SC_MQ_PRIO_MAX: Int = 90

public const val _SC_PRIORITIZED_IO: Int = 91

public const val _SC_PRIORITY_SCHEDULING: Int = 92

public const val _SC_REALTIME_SIGNALS: Int = 93

public const val _SC_RTSIG_MAX: Int = 94

public const val _SC_SEMAPHORES: Int = 95

public const val _SC_SEM_NSEMS_MAX: Int = 96

public const val _SC_SEM_VALUE_MAX: Int = 97

public const val _SC_SHARED_MEMORY_OBJECTS: Int = 98

public const val _SC_SIGQUEUE_MAX: Int = 99

public const val _SC_SYNCHRONIZED_IO: Int = 100

public const val _SC_TIMERS: Int = 102

public const val _SC_TIMER_MAX: Int = 103

public const val _SC_2_C_BIND: Int = 51

public const val _SC_2_C_DEV: Int = 32

public const val _SC_2_C_VERSION: Int = 52

public const val _SC_2_FORT_DEV: Int = 33

public const val _SC_2_FORT_RUN: Int = 34

public const val _SC_2_LOCALEDEF: Int = 35

public const val _SC_2_SW_DEV: Int = 36

public const val _SC_2_UPE: Int = 53

public const val _SC_2_VERSION: Int = 31

public const val _SC_BC_BASE_MAX: Int = 23

public const val _SC_BC_DIM_MAX: Int = 24

public const val _SC_BC_SCALE_MAX: Int = 25

public const val _SC_BC_STRING_MAX: Int = 26

public const val _SC_COLL_WEIGHTS_MAX: Int = 50

public const val _SC_EXPR_NEST_MAX: Int = 28

public const val _SC_LINE_MAX: Int = 29

public const val _SC_RE_DUP_MAX: Int = 30

public const val _SC_XOPEN_CRYPT: Int = 56

public const val _SC_XOPEN_ENH_I18N: Int = 57

public const val _SC_XOPEN_SHM: Int = 55

public const val _SC_2_CHAR_TERM: Int = 54

public const val _SC_XOPEN_XCU_VERSION: Int = 109

public const val _SC_ATEXIT_MAX: Int = 47

public const val _SC_IOV_MAX: Int = 58

public const val _SC_XOPEN_UNIX: Int = 73

public const val _SC_T_IOV_MAX: Int = 0

public const val _SC_PHYS_PAGES: Int = 113

public const val _SC_AVPHYS_PAGES: Int = 114

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 101

public const val _SC_GETGR_R_SIZE_MAX: Int = 81

public const val _SC_GETPW_R_SIZE_MAX: Int = 82

public const val _SC_LOGIN_NAME_MAX: Int = 83

public const val _SC_THREAD_KEYS_MAX: Int = 68

public const val _SC_THREAD_STACK_MIN: Int = 69

public const val _SC_THREAD_THREADS_MAX: Int = 70

public const val _SC_TTY_NAME_MAX: Int = 104

public const val _SC_THREADS: Int = 60

public const val _SC_THREAD_ATTR_STACKADDR: Int = 61

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 62

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 64

public const val _SC_THREAD_PRIO_INHERIT: Int = 65

public const val _SC_THREAD_PRIO_PROTECT: Int = 66

public const val _SC_THREAD_PROCESS_SHARED: Int = 67

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 59

public const val _SC_XOPEN_LEGACY: Int = 112

public const val _SC_XOPEN_REALTIME: Int = 110

public const val _SC_XOPEN_REALTIME_THREADS: Int = 111

public const val _SC_XBS5_ILP32_OFF32: Int = 105

public const val _SC_XBS5_ILP32_OFFBIG: Int = 106

public const val _SC_XBS5_LP64_OFF64: Int = 107

public const val _SC_XBS5_LPBIG_OFFBIG: Int = 108

public const val _SC_2_PBS: Int = 132

public const val _SC_2_PBS_ACCOUNTING: Int = 133

public const val _SC_2_PBS_CHECKPOINT: Int = 134

public const val _SC_2_PBS_LOCATE: Int = 135

public const val _SC_2_PBS_MESSAGE: Int = 136

public const val _SC_2_PBS_TRACK: Int = 137

public const val _SC_ADVISORY_INFO: Int = 130

public const val _SC_BARRIERS: Int = 138

public const val _SC_CLOCK_SELECTION: Int = 139

public const val _SC_CPUTIME: Int = 140

public const val _SC_HOST_NAME_MAX: Int = 126

public const val _SC_MONOTONIC_CLOCK: Int = 141

public const val _SC_READER_WRITER_LOCKS: Int = 142

public const val _SC_REGEXP: Int = 127

public const val _SC_SHELL: Int = 128

public const val _SC_SPAWN: Int = 143

public const val _SC_SPIN_LOCKS: Int = 144

public const val _SC_SPORADIC_SERVER: Int = 145

public const val _SC_SS_REPL_MAX: Int = 156

public const val _SC_SYMLOOP_MAX: Int = 129

public const val _SC_THREAD_CPUTIME: Int = 146

public const val _SC_THREAD_SPORADIC_SERVER: Int = 147

public const val _SC_TIMEOUTS: Int = 148

public const val _SC_TRACE: Int = 149

public const val _SC_TRACE_EVENT_FILTER: Int = 150

public const val _SC_TRACE_EVENT_NAME_MAX: Int = 157

public const val _SC_TRACE_INHERIT: Int = 151

public const val _SC_TRACE_LOG: Int = 152

public const val _SC_TRACE_NAME_MAX: Int = 158

public const val _SC_TRACE_SYS_MAX: Int = 159

public const val _SC_TRACE_USER_EVENT_MAX: Int = 160

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 153

public const val _SC_V6_ILP32_OFF32: Int = 121

public const val _SC_V6_ILP32_OFFBIG: Int = 122

public const val _SC_V6_LP64_OFF64: Int = 123

public const val _SC_V6_LPBIG_OFFBIG: Int = 124

public const val _SC_XOPEN_STREAMS: Int = 125

public const val _SC_IPV6: Int = 154

public const val _SC_RAW_SOCKETS: Int = 155

public const val EMPTY: Short = 0

public const val RUN_LVL: Short = 1

public const val BOOT_TIME: Short = 2

public const val OLD_TIME: Short = 3

public const val NEW_TIME: Short = 4

public const val INIT_PROCESS: Short = 5

public const val LOGIN_PROCESS: Short = 6

public const val USER_PROCESS: Short = 7

public const val DEAD_PROCESS: Short = 8

public const val ACCOUNTING: Short = 9
