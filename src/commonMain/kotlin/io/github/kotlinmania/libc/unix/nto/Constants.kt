package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public val _SYSNAME_SIZE: ULong = 256uL + 1uL

public const val RLIM_INFINITY: ULong = 0xfffffffffffffffduL

public const val O_LARGEFILE: Int = 32768

public const val EXIT_FAILURE: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val RAND_MAX: Int = 32767

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

public const val F_DUPFD_CLOEXEC: Int = 5

public const val SIGTRAP: Int = 5

public const val CLOCK_REALTIME: Int = 0

public const val CLOCK_MONOTONIC: Int = 2

public const val CLOCK_PROCESS_CPUTIME_ID: Int = 3

public const val CLOCK_THREAD_CPUTIME_ID: Int = 4

public const val TIMER_ABSTIME: UInt = 0x80000000u

public const val RUSAGE_SELF: Int = 0

public const val F_OK: Int = 0

public const val X_OK: Int = 1

public const val W_OK: Int = 2

public const val R_OK: Int = 4

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

public const val PROT_NONE: Int = 0x00000000

public const val PROT_READ: Int = 0x00000100

public const val PROT_WRITE: Int = 0x00000200

public const val PROT_EXEC: Int = 0x00000400

public const val MAP_FILE: Int = 0

public const val MAP_SHARED: Int = 1

public const val MAP_PRIVATE: Int = 2

public const val MAP_FIXED: Int = 0x10

public const val MS_ASYNC: Int = 1

public const val MS_INVALIDATE: Int = 4

public const val MS_SYNC: Int = 2

public const val SCM_RIGHTS: Int = 0x01

public const val SCM_TIMESTAMP: Int = 0x02

public const val SCM_CREDS: Int = 0x04

public const val IFF_NOTRAILERS: Int = 0x00000020

public const val AF_INET6: Int = 24

public const val AF_BLUETOOTH: Int = 31

public const val pseudo_AF_KEY: Int = 29

public const val MSG_NOSIGNAL: Int = 0x0800

public const val MSG_WAITFORONE: Int = 0x2000

public const val IP_IPSEC_POLICY_COMPAT: Int = 22

public const val IP_PKTINFO: Int = 25

public const val IPPROTO_DIVERT: Int = 259

public const val IPV6_IPSEC_POLICY_COMPAT: Int = 28

public const val TCP_KEEPALIVE: Int = 0x04

public val ARPHRD_ARCNET: UShort = (7).toUShort()

public const val SO_BINDTODEVICE: Int = 0x0800

public const val EAI_NODATA: Int = 7

public val IPTOS_ECN_NOT_ECT: UByte = (0x00).toUByte()

public const val RTF_BROADCAST: UInt = 0x80000u

public const val UDP_ENCAP: Int = 100

public const val HW_IOSTATS: Int = 9

public const val HW_MACHINE_ARCH: Int = 10

public const val HW_ALIGNBYTES: Int = 11

public const val HW_CNMAGIC: Int = 12

public const val HW_PHYSMEM64: Int = 13

public const val HW_USERMEM64: Int = 14

public const val HW_IOSTATNAMES: Int = 15

public const val HW_MAXID: Int = 15

public const val CTL_UNSPEC: Int = 0

public const val CTL_QNX: Int = 9

public const val CTL_PROC: Int = 10

public const val CTL_VENDOR: Int = 11

public const val CTL_EMUL: Int = 12

public const val CTL_SECURITY: Int = 13

public const val CTL_MAXID: Int = 14

public const val AF_ARP: Int = 28

public const val AF_IEEE80211: Int = 32

public const val AF_NATM: Int = 27

public const val AF_NS: Int = 6

public const val BIOCGDLTLIST: Int = -1072676233

public const val BIOCGETIF: Int = 1083196011

public const val BIOCGSEESENT: Int = 1074020984

public const val BIOCGSTATS: Int = 1082147439

public const val BIOCSDLT: Int = -2147204490

public const val BIOCSETIF: Int = -2138029460

public const val BIOCSSEESENT: Int = -2147204487

public const val FIONSPACE: Int = 1074030200

public const val FIONWRITE: Int = 1074030201

public const val IFF_ACCEPTRTADV: Int = 0x40000000

public const val IFF_IP6FORWARDING: Int = 0x20000000

public const val IFF_SHIM: Int = 0x80000000.toInt()

public const val KERN_ARND: Int = 81

public const val KERN_IOV_MAX: Int = 38

public const val KERN_LOGSIGEXIT: Int = 46

public const val KERN_MAXID: Int = 83

public const val KERN_PROC_ARGS: Int = 48

public const val KERN_PROC_ENV: Int = 3

public const val KERN_PROC_GID: Int = 7

public const val KERN_PROC_RGID: Int = 8

public const val LOCAL_CONNWAIT: Int = 0x0002

public const val LOCAL_CREDS: Int = 0x0001

public const val LOCAL_PEEREID: Int = 0x0003

public const val MSG_NOTIFICATION: Int = 0x0400

public const val NET_RT_IFLIST: Int = 4

public const val NI_NUMERICSCOPE: Int = 0x00000040

public const val PF_ARP: Int = 28

public const val PF_NATM: Int = 27

public const val pseudo_AF_HDRCMPLT: Int = 30

public const val SIOCGIFADDR: Int = -1064277727

public const val SO_FIB: Int = 0x100a

public const val SO_TXPRIO: Int = 0x100b

public const val SO_SETFIB: Int = 0x100a

public const val SO_VLANPRIO: Int = 0x100c

public const val USER_ATEXIT_MAX: Int = 21

public const val USER_MAXID: Int = 22

public const val SO_OVERFLOWED: Int = 0x1009

public const val MAP_TYPE: Int = 0x3

public const val IFF_UP: Int = 0x00000001

public const val IFF_BROADCAST: Int = 0x00000002

public const val IFF_DEBUG: Int = 0x00000004

public const val IFF_LOOPBACK: Int = 0x00000008

public const val IFF_POINTOPOINT: Int = 0x00000010

public const val IFF_RUNNING: Int = 0x00000040

public const val IFF_NOARP: Int = 0x00000080

public const val IFF_PROMISC: Int = 0x00000100

public const val IFF_ALLMULTI: Int = 0x00000200

public const val IFF_MULTICAST: Int = 0x00008000

public const val AF_UNSPEC: Int = 0

public val AF_UNIX: Int = AF_LOCAL

public const val AF_LOCAL: Int = 1

public const val AF_INET: Int = 2

public const val AF_IPX: Int = 23

public const val AF_APPLETALK: Int = 16

public const val AF_ROUTE: Int = 17

public const val AF_SNA: Int = 11

public const val AF_ISDN: Int = 26

public const val PF_UNSPEC: Int = AF_UNSPEC

public val PF_UNIX: Int = PF_LOCAL

public const val PF_LOCAL: Int = AF_LOCAL

public const val PF_INET: Int = AF_INET

public const val PF_IPX: Int = AF_IPX

public const val PF_APPLETALK: Int = AF_APPLETALK

public const val PF_INET6: Int = AF_INET6

public const val PF_KEY: Int = pseudo_AF_KEY

public const val PF_ROUTE: Int = AF_ROUTE

public const val PF_SNA: Int = AF_SNA

public const val PF_BLUETOOTH: Int = AF_BLUETOOTH

public const val PF_ISDN: Int = AF_ISDN

public const val SOMAXCONN: Int = 128

public const val MSG_OOB: Int = 0x0001

public const val MSG_PEEK: Int = 0x0002

public const val MSG_DONTROUTE: Int = 0x0004

public const val MSG_CTRUNC: Int = 0x0020

public const val MSG_TRUNC: Int = 0x0010

public const val MSG_DONTWAIT: Int = 0x0080

public const val MSG_EOR: Int = 0x0008

public const val MSG_WAITALL: Int = 0x0040

public const val IP_TOS: Int = 3

public const val IP_TTL: Int = 4

public const val IP_HDRINCL: Int = 2

public const val IP_OPTIONS: Int = 1

public const val IP_RECVOPTS: Int = 5

public const val IP_RETOPTS: Int = 8

