package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import CpuidT
import LwpidT
import cmsghdr
import offT

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: DlPhdrInfo?, size: ULong, data: COpaquePointer?): CInt
}

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun interface EsetfuncCbCallback {
    public operator fun invoke(arg0: CInt, arg1: COpaquePointer?)
}

public typealias BlksizeT = Int

public typealias EventfdT = ULong

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias IdtypeT = CInt

public typealias PthreadSpinT = CpuSimpleLockNvT

public typealias ShmattT = CUint

public typealias CpusetT = Cpuset

// elf.h
public typealias Elf32Addr = UInt

public typealias Elf32Half = UShort

public typealias Elf32Lword = ULong

public typealias Elf32Off = UInt

public typealias Elf32Sword = Int

public typealias Elf32Word = UInt

public typealias Elf64Addr = ULong

public typealias Elf64Half = UShort

public typealias Elf64Lword = ULong

public typealias Elf64Off = ULong

public typealias Elf64Sword = Int

public typealias Elf64Sxword = Long

public typealias Elf64Word = UInt

public typealias Elf64Xword = ULong

public typealias IconvT = COpaquePointer?

public fun SiginfoT.siAddr(): COpaquePointer? {
    return this.siAddr
}

public fun SiginfoT.siCode(): CInt {
    return this.siCode
}

public fun SiginfoT.siErrno(): CInt {
    return this.siErrno
}

public fun SiginfoT.siPid(): PidT {
    open class SiginfoTimer(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var pad1: CInt,
        public var pid: PidT,
    )
    return (((this as SiginfoT?) as SiginfoTimer?)).pid
}

public fun SiginfoT.siUid(): UidT {
    open class SiginfoTimer(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var pad1: CInt,
        public var pid: PidT,
        public var uid: UidT,
    )
    return (((this as SiginfoT?) as SiginfoTimer?)).uid
}

public fun SiginfoT.siValue(): Sigval {
    open class SiginfoTimer(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var pad1: CInt,
        public var pid: PidT,
        public var uid: UidT,
        public var value: Sigval,
    )
    return (((this as SiginfoT?) as SiginfoTimer?)).value
}

public fun SiginfoT.siStatus(): CInt {
    open class SiginfoTimer(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var pad1: CInt,
        public var pid: PidT,
        public var uid: UidT,
        public var status: CInt,
    )
    return (((this as SiginfoT?) as SiginfoTimer?)).status
}

public val AT_FDCWD: CInt = -100

public val AT_EACCESS: CInt = 0x100

public val AT_SYMLINK_NOFOLLOW: CInt = 0x200

public val AT_SYMLINK_FOLLOW: CInt = 0x400

public val AT_REMOVEDIR: CInt = 0x800

public val AT_NULL: CInt = 0

public val AT_IGNORE: CInt = 1

public val AT_EXECFD: CInt = 2

public val AT_PHDR: CInt = 3

public val AT_PHENT: CInt = 4

public val AT_PHNUM: CInt = 5

public val AT_PAGESZ: CInt = 6

public val AT_BASE: CInt = 7

public val AT_FLAGS: CInt = 8

public val AT_ENTRY: CInt = 9

public val AT_DCACHEBSIZE: CInt = 10

public val AT_ICACHEBSIZE: CInt = 11

public val AT_UCACHEBSIZE: CInt = 12

public val AT_STACKBASE: CInt = 13

public val AT_EUID: CInt = 2000

public val AT_RUID: CInt = 2001

public val AT_EGID: CInt = 2002

public val AT_RGID: CInt = 2003

public val AT_SUN_LDELF: CInt = 2004

public val AT_SUN_LDSHDR: CInt = 2005

public val AT_SUN_LDNAME: CInt = 2006

public val AT_SUN_PLATFORM: CInt = 2008

public val AT_SUN_HWCAP: CInt = 2009

public val AT_SUN_IFLUSH: CInt = 2010

public val AT_SUN_CPU: CInt = 2011

public val AT_SUN_EMUL_ENTRY: CInt = 2012

public val AT_SUN_EMUL_EXECFD: CInt = 2013

public val AT_SUN_EXECNAME: CInt = 2014

public val EXTATTR_NAMESPACE_USER: CInt = 1

public val EXTATTR_NAMESPACE_SYSTEM: CInt = 2

public val LC_COLLATE_MASK: CInt = 1 shl LC_COLLATE

public val LC_CTYPE_MASK: CInt = 1 shl LC_CTYPE

public val LC_MONETARY_MASK: CInt = 1 shl LC_MONETARY

public val LC_NUMERIC_MASK: CInt = 1 shl LC_NUMERIC

public val LC_TIME_MASK: CInt = 1 shl LC_TIME

public val LC_MESSAGES_MASK: CInt = 1 shl LC_MESSAGES

public val LC_ALL_MASK: CInt = 0.inv()

public val ERA: NlItem = 52

public val ERA_D_FMT: NlItem = 53

public val ERA_D_T_FMT: NlItem = 54

public val ERA_T_FMT: NlItem = 55

public val ALT_DIGITS: NlItem = 56

public val O_CLOEXEC: CInt = 0x400000

public val O_ALT_IO: CInt = 0x40000

public val O_NOSIGPIPE: CInt = 0x1000000

public val O_SEARCH: CInt = 0x800000

public val O_DIRECTORY: CInt = 0x200000

public val O_DIRECT: CInt = 0x00080000

public val O_RSYNC: CInt = 0x00020000

public val MS_SYNC: CInt = 0x4

public val MS_INVALIDATE: CInt = 0x2

// Here because they are not present on OpenBSD
// (https://github.com/openbsd/src/blob/HEAD/sys/sys/resource.h)
public val RLIMIT_SBSIZE: CInt = 9

public val RLIMIT_AS: CInt = 10

public val RLIMIT_NTHR: CInt = 11

public val RLIM_NLIMITS: CInt = 12

public val EIDRM: CInt = 82

public val ENOMSG: CInt = 83

public val EOVERFLOW: CInt = 84

public val EILSEQ: CInt = 85

public val ENOTSUP: CInt = 86

public val ECANCELED: CInt = 87

public val EBADMSG: CInt = 88

public val ENODATA: CInt = 89

public val ENOSR: CInt = 90

public val ENOSTR: CInt = 91

public val ETIME: CInt = 92

public val ENOATTR: CInt = 93

public val EMULTIHOP: CInt = 94

public val ENOLINK: CInt = 95

public val EPROTO: CInt = 96

public val EOWNERDEAD: CInt = 97

public val ENOTRECOVERABLE: CInt = 98

public val ELAST: CInt = 98

public val F_DUPFD_CLOEXEC: CInt = 12

public val F_CLOSEM: CInt = 10

public val F_GETNOSIGPIPE: CInt = 13

public val F_SETNOSIGPIPE: CInt = 14

public val F_MAXFD: CInt = 11

public val F_GETPATH: CInt = 15

public val FUTEX_WAIT: CInt = 0

public val FUTEX_WAKE: CInt = 1

public val FUTEX_FD: CInt = 2

public val FUTEX_REQUEUE: CInt = 3

public val FUTEX_CMP_REQUEUE: CInt = 4

public val FUTEX_WAKE_OP: CInt = 5

public val FUTEX_LOCK_PI: CInt = 6

public val FUTEX_UNLOCK_PI: CInt = 7

public val FUTEX_TRYLOCK_PI: CInt = 8

public val FUTEX_WAIT_BITSET: CInt = 9

public val FUTEX_WAKE_BITSET: CInt = 10

public val FUTEX_WAIT_REQUEUE_PI: CInt = 11

public val FUTEX_CMP_REQUEUE_PI: CInt = 12

public val FUTEX_PRIVATE_FLAG: CInt = 1 shl 7

public val FUTEX_CLOCK_REALTIME: CInt = 1 shl 8

public val FUTEX_CMD_MASK: CInt = (FUTEX_PRIVATE_FLAG or FUTEX_CLOCK_REALTIME).inv()

public val FUTEX_WAITERS: UInt = 1u shl 31

public val FUTEX_OWNER_DIED: UInt = 1u shl 30

public val FUTEX_SYNCOBJ_1: UInt = 1u shl 29

public val FUTEX_SYNCOBJ_0: UInt = 1u shl 28

public val FUTEX_TID_MASK: UInt = (1u shl 28) - 1u

public val FUTEX_BITSET_MATCH_ANY: UInt = 0u.inv()

public val IP_RECVDSTADDR: CInt = 7

public val IP_SENDSRCADDR: CInt = IP_RECVDSTADDR

public val IP_RECVIF: CInt = 20

public val IP_PKTINFO: CInt = 25

public val IP_RECVPKTINFO: CInt = 26

public val IPV6_JOIN_GROUP: CInt = 12

public val IPV6_LEAVE_GROUP: CInt = 13

public val TCP_KEEPIDLE: CInt = 3

public val TCP_KEEPINTVL: CInt = 5

public val TCP_KEEPCNT: CInt = 6

