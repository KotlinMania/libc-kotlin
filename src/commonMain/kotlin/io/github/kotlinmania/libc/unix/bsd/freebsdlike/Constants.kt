// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public const val POLLIN: Short = 0x0001

public const val POLLPRI: Short = 0x0002

public const val POLLOUT: Short = 0x0004

public const val POLLERR: Short = 0x0008

public const val POLLHUP: Short = 0x0010

public const val POLLNVAL: Short = 0x0020

public const val POLLRDNORM: Short = 0x0040

public const val POLLRDBAND: Short = 0x0080

public const val POLLWRBAND: Short = 0x0100

public const val AIO_LISTIO_MAX: Int = 16

public const val AIO_CANCELED: Int = 1

public const val AIO_NOTCANCELED: Int = 2

public const val AIO_ALLDONE: Int = 3

public const val LIO_NOP: Int = 0

public const val LIO_WRITE: Int = 1

public const val LIO_READ: Int = 2

public const val LIO_WAIT: Int = 1

public const val LIO_NOWAIT: Int = 0

public const val SIGEV_NONE: Int = 0

public const val SIGEV_SIGNAL: Int = 1

public const val SIGEV_THREAD: Int = 2

public const val SIGEV_KEVENT: Int = 3

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

public const val ALTMON_1: Int = 58

public const val ALTMON_2: Int = 59

public const val ALTMON_3: Int = 60

public const val ALTMON_4: Int = 61

public const val ALTMON_5: Int = 62

public const val ALTMON_6: Int = 63

public const val ALTMON_7: Int = 64

public const val ALTMON_8: Int = 65

public const val ALTMON_9: Int = 66

public const val ALTMON_10: Int = 67

public const val ALTMON_11: Int = 68

public const val ALTMON_12: Int = 69

public const val EXIT_FAILURE: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val EOF: Int = -1

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val SEEK_DATA: Int = 3

public const val SEEK_HOLE: Int = 4

public const val _IOFBF: Int = 0

public const val _IONBF: Int = 2

public const val _IOLBF: Int = 1

public const val BUFSIZ: UInt = 1024u

public const val FOPEN_MAX: UInt = 20u

public const val FILENAME_MAX: UInt = 1024u

public const val L_tmpnam: UInt = 1024u

public const val TMP_MAX: UInt = 308915776u

public const val O_NOCTTY: Int = 32768

public const val O_DIRECT: Int = 0x00010000

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

public const val F_DUPFD_CLOEXEC: Int = 17

public const val F_DUP2FD: Int = 10

public const val F_DUP2FD_CLOEXEC: Int = 18

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

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val MNT_EXPUBLIC: Int = 0x20000000

public const val MNT_NOATIME: Int = 0x10000000

public const val MNT_NOCLUSTERR: Int = 0x40000000

public const val MNT_NOCLUSTERW: Int = 0x80000000.toInt()

public const val MNT_NOSYMFOLLOW: Int = 0x00400000

public const val MNT_SOFTDEP: Int = 0x00200000

public const val MNT_SUIDDIR: Int = 0x00100000

public const val MNT_EXRDONLY: Int = 0x00000080

public const val MNT_DEFEXPORTED: Int = 0x00000200

public const val MNT_EXPORTANON: Int = 0x00000400

public const val MNT_EXKERB: Int = 0x00000800

public const val MNT_DELEXPORT: Int = 0x00020000

public const val MS_SYNC: Int = 0x0000

public const val MS_ASYNC: Int = 0x0001

public const val MS_INVALIDATE: Int = 0x0002

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

public const val ENOTSUP: Int = EOPNOTSUPP

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

public const val EIDRM: Int = 82

public const val ENOMSG: Int = 83

public const val EOVERFLOW: Int = 84

public const val ECANCELED: Int = 85

public const val EILSEQ: Int = 86

public const val ENOATTR: Int = 87

