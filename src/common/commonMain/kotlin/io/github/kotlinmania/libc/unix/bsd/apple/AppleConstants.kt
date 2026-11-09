package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.bsd.SocklenT

public val UTX_USERSIZE: Int = 256

public val UTX_LINESIZE: Int = 32

public val UTX_IDSIZE: Int = 4

public val UTX_HOSTSIZE: Int = 256

public val EMPTY: CShort = 0

public val RUN_LVL: CShort = 1

public val BOOT_TIME: CShort = 2

public val OLD_TIME: CShort = 3

public val NEW_TIME: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val USER_PROCESS: CShort = 7

public val DEAD_PROCESS: CShort = 8

public val ACCOUNTING: CShort = 9

public val SIGNATURE: CShort = 10

public val SHUTDOWN_TIME: CShort = 11

public val LC_COLLATE_MASK: CInt = 1 shl 0

public val LC_CTYPE_MASK: CInt = 1 shl 1

public val LC_MESSAGES_MASK: CInt = 1 shl 2

public val LC_MONETARY_MASK: CInt = 1 shl 3

public val LC_NUMERIC_MASK: CInt = 1 shl 4

public val LC_TIME_MASK: CInt = 1 shl 5

public val LC_ALL_MASK: CInt = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK

public val CODESET: NlItem = 0

public val D_T_FMT: NlItem = 1

public val D_FMT: NlItem = 2

public val T_FMT: NlItem = 3

public val T_FMT_AMPM: NlItem = 4

public val AM_STR: NlItem = 5

public val PM_STR: NlItem = 6

public val DAY_1: NlItem = 7

public val DAY_2: NlItem = 8

public val DAY_3: NlItem = 9

public val DAY_4: NlItem = 10

public val DAY_5: NlItem = 11

public val DAY_6: NlItem = 12

public val DAY_7: NlItem = 13

public val ABDAY_1: NlItem = 14

public val ABDAY_2: NlItem = 15

public val ABDAY_3: NlItem = 16

public val ABDAY_4: NlItem = 17

public val ABDAY_5: NlItem = 18

public val ABDAY_6: NlItem = 19

public val ABDAY_7: NlItem = 20

public val MON_1: NlItem = 21

public val MON_2: NlItem = 22

public val MON_3: NlItem = 23

public val MON_4: NlItem = 24

public val MON_5: NlItem = 25

public val MON_6: NlItem = 26

public val MON_7: NlItem = 27

public val MON_8: NlItem = 28

public val MON_9: NlItem = 29

public val MON_10: NlItem = 30

public val MON_11: NlItem = 31

public val MON_12: NlItem = 32

public val ABMON_1: NlItem = 33

public val ABMON_2: NlItem = 34

public val ABMON_3: NlItem = 35

public val ABMON_4: NlItem = 36

public val ABMON_5: NlItem = 37

public val ABMON_6: NlItem = 38

public val ABMON_7: NlItem = 39

public val ABMON_8: NlItem = 40

public val ABMON_9: NlItem = 41

public val ABMON_10: NlItem = 42

public val ABMON_11: NlItem = 43

public val ABMON_12: NlItem = 44

public val CLOCK_REALTIME: ClockidT = 0u

public val CLOCK_MONOTONIC_RAW: ClockidT = 4u

public val CLOCK_MONOTONIC_RAW_APPROX: ClockidT = 5u

public val CLOCK_MONOTONIC: ClockidT = 6u

public val CLOCK_UPTIME_RAW: ClockidT = 8u

public val CLOCK_UPTIME_RAW_APPROX: ClockidT = 9u

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 12u

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 16u

public val ERA: NlItem = 45

public val ERA_D_FMT: NlItem = 46

public val ERA_D_T_FMT: NlItem = 47

public val ERA_T_FMT: NlItem = 48

public val ALT_DIGITS: NlItem = 49

public val RADIXCHAR: NlItem = 50

public val THOUSEP: NlItem = 51

public val YESEXPR: NlItem = 52

public val NOEXPR: NlItem = 53

public val YESSTR: NlItem = 54

public val NOSTR: NlItem = 55

public val CRNCYSTR: NlItem = 56

public val D_MD_ORDER: NlItem = 57

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 2147483647

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val SEEK_HOLE: CInt = 3

public val SEEK_DATA: CInt = 4

public val IOFBF: CInt = 0

public val IONBF: CInt = 2

public val IOLBF: CInt = 1

public val BUFSIZ: CUint = 1024u

public val FOPEN_MAX: CUint = 20u

public val FILENAME_MAX: CUint = 1024u

public val L_TMPNAM: CUint = 1024u

public val TMP_MAX: CUint = 308915776u

public val PC_LINK_MAX: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_PATH_MAX: CInt = 5

public val PC_PIPE_BUF: CInt = 6

public val PC_CHOWN_RESTRICTED: CInt = 7

public val PC_NO_TRUNC: CInt = 8

public val PC_VDISABLE: CInt = 9

public val PC_NAME_CHARS_MAX: CInt = 10

public val PC_CASE_SENSITIVE: CInt = 11

public val PC_CASE_PRESERVING: CInt = 12

public val PC_EXTENDED_SECURITY_NP: CInt = 13

public val PC_AUTH_OPAQUE_NP: CInt = 14

public val PC_2_SYMLINKS: CInt = 15

public val PC_ALLOC_SIZE_MIN: CInt = 16

public val PC_ASYNC_IO: CInt = 17

public val PC_FILESIZEBITS: CInt = 18

public val PC_PRIO_IO: CInt = 19

public val PC_REC_INCR_XFER_SIZE: CInt = 20

public val PC_REC_MAX_XFER_SIZE: CInt = 21

public val PC_REC_MIN_XFER_SIZE: CInt = 22

public val PC_REC_XFER_ALIGN: CInt = 23

public val PC_SYMLINK_MAX: CInt = 24

public val PC_SYNC_IO: CInt = 25

public val PC_XATTR_SIZE_BITS: CInt = 26

public val PC_MIN_HOLE_SIZE: CInt = 27

public val O_EVTONLY: CInt = 0x00008000

public val O_NOCTTY: CInt = 0x00020000

public val O_DIRECTORY: CInt = 0x00100000

public val O_SYMLINK: CInt = 0x00200000

public val O_DSYNC: CInt = 0x00400000

public val O_CLOEXEC: CInt = 0x01000000

public val O_NOFOLLOW_ANY: CInt = 0x20000000

public val O_EXEC: CInt = 0x40000000

public val O_SEARCH: CInt = O_EXEC or O_DIRECTORY

public val S_IFIFO: ModeT = 4096u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFMT: ModeT = 61440u

public val S_IEXEC: ModeT = 64u

public val S_IWRITE: ModeT = 128u

public val S_IREAD: ModeT = 256u

public val S_IRWXU: ModeT = 448u

public val S_IXUSR: ModeT = 64u

public val S_IWUSR: ModeT = 128u

public val S_IRUSR: ModeT = 256u

public val S_IRWXG: ModeT = 56u

public val S_IXGRP: ModeT = 8u

public val S_IWGRP: ModeT = 16u

public val S_IRGRP: ModeT = 32u

public val S_IRWXO: ModeT = 7u

public val S_IXOTH: ModeT = 1u

public val S_IWOTH: ModeT = 2u

public val S_IROTH: ModeT = 4u

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val F_LOCK: CInt = 1

public val F_TEST: CInt = 3

public val F_TLOCK: CInt = 2

public val F_ULOCK: CInt = 0

public val F_GETLK: CInt = 7

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGABRT: CInt = 6

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGSEGV: CInt = 11

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val PT_TRACE_ME: CInt = 0

public val PT_READ_I: CInt = 1

public val PT_READ_D: CInt = 2

public val PT_READ_U: CInt = 3

public val PT_WRITE_I: CInt = 4

public val PT_WRITE_D: CInt = 5

public val PT_WRITE_U: CInt = 6

public val PT_CONTINUE: CInt = 7

public val PT_KILL: CInt = 8

public val PT_STEP: CInt = 9

public val PT_ATTACH: CInt = 10

public val PT_DETACH: CInt = 11

public val PT_SIGEXC: CInt = 12

public val PT_THUPDATE: CInt = 13

public val PT_ATTACHEXC: CInt = 14

public val PT_FORCEQUOTA: CInt = 30

public val PT_DENY_ATTACH: CInt = 31

public val PT_FIRSTMACH: CInt = 32

public val MAP_FILE: CInt = 0x0000

public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_FIXED: CInt = 0x0010

public val MAP_ANON: CInt = 0x1000

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val CPU_STATE_USER: CInt = 0

public val CPU_STATE_SYSTEM: CInt = 1

public val CPU_STATE_IDLE: CInt = 2

public val CPU_STATE_NICE: CInt = 3

public val CPU_STATE_MAX: CInt = 4

public val PROCESSOR_BASIC_INFO: CInt = 1

public val PROCESSOR_CPU_LOAD_INFO: CInt = 2

public val PROCESSOR_PM_REGS_INFO: CInt = 0x10000001

public val PROCESSOR_TEMPERATURE: CInt = 0x10000002

public val PROCESSOR_SET_LOAD_INFO: CInt = 4

public val PROCESSOR_SET_BASIC_INFO: CInt = 5

public val VM_FLAGS_FIXED: CInt = 0x0000

public val VM_FLAGS_ANYWHERE: CInt = 0x0001

public val VM_FLAGS_PURGABLE: CInt = 0x0002

public val VM_FLAGS_RANDOM_ADDR: CInt = 0x0008

public val VM_FLAGS_NO_CACHE: CInt = 0x0010

public val VM_FLAGS_RESILIENT_CODESIGN: CInt = 0x0020

public val VM_FLAGS_RESILIENT_MEDIA: CInt = 0x0040

public val VM_FLAGS_OVERWRITE: CInt = 0x4000

public val VM_FLAGS_SUPERPAGE_MASK: CInt = 0x70000

public val VM_FLAGS_RETURN_DATA_ADDR: CInt = 0x100000

public val VM_FLAGS_RETURN_4K_DATA_ADDR: CInt = 0x800000

public val VM_FLAGS_ALIAS_MASK: CInt = 0xFF000000

public val VM_FLAGS_USER_ALLOCATE: CInt = 0xff07401f

public val VM_FLAGS_USER_MAP: CInt = 0xff97401f

