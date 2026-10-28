package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public const val EXIT_SUCCESS: Int = 0

public const val EXIT_FAILURE: Int = 1

public const val EAI_SERVICE: Int = 9

public const val EAI_SOCKTYPE: Int = 10

public const val EAI_SYSTEM: Int = 11

public const val INT_MAX: Int = 0x7fffffff

public const val INT_MIN: Int = -INT_MAX - 1

public const val CLOCK_REALTIME: Int = 0x0

public const val CLOCK_MONOTONIC: Int = 0x1

public const val CLOCK_PROCESS_CPUTIME_ID: Int = 0x2

public const val CLOCK_THREAD_CPUTIME_ID: Int = 0x3

public const val TIMER_ABSTIME: Int = 0x1

public const val TIMER_RELTIME: Int = 0x0

public const val PTHREAD_INITIALIZED_OBJ: Int = 0xF70990EF.toInt()

public const val PTHREAD_DESTROYED_OBJ: Int = -1

public const val PTHREAD_VALID_OBJ: Int = 0xEC542A37.toInt()

public const val PTHREAD_INVALID_OBJ: Int = -1

public const val PTHREAD_UNUSED_YET_OBJ: Int = -1

public const val PTHREAD_PRIO_NONE: Int = 0

public const val PTHREAD_PRIO_INHERIT: Int = 1

public const val PTHREAD_PRIO_PROTECT: Int = 2

public const val PTHREAD_MUTEX_NORMAL: Int = 0

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 1

public const val PTHREAD_MUTEX_RECURSIVE: Int = 2

public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL

public const val PTHREAD_STACK_MIN: ULong = 4096uL

public const val _PTHREAD_SHARED_SEM_NAME_MAX: ULong = 30uL

public const val SCHED_FIFO: Int = 0x01

public const val SCHED_RR: Int = 0x02

public const val SCHED_OTHER: Int = 0x04

public const val SCHED_SPORADIC: Int = 0x08

public const val PRIO_PROCESS: UInt = 0u

public const val SCHED_FIFO_HIGH_PRI: Int = 255

public const val SCHED_FIFO_LOW_PRI: Int = 0

public const val SCHED_RR_HIGH_PRI: Int = 255

public const val SCHED_RR_LOW_PRI: Int = 0

public const val SCHED_SPORADIC_HIGH_PRI: Int = 255

public const val SCHED_SPORADIC_LOW_PRI: Int = 0

public const val ERROR: Int = -1

public const val OK: Int = 0

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

public const val ENOTEMPTY: Int = 15

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

public const val ENAMETOOLONG: Int = 26

public const val EFBIG: Int = 27

public const val ENOSPC: Int = 28

public const val ESPIPE: Int = 29

public const val EROFS: Int = 30

public const val EMLINK: Int = 31

public const val EPIPE: Int = 32

public const val EDEADLK: Int = 33

public const val ENOLCK: Int = 34

public const val ENOTSUP: Int = 35

public const val EMSGSIZE: Int = 36

public const val EDOM: Int = 37

public const val ERANGE: Int = 38

public const val EDOOM: Int = 39

public const val EDESTADDRREQ: Int = 40

public const val EPROTOTYPE: Int = 41

public const val ENOPROTOOPT: Int = 42

public const val EPROTONOSUPPORT: Int = 43

public const val ESOCKTNOSUPPORT: Int = 44

public const val EOPNOTSUPP: Int = 45

public const val EPFNOSUPPORT: Int = 46

public const val EAFNOSUPPORT: Int = 47

public const val EADDRINUSE: Int = 48

public const val EADDRNOTAVAIL: Int = 49

public const val ENOTSOCK: Int = 50

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

public const val ENETDOWN: Int = 62

public const val ETXTBSY: Int = 63

public const val ELOOP: Int = 64

public const val EHOSTUNREACH: Int = 65

public const val ENOTBLK: Int = 66

public const val EHOSTDOWN: Int = 67

public const val EINPROGRESS: Int = 68

public const val EALREADY: Int = 69

public const val EWOULDBLOCK: Int = 70

public const val ENOSYS: Int = 71

public const val ECANCELED: Int = 72

public const val ENOSR: Int = 74

public const val ENOSTR: Int = 75

public const val EPROTO: Int = 76

