// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public const val _UTX_USERSIZE: ULong = 256uL

public const val _UTX_LINESIZE: ULong = 32uL

public const val _UTX_IDSIZE: ULong = 4uL

public const val _UTX_HOSTSIZE: ULong = 256uL

public const val EMPTY: Short = 0

public const val RUN_LVL: Short = 1

public const val BOOT_TIME: Short = 2

public const val OLD_TIME: Short = 3

public const val NEW_TIME: Short = 4

public const val INIT_PROCESS: Short = 5

public const val LOGIN_PROCESS: Short = 6

public const val USER_PROCESS: Short = 7

public const val DEAD_PROCESS: Short = 8

public const val ACCOUNTING: Short = 9

public const val SIGNATURE: Short = 10

public const val SHUTDOWN_TIME: Short = 11

public val LC_COLLATE_MASK: Int = 1 shl 0

public val LC_CTYPE_MASK: Int = 1 shl 1

public val LC_MESSAGES_MASK: Int = 1 shl 2

public val LC_MONETARY_MASK: Int = 1 shl 3

public val LC_NUMERIC_MASK: Int = 1 shl 4

public val LC_TIME_MASK: Int = 1 shl 5

public val LC_ALL_MASK: Int = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK

public const val CODESET: Int = 0

public const val D_T_FMT: Int = 1

public const val D_FMT: Int = 2

public const val T_FMT: Int = 3

public const val T_FMT_AMPM: Int = 4

public const val AM_STR: Int = 5

public const val PM_STR: Int = 6

public const val DAY_1: Int = 7

public const val DAY_2: Int = 8

public const val DAY_3: Int = 9

public const val DAY_4: Int = 10

public const val DAY_5: Int = 11

public const val DAY_6: Int = 12

public const val DAY_7: Int = 13

public const val ABDAY_1: Int = 14

public const val ABDAY_2: Int = 15

public const val ABDAY_3: Int = 16

public const val ABDAY_4: Int = 17

public const val ABDAY_5: Int = 18

public const val ABDAY_6: Int = 19

public const val ABDAY_7: Int = 20

public const val MON_1: Int = 21

public const val MON_2: Int = 22

public const val MON_3: Int = 23

public const val MON_4: Int = 24

public const val MON_5: Int = 25

public const val MON_6: Int = 26

public const val MON_7: Int = 27

public const val MON_8: Int = 28

public const val MON_9: Int = 29

public const val MON_10: Int = 30

public const val MON_11: Int = 31

public const val MON_12: Int = 32

public const val ABMON_1: Int = 33

public const val ABMON_2: Int = 34

public const val ABMON_3: Int = 35

public const val ABMON_4: Int = 36

public const val ABMON_5: Int = 37

public const val ABMON_6: Int = 38

public const val ABMON_7: Int = 39

public const val ABMON_8: Int = 40

public const val ABMON_9: Int = 41

public const val ABMON_10: Int = 42

public const val ABMON_11: Int = 43

public const val ABMON_12: Int = 44

public const val CLOCK_REALTIME: UInt = 0u

public const val CLOCK_MONOTONIC_RAW: UInt = 4u

public const val CLOCK_MONOTONIC_RAW_APPROX: UInt = 5u

public const val CLOCK_MONOTONIC: UInt = 6u

public const val CLOCK_UPTIME_RAW: UInt = 8u

public const val CLOCK_UPTIME_RAW_APPROX: UInt = 9u

public const val CLOCK_PROCESS_CPUTIME_ID: UInt = 12u

public const val CLOCK_THREAD_CPUTIME_ID: UInt = 16u

public const val ERA: Int = 45

public const val ERA_D_FMT: Int = 46

public const val ERA_D_T_FMT: Int = 47

public const val ERA_T_FMT: Int = 48

public const val ALT_DIGITS: Int = 49

public const val RADIXCHAR: Int = 50

public const val THOUSEP: Int = 51

public const val YESEXPR: Int = 52

public const val NOEXPR: Int = 53

public const val YESSTR: Int = 54

public const val NOSTR: Int = 55

public const val CRNCYSTR: Int = 56

public const val D_MD_ORDER: Int = 57

public const val EXIT_FAILURE: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val RAND_MAX: Int = 2147483647

public const val EOF: Int = -1

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val SEEK_HOLE: Int = 3

public const val SEEK_DATA: Int = 4

public const val _IOFBF: Int = 0

public const val _IONBF: Int = 2

public const val _IOLBF: Int = 1

public const val BUFSIZ: UInt = 1024u

public const val FOPEN_MAX: UInt = 20u

public const val FILENAME_MAX: UInt = 1024u

public const val L_tmpnam: UInt = 1024u

public const val TMP_MAX: UInt = 308915776u

public const val _PC_LINK_MAX: Int = 1

public const val _PC_MAX_CANON: Int = 2

public const val _PC_MAX_INPUT: Int = 3

public const val _PC_NAME_MAX: Int = 4

public const val _PC_PATH_MAX: Int = 5

public const val _PC_PIPE_BUF: Int = 6

public const val _PC_CHOWN_RESTRICTED: Int = 7

public const val _PC_NO_TRUNC: Int = 8

public const val _PC_VDISABLE: Int = 9

public const val _PC_NAME_CHARS_MAX: Int = 10

public const val _PC_CASE_SENSITIVE: Int = 11

public const val _PC_CASE_PRESERVING: Int = 12

public const val _PC_EXTENDED_SECURITY_NP: Int = 13

public const val _PC_AUTH_OPAQUE_NP: Int = 14

public const val _PC_2_SYMLINKS: Int = 15

public const val _PC_ALLOC_SIZE_MIN: Int = 16

public const val _PC_ASYNC_IO: Int = 17

public const val _PC_FILESIZEBITS: Int = 18

public const val _PC_PRIO_IO: Int = 19

public const val _PC_REC_INCR_XFER_SIZE: Int = 20

public const val _PC_REC_MAX_XFER_SIZE: Int = 21

public const val _PC_REC_MIN_XFER_SIZE: Int = 22

public const val _PC_REC_XFER_ALIGN: Int = 23

public const val _PC_SYMLINK_MAX: Int = 24

public const val _PC_SYNC_IO: Int = 25

public const val _PC_XATTR_SIZE_BITS: Int = 26

public const val _PC_MIN_HOLE_SIZE: Int = 27

public const val O_EVTONLY: Int = 0x00008000

public const val O_NOCTTY: Int = 0x00020000

public const val O_DIRECTORY: Int = 0x00100000

public const val O_SYMLINK: Int = 0x00200000

public const val O_DSYNC: Int = 0x00400000

public const val O_CLOEXEC: Int = 0x01000000

public const val O_NOFOLLOW_ANY: Int = 0x20000000

public const val O_EXEC: Int = 0x40000000

public val O_SEARCH: Int = O_EXEC or O_DIRECTORY

public const val S_IFIFO: UShort = 4096u

public const val S_IFCHR: UShort = 8192u

public const val S_IFBLK: UShort = 24576u

public const val S_IFDIR: UShort = 16384u

public const val S_IFREG: UShort = 32768u

public const val S_IFLNK: UShort = 40960u

public const val S_IFSOCK: UShort = 49152u

public const val S_IFMT: UShort = 61440u

public const val S_IEXEC: UShort = 64u

public const val S_IWRITE: UShort = 128u

public const val S_IREAD: UShort = 256u

public const val S_IRWXU: UShort = 448u

public const val S_IXUSR: UShort = 64u

public const val S_IWUSR: UShort = 128u

public const val S_IRUSR: UShort = 256u

public const val S_IRWXG: UShort = 56u

public const val S_IXGRP: UShort = 8u

public const val S_IWGRP: UShort = 16u

public const val S_IRGRP: UShort = 32u

public const val S_IRWXO: UShort = 7u

public const val S_IXOTH: UShort = 1u

public const val S_IWOTH: UShort = 2u

public const val S_IROTH: UShort = 4u

public const val F_OK: Int = 0

public const val R_OK: Int = 4

public const val W_OK: Int = 2

public const val X_OK: Int = 1

public const val F_LOCK: Int = 1

public const val F_TEST: Int = 3

public const val F_TLOCK: Int = 2

public const val F_ULOCK: Int = 0

public const val F_GETLK: Int = 7

public const val F_SETLK: Int = 8

public const val F_SETLKW: Int = 9

public const val SIGHUP: Int = 1

public const val SIGINT: Int = 2

public const val SIGQUIT: Int = 3

public const val SIGILL: Int = 4

public const val SIGABRT: Int = 6

public const val SIGEMT: Int = 7

public const val SIGFPE: Int = 8

public const val SIGKILL: Int = 9

public const val SIGSEGV: Int = 11

public const val SIGPIPE: Int = 13

public const val SIGALRM: Int = 14

public const val SIGTERM: Int = 15

public const val PROT_NONE: Int = 0

public const val PROT_READ: Int = 1

public const val PROT_WRITE: Int = 2

public const val PROT_EXEC: Int = 4

public const val PT_TRACE_ME: Int = 0

public const val PT_READ_I: Int = 1

public const val PT_READ_D: Int = 2

public const val PT_READ_U: Int = 3

public const val PT_WRITE_I: Int = 4

public const val PT_WRITE_D: Int = 5

public const val PT_WRITE_U: Int = 6

public const val PT_CONTINUE: Int = 7

public const val PT_KILL: Int = 8

public const val PT_STEP: Int = 9

public const val PT_ATTACH: Int = 10

public const val PT_DETACH: Int = 11

public const val PT_SIGEXC: Int = 12

public const val PT_THUPDATE: Int = 13

public const val PT_ATTACHEXC: Int = 14

public const val PT_FORCEQUOTA: Int = 30

public const val PT_DENY_ATTACH: Int = 31

public const val PT_FIRSTMACH: Int = 32

public const val MAP_FILE: Int = 0x0000

public const val MAP_SHARED: Int = 0x0001

public const val MAP_PRIVATE: Int = 0x0002

public const val MAP_FIXED: Int = 0x0010

public const val MAP_ANON: Int = 0x1000

public const val MAP_ANONYMOUS: Int = MAP_ANON

public const val CPU_STATE_USER: Int = 0

public const val CPU_STATE_SYSTEM: Int = 1

public const val CPU_STATE_IDLE: Int = 2

public const val CPU_STATE_NICE: Int = 3

public const val CPU_STATE_MAX: Int = 4

public const val PROCESSOR_BASIC_INFO: Int = 1

public const val PROCESSOR_CPU_LOAD_INFO: Int = 2

public const val PROCESSOR_PM_REGS_INFO: Int = 0x10000001

public const val PROCESSOR_TEMPERATURE: Int = 0x10000002

public const val PROCESSOR_SET_LOAD_INFO: Int = 4

public const val PROCESSOR_SET_BASIC_INFO: Int = 5

public const val VM_FLAGS_FIXED: Int = 0x0000

public const val VM_FLAGS_ANYWHERE: Int = 0x0001

public const val VM_FLAGS_PURGABLE: Int = 0x0002

public const val VM_FLAGS_RANDOM_ADDR: Int = 0x0008

public const val VM_FLAGS_NO_CACHE: Int = 0x0010

public const val VM_FLAGS_RESILIENT_CODESIGN: Int = 0x0020

public const val VM_FLAGS_RESILIENT_MEDIA: Int = 0x0040

public const val VM_FLAGS_OVERWRITE: Int = 0x4000

public const val VM_FLAGS_SUPERPAGE_MASK: Int = 0x70000

public const val VM_FLAGS_RETURN_DATA_ADDR: Int = 0x100000

public const val VM_FLAGS_RETURN_4K_DATA_ADDR: Int = 0x800000

public const val VM_FLAGS_ALIAS_MASK: Int = 0xFF000000.toInt()

public const val VM_FLAGS_USER_ALLOCATE: Int = 0xff07401f.toInt()

public const val VM_FLAGS_USER_MAP: Int = 0xff97401f.toInt()

public val VM_FLAGS_USER_REMAP: Int = VM_FLAGS_FIXED or VM_FLAGS_ANYWHERE or VM_FLAGS_RANDOM_ADDR or VM_FLAGS_OVERWRITE or VM_FLAGS_RETURN_DATA_ADDR or VM_FLAGS_RESILIENT_CODESIGN

public const val VM_FLAGS_SUPERPAGE_SHIFT: Int = 16

public const val SUPERPAGE_NONE: Int = 0

public const val SUPERPAGE_SIZE_ANY: Int = 1

public val VM_FLAGS_SUPERPAGE_NONE: Int = SUPERPAGE_NONE shl VM_FLAGS_SUPERPAGE_SHIFT

public val VM_FLAGS_SUPERPAGE_SIZE_ANY: Int = SUPERPAGE_SIZE_ANY shl VM_FLAGS_SUPERPAGE_SHIFT

public const val SUPERPAGE_SIZE_2MB: Int = 2

public val VM_FLAGS_SUPERPAGE_SIZE_2MB: Int = SUPERPAGE_SIZE_2MB shl VM_FLAGS_SUPERPAGE_SHIFT

public const val VM_MEMORY_MALLOC: Int = 1

public const val VM_MEMORY_MALLOC_SMALL: Int = 2

public const val VM_MEMORY_MALLOC_LARGE: Int = 3

public const val VM_MEMORY_MALLOC_HUGE: Int = 4

public const val VM_MEMORY_SBRK: Int = 5

public const val VM_MEMORY_REALLOC: Int = 6

public const val VM_MEMORY_MALLOC_TINY: Int = 7

public const val VM_MEMORY_MALLOC_LARGE_REUSABLE: Int = 8

public const val VM_MEMORY_MALLOC_LARGE_REUSED: Int = 9

public const val VM_MEMORY_ANALYSIS_TOOL: Int = 10

public const val VM_MEMORY_MALLOC_NANO: Int = 11

public const val VM_MEMORY_MACH_MSG: Int = 20

public const val VM_MEMORY_IOKIT: Int = 21

public const val VM_MEMORY_STACK: Int = 30

