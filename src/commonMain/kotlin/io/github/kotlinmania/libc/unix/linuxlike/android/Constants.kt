// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.LC_COLLATE_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_CTYPE_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_MESSAGES_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_MONETARY_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_NUMERIC_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_TIME_MASK
import io.github.kotlinmania.libc.unix.linuxlike.O_DIRECTORY

public const val MADV_SOFT_OFFLINE: Int = 101

public const val MS_NOUSER: ULong = 0xffffffff80000000uL

public const val MS_RMT_MASK: ULong = 0x02800051uL

public const val O_TRUNC: Int = 512

public const val O_CLOEXEC: Int = 0x80000

public const val O_PATH: Int = 2097152

public const val O_NOATIME: Int = 262144

public const val EBFONT: Int = 59

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

public const val EDOTDOT: Int = 73

public const val EPOLL_CLOEXEC: Int = 0x80000

public const val EFD_SEMAPHORE: Int = 0x1

public const val EFD_CLOEXEC: Int = O_CLOEXEC

public val EFD_NONBLOCK: Int = O_NONBLOCK

public const val TFD_CLOEXEC: Int = O_CLOEXEC

public val TFD_NONBLOCK: Int = O_NONBLOCK

public const val TFD_TIMER_ABSTIME: Int = 1

public const val TFD_TIMER_CANCEL_ON_SET: Int = 2

public const val USER_PROCESS: Short = 7

public const val _POSIX_VDISABLE: UByte = 0u

public const val FALLOC_FL_KEEP_SIZE: Int = 0x01

public const val FALLOC_FL_PUNCH_HOLE: Int = 0x02

public const val FALLOC_FL_NO_HIDE_STALE: Int = 0x04

public const val FALLOC_FL_COLLAPSE_RANGE: Int = 0x08

public const val FALLOC_FL_ZERO_RANGE: Int = 0x10

public const val FALLOC_FL_INSERT_RANGE: Int = 0x20

public const val FALLOC_FL_UNSHARE_RANGE: Int = 0x40

public const val BUFSIZ: UInt = 1024u

public const val FILENAME_MAX: UInt = 4096u

public const val FOPEN_MAX: UInt = 20u

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val L_tmpnam: UInt = 4096u

public const val TMP_MAX: UInt = 308915776u

public const val _PC_LINK_MAX: Int = 1

public const val _PC_MAX_CANON: Int = 2

public const val _PC_MAX_INPUT: Int = 3

public const val _PC_NAME_MAX: Int = 4

public const val _PC_PATH_MAX: Int = 5

public const val _PC_PIPE_BUF: Int = 6

public const val _PC_2_SYMLINKS: Int = 7

public const val _PC_ALLOC_SIZE_MIN: Int = 8

public const val _PC_REC_INCR_XFER_SIZE: Int = 9

public const val _PC_REC_MAX_XFER_SIZE: Int = 10

public const val _PC_REC_MIN_XFER_SIZE: Int = 11

public const val _PC_REC_XFER_ALIGN: Int = 12

public const val _PC_SYMLINK_MAX: Int = 13

public const val _PC_CHOWN_RESTRICTED: Int = 14

public const val _PC_NO_TRUNC: Int = 15

public const val _PC_VDISABLE: Int = 16

public const val _PC_ASYNC_IO: Int = 17

public const val _PC_PRIO_IO: Int = 18

public const val _PC_SYNC_IO: Int = 19

public const val FIONBIO: Int = 0x5421

public const val _SC_ARG_MAX: Int = 0x0000

public const val _SC_BC_BASE_MAX: Int = 0x0001

public const val _SC_BC_DIM_MAX: Int = 0x0002

public const val _SC_BC_SCALE_MAX: Int = 0x0003

public const val _SC_BC_STRING_MAX: Int = 0x0004

public const val _SC_CHILD_MAX: Int = 0x0005

public const val _SC_CLK_TCK: Int = 0x0006

public const val _SC_COLL_WEIGHTS_MAX: Int = 0x0007

public const val _SC_EXPR_NEST_MAX: Int = 0x0008

public const val _SC_LINE_MAX: Int = 0x0009

public const val _SC_NGROUPS_MAX: Int = 0x000a

public const val _SC_OPEN_MAX: Int = 0x000b

public const val _SC_PASS_MAX: Int = 0x000c

public const val _SC_2_C_BIND: Int = 0x000d

public const val _SC_2_C_DEV: Int = 0x000e

public const val _SC_2_C_VERSION: Int = 0x000f

public const val _SC_2_CHAR_TERM: Int = 0x0010

public const val _SC_2_FORT_DEV: Int = 0x0011

public const val _SC_2_FORT_RUN: Int = 0x0012

public const val _SC_2_LOCALEDEF: Int = 0x0013

public const val _SC_2_SW_DEV: Int = 0x0014

public const val _SC_2_UPE: Int = 0x0015

public const val _SC_2_VERSION: Int = 0x0016

public const val _SC_JOB_CONTROL: Int = 0x0017

public const val _SC_SAVED_IDS: Int = 0x0018

public const val _SC_VERSION: Int = 0x0019

public const val _SC_RE_DUP_MAX: Int = 0x001a

public const val _SC_STREAM_MAX: Int = 0x001b

public const val _SC_TZNAME_MAX: Int = 0x001c

public const val _SC_XOPEN_CRYPT: Int = 0x001d

public const val _SC_XOPEN_ENH_I18N: Int = 0x001e

public const val _SC_XOPEN_SHM: Int = 0x001f

public const val _SC_XOPEN_VERSION: Int = 0x0020

public const val _SC_XOPEN_XCU_VERSION: Int = 0x0021

public const val _SC_XOPEN_REALTIME: Int = 0x0022

public const val _SC_XOPEN_REALTIME_THREADS: Int = 0x0023

public const val _SC_XOPEN_LEGACY: Int = 0x0024

public const val _SC_ATEXIT_MAX: Int = 0x0025

public const val _SC_IOV_MAX: Int = 0x0026

public const val _SC_UIO_MAXIOV: Int = _SC_IOV_MAX

public const val _SC_PAGESIZE: Int = 0x0027

public const val _SC_PAGE_SIZE: Int = 0x0028

public const val _SC_XOPEN_UNIX: Int = 0x0029

public const val _SC_XBS5_ILP32_OFF32: Int = 0x002a

public const val _SC_XBS5_ILP32_OFFBIG: Int = 0x002b

public const val _SC_XBS5_LP64_OFF64: Int = 0x002c

public const val _SC_XBS5_LPBIG_OFFBIG: Int = 0x002d

public const val _SC_AIO_LISTIO_MAX: Int = 0x002e

public const val _SC_AIO_MAX: Int = 0x002f

public const val _SC_AIO_PRIO_DELTA_MAX: Int = 0x0030

public const val _SC_DELAYTIMER_MAX: Int = 0x0031

public const val _SC_MQ_OPEN_MAX: Int = 0x0032

public const val _SC_MQ_PRIO_MAX: Int = 0x0033

public const val _SC_RTSIG_MAX: Int = 0x0034

public const val _SC_SEM_NSEMS_MAX: Int = 0x0035

public const val _SC_SEM_VALUE_MAX: Int = 0x0036

public const val _SC_SIGQUEUE_MAX: Int = 0x0037

public const val _SC_TIMER_MAX: Int = 0x0038

public const val _SC_ASYNCHRONOUS_IO: Int = 0x0039

public const val _SC_FSYNC: Int = 0x003a

public const val _SC_MAPPED_FILES: Int = 0x003b

public const val _SC_MEMLOCK: Int = 0x003c

public const val _SC_MEMLOCK_RANGE: Int = 0x003d

public const val _SC_MEMORY_PROTECTION: Int = 0x003e

public const val _SC_MESSAGE_PASSING: Int = 0x003f

public const val _SC_PRIORITIZED_IO: Int = 0x0040

public const val _SC_PRIORITY_SCHEDULING: Int = 0x0041

public const val _SC_REALTIME_SIGNALS: Int = 0x0042

public const val _SC_SEMAPHORES: Int = 0x0043

public const val _SC_SHARED_MEMORY_OBJECTS: Int = 0x0044

public const val _SC_SYNCHRONIZED_IO: Int = 0x0045

public const val _SC_TIMERS: Int = 0x0046

public const val _SC_GETGR_R_SIZE_MAX: Int = 0x0047

public const val _SC_GETPW_R_SIZE_MAX: Int = 0x0048

public const val _SC_LOGIN_NAME_MAX: Int = 0x0049

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 0x004a

public const val _SC_THREAD_KEYS_MAX: Int = 0x004b

public const val _SC_THREAD_STACK_MIN: Int = 0x004c

public const val _SC_THREAD_THREADS_MAX: Int = 0x004d

public const val _SC_TTY_NAME_MAX: Int = 0x004e

public const val _SC_THREADS: Int = 0x004f

public const val _SC_THREAD_ATTR_STACKADDR: Int = 0x0050

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 0x0051

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 0x0052

public const val _SC_THREAD_PRIO_INHERIT: Int = 0x0053

public const val _SC_THREAD_PRIO_PROTECT: Int = 0x0054

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 0x0055

public const val _SC_NPROCESSORS_CONF: Int = 0x0060

public const val _SC_NPROCESSORS_ONLN: Int = 0x0061

public const val _SC_PHYS_PAGES: Int = 0x0062

public const val _SC_AVPHYS_PAGES: Int = 0x0063

public const val _SC_MONOTONIC_CLOCK: Int = 0x0064

public const val _SC_2_PBS: Int = 0x0065

public const val _SC_2_PBS_ACCOUNTING: Int = 0x0066

public const val _SC_2_PBS_CHECKPOINT: Int = 0x0067

public const val _SC_2_PBS_LOCATE: Int = 0x0068

public const val _SC_2_PBS_MESSAGE: Int = 0x0069

public const val _SC_2_PBS_TRACK: Int = 0x006a

public const val _SC_ADVISORY_INFO: Int = 0x006b

public const val _SC_BARRIERS: Int = 0x006c

public const val _SC_CLOCK_SELECTION: Int = 0x006d

public const val _SC_CPUTIME: Int = 0x006e

public const val _SC_HOST_NAME_MAX: Int = 0x006f

public const val _SC_IPV6: Int = 0x0070

public const val _SC_RAW_SOCKETS: Int = 0x0071

public const val _SC_READER_WRITER_LOCKS: Int = 0x0072

public const val _SC_REGEXP: Int = 0x0073

public const val _SC_SHELL: Int = 0x0074

public const val _SC_SPAWN: Int = 0x0075

public const val _SC_SPIN_LOCKS: Int = 0x0076

public const val _SC_SPORADIC_SERVER: Int = 0x0077

public const val _SC_SS_REPL_MAX: Int = 0x0078

public const val _SC_SYMLOOP_MAX: Int = 0x0079

public const val _SC_THREAD_CPUTIME: Int = 0x007a

public const val _SC_THREAD_PROCESS_SHARED: Int = 0x007b

public const val _SC_THREAD_ROBUST_PRIO_INHERIT: Int = 0x007c

public const val _SC_THREAD_ROBUST_PRIO_PROTECT: Int = 0x007d

public const val _SC_THREAD_SPORADIC_SERVER: Int = 0x007e

public const val _SC_TIMEOUTS: Int = 0x007f

public const val _SC_TRACE: Int = 0x0080

public const val _SC_TRACE_EVENT_FILTER: Int = 0x0081

public const val _SC_TRACE_EVENT_NAME_MAX: Int = 0x0082

public const val _SC_TRACE_INHERIT: Int = 0x0083

public const val _SC_TRACE_LOG: Int = 0x0084

public const val _SC_TRACE_NAME_MAX: Int = 0x0085

public const val _SC_TRACE_SYS_MAX: Int = 0x0086

public const val _SC_TRACE_USER_EVENT_MAX: Int = 0x0087

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 0x0088

public const val _SC_V7_ILP32_OFF32: Int = 0x0089

public const val _SC_V7_ILP32_OFFBIG: Int = 0x008a

public const val _SC_V7_LP64_OFF64: Int = 0x008b

public const val _SC_V7_LPBIG_OFFBIG: Int = 0x008c

public const val _SC_XOPEN_STREAMS: Int = 0x008d

public const val _SC_XOPEN_UUCP: Int = 0x008e

public const val _SC_LEVEL1_ICACHE_SIZE: Int = 0x008f

public const val _SC_LEVEL1_ICACHE_ASSOC: Int = 0x0090

public const val _SC_LEVEL1_ICACHE_LINESIZE: Int = 0x0091

public const val _SC_LEVEL1_DCACHE_SIZE: Int = 0x0092

public const val _SC_LEVEL1_DCACHE_ASSOC: Int = 0x0093

public const val _SC_LEVEL1_DCACHE_LINESIZE: Int = 0x0094

public const val _SC_LEVEL2_CACHE_SIZE: Int = 0x0095

public const val _SC_LEVEL2_CACHE_ASSOC: Int = 0x0096

public const val _SC_LEVEL2_CACHE_LINESIZE: Int = 0x0097

public const val _SC_LEVEL3_CACHE_SIZE: Int = 0x0098

public const val _SC_LEVEL3_CACHE_ASSOC: Int = 0x0099

public const val _SC_LEVEL3_CACHE_LINESIZE: Int = 0x009a

public const val _SC_LEVEL4_CACHE_SIZE: Int = 0x009b

public const val _SC_LEVEL4_CACHE_ASSOC: Int = 0x009c

public const val _SC_LEVEL4_CACHE_LINESIZE: Int = 0x009d

public const val F_LOCK: Int = 1

public const val F_TEST: Int = 3

public const val F_TLOCK: Int = 2

public const val F_ULOCK: Int = 0

public const val F_SEAL_FUTURE_WRITE: Int = 0x0010

public const val F_SEAL_EXEC: Int = 0x0020

public const val IFF_LOWER_UP: Int = 0x10000

public const val IFF_DORMANT: Int = 0x20000

public const val IFF_ECHO: Int = 0x40000

public const val PTHREAD_BARRIER_SERIAL_THREAD: Int = -1

public const val PTHREAD_MUTEX_NORMAL: Int = 0

public const val PTHREAD_MUTEX_RECURSIVE: Int = 1

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 2

public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL

public const val PTHREAD_EXPLICIT_SCHED: Int = 0

public const val PTHREAD_INHERIT_SCHED: Int = 1

public const val RENAME_NOREPLACE: Int = 1

public const val RENAME_EXCHANGE: Int = 2

public const val RENAME_WHITEOUT: Int = 4

public const val FIOCLEX: Int = 0x5451

public const val FIONCLEX: Int = 0x5450

public const val SIGCHLD: Int = 17

public const val SIGBUS: Int = 7

public const val SIGUSR1: Int = 10

public const val SIGUSR2: Int = 12

public const val SIGCONT: Int = 18

public const val SIGSTOP: Int = 19

public const val SIGTSTP: Int = 20

public const val SIGURG: Int = 23

public const val SIGIO: Int = 29

public const val SIGSYS: Int = 31

public const val SIGSTKFLT: Int = 16

public const val SIGUNUSED: Int = 31

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGPOLL: Int = 29

public const val SIGPWR: Int = 30

public const val SIG_SETMASK: Int = 2

public const val SIG_BLOCK: Int = 0x000000

public const val SIG_UNBLOCK: Int = 0x01

public const val RUSAGE_CHILDREN: Int = -1

public const val LC_PAPER: Int = 7

public const val LC_NAME: Int = 8

public const val LC_ADDRESS: Int = 9

public const val LC_TELEPHONE: Int = 10

public const val LC_MEASUREMENT: Int = 11

public const val LC_IDENTIFICATION: Int = 12

public val LC_PAPER_MASK: Int = 1 shl LC_PAPER

public val LC_NAME_MASK: Int = 1 shl LC_NAME

public val LC_ADDRESS_MASK: Int = 1 shl LC_ADDRESS

public val LC_TELEPHONE_MASK: Int = 1 shl LC_TELEPHONE

public val LC_MEASUREMENT_MASK: Int = 1 shl LC_MEASUREMENT

public val LC_IDENTIFICATION_MASK: Int = 1 shl LC_IDENTIFICATION

public val LC_ALL_MASK: Int = LC_CTYPE_MASK.or(LC_NUMERIC_MASK) or LC_TIME_MASK.or(LC_COLLATE_MASK) or LC_MONETARY_MASK.or(LC_MESSAGES_MASK) or LC_PAPER_MASK.or(LC_NAME_MASK) or LC_ADDRESS_MASK.or(LC_TELEPHONE_MASK) or LC_MEASUREMENT_MASK.or(LC_IDENTIFICATION_MASK)

