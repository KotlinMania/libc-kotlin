package io.github.kotlinmania.libc.unix.linux_like

public typealias SaFamilyT = UShort

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias ClockidT = CInt

public typealias TimerT = COpaquePointer?

public typealias UsecondsT = UInt

public typealias KeyT = CInt

public typealias IdT = CUint

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

public val CLOCK_TAI: ClockidT = 11

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

public val TCIOFF: CInt = 2

public val TCION: CInt = 3

public val TCOOFF: CInt = 0

public val TCOON: CInt = 1

public val TCIFLUSH: CInt = 0

public val TCOFLUSH: CInt = 1

public val TCIOFLUSH: CInt = 2

public val NL0: TcflagT = 0x00000000u

public val NL1: TcflagT = 0x00000100u

public val TAB0: TcflagT = 0x00000000u

public val CR0: TcflagT = 0x00000000u

public val FF0: TcflagT = 0x00000000u

public val BS0: TcflagT = 0x00000000u

public val VT0: TcflagT = 0x00000000u

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

public val WNOTHREAD: CInt = 0x20000000

public val WALL: CInt = 0x40000000

public val WCLONE: CInt = 0x80000000

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

public fun cmsgAlign(len: Int): Int {
    return (len + sizeOf<Int>() - 1) and (sizeOf<Int>() - 1).inv()
}

public fun libcCurrentSigrtmax(): CInt {
    return LibcDynamicFfi.invoke("__libc_current_sigrtmax", -1, longArrayOf()).toInt()
}

public fun libcCurrentSigrtmin(): CInt {
    return LibcDynamicFfi.invoke("__libc_current_sigrtmin", -1, longArrayOf()).toInt()
}

public fun semDestroy(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_destroy", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt {
    return LibcDynamicFfi.invoke("sem_init", -1, longArrayOf(sem?.value ?: 0L, pshared.toLong(), value.toLong())).toInt()
}

public fun fdatasync(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("fdatasync", -1, longArrayOf(fd.toLong())).toInt()
}

public fun mincore(addr: COpaquePointer?, len: SizeT, vec: CUchar?): CInt {
    val __slot_2 = if (vec == null) 0L else LibcDynamicFfi.allocScalarSlot(vec.toLong())
    try {
        return LibcDynamicFfi.invoke("mincore", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
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

public fun clockGetcpuclockid(pid: PidT, clkId: CInt?): CInt {
    val __slot_1 = if (clkId == null) 0L else LibcDynamicFfi.allocScalarSlot(clkId.toLong())
    try {
        return LibcDynamicFfi.invoke("clock_getcpuclockid", -1, longArrayOf(pid.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getitimer(which: CInt, currValue: Itimerval?): CInt {
    return LibcDynamicFfi.invoke("getitimer", -1, longArrayOf(which.toLong(), currValue?.value ?: 0L)).toInt()
}

public fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt {
    return LibcDynamicFfi.invoke("setitimer", -1, longArrayOf(which.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
}

public fun dirfd(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("dirfd", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

public fun memalign(align: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memalign", -1, longArrayOf(align.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setgroups(ngroups: SizeT, ptr: GidT?): CInt {
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

public fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mknodat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), __scratch_3)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("ptsname_r", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun clearenv(): CInt {
    return LibcDynamicFfi.invoke("clearenv", -1, longArrayOf()).toInt()
}

public fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("waitid", -1, longArrayOf(__scratch_0, id.toLong(), infop?.value ?: 0L, options.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt {
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

public fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt {
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

public fun sbrk(increment: IntptrT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("sbrk", -1, longArrayOf(increment))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun vfork(): PidT {
    return LibcDynamicFfi.invoke("vfork", -1, longArrayOf()).toInt()
}

public fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt {
    return LibcDynamicFfi.invoke("setresgid", -1, longArrayOf(rgid.toLong(), egid.toLong(), sgid.toLong())).toInt()
}

public fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt {
    return LibcDynamicFfi.invoke("setresuid", -1, longArrayOf(ruid.toLong(), euid.toLong(), suid.toLong())).toInt()
}

public fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT {
    val __slot_1 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("wait4", -1, longArrayOf(pid.toLong(), __slot_1, options.toLong(), rusage?.value ?: 0L)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun loginTty(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("login_tty", -1, longArrayOf(fd.toLong())).toInt()
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

public fun getifaddrs(ifap: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getifaddrs", -1, longArrayOf(ifap?.value ?: 0L)).toInt()
}

public fun freeifaddrs(ifa: Ifaddrs?) {
    LibcDynamicFfi.invoke("freeifaddrs", -1, longArrayOf(ifa?.value ?: 0L))
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

public fun uname(buf: Utsname?): CInt {
    return LibcDynamicFfi.invoke("uname", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun strchrnul(s: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("strchrnul", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: Tm?): SizeT {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("strftime", -1, longArrayOf(s?.value ?: 0L, max.toLong(), __cstr_2, tm?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun strftimeL(s: COpaquePointer?, max: SizeT, format: String?, tm: Tm?, locale: LocaleT): SizeT {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("strftime_l", -1, longArrayOf(s?.value ?: 0L, max.toLong(), __cstr_2, tm?.value ?: 0L, locale?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun strptime(s: String?, format: String?, tm: Tm?): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        val rawRet = LibcDynamicFfi.invoke("strptime", -1, longArrayOf(__cstr_0, __cstr_1, tm?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mkostemp(template: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemp", -1, longArrayOf(template?.value ?: 0L, flags.toLong())).toInt()
}

public fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong(), flags.toLong())).toInt()
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

public fun ifNameindex(): IfNameindex? {
    val rawRet = LibcDynamicFfi.invoke("if_nameindex", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ifFreenameindex(ptr: IfNameindex?) {
    LibcDynamicFfi.invoke("if_freenameindex", -1, longArrayOf(ptr?.value ?: 0L))
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