public const val EDOOFUS: Int = 88

public const val EBADMSG: Int = 89

public const val EMULTIHOP: Int = 90

public const val ENOLINK: Int = 91

public const val EPROTO: Int = 92

public val POLLSTANDARD: Short = (POLLIN.toInt() or POLLPRI.toInt() or POLLOUT.toInt() or POLLRDNORM.toInt() or POLLRDBAND.toInt() or POLLWRBAND.toInt() or POLLERR.toInt() or POLLHUP.toInt() or POLLNVAL.toInt()).toShort()

public const val AI_PASSIVE: Int = 0x00000001

public const val AI_CANONNAME: Int = 0x00000002

public const val AI_NUMERICHOST: Int = 0x00000004

public const val AI_NUMERICSERV: Int = 0x00000008

public const val AI_ALL: Int = 0x00000100

public const val AI_ADDRCONFIG: Int = 0x00000400

public const val AI_V4MAPPED: Int = 0x00000800

public const val EAI_AGAIN: Int = 2

public const val EAI_BADFLAGS: Int = 3

public const val EAI_FAIL: Int = 4

public const val EAI_FAMILY: Int = 5

public const val EAI_MEMORY: Int = 6

public const val EAI_NONAME: Int = 8

public const val EAI_SERVICE: Int = 9

public const val EAI_SOCKTYPE: Int = 10

public const val EAI_SYSTEM: Int = 11

public const val EAI_OVERFLOW: Int = 14

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

public const val GLOB_NOESCAPE: Int = 0x2000

public const val GLOB_NOSPACE: Int = -1

public const val GLOB_ABORTED: Int = -2

public const val GLOB_NOMATCH: Int = -3

public const val POSIX_MADV_NORMAL: Int = 0

public const val POSIX_MADV_RANDOM: Int = 1

public const val POSIX_MADV_SEQUENTIAL: Int = 2

public const val POSIX_MADV_WILLNEED: Int = 3

public const val POSIX_MADV_DONTNEED: Int = 4

public const val PTHREAD_BARRIER_SERIAL_THREAD: Int = -1

public const val PTHREAD_PROCESS_PRIVATE: Int = 0

public const val PTHREAD_PROCESS_SHARED: Int = 1

public const val PTHREAD_CREATE_JOINABLE: Int = 0

public const val PTHREAD_CREATE_DETACHED: Int = 1

public const val RLIMIT_CPU: Int = 0

public const val RLIMIT_FSIZE: Int = 1

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_STACK: Int = 3

public const val RLIMIT_CORE: Int = 4

public const val RLIMIT_RSS: Int = 5

public const val RLIMIT_MEMLOCK: Int = 6

public const val RLIMIT_NPROC: Int = 7

public const val RLIMIT_NOFILE: Int = 8

public const val RLIMIT_SBSIZE: Int = 9

public const val RLIMIT_VMEM: Int = 10

public const val RLIMIT_AS: Int = RLIMIT_VMEM

public const val RLIM_INFINITY: Long = 0x7fff_ffff_ffff_ffffL

public const val RUSAGE_SELF: Int = 0

public const val RUSAGE_CHILDREN: Int = -1

public const val CLOCK_REALTIME: Int = 0

public const val CLOCK_VIRTUAL: Int = 1

public const val CLOCK_PROF: Int = 2

public const val CLOCK_MONOTONIC: Int = 4

public const val CLOCK_UPTIME: Int = 5

public const val CLOCK_UPTIME_PRECISE: Int = 7

public const val CLOCK_UPTIME_FAST: Int = 8

public const val CLOCK_REALTIME_PRECISE: Int = 9

public const val CLOCK_REALTIME_FAST: Int = 10

public const val CLOCK_MONOTONIC_PRECISE: Int = 11

public const val CLOCK_MONOTONIC_FAST: Int = 12

public const val CLOCK_SECOND: Int = 13