public const val MAP_ANON: Int = 0x0020

public const val MAP_ANONYMOUS: Int = 0x0020

public const val MAP_GROWSDOWN: Int = 0x0100

public const val MAP_DENYWRITE: Int = 0x0800

public const val MAP_EXECUTABLE: Int = 0x01000

public const val MAP_LOCKED: Int = 0x02000

public const val MAP_NORESERVE: Int = 0x04000

public const val MAP_POPULATE: Int = 0x08000

public const val MAP_NONBLOCK: Int = 0x010000

public const val MAP_STACK: Int = 0x020000

public const val EDEADLK: Int = 35

public const val ENAMETOOLONG: Int = 36

public const val ENOLCK: Int = 37

public const val ENOSYS: Int = 38

public const val ENOTEMPTY: Int = 39

public const val ELOOP: Int = 40

public const val ENOMSG: Int = 42

public const val EIDRM: Int = 43

public const val ECHRNG: Int = 44

public const val EL2NSYNC: Int = 45

public const val EL3HLT: Int = 46

public const val EL3RST: Int = 47

public const val ELNRNG: Int = 48

public const val EUNATCH: Int = 49

public const val ENOCSI: Int = 50

public const val EL2HLT: Int = 51

public const val EBADE: Int = 52

public const val EBADR: Int = 53

public const val EXFULL: Int = 54

public const val ENOANO: Int = 55

public const val EBADRQC: Int = 56

public const val EBADSLT: Int = 57

public const val EMULTIHOP: Int = 72

public const val EBADMSG: Int = 74

public const val EOVERFLOW: Int = 75

public const val ENOTUNIQ: Int = 76

public const val EBADFD: Int = 77

public const val EREMCHG: Int = 78

public const val ELIBACC: Int = 79

public const val ELIBBAD: Int = 80

public const val ELIBSCN: Int = 81

public const val ELIBMAX: Int = 82

public const val ELIBEXEC: Int = 83

public const val EILSEQ: Int = 84

public const val ERESTART: Int = 85

public const val ESTRPIPE: Int = 86

public const val EUSERS: Int = 87

public const val ENOTSOCK: Int = 88

public const val EDESTADDRREQ: Int = 89

public const val EMSGSIZE: Int = 90

public const val EPROTOTYPE: Int = 91

public const val ENOPROTOOPT: Int = 92

public const val EPROTONOSUPPORT: Int = 93

public const val ESOCKTNOSUPPORT: Int = 94

public const val EOPNOTSUPP: Int = 95

public const val ENOTSUP: Int = EOPNOTSUPP

public const val EPFNOSUPPORT: Int = 96

public const val EAFNOSUPPORT: Int = 97

public const val EADDRINUSE: Int = 98

public const val EADDRNOTAVAIL: Int = 99

public const val ENETDOWN: Int = 100

public const val ENETUNREACH: Int = 101

public const val ENETRESET: Int = 102

public const val ECONNABORTED: Int = 103

public const val ECONNRESET: Int = 104

public const val ENOBUFS: Int = 105

public const val EISCONN: Int = 106

public const val ENOTCONN: Int = 107

public const val ESHUTDOWN: Int = 108

public const val ETOOMANYREFS: Int = 109

public const val ETIMEDOUT: Int = 110

public const val ECONNREFUSED: Int = 111

public const val EHOSTDOWN: Int = 112

public const val EHOSTUNREACH: Int = 113

public const val EALREADY: Int = 114

public const val EINPROGRESS: Int = 115

public const val ESTALE: Int = 116

public const val EUCLEAN: Int = 117

public const val ENOTNAM: Int = 118

public const val ENAVAIL: Int = 119

public const val EISNAM: Int = 120

public const val EREMOTEIO: Int = 121

public const val EDQUOT: Int = 122

public const val ENOMEDIUM: Int = 123

public const val EMEDIUMTYPE: Int = 124

public const val ECANCELED: Int = 125

public const val ENOKEY: Int = 126

public const val EKEYEXPIRED: Int = 127

public const val EKEYREVOKED: Int = 128

public const val EKEYREJECTED: Int = 129

public const val EOWNERDEAD: Int = 130

public const val ENOTRECOVERABLE: Int = 131

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_SEQPACKET: Int = 5

public const val SOCK_DCCP: Int = 6

public const val SOCK_PACKET: Int = 10

public const val IPPROTO_MAX: Int = 256

public const val SOL_SOCKET: Int = 1

public const val SOL_SCTP: Int = 132

public const val SOL_IPX: Int = 256

public const val SOL_AX25: Int = 257

public const val SOL_ATALK: Int = 258

public const val SOL_NETROM: Int = 259

public const val SOL_ROSE: Int = 260

public const val UDP_CORK: Int = 1

public const val UDP_ENCAP: Int = 100

public const val UDP_NO_CHECK6_TX: Int = 101

public const val UDP_NO_CHECK6_RX: Int = 102

public const val UDP_SEGMENT: Int = 103

public const val UDP_GRO: Int = 104

public const val DCCP_SOCKOPT_PACKET_SIZE: Int = 1

public const val DCCP_SOCKOPT_SERVICE: Int = 2

public const val DCCP_SOCKOPT_CHANGE_L: Int = 3

public const val DCCP_SOCKOPT_CHANGE_R: Int = 4

public const val DCCP_SOCKOPT_GET_CUR_MPS: Int = 5

public const val DCCP_SOCKOPT_SERVER_TIMEWAIT: Int = 6

public const val DCCP_SOCKOPT_SEND_CSCOV: Int = 10

public const val DCCP_SOCKOPT_RECV_CSCOV: Int = 11

public const val DCCP_SOCKOPT_AVAILABLE_CCIDS: Int = 12

public const val DCCP_SOCKOPT_CCID: Int = 13

public const val DCCP_SOCKOPT_TX_CCID: Int = 14

public const val DCCP_SOCKOPT_RX_CCID: Int = 15

public const val DCCP_SOCKOPT_QPOLICY_ID: Int = 16

public const val DCCP_SOCKOPT_QPOLICY_TXQLEN: Int = 17

public const val DCCP_SOCKOPT_CCID_RX_INFO: Int = 128

public const val DCCP_SOCKOPT_CCID_TX_INFO: Int = 192

public const val DCCP_SERVICE_LIST_MAX_LEN: Int = 32

public const val SO_REUSEADDR: Int = 2

public const val SO_TYPE: Int = 3

public const val SO_ERROR: Int = 4

public const val SO_DONTROUTE: Int = 5

public const val SO_BROADCAST: Int = 6

public const val SO_SNDBUF: Int = 7

public const val SO_RCVBUF: Int = 8

public const val SO_KEEPALIVE: Int = 9

public const val SO_OOBINLINE: Int = 10

public const val SO_PRIORITY: Int = 12

public const val SO_LINGER: Int = 13

public const val SO_BSDCOMPAT: Int = 14

public const val SO_REUSEPORT: Int = 15

public const val SO_PASSCRED: Int = 16

public const val SO_PEERCRED: Int = 17

public const val SO_RCVLOWAT: Int = 18

public const val SO_SNDLOWAT: Int = 19

public const val SO_RCVTIMEO: Int = 20

public const val SO_SNDTIMEO: Int = 21

public const val SO_BINDTODEVICE: Int = 25

public const val SO_ATTACH_FILTER: Int = 26

public const val SO_DETACH_FILTER: Int = 27

public const val SO_GET_FILTER: Int = SO_ATTACH_FILTER

public const val SO_TIMESTAMP: Int = 29

public const val SO_ACCEPTCONN: Int = 30

public const val SO_PEERSEC: Int = 31

public const val SO_SNDBUFFORCE: Int = 32

public const val SO_RCVBUFFORCE: Int = 33

public const val SO_PASSSEC: Int = 34

public const val SO_TIMESTAMPNS: Int = 35

public const val SO_TIMESTAMPNS_OLD: Int = 35

public const val SO_MARK: Int = 36

public const val SO_TIMESTAMPING: Int = 37

public const val SO_TIMESTAMPING_OLD: Int = 37

public const val SO_PROTOCOL: Int = 38

public const val SO_DOMAIN: Int = 39

public const val SO_RXQ_OVFL: Int = 40

public const val SO_PEEK_OFF: Int = 42

public const val SO_BUSY_POLL: Int = 46

public const val SCM_TIMESTAMPING_OPT_STATS: Int = 54

public const val SCM_TIMESTAMPING_PKTINFO: Int = 58

public const val SO_BINDTOIFINDEX: Int = 62

public const val SO_TIMESTAMP_NEW: Int = 63

public const val SO_TIMESTAMPNS_NEW: Int = 64

public const val SO_TIMESTAMPING_NEW: Int = 65

public const val SCM_TIMESTAMP: Int = SO_TIMESTAMP

public const val SCM_TIMESTAMPNS: Int = SO_TIMESTAMPNS

public const val SCM_TIMESTAMPING: Int = SO_TIMESTAMPING

public val IPTOS_ECN_NOTECT: UByte = (0x00).toUByte()

public const val O_ACCMODE: Int = 3

public const val O_APPEND: Int = 1024

public const val O_CREAT: Int = 64

public const val O_EXCL: Int = 128

public const val O_NOCTTY: Int = 256

public const val O_NONBLOCK: Int = 2048

public const val O_SYNC: Int = 0x101000

public const val O_ASYNC: Int = 0x2000

public const val O_NDELAY: Int = 0x800

public const val O_DSYNC: Int = 4096

public const val O_RSYNC: Int = O_SYNC

public const val NI_MAXHOST: ULong = 1025uL

public const val NI_MAXSERV: ULong = 32uL

public const val NI_NOFQDN: Int = 0x00000001

public const val NI_NUMERICHOST: Int = 0x00000002

public const val NI_NAMEREQD: Int = 0x00000004

public const val NI_NUMERICSERV: Int = 0x00000008

public const val NI_DGRAM: Int = 0x00000010

public const val NCCS: ULong = 19uL

public const val TCSBRKP: Int = 0x5425

public const val TCSANOW: Int = 0

public const val TCSADRAIN: Int = 0x1

public const val TCSAFLUSH: Int = 0x2

public const val VEOF: ULong = 4uL

public const val VEOL: ULong = 11uL

public const val VEOL2: ULong = 16uL

public const val VMIN: ULong = 6uL

public const val IEXTEN: UInt = 0x00008000u

public const val TOSTOP: UInt = 0x00000100u

public const val FLUSHO: UInt = 0x00001000u

public const val EXTPROC: UInt = 65536u

public const val MAP_HUGETLB: Int = 0x040000

public const val PTRACE_TRACEME: Int = 0

public const val PTRACE_PEEKTEXT: Int = 1

public const val PTRACE_PEEKDATA: Int = 2

public const val PTRACE_PEEKUSER: Int = 3

public const val PTRACE_POKETEXT: Int = 4

public const val PTRACE_POKEDATA: Int = 5

public const val PTRACE_POKEUSER: Int = 6

public const val PTRACE_CONT: Int = 7

public const val PTRACE_KILL: Int = 8

public const val PTRACE_SINGLESTEP: Int = 9

public const val PTRACE_GETREGS: Int = 12

public const val PTRACE_SETREGS: Int = 13

public const val PTRACE_ATTACH: Int = 16

public const val PTRACE_DETACH: Int = 17

public const val PTRACE_SYSCALL: Int = 24

public const val PTRACE_SETOPTIONS: Int = 0x4200

public const val PTRACE_GETEVENTMSG: Int = 0x4201

public const val PTRACE_GETSIGINFO: Int = 0x4202

public const val PTRACE_SETSIGINFO: Int = 0x4203

public const val PTRACE_GETREGSET: Int = 0x4204

public const val PTRACE_SETREGSET: Int = 0x4205

public const val PTRACE_SECCOMP_GET_METADATA: Int = 0x420d

public const val PTRACE_EVENT_STOP: Int = 128

public const val F_GETLK: Int = 5

public const val F_GETOWN: Int = 9

public const val F_SETOWN: Int = 8

public const val F_SETLK: Int = 6

public const val F_SETLKW: Int = 7

public const val F_RDLCK: Int = 0

public const val F_WRLCK: Int = 1

public const val F_UNLCK: Int = 2

public const val F_OFD_GETLK: Int = 36

public const val F_OFD_SETLK: Int = 37

public const val F_OFD_SETLKW: Int = 38

public const val RLIMIT_CPU: Int = 0

public const val RLIMIT_FSIZE: Int = 1

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_STACK: Int = 3

public const val RLIMIT_CORE: Int = 4

public const val RLIMIT_RSS: Int = 5

public const val RLIMIT_NPROC: Int = 6

public const val RLIMIT_NOFILE: Int = 7

public const val RLIMIT_MEMLOCK: Int = 8

public const val RLIMIT_AS: Int = 9

public const val RLIMIT_LOCKS: Int = 10

public const val RLIMIT_SIGPENDING: Int = 11

public const val RLIMIT_MSGQUEUE: Int = 12

public const val RLIMIT_NICE: Int = 13

public const val RLIMIT_RTPRIO: Int = 14

public const val RLIM_NLIMITS: Int = 16

public val RLIM_INFINITY: ULong = 0uL.inv()

public const val TCGETS: Int = 0x5401

public const val TCSETS: Int = 0x5402

public const val TCSETSW: Int = 0x5403

public const val TCSETSF: Int = 0x5404

public const val TCGETS2: Int = 0x802c542a.toInt()

public const val TCSETS2: Int = 0x402c542b

public const val TCSETSW2: Int = 0x402c542c

public const val TCSETSF2: Int = 0x402c542d

public const val TCGETA: Int = 0x5405

public const val TCSETA: Int = 0x5406

public const val TCSETAW: Int = 0x5407

public const val TCSETAF: Int = 0x5408

public const val TCSBRK: Int = 0x5409

public const val TCXONC: Int = 0x540A

public const val TCFLSH: Int = 0x540B

public const val TIOCGSOFTCAR: Int = 0x5419

public const val TIOCSSOFTCAR: Int = 0x541A

public const val TIOCINQ: Int = 0x541B

public const val TIOCLINUX: Int = 0x541C

public const val TIOCGSERIAL: Int = 0x541E

public const val TIOCEXCL: Int = 0x540C

public const val TIOCNXCL: Int = 0x540D

public const val TIOCSCTTY: Int = 0x540E

public const val TIOCGPGRP: Int = 0x540F

public const val TIOCSPGRP: Int = 0x5410

public const val TIOCOUTQ: Int = 0x5411

public const val TIOCSTI: Int = 0x5412

public const val TIOCGWINSZ: Int = 0x5413

public const val TIOCSWINSZ: Int = 0x5414

public const val TIOCMGET: Int = 0x5415

public const val TIOCMBIS: Int = 0x5416

public const val TIOCMBIC: Int = 0x5417

public const val TIOCMSET: Int = 0x5418

public const val FIONREAD: Int = 0x541B

public const val TIOCCONS: Int = 0x541D

public const val TIOCSBRK: Int = 0x5427

public const val TIOCCBRK: Int = 0x5428

public const val ST_RDONLY: ULong = 1uL

public const val ST_NOSUID: ULong = 2uL

public const val ST_NODEV: ULong = 4uL

public const val ST_NOEXEC: ULong = 8uL

public const val ST_SYNCHRONOUS: ULong = 16uL

public const val ST_MANDLOCK: ULong = 64uL

public const val ST_NOATIME: ULong = 1024uL

public const val ST_NODIRATIME: ULong = 2048uL

public const val ST_RELATIME: ULong = 4096uL

public const val RTLD_NOLOAD: Int = 0x4

public const val RTLD_NODELETE: Int = 0x1000

public const val AI_PASSIVE: Int = 0x00000001

public const val AI_CANONNAME: Int = 0x00000002

public const val AI_NUMERICHOST: Int = 0x00000004

public const val AI_NUMERICSERV: Int = 0x00000008

public const val AI_ALL: Int = 0x00000100

public const val AI_V4MAPPED_CFG: Int = 0x00000200

public const val AI_ADDRCONFIG: Int = 0x00000400

public const val AI_V4MAPPED: Int = 0x00000800

public val AI_DEFAULT: Int = AI_V4MAPPED_CFG or AI_ADDRCONFIG

public const val KEXEC_ON_CRASH: Int = 0x00000001

public const val KEXEC_PRESERVE_CONTEXT: Int = 0x00000002

public const val KEXEC_ARCH_MASK: Int = 0xffff0000.toInt()

public const val KEXEC_FILE_UNLOAD: Int = 0x00000001

public const val KEXEC_FILE_ON_CRASH: Int = 0x00000002