public val TCP_KEEPINIT: CInt = 7

public val TCP_MD5SIG: CInt = 0x10

public val TCP_CONGCTL: CInt = 0x20

public val SOCK_CONN_DGRAM: CInt = 6

public val SOCK_DCCP: CInt = SOCK_CONN_DGRAM

public val SOCK_NOSIGPIPE: CInt = 0x40000000

public val SOCK_FLAGS_MASK: CInt = 0xf0000000

public val SO_SNDTIMEO: CInt = 0x100b

public val SO_RCVTIMEO: CInt = 0x100c

public val SO_NOSIGPIPE: CInt = 0x0800

public val SO_ACCEPTFILTER: CInt = 0x1000

public val SO_TIMESTAMP: CInt = 0x2000

public val SO_OVERFLOWED: CInt = 0x1009

public val SO_NOHEADER: CInt = 0x100a

// http://cvsweb.netbsd.org/bsdweb.cgi/src/sys/sys/un.h?annotate
public val LOCAL_OCREDS: CInt = 0x0001

// pass credentials to receiver
public val LOCAL_CONNWAIT: CInt = 0x0002

// connects block until accepted
public val LOCAL_PEEREID: CInt = 0x0003

// get peer identification
public val LOCAL_CREDS: CInt = 0x0004

// pass credentials to receiver
// https://github.com/NetBSD/src/blob/trunk/sys/net/if.h#L373
// sys/netinet/in.h
// Protocols (RFC 1700)
// NOTE: These are in addition to the constants defined in src/unix/mod.rs
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
 * gateway^2 (deprecated)
 */
public val IPPROTO_GGP: CInt = 3

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

/**
 * IP Mobility RFC 2004
 */
public val IPPROTO_MOBILE: CInt = 55

/**
 * IPv6 ICMP
 */
public val IPPROTO_IPV6_ICMP: CInt = 58

// IPPROTO_ICMPV6 defined in src/unix/mod.rs
/**
 * IP6 no next header
 */
public val IPPROTO_NONE: CInt = 59

/**
 * IP6 destination option
 */
public val IPPROTO_DSTOPTS: CInt = 60

/**
 * ISO cnlp
 */
public val IPPROTO_EON: CInt = 80

/**
 * Ethernet-in-IP
 */
public val IPPROTO_ETHERIP: CInt = 97

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
public val IPPROTO_IPCOMP: CInt = 108

/**
 * VRRP RFC 2338
 */
public val IPPROTO_VRRP: CInt = 112

/**
 * Common Address Resolution Protocol
 */
public val IPPROTO_CARP: CInt = 112

/**
 * L2TPv3
 */
public val IPPROTO_L2TP: CInt = 115

/**
 * SCTP
 */
public val IPPROTO_SCTP: CInt = 132

/**
 * PFSYNC
 */
public val IPPROTO_PFSYNC: CInt = 240

public val IPPROTO_MAX: CInt = 256

/**
 * last return value of *_input(), meaning "all job for this pkt is done".
 */
public val IPPROTO_DONE: CInt = 257

/**
 * sysctl Note for (FAST_)IPSEC
 */
public val CTL_IPPROTO_IPSEC: CInt = 258

public val AF_OROUTE: CInt = 17

public val AF_ARP: CInt = 28

public val PSEUDO_AF_KEY: CInt = 29

public val PSEUDO_AF_HDRCMPLT: CInt = 30

public val AF_BLUETOOTH: CInt = 31

public val AF_IEEE80211: CInt = 32

public val AF_MPLS: CInt = 33

public val AF_ROUTE: CInt = 34

public val NET_RT_DUMP: CInt = 1

public val NET_RT_FLAGS: CInt = 2

public val NET_RT_OOOIFLIST: CInt = 3

public val NET_RT_OOIFLIST: CInt = 4

public val NET_RT_OIFLIST: CInt = 5

public val NET_RT_IFLIST: CInt = 6

public val PF_OROUTE: CInt = AF_OROUTE

public val PF_ARP: CInt = AF_ARP

public val PF_KEY: CInt = PSEUDO_AF_KEY

public val PF_BLUETOOTH: CInt = AF_BLUETOOTH

public val PF_MPLS: CInt = AF_MPLS

public val PF_ROUTE: CInt = AF_ROUTE

public val MSG_NBIO: CInt = 0x1000

public val MSG_WAITFORONE: CInt = 0x2000

public val MSG_NOTIFICATION: CInt = 0x4000

public val SCM_TIMESTAMP: CInt = 0x08

public val SCM_CREDS: CInt = 0x10

public val O_DSYNC: CInt = 0x10000

public val MAP_RENAME: CInt = 0x20

public val MAP_NORESERVE: CInt = 0x40

public val MAP_HASSEMAPHORE: CInt = 0x200

public val MAP_TRYFIXED: CInt = 0x400

public val MAP_WIRED: CInt = 0x800

public val MAP_STACK: CInt = 0x2000

// map alignment aliases for MAP_ALIGNED
public val MAP_ALIGNMENT_SHIFT: CInt = 24

public val MAP_ALIGNMENT_MASK: CInt = 0xff shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_64KB: CInt = 16 shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_16MB: CInt = 24 shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_4GB: CInt = 32 shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_1TB: CInt = 40 shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_256TB: CInt = 48 shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_64PB: CInt = 56 shl MAP_ALIGNMENT_SHIFT

// mremap flag
public val MAP_REMAPDUP: CInt = 0x004

public val DCCP_TYPE_REQUEST: CInt = 0

public val DCCP_TYPE_RESPONSE: CInt = 1

public val DCCP_TYPE_DATA: CInt = 2

public val DCCP_TYPE_ACK: CInt = 3

public val DCCP_TYPE_DATAACK: CInt = 4

public val DCCP_TYPE_CLOSEREQ: CInt = 5

public val DCCP_TYPE_CLOSE: CInt = 6

public val DCCP_TYPE_RESET: CInt = 7

public val DCCP_TYPE_MOVE: CInt = 8

public val DCCP_FEATURE_CC: CInt = 1

public val DCCP_FEATURE_ECN: CInt = 2

public val DCCP_FEATURE_ACKRATIO: CInt = 3

public val DCCP_FEATURE_ACKVECTOR: CInt = 4

public val DCCP_FEATURE_MOBILITY: CInt = 5

public val DCCP_FEATURE_LOSSWINDOW: CInt = 6

public val DCCP_FEATURE_CONN_NONCE: CInt = 8

public val DCCP_FEATURE_IDENTREG: CInt = 7

public val DCCP_OPT_PADDING: CInt = 0

public val DCCP_OPT_DATA_DISCARD: CInt = 1

public val DCCP_OPT_SLOW_RECV: CInt = 2

public val DCCP_OPT_BUF_CLOSED: CInt = 3

public val DCCP_OPT_CHANGE_L: CInt = 32

public val DCCP_OPT_CONFIRM_L: CInt = 33

public val DCCP_OPT_CHANGE_R: CInt = 34

public val DCCP_OPT_CONFIRM_R: CInt = 35

public val DCCP_OPT_INIT_COOKIE: CInt = 36

public val DCCP_OPT_NDP_COUNT: CInt = 37

public val DCCP_OPT_ACK_VECTOR0: CInt = 38

public val DCCP_OPT_ACK_VECTOR1: CInt = 39

public val DCCP_OPT_RECV_BUF_DROPS: CInt = 40

public val DCCP_OPT_TIMESTAMP: CInt = 41

public val DCCP_OPT_TIMESTAMP_ECHO: CInt = 42

public val DCCP_OPT_ELAPSEDTIME: CInt = 43

public val DCCP_OPT_DATACHECKSUM: CInt = 44

public val DCCP_REASON_UNSPEC: CInt = 0

public val DCCP_REASON_CLOSED: CInt = 1

public val DCCP_REASON_INVALID: CInt = 2

public val DCCP_REASON_OPTION_ERR: CInt = 3

public val DCCP_REASON_FEA_ERR: CInt = 4

public val DCCP_REASON_CONN_REF: CInt = 5

public val DCCP_REASON_BAD_SNAME: CInt = 6

public val DCCP_REASON_BAD_COOKIE: CInt = 7

public val DCCP_REASON_INV_MOVE: CInt = 8

public val DCCP_REASON_UNANSW_CH: CInt = 10

public val DCCP_REASON_FRUITLESS_NEG: CInt = 11

public val DCCP_CCID: CInt = 1

public val DCCP_CSLEN: CInt = 2

public val DCCP_MAXSEG: CInt = 4

public val DCCP_SERVICE: CInt = 8

public val DCCP_NDP_LIMIT: CInt = 16

public val DCCP_SEQ_NUM_LIMIT: CInt = 16777216

public val DCCP_MAX_OPTIONS: CInt = 32

public val DCCP_MAX_PKTS: CInt = 100

public val PC_LINK_MAX: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_PATH_MAX: CInt = 5

public val PC_PIPE_BUF: CInt = 6

