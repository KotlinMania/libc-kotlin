// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public const val AIO_CANCELED: Int = 0

public const val AIO_NOTCANCELED: Int = 1

public const val AIO_ALLDONE: Int = 2

public const val LIO_READ: Int = 0

public const val LIO_WRITE: Int = 1

public const val LIO_NOP: Int = 2

public const val LIO_WAIT: Int = 0

public const val LIO_NOWAIT: Int = 1

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

public val GLOB_PERIOD: Int = 1 shl 7

public val GLOB_ALTDIRFUNC: Int = 1 shl 9

public val GLOB_BRACE: Int = 1 shl 10

public val GLOB_NOMAGIC: Int = 1 shl 11

public val GLOB_TILDE: Int = 1 shl 12

public val GLOB_ONLYDIR: Int = 1 shl 13

public val GLOB_TILDE_CHECK: Int = 1 shl 14

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

public const val SHM_R: Int = 256

public const val SHM_W: Int = 128

public const val SHM_RDONLY: Int = 4096

public const val SHM_RND: Int = 8192

public const val SHM_REMAP: Int = 16384

public const val SHM_LOCK: Int = 11

public const val SHM_UNLOCK: Int = 12

public const val __FD_SETSIZE: ULong = 256uL

public const val R_OK: Int = 4

public const val W_OK: Int = 2

public const val X_OK: Int = 1

public const val F_OK: Int = 0

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val SEEK_DATA: Int = 3

public const val SEEK_HOLE: Int = 4

public const val L_SET: Int = 0

public const val L_INCR: Int = 1

public const val L_XTND: Int = 2

public const val F_ULOCK: Int = 0

public const val F_LOCK: Int = 1

public const val F_TLOCK: Int = 2

public const val F_TEST: Int = 3

public const val CLOSE_RANGE_CLOEXEC: Int = 4

public const val EOF: Int = -1

public const val WNOHANG: Int = 1

public const val WUNTRACED: Int = 2

public const val WSTOPPED: Int = 2

public const val WCONTINUED: Int = 4

public const val WNOWAIT: Int = 8

public const val WEXITED: Int = 16

public const val __W_CONTINUED: Int = 65535

public const val __WCOREFLAG: Int = 128

public const val RAND_MAX: Int = 2147483647

public const val EXIT_FAILURE: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val __LITTLE_ENDIAN: ULong = 1234uL

public const val __BIG_ENDIAN: ULong = 4321uL

public const val __PDP_ENDIAN: ULong = 3412uL

public const val __BYTE_ORDER: ULong = 1234uL

public const val __FLOAT_WORD_ORDER: ULong = 1234uL

public const val LITTLE_ENDIAN: ULong = 1234uL

public const val BIG_ENDIAN: ULong = 4321uL

public const val PDP_ENDIAN: ULong = 3412uL

public const val BYTE_ORDER: ULong = 1234uL

public const val FD_SETSIZE: ULong = 256uL

public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 32uL

public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 32uL

public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 28uL

public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 24uL

public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 16uL

public const val __SIZEOF_PTHREAD_COND_T: ULong = 20uL

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 8uL

public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_ONCE_T: ULong = 8uL

public const val __PTHREAD_SPIN_LOCK_INITIALIZER: Int = 0

public const val PTHREAD_MUTEX_NORMAL: Int = 0

public const val RLIM_INFINITY: ULong = 2147483647uL

public const val RLIM64_INFINITY: ULong = 9223372036854775807uL

public const val RLIM_SAVED_MAX: ULong = RLIM_INFINITY

public const val RLIM_SAVED_CUR: ULong = RLIM_INFINITY

public const val PRIO_MIN: Int = -20

public const val PRIO_MAX: Int = 20

public const val NSS_BUFLEN_PASSWD: ULong = 1024uL

public const val SOCK_TYPE_MASK: ULong = 15uL

public const val PF_UNSPEC: Int = 0

public const val PF_LOCAL: Int = 1

public const val PF_UNIX: Int = 1

public const val PF_FILE: Int = 1

public const val PF_INET: Int = 2

public const val PF_IMPLINK: Int = 3

public const val PF_PUP: Int = 4

public const val PF_CHAOS: Int = 5

public const val PF_NS: Int = 6

public const val PF_ISO: Int = 7

public const val PF_OSI: Int = 7

public const val PF_ECMA: Int = 8

public const val PF_DATAKIT: Int = 9

public const val PF_CCITT: Int = 10

public const val PF_SNA: Int = 11

public const val PF_DECnet: Int = 12

public const val PF_DLI: Int = 13

public const val PF_LAT: Int = 14

public const val PF_HYLINK: Int = 15

public const val PF_APPLETALK: Int = 16

public const val PF_ROUTE: Int = 17

public const val PF_XTP: Int = 19

public const val PF_COIP: Int = 20

public const val PF_CNT: Int = 21

public const val PF_RTIP: Int = 22

public const val PF_IPX: Int = 23

public const val PF_SIP: Int = 24

public const val PF_PIP: Int = 25

public const val PF_INET6: Int = 26

public const val PF_MAX: Int = 27

public const val AF_UNSPEC: Int = 0

public const val AF_LOCAL: Int = 1

public const val AF_UNIX: Int = 1

public const val AF_FILE: Int = 1

public const val AF_INET: Int = 2

public const val AF_IMPLINK: Int = 3

public const val AF_PUP: Int = 4

public const val AF_CHAOS: Int = 5

public const val AF_NS: Int = 6

public const val AF_ISO: Int = 7

public const val AF_OSI: Int = 7

public const val AF_ECMA: Int = 8

public const val AF_DATAKIT: Int = 9

public const val AF_CCITT: Int = 10

public const val AF_SNA: Int = 11

public const val AF_DECnet: Int = 12

public const val AF_DLI: Int = 13

public const val AF_LAT: Int = 14

public const val AF_HYLINK: Int = 15

public const val AF_APPLETALK: Int = 16

public const val AF_ROUTE: Int = 17

public const val pseudo_AF_XTP: Int = 19

public const val AF_COIP: Int = 20

public const val AF_CNT: Int = 21

public const val pseudo_AF_RTIP: Int = 22

public const val AF_IPX: Int = 23

public const val AF_SIP: Int = 24

public const val pseudo_AF_PIP: Int = 25

public const val AF_INET6: Int = 26

public const val AF_MAX: Int = 27

public const val SOMAXCONN: Int = 4096

public const val _SS_SIZE: ULong = 128uL

public const val CMGROUP_MAX: ULong = 16uL

public const val SOL_SOCKET: Int = 65535

public const val ITIMER_REAL: Int = 0

public const val ITIMER_VIRTUAL: Int = 1

public const val ITIMER_PROF: Int = 2

public const val SOL_IP: Int = 0

public const val SOL_TCP: Int = 6

public const val SOL_UDP: Int = 17

public const val SOL_IPV6: Int = 41

public const val SOL_ICMPV6: Int = 58

public const val IP_OPTIONS: Int = 1

public const val IP_HDRINCL: Int = 2

public const val IP_TOS: Int = 3

public const val IP_TTL: Int = 4

public const val IP_RECVOPTS: Int = 5

public const val IP_RECVRETOPTS: Int = 6

public const val IP_RECVDSTADDR: Int = 7

public const val IP_RETOPTS: Int = 8

public const val IP_MULTICAST_IF: Int = 9

public const val IP_MULTICAST_TTL: Int = 10

public const val IP_MULTICAST_LOOP: Int = 11

public const val IP_ADD_MEMBERSHIP: Int = 12

public const val IP_DROP_MEMBERSHIP: Int = 13

public const val IPV6_ADDRFORM: Int = 1

public const val IPV6_2292PKTINFO: Int = 2

public const val IPV6_2292HOPOPTS: Int = 3

public const val IPV6_2292DSTOPTS: Int = 4

public const val IPV6_2292RTHDR: Int = 5

public const val IPV6_2292PKTOPTIONS: Int = 6

public const val IPV6_CHECKSUM: Int = 7

public const val IPV6_2292HOPLIMIT: Int = 8

public const val IPV6_RXINFO: Int = 2

public const val IPV6_TXINFO: Int = 2

public const val SCM_SRCINFO: Int = 2

public const val IPV6_UNICAST_HOPS: Int = 16

public const val IPV6_MULTICAST_IF: Int = 17

public const val IPV6_MULTICAST_HOPS: Int = 18

public const val IPV6_MULTICAST_LOOP: Int = 19

public const val IPV6_JOIN_GROUP: Int = 20

public const val IPV6_LEAVE_GROUP: Int = 21

public const val IPV6_ROUTER_ALERT: Int = 22

public const val IPV6_MTU_DISCOVER: Int = 23

public const val IPV6_MTU: Int = 24

public const val IPV6_RECVERR: Int = 25

public const val IPV6_V6ONLY: Int = 26

public const val IPV6_JOIN_ANYCAST: Int = 27

public const val IPV6_LEAVE_ANYCAST: Int = 28

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

public const val IPV6_ADDR_PREFERENCES: Int = 72

public const val IPV6_MINHOPCOUNT: Int = 73

public const val IPV6_ADD_MEMBERSHIP: Int = 20

public const val IPV6_DROP_MEMBERSHIP: Int = 21

public const val IPV6_RXHOPOPTS: Int = 3

public const val IPV6_RXDSTOPTS: Int = 4

public const val IPV6_RTHDR_LOOSE: Int = 0

public const val IPV6_RTHDR_STRICT: Int = 1

public const val IPV6_RTHDR_TYPE_0: Int = 0

public const val IN_CLASSA_NET: UInt = 4278190080u

public const val IN_CLASSA_NSHIFT: ULong = 24uL

public const val IN_CLASSA_HOST: UInt = 16777215u

public const val IN_CLASSA_MAX: UInt = 128u

public const val IN_CLASSB_NET: UInt = 4294901760u

public const val IN_CLASSB_NSHIFT: ULong = 16uL

public const val IN_CLASSB_HOST: UInt = 65535u

public const val IN_CLASSB_MAX: UInt = 65536u

public const val IN_CLASSC_NET: UInt = 4294967040u

public const val IN_CLASSC_NSHIFT: ULong = 8uL

public const val IN_CLASSC_HOST: UInt = 255u

public const val IN_LOOPBACKNET: UInt = 127u

public const val INET_ADDRSTRLEN: ULong = 16uL

public const val INET6_ADDRSTRLEN: ULong = 46uL

public val IPTOS_TOS_MASK: UByte = (0x1E).toUByte()

public val IPTOS_PREC_MASK: UByte = (0xE0).toUByte()

public val IPTOS_ECN_NOT_ECT: UByte = (0x00).toUByte()

public val IPTOS_LOWDELAY: UByte = (0x10).toUByte()

public val IPTOS_THROUGHPUT: UByte = (0x08).toUByte()

public val IPTOS_RELIABILITY: UByte = (0x04).toUByte()

public val IPTOS_MINCOST: UByte = (0x02).toUByte()

public val IPTOS_PREC_NETCONTROL: UByte = (0xe0).toUByte()

public val IPTOS_PREC_INTERNETCONTROL: UByte = (0xc0).toUByte()

public val IPTOS_PREC_CRITIC_ECP: UByte = (0xa0).toUByte()

public val IPTOS_PREC_FLASHOVERRIDE: UByte = (0x80).toUByte()

public val IPTOS_PREC_FLASH: UByte = (0x60).toUByte()

public val IPTOS_PREC_IMMEDIATE: UByte = (0x40).toUByte()

public val IPTOS_PREC_PRIORITY: UByte = (0x20).toUByte()

public val IPTOS_PREC_ROUTINE: UByte = (0x00).toUByte()

public val IPTOS_ECN_MASK: UByte = (0x03).toUByte()

public val IPTOS_ECN_ECT1: UByte = (0x01).toUByte()

public val IPTOS_ECN_ECT0: UByte = (0x02).toUByte()

public val IPTOS_ECN_CE: UByte = (0x03).toUByte()

public val IPOPT_COPY: UByte = (0x80).toUByte()

public val IPOPT_CLASS_MASK: UByte = (0x60).toUByte()

public val IPOPT_NUMBER_MASK: UByte = (0x1f).toUByte()

public val IPOPT_CONTROL: UByte = (0x00).toUByte()

public val IPOPT_RESERVED1: UByte = (0x20).toUByte()

public val IPOPT_MEASUREMENT: UByte = (0x40).toUByte()

public val IPOPT_RESERVED2: UByte = (0x60).toUByte()