public const val EBADMSG: Int = 77

public const val ENODATA: Int = 78

public const val ETIME: Int = 79

public const val ENOMSG: Int = 80

public const val EFPOS: Int = 81

public const val EILSEQ: Int = 82

public const val EDQUOT: Int = 83

public const val EIDRM: Int = 84

public const val EOVERFLOW: Int = 85

public const val EMULTIHOP: Int = 86

public const val ENOLINK: Int = 87

public const val ESTALE: Int = 88

public const val EOWNERDEAD: Int = 89

public const val ENOTRECOVERABLE: Int = 90

internal const val M_nfsStat: Int = 48 shl 16

// internal offset values for below constants
internal const val taskErrorBase: Int = 0x00030000

public const val S_nfsLib_NFS_OK: Int = OK

public const val S_nfsLib_NFSERR_PERM: Int = EPERM

public const val S_nfsLib_NFSERR_NOENT: Int = ENOENT

public const val S_nfsLib_NFSERR_IO: Int = EIO

public const val S_nfsLib_NFSERR_NXIO: Int = ENXIO

public const val S_nfsLib_NFSERR_ACCESS: Int = EACCES

public const val S_nfsLib_NFSERR_EXIST: Int = EEXIST

public const val S_nfsLib_NFSERR_ENODEV: Int = ENODEV

public const val S_nfsLib_NFSERR_NOTDIR: Int = ENOTDIR

public const val S_nfsLib_NFSERR_ISDIR: Int = EISDIR

public const val S_nfsLib_NFSERR_INVAL: Int = EINVAL

public const val S_nfsLib_NFSERR_FBIG: Int = EFBIG

public const val S_nfsLib_NFSERR_NOSPC: Int = ENOSPC

public const val S_nfsLib_NFSERR_ROFS: Int = EROFS

public const val S_nfsLib_NFSERR_NAMETOOLONG: Int = ENAMETOOLONG

public const val S_nfsLib_NFSERR_NOTEMPTY: Int = ENOTEMPTY

public const val S_nfsLib_NFSERR_DQUOT: Int = EDQUOT

public const val S_nfsLib_NFSERR_STALE: Int = ESTALE

public val S_nfsLib_NFSERR_WFLUSH: Int = M_nfsStat or Nfsstat.NFSERR_WFLUSH.value

public val S_nfsLib_NFSERR_REMOTE: Int = M_nfsStat or Nfsstat.NFSERR_REMOTE.value

public val S_nfsLib_NFSERR_BADHANDLE: Int = M_nfsStat or Nfsstat.NFSERR_BADHANDLE.value

public val S_nfsLib_NFSERR_NOT_SYNC: Int = M_nfsStat or Nfsstat.NFSERR_NOT_SYNC.value

public val S_nfsLib_NFSERR_BAD_COOKIE: Int = M_nfsStat or Nfsstat.NFSERR_BAD_COOKIE.value

public const val S_nfsLib_NFSERR_NOTSUPP: Int = EOPNOTSUPP

public val S_nfsLib_NFSERR_TOOSMALL: Int = M_nfsStat or Nfsstat.NFSERR_TOOSMALL.value

public const val S_nfsLib_NFSERR_SERVERFAULT: Int = EIO

public val S_nfsLib_NFSERR_BADTYPE: Int = M_nfsStat or Nfsstat.NFSERR_BADTYPE.value

public val S_nfsLib_NFSERR_JUKEBOX: Int = M_nfsStat or Nfsstat.NFSERR_JUKEBOX.value

public val S_taskLib_NAME_NOT_FOUND: Int = taskErrorBase + 0x0065

public val S_taskLib_TASK_HOOK_TABLE_FULL: Int = taskErrorBase + 0x0066

public val S_taskLib_TASK_HOOK_NOT_FOUND: Int = taskErrorBase + 0x0067

public val S_taskLib_ILLEGAL_PRIORITY: Int = taskErrorBase + 0x006D

public const val VX_TASK_NAME_LENGTH: Int = 31

public const val VX_TASK_RENAME_LENGTH: Int = 16

public const val TCIFLUSH: Int = 0

public const val VINTR: ULong = 0uL

public const val VQUIT: ULong = 1uL

public const val VERASE: ULong = 2uL

