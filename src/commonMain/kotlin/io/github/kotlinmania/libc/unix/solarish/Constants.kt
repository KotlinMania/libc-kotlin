package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

internal const val _TIOC: Int = 0x5400

internal const val tIOC: Int = 0x7400

internal const val STR: Int = 0x5300

internal const val _IOC: ULong = 0x54000000uL

public const val LC_CTYPE: Int = 0

public const val LC_NUMERIC: Int = 1

public const val LC_TIME: Int = 2

public const val LC_COLLATE: Int = 3

public const val LC_MONETARY: Int = 4

public const val LC_MESSAGES: Int = 5

public const val LC_ALL: Int = 6

public val LC_CTYPE_MASK: Int = 1 shl LC_CTYPE

public val LC_NUMERIC_MASK: Int = 1 shl LC_NUMERIC

public val LC_TIME_MASK: Int = 1 shl LC_TIME

public val LC_COLLATE_MASK: Int = 1 shl LC_COLLATE

public val LC_MONETARY_MASK: Int = 1 shl LC_MONETARY

public val LC_MESSAGES_MASK: Int = 1 shl LC_MESSAGES

public val LC_ALL_MASK: Int = LC_CTYPE_MASK or LC_NUMERIC_MASK or LC_TIME_MASK or LC_COLLATE_MASK or LC_MONETARY_MASK or LC_MESSAGES_MASK

public const val DAY_1: Int = 1

public const val DAY_2: Int = 2

public const val DAY_3: Int = 3

public const val DAY_4: Int = 4

public const val DAY_5: Int = 5

public const val DAY_6: Int = 6

public const val DAY_7: Int = 7

public const val ABDAY_1: Int = 8

public const val ABDAY_2: Int = 9

public const val ABDAY_3: Int = 10

public const val ABDAY_4: Int = 11

public const val ABDAY_5: Int = 12

public const val ABDAY_6: Int = 13

public const val ABDAY_7: Int = 14

public const val MON_1: Int = 15

public const val MON_2: Int = 16

public const val MON_3: Int = 17

public const val MON_4: Int = 18

public const val MON_5: Int = 19

public const val MON_6: Int = 20

public const val MON_7: Int = 21

public const val MON_8: Int = 22

public const val MON_9: Int = 23

public const val MON_10: Int = 24

public const val MON_11: Int = 25

public const val MON_12: Int = 26

public const val ABMON_1: Int = 27

public const val ABMON_2: Int = 28

public const val ABMON_3: Int = 29

public const val ABMON_4: Int = 30

public const val ABMON_5: Int = 31

public const val ABMON_6: Int = 32

public const val ABMON_7: Int = 33

public const val ABMON_8: Int = 34

public const val ABMON_9: Int = 35

public const val ABMON_10: Int = 36

public const val ABMON_11: Int = 37

public const val ABMON_12: Int = 38

public const val RADIXCHAR: Int = 39

public const val THOUSEP: Int = 40

public const val YESSTR: Int = 41

public const val NOSTR: Int = 42

public const val CRNCYSTR: Int = 43

public const val D_T_FMT: Int = 44

public const val D_FMT: Int = 45

public const val T_FMT: Int = 46

public const val AM_STR: Int = 47

public const val PM_STR: Int = 48

public const val CODESET: Int = 49

public const val T_FMT_AMPM: Int = 50

public const val ERA: Int = 51

public const val ERA_D_FMT: Int = 52

public const val ERA_D_T_FMT: Int = 53

public const val ERA_T_FMT: Int = 54

public const val ALT_DIGITS: Int = 55

public const val YESEXPR: Int = 56

public const val NOEXPR: Int = 57

public const val _DATE_FMT: Int = 58

public const val MAXSTRMSG: Int = 58

public const val PATH_MAX: Int = 1024

public const val SA_ONSTACK: Int = 0x00000001

public const val SA_RESETHAND: Int = 0x00000002

public const val SA_RESTART: Int = 0x00000004

public const val SA_SIGINFO: Int = 0x00000008

public const val SA_NODEFER: Int = 0x00000010

public const val SA_NOCLDWAIT: Int = 0x00010000

public const val SA_NOCLDSTOP: Int = 0x00020000

public const val SS_ONSTACK: Int = 1

public const val SS_DISABLE: Int = 2

public const val FIOCLEX: Int = 0x20006601

public const val FIONCLEX: Int = 0x20006602

public const val FIONREAD: Int = 0x4004667f

public const val FIONBIO: Int = 0x8004667e.toInt()

public const val FIOASYNC: Int = 0x8004667d.toInt()

public const val FIOSETOWN: Int = 0x8004667c.toInt()

public const val FIOGETOWN: Int = 0x4004667b

public const val SIGCHLD: Int = 18

public const val SIGCLD: Int = SIGCHLD

public const val SIGBUS: Int = 10

public const val SIG_BLOCK: Int = 1

public const val SIG_UNBLOCK: Int = 2

public const val SIG_SETMASK: Int = 3

public const val AIO_CANCELED: Int = 0

public const val AIO_ALLDONE: Int = 1

public const val AIO_NOTCANCELED: Int = 2

public const val LIO_NOP: Int = 0

public const val LIO_READ: Int = 1

public const val LIO_WRITE: Int = 2

public const val LIO_NOWAIT: Int = 0

public const val LIO_WAIT: Int = 1

public const val SIGEV_NONE: Int = 1

public const val SIGEV_SIGNAL: Int = 2

public const val SIGEV_THREAD: Int = 3

public const val SIGEV_PORT: Int = 4

public const val CLD_EXITED: Int = 1

public const val CLD_KILLED: Int = 2

public const val CLD_DUMPED: Int = 3

public const val CLD_TRAPPED: Int = 4

public const val CLD_STOPPED: Int = 5

public const val CLD_CONTINUED: Int = 6

public const val IP_RECVDSTADDR: Int = 0x7

public const val IP_PKTINFO: Int = 0x1a

public const val IP_DONTFRAG: Int = 0x1b

public const val IP_SEC_OPT: Int = 0x22

public const val IPV6_UNICAST_HOPS: Int = 0x5

public const val IPV6_MULTICAST_IF: Int = 0x6

public const val IPV6_MULTICAST_HOPS: Int = 0x7

public const val IPV6_MULTICAST_LOOP: Int = 0x8

public const val IPV6_PKTINFO: Int = 0xb

public const val IPV6_RECVPKTINFO: Int = 0x12

public const val IPV6_RECVTCLASS: Int = 0x19

public const val IPV6_DONTFRAG: Int = 0x21

public const val IPV6_SEC_OPT: Int = 0x22

public const val IPV6_TCLASS: Int = 0x26

public const val IPV6_V6ONLY: Int = 0x27

public const val IPV6_BOUND_IF: Int = 0x41

public const val FD_SETSIZE: ULong = 65536uL

public const val ST_RDONLY: ULong = 1uL

public const val ST_NOSUID: ULong = 2uL

public const val NI_MAXHOST: UInt = 1025u

public const val NI_MAXSERV: UInt = 32u

public const val EXIT_FAILURE: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val RAND_MAX: Int = 32767

public const val EOF: Int = -1

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val SEEK_DATA: Int = 3

public const val SEEK_HOLE: Int = 4

public const val _IOFBF: Int = 0

public const val _IONBF: Int = 4

public const val _IOLBF: Int = 64

public const val BUFSIZ: UInt = 1024u

public const val FOPEN_MAX: UInt = 20u

public const val FILENAME_MAX: UInt = 1024u

public const val L_tmpnam: UInt = 25u

public const val TMP_MAX: UInt = 17576u

public const val PIPE_BUF: Int = 5120

public const val GRND_NONBLOCK: UInt = 0x0001u

