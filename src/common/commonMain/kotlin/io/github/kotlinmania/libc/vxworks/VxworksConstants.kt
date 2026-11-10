@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint

public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

public val EAI_SERVICE: CInt = 9

public val EAI_SOCKTYPE: CInt = 10

public val EAI_SYSTEM: CInt = 11

public val INT_MAX: CInt = 0x7fffffff

public val INT_MIN: CInt = -INT_MAX - 1

// Clock Lib Stuff
public val CLOCK_REALTIME: CInt = 0x0

public val CLOCK_MONOTONIC: CInt = 0x1

public val CLOCK_PROCESS_CPUTIME_ID: CInt = 0x2

public val CLOCK_THREAD_CPUTIME_ID: CInt = 0x3

public val TIMER_ABSTIME: CInt = 0x1

public val TIMER_RELTIME: CInt = 0x0

// PTHREAD STUFF
public val PTHREAD_INITIALIZED_OBJ: CInt = 0xF70990EF.toInt()

public val PTHREAD_DESTROYED_OBJ: CInt = -1

public val PTHREAD_VALID_OBJ: CInt = 0xEC542A37.toInt()

public val PTHREAD_INVALID_OBJ: CInt = -1

public val PTHREAD_UNUSED_YET_OBJ: CInt = -1

public val PTHREAD_PRIO_NONE: CInt = 0

public val PTHREAD_PRIO_INHERIT: CInt = 1

public val PTHREAD_PRIO_PROTECT: CInt = 2

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 1

public val PTHREAD_MUTEX_RECURSIVE: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_STACK_MIN: Int = 4096

public val PTHREAD_SHARED_SEM_NAME_MAX: Int = 30

// sched.h
public val SCHED_FIFO: CInt = 0x01

public val SCHED_RR: CInt = 0x02

public val SCHED_OTHER: CInt = 0x04

public val SCHED_SPORADIC: CInt = 0x08

public val PRIO_PROCESS: CUint = 0u

public val SCHED_FIFO_HIGH_PRI: CInt = 255

public val SCHED_FIFO_LOW_PRI: CInt = 0

public val SCHED_RR_HIGH_PRI: CInt = 255

public val SCHED_RR_LOW_PRI: CInt = 0

public val SCHED_SPORADIC_HIGH_PRI: CInt = 255

public val SCHED_SPORADIC_LOW_PRI: CInt = 0

// ERRNO STUFF
public val ERROR: CInt = -1

public val OK: CInt = 0

public val EPERM: CInt = 1

// Not owner
public val ENOENT: CInt = 2

// No such file or directory
public val ESRCH: CInt = 3

// No such process
public val EINTR: CInt = 4

// Interrupted system call
public val EIO: CInt = 5

// I/O error
public val ENXIO: CInt = 6

// No such device or address
public val E2BIG: CInt = 7

// Arg list too long
public val ENOEXEC: CInt = 8

// Exec format error
public val EBADF: CInt = 9

// Bad file number
public val ECHILD: CInt = 10

// No children
public val EAGAIN: CInt = 11

// No more processes
public val ENOMEM: CInt = 12

// Not enough core
public val EACCES: CInt = 13

// Permission denied
public val EFAULT: CInt = 14

public val ENOTEMPTY: CInt = 15

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

public val ENAMETOOLONG: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDEADLK: CInt = 33

public val ENOLCK: CInt = 34

public val ENOTSUP: CInt = 35

public val EMSGSIZE: CInt = 36

public val EDOM: CInt = 37

public val ERANGE: CInt = 38

public val EDOOM: CInt = 39

public val EDESTADDRREQ: CInt = 40

public val EPROTOTYPE: CInt = 41

public val ENOPROTOOPT: CInt = 42

public val EPROTONOSUPPORT: CInt = 43

public val ESOCKTNOSUPPORT: CInt = 44

public val EOPNOTSUPP: CInt = 45