public val PC_CHOWN_RESTRICTED: CInt = 7

public val PC_NO_TRUNC: CInt = 8

public val PC_VDISABLE: CInt = 9

public val PC_SYNC_IO: CInt = 10

public val PC_FILESIZEBITS: CInt = 11

public val PC_SYMLINK_MAX: CInt = 12

public val PC_2_SYMLINKS: CInt = 13

public val PC_ACL_EXTENDED: CInt = 14

public val PC_MIN_HOLE_SIZE: CInt = 15

public val CS_PATH: CInt = 1

public val SC_SYNCHRONIZED_IO: CInt = 31

public val SC_IOV_MAX: CInt = 32

public val SC_MAPPED_FILES: CInt = 33

public val SC_MEMLOCK: CInt = 34

public val SC_MEMLOCK_RANGE: CInt = 35

public val SC_MEMORY_PROTECTION: CInt = 36

public val SC_LOGIN_NAME_MAX: CInt = 37

public val SC_MONOTONIC_CLOCK: CInt = 38

public val SC_CLK_TCK: CInt = 39

public val SC_ATEXIT_MAX: CInt = 40

public val SC_THREADS: CInt = 41

public val SC_SEMAPHORES: CInt = 42

public val SC_BARRIERS: CInt = 43

public val SC_TIMERS: CInt = 44

public val SC_SPIN_LOCKS: CInt = 45

public val SC_READER_WRITER_LOCKS: CInt = 46

public val SC_GETGR_R_SIZE_MAX: CInt = 47

public val SC_GETPW_R_SIZE_MAX: CInt = 48

public val SC_CLOCK_SELECTION: CInt = 49

public val SC_ASYNCHRONOUS_IO: CInt = 50

public val SC_AIO_LISTIO_MAX: CInt = 51

public val SC_AIO_MAX: CInt = 52

public val SC_MESSAGE_PASSING: CInt = 53

public val SC_MQ_OPEN_MAX: CInt = 54

public val SC_MQ_PRIO_MAX: CInt = 55

public val SC_PRIORITY_SCHEDULING: CInt = 56

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 57

public val SC_THREAD_KEYS_MAX: CInt = 58

public val SC_THREAD_STACK_MIN: CInt = 59

public val SC_THREAD_THREADS_MAX: CInt = 60

public val SC_THREAD_ATTR_STACKADDR: CInt = 61

public val SC_THREAD_ATTR_STACKSIZE: CInt = 62

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 63

public val SC_THREAD_PRIO_INHERIT: CInt = 64

public val SC_THREAD_PRIO_PROTECT: CInt = 65

public val SC_THREAD_PROCESS_SHARED: CInt = 66

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 67

public val SC_TTY_NAME_MAX: CInt = 68

public val SC_HOST_NAME_MAX: CInt = 69

public val SC_PASS_MAX: CInt = 70

public val SC_REGEXP: CInt = 71

public val SC_SHELL: CInt = 72

public val SC_SYMLOOP_MAX: CInt = 73

public val SC_V6_ILP32_OFF32: CInt = 74

public val SC_V6_ILP32_OFFBIG: CInt = 75

public val SC_V6_LP64_OFF64: CInt = 76

public val SC_V6_LPBIG_OFFBIG: CInt = 77

public val SC_2_PBS: CInt = 80

public val SC_2_PBS_ACCOUNTING: CInt = 81

public val SC_2_PBS_CHECKPOINT: CInt = 82

public val SC_2_PBS_LOCATE: CInt = 83

public val SC_2_PBS_MESSAGE: CInt = 84

public val SC_2_PBS_TRACK: CInt = 85

public val SC_SPAWN: CInt = 86

public val SC_SHARED_MEMORY_OBJECTS: CInt = 87

public val SC_TIMER_MAX: CInt = 88

public val SC_SEM_NSEMS_MAX: CInt = 89

public val SC_CPUTIME: CInt = 90

public val SC_THREAD_CPUTIME: CInt = 91

public val SC_DELAYTIMER_MAX: CInt = 92

// These two variables will be supported in NetBSD 8.0
// pub const _SC_SIGQUEUE_MAX : cInt = 93;
// pub const _SC_REALTIME_SIGNALS : cInt = 94;
public val SC_PHYS_PAGES: CInt = 121

public val SC_NPROCESSORS_CONF: CInt = 1001

public val SC_NPROCESSORS_ONLN: CInt = 1002

public val SC_SCHED_RT_TS: CInt = 2001

public val SC_SCHED_PRI_MIN: CInt = 2002

public val SC_SCHED_PRI_MAX: CInt = 2003

public val FD_SETSIZE: Int = 0x100

public val ST_NOSUID: CUlong = 8uL

// <sys/fstypes.h>
public val MNT_UNION: CInt = 0x00000020

public val MNT_NOCOREDUMP: CInt = 0x00008000

public val MNT_RELATIME: CInt = 0x00020000

public val MNT_IGNORE: CInt = 0x00100000

public val MNT_NFS4ACLS: CInt = 0x00200000

public val MNT_DISCARD: CInt = 0x00800000

public val MNT_EXTATTR: CInt = 0x01000000

public val MNT_LOG: CInt = 0x02000000

public val MNT_NOATIME: CInt = 0x04000000

public val MNT_AUTOMOUNTED: CInt = 0x10000000

public val MNT_SYMPERM: CInt = 0x20000000

public val MNT_NODEVMTIME: CInt = 0x40000000

public val MNT_SOFTDEP: CInt = 0x80000000

public val MNT_POSIX1EACLS: CInt = 0x00000800

public val MNT_ACLS: CInt = MNT_POSIX1EACLS

public val MNT_WAIT: CInt = 1

public val MNT_NOWAIT: CInt = 2

public val MNT_LAZY: CInt = 3

// sys/ioccom.h
public val IOCPARM_SHIFT: UInt = 16u

public val IOCGROUP_SHIFT: UInt = 8u

public fun iocparmLen(x: UInt): UInt {
    return (x shr IOCPARM_SHIFT.toInt()) and IOCPARM_MASK
}

public fun iocbasecmd(x: UInt): UInt {
    return x and ((IOCPARM_MASK shl IOCPARM_SHIFT.toInt()).inv())
}

public fun iocgroup(x: UInt): UInt {
    return (x shr IOCGROUP_SHIFT.toInt()) and 0xffu
}

public fun ioc(inout: CUlong, group: CUlong, num: CUlong, len: CUlong): CUlong {
    return (inout) or (((len) and IOCPARM_MASK.toULong()) shl IOCPARM_SHIFT.toInt()) or ((group) shl IOCGROUP_SHIFT.toInt()) or (num)
}

public val NTP_API: CInt = 4

public val LITTLE_ENDIAN: CInt = 1234

public val BIG_ENDIAN: CInt = 4321

public val PL_EVENT_NONE: CInt = 0

public val PL_EVENT_SIGNAL: CInt = 1

public val PL_EVENT_SUSPENDED: CInt = 2

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(ptcMagic = 0x55550005, ptcLock = 0, ptcWaitersFirst = null, ptcWaitersLast = null, ptcMutex = null, ptcPrivate = null)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(ptrMagic = 0x99990009, ptrInterlock = 0, ptrRblockedFirst = null, ptrRblockedLast = null, ptrWblockedFirst = null, ptrWblockedLast = null, ptrNreaders = 0, ptrOwner = 0, ptrPrivate = null)

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 1

public val PTHREAD_MUTEX_RECURSIVE: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val SCHED_NONE: CInt = -1

public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val EVFILT_AIO: UInt = 2u

public val EVFILT_PROC: UInt = 4u

public val EVFILT_READ: UInt = 0u

public val EVFILT_SIGNAL: UInt = 5u

public val EVFILT_TIMER: UInt = 6u

public val EVFILT_VNODE: UInt = 3u

public val EVFILT_WRITE: UInt = 1u

public val EVFILT_FS: UInt = 7u

public val EVFILT_USER: UInt = 8u

public val EVFILT_EMPTY: UInt = 9u

public val EV_ADD: UInt = 0x1u

public val EV_DELETE: UInt = 0x2u

public val EV_ENABLE: UInt = 0x4u

public val EV_DISABLE: UInt = 0x8u

public val EV_ONESHOT: UInt = 0x10u

public val EV_CLEAR: UInt = 0x20u

public val EV_RECEIPT: UInt = 0x40u

public val EV_DISPATCH: UInt = 0x80u

public val EV_FLAG1: UInt = 0x2000u

public val EV_ERROR: UInt = 0x4000u

public val EV_EOF: UInt = 0x8000u

public val EV_SYSFLAGS: UInt = 0xf000u

public val NOTE_TRIGGER: UInt = 0x01000000u

public val NOTE_FFNOP: UInt = 0x00000000u

public val NOTE_FFAND: UInt = 0x40000000u

public val NOTE_FFOR: UInt = 0x80000000u

public val NOTE_FFCOPY: UInt = 0xc0000000u

