@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

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

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(size = UByteArray(SIZEOF_PTHREAD_MUTEX_T) { 0u.toUByte() })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(size = UByteArray(SIZEOF_PTHREAD_COND_T) { 0u.toUByte() })

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_MUTEX_STALLED: CInt = 0

public val PTHREAD_MUTEX_ROBUST: CInt = 1
