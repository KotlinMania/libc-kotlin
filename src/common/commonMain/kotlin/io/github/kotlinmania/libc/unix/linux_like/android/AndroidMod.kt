package io.github.kotlinmania.libc.unix.linux_like.android

import cmsghdr
import msghdr

// Android-specific definitions for linux-like values

public fun interface CloneCbCallback {
    public operator fun invoke(arg0: COpaquePointer?): CInt
}

public fun interface SystemPropertyForeachCallbackCallback {
    public operator fun invoke(pi: PropInfo?, cookie: COpaquePointer?)
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: DlPhdrInfo?, size: ULong, data: COpaquePointer?): CInt
}

public typealias ClockT = CLong

public typealias TimeT = CLong

public typealias SusecondsT = CLong

public typealias OffT = CLong

public typealias BlkcntT = CUlong

public typealias BlksizeT = CUlong

public typealias NlinkT = UInt

public typealias PthreadT = CLong

public typealias PthreadMutexattrT = CLong

public typealias PthreadRwlockattrT = CLong

public typealias PthreadBarrierattrT = CInt

public typealias PthreadCondattrT = CLong

public typealias PthreadKeyT = CInt

public typealias FsfilcntT = CUlong

public typealias FsblkcntT = CUlong

public typealias NfdsT = CUint

public typealias RlimT = CUlong

public typealias DevT = CUlong

public typealias InoT = CUlong

public typealias Ino64T = ULong

public typealias CpuBittype = CUlong

public typealias IdtypeT = CInt

public typealias LoffT = CLonglong

public typealias KernelLoffT = CLonglong

public typealias KernelPidT = CInt

public typealias U8 = CUchar

public typealias U16 = CUshort

public typealias S16 = CShort

public typealias U32 = CUint

public typealias S32 = CInt

// linux/elf.h
public typealias Elf32Addr = UInt

public typealias Elf32Half = UShort

public typealias Elf32Off = UInt

public typealias Elf32Word = UInt

public typealias Elf64Addr = ULong

public typealias Elf64Half = UShort

public typealias Elf64Off = ULong

public typealias Elf64Word = UInt

public typealias Elf64Xword = ULong

public typealias EventfdT = ULong

// these structs sit behind a heap allocation on Android
public typealias PosixSpawnFileActionsT = COpaquePointer?

public typealias PosixSpawnattrT = COpaquePointer?

public val MADV_SOFT_OFFLINE: CInt = 101

public val MS_NOUSER: CUlong = 0xffffffff80000000uL

public val MS_RMT_MASK: CUlong = 0x02800051uL

public val O_TRUNC: CInt = 512

public val O_CLOEXEC: CInt = 0x80000

public val O_PATH: CInt = 2097152

public val O_NOATIME: CInt = 262144

public val EBFONT: CInt = 59

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

public val EDOTDOT: CInt = 73

public val EPOLL_CLOEXEC: CInt = 0x80000

// sys/eventfd.h
public val EFD_SEMAPHORE: CInt = 0x1

public val EFD_CLOEXEC: CInt = O_CLOEXEC

public val EFD_NONBLOCK: CInt = O_NONBLOCK

// sys/timerfd.h
public val TFD_CLOEXEC: CInt = O_CLOEXEC

public val TFD_NONBLOCK: CInt = O_NONBLOCK

public val TFD_TIMER_ABSTIME: CInt = 1

public val TFD_TIMER_CANCEL_ON_SET: CInt = 2

public val USER_PROCESS: CShort = 7

public val POSIX_VDISABLE: CcT = 0u

// linux/falloc.h
public val FALLOC_FL_KEEP_SIZE: CInt = 0x01

public val FALLOC_FL_PUNCH_HOLE: CInt = 0x02

public val FALLOC_FL_NO_HIDE_STALE: CInt = 0x04

public val FALLOC_FL_COLLAPSE_RANGE: CInt = 0x08

public val FALLOC_FL_ZERO_RANGE: CInt = 0x10

public val FALLOC_FL_INSERT_RANGE: CInt = 0x20

public val FALLOC_FL_UNSHARE_RANGE: CInt = 0x40

public val BUFSIZ: CUint = 1024u

public val FILENAME_MAX: CUint = 4096u

public val FOPEN_MAX: CUint = 20u

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val L_TMPNAM: CUint = 4096u

public val TMP_MAX: CUint = 308915776u

public val PC_LINK_MAX: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_PATH_MAX: CInt = 5

public val PC_PIPE_BUF: CInt = 6

public val PC_2_SYMLINKS: CInt = 7

public val PC_ALLOC_SIZE_MIN: CInt = 8

public val PC_REC_INCR_XFER_SIZE: CInt = 9

public val PC_REC_MAX_XFER_SIZE: CInt = 10

public val PC_REC_MIN_XFER_SIZE: CInt = 11

public val PC_REC_XFER_ALIGN: CInt = 12

public val PC_SYMLINK_MAX: CInt = 13

public val PC_CHOWN_RESTRICTED: CInt = 14

public val PC_NO_TRUNC: CInt = 15

public val PC_VDISABLE: CInt = 16

public val PC_ASYNC_IO: CInt = 17

public val PC_PRIO_IO: CInt = 18

public val PC_SYNC_IO: CInt = 19

public val FIONBIO: CInt = 0x5421

public val SC_ARG_MAX: CInt = 0x0000

public val SC_BC_BASE_MAX: CInt = 0x0001

public val SC_BC_DIM_MAX: CInt = 0x0002

public val SC_BC_SCALE_MAX: CInt = 0x0003

public val SC_BC_STRING_MAX: CInt = 0x0004

public val SC_CHILD_MAX: CInt = 0x0005

public val SC_CLK_TCK: CInt = 0x0006

public val SC_COLL_WEIGHTS_MAX: CInt = 0x0007

public val SC_EXPR_NEST_MAX: CInt = 0x0008

public val SC_LINE_MAX: CInt = 0x0009

public val SC_NGROUPS_MAX: CInt = 0x000a

public val SC_OPEN_MAX: CInt = 0x000b

public val SC_PASS_MAX: CInt = 0x000c

public val SC_2_C_BIND: CInt = 0x000d

public val SC_2_C_DEV: CInt = 0x000e

public val SC_2_C_VERSION: CInt = 0x000f

public val SC_2_CHAR_TERM: CInt = 0x0010

public val SC_2_FORT_DEV: CInt = 0x0011

public val SC_2_FORT_RUN: CInt = 0x0012

public val SC_2_LOCALEDEF: CInt = 0x0013

public val SC_2_SW_DEV: CInt = 0x0014

public val SC_2_UPE: CInt = 0x0015

public val SC_2_VERSION: CInt = 0x0016

public val SC_JOB_CONTROL: CInt = 0x0017

public val SC_SAVED_IDS: CInt = 0x0018

public val SC_VERSION: CInt = 0x0019

public val SC_RE_DUP_MAX: CInt = 0x001a

public val SC_STREAM_MAX: CInt = 0x001b

public val SC_TZNAME_MAX: CInt = 0x001c

public val SC_XOPEN_CRYPT: CInt = 0x001d

public val SC_XOPEN_ENH_I18N: CInt = 0x001e

public val SC_XOPEN_SHM: CInt = 0x001f

public val SC_XOPEN_VERSION: CInt = 0x0020

public val SC_XOPEN_XCU_VERSION: CInt = 0x0021

public val SC_XOPEN_REALTIME: CInt = 0x0022

public val SC_XOPEN_REALTIME_THREADS: CInt = 0x0023

public val SC_XOPEN_LEGACY: CInt = 0x0024

public val SC_ATEXIT_MAX: CInt = 0x0025

public val SC_IOV_MAX: CInt = 0x0026

public val SC_UIO_MAXIOV: CInt = SC_IOV_MAX

public val SC_PAGESIZE: CInt = 0x0027

public val SC_PAGE_SIZE: CInt = 0x0028

public val SC_XOPEN_UNIX: CInt = 0x0029

public val SC_XBS5_ILP32_OFF32: CInt = 0x002a

public val SC_XBS5_ILP32_OFFBIG: CInt = 0x002b

public val SC_XBS5_LP64_OFF64: CInt = 0x002c

public val SC_XBS5_LPBIG_OFFBIG: CInt = 0x002d

public val SC_AIO_LISTIO_MAX: CInt = 0x002e

public val SC_AIO_MAX: CInt = 0x002f

public val SC_AIO_PRIO_DELTA_MAX: CInt = 0x0030

public val SC_DELAYTIMER_MAX: CInt = 0x0031

public val SC_MQ_OPEN_MAX: CInt = 0x0032

public val SC_MQ_PRIO_MAX: CInt = 0x0033

public val SC_RTSIG_MAX: CInt = 0x0034

public val SC_SEM_NSEMS_MAX: CInt = 0x0035

public val SC_SEM_VALUE_MAX: CInt = 0x0036

public val SC_SIGQUEUE_MAX: CInt = 0x0037

public val SC_TIMER_MAX: CInt = 0x0038

public val SC_ASYNCHRONOUS_IO: CInt = 0x0039

public val SC_FSYNC: CInt = 0x003a

public val SC_MAPPED_FILES: CInt = 0x003b

public val SC_MEMLOCK: CInt = 0x003c

public val SC_MEMLOCK_RANGE: CInt = 0x003d

public val SC_MEMORY_PROTECTION: CInt = 0x003e

public val SC_MESSAGE_PASSING: CInt = 0x003f

public val SC_PRIORITIZED_IO: CInt = 0x0040

public val SC_PRIORITY_SCHEDULING: CInt = 0x0041

public val SC_REALTIME_SIGNALS: CInt = 0x0042

public val SC_SEMAPHORES: CInt = 0x0043

public val SC_SHARED_MEMORY_OBJECTS: CInt = 0x0044

public val SC_SYNCHRONIZED_IO: CInt = 0x0045

public val SC_TIMERS: CInt = 0x0046

public val SC_GETGR_R_SIZE_MAX: CInt = 0x0047

public val SC_GETPW_R_SIZE_MAX: CInt = 0x0048

public val SC_LOGIN_NAME_MAX: CInt = 0x0049

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 0x004a

public val SC_THREAD_KEYS_MAX: CInt = 0x004b

public val SC_THREAD_STACK_MIN: CInt = 0x004c

public val SC_THREAD_THREADS_MAX: CInt = 0x004d

public val SC_TTY_NAME_MAX: CInt = 0x004e

public val SC_THREADS: CInt = 0x004f

public val SC_THREAD_ATTR_STACKADDR: CInt = 0x0050

public val SC_THREAD_ATTR_STACKSIZE: CInt = 0x0051

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 0x0052

public val SC_THREAD_PRIO_INHERIT: CInt = 0x0053

public val SC_THREAD_PRIO_PROTECT: CInt = 0x0054

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 0x0055

public val SC_NPROCESSORS_CONF: CInt = 0x0060

public val SC_NPROCESSORS_ONLN: CInt = 0x0061

public val SC_PHYS_PAGES: CInt = 0x0062

public val SC_AVPHYS_PAGES: CInt = 0x0063

public val SC_MONOTONIC_CLOCK: CInt = 0x0064

public val SC_2_PBS: CInt = 0x0065

public val SC_2_PBS_ACCOUNTING: CInt = 0x0066

public val SC_2_PBS_CHECKPOINT: CInt = 0x0067

public val SC_2_PBS_LOCATE: CInt = 0x0068

public val SC_2_PBS_MESSAGE: CInt = 0x0069

public val SC_2_PBS_TRACK: CInt = 0x006a

public val SC_ADVISORY_INFO: CInt = 0x006b

public val SC_BARRIERS: CInt = 0x006c

public val SC_CLOCK_SELECTION: CInt = 0x006d

public val SC_CPUTIME: CInt = 0x006e

public val SC_HOST_NAME_MAX: CInt = 0x006f

public val SC_IPV6: CInt = 0x0070

public val SC_RAW_SOCKETS: CInt = 0x0071

public val SC_READER_WRITER_LOCKS: CInt = 0x0072

public val SC_REGEXP: CInt = 0x0073

public val SC_SHELL: CInt = 0x0074

public val SC_SPAWN: CInt = 0x0075

public val SC_SPIN_LOCKS: CInt = 0x0076

public val SC_SPORADIC_SERVER: CInt = 0x0077

public val SC_SS_REPL_MAX: CInt = 0x0078

public val SC_SYMLOOP_MAX: CInt = 0x0079

public val SC_THREAD_CPUTIME: CInt = 0x007a

public val SC_THREAD_PROCESS_SHARED: CInt = 0x007b

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 0x007c

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 0x007d

public val SC_THREAD_SPORADIC_SERVER: CInt = 0x007e

public val SC_TIMEOUTS: CInt = 0x007f

public val SC_TRACE: CInt = 0x0080

public val SC_TRACE_EVENT_FILTER: CInt = 0x0081

public val SC_TRACE_EVENT_NAME_MAX: CInt = 0x0082

public val SC_TRACE_INHERIT: CInt = 0x0083

public val SC_TRACE_LOG: CInt = 0x0084

public val SC_TRACE_NAME_MAX: CInt = 0x0085

public val SC_TRACE_SYS_MAX: CInt = 0x0086

public val SC_TRACE_USER_EVENT_MAX: CInt = 0x0087

public val SC_TYPED_MEMORY_OBJECTS: CInt = 0x0088

public val SC_V7_ILP32_OFF32: CInt = 0x0089

public val SC_V7_ILP32_OFFBIG: CInt = 0x008a

public val SC_V7_LP64_OFF64: CInt = 0x008b

public val SC_V7_LPBIG_OFFBIG: CInt = 0x008c

public val SC_XOPEN_STREAMS: CInt = 0x008d

public val SC_XOPEN_UUCP: CInt = 0x008e

public val SC_LEVEL1_ICACHE_SIZE: CInt = 0x008f

public val SC_LEVEL1_ICACHE_ASSOC: CInt = 0x0090

public val SC_LEVEL1_ICACHE_LINESIZE: CInt = 0x0091

public val SC_LEVEL1_DCACHE_SIZE: CInt = 0x0092

public val SC_LEVEL1_DCACHE_ASSOC: CInt = 0x0093

public val SC_LEVEL1_DCACHE_LINESIZE: CInt = 0x0094

public val SC_LEVEL2_CACHE_SIZE: CInt = 0x0095

public val SC_LEVEL2_CACHE_ASSOC: CInt = 0x0096

public val SC_LEVEL2_CACHE_LINESIZE: CInt = 0x0097

public val SC_LEVEL3_CACHE_SIZE: CInt = 0x0098

public val SC_LEVEL3_CACHE_ASSOC: CInt = 0x0099

public val SC_LEVEL3_CACHE_LINESIZE: CInt = 0x009a

public val SC_LEVEL4_CACHE_SIZE: CInt = 0x009b

public val SC_LEVEL4_CACHE_ASSOC: CInt = 0x009c

public val SC_LEVEL4_CACHE_LINESIZE: CInt = 0x009d

public val F_LOCK: CInt = 1

public val F_TEST: CInt = 3

public val F_TLOCK: CInt = 2

public val F_ULOCK: CInt = 0

public val F_SEAL_FUTURE_WRITE: CInt = 0x0010

public val F_SEAL_EXEC: CInt = 0x0020

public val IFF_LOWER_UP: CInt = 0x10000

public val IFF_DORMANT: CInt = 0x20000

public val IFF_ECHO: CInt = 0x40000

public val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_EXPLICIT_SCHED: CInt = 0

public val PTHREAD_INHERIT_SCHED: CInt = 1

// stdio.h
public val RENAME_NOREPLACE: CInt = 1

public val RENAME_EXCHANGE: CInt = 2

public val RENAME_WHITEOUT: CInt = 4

public val FIOCLEX: CInt = 0x5451

public val FIONCLEX: CInt = 0x5450

public val SIGCHLD: CInt = 17

public val SIGBUS: CInt = 7

public val SIGUSR1: CInt = 10

public val SIGUSR2: CInt = 12

public val SIGCONT: CInt = 18

public val SIGSTOP: CInt = 19

public val SIGTSTP: CInt = 20

public val SIGURG: CInt = 23

public val SIGIO: CInt = 29

public val SIGSYS: CInt = 31

public val SIGSTKFLT: CInt = 16

public val SIGUNUSED: CInt = 31

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGPOLL: CInt = 29

public val SIGPWR: CInt = 30

public val SIG_SETMASK: CInt = 2

public val SIG_BLOCK: CInt = 0x000000

public val SIG_UNBLOCK: CInt = 0x01

public val RUSAGE_CHILDREN: CInt = -1

public val LC_PAPER: CInt = 7

public val LC_NAME: CInt = 8

public val LC_ADDRESS: CInt = 9

public val LC_TELEPHONE: CInt = 10

public val LC_MEASUREMENT: CInt = 11

public val LC_IDENTIFICATION: CInt = 12

public val LC_PAPER_MASK: CInt = 1 shl LC_PAPER

public val LC_NAME_MASK: CInt = 1 shl LC_NAME

public val LC_ADDRESS_MASK: CInt = 1 shl LC_ADDRESS

public val LC_TELEPHONE_MASK: CInt = 1 shl LC_TELEPHONE

public val LC_MEASUREMENT_MASK: CInt = 1 shl LC_MEASUREMENT

public val LC_IDENTIFICATION_MASK: CInt = 1 shl LC_IDENTIFICATION

public val LC_ALL_MASK: CInt = LC_CTYPE_MASK or LC_NUMERIC_MASK or LC_TIME_MASK or LC_COLLATE_MASK or LC_MONETARY_MASK or LC_MESSAGES_MASK or LC_PAPER_MASK or LC_NAME_MASK or LC_ADDRESS_MASK or LC_TELEPHONE_MASK or LC_MEASUREMENT_MASK or LC_IDENTIFICATION_MASK

public val MAP_ANON: CInt = 0x0020

public val MAP_ANONYMOUS: CInt = 0x0020

public val MAP_GROWSDOWN: CInt = 0x0100

public val MAP_DENYWRITE: CInt = 0x0800

public val MAP_EXECUTABLE: CInt = 0x01000

public val MAP_LOCKED: CInt = 0x02000

public val MAP_NORESERVE: CInt = 0x04000

public val MAP_POPULATE: CInt = 0x08000

public val MAP_NONBLOCK: CInt = 0x010000

public val MAP_STACK: CInt = 0x020000

public val EDEADLK: CInt = 35

public val ENAMETOOLONG: CInt = 36

public val ENOLCK: CInt = 37

public val ENOSYS: CInt = 38

public val ENOTEMPTY: CInt = 39

public val ELOOP: CInt = 40

public val ENOMSG: CInt = 42

public val EIDRM: CInt = 43

public val ECHRNG: CInt = 44

public val EL2NSYNC: CInt = 45

public val EL3HLT: CInt = 46

public val EL3RST: CInt = 47

public val ELNRNG: CInt = 48

public val EUNATCH: CInt = 49

public val ENOCSI: CInt = 50

public val EL2HLT: CInt = 51

public val EBADE: CInt = 52

public val EBADR: CInt = 53

public val EXFULL: CInt = 54

public val ENOANO: CInt = 55

public val EBADRQC: CInt = 56

public val EBADSLT: CInt = 57

public val EMULTIHOP: CInt = 72

public val EBADMSG: CInt = 74