public val VM_FLAGS_USER_REMAP: CInt = VM_FLAGS_FIXED or VM_FLAGS_ANYWHERE or VM_FLAGS_RANDOM_ADDR or VM_FLAGS_OVERWRITE or VM_FLAGS_RETURN_DATA_ADDR or VM_FLAGS_RESILIENT_CODESIGN

public val VM_FLAGS_SUPERPAGE_SHIFT: CInt = 16

public val SUPERPAGE_NONE: CInt = 0

public val SUPERPAGE_SIZE_ANY: CInt = 1

public val VM_FLAGS_SUPERPAGE_NONE: CInt = SUPERPAGE_NONE shl VM_FLAGS_SUPERPAGE_SHIFT

public val VM_FLAGS_SUPERPAGE_SIZE_ANY: CInt = SUPERPAGE_SIZE_ANY shl VM_FLAGS_SUPERPAGE_SHIFT

public val SUPERPAGE_SIZE_2MB: CInt = 2

public val VM_FLAGS_SUPERPAGE_SIZE_2MB: CInt = SUPERPAGE_SIZE_2MB shl VM_FLAGS_SUPERPAGE_SHIFT

public val VM_MEMORY_MALLOC: CInt = 1

public val VM_MEMORY_MALLOC_SMALL: CInt = 2

public val VM_MEMORY_MALLOC_LARGE: CInt = 3

public val VM_MEMORY_MALLOC_HUGE: CInt = 4

public val VM_MEMORY_SBRK: CInt = 5

public val VM_MEMORY_REALLOC: CInt = 6

public val VM_MEMORY_MALLOC_TINY: CInt = 7

public val VM_MEMORY_MALLOC_LARGE_REUSABLE: CInt = 8

public val VM_MEMORY_MALLOC_LARGE_REUSED: CInt = 9

public val VM_MEMORY_ANALYSIS_TOOL: CInt = 10

public val VM_MEMORY_MALLOC_NANO: CInt = 11

public val VM_MEMORY_MACH_MSG: CInt = 20

public val VM_MEMORY_IOKIT: CInt = 21

public val VM_MEMORY_STACK: CInt = 30

public val VM_MEMORY_GUARD: CInt = 31

public val VM_MEMORY_SHARED_PMAP: CInt = 32

public val VM_MEMORY_DYLIB: CInt = 33

public val VM_MEMORY_OBJC_DISPATCHERS: CInt = 34

public val VM_MEMORY_UNSHARED_PMAP: CInt = 35

public val VM_MEMORY_APPKIT: CInt = 40

public val VM_MEMORY_FOUNDATION: CInt = 41

public val VM_MEMORY_COREGRAPHICS: CInt = 42

public val VM_MEMORY_CORESERVICES: CInt = 43

public val VM_MEMORY_CARBON: CInt = VM_MEMORY_CORESERVICES

public val VM_MEMORY_JAVA: CInt = 44

public val VM_MEMORY_COREDATA: CInt = 45

public val VM_MEMORY_COREDATA_OBJECTIDS: CInt = 46

public val VM_MEMORY_ATS: CInt = 50

public val VM_MEMORY_LAYERKIT: CInt = 51

public val VM_MEMORY_CGIMAGE: CInt = 52

public val VM_MEMORY_TCMALLOC: CInt = 53

public val VM_MEMORY_COREGRAPHICS_DATA: CInt = 54

public val VM_MEMORY_COREGRAPHICS_SHARED: CInt = 55

public val VM_MEMORY_COREGRAPHICS_FRAMEBUFFERS: CInt = 56

public val VM_MEMORY_COREGRAPHICS_BACKINGSTORES: CInt = 57

public val VM_MEMORY_COREGRAPHICS_XALLOC: CInt = 58

public val VM_MEMORY_COREGRAPHICS_MISC: CInt = VM_MEMORY_COREGRAPHICS

public val VM_MEMORY_DYLD: CInt = 60

public val VM_MEMORY_DYLD_MALLOC: CInt = 61

public val VM_MEMORY_SQLITE: CInt = 62

public val VM_MEMORY_JAVASCRIPT_CORE: CInt = 63

public val VM_MEMORY_JAVASCRIPT_JIT_EXECUTABLE_ALLOCATOR: CInt = 64

public val VM_MEMORY_JAVASCRIPT_JIT_REGISTER_FILE: CInt = 65

public val VM_MEMORY_GLSL: CInt = 66

public val VM_MEMORY_OPENCL: CInt = 67

public val VM_MEMORY_COREIMAGE: CInt = 68

public val VM_MEMORY_WEBCORE_PURGEABLE_BUFFERS: CInt = 69

public val VM_MEMORY_IMAGEIO: CInt = 70

public val VM_MEMORY_COREPROFILE: CInt = 71

public val VM_MEMORY_ASSETSD: CInt = 72

public val VM_MEMORY_OS_ALLOC_ONCE: CInt = 73

public val VM_MEMORY_LIBDISPATCH: CInt = 74

public val VM_MEMORY_ACCELERATE: CInt = 75

public val VM_MEMORY_COREUI: CInt = 76

public val VM_MEMORY_COREUIFILE: CInt = 77

public val VM_MEMORY_GENEALOGY: CInt = 78

public val VM_MEMORY_RAWCAMERA: CInt = 79

public val VM_MEMORY_CORPSEINFO: CInt = 80

public val VM_MEMORY_ASL: CInt = 81

public val VM_MEMORY_SWIFT_RUNTIME: CInt = 82

public val VM_MEMORY_SWIFT_METADATA: CInt = 83

public val VM_MEMORY_DHMM: CInt = 84

public val VM_MEMORY_SCENEKIT: CInt = 86

public val VM_MEMORY_SKYWALK: CInt = 87

public val VM_MEMORY_APPLICATION_SPECIFIC_1: CInt = 240

public val VM_MEMORY_APPLICATION_SPECIFIC_16: CInt = 255

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MS_ASYNC: CInt = 0x0001

public val MS_INVALIDATE: CInt = 0x0002

public val MS_SYNC: CInt = 0x0010

public val MS_KILLPAGES: CInt = 0x0004

public val MS_DEACTIVATE: CInt = 0x0008

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

public val EDEADLK: CInt = 11

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

public val EAGAIN: CInt = 35

public val EWOULDBLOCK: CInt = EAGAIN

public val EINPROGRESS: CInt = 36

public val EALREADY: CInt = 37

public val ENOTSOCK: CInt = 38

public val EDESTADDRREQ: CInt = 39

public val EMSGSIZE: CInt = 40

public val EPROTOTYPE: CInt = 41

public val ENOPROTOOPT: CInt = 42

public val EPROTONOSUPPORT: CInt = 43

public val ESOCKTNOSUPPORT: CInt = 44

public val ENOTSUP: CInt = 45

public val EPFNOSUPPORT: CInt = 46

public val EAFNOSUPPORT: CInt = 47

public val EADDRINUSE: CInt = 48

public val EADDRNOTAVAIL: CInt = 49

public val ENETDOWN: CInt = 50

public val ENETUNREACH: CInt = 51

public val ENETRESET: CInt = 52

public val ECONNABORTED: CInt = 53

public val ECONNRESET: CInt = 54

public val ENOBUFS: CInt = 55

public val EISCONN: CInt = 56

public val ENOTCONN: CInt = 57

public val ESHUTDOWN: CInt = 58

public val ETOOMANYREFS: CInt = 59

public val ETIMEDOUT: CInt = 60

public val ECONNREFUSED: CInt = 61

public val ELOOP: CInt = 62

public val ENAMETOOLONG: CInt = 63

public val EHOSTDOWN: CInt = 64

public val EHOSTUNREACH: CInt = 65

public val ENOTEMPTY: CInt = 66

public val EPROCLIM: CInt = 67

public val EUSERS: CInt = 68

public val EDQUOT: CInt = 69

public val ESTALE: CInt = 70

public val EREMOTE: CInt = 71

public val EBADRPC: CInt = 72

public val ERPCMISMATCH: CInt = 73

public val EPROGUNAVAIL: CInt = 74

public val EPROGMISMATCH: CInt = 75

public val EPROCUNAVAIL: CInt = 76

public val ENOLCK: CInt = 77

public val ENOSYS: CInt = 78

public val EFTYPE: CInt = 79

public val EAUTH: CInt = 80

public val ENEEDAUTH: CInt = 81

public val EPWROFF: CInt = 82

public val EDEVERR: CInt = 83

public val EOVERFLOW: CInt = 84

public val EBADEXEC: CInt = 85

public val EBADARCH: CInt = 86

public val ESHLIBVERS: CInt = 87

public val EBADMACHO: CInt = 88

public val ECANCELED: CInt = 89

public val EIDRM: CInt = 90

public val ENOMSG: CInt = 91

public val EILSEQ: CInt = 92

public val ENOATTR: CInt = 93

public val EBADMSG: CInt = 94

public val EMULTIHOP: CInt = 95

public val ENODATA: CInt = 96

public val ENOLINK: CInt = 97

public val ENOSR: CInt = 98

public val ENOSTR: CInt = 99

public val EPROTO: CInt = 100

public val ETIME: CInt = 101

public val EOPNOTSUPP: CInt = 102

public val ENOPOLICY: CInt = 103

public val ENOTRECOVERABLE: CInt = 104

public val EOWNERDEAD: CInt = 105

public val EQFULL: CInt = 106

public val ELAST: CInt = 106

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

public val F_DUPFD: CInt = 0

public val F_DUPFD_CLOEXEC: CInt = 67

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_PREALLOCATE: CInt = 42

public val F_RDADVISE: CInt = 44

public val F_RDAHEAD: CInt = 45

public val F_NOCACHE: CInt = 48

public val F_LOG2PHYS: CInt = 49

public val F_GETPATH: CInt = 50

public val F_FULLFSYNC: CInt = 51

public val F_FREEZE_FS: CInt = 53

public val F_THAW_FS: CInt = 54

public val F_GLOBAL_NOCACHE: CInt = 55

public val F_NODIRECT: CInt = 62

public val F_LOG2PHYS_EXT: CInt = 65

public val F_BARRIERFSYNC: CInt = 85

// See https://github.com/apple/darwin-xnu/blob/main/bsd/sys/fcntl.h
public val F_OFD_SETLK: CInt = 90