public const val KEXEC_FILE_NO_INITRAMFS: Int = 0x00000004

public const val LINUX_REBOOT_MAGIC1: Int = 0xfee1dead.toInt()

public const val LINUX_REBOOT_MAGIC2: Int = 672274793

public const val LINUX_REBOOT_MAGIC2A: Int = 85072278

public const val LINUX_REBOOT_MAGIC2B: Int = 369367448

public const val LINUX_REBOOT_MAGIC2C: Int = 537993216

public const val LINUX_REBOOT_CMD_RESTART: Int = 0x01234567

public const val LINUX_REBOOT_CMD_HALT: Int = 0xCDEF0123.toInt()

public const val LINUX_REBOOT_CMD_CAD_ON: Int = 0x89ABCDEF.toInt()

public const val LINUX_REBOOT_CMD_CAD_OFF: Int = 0x00000000

public const val LINUX_REBOOT_CMD_POWER_OFF: Int = 0x4321FEDC

public const val LINUX_REBOOT_CMD_RESTART2: Int = 0xA1B2C3D4.toInt()

public const val LINUX_REBOOT_CMD_SW_SUSPEND: Int = 0xD000FCE2.toInt()

public const val LINUX_REBOOT_CMD_KEXEC: Int = 0x45584543

public const val REG_BASIC: Int = 0

public const val REG_EXTENDED: Int = 1

public const val REG_ICASE: Int = 2

public const val REG_NOSUB: Int = 4

public const val REG_NEWLINE: Int = 8

public const val REG_NOSPEC: Int = 16

public const val REG_PEND: Int = 32

public const val REG_DUMP: Int = 128

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

public const val REG_EMPTY: Int = 14

public const val REG_ASSERT: Int = 15

public const val REG_INVARG: Int = 16

public const val REG_ATOI: Int = 255

public const val REG_ITOA: Int = 256

public const val REG_NOTBOL: Int = 1

public const val REG_NOTEOL: Int = 2

public const val REG_STARTEND: Int = 4

public const val REG_TRACE: Int = 256

public const val REG_LARGE: Int = 512

public const val REG_BACKR: Int = 1024

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val MCL_ONFAULT: Int = 0x0004

public const val CBAUD: UInt = 4111u

public const val TAB1: UInt = 0x00000800u

public const val TAB2: UInt = 0x00001000u

public const val TAB3: UInt = 0x00001800u

public const val CR1: UInt = 0x00000200u

public const val CR2: UInt = 0x00000400u

public const val CR3: UInt = 0x00000600u

public const val FF1: UInt = 0x00008000u

public const val BS1: UInt = 0x00002000u

public const val VT1: UInt = 0x00004000u

public const val VWERASE: ULong = 14uL

public const val VREPRINT: ULong = 12uL

public const val VSUSP: ULong = 10uL

public const val VSTART: ULong = 8uL

public const val VSTOP: ULong = 9uL

public const val VDISCARD: ULong = 13uL

public const val VTIME: ULong = 5uL

public const val IUCLC: UInt = 0x00000200u

public const val IXON: UInt = 0x00000400u

public const val IXOFF: UInt = 0x00001000u

public const val ONLCR: UInt = 0x4u

public const val CSIZE: UInt = 0x00000030u

public const val CS6: UInt = 0x00000010u

public const val CS7: UInt = 0x00000020u

public const val CS8: UInt = 0x00000030u

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

public const val ECHOPRT: UInt = 0x00000400u

public const val ECHOCTL: UInt = 0x00000200u

public const val ISIG: UInt = 0x00000001u

public const val ICANON: UInt = 0x00000002u

public const val PENDIN: UInt = 0x00004000u

public const val NOFLSH: UInt = 0x00000080u

public const val VSWTC: ULong = 7uL

public const val OLCUC: UInt = 2u

public const val NLDLY: UInt = 256u

public const val CRDLY: UInt = 1536u

public const val TABDLY: UInt = 6144u

public const val BSDLY: UInt = 8192u

public const val FFDLY: UInt = 32768u

public const val VTDLY: UInt = 16384u

public const val XCASE: UInt = 4u

public const val XTABS: UInt = 6144u

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

public const val EXTA: UInt = B19200

public const val EXTB: UInt = B38400

public const val BOTHER: UInt = 4096u

public const val B57600: UInt = 4097u

public const val B115200: UInt = 4098u

public const val B230400: UInt = 4099u

public const val B460800: UInt = 4100u

public const val B500000: UInt = 4101u

public const val B576000: UInt = 4102u

public const val B921600: UInt = 4103u

public const val B1000000: UInt = 4104u

public const val B1152000: UInt = 4105u

public const val B1500000: UInt = 4106u

public const val B2000000: UInt = 4107u

public const val B2500000: UInt = 4108u

public const val B3000000: UInt = 4109u

public const val B3500000: UInt = 4110u

public const val B4000000: UInt = 4111u

public const val IBSHIFT: UInt = 16u

public const val BLKIOMIN: Int = 0x1278

public const val BLKIOOPT: Int = 0x1279

public const val BLKSSZGET: Int = 0x1268

public const val BLKPBSZGET: Int = 0x127B

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

public const val NETLINK_ROUTE: Int = 0

public const val NETLINK_UNUSED: Int = 1

public const val NETLINK_USERSOCK: Int = 2

public const val NETLINK_FIREWALL: Int = 3

public const val NETLINK_SOCK_DIAG: Int = 4

public const val NETLINK_NFLOG: Int = 5

public const val NETLINK_XFRM: Int = 6

public const val NETLINK_SELINUX: Int = 7

public const val NETLINK_ISCSI: Int = 8

public const val NETLINK_AUDIT: Int = 9

public const val NETLINK_FIB_LOOKUP: Int = 10

public const val NETLINK_CONNECTOR: Int = 11

public const val NETLINK_NETFILTER: Int = 12

public const val NETLINK_IP6_FW: Int = 13

public const val NETLINK_DNRTMSG: Int = 14

public const val NETLINK_KOBJECT_UEVENT: Int = 15

public const val NETLINK_GENERIC: Int = 16

public const val NETLINK_SCSITRANSPORT: Int = 18

public const val NETLINK_ECRYPTFS: Int = 19

public const val NETLINK_RDMA: Int = 20

public const val NETLINK_CRYPTO: Int = 21

public const val NETLINK_INET_DIAG: Int = NETLINK_SOCK_DIAG

public const val MAX_LINKS: Int = 32

public const val NLM_F_REQUEST: Int = 1

public const val NLM_F_MULTI: Int = 2

public const val NLM_F_ACK: Int = 4

public const val NLM_F_ECHO: Int = 8

public const val NLM_F_DUMP_INTR: Int = 16

public const val NLM_F_DUMP_FILTERED: Int = 32

public const val NLM_F_ROOT: Int = 0x100

public const val NLM_F_MATCH: Int = 0x200

public const val NLM_F_ATOMIC: Int = 0x400

public val NLM_F_DUMP: Int = NLM_F_ROOT or NLM_F_MATCH

public const val NLM_F_REPLACE: Int = 0x100

public const val NLM_F_EXCL: Int = 0x200

public const val NLM_F_CREATE: Int = 0x400

public const val NLM_F_APPEND: Int = 0x800

public const val NLM_F_NONREC: Int = 0x100

public const val NLM_F_BULK: Int = 0x200

public const val NLM_F_CAPPED: Int = 0x100

public const val NLM_F_ACK_TLVS: Int = 0x200

public const val NLMSG_NOOP: Int = 0x1

public const val NLMSG_ERROR: Int = 0x2

public const val NLMSG_DONE: Int = 0x3

public const val NLMSG_OVERRUN: Int = 0x4

public const val NLMSG_MIN_TYPE: Int = 0x10

public const val NFNLGRP_NONE: Int = 0

public const val NFNLGRP_CONNTRACK_NEW: Int = 1

public const val NFNLGRP_CONNTRACK_UPDATE: Int = 2

public const val NFNLGRP_CONNTRACK_DESTROY: Int = 3

public const val NFNLGRP_CONNTRACK_EXP_NEW: Int = 4

public const val NFNLGRP_CONNTRACK_EXP_UPDATE: Int = 5

public const val NFNLGRP_CONNTRACK_EXP_DESTROY: Int = 6

public const val NFNLGRP_NFTABLES: Int = 7

public const val NFNLGRP_ACCT_QUOTA: Int = 8

public const val NFNETLINK_V0: Int = 0

public const val NFNL_SUBSYS_NONE: Int = 0

public const val NFNL_SUBSYS_CTNETLINK: Int = 1

public const val NFNL_SUBSYS_CTNETLINK_EXP: Int = 2

public const val NFNL_SUBSYS_QUEUE: Int = 3

public const val NFNL_SUBSYS_ULOG: Int = 4

public const val NFNL_SUBSYS_OSF: Int = 5

public const val NFNL_SUBSYS_IPSET: Int = 6

public const val NFNL_SUBSYS_ACCT: Int = 7

public const val NFNL_SUBSYS_CTNETLINK_TIMEOUT: Int = 8

public const val NFNL_SUBSYS_CTHELPER: Int = 9

public const val NFNL_SUBSYS_NFTABLES: Int = 10

public const val NFNL_SUBSYS_NFT_COMPAT: Int = 11

public const val NFNL_SUBSYS_COUNT: Int = 12

public const val NFNL_MSG_BATCH_BEGIN: Int = NLMSG_MIN_TYPE

public const val NFNL_MSG_BATCH_END: Int = NLMSG_MIN_TYPE + 1

public const val NFULNL_MSG_PACKET: Int = 0

public const val NFULNL_MSG_CONFIG: Int = 1

public const val NFULA_UNSPEC: Int = 0

public const val NFULA_PACKET_HDR: Int = 1

public const val NFULA_MARK: Int = 2

public const val NFULA_TIMESTAMP: Int = 3

public const val NFULA_IFINDEX_INDEV: Int = 4

public const val NFULA_IFINDEX_OUTDEV: Int = 5

public const val NFULA_IFINDEX_PHYSINDEV: Int = 6

public const val NFULA_IFINDEX_PHYSOUTDEV: Int = 7

public const val NFULA_HWADDR: Int = 8

public const val NFULA_PAYLOAD: Int = 9

public const val NFULA_PREFIX: Int = 10

public const val NFULA_UID: Int = 11

public const val NFULA_SEQ: Int = 12

public const val NFULA_SEQ_GLOBAL: Int = 13

public const val NFULA_GID: Int = 14

public const val NFULA_HWTYPE: Int = 15

public const val NFULA_HWHEADER: Int = 16

public const val NFULA_HWLEN: Int = 17

public const val NFULA_CT: Int = 18

public const val NFULA_CT_INFO: Int = 19

public const val NFULNL_CFG_CMD_NONE: Int = 0

public const val NFULNL_CFG_CMD_BIND: Int = 1

public const val NFULNL_CFG_CMD_UNBIND: Int = 2

public const val NFULNL_CFG_CMD_PF_BIND: Int = 3

public const val NFULNL_CFG_CMD_PF_UNBIND: Int = 4

public const val NFULA_CFG_UNSPEC: Int = 0

public const val NFULA_CFG_CMD: Int = 1

public const val NFULA_CFG_MODE: Int = 2

public const val NFULA_CFG_NLBUFSIZ: Int = 3

public const val NFULA_CFG_TIMEOUT: Int = 4

public const val NFULA_CFG_QTHRESH: Int = 5

public const val NFULA_CFG_FLAGS: Int = 6

public const val NFULNL_COPY_NONE: Int = 0x00

public const val NFULNL_COPY_META: Int = 0x01

public const val NFULNL_COPY_PACKET: Int = 0x02

public const val NFULNL_CFG_F_SEQ: Int = 0x0001

public const val NFULNL_CFG_F_SEQ_GLOBAL: Int = 0x0002

public const val NFULNL_CFG_F_CONNTRACK: Int = 0x0004

public const val NFQNL_MSG_PACKET: Int = 0

public const val NFQNL_MSG_VERDICT: Int = 1

public const val NFQNL_MSG_CONFIG: Int = 2

public const val NFQNL_MSG_VERDICT_BATCH: Int = 3

public const val NFQA_UNSPEC: Int = 0

public const val NFQA_PACKET_HDR: Int = 1

public const val NFQA_VERDICT_HDR: Int = 2

public const val NFQA_MARK: Int = 3

public const val NFQA_TIMESTAMP: Int = 4

public const val NFQA_IFINDEX_INDEV: Int = 5

public const val NFQA_IFINDEX_OUTDEV: Int = 6

public const val NFQA_IFINDEX_PHYSINDEV: Int = 7

public const val NFQA_IFINDEX_PHYSOUTDEV: Int = 8

public const val NFQA_HWADDR: Int = 9

public const val NFQA_PAYLOAD: Int = 10

public const val NFQA_CT: Int = 11

public const val NFQA_CT_INFO: Int = 12

public const val NFQA_CAP_LEN: Int = 13

public const val NFQA_SKB_INFO: Int = 14

public const val NFQA_EXP: Int = 15

public const val NFQA_UID: Int = 16

public const val NFQA_GID: Int = 17

public const val NFQA_SECCTX: Int = 18

public const val NFQA_VLAN: Int = 19

public const val NFQA_L2HDR: Int = 20

public const val NFQA_VLAN_UNSPEC: Int = 0

public const val NFQA_VLAN_PROTO: Int = 1

public const val NFQA_VLAN_TCI: Int = 2

public const val NFQNL_CFG_CMD_NONE: Int = 0

public const val NFQNL_CFG_CMD_BIND: Int = 1

public const val NFQNL_CFG_CMD_UNBIND: Int = 2

public const val NFQNL_CFG_CMD_PF_BIND: Int = 3

public const val NFQNL_CFG_CMD_PF_UNBIND: Int = 4

public const val NFQNL_COPY_NONE: Int = 0

public const val NFQNL_COPY_META: Int = 1

public const val NFQNL_COPY_PACKET: Int = 2

public const val NFQA_CFG_UNSPEC: Int = 0

public const val NFQA_CFG_CMD: Int = 1

public const val NFQA_CFG_PARAMS: Int = 2

public const val NFQA_CFG_QUEUE_MAXLEN: Int = 3

public const val NFQA_CFG_MASK: Int = 4

public const val NFQA_CFG_FLAGS: Int = 5

public const val NFQA_CFG_F_FAIL_OPEN: Int = 0x0001

public const val NFQA_CFG_F_CONNTRACK: Int = 0x0002

public const val NFQA_CFG_F_GSO: Int = 0x0004

public const val NFQA_CFG_F_UID_GID: Int = 0x0008

public const val NFQA_CFG_F_SECCTX: Int = 0x0010

public const val NFQA_CFG_F_MAX: Int = 0x0020

public const val NFQA_SKB_CSUMNOTREADY: Int = 0x0001

public const val NFQA_SKB_GSO: Int = 0x0002

public const val NFQA_SKB_CSUM_NOTVERIFIED: Int = 0x0004

public const val GENL_NAMSIZ: Int = 16

public const val GENL_MIN_ID: Int = NLMSG_MIN_TYPE

public const val GENL_MAX_ID: Int = 1023

public const val GENL_ADMIN_PERM: Int = 0x01

public const val GENL_CMD_CAP_DO: Int = 0x02

public const val GENL_CMD_CAP_DUMP: Int = 0x04

public const val GENL_CMD_CAP_HASPOL: Int = 0x08

public const val GENL_UNS_ADMIN_PERM: Int = 0x10

public const val GENL_ID_CTRL: Int = NLMSG_MIN_TYPE

public const val GENL_ID_VFS_DQUOT: Int = NLMSG_MIN_TYPE + 1

public const val GENL_ID_PMCRAID: Int = NLMSG_MIN_TYPE + 2

public const val CTRL_CMD_UNSPEC: Int = 0

public const val CTRL_CMD_NEWFAMILY: Int = 1

public const val CTRL_CMD_DELFAMILY: Int = 2

public const val CTRL_CMD_GETFAMILY: Int = 3

public const val CTRL_CMD_NEWOPS: Int = 4

public const val CTRL_CMD_DELOPS: Int = 5

public const val CTRL_CMD_GETOPS: Int = 6

public const val CTRL_CMD_NEWMCAST_GRP: Int = 7

public const val CTRL_CMD_DELMCAST_GRP: Int = 8

public const val CTRL_CMD_GETMCAST_GRP: Int = 9

public const val CTRL_ATTR_UNSPEC: Int = 0

public const val CTRL_ATTR_FAMILY_ID: Int = 1

public const val CTRL_ATTR_FAMILY_NAME: Int = 2