public val EPFNOSUPPORT: CInt = 46

public val EAFNOSUPPORT: CInt = 47

public val EADDRINUSE: CInt = 48

public val EADDRNOTAVAIL: CInt = 49

public val ENOTSOCK: CInt = 50

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

public val ENETDOWN: CInt = 62

public val ETXTBSY: CInt = 63

public val ELOOP: CInt = 64

public val EHOSTUNREACH: CInt = 65

public val ENOTBLK: CInt = 66

public val EHOSTDOWN: CInt = 67

public val EINPROGRESS: CInt = 68

public val EALREADY: CInt = 69

public val EWOULDBLOCK: CInt = 70

public val ENOSYS: CInt = 71

public val ECANCELED: CInt = 72

public val ENOSR: CInt = 74

public val ENOSTR: CInt = 75

public val EPROTO: CInt = 76

public val EBADMSG: CInt = 77

public val ENODATA: CInt = 78

public val ETIME: CInt = 79

public val ENOMSG: CInt = 80

public val EFPOS: CInt = 81

public val EILSEQ: CInt = 82

public val EDQUOT: CInt = 83

public val EIDRM: CInt = 84

public val EOVERFLOW: CInt = 85

public val EMULTIHOP: CInt = 86

public val ENOLINK: CInt = 87

public val ESTALE: CInt = 88

public val EOWNERDEAD: CInt = 89

public val ENOTRECOVERABLE: CInt = 90

// NFS errnos: Refer to pkgsV2/storage/fs/nfs/h/nfs/nfsCommon.h
public val M_NFS_STAT: CInt = 48 shl 16

public val S_NFS_LIB_NFS_OK: CInt = OK

public val S_NFS_LIB_NFSERR_PERM: CInt = EPERM

public val S_NFS_LIB_NFSERR_NOENT: CInt = ENOENT

public val S_NFS_LIB_NFSERR_IO: CInt = EIO

public val S_NFS_LIB_NFSERR_NXIO: CInt = ENXIO

public val S_NFS_LIB_NFSERR_ACCESS: CInt = EACCES

public val S_NFS_LIB_NFSERR_EXIST: CInt = EEXIST

public val S_NFS_LIB_NFSERR_ENODEV: CInt = ENODEV

public val S_NFS_LIB_NFSERR_NOTDIR: CInt = ENOTDIR

public val S_NFS_LIB_NFSERR_ISDIR: CInt = EISDIR

public val S_NFS_LIB_NFSERR_INVAL: CInt = EINVAL

public val S_NFS_LIB_NFSERR_FBIG: CInt = EFBIG

public val S_NFS_LIB_NFSERR_NOSPC: CInt = ENOSPC

public val S_NFS_LIB_NFSERR_ROFS: CInt = EROFS

public val S_NFS_LIB_NFSERR_NAMETOOLONG: CInt = ENAMETOOLONG

public val S_NFS_LIB_NFSERR_NOTEMPTY: CInt = ENOTEMPTY

public val S_NFS_LIB_NFSERR_DQUOT: CInt = EDQUOT

public val S_NFS_LIB_NFSERR_STALE: CInt = ESTALE

public val S_NFS_LIB_NFSERR_WFLUSH: CInt = M_NFS_STAT or Nfsstat.NFSERR_WFLUSH.value.toInt()

public val S_NFS_LIB_NFSERR_REMOTE: CInt = M_NFS_STAT or Nfsstat.NFSERR_REMOTE.value.toInt()

public val S_NFS_LIB_NFSERR_BADHANDLE: CInt = M_NFS_STAT or Nfsstat.NFSERR_BADHANDLE.value.toInt()

public val S_NFS_LIB_NFSERR_NOT_SYNC: CInt = M_NFS_STAT or Nfsstat.NFSERR_NOT_SYNC.value.toInt()

public val S_NFS_LIB_NFSERR_BAD_COOKIE: CInt = M_NFS_STAT or Nfsstat.NFSERR_BAD_COOKIE.value.toInt()

