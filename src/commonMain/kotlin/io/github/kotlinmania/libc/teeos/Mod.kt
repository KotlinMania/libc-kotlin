// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public typealias CBool = Int
public typealias IntmaxT = Long
public typealias UintmaxT = ULong
public typealias SizeT = ULong
public typealias PtrdiffT = Long
public typealias IntptrT = Long
public typealias UintptrT = ULong
public typealias SsizeT = Long
public typealias PidT = CInt
public typealias WcharT = UInt
public typealias CLongdouble = CLongDouble
public typealias PthreadT = CULong
public typealias PthreadKeyT = CUInt
public typealias PthreadSpinlockT = CInt
public typealias OffT = Long
public typealias TimeT = CLong
public typealias ClockT = CLong
public typealias ClockidT = CInt
public typealias SusecondsT = CLong
public typealias OnceFn = (() -> COpaquePointer?)?
public typealias PthreadOnceT = CInt
public typealias VaList = String?
public typealias WintT = CUInt
public typealias WctypeT = CULong
public typealias Cmpfunc = ((COpaquePointer?, COpaquePointer?) -> CInt)?

public data class PthreadCondT(
    val size: UByteArray,
)

public data class PthreadMutexT(
    val size: UByteArray,
)

public data class PthreadMutexattrT(
    val size: UByteArray,
)

public data class PthreadCondattrT(
    val size: UByteArray,
)

public data class PthreadAttrT(
    val size: ULongArray,
)

public data class CpuSetT(
    val bits: ULongArray,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: CLong,
)

public data class Timeval(
    val tvSec: TimeT,
    val tvUsec: SusecondsT,
)

public data class Tm(
    val tmSec: CInt,
    val tmMin: CInt,
    val tmHour: CInt,
    val tmMday: CInt,
    val tmMon: CInt,
    val tmYear: CInt,
    val tmWday: CInt,
    val tmYday: CInt,
    val tmIsdst: CInt,
    val tmGmtoff: CLong,
    val tmZone: String?,
)

public data class MbstateT(
    val opaque1: CUInt,
    val opaque2: CUInt,
)

public data class SemT(
    val value: IntArray,
)

public data class DivT(
    val quot: CInt,
    val rem: CInt,
)

public data class CLongDouble(
    val value: ByteArray,
)

