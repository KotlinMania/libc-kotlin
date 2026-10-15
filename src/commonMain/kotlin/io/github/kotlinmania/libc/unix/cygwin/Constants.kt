// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public const val FD_SETSIZE: ULong = 1024uL

public const val CPU_SETSIZE: Int = 0x400

public const val BUS_ADRALN: Int = 25

public const val BUS_ADRERR: Int = 26

public const val BUS_OBJERR: Int = 27

public const val CLD_EXITED: Int = 28

public const val CLD_KILLED: Int = 29

public const val CLD_DUMPED: Int = 30

public const val CLD_TRAPPED: Int = 31

public const val CLD_STOPPED: Int = 32

public const val CLD_CONTINUED: Int = 33

public const val SIGEV_SIGNAL: Int = 0

public const val SIGEV_NONE: Int = 1

public const val SIGEV_THREAD: Int = 2

public const val SA_NOCLDSTOP: Int = 0x00000001

public const val SA_NOCLDWAIT: Int = 0

public const val SA_SIGINFO: Int = 0x00000002

public const val SA_RESTART: Int = 0x10000000

public const val SA_ONSTACK: Int = 0x20000000

public const val SA_NODEFER: Int = 0x40000000

public const val SA_RESETHAND: Int = 0x80000000.toInt()

public const val MINSIGSTKSZ: ULong = 8192uL

public const val SIGSTKSZ: ULong = 32768uL

public const val SIGHUP: Int = 1

public const val SIGINT: Int = 2

public const val SIGQUIT: Int = 3

public const val SIGILL: Int = 4

public const val SIGTRAP: Int = 5

public const val SIGABRT: Int = 6

public const val SIGEMT: Int = 7

public const val SIGFPE: Int = 8

public const val SIGKILL: Int = 9

public const val SIGBUS: Int = 10

public const val SIGSEGV: Int = 11

public const val SIGSYS: Int = 12

public const val SIGPIPE: Int = 13

public const val SIGALRM: Int = 14

public const val SIGTERM: Int = 15

public const val SIGURG: Int = 16

public const val SIGSTOP: Int = 17

public const val SIGTSTP: Int = 18

public const val SIGCONT: Int = 19

public const val SIGCHLD: Int = 20

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGIO: Int = 23

public const val SIGPOLL: Int = 23

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGPWR: Int = 29

public const val SIGUSR1: Int = 30

public const val SIGUSR2: Int = 31

public const val SS_ONSTACK: Int = 0x1

public const val SS_DISABLE: Int = 0x2

public const val SIG_SETMASK: Int = 0

public const val SIG_BLOCK: Int = 1

public const val SIG_UNBLOCK: Int = 2

public const val TIMER_ABSTIME: Int = 4

public const val CLOCK_REALTIME_COARSE: ULong = 0uL

public const val CLOCK_REALTIME: ULong = 1uL

public const val CLOCK_PROCESS_CPUTIME_ID: ULong = 2uL

public const val CLOCK_THREAD_CPUTIME_ID: ULong = 3uL

public const val CLOCK_MONOTONIC: ULong = 4uL

public const val CLOCK_MONOTONIC_RAW: ULong = 5uL

public const val CLOCK_MONOTONIC_COARSE: ULong = 6uL

public const val CLOCK_BOOTTIME: ULong = 7uL

public const val CLOCK_REALTIME_ALARM: ULong = 8uL

public const val CLOCK_BOOTTIME_ALARM: ULong = 9uL

public const val ITIMER_REAL: Int = 0

public const val ITIMER_VIRTUAL: Int = 1

public const val ITIMER_PROF: Int = 2

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val RLIMIT_CPU: Int = 0

public const val RLIMIT_FSIZE: Int = 1

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_STACK: Int = 3

public const val RLIMIT_CORE: Int = 4

public const val RLIMIT_NOFILE: Int = 5

public const val RLIMIT_AS: Int = 6

public const val RLIM_NLIMITS: Int = 7

public const val RLIMIT_NLIMITS: Int = RLIM_NLIMITS

public val RLIM_INFINITY: ULong = 0uL.inv()

public val RLIM_SAVED_MAX: ULong = RLIM_INFINITY

public val RLIM_SAVED_CUR: ULong = RLIM_INFINITY

public const val RUSAGE_SELF: Int = 0

public const val RUSAGE_CHILDREN: Int = -1

public const val IFF_UP: Int = 0x1

public const val IFF_BROADCAST: Int = 0x2

public const val IFF_LOOPBACK: Int = 0x8

public const val IFF_POINTOPOINT: Int = 0x10

public const val IFF_NOTRAILERS: Int = 0x20

public const val IFF_RUNNING: Int = 0x40

public const val IFF_NOARP: Int = 0x80

public const val IFF_PROMISC: Int = 0x100

public const val IFF_MULTICAST: Int = 0x1000

public const val IFF_LOWER_UP: Int = 0x10000

public const val IFF_DORMANT: Int = 0x20000

public const val IF_NAMESIZE: ULong = 44uL

public const val IFNAMSIZ: ULong = IF_NAMESIZE

public const val FIONREAD: Int = 0x4008667f

public const val FIONBIO: Int = 0x8004667e.toInt()

public const val FIOASYNC: Int = 0x8008667d.toInt()

public const val FIOCLEX: Int = 0

public const val SIOCGIFCONF: ULong = 0x80107364uL

public const val SIOCGIFFLAGS: ULong = 0x80507365uL

public const val SIOCGIFADDR: ULong = 0x80507366uL

public const val SIOCGIFBRDADDR: ULong = 0x80507367uL

public const val SIOCGIFNETMASK: ULong = 0x80507368uL

public const val SIOCGIFHWADDR: ULong = 0x80507369uL

public const val SIOCGIFMETRIC: ULong = 0x8050736auL

public const val SIOCGIFMTU: ULong = 0x8050736buL

public const val SIOCGIFINDEX: ULong = 0x8050736cuL

public const val SIOGIFINDEX: ULong = SIOCGIFINDEX

public const val SIOCGIFDSTADDR: ULong = 0x8050736euL

public const val SOL_SOCKET: Int = 0xffff

public const val SO_DEBUG: Int = 1