public const val IP_MULTICAST_IF: Int = 9

public const val IP_MULTICAST_TTL: Int = 10

public const val IP_MULTICAST_LOOP: Int = 11

public const val IP_ADD_MEMBERSHIP: Int = 12

public const val IP_DROP_MEMBERSHIP: Int = 13

public const val IP_DEFAULT_MULTICAST_TTL: Int = 1

public const val IP_DEFAULT_MULTICAST_LOOP: Int = 1

public const val IPPROTO_HOPOPTS: Int = 0

public const val IPPROTO_IGMP: Int = 2

public const val IPPROTO_IPIP: Int = 4

public const val IPPROTO_EGP: Int = 8

public const val IPPROTO_PUP: Int = 12

public const val IPPROTO_IDP: Int = 22

public const val IPPROTO_TP: Int = 29

public const val IPPROTO_ROUTING: Int = 43

public const val IPPROTO_FRAGMENT: Int = 44

public const val IPPROTO_RSVP: Int = 46

public const val IPPROTO_GRE: Int = 47

public const val IPPROTO_ESP: Int = 50

public const val IPPROTO_AH: Int = 51

public const val IPPROTO_NONE: Int = 59

public const val IPPROTO_DSTOPTS: Int = 60

public const val IPPROTO_ENCAP: Int = 98

public const val IPPROTO_PIM: Int = 103

public const val IPPROTO_SCTP: Int = 132

public const val IPPROTO_RAW: Int = 255

public const val IPPROTO_MAX: Int = 256

public const val IPPROTO_CARP: Int = 112

public const val IPPROTO_DONE: Int = 257

public const val IPPROTO_EON: Int = 80

public const val IPPROTO_ETHERIP: Int = 97

public const val IPPROTO_GGP: Int = 3

public const val IPPROTO_IPCOMP: Int = 108

public const val IPPROTO_MOBILE: Int = 55

public const val IPV6_RTHDR_LOOSE: Int = 0

public const val IPV6_RTHDR_STRICT: Int = 1

public const val IPV6_UNICAST_HOPS: Int = 4

public const val IPV6_MULTICAST_IF: Int = 9

public const val IPV6_MULTICAST_HOPS: Int = 10

public const val IPV6_MULTICAST_LOOP: Int = 11

public const val IPV6_JOIN_GROUP: Int = 12

public const val IPV6_LEAVE_GROUP: Int = 13

public const val IPV6_CHECKSUM: Int = 26

public const val IPV6_V6ONLY: Int = 27

public const val IPV6_RTHDRDSTOPTS: Int = 35

public const val IPV6_RECVPKTINFO: Int = 36

public const val IPV6_RECVHOPLIMIT: Int = 37

public const val IPV6_RECVRTHDR: Int = 38

public const val IPV6_RECVHOPOPTS: Int = 39

public const val IPV6_RECVDSTOPTS: Int = 40

public const val IPV6_RECVPATHMTU: Int = 43

public const val IPV6_PATHMTU: Int = 44

public const val IPV6_PKTINFO: Int = 46

public const val IPV6_HOPLIMIT: Int = 47

public const val IPV6_NEXTHOP: Int = 48

public const val IPV6_HOPOPTS: Int = 49

public const val IPV6_DSTOPTS: Int = 50

public const val IPV6_RECVTCLASS: Int = 57

public const val IPV6_TCLASS: Int = 61

public const val IPV6_DONTFRAG: Int = 62

public const val TCP_NODELAY: Int = 0x01

public const val TCP_MAXSEG: Int = 0x02

public const val TCP_MD5SIG: Int = 0x10

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val LOCK_SH: Int = 0x1

public const val LOCK_EX: Int = 0x2

public const val LOCK_NB: Int = 0x4

public const val LOCK_UN: Int = 0x8

public const val SS_ONSTACK: Int = 1

public const val SS_DISABLE: Int = 2

public const val PATH_MAX: Int = 1024

public const val UIO_MAXIOV: Int = 1024

public const val FD_SETSIZE: ULong = 256uL

public const val TCIOFF: Int = 0x0002

public const val TCION: Int = 0x0003

public const val TCOOFF: Int = 0x0000

public const val TCOON: Int = 0x0001

public const val TCIFLUSH: Int = 0

public const val TCOFLUSH: Int = 1

public const val TCIOFLUSH: Int = 2

public const val NL0: UInt = 0x000u

public const val NL1: UInt = 0x100u

public const val TAB0: UInt = 0x0000u

public const val CR0: UInt = 0x000u

public const val FF0: UInt = 0x0000u

public const val BS0: UInt = 0x0000u

public const val VT0: UInt = 0x0000u

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

public const val OPOST: UInt = 0x00000001u

public const val CS5: UInt = 0x00u

public const val ECHO: UInt = 0x00000008u

public const val OCRNL: UInt = 0x00000008u

public const val ONOCR: UInt = 0x00000010u

public const val ONLRET: UInt = 0x00000020u

public const val OFILL: UInt = 0x00000040u

public const val OFDEL: UInt = 0x00000080u

public const val WNOHANG: Int = 0x0040

public const val WUNTRACED: Int = 0x0004

public const val WSTOPPED: Int = WUNTRACED

public const val WEXITED: Int = 0x0001

public const val WCONTINUED: Int = 0x0008

public const val WNOWAIT: Int = 0x0080

public const val WTRAPPED: Int = 0x0002

public const val RTLD_LOCAL: Int = 0x0200

public const val RTLD_LAZY: Int = 0x0001

public const val POSIX_FADV_NORMAL: Int = 0

public const val POSIX_FADV_RANDOM: Int = 2

public const val POSIX_FADV_SEQUENTIAL: Int = 1

public const val POSIX_FADV_WILLNEED: Int = 3

public const val AT_FDCWD: Int = -100

public const val AT_EACCESS: Int = 0x0001

public const val AT_SYMLINK_NOFOLLOW: Int = 0x0002

public const val AT_SYMLINK_FOLLOW: Int = 0x0004

public const val AT_REMOVEDIR: Int = 0x0008

public val LOG_CRON: Int = 9 shl 3

public val LOG_AUTHPRIV: Int = 10 shl 3

public val LOG_FTP: Int = 11 shl 3

public const val LOG_PERROR: Int = 0x20

public const val PIPE_BUF: ULong = 5120uL

public const val CLD_EXITED: Int = 1

public const val CLD_KILLED: Int = 2

public const val CLD_DUMPED: Int = 3

public const val CLD_TRAPPED: Int = 4

public const val CLD_STOPPED: Int = 5

public const val CLD_CONTINUED: Int = 6

public const val UTIME_OMIT: Long = 0x40000002

public const val UTIME_NOW: Long = 0x40000001

public val POLLIN: Short = (POLLRDNORM.toInt() or POLLRDBAND.toInt()).toShort()

public const val POLLPRI: Short = 0x0008

public const val POLLOUT: Short = 0x0002

public const val POLLERR: Short = 0x0020

public const val POLLHUP: Short = 0x0040

public const val POLLNVAL: Short = 0x1000

public const val POLLRDNORM: Short = 0x0001

public const val POLLRDBAND: Short = 0x0004

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

public val IPOPT_CONTROL: UByte = (0x00).toUByte()

public val IPOPT_RESERVED1: UByte = (0x20).toUByte()

public val IPOPT_RESERVED2: UByte = (0x60).toUByte()

public val IPOPT_LSRR: UByte = (131).toUByte()

public val IPOPT_RR: UByte = (7).toUByte()

public val IPOPT_SSRR: UByte = (137).toUByte()

public val IPDEFTTL: UByte = (64).toUByte()

public val IPOPT_OPTVAL: UByte = (0).toUByte()

public val IPOPT_OLEN: UByte = (1).toUByte()

public val IPOPT_OFFSET: UByte = (2).toUByte()

public val IPOPT_MINOFF: UByte = (4).toUByte()

public val IPOPT_NOP: UByte = (1).toUByte()

public val IPOPT_EOL: UByte = (0).toUByte()

public val IPOPT_TS: UByte = (68).toUByte()

public val IPOPT_TS_TSONLY: UByte = (0).toUByte()