public const val CTRL_ATTR_VERSION: Int = 3

public const val CTRL_ATTR_HDRSIZE: Int = 4

public const val CTRL_ATTR_MAXATTR: Int = 5

public const val CTRL_ATTR_OPS: Int = 6

public const val CTRL_ATTR_MCAST_GROUPS: Int = 7

public const val CTRL_ATTR_OP_UNSPEC: Int = 0

public const val CTRL_ATTR_OP_ID: Int = 1

public const val CTRL_ATTR_OP_FLAGS: Int = 2

public const val CTRL_ATTR_MCAST_GRP_UNSPEC: Int = 0

public const val CTRL_ATTR_MCAST_GRP_NAME: Int = 1

public const val CTRL_ATTR_MCAST_GRP_ID: Int = 2

public const val NETLINK_ADD_MEMBERSHIP: Int = 1

public const val NETLINK_DROP_MEMBERSHIP: Int = 2

public const val NETLINK_PKTINFO: Int = 3

public const val NETLINK_BROADCAST_ERROR: Int = 4

public const val NETLINK_NO_ENOBUFS: Int = 5

public const val NETLINK_RX_RING: Int = 6

public const val NETLINK_TX_RING: Int = 7

public const val NETLINK_LISTEN_ALL_NSID: Int = 8

public const val NETLINK_LIST_MEMBERSHIPS: Int = 9

public const val NETLINK_CAP_ACK: Int = 10

public const val NETLINK_EXT_ACK: Int = 11

public const val NETLINK_GET_STRICT_CHK: Int = 12

public const val GRND_NONBLOCK: UInt = 0x0001u

public const val GRND_RANDOM: UInt = 0x0002u

public const val GRND_INSECURE: UInt = 0x0004u

public const val SECCOMP_MODE_DISABLED: UInt = 0u

public const val SECCOMP_MODE_STRICT: UInt = 1u

public const val SECCOMP_MODE_FILTER: UInt = 2u

public const val SECCOMP_SET_MODE_STRICT: UInt = 0u

public const val SECCOMP_SET_MODE_FILTER: UInt = 1u

public const val SECCOMP_GET_ACTION_AVAIL: UInt = 2u

public const val SECCOMP_GET_NOTIF_SIZES: UInt = 3u

public val SECCOMP_FILTER_FLAG_TSYNC: ULong = 1uL shl 0

public val SECCOMP_FILTER_FLAG_LOG: ULong = 1uL shl 1

public val SECCOMP_FILTER_FLAG_SPEC_ALLOW: ULong = 1uL shl 2

public val SECCOMP_FILTER_FLAG_NEW_LISTENER: ULong = 1uL shl 3

public val SECCOMP_FILTER_FLAG_TSYNC_ESRCH: ULong = 1uL shl 4

public val SECCOMP_FILTER_FLAG_WAIT_KILLABLE_RECV: ULong = 1uL shl 5

public const val SECCOMP_RET_KILL_PROCESS: UInt = 0x80000000u

public const val SECCOMP_RET_KILL_THREAD: UInt = 0x00000000u

public const val SECCOMP_RET_KILL: UInt = SECCOMP_RET_KILL_THREAD

public const val SECCOMP_RET_TRAP: UInt = 0x00030000u

public const val SECCOMP_RET_ERRNO: UInt = 0x00050000u

public const val SECCOMP_RET_USER_NOTIF: UInt = 0x7fc00000u

public const val SECCOMP_RET_TRACE: UInt = 0x7ff00000u

public const val SECCOMP_RET_LOG: UInt = 0x7ffc0000u

public const val SECCOMP_RET_ALLOW: UInt = 0x7fff0000u

public const val SECCOMP_RET_ACTION_FULL: UInt = 0xffff0000u

public const val SECCOMP_RET_ACTION: UInt = 0x7fff0000u

public const val SECCOMP_RET_DATA: UInt = 0x0000ffffu

public const val SECCOMP_USER_NOTIF_FLAG_CONTINUE: ULong = 1uL

public const val SECCOMP_ADDFD_FLAG_SETFD: ULong = 1uL

public const val SECCOMP_ADDFD_FLAG_SEND: ULong = 2uL

public val NLA_F_NESTED: Int = 1 shl 15

public val NLA_F_NET_BYTEORDER: Int = 1 shl 14

public val NLA_TYPE_MASK: Int = (NLA_F_NESTED or NLA_F_NET_BYTEORDER).inv()

public const val NLA_ALIGNTO: Int = 4

public const val SIGEV_THREAD_ID: Int = 4

public const val CIBAUD: UInt = 269418496u

public const val CBAUDEX: UInt = 4096u

public const val TIOCM_LE: Int = 0x001

public const val TIOCM_DTR: Int = 0x002

public const val TIOCM_RTS: Int = 0x004

public const val TIOCM_ST: Int = 0x008

public const val TIOCM_SR: Int = 0x010

public const val TIOCM_CTS: Int = 0x020

public const val TIOCM_CAR: Int = 0x040

public const val TIOCM_RNG: Int = 0x080

public const val TIOCM_DSR: Int = 0x100

public const val TIOCM_CD: Int = TIOCM_CAR

public const val TIOCM_RI: Int = TIOCM_RNG

public const val POLLWRNORM: Short = 0x100

public const val POLLWRBAND: Short = 0x200

public const val SFD_CLOEXEC: Int = O_CLOEXEC

public const val SFD_NONBLOCK: Int = O_NONBLOCK

public const val SOCK_NONBLOCK: Int = O_NONBLOCK

public const val SO_ORIGINAL_DST: Int = 80

public const val IP_RECVFRAGSIZE: Int = 25

public const val IPV6_FLOWINFO: Int = 11

public const val IPV6_MULTICAST_ALL: Int = 29

public const val IPV6_ROUTER_ALERT_ISOLATE: Int = 30

public const val IPV6_FLOWLABEL_MGR: Int = 32

public const val IPV6_FLOWINFO_SEND: Int = 33

public const val IPV6_RECVFRAGSIZE: Int = 77

public const val IPV6_FREEBIND: Int = 78

public const val IPV6_FLOWINFO_FLOWLABEL: Int = 0x000fffff

public const val IPV6_FLOWINFO_PRIORITY: Int = 0x0ff00000

public const val IUTF8: UInt = 0x00004000u

public const val CMSPAR: UInt = 1073741824u

public val O_TMPFILE: Int = 4194304 or O_DIRECTORY

public const val MFD_CLOEXEC: UInt = 0x0001u

public const val MFD_ALLOW_SEALING: UInt = 0x0002u

public const val MFD_HUGETLB: UInt = 0x0004u

public const val MFD_NOEXEC_SEAL: UInt = 0x0008u

public const val MFD_EXEC: UInt = 0x0010u

public const val MFD_HUGE_64KB: UInt = 0x40000000u

public const val MFD_HUGE_512KB: UInt = 0x4c000000u

public const val MFD_HUGE_1MB: UInt = 0x50000000u

public const val MFD_HUGE_2MB: UInt = 0x54000000u

public const val MFD_HUGE_8MB: UInt = 0x5c000000u

public const val MFD_HUGE_16MB: UInt = 0x60000000u

public const val MFD_HUGE_32MB: UInt = 0x64000000u

public const val MFD_HUGE_256MB: UInt = 0x70000000u

public const val MFD_HUGE_512MB: UInt = 0x74000000u

public const val MFD_HUGE_1GB: UInt = 0x78000000u

public const val MFD_HUGE_2GB: UInt = 0x7c000000u

public const val MFD_HUGE_16GB: UInt = 0x88000000u

public const val MFD_HUGE_MASK: UInt = 63u

public const val MFD_HUGE_SHIFT: UInt = 26u

public const val PT_NULL: UInt = 0u

public const val PT_LOAD: UInt = 1u

public const val PT_DYNAMIC: UInt = 2u

public const val PT_INTERP: UInt = 3u

public const val PT_NOTE: UInt = 4u

public const val PT_SHLIB: UInt = 5u

public const val PT_PHDR: UInt = 6u

public const val PT_TLS: UInt = 7u

public const val PT_LOOS: UInt = 0x60000000u

public const val PT_GNU_EH_FRAME: UInt = 0x6474e550u

public const val PT_GNU_STACK: UInt = 0x6474e551u

public const val PT_GNU_RELRO: UInt = 0x6474e552u

public const val PT_HIOS: UInt = 0x6fffffffu

public const val PT_LOPROC: UInt = 0x70000000u

public const val PT_HIPROC: UInt = 0x7fffffffu

public const val OPEN_TREE_CLONE: UInt = 0x01u

public val OPEN_TREE_CLOEXEC: UInt = O_CLOEXEC.toUInt()

public const val NF_DROP: Int = 0

public const val NF_ACCEPT: Int = 1

public const val NF_STOLEN: Int = 2

public const val NF_QUEUE: Int = 3

public const val NF_REPEAT: Int = 4

public const val NF_STOP: Int = 5

public const val NF_MAX_VERDICT: Int = NF_STOP

public const val NF_VERDICT_MASK: Int = 0x000000ff

public const val NF_VERDICT_FLAG_QUEUE_BYPASS: Int = 0x00008000

public const val NF_VERDICT_QMASK: Int = 0xffff0000.toInt()

public const val NF_VERDICT_QBITS: Int = 16

public const val NF_VERDICT_BITS: Int = 16

public const val NF_INET_PRE_ROUTING: Int = 0

public const val NF_INET_LOCAL_IN: Int = 1

public const val NF_INET_FORWARD: Int = 2

public const val NF_INET_LOCAL_OUT: Int = 3

public const val NF_INET_POST_ROUTING: Int = 4

public const val NF_INET_NUMHOOKS: Int = 5

public const val NF_INET_INGRESS: Int = NF_INET_NUMHOOKS

public const val NF_NETDEV_INGRESS: Int = 0

public const val NF_NETDEV_EGRESS: Int = 1

public const val NF_NETDEV_NUMHOOKS: Int = 2

public const val NFPROTO_UNSPEC: Int = 0

public const val NFPROTO_INET: Int = 1

public const val NFPROTO_IPV4: Int = 2

public const val NFPROTO_ARP: Int = 3

public const val NFPROTO_NETDEV: Int = 5

public const val NFPROTO_BRIDGE: Int = 7

public const val NFPROTO_IPV6: Int = 10

public const val NFPROTO_DECNET: Int = 12

public const val NFPROTO_NUMPROTO: Int = 13

public const val NF_ARP: Int = 0

public const val NF_ARP_IN: Int = 0

public const val NF_ARP_OUT: Int = 1

public const val NF_ARP_FORWARD: Int = 2

public const val NF_ARP_NUMHOOKS: Int = 3

public const val NF_BR_PRE_ROUTING: Int = 0

public const val NF_BR_LOCAL_IN: Int = 1

public const val NF_BR_FORWARD: Int = 2

public const val NF_BR_LOCAL_OUT: Int = 3

public const val NF_BR_POST_ROUTING: Int = 4

public const val NF_BR_BROUTING: Int = 5

public const val NF_BR_NUMHOOKS: Int = 6

public const val NF_BR_PRI_FIRST: Int = INT_MIN

public const val NF_BR_PRI_NAT_DST_BRIDGED: Int = -300

public const val NF_BR_PRI_FILTER_BRIDGED: Int = -200

public const val NF_BR_PRI_BRNF: Int = 0

public const val NF_BR_PRI_NAT_DST_OTHER: Int = 100

public const val NF_BR_PRI_FILTER_OTHER: Int = 200

public const val NF_BR_PRI_NAT_SRC: Int = 300

public const val NF_BR_PRI_LAST: Int = INT_MAX

public const val NF_IP_PRE_ROUTING: Int = 0

public const val NF_IP_LOCAL_IN: Int = 1

public const val NF_IP_FORWARD: Int = 2

public const val NF_IP_LOCAL_OUT: Int = 3

public const val NF_IP_POST_ROUTING: Int = 4

public const val NF_IP_NUMHOOKS: Int = 5

public const val NF_IP_PRI_FIRST: Int = INT_MIN

public const val NF_IP_PRI_RAW_BEFORE_DEFRAG: Int = -450

public const val NF_IP_PRI_CONNTRACK_DEFRAG: Int = -400

public const val NF_IP_PRI_RAW: Int = -300

public const val NF_IP_PRI_SELINUX_FIRST: Int = -225

public const val NF_IP_PRI_CONNTRACK: Int = -200

public const val NF_IP_PRI_MANGLE: Int = -150

public const val NF_IP_PRI_NAT_DST: Int = -100

public const val NF_IP_PRI_FILTER: Int = 0

public const val NF_IP_PRI_SECURITY: Int = 50

public const val NF_IP_PRI_NAT_SRC: Int = 100

public const val NF_IP_PRI_SELINUX_LAST: Int = 225

public const val NF_IP_PRI_CONNTRACK_HELPER: Int = 300

public const val NF_IP_PRI_CONNTRACK_CONFIRM: Int = INT_MAX

public const val NF_IP_PRI_LAST: Int = INT_MAX

public const val NF_IP6_PRE_ROUTING: Int = 0

public const val NF_IP6_LOCAL_IN: Int = 1

public const val NF_IP6_FORWARD: Int = 2

public const val NF_IP6_LOCAL_OUT: Int = 3

public const val NF_IP6_POST_ROUTING: Int = 4

public const val NF_IP6_NUMHOOKS: Int = 5

public const val NF_IP6_PRI_FIRST: Int = INT_MIN

public const val NF_IP6_PRI_RAW_BEFORE_DEFRAG: Int = -450

public const val NF_IP6_PRI_CONNTRACK_DEFRAG: Int = -400

public const val NF_IP6_PRI_RAW: Int = -300

public const val NF_IP6_PRI_SELINUX_FIRST: Int = -225

public const val NF_IP6_PRI_CONNTRACK: Int = -200

public const val NF_IP6_PRI_MANGLE: Int = -150

public const val NF_IP6_PRI_NAT_DST: Int = -100

public const val NF_IP6_PRI_FILTER: Int = 0

public const val NF_IP6_PRI_SECURITY: Int = 50

public const val NF_IP6_PRI_NAT_SRC: Int = 100

public const val NF_IP6_PRI_SELINUX_LAST: Int = 225

public const val NF_IP6_PRI_CONNTRACK_HELPER: Int = 300

public const val NF_IP6_PRI_LAST: Int = INT_MAX

public const val IP6T_SO_ORIGINAL_DST: Int = 80

public const val NFT_TABLE_MAXNAMELEN: Int = 256

public const val NFT_CHAIN_MAXNAMELEN: Int = 256

public const val NFT_SET_MAXNAMELEN: Int = 256

public const val NFT_OBJ_MAXNAMELEN: Int = 256

public const val NFT_USERDATA_MAXLEN: Int = 256

public const val NFT_REG_VERDICT: Int = 0

public const val NFT_REG_1: Int = 1

public const val NFT_REG_2: Int = 2

public const val NFT_REG_3: Int = 3

public const val NFT_REG_4: Int = 4

public const val __NFT_REG_MAX: Int = 5

public const val NFT_REG32_00: Int = 8

public const val NFT_REG32_01: Int = 9

public const val NFT_REG32_02: Int = 10

public const val NFT_REG32_03: Int = 11

public const val NFT_REG32_04: Int = 12

public const val NFT_REG32_05: Int = 13

public const val NFT_REG32_06: Int = 14

public const val NFT_REG32_07: Int = 15

public const val NFT_REG32_08: Int = 16

public const val NFT_REG32_09: Int = 17

public const val NFT_REG32_10: Int = 18

public const val NFT_REG32_11: Int = 19

public const val NFT_REG32_12: Int = 20

public const val NFT_REG32_13: Int = 21

public const val NFT_REG32_14: Int = 22

public const val NFT_REG32_15: Int = 23

public const val NFT_REG_SIZE: Int = 16

public const val NFT_REG32_SIZE: Int = 4

public const val NFT_CONTINUE: Int = -1

public const val NFT_BREAK: Int = -2

public const val NFT_JUMP: Int = -3

public const val NFT_GOTO: Int = -4

public const val NFT_RETURN: Int = -5

public const val NFT_MSG_NEWTABLE: Int = 0

public const val NFT_MSG_GETTABLE: Int = 1

public const val NFT_MSG_DELTABLE: Int = 2

public const val NFT_MSG_NEWCHAIN: Int = 3

public const val NFT_MSG_GETCHAIN: Int = 4

public const val NFT_MSG_DELCHAIN: Int = 5

public const val NFT_MSG_NEWRULE: Int = 6

public const val NFT_MSG_GETRULE: Int = 7

public const val NFT_MSG_DELRULE: Int = 8

