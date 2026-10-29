package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public const val D_T_FMT: Long = 0

public const val D_FMT: Long = 1

public const val T_FMT: Long = 2

public const val T_FMT_AMPM: Long = 3

public const val AM_STR: Long = 4

public const val PM_STR: Long = 5

public const val DAY_1: Long = 6

public const val DAY_2: Long = 7

public const val DAY_3: Long = 8

public const val DAY_4: Long = 9

public const val DAY_5: Long = 10

public const val DAY_6: Long = 11

public const val DAY_7: Long = 12

public const val ABDAY_1: Long = 13

public const val ABDAY_2: Long = 14

public const val ABDAY_3: Long = 15

public const val ABDAY_4: Long = 16

public const val ABDAY_5: Long = 17

public const val ABDAY_6: Long = 18

public const val ABDAY_7: Long = 19

public const val MON_1: Long = 20

public const val MON_2: Long = 21

public const val MON_3: Long = 22

public const val MON_4: Long = 23

public const val MON_5: Long = 24

public const val MON_6: Long = 25

public const val MON_7: Long = 26

public const val MON_8: Long = 27

public const val MON_9: Long = 28

public const val MON_10: Long = 29

public const val MON_11: Long = 30

public const val MON_12: Long = 31

public const val ABMON_1: Long = 32

public const val ABMON_2: Long = 33

public const val ABMON_3: Long = 34

public const val ABMON_4: Long = 35

public const val ABMON_5: Long = 36

public const val ABMON_6: Long = 37

public const val ABMON_7: Long = 38

public const val ABMON_8: Long = 39

public const val ABMON_9: Long = 40

public const val ABMON_10: Long = 41

public const val ABMON_11: Long = 42

public const val ABMON_12: Long = 43

public const val RADIXCHAR: Long = 44

public const val THOUSEP: Long = 45

public const val YESSTR: Long = 46

public const val YESEXPR: Long = 47

public const val NOSTR: Long = 48

public const val NOEXPR: Long = 49

public const val CRNCYSTR: Long = 50

public const val CODESET: Long = 51

public const val EXIT_FAILURE: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val RAND_MAX: Int = 2147483647

public const val EOF: Int = -1

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val _IOFBF: Int = 0

public const val _IONBF: Int = 2

public const val _IOLBF: Int = 1

public const val BUFSIZ: UInt = 1024u

public const val FOPEN_MAX: UInt = 20u

public const val FILENAME_MAX: UInt = 1024u

public const val L_tmpnam: UInt = 1024u

public const val O_NOCTTY: Int = 32768

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

public const val MAP_FILE: Int = 0x0000

public const val MAP_SHARED: Int = 0x0001

public const val MAP_PRIVATE: Int = 0x0002

public const val MAP_FIXED: Int = 0x0010

public const val MAP_ANON: Int = 0x1000

public const val MAP_ANONYMOUS: Int = MAP_ANON

public const val IPC_CREAT: Int = 512

public const val IPC_EXCL: Int = 1024

public const val IPC_NOWAIT: Int = 2048

public const val IPC_PRIVATE: Long = 0

public const val IPC_RMID: Int = 0

public const val IPC_SET: Int = 1

public const val IPC_STAT: Int = 2

public const val IPC_R: Int = 256

public const val IPC_W: Int = 128

public const val IPC_M: Int = 4096

public const val SHM_R: Int = IPC_R

public const val SHM_W: Int = IPC_W

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val MS_ASYNC: Int = 0x0001

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

public const val EWOULDBLOCK: Int = 35

public const val EINPROGRESS: Int = 36

public const val EALREADY: Int = 37

public const val ENOTSOCK: Int = 38

public const val EDESTADDRREQ: Int = 39

public const val EMSGSIZE: Int = 40

public const val EPROTOTYPE: Int = 41

public const val ENOPROTOOPT: Int = 42

public const val EPROTONOSUPPORT: Int = 43