public const val SO_ACCEPTCONN: Int = 0x0002

public const val SO_REUSEADDR: Int = 0x0004

public const val SO_KEEPALIVE: Int = 0x0008

public const val SO_DONTROUTE: Int = 0x0010

public const val SO_BROADCAST: Int = 0x0020

public const val SO_USELOOPBACK: Int = 0x0040

public const val SO_LINGER: Int = 0x0080

public const val SO_OOBINLINE: Int = 0x0100

public const val SO_PEERCRED: Int = 0x0200

public const val SO_PASSCRED: Int = 0x0400

public const val SO_SNDBUF: Int = 0x1001

public const val SO_RCVBUF: Int = 0x1002

public const val SO_SNDLOWAT: Int = 0x1003

public const val SO_RCVLOWAT: Int = 0x1004

public const val SO_SNDTIMEO: Int = 0x1005

public const val SO_RCVTIMEO: Int = 0x1006

public const val SO_ERROR: Int = 0x1007

public const val SO_TYPE: Int = 0x1008

public const val SCM_RIGHTS: Int = 0x01

public const val SCM_CREDENTIALS: Int = 0x02

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_RAW: Int = 3

public const val SOCK_RDM: Int = 4

public const val SOCK_SEQPACKET: Int = 5

public const val SOCK_NONBLOCK: Int = 0x01000000

public const val SOCK_CLOEXEC: Int = 0x02000000

public const val AF_UNSPEC: Int = 0

public const val AF_LOCAL: Int = 1

public const val AF_UNIX: Int = AF_LOCAL

public const val AF_INET: Int = 2

public const val AF_IMPLINK: Int = 3

public const val AF_PUP: Int = 4

public const val AF_CHAOS: Int = 5

public const val AF_NS: Int = 6

public const val AF_ISO: Int = 7

public const val AF_OSI: Int = AF_ISO

public const val AF_ECMA: Int = 8

public const val AF_DATAKIT: Int = 9

public const val AF_CCITT: Int = 10

public const val AF_SNA: Int = 11

public const val AF_DECnet: Int = 12

public const val AF_DLI: Int = 13

public const val AF_LAT: Int = 14

public const val AF_HYLINK: Int = 15

public const val AF_APPLETALK: Int = 16

public const val AF_NETBIOS: Int = 17

public const val AF_INET6: Int = 23

public const val PF_UNSPEC: Int = AF_UNSPEC

public const val PF_LOCAL: Int = AF_LOCAL

public const val PF_UNIX: Int = PF_LOCAL

public const val PF_INET: Int = AF_INET

public const val PF_IMPLINK: Int = AF_IMPLINK

public const val PF_PUP: Int = AF_PUP

public const val PF_CHAOS: Int = AF_CHAOS

public const val PF_NS: Int = AF_NS

public const val PF_ISO: Int = AF_ISO

public const val PF_OSI: Int = AF_ISO

public const val PF_DATAKIT: Int = AF_DATAKIT

public const val PF_CCITT: Int = AF_CCITT

public const val PF_SNA: Int = AF_SNA

public const val PF_DECnet: Int = AF_DECnet

public const val PF_DLI: Int = AF_DLI

public const val PF_LAT: Int = AF_LAT

public const val PF_HYLINK: Int = AF_HYLINK

public const val PF_APPLETALK: Int = AF_APPLETALK

public const val PF_NETBIOS: Int = AF_NETBIOS

public const val PF_INET6: Int = AF_INET6

public const val SOMAXCONN: Int = 0x7fffffff

public const val MSG_OOB: Int = 0x1

public const val MSG_PEEK: Int = 0x2

public const val MSG_DONTROUTE: Int = 0x4

public const val MSG_WAITALL: Int = 0x8

public const val MSG_DONTWAIT: Int = 0x10

public const val MSG_NOSIGNAL: Int = 0x20

public const val MSG_TRUNC: Int = 0x0100

public const val MSG_CTRUNC: Int = 0x0200

public const val MSG_BCAST: Int = 0x0400

public const val MSG_MCAST: Int = 0x0800

public const val MSG_CMSG_CLOEXEC: Int = 0x1000

public const val MSG_EOR: Int = 0x8000

public const val SOL_IP: Int = 0

public const val SOL_IPV6: Int = 41

public const val SOL_TCP: Int = 6

public const val SOL_UDP: Int = 17

public val IPTOS_LOWDELAY: UByte = (0x10).toUByte()

public val IPTOS_THROUGHPUT: UByte = (0x08).toUByte()

public val IPTOS_RELIABILITY: UByte = (0x04).toUByte()

public val IPTOS_LOWCOST: UByte = (0x02).toUByte()

public val IPTOS_MINCOST: UByte = IPTOS_LOWCOST

public const val IP_DEFAULT_MULTICAST_TTL: Int = 1

public const val IP_DEFAULT_MULTICAST_LOOP: Int = 1

public const val IP_OPTIONS: Int = 1

public const val IP_HDRINCL: Int = 2

public const val IP_TOS: Int = 3

public const val IP_TTL: Int = 4

public const val IP_MULTICAST_IF: Int = 9

public const val IP_MULTICAST_TTL: Int = 10

public const val IP_MULTICAST_LOOP: Int = 11

public const val IP_ADD_MEMBERSHIP: Int = 12

public const val IP_DROP_MEMBERSHIP: Int = 13

public const val IP_ADD_SOURCE_MEMBERSHIP: Int = 15

public const val IP_DROP_SOURCE_MEMBERSHIP: Int = 16

public const val IP_BLOCK_SOURCE: Int = 17

public const val IP_UNBLOCK_SOURCE: Int = 18

public const val IP_PKTINFO: Int = 19

public const val IP_RECVTTL: Int = 21

public const val IP_UNICAST_IF: Int = 31

public const val IP_RECVTOS: Int = 40

public const val IP_MTU_DISCOVER: Int = 71

public const val IP_MTU: Int = 73

public const val IP_RECVERR: Int = 75

public const val IP_PMTUDISC_WANT: Int = 0

public const val IP_PMTUDISC_DO: Int = 1

public const val IP_PMTUDISC_DONT: Int = 2

public const val IP_PMTUDISC_PROBE: Int = 3