public const val VM_MEMORY_GUARD: Int = 31

public const val VM_MEMORY_SHARED_PMAP: Int = 32

public const val VM_MEMORY_DYLIB: Int = 33

public const val VM_MEMORY_OBJC_DISPATCHERS: Int = 34

public const val VM_MEMORY_UNSHARED_PMAP: Int = 35

public const val VM_MEMORY_APPKIT: Int = 40

public const val VM_MEMORY_FOUNDATION: Int = 41

public const val VM_MEMORY_COREGRAPHICS: Int = 42

public const val VM_MEMORY_CORESERVICES: Int = 43

public const val VM_MEMORY_CARBON: Int = VM_MEMORY_CORESERVICES

public const val VM_MEMORY_JAVA: Int = 44

public const val VM_MEMORY_COREDATA: Int = 45

public const val VM_MEMORY_COREDATA_OBJECTIDS: Int = 46

public const val VM_MEMORY_ATS: Int = 50

public const val VM_MEMORY_LAYERKIT: Int = 51

public const val VM_MEMORY_CGIMAGE: Int = 52

public const val VM_MEMORY_TCMALLOC: Int = 53

public const val VM_MEMORY_COREGRAPHICS_DATA: Int = 54

public const val VM_MEMORY_COREGRAPHICS_SHARED: Int = 55

public const val VM_MEMORY_COREGRAPHICS_FRAMEBUFFERS: Int = 56

public const val VM_MEMORY_COREGRAPHICS_BACKINGSTORES: Int = 57

public const val VM_MEMORY_COREGRAPHICS_XALLOC: Int = 58

public const val VM_MEMORY_COREGRAPHICS_MISC: Int = VM_MEMORY_COREGRAPHICS

public const val VM_MEMORY_DYLD: Int = 60

public const val VM_MEMORY_DYLD_MALLOC: Int = 61

public const val VM_MEMORY_SQLITE: Int = 62

public const val VM_MEMORY_JAVASCRIPT_CORE: Int = 63

public const val VM_MEMORY_JAVASCRIPT_JIT_EXECUTABLE_ALLOCATOR: Int = 64

public const val VM_MEMORY_JAVASCRIPT_JIT_REGISTER_FILE: Int = 65

public const val VM_MEMORY_GLSL: Int = 66

public const val VM_MEMORY_OPENCL: Int = 67

public const val VM_MEMORY_COREIMAGE: Int = 68

public const val VM_MEMORY_WEBCORE_PURGEABLE_BUFFERS: Int = 69

public const val VM_MEMORY_IMAGEIO: Int = 70

public const val VM_MEMORY_COREPROFILE: Int = 71

public const val VM_MEMORY_ASSETSD: Int = 72

public const val VM_MEMORY_OS_ALLOC_ONCE: Int = 73

public const val VM_MEMORY_LIBDISPATCH: Int = 74

public const val VM_MEMORY_ACCELERATE: Int = 75

public const val VM_MEMORY_COREUI: Int = 76

public const val VM_MEMORY_COREUIFILE: Int = 77

public const val VM_MEMORY_GENEALOGY: Int = 78

public const val VM_MEMORY_RAWCAMERA: Int = 79

public const val VM_MEMORY_CORPSEINFO: Int = 80

public const val VM_MEMORY_ASL: Int = 81

public const val VM_MEMORY_SWIFT_RUNTIME: Int = 82

public const val VM_MEMORY_SWIFT_METADATA: Int = 83

public const val VM_MEMORY_DHMM: Int = 84

public const val VM_MEMORY_SCENEKIT: Int = 86

public const val VM_MEMORY_SKYWALK: Int = 87

public const val VM_MEMORY_APPLICATION_SPECIFIC_1: Int = 240

public const val VM_MEMORY_APPLICATION_SPECIFIC_16: Int = 255

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val MS_ASYNC: Int = 0x0001

public const val MS_INVALIDATE: Int = 0x0002

public const val MS_SYNC: Int = 0x0010

public const val MS_KILLPAGES: Int = 0x0004

public const val MS_DEACTIVATE: Int = 0x0008

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

public const val EDEADLK: Int = 11

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

public const val EAGAIN: Int = 35

public const val EWOULDBLOCK: Int = EAGAIN

public const val EINPROGRESS: Int = 36

public const val EALREADY: Int = 37

public const val ENOTSOCK: Int = 38

public const val EDESTADDRREQ: Int = 39

public const val EMSGSIZE: Int = 40

public const val EPROTOTYPE: Int = 41

public const val ENOPROTOOPT: Int = 42

public const val EPROTONOSUPPORT: Int = 43

public const val ESOCKTNOSUPPORT: Int = 44

public const val ENOTSUP: Int = 45

public const val EPFNOSUPPORT: Int = 46

public const val EAFNOSUPPORT: Int = 47

public const val EADDRINUSE: Int = 48

public const val EADDRNOTAVAIL: Int = 49

public const val ENETDOWN: Int = 50

public const val ENETUNREACH: Int = 51

public const val ENETRESET: Int = 52

public const val ECONNABORTED: Int = 53

public const val ECONNRESET: Int = 54

public const val ENOBUFS: Int = 55

public const val EISCONN: Int = 56

public const val ENOTCONN: Int = 57

public const val ESHUTDOWN: Int = 58

public const val ETOOMANYREFS: Int = 59

public const val ETIMEDOUT: Int = 60

public const val ECONNREFUSED: Int = 61

public const val ELOOP: Int = 62

public const val ENAMETOOLONG: Int = 63

public const val EHOSTDOWN: Int = 64

public const val EHOSTUNREACH: Int = 65

public const val ENOTEMPTY: Int = 66

public const val EPROCLIM: Int = 67

public const val EUSERS: Int = 68

public const val EDQUOT: Int = 69

public const val ESTALE: Int = 70

public const val EREMOTE: Int = 71

public const val EBADRPC: Int = 72

public const val ERPCMISMATCH: Int = 73

public const val EPROGUNAVAIL: Int = 74

public const val EPROGMISMATCH: Int = 75

public const val EPROCUNAVAIL: Int = 76

public const val ENOLCK: Int = 77

public const val ENOSYS: Int = 78

public const val EFTYPE: Int = 79

public const val EAUTH: Int = 80

public const val ENEEDAUTH: Int = 81

public const val EPWROFF: Int = 82

public const val EDEVERR: Int = 83

public const val EOVERFLOW: Int = 84

public const val EBADEXEC: Int = 85

public const val EBADARCH: Int = 86

public const val ESHLIBVERS: Int = 87

public const val EBADMACHO: Int = 88

public const val ECANCELED: Int = 89

public const val EIDRM: Int = 90

public const val ENOMSG: Int = 91

public const val EILSEQ: Int = 92

public const val ENOATTR: Int = 93

public const val EBADMSG: Int = 94

public const val EMULTIHOP: Int = 95

public const val ENODATA: Int = 96

public const val ENOLINK: Int = 97

public const val ENOSR: Int = 98

public const val ENOSTR: Int = 99

public const val EPROTO: Int = 100

public const val ETIME: Int = 101

public const val EOPNOTSUPP: Int = 102

public const val ENOPOLICY: Int = 103

public const val ENOTRECOVERABLE: Int = 104

public const val EOWNERDEAD: Int = 105

public const val EQFULL: Int = 106

public const val ELAST: Int = 106

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

public const val F_DUPFD: Int = 0

public const val F_DUPFD_CLOEXEC: Int = 67

public const val F_GETFD: Int = 1

public const val F_SETFD: Int = 2

public const val F_GETFL: Int = 3

public const val F_SETFL: Int = 4

public const val F_PREALLOCATE: Int = 42

public const val F_RDADVISE: Int = 44

public const val F_RDAHEAD: Int = 45

public const val F_NOCACHE: Int = 48

public const val F_LOG2PHYS: Int = 49

public const val F_GETPATH: Int = 50

public const val F_FULLFSYNC: Int = 51

public const val F_FREEZE_FS: Int = 53

public const val F_THAW_FS: Int = 54

public const val F_GLOBAL_NOCACHE: Int = 55

public const val F_NODIRECT: Int = 62

public const val F_LOG2PHYS_EXT: Int = 65

public const val F_BARRIERFSYNC: Int = 85

public const val F_OFD_SETLK: Int = 90

public const val F_OFD_SETLKW: Int = 91

public const val F_OFD_GETLK: Int = 92

public const val F_PUNCHHOLE: Int = 99

public const val F_TRIM_ACTIVE_FILE: Int = 100

public const val F_SPECULATIVE_READ: Int = 101

public const val F_GETPATH_NOFIRMLINK: Int = 102

public const val F_TRANSFEREXTENTS: Int = 110

public const val F_ALLOCATECONTIG: UInt = 0x02u

public const val F_ALLOCATEALL: UInt = 0x04u

public const val F_ALLOCATEPERSIST: UInt = 0x08u

public const val F_PEOFPOSMODE: Int = 3

public const val F_VOLPOSMODE: Int = 4

public const val AT_FDCWD: Int = -2

public const val AT_EACCESS: Int = 0x0010

public const val AT_SYMLINK_NOFOLLOW: Int = 0x0020

public const val AT_SYMLINK_FOLLOW: Int = 0x0040

public const val AT_REMOVEDIR: Int = 0x0080

public const val TIOCMODG: ULong = 0x40047403uL

public const val TIOCMODS: ULong = 0x80047404uL

public const val TIOCM_LE: Int = 0x1

public const val TIOCM_DTR: Int = 0x2

public const val TIOCM_RTS: Int = 0x4

public const val TIOCM_ST: Int = 0x8

public const val TIOCM_SR: Int = 0x10

public const val TIOCM_CTS: Int = 0x20

public const val TIOCM_CAR: Int = 0x40

public const val TIOCM_CD: Int = 0x40

public const val TIOCM_RNG: Int = 0x80

public const val TIOCM_RI: Int = 0x80

public const val TIOCM_DSR: Int = 0x100

public const val TIOCEXCL: Int = 0x2000740d

public const val TIOCNXCL: Int = 0x2000740e

public const val TIOCFLUSH: ULong = 0x80047410uL

public const val TIOCGETD: ULong = 0x4004741auL

public const val TIOCSETD: ULong = 0x8004741buL

public const val TIOCIXON: UInt = 0x20007481u

public const val TIOCIXOFF: UInt = 0x20007480u

public const val TIOCSDTR: UInt = 0x20007479u

public const val TIOCCDTR: UInt = 0x20007478u

public const val TIOCGPGRP: ULong = 0x40047477uL

public const val TIOCSPGRP: ULong = 0x80047476uL

public const val TIOCOUTQ: ULong = 0x40047473uL

public const val TIOCSTI: ULong = 0x80017472uL

public const val TIOCNOTTY: UInt = 0x20007471u

public const val TIOCPKT: ULong = 0x80047470uL

public const val TIOCPKT_DATA: Int = 0x0

public const val TIOCPKT_FLUSHREAD: Int = 0x1

public const val TIOCPKT_FLUSHWRITE: Int = 0x2

public const val TIOCPKT_STOP: Int = 0x4

public const val TIOCPKT_START: Int = 0x8

public const val TIOCPKT_NOSTOP: Int = 0x10

public const val TIOCPKT_DOSTOP: Int = 0x20

public const val TIOCPKT_IOCTL: Int = 0x40

public const val TIOCSTOP: UInt = 0x2000746fu

public const val TIOCSTART: UInt = 0x2000746eu

public const val TIOCMSET: ULong = 0x8004746duL

public const val TIOCMBIS: ULong = 0x8004746cuL

public const val TIOCMBIC: ULong = 0x8004746buL

public const val TIOCMGET: ULong = 0x4004746auL

public const val TIOCREMOTE: ULong = 0x80047469uL

public const val TIOCGWINSZ: ULong = 0x40087468uL

public const val TIOCSWINSZ: ULong = 0x80087467uL

public const val TIOCUCNTL: ULong = 0x80047466uL

public const val TIOCSTAT: UInt = 0x20007465u

public const val TIOCSCONS: UInt = 0x20007463u

public const val TIOCCONS: ULong = 0x80047462uL

public const val TIOCSCTTY: UInt = 0x20007461u

public const val TIOCEXT: ULong = 0x80047460uL

public const val TIOCSIG: UInt = 0x2000745fu

public const val TIOCDRAIN: UInt = 0x2000745eu

public const val TIOCMSDTRWAIT: ULong = 0x8004745buL

public const val TIOCMGDTRWAIT: ULong = 0x4004745auL

public const val TIOCSDRAINWAIT: ULong = 0x80047457uL

public const val TIOCGDRAINWAIT: ULong = 0x40047456uL

public const val TIOCDSIMICROCODE: UInt = 0x20007455u

public const val TIOCPTYGRANT: UInt = 0x20007454u

public const val TIOCPTYGNAME: UInt = 0x40807453u

public const val TIOCPTYUNLK: UInt = 0x20007452u

public const val TIOCGETA: ULong = 0x40487413uL

public const val TIOCSETA: ULong = 0x80487414uL

public const val TIOCSETAW: ULong = 0x80487415uL

public const val TIOCSETAF: ULong = 0x80487416uL

public const val BIOCGRSIG: ULong = 0x40044272uL

public const val BIOCSRSIG: ULong = 0x80044273uL

public const val BIOCSDLT: ULong = 0x80044278uL

public const val BIOCGSEESENT: ULong = 0x40044276uL

public const val BIOCSSEESENT: ULong = 0x80044277uL

public const val BIOCGDLTLIST: ULong = 0xc00c4279uL

public const val FIODTYPE: ULong = 0x4004667auL

public const val B0: ULong = 0u

public const val B50: ULong = 50u

public const val B75: ULong = 75u

public const val B110: ULong = 110u

public const val B134: ULong = 134u

public const val B150: ULong = 150u

public const val B200: ULong = 200u

public const val B300: ULong = 300u

public const val B600: ULong = 600u

public const val B1200: ULong = 1200u

public const val B1800: ULong = 1800u

public const val B2400: ULong = 2400u

