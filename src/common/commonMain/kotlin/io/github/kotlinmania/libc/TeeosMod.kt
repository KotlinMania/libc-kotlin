package io.github.kotlinmania.libc

// Libc bindings for teeos
//
// Apparently the loader just dynamically links it anyway, but fails
// when linking is explicitly requested.

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

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

// long double in C means A float point value, which has 128bit length.
// but some bit maybe not used, so the real length of long double could be 80(x86) or 128(power pc/IEEE)
// this is different from f128(not stable and not included default) in Rust, so we use u128 for FFI(Rust to C).
// this is unstable and will cause to memfault/data abort.
public typealias CLongdouble = ClongDouble

public typealias PthreadT = CUlong

public typealias PthreadKeyT = CUint

public typealias PthreadSpinlockT = CInt

public typealias OffT = Long

public typealias TimeT = CLong

public typealias ClockT = CLong

public typealias ClockidT = CInt

public typealias SusecondsT = CLong

public fun interface OnceFn {
    public operator fun invoke()
}

public typealias PthreadOnceT = CInt

public typealias VaList = COpaquePointer?

public typealias WintT = CUint

public typealias WctypeT = CUlong

public fun interface Cmpfunc {
    public operator fun invoke(x: COpaquePointer?, y: COpaquePointer?): CInt
}

// fcntl
public val O_CREAT: UInt = 64u

public val O_EXCL: UInt = 128u

public val O_NOCTTY: UInt = 256u

public val O_TRUNC: UInt = 512u

public val O_APPEND: UInt = 1024u

public val O_NONBLOCK: UInt = 2048u

public val O_DSYNC: UInt = 4096u

public val O_SYNC: UInt = 1052672u

public val O_RSYNC: UInt = 1052672u

public val O_DIRECTORY: UInt = 65536u

public val O_NOFOLLOW: UInt = 131072u

public val O_CLOEXEC: UInt = 524288u

public val O_ASYNC: UInt = 8192u

public val O_DIRECT: UInt = 16384u

public val O_LARGEFILE: UInt = 32768u

public val O_NOATIME: UInt = 262144u

public val O_PATH: UInt = 2097152u

public val O_TMPFILE: UInt = 4259840u

public val O_NDELAY: UInt = O_NONBLOCK

public val F_DUPFD: UInt = 0u

public val F_GETFD: UInt = 1u

public val F_SETFD: UInt = 2u

public val F_GETFL: UInt = 3u

public val F_SETFL: UInt = 4u

public val F_SETOWN: UInt = 8u

public val F_GETOWN: UInt = 9u

public val F_SETSIG: UInt = 10u

public val F_GETSIG: UInt = 11u

public val F_GETLK: UInt = 12u

public val F_SETLK: UInt = 13u

public val F_SETLKW: UInt = 14u

public val F_SETOWN_EX: UInt = 15u

public val F_GETOWN_EX: UInt = 16u

public val F_GETOWNER_UIDS: UInt = 17u

// mman
public val MAP_FAILED: ULong = 0xffffffffffffffffuL

public val MAP_FIXED_NOREPLACE: UInt = 0x100000u

public val MAP_SHARED_VALIDATE: UInt = 0x03u

public val MAP_SHARED: UInt = 0x01u

public val MAP_PRIVATE: UInt = 0x02u

public val MAP_TYPE: UInt = 0x0fu

public val MAP_FIXED: UInt = 0x10u

public val MAP_ANON: UInt = 0x20u

public val MAP_ANONYMOUS: UInt = MAP_ANON

public val MAP_NORESERVE: UInt = 0x4000u

public val MAP_GROWSDOWN: UInt = 0x0100u

public val MAP_DENYWRITE: UInt = 0x0800u

public val MAP_EXECUTABLE: UInt = 0x1000u

public val MAP_LOCKED: UInt = 0x2000u

public val MAP_POPULATE: UInt = 0x8000u

public val MAP_NONBLOCK: UInt = 0x10000u

public val MAP_STACK: UInt = 0x20000u

public val MAP_HUGETLB: UInt = 0x40000u

public val MAP_SYNC: UInt = 0x80000u

public val MAP_FILE: UInt = 0u

public val MAP_HUGE_SHIFT: UInt = 26u

public val MAP_HUGE_MASK: UInt = 0x3fu

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

public val PROT_NONE: UInt = 0u

public val PROT_READ: UInt = 1u

public val PROT_WRITE: UInt = 2u

public val PROT_EXEC: UInt = 4u

public val PROT_GROWSDOWN: UInt = 0x01000000u

public val PROT_GROWSUP: UInt = 0x02000000u