public const val CLOCK_THREAD_CPUTIME_ID: Int = 14

public const val CLOCK_PROCESS_CPUTIME_ID: Int = 15

public const val MADV_NORMAL: Int = 0

public const val MADV_RANDOM: Int = 1

public const val MADV_SEQUENTIAL: Int = 2

public const val MADV_WILLNEED: Int = 3

public const val MADV_DONTNEED: Int = 4

public const val MADV_FREE: Int = 5

public const val MADV_NOSYNC: Int = 6

public const val MADV_AUTOSYNC: Int = 7

public const val MADV_NOCORE: Int = 8

public const val MADV_CORE: Int = 9

public const val MINCORE_INCORE: Int = 0x1

public const val MINCORE_REFERENCED: Int = 0x2

public const val MINCORE_MODIFIED: Int = 0x4

public const val MINCORE_REFERENCED_OTHER: Int = 0x8

public const val MINCORE_MODIFIED_OTHER: Int = 0x10

public const val AF_UNSPEC: Int = 0

public const val AF_LOCAL: Int = 1

public const val AF_UNIX: Int = AF_LOCAL

public const val AF_INET: Int = 2

public const val AF_IMPLINK: Int = 3

public const val AF_PUP: Int = 4

public const val AF_CHAOS: Int = 5

public const val AF_NETBIOS: Int = 6

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

public const val AF_ISDN: Int = 26

public const val AF_E164: Int = AF_ISDN

public const val pseudo_AF_KEY: Int = 27

public const val AF_INET6: Int = 28

public const val AF_NATM: Int = 29

public const val AF_ATM: Int = 30

public const val pseudo_AF_HDRCMPLT: Int = 31

public const val AF_NETGRAPH: Int = 32

public const val PF_UNSPEC: Int = AF_UNSPEC

public const val PF_LOCAL: Int = AF_LOCAL

public const val PF_UNIX: Int = PF_LOCAL

public const val PF_INET: Int = AF_INET

public const val PF_IMPLINK: Int = AF_IMPLINK

public const val PF_PUP: Int = AF_PUP

public const val PF_CHAOS: Int = AF_CHAOS

public const val PF_NETBIOS: Int = AF_NETBIOS

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

public const val PF_ISDN: Int = AF_ISDN

public const val PF_KEY: Int = pseudo_AF_KEY

public const val PF_INET6: Int = AF_INET6

public const val PF_NATM: Int = AF_NATM

public const val PF_ATM: Int = AF_ATM

public const val PF_NETGRAPH: Int = AF_NETGRAPH

public const val PIOD_READ_D: Int = 1

public const val PIOD_WRITE_D: Int = 2

public const val PIOD_READ_I: Int = 3

public const val PIOD_WRITE_I: Int = 4

public const val PT_TRACE_ME: Int = 0

public const val PT_READ_I: Int = 1

public const val PT_READ_D: Int = 2

public const val PT_WRITE_I: Int = 4

public const val PT_WRITE_D: Int = 5

public const val PT_CONTINUE: Int = 7

public const val PT_KILL: Int = 8

public const val PT_STEP: Int = 9

public const val PT_ATTACH: Int = 10

public const val PT_DETACH: Int = 11

public const val PT_IO: Int = 12

public const val SOMAXCONN: Int = 128

public const val MSG_OOB: Int = 0x00000001

public const val MSG_PEEK: Int = 0x00000002

public const val MSG_DONTROUTE: Int = 0x00000004

public const val MSG_EOR: Int = 0x00000008

public const val MSG_TRUNC: Int = 0x00000010

public const val MSG_CTRUNC: Int = 0x00000020

public const val MSG_WAITALL: Int = 0x00000040

public const val MSG_DONTWAIT: Int = 0x00000080

public const val MSG_EOF: Int = 0x00000100

public const val SCM_TIMESTAMP: Int = 0x02

