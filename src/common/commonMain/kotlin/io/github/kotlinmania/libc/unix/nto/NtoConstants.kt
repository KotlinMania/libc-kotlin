package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.SizeT

public val SYSNAME_SIZE: Int = 256 + 1

public val RLIM_INFINITY: RlimT = 0xfffffffffffffffduL

public val O_LARGEFILE: CInt = 32768

// intentionally not public, only used for fdSet
// QNX Network Stack Versioning:
//
// The `if` block targets the legacy `io - pkt` stack.
// - targetEnv = "nto70": QNX 7.0
// - targetEnv = "nto71": Standard QNX 7.1 (default legacy stack)
//
// The `else` block targets the modern `io - sock` stack.
// - targetEnv = "nto71Iosock": QNX 7.1 with the optional new stack
// - targetEnv = "nto80": QNX 8.0
public val ULONG_SIZE: Int = 64

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 32767

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

public val F_DUPFD_CLOEXEC: CInt = 5

public val SIGTRAP: CInt = 5

public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_MONOTONIC: ClockidT = 2

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 3

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 4

public val TIMER_ABSTIME: CUint = 0x80000000u

public val RUSAGE_SELF: CInt = 0

public val F_OK: CInt = 0

public val X_OK: CInt = 1

public val W_OK: CInt = 2

public val R_OK: CInt = 4

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

public val PROT_NONE: CInt = 0x00000000

public val PROT_READ: CInt = 0x00000100

public val PROT_WRITE: CInt = 0x00000200

public val PROT_EXEC: CInt = 0x00000400

public val MAP_FILE: CInt = 0

public val MAP_SHARED: CInt = 1

public val MAP_PRIVATE: CInt = 2

public val MAP_FIXED: CInt = 0x10

public val MAP_FAILED: COpaquePointer? = COpaquePointer((0.inv()).toLong())

public val MS_ASYNC: CInt = 1

public val MS_INVALIDATE: CInt = 4

public val MS_SYNC: CInt = 2

public val SCM_RIGHTS: CInt = 0x01

public val SCM_TIMESTAMP: CInt = 0x02

public val SCM_CREDS: CInt = 0x04

public val IFF_NOTRAILERS: CInt = 0x00000020

public val AF_INET6: CInt = 24

public val AF_BLUETOOTH: CInt = 31

public val PSEUDO_AF_KEY: CInt = 29

public val MSG_NOSIGNAL: CInt = 0x0800

public val MSG_WAITFORONE: CInt = 0x2000

public val IP_IPSEC_POLICY_COMPAT: CInt = 22

public val IP_PKTINFO: CInt = 25

public val IPPROTO_DIVERT: CInt = 259

public val IPV6_IPSEC_POLICY_COMPAT: CInt = 28

public val TCP_KEEPALIVE: CInt = 0x04

public val ARPHRD_ARCNET: UShort = 7u

public val SO_BINDTODEVICE: CInt = 0x0800

public val EAI_NODATA: CInt = 7

public val IPTOS_ECN_NOT_ECT: UByte = 0x00u

public val RTF_BROADCAST: UInt = 0x80000u

public val UDP_ENCAP: CInt = 100

public val HW_IOSTATS: CInt = 9

public val HW_MACHINE_ARCH: CInt = 10

public val HW_ALIGNBYTES: CInt = 11

public val HW_CNMAGIC: CInt = 12

public val HW_PHYSMEM64: CInt = 13

public val HW_USERMEM64: CInt = 14

public val HW_IOSTATNAMES: CInt = 15

public val HW_MAXID: CInt = 15

public val CTL_UNSPEC: CInt = 0

public val CTL_QNX: CInt = 9

public val CTL_PROC: CInt = 10

public val CTL_VENDOR: CInt = 11

public val CTL_EMUL: CInt = 12

public val CTL_SECURITY: CInt = 13

public val CTL_MAXID: CInt = 14

public val AF_ARP: CInt = 28

public val AF_IEEE80211: CInt = 32

public val AF_NATM: CInt = 27

public val AF_NS: CInt = 6

public val BIOCGDLTLIST: CInt = -1072676233

public val BIOCGETIF: CInt = 1083196011

public val BIOCGSEESENT: CInt = 1074020984

public val BIOCGSTATS: CInt = 1082147439

public val BIOCSDLT: CInt = -2147204490

public val BIOCSETIF: CInt = -2138029460

public val BIOCSSEESENT: CInt = -2147204487

public val FIONSPACE: CInt = 1074030200

public val FIONWRITE: CInt = 1074030201

public val IFF_ACCEPTRTADV: CInt = 0x40000000

public val IFF_IP6FORWARDING: CInt = 0x20000000

public val IFF_SHIM: CInt = 0x80000000.toInt()

public val KERN_ARND: CInt = 81

public val KERN_IOV_MAX: CInt = 38

public val KERN_LOGSIGEXIT: CInt = 46

public val KERN_MAXID: CInt = 83

public val KERN_PROC_ARGS: CInt = 48

public val KERN_PROC_ENV: CInt = 3

public val KERN_PROC_GID: CInt = 7

public val KERN_PROC_RGID: CInt = 8

public val LOCAL_CONNWAIT: CInt = 0x0002

public val LOCAL_CREDS: CInt = 0x0001

public val LOCAL_PEEREID: CInt = 0x0003

public val MSG_NOTIFICATION: CInt = 0x0400

public val NET_RT_IFLIST: CInt = 4

public val NI_NUMERICSCOPE: CInt = 0x00000040

public val PF_ARP: CInt = 28

public val PF_NATM: CInt = 27

public val PSEUDO_AF_HDRCMPLT: CInt = 30

public val SIOCGIFADDR: CInt = -1064277727

public val SO_FIB: CInt = 0x100a

public val SO_TXPRIO: CInt = 0x100b

public val SO_SETFIB: CInt = 0x100a

public val SO_VLANPRIO: CInt = 0x100c

public val USER_ATEXIT_MAX: CInt = 21

public val USER_MAXID: CInt = 22

public val SO_OVERFLOWED: CInt = 0x1009

public val MAP_TYPE: CInt = 0x3

public val IFF_UP: CInt = 0x00000001

public val IFF_BROADCAST: CInt = 0x00000002

public val IFF_DEBUG: CInt = 0x00000004

public val IFF_LOOPBACK: CInt = 0x00000008

public val IFF_POINTOPOINT: CInt = 0x00000010

public val IFF_RUNNING: CInt = 0x00000040

public val IFF_NOARP: CInt = 0x00000080

public val IFF_PROMISC: CInt = 0x00000100

public val IFF_ALLMULTI: CInt = 0x00000200

public val IFF_MULTICAST: CInt = 0x00008000

public val AF_UNSPEC: CInt = 0

public val AF_LOCAL: CInt = 1

public val AF_UNIX: CInt = AF_LOCAL

public val AF_INET: CInt = 2

public val AF_IPX: CInt = 23

public val AF_APPLETALK: CInt = 16

public val AF_ROUTE: CInt = 17

public val AF_SNA: CInt = 11

public val AF_ISDN: CInt = 26

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_UNIX: CInt = PF_LOCAL

public val PF_INET: CInt = AF_INET

public val PF_IPX: CInt = AF_IPX

public val PF_APPLETALK: CInt = AF_APPLETALK

public val PF_INET6: CInt = AF_INET6

public val PF_KEY: CInt = PSEUDO_AF_KEY

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_SNA: CInt = AF_SNA

public val PF_BLUETOOTH: CInt = AF_BLUETOOTH

public val PF_ISDN: CInt = AF_ISDN

public val SOMAXCONN: CInt = 128

public val MSG_OOB: CInt = 0x0001

public val MSG_PEEK: CInt = 0x0002