public val IPOPT_END: UByte = 0.toUByte() or IPOPT_CONTROL

public val IPOPT_NOOP: UByte = 1.toUByte() or IPOPT_CONTROL

public val IPOPT_SEC: UByte = 2.toUByte() or IPOPT_CONTROL or IPOPT_COPY

public val IPOPT_LSRR: UByte = 3.toUByte() or IPOPT_CONTROL or IPOPT_COPY

public val IPOPT_TIMESTAMP: UByte = 4.toUByte() or IPOPT_MEASUREMENT

public val IPOPT_RR: UByte = 7.toUByte() or IPOPT_CONTROL

public val IPOPT_SID: UByte = 8.toUByte() or IPOPT_CONTROL or IPOPT_COPY

public val IPOPT_SSRR: UByte = 9.toUByte() or IPOPT_CONTROL or IPOPT_COPY

public val IPOPT_RA: UByte = 20.toUByte() or IPOPT_CONTROL or IPOPT_COPY

public val IPVERSION: UByte = (4).toUByte()

public val MAXTTL: UByte = (255).toUByte()

public val IPDEFTTL: UByte = (64).toUByte()

public val IPOPT_OPTVAL: UByte = (0).toUByte()

public val IPOPT_OLEN: UByte = (1).toUByte()

public val IPOPT_OFFSET: UByte = (2).toUByte()

public val IPOPT_MINOFF: UByte = (4).toUByte()

public val MAX_IPOPTLEN: UByte = (40).toUByte()

public val IPOPT_NOP: UByte = IPOPT_NOOP

public val IPOPT_EOL: UByte = IPOPT_END

public val IPOPT_TS: UByte = IPOPT_TIMESTAMP

public val IPOPT_TS_TSONLY: UByte = (0).toUByte()

public val IPOPT_TS_TSANDADDR: UByte = (1).toUByte()

public val IPOPT_TS_PRESPEC: UByte = (3).toUByte()

public val ARPOP_REQUEST: UShort = (1).toUShort()

public val ARPOP_REPLY: UShort = (2).toUShort()

public val ARPOP_RREQUEST: UShort = (3).toUShort()

public val ARPOP_RREPLY: UShort = (4).toUShort()

public val ARPOP_InREQUEST: UShort = (8).toUShort()

public val ARPOP_InREPLY: UShort = (9).toUShort()

public val ARPOP_NAK: UShort = (10).toUShort()

public const val MAX_ADDR_LEN: ULong = 7uL

public val ARPD_UPDATE: UShort = (0x01).toUShort()

public val ARPD_LOOKUP: UShort = (0x02).toUShort()

public val ARPD_FLUSH: UShort = (0x03).toUShort()

public const val ATF_MAGIC: Int = 0x80

public const val ATF_NETMASK: Int = 0x20

public const val ATF_DONTPUB: Int = 0x40

public val ARPHRD_NETROM: UShort = (0).toUShort()

public val ARPHRD_ETHER: UShort = (1).toUShort()

public val ARPHRD_EETHER: UShort = (2).toUShort()

public val ARPHRD_AX25: UShort = (3).toUShort()

public val ARPHRD_PRONET: UShort = (4).toUShort()

public val ARPHRD_CHAOS: UShort = (5).toUShort()

public val ARPHRD_IEEE802: UShort = (6).toUShort()

public val ARPHRD_ARCNET: UShort = (7).toUShort()

public val ARPHRD_APPLETLK: UShort = (8).toUShort()

public val ARPHRD_DLCI: UShort = (15).toUShort()

public val ARPHRD_ATM: UShort = (19).toUShort()

public val ARPHRD_METRICOM: UShort = (23).toUShort()

public val ARPHRD_IEEE1394: UShort = (24).toUShort()

public val ARPHRD_EUI64: UShort = (27).toUShort()

public val ARPHRD_INFINIBAND: UShort = (32).toUShort()

public val ARPHRD_SLIP: UShort = (256).toUShort()

public val ARPHRD_CSLIP: UShort = (257).toUShort()

public val ARPHRD_SLIP6: UShort = (258).toUShort()

public val ARPHRD_CSLIP6: UShort = (259).toUShort()

public val ARPHRD_RSRVD: UShort = (260).toUShort()

public val ARPHRD_ADAPT: UShort = (264).toUShort()

public val ARPHRD_ROSE: UShort = (270).toUShort()

public val ARPHRD_X25: UShort = (271).toUShort()

public val ARPHRD_HWX25: UShort = (272).toUShort()

public val ARPHRD_CAN: UShort = (280).toUShort()

public val ARPHRD_PPP: UShort = (512).toUShort()

public val ARPHRD_CISCO: UShort = (513).toUShort()

public val ARPHRD_HDLC: UShort = ARPHRD_CISCO

public val ARPHRD_LAPB: UShort = (516).toUShort()

public val ARPHRD_DDCMP: UShort = (517).toUShort()

public val ARPHRD_RAWHDLC: UShort = (518).toUShort()

public val ARPHRD_TUNNEL: UShort = (768).toUShort()

public val ARPHRD_TUNNEL6: UShort = (769).toUShort()

public val ARPHRD_FRAD: UShort = (770).toUShort()

public val ARPHRD_SKIP: UShort = (771).toUShort()

public val ARPHRD_LOOPBACK: UShort = (772).toUShort()

public val ARPHRD_LOCALTLK: UShort = (773).toUShort()

public val ARPHRD_FDDI: UShort = (774).toUShort()

public val ARPHRD_BIF: UShort = (775).toUShort()

public val ARPHRD_SIT: UShort = (776).toUShort()

public val ARPHRD_IPDDP: UShort = (777).toUShort()

public val ARPHRD_IPGRE: UShort = (778).toUShort()

public val ARPHRD_PIMREG: UShort = (779).toUShort()

public val ARPHRD_HIPPI: UShort = (780).toUShort()

public val ARPHRD_ASH: UShort = (781).toUShort()

public val ARPHRD_ECONET: UShort = (782).toUShort()

public val ARPHRD_IRDA: UShort = (783).toUShort()

public val ARPHRD_FCPP: UShort = (784).toUShort()

public val ARPHRD_FCAL: UShort = (785).toUShort()

public val ARPHRD_FCPL: UShort = (786).toUShort()

public val ARPHRD_FCFABRIC: UShort = (787).toUShort()

public val ARPHRD_IEEE802_TR: UShort = (800).toUShort()

public val ARPHRD_IEEE80211: UShort = (801).toUShort()

public val ARPHRD_IEEE80211_PRISM: UShort = (802).toUShort()

public val ARPHRD_IEEE80211_RADIOTAP: UShort = (803).toUShort()

public val ARPHRD_IEEE802154: UShort = (804).toUShort()

public val ARPHRD_VOID: UShort = (0xFFFF).toUShort()

public val ARPHRD_NONE: UShort = (0xFFFE).toUShort()

public const val _POSIX_AIO_LISTIO_MAX: ULong = 2uL

public const val _POSIX_AIO_MAX: ULong = 1uL

public const val _POSIX_ARG_MAX: ULong = 4096uL

public const val _POSIX_CHILD_MAX: ULong = 25uL

public const val _POSIX_DELAYTIMER_MAX: ULong = 32uL

public const val _POSIX_HOST_NAME_MAX: ULong = 255uL

public const val _POSIX_LINK_MAX: ULong = 8uL

public const val _POSIX_LOGIN_NAME_MAX: ULong = 9uL

public const val _POSIX_MAX_CANON: ULong = 255uL

public const val _POSIX_MAX_INPUT: ULong = 255uL

public const val _POSIX_MQ_OPEN_MAX: ULong = 8uL

public const val _POSIX_MQ_PRIO_MAX: ULong = 32uL

public const val _POSIX_NAME_MAX: ULong = 14uL

public const val _POSIX_NGROUPS_MAX: ULong = 8uL

public const val _POSIX_OPEN_MAX: ULong = 20uL

public const val _POSIX_FD_SETSIZE: ULong = 20uL

public const val _POSIX_PATH_MAX: ULong = 256uL

public const val _POSIX_PIPE_BUF: ULong = 512uL

public const val _POSIX_RE_DUP_MAX: ULong = 255uL

public const val _POSIX_RTSIG_MAX: ULong = 8uL

public const val _POSIX_SEM_NSEMS_MAX: ULong = 256uL

public const val _POSIX_SEM_VALUE_MAX: ULong = 32767uL

public const val _POSIX_SIGQUEUE_MAX: ULong = 32uL

public const val _POSIX_SSIZE_MAX: ULong = 32767uL

public const val _POSIX_STREAM_MAX: ULong = 8uL

public const val _POSIX_SYMLINK_MAX: ULong = 255uL

public const val _POSIX_SYMLOOP_MAX: ULong = 8uL

public const val _POSIX_TIMER_MAX: ULong = 32uL

public const val _POSIX_TTY_NAME_MAX: ULong = 9uL

public const val _POSIX_TZNAME_MAX: ULong = 6uL

public const val _POSIX_QLIMIT: ULong = 1uL

public const val _POSIX_HIWAT: ULong = 512uL

public const val _POSIX_UIO_MAXIOV: ULong = 16uL

public const val _POSIX_CLOCKRES_MIN: ULong = 20000000uL

public const val NAME_MAX: ULong = 255uL

public const val NGROUPS_MAX: ULong = 256uL

public const val _POSIX_THREAD_KEYS_MAX: ULong = 128uL

public const val _POSIX_THREAD_DESTRUCTOR_ITERATIONS: ULong = 4uL

public const val _POSIX_THREAD_THREADS_MAX: ULong = 64uL

public const val SEM_VALUE_MAX: Int = 2147483647

public const val MAXNAMLEN: ULong = 255uL

public const val HOST_NOT_FOUND: Int = 1

public const val TRY_AGAIN: Int = 2

public const val NO_RECOVERY: Int = 3

public const val NO_DATA: Int = 4

public const val NETDB_INTERNAL: Int = -1

public const val NETDB_SUCCESS: Int = 0

public const val NO_ADDRESS: Int = 4

public const val IPPORT_RESERVED: Int = 1024

public const val SCOPE_DELIMITER: UByte = 37u

public const val GAI_WAIT: Int = 0

public const val GAI_NOWAIT: Int = 1

public const val AI_PASSIVE: Int = 1

public const val AI_CANONNAME: Int = 2

public const val AI_NUMERICHOST: Int = 4

public const val AI_V4MAPPED: Int = 8

public const val AI_ALL: Int = 16

public const val AI_ADDRCONFIG: Int = 32

public const val AI_IDN: Int = 64

public const val AI_CANONIDN: Int = 128

public const val AI_NUMERICSERV: Int = 1024

public const val EAI_BADFLAGS: Int = -1

public const val EAI_NONAME: Int = -2

public const val EAI_AGAIN: Int = -3

public const val EAI_FAIL: Int = -4

public const val EAI_FAMILY: Int = -6

public const val EAI_SOCKTYPE: Int = -7

public const val EAI_SERVICE: Int = -8

public const val EAI_MEMORY: Int = -10

public const val EAI_SYSTEM: Int = -11

public const val EAI_OVERFLOW: Int = -12

public const val EAI_NODATA: Int = -5

public const val EAI_ADDRFAMILY: Int = -9

public const val EAI_INPROGRESS: Int = -100

public const val EAI_CANCELED: Int = -101

public const val EAI_NOTCANCELED: Int = -102

public const val EAI_ALLDONE: Int = -103

public const val EAI_INTR: Int = -104

public const val EAI_IDN_ENCODE: Int = -105

public const val NI_MAXHOST: ULong = 1025uL

public const val NI_MAXSERV: ULong = 32uL

public const val NI_NUMERICHOST: Int = 1

public const val NI_NUMERICSERV: Int = 2

public const val NI_NOFQDN: Int = 4

public const val NI_NAMEREQD: Int = 8

public const val NI_DGRAM: Int = 16

public const val NI_IDN: Int = 32

public const val CLOCK_REALTIME: Int = 0

public const val CLOCK_MONOTONIC: Int = 1

public const val CLOCK_PROCESS_CPUTIME_ID: Int = 2

public const val CLOCK_THREAD_CPUTIME_ID: Int = 3

public const val CLOCK_MONOTONIC_RAW: Int = 4

public const val CLOCK_REALTIME_COARSE: Int = 5

public const val CLOCK_MONOTONIC_COARSE: Int = 6

public const val TIMER_ABSTIME: Int = 1

public const val TIME_UTC: Int = 1

public const val POLLIN: Short = 1