public const val VKILL: ULong = 3uL

public const val VEOF: ULong = 4uL

public const val VMIN: ULong = 16uL

public const val VTIME: ULong = 17uL

internal const val semErrorBase: Int = 0x00160000

internal const val objErrorBase: Int = 0x003d0000

public const val S_semLib_INVALID_STATE: Int = semErrorBase + 0x0065

public const val S_semLib_INVALID_OPTION: Int = semErrorBase + 0x0066

public const val S_semLib_INVALID_QUEUE_TYPE: Int = semErrorBase + 0x0067

public const val S_semLib_INVALID_OPERATION: Int = semErrorBase + 0x0068

public const val S_objLib_OBJ_ID_ERROR: Int = objErrorBase + 0x0001

public const val S_objLib_OBJ_UNAVAILABLE: Int = objErrorBase + 0x0002

public const val S_objLib_OBJ_DELETED: Int = objErrorBase + 0x0003

public const val S_objLib_OBJ_TIMEOUT: Int = objErrorBase + 0x0004

public const val S_objLib_OBJ_NO_METHOD: Int = objErrorBase + 0x0005

public const val IPPROTO_IP: Int = 0

public const val IPPROTO_ICMP: Int = 1

public const val IPPROTO_TCP: Int = 6

public const val IPPROTO_IPV6: Int = 41

public const val IPPROTO_ICMPV6: Int = 58

public const val INADDR_ANY: UInt = 0u

public const val INADDR_LOOPBACK: UInt = 2130706433u

public const val INADDR_BROADCAST: UInt = 4294967295u

public const val INADDR_NONE: UInt = 4294967295u

public val IN6ADDR_LOOPBACK_INIT: In6Addr = In6Addr(s6Addr = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 1u))