public val NOTE_FFCTRLMASK: UInt = 0xc0000000u

public val NOTE_FFLAGSMASK: UInt = 0x00ffffffu

public val NOTE_LOWAT: UInt = 0x00000001u

public val NOTE_DELETE: UInt = 0x00000001u

public val NOTE_WRITE: UInt = 0x00000002u

public val NOTE_EXTEND: UInt = 0x00000004u

public val NOTE_ATTRIB: UInt = 0x00000008u

public val NOTE_LINK: UInt = 0x00000010u

public val NOTE_RENAME: UInt = 0x00000020u

public val NOTE_REVOKE: UInt = 0x00000040u

public val NOTE_EXIT: UInt = 0x80000000u

public val NOTE_FORK: UInt = 0x40000000u

public val NOTE_EXEC: UInt = 0x20000000u

public val NOTE_PDATAMASK: UInt = 0x000fffffu

public val NOTE_PCTRLMASK: UInt = 0xf0000000u

public val NOTE_TRACK: UInt = 0x00000001u

public val NOTE_TRACKERR: UInt = 0x00000002u

public val NOTE_CHILD: UInt = 0x00000004u

public val NOTE_MSECONDS: UInt = 0x00000000u

public val NOTE_SECONDS: UInt = 0x00000001u

public val NOTE_USECONDS: UInt = 0x00000002u

public val NOTE_NSECONDS: UInt = 0x00000003u

public val NOTE_ABSTIME: UInt = 0x000000010u

public val TMP_MAX: CUint = 308915776u

public val AI_PASSIVE: CInt = 0x00000001

public val AI_CANONNAME: CInt = 0x00000002

public val AI_NUMERICHOST: CInt = 0x00000004

public val AI_NUMERICSERV: CInt = 0x00000008

public val AI_ADDRCONFIG: CInt = 0x00000400

public val AI_SRV: CInt = 0x00000800

public val NI_MAXHOST: SocklenT = 1025u

public val NI_MAXSERV: SocklenT = 32u

public val NI_NOFQDN: CInt = 0x00000001

public val NI_NUMERICHOST: CInt = 0x000000002

public val NI_NAMEREQD: CInt = 0x000000004

public val NI_NUMERICSERV: CInt = 0x000000008

public val NI_DGRAM: CInt = 0x00000010

public val NI_WITHSCOPEID: CInt = 0x00000020

public val NI_NUMERICSCOPE: CInt = 0x00000040

public val RTLD_NOLOAD: CInt = 0x2000

public val RTLD_LOCAL: CInt = 0x200

public val CTL_MAXNAME: CInt = 12

public val SYSCTL_NAMELEN: CInt = 32

public val SYSCTL_DEFSIZE: CInt = 8

public val CTLTYPE_NODE: CInt = 1

public val CTLTYPE_INT: CInt = 2

public val CTLTYPE_STRING: CInt = 3

public val CTLTYPE_QUAD: CInt = 4

public val CTLTYPE_STRUCT: CInt = 5

public val CTLTYPE_BOOL: CInt = 6

public val CTLFLAG_READONLY: CInt = 0x00000000

public val CTLFLAG_READWRITE: CInt = 0x00000070

public val CTLFLAG_ANYWRITE: CInt = 0x00000080

public val CTLFLAG_PRIVATE: CInt = 0x00000100

public val CTLFLAG_PERMANENT: CInt = 0x00000200

public val CTLFLAG_OWNDATA: CInt = 0x00000400

public val CTLFLAG_IMMEDIATE: CInt = 0x00000800

public val CTLFLAG_HEX: CInt = 0x00001000

public val CTLFLAG_ROOT: CInt = 0x00002000

public val CTLFLAG_ANYNUMBER: CInt = 0x00004000

public val CTLFLAG_HIDDEN: CInt = 0x00008000

public val CTLFLAG_ALIAS: CInt = 0x00010000

public val CTLFLAG_MMAP: CInt = 0x00020000

public val CTLFLAG_OWNDESC: CInt = 0x00040000

public val CTLFLAG_UNSIGNED: CInt = 0x00080000

public val SYSCTL_VERS_MASK: CInt = 0xff000000

public val SYSCTL_VERS_0: CInt = 0x00000000

public val SYSCTL_VERS_1: CInt = 0x01000000

public val SYSCTL_VERSION: CInt = SYSCTL_VERS_1

public val CTL_EOL: CInt = -1

public val CTL_QUERY: CInt = -2

public val CTL_CREATE: CInt = -3

public val CTL_CREATESYM: CInt = -4

public val CTL_DESTROY: CInt = -5

public val CTL_MMAP: CInt = -6

public val CTL_DESCRIBE: CInt = -7

public val CTL_UNSPEC: CInt = 0

public val CTL_KERN: CInt = 1

public val CTL_VM: CInt = 2

public val CTL_VFS: CInt = 3

public val CTL_NET: CInt = 4

public val CTL_DEBUG: CInt = 5

public val CTL_HW: CInt = 6

public val CTL_MACHDEP: CInt = 7

public val CTL_USER: CInt = 8

public val CTL_DDB: CInt = 9

public val CTL_PROC: CInt = 10

public val CTL_VENDOR: CInt = 11

public val CTL_EMUL: CInt = 12

public val CTL_SECURITY: CInt = 13

public val KERN_OSTYPE: CInt = 1

public val KERN_OSRELEASE: CInt = 2

public val KERN_OSREV: CInt = 3

public val KERN_VERSION: CInt = 4

public val KERN_MAXVNODES: CInt = 5

public val KERN_MAXPROC: CInt = 6

public val KERN_MAXFILES: CInt = 7

public val KERN_ARGMAX: CInt = 8

public val KERN_SECURELVL: CInt = 9

public val KERN_HOSTNAME: CInt = 10

public val KERN_HOSTID: CInt = 11

public val KERN_CLOCKRATE: CInt = 12

public val KERN_VNODE: CInt = 13

public val KERN_PROC: CInt = 14

public val KERN_FILE: CInt = 15

public val KERN_PROF: CInt = 16

public val KERN_POSIX1: CInt = 17

public val KERN_NGROUPS: CInt = 18

public val KERN_JOB_CONTROL: CInt = 19

public val KERN_SAVED_IDS: CInt = 20

public val KERN_OBOOTTIME: CInt = 21

public val KERN_DOMAINNAME: CInt = 22

public val KERN_MAXPARTITIONS: CInt = 23

public val KERN_RAWPARTITION: CInt = 24

public val KERN_NTPTIME: CInt = 25

public val KERN_TIMEX: CInt = 26

public val KERN_AUTONICETIME: CInt = 27

public val KERN_AUTONICEVAL: CInt = 28

public val KERN_RTC_OFFSET: CInt = 29

public val KERN_ROOT_DEVICE: CInt = 30

public val KERN_MSGBUFSIZE: CInt = 31

public val KERN_FSYNC: CInt = 32

public val KERN_OLDSYSVMSG: CInt = 33

public val KERN_OLDSYSVSEM: CInt = 34

public val KERN_OLDSYSVSHM: CInt = 35

public val KERN_OLDSHORTCORENAME: CInt = 36

public val KERN_SYNCHRONIZED_IO: CInt = 37

public val KERN_IOV_MAX: CInt = 38

public val KERN_MBUF: CInt = 39

public val KERN_MAPPED_FILES: CInt = 40

public val KERN_MEMLOCK: CInt = 41

public val KERN_MEMLOCK_RANGE: CInt = 42

public val KERN_MEMORY_PROTECTION: CInt = 43

public val KERN_LOGIN_NAME_MAX: CInt = 44

public val KERN_DEFCORENAME: CInt = 45

public val KERN_LOGSIGEXIT: CInt = 46

public val KERN_PROC2: CInt = 47

public val KERN_PROC_ARGS: CInt = 48

public val KERN_FSCALE: CInt = 49

public val KERN_CCPU: CInt = 50

public val KERN_CP_TIME: CInt = 51

public val KERN_OLDSYSVIPC_INFO: CInt = 52

public val KERN_MSGBUF: CInt = 53

public val KERN_CONSDEV: CInt = 54

public val KERN_MAXPTYS: CInt = 55

public val KERN_PIPE: CInt = 56

public val KERN_MAXPHYS: CInt = 57

public val KERN_SBMAX: CInt = 58

public val KERN_TKSTAT: CInt = 59

public val KERN_MONOTONIC_CLOCK: CInt = 60

public val KERN_URND: CInt = 61

public val KERN_LABELSECTOR: CInt = 62

public val KERN_LABELOFFSET: CInt = 63

public val KERN_LWP: CInt = 64

public val KERN_FORKFSLEEP: CInt = 65

public val KERN_POSIX_THREADS: CInt = 66

public val KERN_POSIX_SEMAPHORES: CInt = 67

public val KERN_POSIX_BARRIERS: CInt = 68

public val KERN_POSIX_TIMERS: CInt = 69