public const val B4800: ULong = 4800u

public const val B9600: ULong = 9600u

public const val B19200: ULong = 19200u

public const val B38400: ULong = 38400u

public const val B7200: ULong = 7200u

public const val B14400: ULong = 14400u

public const val B28800: ULong = 28800u

public const val B57600: ULong = 57600u

public const val B76800: ULong = 76800u

public const val B115200: ULong = 115200u

public const val B230400: ULong = 230400u

public const val EXTA: ULong = 19200u

public const val EXTB: ULong = 38400u

public const val SIGTRAP: Int = 5

public const val GLOB_APPEND: Int = 0x0001

public const val GLOB_DOOFFS: Int = 0x0002

public const val GLOB_ERR: Int = 0x0004

public const val GLOB_MARK: Int = 0x0008

public const val GLOB_NOCHECK: Int = 0x0010

public const val GLOB_NOSORT: Int = 0x0020

public const val GLOB_NOESCAPE: Int = 0x2000

public const val GLOB_NOSPACE: Int = -1

public const val GLOB_ABORTED: Int = -2

public const val GLOB_NOMATCH: Int = -3

public const val POSIX_MADV_NORMAL: Int = 0

public const val POSIX_MADV_RANDOM: Int = 1

public const val POSIX_MADV_SEQUENTIAL: Int = 2

public const val POSIX_MADV_WILLNEED: Int = 3

public const val POSIX_MADV_DONTNEED: Int = 4

public const val _SC_IOV_MAX: Int = 56

public const val _SC_GETGR_R_SIZE_MAX: Int = 70

public const val _SC_GETPW_R_SIZE_MAX: Int = 71

public const val _SC_LOGIN_NAME_MAX: Int = 73

public const val _SC_MQ_PRIO_MAX: Int = 75

public const val _SC_THREAD_ATTR_STACKADDR: Int = 82

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 83

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 85

public const val _SC_THREAD_KEYS_MAX: Int = 86

public const val _SC_THREAD_PRIO_INHERIT: Int = 87

public const val _SC_THREAD_PRIO_PROTECT: Int = 88

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 89

public const val _SC_THREAD_PROCESS_SHARED: Int = 90

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 91

public const val _SC_THREAD_STACK_MIN: Int = 93

public const val _SC_THREAD_THREADS_MAX: Int = 94

public const val _SC_THREADS: Int = 96

public const val _SC_TTY_NAME_MAX: Int = 101

public const val _SC_ATEXIT_MAX: Int = 107

public const val _SC_XOPEN_CRYPT: Int = 108

public const val _SC_XOPEN_ENH_I18N: Int = 109

public const val _SC_XOPEN_LEGACY: Int = 110

public const val _SC_XOPEN_REALTIME: Int = 111

public const val _SC_XOPEN_REALTIME_THREADS: Int = 112

public const val _SC_XOPEN_SHM: Int = 113

public const val _SC_XOPEN_UNIX: Int = 115

public const val _SC_XOPEN_VERSION: Int = 116

public const val _SC_XOPEN_XCU_VERSION: Int = 121

public const val _SC_PHYS_PAGES: Int = 200

public const val PTHREAD_STACK_MIN: ULong = 16384uL

public const val RLIMIT_CPU: Int = 0

public const val RLIMIT_FSIZE: Int = 1

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_STACK: Int = 3

public const val RLIMIT_CORE: Int = 4

public const val RLIMIT_AS: Int = 5

public const val RLIMIT_RSS: Int = RLIMIT_AS

public const val RLIMIT_MEMLOCK: Int = 6

public const val RLIMIT_NPROC: Int = 7

public const val RLIMIT_NOFILE: Int = 8

public const val RLIM_NLIMITS: Int = 9

public const val _RLIMIT_POSIX_FLAG: Int = 0x1000

public const val RLIM_INFINITY: ULong = 0x7fff_ffff_ffff_ffffuL

public const val RUSAGE_SELF: Int = 0

public const val RUSAGE_CHILDREN: Int = -1

public const val MADV_NORMAL: Int = 0

public const val MADV_RANDOM: Int = 1

public const val MADV_SEQUENTIAL: Int = 2

public const val MADV_WILLNEED: Int = 3

public const val MADV_DONTNEED: Int = 4

public const val MADV_FREE: Int = 5

public const val MADV_ZERO_WIRED_PAGES: Int = 6

public const val MADV_FREE_REUSABLE: Int = 7

public const val MADV_FREE_REUSE: Int = 8

public const val MADV_CAN_REUSE: Int = 9

public const val MADV_ZERO: Int = 11

public const val MINCORE_INCORE: Int = 0x1

public const val MINCORE_REFERENCED: Int = 0x2

public const val MINCORE_MODIFIED: Int = 0x4

public const val MINCORE_REFERENCED_OTHER: Int = 0x8

public const val MINCORE_MODIFIED_OTHER: Int = 0x10

public const val CTLIOCGINFO: ULong = 0xc0644e03uL

public const val IPPROTO_HOPOPTS: Int = 0

public const val IPPROTO_IGMP: Int = 2

public const val IPPROTO_GGP: Int = 3

public const val IPPROTO_IPIP: Int = 4

public const val IPPROTO_ST: Int = 7

public const val IPPROTO_EGP: Int = 8

public const val IPPROTO_PIGP: Int = 9

public const val IPPROTO_RCCMON: Int = 10

public const val IPPROTO_NVPII: Int = 11

public const val IPPROTO_PUP: Int = 12

public const val IPPROTO_ARGUS: Int = 13

public const val IPPROTO_EMCON: Int = 14

public const val IPPROTO_XNET: Int = 15

public const val IPPROTO_CHAOS: Int = 16

public const val IPPROTO_MUX: Int = 18

public const val IPPROTO_MEAS: Int = 19

public const val IPPROTO_HMP: Int = 20

public const val IPPROTO_PRM: Int = 21

public const val IPPROTO_IDP: Int = 22

public const val IPPROTO_TRUNK1: Int = 23

public const val IPPROTO_TRUNK2: Int = 24

public const val IPPROTO_LEAF1: Int = 25

public const val IPPROTO_LEAF2: Int = 26

public const val IPPROTO_RDP: Int = 27

public const val IPPROTO_IRTP: Int = 28

public const val IPPROTO_TP: Int = 29

public const val IPPROTO_BLT: Int = 30

public const val IPPROTO_NSP: Int = 31

public const val IPPROTO_INP: Int = 32

public const val IPPROTO_SEP: Int = 33

public const val IPPROTO_3PC: Int = 34

public const val IPPROTO_IDPR: Int = 35

public const val IPPROTO_XTP: Int = 36

public const val IPPROTO_DDP: Int = 37

public const val IPPROTO_CMTP: Int = 38

public const val IPPROTO_TPXX: Int = 39

public const val IPPROTO_IL: Int = 40

public const val IPPROTO_SDRP: Int = 42

public const val IPPROTO_ROUTING: Int = 43

public const val IPPROTO_FRAGMENT: Int = 44

public const val IPPROTO_IDRP: Int = 45

public const val IPPROTO_RSVP: Int = 46

public const val IPPROTO_GRE: Int = 47

public const val IPPROTO_MHRP: Int = 48

public const val IPPROTO_BHA: Int = 49

public const val IPPROTO_ESP: Int = 50

public const val IPPROTO_AH: Int = 51

public const val IPPROTO_INLSP: Int = 52

public const val IPPROTO_SWIPE: Int = 53

public const val IPPROTO_NHRP: Int = 54

public const val IPPROTO_NONE: Int = 59

public const val IPPROTO_DSTOPTS: Int = 60

public const val IPPROTO_AHIP: Int = 61

public const val IPPROTO_CFTP: Int = 62

public const val IPPROTO_HELLO: Int = 63

public const val IPPROTO_SATEXPAK: Int = 64

public const val IPPROTO_KRYPTOLAN: Int = 65

public const val IPPROTO_RVD: Int = 66

public const val IPPROTO_IPPC: Int = 67

public const val IPPROTO_ADFS: Int = 68

public const val IPPROTO_SATMON: Int = 69

public const val IPPROTO_VISA: Int = 70

public const val IPPROTO_IPCV: Int = 71

public const val IPPROTO_CPNX: Int = 72

public const val IPPROTO_CPHB: Int = 73

public const val IPPROTO_WSN: Int = 74

public const val IPPROTO_PVP: Int = 75

public const val IPPROTO_BRSATMON: Int = 76

public const val IPPROTO_ND: Int = 77

public const val IPPROTO_WBMON: Int = 78

public const val IPPROTO_WBEXPAK: Int = 79

public const val IPPROTO_EON: Int = 80

public const val IPPROTO_VMTP: Int = 81

public const val IPPROTO_SVMTP: Int = 82

public const val IPPROTO_VINES: Int = 83

public const val IPPROTO_TTP: Int = 84

public const val IPPROTO_IGP: Int = 85

public const val IPPROTO_DGP: Int = 86

public const val IPPROTO_TCF: Int = 87

public const val IPPROTO_IGRP: Int = 88

public const val IPPROTO_OSPFIGP: Int = 89

public const val IPPROTO_SRPC: Int = 90

public const val IPPROTO_LARP: Int = 91

public const val IPPROTO_MTP: Int = 92

public const val IPPROTO_AX25: Int = 93

public const val IPPROTO_IPEIP: Int = 94

public const val IPPROTO_MICP: Int = 95

public const val IPPROTO_SCCSP: Int = 96

public const val IPPROTO_ETHERIP: Int = 97

public const val IPPROTO_ENCAP: Int = 98

public const val IPPROTO_APES: Int = 99

public const val IPPROTO_GMTP: Int = 100

public const val IPPROTO_PIM: Int = 103

public const val IPPROTO_IPCOMP: Int = 108

public const val IPPROTO_PGM: Int = 113

public const val IPPROTO_SCTP: Int = 132

public const val IPPROTO_DIVERT: Int = 254

public const val IPPROTO_RAW: Int = 255

public const val IPPROTO_MAX: Int = 256

public const val IPPROTO_DONE: Int = 257

public const val AF_UNSPEC: Int = 0

public const val AF_LOCAL: Int = 1

public const val AF_UNIX: Int = AF_LOCAL

public const val AF_INET: Int = 2

public const val AF_IMPLINK: Int = 3

public const val AF_PUP: Int = 4

public const val AF_CHAOS: Int = 5

public const val AF_NS: Int = 6

public const val AF_ISO: Int = 7

public const val AF_OSI: Int = AF_ISO

public const val AF_ECMA: Int = 8

public const val AF_DATAKIT: Int = 9

public const val AF_CCITT: Int = 10

public const val AF_SNA: Int = 11

public const val AF_DECnet: Int = 12

public const val AF_DLI: Int = 13

public const val AF_LAT: Int = 14

public const val AF_HYLINK: Int = 15

public const val AF_APPLETALK: Int = 16

public const val AF_ROUTE: Int = 17

public const val AF_LINK: Int = 18

public const val pseudo_AF_XTP: Int = 19

public const val AF_COIP: Int = 20

public const val AF_CNT: Int = 21

public const val pseudo_AF_RTIP: Int = 22

public const val AF_IPX: Int = 23

public const val AF_SIP: Int = 24

public const val pseudo_AF_PIP: Int = 25

public const val AF_NDRV: Int = 27

public const val AF_ISDN: Int = 28

public const val AF_E164: Int = AF_ISDN

public const val pseudo_AF_KEY: Int = 29

public const val AF_INET6: Int = 30

public const val AF_NATM: Int = 31

public const val AF_SYSTEM: Int = 32

public const val AF_NETBIOS: Int = 33

public const val AF_PPP: Int = 34

public const val pseudo_AF_HDRCMPLT: Int = 35

public const val AF_IEEE80211: Int = 37

public const val AF_UTUN: Int = 38

public const val AF_VSOCK: Int = 40

public const val AF_SYS_CONTROL: Int = 2

public const val SYSPROTO_EVENT: Int = 1

public const val SYSPROTO_CONTROL: Int = 2

public const val PF_UNSPEC: Int = AF_UNSPEC

public const val PF_LOCAL: Int = AF_LOCAL

public const val PF_UNIX: Int = PF_LOCAL

public const val PF_INET: Int = AF_INET

public const val PF_IMPLINK: Int = AF_IMPLINK

public const val PF_PUP: Int = AF_PUP

public const val PF_CHAOS: Int = AF_CHAOS

public const val PF_NS: Int = AF_NS

public const val PF_ISO: Int = AF_ISO

public const val PF_OSI: Int = AF_ISO

public const val PF_ECMA: Int = AF_ECMA

public const val PF_DATAKIT: Int = AF_DATAKIT

public const val PF_CCITT: Int = AF_CCITT

public const val PF_SNA: Int = AF_SNA

public const val PF_DECnet: Int = AF_DECnet

public const val PF_DLI: Int = AF_DLI

public const val PF_LAT: Int = AF_LAT

public const val PF_HYLINK: Int = AF_HYLINK

public const val PF_APPLETALK: Int = AF_APPLETALK

public const val PF_ROUTE: Int = AF_ROUTE

public const val PF_LINK: Int = AF_LINK

public const val PF_XTP: Int = pseudo_AF_XTP

public const val PF_COIP: Int = AF_COIP

public const val PF_CNT: Int = AF_CNT

public const val PF_SIP: Int = AF_SIP

public const val PF_IPX: Int = AF_IPX

public const val PF_RTIP: Int = pseudo_AF_RTIP

public const val PF_PIP: Int = pseudo_AF_PIP

public const val PF_NDRV: Int = AF_NDRV

public const val PF_ISDN: Int = AF_ISDN

public const val PF_KEY: Int = pseudo_AF_KEY

public const val PF_INET6: Int = AF_INET6

public const val PF_NATM: Int = AF_NATM

public const val PF_SYSTEM: Int = AF_SYSTEM

public const val PF_NETBIOS: Int = AF_NETBIOS

public const val PF_PPP: Int = AF_PPP

