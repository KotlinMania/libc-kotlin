package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.aix.powerpc64.RLIM_INFINITY
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// dlfcn.h
public val RTLD_LAZY: CInt = 0x4

public val RTLD_NOW: CInt = 0x2

public val RTLD_GLOBAL: CInt = 0x10000

public val RTLD_LOCAL: CInt = 0x80000

public val RTLD_MEMBER: CInt = 0x40000

public val RTLD_NOAUTODEFER: CInt = 0x20000

public val RTLD_DEFAULT: MutPtr<CVoid> = MutPtr<CVoid>((-1).toLong())

public val RTLD_MYSELF: MutPtr<CVoid> = MutPtr<CVoid>((-2).toLong())

public val RTLD_NEXT: MutPtr<CVoid> = MutPtr<CVoid>((-3).toLong())

// fcntl.h
public val O_RDONLY: CInt = 0x0

public val O_WRONLY: CInt = 0x1

public val O_RDWR: CInt = 0x2

public val O_NDELAY: CInt = 0x8000

public val O_APPEND: CInt = 0x8

public val O_DSYNC: CInt = 0x400000

public val O_CREAT: CInt = 0x100

public val O_EXCL: CInt = 0x400

public val O_NOCTTY: CInt = 0x800

public val O_TRUNC: CInt = 0x200

public val O_NOFOLLOW: CInt = 0x1000000

public val O_DIRECTORY: CInt = 0x80000

public val O_SEARCH: CInt = 0x20

public val O_EXEC: CInt = 0x20

public val O_CLOEXEC: CInt = 0x800000

public val O_ACCMODE: CInt = O_RDONLY or O_WRONLY or O_RDWR or O_EXEC or O_SEARCH

public val O_DIRECT: CInt = 0x8000000

public val O_TTY_INIT: CInt = 0

public val O_RSYNC: CInt = 0x200000

public val O_LARGEFILE: CInt = 0x4000000

public val F_DUPFD: CInt = 0

public val F_DUPFD_CLOEXEC: CInt = 16

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETLK64: CInt = 11

public val F_GETLK: CInt = F_GETLK64

public val F_SETLK64: CInt = 12

public val F_SETLK: CInt = F_SETLK64

public val F_SETLKW64: CInt = 13

public val F_SETLKW: CInt = F_SETLKW64

public val F_GETOWN: CInt = 8

public val F_SETOWN: CInt = 9

public val F_CLOSEM: CInt = 10

public val F_DUP2FD: CInt = 14

public val F_TSTLK: CInt = 15

public val AT_FDCWD: CInt = -2

public val AT_SYMLINK_NOFOLLOW: CInt = 1

public val AT_SYMLINK_FOLLOW: CInt = 2

public val AT_REMOVEDIR: CInt = 1

public val AT_EACCESS: CInt = 1

public val O_SYNC: CInt = 16

public val O_NONBLOCK: CInt = 4

public val FASYNC: CInt = 0x20000

public val POSIX_FADV_NORMAL: CInt = 1

public val POSIX_FADV_SEQUENTIAL: CInt = 2

public val POSIX_FADV_RANDOM: CInt = 3

public val POSIX_FADV_WILLNEED: CInt = 4

public val POSIX_FADV_DONTNEED: CInt = 5

public val POSIX_FADV_NOREUSE: CInt = 6

// glob.h
public val GLOB_APPEND: CInt = 0x1

public val GLOB_DOOFFS: CInt = 0x2

public val GLOB_ERR: CInt = 0x4

public val GLOB_MARK: CInt = 0x8

public val GLOB_NOCHECK: CInt = 0x10

public val GLOB_NOSORT: CInt = 0x20

public val GLOB_NOESCAPE: CInt = 0x80

public val GLOB_NOSPACE: CInt = 0x2000

public val GLOB_ABORTED: CInt = 0x1000

public val GLOB_NOMATCH: CInt = 0x4000

public val GLOB_NOSYS: CInt = 0x8000

// langinfo.h
public val DAY_1: NlItem = 13

public val DAY_2: NlItem = 14

public val DAY_3: NlItem = 15

public val DAY_4: NlItem = 16

public val DAY_5: NlItem = 17

public val DAY_6: NlItem = 18

public val DAY_7: NlItem = 19

public val ABDAY_1: NlItem = 6

public val ABDAY_2: NlItem = 7

public val ABDAY_3: NlItem = 8

public val ABDAY_4: NlItem = 9

public val ABDAY_5: NlItem = 10

public val ABDAY_6: NlItem = 11

public val ABDAY_7: NlItem = 12

public val MON_1: NlItem = 32

public val MON_2: NlItem = 33

public val MON_3: NlItem = 34

public val MON_4: NlItem = 35

public val MON_5: NlItem = 36

public val MON_6: NlItem = 37

public val MON_7: NlItem = 38

public val MON_8: NlItem = 39

public val MON_9: NlItem = 40

public val MON_10: NlItem = 41

public val MON_11: NlItem = 42

public val MON_12: NlItem = 43

public val ABMON_1: NlItem = 20

public val ABMON_2: NlItem = 21

public val ABMON_3: NlItem = 22

public val ABMON_4: NlItem = 23

public val ABMON_5: NlItem = 24

public val ABMON_6: NlItem = 25

public val ABMON_7: NlItem = 26

public val ABMON_8: NlItem = 27

public val ABMON_9: NlItem = 28

public val ABMON_10: NlItem = 29

public val ABMON_11: NlItem = 30

public val ABMON_12: NlItem = 31

public val RADIXCHAR: NlItem = 44

public val THOUSEP: NlItem = 45

public val YESSTR: NlItem = 46

public val NOSTR: NlItem = 47

public val CRNCYSTR: NlItem = 48

public val D_T_FMT: NlItem = 1

public val D_FMT: NlItem = 2

public val T_FMT: NlItem = 3

public val AM_STR: NlItem = 4

public val PM_STR: NlItem = 5

public val CODESET: NlItem = 49

public val T_FMT_AMPM: NlItem = 55

public val ERA: NlItem = 56

public val ERA_D_FMT: NlItem = 57

public val ERA_D_T_FMT: NlItem = 58

public val ERA_T_FMT: NlItem = 59

public val ALT_DIGITS: NlItem = 60

public val YESEXPR: NlItem = 61

public val NOEXPR: NlItem = 62

// locale.h
public val LC_GLOBAL_LOCALE: LocaleT = MutPtr<CVoid>((-1).toLong())

public val LC_COLLATE: CInt = 0

public val LC_CTYPE: CInt = 1

public val LC_MONETARY: CInt = 2

public val LC_NUMERIC: CInt = 3

public val LC_TIME: CInt = 4

public val LC_MESSAGES: CInt = 5

public val LC_ALL: CInt = -1

public val LC_COLLATE_MASK: CInt = 1

public val LC_CTYPE_MASK: CInt = 2

public val LC_MESSAGES_MASK: CInt = 4

public val LC_MONETARY_MASK: CInt = 8

public val LC_NUMERIC_MASK: CInt = 16

public val LC_TIME_MASK: CInt = 32

public val LC_ALL_MASK: CInt = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK

// netdb.h
public val NI_MAXHOST: SocklenT = 1025u

public val NI_MAXSERV: SocklenT = 32u

public val NI_NOFQDN: SocklenT = 0x1u

public val NI_NUMERICHOST: SocklenT = 0x2u

public val NI_NAMEREQD: SocklenT = 0x4u

public val NI_NUMERICSERV: SocklenT = 0x8u

public val NI_DGRAM: SocklenT = 0x10u

public val NI_NUMERICSCOPE: SocklenT = 0x40u

public val EAI_AGAIN: CInt = 2

public val EAI_BADFLAGS: CInt = 3

public val EAI_FAIL: CInt = 4

public val EAI_FAMILY: CInt = 5

public val EAI_MEMORY: CInt = 6

public val EAI_NODATA: CInt = 7

public val EAI_NONAME: CInt = 8

public val EAI_SERVICE: CInt = 9

public val EAI_SOCKTYPE: CInt = 10

public val EAI_SYSTEM: CInt = 11

public val EAI_OVERFLOW: CInt = 13

public val AI_CANONNAME: CInt = 0x01

public val AI_PASSIVE: CInt = 0x02

public val AI_NUMERICHOST: CInt = 0x04

public val AI_ADDRCONFIG: CInt = 0x08

public val AI_V4MAPPED: CInt = 0x10

public val AI_ALL: CInt = 0x20

public val AI_NUMERICSERV: CInt = 0x40

public val AI_EXTFLAGS: CInt = 0x80

public val AI_DEFAULT: CInt = AI_V4MAPPED or AI_ADDRCONFIG

public val IPV6_ADDRFORM: CInt = 22

public val IPV6_ADDR_PREFERENCES: CInt = 74

public val IPV6_CHECKSUM: CInt = 39