public const val O_CREAT: UInt = 64u
public const val O_EXCL: UInt = 128u
public const val O_NOCTTY: UInt = 256u
public const val O_TRUNC: UInt = 512u
public const val O_APPEND: UInt = 1024u
public const val O_NONBLOCK: UInt = 2048u
public const val O_DSYNC: UInt = 4096u
public const val O_SYNC: UInt = 1052672u
public const val O_RSYNC: UInt = 1052672u
public const val O_DIRECTORY: UInt = 65536u
public const val O_NOFOLLOW: UInt = 131072u
public const val O_CLOEXEC: UInt = 524288u
public const val O_ASYNC: UInt = 8192u
public const val O_DIRECT: UInt = 16384u
public const val O_LARGEFILE: UInt = 32768u
public const val O_NOATIME: UInt = 262144u
public const val O_PATH: UInt = 2097152u
public const val O_TMPFILE: UInt = 4259840u
public const val O_NDELAY: UInt = O_NONBLOCK
public const val F_DUPFD: UInt = 0u
public const val F_GETFD: UInt = 1u
public const val F_SETFD: UInt = 2u
public const val F_GETFL: UInt = 3u
public const val F_SETFL: UInt = 4u
public const val F_SETOWN: UInt = 8u
public const val F_GETOWN: UInt = 9u
public const val F_SETSIG: UInt = 10u
public const val F_GETSIG: UInt = 11u
public const val F_GETLK: UInt = 12u
public const val F_SETLK: UInt = 13u
public const val F_SETLKW: UInt = 14u
public const val F_SETOWN_EX: UInt = 15u
public const val F_GETOWN_EX: UInt = 16u
public const val F_GETOWNER_UIDS: UInt = 17u
public const val MAP_FAILED: ULong = 0xffffffffffffffffuL
public const val MAP_FIXED_NOREPLACE: UInt = 0x100000u
public const val MAP_SHARED_VALIDATE: UInt = 0x03u
public const val MAP_SHARED: UInt = 0x01u
public const val MAP_PRIVATE: UInt = 0x02u
public const val MAP_TYPE: UInt = 0x0fu
public const val MAP_FIXED: UInt = 0x10u
public const val MAP_ANON: UInt = 0x20u
public const val MAP_ANONYMOUS: UInt = MAP_ANON
public const val MAP_NORESERVE: UInt = 0x4000u
public const val MAP_GROWSDOWN: UInt = 0x0100u
public const val MAP_DENYWRITE: UInt = 0x0800u
public const val MAP_EXECUTABLE: UInt = 0x1000u
public const val MAP_LOCKED: UInt = 0x2000u
public const val MAP_POPULATE: UInt = 0x8000u
public const val MAP_NONBLOCK: UInt = 0x10000u
public const val MAP_STACK: UInt = 0x20000u
public const val MAP_HUGETLB: UInt = 0x40000u
public const val MAP_SYNC: UInt = 0x80000u
public const val MAP_FILE: UInt = 0u
public const val MAP_HUGE_SHIFT: UInt = 26u
public const val MAP_HUGE_MASK: UInt = 0x3fu
public val MAP_HUGE_16KB: UInt = 14u shl 26
public val MAP_HUGE_64KB: UInt = 16u shl 26
public val MAP_HUGE_512KB: UInt = 19u shl 26
public val MAP_HUGE_1MB: UInt = 20u shl 26
public val MAP_HUGE_2MB: UInt = 21u shl 26
public val MAP_HUGE_8MB: UInt = 23u shl 26
public val MAP_HUGE_16MB: UInt = 24u shl 26
public val MAP_HUGE_32MB: UInt = 25u shl 26
public val MAP_HUGE_256MB: UInt = 28u shl 26
public val MAP_HUGE_512MB: UInt = 29u shl 26
public val MAP_HUGE_1GB: UInt = 30u shl 26
public val MAP_HUGE_2GB: UInt = 31u shl 26
public val MAP_HUGE_16GB: UInt = 34u shl 26
public const val PROT_NONE: UInt = 0u
public const val PROT_READ: UInt = 1u
public const val PROT_WRITE: UInt = 2u
public const val PROT_EXEC: UInt = 4u
public const val PROT_GROWSDOWN: UInt = 0x01000000u
public const val PROT_GROWSUP: UInt = 0x02000000u
public const val MS_ASYNC: UInt = 1u
public const val MS_INVALIDATE: UInt = 2u
public const val MS_SYNC: UInt = 4u
public const val MCL_CURRENT: UInt = 1u
public const val MCL_FUTURE: UInt = 2u
public const val MCL_ONFAULT: UInt = 4u
public const val POSIX_MADV_NORMAL: UInt = 0u
public const val POSIX_MADV_RANDOM: UInt = 1u
public const val POSIX_MADV_SEQUENTIAL: UInt = 2u
public const val POSIX_MADV_WILLNEED: UInt = 3u
public const val POSIX_MADV_DONTNEED: UInt = 4u
public const val WCTYPE_ALNUM: ULong = 1uL
public const val WCTYPE_ALPHA: ULong = 2uL
public const val WCTYPE_BLANK: ULong = 3uL
public const val WCTYPE_CNTRL: ULong = 4uL
public const val WCTYPE_DIGIT: ULong = 5uL
public const val WCTYPE_GRAPH: ULong = 6uL
public const val WCTYPE_LOWER: ULong = 7uL
public const val WCTYPE_PRINT: ULong = 8uL
public const val WCTYPE_PUNCT: ULong = 9uL
public const val WCTYPE_SPACE: ULong = 10uL
public const val WCTYPE_UPPER: ULong = 11uL
public const val WCTYPE_XDIGIT: ULong = 12uL
public const val LC_CTYPE: Int = 0
public const val LC_NUMERIC: Int = 1
public const val LC_TIME: Int = 2
public const val LC_COLLATE: Int = 3
public const val LC_MONETARY: Int = 4
public const val LC_MESSAGES: Int = 5
public const val LC_ALL: Int = 6
public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val EPERM: CInt = 1
public const val ENOENT: CInt = 2
public const val ESRCH: CInt = 3
public const val EINTR: CInt = 4
public const val EIO: CInt = 5
public const val ENXIO: CInt = 6
public const val E2BIG: CInt = 7
public const val ENOEXEC: CInt = 8
public const val EBADF: CInt = 9
public const val ECHILD: CInt = 10
public const val EAGAIN: CInt = 11
public const val ENOMEM: CInt = 12
public const val EACCES: CInt = 13
public const val EFAULT: CInt = 14
public const val ENOTBLK: CInt = 15
public const val EBUSY: CInt = 16
public const val EEXIST: CInt = 17
public const val EXDEV: CInt = 18
public const val ENODEV: CInt = 19
public const val ENOTDIR: CInt = 20
public const val EISDIR: CInt = 21
public const val EINVAL: CInt = 22
public const val ENFILE: CInt = 23
public const val EMFILE: CInt = 24
public const val ENOTTY: CInt = 25
public const val ETXTBSY: CInt = 26
public const val EFBIG: CInt = 27
public const val ENOSPC: CInt = 28
public const val ESPIPE: CInt = 29
public const val EROFS: CInt = 30
public const val EMLINK: CInt = 31
public const val EPIPE: CInt = 32
public const val EDOM: CInt = 33
public const val ERANGE: CInt = 34
public const val EDEADLK: CInt = 35
public const val ENAMETOOLONG: CInt = 36
public const val ENOLCK: CInt = 37
public const val ENOSYS: CInt = 38
public const val ENOTEMPTY: CInt = 39
public const val ELOOP: CInt = 40
public const val EWOULDBLOCK: CInt = EAGAIN
public const val ENOMSG: CInt = 42
public const val EIDRM: CInt = 43
public const val ECHRNG: CInt = 44
public const val EL2NSYNC: CInt = 45
public const val EL3HLT: CInt = 46
public const val EL3RST: CInt = 47
public const val ELNRNG: CInt = 48
public const val EUNATCH: CInt = 49
public const val ENOCSI: CInt = 50
public const val EL2HLT: CInt = 51
public const val EBADE: CInt = 52
public const val EBADR: CInt = 53
public const val EXFULL: CInt = 54
public const val ENOANO: CInt = 55
public const val EBADRQC: CInt = 56
public const val EBADSLT: CInt = 57
public const val EDEADLOCK: CInt = EDEADLK
public const val EBFONT: CInt = 59
public const val ENOSTR: CInt = 60
public const val ENODATA: CInt = 61
public const val ETIME: CInt = 62
public const val ENOSR: CInt = 63
public const val ENONET: CInt = 64
public const val ENOPKG: CInt = 65
public const val EREMOTE: CInt = 66
public const val ENOLINK: CInt = 67
public const val EADV: CInt = 68
public const val ESRMNT: CInt = 69
public const val ECOMM: CInt = 70
public const val EPROTO: CInt = 71
public const val EMULTIHOP: CInt = 72
public const val EDOTDOT: CInt = 73
public const val EBADMSG: CInt = 74
public const val EOVERFLOW: CInt = 75
public const val ENOTUNIQ: CInt = 76
public const val EBADFD: CInt = 77
public const val EREMCHG: CInt = 78
public const val ELIBACC: CInt = 79
public const val ELIBBAD: CInt = 80
public const val ELIBSCN: CInt = 81
public const val ELIBMAX: CInt = 82
public const val ELIBEXEC: CInt = 83
public const val EILSEQ: CInt = 84
public const val ERESTART: CInt = 85
public const val ESTRPIPE: CInt = 86
public const val EUSERS: CInt = 87
public const val ENOTSOCK: CInt = 88
public const val EDESTADDRREQ: CInt = 89
public const val EMSGSIZE: CInt = 90
public const val EPROTOTYPE: CInt = 91
public const val ENOPROTOOPT: CInt = 92
public const val EPROTONOSUPPOR: CInt = 93
public const val ESOCKTNOSUPPOR: CInt = 94
public const val EOPNOTSUPP: CInt = 95
public const val ENOTSUP: CInt = EOPNOTSUPP
public const val EPFNOSUPPORT: CInt = 96
public const val EAFNOSUPPORT: CInt = 97
public const val EADDRINUSE: CInt = 98
public const val EADDRNOTAVAIL: CInt = 99
public const val ENETDOWN: CInt = 100
public const val ENETUNREACH: CInt = 101
public const val ENETRESET: CInt = 102
public const val ECONNABORTED: CInt = 103
public const val ECONNRESET: CInt = 104
public const val ENOBUFS: CInt = 105
public const val EISCONN: CInt = 106
public const val ENOTCONN: CInt = 107
public const val ESHUTDOWN: CInt = 108
public const val ETOOMANYREFS: CInt = 109
public const val ETIMEDOUT: CInt = 110
public const val ECONNREFUSED: CInt = 111
public const val EHOSTDOWN: CInt = 112
public const val EHOSTUNREACH: CInt = 113
public const val EALREADY: CInt = 114
public const val EINPROGRESS: CInt = 115
public const val ESTALE: CInt = 116
public const val EUCLEAN: CInt = 117
public const val ENOTNAM: CInt = 118
public const val ENAVAIL: CInt = 119
public const val EISNAM: CInt = 120
public const val EREMOTEIO: CInt = 121
public const val EDQUOT: CInt = 122
public const val ENOMEDIUM: CInt = 123
public const val EMEDIUMTYPE: CInt = 124
public const val ECANCELED: CInt = 125
public const val ENOKEY: CInt = 126
public const val EKEYEXPIRED: CInt = 127
public const val EKEYREVOKED: CInt = 128
public const val EKEYREJECTED: CInt = 129
public const val EOWNERDEAD: CInt = 130
public const val ENOTRECOVERABLE: CInt = 131
public const val ERFKILL: CInt = 132
public const val EHWPOISON: CInt = 133
public const val TEESMP_THREAD_ATTR_CA_WILDCARD: CInt = 0
public const val TEESMP_THREAD_ATTR_CA_INHERIT: CInt = -1
public const val TEESMP_THREAD_ATTR_TASK_ID_INHERIT: CInt = -1
public const val TEESMP_THREAD_ATTR_HAS_SHADOW: CInt = 0x1
public const val TEESMP_THREAD_ATTR_NO_SHADOW: CInt = 0x0
public const val _SC_ARG_MAX: CInt = 0
public const val _SC_CHILD_MAX: CInt = 1
public const val _SC_CLK_TCK: CInt = 2
public const val _SC_NGROUPS_MAX: CInt = 3
public const val _SC_OPEN_MAX: CInt = 4
public const val _SC_STREAM_MAX: CInt = 5
public const val _SC_TZNAME_MAX: CInt = 6
public const val _SC_JOB_CONTROL: CInt = 7
public const val _SC_SAVED_IDS: CInt = 8
public const val _SC_REALTIME_SIGNALS: CInt = 9
public const val _SC_PRIORITY_SCHEDULING: CInt = 10
public const val _SC_TIMERS: CInt = 11
public const val _SC_ASYNCHRONOUS_IO: CInt = 12
public const val _SC_PRIORITIZED_IO: CInt = 13
public const val _SC_SYNCHRONIZED_IO: CInt = 14
public const val _SC_FSYNC: CInt = 15
public const val _SC_MAPPED_FILES: CInt = 16
public const val _SC_MEMLOCK: CInt = 17
public const val _SC_MEMLOCK_RANGE: CInt = 18
public const val _SC_MEMORY_PROTECTION: CInt = 19
public const val _SC_MESSAGE_PASSING: CInt = 20
public const val _SC_SEMAPHORES: CInt = 21
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 22
public const val _SC_AIO_LISTIO_MAX: CInt = 23
public const val _SC_AIO_MAX: CInt = 24
public const val _SC_AIO_PRIO_DELTA_MAX: CInt = 25
public const val _SC_DELAYTIMER_MAX: CInt = 26
public const val _SC_MQ_OPEN_MAX: CInt = 27
public const val _SC_MQ_PRIO_MAX: CInt = 28
public const val _SC_VERSION: CInt = 29
public const val _SC_PAGE_SIZE: CInt = 30
public const val _SC_PAGESIZE: CInt = 30
public const val _SC_RTSIG_MAX: CInt = 31
public const val _SC_SEM_NSEMS_MAX: CInt = 32
public const val _SC_SEM_VALUE_MAX: CInt = 33
public const val _SC_SIGQUEUE_MAX: CInt = 34
public const val _SC_TIMER_MAX: CInt = 35
public const val _SC_BC_BASE_MAX: CInt = 36
public const val _SC_BC_DIM_MAX: CInt = 37
public const val _SC_BC_SCALE_MAX: CInt = 38
public const val _SC_BC_STRING_MAX: CInt = 39
public const val _SC_COLL_WEIGHTS_MAX: CInt = 40
public const val _SC_EXPR_NEST_MAX: CInt = 42
public const val _SC_LINE_MAX: CInt = 43
public const val _SC_RE_DUP_MAX: CInt = 44
public const val _SC_2_VERSION: CInt = 46
public const val _SC_2_C_BIND: CInt = 47
public const val _SC_2_C_DEV: CInt = 48
public const val _SC_2_FORT_DEV: CInt = 49
public const val _SC_2_FORT_RUN: CInt = 50
public const val _SC_2_SW_DEV: CInt = 51
public const val _SC_2_LOCALEDEF: CInt = 52
public const val _SC_UIO_MAXIOV: CInt = 60
public const val _SC_IOV_MAX: CInt = 60
public const val _SC_THREADS: CInt = 67
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 68
public const val _SC_GETGR_R_SIZE_MAX: CInt = 69
public const val _SC_GETPW_R_SIZE_MAX: CInt = 70
public const val _SC_LOGIN_NAME_MAX: CInt = 71
public const val _SC_TTY_NAME_MAX: CInt = 72
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 73
public const val _SC_THREAD_KEYS_MAX: CInt = 74
public const val _SC_THREAD_STACK_MIN: CInt = 75
public const val _SC_THREAD_THREADS_MAX: CInt = 76
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 77
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 78
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 79
public const val _SC_THREAD_PRIO_INHERIT: CInt = 80
public const val _SC_THREAD_PRIO_PROTECT: CInt = 81
public const val _SC_THREAD_PROCESS_SHARED: CInt = 82
public const val _SC_NPROCESSORS_CONF: CInt = 83
public const val _SC_NPROCESSORS_ONLN: CInt = 84
public const val _SC_PHYS_PAGES: CInt = 85
public const val _SC_AVPHYS_PAGES: CInt = 86
public const val _SC_ATEXIT_MAX: CInt = 87
public const val _SC_PASS_MAX: CInt = 88
public const val _SC_XOPEN_VERSION: CInt = 89
public const val _SC_XOPEN_XCU_VERSION: CInt = 90
public const val _SC_XOPEN_UNIX: CInt = 91
public const val _SC_XOPEN_CRYPT: CInt = 92
public const val _SC_XOPEN_ENH_I18N: CInt = 93
public const val _SC_XOPEN_SHM: CInt = 94
public const val _SC_2_CHAR_TERM: CInt = 95
public const val _SC_2_UPE: CInt = 97
public const val _SC_XOPEN_XPG2: CInt = 98
public const val _SC_XOPEN_XPG3: CInt = 99
public const val _SC_XOPEN_XPG4: CInt = 100
public const val _SC_NZERO: CInt = 109
public const val _SC_XBS5_ILP32_OFF32: CInt = 125
public const val _SC_XBS5_ILP32_OFFBIG: CInt = 126
public const val _SC_XBS5_LP64_OFF64: CInt = 127
public const val _SC_XBS5_LPBIG_OFFBIG: CInt = 128
public const val _SC_XOPEN_LEGACY: CInt = 129
public const val _SC_XOPEN_REALTIME: CInt = 130
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 131
public const val _SC_ADVISORY_INFO: CInt = 132
public const val _SC_BARRIERS: CInt = 133
public const val _SC_CLOCK_SELECTION: CInt = 137
public const val _SC_CPUTIME: CInt = 138
public const val _SC_THREAD_CPUTIME: CInt = 139
public const val _SC_MONOTONIC_CLOCK: CInt = 149
public const val _SC_READER_WRITER_LOCKS: CInt = 153
public const val _SC_SPIN_LOCKS: CInt = 154
public const val _SC_REGEXP: CInt = 155
public const val _SC_SHELL: CInt = 157
public const val _SC_SPAWN: CInt = 159
public const val _SC_SPORADIC_SERVER: CInt = 160
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 161
public const val _SC_TIMEOUTS: CInt = 164
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 165
public const val _SC_2_PBS: CInt = 168
public const val _SC_2_PBS_ACCOUNTING: CInt = 169
public const val _SC_2_PBS_LOCATE: CInt = 170
public const val _SC_2_PBS_MESSAGE: CInt = 171
public const val _SC_2_PBS_TRACK: CInt = 172
public const val _SC_SYMLOOP_MAX: CInt = 173
public const val _SC_STREAMS: CInt = 174
public const val _SC_2_PBS_CHECKPOINT: CInt = 175
public const val _SC_V6_ILP32_OFF32: CInt = 176
public const val _SC_V6_ILP32_OFFBIG: CInt = 177
public const val _SC_V6_LP64_OFF64: CInt = 178
public const val _SC_V6_LPBIG_OFFBIG: CInt = 179
public const val _SC_HOST_NAME_MAX: CInt = 180
public const val _SC_TRACE: CInt = 181
public const val _SC_TRACE_EVENT_FILTER: CInt = 182
public const val _SC_TRACE_INHERIT: CInt = 183
public const val _SC_TRACE_LOG: CInt = 184
public const val _SC_IPV6: CInt = 235
public const val _SC_RAW_SOCKETS: CInt = 236
public const val _SC_V7_ILP32_OFF32: CInt = 237
public const val _SC_V7_ILP32_OFFBIG: CInt = 238
public const val _SC_V7_LP64_OFF64: CInt = 239
public const val _SC_V7_LPBIG_OFFBIG: CInt = 240
public const val _SC_SS_REPL_MAX: CInt = 241
public const val _SC_TRACE_EVENT_NAME_MAX: CInt = 242
public const val _SC_TRACE_NAME_MAX: CInt = 243
public const val _SC_TRACE_SYS_MAX: CInt = 244
public const val _SC_TRACE_USER_EVENT_MAX: CInt = 245
public const val _SC_XOPEN_STREAMS: CInt = 246
public const val _SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 247
public const val _SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 248
public const val PTHREAD_KEYS_MAX: CInt = 128
public const val PTHREAD_STACK_MIN: CInt = 2048
public const val PTHREAD_DESTRUCTOR_ITERATIONS: CInt = 4
public const val SEM_VALUE_MAX: CInt = 0x7fffffff
public const val SEM_NSEMS_MAX: CInt = 256
public const val DELAYTIMER_MAX: CInt = 0x7fffffff
public const val MQ_PRIO_MAX: CInt = 32768
public const val LOGIN_NAME_MAX: CInt = 256
public const val CLOCK_REALTIME: ClockidT = 0
public const val CLOCK_MONOTONIC: ClockidT = 1

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { size: [0 (initializer represented at the FFI boundary)
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 1
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 2
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
public const val PTHREAD_MUTEX_STALLED: CInt = 0
public const val PTHREAD_MUTEX_ROBUST: CInt = 1

public expect fun calloc(nobj: ULong, size: ULong): COpaquePointer? 
public expect fun malloc(size: ULong): COpaquePointer? 
public expect fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? 
public expect fun alignedAlloc(align: ULong, len: ULong): COpaquePointer? 
public expect fun free(p: COpaquePointer?)
public expect fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt 
public expect fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? 
public expect fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? 
public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt 
public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? 
public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? 
public expect fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? 
public fun pthreadSelf(): PthreadT = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt 
public fun pthreadExit(value: COpaquePointer?): Nothing = throw UnsupportedOperationException()

public expect fun pthreadAttrInit(attr: PthreadAttrT?): CInt 
public expect fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt 
public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt 
public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): CInt 
public expect fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt 
public expect fun pthreadAttrSettee(attr: PthreadAttrT?, ca: CInt, taskId: CInt, shadow: CInt): CInt 
public expect fun schedYield(): CInt 
public fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt = -1

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt 
public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? 
public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt 
public expect fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt 
public expect fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt 
public expect fun pthreadMutexLock(lock: PthreadMutexT?): CInt 
public expect fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt 
public expect fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt 
public expect fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt 
public expect fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt 
public expect fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt 
public expect fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt 
public expect fun pthreadCondBroadcast(cond: PthreadCondT?): CInt 
public expect fun pthreadCondDestroy(cond: PthreadCondT?): CInt 
public expect fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt 
public expect fun pthreadCondSignal(cond: PthreadCondT?): CInt 
public expect fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt 
public expect fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt 
public expect fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt 
public fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt = -1

public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt 
public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt 
public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt 
public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt 
public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt 
public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt 
public expect fun pthreadOnce(pot: PthreadOnceT?, f: OnceFn): CInt 
public expect fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt 
public expect fun pthreadMutexattrSetprotocol(a: PthreadMutexattrT?, protocol: CInt): CInt 
public expect fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: ULong): CInt 
public expect fun pthreadSetaffinityNp(td: PthreadT, size: ULong, set: CpuSetT?): CInt 
public expect fun pthreadGetaffinityNp(td: PthreadT, size: ULong, set: CpuSetT?): CInt 
public expect fun printf(fmt: String?, vararg args: Any?): CInt 
public expect fun scanf(fmt: String?, vararg args: Any?): CInt 
public expect fun snprintf(s: String?, n: ULong, fmt: String?, vararg args: Any?): CInt 
public expect fun sprintf(s: String?, fmt: String?, vararg args: Any?): CInt 
public expect fun vsnprintf(s: String?, n: ULong, fmt: String?, ap: VaList): CInt 
public expect fun vsprintf(s: String?, fmt: String?, ap: VaList): CInt 
public fun abort(): Nothing = throw UnsupportedOperationException()