public const val GRND_RANDOM: UInt = 0x0002u

public const val O_RDONLY: Int = 0

public const val O_WRONLY: Int = 1

public const val O_RDWR: Int = 2

public const val O_NDELAY: Int = 0x04

public const val O_APPEND: Int = 8

public const val O_DSYNC: Int = 0x40

public const val O_RSYNC: Int = 0x8000

public const val O_CREAT: Int = 256

public const val O_EXCL: Int = 1024

public const val O_NOCTTY: Int = 2048

public const val O_TRUNC: Int = 512

public const val O_NOFOLLOW: Int = 0x20000

public const val O_SEARCH: Int = 0x200000

public const val O_EXEC: Int = 0x400000

public const val O_CLOEXEC: Int = 0x800000

public const val O_ACCMODE: Int = 0x600003

public const val O_XATTR: Int = 0x4000

public const val O_DIRECTORY: Int = 0x1000000

public const val S_IFIFO: UInt = 4096u

public const val S_IFCHR: UInt = 8192u

public const val S_IFBLK: UInt = 24576u

public const val S_IFDIR: UInt = 16384u

public const val S_IFREG: UInt = 32768u

public const val S_IFLNK: UInt = 40960u

public const val S_IFSOCK: UInt = 49152u

public const val S_IFMT: UInt = 61440u

public const val S_IEXEC: UInt = 64u

public const val S_IWRITE: UInt = 128u

public const val S_IREAD: UInt = 256u

public const val S_IRWXU: UInt = 448u

public const val S_IXUSR: UInt = 64u

public const val S_IWUSR: UInt = 128u

public const val S_IRUSR: UInt = 256u

public const val S_IRWXG: UInt = 56u

public const val S_IXGRP: UInt = 8u

public const val S_IWGRP: UInt = 16u

public const val S_IRGRP: UInt = 32u

public const val S_IRWXO: UInt = 7u

public const val S_IXOTH: UInt = 1u

public const val S_IWOTH: UInt = 2u

public const val S_IROTH: UInt = 4u

public const val F_OK: Int = 0

public const val R_OK: Int = 4

public const val W_OK: Int = 2

public const val X_OK: Int = 1

public const val F_LOCK: Int = 1

public const val F_TEST: Int = 3

public const val F_TLOCK: Int = 2

public const val F_ULOCK: Int = 0

public const val F_SETLK: Int = 6

public const val F_SETLKW: Int = 7

public const val F_GETLK: Int = 14

public const val F_ALLOCSP: Int = 10

public const val F_FREESP: Int = 11

public const val F_BLOCKS: Int = 18

public const val F_BLKSIZE: Int = 19

public const val F_SHARE: Int = 40

public const val F_UNSHARE: Int = 41

public const val F_ISSTREAM: Int = 13

public const val F_PRIV: Int = 15

public const val F_NPRIV: Int = 16

public const val F_QUOTACTL: Int = 17

public const val F_GETOWN: Int = 23

public const val F_SETOWN: Int = 24

public const val F_REVOKE: Int = 25

public const val F_HASREMOTELOCKS: Int = 26

public const val SIGHUP: Int = 1

public const val SIGINT: Int = 2

public const val SIGQUIT: Int = 3

public const val SIGILL: Int = 4

public const val SIGABRT: Int = 6

public const val SIGEMT: Int = 7

public const val SIGFPE: Int = 8

public const val SIGKILL: Int = 9

public const val SIGSEGV: Int = 11

public const val SIGSYS: Int = 12

public const val SIGPIPE: Int = 13

public const val SIGALRM: Int = 14

public const val SIGTERM: Int = 15

public const val SIGUSR1: Int = 16

public const val SIGUSR2: Int = 17

public const val SIGPWR: Int = 19

public const val SIGWINCH: Int = 20

public const val SIGURG: Int = 21

public const val SIGPOLL: Int = 22

public const val SIGIO: Int = SIGPOLL

public const val SIGSTOP: Int = 23

public const val SIGTSTP: Int = 24

public const val SIGCONT: Int = 25

public const val SIGTTIN: Int = 26

public const val SIGTTOU: Int = 27

public const val SIGVTALRM: Int = 28

public const val SIGPROF: Int = 29

public const val SIGXCPU: Int = 30

public const val SIGXFSZ: Int = 31

public const val WNOHANG: Int = 0x40

public const val WUNTRACED: Int = 0x04

public const val WEXITED: Int = 0x01

public const val WTRAPPED: Int = 0x02

public const val WSTOPPED: Int = WUNTRACED

public const val WCONTINUED: Int = 0x08

public const val WNOWAIT: Int = 0x80

public const val AT_FDCWD: Int = 0xffd19553.toInt()

public const val AT_SYMLINK_NOFOLLOW: Int = 0x1000

public const val AT_SYMLINK_FOLLOW: Int = 0x2000

public const val AT_REMOVEDIR: Int = 0x1

public const val _AT_TRIGGER: Int = 0x2

public const val AT_EACCESS: Int = 0x4

public const val P_PID: UInt = 0u

public const val P_PPID: UInt = 1u

public const val P_PGID: UInt = 2u

public const val P_SID: UInt = 3u

public const val P_CID: UInt = 4u

public const val P_UID: UInt = 5u

public const val P_GID: UInt = 6u

public const val P_ALL: UInt = 7u

public const val P_LWPID: UInt = 8u

public const val P_TASKID: UInt = 9u

public const val P_PROJID: UInt = 10u

public const val P_POOLID: UInt = 11u

public const val P_ZONEID: UInt = 12u

public const val P_CTID: UInt = 13u

public const val P_CPUID: UInt = 14u

public const val P_PSETID: UInt = 15u

public const val PBIND_NONE: Int = -1

public const val PBIND_QUERY: Int = -2

public const val PS_NONE: Int = -1

public const val PS_QUERY: Int = -2

public const val PS_MYID: Int = -3

public const val PS_SOFT: Int = -4

public const val PS_HARD: Int = -5

public const val PS_QUERY_TYPE: Int = -6

public const val PS_PRIVATE: Int = 2

public const val UTIME_OMIT: Long = -2

public const val UTIME_NOW: Long = -1

public const val PROT_NONE: Int = 0

public const val PROT_READ: Int = 1

public const val PROT_WRITE: Int = 2

public const val PROT_EXEC: Int = 4

public const val MAP_SHARED: Int = 0x0001

public const val MAP_PRIVATE: Int = 0x0002

public const val MAP_FIXED: Int = 0x0010

public const val MAP_NORESERVE: Int = 0x40

public const val MAP_ANON: Int = 0x0100

public const val MAP_ANONYMOUS: Int = 0x0100

public const val MAP_RENAME: Int = 0x20

public const val MAP_ALIGN: Int = 0x200

public const val MAP_TEXT: Int = 0x400

public const val MAP_INITDATA: Int = 0x800

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val MS_SYNC: Int = 0x0004

public const val MS_ASYNC: Int = 0x0001

public const val MS_INVALIDATE: Int = 0x0002

public const val MMOBJ_PADDING: UInt = 0x10000u

public const val MMOBJ_INTERPRET: UInt = 0x20000u

public const val MR_PADDING: UInt = 0x1u

public const val MR_HDR_ELF: UInt = 0x2u

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

public const val ENOMSG: Int = 35

public const val EIDRM: Int = 36

public const val ECHRNG: Int = 37

public const val EL2NSYNC: Int = 38

public const val EL3HLT: Int = 39

public const val EL3RST: Int = 40

public const val ELNRNG: Int = 41

public const val EUNATCH: Int = 42

public const val ENOCSI: Int = 43

public const val EL2HLT: Int = 44

public const val EDEADLK: Int = 45