public const val NFT_MSG_NEWSET: Int = 9

public const val NFT_MSG_GETSET: Int = 10

public const val NFT_MSG_DELSET: Int = 11

public const val NFT_MSG_NEWSETELEM: Int = 12

public const val NFT_MSG_GETSETELEM: Int = 13

public const val NFT_MSG_DELSETELEM: Int = 14

public const val NFT_MSG_NEWGEN: Int = 15

public const val NFT_MSG_GETGEN: Int = 16

public const val NFT_MSG_TRACE: Int = 17

public const val NFT_MSG_NEWOBJ: Int = 18

public const val NFT_MSG_GETOBJ: Int = 19

public const val NFT_MSG_DELOBJ: Int = 20

public const val NFT_MSG_GETOBJ_RESET: Int = 21

public const val NFT_MSG_MAX: Int = 25

public const val NFT_SET_ANONYMOUS: Int = 0x1

public const val NFT_SET_CONSTANT: Int = 0x2

public const val NFT_SET_INTERVAL: Int = 0x4

public const val NFT_SET_MAP: Int = 0x8

public const val NFT_SET_TIMEOUT: Int = 0x10

public const val NFT_SET_EVAL: Int = 0x20

public const val NFT_SET_POL_PERFORMANCE: Int = 0

public const val NFT_SET_POL_MEMORY: Int = 1

public const val NFT_SET_ELEM_INTERVAL_END: Int = 0x1

public const val NFT_DATA_VALUE: UInt = 0u

public const val NFT_DATA_VERDICT: UInt = 0xffffff00u

public const val NFT_DATA_RESERVED_MASK: UInt = 0xffffff00u

public const val NFT_DATA_VALUE_MAXLEN: Int = 64

public const val NFT_BYTEORDER_NTOH: Int = 0

public const val NFT_BYTEORDER_HTON: Int = 1

public const val NFT_CMP_EQ: Int = 0

public const val NFT_CMP_NEQ: Int = 1

public const val NFT_CMP_LT: Int = 2

public const val NFT_CMP_LTE: Int = 3

public const val NFT_CMP_GT: Int = 4

public const val NFT_CMP_GTE: Int = 5

public const val NFT_RANGE_EQ: Int = 0

public const val NFT_RANGE_NEQ: Int = 1

public val NFT_LOOKUP_F_INV: Int = 1 shl 0

public const val NFT_DYNSET_OP_ADD: Int = 0

public const val NFT_DYNSET_OP_UPDATE: Int = 1

public val NFT_DYNSET_F_INV: Int = 1 shl 0

public const val NFT_PAYLOAD_LL_HEADER: Int = 0

public const val NFT_PAYLOAD_NETWORK_HEADER: Int = 1

public const val NFT_PAYLOAD_TRANSPORT_HEADER: Int = 2

public const val NFT_PAYLOAD_CSUM_NONE: Int = 0

public const val NFT_PAYLOAD_CSUM_INET: Int = 1

public const val NFT_META_LEN: Int = 0

public const val NFT_META_PROTOCOL: Int = 1

public const val NFT_META_PRIORITY: Int = 2

public const val NFT_META_MARK: Int = 3

public const val NFT_META_IIF: Int = 4

public const val NFT_META_OIF: Int = 5

public const val NFT_META_IIFNAME: Int = 6

public const val NFT_META_OIFNAME: Int = 7

public const val NFT_META_IIFTYPE: Int = 8

public const val NFT_META_OIFTYPE: Int = 9

public const val NFT_META_SKUID: Int = 10

public const val NFT_META_SKGID: Int = 11

public const val NFT_META_NFTRACE: Int = 12

public const val NFT_META_RTCLASSID: Int = 13

public const val NFT_META_SECMARK: Int = 14

public const val NFT_META_NFPROTO: Int = 15

public const val NFT_META_L4PROTO: Int = 16

public const val NFT_META_BRI_IIFNAME: Int = 17

public const val NFT_META_BRI_OIFNAME: Int = 18

public const val NFT_META_PKTTYPE: Int = 19

public const val NFT_META_CPU: Int = 20

public const val NFT_META_IIFGROUP: Int = 21

public const val NFT_META_OIFGROUP: Int = 22

public const val NFT_META_CGROUP: Int = 23

public const val NFT_META_PRANDOM: Int = 24

public const val NFT_CT_STATE: Int = 0

public const val NFT_CT_DIRECTION: Int = 1

public const val NFT_CT_STATUS: Int = 2

public const val NFT_CT_MARK: Int = 3

public const val NFT_CT_SECMARK: Int = 4

public const val NFT_CT_EXPIRATION: Int = 5

public const val NFT_CT_HELPER: Int = 6

public const val NFT_CT_L3PROTOCOL: Int = 7

public const val NFT_CT_SRC: Int = 8

public const val NFT_CT_DST: Int = 9

public const val NFT_CT_PROTOCOL: Int = 10

public const val NFT_CT_PROTO_SRC: Int = 11

public const val NFT_CT_PROTO_DST: Int = 12

public const val NFT_CT_LABELS: Int = 13

public const val NFT_CT_PKTS: Int = 14

public const val NFT_CT_BYTES: Int = 15

public const val NFT_CT_AVGPKT: Int = 16

public const val NFT_CT_ZONE: Int = 17

public const val NFT_CT_EVENTMASK: Int = 18

public const val NFT_CT_SRC_IP: Int = 19

public const val NFT_CT_DST_IP: Int = 20

public const val NFT_CT_SRC_IP6: Int = 21

public const val NFT_CT_DST_IP6: Int = 22

public const val NFT_CT_ID: Int = 23

public const val NFT_LIMIT_PKTS: Int = 0

public const val NFT_LIMIT_PKT_BYTES: Int = 1

public val NFT_LIMIT_F_INV: Int = 1 shl 0

public const val NFT_QUEUE_FLAG_BYPASS: Int = 0x01

public const val NFT_QUEUE_FLAG_CPU_FANOUT: Int = 0x02

public const val NFT_QUEUE_FLAG_MASK: Int = 0x03

public val NFT_QUOTA_F_INV: Int = 1 shl 0

public const val NFT_REJECT_ICMP_UNREACH: Int = 0

public const val NFT_REJECT_TCP_RST: Int = 1

public const val NFT_REJECT_ICMPX_UNREACH: Int = 2

public const val NFT_REJECT_ICMPX_NO_ROUTE: Int = 0

public const val NFT_REJECT_ICMPX_PORT_UNREACH: Int = 1

public const val NFT_REJECT_ICMPX_HOST_UNREACH: Int = 2

public const val NFT_REJECT_ICMPX_ADMIN_PROHIBITED: Int = 3

public const val NFT_NAT_SNAT: Int = 0

public const val NFT_NAT_DNAT: Int = 1

public const val NFT_TRACETYPE_UNSPEC: Int = 0

public const val NFT_TRACETYPE_POLICY: Int = 1

public const val NFT_TRACETYPE_RETURN: Int = 2

public const val NFT_TRACETYPE_RULE: Int = 3

public const val NFT_NG_INCREMENTAL: Int = 0

public const val NFT_NG_RANDOM: Int = 1

public const val FF_MAX: UShort = 0x7fu

public val FF_CNT: ULong = FF_MAX.toULong() + 1u

public const val INPUT_PROP_MAX: UShort = 0x1fu

public val INPUT_PROP_CNT: ULong = INPUT_PROP_MAX.toULong() + 1u

public const val EV_MAX: UShort = 0x1fu

public val EV_CNT: ULong = EV_MAX.toULong() + 1u

public const val SYN_MAX: UShort = 0xfu

public val SYN_CNT: ULong = SYN_MAX.toULong() + 1u

public const val KEY_MAX: UShort = 0x2ffu

public val KEY_CNT: ULong = KEY_MAX.toULong() + 1u

public const val REL_MAX: UShort = 0x0fu

public val REL_CNT: ULong = REL_MAX.toULong() + 1u

public const val ABS_MAX: UShort = 0x3fu

public val ABS_CNT: ULong = ABS_MAX.toULong() + 1u

public const val SW_MAX: UShort = 0x0fu

public val SW_CNT: ULong = SW_MAX.toULong() + 1u

public const val MSC_MAX: UShort = 0x07u

public val MSC_CNT: ULong = MSC_MAX.toULong() + 1u

public const val LED_MAX: UShort = 0x0fu

public val LED_CNT: ULong = LED_MAX.toULong() + 1u

public const val REP_MAX: UShort = 0x01u

public val REP_CNT: ULong = REP_MAX.toULong() + 1u

public const val SND_MAX: UShort = 0x07u

public val SND_CNT: ULong = SND_MAX.toULong() + 1u

public const val UINPUT_VERSION: UInt = 5u

public const val UINPUT_MAX_NAME_SIZE: ULong = 80uL

public const val ETH_ALEN: Int = 6

public const val ETH_HLEN: Int = 14

public const val ETH_ZLEN: Int = 60

public const val ETH_DATA_LEN: Int = 1500

public const val ETH_FRAME_LEN: Int = 1514

public const val ETH_FCS_LEN: Int = 4

public const val ETH_MIN_MTU: Int = 68

public const val ETH_MAX_MTU: Int = 0xFFFF

public const val ETH_P_LOOP: Int = 0x0060

public const val ETH_P_PUP: Int = 0x0200

public const val ETH_P_PUPAT: Int = 0x0201

public const val ETH_P_TSN: Int = 0x22F0

public const val ETH_P_IP: Int = 0x0800

public const val ETH_P_X25: Int = 0x0805

public const val ETH_P_ARP: Int = 0x0806

public const val ETH_P_BPQ: Int = 0x08FF

public const val ETH_P_IEEEPUP: Int = 0x0a00

public const val ETH_P_IEEEPUPAT: Int = 0x0a01

public const val ETH_P_BATMAN: Int = 0x4305

public const val ETH_P_DEC: Int = 0x6000

public const val ETH_P_DNA_DL: Int = 0x6001

public const val ETH_P_DNA_RC: Int = 0x6002

public const val ETH_P_DNA_RT: Int = 0x6003

public const val ETH_P_LAT: Int = 0x6004

public const val ETH_P_DIAG: Int = 0x6005

public const val ETH_P_CUST: Int = 0x6006

public const val ETH_P_SCA: Int = 0x6007

public const val ETH_P_TEB: Int = 0x6558

public const val ETH_P_RARP: Int = 0x8035

public const val ETH_P_ATALK: Int = 0x809B

public const val ETH_P_AARP: Int = 0x80F3

public const val ETH_P_8021Q: Int = 0x8100

public const val ETH_P_ERSPAN: Int = 0x88BE

public const val ETH_P_IPX: Int = 0x8137

public const val ETH_P_IPV6: Int = 0x86DD

public const val ETH_P_PAUSE: Int = 0x8808

public const val ETH_P_SLOW: Int = 0x8809

public const val ETH_P_WCCP: Int = 0x883E

public const val ETH_P_MPLS_UC: Int = 0x8847

public const val ETH_P_MPLS_MC: Int = 0x8848

public const val ETH_P_ATMMPOA: Int = 0x884c

public const val ETH_P_PPP_DISC: Int = 0x8863

public const val ETH_P_PPP_SES: Int = 0x8864

public const val ETH_P_LINK_CTL: Int = 0x886c

public const val ETH_P_ATMFATE: Int = 0x8884

public const val ETH_P_PAE: Int = 0x888E

public const val ETH_P_AOE: Int = 0x88A2

public const val ETH_P_8021AD: Int = 0x88A8

public const val ETH_P_802_EX1: Int = 0x88B5

public const val ETH_P_TIPC: Int = 0x88CA

public const val ETH_P_MACSEC: Int = 0x88E5

public const val ETH_P_8021AH: Int = 0x88E7

public const val ETH_P_MVRP: Int = 0x88F5

public const val ETH_P_1588: Int = 0x88F7

public const val ETH_P_NCSI: Int = 0x88F8

public const val ETH_P_PRP: Int = 0x88FB

public const val ETH_P_FCOE: Int = 0x8906

public const val ETH_P_IBOE: Int = 0x8915

public const val ETH_P_TDLS: Int = 0x890D

public const val ETH_P_FIP: Int = 0x8914

public const val ETH_P_80221: Int = 0x8917

public const val ETH_P_HSR: Int = 0x892F

public const val ETH_P_NSH: Int = 0x894F

public const val ETH_P_LOOPBACK: Int = 0x9000

public const val ETH_P_QINQ1: Int = 0x9100

public const val ETH_P_QINQ2: Int = 0x9200

public const val ETH_P_QINQ3: Int = 0x9300

public const val ETH_P_EDSA: Int = 0xDADA

public const val ETH_P_IFE: Int = 0xED3E

public const val ETH_P_AF_IUCV: Int = 0xFBFB

public const val ETH_P_802_3_MIN: Int = 0x0600

public const val ETH_P_802_3: Int = 0x0001

public const val ETH_P_AX25: Int = 0x0002

public const val ETH_P_ALL: Int = 0x0003

public const val ETH_P_802_2: Int = 0x0004

public const val ETH_P_SNAP: Int = 0x0005

public const val ETH_P_DDCMP: Int = 0x0006

public const val ETH_P_WAN_PPP: Int = 0x0007

public const val ETH_P_PPP_MP: Int = 0x0008

public const val ETH_P_LOCALTALK: Int = 0x0009

public const val ETH_P_CAN: Int = 0x000C

public const val ETH_P_CANFD: Int = 0x000D

public const val ETH_P_PPPTALK: Int = 0x0010

public const val ETH_P_TR_802_2: Int = 0x0011

public const val ETH_P_MOBITEX: Int = 0x0015

public const val ETH_P_CONTROL: Int = 0x0016

public const val ETH_P_IRDA: Int = 0x0017

public const val ETH_P_ECONET: Int = 0x0018

public const val ETH_P_HDLC: Int = 0x0019

public const val ETH_P_ARCNET: Int = 0x001A

public const val ETH_P_DSA: Int = 0x001B

public const val ETH_P_TRAILER: Int = 0x001C

public const val ETH_P_PHONET: Int = 0x00F5

public const val ETH_P_IEEE802154: Int = 0x00F6

public const val ETH_P_CAIF: Int = 0x00F7

public const val ETH_P_XDSA: Int = 0x00F8

public const val ETH_P_MAP: Int = 0x00F9

public val NDA_UNSPEC: UShort = (0).toUShort()

public val NDA_DST: UShort = (1).toUShort()

public val NDA_LLADDR: UShort = (2).toUShort()

public val NDA_CACHEINFO: UShort = (3).toUShort()

public val NDA_PROBES: UShort = (4).toUShort()

public val NDA_VLAN: UShort = (5).toUShort()

public val NDA_PORT: UShort = (6).toUShort()

public val NDA_VNI: UShort = (7).toUShort()

public val NDA_IFINDEX: UShort = (8).toUShort()

public val NDA_MASTER: UShort = (9).toUShort()

public val NDA_LINK_NETNSID: UShort = (10).toUShort()

public val NDA_SRC_VNI: UShort = (11).toUShort()

public val NDA_PROTOCOL: UShort = (12).toUShort()

public val NDA_NH_ID: UShort = (13).toUShort()

public val NDA_FDB_EXT_ATTRS: UShort = (14).toUShort()

public val NDA_FLAGS_EXT: UShort = (15).toUShort()

public val NDA_NDM_STATE_MASK: UShort = (16).toUShort()

public val NDA_NDM_FLAGS_MASK: UShort = (17).toUShort()

public val NTF_USE: UByte = (0x01).toUByte()

public val NTF_SELF: UByte = (0x02).toUByte()

public val NTF_MASTER: UByte = (0x04).toUByte()

public val NTF_PROXY: UByte = (0x08).toUByte()

public val NTF_EXT_LEARNED: UByte = (0x10).toUByte()

public val NTF_OFFLOADED: UByte = (0x20).toUByte()

public val NTF_STICKY: UByte = (0x40).toUByte()

public val NTF_ROUTER: UByte = (0x80).toUByte()

public val NTF_EXT_MANAGED: UByte = (0x01).toUByte()

public val NTF_EXT_LOCKED: UByte = (0x02).toUByte()

public val NUD_NONE: UShort = (0x00).toUShort()

public val NUD_INCOMPLETE: UShort = (0x01).toUShort()

public val NUD_REACHABLE: UShort = (0x02).toUShort()

public val NUD_STALE: UShort = (0x04).toUShort()

public val NUD_DELAY: UShort = (0x08).toUShort()

public val NUD_PROBE: UShort = (0x10).toUShort()

public val NUD_FAILED: UShort = (0x20).toUShort()