// Acquire or release open file description lock
public val F_OFD_SETLKW: CInt = 91

// (as F_OFD_SETLK but blocking if conflicting lock)
public val F_OFD_GETLK: CInt = 92

// Examine OFD lock
public val F_PUNCHHOLE: CInt = 99

public val F_TRIM_ACTIVE_FILE: CInt = 100

public val F_SPECULATIVE_READ: CInt = 101

public val F_GETPATH_NOFIRMLINK: CInt = 102

public val F_TRANSFEREXTENTS: CInt = 110

public val F_ALLOCATECONTIG: CUint = 0x02u

public val F_ALLOCATEALL: CUint = 0x04u

public val F_ALLOCATEPERSIST: CUint = 0x08u

public val F_PEOFPOSMODE: CInt = 3

public val F_VOLPOSMODE: CInt = 4

public val AT_FDCWD: CInt = -2

public val AT_EACCESS: CInt = 0x0010

public val AT_SYMLINK_NOFOLLOW: CInt = 0x0020

public val AT_SYMLINK_FOLLOW: CInt = 0x0040

public val AT_REMOVEDIR: CInt = 0x0080

public val TIOCMODG: CUlong = 0x40047403uL

public val TIOCMODS: CUlong = 0x80047404uL

public val TIOCM_LE: CInt = 0x1

public val TIOCM_DTR: CInt = 0x2

public val TIOCM_RTS: CInt = 0x4

public val TIOCM_ST: CInt = 0x8

public val TIOCM_SR: CInt = 0x10

public val TIOCM_CTS: CInt = 0x20

public val TIOCM_CAR: CInt = 0x40

public val TIOCM_CD: CInt = 0x40

public val TIOCM_RNG: CInt = 0x80

public val TIOCM_RI: CInt = 0x80

public val TIOCM_DSR: CInt = 0x100

public val TIOCEXCL: CInt = 0x2000740d

public val TIOCNXCL: CInt = 0x2000740e

public val TIOCFLUSH: CUlong = 0x80047410uL

public val TIOCGETD: CUlong = 0x4004741auL

public val TIOCSETD: CUlong = 0x8004741buL

public val TIOCIXON: CUint = 0x20007481u

public val TIOCIXOFF: CUint = 0x20007480u

public val TIOCSDTR: CUint = 0x20007479u

public val TIOCCDTR: CUint = 0x20007478u

public val TIOCGPGRP: CUlong = 0x40047477uL

public val TIOCSPGRP: CUlong = 0x80047476uL

public val TIOCOUTQ: CUlong = 0x40047473uL

public val TIOCSTI: CUlong = 0x80017472uL

public val TIOCNOTTY: CUint = 0x20007471u

public val TIOCPKT: CUlong = 0x80047470uL

public val TIOCPKT_DATA: CInt = 0x0

public val TIOCPKT_FLUSHREAD: CInt = 0x1

public val TIOCPKT_FLUSHWRITE: CInt = 0x2

public val TIOCPKT_STOP: CInt = 0x4

public val TIOCPKT_START: CInt = 0x8

public val TIOCPKT_NOSTOP: CInt = 0x10

public val TIOCPKT_DOSTOP: CInt = 0x20

public val TIOCPKT_IOCTL: CInt = 0x40

public val TIOCSTOP: CUint = 0x2000746fu

public val TIOCSTART: CUint = 0x2000746eu

public val TIOCMSET: CUlong = 0x8004746duL

public val TIOCMBIS: CUlong = 0x8004746cuL

public val TIOCMBIC: CUlong = 0x8004746buL

public val TIOCMGET: CUlong = 0x4004746auL

public val TIOCREMOTE: CUlong = 0x80047469uL

public val TIOCGWINSZ: CUlong = 0x40087468uL

public val TIOCSWINSZ: CUlong = 0x80087467uL

public val TIOCUCNTL: CUlong = 0x80047466uL

public val TIOCSTAT: CUint = 0x20007465u

public val TIOCSCONS: CUint = 0x20007463u

public val TIOCCONS: CUlong = 0x80047462uL

public val TIOCSCTTY: CUint = 0x20007461u

public val TIOCEXT: CUlong = 0x80047460uL

public val TIOCSIG: CUint = 0x2000745fu

public val TIOCDRAIN: CUint = 0x2000745eu

public val TIOCMSDTRWAIT: CUlong = 0x8004745buL

public val TIOCMGDTRWAIT: CUlong = 0x4004745auL

public val TIOCSDRAINWAIT: CUlong = 0x80047457uL

public val TIOCGDRAINWAIT: CUlong = 0x40047456uL

public val TIOCDSIMICROCODE: CUint = 0x20007455u

public val TIOCPTYGRANT: CUint = 0x20007454u

public val TIOCPTYGNAME: CUint = 0x40807453u

public val TIOCPTYUNLK: CUint = 0x20007452u

public val TIOCGETA: CUlong = 0x40487413uL

public val TIOCSETA: CUlong = 0x80487414uL

public val TIOCSETAW: CUlong = 0x80487415uL

public val TIOCSETAF: CUlong = 0x80487416uL

public val BIOCGRSIG: CUlong = 0x40044272uL

public val BIOCSRSIG: CUlong = 0x80044273uL

public val BIOCSDLT: CUlong = 0x80044278uL

public val BIOCGSEESENT: CUlong = 0x40044276uL

public val BIOCSSEESENT: CUlong = 0x80044277uL

public val BIOCGDLTLIST: CUlong = 0xc00c4279uL

public val FIODTYPE: CUlong = 0x4004667auL

public val B0: SpeedT = 0uL

public val B50: SpeedT = 50uL

public val B75: SpeedT = 75uL

public val B110: SpeedT = 110uL

public val B134: SpeedT = 134uL

public val B150: SpeedT = 150uL

public val B200: SpeedT = 200uL

public val B300: SpeedT = 300uL

public val B600: SpeedT = 600uL

public val B1200: SpeedT = 1200uL

public val B1800: SpeedT = 1800uL

public val B2400: SpeedT = 2400uL

public val B4800: SpeedT = 4800uL

public val B9600: SpeedT = 9600uL

public val B19200: SpeedT = 19200uL

public val B38400: SpeedT = 38400uL

public val B7200: SpeedT = 7200uL

public val B14400: SpeedT = 14400uL

public val B28800: SpeedT = 28800uL

public val B57600: SpeedT = 57600uL

public val B76800: SpeedT = 76800uL

public val B115200: SpeedT = 115200uL

public val B230400: SpeedT = 230400uL

public val EXTA: SpeedT = 19200uL

public val EXTB: SpeedT = 38400uL

public val SIGTRAP: CInt = 5

public val GLOB_APPEND: CInt = 0x0001

public val GLOB_DOOFFS: CInt = 0x0002

public val GLOB_ERR: CInt = 0x0004

public val GLOB_MARK: CInt = 0x0008

public val GLOB_NOCHECK: CInt = 0x0010

public val GLOB_NOSORT: CInt = 0x0020

public val GLOB_NOESCAPE: CInt = 0x2000

public val GLOB_NOSPACE: CInt = -1

public val GLOB_ABORTED: CInt = -2

public val GLOB_NOMATCH: CInt = -3

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_DONTNEED: CInt = 4

public val SC_IOV_MAX: CInt = 56

public val SC_GETGR_R_SIZE_MAX: CInt = 70

public val SC_GETPW_R_SIZE_MAX: CInt = 71

public val SC_LOGIN_NAME_MAX: CInt = 73

public val SC_MQ_PRIO_MAX: CInt = 75

public val SC_THREAD_ATTR_STACKADDR: CInt = 82

public val SC_THREAD_ATTR_STACKSIZE: CInt = 83

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 85

public val SC_THREAD_KEYS_MAX: CInt = 86

public val SC_THREAD_PRIO_INHERIT: CInt = 87

public val SC_THREAD_PRIO_PROTECT: CInt = 88

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 89

public val SC_THREAD_PROCESS_SHARED: CInt = 90

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 91

public val SC_THREAD_STACK_MIN: CInt = 93

public val SC_THREAD_THREADS_MAX: CInt = 94

public val SC_THREADS: CInt = 96

public val SC_TTY_NAME_MAX: CInt = 101

public val SC_ATEXIT_MAX: CInt = 107

public val SC_XOPEN_CRYPT: CInt = 108

public val SC_XOPEN_ENH_I18N: CInt = 109

public val SC_XOPEN_LEGACY: CInt = 110

public val SC_XOPEN_REALTIME: CInt = 111

public val SC_XOPEN_REALTIME_THREADS: CInt = 112

public val SC_XOPEN_SHM: CInt = 113

public val SC_XOPEN_UNIX: CInt = 115

public val SC_XOPEN_VERSION: CInt = 116

public val SC_XOPEN_XCU_VERSION: CInt = 121

public val SC_PHYS_PAGES: CInt = 200

public val PTHREAD_STACK_MIN: SizeT = 16384uL

public val PTHREAD_STACK_MIN1: SizeT = 8192uL

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_AS: CInt = 5

public val RLIMIT_RSS: CInt = RLIMIT_AS

public val RLIMIT_MEMLOCK: CInt = 6

public val RLIMIT_NPROC: CInt = 7

public val RLIMIT_NOFILE: CInt = 8

public val RLIM_NLIMITS: CInt = 9

public val RLIMIT_POSIX_FLAG: CInt = 0x1000

public val RLIM_INFINITY: RlimT = 0x7fffffffffffffffuL

public val RUSAGE_SELF: CInt = 0

public val RUSAGE_CHILDREN: CInt = -1

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val MADV_FREE: CInt = 5

public val MADV_ZERO_WIRED_PAGES: CInt = 6

public val MADV_FREE_REUSABLE: CInt = 7

public val MADV_FREE_REUSE: CInt = 8

public val MADV_CAN_REUSE: CInt = 9

public val MADV_ZERO: CInt = 11

public val MINCORE_INCORE: CInt = 0x1

public val MINCORE_REFERENCED: CInt = 0x2

public val MINCORE_MODIFIED: CInt = 0x4

public val MINCORE_REFERENCED_OTHER: CInt = 0x8

public val MINCORE_MODIFIED_OTHER: CInt = 0x10

public val CTLIOCGINFO: CUlong = 0xc0644e03uL