public val EOVERFLOW: CInt = 75

public val ENOTUNIQ: CInt = 76

public val EBADFD: CInt = 77

public val EREMCHG: CInt = 78

public val ELIBACC: CInt = 79

public val ELIBBAD: CInt = 80

public val ELIBSCN: CInt = 81

public val ELIBMAX: CInt = 82

public val ELIBEXEC: CInt = 83

public val EILSEQ: CInt = 84

public val ERESTART: CInt = 85

public val ESTRPIPE: CInt = 86

public val EUSERS: CInt = 87

public val ENOTSOCK: CInt = 88

public val EDESTADDRREQ: CInt = 89

public val EMSGSIZE: CInt = 90

public val EPROTOTYPE: CInt = 91

public val ENOPROTOOPT: CInt = 92

public val EPROTONOSUPPORT: CInt = 93

public val ESOCKTNOSUPPORT: CInt = 94

public val EOPNOTSUPP: CInt = 95

public val ENOTSUP: CInt = EOPNOTSUPP

public val EPFNOSUPPORT: CInt = 96

public val EAFNOSUPPORT: CInt = 97

public val EADDRINUSE: CInt = 98

public val EADDRNOTAVAIL: CInt = 99

public val ENETDOWN: CInt = 100

public val ENETUNREACH: CInt = 101

public val ENETRESET: CInt = 102

public val ECONNABORTED: CInt = 103

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EISCONN: CInt = 106

public val ENOTCONN: CInt = 107

public val ESHUTDOWN: CInt = 108

public val ETOOMANYREFS: CInt = 109

public val ETIMEDOUT: CInt = 110

public val ECONNREFUSED: CInt = 111

public val EHOSTDOWN: CInt = 112

public val EHOSTUNREACH: CInt = 113

public val EALREADY: CInt = 114

public val EINPROGRESS: CInt = 115

public val ESTALE: CInt = 116

public val EUCLEAN: CInt = 117

public val ENOTNAM: CInt = 118

public val ENAVAIL: CInt = 119

public val EISNAM: CInt = 120

public val EREMOTEIO: CInt = 121

public val EDQUOT: CInt = 122

public val ENOMEDIUM: CInt = 123

public val EMEDIUMTYPE: CInt = 124

public val ECANCELED: CInt = 125

public val ENOKEY: CInt = 126

public val EKEYEXPIRED: CInt = 127

public val EKEYREVOKED: CInt = 128

public val EKEYREJECTED: CInt = 129

public val EOWNERDEAD: CInt = 130

public val ENOTRECOVERABLE: CInt = 131

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_DCCP: CInt = 6

public val SOCK_PACKET: CInt = 10

public val IPPROTO_MAX: CInt = 256

public val SOL_SOCKET: CInt = 1

public val SOL_SCTP: CInt = 132

public val SOL_IPX: CInt = 256

public val SOL_AX25: CInt = 257

public val SOL_ATALK: CInt = 258

public val SOL_NETROM: CInt = 259

public val SOL_ROSE: CInt = 260

// UDP socket options
// include/uapi/linux/udp.h
public val UDP_CORK: CInt = 1

public val UDP_ENCAP: CInt = 100

public val UDP_NO_CHECK6_TX: CInt = 101

public val UDP_NO_CHECK6_RX: CInt = 102

public val UDP_SEGMENT: CInt = 103

public val UDP_GRO: CInt = 104

// DCCP socket options
public val DCCP_SOCKOPT_PACKET_SIZE: CInt = 1

public val DCCP_SOCKOPT_SERVICE: CInt = 2

public val DCCP_SOCKOPT_CHANGE_L: CInt = 3

public val DCCP_SOCKOPT_CHANGE_R: CInt = 4

public val DCCP_SOCKOPT_GET_CUR_MPS: CInt = 5

public val DCCP_SOCKOPT_SERVER_TIMEWAIT: CInt = 6

public val DCCP_SOCKOPT_SEND_CSCOV: CInt = 10

public val DCCP_SOCKOPT_RECV_CSCOV: CInt = 11

public val DCCP_SOCKOPT_AVAILABLE_CCIDS: CInt = 12

public val DCCP_SOCKOPT_CCID: CInt = 13

public val DCCP_SOCKOPT_TX_CCID: CInt = 14

public val DCCP_SOCKOPT_RX_CCID: CInt = 15

public val DCCP_SOCKOPT_QPOLICY_ID: CInt = 16

public val DCCP_SOCKOPT_QPOLICY_TXQLEN: CInt = 17

public val DCCP_SOCKOPT_CCID_RX_INFO: CInt = 128

public val DCCP_SOCKOPT_CCID_TX_INFO: CInt = 192

/**
 * maximum number of services provided on the same listening port
 */
public val DCCP_SERVICE_LIST_MAX_LEN: CInt = 32

public val SO_REUSEADDR: CInt = 2

public val SO_TYPE: CInt = 3

public val SO_ERROR: CInt = 4

public val SO_DONTROUTE: CInt = 5

public val SO_BROADCAST: CInt = 6

public val SO_SNDBUF: CInt = 7

public val SO_RCVBUF: CInt = 8

public val SO_KEEPALIVE: CInt = 9

public val SO_OOBINLINE: CInt = 10

public val SO_PRIORITY: CInt = 12

public val SO_LINGER: CInt = 13

public val SO_BSDCOMPAT: CInt = 14

public val SO_REUSEPORT: CInt = 15

public val SO_PASSCRED: CInt = 16

public val SO_PEERCRED: CInt = 17

public val SO_RCVLOWAT: CInt = 18

public val SO_SNDLOWAT: CInt = 19

public val SO_RCVTIMEO: CInt = 20

public val SO_SNDTIMEO: CInt = 21

public val SO_BINDTODEVICE: CInt = 25

public val SO_ATTACH_FILTER: CInt = 26

public val SO_DETACH_FILTER: CInt = 27

public val SO_GET_FILTER: CInt = SO_ATTACH_FILTER

public val SO_TIMESTAMP: CInt = 29

public val SO_ACCEPTCONN: CInt = 30

public val SO_PEERSEC: CInt = 31

public val SO_SNDBUFFORCE: CInt = 32

public val SO_RCVBUFFORCE: CInt = 33

public val SO_PASSSEC: CInt = 34

public val SO_TIMESTAMPNS: CInt = 35

// pub const SO_TIMESTAMPNS_OLD: cInt = 35;
public val SO_MARK: CInt = 36

public val SO_TIMESTAMPING: CInt = 37

// pub const SO_TIMESTAMPING_OLD: cInt = 37;
public val SO_PROTOCOL: CInt = 38

public val SO_DOMAIN: CInt = 39

public val SO_RXQ_OVFL: CInt = 40

public val SO_PEEK_OFF: CInt = 42

public val SO_BUSY_POLL: CInt = 46

public val SCM_TIMESTAMPING_OPT_STATS: CInt = 54

public val SCM_TIMESTAMPING_PKTINFO: CInt = 58

public val SO_BINDTOIFINDEX: CInt = 62

public val SO_TIMESTAMP_NEW: CInt = 63

public val SO_TIMESTAMPNS_NEW: CInt = 64

public val SO_TIMESTAMPING_NEW: CInt = 65

// Defined in unix/linuxLike/mod.rs
// pub const SCM_TIMESTAMP: cInt = SO_TIMESTAMP;
public val SCM_TIMESTAMPNS: CInt = SO_TIMESTAMPNS

public val SCM_TIMESTAMPING: CInt = SO_TIMESTAMPING

public val IPTOS_ECN_NOTECT: UByte = 0x00u

public val O_ACCMODE: CInt = 3

public val O_APPEND: CInt = 1024

public val O_CREAT: CInt = 64

public val O_EXCL: CInt = 128

public val O_NOCTTY: CInt = 256

public val O_NONBLOCK: CInt = 2048

public val O_SYNC: CInt = 0x101000

public val O_ASYNC: CInt = 0x2000

public val O_NDELAY: CInt = 0x800

public val O_DSYNC: CInt = 4096

public val O_RSYNC: CInt = O_SYNC

public val NI_MAXHOST: SizeT = 1025uL

public val NI_MAXSERV: SizeT = 32uL

public val NI_NOFQDN: CInt = 0x00000001

public val NI_NUMERICHOST: CInt = 0x00000002

public val NI_NAMEREQD: CInt = 0x00000004

public val NI_NUMERICSERV: CInt = 0x00000008

public val NI_DGRAM: CInt = 0x00000010

public val NCCS: Int = 19

public val TCSBRKP: CInt = 0x5425

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 0x1

public val TCSAFLUSH: CInt = 0x2

public val VEOF: Int = 4

public val VEOL: Int = 11

public val VEOL2: Int = 16

public val VMIN: Int = 6

public val IEXTEN: TcflagT = 0x00008000

public val TOSTOP: TcflagT = 0x00000100

public val FLUSHO: TcflagT = 0x00001000

public val EXTPROC: TcflagT = 65536

public val MAP_HUGETLB: CInt = 0x040000

public val PTRACE_TRACEME: CInt = 0

public val PTRACE_PEEKTEXT: CInt = 1

public val PTRACE_PEEKDATA: CInt = 2

public val PTRACE_PEEKUSER: CInt = 3

public val PTRACE_POKETEXT: CInt = 4

public val PTRACE_POKEDATA: CInt = 5

public val PTRACE_POKEUSER: CInt = 6

public val PTRACE_CONT: CInt = 7

public val PTRACE_KILL: CInt = 8

public val PTRACE_SINGLESTEP: CInt = 9

public val PTRACE_GETREGS: CInt = 12

public val PTRACE_SETREGS: CInt = 13

public val PTRACE_ATTACH: CInt = 16

public val PTRACE_DETACH: CInt = 17

public val PTRACE_SYSCALL: CInt = 24

public val PTRACE_SETOPTIONS: CInt = 0x4200

public val PTRACE_GETEVENTMSG: CInt = 0x4201

public val PTRACE_GETSIGINFO: CInt = 0x4202

public val PTRACE_SETSIGINFO: CInt = 0x4203

public val PTRACE_GETREGSET: CInt = 0x4204

public val PTRACE_SETREGSET: CInt = 0x4205

public val PTRACE_SECCOMP_GET_METADATA: CInt = 0x420d

public val PTRACE_EVENT_STOP: CInt = 128

public val F_GETLK: CInt = 5

public val F_GETOWN: CInt = 9

public val F_SETOWN: CInt = 8

public val F_SETLK: CInt = 6

public val F_SETLKW: CInt = 7

public val F_RDLCK: CInt = 0

public val F_WRLCK: CInt = 1

public val F_UNLCK: CInt = 2

public val F_OFD_GETLK: CInt = 36

public val F_OFD_SETLK: CInt = 37

public val F_OFD_SETLKW: CInt = 38

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_RSS: CInt = 5

public val RLIMIT_NPROC: CInt = 6

public val RLIMIT_NOFILE: CInt = 7

public val RLIMIT_MEMLOCK: CInt = 8

public val RLIMIT_AS: CInt = 9

public val RLIMIT_LOCKS: CInt = 10

public val RLIMIT_SIGPENDING: CInt = 11

public val RLIMIT_MSGQUEUE: CInt = 12

public val RLIMIT_NICE: CInt = 13

public val RLIMIT_RTPRIO: CInt = 14

public val RLIM_NLIMITS: CInt = 16

public val RLIM_INFINITY: RlimT = 0uL.inv()

public val TCGETS: CInt = 0x5401

public val TCSETS: CInt = 0x5402

public val TCSETSW: CInt = 0x5403

public val TCSETSF: CInt = 0x5404

public val TCGETS2: CInt = 0x802c542a

public val TCSETS2: CInt = 0x402c542b

public val TCSETSW2: CInt = 0x402c542c

public val TCSETSF2: CInt = 0x402c542d

public val TCGETA: CInt = 0x5405

public val TCSETA: CInt = 0x5406

public val TCSETAW: CInt = 0x5407

public val TCSETAF: CInt = 0x5408

public val TCSBRK: CInt = 0x5409

public val TCXONC: CInt = 0x540A

public val TCFLSH: CInt = 0x540B

public val TIOCGSOFTCAR: CInt = 0x5419

public val TIOCSSOFTCAR: CInt = 0x541A

public val TIOCINQ: CInt = 0x541B

public val TIOCLINUX: CInt = 0x541C

public val TIOCGSERIAL: CInt = 0x541E

public val TIOCEXCL: CInt = 0x540C

public val TIOCNXCL: CInt = 0x540D

public val TIOCSCTTY: CInt = 0x540E

public val TIOCGPGRP: CInt = 0x540F

public val TIOCSPGRP: CInt = 0x5410

public val TIOCOUTQ: CInt = 0x5411

public val TIOCSTI: CInt = 0x5412

public val TIOCGWINSZ: CInt = 0x5413

public val TIOCSWINSZ: CInt = 0x5414

public val TIOCMGET: CInt = 0x5415

public val TIOCMBIS: CInt = 0x5416

public val TIOCMBIC: CInt = 0x5417

public val TIOCMSET: CInt = 0x5418

public val FIONREAD: CInt = 0x541B

public val TIOCCONS: CInt = 0x541D

public val TIOCSBRK: CInt = 0x5427

public val TIOCCBRK: CInt = 0x5428

public val ST_RDONLY: CUlong = 1uL

public val ST_NOSUID: CUlong = 2uL

public val ST_NODEV: CUlong = 4uL

public val ST_NOEXEC: CUlong = 8uL

public val ST_SYNCHRONOUS: CUlong = 16uL

public val ST_MANDLOCK: CUlong = 64uL

public val ST_NOATIME: CUlong = 1024uL

public val ST_NODIRATIME: CUlong = 2048uL

public val ST_RELATIME: CUlong = 4096uL

public val RTLD_NOLOAD: CInt = 0x4

public val RTLD_NODELETE: CInt = 0x1000

public val SEM_FAILED: SemT? = null

public val AI_PASSIVE: CInt = 0x00000001

public val AI_CANONNAME: CInt = 0x00000002

public val AI_NUMERICHOST: CInt = 0x00000004

public val AI_NUMERICSERV: CInt = 0x00000008

public val AI_MASK: CInt = AI_PASSIVE or AI_CANONNAME or AI_NUMERICHOST or AI_NUMERICSERV or AI_ADDRCONFIG

public val AI_ALL: CInt = 0x00000100

public val AI_V4MAPPED_CFG: CInt = 0x00000200

public val AI_ADDRCONFIG: CInt = 0x00000400

public val AI_V4MAPPED: CInt = 0x00000800

public val AI_DEFAULT: CInt = AI_V4MAPPED_CFG or AI_ADDRCONFIG

// linux/kexec.h
public val KEXEC_ON_CRASH: CInt = 0x00000001

public val KEXEC_PRESERVE_CONTEXT: CInt = 0x00000002

public val KEXEC_ARCH_MASK: CInt = 0xffff0000

public val KEXEC_FILE_UNLOAD: CInt = 0x00000001

public val KEXEC_FILE_ON_CRASH: CInt = 0x00000002

public val KEXEC_FILE_NO_INITRAMFS: CInt = 0x00000004

public val LINUX_REBOOT_MAGIC1: CInt = 0xfee1dead

public val LINUX_REBOOT_MAGIC2: CInt = 672274793

public val LINUX_REBOOT_MAGIC2A: CInt = 85072278

public val LINUX_REBOOT_MAGIC2B: CInt = 369367448

public val LINUX_REBOOT_MAGIC2C: CInt = 537993216

public val LINUX_REBOOT_CMD_RESTART: CInt = 0x01234567

public val LINUX_REBOOT_CMD_HALT: CInt = 0xCDEF0123

public val LINUX_REBOOT_CMD_CAD_ON: CInt = 0x89ABCDEF

public val LINUX_REBOOT_CMD_CAD_OFF: CInt = 0x00000000

public val LINUX_REBOOT_CMD_POWER_OFF: CInt = 0x4321FEDC

public val LINUX_REBOOT_CMD_RESTART2: CInt = 0xA1B2C3D4

public val LINUX_REBOOT_CMD_SW_SUSPEND: CInt = 0xD000FCE2

public val LINUX_REBOOT_CMD_KEXEC: CInt = 0x45584543

public val REG_BASIC: CInt = 0

public val REG_EXTENDED: CInt = 1

public val REG_ICASE: CInt = 2

public val REG_NOSUB: CInt = 4

public val REG_NEWLINE: CInt = 8

public val REG_NOSPEC: CInt = 16

public val REG_PEND: CInt = 32

public val REG_DUMP: CInt = 128

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

public val REG_EMPTY: CInt = 14

public val REG_ASSERT: CInt = 15

public val REG_INVARG: CInt = 16

public val REG_ATOI: CInt = 255

public val REG_ITOA: CInt = 256

public val REG_NOTBOL: CInt = 1

public val REG_NOTEOL: CInt = 2

public val REG_STARTEND: CInt = 4

public val REG_TRACE: CInt = 256

public val REG_LARGE: CInt = 512

public val REG_BACKR: CInt = 1024

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MCL_ONFAULT: CInt = 0x0004

public val CBAUD: TcflagT = 4111

public val TAB1: TcflagT = 0x00000800

public val TAB2: TcflagT = 0x00001000

public val TAB3: TcflagT = 0x00001800

public val CR1: TcflagT = 0x00000200

public val CR2: TcflagT = 0x00000400

public val CR3: TcflagT = 0x00000600

public val FF1: TcflagT = 0x00008000

public val BS1: TcflagT = 0x00002000

public val VT1: TcflagT = 0x00004000

public val VWERASE: Int = 14

public val VREPRINT: Int = 12

public val VSUSP: Int = 10

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VDISCARD: Int = 13

public val VTIME: Int = 5

public val IUCLC: TcflagT = 0x00000200

public val IXON: TcflagT = 0x00000400

public val IXOFF: TcflagT = 0x00001000

public val ONLCR: TcflagT = 0x4

public val CSIZE: TcflagT = 0x00000030

public val CS6: TcflagT = 0x00000010

public val CS7: TcflagT = 0x00000020

public val CS8: TcflagT = 0x00000030

public val CSTOPB: TcflagT = 0x00000040

public val CREAD: TcflagT = 0x00000080

public val PARENB: TcflagT = 0x00000100

public val PARODD: TcflagT = 0x00000200

public val HUPCL: TcflagT = 0x00000400

public val CLOCAL: TcflagT = 0x00000800

public val ECHOKE: TcflagT = 0x00000800

public val ECHOE: TcflagT = 0x00000010

public val ECHOK: TcflagT = 0x00000020

public val ECHONL: TcflagT = 0x00000040

public val ECHOPRT: TcflagT = 0x00000400

public val ECHOCTL: TcflagT = 0x00000200

public val ISIG: TcflagT = 0x00000001

public val ICANON: TcflagT = 0x00000002

public val PENDIN: TcflagT = 0x00004000

public val NOFLSH: TcflagT = 0x00000080

public val VSWTC: Int = 7

public val OLCUC: TcflagT = 2

public val NLDLY: TcflagT = 256

public val CRDLY: TcflagT = 1536

public val TABDLY: TcflagT = 6144

public val BSDLY: TcflagT = 8192

public val FFDLY: TcflagT = 32768

public val VTDLY: TcflagT = 16384

public val XCASE: TcflagT = 4