public const val IPV6_HOPOPTS: Int = 1

public const val IPV6_HDRINCL: Int = 2

public const val IPV6_UNICAST_HOPS: Int = 4

public const val IPV6_MULTICAST_IF: Int = 9

public const val IPV6_MULTICAST_HOPS: Int = 10

public const val IPV6_MULTICAST_LOOP: Int = 11

public const val IPV6_ADD_MEMBERSHIP: Int = 12

public const val IPV6_DROP_MEMBERSHIP: Int = 13

public const val IPV6_JOIN_GROUP: Int = 12

public const val IPV6_LEAVE_GROUP: Int = 13

public const val IPV6_DONTFRAG: Int = 14

public const val IPV6_PKTINFO: Int = 19

public const val IPV6_HOPLIMIT: Int = 21

public const val IPV6_CHECKSUM: Int = 26

public const val IPV6_V6ONLY: Int = 27

public const val IPV6_UNICAST_IF: Int = 31

public const val IPV6_RTHDR: Int = 32

public const val IPV6_RECVRTHDR: Int = 38

public const val IPV6_TCLASS: Int = 39

public const val IPV6_RECVTCLASS: Int = 40

public const val IPV6_MTU_DISCOVER: Int = 71

public const val IPV6_MTU: Int = 72

public const val IPV6_RECVERR: Int = 75

public const val IPV6_PMTUDISC_WANT: Int = 0

public const val IPV6_PMTUDISC_DO: Int = 1

public const val IPV6_PMTUDISC_DONT: Int = 2

public const val IPV6_PMTUDISC_PROBE: Int = 3

public const val MCAST_JOIN_GROUP: Int = 41

public const val MCAST_LEAVE_GROUP: Int = 42

public const val MCAST_BLOCK_SOURCE: Int = 43

public const val MCAST_UNBLOCK_SOURCE: Int = 44

public const val MCAST_JOIN_SOURCE_GROUP: Int = 45

public const val MCAST_LEAVE_SOURCE_GROUP: Int = 46

public const val MCAST_INCLUDE: Int = 0

public const val MCAST_EXCLUDE: Int = 1

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val S_BLKSIZE: UInt = 1024u

public const val S_IREAD: UInt = 256u

public const val S_IWRITE: UInt = 128u

public const val S_IEXEC: UInt = 64u

public const val S_ENFMT: UInt = 1024u

public const val S_IFMT: UInt = 61440u

public const val S_IFDIR: UInt = 16384u

public const val S_IFCHR: UInt = 8192u

public const val S_IFBLK: UInt = 24576u

public const val S_IFREG: UInt = 32768u

public const val S_IFLNK: UInt = 40960u

public const val S_IFSOCK: UInt = 49152u

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

public const val UTIME_NOW: Long = -2

public const val UTIME_OMIT: Long = -1

public const val ARG_MAX: Int = 32000

public const val CHILD_MAX: Int = 256

public const val IOV_MAX: Int = 1024

public const val PTHREAD_STACK_MIN: ULong = 65536uL

public const val PATH_MAX: Int = 4096

public const val PIPE_BUF: ULong = 4096uL

public const val NGROUPS_MAX: Int = 1024

public const val FILENAME_MAX: Int = 4096

public const val FORK_RELOAD: Int = 1

public const val FORK_NO_RELOAD: Int = 0

public const val RTLD_LOCAL: Int = 0

public const val RTLD_LAZY: Int = 1

public const val RTLD_NOW: Int = 2

public const val RTLD_GLOBAL: Int = 4

public const val RTLD_NODELETE: Int = 8

public const val RTLD_NOLOAD: Int = 16

public const val RTLD_DEEPBIND: Int = 32

public const val IPPROTO_HOPOPTS: Int = 0

public const val IPPROTO_IGMP: Int = 2

public const val IPPROTO_IPIP: Int = 4

public const val IPPROTO_EGP: Int = 8

public const val IPPROTO_PUP: Int = 12

public const val IPPROTO_IDP: Int = 22

public const val IPPROTO_ROUTING: Int = 43

public const val IPPROTO_FRAGMENT: Int = 44

public const val IPPROTO_ESP: Int = 50

public const val IPPROTO_AH: Int = 51

public const val IPPROTO_NONE: Int = 59

public const val IPPROTO_DSTOPTS: Int = 60

public const val IPPROTO_RAW: Int = 255

public const val IPPROTO_MAX: Int = 256

public const val AI_PASSIVE: Int = 0x1

public const val AI_CANONNAME: Int = 0x2

public const val AI_NUMERICHOST: Int = 0x4

public const val AI_NUMERICSERV: Int = 0x8

public const val AI_ALL: Int = 0x100

public const val AI_ADDRCONFIG: Int = 0x400

public const val AI_V4MAPPED: Int = 0x800

public const val NI_NOFQDN: Int = 0x1

public const val NI_NUMERICHOST: Int = 0x2

public const val NI_NAMEREQD: Int = 0x4

public const val NI_NUMERICSERV: Int = 0x8

public const val NI_DGRAM: Int = 0x10

public const val NI_MAXHOST: Int = 1025

public const val NI_MAXSERV: Int = 32

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

public const val EAI_OVERFLOW: Int = 14

public const val UT_LINESIZE: ULong = 16uL

public const val UT_NAMESIZE: ULong = 16uL

public const val UT_HOSTSIZE: ULong = 256uL

public const val UT_IDLEN: ULong = 2uL

public const val RUN_LVL: Short = 1

public const val BOOT_TIME: Short = 2

public const val NEW_TIME: Short = 3

public const val OLD_TIME: Short = 4

public const val INIT_PROCESS: Short = 5

public const val LOGIN_PROCESS: Short = 6

public const val USER_PROCESS: Short = 7

public const val DEAD_PROCESS: Short = 8

public const val POLLIN: Short = 0x1

public const val POLLPRI: Short = 0x2

public const val POLLOUT: Short = 0x4

public const val POLLERR: Short = 0x8

public const val POLLHUP: Short = 0x10

public const val POLLNVAL: Short = 0x20

public const val POLLRDNORM: Short = 0x1

public const val POLLRDBAND: Short = 0x2

public const val POLLWRNORM: Short = 0x4

