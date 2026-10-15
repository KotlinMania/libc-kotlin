package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.LC_COLLATE
import io.github.kotlinmania.libc.unix.bsd.LC_CTYPE
import io.github.kotlinmania.libc.unix.bsd.LC_MESSAGES
import io.github.kotlinmania.libc.unix.bsd.LC_MONETARY
import io.github.kotlinmania.libc.unix.bsd.LC_NUMERIC
import io.github.kotlinmania.libc.unix.bsd.LC_TIME
import io.github.kotlinmania.libc.unix.bsd.MDMBUF
import io.github.kotlinmania.libc.unix.bsd.O_NONBLOCK
import io.github.kotlinmania.libc.unix.bsd.O_RDWR
import io.github.kotlinmania.libc.unix.bsd.O_WRONLY
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.CRTSCTS

public const val CRTSCTS: UInt = 0x00010000u

public const val IOCPARM_MASK: UInt = 0x1fffu

public const val LC_CTYPE: Int = 0

public const val LC_NUMERIC: Int = 1

public const val LC_TIME: Int = 2

public const val LC_COLLATE: Int = 3

public const val LC_MONETARY: Int = 4

public const val LC_MESSAGES: Int = 5

public const val MDMBUF: UInt = 0x00100000u

public const val O_RDWR: Int = 0x0002

public const val O_WRONLY: Int = 0x0001

public const val AT_FDCWD: Int = -100

public const val AT_EACCESS: Int = 0x100

public const val AT_SYMLINK_NOFOLLOW: Int = 0x200

public const val AT_SYMLINK_FOLLOW: Int = 0x400

public const val AT_REMOVEDIR: Int = 0x800

public const val AT_NULL: Int = 0

public const val AT_IGNORE: Int = 1

public const val AT_EXECFD: Int = 2

public const val AT_PHDR: Int = 3

public const val AT_PHENT: Int = 4

public const val AT_PHNUM: Int = 5

public const val AT_PAGESZ: Int = 6

public const val AT_BASE: Int = 7

public const val AT_FLAGS: Int = 8

public const val AT_ENTRY: Int = 9

public const val AT_DCACHEBSIZE: Int = 10

public const val AT_ICACHEBSIZE: Int = 11

public const val AT_UCACHEBSIZE: Int = 12

public const val AT_STACKBASE: Int = 13

public const val AT_EUID: Int = 2000

public const val AT_RUID: Int = 2001

public const val AT_EGID: Int = 2002

public const val AT_RGID: Int = 2003

public const val AT_SUN_LDELF: Int = 2004

public const val AT_SUN_LDSHDR: Int = 2005

public const val AT_SUN_LDNAME: Int = 2006

public const val AT_SUN_PLATFORM: Int = 2008

public const val AT_SUN_HWCAP: Int = 2009

public const val AT_SUN_IFLUSH: Int = 2010

public const val AT_SUN_CPU: Int = 2011

public const val AT_SUN_EMUL_ENTRY: Int = 2012

public const val AT_SUN_EMUL_EXECFD: Int = 2013

public const val AT_SUN_EXECNAME: Int = 2014

public const val EXTATTR_NAMESPACE_USER: Int = 1

public const val EXTATTR_NAMESPACE_SYSTEM: Int = 2

public val LC_COLLATE_MASK: Int = 1 shl LC_COLLATE

public val LC_CTYPE_MASK: Int = 1 shl LC_CTYPE

public val LC_MONETARY_MASK: Int = 1 shl LC_MONETARY

public val LC_NUMERIC_MASK: Int = 1 shl LC_NUMERIC

public val LC_TIME_MASK: Int = 1 shl LC_TIME

public val LC_MESSAGES_MASK: Int = 1 shl LC_MESSAGES

public val LC_ALL_MASK: Int = 0.inv()

public const val ERA: Int = 52

public const val ERA_D_FMT: Int = 53

public const val ERA_D_T_FMT: Int = 54

public const val ERA_T_FMT: Int = 55

public const val ALT_DIGITS: Int = 56

public const val O_CLOEXEC: Int = 0x400000

public const val O_ALT_IO: Int = 0x40000

public const val O_NOSIGPIPE: Int = 0x1000000

public const val O_SEARCH: Int = 0x800000

public const val O_DIRECTORY: Int = 0x200000

public const val O_DIRECT: Int = 0x00080000

public const val O_RSYNC: Int = 0x00020000

public const val MS_SYNC: Int = 0x4

public const val MS_INVALIDATE: Int = 0x2

public const val RLIMIT_SBSIZE: Int = 9

public const val RLIMIT_AS: Int = 10

public const val RLIMIT_NTHR: Int = 11

public const val RLIM_NLIMITS: Int = 12

public const val EIDRM: Int = 82

public const val ENOMSG: Int = 83

public const val EOVERFLOW: Int = 84

public const val EILSEQ: Int = 85

public const val ENOTSUP: Int = 86

public const val ECANCELED: Int = 87

public const val EBADMSG: Int = 88

public const val ENODATA: Int = 89

public const val ENOSR: Int = 90

public const val ENOSTR: Int = 91

public const val ETIME: Int = 92

public const val ENOATTR: Int = 93

public const val EMULTIHOP: Int = 94

public const val ENOLINK: Int = 95

public const val EPROTO: Int = 96

public const val EOWNERDEAD: Int = 97

public const val ENOTRECOVERABLE: Int = 98

public const val ELAST: Int = 98

public const val F_DUPFD_CLOEXEC: Int = 12

public const val F_CLOSEM: Int = 10

public const val F_GETNOSIGPIPE: Int = 13