public val KERN_POSIX_SPIN_LOCKS: CInt = 70

public val KERN_POSIX_READER_WRITER_LOCKS: CInt = 71

public val KERN_DUMP_ON_PANIC: CInt = 72

public val KERN_SOMAXKVA: CInt = 73

public val KERN_ROOT_PARTITION: CInt = 74

public val KERN_DRIVERS: CInt = 75

public val KERN_BUF: CInt = 76

public val KERN_FILE2: CInt = 77

public val KERN_VERIEXEC: CInt = 78

public val KERN_CP_ID: CInt = 79

public val KERN_HARDCLOCK_TICKS: CInt = 80

public val KERN_ARND: CInt = 81

public val KERN_SYSVIPC: CInt = 82

public val KERN_BOOTTIME: CInt = 83

public val KERN_EVCNT: CInt = 84

public val KERN_PROC_ALL: CInt = 0

public val KERN_PROC_PID: CInt = 1

public val KERN_PROC_PGRP: CInt = 2

public val KERN_PROC_SESSION: CInt = 3

public val KERN_PROC_TTY: CInt = 4

public val KERN_PROC_UID: CInt = 5

public val KERN_PROC_RUID: CInt = 6

public val KERN_PROC_GID: CInt = 7

public val KERN_PROC_RGID: CInt = 8

public val KERN_PROC_ARGV: CInt = 1

public val KERN_PROC_NARGV: CInt = 2

public val KERN_PROC_ENV: CInt = 3

public val KERN_PROC_NENV: CInt = 4

public val KERN_PROC_PATHNAME: CInt = 5

public val VM_PROC: CInt = 16

public val VM_PROC_MAP: CInt = 1

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

public val AIO_CANCELED: CInt = 1

public val AIO_NOTCANCELED: CInt = 2

public val AIO_ALLDONE: CInt = 3

public val LIO_NOP: CInt = 0

public val LIO_WRITE: CInt = 1

public val LIO_READ: CInt = 2

public val LIO_WAIT: CInt = 1

public val LIO_NOWAIT: CInt = 0

public val SIGEV_NONE: CInt = 0

public val SIGEV_SIGNAL: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val WSTOPPED: CInt = 0x00000002

// same as WUNTRACED
public val WCONTINUED: CInt = 0x00000010

public val WEXITED: CInt = 0x000000020

public val WNOWAIT: CInt = 0x00010000

public val WALTSIG: CInt = 0x00000004

public val WALLSIG: CInt = 0x00000008

public val WTRAPPED: CInt = 0x00000040

public val WNOZOMBIE: CInt = 0x00020000

public val P_ALL: IdtypeT = 0

public val P_PID: IdtypeT = 1

public val P_PGID: IdtypeT = 4

public val UTIME_OMIT: CLong = 1073741822L

public val UTIME_NOW: CLong = 1073741823L

public val B460800: SpeedT = 460800

public val B921600: SpeedT = 921600

public val ONOCR: TcflagT = 0x20

public val ONLRET: TcflagT = 0x40

public val CDTRCTS: TcflagT = 0x00020000

public val CHWFLOW: TcflagT = MDMBUF or CRTSCTS or CDTRCTS

public val SOCK_CLOEXEC: CInt = 0x10000000

public val SOCK_NONBLOCK: CInt = 0x20000000

// Uncomment on next NetBSD release
// pub const FIOSEEKDATA: cUlong = 0xc0086661;
// pub const FIOSEEKHOLE: cUlong = 0xc0086662;
public val OFIOGETBMAP: CUlong = 0xc004667auL

public val FIOGETBMAP: CUlong = 0xc008667auL

public val FIONWRITE: CUlong = 0x40046679uL

public val FIONSPACE: CUlong = 0x40046678uL

public val FIBMAP: CUlong = 0xc008667auL

public val SIGSTKSZ: SizeT = 40960uL

public val REG_ILLSEQ: CInt = 17

public val PT_DUMPCORE: CInt = 12

public val PT_LWPINFO: CInt = 13

public val PT_SYSCALL: CInt = 14

public val PT_SYSCALLEMU: CInt = 15

public val PT_SET_EVENT_MASK: CInt = 16

public val PT_GET_EVENT_MASK: CInt = 17

public val PT_GET_PROCESS_STATE: CInt = 18

public val PT_SET_SIGINFO: CInt = 19

public val PT_GET_SIGINFO: CInt = 20

public val PT_RESUME: CInt = 21

public val PT_SUSPEND: CInt = 22

public val PT_STOP: CInt = 23

public val PT_LWPSTATUS: CInt = 24

public val PT_LWPNEXT: CInt = 25

public val PT_SET_SIGPASS: CInt = 26

public val PT_GET_SIGPASS: CInt = 27

public val PT_FIRSTMACH: CInt = 32

public val POSIX_SPAWN_RETURNERROR: CInt = 0x40

// Flags for chflags(2)
public val SF_APPEND: CUlong = 0x00040000uL

public val SF_ARCHIVED: CUlong = 0x00010000uL

public val SF_IMMUTABLE: CUlong = 0x00020000uL

public val SF_LOG: CUlong = 0x00400000uL

public val SF_SETTABLE: CUlong = 0xffff0000uL

public val SF_SNAPINVAL: CUlong = 0x00800000uL

public val SF_SNAPSHOT: CUlong = 0x00200000uL

public val UF_APPEND: CUlong = 0x00000004uL

public val UF_IMMUTABLE: CUlong = 0x00000002uL

public val UF_NODUMP: CUlong = 0x00000001uL

public val UF_OPAQUE: CUlong = 0x00000008uL

public val UF_SETTABLE: CUlong = 0x0000ffffuL

// sys/sysctl.h
public val KVME_PROT_READ: CInt = 0x00000001

public val KVME_PROT_WRITE: CInt = 0x00000002

public val KVME_PROT_EXEC: CInt = 0x00000004

public val KVME_FLAG_COW: CInt = 0x00000001

public val KVME_FLAG_NEEDS_COPY: CInt = 0x00000002

public val KVME_FLAG_NOCOREDUMP: CInt = 0x000000004

public val KVME_FLAG_PAGEABLE: CInt = 0x000000008

public val KVME_FLAG_GROWS_UP: CInt = 0x000000010

public val KVME_FLAG_GROWS_DOWN: CInt = 0x000000020

public val NGROUPS_MAX: CInt = 16

public val KI_NGROUPS: CInt = 16

public val KI_MAXCOMLEN: CInt = 24

public val KI_WMESGLEN: CInt = 8

public val KI_MAXLOGNAME: CInt = 24

public val KI_MAXEMULLEN: CInt = 16

public val KI_LNAMELEN: CInt = 20

// sys/lwp.h
public val LSIDL: CInt = 1

public val LSRUN: CInt = 2

public val LSSLEEP: CInt = 3

public val LSSTOP: CInt = 4

public val LSZOMB: CInt = 5

public val LSONPROC: CInt = 7

public val LSSUSPENDED: CInt = 8

// sys/xattr.h
public val XATTR_CREATE: CInt = 0x01

public val XATTR_REPLACE: CInt = 0x02

// sys/extattr.h
public val EXTATTR_NAMESPACE_EMPTY: CInt = 0

// For getrandom()
public val GRND_NONBLOCK: CUint = 0x1u

public val GRND_RANDOM: CUint = 0x2u

public val GRND_INSECURE: CUint = 0x4u

// sys/reboot.h
public val RB_ASKNAME: CInt = 0x000000001

public val RB_SINGLE: CInt = 0x000000002

public val RB_NOSYNC: CInt = 0x000000004

public val RB_HALT: CInt = 0x000000008

public val RB_INITNAME: CInt = 0x000000010

public val RB_KDB: CInt = 0x000000040

public val RB_RDONLY: CInt = 0x000000080

public val RB_DUMP: CInt = 0x000000100

public val RB_MINIROOT: CInt = 0x000000200

public val RB_STRING: CInt = 0x000000400

public val RB_POWERDOWN: CInt = RB_HALT or 0x000000800

public val RB_USERCONF: CInt = 0x000001000

public fun mapAligned(alignment: CInt): CInt {
    return alignment shl MAP_ALIGNMENT_SHIFT
}

// net/route.h
public val RTF_MASK: CInt = 0x80

public val RTF_CONNECTED: CInt = 0x100

public val RTF_ANNOUNCE: CInt = 0x20000

public val RTF_SRC: CInt = 0x10000

public val RTF_LOCAL: CInt = 0x40000

public val RTF_BROADCAST: CInt = 0x80000

public val RTF_UPDATING: CInt = 0x100000

public val RTF_DONTCHANGEIFA: CInt = 0x200000

public val RTM_VERSION: CInt = 4

public val RTM_LOCK: CInt = 0x8

public val RTM_IFANNOUNCE: CInt = 0x10

public val RTM_IEEE80211: CInt = 0x11

public val RTM_SETGATE: CInt = 0x12

public val RTM_LLINFO_UPD: CInt = 0x13