public val XTABS: TcflagT = 6144

public val B0: SpeedT = 0

public val B50: SpeedT = 1

public val B75: SpeedT = 2

public val B110: SpeedT = 3

public val B134: SpeedT = 4

public val B150: SpeedT = 5

public val B200: SpeedT = 6

public val B300: SpeedT = 7

public val B600: SpeedT = 8

public val B1200: SpeedT = 9

public val B1800: SpeedT = 10

public val B2400: SpeedT = 11

public val B4800: SpeedT = 12

public val B9600: SpeedT = 13

public val B19200: SpeedT = 14

public val B38400: SpeedT = 15

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val BOTHER: SpeedT = 4096

public val B57600: SpeedT = 4097

public val B115200: SpeedT = 4098

public val B230400: SpeedT = 4099

public val B460800: SpeedT = 4100

public val B500000: SpeedT = 4101

public val B576000: SpeedT = 4102

public val B921600: SpeedT = 4103

public val B1000000: SpeedT = 4104

public val B1152000: SpeedT = 4105

public val B1500000: SpeedT = 4106

public val B2000000: SpeedT = 4107

public val B2500000: SpeedT = 4108

public val B3000000: SpeedT = 4109

public val B3500000: SpeedT = 4110

public val B4000000: SpeedT = 4111

public val IBSHIFT: TcflagT = 16

public val BLKIOMIN: CInt = 0x1278

public val BLKIOOPT: CInt = 0x1279

public val BLKSSZGET: CInt = 0x1268

public val BLKPBSZGET: CInt = 0x127B

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

public val NETLINK_ROUTE: CInt = 0

public val NETLINK_UNUSED: CInt = 1

public val NETLINK_USERSOCK: CInt = 2

public val NETLINK_FIREWALL: CInt = 3

public val NETLINK_SOCK_DIAG: CInt = 4

public val NETLINK_NFLOG: CInt = 5

public val NETLINK_XFRM: CInt = 6

public val NETLINK_SELINUX: CInt = 7

public val NETLINK_ISCSI: CInt = 8

public val NETLINK_AUDIT: CInt = 9

public val NETLINK_FIB_LOOKUP: CInt = 10

public val NETLINK_CONNECTOR: CInt = 11

public val NETLINK_NETFILTER: CInt = 12

public val NETLINK_IP6_FW: CInt = 13

public val NETLINK_DNRTMSG: CInt = 14

public val NETLINK_KOBJECT_UEVENT: CInt = 15

public val NETLINK_GENERIC: CInt = 16

public val NETLINK_SCSITRANSPORT: CInt = 18

public val NETLINK_ECRYPTFS: CInt = 19

public val NETLINK_RDMA: CInt = 20

public val NETLINK_CRYPTO: CInt = 21

public val NETLINK_INET_DIAG: CInt = NETLINK_SOCK_DIAG

public val MAX_LINKS: CInt = 32

public val NLM_F_REQUEST: CInt = 1

public val NLM_F_MULTI: CInt = 2

public val NLM_F_ACK: CInt = 4

public val NLM_F_ECHO: CInt = 8

public val NLM_F_DUMP_INTR: CInt = 16

public val NLM_F_DUMP_FILTERED: CInt = 32

public val NLM_F_ROOT: CInt = 0x100

public val NLM_F_MATCH: CInt = 0x200

public val NLM_F_ATOMIC: CInt = 0x400

public val NLM_F_DUMP: CInt = NLM_F_ROOT or NLM_F_MATCH

public val NLM_F_REPLACE: CInt = 0x100

public val NLM_F_EXCL: CInt = 0x200

public val NLM_F_CREATE: CInt = 0x400

public val NLM_F_APPEND: CInt = 0x800

public val NLM_F_NONREC: CInt = 0x100

public val NLM_F_BULK: CInt = 0x200

public val NLM_F_CAPPED: CInt = 0x100

public val NLM_F_ACK_TLVS: CInt = 0x200

public val NLMSG_NOOP: CInt = 0x1

public val NLMSG_ERROR: CInt = 0x2

public val NLMSG_DONE: CInt = 0x3

public val NLMSG_OVERRUN: CInt = 0x4

public val NLMSG_MIN_TYPE: CInt = 0x10

// linux/netfilter/nfnetlink.h
public val NFNLGRP_NONE: CInt = 0

public val NFNLGRP_CONNTRACK_NEW: CInt = 1

public val NFNLGRP_CONNTRACK_UPDATE: CInt = 2

public val NFNLGRP_CONNTRACK_DESTROY: CInt = 3

public val NFNLGRP_CONNTRACK_EXP_NEW: CInt = 4

public val NFNLGRP_CONNTRACK_EXP_UPDATE: CInt = 5

public val NFNLGRP_CONNTRACK_EXP_DESTROY: CInt = 6

public val NFNLGRP_NFTABLES: CInt = 7

public val NFNLGRP_ACCT_QUOTA: CInt = 8

public val NFNETLINK_V0: CInt = 0

public val NFNL_SUBSYS_NONE: CInt = 0

public val NFNL_SUBSYS_CTNETLINK: CInt = 1

public val NFNL_SUBSYS_CTNETLINK_EXP: CInt = 2

public val NFNL_SUBSYS_QUEUE: CInt = 3

public val NFNL_SUBSYS_ULOG: CInt = 4

public val NFNL_SUBSYS_OSF: CInt = 5

public val NFNL_SUBSYS_IPSET: CInt = 6

public val NFNL_SUBSYS_ACCT: CInt = 7

public val NFNL_SUBSYS_CTNETLINK_TIMEOUT: CInt = 8

public val NFNL_SUBSYS_CTHELPER: CInt = 9

public val NFNL_SUBSYS_NFTABLES: CInt = 10

public val NFNL_SUBSYS_NFT_COMPAT: CInt = 11

public val NFNL_SUBSYS_COUNT: CInt = 12

public val NFNL_MSG_BATCH_BEGIN: CInt = NLMSG_MIN_TYPE

public val NFNL_MSG_BATCH_END: CInt = NLMSG_MIN_TYPE + 1

// linux/netfilter/nfnetlinkLog.h
public val NFULNL_MSG_PACKET: CInt = 0

public val NFULNL_MSG_CONFIG: CInt = 1

public val NFULA_UNSPEC: CInt = 0

public val NFULA_PACKET_HDR: CInt = 1

public val NFULA_MARK: CInt = 2

public val NFULA_TIMESTAMP: CInt = 3

public val NFULA_IFINDEX_INDEV: CInt = 4

public val NFULA_IFINDEX_OUTDEV: CInt = 5

public val NFULA_IFINDEX_PHYSINDEV: CInt = 6

public val NFULA_IFINDEX_PHYSOUTDEV: CInt = 7

public val NFULA_HWADDR: CInt = 8

public val NFULA_PAYLOAD: CInt = 9

public val NFULA_PREFIX: CInt = 10

public val NFULA_UID: CInt = 11

public val NFULA_SEQ: CInt = 12

public val NFULA_SEQ_GLOBAL: CInt = 13

public val NFULA_GID: CInt = 14

public val NFULA_HWTYPE: CInt = 15

public val NFULA_HWHEADER: CInt = 16

public val NFULA_HWLEN: CInt = 17

public val NFULA_CT: CInt = 18

public val NFULA_CT_INFO: CInt = 19

public val NFULNL_CFG_CMD_NONE: CInt = 0

public val NFULNL_CFG_CMD_BIND: CInt = 1

public val NFULNL_CFG_CMD_UNBIND: CInt = 2

public val NFULNL_CFG_CMD_PF_BIND: CInt = 3

public val NFULNL_CFG_CMD_PF_UNBIND: CInt = 4

public val NFULA_CFG_UNSPEC: CInt = 0

public val NFULA_CFG_CMD: CInt = 1

public val NFULA_CFG_MODE: CInt = 2

public val NFULA_CFG_NLBUFSIZ: CInt = 3

public val NFULA_CFG_TIMEOUT: CInt = 4

public val NFULA_CFG_QTHRESH: CInt = 5

public val NFULA_CFG_FLAGS: CInt = 6

public val NFULNL_COPY_NONE: CInt = 0x00

public val NFULNL_COPY_META: CInt = 0x01

public val NFULNL_COPY_PACKET: CInt = 0x02

public val NFULNL_CFG_F_SEQ: CInt = 0x0001

public val NFULNL_CFG_F_SEQ_GLOBAL: CInt = 0x0002

public val NFULNL_CFG_F_CONNTRACK: CInt = 0x0004

// linux/netfilter/nfnetlinkLog.h
public val NFQNL_MSG_PACKET: CInt = 0

public val NFQNL_MSG_VERDICT: CInt = 1

public val NFQNL_MSG_CONFIG: CInt = 2

public val NFQNL_MSG_VERDICT_BATCH: CInt = 3

public val NFQA_UNSPEC: CInt = 0

public val NFQA_PACKET_HDR: CInt = 1

public val NFQA_VERDICT_HDR: CInt = 2

public val NFQA_MARK: CInt = 3

public val NFQA_TIMESTAMP: CInt = 4

public val NFQA_IFINDEX_INDEV: CInt = 5

public val NFQA_IFINDEX_OUTDEV: CInt = 6

public val NFQA_IFINDEX_PHYSINDEV: CInt = 7

public val NFQA_IFINDEX_PHYSOUTDEV: CInt = 8

public val NFQA_HWADDR: CInt = 9

public val NFQA_PAYLOAD: CInt = 10

public val NFQA_CT: CInt = 11

public val NFQA_CT_INFO: CInt = 12

public val NFQA_CAP_LEN: CInt = 13

public val NFQA_SKB_INFO: CInt = 14

public val NFQA_EXP: CInt = 15

public val NFQA_UID: CInt = 16

public val NFQA_GID: CInt = 17

public val NFQA_SECCTX: CInt = 18

//
// Note: These are not yet available in musl sanitized kernel headers and
// make the tests fail. Enable them once musl has them.
//
// See https://github.com/rust-lang/libc/pull/1628 for more details.
// pub const NFQA_VLAN: cInt = 19;
// pub const NFQA_L2HDR: cInt = 20;
//
// pub const NFQA_VLAN_UNSPEC: cInt = 0;
// pub const NFQA_VLAN_PROTO: cInt = 1;
// pub const NFQA_VLAN_TCI: cInt = 2;
//
public val NFQNL_CFG_CMD_NONE: CInt = 0

public val NFQNL_CFG_CMD_BIND: CInt = 1

public val NFQNL_CFG_CMD_UNBIND: CInt = 2

public val NFQNL_CFG_CMD_PF_BIND: CInt = 3

public val NFQNL_CFG_CMD_PF_UNBIND: CInt = 4

public val NFQNL_COPY_NONE: CInt = 0

public val NFQNL_COPY_META: CInt = 1

public val NFQNL_COPY_PACKET: CInt = 2

public val NFQA_CFG_UNSPEC: CInt = 0

public val NFQA_CFG_CMD: CInt = 1

public val NFQA_CFG_PARAMS: CInt = 2

public val NFQA_CFG_QUEUE_MAXLEN: CInt = 3

public val NFQA_CFG_MASK: CInt = 4

public val NFQA_CFG_FLAGS: CInt = 5

public val NFQA_CFG_F_FAIL_OPEN: CInt = 0x0001

public val NFQA_CFG_F_CONNTRACK: CInt = 0x0002

public val NFQA_CFG_F_GSO: CInt = 0x0004

public val NFQA_CFG_F_UID_GID: CInt = 0x0008

public val NFQA_CFG_F_SECCTX: CInt = 0x0010

public val NFQA_CFG_F_MAX: CInt = 0x0020

public val NFQA_SKB_CSUMNOTREADY: CInt = 0x0001

public val NFQA_SKB_GSO: CInt = 0x0002

public val NFQA_SKB_CSUM_NOTVERIFIED: CInt = 0x0004

public val GENL_NAMSIZ: CInt = 16

public val GENL_MIN_ID: CInt = NLMSG_MIN_TYPE

public val GENL_MAX_ID: CInt = 1023

public val GENL_ADMIN_PERM: CInt = 0x01

public val GENL_CMD_CAP_DO: CInt = 0x02

public val GENL_CMD_CAP_DUMP: CInt = 0x04

public val GENL_CMD_CAP_HASPOL: CInt = 0x08

public val GENL_UNS_ADMIN_PERM: CInt = 0x10

public val GENL_ID_CTRL: CInt = NLMSG_MIN_TYPE

public val GENL_ID_VFS_DQUOT: CInt = NLMSG_MIN_TYPE + 1

public val GENL_ID_PMCRAID: CInt = NLMSG_MIN_TYPE + 2

public val CTRL_CMD_UNSPEC: CInt = 0

public val CTRL_CMD_NEWFAMILY: CInt = 1

public val CTRL_CMD_DELFAMILY: CInt = 2

public val CTRL_CMD_GETFAMILY: CInt = 3

public val CTRL_CMD_NEWOPS: CInt = 4

public val CTRL_CMD_DELOPS: CInt = 5

public val CTRL_CMD_GETOPS: CInt = 6

public val CTRL_CMD_NEWMCAST_GRP: CInt = 7

public val CTRL_CMD_DELMCAST_GRP: CInt = 8

public val CTRL_CMD_GETMCAST_GRP: CInt = 9

public val CTRL_ATTR_UNSPEC: CInt = 0

public val CTRL_ATTR_FAMILY_ID: CInt = 1

public val CTRL_ATTR_FAMILY_NAME: CInt = 2

public val CTRL_ATTR_VERSION: CInt = 3

public val CTRL_ATTR_HDRSIZE: CInt = 4

public val CTRL_ATTR_MAXATTR: CInt = 5

public val CTRL_ATTR_OPS: CInt = 6

public val CTRL_ATTR_MCAST_GROUPS: CInt = 7

public val CTRL_ATTR_OP_UNSPEC: CInt = 0

public val CTRL_ATTR_OP_ID: CInt = 1

public val CTRL_ATTR_OP_FLAGS: CInt = 2

public val CTRL_ATTR_MCAST_GRP_UNSPEC: CInt = 0

public val CTRL_ATTR_MCAST_GRP_NAME: CInt = 1

public val CTRL_ATTR_MCAST_GRP_ID: CInt = 2

public val NETLINK_ADD_MEMBERSHIP: CInt = 1

public val NETLINK_DROP_MEMBERSHIP: CInt = 2

public val NETLINK_PKTINFO: CInt = 3

public val NETLINK_BROADCAST_ERROR: CInt = 4

public val NETLINK_NO_ENOBUFS: CInt = 5

public val NETLINK_RX_RING: CInt = 6

public val NETLINK_TX_RING: CInt = 7

public val NETLINK_LISTEN_ALL_NSID: CInt = 8

public val NETLINK_LIST_MEMBERSHIPS: CInt = 9

public val NETLINK_CAP_ACK: CInt = 10

public val NETLINK_EXT_ACK: CInt = 11

public val NETLINK_GET_STRICT_CHK: CInt = 12

public val GRND_NONBLOCK: CUint = 0x0001u

public val GRND_RANDOM: CUint = 0x0002u

public val GRND_INSECURE: CUint = 0x0004u

// <linux/seccomp.h>
public val SECCOMP_MODE_DISABLED: CUint = 0u

public val SECCOMP_MODE_STRICT: CUint = 1u

public val SECCOMP_MODE_FILTER: CUint = 2u

public val SECCOMP_SET_MODE_STRICT: CUint = 0u

public val SECCOMP_SET_MODE_FILTER: CUint = 1u

public val SECCOMP_GET_ACTION_AVAIL: CUint = 2u

public val SECCOMP_GET_NOTIF_SIZES: CUint = 3u

public val SECCOMP_FILTER_FLAG_TSYNC: CUlong = 1uL shl 0

public val SECCOMP_FILTER_FLAG_LOG: CUlong = 1uL shl 1

public val SECCOMP_FILTER_FLAG_SPEC_ALLOW: CUlong = 1uL shl 2

public val SECCOMP_FILTER_FLAG_NEW_LISTENER: CUlong = 1uL shl 3

public val SECCOMP_FILTER_FLAG_TSYNC_ESRCH: CUlong = 1uL shl 4

public val SECCOMP_FILTER_FLAG_WAIT_KILLABLE_RECV: CUlong = 1uL shl 5

public val SECCOMP_RET_KILL_PROCESS: CUint = 0x80000000u

public val SECCOMP_RET_KILL_THREAD: CUint = 0x00000000u

public val SECCOMP_RET_KILL: CUint = SECCOMP_RET_KILL_THREAD

public val SECCOMP_RET_TRAP: CUint = 0x00030000u

public val SECCOMP_RET_ERRNO: CUint = 0x00050000u

public val SECCOMP_RET_USER_NOTIF: CUint = 0x7fc00000u

public val SECCOMP_RET_TRACE: CUint = 0x7ff00000u

public val SECCOMP_RET_LOG: CUint = 0x7ffc0000u

public val SECCOMP_RET_ALLOW: CUint = 0x7fff0000u

public val SECCOMP_RET_ACTION_FULL: CUint = 0xffff0000u

public val SECCOMP_RET_ACTION: CUint = 0x7fff0000u

public val SECCOMP_RET_DATA: CUint = 0x0000ffffu

public val SECCOMP_USER_NOTIF_FLAG_CONTINUE: CUlong = 1uL

public val SECCOMP_ADDFD_FLAG_SETFD: CUlong = 1uL

public val SECCOMP_ADDFD_FLAG_SEND: CUlong = 2uL

public val NLA_F_NESTED: CInt = 1 shl 15

public val NLA_F_NET_BYTEORDER: CInt = 1 shl 14

public val NLA_TYPE_MASK: CInt = (NLA_F_NESTED or NLA_F_NET_BYTEORDER).inv()

public val NLA_ALIGNTO: CInt = 4

public val SIGEV_THREAD_ID: CInt = 4

public val CIBAUD: TcflagT = 269418496

public val CBAUDEX: TcflagT = 4096

public val TIOCM_LE: CInt = 0x001

public val TIOCM_DTR: CInt = 0x002

public val TIOCM_RTS: CInt = 0x004

public val TIOCM_ST: CInt = 0x008

public val TIOCM_SR: CInt = 0x010

public val TIOCM_CTS: CInt = 0x020

public val TIOCM_CAR: CInt = 0x040

public val TIOCM_RNG: CInt = 0x080

public val TIOCM_DSR: CInt = 0x100

public val TIOCM_CD: CInt = TIOCM_CAR

public val TIOCM_RI: CInt = TIOCM_RNG

public val POLLWRNORM: CShort = 0x100

public val POLLWRBAND: CShort = 0x200

public val SFD_CLOEXEC: CInt = O_CLOEXEC

public val SFD_NONBLOCK: CInt = O_NONBLOCK

public val SOCK_NONBLOCK: CInt = O_NONBLOCK

public val SO_ORIGINAL_DST: CInt = 80

public val IP_RECVFRAGSIZE: CInt = 25

public val IPV6_FLOWINFO: CInt = 11

public val IPV6_MULTICAST_ALL: CInt = 29

public val IPV6_ROUTER_ALERT_ISOLATE: CInt = 30

public val IPV6_FLOWLABEL_MGR: CInt = 32

public val IPV6_FLOWINFO_SEND: CInt = 33