public val MSG_DONTROUTE: CInt = 0x0004

public val MSG_CTRUNC: CInt = 0x0020

public val MSG_TRUNC: CInt = 0x0010

public val MSG_DONTWAIT: CInt = 0x0080

public val MSG_EOR: CInt = 0x0008

public val MSG_WAITALL: CInt = 0x0040

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_HDRINCL: CInt = 2

public val IP_OPTIONS: CInt = 1

public val IP_RECVOPTS: CInt = 5

public val IP_RETOPTS: CInt = 8

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IP_DEFAULT_MULTICAST_TTL: CInt = 1

public val IP_DEFAULT_MULTICAST_LOOP: CInt = 1

public val IPPROTO_HOPOPTS: CInt = 0

public val IPPROTO_IGMP: CInt = 2

public val IPPROTO_IPIP: CInt = 4

public val IPPROTO_EGP: CInt = 8

public val IPPROTO_PUP: CInt = 12

public val IPPROTO_IDP: CInt = 22

public val IPPROTO_TP: CInt = 29

public val IPPROTO_ROUTING: CInt = 43

public val IPPROTO_FRAGMENT: CInt = 44

public val IPPROTO_RSVP: CInt = 46

public val IPPROTO_GRE: CInt = 47

public val IPPROTO_ESP: CInt = 50

public val IPPROTO_AH: CInt = 51

public val IPPROTO_NONE: CInt = 59

public val IPPROTO_DSTOPTS: CInt = 60

public val IPPROTO_ENCAP: CInt = 98

public val IPPROTO_PIM: CInt = 103

public val IPPROTO_SCTP: CInt = 132

public val IPPROTO_RAW: CInt = 255

public val IPPROTO_MAX: CInt = 256

public val IPPROTO_CARP: CInt = 112

public val IPPROTO_DONE: CInt = 257

public val IPPROTO_EON: CInt = 80

public val IPPROTO_ETHERIP: CInt = 97

public val IPPROTO_GGP: CInt = 3

public val IPPROTO_IPCOMP: CInt = 108

public val IPPROTO_MOBILE: CInt = 55

public val IPV6_RTHDR_LOOSE: CInt = 0

public val IPV6_RTHDR_STRICT: CInt = 1

public val IPV6_UNICAST_HOPS: CInt = 4

public val IPV6_MULTICAST_IF: CInt = 9

public val IPV6_MULTICAST_HOPS: CInt = 10

public val IPV6_MULTICAST_LOOP: CInt = 11

public val IPV6_JOIN_GROUP: CInt = 12

public val IPV6_LEAVE_GROUP: CInt = 13

public val IPV6_CHECKSUM: CInt = 26

public val IPV6_V6ONLY: CInt = 27

public val IPV6_RTHDRDSTOPTS: CInt = 35

public val IPV6_RECVPKTINFO: CInt = 36

public val IPV6_RECVHOPLIMIT: CInt = 37

public val IPV6_RECVRTHDR: CInt = 38

public val IPV6_RECVHOPOPTS: CInt = 39

public val IPV6_RECVDSTOPTS: CInt = 40

public val IPV6_RECVPATHMTU: CInt = 43

public val IPV6_PATHMTU: CInt = 44

public val IPV6_PKTINFO: CInt = 46

public val IPV6_HOPLIMIT: CInt = 47

public val IPV6_NEXTHOP: CInt = 48

public val IPV6_HOPOPTS: CInt = 49

public val IPV6_DSTOPTS: CInt = 50

public val IPV6_RECVTCLASS: CInt = 57

public val IPV6_TCLASS: CInt = 61

public val IPV6_DONTFRAG: CInt = 62

public val TCP_NODELAY: CInt = 0x01

public val TCP_MAXSEG: CInt = 0x02

public val TCP_MD5SIG: CInt = 0x10

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val LOCK_SH: CInt = 0x1

public val LOCK_EX: CInt = 0x2

public val LOCK_NB: CInt = 0x4

public val LOCK_UN: CInt = 0x8

public val SS_ONSTACK: CInt = 1

public val SS_DISABLE: CInt = 2

public val PATH_MAX: CInt = 1024

public val UIO_MAXIOV: CInt = 1024

public val FD_SETSIZE: Int = 256

public val TCIOFF: CInt = 0x0002

public val TCION: CInt = 0x0003

public val TCOOFF: CInt = 0x0000

public val TCOON: CInt = 0x0001

public val TCIFLUSH: CInt = 0

public val TCOFLUSH: CInt = 1

public val TCIOFLUSH: CInt = 2

public val NL0: TcflagT = 0x000u

public val NL1: TcflagT = 0x100u

public val TAB0: TcflagT = 0x0000u

public val CR0: TcflagT = 0x000u

public val FF0: TcflagT = 0x0000u

public val BS0: TcflagT = 0x0000u

public val VT0: TcflagT = 0x0000u

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

public val OPOST: TcflagT = 0x00000001u

public val CS5: TcflagT = 0x00u

public val ECHO: TcflagT = 0x00000008u

public val OCRNL: TcflagT = 0x00000008u

public val ONOCR: TcflagT = 0x00000010u

public val ONLRET: TcflagT = 0x00000020u

public val OFILL: TcflagT = 0x00000040u

public val OFDEL: TcflagT = 0x00000080u

public val WNOHANG: CInt = 0x0040

public val WUNTRACED: CInt = 0x0004

public val WSTOPPED: CInt = WUNTRACED

public val WEXITED: CInt = 0x0001

public val WCONTINUED: CInt = 0x0008

public val WNOWAIT: CInt = 0x0080

public val WTRAPPED: CInt = 0x0002

public val RTLD_LOCAL: CInt = 0x0200

public val RTLD_LAZY: CInt = 0x0001

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_RANDOM: CInt = 2

public val POSIX_FADV_SEQUENTIAL: CInt = 1

public val POSIX_FADV_WILLNEED: CInt = 3

public val AT_FDCWD: CInt = -100

public val AT_EACCESS: CInt = 0x0001

public val AT_SYMLINK_NOFOLLOW: CInt = 0x0002

public val AT_SYMLINK_FOLLOW: CInt = 0x0004

public val AT_REMOVEDIR: CInt = 0x0008

public val LOG_CRON: CInt = 9 shl 3

public val LOG_AUTHPRIV: CInt = 10 shl 3

public val LOG_FTP: CInt = 11 shl 3

public val LOG_PERROR: CInt = 0x20

public val PIPE_BUF: Int = 5120

public val CLD_EXITED: CInt = 1

public val CLD_KILLED: CInt = 2

public val CLD_DUMPED: CInt = 3

public val CLD_TRAPPED: CInt = 4

public val CLD_STOPPED: CInt = 5

public val CLD_CONTINUED: CInt = 6

public val UTIME_OMIT: CLong = 0x40000002L

public val UTIME_NOW: CLong = 0x40000001L

public val POLLRDNORM: CShort = 0x0001

public val POLLRDBAND: CShort = 0x0004

public val POLLIN: CShort = (POLLRDNORM.toInt() or POLLRDBAND.toInt()).toShort()

public val POLLPRI: CShort = 0x0008

public val POLLOUT: CShort = 0x0002

public val POLLERR: CShort = 0x0020

public val POLLHUP: CShort = 0x0040

public val POLLNVAL: CShort = 0x1000

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

public val IPOPT_CONTROL: UByte = 0x00u

public val IPOPT_RESERVED1: UByte = 0x20u

public val IPOPT_RESERVED2: UByte = 0x60u

public val IPOPT_LSRR: UByte = 131u

public val IPOPT_RR: UByte = 7u

public val IPOPT_SSRR: UByte = 137u

public val IPDEFTTL: UByte = 64u

public val IPOPT_OPTVAL: UByte = 0u