public const val POLLPRI: Short = 2

public const val POLLOUT: Short = 4

public const val POLLRDNORM: Short = 1

public const val POLLRDBAND: Short = 2

public const val POLLWRNORM: Short = 4

public const val POLLWRBAND: Short = 4

public const val POLLERR: Short = 8

public const val POLLHUP: Short = 16

public const val POLLNVAL: Short = 32

public const val __LC_CTYPE: ULong = 0uL

public const val __LC_NUMERIC: ULong = 1uL

public const val __LC_TIME: ULong = 2uL

public const val __LC_COLLATE: ULong = 3uL

public const val __LC_MONETARY: ULong = 4uL

public const val __LC_MESSAGES: ULong = 5uL

public const val __LC_ALL: ULong = 6uL

public const val __LC_PAPER: ULong = 7uL

public const val __LC_NAME: ULong = 8uL

public const val __LC_ADDRESS: ULong = 9uL

public const val __LC_TELEPHONE: ULong = 10uL

public const val __LC_MEASUREMENT: ULong = 11uL

public const val __LC_IDENTIFICATION: ULong = 12uL

public const val LC_CTYPE: Int = 0

public const val LC_NUMERIC: Int = 1

public const val LC_TIME: Int = 2

public const val LC_COLLATE: Int = 3

public const val LC_MONETARY: Int = 4

public const val LC_MESSAGES: Int = 5

public const val LC_ALL: Int = 6

public const val LC_PAPER: Int = 7

public const val LC_NAME: Int = 8

public const val LC_ADDRESS: Int = 9

public const val LC_TELEPHONE: Int = 10

public const val LC_MEASUREMENT: Int = 11

public const val LC_IDENTIFICATION: Int = 12

public const val LC_CTYPE_MASK: Int = 1

public const val LC_NUMERIC_MASK: Int = 2

public const val LC_TIME_MASK: Int = 4

public const val LC_COLLATE_MASK: Int = 8

public const val LC_MONETARY_MASK: Int = 16

public const val LC_MESSAGES_MASK: Int = 32

public const val LC_PAPER_MASK: Int = 128

public const val LC_NAME_MASK: Int = 256

public const val LC_ADDRESS_MASK: Int = 512

public const val LC_TELEPHONE_MASK: Int = 1024

public const val LC_MEASUREMENT_MASK: Int = 2048

public const val LC_IDENTIFICATION_MASK: Int = 4096

public const val LC_ALL_MASK: Int = 8127

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

public const val RADIXCHAR: Int = 0x10000

public const val THOUSEP: Int = 0x10001

public const val YESEXPR: Int = 0x50000

public const val NOEXPR: Int = 0x50001

public const val YESSTR: Int = 0x50002

public const val NOSTR: Int = 0x50003

public const val RB_AUTOBOOT: Int = 0x0

public const val RB_ASKNAME: Int = 0x1

public const val RB_SINGLE: Int = 0x2

public const val RB_KBD: Int = 0x4

public const val RB_HALT: Int = 0x8

public const val RB_INITNAME: Int = 0x10

public const val RB_DFLTROOT: Int = 0x20

public const val RB_NOBOOTRC: Int = 0x20

public const val RB_ALTBOOT: Int = 0x40

public const val RB_UNIPROC: Int = 0x80

public const val RB_DEBUGGER: Int = 0x1000

public const val __SIZEOF_SEM_T: ULong = 20uL

public const val IGNBRK: UInt = 1u

public const val BRKINT: UInt = 2u

public const val IGNPAR: UInt = 4u

public const val PARMRK: UInt = 8u

public const val INPCK: UInt = 16u

public const val ISTRIP: UInt = 32u

public const val INLCR: UInt = 64u

public const val IGNCR: UInt = 128u

public const val ICRNL: UInt = 256u

public const val IXON: UInt = 512u

public const val IXOFF: UInt = 1024u

public const val IXANY: UInt = 2048u

public const val IMAXBEL: UInt = 8192u

public const val IUCLC: UInt = 16384u

public const val OPOST: UInt = 1u

public const val ONLCR: UInt = 2u

public const val ONOEOT: UInt = 8u

public const val OCRNL: UInt = 16u

public const val ONOCR: UInt = 32u

public const val ONLRET: UInt = 64u

public const val NLDLY: UInt = 768u

public const val NL0: UInt = 0u

public const val NL1: UInt = 256u

public const val TABDLY: UInt = 3076u

public const val TAB0: UInt = 0u

public const val TAB1: UInt = 1024u

public const val TAB2: UInt = 2048u

public const val TAB3: UInt = 4u

public const val CRDLY: UInt = 12288u

public const val CR0: UInt = 0u

public const val CR1: UInt = 4096u

public const val CR2: UInt = 8192u

public const val CR3: UInt = 12288u

public const val FFDLY: UInt = 16384u

public const val FF0: UInt = 0u

public const val FF1: UInt = 16384u

public const val BSDLY: UInt = 32768u

public const val BS0: UInt = 0u

public const val BS1: UInt = 32768u

public const val VTDLY: UInt = 65536u

public const val VT0: UInt = 0u

public const val VT1: UInt = 65536u

public const val OLCUC: UInt = 131072u

public const val OFILL: UInt = 262144u

public const val OFDEL: UInt = 524288u

public const val CIGNORE: UInt = 1u

public const val CSIZE: UInt = 768u

public const val CS5: UInt = 0u

public const val CS6: UInt = 256u

public const val CS7: UInt = 512u

public const val CS8: UInt = 768u

public const val CSTOPB: UInt = 1024u

public const val CREAD: UInt = 2048u

public const val PARENB: UInt = 4096u

public const val PARODD: UInt = 8192u

public const val HUPCL: UInt = 16384u

public const val CLOCAL: UInt = 32768u

public const val CRTSCTS: UInt = 65536u

public const val CRTS_IFLOW: UInt = 65536u

public const val CCTS_OFLOW: UInt = 65536u

public const val CDTRCTS: UInt = 131072u

public const val MDMBUF: UInt = 1048576u

public const val CHWFLOW: UInt = 1245184u

public const val ECHOKE: UInt = 1u

public const val _ECHOE: UInt = 2u

public const val ECHOE: UInt = 2u

public const val _ECHOK: UInt = 4u

public const val ECHOK: UInt = 4u

public const val _ECHO: UInt = 8u

public const val ECHO: UInt = 8u

public const val _ECHONL: UInt = 16u

public const val ECHONL: UInt = 16u

public const val ECHOPRT: UInt = 32u

public const val ECHOCTL: UInt = 64u

public const val _ISIG: UInt = 128u

public const val ISIG: UInt = 128u

public const val _ICANON: UInt = 256u

public const val ICANON: UInt = 256u

public const val ALTWERASE: UInt = 512u

public const val _IEXTEN: UInt = 1024u

public const val IEXTEN: UInt = 1024u

public const val EXTPROC: UInt = 2048u

public const val _TOSTOP: UInt = 4194304u

public const val TOSTOP: UInt = 4194304u

public const val FLUSHO: UInt = 8388608u

public const val NOKERNINFO: UInt = 33554432u

public const val PENDIN: UInt = 536870912u

public const val _NOFLSH: UInt = 2147483648u

public const val NOFLSH: UInt = 2147483648u

public const val VEOF: ULong = 0uL

public const val VEOL: ULong = 1uL

public const val VEOL2: ULong = 2uL

public const val VERASE: ULong = 3uL

public const val VWERASE: ULong = 4uL

public const val VKILL: ULong = 5uL

public const val VREPRINT: ULong = 6uL

public const val VINTR: ULong = 8uL

public const val VQUIT: ULong = 9uL

public const val VSUSP: ULong = 10uL

public const val VDSUSP: ULong = 11uL

public const val VSTART: ULong = 12uL

public const val VSTOP: ULong = 13uL

public const val VLNEXT: ULong = 14uL

public const val VDISCARD: ULong = 15uL

public const val VMIN: ULong = 16uL

public const val VTIME: ULong = 17uL

public const val VSTATUS: ULong = 18uL

public const val NCCS: ULong = 20uL

public const val B0: Int = 0.toInt()

public const val B50: Int = 50.toInt()

public const val B75: Int = 75.toInt()

public const val B110: Int = 110.toInt()

public const val B134: Int = 134.toInt()

public const val B150: Int = 150.toInt()

public const val B200: Int = 200.toInt()

public const val B300: Int = 300.toInt()

public const val B600: Int = 600.toInt()

public const val B1200: Int = 1200.toInt()

public const val B1800: Int = 1800.toInt()

public const val B2400: Int = 2400.toInt()

public const val B4800: Int = 4800.toInt()

public const val B9600: Int = 9600.toInt()

public const val B7200: Int = 7200.toInt()

public const val B14400: Int = 14400.toInt()

public const val B19200: Int = 19200.toInt()

public const val B28800: Int = 28800.toInt()

public const val B38400: Int = 38400.toInt()

public const val EXTA: Int = B19200

public const val EXTB: Int = B38400

public const val B57600: Int = 57600.toInt()

public const val B76800: Int = 76800.toInt()

public const val B115200: Int = 115200.toInt()

public const val B230400: Int = 230400.toInt()

public const val B460800: Int = 460800.toInt()

public const val B500000: Int = 500000.toInt()

public const val B576000: Int = 576000.toInt()

public const val B921600: Int = 921600.toInt()

public const val B1000000: Int = 1000000.toInt()

public const val B1152000: Int = 1152000.toInt()

public const val B1500000: Int = 1500000.toInt()

public const val B2000000: Int = 2000000.toInt()

public const val B2500000: Int = 2500000.toInt()

public const val B3000000: Int = 3000000.toInt()

public const val B3500000: Int = 3500000.toInt()

public const val B4000000: Int = 4000000.toInt()

public const val TCSANOW: Int = 0

public const val TCSADRAIN: Int = 1

public const val TCSAFLUSH: Int = 2

public const val TCSASOFT: Int = 16

public const val TCIFLUSH: Int = 1

public const val TCOFLUSH: Int = 2

public const val TCIOFLUSH: Int = 3

public const val TCOOFF: Int = 1

public const val TCOON: Int = 2

public const val TCIOFF: Int = 3

public const val TCION: Int = 4

public const val TTYDEF_IFLAG: UInt = 11042u

public const val TTYDEF_LFLAG: UInt = 1483u

public const val TTYDEF_CFLAG: UInt = 23040u

public const val TTYDEF_SPEED: UInt = 9600u

public const val CEOL: UByte = 0u

public val CERASE: UByte = (127).toUByte()

public val CMIN: UByte = (1).toUByte()

public val CQUIT: UByte = (28).toUByte()

public val CTIME: UByte = (0).toUByte()

public const val CBRK: UByte = 0u

public const val RTLD_LAZY: Int = 1

public const val RTLD_NOW: Int = 2

public const val RTLD_BINDING_MASK: Int = 3

public const val RTLD_NOLOAD: Int = 4

public const val RTLD_DEEPBIND: Int = 8

public const val RTLD_GLOBAL: Int = 256

public const val RTLD_LOCAL: Int = 0

public const val RTLD_NODELETE: Int = 4096

public const val DLFO_STRUCT_HAS_EH_DBASE: ULong = 1uL

public const val DLFO_STRUCT_HAS_EH_COUNT: ULong = 0uL

public const val LM_ID_BASE: Long = 0

public const val LM_ID_NEWLM: Long = -1

public const val SIGINT: Int = 2

public const val SIGILL: Int = 4

public const val SIGABRT: Int = 6

public const val SIGFPE: Int = 8

public const val SIGSEGV: Int = 11

public const val SIGTERM: Int = 15

public const val SIGHUP: Int = 1

public const val SIGQUIT: Int = 3

public const val SIGTRAP: Int = 5

public const val SIGKILL: Int = 9

public const val SIGPIPE: Int = 13

public const val SIGALRM: Int = 14

public const val SIGIOT: Int = 6

public const val SIGBUS: Int = 10

public const val SIGSYS: Int = 12

public const val SIGEMT: Int = 7

public const val SIGINFO: Int = 29

public const val SIGLOST: Int = 32

public const val SIGURG: Int = 16

public const val SIGSTOP: Int = 17

public const val SIGTSTP: Int = 18

public const val SIGCONT: Int = 19

public const val SIGCHLD: Int = 20

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGPOLL: Int = 23

public const val SIGXCPU: Int = 24

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGXFSZ: Int = 25

public const val SIGUSR1: Int = 30

public const val SIGUSR2: Int = 31