//
// sys/netinet/in.h
// Protocols (RFC 1700)
// NOTE: These are in addition to the constants defined in src/unix/mod.rs
// IPPROTO_IP defined in src/unix/mod.rs
/**
 * IP6 hop-by-hop options
 */
public val IPPROTO_HOPOPTS: CInt = 0

// IPPROTO_ICMP defined in src/unix/mod.rs
/**
 * group mgmt protocol
 */
public val IPPROTO_IGMP: CInt = 2

/**
 * gateway<sup>2</sup> (deprecated)
 */
public val IPPROTO_GGP: CInt = 3

/**
 * for compatibility
 */
public val IPPROTO_IPIP: CInt = 4

// IPPROTO_TCP defined in src/unix/mod.rs
/**
 * Stream protocol II.
 */
public val IPPROTO_ST: CInt = 7

/**
 * exterior gateway protocol
 */
public val IPPROTO_EGP: CInt = 8

/**
 * private interior gateway
 */
public val IPPROTO_PIGP: CInt = 9

/**
 * BBN RCC Monitoring
 */
public val IPPROTO_RCCMON: CInt = 10

/**
 * network voice protocol
 */
public val IPPROTO_NVPII: CInt = 11

/**
 * pup
 */
public val IPPROTO_PUP: CInt = 12

/**
 * Argus
 */
public val IPPROTO_ARGUS: CInt = 13

/**
 * EMCON
 */
public val IPPROTO_EMCON: CInt = 14

/**
 * Cross Net Debugger
 */
public val IPPROTO_XNET: CInt = 15

/**
 * Chaos
 */
public val IPPROTO_CHAOS: CInt = 16

// IPPROTO_UDP defined in src/unix/mod.rs
/**
 * Multiplexing
 */
public val IPPROTO_MUX: CInt = 18

/**
 * DCN Measurement Subsystems
 */
public val IPPROTO_MEAS: CInt = 19

/**
 * Host Monitoring
 */
public val IPPROTO_HMP: CInt = 20

/**
 * Packet Radio Measurement
 */
public val IPPROTO_PRM: CInt = 21

/**
 * xns idp
 */
public val IPPROTO_IDP: CInt = 22

/**
 * Trunk-1
 */
public val IPPROTO_TRUNK1: CInt = 23

/**
 * Trunk-2
 */
public val IPPROTO_TRUNK2: CInt = 24

/**
 * Leaf-1
 */
public val IPPROTO_LEAF1: CInt = 25

/**
 * Leaf-2
 */
public val IPPROTO_LEAF2: CInt = 26

/**
 * Reliable Data
 */
public val IPPROTO_RDP: CInt = 27

/**
 * Reliable Transaction
 */
public val IPPROTO_IRTP: CInt = 28

/**
 * tp-4 w/ class negotiation
 */
public val IPPROTO_TP: CInt = 29

/**
 * Bulk Data Transfer
 */
public val IPPROTO_BLT: CInt = 30

/**
 * Network Services
 */
public val IPPROTO_NSP: CInt = 31

/**
 * Merit Internodal
 */
public val IPPROTO_INP: CInt = 32

/**
 * Sequential Exchange
 */
public val IPPROTO_SEP: CInt = 33

/**
 * Third Party Connect
 */
public val IPPROTO_3PC: CInt = 34

/**
 * InterDomain Policy Routing
 */
public val IPPROTO_IDPR: CInt = 35

/**
 * XTP
 */
public val IPPROTO_XTP: CInt = 36

/**
 * Datagram Delivery
 */
public val IPPROTO_DDP: CInt = 37

/**
 * Control Message Transport
 */
public val IPPROTO_CMTP: CInt = 38

/**
 * TP++ Transport
 */
public val IPPROTO_TPXX: CInt = 39

/**
 * IL transport protocol
 */
public val IPPROTO_IL: CInt = 40

// IPPROTO_IPV6 defined in src/unix/mod.rs
/**
 * Source Demand Routing
 */
public val IPPROTO_SDRP: CInt = 42

/**
 * IP6 routing header
 */
public val IPPROTO_ROUTING: CInt = 43

/**
 * IP6 fragmentation header
 */
public val IPPROTO_FRAGMENT: CInt = 44

/**
 * InterDomain Routing
 */
public val IPPROTO_IDRP: CInt = 45

/**
 * resource reservation
 */
public val IPPROTO_RSVP: CInt = 46

/**
 * General Routing Encap.
 */
public val IPPROTO_GRE: CInt = 47

/**
 * Mobile Host Routing
 */
public val IPPROTO_MHRP: CInt = 48

/**
 * BHA
 */
public val IPPROTO_BHA: CInt = 49

/**
 * IP6 Encap Sec. Payload
 */
public val IPPROTO_ESP: CInt = 50

/**
 * IP6 Auth Header
 */
public val IPPROTO_AH: CInt = 51

/**
 * Integ. Net Layer Security
 */
public val IPPROTO_INLSP: CInt = 52

/**
 * IP with encryption
 */
public val IPPROTO_SWIPE: CInt = 53

/**
 * Next Hop Resolution
 */
public val IPPROTO_NHRP: CInt = 54

// 55-57: Unassigned
// IPPROTO_ICMPV6 defined in src/unix/mod.rs
/**
 * IP6 no next header
 */
public val IPPROTO_NONE: CInt = 59

/**
 * IP6 destination option
 */
public val IPPROTO_DSTOPTS: CInt = 60

/**
 * any host internal protocol
 */
public val IPPROTO_AHIP: CInt = 61

/**
 * CFTP
 */
public val IPPROTO_CFTP: CInt = 62

/**
 * "hello" routing protocol
 */
public val IPPROTO_HELLO: CInt = 63

/**
 * SATNET/Backroom EXPAK
 */
public val IPPROTO_SATEXPAK: CInt = 64

/**
 * Kryptolan
 */
public val IPPROTO_KRYPTOLAN: CInt = 65

/**
 * Remote Virtual Disk
 */
public val IPPROTO_RVD: CInt = 66

/**
 * Pluribus Packet Core
 */
public val IPPROTO_IPPC: CInt = 67

/**
 * Any distributed FS
 */
public val IPPROTO_ADFS: CInt = 68

/**
 * Satnet Monitoring
 */
public val IPPROTO_SATMON: CInt = 69

/**
 * VISA Protocol
 */
public val IPPROTO_VISA: CInt = 70

/**
 * Packet Core Utility
 */
public val IPPROTO_IPCV: CInt = 71

/**
 * Comp. Prot. Net. Executive
 */
public val IPPROTO_CPNX: CInt = 72

/**
 * Comp. Prot. HeartBeat
 */
public val IPPROTO_CPHB: CInt = 73

/**
 * Wang Span Network
 */
public val IPPROTO_WSN: CInt = 74

/**
 * Packet Video Protocol
 */
public val IPPROTO_PVP: CInt = 75

/**
 * BackRoom SATNET Monitoring
 */
public val IPPROTO_BRSATMON: CInt = 76

/**
 * Sun net disk proto (temp.)
 */
public val IPPROTO_ND: CInt = 77

/**
 * WIDEBAND Monitoring
 */
public val IPPROTO_WBMON: CInt = 78

/**
 * WIDEBAND EXPAK
 */
public val IPPROTO_WBEXPAK: CInt = 79

/**
 * ISO cnlp
 */
public val IPPROTO_EON: CInt = 80

/**
 * VMTP
 */
public val IPPROTO_VMTP: CInt = 81

/**
 * Secure VMTP
 */
public val IPPROTO_SVMTP: CInt = 82

/**
 * Banyon VINES
 */
public val IPPROTO_VINES: CInt = 83

/**
 * TTP
 */
public val IPPROTO_TTP: CInt = 84

/**
 * NSFNET-IGP
 */
public val IPPROTO_IGP: CInt = 85

/**
 * dissimilar gateway prot.
 */
public val IPPROTO_DGP: CInt = 86

/**
 * TCF
 */
public val IPPROTO_TCF: CInt = 87

/**
 * Cisco/GXS IGRP
 */
public val IPPROTO_IGRP: CInt = 88

/**
 * OSPFIGP
 */
public val IPPROTO_OSPFIGP: CInt = 89

/**
 * Strite RPC protocol
 */
public val IPPROTO_SRPC: CInt = 90

/**
 * Locus Address Resoloution
 */
public val IPPROTO_LARP: CInt = 91

/**
 * Multicast Transport
 */
public val IPPROTO_MTP: CInt = 92

/**
 * AX.25 Frames
 */
public val IPPROTO_AX25: CInt = 93

/**
 * IP encapsulated in IP
 */
public val IPPROTO_IPEIP: CInt = 94

/**
 * Mobile Int.ing control
 */
public val IPPROTO_MICP: CInt = 95

/**
 * Semaphore Comm. security
 */
public val IPPROTO_SCCSP: CInt = 96

/**
 * Ethernet IP encapsulation
 */
public val IPPROTO_ETHERIP: CInt = 97

/**
 * encapsulation header
 */
public val IPPROTO_ENCAP: CInt = 98

/**
 * any private encr. scheme
 */
public val IPPROTO_APES: CInt = 99

/**
 * GMTP
 */
public val IPPROTO_GMTP: CInt = 100

// 101-254: Partly Unassigned
/**
 * Protocol Independent Mcast
 */
public val IPPROTO_PIM: CInt = 103

/**
 * payload compression (IPComp)
 */
public val IPPROTO_IPCOMP: CInt = 108

/**
 * PGM
 */
public val IPPROTO_PGM: CInt = 113

/**
 * SCTP
 */
public val IPPROTO_SCTP: CInt = 132

// 255: Reserved
// BSD Private, local use, namespace incursion
/**
 * divert pseudo-protocol
 */
public val IPPROTO_DIVERT: CInt = 254

/**
 * raw IP packet
 */
public val IPPROTO_RAW: CInt = 255

public val IPPROTO_MAX: CInt = 256

/**
 * last return value of *_input(), meaning "all job for this pkt is done".
 */
public val IPPROTO_DONE: CInt = 257

public val AF_UNSPEC: CInt = 0

public val AF_LOCAL: CInt = 1

public val AF_UNIX: CInt = AF_LOCAL

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NS: CInt = 6

public val AF_ISO: CInt = 7

public val AF_OSI: CInt = AF_ISO

public val AF_ECMA: CInt = 8