public expect fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt 
public expect fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt 
public expect fun sysconf(name: CInt): CLong 
public expect fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? 
public expect fun munmap(addr: COpaquePointer?, len: ULong): CInt 
public expect fun errnoLocation(): CInt? 
public expect fun strerror(e: CInt): String? 
public expect fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt 
public expect fun getpid(): PidT 
public expect fun gettimeofday(tv: Timeval?, tz: COpaquePointer?): CInt 
public expect fun strftime(s: String?, sz: ULong, format: String?, tm: Tm?): ULong 
public expect fun time(t: TimeT?): TimeT 
public expect fun semClose(sem: SemT?): CInt 
public expect fun semDestroy(sem: SemT?): CInt 
public expect fun semGetvalue(sem: SemT?, valp: CInt?): CInt 
public expect fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt 
public expect fun semOpen(name: String?, flags: CInt, vararg args: Any?): SemT? 
public expect fun semPost(sem: SemT?): CInt 
public expect fun semUnlink(name: String?): CInt 
public expect fun semWait(sem: SemT?): CInt 
public expect fun setlocale(cat: CInt, name: String?): String? 
public expect fun strcoll(l: String?, r: String?): CInt 
public expect fun strxfrm(dest: String?, src: String?, n: ULong): ULong 
public fun strtod(s: String?, p: COpaquePointer?): CDouble = 0.0