public val IPOPT_OLEN: UByte = 1u

public val IPOPT_OFFSET: UByte = 2u

public val IPOPT_MINOFF: UByte = 4u

public val IPOPT_NOP: UByte = 1u

public val IPOPT_EOL: UByte = 0u

public val IPOPT_TS: UByte = 68u

public val IPOPT_TS_TSONLY: UByte = 0u

public val IPOPT_TS_TSANDADDR: UByte = 1u

public val IPOPT_TS_PRESPEC: UByte = 3u

public val MAX_IPOPTLEN: UByte = 40u

public val IPVERSION: UByte = 4u

public val MAXTTL: UByte = 255u

public val ARPHRD_ETHER: UShort = 1u

public val ARPHRD_IEEE802: UShort = 6u

public val ARPHRD_IEEE1394: UShort = 24u

public val SOL_SOCKET: CInt = 0xffff

public val SO_DEBUG: CInt = 0x0001

public val SO_REUSEADDR: CInt = 0x0004

public val SO_TYPE: CInt = 0x1008

public val SO_ERROR: CInt = 0x1007

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_OOBINLINE: CInt = 0x0100

public val SO_LINGER: CInt = 0x0080

public val SO_REUSEPORT: CInt = 0x0200

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_TIMESTAMP: CInt = 0x0400

public val SO_ACCEPTCONN: CInt = 0x0002

public val TIOCM_LE: CInt = 0x0100

public val TIOCM_DTR: CInt = 0x0001

public val TIOCM_RTS: CInt = 0x0002

public val TIOCM_ST: CInt = 0x0200

public val TIOCM_SR: CInt = 0x0400

public val TIOCM_CTS: CInt = 0x1000

public val TIOCM_CD: CInt = 0x8000

public val TIOCM_CAR: CInt = TIOCM_CD

public val TIOCM_RI: CInt = 0x4000

public val TIOCM_RNG: CInt = TIOCM_RI

public val TIOCM_DSR: CInt = 0x2000

public val SCHED_OTHER: CInt = 3

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val IPC_PRIVATE: KeyT = 0u

public val IPC_CREAT: CInt = 512

public val IPC_EXCL: CInt = 1024

public val IPC_NOWAIT: CInt = 2048

public val IPC_RMID: CInt = 0

public val IPC_SET: CInt = 1

public val IPC_STAT: CInt = 2

public val MSG_NOERROR: CInt = 4096

public val LOG_NFACILITIES: CInt = 24

public val SEM_FAILED: SyncT? = null

public val AI_PASSIVE: CInt = 0x00000001

public val AI_CANONNAME: CInt = 0x00000002

public val AI_NUMERICHOST: CInt = 0x00000004

public val AI_NUMERICSERV: CInt = 0x00000008

public val EAI_BADFLAGS: CInt = 3

public val EAI_NONAME: CInt = 8

public val EAI_AGAIN: CInt = 2

public val EAI_FAIL: CInt = 4

public val EAI_FAMILY: CInt = 5

public val EAI_SOCKTYPE: CInt = 10

public val EAI_SERVICE: CInt = 9

public val EAI_MEMORY: CInt = 6

public val EAI_SYSTEM: CInt = 11

public val EAI_OVERFLOW: CInt = 14

public val NI_NUMERICHOST: CInt = 0x00000002

public val NI_NUMERICSERV: CInt = 0x00000008

public val NI_NOFQDN: CInt = 0x00000001

public val NI_NAMEREQD: CInt = 0x00000004

public val NI_DGRAM: CInt = 0x00000010

public val AIO_CANCELED: CInt = 0

public val AIO_NOTCANCELED: CInt = 2

public val AIO_ALLDONE: CInt = 1

public val LIO_READ: CInt = 1

public val LIO_WRITE: CInt = 2

public val LIO_NOP: CInt = 0

public val LIO_WAIT: CInt = 1

public val LIO_NOWAIT: CInt = 0

public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

// DIFF(main): changed to `cShort` in f62eb023ab
public val POSIX_SPAWN_RESETIDS: CInt = 0x00000010

public val POSIX_SPAWN_SETPGROUP: CInt = 0x00000001

public val POSIX_SPAWN_SETSIGDEF: CInt = 0x00000004

public val POSIX_SPAWN_SETSIGMASK: CInt = 0x00000002

public val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x00000400

public val POSIX_SPAWN_SETSCHEDULER: CInt = 0x00000040

public val RTF_UP: CUshort = 0x0001u

public val RTF_GATEWAY: CUshort = 0x0002u

public val RTF_HOST: CUshort = 0x0004u

public val RTF_DYNAMIC: CUshort = 0x0010u

public val RTF_MODIFIED: CUshort = 0x0020u

public val RTF_REJECT: CUshort = 0x0008u

public val RTF_STATIC: CUshort = 0x0800u

public val RTF_XRESOLVE: CUshort = 0x0200u

public val RTM_NEWADDR: UShort = 0xcu

public val RTM_DELADDR: UShort = 0xdu

public val RTA_DST: CUshort = 0x1u

public val RTA_GATEWAY: CUshort = 0x2u

public val IN_ACCESS: UInt = 0x00000001u

public val IN_MODIFY: UInt = 0x00000002u

public val IN_ATTRIB: UInt = 0x00000004u

public val IN_CLOSE_WRITE: UInt = 0x00000008u

public val IN_CLOSE_NOWRITE: UInt = 0x00000010u

public val IN_CLOSE: UInt = IN_CLOSE_WRITE or IN_CLOSE_NOWRITE

public val IN_OPEN: UInt = 0x00000020u

public val IN_MOVED_FROM: UInt = 0x00000040u

public val IN_MOVED_TO: UInt = 0x00000080u

public val IN_MOVE: UInt = IN_MOVED_FROM or IN_MOVED_TO

public val IN_CREATE: UInt = 0x00000100u

public val IN_DELETE: UInt = 0x00000200u

public val IN_DELETE_SELF: UInt = 0x00000400u

public val IN_MOVE_SELF: UInt = 0x00000800u

public val IN_UNMOUNT: UInt = 0x00002000u

public val IN_Q_OVERFLOW: UInt = 0x00004000u

public val IN_IGNORED: UInt = 0x00008000u

public val IN_ONLYDIR: UInt = 0x01000000u

public val IN_DONT_FOLLOW: UInt = 0x02000000u

public val IN_ISDIR: UInt = 0x40000000u

public val IN_ONESHOT: UInt = 0x80000000u

public val REG_EXTENDED: CInt = 1

public val REG_ICASE: CInt = 2

public val REG_NEWLINE: CInt = 8

public val REG_NOSUB: CInt = 4

public val REG_NOTBOL: CInt = 1

public val REG_NOTEOL: CInt = 2

public val REG_ENOSYS: CInt = 17

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

// errno.h
public val EOK: CInt = 0

public val EAGAIN: CInt = 11

public val EWOULDBLOCK: CInt = EAGAIN

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

public val ENOLCK: CInt = 46

public val ECANCELED: CInt = 47

public val EDQUOT: CInt = 49

public val EBADE: CInt = 50

public val EBADR: CInt = 51

public val EXFULL: CInt = 52

public val ENOANO: CInt = 53

public val EBADRQC: CInt = 54

public val EBADSLT: CInt = 55

public val EDEADLOCK: CInt = 56

public val EBFONT: CInt = 57

public val EOWNERDEAD: CInt = 58

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

public val EMULTIHOP: CInt = 74

public val EBADMSG: CInt = 77

public val ENAMETOOLONG: CInt = 78

public val EOVERFLOW: CInt = 79

public val ENOTUNIQ: CInt = 80

public val EBADFD: CInt = 81

public val EREMCHG: CInt = 82

public val ELIBACC: CInt = 83

