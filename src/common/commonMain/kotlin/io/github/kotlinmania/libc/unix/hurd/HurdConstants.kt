@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.hurd.b64.IntFast16T
import io.github.kotlinmania.libc.unix.hurd.b64.IntFast32T
import io.github.kotlinmania.libc.unix.hurd.b64.UintFast16T
import io.github.kotlinmania.libc.unix.hurd.b64.UintFast32T

// const
// aio.h
public val AIO_CANCELED: CInt = 0

public val AIO_NOTCANCELED: CInt = 1

public val AIO_ALLDONE: CInt = 2

public val LIO_READ: CInt = 0

public val LIO_WRITE: CInt = 1

public val LIO_NOP: CInt = 2

public val LIO_WAIT: CInt = 0

public val LIO_NOWAIT: CInt = 1

// glob.h
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

public val GLOB_PERIOD: CInt = 1 shl 7

public val GLOB_ALTDIRFUNC: CInt = 1 shl 9

public val GLOB_BRACE: CInt = 1 shl 10

public val GLOB_NOMAGIC: CInt = 1 shl 11

public val GLOB_TILDE: CInt = 1 shl 12

public val GLOB_ONLYDIR: CInt = 1 shl 13

public val GLOB_TILDE_CHECK: CInt = 1 shl 14

// ipc.h
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

// shm.h
public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_REMAP: CInt = 16384

public val SHM_LOCK: CInt = 11

public val SHM_UNLOCK: CInt = 12

// unistd.h
public val FD_SETSIZE1: Int = 256

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val F_OK: CInt = 0

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val SEEK_DATA: CInt = 3

public val SEEK_HOLE: CInt = 4

public val L_SET: CInt = 0

public val L_INCR: CInt = 1

public val L_XTND: CInt = 2

public val F_ULOCK: CInt = 0

public val F_LOCK: CInt = 1

public val F_TLOCK: CInt = 2

public val F_TEST: CInt = 3

public val CLOSE_RANGE_CLOEXEC: CInt = 4

// stdio.h
public val EOF: CInt = -1

// stdlib.h
public val WNOHANG: CInt = 1

public val WUNTRACED: CInt = 2

public val WSTOPPED: CInt = 2

public val WCONTINUED: CInt = 4

public val WNOWAIT: CInt = 8

public val WEXITED: CInt = 16

public val W_CONTINUED: CInt = 65535

public val WCOREFLAG1: CInt = 128

public val RAND_MAX: CInt = 2147483647

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val LITTLE_ENDIAN1: Int = 1234

public val BIG_ENDIAN1: Int = 4321

public val PDP_ENDIAN1: Int = 3412

public val BYTE_ORDER1: Int = 1234

public val FLOAT_WORD_ORDER: Int = 1234

public val LITTLE_ENDIAN: Int = 1234

public val BIG_ENDIAN: Int = 4321

public val PDP_ENDIAN: Int = 3412

public val BYTE_ORDER: Int = 1234

// sys/select.h
public val FD_SETSIZE: Int = 256

public val SIZEOF_PTHREAD_MUTEX_T: Int = 32

public val SIZEOF_PTHREAD_ATTR_T: Int = 32

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 28

public val SIZEOF_PTHREAD_BARRIER_T: Int = 24

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 16

public val SIZEOF_PTHREAD_COND_T: Int = 20

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 8

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 4

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val SIZEOF_PTHREAD_ONCE_T: Int = 8

public val PTHREAD_SPIN_LOCK_INITIALIZER: CInt = 0

public val PTHREAD_MUTEX_NORMAL: CInt = 0

// sys/resource.h
public val RLIM_INFINITY: RlimT = 2147483647uL

public val RLIM64_INFINITY: Rlim64T = 9223372036854775807uL

public val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY

public val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY

public val PRIO_MIN: CInt = -20

public val PRIO_MAX: CInt = 20

// pwd.h
public val NSS_BUFLEN_PASSWD: Int = 1024

// sys/socket.h
public val SOCK_TYPE_MASK: Int = 15

public val PF_UNSPEC: CInt = 0

public val PF_LOCAL: CInt = 1

public val PF_UNIX: CInt = 1

public val PF_FILE: CInt = 1

public val PF_INET: CInt = 2

public val PF_IMPLINK: CInt = 3

public val PF_PUP: CInt = 4

public val PF_CHAOS: CInt = 5

public val PF_NS: CInt = 6

public val PF_ISO: CInt = 7

public val PF_OSI: CInt = 7

public val PF_ECMA: CInt = 8

public val PF_DATAKIT: CInt = 9

public val PF_CCITT: CInt = 10

public val PF_SNA: CInt = 11

public val PF_DE_CNET: CInt = 12

public val PF_DLI: CInt = 13

public val PF_LAT: CInt = 14

public val PF_HYLINK: CInt = 15

public val PF_APPLETALK: CInt = 16

public val PF_ROUTE: CInt = 17

public val PF_XTP: CInt = 19

public val PF_COIP: CInt = 20

public val PF_CNT: CInt = 21

public val PF_RTIP: CInt = 22

public val PF_IPX: CInt = 23

public val PF_SIP: CInt = 24

public val PF_PIP: CInt = 25

public val PF_INET6: CInt = 26

public val PF_MAX: CInt = 27

public val AF_UNSPEC: CInt = 0

public val AF_LOCAL: CInt = 1

public val AF_UNIX: CInt = 1

public val AF_FILE: CInt = 1

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NS: CInt = 6

public val AF_ISO: CInt = 7

public val AF_OSI: CInt = 7

public val AF_ECMA: CInt = 8

public val AF_DATAKIT: CInt = 9

public val AF_CCITT: CInt = 10

public val AF_SNA: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_LAT: CInt = 14

public val AF_HYLINK: CInt = 15

public val AF_APPLETALK: CInt = 16

public val AF_ROUTE: CInt = 17

public val PSEUDO_AF_XTP: CInt = 19

public val AF_COIP: CInt = 20

public val AF_CNT: CInt = 21

public val PSEUDO_AF_RTIP: CInt = 22

public val AF_IPX: CInt = 23

public val AF_SIP: CInt = 24

public val PSEUDO_AF_PIP: CInt = 25

public val AF_INET6: CInt = 26

public val AF_MAX: CInt = 27

public val SOMAXCONN: CInt = 4096

public val SS_SIZE: Int = 128

public val CMGROUP_MAX: Int = 16

public val SOL_SOCKET: CInt = 65535

// sys/time.h
public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

// netinet/in.h
public val SOL_IP: CInt = 0

public val SOL_TCP: CInt = 6

public val SOL_UDP: CInt = 17

public val SOL_IPV6: CInt = 41

public val SOL_ICMPV6: CInt = 58

public val IP_OPTIONS: CInt = 1

public val IP_HDRINCL: CInt = 2

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_RECVOPTS: CInt = 5

public val IP_RECVRETOPTS: CInt = 6

public val IP_RECVDSTADDR: CInt = 7

public val IP_RETOPTS: CInt = 8

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IPV6_ADDRFORM: CInt = 1

public val IPV6_2292PKTINFO: CInt = 2

public val IPV6_2292HOPOPTS: CInt = 3

public val IPV6_2292DSTOPTS: CInt = 4

public val IPV6_2292RTHDR: CInt = 5

public val IPV6_2292PKTOPTIONS: CInt = 6

public val IPV6_CHECKSUM: CInt = 7

public val IPV6_2292HOPLIMIT: CInt = 8

public val IPV6_RXINFO: CInt = 2

public val IPV6_TXINFO: CInt = 2

public val SCM_SRCINFO: CInt = 2

public val IPV6_UNICAST_HOPS: CInt = 16

public val IPV6_MULTICAST_IF: CInt = 17

public val IPV6_MULTICAST_HOPS: CInt = 18

public val IPV6_MULTICAST_LOOP: CInt = 19