public val S_NFS_LIB_NFSERR_NOTSUPP: CInt = EOPNOTSUPP

public val S_NFS_LIB_NFSERR_TOOSMALL: CInt = M_NFS_STAT or Nfsstat.NFSERR_TOOSMALL.value.toInt()

public val S_NFS_LIB_NFSERR_SERVERFAULT: CInt = EIO

public val S_NFS_LIB_NFSERR_BADTYPE: CInt = M_NFS_STAT or Nfsstat.NFSERR_BADTYPE.value.toInt()

public val S_NFS_LIB_NFSERR_JUKEBOX: CInt = M_NFS_STAT or Nfsstat.NFSERR_JUKEBOX.value.toInt()

// internal offset values for below constants
public val TASK_ERROR_BASE: CInt = 0x00030000

public val SEM_ERROR_BASE: CInt = 0x00160000

public val OBJ_ERROR_BASE: CInt = 0x003d0000

// taskLibCommon.h
public val S_TASK_LIB_NAME_NOT_FOUND: CInt = TASK_ERROR_BASE + 0x0065

public val S_TASK_LIB_TASK_HOOK_TABLE_FULL: CInt = TASK_ERROR_BASE + 0x0066

public val S_TASK_LIB_TASK_HOOK_NOT_FOUND: CInt = TASK_ERROR_BASE + 0x0067

public val S_TASK_LIB_ILLEGAL_PRIORITY: CInt = TASK_ERROR_BASE + 0x006D

// Note(vxworks): could also be useful for TASK_DESC type
public val VX_TASK_NAME_LENGTH: CInt = 31

public val VX_TASK_RENAME_LENGTH: CInt = 16

public val TCIFLUSH: CInt = 0

public val VINTR: Int = 0

public val VQUIT: Int = 1

public val VERASE: Int = 2

public val VKILL: Int = 3

public val VEOF: Int = 4

public val VMIN: Int = 16

public val VTIME: Int = 17

// semLibCommon.h
public val S_SEM_LIB_INVALID_STATE: CInt = SEM_ERROR_BASE + 0x0065

public val S_SEM_LIB_INVALID_OPTION: CInt = SEM_ERROR_BASE + 0x0066

public val S_SEM_LIB_INVALID_QUEUE_TYPE: CInt = SEM_ERROR_BASE + 0x0067

public val S_SEM_LIB_INVALID_OPERATION: CInt = SEM_ERROR_BASE + 0x0068

// objLibCommon.h
public val S_OBJ_LIB_OBJ_ID_ERROR: CInt = OBJ_ERROR_BASE + 0x0001

public val S_OBJ_LIB_OBJ_UNAVAILABLE: CInt = OBJ_ERROR_BASE + 0x0002

public val S_OBJ_LIB_OBJ_DELETED: CInt = OBJ_ERROR_BASE + 0x0003

public val S_OBJ_LIB_OBJ_TIMEOUT: CInt = OBJ_ERROR_BASE + 0x0004

public val S_OBJ_LIB_OBJ_NO_METHOD: CInt = OBJ_ERROR_BASE + 0x0005

// netinet/in.h
public val IPPROTO_IP: CInt = 0

public val IPPROTO_ICMP: CInt = 1

public val IPPROTO_TCP: CInt = 6

public val IPPROTO_IPV6: CInt = 41

public val IPPROTO_ICMPV6: CInt = 58

public val INADDR_ANY: InAddrT = 0u

public val INADDR_LOOPBACK: InAddrT = 2130706433u

public val INADDR_BROADCAST: InAddrT = 4294967295u

public val INADDR_NONE: InAddrT = 4294967295u

// netinet6/in6.h
public val IN6ADDR_LOOPBACK_INIT: In6Addr = In6Addr(s6Addr = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 1u))

