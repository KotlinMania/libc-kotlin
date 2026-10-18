package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.LC_COLLATE
import io.github.kotlinmania.libc.unix.bsd.LC_CTYPE
import io.github.kotlinmania.libc.unix.bsd.LC_MESSAGES
import io.github.kotlinmania.libc.unix.bsd.LC_MONETARY
import io.github.kotlinmania.libc.unix.bsd.LC_NUMERIC
import io.github.kotlinmania.libc.unix.bsd.LC_TIME
import io.github.kotlinmania.libc.unix.bsd.MDMBUF
import io.github.kotlinmania.libc.unix.bsd.O_SYNC
import io.github.kotlinmania.libc.unix.bsd.POLLRDNORM
import io.github.kotlinmania.libc.unix.bsd.RTF_BLACKHOLE
import io.github.kotlinmania.libc.unix.bsd.RTF_PROTO1
import io.github.kotlinmania.libc.unix.bsd.RTF_PROTO2
import io.github.kotlinmania.libc.unix.bsd.RTF_REJECT
import io.github.kotlinmania.libc.unix.bsd.RTF_STATIC
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.CRTSCTS

public const val CRTSCTS: UInt = 0x00010000u

public const val LC_CTYPE: Int = 0

public const val LC_NUMERIC: Int = 1

public const val LC_TIME: Int = 2

public const val LC_COLLATE: Int = 3

public const val LC_MONETARY: Int = 4

public const val LC_MESSAGES: Int = 5

public const val MDMBUF: UInt = 0x00100000u

public const val O_SYNC: Int = 0x0080

public const val POLLRDNORM: Short = 0x0040

public const val RTF_PROTO2: Int = 0x4000

public const val UT_NAMESIZE: ULong = 32uL

public const val UT_LINESIZE: ULong = 8uL

public const val UT_HOSTSIZE: ULong = 256uL

public const val O_CLOEXEC: Int = 0x10000

public const val O_DIRECTORY: Int = 0x20000

public const val O_RSYNC: Int = O_SYNC

public const val MS_SYNC: Int = 0x0002

public const val MS_INVALIDATE: Int = 0x0004

public const val POLLNORM: Short = POLLRDNORM

public const val ENOATTR: Int = 83

public const val EILSEQ: Int = 84

public const val EOVERFLOW: Int = 87

public const val ECANCELED: Int = 88

public const val EIDRM: Int = 89

public const val ENOMSG: Int = 90

public const val ENOTSUP: Int = 91

public const val EBADMSG: Int = 92

public const val ENOTRECOVERABLE: Int = 93

public const val EOWNERDEAD: Int = 94

public const val EPROTO: Int = 95

public const val ELAST: Int = 95

public const val F_DUPFD_CLOEXEC: Int = 10

public const val UTIME_OMIT: Long = -1

public const val UTIME_NOW: Long = -2

public const val AT_FDCWD: Int = -100

public const val AT_EACCESS: Int = 0x01

public const val AT_SYMLINK_NOFOLLOW: Int = 0x02

public const val AT_SYMLINK_FOLLOW: Int = 0x04

public const val AT_REMOVEDIR: Int = 0x08

public const val AT_NULL: Int = 0

public const val AT_IGNORE: Int = 1

public const val AT_PAGESZ: Int = 6

public const val AT_HWCAP: Int = 25

public const val AT_HWCAP2: Int = 26

public const val RLIM_NLIMITS: Int = 9

public const val SO_TIMESTAMP: Int = 0x0800

public const val SO_SNDTIMEO: Int = 0x1005

public const val SO_RCVTIMEO: Int = 0x1006

public const val SO_BINDANY: Int = 0x1000

public const val SO_NETPROC: Int = 0x1020

public const val SO_RTABLE: Int = 0x1021

public const val SO_PEERCRED: Int = 0x1022

public const val SO_SPLICE: Int = 0x1023

public const val SO_DOMAIN: Int = 0x1024

public const val SO_PROTOCOL: Int = 0x1025

public const val IPPROTO_HOPOPTS: Int = 0

public const val IPPROTO_IGMP: Int = 2

public const val IPPROTO_GGP: Int = 3

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

public const val IPPROTO_MOBILE: Int = 55

public const val IPPROTO_NONE: Int = 59

public const val IPPROTO_DSTOPTS: Int = 60

public const val IPPROTO_EON: Int = 80

public const val IPPROTO_ETHERIP: Int = 97

public const val IPPROTO_ENCAP: Int = 98

public const val IPPROTO_PIM: Int = 103

public const val IPPROTO_IPCOMP: Int = 108

public const val IPPROTO_CARP: Int = 112

public const val IPPROTO_MPLS: Int = 137

public const val IPPROTO_PFSYNC: Int = 240

public const val IPPROTO_MAX: Int = 256

public const val IPPROTO_DIVERT: Int = 258

public const val IP_RECVDSTADDR: Int = 7

public const val IP_SENDSRCADDR: Int = IP_RECVDSTADDR

public const val IP_RECVIF: Int = 30

public const val TCP_MD5SIG: Int = 0x04

public const val TCP_NOPUSH: Int = 0x10

public const val MSG_WAITFORONE: Int = 0x1000