public val MS_ASYNC: UInt = 1u

public val MS_INVALIDATE: UInt = 2u

public val MS_SYNC: UInt = 4u

public val MCL_CURRENT: UInt = 1u

public val MCL_FUTURE: UInt = 2u

public val MCL_ONFAULT: UInt = 4u

public val POSIX_MADV_NORMAL: UInt = 0u

public val POSIX_MADV_RANDOM: UInt = 1u

public val POSIX_MADV_SEQUENTIAL: UInt = 2u

public val POSIX_MADV_WILLNEED: UInt = 3u

public val POSIX_MADV_DONTNEED: UInt = 4u

// wctype
public val WCTYPE_ALNUM: ULong = 1uL

public val WCTYPE_ALPHA: ULong = 2uL

public val WCTYPE_BLANK: ULong = 3uL

public val WCTYPE_CNTRL: ULong = 4uL

public val WCTYPE_DIGIT: ULong = 5uL

public val WCTYPE_GRAPH: ULong = 6uL

public val WCTYPE_LOWER: ULong = 7uL

public val WCTYPE_PRINT: ULong = 8uL

public val WCTYPE_PUNCT: ULong = 9uL

public val WCTYPE_SPACE: ULong = 10uL

public val WCTYPE_UPPER: ULong = 11uL

public val WCTYPE_XDIGIT: ULong = 12uL

// locale
public val LC_CTYPE: Int = 0

public val LC_NUMERIC: Int = 1

public val LC_TIME: Int = 2

public val LC_COLLATE: Int = 3

public val LC_MONETARY: Int = 4

public val LC_MESSAGES: Int = 5

public val LC_ALL: Int = 6

// pthread
public val SIZEOF_PTHREAD_COND_T: Int = 48

public val SIZEOF_PTHREAD_MUTEX_T: Int = 40

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

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

public val EDEADLK: CInt = 35

public val ENAMETOOLONG: CInt = 36

public val ENOLCK: CInt = 37

public val ENOSYS: CInt = 38

public val ENOTEMPTY: CInt = 39

public val ELOOP: CInt = 40

public val EWOULDBLOCK: CInt = EAGAIN

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

public val EDEADLOCK: CInt = EDEADLK

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

public val EMULTIHOP: CInt = 72

public val EDOTDOT: CInt = 73

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

public val EPROTONOSUPPOR: CInt = 93

public val ESOCKTNOSUPPOR: CInt = 94

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

public val ERFKILL: CInt = 132

public val EHWPOISON: CInt = 133

// pthreadAttr.h
public val TEESMP_THREAD_ATTR_CA_WILDCARD: CInt = 0

public val TEESMP_THREAD_ATTR_CA_INHERIT: CInt = -1

public val TEESMP_THREAD_ATTR_TASK_ID_INHERIT: CInt = -1

public val TEESMP_THREAD_ATTR_HAS_SHADOW: CInt = 0x1

public val TEESMP_THREAD_ATTR_NO_SHADOW: CInt = 0x0

// unistd.h
public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_STREAM_MAX: CInt = 5

public val SC_TZNAME_MAX: CInt = 6

public val SC_JOB_CONTROL: CInt = 7

public val SC_SAVED_IDS: CInt = 8

public val SC_REALTIME_SIGNALS: CInt = 9

public val SC_PRIORITY_SCHEDULING: CInt = 10

public val SC_TIMERS: CInt = 11

public val SC_ASYNCHRONOUS_IO: CInt = 12

public val SC_PRIORITIZED_IO: CInt = 13

public val SC_SYNCHRONIZED_IO: CInt = 14

public val SC_FSYNC: CInt = 15

public val SC_MAPPED_FILES: CInt = 16

public val SC_MEMLOCK: CInt = 17

public val SC_MEMLOCK_RANGE: CInt = 18

public val SC_MEMORY_PROTECTION: CInt = 19

public val SC_MESSAGE_PASSING: CInt = 20

public val SC_SEMAPHORES: CInt = 21

public val SC_SHARED_MEMORY_OBJECTS: CInt = 22

public val SC_AIO_LISTIO_MAX: CInt = 23

public val SC_AIO_MAX: CInt = 24

public val SC_AIO_PRIO_DELTA_MAX: CInt = 25

public val SC_DELAYTIMER_MAX: CInt = 26

public val SC_MQ_OPEN_MAX: CInt = 27

public val SC_MQ_PRIO_MAX: CInt = 28

public val SC_VERSION: CInt = 29

public val SC_PAGE_SIZE: CInt = 30

public val SC_PAGESIZE: CInt = 30