public const val PF_VSOCK: Int = AF_VSOCK

public const val NET_RT_DUMP: Int = 1

public const val NET_RT_FLAGS: Int = 2

public const val NET_RT_IFLIST: Int = 3

public const val SOMAXCONN: Int = 128

public const val SOCK_MAXADDRLEN: Int = 255

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_RAW: Int = 3

public const val SOCK_RDM: Int = 4

public const val SOCK_SEQPACKET: Int = 5

public const val IP_TTL: Int = 4

public const val IP_HDRINCL: Int = 2

public const val IP_RECVDSTADDR: Int = 7

public const val IP_ADD_MEMBERSHIP: Int = 12

public const val IP_DROP_MEMBERSHIP: Int = 13

public const val IP_RECVIF: Int = 20

public const val IP_RECVTTL: Int = 24

public const val IP_BOUND_IF: Int = 25

public const val IP_PKTINFO: Int = 26

public const val IP_RECVTOS: Int = 27

public const val IP_DONTFRAG: Int = 28

public const val IPV6_JOIN_GROUP: Int = 12

public const val IPV6_LEAVE_GROUP: Int = 13

public const val IPV6_CHECKSUM: Int = 26

public const val IPV6_RECVTCLASS: Int = 35

public const val IPV6_TCLASS: Int = 36

public const val IPV6_RECVHOPLIMIT: Int = 37

public const val IPV6_PKTINFO: Int = 46

public const val IPV6_HOPLIMIT: Int = 47

public const val IPV6_RECVPKTINFO: Int = 61

public const val IP_ADD_SOURCE_MEMBERSHIP: Int = 70

public const val IP_DROP_SOURCE_MEMBERSHIP: Int = 71

public const val IP_BLOCK_SOURCE: Int = 72

public const val IP_UNBLOCK_SOURCE: Int = 73

public const val IPV6_BOUND_IF: Int = 125

public const val TCP_NOPUSH: Int = 4

public const val TCP_NOOPT: Int = 8

public const val TCP_KEEPALIVE: Int = 0x10

public const val TCP_KEEPINTVL: Int = 0x101

public const val TCP_KEEPCNT: Int = 0x102

public const val TCP_FASTOPEN: Int = 0x105

public const val TCP_CONNECTION_INFO: Int = 0x106

public const val SOL_LOCAL: Int = 0

public const val LOCAL_PEERCRED: Int = 0x001

public const val LOCAL_PEERPID: Int = 0x002

public const val LOCAL_PEEREPID: Int = 0x003

public const val LOCAL_PEERUUID: Int = 0x004

public const val LOCAL_PEEREUUID: Int = 0x005

public const val LOCAL_PEERTOKEN: Int = 0x006

public const val SOL_SOCKET: Int = 0xffff

public const val SO_DEBUG: Int = 0x01

public const val SO_ACCEPTCONN: Int = 0x0002

public const val SO_REUSEADDR: Int = 0x0004

public const val SO_KEEPALIVE: Int = 0x0008

public const val SO_DONTROUTE: Int = 0x0010

public const val SO_BROADCAST: Int = 0x0020

public const val SO_USELOOPBACK: Int = 0x0040

public const val SO_LINGER: Int = 0x0080

public const val SO_OOBINLINE: Int = 0x0100

public const val SO_REUSEPORT: Int = 0x0200

public const val SO_TIMESTAMP: Int = 0x0400

public const val SO_TIMESTAMP_MONOTONIC: Int = 0x0800

public const val SO_DONTTRUNC: Int = 0x2000

public const val SO_WANTMORE: Int = 0x4000

public const val SO_WANTOOBFLAG: Int = 0x8000

public const val SO_SNDBUF: Int = 0x1001

public const val SO_RCVBUF: Int = 0x1002

public const val SO_SNDLOWAT: Int = 0x1003

public const val SO_RCVLOWAT: Int = 0x1004

public const val SO_SNDTIMEO: Int = 0x1005

public const val SO_RCVTIMEO: Int = 0x1006

public const val SO_ERROR: Int = 0x1007

public const val SO_TYPE: Int = 0x1008

public const val SO_LABEL: Int = 0x1010

public const val SO_PEERLABEL: Int = 0x1011

public const val SO_NREAD: Int = 0x1020

public const val SO_NKE: Int = 0x1021

public const val SO_NOSIGPIPE: Int = 0x1022

public const val SO_NOADDRERR: Int = 0x1023

public const val SO_NWRITE: Int = 0x1024

public const val SO_REUSESHAREUID: Int = 0x1025

public const val SO_NOTIFYCONFLICT: Int = 0x1026

public const val SO_LINGER_SEC: Int = 0x1080

public const val SO_RANDOMPORT: Int = 0x1082

public const val SO_NP_EXTENSIONS: Int = 0x1083

public const val MSG_OOB: Int = 0x1

public const val MSG_PEEK: Int = 0x2

public const val MSG_DONTROUTE: Int = 0x4

public const val MSG_EOR: Int = 0x8

public const val MSG_TRUNC: Int = 0x10

public const val MSG_CTRUNC: Int = 0x20

public const val MSG_WAITALL: Int = 0x40

public const val MSG_DONTWAIT: Int = 0x80

public const val MSG_EOF: Int = 0x100

public const val MSG_FLUSH: Int = 0x400

public const val MSG_HOLD: Int = 0x800

public const val MSG_SEND: Int = 0x1000

public const val MSG_HAVEMORE: Int = 0x2000

public const val MSG_RCVMORE: Int = 0x4000

public const val MSG_NEEDSA: Int = 0x10000

public const val MSG_NOSIGNAL: Int = 0x80000

public const val SCM_TIMESTAMP: Int = 0x02

public const val SCM_CREDS: Int = 0x03

public const val IFF_UP: Int = 0x1

public const val IFF_BROADCAST: Int = 0x2

public const val IFF_DEBUG: Int = 0x4

public const val IFF_LOOPBACK: Int = 0x8

public const val IFF_POINTOPOINT: Int = 0x10

public const val IFF_NOTRAILERS: Int = 0x20

public const val IFF_RUNNING: Int = 0x40

public const val IFF_NOARP: Int = 0x80

public const val IFF_PROMISC: Int = 0x100

public const val IFF_ALLMULTI: Int = 0x200

public const val IFF_OACTIVE: Int = 0x400

public const val IFF_SIMPLEX: Int = 0x800

public const val IFF_LINK0: Int = 0x1000

public const val IFF_LINK1: Int = 0x2000

public const val IFF_LINK2: Int = 0x4000

public const val IFF_ALTPHYS: Int = IFF_LINK2

public const val IFF_MULTICAST: Int = 0x8000

public const val SCOPE6_ID_MAX: ULong = 16uL

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val SAE_ASSOCID_ANY: UInt = 0u

public const val SAE_ASSOCID_ALL: UInt = 0xffffffffu

public const val SAE_CONNID_ANY: UInt = 0u

public const val SAE_CONNID_ALL: UInt = 0xffffffffu

public const val CONNECT_RESUME_ON_READ_WRITE: UInt = 0x1u

public const val CONNECT_DATA_IDEMPOTENT: UInt = 0x2u

public const val CONNECT_DATA_AUTHENTICATED: UInt = 0x4u

public const val LOCK_SH: Int = 1

public const val LOCK_EX: Int = 2

public const val LOCK_NB: Int = 4

public const val LOCK_UN: Int = 8

public const val MAP_COPY: Int = 0x0002

public const val MAP_RENAME: Int = 0x0020

public const val MAP_NORESERVE: Int = 0x0040

public const val MAP_NOEXTEND: Int = 0x0100

public const val MAP_HASSEMAPHORE: Int = 0x0200

public const val MAP_NOCACHE: Int = 0x0400

public const val MAP_JIT: Int = 0x0800

public const val _SC_ARG_MAX: Int = 1

public const val _SC_CHILD_MAX: Int = 2

public const val _SC_CLK_TCK: Int = 3

public const val _SC_NGROUPS_MAX: Int = 4

public const val _SC_OPEN_MAX: Int = 5

public const val _SC_JOB_CONTROL: Int = 6

public const val _SC_SAVED_IDS: Int = 7

public const val _SC_VERSION: Int = 8

public const val _SC_BC_BASE_MAX: Int = 9

public const val _SC_BC_DIM_MAX: Int = 10

public const val _SC_BC_SCALE_MAX: Int = 11

public const val _SC_BC_STRING_MAX: Int = 12

public const val _SC_COLL_WEIGHTS_MAX: Int = 13

public const val _SC_EXPR_NEST_MAX: Int = 14

public const val _SC_LINE_MAX: Int = 15

public const val _SC_RE_DUP_MAX: Int = 16

public const val _SC_2_VERSION: Int = 17

public const val _SC_2_C_BIND: Int = 18

public const val _SC_2_C_DEV: Int = 19

public const val _SC_2_CHAR_TERM: Int = 20

public const val _SC_2_FORT_DEV: Int = 21

public const val _SC_2_FORT_RUN: Int = 22

public const val _SC_2_LOCALEDEF: Int = 23

public const val _SC_2_SW_DEV: Int = 24

public const val _SC_2_UPE: Int = 25

public const val _SC_STREAM_MAX: Int = 26

public const val _SC_TZNAME_MAX: Int = 27

public const val _SC_ASYNCHRONOUS_IO: Int = 28

public const val _SC_PAGESIZE: Int = 29

public const val _SC_MEMLOCK: Int = 30

public const val _SC_MEMLOCK_RANGE: Int = 31

public const val _SC_MEMORY_PROTECTION: Int = 32

public const val _SC_MESSAGE_PASSING: Int = 33

public const val _SC_PRIORITIZED_IO: Int = 34

public const val _SC_PRIORITY_SCHEDULING: Int = 35

public const val _SC_REALTIME_SIGNALS: Int = 36

public const val _SC_SEMAPHORES: Int = 37

public const val _SC_FSYNC: Int = 38

public const val _SC_SHARED_MEMORY_OBJECTS: Int = 39

public const val _SC_SYNCHRONIZED_IO: Int = 40

public const val _SC_TIMERS: Int = 41

public const val _SC_AIO_LISTIO_MAX: Int = 42

public const val _SC_AIO_MAX: Int = 43

public const val _SC_AIO_PRIO_DELTA_MAX: Int = 44

public const val _SC_DELAYTIMER_MAX: Int = 45

public const val _SC_MQ_OPEN_MAX: Int = 46

public const val _SC_MAPPED_FILES: Int = 47

public const val _SC_RTSIG_MAX: Int = 48

public const val _SC_SEM_NSEMS_MAX: Int = 49

public const val _SC_SEM_VALUE_MAX: Int = 50

public const val _SC_SIGQUEUE_MAX: Int = 51

public const val _SC_TIMER_MAX: Int = 52

public const val _SC_NPROCESSORS_CONF: Int = 57

public const val _SC_NPROCESSORS_ONLN: Int = 58

public const val _SC_2_PBS: Int = 59

public const val _SC_2_PBS_ACCOUNTING: Int = 60

public const val _SC_2_PBS_CHECKPOINT: Int = 61

public const val _SC_2_PBS_LOCATE: Int = 62

public const val _SC_2_PBS_MESSAGE: Int = 63

public const val _SC_2_PBS_TRACK: Int = 64

public const val _SC_ADVISORY_INFO: Int = 65

public const val _SC_BARRIERS: Int = 66

public const val _SC_CLOCK_SELECTION: Int = 67

public const val _SC_CPUTIME: Int = 68

public const val _SC_FILE_LOCKING: Int = 69

public const val _SC_HOST_NAME_MAX: Int = 72

public const val _SC_MONOTONIC_CLOCK: Int = 74

public const val _SC_READER_WRITER_LOCKS: Int = 76

public const val _SC_REGEXP: Int = 77

public const val _SC_SHELL: Int = 78

public const val _SC_SPAWN: Int = 79

public const val _SC_SPIN_LOCKS: Int = 80

public const val _SC_SPORADIC_SERVER: Int = 81

public const val _SC_THREAD_CPUTIME: Int = 84

public const val _SC_THREAD_SPORADIC_SERVER: Int = 92

public const val _SC_TIMEOUTS: Int = 95

public const val _SC_TRACE: Int = 97

public const val _SC_TRACE_EVENT_FILTER: Int = 98

public const val _SC_TRACE_INHERIT: Int = 99

public const val _SC_TRACE_LOG: Int = 100

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 102

public const val _SC_V6_ILP32_OFF32: Int = 103

public const val _SC_V6_ILP32_OFFBIG: Int = 104

public const val _SC_V6_LP64_OFF64: Int = 105

public const val _SC_V6_LPBIG_OFFBIG: Int = 106

public const val _SC_IPV6: Int = 118

public const val _SC_RAW_SOCKETS: Int = 119

public const val _SC_SYMLOOP_MAX: Int = 120

public const val _SC_PAGE_SIZE: Int = _SC_PAGESIZE

public const val _SC_XOPEN_STREAMS: Int = 114

public const val _SC_XBS5_ILP32_OFF32: Int = 122

public const val _SC_XBS5_ILP32_OFFBIG: Int = 123

public const val _SC_XBS5_LP64_OFF64: Int = 124

public const val _SC_XBS5_LPBIG_OFFBIG: Int = 125

public const val _SC_SS_REPL_MAX: Int = 126

public const val _SC_TRACE_EVENT_NAME_MAX: Int = 127

public const val _SC_TRACE_NAME_MAX: Int = 128

public const val _SC_TRACE_SYS_MAX: Int = 129

public const val _SC_TRACE_USER_EVENT_MAX: Int = 130

public const val _SC_PASS_MAX: Int = 131

public const val _CS_PATH: Int = 1

public const val _CS_DARWIN_USER_DIR: Int = 65536

public const val _CS_DARWIN_USER_TEMP_DIR: Int = 65537

public const val _CS_DARWIN_USER_CACHE_DIR: Int = 65538

public val OS_UNFAIR_LOCK_INIT: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS =
    io.github.kotlinmania.libc.unix.bsd.apple
        .OsUnfairLockS(osUnfairLockOpaque = 0u)