public val AF_DATAKIT: CInt = 9

public val AF_CCITT: CInt = 10

public val AF_SNA: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_LAT: CInt = 14

public val AF_HYLINK: CInt = 15

public val AF_APPLETALK: CInt = 16

public val AF_ROUTE: CInt = 17

public val AF_LINK: CInt = 18

public val PSEUDO_AF_XTP: CInt = 19

public val AF_COIP: CInt = 20

public val AF_CNT: CInt = 21

public val PSEUDO_AF_RTIP: CInt = 22

public val AF_IPX: CInt = 23

public val AF_SIP: CInt = 24

public val PSEUDO_AF_PIP: CInt = 25

public val AF_NDRV: CInt = 27

public val AF_ISDN: CInt = 28

public val AF_E164: CInt = AF_ISDN

public val PSEUDO_AF_KEY: CInt = 29

public val AF_INET6: CInt = 30

public val AF_NATM: CInt = 31

public val AF_SYSTEM: CInt = 32

public val AF_NETBIOS: CInt = 33

public val AF_PPP: CInt = 34

public val PSEUDO_AF_HDRCMPLT: CInt = 35

public val AF_IEEE80211: CInt = 37

public val AF_UTUN: CInt = 38

public val AF_VSOCK: CInt = 40

public val AF_SYS_CONTROL: CInt = 2

public val SYSPROTO_EVENT: CInt = 1

public val SYSPROTO_CONTROL: CInt = 2

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_UNIX: CInt = PF_LOCAL

public val PF_INET: CInt = AF_INET

public val PF_IMPLINK: CInt = AF_IMPLINK

public val PF_PUP: CInt = AF_PUP

public val PF_CHAOS: CInt = AF_CHAOS

public val PF_NS: CInt = AF_NS

public val PF_ISO: CInt = AF_ISO

public val PF_OSI: CInt = AF_ISO

public val PF_ECMA: CInt = AF_ECMA

public val PF_DATAKIT: CInt = AF_DATAKIT

public val PF_CCITT: CInt = AF_CCITT

public val PF_SNA: CInt = AF_SNA

public val PF_DE_CNET: CInt = AF_DE_CNET

public val PF_DLI: CInt = AF_DLI

public val PF_LAT: CInt = AF_LAT

public val PF_HYLINK: CInt = AF_HYLINK

public val PF_APPLETALK: CInt = AF_APPLETALK

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_LINK: CInt = AF_LINK

public val PF_XTP: CInt = PSEUDO_AF_XTP

public val PF_COIP: CInt = AF_COIP

public val PF_CNT: CInt = AF_CNT

public val PF_SIP: CInt = AF_SIP

public val PF_IPX: CInt = AF_IPX

public val PF_RTIP: CInt = PSEUDO_AF_RTIP

public val PF_PIP: CInt = PSEUDO_AF_PIP

public val PF_NDRV: CInt = AF_NDRV

public val PF_ISDN: CInt = AF_ISDN

public val PF_KEY: CInt = PSEUDO_AF_KEY

public val PF_INET6: CInt = AF_INET6

public val PF_NATM: CInt = AF_NATM

public val PF_SYSTEM: CInt = AF_SYSTEM

public val PF_NETBIOS: CInt = AF_NETBIOS

public val PF_PPP: CInt = AF_PPP

public val PF_VSOCK: CInt = AF_VSOCK

public val NET_RT_DUMP: CInt = 1

public val NET_RT_FLAGS: CInt = 2

public val NET_RT_IFLIST: CInt = 3

public val SOMAXCONN: CInt = 128

public val SOCK_MAXADDRLEN: CInt = 255

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val IP_TTL: CInt = 4

public val IP_HDRINCL: CInt = 2

public val IP_RECVDSTADDR: CInt = 7

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IP_RECVIF: CInt = 20

public val IP_RECVTTL: CInt = 24

public val IP_BOUND_IF: CInt = 25

public val IP_PKTINFO: CInt = 26

public val IP_RECVTOS: CInt = 27

public val IP_DONTFRAG: CInt = 28

public val IPV6_JOIN_GROUP: CInt = 12

public val IPV6_LEAVE_GROUP: CInt = 13

public val IPV6_CHECKSUM: CInt = 26

public val IPV6_RECVTCLASS: CInt = 35

public val IPV6_TCLASS: CInt = 36

public val IPV6_RECVHOPLIMIT: CInt = 37

public val IPV6_PKTINFO: CInt = 46

public val IPV6_HOPLIMIT: CInt = 47

public val IPV6_RECVPKTINFO: CInt = 61

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 70

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 71

public val IP_BLOCK_SOURCE: CInt = 72

public val IP_UNBLOCK_SOURCE: CInt = 73

public val IPV6_BOUND_IF: CInt = 125

public val TCP_NOPUSH: CInt = 4

public val TCP_NOOPT: CInt = 8

public val TCP_KEEPALIVE: CInt = 0x10

public val TCP_KEEPINTVL: CInt = 0x101

public val TCP_KEEPCNT: CInt = 0x102

/**
 * Enable/Disable TCP Fastopen on this socket
 */
public val TCP_FASTOPEN: CInt = 0x105

public val TCP_CONNECTION_INFO: CInt = 0x106

public val SOL_LOCAL: CInt = 0

/**
 * Retrieve peer credentials.
 */
public val LOCAL_PEERCRED: CInt = 0x001

/**
 * Retrieve peer PID.
 */
public val LOCAL_PEERPID: CInt = 0x002

/**
 * Retrieve effective peer PID.
 */
public val LOCAL_PEEREPID: CInt = 0x003

/**
 * Retrieve peer UUID.
 */
public val LOCAL_PEERUUID: CInt = 0x004

/**
 * Retrieve effective peer UUID.
 */
public val LOCAL_PEEREUUID: CInt = 0x005

/**
 * Retrieve peer audit token.
 */
public val LOCAL_PEERTOKEN: CInt = 0x006

public val SOL_SOCKET: CInt = 0xffff

public val SO_DEBUG: CInt = 0x01

public val SO_ACCEPTCONN: CInt = 0x0002

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_OOBINLINE: CInt = 0x0100

public val SO_REUSEPORT: CInt = 0x0200

public val SO_TIMESTAMP: CInt = 0x0400

public val SO_TIMESTAMP_MONOTONIC: CInt = 0x0800

public val SO_DONTTRUNC: CInt = 0x2000

public val SO_WANTMORE: CInt = 0x4000

public val SO_WANTOOBFLAG: CInt = 0x8000

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SO_LABEL: CInt = 0x1010

public val SO_PEERLABEL: CInt = 0x1011

public val SO_NREAD: CInt = 0x1020

public val SO_NKE: CInt = 0x1021

public val SO_NOSIGPIPE: CInt = 0x1022

public val SO_NOADDRERR: CInt = 0x1023

public val SO_NWRITE: CInt = 0x1024

public val SO_REUSESHAREUID: CInt = 0x1025

public val SO_NOTIFYCONFLICT: CInt = 0x1026

public val SO_LINGER_SEC: CInt = 0x1080

public val SO_RANDOMPORT: CInt = 0x1082

public val SO_NP_EXTENSIONS: CInt = 0x1083

public val MSG_OOB: CInt = 0x1

public val MSG_PEEK: CInt = 0x2

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_EOR: CInt = 0x8

public val MSG_TRUNC: CInt = 0x10

public val MSG_CTRUNC: CInt = 0x20

public val MSG_WAITALL: CInt = 0x40

public val MSG_DONTWAIT: CInt = 0x80

public val MSG_EOF: CInt = 0x100

public val MSG_FLUSH: CInt = 0x400

public val MSG_HOLD: CInt = 0x800

public val MSG_SEND: CInt = 0x1000

public val MSG_HAVEMORE: CInt = 0x2000

public val MSG_RCVMORE: CInt = 0x4000

public val MSG_NEEDSA: CInt = 0x10000

public val MSG_NOSIGNAL: CInt = 0x80000

public val SCM_TIMESTAMP: CInt = 0x02

public val SCM_CREDS: CInt = 0x03

// https://github.com/aosm/xnu/blob/HEAD/bsd/net/if.h#L140-L156
public val IFF_UP: CInt = 0x1

// interface is up
public val IFF_BROADCAST: CInt = 0x2

// broadcast address valid
public val IFF_DEBUG: CInt = 0x4

// turn on debugging
public val IFF_LOOPBACK: CInt = 0x8

// is a loopback net
public val IFF_POINTOPOINT: CInt = 0x10

// interface is point-to-point link
public val IFF_NOTRAILERS: CInt = 0x20

// obsolete: avoid use of trailers
public val IFF_RUNNING: CInt = 0x40

// resources allocated
public val IFF_NOARP: CInt = 0x80

// no address resolution protocol
public val IFF_PROMISC: CInt = 0x100

// receive all packets
public val IFF_ALLMULTI: CInt = 0x200

// receive all multicast packets
public val IFF_OACTIVE: CInt = 0x400

// transmission in progress
public val IFF_SIMPLEX: CInt = 0x800

// can't hear own transmissions
public val IFF_LINK0: CInt = 0x1000

// per link layer defined bit
public val IFF_LINK1: CInt = 0x2000

// per link layer defined bit
public val IFF_LINK2: CInt = 0x4000

// per link layer defined bit
public val IFF_ALTPHYS: CInt = IFF_LINK2

// use alternate physical connection
public val IFF_MULTICAST: CInt = 0x8000

// supports multicast
public val SCOPE6_ID_MAX: SizeT = 16uL

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val SAE_ASSOCID_ANY: SaeAssocidT = 0u

/**
 * ((saeAssocidT)(-1ULL))
 */
public val SAE_ASSOCID_ALL: SaeAssocidT = 0xffffffffu

public val SAE_CONNID_ANY: SaeConnidT = 0u

/**
 * ((saeConnidT)(-1ULL))
 */
public val SAE_CONNID_ALL: SaeConnidT = 0xffffffffu

// connectx() flag parameters
/**
 * resume connect() on read/write
 */
public val CONNECT_RESUME_ON_READ_WRITE: CUint = 0x1u

/**
 * data is idempotent
 */
public val CONNECT_DATA_IDEMPOTENT: CUint = 0x2u

/**
 * data includes security that replaces the TFO-cookie
 */