public val IPV6_DONTFRAG: CInt = 45

public val IPV6_DSTOPTS: CInt = 54

public val IPV6_FLOWINFO_FLOWLABEL: CInt = 0x00ffffff

public val IPV6_FLOWINFO_PRIORITY: CInt = 0x0f000000

public val IPV6_FLOWINFO_PRIFLOW: CInt = 0x0fffffff

public val IPV6_FLOWINFO_SRFLAG: CInt = 0x10000000

public val IPV6_FLOWINFO_VERSION: CInt = 0xf0000000.toInt()

public val IPV6_HOPLIMIT: CInt = 40

public val IPV6_HOPOPTS: CInt = 52

public val IPV6_NEXTHOP: CInt = 48

public val IPV6_PATHMTU: CInt = 46

public val IPV6_PKTINFO: CInt = 33

public val IPV6_PREFER_SRC_CGA: CInt = 16

public val IPV6_PREFER_SRC_COA: CInt = 2

public val IPV6_PREFER_SRC_HOME: CInt = 1

public val IPV6_PREFER_SRC_NONCGA: CInt = 32

public val IPV6_PREFER_SRC_PUBLIC: CInt = 4

public val IPV6_PREFER_SRC_TMP: CInt = 8

public val IPV6_RECVDSTOPTS: CInt = 56

public val IPV6_RECVHOPLIMIT: CInt = 41

public val IPV6_RECVHOPOPTS: CInt = 53

public val IPV6_RECVPATHMTU: CInt = 47

public val IPV6_RECVRTHDR: CInt = 51

public val IPV6_RECVTCLASS: CInt = 42

public val IPV6_RTHDR: CInt = 50

public val IPV6_RTHDRDSTOPTS: CInt = 55

public val IPV6_TCLASS: CInt = 43

// net/bpf.h
public val DLT_NULL: CInt = 0x18

public val DLT_EN10MB: CInt = 0x6

public val DLT_EN3MB: CInt = 0x1a

public val DLT_AX25: CInt = 0x5

public val DLT_PRONET: CInt = 0xd

public val DLT_IEEE802: CInt = 0x7

public val DLT_ARCNET: CInt = 0x23

public val DLT_SLIP: CInt = 0x1c

public val DLT_PPP: CInt = 0x17

public val DLT_FDDI: CInt = 0xf

public val DLT_ATM: CInt = 0x25

public val DLT_IPOIB: CInt = 0xc7

public val BIOCSETF: CInt = 0x80104267.toInt()

public val BIOCGRTIMEOUT: CInt = 0x4010426e

public val BIOCGBLEN: CInt = 0x40044266

public val BIOCSBLEN: CInt = 0xc0044266.toInt()

public val BIOCFLUSH: CInt = 0x20004268

public val BIOCPROMISC: CInt = 0x20004269

public val BIOCGDLT: CInt = 0x4004426a

public val BIOCSRTIMEOUT: CInt = 0x8010426d.toInt()

public val BIOCGSTATS: CInt = 0x4008426f

public val BIOCIMMEDIATE: CInt = 0x80044270.toInt()

public val BIOCVERSION: CInt = 0x40044271

public val BIOCSDEVNO: CInt = 0x20004272

public val BIOCGETIF: CInt = 0x4020426b

public val BIOCSETIF: CInt = 0x8020426c.toInt()

public val BPF_ABS: CInt = 32

public val BPF_ADD: CInt = 0

public val BPF_ALIGNMENT: CUlong = 4uL

public val BPF_ALU: CInt = 4

public val BPF_AND: CInt = 80

public val BPF_B: CInt = 16

public val BPF_DIV: CInt = 48

public val BPF_H: CInt = 8

public val BPF_IMM: CInt = 0

public val BPF_IND: CInt = 64

public val BPF_JA: CInt = 0

public val BPF_JEQ: CInt = 16

public val BPF_JGE: CInt = 48

public val BPF_JGT: CInt = 32

public val BPF_JMP: CInt = 5

public val BPF_JSET: CInt = 64

public val BPF_K: CInt = 0

public val BPF_LD: CInt = 0

public val BPF_LDX: CInt = 1

public val BPF_LEN: CInt = 128

public val BPF_LSH: CInt = 96

public val BPF_MAXINSNS: CInt = 512

public val BPF_MEM: CInt = 96

public val BPF_MEMWORDS: CInt = 16

public val BPF_MISC: CInt = 7

public val BPF_MSH: CInt = 160

public val BPF_MUL: CInt = 32

public val BPF_NEG: CInt = 128

public val BPF_OR: CInt = 64

public val BPF_RET: CInt = 6

public val BPF_RSH: CInt = 112

public val BPF_ST: CInt = 2

public val BPF_STX: CInt = 3

public val BPF_SUB: CInt = 16

public val BPF_W: CInt = 0

public val BPF_X: CInt = 8

// net/if.h
public val IFNET_SLOWHZ: CInt = 1

public val IFQ_MAXLEN: CInt = 50

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

public val IFF_MULTICAST: CInt = 0x80000

public val IFF_LINK0: CInt = 0x100000

public val IFF_LINK1: CInt = 0x200000

public val IFF_LINK2: CInt = 0x400000

public val IFF_OACTIVE: CInt = 0x400

public val IFF_SIMPLEX: CInt = 0x800

// net/ifArp.h
public val ARPHRD_ETHER: CInt = 1

public val ARPHRD_802_5: CInt = 6

public val ARPHRD_802_3: CInt = 6

public val ARPHRD_FDDI: CInt = 1

// net/route.h
public val RTM_ADD: CInt = 0x1

public val RTM_DELETE: CInt = 0x2

public val RTM_CHANGE: CInt = 0x3

public val RTM_GET: CInt = 0x4

public val RTM_LOSING: CInt = 0x5

public val RTM_REDIRECT: CInt = 0x6

public val RTM_MISS: CInt = 0x7

public val RTM_LOCK: CInt = 0x8

public val RTM_OLDADD: CInt = 0x9

public val RTM_OLDDEL: CInt = 0xa

public val RTM_RESOLVE: CInt = 0xb

public val RTM_NEWADDR: CInt = 0xc

public val RTM_DELADDR: CInt = 0xd

public val RTM_IFINFO: CInt = 0xe

public val RTM_EXPIRE: CInt = 0xf

public val RTM_RTLOST: CInt = 0x10

public val RTM_GETNEXT: CInt = 0x11

public val RTM_SAMEADDR: CInt = 0x12

public val RTM_SET: CInt = 0x13

public val RTV_MTU: CInt = 0x1

public val RTV_HOPCOUNT: CInt = 0x2

public val RTV_EXPIRE: CInt = 0x4

public val RTV_RPIPE: CInt = 0x8

public val RTV_SPIPE: CInt = 0x10

public val RTV_SSTHRESH: CInt = 0x20

public val RTV_RTT: CInt = 0x40

public val RTV_RTTVAR: CInt = 0x80

public val RTA_DST: CInt = 0x1

public val RTA_GATEWAY: CInt = 0x2

public val RTA_NETMASK: CInt = 0x4

public val RTA_GENMASK: CInt = 0x8

public val RTA_IFP: CInt = 0x10

public val RTA_IFA: CInt = 0x20

public val RTA_AUTHOR: CInt = 0x40

public val RTA_BRD: CInt = 0x80

public val RTA_DOWNSTREAM: CInt = 0x100

public val RTAX_DST: CInt = 0

public val RTAX_GATEWAY: CInt = 1

public val RTAX_NETMASK: CInt = 2

public val RTAX_GENMASK: CInt = 3

public val RTAX_IFP: CInt = 4

public val RTAX_IFA: CInt = 5

public val RTAX_AUTHOR: CInt = 6

public val RTAX_BRD: CInt = 7

public val RTAX_MAX: CInt = 8

public val RTF_UP: CInt = 0x1

public val RTF_GATEWAY: CInt = 0x2

public val RTF_HOST: CInt = 0x4

public val RTF_REJECT: CInt = 0x8

public val RTF_DYNAMIC: CInt = 0x10

public val RTF_MODIFIED: CInt = 0x20

public val RTF_DONE: CInt = 0x40

public val RTF_MASK: CInt = 0x80

public val RTF_CLONING: CInt = 0x100

public val RTF_XRESOLVE: CInt = 0x200

public val RTF_LLINFO: CInt = 0x400

public val RTF_STATIC: CInt = 0x800

public val RTF_BLACKHOLE: CInt = 0x1000

public val RTF_BUL: CInt = 0x2000

public val RTF_PROTO2: CInt = 0x4000

public val RTF_PROTO1: CInt = 0x8000

public val RTF_CLONE: CInt = 0x10000

public val RTF_CLONED: CInt = 0x20000

public val RTF_PROTO3: CInt = 0x40000

public val RTF_BCE: CInt = 0x80000

