package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.INT_MAX
import io.github.kotlinmania.libc.unix.INT_MIN
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.aix.LC_MESSAGES_MASK
import io.github.kotlinmania.libc.unix.aix.LC_MONETARY_MASK
import io.github.kotlinmania.libc.unix.aix.LC_NUMERIC_MASK
import io.github.kotlinmania.libc.unix.aix.LC_TIME_MASK
import io.github.kotlinmania.libc.unix.bsd.apple.LC_COLLATE_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_CTYPE_MASK
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.aarch64.O_DIRECTORY

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

public val IEXTEN: TcflagT = 0x00008000u

public val TOSTOP: TcflagT = 0x00000100u

public val FLUSHO: TcflagT = 0x00001000u

public val EXTPROC: TcflagT = 65536u

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

public val CBAUD: TcflagT = 4111u

public val TAB1: TcflagT = 0x00000800u

public val TAB2: TcflagT = 0x00001000u

public val TAB3: TcflagT = 0x00001800u

public val CR1: TcflagT = 0x00000200u

public val CR2: TcflagT = 0x00000400u

public val CR3: TcflagT = 0x00000600u

public val FF1: TcflagT = 0x00008000u

public val BS1: TcflagT = 0x00002000u

public val VT1: TcflagT = 0x00004000u

public val VWERASE: Int = 14

public val VREPRINT: Int = 12

public val VSUSP: Int = 10

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VDISCARD: Int = 13

public val VTIME: Int = 5

public val IUCLC: TcflagT = 0x00000200u

public val IXON: TcflagT = 0x00000400u

public val IXOFF: TcflagT = 0x00001000u

public val ONLCR: TcflagT = 0x4u

public val CSIZE: TcflagT = 0x00000030u

public val CS6: TcflagT = 0x00000010u

public val CS7: TcflagT = 0x00000020u

public val CS8: TcflagT = 0x00000030u

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

public val ECHOPRT: TcflagT = 0x00000400u

public val ECHOCTL: TcflagT = 0x00000200u

public val ISIG: TcflagT = 0x00000001u

public val ICANON: TcflagT = 0x00000002u

public val PENDIN: TcflagT = 0x00004000u

public val NOFLSH: TcflagT = 0x00000080u

public val VSWTC: Int = 7

public val OLCUC: TcflagT = 2u

public val NLDLY: TcflagT = 256u

public val CRDLY: TcflagT = 1536u

public val TABDLY: TcflagT = 6144u

public val BSDLY: TcflagT = 8192u

public val FFDLY: TcflagT = 32768u

public val VTDLY: TcflagT = 16384u

public val XCASE: TcflagT = 4u

public val XTABS: TcflagT = 6144u

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

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val BOTHER: SpeedT = 4096u

public val B57600: SpeedT = 4097u

public val B115200: SpeedT = 4098u

public val B230400: SpeedT = 4099u

public val B460800: SpeedT = 4100u

public val B500000: SpeedT = 4101u

public val B576000: SpeedT = 4102u

public val B921600: SpeedT = 4103u

public val B1000000: SpeedT = 4104u

public val B1152000: SpeedT = 4105u

public val B1500000: SpeedT = 4106u

public val B2000000: SpeedT = 4107u

public val B2500000: SpeedT = 4108u

public val B3000000: SpeedT = 4109u

public val B3500000: SpeedT = 4110u

public val B4000000: SpeedT = 4111u

public val IBSHIFT: TcflagT = 16u

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

public val CIBAUD: TcflagT = 269418496u

public val CBAUDEX: TcflagT = 4096u

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

public val IUTF8: TcflagT = 0x00004000u

public val CMSPAR: TcflagT = 1073741824u

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