public val ELIBBAD: CInt = 84

public val ELIBSCN: CInt = 85

public val ELIBMAX: CInt = 86

public val ELIBEXEC: CInt = 87

public val EILSEQ: CInt = 88

public val ENOSYS: CInt = 89

public val ELOOP: CInt = 90

public val ERESTART: CInt = 91

public val ESTRPIPE: CInt = 92

public val ENOTEMPTY: CInt = 93

public val EUSERS: CInt = 94

public val ENOTRECOVERABLE: CInt = 95

public val EOPNOTSUPP: CInt = 103

public val EFPOS: CInt = 110

public val ESTALE: CInt = 122

public val EINPROGRESS: CInt = 236

public val EALREADY: CInt = 237

public val ENOTSOCK: CInt = 238

public val EDESTADDRREQ: CInt = 239

public val EMSGSIZE: CInt = 240

public val EPROTOTYPE: CInt = 241

public val ENOPROTOOPT: CInt = 242

public val EPROTONOSUPPORT: CInt = 243

public val ESOCKTNOSUPPORT: CInt = 244

public val EPFNOSUPPORT: CInt = 246

public val EAFNOSUPPORT: CInt = 247

public val EADDRINUSE: CInt = 248

public val EADDRNOTAVAIL: CInt = 249

public val ENETDOWN: CInt = 250

public val ENETUNREACH: CInt = 251

public val ENETRESET: CInt = 252

public val ECONNABORTED: CInt = 253

public val ECONNRESET: CInt = 254

public val ENOBUFS: CInt = 255

public val EISCONN: CInt = 256

public val ENOTCONN: CInt = 257

public val ESHUTDOWN: CInt = 258

public val ETOOMANYREFS: CInt = 259

public val ETIMEDOUT: CInt = 260

public val ECONNREFUSED: CInt = 261

public val EHOSTDOWN: CInt = 264

public val EHOSTUNREACH: CInt = 265

public val EBADRPC: CInt = 272

public val ERPCMISMATCH: CInt = 273

public val EPROGUNAVAIL: CInt = 274

public val EPROGMISMATCH: CInt = 275

public val EPROCUNAVAIL: CInt = 276

public val ENOREMOTE: CInt = 300

public val ENONDP: CInt = 301

public val EBADFSYS: CInt = 302

public val EMORE: CInt = 309

public val ECTRLTERM: CInt = 310

public val ENOLIC: CInt = 311

public val ESRVRFAULT: CInt = 312

public val EENDIAN: CInt = 313

public val ESECTYPEINVAL: CInt = 314

public val RUSAGE_CHILDREN: CInt = -1

public val L_TMPNAM: CUint = 255u

public val PC_LINK_MAX: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_PATH_MAX: CInt = 5

public val PC_PIPE_BUF: CInt = 6

public val PC_CHOWN_RESTRICTED: CInt = 9

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_SYNC_IO: CInt = 14

public val PC_ASYNC_IO: CInt = 12

public val PC_PRIO_IO: CInt = 13

public val PC_SOCK_MAXBUF: CInt = 15

public val PC_FILESIZEBITS: CInt = 16

public val PC_REC_INCR_XFER_SIZE: CInt = 22

public val PC_REC_MAX_XFER_SIZE: CInt = 23

public val PC_REC_MIN_XFER_SIZE: CInt = 24

public val PC_REC_XFER_ALIGN: CInt = 25

public val PC_ALLOC_SIZE_MIN: CInt = 21

public val PC_SYMLINK_MAX: CInt = 17

public val PC_2_SYMLINKS: CInt = 20

public val SC_PAGESIZE: CInt = 11

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_ARG_MAX: CInt = 1

public val SC_CHILD_MAX: CInt = 2

public val SC_CLK_TCK: CInt = 3

public val SC_NGROUPS_MAX: CInt = 4

public val SC_OPEN_MAX: CInt = 5

public val SC_JOB_CONTROL: CInt = 6

public val SC_SAVED_IDS: CInt = 7

public val SC_VERSION: CInt = 8

public val SC_PASS_MAX: CInt = 9

public val SC_XOPEN_VERSION: CInt = 12

public val SC_STREAM_MAX: CInt = 13

public val SC_TZNAME_MAX: CInt = 14

public val SC_AIO_LISTIO_MAX: CInt = 15

public val SC_AIO_MAX: CInt = 16

public val SC_AIO_PRIO_DELTA_MAX: CInt = 17

public val SC_DELAYTIMER_MAX: CInt = 18

public val SC_MQ_OPEN_MAX: CInt = 19

public val SC_MQ_PRIO_MAX: CInt = 20

public val SC_RTSIG_MAX: CInt = 21

public val SC_SEM_NSEMS_MAX: CInt = 22

public val SC_SEM_VALUE_MAX: CInt = 23

public val SC_SIGQUEUE_MAX: CInt = 24

public val SC_TIMER_MAX: CInt = 25

public val SC_ASYNCHRONOUS_IO: CInt = 26

public val SC_FSYNC: CInt = 27

public val SC_MAPPED_FILES: CInt = 28

public val SC_MEMLOCK: CInt = 29

public val SC_MEMLOCK_RANGE: CInt = 30

public val SC_MEMORY_PROTECTION: CInt = 31

public val SC_MESSAGE_PASSING: CInt = 32

public val SC_PRIORITIZED_IO: CInt = 33

public val SC_PRIORITY_SCHEDULING: CInt = 34

public val SC_REALTIME_SIGNALS: CInt = 35

public val SC_SEMAPHORES: CInt = 36

public val SC_SHARED_MEMORY_OBJECTS: CInt = 37

public val SC_SYNCHRONIZED_IO: CInt = 38

public val SC_TIMERS: CInt = 39

public val SC_GETGR_R_SIZE_MAX: CInt = 40

public val SC_GETPW_R_SIZE_MAX: CInt = 41

public val SC_LOGIN_NAME_MAX: CInt = 42

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 43

public val SC_THREAD_KEYS_MAX: CInt = 44

public val SC_THREAD_STACK_MIN: CInt = 45

public val SC_THREAD_THREADS_MAX: CInt = 46

public val SC_TTY_NAME_MAX: CInt = 47

public val SC_THREADS: CInt = 48

public val SC_THREAD_ATTR_STACKADDR: CInt = 49

public val SC_THREAD_ATTR_STACKSIZE: CInt = 50

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 51

public val SC_THREAD_PRIO_INHERIT: CInt = 52

public val SC_THREAD_PRIO_PROTECT: CInt = 53

public val SC_THREAD_PROCESS_SHARED: CInt = 54

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 55

public val SC_2_CHAR_TERM: CInt = 56

public val SC_2_C_BIND: CInt = 57

public val SC_2_C_DEV: CInt = 58

public val SC_2_C_VERSION: CInt = 59

public val SC_2_FORT_DEV: CInt = 60

public val SC_2_FORT_RUN: CInt = 61

public val SC_2_LOCALEDEF: CInt = 62

public val SC_2_SW_DEV: CInt = 63

public val SC_2_UPE: CInt = 64

public val SC_2_VERSION: CInt = 65

public val SC_ATEXIT_MAX: CInt = 66

public val SC_AVPHYS_PAGES: CInt = 67

public val SC_BC_BASE_MAX: CInt = 68

public val SC_BC_DIM_MAX: CInt = 69

public val SC_BC_SCALE_MAX: CInt = 70

public val SC_BC_STRING_MAX: CInt = 71

public val SC_CHARCLASS_NAME_MAX: CInt = 72

public val SC_CHAR_BIT: CInt = 73

public val SC_CHAR_MAX: CInt = 74

public val SC_CHAR_MIN: CInt = 75

public val SC_COLL_WEIGHTS_MAX: CInt = 76