public val IPOPT_TS_TSANDADDR: UByte = (1).toUByte()

public val IPOPT_TS_PRESPEC: UByte = (3).toUByte()

public val MAX_IPOPTLEN: UByte = (40).toUByte()

public val IPVERSION: UByte = (4).toUByte()

public val MAXTTL: UByte = (255).toUByte()

public val ARPHRD_ETHER: UShort = (1).toUShort()

public val ARPHRD_IEEE802: UShort = (6).toUShort()

public val ARPHRD_IEEE1394: UShort = (24).toUShort()

public const val SOL_SOCKET: Int = 0xffff

public const val SO_DEBUG: Int = 0x0001

public const val SO_REUSEADDR: Int = 0x0004

public const val SO_TYPE: Int = 0x1008

public const val SO_ERROR: Int = 0x1007

public const val SO_DONTROUTE: Int = 0x0010

public const val SO_BROADCAST: Int = 0x0020

public const val SO_SNDBUF: Int = 0x1001

public const val SO_RCVBUF: Int = 0x1002

public const val SO_KEEPALIVE: Int = 0x0008

public const val SO_OOBINLINE: Int = 0x0100

public const val SO_LINGER: Int = 0x0080

public const val SO_REUSEPORT: Int = 0x0200

public const val SO_RCVLOWAT: Int = 0x1004

public const val SO_SNDLOWAT: Int = 0x1003

public const val SO_RCVTIMEO: Int = 0x1006

public const val SO_SNDTIMEO: Int = 0x1005

public const val SO_TIMESTAMP: Int = 0x0400

public const val SO_ACCEPTCONN: Int = 0x0002

public const val TIOCM_LE: Int = 0x0100

public const val TIOCM_DTR: Int = 0x0001

public const val TIOCM_RTS: Int = 0x0002

public const val TIOCM_ST: Int = 0x0200

public const val TIOCM_SR: Int = 0x0400

public const val TIOCM_CTS: Int = 0x1000

public val TIOCM_CAR: Int = TIOCM_CD

public const val TIOCM_CD: Int = 0x8000

public val TIOCM_RNG: Int = TIOCM_RI

public const val TIOCM_RI: Int = 0x4000

public const val TIOCM_DSR: Int = 0x2000

public const val SCHED_OTHER: Int = 3

public const val SCHED_FIFO: Int = 1

public const val SCHED_RR: Int = 2

public const val IPC_PRIVATE: UInt = 0u

public const val IPC_CREAT: Int = 512

public const val IPC_EXCL: Int = 1024

public const val IPC_NOWAIT: Int = 2048

public const val IPC_RMID: Int = 0

public const val IPC_SET: Int = 1

public const val IPC_STAT: Int = 2

public const val MSG_NOERROR: Int = 4096

public const val LOG_NFACILITIES: Int = 24

public const val AI_PASSIVE: Int = 0x00000001

public const val AI_CANONNAME: Int = 0x00000002

public const val AI_NUMERICHOST: Int = 0x00000004

public const val AI_NUMERICSERV: Int = 0x00000008

public const val EAI_BADFLAGS: Int = 3

public const val EAI_NONAME: Int = 8

public const val EAI_AGAIN: Int = 2

public const val EAI_FAIL: Int = 4

public const val EAI_FAMILY: Int = 5

public const val EAI_SOCKTYPE: Int = 10

public const val EAI_SERVICE: Int = 9

public const val EAI_MEMORY: Int = 6

public const val EAI_SYSTEM: Int = 11

public const val EAI_OVERFLOW: Int = 14

public const val NI_NUMERICHOST: Int = 0x00000002

public const val NI_NUMERICSERV: Int = 0x00000008

public const val NI_NOFQDN: Int = 0x00000001

public const val NI_NAMEREQD: Int = 0x00000004

public const val NI_DGRAM: Int = 0x00000010

public const val AIO_CANCELED: Int = 0

public const val AIO_NOTCANCELED: Int = 2

public const val AIO_ALLDONE: Int = 1

public const val LIO_READ: Int = 1

public const val LIO_WRITE: Int = 2

public const val LIO_NOP: Int = 0

public const val LIO_WAIT: Int = 1

public const val LIO_NOWAIT: Int = 0

public const val ITIMER_REAL: Int = 0

public const val ITIMER_VIRTUAL: Int = 1

public const val ITIMER_PROF: Int = 2

public const val POSIX_SPAWN_RESETIDS: Int = 0x00000010

public const val POSIX_SPAWN_SETPGROUP: Int = 0x00000001

public const val POSIX_SPAWN_SETSIGDEF: Int = 0x00000004

public const val POSIX_SPAWN_SETSIGMASK: Int = 0x00000002

public const val POSIX_SPAWN_SETSCHEDPARAM: Int = 0x00000400

public const val POSIX_SPAWN_SETSCHEDULER: Int = 0x00000040

public val RTF_UP: UShort = (0x0001).toUShort()

public val RTF_GATEWAY: UShort = (0x0002).toUShort()

public val RTF_HOST: UShort = (0x0004).toUShort()

public val RTF_DYNAMIC: UShort = (0x0010).toUShort()

public val RTF_MODIFIED: UShort = (0x0020).toUShort()

public val RTF_REJECT: UShort = (0x0008).toUShort()

public val RTF_STATIC: UShort = (0x0800).toUShort()

public val RTF_XRESOLVE: UShort = (0x0200).toUShort()

public val RTM_NEWADDR: UShort = (0xc).toUShort()

public val RTM_DELADDR: UShort = (0xd).toUShort()

public val RTA_DST: UShort = (0x1).toUShort()

public val RTA_GATEWAY: UShort = (0x2).toUShort()

public const val IN_ACCESS: UInt = 0x00000001u

public const val IN_MODIFY: UInt = 0x00000002u

public const val IN_ATTRIB: UInt = 0x00000004u

public const val IN_CLOSE_WRITE: UInt = 0x00000008u

public const val IN_CLOSE_NOWRITE: UInt = 0x00000010u

public val IN_CLOSE: UInt = IN_CLOSE_WRITE or IN_CLOSE_NOWRITE

public const val IN_OPEN: UInt = 0x00000020u

public const val IN_MOVED_FROM: UInt = 0x00000040u

public const val IN_MOVED_TO: UInt = 0x00000080u

public val IN_MOVE: UInt = IN_MOVED_FROM or IN_MOVED_TO

public const val IN_CREATE: UInt = 0x00000100u

public const val IN_DELETE: UInt = 0x00000200u

public const val IN_DELETE_SELF: UInt = 0x00000400u

public const val IN_MOVE_SELF: UInt = 0x00000800u

public const val IN_UNMOUNT: UInt = 0x00002000u

public const val IN_Q_OVERFLOW: UInt = 0x00004000u

public const val IN_IGNORED: UInt = 0x00008000u

public const val IN_ONLYDIR: UInt = 0x01000000u

public const val IN_DONT_FOLLOW: UInt = 0x02000000u

public const val IN_ISDIR: UInt = 0x40000000u

public const val IN_ONESHOT: UInt = 0x80000000u

public const val REG_EXTENDED: Int = 1

public const val REG_ICASE: Int = 2

public const val REG_NEWLINE: Int = 8

public const val REG_NOSUB: Int = 4

public const val REG_NOTBOL: Int = 1

public const val REG_NOTEOL: Int = 2

public const val REG_ENOSYS: Int = 17

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

public const val EOK: Int = 0

public val EWOULDBLOCK: Int = EAGAIN

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

public const val ENOLCK: Int = 46

public const val ECANCELED: Int = 47

public const val EDQUOT: Int = 49

public const val EBADE: Int = 50

public const val EBADR: Int = 51

public const val EXFULL: Int = 52

public const val ENOANO: Int = 53

public const val EBADRQC: Int = 54

public const val EBADSLT: Int = 55

public const val EDEADLOCK: Int = 56

public const val EBFONT: Int = 57

public const val EOWNERDEAD: Int = 58

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

public const val EMULTIHOP: Int = 74

public const val EBADMSG: Int = 77

public const val ENAMETOOLONG: Int = 78

public const val EOVERFLOW: Int = 79

public const val ENOTUNIQ: Int = 80

