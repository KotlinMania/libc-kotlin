package io.github.kotlinmania.libc.unix.cygwin

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public typealias WcharT = CUshort

public typealias BlkcntT = Long

public typealias BlksizeT = Int

public typealias DevT = UInt

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias InoT = ULong

public typealias KeyT = CLonglong

public typealias SaFamilyT = UShort

public typealias SocklenT = CInt

public typealias OffT = CLong

public typealias IdT = UInt

public typealias ModeT = UInt

public typealias Off64T = CLonglong

public typealias LoffT = Off64T

public typealias IconvT = COpaquePointer?

public typealias ClockT = CUlong

public typealias TimeT = CLong

public typealias ClockidT = CUlong

public typealias TimerT = CUlong

public typealias NlItem = CInt

public typealias NlinkT = CUshort

public typealias SusecondsT = CLong

public typealias UsecondsT = CUlong

public typealias SigsetT = CUlong

public typealias FdMask = CUlong

public typealias PthreadT = COpaquePointer?

public typealias PthreadMutexT = COpaquePointer?

// Must be Int due to libstd/sysCommon/threadLocal.rs,
// should technically be *mut cVoid
public typealias PthreadKeyT = Int

public typealias PthreadAttrT = COpaquePointer?

public typealias PthreadMutexattrT = COpaquePointer?

public typealias PthreadCondattrT = COpaquePointer?

public typealias PthreadCondT = COpaquePointer?

// The following ones should be *mut cVoid
public typealias PthreadBarrierattrT = ULong

public typealias PthreadBarrierT = ULong

public typealias PthreadSpinlockT = ULong

public typealias PthreadRwlockT = COpaquePointer?

public typealias PthreadRwlockattrT = COpaquePointer?

public typealias RegisterT = IntptrT

public typealias UChar = CUchar

public typealias UShort = CUshort

public typealias ULong = CUlong

public typealias UInt = CUint

public typealias CaddrT = COpaquePointer?

public typealias VmSizeT = CUlong

public typealias RlimT = CUlong

public typealias NfdsT = CUint

public typealias SemT = Sem?

public typealias TcflagT = CUint

public typealias SpeedT = CUint

public typealias VmOffsetT = CUlong

public typealias PosixSpawnFileActionsT = COpaquePointer?

public typealias PosixSpawnattrT = COpaquePointer?

public fun SiginfoT.siAddr(): COpaquePointer? {
    open class SiginfoSiAddr(
        public var siSigno: CInt,
        public var siCode: CInt,
        public var siPid: PidT,
        public var siUid: UidT,
        public var siErrno: CInt,
        public var siAddr: COpaquePointer?,
    )
    return (((this as SiginfoT?) as SiginfoSiAddr?)).siAddr
}

public fun SiginfoT.siStatus(): CInt {
    open class SiginfoSigchld(
        public var siSigno: CInt,
        public var siCode: CInt,
        public var siPid: PidT,
        public var siUid: UidT,
        public var siErrno: CInt,
        public var siStatus: CInt,
    )
    return (((this as SiginfoT?) as SiginfoSigchld?)).siStatus
}

public fun SiginfoT.siPid(): PidT {
    return this.siPid
}

public fun SiginfoT.siUid(): UidT {
    return this.siUid
}

public fun SiginfoT.siValue(): Sigval {
    open class SiginfoSiValue(
        public var siSigno: CInt,
        public var siCode: CInt,
        public var siPid: PidT,
        public var siUid: UidT,
        public var siErrno: CInt,
        public var siValue: Sigval,
    )
    return (((this as SiginfoT?) as SiginfoSiValue?)).siValue
}

public val FD_SETSIZE: Int = 1024

public val CPU_SETSIZE: CInt = 0x400

// siCode values for SIGBUS signal
public val BUS_ADRALN: CInt = 25

public val BUS_ADRERR: CInt = 26

public val BUS_OBJERR: CInt = 27

// siCode values for SIGCHLD signal
public val CLD_EXITED: CInt = 28

public val CLD_KILLED: CInt = 29

public val CLD_DUMPED: CInt = 30

public val CLD_TRAPPED: CInt = 31

public val CLD_STOPPED: CInt = 32

public val CLD_CONTINUED: CInt = 33

public val SIGEV_SIGNAL: CInt = 0

public val SIGEV_NONE: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val SA_NOCLDSTOP: CInt = 0x00000001

public val SA_NOCLDWAIT: CInt = 0

// Note: does not exist on Cygwin!
public val SA_SIGINFO: CInt = 0x00000002

public val SA_RESTART: CInt = 0x10000000

public val SA_ONSTACK: CInt = 0x20000000

public val SA_NODEFER: CInt = 0x40000000

public val SA_RESETHAND: CInt = 0x80000000

public val MINSIGSTKSZ: SizeT = 8192uL

public val SIGSTKSZ: SizeT = 32768uL

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGTRAP: CInt = 5

public val SIGABRT: CInt = 6

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGBUS: CInt = 10

public val SIGSEGV: CInt = 11

public val SIGSYS: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGURG: CInt = 16

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGCONT: CInt = 19

public val SIGCHLD: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGIO: CInt = 23

public val SIGPOLL: CInt = 23

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGPWR: CInt = 29

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val SS_ONSTACK: CInt = 0x1

public val SS_DISABLE: CInt = 0x2

public val SIG_SETMASK: CInt = 0

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val TIMER_ABSTIME: CInt = 4

public val CLOCK_REALTIME_COARSE: ClockidT = 0uL

public val CLOCK_REALTIME: ClockidT = 1uL

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2uL

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 3uL

public val CLOCK_MONOTONIC: ClockidT = 4uL

public val CLOCK_MONOTONIC_RAW: ClockidT = 5uL

public val CLOCK_MONOTONIC_COARSE: ClockidT = 6uL

public val CLOCK_BOOTTIME: ClockidT = 7uL

public val CLOCK_REALTIME_ALARM: ClockidT = 8uL

public val CLOCK_BOOTTIME_ALARM: ClockidT = 9uL

public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_NOFILE: CInt = 5

public val RLIMIT_AS: CInt = 6

public val RLIM_NLIMITS: CInt = 7

public val RLIMIT_NLIMITS: CInt = RLIM_NLIMITS

public val RLIM_INFINITY: RlimT = 0uL.inv()

public val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY

public val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY

public val RUSAGE_SELF: CInt = 0

public val RUSAGE_CHILDREN: CInt = -1

public val IFF_UP: CInt = 0x1

// interface is up
public val IFF_BROADCAST: CInt = 0x2

// broadcast address valid
public val IFF_LOOPBACK: CInt = 0x8

// is a loopback net
public val IFF_POINTOPOINT: CInt = 0x10

// interface is point-to-point link
public val IFF_NOTRAILERS: CInt = 0x20

// avoid use of trailers
public val IFF_RUNNING: CInt = 0x40

// resources allocated
public val IFF_NOARP: CInt = 0x80

// no address resolution protocol
public val IFF_PROMISC: CInt = 0x100

// receive all packets
public val IFF_MULTICAST: CInt = 0x1000

// supports multicast
public val IFF_LOWER_UP: CInt = 0x10000

// driver signals L1 up
public val IFF_DORMANT: CInt = 0x20000

// driver signals dormant
public val IF_NAMESIZE: SizeT = 44uL

public val IFNAMSIZ: SizeT = IF_NAMESIZE

public val FIONREAD: CInt = 0x4008667f

public val FIONBIO: CInt = 0x8004667e

public val FIOASYNC: CInt = 0x8008667d

public val FIOCLEX: CInt = 0

// Note: does not exist on Cygwin!
public val SIOCGIFCONF: CUlong = 0x80107364uL

public val SIOCGIFFLAGS: CUlong = 0x80507365uL

public val SIOCGIFADDR: CUlong = 0x80507366uL

public val SIOCGIFBRDADDR: CUlong = 0x80507367uL

public val SIOCGIFNETMASK: CUlong = 0x80507368uL

public val SIOCGIFHWADDR: CUlong = 0x80507369uL

public val SIOCGIFMETRIC: CUlong = 0x8050736auL

public val SIOCGIFMTU: CUlong = 0x8050736buL

public val SIOCGIFINDEX: CUlong = 0x8050736cuL

public val SIOGIFINDEX: CUlong = SIOCGIFINDEX

public val SIOCGIFDSTADDR: CUlong = 0x8050736euL

public val SOL_SOCKET: CInt = 0xffff

public val SO_DEBUG: CInt = 1

public val SO_ACCEPTCONN: CInt = 0x0002

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_OOBINLINE: CInt = 0x0100

public val SO_PEERCRED: CInt = 0x0200

public val SO_PASSCRED: CInt = 0x0400

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SCM_RIGHTS: CInt = 0x01

public val SCM_CREDENTIALS: CInt = 0x02

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_NONBLOCK: CInt = 0x01000000

public val SOCK_CLOEXEC: CInt = 0x02000000

public val AF_UNSPEC: CInt = 0

public val AF_LOCAL: CInt = 1

public val AF_UNIX: CInt = AF_LOCAL

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NS: CInt = 6

public val AF_ISO: CInt = 7

public val AF_OSI: CInt = AF_ISO

public val AF_ECMA: CInt = 8

public val AF_DATAKIT: CInt = 9

public val AF_CCITT: CInt = 10

public val AF_SNA: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_LAT: CInt = 14

public val AF_HYLINK: CInt = 15