public val IPV6_JOIN_GROUP: CInt = 20

public val IPV6_LEAVE_GROUP: CInt = 21

public val IPV6_ROUTER_ALERT: CInt = 22

public val IPV6_MTU_DISCOVER: CInt = 23

public val IPV6_MTU: CInt = 24

public val IPV6_RECVERR: CInt = 25

public val IPV6_V6ONLY: CInt = 26

public val IPV6_JOIN_ANYCAST: CInt = 27

public val IPV6_LEAVE_ANYCAST: CInt = 28

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

public val IPV6_ADDR_PREFERENCES: CInt = 72

public val IPV6_MINHOPCOUNT: CInt = 73

public val IPV6_ADD_MEMBERSHIP: CInt = 20

public val IPV6_DROP_MEMBERSHIP: CInt = 21

public val IPV6_RXHOPOPTS: CInt = 3

public val IPV6_RXDSTOPTS: CInt = 4

public val IPV6_RTHDR_LOOSE: CInt = 0

public val IPV6_RTHDR_STRICT: CInt = 1

public val IPV6_RTHDR_TYPE_0: CInt = 0

public val IN_CLASSA_NET: UInt = 4278190080u

public val IN_CLASSA_NSHIFT: Int = 24

public val IN_CLASSA_HOST: UInt = 16777215u

public val IN_CLASSA_MAX: UInt = 128u

public val IN_CLASSB_NET: UInt = 4294901760u

public val IN_CLASSB_NSHIFT: Int = 16

public val IN_CLASSB_HOST: UInt = 65535u

public val IN_CLASSB_MAX: UInt = 65536u

public val IN_CLASSC_NET: UInt = 4294967040u

public val IN_CLASSC_NSHIFT: Int = 8

public val IN_CLASSC_HOST: UInt = 255u

public val IN_LOOPBACKNET: UInt = 127u

public val INET_ADDRSTRLEN: Int = 16

public val INET6_ADDRSTRLEN: Int = 46

// netinet/ip.h
public val IPTOS_TOS_MASK: UByte = 0x1Eu

public val IPTOS_PREC_MASK: UByte = 0xE0u

public val IPTOS_ECN_NOT_ECT: UByte = 0x00u

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

public val IPOPT_END: UByte = (0u.toUByte() or IPOPT_CONTROL).toUByte()

public val IPOPT_NOOP: UByte = (1u.toUByte() or IPOPT_CONTROL).toUByte()