public const val EBADFD: Int = 81

public const val EREMCHG: Int = 82

public const val ELIBACC: Int = 83

public const val ELIBBAD: Int = 84

public const val ELIBSCN: Int = 85

public const val ELIBMAX: Int = 86

public const val ELIBEXEC: Int = 87

public const val EILSEQ: Int = 88

public const val ENOSYS: Int = 89

public const val ELOOP: Int = 90

public const val ERESTART: Int = 91

public const val ESTRPIPE: Int = 92

public const val ENOTEMPTY: Int = 93

public const val EUSERS: Int = 94

public const val ENOTRECOVERABLE: Int = 95

public const val EOPNOTSUPP: Int = 103

public const val EFPOS: Int = 110

public const val ESTALE: Int = 122

public const val EINPROGRESS: Int = 236

public const val EALREADY: Int = 237

public const val ENOTSOCK: Int = 238

public const val EDESTADDRREQ: Int = 239

public const val EMSGSIZE: Int = 240

public const val EPROTOTYPE: Int = 241

public const val ENOPROTOOPT: Int = 242

public const val EPROTONOSUPPORT: Int = 243

public const val ESOCKTNOSUPPORT: Int = 244

public const val EPFNOSUPPORT: Int = 246

public const val EAFNOSUPPORT: Int = 247

public const val EADDRINUSE: Int = 248

public const val EADDRNOTAVAIL: Int = 249

public const val ENETDOWN: Int = 250

public const val ENETUNREACH: Int = 251

public const val ENETRESET: Int = 252

public const val ECONNABORTED: Int = 253

public const val ECONNRESET: Int = 254

public const val ENOBUFS: Int = 255

public const val EISCONN: Int = 256

public const val ENOTCONN: Int = 257

public const val ESHUTDOWN: Int = 258

public const val ETOOMANYREFS: Int = 259

public const val ETIMEDOUT: Int = 260

public const val ECONNREFUSED: Int = 261

public const val EHOSTDOWN: Int = 264

public const val EHOSTUNREACH: Int = 265

public const val EBADRPC: Int = 272

public const val ERPCMISMATCH: Int = 273

public const val EPROGUNAVAIL: Int = 274

public const val EPROGMISMATCH: Int = 275

public const val EPROCUNAVAIL: Int = 276

public const val ENOREMOTE: Int = 300

public const val ENONDP: Int = 301

public const val EBADFSYS: Int = 302

public const val EMORE: Int = 309

public const val ECTRLTERM: Int = 310

public const val ENOLIC: Int = 311

public const val ESRVRFAULT: Int = 312

public const val EENDIAN: Int = 313

public const val ESECTYPEINVAL: Int = 314

public const val RUSAGE_CHILDREN: Int = -1

public const val L_tmpnam: UInt = 255u

public const val _PC_LINK_MAX: Int = 1

public const val _PC_MAX_CANON: Int = 2

public const val _PC_MAX_INPUT: Int = 3

public const val _PC_NAME_MAX: Int = 4

public const val _PC_PATH_MAX: Int = 5

public const val _PC_PIPE_BUF: Int = 6

public const val _PC_CHOWN_RESTRICTED: Int = 9

public const val _PC_NO_TRUNC: Int = 7

public const val _PC_VDISABLE: Int = 8

public const val _PC_SYNC_IO: Int = 14

public const val _PC_ASYNC_IO: Int = 12

public const val _PC_PRIO_IO: Int = 13

public const val _PC_SOCK_MAXBUF: Int = 15

public const val _PC_FILESIZEBITS: Int = 16

public const val _PC_REC_INCR_XFER_SIZE: Int = 22

public const val _PC_REC_MAX_XFER_SIZE: Int = 23

public const val _PC_REC_MIN_XFER_SIZE: Int = 24

public const val _PC_REC_XFER_ALIGN: Int = 25

public const val _PC_ALLOC_SIZE_MIN: Int = 21

public const val _PC_SYMLINK_MAX: Int = 17

public const val _PC_2_SYMLINKS: Int = 20

public val _SC_PAGE_SIZE: Int = _SC_PAGESIZE

public const val _SC_ARG_MAX: Int = 1

public const val _SC_CHILD_MAX: Int = 2

public const val _SC_CLK_TCK: Int = 3

public const val _SC_NGROUPS_MAX: Int = 4

public const val _SC_OPEN_MAX: Int = 5

public const val _SC_JOB_CONTROL: Int = 6

public const val _SC_SAVED_IDS: Int = 7

public const val _SC_VERSION: Int = 8

public const val _SC_PASS_MAX: Int = 9

public const val _SC_PAGESIZE: Int = 11

public const val _SC_XOPEN_VERSION: Int = 12

public const val _SC_STREAM_MAX: Int = 13

public const val _SC_TZNAME_MAX: Int = 14

public const val _SC_AIO_LISTIO_MAX: Int = 15

public const val _SC_AIO_MAX: Int = 16

public const val _SC_AIO_PRIO_DELTA_MAX: Int = 17

public const val _SC_DELAYTIMER_MAX: Int = 18

public const val _SC_MQ_OPEN_MAX: Int = 19

public const val _SC_MQ_PRIO_MAX: Int = 20

public const val _SC_RTSIG_MAX: Int = 21

public const val _SC_SEM_NSEMS_MAX: Int = 22

public const val _SC_SEM_VALUE_MAX: Int = 23

public const val _SC_SIGQUEUE_MAX: Int = 24

public const val _SC_TIMER_MAX: Int = 25

public const val _SC_ASYNCHRONOUS_IO: Int = 26

public const val _SC_FSYNC: Int = 27

public const val _SC_MAPPED_FILES: Int = 28

public const val _SC_MEMLOCK: Int = 29

public const val _SC_MEMLOCK_RANGE: Int = 30

public const val _SC_MEMORY_PROTECTION: Int = 31

public const val _SC_MESSAGE_PASSING: Int = 32

public const val _SC_PRIORITIZED_IO: Int = 33

public const val _SC_PRIORITY_SCHEDULING: Int = 34

public const val _SC_REALTIME_SIGNALS: Int = 35

public const val _SC_SEMAPHORES: Int = 36

public const val _SC_SHARED_MEMORY_OBJECTS: Int = 37

public const val _SC_SYNCHRONIZED_IO: Int = 38

public const val _SC_TIMERS: Int = 39

public const val _SC_GETGR_R_SIZE_MAX: Int = 40

public const val _SC_GETPW_R_SIZE_MAX: Int = 41

public const val _SC_LOGIN_NAME_MAX: Int = 42

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 43

public const val _SC_THREAD_KEYS_MAX: Int = 44

public const val _SC_THREAD_STACK_MIN: Int = 45

public const val _SC_THREAD_THREADS_MAX: Int = 46

public const val _SC_TTY_NAME_MAX: Int = 47

public const val _SC_THREADS: Int = 48

public const val _SC_THREAD_ATTR_STACKADDR: Int = 49

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 50

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 51

public const val _SC_THREAD_PRIO_INHERIT: Int = 52

public const val _SC_THREAD_PRIO_PROTECT: Int = 53

public const val _SC_THREAD_PROCESS_SHARED: Int = 54

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 55

public const val _SC_2_CHAR_TERM: Int = 56

public const val _SC_2_C_BIND: Int = 57

public const val _SC_2_C_DEV: Int = 58

public const val _SC_2_C_VERSION: Int = 59

public const val _SC_2_FORT_DEV: Int = 60

public const val _SC_2_FORT_RUN: Int = 61

public const val _SC_2_LOCALEDEF: Int = 62

public const val _SC_2_SW_DEV: Int = 63

public const val _SC_2_UPE: Int = 64

public const val _SC_2_VERSION: Int = 65

public const val _SC_ATEXIT_MAX: Int = 66

public const val _SC_AVPHYS_PAGES: Int = 67

public const val _SC_BC_BASE_MAX: Int = 68

public const val _SC_BC_DIM_MAX: Int = 69

public const val _SC_BC_SCALE_MAX: Int = 70

public const val _SC_BC_STRING_MAX: Int = 71

public const val _SC_CHARCLASS_NAME_MAX: Int = 72