public val AF_APPLETALK: CInt = 16

public val AF_NETBIOS: CInt = 17

public val AF_INET6: CInt = 23

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_UNIX: CInt = PF_LOCAL

public val PF_INET: CInt = AF_INET

public val PF_IMPLINK: CInt = AF_IMPLINK

public val PF_PUP: CInt = AF_PUP

public val PF_CHAOS: CInt = AF_CHAOS

public val PF_NS: CInt = AF_NS

public val PF_ISO: CInt = AF_ISO

public val PF_OSI: CInt = AF_ISO

public val PF_DATAKIT: CInt = AF_DATAKIT

public val PF_CCITT: CInt = AF_CCITT

public val PF_SNA: CInt = AF_SNA

public val PF_DE_CNET: CInt = AF_DE_CNET

public val PF_DLI: CInt = AF_DLI

public val PF_LAT: CInt = AF_LAT

public val PF_HYLINK: CInt = AF_HYLINK

public val PF_APPLETALK: CInt = AF_APPLETALK

public val PF_NETBIOS: CInt = AF_NETBIOS

public val PF_INET6: CInt = AF_INET6

public val SOMAXCONN: CInt = 0x7fffffff

public val MSG_OOB: CInt = 0x1

public val MSG_PEEK: CInt = 0x2

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_WAITALL: CInt = 0x8

public val MSG_DONTWAIT: CInt = 0x10

public val MSG_NOSIGNAL: CInt = 0x20

public val MSG_TRUNC: CInt = 0x0100

public val MSG_CTRUNC: CInt = 0x0200

public val MSG_BCAST: CInt = 0x0400

public val MSG_MCAST: CInt = 0x0800

public val MSG_CMSG_CLOEXEC: CInt = 0x1000

public val MSG_EOR: CInt = 0x8000

public val SOL_IP: CInt = 0

public val SOL_IPV6: CInt = 41

public val SOL_TCP: CInt = 6

public val SOL_UDP: CInt = 17

public val IPTOS_LOWDELAY: UByte = 0x10u

public val IPTOS_THROUGHPUT: UByte = 0x08u

public val IPTOS_RELIABILITY: UByte = 0x04u

public val IPTOS_LOWCOST: UByte = 0x02u

public val IPTOS_MINCOST: UByte = IPTOS_LOWCOST

public val IP_DEFAULT_MULTICAST_TTL: CInt = 1

public val IP_DEFAULT_MULTICAST_LOOP: CInt = 1

public val IP_OPTIONS: CInt = 1

public val IP_HDRINCL: CInt = 2

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 15

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 16

public val IP_BLOCK_SOURCE: CInt = 17

public val IP_UNBLOCK_SOURCE: CInt = 18

public val IP_PKTINFO: CInt = 19

public val IP_RECVTTL: CInt = 21

public val IP_UNICAST_IF: CInt = 31

public val IP_RECVTOS: CInt = 40

public val IP_MTU_DISCOVER: CInt = 71

public val IP_MTU: CInt = 73

public val IP_RECVERR: CInt = 75

public val IP_PMTUDISC_WANT: CInt = 0

public val IP_PMTUDISC_DO: CInt = 1

public val IP_PMTUDISC_DONT: CInt = 2

public val IP_PMTUDISC_PROBE: CInt = 3

public val IPV6_HOPOPTS: CInt = 1

public val IPV6_HDRINCL: CInt = 2

public val IPV6_UNICAST_HOPS: CInt = 4

public val IPV6_MULTICAST_IF: CInt = 9

public val IPV6_MULTICAST_HOPS: CInt = 10

public val IPV6_MULTICAST_LOOP: CInt = 11

public val IPV6_ADD_MEMBERSHIP: CInt = 12

public val IPV6_DROP_MEMBERSHIP: CInt = 13

public val IPV6_JOIN_GROUP: CInt = 12

public val IPV6_LEAVE_GROUP: CInt = 13

public val IPV6_DONTFRAG: CInt = 14

public val IPV6_PKTINFO: CInt = 19

public val IPV6_HOPLIMIT: CInt = 21

public val IPV6_CHECKSUM: CInt = 26

public val IPV6_V6ONLY: CInt = 27

public val IPV6_UNICAST_IF: CInt = 31

public val IPV6_RTHDR: CInt = 32

public val IPV6_RECVRTHDR: CInt = 38

public val IPV6_TCLASS: CInt = 39

public val IPV6_RECVTCLASS: CInt = 40

public val IPV6_MTU_DISCOVER: CInt = 71

public val IPV6_MTU: CInt = 72

public val IPV6_RECVERR: CInt = 75

public val IPV6_PMTUDISC_WANT: CInt = 0

public val IPV6_PMTUDISC_DO: CInt = 1

public val IPV6_PMTUDISC_DONT: CInt = 2

public val IPV6_PMTUDISC_PROBE: CInt = 3

public val MCAST_JOIN_GROUP: CInt = 41

public val MCAST_LEAVE_GROUP: CInt = 42

public val MCAST_BLOCK_SOURCE: CInt = 43

public val MCAST_UNBLOCK_SOURCE: CInt = 44

public val MCAST_JOIN_SOURCE_GROUP: CInt = 45

public val MCAST_LEAVE_SOURCE_GROUP: CInt = 46

public val MCAST_INCLUDE: CInt = 0

public val MCAST_EXCLUDE: CInt = 1

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val S_BLKSIZE: ModeT = 1024u

public val S_IREAD: ModeT = 256u

public val S_IWRITE: ModeT = 128u

public val S_IEXEC: ModeT = 64u

public val S_ENFMT: ModeT = 1024u

public val S_IFMT: ModeT = 61440u

public val S_IFDIR: ModeT = 16384u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

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

public val UTIME_NOW: CLong = -2L

public val UTIME_OMIT: CLong = -1L

public val ARG_MAX: CInt = 32000

public val CHILD_MAX: CInt = 256

public val IOV_MAX: CInt = 1024

public val PTHREAD_STACK_MIN: SizeT = 65536uL

public val PATH_MAX: CInt = 4096

public val PIPE_BUF: Int = 4096

public val NGROUPS_MAX: CInt = 1024

public val FILENAME_MAX: CInt = 4096

public val FORK_RELOAD: CInt = 1

public val FORK_NO_RELOAD: CInt = 0

public val RTLD_DEFAULT: COpaquePointer? = null

public val RTLD_LOCAL: CInt = 0

public val RTLD_LAZY: CInt = 1

public val RTLD_NOW: CInt = 2

public val RTLD_GLOBAL: CInt = 4

public val RTLD_NODELETE: CInt = 8

public val RTLD_NOLOAD: CInt = 16

public val RTLD_DEEPBIND: CInt = 32

/**
 * IP6 hop-by-hop options
 */
public val IPPROTO_HOPOPTS: CInt = 0

/**
 * gateway mgmt protocol
 */
public val IPPROTO_IGMP: CInt = 2

/**
 * IPIP tunnels (older KA9Q tunnels use 94)
 */
public val IPPROTO_IPIP: CInt = 4

/**
 * exterior gateway protocol
 */
public val IPPROTO_EGP: CInt = 8

/**
 * pup
 */
public val IPPROTO_PUP: CInt = 12

/**
 * xns idp
 */
public val IPPROTO_IDP: CInt = 22

/**
 * IP6 routing header
 */
public val IPPROTO_ROUTING: CInt = 43

/**
 * IP6 fragmentation header
 */
public val IPPROTO_FRAGMENT: CInt = 44

/**
 * IP6 Encap Sec. Payload
 */
public val IPPROTO_ESP: CInt = 50

/**
 * IP6 Auth Header
 */
public val IPPROTO_AH: CInt = 51

/**
 * IP6 no next header
 */
public val IPPROTO_NONE: CInt = 59

/**
 * IP6 destination option
 */
public val IPPROTO_DSTOPTS: CInt = 60

public val IPPROTO_RAW: CInt = 255

public val IPPROTO_MAX: CInt = 256

public val AI_PASSIVE: CInt = 0x1

public val AI_CANONNAME: CInt = 0x2

public val AI_NUMERICHOST: CInt = 0x4

public val AI_NUMERICSERV: CInt = 0x8

public val AI_ALL: CInt = 0x100

public val AI_ADDRCONFIG: CInt = 0x400

public val AI_V4MAPPED: CInt = 0x800

public val NI_NOFQDN: CInt = 0x1

public val NI_NUMERICHOST: CInt = 0x2

public val NI_NAMEREQD: CInt = 0x4

public val NI_NUMERICSERV: CInt = 0x8

public val NI_DGRAM: CInt = 0x10

public val NI_MAXHOST: CInt = 1025

public val NI_MAXSERV: CInt = 32

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

public val EAI_OVERFLOW: CInt = 14

public val UT_LINESIZE: Int = 16

public val UT_NAMESIZE: Int = 16

public val UT_HOSTSIZE: Int = 256

public val UT_IDLEN: Int = 2

public val RUN_LVL: CShort = 1

public val BOOT_TIME: CShort = 2

public val NEW_TIME: CShort = 3

public val OLD_TIME: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val USER_PROCESS: CShort = 7

public val DEAD_PROCESS: CShort = 8

public val POLLIN: CShort = 0x1

public val POLLPRI: CShort = 0x2

public val POLLOUT: CShort = 0x4

public val POLLERR: CShort = 0x8

public val POLLHUP: CShort = 0x10