public const val OS_LOG_TYPE_DEFAULT: UByte = 0x00u

public const val OS_LOG_TYPE_INFO: UByte = 0x01u

public const val OS_LOG_TYPE_DEBUG: UByte = 0x02u

public const val OS_LOG_TYPE_ERROR: UByte = 0x10u

public const val OS_LOG_TYPE_FAULT: UByte = 0x11u

public const val OS_SIGNPOST_EVENT: UByte = 0x00u

public const val OS_SIGNPOST_INTERVAL_BEGIN: UByte = 0x01u

public const val OS_SIGNPOST_INTERVAL_END: UByte = 0x02u

public const val MINSIGSTKSZ: ULong = 32768uL

public const val SIGSTKSZ: ULong = 131072uL

public const val FD_SETSIZE: ULong = 1024uL

public const val ST_NOSUID: ULong = 2uL

public const val EVFILT_READ: Short = -1

public const val EVFILT_WRITE: Short = -2

public const val EVFILT_AIO: Short = -3

public const val EVFILT_VNODE: Short = -4

public const val EVFILT_PROC: Short = -5

public const val EVFILT_SIGNAL: Short = -6

public const val EVFILT_TIMER: Short = -7

public const val EVFILT_MACHPORT: Short = -8

public const val EVFILT_FS: Short = -9

public const val EVFILT_USER: Short = -10

public const val EVFILT_VM: Short = -12

public val EV_ADD: UShort = (0x1).toUShort()

public val EV_DELETE: UShort = (0x2).toUShort()

public val EV_ENABLE: UShort = (0x4).toUShort()

public val EV_DISABLE: UShort = (0x8).toUShort()

public val EV_ONESHOT: UShort = (0x10).toUShort()

public val EV_CLEAR: UShort = (0x20).toUShort()

public val EV_RECEIPT: UShort = (0x40).toUShort()

public val EV_DISPATCH: UShort = (0x80).toUShort()

public val EV_FLAG0: UShort = (0x1000).toUShort()

public val EV_POLL: UShort = (0x1000).toUShort()

public val EV_FLAG1: UShort = (0x2000).toUShort()

public val EV_OOBAND: UShort = (0x2000).toUShort()

public val EV_ERROR: UShort = (0x4000).toUShort()

public val EV_EOF: UShort = (0x8000).toUShort()

public val EV_SYSFLAGS: UShort = (0xf000).toUShort()

public const val NOTE_TRIGGER: UInt = 0x01000000u

public const val NOTE_FFNOP: UInt = 0x00000000u

public const val NOTE_FFAND: UInt = 0x40000000u

public const val NOTE_FFOR: UInt = 0x80000000u

public const val NOTE_FFCOPY: UInt = 0xc0000000u

public const val NOTE_FFCTRLMASK: UInt = 0xc0000000u

public const val NOTE_FFLAGSMASK: UInt = 0x00ffffffu

public const val NOTE_LOWAT: UInt = 0x00000001u

public const val NOTE_DELETE: UInt = 0x00000001u

public const val NOTE_WRITE: UInt = 0x00000002u

public const val NOTE_EXTEND: UInt = 0x00000004u

public const val NOTE_ATTRIB: UInt = 0x00000008u

public const val NOTE_LINK: UInt = 0x00000010u

public const val NOTE_RENAME: UInt = 0x00000020u

public const val NOTE_REVOKE: UInt = 0x00000040u

public const val NOTE_NONE: UInt = 0x00000080u

public const val NOTE_EXIT: UInt = 0x80000000u

public const val NOTE_FORK: UInt = 0x40000000u

public const val NOTE_EXEC: UInt = 0x20000000u

public const val NOTE_REAP: UInt = 0x10000000u

public const val NOTE_SIGNAL: UInt = 0x08000000u

public const val NOTE_EXITSTATUS: UInt = 0x04000000u

public const val NOTE_EXIT_DETAIL: UInt = 0x02000000u

public const val NOTE_PDATAMASK: UInt = 0x000fffffu

public const val NOTE_PCTRLMASK: UInt = 0xfff00000u

public const val NOTE_EXIT_REPARENTED: UInt = 0x00080000u

public const val NOTE_EXIT_DETAIL_MASK: UInt = 0x00070000u

public const val NOTE_EXIT_DECRYPTFAIL: UInt = 0x00010000u

public const val NOTE_EXIT_MEMORY: UInt = 0x00020000u

public const val NOTE_EXIT_CSERROR: UInt = 0x00040000u

public const val NOTE_VM_PRESSURE: UInt = 0x80000000u

public const val NOTE_VM_PRESSURE_TERMINATE: UInt = 0x40000000u

public const val NOTE_VM_PRESSURE_SUDDEN_TERMINATE: UInt = 0x20000000u

public const val NOTE_VM_ERROR: UInt = 0x10000000u

public const val NOTE_SECONDS: UInt = 0x00000001u

public const val NOTE_USECONDS: UInt = 0x00000002u

public const val NOTE_NSECONDS: UInt = 0x00000004u

public const val NOTE_ABSOLUTE: UInt = 0x00000008u

public const val NOTE_LEEWAY: UInt = 0x00000010u

public const val NOTE_CRITICAL: UInt = 0x00000020u

public const val NOTE_BACKGROUND: UInt = 0x00000040u

public const val NOTE_MACH_CONTINUOUS_TIME: UInt = 0x00000080u

public const val NOTE_MACHTIME: UInt = 0x00000100u

public const val NOTE_TRACK: UInt = 0x00000001u

public const val NOTE_TRACKERR: UInt = 0x00000002u

public const val NOTE_CHILD: UInt = 0x00000004u

public const val OCRNL: ULong = 0x00000010u

public const val ONOCR: ULong = 0x00000020u

public const val ONLRET: ULong = 0x00000040u

public const val OFILL: ULong = 0x00000080u

public const val NLDLY: ULong = 0x00000300u

public const val TABDLY: ULong = 0x00000c04u

public const val CRDLY: ULong = 0x00003000u

public const val FFDLY: ULong = 0x00004000u

public const val BSDLY: ULong = 0x00008000u

public const val VTDLY: ULong = 0x00010000u

public const val OFDEL: ULong = 0x00020000u

public const val NL0: ULong = 0x00000000u

public const val NL1: ULong = 0x00000100u

public const val TAB0: ULong = 0x00000000u

public const val TAB1: ULong = 0x00000400u

public const val TAB2: ULong = 0x00000800u

public const val CR0: ULong = 0x00000000u

public const val CR1: ULong = 0x00001000u

public const val CR2: ULong = 0x00002000u

public const val CR3: ULong = 0x00003000u

public const val FF0: ULong = 0x00000000u

public const val FF1: ULong = 0x00004000u

public const val BS0: ULong = 0x00000000u

public const val BS1: ULong = 0x00008000u

public const val TAB3: ULong = 0x00000004u

public const val VT0: ULong = 0x00000000u

public const val VT1: ULong = 0x00010000u

public const val IUTF8: ULong = 0x00004000u

public const val CRTSCTS: ULong = 0x00030000u

public const val NI_MAXHOST: UInt = 1025u

public const val NI_MAXSERV: UInt = 32u

public const val NI_NOFQDN: Int = 0x00000001

public const val NI_NUMERICHOST: Int = 0x00000002

public const val NI_NAMEREQD: Int = 0x00000004

public const val NI_NUMERICSERV: Int = 0x00000008

public const val NI_NUMERICSCOPE: Int = 0x00000100

public const val NI_DGRAM: Int = 0x00000010

public const val Q_GETQUOTA: Int = 0x300

public const val Q_SETQUOTA: Int = 0x400

public const val RENAME_SWAP: UInt = 0x00000002u

public const val RENAME_EXCL: UInt = 0x00000004u

public const val RTLD_LOCAL: Int = 0x4

public const val RTLD_FIRST: Int = 0x100

public const val RTLD_NODELETE: Int = 0x80

public const val RTLD_NOLOAD: Int = 0x10

public const val RTLD_GLOBAL: Int = 0x8

public const val _WSTOPPED: Int = 127

public val LOG_NETINFO: Int = 12 shl 3

public val LOG_REMOTEAUTH: Int = 13 shl 3

public val LOG_INSTALL: Int = 14 shl 3

public val LOG_RAS: Int = 15 shl 3

public val LOG_LAUNCHD: Int = 24 shl 3

public const val LOG_NFACILITIES: Int = 25

public const val CTLTYPE: Int = 0xf

public const val CTLTYPE_NODE: Int = 1

public const val CTLTYPE_INT: Int = 2

public const val CTLTYPE_STRING: Int = 3

public const val CTLTYPE_QUAD: Int = 4

public const val CTLTYPE_OPAQUE: Int = 5

public const val CTLTYPE_STRUCT: Int = CTLTYPE_OPAQUE

public const val CTLFLAG_RD: Int = 0x80000000.toInt()

public const val CTLFLAG_WR: Int = 0x40000000

public val CTLFLAG_RW: Int = CTLFLAG_RD or CTLFLAG_WR

public const val CTLFLAG_NOLOCK: Int = 0x20000000

public const val CTLFLAG_ANYBODY: Int = 0x10000000

public const val CTLFLAG_SECURE: Int = 0x08000000

public const val CTLFLAG_MASKED: Int = 0x04000000

public const val CTLFLAG_NOAUTO: Int = 0x02000000

public const val CTLFLAG_KERN: Int = 0x01000000

public const val CTLFLAG_LOCKED: Int = 0x00800000

public const val CTLFLAG_OID2: Int = 0x00400000

public const val CTL_UNSPEC: Int = 0

public const val CTL_KERN: Int = 1

public const val CTL_VM: Int = 2

public const val CTL_VFS: Int = 3

public const val CTL_NET: Int = 4

public const val CTL_DEBUG: Int = 5

public const val CTL_HW: Int = 6

public const val CTL_MACHDEP: Int = 7

public const val CTL_USER: Int = 8

public const val CTL_MAXID: Int = 9

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

public const val KERN_VNODE: Int = 13

public const val KERN_PROC: Int = 14

public const val KERN_FILE: Int = 15

public const val KERN_PROF: Int = 16

public const val KERN_POSIX1: Int = 17

public const val KERN_NGROUPS: Int = 18

public const val KERN_JOB_CONTROL: Int = 19

public const val KERN_SAVED_IDS: Int = 20

public const val KERN_BOOTTIME: Int = 21

public const val KERN_NISDOMAINNAME: Int = 22

public const val KERN_DOMAINNAME: Int = KERN_NISDOMAINNAME

public const val KERN_MAXPARTITIONS: Int = 23

public const val KERN_KDEBUG: Int = 24

public const val KERN_UPDATEINTERVAL: Int = 25

public const val KERN_OSRELDATE: Int = 26

public const val KERN_NTP_PLL: Int = 27

public const val KERN_BOOTFILE: Int = 28

public const val KERN_MAXFILESPERPROC: Int = 29

public const val KERN_MAXPROCPERUID: Int = 30

public const val KERN_DUMPDEV: Int = 31

public const val KERN_IPC: Int = 32

public const val KERN_DUMMY: Int = 33

public const val KERN_PS_STRINGS: Int = 34

public const val KERN_USRSTACK32: Int = 35

public const val KERN_LOGSIGEXIT: Int = 36

public const val KERN_SYMFILE: Int = 37

public const val KERN_PROCARGS: Int = 38

public const val KERN_NETBOOT: Int = 40

public const val KERN_SYSV: Int = 42

public const val KERN_AFFINITY: Int = 43

public const val KERN_TRANSLATE: Int = 44

public const val KERN_CLASSIC: Int = KERN_TRANSLATE

public const val KERN_EXEC: Int = 45

public const val KERN_CLASSICHANDLER: Int = KERN_EXEC

public const val KERN_AIOMAX: Int = 46

public const val KERN_AIOPROCMAX: Int = 47

public const val KERN_AIOTHREADS: Int = 48

public const val KERN_COREFILE: Int = 50

public const val KERN_COREDUMP: Int = 51

public const val KERN_SUGID_COREDUMP: Int = 52

public const val KERN_PROCDELAYTERM: Int = 53

public const val KERN_SHREG_PRIVATIZABLE: Int = 54

public const val KERN_LOW_PRI_WINDOW: Int = 56

public const val KERN_LOW_PRI_DELAY: Int = 57

public const val KERN_POSIX: Int = 58

public const val KERN_USRSTACK64: Int = 59

public const val KERN_NX_PROTECTION: Int = 60

public const val KERN_TFP: Int = 61

public const val KERN_PROCNAME: Int = 62

public const val KERN_THALTSTACK: Int = 63

public const val KERN_SPECULATIVE_READS: Int = 64

public const val KERN_OSVERSION: Int = 65

public const val KERN_SAFEBOOT: Int = 66

public const val KERN_RAGEVNODE: Int = 68

public const val KERN_TTY: Int = 69

public const val KERN_CHECKOPENEVT: Int = 70

public const val KERN_THREADNAME: Int = 71

public const val KERN_MAXID: Int = 72

public const val KERN_RAGE_PROC: Int = 1

public const val KERN_RAGE_THREAD: Int = 2

public const val KERN_UNRAGE_PROC: Int = 3

public const val KERN_UNRAGE_THREAD: Int = 4

public const val KERN_OPENEVT_PROC: Int = 1

public const val KERN_UNOPENEVT_PROC: Int = 2

public const val KERN_TFP_POLICY: Int = 1

public const val KERN_TFP_POLICY_DENY: Int = 0

public const val KERN_TFP_POLICY_DEFAULT: Int = 2

public const val KERN_KDEFLAGS: Int = 1

public const val KERN_KDDFLAGS: Int = 2

public const val KERN_KDENABLE: Int = 3

public const val KERN_KDSETBUF: Int = 4

public const val KERN_KDGETBUF: Int = 5

public const val KERN_KDSETUP: Int = 6

public const val KERN_KDREMOVE: Int = 7