public const val F_SETNOSIGPIPE: Int = 14

public const val F_MAXFD: Int = 11

public const val F_GETPATH: Int = 15

public const val FUTEX_WAIT: Int = 0

public const val FUTEX_WAKE: Int = 1

public const val FUTEX_FD: Int = 2

public const val FUTEX_REQUEUE: Int = 3

public const val FUTEX_CMP_REQUEUE: Int = 4

public const val FUTEX_WAKE_OP: Int = 5

public const val FUTEX_LOCK_PI: Int = 6

public const val FUTEX_UNLOCK_PI: Int = 7

public const val FUTEX_TRYLOCK_PI: Int = 8

public const val FUTEX_WAIT_BITSET: Int = 9

public const val FUTEX_WAKE_BITSET: Int = 10

public const val FUTEX_WAIT_REQUEUE_PI: Int = 11

public const val FUTEX_CMP_REQUEUE_PI: Int = 12

public val FUTEX_PRIVATE_FLAG: Int = 1 shl 7

public val FUTEX_CLOCK_REALTIME: Int = 1 shl 8

public val FUTEX_CMD_MASK: Int = (FUTEX_PRIVATE_FLAG or FUTEX_CLOCK_REALTIME).inv()

public val FUTEX_WAITERS: UInt = 1u shl 31

public val FUTEX_OWNER_DIED: UInt = 1u shl 30

public val FUTEX_SYNCOBJ_1: UInt = 1u shl 29

public val FUTEX_SYNCOBJ_0: UInt = 1u shl 28

public val FUTEX_TID_MASK: UInt = (1u shl 28) - 1u

public val FUTEX_BITSET_MATCH_ANY: UInt = 0u.inv()

public const val IP_RECVDSTADDR: Int = 7

public const val IP_SENDSRCADDR: Int = IP_RECVDSTADDR

public const val IP_RECVIF: Int = 20

public const val IP_PKTINFO: Int = 25

public const val IP_RECVPKTINFO: Int = 26

public const val IPV6_JOIN_GROUP: Int = 12

public const val IPV6_LEAVE_GROUP: Int = 13

public const val TCP_KEEPIDLE: Int = 3

public const val TCP_KEEPINTVL: Int = 5

public const val TCP_KEEPCNT: Int = 6

public const val TCP_KEEPINIT: Int = 7

public const val TCP_MD5SIG: Int = 0x10

public const val TCP_CONGCTL: Int = 0x20

public const val SOCK_CONN_DGRAM: Int = 6

public const val SOCK_DCCP: Int = SOCK_CONN_DGRAM

public const val SOCK_NOSIGPIPE: Int = 0x40000000

public const val SOCK_FLAGS_MASK: Int = 0xf0000000.toInt()

public const val SO_SNDTIMEO: Int = 0x100b

public const val SO_RCVTIMEO: Int = 0x100c

public const val SO_NOSIGPIPE: Int = 0x0800

public const val SO_ACCEPTFILTER: Int = 0x1000

public const val SO_TIMESTAMP: Int = 0x2000

public const val SO_OVERFLOWED: Int = 0x1009

public const val SO_NOHEADER: Int = 0x100a

public const val LOCAL_OCREDS: Int = 0x0001

public const val LOCAL_CONNWAIT: Int = 0x0002

public const val LOCAL_PEEREID: Int = 0x0003

public const val LOCAL_CREDS: Int = 0x0004

public const val IPPROTO_HOPOPTS: Int = 0

public const val IPPROTO_IGMP: Int = 2

public const val IPPROTO_GGP: Int = 3

public const val IPPROTO_IPIP: Int = 4

public const val IPPROTO_EGP: Int = 8

public const val IPPROTO_PUP: Int = 12

public const val IPPROTO_IDP: Int = 22

public const val IPPROTO_TP: Int = 29

public const val IPPROTO_DCCP: Int = 33

public const val IPPROTO_ROUTING: Int = 43

public const val IPPROTO_FRAGMENT: Int = 44

public const val IPPROTO_RSVP: Int = 46

public const val IPPROTO_GRE: Int = 47

public const val IPPROTO_ESP: Int = 50

public const val IPPROTO_AH: Int = 51

public const val IPPROTO_MOBILE: Int = 55

public const val IPPROTO_IPV6_ICMP: Int = 58

public const val IPPROTO_NONE: Int = 59

public const val IPPROTO_DSTOPTS: Int = 60

public const val IPPROTO_EON: Int = 80

public const val IPPROTO_ETHERIP: Int = 97

public const val IPPROTO_ENCAP: Int = 98

public const val IPPROTO_PIM: Int = 103

public const val IPPROTO_IPCOMP: Int = 108

public const val IPPROTO_VRRP: Int = 112

public const val IPPROTO_CARP: Int = 112

public const val IPPROTO_L2TP: Int = 115

public const val IPPROTO_SCTP: Int = 132

public const val IPPROTO_PFSYNC: Int = 240

public const val IPPROTO_MAX: Int = 256

public const val IPPROTO_DONE: Int = 257

public const val CTL_IPPROTO_IPSEC: Int = 258

public const val AF_OROUTE: Int = 17

public const val AF_ARP: Int = 28

public const val pseudo_AF_KEY: Int = 29

public const val pseudo_AF_HDRCMPLT: Int = 30

public const val AF_BLUETOOTH: Int = 31

public const val AF_IEEE80211: Int = 32

public const val AF_MPLS: Int = 33

public const val AF_ROUTE: Int = 34

public const val NET_RT_DUMP: Int = 1

public const val NET_RT_FLAGS: Int = 2