public val POLLNVAL: CShort = 0x20

public val POLLRDNORM: CShort = 0x1

public val POLLRDBAND: CShort = 0x2

public val POLLWRNORM: CShort = 0x4

public val POLLWRBAND: CShort = 0x4

public val LC_ALL: CInt = 0

public val LC_COLLATE: CInt = 1

public val LC_CTYPE: CInt = 2

public val LC_MONETARY: CInt = 3

public val LC_NUMERIC: CInt = 4

public val LC_TIME: CInt = 5

public val LC_MESSAGES: CInt = 6

public val LC_ALL_MASK: CInt = 1 shl 0

public val LC_COLLATE_MASK: CInt = 1 shl 1

public val LC_CTYPE_MASK: CInt = 1 shl 2

public val LC_MONETARY_MASK: CInt = 1 shl 3

public val LC_NUMERIC_MASK: CInt = 1 shl 4

public val LC_TIME_MASK: CInt = 1 shl 5

public val LC_MESSAGES_MASK: CInt = 1 shl 6

public val LC_GLOBAL_LOCALE: LocaleT = (-1 as LocaleT)

public val SEM_FAILED: COpaquePointer? = null

public val ST_RDONLY: CUlong = 0x80000uL

public val ST_NOSUID: CUlong = 0uL

public val TIOCMGET: CInt = 0x5415

public val TIOCMBIS: CInt = 0x5416

public val TIOCMBIC: CInt = 0x5417

public val TIOCMSET: CInt = 0x5418

public val TIOCINQ: CInt = 0x541B

public val TIOCSCTTY: CInt = 0x540E

public val TIOCSBRK: CInt = 0x5427

public val TIOCCBRK: CInt = 0x5428

public val TIOCM_DTR: CInt = 0x002

public val TIOCM_RTS: CInt = 0x004

public val TIOCM_CTS: CInt = 0x020

public val TIOCM_CAR: CInt = 0x040

public val TIOCM_RNG: CInt = 0x080

public val TIOCM_CD: CInt = TIOCM_CAR

public val TIOCM_RI: CInt = TIOCM_RNG

public val TCOOFF: CInt = 0

public val TCOON: CInt = 1

public val TCIOFF: CInt = 2

public val TCION: CInt = 3

public val TCGETA: CInt = 5

public val TCSETA: CInt = 6

public val TCSETAW: CInt = 7

public val TCSETAF: CInt = 8

public val TCIFLUSH: CInt = 0

public val TCOFLUSH: CInt = 1

public val TCIOFLUSH: CInt = 2

public val TCFLSH: CInt = 3

public val TCSAFLUSH: CInt = 1

public val TCSANOW: CInt = 2

public val TCSADRAIN: CInt = 3

public val TIOCPKT: CInt = 6

public val TIOCPKT_DATA: CInt = 0x0

public val TIOCPKT_FLUSHREAD: CInt = 0x1

public val TIOCPKT_FLUSHWRITE: CInt = 0x2

public val TIOCPKT_STOP: CInt = 0x4

public val TIOCPKT_START: CInt = 0x8

public val TIOCPKT_NOSTOP: CInt = 0x10

public val TIOCPKT_DOSTOP: CInt = 0x20

public val IGNBRK: TcflagT = 0x00001u

public val BRKINT: TcflagT = 0x00002u

public val IGNPAR: TcflagT = 0x00004u

public val IMAXBEL: TcflagT = 0x00008u

public val INPCK: TcflagT = 0x00010u

public val ISTRIP: TcflagT = 0x00020u

public val INLCR: TcflagT = 0x00040u

public val IGNCR: TcflagT = 0x00080u

public val ICRNL: TcflagT = 0x00100u

public val IXON: TcflagT = 0x00400u

public val IXOFF: TcflagT = 0x01000u

public val IUCLC: TcflagT = 0x04000u

public val IXANY: TcflagT = 0x08000u

public val PARMRK: TcflagT = 0x10000u

public val IUTF8: TcflagT = 0x20000u

public val OPOST: TcflagT = 0x00001u

public val OLCUC: TcflagT = 0x00002u

public val OCRNL: TcflagT = 0x00004u

public val ONLCR: TcflagT = 0x00008u

public val ONOCR: TcflagT = 0x00010u

public val ONLRET: TcflagT = 0x00020u

public val OFILL: TcflagT = 0x00040u

public val CRDLY: TcflagT = 0x00180u

public val CR0: TcflagT = 0x00000u

public val CR1: TcflagT = 0x00080u

public val CR2: TcflagT = 0x00100u

public val CR3: TcflagT = 0x00180u

public val NLDLY: TcflagT = 0x00200u

public val NL0: TcflagT = 0x00000u

public val NL1: TcflagT = 0x00200u

public val BSDLY: TcflagT = 0x00400u

public val BS0: TcflagT = 0x00000u

public val BS1: TcflagT = 0x00400u

public val TABDLY: TcflagT = 0x01800u

public val TAB0: TcflagT = 0x00000u

public val TAB1: TcflagT = 0x00800u

public val TAB2: TcflagT = 0x01000u

public val TAB3: TcflagT = 0x01800u

public val XTABS: TcflagT = 0x01800u

public val VTDLY: TcflagT = 0x02000u

public val VT0: TcflagT = 0x00000u

public val VT1: TcflagT = 0x02000u

public val FFDLY: TcflagT = 0x04000u

public val FF0: TcflagT = 0x00000u

public val FF1: TcflagT = 0x04000u

public val OFDEL: TcflagT = 0x08000u

public val CBAUD: TcflagT = 0x0100fu

public val B0: SpeedT = 0x00000u

public val B50: SpeedT = 0x00001u

public val B75: SpeedT = 0x00002u

public val B110: SpeedT = 0x00003u

public val B134: SpeedT = 0x00004u

public val B150: SpeedT = 0x00005u

public val B200: SpeedT = 0x00006u

public val B300: SpeedT = 0x00007u

public val B600: SpeedT = 0x00008u

public val B1200: SpeedT = 0x00009u

public val B1800: SpeedT = 0x0000au

public val B2400: SpeedT = 0x0000bu

public val B4800: SpeedT = 0x0000cu

public val B9600: SpeedT = 0x0000du

public val B19200: SpeedT = 0x0000eu

public val B38400: SpeedT = 0x0000fu

public val CSIZE: TcflagT = 0x00030u

public val CS5: TcflagT = 0x00000u

public val CS6: TcflagT = 0x00010u

public val CS7: TcflagT = 0x00020u

public val CS8: TcflagT = 0x00030u

public val CSTOPB: TcflagT = 0x00040u

public val CREAD: TcflagT = 0x00080u

public val PARENB: TcflagT = 0x00100u

public val PARODD: TcflagT = 0x00200u

public val HUPCL: TcflagT = 0x00400u

public val CLOCAL: TcflagT = 0x00800u

public val CBAUDEX: TcflagT = 0x0100fu

public val B57600: SpeedT = 0x01001u

public val B115200: SpeedT = 0x01002u

public val B230400: SpeedT = 0x01004u

public val B460800: SpeedT = 0x01006u

public val B500000: SpeedT = 0x01007u

public val B576000: SpeedT = 0x01008u

public val B921600: SpeedT = 0x01009u

public val B1000000: SpeedT = 0x0100au

public val B1152000: SpeedT = 0x0100bu

public val B1500000: SpeedT = 0x0100cu

public val B2000000: SpeedT = 0x0100du

public val B2500000: SpeedT = 0x0100eu

public val B3000000: SpeedT = 0x0100fu

public val CRTSCTS: TcflagT = 0x08000u

public val CMSPAR: TcflagT = 0x40000000u

public val ISIG: TcflagT = 0x0001u

public val ICANON: TcflagT = 0x0002u

public val ECHO: TcflagT = 0x0004u

public val ECHOE: TcflagT = 0x0008u

public val ECHOK: TcflagT = 0x0010u

public val ECHONL: TcflagT = 0x0020u

public val NOFLSH: TcflagT = 0x0040u

public val TOSTOP: TcflagT = 0x0080u

public val IEXTEN: TcflagT = 0x0100u

public val FLUSHO: TcflagT = 0x0200u

public val ECHOKE: TcflagT = 0x0400u

public val ECHOCTL: TcflagT = 0x0800u

public val VDISCARD: Int = 1

public val VEOL: Int = 2

public val VEOL2: Int = 3

public val VEOF: Int = 4

public val VERASE: Int = 5

public val VINTR: Int = 6

public val VKILL: Int = 7

public val VLNEXT: Int = 8

public val VMIN: Int = 9

public val VQUIT: Int = 10

public val VREPRINT: Int = 11

public val VSTART: Int = 12

public val VSTOP: Int = 13

public val VSUSP: Int = 14

public val VSWTC: Int = 15

public val VTIME: Int = 16

public val VWERASE: Int = 17

public val NCCS: Int = 18

public val TIOCGWINSZ: CInt = 0x5401

public val TIOCSWINSZ: CInt = 0x5402

public val TIOCLINUX: CInt = 0x5403

public val TIOCGPGRP: CInt = 0x540f

public val TIOCSPGRP: CInt = 0x5410

public val WNOHANG: CInt = 1

public val WUNTRACED: CInt = 2

public val WCONTINUED: CInt = 8

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val MAP_FILE: CInt = 0

public val MAP_SHARED: CInt = 1

public val MAP_PRIVATE: CInt = 2