public const val SCM_CREDS: Int = 0x03

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_RAW: Int = 3

public const val SOCK_RDM: Int = 4

public const val SOCK_SEQPACKET: Int = 5

public const val SOCK_CLOEXEC: Int = 0x10000000

public const val SOCK_NONBLOCK: Int = 0x20000000

public const val SOCK_MAXADDRLEN: Int = 255

public const val IP_TTL: Int = 4

public const val IP_HDRINCL: Int = 2

public const val IP_RECVDSTADDR: Int = 7

public const val IP_SENDSRCADDR: Int = IP_RECVDSTADDR

public const val IP_ADD_MEMBERSHIP: Int = 12

public const val IP_DROP_MEMBERSHIP: Int = 13

public const val IP_RECVIF: Int = 20

public const val IP_RECVTTL: Int = 65

public const val IPV6_RECVHOPLIMIT: Int = 37

public const val IPV6_JOIN_GROUP: Int = 12

public const val IPV6_LEAVE_GROUP: Int = 13

public const val IPV6_CHECKSUM: Int = 26

public const val IPV6_RECVPKTINFO: Int = 36

public const val IPV6_PKTINFO: Int = 46

public const val IPV6_HOPLIMIT: Int = 47

public const val IPV6_RECVTCLASS: Int = 57

public const val IPV6_TCLASS: Int = 61

public const val IP_ADD_SOURCE_MEMBERSHIP: Int = 70

public const val IP_DROP_SOURCE_MEMBERSHIP: Int = 71

public const val IP_BLOCK_SOURCE: Int = 72

public const val IP_UNBLOCK_SOURCE: Int = 73

public const val TCP_NOPUSH: Int = 4

public const val TCP_NOOPT: Int = 8

public const val TCP_KEEPIDLE: Int = 256

public const val TCP_KEEPINTVL: Int = 512

public const val TCP_KEEPCNT: Int = 1024

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

public const val SO_NOSIGPIPE: Int = 0x0800

public const val SO_ACCEPTFILTER: Int = 0x1000

public const val SO_SNDBUF: Int = 0x1001

public const val SO_RCVBUF: Int = 0x1002

public const val SO_SNDLOWAT: Int = 0x1003

public const val SO_RCVLOWAT: Int = 0x1004

public const val SO_SNDTIMEO: Int = 0x1005

public const val SO_RCVTIMEO: Int = 0x1006

public const val SO_ERROR: Int = 0x1007

public const val SO_TYPE: Int = 0x1008

public const val LOCAL_PEERCRED: Int = 1

public const val RTF_XRESOLVE: Int = 0x200

public const val RTF_LLINFO: Int = 0x400

public const val RTF_PROTO3: Int = 0x40000

public const val RTF_PINNED: Int = 0x100000

public const val RTF_LOCAL: Int = 0x200000

public const val RTF_BROADCAST: Int = 0x400000

public const val RTF_MULTICAST: Int = 0x800000

public const val RTM_LOCK: Int = 0x8

public const val RTM_RESOLVE: Int = 0xb

public const val RTM_NEWADDR: Int = 0xc

public const val RTM_DELADDR: Int = 0xd

public const val RTM_IFINFO: Int = 0xe

public const val RTM_NEWMADDR: Int = 0xf

public const val RTM_DELMADDR: Int = 0x10

public const val RTM_IFANNOUNCE: Int = 0x11

public const val RTM_IEEE80211: Int = 0x12

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val LOCK_SH: Int = 1

public const val LOCK_EX: Int = 2

public const val LOCK_NB: Int = 4

public const val LOCK_UN: Int = 8

public const val MAP_COPY: Int = 0x0002

public const val MAP_RENAME: Int = 0x0020

public const val MAP_NORESERVE: Int = 0x0040

public const val MAP_HASSEMAPHORE: Int = 0x0200

public const val MAP_STACK: Int = 0x0400