public val NUD_NOARP: UShort = (0x40).toUShort()

public val NUD_PERMANENT: UShort = (0x80).toUShort()

public val NDTPA_UNSPEC: UShort = (0).toUShort()

public val NDTPA_IFINDEX: UShort = (1).toUShort()

public val NDTPA_REFCNT: UShort = (2).toUShort()

public val NDTPA_REACHABLE_TIME: UShort = (3).toUShort()

public val NDTPA_BASE_REACHABLE_TIME: UShort = (4).toUShort()

public val NDTPA_RETRANS_TIME: UShort = (5).toUShort()

public val NDTPA_GC_STALETIME: UShort = (6).toUShort()

public val NDTPA_DELAY_PROBE_TIME: UShort = (7).toUShort()

public val NDTPA_QUEUE_LEN: UShort = (8).toUShort()

public val NDTPA_APP_PROBES: UShort = (9).toUShort()

public val NDTPA_UCAST_PROBES: UShort = (10).toUShort()

public val NDTPA_MCAST_PROBES: UShort = (11).toUShort()

public val NDTPA_ANYCAST_DELAY: UShort = (12).toUShort()

public val NDTPA_PROXY_DELAY: UShort = (13).toUShort()

public val NDTPA_PROXY_QLEN: UShort = (14).toUShort()

public val NDTPA_LOCKTIME: UShort = (15).toUShort()

public val NDTPA_QUEUE_LENBYTES: UShort = (16).toUShort()

public val NDTPA_MCAST_REPROBES: UShort = (17).toUShort()

public val NDTPA_PAD: UShort = (18).toUShort()

public val NDTPA_INTERVAL_PROBE_TIME_MS: UShort = (19).toUShort()

public val NDTA_UNSPEC: UShort = (0).toUShort()

public val NDTA_NAME: UShort = (1).toUShort()

public val NDTA_THRESH1: UShort = (2).toUShort()

public val NDTA_THRESH2: UShort = (3).toUShort()

public val NDTA_THRESH3: UShort = (4).toUShort()

public val NDTA_CONFIG: UShort = (5).toUShort()

public val NDTA_PARMS: UShort = (6).toUShort()

public val NDTA_STATS: UShort = (7).toUShort()

public val NDTA_GC_INTERVAL: UShort = (8).toUShort()

public val NDTA_PAD: UShort = (9).toUShort()

public val FDB_NOTIFY_BIT: UShort = (0x01).toUShort()

public val FDB_NOTIFY_INACTIVE_BIT: UShort = (0x02).toUShort()

public val NFEA_UNSPEC: UShort = (0).toUShort()

public val NFEA_ACTIVITY_NOTIFY: UShort = (1).toUShort()

public val NFEA_DONT_REFRESH: UShort = (2).toUShort()

public const val SIOCADDRT: ULong = 0x0000890BuL

public const val SIOCDELRT: ULong = 0x0000890CuL

public const val SIOCRTMSG: ULong = 0x0000890DuL

public const val SIOCGIFNAME: ULong = 0x00008910uL

public const val SIOCSIFLINK: ULong = 0x00008911uL

public const val SIOCGIFCONF: ULong = 0x00008912uL

public const val SIOCGIFFLAGS: ULong = 0x00008913uL

public const val SIOCSIFFLAGS: ULong = 0x00008914uL

public const val SIOCGIFADDR: ULong = 0x00008915uL

public const val SIOCSIFADDR: ULong = 0x00008916uL

public const val SIOCGIFDSTADDR: ULong = 0x00008917uL

public const val SIOCSIFDSTADDR: ULong = 0x00008918uL

public const val SIOCGIFBRDADDR: ULong = 0x00008919uL

public const val SIOCSIFBRDADDR: ULong = 0x0000891AuL

public const val SIOCGIFNETMASK: ULong = 0x0000891BuL

public const val SIOCSIFNETMASK: ULong = 0x0000891CuL

public const val SIOCGIFMETRIC: ULong = 0x0000891DuL

public const val SIOCSIFMETRIC: ULong = 0x0000891EuL

public const val SIOCGIFMEM: ULong = 0x0000891FuL

public const val SIOCSIFMEM: ULong = 0x00008920uL

public const val SIOCGIFMTU: ULong = 0x00008921uL

public const val SIOCSIFMTU: ULong = 0x00008922uL

public const val SIOCSIFNAME: ULong = 0x00008923uL

public const val SIOCSIFHWADDR: ULong = 0x00008924uL

public const val SIOCGIFENCAP: ULong = 0x00008925uL

public const val SIOCSIFENCAP: ULong = 0x00008926uL

public const val SIOCGIFHWADDR: ULong = 0x00008927uL

public const val SIOCGIFSLAVE: ULong = 0x00008929uL

public const val SIOCSIFSLAVE: ULong = 0x00008930uL

public const val SIOCADDMULTI: ULong = 0x00008931uL

public const val SIOCDELMULTI: ULong = 0x00008932uL

public const val SIOCGIFINDEX: ULong = 0x00008933uL

public const val SIOGIFINDEX: ULong = SIOCGIFINDEX

public const val SIOCSIFPFLAGS: ULong = 0x00008934uL

public const val SIOCGIFPFLAGS: ULong = 0x00008935uL

public const val SIOCDIFADDR: ULong = 0x00008936uL

public const val SIOCSIFHWBROADCAST: ULong = 0x00008937uL

public const val SIOCGIFCOUNT: ULong = 0x00008938uL

public const val SIOCGIFBR: ULong = 0x00008940uL

public const val SIOCSIFBR: ULong = 0x00008941uL

public const val SIOCGIFTXQLEN: ULong = 0x00008942uL

public const val SIOCSIFTXQLEN: ULong = 0x00008943uL

public const val SIOCETHTOOL: ULong = 0x00008946uL

public const val SIOCGMIIPHY: ULong = 0x00008947uL

public const val SIOCGMIIREG: ULong = 0x00008948uL

public const val SIOCSMIIREG: ULong = 0x00008949uL

public const val SIOCWANDEV: ULong = 0x0000894AuL

public const val SIOCOUTQNSD: ULong = 0x0000894BuL

public const val SIOCGSKNS: ULong = 0x0000894CuL

public const val SIOCDARP: ULong = 0x00008953uL

public const val SIOCGARP: ULong = 0x00008954uL

public const val SIOCSARP: ULong = 0x00008955uL

public const val SIOCDRARP: ULong = 0x00008960uL

public const val SIOCGRARP: ULong = 0x00008961uL

public const val SIOCSRARP: ULong = 0x00008962uL

public const val SIOCGIFMAP: ULong = 0x00008970uL

public const val SIOCSIFMAP: ULong = 0x00008971uL

public const val SIOCADDDLCI: ULong = 0x00008980uL

public const val SIOCDELDLCI: ULong = 0x00008981uL

public const val SIOCGIFVLAN: ULong = 0x00008982uL

public const val SIOCSIFVLAN: ULong = 0x00008983uL

public const val SIOCBONDENSLAVE: ULong = 0x00008990uL

public const val SIOCBONDRELEASE: ULong = 0x00008991uL

public const val SIOCBONDSETHWADDR: ULong = 0x00008992uL

public const val SIOCBONDSLAVEINFOQUERY: ULong = 0x00008993uL

public const val SIOCBONDINFOQUERY: ULong = 0x00008994uL

public const val SIOCBONDCHANGEACTIVE: ULong = 0x00008995uL

public const val SIOCBRADDBR: ULong = 0x000089a0uL

public const val SIOCBRDELBR: ULong = 0x000089a1uL

public const val SIOCBRADDIF: ULong = 0x000089a2uL

public const val SIOCBRDELIF: ULong = 0x000089a3uL

public const val SIOCSHWTSTAMP: ULong = 0x000089b0uL

public const val SIOCGHWTSTAMP: ULong = 0x000089b1uL

public const val SIOCDEVPRIVATE: ULong = 0x000089F0uL

public const val SIOCPROTOPRIVATE: ULong = 0x000089E0uL

public const val MODULE_INIT_IGNORE_MODVERSIONS: UInt = 0x0001u

public const val MODULE_INIT_IGNORE_VERMAGIC: UInt = 0x0002u

public val SOF_TIMESTAMPING_TX_HARDWARE: UInt = 1u shl 0

public val SOF_TIMESTAMPING_TX_SOFTWARE: UInt = 1u shl 1

public val SOF_TIMESTAMPING_RX_HARDWARE: UInt = 1u shl 2

public val SOF_TIMESTAMPING_RX_SOFTWARE: UInt = 1u shl 3

public val SOF_TIMESTAMPING_SOFTWARE: UInt = 1u shl 4

public val SOF_TIMESTAMPING_SYS_HARDWARE: UInt = 1u shl 5

public val SOF_TIMESTAMPING_RAW_HARDWARE: UInt = 1u shl 6

public val SOF_TIMESTAMPING_OPT_ID: UInt = 1u shl 7

public val SOF_TIMESTAMPING_TX_SCHED: UInt = 1u shl 8

public val SOF_TIMESTAMPING_TX_ACK: UInt = 1u shl 9

public val SOF_TIMESTAMPING_OPT_CMSG: UInt = 1u shl 10

public val SOF_TIMESTAMPING_OPT_TSONLY: UInt = 1u shl 11

public val SOF_TIMESTAMPING_OPT_STATS: UInt = 1u shl 12

public val SOF_TIMESTAMPING_OPT_PKTINFO: UInt = 1u shl 13

public val SOF_TIMESTAMPING_OPT_TX_SWHW: UInt = 1u shl 14

public val SOF_TIMESTAMPING_BIND_PHC: UInt = 1u shl 15

public val SOF_TIMESTAMPING_OPT_ID_TCP: UInt = 1u shl 16

public val SOF_TIMESTAMPING_OPT_RX_FILTER: UInt = 1u shl 17

public const val ENOATTR: Int = ENODATA

public const val ALG_SET_KEY: Int = 1

public const val ALG_SET_IV: Int = 2

public const val ALG_SET_OP: Int = 3

public const val ALG_SET_AEAD_ASSOCLEN: Int = 4

public const val ALG_SET_AEAD_AUTHSIZE: Int = 5

public const val ALG_SET_DRBG_ENTROPY: Int = 6

public const val ALG_OP_DECRYPT: Int = 0

public const val ALG_OP_ENCRYPT: Int = 1

public const val MLOCK_ONFAULT: Int = 0x01

public const val VMADDR_CID_ANY: UInt = 0xFFFFFFFFu

public const val VMADDR_CID_HYPERVISOR: UInt = 0u

public const val VMADDR_CID_LOCAL: UInt = 1u

public const val VMADDR_CID_HOST: UInt = 2u

public const val VMADDR_PORT_ANY: UInt = 0xFFFFFFFFu

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

public const val IN_EXCL_UNLINK: UInt = 0x04000000u

public const val IN_MASK_CREATE: UInt = 0x10000000u

public const val IN_MASK_ADD: UInt = 0x20000000u

public const val IN_ISDIR: UInt = 0x40000000u

public const val IN_ONESHOT: UInt = 0x8000_0000u

public val IN_ALL_EVENTS: UInt = IN_ACCESS or IN_MODIFY or IN_ATTRIB or IN_CLOSE_WRITE or IN_CLOSE_NOWRITE or IN_OPEN or IN_MOVED_FROM or IN_MOVED_TO or IN_DELETE or IN_CREATE or IN_DELETE_SELF or IN_MOVE_SELF

public const val IN_CLOEXEC: Int = O_CLOEXEC

public const val IN_NONBLOCK: Int = O_NONBLOCK

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

public const val FUTEX_LOCK_PI2: Int = 13

public const val FUTEX_PRIVATE_FLAG: Int = 128

public const val FUTEX_CLOCK_REALTIME: Int = 256

public val FUTEX_CMD_MASK: Int = (FUTEX_PRIVATE_FLAG or FUTEX_CLOCK_REALTIME).inv()

public val SO_EE_ORIGIN_NONE: UByte = (0).toUByte()

public val SO_EE_ORIGIN_LOCAL: UByte = (1).toUByte()

public val SO_EE_ORIGIN_ICMP: UByte = (2).toUByte()

public val SO_EE_ORIGIN_ICMP6: UByte = (3).toUByte()

public val SO_EE_ORIGIN_TXSTATUS: UByte = (4).toUByte()

public val SO_EE_ORIGIN_TIMESTAMPING: UByte = SO_EE_ORIGIN_TXSTATUS

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

public const val EWOULDBLOCK: Int = EAGAIN

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val SCHED_NORMAL: Int = 0

public const val SCHED_FIFO: Int = 1

public const val SCHED_RR: Int = 2

public const val SCHED_BATCH: Int = 3

public const val SCHED_IDLE: Int = 5

public const val SCHED_DEADLINE: Int = 6

public const val SCHED_RESET_ON_FORK: Int = 0x40000000

public const val CLONE_PIDFD: Int = 0x1000

public const val CLONE_CLEAR_SIGHAND: ULong = 0x100000000uL

public const val CLONE_INTO_CGROUP: ULong = 0x200000000uL

public const val MEMBARRIER_CMD_QUERY: Int = 0

public val MEMBARRIER_CMD_GLOBAL: Int = 1 shl 0

public val MEMBARRIER_CMD_GLOBAL_EXPEDITED: Int = 1 shl 1

public val MEMBARRIER_CMD_REGISTER_GLOBAL_EXPEDITED: Int = 1 shl 2

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED: Int = 1 shl 3

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED: Int = 1 shl 4

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_SYNC_CORE: Int = 1 shl 5

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_SYNC_CORE: Int = 1 shl 6

public val MEMBARRIER_CMD_PRIVATE_EXPEDITED_RSEQ: Int = 1 shl 7

public val MEMBARRIER_CMD_REGISTER_PRIVATE_EXPEDITED_RSEQ: Int = 1 shl 8

public const val MPOL_DEFAULT: Int = 0

public const val MPOL_PREFERRED: Int = 1

public const val MPOL_BIND: Int = 2

public const val MPOL_INTERLEAVE: Int = 3

public const val MPOL_LOCAL: Int = 4

public val MPOL_F_NUMA_BALANCING: Int = 1 shl 13

public val MPOL_F_RELATIVE_NODES: Int = 1 shl 14

public val MPOL_F_STATIC_NODES: Int = 1 shl 15

public const val SEEK_DATA: Int = 3

public const val SEEK_HOLE: Int = 4

public const val AF_NFC: Int = 39

public const val AF_VSOCK: Int = 40

public const val PF_NFC: Int = AF_NFC

public const val PF_VSOCK: Int = AF_VSOCK

public const val SOMAXCONN: Int = 128

public const val PROP_VALUE_MAX: Int = 92

public const val PROP_NAME_MAX: Int = 32

public const val PR_SET_PDEATHSIG: Int = 1

public const val PR_GET_PDEATHSIG: Int = 2

public const val PR_GET_DUMPABLE: Int = 3

public const val PR_SET_DUMPABLE: Int = 4

public const val PR_GET_UNALIGN: Int = 5

public const val PR_SET_UNALIGN: Int = 6

public const val PR_UNALIGN_NOPRINT: Int = 1

public const val PR_UNALIGN_SIGBUS: Int = 2

public const val PR_GET_KEEPCAPS: Int = 7

public const val PR_SET_KEEPCAPS: Int = 8

public const val PR_GET_FPEMU: Int = 9

public const val PR_SET_FPEMU: Int = 10

public const val PR_FPEMU_NOPRINT: Int = 1

public const val PR_FPEMU_SIGFPE: Int = 2

public const val PR_GET_FPEXC: Int = 11

public const val PR_SET_FPEXC: Int = 12

public const val PR_FP_EXC_SW_ENABLE: Int = 0x80

public const val PR_FP_EXC_DIV: Int = 0x010000

public const val PR_FP_EXC_OVF: Int = 0x020000

public const val PR_FP_EXC_UND: Int = 0x040000

public const val PR_FP_EXC_RES: Int = 0x080000

public const val PR_FP_EXC_INV: Int = 0x100000

public const val PR_FP_EXC_DISABLED: Int = 0

public const val PR_FP_EXC_NONRECOV: Int = 1

public const val PR_FP_EXC_ASYNC: Int = 2

public const val PR_FP_EXC_PRECISE: Int = 3

public const val PR_GET_TIMING: Int = 13

public const val PR_SET_TIMING: Int = 14

public const val PR_TIMING_STATISTICAL: Int = 0

public const val PR_TIMING_TIMESTAMP: Int = 1

public const val PR_SET_NAME: Int = 15

public const val PR_GET_NAME: Int = 16