public const val AF_ECMA: Int = 8

public const val AF_ROUTE: Int = 17

public const val AF_ENCAP: Int = 28

public const val AF_SIP: Int = 29

public const val AF_KEY: Int = 30

public const val pseudo_AF_HDRCMPLT: Int = 31

public const val AF_BLUETOOTH: Int = 32

public const val AF_MPLS: Int = 33

public const val pseudo_AF_PFLOW: Int = 34

public const val pseudo_AF_PIPEX: Int = 35

public const val NET_RT_DUMP: Int = 1

public const val NET_RT_FLAGS: Int = 2

public const val NET_RT_IFLIST: Int = 3

public const val NET_RT_STATS: Int = 4

public const val NET_RT_TABLE: Int = 5

public const val NET_RT_IFNAMES: Int = 6

public const val NET_RT_MAXID: Int = 7

public const val IPV6_JOIN_GROUP: Int = 12

public const val IPV6_LEAVE_GROUP: Int = 13

public const val PF_ROUTE: Int = AF_ROUTE

public const val PF_ECMA: Int = AF_ECMA

public const val PF_ENCAP: Int = AF_ENCAP

public const val PF_SIP: Int = AF_SIP

public const val PF_KEY: Int = AF_KEY

public const val PF_BPF: Int = pseudo_AF_HDRCMPLT

public const val PF_BLUETOOTH: Int = AF_BLUETOOTH

public const val PF_MPLS: Int = AF_MPLS

public const val PF_PFLOW: Int = pseudo_AF_PFLOW

public const val PF_PIPEX: Int = pseudo_AF_PIPEX

public const val SCM_TIMESTAMP: Int = 0x04

public const val O_DSYNC: Int = 128

public const val MAP_RENAME: Int = 0x0000

public const val MAP_NORESERVE: Int = 0x0000

public const val MAP_HASSEMAPHORE: Int = 0x0000

public const val MAP_TRYFIXED: Int = 0

public const val EIPSEC: Int = 82

public const val ENOMEDIUM: Int = 85

public const val EMEDIUMTYPE: Int = 86

public const val EAI_BADFLAGS: Int = -1

public const val EAI_NONAME: Int = -2

public const val EAI_AGAIN: Int = -3

public const val EAI_FAIL: Int = -4

public const val EAI_NODATA: Int = -5

public const val EAI_FAMILY: Int = -6

public const val EAI_SOCKTYPE: Int = -7

public const val EAI_SERVICE: Int = -8

public const val EAI_MEMORY: Int = -10

public const val EAI_SYSTEM: Int = -11

public const val EAI_OVERFLOW: Int = -14

public const val RUSAGE_THREAD: Int = 1

public const val MAP_COPY: Int = 0x0002

public const val MAP_NOEXTEND: Int = 0x0000

public const val _PC_LINK_MAX: Int = 1

public const val _PC_MAX_CANON: Int = 2

public const val _PC_MAX_INPUT: Int = 3

public const val _PC_NAME_MAX: Int = 4

public const val _PC_PATH_MAX: Int = 5

public const val _PC_PIPE_BUF: Int = 6

public const val _PC_CHOWN_RESTRICTED: Int = 7

public const val _PC_NO_TRUNC: Int = 8

public const val _PC_VDISABLE: Int = 9

public const val _PC_2_SYMLINKS: Int = 10

public const val _PC_ALLOC_SIZE_MIN: Int = 11

public const val _PC_ASYNC_IO: Int = 12

public const val _PC_FILESIZEBITS: Int = 13

public const val _PC_PRIO_IO: Int = 14

public const val _PC_REC_INCR_XFER_SIZE: Int = 15

public const val _PC_REC_MAX_XFER_SIZE: Int = 16

public const val _PC_REC_MIN_XFER_SIZE: Int = 17

public const val _PC_REC_XFER_ALIGN: Int = 18

public const val _PC_SYMLINK_MAX: Int = 19

public const val _PC_SYNC_IO: Int = 20

public const val _PC_TIMESTAMP_RESOLUTION: Int = 21

public const val _CS_PATH: Int = 1

public const val _SC_CLK_TCK: Int = 3

public const val _SC_SEM_NSEMS_MAX: Int = 31

public const val _SC_SEM_VALUE_MAX: Int = 32

public const val _SC_HOST_NAME_MAX: Int = 33

public const val _SC_MONOTONIC_CLOCK: Int = 34

public const val _SC_2_PBS: Int = 35

public const val _SC_2_PBS_ACCOUNTING: Int = 36

public const val _SC_2_PBS_CHECKPOINT: Int = 37

public const val _SC_2_PBS_LOCATE: Int = 38

public const val _SC_2_PBS_MESSAGE: Int = 39

public const val _SC_2_PBS_TRACK: Int = 40

public const val _SC_ADVISORY_INFO: Int = 41

public const val _SC_AIO_LISTIO_MAX: Int = 42

public const val _SC_AIO_MAX: Int = 43

public const val _SC_AIO_PRIO_DELTA_MAX: Int = 44

public const val _SC_ASYNCHRONOUS_IO: Int = 45

public const val _SC_ATEXIT_MAX: Int = 46