public const val ENOLCK: Int = 46

public const val ECANCELED: Int = 47

public const val ENOTSUP: Int = 48

public const val EDQUOT: Int = 49

public const val EBADE: Int = 50

public const val EBADR: Int = 51

public const val EXFULL: Int = 52

public const val ENOANO: Int = 53

public const val EBADRQC: Int = 54

public const val EBADSLT: Int = 55

public const val EDEADLOCK: Int = 56

public const val EBFONT: Int = 57

public const val EOWNERDEAD: Int = 58

public const val ENOTRECOVERABLE: Int = 59

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

public const val ELOCKUNMAPPED: Int = 72

public const val ENOTACTIVE: Int = 73

public const val EMULTIHOP: Int = 74

public const val EADI: Int = 75

public const val EBADMSG: Int = 77

public const val ENAMETOOLONG: Int = 78

public const val EOVERFLOW: Int = 79

public const val ENOTUNIQ: Int = 80

public const val EBADFD: Int = 81

public const val EREMCHG: Int = 82

public const val ELIBACC: Int = 83

public const val ELIBBAD: Int = 84

public const val ELIBSCN: Int = 85

public const val ELIBMAX: Int = 86

public const val ELIBEXEC: Int = 87

public const val EILSEQ: Int = 88

public const val ENOSYS: Int = 89

public const val ELOOP: Int = 90

public const val ERESTART: Int = 91

public const val ESTRPIPE: Int = 92

public const val ENOTEMPTY: Int = 93

public const val EUSERS: Int = 94

public const val ENOTSOCK: Int = 95

public const val EDESTADDRREQ: Int = 96

public const val EMSGSIZE: Int = 97

public const val EPROTOTYPE: Int = 98

public const val ENOPROTOOPT: Int = 99

public const val EPROTONOSUPPORT: Int = 120

public const val ESOCKTNOSUPPORT: Int = 121

public const val EOPNOTSUPP: Int = 122

public const val EPFNOSUPPORT: Int = 123

public const val EAFNOSUPPORT: Int = 124

public const val EADDRINUSE: Int = 125

public const val EADDRNOTAVAIL: Int = 126

public const val ENETDOWN: Int = 127

public const val ENETUNREACH: Int = 128

public const val ENETRESET: Int = 129

public const val ECONNABORTED: Int = 130

public const val ECONNRESET: Int = 131

public const val ENOBUFS: Int = 132

public const val EISCONN: Int = 133

public const val ENOTCONN: Int = 134

public const val ESHUTDOWN: Int = 143

public const val ETOOMANYREFS: Int = 144

public const val ETIMEDOUT: Int = 145

public const val ECONNREFUSED: Int = 146

public const val EHOSTDOWN: Int = 147

public const val EHOSTUNREACH: Int = 148

public const val EWOULDBLOCK: Int = EAGAIN

public const val EALREADY: Int = 149

public const val EINPROGRESS: Int = 150

public const val ESTALE: Int = 151

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

public const val EAI_OVERFLOW: Int = 12

public const val NI_NOFQDN: UInt = 0x0001u

public const val NI_NUMERICHOST: UInt = 0x0002u

public const val NI_NAMEREQD: UInt = 0x0004u

public const val NI_NUMERICSERV: UInt = 0x0008u

public const val NI_DGRAM: UInt = 0x0010u

public const val NI_WITHSCOPEID: UInt = 0x0020u

public const val NI_NUMERICSCOPE: UInt = 0x0040u

public const val F_DUPFD: Int = 0

public const val F_DUP2FD: Int = 9

public const val F_GETFD: Int = 1

public const val F_SETFD: Int = 2

public const val F_GETFL: Int = 3

public const val F_SETFL: Int = 4

public const val F_GETXFL: Int = 45

public const val SIGTRAP: Int = 5

public const val GLOB_APPEND: Int = 32

public const val GLOB_DOOFFS: Int = 16

public const val GLOB_ERR: Int = 1

public const val GLOB_MARK: Int = 2

public const val GLOB_NOCHECK: Int = 8

public const val GLOB_NOSORT: Int = 4

public const val GLOB_NOESCAPE: Int = 64

public const val GLOB_NOSPACE: Int = -2

public const val GLOB_ABORTED: Int = -1

public const val GLOB_NOMATCH: Int = -3

public const val POLLIN: Short = 0x1

public const val POLLPRI: Short = 0x2

public const val POLLOUT: Short = 0x4

public const val POLLERR: Short = 0x8

public const val POLLHUP: Short = 0x10

public const val POLLNVAL: Short = 0x20

public const val POLLNORM: Short = 0x0040

public const val POLLRDNORM: Short = 0x0040

public const val POLLWRNORM: Short = 0x4

public const val POLLRDBAND: Short = 0x0080

public const val POLLWRBAND: Short = 0x0100

public const val POSIX_MADV_NORMAL: Int = 0

public const val POSIX_MADV_RANDOM: Int = 1

public const val POSIX_MADV_SEQUENTIAL: Int = 2

public const val POSIX_MADV_WILLNEED: Int = 3

public const val POSIX_MADV_DONTNEED: Int = 4

public const val POSIX_SPAWN_RESETIDS: Short = 0x1

public const val POSIX_SPAWN_SETPGROUP: Short = 0x2

public const val POSIX_SPAWN_SETSIGDEF: Short = 0x4

public const val POSIX_SPAWN_SETSIGMASK: Short = 0x8

public const val POSIX_SPAWN_SETSCHEDPARAM: Short = 0x10

public const val POSIX_SPAWN_SETSCHEDULER: Short = 0x20

public const val POSIX_SPAWN_SETSIGIGN_NP: Short = 0x800

public const val POSIX_SPAWN_NOSIGCHLD_NP: Short = 0x1000

public const val POSIX_SPAWN_WAITPID_NP: Short = 0x2000

public const val POSIX_SPAWN_NOEXECERR_NP: Short = 0x4000

public const val PTHREAD_CREATE_JOINABLE: Int = 0

public const val PTHREAD_CREATE_DETACHED: Int = 0x40

public const val PTHREAD_PROCESS_SHARED: Int = 1

public val PTHREAD_PROCESS_PRIVATE: UShort = (0).toUShort()

public const val PTHREAD_STACK_MIN: ULong = 4096uL

public const val SIGSTKSZ: ULong = 8192uL

public const val CLOCK_REALTIME: Int = 3

public const val CLOCK_MONOTONIC: Int = 4

public const val TIMER_RELTIME: Int = 0

public const val TIMER_ABSTIME: Int = 1

public const val RLIMIT_CPU: Int = 0

public const val RLIMIT_FSIZE: Int = 1

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_STACK: Int = 3

public const val RLIMIT_CORE: Int = 4

public const val RLIMIT_NOFILE: Int = 5

public const val RLIMIT_VMEM: Int = 6

public const val RLIMIT_AS: Int = RLIMIT_VMEM

public const val RLIM_NLIMITS: ULong = 7uL

public const val RLIM_INFINITY: ULong = 0xfffffffffffffffduL

public const val RUSAGE_SELF: Int = 0

public const val RUSAGE_CHILDREN: Int = -1

public const val MADV_NORMAL: Int = 0

public const val MADV_RANDOM: Int = 1

public const val MADV_SEQUENTIAL: Int = 2

public const val MADV_WILLNEED: Int = 3

public const val MADV_DONTNEED: Int = 4

public const val MADV_FREE: Int = 5

public const val MADV_ACCESS_DEFAULT: Int = 6

public const val MADV_ACCESS_LWP: Int = 7

public const val MADV_ACCESS_MANY: Int = 8

public const val AF_UNSPEC: Int = 0

public const val AF_UNIX: Int = 1

public const val AF_INET: Int = 2