public val IPV6_RECVFRAGSIZE: CInt = 77

public val IPV6_FREEBIND: CInt = 78

public val IPV6_FLOWINFO_FLOWLABEL: CInt = 0x000fffff

public val IPV6_FLOWINFO_PRIORITY: CInt = 0x0ff00000

public val IUTF8: TcflagT = 0x00004000

public val CMSPAR: TcflagT = 1073741824

public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY

public val MFD_CLOEXEC: CUint = 0x0001u

public val MFD_ALLOW_SEALING: CUint = 0x0002u

public val MFD_HUGETLB: CUint = 0x0004u

public val MFD_NOEXEC_SEAL: CUint = 0x0008u

public val MFD_EXEC: CUint = 0x0010u

public val MFD_HUGE_64KB: CUint = 0x40000000u

public val MFD_HUGE_512KB: CUint = 0x4c000000u

public val MFD_HUGE_1MB: CUint = 0x50000000u

public val MFD_HUGE_2MB: CUint = 0x54000000u

public val MFD_HUGE_8MB: CUint = 0x5c000000u

public val MFD_HUGE_16MB: CUint = 0x60000000u

public val MFD_HUGE_32MB: CUint = 0x64000000u

public val MFD_HUGE_256MB: CUint = 0x70000000u

public val MFD_HUGE_512MB: CUint = 0x74000000u

public val MFD_HUGE_1GB: CUint = 0x78000000u

public val MFD_HUGE_2GB: CUint = 0x7c000000u

public val MFD_HUGE_16GB: CUint = 0x88000000u

public val MFD_HUGE_MASK: CUint = 63u

public val MFD_HUGE_SHIFT: CUint = 26u

// these are used in the pType field of Elf32Phdr and Elf64Phdr, which has
// the type Elf32Word and Elf64Word respectively. Luckily, both of those are u32
// so we can use that type here to avoid having to cast.
public val PT_NULL: UInt = 0u

public val PT_LOAD: UInt = 1u

public val PT_DYNAMIC: UInt = 2u

public val PT_INTERP: UInt = 3u

public val PT_NOTE: UInt = 4u

public val PT_SHLIB: UInt = 5u

public val PT_PHDR: UInt = 6u

public val PT_TLS: UInt = 7u

public val PT_LOOS: UInt = 0x60000000u

public val PT_GNU_EH_FRAME: UInt = 0x6474e550u

public val PT_GNU_STACK: UInt = 0x6474e551u

public val PT_GNU_RELRO: UInt = 0x6474e552u

public val PT_HIOS: UInt = 0x6fffffffu

public val PT_LOPROC: UInt = 0x70000000u

public val PT_HIPROC: UInt = 0x7fffffffu

// uapi/linux/mount.h
public val OPEN_TREE_CLONE: CUint = 0x01u

public val OPEN_TREE_CLOEXEC: CUint = O_CLOEXEC.toUInt()

// linux/netfilter.h
public val NF_DROP: CInt = 0

public val NF_ACCEPT: CInt = 1

public val NF_STOLEN: CInt = 2

public val NF_QUEUE: CInt = 3

public val NF_REPEAT: CInt = 4

public val NF_STOP: CInt = 5

public val NF_MAX_VERDICT: CInt = NF_STOP

public val NF_VERDICT_MASK: CInt = 0x000000ff

public val NF_VERDICT_FLAG_QUEUE_BYPASS: CInt = 0x00008000

public val NF_VERDICT_QMASK: CInt = 0xffff0000

public val NF_VERDICT_QBITS: CInt = 16

public val NF_VERDICT_BITS: CInt = 16

public val NF_INET_PRE_ROUTING: CInt = 0

public val NF_INET_LOCAL_IN: CInt = 1

public val NF_INET_FORWARD: CInt = 2

public val NF_INET_LOCAL_OUT: CInt = 3

public val NF_INET_POST_ROUTING: CInt = 4

public val NF_INET_NUMHOOKS: CInt = 5

public val NF_INET_INGRESS: CInt = NF_INET_NUMHOOKS

public val NF_NETDEV_INGRESS: CInt = 0

public val NF_NETDEV_EGRESS: CInt = 1

public val NF_NETDEV_NUMHOOKS: CInt = 2

public val NFPROTO_UNSPEC: CInt = 0

public val NFPROTO_INET: CInt = 1

public val NFPROTO_IPV4: CInt = 2

public val NFPROTO_ARP: CInt = 3

public val NFPROTO_NETDEV: CInt = 5

public val NFPROTO_BRIDGE: CInt = 7

public val NFPROTO_IPV6: CInt = 10

public val NFPROTO_DECNET: CInt = 12

public val NFPROTO_NUMPROTO: CInt = 13

// linux/netfilterArp.h
public val NF_ARP: CInt = 0

public val NF_ARP_IN: CInt = 0

public val NF_ARP_OUT: CInt = 1

public val NF_ARP_FORWARD: CInt = 2

public val NF_ARP_NUMHOOKS: CInt = 3

// linux/netfilterBridge.h
public val NF_BR_PRE_ROUTING: CInt = 0

public val NF_BR_LOCAL_IN: CInt = 1

public val NF_BR_FORWARD: CInt = 2

public val NF_BR_LOCAL_OUT: CInt = 3

public val NF_BR_POST_ROUTING: CInt = 4

public val NF_BR_BROUTING: CInt = 5

public val NF_BR_NUMHOOKS: CInt = 6

public val NF_BR_PRI_FIRST: CInt = INT_MIN

public val NF_BR_PRI_NAT_DST_BRIDGED: CInt = -300

public val NF_BR_PRI_FILTER_BRIDGED: CInt = -200

public val NF_BR_PRI_BRNF: CInt = 0

public val NF_BR_PRI_NAT_DST_OTHER: CInt = 100

public val NF_BR_PRI_FILTER_OTHER: CInt = 200

public val NF_BR_PRI_NAT_SRC: CInt = 300

public val NF_BR_PRI_LAST: CInt = INT_MAX

// linux/netfilterIpv4.h
public val NF_IP_PRE_ROUTING: CInt = 0

public val NF_IP_LOCAL_IN: CInt = 1

public val NF_IP_FORWARD: CInt = 2

public val NF_IP_LOCAL_OUT: CInt = 3

public val NF_IP_POST_ROUTING: CInt = 4

public val NF_IP_NUMHOOKS: CInt = 5

public val NF_IP_PRI_FIRST: CInt = INT_MIN

public val NF_IP_PRI_RAW_BEFORE_DEFRAG: CInt = -450

public val NF_IP_PRI_CONNTRACK_DEFRAG: CInt = -400

public val NF_IP_PRI_RAW: CInt = -300

public val NF_IP_PRI_SELINUX_FIRST: CInt = -225

public val NF_IP_PRI_CONNTRACK: CInt = -200

public val NF_IP_PRI_MANGLE: CInt = -150

public val NF_IP_PRI_NAT_DST: CInt = -100

public val NF_IP_PRI_FILTER: CInt = 0

public val NF_IP_PRI_SECURITY: CInt = 50

public val NF_IP_PRI_NAT_SRC: CInt = 100

public val NF_IP_PRI_SELINUX_LAST: CInt = 225

public val NF_IP_PRI_CONNTRACK_HELPER: CInt = 300

public val NF_IP_PRI_CONNTRACK_CONFIRM: CInt = INT_MAX

public val NF_IP_PRI_LAST: CInt = INT_MAX

// linux/netfilterIpv6.h
public val NF_IP6_PRE_ROUTING: CInt = 0

public val NF_IP6_LOCAL_IN: CInt = 1

public val NF_IP6_FORWARD: CInt = 2

public val NF_IP6_LOCAL_OUT: CInt = 3

public val NF_IP6_POST_ROUTING: CInt = 4

public val NF_IP6_NUMHOOKS: CInt = 5

public val NF_IP6_PRI_FIRST: CInt = INT_MIN

public val NF_IP6_PRI_RAW_BEFORE_DEFRAG: CInt = -450

public val NF_IP6_PRI_CONNTRACK_DEFRAG: CInt = -400

public val NF_IP6_PRI_RAW: CInt = -300

public val NF_IP6_PRI_SELINUX_FIRST: CInt = -225

public val NF_IP6_PRI_CONNTRACK: CInt = -200

public val NF_IP6_PRI_MANGLE: CInt = -150

public val NF_IP6_PRI_NAT_DST: CInt = -100

public val NF_IP6_PRI_FILTER: CInt = 0

public val NF_IP6_PRI_SECURITY: CInt = 50

public val NF_IP6_PRI_NAT_SRC: CInt = 100

public val NF_IP6_PRI_SELINUX_LAST: CInt = 225

public val NF_IP6_PRI_CONNTRACK_HELPER: CInt = 300

public val NF_IP6_PRI_LAST: CInt = INT_MAX

// linux/netfilterIpv6/ip6Tables.h
public val IP6T_SO_ORIGINAL_DST: CInt = 80

// linux/netfilter/nfTables.h
public val NFT_TABLE_MAXNAMELEN: CInt = 256

public val NFT_CHAIN_MAXNAMELEN: CInt = 256

public val NFT_SET_MAXNAMELEN: CInt = 256

public val NFT_OBJ_MAXNAMELEN: CInt = 256

public val NFT_USERDATA_MAXLEN: CInt = 256

public val NFT_REG_VERDICT: CInt = 0

public val NFT_REG_1: CInt = 1

public val NFT_REG_2: CInt = 2

public val NFT_REG_3: CInt = 3

public val NFT_REG_4: CInt = 4

public val NFT_REG_MAX: CInt = 5

public val NFT_REG32_00: CInt = 8

public val NFT_REG32_01: CInt = 9

public val NFT_REG32_02: CInt = 10

public val NFT_REG32_03: CInt = 11

public val NFT_REG32_04: CInt = 12

public val NFT_REG32_05: CInt = 13

public val NFT_REG32_06: CInt = 14

public val NFT_REG32_07: CInt = 15

public val NFT_REG32_08: CInt = 16

public val NFT_REG32_09: CInt = 17

public val NFT_REG32_10: CInt = 18

public val NFT_REG32_11: CInt = 19

public val NFT_REG32_12: CInt = 20

public val NFT_REG32_13: CInt = 21

public val NFT_REG32_14: CInt = 22

public val NFT_REG32_15: CInt = 23

public val NFT_REG_SIZE: CInt = 16

public val NFT_REG32_SIZE: CInt = 4

public val NFT_CONTINUE: CInt = -1

public val NFT_BREAK: CInt = -2

public val NFT_JUMP: CInt = -3

public val NFT_GOTO: CInt = -4

public val NFT_RETURN: CInt = -5

public val NFT_MSG_NEWTABLE: CInt = 0

public val NFT_MSG_GETTABLE: CInt = 1

public val NFT_MSG_DELTABLE: CInt = 2

public val NFT_MSG_NEWCHAIN: CInt = 3

public val NFT_MSG_GETCHAIN: CInt = 4

public val NFT_MSG_DELCHAIN: CInt = 5

public val NFT_MSG_NEWRULE: CInt = 6

public val NFT_MSG_GETRULE: CInt = 7

public val NFT_MSG_DELRULE: CInt = 8

public val NFT_MSG_NEWSET: CInt = 9

public val NFT_MSG_GETSET: CInt = 10

public val NFT_MSG_DELSET: CInt = 11

public val NFT_MSG_NEWSETELEM: CInt = 12

public val NFT_MSG_GETSETELEM: CInt = 13

public val NFT_MSG_DELSETELEM: CInt = 14

public val NFT_MSG_NEWGEN: CInt = 15

public val NFT_MSG_GETGEN: CInt = 16

public val NFT_MSG_TRACE: CInt = 17

public val NFT_MSG_NEWOBJ: CInt = 18

public val NFT_MSG_GETOBJ: CInt = 19

public val NFT_MSG_DELOBJ: CInt = 20

public val NFT_MSG_GETOBJ_RESET: CInt = 21

public val NFT_MSG_MAX: CInt = 25

public val NFT_SET_ANONYMOUS: CInt = 0x1

public val NFT_SET_CONSTANT: CInt = 0x2

public val NFT_SET_INTERVAL: CInt = 0x4

public val NFT_SET_MAP: CInt = 0x8

public val NFT_SET_TIMEOUT: CInt = 0x10

public val NFT_SET_EVAL: CInt = 0x20

public val NFT_SET_POL_PERFORMANCE: CInt = 0

public val NFT_SET_POL_MEMORY: CInt = 1

public val NFT_SET_ELEM_INTERVAL_END: CInt = 0x1

public val NFT_DATA_VALUE: CUint = 0u

public val NFT_DATA_VERDICT: CUint = 0xffffff00u

public val NFT_DATA_RESERVED_MASK: CUint = 0xffffff00u

public val NFT_DATA_VALUE_MAXLEN: CInt = 64

public val NFT_BYTEORDER_NTOH: CInt = 0

public val NFT_BYTEORDER_HTON: CInt = 1

public val NFT_CMP_EQ: CInt = 0

public val NFT_CMP_NEQ: CInt = 1

public val NFT_CMP_LT: CInt = 2

public val NFT_CMP_LTE: CInt = 3

public val NFT_CMP_GT: CInt = 4

public val NFT_CMP_GTE: CInt = 5

public val NFT_RANGE_EQ: CInt = 0

public val NFT_RANGE_NEQ: CInt = 1

public val NFT_LOOKUP_F_INV: CInt = 1 shl 0

public val NFT_DYNSET_OP_ADD: CInt = 0

public val NFT_DYNSET_OP_UPDATE: CInt = 1

public val NFT_DYNSET_F_INV: CInt = 1 shl 0

public val NFT_PAYLOAD_LL_HEADER: CInt = 0

public val NFT_PAYLOAD_NETWORK_HEADER: CInt = 1

public val NFT_PAYLOAD_TRANSPORT_HEADER: CInt = 2

public val NFT_PAYLOAD_CSUM_NONE: CInt = 0

public val NFT_PAYLOAD_CSUM_INET: CInt = 1

public val NFT_META_LEN: CInt = 0

public val NFT_META_PROTOCOL: CInt = 1

public val NFT_META_PRIORITY: CInt = 2

public val NFT_META_MARK: CInt = 3

public val NFT_META_IIF: CInt = 4

public val NFT_META_OIF: CInt = 5

public val NFT_META_IIFNAME: CInt = 6

public val NFT_META_OIFNAME: CInt = 7

public val NFT_META_IIFTYPE: CInt = 8

public val NFT_META_OIFTYPE: CInt = 9

public val NFT_META_SKUID: CInt = 10

public val NFT_META_SKGID: CInt = 11

public val NFT_META_NFTRACE: CInt = 12

public val NFT_META_RTCLASSID: CInt = 13

public val NFT_META_SECMARK: CInt = 14

public val NFT_META_NFPROTO: CInt = 15

public val NFT_META_L4PROTO: CInt = 16

public val NFT_META_BRI_IIFNAME: CInt = 17

public val NFT_META_BRI_OIFNAME: CInt = 18

public val NFT_META_PKTTYPE: CInt = 19

public val NFT_META_CPU: CInt = 20

public val NFT_META_IIFGROUP: CInt = 21

public val NFT_META_OIFGROUP: CInt = 22

public val NFT_META_CGROUP: CInt = 23

public val NFT_META_PRANDOM: CInt = 24

public val NFT_CT_STATE: CInt = 0

public val NFT_CT_DIRECTION: CInt = 1

public val NFT_CT_STATUS: CInt = 2

public val NFT_CT_MARK: CInt = 3

public val NFT_CT_SECMARK: CInt = 4

public val NFT_CT_EXPIRATION: CInt = 5

public val NFT_CT_HELPER: CInt = 6

public val NFT_CT_L3PROTOCOL: CInt = 7

public val NFT_CT_SRC: CInt = 8

public val NFT_CT_DST: CInt = 9

public val NFT_CT_PROTOCOL: CInt = 10

public val NFT_CT_PROTO_SRC: CInt = 11

public val NFT_CT_PROTO_DST: CInt = 12

public val NFT_CT_LABELS: CInt = 13

public val NFT_CT_PKTS: CInt = 14

public val NFT_CT_BYTES: CInt = 15

public val NFT_CT_AVGPKT: CInt = 16

public val NFT_CT_ZONE: CInt = 17

public val NFT_CT_EVENTMASK: CInt = 18

public val NFT_CT_SRC_IP: CInt = 19

public val NFT_CT_DST_IP: CInt = 20

public val NFT_CT_SRC_IP6: CInt = 21

public val NFT_CT_DST_IP6: CInt = 22

public val NFT_CT_ID: CInt = 23

public val NFT_LIMIT_PKTS: CInt = 0

public val NFT_LIMIT_PKT_BYTES: CInt = 1

public val NFT_LIMIT_F_INV: CInt = 1 shl 0

public val NFT_QUEUE_FLAG_BYPASS: CInt = 0x01

public val NFT_QUEUE_FLAG_CPU_FANOUT: CInt = 0x02

public val NFT_QUEUE_FLAG_MASK: CInt = 0x03

public val NFT_QUOTA_F_INV: CInt = 1 shl 0

public val NFT_REJECT_ICMP_UNREACH: CInt = 0

public val NFT_REJECT_TCP_RST: CInt = 1

public val NFT_REJECT_ICMPX_UNREACH: CInt = 2

public val NFT_REJECT_ICMPX_NO_ROUTE: CInt = 0

public val NFT_REJECT_ICMPX_PORT_UNREACH: CInt = 1

public val NFT_REJECT_ICMPX_HOST_UNREACH: CInt = 2

public val NFT_REJECT_ICMPX_ADMIN_PROHIBITED: CInt = 3

public val NFT_NAT_SNAT: CInt = 0

public val NFT_NAT_DNAT: CInt = 1

public val NFT_TRACETYPE_UNSPEC: CInt = 0

public val NFT_TRACETYPE_POLICY: CInt = 1

public val NFT_TRACETYPE_RETURN: CInt = 2

public val NFT_TRACETYPE_RULE: CInt = 3

public val NFT_NG_INCREMENTAL: CInt = 0

public val NFT_NG_RANDOM: CInt = 1

// linux/input.h
public val FF_MAX: U16 = 0x7fu

public val FF_CNT: Int = FF_MAX.toInt() + 1

// linux/input-event-codes.h
public val INPUT_PROP_MAX: U16 = 0x1fu

public val INPUT_PROP_CNT: Int = INPUT_PROP_MAX.toInt() + 1

public val EV_MAX: U16 = 0x1fu

public val EV_CNT: Int = EV_MAX.toInt() + 1

public val SYN_MAX: U16 = 0xfu

public val SYN_CNT: Int = SYN_MAX.toInt() + 1

public val KEY_MAX: U16 = 0x2ffu

public val KEY_CNT: Int = KEY_MAX.toInt() + 1

public val REL_MAX: U16 = 0x0fu

public val REL_CNT: Int = REL_MAX.toInt() + 1

public val ABS_MAX: U16 = 0x3fu

public val ABS_CNT: Int = ABS_MAX.toInt() + 1

public val SW_MAX: U16 = 0x0fu

public val SW_CNT: Int = SW_MAX.toInt() + 1

public val MSC_MAX: U16 = 0x07u

public val MSC_CNT: Int = MSC_MAX.toInt() + 1

public val LED_MAX: U16 = 0x0fu