public const val POLLWRBAND: Short = 0x4

public const val LC_ALL: Int = 0

public const val LC_COLLATE: Int = 1

public const val LC_CTYPE: Int = 2

public const val LC_MONETARY: Int = 3

public const val LC_NUMERIC: Int = 4

public const val LC_TIME: Int = 5

public const val LC_MESSAGES: Int = 6

public val LC_ALL_MASK: Int = 1 shl 0

public val LC_COLLATE_MASK: Int = 1 shl 1

public val LC_CTYPE_MASK: Int = 1 shl 2

public val LC_MONETARY_MASK: Int = 1 shl 3

public val LC_NUMERIC_MASK: Int = 1 shl 4

public val LC_TIME_MASK: Int = 1 shl 5

public val LC_MESSAGES_MASK: Int = 1 shl 6

public val LC_GLOBAL_LOCALE: io.github.kotlinmania.libc.COpaquePointer? = LC_GLOBAL_LOCALE_SENTINEL

public const val ST_RDONLY: ULong = 0x80000uL

public const val ST_NOSUID: ULong = 0uL

public const val TIOCMGET: Int = 0x5415

public const val TIOCMBIS: Int = 0x5416

public const val TIOCMBIC: Int = 0x5417

public const val TIOCMSET: Int = 0x5418

public const val TIOCINQ: Int = 0x541B

public const val TIOCSCTTY: Int = 0x540E

public const val TIOCSBRK: Int = 0x5427

public const val TIOCCBRK: Int = 0x5428

public const val TIOCM_DTR: Int = 0x002

public const val TIOCM_RTS: Int = 0x004

public const val TIOCM_CTS: Int = 0x020

public const val TIOCM_CAR: Int = 0x040

public const val TIOCM_RNG: Int = 0x080

public const val TIOCM_CD: Int = TIOCM_CAR

public const val TIOCM_RI: Int = TIOCM_RNG

public const val TCOOFF: Int = 0

public const val TCOON: Int = 1

public const val TCIOFF: Int = 2

public const val TCION: Int = 3

public const val TCGETA: Int = 5

public const val TCSETA: Int = 6

public const val TCSETAW: Int = 7

public const val TCSETAF: Int = 8

public const val TCIFLUSH: Int = 0

public const val TCOFLUSH: Int = 1

public const val TCIOFLUSH: Int = 2

public const val TCFLSH: Int = 3

public const val TCSAFLUSH: Int = 1

public const val TCSANOW: Int = 2

public const val TCSADRAIN: Int = 3

public const val TIOCPKT: Int = 6

public const val TIOCPKT_DATA: Int = 0x0

public const val TIOCPKT_FLUSHREAD: Int = 0x1

public const val TIOCPKT_FLUSHWRITE: Int = 0x2

public const val TIOCPKT_STOP: Int = 0x4

public const val TIOCPKT_START: Int = 0x8

public const val TIOCPKT_NOSTOP: Int = 0x10

public const val TIOCPKT_DOSTOP: Int = 0x20

public const val IGNBRK: UInt = 0x00001u

public const val BRKINT: UInt = 0x00002u

public const val IGNPAR: UInt = 0x00004u

public const val IMAXBEL: UInt = 0x00008u

public const val INPCK: UInt = 0x00010u

public const val ISTRIP: UInt = 0x00020u

public const val INLCR: UInt = 0x00040u

public const val IGNCR: UInt = 0x00080u

public const val ICRNL: UInt = 0x00100u

public const val IXON: UInt = 0x00400u

public const val IXOFF: UInt = 0x01000u

public const val IUCLC: UInt = 0x04000u

public const val IXANY: UInt = 0x08000u

public const val PARMRK: UInt = 0x10000u

public const val IUTF8: UInt = 0x20000u

public const val OPOST: UInt = 0x00001u

public const val OLCUC: UInt = 0x00002u

public const val OCRNL: UInt = 0x00004u

public const val ONLCR: UInt = 0x00008u

public const val ONOCR: UInt = 0x00010u

public const val ONLRET: UInt = 0x00020u

public const val OFILL: UInt = 0x00040u

public const val CRDLY: UInt = 0x00180u

public const val CR0: UInt = 0x00000u

public const val CR1: UInt = 0x00080u

public const val CR2: UInt = 0x00100u

public const val CR3: UInt = 0x00180u

public const val NLDLY: UInt = 0x00200u

public const val NL0: UInt = 0x00000u

public const val NL1: UInt = 0x00200u

public const val BSDLY: UInt = 0x00400u

public const val BS0: UInt = 0x00000u

public const val BS1: UInt = 0x00400u

public const val TABDLY: UInt = 0x01800u

public const val TAB0: UInt = 0x00000u

public const val TAB1: UInt = 0x00800u

public const val TAB2: UInt = 0x01000u

public const val TAB3: UInt = 0x01800u

public const val XTABS: UInt = 0x01800u

public const val VTDLY: UInt = 0x02000u

public const val VT0: UInt = 0x00000u

public const val VT1: UInt = 0x02000u

public const val FFDLY: UInt = 0x04000u

public const val FF0: UInt = 0x00000u

public const val FF1: UInt = 0x04000u

public const val OFDEL: UInt = 0x08000u

public const val CBAUD: UInt = 0x0100fu

public const val B0: UInt = 0x00000u

public const val B50: UInt = 0x00001u

public const val B75: UInt = 0x00002u

public const val B110: UInt = 0x00003u

public const val B134: UInt = 0x00004u

public const val B150: UInt = 0x00005u

public const val B200: UInt = 0x00006u

public const val B300: UInt = 0x00007u

public const val B600: UInt = 0x00008u

public const val B1200: UInt = 0x00009u

public const val B1800: UInt = 0x0000au

public const val B2400: UInt = 0x0000bu

public const val B4800: UInt = 0x0000cu

public const val B9600: UInt = 0x0000du

public const val B19200: UInt = 0x0000eu

public const val B38400: UInt = 0x0000fu

public const val CSIZE: UInt = 0x00030u

public const val CS5: UInt = 0x00000u

public const val CS6: UInt = 0x00010u

public const val CS7: UInt = 0x00020u

public const val CS8: UInt = 0x00030u