public val RTF_PINNED: CInt = 0x100000

public val RTF_LOCAL: CInt = 0x200000

public val RTF_BROADCAST: CInt = 0x400000

public val RTF_MULTICAST: CInt = 0x800000

public val RTF_ACTIVE_DGD: CInt = 0x1000000

public val RTF_STOPSRCH: CInt = 0x2000000

public val RTF_FREE_IN_PROG: CInt = 0x4000000

public val RTF_PERMANENT6: CInt = 0x8000000

public val RTF_UNREACHABLE: CInt = 0x10000000

public val RTF_CACHED: CInt = 0x20000000

public val RTF_SMALLMTU: CInt = 0x40000

// netinet/in.h
public val IPPROTO_HOPOPTS: CInt = 0

public val IPPROTO_IGMP: CInt = 2

public val IPPROTO_GGP: CInt = 3

public val IPPROTO_IPIP: CInt = 4

public val IPPROTO_EGP: CInt = 8

public val IPPROTO_PUP: CInt = 12

public val IPPROTO_IDP: CInt = 22

public val IPPROTO_TP: CInt = 29

public val IPPROTO_ROUTING: CInt = 43

public val IPPROTO_FRAGMENT: CInt = 44

public val IPPROTO_QOS: CInt = 45

public val IPPROTO_RSVP: CInt = 46

public val IPPROTO_GRE: CInt = 47

public val IPPROTO_ESP: CInt = 50

public val IPPROTO_AH: CInt = 51

public val IPPROTO_NONE: CInt = 59

public val IPPROTO_DSTOPTS: CInt = 60

public val IPPROTO_LOCAL: CInt = 63

public val IPPROTO_EON: CInt = 80

public val IPPROTO_BIP: CInt = 0x53

public val IPPROTO_SCTP: CInt = 132

public val IPPROTO_MH: CInt = 135

public val IPPROTO_GIF: CInt = 140

public val IPPROTO_RAW: CInt = 255

public val IP_OPTIONS: CInt = 1

public val IP_HDRINCL: CInt = 2

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_UNICAST_HOPS: CInt = 4

public val IP_RECVOPTS: CInt = 5

public val IP_RECVRETOPTS: CInt = 6

public val IP_RECVDSTADDR: CInt = 7

public val IP_RETOPTS: CInt = 8

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_HOPS: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IP_RECVMACHDR: CInt = 14

public val IP_RECVIFINFO: CInt = 15

public val IP_BROADCAST_IF: CInt = 16

public val IP_DHCPMODE: CInt = 17

public val IP_RECVIF: CInt = 20

public val IP_ADDRFORM: CInt = 22

public val IP_DONTFRAG: CInt = 25

public val IP_FINDPMTU: CInt = 26

public val IP_PMTUAGE: CInt = 27

public val IP_RECVINTERFACE: CInt = 32

public val IP_RECVTTL: CInt = 34

public val IP_BLOCK_SOURCE: CInt = 58

public val IP_UNBLOCK_SOURCE: CInt = 59

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 60

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 61

public val IP_DEFAULT_MULTICAST_TTL: CInt = 1

public val IP_DEFAULT_MULTICAST_LOOP: CInt = 1

public val IP_INC_MEMBERSHIPS: CInt = 20

public val IP_INIT_MEMBERSHIP: CInt = 20

public val IPV6_UNICAST_HOPS: CInt = IP_TTL

public val IPV6_MULTICAST_IF: CInt = IP_MULTICAST_IF

public val IPV6_MULTICAST_HOPS: CInt = IP_MULTICAST_TTL

public val IPV6_MULTICAST_LOOP: CInt = IP_MULTICAST_LOOP

public val IPV6_RECVPKTINFO: CInt = 35

public val IPV6_V6ONLY: CInt = 37

public val IPV6_ADD_MEMBERSHIP: CInt = IP_ADD_MEMBERSHIP

public val IPV6_DROP_MEMBERSHIP: CInt = IP_DROP_MEMBERSHIP

public val IPV6_JOIN_GROUP: CInt = IP_ADD_MEMBERSHIP

public val IPV6_LEAVE_GROUP: CInt = IP_DROP_MEMBERSHIP

public val MCAST_BLOCK_SOURCE: CInt = 64

public val MCAST_EXCLUDE: CInt = 2

public val MCAST_INCLUDE: CInt = 1

public val MCAST_JOIN_GROUP: CInt = 62

public val MCAST_JOIN_SOURCE_GROUP: CInt = 66

public val MCAST_LEAVE_GROUP: CInt = 63

public val MCAST_LEAVE_SOURCE_GROUP: CInt = 67

public val MCAST_UNBLOCK_SOURCE: CInt = 65

// netinet/ip.h
public val MAXTTL: CInt = 255

public val IPDEFTTL: CInt = 64

public val IPOPT_CONTROL: CInt = 0

public val IPOPT_EOL: CInt = 0

public val IPOPT_LSRR: CInt = 131

public val IPOPT_MINOFF: CInt = 4

public val IPOPT_NOP: CInt = 1

public val IPOPT_OFFSET: CInt = 2

public val IPOPT_OLEN: CInt = 1

public val IPOPT_OPTVAL: CInt = 0

public val IPOPT_RESERVED1: CInt = 0x20

public val IPOPT_RESERVED2: CInt = 0x60

public val IPOPT_RR: CInt = 7

public val IPOPT_SSRR: CInt = 137

public val IPOPT_TS: CInt = 68

public val IPOPT_TS_PRESPEC: CInt = 3

public val IPOPT_TS_TSANDADDR: CInt = 1

public val IPOPT_TS_TSONLY: CInt = 0

public val IPTOS_LOWDELAY: CInt = 16

public val IPTOS_PREC_CRITIC_ECP: CInt = 160

public val IPTOS_PREC_FLASH: CInt = 96

public val IPTOS_PREC_FLASHOVERRIDE: CInt = 128

public val IPTOS_PREC_IMMEDIATE: CInt = 64

public val IPTOS_PREC_INTERNETCONTROL: CInt = 192

public val IPTOS_PREC_NETCONTROL: CInt = 224

public val IPTOS_PREC_PRIORITY: CInt = 32

public val IPTOS_PREC_ROUTINE: CInt = 16

public val IPTOS_RELIABILITY: CInt = 4

public val IPTOS_THROUGHPUT: CInt = 8

public val IPVERSION: CInt = 4

// netinet/tcp.h
public val TCP_NODELAY: CInt = 0x1

public val TCP_MAXSEG: CInt = 0x2

public val TCP_RFC1323: CInt = 0x4

public val TCP_KEEPALIVE: CInt = 0x8

public val TCP_KEEPIDLE: CInt = 0x11

public val TCP_KEEPINTVL: CInt = 0x12

public val TCP_KEEPCNT: CInt = 0x13

public val TCP_NODELAYACK: CInt = 0x14

// pthread.h
public val PTHREAD_BARRIER_SERIAL_THREAD: CInt = 2

public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_CREATE_DETACHED: CInt = 1

public val PTHREAD_PROCESS_SHARED: CInt = 0

public val PTHREAD_PROCESS_PRIVATE: CUshort = 1u

public val PAGESIZE: CInt = 4096

public val PTHREAD_STACK_MIN: SizeT = PAGESIZE.toULong() * 4uL

public val PTHREAD_MUTEX_NORMAL: CInt = 5

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 3

public val PTHREAD_MUTEX_RECURSIVE: CInt = 4

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_MUTEX_ROBUST: CInt = 1

public val PTHREAD_MUTEX_STALLED: CInt = 0

public val PTHREAD_PRIO_INHERIT: CInt = 3

public val PTHREAD_PRIO_NONE: CInt = 1

public val PTHREAD_PRIO_PROTECT: CInt = 2

// regex.h
public val REG_EXTENDED: CInt = 1

public val REG_ICASE: CInt = 2

public val REG_NEWLINE: CInt = 4

public val REG_NOSUB: CInt = 8

public val REG_NOTBOL: CInt = 0x100

public val REG_NOTEOL: CInt = 0x200

public val REG_NOMATCH: CInt = 1

public val REG_BADPAT: CInt = 2

public val REG_ECOLLATE: CInt = 3

public val REG_ECTYPE: CInt = 4

public val REG_EESCAPE: CInt = 5

public val REG_ESUBREG: CInt = 6

public val REG_EBRACK: CInt = 7

public val REG_EPAREN: CInt = 8

public val REG_EBRACE: CInt = 9

public val REG_BADBR: CInt = 10

public val REG_ERANGE: CInt = 11

public val REG_ESPACE: CInt = 12

public val REG_BADRPT: CInt = 13

public val REG_ECHAR: CInt = 14

public val REG_EBOL: CInt = 15

public val REG_EEOL: CInt = 16

public val REG_ENOSYS: CInt = 17

// rpcsvc/mount.h
public val NFSMNT_SOFT: CInt = 0x001

