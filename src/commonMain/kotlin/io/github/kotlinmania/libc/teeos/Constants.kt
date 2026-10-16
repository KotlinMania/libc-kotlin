package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

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

public const val EDEADLK: Int = 35

public const val ENAMETOOLONG: Int = 36

public const val ENOLCK: Int = 37

public const val ENOSYS: Int = 38

public const val ENOTEMPTY: Int = 39

public const val ELOOP: Int = 40

public const val EWOULDBLOCK: Int = EAGAIN

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

public const val EDEADLOCK: Int = EDEADLK

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

public const val EMULTIHOP: Int = 72

public const val EDOTDOT: Int = 73

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

public const val EPROTONOSUPPOR: Int = 93

public const val ESOCKTNOSUPPOR: Int = 94

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

public const val ERFKILL: Int = 132

public const val EHWPOISON: Int = 133

public const val TEESMP_THREAD_ATTR_CA_WILDCARD: Int = 0

public const val TEESMP_THREAD_ATTR_CA_INHERIT: Int = -1

public const val TEESMP_THREAD_ATTR_TASK_ID_INHERIT: Int = -1

public const val TEESMP_THREAD_ATTR_HAS_SHADOW: Int = 0x1

public const val TEESMP_THREAD_ATTR_NO_SHADOW: Int = 0x0

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

public const val _SC_PAGE_SIZE: Int = 30

public const val _SC_PAGESIZE: Int = 30

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

public const val PTHREAD_KEYS_MAX: Int = 128

public const val PTHREAD_STACK_MIN: Int = 2048

public const val PTHREAD_DESTRUCTOR_ITERATIONS: Int = 4

public const val SEM_VALUE_MAX: Int = 0x7fffffff

public const val SEM_NSEMS_MAX: Int = 256

public const val DELAYTIMER_MAX: Int = 0x7fffffff

public const val MQ_PRIO_MAX: Int = 32768

public const val LOGIN_NAME_MAX: Int = 256

public const val CLOCK_REALTIME: Int = 0

public const val CLOCK_MONOTONIC: Int = 1

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { size: [0 (initializer represented at the FFI boundary)
public const val PTHREAD_MUTEX_NORMAL: Int = 0

public const val PTHREAD_MUTEX_RECURSIVE: Int = 1

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 2

public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL

public const val PTHREAD_MUTEX_STALLED: Int = 0

public const val PTHREAD_MUTEX_ROBUST: Int = 1