public const val SIGWINCH: Int = 28

public const val SIGIO: Int = 23

public const val SIGCLD: Int = 20

public const val __SIGRTMIN: ULong = 32uL

public const val __SIGRTMAX: ULong = 32uL

public const val _NSIG: ULong = 33uL

public const val NSIG: ULong = 33uL

public const val SA_ONSTACK: Int = 1

public const val SA_RESTART: Int = 2

public const val SA_NODEFER: Int = 16

public const val SA_RESETHAND: Int = 4

public const val SA_NOCLDSTOP: Int = 8

public const val SA_SIGINFO: Int = 64

public const val SA_INTERRUPT: Int = 0

public const val SA_NOMASK: Int = 16

public const val SA_ONESHOT: Int = 4

public const val SA_STACK: Int = 1

public const val SIG_BLOCK: Int = 1

public const val SIG_UNBLOCK: Int = 2

public const val SIG_SETMASK: Int = 3

public val FPC_IE: UShort = (1).toUShort()

public val FPC_IM: UShort = (1).toUShort()

public val FPC_DE: UShort = (2).toUShort()

public val FPC_DM: UShort = (2).toUShort()

public val FPC_ZE: UShort = (4).toUShort()

public val FPC_ZM: UShort = (4).toUShort()

public val FPC_OE: UShort = (8).toUShort()

public val FPC_OM: UShort = (8).toUShort()

public val FPC_UE: UShort = (16).toUShort()

public val FPC_PE: UShort = (32).toUShort()

public val FPC_PC: UShort = (768).toUShort()

public val FPC_PC_24: UShort = (0).toUShort()

public val FPC_PC_53: UShort = (512).toUShort()

public val FPC_PC_64: UShort = (768).toUShort()

public val FPC_RC: UShort = (3072).toUShort()

public val FPC_RC_RN: UShort = (0).toUShort()

public val FPC_RC_RD: UShort = (1024).toUShort()

public val FPC_RC_RU: UShort = (2048).toUShort()

public val FPC_RC_CHOP: UShort = (3072).toUShort()

public val FPC_IC: UShort = (4096).toUShort()

public val FPC_IC_PROJ: UShort = (0).toUShort()

public val FPC_IC_AFF: UShort = (4096).toUShort()

public val FPS_IE: UShort = (1).toUShort()

public val FPS_DE: UShort = (2).toUShort()

public val FPS_ZE: UShort = (4).toUShort()

public val FPS_OE: UShort = (8).toUShort()

public val FPS_UE: UShort = (16).toUShort()

public val FPS_PE: UShort = (32).toUShort()

public val FPS_SF: UShort = (64).toUShort()

public val FPS_ES: UShort = (128).toUShort()

public val FPS_C0: UShort = (256).toUShort()

public val FPS_C1: UShort = (512).toUShort()

public val FPS_C2: UShort = (1024).toUShort()

public val FPS_TOS: UShort = (14336).toUShort()

public val FPS_TOS_SHIFT: UShort = (11).toUShort()

public val FPS_C3: UShort = (16384).toUShort()

public val FPS_BUSY: UShort = (32768).toUShort()

public const val FPE_INTOVF_TRAP: Int = 1

public const val FPE_INTDIV_FAULT: Int = 2

public const val FPE_FLTOVF_FAULT: Int = 3

public const val FPE_FLTDIV_FAULT: Int = 4

public const val FPE_FLTUND_FAULT: Int = 5

public const val FPE_SUBRNG_FAULT: Int = 7

public const val FPE_FLTDNR_FAULT: Int = 8

public const val FPE_FLTINX_FAULT: Int = 9

public const val FPE_EMERR_FAULT: Int = 10

public const val FPE_EMBND_FAULT: Int = 11

public const val ILL_INVOPR_FAULT: Int = 1

public const val ILL_STACK_FAULT: Int = 2

public const val ILL_FPEOPR_FAULT: Int = 3

public const val DBG_SINGLE_TRAP: Int = 1

public const val DBG_BRKPNT_FAULT: Int = 2

public const val __NGREG: ULong = 19uL

public const val NGREG: ULong = 19uL

public const val MINSIGSTKSZ: ULong = 8192uL

public const val SIGSTKSZ: ULong = 40960uL

public const val __S_IFMT: UInt = 61440u

public const val __S_IFDIR: UInt = 16384u

public const val __S_IFCHR: UInt = 8192u

public const val __S_IFBLK: UInt = 24576u

public const val __S_IFREG: UInt = 32768u

public const val __S_IFLNK: UInt = 40960u

public const val __S_IFSOCK: UInt = 49152u

public const val __S_IFIFO: UInt = 4096u

public const val __S_ISUID: UInt = 2048u

public const val __S_ISGID: UInt = 1024u

public const val __S_ISVTX: UInt = 512u

public const val __S_IREAD: UInt = 256u

public const val __S_IWRITE: UInt = 128u

public const val __S_IEXEC: UInt = 64u

public const val S_INOCACHE: UInt = 65536u

public const val S_IUSEUNK: UInt = 131072u

public const val S_IUNKNOWN: UInt = 1835008u

public const val S_IUNKSHIFT: UInt = 12u

public const val S_IPTRANS: UInt = 2097152u

public const val S_IATRANS: UInt = 4194304u

public const val S_IROOT: UInt = 8388608u

public const val S_ITRANS: UInt = 14680064u

public const val S_IMMAP0: UInt = 16777216u

public const val CMASK: UInt = 18u

public const val UF_SETTABLE: UInt = 65535u

public const val UF_NODUMP: UInt = 1u

public const val UF_IMMUTABLE: UInt = 2u

public const val UF_APPEND: UInt = 4u

public const val UF_OPAQUE: UInt = 8u

public const val UF_NOUNLINK: UInt = 16u

public const val SF_SETTABLE: UInt = 4294901760u

public const val SF_ARCHIVED: UInt = 65536u

public const val SF_IMMUTABLE: UInt = 131072u

public const val SF_APPEND: UInt = 262144u

public const val SF_NOUNLINK: UInt = 1048576u

public const val SF_SNAPSHOT: UInt = 2097152u

public const val UTIME_NOW: Long = -1

public const val UTIME_OMIT: Long = -2

public const val S_IFMT: UInt = 61440u

public const val S_IFDIR: UInt = 16384u

public const val S_IFCHR: UInt = 8192u

public const val S_IFBLK: UInt = 24576u

public const val S_IFREG: UInt = 32768u

public const val S_IFIFO: UInt = 4096u

public const val S_IFLNK: UInt = 40960u

public const val S_IFSOCK: UInt = 49152u

public const val S_ISUID: UInt = 2048u

public const val S_ISGID: UInt = 1024u

public const val S_ISVTX: UInt = 512u

public const val S_IRUSR: UInt = 256u

public const val S_IWUSR: UInt = 128u

public const val S_IXUSR: UInt = 64u

public const val S_IRWXU: UInt = 448u

public const val S_IREAD: UInt = 256u

public const val S_IWRITE: UInt = 128u

public const val S_IEXEC: UInt = 64u

public const val S_IRGRP: UInt = 32u

public const val S_IWGRP: UInt = 16u

public const val S_IXGRP: UInt = 8u

public const val S_IRWXG: UInt = 56u

public const val S_IROTH: UInt = 4u

public const val S_IWOTH: UInt = 2u

public const val S_IXOTH: UInt = 1u

public const val S_IRWXO: UInt = 7u

public const val ACCESSPERMS: UInt = 511u

public const val ALLPERMS: UInt = 4095u

public const val DEFFILEMODE: UInt = 438u

public const val S_BLKSIZE: ULong = 512uL

public const val STATX_TYPE: UInt = 1u

public const val STATX_MODE: UInt = 2u

public const val STATX_NLINK: UInt = 4u

public const val STATX_UID: UInt = 8u

public const val STATX_GID: UInt = 16u

public const val STATX_ATIME: UInt = 32u

public const val STATX_MTIME: UInt = 64u

public const val STATX_CTIME: UInt = 128u

public const val STATX_INO: UInt = 256u

public const val STATX_SIZE: UInt = 512u

public const val STATX_BLOCKS: UInt = 1024u

public const val STATX_BASIC_STATS: UInt = 2047u

public const val STATX_ALL: UInt = 4095u

public const val STATX_BTIME: UInt = 2048u

public const val STATX_MNT_ID: UInt = 4096u

public const val STATX_DIOALIGN: UInt = 8192u

public const val STATX__RESERVED: UInt = 2147483648u

public const val STATX_ATTR_COMPRESSED: UInt = 4u

public const val STATX_ATTR_IMMUTABLE: UInt = 16u

public const val STATX_ATTR_APPEND: UInt = 32u

public const val STATX_ATTR_NODUMP: UInt = 64u

public const val STATX_ATTR_ENCRYPTED: UInt = 2048u

public const val STATX_ATTR_AUTOMOUNT: UInt = 4096u

public const val STATX_ATTR_MOUNT_ROOT: UInt = 8192u

public const val STATX_ATTR_VERITY: UInt = 1048576u

public const val STATX_ATTR_DAX: UInt = 2097152u

public const val TIOCM_LE: Int = 1

public const val TIOCM_DTR: Int = 2

public const val TIOCM_RTS: Int = 4

public const val TIOCM_ST: Int = 8

public const val TIOCM_SR: Int = 16

public const val TIOCM_CTS: Int = 32

public const val TIOCM_CAR: Int = 64

public const val TIOCM_CD: Int = 64

public const val TIOCM_RNG: Int = 128

public const val TIOCM_RI: Int = 128

public const val TIOCM_DSR: Int = 256

public const val TIOCPKT_DATA: Int = 0

public const val TIOCPKT_FLUSHREAD: Int = 1

public const val TIOCPKT_FLUSHWRITE: Int = 2

public const val TIOCPKT_STOP: Int = 4

public const val TIOCPKT_START: Int = 8

public const val TIOCPKT_NOSTOP: Int = 16

public const val TIOCPKT_DOSTOP: Int = 32

public const val TIOCPKT_IOCTL: Int = 64

public const val TTYDISC: Int = 0

public const val TABLDISC: Int = 3

public const val SLIPDISC: Int = 4

public const val TANDEM: UInt = 1u

public const val CBREAK: UInt = 2u

public const val LCASE: UInt = 4u

public const val CRMOD: UInt = 16u

public const val RAW: UInt = 32u

public const val ODDP: UInt = 64u

public const val EVENP: UInt = 128u

public const val ANYP: UInt = 192u

public const val NLDELAY: UInt = 768u

public const val NL2: UInt = 512u

public const val NL3: UInt = 768u

public const val TBDELAY: UInt = 3072u

public const val XTABS: UInt = 3072u

public const val CRDELAY: UInt = 12288u

public const val VTDELAY: UInt = 16384u

public const val BSDELAY: UInt = 32768u

public const val ALLDELAY: UInt = 65280u

public const val CRTBS: UInt = 65536u

public const val PRTERA: UInt = 131072u

public const val CRTERA: UInt = 262144u

public const val TILDE: UInt = 524288u

public const val LITOUT: UInt = 2097152u

public const val NOHANG: UInt = 16777216u

public const val L001000: UInt = 33554432u

public const val CRTKIL: UInt = 67108864u

public const val PASS8: UInt = 134217728u

public const val CTLECH: UInt = 268435456u

public const val DECCTQ: UInt = 1073741824u

public const val FIONBIO: ULong = 0xa008007euL

public const val FIONREAD: ULong = 0x6008007fuL

public const val TIOCSWINSZ: ULong = 0x90200767uL

public const val TIOCGWINSZ: ULong = 0x50200768uL

public const val TIOCEXCL: ULong = 0x70duL

public const val TIOCNXCL: ULong = 0x70euL

public const val TIOCSCTTY: ULong = 0x761uL

public const val FIOCLEX: ULong = 1uL

public const val O_EXEC: Int = 4

public const val O_NORW: Int = 0

public const val O_RDONLY: Int = 1

public const val O_WRONLY: Int = 2

public const val O_RDWR: Int = 3

public const val O_ACCMODE: Int = 3

public const val O_LARGEFILE: Int = 0

public const val O_CREAT: Int = 16

public const val O_EXCL: Int = 32

public const val O_NOLINK: Int = 64

public const val O_NOTRANS: Int = 128

public const val O_NOFOLLOW: Int = 1048576

public const val O_DIRECTORY: Int = 2097152

public const val O_APPEND: Int = 256

public const val O_ASYNC: Int = 512

public const val O_FSYNC: Int = 1024