public val IN6ADDR_ANY_INIT: In6Addr = In6Addr(s6Addr = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public const val IPPROTO_UDP: Int = 17

public const val IP_TTL: Int = 4

public const val IP_MULTICAST_IF: Int = 9

public const val IP_MULTICAST_TTL: Int = 10

public const val IP_MULTICAST_LOOP: Int = 11

public const val IP_ADD_MEMBERSHIP: Int = 12

public const val IP_DROP_MEMBERSHIP: Int = 13

public const val NI_MAXHOST: Int = 1025

public const val IPV6_V6ONLY: Int = 1

public const val IPV6_UNICAST_HOPS: Int = 4

public const val IPV6_MULTICAST_IF: Int = 9

public const val IPV6_MULTICAST_HOPS: Int = 10

public const val IPV6_MULTICAST_LOOP: Int = 11

public const val IPV6_ADD_MEMBERSHIP: Int = 12

public const val IPV6_DROP_MEMBERSHIP: Int = 13

public const val S_IFMT: Int = 61440

public const val S_IFIFO: Int = 4096

public const val S_IFCHR: Int = 8192

public const val S_IFDIR: Int = 16384

public const val S_IFBLK: Int = 24576

public const val S_IFREG: Int = 32768

public const val S_IFLNK: Int = 40960

public const val S_IFSHM: Int = 45056

public const val S_IFSOCK: Int = 49152

public const val S_ISUID: Int = 2048

public const val S_ISGID: Int = 1024

public const val S_ISTXT: Int = 512

public const val S_ISVTX: Int = 512

public const val S_IRUSR: Int = 256

public const val S_IWUSR: Int = 128

public const val S_IXUSR: Int = 64

public const val S_IRWXU: Int = 448

public const val S_IRGRP: Int = 32

public const val S_IWGRP: Int = 16

public const val S_IXGRP: Int = 8

public const val S_IRWXG: Int = 56

public const val S_IROTH: Int = 4

public const val S_IWOTH: Int = 2

public const val S_IXOTH: Int = 1

public const val S_IRWXO: Int = 7

public const val UTIME_OMIT: Long = 0x3ffffffe

public const val UTIME_NOW: Long = 0x3fffffff

public const val SOL_SOCKET: Int = 0xffff

public const val SOMAXCONN: Int = 128

public const val SO_DEBUG: Int = 0x0001

public const val SO_REUSEADDR: Int = 0x0004

public const val SO_KEEPALIVE: Int = 0x0008

public const val SO_DONTROUTE: Int = 0x0010

public const val SO_RCVLOWAT: Int = 0x0012

public const val SO_SNDLOWAT: Int = 0x0013

public const val SO_SNDTIMEO: Int = 0x1005

public const val SO_ACCEPTCONN: Int = 0x001e

public const val SO_BROADCAST: Int = 0x0020

public const val SO_USELOOPBACK: Int = 0x0040

public const val SO_LINGER: Int = 0x0080

public const val SO_REUSEPORT: Int = 0x0200

public const val SO_VLAN: Int = 0x8000

public const val SO_SNDBUF: Int = 0x1001

public const val SO_RCVBUF: Int = 0x1002

public const val SO_RCVTIMEO: Int = 0x1006

public const val SO_ERROR: Int = 0x1007

public const val SO_TYPE: Int = 0x1008

public const val SO_BINDTODEVICE: Int = 0x1010

public const val SO_OOBINLINE: Int = 0x1011

public const val SO_CONNTIMEO: Int = 0x100a

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_RAW: Int = 3

public const val SOCK_RDM: Int = 4

public const val SOCK_SEQPACKET: Int = 5

public const val SOCK_PACKET: Int = 10

public const val _SS_MAXSIZE: ULong = 128uL

// _SS_ALIGNSIZE = size_of<UInt>() (computed at the FFI boundary)
// _SS_PAD2SIZE = _SS_MAXSIZE - size_of<CUChar>() - size_of<SaFamilyT>() - _SS_PAD1SIZE - _SS_ALIGNSIZE
public const val MSG_OOB: Int = 0x0001

public const val MSG_PEEK: Int = 0x0002

public const val MSG_DONTROUTE: Int = 0x0004

public const val MSG_EOR: Int = 0x0008

public const val MSG_TRUNC: Int = 0x0010

public const val MSG_CTRUNC: Int = 0x0020

public const val MSG_WAITALL: Int = 0x0040

public const val MSG_DONTWAIT: Int = 0x0080

public const val MSG_EOF: Int = 0x0100

public const val MSG_EXP: Int = 0x0200

public const val MSG_MBUF: Int = 0x0400

public const val MSG_NOTIFICATION: Int = 0x0800

public const val MSG_COMPAT: Int = 0x8000

public const val AF_UNSPEC: Int = 0

public const val AF_LOCAL: Int = 1

public const val PF_LOCAL: Int = AF_LOCAL

public const val PF_UNIX: Int = PF_LOCAL

public const val PF_UNSPEC: Int = AF_UNSPEC

public const val AF_UNIX: Int = AF_LOCAL

public const val AF_INET: Int = 2

public const val PF_INET: Int = AF_INET

public const val AF_NETLINK: Int = 16

public const val AF_ROUTE: Int = 17

public const val AF_LINK: Int = 18

public const val AF_PACKET: Int = 19

public const val pseudo_AF_KEY: Int = 27

public const val AF_KEY: Int = pseudo_AF_KEY

public const val AF_INET6: Int = 28

public const val PF_INET6: Int = AF_INET6

public const val AF_SOCKDEV: Int = 31

public const val AF_TIPC: Int = 33

public const val AF_MIPC: Int = 34

public const val AF_MIPC_SAFE: Int = 35

public const val AF_MAX: Int = 39

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

public const val B57600: UInt = 57600u

public const val B115200: UInt = 115200u

public const val B230400: UInt = 230400u

public const val IGNBRK: UInt = 0x00000001u

public const val BRKINT: UInt = 0x00000002u

public const val IGNCR: UInt = 0x00000200u

public const val IGNPAR: UInt = 0x00000000u

public const val INPCK: UInt = 0x00000020u

public const val ISTRIP: UInt = 0x00000040u

public const val INLCR: UInt = 0x00000100u

public const val ISIG: UInt = 0x00000001u

public const val IXOFF: UInt = 0x00010000u

public const val IXON: UInt = 0x00002000u

public const val PARMRK: UInt = 0x00000000u

public const val NOFLSH: UInt = 0x00000000u

public const val NCCS: ULong = 20uL

public const val OPOST: UInt = 0x00000001u

public const val ONLCR: UInt = 0x00000004u

public const val ECHO: UInt = 0x00000010u

public const val OCRNL: UInt = 0x00000010u

public const val ECHOE: UInt = 0x00000020u

public const val ECHOK: UInt = 0x00000040u

public const val ECHONL: UInt = 0x00000100u

public const val IFNAMSIZ: ULong = 16uL

public const val IF_NAMESIZE: ULong = IFNAMSIZ

public const val CLOCAL: UInt = 0x1u

public const val CREAD: UInt = 0x2u

public const val CS5: UInt = 0x0u

public const val CS6: UInt = 0x4u

public const val CS7: UInt = 0x8u

public const val CS8: UInt = 0xcu

public const val CSTOPB: UInt = 0x20u

public const val CSIZE: UInt = 0xcu

public const val PARODD: UInt = 0x80u

public const val PARENB: UInt = 0x40u

public val DT_FIFO: UByte = (1).toUByte()

public val DT_CHR: UByte = (2).toUByte()

public val DT_DIR: UByte = (4).toUByte()

public val DT_BLK: UByte = (6).toUByte()

public val DT_REG: UByte = (8).toUByte()

public val DT_LNK: UByte = (10).toUByte()

public val DT_SOCK: UByte = (12).toUByte()

public const val FNM_NOMATCH: Int = 1

public const val FNM_NOESCAPE: Int = 1

public const val FNM_PATHNAME: Int = 2

public const val FNM_PERIOD: Int = 4

public const val FNM_CASEFOLD: Int = 16

public const val F_OK: Int = 0

public const val X_OK: Int = 1

public const val W_OK: Int = 2

public const val _PC_CHOWN_RESTRICTED: Int = 4

public const val _PC_LINK_MAX: Int = 6

public const val _PC_MAX_CANON: Int = 7

public const val _PC_MAX_INPUT: Int = 8

public const val _PC_NAME_MAX: Int = 9

public const val _PC_NO_TRUNC: Int = 10

public const val _PC_PATH_MAX: Int = 11

public const val _PC_PIPE_BUF: Int = 12

public const val _PC_VDISABLE: Int = 20

public const val HUPCL: UInt = 0x10u

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val ICANON: UInt = 0x00000002u

public const val ICRNL: UInt = 0x00000400u

public const val IEXTEN: UInt = 0x00000000u

public const val TCP_NODELAY: Int = 1

public const val TCP_MAXSEG: Int = 2

public const val TCP_NOPUSH: Int = 3

public const val TCP_KEEPIDLE: Int = 4

public const val TCP_KEEPINTVL: Int = 5

public const val TCP_KEEPCNT: Int = 6

public const val TCSANOW: Int = 0

public const val TCSADRAIN: Int = 1

public const val TCSAFLUSH: Int = 2

public const val FIONREAD: Int = 0x40040001

public const val FIOFLUSH: Int = 2

public const val FIOOPTIONS: Int = 3

public const val FIOBAUDRATE: Int = 4

public const val FIODISKFORMAT: Int = 5

public const val FIODISKINIT: Int = 6

public const val FIOSEEK: Int = 7

public const val FIOWHERE: Int = 8

public const val FIODIRENTRY: Int = 9

public const val FIORENAME: Int = 10

public const val FIOREADYCHANGE: Int = 11

public const val FIODISKCHANGE: Int = 13

public const val FIOCANCEL: Int = 14

public const val FIOSQUEEZE: Int = 15

public const val FIOGETNAME: Int = 18

public const val FIONBIO: Int = -1878786032

public const val PATH_MAX: Int = 1024

public const val _POSIX_PATH_MAX: Int = 256

public const val POLLIN: Short = 0x0001

public const val POLLPRI: Short = 0x0002

public const val POLLOUT: Short = 0x0004

public const val POLLRDNORM: Short = 0x0040

public const val POLLWRNORM: Short = POLLOUT

public const val POLLRDBAND: Short = 0x0080

public const val POLLWRBAND: Short = 0x0100

public const val POLLERR: Short = 0x0008

public const val POLLHUP: Short = 0x0010

public const val POLLNVAL: Short = 0x0020

public const val FD_CLOEXEC: Int = 1

public const val F_DUPFD: Int = 0

public const val F_GETFD: Int = 1

public const val F_SETFD: Int = 2

public const val F_GETFL: Int = 3

public const val F_SETFL: Int = 4

public const val F_GETOWN: Int = 5

public const val F_SETOWN: Int = 6

public const val F_GETLK: Int = 7

public const val F_SETLK: Int = 8

public const val F_SETLKW: Int = 9

public const val F_DUPFD_CLOEXEC: Int = 14

public const val LOG_EMERG: Int = 0

public const val LOG_ALERT: Int = 1

public const val LOG_CRIT: Int = 2

public const val LOG_ERR: Int = 3

public const val LOG_WARNING: Int = 4

public const val LOG_NOTICE: Int = 5

public const val LOG_INFO: Int = 6

public const val LOG_DEBUG: Int = 7

public val LOG_KERN: Int = 0 shl 3

public val LOG_USER: Int = 1 shl 3

public val LOG_MAIL: Int = 2 shl 3

public val LOG_DAEMON: Int = 3 shl 3

public val LOG_AUTH: Int = 4 shl 3

public val LOG_SYSLOG: Int = 5 shl 3

public val LOG_LPR: Int = 6 shl 3

public val LOG_NEWS: Int = 7 shl 3

public val LOG_UUCP: Int = 8 shl 3

public val LOG_LOCAL0: Int = 16 shl 3

public val LOG_LOCAL1: Int = 17 shl 3

public val LOG_LOCAL2: Int = 18 shl 3

public val LOG_LOCAL3: Int = 19 shl 3

public val LOG_LOCAL4: Int = 20 shl 3

public val LOG_LOCAL5: Int = 21 shl 3

public val LOG_LOCAL6: Int = 22 shl 3

public val LOG_LOCAL7: Int = 23 shl 3

public const val LOG_PID: Int = 0x01

public const val LOG_CONS: Int = 0x02

public const val LOG_ODELAY: Int = 0x04

public const val LOG_NDELAY: Int = 0x08

public const val LOG_NOWAIT: Int = 0x10

public const val LOG_PRIMASK: Int = 0x7

public const val LOG_FACMASK: Int = 0x3f8

public const val RTLD_LOCAL: Int = 0

public const val RTLD_LAZY: Int = 1

public const val RTLD_NOW: Int = 2

public const val RTLD_GLOBAL: Int = 256

public val SIG_DFL: ULong = 0.toULong()

public val SIG_IGN: ULong = 1.toULong()

public val SIG_ERR: ULong = 0.toULong().inv()

public const val SIGHUP: Int = 1

public const val SIGINT: Int = 2

public const val SIGQUIT: Int = 3

public const val SIGILL: Int = 4

public const val SIGTRAP: Int = 5

public const val SIGABRT: Int = 6

public const val SIGEMT: Int = 7

public const val SIGFPE: Int = 8

public const val SIGKILL: Int = 9

public const val SIGBUS: Int = 10

public const val SIGSEGV: Int = 11

public const val SIGFMT: Int = 12

public const val SIGPIPE: Int = 13

public const val SIGALRM: Int = 14

public const val SIGTERM: Int = 15

public const val SIGCNCL: Int = 16

public const val SIGSTOP: Int = 17

public const val SIGTSTP: Int = 18

public const val SIGCONT: Int = 19

public const val SIGCHLD: Int = 20

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGUSR1: Int = 30

public const val SIGUSR2: Int = 31

public const val SIGPOLL: Int = 32

public const val SIGPROF: Int = 33

public const val SIGSYS: Int = 34

public const val SIGURG: Int = 35

public const val SIGVTALRM: Int = 36

public const val SIGXCPU: Int = 37

public const val SIGXFSZ: Int = 38

public const val SIGRTMIN: Int = 48

public const val SIGIO: Int = SIGRTMIN

public const val SIGWINCH: Int = SIGRTMIN + 5

public const val SIGLOST: Int = SIGRTMIN + 6

public const val SIG_BLOCK: Int = 1

public const val SIG_UNBLOCK: Int = 2

public const val SIG_SETMASK: Int = 3

public const val SA_NOCLDSTOP: Int = 0x0001

public const val SA_SIGINFO: Int = 0x0002

public const val SA_ONSTACK: Int = 0x0004

public const val SA_INTERRUPT: Int = 0x0008

public const val SA_RESETHAND: Int = 0x0010

public const val SA_RESTART: Int = 0x0020

public const val SA_NODEFER: Int = 0x0040

public const val SA_NOCLDWAIT: Int = 0x0080

public const val SI_SYNC: Int = 0

public const val SI_USER: Int = -1

public const val SI_QUEUE: Int = -2

public const val SI_TIMER: Int = -3

public const val SI_ASYNCIO: Int = -4

public const val SI_MESGQ: Int = -5

public const val SI_CHILD: Int = -6

public const val SI_KILL: Int = SI_USER

public const val AT_FDCWD: Int = -100

public const val AT_SYMLINK_NOFOLLOW: Int = 0x100

public const val AT_REMOVEDIR: Int = 0x200

public const val AT_SYMLINK_FOLLOW: Int = 0x400

public const val _PARM_NAME_MAX: Int = 255

public const val _PARM_PATH_MAX: Int = 1024

public const val WNOHANG: Int = 0x01

public const val WUNTRACED: Int = 0x02

public const val WCONTINUED: Int = 0x04

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { mutexSemId: null, mutexValid: PTHREAD_VALID_OBJ, mutexInitted: PTHREAD_UNUSED_YET_OBJ, mutexCondRefCount: 0, mutexSavPriority: -1, mutexAttr: PTHREAD_MUTEXATTR_INITIALIZER, mutexSemName: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { condSemId: null, condValid: PTHREAD_VALID_OBJ, condInitted: PTHREAD_UNUSED_YET_OBJ, condRefCount: 0, condMutex: null, condAttr: PTHREAD_CONDATTR_INITIALIZER, condSemName: [0 (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { rwlockSemId: null, rwlockReadersRefCount: 0, rwlockValid: PTHREAD_VALID_OBJ, rwlockInitted: PTHREAD_UNUSED_YET_OBJ, rwlockAttr: PTHREAD_RWLOCKATTR_INITIALIZER, rwlockSemName: [0 (initializer represented at the FFI boundary)
public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val VX_RTP_NAME_LENGTH: Int = 255

public const val RTP_ID_ERROR: Int = -1

public const val R_OK: Int = 4

public const val _SC_ARG_MAX: Int = 4

public const val _SC_CHILD_MAX: Int = 12

public const val _SC_CLK_TCK: Int = 13

public const val _SC_GETPW_R_SIZE_MAX: Int = 21

public const val _SC_HOST_NAME_MAX: Int = 22

public const val _SC_NGROUPS_MAX: Int = 36

public const val _SC_OPEN_MAX: Int = 37

public const val _SC_PAGE_SIZE: Int = 38

public const val _SC_PAGESIZE: Int = 39

public const val _SC_STREAM_MAX: Int = 59

public const val _SC_SYMLOOP_MAX: Int = 60

public const val _SC_TTY_NAME_MAX: Int = 87

public const val _SC_TZNAME_MAX: Int = 89

public const val _SC_VERSION: Int = 94

public const val O_ACCMODE: Int = 3

public const val O_CLOEXEC: Int = 0x100000

public const val O_EXCL: Int = 0x0800

public const val O_CREAT: Int = 0x0200

public const val O_TRUNC: Int = 0x0400

public const val O_APPEND: Int = 0x0008

public const val O_RDWR: Int = 0x0002

public const val O_WRONLY: Int = 0x0001

public const val O_RDONLY: Int = 0

public const val O_NONBLOCK: Int = 0x4000

public const val PROT_NONE: Int = 0x0000

public const val PROT_READ: Int = 0x0001

public const val PROT_WRITE: Int = 0x0002

public const val PROT_EXEC: Int = 0x0004

public const val MAP_SHARED: Int = 0x0001

public const val MAP_PRIVATE: Int = 0x0002

public const val MAP_ANON: Int = 0x0004

public const val MAP_ANONYMOUS: Int = MAP_ANON

public const val MAP_FIXED: Int = 0x0010

public const val MAP_CONTIG: Int = 0x0020

public const val MS_SYNC: Int = 0x0001

public const val MS_ASYNC: Int = 0x0002

public const val MS_INVALIDATE: Int = 0x0004

public const val TIOCGWINSZ: Int = 0x1740087468.toInt()

public const val TIOCSWINSZ: Int = -0x7ff78b99