public const val _SC_BARRIERS: Int = 47

public const val _SC_CLOCK_SELECTION: Int = 48

public const val _SC_CPUTIME: Int = 49

public const val _SC_DELAYTIMER_MAX: Int = 50

public const val _SC_IOV_MAX: Int = 51

public const val _SC_IPV6: Int = 52

public const val _SC_MAPPED_FILES: Int = 53

public const val _SC_MEMLOCK: Int = 54

public const val _SC_MEMLOCK_RANGE: Int = 55

public const val _SC_MEMORY_PROTECTION: Int = 56

public const val _SC_MESSAGE_PASSING: Int = 57

public const val _SC_MQ_OPEN_MAX: Int = 58

public const val _SC_MQ_PRIO_MAX: Int = 59

public const val _SC_PRIORITIZED_IO: Int = 60

public const val _SC_PRIORITY_SCHEDULING: Int = 61

public const val _SC_RAW_SOCKETS: Int = 62

public const val _SC_READER_WRITER_LOCKS: Int = 63

public const val _SC_REALTIME_SIGNALS: Int = 64

public const val _SC_REGEXP: Int = 65

public const val _SC_RTSIG_MAX: Int = 66

public const val _SC_SEMAPHORES: Int = 67

public const val _SC_SHARED_MEMORY_OBJECTS: Int = 68

public const val _SC_SHELL: Int = 69

public const val _SC_SIGQUEUE_MAX: Int = 70

public const val _SC_SPAWN: Int = 71

public const val _SC_SPIN_LOCKS: Int = 72

public const val _SC_SPORADIC_SERVER: Int = 73

public const val _SC_SS_REPL_MAX: Int = 74

public const val _SC_SYNCHRONIZED_IO: Int = 75

public const val _SC_SYMLOOP_MAX: Int = 76

public const val _SC_THREAD_ATTR_STACKADDR: Int = 77

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 78

public const val _SC_THREAD_CPUTIME: Int = 79

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 80

public const val _SC_THREAD_KEYS_MAX: Int = 81

public const val _SC_THREAD_PRIO_INHERIT: Int = 82

public const val _SC_THREAD_PRIO_PROTECT: Int = 83

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 84

public const val _SC_THREAD_PROCESS_SHARED: Int = 85

public const val _SC_THREAD_ROBUST_PRIO_INHERIT: Int = 86

public const val _SC_THREAD_ROBUST_PRIO_PROTECT: Int = 87

public const val _SC_THREAD_SPORADIC_SERVER: Int = 88

public const val _SC_THREAD_STACK_MIN: Int = 89

public const val _SC_THREAD_THREADS_MAX: Int = 90

public const val _SC_THREADS: Int = 91

public const val _SC_TIMEOUTS: Int = 92

public const val _SC_TIMER_MAX: Int = 93

public const val _SC_TIMERS: Int = 94

public const val _SC_TRACE: Int = 95

public const val _SC_TRACE_EVENT_FILTER: Int = 96

public const val _SC_TRACE_EVENT_NAME_MAX: Int = 97

public const val _SC_TRACE_INHERIT: Int = 98

public const val _SC_TRACE_LOG: Int = 99

public const val _SC_GETGR_R_SIZE_MAX: Int = 100

public const val _SC_GETPW_R_SIZE_MAX: Int = 101

public const val _SC_LOGIN_NAME_MAX: Int = 102

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 103

public const val _SC_TRACE_NAME_MAX: Int = 104

public const val _SC_TRACE_SYS_MAX: Int = 105

public const val _SC_TRACE_USER_EVENT_MAX: Int = 106

public const val _SC_TTY_NAME_MAX: Int = 107

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 108

public const val _SC_V6_ILP32_OFF32: Int = 109

public const val _SC_V6_ILP32_OFFBIG: Int = 110

public const val _SC_V6_LP64_OFF64: Int = 111

public const val _SC_V6_LPBIG_OFFBIG: Int = 112

public const val _SC_V7_ILP32_OFF32: Int = 113

public const val _SC_V7_ILP32_OFFBIG: Int = 114

public const val _SC_V7_LP64_OFF64: Int = 115

public const val _SC_V7_LPBIG_OFFBIG: Int = 116

public const val _SC_XOPEN_CRYPT: Int = 117

public const val _SC_XOPEN_ENH_I18N: Int = 118

public const val _SC_XOPEN_LEGACY: Int = 119

public const val _SC_XOPEN_REALTIME: Int = 120

public const val _SC_XOPEN_REALTIME_THREADS: Int = 121

public const val _SC_XOPEN_STREAMS: Int = 122

public const val _SC_XOPEN_UNIX: Int = 123

public const val _SC_XOPEN_UUCP: Int = 124

public const val _SC_XOPEN_VERSION: Int = 125

public const val _SC_PHYS_PAGES: Int = 500

public const val _SC_AVPHYS_PAGES: Int = 501

public const val _SC_NPROCESSORS_CONF: Int = 502

public const val _SC_NPROCESSORS_ONLN: Int = 503

public const val FD_SETSIZE: ULong = 1024uL

public const val SCHED_FIFO: Int = 1