public val IN6ADDR_ANY_INIT: In6Addr = In6Addr(s6Addr = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

// udp.h
public val IPPROTO_UDP: CInt = 17

public val IP_TTL: CInt = 4

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

// netdb.h
public val NI_MAXHOST: CInt = 1025

// in6.h
public val IPV6_V6ONLY: CInt = 1

public val IPV6_UNICAST_HOPS: CInt = 4

public val IPV6_MULTICAST_IF: CInt = 9

public val IPV6_MULTICAST_HOPS: CInt = 10

public val IPV6_MULTICAST_LOOP: CInt = 11

public val IPV6_ADD_MEMBERSHIP: CInt = 12

public val IPV6_DROP_MEMBERSHIP: CInt = 13

// STAT Stuff
public val S_IFMT: CInt = 61440

public val S_IFIFO: CInt = 4096

public val S_IFCHR: CInt = 8192

public val S_IFDIR: CInt = 16384

public val S_IFBLK: CInt = 24576

public val S_IFREG: CInt = 32768

public val S_IFLNK: CInt = 40960

public val S_IFSHM: CInt = 45056

public val S_IFSOCK: CInt = 49152

public val S_ISUID: CInt = 2048

public val S_ISGID: CInt = 1024

public val S_ISTXT: CInt = 512

public val S_ISVTX: CInt = 512

public val S_IRUSR: CInt = 256

public val S_IWUSR: CInt = 128

public val S_IXUSR: CInt = 64

public val S_IRWXU: CInt = 448

public val S_IRGRP: CInt = 32

public val S_IWGRP: CInt = 16

public val S_IXGRP: CInt = 8

public val S_IRWXG: CInt = 56

public val S_IROTH: CInt = 4

public val S_IWOTH: CInt = 2

public val S_IXOTH: CInt = 1

public val S_IRWXO: CInt = 7

public val UTIME_OMIT: CLong = 0x3ffffffeL

public val UTIME_NOW: CLong = 0x3fffffffL

// socket.h
public val SOL_SOCKET: CInt = 0xffff

public val SOMAXCONN: CInt = 128

public val SO_DEBUG: CInt = 0x0001

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_RCVLOWAT: CInt = 0x0012

public val SO_SNDLOWAT: CInt = 0x0013

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_ACCEPTCONN: CInt = 0x001e

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_REUSEPORT: CInt = 0x0200

public val SO_VLAN: CInt = 0x8000

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SO_BINDTODEVICE: CInt = 0x1010

public val SO_OOBINLINE: CInt = 0x1011

public val SO_CONNTIMEO: CInt = 0x100a

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_PACKET: CInt = 10

public val SS_MAXSIZE: Int = 128

public val MSG_OOB: CInt = 0x0001

public val MSG_PEEK: CInt = 0x0002

public val MSG_DONTROUTE: CInt = 0x0004

public val MSG_EOR: CInt = 0x0008

public val MSG_TRUNC: CInt = 0x0010

public val MSG_CTRUNC: CInt = 0x0020

public val MSG_WAITALL: CInt = 0x0040

public val MSG_DONTWAIT: CInt = 0x0080

public val MSG_EOF: CInt = 0x0100

public val MSG_EXP: CInt = 0x0200

public val MSG_MBUF: CInt = 0x0400

public val MSG_NOTIFICATION: CInt = 0x0800

public val MSG_COMPAT: CInt = 0x8000

public val AF_UNSPEC: CInt = 0

public val AF_LOCAL: CInt = 1

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_UNIX: CInt = PF_LOCAL

public val PF_UNSPEC: CInt = AF_UNSPEC

public val AF_UNIX: CInt = AF_LOCAL

public val AF_INET: CInt = 2

public val PF_INET: CInt = AF_INET

public val AF_NETLINK: CInt = 16

public val AF_ROUTE: CInt = 17

public val AF_LINK: CInt = 18

public val AF_PACKET: CInt = 19

public val PSEUDO_AF_KEY: CInt = 27

public val AF_KEY: CInt = PSEUDO_AF_KEY

public val AF_INET6: CInt = 28

public val PF_INET6: CInt = AF_INET6

public val AF_SOCKDEV: CInt = 31

public val AF_TIPC: CInt = 33

public val AF_MIPC: CInt = 34

public val AF_MIPC_SAFE: CInt = 35

public val AF_MAX: CInt = 39

// termios.h
public val B0: SpeedT = 0u

public val B50: SpeedT = 50u

public val B75: SpeedT = 75u

public val B110: SpeedT = 110u

public val B134: SpeedT = 134u

public val B150: SpeedT = 150u

public val B200: SpeedT = 200u

public val B300: SpeedT = 300u

public val B600: SpeedT = 600u

public val B1200: SpeedT = 1200u

public val B1800: SpeedT = 1800u

public val B2400: SpeedT = 2400u

public val B4800: SpeedT = 4800u

public val B9600: SpeedT = 9600u

public val B19200: SpeedT = 19200u

public val B38400: SpeedT = 38400u

public val B57600: SpeedT = 57600u

public val B115200: SpeedT = 115200u

public val B230400: SpeedT = 230400u

public val IGNBRK: TcflagT = 0x00000001u

public val BRKINT: TcflagT = 0x00000002u

public val IGNCR: TcflagT = 0x00000200u

public val IGNPAR: TcflagT = 0x00000000u

public val INPCK: TcflagT = 0x00000020u

public val ISTRIP: TcflagT = 0x00000040u

public val INLCR: TcflagT = 0x00000100u

public val ISIG: TcflagT = 0x00000001u

public val IXOFF: TcflagT = 0x00010000u

public val IXON: TcflagT = 0x00002000u

public val PARMRK: TcflagT = 0x00000000u

public val NOFLSH: TcflagT = 0x00000000u

public val NCCS: Int = 20

public val OPOST: TcflagT = 0x00000001u

public val ONLCR: TcflagT = 0x00000004u

public val ECHO: TcflagT = 0x00000010u

public val OCRNL: TcflagT = 0x00000010u

public val ECHOE: TcflagT = 0x00000020u

public val ECHOK: TcflagT = 0x00000040u

public val ECHONL: TcflagT = 0x00000100u

// net/if.h
public val IFNAMSIZ: SizeT = 16uL

public val IF_NAMESIZE: SizeT = IFNAMSIZ

// sioLibCommon.h
public val CLOCAL: TcflagT = 0x1u

public val CREAD: TcflagT = 0x2u

public val CS5: TcflagT = 0x0u

public val CS6: TcflagT = 0x4u

public val CS7: TcflagT = 0x8u

public val CS8: TcflagT = 0xcu

public val CSTOPB: TcflagT = 0x20u

public val CSIZE: TcflagT = 0xcu

public val PARODD: TcflagT = 0x80u

public val PARENB: TcflagT = 0x40u

public val DT_FIFO: CUchar = 1u

public val DT_CHR: CUchar = 2u

public val DT_DIR: CUchar = 4u

public val DT_BLK: CUchar = 6u

public val DT_REG: CUchar = 8u

public val DT_LNK: CUchar = 10u

public val DT_SOCK: CUchar = 12u

public val FNM_NOMATCH: CInt = 1

public val FNM_NOESCAPE: CInt = 1

public val FNM_PATHNAME: CInt = 2

public val FNM_PERIOD: CInt = 4

public val FNM_CASEFOLD: CInt = 16

public val F_OK: CInt = 0

public val X_OK: CInt = 1

public val W_OK: CInt = 2

public val PC_CHOWN_RESTRICTED: CInt = 4

public val PC_LINK_MAX: CInt = 6

public val PC_MAX_CANON: CInt = 7

public val PC_MAX_INPUT: CInt = 8

public val PC_NAME_MAX: CInt = 9

public val PC_NO_TRUNC: CInt = 10

public val PC_PATH_MAX: CInt = 11

public val PC_PIPE_BUF: CInt = 12

public val PC_VDISABLE: CInt = 20

public val HUPCL: TcflagT = 0x10u

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val ICANON: TcflagT = 0x00000002u

public val ICRNL: TcflagT = 0x00000400u

public val IEXTEN: TcflagT = 0x00000000u

public val TCP_NODELAY: CInt = 1

public val TCP_MAXSEG: CInt = 2

public val TCP_NOPUSH: CInt = 3

public val TCP_KEEPIDLE: CInt = 4

public val TCP_KEEPINTVL: CInt = 5

public val TCP_KEEPCNT: CInt = 6

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

// ioLib.h
public val FIONREAD: CInt = 0x40040001

public val FIOFLUSH: CInt = 2

public val FIOOPTIONS: CInt = 3

public val FIOBAUDRATE: CInt = 4

public val FIODISKFORMAT: CInt = 5

public val FIODISKINIT: CInt = 6

public val FIOSEEK: CInt = 7

public val FIOWHERE: CInt = 8

public val FIODIRENTRY: CInt = 9

public val FIORENAME: CInt = 10

public val FIOREADYCHANGE: CInt = 11

public val FIODISKCHANGE: CInt = 13

public val FIOCANCEL: CInt = 14

public val FIOSQUEEZE: CInt = 15

public val FIOGETNAME: CInt = 18

public val FIONBIO: CInt = 0x90040010.toInt()

public val PARM_PATH_MAX: CInt = 1024

// limits.h
public val PATH_MAX: CInt = PARM_PATH_MAX

public val POSIX_PATH_MAX: CInt = 256

// Some poll stuff
public val POLLIN: CShort = 0x0001

public val POLLPRI: CShort = 0x0002

public val POLLOUT: CShort = 0x0004

public val POLLRDNORM: CShort = 0x0040

public val POLLWRNORM: CShort = POLLOUT

public val POLLRDBAND: CShort = 0x0080

public val POLLWRBAND: CShort = 0x0100

public val POLLERR: CShort = 0x0008

public val POLLHUP: CShort = 0x0010

public val POLLNVAL: CShort = 0x0020

// fnctlcom.h
public val FD_CLOEXEC: CInt = 1

public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETOWN: CInt = 5

public val F_SETOWN: CInt = 6

public val F_GETLK: CInt = 7

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val F_DUPFD_CLOEXEC: CInt = 14

public val LOG_EMERG: CInt = 0

public val LOG_ALERT: CInt = 1

public val LOG_CRIT: CInt = 2

public val LOG_ERR: CInt = 3

public val LOG_WARNING: CInt = 4

public val LOG_NOTICE: CInt = 5

public val LOG_INFO: CInt = 6

public val LOG_DEBUG: CInt = 7

public val LOG_KERN: CInt = 0 shl 3

public val LOG_USER: CInt = 1 shl 3

public val LOG_MAIL: CInt = 2 shl 3

public val LOG_DAEMON: CInt = 3 shl 3

public val LOG_AUTH: CInt = 4 shl 3

public val LOG_SYSLOG: CInt = 5 shl 3

public val LOG_LPR: CInt = 6 shl 3

public val LOG_NEWS: CInt = 7 shl 3

public val LOG_UUCP: CInt = 8 shl 3

public val LOG_LOCAL0: CInt = 16 shl 3

public val LOG_LOCAL1: CInt = 17 shl 3

public val LOG_LOCAL2: CInt = 18 shl 3

public val LOG_LOCAL3: CInt = 19 shl 3

public val LOG_LOCAL4: CInt = 20 shl 3

public val LOG_LOCAL5: CInt = 21 shl 3

public val LOG_LOCAL6: CInt = 22 shl 3

public val LOG_LOCAL7: CInt = 23 shl 3

public val LOG_PID: CInt = 0x01

public val LOG_CONS: CInt = 0x02

public val LOG_ODELAY: CInt = 0x04

public val LOG_NDELAY: CInt = 0x08

public val LOG_NOWAIT: CInt = 0x10

public val LOG_PRIMASK: CInt = 0x7

public val LOG_FACMASK: CInt = 0x3f8

// dlfcn.h
public val RTLD_LOCAL: CInt = 0

public val RTLD_LAZY: CInt = 1

public val RTLD_NOW: CInt = 2

public val RTLD_GLOBAL: CInt = 256

// signal.h
public val SIG_DFL: SighandlerT = 0.toULong()

public val SIG_IGN: SighandlerT = 1.toULong()

public val SIG_ERR: SighandlerT = (-1).toULong()

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGTRAP: CInt = 5

public val SIGABRT: CInt = 6

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGBUS: CInt = 10

public val SIGSEGV: CInt = 11

public val SIGFMT: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGCNCL: CInt = 16

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGCONT: CInt = 19

public val SIGCHLD: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val SIGPOLL: CInt = 32

public val SIGPROF: CInt = 33

public val SIGSYS: CInt = 34

public val SIGURG: CInt = 35

public val SIGVTALRM: CInt = 36

public val SIGXCPU: CInt = 37

public val SIGXFSZ: CInt = 38

public val SIGRTMIN: CInt = 48

public val SIGIO: CInt = SIGRTMIN

public val SIGWINCH: CInt = SIGRTMIN + 5

public val SIGLOST: CInt = SIGRTMIN + 6

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 3

public val SA_NOCLDSTOP: CInt = 0x0001

public val SA_SIGINFO: CInt = 0x0002

public val SA_ONSTACK: CInt = 0x0004

public val SA_INTERRUPT: CInt = 0x0008

public val SA_RESETHAND: CInt = 0x0010

public val SA_RESTART: CInt = 0x0020

public val SA_NODEFER: CInt = 0x0040

public val SA_NOCLDWAIT: CInt = 0x0080

public val SI_SYNC: CInt = 0

public val SI_USER: CInt = -1

public val SI_QUEUE: CInt = -2

public val SI_TIMER: CInt = -3

public val SI_ASYNCIO: CInt = -4

public val SI_MESGQ: CInt = -5

public val SI_CHILD: CInt = -6

public val SI_KILL: CInt = SI_USER

public val AT_FDCWD: CInt = -100

public val AT_SYMLINK_NOFOLLOW: CInt = 0x100

public val AT_REMOVEDIR: CInt = 0x200

public val AT_SYMLINK_FOLLOW: CInt = 0x400

// vxParams.h definitions
public val PARM_NAME_MAX: CInt = 255

// WAIT STUFF
public val WNOHANG: CInt = 0x01

public val WUNTRACED: CInt = 0x02

public val WCONTINUED: CInt = 0x04

public val PTHREAD_MUTEXATTR_INITIALIZER: PthreadMutexattrT = PthreadMutexattrT(mutexAttrStatus = PTHREAD_INITIALIZED_OBJ, mutexAttrProtocol = PTHREAD_PRIO_NONE, mutexAttrPrioceiling = 0, mutexAttrType = PTHREAD_MUTEX_DEFAULT, mutexAttrPshared = 1)

public val PTHREAD_CONDATTR_INITIALIZER: PthreadCondattrT = PthreadCondattrT(condAttrStatus = 0xf70990ef.toInt(), condAttrPshared = 1, condAttrClockId = CLOCK_REALTIME)

public val PTHREAD_RWLOCKATTR_INITIALIZER: PthreadRwlockattrT = PthreadRwlockattrT(rwlockAttrStatus = PTHREAD_INITIALIZED_OBJ, rwlockAttrPshared = 1, rwlockAttrMaxReaders = 0u, rwlockAttrConformOpt = 1u)

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

// rtpLibCommon.h
public val VX_RTP_NAME_LENGTH: CInt = 255

public val RTP_ID_ERROR: RtpId = -1

// h/public/unistd.h
// h/public/unistd.h
public val R_OK: CInt = 4

public val SC_ARG_MAX: CInt = 4

// Via unistd.h
public val SC_CHILD_MAX: CInt = 12

public val SC_CLK_TCK: CInt = 13

public val SC_GETPW_R_SIZE_MAX: CInt = 21

public val SC_HOST_NAME_MAX: CInt = 22

public val SC_NGROUPS_MAX: CInt = 36

public val SC_OPEN_MAX: CInt = 37

public val SC_PAGE_SIZE: CInt = 38

public val SC_PAGESIZE: CInt = 39

public val SC_STREAM_MAX: CInt = 59

public val SC_SYMLOOP_MAX: CInt = 60

public val SC_TTY_NAME_MAX: CInt = 87

public val SC_TZNAME_MAX: CInt = 89

public val SC_VERSION: CInt = 94

public val O_ACCMODE: CInt = 3

public val O_CLOEXEC: CInt = 0x100000

// fcntlcom
public val O_EXCL: CInt = 0x0800

public val O_CREAT: CInt = 0x0200

public val O_TRUNC: CInt = 0x0400

public val O_APPEND: CInt = 0x0008

public val O_RDWR: CInt = 0x0002

public val O_WRONLY: CInt = 0x0001

public val O_RDONLY: CInt = 0

public val O_NONBLOCK: CInt = 0x4000

// mman.h
public val PROT_NONE: CInt = 0x0000

public val PROT_READ: CInt = 0x0001

public val PROT_WRITE: CInt = 0x0002

public val PROT_EXEC: CInt = 0x0004

public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_ANON: CInt = 0x0004

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val MAP_FIXED: CInt = 0x0010

public val MAP_CONTIG: CInt = 0x0020

public val MS_SYNC: CInt = 0x0001

public val MS_ASYNC: CInt = 0x0002

public val MS_INVALIDATE: CInt = 0x0004

public val MAP_FAILED: COpaquePointer? = COpaquePointer((0.inv()).toLong())

// sys/ttycom.h
public val TIOCGWINSZ: CInt = 0x1740087468L.toInt()

public val TIOCSWINSZ: CInt = -0x7ff78b99

// Note(vxworks): This is not defined in vxWorks, but we have to define it here
// to make the building pass for getrandom and std
public val RTLD_DEFAULT: COpaquePointer? = null

public val SS_ALIGNSIZE: Int = 8

public val SS_PAD1SIZE: Int = SS_ALIGNSIZE - 8 - 8

public val SS_PAD2SIZE: Int = SS_MAXSIZE - 8 - 8 - SS_PAD1SIZE - SS_ALIGNSIZE

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(mutexSemId = null, mutexValid = PTHREAD_VALID_OBJ, mutexInitted = PTHREAD_UNUSED_YET_OBJ, mutexCondRefCount = 0, mutexSavPriority = -1, mutexAttr = PTHREAD_MUTEXATTR_INITIALIZER, mutexSemName = UByteArray(PTHREAD_SHARED_SEM_NAME_MAX) { 0u.toUByte() })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(condSemId = null, condValid = PTHREAD_VALID_OBJ, condInitted = PTHREAD_UNUSED_YET_OBJ, condRefCount = 0, condMutex = null, condAttr = PTHREAD_CONDATTR_INITIALIZER, condSemName = UByteArray(PTHREAD_SHARED_SEM_NAME_MAX) { 0u.toUByte() })

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(rwlockSemId = null, rwlockReadersRefCount = 0u, rwlockValid = PTHREAD_VALID_OBJ, rwlockInitted = PTHREAD_UNUSED_YET_OBJ, rwlockAttr = PTHREAD_RWLOCKATTR_INITIALIZER, rwlockSemName = UByteArray(PTHREAD_SHARED_SEM_NAME_MAX) { 0u.toUByte() })