public val MAP_TYPE: CInt = 0xf

public val MAP_FIXED: CInt = 0x10

public val MAP_ANON: CInt = 0x20

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val MAP_NORESERVE: CInt = 0x4000

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

public val MS_ASYNC: CInt = 1

public val MS_SYNC: CInt = 2

public val MS_INVALIDATE: CInt = 4

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_SEQUENTIAL: CInt = 1

public val POSIX_MADV_RANDOM: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_DONTNEED: CInt = 4

public val MADV_NORMAL: CInt = 0

public val MADV_SEQUENTIAL: CInt = 1

public val MADV_RANDOM: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val F_ULOCK: CInt = 0

public val F_LOCK: CInt = 1

public val F_TLOCK: CInt = 2

public val F_TEST: CInt = 3

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_JOB_CONTROL: CInt = 5

public val SC_SAVED_IDS: CInt = 6

public val SC_VERSION: CInt = 7

public val SC_PAGESIZE: CInt = 8

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_NPROCESSORS_CONF: CInt = 9

public val SC_NPROCESSORS_ONLN: CInt = 10

public val SC_PHYS_PAGES: CInt = 11

public val SC_AVPHYS_PAGES: CInt = 12

public val SC_MQ_OPEN_MAX: CInt = 13

public val SC_MQ_PRIO_MAX: CInt = 14

public val SC_RTSIG_MAX: CInt = 15

public val SC_SEM_NSEMS_MAX: CInt = 16

public val SC_SEM_VALUE_MAX: CInt = 17

public val SC_SIGQUEUE_MAX: CInt = 18

public val SC_TIMER_MAX: CInt = 19

public val SC_TZNAME_MAX: CInt = 20

public val SC_ASYNCHRONOUS_IO: CInt = 21

public val SC_FSYNC: CInt = 22

public val SC_MAPPED_FILES: CInt = 23

public val SC_MEMLOCK: CInt = 24

public val SC_MEMLOCK_RANGE: CInt = 25

public val SC_MEMORY_PROTECTION: CInt = 26

public val SC_MESSAGE_PASSING: CInt = 27

public val SC_PRIORITIZED_IO: CInt = 28

public val SC_REALTIME_SIGNALS: CInt = 29

public val SC_SEMAPHORES: CInt = 30

public val SC_SHARED_MEMORY_OBJECTS: CInt = 31

public val SC_SYNCHRONIZED_IO: CInt = 32

public val SC_TIMERS: CInt = 33

public val SC_AIO_LISTIO_MAX: CInt = 34

public val SC_AIO_MAX: CInt = 35

public val SC_AIO_PRIO_DELTA_MAX: CInt = 36

public val SC_DELAYTIMER_MAX: CInt = 37

public val SC_THREAD_KEYS_MAX: CInt = 38

public val SC_THREAD_STACK_MIN: CInt = 39

public val SC_THREAD_THREADS_MAX: CInt = 40

public val SC_TTY_NAME_MAX: CInt = 41

public val SC_THREADS: CInt = 42

public val SC_THREAD_ATTR_STACKADDR: CInt = 43

public val SC_THREAD_ATTR_STACKSIZE: CInt = 44

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 45

public val SC_THREAD_PRIO_INHERIT: CInt = 46

public val SC_THREAD_PRIO_PROTECT: CInt = 47

public val SC_THREAD_PRIO_CEILING: CInt = SC_THREAD_PRIO_PROTECT

public val SC_THREAD_PROCESS_SHARED: CInt = 48

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 49

public val SC_GETGR_R_SIZE_MAX: CInt = 50

public val SC_GETPW_R_SIZE_MAX: CInt = 51

public val SC_LOGIN_NAME_MAX: CInt = 52

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 53

public val SC_ADVISORY_INFO: CInt = 54

public val SC_ATEXIT_MAX: CInt = 55

public val SC_BARRIERS: CInt = 56

public val SC_BC_BASE_MAX: CInt = 57

public val SC_BC_DIM_MAX: CInt = 58

public val SC_BC_SCALE_MAX: CInt = 59

public val SC_BC_STRING_MAX: CInt = 60

public val SC_CLOCK_SELECTION: CInt = 61

public val SC_COLL_WEIGHTS_MAX: CInt = 62

public val SC_CPUTIME: CInt = 63

public val SC_EXPR_NEST_MAX: CInt = 64

public val SC_HOST_NAME_MAX: CInt = 65

public val SC_IOV_MAX: CInt = 66

public val SC_IPV6: CInt = 67

public val SC_LINE_MAX: CInt = 68

public val SC_MONOTONIC_CLOCK: CInt = 69

public val SC_RAW_SOCKETS: CInt = 70

public val SC_READER_WRITER_LOCKS: CInt = 71

public val SC_REGEXP: CInt = 72

public val SC_RE_DUP_MAX: CInt = 73

public val SC_SHELL: CInt = 74

public val SC_SPAWN: CInt = 75

public val SC_SPIN_LOCKS: CInt = 76

public val SC_SPORADIC_SERVER: CInt = 77

public val SC_SS_REPL_MAX: CInt = 78

public val SC_SYMLOOP_MAX: CInt = 79

public val SC_THREAD_CPUTIME: CInt = 80

public val SC_THREAD_SPORADIC_SERVER: CInt = 81

public val SC_TIMEOUTS: CInt = 82

public val SC_TRACE: CInt = 83

public val SC_TRACE_EVENT_FILTER: CInt = 84

public val SC_TRACE_EVENT_NAME_MAX: CInt = 85

public val SC_TRACE_INHERIT: CInt = 86

public val SC_TRACE_LOG: CInt = 87

public val SC_TRACE_NAME_MAX: CInt = 88

public val SC_TRACE_SYS_MAX: CInt = 89

public val SC_TRACE_USER_EVENT_MAX: CInt = 90

public val SC_TYPED_MEMORY_OBJECTS: CInt = 91

public val SC_V7_ILP32_OFF32: CInt = 92

public val SC_V6_ILP32_OFF32: CInt = SC_V7_ILP32_OFF32

public val SC_XBS5_ILP32_OFF32: CInt = SC_V7_ILP32_OFF32

public val SC_V7_ILP32_OFFBIG: CInt = 93

public val SC_V6_ILP32_OFFBIG: CInt = SC_V7_ILP32_OFFBIG

public val SC_XBS5_ILP32_OFFBIG: CInt = SC_V7_ILP32_OFFBIG

public val SC_V7_LP64_OFF64: CInt = 94

public val SC_V6_LP64_OFF64: CInt = SC_V7_LP64_OFF64

public val SC_XBS5_LP64_OFF64: CInt = SC_V7_LP64_OFF64

public val SC_V7_LPBIG_OFFBIG: CInt = 95

public val SC_V6_LPBIG_OFFBIG: CInt = SC_V7_LPBIG_OFFBIG

public val SC_XBS5_LPBIG_OFFBIG: CInt = SC_V7_LPBIG_OFFBIG

public val SC_XOPEN_CRYPT: CInt = 96

public val SC_XOPEN_ENH_I18N: CInt = 97

public val SC_XOPEN_LEGACY: CInt = 98

public val SC_XOPEN_REALTIME: CInt = 99

public val SC_STREAM_MAX: CInt = 100

public val SC_PRIORITY_SCHEDULING: CInt = 101

public val SC_XOPEN_REALTIME_THREADS: CInt = 102

public val SC_XOPEN_SHM: CInt = 103

public val SC_XOPEN_STREAMS: CInt = 104

public val SC_XOPEN_UNIX: CInt = 105

public val SC_XOPEN_VERSION: CInt = 106

public val SC_2_CHAR_TERM: CInt = 107

public val SC_2_C_BIND: CInt = 108

public val SC_2_C_DEV: CInt = 109

public val SC_2_FORT_DEV: CInt = 110

public val SC_2_FORT_RUN: CInt = 111

public val SC_2_LOCALEDEF: CInt = 112

public val SC_2_PBS: CInt = 113

public val SC_2_PBS_ACCOUNTING: CInt = 114

public val SC_2_PBS_CHECKPOINT: CInt = 115

public val SC_2_PBS_LOCATE: CInt = 116

public val SC_2_PBS_MESSAGE: CInt = 117

public val SC_2_PBS_TRACK: CInt = 118

public val SC_2_SW_DEV: CInt = 119

public val SC_2_UPE: CInt = 120

public val SC_2_VERSION: CInt = 121

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 122

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 123

public val SC_XOPEN_UUCP: CInt = 124

public val SC_LEVEL1_ICACHE_SIZE: CInt = 125

public val SC_LEVEL1_ICACHE_ASSOC: CInt = 126

public val SC_LEVEL1_ICACHE_LINESIZE: CInt = 127

public val SC_LEVEL1_DCACHE_SIZE: CInt = 128

public val SC_LEVEL1_DCACHE_ASSOC: CInt = 129

public val SC_LEVEL1_DCACHE_LINESIZE: CInt = 130

public val SC_LEVEL2_CACHE_SIZE: CInt = 131

public val SC_LEVEL2_CACHE_ASSOC: CInt = 132

public val SC_LEVEL2_CACHE_LINESIZE: CInt = 133

public val SC_LEVEL3_CACHE_SIZE: CInt = 134

public val SC_LEVEL3_CACHE_ASSOC: CInt = 135

public val SC_LEVEL3_CACHE_LINESIZE: CInt = 136