public val NFSMNT_WSIZE: CInt = 0x002

public val NFSMNT_RSIZE: CInt = 0x004

public val NFSMNT_TIMEO: CInt = 0x008

public val NFSMNT_RETRANS: CInt = 0x010

public val NFSMNT_HOSTNAME: CInt = 0x020

public val NFSMNT_INT: CInt = 0x040

public val NFSMNT_NOAC: CInt = 0x080

public val NFSMNT_ACREGMIN: CInt = 0x0100

public val NFSMNT_ACREGMAX: CInt = 0x0200

public val NFSMNT_ACDIRMIN: CInt = 0x0400

public val NFSMNT_ACDIRMAX: CInt = 0x0800

// rpcsvc/rstat.h
public val CPUSTATES: CInt = 4

// semaphore.h
public val SEM_FAILED: MutPtr<SemT> = MutPtr<SemT>((-1).toLong())

// spawn.h
// DIFF(main): changed to `cShort` in f62eb023ab
public val POSIX_SPAWN_SETPGROUP: CInt = 0x1

public val POSIX_SPAWN_SETSIGMASK: CInt = 0x2

public val POSIX_SPAWN_SETSIGDEF: CInt = 0x4

public val POSIX_SPAWN_SETSCHEDULER: CInt = 0x8

public val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x10

public val POSIX_SPAWN_RESETIDS: CInt = 0x20

public val POSIX_SPAWN_FORK_HANDLERS: CInt = 0x1000

// stdio.h
public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val IOFBF: CInt = 0

public val IONBF: CInt = 4

public val IOLBF: CInt = 64

public val BUFSIZ: CUint = 4096u

public val FOPEN_MAX: CUint = 32767u

public val FILENAME_MAX: CUint = 255u

public val L_TMPNAM: CUint = 21u

public val TMP_MAX: CUint = 16384u

// stdlib.h
public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 32767

// sys/access.h
public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

// sys/aio.h
public val LIO_NOP: CInt = 0

public val LIO_READ: CInt = 1

public val LIO_WRITE: CInt = 2

public val LIO_NOWAIT: CInt = 0

public val LIO_WAIT: CInt = 1

public val AIO_ALLDONE: CInt = 2

public val AIO_CANCELED: CInt = 0

public val AIO_NOTCANCELED: CInt = 1

// sys/errno.h
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

public val ENOMSG: CInt = 35

public val EIDRM: CInt = 36

public val ECHRNG: CInt = 37

public val EL2NSYNC: CInt = 38

public val EL3HLT: CInt = 39

public val EL3RST: CInt = 40

public val ELNRNG: CInt = 41

public val EUNATCH: CInt = 42

public val ENOCSI: CInt = 43

public val EL2HLT: CInt = 44

public val EDEADLK: CInt = 45

public val ENOTREADY: CInt = 46

public val EWRPROTECT: CInt = 47

public val EFORMAT: CInt = 48

public val ENOLCK: CInt = 49

public val ENOCONNECT: CInt = 50

public val ESTALE: CInt = 52

public val EDIST: CInt = 53

// POSIX allows EWOULDBLOCK to be the same value as EAGAIN.
public val EWOULDBLOCK: CInt = EAGAIN

public val EINPROGRESS: CInt = 55

public val EALREADY: CInt = 56

public val ENOTSOCK: CInt = 57

public val EDESTADDRREQ: CInt = 58

public val EMSGSIZE: CInt = 59

public val EPROTOTYPE: CInt = 60

public val ENOPROTOOPT: CInt = 61

public val EPROTONOSUPPORT: CInt = 62

public val ESOCKTNOSUPPORT: CInt = 63

public val EOPNOTSUPP: CInt = 64

public val EPFNOSUPPORT: CInt = 65

public val EAFNOSUPPORT: CInt = 66

public val EADDRINUSE: CInt = 67

public val EADDRNOTAVAIL: CInt = 68

public val ENETDOWN: CInt = 69

public val ENETUNREACH: CInt = 70

public val ENETRESET: CInt = 71

public val ECONNABORTED: CInt = 72

public val ECONNRESET: CInt = 73

public val ENOBUFS: CInt = 74

public val EISCONN: CInt = 75

public val ENOTCONN: CInt = 76

public val ESHUTDOWN: CInt = 77

public val ETIMEDOUT: CInt = 78

public val ECONNREFUSED: CInt = 79

public val EHOSTDOWN: CInt = 80

public val EHOSTUNREACH: CInt = 81

public val ERESTART: CInt = 82

public val EPROCLIM: CInt = 83

public val EUSERS: CInt = 84

public val ELOOP: CInt = 85

public val ENAMETOOLONG: CInt = 86

public val ENOTEMPTY: CInt = 87

public val EDQUOT: CInt = 88

public val ECORRUPT: CInt = 89

public val ESYSERROR: CInt = 90

public val EREMOTE: CInt = 93

public val ENOTRECOVERABLE: CInt = 94

public val EOWNERDEAD: CInt = 95

// errnos 96-108 reserved for future use compatible with AIX PS/2
public val ENOSYS: CInt = 109

public val EMEDIA: CInt = 110

public val ESOFT: CInt = 111

public val ENOATTR: CInt = 112

public val ESAD: CInt = 113

public val ENOTRUST: CInt = 114

public val ETOOMANYREFS: CInt = 115

public val EILSEQ: CInt = 116

public val ECANCELED: CInt = 117

public val ENOSR: CInt = 118

public val ETIME: CInt = 119

public val EBADMSG: CInt = 120

public val EPROTO: CInt = 121

public val ENODATA: CInt = 122

public val ENOSTR: CInt = 123

public val ENOTSUP: CInt = 124

public val EMULTIHOP: CInt = 125

public val ENOLINK: CInt = 126

public val EOVERFLOW: CInt = 127

// sys/dr.h
public val LPAR_INFO_FORMAT1: CInt = 1

public val LPAR_INFO_FORMAT2: CInt = 2

public val WPAR_INFO_FORMAT: CInt = 3

public val PROC_MODULE_INFO: CInt = 4

public val NUM_PROC_MODULE_TYPES: CInt = 5

public val LPAR_INFO_VRME_NUM_POOLS: CInt = 6

public val LPAR_INFO_VRME_POOLS: CInt = 7

public val LPAR_INFO_VRME_LPAR: CInt = 8

public val LPAR_INFO_VRME_RESET_HWMARKS: CInt = 9

public val LPAR_INFO_VRME_ALLOW_DESIRED: CInt = 10

public val EMTP_INFO_FORMAT: CInt = 11

public val LPAR_INFO_LPM_CAPABILITY: CInt = 12

public val ENERGYSCALE_INFO: CInt = 13

// sys/file.h
public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_NB: CInt = 4

public val LOCK_UN: CInt = 8

// sys/flock.h
public val F_RDLCK: CShort = 1

public val F_WRLCK: CShort = 2

public val F_UNLCK: CShort = 3

// sys/fs/quotaCommon.h
public val Q_QUOTAON: CInt = 0x100

public val Q_QUOTAOFF: CInt = 0x200

public val Q_SETUSE: CInt = 0x500

public val Q_SYNC: CInt = 0x600

public val Q_GETQUOTA: CInt = 0x300

public val Q_SETQLIM: CInt = 0x400

public val Q_SETQUOTA: CInt = 0x400

// sys/ioctl.h
public val IOCPARM_MASK: CInt = 0x7f

public val IOC_VOID: CInt = 0x20000000

public val IOC_OUT: CInt = 0x40000000

public val IOC_IN: CInt = 0x40000000 shl 1

public val IOC_INOUT: CInt = IOC_IN or IOC_OUT

public val FIOCLEX: CInt = 0x20006601

public val FIONCLEX: CInt = 0x20006602

public val FIONREAD: CInt = 0x4004667f

public val FIONBIO: CInt = 0x8004667e.toInt()

public val FIOASYNC: CInt = 0x8004667d.toInt()

public val FIOSETOWN: CInt = 0x8004667c.toInt()

public val FIOGETOWN: CInt = 0x4004667b

public val TIOCGETD: CInt = 0x40047400

public val TIOCSETD: CInt = 0x80047401.toInt()

public val TIOCHPCL: CInt = 0x20007402

public val TIOCMODG: CInt = 0x40047403

public val TIOCMODS: CInt = 0x80047404.toInt()

public val TIOCM_LE: CInt = 0x1

public val TIOCM_DTR: CInt = 0x2

public val TIOCM_RTS: CInt = 0x4

public val TIOCM_ST: CInt = 0x8

public val TIOCM_SR: CInt = 0x10

public val TIOCM_CTS: CInt = 0x20

public val TIOCM_CAR: CInt = 0x40

public val TIOCM_CD: CInt = 0x40

public val TIOCM_RNG: CInt = 0x80

public val TIOCM_RI: CInt = 0x80