public const val NET_RT_OOOIFLIST: Int = 3

public const val NET_RT_OOIFLIST: Int = 4

public const val NET_RT_OIFLIST: Int = 5

public const val NET_RT_IFLIST: Int = 6

public const val PF_OROUTE: Int = AF_OROUTE

public const val PF_ARP: Int = AF_ARP

public const val PF_KEY: Int = pseudo_AF_KEY

public const val PF_BLUETOOTH: Int = AF_BLUETOOTH

public const val PF_MPLS: Int = AF_MPLS

public const val PF_ROUTE: Int = AF_ROUTE

public const val MSG_NBIO: Int = 0x1000

public const val MSG_WAITFORONE: Int = 0x2000

public const val MSG_NOTIFICATION: Int = 0x4000

public const val SCM_TIMESTAMP: Int = 0x08

public const val SCM_CREDS: Int = 0x10

public const val O_DSYNC: Int = 0x10000

public const val MAP_RENAME: Int = 0x20

public const val MAP_NORESERVE: Int = 0x40

public const val MAP_HASSEMAPHORE: Int = 0x200

public const val MAP_TRYFIXED: Int = 0x400

public const val MAP_WIRED: Int = 0x800

public const val MAP_STACK: Int = 0x2000

public const val MAP_ALIGNMENT_SHIFT: Int = 24

public val MAP_ALIGNMENT_MASK: Int = 0xff shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_64KB: Int = 16 shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_16MB: Int = 24 shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_4GB: Int = 32 shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_1TB: Int = 40 shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_256TB: Int = 48 shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNMENT_64PB: Int = 56 shl MAP_ALIGNMENT_SHIFT

public const val MAP_REMAPDUP: Int = 0x004

public const val DCCP_TYPE_REQUEST: Int = 0

public const val DCCP_TYPE_RESPONSE: Int = 1

public const val DCCP_TYPE_DATA: Int = 2

public const val DCCP_TYPE_ACK: Int = 3

public const val DCCP_TYPE_DATAACK: Int = 4

public const val DCCP_TYPE_CLOSEREQ: Int = 5

public const val DCCP_TYPE_CLOSE: Int = 6

public const val DCCP_TYPE_RESET: Int = 7

public const val DCCP_TYPE_MOVE: Int = 8

public const val DCCP_FEATURE_CC: Int = 1

public const val DCCP_FEATURE_ECN: Int = 2

public const val DCCP_FEATURE_ACKRATIO: Int = 3

public const val DCCP_FEATURE_ACKVECTOR: Int = 4

public const val DCCP_FEATURE_MOBILITY: Int = 5

public const val DCCP_FEATURE_LOSSWINDOW: Int = 6

public const val DCCP_FEATURE_CONN_NONCE: Int = 8

public const val DCCP_FEATURE_IDENTREG: Int = 7

public const val DCCP_OPT_PADDING: Int = 0

public const val DCCP_OPT_DATA_DISCARD: Int = 1

public const val DCCP_OPT_SLOW_RECV: Int = 2

public const val DCCP_OPT_BUF_CLOSED: Int = 3

public const val DCCP_OPT_CHANGE_L: Int = 32

public const val DCCP_OPT_CONFIRM_L: Int = 33

public const val DCCP_OPT_CHANGE_R: Int = 34

public const val DCCP_OPT_CONFIRM_R: Int = 35

public const val DCCP_OPT_INIT_COOKIE: Int = 36

public const val DCCP_OPT_NDP_COUNT: Int = 37

public const val DCCP_OPT_ACK_VECTOR0: Int = 38

public const val DCCP_OPT_ACK_VECTOR1: Int = 39

public const val DCCP_OPT_RECV_BUF_DROPS: Int = 40

public const val DCCP_OPT_TIMESTAMP: Int = 41

public const val DCCP_OPT_TIMESTAMP_ECHO: Int = 42

public const val DCCP_OPT_ELAPSEDTIME: Int = 43

public const val DCCP_OPT_DATACHECKSUM: Int = 44

public const val DCCP_REASON_UNSPEC: Int = 0

public const val DCCP_REASON_CLOSED: Int = 1

public const val DCCP_REASON_INVALID: Int = 2

public const val DCCP_REASON_OPTION_ERR: Int = 3

public const val DCCP_REASON_FEA_ERR: Int = 4

public const val DCCP_REASON_CONN_REF: Int = 5

public const val DCCP_REASON_BAD_SNAME: Int = 6

public const val DCCP_REASON_BAD_COOKIE: Int = 7

public const val DCCP_REASON_INV_MOVE: Int = 8

public const val DCCP_REASON_UNANSW_CH: Int = 10

public const val DCCP_REASON_FRUITLESS_NEG: Int = 11

public const val DCCP_CCID: Int = 1

public const val DCCP_CSLEN: Int = 2

public const val DCCP_MAXSEG: Int = 4

public const val DCCP_SERVICE: Int = 8

public const val DCCP_NDP_LIMIT: Int = 16

public const val DCCP_SEQ_NUM_LIMIT: Int = 16777216

public const val DCCP_MAX_OPTIONS: Int = 32

public const val DCCP_MAX_PKTS: Int = 100

public const val _PC_LINK_MAX: Int = 1

public const val _PC_MAX_CANON: Int = 2

public const val _PC_MAX_INPUT: Int = 3

public const val _PC_NAME_MAX: Int = 4

public const val _PC_PATH_MAX: Int = 5

public const val _PC_PIPE_BUF: Int = 6

public const val _PC_CHOWN_RESTRICTED: Int = 7

public const val _PC_NO_TRUNC: Int = 8