public const val SCHED_OTHER: Int = 2

public const val SCHED_RR: Int = 3

public const val ST_NOSUID: ULong = 2uL

// PTHREAD_MUTEX_INITIALIZER: FFI boundary initializer — zero-valued struct, not representable in Kotlin
// PTHREAD_COND_INITIALIZER: FFI boundary initializer — zero-valued struct, not representable in Kotlin
// PTHREAD_RWLOCK_INITIALIZER: FFI boundary initializer — zero-valued struct, not representable in Kotlin
public const val PTHREAD_MUTEX_ERRORCHECK: Int = 1

public const val PTHREAD_MUTEX_RECURSIVE: Int = 2

public const val PTHREAD_MUTEX_NORMAL: Int = 3

public const val PTHREAD_MUTEX_STRICT_NP: Int = 4

public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_STRICT_NP

public const val EVFILT_READ: Short = -1

public const val EVFILT_WRITE: Short = -2

public const val EVFILT_AIO: Short = -3

public const val EVFILT_VNODE: Short = -4

public const val EVFILT_PROC: Short = -5

public const val EVFILT_SIGNAL: Short = -6

public const val EVFILT_TIMER: Short = -7

public const val EVFILT_DEVICE: Short = -8

public const val EVFILT_EXCEPT: Short = -9

public const val EVFILT_USER: Short = -10

public val EV_ADD: UShort = (0x1).toUShort()

public val EV_DELETE: UShort = (0x2).toUShort()

public val EV_ENABLE: UShort = (0x4).toUShort()

public val EV_DISABLE: UShort = (0x8).toUShort()

public val EV_ONESHOT: UShort = (0x10).toUShort()

public val EV_CLEAR: UShort = (0x20).toUShort()

public val EV_RECEIPT: UShort = (0x40).toUShort()

public val EV_DISPATCH: UShort = (0x80).toUShort()

public val EV_FLAG1: UShort = (0x2000).toUShort()

public val EV_ERROR: UShort = (0x4000).toUShort()

public val EV_EOF: UShort = (0x8000).toUShort()

public val EV_SYSFLAGS: UShort = (0xf800).toUShort()

public const val NOTE_TRIGGER: UInt = 0x01000000u

public const val NOTE_FFNOP: UInt = 0x00000000u

public const val NOTE_FFAND: UInt = 0x40000000u

public const val NOTE_FFOR: UInt = 0x80000000u

public const val NOTE_FFCOPY: UInt = 0xc0000000u

public const val NOTE_FFCTRLMASK: UInt = 0xc0000000u

public const val NOTE_FFLAGSMASK: UInt = 0x00ffffffu

public const val NOTE_LOWAT: UInt = 0x00000001u

public const val NOTE_EOF: UInt = 0x00000002u

public const val NOTE_OOB: UInt = 0x00000004u

public const val NOTE_DELETE: UInt = 0x00000001u

public const val NOTE_WRITE: UInt = 0x00000002u

public const val NOTE_EXTEND: UInt = 0x00000004u

public const val NOTE_ATTRIB: UInt = 0x00000008u

public const val NOTE_LINK: UInt = 0x00000010u

public const val NOTE_RENAME: UInt = 0x00000020u

public const val NOTE_REVOKE: UInt = 0x00000040u

public const val NOTE_TRUNCATE: UInt = 0x00000080u

public const val NOTE_EXIT: UInt = 0x80000000u

public const val NOTE_FORK: UInt = 0x40000000u

public const val NOTE_EXEC: UInt = 0x20000000u

public const val NOTE_PDATAMASK: UInt = 0x000fffffu

public const val NOTE_PCTRLMASK: UInt = 0xf0000000u

public const val NOTE_TRACK: UInt = 0x00000001u

public const val NOTE_TRACKERR: UInt = 0x00000002u

public const val NOTE_CHILD: UInt = 0x00000004u

public const val NOTE_CHANGE: UInt = 0x00000001u

public const val TMP_MAX: UInt = 0x7fffffffu

public const val AI_PASSIVE: Int = 1

public const val AI_CANONNAME: Int = 2

public const val AI_NUMERICHOST: Int = 4

public const val AI_EXT: Int = 8

public const val AI_NUMERICSERV: Int = 16

public const val AI_FQDN: Int = 32

public const val AI_ADDRCONFIG: Int = 64

public const val NI_NUMERICHOST: Int = 1

public const val NI_NUMERICSERV: Int = 2

public const val NI_NOFQDN: Int = 4

public const val NI_NAMEREQD: Int = 8

public const val NI_DGRAM: Int = 16

public const val NI_MAXHOST: ULong = 256uL

public const val RTLD_LOCAL: Int = 0

public const val CTL_MAXNAME: Int = 12

public const val CTLTYPE_NODE: Int = 1

public const val CTLTYPE_INT: Int = 2

public const val CTLTYPE_STRING: Int = 3

public const val CTLTYPE_QUAD: Int = 4

public const val CTLTYPE_STRUCT: Int = 5

public const val CTL_UNSPEC: Int = 0

public const val CTL_KERN: Int = 1

public const val CTL_VM: Int = 2

public const val CTL_FS: Int = 3

public const val CTL_NET: Int = 4