public const val KERN_KDSETREG: Int = 8

public const val KERN_KDGETREG: Int = 9

public const val KERN_KDREADTR: Int = 10

public const val KERN_KDPIDTR: Int = 11

public const val KERN_KDTHRMAP: Int = 12

public const val KERN_KDPIDEX: Int = 14

public const val KERN_KDSETRTCDEC: Int = 15

public const val KERN_KDGETENTROPY: Int = 16

public const val KERN_KDWRITETR: Int = 17

public const val KERN_KDWRITEMAP: Int = 18

public const val KERN_KDENABLE_BG_TRACE: Int = 19

public const val KERN_KDDISABLE_BG_TRACE: Int = 20

public const val KERN_KDREADCURTHRMAP: Int = 21

public const val KERN_KDSET_TYPEFILTER: Int = 22

public const val KERN_KDBUFWAIT: Int = 23

public const val KERN_KDCPUMAP: Int = 24

public const val KERN_PROC_ALL: Int = 0

public const val KERN_PROC_PID: Int = 1

public const val KERN_PROC_PGRP: Int = 2

public const val KERN_PROC_SESSION: Int = 3

public const val KERN_PROC_TTY: Int = 4

public const val KERN_PROC_UID: Int = 5

public const val KERN_PROC_RUID: Int = 6

public const val KERN_PROC_LCID: Int = 7

public const val KERN_SUCCESS: Int = 0

public const val KERN_INVALID_ADDRESS: Int = 1

public const val KERN_PROTECTION_FAILURE: Int = 2

public const val KERN_NO_SPACE: Int = 3

public const val KERN_INVALID_ARGUMENT: Int = 4

public const val KERN_FAILURE: Int = 5

public const val KERN_RESOURCE_SHORTAGE: Int = 6

public const val KERN_NOT_RECEIVER: Int = 7

public const val KERN_NO_ACCESS: Int = 8

public const val KERN_MEMORY_FAILURE: Int = 9

public const val KERN_MEMORY_ERROR: Int = 10

public const val KERN_ALREADY_IN_SET: Int = 11

public const val KERN_NOT_IN_SET: Int = 12

public const val KERN_NAME_EXISTS: Int = 13

public const val KERN_ABORTED: Int = 14

public const val KERN_INVALID_NAME: Int = 15

public const val KERN_INVALID_TASK: Int = 16

public const val KERN_INVALID_RIGHT: Int = 17

public const val KERN_INVALID_VALUE: Int = 18

public const val KERN_UREFS_OVERFLOW: Int = 19

public const val KERN_INVALID_CAPABILITY: Int = 20

public const val KERN_RIGHT_EXISTS: Int = 21

public const val KERN_INVALID_HOST: Int = 22

public const val KERN_MEMORY_PRESENT: Int = 23

public const val KERN_MEMORY_DATA_MOVED: Int = 24

public const val KERN_MEMORY_RESTART_COPY: Int = 25

public const val KERN_INVALID_PROCESSOR_SET: Int = 26

public const val KERN_POLICY_LIMIT: Int = 27

public const val KERN_INVALID_POLICY: Int = 28

public const val KERN_INVALID_OBJECT: Int = 29

public const val KERN_ALREADY_WAITING: Int = 30

public const val KERN_DEFAULT_SET: Int = 31

public const val KERN_EXCEPTION_PROTECTED: Int = 32

public const val KERN_INVALID_LEDGER: Int = 33

public const val KERN_INVALID_MEMORY_CONTROL: Int = 34

public const val KERN_INVALID_SECURITY: Int = 35

public const val KERN_NOT_DEPRESSED: Int = 36

public const val KERN_TERMINATED: Int = 37

public const val KERN_LOCK_SET_DESTROYED: Int = 38

public const val KERN_LOCK_UNSTABLE: Int = 39

public const val KERN_LOCK_OWNED: Int = 40

public const val KERN_LOCK_OWNED_SELF: Int = 41

public const val KERN_SEMAPHORE_DESTROYED: Int = 42

public const val KERN_RPC_SERVER_TERMINATED: Int = 43

public const val KERN_RPC_TERMINATE_ORPHAN: Int = 44

public const val KERN_RPC_CONTINUE_ORPHAN: Int = 45

public const val KERN_NOT_SUPPORTED: Int = 46

public const val KERN_NODE_DOWN: Int = 47

public const val KERN_NOT_WAITING: Int = 48

public const val KERN_OPERATION_TIMED_OUT: Int = 49

public const val KERN_CODESIGN_ERROR: Int = 50

public const val KERN_POLICY_STATIC: Int = 51

public const val KERN_INSUFFICIENT_BUFFER_SIZE: Int = 52

public const val KIPC_MAXSOCKBUF: Int = 1

public const val KIPC_SOCKBUF_WASTE: Int = 2

public const val KIPC_SOMAXCONN: Int = 3

public const val KIPC_MAX_LINKHDR: Int = 4

public const val KIPC_MAX_PROTOHDR: Int = 5

public const val KIPC_MAX_HDR: Int = 6

public const val KIPC_MAX_DATALEN: Int = 7

public const val KIPC_MBSTAT: Int = 8

public const val KIPC_NMBCLUSTERS: Int = 9

public const val KIPC_SOQLIMITCOMPAT: Int = 10

public const val VM_METER: Int = 1

public const val VM_LOADAVG: Int = 2

public const val VM_MACHFACTOR: Int = 4

public const val VM_SWAPUSAGE: Int = 5

public const val VM_MAXID: Int = 6

public const val VM_PROT_NONE: Int = 0x00.toInt()

public const val VM_PROT_READ: Int = 0x01.toInt()

public const val VM_PROT_WRITE: Int = 0x02.toInt()

public const val VM_PROT_EXECUTE: Int = 0x04.toInt()

public const val MEMORY_OBJECT_NULL: UInt = 0u

public const val HW_MACHINE: Int = 1

public const val HW_MODEL: Int = 2

public const val HW_NCPU: Int = 3

public const val HW_BYTEORDER: Int = 4

public const val HW_PHYSMEM: Int = 5

public const val HW_USERMEM: Int = 6

public const val HW_PAGESIZE: Int = 7

public const val HW_DISKNAMES: Int = 8

public const val HW_DISKSTATS: Int = 9

public const val HW_EPOCH: Int = 10

public const val HW_FLOATINGPT: Int = 11

public const val HW_MACHINE_ARCH: Int = 12

public const val HW_VECTORUNIT: Int = 13

public const val HW_BUS_FREQ: Int = 14

public const val HW_CPU_FREQ: Int = 15

public const val HW_CACHELINE: Int = 16

public const val HW_L1ICACHESIZE: Int = 17

public const val HW_L1DCACHESIZE: Int = 18

public const val HW_L2SETTINGS: Int = 19

public const val HW_L2CACHESIZE: Int = 20

public const val HW_L3SETTINGS: Int = 21

public const val HW_L3CACHESIZE: Int = 22

public const val HW_TB_FREQ: Int = 23

public const val HW_MEMSIZE: Int = 24

public const val HW_AVAILCPU: Int = 25

public const val HW_TARGET: Int = 26

public const val HW_PRODUCT: Int = 27

public const val HW_MAXID: Int = 28

public const val USER_CS_PATH: Int = 1

public const val USER_BC_BASE_MAX: Int = 2

public const val USER_BC_DIM_MAX: Int = 3

public const val USER_BC_SCALE_MAX: Int = 4

public const val USER_BC_STRING_MAX: Int = 5

public const val USER_COLL_WEIGHTS_MAX: Int = 6

public const val USER_EXPR_NEST_MAX: Int = 7

public const val USER_LINE_MAX: Int = 8

public const val USER_RE_DUP_MAX: Int = 9

public const val USER_POSIX2_VERSION: Int = 10

public const val USER_POSIX2_C_BIND: Int = 11

public const val USER_POSIX2_C_DEV: Int = 12

public const val USER_POSIX2_CHAR_TERM: Int = 13

public const val USER_POSIX2_FORT_DEV: Int = 14

public const val USER_POSIX2_FORT_RUN: Int = 15

public const val USER_POSIX2_LOCALEDEF: Int = 16

public const val USER_POSIX2_SW_DEV: Int = 17

public const val USER_POSIX2_UPE: Int = 18

public const val USER_STREAM_MAX: Int = 19

public const val USER_TZNAME_MAX: Int = 20

public const val USER_MAXID: Int = 21

public const val CTL_DEBUG_NAME: Int = 0

public const val CTL_DEBUG_VALUE: Int = 1

public const val CTL_DEBUG_MAXID: Int = 20

public const val PRIO_DARWIN_THREAD: Int = 3

public const val PRIO_DARWIN_PROCESS: Int = 4

public const val PRIO_DARWIN_BG: Int = 0x1000

public const val PRIO_DARWIN_NONUI: Int = 0x1001

public const val AI_PASSIVE: Int = 0x00000001

public const val AI_CANONNAME: Int = 0x00000002

public const val AI_NUMERICHOST: Int = 0x00000004

public const val AI_NUMERICSERV: Int = 0x00001000

public const val AI_ALL: Int = 0x00000100

public const val AI_V4MAPPED_CFG: Int = 0x00000200

public const val AI_ADDRCONFIG: Int = 0x00000400

public const val AI_V4MAPPED: Int = 0x00000800

public val AI_DEFAULT: Int = AI_V4MAPPED_CFG or AI_ADDRCONFIG

public const val AI_UNUSABLE: Int = 0x10000000

public const val SIGEV_NONE: Int = 0

public const val SIGEV_SIGNAL: Int = 1

public const val SIGEV_THREAD: Int = 3

public const val AIO_CANCELED: Int = 2

public const val AIO_NOTCANCELED: Int = 4

public const val AIO_ALLDONE: Int = 1

public const val AIO_LISTIO_MAX: Int = 16

public const val LIO_NOP: Int = 0

public const val LIO_WRITE: Int = 2

public const val LIO_READ: Int = 1

public const val LIO_WAIT: Int = 2

public const val LIO_NOWAIT: Int = 1

public const val WEXITED: Int = 0x00000004

public const val WSTOPPED: Int = 0x00000008

public const val WCONTINUED: Int = 0x00000010

public const val WNOWAIT: Int = 0x00000020

public const val P_ALL: UInt = 0u

public const val P_PID: UInt = 1u

public const val P_PGID: UInt = 2u

public const val UTIME_OMIT: Long = -2

public const val UTIME_NOW: Long = -1

public const val XATTR_NOFOLLOW: Int = 0x0001

public const val XATTR_CREATE: Int = 0x0002

public const val XATTR_REPLACE: Int = 0x0004

public const val XATTR_NOSECURITY: Int = 0x0008

public const val XATTR_NODEFAULT: Int = 0x0010

public const val XATTR_SHOWCOMPRESSION: Int = 0x0020

public const val NET_RT_IFLIST2: Int = 0x0006

public const val RTF_DELCLONE: Int = 0x80

public const val RTF_CLONING: Int = 0x100

public const val RTF_XRESOLVE: Int = 0x200

public const val RTF_LLINFO: Int = 0x400

public const val RTF_NOIFREF: Int = 0x2000

public const val RTF_PRCLONING: Int = 0x10000

public const val RTF_WASCLONED: Int = 0x20000

public const val RTF_PROTO3: Int = 0x40000

public const val RTF_PINNED: Int = 0x100000

public const val RTF_LOCAL: Int = 0x200000

public const val RTF_BROADCAST: Int = 0x400000

public const val RTF_MULTICAST: Int = 0x800000

public const val RTF_IFSCOPE: Int = 0x1000000

public const val RTF_CONDEMNED: Int = 0x2000000

public const val RTF_IFREF: Int = 0x4000000

public const val RTF_PROXY: Int = 0x8000000

public const val RTF_ROUTER: Int = 0x10000000

public const val RTF_DEAD: Int = 0x20000000

public const val RTF_GLOBAL: Int = 0x40000000

public const val RTM_VERSION: Int = 5

public const val RTM_LOCK: Int = 0x8

public const val RTM_OLDADD: Int = 0x9

public const val RTM_OLDDEL: Int = 0xa

public const val RTM_RESOLVE: Int = 0xb

public const val RTM_NEWADDR: Int = 0xc

public const val RTM_DELADDR: Int = 0xd

public const val RTM_IFINFO: Int = 0xe

public const val RTM_NEWMADDR: Int = 0xf

public const val RTM_DELMADDR: Int = 0x10

public const val RTM_IFINFO2: Int = 0x12

public const val RTM_NEWMADDR2: Int = 0x13

public const val RTM_GET2: Int = 0x14

public const val RTV_MTU: Int = 0x1

public const val RTV_HOPCOUNT: Int = 0x2

public const val RTV_EXPIRE: Int = 0x4

public const val RTV_RPIPE: Int = 0x8

public const val RTV_SPIPE: Int = 0x10

public const val RTV_SSTHRESH: Int = 0x20

public const val RTV_RTT: Int = 0x40

public const val RTV_RTTVAR: Int = 0x80

public const val RTAX_MAX: Int = 8

public const val KERN_PROCARGS2: Int = 49

public const val PROC_PIDTASKALLINFO: Int = 2

public const val PROC_PIDTBSDINFO: Int = 3

public const val PROC_PIDTASKINFO: Int = 4

public const val PROC_PIDTHREADINFO: Int = 5

public const val PROC_PIDVNODEPATHINFO: Int = 9

public const val PROC_PIDPATHINFO_MAXSIZE: Int = 4096

public const val PROC_PIDLISTFDS: Int = 1

// PROC_PIDLISTFD_SIZE = size_of<ProcFdinfo>() (struct size; computed at the FFI boundary)
public const val PROX_FDTYPE_ATALK: Int = 0

public const val PROX_FDTYPE_VNODE: Int = 1

public const val PROX_FDTYPE_SOCKET: Int = 2

public const val PROX_FDTYPE_PSHM: Int = 3

public const val PROX_FDTYPE_PSEM: Int = 4

public const val PROX_FDTYPE_KQUEUE: Int = 5