public const val CSTOPB: UInt = 0x00040u

public const val CREAD: UInt = 0x00080u

public const val PARENB: UInt = 0x00100u

public const val PARODD: UInt = 0x00200u

public const val HUPCL: UInt = 0x00400u

public const val CLOCAL: UInt = 0x00800u

public const val CBAUDEX: UInt = 0x0100fu

public const val B57600: UInt = 0x01001u

public const val B115200: UInt = 0x01002u

public const val B230400: UInt = 0x01004u

public const val B460800: UInt = 0x01006u

public const val B500000: UInt = 0x01007u

public const val B576000: UInt = 0x01008u

public const val B921600: UInt = 0x01009u

public const val B1000000: UInt = 0x0100au

public const val B1152000: UInt = 0x0100bu

public const val B1500000: UInt = 0x0100cu

public const val B2000000: UInt = 0x0100du

public const val B2500000: UInt = 0x0100eu

public const val B3000000: UInt = 0x0100fu

public const val CRTSCTS: UInt = 0x08000u

public const val CMSPAR: UInt = 0x40000000u

public const val ISIG: UInt = 0x0001u

public const val ICANON: UInt = 0x0002u

public const val ECHO: UInt = 0x0004u

public const val ECHOE: UInt = 0x0008u

public const val ECHOK: UInt = 0x0010u

public const val ECHONL: UInt = 0x0020u

public const val NOFLSH: UInt = 0x0040u

public const val TOSTOP: UInt = 0x0080u

public const val IEXTEN: UInt = 0x0100u

public const val FLUSHO: UInt = 0x0200u

public const val ECHOKE: UInt = 0x0400u

public const val ECHOCTL: UInt = 0x0800u

public const val VDISCARD: ULong = 1uL

public const val VEOL: ULong = 2uL

public const val VEOL2: ULong = 3uL

public const val VEOF: ULong = 4uL

public const val VERASE: ULong = 5uL

public const val VINTR: ULong = 6uL

public const val VKILL: ULong = 7uL

public const val VLNEXT: ULong = 8uL

public const val VMIN: ULong = 9uL

public const val VQUIT: ULong = 10uL

public const val VREPRINT: ULong = 11uL

public const val VSTART: ULong = 12uL

public const val VSTOP: ULong = 13uL

public const val VSUSP: ULong = 14uL

public const val VSWTC: ULong = 15uL

public const val VTIME: ULong = 16uL

public const val VWERASE: ULong = 17uL

public const val NCCS: ULong = 18uL

public const val TIOCGWINSZ: Int = 0x5401

public const val TIOCSWINSZ: Int = 0x5402

public const val TIOCLINUX: Int = 0x5403

public const val TIOCGPGRP: Int = 0x540f

public const val TIOCSPGRP: Int = 0x5410

public const val WNOHANG: Int = 1

public const val WUNTRACED: Int = 2

public const val WCONTINUED: Int = 8

public const val EXIT_FAILURE: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val PROT_NONE: Int = 0

public const val PROT_READ: Int = 1

public const val PROT_WRITE: Int = 2

public const val PROT_EXEC: Int = 4

public const val MAP_FILE: Int = 0

public const val MAP_SHARED: Int = 1

public const val MAP_PRIVATE: Int = 2

public const val MAP_TYPE: Int = 0xf

public const val MAP_FIXED: Int = 0x10

public const val MAP_ANON: Int = 0x20

public const val MAP_ANONYMOUS: Int = MAP_ANON

public const val MAP_NORESERVE: Int = 0x4000

public const val MS_ASYNC: Int = 1

public const val MS_SYNC: Int = 2

public const val MS_INVALIDATE: Int = 4

public const val POSIX_MADV_NORMAL: Int = 0

public const val POSIX_MADV_SEQUENTIAL: Int = 1

public const val POSIX_MADV_RANDOM: Int = 2

public const val POSIX_MADV_WILLNEED: Int = 3

public const val POSIX_MADV_DONTNEED: Int = 4

public const val MADV_NORMAL: Int = 0

public const val MADV_SEQUENTIAL: Int = 1

public const val MADV_RANDOM: Int = 2

public const val MADV_WILLNEED: Int = 3

public const val MADV_DONTNEED: Int = 4

public const val F_ULOCK: Int = 0

public const val F_LOCK: Int = 1

public const val F_TLOCK: Int = 2

public const val F_TEST: Int = 3

public const val F_OK: Int = 0

public const val R_OK: Int = 4

public const val W_OK: Int = 2

public const val X_OK: Int = 1

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val _SC_ARG_MAX: Int = 0

public const val _SC_CHILD_MAX: Int = 1

public const val _SC_CLK_TCK: Int = 2

public const val _SC_NGROUPS_MAX: Int = 3

public const val _SC_OPEN_MAX: Int = 4

public const val _SC_JOB_CONTROL: Int = 5

public const val _SC_SAVED_IDS: Int = 6

public const val _SC_VERSION: Int = 7

public const val _SC_PAGESIZE: Int = 8

public const val _SC_PAGE_SIZE: Int = _SC_PAGESIZE

public const val _SC_NPROCESSORS_CONF: Int = 9

public const val _SC_NPROCESSORS_ONLN: Int = 10

public const val _SC_PHYS_PAGES: Int = 11

public const val _SC_AVPHYS_PAGES: Int = 12

public const val _SC_MQ_OPEN_MAX: Int = 13

public const val _SC_MQ_PRIO_MAX: Int = 14

public const val _SC_RTSIG_MAX: Int = 15

public const val _SC_SEM_NSEMS_MAX: Int = 16

public const val _SC_SEM_VALUE_MAX: Int = 17

public const val _SC_SIGQUEUE_MAX: Int = 18

public const val _SC_TIMER_MAX: Int = 19

public const val _SC_TZNAME_MAX: Int = 20

public const val _SC_ASYNCHRONOUS_IO: Int = 21

public const val _SC_FSYNC: Int = 22

public const val _SC_MAPPED_FILES: Int = 23

public const val _SC_MEMLOCK: Int = 24

public const val _SC_MEMLOCK_RANGE: Int = 25

public const val _SC_MEMORY_PROTECTION: Int = 26

public const val _SC_MESSAGE_PASSING: Int = 27