public const val _SC_CHAR_BIT: Int = 73

public const val _SC_CHAR_MAX: Int = 74

public const val _SC_CHAR_MIN: Int = 75

public const val _SC_COLL_WEIGHTS_MAX: Int = 76

public const val _SC_EQUIV_CLASS_MAX: Int = 77

public const val _SC_EXPR_NEST_MAX: Int = 78

public const val _SC_INT_MAX: Int = 79

public const val _SC_INT_MIN: Int = 80

public const val _SC_LINE_MAX: Int = 81

public const val _SC_LONG_BIT: Int = 82

public const val _SC_MB_LEN_MAX: Int = 83

public const val _SC_NL_ARGMAX: Int = 84

public const val _SC_NL_LANGMAX: Int = 85

public const val _SC_NL_MSGMAX: Int = 86

public const val _SC_NL_NMAX: Int = 87

public const val _SC_NL_SETMAX: Int = 88

public const val _SC_NL_TEXTMAX: Int = 89

public const val _SC_NPROCESSORS_CONF: Int = 90

public const val _SC_NPROCESSORS_ONLN: Int = 91

public const val _SC_NZERO: Int = 92

public const val _SC_PHYS_PAGES: Int = 93

public const val _SC_PII: Int = 94

public const val _SC_PII_INTERNET: Int = 95

public const val _SC_PII_INTERNET_DGRAM: Int = 96

public const val _SC_PII_INTERNET_STREAM: Int = 97

public const val _SC_PII_OSI: Int = 98

public const val _SC_PII_OSI_CLTS: Int = 99

public const val _SC_PII_OSI_COTS: Int = 100

public const val _SC_PII_OSI_M: Int = 101

public const val _SC_PII_SOCKET: Int = 102

public const val _SC_PII_XTI: Int = 103

public const val _SC_POLL: Int = 104

public const val _SC_RE_DUP_MAX: Int = 105

public const val _SC_SCHAR_MAX: Int = 106

public const val _SC_SCHAR_MIN: Int = 107

public const val _SC_SELECT: Int = 108

public const val _SC_SHRT_MAX: Int = 109

public const val _SC_SHRT_MIN: Int = 110

public const val _SC_SSIZE_MAX: Int = 111

public const val _SC_T_IOV_MAX: Int = 112

public const val _SC_UCHAR_MAX: Int = 113

public const val _SC_UINT_MAX: Int = 114

public const val _SC_UIO_MAXIOV: Int = 115

public const val _SC_ULONG_MAX: Int = 116

public const val _SC_USHRT_MAX: Int = 117

public const val _SC_WORD_BIT: Int = 118

public const val _SC_XOPEN_CRYPT: Int = 119

public const val _SC_XOPEN_ENH_I18N: Int = 120

public const val _SC_XOPEN_SHM: Int = 121

public const val _SC_XOPEN_UNIX: Int = 122

public const val _SC_XOPEN_XCU_VERSION: Int = 123

public const val _SC_XOPEN_XPG2: Int = 124

public const val _SC_XOPEN_XPG3: Int = 125

public const val _SC_XOPEN_XPG4: Int = 126

public const val _SC_XBS5_ILP32_OFF32: Int = 127

public const val _SC_XBS5_ILP32_OFFBIG: Int = 128

public const val _SC_XBS5_LP64_OFF64: Int = 129

public const val _SC_XBS5_LPBIG_OFFBIG: Int = 130

public const val _SC_ADVISORY_INFO: Int = 131

public const val _SC_CPUTIME: Int = 132

public const val _SC_SPAWN: Int = 133

public const val _SC_SPORADIC_SERVER: Int = 134

public const val _SC_THREAD_CPUTIME: Int = 135

public const val _SC_THREAD_SPORADIC_SERVER: Int = 136

public const val _SC_TIMEOUTS: Int = 137

public const val _SC_BARRIERS: Int = 138

public const val _SC_CLOCK_SELECTION: Int = 139

public const val _SC_MONOTONIC_CLOCK: Int = 140

public const val _SC_READER_WRITER_LOCKS: Int = 141

public const val _SC_SPIN_LOCKS: Int = 142

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 143

public const val _SC_TRACE_EVENT_FILTER: Int = 144

public const val _SC_TRACE: Int = 145

public const val _SC_TRACE_INHERIT: Int = 146

public const val _SC_TRACE_LOG: Int = 147

public const val _SC_2_PBS: Int = 148

public const val _SC_2_PBS_ACCOUNTING: Int = 149

public const val _SC_2_PBS_CHECKPOINT: Int = 150

public const val _SC_2_PBS_LOCATE: Int = 151

public const val _SC_2_PBS_MESSAGE: Int = 152

public const val _SC_2_PBS_TRACK: Int = 153

public const val _SC_HOST_NAME_MAX: Int = 154

public const val _SC_IOV_MAX: Int = 155

public const val _SC_IPV6: Int = 156

public const val _SC_RAW_SOCKETS: Int = 157

public const val _SC_REGEXP: Int = 158

public const val _SC_SHELL: Int = 159

public const val _SC_SS_REPL_MAX: Int = 160

public const val _SC_SYMLOOP_MAX: Int = 161

public const val _SC_TRACE_EVENT_NAME_MAX: Int = 162

public const val _SC_TRACE_NAME_MAX: Int = 163

public const val _SC_TRACE_SYS_MAX: Int = 164

public const val _SC_TRACE_USER_EVENT_MAX: Int = 165

public const val _SC_V6_ILP32_OFF32: Int = 166

public const val _SC_V6_ILP32_OFFBIG: Int = 167

public const val _SC_V6_LP64_OFF64: Int = 168

public const val _SC_V6_LPBIG_OFFBIG: Int = 169

public const val _SC_XOPEN_REALTIME: Int = 170

public const val _SC_XOPEN_REALTIME_THREADS: Int = 171

public const val _SC_XOPEN_LEGACY: Int = 172

public const val _SC_XOPEN_STREAMS: Int = 173

public const val _SC_V7_ILP32_OFF32: Int = 176

public const val _SC_V7_ILP32_OFFBIG: Int = 177

public const val _SC_V7_LP64_OFF64: Int = 178

public const val _SC_V7_LPBIG_OFFBIG: Int = 179

public const val GLOB_ERR: Int = 0x0001

public const val GLOB_MARK: Int = 0x0002

public const val GLOB_NOSORT: Int = 0x0004

public const val GLOB_DOOFFS: Int = 0x0008

public const val GLOB_NOCHECK: Int = 0x0010

public const val GLOB_APPEND: Int = 0x0020

public const val GLOB_NOESCAPE: Int = 0x0040

public const val GLOB_NOSPACE: Int = 1

public const val GLOB_ABORTED: Int = 2

public const val GLOB_NOMATCH: Int = 3

public val S_IEXEC: UInt = S_IXUSR

public val S_IWRITE: UInt = S_IWUSR

public val S_IREAD: UInt = S_IRUSR

public const val S_IFIFO: UInt = 4096u

public const val S_IFCHR: UInt = 8192u

public const val S_IFDIR: UInt = 16384u

public const val S_IFBLK: UInt = 24576u

public const val S_IFREG: UInt = 32768u

public const val S_IFLNK: UInt = 40960u

public const val S_IFSOCK: UInt = 49152u

public const val S_IFMT: UInt = 61440u

public const val S_IXOTH: UInt = 1u

public const val S_IWOTH: UInt = 2u

public const val S_IROTH: UInt = 4u

public const val S_IRWXO: UInt = 7u

public const val S_IXGRP: UInt = 8u

public const val S_IWGRP: UInt = 16u

public const val S_IRGRP: UInt = 32u

public const val S_IRWXG: UInt = 56u

public const val S_IXUSR: UInt = 64u

public const val S_IWUSR: UInt = 128u

public const val S_IRUSR: UInt = 256u

public const val S_IRWXU: UInt = 448u

public const val F_LOCK: Int = 1

public const val F_TEST: Int = 3

public const val F_TLOCK: Int = 2

public const val F_ULOCK: Int = 0

public const val ST_RDONLY: ULong = 0x01uL

public const val ST_NOSUID: ULong = 0x04uL