public val CONNECT_DATA_AUTHENTICATED: CUint = 0x4u

public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_NB: CInt = 4

public val LOCK_UN: CInt = 8

public val MAP_COPY: CInt = 0x0002

public val MAP_RENAME: CInt = 0x0020

public val MAP_NORESERVE: CInt = 0x0040

public val MAP_NOEXTEND: CInt = 0x0100

public val MAP_HASSEMAPHORE: CInt = 0x0200

public val MAP_NOCACHE: CInt = 0x0400

public val MAP_JIT: CInt = 0x0800

public val SC_ARG_MAX: CInt = 1

public val SC_CHILD_MAX: CInt = 2

public val SC_CLK_TCK: CInt = 3

public val SC_NGROUPS_MAX: CInt = 4

public val SC_OPEN_MAX: CInt = 5

public val SC_JOB_CONTROL: CInt = 6

public val SC_SAVED_IDS: CInt = 7

public val SC_VERSION: CInt = 8

public val SC_BC_BASE_MAX: CInt = 9

public val SC_BC_DIM_MAX: CInt = 10

public val SC_BC_SCALE_MAX: CInt = 11

public val SC_BC_STRING_MAX: CInt = 12

public val SC_COLL_WEIGHTS_MAX: CInt = 13

public val SC_EXPR_NEST_MAX: CInt = 14

public val SC_LINE_MAX: CInt = 15

public val SC_RE_DUP_MAX: CInt = 16

public val SC_2_VERSION: CInt = 17

public val SC_2_C_BIND: CInt = 18

public val SC_2_C_DEV: CInt = 19

public val SC_2_CHAR_TERM: CInt = 20

public val SC_2_FORT_DEV: CInt = 21

public val SC_2_FORT_RUN: CInt = 22

public val SC_2_LOCALEDEF: CInt = 23

public val SC_2_SW_DEV: CInt = 24

public val SC_2_UPE: CInt = 25

public val SC_STREAM_MAX: CInt = 26

public val SC_TZNAME_MAX: CInt = 27

public val SC_ASYNCHRONOUS_IO: CInt = 28

public val SC_PAGESIZE: CInt = 29

public val SC_MEMLOCK: CInt = 30

public val SC_MEMLOCK_RANGE: CInt = 31

public val SC_MEMORY_PROTECTION: CInt = 32

public val SC_MESSAGE_PASSING: CInt = 33

public val SC_PRIORITIZED_IO: CInt = 34

public val SC_PRIORITY_SCHEDULING: CInt = 35

public val SC_REALTIME_SIGNALS: CInt = 36

public val SC_SEMAPHORES: CInt = 37

public val SC_FSYNC: CInt = 38

public val SC_SHARED_MEMORY_OBJECTS: CInt = 39

public val SC_SYNCHRONIZED_IO: CInt = 40

public val SC_TIMERS: CInt = 41

public val SC_AIO_LISTIO_MAX: CInt = 42

public val SC_AIO_MAX: CInt = 43

public val SC_AIO_PRIO_DELTA_MAX: CInt = 44

public val SC_DELAYTIMER_MAX: CInt = 45

public val SC_MQ_OPEN_MAX: CInt = 46

public val SC_MAPPED_FILES: CInt = 47

public val SC_RTSIG_MAX: CInt = 48

public val SC_SEM_NSEMS_MAX: CInt = 49

public val SC_SEM_VALUE_MAX: CInt = 50

public val SC_SIGQUEUE_MAX: CInt = 51

public val SC_TIMER_MAX: CInt = 52

public val SC_NPROCESSORS_CONF: CInt = 57

public val SC_NPROCESSORS_ONLN: CInt = 58

public val SC_2_PBS: CInt = 59

public val SC_2_PBS_ACCOUNTING: CInt = 60

public val SC_2_PBS_CHECKPOINT: CInt = 61

public val SC_2_PBS_LOCATE: CInt = 62

public val SC_2_PBS_MESSAGE: CInt = 63

public val SC_2_PBS_TRACK: CInt = 64

public val SC_ADVISORY_INFO: CInt = 65

public val SC_BARRIERS: CInt = 66

public val SC_CLOCK_SELECTION: CInt = 67

public val SC_CPUTIME: CInt = 68

public val SC_FILE_LOCKING: CInt = 69

public val SC_HOST_NAME_MAX: CInt = 72

public val SC_MONOTONIC_CLOCK: CInt = 74

public val SC_READER_WRITER_LOCKS: CInt = 76

public val SC_REGEXP: CInt = 77

public val SC_SHELL: CInt = 78

public val SC_SPAWN: CInt = 79

public val SC_SPIN_LOCKS: CInt = 80

public val SC_SPORADIC_SERVER: CInt = 81

public val SC_THREAD_CPUTIME: CInt = 84

public val SC_THREAD_SPORADIC_SERVER: CInt = 92

public val SC_TIMEOUTS: CInt = 95

public val SC_TRACE: CInt = 97

public val SC_TRACE_EVENT_FILTER: CInt = 98

public val SC_TRACE_INHERIT: CInt = 99

public val SC_TRACE_LOG: CInt = 100

public val SC_TYPED_MEMORY_OBJECTS: CInt = 102

public val SC_V6_ILP32_OFF32: CInt = 103

public val SC_V6_ILP32_OFFBIG: CInt = 104

public val SC_V6_LP64_OFF64: CInt = 105

public val SC_V6_LPBIG_OFFBIG: CInt = 106

public val SC_IPV6: CInt = 118

public val SC_RAW_SOCKETS: CInt = 119

public val SC_SYMLOOP_MAX: CInt = 120

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_XOPEN_STREAMS: CInt = 114

public val SC_XBS5_ILP32_OFF32: CInt = 122

public val SC_XBS5_ILP32_OFFBIG: CInt = 123

public val SC_XBS5_LP64_OFF64: CInt = 124

public val SC_XBS5_LPBIG_OFFBIG: CInt = 125

public val SC_SS_REPL_MAX: CInt = 126

public val SC_TRACE_EVENT_NAME_MAX: CInt = 127

public val SC_TRACE_NAME_MAX: CInt = 128

public val SC_TRACE_SYS_MAX: CInt = 129

public val SC_TRACE_USER_EVENT_MAX: CInt = 130

public val SC_PASS_MAX: CInt = 131

// `confstr` keys (only the values guaranteed by `man confstr`).
public val CS_PATH: CInt = 1

public val CS_DARWIN_USER_DIR: CInt = 65536

public val CS_DARWIN_USER_TEMP_DIR: CInt = 65537

public val CS_DARWIN_USER_CACHE_DIR: CInt = 65538

public val OS_UNFAIR_LOCK_INIT: OsUnfairLock = Any(osUnfairLockOpaque = 0)

public val OS_LOG_TYPE_DEFAULT: OsLogTypeT = 0x00u

public val OS_LOG_TYPE_INFO: OsLogTypeT = 0x01u

public val OS_LOG_TYPE_DEBUG: OsLogTypeT = 0x02u

public val OS_LOG_TYPE_ERROR: OsLogTypeT = 0x10u

public val OS_LOG_TYPE_FAULT: OsLogTypeT = 0x11u

public val OS_SIGNPOST_EVENT: OsSignpostTypeT = 0x00u

public val OS_SIGNPOST_INTERVAL_BEGIN: OsSignpostTypeT = 0x01u

public val OS_SIGNPOST_INTERVAL_END: OsSignpostTypeT = 0x02u

public val MINSIGSTKSZ: SizeT = 32768uL

public val SIGSTKSZ: SizeT = 131072uL

public val FD_SETSIZE: Int = 1024

public val ST_NOSUID: CUlong = 2uL

public val EVFILT_READ: Short = -1

public val EVFILT_WRITE: Short = -2

public val EVFILT_AIO: Short = -3

public val EVFILT_VNODE: Short = -4

public val EVFILT_PROC: Short = -5

public val EVFILT_SIGNAL: Short = -6

public val EVFILT_TIMER: Short = -7

public val EVFILT_MACHPORT: Short = -8

public val EVFILT_FS: Short = -9

public val EVFILT_USER: Short = -10

public val EVFILT_VM: Short = -12

public val EV_ADD: UShort = 0x1u

public val EV_DELETE: UShort = 0x2u

public val EV_ENABLE: UShort = 0x4u

public val EV_DISABLE: UShort = 0x8u

public val EV_ONESHOT: UShort = 0x10u

public val EV_CLEAR: UShort = 0x20u

public val EV_RECEIPT: UShort = 0x40u

public val EV_DISPATCH: UShort = 0x80u

public val EV_FLAG0: UShort = 0x1000u

public val EV_POLL: UShort = 0x1000u

public val EV_FLAG1: UShort = 0x2000u

public val EV_OOBAND: UShort = 0x2000u

public val EV_ERROR: UShort = 0x4000u

public val EV_EOF: UShort = 0x8000u

public val EV_SYSFLAGS: UShort = 0xf000u

public val NOTE_TRIGGER: UInt = 0x01000000u

public val NOTE_FFNOP: UInt = 0x00000000u

public val NOTE_FFAND: UInt = 0x40000000u

public val NOTE_FFOR: UInt = 0x80000000u

public val NOTE_FFCOPY: UInt = 0xc0000000u

public val NOTE_FFCTRLMASK: UInt = 0xc0000000u

public val NOTE_FFLAGSMASK: UInt = 0x00ffffffu

public val NOTE_LOWAT: UInt = 0x00000001u

public val NOTE_DELETE: UInt = 0x00000001u

public val NOTE_WRITE: UInt = 0x00000002u

public val NOTE_EXTEND: UInt = 0x00000004u

public val NOTE_ATTRIB: UInt = 0x00000008u

public val NOTE_LINK: UInt = 0x00000010u

public val NOTE_RENAME: UInt = 0x00000020u

public val NOTE_REVOKE: UInt = 0x00000040u

public val NOTE_NONE: UInt = 0x00000080u

public val NOTE_EXIT: UInt = 0x80000000u

public val NOTE_FORK: UInt = 0x40000000u

public val NOTE_EXEC: UInt = 0x20000000u

public val NOTE_REAP: UInt = 0x10000000u

public val NOTE_SIGNAL: UInt = 0x08000000u

public val NOTE_EXITSTATUS: UInt = 0x04000000u

public val NOTE_EXIT_DETAIL: UInt = 0x02000000u