public val RTM_IFINFO: CInt = 0x14

public val RTM_OCHGADDR: CInt = 0x15

public val RTM_NEWADDR: CInt = 0x16

public val RTM_DELADDR: CInt = 0x17

public val RTM_CHGADDR: CInt = 0x18

public val RTA_TAG: CInt = 0x100

public val RTAX_TAG: CInt = 8

public val RTAX_MAX: CInt = 9

// For eventfd
public val EFD_SEMAPHORE: CInt = O_RDWR

public val EFD_NONBLOCK: CInt = O_NONBLOCK

public val EFD_CLOEXEC: CInt = O_CLOEXEC

// sys/timerfd.h
public val TFD_CLOEXEC: Int = O_CLOEXEC

public val TFD_NONBLOCK: Int = O_NONBLOCK

public val TFD_TIMER_ABSTIME: Int = O_WRONLY

public val TFD_TIMER_CANCEL_ON_SET: Int = O_RDWR

public fun align(p: Int): Int {
    return (p + ALIGNBYTES) and ALIGNBYTES.inv()
}

public fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_nanosleep", -1, longArrayOf(clkId.toLong(), flags.toLong(), rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}

public fun reallocarr(ptr: COpaquePointer?, number: SizeT, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("reallocarr", -1, longArrayOf(ptr?.value ?: 0L, number.toLong(), size.toLong())).toInt()
}