public val SC_LEVEL4_CACHE_SIZE: CInt = 137

public val SC_LEVEL4_CACHE_ASSOC: CInt = 138

public val SC_LEVEL4_CACHE_LINESIZE: CInt = 139

public val PC_LINK_MAX: CInt = 0

public val PC_MAX_CANON: CInt = 1

public val PC_MAX_INPUT: CInt = 2

public val PC_NAME_MAX: CInt = 3

public val PC_PATH_MAX: CInt = 4

public val PC_PIPE_BUF: CInt = 5

public val PC_CHOWN_RESTRICTED: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_ASYNC_IO: CInt = 9

public val PC_PRIO_IO: CInt = 10

public val PC_SYNC_IO: CInt = 11

public val PC_FILESIZEBITS: CInt = 12

public val PC_2_SYMLINKS: CInt = 13

public val PC_SYMLINK_MAX: CInt = 14

public val PC_ALLOC_SIZE_MIN: CInt = 15

public val PC_REC_INCR_XFER_SIZE: CInt = 16

public val PC_REC_MAX_XFER_SIZE: CInt = 17

public val PC_REC_MIN_XFER_SIZE: CInt = 18

public val PC_REC_XFER_ALIGN: CInt = 19

public val PC_TIMESTAMP_RESOLUTION: CInt = 20

public val CS_PATH: CInt = 0

public val O_ACCMODE: CInt = 0x3

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val O_APPEND: CInt = 0x0008

public val O_CREAT: CInt = 0x0200

public val O_TRUNC: CInt = 0x0400

public val O_EXCL: CInt = 0x0800

public val O_SYNC: CInt = 0x2000

public val O_NONBLOCK: CInt = 0x4000

public val O_NOCTTY: CInt = 0x8000

public val O_CLOEXEC: CInt = 0x40000

public val O_NOFOLLOW: CInt = 0x100000

public val O_DIRECTORY: CInt = 0x200000

public val O_EXEC: CInt = 0x400000

public val O_SEARCH: CInt = 0x400000

public val O_DIRECT: CInt = 0x80000

public val O_DSYNC: CInt = 0x2000

public val O_RSYNC: CInt = 0x2000

public val O_TMPFILE: CInt = 0x800000

public val O_NOATIME: CInt = 0x1000000

public val O_PATH: CInt = 0x2000000

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

public val F_RGETLK: CInt = 10

public val F_RSETLK: CInt = 11

public val F_CNVT: CInt = 12

public val F_RSETLKW: CInt = 13

public val F_DUPFD_CLOEXEC: CInt = 14

public val F_RDLCK: CInt = 1

public val F_WRLCK: CInt = 2

public val F_UNLCK: CInt = 3

public val AT_FDCWD: CInt = -2

public val AT_EACCESS: CInt = 1

public val AT_SYMLINK_NOFOLLOW: CInt = 2

public val AT_SYMLINK_FOLLOW: CInt = 4

public val AT_REMOVEDIR: CInt = 8

public val AT_EMPTY_PATH: CInt = 16

public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_NB: CInt = 4

public val LOCK_UN: CInt = 8

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

public val ENOLCK: CInt = 46

public val EBADE: CInt = 50

public val EBADR: CInt = 51

public val EXFULL: CInt = 52

public val ENOANO: CInt = 53

public val EBADRQC: CInt = 54

public val EBADSLT: CInt = 55

public val EDEADLOCK: CInt = 56

public val EBFONT: CInt = 57

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

public val EDOTDOT: CInt = 76

public val EBADMSG: CInt = 77

public val EFTYPE: CInt = 79

public val ENOTUNIQ: CInt = 80

public val EBADFD: CInt = 81

public val EREMCHG: CInt = 82

public val ELIBACC: CInt = 83

public val ELIBBAD: CInt = 84

public val ELIBSCN: CInt = 85

public val ELIBMAX: CInt = 86

public val ELIBEXEC: CInt = 87

public val ENOSYS: CInt = 88

public val ENOTEMPTY: CInt = 90

public val ENAMETOOLONG: CInt = 91

public val ELOOP: CInt = 92

public val EOPNOTSUPP: CInt = 95

public val EPFNOSUPPORT: CInt = 96

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EAFNOSUPPORT: CInt = 106

public val EPROTOTYPE: CInt = 107

public val ENOTSOCK: CInt = 108

public val ENOPROTOOPT: CInt = 109

public val ESHUTDOWN: CInt = 110

public val ECONNREFUSED: CInt = 111

public val EADDRINUSE: CInt = 112

public val ECONNABORTED: CInt = 113

public val ENETUNREACH: CInt = 114

public val ENETDOWN: CInt = 115

public val ETIMEDOUT: CInt = 116

public val EHOSTDOWN: CInt = 117

public val EHOSTUNREACH: CInt = 118

public val EINPROGRESS: CInt = 119

public val EALREADY: CInt = 120

public val EDESTADDRREQ: CInt = 121

public val EMSGSIZE: CInt = 122

public val EPROTONOSUPPORT: CInt = 123

public val ESOCKTNOSUPPORT: CInt = 124

public val EADDRNOTAVAIL: CInt = 125

public val ENETRESET: CInt = 126

public val EISCONN: CInt = 127

public val ENOTCONN: CInt = 128

public val ETOOMANYREFS: CInt = 129

public val EPROCLIM: CInt = 130

public val EUSERS: CInt = 131

public val EDQUOT: CInt = 132

public val ESTALE: CInt = 133

public val ENOTSUP: CInt = 134

public val ENOMEDIUM: CInt = 135

public val EILSEQ: CInt = 138

public val EOVERFLOW: CInt = 139

public val ECANCELED: CInt = 140

public val ENOTRECOVERABLE: CInt = 141

public val EOWNERDEAD: CInt = 142

public val ESTRPIPE: CInt = 143

public val EWOULDBLOCK: CInt = EAGAIN

// Operation would block
public val SCHED_OTHER: CInt = 3

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val PTHREAD_COND_INITIALIZER: PthreadCondT = COpaquePointer(21.toLong())

public val PTHREAD_CREATE_DETACHED: CInt = 1

public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 0

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 1

public val PTHREAD_MUTEX_NORMAL: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = COpaquePointer(18.toLong())

public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = COpaquePointer(20.toLong())

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = COpaquePointer(19.toLong())

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val PTHREAD_PROCESS_PRIVATE: CInt = 0

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = COpaquePointer(22.toLong())

public val LITTLE_ENDIAN: CInt = 1234

public val BIG_ENDIAN: CInt = 4321

public val TCP_NODELAY: CInt = 1

public val TCP_KEEPIDLE: CInt = 3

public val TCP_MAXSEG: CInt = 4

public val TCP_QUICKACK: CInt = 12

public val TCP_USER_TIMEOUT: CInt = 14

public val TCP_FASTOPEN: CInt = 15

public val TCP_KEEPCNT: CInt = 16

public val TCP_KEEPINTVL: CInt = 17

public val WINDOWS_POST: CInt = 0

public val WINDOWS_SEND: CInt = 1

public val WINDOWS_HWND: CInt = 2

public val MOUNT_TEXT: CUint = 0x01u

public val MOUNT_SYSTEM: CUint = 0x08u

public val MOUNT_EXEC: CUint = 0x10u

public val MOUNT_CYGDRIVE: CUint = 0x20u

public val MOUNT_CYGWIN_EXEC: CUint = 0x40u

public val MOUNT_SPARSE: CUint = 0x80u

public val MOUNT_NOTEXEC: CUint = 0x100u

public val MOUNT_DEVFS: CUint = 0x200u

public val MOUNT_PROC: CUint = 0x400u

public val MOUNT_RO: CUint = 0x1000u

public val MOUNT_NOACL: CUint = 0x2000u

public val MOUNT_NOPOSIX: CUint = 0x4000u

public val MOUNT_OVERRIDE: CUint = 0x8000u

public val MOUNT_IMMUTABLE: CUint = 0x10000u

public val MOUNT_AUTOMATIC: CUint = 0x20000u

public val MOUNT_DOS: CUint = 0x40000u

public val MOUNT_IHASH: CUint = 0x80000u

public val MOUNT_BIND: CUint = 0x100000u

public val MOUNT_USER_TEMP: CUint = 0x200000u

public val MOUNT_DONT_USE: CUint = 0x80000000u

public val POSIX_VDISABLE: CcT = 0u

public val GRND_NONBLOCK: CUint = 0x1u

public val GRND_RANDOM: CUint = 0x2u

public val IOFBF: CInt = 0

public val IOLBF: CInt = 1

public val IONBF: CInt = 2

public val BUFSIZ: CInt = 1024

public val POSIX_SPAWN_RESETIDS: CInt = 0x01

public val POSIX_SPAWN_SETPGROUP: CInt = 0x02

public val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x04

public val POSIX_SPAWN_SETSCHEDULER: CInt = 0x08

public val POSIX_SPAWN_SETSIGDEF: CInt = 0x10

public val POSIX_SPAWN_SETSIGMASK: CInt = 0x20

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_SEQUENTIAL: CInt = 1

public val POSIX_FADV_RANDOM: CInt = 2

public val POSIX_FADV_WILLNEED: CInt = 3

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val FALLOC_FL_PUNCH_HOLE: CInt = 0x0001

public val FALLOC_FL_ZERO_RANGE: CInt = 0x0002

public val FALLOC_FL_UNSHARE_RANGE: CInt = 0x0004