public const val AF_IMPLINK: Int = 3

public const val AF_PUP: Int = 4

public const val AF_CHAOS: Int = 5

public const val AF_NS: Int = 6

public const val AF_NBS: Int = 7

public const val AF_ECMA: Int = 8

public const val AF_DATAKIT: Int = 9

public const val AF_CCITT: Int = 10

public const val AF_SNA: Int = 11

public const val AF_DECnet: Int = 12

public const val AF_DLI: Int = 13

public const val AF_LAT: Int = 14

public const val AF_HYLINK: Int = 15

public const val AF_APPLETALK: Int = 16

public const val AF_NIT: Int = 17

public const val AF_802: Int = 18

public const val AF_OSI: Int = 19

public const val AF_X25: Int = 20

public const val AF_OSINET: Int = 21

public const val AF_GOSIP: Int = 22

public const val AF_IPX: Int = 23

public const val AF_ROUTE: Int = 24

public const val AF_LINK: Int = 25

public const val AF_INET6: Int = 26

public const val AF_KEY: Int = 27

public const val AF_POLICY: Int = 29

public const val AF_INET_OFFLOAD: Int = 30

public const val AF_TRILL: Int = 31

public const val AF_PACKET: Int = 32

public const val PF_UNSPEC: Int = AF_UNSPEC

public const val PF_UNIX: Int = AF_UNIX

public const val PF_LOCAL: Int = PF_UNIX

public const val PF_FILE: Int = PF_UNIX

public const val PF_INET: Int = AF_INET

public const val PF_IMPLINK: Int = AF_IMPLINK

public const val PF_PUP: Int = AF_PUP

public const val PF_CHAOS: Int = AF_CHAOS

public const val PF_NS: Int = AF_NS

public const val PF_NBS: Int = AF_NBS

public const val PF_ECMA: Int = AF_ECMA

public const val PF_DATAKIT: Int = AF_DATAKIT

public const val PF_CCITT: Int = AF_CCITT

public const val PF_SNA: Int = AF_SNA

public const val PF_DECnet: Int = AF_DECnet

public const val PF_DLI: Int = AF_DLI

public const val PF_LAT: Int = AF_LAT

public const val PF_HYLINK: Int = AF_HYLINK

public const val PF_APPLETALK: Int = AF_APPLETALK

public const val PF_NIT: Int = AF_NIT

public const val PF_802: Int = AF_802

public const val PF_OSI: Int = AF_OSI

public const val PF_X25: Int = AF_X25

public const val PF_OSINET: Int = AF_OSINET

public const val PF_GOSIP: Int = AF_GOSIP

public const val PF_IPX: Int = AF_IPX

public const val PF_ROUTE: Int = AF_ROUTE

public const val PF_LINK: Int = AF_LINK

public const val PF_INET6: Int = AF_INET6

public const val PF_KEY: Int = AF_KEY

public const val PF_POLICY: Int = AF_POLICY

public const val PF_INET_OFFLOAD: Int = AF_INET_OFFLOAD

public const val PF_TRILL: Int = AF_TRILL

public const val PF_PACKET: Int = AF_PACKET

public const val SOCK_DGRAM: Int = 1

public const val SOCK_STREAM: Int = 2

public const val SOCK_RAW: Int = 4

public const val SOCK_RDM: Int = 5

public const val SOCK_SEQPACKET: Int = 6

public const val IP_MULTICAST_IF: Int = 16

public const val IP_MULTICAST_TTL: Int = 17

public const val IP_MULTICAST_LOOP: Int = 18

public const val IP_HDRINCL: Int = 2

public const val IP_TOS: Int = 3

public const val IP_TTL: Int = 4

public const val IP_ADD_MEMBERSHIP: Int = 19

public const val IP_DROP_MEMBERSHIP: Int = 20

public const val IPV6_JOIN_GROUP: Int = 9

public const val IPV6_LEAVE_GROUP: Int = 10

public const val IP_ADD_SOURCE_MEMBERSHIP: Int = 23

public const val IP_DROP_SOURCE_MEMBERSHIP: Int = 24

public const val IP_BLOCK_SOURCE: Int = 21

public const val IP_UNBLOCK_SOURCE: Int = 22

public const val IP_BOUND_IF: Int = 0x41

public const val TCP_NODELAY: Int = 0x1

public const val TCP_MAXSEG: Int = 0x2

public const val TCP_KEEPALIVE: Int = 0x8

public const val TCP_NOTIFY_THRESHOLD: Int = 0x10

public const val TCP_ABORT_THRESHOLD: Int = 0x11

public const val TCP_CONN_NOTIFY_THRESHOLD: Int = 0x12

public const val TCP_CONN_ABORT_THRESHOLD: Int = 0x13

public const val TCP_RECVDSTADDR: Int = 0x14

public const val TCP_INIT_CWND: Int = 0x15

public const val TCP_KEEPALIVE_THRESHOLD: Int = 0x16

public const val TCP_KEEPALIVE_ABORT_THRESHOLD: Int = 0x17

public const val TCP_CORK: Int = 0x18

public const val TCP_RTO_INITIAL: Int = 0x19

public const val TCP_RTO_MIN: Int = 0x1a

public const val TCP_RTO_MAX: Int = 0x1b

public const val TCP_LINGER2: Int = 0x1c

public const val UDP_NAT_T_ENDPOINT: Int = 0x0103

public const val SOMAXCONN: Int = 128

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

public const val SO_SNDBUF: Int = 0x1001

public const val SO_RCVBUF: Int = 0x1002

public const val SO_SNDLOWAT: Int = 0x1003

public const val SO_RCVLOWAT: Int = 0x1004

public const val SO_SNDTIMEO: Int = 0x1005

public const val SO_RCVTIMEO: Int = 0x1006

public const val SO_ERROR: Int = 0x1007

public const val SO_TYPE: Int = 0x1008

public const val SO_PROTOTYPE: Int = 0x1009

public const val SO_DOMAIN: Int = 0x100c

public const val SO_TIMESTAMP: Int = 0x1013

public const val SO_EXCLBIND: Int = 0x1015

public const val SCM_RIGHTS: Int = 0x1010

public const val SCM_UCRED: Int = 0x1012

public const val SCM_TIMESTAMP: Int = SO_TIMESTAMP

public const val MSG_OOB: Int = 0x1

public const val MSG_PEEK: Int = 0x2

public const val MSG_DONTROUTE: Int = 0x4

public const val MSG_EOR: Int = 0x8

public const val MSG_CTRUNC: Int = 0x10

public const val MSG_TRUNC: Int = 0x20

public const val MSG_WAITALL: Int = 0x40

public const val MSG_DONTWAIT: Int = 0x80

public const val MSG_NOTIFICATION: Int = 0x100

public const val MSG_NOSIGNAL: Int = 0x200

public const val MSG_DUPCTRL: Int = 0x800

public const val MSG_XPG4_2: Int = 0x8000

public const val MSG_MAXIOVLEN: Int = 16

public const val IF_NAMESIZE: ULong = 32uL

public const val IFNAMSIZ: ULong = 16uL

public const val IFF_UP: Int = 0x0000000001

public const val IFF_BROADCAST: Int = 0x0000000002

public const val IFF_DEBUG: Int = 0x0000000004

public const val IFF_LOOPBACK: Int = 0x0000000008

public const val IFF_POINTOPOINT: Int = 0x0000000010

public const val IFF_NOTRAILERS: Int = 0x0000000020

public const val IFF_RUNNING: Int = 0x0000000040

public const val IFF_NOARP: Int = 0x0000000080

public const val IFF_PROMISC: Int = 0x0000000100

public const val IFF_ALLMULTI: Int = 0x0000000200

