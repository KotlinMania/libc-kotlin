// port-lint: source unix/linux_like/emscripten/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public const val MADV_SOFT_OFFLINE: Int = 101

public const val MS_NOUSER: ULong = 0x80000000uL

public const val MS_RMT_MASK: ULong = 0x02800051uL

public const val ABDAY_1: Int = 0x20000

public const val ABDAY_2: Int = 0x20001

public const val ABDAY_3: Int = 0x20002

public const val ABDAY_4: Int = 0x20003

public const val ABDAY_5: Int = 0x20004

public const val ABDAY_6: Int = 0x20005

public const val ABDAY_7: Int = 0x20006

public const val DAY_1: Int = 0x20007

public const val DAY_2: Int = 0x20008

public const val DAY_3: Int = 0x20009

public const val DAY_4: Int = 0x2000A

public const val DAY_5: Int = 0x2000B

public const val DAY_6: Int = 0x2000C

public const val DAY_7: Int = 0x2000D

public const val ABMON_1: Int = 0x2000E

public const val ABMON_2: Int = 0x2000F

public const val ABMON_3: Int = 0x20010

public const val ABMON_4: Int = 0x20011

public const val ABMON_5: Int = 0x20012

public const val ABMON_6: Int = 0x20013

public const val ABMON_7: Int = 0x20014

public const val ABMON_8: Int = 0x20015

public const val ABMON_9: Int = 0x20016

public const val ABMON_10: Int = 0x20017

public const val ABMON_11: Int = 0x20018

public const val ABMON_12: Int = 0x20019

public const val MON_1: Int = 0x2001A

public const val MON_2: Int = 0x2001B

public const val MON_3: Int = 0x2001C

public const val MON_4: Int = 0x2001D

public const val MON_5: Int = 0x2001E

public const val MON_6: Int = 0x2001F

public const val MON_7: Int = 0x20020

public const val MON_8: Int = 0x20021

public const val MON_9: Int = 0x20022

public const val MON_10: Int = 0x20023

public const val MON_11: Int = 0x20024

public const val MON_12: Int = 0x20025

public const val AM_STR: Int = 0x20026

public const val PM_STR: Int = 0x20027

public const val D_T_FMT: Int = 0x20028

public const val D_FMT: Int = 0x20029

public const val T_FMT: Int = 0x2002A

public const val T_FMT_AMPM: Int = 0x2002B

public const val ERA: Int = 0x2002C

public const val ERA_D_FMT: Int = 0x2002E

public const val ALT_DIGITS: Int = 0x2002F

public const val ERA_D_T_FMT: Int = 0x20030

public const val ERA_T_FMT: Int = 0x20031

public const val CODESET: Int = 14

public const val CRNCYSTR: Int = 0x4000F

public const val RUSAGE_THREAD: Int = 1

public const val RUSAGE_CHILDREN: Int = -1

public const val RADIXCHAR: Int = 0x10000

public const val THOUSEP: Int = 0x10001

public const val YESEXPR: Int = 0x50000

public const val NOEXPR: Int = 0x50001

public const val YESSTR: Int = 0x50002

public const val NOSTR: Int = 0x50003

public const val FILENAME_MAX: UInt = 4096u

public const val L_tmpnam: UInt = 20u

public const val _PC_LINK_MAX: Int = 0

public const val _PC_MAX_CANON: Int = 1

public const val _PC_MAX_INPUT: Int = 2

public const val _PC_NAME_MAX: Int = 3

public const val _PC_PATH_MAX: Int = 4

public const val _PC_PIPE_BUF: Int = 5

public const val _PC_CHOWN_RESTRICTED: Int = 6

public const val _PC_NO_TRUNC: Int = 7

public const val _PC_VDISABLE: Int = 8

public const val _PC_SYNC_IO: Int = 9

public const val _PC_ASYNC_IO: Int = 10

public const val _PC_PRIO_IO: Int = 11

public const val _PC_SOCK_MAXBUF: Int = 12

public const val _PC_FILESIZEBITS: Int = 13

public const val _PC_REC_INCR_XFER_SIZE: Int = 14

public const val _PC_REC_MAX_XFER_SIZE: Int = 15

public const val _PC_REC_MIN_XFER_SIZE: Int = 16