public val SC_EQUIV_CLASS_MAX: CInt = 77

public val SC_EXPR_NEST_MAX: CInt = 78

public val SC_INT_MAX: CInt = 79

public val SC_INT_MIN: CInt = 80

public val SC_LINE_MAX: CInt = 81

public val SC_LONG_BIT: CInt = 82

public val SC_MB_LEN_MAX: CInt = 83

public val SC_NL_ARGMAX: CInt = 84

public val SC_NL_LANGMAX: CInt = 85

public val SC_NL_MSGMAX: CInt = 86

public val SC_NL_NMAX: CInt = 87

public val SC_NL_SETMAX: CInt = 88

public val SC_NL_TEXTMAX: CInt = 89

public val SC_NPROCESSORS_CONF: CInt = 90

public val SC_NPROCESSORS_ONLN: CInt = 91

public val SC_NZERO: CInt = 92

public val SC_PHYS_PAGES: CInt = 93

public val SC_PII: CInt = 94

public val SC_PII_INTERNET: CInt = 95

public val SC_PII_INTERNET_DGRAM: CInt = 96

public val SC_PII_INTERNET_STREAM: CInt = 97

public val SC_PII_OSI: CInt = 98

public val SC_PII_OSI_CLTS: CInt = 99

public val SC_PII_OSI_COTS: CInt = 100

public val SC_PII_OSI_M: CInt = 101

public val SC_PII_SOCKET: CInt = 102

public val SC_PII_XTI: CInt = 103

public val SC_POLL: CInt = 104

public val SC_RE_DUP_MAX: CInt = 105

public val SC_SCHAR_MAX: CInt = 106

public val SC_SCHAR_MIN: CInt = 107

public val SC_SELECT: CInt = 108

public val SC_SHRT_MAX: CInt = 109

public val SC_SHRT_MIN: CInt = 110

public val SC_SSIZE_MAX: CInt = 111

public val SC_T_IOV_MAX: CInt = 112

public val SC_UCHAR_MAX: CInt = 113

public val SC_UINT_MAX: CInt = 114

public val SC_UIO_MAXIOV: CInt = 115

public val SC_ULONG_MAX: CInt = 116

public val SC_USHRT_MAX: CInt = 117

public val SC_WORD_BIT: CInt = 118

public val SC_XOPEN_CRYPT: CInt = 119

public val SC_XOPEN_ENH_I18N: CInt = 120

public val SC_XOPEN_SHM: CInt = 121

public val SC_XOPEN_UNIX: CInt = 122

public val SC_XOPEN_XCU_VERSION: CInt = 123

public val SC_XOPEN_XPG2: CInt = 124

public val SC_XOPEN_XPG3: CInt = 125

public val SC_XOPEN_XPG4: CInt = 126

public val SC_XBS5_ILP32_OFF32: CInt = 127

public val SC_XBS5_ILP32_OFFBIG: CInt = 128

public val SC_XBS5_LP64_OFF64: CInt = 129

public val SC_XBS5_LPBIG_OFFBIG: CInt = 130

public val SC_ADVISORY_INFO: CInt = 131

public val SC_CPUTIME: CInt = 132

public val SC_SPAWN: CInt = 133

public val SC_SPORADIC_SERVER: CInt = 134

public val SC_THREAD_CPUTIME: CInt = 135

public val SC_THREAD_SPORADIC_SERVER: CInt = 136

public val SC_TIMEOUTS: CInt = 137

public val SC_BARRIERS: CInt = 138

public val SC_CLOCK_SELECTION: CInt = 139

public val SC_MONOTONIC_CLOCK: CInt = 140

public val SC_READER_WRITER_LOCKS: CInt = 141

public val SC_SPIN_LOCKS: CInt = 142

public val SC_TYPED_MEMORY_OBJECTS: CInt = 143

public val SC_TRACE_EVENT_FILTER: CInt = 144

public val SC_TRACE: CInt = 145

public val SC_TRACE_INHERIT: CInt = 146

public val SC_TRACE_LOG: CInt = 147

public val SC_2_PBS: CInt = 148

public val SC_2_PBS_ACCOUNTING: CInt = 149

public val SC_2_PBS_CHECKPOINT: CInt = 150

public val SC_2_PBS_LOCATE: CInt = 151

public val SC_2_PBS_MESSAGE: CInt = 152

public val SC_2_PBS_TRACK: CInt = 153

public val SC_HOST_NAME_MAX: CInt = 154

public val SC_IOV_MAX: CInt = 155

public val SC_IPV6: CInt = 156

public val SC_RAW_SOCKETS: CInt = 157

public val SC_REGEXP: CInt = 158

public val SC_SHELL: CInt = 159

public val SC_SS_REPL_MAX: CInt = 160

public val SC_SYMLOOP_MAX: CInt = 161

public val SC_TRACE_EVENT_NAME_MAX: CInt = 162

public val SC_TRACE_NAME_MAX: CInt = 163

public val SC_TRACE_SYS_MAX: CInt = 164

public val SC_TRACE_USER_EVENT_MAX: CInt = 165

public val SC_V6_ILP32_OFF32: CInt = 166

public val SC_V6_ILP32_OFFBIG: CInt = 167

public val SC_V6_LP64_OFF64: CInt = 168

public val SC_V6_LPBIG_OFFBIG: CInt = 169

public val SC_XOPEN_REALTIME: CInt = 170

public val SC_XOPEN_REALTIME_THREADS: CInt = 171

public val SC_XOPEN_LEGACY: CInt = 172

public val SC_XOPEN_STREAMS: CInt = 173

public val SC_V7_ILP32_OFF32: CInt = 176

public val SC_V7_ILP32_OFFBIG: CInt = 177

public val SC_V7_LP64_OFF64: CInt = 178

public val SC_V7_LPBIG_OFFBIG: CInt = 179

public val GLOB_ERR: CInt = 0x0001

public val GLOB_MARK: CInt = 0x0002

public val GLOB_NOSORT: CInt = 0x0004

public val GLOB_DOOFFS: CInt = 0x0008

public val GLOB_NOCHECK: CInt = 0x0010

public val GLOB_APPEND: CInt = 0x0020

public val GLOB_NOESCAPE: CInt = 0x0040

public val GLOB_NOSPACE: CInt = 1

public val GLOB_ABORTED: CInt = 2

public val GLOB_NOMATCH: CInt = 3

public val S_IXUSR: ModeT = 64u

public val S_IEXEC: ModeT = S_IXUSR

public val S_IWUSR: ModeT = 128u

public val S_IWRITE: ModeT = S_IWUSR

public val S_IRUSR: ModeT = 256u

public val S_IREAD: ModeT = S_IRUSR

public val S_IFIFO: ModeT = 4096u

public val S_IFCHR: ModeT = 8192u

public val S_IFDIR: ModeT = 16384u

public val S_IFBLK: ModeT = 24576u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFMT: ModeT = 61440u

public val S_IXOTH: ModeT = 1u

public val S_IWOTH: ModeT = 2u

public val S_IROTH: ModeT = 4u

public val S_IRWXO: ModeT = 7u

public val S_IXGRP: ModeT = 8u

public val S_IWGRP: ModeT = 16u

public val S_IRGRP: ModeT = 32u

public val S_IRWXG: ModeT = 56u

public val S_IRWXU: ModeT = 448u

public val F_LOCK: CInt = 1

public val F_TEST: CInt = 3

public val F_TLOCK: CInt = 2

public val F_ULOCK: CInt = 0

public val ST_RDONLY: CUlong = 0x01uL

public val ST_NOSUID: CUlong = 0x04uL

public val ST_NOEXEC: CUlong = 0x02uL

public val ST_NOATIME: CUlong = 0x20uL

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-3L))

public val RTLD_DEFAULT: COpaquePointer? = COpaquePointer((-2L))