public const val ST_NOEXEC: ULong = 0x02uL

public const val ST_NOATIME: ULong = 0x20uL

public const val RTLD_NODELETE: Int = 0x1000

public const val RTLD_NOW: Int = 0x0002

public const val EMPTY: Short = 0

public const val RUN_LVL: Short = 1

public const val BOOT_TIME: Short = 2

public const val NEW_TIME: Short = 4

public const val OLD_TIME: Short = 3

public const val INIT_PROCESS: Short = 5

public const val LOGIN_PROCESS: Short = 6

public const val USER_PROCESS: Short = 7

public const val DEAD_PROCESS: Short = 8

public const val ACCOUNTING: Short = 9

public const val ENOTSUP: Int = 48

public const val BUFSIZ: UInt = 1024u

public val TMP_MAX: UInt = 26u * 26u * 26u

public const val FOPEN_MAX: UInt = 16u

public const val FILENAME_MAX: UInt = 255u

public const val NI_MAXHOST: UInt = 1025u

public const val M_KEEP: Int = 4

public const val REG_STARTEND: Int = 4

public const val VEOF: ULong = 4uL

public const val RTLD_GLOBAL: Int = 0x0100

public const val RTLD_NOLOAD: Int = 0x0004

public const val O_RDONLY: Int = 0

public const val O_WRONLY: Int = 1

public const val O_RDWR: Int = 2

public const val O_EXEC: Int = 3

public const val O_ASYNC: Int = 65536

public val O_NDELAY: Int = O_NONBLOCK

public const val O_TRUNC: Int = 512

public const val O_CLOEXEC: Int = 8192

public const val O_DIRECTORY: Int = 1048576

public const val O_ACCMODE: Int = 7

public const val O_APPEND: Int = 8

public const val O_CREAT: Int = 256

public const val O_EXCL: Int = 1024

public const val O_NOCTTY: Int = 2048

public const val O_NONBLOCK: Int = 128

public const val O_SYNC: Int = 32

public const val O_RSYNC: Int = 64

public const val O_DSYNC: Int = 16

public const val O_NOFOLLOW: Int = 4096

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val SOCK_SEQPACKET: Int = 5

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_RAW: Int = 3

public const val SOCK_RDM: Int = 4

public const val SOCK_CLOEXEC: Int = 0x10000000

public const val SA_SIGINFO: Int = 0x0002

public const val SA_NOCLDWAIT: Int = 0x0020

public const val SA_NODEFER: Int = 0x0010

public const val SA_RESETHAND: Int = 0x0004

public const val SA_NOCLDSTOP: Int = 0x0001

public const val SIGTTIN: Int = 26

public const val SIGTTOU: Int = 27

public const val SIGXCPU: Int = 30

public const val SIGXFSZ: Int = 31

public const val SIGVTALRM: Int = 28

public const val SIGPROF: Int = 29

public const val SIGWINCH: Int = 20

public const val SIGCHLD: Int = 18

public const val SIGBUS: Int = 10

public const val SIGUSR1: Int = 16

public const val SIGUSR2: Int = 17

public const val SIGCONT: Int = 25

public const val SIGSTOP: Int = 23

public const val SIGTSTP: Int = 24

public const val SIGURG: Int = 21

public val SIGIO: Int = SIGPOLL

public const val SIGSYS: Int = 12

public const val SIGPOLL: Int = 22

public const val SIGPWR: Int = 19

public const val SIG_SETMASK: Int = 2

public const val SIG_BLOCK: Int = 0

public const val SIG_UNBLOCK: Int = 1

public const val POLLWRNORM: Short = POLLOUT

public const val POLLWRBAND: Short = 0x0010

public const val F_SETLK: Int = 106

public const val F_SETLKW: Int = 107

public const val F_ALLOCSP: Int = 110

public const val F_FREESP: Int = 111

public const val F_GETLK: Int = 114

public const val F_RDLCK: Int = 1

public const val F_WRLCK: Int = 2

public const val F_UNLCK: Int = 3

public const val NCCS: ULong = 40uL

public val MAP_ANON: Int = MAP_ANONYMOUS

public const val MAP_ANONYMOUS: Int = 0x00080000

public const val MCL_CURRENT: Int = 0x000000001

public const val MCL_FUTURE: Int = 0x000000002

public const val _TIO_CBAUD: UInt = 15u

public const val CBAUD: UInt = _TIO_CBAUD

public const val TAB1: UInt = 0x0800u

public const val TAB2: UInt = 0x1000u

public const val TAB3: UInt = 0x1800u

public const val CR1: UInt = 0x200u

public const val CR2: UInt = 0x400u

public const val CR3: UInt = 0x600u

public const val FF1: UInt = 0x8000u

public const val BS1: UInt = 0x2000u

public const val VT1: UInt = 0x4000u

public const val VWERASE: ULong = 14uL

public const val VREPRINT: ULong = 12uL

public const val VSUSP: ULong = 10uL

public const val VSTART: ULong = 8uL

public const val VSTOP: ULong = 9uL

public const val VDISCARD: ULong = 13uL

public const val VTIME: ULong = 17uL

public const val IXON: UInt = 0x00000400u

public const val IXOFF: UInt = 0x00001000u

public const val ONLCR: UInt = 0x00000004u

public const val CSIZE: UInt = 0x00000030u

public const val CS6: UInt = 0x10u

public const val CS7: UInt = 0x20u

public const val CS8: UInt = 0x30u

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

public const val ECHOCTL: UInt = 0x00000200u

public const val ISIG: UInt = 0x00000001u

public const val ICANON: UInt = 0x00000002u

public const val NOFLSH: UInt = 0x00000080u

public const val OLCUC: UInt = 0x00000002u

public const val NLDLY: UInt = 0x00000100u

public const val CRDLY: UInt = 0x00000600u

public const val TABDLY: UInt = 0x00001800u

public const val BSDLY: UInt = 0x00002000u

public const val FFDLY: UInt = 0x00008000u

public const val VTDLY: UInt = 0x00004000u

public const val XTABS: UInt = 0x1800u

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

public const val EXTA: UInt = 14u

public const val EXTB: UInt = 15u

public const val B57600: UInt = 57600u

public const val B115200: UInt = 115200u

public const val VEOL: ULong = 5uL

public const val VEOL2: ULong = 6uL

public const val VMIN: ULong = 16uL

public const val IEXTEN: UInt = 0x00008000u

public const val TOSTOP: UInt = 0x00000100u

public const val TCSANOW: Int = 0x0001

public const val TCSADRAIN: Int = 0x0002

public const val TCSAFLUSH: Int = 0x0004

public const val HW_MACHINE: Int = 1

public const val HW_MODEL: Int = 2

public const val HW_NCPU: Int = 3

public const val HW_BYTEORDER: Int = 4

public const val HW_PHYSMEM: Int = 5

public const val HW_USERMEM: Int = 6

public const val HW_PAGESIZE: Int = 7

public const val HW_DISKNAMES: Int = 8

public const val CTL_KERN: Int = 1

public const val CTL_VM: Int = 2

public const val CTL_VFS: Int = 3

public const val CTL_NET: Int = 4

public const val CTL_DEBUG: Int = 5

public const val CTL_HW: Int = 6

public const val CTL_MACHDEP: Int = 7

public const val CTL_USER: Int = 8

public const val DAY_1: Int = 8

public const val DAY_2: Int = 9

public const val DAY_3: Int = 10

public const val DAY_4: Int = 11

public const val DAY_5: Int = 12

public const val DAY_6: Int = 13

public const val DAY_7: Int = 14

public const val MON_1: Int = 22

public const val MON_2: Int = 23

public const val MON_3: Int = 24

public const val MON_4: Int = 25

public const val MON_5: Int = 26

public const val MON_6: Int = 27

public const val MON_7: Int = 28

public const val MON_8: Int = 29

public const val MON_9: Int = 30

public const val MON_10: Int = 31

public const val MON_11: Int = 32

public const val MON_12: Int = 33

public const val ABDAY_1: Int = 15

public const val ABDAY_2: Int = 16

public const val ABDAY_3: Int = 17

public const val ABDAY_4: Int = 18