// !!
public val SC_RTSIG_MAX: CInt = 31

public val SC_SEM_NSEMS_MAX: CInt = 32

public val SC_SEM_VALUE_MAX: CInt = 33

public val SC_SIGQUEUE_MAX: CInt = 34

public val SC_TIMER_MAX: CInt = 35

public val SC_BC_BASE_MAX: CInt = 36

public val SC_BC_DIM_MAX: CInt = 37

public val SC_BC_SCALE_MAX: CInt = 38

public val SC_BC_STRING_MAX: CInt = 39

public val SC_COLL_WEIGHTS_MAX: CInt = 40

public val SC_EXPR_NEST_MAX: CInt = 42

public val SC_LINE_MAX: CInt = 43

public val SC_RE_DUP_MAX: CInt = 44

public val SC_2_VERSION: CInt = 46

public val SC_2_C_BIND: CInt = 47

public val SC_2_C_DEV: CInt = 48

public val SC_2_FORT_DEV: CInt = 49

public val SC_2_FORT_RUN: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_LOCALEDEF: CInt = 52

public val SC_UIO_MAXIOV: CInt = 60

// !!
public val SC_IOV_MAX: CInt = 60

public val SC_THREADS: CInt = 67

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 68

public val SC_GETGR_R_SIZE_MAX: CInt = 69

public val SC_GETPW_R_SIZE_MAX: CInt = 70

public val SC_LOGIN_NAME_MAX: CInt = 71

public val SC_TTY_NAME_MAX: CInt = 72

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 73

public val SC_THREAD_KEYS_MAX: CInt = 74

public val SC_THREAD_STACK_MIN: CInt = 75

public val SC_THREAD_THREADS_MAX: CInt = 76

public val SC_THREAD_ATTR_STACKADDR: CInt = 77

public val SC_THREAD_ATTR_STACKSIZE: CInt = 78

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 79

public val SC_THREAD_PRIO_INHERIT: CInt = 80

public val SC_THREAD_PRIO_PROTECT: CInt = 81

public val SC_THREAD_PROCESS_SHARED: CInt = 82

public val SC_NPROCESSORS_CONF: CInt = 83

public val SC_NPROCESSORS_ONLN: CInt = 84

public val SC_PHYS_PAGES: CInt = 85

public val SC_AVPHYS_PAGES: CInt = 86

public val SC_ATEXIT_MAX: CInt = 87

public val SC_PASS_MAX: CInt = 88

public val SC_XOPEN_VERSION: CInt = 89

public val SC_XOPEN_XCU_VERSION: CInt = 90

public val SC_XOPEN_UNIX: CInt = 91

public val SC_XOPEN_CRYPT: CInt = 92

public val SC_XOPEN_ENH_I18N: CInt = 93

public val SC_XOPEN_SHM: CInt = 94

public val SC_2_CHAR_TERM: CInt = 95

public val SC_2_UPE: CInt = 97

public val SC_XOPEN_XPG2: CInt = 98

public val SC_XOPEN_XPG3: CInt = 99

public val SC_XOPEN_XPG4: CInt = 100

public val SC_NZERO: CInt = 109

public val SC_XBS5_ILP32_OFF32: CInt = 125

public val SC_XBS5_ILP32_OFFBIG: CInt = 126

public val SC_XBS5_LP64_OFF64: CInt = 127

public val SC_XBS5_LPBIG_OFFBIG: CInt = 128

public val SC_XOPEN_LEGACY: CInt = 129

public val SC_XOPEN_REALTIME: CInt = 130

public val SC_XOPEN_REALTIME_THREADS: CInt = 131

public val SC_ADVISORY_INFO: CInt = 132

public val SC_BARRIERS: CInt = 133

public val SC_CLOCK_SELECTION: CInt = 137

public val SC_CPUTIME: CInt = 138

public val SC_THREAD_CPUTIME: CInt = 139

public val SC_MONOTONIC_CLOCK: CInt = 149

public val SC_READER_WRITER_LOCKS: CInt = 153

public val SC_SPIN_LOCKS: CInt = 154

public val SC_REGEXP: CInt = 155

public val SC_SHELL: CInt = 157

public val SC_SPAWN: CInt = 159

public val SC_SPORADIC_SERVER: CInt = 160

public val SC_THREAD_SPORADIC_SERVER: CInt = 161

public val SC_TIMEOUTS: CInt = 164

public val SC_TYPED_MEMORY_OBJECTS: CInt = 165

public val SC_2_PBS: CInt = 168

public val SC_2_PBS_ACCOUNTING: CInt = 169

public val SC_2_PBS_LOCATE: CInt = 170