public val RTLD_NODELETE: CInt = 0x1000

public val RTLD_NOW: CInt = 0x0002

public val EMPTY: CShort = 0

public val RUN_LVL: CShort = 1

public val BOOT_TIME: CShort = 2

public val NEW_TIME: CShort = 4

public val OLD_TIME: CShort = 3

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val USER_PROCESS: CShort = 7

public val DEAD_PROCESS: CShort = 8

public val ACCOUNTING: CShort = 9

public val ENOTSUP: CInt = 48

public val BUFSIZ: CUint = 1024u

public val TMP_MAX: CUint = 26u * 26u * 26u

public val FOPEN_MAX: CUint = 16u

public val FILENAME_MAX: CUint = 255u

public val NI_MAXHOST: SocklenT = 1025u

public val M_KEEP: CInt = 4

public val REG_STARTEND: CInt = 4

public val VEOF: Int = 4

public val RTLD_GLOBAL: CInt = 0x0100

public val RTLD_NOLOAD: CInt = 0x0004

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val O_EXEC: CInt = 3

public val O_ASYNC: CInt = 65536

public val O_NONBLOCK: CInt = 128

public val O_NDELAY: CInt = O_NONBLOCK

public val O_TRUNC: CInt = 512

public val O_CLOEXEC: CInt = 8192

public val O_DIRECTORY: CInt = 1048576

public val O_ACCMODE: CInt = 7

public val O_APPEND: CInt = 8

public val O_CREAT: CInt = 256

public val O_EXCL: CInt = 1024

public val O_NOCTTY: CInt = 2048

public val O_SYNC: CInt = 32

public val O_RSYNC: CInt = 64

public val O_DSYNC: CInt = 16

public val O_NOFOLLOW: CInt = 4096

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_CLOEXEC: CInt = 0x10000000

public val SA_SIGINFO: CInt = 0x0002

public val SA_NOCLDWAIT: CInt = 0x0020

public val SA_NODEFER: CInt = 0x0010

public val SA_RESETHAND: CInt = 0x0004

public val SA_NOCLDSTOP: CInt = 0x0001

public val SIGTTIN: CInt = 26

public val SIGTTOU: CInt = 27

public val SIGXCPU: CInt = 30

public val SIGXFSZ: CInt = 31

public val SIGVTALRM: CInt = 28

public val SIGPROF: CInt = 29

public val SIGWINCH: CInt = 20

public val SIGCHLD: CInt = 18

public val SIGBUS: CInt = 10

public val SIGUSR1: CInt = 16

public val SIGUSR2: CInt = 17

public val SIGCONT: CInt = 25

public val SIGSTOP: CInt = 23

public val SIGTSTP: CInt = 24

public val SIGURG: CInt = 21

public val SIGPOLL: CInt = 22

public val SIGIO: CInt = SIGPOLL

public val SIGSYS: CInt = 12

public val SIGPWR: CInt = 19

public val SIG_SETMASK: CInt = 2

public val SIG_BLOCK: CInt = 0

public val SIG_UNBLOCK: CInt = 1

public val POLLWRNORM: CShort = POLLOUT

public val POLLWRBAND: CShort = 0x0010

public val F_SETLK: CInt = 106

public val F_SETLKW: CInt = 107

public val F_ALLOCSP: CInt = 110

public val F_FREESP: CInt = 111

public val F_GETLK: CInt = 114

public val F_RDLCK: CInt = 1

public val F_WRLCK: CInt = 2

public val F_UNLCK: CInt = 3

public val NCCS: Int = 40

public val MAP_ANONYMOUS: CInt = 0x00080000

public val MAP_ANON: CInt = MAP_ANONYMOUS

public val MCL_CURRENT: CInt = 0x000000001

public val MCL_FUTURE: CInt = 0x000000002

public val TIO_CBAUD: TcflagT = 15u

public val CBAUD: TcflagT = TIO_CBAUD

public val TAB1: TcflagT = 0x0800u

public val TAB2: TcflagT = 0x1000u

public val TAB3: TcflagT = 0x1800u

public val CR1: TcflagT = 0x200u

public val CR2: TcflagT = 0x400u

public val CR3: TcflagT = 0x600u

public val FF1: TcflagT = 0x8000u

public val BS1: TcflagT = 0x2000u

public val VT1: TcflagT = 0x4000u

public val VWERASE: Int = 14

public val VREPRINT: Int = 12

public val VSUSP: Int = 10

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VDISCARD: Int = 13

public val VTIME: Int = 17

public val IXON: TcflagT = 0x00000400u

public val IXOFF: TcflagT = 0x00001000u

public val ONLCR: TcflagT = 0x00000004u

public val CSIZE: TcflagT = 0x00000030u

public val CS6: TcflagT = 0x10u

public val CS7: TcflagT = 0x20u

public val CS8: TcflagT = 0x30u

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

public val ECHOCTL: TcflagT = 0x00000200u

public val ISIG: TcflagT = 0x00000001u

public val ICANON: TcflagT = 0x00000002u

public val NOFLSH: TcflagT = 0x00000080u

public val OLCUC: TcflagT = 0x00000002u

public val NLDLY: TcflagT = 0x00000100u

public val CRDLY: TcflagT = 0x00000600u

public val TABDLY: TcflagT = 0x00001800u

public val BSDLY: TcflagT = 0x00002000u

public val FFDLY: TcflagT = 0x00008000u

public val VTDLY: TcflagT = 0x00004000u

public val XTABS: TcflagT = 0x1800u

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

public val EXTA: SpeedT = 14u

public val EXTB: SpeedT = 15u

public val B57600: SpeedT = 57600u

public val B115200: SpeedT = 115200u

public val VEOL: Int = 5

public val VEOL2: Int = 6

public val VMIN: Int = 16

public val IEXTEN: TcflagT = 0x00008000u

public val TOSTOP: TcflagT = 0x00000100u

public val TCSANOW: CInt = 0x0001

public val TCSADRAIN: CInt = 0x0002

public val TCSAFLUSH: CInt = 0x0004

public val HW_MACHINE: CInt = 1

public val HW_MODEL: CInt = 2

public val HW_NCPU: CInt = 3

public val HW_BYTEORDER: CInt = 4

public val HW_PHYSMEM: CInt = 5

public val HW_USERMEM: CInt = 6

public val HW_PAGESIZE: CInt = 7

public val HW_DISKNAMES: CInt = 8

public val CTL_KERN: CInt = 1

public val CTL_VM: CInt = 2

public val CTL_VFS: CInt = 3

public val CTL_NET: CInt = 4

public val CTL_DEBUG: CInt = 5

public val CTL_HW: CInt = 6

public val CTL_MACHDEP: CInt = 7

public val CTL_USER: CInt = 8

public val DAY_1: NlItem = 8

public val DAY_2: NlItem = 9

public val DAY_3: NlItem = 10

public val DAY_4: NlItem = 11

public val DAY_5: NlItem = 12

public val DAY_6: NlItem = 13

public val DAY_7: NlItem = 14

public val MON_1: NlItem = 22

public val MON_2: NlItem = 23

public val MON_3: NlItem = 24

public val MON_4: NlItem = 25

public val MON_5: NlItem = 26

public val MON_6: NlItem = 27

public val MON_7: NlItem = 28

public val MON_8: NlItem = 29

public val MON_9: NlItem = 30

public val MON_10: NlItem = 31

public val MON_11: NlItem = 32

public val MON_12: NlItem = 33

public val ABDAY_1: NlItem = 15

public val ABDAY_2: NlItem = 16

public val ABDAY_3: NlItem = 17

public val ABDAY_4: NlItem = 18

public val ABDAY_5: NlItem = 19

public val ABDAY_6: NlItem = 20