public const val IFF_INTELLIGENT: Int = 0x0000000400

public const val IFF_MULTICAST: Int = 0x0000000800

public const val IFF_MULTI_BCAST: Int = 0x0000001000

public const val IFF_UNNUMBERED: Int = 0x0000002000

public const val IFF_DHCPRUNNING: Int = 0x0000004000

public const val IFF_PRIVATE: Int = 0x0000008000

public const val IFF_NOXMIT: Int = 0x0000010000

public const val IFF_NOLOCAL: Int = 0x0000020000

public const val IFF_DEPRECATED: Int = 0x0000040000

public const val IFF_ADDRCONF: Int = 0x0000080000

public const val IFF_ROUTER: Int = 0x0000100000

public const val IFF_NONUD: Int = 0x0000200000

public const val IFF_ANYCAST: Int = 0x0000400000

public const val IFF_NORTEXCH: Int = 0x0000800000

public const val IFF_IPV4: Int = 0x0001000000

public const val IFF_IPV6: Int = 0x0002000000

public const val IFF_NOFAILOVER: Int = 0x0008000000

public const val IFF_FAILED: Int = 0x0010000000

public const val IFF_STANDBY: Int = 0x0020000000

public const val IFF_INACTIVE: Int = 0x0040000000

public const val IFF_OFFLINE: Int = 0x0080000000.toInt()

public const val IFF_COS_ENABLED: Long = 0x0200000000

public const val IFF_PREFERRED: Long = 0x0400000000

public const val IFF_TEMPORARY: Long = 0x0800000000

public const val IFF_FIXEDMTU: Long = 0x1000000000

public const val IFF_VIRTUAL: Long = 0x2000000000

public const val IFF_DUPLICATE: Long = 0x4000000000

public const val IFF_IPMP: Long = 0x8000000000

public const val IPC_ALLOC: Int = 0x8000

public const val IPC_CREAT: Int = 0x200

public const val IPC_EXCL: Int = 0x400

public const val IPC_NOWAIT: Int = 0x800

public const val IPC_PRIVATE: Int = 0

public const val IPC_RMID: Int = 10

public const val IPC_SET: Int = 11

public const val IPC_SEAT: Int = 12

public const val SHM_R: Int = 256

public const val SHM_W: Int = 128

public const val SHM_RDONLY: Int = 4096

public const val SHM_RND: Int = 8192

public const val SHM_SHARE_MMU: Int = 16384

public const val SHM_PAGEABLE: Int = 32768

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val F_RDLCK: Short = 1

public const val F_WRLCK: Short = 2

public const val F_UNLCK: Short = 3

public const val O_SYNC: Int = 16

public const val O_NONBLOCK: Int = 128

public const val IPPROTO_RAW: Int = 255

public const val _PC_LINK_MAX: Int = 1

public const val _PC_MAX_CANON: Int = 2

public const val _PC_MAX_INPUT: Int = 3

public const val _PC_NAME_MAX: Int = 4

public const val _PC_PATH_MAX: Int = 5

public const val _PC_PIPE_BUF: Int = 6

public const val _PC_NO_TRUNC: Int = 7

public const val _PC_VDISABLE: Int = 8

public const val _PC_CHOWN_RESTRICTED: Int = 9

public const val _PC_ASYNC_IO: Int = 10

public const val _PC_PRIO_IO: Int = 11

public const val _PC_SYNC_IO: Int = 12

public const val _PC_ALLOC_SIZE_MIN: Int = 13

public const val _PC_REC_INCR_XFER_SIZE: Int = 14

public const val _PC_REC_MAX_XFER_SIZE: Int = 15

public const val _PC_REC_MIN_XFER_SIZE: Int = 16

public const val _PC_REC_XFER_ALIGN: Int = 17

public const val _PC_SYMLINK_MAX: Int = 18

public const val _PC_2_SYMLINKS: Int = 19

public const val _PC_ACL_ENABLED: Int = 20

public const val _PC_MIN_HOLE_SIZE: Int = 21

public const val _PC_CASE_BEHAVIOR: Int = 22

public const val _PC_SATTR_ENABLED: Int = 23

public const val _PC_SATTR_EXISTS: Int = 24

public const val _PC_ACCESS_FILTERING: Int = 25

public const val _PC_TIMESTAMP_RESOLUTION: Int = 26

public const val _PC_FILESIZEBITS: Int = 67

public const val _PC_XATTR_ENABLED: Int = 100

public const val _PC_XATTR_EXISTS: Int = 101

public const val _POSIX_VDISABLE: UByte = 0u

public const val _SC_ARG_MAX: Int = 1

public const val _SC_CHILD_MAX: Int = 2

public const val _SC_CLK_TCK: Int = 3

public const val _SC_NGROUPS_MAX: Int = 4

public const val _SC_OPEN_MAX: Int = 5

public const val _SC_JOB_CONTROL: Int = 6

public const val _SC_SAVED_IDS: Int = 7

public const val _SC_VERSION: Int = 8

public const val _SC_PASS_MAX: Int = 9

public const val _SC_LOGNAME_MAX: Int = 10

public const val _SC_PAGESIZE: Int = 11

public const val _SC_PAGE_SIZE: Int = _SC_PAGESIZE

public const val _SC_XOPEN_VERSION: Int = 12

public const val _SC_NPROCESSORS_CONF: Int = 14

public const val _SC_NPROCESSORS_ONLN: Int = 15

public const val _SC_STREAM_MAX: Int = 16

public const val _SC_TZNAME_MAX: Int = 17

public const val _SC_AIO_LISTIO_MAX: Int = 18

public const val _SC_AIO_MAX: Int = 19

public const val _SC_AIO_PRIO_DELTA_MAX: Int = 20

public const val _SC_ASYNCHRONOUS_IO: Int = 21

public const val _SC_DELAYTIMER_MAX: Int = 22

public const val _SC_FSYNC: Int = 23

public const val _SC_MAPPED_FILES: Int = 24

public const val _SC_MEMLOCK: Int = 25

public const val _SC_MEMLOCK_RANGE: Int = 26

public const val _SC_MEMORY_PROTECTION: Int = 27

public const val _SC_MESSAGE_PASSING: Int = 28

public const val _SC_MQ_OPEN_MAX: Int = 29

public const val _SC_MQ_PRIO_MAX: Int = 30

public const val _SC_PRIORITIZED_IO: Int = 31

public const val _SC_PRIORITY_SCHEDULING: Int = 32

public const val _SC_REALTIME_SIGNALS: Int = 33

public const val _SC_RTSIG_MAX: Int = 34

public const val _SC_SEMAPHORES: Int = 35

public const val _SC_SEM_NSEMS_MAX: Int = 36

public const val _SC_SEM_VALUE_MAX: Int = 37

public const val _SC_SHARED_MEMORY_OBJECTS: Int = 38

public const val _SC_SIGQUEUE_MAX: Int = 39

public const val _SC_SIGRT_MIN: Int = 40

public const val _SC_SIGRT_MAX: Int = 41

public const val _SC_SYNCHRONIZED_IO: Int = 42

public const val _SC_TIMERS: Int = 43

public const val _SC_TIMER_MAX: Int = 44

public const val _SC_2_C_BIND: Int = 45

public const val _SC_2_C_DEV: Int = 46

public const val _SC_2_C_VERSION: Int = 47

public const val _SC_2_FORT_DEV: Int = 48

public const val _SC_2_FORT_RUN: Int = 49

public const val _SC_2_LOCALEDEF: Int = 50

public const val _SC_2_SW_DEV: Int = 51

public const val _SC_2_UPE: Int = 52

public const val _SC_2_VERSION: Int = 53

public const val _SC_BC_BASE_MAX: Int = 54