public const val MAP_NOSYNC: Int = 0x0800

public const val MAP_NOCORE: Int = 0x020000

public const val IPPROTO_RAW: Int = 255

public const val _PC_LINK_MAX: Int = 1

public const val _PC_MAX_CANON: Int = 2

public const val _PC_MAX_INPUT: Int = 3

public const val _PC_NAME_MAX: Int = 4

public const val _PC_PATH_MAX: Int = 5

public const val _PC_PIPE_BUF: Int = 6

public const val _PC_CHOWN_RESTRICTED: Int = 7

public const val _PC_NO_TRUNC: Int = 8

public const val _PC_VDISABLE: Int = 9

public const val _PC_ALLOC_SIZE_MIN: Int = 10

public const val _PC_FILESIZEBITS: Int = 12

public const val _PC_REC_INCR_XFER_SIZE: Int = 14

public const val _PC_REC_MAX_XFER_SIZE: Int = 15

public const val _PC_REC_MIN_XFER_SIZE: Int = 16

public const val _PC_REC_XFER_ALIGN: Int = 17

public const val _PC_SYMLINK_MAX: Int = 18

public const val _PC_MIN_HOLE_SIZE: Int = 21

public const val _PC_ASYNC_IO: Int = 53

public const val _PC_PRIO_IO: Int = 54

public const val _PC_SYNC_IO: Int = 55

public const val _PC_ACL_EXTENDED: Int = 59

public const val _PC_ACL_PATH_MAX: Int = 60

public const val _PC_CAP_PRESENT: Int = 61

public const val _PC_INF_PRESENT: Int = 62

public const val _PC_MAC_PRESENT: Int = 63

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

public const val _SC_MAPPED_FILES: Int = 29

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

public const val _SC_PAGESIZE: Int = 47

public const val _SC_PAGE_SIZE: Int = _SC_PAGESIZE

public const val _SC_RTSIG_MAX: Int = 48

public const val _SC_SEM_NSEMS_MAX: Int = 49

public const val _SC_SEM_VALUE_MAX: Int = 50

public const val _SC_SIGQUEUE_MAX: Int = 51

public const val _SC_TIMER_MAX: Int = 52

public const val _SC_IOV_MAX: Int = 56

public const val _SC_NPROCESSORS_CONF: Int = 57

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

public const val _SC_NPROCESSORS_ONLN: Int = 58

public const val _SC_GETGR_R_SIZE_MAX: Int = 70

public const val _SC_GETPW_R_SIZE_MAX: Int = 71

public const val _SC_HOST_NAME_MAX: Int = 72

public const val _SC_LOGIN_NAME_MAX: Int = 73

public const val _SC_MONOTONIC_CLOCK: Int = 74

public const val _SC_MQ_PRIO_MAX: Int = 75

public const val _SC_READER_WRITER_LOCKS: Int = 76

public const val _SC_REGEXP: Int = 77

public const val _SC_SHELL: Int = 78

public const val _SC_SPAWN: Int = 79

public const val _SC_SPIN_LOCKS: Int = 80

public const val _SC_SPORADIC_SERVER: Int = 81

public const val _SC_THREAD_ATTR_STACKADDR: Int = 82

public const val _SC_THREAD_ATTR_STACKSIZE: Int = 83

public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 85

public const val _SC_THREAD_KEYS_MAX: Int = 86

public const val _SC_THREAD_PRIO_INHERIT: Int = 87

public const val _SC_THREAD_PRIO_PROTECT: Int = 88

public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 89

public const val _SC_THREAD_PROCESS_SHARED: Int = 90

public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 91

public const val _SC_THREAD_SPORADIC_SERVER: Int = 92

public const val _SC_THREAD_STACK_MIN: Int = 93

public const val _SC_THREAD_THREADS_MAX: Int = 94

public const val _SC_TIMEOUTS: Int = 95

public const val _SC_THREADS: Int = 96