public val ABDAY_7: NlItem = 21

public val ABMON_1: NlItem = 34

public val ABMON_2: NlItem = 35

public val ABMON_3: NlItem = 36

public val ABMON_4: NlItem = 37

public val ABMON_5: NlItem = 38

public val ABMON_6: NlItem = 39

public val ABMON_7: NlItem = 40

public val ABMON_8: NlItem = 41

public val ABMON_9: NlItem = 42

public val ABMON_10: NlItem = 43

public val ABMON_11: NlItem = 44

public val ABMON_12: NlItem = 45

public val AF_CCITT: CInt = 10

public val AF_CHAOS: CInt = 5

public val AF_CNT: CInt = 21

public val AF_COIP: CInt = 20

public val AF_DATAKIT: CInt = 9

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_E164: CInt = 26

public val AF_ECMA: CInt = 8

public val AF_HYLINK: CInt = 15

public val AF_IMPLINK: CInt = 3

public val AF_ISO: CInt = 7

public val AF_LAT: CInt = 14

public val AF_LINK: CInt = 18

public val AF_OSI: CInt = 7

public val AF_PUP: CInt = 4

public val ALT_DIGITS: NlItem = 50

public val AM_STR: NlItem = 6

public val B76800: SpeedT = 76800u

public val BIOCFLUSH: CInt = 17000

public val BIOCGBLEN: CInt = 1074020966

public val BIOCGDLT: CInt = 1074020970

public val BIOCGHDRCMPLT: CInt = 1074020980

public val BIOCGRTIMEOUT: CInt = 1074807406

public val BIOCIMMEDIATE: CInt = -2147204496

public val BIOCPROMISC: CInt = 17001

public val BIOCSBLEN: CInt = -1073462682

public val BIOCSETF: CInt = -2146418073

public val BIOCSHDRCMPLT: CInt = -2147204491

public val BIOCSRTIMEOUT: CInt = -2146418067

public val BIOCVERSION: CInt = 1074020977

public val BPF_ALIGNMENT: Int = 8

public val CHAR_BIT: Int = 8

public val CODESET: NlItem = 1

public val CRNCYSTR: NlItem = 55

public val D_FLAG_FILTER: CInt = 0x00000001

public val D_FLAG_STAT: CInt = 0x00000002

public val D_FLAG_STAT_FORM_MASK: CInt = 0x000000f0

public val D_FLAG_STAT_FORM_T32_2001: CInt = 0x00000010

public val D_FLAG_STAT_FORM_T32_2008: CInt = 0x00000020

public val D_FLAG_STAT_FORM_T64_2008: CInt = 0x00000030

public val D_FLAG_STAT_FORM_UNSET: CInt = 0x00000000

public val D_FMT: NlItem = 3

public val D_GETFLAG: CInt = 1

public val D_SETFLAG: CInt = 2

public val D_T_FMT: NlItem = 2

public val ERA: NlItem = 46

public val ERA_D_FMT: NlItem = 47

public val ERA_D_T_FMT: NlItem = 48

public val ERA_T_FMT: NlItem = 49

public val RADIXCHAR: NlItem = 51

public val THOUSEP: NlItem = 52

public val YESEXPR: NlItem = 53

public val NOEXPR: NlItem = 54

public val F_GETOWN: CInt = 35

public val FIONBIO: CInt = -2147195266

public val FIOASYNC: CInt = -2147195267

public val FIOCLEX: CInt = 26113

public val FIOGETOWN: CInt = 1074030203

public val FIONCLEX: CInt = 26114

public val FIONREAD: CInt = 1074030207

public val FIOSETOWN: CInt = -2147195268

public val F_SETOWN: CInt = 36

public val IFF_LINK0: CInt = 0x00001000

public val IFF_LINK1: CInt = 0x00002000

public val IFF_LINK2: CInt = 0x00004000

public val IFF_OACTIVE: CInt = 0x00000400

public val IFF_SIMPLEX: CInt = 0x00000800

public val IHFLOW: TcflagT = 0x00000001u

public val IIDLE: TcflagT = 0x00000008u

public val IP_RECVDSTADDR: CInt = 7

public val IP_RECVIF: CInt = 20

public val IPTOS_ECN_NOTECT: UByte = 0x00u

public val IUCLC: TcflagT = 0x00000200u

public val IUTF8: TcflagT = 0x0004000u

public val KERN_ARGMAX: CInt = 8

public val KERN_BOOTTIME: CInt = 21

public val KERN_CLOCKRATE: CInt = 12

public val KERN_FILE: CInt = 15

public val KERN_HOSTID: CInt = 11

public val KERN_HOSTNAME: CInt = 10

public val KERN_JOB_CONTROL: CInt = 19

public val KERN_MAXFILES: CInt = 7

public val KERN_MAXPROC: CInt = 6

public val KERN_MAXVNODES: CInt = 5

public val KERN_NGROUPS: CInt = 18

public val KERN_OSRELEASE: CInt = 2

public val KERN_OSREV: CInt = 3

public val KERN_OSTYPE: CInt = 1

public val KERN_POSIX1: CInt = 17

public val KERN_PROC: CInt = 14

public val KERN_PROC_ALL: CInt = 0

public val KERN_PROC_PGRP: CInt = 2

public val KERN_PROC_PID: CInt = 1

public val KERN_PROC_RUID: CInt = 6

public val KERN_PROC_SESSION: CInt = 3

public val KERN_PROC_TTY: CInt = 4

public val KERN_PROC_UID: CInt = 5

public val KERN_PROF: CInt = 16

public val KERN_SAVED_IDS: CInt = 20

public val KERN_SECURELVL: CInt = 9

public val KERN_VERSION: CInt = 4

public val KERN_VNODE: CInt = 13

public val LC_ALL: CInt = 63

public val LC_COLLATE: CInt = 1

public val LC_CTYPE: CInt = 2

public val LC_MESSAGES: CInt = 32

public val LC_MONETARY: CInt = 4

public val LC_NUMERIC: CInt = 8

public val LC_TIME: CInt = 16

public val MAP_STACK: CInt = 0x00001000

public val MNT_NOEXEC: CInt = 0x02

public val MNT_NOSUID: CInt = 0x04

public val MNT_RDONLY: CInt = 0x01

public val NET_RT_DUMP: CInt = 1

public val NET_RT_FLAGS: CInt = 2

public val OHFLOW: TcflagT = 0x00000002u

public val P_ALL: IdtypeT = 0u

public val PARSTK: TcflagT = 0x00000004u

public val PF_CCITT: CInt = 10

public val PF_CHAOS: CInt = 5

public val PF_CNT: CInt = 21

public val PF_COIP: CInt = 20

public val PF_DATAKIT: CInt = 9

public val PF_DE_CNET: CInt = 12

public val PF_DLI: CInt = 13

public val PF_ECMA: CInt = 8

public val PF_HYLINK: CInt = 15

public val PF_IMPLINK: CInt = 3

public val PF_ISO: CInt = 7

public val PF_LAT: CInt = 14

public val PF_LINK: CInt = 18

public val PF_OSI: CInt = 7

public val PF_PIP: CInt = 25

public val PF_PUP: CInt = 4

public val PF_RTIP: CInt = 22

public val PF_XTP: CInt = 19

public val PM_STR: NlItem = 7

public val POSIX_MADV_DONTNEED: CInt = 4

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 2

public val POSIX_MADV_SEQUENTIAL: CInt = 1

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_VDISABLE: CInt = 0

public val P_PGID: IdtypeT = 2u

public val P_PID: IdtypeT = 1u

public val PRIO_PGRP: CInt = 1

public val PRIO_PROCESS: CInt = 0

public val PRIO_USER: CInt = 2

public val PSEUDO_AF_PIP: CInt = 25