public val LED_CNT: Int = LED_MAX.toInt() + 1

public val REP_MAX: U16 = 0x01u

public val REP_CNT: Int = REP_MAX.toInt() + 1

public val SND_MAX: U16 = 0x07u

public val SND_CNT: Int = SND_MAX.toInt() + 1

// linux/uinput.h
public val UINPUT_VERSION: CUint = 5u

public val UINPUT_MAX_NAME_SIZE: Int = 80

// start android/platform/bionic/libc/kernel/uapi/linux/ifEther.h
// from https://android.googlesource.com/platform/bionic/+/HEAD/libc/kernel/uapi/linux/ifEther.h
public val ETH_ALEN: CInt = 6

public val ETH_HLEN: CInt = 14

public val ETH_ZLEN: CInt = 60

public val ETH_DATA_LEN: CInt = 1500

public val ETH_FRAME_LEN: CInt = 1514

public val ETH_FCS_LEN: CInt = 4

public val ETH_MIN_MTU: CInt = 68

public val ETH_MAX_MTU: CInt = 0xFFFF

public val ETH_P_LOOP: CInt = 0x0060

public val ETH_P_PUP: CInt = 0x0200

public val ETH_P_PUPAT: CInt = 0x0201

public val ETH_P_TSN: CInt = 0x22F0

public val ETH_P_IP: CInt = 0x0800

public val ETH_P_X25: CInt = 0x0805

public val ETH_P_ARP: CInt = 0x0806

public val ETH_P_BPQ: CInt = 0x08FF

public val ETH_P_IEEEPUP: CInt = 0x0a00

public val ETH_P_IEEEPUPAT: CInt = 0x0a01

public val ETH_P_BATMAN: CInt = 0x4305

public val ETH_P_DEC: CInt = 0x6000

public val ETH_P_DNA_DL: CInt = 0x6001

public val ETH_P_DNA_RC: CInt = 0x6002

public val ETH_P_DNA_RT: CInt = 0x6003

public val ETH_P_LAT: CInt = 0x6004

public val ETH_P_DIAG: CInt = 0x6005

public val ETH_P_CUST: CInt = 0x6006

public val ETH_P_SCA: CInt = 0x6007

public val ETH_P_TEB: CInt = 0x6558

public val ETH_P_RARP: CInt = 0x8035

public val ETH_P_ATALK: CInt = 0x809B

public val ETH_P_AARP: CInt = 0x80F3

public val ETH_P_8021Q: CInt = 0x8100

// see rust-lang/libc#924 pub const ETH_P_ERSPAN: cInt = 0x88BE;
public val ETH_P_IPX: CInt = 0x8137

public val ETH_P_IPV6: CInt = 0x86DD

public val ETH_P_PAUSE: CInt = 0x8808

public val ETH_P_SLOW: CInt = 0x8809

public val ETH_P_WCCP: CInt = 0x883E

public val ETH_P_MPLS_UC: CInt = 0x8847

public val ETH_P_MPLS_MC: CInt = 0x8848

public val ETH_P_ATMMPOA: CInt = 0x884c

public val ETH_P_PPP_DISC: CInt = 0x8863

public val ETH_P_PPP_SES: CInt = 0x8864

public val ETH_P_LINK_CTL: CInt = 0x886c

public val ETH_P_ATMFATE: CInt = 0x8884

public val ETH_P_PAE: CInt = 0x888E

public val ETH_P_AOE: CInt = 0x88A2

public val ETH_P_8021AD: CInt = 0x88A8

public val ETH_P_802_EX1: CInt = 0x88B5

public val ETH_P_TIPC: CInt = 0x88CA

public val ETH_P_MACSEC: CInt = 0x88E5

public val ETH_P_8021AH: CInt = 0x88E7

public val ETH_P_MVRP: CInt = 0x88F5

public val ETH_P_1588: CInt = 0x88F7

public val ETH_P_NCSI: CInt = 0x88F8

public val ETH_P_PRP: CInt = 0x88FB

public val ETH_P_FCOE: CInt = 0x8906

// see rust-lang/libc#924 pub const ETH_P_IBOE: cInt = 0x8915;
public val ETH_P_TDLS: CInt = 0x890D

public val ETH_P_FIP: CInt = 0x8914

public val ETH_P_80221: CInt = 0x8917

public val ETH_P_HSR: CInt = 0x892F

// see rust-lang/libc#924 pub const ETH_P_NSH: cInt = 0x894F;
public val ETH_P_LOOPBACK: CInt = 0x9000

public val ETH_P_QINQ1: CInt = 0x9100

public val ETH_P_QINQ2: CInt = 0x9200

public val ETH_P_QINQ3: CInt = 0x9300

public val ETH_P_EDSA: CInt = 0xDADA

// see rust-lang/libc#924 pub const ETH_P_IFE: cInt = 0xED3E;
public val ETH_P_AF_IUCV: CInt = 0xFBFB

public val ETH_P_802_3_MIN: CInt = 0x0600

public val ETH_P_802_3: CInt = 0x0001

public val ETH_P_AX25: CInt = 0x0002

public val ETH_P_ALL: CInt = 0x0003

public val ETH_P_802_2: CInt = 0x0004

public val ETH_P_SNAP: CInt = 0x0005

public val ETH_P_DDCMP: CInt = 0x0006

public val ETH_P_WAN_PPP: CInt = 0x0007

public val ETH_P_PPP_MP: CInt = 0x0008

public val ETH_P_LOCALTALK: CInt = 0x0009

public val ETH_P_CAN: CInt = 0x000C

public val ETH_P_CANFD: CInt = 0x000D

public val ETH_P_PPPTALK: CInt = 0x0010

public val ETH_P_TR_802_2: CInt = 0x0011

public val ETH_P_MOBITEX: CInt = 0x0015

public val ETH_P_CONTROL: CInt = 0x0016

public val ETH_P_IRDA: CInt = 0x0017

public val ETH_P_ECONET: CInt = 0x0018

public val ETH_P_HDLC: CInt = 0x0019

public val ETH_P_ARCNET: CInt = 0x001A

public val ETH_P_DSA: CInt = 0x001B

public val ETH_P_TRAILER: CInt = 0x001C

public val ETH_P_PHONET: CInt = 0x00F5

public val ETH_P_IEEE802154: CInt = 0x00F6

public val ETH_P_CAIF: CInt = 0x00F7

public val ETH_P_XDSA: CInt = 0x00F8

// see rust-lang/libc#924 pub const ETH_P_MAP: cInt = 0x00F9;
// end android/platform/bionic/libc/kernel/uapi/linux/ifEther.h
// start android/platform/bionic/libc/kernel/uapi/linux/neighbour.h
public val NDA_UNSPEC: CUshort = 0u

public val NDA_DST: CUshort = 1u

public val NDA_LLADDR: CUshort = 2u

public val NDA_CACHEINFO: CUshort = 3u

public val NDA_PROBES: CUshort = 4u

public val NDA_VLAN: CUshort = 5u

public val NDA_PORT: CUshort = 6u

public val NDA_VNI: CUshort = 7u

public val NDA_IFINDEX: CUshort = 8u

public val NDA_MASTER: CUshort = 9u

public val NDA_LINK_NETNSID: CUshort = 10u

public val NDA_SRC_VNI: CUshort = 11u

public val NDA_PROTOCOL: CUshort = 12u

public val NDA_NH_ID: CUshort = 13u

public val NDA_FDB_EXT_ATTRS: CUshort = 14u

public val NDA_FLAGS_EXT: CUshort = 15u

public val NDA_NDM_STATE_MASK: CUshort = 16u

public val NDA_NDM_FLAGS_MASK: CUshort = 17u

public val NTF_USE: UByte = 0x01u

public val NTF_SELF: UByte = 0x02u

public val NTF_MASTER: UByte = 0x04u

public val NTF_PROXY: UByte = 0x08u

public val NTF_EXT_LEARNED: UByte = 0x10u

public val NTF_OFFLOADED: UByte = 0x20u

public val NTF_STICKY: UByte = 0x40u

public val NTF_ROUTER: UByte = 0x80u

public val NTF_EXT_MANAGED: UByte = 0x01u

public val NTF_EXT_LOCKED: UByte = 0x02u

public val NUD_NONE: UShort = 0x00u

public val NUD_INCOMPLETE: UShort = 0x01u

public val NUD_REACHABLE: UShort = 0x02u

public val NUD_STALE: UShort = 0x04u

public val NUD_DELAY: UShort = 0x08u

public val NUD_PROBE: UShort = 0x10u

public val NUD_FAILED: UShort = 0x20u

public val NUD_NOARP: UShort = 0x40u

public val NUD_PERMANENT: UShort = 0x80u

public val NDTPA_UNSPEC: CUshort = 0u

public val NDTPA_IFINDEX: CUshort = 1u

public val NDTPA_REFCNT: CUshort = 2u

public val NDTPA_REACHABLE_TIME: CUshort = 3u

public val NDTPA_BASE_REACHABLE_TIME: CUshort = 4u

public val NDTPA_RETRANS_TIME: CUshort = 5u

public val NDTPA_GC_STALETIME: CUshort = 6u

public val NDTPA_DELAY_PROBE_TIME: CUshort = 7u

public val NDTPA_QUEUE_LEN: CUshort = 8u

public val NDTPA_APP_PROBES: CUshort = 9u

public val NDTPA_UCAST_PROBES: CUshort = 10u

public val NDTPA_MCAST_PROBES: CUshort = 11u

public val NDTPA_ANYCAST_DELAY: CUshort = 12u

public val NDTPA_PROXY_DELAY: CUshort = 13u

public val NDTPA_PROXY_QLEN: CUshort = 14u

public val NDTPA_LOCKTIME: CUshort = 15u

public val NDTPA_QUEUE_LENBYTES: CUshort = 16u

public val NDTPA_MCAST_REPROBES: CUshort = 17u

public val NDTPA_PAD: CUshort = 18u

public val NDTPA_INTERVAL_PROBE_TIME_MS: CUshort = 19u

public val NDTA_UNSPEC: CUshort = 0u

public val NDTA_NAME: CUshort = 1u

public val NDTA_THRESH1: CUshort = 2u

public val NDTA_THRESH2: CUshort = 3u

public val NDTA_THRESH3: CUshort = 4u

public val NDTA_CONFIG: CUshort = 5u

public val NDTA_PARMS: CUshort = 6u

public val NDTA_STATS: CUshort = 7u

public val NDTA_GC_INTERVAL: CUshort = 8u

public val NDTA_PAD: CUshort = 9u

public val FDB_NOTIFY_BIT: UShort = 0x01u

public val FDB_NOTIFY_INACTIVE_BIT: UShort = 0x02u

public val NFEA_UNSPEC: CUshort = 0u

public val NFEA_ACTIVITY_NOTIFY: CUshort = 1u

public val NFEA_DONT_REFRESH: CUshort = 2u

// end android/platform/bionic/libc/kernel/uapi/linux/neighbour.h
public val SIOCADDRT: CUlong = 0x0000890BuL

public val SIOCDELRT: CUlong = 0x0000890CuL

public val SIOCRTMSG: CUlong = 0x0000890DuL

public val SIOCGIFNAME: CUlong = 0x00008910uL

public val SIOCSIFLINK: CUlong = 0x00008911uL

public val SIOCGIFCONF: CUlong = 0x00008912uL

public val SIOCGIFFLAGS: CUlong = 0x00008913uL

public val SIOCSIFFLAGS: CUlong = 0x00008914uL

public val SIOCGIFADDR: CUlong = 0x00008915uL

public val SIOCSIFADDR: CUlong = 0x00008916uL

public val SIOCGIFDSTADDR: CUlong = 0x00008917uL

public val SIOCSIFDSTADDR: CUlong = 0x00008918uL

public val SIOCGIFBRDADDR: CUlong = 0x00008919uL

public val SIOCSIFBRDADDR: CUlong = 0x0000891AuL

public val SIOCGIFNETMASK: CUlong = 0x0000891BuL

public val SIOCSIFNETMASK: CUlong = 0x0000891CuL

public val SIOCGIFMETRIC: CUlong = 0x0000891DuL

public val SIOCSIFMETRIC: CUlong = 0x0000891EuL

public val SIOCGIFMEM: CUlong = 0x0000891FuL

public val SIOCSIFMEM: CUlong = 0x00008920uL

public val SIOCGIFMTU: CUlong = 0x00008921uL

public val SIOCSIFMTU: CUlong = 0x00008922uL

public val SIOCSIFNAME: CUlong = 0x00008923uL

public val SIOCSIFHWADDR: CUlong = 0x00008924uL

public val SIOCGIFENCAP: CUlong = 0x00008925uL

public val SIOCSIFENCAP: CUlong = 0x00008926uL

public val SIOCGIFHWADDR: CUlong = 0x00008927uL

public val SIOCGIFSLAVE: CUlong = 0x00008929uL

public val SIOCSIFSLAVE: CUlong = 0x00008930uL

public val SIOCADDMULTI: CUlong = 0x00008931uL

public val SIOCDELMULTI: CUlong = 0x00008932uL

public val SIOCGIFINDEX: CUlong = 0x00008933uL

public val SIOGIFINDEX: CUlong = SIOCGIFINDEX

public val SIOCSIFPFLAGS: CUlong = 0x00008934uL

public val SIOCGIFPFLAGS: CUlong = 0x00008935uL

public val SIOCDIFADDR: CUlong = 0x00008936uL

public val SIOCSIFHWBROADCAST: CUlong = 0x00008937uL

public val SIOCGIFCOUNT: CUlong = 0x00008938uL

public val SIOCGIFBR: CUlong = 0x00008940uL

public val SIOCSIFBR: CUlong = 0x00008941uL

public val SIOCGIFTXQLEN: CUlong = 0x00008942uL

public val SIOCSIFTXQLEN: CUlong = 0x00008943uL

public val SIOCETHTOOL: CUlong = 0x00008946uL

public val SIOCGMIIPHY: CUlong = 0x00008947uL

public val SIOCGMIIREG: CUlong = 0x00008948uL

public val SIOCSMIIREG: CUlong = 0x00008949uL

public val SIOCWANDEV: CUlong = 0x0000894AuL

public val SIOCOUTQNSD: CUlong = 0x0000894BuL

public val SIOCGSKNS: CUlong = 0x0000894CuL

public val SIOCDARP: CUlong = 0x00008953uL

public val SIOCGARP: CUlong = 0x00008954uL

public val SIOCSARP: CUlong = 0x00008955uL

public val SIOCDRARP: CUlong = 0x00008960uL

public val SIOCGRARP: CUlong = 0x00008961uL

public val SIOCSRARP: CUlong = 0x00008962uL

public val SIOCGIFMAP: CUlong = 0x00008970uL

public val SIOCSIFMAP: CUlong = 0x00008971uL

public val SIOCADDDLCI: CUlong = 0x00008980uL

public val SIOCDELDLCI: CUlong = 0x00008981uL

public val SIOCGIFVLAN: CUlong = 0x00008982uL

public val SIOCSIFVLAN: CUlong = 0x00008983uL

public val SIOCBONDENSLAVE: CUlong = 0x00008990uL

public val SIOCBONDRELEASE: CUlong = 0x00008991uL

public val SIOCBONDSETHWADDR: CUlong = 0x00008992uL

public val SIOCBONDSLAVEINFOQUERY: CUlong = 0x00008993uL

public val SIOCBONDINFOQUERY: CUlong = 0x00008994uL

public val SIOCBONDCHANGEACTIVE: CUlong = 0x00008995uL

public val SIOCBRADDBR: CUlong = 0x000089a0uL

public val SIOCBRDELBR: CUlong = 0x000089a1uL

public val SIOCBRADDIF: CUlong = 0x000089a2uL

public val SIOCBRDELIF: CUlong = 0x000089a3uL

public val SIOCSHWTSTAMP: CUlong = 0x000089b0uL

public val SIOCGHWTSTAMP: CUlong = 0x000089b1uL

public val SIOCDEVPRIVATE: CUlong = 0x000089F0uL

public val SIOCPROTOPRIVATE: CUlong = 0x000089E0uL

// linux/module.h
public val MODULE_INIT_IGNORE_MODVERSIONS: CUint = 0x0001u

public val MODULE_INIT_IGNORE_VERMAGIC: CUint = 0x0002u

// linux/netTstamp.h
public val SOF_TIMESTAMPING_TX_HARDWARE: CUint = 1u shl 0

public val SOF_TIMESTAMPING_TX_SOFTWARE: CUint = 1u shl 1

public val SOF_TIMESTAMPING_RX_HARDWARE: CUint = 1u shl 2

public val SOF_TIMESTAMPING_RX_SOFTWARE: CUint = 1u shl 3

public val SOF_TIMESTAMPING_SOFTWARE: CUint = 1u shl 4

public val SOF_TIMESTAMPING_SYS_HARDWARE: CUint = 1u shl 5

public val SOF_TIMESTAMPING_RAW_HARDWARE: CUint = 1u shl 6

public val SOF_TIMESTAMPING_OPT_ID: CUint = 1u shl 7

public val SOF_TIMESTAMPING_TX_SCHED: CUint = 1u shl 8

public val SOF_TIMESTAMPING_TX_ACK: CUint = 1u shl 9

public val SOF_TIMESTAMPING_OPT_CMSG: CUint = 1u shl 10

public val SOF_TIMESTAMPING_OPT_TSONLY: CUint = 1u shl 11

public val SOF_TIMESTAMPING_OPT_STATS: CUint = 1u shl 12

public val SOF_TIMESTAMPING_OPT_PKTINFO: CUint = 1u shl 13

public val SOF_TIMESTAMPING_OPT_TX_SWHW: CUint = 1u shl 14

public val SOF_TIMESTAMPING_BIND_PHC: CUint = 1u shl 15

public val SOF_TIMESTAMPING_OPT_ID_TCP: CUint = 1u shl 16

public val SOF_TIMESTAMPING_OPT_RX_FILTER: CUint = 1u shl 17

public val ENOATTR: CInt = ENODATA

// linux/ifAlg.h
public val ALG_SET_KEY: CInt = 1

public val ALG_SET_IV: CInt = 2

public val ALG_SET_OP: CInt = 3

public val ALG_SET_AEAD_ASSOCLEN: CInt = 4

public val ALG_SET_AEAD_AUTHSIZE: CInt = 5

public val ALG_SET_DRBG_ENTROPY: CInt = 6

public val ALG_OP_DECRYPT: CInt = 0

public val ALG_OP_ENCRYPT: CInt = 1

// sys/mman.h
public val MLOCK_ONFAULT: CInt = 0x01

// uapi/linux/vmSockets.h
public val VMADDR_CID_ANY: CUint = 0xFFFFFFFFu

public val VMADDR_CID_HYPERVISOR: CUint = 0u

public val VMADDR_CID_LOCAL: CUint = 1u

public val VMADDR_CID_HOST: CUint = 2u

public val VMADDR_PORT_ANY: CUint = 0xFFFFFFFFu

// uapi/linux/inotify.h
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

public val IN_EXCL_UNLINK: UInt = 0x04000000u

public val IN_MASK_CREATE: UInt = 0x10000000u

public val IN_MASK_ADD: UInt = 0x20000000u

public val IN_ISDIR: UInt = 0x40000000u

public val IN_ONESHOT: UInt = 0x80000000u