public const val _SC_PRIORITIZED_IO: Int = 28

public const val _SC_REALTIME_SIGNALS: Int = 29

public const val _SC_SEMAPHORES: Int = 30

public const val _SC_SHARED_MEMORY_OBJECTS: Int = 31

public const val _SC_SYNCHRONIZED_IO: Int = 32

public const val _SC_TIMERS: Int = 33

public const val _SC_AIO_LISTIO_MAX: Int = 34

public const val _SC_AIO_MAX: Int = 35

public const val _SC_AIO_PRIO_DELTA_MAX: Int = 36

public const val _SC_DELAYTIMER_MAX: Int = 37

public const val _SC_THREAD_KEYS_MAX: Int = 38

public const val _SC_THREAD_STACK_MIN: Int = 39

public const val _SC_THREAD_THREADS_MAX: Int = 40

public const val _SC_TTY_NAME_MAX: Int = 41

public const val _SC_THREADS: Int = 42

public const val _SC_THREAD_ATTR_STACKADDR: Int = 43

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 44

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 45

public const val _SC_THREAD_PRIO_INHERIT: Int = 46

public const val _SC_THREAD_PRIO_PROTECT: Int = 47

public const val _SC_THREAD_PRIO_CEILING: Int = _SC_THREAD_PRIO_PROTECT

public const val _SC_THREAD_PROCESS_SHARED: Int = 48

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 49

public const val _SC_GETGR_R_SIZE_MAX: Int = 50

public const val _SC_GETPW_R_SIZE_MAX: Int = 51

public const val _SC_LOGIN_NAME_MAX: Int = 52

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 53

public const val _SC_ADVISORY_INFO: Int = 54

public const val _SC_ATEXIT_MAX: Int = 55

public const val _SC_BARRIERS: Int = 56

public const val _SC_BC_BASE_MAX: Int = 57

public const val _SC_BC_DIM_MAX: Int = 58

public const val _SC_BC_SCALE_MAX: Int = 59

public const val _SC_BC_STRING_MAX: Int = 60

public const val _SC_CLOCK_SELECTION: Int = 61

public const val _SC_COLL_WEIGHTS_MAX: Int = 62

public const val _SC_CPUTIME: Int = 63

public const val _SC_EXPR_NEST_MAX: Int = 64

public const val _SC_HOST_NAME_MAX: Int = 65

public const val _SC_IOV_MAX: Int = 66

public const val _SC_IPV6: Int = 67

public const val _SC_LINE_MAX: Int = 68

public const val _SC_MONOTONIC_CLOCK: Int = 69

public const val _SC_RAW_SOCKETS: Int = 70

public const val _SC_READER_WRITER_LOCKS: Int = 71

public const val _SC_REGEXP: Int = 72

public const val _SC_RE_DUP_MAX: Int = 73

public const val _SC_SHELL: Int = 74

public const val _SC_SPAWN: Int = 75

public const val _SC_SPIN_LOCKS: Int = 76

public const val _SC_SPORADIC_SERVER: Int = 77

public const val _SC_SS_REPL_MAX: Int = 78

public const val _SC_SYMLOOP_MAX: Int = 79

public const val _SC_THREAD_CPUTIME: Int = 80

public const val _SC_THREAD_SPORADIC_SERVER: Int = 81

public const val _SC_TIMEOUTS: Int = 82

public const val _SC_TRACE: Int = 83

public const val _SC_TRACE_EVENT_FILTER: Int = 84

public const val _SC_TRACE_EVENT_NAME_MAX: Int = 85

public const val _SC_TRACE_INHERIT: Int = 86

public const val _SC_TRACE_LOG: Int = 87

public const val _SC_TRACE_NAME_MAX: Int = 88

public const val _SC_TRACE_SYS_MAX: Int = 89

public const val _SC_TRACE_USER_EVENT_MAX: Int = 90

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 91

public const val _SC_V7_ILP32_OFF32: Int = 92

public const val _SC_V6_ILP32_OFF32: Int = _SC_V7_ILP32_OFF32

public const val _SC_XBS5_ILP32_OFF32: Int = _SC_V7_ILP32_OFF32

public const val _SC_V7_ILP32_OFFBIG: Int = 93

public const val _SC_V6_ILP32_OFFBIG: Int = _SC_V7_ILP32_OFFBIG

public const val _SC_XBS5_ILP32_OFFBIG: Int = _SC_V7_ILP32_OFFBIG

public const val _SC_V7_LP64_OFF64: Int = 94

public const val _SC_V6_LP64_OFF64: Int = _SC_V7_LP64_OFF64

public const val _SC_XBS5_LP64_OFF64: Int = _SC_V7_LP64_OFF64

public const val _SC_V7_LPBIG_OFFBIG: Int = 95

public const val _SC_V6_LPBIG_OFFBIG: Int = _SC_V7_LPBIG_OFFBIG

public const val _SC_XBS5_LPBIG_OFFBIG: Int = _SC_V7_LPBIG_OFFBIG

public const val _SC_XOPEN_CRYPT: Int = 96

public const val _SC_XOPEN_ENH_I18N: Int = 97

public const val _SC_XOPEN_LEGACY: Int = 98

public const val _SC_XOPEN_REALTIME: Int = 99

public const val _SC_STREAM_MAX: Int = 100

public const val _SC_PRIORITY_SCHEDULING: Int = 101

public const val _SC_XOPEN_REALTIME_THREADS: Int = 102

public const val _SC_XOPEN_SHM: Int = 103

public const val _SC_XOPEN_STREAMS: Int = 104

public const val _SC_XOPEN_UNIX: Int = 105

public const val _SC_XOPEN_VERSION: Int = 106

public const val _SC_2_CHAR_TERM: Int = 107

public const val _SC_2_C_BIND: Int = 108

public const val _SC_2_C_DEV: Int = 109

public const val _SC_2_FORT_DEV: Int = 110

public const val _SC_2_FORT_RUN: Int = 111

public const val _SC_2_LOCALEDEF: Int = 112

public const val _SC_2_PBS: Int = 113

public const val _SC_2_PBS_ACCOUNTING: Int = 114

public const val _SC_2_PBS_CHECKPOINT: Int = 115