public val SC_2_PBS_MESSAGE: CInt = 171

public val SC_2_PBS_TRACK: CInt = 172

public val SC_SYMLOOP_MAX: CInt = 173

public val SC_STREAMS: CInt = 174

public val SC_2_PBS_CHECKPOINT: CInt = 175

public val SC_V6_ILP32_OFF32: CInt = 176

public val SC_V6_ILP32_OFFBIG: CInt = 177

public val SC_V6_LP64_OFF64: CInt = 178

public val SC_V6_LPBIG_OFFBIG: CInt = 179

public val SC_HOST_NAME_MAX: CInt = 180

public val SC_TRACE: CInt = 181

public val SC_TRACE_EVENT_FILTER: CInt = 182

public val SC_TRACE_INHERIT: CInt = 183

public val SC_TRACE_LOG: CInt = 184

public val SC_IPV6: CInt = 235

public val SC_RAW_SOCKETS: CInt = 236

public val SC_V7_ILP32_OFF32: CInt = 237

public val SC_V7_ILP32_OFFBIG: CInt = 238

public val SC_V7_LP64_OFF64: CInt = 239

public val SC_V7_LPBIG_OFFBIG: CInt = 240

public val SC_SS_REPL_MAX: CInt = 241

public val SC_TRACE_EVENT_NAME_MAX: CInt = 242

public val SC_TRACE_NAME_MAX: CInt = 243

public val SC_TRACE_SYS_MAX: CInt = 244

public val SC_TRACE_USER_EVENT_MAX: CInt = 245

public val SC_XOPEN_STREAMS: CInt = 246

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 247

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 248

// limits.h
public val PTHREAD_KEYS_MAX: CInt = 128

public val PTHREAD_STACK_MIN: CInt = 2048

public val PTHREAD_DESTRUCTOR_ITERATIONS: CInt = 4

public val SEM_VALUE_MAX: CInt = 0x7fffffff

public val SEM_NSEMS_MAX: CInt = 256

public val DELAYTIMER_MAX: CInt = 0x7fffffff

public val MQ_PRIO_MAX: CInt = 32768

public val LOGIN_NAME_MAX: CInt = 256

// time.h
public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_MONOTONIC: ClockidT = 1

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(size = List(SIZEOF_PTHREAD_MUTEX_T) { 0 })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(size = List(SIZEOF_PTHREAD_COND_T) { 0 })

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_MUTEX_STALLED: CInt = 0

public val PTHREAD_MUTEX_ROBUST: CInt = 1