public const val _SC_TRACE: Int = 97

public const val _SC_TRACE_EVENT_FILTER: Int = 98

public const val _SC_TRACE_INHERIT: Int = 99

public const val _SC_TRACE_LOG: Int = 100

public const val _SC_TTY_NAME_MAX: Int = 101

public const val _SC_TYPED_MEMORY_OBJECTS: Int = 102

public const val _SC_V6_ILP32_OFF32: Int = 103

public const val _SC_V6_ILP32_OFFBIG: Int = 104

public const val _SC_V6_LP64_OFF64: Int = 105

public const val _SC_V6_LPBIG_OFFBIG: Int = 106

public const val _SC_ATEXIT_MAX: Int = 107

public const val _SC_XOPEN_CRYPT: Int = 108

public const val _SC_XOPEN_ENH_I18N: Int = 109

public const val _SC_XOPEN_LEGACY: Int = 110

public const val _SC_XOPEN_REALTIME: Int = 111

public const val _SC_XOPEN_REALTIME_THREADS: Int = 112

public const val _SC_XOPEN_SHM: Int = 113

public const val _SC_XOPEN_STREAMS: Int = 114

public const val _SC_XOPEN_UNIX: Int = 115

public const val _SC_XOPEN_VERSION: Int = 116

public const val _SC_XOPEN_XCU_VERSION: Int = 117

public const val _SC_IPV6: Int = 118

public const val _SC_RAW_SOCKETS: Int = 119

public const val _SC_SYMLOOP_MAX: Int = 120

public const val _SC_PHYS_PAGES: Int = 121

public const val _CS_PATH: Int = 1

// PTHREAD_MUTEX_INITIALIZER: FFI boundary initializer — zero-valued struct, not representable in Kotlin
// PTHREAD_COND_INITIALIZER: FFI boundary initializer — zero-valued struct, not representable in Kotlin
// PTHREAD_RWLOCK_INITIALIZER: FFI boundary initializer — zero-valued struct, not representable in Kotlin
public const val PTHREAD_MUTEX_ERRORCHECK: Int = 1

public const val PTHREAD_MUTEX_RECURSIVE: Int = 2

public const val PTHREAD_MUTEX_NORMAL: Int = 3

public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_ERRORCHECK

public const val SCHED_FIFO: Int = 1

public const val SCHED_OTHER: Int = 2

public const val SCHED_RR: Int = 3

public const val FD_SETSIZE: ULong = 1024uL

public const val ST_NOSUID: ULong = 2uL

public const val NI_MAXHOST: ULong = 1025uL

public const val XUCRED_VERSION: UInt = 0u

public const val RTLD_LOCAL: Int = 0

public const val RTLD_NODELETE: Int = 0x1000

public const val RTLD_NOLOAD: Int = 0x2000

public const val RTLD_GLOBAL: Int = 0x100

public val LOG_NTP: Int = 12 shl 3

public val LOG_SECURITY: Int = 13 shl 3

public val LOG_CONSOLE: Int = 14 shl 3

public const val LOG_NFACILITIES: Int = 24

public const val TIOCEXCL: ULong = 0x2000740duL

public const val TIOCNXCL: ULong = 0x2000740euL

public const val TIOCFLUSH: ULong = 0x80047410uL

public const val TIOCGETA: ULong = 0x402c7413uL

public const val TIOCSETA: ULong = 0x802c7414uL

public const val TIOCSETAW: ULong = 0x802c7415uL

public const val TIOCSETAF: ULong = 0x802c7416uL

public const val TIOCGETD: ULong = 0x4004741auL

public const val TIOCSETD: ULong = 0x8004741buL

public const val TIOCGDRAINWAIT: ULong = 0x40047456uL

public const val TIOCSDRAINWAIT: ULong = 0x80047457uL

public const val TIOCMGDTRWAIT: ULong = 0x4004745auL