public const val _SC_BC_DIM_MAX: Int = 55

public const val _SC_BC_SCALE_MAX: Int = 56

public const val _SC_BC_STRING_MAX: Int = 57

public const val _SC_COLL_WEIGHTS_MAX: Int = 58

public const val _SC_EXPR_NEST_MAX: Int = 59

public const val _SC_LINE_MAX: Int = 60

public const val _SC_RE_DUP_MAX: Int = 61

public const val _SC_XOPEN_CRYPT: Int = 62

public const val _SC_XOPEN_ENH_I18N: Int = 63

public const val _SC_XOPEN_SHM: Int = 64

public const val _SC_2_CHAR_TERM: Int = 66

public const val _SC_XOPEN_XCU_VERSION: Int = 67

public const val _SC_ATEXIT_MAX: Int = 76

public const val _SC_IOV_MAX: Int = 77

public const val _SC_XOPEN_UNIX: Int = 78

public const val _SC_T_IOV_MAX: Int = 79

public const val _SC_PHYS_PAGES: Int = 500

public const val _SC_AVPHYS_PAGES: Int = 501

public const val _SC_COHER_BLKSZ: Int = 503

public const val _SC_SPLIT_CACHE: Int = 504

public const val _SC_ICACHE_SZ: Int = 505

public const val _SC_DCACHE_SZ: Int = 506

public const val _SC_ICACHE_LINESZ: Int = 507

public const val _SC_DCACHE_LINESZ: Int = 508

public const val _SC_ICACHE_BLKSZ: Int = 509

public const val _SC_DCACHE_BLKSZ: Int = 510

public const val _SC_DCACHE_TBLKSZ: Int = 511

public const val _SC_ICACHE_ASSOC: Int = 512

public const val _SC_DCACHE_ASSOC: Int = 513

public const val _SC_MAXPID: Int = 514

public const val _SC_STACK_PROT: Int = 515

public const val _SC_NPROCESSORS_MAX: Int = 516

public const val _SC_CPUID_MAX: Int = 517

public const val _SC_EPHID_MAX: Int = 518

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 568

public const val _SC_GETGR_R_SIZE_MAX: Int = 569

public const val _SC_GETPW_R_SIZE_MAX: Int = 570

public const val _SC_LOGIN_NAME_MAX: Int = 571

public const val _SC_THREAD_KEYS_MAX: Int = 572

public const val _SC_THREAD_STACK_MIN: Int = 573

public const val _SC_THREAD_THREADS_MAX: Int = 574

public const val _SC_TTY_NAME_MAX: Int = 575

public const val _SC_THREADS: Int = 576

public const val _SC_THREAD_ATTR_STACKADDR: Int = 577

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 578

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 579

public const val _SC_THREAD_PRIO_INHERIT: Int = 580

public const val _SC_THREAD_PRIO_PROTECT: Int = 581

public const val _SC_THREAD_PROCESS_SHARED: Int = 582

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 583

public const val _SC_XOPEN_LEGACY: Int = 717

public const val _SC_XOPEN_REALTIME: Int = 718

public const val _SC_XOPEN_REALTIME_THREADS: Int = 719

public const val _SC_XBS5_ILP32_OFF32: Int = 720

public const val _SC_XBS5_ILP32_OFFBIG: Int = 721

public const val _SC_XBS5_LP64_OFF64: Int = 722

public const val _SC_XBS5_LPBIG_OFFBIG: Int = 723

public const val _SC_2_PBS: Int = 724

public const val _SC_2_PBS_ACCOUNTING: Int = 725

public const val _SC_2_PBS_CHECKPOINT: Int = 726

public const val _SC_2_PBS_LOCATE: Int = 728

public const val _SC_2_PBS_MESSAGE: Int = 729

public const val _SC_2_PBS_TRACK: Int = 730

public const val _SC_ADVISORY_INFO: Int = 731

public const val _SC_BARRIERS: Int = 732

public const val _SC_CLOCK_SELECTION: Int = 733

public const val _SC_CPUTIME: Int = 734

public const val _SC_HOST_NAME_MAX: Int = 735

public const val _SC_MONOTONIC_CLOCK: Int = 736

public const val _SC_READER_WRITER_LOCKS: Int = 737

public const val _SC_REGEXP: Int = 738

public const val _SC_SHELL: Int = 739

public const val _SC_SPAWN: Int = 740

public const val _SC_SPIN_LOCKS: Int = 741

public const val _SC_SPORADIC_SERVER: Int = 742

public const val _SC_SS_REPL_MAX: Int = 743

public const val _SC_SYMLOOP_MAX: Int = 744

public const val _SC_THREAD_CPUTIME: Int = 745

public const val _SC_THREAD_SPORADIC_SERVER: Int = 746

public const val _SC_TIMEOUTS: Int = 747

public const val _SC_TRACE: Int = 748

public const val _SC_TRACE_EVENT_FILTER: Int = 749

public const val _SC_TRACE_EVENT_NAME_MAX: Int = 750

public const val _SC_TRACE_INHERIT: Int = 751

public const val _SC_TRACE_LOG: Int = 752

public const val _SC_TRACE_NAME_MAX: Int = 753

public const val _SC_TRACE_SYS_MAX: Int = 754

public const val _SC_TRACE_USER_EVENT_MAX: Int = 755

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 756

public const val _SC_V6_ILP32_OFF32: Int = 757

public const val _SC_V6_ILP32_OFFBIG: Int = 758

public const val _SC_V6_LP64_OFF64: Int = 759

public const val _SC_V6_LPBIG_OFFBIG: Int = 760

public const val _SC_XOPEN_STREAMS: Int = 761

public const val _SC_IPV6: Int = 762

public const val _SC_RAW_SOCKETS: Int = 763

public const val _ST_FSTYPSZ: Int = 16

public val _MUTEX_MAGIC: UShort = (0x4d58).toUShort()

public val _COND_MAGIC: UShort = (0x4356).toUShort()

public val _RWL_MAGIC: UShort = (0x5257).toUShort()

public const val NCCS: ULong = 19uL

public val LOG_CRON: Int = 15 shl 3

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(pthreadMutexFlag1 = 0.toUShort(), pthreadMutexFlag2 = 0.toUByte(), pthreadMutexCeiling = 0.toUByte(), pthreadMutexType = PTHREAD_PROCESS_PRIVATE, pthreadMutexMagic = _MUTEX_MAGIC, pthreadMutexLock = 0uL, pthreadMutexData = 0uL)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(pthreadCondFlag = ubyteArrayOf(0u, 0u, 0u, 0u), pthreadCondType = PTHREAD_PROCESS_PRIVATE, pthreadCondMagic = _COND_MAGIC, pthreadCondData = 0uL)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(pthreadRwlockReaders = 0, pthreadRwlockType = PTHREAD_PROCESS_PRIVATE, pthreadRwlockMagic = _RWL_MAGIC, pthreadRwlockMutex = PTHREAD_MUTEX_INITIALIZER, pthreadRwlockReadercv = PTHREAD_COND_INITIALIZER, pthreadRwlockWritercv = PTHREAD_COND_INITIALIZER)

public const val PTHREAD_MUTEX_NORMAL: Int = 0

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 2

public const val PTHREAD_MUTEX_RECURSIVE: Int = 4

public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL

public const val RTLD_LAZY: Int = 0x1

public const val RTLD_NOW: Int = 0x2

public const val RTLD_NOLOAD: Int = 0x4

public const val RTLD_GLOBAL: Int = 0x100

public const val RTLD_LOCAL: Int = 0x0

public const val RTLD_PARENT: Int = 0x200

public const val RTLD_GROUP: Int = 0x400

public const val RTLD_WORLD: Int = 0x800