public const val CTL_DEBUG: Int = 5

public const val CTL_HW: Int = 6

public const val CTL_MACHDEP: Int = 7

public const val CTL_DDB: Int = 9

public const val CTL_VFS: Int = 10

public const val CTL_MAXID: Int = 11

public const val HW_NCPUONLINE: Int = 25

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

public const val KERN_PROF: Int = 16

public const val KERN_POSIX1: Int = 17

public const val KERN_NGROUPS: Int = 18

public const val KERN_JOB_CONTROL: Int = 19

public const val KERN_SAVED_IDS: Int = 20

public const val KERN_BOOTTIME: Int = 21

public const val KERN_DOMAINNAME: Int = 22

public const val KERN_MAXPARTITIONS: Int = 23

public const val KERN_RAWPARTITION: Int = 24

public const val KERN_MAXTHREAD: Int = 25

public const val KERN_NTHREADS: Int = 26

public const val KERN_OSVERSION: Int = 27

public const val KERN_SOMAXCONN: Int = 28

public const val KERN_SOMINCONN: Int = 29

public const val KERN_USERMOUNT: Int = 30

public const val KERN_NOSUIDCOREDUMP: Int = 32

public const val KERN_FSYNC: Int = 33

public const val KERN_SYSVMSG: Int = 34

public const val KERN_SYSVSEM: Int = 35

public const val KERN_SYSVSHM: Int = 36

public const val KERN_ARND: Int = 37

public const val KERN_MSGBUFSIZE: Int = 38

public const val KERN_MALLOCSTATS: Int = 39

public const val KERN_CPTIME: Int = 40

public const val KERN_NCHSTATS: Int = 41

public const val KERN_FORKSTAT: Int = 42

public const val KERN_NSELCOLL: Int = 43

public const val KERN_TTY: Int = 44

public const val KERN_CCPU: Int = 45

public const val KERN_FSCALE: Int = 46

public const val KERN_NPROCS: Int = 47

public const val KERN_MSGBUF: Int = 48

public const val KERN_POOL: Int = 49

public const val KERN_STACKGAPRANDOM: Int = 50

public const val KERN_SYSVIPC_INFO: Int = 51

public const val KERN_SPLASSERT: Int = 54

public const val KERN_PROC_ARGS: Int = 55

public const val KERN_NFILES: Int = 56

public const val KERN_TTYCOUNT: Int = 57

public const val KERN_NUMVNODES: Int = 58

public const val KERN_MBSTAT: Int = 59

public const val KERN_SEMINFO: Int = 61

public const val KERN_SHMINFO: Int = 62

public const val KERN_INTRCNT: Int = 63

public const val KERN_WATCHDOG: Int = 64

public const val KERN_PROC: Int = 66

public const val KERN_MAXCLUSTERS: Int = 67

public const val KERN_EVCOUNT: Int = 68

public const val KERN_TIMECOUNTER: Int = 69

public const val KERN_MAXLOCKSPERUID: Int = 70

public const val KERN_CPTIME2: Int = 71

public const val KERN_CACHEPCT: Int = 72

public const val KERN_FILE: Int = 73

public const val KERN_CONSDEV: Int = 75

public const val KERN_NETLIVELOCKS: Int = 76

public const val KERN_POOL_DEBUG: Int = 77

public const val KERN_PROC_CWD: Int = 78

public const val KERN_PROC_NOBROADCASTKILL: Int = 79

public const val KERN_PROC_VMMAP: Int = 80

public const val KERN_GLOBAL_PTRACE: Int = 81

public const val KERN_CONSBUFSIZE: Int = 82

public const val KERN_CONSBUF: Int = 83

public const val KERN_AUDIO: Int = 84

public const val KERN_CPUSTATS: Int = 85

public const val KERN_PFSTATUS: Int = 86

public const val KERN_TIMEOUT_STATS: Int = 87

public const val KERN_MAXID: Int = 88

public const val KERN_PROC_ALL: Int = 0

public const val KERN_PROC_PID: Int = 1

public const val KERN_PROC_PGRP: Int = 2

public const val KERN_PROC_SESSION: Int = 3

public const val KERN_PROC_TTY: Int = 4

public const val KERN_PROC_UID: Int = 5

public const val KERN_PROC_RUID: Int = 6

public const val KERN_PROC_KTHREAD: Int = 7

public const val KERN_PROC_SHOW_THREADS: Int = 0x40000000

public const val KERN_SYSVIPC_MSG_INFO: Int = 1

public const val KERN_SYSVIPC_SEM_INFO: Int = 2

public const val KERN_SYSVIPC_SHM_INFO: Int = 3

public const val KERN_PROC_ARGV: Int = 1

public const val KERN_PROC_NARGV: Int = 2

public const val KERN_PROC_ENV: Int = 3

public const val KERN_PROC_NENV: Int = 4

public const val KI_NGROUPS: Int = 16

public const val KI_MAXCOMLEN: Int = 24

public const val KI_WMESGLEN: Int = 8

public const val KI_MAXLOGNAME: Int = 32

public const val KI_EMULNAMELEN: Int = 8

public const val KVE_ET_OBJ: Int = 0x00000001