public val IN_ALL_EVENTS: UInt = IN_ACCESS or IN_MODIFY or IN_ATTRIB or IN_CLOSE_WRITE or IN_CLOSE_NOWRITE or IN_OPEN or IN_MOVED_FROM or IN_MOVED_TO or IN_DELETE or IN_CREATE or IN_DELETE_SELF or IN_MOVE_SELF

public val IN_CLOEXEC: CInt = O_CLOEXEC

public val IN_NONBLOCK: CInt = O_NONBLOCK

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

public val FUTEX_LOCK_PI2: CInt = 13

public val FUTEX_PRIVATE_FLAG: CInt = 128

public val FUTEX_CLOCK_REALTIME: CInt = 256

public val FUTEX_CMD_MASK: CInt = (FUTEX_PRIVATE_FLAG or FUTEX_CLOCK_REALTIME).inv()

// linux/errqueue.h
public val SO_EE_ORIGIN_NONE: UByte = 0u

public val SO_EE_ORIGIN_LOCAL: UByte = 1u

public val SO_EE_ORIGIN_ICMP: UByte = 2u

public val SO_EE_ORIGIN_ICMP6: UByte = 3u

public val SO_EE_ORIGIN_TXSTATUS: UByte = 4u

public val SO_EE_ORIGIN_TIMESTAMPING: UByte = SO_EE_ORIGIN_TXSTATUS

// errno.h
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

public val EWOULDBLOCK: CInt = EAGAIN

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

// linux/sched.h
public val SCHED_NORMAL: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val SCHED_BATCH: CInt = 3

public val SCHED_IDLE: CInt = 5

public val SCHED_DEADLINE: CInt = 6

public val SCHED_RESET_ON_FORK: CInt = 0x40000000

public val CLONE_PIDFD: CInt = 0x1000

public val CLONE_CLEAR_SIGHAND: CUlonglong = 0x100000000uL

public val CLONE_INTO_CGROUP: CUlonglong = 0x200000000uL

// linux/membarrier.h
public val MEMBARRIER_CMD_QUERY: CInt = 0

public val MEMBARRIER_CMD_GLOBAL: CInt = 1 shl 0

public val MEMBARRIER_CMD_GLOBAL_EXPEDITED: CInt = 1 shl 1

public val MEMBARRIER_CMD_REGISTER_GLOBAL_EXPEDITED: CInt = 1 shl 2

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED: CInt = 1 shl 3

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED: CInt = 1 shl 4

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_SYNC_CORE: CInt = 1 shl 5

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_SYNC_CORE: CInt = 1 shl 6

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_RSEQ: CInt = 1 shl 7

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_RSEQ: CInt = 1 shl 8

// linux/mempolicy.h
public val MPOL_DEFAULT: CInt = 0

public val MPOL_PREFERRED: CInt = 1

public val MPOL_BIND: CInt = 2

public val MPOL_INTERLEAVE: CInt = 3

public val MPOL_LOCAL: CInt = 4

public val MPOL_F_NUMA_BALANCING: CInt = 1 shl 13

public val MPOL_F_RELATIVE_NODES: CInt = 1 shl 14

public val MPOL_F_STATIC_NODES: CInt = 1 shl 15

// bits/seekConstants.h
public val SEEK_DATA: CInt = 3

public val SEEK_HOLE: CInt = 4

// sys/socket.h
public val AF_NFC: CInt = 39

public val AF_VSOCK: CInt = 40

public val PF_NFC: CInt = AF_NFC

public val PF_VSOCK: CInt = AF_VSOCK

public val SOMAXCONN: CInt = 128

// sys/systemProperties.h
public val PROP_VALUE_MAX: CInt = 92

public val PROP_NAME_MAX: CInt = 32

// sys/prctl.h
public val PR_SET_PDEATHSIG: CInt = 1

public val PR_GET_PDEATHSIG: CInt = 2

public val PR_GET_DUMPABLE: CInt = 3

public val PR_SET_DUMPABLE: CInt = 4

public val PR_GET_UNALIGN: CInt = 5

public val PR_SET_UNALIGN: CInt = 6

public val PR_UNALIGN_NOPRINT: CInt = 1

public val PR_UNALIGN_SIGBUS: CInt = 2

public val PR_GET_KEEPCAPS: CInt = 7

public val PR_SET_KEEPCAPS: CInt = 8

public val PR_GET_FPEMU: CInt = 9

public val PR_SET_FPEMU: CInt = 10

public val PR_FPEMU_NOPRINT: CInt = 1

public val PR_FPEMU_SIGFPE: CInt = 2

public val PR_GET_FPEXC: CInt = 11

public val PR_SET_FPEXC: CInt = 12

public val PR_FP_EXC_SW_ENABLE: CInt = 0x80

public val PR_FP_EXC_DIV: CInt = 0x010000

public val PR_FP_EXC_OVF: CInt = 0x020000

public val PR_FP_EXC_UND: CInt = 0x040000

public val PR_FP_EXC_RES: CInt = 0x080000

public val PR_FP_EXC_INV: CInt = 0x100000

public val PR_FP_EXC_DISABLED: CInt = 0

public val PR_FP_EXC_NONRECOV: CInt = 1

public val PR_FP_EXC_ASYNC: CInt = 2

public val PR_FP_EXC_PRECISE: CInt = 3

public val PR_GET_TIMING: CInt = 13

public val PR_SET_TIMING: CInt = 14

public val PR_TIMING_STATISTICAL: CInt = 0

public val PR_TIMING_TIMESTAMP: CInt = 1

public val PR_SET_NAME: CInt = 15

public val PR_GET_NAME: CInt = 16

public val PR_GET_ENDIAN: CInt = 19

public val PR_SET_ENDIAN: CInt = 20

public val PR_ENDIAN_BIG: CInt = 0

public val PR_ENDIAN_LITTLE: CInt = 1

public val PR_ENDIAN_PPC_LITTLE: CInt = 2

public val PR_GET_SECCOMP: CInt = 21

public val PR_SET_SECCOMP: CInt = 22

public val PR_CAPBSET_READ: CInt = 23

public val PR_CAPBSET_DROP: CInt = 24

public val PR_GET_TSC: CInt = 25

public val PR_SET_TSC: CInt = 26

public val PR_TSC_ENABLE: CInt = 1

public val PR_TSC_SIGSEGV: CInt = 2

public val PR_GET_SECUREBITS: CInt = 27

public val PR_SET_SECUREBITS: CInt = 28

public val PR_SET_TIMERSLACK: CInt = 29

public val PR_GET_TIMERSLACK: CInt = 30

public val PR_TASK_PERF_EVENTS_DISABLE: CInt = 31

public val PR_TASK_PERF_EVENTS_ENABLE: CInt = 32

public val PR_MCE_KILL: CInt = 33

public val PR_MCE_KILL_CLEAR: CInt = 0

public val PR_MCE_KILL_SET: CInt = 1

public val PR_MCE_KILL_LATE: CInt = 0

public val PR_MCE_KILL_EARLY: CInt = 1

public val PR_MCE_KILL_DEFAULT: CInt = 2

public val PR_MCE_KILL_GET: CInt = 34

public val PR_SET_MM: CInt = 35

public val PR_SET_MM_START_CODE: CInt = 1

public val PR_SET_MM_END_CODE: CInt = 2

public val PR_SET_MM_START_DATA: CInt = 3

public val PR_SET_MM_END_DATA: CInt = 4

public val PR_SET_MM_START_STACK: CInt = 5

public val PR_SET_MM_START_BRK: CInt = 6

public val PR_SET_MM_BRK: CInt = 7

public val PR_SET_MM_ARG_START: CInt = 8

public val PR_SET_MM_ARG_END: CInt = 9

public val PR_SET_MM_ENV_START: CInt = 10

public val PR_SET_MM_ENV_END: CInt = 11

public val PR_SET_MM_AUXV: CInt = 12

public val PR_SET_MM_EXE_FILE: CInt = 13

public val PR_SET_MM_MAP: CInt = 14

public val PR_SET_MM_MAP_SIZE: CInt = 15

public val PR_SET_PTRACER: CInt = 0x59616d61

public val PR_SET_PTRACER_ANY: CUlong = 0xffffffffffffffffuL

public val PR_SET_CHILD_SUBREAPER: CInt = 36

public val PR_GET_CHILD_SUBREAPER: CInt = 37

public val PR_SET_NO_NEW_PRIVS: CInt = 38

public val PR_GET_NO_NEW_PRIVS: CInt = 39

public val PR_GET_TID_ADDRESS: CInt = 40

public val PR_SET_THP_DISABLE: CInt = 41

public val PR_GET_THP_DISABLE: CInt = 42

public val PR_MPX_ENABLE_MANAGEMENT: CInt = 43

public val PR_MPX_DISABLE_MANAGEMENT: CInt = 44

public val PR_SET_FP_MODE: CInt = 45

public val PR_GET_FP_MODE: CInt = 46

public val PR_FP_MODE_FR: CInt = 1 shl 0

public val PR_FP_MODE_FRE: CInt = 1 shl 1

public val PR_CAP_AMBIENT: CInt = 47

public val PR_CAP_AMBIENT_IS_SET: CInt = 1

public val PR_CAP_AMBIENT_RAISE: CInt = 2

public val PR_CAP_AMBIENT_LOWER: CInt = 3

public val PR_CAP_AMBIENT_CLEAR_ALL: CInt = 4

public val PR_SVE_SET_VL: CInt = 50

public val PR_SVE_SET_VL_ONEXEC: CInt = 1 shl 18

public val PR_SVE_GET_VL: CInt = 51

public val PR_SVE_VL_LEN_MASK: CInt = 0xffff

public val PR_SVE_VL_INHERIT: CInt = 1 shl 17

public val PR_GET_SPECULATION_CTRL: CInt = 52

public val PR_SET_SPECULATION_CTRL: CInt = 53

public val PR_SPEC_STORE_BYPASS: CInt = 0

public val PR_SPEC_INDIRECT_BRANCH: CInt = 1

public val PR_SPEC_L1D_FLUSH: CInt = 2

public val PR_SPEC_NOT_AFFECTED: CInt = 0

public val PR_SPEC_PRCTL: CUlong = 1uL shl 0

public val PR_SPEC_ENABLE: CUlong = 1uL shl 1

public val PR_SPEC_DISABLE: CUlong = 1uL shl 2

public val PR_SPEC_FORCE_DISABLE: CUlong = 1uL shl 3

public val PR_SPEC_DISABLE_NOEXEC: CUlong = 1uL shl 4

public val PR_PAC_RESET_KEYS: CInt = 54

public val PR_PAC_APIAKEY: CUlong = 1uL shl 0

public val PR_PAC_APIBKEY: CUlong = 1uL shl 1

public val PR_PAC_APDAKEY: CUlong = 1uL shl 2

public val PR_PAC_APDBKEY: CUlong = 1uL shl 3

public val PR_PAC_APGAKEY: CUlong = 1uL shl 4

public val PR_SET_TAGGED_ADDR_CTRL: CInt = 55

public val PR_GET_TAGGED_ADDR_CTRL: CInt = 56

public val PR_TAGGED_ADDR_ENABLE: CUlong = 1uL shl 0

public val PR_MTE_TCF_NONE: CUlong = 0uL

public val PR_MTE_TCF_SYNC: CUlong = 1uL shl 1

public val PR_MTE_TCF_ASYNC: CUlong = 1uL shl 2

public val PR_MTE_TCF_MASK: CUlong = PR_MTE_TCF_SYNC or PR_MTE_TCF_ASYNC

public val PR_MTE_TAG_SHIFT: CUlong = 3uL

public val PR_MTE_TAG_MASK: CUlong = 0xffffuL shl PR_MTE_TAG_SHIFT.toInt()

public val PR_MTE_TCF_SHIFT: CUlong = 1uL

public val PR_SET_IO_FLUSHER: CInt = 57

public val PR_GET_IO_FLUSHER: CInt = 58

public val PR_SET_SYSCALL_USER_DISPATCH: CInt = 59

public val PR_SYS_DISPATCH_OFF: CInt = 0

public val PR_SYS_DISPATCH_ON: CInt = 1

public val SYSCALL_DISPATCH_FILTER_ALLOW: CInt = 0

public val SYSCALL_DISPATCH_FILTER_BLOCK: CInt = 1

public val PR_PAC_SET_ENABLED_KEYS: CInt = 60

public val PR_PAC_GET_ENABLED_KEYS: CInt = 61

public val PR_SCHED_CORE: CInt = 62

public val PR_SCHED_CORE_GET: CInt = 0

public val PR_SCHED_CORE_CREATE: CInt = 1

public val PR_SCHED_CORE_SHARE_TO: CInt = 2

public val PR_SCHED_CORE_SHARE_FROM: CInt = 3

public val PR_SCHED_CORE_MAX: CInt = 4

public val PR_SCHED_CORE_SCOPE_THREAD: CInt = 0

public val PR_SCHED_CORE_SCOPE_THREAD_GROUP: CInt = 1

public val PR_SCHED_CORE_SCOPE_PROCESS_GROUP: CInt = 2

public val PR_SME_SET_VL: CInt = 63

public val PR_SME_SET_VL_ONEXEC: CInt = 1 shl 18

public val PR_SME_GET_VL: CInt = 64

public val PR_SME_VL_LEN_MASK: CInt = 0xffff

public val PR_SME_VL_INHERIT: CInt = 1 shl 17

public val PR_SET_MDWE: CInt = 65

public val PR_MDWE_REFUSE_EXEC_GAIN: CUlong = 1uL shl 0

public val PR_MDWE_NO_INHERIT: CUlong = 1uL shl 1

public val PR_GET_MDWE: CInt = 66

public val PR_SET_VMA: CInt = 0x53564d41

public val PR_SET_VMA_ANON_NAME: CInt = 0

public val PR_GET_AUXV: CInt = 0x41555856

public val PR_SET_MEMORY_MERGE: CInt = 67

public val PR_GET_MEMORY_MERGE: CInt = 68

public val PR_RISCV_V_SET_CONTROL: CInt = 69

public val PR_RISCV_V_GET_CONTROL: CInt = 70

public val PR_RISCV_V_VSTATE_CTRL_DEFAULT: CInt = 0

public val PR_RISCV_V_VSTATE_CTRL_OFF: CInt = 1

public val PR_RISCV_V_VSTATE_CTRL_ON: CInt = 2

public val PR_RISCV_V_VSTATE_CTRL_INHERIT: CInt = 1 shl 4

public val PR_RISCV_V_VSTATE_CTRL_CUR_MASK: CInt = 0x3

public val PR_RISCV_V_VSTATE_CTRL_NEXT_MASK: CInt = 0xc

public val PR_RISCV_V_VSTATE_CTRL_MASK: CInt = 0x1f

// linux/ifAddr.h
public val IFA_UNSPEC: CUshort = 0u

public val IFA_ADDRESS: CUshort = 1u

public val IFA_LOCAL: CUshort = 2u

public val IFA_LABEL: CUshort = 3u

public val IFA_BROADCAST: CUshort = 4u

public val IFA_ANYCAST: CUshort = 5u

public val IFA_CACHEINFO: CUshort = 6u

public val IFA_MULTICAST: CUshort = 7u

public val IFA_F_SECONDARY: UInt = 0x01u

public val IFA_F_TEMPORARY: UInt = 0x01u

public val IFA_F_NODAD: UInt = 0x02u

public val IFA_F_OPTIMISTIC: UInt = 0x04u

public val IFA_F_DADFAILED: UInt = 0x08u

public val IFA_F_HOMEADDRESS: UInt = 0x10u

public val IFA_F_DEPRECATED: UInt = 0x20u

public val IFA_F_TENTATIVE: UInt = 0x40u

public val IFA_F_PERMANENT: UInt = 0x80u

// linux/ifLink.h
public val IFLA_UNSPEC: CUshort = 0u

public val IFLA_ADDRESS: CUshort = 1u

public val IFLA_BROADCAST: CUshort = 2u

public val IFLA_IFNAME: CUshort = 3u

public val IFLA_MTU: CUshort = 4u

public val IFLA_LINK: CUshort = 5u

public val IFLA_QDISC: CUshort = 6u

public val IFLA_STATS: CUshort = 7u

public val IFLA_COST: CUshort = 8u

public val IFLA_PRIORITY: CUshort = 9u

public val IFLA_MASTER: CUshort = 10u

public val IFLA_WIRELESS: CUshort = 11u

public val IFLA_PROTINFO: CUshort = 12u

public val IFLA_TXQLEN: CUshort = 13u

public val IFLA_MAP: CUshort = 14u

public val IFLA_WEIGHT: CUshort = 15u

public val IFLA_OPERSTATE: CUshort = 16u

public val IFLA_LINKMODE: CUshort = 17u

public val IFLA_LINKINFO: CUshort = 18u

public val IFLA_NET_NS_PID: CUshort = 19u

public val IFLA_IFALIAS: CUshort = 20u

public val IFLA_NUM_VF: CUshort = 21u

public val IFLA_VFINFO_LIST: CUshort = 22u

public val IFLA_STATS64: CUshort = 23u

public val IFLA_VF_PORTS: CUshort = 24u

public val IFLA_PORT_SELF: CUshort = 25u

public val IFLA_AF_SPEC: CUshort = 26u

public val IFLA_GROUP: CUshort = 27u

public val IFLA_NET_NS_FD: CUshort = 28u

public val IFLA_EXT_MASK: CUshort = 29u

public val IFLA_PROMISCUITY: CUshort = 30u

public val IFLA_NUM_TX_QUEUES: CUshort = 31u

public val IFLA_NUM_RX_QUEUES: CUshort = 32u

public val IFLA_CARRIER: CUshort = 33u

public val IFLA_PHYS_PORT_ID: CUshort = 34u

public val IFLA_CARRIER_CHANGES: CUshort = 35u

public val IFLA_PHYS_SWITCH_ID: CUshort = 36u

public val IFLA_LINK_NETNSID: CUshort = 37u

public val IFLA_PHYS_PORT_NAME: CUshort = 38u

public val IFLA_PROTO_DOWN: CUshort = 39u

public val IFLA_GSO_MAX_SEGS: CUshort = 40u

public val IFLA_GSO_MAX_SIZE: CUshort = 41u

public val IFLA_PAD: CUshort = 42u

public val IFLA_XDP: CUshort = 43u

public val IFLA_EVENT: CUshort = 44u

public val IFLA_NEW_NETNSID: CUshort = 45u

public val IFLA_IF_NETNSID: CUshort = 46u

public val IFLA_TARGET_NETNSID: CUshort = IFLA_IF_NETNSID

public val IFLA_CARRIER_UP_COUNT: CUshort = 47u

public val IFLA_CARRIER_DOWN_COUNT: CUshort = 48u

public val IFLA_NEW_IFINDEX: CUshort = 49u

public val IFLA_MIN_MTU: CUshort = 50u

public val IFLA_MAX_MTU: CUshort = 51u

public val IFLA_PROP_LIST: CUshort = 52u

public val IFLA_ALT_IFNAME: CUshort = 53u

public val IFLA_PERM_ADDRESS: CUshort = 54u

public val IFLA_PROTO_DOWN_REASON: CUshort = 55u

public val IFLA_PARENT_DEV_NAME: CUshort = 56u