public const val _PC_VDISABLE: Int = 9

public const val _PC_SYNC_IO: Int = 10

public const val _PC_FILESIZEBITS: Int = 11

public const val _PC_SYMLINK_MAX: Int = 12

public const val _PC_2_SYMLINKS: Int = 13

public const val _PC_ACL_EXTENDED: Int = 14

public const val _PC_MIN_HOLE_SIZE: Int = 15

public const val _CS_PATH: Int = 1

public const val _SC_SYNCHRONIZED_IO: Int = 31

public const val _SC_IOV_MAX: Int = 32

public const val _SC_MAPPED_FILES: Int = 33

public const val _SC_MEMLOCK: Int = 34

public const val _SC_MEMLOCK_RANGE: Int = 35

public const val _SC_MEMORY_PROTECTION: Int = 36

public const val _SC_LOGIN_NAME_MAX: Int = 37

public const val _SC_MONOTONIC_CLOCK: Int = 38

public const val _SC_CLK_TCK: Int = 39

public const val _SC_ATEXIT_MAX: Int = 40

public const val _SC_THREADS: Int = 41

public const val _SC_SEMAPHORES: Int = 42

public const val _SC_BARRIERS: Int = 43

public const val _SC_TIMERS: Int = 44

public const val _SC_SPIN_LOCKS: Int = 45

public const val _SC_READER_WRITER_LOCKS: Int = 46

public const val _SC_GETGR_R_SIZE_MAX: Int = 47

public const val _SC_GETPW_R_SIZE_MAX: Int = 48

public const val _SC_CLOCK_SELECTION: Int = 49

public const val _SC_ASYNCHRONOUS_IO: Int = 50

public const val _SC_AIO_LISTIO_MAX: Int = 51

public const val _SC_AIO_MAX: Int = 52

public const val _SC_MESSAGE_PASSING: Int = 53

public const val _SC_MQ_OPEN_MAX: Int = 54

public const val _SC_MQ_PRIO_MAX: Int = 55

public const val _SC_PRIORITY_SCHEDULING: Int = 56

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 57

public const val _SC_THREAD_KEYS_MAX: Int = 58

public const val _SC_THREAD_STACK_MIN: Int = 59

public const val _SC_THREAD_THREADS_MAX: Int = 60

public const val _SC_THREAD_ATTR_STACKADDR: Int = 61

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 62

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 63

public const val _SC_THREAD_PRIO_INHERIT: Int = 64

public const val _SC_THREAD_PRIO_PROTECT: Int = 65

public const val _SC_THREAD_PROCESS_SHARED: Int = 66

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 67

public const val _SC_TTY_NAME_MAX: Int = 68

public const val _SC_HOST_NAME_MAX: Int = 69

public const val _SC_PASS_MAX: Int = 70

public const val _SC_REGEXP: Int = 71

public const val _SC_SHELL: Int = 72

public const val _SC_SYMLOOP_MAX: Int = 73

public const val _SC_V6_ILP32_OFF32: Int = 74

public const val _SC_V6_ILP32_OFFBIG: Int = 75

public const val _SC_V6_LP64_OFF64: Int = 76

public const val _SC_V6_LPBIG_OFFBIG: Int = 77

public const val _SC_2_PBS: Int = 80

public const val _SC_2_PBS_ACCOUNTING: Int = 81

public const val _SC_2_PBS_CHECKPOINT: Int = 82

public const val _SC_2_PBS_LOCATE: Int = 83

public const val _SC_2_PBS_MESSAGE: Int = 84

public const val _SC_2_PBS_TRACK: Int = 85

public const val _SC_SPAWN: Int = 86

public const val _SC_SHARED_MEMORY_OBJECTS: Int = 87

public const val _SC_TIMER_MAX: Int = 88

public const val _SC_SEM_NSEMS_MAX: Int = 89

public const val _SC_CPUTIME: Int = 90

public const val _SC_THREAD_CPUTIME: Int = 91

public const val _SC_DELAYTIMER_MAX: Int = 92

public const val _SC_PHYS_PAGES: Int = 121

public const val _SC_NPROCESSORS_CONF: Int = 1001

public const val _SC_NPROCESSORS_ONLN: Int = 1002

public const val _SC_SCHED_RT_TS: Int = 2001

public const val _SC_SCHED_PRI_MIN: Int = 2002

public const val _SC_SCHED_PRI_MAX: Int = 2003

public const val FD_SETSIZE: ULong = 0x100uL

public const val ST_NOSUID: ULong = 8uL

public const val MNT_UNION: Int = 0x00000020

public const val MNT_NOCOREDUMP: Int = 0x00008000

public const val MNT_RELATIME: Int = 0x00020000

public const val MNT_IGNORE: Int = 0x00100000

public const val MNT_NFS4ACLS: Int = 0x00200000

public const val MNT_DISCARD: Int = 0x00800000

public const val MNT_EXTATTR: Int = 0x01000000

public const val MNT_LOG: Int = 0x02000000

public const val MNT_NOATIME: Int = 0x04000000

public const val MNT_AUTOMOUNTED: Int = 0x10000000

public const val MNT_SYMPERM: Int = 0x20000000

public const val MNT_NODEVMTIME: Int = 0x40000000

public const val MNT_SOFTDEP: Int = 0x80000000.toInt()

public const val MNT_POSIX1EACLS: Int = 0x00000800

public const val MNT_ACLS: Int = MNT_POSIX1EACLS

public const val MNT_WAIT: Int = 1

public const val MNT_NOWAIT: Int = 2

public const val MNT_LAZY: Int = 3