public val TIOCM_DSR: CInt = 0x100

public val TIOCGETP: CInt = 0x40067408

public val TIOCSETP: CInt = 0x80067409.toInt()

public val TIOCSETN: CInt = 0x8006740a.toInt()

public val TIOCEXCL: CInt = 0x2000740d

public val TIOCNXCL: CInt = 0x2000740e

public val TIOCFLUSH: CInt = 0x80047410.toInt()

public val TIOCSETC: CInt = 0x80067411.toInt()

public val TIOCGETC: CInt = 0x40067412

public val TANDEM: CInt = 0x1

public val CBREAK: CInt = 0x2

public val LCASE: CInt = 0x4

public val MDMBUF: CInt = 0x800000

public val XTABS: CInt = 0xc00

public val SIOCADDMULTI: CInt = 0x80206931.toInt()

public val SIOCADDRT: CInt = 0x8038720a.toInt()

public val SIOCDARP: CInt = 0x804c6920.toInt()

public val SIOCDELMULTI: CInt = 0x80206932.toInt()

public val SIOCDELRT: CInt = 0x8038720b.toInt()

public val SIOCDIFADDR: CInt = 0x80286919.toInt()

public val SIOCGARP: CInt = 0xc04c6926.toInt()

public val SIOCGIFADDR: CInt = 0xc0286921.toInt()

public val SIOCGIFBRDADDR: CInt = 0xc0286923.toInt()

public val SIOCGIFCONF: CInt = 0xc0106945.toInt()

public val SIOCGIFDSTADDR: CInt = 0xc0286922.toInt()

public val SIOCGIFFLAGS: CInt = 0xc0286911.toInt()

public val SIOCGIFHWADDR: CInt = 0xc0546995.toInt()

public val SIOCGIFMETRIC: CInt = 0xc0286917.toInt()

public val SIOCGIFMTU: CInt = 0xc0286956.toInt()

public val SIOCGIFNETMASK: CInt = 0xc0286925.toInt()

public val SIOCSARP: CInt = 0x804c691e.toInt()

public val SIOCSIFADDR: CInt = 0x8028690c.toInt()

public val SIOCSIFBRDADDR: CInt = 0x80286913.toInt()

public val SIOCSIFDSTADDR: CInt = 0x8028690e.toInt()

public val SIOCSIFFLAGS: CInt = 0x80286910.toInt()

public val SIOCSIFMETRIC: CInt = 0x80286918.toInt()

public val SIOCSIFMTU: CInt = 0x80286958.toInt()

public val SIOCSIFNETMASK: CInt = 0x80286916.toInt()

public val TIOCUCNTL: CInt = 0x80047466.toInt()

public val TIOCCONS: CInt = 0x80047462.toInt()

public val TIOCPKT: CInt = 0x80047470.toInt()

public val TIOCPKT_DATA: CInt = 0

public val TIOCPKT_FLUSHREAD: CInt = 1

public val TIOCPKT_FLUSHWRITE: CInt = 2

public val TIOCPKT_NOSTOP: CInt = 0x10

public val TIOCPKT_DOSTOP: CInt = 0x20

public val TIOCPKT_START: CInt = 8

public val TIOCPKT_STOP: CInt = 4

// sys/ipc.h
public val IPC_ALLOC: CInt = 32768

public val IPC_CREAT: CInt = 8192

public val IPC_EXCL: CInt = 1024

public val IPC_NOWAIT: CInt = 2048

public val IPC_RMID: CInt = 0

public val IPC_SET: CInt = 101

public val IPC_R: CInt = 256

public val IPC_W: CInt = 128

public val IPC_O: CInt = 512

public val IPC_NOERROR: CInt = 4096

public val IPC_STAT: CInt = 102

public val IPC_PRIVATE: KeyT = -1

public val SHM_LOCK: CInt = 201

public val SHM_UNLOCK: CInt = 202

// sys/ldr.h
public val L_GETMESSAGES: CInt = 1

public val L_GETINFO: CInt = 2

public val L_GETLIBPATH: CInt = 3

public val L_GETKERNINFO: CInt = 4

public val L_GETLIB32INFO: CInt = 5

public val L_GETLIB64INFO: CInt = 6

public val L_GETPROCINFO: CInt = 7

public val L_GETXINFO: CInt = 8

// sys/limits.h
public val PATH_MAX: CInt = 1023

public val IOV_MAX: CInt = 16

public val AIO_LISTIO_MAX: CInt = 4096

public val PIPE_BUF: Int = 32768

public val OPEN_MAX: CInt = 65534

public val MAX_INPUT: CInt = 512

public val MAX_CANON: CInt = 256

public val ARG_MAX: CInt = 1048576

public val BC_BASE_MAX: CInt = 99

public val BC_DIM_MAX: CInt = 0x800

public val BC_SCALE_MAX: CInt = 99

public val BC_STRING_MAX: CInt = 0x800

public val CHARCLASS_NAME_MAX: CInt = 14

public val CHILD_MAX: CInt = 128

public val COLL_WEIGHTS_MAX: CInt = 4

public val EXPR_NEST_MAX: CInt = 32

public val NZERO: CInt = 20

// sys/lockf.h
public val F_LOCK: CInt = 1

public val F_TEST: CInt = 3

public val F_TLOCK: CInt = 2

public val F_ULOCK: CInt = 0

// sys/machine.h
public val BIG_ENDIAN: CInt = 4321

public val LITTLE_ENDIAN: CInt = 1234

public val PDP_ENDIAN: CInt = 3412

// sys/mman.h
public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val MAP_FILE: CInt = 0

public val MAP_SHARED: CInt = 1

public val MAP_PRIVATE: CInt = 2

public val MAP_FIXED: CInt = 0x100

public val MAP_ANON: CInt = 0x10

public val MAP_ANONYMOUS: CInt = 0x10

public val MAP_FAILED: MutPtr<CVoid> = MutPtr<CVoid>((0.inv()).toLong())

public val MAP_TYPE: CInt = 0xf0

public val MCL_CURRENT: CInt = 0x100

public val MCL_FUTURE: CInt = 0x200

public val MS_SYNC: CInt = 0x20

public val MS_ASYNC: CInt = 0x10

public val MS_INVALIDATE: CInt = 0x40

public val POSIX_MADV_NORMAL: CInt = 1

public val POSIX_MADV_RANDOM: CInt = 3

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 4

public val POSIX_MADV_DONTNEED: CInt = 5

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

// sys/mode.h
public val S_IFMT: ModeT = 61440u

public val S_IFREG: ModeT = 32768u

public val S_IFDIR: ModeT = 16384u

public val S_IFBLK: ModeT = 24576u

public val S_IFCHR: ModeT = 8192u

public val S_IFIFO: ModeT = 4096u

public val S_IRWXU: ModeT = 448u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRWXG: ModeT = 56u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IRWXO: ModeT = 7u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IEXEC: ModeT = 64u

public val S_IWRITE: ModeT = 128u

public val S_IREAD: ModeT = 256u

// sys/msg.h
public val MSG_NOERROR: CInt = 4096

// sys/mSignal.h
public val SIGSTKSZ: SizeT = 4096uL

public val MINSIGSTKSZ: SizeT = 1200uL

// sys/params.h
public val MAXPATHLEN: CInt = PATH_MAX + 1

public val MAXSYMLINKS: CInt = 20

public val MAXHOSTNAMELEN: CInt = 256

public val MAXUPRC: CInt = 128

public val NGROUPS_MAX: CUlong = 2048uL

public val NGROUPS: CUlong = NGROUPS_MAX

public val NOFILE: CInt = OPEN_MAX

// sys/poll.h
public val POLLIN: CShort = 0x0001

public val POLLPRI: CShort = 0x0004

public val POLLOUT: CShort = 0x0002

public val POLLERR: CShort = 0x4000

public val POLLHUP: CShort = 0x2000

public val POLLMSG: CShort = 0x0080

public val POLLSYNC: CShort = 0x8000.toShort()

public val POLLNVAL: CShort = POLLSYNC

public val POLLNORM: CShort = POLLIN

public val POLLRDNORM: CShort = 0x0010

public val POLLWRNORM: CShort = POLLOUT

public val POLLRDBAND: CShort = 0x0020

public val POLLWRBAND: CShort = 0x0040

// sys/pollset.h
public val PS_ADD: CUchar = 0u

public val PS_MOD: CUchar = 1u

public val PS_DELETE: CUchar = 2u

public val PS_REPLACE: CUchar = 3u

// sys/ptrace.h
public val PT_TRACE_ME: CInt = 0

public val PT_READ_I: CInt = 1

public val PT_READ_D: CInt = 2

public val PT_WRITE_I: CInt = 4

public val PT_WRITE_D: CInt = 5

public val PT_CONTINUE: CInt = 7

public val PT_KILL: CInt = 8