public expect fun mbrtowc(wc: WcharT?, src: String?, n: ULong, st: MbstateT?): ULong 
public expect fun wcrtomb(s: String?, wc: WcharT, st: MbstateT?): ULong 
public expect fun wctob(c: WintT): CInt 
public expect fun srandom(seed: CUInt)
public expect fun initstate(seed: CUInt, state: String?, size: ULong): String? 
public expect fun setstate(state: String?): String? 
public expect fun random(): CLong 
public expect fun strchr(s: String?, c: CInt): String? 
public expect fun strlen(cs: String?): ULong 
public expect fun strcmp(l: String?, r: String?): CInt 
public expect fun strcpy(dest: String?, src: String?): String? 
public expect fun strncmp(l: String?, r: String?, n: ULong): CInt 
public expect fun strncpy(dest: String?, src: String?, n: ULong): String? 
public expect fun strnlen(cs: String?, n: ULong): ULong 
public expect fun strrchr(s: String?, c: CInt): String? 
public expect fun strstr(h: String?, n: String?): String? 
public expect fun wcschr(s: WcharT?, c: WcharT): WcharT? 
public expect fun wcslen(s: WcharT?): ULong 
public expect fun isalpha(c: CInt): CInt 
public expect fun isascii(c: CInt): CInt 
public expect fun isdigit(c: CInt): CInt 
public expect fun islower(c: CInt): CInt 
public expect fun isprint(c: CInt): CInt 
public expect fun isspace(c: CInt): CInt 
public expect fun iswctype(wc: WintT, ttype: WctypeT): CInt 
public expect fun iswdigit(wc: WintT): CInt 
public expect fun iswlower(wc: WintT): CInt 
public expect fun iswspace(wc: WintT): CInt 
public expect fun iswupper(wc: WintT): CInt 
public fun towupper(wc: WintT): WintT = throw UnsupportedOperationException("Not implemented on this platform")