public const val RTLD_NODELETE: Int = 0x1000

public const val RTLD_FIRST: Int = 0x2000

public const val RTLD_CONFGEN: Int = 0x10000

public const val PORT_SOURCE_AIO: Int = 1

public const val PORT_SOURCE_TIMER: Int = 2

public const val PORT_SOURCE_USER: Int = 3

public const val PORT_SOURCE_FD: Int = 4

public const val PORT_SOURCE_ALERT: Int = 5

public const val PORT_SOURCE_MQ: Int = 6

public const val PORT_SOURCE_FILE: Int = 7

public const val NONROOT_USR: Short = 2

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

public const val DOWN_TIME: Short = 10

public val TCGETA: Int = _TIOC or 1

public val TCSETA: Int = _TIOC or 2

public val TCSETAW: Int = _TIOC or 3

public val TCSETAF: Int = _TIOC or 4

public val TCSBRK: Int = _TIOC or 5

public val TCXONC: Int = _TIOC or 6

public val TCFLSH: Int = _TIOC or 7

public val TCDSET: Int = _TIOC or 32

public val TCGETS: Int = _TIOC or 13

public val TCSETS: Int = _TIOC or 14

public val TCSANOW: Int = _TIOC or 14

public val TCSETSW: Int = _TIOC or 15

public val TCSADRAIN: Int = _TIOC or 15

public val TCSETSF: Int = _TIOC or 16

public val TCSAFLUSH: Int = _TIOC or 16

public const val TCIFLUSH: Int = 0

public const val TCOFLUSH: Int = 1

public const val TCIOFLUSH: Int = 2

public const val TCOOFF: Int = 0

public const val TCOON: Int = 1

public const val TCIOFF: Int = 2

public const val TCION: Int = 3

public const val TIOC: Int = _TIOC

public val TIOCKBON: Int = _TIOC or 8

public val TIOCKBOF: Int = _TIOC or 9

public val TIOCGWINSZ: Int = _TIOC or 104

public val TIOCSWINSZ: Int = _TIOC or 103

public val TIOCGSOFTCAR: Int = _TIOC or 105

public val TIOCSSOFTCAR: Int = _TIOC or 106

public val TIOCGPPS: Int = _TIOC or 125

public val TIOCSPPS: Int = _TIOC or 126

public val TIOCGPPSEV: Int = _TIOC or 127

public val TIOCGETD: Int = tIOC or 0

public val TIOCSETD: Int = tIOC or 1

public val TIOCHPCL: Int = tIOC or 2

public val TIOCGETP: Int = tIOC or 8

public val TIOCSETP: Int = tIOC or 9

public val TIOCSETN: Int = tIOC or 10

public val TIOCEXCL: Int = tIOC or 13

public val TIOCNXCL: Int = tIOC or 14

public val TIOCFLUSH: Int = tIOC or 16

public val TIOCSETC: Int = tIOC or 17

public val TIOCGETC: Int = tIOC or 18

public val TIOCLBIS: Int = tIOC or 127

public val TIOCLBIC: Int = tIOC or 126

public val TIOCLSET: Int = tIOC or 125

public val TIOCLGET: Int = tIOC or 124

public val TIOCSBRK: Int = tIOC or 123

public val TIOCCBRK: Int = tIOC or 122

public val TIOCSDTR: Int = tIOC or 121

public val TIOCCDTR: Int = tIOC or 120

public val TIOCSLTC: Int = tIOC or 117

public val TIOCGLTC: Int = tIOC or 116

public val TIOCOUTQ: Int = tIOC or 115

public val TIOCNOTTY: Int = tIOC or 113

public val TIOCSCTTY: Int = tIOC or 132

public val TIOCSTOP: Int = tIOC or 111

public val TIOCSTART: Int = tIOC or 110

public val TIOCSILOOP: Int = tIOC or 109

public val TIOCCILOOP: Int = tIOC or 108

public val TIOCGPGRP: Int = tIOC or 20

public val TIOCSPGRP: Int = tIOC or 21

public val TIOCGSID: Int = tIOC or 22

public val TIOCSTI: Int = tIOC or 23

public val TIOCMSET: Int = tIOC or 26

public val TIOCMBIS: Int = tIOC or 27

public val TIOCMBIC: Int = tIOC or 28

public val TIOCMGET: Int = tIOC or 29

public val TIOCREMOTE: Int = tIOC or 30

public val TIOCSIGNAL: Int = tIOC or 31

public const val TIOCM_LE: Int = 1

public const val TIOCM_DTR: Int = 2

public const val TIOCM_RTS: Int = 4

public const val TIOCM_ST: Int = 8

public const val TIOCM_SR: Int = 16

public const val TIOCM_CTS: Int = 32

public const val TIOCM_CAR: Int = 64

public const val TIOCM_CD: Int = TIOCM_CAR

public const val TIOCM_RNG: Int = 128

public const val TIOCM_RI: Int = TIOCM_RNG

public const val TIOCM_DSR: Int = 256

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

public const val B57600: UInt = 16u

public const val B76800: UInt = 17u

public const val B115200: UInt = 18u

public const val B153600: UInt = 19u

public const val B230400: UInt = 20u

public const val B307200: UInt = 21u

public const val B460800: UInt = 22u

public const val B921600: UInt = 23u

public const val CSTART: UInt = 17u

public const val CSTOP: UInt = 19u

public const val CSWTCH: UInt = 26u

public const val CBAUD: UInt = 15u

public const val CIBAUD: UInt = 983040u

public const val CBAUDEXT: UInt = 2097152u

public const val CIBAUDEXT: UInt = 4194304u

public const val CSIZE: UInt = 48u

public const val CS5: UInt = 0u

public const val CS6: UInt = 16u

public const val CS7: UInt = 32u

public const val CS8: UInt = 48u

public const val CSTOPB: UInt = 64u

public const val ECHO: UInt = 8u

public const val ECHOE: UInt = 16u

public const val ECHOK: UInt = 32u

public const val ECHONL: UInt = 64u

public const val ECHOCTL: UInt = 512u

public const val ECHOPRT: UInt = 1024u

public const val ECHOKE: UInt = 2048u

public const val EXTPROC: UInt = 65536u

public const val IGNBRK: UInt = 1u

public const val BRKINT: UInt = 2u

public const val IGNPAR: UInt = 4u

public const val PARMRK: UInt = 8u

public const val INPCK: UInt = 16u

public const val ISTRIP: UInt = 32u

public const val INLCR: UInt = 64u

public const val IGNCR: UInt = 128u

public const val ICRNL: UInt = 256u

public const val IUCLC: UInt = 512u

public const val IXON: UInt = 1024u

public const val IXOFF: UInt = 4096u

public const val IXANY: UInt = 2048u

public const val IMAXBEL: UInt = 8192u

public const val DOSMODE: UInt = 32768u

public const val OPOST: UInt = 1u

public const val OLCUC: UInt = 2u

public const val ONLCR: UInt = 4u

public const val OCRNL: UInt = 8u

public const val ONOCR: UInt = 16u

public const val ONLRET: UInt = 32u

public const val OFILL: UInt = 64u

public const val OFDEL: UInt = 128u

public const val CREAD: UInt = 128u

public const val PARENB: UInt = 256u

public const val PARODD: UInt = 512u

public const val HUPCL: UInt = 1024u

public const val CLOCAL: UInt = 2048u

public const val CRTSXOFF: UInt = 1073741824u

public const val CRTSCTS: UInt = 2147483648u

public const val ISIG: UInt = 1u

public const val ICANON: UInt = 2u

public const val IEXTEN: UInt = 32768u

public const val TOSTOP: UInt = 256u

public const val FLUSHO: UInt = 8192u

public const val PENDIN: UInt = 16384u