public const val IOCPARM_SHIFT: UInt = 16u

public const val IOCGROUP_SHIFT: UInt = 8u

public const val NTP_API: Int = 4

public const val LITTLE_ENDIAN: Int = 1234

public const val BIG_ENDIAN: Int = 4321

public const val PL_EVENT_NONE: Int = 0

public const val PL_EVENT_SIGNAL: Int = 1

public const val PL_EVENT_SUSPENDED: Int = 2

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { ptm_magic: 0x33330003, ptm_errorcheck: 0, ptm_pad1: Padding::uninit(), ptm_unused: Padding::uninit(), ptm_pad2: Padding::uninit(), ptm_waiters: 0 as *mut _, ptm_owner: 0, ptm_recursed: 0, ptm_spare2: 0 as *mut _, } (initializer represented at the FFI boundary)
// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { ptm_magic: 0x33330003, ptm_errorcheck: 0, ptm_unused: Padding::uninit(), ptm_waiters: 0 as *mut _, ptm_owner: 0, ptm_recursed: 0, ptm_spare2: 0 as *mut _, } (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { ptc_magic: 0x55550005, ptc_lock: 0, ptc_waiters_first: 0 as *mut _, ptc_waiters_last: 0 as *mut _, ptc_mutex: 0 as *mut _, ptc_private: 0 as *mut _, } (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { ptr_magic: 0x99990009, ptr_interlock: 0, ptr_rblocked_first: 0 as *mut _, ptr_rblocked_last: 0 as *mut _, ptr_wblocked_first: 0 as *mut _, ptr_wblocked_last: 0 as *mut _, ptr_nreaders: 0, ptr_owner: 0, ptr_private: 0 as *mut _, } (initializer represented at the FFI boundary)
public const val PTHREAD_MUTEX_NORMAL: Int = 0

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 1

public const val PTHREAD_MUTEX_RECURSIVE: Int = 2

public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL

public const val SCHED_NONE: Int = -1

public const val SCHED_OTHER: Int = 0

public const val SCHED_FIFO: Int = 1

public const val SCHED_RR: Int = 2

public const val EVFILT_AIO: UInt = 2u

public const val EVFILT_PROC: UInt = 4u

public const val EVFILT_READ: UInt = 0u

public const val EVFILT_SIGNAL: UInt = 5u

public const val EVFILT_TIMER: UInt = 6u

public const val EVFILT_VNODE: UInt = 3u

public const val EVFILT_WRITE: UInt = 1u

public const val EVFILT_FS: UInt = 7u

public const val EVFILT_USER: UInt = 8u

public const val EVFILT_EMPTY: UInt = 9u

public const val EV_ADD: UInt = 0x1u

public const val EV_DELETE: UInt = 0x2u

public const val EV_ENABLE: UInt = 0x4u

public const val EV_DISABLE: UInt = 0x8u

public const val EV_ONESHOT: UInt = 0x10u

public const val EV_CLEAR: UInt = 0x20u

public const val EV_RECEIPT: UInt = 0x40u

public const val EV_DISPATCH: UInt = 0x80u

public const val EV_FLAG1: UInt = 0x2000u

public const val EV_ERROR: UInt = 0x4000u

public const val EV_EOF: UInt = 0x8000u

public const val EV_SYSFLAGS: UInt = 0xf000u

public const val NOTE_TRIGGER: UInt = 0x01000000u

public const val NOTE_FFNOP: UInt = 0x00000000u

public const val NOTE_FFAND: UInt = 0x40000000u

public const val NOTE_FFOR: UInt = 0x80000000u

public const val NOTE_FFCOPY: UInt = 0xc0000000u

public const val NOTE_FFCTRLMASK: UInt = 0xc0000000u

public const val NOTE_FFLAGSMASK: UInt = 0x00ffffffu

public const val NOTE_LOWAT: UInt = 0x00000001u

public const val NOTE_DELETE: UInt = 0x00000001u

public const val NOTE_WRITE: UInt = 0x00000002u

public const val NOTE_EXTEND: UInt = 0x00000004u

public const val NOTE_ATTRIB: UInt = 0x00000008u

public const val NOTE_LINK: UInt = 0x00000010u

public const val NOTE_RENAME: UInt = 0x00000020u

public const val NOTE_REVOKE: UInt = 0x00000040u

public const val NOTE_EXIT: UInt = 0x80000000u

public const val NOTE_FORK: UInt = 0x40000000u

public const val NOTE_EXEC: UInt = 0x20000000u

public const val NOTE_PDATAMASK: UInt = 0x000fffffu

public const val NOTE_PCTRLMASK: UInt = 0xf0000000u

public const val NOTE_TRACK: UInt = 0x00000001u

public const val NOTE_TRACKERR: UInt = 0x00000002u

public const val NOTE_CHILD: UInt = 0x00000004u

public const val NOTE_MSECONDS: UInt = 0x00000000u

public const val NOTE_SECONDS: UInt = 0x00000001u

public const val NOTE_USECONDS: UInt = 0x00000002u

public const val NOTE_NSECONDS: UInt = 0x00000003u

public const val NOTE_ABSTIME: UInt = 0x000000010u

public const val TMP_MAX: UInt = 308915776u

public const val AI_PASSIVE: Int = 0x00000001

public const val AI_CANONNAME: Int = 0x00000002

public const val AI_NUMERICHOST: Int = 0x00000004

public const val AI_NUMERICSERV: Int = 0x00000008

public const val AI_ADDRCONFIG: Int = 0x00000400

public const val AI_SRV: Int = 0x00000800

public const val NI_MAXHOST: UInt = 1025u