public const val O_SYNC: Int = 1024

public const val O_NOATIME: Int = 2048

public const val O_SHLOCK: Int = 131072

public const val O_EXLOCK: Int = 262144

public const val O_DSYNC: Int = 1024

public const val O_RSYNC: Int = 1024

public const val O_NONBLOCK: Int = 8

public const val O_NDELAY: Int = 8

public const val O_HURD: Int = 458751

public const val O_TRUNC: Int = 65536

public const val O_CLOEXEC: Int = 4194304

public const val O_IGNORE_CTTY: Int = 524288

public const val O_TMPFILE: Int = 8388608

public const val O_NOCTTY: Int = 0

public const val FREAD: Int = 1

public const val FWRITE: Int = 2

public const val FASYNC: Int = 512

public const val FCREAT: Int = 16

public const val FEXCL: Int = 32

public const val FTRUNC: Int = 65536

public const val FNOCTTY: Int = 0

public const val FFSYNC: Int = 1024

public const val FSYNC: Int = 1024

public const val FAPPEND: Int = 256

public const val FNONBLOCK: Int = 8

public const val FNDELAY: Int = 8

public const val F_DUPFD: Int = 0

public const val F_GETFD: Int = 1

public const val F_SETFD: Int = 2

public const val F_GETFL: Int = 3

public const val F_SETFL: Int = 4

public const val F_GETOWN: Int = 5

public const val F_SETOWN: Int = 6

public const val F_GETLK: Int = 7

public const val F_SETLK: Int = 8

public const val F_SETLKW: Int = 9

public const val F_GETLK64: Int = 10

public const val F_SETLK64: Int = 11

public const val F_SETLKW64: Int = 12

public const val F_DUPFD_CLOEXEC: Int = 1030

public const val FD_CLOEXEC: Int = 1

public const val F_RDLCK: Int = 1

public const val F_WRLCK: Int = 2

public const val F_UNLCK: Int = 3

public const val POSIX_FADV_NORMAL: Int = 0

public const val POSIX_FADV_RANDOM: Int = 1

public const val POSIX_FADV_SEQUENTIAL: Int = 2

public const val POSIX_FADV_WILLNEED: Int = 3

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val AT_FDCWD: Int = -100

public const val AT_SYMLINK_NOFOLLOW: Int = 256

public const val AT_REMOVEDIR: Int = 512

public const val AT_SYMLINK_FOLLOW: Int = 1024

public const val AT_NO_AUTOMOUNT: Int = 2048

public const val AT_EMPTY_PATH: Int = 4096

public const val AT_STATX_SYNC_TYPE: Int = 24576

public const val AT_STATX_SYNC_AS_STAT: Int = 0

public const val AT_STATX_FORCE_SYNC: Int = 8192

public const val AT_STATX_DONT_SYNC: Int = 16384

public const val AT_RECURSIVE: Int = 32768

public const val AT_EACCESS: Int = 512

public const val RWF_HIPRI: Int = 1

public const val RWF_DSYNC: Int = 2

public const val RWF_SYNC: Int = 4

public const val RWF_NOWAIT: Int = 8

public const val RWF_APPEND: Int = 16

public const val EPERM: Int = 1073741825

public const val ENOENT: Int = 1073741826

public const val ESRCH: Int = 1073741827

public const val EINTR: Int = 1073741828

public const val EIO: Int = 1073741829

public const val ENXIO: Int = 1073741830

public const val E2BIG: Int = 1073741831

public const val ENOEXEC: Int = 1073741832

public const val EBADF: Int = 1073741833

public const val ECHILD: Int = 1073741834

public const val EDEADLK: Int = 1073741835

public const val ENOMEM: Int = 1073741836

public const val EACCES: Int = 1073741837

public const val EFAULT: Int = 1073741838

public const val ENOTBLK: Int = 1073741839

public const val EBUSY: Int = 1073741840

public const val EEXIST: Int = 1073741841

public const val EXDEV: Int = 1073741842

public const val ENODEV: Int = 1073741843

public const val ENOTDIR: Int = 1073741844

public const val EISDIR: Int = 1073741845

public const val EINVAL: Int = 1073741846

public const val EMFILE: Int = 1073741848

public const val ENFILE: Int = 1073741847

public const val ENOTTY: Int = 1073741849

public const val ETXTBSY: Int = 1073741850

public const val EFBIG: Int = 1073741851

public const val ENOSPC: Int = 1073741852

public const val ESPIPE: Int = 1073741853

public const val EROFS: Int = 1073741854

public const val EMLINK: Int = 1073741855

public const val EPIPE: Int = 1073741856

public const val EDOM: Int = 1073741857

public const val ERANGE: Int = 1073741858

public const val EAGAIN: Int = 1073741859

public const val EWOULDBLOCK: Int = 1073741859

public const val EINPROGRESS: Int = 1073741860

public const val EALREADY: Int = 1073741861

public const val ENOTSOCK: Int = 1073741862

public const val EMSGSIZE: Int = 1073741864

public const val EPROTOTYPE: Int = 1073741865

public const val ENOPROTOOPT: Int = 1073741866

public const val EPROTONOSUPPORT: Int = 1073741867

public const val ESOCKTNOSUPPORT: Int = 1073741868

public const val EOPNOTSUPP: Int = 1073741869

public const val EPFNOSUPPORT: Int = 1073741870

public const val EAFNOSUPPORT: Int = 1073741871

public const val EADDRINUSE: Int = 1073741872

public const val EADDRNOTAVAIL: Int = 1073741873

public const val ENETDOWN: Int = 1073741874

public const val ENETUNREACH: Int = 1073741875

public const val ENETRESET: Int = 1073741876

public const val ECONNABORTED: Int = 1073741877

public const val ECONNRESET: Int = 1073741878

public const val ENOBUFS: Int = 1073741879

public const val EISCONN: Int = 1073741880

public const val ENOTCONN: Int = 1073741881

public const val EDESTADDRREQ: Int = 1073741863

public const val ESHUTDOWN: Int = 1073741882

public const val ETOOMANYREFS: Int = 1073741883

public const val ETIMEDOUT: Int = 1073741884

public const val ECONNREFUSED: Int = 1073741885

public const val ELOOP: Int = 1073741886

public const val ENAMETOOLONG: Int = 1073741887

public const val EHOSTDOWN: Int = 1073741888

public const val EHOSTUNREACH: Int = 1073741889

public const val ENOTEMPTY: Int = 1073741890

public const val EPROCLIM: Int = 1073741891

public const val EUSERS: Int = 1073741892

public const val EDQUOT: Int = 1073741893

public const val ESTALE: Int = 1073741894

public const val EREMOTE: Int = 1073741895

public const val EBADRPC: Int = 1073741896

public const val ERPCMISMATCH: Int = 1073741897

public const val EPROGUNAVAIL: Int = 1073741898

public const val EPROGMISMATCH: Int = 1073741899

public const val EPROCUNAVAIL: Int = 1073741900

public const val ENOLCK: Int = 1073741901

public const val EFTYPE: Int = 1073741903

public const val EAUTH: Int = 1073741904

public const val ENEEDAUTH: Int = 1073741905

public const val ENOSYS: Int = 1073741902

public const val ELIBEXEC: Int = 1073741907

public const val ENOTSUP: Int = 1073741942

public const val EILSEQ: Int = 1073741930

public const val EBACKGROUND: Int = 1073741924

public const val EDIED: Int = 1073741925

public const val EGREGIOUS: Int = 1073741927

public const val EIEIO: Int = 1073741928

public const val EGRATUITOUS: Int = 1073741929

public const val EBADMSG: Int = 1073741931

public const val EIDRM: Int = 1073741932

public const val EMULTIHOP: Int = 1073741933

public const val ENODATA: Int = 1073741934

public const val ENOLINK: Int = 1073741935

public const val ENOMSG: Int = 1073741936

public const val ENOSR: Int = 1073741937

public const val ENOSTR: Int = 1073741938

public const val EOVERFLOW: Int = 1073741939

public const val EPROTO: Int = 1073741940

public const val ETIME: Int = 1073741941

public const val ECANCELED: Int = 1073741943

public const val EOWNERDEAD: Int = 1073741944

public const val ENOTRECOVERABLE: Int = 1073741945

public const val EMACH_SEND_IN_PROGRESS: Int = 268435457

public const val EMACH_SEND_INVALID_DATA: Int = 268435458

public const val EMACH_SEND_INVALID_DEST: Int = 268435459

public const val EMACH_SEND_TIMED_OUT: Int = 268435460

public const val EMACH_SEND_WILL_NOTIFY: Int = 268435461

public const val EMACH_SEND_NOTIFY_IN_PROGRESS: Int = 268435462

public const val EMACH_SEND_INTERRUPTED: Int = 268435463

public const val EMACH_SEND_MSG_TOO_SMALL: Int = 268435464

public const val EMACH_SEND_INVALID_REPLY: Int = 268435465

public const val EMACH_SEND_INVALID_RIGHT: Int = 268435466

public const val EMACH_SEND_INVALID_NOTIFY: Int = 268435467

public const val EMACH_SEND_INVALID_MEMORY: Int = 268435468

public const val EMACH_SEND_NO_BUFFER: Int = 268435469

public const val EMACH_SEND_NO_NOTIFY: Int = 268435470

public const val EMACH_SEND_INVALID_TYPE: Int = 268435471

public const val EMACH_SEND_INVALID_HEADER: Int = 268435472

public const val EMACH_RCV_IN_PROGRESS: Int = 268451841

public const val EMACH_RCV_INVALID_NAME: Int = 268451842

public const val EMACH_RCV_TIMED_OUT: Int = 268451843

public const val EMACH_RCV_TOO_LARGE: Int = 268451844

public const val EMACH_RCV_INTERRUPTED: Int = 268451845

public const val EMACH_RCV_PORT_CHANGED: Int = 268451846

public const val EMACH_RCV_INVALID_NOTIFY: Int = 268451847

public const val EMACH_RCV_INVALID_DATA: Int = 268451848

public const val EMACH_RCV_PORT_DIED: Int = 268451849

public const val EMACH_RCV_IN_SET: Int = 268451850

public const val EMACH_RCV_HEADER_ERROR: Int = 268451851

public const val EMACH_RCV_BODY_ERROR: Int = 268451852

public const val EKERN_INVALID_ADDRESS: Int = 1

public const val EKERN_PROTECTION_FAILURE: Int = 2

public const val EKERN_NO_SPACE: Int = 3

public const val EKERN_INVALID_ARGUMENT: Int = 4

public const val EKERN_FAILURE: Int = 5

public const val EKERN_RESOURCE_SHORTAGE: Int = 6

public const val EKERN_NOT_RECEIVER: Int = 7

public const val EKERN_NO_ACCESS: Int = 8

public const val EKERN_MEMORY_FAILURE: Int = 9

public const val EKERN_MEMORY_ERROR: Int = 10

public const val EKERN_NOT_IN_SET: Int = 12

public const val EKERN_NAME_EXISTS: Int = 13

public const val EKERN_ABORTED: Int = 14

public const val EKERN_INVALID_NAME: Int = 15

public const val EKERN_INVALID_TASK: Int = 16

public const val EKERN_INVALID_RIGHT: Int = 17

public const val EKERN_INVALID_VALUE: Int = 18

public const val EKERN_UREFS_OVERFLOW: Int = 19

public const val EKERN_INVALID_CAPABILITY: Int = 20

public const val EKERN_RIGHT_EXISTS: Int = 21

public const val EKERN_INVALID_HOST: Int = 22

public const val EKERN_MEMORY_PRESENT: Int = 23

public const val EKERN_WRITE_PROTECTION_FAILURE: Int = 24

public const val EKERN_TERMINATED: Int = 26

public const val EKERN_TIMEDOUT: Int = 27

public const val EKERN_INTERRUPTED: Int = 28

public const val EMIG_TYPE_ERROR: Int = -300

public const val EMIG_REPLY_MISMATCH: Int = -301

public const val EMIG_REMOTE_ERROR: Int = -302

public const val EMIG_BAD_ID: Int = -303

public const val EMIG_BAD_ARGUMENTS: Int = -304

public const val EMIG_NO_REPLY: Int = -305

public const val EMIG_EXCEPTION: Int = -306

public const val EMIG_ARRAY_TOO_LARGE: Int = -307

public const val EMIG_SERVER_DIED: Int = -308

public const val EMIG_DESTROY_REQUEST: Int = -309

public const val ED_IO_ERROR: Int = 2500