public val IPOPT_SEC: UByte = (2u.toUByte() or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_LSRR: UByte = (3u.toUByte() or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_TIMESTAMP: UByte = (4u.toUByte() or IPOPT_MEASUREMENT).toUByte()

public val IPOPT_RR: UByte = (7u.toUByte() or IPOPT_CONTROL).toUByte()

public val IPOPT_SID: UByte = (8u.toUByte() or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_SSRR: UByte = (9u.toUByte() or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_RA: UByte = (20u.toUByte() or IPOPT_CONTROL or IPOPT_COPY).toUByte()

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

// net/ifArp.h
public val ARPOP_REQUEST: UShort = 1u

public val ARPOP_REPLY: UShort = 2u

public val ARPOP_RREQUEST: UShort = 3u

public val ARPOP_RREPLY: UShort = 4u

public val ARPOP_IN_REQUEST: UShort = 8u

public val ARPOP_IN_REPLY: UShort = 9u

public val ARPOP_NAK: UShort = 10u

public val MAX_ADDR_LEN: Int = 7

public val ARPD_UPDATE: CUshort = 0x01u

public val ARPD_LOOKUP: CUshort = 0x02u

public val ARPD_FLUSH: CUshort = 0x03u

public val ATF_MAGIC: CInt = 0x80

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

// bits/posix1Lim.h
public val POSIX_AIO_LISTIO_MAX: Int = 2

public val POSIX_AIO_MAX: Int = 1

public val POSIX_ARG_MAX: Int = 4096

public val POSIX_CHILD_MAX: Int = 25

public val POSIX_DELAYTIMER_MAX: Int = 32

public val POSIX_HOST_NAME_MAX: Int = 255

public val POSIX_LINK_MAX: Int = 8

public val POSIX_LOGIN_NAME_MAX: Int = 9

public val POSIX_MAX_CANON: Int = 255

public val POSIX_MAX_INPUT: Int = 255

public val POSIX_MQ_OPEN_MAX: Int = 8

public val POSIX_MQ_PRIO_MAX: Int = 32

public val POSIX_NAME_MAX: Int = 14

public val POSIX_NGROUPS_MAX: Int = 8

public val POSIX_OPEN_MAX: Int = 20

public val POSIX_FD_SETSIZE: Int = 20

public val POSIX_PATH_MAX: Int = 256

public val POSIX_PIPE_BUF: Int = 512

public val POSIX_RE_DUP_MAX: Int = 255

public val POSIX_RTSIG_MAX: Int = 8

public val POSIX_SEM_NSEMS_MAX: Int = 256

public val POSIX_SEM_VALUE_MAX: Int = 32767

public val POSIX_SIGQUEUE_MAX: Int = 32

public val POSIX_SSIZE_MAX: Int = 32767

public val POSIX_STREAM_MAX: Int = 8

public val POSIX_SYMLINK_MAX: Int = 255

public val POSIX_SYMLOOP_MAX: Int = 8

public val POSIX_TIMER_MAX: Int = 32

public val POSIX_TTY_NAME_MAX: Int = 9

public val POSIX_TZNAME_MAX: Int = 6

public val POSIX_QLIMIT: Int = 1

public val POSIX_HIWAT: Int = 512

public val POSIX_UIO_MAXIOV: Int = 16

public val POSIX_CLOCKRES_MIN: Int = 20000000

public val NAME_MAX: Int = 255

public val NGROUPS_MAX: Int = 256

public val POSIX_THREAD_KEYS_MAX: Int = 128

public val POSIX_THREAD_DESTRUCTOR_ITERATIONS: Int = 4

public val POSIX_THREAD_THREADS_MAX: Int = 64

public val SEM_VALUE_MAX: CInt = 2147483647

public val MAXNAMLEN: Int = 255

// netdb.h
public val PATH_HEQUIV: UByteArray = "/etc/hosts.equiv\u0000".encodeToByteArray().toUByteArray()

public val PATH_HOSTS: UByteArray = "/etc/hosts\u0000".encodeToByteArray().toUByteArray()

public val PATH_NETWORKS: UByteArray = "/etc/networks\u0000".encodeToByteArray().toUByteArray()

public val PATH_NSSWITCH_CONF: UByteArray = "/etc/nsswitch.conf\u0000".encodeToByteArray().toUByteArray()

public val PATH_PROTOCOLS: UByteArray = "/etc/protocols\u0000".encodeToByteArray().toUByteArray()

public val PATH_SERVICES: UByteArray = "/etc/services\u0000".encodeToByteArray().toUByteArray()

public val HOST_NOT_FOUND: CInt = 1

public val TRY_AGAIN: CInt = 2

public val NO_RECOVERY: CInt = 3

public val NO_DATA: CInt = 4

public val NETDB_INTERNAL: CInt = -1

public val NETDB_SUCCESS: CInt = 0

public val NO_ADDRESS: CInt = 4

public val IPPORT_RESERVED: CInt = 1024

public val SCOPE_DELIMITER: UByte = 37u.toUByte()

public val GAI_WAIT: CInt = 0

public val GAI_NOWAIT: CInt = 1

public val AI_PASSIVE: CInt = 1

public val AI_CANONNAME: CInt = 2

public val AI_NUMERICHOST: CInt = 4

public val AI_V4MAPPED: CInt = 8

public val AI_ALL: CInt = 16

public val AI_ADDRCONFIG: CInt = 32

public val AI_IDN: CInt = 64

public val AI_CANONIDN: CInt = 128

public val AI_NUMERICSERV: CInt = 1024

public val EAI_BADFLAGS: CInt = -1

public val EAI_NONAME: CInt = -2

public val EAI_AGAIN: CInt = -3

public val EAI_FAIL: CInt = -4

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_MEMORY: CInt = -10

public val EAI_SYSTEM: CInt = -11

public val EAI_OVERFLOW: CInt = -12

public val EAI_NODATA: CInt = -5

public val EAI_ADDRFAMILY: CInt = -9

public val EAI_INPROGRESS: CInt = -100

public val EAI_CANCELED: CInt = -101

public val EAI_NOTCANCELED: CInt = -102

public val EAI_ALLDONE: CInt = -103

public val EAI_INTR: CInt = -104

public val EAI_IDN_ENCODE: CInt = -105

public val NI_MAXHOST: Int = 1025

public val NI_MAXSERV: Int = 32

public val NI_NUMERICHOST: CInt = 1

public val NI_NUMERICSERV: CInt = 2

public val NI_NOFQDN: CInt = 4

public val NI_NAMEREQD: CInt = 8

public val NI_DGRAM: CInt = 16

public val NI_IDN: CInt = 32

// time.h
public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_MONOTONIC: ClockidT = 1

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 3

public val CLOCK_MONOTONIC_RAW: ClockidT = 4

public val CLOCK_REALTIME_COARSE: ClockidT = 5

public val CLOCK_MONOTONIC_COARSE: ClockidT = 6

public val TIMER_ABSTIME: CInt = 1

public val TIME_UTC: CInt = 1

// sys/poll.h
public val POLLIN: Short = 1

public val POLLPRI: Short = 2

public val POLLOUT: Short = 4

public val POLLRDNORM: Short = 1

public val POLLRDBAND: Short = 2

public val POLLWRNORM: Short = 4

public val POLLWRBAND: Short = 4

public val POLLERR: Short = 8

public val POLLHUP: Short = 16

public val POLLNVAL: Short = 32

// locale.h
public val LC_CTYPE1: Int = 0

public val LC_NUMERIC1: Int = 1

public val LC_TIME1: Int = 2

public val LC_COLLATE1: Int = 3

public val LC_MONETARY1: Int = 4

public val LC_MESSAGES1: Int = 5

public val LC_ALL1: Int = 6

public val LC_PAPER1: Int = 7

public val LC_NAME1: Int = 8

public val LC_ADDRESS1: Int = 9

public val LC_TELEPHONE1: Int = 10

public val LC_MEASUREMENT1: Int = 11

public val LC_IDENTIFICATION1: Int = 12

public val LC_CTYPE: CInt = 0

public val LC_NUMERIC: CInt = 1

public val LC_TIME: CInt = 2

public val LC_COLLATE: CInt = 3

public val LC_MONETARY: CInt = 4

public val LC_MESSAGES: CInt = 5

public val LC_ALL: CInt = 6

public val LC_PAPER: CInt = 7

public val LC_NAME: CInt = 8

public val LC_ADDRESS: CInt = 9

public val LC_TELEPHONE: CInt = 10

public val LC_MEASUREMENT: CInt = 11

public val LC_IDENTIFICATION: CInt = 12

public val LC_CTYPE_MASK: CInt = 1

public val LC_NUMERIC_MASK: CInt = 2

public val LC_TIME_MASK: CInt = 4

public val LC_COLLATE_MASK: CInt = 8

public val LC_MONETARY_MASK: CInt = 16

public val LC_MESSAGES_MASK: CInt = 32

public val LC_PAPER_MASK: CInt = 128

public val LC_NAME_MASK: CInt = 256

public val LC_ADDRESS_MASK: CInt = 512

public val LC_TELEPHONE_MASK: CInt = 1024

public val LC_MEASUREMENT_MASK: CInt = 2048

public val LC_IDENTIFICATION_MASK: CInt = 4096

public val LC_ALL_MASK: CInt = 8127

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

public val RADIXCHAR: NlItem = 0x10000

public val THOUSEP: NlItem = 0x10001

public val YESEXPR: NlItem = 0x50000

public val NOEXPR: NlItem = 0x50001

public val YESSTR: NlItem = 0x50002

public val NOSTR: NlItem = 0x50003

// reboot.h
public val RB_AUTOBOOT: CInt = 0x0

public val RB_ASKNAME: CInt = 0x1

public val RB_SINGLE: CInt = 0x2

public val RB_KBD: CInt = 0x4

public val RB_HALT: CInt = 0x8

public val RB_INITNAME: CInt = 0x10

public val RB_DFLTROOT: CInt = 0x20

public val RB_NOBOOTRC: CInt = 0x20

public val RB_ALTBOOT: CInt = 0x40

public val RB_UNIPROC: CInt = 0x80

public val RB_DEBUGGER: CInt = 0x1000

// semaphore.h
public val SIZEOF_SEM_T: Int = 20

public val SEM_FAILED: SemT? = null

// termios.h
public val IGNBRK: TcflagT = 1u

public val BRKINT: TcflagT = 2u

public val IGNPAR: TcflagT = 4u

public val PARMRK: TcflagT = 8u

public val INPCK: TcflagT = 16u

public val ISTRIP: TcflagT = 32u

public val INLCR: TcflagT = 64u

public val IGNCR: TcflagT = 128u

public val ICRNL: TcflagT = 256u

public val IXON: TcflagT = 512u

public val IXOFF: TcflagT = 1024u

public val IXANY: TcflagT = 2048u

public val IMAXBEL: TcflagT = 8192u

public val IUCLC: TcflagT = 16384u

public val OPOST: TcflagT = 1u

public val ONLCR: TcflagT = 2u

public val ONOEOT: TcflagT = 8u

public val OCRNL: TcflagT = 16u

public val ONOCR: TcflagT = 32u

public val ONLRET: TcflagT = 64u

public val NLDLY: TcflagT = 768u

public val NL0: TcflagT = 0u

public val NL1: TcflagT = 256u

public val TABDLY: TcflagT = 3076u

public val TAB0: TcflagT = 0u

public val TAB1: TcflagT = 1024u

public val TAB2: TcflagT = 2048u

public val TAB3: TcflagT = 4u

public val CRDLY: TcflagT = 12288u

public val CR0: TcflagT = 0u

public val CR1: TcflagT = 4096u

public val CR2: TcflagT = 8192u

public val CR3: TcflagT = 12288u

public val FFDLY: TcflagT = 16384u

public val FF0: TcflagT = 0u

public val FF1: TcflagT = 16384u

public val BSDLY: TcflagT = 32768u

public val BS0: TcflagT = 0u

public val BS1: TcflagT = 32768u

public val VTDLY: TcflagT = 65536u

public val VT0: TcflagT = 0u

public val VT1: TcflagT = 65536u

public val OLCUC: TcflagT = 131072u

public val OFILL: TcflagT = 262144u

public val OFDEL: TcflagT = 524288u

public val CIGNORE: TcflagT = 1u

public val CSIZE: TcflagT = 768u

public val CS5: TcflagT = 0u

public val CS6: TcflagT = 256u

public val CS7: TcflagT = 512u

public val CS8: TcflagT = 768u

public val CSTOPB: TcflagT = 1024u

public val CREAD: TcflagT = 2048u

public val PARENB: TcflagT = 4096u

public val PARODD: TcflagT = 8192u

public val HUPCL: TcflagT = 16384u

public val CLOCAL: TcflagT = 32768u

public val CRTSCTS: TcflagT = 65536u

public val CRTS_IFLOW: TcflagT = 65536u

public val CCTS_OFLOW: TcflagT = 65536u

public val CDTRCTS: TcflagT = 131072u

public val MDMBUF: TcflagT = 1048576u

public val CHWFLOW: TcflagT = 1245184u

public val ECHOKE: TcflagT = 1u

public val ECHOE1: TcflagT = 2u

public val ECHOE: TcflagT = 2u

public val ECHOK1: TcflagT = 4u

public val ECHOK: TcflagT = 4u

public val ECHO1: TcflagT = 8u

public val ECHO: TcflagT = 8u

public val ECHONL1: TcflagT = 16u

public val ECHONL: TcflagT = 16u

public val ECHOPRT: TcflagT = 32u

public val ECHOCTL: TcflagT = 64u

public val ISIG1: TcflagT = 128u

public val ISIG: TcflagT = 128u

public val ICANON1: TcflagT = 256u

public val ICANON: TcflagT = 256u

public val ALTWERASE: TcflagT = 512u

public val IEXTEN1: TcflagT = 1024u

public val IEXTEN: TcflagT = 1024u

public val EXTPROC: TcflagT = 2048u

public val TOSTOP1: TcflagT = 4194304u

public val TOSTOP: TcflagT = 4194304u

public val FLUSHO: TcflagT = 8388608u

public val NOKERNINFO: TcflagT = 33554432u

public val PENDIN: TcflagT = 536870912u

public val NOFLSH1: TcflagT = 2147483648u

public val NOFLSH: TcflagT = 2147483648u

public val VEOF: Int = 0

public val VEOL: Int = 1

public val VEOL2: Int = 2

public val VERASE: Int = 3

public val VWERASE: Int = 4

public val VKILL: Int = 5

public val VREPRINT: Int = 6

public val VINTR: Int = 8

public val VQUIT: Int = 9

public val VSUSP: Int = 10

public val VDSUSP: Int = 11

public val VSTART: Int = 12

public val VSTOP: Int = 13

public val VLNEXT: Int = 14

public val VDISCARD: Int = 15

public val VMIN: Int = 16

public val VTIME: Int = 17

public val VSTATUS: Int = 18

public val NCCS: Int = 20

public val B0: SpeedT = 0

public val B50: SpeedT = 50

public val B75: SpeedT = 75

public val B110: SpeedT = 110

public val B134: SpeedT = 134

public val B150: SpeedT = 150

public val B200: SpeedT = 200

public val B300: SpeedT = 300

public val B600: SpeedT = 600

public val B1200: SpeedT = 1200

public val B1800: SpeedT = 1800

public val B2400: SpeedT = 2400

public val B4800: SpeedT = 4800

public val B9600: SpeedT = 9600

public val B7200: SpeedT = 7200

public val B14400: SpeedT = 14400

public val B19200: SpeedT = 19200

public val B28800: SpeedT = 28800

public val B38400: SpeedT = 38400

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val B57600: SpeedT = 57600

public val B76800: SpeedT = 76800

public val B115200: SpeedT = 115200

public val B230400: SpeedT = 230400

public val B460800: SpeedT = 460800

public val B500000: SpeedT = 500000

public val B576000: SpeedT = 576000

public val B921600: SpeedT = 921600

public val B1000000: SpeedT = 1000000

public val B1152000: SpeedT = 1152000

public val B1500000: SpeedT = 1500000

public val B2000000: SpeedT = 2000000

public val B2500000: SpeedT = 2500000

public val B3000000: SpeedT = 3000000

public val B3500000: SpeedT = 3500000

public val B4000000: SpeedT = 4000000

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val TCSASOFT: CInt = 16

public val TCIFLUSH: CInt = 1

public val TCOFLUSH: CInt = 2

public val TCIOFLUSH: CInt = 3

public val TCOOFF: CInt = 1

public val TCOON: CInt = 2

public val TCIOFF: CInt = 3

public val TCION: CInt = 4

public val TTYDEF_IFLAG: TcflagT = 11042u

public val TTYDEF_LFLAG: TcflagT = 1483u

public val TTYDEF_CFLAG: TcflagT = 23040u

public val TTYDEF_SPEED: TcflagT = 9600u

public val CEOL: UByte = 0u.toUByte()

public val CERASE: UByte = 127u

public val CMIN: UByte = 1u

public val CQUIT: UByte = 28u

public val CTIME: UByte = 0u

public val CBRK: UByte = 0u.toUByte()

// dlfcn.h
public val RTLD_DEFAULT: COpaquePointer? = null

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1L).toLong())

public val RTLD_LAZY: CInt = 1

public val RTLD_NOW: CInt = 2

public val RTLD_BINDING_MASK: CInt = 3

public val RTLD_NOLOAD: CInt = 4

public val RTLD_DEEPBIND: CInt = 8

public val RTLD_GLOBAL: CInt = 256

public val RTLD_LOCAL: CInt = 0

public val RTLD_NODELETE: CInt = 4096

public val DLFO_STRUCT_HAS_EH_DBASE: Int = 1

public val DLFO_STRUCT_HAS_EH_COUNT: Int = 0

public val LM_ID_BASE: CLong = 0L

public val LM_ID_NEWLM: CLong = -1L

// bits/signumGeneric.h
public val SIGINT: CInt = 2

public val SIGILL: CInt = 4

public val SIGABRT: CInt = 6

public val SIGFPE: CInt = 8

public val SIGSEGV: CInt = 11

public val SIGTERM: CInt = 15

public val SIGHUP: CInt = 1

public val SIGQUIT: CInt = 3

public val SIGTRAP: CInt = 5

public val SIGKILL: CInt = 9

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGIOT: CInt = 6

public val SIGBUS: CInt = 10

public val SIGSYS: CInt = 12

public val SIGEMT: CInt = 7

public val SIGINFO: CInt = 29

public val SIGLOST: CInt = 32

public val SIGURG: CInt = 16

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGCONT: CInt = 19

public val SIGCHLD: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGPOLL: CInt = 23

public val SIGXCPU: CInt = 24

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGXFSZ: CInt = 25

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val SIGWINCH: CInt = 28

public val SIGIO: CInt = 23

public val SIGCLD: CInt = 20

public val SIGRTMIN: Int = 32

public val SIGRTMAX: Int = 32

public val NSIG1: Int = 33

public val NSIG: Int = 33

// bits/sigaction.h
public val SA_ONSTACK: CInt = 1

public val SA_RESTART: CInt = 2

public val SA_NODEFER: CInt = 16

public val SA_RESETHAND: CInt = 4

public val SA_NOCLDSTOP: CInt = 8

public val SA_SIGINFO: CInt = 64

public val SA_INTERRUPT: CInt = 0

public val SA_NOMASK: CInt = 16

public val SA_ONESHOT: CInt = 4

public val SA_STACK: CInt = 1

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 3

// bits/sigcontext.h
public val FPC_IE: UShort = 1u

public val FPC_IM: UShort = 1u

public val FPC_DE: UShort = 2u

public val FPC_DM: UShort = 2u

public val FPC_ZE: UShort = 4u

public val FPC_ZM: UShort = 4u

public val FPC_OE: UShort = 8u

public val FPC_OM: UShort = 8u

public val FPC_UE: UShort = 16u

public val FPC_PE: UShort = 32u

public val FPC_PC: UShort = 768u

public val FPC_PC_24: UShort = 0u

public val FPC_PC_53: UShort = 512u

public val FPC_PC_64: UShort = 768u

public val FPC_RC: UShort = 3072u

public val FPC_RC_RN: UShort = 0u

public val FPC_RC_RD: UShort = 1024u

public val FPC_RC_RU: UShort = 2048u

public val FPC_RC_CHOP: UShort = 3072u

public val FPC_IC: UShort = 4096u

public val FPC_IC_PROJ: UShort = 0u

public val FPC_IC_AFF: UShort = 4096u

public val FPS_IE: UShort = 1u

public val FPS_DE: UShort = 2u

public val FPS_ZE: UShort = 4u

public val FPS_OE: UShort = 8u

public val FPS_UE: UShort = 16u

public val FPS_PE: UShort = 32u

public val FPS_SF: UShort = 64u

public val FPS_ES: UShort = 128u

public val FPS_C0: UShort = 256u

public val FPS_C1: UShort = 512u

public val FPS_C2: UShort = 1024u

public val FPS_TOS: UShort = 14336u

public val FPS_TOS_SHIFT: UShort = 11u

public val FPS_C3: UShort = 16384u

public val FPS_BUSY: UShort = 32768u

public val FPE_INTOVF_TRAP: CInt = 1

public val FPE_INTDIV_FAULT: CInt = 2

public val FPE_FLTOVF_FAULT: CInt = 3

public val FPE_FLTDIV_FAULT: CInt = 4

public val FPE_FLTUND_FAULT: CInt = 5

public val FPE_SUBRNG_FAULT: CInt = 7

public val FPE_FLTDNR_FAULT: CInt = 8

public val FPE_FLTINX_FAULT: CInt = 9

public val FPE_EMERR_FAULT: CInt = 10

public val FPE_EMBND_FAULT: CInt = 11

public val ILL_INVOPR_FAULT: CInt = 1

public val ILL_STACK_FAULT: CInt = 2

public val ILL_FPEOPR_FAULT: CInt = 3

public val DBG_SINGLE_TRAP: CInt = 1

public val DBG_BRKPNT_FAULT: CInt = 2

public val NGREG1: Int = 19

public val NGREG: Int = 19

// bits/sigstack.h
public val MINSIGSTKSZ: Int = 8192

public val SIGSTKSZ: Int = 40960

// sys/stat.h
public val S_IFMT1: ModeT = 61440u

public val S_IFDIR1: ModeT = 16384u

public val S_IFCHR1: ModeT = 8192u

public val S_IFBLK1: ModeT = 24576u

public val S_IFREG1: ModeT = 32768u

public val S_IFLNK1: ModeT = 40960u

public val S_IFSOCK1: ModeT = 49152u

public val S_IFIFO1: ModeT = 4096u

public val S_ISUID1: ModeT = 2048u

public val S_ISGID1: ModeT = 1024u

public val S_ISVTX1: ModeT = 512u

public val S_IREAD1: ModeT = 256u

public val S_IWRITE1: ModeT = 128u

public val S_IEXEC1: ModeT = 64u

public val S_INOCACHE: ModeT = 65536u

public val S_IUSEUNK: ModeT = 131072u

public val S_IUNKNOWN: ModeT = 1835008u

public val S_IUNKSHIFT: ModeT = 12u

public val S_IPTRANS: ModeT = 2097152u

public val S_IATRANS: ModeT = 4194304u

public val S_IROOT: ModeT = 8388608u

public val S_ITRANS: ModeT = 14680064u

public val S_IMMAP0: ModeT = 16777216u

public val CMASK: ModeT = 18u

public val UF_SETTABLE: CUint = 65535u

public val UF_NODUMP: CUint = 1u

public val UF_IMMUTABLE: CUint = 2u

public val UF_APPEND: CUint = 4u

public val UF_OPAQUE: CUint = 8u

public val UF_NOUNLINK: CUint = 16u

public val SF_SETTABLE: CUint = 4294901760u

public val SF_ARCHIVED: CUint = 65536u

public val SF_IMMUTABLE: CUint = 131072u

public val SF_APPEND: CUint = 262144u

public val SF_NOUNLINK: CUint = 1048576u

public val SF_SNAPSHOT: CUint = 2097152u

public val UTIME_NOW: CLong = -1L

public val UTIME_OMIT: CLong = -2L

public val S_IFMT: ModeT = 61440u

public val S_IFDIR: ModeT = 16384u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFREG: ModeT = 32768u

public val S_IFIFO: ModeT = 4096u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_ISUID: ModeT = 2048u

public val S_ISGID: ModeT = 1024u

public val S_ISVTX: ModeT = 512u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRWXU: ModeT = 448u

public val S_IREAD: ModeT = 256u

public val S_IWRITE: ModeT = 128u

public val S_IEXEC: ModeT = 64u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IRWXG: ModeT = 56u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public val S_IRWXO: ModeT = 7u

public val ACCESSPERMS: ModeT = 511u

public val ALLPERMS: ModeT = 4095u

public val DEFFILEMODE: ModeT = 438u

public val S_BLKSIZE: Int = 512

public val STATX_TYPE: CUint = 1u

public val STATX_MODE: CUint = 2u

public val STATX_NLINK: CUint = 4u

public val STATX_UID: CUint = 8u

public val STATX_GID: CUint = 16u

public val STATX_ATIME: CUint = 32u

public val STATX_MTIME: CUint = 64u

public val STATX_CTIME: CUint = 128u

public val STATX_INO: CUint = 256u

public val STATX_SIZE: CUint = 512u

public val STATX_BLOCKS: CUint = 1024u

public val STATX_BASIC_STATS: CUint = 2047u

public val STATX_ALL: CUint = 4095u

public val STATX_BTIME: CUint = 2048u

public val STATX_MNT_ID: CUint = 4096u

public val STATX_DIOALIGN: CUint = 8192u

public val STATX__RESERVED: CUint = 2147483648u

public val STATX_ATTR_COMPRESSED: CUint = 4u

public val STATX_ATTR_IMMUTABLE: CUint = 16u

public val STATX_ATTR_APPEND: CUint = 32u

public val STATX_ATTR_NODUMP: CUint = 64u

public val STATX_ATTR_ENCRYPTED: CUint = 2048u

public val STATX_ATTR_AUTOMOUNT: CUint = 4096u

public val STATX_ATTR_MOUNT_ROOT: CUint = 8192u

public val STATX_ATTR_VERITY: CUint = 1048576u

public val STATX_ATTR_DAX: CUint = 2097152u

// sys/ioctl.h
public val TIOCM_LE: CInt = 1

public val TIOCM_DTR: CInt = 2

public val TIOCM_RTS: CInt = 4

public val TIOCM_ST: CInt = 8

public val TIOCM_SR: CInt = 16

public val TIOCM_CTS: CInt = 32

public val TIOCM_CAR: CInt = 64

public val TIOCM_CD: CInt = 64

public val TIOCM_RNG: CInt = 128

public val TIOCM_RI: CInt = 128

public val TIOCM_DSR: CInt = 256

public val TIOCPKT_DATA: CInt = 0

public val TIOCPKT_FLUSHREAD: CInt = 1

public val TIOCPKT_FLUSHWRITE: CInt = 2

public val TIOCPKT_STOP: CInt = 4

public val TIOCPKT_START: CInt = 8

public val TIOCPKT_NOSTOP: CInt = 16

public val TIOCPKT_DOSTOP: CInt = 32

public val TIOCPKT_IOCTL: CInt = 64

public val TTYDISC: CInt = 0

public val TABLDISC: CInt = 3

public val SLIPDISC: CInt = 4

public val TANDEM: TcflagT = 1u

public val CBREAK: TcflagT = 2u

public val LCASE: TcflagT = 4u

public val CRMOD: TcflagT = 16u

public val RAW: TcflagT = 32u

public val ODDP: TcflagT = 64u

public val EVENP: TcflagT = 128u

public val ANYP: TcflagT = 192u

public val NLDELAY: TcflagT = 768u

public val NL2: TcflagT = 512u

public val NL3: TcflagT = 768u

public val TBDELAY: TcflagT = 3072u

public val XTABS: TcflagT = 3072u

public val CRDELAY: TcflagT = 12288u

public val VTDELAY: TcflagT = 16384u

public val BSDELAY: TcflagT = 32768u

public val ALLDELAY: TcflagT = 65280u

public val CRTBS: TcflagT = 65536u

public val PRTERA: TcflagT = 131072u

public val CRTERA: TcflagT = 262144u

public val TILDE: TcflagT = 524288u

public val LITOUT: TcflagT = 2097152u

public val NOHANG: TcflagT = 16777216u

public val L001000: TcflagT = 33554432u

public val CRTKIL: TcflagT = 67108864u

public val PASS8: TcflagT = 134217728u

public val CTLECH: TcflagT = 268435456u

public val DECCTQ: TcflagT = 1073741824u

public val FIONBIO: CUlong = 0xa008007euL

public val FIONREAD: CUlong = 0x6008007fuL

public val TIOCSWINSZ: CUlong = 0x90200767uL

public val TIOCGWINSZ: CUlong = 0x50200768uL

public val TIOCEXCL: CUlong = 0x70duL

public val TIOCNXCL: CUlong = 0x70euL

public val TIOCSCTTY: CUlong = 0x761uL

public val FIOCLEX: CUlong = 1uL

// fcntl.h
public val O_EXEC: CInt = 4

public val O_NORW: CInt = 0

public val O_RDONLY: CInt = 1

public val O_WRONLY: CInt = 2

public val O_RDWR: CInt = 3

public val O_ACCMODE: CInt = 3

public val O_LARGEFILE: CInt = 0

public val O_CREAT: CInt = 16

public val O_EXCL: CInt = 32

public val O_NOLINK: CInt = 64

public val O_NOTRANS: CInt = 128

public val O_NOFOLLOW: CInt = 1048576

public val O_DIRECTORY: CInt = 2097152

public val O_APPEND: CInt = 256

public val O_ASYNC: CInt = 512

public val O_FSYNC: CInt = 1024

public val O_SYNC: CInt = 1024

public val O_NOATIME: CInt = 2048

public val O_SHLOCK: CInt = 131072

public val O_EXLOCK: CInt = 262144

public val O_DSYNC: CInt = 1024

public val O_RSYNC: CInt = 1024

public val O_NONBLOCK: CInt = 8

public val O_NDELAY: CInt = 8

public val O_HURD: CInt = 458751

public val O_TRUNC: CInt = 65536

public val O_CLOEXEC: CInt = 4194304

public val O_IGNORE_CTTY: CInt = 524288

public val O_TMPFILE: CInt = 8388608

public val O_NOCTTY: CInt = 0

public val FREAD: CInt = 1

public val FWRITE: CInt = 2

public val FASYNC: CInt = 512

public val FCREAT: CInt = 16

public val FEXCL: CInt = 32

public val FTRUNC: CInt = 65536

public val FNOCTTY: CInt = 0

public val FFSYNC: CInt = 1024

public val FSYNC: CInt = 1024

public val FAPPEND: CInt = 256

public val FNONBLOCK: CInt = 8

public val FNDELAY: CInt = 8

public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETOWN: CInt = 5

public val F_SETOWN: CInt = 6

public val F_GETLK: CInt = 7

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val F_GETLK64: CInt = 10

public val F_SETLK64: CInt = 11

public val F_SETLKW64: CInt = 12

public val F_DUPFD_CLOEXEC: CInt = 1030

public val FD_CLOEXEC: CInt = 1

public val F_RDLCK: CInt = 1

public val F_WRLCK: CInt = 2

public val F_UNLCK: CInt = 3

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_RANDOM: CInt = 1

public val POSIX_FADV_SEQUENTIAL: CInt = 2

public val POSIX_FADV_WILLNEED: CInt = 3

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val AT_FDCWD: CInt = -100

public val AT_SYMLINK_NOFOLLOW: CInt = 256

public val AT_REMOVEDIR: CInt = 512

public val AT_SYMLINK_FOLLOW: CInt = 1024

public val AT_NO_AUTOMOUNT: CInt = 2048

public val AT_EMPTY_PATH: CInt = 4096

public val AT_STATX_SYNC_TYPE: CInt = 24576

public val AT_STATX_SYNC_AS_STAT: CInt = 0

public val AT_STATX_FORCE_SYNC: CInt = 8192

public val AT_STATX_DONT_SYNC: CInt = 16384

public val AT_RECURSIVE: CInt = 32768

public val AT_EACCESS: CInt = 512

// sys/uio.h
public val RWF_HIPRI: CInt = 1

public val RWF_DSYNC: CInt = 2

public val RWF_SYNC: CInt = 4

public val RWF_NOWAIT: CInt = 8

public val RWF_APPEND: CInt = 16

// errno.h
public val EPERM: CInt = 1073741825

public val ENOENT: CInt = 1073741826

public val ESRCH: CInt = 1073741827

public val EINTR: CInt = 1073741828

public val EIO: CInt = 1073741829

public val ENXIO: CInt = 1073741830

public val E2BIG: CInt = 1073741831

public val ENOEXEC: CInt = 1073741832

public val EBADF: CInt = 1073741833

public val ECHILD: CInt = 1073741834

public val EDEADLK: CInt = 1073741835

public val ENOMEM: CInt = 1073741836

public val EACCES: CInt = 1073741837

public val EFAULT: CInt = 1073741838

public val ENOTBLK: CInt = 1073741839

public val EBUSY: CInt = 1073741840

public val EEXIST: CInt = 1073741841

public val EXDEV: CInt = 1073741842

public val ENODEV: CInt = 1073741843

public val ENOTDIR: CInt = 1073741844

public val EISDIR: CInt = 1073741845

public val EINVAL: CInt = 1073741846

public val EMFILE: CInt = 1073741848

public val ENFILE: CInt = 1073741847

public val ENOTTY: CInt = 1073741849

public val ETXTBSY: CInt = 1073741850

public val EFBIG: CInt = 1073741851

public val ENOSPC: CInt = 1073741852

public val ESPIPE: CInt = 1073741853

public val EROFS: CInt = 1073741854

public val EMLINK: CInt = 1073741855

public val EPIPE: CInt = 1073741856

public val EDOM: CInt = 1073741857

public val ERANGE: CInt = 1073741858

public val EAGAIN: CInt = 1073741859

public val EWOULDBLOCK: CInt = 1073741859

public val EINPROGRESS: CInt = 1073741860

public val EALREADY: CInt = 1073741861

public val ENOTSOCK: CInt = 1073741862

public val EMSGSIZE: CInt = 1073741864

public val EPROTOTYPE: CInt = 1073741865

public val ENOPROTOOPT: CInt = 1073741866

public val EPROTONOSUPPORT: CInt = 1073741867

public val ESOCKTNOSUPPORT: CInt = 1073741868

public val EOPNOTSUPP: CInt = 1073741869

public val EPFNOSUPPORT: CInt = 1073741870

public val EAFNOSUPPORT: CInt = 1073741871

public val EADDRINUSE: CInt = 1073741872

public val EADDRNOTAVAIL: CInt = 1073741873

public val ENETDOWN: CInt = 1073741874

public val ENETUNREACH: CInt = 1073741875

public val ENETRESET: CInt = 1073741876

public val ECONNABORTED: CInt = 1073741877

public val ECONNRESET: CInt = 1073741878

public val ENOBUFS: CInt = 1073741879

public val EISCONN: CInt = 1073741880

public val ENOTCONN: CInt = 1073741881

public val EDESTADDRREQ: CInt = 1073741863

public val ESHUTDOWN: CInt = 1073741882

public val ETOOMANYREFS: CInt = 1073741883

public val ETIMEDOUT: CInt = 1073741884

public val ECONNREFUSED: CInt = 1073741885

public val ELOOP: CInt = 1073741886

public val ENAMETOOLONG: CInt = 1073741887

public val EHOSTDOWN: CInt = 1073741888

public val EHOSTUNREACH: CInt = 1073741889

public val ENOTEMPTY: CInt = 1073741890

public val EPROCLIM: CInt = 1073741891

public val EUSERS: CInt = 1073741892

public val EDQUOT: CInt = 1073741893

public val ESTALE: CInt = 1073741894

public val EREMOTE: CInt = 1073741895

public val EBADRPC: CInt = 1073741896

public val ERPCMISMATCH: CInt = 1073741897

public val EPROGUNAVAIL: CInt = 1073741898

public val EPROGMISMATCH: CInt = 1073741899

public val EPROCUNAVAIL: CInt = 1073741900

public val ENOLCK: CInt = 1073741901

public val EFTYPE: CInt = 1073741903

public val EAUTH: CInt = 1073741904

public val ENEEDAUTH: CInt = 1073741905

public val ENOSYS: CInt = 1073741902

public val ELIBEXEC: CInt = 1073741907

public val ENOTSUP: CInt = 1073741942

public val EILSEQ: CInt = 1073741930

public val EBACKGROUND: CInt = 1073741924

public val EDIED: CInt = 1073741925

public val EGREGIOUS: CInt = 1073741927

public val EIEIO: CInt = 1073741928

public val EGRATUITOUS: CInt = 1073741929

public val EBADMSG: CInt = 1073741931

public val EIDRM: CInt = 1073741932

public val EMULTIHOP: CInt = 1073741933

public val ENODATA: CInt = 1073741934

public val ENOLINK: CInt = 1073741935

public val ENOMSG: CInt = 1073741936

public val ENOSR: CInt = 1073741937

public val ENOSTR: CInt = 1073741938

public val EOVERFLOW: CInt = 1073741939

public val EPROTO: CInt = 1073741940

public val ETIME: CInt = 1073741941

public val ECANCELED: CInt = 1073741943

public val EOWNERDEAD: CInt = 1073741944

public val ENOTRECOVERABLE: CInt = 1073741945

public val EMACH_SEND_IN_PROGRESS: CInt = 268435457

public val EMACH_SEND_INVALID_DATA: CInt = 268435458

public val EMACH_SEND_INVALID_DEST: CInt = 268435459

public val EMACH_SEND_TIMED_OUT: CInt = 268435460

public val EMACH_SEND_WILL_NOTIFY: CInt = 268435461

public val EMACH_SEND_NOTIFY_IN_PROGRESS: CInt = 268435462

public val EMACH_SEND_INTERRUPTED: CInt = 268435463

public val EMACH_SEND_MSG_TOO_SMALL: CInt = 268435464

public val EMACH_SEND_INVALID_REPLY: CInt = 268435465

public val EMACH_SEND_INVALID_RIGHT: CInt = 268435466

public val EMACH_SEND_INVALID_NOTIFY: CInt = 268435467

public val EMACH_SEND_INVALID_MEMORY: CInt = 268435468

public val EMACH_SEND_NO_BUFFER: CInt = 268435469

public val EMACH_SEND_NO_NOTIFY: CInt = 268435470

public val EMACH_SEND_INVALID_TYPE: CInt = 268435471

public val EMACH_SEND_INVALID_HEADER: CInt = 268435472

public val EMACH_RCV_IN_PROGRESS: CInt = 268451841

public val EMACH_RCV_INVALID_NAME: CInt = 268451842

public val EMACH_RCV_TIMED_OUT: CInt = 268451843

public val EMACH_RCV_TOO_LARGE: CInt = 268451844

public val EMACH_RCV_INTERRUPTED: CInt = 268451845

public val EMACH_RCV_PORT_CHANGED: CInt = 268451846

public val EMACH_RCV_INVALID_NOTIFY: CInt = 268451847

public val EMACH_RCV_INVALID_DATA: CInt = 268451848

public val EMACH_RCV_PORT_DIED: CInt = 268451849

public val EMACH_RCV_IN_SET: CInt = 268451850

public val EMACH_RCV_HEADER_ERROR: CInt = 268451851

public val EMACH_RCV_BODY_ERROR: CInt = 268451852

public val EKERN_INVALID_ADDRESS: CInt = 1

public val EKERN_PROTECTION_FAILURE: CInt = 2

public val EKERN_NO_SPACE: CInt = 3

public val EKERN_INVALID_ARGUMENT: CInt = 4

public val EKERN_FAILURE: CInt = 5

public val EKERN_RESOURCE_SHORTAGE: CInt = 6

public val EKERN_NOT_RECEIVER: CInt = 7

public val EKERN_NO_ACCESS: CInt = 8

public val EKERN_MEMORY_FAILURE: CInt = 9

public val EKERN_MEMORY_ERROR: CInt = 10

public val EKERN_NOT_IN_SET: CInt = 12

public val EKERN_NAME_EXISTS: CInt = 13

public val EKERN_ABORTED: CInt = 14

public val EKERN_INVALID_NAME: CInt = 15

public val EKERN_INVALID_TASK: CInt = 16

public val EKERN_INVALID_RIGHT: CInt = 17

public val EKERN_INVALID_VALUE: CInt = 18

public val EKERN_UREFS_OVERFLOW: CInt = 19

public val EKERN_INVALID_CAPABILITY: CInt = 20

public val EKERN_RIGHT_EXISTS: CInt = 21

public val EKERN_INVALID_HOST: CInt = 22

public val EKERN_MEMORY_PRESENT: CInt = 23

public val EKERN_WRITE_PROTECTION_FAILURE: CInt = 24

public val EKERN_TERMINATED: CInt = 26

public val EKERN_TIMEDOUT: CInt = 27

public val EKERN_INTERRUPTED: CInt = 28

public val EMIG_TYPE_ERROR: CInt = -300

public val EMIG_REPLY_MISMATCH: CInt = -301

public val EMIG_REMOTE_ERROR: CInt = -302

public val EMIG_BAD_ID: CInt = -303

public val EMIG_BAD_ARGUMENTS: CInt = -304

public val EMIG_NO_REPLY: CInt = -305

public val EMIG_EXCEPTION: CInt = -306

public val EMIG_ARRAY_TOO_LARGE: CInt = -307

public val EMIG_SERVER_DIED: CInt = -308

public val EMIG_DESTROY_REQUEST: CInt = -309

public val ED_IO_ERROR: CInt = 2500

public val ED_WOULD_BLOCK: CInt = 2501

public val ED_NO_SUCH_DEVICE: CInt = 2502

public val ED_ALREADY_OPEN: CInt = 2503

public val ED_DEVICE_DOWN: CInt = 2504

public val ED_INVALID_OPERATION: CInt = 2505

public val ED_INVALID_RECNUM: CInt = 2506

public val ED_INVALID_SIZE: CInt = 2507

public val ED_NO_MEMORY: CInt = 2508

public val ED_READ_ONLY: CInt = 2509

public val HURD_ERRNOS: Int = 122

// sched.h
public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val BITS_TYPES_STRUCT_SCHED_PARAM: Int = 1

public val CPU_SETSIZE1: Int = 1024

public val CPU_SETSIZE: Int = 1024

// pthread.h
public val PTHREAD_SPINLOCK_INITIALIZER: CInt = 0

public val PTHREAD_CANCEL_DISABLE: CInt = 0

public val PTHREAD_CANCEL_ENABLE: CInt = 1

public val PTHREAD_CANCEL_DEFERRED: CInt = 0

public val PTHREAD_CANCEL_ASYNCHRONOUS: CInt = 1

public val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1

// netinet/tcp.h
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

public val TCP_REPAIR_WINDOW: CInt = 29

public val TCP_FASTOPEN_CONNECT: CInt = 30

public val TCP_ULP: CInt = 31

public val TCP_MD5SIG_EXT: CInt = 32

public val TCP_FASTOPEN_KEY: CInt = 33

public val TCP_FASTOPEN_NO_COOKIE: CInt = 34

public val TCP_ZEROCOPY_RECEIVE: CInt = 35

public val TCP_INQ: CInt = 36

public val TCP_CM_INQ: CInt = 36

public val TCP_TX_DELAY: CInt = 37

public val TCP_REPAIR_ON: CInt = 1

public val TCP_REPAIR_OFF: CInt = 0

public val TCP_REPAIR_OFF_NO_WP: CInt = -1

// stdint.h
public val INT8_MIN: Byte = (-128).toByte()

public val INT16_MIN: Short = (-32768).toShort()

public val INT32_MIN: Int = -2147483648.toInt()

public val INT8_MAX: Byte = 127

public val INT16_MAX: Short = 32767

public val INT32_MAX: Int = 2147483647

public val UINT8_MAX: UByte = 255u

public val UINT16_MAX: UShort = 65535u

public val UINT32_MAX: UInt = 4294967295u

public val INT_LEAST8_MIN: IntLeast8T = (-128).toByte()

public val INT_LEAST16_MIN: IntLeast16T = (-32768).toShort()

public val INT_LEAST32_MIN: IntLeast32T = -2147483648.toInt()

public val INT_LEAST8_MAX: IntLeast8T = 127

public val INT_LEAST16_MAX: IntLeast16T = 32767

public val INT_LEAST32_MAX: IntLeast32T = 2147483647

public val UINT_LEAST8_MAX: UintLeast8T = 255u

public val UINT_LEAST16_MAX: UintLeast16T = 65535u

public val UINT_LEAST32_MAX: UintLeast32T = 4294967295u

public val INT_FAST8_MIN: IntFast8T = (-128).toByte()

public val INT_FAST16_MIN: IntFast16T = -2147483648L

public val INT_FAST32_MIN: IntFast32T = -2147483648L

public val INT_FAST8_MAX: IntFast8T = 127

public val INT_FAST16_MAX: IntFast16T = 2147483647L

public val INT_FAST32_MAX: IntFast32T = 2147483647L

public val UINT_FAST8_MAX: UintFast8T = 255u

public val UINT_FAST16_MAX: UintFast16T = 4294967295uL

public val UINT_FAST32_MAX: UintFast32T = 4294967295uL

public val INTPTR_MIN: IntptrT = -2147483648L

public val INTPTR_MAX: IntptrT = 2147483647L

public val UINTPTR_MAX: Int = 4294967295.toInt()

public val PTRDIFF_MIN: PtrdiffT = -2147483648L

public val PTRDIFF_MAX: PtrdiffT = 2147483647L

public val SIG_ATOMIC_MIN: SigAtomicT = -2147483648.toInt()

public val SIG_ATOMIC_MAX: SigAtomicT = 2147483647

public val SIZE_MAX: Int = 4294967295.toInt()

public val WINT_MIN: WintT = 0u

public val WINT_MAX: WintT = 4294967295u

public val INT8_WIDTH: Int = 8

public val UINT8_WIDTH: Int = 8

public val INT16_WIDTH: Int = 16

public val UINT16_WIDTH: Int = 16

public val INT32_WIDTH: Int = 32

public val UINT32_WIDTH: Int = 32

public val INT64_WIDTH: Int = 64

public val UINT64_WIDTH: Int = 64

public val INT_LEAST8_WIDTH: Int = 8

public val UINT_LEAST8_WIDTH: Int = 8

public val INT_LEAST16_WIDTH: Int = 16

public val UINT_LEAST16_WIDTH: Int = 16

public val INT_LEAST32_WIDTH: Int = 32

public val UINT_LEAST32_WIDTH: Int = 32

public val INT_LEAST64_WIDTH: Int = 64

public val UINT_LEAST64_WIDTH: Int = 64

public val INT_FAST8_WIDTH: Int = 8

public val UINT_FAST8_WIDTH: Int = 8

public val INT_FAST16_WIDTH: Int = 32

public val UINT_FAST16_WIDTH: Int = 32

public val INT_FAST32_WIDTH: Int = 32

public val UINT_FAST32_WIDTH: Int = 32

public val INT_FAST64_WIDTH: Int = 64

public val UINT_FAST64_WIDTH: Int = 64

public val INTPTR_WIDTH: Int = 32

public val UINTPTR_WIDTH: Int = 32

public val INTMAX_WIDTH: Int = 64

public val UINTMAX_WIDTH: Int = 64

public val PTRDIFF_WIDTH: Int = 32

public val SIG_ATOMIC_WIDTH: Int = 32

public val SIZE_WIDTH: Int = 32

public val WCHAR_WIDTH: Int = 32

public val WINT_WIDTH: Int = 32

public val TH_FIN: UByte = 1u

public val TH_SYN: UByte = 2u

public val TH_RST: UByte = 4u

public val TH_PUSH: UByte = 8u

public val TH_ACK: UByte = 16u

public val TH_URG: UByte = 32u

public val TCPOPT_EOL: UByte = 0u

public val TCPOPT_NOP: UByte = 1u

public val TCPOPT_MAXSEG: UByte = 2u

public val TCPOLEN_MAXSEG: UByte = 4u

public val TCPOPT_WINDOW: UByte = 3u

public val TCPOLEN_WINDOW: UByte = 3u

public val TCPOPT_SACK_PERMITTED: UByte = 4u

public val TCPOLEN_SACK_PERMITTED: UByte = 2u

public val TCPOPT_SACK: UByte = 5u

public val TCPOPT_TIMESTAMP: UByte = 8u

public val TCPOLEN_TIMESTAMP: UByte = 10u

public val TCPOLEN_TSTAMP_APPA: UByte = 12u

public val TCPOPT_TSTAMP_HDR: UInt = 16844810u

public val TCP_MSS: Int = 512

public val TCP_MAXWIN: Int = 65535

public val TCP_MAX_WINSHIFT: Int = 14

public val TCPI_OPT_TIMESTAMPS: UByte = 1u

public val TCPI_OPT_SACK: UByte = 2u

public val TCPI_OPT_WSCALE: UByte = 4u

public val TCPI_OPT_ECN: UByte = 8u

public val TCPI_OPT_ECN_SEEN: UByte = 16u

public val TCPI_OPT_SYN_DATA: UByte = 32u

public val TCP_MD5SIG_MAXKEYLEN: Int = 80

public val TCP_MD5SIG_FLAG_PREFIX: Int = 1

public val TCP_COOKIE_MIN: Int = 8

public val TCP_COOKIE_MAX: Int = 16

public val TCP_COOKIE_PAIR_SIZE: Int = 32

public val TCP_COOKIE_IN_ALWAYS: CInt = 1

public val TCP_COOKIE_OUT_NEVER: CInt = 2

public val TCP_S_DATA_IN: CInt = 4

public val TCP_S_DATA_OUT: CInt = 8

public val TCP_MSS_DEFAULT: Int = 536

public val TCP_MSS_DESIRED: Int = 1220

// sys/wait.h
public val WCOREFLAG: CInt = 128

public val WAIT_ANY: PidT = -1

public val WAIT_MYPGRP: PidT = 0

// sys/file.h
public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_UN: CInt = 8

public val LOCK_NB: CInt = 4

// sys/mman.h
public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 4

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 1

public val MAP_FILE: CInt = 1

public val MAP_ANON: CInt = 2

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val MAP_TYPE: CInt = 15

public val MAP_COPY: CInt = 32

public val MAP_SHARED: CInt = 16

public val MAP_PRIVATE: CInt = 0

public val MAP_FIXED: CInt = 256

public val MAP_NOEXTEND: CInt = 512

public val MAP_HASSEMAPHORE: CInt = 1024

public val MAP_INHERIT: CInt = 2048

public val MAP_32BIT: CInt = 4096

public val MAP_EXCL: CInt = 16384

public val MAP_FAILED: COpaquePointer? = ((0.inv() as Any?) as COpaquePointer?)

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_WONTNEED: CInt = 4

public val MS_ASYNC: CInt = 1

public val MS_SYNC: CInt = 0

public val MS_INVALIDATE: CInt = 2

public val MREMAP_MAYMOVE: CInt = 1

public val MREMAP_FIXED: CInt = 2

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002