public const val NI_MAXSERV: UInt = 32u

public const val NI_NOFQDN: Int = 0x00000001

public const val NI_NUMERICHOST: Int = 0x000000002

public const val NI_NAMEREQD: Int = 0x000000004

public const val NI_NUMERICSERV: Int = 0x000000008

public const val NI_DGRAM: Int = 0x00000010

public const val NI_WITHSCOPEID: Int = 0x00000020

public const val NI_NUMERICSCOPE: Int = 0x00000040

public const val RTLD_NOLOAD: Int = 0x2000

public const val RTLD_LOCAL: Int = 0x200

public const val CTL_MAXNAME: Int = 12

public const val SYSCTL_NAMELEN: Int = 32

public const val SYSCTL_DEFSIZE: Int = 8

public const val CTLTYPE_NODE: Int = 1

public const val CTLTYPE_INT: Int = 2

public const val CTLTYPE_STRING: Int = 3

public const val CTLTYPE_QUAD: Int = 4

public const val CTLTYPE_STRUCT: Int = 5

public const val CTLTYPE_BOOL: Int = 6

public const val CTLFLAG_READONLY: Int = 0x00000000

public const val CTLFLAG_READWRITE: Int = 0x00000070

public const val CTLFLAG_ANYWRITE: Int = 0x00000080

public const val CTLFLAG_PRIVATE: Int = 0x00000100

public const val CTLFLAG_PERMANENT: Int = 0x00000200

public const val CTLFLAG_OWNDATA: Int = 0x00000400

public const val CTLFLAG_IMMEDIATE: Int = 0x00000800

public const val CTLFLAG_HEX: Int = 0x00001000

public const val CTLFLAG_ROOT: Int = 0x00002000

public const val CTLFLAG_ANYNUMBER: Int = 0x00004000

public const val CTLFLAG_HIDDEN: Int = 0x00008000

public const val CTLFLAG_ALIAS: Int = 0x00010000

public const val CTLFLAG_MMAP: Int = 0x00020000

public const val CTLFLAG_OWNDESC: Int = 0x00040000

public const val CTLFLAG_UNSIGNED: Int = 0x00080000

public const val SYSCTL_VERS_MASK: Int = 0xff000000.toInt()

public const val SYSCTL_VERS_0: Int = 0x00000000

public const val SYSCTL_VERS_1: Int = 0x01000000

public const val SYSCTL_VERSION: Int = SYSCTL_VERS_1

public const val CTL_EOL: Int = -1

public const val CTL_QUERY: Int = -2

public const val CTL_CREATE: Int = -3

public const val CTL_CREATESYM: Int = -4

public const val CTL_DESTROY: Int = -5

public const val CTL_MMAP: Int = -6

public const val CTL_DESCRIBE: Int = -7

public const val CTL_UNSPEC: Int = 0

public const val CTL_KERN: Int = 1

public const val CTL_VM: Int = 2

public const val CTL_VFS: Int = 3

public const val CTL_NET: Int = 4

public const val CTL_DEBUG: Int = 5

public const val CTL_HW: Int = 6

public const val CTL_MACHDEP: Int = 7

public const val CTL_USER: Int = 8

public const val CTL_DDB: Int = 9

public const val CTL_PROC: Int = 10

public const val CTL_VENDOR: Int = 11

public const val CTL_EMUL: Int = 12

public const val CTL_SECURITY: Int = 13

public const val KERN_OSTYPE: Int = 1

public const val KERN_OSRELEASE: Int = 2

public const val KERN_OSREV: Int = 3

public const val KERN_VERSION: Int = 4

public const val KERN_MAXVNODES: Int = 5

public const val KERN_MAXPROC: Int = 6

public const val KERN_MAXFILES: Int = 7

public const val KERN_ARGMAX: Int = 8

public const val KERN_SECURELVL: Int = 9

public const val KERN_HOSTNAME: Int = 10

public const val KERN_HOSTID: Int = 11

public const val KERN_CLOCKRATE: Int = 12

public const val KERN_VNODE: Int = 13

public const val KERN_PROC: Int = 14

public const val KERN_FILE: Int = 15

public const val KERN_PROF: Int = 16

public const val KERN_POSIX1: Int = 17

public const val KERN_NGROUPS: Int = 18

public const val KERN_JOB_CONTROL: Int = 19

public const val KERN_SAVED_IDS: Int = 20

public const val KERN_OBOOTTIME: Int = 21

public const val KERN_DOMAINNAME: Int = 22

public const val KERN_MAXPARTITIONS: Int = 23

public const val KERN_RAWPARTITION: Int = 24

public const val KERN_NTPTIME: Int = 25

public const val KERN_TIMEX: Int = 26

public const val KERN_AUTONICETIME: Int = 27

public const val KERN_AUTONICEVAL: Int = 28

public const val KERN_RTC_OFFSET: Int = 29

public const val KERN_ROOT_DEVICE: Int = 30

public const val KERN_MSGBUFSIZE: Int = 31

public const val KERN_FSYNC: Int = 32

public const val KERN_OLDSYSVMSG: Int = 33

public const val KERN_OLDSYSVSEM: Int = 34

public const val KERN_OLDSYSVSHM: Int = 35

public const val KERN_OLDSHORTCORENAME: Int = 36

public const val KERN_SYNCHRONIZED_IO: Int = 37

public const val KERN_IOV_MAX: Int = 38

public const val KERN_MBUF: Int = 39

public const val KERN_MAPPED_FILES: Int = 40

public const val KERN_MEMLOCK: Int = 41

public const val KERN_MEMLOCK_RANGE: Int = 42