public const val KVE_ET_SUBMAP: Int = 0x00000002

public const val KVE_ET_COPYONWRITE: Int = 0x00000004

public const val KVE_ET_NEEDSCOPY: Int = 0x00000008

public const val KVE_ET_HOLE: Int = 0x00000010

public const val KVE_ET_NOFAULT: Int = 0x00000020

public const val KVE_ET_STACK: Int = 0x00000040

public const val KVE_ET_WC: Int = 0x000000080

public const val KVE_ET_CONCEAL: Int = 0x000000100

public const val KVE_ET_SYSCALL: Int = 0x000000200

public const val KVE_ET_FREEMAPPED: Int = 0x000000800

public const val KVE_PROT_NONE: Int = 0x00000000

public const val KVE_PROT_READ: Int = 0x00000001

public const val KVE_PROT_WRITE: Int = 0x00000002

public const val KVE_PROT_EXEC: Int = 0x00000004

public const val KVE_ADV_NORMAL: Int = 0x00000000

public const val KVE_ADV_RANDOM: Int = 0x00000001

public const val KVE_ADV_SEQUENTIAL: Int = 0x00000002

public const val KVE_INH_SHARE: Int = 0x00000000

public const val KVE_INH_COPY: Int = 0x00000010

public const val KVE_INH_NONE: Int = 0x00000020

public const val KVE_INH_ZERO: Int = 0x00000030

public const val KVE_F_STATIC: Int = 0x1

public const val KVE_F_KMEM: Int = 0x2

public val CHWFLOW: UInt = MDMBUF or CRTSCTS

public const val OLCUC: UInt = 0x20u

public const val ONOCR: UInt = 0x40u

public const val ONLRET: UInt = 0x80u

public const val ISOFSMNT_NORRIP: Int = 0x1

public const val ISOFSMNT_GENS: Int = 0x2

public const val ISOFSMNT_EXTATT: Int = 0x4

public const val ISOFSMNT_NOJOLIET: Int = 0x8

public const val ISOFSMNT_SESS: Int = 0x10

public const val NFS_ARGSVERSION: Int = 4

public const val NFSMNT_RESVPORT: Int = 0

public const val NFSMNT_SOFT: Int = 0x1

public const val NFSMNT_WSIZE: Int = 0x2

public const val NFSMNT_RSIZE: Int = 0x4

public const val NFSMNT_TIMEO: Int = 0x8

public const val NFSMNT_RETRANS: Int = 0x10

public const val NFSMNT_MAXGRPS: Int = 0x20

public const val NFSMNT_INT: Int = 0x40

public const val NFSMNT_NOCONN: Int = 0x80

public const val NFSMNT_NQNFS: Int = 0x100

public const val NFSMNT_NFSV3: Int = 0x200

public const val NFSMNT_KERB: Int = 0x400

public const val NFSMNT_DUMBTIMR: Int = 0x800

public const val NFSMNT_LEASETERM: Int = 0x1000

public const val NFSMNT_READAHEAD: Int = 0x2000

public const val NFSMNT_DEADTHRESH: Int = 0x4000

public const val NFSMNT_NOAC: Int = 0x8000

public const val NFSMNT_RDIRPLUS: Int = 0x10000

public const val NFSMNT_READDIRSIZE: Int = 0x20000

public const val NFSMNT_ACREGMIN: Int = 0x40000

public const val NFSMNT_ACREGMAX: Int = 0x80000

public const val NFSMNT_ACDIRMIN: Int = 0x100000

public const val NFSMNT_ACDIRMAX: Int = 0x200000

public const val NFSMNT_INTERNAL: Int = 0xfffc0000.toInt()

public const val NFSMNT_HASWRITEVERF: Int = 0x40000

public const val NFSMNT_GOTPATHCONF: Int = 0x80000

public const val NFSMNT_GOTFSINFO: Int = 0x100000

public const val NFSMNT_MNTD: Int = 0x200000

public const val NFSMNT_DISMINPROG: Int = 0x400000

public const val NFSMNT_DISMNT: Int = 0x800000

public const val NFSMNT_SNDLOCK: Int = 0x1000000

public const val NFSMNT_WANTSND: Int = 0x2000000

public const val NFSMNT_RCVLOCK: Int = 0x4000000

public const val NFSMNT_WANTRCV: Int = 0x8000000

public const val NFSMNT_WAITAUTH: Int = 0x10000000

public const val NFSMNT_HASAUTH: Int = 0x20000000

public const val NFSMNT_WANTAUTH: Int = 0x40000000

public const val NFSMNT_AUTHERR: Int = 0x80000000.toInt()

public const val MSDOSFSMNT_SHORTNAME: Int = 0x1

public const val MSDOSFSMNT_LONGNAME: Int = 0x2

public const val MSDOSFSMNT_NOWIN95: Int = 0x4

public const val NTFS_MFLAG_CASEINS: Int = 0x1

public const val NTFS_MFLAG_ALLNAMES: Int = 0x2

public const val TMPFS_ARGS_VERSION: Int = 1

public const val MAP_STACK: Int = 0x4000

public const val MAP_CONCEAL: Int = 0x8000