public val PT_STEP: CInt = 9

public val PT_READ_GPR: CInt = 11

public val PT_READ_FPR: CInt = 12

public val PT_WRITE_GPR: CInt = 14

public val PT_WRITE_FPR: CInt = 15

public val PT_READ_BLOCK: CInt = 17

public val PT_WRITE_BLOCK: CInt = 19

public val PT_ATTACH: CInt = 30

public val PT_DETACH: CInt = 31

public val PT_REGSET: CInt = 32

public val PT_REATT: CInt = 33

public val PT_LDINFO: CInt = 34

public val PT_MULTI: CInt = 35

public val PT_NEXT: CInt = 36

public val PT_SET: CInt = 37

public val PT_CLEAR: CInt = 38

public val PT_LDXINFO: CInt = 39

public val PT_QUERY: CInt = 40

public val PT_WATCH: CInt = 41

public val PTT_CONTINUE: CInt = 50

public val PTT_STEP: CInt = 51

public val PTT_READ_SPRS: CInt = 52

public val PTT_WRITE_SPRS: CInt = 53

public val PTT_READ_GPRS: CInt = 54

public val PTT_WRITE_GPRS: CInt = 55

public val PTT_READ_FPRS: CInt = 56

public val PTT_WRITE_FPRS: CInt = 57

public val PTT_READ_VEC: CInt = 58

public val PTT_WRITE_VEC: CInt = 59

public val PTT_WATCH: CInt = 60

public val PTT_SET_TRAP: CInt = 61

public val PTT_CLEAR_TRAP: CInt = 62

public val PTT_READ_UKEYSET: CInt = 63

public val PT_GET_UKEY: CInt = 64

public val PTT_READ_FPSCR_HI: CInt = 65

public val PTT_WRITE_FPSCR_HI: CInt = 66

public val PTT_READ_VSX: CInt = 67

public val PTT_WRITE_VSX: CInt = 68

public val PTT_READ_TM: CInt = 69

public val PTRACE_ATTACH: CInt = 14

public val PTRACE_CONT: CInt = 7

public val PTRACE_DETACH: CInt = 15

public val PTRACE_GETFPREGS: CInt = 12

public val PTRACE_GETREGS: CInt = 10

public val PTRACE_KILL: CInt = 8

public val PTRACE_PEEKDATA: CInt = 2

public val PTRACE_PEEKTEXT: CInt = 1

public val PTRACE_PEEKUSER: CInt = 3

public val PTRACE_POKEDATA: CInt = 5

public val PTRACE_POKETEXT: CInt = 4

public val PTRACE_POKEUSER: CInt = 6

public val PTRACE_SETFPREGS: CInt = 13

public val PTRACE_SETREGS: CInt = 11

public val PTRACE_SINGLESTEP: CInt = 9

public val PTRACE_SYSCALL: CInt = 16

public val PTRACE_TRACEME: CInt = 0

// sys/resource.h
public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_RSS: CInt = 5

public val RLIMIT_AS: CInt = 6

public val RLIMIT_NOFILE: CInt = 7

public val RLIMIT_THREADS: CInt = 8

public val RLIMIT_NPROC: CInt = 9

public val RUSAGE_SELF: CInt = 0

public val RUSAGE_CHILDREN: CInt = -1

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val RUSAGE_THREAD: CInt = 1

public val RLIM_SAVED_MAX: CUlong = RLIM_INFINITY - 1uL

public val RLIM_SAVED_CUR: CUlong = RLIM_INFINITY - 2uL

public val RLIM_NLIMITS: CInt = 10

// sys/sched.h
public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val SCHED_LOCAL: CInt = 3

public val SCHED_GLOBAL: CInt = 4

public val SCHED_FIFO2: CInt = 5

public val SCHED_FIFO3: CInt = 6

public val SCHED_FIFO4: CInt = 7

// sys/sem.h
public val SEM_UNDO: CInt = 4096

public val GETNCNT: CInt = 3

public val GETPID: CInt = 4

public val GETVAL: CInt = 5

public val GETALL: CInt = 6

public val GETZCNT: CInt = 7

public val SETVAL: CInt = 8

public val SETALL: CInt = 9

// sys/shm.h
public val SHMLBA: CInt = 0x10000000

public val SHMLBA_EXTSHM: CInt = 0x1000

public val SHM_SHMAT: CInt = 0x80000000.toInt()

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_PIN: CInt = 2048

public val SHM_LGPAGE: CInt = 2147483648.toInt()

public val SHM_MAP: CInt = 2048

public val SHM_FMAP: CInt = 1024

public val SHM_COPY: CInt = 16384

public val SHM_CLEAR: CInt = 0

public val SHM_HGSEG: CInt = 1073741824

public val SHM_R: CInt = IPC_R

public val SHM_W: CInt = IPC_W

public val SHM_DEST: CInt = 1024

// sys/signal.h
public val SA_ONSTACK: CInt = 0x00000001

public val SA_RESETHAND: CInt = 0x00000002

public val SA_RESTART: CInt = 0x00000008

public val SA_SIGINFO: CInt = 0x00000100

public val SA_NODEFER: CInt = 0x00000200

public val SA_NOCLDWAIT: CInt = 0x00000400

public val SA_NOCLDSTOP: CInt = 0x00000004

public val SS_ONSTACK: CInt = 0x00000001

public val SS_DISABLE: CInt = 0x00000002

public val SIGCHLD: CInt = 20

public val SIGBUS: CInt = 10

public val SIG_BLOCK: CInt = 0

public val SIG_UNBLOCK: CInt = 1

public val SIG_SETMASK: CInt = 2

public val SIGEV_NONE: CInt = 1

public val SIGEV_SIGNAL: CInt = 2

public val SIGEV_THREAD: CInt = 3

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGABRT: CInt = 6

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGSEGV: CInt = 11

public val SIGSYS: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val SIGPWR: CInt = 29

public val SIGWINCH: CInt = 28

public val SIGURG: CInt = 16

public val SIGIO: CInt = 23

public val SIGPOLL: CInt = SIGIO

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGCONT: CInt = 19

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGVTALRM: CInt = 34

public val SIGPROF: CInt = 32

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGTRAP: CInt = 5

public val SIGCLD: CInt = 20

public val SIGRTMAX: CInt = 57

public val SIGRTMIN: CInt = 50

public val SI_USER: CInt = 0

public val SI_UNDEFINED: CInt = 8

public val SI_EMPTY: CInt = 9

public val BUS_ADRALN: CInt = 1

public val BUS_ADRERR: CInt = 2

public val BUS_OBJERR: CInt = 3

public val BUS_UEGARD: CInt = 4

public val CLD_EXITED: CInt = 10

public val CLD_KILLED: CInt = 11

public val CLD_DUMPED: CInt = 12

public val CLD_TRAPPED: CInt = 13

public val CLD_STOPPED: CInt = 14

public val CLD_CONTINUED: CInt = 15

public val FPE_INTDIV: CInt = 20

public val FPE_INTOVF: CInt = 21

public val FPE_FLTDIV: CInt = 22

public val FPE_FLTOVF: CInt = 23

public val FPE_FLTUND: CInt = 24

public val FPE_FLTRES: CInt = 25

public val FPE_FLTINV: CInt = 26

public val FPE_FLTSUB: CInt = 27

public val ILL_ILLOPC: CInt = 30

public val ILL_ILLOPN: CInt = 31

public val ILL_ILLADR: CInt = 32

public val ILL_ILLTRP: CInt = 33

public val ILL_PRVOPC: CInt = 34

public val ILL_PRVREG: CInt = 35

public val ILL_COPROC: CInt = 36

public val ILL_BADSTK: CInt = 37

public val ILL_TMBADTHING: CInt = 38

public val POLL_IN: CInt = 40

public val POLL_OUT: CInt = 41

public val POLL_MSG: CInt = -3

public val POLL_ERR: CInt = 43

public val POLL_PRI: CInt = 44

public val POLL_HUP: CInt = 45

public val SEGV_MAPERR: CInt = 50

public val SEGV_ACCERR: CInt = 51

public val SEGV_KEYERR: CInt = 52

public val TRAP_BRKPT: CInt = 60

public val TRAP_TRACE: CInt = 61

public val SI_QUEUE: CInt = 71

public val SI_TIMER: CInt = 72

public val SI_ASYNCIO: CInt = 73

public val SI_MESGQ: CInt = 74

// sys/socket.h
public val AF_UNSPEC: CInt = 0

public val AF_UNIX: CInt = 1

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NS: CInt = 6

public val AF_ECMA: CInt = 8

public val AF_DATAKIT: CInt = 9

public val AF_CCITT: CInt = 10

public val AF_SNA: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_LAT: CInt = 14

public val SO_TIMESTAMPNS: CInt = 0x100a

public val SOMAXCONN: CInt = 1024

public val AF_LOCAL: CInt = AF_UNIX