public const val PROX_FDTYPE_PIPE: Int = 6

public const val PROX_FDTYPE_FSEVENTS: Int = 7

public const val PROX_FDTYPE_NETPOLICY: Int = 9

public const val PROX_FDTYPE_CHANNEL: Int = 10

public const val PROX_FDTYPE_NEXUS: Int = 11

public const val PROC_CSM_ALL: UInt = 0x0001u

public const val PROC_CSM_NOSMT: UInt = 0x0002u

public const val PROC_CSM_TECS: UInt = 0x0004u

public const val MAXCOMLEN: ULong = 16uL

public const val MAXTHREADNAMESIZE: ULong = 64uL

public const val XUCRED_VERSION: UInt = 0u

public const val LC_SEGMENT: UInt = 0x1u

public const val LC_SEGMENT_64: UInt = 0x19u

public const val MH_MAGIC: UInt = 0xfeedfaceu

public const val MH_MAGIC_64: UInt = 0xfeedfacfu

public const val UTUN_OPT_FLAGS: Int = 1

public const val UTUN_OPT_IFNAME: Int = 2

public const val DLT_NULL: UInt = 0u

public const val DLT_EN10MB: UInt = 1u

public const val DLT_EN3MB: UInt = 2u

public const val DLT_AX25: UInt = 3u

public const val DLT_PRONET: UInt = 4u

public const val DLT_CHAOS: UInt = 5u

public const val DLT_IEEE802: UInt = 6u

public const val DLT_ARCNET: UInt = 7u

public const val DLT_SLIP: UInt = 8u

public const val DLT_PPP: UInt = 9u

public const val DLT_FDDI: UInt = 10u

public const val DLT_ATM_RFC1483: UInt = 11u

public const val DLT_RAW: UInt = 12u

public const val DLT_LOOP: UInt = 108u

public const val BPF_ALIGNMENT: Int = 4

public const val MNT_NODEV: Int = 0x00000010

public const val MNT_UNION: Int = 0x00000020

public const val MNT_CPROTECT: Int = 0x00000080

public const val MNT_QUARANTINE: Int = 0x00000400

public const val MNT_LOCAL: Int = 0x00001000

public const val MNT_QUOTA: Int = 0x00002000

public const val MNT_ROOTFS: Int = 0x00004000

public const val MNT_DOVOLFS: Int = 0x00008000

public const val MNT_DONTBROWSE: Int = 0x00100000

public const val MNT_IGNORE_OWNERSHIP: Int = 0x00200000

public const val MNT_AUTOMOUNTED: Int = 0x00400000

public const val MNT_JOURNALED: Int = 0x00800000

public const val MNT_NOUSERXATTR: Int = 0x01000000

public const val MNT_DEFWRITE: Int = 0x02000000

public const val MNT_MULTILABEL: Int = 0x04000000

public const val MNT_NOATIME: Int = 0x10000000

public const val MNT_SNAPSHOT: Int = 0x40000000

public const val MNT_NOBLOCK: Int = 0x00020000

public const val POSIX_SPAWN_RESETIDS: Int = 0x0001

public const val POSIX_SPAWN_SETPGROUP: Int = 0x0002

public const val POSIX_SPAWN_SETSIGDEF: Int = 0x0004

public const val POSIX_SPAWN_SETSIGMASK: Int = 0x0008

public const val POSIX_SPAWN_SETEXEC: Int = 0x0040

public const val POSIX_SPAWN_START_SUSPENDED: Int = 0x0080

public const val POSIX_SPAWN_CLOEXEC_DEFAULT: Int = 0x4000

public const val IPC_CREAT: Int = 0x200

public const val IPC_EXCL: Int = 0x400

public const val IPC_NOWAIT: Int = 0x800

public const val IPC_PRIVATE: Int = 0

public const val IPC_RMID: Int = 0

public const val IPC_SET: Int = 1

public const val IPC_STAT: Int = 2

public const val IPC_R: Int = 0x100

public const val IPC_W: Int = 0x80

public const val IPC_M: Int = 0x1000

public const val SEM_UNDO: Int = 4096

public const val GETNCNT: Int = 3

public const val GETPID: Int = 4

public const val GETVAL: Int = 5

public const val GETALL: Int = 6

public const val GETZCNT: Int = 7

public const val SETVAL: Int = 8

public const val SETALL: Int = 9

public const val SHM_RDONLY: Int = 0x1000

public const val SHM_RND: Int = 0x2000

public const val SHMLBA: Int = 16 * 1024

public const val SHM_R: Int = IPC_R

public const val SHM_W: Int = IPC_W

public const val UF_SETTABLE: UInt = 0x0000ffffu

public const val UF_NODUMP: UInt = 0x00000001u

public const val UF_IMMUTABLE: UInt = 0x00000002u

public const val UF_APPEND: UInt = 0x00000004u

public const val UF_OPAQUE: UInt = 0x00000008u

public const val UF_COMPRESSED: UInt = 0x00000020u

public const val UF_TRACKED: UInt = 0x00000040u

public const val SF_SETTABLE: UInt = 0x3fff0000u

public const val SF_ARCHIVED: UInt = 0x00010000u

public const val SF_IMMUTABLE: UInt = 0x00020000u

public const val SF_APPEND: UInt = 0x00040000u

public const val UF_HIDDEN: UInt = 0x00008000u

public const val NTP_API: Int = 4

public const val MAXPHASE: Long = 500000000

public const val MAXFREQ: Long = 500000

public const val MINSEC: Int = 256

public const val MAXSEC: Int = 2048

public const val NANOSECOND: Long = 1000000000

public const val SCALE_PPM: Int = 65

public const val MAXTC: Int = 10

public const val MOD_OFFSET: UInt = 0x0001u

public const val MOD_FREQUENCY: UInt = 0x0002u

public const val MOD_MAXERROR: UInt = 0x0004u

public const val MOD_ESTERROR: UInt = 0x0008u

public const val MOD_STATUS: UInt = 0x0010u

public const val MOD_TIMECONST: UInt = 0x0020u

public const val MOD_PPSMAX: UInt = 0x0040u

public const val MOD_TAI: UInt = 0x0080u

public const val MOD_MICRO: UInt = 0x1000u

public const val MOD_NANO: UInt = 0x2000u

public const val MOD_CLKB: UInt = 0x4000u

public const val MOD_CLKA: UInt = 0x8000u

public const val STA_PLL: Int = 0x0001

public const val STA_PPSFREQ: Int = 0x0002

public const val STA_PPSTIME: Int = 0x0004

public const val STA_FLL: Int = 0x0008

public const val STA_INS: Int = 0x0010

public const val STA_DEL: Int = 0x0020

public const val STA_UNSYNC: Int = 0x0040

public const val STA_FREQHOLD: Int = 0x0080

public const val STA_PPSSIGNAL: Int = 0x0100

public const val STA_PPSJITTER: Int = 0x0200

public const val STA_PPSWANDER: Int = 0x0400

public const val STA_PPSERROR: Int = 0x0800

public const val STA_CLOCKERR: Int = 0x1000

public const val STA_NANO: Int = 0x2000

public const val STA_MODE: Int = 0x4000

public const val STA_CLK: Int = 0x8000

public val STA_RONLY: Int = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK

public const val TIME_OK: Int = 0

public const val TIME_INS: Int = 1

public const val TIME_DEL: Int = 2

public const val TIME_OOP: Int = 3

public const val TIME_WAIT: Int = 4

public const val TIME_ERROR: Int = 5

public const val MNT_WAIT: Int = 1

public const val MNT_NOWAIT: Int = 2

public const val THREAD_STANDARD_POLICY: Int = 1

public const val THREAD_STANDARD_POLICY_COUNT: Int = 0

public const val THREAD_EXTENDED_POLICY: Int = 1

public const val THREAD_TIME_CONSTRAINT_POLICY: Int = 2

public const val THREAD_PRECEDENCE_POLICY: Int = 3

public const val THREAD_AFFINITY_POLICY: Int = 4

public const val THREAD_AFFINITY_TAG_NULL: Int = 0

public const val THREAD_BACKGROUND_POLICY: Int = 5

public const val THREAD_BACKGROUND_POLICY_DARWIN_BG: Int = 0x1000

public const val THREAD_LATENCY_QOS_POLICY: Int = 7

public const val THREAD_THROUGHPUT_QOS_POLICY: Int = 8

public const val TH_STATE_RUNNING: Int = 1

public const val TH_STATE_STOPPED: Int = 2

public const val TH_STATE_WAITING: Int = 3

public const val TH_STATE_UNINTERRUPTIBLE: Int = 4

public const val TH_STATE_HALTED: Int = 5

public const val TH_FLAGS_SWAPPED: Int = 0x1

public const val TH_FLAGS_IDLE: Int = 0x2

public const val TH_FLAGS_GLOBAL_FORCED_IDLE: Int = 0x4

public const val THREAD_BASIC_INFO: Int = 3

public const val THREAD_IDENTIFIER_INFO: Int = 4

public const val THREAD_EXTENDED_INFO: Int = 5

public const val kCCSuccess: Int = 0

public const val kCCParamError: Int = -4300

public const val kCCBufferTooSmall: Int = -4301

public const val kCCMemoryFailure: Int = -4302

public const val kCCAlignmentError: Int = -4303

public const val kCCDecodeError: Int = -4304

public const val kCCUnimplemented: Int = -4305

public const val kCCOverflow: Int = -4306

public const val kCCRNGFailure: Int = -4307

public const val kCCUnspecifiedError: Int = -4308

public const val kCCCallSequenceError: Int = -4309

public const val kCCKeySizeError: Int = -4310

public const val kCCInvalidKey: Int = -4311

public const val HOST_LOAD_INFO: Int = 1

public const val HOST_VM_INFO: Int = 2

public const val HOST_CPU_LOAD_INFO: Int = 3

public const val HOST_VM_INFO64: Int = 4

public const val HOST_EXTMOD_INFO64: Int = 5

public const val HOST_EXPIRED_TASK_INFO: Int = 6

public const val VM_PAGE_QUERY_PAGE_PRESENT: Int = 0x1

public const val VM_PAGE_QUERY_PAGE_FICTITIOUS: Int = 0x2

public const val VM_PAGE_QUERY_PAGE_REF: Int = 0x4

public const val VM_PAGE_QUERY_PAGE_DIRTY: Int = 0x8

public const val VM_PAGE_QUERY_PAGE_PAGED_OUT: Int = 0x10

public const val VM_PAGE_QUERY_PAGE_COPIED: Int = 0x20

public const val VM_PAGE_QUERY_PAGE_SPECULATIVE: Int = 0x40

public const val VM_PAGE_QUERY_PAGE_EXTERNAL: Int = 0x80

public const val VM_PAGE_QUERY_PAGE_CS_VALIDATED: Int = 0x100

public const val VM_PAGE_QUERY_PAGE_CS_TAINTED: Int = 0x200

public const val VM_PAGE_QUERY_PAGE_CS_NX: Int = 0x400

public const val TASK_THREAD_TIMES_INFO: UInt = 3u

public const val HOST_CPU_LOAD_INFO_COUNT: UInt = 4u

public const val MACH_TASK_BASIC_INFO: UInt = 20u

public const val MACH_PORT_NULL: Int = 0

public const val RUSAGE_INFO_V0: Int = 0

public const val RUSAGE_INFO_V1: Int = 1

public const val RUSAGE_INFO_V2: Int = 2

public const val RUSAGE_INFO_V3: Int = 3

public const val RUSAGE_INFO_V4: Int = 4

public val COPYFILE_ACL: UInt = 1u shl 0

public val COPYFILE_STAT: UInt = 1u shl 1

public val COPYFILE_XATTR: UInt = 1u shl 2

public val COPYFILE_DATA: UInt = 1u shl 3

public val COPYFILE_SECURITY: UInt = COPYFILE_STAT or COPYFILE_ACL

public val COPYFILE_METADATA: UInt = COPYFILE_SECURITY or COPYFILE_XATTR

public val COPYFILE_RECURSIVE: UInt = 1u shl 15

public val COPYFILE_CHECK: UInt = 1u shl 16

public val COPYFILE_EXCL: UInt = 1u shl 17

public val COPYFILE_NOFOLLOW_SRC: UInt = 1u shl 18

public val COPYFILE_NOFOLLOW_DST: UInt = 1u shl 19

public val COPYFILE_MOVE: UInt = 1u shl 20

public val COPYFILE_UNLINK: UInt = 1u shl 21

public val COPYFILE_PACK: UInt = 1u shl 22

public val COPYFILE_UNPACK: UInt = 1u shl 23

public val COPYFILE_CLONE: UInt = 1u shl 24

public val COPYFILE_CLONE_FORCE: UInt = 1u shl 25

public val COPYFILE_RUN_IN_PLACE: UInt = 1u shl 26

public val COPYFILE_DATA_SPARSE: UInt = 1u shl 27

public val COPYFILE_PRESERVE_DST_TRACKED: UInt = 1u shl 28

public val COPYFILE_VERBOSE: UInt = 1u shl 30

public const val COPYFILE_RECURSE_ERROR: Int = 0

public const val COPYFILE_RECURSE_FILE: Int = 1

public const val COPYFILE_RECURSE_DIR: Int = 2

public const val COPYFILE_RECURSE_DIR_CLEANUP: Int = 3

public const val COPYFILE_COPY_DATA: Int = 4

public const val COPYFILE_COPY_XATTR: Int = 5

public const val COPYFILE_START: Int = 1

public const val COPYFILE_FINISH: Int = 2

public const val COPYFILE_ERR: Int = 3

public const val COPYFILE_PROGRESS: Int = 4

public const val COPYFILE_CONTINUE: Int = 0

public const val COPYFILE_SKIP: Int = 1

public const val COPYFILE_QUIT: Int = 2

public const val COPYFILE_STATE_SRC_FD: Int = 1

public const val COPYFILE_STATE_SRC_FILENAME: Int = 2

public const val COPYFILE_STATE_DST_FD: Int = 3