public const val LINK_STATE_UNKNOWN: Int = 0

public const val LINK_STATE_INVALID: Int = 1

public const val LINK_STATE_DOWN: Int = 2

public const val LINK_STATE_KALIVE_DOWN: Int = 3

public const val LINK_STATE_UP: Int = 4

public const val LINK_STATE_HALF_DUPLEX: Int = 5

public const val LINK_STATE_FULL_DUPLEX: Int = 6

public const val IFF_UP: Int = 0x1

public const val IFF_BROADCAST: Int = 0x2

public const val IFF_DEBUG: Int = 0x4

public const val IFF_LOOPBACK: Int = 0x8

public const val IFF_POINTOPOINT: Int = 0x10

public const val IFF_STATICARP: Int = 0x20

public const val IFF_RUNNING: Int = 0x40

public const val IFF_NOARP: Int = 0x80

public const val IFF_PROMISC: Int = 0x100

public const val IFF_ALLMULTI: Int = 0x200

public const val IFF_OACTIVE: Int = 0x400

public const val IFF_SIMPLEX: Int = 0x800

public const val IFF_LINK0: Int = 0x1000

public const val IFF_LINK1: Int = 0x2000

public const val IFF_LINK2: Int = 0x4000

public const val IFF_MULTICAST: Int = 0x8000

public val PTHREAD_STACK_MIN: ULong = 1uL shl _MAX_PAGE_SHIFT.toInt()

public val MINSIGSTKSZ: ULong = 3uL shl _MAX_PAGE_SHIFT.toInt()

public val SIGSTKSZ: ULong = MINSIGSTKSZ + (1uL shl _MAX_PAGE_SHIFT.toInt()) * 4u

public const val PT_SET_EVENT_MASK: Int = 12

public const val PT_GET_EVENT_MASK: Int = 13

public const val PT_GET_PROCESS_STATE: Int = 14

public const val PT_GET_THREAD_FIRST: Int = 15

public const val PT_GET_THREAD_NEXT: Int = 16

public const val PT_FIRSTMACH: Int = 32

public const val PT_PTS_NAMELEN: Int = 32

public const val SOCK_CLOEXEC: Int = 0x8000

public const val SOCK_NONBLOCK: Int = 0x4000

public const val SOCK_DNS: Int = 0x1000

public const val BIOCGRSIG: ULong = 0x40044273uL

public const val BIOCSRSIG: ULong = 0x80044272uL

public const val BIOCSDLT: ULong = 0x8004427auL

public const val PTRACE_FORK: Int = 0x0002

public const val WCONTINUED: Int = 0x08

public const val WEXITED: Int = 0x04

public const val WSTOPPED: Int = 0x02

public const val WNOWAIT: Int = 0x10

public const val WTRAPPED: Int = 0x20

public const val P_ALL: UInt = 0u

public const val P_PGID: UInt = 1u

public const val P_PID: UInt = 2u

public const val FIND: UInt = 0u

public const val ENTER: UInt = 1u

public const val FUTEX_WAIT: Int = 1

public const val FUTEX_WAKE: Int = 2

public const val FUTEX_REQUEUE: Int = 3

public const val FUTEX_PRIVATE_FLAG: Int = 128

public const val EPROC_CTTY: Int = 0x01

public const val EPROC_SLEADER: Int = 0x02

public const val EPROC_UNVEIL: Int = 0x04

public const val EPROC_LKUNVEIL: Int = 0x08

public const val UF_SETTABLE: UInt = 0x0000ffffu

public const val UF_NODUMP: UInt = 0x00000001u

public const val UF_IMMUTABLE: UInt = 0x00000002u

public const val UF_APPEND: UInt = 0x00000004u

public const val UF_OPAQUE: UInt = 0x00000008u

public const val SF_SETTABLE: UInt = 0xffff0000u

public const val SF_ARCHIVED: UInt = 0x00010000u

public const val SF_IMMUTABLE: UInt = 0x00020000u

public const val SF_APPEND: UInt = 0x00040000u

public const val PT_NULL: UInt = 0u

public const val PT_LOAD: UInt = 1u

public const val PT_DYNAMIC: UInt = 2u

public const val PT_INTERP: UInt = 3u

public const val PT_NOTE: UInt = 4u

public const val PT_SHLIB: UInt = 5u

public const val PT_PHDR: UInt = 6u

public const val PT_TLS: UInt = 7u

public const val PT_LOOS: UInt = 0x60000000u

public const val PT_HIOS: UInt = 0x6fffffffu

public const val PT_LOPROC: UInt = 0x70000000u

public const val PT_HIPROC: UInt = 0x7fffffffu

public const val PT_GNU_EH_FRAME: UInt = 0x6474e550u

public const val PT_GNU_RELRO: UInt = 0x6474e552u

public const val PF_X: UInt = 0x1u

public const val PF_W: UInt = 0x2u

public const val PF_R: UInt = 0x4u

public const val PF_MASKOS: UInt = 0x0ff00000u

public const val PF_MASKPROC: UInt = 0xf0000000u

public const val MNT_NOPERM: Int = 0x00000020

public const val MNT_WXALLOWED: Int = 0x00000800

public const val MNT_EXRDONLY: Int = 0x00000080