public const val _PC_REC_XFER_ALIGN: Int = 17

public const val _PC_ALLOC_SIZE_MIN: Int = 18

public const val _PC_SYMLINK_MAX: Int = 19

public const val _PC_2_SYMLINKS: Int = 20

public const val _SC_ARG_MAX: Int = 0

public const val _SC_CHILD_MAX: Int = 1

public const val _SC_CLK_TCK: Int = 2

public const val _SC_NGROUPS_MAX: Int = 3

public const val _SC_OPEN_MAX: Int = 4

public const val _SC_STREAM_MAX: Int = 5

public const val _SC_TZNAME_MAX: Int = 6

public const val _SC_JOB_CONTROL: Int = 7

public const val _SC_SAVED_IDS: Int = 8

public const val _SC_REALTIME_SIGNALS: Int = 9

public const val _SC_PRIORITY_SCHEDULING: Int = 10

public const val _SC_TIMERS: Int = 11

public const val _SC_ASYNCHRONOUS_IO: Int = 12

public const val _SC_PRIORITIZED_IO: Int = 13

public const val _SC_SYNCHRONIZED_IO: Int = 14

public const val _SC_FSYNC: Int = 15

public const val _SC_MAPPED_FILES: Int = 16

public const val _SC_MEMLOCK: Int = 17

public const val _SC_MEMLOCK_RANGE: Int = 18

public const val _SC_MEMORY_PROTECTION: Int = 19

public const val _SC_MESSAGE_PASSING: Int = 20

public const val _SC_SEMAPHORES: Int = 21

public const val _SC_SHARED_MEMORY_OBJECTS: Int = 22

public const val _SC_AIO_LISTIO_MAX: Int = 23

public const val _SC_AIO_MAX: Int = 24

public const val _SC_AIO_PRIO_DELTA_MAX: Int = 25

public const val _SC_DELAYTIMER_MAX: Int = 26

public const val _SC_MQ_OPEN_MAX: Int = 27

public const val _SC_MQ_PRIO_MAX: Int = 28

public const val _SC_VERSION: Int = 29

public const val _SC_PAGESIZE: Int = 30

public const val _SC_PAGE_SIZE: Int = _SC_PAGESIZE

public const val _SC_RTSIG_MAX: Int = 31

public const val _SC_SEM_NSEMS_MAX: Int = 32

public const val _SC_SEM_VALUE_MAX: Int = 33

public const val _SC_SIGQUEUE_MAX: Int = 34

public const val _SC_TIMER_MAX: Int = 35

public const val _SC_BC_BASE_MAX: Int = 36

public const val _SC_BC_DIM_MAX: Int = 37

public const val _SC_BC_SCALE_MAX: Int = 38

public const val _SC_BC_STRING_MAX: Int = 39

public const val _SC_COLL_WEIGHTS_MAX: Int = 40

public const val _SC_EXPR_NEST_MAX: Int = 42

public const val _SC_LINE_MAX: Int = 43

public const val _SC_RE_DUP_MAX: Int = 44

public const val _SC_2_VERSION: Int = 46

public const val _SC_2_C_BIND: Int = 47

public const val _SC_2_C_DEV: Int = 48

public const val _SC_2_FORT_DEV: Int = 49

public const val _SC_2_FORT_RUN: Int = 50

public const val _SC_2_SW_DEV: Int = 51

public const val _SC_2_LOCALEDEF: Int = 52

public const val _SC_UIO_MAXIOV: Int = 60

public const val _SC_IOV_MAX: Int = 60

public const val _SC_THREADS: Int = 67

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 68

public const val _SC_GETGR_R_SIZE_MAX: Int = 69

public const val _SC_GETPW_R_SIZE_MAX: Int = 70

public const val _SC_LOGIN_NAME_MAX: Int = 71

public const val _SC_TTY_NAME_MAX: Int = 72

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 73

public const val _SC_THREAD_KEYS_MAX: Int = 74

public const val _SC_THREAD_STACK_MIN: Int = 75

public const val _SC_THREAD_THREADS_MAX: Int = 76

public const val _SC_THREAD_ATTR_STACKADDR: Int = 77

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 78

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 79

public const val _SC_THREAD_PRIO_INHERIT: Int = 80

public const val _SC_THREAD_PRIO_PROTECT: Int = 81