public val IFLA_PARENT_DEV_BUS_NAME: CUshort = 57u

public val IFLA_GRO_MAX_SIZE: CUshort = 58u

public val IFLA_TSO_MAX_SIZE: CUshort = 59u

public val IFLA_TSO_MAX_SEGS: CUshort = 60u

public val IFLA_ALLMULTI: CUshort = 61u

public val IFLA_DEVLINK_PORT: CUshort = 62u

public val IFLA_GSO_IPV4_MAX_SIZE: CUshort = 63u

public val IFLA_GRO_IPV4_MAX_SIZE: CUshort = 64u

public val IFLA_INFO_UNSPEC: CUshort = 0u

public val IFLA_INFO_KIND: CUshort = 1u

public val IFLA_INFO_DATA: CUshort = 2u

public val IFLA_INFO_XSTATS: CUshort = 3u

public val IFLA_INFO_SLAVE_KIND: CUshort = 4u

public val IFLA_INFO_SLAVE_DATA: CUshort = 5u

// linux/rtnetlink.h
public val TCA_UNSPEC: CUshort = 0u

public val TCA_KIND: CUshort = 1u

public val TCA_OPTIONS: CUshort = 2u

public val TCA_STATS: CUshort = 3u

public val TCA_XSTATS: CUshort = 4u

public val TCA_RATE: CUshort = 5u

public val TCA_FCNT: CUshort = 6u

public val TCA_STATS2: CUshort = 7u

public val TCA_STAB: CUshort = 8u

public val RTM_NEWLINK: UShort = 16u

public val RTM_DELLINK: UShort = 17u

public val RTM_GETLINK: UShort = 18u

public val RTM_SETLINK: UShort = 19u

public val RTM_NEWADDR: UShort = 20u

public val RTM_DELADDR: UShort = 21u

public val RTM_GETADDR: UShort = 22u

public val RTM_NEWROUTE: UShort = 24u

public val RTM_DELROUTE: UShort = 25u

public val RTM_GETROUTE: UShort = 26u

public val RTM_NEWNEIGH: UShort = 28u

public val RTM_DELNEIGH: UShort = 29u

public val RTM_GETNEIGH: UShort = 30u

public val RTM_NEWRULE: UShort = 32u

public val RTM_DELRULE: UShort = 33u

public val RTM_GETRULE: UShort = 34u

public val RTM_NEWQDISC: UShort = 36u

public val RTM_DELQDISC: UShort = 37u

public val RTM_GETQDISC: UShort = 38u

public val RTM_NEWTCLASS: UShort = 40u

public val RTM_DELTCLASS: UShort = 41u

public val RTM_GETTCLASS: UShort = 42u

public val RTM_NEWTFILTER: UShort = 44u

public val RTM_DELTFILTER: UShort = 45u

public val RTM_GETTFILTER: UShort = 46u

public val RTM_NEWACTION: UShort = 48u

public val RTM_DELACTION: UShort = 49u

public val RTM_GETACTION: UShort = 50u

public val RTM_NEWPREFIX: UShort = 52u

public val RTM_GETMULTICAST: UShort = 58u

public val RTM_GETANYCAST: UShort = 62u

public val RTM_NEWNEIGHTBL: UShort = 64u

public val RTM_GETNEIGHTBL: UShort = 66u

public val RTM_SETNEIGHTBL: UShort = 67u

public val RTM_NEWNDUSEROPT: UShort = 68u

public val RTM_NEWADDRLABEL: UShort = 72u

public val RTM_DELADDRLABEL: UShort = 73u

public val RTM_GETADDRLABEL: UShort = 74u

public val RTM_GETDCB: UShort = 78u

public val RTM_SETDCB: UShort = 79u

public val RTM_NEWNETCONF: UShort = 80u

public val RTM_GETNETCONF: UShort = 82u

public val RTM_NEWMDB: UShort = 84u

public val RTM_DELMDB: UShort = 85u

public val RTM_GETMDB: UShort = 86u

public val RTM_NEWNSID: UShort = 88u

public val RTM_DELNSID: UShort = 89u

public val RTM_GETNSID: UShort = 90u

public val RTM_F_NOTIFY: CUint = 0x100u

public val RTM_F_CLONED: CUint = 0x200u

public val RTM_F_EQUALIZE: CUint = 0x400u

public val RTM_F_PREFIX: CUint = 0x800u

public val RTA_UNSPEC: CUshort = 0u

public val RTA_DST: CUshort = 1u

public val RTA_SRC: CUshort = 2u

public val RTA_IIF: CUshort = 3u

public val RTA_OIF: CUshort = 4u

public val RTA_GATEWAY: CUshort = 5u

public val RTA_PRIORITY: CUshort = 6u

public val RTA_PREFSRC: CUshort = 7u

public val RTA_METRICS: CUshort = 8u

public val RTA_MULTIPATH: CUshort = 9u

public val RTA_PROTOINFO: CUshort = 10u

// No longer used
public val RTA_FLOW: CUshort = 11u

public val RTA_CACHEINFO: CUshort = 12u

public val RTA_SESSION: CUshort = 13u

// No longer used
public val RTA_MP_ALGO: CUshort = 14u

// No longer used
public val RTA_TABLE: CUshort = 15u

public val RTA_MARK: CUshort = 16u

public val RTA_MFC_STATS: CUshort = 17u

public val RTN_UNSPEC: CUchar = 0u

public val RTN_UNICAST: CUchar = 1u

public val RTN_LOCAL: CUchar = 2u

public val RTN_BROADCAST: CUchar = 3u

public val RTN_ANYCAST: CUchar = 4u

public val RTN_MULTICAST: CUchar = 5u

public val RTN_BLACKHOLE: CUchar = 6u

public val RTN_UNREACHABLE: CUchar = 7u

public val RTN_PROHIBIT: CUchar = 8u

public val RTN_THROW: CUchar = 9u

public val RTN_NAT: CUchar = 10u

public val RTN_XRESOLVE: CUchar = 11u

public val RTPROT_UNSPEC: CUchar = 0u

public val RTPROT_REDIRECT: CUchar = 1u

public val RTPROT_KERNEL: CUchar = 2u

public val RTPROT_BOOT: CUchar = 3u

public val RTPROT_STATIC: CUchar = 4u

public val RT_SCOPE_UNIVERSE: CUchar = 0u

public val RT_SCOPE_SITE: CUchar = 200u

public val RT_SCOPE_LINK: CUchar = 253u

public val RT_SCOPE_HOST: CUchar = 254u

public val RT_SCOPE_NOWHERE: CUchar = 255u

public val RT_TABLE_UNSPEC: CUchar = 0u

public val RT_TABLE_COMPAT: CUchar = 252u

public val RT_TABLE_DEFAULT: CUchar = 253u

public val RT_TABLE_MAIN: CUchar = 254u

public val RT_TABLE_LOCAL: CUchar = 255u

public val RTMSG_NEWDEVICE: UInt = 0x11u

public val RTMSG_DELDEVICE: UInt = 0x12u

public val RTMSG_NEWROUTE: UInt = 0x21u

public val RTMSG_DELROUTE: UInt = 0x22u

public val CTL_KERN: CInt = 1

public val CTL_VM: CInt = 2

public val CTL_NET: CInt = 3

public val CTL_FS: CInt = 5

public val CTL_DEBUG: CInt = 6

public val CTL_DEV: CInt = 7

public val CTL_BUS: CInt = 8

public val CTL_ABI: CInt = 9

public val CTL_CPU: CInt = 10

public val CTL_BUS_ISA: CInt = 1

public val INOTIFY_MAX_USER_INSTANCES: CInt = 1

public val INOTIFY_MAX_USER_WATCHES: CInt = 2

public val INOTIFY_MAX_QUEUED_EVENTS: CInt = 3

public val KERN_OSTYPE: CInt = 1

public val KERN_OSRELEASE: CInt = 2

public val KERN_OSREV: CInt = 3

public val KERN_VERSION: CInt = 4

public val KERN_SECUREMASK: CInt = 5

public val KERN_PROF: CInt = 6

public val KERN_NODENAME: CInt = 7

public val KERN_DOMAINNAME: CInt = 8

public val KERN_PANIC: CInt = 15

public val KERN_REALROOTDEV: CInt = 16

public val KERN_SPARC_REBOOT: CInt = 21

public val KERN_CTLALTDEL: CInt = 22

public val KERN_PRINTK: CInt = 23

public val KERN_NAMETRANS: CInt = 24

public val KERN_PPC_HTABRECLAIM: CInt = 25

public val KERN_PPC_ZEROPAGED: CInt = 26

public val KERN_PPC_POWERSAVE_NAP: CInt = 27

public val KERN_MODPROBE: CInt = 28

public val KERN_SG_BIG_BUFF: CInt = 29

public val KERN_ACCT: CInt = 30

public val KERN_PPC_L2CR: CInt = 31

public val KERN_RTSIGNR: CInt = 32

public val KERN_RTSIGMAX: CInt = 33

public val KERN_SHMMAX: CInt = 34

public val KERN_MSGMAX: CInt = 35

public val KERN_MSGMNB: CInt = 36

public val KERN_MSGPOOL: CInt = 37

public val KERN_SYSRQ: CInt = 38

public val KERN_MAX_THREADS: CInt = 39

public val KERN_RANDOM: CInt = 40

public val KERN_SHMALL: CInt = 41

public val KERN_MSGMNI: CInt = 42

public val KERN_SEM: CInt = 43

public val KERN_SPARC_STOP_A: CInt = 44

public val KERN_SHMMNI: CInt = 45

public val KERN_OVERFLOWUID: CInt = 46

public val KERN_OVERFLOWGID: CInt = 47

public val KERN_SHMPATH: CInt = 48

public val KERN_HOTPLUG: CInt = 49

public val KERN_IEEE_EMULATION_WARNINGS: CInt = 50

public val KERN_S390_USER_DEBUG_LOGGING: CInt = 51

public val KERN_CORE_USES_PID: CInt = 52

public val KERN_TAINTED: CInt = 53

public val KERN_CADPID: CInt = 54

public val KERN_PIDMAX: CInt = 55

public val KERN_CORE_PATTERN: CInt = 56

public val KERN_PANIC_ON_OOPS: CInt = 57

public val KERN_HPPA_PWRSW: CInt = 58

public val KERN_HPPA_UNALIGNED: CInt = 59

public val KERN_PRINTK_RATELIMIT: CInt = 60

public val KERN_PRINTK_RATELIMIT_BURST: CInt = 61

public val KERN_PTY: CInt = 62

public val KERN_NGROUPS_MAX: CInt = 63

public val KERN_SPARC_SCONS_PWROFF: CInt = 64

public val KERN_HZ_TIMER: CInt = 65

public val KERN_UNKNOWN_NMI_PANIC: CInt = 66

public val KERN_BOOTLOADER_TYPE: CInt = 67

public val KERN_RANDOMIZE: CInt = 68

public val KERN_SETUID_DUMPABLE: CInt = 69

public val KERN_SPIN_RETRY: CInt = 70

public val KERN_ACPI_VIDEO_FLAGS: CInt = 71

public val KERN_IA64_UNALIGNED: CInt = 72

public val KERN_COMPAT_LOG: CInt = 73

public val KERN_MAX_LOCK_DEPTH: CInt = 74

public val VM_OVERCOMMIT_MEMORY: CInt = 5

public val VM_PAGE_CLUSTER: CInt = 10

public val VM_DIRTY_BACKGROUND: CInt = 11

public val VM_DIRTY_RATIO: CInt = 12

public val VM_DIRTY_WB_CS: CInt = 13

public val VM_DIRTY_EXPIRE_CS: CInt = 14

public val VM_NR_PDFLUSH_THREADS: CInt = 15

public val VM_OVERCOMMIT_RATIO: CInt = 16

public val VM_PAGEBUF: CInt = 17

public val VM_HUGETLB_PAGES: CInt = 18

public val VM_SWAPPINESS: CInt = 19

public val VM_LOWMEM_RESERVE_RATIO: CInt = 20

public val VM_MIN_FREE_KBYTES: CInt = 21

public val VM_MAX_MAP_COUNT: CInt = 22

public val VM_LAPTOP_MODE: CInt = 23

public val VM_BLOCK_DUMP: CInt = 24

public val VM_HUGETLB_GROUP: CInt = 25

public val VM_VFS_CACHE_PRESSURE: CInt = 26

public val VM_LEGACY_VA_LAYOUT: CInt = 27

public val VM_SWAP_TOKEN_TIMEOUT: CInt = 28

public val VM_DROP_PAGECACHE: CInt = 29

public val VM_PERCPU_PAGELIST_FRACTION: CInt = 30

public val VM_ZONE_RECLAIM_MODE: CInt = 31

public val VM_MIN_UNMAPPED: CInt = 32

public val VM_PANIC_ON_OOM: CInt = 33

public val VM_VDSO_ENABLED: CInt = 34

public val NET_CORE: CInt = 1

public val NET_ETHER: CInt = 2

public val NET_802: CInt = 3

public val NET_UNIX: CInt = 4

public val NET_IPV4: CInt = 5

public val NET_IPX: CInt = 6

public val NET_ATALK: CInt = 7

public val NET_NETROM: CInt = 8

public val NET_AX25: CInt = 9

public val NET_BRIDGE: CInt = 10

public val NET_ROSE: CInt = 11

public val NET_IPV6: CInt = 12

public val NET_X25: CInt = 13

public val NET_TR: CInt = 14

public val NET_DECNET: CInt = 15

public val NET_ECONET: CInt = 16

public val NET_SCTP: CInt = 17

public val NET_LLC: CInt = 18

public val NET_NETFILTER: CInt = 19

public val NET_DCCP: CInt = 20

public val HUGETLB_FLAG_ENCODE_SHIFT: CInt = 26

public val MAP_HUGE_SHIFT: CInt = HUGETLB_FLAG_ENCODE_SHIFT

// include/linux/sched.h
public val PF_VCPU: CInt = 0x00000001

public val PF_IDLE: CInt = 0x00000002

public val PF_EXITING: CInt = 0x00000004

public val PF_POSTCOREDUMP: CInt = 0x00000008

public val PF_IO_WORKER: CInt = 0x00000010

public val PF_WQ_WORKER: CInt = 0x00000020

public val PF_FORKNOEXEC: CInt = 0x00000040

public val PF_MCE_PROCESS: CInt = 0x00000080

public val PF_SUPERPRIV: CInt = 0x00000100

public val PF_DUMPCORE: CInt = 0x00000200

public val PF_SIGNALED: CInt = 0x00000400

public val PF_MEMALLOC: CInt = 0x00000800

public val PF_NPROC_EXCEEDED: CInt = 0x00001000

public val PF_USED_MATH: CInt = 0x00002000

public val PF_USER_WORKER: CInt = 0x00004000

public val PF_NOFREEZE: CInt = 0x00008000

public val PF_KSWAPD: CInt = 0x00020000

public val PF_MEMALLOC_NOFS: CInt = 0x00040000

public val PF_MEMALLOC_NOIO: CInt = 0x00080000

public val PF_LOCAL_THROTTLE: CInt = 0x00100000

public val PF_KTHREAD: CInt = 0x00200000

public val PF_RANDOMIZE: CInt = 0x00400000

public val PF_NO_SETAFFINITY: CInt = 0x04000000

public val PF_MCE_EARLY: CInt = 0x08000000

public val PF_MEMALLOC_PIN: CInt = 0x10000000

public val PF_SUSPEND_TASK: CInt = 0x80000000

public val KLOG_CLOSE: CInt = 0

public val KLOG_OPEN: CInt = 1

public val KLOG_READ: CInt = 2

public val KLOG_READ_ALL: CInt = 3

public val KLOG_READ_CLEAR: CInt = 4

public val KLOG_CLEAR: CInt = 5

public val KLOG_CONSOLE_OFF: CInt = 6

public val KLOG_CONSOLE_ON: CInt = 7

public val KLOG_CONSOLE_LEVEL: CInt = 8

public val KLOG_SIZE_UNREAD: CInt = 9

public val KLOG_SIZE_BUFFER: CInt = 10

// From NDK's linux/auxvec.h
public val AT_NULL: CUlong = 0uL

public val AT_IGNORE: CUlong = 1uL

public val AT_EXECFD: CUlong = 2uL

public val AT_PHDR: CUlong = 3uL

public val AT_PHENT: CUlong = 4uL

public val AT_PHNUM: CUlong = 5uL

public val AT_PAGESZ: CUlong = 6uL

public val AT_BASE: CUlong = 7uL

public val AT_FLAGS: CUlong = 8uL

public val AT_ENTRY: CUlong = 9uL

public val AT_NOTELF: CUlong = 10uL

public val AT_UID: CUlong = 11uL

public val AT_EUID: CUlong = 12uL

public val AT_GID: CUlong = 13uL

public val AT_EGID: CUlong = 14uL

public val AT_PLATFORM: CUlong = 15uL

public val AT_HWCAP: CUlong = 16uL

public val AT_CLKTCK: CUlong = 17uL

public val AT_SECURE: CUlong = 23uL

public val AT_BASE_PLATFORM: CUlong = 24uL

public val AT_RANDOM: CUlong = 25uL

public val AT_HWCAP2: CUlong = 26uL

public val AT_RSEQ_FEATURE_SIZE: CUlong = 27uL

public val AT_RSEQ_ALIGN: CUlong = 28uL

public val AT_HWCAP3: CUlong = 29uL

public val AT_HWCAP4: CUlong = 30uL

public val AT_EXECFN: CUlong = 31uL

public val AT_MINSIGSTKSZ: CUlong = 51uL

// siginfo.h
public val SI_DETHREAD: CInt = -7

public val TRAP_PERF: CInt = 6

public fun setgrent() {
    LibcDynamicFfi.invoke("setgrent", -1, longArrayOf())
}

public fun endgrent() {
    LibcDynamicFfi.invoke("endgrent", -1, longArrayOf())
}