public const val KERN_MEMORY_PROTECTION: Int = 43

public const val KERN_LOGIN_NAME_MAX: Int = 44

public const val KERN_DEFCORENAME: Int = 45

public const val KERN_LOGSIGEXIT: Int = 46

public const val KERN_PROC2: Int = 47

public const val KERN_PROC_ARGS: Int = 48

public const val KERN_FSCALE: Int = 49

public const val KERN_CCPU: Int = 50

public const val KERN_CP_TIME: Int = 51

public const val KERN_OLDSYSVIPC_INFO: Int = 52

public const val KERN_MSGBUF: Int = 53

public const val KERN_CONSDEV: Int = 54

public const val KERN_MAXPTYS: Int = 55

public const val KERN_PIPE: Int = 56

public const val KERN_MAXPHYS: Int = 57

public const val KERN_SBMAX: Int = 58

public const val KERN_TKSTAT: Int = 59

public const val KERN_MONOTONIC_CLOCK: Int = 60

public const val KERN_URND: Int = 61

public const val KERN_LABELSECTOR: Int = 62

public const val KERN_LABELOFFSET: Int = 63

public const val KERN_LWP: Int = 64

public const val KERN_FORKFSLEEP: Int = 65

public const val KERN_POSIX_THREADS: Int = 66

public const val KERN_POSIX_SEMAPHORES: Int = 67

public const val KERN_POSIX_BARRIERS: Int = 68

public const val KERN_POSIX_TIMERS: Int = 69

public const val KERN_POSIX_SPIN_LOCKS: Int = 70

public const val KERN_POSIX_READER_WRITER_LOCKS: Int = 71

public const val KERN_DUMP_ON_PANIC: Int = 72

public const val KERN_SOMAXKVA: Int = 73

public const val KERN_ROOT_PARTITION: Int = 74

public const val KERN_DRIVERS: Int = 75

public const val KERN_BUF: Int = 76

public const val KERN_FILE2: Int = 77

public const val KERN_VERIEXEC: Int = 78

public const val KERN_CP_ID: Int = 79

public const val KERN_HARDCLOCK_TICKS: Int = 80

public const val KERN_ARND: Int = 81

public const val KERN_SYSVIPC: Int = 82

public const val KERN_BOOTTIME: Int = 83

public const val KERN_EVCNT: Int = 84

public const val KERN_PROC_ALL: Int = 0

public const val KERN_PROC_PID: Int = 1

public const val KERN_PROC_PGRP: Int = 2

public const val KERN_PROC_SESSION: Int = 3

public const val KERN_PROC_TTY: Int = 4

public const val KERN_PROC_UID: Int = 5

public const val KERN_PROC_RUID: Int = 6

public const val KERN_PROC_GID: Int = 7

public const val KERN_PROC_RGID: Int = 8

public const val KERN_PROC_ARGV: Int = 1

public const val KERN_PROC_NARGV: Int = 2

public const val KERN_PROC_ENV: Int = 3

public const val KERN_PROC_NENV: Int = 4

public const val KERN_PROC_PATHNAME: Int = 5

public const val VM_PROC: Int = 16

public const val VM_PROC_MAP: Int = 1

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

public const val AIO_CANCELED: Int = 1

public const val AIO_NOTCANCELED: Int = 2

public const val AIO_ALLDONE: Int = 3

public const val LIO_NOP: Int = 0

public const val LIO_WRITE: Int = 1

public const val LIO_READ: Int = 2

public const val LIO_WAIT: Int = 1

public const val LIO_NOWAIT: Int = 0

public const val SIGEV_NONE: Int = 0

public const val SIGEV_SIGNAL: Int = 1

public const val SIGEV_THREAD: Int = 2

public const val WSTOPPED: Int = 0x00000002

public const val WCONTINUED: Int = 0x00000010

public const val WEXITED: Int = 0x000000020

public const val WNOWAIT: Int = 0x00010000

public const val WALTSIG: Int = 0x00000004

public const val WALLSIG: Int = 0x00000008

public const val WTRAPPED: Int = 0x00000040

public const val WNOZOMBIE: Int = 0x00020000

public const val P_ALL: Int = 0.toInt()

public const val P_PID: Int = 1.toInt()

public const val P_PGID: Int = 4.toInt()

public const val UTIME_OMIT: Long = 1073741822

public const val UTIME_NOW: Long = 1073741823

public const val B460800: UInt = 460800u

public const val B921600: UInt = 921600u

public const val ONOCR: UInt = 0x20u

public const val ONLRET: UInt = 0x40u

public const val CDTRCTS: UInt = 0x00020000u

public val CHWFLOW: UInt = MDMBUF.or(CRTSCTS).or(CDTRCTS)

public const val SOCK_CLOEXEC: Int = 0x10000000

public const val SOCK_NONBLOCK: Int = 0x20000000

public const val FIOSEEKDATA: ULong = 0xc0086661uL

public const val FIOSEEKHOLE: ULong = 0xc0086662uL

public const val OFIOGETBMAP: ULong = 0xc004667auL

public const val FIOGETBMAP: ULong = 0xc008667auL

public const val FIONWRITE: ULong = 0x40046679uL

public const val FIONSPACE: ULong = 0x40046678uL

public const val FIBMAP: ULong = 0xc008667auL

public const val SIGSTKSZ: ULong = 40960uL

public const val REG_ILLSEQ: Int = 17

public const val PT_DUMPCORE: Int = 12

public const val PT_LWPINFO: Int = 13

public const val PT_SYSCALL: Int = 14

public const val PT_SYSCALLEMU: Int = 15