public const val ABDAY_5: Int = 19

public const val ABDAY_6: Int = 20

public const val ABDAY_7: Int = 21

public const val ABMON_1: Int = 34

public const val ABMON_2: Int = 35

public const val ABMON_3: Int = 36

public const val ABMON_4: Int = 37

public const val ABMON_5: Int = 38

public const val ABMON_6: Int = 39

public const val ABMON_7: Int = 40

public const val ABMON_8: Int = 41

public const val ABMON_9: Int = 42

public const val ABMON_10: Int = 43

public const val ABMON_11: Int = 44

public const val ABMON_12: Int = 45

public const val AF_CCITT: Int = 10

public const val AF_CHAOS: Int = 5

public const val AF_CNT: Int = 21

public const val AF_COIP: Int = 20

public const val AF_DATAKIT: Int = 9

public const val AF_DECnet: Int = 12

public const val AF_DLI: Int = 13

public const val AF_E164: Int = 26

public const val AF_ECMA: Int = 8

public const val AF_HYLINK: Int = 15

public const val AF_IMPLINK: Int = 3

public const val AF_ISO: Int = 7

public const val AF_LAT: Int = 14

public const val AF_LINK: Int = 18

public const val AF_OSI: Int = 7

public const val AF_PUP: Int = 4

public const val ALT_DIGITS: Int = 50

public const val AM_STR: Int = 6

public const val B76800: UInt = 76800u

public const val BIOCFLUSH: Int = 17000

public const val BIOCGBLEN: Int = 1074020966

public const val BIOCGDLT: Int = 1074020970

public const val BIOCGHDRCMPLT: Int = 1074020980

public const val BIOCGRTIMEOUT: Int = 1074807406

public const val BIOCIMMEDIATE: Int = -2147204496

public const val BIOCPROMISC: Int = 17001

public const val BIOCSBLEN: Int = -1073462682

public const val BIOCSETF: Int = -2146418073

public const val BIOCSHDRCMPLT: Int = -2147204491

public const val BIOCSRTIMEOUT: Int = -2146418067

public const val BIOCVERSION: Int = 1074020977

// BPF_ALIGNMENT = size_of<CLong>() (computed at the FFI boundary)
public const val CHAR_BIT: ULong = 8uL

public const val CODESET: Int = 1

public const val CRNCYSTR: Int = 55

public const val D_FLAG_FILTER: Int = 0x00000001

public const val D_FLAG_STAT: Int = 0x00000002

public const val D_FLAG_STAT_FORM_MASK: Int = 0x000000f0

public const val D_FLAG_STAT_FORM_T32_2001: Int = 0x00000010

public const val D_FLAG_STAT_FORM_T32_2008: Int = 0x00000020

public const val D_FLAG_STAT_FORM_T64_2008: Int = 0x00000030

public const val D_FLAG_STAT_FORM_UNSET: Int = 0x00000000

public const val D_FMT: Int = 3

public const val D_GETFLAG: Int = 1

public const val D_SETFLAG: Int = 2

public const val D_T_FMT: Int = 2

public const val ERA: Int = 46

public const val ERA_D_FMT: Int = 47

public const val ERA_D_T_FMT: Int = 48

public const val ERA_T_FMT: Int = 49

public const val RADIXCHAR: Int = 51

public const val THOUSEP: Int = 52

public const val YESEXPR: Int = 53

public const val NOEXPR: Int = 54

public const val F_GETOWN: Int = 35

public const val FIONBIO: Int = -2147195266

public const val FIOASYNC: Int = -2147195267

public const val FIOCLEX: Int = 26113

public const val FIOGETOWN: Int = 1074030203

public const val FIONCLEX: Int = 26114

public const val FIONREAD: Int = 1074030207

public const val FIOSETOWN: Int = -2147195268

public const val F_SETOWN: Int = 36

public const val IFF_LINK0: Int = 0x00001000

public const val IFF_LINK1: Int = 0x00002000

public const val IFF_LINK2: Int = 0x00004000

public const val IFF_OACTIVE: Int = 0x00000400

public const val IFF_SIMPLEX: Int = 0x00000800

public const val IHFLOW: UInt = 0x00000001u

public const val IIDLE: UInt = 0x00000008u

public const val IP_RECVDSTADDR: Int = 7

public const val IP_RECVIF: Int = 20

public val IPTOS_ECN_NOTECT: UByte = (0x00).toUByte()

public const val IUCLC: UInt = 0x00000200u

public const val IUTF8: UInt = 0x0004000u

public const val KERN_ARGMAX: Int = 8

public const val KERN_BOOTTIME: Int = 21

public const val KERN_CLOCKRATE: Int = 12

public const val KERN_FILE: Int = 15

public const val KERN_HOSTID: Int = 11

public const val KERN_HOSTNAME: Int = 10

public const val KERN_JOB_CONTROL: Int = 19

public const val KERN_MAXFILES: Int = 7

public const val KERN_MAXPROC: Int = 6

public const val KERN_MAXVNODES: Int = 5

public const val KERN_NGROUPS: Int = 18

public const val KERN_OSRELEASE: Int = 2

public const val KERN_OSREV: Int = 3

public const val KERN_OSTYPE: Int = 1

public const val KERN_POSIX1: Int = 17

public const val KERN_PROC: Int = 14

public const val KERN_PROC_ALL: Int = 0

public const val KERN_PROC_PGRP: Int = 2

public const val KERN_PROC_PID: Int = 1

public const val KERN_PROC_RUID: Int = 6

public const val KERN_PROC_SESSION: Int = 3

public const val KERN_PROC_TTY: Int = 4

public const val KERN_PROC_UID: Int = 5

public const val KERN_PROF: Int = 16

public const val KERN_SAVED_IDS: Int = 20

public const val KERN_SECURELVL: Int = 9

public const val KERN_VERSION: Int = 4

public const val KERN_VNODE: Int = 13

public const val LC_ALL: Int = 63

public const val LC_COLLATE: Int = 1

public const val LC_CTYPE: Int = 2

public const val LC_MESSAGES: Int = 32

public const val LC_MONETARY: Int = 4

public const val LC_NUMERIC: Int = 8

public const val LC_TIME: Int = 16

public const val MAP_STACK: Int = 0x00001000

public const val MNT_NOEXEC: Int = 0x02

public const val MNT_NOSUID: Int = 0x04

public const val MNT_RDONLY: Int = 0x01

public const val NET_RT_DUMP: Int = 1

public const val NET_RT_FLAGS: Int = 2

public const val OHFLOW: UInt = 0x00000002u

public const val P_ALL: UInt = 0u

public const val PARSTK: UInt = 0x00000004u

public const val PF_CCITT: Int = 10

public const val PF_CHAOS: Int = 5

public const val PF_CNT: Int = 21

public const val PF_COIP: Int = 20

public const val PF_DATAKIT: Int = 9

public const val PF_DECnet: Int = 12

public const val PF_DLI: Int = 13

public const val PF_ECMA: Int = 8

public const val PF_HYLINK: Int = 15

public const val PF_IMPLINK: Int = 3

public const val PF_ISO: Int = 7

public const val PF_LAT: Int = 14

public const val PF_LINK: Int = 18

public const val PF_OSI: Int = 7

public const val PF_PIP: Int = 25

public const val PF_PUP: Int = 4

public const val PF_RTIP: Int = 22

public const val PF_XTP: Int = 19

public const val PM_STR: Int = 7

public const val POSIX_MADV_DONTNEED: Int = 4

public const val POSIX_MADV_NORMAL: Int = 0

public const val POSIX_MADV_RANDOM: Int = 2

public const val POSIX_MADV_SEQUENTIAL: Int = 1

public const val POSIX_MADV_WILLNEED: Int = 3

public const val _POSIX_VDISABLE: Int = 0

public const val P_PGID: UInt = 2u

public const val P_PID: UInt = 1u

public const val PRIO_PGRP: Int = 1

public const val PRIO_PROCESS: Int = 0

public const val PRIO_USER: Int = 2

public const val pseudo_AF_PIP: Int = 25

public const val pseudo_AF_RTIP: Int = 22

public const val pseudo_AF_XTP: Int = 19