public const val _SC_THREAD_PROCESS_SHARED: Int = 82

public const val _SC_NPROCESSORS_CONF: Int = 83

public const val _SC_NPROCESSORS_ONLN: Int = 84

public const val _SC_PHYS_PAGES: Int = 85

public const val _SC_AVPHYS_PAGES: Int = 86

public const val _SC_ATEXIT_MAX: Int = 87

public const val _SC_PASS_MAX: Int = 88

public const val _SC_XOPEN_VERSION: Int = 89

public const val _SC_XOPEN_XCU_VERSION: Int = 90

public const val _SC_XOPEN_UNIX: Int = 91

public const val _SC_XOPEN_CRYPT: Int = 92

public const val _SC_XOPEN_ENH_I18N: Int = 93

public const val _SC_XOPEN_SHM: Int = 94

public const val _SC_2_CHAR_TERM: Int = 95

public const val _SC_2_UPE: Int = 97

public const val _SC_XOPEN_XPG2: Int = 98

public const val _SC_XOPEN_XPG3: Int = 99

public const val _SC_XOPEN_XPG4: Int = 100

public const val _SC_NZERO: Int = 109

public const val _SC_XBS5_ILP32_OFF32: Int = 125

public const val _SC_XBS5_ILP32_OFFBIG: Int = 126

public const val _SC_XBS5_LP64_OFF64: Int = 127

public const val _SC_XBS5_LPBIG_OFFBIG: Int = 128

public const val _SC_XOPEN_LEGACY: Int = 129

public const val _SC_XOPEN_REALTIME: Int = 130

public const val _SC_XOPEN_REALTIME_THREADS: Int = 131

public const val _SC_ADVISORY_INFO: Int = 132

public const val _SC_BARRIERS: Int = 133

public const val _SC_CLOCK_SELECTION: Int = 137

public const val _SC_CPUTIME: Int = 138

public const val _SC_THREAD_CPUTIME: Int = 139

public const val _SC_MONOTONIC_CLOCK: Int = 149

public const val _SC_READER_WRITER_LOCKS: Int = 153

public const val _SC_SPIN_LOCKS: Int = 154

public const val _SC_REGEXP: Int = 155

public const val _SC_SHELL: Int = 157

public const val _SC_SPAWN: Int = 159

public const val _SC_SPORADIC_SERVER: Int = 160

public const val _SC_THREAD_SPORADIC_SERVER: Int = 161

public const val _SC_TIMEOUTS: Int = 164

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 165

public const val _SC_2_PBS: Int = 168

public const val _SC_2_PBS_ACCOUNTING: Int = 169

public const val _SC_2_PBS_LOCATE: Int = 170

public const val _SC_2_PBS_MESSAGE: Int = 171

public const val _SC_2_PBS_TRACK: Int = 172

public const val _SC_SYMLOOP_MAX: Int = 173

public const val _SC_STREAMS: Int = 174

public const val _SC_2_PBS_CHECKPOINT: Int = 175

public const val _SC_V6_ILP32_OFF32: Int = 176

public const val _SC_V6_ILP32_OFFBIG: Int = 177

public const val _SC_V6_LP64_OFF64: Int = 178

public const val _SC_V6_LPBIG_OFFBIG: Int = 179

public const val _SC_HOST_NAME_MAX: Int = 180

public const val _SC_TRACE: Int = 181

public const val _SC_TRACE_EVENT_FILTER: Int = 182

public const val _SC_TRACE_INHERIT: Int = 183

public const val _SC_TRACE_LOG: Int = 184

public const val _SC_IPV6: Int = 235

public const val _SC_RAW_SOCKETS: Int = 236

public const val _SC_V7_ILP32_OFF32: Int = 237

public const val _SC_V7_ILP32_OFFBIG: Int = 238

public const val _SC_V7_LP64_OFF64: Int = 239

public const val _SC_V7_LPBIG_OFFBIG: Int = 240

public const val _SC_SS_REPL_MAX: Int = 241

public const val _SC_TRACE_EVENT_NAME_MAX: Int = 242

public const val _SC_TRACE_NAME_MAX: Int = 243

public const val _SC_TRACE_SYS_MAX: Int = 244

public const val _SC_TRACE_USER_EVENT_MAX: Int = 245