public fun chflags(path: String?, flags: CUlong): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("chflags", -1, longArrayOf(__cstr_0, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fchflags(fd: CInt, flags: CUlong): CInt {
    return LibcDynamicFfi.invoke("fchflags", -1, longArrayOf(fd.toLong(), flags.toLong())).toInt()
}

public fun lchflags(path: String?, flags: CUlong): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("lchflags", -1, longArrayOf(__cstr_0, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("extattr_list_fd", -1, longArrayOf(fd.toLong(), attrnamespace.toLong(), data?.value ?: 0L, nbytes.toLong()))
}

public fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("extattr_list_file", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("extattr_list_link", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt {
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_delete_fd", -1, longArrayOf(fd.toLong(), attrnamespace.toLong(), __cstr_2)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_delete_file", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_delete_link", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_get_fd", -1, longArrayOf(fd.toLong(), attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_get_file", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_get_link", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("extattr_namespace_to_string", -1, longArrayOf(attrnamespace.toLong(), string?.value ?: 0L)).toInt()
}

public fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt {
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_set_fd", -1, longArrayOf(fd.toLong(), attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong())).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_set_file", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_set_link", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt {
    val __cstr_0 = if (string == null) 0L else LibcDynamicFfi.allocUtf8CString(string)
    val __slot_1 = if (attrnamespace == null) 0L else LibcDynamicFfi.allocScalarSlot(attrnamespace.toLong())
    try {
        return LibcDynamicFfi.invoke("extattr_string_to_namespace", -1, longArrayOf(__cstr_0, __slot_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
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

public fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    try {
        return LibcDynamicFfi.invoke("forkpty", -1, longArrayOf(__slot_0, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("ptsname_r", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun lutimes(file: String?, times: Timeval?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("__lutimes50", -1, longArrayOf(__cstr_0, times?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("__gettimeofday50", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(sa?.value ?: 0L, salen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, servlen.toLong(), flags.toLong())).toInt()
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt {
    val __slot_0 = if (name == null) 0L else LibcDynamicFfi.allocScalarSlot(name.toLong())
    val __slot_3 = if (oldlenp == null) 0L else LibcDynamicFfi.allocScalarSlot(oldlenp.toLong())
    try {
        return LibcDynamicFfi.invoke("sysctl", -1, longArrayOf(__slot_0, namelen.toLong(), oldp?.value ?: 0L, __slot_3, newp?.value ?: 0L, newlen.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __slot_2 = if (oldlenp == null) 0L else LibcDynamicFfi.allocScalarSlot(oldlenp.toLong())
    try {
        return LibcDynamicFfi.invoke("sysctlbyname", -1, longArrayOf(__cstr_0, oldp?.value ?: 0L, __slot_2, newp?.value ?: 0L, newlen.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sysctlnametomib(sname: String?, name: CInt?, namelenp: SizeT?): CInt {
    val __cstr_0 = if (sname == null) 0L else LibcDynamicFfi.allocUtf8CString(sname)
    val __slot_1 = if (name == null) 0L else LibcDynamicFfi.allocScalarSlot(name.toLong())
    val __slot_2 = if (namelenp == null) 0L else LibcDynamicFfi.allocScalarSlot(namelenp.toLong())
    try {
        return LibcDynamicFfi.invoke("sysctlnametomib", -1, longArrayOf(__cstr_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun kevent(kq: CInt, changelist: Kevent?, nchanges: SizeT, eventlist: Kevent?, nevents: SizeT, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("__kevent50", -1, longArrayOf(kq.toLong(), changelist?.value ?: 0L, nchanges.toLong(), eventlist?.value ?: 0L, nevents.toLong(), timeout?.value ?: 0L)).toInt()
}

public fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?, size: SizeT): CInt {
    val __cstr_0 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    val __cstr_1 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    try {
        return LibcDynamicFfi.invoke("__mount50", -1, longArrayOf(__cstr_0, __cstr_1, flags.toLong(), data?.value ?: 0L, size.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        LibcDynamicFfi.invoke("mq_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs)
        return null as MqdT
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mqClose(mqd: MqdT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mq_close", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mq_getattr", -1, longArrayOf(__scratch_0, attr?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mq_notify", -1, longArrayOf(__scratch_0, notification?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (msgPrio == null) 0L else LibcDynamicFfi.allocScalarSlot(msgPrio.toLong())
    try {
        return LibcDynamicFfi.invoke("mq_receive", -1, longArrayOf(__scratch_0, msgPtr?.value ?: 0L, msgLen.toLong(), __slot_3))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __cstr_1 = if (msgPtr == null) 0L else LibcDynamicFfi.allocUtf8CString(msgPtr)
    try {
        return LibcDynamicFfi.invoke("mq_send", -1, longArrayOf(__scratch_0, __cstr_1, msgLen.toLong(), msgPrio.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mq_setattr", -1, longArrayOf(__scratch_0, newattr?.value ?: 0L, oldattr?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (msgPrio == null) 0L else LibcDynamicFfi.allocScalarSlot(msgPrio.toLong())
    try {
        return LibcDynamicFfi.invoke("__mq_timedreceive50", -1, longArrayOf(__scratch_0, msgPtr?.value ?: 0L, msgLen.toLong(), __slot_3, absTimeout?.value ?: 0L))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __cstr_1 = if (msgPtr == null) 0L else LibcDynamicFfi.allocUtf8CString(msgPtr)
    try {
        return LibcDynamicFfi.invoke("__mq_timedsend50", -1, longArrayOf(__scratch_0, __cstr_1, msgLen.toLong(), msgPrio.toLong(), absTimeout?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mqUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("mq_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt {
    return LibcDynamicFfi.invoke("ptrace", -1, longArrayOf(request.toLong(), pid.toLong(), addr?.value ?: 0L, data.toLong())).toInt()
}

public fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt {
    val __cstr_0 = if (label == null) 0L else LibcDynamicFfi.allocUtf8CString(label)
    try {
        return LibcDynamicFfi.invoke("utrace", -1, longArrayOf(__cstr_0, addr?.value ?: 0L, len.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pthreadGetnameNp(t: PthreadT, name: COpaquePointer?, len: SizeT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_getname_np", -1, longArrayOf(__scratch_0, name?.value ?: 0L, len.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadSetnameNp(t: PthreadT, name: String?, arg: COpaquePointer?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("pthread_setname_np", -1, longArrayOf(__scratch_0, __cstr_1, arg?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_attr_get_np", -1, longArrayOf(__scratch_0, attr?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_getattr_np", -1, longArrayOf(__scratch_0, attr?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: SizeT?): CInt {
    val __slot_1 = if (guardsize == null) 0L else LibcDynamicFfi.allocScalarSlot(guardsize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getguardsize", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setguardsize", -1, longArrayOf(attr?.value ?: 0L, guardsize.toLong())).toInt()
}

public fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt {
    val __slot_2 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstack", -1, longArrayOf(attr?.value ?: 0L, stackaddr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: Cpuset?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_getaffinity_np", -1, longArrayOf(__scratch_0, size.toLong(), set?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: Cpuset?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_setaffinity_np", -1, longArrayOf(__scratch_0, size.toLong(), set?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun cpusetCreate(): Cpuset? {
    val rawRet = LibcDynamicFfi.invoke("_cpuset_create", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun cpusetDestroy(set: Cpuset?) {
    LibcDynamicFfi.invoke("_cpuset_destroy", -1, longArrayOf(set?.value ?: 0L))
}

public fun cpusetClr(cpu: CpuidT, set: Cpuset?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("_cpuset_clr", -1, longArrayOf(__scratch_0, set?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun cpusetSet(cpu: CpuidT, set: Cpuset?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("_cpuset_set", -1, longArrayOf(__scratch_0, set?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun cpusetIsset(cpu: CpuidT, set: Cpuset?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("_cpuset_isset", -1, longArrayOf(__scratch_0, set?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun cpusetSize(set: Cpuset?): SizeT {
    return LibcDynamicFfi.invoke("_cpuset_size", -1, longArrayOf(set?.value ?: 0L)).toULong()
}

public fun cpusetZero(set: Cpuset?) {
    LibcDynamicFfi.invoke("_cpuset_zero", -1, longArrayOf(set?.value ?: 0L))
}

public fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("__sigtimedwait50", -1, longArrayOf(set?.value ?: 0L, info?.value ?: 0L, timeout?.value ?: 0L)).toInt()
}

public fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt {
    return LibcDynamicFfi.invoke("sigwaitinfo", -1, longArrayOf(set?.value ?: 0L, info?.value ?: 0L)).toInt()
}

public fun duplocale(base: LocaleT): LocaleT {
    val rawRet = LibcDynamicFfi.invoke("duplocale", -1, longArrayOf(base?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun freelocale(loc: LocaleT) {
    LibcDynamicFfi.invoke("freelocale", -1, longArrayOf(loc?.value ?: 0L))
}

public fun localeconvL(loc: LocaleT): Lconv? {
    val rawRet = LibcDynamicFfi.invoke("localeconv_l", -1, longArrayOf(loc?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
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

public fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("__settimeofday50", -1, longArrayOf(tv?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun dup3(src: CInt, dst: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("dup3", -1, longArrayOf(src.toLong(), dst.toLong(), flags.toLong())).toInt()
}

public fun kqueue1(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("kqueue1", -1, longArrayOf(flags.toLong())).toInt()
}

public fun lwpSelf(): LwpidT {
    LibcDynamicFfi.invoke("_lwp_self", -1, longArrayOf())
    return null as LwpidT
}

public fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmem", -1, longArrayOf(haystack?.value ?: 0L, haystacklen.toLong(), needle?.value ?: 0L, needlelen.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// link.h
public fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dl_iterate_phdr", -1, longArrayOf(callback?.value ?: 0L, data?.value ?: 0L)).toInt()
}

// dlfcn.h
public fun dlauxinfo(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("_dlauxinfo", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun iconvOpen(tocode: String?, fromcode: String?): IconvT {
    val __cstr_0 = if (tocode == null) 0L else LibcDynamicFfi.allocUtf8CString(tocode)
    val __cstr_1 = if (fromcode == null) 0L else LibcDynamicFfi.allocUtf8CString(fromcode)
    try {
        val rawRet = LibcDynamicFfi.invoke("iconv_open", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT {
    val __slot_2 = if (inbytesleft == null) 0L else LibcDynamicFfi.allocScalarSlot(inbytesleft.toLong())
    val __slot_4 = if (outbytesleft == null) 0L else LibcDynamicFfi.allocScalarSlot(outbytesleft.toLong())
    try {
        return LibcDynamicFfi.invoke("iconv", -1, longArrayOf(cd?.value ?: 0L, inbuf?.value ?: 0L, __slot_2, outbuf?.value ?: 0L, __slot_4)).toULong()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun iconvClose(cd: IconvT): CInt {
    return LibcDynamicFfi.invoke("iconv_close", -1, longArrayOf(cd?.value ?: 0L)).toInt()
}

public fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt {
    return LibcDynamicFfi.invoke("timer_create", -1, longArrayOf(clockid.toLong(), sevp?.value ?: 0L, timerid?.value ?: 0L)).toInt()
}

public fun timerDelete(timerid: TimerT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("timer_delete", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun timerGetoverrun(timerid: TimerT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("timer_getoverrun", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("__timer_gettime50", -1, longArrayOf(__scratch_0, currValue?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("__timer_settime50", -1, longArrayOf(__scratch_0, flags.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? {
    val __cstr_1 = if (symbol == null) 0L else LibcDynamicFfi.allocUtf8CString(symbol)
    val __cstr_2 = if (version == null) 0L else LibcDynamicFfi.allocUtf8CString(version)
    try {
        val rawRet = LibcDynamicFfi.invoke("dlvsym", -1, longArrayOf(handle?.value ?: 0L, __cstr_1, __cstr_2))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

// Added in `NetBSD` 7.0
public fun explicitMemset(b: COpaquePointer?, c: CInt, len: SizeT) {
    LibcDynamicFfi.invoke("explicit_memset", -1, longArrayOf(b?.value ?: 0L, c.toLong(), len.toLong()))
}

public fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("consttime_memequal", -1, longArrayOf(a?.value ?: 0L, b?.value ?: 0L, len.toLong())).toInt()
}

public fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
    val __cstr_0 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        LibcDynamicFfi.invoke("setproctitle", 1, longArrayOf(__cstr_0) + variadicArgs)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mremap(oldp: COpaquePointer?, oldsize: SizeT, newp: COpaquePointer?, newsize: SizeT, flags: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mremap", -1, longArrayOf(oldp?.value ?: 0L, oldsize.toLong(), newp?.value ?: 0L, newsize.toLong(), flags.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt {
    return LibcDynamicFfi.invoke("__sched_rr_get_interval50", -1, longArrayOf(pid.toLong(), t?.value ?: 0L)).toInt()
}

public fun schedSetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedGetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_getparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedGetscheduler(pid: PidT): CInt {
    return LibcDynamicFfi.invoke("sched_getscheduler", -1, longArrayOf(pid.toLong())).toInt()
}

public fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setscheduler", -1, longArrayOf(pid.toLong(), policy.toLong(), param?.value ?: 0L)).toInt()
}

public fun pollts(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: SigsetT?): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("__pollts50", -1, longArrayOf(fds?.value ?: 0L, __scratch_1, ts?.value ?: 0L, sigmask?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("getrandom", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong(), flags.toLong()))
}

public fun reboot(mode: CInt, bootstr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("reboot", -1, longArrayOf(mode.toLong(), bootstr?.value ?: 0L)).toInt()
}

public fun lwpPark(clock: ClockidT, flags: CInt, ts: Timespec?, unpark: LwpidT, hint: COpaquePointer?, unparkhint: COpaquePointer?): CInt {
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("___lwp_park60", -1, longArrayOf(clock.toLong(), flags.toLong(), ts?.value ?: 0L, __scratch_3, hint?.value ?: 0L, unparkhint?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun lwpUnpark(lwp: LwpidT, hint: COpaquePointer?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("_lwp_unpark", -1, longArrayOf(__scratch_0, hint?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun lwpUnparkAll(targets: LwpidT?, ntargets: SizeT, hint: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("_lwp_unpark_all", -1, longArrayOf(targets?.value ?: 0L, ntargets.toLong(), hint?.value ?: 0L)).toInt()
}

public fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getmntinfo", -1, longArrayOf(mntbufp?.value ?: 0L, flags.toLong())).toInt()
}

public fun getvfsstat(buf: Statvfs?, bufsize: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getvfsstat", -1, longArrayOf(buf?.value ?: 0L, bufsize.toLong(), flags.toLong())).toInt()
}

public fun eventfd(value: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("eventfd", -1, longArrayOf(value.toLong(), flags.toLong())).toInt()
}

public fun eventfdRead(efd: CInt, valp: ULong?): CInt {
    val __slot_1 = if (valp == null) 0L else LibcDynamicFfi.allocScalarSlot(valp.toLong())
    try {
        return LibcDynamicFfi.invoke("eventfd_read", -1, longArrayOf(efd.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun eventfdWrite(efd: CInt, value: EventfdT): CInt {
    return LibcDynamicFfi.invoke("eventfd_write", -1, longArrayOf(efd.toLong(), value.toLong())).toInt()
}

// Added in `NetBSD` 10.0
public fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("timerfd_create", -1, longArrayOf(clockid.toLong(), flags.toLong())).toInt()
}

public fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timerfd_gettime", -1, longArrayOf(fd.toLong(), currValue?.value ?: 0L)).toInt()
}

public fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timerfd_settime", -1, longArrayOf(fd.toLong(), flags.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
}

public fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    LibcDynamicFfi.invoke("qsort_r", -1, longArrayOf(base?.value ?: 0L, num.toLong(), size.toLong(), compar?.value ?: 0L, arg?.value ?: 0L))
}

public fun aioRead(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_read", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun aioWrite(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_write", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_fsync", -1, longArrayOf(op.toLong(), aiocbp?.value ?: 0L)).toInt()
}

public fun aioError(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_error", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun aioReturn(aiocbp: Aiocb?): SsizeT {
    return LibcDynamicFfi.invoke("aio_return", -1, longArrayOf(aiocbp?.value ?: 0L))
}

public fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("__aio_suspend50", -1, longArrayOf(aiocbList?.value ?: 0L, nitems.toLong(), timeout?.value ?: 0L)).toInt()
}

public fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_cancel", -1, longArrayOf(fd.toLong(), aiocbp?.value ?: 0L)).toInt()
}

public fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("lio_listio", -1, longArrayOf(mode.toLong(), aiocbList?.value ?: 0L, nitems.toLong(), sevp?.value ?: 0L)).toInt()
}

public fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("__getpwent_r50", -1, longArrayOf(pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrent_r", -1, longArrayOf(grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun efopen(p: String?, m: String?): FILE {
    val __cstr_0 = if (p == null) 0L else LibcDynamicFfi.allocUtf8CString(p)
    val __cstr_1 = if (m == null) 0L else LibcDynamicFfi.allocUtf8CString(m)
    try {
        val rawRet = LibcDynamicFfi.invoke("efopen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun emalloc(n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("emalloc", -1, longArrayOf(n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ecalloc(n: SizeT, c: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ecalloc", -1, longArrayOf(n.toLong(), c.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun erealloc(p: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("erealloc", -1, longArrayOf(p?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ereallocarr(p: COpaquePointer?, n: SizeT, s: SizeT) {
    LibcDynamicFfi.invoke("ereallocarr", -1, longArrayOf(p?.value ?: 0L, n.toLong(), s.toLong()))
}

public fun estrdup(s: String?): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("estrdup", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun estrndup(s: String?, len: SizeT): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("estrndup", -1, longArrayOf(__cstr_0, len.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun estrlcpy(dst: COpaquePointer?, src: String?, len: SizeT): SizeT {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        return LibcDynamicFfi.invoke("estrlcpy", -1, longArrayOf(dst?.value ?: 0L, __cstr_1, len.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun estrlcat(dst: COpaquePointer?, src: String?, len: SizeT): SizeT {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        return LibcDynamicFfi.invoke("estrlcat", -1, longArrayOf(dst?.value ?: 0L, __cstr_1, len.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun estrtoi(nptr: String?, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invoke("estrtoi", -1, longArrayOf(__cstr_0, base.toLong(), lo, hi))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun estrtou(nptr: String?, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invoke("estrtou", -1, longArrayOf(__cstr_0, base.toLong(), lo.toLong(), hi.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun easprintf(string: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        return LibcDynamicFfi.invoke("easprintf", 2, longArrayOf(string?.value ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun evasprintf(string: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        return LibcDynamicFfi.invoke("evasprintf", 2, longArrayOf(string?.value ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? {
    val rawRet = LibcDynamicFfi.invoke("esetfunc", -1, longArrayOf(cb?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun securePath(path: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("secure_path", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun snprintb(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong): CInt {
    val __cstr_2 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        return LibcDynamicFfi.invoke("snprintb", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong(), __cstr_2, value.toLong())).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun snprintbM(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong, max: SizeT): CInt {
    val __cstr_2 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        return LibcDynamicFfi.invoke("snprintb_m", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong(), __cstr_2, value.toLong(), max.toLong())).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun getbootfile(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getbootfile", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getbyteorder(): CInt {
    return LibcDynamicFfi.invoke("getbyteorder", -1, longArrayOf()).toInt()
}

public fun getdiskrawname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? {
    val __cstr_2 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getdiskrawname", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong(), __cstr_2))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun getdiskcookedname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? {
    val __cstr_2 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getdiskcookedname", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong(), __cstr_2))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun getfsspecname(buf: COpaquePointer?, buflen: SizeT, spec: String?): COpaquePointer? {
    val __cstr_2 = if (spec == null) 0L else LibcDynamicFfi.allocUtf8CString(spec)
    try {
        val rawRet = LibcDynamicFfi.invoke("getfsspecname", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong(), __cstr_2))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun strpct(buf: COpaquePointer?, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("strpct", -1, longArrayOf(buf?.value ?: 0L, bufsiz.toLong(), numerator.toLong(), denominator.toLong(), precision.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun strspct(buf: COpaquePointer?, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("strspct", -1, longArrayOf(buf?.value ?: 0L, bufsiz.toLong(), numerator, denominator, precision.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun login(ut: Utmp?) {
    LibcDynamicFfi.invoke("__login50", -1, longArrayOf(ut?.value ?: 0L))
}

public fun loginx(ut: Utmpx?) {
    LibcDynamicFfi.invoke("__loginx50", -1, longArrayOf(ut?.value ?: 0L))
}

public fun logout(line: String?) {
    val __cstr_0 = if (line == null) 0L else LibcDynamicFfi.allocUtf8CString(line)
    try {
        LibcDynamicFfi.invoke("logout", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun logoutx(line: String?, status: CInt, tpe: CInt) {
    val __cstr_0 = if (line == null) 0L else LibcDynamicFfi.allocUtf8CString(line)
    try {
        LibcDynamicFfi.invoke("logoutx", -1, longArrayOf(__cstr_0, status.toLong(), tpe.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun logwtmp(line: String?, name: String?, host: String?) {
    val __cstr_0 = if (line == null) 0L else LibcDynamicFfi.allocUtf8CString(line)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __cstr_2 = if (host == null) 0L else LibcDynamicFfi.allocUtf8CString(host)
    try {
        LibcDynamicFfi.invoke("logwtmp", -1, longArrayOf(__cstr_0, __cstr_1, __cstr_2))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun logwtmpx(line: String?, name: String?, host: String?, status: CInt, tpe: CInt) {
    val __cstr_0 = if (line == null) 0L else LibcDynamicFfi.allocUtf8CString(line)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __cstr_2 = if (host == null) 0L else LibcDynamicFfi.allocUtf8CString(host)
    try {
        LibcDynamicFfi.invoke("logwtmpx", -1, longArrayOf(__cstr_0, __cstr_1, __cstr_2, status.toLong(), tpe.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getxattr", -1, longArrayOf(__cstr_0, __cstr_1, value?.value ?: 0L, size.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("lgetxattr", -1, longArrayOf(__cstr_0, __cstr_1, value?.value ?: 0L, size.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("fgetxattr", -1, longArrayOf(filedes.toLong(), __cstr_1, value?.value ?: 0L, size.toLong()))
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("setxattr", -1, longArrayOf(__cstr_0, __cstr_1, value?.value ?: 0L, size.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("lsetxattr", -1, longArrayOf(__cstr_0, __cstr_1, value?.value ?: 0L, size.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("fsetxattr", -1, longArrayOf(filedes.toLong(), __cstr_1, value?.value ?: 0L, size.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("listxattr", -1, longArrayOf(__cstr_0, list?.value ?: 0L, size.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("llistxattr", -1, longArrayOf(__cstr_0, list?.value ?: 0L, size.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("flistxattr", -1, longArrayOf(filedes.toLong(), list?.value ?: 0L, size.toLong()))
}

public fun removexattr(path: String?, name: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("removexattr", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun lremovexattr(path: String?, name: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("lremovexattr", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fremovexattr(fd: CInt, path: String?, name: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("fremovexattr", -1, longArrayOf(fd.toLong(), __cstr_1, __cstr_2)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun stringToFlags(stringP: COpaquePointer?, setp: CUlong?, clrp: CUlong?): CInt {
    val __slot_1 = if (setp == null) 0L else LibcDynamicFfi.allocScalarSlot(setp.toLong())
    val __slot_2 = if (clrp == null) 0L else LibcDynamicFfi.allocScalarSlot(clrp.toLong())
    try {
        return LibcDynamicFfi.invoke("string_to_flags", -1, longArrayOf(stringP?.value ?: 0L, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun flagsToString(flags: CUlong, def: String?): CInt {
    val __cstr_1 = if (def == null) 0L else LibcDynamicFfi.allocUtf8CString(def)
    try {
        return LibcDynamicFfi.invoke("flags_to_string", -1, longArrayOf(flags.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun kinfoGetvmmap(pid: PidT, cntp: SizeT?): KinfoVmentry? {
    val __slot_1 = if (cntp == null) 0L else LibcDynamicFfi.allocScalarSlot(cntp.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("kinfo_getvmmap", -1, longArrayOf(pid.toLong(), __slot_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT {
    return LibcDynamicFfi.invoke("backtrace", -1, longArrayOf(addrlist?.value ?: 0L, len.toLong())).toULong()
}

public fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("backtrace_symbols", -1, longArrayOf(addrlist?.value ?: 0L, len.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("backtrace_symbols_fd", -1, longArrayOf(addrlist?.value ?: 0L, len.toLong(), fd.toLong())).toInt()
}

public fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? {
    val __cstr_2 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        val rawRet = LibcDynamicFfi.invoke("backtrace_symbols_fmt", -1, longArrayOf(addrlist?.value ?: 0L, len.toLong(), __cstr_2))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: SizeT, fd: CInt, fmt: String?): CInt {
    val __cstr_3 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        return LibcDynamicFfi.invoke("backtrace_symbols_fd_fmt", -1, longArrayOf(addrlist?.value ?: 0L, len.toLong(), fd.toLong(), __cstr_3)).toInt()
    } finally {
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}