public val UIO_MAXIOV: CInt = 1024

public val PSEUDO_AF_XTP: CInt = 19

public val AF_HYLINK: CInt = 15

public val AF_APPLETALK: CInt = 16

public val AF_ISO: CInt = 7

public val AF_OSI: CInt = AF_ISO

public val AF_ROUTE: CInt = 17

public val AF_LINK: CInt = 18

public val AF_INET6: CInt = 24

public val AF_INTF: CInt = 20

public val AF_RIF: CInt = 21

public val AF_NDD: CInt = 23

public val AF_MAX: CInt = 30

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_UNIX: CInt = AF_UNIX

public val PF_INET: CInt = AF_INET

public val PF_IMPLINK: CInt = AF_IMPLINK

public val PF_PUP: CInt = AF_PUP

public val PF_CHAOS: CInt = AF_CHAOS

public val PF_NS: CInt = AF_NS

public val PF_ISO: CInt = AF_ISO

public val PF_OSI: CInt = AF_ISO

public val PF_ECMA: CInt = AF_ECMA

public val PF_DATAKIT: CInt = AF_DATAKIT

public val PF_CCITT: CInt = AF_CCITT

public val PF_SNA: CInt = AF_SNA

public val PF_DE_CNET: CInt = AF_DE_CNET

public val PF_DLI: CInt = AF_DLI

public val PF_LAT: CInt = AF_LAT

public val PF_HYLINK: CInt = AF_HYLINK

public val PF_APPLETALK: CInt = AF_APPLETALK

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_LINK: CInt = AF_LINK

public val PF_XTP: CInt = 19

public val PF_RIF: CInt = AF_RIF

public val PF_INTF: CInt = AF_INTF

public val PF_NDD: CInt = AF_NDD

public val PF_INET6: CInt = AF_INET6

public val PF_MAX: CInt = AF_MAX

public val SF_CLOSE: CInt = 1

public val SF_REUSE: CInt = 2

public val SF_DONT_CACHE: CInt = 4

public val SF_SYNC_CACHE: CInt = 8

public val SOCK_DGRAM: CInt = 2

public val SOCK_STREAM: CInt = 1

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val SOL_SOCKET: CInt = 0xffff

public val SO_DEBUG: CInt = 0x0001

public val SO_ACCEPTCONN: CInt = 0x0002

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_OOBINLINE: CInt = 0x0100

public val SO_REUSEPORT: CInt = 0x0200

public val SO_USE_IFBUFS: CInt = 0x0400

public val SO_CKSUMRECV: CInt = 0x0800

public val SO_NOREUSEADDR: CInt = 0x1000

public val SO_KERNACCEPT: CInt = 0x2000

public val SO_NOMULTIPATH: CInt = 0x4000

public val SO_AUDIT: CInt = 0x8000

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SCM_RIGHTS: CInt = 0x01

public val MSG_OOB: CInt = 0x1

public val MSG_PEEK: CInt = 0x2

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_EOR: CInt = 0x8

public val MSG_TRUNC: CInt = 0x10

public val MSG_CTRUNC: CInt = 0x20

public val MSG_WAITALL: CInt = 0x40

public val MSG_MPEG2: CInt = 0x80

public val MSG_NOSIGNAL: CInt = 0x100

public val MSG_WAITFORONE: CInt = 0x200

public val MSG_ARGEXT: CInt = 0x400

public val MSG_NONBLOCK: CInt = 0x4000

public val MSG_COMPAT: CInt = 0x8000

public val MSG_MAXIOVLEN: CInt = 16

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

// sys/stat.h
public val UTIME_NOW: CInt = -2

public val UTIME_OMIT: CInt = -3

// sys/statvfs.h
public val ST_RDONLY: CUlong = 0x0001uL

public val ST_NOSUID: CUlong = 0x0040uL

public val ST_NODEV: CUlong = 0x0080uL

// sys/stropts.h
public val I_NREAD: CInt = 0x20005301

public val I_PUSH: CInt = 0x20005302

public val I_POP: CInt = 0x20005303

public val I_LOOK: CInt = 0x20005304

public val I_FLUSH: CInt = 0x20005305

public val I_SRDOPT: CInt = 0x20005306

public val I_GRDOPT: CInt = 0x20005307

public val I_STR: CInt = 0x20005308

public val I_SETSIG: CInt = 0x20005309

public val I_GETSIG: CInt = 0x2000530a

public val I_FIND: CInt = 0x2000530b

public val I_LINK: CInt = 0x2000530c

public val I_UNLINK: CInt = 0x2000530d

public val I_PEEK: CInt = 0x2000530f

public val I_FDINSERT: CInt = 0x20005310

public val I_SENDFD: CInt = 0x20005311

public val I_RECVFD: CInt = 0x20005312

public val I_SWROPT: CInt = 0x20005314

public val I_GWROPT: CInt = 0x20005315

public val I_LIST: CInt = 0x20005316

public val I_PLINK: CInt = 0x2000531d

public val I_PUNLINK: CInt = 0x2000531e

public val I_FLUSHBAND: CInt = 0x20005313

public val I_CKBAND: CInt = 0x20005318

public val I_GETBAND: CInt = 0x20005319

public val I_ATMARK: CInt = 0x20005317

public val I_SETCLTIME: CInt = 0x2000531b

public val I_GETCLTIME: CInt = 0x2000531c

public val I_CANPUT: CInt = 0x2000531a

// sys/syslog.h
public val LOG_CRON: CInt = 9 shl 3

public val LOG_AUTHPRIV: CInt = 10 shl 3

public val LOG_NFACILITIES: CInt = 24

public val LOG_PERROR: CInt = 0x20

// sys/systemcfg.h
public val SC_ARCH: CInt = 1

public val SC_IMPL: CInt = 2

public val SC_VERS: CInt = 3

public val SC_WIDTH: CInt = 4

public val SC_NCPUS: CInt = 5

public val SC_L1C_ATTR: CInt = 6

public val SC_L1C_ISZ: CInt = 7

public val SC_L1C_DSZ: CInt = 8

public val SC_L1C_ICA: CInt = 9

public val SC_L1C_DCA: CInt = 10

public val SC_L1C_IBS: CInt = 11

public val SC_L1C_DBS: CInt = 12

public val SC_L1C_ILS: CInt = 13

public val SC_L1C_DLS: CInt = 14

public val SC_L2C_SZ: CInt = 15

public val SC_L2C_AS: CInt = 16

public val SC_TLB_ATTR: CInt = 17

public val SC_ITLB_SZ: CInt = 18

public val SC_DTLB_SZ: CInt = 19

public val SC_ITLB_ATT: CInt = 20

public val SC_DTLB_ATT: CInt = 21

public val SC_RESRV_SZ: CInt = 22

public val SC_PRI_LC: CInt = 23

public val SC_PRO_LC: CInt = 24

public val SC_RTC_TYPE: CInt = 25

public val SC_VIRT_AL: CInt = 26

public val SC_CAC_CONG: CInt = 27

public val SC_MOD_ARCH: CInt = 28

public val SC_MOD_IMPL: CInt = 29

public val SC_XINT: CInt = 30

public val SC_XFRAC: CInt = 31

public val SC_KRN_ATTR: CInt = 32

public val SC_PHYSMEM: CInt = 33

public val SC_SLB_ATTR: CInt = 34

public val SC_SLB_SZ: CInt = 35

public val SC_MAX_NCPUS: CInt = 37

public val SC_MAX_REALADDR: CInt = 38

public val SC_ORIG_ENT_CAP: CInt = 39

public val SC_ENT_CAP: CInt = 40

public val SC_DISP_WHE: CInt = 41

public val SC_CAPINC: CInt = 42

public val SC_VCAPW: CInt = 43

public val SC_SPLP_STAT: CInt = 44

public val SC_SMT_STAT: CInt = 45

public val SC_SMT_TC: CInt = 46

public val SC_VMX_VER: CInt = 47

public val SC_LMB_SZ: CInt = 48

public val SC_MAX_XCPU: CInt = 49

public val SC_EC_LVL: CInt = 50

public val SC_AME_STAT: CInt = 51

public val SC_ECO_STAT: CInt = 52

public val SC_DFP_VER: CInt = 53

public val SC_VRM_STAT: CInt = 54

public val SC_PHYS_IMP: CInt = 55

public val SC_PHYS_VER: CInt = 56

public val SC_SPCM_STATUS: CInt = 57

public val SC_SPCM_MAX: CInt = 58

public val SC_TM_VER: CInt = 59

public val SC_NX_CAP: CInt = 60

public val SC_PKS_STATE: CInt = 61

public val SC_MMA_VER: CInt = 62

public val POWER_RS: CInt = 1

public val POWER_PC: CInt = 2

public val IA64: CInt = 3

public val POWER_RS1: CInt = 0x1

public val POWER_RSC: CInt = 0x2