// ---- ALLOC -----------------------------------------------------------------------------
public fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("calloc", -1, longArrayOf(nobj.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun malloc(size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("malloc", -1, longArrayOf(size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("realloc", -1, longArrayOf(p?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("aligned_alloc", -1, longArrayOf(align.toLong(), len.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun free(p: COpaquePointer?) {
    LibcDynamicFfi.invoke("free", -1, longArrayOf(p?.value ?: 0L))
}

public fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("posix_memalign", -1, longArrayOf(memptr?.value ?: 0L, align.toLong(), size.toLong())).toInt()
}

public fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun wmemchr(cx: UInt?, c: WcharT, n: SizeT): UInt? {
    val __slot_0 = if (cx == null) 0L else LibcDynamicFfi.allocScalarSlot(cx.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("wmemchr", -1, longArrayOf(__slot_0, c.toLong(), n.toLong()))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toUInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt {
    return LibcDynamicFfi.invoke("memcmp", -1, longArrayOf(cx?.value ?: 0L, ct?.value ?: 0L, n.toLong())).toInt()
}

public fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memcpy", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmove", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memset", -1, longArrayOf(dest?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// ----- PTHREAD ---------------------------------------------------------------------------
public fun pthreadSelf(): PthreadT {
    return LibcDynamicFfi.invoke("pthread_self", -1, longArrayOf()).toULong()
}

public fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_join", -1, longArrayOf(native.toLong(), value?.value ?: 0L)).toInt()
}

// detach or pthreadAttrSetdetachstate must not be called!
// pub fn pthreadDetach(thread: pthreadT) -> cInt;
public fun pthreadExit(value: COpaquePointer?): Nothing {
    LibcDynamicFfi.invoke("pthread_exit", -1, longArrayOf(value?.value ?: 0L))
    error("unreachable")
}

public fun pthreadAttrInit(attr: PthreadAttrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt {
    val __slot_2 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstack", -1, longArrayOf(attr?.value ?: 0L, stackaddr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setstacksize", -1, longArrayOf(attr?.value ?: 0L, stackSize.toLong())).toInt()
}

public fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt {
    val __slot_1 = if (size == null) 0L else LibcDynamicFfi.allocScalarSlot(size.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstacksize", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrSettee(attr: PthreadAttrT?, ca: CInt, taskId: CInt, shadow: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_settee", -1, longArrayOf(attr?.value ?: 0L, ca.toLong(), taskId.toLong(), shadow.toLong())).toInt()
}

// C-TA API do not include this interface, but TA can use.
public fun schedYield(): CInt {
    return LibcDynamicFfi.invoke("sched_yield", -1, longArrayOf()).toInt()
}

public fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt {
    val __slot_0 = if (key == null) 0L else LibcDynamicFfi.allocScalarSlot(key.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_key_create", -1, longArrayOf(__slot_0, dtor?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadKeyDelete(key: PthreadKeyT): CInt {
    return LibcDynamicFfi.invoke("pthread_key_delete", -1, longArrayOf(key.toLong())).toInt()
}

public fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("pthread_getspecific", -1, longArrayOf(key.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_setspecific", -1, longArrayOf(key.toLong(), value?.value ?: 0L)).toInt()
}

public fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_destroy", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_init", -1, longArrayOf(lock?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun pthreadMutexLock(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_lock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_trylock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_unlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_settype", -1, longArrayOf(attr?.value ?: 0L, type.toLong())).toInt()
}

public fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, pshared.toLong())).toInt()
}

public fun pthreadCondBroadcast(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_broadcast", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

public fun pthreadCondDestroy(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_destroy", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

public fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_init", -1, longArrayOf(cond?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun pthreadCondSignal(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_signal", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

public fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_wait", -1, longArrayOf(cond?.value ?: 0L, lock?.value ?: 0L)).toInt()
}

public fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_timedwait", -1, longArrayOf(cond?.value ?: 0L, lock?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_setrobust", -1, longArrayOf(attr?.value ?: 0L, robustness.toLong())).toInt()
}

public fun pthreadCreate(native: CUlong?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt {
    val __slot_0 = if (native == null) 0L else LibcDynamicFfi.allocScalarSlot(native.toLong())
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(__slot_0, attr?.value ?: 0L, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadSpinInit(lock: CInt?, pshared: CInt): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_init", -1, longArrayOf(__slot_0, pshared.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinDestroy(lock: CInt?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinLock(lock: CInt?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_lock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinTrylock(lock: CInt?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_trylock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinUnlock(lock: CInt?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_unlock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_setschedprio", -1, longArrayOf(native.toLong(), priority.toLong())).toInt()
}

public fun pthreadOnce(pot: CInt?, f: OnceFn?): CInt {
    val __slot_0 = if (pot == null) 0L else LibcDynamicFfi.allocScalarSlot(pot.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_once", -1, longArrayOf(__slot_0, f?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_equal", -1, longArrayOf(p1.toLong(), p2.toLong())).toInt()
}

public fun pthreadMutexattrSetprotocol(a: PthreadMutexattrT?, protocol: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_setprotocol", -1, longArrayOf(a?.value ?: 0L, protocol.toLong())).toInt()
}

public fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setstack", -1, longArrayOf(attr?.value ?: 0L, stack?.value ?: 0L, size.toLong())).toInt()
}

public fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("pthread_setaffinity_np", -1, longArrayOf(td.toLong(), size.toLong(), set?.value ?: 0L)).toInt()
}

public fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("pthread_getaffinity_np", -1, longArrayOf(td.toLong(), size.toLong(), set?.value ?: 0L)).toInt()
}

// stdio.h
public fun printf(fmt: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        return LibcDynamicFfi.invoke("printf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun scanf(fmt: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        return LibcDynamicFfi.invoke("scanf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun snprintf(s: COpaquePointer?, n: SizeT, fmt: String?, vararg variadicArgs: Long): CInt {
    val __cstr_2 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        return LibcDynamicFfi.invoke("snprintf", 3, longArrayOf(s?.value ?: 0L, n.toLong(), __cstr_2) + variadicArgs).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun sprintf(s: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        return LibcDynamicFfi.invoke("sprintf", 2, longArrayOf(s?.value ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt {
    val __cstr_2 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        return LibcDynamicFfi.invoke("vsnprintf", -1, longArrayOf(s?.value ?: 0L, n.toLong(), __cstr_2, ap?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt {
    val __cstr_1 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        return LibcDynamicFfi.invoke("vsprintf", -1, longArrayOf(s?.value ?: 0L, __cstr_1, ap?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// Not available.
// pub fn pthreadSetnameNp(thread: pthreadT, name: *const cChar) -> cInt;
public fun abort(): Nothing {
    LibcDynamicFfi.invoke("abort", -1, longArrayOf())
    error("unreachable")
}

// Not available.
// pub fn prctl(op: cInt, ...) -> cInt;
public fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("sched_getaffinity", -1, longArrayOf(pid.toLong(), cpusetsize.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("sched_setaffinity", -1, longArrayOf(pid.toLong(), cpusetsize.toLong(), cpuset?.value ?: 0L)).toInt()
}

// sysconf is currently only implemented as a Note.
public fun sysconf(name: CInt): CLong {
    return LibcDynamicFfi.invoke("sysconf", -1, longArrayOf(name.toLong()))
}

// mman.h
public fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong(), flags.toLong(), fd.toLong(), offset))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun munmap(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("munmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

// errno.h
public fun errnoLocation(): CInt? {
    val rawRet = LibcDynamicFfi.invoke("__errno_location", -1, longArrayOf())
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
}

public fun strerror(e: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("strerror", -1, longArrayOf(e.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// time.h
public fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clockId.toLong(), tp?.value ?: 0L)).toInt()
}

// unistd
public fun getpid(): PidT {
    return LibcDynamicFfi.invoke("getpid", -1, longArrayOf()).toInt()
}

// time
public fun gettimeofday(tv: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tv?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict: String?, restrict: Tm?): SizeT {
    val __cstr_2 = if (restrict == null) 0L else LibcDynamicFfi.allocUtf8CString(restrict)
    try {
        return LibcDynamicFfi.invoke("strftime", -1, longArrayOf(restrict?.value ?: 0L, sz.toLong(), __cstr_2, restrict?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun time(t: CLong?): TimeT {
    val __slot_0 = if (t == null) 0L else LibcDynamicFfi.allocScalarSlot(t)
    try {
        return LibcDynamicFfi.invoke("time", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// sem
public fun semClose(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_close", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semDestroy(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_destroy", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semGetvalue(sem: SemT?, valp: CInt?): CInt {
    val __slot_1 = if (valp == null) 0L else LibcDynamicFfi.allocScalarSlot(valp.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_getvalue", -1, longArrayOf(sem?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt {
    return LibcDynamicFfi.invoke("sem_init", -1, longArrayOf(sem?.value ?: 0L, pshared.toLong(), value.toLong())).toInt()
}

public fun semOpen(name: String?, flags: CInt, vararg variadicArgs: Long): SemT? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("sem_open", 2, longArrayOf(__cstr_0, flags.toLong()) + variadicArgs)
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun semPost(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_post", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sem_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun semWait(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_wait", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

// locale
public fun setlocale(cat: CInt, name: String?): COpaquePointer? {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("setlocale", -1, longArrayOf(cat.toLong(), __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcoll(l: String?, r: String?): CInt {
    val __cstr_0 = if (l == null) 0L else LibcDynamicFfi.allocUtf8CString(l)
    val __cstr_1 = if (r == null) 0L else LibcDynamicFfi.allocUtf8CString(r)
    try {
        return LibcDynamicFfi.invoke("strcoll", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        return LibcDynamicFfi.invoke("strxfrm", -1, longArrayOf(dest?.value ?: 0L, __cstr_1, n.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strtod(s: String?, p: COpaquePointer?): CDouble {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("strtod", 0, false, longArrayOf(__cstr_0, p?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// multibyte
public fun mbrtowc(wc: UInt?, src: String?, n: SizeT, st: MbstateT?): SizeT {
    val __slot_0 = if (wc == null) 0L else LibcDynamicFfi.allocScalarSlot(wc.toLong())
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        return LibcDynamicFfi.invoke("mbrtowc", -1, longArrayOf(__slot_0, __cstr_1, n.toLong(), st?.value ?: 0L)).toULong()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: MbstateT?): SizeT {
    return LibcDynamicFfi.invoke("wcrtomb", -1, longArrayOf(s?.value ?: 0L, wc.toLong(), st?.value ?: 0L)).toULong()
}

public fun wctob(c: WintT): CInt {
    return LibcDynamicFfi.invoke("wctob", -1, longArrayOf(c.toLong())).toInt()
}

// prng
public fun srandom(seed: CUint) {
    LibcDynamicFfi.invoke("srandom", -1, longArrayOf(seed.toLong()))
}

public fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("initstate", -1, longArrayOf(seed.toLong(), state?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setstate(state: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("setstate", -1, longArrayOf(state?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun random(): CLong {
    return LibcDynamicFfi.invoke("random", -1, longArrayOf())
}

// string
public fun strchr(s: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("strchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strlen(cs: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        return LibcDynamicFfi.invoke("strlen", -1, longArrayOf(__cstr_0)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strcmp(l: String?, r: String?): CInt {
    val __cstr_0 = if (l == null) 0L else LibcDynamicFfi.allocUtf8CString(l)
    val __cstr_1 = if (r == null) 0L else LibcDynamicFfi.allocUtf8CString(r)
    try {
        return LibcDynamicFfi.invoke("strcmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcpy", -1, longArrayOf(dest?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncmp(l: String?, r: String?, n: SizeT): CInt {
    val __cstr_0 = if (l == null) 0L else LibcDynamicFfi.allocUtf8CString(l)
    val __cstr_1 = if (r == null) 0L else LibcDynamicFfi.allocUtf8CString(r)
    try {
        return LibcDynamicFfi.invoke("strncmp", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncpy", -1, longArrayOf(dest?.value ?: 0L, __cstr_1, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strnlen(cs: String?, n: SizeT): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        return LibcDynamicFfi.invoke("strnlen", -1, longArrayOf(__cstr_0, n.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strrchr(s: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("strrchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strstr(h: String?, n: String?): COpaquePointer? {
    val __cstr_0 = if (h == null) 0L else LibcDynamicFfi.allocUtf8CString(h)
    val __cstr_1 = if (n == null) 0L else LibcDynamicFfi.allocUtf8CString(n)
    try {
        val rawRet = LibcDynamicFfi.invoke("strstr", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wcschr(s: UInt?, c: WcharT): UInt? {
    val __slot_0 = if (s == null) 0L else LibcDynamicFfi.allocScalarSlot(s.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("wcschr", -1, longArrayOf(__slot_0, c.toLong()))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toUInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun wcslen(s: UInt?): SizeT {
    val __slot_0 = if (s == null) 0L else LibcDynamicFfi.allocScalarSlot(s.toLong())
    try {
        return LibcDynamicFfi.invoke("wcslen", -1, longArrayOf(__slot_0)).toULong()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// ctype
public fun isalpha(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isalpha", -1, longArrayOf(c.toLong())).toInt()
}

public fun isascii(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isascii", -1, longArrayOf(c.toLong())).toInt()
}

public fun isdigit(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isdigit", -1, longArrayOf(c.toLong())).toInt()
}

public fun islower(c: CInt): CInt {
    return LibcDynamicFfi.invoke("islower", -1, longArrayOf(c.toLong())).toInt()
}

public fun isprint(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isprint", -1, longArrayOf(c.toLong())).toInt()
}

public fun isspace(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isspace", -1, longArrayOf(c.toLong())).toInt()
}

public fun iswctype(wc: WintT, ttype: WctypeT): CInt {
    return LibcDynamicFfi.invoke("iswctype", -1, longArrayOf(wc.toLong(), ttype.toLong())).toInt()
}

public fun iswdigit(wc: WintT): CInt {
    return LibcDynamicFfi.invoke("iswdigit", -1, longArrayOf(wc.toLong())).toInt()
}

public fun iswlower(wc: WintT): CInt {
    return LibcDynamicFfi.invoke("iswlower", -1, longArrayOf(wc.toLong())).toInt()
}

public fun iswspace(wc: WintT): CInt {
    return LibcDynamicFfi.invoke("iswspace", -1, longArrayOf(wc.toLong())).toInt()
}

public fun iswupper(wc: WintT): CInt {
    return LibcDynamicFfi.invoke("iswupper", -1, longArrayOf(wc.toLong())).toInt()
}

public fun towupper(wc: WintT): WintT {
    return LibcDynamicFfi.invoke("towupper", -1, longArrayOf(wc.toLong())).toUInt()
}

public fun towlower(wc: WintT): WintT {
    return LibcDynamicFfi.invoke("towlower", -1, longArrayOf(wc.toLong())).toUInt()
}

// cmath
public fun atan(x: CDouble): CDouble {
    return LibcDynamicFfi.invokeFp("atan", 2, false, longArrayOf(x.toRawBits()))
}

public fun ceil(x: CDouble): CDouble {
    return LibcDynamicFfi.invokeFp("ceil", 2, false, longArrayOf(x.toRawBits()))
}

public fun ceilf(x: CFloat): CFloat {
    return LibcDynamicFfi.invokeFp("ceilf", 1, true, longArrayOf((x.toRawBits().toLong() and 0xFFFF_FFFFL))).toFloat()
}

public fun exp(x: CDouble): CDouble {
    return LibcDynamicFfi.invokeFp("exp", 2, false, longArrayOf(x.toRawBits()))
}

public fun fabs(x: CDouble): CDouble {
    return LibcDynamicFfi.invokeFp("fabs", 2, false, longArrayOf(x.toRawBits()))
}

public fun floor(x: CDouble): CDouble {
    return LibcDynamicFfi.invokeFp("floor", 2, false, longArrayOf(x.toRawBits()))
}

public fun frexp(x: CDouble, e: CInt?): CDouble {
    val __slot_1 = if (e == null) 0L else LibcDynamicFfi.allocScalarSlot(e.toLong())
    try {
        return LibcDynamicFfi.invokeFp("frexp", 2, false, longArrayOf(x.toRawBits(), __slot_1))
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun log(x: CDouble): CDouble {
    return LibcDynamicFfi.invokeFp("log", 2, false, longArrayOf(x.toRawBits()))
}

public fun log2(x: CDouble): CDouble {
    return LibcDynamicFfi.invokeFp("log2", 2, false, longArrayOf(x.toRawBits()))
}

public fun pow(x: CDouble, y: CDouble): CDouble {
    return LibcDynamicFfi.invokeFp("pow", 10, false, longArrayOf(x.toRawBits(), y.toRawBits()))
}

public fun roundf(x: CFloat): CFloat {
    return LibcDynamicFfi.invokeFp("roundf", 1, true, longArrayOf((x.toRawBits().toLong() and 0xFFFF_FFFFL))).toFloat()
}

public fun scalbn(x: CDouble, n: CInt): CDouble {
    return LibcDynamicFfi.invokeFp("scalbn", 2, false, longArrayOf(x.toRawBits(), n.toLong()))
}

public fun sqrt(x: CDouble): CDouble {
    return LibcDynamicFfi.invokeFp("sqrt", 2, false, longArrayOf(x.toRawBits()))
}

// stdlib
public fun abs(x: CInt): CInt {
    return LibcDynamicFfi.invoke("abs", -1, longArrayOf(x.toLong())).toInt()
}

public fun atof(s: String?): CDouble {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("atof", 0, false, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atoi(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atoi", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atol(s: String?): CLong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atol", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atoll(s: String?): CLonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atoll", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer? {
    val __scratch_4 = LibcDynamicFfi.allocZeroed(4096)
    try {
        val rawRet = LibcDynamicFfi.invoke("bsearch", -1, longArrayOf(key?.value ?: 0L, base?.value ?: 0L, nel.toLong(), width.toLong(), __scratch_4))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__scratch_4 != 0L) LibcDynamicFfi.freeMem(__scratch_4)
    }
}

public fun div(num: CInt, den: CInt): DivT {
    LibcDynamicFfi.invoke("div", -1, longArrayOf(num.toLong(), den.toLong()))
    return null as DivT
}

public fun ecvt(x: CDouble, n: CInt, dp: CInt?, sign: CInt?): COpaquePointer? {
    val __slot_2 = if (dp == null) 0L else LibcDynamicFfi.allocScalarSlot(dp.toLong())
    val __slot_3 = if (sign == null) 0L else LibcDynamicFfi.allocScalarSlot(sign.toLong())
    try {
        val rawRet = LibcDynamicFfi.invokeFp("ecvt", 2, false, longArrayOf(x.toRawBits(), n.toLong(), __slot_2, __slot_3)).toLong()
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun imaxabs(a: IntmaxT): IntmaxT {
    return LibcDynamicFfi.invoke("imaxabs", -1, longArrayOf(a))
}

public fun llabs(a: CLonglong): CLonglong {
    return LibcDynamicFfi.invoke("llabs", -1, longArrayOf(a))
}

public fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("qsort", -1, longArrayOf(base?.value ?: 0L, nel.toLong(), width.toLong(), __scratch_3))
    } finally {
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoul", -1, longArrayOf(__cstr_0, p?.value ?: 0L, base.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtol", -1, longArrayOf(__cstr_0, p?.value ?: 0L, base.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wcstod(s: UInt?, p: COpaquePointer?): CDouble {
    val __slot_0 = if (s == null) 0L else LibcDynamicFfi.allocScalarSlot(s.toLong())
    try {
        return LibcDynamicFfi.invokeFp("wcstod", 0, false, longArrayOf(__slot_0, p?.value ?: 0L))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun errno(): CInt {
    return errnoLocation()
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = 8
    for (i in cpuset.bits[0 until (size / sizeOfMask)].iter()) {
        s += i.countOnes()
    }
    return s.toInt()
}

public fun cpuCount(cpuset: CpuSetT): CInt {
    return CPU_COUNT_S(sizeOf<CpuSetT>(), cpuset)
}