public const val _SC_2_PBS_LOCATE: Int = 116

public const val _SC_2_PBS_MESSAGE: Int = 117

public const val _SC_2_PBS_TRACK: Int = 118

public const val _SC_2_SW_DEV: Int = 119

public const val _SC_2_UPE: Int = 120

public const val _SC_2_VERSION: Int = 121

public const val _SC_THREAD_ROBUST_PRIO_INHERIT: Int = 122

public const val _SC_THREAD_ROBUST_PRIO_PROTECT: Int = 123

public const val _SC_XOPEN_UUCP: Int = 124

public const val _SC_LEVEL1_ICACHE_SIZE: Int = 125

public const val _SC_LEVEL1_ICACHE_ASSOC: Int = 126

public const val _SC_LEVEL1_ICACHE_LINESIZE: Int = 127

public const val _SC_LEVEL1_DCACHE_SIZE: Int = 128

public const val _SC_LEVEL1_DCACHE_ASSOC: Int = 129

public const val _SC_LEVEL1_DCACHE_LINESIZE: Int = 130

public const val _SC_LEVEL2_CACHE_SIZE: Int = 131

public const val _SC_LEVEL2_CACHE_ASSOC: Int = 132

public const val _SC_LEVEL2_CACHE_LINESIZE: Int = 133

public const val _SC_LEVEL3_CACHE_SIZE: Int = 134

public const val _SC_LEVEL3_CACHE_ASSOC: Int = 135

public const val _SC_LEVEL3_CACHE_LINESIZE: Int = 136

public const val _SC_LEVEL4_CACHE_SIZE: Int = 137

public const val _SC_LEVEL4_CACHE_ASSOC: Int = 138

public const val _SC_LEVEL4_CACHE_LINESIZE: Int = 139

public const val _PC_LINK_MAX: Int = 0

public const val _PC_MAX_CANON: Int = 1

public const val _PC_MAX_INPUT: Int = 2

public const val _PC_NAME_MAX: Int = 3

public const val _PC_PATH_MAX: Int = 4

public const val _PC_PIPE_BUF: Int = 5

public const val _PC_CHOWN_RESTRICTED: Int = 6

public const val _PC_NO_TRUNC: Int = 7

public const val _PC_VDISABLE: Int = 8

public const val _PC_ASYNC_IO: Int = 9

public const val _PC_PRIO_IO: Int = 10

public const val _PC_SYNC_IO: Int = 11

public const val _PC_FILESIZEBITS: Int = 12

public const val _PC_2_SYMLINKS: Int = 13

public const val _PC_SYMLINK_MAX: Int = 14

public const val _PC_ALLOC_SIZE_MIN: Int = 15

public const val _PC_REC_INCR_XFER_SIZE: Int = 16

public const val _PC_REC_MAX_XFER_SIZE: Int = 17

public const val _PC_REC_MIN_XFER_SIZE: Int = 18

public const val _PC_REC_XFER_ALIGN: Int = 19

public const val _PC_TIMESTAMP_RESOLUTION: Int = 20

public const val _CS_PATH: Int = 0

public const val O_ACCMODE: Int = 0x3

public const val O_RDONLY: Int = 0

public const val O_WRONLY: Int = 1

public const val O_RDWR: Int = 2

public const val O_APPEND: Int = 0x0008

public const val O_CREAT: Int = 0x0200

public const val O_TRUNC: Int = 0x0400

public const val O_EXCL: Int = 0x0800

public const val O_SYNC: Int = 0x2000

public const val O_NONBLOCK: Int = 0x4000

public const val O_NOCTTY: Int = 0x8000

public const val O_CLOEXEC: Int = 0x40000

public const val O_NOFOLLOW: Int = 0x100000

public const val O_DIRECTORY: Int = 0x200000

public const val O_EXEC: Int = 0x400000

public const val O_SEARCH: Int = 0x400000

public const val O_DIRECT: Int = 0x80000

public const val O_DSYNC: Int = 0x2000

public const val O_RSYNC: Int = 0x2000

public const val O_TMPFILE: Int = 0x800000

public const val O_NOATIME: Int = 0x1000000

public const val O_PATH: Int = 0x2000000

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

public const val F_RGETLK: Int = 10

public const val F_RSETLK: Int = 11

public const val F_CNVT: Int = 12

public const val F_RSETLKW: Int = 13

public const val F_DUPFD_CLOEXEC: Int = 14

public const val F_RDLCK: Int = 1

public const val F_WRLCK: Int = 2

public const val F_UNLCK: Int = 3

public const val AT_FDCWD: Int = -2

public const val AT_EACCESS: Int = 1

public const val AT_SYMLINK_NOFOLLOW: Int = 2

public const val AT_SYMLINK_FOLLOW: Int = 4

public const val AT_REMOVEDIR: Int = 8

public const val AT_EMPTY_PATH: Int = 16

public const val LOCK_SH: Int = 1

public const val LOCK_EX: Int = 2

public const val LOCK_NB: Int = 4

public const val LOCK_UN: Int = 8

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

public const val EBADE: Int = 50

public const val EBADR: Int = 51

public const val EXFULL: Int = 52

public const val ENOANO: Int = 53

public const val EBADRQC: Int = 54

public const val EBADSLT: Int = 55

public const val EDEADLOCK: Int = 56

public const val EBFONT: Int = 57

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

public const val EDOTDOT: Int = 76

public const val EBADMSG: Int = 77

public const val EFTYPE: Int = 79

public const val ENOTUNIQ: Int = 80

public const val EBADFD: Int = 81

public const val EREMCHG: Int = 82

public const val ELIBACC: Int = 83

public const val ELIBBAD: Int = 84

public const val ELIBSCN: Int = 85

public const val ELIBMAX: Int = 86

public const val ELIBEXEC: Int = 87

public const val ENOSYS: Int = 88

public const val ENOTEMPTY: Int = 90

public const val ENAMETOOLONG: Int = 91

public const val ELOOP: Int = 92

public const val EOPNOTSUPP: Int = 95

public const val EPFNOSUPPORT: Int = 96

public const val ECONNRESET: Int = 104

public const val ENOBUFS: Int = 105

public const val EAFNOSUPPORT: Int = 106