public const val _SC_XOPEN_STREAMS: Int = 246

public const val _SC_THREAD_ROBUST_PRIO_INHERIT: Int = 247

public const val _SC_THREAD_ROBUST_PRIO_PROTECT: Int = 248

public val RLIM_SAVED_MAX: ULong = RLIM_INFINITY

public val RLIM_SAVED_CUR: ULong = RLIM_INFINITY

public val GLOB_ERR: Int = 1 shl 0

public val GLOB_MARK: Int = 1 shl 1

public val GLOB_NOSORT: Int = 1 shl 2

public val GLOB_DOOFFS: Int = 1 shl 3

public val GLOB_NOCHECK: Int = 1 shl 4

public val GLOB_APPEND: Int = 1 shl 5

public val GLOB_NOESCAPE: Int = 1 shl 6

public const val GLOB_NOSPACE: Int = 1

public const val GLOB_ABORTED: Int = 2

public const val GLOB_NOMATCH: Int = 3

public const val POSIX_MADV_NORMAL: Int = 0

public const val POSIX_MADV_RANDOM: Int = 1

public const val POSIX_MADV_SEQUENTIAL: Int = 2

public const val POSIX_MADV_WILLNEED: Int = 3

public const val AT_EACCESS: Int = 0x200

public const val S_IEXEC: UInt = 64u

public const val S_IWRITE: UInt = 128u

public const val S_IREAD: UInt = 256u

public const val F_LOCK: Int = 1

public const val F_TEST: Int = 3

public const val F_TLOCK: Int = 2

public const val F_ULOCK: Int = 0

public const val ST_RDONLY: ULong = 1uL

public const val ST_NOSUID: ULong = 2uL

public const val ST_NODEV: ULong = 4uL

public const val ST_NOEXEC: ULong = 8uL

public const val ST_SYNCHRONOUS: ULong = 16uL

public const val ST_MANDLOCK: ULong = 64uL

public const val ST_WRITE: ULong = 128uL

public const val ST_APPEND: ULong = 256uL

public const val ST_IMMUTABLE: ULong = 512uL

public const val ST_NOATIME: ULong = 1024uL

public const val ST_NODIRATIME: ULong = 2048uL

public const val RTLD_NODELETE: Int = 0x1000