public const val TIOCMSDTRWAIT: ULong = 0x8004745buL

public const val TIOCDRAIN: ULong = 0x2000745euL

public const val TIOCEXT: ULong = 0x80047460uL

public const val TIOCSCTTY: ULong = 0x20007461uL

public const val TIOCCONS: ULong = 0x80047462uL

public const val TIOCGSID: ULong = 0x40047463uL

public const val TIOCSTAT: ULong = 0x20007465uL

public const val TIOCUCNTL: ULong = 0x80047466uL

public const val TIOCSWINSZ: ULong = 0x80087467uL

public const val TIOCGWINSZ: ULong = 0x40087468uL

public const val TIOCMGET: ULong = 0x4004746auL

public const val TIOCM_LE: Int = 0x1

public const val TIOCM_DTR: Int = 0x2

public const val TIOCM_RTS: Int = 0x4

public const val TIOCM_ST: Int = 0x8

public const val TIOCM_SR: Int = 0x10

public const val TIOCM_CTS: Int = 0x20

public const val TIOCM_RI: Int = 0x80

public const val TIOCM_DSR: Int = 0x100

public const val TIOCM_CD: Int = 0x40

public const val TIOCM_CAR: Int = 0x40

public const val TIOCM_RNG: Int = 0x80

public const val TIOCMBIC: ULong = 0x8004746buL

public const val TIOCMBIS: ULong = 0x8004746cuL

public const val TIOCMSET: ULong = 0x8004746duL

public const val TIOCSTART: ULong = 0x2000746euL

public const val TIOCSTOP: ULong = 0x2000746fuL

public const val TIOCPKT: ULong = 0x80047470uL

public const val TIOCPKT_DATA: Int = 0x0

public const val TIOCPKT_FLUSHREAD: Int = 0x1

public const val TIOCPKT_FLUSHWRITE: Int = 0x2

public const val TIOCPKT_STOP: Int = 0x4

public const val TIOCPKT_START: Int = 0x8

public const val TIOCPKT_NOSTOP: Int = 0x10

public const val TIOCPKT_DOSTOP: Int = 0x20

public const val TIOCPKT_IOCTL: Int = 0x40

public const val TIOCNOTTY: ULong = 0x20007471uL

public const val TIOCSTI: ULong = 0x80017472uL

public const val TIOCOUTQ: ULong = 0x40047473uL

public const val TIOCSPGRP: ULong = 0x80047476uL

public const val TIOCGPGRP: ULong = 0x40047477uL

public const val TIOCCDTR: ULong = 0x20007478uL

public const val TIOCSDTR: ULong = 0x20007479uL

public const val TTYDISC: Int = 0x0

public const val SLIPDISC: Int = 0x4

public const val PPPDISC: Int = 0x5

public const val NETGRAPHDISC: Int = 0x6

public const val BIOCGRSIG: ULong = 0x40044272uL

public const val BIOCSRSIG: ULong = 0x80044273uL

public const val BIOCSDLT: ULong = 0x80044278uL

public const val BIOCGSEESENT: ULong = 0x40044276uL

public const val BIOCSSEESENT: ULong = 0x80044277uL

public const val BIOCGDLTLIST: ULong = 0xc0104279uL

public const val BIOCSETF: ULong = 0x80104267uL

public const val FIODTYPE: ULong = 0x4004667auL

public const val FIOGETLBA: ULong = 0x40046679uL

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

public const val CRTSCTS: UInt = 0x00030000u

public const val CCTS_OFLOW: UInt = 0x00010000u

public const val CRTS_IFLOW: UInt = 0x00020000u

public const val CDTR_IFLOW: UInt = 0x00040000u

public const val CDSR_OFLOW: UInt = 0x00080000u

public const val CCAR_OFLOW: UInt = 0x00100000u

public const val VERASE2: ULong = 7uL

public const val OCRNL: UInt = 0x10u