public const val COPYFILE_STATE_DST_FILENAME: Int = 4

public const val COPYFILE_STATE_QUARANTINE: Int = 5

public const val COPYFILE_STATE_STATUS_CB: Int = 6

public const val COPYFILE_STATE_STATUS_CTX: Int = 7

public const val COPYFILE_STATE_COPIED: Int = 8

public const val COPYFILE_STATE_XATTRNAME: Int = 9

public const val COPYFILE_STATE_WAS_CLONED: Int = 10

public const val COPYFILE_STATE_SRC_BSIZE: Int = 11

public const val COPYFILE_STATE_DST_BSIZE: Int = 12

public const val COPYFILE_STATE_BSIZE: Int = 13

public val ATTR_BIT_MAP_COUNT: UShort = (5).toUShort()

public const val FSOPT_NOFOLLOW: UInt = 0x1u

public const val FSOPT_NOFOLLOW_ANY: UInt = 0x800u

public const val FSOPT_REPORT_FULLSIZE: UInt = 0x4u

public const val FSOPT_PACK_INVAL_ATTRS: UInt = 0x8u

public const val FSOPT_ATTR_CMN_EXTENDED: UInt = 0x20u

public const val FSOPT_RETURN_REALDEV: UInt = 0x200u

public const val ATTR_CMN_NAME: UInt = 0x00000001u

public const val ATTR_CMN_DEVID: UInt = 0x00000002u

public const val ATTR_CMN_FSID: UInt = 0x00000004u

public const val ATTR_CMN_OBJTYPE: UInt = 0x00000008u

public const val ATTR_CMN_OBJTAG: UInt = 0x00000010u

public const val ATTR_CMN_OBJID: UInt = 0x00000020u

public const val ATTR_CMN_OBJPERMANENTID: UInt = 0x00000040u

public const val ATTR_CMN_PAROBJID: UInt = 0x00000080u

public const val ATTR_CMN_SCRIPT: UInt = 0x00000100u

public const val ATTR_CMN_CRTIME: UInt = 0x00000200u

public const val ATTR_CMN_MODTIME: UInt = 0x00000400u

public const val ATTR_CMN_CHGTIME: UInt = 0x00000800u

public const val ATTR_CMN_ACCTIME: UInt = 0x00001000u

public const val ATTR_CMN_BKUPTIME: UInt = 0x00002000u

public const val ATTR_CMN_FNDRINFO: UInt = 0x00004000u

public const val ATTR_CMN_OWNERID: UInt = 0x00008000u

public const val ATTR_CMN_GRPID: UInt = 0x00010000u

public const val ATTR_CMN_ACCESSMASK: UInt = 0x00020000u

public const val ATTR_CMN_FLAGS: UInt = 0x00040000u

public const val ATTR_CMN_GEN_COUNT: UInt = 0x00080000u

public const val ATTR_CMN_DOCUMENT_ID: UInt = 0x00100000u

public const val ATTR_CMN_USERACCESS: UInt = 0x00200000u

public const val ATTR_CMN_EXTENDED_SECURITY: UInt = 0x00400000u

public const val ATTR_CMN_UUID: UInt = 0x00800000u

public const val ATTR_CMN_GRPUUID: UInt = 0x01000000u

public const val ATTR_CMN_FILEID: UInt = 0x02000000u

public const val ATTR_CMN_PARENTID: UInt = 0x04000000u

public const val ATTR_CMN_FULLPATH: UInt = 0x08000000u

public const val ATTR_CMN_ADDEDTIME: UInt = 0x10000000u

public const val ATTR_CMN_DATA_PROTECT_FLAGS: UInt = 0x40000000u

public const val ATTR_CMN_RETURNED_ATTRS: UInt = 0x80000000u

public const val ATTR_VOL_FSTYPE: UInt = 0x00000001u

public const val ATTR_VOL_SIGNATURE: UInt = 0x00000002u

public const val ATTR_VOL_SIZE: UInt = 0x00000004u

public const val ATTR_VOL_SPACEFREE: UInt = 0x00000008u

public const val ATTR_VOL_SPACEAVAIL: UInt = 0x00000010u

public const val ATTR_VOL_MINALLOCATION: UInt = 0x00000020u

public const val ATTR_VOL_ALLOCATIONCLUMP: UInt = 0x00000040u

public const val ATTR_VOL_IOBLOCKSIZE: UInt = 0x00000080u

public const val ATTR_VOL_OBJCOUNT: UInt = 0x00000100u

public const val ATTR_VOL_FILECOUNT: UInt = 0x00000200u

public const val ATTR_VOL_DIRCOUNT: UInt = 0x00000400u

public const val ATTR_VOL_MAXOBJCOUNT: UInt = 0x00000800u

public const val ATTR_VOL_MOUNTPOINT: UInt = 0x00001000u

public const val ATTR_VOL_NAME: UInt = 0x00002000u

public const val ATTR_VOL_MOUNTFLAGS: UInt = 0x00004000u

public const val ATTR_VOL_MOUNTEDDEVICE: UInt = 0x00008000u

public const val ATTR_VOL_ENCODINGSUSED: UInt = 0x00010000u

public const val ATTR_VOL_CAPABILITIES: UInt = 0x00020000u

public const val ATTR_VOL_UUID: UInt = 0x00040000u

public const val ATTR_VOL_SPACEUSED: UInt = 0x00800000u

public const val ATTR_VOL_QUOTA_SIZE: UInt = 0x10000000u

public const val ATTR_VOL_RESERVED_SIZE: UInt = 0x20000000u

public const val ATTR_VOL_ATTRIBUTES: UInt = 0x40000000u

public const val ATTR_VOL_INFO: UInt = 0x80000000u

public const val ATTR_DIR_LINKCOUNT: UInt = 0x00000001u

public const val ATTR_DIR_ENTRYCOUNT: UInt = 0x00000002u

public const val ATTR_DIR_MOUNTSTATUS: UInt = 0x00000004u

public const val ATTR_DIR_ALLOCSIZE: UInt = 0x00000008u

public const val ATTR_DIR_IOBLOCKSIZE: UInt = 0x00000010u

public const val ATTR_DIR_DATALENGTH: UInt = 0x00000020u

public const val ATTR_FILE_LINKCOUNT: UInt = 0x00000001u

public const val ATTR_FILE_TOTALSIZE: UInt = 0x00000002u

public const val ATTR_FILE_ALLOCSIZE: UInt = 0x00000004u

public const val ATTR_FILE_IOBLOCKSIZE: UInt = 0x00000008u

public const val ATTR_FILE_DEVTYPE: UInt = 0x00000020u

public const val ATTR_FILE_FORKCOUNT: UInt = 0x00000080u

public const val ATTR_FILE_FORKLIST: UInt = 0x00000100u

public const val ATTR_FILE_DATALENGTH: UInt = 0x00000200u

public const val ATTR_FILE_DATAALLOCSIZE: UInt = 0x00000400u

public const val ATTR_FILE_RSRCLENGTH: UInt = 0x00001000u

public const val ATTR_FILE_RSRCALLOCSIZE: UInt = 0x00002000u

public const val ATTR_CMNEXT_RELPATH: UInt = 0x00000004u

public const val ATTR_CMNEXT_PRIVATESIZE: UInt = 0x00000008u

public const val ATTR_CMNEXT_LINKID: UInt = 0x00000010u

public const val ATTR_CMNEXT_NOFIRMLINKPATH: UInt = 0x00000020u

public const val ATTR_CMNEXT_REALDEVID: UInt = 0x00000040u

public const val ATTR_CMNEXT_REALFSID: UInt = 0x00000080u

public const val ATTR_CMNEXT_CLONEID: UInt = 0x00000100u

public const val ATTR_CMNEXT_EXT_FLAGS: UInt = 0x00000200u

public const val ATTR_CMNEXT_RECURSIVE_GENCOUNT: UInt = 0x00000400u

public const val DIR_MNTSTATUS_MNTPOINT: UInt = 0x1u

public const val VOL_CAPABILITIES_FORMAT: ULong = 0uL

public const val VOL_CAPABILITIES_INTERFACES: ULong = 1uL

public const val VOL_CAP_FMT_PERSISTENTOBJECTIDS: UInt = 0x00000001u

public const val VOL_CAP_FMT_SYMBOLICLINKS: UInt = 0x00000002u

public const val VOL_CAP_FMT_HARDLINKS: UInt = 0x00000004u

public const val VOL_CAP_FMT_JOURNAL: UInt = 0x00000008u

public const val VOL_CAP_FMT_JOURNAL_ACTIVE: UInt = 0x00000010u

public const val VOL_CAP_FMT_NO_ROOT_TIMES: UInt = 0x00000020u

public const val VOL_CAP_FMT_SPARSE_FILES: UInt = 0x00000040u

public const val VOL_CAP_FMT_ZERO_RUNS: UInt = 0x00000080u

public const val VOL_CAP_FMT_CASE_SENSITIVE: UInt = 0x00000100u

public const val VOL_CAP_FMT_CASE_PRESERVING: UInt = 0x00000200u

public const val VOL_CAP_FMT_FAST_STATFS: UInt = 0x00000400u

public const val VOL_CAP_FMT_2TB_FILESIZE: UInt = 0x00000800u

public const val VOL_CAP_FMT_OPENDENYMODES: UInt = 0x00001000u

public const val VOL_CAP_FMT_HIDDEN_FILES: UInt = 0x00002000u

public const val VOL_CAP_FMT_PATH_FROM_ID: UInt = 0x00004000u

public const val VOL_CAP_FMT_NO_VOLUME_SIZES: UInt = 0x00008000u

public const val VOL_CAP_FMT_DECMPFS_COMPRESSION: UInt = 0x00010000u

public const val VOL_CAP_FMT_64BIT_OBJECT_IDS: UInt = 0x00020000u

public const val VOL_CAP_FMT_DIR_HARDLINKS: UInt = 0x00040000u

public const val VOL_CAP_FMT_DOCUMENT_ID: UInt = 0x00080000u

public const val VOL_CAP_FMT_WRITE_GENERATION_COUNT: UInt = 0x00100000u

public const val VOL_CAP_FMT_NO_IMMUTABLE_FILES: UInt = 0x00200000u

public const val VOL_CAP_FMT_NO_PERMISSIONS: UInt = 0x00400000u

public const val VOL_CAP_FMT_SHARED_SPACE: UInt = 0x00800000u

public const val VOL_CAP_FMT_VOL_GROUPS: UInt = 0x01000000u

public const val VOL_CAP_FMT_SEALED: UInt = 0x02000000u

public const val VOL_CAP_INT_SEARCHFS: UInt = 0x00000001u

public const val VOL_CAP_INT_ATTRLIST: UInt = 0x00000002u

public const val VOL_CAP_INT_NFSEXPORT: UInt = 0x00000004u

public const val VOL_CAP_INT_READDIRATTR: UInt = 0x00000008u

public const val VOL_CAP_INT_EXCHANGEDATA: UInt = 0x00000010u

public const val VOL_CAP_INT_COPYFILE: UInt = 0x00000020u

public const val VOL_CAP_INT_ALLOCATE: UInt = 0x00000040u

public const val VOL_CAP_INT_VOL_RENAME: UInt = 0x00000080u

public const val VOL_CAP_INT_ADVLOCK: UInt = 0x00000100u

public const val VOL_CAP_INT_FLOCK: UInt = 0x00000200u

public const val VOL_CAP_INT_EXTENDED_SECURITY: UInt = 0x00000400u

public const val VOL_CAP_INT_USERACCESS: UInt = 0x00000800u

public const val VOL_CAP_INT_MANLOCK: UInt = 0x00001000u

public const val VOL_CAP_INT_NAMEDSTREAMS: UInt = 0x00002000u

public const val VOL_CAP_INT_EXTENDED_ATTR: UInt = 0x00004000u

public const val VOL_CAP_INT_CLONE: UInt = 0x00010000u

public const val VOL_CAP_INT_SNAPSHOT: UInt = 0x00020000u

public const val VOL_CAP_INT_RENAME_SWAP: UInt = 0x00040000u

public const val VOL_CAP_INT_RENAME_EXCL: UInt = 0x00080000u

public const val VOL_CAP_INT_RENAME_OPENFAIL: UInt = 0x00100000u

public const val OS_CLOCK_MACH_ABSOLUTE_TIME: UInt = 32u

public const val OS_SYNC_WAIT_ON_ADDRESS_NONE: UInt = 0x00000000u

public const val OS_SYNC_WAIT_ON_ADDRESS_SHARED: UInt = 0x00000001u

public const val OS_SYNC_WAKE_BY_ADDRESS_NONE: UInt = 0x00000000u

public const val OS_SYNC_WAKE_BY_ADDRESS_SHARED: UInt = 0x00000001u

public const val SIDL: UInt = 1u

public const val SRUN: UInt = 2u

public const val SSLEEP: UInt = 3u

public const val SSTOP: UInt = 4u

public const val SZOMB: UInt = 5u

public const val VMADDR_CID_ANY: UInt = 0xFFFFFFFFu

public const val VMADDR_CID_HYPERVISOR: UInt = 0u

public const val VMADDR_CID_RESERVED: UInt = 1u

public const val VMADDR_CID_HOST: UInt = 2u

public const val VMADDR_PORT_ANY: UInt = 0xFFFFFFFFu

public const val IFMIB_SYSTEM: Int = 1

public const val IFMIB_IFDATA: Int = 2

public const val IFMIB_IFALLDATA: Int = 3

public const val IFDATA_GENERAL: Int = 1

public const val IFDATA_LINKSPECIFIC: Int = 2

public const val IFDATA_ADDRS: Int = 3

public const val IFDATA_MULTIADDRS: Int = 4

public const val IFMIB_IFCOUNT: Int = 1

public const val NETLINK_GENERIC: Int = 0

public const val DOT3COMPLIANCE_STATS: Int = 1

public const val DOT3COMPLIANCE_COLLS: Int = 2

public const val MAX_KCTL_NAME: ULong = 96uL