public const val PT_SET_EVENT_MASK: Int = 16

public const val PT_GET_EVENT_MASK: Int = 17

public const val PT_GET_PROCESS_STATE: Int = 18

public const val PT_SET_SIGINFO: Int = 19

public const val PT_GET_SIGINFO: Int = 20

public const val PT_RESUME: Int = 21

public const val PT_SUSPEND: Int = 22

public const val PT_STOP: Int = 23

public const val PT_LWPSTATUS: Int = 24

public const val PT_LWPNEXT: Int = 25

public const val PT_SET_SIGPASS: Int = 26

public const val PT_GET_SIGPASS: Int = 27

public const val PT_FIRSTMACH: Int = 32

public const val POSIX_SPAWN_RETURNERROR: Int = 0x40

public const val SF_APPEND: ULong = 0x00040000uL

public const val SF_ARCHIVED: ULong = 0x00010000uL

public const val SF_IMMUTABLE: ULong = 0x00020000uL

public const val SF_LOG: ULong = 0x00400000uL

public const val SF_SETTABLE: ULong = 0xffff0000uL

public const val SF_SNAPINVAL: ULong = 0x00800000uL

public const val SF_SNAPSHOT: ULong = 0x00200000uL

public const val UF_APPEND: ULong = 0x00000004uL

public const val UF_IMMUTABLE: ULong = 0x00000002uL

public const val UF_NODUMP: ULong = 0x00000001uL

public const val UF_OPAQUE: ULong = 0x00000008uL

public const val UF_SETTABLE: ULong = 0x0000ffffuL

public const val KVME_PROT_READ: Int = 0x00000001

public const val KVME_PROT_WRITE: Int = 0x00000002

public const val KVME_PROT_EXEC: Int = 0x00000004

public const val KVME_FLAG_COW: Int = 0x00000001

public const val KVME_FLAG_NEEDS_COPY: Int = 0x00000002

public const val KVME_FLAG_NOCOREDUMP: Int = 0x000000004

public const val KVME_FLAG_PAGEABLE: Int = 0x000000008

public const val KVME_FLAG_GROWS_UP: Int = 0x000000010

public const val KVME_FLAG_GROWS_DOWN: Int = 0x000000020

public const val NGROUPS_MAX: Int = 16

public const val KI_NGROUPS: Int = 16

public const val KI_MAXCOMLEN: Int = 24

public const val KI_WMESGLEN: Int = 8

public const val KI_MAXLOGNAME: Int = 24

public const val KI_MAXEMULLEN: Int = 16

public const val KI_LNAMELEN: Int = 20

public const val LSIDL: Int = 1

public const val LSRUN: Int = 2

public const val LSSLEEP: Int = 3

public const val LSSTOP: Int = 4

public const val LSZOMB: Int = 5

public const val LSONPROC: Int = 7

public const val LSSUSPENDED: Int = 8

public const val XATTR_CREATE: Int = 0x01

public const val XATTR_REPLACE: Int = 0x02

public const val EXTATTR_NAMESPACE_EMPTY: Int = 0

public const val GRND_NONBLOCK: UInt = 0x1u

public const val GRND_RANDOM: UInt = 0x2u

public const val GRND_INSECURE: UInt = 0x4u

public const val RB_ASKNAME: Int = 0x000000001

public const val RB_SINGLE: Int = 0x000000002

public const val RB_NOSYNC: Int = 0x000000004

public const val RB_HALT: Int = 0x000000008

public const val RB_INITNAME: Int = 0x000000010

public const val RB_KDB: Int = 0x000000040

public const val RB_RDONLY: Int = 0x000000080

public const val RB_DUMP: Int = 0x000000100

public const val RB_MINIROOT: Int = 0x000000200

public const val RB_STRING: Int = 0x000000400

public val RB_POWERDOWN: Int = RB_HALT or 0x000000800

public const val RB_USERCONF: Int = 0x000001000

public const val RTF_MASK: Int = 0x80

public const val RTF_CONNECTED: Int = 0x100

public const val RTF_ANNOUNCE: Int = 0x20000

public const val RTF_SRC: Int = 0x10000

public const val RTF_LOCAL: Int = 0x40000

public const val RTF_BROADCAST: Int = 0x80000

public const val RTF_UPDATING: Int = 0x100000

public const val RTF_DONTCHANGEIFA: Int = 0x200000

public const val RTM_VERSION: Int = 4

public const val RTM_LOCK: Int = 0x8

public const val RTM_IFANNOUNCE: Int = 0x10

public const val RTM_IEEE80211: Int = 0x11

public const val RTM_SETGATE: Int = 0x12

public const val RTM_LLINFO_UPD: Int = 0x13

public const val RTM_IFINFO: Int = 0x14

public const val RTM_OCHGADDR: Int = 0x15

public const val RTM_NEWADDR: Int = 0x16

public const val RTM_DELADDR: Int = 0x17

public const val RTM_CHGADDR: Int = 0x18

public const val RTA_TAG: Int = 0x100

public const val RTAX_TAG: Int = 8

public const val RTAX_MAX: Int = 9

public const val EFD_SEMAPHORE: Int = O_RDWR

public const val EFD_NONBLOCK: Int = O_NONBLOCK

public const val EFD_CLOEXEC: Int = O_CLOEXEC

public const val TFD_CLOEXEC: Int = O_CLOEXEC

public const val TFD_NONBLOCK: Int = O_NONBLOCK

public const val TFD_TIMER_ABSTIME: Int = O_WRONLY

public const val TFD_TIMER_CANCEL_ON_SET: Int = O_RDWR