public const val ONOCR: UInt = 0x20u

public const val ONLRET: UInt = 0x40u

public const val CMGROUP_MAX: ULong = 16uL

public const val EUI64_LEN: ULong = 8uL

public const val SIZEOF_LONG: ULong = 8uL

public const val BPF_ALIGNMENT: ULong = SIZEOF_LONG

public val RTP_PRIO_MIN: UShort = (0).toUShort()

public val RTP_PRIO_MAX: UShort = (31).toUShort()

public const val RTP_LOOKUP: Int = 0

public const val RTP_SET: Int = 1

public const val UF_SETTABLE: ULong = 0x0000ffffuL

public const val UF_NODUMP: ULong = 0x00000001uL

public const val UF_IMMUTABLE: ULong = 0x00000002uL

public const val UF_APPEND: ULong = 0x00000004uL

public const val UF_OPAQUE: ULong = 0x00000008uL

public const val UF_NOUNLINK: ULong = 0x00000010uL

public const val SF_SETTABLE: ULong = 0xffff0000uL

public const val SF_ARCHIVED: ULong = 0x00010000uL

public const val SF_IMMUTABLE: ULong = 0x00020000uL

public const val SF_APPEND: ULong = 0x00040000uL

public const val SF_NOUNLINK: ULong = 0x00100000uL

public const val TIMER_ABSTIME: Int = 1

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

public const val REG_ENOSYS: Int = -1

public const val REG_ILLSEQ: Int = 17

public const val IPC_PRIVATE: Long = 0

public const val IPC_CREAT: Int = 512

public const val IPC_EXCL: Int = 1024

public const val IPC_NOWAIT: Int = 2048

public const val IPC_RMID: Int = 0

public const val IPC_SET: Int = 1

public const val IPC_STAT: Int = 2

public const val IPC_R: Int = 256

public const val IPC_W: Int = 128

public const val IPC_M: Int = 4096

public const val SHM_RDONLY: Int = 4096

public const val SHM_RND: Int = 8192

public const val SHM_R: Int = 256

public const val SHM_W: Int = 128

public const val KENV_GET: Int = 0

public const val KENV_SET: Int = 1

public const val KENV_UNSET: Int = 2

public const val KENV_DUMP: Int = 3

public const val KENV_MNAMELEN: Int = 128

public const val KENV_MVALLEN: Int = 128

public const val RB_ASKNAME: Int = 0x001

public const val RB_SINGLE: Int = 0x002

public const val RB_NOSYNC: Int = 0x004

public const val RB_HALT: Int = 0x008

public const val RB_INITNAME: Int = 0x010

public const val RB_DFLTROOT: Int = 0x020

public const val RB_KDB: Int = 0x040

public const val RB_RDONLY: Int = 0x080

public const val RB_DUMP: Int = 0x100

public const val RB_MINIROOT: Int = 0x200

public const val RB_VERBOSE: Int = 0x800

public const val RB_SERIAL: Int = 0x1000

public const val RB_CDROM: Int = 0x2000

public const val RB_POWEROFF: Int = 0x4000

public const val RB_GDB: Int = 0x8000

public const val RB_MUTE: Int = 0x10000

public const val RB_SELFTEST: Int = 0x20000

public const val GRND_NONBLOCK: UInt = 0x1u

public const val GRND_RANDOM: UInt = 0x2u

public const val GRND_INSECURE: UInt = 0x4u

public const val POSIX_SPAWN_RESETIDS: Int = 0x01

public const val POSIX_SPAWN_SETPGROUP: Int = 0x02

public const val POSIX_SPAWN_SETSCHEDPARAM: Int = 0x04

public const val POSIX_SPAWN_SETSCHEDULER: Int = 0x08

public const val POSIX_SPAWN_SETSIGDEF: Int = 0x10

public const val POSIX_SPAWN_SETSIGMASK: Int = 0x20