public const val ED_WOULD_BLOCK: Int = 2501

public const val ED_NO_SUCH_DEVICE: Int = 2502

public const val ED_ALREADY_OPEN: Int = 2503

public const val ED_DEVICE_DOWN: Int = 2504

public const val ED_INVALID_OPERATION: Int = 2505

public const val ED_INVALID_RECNUM: Int = 2506

public const val ED_INVALID_SIZE: Int = 2507

public const val ED_NO_MEMORY: Int = 2508

public const val ED_READ_ONLY: Int = 2509

public const val _HURD_ERRNOS: ULong = 122uL

public const val SCHED_OTHER: Int = 0

public const val SCHED_FIFO: Int = 1

public const val SCHED_RR: Int = 2

public const val _BITS_TYPES_STRUCT_SCHED_PARAM: ULong = 1uL

public const val __CPU_SETSIZE: ULong = 1024uL

public const val CPU_SETSIZE: ULong = 1024uL

public const val PTHREAD_SPINLOCK_INITIALIZER: Int = 0

public const val PTHREAD_CANCEL_DISABLE: Int = 0

public const val PTHREAD_CANCEL_ENABLE: Int = 1

public const val PTHREAD_CANCEL_DEFERRED: Int = 0

public const val PTHREAD_CANCEL_ASYNCHRONOUS: Int = 1

public const val PTHREAD_BARRIER_SERIAL_THREAD: Int = -1

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

public const val TCP_CM_INQ: Int = 36

public const val TCP_TX_DELAY: Int = 37

public const val TCP_REPAIR_ON: Int = 1

public const val TCP_REPAIR_OFF: Int = 0

public const val TCP_REPAIR_OFF_NO_WP: Int = -1

public const val INT8_MIN: Byte = -128

public const val INT16_MIN: Short = -32768

public const val INT32_MIN: Int = -2147483648

public const val INT8_MAX: Byte = 127

public const val INT16_MAX: Short = 32767

public const val INT32_MAX: Int = 2147483647

public val UINT8_MAX: UByte = (255).toUByte()

public val UINT16_MAX: UShort = (65535).toUShort()

public const val UINT32_MAX: UInt = 4294967295u

public const val INT_LEAST8_MIN: Byte = -128

public const val INT_LEAST16_MIN: Short = -32768

public const val INT_LEAST32_MIN: Int = -2147483648

public const val INT_LEAST8_MAX: Byte = 127

public const val INT_LEAST16_MAX: Short = 32767

public const val INT_LEAST32_MAX: Int = 2147483647

public const val UINT_LEAST8_MAX: UByte = 255u

public const val UINT_LEAST16_MAX: UShort = 65535u

public const val UINT_LEAST32_MAX: UInt = 4294967295u

public const val INT_FAST8_MIN: Byte = -128

public const val INT_FAST16_MIN: Int = -2147483648

public const val INT_FAST32_MIN: Int = -2147483648

public const val INT_FAST8_MAX: Byte = 127

public const val INT_FAST16_MAX: Int = 2147483647

public const val INT_FAST32_MAX: Int = 2147483647

public const val UINT_FAST8_MAX: UByte = 255u

public const val UINT_FAST16_MAX: UInt = 4294967295u

public const val UINT_FAST32_MAX: UInt = 4294967295u

public const val INTPTR_MIN: Int = -2147483648

public const val INTPTR_MAX: Int = 2147483647

public const val UINTPTR_MAX: ULong = 4294967295uL

public const val PTRDIFF_MIN: Int = -2147483648

public const val PTRDIFF_MAX: Int = 2147483647

public const val SIG_ATOMIC_MIN: Int = -2147483648

public const val SIG_ATOMIC_MAX: Int = 2147483647

public const val SIZE_MAX: ULong = 4294967295uL

public const val WINT_MIN: UInt = 0u

public const val WINT_MAX: UInt = 4294967295u

public const val INT8_WIDTH: ULong = 8uL

public const val UINT8_WIDTH: ULong = 8uL

public const val INT16_WIDTH: ULong = 16uL

public const val UINT16_WIDTH: ULong = 16uL

public const val INT32_WIDTH: ULong = 32uL

public const val UINT32_WIDTH: ULong = 32uL

public const val INT64_WIDTH: ULong = 64uL

public const val UINT64_WIDTH: ULong = 64uL

public const val INT_LEAST8_WIDTH: ULong = 8uL

public const val UINT_LEAST8_WIDTH: ULong = 8uL

public const val INT_LEAST16_WIDTH: ULong = 16uL

public const val UINT_LEAST16_WIDTH: ULong = 16uL

public const val INT_LEAST32_WIDTH: ULong = 32uL

public const val UINT_LEAST32_WIDTH: ULong = 32uL

public const val INT_LEAST64_WIDTH: ULong = 64uL

public const val UINT_LEAST64_WIDTH: ULong = 64uL

public const val INT_FAST8_WIDTH: ULong = 8uL

public const val UINT_FAST8_WIDTH: ULong = 8uL

public const val INT_FAST16_WIDTH: ULong = 32uL

public const val UINT_FAST16_WIDTH: ULong = 32uL

public const val INT_FAST32_WIDTH: ULong = 32uL

public const val UINT_FAST32_WIDTH: ULong = 32uL

public const val INT_FAST64_WIDTH: ULong = 64uL

public const val UINT_FAST64_WIDTH: ULong = 64uL

public const val INTPTR_WIDTH: ULong = 32uL

public const val UINTPTR_WIDTH: ULong = 32uL

public const val INTMAX_WIDTH: ULong = 64uL

public const val UINTMAX_WIDTH: ULong = 64uL

public const val PTRDIFF_WIDTH: ULong = 32uL

public const val SIG_ATOMIC_WIDTH: ULong = 32uL

public const val SIZE_WIDTH: ULong = 32uL

public const val WCHAR_WIDTH: ULong = 32uL

public const val WINT_WIDTH: ULong = 32uL

public val TH_FIN: UByte = (1).toUByte()

public val TH_SYN: UByte = (2).toUByte()

public val TH_RST: UByte = (4).toUByte()

public val TH_PUSH: UByte = (8).toUByte()

public val TH_ACK: UByte = (16).toUByte()

public val TH_URG: UByte = (32).toUByte()

public val TCPOPT_EOL: UByte = (0).toUByte()

public val TCPOPT_NOP: UByte = (1).toUByte()

public val TCPOPT_MAXSEG: UByte = (2).toUByte()

public val TCPOLEN_MAXSEG: UByte = (4).toUByte()

public val TCPOPT_WINDOW: UByte = (3).toUByte()

public val TCPOLEN_WINDOW: UByte = (3).toUByte()

public val TCPOPT_SACK_PERMITTED: UByte = (4).toUByte()

public val TCPOLEN_SACK_PERMITTED: UByte = (2).toUByte()

public val TCPOPT_SACK: UByte = (5).toUByte()

public val TCPOPT_TIMESTAMP: UByte = (8).toUByte()

public val TCPOLEN_TIMESTAMP: UByte = (10).toUByte()

public val TCPOLEN_TSTAMP_APPA: UByte = (12).toUByte()

public const val TCPOPT_TSTAMP_HDR: UInt = 16844810u

public const val TCP_MSS: ULong = 512uL

public const val TCP_MAXWIN: ULong = 65535uL

public const val TCP_MAX_WINSHIFT: ULong = 14uL

public val TCPI_OPT_TIMESTAMPS: UByte = (1).toUByte()

public val TCPI_OPT_SACK: UByte = (2).toUByte()

public val TCPI_OPT_WSCALE: UByte = (4).toUByte()

public val TCPI_OPT_ECN: UByte = (8).toUByte()

public val TCPI_OPT_ECN_SEEN: UByte = (16).toUByte()

public val TCPI_OPT_SYN_DATA: UByte = (32).toUByte()

public const val TCP_MD5SIG_MAXKEYLEN: ULong = 80uL

public const val TCP_MD5SIG_FLAG_PREFIX: ULong = 1uL

public const val TCP_COOKIE_MIN: ULong = 8uL

public const val TCP_COOKIE_MAX: ULong = 16uL

public const val TCP_COOKIE_PAIR_SIZE: ULong = 32uL

public const val TCP_COOKIE_IN_ALWAYS: Int = 1

public const val TCP_COOKIE_OUT_NEVER: Int = 2

public const val TCP_S_DATA_IN: Int = 4

public const val TCP_S_DATA_OUT: Int = 8

public const val TCP_MSS_DEFAULT: ULong = 536uL

public const val TCP_MSS_DESIRED: ULong = 1220uL

public const val WCOREFLAG: Int = 128

public const val WAIT_ANY: Int = -1

public const val WAIT_MYPGRP: Int = 0

public const val LOCK_SH: Int = 1

public const val LOCK_EX: Int = 2

public const val LOCK_UN: Int = 8

public const val LOCK_NB: Int = 4

public const val PROT_NONE: Int = 0

public const val PROT_READ: Int = 4

public const val PROT_WRITE: Int = 2

public const val PROT_EXEC: Int = 1

public const val MAP_FILE: Int = 1

public const val MAP_ANON: Int = 2

public const val MAP_ANONYMOUS: Int = MAP_ANON

public const val MAP_TYPE: Int = 15

public const val MAP_COPY: Int = 32

public const val MAP_SHARED: Int = 16

public const val MAP_PRIVATE: Int = 0

public const val MAP_FIXED: Int = 256

public const val MAP_NOEXTEND: Int = 512

public const val MAP_HASSEMAPHORE: Int = 1024

public const val MAP_INHERIT: Int = 2048

public const val MAP_32BIT: Int = 4096

public const val MAP_EXCL: Int = 16384

public const val MADV_NORMAL: Int = 0

public const val MADV_RANDOM: Int = 1

public const val MADV_SEQUENTIAL: Int = 2

public const val MADV_WILLNEED: Int = 3

public const val MADV_DONTNEED: Int = 4

public const val POSIX_MADV_NORMAL: Int = 0

public const val POSIX_MADV_RANDOM: Int = 1

public const val POSIX_MADV_SEQUENTIAL: Int = 2

public const val POSIX_MADV_WILLNEED: Int = 3

public const val POSIX_MADV_WONTNEED: Int = 4

public const val MS_ASYNC: Int = 1

public const val MS_SYNC: Int = 0

public const val MS_INVALIDATE: Int = 2

public const val MREMAP_MAYMOVE: Int = 1

public const val MREMAP_FIXED: Int = 2

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val XATTR_CREATE: Int = 0x1

public const val XATTR_REPLACE: Int = 0x2

public const val POSIX_SPAWN_USEVFORK: Int = 64

public const val POSIX_SPAWN_SETSID: Int = 128

public val LOG_CRON: Int = 9 shl 3

public val LOG_AUTHPRIV: Int = 10 shl 3

public val LOG_FTP: Int = 11 shl 3

public const val LOG_PERROR: Int = 0x20

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

public const val GRND_NONBLOCK: UInt = 1u

public const val GRND_RANDOM: UInt = 2u

public const val GRND_INSECURE: UInt = 4u

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

public const val _SC_PAGE_SIZE: Int = 30

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

public const val _SC_EQUIV_CLASS_MAX: Int = 41

public const val _SC_EXPR_NEST_MAX: Int = 42

public const val _SC_LINE_MAX: Int = 43

public const val _SC_RE_DUP_MAX: Int = 44

public const val _SC_CHARCLASS_NAME_MAX: Int = 45

public const val _SC_2_VERSION: Int = 46

public const val _SC_2_C_BIND: Int = 47

public const val _SC_2_C_DEV: Int = 48

public const val _SC_2_FORT_DEV: Int = 49

public const val _SC_2_FORT_RUN: Int = 50

public const val _SC_2_SW_DEV: Int = 51

public const val _SC_2_LOCALEDEF: Int = 52

public const val _SC_PII: Int = 53

public const val _SC_PII_XTI: Int = 54

public const val _SC_PII_SOCKET: Int = 55

public const val _SC_PII_INTERNET: Int = 56

public const val _SC_PII_OSI: Int = 57

public const val _SC_POLL: Int = 58

public const val _SC_SELECT: Int = 59

public const val _SC_UIO_MAXIOV: Int = 60

public const val _SC_IOV_MAX: Int = 60

public const val _SC_PII_INTERNET_STREAM: Int = 61

public const val _SC_PII_INTERNET_DGRAM: Int = 62

public const val _SC_PII_OSI_COTS: Int = 63

public const val _SC_PII_OSI_CLTS: Int = 64