public const val NOFLSH: UInt = 128u

public const val VINTR: ULong = 0uL

public const val VQUIT: ULong = 1uL

public const val VERASE: ULong = 2uL

public const val VKILL: ULong = 3uL

public const val VEOF: ULong = 4uL

public const val VEOL: ULong = 5uL

public const val VEOL2: ULong = 6uL

public const val VMIN: ULong = 4uL

public const val VTIME: ULong = 5uL

public const val VSWTCH: ULong = 7uL

public const val VSTART: ULong = 8uL

public const val VSTOP: ULong = 9uL

public const val VSUSP: ULong = 10uL

public const val VDSUSP: ULong = 11uL

public const val VREPRINT: ULong = 12uL

public const val VDISCARD: ULong = 13uL

public const val VWERASE: ULong = 14uL

public const val VLNEXT: ULong = 15uL

public val I_NREAD: Int = STR or 1

public val I_PUSH: Int = STR or 2

public val I_POP: Int = STR or 3

public val I_LOOK: Int = STR or 4

public val I_FLUSH: Int = STR or 5

public val I_SRDOPT: Int = STR or 6

public val I_GRDOPT: Int = STR or 7

public val I_STR: Int = STR or 8

public val I_SETSIG: Int = STR or 9

public val I_GETSIG: Int = STR or 10

public val I_FIND: Int = STR or 11

public val I_LINK: Int = STR or 12

public val I_UNLINK: Int = STR or 13

public val I_PEEK: Int = STR or 15

public val I_FDINSERT: Int = STR or 16

public val I_SENDFD: Int = STR or 17

public val I_RECVFD: Int = STR or 14

public val I_SWROPT: Int = STR or 19

public val I_GWROPT: Int = STR or 20

public val I_LIST: Int = STR or 21

public val I_PLINK: Int = STR or 22

public val I_PUNLINK: Int = STR or 23

public val I_ANCHOR: Int = STR or 24

public val I_FLUSHBAND: Int = STR or 28

public val I_CKBAND: Int = STR or 29

public val I_GETBAND: Int = STR or 30

public val I_ATMARK: Int = STR or 31

public val I_SETCLTIME: Int = STR or 32

public val I_GETCLTIME: Int = STR or 33

public val I_CANPUT: Int = STR or 34

public val I_SERROPT: Int = STR or 35

public val I_GERROPT: Int = STR or 36

public val I_ESETSIG: Int = STR or 37

public val I_EGETSIG: Int = STR or 38

public val __I_PUSH_NOCTTY: Int = STR or 39

public const val SOCK_CLOEXEC: Int = 0x080000

public const val SOCK_NONBLOCK: Int = 0x100000

public const val SOCK_NDELAY: Int = 0x200000

public val SCALE_KG: Int = 1 shl 6

public val SCALE_KF: Int = 1 shl 16

public val SCALE_KH: Int = 1 shl 2

public val MAXTC: Int = 1 shl 6

public val SCALE_PHASE: Int = 1 shl 22

public val SCALE_USEC: Int = 1 shl 16

public val SCALE_UPDATE: Int = SCALE_KG * MAXTC

public val FINEUSEC: Int = 1 shl 22

public const val MAXPHASE: Int = 512000

public val MAXFREQ: Int = 512 * SCALE_USEC

public val MAXTIME: Int = 200 shl PPS_AVG

public const val MINSEC: Int = 16

public const val MAXSEC: Int = 1200

public const val PPS_AVG: Int = 2

public const val PPS_SHIFT: Int = 2

public const val PPS_SHIFTMAX: Int = 8

public const val PPS_VALID: Int = 120

public const val MAXGLITCH: Int = 30

public const val MOD_OFFSET: UInt = 0x0001u

public const val MOD_FREQUENCY: UInt = 0x0002u

public const val MOD_MAXERROR: UInt = 0x0004u

public const val MOD_ESTERROR: UInt = 0x0008u

public const val MOD_STATUS: UInt = 0x0010u

public const val MOD_TIMECONST: UInt = 0x0020u

public const val MOD_CLKB: UInt = 0x4000u

public const val MOD_CLKA: UInt = 0x8000u

public const val STA_PLL: UInt = 0x0001u

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

public const val TIME_OK: Int = 0

public const val TIME_INS: Int = 1

public const val TIME_DEL: Int = 2

public const val TIME_OOP: Int = 3

public const val TIME_WAIT: Int = 4

public const val TIME_ERROR: Int = 5

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val SCHED_OTHER: Int = 0

public const val SCHED_FIFO: Int = 1

public const val SCHED_RR: Int = 2

public const val SCHED_SYS: Int = 3

public const val SCHED_IA: Int = 4

public const val SCHED_FSS: Int = 5

public const val SCHED_FX: Int = 6

public const val PRIV_DEBUG: UInt = 0x0001u

public const val PRIV_AWARE: UInt = 0x0002u

public const val PRIV_AWARE_INHERIT: UInt = 0x0004u

public const val __PROC_PROTECT: UInt = 0x0008u

public const val NET_MAC_AWARE: UInt = 0x0010u

public const val NET_MAC_AWARE_INHERIT: UInt = 0x0020u

public const val PRIV_AWARE_RESET: UInt = 0x0040u

public const val PRIV_XPOLICY: UInt = 0x0080u

public const val PRIV_PFEXEC: UInt = 0x0100u

public const val SI_SYSNAME: Int = 1

public const val SI_HOSTNAME: Int = 2

public const val SI_RELEASE: Int = 3

public const val SI_VERSION: Int = 4

public const val SI_MACHINE: Int = 5

public const val SI_ARCHITECTURE: Int = 6

public const val SI_HW_SERIAL: Int = 7

public const val SI_HW_PROVIDER: Int = 8

public const val SI_SET_HOSTNAME: Int = 258

public const val SI_SET_SRPC_DOMAIN: Int = 265

public const val SI_PLATFORM: Int = 513

public const val SI_ISALIST: Int = 514

public const val SI_DHCP_CACHE: Int = 515

public const val SI_ARCHITECTURE_32: Int = 516

public const val SI_ARCHITECTURE_64: Int = 517

public const val SI_ARCHITECTURE_K: Int = 518

public const val SI_ARCHITECTURE_NATIVE: Int = 519

public const val LGRP_COOKIE_NONE: ULong = 0uL

public const val LGRP_AFF_NONE: Int = 0x0.toInt()

public const val LGRP_AFF_WEAK: Int = 0x10.toInt()

public const val LGRP_AFF_STRONG: Int = 0x100.toInt()

public const val LGRP_CONTENT_ALL: UInt = 0u

public const val LGRP_CONTENT_HIERARCHY: UInt = LGRP_CONTENT_ALL

public const val LGRP_CONTENT_DIRECT: UInt = 1u

public const val LGRP_LAT_CPU_TO_MEM: UInt = 0u

public const val LGRP_MEM_SZ_FREE: UInt = 0u

public const val LGRP_MEM_SZ_INSTALLED: UInt = 1u

public const val LGRP_VIEW_CALLER: UInt = 0u

public const val LGRP_VIEW_OS: UInt = 1u

public const val P_OFFLINE: Int = 0x001

public const val P_ONLINE: Int = 0x002

public const val P_STATUS: Int = 0x003

public const val P_FAULTED: Int = 0x004

public const val P_POWEROFF: Int = 0x005

public const val P_NOINTR: Int = 0x006

public const val P_SPARE: Int = 0x007

public const val P_FORCED: Int = 0x10000000

public const val PI_TYPELEN: Int = 16

public const val PI_FPUTYPE: Int = 32

public const val AT_SUN_HWCAP: UInt = 2009u

public const val SFV_FD_SELF: Int = -2