public const val PR_GET_ENDIAN: Int = 19

public const val PR_SET_ENDIAN: Int = 20

public const val PR_ENDIAN_BIG: Int = 0

public const val PR_ENDIAN_LITTLE: Int = 1

public const val PR_ENDIAN_PPC_LITTLE: Int = 2

public const val PR_GET_SECCOMP: Int = 21

public const val PR_SET_SECCOMP: Int = 22

public const val PR_CAPBSET_READ: Int = 23

public const val PR_CAPBSET_DROP: Int = 24

public const val PR_GET_TSC: Int = 25

public const val PR_SET_TSC: Int = 26

public const val PR_TSC_ENABLE: Int = 1

public const val PR_TSC_SIGSEGV: Int = 2

public const val PR_GET_SECUREBITS: Int = 27

public const val PR_SET_SECUREBITS: Int = 28

public const val PR_SET_TIMERSLACK: Int = 29

public const val PR_GET_TIMERSLACK: Int = 30

public const val PR_TASK_PERF_EVENTS_DISABLE: Int = 31

public const val PR_TASK_PERF_EVENTS_ENABLE: Int = 32

public const val PR_MCE_KILL: Int = 33

public const val PR_MCE_KILL_CLEAR: Int = 0

public const val PR_MCE_KILL_SET: Int = 1

public const val PR_MCE_KILL_LATE: Int = 0

public const val PR_MCE_KILL_EARLY: Int = 1

public const val PR_MCE_KILL_DEFAULT: Int = 2

public const val PR_MCE_KILL_GET: Int = 34

public const val PR_SET_MM: Int = 35

public const val PR_SET_MM_START_CODE: Int = 1

public const val PR_SET_MM_END_CODE: Int = 2

public const val PR_SET_MM_START_DATA: Int = 3

public const val PR_SET_MM_END_DATA: Int = 4

public const val PR_SET_MM_START_STACK: Int = 5

public const val PR_SET_MM_START_BRK: Int = 6

public const val PR_SET_MM_BRK: Int = 7

public const val PR_SET_MM_ARG_START: Int = 8

public const val PR_SET_MM_ARG_END: Int = 9

public const val PR_SET_MM_ENV_START: Int = 10

public const val PR_SET_MM_ENV_END: Int = 11

public const val PR_SET_MM_AUXV: Int = 12

public const val PR_SET_MM_EXE_FILE: Int = 13

public const val PR_SET_MM_MAP: Int = 14

public const val PR_SET_MM_MAP_SIZE: Int = 15

public const val PR_SET_PTRACER: Int = 0x59616d61

public const val PR_SET_PTRACER_ANY: ULong = 0xffffffffffffffffuL

public const val PR_SET_CHILD_SUBREAPER: Int = 36

public const val PR_GET_CHILD_SUBREAPER: Int = 37

public const val PR_SET_NO_NEW_PRIVS: Int = 38

public const val PR_GET_NO_NEW_PRIVS: Int = 39

public const val PR_GET_TID_ADDRESS: Int = 40

public const val PR_SET_THP_DISABLE: Int = 41

public const val PR_GET_THP_DISABLE: Int = 42

public const val PR_MPX_ENABLE_MANAGEMENT: Int = 43

public const val PR_MPX_DISABLE_MANAGEMENT: Int = 44

public const val PR_SET_FP_MODE: Int = 45

public const val PR_GET_FP_MODE: Int = 46

public val PR_FP_MODE_FR: Int = 1 shl 0

public val PR_FP_MODE_FRE: Int = 1 shl 1

public const val PR_CAP_AMBIENT: Int = 47

public const val PR_CAP_AMBIENT_IS_SET: Int = 1

public const val PR_CAP_AMBIENT_RAISE: Int = 2

public const val PR_CAP_AMBIENT_LOWER: Int = 3

public const val PR_CAP_AMBIENT_CLEAR_ALL: Int = 4

public const val PR_SVE_SET_VL: Int = 50

public val PR_SVE_SET_VL_ONEXEC: Int = 1 shl 18

public const val PR_SVE_GET_VL: Int = 51

public const val PR_SVE_VL_LEN_MASK: Int = 0xffff

public val PR_SVE_VL_INHERIT: Int = 1 shl 17

public const val PR_GET_SPECULATION_CTRL: Int = 52

public const val PR_SET_SPECULATION_CTRL: Int = 53

public const val PR_SPEC_STORE_BYPASS: Int = 0

public const val PR_SPEC_INDIRECT_BRANCH: Int = 1

public const val PR_SPEC_L1D_FLUSH: Int = 2

public const val PR_SPEC_NOT_AFFECTED: Int = 0

public val PR_SPEC_PRCTL: ULong = 1uL shl 0

public val PR_SPEC_ENABLE: ULong = 1uL shl 1

public val PR_SPEC_DISABLE: ULong = 1uL shl 2

public val PR_SPEC_FORCE_DISABLE: ULong = 1uL shl 3

public val PR_SPEC_DISABLE_NOEXEC: ULong = 1uL shl 4

public const val PR_PAC_RESET_KEYS: Int = 54

public val PR_PAC_APIAKEY: ULong = 1uL shl 0

public val PR_PAC_APIBKEY: ULong = 1uL shl 1

public val PR_PAC_APDAKEY: ULong = 1uL shl 2

public val PR_PAC_APDBKEY: ULong = 1uL shl 3

public val PR_PAC_APGAKEY: ULong = 1uL shl 4

public const val PR_SET_TAGGED_ADDR_CTRL: Int = 55

public const val PR_GET_TAGGED_ADDR_CTRL: Int = 56

public val PR_TAGGED_ADDR_ENABLE: ULong = 1uL shl 0

public const val PR_MTE_TCF_NONE: ULong = 0uL

public val PR_MTE_TCF_SYNC: ULong = 1uL shl 1

public val PR_MTE_TCF_ASYNC: ULong = 1uL shl 2

public val PR_MTE_TCF_MASK: ULong = PR_MTE_TCF_SYNC or PR_MTE_TCF_ASYNC

public const val PR_MTE_TAG_SHIFT: ULong = 3uL

public val PR_MTE_TAG_MASK: ULong = 0xffffuL shl PR_MTE_TAG_SHIFT.toInt()

public const val PR_MTE_TCF_SHIFT: ULong = 1uL

public const val PR_SET_IO_FLUSHER: Int = 57

public const val PR_GET_IO_FLUSHER: Int = 58

public const val PR_SET_SYSCALL_USER_DISPATCH: Int = 59

public const val PR_SYS_DISPATCH_OFF: Int = 0

public const val PR_SYS_DISPATCH_ON: Int = 1

public const val SYSCALL_DISPATCH_FILTER_ALLOW: Int = 0

public const val SYSCALL_DISPATCH_FILTER_BLOCK: Int = 1

public const val PR_PAC_SET_ENABLED_KEYS: Int = 60

public const val PR_PAC_GET_ENABLED_KEYS: Int = 61

public const val PR_SCHED_CORE: Int = 62

public const val PR_SCHED_CORE_GET: Int = 0

public const val PR_SCHED_CORE_CREATE: Int = 1

public const val PR_SCHED_CORE_SHARE_TO: Int = 2

public const val PR_SCHED_CORE_SHARE_FROM: Int = 3

public const val PR_SCHED_CORE_MAX: Int = 4

public const val PR_SCHED_CORE_SCOPE_THREAD: Int = 0

public const val PR_SCHED_CORE_SCOPE_THREAD_GROUP: Int = 1

public const val PR_SCHED_CORE_SCOPE_PROCESS_GROUP: Int = 2

public const val PR_SME_SET_VL: Int = 63

public val PR_SME_SET_VL_ONEXEC: Int = 1 shl 18

public const val PR_SME_GET_VL: Int = 64

public const val PR_SME_VL_LEN_MASK: Int = 0xffff

public val PR_SME_VL_INHERIT: Int = 1 shl 17

public const val PR_SET_MDWE: Int = 65

public val PR_MDWE_REFUSE_EXEC_GAIN: ULong = 1uL shl 0

public val PR_MDWE_NO_INHERIT: ULong = 1uL shl 1

public const val PR_GET_MDWE: Int = 66

public const val PR_SET_VMA: Int = 0x53564d41

public const val PR_SET_VMA_ANON_NAME: Int = 0

public const val PR_GET_AUXV: Int = 0x41555856

public const val PR_SET_MEMORY_MERGE: Int = 67

public const val PR_GET_MEMORY_MERGE: Int = 68

public const val PR_RISCV_V_SET_CONTROL: Int = 69

public const val PR_RISCV_V_GET_CONTROL: Int = 70

public const val PR_RISCV_V_VSTATE_CTRL_DEFAULT: Int = 0

public const val PR_RISCV_V_VSTATE_CTRL_OFF: Int = 1

public const val PR_RISCV_V_VSTATE_CTRL_ON: Int = 2

public val PR_RISCV_V_VSTATE_CTRL_INHERIT: Int = 1 shl 4

public const val PR_RISCV_V_VSTATE_CTRL_CUR_MASK: Int = 0x3

public const val PR_RISCV_V_VSTATE_CTRL_NEXT_MASK: Int = 0xc

public const val PR_RISCV_V_VSTATE_CTRL_MASK: Int = 0x1f

public val IFA_UNSPEC: UShort = (0).toUShort()

public val IFA_ADDRESS: UShort = (1).toUShort()

public val IFA_LOCAL: UShort = (2).toUShort()

public val IFA_LABEL: UShort = (3).toUShort()

public val IFA_BROADCAST: UShort = (4).toUShort()

public val IFA_ANYCAST: UShort = (5).toUShort()

public val IFA_CACHEINFO: UShort = (6).toUShort()

public val IFA_MULTICAST: UShort = (7).toUShort()

public const val IFA_F_SECONDARY: UInt = 0x01u

public const val IFA_F_TEMPORARY: UInt = 0x01u

public const val IFA_F_NODAD: UInt = 0x02u

public const val IFA_F_OPTIMISTIC: UInt = 0x04u

public const val IFA_F_DADFAILED: UInt = 0x08u

public const val IFA_F_HOMEADDRESS: UInt = 0x10u

public const val IFA_F_DEPRECATED: UInt = 0x20u

public const val IFA_F_TENTATIVE: UInt = 0x40u

public const val IFA_F_PERMANENT: UInt = 0x80u

public val IFLA_UNSPEC: UShort = (0).toUShort()

public val IFLA_ADDRESS: UShort = (1).toUShort()

public val IFLA_BROADCAST: UShort = (2).toUShort()

public val IFLA_IFNAME: UShort = (3).toUShort()

public val IFLA_MTU: UShort = (4).toUShort()

public val IFLA_LINK: UShort = (5).toUShort()

public val IFLA_QDISC: UShort = (6).toUShort()

public val IFLA_STATS: UShort = (7).toUShort()

public val IFLA_COST: UShort = (8).toUShort()

public val IFLA_PRIORITY: UShort = (9).toUShort()

public val IFLA_MASTER: UShort = (10).toUShort()

public val IFLA_WIRELESS: UShort = (11).toUShort()

public val IFLA_PROTINFO: UShort = (12).toUShort()

public val IFLA_TXQLEN: UShort = (13).toUShort()

public val IFLA_MAP: UShort = (14).toUShort()

public val IFLA_WEIGHT: UShort = (15).toUShort()

public val IFLA_OPERSTATE: UShort = (16).toUShort()

public val IFLA_LINKMODE: UShort = (17).toUShort()

public val IFLA_LINKINFO: UShort = (18).toUShort()

public val IFLA_NET_NS_PID: UShort = (19).toUShort()

public val IFLA_IFALIAS: UShort = (20).toUShort()

public val IFLA_NUM_VF: UShort = (21).toUShort()

public val IFLA_VFINFO_LIST: UShort = (22).toUShort()

public val IFLA_STATS64: UShort = (23).toUShort()

public val IFLA_VF_PORTS: UShort = (24).toUShort()

public val IFLA_PORT_SELF: UShort = (25).toUShort()

public val IFLA_AF_SPEC: UShort = (26).toUShort()

public val IFLA_GROUP: UShort = (27).toUShort()

public val IFLA_NET_NS_FD: UShort = (28).toUShort()

public val IFLA_EXT_MASK: UShort = (29).toUShort()

public val IFLA_PROMISCUITY: UShort = (30).toUShort()

public val IFLA_NUM_TX_QUEUES: UShort = (31).toUShort()

public val IFLA_NUM_RX_QUEUES: UShort = (32).toUShort()

public val IFLA_CARRIER: UShort = (33).toUShort()

public val IFLA_PHYS_PORT_ID: UShort = (34).toUShort()

public val IFLA_CARRIER_CHANGES: UShort = (35).toUShort()

public val IFLA_PHYS_SWITCH_ID: UShort = (36).toUShort()

public val IFLA_LINK_NETNSID: UShort = (37).toUShort()

public val IFLA_PHYS_PORT_NAME: UShort = (38).toUShort()

public val IFLA_PROTO_DOWN: UShort = (39).toUShort()

public val IFLA_GSO_MAX_SEGS: UShort = (40).toUShort()

public val IFLA_GSO_MAX_SIZE: UShort = (41).toUShort()

public val IFLA_PAD: UShort = (42).toUShort()

public val IFLA_XDP: UShort = (43).toUShort()

public val IFLA_EVENT: UShort = (44).toUShort()

public val IFLA_NEW_NETNSID: UShort = (45).toUShort()

public val IFLA_IF_NETNSID: UShort = (46).toUShort()

public val IFLA_TARGET_NETNSID: UShort = IFLA_IF_NETNSID

public val IFLA_CARRIER_UP_COUNT: UShort = (47).toUShort()

public val IFLA_CARRIER_DOWN_COUNT: UShort = (48).toUShort()

public val IFLA_NEW_IFINDEX: UShort = (49).toUShort()

public val IFLA_MIN_MTU: UShort = (50).toUShort()

public val IFLA_MAX_MTU: UShort = (51).toUShort()

public val IFLA_PROP_LIST: UShort = (52).toUShort()

public val IFLA_ALT_IFNAME: UShort = (53).toUShort()

public val IFLA_PERM_ADDRESS: UShort = (54).toUShort()

public val IFLA_PROTO_DOWN_REASON: UShort = (55).toUShort()

public val IFLA_PARENT_DEV_NAME: UShort = (56).toUShort()

public val IFLA_PARENT_DEV_BUS_NAME: UShort = (57).toUShort()

public val IFLA_GRO_MAX_SIZE: UShort = (58).toUShort()

public val IFLA_TSO_MAX_SIZE: UShort = (59).toUShort()

public val IFLA_TSO_MAX_SEGS: UShort = (60).toUShort()

public val IFLA_ALLMULTI: UShort = (61).toUShort()

public val IFLA_DEVLINK_PORT: UShort = (62).toUShort()

public val IFLA_GSO_IPV4_MAX_SIZE: UShort = (63).toUShort()

public val IFLA_GRO_IPV4_MAX_SIZE: UShort = (64).toUShort()

public val IFLA_INFO_UNSPEC: UShort = (0).toUShort()

public val IFLA_INFO_KIND: UShort = (1).toUShort()

public val IFLA_INFO_DATA: UShort = (2).toUShort()

public val IFLA_INFO_XSTATS: UShort = (3).toUShort()

public val IFLA_INFO_SLAVE_KIND: UShort = (4).toUShort()

public val IFLA_INFO_SLAVE_DATA: UShort = (5).toUShort()

public val TCA_UNSPEC: UShort = (0).toUShort()

public val TCA_KIND: UShort = (1).toUShort()

public val TCA_OPTIONS: UShort = (2).toUShort()

public val TCA_STATS: UShort = (3).toUShort()

public val TCA_XSTATS: UShort = (4).toUShort()

public val TCA_RATE: UShort = (5).toUShort()

public val TCA_FCNT: UShort = (6).toUShort()

public val TCA_STATS2: UShort = (7).toUShort()

public val TCA_STAB: UShort = (8).toUShort()

public val RTM_NEWLINK: UShort = (16).toUShort()

public val RTM_DELLINK: UShort = (17).toUShort()

public val RTM_GETLINK: UShort = (18).toUShort()

public val RTM_SETLINK: UShort = (19).toUShort()

public val RTM_NEWADDR: UShort = (20).toUShort()

public val RTM_DELADDR: UShort = (21).toUShort()

public val RTM_GETADDR: UShort = (22).toUShort()

public val RTM_NEWROUTE: UShort = (24).toUShort()

public val RTM_DELROUTE: UShort = (25).toUShort()

public val RTM_GETROUTE: UShort = (26).toUShort()