public const val ESOCKTNOSUPPORT: Int = 44

public const val EOPNOTSUPP: Int = 45

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

public const val F_DUPFD: Int = 0

public const val F_GETFD: Int = 1

public const val F_SETFD: Int = 2

public const val F_GETFL: Int = 3

public const val F_SETFL: Int = 4

public const val SIGTRAP: Int = 5

public const val GLOB_APPEND: Int = 0x0001

public const val GLOB_DOOFFS: Int = 0x0002

public const val GLOB_ERR: Int = 0x0004

public const val GLOB_MARK: Int = 0x0008

public const val GLOB_NOCHECK: Int = 0x0010

public const val GLOB_NOSORT: Int = 0x0020

public const val GLOB_NOESCAPE: Int = 0x1000

public const val GLOB_NOSPACE: Int = -1

public const val GLOB_ABORTED: Int = -2

public const val GLOB_NOMATCH: Int = -3

public const val GLOB_NOSYS: Int = -4

public const val POSIX_MADV_NORMAL: Int = 0

public const val POSIX_MADV_RANDOM: Int = 1

public const val POSIX_MADV_SEQUENTIAL: Int = 2

public const val POSIX_MADV_WILLNEED: Int = 3

public const val POSIX_MADV_DONTNEED: Int = 4

public const val POSIX_SPAWN_RESETIDS: Int = 0x01

public const val POSIX_SPAWN_SETPGROUP: Int = 0x02

public const val POSIX_SPAWN_SETSCHEDPARAM: Int = 0x04

public const val POSIX_SPAWN_SETSCHEDULER: Int = 0x08

public const val POSIX_SPAWN_SETSIGDEF: Int = 0x10

public const val POSIX_SPAWN_SETSIGMASK: Int = 0x20

public const val PTHREAD_CREATE_JOINABLE: Int = 0

public const val PTHREAD_CREATE_DETACHED: Int = 1

public const val PIOD_READ_D: Int = 1

public const val PIOD_WRITE_D: Int = 2

public const val PIOD_READ_I: Int = 3

public const val PIOD_WRITE_I: Int = 4

public const val PIOD_READ_AUXV: Int = 5

public const val PT_TRACE_ME: Int = 0

public const val PT_READ_I: Int = 1

public const val PT_READ_D: Int = 2

public const val PT_WRITE_I: Int = 4

public const val PT_WRITE_D: Int = 5

public const val PT_CONTINUE: Int = 7

public const val PT_KILL: Int = 8

public const val PT_ATTACH: Int = 9

public const val PT_DETACH: Int = 10

public const val PT_IO: Int = 11

public const val CLOCK_REALTIME: Int = 0

public const val CLOCK_MONOTONIC: Int = 3

public const val RLIMIT_CPU: Int = 0

public const val RLIMIT_FSIZE: Int = 1

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_STACK: Int = 3

public const val RLIMIT_CORE: Int = 4

public const val RLIMIT_RSS: Int = 5

public const val RLIMIT_MEMLOCK: Int = 6

public const val RLIMIT_NPROC: Int = 7

public const val RLIMIT_NOFILE: Int = 8

public const val RLIM_INFINITY: ULong = 0x7fff_ffff_ffff_ffffuL

public const val RLIM_SAVED_MAX: ULong = RLIM_INFINITY

public const val RLIM_SAVED_CUR: ULong = RLIM_INFINITY

public const val RUSAGE_SELF: Int = 0

public const val RUSAGE_CHILDREN: Int = -1

public const val MADV_NORMAL: Int = 0

public const val MADV_RANDOM: Int = 1

public const val MADV_SEQUENTIAL: Int = 2

public const val MADV_WILLNEED: Int = 3

public const val MADV_DONTNEED: Int = 4

public const val MADV_FREE: Int = 6

public const val MNT_NODEV: Int = 0x00000010

public const val MNT_LOCAL: Int = 0x00001000