public val PSEUDO_AF_RTIP: CInt = 22

public val PSEUDO_AF_XTP: CInt = 19

public val REG_ASSERT: CInt = 15

public val REG_ATOI: CInt = 255

public val REG_BACKR: CInt = 0x400

public val REG_BASIC: CInt = 0x00

public val REG_DUMP: CInt = 0x80

public val REG_EMPTY: CInt = 14

public val REG_INVARG: CInt = 16

public val REG_ITOA: CInt = 256

public val REG_LARGE: CInt = 0x200

public val REG_NOSPEC: CInt = 0x10

public val REG_OK: CInt = 0

public val REG_PEND: CInt = 0x20

public val REG_TRACE: CInt = 0x100

public val RLIMIT_AS: CInt = 6

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_MEMLOCK: CInt = 7

public val RLIMIT_NOFILE: CInt = 5

public val RLIMIT_NPROC: CInt = 8

public val RLIMIT_RSS: CInt = 6

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_VMEM: CInt = 6

public val RLIM_NLIMITS: CInt = 14

public val SCHED_ADJTOHEAD: CInt = 5

public val SCHED_ADJTOTAIL: CInt = 6

public val SCHED_MAXPOLICY: CInt = 7

public val SCHED_SETPRIO: CInt = 7

public val SCHED_SPORADIC: CInt = 4

public val SHM_ANON: COpaquePointer? = COpaquePointer((-1).toLong())

public val SIGCLD: CInt = SIGCHLD

public val SIGDEADLK: CInt = 7

public val SIGEMT: CInt = 7

public val SIGEV_NONE: CInt = 0

public val SIGEV_SIGNAL: CInt = 129

public val SIGEV_THREAD: CInt = 135

public val SO_USELOOPBACK: CInt = 0x0040

public val SS_ALIGNSIZE: Int = 8

public val SS_MAXSIZE: Int = 128

public val SS_PAD1SIZE: Int = SS_ALIGNSIZE - 2

public val SS_PAD2SIZE: Int = SS_MAXSIZE - 2 - SS_PAD1SIZE - SS_ALIGNSIZE

public val TC_CPOSIX: TcflagT = CLOCAL or CREAD or CSIZE or CSTOPB or HUPCL or PARENB or PARODD

public val TCGETS: CInt = 0x404c540d

public val TC_IPOSIX: TcflagT = BRKINT or ICRNL or IGNBRK or IGNPAR or INLCR or INPCK or ISTRIP or IXOFF or IXON or PARMRK

public val TC_LPOSIX: TcflagT = ECHO or ECHOE or ECHOK or ECHONL or ICANON or IEXTEN or ISIG or NOFLSH or TOSTOP

public val TC_OPOSIX: TcflagT = OPOST

public val T_FMT_AMPM: NlItem = 5

public val TIOCCBRK: CInt = 29818

public val TIOCCDTR: CInt = 29816

public val TIOCDRAIN: CInt = 29790

public val TIOCEXCL: CInt = 29709

public val TIOCFLUSH: CInt = -2147191792

public val TIOCGETA: CInt = 1078752275

public val TIOCGPGRP: CInt = 1074033783

public val TIOCGWINSZ: CInt = 1074295912

public val TIOCMBIC: CInt = -2147191701

public val TIOCMBIS: CInt = -2147191700

public val TIOCMGET: CInt = 1074033770

public val TIOCMSET: CInt = -2147191699

public val TIOCNOTTY: CInt = 29809

public val TIOCNXCL: CInt = 29710

public val TIOCOUTQ: CInt = 1074033779

public val TIOCPKT: CInt = -2147191696

public val TIOCPKT_DATA: CInt = 0x00

public val TIOCPKT_DOSTOP: CInt = 0x20

public val TIOCPKT_FLUSHREAD: CInt = 0x01

public val TIOCPKT_FLUSHWRITE: CInt = 0x02

public val TIOCPKT_IOCTL: CInt = 0x40

public val TIOCPKT_NOSTOP: CInt = 0x10

public val TIOCPKT_START: CInt = 0x08

public val TIOCPKT_STOP: CInt = 0x04

public val TIOCSBRK: CInt = 29819

public val TIOCSCTTY: CInt = 29793

public val TIOCSDTR: CInt = 29817

public val TIOCSETA: CInt = -2142473196

public val TIOCSETAF: CInt = -2142473194

public val TIOCSETAW: CInt = -2142473195

public val TIOCSPGRP: CInt = -2147191690

public val TIOCSTART: CInt = 29806

public val TIOCSTI: CInt = -2147388302

public val TIOCSTOP: CInt = 29807

public val TIOCSWINSZ: CInt = -2146929561

public val USER_CS_PATH: CInt = 1

public val USER_BC_BASE_MAX: CInt = 2

public val USER_BC_DIM_MAX: CInt = 3

public val USER_BC_SCALE_MAX: CInt = 4

public val USER_BC_STRING_MAX: CInt = 5

public val USER_COLL_WEIGHTS_MAX: CInt = 6

public val USER_EXPR_NEST_MAX: CInt = 7

public val USER_LINE_MAX: CInt = 8

public val USER_RE_DUP_MAX: CInt = 9

public val USER_POSIX2_VERSION: CInt = 10

public val USER_POSIX2_C_BIND: CInt = 11

public val USER_POSIX2_C_DEV: CInt = 12

public val USER_POSIX2_CHAR_TERM: CInt = 13

public val USER_POSIX2_FORT_DEV: CInt = 14

public val USER_POSIX2_FORT_RUN: CInt = 15

public val USER_POSIX2_LOCALEDEF: CInt = 16

public val USER_POSIX2_SW_DEV: CInt = 17

public val USER_POSIX2_UPE: CInt = 18

public val USER_STREAM_MAX: CInt = 19

public val USER_TZNAME_MAX: CInt = 20

public val VDOWN: Int = 31

public val VINS: Int = 32

public val VDEL: Int = 33

public val VRUB: Int = 34

public val VCAN: Int = 35

public val VHOME: Int = 36

public val VEND: Int = 37

public val VSPARE3: Int = 38

public val VSPARE4: Int = 39

public val VSWTCH: Int = 7

public val VDSUSP: Int = 11

public val VFWD: Int = 18

public val VLOGIN: Int = 19

public val VPREFIX: Int = 20

public val VSUFFIX: Int = 24

public val VLEFT: Int = 28

public val VRIGHT: Int = 29

public val VUP: Int = 30

public val XCASE: TcflagT = 0x00000004u

public val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1

public val PTHREAD_CREATE_JOINABLE: CInt = 0x00

public val PTHREAD_CREATE_DETACHED: CInt = 0x01

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 1

public val PTHREAD_MUTEX_RECURSIVE: CInt = 2

public val PTHREAD_MUTEX_NORMAL: CInt = 3

public val PTHREAD_STACK_MIN: SizeT = 256uL

public val PTHREAD_MUTEX_DEFAULT: CInt = 0

public val PTHREAD_MUTEX_STALLED: CInt = 0x00

public val PTHREAD_MUTEX_ROBUST: CInt = 0x10

public val PTHREAD_PROCESS_PRIVATE: CInt = 0x00

public val PTHREAD_PROCESS_SHARED: CInt = 0x01

public val PTHREAD_KEYS_MAX: Int = 128

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(u = 0x80000000u, owner = 0xffffffffu)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(u = CLOCK_REALTIME.toUInt(), owner = 0xfffffffbu)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(active = 0, blockedwriters = 0, blockedreaders = 0, heavy = 0, lock = PTHREAD_MUTEX_INITIALIZER, rcond = PTHREAD_COND_INITIALIZER, wcond = PTHREAD_COND_INITIALIZER, owner = (-2).toUInt(), spare = 0u)