public const val RTLD_NOW: Int = 0x2

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { size: [0 (initializer represented at the FFI boundary)
public const val PTHREAD_MUTEX_NORMAL: Int = 0

public const val PTHREAD_MUTEX_RECURSIVE: Int = 1

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 2

public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL

public const val PTHREAD_PROCESS_PRIVATE: Int = 0

public const val PTHREAD_PROCESS_SHARED: Int = 1

public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL

public const val SCHED_OTHER: Int = 0

public const val SCHED_FIFO: Int = 1

public const val SCHED_RR: Int = 2

public const val SCHED_BATCH: Int = 3

public const val SCHED_IDLE: Int = 5

public const val AF_IB: Int = 27

public const val AF_MPLS: Int = 28

public const val AF_NFC: Int = 39

public const val AF_VSOCK: Int = 40

public const val PF_IB: Int = AF_IB

public const val PF_MPLS: Int = AF_MPLS

public const val PF_NFC: Int = AF_NFC

public const val PF_VSOCK: Int = AF_VSOCK

public const val IPC_PRIVATE: Int = 0

public const val IPC_CREAT: Int = 512

public const val IPC_EXCL: Int = 1024

public const val IPC_NOWAIT: Int = 2048

public const val IPC_RMID: Int = 0

public const val IPC_SET: Int = 1

public const val IPC_STAT: Int = 2

public const val IPC_INFO: Int = 3

public const val MSG_STAT: Int = 11

public const val MSG_INFO: Int = 12

public const val MSG_NOERROR: Int = 4096

public const val MSG_EXCEPT: Int = 8192

public const val SHM_R: Int = 256

public const val SHM_W: Int = 128

public const val SHM_RDONLY: Int = 4096

public const val SHM_RND: Int = 8192

public const val SHM_REMAP: Int = 16384

public const val SHM_EXEC: Int = 32768

public const val SHM_LOCK: Int = 11

public const val SHM_UNLOCK: Int = 12

public const val SHM_HUGETLB: Int = 2048

public const val SHM_NORESERVE: Int = 4096

public const val LOG_NFACILITIES: Int = 24

public const val AI_PASSIVE: Int = 0x0001

public const val AI_CANONNAME: Int = 0x0002

public const val AI_NUMERICHOST: Int = 0x0004

public const val AI_V4MAPPED: Int = 0x0008

public const val AI_ALL: Int = 0x0010

public const val AI_ADDRCONFIG: Int = 0x0020

public const val AI_NUMERICSERV: Int = 0x0400

public const val EAI_BADFLAGS: Int = -1

public const val EAI_NONAME: Int = -2

public const val EAI_AGAIN: Int = -3

public const val EAI_FAIL: Int = -4

public const val EAI_FAMILY: Int = -6

public const val EAI_SOCKTYPE: Int = -7

public const val EAI_SERVICE: Int = -8

public const val EAI_MEMORY: Int = -10

public const val EAI_OVERFLOW: Int = -12

public const val NI_NUMERICHOST: Int = 1

public const val NI_NUMERICSERV: Int = 2

public const val NI_NOFQDN: Int = 4

public const val NI_NAMEREQD: Int = 8

public const val NI_DGRAM: Int = 16

public const val SYNC_FILE_RANGE_WAIT_BEFORE: UInt = 1u

public const val SYNC_FILE_RANGE_WRITE: UInt = 2u

public const val SYNC_FILE_RANGE_WAIT_AFTER: UInt = 4u

public const val EAI_SYSTEM: Int = -11

public const val MREMAP_MAYMOVE: Int = 1

public const val MREMAP_FIXED: Int = 2

public const val ITIMER_REAL: Int = 0

public const val ITIMER_VIRTUAL: Int = 1

public const val ITIMER_PROF: Int = 2

public const val _POSIX_VDISABLE: UByte = 0u

public const val FALLOC_FL_KEEP_SIZE: Int = 0x01

public const val FALLOC_FL_PUNCH_HOLE: Int = 0x02

public const val NCCS: ULong = 32uL

public const val O_TRUNC: Int = 512

public const val O_NOATIME: Int = 262144

public const val O_CLOEXEC: Int = 0x80000

public const val EPERM: Int = 63

public const val ENOENT: Int = 44

public const val ESRCH: Int = 71

public const val EINTR: Int = 27

public const val EIO: Int = 29

public const val ENXIO: Int = 60

public const val E2BIG: Int = 1

public const val ENOEXEC: Int = 45

public const val EBADF: Int = 8

public const val ECHILD: Int = 12

public const val EAGAIN: Int = 6

public const val ENOMEM: Int = 48

public const val EACCES: Int = 2

public const val EFAULT: Int = 21

public const val ENOTBLK: Int = 105

public const val EBUSY: Int = 10

public const val EEXIST: Int = 20

public const val EXDEV: Int = 75

public const val ENODEV: Int = 43

public const val ENOTDIR: Int = 54

public const val EISDIR: Int = 31

public const val EINVAL: Int = 28

public const val ENFILE: Int = 41

public const val EMFILE: Int = 33

public const val ENOTTY: Int = 59

public const val ETXTBSY: Int = 74

public const val EFBIG: Int = 22

public const val ENOSPC: Int = 51

public const val ESPIPE: Int = 70

public const val EROFS: Int = 69

public const val EMLINK: Int = 34

public const val EPIPE: Int = 64

public const val EDOM: Int = 18

public const val ERANGE: Int = 68

public const val EWOULDBLOCK: Int = EAGAIN

public const val ENOLINK: Int = 47

public const val EPROTO: Int = 65

public const val EDEADLK: Int = 16

public const val EDEADLOCK: Int = EDEADLK

public const val ENAMETOOLONG: Int = 37

public const val ENOLCK: Int = 46

public const val ENOSYS: Int = 52

public const val ENOTEMPTY: Int = 55

public const val ELOOP: Int = 32

public const val ENOMSG: Int = 49

public const val EIDRM: Int = 24

public const val EMULTIHOP: Int = 36

public const val EBADMSG: Int = 9

public const val EOVERFLOW: Int = 61

public const val EILSEQ: Int = 25

public const val ENOTSOCK: Int = 57

public const val EDESTADDRREQ: Int = 17

public const val EMSGSIZE: Int = 35

public const val EPROTOTYPE: Int = 67

public const val ENOPROTOOPT: Int = 50

public const val EPROTONOSUPPORT: Int = 66

public const val EAFNOSUPPORT: Int = 5

public const val EADDRINUSE: Int = 3

public const val EADDRNOTAVAIL: Int = 4

public const val ENETDOWN: Int = 38

public const val ENETUNREACH: Int = 40

public const val ENETRESET: Int = 39

public const val ECONNABORTED: Int = 13

public const val ECONNRESET: Int = 15

public const val ENOBUFS: Int = 42

public const val EISCONN: Int = 30

public const val ENOTCONN: Int = 53

public const val ETIMEDOUT: Int = 73

public const val ECONNREFUSED: Int = 14

public const val EHOSTUNREACH: Int = 23

public const val EALREADY: Int = 7

public const val EINPROGRESS: Int = 26

public const val ESTALE: Int = 72

public const val EDQUOT: Int = 19

public const val ECANCELED: Int = 11

public const val EOWNERDEAD: Int = 62

public const val ENOTRECOVERABLE: Int = 56

public const val ENOSTR: Int = 100

public const val EBFONT: Int = 101

public const val EBADSLT: Int = 102

public const val EBADRQC: Int = 103

public const val ENOANO: Int = 104

public const val ECHRNG: Int = 106

public const val EL3HLT: Int = 107

public const val EL3RST: Int = 108

public const val ELNRNG: Int = 109

public const val EUNATCH: Int = 110

public const val ENOCSI: Int = 111

public const val EL2HLT: Int = 112

public const val EBADE: Int = 113

public const val EBADR: Int = 114

public const val EXFULL: Int = 115

public const val ENODATA: Int = 116

public const val ETIME: Int = 117

public const val ENOSR: Int = 118

public const val ENONET: Int = 119

public const val ENOPKG: Int = 120

public const val EREMOTE: Int = 121

public const val EADV: Int = 122

public const val ESRMNT: Int = 123

public const val ECOMM: Int = 124

public const val EDOTDOT: Int = 125

public const val ENOTUNIQ: Int = 126

public const val EBADFD: Int = 127

public const val EREMCHG: Int = 128

public const val ELIBACC: Int = 129

public const val ELIBBAD: Int = 130

public const val ELIBSCN: Int = 131

public const val ELIBMAX: Int = 132

public const val ELIBEXEC: Int = 133

public const val ERESTART: Int = 134

public const val ESTRPIPE: Int = 135

public const val EUSERS: Int = 136

public const val ESOCKTNOSUPPORT: Int = 137

public const val EOPNOTSUPP: Int = 138

public const val ENOTSUP: Int = EOPNOTSUPP

public const val EPFNOSUPPORT: Int = 139

public const val ESHUTDOWN: Int = 140

public const val ETOOMANYREFS: Int = 141

public const val EHOSTDOWN: Int = 142

public const val EUCLEAN: Int = 143

public const val ENOTNAM: Int = 144

public const val ENAVAIL: Int = 145

public const val EISNAM: Int = 146

public const val EREMOTEIO: Int = 147

public const val ENOMEDIUM: Int = 148

public const val EMEDIUMTYPE: Int = 149

public const val ENOKEY: Int = 150

public const val EKEYEXPIRED: Int = 151

public const val EKEYREVOKED: Int = 152

public const val EKEYREJECTED: Int = 153

public const val ERFKILL: Int = 154

public const val EHWPOISON: Int = 155

public const val EL2NSYNC: Int = 156

public const val SA_NODEFER: Int = 0x40000000

public const val SA_RESETHAND: Int = 0x80000000.toInt()

public const val SA_RESTART: Int = 0x10000000

public const val SA_NOCLDSTOP: Int = 0x00000001

public const val BUFSIZ: UInt = 1024u

public const val TMP_MAX: UInt = 10000u

public const val FOPEN_MAX: UInt = 1000u

public const val O_PATH: Int = 2097152

public const val O_EXEC: Int = 2097152

public const val O_SEARCH: Int = 2097152

public const val O_ACCMODE: Int = 2097155

public val O_NDELAY: Int = O_NONBLOCK

public const val NI_MAXHOST: UInt = 255u

public const val PTHREAD_STACK_MIN: ULong = 2048uL

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val POSIX_MADV_DONTNEED: Int = 4

public const val RLIM_INFINITY: ULong = 0xFFFFFFFFFFFFFFFFuL

public const val RLIMIT_NLIMITS: Int = 16

public const val RLIM_NLIMITS: Int = RLIMIT_NLIMITS

public val MAP_ANONYMOUS: Int = MAP_ANON

public val SIGUNUSED: Int = SIGSYS

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL

public const val CPU_SETSIZE: Int = 1024

public const val TCSANOW: Int = 0

public const val TCSADRAIN: Int = 1

public const val TCSAFLUSH: Int = 2

public val TIOCINQ: Int = FIONREAD

public const val RTLD_GLOBAL: Int = 0x100

public const val RTLD_NOLOAD: Int = 0x4

public const val CLOCK_SGI_CYCLE: Int = 10

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val SIGSTKSZ: ULong = 8192uL

public const val MINSIGSTKSZ: ULong = 2048uL

public const val CBAUD: UInt = 4111u

public const val TAB1: Int = 0x00000800

public const val TAB2: Int = 0x00001000

public const val TAB3: Int = 0x00001800

public const val CR1: Int = 0x00000200

public const val CR2: Int = 0x00000400

public const val CR3: Int = 0x00000600

public const val FF1: Int = 0x00008000

public const val BS1: Int = 0x00002000

public const val VT1: Int = 0x00004000

public const val VWERASE: ULong = 14uL

public const val VREPRINT: ULong = 12uL

public const val VSUSP: ULong = 10uL

public const val VSTART: ULong = 8uL

public const val VSTOP: ULong = 9uL

public const val VDISCARD: ULong = 13uL

public const val VTIME: ULong = 5uL

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

public const val CBAUDEX: UInt = 4096u

public const val VSWTC: ULong = 7uL

public const val OLCUC: UInt = 2u

public const val NLDLY: UInt = 256u

public const val CRDLY: UInt = 1536u

public const val TABDLY: UInt = 6144u

public const val BSDLY: UInt = 8192u

public const val FFDLY: UInt = 32768u

public const val VTDLY: UInt = 16384u

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

public const val SO_BINDTODEVICE: Int = 25

public const val SO_TIMESTAMP: Int = 63

public const val SO_MARK: Int = 36

public const val SO_RXQ_OVFL: Int = 40

public const val SO_PEEK_OFF: Int = 42

public const val SO_BUSY_POLL: Int = 46

public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 32uL

public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 24uL

public const val O_DIRECT: Int = 0x4000

public const val O_DIRECTORY: Int = 0x10000

public const val O_NOFOLLOW: Int = 0x20000

public const val O_ASYNC: Int = 0x2000

public const val FIOCLEX: Int = 0x5451

public const val FIONBIO: Int = 0x5421

public const val RLIMIT_RSS: Int = 5

public const val RLIMIT_NOFILE: Int = 7

public const val RLIMIT_AS: Int = 9

public const val RLIMIT_NPROC: Int = 6

public const val RLIMIT_MEMLOCK: Int = 8

public const val RLIMIT_CPU: Int = 0

public const val RLIMIT_FSIZE: Int = 1

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_STACK: Int = 3

public const val RLIMIT_CORE: Int = 4

public const val RLIMIT_LOCKS: Int = 10

public const val RLIMIT_SIGPENDING: Int = 11

public const val RLIMIT_MSGQUEUE: Int = 12

public const val RLIMIT_NICE: Int = 13

public const val RLIMIT_RTPRIO: Int = 14

public const val O_APPEND: Int = 1024

public const val O_CREAT: Int = 64

public const val O_EXCL: Int = 128

public const val O_NOCTTY: Int = 256

public const val O_NONBLOCK: Int = 2048

public const val O_SYNC: Int = 1052672

public const val O_RSYNC: Int = 1052672

public const val O_DSYNC: Int = 4096

public const val SOCK_NONBLOCK: Int = 2048

public const val MAP_ANON: Int = 0x0020

public const val MAP_GROWSDOWN: Int = 0x0100

public const val MAP_DENYWRITE: Int = 0x0800

public const val MAP_EXECUTABLE: Int = 0x01000

public const val MAP_LOCKED: Int = 0x02000

public const val MAP_NORESERVE: Int = 0x04000

public const val MAP_POPULATE: Int = 0x08000

public const val MAP_NONBLOCK: Int = 0x010000

public const val MAP_STACK: Int = 0x020000

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_SEQPACKET: Int = 5

public const val IPPROTO_MAX: Int = 263

public const val SOL_SOCKET: Int = 1

public const val SO_REUSEADDR: Int = 2

public const val SO_TYPE: Int = 3

public const val SO_ERROR: Int = 4

public const val SO_DONTROUTE: Int = 5

public const val SO_BROADCAST: Int = 6

public const val SO_SNDBUF: Int = 7

public const val SO_RCVBUF: Int = 8

public const val SO_KEEPALIVE: Int = 9

public const val SO_OOBINLINE: Int = 10

public const val SO_LINGER: Int = 13

public const val SO_REUSEPORT: Int = 15

public const val SO_RCVLOWAT: Int = 18

public const val SO_SNDLOWAT: Int = 19

public const val SO_RCVTIMEO: Int = 66

public const val SO_SNDTIMEO: Int = 67

public const val SO_ACCEPTCONN: Int = 30

public const val IPV6_RTHDR_LOOSE: Int = 0

public const val IPV6_RTHDR_STRICT: Int = 1

public const val SA_ONSTACK: Int = 0x08000000

public const val SA_SIGINFO: Int = 0x00000004

public const val SA_NOCLDWAIT: Int = 0x00000002

public const val SIGCHLD: Int = 17

public const val SIGBUS: Int = 7

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGUSR1: Int = 10

public const val SIGUSR2: Int = 12

public const val SIGCONT: Int = 18

public const val SIGSTOP: Int = 19

public const val SIGTSTP: Int = 20

public const val SIGURG: Int = 23

public const val SIGIO: Int = 29

public const val SIGSYS: Int = 31

public const val SIGSTKFLT: Int = 16

public const val SIGPOLL: Int = 29

public const val SIGPWR: Int = 30

public const val SIG_SETMASK: Int = 2

public const val SIG_BLOCK: Int = 0x000000

public const val SIG_UNBLOCK: Int = 0x01

public const val EXTPROC: UInt = 0x00010000u

public const val MAP_HUGETLB: Int = 0x040000

public const val F_GETLK: Int = 12

public const val F_GETOWN: Int = 9

public const val F_SETLK: Int = 13

public const val F_SETLKW: Int = 14

public const val F_SETOWN: Int = 8

public const val F_OFD_GETLK: Int = 36

public const val F_OFD_SETLK: Int = 37

public const val F_OFD_SETLKW: Int = 38

public const val VEOF: ULong = 4uL

public const val VEOL: ULong = 11uL

public const val VEOL2: ULong = 16uL

public const val VMIN: ULong = 6uL

public const val IEXTEN: UInt = 0x00008000u

public const val TOSTOP: UInt = 0x00000100u

public const val FLUSHO: UInt = 0x00001000u

public const val TCGETS: Int = 0x5401

public const val TCSETS: Int = 0x5402

public const val TCSETSW: Int = 0x5403

public const val TCSETSF: Int = 0x5404

public const val TCGETA: Int = 0x5405

public const val TCSETA: Int = 0x5406

public const val TCSETAW: Int = 0x5407

public const val TCSETAF: Int = 0x5408

public const val TCSBRK: Int = 0x5409

public const val TCXONC: Int = 0x540A

public const val TCFLSH: Int = 0x540B

public const val TIOCGSOFTCAR: Int = 0x5419

public const val TIOCSSOFTCAR: Int = 0x541A

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

public const val SYS_gettid: Long = 224

public const val POLLWRNORM: Short = 0x100

public const val POLLWRBAND: Short = 0x200

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

public const val O_TMPFILE: Int = 0x410000

public const val MAX_ADDR_LEN: ULong = 7uL

public val ARPD_UPDATE: UShort = (0x01).toUShort()

public val ARPD_LOOKUP: UShort = (0x02).toUShort()

public val ARPD_FLUSH: UShort = (0x03).toUShort()

public const val ATF_MAGIC: Int = 0x80

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val SOMAXCONN: Int = 128