public const val _SC_PII_OSI_M: Int = 65

public const val _SC_T_IOV_MAX: Int = 66

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

public const val _SC_2_C_VERSION: Int = 96

public const val _SC_2_UPE: Int = 97

public const val _SC_XOPEN_XPG2: Int = 98

public const val _SC_XOPEN_XPG3: Int = 99

public const val _SC_XOPEN_XPG4: Int = 100

public const val _SC_CHAR_BIT: Int = 101

public const val _SC_CHAR_MAX: Int = 102

public const val _SC_CHAR_MIN: Int = 103

public const val _SC_INT_MAX: Int = 104

public const val _SC_INT_MIN: Int = 105

public const val _SC_LONG_BIT: Int = 106

public const val _SC_WORD_BIT: Int = 107

public const val _SC_MB_LEN_MAX: Int = 108

public const val _SC_NZERO: Int = 109

public const val _SC_SSIZE_MAX: Int = 110

public const val _SC_SCHAR_MAX: Int = 111

public const val _SC_SCHAR_MIN: Int = 112

public const val _SC_SHRT_MAX: Int = 113

public const val _SC_SHRT_MIN: Int = 114

public const val _SC_UCHAR_MAX: Int = 115

public const val _SC_UINT_MAX: Int = 116

public const val _SC_ULONG_MAX: Int = 117

public const val _SC_USHRT_MAX: Int = 118

public const val _SC_NL_ARGMAX: Int = 119

public const val _SC_NL_LANGMAX: Int = 120

public const val _SC_NL_MSGMAX: Int = 121

public const val _SC_NL_NMAX: Int = 122

public const val _SC_NL_SETMAX: Int = 123

public const val _SC_NL_TEXTMAX: Int = 124

public const val _SC_XBS5_ILP32_OFF32: Int = 125

public const val _SC_XBS5_ILP32_OFFBIG: Int = 126

public const val _SC_XBS5_LP64_OFF64: Int = 127

public const val _SC_XBS5_LPBIG_OFFBIG: Int = 128

public const val _SC_XOPEN_LEGACY: Int = 129

public const val _SC_XOPEN_REALTIME: Int = 130

public const val _SC_XOPEN_REALTIME_THREADS: Int = 131

public const val _SC_ADVISORY_INFO: Int = 132

public const val _SC_BARRIERS: Int = 133

public const val _SC_BASE: Int = 134

public const val _SC_C_LANG_SUPPORT: Int = 135

public const val _SC_C_LANG_SUPPORT_R: Int = 136

public const val _SC_CLOCK_SELECTION: Int = 137

public const val _SC_CPUTIME: Int = 138

public const val _SC_THREAD_CPUTIME: Int = 139

public const val _SC_DEVICE_IO: Int = 140

public const val _SC_DEVICE_SPECIFIC: Int = 141

public const val _SC_DEVICE_SPECIFIC_R: Int = 142

public const val _SC_FD_MGMT: Int = 143

public const val _SC_FIFO: Int = 144

public const val _SC_PIPE: Int = 145

public const val _SC_FILE_ATTRIBUTES: Int = 146

public const val _SC_FILE_LOCKING: Int = 147

public const val _SC_FILE_SYSTEM: Int = 148

public const val _SC_MONOTONIC_CLOCK: Int = 149

public const val _SC_MULTI_PROCESS: Int = 150

public const val _SC_SINGLE_PROCESS: Int = 151

public const val _SC_NETWORKING: Int = 152

public const val _SC_READER_WRITER_LOCKS: Int = 153

public const val _SC_SPIN_LOCKS: Int = 154

public const val _SC_REGEXP: Int = 155

public const val _SC_REGEX_VERSION: Int = 156

public const val _SC_SHELL: Int = 157

public const val _SC_SIGNALS: Int = 158

public const val _SC_SPAWN: Int = 159

public const val _SC_SPORADIC_SERVER: Int = 160

public const val _SC_THREAD_SPORADIC_SERVER: Int = 161

public const val _SC_SYSTEM_DATABASE: Int = 162

public const val _SC_SYSTEM_DATABASE_R: Int = 163

public const val _SC_TIMEOUTS: Int = 164

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 165

public const val _SC_USER_GROUPS: Int = 166

public const val _SC_USER_GROUPS_R: Int = 167

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

public const val _SC_LEVEL1_ICACHE_SIZE: Int = 185

public const val _SC_LEVEL1_ICACHE_ASSOC: Int = 186

public const val _SC_LEVEL1_ICACHE_LINESIZE: Int = 187

public const val _SC_LEVEL1_DCACHE_SIZE: Int = 188

public const val _SC_LEVEL1_DCACHE_ASSOC: Int = 189

public const val _SC_LEVEL1_DCACHE_LINESIZE: Int = 190

public const val _SC_LEVEL2_CACHE_SIZE: Int = 191

public const val _SC_LEVEL2_CACHE_ASSOC: Int = 192

public const val _SC_LEVEL2_CACHE_LINESIZE: Int = 193

public const val _SC_LEVEL3_CACHE_SIZE: Int = 194

public const val _SC_LEVEL3_CACHE_ASSOC: Int = 195

public const val _SC_LEVEL3_CACHE_LINESIZE: Int = 196

public const val _SC_LEVEL4_CACHE_SIZE: Int = 197

public const val _SC_LEVEL4_CACHE_ASSOC: Int = 198

public const val _SC_LEVEL4_CACHE_LINESIZE: Int = 199

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

public const val _SC_MINSIGSTKSZ: Int = 249

public const val _SC_SIGSTKSZ: Int = 250

public const val _CS_PATH: Int = 0

public const val _CS_V6_WIDTH_RESTRICTED_ENVS: Int = 1

public const val _CS_GNU_LIBC_VERSION: Int = 2

public const val _CS_GNU_LIBPTHREAD_VERSION: Int = 3

public const val _CS_V5_WIDTH_RESTRICTED_ENVS: Int = 4

public const val _CS_V7_WIDTH_RESTRICTED_ENVS: Int = 5

public const val _CS_LFS_CFLAGS: Int = 1000

public const val _CS_LFS_LDFLAGS: Int = 1001

public const val _CS_LFS_LIBS: Int = 1002

public const val _CS_LFS_LINTFLAGS: Int = 1003

public const val _CS_LFS64_CFLAGS: Int = 1004

public const val _CS_LFS64_LDFLAGS: Int = 1005

public const val _CS_LFS64_LIBS: Int = 1006

public const val _CS_LFS64_LINTFLAGS: Int = 1007

public const val _CS_XBS5_ILP32_OFF32_CFLAGS: Int = 1100

public const val _CS_XBS5_ILP32_OFF32_LDFLAGS: Int = 1101

public const val _CS_XBS5_ILP32_OFF32_LIBS: Int = 1102

public const val _CS_XBS5_ILP32_OFF32_LINTFLAGS: Int = 1103

public const val _CS_XBS5_ILP32_OFFBIG_CFLAGS: Int = 1104

public const val _CS_XBS5_ILP32_OFFBIG_LDFLAGS: Int = 1105

public const val _CS_XBS5_ILP32_OFFBIG_LIBS: Int = 1106

public const val _CS_XBS5_ILP32_OFFBIG_LINTFLAGS: Int = 1107

public const val _CS_XBS5_LP64_OFF64_CFLAGS: Int = 1108

public const val _CS_XBS5_LP64_OFF64_LDFLAGS: Int = 1109

public const val _CS_XBS5_LP64_OFF64_LIBS: Int = 1110

public const val _CS_XBS5_LP64_OFF64_LINTFLAGS: Int = 1111

public const val _CS_XBS5_LPBIG_OFFBIG_CFLAGS: Int = 1112

public const val _CS_XBS5_LPBIG_OFFBIG_LDFLAGS: Int = 1113

public const val _CS_XBS5_LPBIG_OFFBIG_LIBS: Int = 1114

public const val _CS_XBS5_LPBIG_OFFBIG_LINTFLAGS: Int = 1115

public const val _CS_POSIX_V6_ILP32_OFF32_CFLAGS: Int = 1116

public const val _CS_POSIX_V6_ILP32_OFF32_LDFLAGS: Int = 1117

public const val _CS_POSIX_V6_ILP32_OFF32_LIBS: Int = 1118

public const val _CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: Int = 1119

public const val _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: Int = 1120

public const val _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: Int = 1121

public const val _CS_POSIX_V6_ILP32_OFFBIG_LIBS: Int = 1122

public const val _CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: Int = 1123

public const val _CS_POSIX_V6_LP64_OFF64_CFLAGS: Int = 1124

public const val _CS_POSIX_V6_LP64_OFF64_LDFLAGS: Int = 1125

public const val _CS_POSIX_V6_LP64_OFF64_LIBS: Int = 1126

public const val _CS_POSIX_V6_LP64_OFF64_LINTFLAGS: Int = 1127

public const val _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: Int = 1128

public const val _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: Int = 1129

public const val _CS_POSIX_V6_LPBIG_OFFBIG_LIBS: Int = 1130

public const val _CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: Int = 1131

public const val _CS_POSIX_V7_ILP32_OFF32_CFLAGS: Int = 1132

public const val _CS_POSIX_V7_ILP32_OFF32_LDFLAGS: Int = 1133

public const val _CS_POSIX_V7_ILP32_OFF32_LIBS: Int = 1134

public const val _CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: Int = 1135

public const val _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: Int = 1136

public const val _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: Int = 1137

public const val _CS_POSIX_V7_ILP32_OFFBIG_LIBS: Int = 1138

public const val _CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: Int = 1139

public const val _CS_POSIX_V7_LP64_OFF64_CFLAGS: Int = 1140

public const val _CS_POSIX_V7_LP64_OFF64_LDFLAGS: Int = 1141

public const val _CS_POSIX_V7_LP64_OFF64_LIBS: Int = 1142

public const val _CS_POSIX_V7_LP64_OFF64_LINTFLAGS: Int = 1143

public const val _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: Int = 1144

public const val _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: Int = 1145

public const val _CS_POSIX_V7_LPBIG_OFFBIG_LIBS: Int = 1146

public const val _CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: Int = 1147

public const val _CS_V6_ENV: Int = 1148

public const val _CS_V7_ENV: Int = 1149

public const val PTHREAD_PROCESS_PRIVATE: UInt = 0u

public const val PTHREAD_PROCESS_SHARED: UInt = 1u

public const val PTHREAD_EXPLICIT_SCHED: UInt = 0u

public const val PTHREAD_INHERIT_SCHED: UInt = 1u

public const val PTHREAD_SCOPE_SYSTEM: UInt = 0u

public const val PTHREAD_SCOPE_PROCESS: UInt = 1u

public const val PTHREAD_CREATE_JOINABLE: UInt = 0u

public const val PTHREAD_CREATE_DETACHED: UInt = 1u

public const val PTHREAD_PRIO_NONE: UInt = 0u

public const val PTHREAD_PRIO_INHERIT: UInt = 1u

public const val PTHREAD_PRIO_PROTECT: UInt = 2u

public const val PTHREAD_MUTEX_TIMED: UInt = 0u

public const val PTHREAD_MUTEX_ERRORCHECK: UInt = 1u

public const val PTHREAD_MUTEX_RECURSIVE: UInt = 2u

public const val PTHREAD_MUTEX_STALLED: UInt = 0u

public const val PTHREAD_MUTEX_ROBUST: UInt = 256u

public const val RLIMIT_CPU: UInt = 0u

public const val RLIMIT_FSIZE: UInt = 1u

public const val RLIMIT_DATA: UInt = 2u

public const val RLIMIT_STACK: UInt = 3u

public const val RLIMIT_CORE: UInt = 4u

public const val RLIMIT_RSS: UInt = 5u

public const val RLIMIT_MEMLOCK: UInt = 6u

public const val RLIMIT_NPROC: UInt = 7u

public const val RLIMIT_OFILE: UInt = 8u

public const val RLIMIT_NOFILE: UInt = 8u

public const val RLIMIT_SBSIZE: UInt = 9u

public const val RLIMIT_AS: UInt = 10u

public const val RLIMIT_VMEM: UInt = 10u

public const val RLIMIT_NLIMITS: UInt = 11u

public const val RLIM_NLIMITS: UInt = 11u

public const val RUSAGE_SELF: Int = 0

public const val RUSAGE_CHILDREN: Int = -1

public const val PRIO_PROCESS: UInt = 0u

public const val PRIO_PGRP: UInt = 1u

public const val PRIO_USER: UInt = 2u