public const val MNT_QUOTA: Int = 0x00002000

public const val IOCPARM_MASK: UInt = 0x1fffu

public const val IOC_VOID: ULong = 0x20000000uL

public const val IOC_OUT: ULong = 0x40000000uL

public const val IOC_IN: ULong = 0x80000000uL

public val IOC_INOUT: ULong = IOC_IN or IOC_OUT

public const val IOC_DIRMASK: ULong = 0xe0000000uL

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

public const val AF_DATAKIT: Int = 9

public const val AF_CCITT: Int = 10

public const val AF_SNA: Int = 11

public const val AF_DECnet: Int = 12

public const val AF_DLI: Int = 13

public const val AF_LAT: Int = 14

public const val AF_HYLINK: Int = 15

public const val AF_APPLETALK: Int = 16

public const val AF_LINK: Int = 18

public const val pseudo_AF_XTP: Int = 19

public const val AF_COIP: Int = 20

public const val AF_CNT: Int = 21

public const val pseudo_AF_RTIP: Int = 22

public const val AF_IPX: Int = 23

public const val AF_INET6: Int = 24

public const val pseudo_AF_PIP: Int = 25

public const val AF_ISDN: Int = 26

public const val AF_E164: Int = AF_ISDN

public const val AF_NATM: Int = 27

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

public const val PF_DATAKIT: Int = AF_DATAKIT

public const val PF_CCITT: Int = AF_CCITT

public const val PF_SNA: Int = AF_SNA

public const val PF_DECnet: Int = AF_DECnet

public const val PF_DLI: Int = AF_DLI

public const val PF_LAT: Int = AF_LAT

public const val PF_HYLINK: Int = AF_HYLINK

public const val PF_APPLETALK: Int = AF_APPLETALK

public const val PF_LINK: Int = AF_LINK

public const val PF_XTP: Int = pseudo_AF_XTP

public const val PF_COIP: Int = AF_COIP

public const val PF_CNT: Int = AF_CNT

public const val PF_IPX: Int = AF_IPX

public const val PF_INET6: Int = AF_INET6

public const val PF_RTIP: Int = pseudo_AF_RTIP

public const val PF_PIP: Int = pseudo_AF_PIP

public const val PF_ISDN: Int = AF_ISDN

public const val PF_NATM: Int = AF_NATM

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_RAW: Int = 3

public const val SOCK_RDM: Int = 4

public const val SOCK_SEQPACKET: Int = 5

public const val IP_TTL: Int = 4

public const val IP_HDRINCL: Int = 2

public const val IP_ADD_MEMBERSHIP: Int = 12

public const val IP_DROP_MEMBERSHIP: Int = 13

public const val IPV6_RECVPKTINFO: Int = 36

public const val IPV6_PKTINFO: Int = 46

public const val IPV6_RECVTCLASS: Int = 57

public const val IPV6_TCLASS: Int = 61

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

public const val SO_SNDBUF: Int = 0x1001

public const val SO_RCVBUF: Int = 0x1002

public const val SO_SNDLOWAT: Int = 0x1003

public const val SO_RCVLOWAT: Int = 0x1004

public const val SO_ERROR: Int = 0x1007

public const val SO_TYPE: Int = 0x1008

public const val SOMAXCONN: Int = 128

public const val MSG_OOB: Int = 0x1

public const val MSG_PEEK: Int = 0x2

public const val MSG_DONTROUTE: Int = 0x4

public const val MSG_EOR: Int = 0x8

public const val MSG_TRUNC: Int = 0x10

public const val MSG_CTRUNC: Int = 0x20

public const val MSG_WAITALL: Int = 0x40

public const val MSG_DONTWAIT: Int = 0x80

public const val MSG_BCAST: Int = 0x100

public const val MSG_MCAST: Int = 0x200

public const val MSG_NOSIGNAL: Int = 0x400