public val POWER_RS2: CInt = 0x4

public val POWER_601: CInt = 0x8

public val POWER_604: CInt = 0x10

public val POWER_603: CInt = 0x20

public val POWER_620: CInt = 0x40

public val POWER_630: CInt = 0x80

public val POWER_A35: CInt = 0x100

public val POWER_RS64II: CInt = 0x200

public val POWER_RS64III: CInt = 0x400

public val POWER_4: CInt = 0x800

public val POWER_RS64IV: CInt = POWER_4

public val POWER_MPC7450: CInt = 0x1000

public val POWER_5: CInt = 0x2000

public val POWER_6: CInt = 0x4000

public val POWER_7: CInt = 0x8000

public val POWER_8: CInt = 0x10000

public val POWER_9: CInt = 0x20000

// sys/time.h
public val FD_SETSIZE: Int = 65534

public val TIMEOFDAY: CInt = 9

public val CLOCK_REALTIME: ClockidT = TIMEOFDAY.toLong()

public val CLOCK_MONOTONIC: ClockidT = 10L

public val TIMER_ABSTIME: CInt = 999

public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

public val ITIMER_VIRT: CInt = 3

public val ITIMER_REAL1: CInt = 20

public val ITIMER_REAL_TH: CInt = ITIMER_REAL1

public val DST_AUST: CInt = 2

public val DST_CAN: CInt = 6

public val DST_EET: CInt = 5

public val DST_MET: CInt = 4

public val DST_NONE: CInt = 0

public val DST_USA: CInt = 1

public val DST_WET: CInt = 3

// sys/termio.h
public val CSTART: TcflagT = 17u

public val CSTOP: TcflagT = 19u

public val TIOC: CInt = 0x5400

public val TCGETA: CInt = TIOC or 5

public val TCSETA: CInt = TIOC or 6

public val TCSETAW: CInt = TIOC or 7

public val TCSETAF: CInt = TIOC or 8

public val TCSBRK: CInt = TIOC or 9

public val TCXONC: CInt = TIOC or 11

public val TCFLSH: CInt = TIOC or 12

public val TCGETS: CInt = TIOC or 1

public val TCSETS: CInt = TIOC or 2

public val TCSANOW: CInt = 0

public val TCSETSW: CInt = TIOC or 3

public val TCSADRAIN: CInt = 1

public val TCSETSF: CInt = TIOC or 4

public val TCSAFLUSH: CInt = 2

public val TCIFLUSH: CInt = 0

public val TCOFLUSH: CInt = 1

public val TCIOFLUSH: CInt = 2

public val TCOOFF: CInt = 0

public val TCOON: CInt = 1

public val TCIOFF: CInt = 2

public val TCION: CInt = 3

public val TIOCGWINSZ: CInt = 0x40087468

public val TIOCSWINSZ: CInt = 0x80087467.toInt()

public val TIOCLBIS: CInt = 0x8004747f.toInt()

public val TIOCLBIC: CInt = 0x8004747e.toInt()

public val TIOCLSET: CInt = 0x8004747d.toInt()

public val TIOCLGET: CInt = 0x4004747c

public val TIOCSBRK: CInt = 0x2000747b

public val TIOCCBRK: CInt = 0x2000747a

public val TIOCSDTR: CInt = 0x20007479

public val TIOCCDTR: CInt = 0x20007478

public val TIOCSLTC: CInt = 0x80067475.toInt()

public val TIOCGLTC: CInt = 0x40067474

public val TIOCOUTQ: CInt = 0x40047473

public val TIOCNOTTY: CInt = 0x20007471

public val TIOCSTOP: CInt = 0x2000746f

public val TIOCSTART: CInt = 0x2000746e

public val TIOCGPGRP: CInt = 0x40047477

public val TIOCSPGRP: CInt = 0x80047476.toInt()

public val TIOCGSID: CInt = 0x40047448

public val TIOCSTI: CInt = 0x80017472.toInt()

public val TIOCMSET: CInt = 0x8004746d.toInt()

public val TIOCMBIS: CInt = 0x8004746c.toInt()

public val TIOCMBIC: CInt = 0x8004746b.toInt()

public val TIOCMGET: CInt = 0x4004746a

public val TIOCREMOTE: CInt = 0x80047469.toInt()

// sys/user.h
public val MAXCOMLEN: CInt = 32

public val UF_SYSTEM: CInt = 0x1000

// sys/vattr.h
public val AT_FLAGS: CInt = 0x80

public val AT_GID: CInt = 8

public val AT_UID: CInt = 4

// sys/wait.h
public val P_ALL: IdtypeT = 0u

public val P_PID: IdtypeT = 1u

public val P_PGID: IdtypeT = 2u

public val WNOHANG: CInt = 0x1

public val WUNTRACED: CInt = 0x2

public val WEXITED: CInt = 0x04

public val WCONTINUED: CInt = 0x01000000

public val WNOWAIT: CInt = 0x10

public val W_STOPPED: CInt = 0x00000040

public val WSTOPPED: CInt = W_STOPPED

public val W_SLWTED: CInt = 0x0000007c

public val W_SEWTED: CInt = 0x0000007d

public val W_SFWTED: CInt = 0x0000007e

public val W_STRC: CInt = 0x0000007f

// termios.h
public val NCCS: Int = 16

public val OLCUC: TcflagT = 2u

public val CSIZE: TcflagT = 0x00000030u

public val CS5: TcflagT = 0x00000000u

public val CS6: TcflagT = 0x00000010u

public val CS7: TcflagT = 0x00000020u

public val CS8: TcflagT = 0x00000030u

public val CSTOPB: TcflagT = 0x00000040u

public val ECHO: TcflagT = 0x00000008u

public val ECHOE: TcflagT = 0x00000010u

public val ECHOK: TcflagT = 0x00000020u

public val ECHONL: TcflagT = 0x00000040u

public val ECHOCTL: TcflagT = 0x00020000u

public val ECHOPRT: TcflagT = 0x00040000u

public val ECHOKE: TcflagT = 0x00080000u

public val IGNBRK: TcflagT = 0x00000001u

public val BRKINT: TcflagT = 0x00000002u

public val IGNPAR: TcflagT = 0x00000004u

public val PARMRK: TcflagT = 0x00000008u

public val INPCK: TcflagT = 0x00000010u

public val ISTRIP: TcflagT = 0x00000020u

public val INLCR: TcflagT = 0x00000040u

public val IGNCR: TcflagT = 0x00000080u

public val ICRNL: TcflagT = 0x00000100u

public val IXON: TcflagT = 0x00000200u

public val IXOFF: TcflagT = 0x00000400u

public val IXANY: TcflagT = 0x00001000u

public val IMAXBEL: TcflagT = 0x00010000u

public val OPOST: TcflagT = 0x00000001u

public val ONLCR: TcflagT = 0x00000004u

public val OCRNL: TcflagT = 0x00000008u

public val ONOCR: TcflagT = 0x00000010u

public val ONLRET: TcflagT = 0x00000020u

public val CREAD: TcflagT = 0x00000080u

public val IEXTEN: TcflagT = 0x00200000u

public val TOSTOP: TcflagT = 0x00010000u

public val FLUSHO: TcflagT = 0x00100000u

public val PENDIN: TcflagT = 0x20000000u

public val NOFLSH: TcflagT = 0x00000080u

public val VINTR: Int = 0

public val VQUIT: Int = 1

public val VERASE: Int = 2

public val VKILL: Int = 3

public val VEOF: Int = 4

public val VEOL: Int = 5

public val VSTART: Int = 7

public val VSTOP: Int = 8

public val VSUSP: Int = 9

public val VMIN: Int = 4

public val VTIME: Int = 5

public val VEOL2: Int = 6

public val VDSUSP: Int = 10

public val VREPRINT: Int = 11

public val VDISCRD: Int = 12

public val VWERSE: Int = 13

public val VLNEXT: Int = 14

public val B0: SpeedT = 0x0u

public val B50: SpeedT = 0x1u

public val B75: SpeedT = 0x2u

public val B110: SpeedT = 0x3u

public val B134: SpeedT = 0x4u

public val B150: SpeedT = 0x5u

public val B200: SpeedT = 0x6u

public val B300: SpeedT = 0x7u

public val B600: SpeedT = 0x8u

public val B1200: SpeedT = 0x9u

public val B1800: SpeedT = 0xau

public val B2400: SpeedT = 0xbu

public val B4800: SpeedT = 0xcu

public val B9600: SpeedT = 0xdu

public val B19200: SpeedT = 0xeu

public val B38400: SpeedT = 0xfu

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val IUCLC: TcflagT = 0x00000800u

public val OFILL: TcflagT = 0x00000040u

public val OFDEL: TcflagT = 0x00000080u

public val CRDLY: TcflagT = 0x00000300u

public val CR0: TcflagT = 0x00000000u