public val NOTE_PDATAMASK: UInt = 0x000fffffu

public val NOTE_PCTRLMASK: UInt = 0xfff00000u

public val NOTE_EXIT_REPARENTED: UInt = 0x00080000u

public val NOTE_EXIT_DETAIL_MASK: UInt = 0x00070000u

public val NOTE_EXIT_DECRYPTFAIL: UInt = 0x00010000u

public val NOTE_EXIT_MEMORY: UInt = 0x00020000u

public val NOTE_EXIT_CSERROR: UInt = 0x00040000u

public val NOTE_VM_PRESSURE: UInt = 0x80000000u

public val NOTE_VM_PRESSURE_TERMINATE: UInt = 0x40000000u

public val NOTE_VM_PRESSURE_SUDDEN_TERMINATE: UInt = 0x20000000u

public val NOTE_VM_ERROR: UInt = 0x10000000u

public val NOTE_SECONDS: UInt = 0x00000001u

public val NOTE_USECONDS: UInt = 0x00000002u

public val NOTE_NSECONDS: UInt = 0x00000004u

public val NOTE_ABSOLUTE: UInt = 0x00000008u

public val NOTE_LEEWAY: UInt = 0x00000010u

public val NOTE_CRITICAL: UInt = 0x00000020u

public val NOTE_BACKGROUND: UInt = 0x00000040u

public val NOTE_MACH_CONTINUOUS_TIME: UInt = 0x00000080u

public val NOTE_MACHTIME: UInt = 0x00000100u

public val NOTE_TRACK: UInt = 0x00000001u

public val NOTE_TRACKERR: UInt = 0x00000002u

public val NOTE_CHILD: UInt = 0x00000004u

public val OCRNL: TcflagT = 0x00000010uL

public val ONOCR: TcflagT = 0x00000020uL

public val ONLRET: TcflagT = 0x00000040uL

public val OFILL: TcflagT = 0x00000080uL

public val NLDLY: TcflagT = 0x00000300uL

public val TABDLY: TcflagT = 0x00000c04uL

public val CRDLY: TcflagT = 0x00003000uL

public val FFDLY: TcflagT = 0x00004000uL

public val BSDLY: TcflagT = 0x00008000uL

public val VTDLY: TcflagT = 0x00010000uL

public val OFDEL: TcflagT = 0x00020000uL

public val NL0: TcflagT = 0x00000000uL

public val NL1: TcflagT = 0x00000100uL

public val TAB0: TcflagT = 0x00000000uL

public val TAB1: TcflagT = 0x00000400uL

public val TAB2: TcflagT = 0x00000800uL

public val CR0: TcflagT = 0x00000000uL

public val CR1: TcflagT = 0x00001000uL

public val CR2: TcflagT = 0x00002000uL

public val CR3: TcflagT = 0x00003000uL

public val FF0: TcflagT = 0x00000000uL

public val FF1: TcflagT = 0x00004000uL

public val BS0: TcflagT = 0x00000000uL

public val BS1: TcflagT = 0x00008000uL

public val TAB3: TcflagT = 0x00000004uL

public val VT0: TcflagT = 0x00000000uL

public val VT1: TcflagT = 0x00010000uL

public val IUTF8: TcflagT = 0x00004000uL

public val CRTSCTS: TcflagT = 0x00030000uL

public val NI_MAXHOST: SocklenT = 1025u

public val NI_MAXSERV: SocklenT = 32u

public val NI_NOFQDN: CInt = 0x00000001

public val NI_NUMERICHOST: CInt = 0x00000002

public val NI_NAMEREQD: CInt = 0x00000004

public val NI_NUMERICSERV: CInt = 0x00000008

public val NI_NUMERICSCOPE: CInt = 0x00000100

public val NI_DGRAM: CInt = 0x00000010

public val Q_GETQUOTA: CInt = 0x300

public val Q_SETQUOTA: CInt = 0x400

public val RENAME_SWAP: CUint = 0x00000002u

public val RENAME_EXCL: CUint = 0x00000004u

public val RTLD_LOCAL: CInt = 0x4

public val RTLD_FIRST: CInt = 0x100

public val RTLD_NODELETE: CInt = 0x80

public val RTLD_NOLOAD: CInt = 0x10

public val RTLD_GLOBAL: CInt = 0x8

public val RTLD_MAIN_ONLY: COpaquePointer? = COpaquePointer((-5).toLong())

public val WSTOPPED: CInt = 127

public val LOG_NETINFO: CInt = 12 shl 3

public val LOG_REMOTEAUTH: CInt = 13 shl 3

public val LOG_INSTALL: CInt = 14 shl 3

public val LOG_RAS: CInt = 15 shl 3

public val LOG_LAUNCHD: CInt = 24 shl 3

public val LOG_NFACILITIES: CInt = 25

public val CTLTYPE: CInt = 0xf

public val CTLTYPE_NODE: CInt = 1

public val CTLTYPE_INT: CInt = 2

public val CTLTYPE_STRING: CInt = 3

public val CTLTYPE_QUAD: CInt = 4

public val CTLTYPE_OPAQUE: CInt = 5

public val CTLTYPE_STRUCT: CInt = CTLTYPE_OPAQUE

public val CTLFLAG_RD: CInt = 0x80000000

public val CTLFLAG_WR: CInt = 0x40000000

public val CTLFLAG_RW: CInt = CTLFLAG_RD or CTLFLAG_WR

public val CTLFLAG_NOLOCK: CInt = 0x20000000

public val CTLFLAG_ANYBODY: CInt = 0x10000000

public val CTLFLAG_SECURE: CInt = 0x08000000

public val CTLFLAG_MASKED: CInt = 0x04000000

public val CTLFLAG_NOAUTO: CInt = 0x02000000

public val CTLFLAG_KERN: CInt = 0x01000000

public val CTLFLAG_LOCKED: CInt = 0x00800000

public val CTLFLAG_OID2: CInt = 0x00400000

public val CTL_UNSPEC: CInt = 0

public val CTL_KERN: CInt = 1

public val CTL_VM: CInt = 2

public val CTL_VFS: CInt = 3

public val CTL_NET: CInt = 4

public val CTL_DEBUG: CInt = 5

public val CTL_HW: CInt = 6

public val CTL_MACHDEP: CInt = 7

public val CTL_USER: CInt = 8

public val CTL_MAXID: CInt = 9

public val KERN_OSTYPE: CInt = 1

public val KERN_OSRELEASE: CInt = 2

public val KERN_OSREV: CInt = 3

public val KERN_VERSION: CInt = 4

public val KERN_MAXVNODES: CInt = 5

public val KERN_MAXPROC: CInt = 6

public val KERN_MAXFILES: CInt = 7

public val KERN_ARGMAX: CInt = 8

public val KERN_SECURELVL: CInt = 9

public val KERN_HOSTNAME: CInt = 10

public val KERN_HOSTID: CInt = 11

public val KERN_CLOCKRATE: CInt = 12

public val KERN_VNODE: CInt = 13

public val KERN_PROC: CInt = 14

public val KERN_FILE: CInt = 15

public val KERN_PROF: CInt = 16

public val KERN_POSIX1: CInt = 17

public val KERN_NGROUPS: CInt = 18

public val KERN_JOB_CONTROL: CInt = 19

public val KERN_SAVED_IDS: CInt = 20

public val KERN_BOOTTIME: CInt = 21

public val KERN_NISDOMAINNAME: CInt = 22

public val KERN_DOMAINNAME: CInt = KERN_NISDOMAINNAME

public val KERN_MAXPARTITIONS: CInt = 23

public val KERN_KDEBUG: CInt = 24

public val KERN_UPDATEINTERVAL: CInt = 25

public val KERN_OSRELDATE: CInt = 26

public val KERN_NTP_PLL: CInt = 27

public val KERN_BOOTFILE: CInt = 28

public val KERN_MAXFILESPERPROC: CInt = 29

public val KERN_MAXPROCPERUID: CInt = 30

public val KERN_DUMPDEV: CInt = 31

public val KERN_IPC: CInt = 32

public val KERN_DUMMY: CInt = 33

public val KERN_PS_STRINGS: CInt = 34

public val KERN_USRSTACK32: CInt = 35

public val KERN_LOGSIGEXIT: CInt = 36

public val KERN_SYMFILE: CInt = 37

public val KERN_PROCARGS: CInt = 38

public val KERN_NETBOOT: CInt = 40

public val KERN_SYSV: CInt = 42

public val KERN_AFFINITY: CInt = 43

public val KERN_TRANSLATE: CInt = 44

public val KERN_CLASSIC: CInt = KERN_TRANSLATE

public val KERN_EXEC: CInt = 45

public val KERN_CLASSICHANDLER: CInt = KERN_EXEC

public val KERN_AIOMAX: CInt = 46

public val KERN_AIOPROCMAX: CInt = 47

public val KERN_AIOTHREADS: CInt = 48

public val KERN_COREFILE: CInt = 50

public val KERN_COREDUMP: CInt = 51

public val KERN_SUGID_COREDUMP: CInt = 52

public val KERN_PROCDELAYTERM: CInt = 53

public val KERN_SHREG_PRIVATIZABLE: CInt = 54

public val KERN_LOW_PRI_WINDOW: CInt = 56

public val KERN_LOW_PRI_DELAY: CInt = 57

public val KERN_POSIX: CInt = 58

public val KERN_USRSTACK64: CInt = 59

public val KERN_NX_PROTECTION: CInt = 60

public val KERN_TFP: CInt = 61

public val KERN_PROCNAME: CInt = 62

public val KERN_THALTSTACK: CInt = 63

public val KERN_SPECULATIVE_READS: CInt = 64

public val KERN_OSVERSION: CInt = 65

public val KERN_SAFEBOOT: CInt = 66

public val KERN_RAGEVNODE: CInt = 68

public val KERN_TTY: CInt = 69

public val KERN_CHECKOPENEVT: CInt = 70

public val KERN_THREADNAME: CInt = 71

public val KERN_MAXID: CInt = 72

public val KERN_RAGE_PROC: CInt = 1

public val KERN_RAGE_THREAD: CInt = 2

public val KERN_UNRAGE_PROC: CInt = 3

public val KERN_UNRAGE_THREAD: CInt = 4

public val KERN_OPENEVT_PROC: CInt = 1