public val RTM_NEWNEIGH: UShort = (28).toUShort()

public val RTM_DELNEIGH: UShort = (29).toUShort()

public val RTM_GETNEIGH: UShort = (30).toUShort()

public val RTM_NEWRULE: UShort = (32).toUShort()

public val RTM_DELRULE: UShort = (33).toUShort()

public val RTM_GETRULE: UShort = (34).toUShort()

public val RTM_NEWQDISC: UShort = (36).toUShort()

public val RTM_DELQDISC: UShort = (37).toUShort()

public val RTM_GETQDISC: UShort = (38).toUShort()

public val RTM_NEWTCLASS: UShort = (40).toUShort()

public val RTM_DELTCLASS: UShort = (41).toUShort()

public val RTM_GETTCLASS: UShort = (42).toUShort()

public val RTM_NEWTFILTER: UShort = (44).toUShort()

public val RTM_DELTFILTER: UShort = (45).toUShort()

public val RTM_GETTFILTER: UShort = (46).toUShort()

public val RTM_NEWACTION: UShort = (48).toUShort()

public val RTM_DELACTION: UShort = (49).toUShort()

public val RTM_GETACTION: UShort = (50).toUShort()

public val RTM_NEWPREFIX: UShort = (52).toUShort()

public val RTM_GETMULTICAST: UShort = (58).toUShort()

public val RTM_GETANYCAST: UShort = (62).toUShort()

public val RTM_NEWNEIGHTBL: UShort = (64).toUShort()

public val RTM_GETNEIGHTBL: UShort = (66).toUShort()

public val RTM_SETNEIGHTBL: UShort = (67).toUShort()

public val RTM_NEWNDUSEROPT: UShort = (68).toUShort()

public val RTM_NEWADDRLABEL: UShort = (72).toUShort()

public val RTM_DELADDRLABEL: UShort = (73).toUShort()

public val RTM_GETADDRLABEL: UShort = (74).toUShort()

public val RTM_GETDCB: UShort = (78).toUShort()

public val RTM_SETDCB: UShort = (79).toUShort()

public val RTM_NEWNETCONF: UShort = (80).toUShort()

public val RTM_GETNETCONF: UShort = (82).toUShort()

public val RTM_NEWMDB: UShort = (84).toUShort()

public val RTM_DELMDB: UShort = (85).toUShort()

public val RTM_GETMDB: UShort = (86).toUShort()

public val RTM_NEWNSID: UShort = (88).toUShort()

public val RTM_DELNSID: UShort = (89).toUShort()

public val RTM_GETNSID: UShort = (90).toUShort()

public const val RTM_F_NOTIFY: UInt = 0x100u

public const val RTM_F_CLONED: UInt = 0x200u

public const val RTM_F_EQUALIZE: UInt = 0x400u

public const val RTM_F_PREFIX: UInt = 0x800u

public val RTA_UNSPEC: UShort = (0).toUShort()

public val RTA_DST: UShort = (1).toUShort()

public val RTA_SRC: UShort = (2).toUShort()

public val RTA_IIF: UShort = (3).toUShort()

public val RTA_OIF: UShort = (4).toUShort()

public val RTA_GATEWAY: UShort = (5).toUShort()

public val RTA_PRIORITY: UShort = (6).toUShort()

public val RTA_PREFSRC: UShort = (7).toUShort()

public val RTA_METRICS: UShort = (8).toUShort()

public val RTA_MULTIPATH: UShort = (9).toUShort()

public val RTA_PROTOINFO: UShort = (10).toUShort()

public val RTA_FLOW: UShort = (11).toUShort()

public val RTA_CACHEINFO: UShort = (12).toUShort()

public val RTA_SESSION: UShort = (13).toUShort()

public val RTA_MP_ALGO: UShort = (14).toUShort()

public val RTA_TABLE: UShort = (15).toUShort()

public val RTA_MARK: UShort = (16).toUShort()

public val RTA_MFC_STATS: UShort = (17).toUShort()

public val RTN_UNSPEC: UByte = (0).toUByte()

public val RTN_UNICAST: UByte = (1).toUByte()

public val RTN_LOCAL: UByte = (2).toUByte()

public val RTN_BROADCAST: UByte = (3).toUByte()

public val RTN_ANYCAST: UByte = (4).toUByte()

public val RTN_MULTICAST: UByte = (5).toUByte()

public val RTN_BLACKHOLE: UByte = (6).toUByte()

public val RTN_UNREACHABLE: UByte = (7).toUByte()

public val RTN_PROHIBIT: UByte = (8).toUByte()

public val RTN_THROW: UByte = (9).toUByte()

public val RTN_NAT: UByte = (10).toUByte()

public val RTN_XRESOLVE: UByte = (11).toUByte()

public val RTPROT_UNSPEC: UByte = (0).toUByte()

public val RTPROT_REDIRECT: UByte = (1).toUByte()

public val RTPROT_KERNEL: UByte = (2).toUByte()

public val RTPROT_BOOT: UByte = (3).toUByte()

public val RTPROT_STATIC: UByte = (4).toUByte()

public val RT_SCOPE_UNIVERSE: UByte = (0).toUByte()

public val RT_SCOPE_SITE: UByte = (200).toUByte()

public val RT_SCOPE_LINK: UByte = (253).toUByte()

public val RT_SCOPE_HOST: UByte = (254).toUByte()

public val RT_SCOPE_NOWHERE: UByte = (255).toUByte()

public val RT_TABLE_UNSPEC: UByte = (0).toUByte()

public val RT_TABLE_COMPAT: UByte = (252).toUByte()

public val RT_TABLE_DEFAULT: UByte = (253).toUByte()

public val RT_TABLE_MAIN: UByte = (254).toUByte()

public val RT_TABLE_LOCAL: UByte = (255).toUByte()

public const val RTMSG_NEWDEVICE: UInt = 0x11u

public const val RTMSG_DELDEVICE: UInt = 0x12u

public const val RTMSG_NEWROUTE: UInt = 0x21u

public const val RTMSG_DELROUTE: UInt = 0x22u

public const val CTL_KERN: Int = 1

public const val CTL_VM: Int = 2

public const val CTL_NET: Int = 3

public const val CTL_FS: Int = 5

public const val CTL_DEBUG: Int = 6

public const val CTL_DEV: Int = 7

public const val CTL_BUS: Int = 8

public const val CTL_ABI: Int = 9

public const val CTL_CPU: Int = 10

public const val CTL_BUS_ISA: Int = 1

public const val INOTIFY_MAX_USER_INSTANCES: Int = 1

public const val INOTIFY_MAX_USER_WATCHES: Int = 2

public const val INOTIFY_MAX_QUEUED_EVENTS: Int = 3

public const val KERN_OSTYPE: Int = 1

public const val KERN_OSRELEASE: Int = 2

public const val KERN_OSREV: Int = 3

public const val KERN_VERSION: Int = 4

public const val KERN_SECUREMASK: Int = 5

public const val KERN_PROF: Int = 6

public const val KERN_NODENAME: Int = 7

public const val KERN_DOMAINNAME: Int = 8

public const val KERN_PANIC: Int = 15

public const val KERN_REALROOTDEV: Int = 16

public const val KERN_SPARC_REBOOT: Int = 21

public const val KERN_CTLALTDEL: Int = 22

public const val KERN_PRINTK: Int = 23

public const val KERN_NAMETRANS: Int = 24

public const val KERN_PPC_HTABRECLAIM: Int = 25

public const val KERN_PPC_ZEROPAGED: Int = 26

public const val KERN_PPC_POWERSAVE_NAP: Int = 27

public const val KERN_MODPROBE: Int = 28

public const val KERN_SG_BIG_BUFF: Int = 29

public const val KERN_ACCT: Int = 30

public const val KERN_PPC_L2CR: Int = 31

public const val KERN_RTSIGNR: Int = 32

public const val KERN_RTSIGMAX: Int = 33

public const val KERN_SHMMAX: Int = 34

public const val KERN_MSGMAX: Int = 35

public const val KERN_MSGMNB: Int = 36

public const val KERN_MSGPOOL: Int = 37

public const val KERN_SYSRQ: Int = 38

public const val KERN_MAX_THREADS: Int = 39

public const val KERN_RANDOM: Int = 40

public const val KERN_SHMALL: Int = 41

public const val KERN_MSGMNI: Int = 42

public const val KERN_SEM: Int = 43

public const val KERN_SPARC_STOP_A: Int = 44

public const val KERN_SHMMNI: Int = 45

public const val KERN_OVERFLOWUID: Int = 46

public const val KERN_OVERFLOWGID: Int = 47

public const val KERN_SHMPATH: Int = 48

public const val KERN_HOTPLUG: Int = 49

public const val KERN_IEEE_EMULATION_WARNINGS: Int = 50

public const val KERN_S390_USER_DEBUG_LOGGING: Int = 51

public const val KERN_CORE_USES_PID: Int = 52

public const val KERN_TAINTED: Int = 53

public const val KERN_CADPID: Int = 54

public const val KERN_PIDMAX: Int = 55

public const val KERN_CORE_PATTERN: Int = 56

public const val KERN_PANIC_ON_OOPS: Int = 57

public const val KERN_HPPA_PWRSW: Int = 58

public const val KERN_HPPA_UNALIGNED: Int = 59

public const val KERN_PRINTK_RATELIMIT: Int = 60

public const val KERN_PRINTK_RATELIMIT_BURST: Int = 61

public const val KERN_PTY: Int = 62

public const val KERN_NGROUPS_MAX: Int = 63

public const val KERN_SPARC_SCONS_PWROFF: Int = 64

public const val KERN_HZ_TIMER: Int = 65

public const val KERN_UNKNOWN_NMI_PANIC: Int = 66

public const val KERN_BOOTLOADER_TYPE: Int = 67

public const val KERN_RANDOMIZE: Int = 68

public const val KERN_SETUID_DUMPABLE: Int = 69

public const val KERN_SPIN_RETRY: Int = 70

public const val KERN_ACPI_VIDEO_FLAGS: Int = 71

public const val KERN_IA64_UNALIGNED: Int = 72

public const val KERN_COMPAT_LOG: Int = 73

public const val KERN_MAX_LOCK_DEPTH: Int = 74

public const val VM_OVERCOMMIT_MEMORY: Int = 5

public const val VM_PAGE_CLUSTER: Int = 10

public const val VM_DIRTY_BACKGROUND: Int = 11

public const val VM_DIRTY_RATIO: Int = 12

public const val VM_DIRTY_WB_CS: Int = 13

public const val VM_DIRTY_EXPIRE_CS: Int = 14

public const val VM_NR_PDFLUSH_THREADS: Int = 15

public const val VM_OVERCOMMIT_RATIO: Int = 16

public const val VM_PAGEBUF: Int = 17

public const val VM_HUGETLB_PAGES: Int = 18

public const val VM_SWAPPINESS: Int = 19

public const val VM_LOWMEM_RESERVE_RATIO: Int = 20

public const val VM_MIN_FREE_KBYTES: Int = 21

public const val VM_MAX_MAP_COUNT: Int = 22

public const val VM_LAPTOP_MODE: Int = 23

public const val VM_BLOCK_DUMP: Int = 24

public const val VM_HUGETLB_GROUP: Int = 25

public const val VM_VFS_CACHE_PRESSURE: Int = 26

public const val VM_LEGACY_VA_LAYOUT: Int = 27

public const val VM_SWAP_TOKEN_TIMEOUT: Int = 28

public const val VM_DROP_PAGECACHE: Int = 29

public const val VM_PERCPU_PAGELIST_FRACTION: Int = 30

public const val VM_ZONE_RECLAIM_MODE: Int = 31

public const val VM_MIN_UNMAPPED: Int = 32

public const val VM_PANIC_ON_OOM: Int = 33

public const val VM_VDSO_ENABLED: Int = 34

public const val NET_CORE: Int = 1

public const val NET_ETHER: Int = 2

public const val NET_802: Int = 3

public const val NET_UNIX: Int = 4

public const val NET_IPV4: Int = 5

public const val NET_IPX: Int = 6

public const val NET_ATALK: Int = 7

public const val NET_NETROM: Int = 8

public const val NET_AX25: Int = 9

public const val NET_BRIDGE: Int = 10

public const val NET_ROSE: Int = 11

public const val NET_IPV6: Int = 12

public const val NET_X25: Int = 13

public const val NET_TR: Int = 14

public const val NET_DECNET: Int = 15

public const val NET_ECONET: Int = 16

public const val NET_SCTP: Int = 17

public const val NET_LLC: Int = 18

public const val NET_NETFILTER: Int = 19

public const val NET_DCCP: Int = 20

public const val HUGETLB_FLAG_ENCODE_SHIFT: Int = 26

public const val MAP_HUGE_SHIFT: Int = HUGETLB_FLAG_ENCODE_SHIFT

public const val PF_VCPU: Int = 0x00000001

public const val PF_IDLE: Int = 0x00000002

public const val PF_EXITING: Int = 0x00000004

public const val PF_POSTCOREDUMP: Int = 0x00000008

public const val PF_IO_WORKER: Int = 0x00000010

public const val PF_WQ_WORKER: Int = 0x00000020

public const val PF_FORKNOEXEC: Int = 0x00000040

public const val PF_MCE_PROCESS: Int = 0x00000080

public const val PF_SUPERPRIV: Int = 0x00000100

public const val PF_DUMPCORE: Int = 0x00000200

public const val PF_SIGNALED: Int = 0x00000400

public const val PF_MEMALLOC: Int = 0x00000800

public const val PF_NPROC_EXCEEDED: Int = 0x00001000

public const val PF_USED_MATH: Int = 0x00002000

public const val PF_USER_WORKER: Int = 0x00004000

public const val PF_NOFREEZE: Int = 0x00008000

public const val PF_KSWAPD: Int = 0x00020000

public const val PF_MEMALLOC_NOFS: Int = 0x00040000

public const val PF_MEMALLOC_NOIO: Int = 0x00080000

public const val PF_LOCAL_THROTTLE: Int = 0x00100000

public const val PF_KTHREAD: Int = 0x00200000

public const val PF_RANDOMIZE: Int = 0x00400000

public const val PF_NO_SETAFFINITY: Int = 0x04000000

public const val PF_MCE_EARLY: Int = 0x08000000

public const val PF_MEMALLOC_PIN: Int = 0x10000000

public const val PF_SUSPEND_TASK: Int = 0x80000000.toInt()

public const val KLOG_CLOSE: Int = 0

public const val KLOG_OPEN: Int = 1

public const val KLOG_READ: Int = 2

public const val KLOG_READ_ALL: Int = 3

public const val KLOG_READ_CLEAR: Int = 4

public const val KLOG_CLEAR: Int = 5

public const val KLOG_CONSOLE_OFF: Int = 6

public const val KLOG_CONSOLE_ON: Int = 7

public const val KLOG_CONSOLE_LEVEL: Int = 8

public const val KLOG_SIZE_UNREAD: Int = 9

public const val KLOG_SIZE_BUFFER: Int = 10

public const val AT_NULL: ULong = 0uL

public const val AT_IGNORE: ULong = 1uL

public const val AT_EXECFD: ULong = 2uL

public const val AT_PHDR: ULong = 3uL

public const val AT_PHENT: ULong = 4uL

public const val AT_PHNUM: ULong = 5uL

public const val AT_PAGESZ: ULong = 6uL

public const val AT_BASE: ULong = 7uL

public const val AT_FLAGS: ULong = 8uL

public const val AT_ENTRY: ULong = 9uL

public const val AT_NOTELF: ULong = 10uL

public const val AT_UID: ULong = 11uL

public const val AT_EUID: ULong = 12uL

public const val AT_GID: ULong = 13uL

public const val AT_EGID: ULong = 14uL

public const val AT_PLATFORM: ULong = 15uL

public const val AT_HWCAP: ULong = 16uL

public const val AT_CLKTCK: ULong = 17uL

public const val AT_SECURE: ULong = 23uL

public const val AT_BASE_PLATFORM: ULong = 24uL

public const val AT_RANDOM: ULong = 25uL

public const val AT_HWCAP2: ULong = 26uL

public const val AT_RSEQ_FEATURE_SIZE: ULong = 27uL

public const val AT_RSEQ_ALIGN: ULong = 28uL

public const val AT_HWCAP3: ULong = 29uL

public const val AT_HWCAP4: ULong = 30uL

public const val AT_EXECFN: ULong = 31uL

public const val AT_MINSIGSTKSZ: ULong = 51uL

public const val SI_DETHREAD: Int = -7

public const val TRAP_PERF: Int = 6

public const val XFS_SUPER_MAGIC: Long = 0x58465342