public const val EPROTOTYPE: Int = 107

public const val ENOTSOCK: Int = 108

public const val ENOPROTOOPT: Int = 109

public const val ESHUTDOWN: Int = 110

public const val ECONNREFUSED: Int = 111

public const val EADDRINUSE: Int = 112

public const val ECONNABORTED: Int = 113

public const val ENETUNREACH: Int = 114

public const val ENETDOWN: Int = 115

public const val ETIMEDOUT: Int = 116

public const val EHOSTDOWN: Int = 117

public const val EHOSTUNREACH: Int = 118

public const val EINPROGRESS: Int = 119

public const val EALREADY: Int = 120

public const val EDESTADDRREQ: Int = 121

public const val EMSGSIZE: Int = 122

public const val EPROTONOSUPPORT: Int = 123

public const val ESOCKTNOSUPPORT: Int = 124

public const val EADDRNOTAVAIL: Int = 125

public const val ENETRESET: Int = 126

public const val EISCONN: Int = 127

public const val ENOTCONN: Int = 128

public const val ETOOMANYREFS: Int = 129

public const val EPROCLIM: Int = 130

public const val EUSERS: Int = 131

public const val EDQUOT: Int = 132

public const val ESTALE: Int = 133

public const val ENOTSUP: Int = 134

public const val ENOMEDIUM: Int = 135

public const val EILSEQ: Int = 138

public const val EOVERFLOW: Int = 139

public const val ECANCELED: Int = 140

public const val ENOTRECOVERABLE: Int = 141

public const val EOWNERDEAD: Int = 142

public const val ESTRPIPE: Int = 143

public const val EWOULDBLOCK: Int = EAGAIN

public const val SCHED_OTHER: Int = 3

public const val SCHED_FIFO: Int = 1

public const val SCHED_RR: Int = 2

// PTHREAD_COND_INITIALIZER: PthreadCondT = 21 as *mut _ (initializer represented at the FFI boundary)
public const val PTHREAD_CREATE_DETACHED: Int = 1

public const val PTHREAD_CREATE_JOINABLE: Int = 0

public const val PTHREAD_MUTEX_RECURSIVE: Int = 0

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 1

public const val PTHREAD_MUTEX_NORMAL: Int = 2

public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL

// PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = 18 as *mut _ (initializer represented at the FFI boundary)
// PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = 20 as *mut _ (initializer represented at the FFI boundary)
// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = 19 as *mut _ (initializer represented at the FFI boundary)
public const val PTHREAD_PROCESS_SHARED: Int = 1

public const val PTHREAD_PROCESS_PRIVATE: Int = 0

// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = 22 as *mut _ (initializer represented at the FFI boundary)
public const val LITTLE_ENDIAN: Int = 1234

public const val BIG_ENDIAN: Int = 4321

public const val TCP_NODELAY: Int = 1

public const val TCP_KEEPIDLE: Int = 3

public const val TCP_MAXSEG: Int = 4

public const val TCP_QUICKACK: Int = 12

public const val TCP_USER_TIMEOUT: Int = 14

public const val TCP_FASTOPEN: Int = 15

public const val TCP_KEEPCNT: Int = 16

public const val TCP_KEEPINTVL: Int = 17

public const val WINDOWS_POST: Int = 0

public const val WINDOWS_SEND: Int = 1

public const val WINDOWS_HWND: Int = 2

public const val MOUNT_TEXT: UInt = 0x01u

public const val MOUNT_SYSTEM: UInt = 0x08u

public const val MOUNT_EXEC: UInt = 0x10u

public const val MOUNT_CYGDRIVE: UInt = 0x20u

public const val MOUNT_CYGWIN_EXEC: UInt = 0x40u

public const val MOUNT_SPARSE: UInt = 0x80u

public const val MOUNT_NOTEXEC: UInt = 0x100u

public const val MOUNT_DEVFS: UInt = 0x200u

public const val MOUNT_PROC: UInt = 0x400u

public const val MOUNT_RO: UInt = 0x1000u

public const val MOUNT_NOACL: UInt = 0x2000u

public const val MOUNT_NOPOSIX: UInt = 0x4000u

public const val MOUNT_OVERRIDE: UInt = 0x8000u

public const val MOUNT_IMMUTABLE: UInt = 0x10000u

public const val MOUNT_AUTOMATIC: UInt = 0x20000u

public const val MOUNT_DOS: UInt = 0x40000u

public const val MOUNT_IHASH: UInt = 0x80000u

public const val MOUNT_BIND: UInt = 0x100000u

public const val MOUNT_USER_TEMP: UInt = 0x200000u

public const val MOUNT_DONT_USE: UInt = 0x80000000u

public const val _POSIX_VDISABLE: UByte = 0u

public const val GRND_NONBLOCK: UInt = 0x1u

public const val GRND_RANDOM: UInt = 0x2u

public const val _IOFBF: Int = 0

public const val _IOLBF: Int = 1

public const val _IONBF: Int = 2

public const val BUFSIZ: Int = 1024

public const val POSIX_SPAWN_RESETIDS: Int = 0x01

public const val POSIX_SPAWN_SETPGROUP: Int = 0x02

public const val POSIX_SPAWN_SETSCHEDPARAM: Int = 0x04

public const val POSIX_SPAWN_SETSCHEDULER: Int = 0x08

public const val POSIX_SPAWN_SETSIGDEF: Int = 0x10

public const val POSIX_SPAWN_SETSIGMASK: Int = 0x20

public const val POSIX_FADV_NORMAL: Int = 0

public const val POSIX_FADV_SEQUENTIAL: Int = 1

public const val POSIX_FADV_RANDOM: Int = 2

public const val POSIX_FADV_WILLNEED: Int = 3

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val FALLOC_FL_PUNCH_HOLE: Int = 0x0001

public const val FALLOC_FL_ZERO_RANGE: Int = 0x0002

public const val FALLOC_FL_UNSHARE_RANGE: Int = 0x0004

public const val FALLOC_FL_COLLAPSE_RANGE: Int = 0x0008

public const val FALLOC_FL_INSERT_RANGE: Int = 0x0010

public const val FALLOC_FL_KEEP_SIZE: Int = 0x1000