public const val REG_ASSERT: Int = 15

public const val REG_ATOI: Int = 255

public const val REG_BACKR: Int = 0x400

public const val REG_BASIC: Int = 0x00

public const val REG_DUMP: Int = 0x80

public const val REG_EMPTY: Int = 14

public const val REG_INVARG: Int = 16

public const val REG_ITOA: Int = 256

public const val REG_LARGE: Int = 0x200

public const val REG_NOSPEC: Int = 0x10

public const val REG_OK: Int = 0

public const val REG_PEND: Int = 0x20

public const val REG_TRACE: Int = 0x100

public const val RLIMIT_AS: Int = 6

public const val RLIMIT_CORE: Int = 4

public const val RLIMIT_CPU: Int = 0

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_FSIZE: Int = 1

public const val RLIMIT_MEMLOCK: Int = 7

public const val RLIMIT_NOFILE: Int = 5

public const val RLIMIT_NPROC: Int = 8

public const val RLIMIT_RSS: Int = 6

public const val RLIMIT_STACK: Int = 3

public const val RLIMIT_VMEM: Int = 6

public const val RLIM_NLIMITS: Int = 14

public const val SCHED_ADJTOHEAD: Int = 5

public const val SCHED_ADJTOTAIL: Int = 6

public const val SCHED_MAXPOLICY: Int = 7

public const val SCHED_SETPRIO: Int = 7

public const val SCHED_SPORADIC: Int = 4

public const val SIGCLD: Int = SIGCHLD

public const val SIGDEADLK: Int = 7

public const val SIGEMT: Int = 7

public const val SIGEV_NONE: Int = 0

public const val SIGEV_SIGNAL: Int = 129

public const val SIGEV_THREAD: Int = 135

public const val SO_USELOOPBACK: Int = 0x0040

// _SS_ALIGNSIZE = size_of<Long>() (computed at the FFI boundary)
public const val _SS_ALIGNSIZE: ULong = 8uL

public const val _SS_MAXSIZE: ULong = 128uL

public val _SS_PAD1SIZE: ULong = _SS_ALIGNSIZE - 2uL

public val _SS_PAD2SIZE: ULong = _SS_MAXSIZE - 2u - _SS_PAD1SIZE - _SS_ALIGNSIZE

public val TC_CPOSIX: UInt = CLOCAL or CREAD or CSIZE or CSTOPB or HUPCL or PARENB or PARODD

public const val TCGETS: Int = 0x404c540d

public const val TC_OPOSIX: UInt = OPOST

public const val T_FMT_AMPM: Int = 5

public const val TIOCCBRK: Int = 29818

public const val TIOCCDTR: Int = 29816

public const val TIOCDRAIN: Int = 29790

public const val TIOCEXCL: Int = 29709

public const val TIOCFLUSH: Int = -2147191792

public const val TIOCGETA: Int = 1078752275

public const val TIOCGPGRP: Int = 1074033783

public const val TIOCGWINSZ: Int = 1074295912

public const val TIOCMBIC: Int = -2147191701

public const val TIOCMBIS: Int = -2147191700

public const val TIOCMGET: Int = 1074033770

public const val TIOCMSET: Int = -2147191699

public const val TIOCNOTTY: Int = 29809

public const val TIOCNXCL: Int = 29710

public const val TIOCOUTQ: Int = 1074033779

public const val TIOCPKT: Int = -2147191696

public const val TIOCPKT_DATA: Int = 0x00

public const val TIOCPKT_DOSTOP: Int = 0x20

public const val TIOCPKT_FLUSHREAD: Int = 0x01

public const val TIOCPKT_FLUSHWRITE: Int = 0x02

public const val TIOCPKT_IOCTL: Int = 0x40

public const val TIOCPKT_NOSTOP: Int = 0x10

public const val TIOCPKT_START: Int = 0x08

public const val TIOCPKT_STOP: Int = 0x04

public const val TIOCSBRK: Int = 29819

public const val TIOCSCTTY: Int = 29793

public const val TIOCSDTR: Int = 29817

public const val TIOCSETA: Int = -2142473196

public const val TIOCSETAF: Int = -2142473194

public const val TIOCSETAW: Int = -2142473195

public const val TIOCSPGRP: Int = -2147191690

public const val TIOCSTART: Int = 29806

public const val TIOCSTI: Int = -2147388302

public const val TIOCSTOP: Int = 29807

public const val TIOCSWINSZ: Int = -2146929561

public const val USER_CS_PATH: Int = 1

public const val USER_BC_BASE_MAX: Int = 2

public const val USER_BC_DIM_MAX: Int = 3

public const val USER_BC_SCALE_MAX: Int = 4

public const val USER_BC_STRING_MAX: Int = 5

public const val USER_COLL_WEIGHTS_MAX: Int = 6

public const val USER_EXPR_NEST_MAX: Int = 7

public const val USER_LINE_MAX: Int = 8

public const val USER_RE_DUP_MAX: Int = 9

public const val USER_POSIX2_VERSION: Int = 10

public const val USER_POSIX2_C_BIND: Int = 11

public const val USER_POSIX2_C_DEV: Int = 12

public const val USER_POSIX2_CHAR_TERM: Int = 13

public const val USER_POSIX2_FORT_DEV: Int = 14

public const val USER_POSIX2_FORT_RUN: Int = 15

public const val USER_POSIX2_LOCALEDEF: Int = 16

public const val USER_POSIX2_SW_DEV: Int = 17

public const val USER_POSIX2_UPE: Int = 18

public const val USER_STREAM_MAX: Int = 19

public const val USER_TZNAME_MAX: Int = 20

public const val VDOWN: ULong = 31uL

public const val VINS: ULong = 32uL

public const val VDEL: ULong = 33uL

public const val VRUB: ULong = 34uL

public const val VCAN: ULong = 35uL

public const val VHOME: ULong = 36uL

public const val VEND: ULong = 37uL

public const val VSPARE3: ULong = 38uL

public const val VSPARE4: ULong = 39uL

public const val VSWTCH: ULong = 7uL

public const val VDSUSP: ULong = 11uL

public const val VFWD: ULong = 18uL

public const val VLOGIN: ULong = 19uL

public const val VPREFIX: ULong = 20uL

public const val VSUFFIX: ULong = 24uL

public const val VLEFT: ULong = 28uL

public const val VRIGHT: ULong = 29uL

public const val VUP: ULong = 30uL

public const val XCASE: UInt = 0x00000004u

public const val PTHREAD_BARRIER_SERIAL_THREAD: Int = -1

public const val PTHREAD_CREATE_JOINABLE: Int = 0x00

public const val PTHREAD_CREATE_DETACHED: Int = 0x01

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 1

public const val PTHREAD_MUTEX_RECURSIVE: Int = 2

public const val PTHREAD_MUTEX_NORMAL: Int = 3

public const val PTHREAD_STACK_MIN: ULong = 256uL

public const val PTHREAD_MUTEX_DEFAULT: Int = 0

public const val PTHREAD_MUTEX_STALLED: Int = 0x00

public const val PTHREAD_MUTEX_ROBUST: Int = 0x10

public const val PTHREAD_PROCESS_PRIVATE: Int = 0x00

public const val PTHREAD_PROCESS_SHARED: Int = 0x01

public const val PTHREAD_KEYS_MAX: ULong = 128uL

public val PTHREAD_MUTEX_INITIALIZER: io.github.kotlinmania.libc.unix.nto.SyncT =
    io.github.kotlinmania.libc.unix.nto
        .SyncT(u = 0x80000000u, owner = 0xffffffffu)

public val PTHREAD_COND_INITIALIZER: io.github.kotlinmania.libc.unix.nto.SyncT =
    io.github.kotlinmania.libc.unix.nto
        .SyncT(u = CLOCK_REALTIME.toUInt(), owner = 0xfffffffbu)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(active = 0, blockedwriters = 0, blockedreaders = 0, heavy = 0, lock = PTHREAD_MUTEX_INITIALIZER, rcond = PTHREAD_COND_INITIALIZER, wcond = PTHREAD_COND_INITIALIZER, owner = 0xFFFFFFFEu, spare = 0u)