public const val MSG_CMSG_CLOEXEC: Int = 0x800

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val LOCK_SH: Int = 1

public const val LOCK_EX: Int = 2

public const val LOCK_NB: Int = 4

public const val LOCK_UN: Int = 8

public const val IPPROTO_RAW: Int = 255

public const val _SC_ARG_MAX: Int = 1

public const val _SC_CHILD_MAX: Int = 2

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

public const val _SC_PAGESIZE: Int = 28

public const val _SC_PAGE_SIZE: Int = _SC_PAGESIZE

public const val _SC_FSYNC: Int = 29

public const val _SC_XOPEN_SHM: Int = 30

public const val Q_GETQUOTA: Int = 0x300

public const val Q_SETQUOTA: Int = 0x400

public const val RTLD_GLOBAL: Int = 0x100

public const val LOG_NFACILITIES: Int = 24

public const val HW_NCPU: Int = 3

public const val B0: UInt = 0u

public const val B50: UInt = 50u

public const val B75: UInt = 75u

public const val B110: UInt = 110u

public const val B134: UInt = 134u

public const val B150: UInt = 150u

public const val B200: UInt = 200u

public const val B300: UInt = 300u

public const val B600: UInt = 600u

public const val B1200: UInt = 1200u

public const val B1800: UInt = 1800u

public const val B2400: UInt = 2400u

public const val B4800: UInt = 4800u

public const val B9600: UInt = 9600u

public const val B19200: UInt = 19200u

public const val B38400: UInt = 38400u

public const val B7200: UInt = 7200u

public const val B14400: UInt = 14400u

public const val B28800: UInt = 28800u

public const val B57600: UInt = 57600u

public const val B76800: UInt = 76800u

public const val B115200: UInt = 115200u

public const val B230400: UInt = 230400u

public const val EXTA: UInt = 19200u

public const val EXTB: UInt = 38400u

public const val CRTSCTS: UInt = 0x00010000u

public const val CRTS_IFLOW: UInt = CRTSCTS

public const val CCTS_OFLOW: UInt = CRTSCTS

public const val OCRNL: UInt = 0x10u

public const val TIOCEXCL: ULong = 0x2000740duL

public const val TIOCNXCL: ULong = 0x2000740euL

public const val TIOCFLUSH: ULong = 0x80047410uL

public const val TIOCGETA: ULong = 0x402c7413uL

public const val TIOCSETA: ULong = 0x802c7414uL

public const val TIOCSETAW: ULong = 0x802c7415uL

public const val TIOCSETAF: ULong = 0x802c7416uL

public const val TIOCGETD: ULong = 0x4004741auL

public const val TIOCSETD: ULong = 0x8004741buL

public const val TIOCMGET: ULong = 0x4004746auL

public const val TIOCMBIC: ULong = 0x8004746buL

public const val TIOCMBIS: ULong = 0x8004746cuL

public const val TIOCMSET: ULong = 0x8004746duL

public const val TIOCSTART: ULong = 0x2000746euL

public const val TIOCSTOP: ULong = 0x2000746fuL

public const val TIOCSCTTY: ULong = 0x20007461uL

public const val TIOCGWINSZ: ULong = 0x40087468uL

public const val TIOCSWINSZ: ULong = 0x80087467uL

public const val TIOCM_LE: Int = 1

public const val TIOCM_DTR: Int = 2

public const val TIOCM_RTS: Int = 4

public const val TIOCM_ST: Int = 8

public const val TIOCM_SR: Int = 16

public const val TIOCM_CTS: Int = 32

public const val TIOCM_CAR: Int = 64

public const val TIOCM_RNG: Int = 128

public const val TIOCM_DSR: Int = 256

public const val TIOCM_CD: Int = TIOCM_CAR

public const val TIOCM_RI: Int = TIOCM_RNG

public const val TIMER_ABSTIME: Int = 1

public const val RB_AUTOBOOT: Int = 0

public const val TCP_INFO: Int = 9