public const val MNT_DEFEXPORTED: Int = 0x00000200

public const val MNT_EXPORTANON: Int = 0x00000400

public const val MNT_ROOTFS: Int = 0x00004000

public const val MNT_NOATIME: Int = 0x00008000

public const val MNT_DELEXPORT: Int = 0x00020000

public const val MNT_STALLED: Int = 0x00100000

public const val MNT_SWAPPABLE: Int = 0x00200000

public const val MNT_WANTRDWR: Int = 0x02000000

public const val MNT_SOFTDEP: Int = 0x04000000

public const val MNT_DOOMED: Int = 0x08000000

public const val MNT_WAIT: Int = 1

public const val MNT_NOWAIT: Int = 2

public const val MNT_LAZY: Int = 3

public const val CLOCK_PROCESS_CPUTIME_ID: Int = 2

public const val CLOCK_THREAD_CPUTIME_ID: Int = 4

public const val CLOCK_UPTIME: Int = 5

public const val CLOCK_BOOTTIME: Int = 6

public val LC_COLLATE_MASK: Int = 1 shl LC_COLLATE

public val LC_CTYPE_MASK: Int = 1 shl LC_CTYPE

public val LC_MONETARY_MASK: Int = 1 shl LC_MONETARY

public val LC_NUMERIC_MASK: Int = 1 shl LC_NUMERIC

public val LC_TIME_MASK: Int = 1 shl LC_TIME

public val LC_MESSAGES_MASK: Int = 1 shl LC_MESSAGES

public const val _LC_LAST: Int = 7

public val LC_ALL_MASK: Int = (1 shl _LC_LAST) - 2

public val LC_GLOBAL_LOCALE: io.github.kotlinmania.libc.COpaquePointer? = io.github.kotlinmania.libc.COpaquePointer(-1L)

public const val RB_ASKNAME: Int = 0x00001

public const val RB_SINGLE: Int = 0x00002

public const val RB_NOSYNC: Int = 0x00004

public const val RB_HALT: Int = 0x00008

public const val RB_INITNAME: Int = 0x00010

public const val RB_KDB: Int = 0x00040

public const val RB_RDONLY: Int = 0x00080

public const val RB_DUMP: Int = 0x00100

public const val RB_MINIROOT: Int = 0x00200

public const val RB_CONFIG: Int = 0x00400

public const val RB_TIMEBAD: Int = 0x00800

public const val RB_POWERDOWN: Int = 0x01000

public const val RB_SERCONS: Int = 0x02000

public const val RB_USERREQ: Int = 0x04000

public const val RB_RESET: Int = 0x08000

public const val RB_GOODRANDOM: Int = 0x10000

public const val RB_UNHIBERNATE: Int = 0x20000

public const val RTF_CLONING: Int = 0x100

public const val RTF_MULTICAST: Int = 0x200

public const val RTF_LLINFO: Int = 0x400

public const val RTF_PROTO3: Int = 0x2000

public const val RTF_ANNOUNCE: Int = RTF_PROTO2

public const val RTF_CLONED: Int = 0x10000

public const val RTF_CACHED: Int = 0x20000

public const val RTF_MPATH: Int = 0x40000

public const val RTF_MPLS: Int = 0x100000

public const val RTF_LOCAL: Int = 0x200000

public const val RTF_BROADCAST: Int = 0x400000

public const val RTF_CONNECTED: Int = 0x800000

public const val RTF_BFD: Int = 0x1000000

public val RTF_FMASK: Int = RTF_LLINFO or RTF_PROTO1 or RTF_PROTO2 or RTF_PROTO3 or RTF_BLACKHOLE or RTF_REJECT or RTF_STATIC or RTF_MPLS or RTF_BFD

public const val RTM_VERSION: Int = 5

public const val RTM_RESOLVE: Int = 0xb

public const val RTM_NEWADDR: Int = 0xc

public const val RTM_DELADDR: Int = 0xd

public const val RTM_IFINFO: Int = 0xe

public const val RTM_IFANNOUNCE: Int = 0xf

public const val RTM_DESYNC: Int = 0x10

public const val RTM_INVALIDATE: Int = 0x11

public const val RTM_BFD: Int = 0x12

public const val RTM_PROPOSAL: Int = 0x13

public const val RTM_CHGADDRATTR: Int = 0x14

public const val RTM_80211INFO: Int = 0x15

public const val RTM_SOURCE: Int = 0x16

public const val RTA_SRC: Int = 0x100

public const val RTA_SRCMASK: Int = 0x200

public const val RTA_LABEL: Int = 0x400

public const val RTA_BFD: Int = 0x800

public const val RTA_DNS: Int = 0x1000

public const val RTA_STATIC: Int = 0x2000

public const val RTA_SEARCH: Int = 0x4000

public const val RTAX_SRC: Int = 8

public const val RTAX_SRCMASK: Int = 9

public const val RTAX_LABEL: Int = 10

public const val RTAX_BFD: Int = 11

public const val RTAX_DNS: Int = 12

public const val RTAX_STATIC: Int = 13

public const val RTAX_SEARCH: Int = 14

public const val RTAX_MAX: Int = 15