public val FALLOC_FL_COLLAPSE_RANGE: CInt = 0x0008

public val FALLOC_FL_INSERT_RANGE: CInt = 0x0010

public val FALLOC_FL_KEEP_SIZE: CInt = 0x1000

public fun cmsgAlign(len: Int): Int {
    return len + sizeOf<Int>() - 1 and (sizeOf<Int>() - 1).inv()
}

public fun sigwait(set: CUlong?, sig: CInt?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_1 = if (sig == null) 0L else LibcDynamicFfi.allocScalarSlot(sig.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwait", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sigwaitinfo(set: CUlong?, info: SiginfoT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwaitinfo", -1, longArrayOf(__slot_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSigmask(how: CInt, set: CUlong?, oldset: CUlong?): CInt {
    val __slot_1 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_2 = if (oldset == null) 0L else LibcDynamicFfi.allocScalarSlot(oldset.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_sigmask", -1, longArrayOf(how.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sigsuspend(mask: CUlong?): CInt {
    val __slot_0 = if (mask == null) 0L else LibcDynamicFfi.allocScalarSlot(mask.toLong())
    try {
        return LibcDynamicFfi.invoke("sigsuspend", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigaltstack(ss: StackT?, oss: StackT?): CInt {
    return LibcDynamicFfi.invoke("sigaltstack", -1, longArrayOf(ss?.value ?: 0L, oss?.value ?: 0L)).toInt()
}

public fun pthreadKill(thread: PthreadT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_kill", -1, longArrayOf(thread?.value ?: 0L, sig.toLong())).toInt()
}

public fun sigtimedwait(set: CUlong?, info: SiginfoT?, timeout: Timespec?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigtimedwait", -1, longArrayOf(__slot_0, info?.value ?: 0L, timeout?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
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

public fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("asctime_r", -1, longArrayOf(tm?.value ?: 0L, buf?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ctimeR(timep: CLong?, buf: COpaquePointer?): COpaquePointer? {
    val __slot_0 = if (timep == null) 0L else LibcDynamicFfi.allocScalarSlot(timep)
    try {
        val rawRet = LibcDynamicFfi.invoke("ctime_r", -1, longArrayOf(__slot_0, buf?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
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

public fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_settime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_getres", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: CUlong?): CInt {
    val __slot_2 = if (timerid == null) 0L else LibcDynamicFfi.allocScalarSlot(timerid.toLong())
    try {
        return LibcDynamicFfi.invoke("timer_create", -1, longArrayOf(clockid.toLong(), sevp?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun timerDelete(timerid: TimerT): CInt {
    return LibcDynamicFfi.invoke("timer_delete", -1, longArrayOf(timerid.toLong())).toInt()
}

public fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timer_settime", -1, longArrayOf(timerid.toLong(), flags.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
}

public fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timer_gettime", -1, longArrayOf(timerid.toLong(), currValue?.value ?: 0L)).toInt()
}

public fun timerGetoverrun(timerid: TimerT): CInt {
    return LibcDynamicFfi.invoke("timer_getoverrun", -1, longArrayOf(timerid.toLong())).toInt()
}

public fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_nanosleep", -1, longArrayOf(clkId.toLong(), flags.toLong(), rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}

public fun clockGetcpuclockid(pid: PidT, clkId: CUlong?): CInt {
    val __slot_1 = if (clkId == null) 0L else LibcDynamicFfi.allocScalarSlot(clkId.toLong())
    try {
        return LibcDynamicFfi.invoke("clock_getcpuclockid", -1, longArrayOf(pid.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun futimes(fd: CInt, times: Timeval?): CInt {
    return LibcDynamicFfi.invoke("futimes", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun lutimes(file: String?, times: Timeval?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("lutimes", -1, longArrayOf(__cstr_0, times?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun settimeofday(tv: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("settimeofday", -1, longArrayOf(tv?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun getitimer(which: CInt, currValue: Itimerval?): CInt {
    return LibcDynamicFfi.invoke("getitimer", -1, longArrayOf(which.toLong(), currValue?.value ?: 0L)).toInt()
}

public fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt {
    return LibcDynamicFfi.invoke("setitimer", -1, longArrayOf(which.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
}

public fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("futimesat", -1, longArrayOf(fd.toLong(), __cstr_1, times?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun getpriority(which: CInt, who: IdT): CInt {
    return LibcDynamicFfi.invoke("getpriority", -1, longArrayOf(which.toLong(), who.toLong())).toInt()
}

public fun setpriority(which: CInt, who: IdT, prio: CInt): CInt {
    return LibcDynamicFfi.invoke("setpriority", -1, longArrayOf(which.toLong(), who.toLong(), prio.toLong())).toInt()
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

public fun getpwent(): Passwd? {
    val rawRet = LibcDynamicFfi.invoke("getpwent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setpwent() {
    LibcDynamicFfi.invoke("setpwent", -1, longArrayOf())
}

public fun endpwent() {
    LibcDynamicFfi.invoke("endpwent", -1, longArrayOf())
}

public fun ifNameindex(): IfNameindex? {
    val rawRet = LibcDynamicFfi.invoke("if_nameindex", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ifFreenameindex(ptr: IfNameindex?) {
    LibcDynamicFfi.invoke("if_freenameindex", -1, longArrayOf(ptr?.value ?: 0L))
}

public fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("readv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mkfifoat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mknodat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), dev.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("utimensat", -1, longArrayOf(dirfd.toLong(), __cstr_1, times?.value ?: 0L, flag.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun futimens(fd: CInt, times: Timespec?): CInt {
    return LibcDynamicFfi.invoke("futimens", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun dlfork(value: CInt) {
    LibcDynamicFfi.invoke("dlfork", -1, longArrayOf(value.toLong()))
}

public fun accept4(s: CInt, addr: Sockaddr?, addrlen: CInt?, flags: CInt): CInt {
    val __slot_2 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("accept4", -1, longArrayOf(s.toLong(), addr?.value ?: 0L, __slot_2, flags.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("bind", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, addressLen.toLong())).toInt()
}

public fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: CInt?): SsizeT {
    val __slot_5 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), addr?.value ?: 0L, __slot_5))
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("recvmsg", -1, longArrayOf(fd.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("sendmsg", -1, longArrayOf(fd.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, sevlen: SocklenT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(sa?.value ?: 0L, salen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, sevlen.toLong(), flags.toLong())).toInt()
}

public fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: CUlong?): CInt {
    val __slot_3 = if (sigmask == null) 0L else LibcDynamicFfi.allocScalarSlot(sigmask.toLong())
    try {
        return LibcDynamicFfi.invoke("ppoll", -1, longArrayOf(fds?.value ?: 0L, nfds.toLong(), timeout?.value ?: 0L, __slot_3)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
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

public fun freelocale(loc: LocaleT) {
    LibcDynamicFfi.invoke("freelocale", -1, longArrayOf(loc?.value ?: 0L))
}

public fun duplocale(base: LocaleT): LocaleT {
    val rawRet = LibcDynamicFfi.invoke("duplocale", -1, longArrayOf(base?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun uselocale(loc: LocaleT): LocaleT {
    val rawRet = LibcDynamicFfi.invoke("uselocale", -1, longArrayOf(loc?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt {
    return LibcDynamicFfi.invoke("sem_init", -1, longArrayOf(sem?.value ?: 0L, pshared.toLong(), value.toLong())).toInt()
}

public fun semDestroy(sem: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("sem_destroy", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("sem_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs)
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun semClose(sem: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("sem_close", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sem_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun semTimedwait(sem: COpaquePointer?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sem_timedwait", -1, longArrayOf(sem?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun semGetvalue(sem: COpaquePointer?, sval: CInt?): CInt {
    val __slot_1 = if (sval == null) 0L else LibcDynamicFfi.allocScalarSlot(sval.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_getvalue", -1, longArrayOf(sem?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun clearenv(): CInt {
    return LibcDynamicFfi.invoke("clearenv", -1, longArrayOf()).toInt()
}

public fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("ptsname_r", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun getpt(): CInt {
    return LibcDynamicFfi.invoke("getpt", -1, longArrayOf()).toInt()
}

public fun memalign(align: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memalign", -1, longArrayOf(align.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt {
    val __slot_0 = if (loadavg == null) 0L else LibcDynamicFfi.allocScalarSlot(loadavg.toRawBits())
    try {
        return LibcDynamicFfi.invoke("getloadavg", -1, longArrayOf(__slot_0, nelem.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun abs(i: CInt): CInt {
    return LibcDynamicFfi.invoke("abs", -1, longArrayOf(i.toLong())).toInt()
}

public fun arc4random(): UInt {
    return LibcDynamicFfi.invoke("arc4random", -1, longArrayOf()).toUInt()
}

public fun arc4randomUniform(l: UInt): UInt {
    return LibcDynamicFfi.invoke("arc4random_uniform", -1, longArrayOf(l.toLong())).toUInt()
}

public fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    LibcDynamicFfi.invoke("arc4random_buf", -1, longArrayOf(buf?.value ?: 0L, size.toLong()))
}

public fun labs(i: CLong): CLong {
    return LibcDynamicFfi.invoke("labs", -1, longArrayOf(i))
}

public fun mkostemp(template: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemp", -1, longArrayOf(template?.value ?: 0L, flags.toLong())).toInt()
}

public fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong(), flags.toLong())).toInt()
}

public fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt {
    return LibcDynamicFfi.invoke("mkstemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong())).toInt()
}

public fun rand(): CInt {
    return LibcDynamicFfi.invoke("rand", -1, longArrayOf()).toInt()
}

public fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("reallocarray", -1, longArrayOf(ptr?.value ?: 0L, nmemb.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("reallocf", -1, longArrayOf(ptr?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun srand(seed: CUint) {
    LibcDynamicFfi.invoke("srand", -1, longArrayOf(seed.toLong()))
}

public fun drand48(): CDouble {
    return LibcDynamicFfi.invokeFp("drand48", 0, false, longArrayOf())
}

public fun erand48(xseed: CUshort?): CDouble {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invokeFp("erand48", 0, false, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun jrand48(xseed: CUshort?): CLong {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invoke("jrand48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun lcong48(p: CUshort?) {
    val __slot_0 = if (p == null) 0L else LibcDynamicFfi.allocScalarSlot(p.toLong())
    try {
        LibcDynamicFfi.invoke("lcong48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun lrand48(): CLong {
    return LibcDynamicFfi.invoke("lrand48", -1, longArrayOf())
}

public fun mrand48(): CLong {
    return LibcDynamicFfi.invoke("mrand48", -1, longArrayOf())
}

public fun nrand48(xseed: CUshort?): CLong {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        return LibcDynamicFfi.invoke("nrand48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun seed48(xseed: CUshort?): CUshort? {
    val __slot_0 = if (xseed == null) 0L else LibcDynamicFfi.allocScalarSlot(xseed.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("seed48", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 2).toUShort()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun srand48(seed: CLong) {
    LibcDynamicFfi.invoke("srand48", -1, longArrayOf(seed))
}

public fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    LibcDynamicFfi.invoke("qsort_r", -1, longArrayOf(base?.value ?: 0L, num.toLong(), size.toLong(), compar?.value ?: 0L, arg?.value ?: 0L))
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("msync", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_open", -1, longArrayOf(__cstr_0, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun shmUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    LibcDynamicFfi.invoke("explicit_bzero", -1, longArrayOf(s?.value ?: 0L, len.toLong()))
}

public fun ffs(value: CInt): CInt {
    return LibcDynamicFfi.invoke("ffs", -1, longArrayOf(value.toLong())).toInt()
}

public fun ffsl(value: CLong): CInt {
    return LibcDynamicFfi.invoke("ffsl", -1, longArrayOf(value)).toInt()
}

public fun ffsll(value: CLonglong): CInt {
    return LibcDynamicFfi.invoke("ffsll", -1, longArrayOf(value)).toInt()
}

public fun fls(value: CInt): CInt {
    return LibcDynamicFfi.invoke("fls", -1, longArrayOf(value.toLong())).toInt()
}

public fun flsl(value: CLong): CInt {
    return LibcDynamicFfi.invoke("flsl", -1, longArrayOf(value)).toInt()
}

public fun flsll(value: CLonglong): CInt {
    return LibcDynamicFfi.invoke("flsll", -1, longArrayOf(value)).toInt()
}

public fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strcasecmp_l", -1, longArrayOf(__cstr_0, __cstr_1, loc?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strncasecmp_l", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong(), loc?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("timingsafe_bcmp", -1, longArrayOf(a?.value ?: 0L, b?.value ?: 0L, len.toLong())).toInt()
}

public fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("timingsafe_memcmp", -1, longArrayOf(a?.value ?: 0L, b?.value ?: 0L, len.toLong())).toInt()
}

public fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmem", -1, longArrayOf(haystack?.value ?: 0L, haystacklen.toLong(), needle?.value ?: 0L, needlelen.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memrchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("__xpg_strerror_r", -1, longArrayOf(errnum.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? {
    val __cstr_1 = if (delim == null) 0L else LibcDynamicFfi.allocUtf8CString(delim)
    try {
        val rawRet = LibcDynamicFfi.invoke("strsep", -1, longArrayOf(string?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun basename(path: String?): COpaquePointer? {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        val rawRet = LibcDynamicFfi.invoke("__gnu_basename", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun daemon(nochdir: CInt, noclose: CInt): CInt {
    return LibcDynamicFfi.invoke("daemon", -1, longArrayOf(nochdir.toLong(), noclose.toLong())).toInt()
}

public fun dup3(src: CInt, dst: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("dup3", -1, longArrayOf(src.toLong(), dst.toLong(), flags.toLong())).toInt()
}

public fun eaccess(pathname: String?, mode: CInt): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("eaccess", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun euidaccess(pathname: String?, mode: CInt): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("euidaccess", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("execvpe", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("faccessat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fexecve", -1, longArrayOf(fd.toLong(), argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
}

public fun fdatasync(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("fdatasync", -1, longArrayOf(fd.toLong())).toInt()
}

public fun getdomainname(name: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("getdomainname", -1, longArrayOf(name?.value ?: 0L, len.toLong())).toInt()
}

public fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("getentropy", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun gethostid(): CLong {
    return LibcDynamicFfi.invoke("gethostid", -1, longArrayOf())
}

public fun getpagesize(): CInt {
    return LibcDynamicFfi.invoke("getpagesize", -1, longArrayOf()).toInt()
}

public fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt {
    val __slot_1 = if (euid == null) 0L else LibcDynamicFfi.allocScalarSlot(euid.toLong())
    val __slot_2 = if (egid == null) 0L else LibcDynamicFfi.allocScalarSlot(egid.toLong())
    try {
        return LibcDynamicFfi.invoke("getpeereid", -1, longArrayOf(socket.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt {
    return LibcDynamicFfi.invoke("pthread_atfork", -1, longArrayOf(prepare?.value ?: 0L, parent?.value ?: 0L, child?.value ?: 0L)).toInt()
}

public fun pipe2(fds: CInt?, flags: CInt): CInt {
    val __slot_0 = if (fds == null) 0L else LibcDynamicFfi.allocScalarSlot(fds.toLong())
    try {
        return LibcDynamicFfi.invoke("pipe2", -1, longArrayOf(__slot_0, flags.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sbrk(increment: IntptrT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("sbrk", -1, longArrayOf(increment))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setgroups(ngroups: CInt, ptr: GidT?): CInt {
    val __slot_1 = if (ptr == null) 0L else LibcDynamicFfi.allocScalarSlot(ptr.toLong())
    try {
        return LibcDynamicFfi.invoke("setgroups", -1, longArrayOf(ngroups.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sethostname(name: String?, len: SizeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sethostname", -1, longArrayOf(__cstr_0, len.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun vhangup(): CInt {
    return LibcDynamicFfi.invoke("vhangup", -1, longArrayOf()).toInt()
}

public fun getdtablesize(): CInt {
    return LibcDynamicFfi.invoke("getdtablesize", -1, longArrayOf()).toInt()
}

public fun sync() {
    LibcDynamicFfi.invoke("sync", -1, longArrayOf())
}

public fun errno(): CInt? {
    val rawRet = LibcDynamicFfi.invoke("__errno", -1, longArrayOf())
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
}

public fun schedSetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedGetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_getparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setscheduler", -1, longArrayOf(pid.toLong(), policy.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedGetscheduler(pid: PidT): CInt {
    return LibcDynamicFfi.invoke("sched_getscheduler", -1, longArrayOf(pid.toLong())).toInt()
}

public fun schedGetPriorityMax(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_max", -1, longArrayOf(policy.toLong())).toInt()
}

public fun schedGetPriorityMin(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_min", -1, longArrayOf(policy.toLong())).toInt()
}

public fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sched_rr_get_interval", -1, longArrayOf(pid.toLong(), t?.value ?: 0L)).toInt()
}

public fun schedGetcpu(): CInt {
    return LibcDynamicFfi.invoke("sched_getcpu", -1, longArrayOf()).toInt()
}

public fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("sched_getaffinity", -1, longArrayOf(pid.toLong(), cpusetsize.toLong(), mask?.value ?: 0L)).toInt()
}

public fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("sched_setaffinity", -1, longArrayOf(pid.toLong(), cpusetsize.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt {
    val __slot_1 = if (guardsize == null) 0L else LibcDynamicFfi.allocScalarSlot(guardsize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getguardsize", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_getschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt {
    val __slot_2 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstack", -1, longArrayOf(attr?.value ?: 0L, stackaddr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadCancel(thread: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_cancel", -1, longArrayOf(thread?.value ?: 0L)).toInt()
}

public fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: CUlong?): CInt {
    val __slot_1 = if (clockId == null) 0L else LibcDynamicFfi.allocScalarSlot(clockId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_getclock", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt {
    val __slot_1 = if (pshared == null) 0L else LibcDynamicFfi.allocScalarSlot(pshared.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_getpshared", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setclock", -1, longArrayOf(attr?.value ?: 0L, clockId.toLong())).toInt()
}

public fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, pshared.toLong())).toInt()
}

public fun pthreadBarrierattrInit(attr: ULong?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_barrierattr_init", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadBarrierattrSetpshared(attr: ULong?, shared: CInt): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_barrierattr_setpshared", -1, longArrayOf(__slot_0, shared.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadBarrierattrGetpshared(attr: ULong?, shared: CInt?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __slot_1 = if (shared == null) 0L else LibcDynamicFfi.allocScalarSlot(shared.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_barrierattr_getpshared", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadBarrierattrDestroy(attr: ULong?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_barrierattr_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadBarrierInit(barrier: ULong?, attr: ULong?, count: CUint): CInt {
    val __slot_0 = if (barrier == null) 0L else LibcDynamicFfi.allocScalarSlot(barrier.toLong())
    val __slot_1 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_barrier_init", -1, longArrayOf(__slot_0, __slot_1, count.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadBarrierDestroy(barrier: ULong?): CInt {
    val __slot_0 = if (barrier == null) 0L else LibcDynamicFfi.allocScalarSlot(barrier.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_barrier_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadBarrierWait(barrier: ULong?): CInt {
    val __slot_0 = if (barrier == null) 0L else LibcDynamicFfi.allocScalarSlot(barrier.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_barrier_wait", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt {
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(native?.value ?: 0L, attr?.value ?: 0L, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadGetcpuclockid(thread: PthreadT, clkId: CUlong?): CInt {
    val __slot_1 = if (clkId == null) 0L else LibcDynamicFfi.allocScalarSlot(clkId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_getcpuclockid", -1, longArrayOf(thread?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt {
    val __slot_1 = if (policy == null) 0L else LibcDynamicFfi.allocScalarSlot(policy.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_getschedparam", -1, longArrayOf(native?.value ?: 0L, __slot_1, param?.value ?: 0L)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_timedlock", -1, longArrayOf(lock?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: CInt?): CInt {
    val __slot_1 = if (protocol == null) 0L else LibcDynamicFfi.allocScalarSlot(protocol.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutexattr_getprotocol", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt {
    val __slot_1 = if (pshared == null) 0L else LibcDynamicFfi.allocScalarSlot(pshared.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutexattr_getpshared", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_setprotocol", -1, longArrayOf(attr?.value ?: 0L, protocol.toLong())).toInt()
}

public fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, pshared.toLong())).toInt()
}

public fun pthreadSpinDestroy(lock: ULong?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinInit(lock: ULong?, pshared: CInt): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_init", -1, longArrayOf(__slot_0, pshared.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinLock(lock: ULong?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_lock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinTrylock(lock: ULong?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_trylock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinUnlock(lock: ULong?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_unlock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: CInt?): CInt {
    val __slot_1 = if (value == null) 0L else LibcDynamicFfi.allocScalarSlot(value.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_rwlockattr_getpshared", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, value.toLong())).toInt()
}

public fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("pthread_setschedparam", -1, longArrayOf(native?.value ?: 0L, policy.toLong(), param?.value ?: 0L)).toInt()
}

public fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_setschedprio", -1, longArrayOf(native?.value ?: 0L, priority.toLong())).toInt()
}

public fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("pthread_getaffinity_np", -1, longArrayOf(thread?.value ?: 0L, cpusetsize.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_getattr_np", -1, longArrayOf(native?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_getname_np", -1, longArrayOf(thread?.value ?: 0L, name?.value ?: 0L, len.toLong())).toInt()
}

public fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("pthread_setaffinity_np", -1, longArrayOf(thread?.value ?: 0L, cpusetsize.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("pthread_setname_np", -1, longArrayOf(thread?.value ?: 0L, __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt {
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_sigqueue", -1, longArrayOf(thread?.value ?: 0L, sig.toLong(), __scratch_2)).toInt()
    } finally {
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("ioctl", 2, longArrayOf(fd.toLong(), request.toLong()) + variadicArgs).toInt()
}

public fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("getrandom", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong(), flags.toLong()))
}

public fun mount(src: String?, target: String?, flags: CUint): CInt {
    val __cstr_0 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    val __cstr_1 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    try {
        return LibcDynamicFfi.invoke("mount", -1, longArrayOf(__cstr_0, __cstr_1, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun umount(target: String?): CInt {
    val __cstr_0 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    try {
        return LibcDynamicFfi.invoke("umount", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun cygwinUmount(target: String?, flags: CUint): CInt {
    val __cstr_0 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    try {
        return LibcDynamicFfi.invoke("cygwin_umount", -1, longArrayOf(__cstr_0, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun dirfd(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("dirfd", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

public fun seekdir(dirp: DIR?, loc: CLong) {
    LibcDynamicFfi.invoke("seekdir", -1, longArrayOf(dirp?.handle ?: 0L, loc))
}

public fun telldir(dirp: DIR?): CLong {
    return LibcDynamicFfi.invoke("telldir", -1, longArrayOf(dirp?.handle ?: 0L))
}

public fun uname(buf: Utsname?): CInt {
    return LibcDynamicFfi.invoke("uname", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __slot_0 = if (pid == null) 0L else LibcDynamicFfi.allocScalarSlot(pid.toLong())
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn", -1, longArrayOf(__slot_0, __cstr_1, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __slot_0 = if (pid == null) 0L else LibcDynamicFfi.allocScalarSlot(pid.toLong())
    val __cstr_1 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("posix_spawnp", -1, longArrayOf(__slot_0, __cstr_1, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnattrInit(attr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: CUlong?): CInt {
    val __slot_1 = if (default == null) 0L else LibcDynamicFfi.allocScalarSlot(default.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getsigdefault", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: CUlong?): CInt {
    val __slot_1 = if (default == null) 0L else LibcDynamicFfi.allocScalarSlot(default.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_setsigdefault", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: CUlong?): CInt {
    val __slot_1 = if (default == null) 0L else LibcDynamicFfi.allocScalarSlot(default.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getsigmask", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: CUlong?): CInt {
    val __slot_1 = if (default == null) 0L else LibcDynamicFfi.allocScalarSlot(default.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_setsigmask", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt {
    val __slot_1 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getflags", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setflags", -1, longArrayOf(attr?.value ?: 0L, flags.toLong())).toInt()
}

public fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt {
    val __slot_1 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getpgroup", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setpgroup", -1, longArrayOf(attr?.value ?: 0L, flags.toLong())).toInt()
}

public fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: CInt?): CInt {
    val __slot_1 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getschedpolicy", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setschedpolicy", -1, longArrayOf(attr?.value ?: 0L, flags.toLong())).toInt()
}

public fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_getschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_init", -1, longArrayOf(actions?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_destroy", -1, longArrayOf(actions?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_2 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addopen", -1, longArrayOf(actions?.value ?: 0L, fd.toLong(), __cstr_2, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addclose", -1, longArrayOf(actions?.value ?: 0L, fd.toLong())).toInt()
}

public fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_adddup2", -1, longArrayOf(actions?.value ?: 0L, fd.toLong(), newfd.toLong())).toInt()
}

public fun posixSpawnFileActionsAddchdir(actions: COpaquePointer?, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addchdir", -1, longArrayOf(actions?.value ?: 0L, __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnFileActionsAddfchdir(actions: COpaquePointer?, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addfchdir", -1, longArrayOf(actions?.value ?: 0L, fd.toLong())).toInt()
}

public fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addchdir_np", -1, longArrayOf(actions?.value ?: 0L, __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addfchdir_np", -1, longArrayOf(actions?.value ?: 0L, fd.toLong())).toInt()
}

public fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    try {
        return LibcDynamicFfi.invoke("forkpty", -1, longArrayOf(__slot_0, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    val __slot_1 = if (aslave == null) 0L else LibcDynamicFfi.allocScalarSlot(aslave.toLong())
    try {
        return LibcDynamicFfi.invoke("openpty", -1, longArrayOf(__slot_0, __slot_1, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getgrgid(gid: GidT): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrgid", -1, longArrayOf(gid.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrgid_r", -1, longArrayOf(gid.toLong(), grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt {
    val __cstr_0 = if (user == null) 0L else LibcDynamicFfi.allocUtf8CString(user)
    val __slot_2 = if (groups == null) 0L else LibcDynamicFfi.allocScalarSlot(groups.toLong())
    val __slot_3 = if (ngroups == null) 0L else LibcDynamicFfi.allocScalarSlot(ngroups.toLong())
    try {
        return LibcDynamicFfi.invoke("getgrouplist", -1, longArrayOf(__cstr_0, group.toLong(), __slot_2, __slot_3)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun getgrnam(name: String?): Group? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getgrnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getgrnam_r", -1, longArrayOf(__cstr_0, grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun initgroups(user: String?, group: GidT): CInt {
    val __cstr_0 = if (user == null) 0L else LibcDynamicFfi.allocUtf8CString(user)
    try {
        return LibcDynamicFfi.invoke("initgroups", -1, longArrayOf(__cstr_0, group.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
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

public fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_fadvise", -1, longArrayOf(fd.toLong(), offset, len, advise.toLong())).toInt()
}

public fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt {
    return LibcDynamicFfi.invoke("posix_fallocate", -1, longArrayOf(fd.toLong(), offset, len)).toInt()
}

public fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt {
    return LibcDynamicFfi.invoke("fallocate", -1, longArrayOf(fd.toLong(), mode.toLong(), offset, len)).toInt()
}

public fun endutxent() {
    LibcDynamicFfi.invoke("endutxent", -1, longArrayOf())
}

public fun getutxent(): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxid(id: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxid", -1, longArrayOf(id?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxline(line: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxline", -1, longArrayOf(line?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pututxline(utmpx: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("pututxline", -1, longArrayOf(utmpx?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setutxent() {
    LibcDynamicFfi.invoke("setutxent", -1, longArrayOf())
}

public fun utmpxname(file: String?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utmpxname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun updwtmpx(file: String?, utmpx: Utmpx?) {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        LibcDynamicFfi.invoke("updwtmpx", -1, longArrayOf(__cstr_0, utmpx?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}