public val KERN_UNOPENEVT_PROC: CInt = 2

public val KERN_TFP_POLICY: CInt = 1

public val KERN_TFP_POLICY_DENY: CInt = 0

public val KERN_TFP_POLICY_DEFAULT: CInt = 2

public val KERN_KDEFLAGS: CInt = 1

public val KERN_KDDFLAGS: CInt = 2

public val KERN_KDENABLE: CInt = 3

public val KERN_KDSETBUF: CInt = 4

public val KERN_KDGETBUF: CInt = 5

public val KERN_KDSETUP: CInt = 6

public val KERN_KDREMOVE: CInt = 7

public val KERN_KDSETREG: CInt = 8

public val KERN_KDGETREG: CInt = 9

public val KERN_KDREADTR: CInt = 10

public val KERN_KDPIDTR: CInt = 11

public val KERN_KDTHRMAP: CInt = 12

public val KERN_KDPIDEX: CInt = 14

public val KERN_KDSETRTCDEC: CInt = 15

public val KERN_KDGETENTROPY: CInt = 16

public val KERN_KDWRITETR: CInt = 17

public val KERN_KDWRITEMAP: CInt = 18

public val KERN_KDENABLE_BG_TRACE: CInt = 19

public val KERN_KDDISABLE_BG_TRACE: CInt = 20

public val KERN_KDREADCURTHRMAP: CInt = 21

public val KERN_KDSET_TYPEFILTER: CInt = 22

public val KERN_KDBUFWAIT: CInt = 23

public val KERN_KDCPUMAP: CInt = 24

public val KERN_PROC_ALL: CInt = 0

public val KERN_PROC_PID: CInt = 1

public val KERN_PROC_PGRP: CInt = 2

public val KERN_PROC_SESSION: CInt = 3

public val KERN_PROC_TTY: CInt = 4

public val KERN_PROC_UID: CInt = 5

public val KERN_PROC_RUID: CInt = 6

public val KERN_PROC_LCID: CInt = 7

public val KERN_SUCCESS: CInt = 0

public val KERN_INVALID_ADDRESS: CInt = 1

public val KERN_PROTECTION_FAILURE: CInt = 2

public val KERN_NO_SPACE: CInt = 3

public val KERN_INVALID_ARGUMENT: CInt = 4

public val KERN_FAILURE: CInt = 5

public val KERN_RESOURCE_SHORTAGE: CInt = 6

public val KERN_NOT_RECEIVER: CInt = 7

public val KERN_NO_ACCESS: CInt = 8

public val KERN_MEMORY_FAILURE: CInt = 9

public val KERN_MEMORY_ERROR: CInt = 10

public val KERN_ALREADY_IN_SET: CInt = 11

public val KERN_NOT_IN_SET: CInt = 12

public val KERN_NAME_EXISTS: CInt = 13

public val KERN_ABORTED: CInt = 14

public val KERN_INVALID_NAME: CInt = 15

public val KERN_INVALID_TASK: CInt = 16

public val KERN_INVALID_RIGHT: CInt = 17

public val KERN_INVALID_VALUE: CInt = 18

public val KERN_UREFS_OVERFLOW: CInt = 19

public val KERN_INVALID_CAPABILITY: CInt = 20

public val KERN_RIGHT_EXISTS: CInt = 21

public val KERN_INVALID_HOST: CInt = 22

public val KERN_MEMORY_PRESENT: CInt = 23

public val KERN_MEMORY_DATA_MOVED: CInt = 24

public val KERN_MEMORY_RESTART_COPY: CInt = 25

public val KERN_INVALID_PROCESSOR_SET: CInt = 26

public val KERN_POLICY_LIMIT: CInt = 27

public val KERN_INVALID_POLICY: CInt = 28

public val KERN_INVALID_OBJECT: CInt = 29

public val KERN_ALREADY_WAITING: CInt = 30

public val KERN_DEFAULT_SET: CInt = 31

public val KERN_EXCEPTION_PROTECTED: CInt = 32

public val KERN_INVALID_LEDGER: CInt = 33

public val KERN_INVALID_MEMORY_CONTROL: CInt = 34

public val KERN_INVALID_SECURITY: CInt = 35

public val KERN_NOT_DEPRESSED: CInt = 36

public val KERN_TERMINATED: CInt = 37

public val KERN_LOCK_SET_DESTROYED: CInt = 38

public val KERN_LOCK_UNSTABLE: CInt = 39

public val KERN_LOCK_OWNED: CInt = 40

public val KERN_LOCK_OWNED_SELF: CInt = 41

public val KERN_SEMAPHORE_DESTROYED: CInt = 42

public val KERN_RPC_SERVER_TERMINATED: CInt = 43

public val KERN_RPC_TERMINATE_ORPHAN: CInt = 44

public val KERN_RPC_CONTINUE_ORPHAN: CInt = 45

public val KERN_NOT_SUPPORTED: CInt = 46

public val KERN_NODE_DOWN: CInt = 47

public val KERN_NOT_WAITING: CInt = 48

public val KERN_OPERATION_TIMED_OUT: CInt = 49

public val KERN_CODESIGN_ERROR: CInt = 50

public val KERN_POLICY_STATIC: CInt = 51

public val KERN_INSUFFICIENT_BUFFER_SIZE: CInt = 52

public val KIPC_MAXSOCKBUF: CInt = 1

public val KIPC_SOCKBUF_WASTE: CInt = 2

public val KIPC_SOMAXCONN: CInt = 3

public val KIPC_MAX_LINKHDR: CInt = 4

public val KIPC_MAX_PROTOHDR: CInt = 5

public val KIPC_MAX_HDR: CInt = 6

public val KIPC_MAX_DATALEN: CInt = 7

public val KIPC_MBSTAT: CInt = 8

public val KIPC_NMBCLUSTERS: CInt = 9

public val KIPC_SOQLIMITCOMPAT: CInt = 10

public val VM_METER: CInt = 1

public val VM_LOADAVG: CInt = 2

public val VM_MACHFACTOR: CInt = 4

public val VM_SWAPUSAGE: CInt = 5

public val VM_MAXID: CInt = 6

public val VM_PROT_NONE: VmProtT = 0x00

public val VM_PROT_READ: VmProtT = 0x01

public val VM_PROT_WRITE: VmProtT = 0x02

public val VM_PROT_EXECUTE: VmProtT = 0x04

public val MEMORY_OBJECT_NULL: MemoryObjectT = 0u

public val HW_MACHINE: CInt = 1

public val HW_MODEL: CInt = 2

public val HW_NCPU: CInt = 3

public val HW_BYTEORDER: CInt = 4

public val HW_PHYSMEM: CInt = 5

public val HW_USERMEM: CInt = 6

public val HW_PAGESIZE: CInt = 7

public val HW_DISKNAMES: CInt = 8

public val HW_DISKSTATS: CInt = 9

public val HW_EPOCH: CInt = 10

public val HW_FLOATINGPT: CInt = 11

public val HW_MACHINE_ARCH: CInt = 12

public val HW_VECTORUNIT: CInt = 13

public val HW_BUS_FREQ: CInt = 14

public val HW_CPU_FREQ: CInt = 15

public val HW_CACHELINE: CInt = 16

public val HW_L1ICACHESIZE: CInt = 17

public val HW_L1DCACHESIZE: CInt = 18

public val HW_L2SETTINGS: CInt = 19

public val HW_L2CACHESIZE: CInt = 20

public val HW_L3SETTINGS: CInt = 21

public val HW_L3CACHESIZE: CInt = 22

public val HW_TB_FREQ: CInt = 23

public val HW_MEMSIZE: CInt = 24

public val HW_AVAILCPU: CInt = 25

public val HW_TARGET: CInt = 26

public val HW_PRODUCT: CInt = 27

public val HW_MAXID: CInt = 28

public val USER_CS_PATH: CInt = 1

public val USER_BC_BASE_MAX: CInt = 2

public val USER_BC_DIM_MAX: CInt = 3

public val USER_BC_SCALE_MAX: CInt = 4

public val USER_BC_STRING_MAX: CInt = 5

public val USER_COLL_WEIGHTS_MAX: CInt = 6

public val USER_EXPR_NEST_MAX: CInt = 7

public val USER_LINE_MAX: CInt = 8

public val USER_RE_DUP_MAX: CInt = 9

public val USER_POSIX2_VERSION: CInt = 10

public val USER_POSIX2_C_BIND: CInt = 11

public val USER_POSIX2_C_DEV: CInt = 12

public val USER_POSIX2_CHAR_TERM: CInt = 13

public val USER_POSIX2_FORT_DEV: CInt = 14

public val USER_POSIX2_FORT_RUN: CInt = 15

public val USER_POSIX2_LOCALEDEF: CInt = 16

public val USER_POSIX2_SW_DEV: CInt = 17

public val USER_POSIX2_UPE: CInt = 18

public val USER_STREAM_MAX: CInt = 19

public val USER_TZNAME_MAX: CInt = 20

public val USER_MAXID: CInt = 21

public val CTL_DEBUG_NAME: CInt = 0

public val CTL_DEBUG_VALUE: CInt = 1

public val CTL_DEBUG_MAXID: CInt = 20

public val PRIO_DARWIN_THREAD: CInt = 3

public val PRIO_DARWIN_PROCESS: CInt = 4

public val PRIO_DARWIN_BG: CInt = 0x1000

public val PRIO_DARWIN_NONUI: CInt = 0x1001

public val SEM_FAILED: CInt? = (-1).toInt()

public val AI_PASSIVE: CInt = 0x00000001

public val AI_CANONNAME: CInt = 0x00000002

public val AI_NUMERICHOST: CInt = 0x00000004

public val AI_NUMERICSERV: CInt = 0x00001000

public val AI_MASK: CInt = AI_PASSIVE or AI_CANONNAME or AI_NUMERICHOST or AI_NUMERICSERV or AI_ADDRCONFIG

public val AI_ALL: CInt = 0x00000100

public val AI_V4MAPPED_CFG: CInt = 0x00000200

public val AI_ADDRCONFIG: CInt = 0x00000400

public val AI_V4MAPPED: CInt = 0x00000800

public val AI_DEFAULT: CInt = AI_V4MAPPED_CFG or AI_ADDRCONFIG

public val AI_UNUSABLE: CInt = 0x10000000