public fun towlower(wc: WintT): WintT = throw UnsupportedOperationException("Not implemented on this platform")

public fun atan(x: CDouble): CDouble = 0.0

public fun ceil(x: CDouble): CDouble = 0.0

public fun ceilf(x: CFloat): CFloat = 0.0f

public fun exp(x: CDouble): CDouble = 0.0

public fun fabs(x: CDouble): CDouble = 0.0

public fun floor(x: CDouble): CDouble = 0.0

public fun frexp(x: CDouble, e: CInt?): CDouble = 0.0

public fun log(x: CDouble): CDouble = 0.0

public fun log2(x: CDouble): CDouble = 0.0

public fun pow(x: CDouble, y: CDouble): CDouble = 0.0

public fun roundf(x: CFloat): CFloat = 0.0f

public fun scalbn(x: CDouble, n: CInt): CDouble = 0.0

public fun sqrt(x: CDouble): CDouble = 0.0

public expect fun abs(x: CInt): CInt 
public fun atof(s: String?): CDouble = 0.0

public expect fun atoi(s: String?): CInt 
public expect fun atol(s: String?): CLong 
public expect fun atoll(s: String?): CLongLong 
public expect fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: ULong, width: ULong, cmp: Cmpfunc): COpaquePointer? 
public fun div(num: CInt, den: CInt): DivT = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun ecvt(x: CDouble, n: CInt, dp: CInt?, sign: CInt?): String? 
public fun imaxabs(a: IntmaxT): IntmaxT = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun llabs(a: CLongLong): CLongLong 
public expect fun qsort(base: COpaquePointer?, nel: ULong, width: ULong, cmp: Cmpfunc)
public expect fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CULong 
public expect fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong 
public fun wcstod(s: WcharT?, p: COpaquePointer?): CDouble = 0.0