public const val __UT_LINESIZE: ULong = 32uL

public const val __UT_NAMESIZE: ULong = 32uL

public const val __UT_HOSTSIZE: ULong = 256uL

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_RAW: Int = 3

public const val SOCK_RDM: Int = 4

public const val SOCK_SEQPACKET: Int = 5

public const val SOCK_CLOEXEC: Int = 4194304

public const val SOCK_NONBLOCK: Int = 2048

public const val MSG_OOB: Int = 1

public const val MSG_PEEK: Int = 2

public const val MSG_DONTROUTE: Int = 4

public const val MSG_EOR: Int = 8

public const val MSG_TRUNC: Int = 16

public const val MSG_CTRUNC: Int = 32

public const val MSG_WAITALL: Int = 64

public const val MSG_DONTWAIT: Int = 128

public const val MSG_NOSIGNAL: Int = 1024

public const val MSG_CMSG_CLOEXEC: Int = 0x40000000

public const val SCM_RIGHTS: Int = 1

public const val SCM_TIMESTAMP: Int = 2

public const val SCM_CREDS: Int = 3

public const val SO_DEBUG: Int = 1

public const val SO_ACCEPTCONN: Int = 2

public const val SO_REUSEADDR: Int = 4

public const val SO_KEEPALIVE: Int = 8

public const val SO_DONTROUTE: Int = 16

public const val SO_BROADCAST: Int = 32

public const val SO_USELOOPBACK: Int = 64

public const val SO_LINGER: Int = 128

public const val SO_OOBINLINE: Int = 256

public const val SO_REUSEPORT: Int = 512

public const val SO_SNDBUF: Int = 4097

public const val SO_RCVBUF: Int = 4098

public const val SO_SNDLOWAT: Int = 4099

public const val SO_RCVLOWAT: Int = 4100

public const val SO_SNDTIMEO: Int = 4101

public const val SO_RCVTIMEO: Int = 4102

public const val SO_ERROR: Int = 4103

public const val SO_STYLE: Int = 4104

public const val SO_TYPE: Int = 4104

public const val IPPROTO_IP: Int = 0

public const val IPPROTO_ICMP: Int = 1

public const val IPPROTO_IGMP: Int = 2

public const val IPPROTO_IPIP: Int = 4

public const val IPPROTO_TCP: Int = 6

public const val IPPROTO_EGP: Int = 8

public const val IPPROTO_PUP: Int = 12

public const val IPPROTO_UDP: Int = 17

public const val IPPROTO_IDP: Int = 22

public const val IPPROTO_TP: Int = 29

public const val IPPROTO_DCCP: Int = 33

public const val IPPROTO_IPV6: Int = 41

public const val IPPROTO_RSVP: Int = 46

public const val IPPROTO_GRE: Int = 47

public const val IPPROTO_ESP: Int = 50

public const val IPPROTO_AH: Int = 51

public const val IPPROTO_MTP: Int = 92

public const val IPPROTO_BEETPH: Int = 94

public const val IPPROTO_ENCAP: Int = 98

public const val IPPROTO_PIM: Int = 103

public const val IPPROTO_COMP: Int = 108

public const val IPPROTO_L2TP: Int = 115

public const val IPPROTO_SCTP: Int = 132

public const val IPPROTO_UDPLITE: Int = 136

public const val IPPROTO_MPLS: Int = 137

public const val IPPROTO_ETHERNET: Int = 143

public const val IPPROTO_RAW: Int = 255

public const val IPPROTO_MPTCP: Int = 262

public const val IPPROTO_MAX: Int = 263

public const val IPPROTO_HOPOPTS: Int = 0

public const val IPPROTO_ROUTING: Int = 43

public const val IPPROTO_FRAGMENT: Int = 44

public const val IPPROTO_ICMPV6: Int = 58

public const val IPPROTO_NONE: Int = 59

public const val IPPROTO_DSTOPTS: Int = 60

public const val IPPROTO_MH: Int = 135

public const val IPPORT_ECHO: UShort = 7u

public const val IPPORT_DISCARD: UShort = 9u

public const val IPPORT_SYSTAT: UShort = 11u

public const val IPPORT_DAYTIME: UShort = 13u

public const val IPPORT_NETSTAT: UShort = 15u

public const val IPPORT_FTP: UShort = 21u

public const val IPPORT_TELNET: UShort = 23u

public const val IPPORT_SMTP: UShort = 25u

public const val IPPORT_TIMESERVER: UShort = 37u

public const val IPPORT_NAMESERVER: UShort = 42u

public const val IPPORT_WHOIS: UShort = 43u

public const val IPPORT_MTP: UShort = 57u

public const val IPPORT_TFTP: UShort = 69u

public const val IPPORT_RJE: UShort = 77u

public const val IPPORT_FINGER: UShort = 79u

public const val IPPORT_TTYLINK: UShort = 87u

public const val IPPORT_SUPDUP: UShort = 95u

public const val IPPORT_EXECSERVER: UShort = 512u

public const val IPPORT_LOGINSERVER: UShort = 513u

public const val IPPORT_CMDSERVER: UShort = 514u

public const val IPPORT_EFSSERVER: UShort = 520u

public const val IPPORT_BIFFUDP: UShort = 512u

public const val IPPORT_WHOSERVER: UShort = 513u

public const val IPPORT_ROUTESERVER: UShort = 520u

public const val IPPORT_USERRESERVED: UShort = 5000u

public val DT_UNKNOWN: UByte = (0).toUByte()

public val DT_FIFO: UByte = (1).toUByte()

public val DT_CHR: UByte = (2).toUByte()

public val DT_DIR: UByte = (4).toUByte()

public val DT_BLK: UByte = (6).toUByte()

public val DT_REG: UByte = (8).toUByte()

public val DT_LNK: UByte = (10).toUByte()

public val DT_SOCK: UByte = (12).toUByte()

public val DT_WHT: UByte = (14).toUByte()

public const val ST_RDONLY: ULong = 1uL

public const val ST_NOSUID: ULong = 2uL

public const val ST_NOEXEC: ULong = 8uL

public const val ST_SYNCHRONOUS: ULong = 16uL

public const val ST_NOATIME: ULong = 32uL

public const val ST_RELATIME: ULong = 64uL

public const val RTLD_DI_LMID: Int = 1

public const val RTLD_DI_LINKMAP: Int = 2

public const val RTLD_DI_CONFIGADDR: Int = 3

public const val RTLD_DI_SERINFO: Int = 4

public const val RTLD_DI_SERINFOSIZE: Int = 5

public const val RTLD_DI_ORIGIN: Int = 6

public const val RTLD_DI_PROFILENAME: Int = 7

public const val RTLD_DI_PROFILEOUT: Int = 8

public const val RTLD_DI_TLS_MODID: Int = 9

public const val RTLD_DI_TLS_DATA: Int = 10

public const val RTLD_DI_PHDR: Int = 11

public const val RTLD_DI_MAX: Int = 11

public const val SI_ASYNCIO: Int = -4

public const val SI_MESGQ: Int = -3

public const val SI_TIMER: Int = -2

public const val SI_QUEUE: Int = -1

public const val SI_USER: Int = 0

public const val ILL_ILLOPC: Int = 1

public const val ILL_ILLOPN: Int = 2

public const val ILL_ILLADR: Int = 3

public const val ILL_ILLTRP: Int = 4

public const val ILL_PRVOPC: Int = 5

public const val ILL_PRVREG: Int = 6

public const val ILL_COPROC: Int = 7

public const val ILL_BADSTK: Int = 8

public const val FPE_INTDIV: Int = 1

public const val FPE_INTOVF: Int = 2

public const val FPE_FLTDIV: Int = 3

public const val FPE_FLTOVF: Int = 4

public const val FPE_FLTUND: Int = 5

public const val FPE_FLTRES: Int = 6

public const val FPE_FLTINV: Int = 7

public const val FPE_FLTSUB: Int = 8

public const val SEGV_MAPERR: Int = 1

public const val SEGV_ACCERR: Int = 2

public const val BUS_ADRALN: Int = 1

public const val BUS_ADRERR: Int = 2

public const val BUS_OBJERR: Int = 3

public const val TRAP_BRKPT: Int = 1

public const val TRAP_TRACE: Int = 2

public const val CLD_EXITED: Int = 1

public const val CLD_KILLED: Int = 2

public const val CLD_DUMPED: Int = 3

public const val CLD_TRAPPED: Int = 4

public const val CLD_STOPPED: Int = 5

public const val CLD_CONTINUED: Int = 6

public const val POLL_IN: Int = 1

public const val POLL_OUT: Int = 2

public const val POLL_MSG: Int = 3

public const val POLL_ERR: Int = 4

public const val POLL_PRI: Int = 5

public const val POLL_HUP: Int = 6

public const val SIGEV_SIGNAL: Int = 0

public const val SIGEV_NONE: Int = 1

public const val SIGEV_THREAD: Int = 2

public const val REG_GS: UInt = 0u

public const val REG_FS: UInt = 1u

public const val REG_ES: UInt = 2u

public const val REG_DS: UInt = 3u

public const val REG_EDI: UInt = 4u

public const val REG_ESI: UInt = 5u

public const val REG_EBP: UInt = 6u

public const val REG_ESP: UInt = 7u

public const val REG_EBX: UInt = 8u

public const val REG_EDX: UInt = 9u

public const val REG_ECX: UInt = 10u

public const val REG_EAX: UInt = 11u

public const val REG_TRAPNO: UInt = 12u

public const val REG_ERR: UInt = 13u

public const val REG_EIP: UInt = 14u

public const val REG_CS: UInt = 15u

public const val REG_EFL: UInt = 16u

public const val REG_UESP: UInt = 17u

public const val REG_SS: UInt = 18u

public const val IOC_VOID: UInt = 0u

public const val IOC_OUT: UInt = 1u

public const val IOC_IN: UInt = 2u

public const val IOC_INOUT: UInt = 3u

public const val IOC_8: UInt = 0u

public const val IOC_16: UInt = 1u

public const val IOC_32: UInt = 2u

public const val IOC_64: UInt = 3u

public const val TCP_ESTABLISHED: UInt = 1u

public const val TCP_SYN_SENT: UInt = 2u

public const val TCP_SYN_RECV: UInt = 3u

public const val TCP_FIN_WAIT1: UInt = 4u

public const val TCP_FIN_WAIT2: UInt = 5u

public const val TCP_TIME_WAIT: UInt = 6u

public const val TCP_CLOSE: UInt = 7u

public const val TCP_CLOSE_WAIT: UInt = 8u

public const val TCP_LAST_ACK: UInt = 9u

public const val TCP_LISTEN: UInt = 10u

public const val TCP_CLOSING: UInt = 11u

public const val TCP_CA_Open: UInt = 0u

public const val TCP_CA_Disorder: UInt = 1u

public const val TCP_CA_CWR: UInt = 2u

public const val TCP_CA_Recovery: UInt = 3u

public const val TCP_CA_Loss: UInt = 4u

public const val TCP_NO_QUEUE: UInt = 0u

public const val TCP_RECV_QUEUE: UInt = 1u

public const val TCP_SEND_QUEUE: UInt = 2u

public const val TCP_QUEUES_NR: UInt = 3u

public const val P_ALL: UInt = 0u

public const val P_PID: UInt = 1u

public const val P_PGID: UInt = 2u

public const val SS_ONSTACK: Int = 1

public const val SS_DISABLE: Int = 4

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public val PTHREAD_MUTEX_INITIALIZER: io.github.kotlinmania.libc.unix.hurd.PthreadMutex =
    io.github.kotlinmania.libc.unix.hurd
        .PthreadMutex(lock = 0u, ownerId = 0u, cnt = 0u, shpid = 0, type = PTHREAD_MUTEX_TIMED.toInt(), flags = 0)

// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { __lock: __PTHREAD_SPIN_LOCK_INITIALIZER, __queue: 0i64 as *mut __pthread, __attr: 0i64 as *mut __pthread_condattr, __wrefs: 0, __data: 0i64 as *mut c_void, } (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { __held: __PTHREAD_SPIN_LOCK_INITIALIZER, __lock: __PTHREAD_SPIN_LOCK_INITIALIZER, __readers: 0, __readerqueue: 0i64 as *mut __pthread, __writerqueue: 0i64 as *mut __pthread, __attr: 0i64 as *mut __pthread_rwlockattr, __data: 0i64 as *mut c_void, } (initializer represented at the FFI boundary)
public const val PTHREAD_STACK_MIN: ULong = 0uL