public fun getgrent(): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("getrlimit64", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("setrlimit64", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun getrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("prlimit", -1, longArrayOf(pid.toLong(), resource.toLong(), newLimit?.value ?: 0L, oldLimit?.value ?: 0L)).toInt()
}

public fun prlimit64(pid: PidT, resource: CInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("prlimit64", -1, longArrayOf(pid.toLong(), resource.toLong(), newLimit?.value ?: 0L, oldLimit?.value ?: 0L)).toInt()
}

public fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("strerror_r", -1, longArrayOf(errnum.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mlock2", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("msync", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(sa?.value ?: 0L, salen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, servlen.toLong(), flags.toLong())).toInt()
}

public fun preadv(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("preadv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, count.toLong(), offset))
}

public fun pwritev(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pwritev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, count.toLong(), offset))
}

public fun processVmReadv(pid: PidT, localIov: Iovec?, localIovCount: CUlong, remoteIov: Iovec?, remoteIovCount: CUlong, flags: CUlong): SsizeT {
    return LibcDynamicFfi.invoke("process_vm_readv", -1, longArrayOf(pid.toLong(), localIov?.value ?: 0L, localIovCount.toLong(), remoteIov?.value ?: 0L, remoteIovCount.toLong(), flags.toLong()))
}

public fun processVmWritev(pid: PidT, localIov: Iovec?, localIovCount: CUlong, remoteIov: Iovec?, remoteIovCount: CUlong, flags: CUlong): SsizeT {
    return LibcDynamicFfi.invoke("process_vm_writev", -1, longArrayOf(pid.toLong(), localIov?.value ?: 0L, localIovCount.toLong(), remoteIov?.value ?: 0L, remoteIovCount.toLong(), flags.toLong()))
}

public fun ptrace(request: CInt, vararg variadicArgs: Long): CLong {
    return LibcDynamicFfi.invoke("ptrace", 1, longArrayOf(request.toLong()) + variadicArgs)
}

public fun getpriority(which: CInt, who: IdT): CInt {
    return LibcDynamicFfi.invoke("getpriority", -1, longArrayOf(which.toLong(), who.toLong())).toInt()
}

public fun setpriority(which: CInt, who: IdT, prio: CInt): CInt {
    return LibcDynamicFfi.invoke("setpriority", -1, longArrayOf(which.toLong(), who.toLong(), prio.toLong())).toInt()
}

public fun schedCpualloc(count: SizeT): CpuSetT? {
    val rawRet = LibcDynamicFfi.invoke("__sched_cpualloc", -1, longArrayOf(count.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun schedCpufree(set: CpuSetT?) {
    LibcDynamicFfi.invoke("__sched_cpufree", -1, longArrayOf(set?.value ?: 0L))
}

public fun schedCpucount(setsize: SizeT, set: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("__sched_cpucount", -1, longArrayOf(setsize.toLong(), set?.value ?: 0L)).toInt()
}

public fun schedGetcpu(): CInt {
    return LibcDynamicFfi.invoke("sched_getcpu", -1, longArrayOf()).toInt()
}

public fun mallinfo(): Mallinfo {
    LibcDynamicFfi.invoke("mallinfo", -1, longArrayOf())
    return null as Mallinfo
}

// available from API 23
public fun mallocInfo(options: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("malloc_info", -1, longArrayOf(options.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun mallocUsableSize(ptr: COpaquePointer?): SizeT {
    return LibcDynamicFfi.invoke("malloc_usable_size", -1, longArrayOf(ptr?.value ?: 0L)).toULong()
}

public fun utmpname(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("utmpname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun setutent() {
    LibcDynamicFfi.invoke("setutent", -1, longArrayOf())
}

public fun getutent(): Utmp? {
    val rawRet = LibcDynamicFfi.invoke("getutent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun seekdir(dirp: DIR?, loc: CLong) {
    LibcDynamicFfi.invoke("seekdir", -1, longArrayOf(dirp?.handle ?: 0L, loc))
}

public fun telldir(dirp: DIR?): CLong {
    return LibcDynamicFfi.invoke("telldir", -1, longArrayOf(dirp?.handle ?: 0L))
}

public fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt {
    return LibcDynamicFfi.invoke("fallocate", -1, longArrayOf(fd.toLong(), mode.toLong(), offset, len)).toInt()
}

public fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt {
    return LibcDynamicFfi.invoke("fallocate64", -1, longArrayOf(fd.toLong(), mode.toLong(), offset, len)).toInt()
}

public fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt {
    return LibcDynamicFfi.invoke("posix_fallocate", -1, longArrayOf(fd.toLong(), offset, len)).toInt()
}

public fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt {
    return LibcDynamicFfi.invoke("posix_fallocate64", -1, longArrayOf(fd.toLong(), offset, len)).toInt()
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

public fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("setxattr", -1, longArrayOf(__cstr_0, __cstr_1, value?.value ?: 0L, size.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("lsetxattr", -1, longArrayOf(__cstr_0, __cstr_1, value?.value ?: 0L, size.toLong(), flags.toLong())).toInt()
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

public fun fremovexattr(filedes: CInt, name: String?): CInt {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("fremovexattr", -1, longArrayOf(filedes.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("signalfd", -1, longArrayOf(fd.toLong(), mask?.value ?: 0L, flags.toLong())).toInt()
}

public fun timerfdCreate(clock: ClockidT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("timerfd_create", -1, longArrayOf(clock.toLong(), flags.toLong())).toInt()
}

public fun timerfdGettime(fd: CInt, currentValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timerfd_gettime", -1, longArrayOf(fd.toLong(), currentValue?.value ?: 0L)).toInt()
}

public fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timerfd_settime", -1, longArrayOf(fd.toLong(), flags.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
}

public fun syscall(num: CLong, vararg variadicArgs: Long): CLong {
    return LibcDynamicFfi.invoke("syscall", 1, longArrayOf(num) + variadicArgs)
}

public fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("sched_getaffinity", -1, longArrayOf(pid.toLong(), cpusetsize.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("sched_setaffinity", -1, longArrayOf(pid.toLong(), cpusetsize.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun epollCreate(size: CInt): CInt {
    return LibcDynamicFfi.invoke("epoll_create", -1, longArrayOf(size.toLong())).toInt()
}

public fun epollCreate1(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("epoll_create1", -1, longArrayOf(flags.toLong())).toInt()
}

public fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt {
    return LibcDynamicFfi.invoke("epoll_wait", -1, longArrayOf(epfd.toLong(), events?.value ?: 0L, maxevents.toLong(), timeout.toLong())).toInt()
}

public fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt {
    return LibcDynamicFfi.invoke("epoll_ctl", -1, longArrayOf(epfd.toLong(), op.toLong(), fd.toLong(), event?.value ?: 0L)).toInt()
}

public fun unshare(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("unshare", -1, longArrayOf(flags.toLong())).toInt()
}

public fun umount(target: String?): CInt {
    val __cstr_0 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    try {
        return LibcDynamicFfi.invoke("umount", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun schedGetPriorityMax(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_max", -1, longArrayOf(policy.toLong())).toInt()
}

public fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("tee", -1, longArrayOf(fdIn.toLong(), fdOut.toLong(), len.toLong(), flags.toLong()))
}

public fun settimeofday(tv: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("settimeofday", -1, longArrayOf(tv?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT {
    val __slot_1 = if (offIn == null) 0L else LibcDynamicFfi.allocScalarSlot(offIn)
    val __slot_3 = if (offOut == null) 0L else LibcDynamicFfi.allocScalarSlot(offOut)
    try {
        return LibcDynamicFfi.invoke("splice", -1, longArrayOf(fdIn.toLong(), __slot_1, fdOut.toLong(), __slot_3, len.toLong(), flags.toLong()))
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun eventfd(initval: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("eventfd", -1, longArrayOf(initval.toLong(), flags.toLong())).toInt()
}

public fun eventfdRead(fd: CInt, value: ULong?): CInt {
    val __slot_1 = if (value == null) 0L else LibcDynamicFfi.allocScalarSlot(value.toLong())
    try {
        return LibcDynamicFfi.invoke("eventfd_read", -1, longArrayOf(fd.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun eventfdWrite(fd: CInt, value: EventfdT): CInt {
    return LibcDynamicFfi.invoke("eventfd_write", -1, longArrayOf(fd.toLong(), value.toLong())).toInt()
}

public fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sched_rr_get_interval", -1, longArrayOf(pid.toLong(), tp?.value ?: 0L)).toInt()
}

public fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sem_timedwait", -1, longArrayOf(sem?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun semGetvalue(sem: SemT?, sval: CInt?): CInt {
    val __slot_1 = if (sval == null) 0L else LibcDynamicFfi.allocScalarSlot(sval.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_getvalue", -1, longArrayOf(sem?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun schedSetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun setns(fd: CInt, nstype: CInt): CInt {
    return LibcDynamicFfi.invoke("setns", -1, longArrayOf(fd.toLong(), nstype.toLong())).toInt()
}

public fun swapoff(puath: String?): CInt {
    val __cstr_0 = if (puath == null) 0L else LibcDynamicFfi.allocUtf8CString(puath)
    try {
        return LibcDynamicFfi.invoke("swapoff", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("vmsplice", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, nrSegs.toLong(), flags.toLong()))
}

public fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt {
    val __cstr_0 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    val __cstr_1 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    val __cstr_2 = if (fstype == null) 0L else LibcDynamicFfi.allocUtf8CString(fstype)
    try {
        return LibcDynamicFfi.invoke("mount", -1, longArrayOf(__cstr_0, __cstr_1, __cstr_2, flags.toLong(), data?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun personality(persona: CUint): CInt {
    return LibcDynamicFfi.invoke("personality", -1, longArrayOf(persona.toLong())).toInt()
}

public fun prctl(option: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("prctl", 1, longArrayOf(option.toLong()) + variadicArgs).toInt()
}

public fun schedGetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_getparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("ppoll", -1, longArrayOf(fds?.value ?: 0L, nfds.toLong(), timeout?.value ?: 0L, sigmask?.value ?: 0L)).toInt()
}

public fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("clone", 4, longArrayOf(__scratch_0, childStack?.value ?: 0L, flags.toLong(), arg?.value ?: 0L) + variadicArgs).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun schedGetscheduler(pid: PidT): CInt {
    return LibcDynamicFfi.invoke("sched_getscheduler", -1, longArrayOf(pid.toLong())).toInt()
}

public fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_nanosleep", -1, longArrayOf(clkId.toLong(), flags.toLong(), rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}

public fun sethostname(name: String?, len: SizeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sethostname", -1, longArrayOf(__cstr_0, len.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun schedGetPriorityMin(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_min", -1, longArrayOf(policy.toLong())).toInt()
}

public fun sysinfo(info: Sysinfo?): CInt {
    return LibcDynamicFfi.invoke("sysinfo", -1, longArrayOf(info?.value ?: 0L)).toInt()
}

public fun umount2(target: String?, flags: CInt): CInt {
    val __cstr_0 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    try {
        return LibcDynamicFfi.invoke("umount2", -1, longArrayOf(__cstr_0, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun swapon(path: String?, swapflags: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("swapon", -1, longArrayOf(__cstr_0, swapflags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setscheduler", -1, longArrayOf(pid.toLong(), policy.toLong(), param?.value ?: 0L)).toInt()
}

public fun sendfile(outFd: CInt, inFd: CInt, offset: CLong?, count: SizeT): SsizeT {
    val __slot_2 = if (offset == null) 0L else LibcDynamicFfi.allocScalarSlot(offset)
    try {
        return LibcDynamicFfi.invoke("sendfile", -1, longArrayOf(outFd.toLong(), inFd.toLong(), __slot_2, count.toLong()))
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: SizeT): SsizeT {
    val __slot_2 = if (offset == null) 0L else LibcDynamicFfi.allocScalarSlot(offset)
    try {
        return LibcDynamicFfi.invoke("sendfile64", -1, longArrayOf(outFd.toLong(), inFd.toLong(), __slot_2, count.toLong()))
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun setfsgid(gid: GidT): CInt {
    return LibcDynamicFfi.invoke("setfsgid", -1, longArrayOf(gid.toLong())).toInt()
}

public fun setfsuid(uid: UidT): CInt {
    return LibcDynamicFfi.invoke("setfsuid", -1, longArrayOf(uid.toLong())).toInt()
}

public fun sigsuspend(mask: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigsuspend", -1, longArrayOf(mask?.value ?: 0L)).toInt()
}

public fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrgid_r", -1, longArrayOf(gid.toLong(), grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun sigaltstack(ss: StackT?, oss: StackT?): CInt {
    return LibcDynamicFfi.invoke("sigaltstack", -1, longArrayOf(ss?.value ?: 0L, oss?.value ?: 0L)).toInt()
}

public fun semClose(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_close", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getgrnam_r", -1, longArrayOf(__cstr_0, grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): SemT? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("sem_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs)
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
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

public fun semUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sem_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun daemon(nochdir: CInt, noclose: CInt): CInt {
    return LibcDynamicFfi.invoke("daemon", -1, longArrayOf(nochdir.toLong(), noclose.toLong())).toInt()
}

public fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sigtimedwait", -1, longArrayOf(set?.value ?: 0L, info?.value ?: 0L, timeout?.value ?: 0L)).toInt()
}

public fun sigwait(set: SigsetT?, sig: CInt?): CInt {
    val __slot_1 = if (sig == null) 0L else LibcDynamicFfi.allocScalarSlot(sig.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwait", -1, longArrayOf(set?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getgrgid(gid: GidT): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrgid", -1, longArrayOf(gid.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
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

public fun initgroups(user: String?, group: GidT): CInt {
    val __cstr_0 = if (user == null) 0L else LibcDynamicFfi.allocUtf8CString(user)
    try {
        return LibcDynamicFfi.invoke("initgroups", -1, longArrayOf(__cstr_0, group.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun popen(command: String?, mode: String?): FILE? {
    val __cstr_0 = if (command == null) 0L else LibcDynamicFfi.allocUtf8CString(command)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("popen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
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

public fun errno(): CInt? {
    val rawRet = LibcDynamicFfi.invoke("__errno", -1, longArrayOf())
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
}

public fun inotifyRmWatch(fd: CInt, wd: UInt): CInt {
    return LibcDynamicFfi.invoke("inotify_rm_watch", -1, longArrayOf(fd.toLong(), wd.toLong())).toInt()
}

public fun inotifyInit(): CInt {
    return LibcDynamicFfi.invoke("inotify_init", -1, longArrayOf()).toInt()
}

public fun inotifyInit1(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("inotify_init1", -1, longArrayOf(flags.toLong())).toInt()
}

public fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("inotify_add_watch", -1, longArrayOf(fd.toLong(), __cstr_1, mask.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt {
    val __cstr_1 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    try {
        return LibcDynamicFfi.invoke("regcomp", -1, longArrayOf(preg?.value ?: 0L, __cstr_1, cflags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt {
    val __cstr_1 = if (input == null) 0L else LibcDynamicFfi.allocUtf8CString(input)
    try {
        return LibcDynamicFfi.invoke("regexec", -1, longArrayOf(preg?.value ?: 0L, __cstr_1, nmatch.toLong(), pmatch?.value ?: 0L, eflags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT {
    return LibcDynamicFfi.invoke("regerror", -1, longArrayOf(errcode.toLong(), preg?.value ?: 0L, errbuf?.value ?: 0L, errbufSize.toLong())).toULong()
}

public fun regfree(preg: RegexT?) {
    LibcDynamicFfi.invoke("regfree", -1, longArrayOf(preg?.value ?: 0L))
}

public fun androidSetAbortMessage(msg: String?) {
    val __cstr_0 = if (msg == null) 0L else LibcDynamicFfi.allocUtf8CString(msg)
    try {
        LibcDynamicFfi.invoke("android_set_abort_message", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun gettid(): PidT {
    return LibcDynamicFfi.invoke("gettid", -1, longArrayOf()).toInt()
}

public fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("tgkill", -1, longArrayOf(tgid.toLong(), tid.toLong(), sig.toLong())).toInt()
}

public fun getauxval(type: CUlong): CUlong {
    return LibcDynamicFfi.invoke("getauxval", -1, longArrayOf(type.toLong())).toULong()
}

/**
 * Only available in API Version 28+
 */
public fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("getrandom", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong(), flags.toLong()))
}

public fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("getentropy", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun systemPropertySet(name: String?, value: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __cstr_1 = if (value == null) 0L else LibcDynamicFfi.allocUtf8CString(value)
    try {
        return LibcDynamicFfi.invoke("__system_property_set", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun systemPropertyGet(name: String?, value: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("__system_property_get", -1, longArrayOf(__cstr_0, value?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun systemPropertyFind(name: String?): PropInfo? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("__system_property_find", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun systemPropertyFindNth(n: CUint): PropInfo? {
    val rawRet = LibcDynamicFfi.invoke("__system_property_find_nth", -1, longArrayOf(n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: COpaquePointer?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("__system_property_foreach", -1, longArrayOf(__scratch_0, cookie?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

// #include <link.h>
/**
 * Only available in API Version 21+
 */
public fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dl_iterate_phdr", -1, longArrayOf(callback?.value ?: 0L, data?.value ?: 0L)).toInt()
}

public fun arc4random(): UInt {
    return LibcDynamicFfi.invoke("arc4random", -1, longArrayOf()).toUInt()
}

public fun arc4randomUniform(upperBound: UInt): UInt {
    return LibcDynamicFfi.invoke("arc4random_uniform", -1, longArrayOf(upperBound.toLong())).toUInt()
}

public fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    LibcDynamicFfi.invoke("arc4random_buf", -1, longArrayOf(buf?.value ?: 0L, n.toLong()))
}

public fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("reallocarray", -1, longArrayOf(ptr?.value ?: 0L, nmemb.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun dirname(path: String?): COpaquePointer? {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        val rawRet = LibcDynamicFfi.invoke("dirname", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun basename(path: String?): COpaquePointer? {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        val rawRet = LibcDynamicFfi.invoke("basename", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt {
    val __cstr_2 = if (optstring == null) 0L else LibcDynamicFfi.allocUtf8CString(optstring)
    val __slot_4 = if (longindex == null) 0L else LibcDynamicFfi.allocScalarSlot(longindex.toLong())
    try {
        return LibcDynamicFfi.invoke("getopt_long", -1, longArrayOf(argc.toLong(), argv?.value ?: 0L, __cstr_2, longopts?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun sync() {
    LibcDynamicFfi.invoke("sync", -1, longArrayOf())
}

public fun syncfs(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("syncfs", -1, longArrayOf(fd.toLong())).toInt()
}

public fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmem", -1, longArrayOf(haystack?.value ?: 0L, haystacklen.toLong(), needle?.value ?: 0L, needlelen.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fread_unlocked", -1, longArrayOf(buf?.value ?: 0L, size.toLong(), nobj.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun fwriteUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fwrite_unlocked", -1, longArrayOf(buf?.value ?: 0L, size.toLong(), nobj.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun fflushUnlocked(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fflush_unlocked", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun fgetsUnlocked(buf: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("fgets_unlocked", -1, longArrayOf(buf?.value ?: 0L, size.toLong(), stream?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt {
    return LibcDynamicFfi.invoke("klogctl", -1, longArrayOf(syslogType.toLong(), bufp?.value ?: 0L, len.toLong())).toInt()
}

public fun memfdCreate(name: String?, flags: CUint): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("memfd_create", -1, longArrayOf(__cstr_0, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_3 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("renameat2", -1, longArrayOf(olddirfd.toLong(), __cstr_1, newdirfd.toLong(), __cstr_3, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun SiginfoT.siAddr(): COpaquePointer? {
    open class SiginfoSigfault(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var siAddr: COpaquePointer?,
    )
    return (((this as SiginfoT?) as SiginfoSigfault?)).siAddr
}

public fun SiginfoT.siValue(): Sigval {
    open class SiginfoTimer(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var siTid: CInt,
        public var siOverrun: CInt,
        public var siSigval: Sigval,
    )
    return (((this as SiginfoT?) as SiginfoTimer?)).siSigval
}

public fun SiginfoT.sifields(): Sifields {
    return (((this as SiginfoT?) as SiginfoF?)).sifields
}

public fun SiginfoT.siPid(): PidT {
    return this.sifields().sigchld.siPid
}

public fun SiginfoT.siUid(): UidT {
    return this.sifields().sigchld.siUid
}

public fun SiginfoT.siStatus(): CInt {
    return this.sifields().sigchld.siStatus
}

public fun SiginfoT.siUtime(): CLong {
    return this.sifields().sigchld.siUtime
}

public fun SiginfoT.siStime(): CLong {
    return this.sifields().sigchld.siStime
}
