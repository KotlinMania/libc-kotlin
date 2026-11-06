package io.github.kotlinmania.libc

// Interface to VxWorks C library

public fun interface AtexitCbCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateStartRoutineCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias UintptrT = ULong

public typealias IntptrT = Long

public typealias PtrdiffT = Long

public typealias SizeT = UintptrT

public typealias SsizeT = IntptrT

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias ClockT = CLong

public typealias CcT = CUchar

public typealias PidT = CInt

public typealias InAddrT = UInt

public typealias SighandlerT = SizeT

public typealias CpusetT = UInt

public typealias BlkcntT = CLong

public typealias BlksizeT = CLong

public typealias InoT = CUlong

public typealias RlimT = CUlong

public typealias SusecondsT = CLong

public typealias TimeT = CLonglong

public typealias ErrnoT = CInt

public typealias UsecondsT = CUlong

public typealias SocklenT = CUint

public typealias PthreadT = CUlong

public typealias ClockidT = CInt

// defined for the structs
public typealias DevT = CUlong

public typealias ModeT = CInt

public typealias NlinkT = CUlong

public typealias UidT = CUshort

public typealias GidT = CUshort

public typealias SigsetT = CUlonglong

public typealias KeyT = CLong

public typealias NfdsT = CUint

public typealias Stat64 = Stat

public typealias PthreadKeyT = CUlong

// From bOffT.h
public typealias OffT = CLonglong

public typealias Off64T = OffT

// From bBool.h
public typealias Bool = CInt

// From vxWind.h ..
public typealias VxObjHandle = CInt

public typealias VxTaskId = VxObjHandle

public typealias VxMsgQId = VxObjHandle

public typealias VxSemIdKernel = VxObjHandle

public typealias VxRtpId = VxObjHandle

public typealias VxSdId = VxObjHandle

public typealias VxCondvarId = VxObjHandle

public typealias VxSemId = VxSemaphore?

public typealias ObjHandle = VxObjHandle

public typealias TaskId = ObjHandle

public typealias MsgQId = ObjHandle

public typealias SemIdKernel = ObjHandle

public typealias RtpId = ObjHandle

public typealias SdId = ObjHandle

public typealias CondvarId = ObjHandle

public typealias Status = ObjHandle

// From vxTypes.h
public typealias VxUsrArgT = Long

public typealias VxExitCodeT = Long

public typealias VxTicksT = CUint

public typealias VxTicks64T = CUlonglong

public typealias SaFamilyT = CUchar

// mqueue.h
public typealias MqdT = CInt

public fun SiginfoT.siAddr(): COpaquePointer? {
    return this.siAddr
}

public fun SiginfoT.siValue(): Sigval {
    return this.siValue
}

public fun SiginfoT.siPid(): PidT {
    return this.siPid
}

public fun SiginfoT.siUid(): UidT {
    return this.siUid
}

public fun SiginfoT.siStatus(): CInt {
    return this.siStatus
}

public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

public val EAI_SERVICE: CInt = 9

public val EAI_SOCKTYPE: CInt = 10

public val EAI_SYSTEM: CInt = 11

public val INT_MAX: CInt = 0x7fffffff

public val INT_MIN: CInt = -INT_MAX - 1

// Note(vxworks): This is not defined in vxWorks, but we have to define it here
// to make the building pass for getrandom and std
public val RTLD_DEFAULT: COpaquePointer? = null

// Clock Lib Stuff
public val CLOCK_REALTIME: CInt = 0x0

public val CLOCK_MONOTONIC: CInt = 0x1

public val CLOCK_PROCESS_CPUTIME_ID: CInt = 0x2

public val CLOCK_THREAD_CPUTIME_ID: CInt = 0x3

public val TIMER_ABSTIME: CInt = 0x1

public val TIMER_RELTIME: CInt = 0x0

// PTHREAD STUFF
public val PTHREAD_INITIALIZED_OBJ: CInt = 0xF70990EF

public val PTHREAD_DESTROYED_OBJ: CInt = -1

public val PTHREAD_VALID_OBJ: CInt = 0xEC542A37

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

public sealed class Nfsstat(public val value: Int) {
    public data object NfserrRemote : Nfsstat(71)
    public data object NfserrWflush : Nfsstat(99)
    public data object NfserrBadhandle : Nfsstat(10001)
    public data object NfserrNotSync : Nfsstat(10002)
    public data object NfserrBadCookie : Nfsstat(10003)
    public data object NfserrToosmall : Nfsstat(10005)
    public data object NfserrBadtype : Nfsstat(10007)
    public data object NfserrJukebox : Nfsstat(10008)
}

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

public val S_NFS_LIB_NFSERR_WFLUSH: CInt = M_NFS_STAT or NFSERR_WFLUSH.toInt()

public val S_NFS_LIB_NFSERR_REMOTE: CInt = M_NFS_STAT or NFSERR_REMOTE.toInt()

public val S_NFS_LIB_NFSERR_BADHANDLE: CInt = M_NFS_STAT or NFSERR_BADHANDLE.toInt()

public val S_NFS_LIB_NFSERR_NOT_SYNC: CInt = M_NFS_STAT or NFSERR_NOT_SYNC.toInt()

public val S_NFS_LIB_NFSERR_BAD_COOKIE: CInt = M_NFS_STAT or NFSERR_BAD_COOKIE.toInt()

public val S_NFS_LIB_NFSERR_NOTSUPP: CInt = EOPNOTSUPP

public val S_NFS_LIB_NFSERR_TOOSMALL: CInt = M_NFS_STAT or NFSERR_TOOSMALL.toInt()

public val S_NFS_LIB_NFSERR_SERVERFAULT: CInt = EIO

public val S_NFS_LIB_NFSERR_BADTYPE: CInt = M_NFS_STAT or NFSERR_BADTYPE.toInt()

public val S_NFS_LIB_NFSERR_JUKEBOX: CInt = M_NFS_STAT or NFSERR_JUKEBOX.toInt()

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
public val IN6ADDR_LOOPBACK_INIT: In6Addr = Any(s6Addr = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1))

public val IN6ADDR_ANY_INIT: In6Addr = Any(s6Addr = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

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

public val SS_ALIGNSIZE: Int = sizeOf<UInt>()

public val SS_PAD1SIZE: Int = SS_ALIGNSIZE - sizeOf<CUchar>() - sizeOf<SaFamilyT>()

public val SS_PAD2SIZE: Int = SS_MAXSIZE - sizeOf<CUchar>() - sizeOf<SaFamilyT>() - SS_PAD1SIZE - SS_ALIGNSIZE

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

public val FIONBIO: CInt = 0x90040010

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

public val SIG_ERR: SighandlerT = ((-1).toInt()).toULong()

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

public val PARM_PATH_MAX: CInt = 1024

// WAIT STUFF
public val WNOHANG: CInt = 0x01

public val WUNTRACED: CInt = 0x02

public val WCONTINUED: CInt = 0x04

public val PTHREAD_MUTEXATTR_INITIALIZER: PthreadMutexattrT = Any(mutexAttrStatus = PTHREAD_INITIALIZED_OBJ, mutexAttrProtocol = PTHREAD_PRIO_NONE, mutexAttrPrioceiling = 0, mutexAttrType = PTHREAD_MUTEX_DEFAULT, mutexAttrPshared = 1)

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(mutexSemId = null, mutexValid = PTHREAD_VALID_OBJ, mutexInitted = PTHREAD_UNUSED_YET_OBJ, mutexCondRefCount = 0, mutexSavPriority = -1, mutexAttr = PTHREAD_MUTEXATTR_INITIALIZER, mutexSemName = List(PTHREAD_SHARED_SEM_NAME_MAX) { 0 })

public val PTHREAD_CONDATTR_INITIALIZER: PthreadCondattrT = Any(condAttrStatus = 0xf70990ef, condAttrPshared = 1, condAttrClockId = CLOCK_REALTIME)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(condSemId = null, condValid = PTHREAD_VALID_OBJ, condInitted = PTHREAD_UNUSED_YET_OBJ, condRefCount = 0, condMutex = null, condAttr = PTHREAD_CONDATTR_INITIALIZER, condSemName = List(PTHREAD_SHARED_SEM_NAME_MAX) { 0 })

public val PTHREAD_RWLOCKATTR_INITIALIZER: PthreadRwlockattrT = Any(rwlockAttrStatus = PTHREAD_INITIALIZED_OBJ, rwlockAttrPshared = 1, rwlockAttrMaxReaders = 0, rwlockAttrConformOpt = 1)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(rwlockSemId = null, rwlockReadersRefCount = 0, rwlockValid = PTHREAD_VALID_OBJ, rwlockInitted = PTHREAD_UNUSED_YET_OBJ, rwlockAttr = PTHREAD_RWLOCKATTR_INITIALIZER, rwlockSemName = List(PTHREAD_SHARED_SEM_NAME_MAX) { 0 })

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

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

// sys/ttycom.h
public val TIOCGWINSZ: CInt = 0x1740087468

public val TIOCSWINSZ: CInt = -0x7ff78b99

public fun isalnum(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isalnum", -1, longArrayOf(c.toLong())).toInt()
}

public fun isalpha(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isalpha", -1, longArrayOf(c.toLong())).toInt()
}

public fun iscntrl(c: CInt): CInt {
    return LibcDynamicFfi.invoke("iscntrl", -1, longArrayOf(c.toLong())).toInt()
}

public fun isdigit(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isdigit", -1, longArrayOf(c.toLong())).toInt()
}

public fun isgraph(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isgraph", -1, longArrayOf(c.toLong())).toInt()
}

public fun islower(c: CInt): CInt {
    return LibcDynamicFfi.invoke("islower", -1, longArrayOf(c.toLong())).toInt()
}

public fun isprint(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isprint", -1, longArrayOf(c.toLong())).toInt()
}

public fun ispunct(c: CInt): CInt {
    return LibcDynamicFfi.invoke("ispunct", -1, longArrayOf(c.toLong())).toInt()
}

public fun isspace(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isspace", -1, longArrayOf(c.toLong())).toInt()
}

public fun isupper(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isupper", -1, longArrayOf(c.toLong())).toInt()
}

public fun isxdigit(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isxdigit", -1, longArrayOf(c.toLong())).toInt()
}

public fun isblank(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isblank", -1, longArrayOf(c.toLong())).toInt()
}

public fun tolower(c: CInt): CInt {
    return LibcDynamicFfi.invoke("tolower", -1, longArrayOf(c.toLong())).toInt()
}

public fun toupper(c: CInt): CInt {
    return LibcDynamicFfi.invoke("toupper", -1, longArrayOf(c.toLong())).toInt()
}

public fun fopen(filename: String?, mode: String?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("fopen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun freopen(filename: String?, mode: String?, file: FILE?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("freopen", -1, longArrayOf(__cstr_0, __cstr_1, file?.handle ?: 0L))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fflush(file: FILE?): CInt {
    return LibcDynamicFfi.invoke("fflush", -1, longArrayOf(file?.handle ?: 0L)).toInt()
}

public fun fclose(file: FILE?): CInt {
    return LibcDynamicFfi.invoke("fclose", -1, longArrayOf(file?.handle ?: 0L)).toInt()
}

public fun remove(filename: String?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("remove", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun rename(oldname: String?, newname: String?): CInt {
    val __cstr_0 = if (oldname == null) 0L else LibcDynamicFfi.allocUtf8CString(oldname)
    val __cstr_1 = if (newname == null) 0L else LibcDynamicFfi.allocUtf8CString(newname)
    try {
        return LibcDynamicFfi.invoke("rename", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun tmpfile(): FILE? {
    val rawRet = LibcDynamicFfi.invoke("tmpfile", -1, longArrayOf())
    return if (rawRet == 0L) null else FILE(rawRet)
}

public fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("setvbuf", -1, longArrayOf(stream?.handle ?: 0L, buffer?.value ?: 0L, mode.toLong(), size.toLong())).toInt()
}

public fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    LibcDynamicFfi.invoke("setbuf", -1, longArrayOf(stream?.handle ?: 0L, buf?.value ?: 0L))
}

public fun getchar(): CInt {
    return LibcDynamicFfi.invoke("getchar", -1, longArrayOf()).toInt()
}

public fun putchar(c: CInt): CInt {
    return LibcDynamicFfi.invoke("putchar", -1, longArrayOf(c.toLong())).toInt()
}

public fun fgetc(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fgetc", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("fgets", -1, longArrayOf(buf?.value ?: 0L, n.toLong(), stream?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fputc(c: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fputc", -1, longArrayOf(c.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun fputs(s: String?, stream: FILE?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("fputs", -1, longArrayOf(__cstr_0, stream?.handle ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun puts(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("puts", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ungetc(c: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("ungetc", -1, longArrayOf(c.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fread", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), nobj.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fwrite", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), nobj.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt {
    return LibcDynamicFfi.invoke("fseek", -1, longArrayOf(stream?.handle ?: 0L, offset, whence.toLong())).toInt()
}

public fun ftell(stream: FILE?): CLong {
    return LibcDynamicFfi.invoke("ftell", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun rewind(stream: FILE?) {
    LibcDynamicFfi.invoke("rewind", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun fgetpos(stream: FILE?, ptr: FposT?): CInt {
    return LibcDynamicFfi.invoke("fgetpos", -1, longArrayOf(stream?.handle ?: 0L, ptr?.value ?: 0L)).toInt()
}

public fun fsetpos(stream: FILE?, ptr: FposT?): CInt {
    return LibcDynamicFfi.invoke("fsetpos", -1, longArrayOf(stream?.handle ?: 0L, ptr?.value ?: 0L)).toInt()
}

public fun feof(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("feof", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun ferror(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("ferror", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun perror(s: String?) {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        LibcDynamicFfi.invoke("perror", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
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

public fun strtod(s: String?, endp: COpaquePointer?): CDouble {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("strtod", 0, false, longArrayOf(__cstr_0, endp?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtof(s: String?, endp: COpaquePointer?): CFloat {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("strtof", 0, true, longArrayOf(__cstr_0, endp?.value ?: 0L)).toFloat()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtol", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoll", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoul", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoull", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

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

public fun free(p: COpaquePointer?) {
    LibcDynamicFfi.invoke("free", -1, longArrayOf(p?.value ?: 0L))
}

public fun abort(): Nothing {
    LibcDynamicFfi.invoke("abort", -1, longArrayOf())
    error("unreachable")
}

public fun exit(status: CInt): Nothing {
    LibcDynamicFfi.invoke("exit", -1, longArrayOf(status.toLong()))
    error("unreachable")
}

public fun atexit(cb: AtexitCbCallback): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("atexit", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun system(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("system", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getenv(s: String?): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("getenv", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun cfgetospeed(termios: Termios?): SpeedT {
    return LibcDynamicFfi.invoke("cfgetospeed", -1, longArrayOf(termios?.value ?: 0L)).toUInt()
}

public fun cfmakeraw(termios: Termios?): CInt {
    return LibcDynamicFfi.invoke("cfmakeraw", -1, longArrayOf(termios?.value ?: 0L)).toInt()
}

public fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt {
    return LibcDynamicFfi.invoke("cfsetispeed", -1, longArrayOf(termios?.value ?: 0L, speed.toLong())).toInt()
}

public fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt {
    return LibcDynamicFfi.invoke("cfsetospeed", -1, longArrayOf(termios?.value ?: 0L, speed.toLong())).toInt()
}

public fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcpy", -1, longArrayOf(dst?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncpy", -1, longArrayOf(dst?.value ?: 0L, __cstr_1, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcat", -1, longArrayOf(s?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncat", -1, longArrayOf(s?.value ?: 0L, __cstr_1, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcmp(cs: String?, ct: String?): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncmp(cs: String?, ct: String?, n: SizeT): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strncmp", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcoll(cs: String?, ct: String?): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcoll", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strchr(cs: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strrchr(cs: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strrchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strspn(cs: String?, ct: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcspn(cs: String?, ct: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strdup(cs: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strdup", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strpbrk(cs: String?, ct: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strpbrk", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strstr(cs: String?, ct: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strstr", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcasecmp(s1: String?, s2: String?): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strcasecmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strncasecmp", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
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

public fun strnlen(cs: String?, n: SizeT): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        return LibcDynamicFfi.invoke("strnlen", -1, longArrayOf(__cstr_0, n.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strerror(n: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("strerror", -1, longArrayOf(n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? {
    val __cstr_1 = if (t == null) 0L else LibcDynamicFfi.allocUtf8CString(t)
    try {
        val rawRet = LibcDynamicFfi.invoke("strtok", -1, longArrayOf(s?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strxfrm", -1, longArrayOf(s?.value ?: 0L, __cstr_1, n.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wcslen(buf: WcharT?): SizeT {
    val __slot_0 = if (buf == null) 0L else LibcDynamicFfi.allocScalarSlot(buf.toLong())
    try {
        return LibcDynamicFfi.invoke("wcslen", -1, longArrayOf(__slot_0)).toULong()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT {
    val __slot_1 = if (src == null) 0L else LibcDynamicFfi.allocScalarSlot(src.toLong())
    try {
        return LibcDynamicFfi.invoke("wcstombs", -1, longArrayOf(dest?.value ?: 0L, __slot_1, n.toLong())).toULong()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? {
    val __slot_0 = if (cx == null) 0L else LibcDynamicFfi.allocScalarSlot(cx.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("wmemchr", -1, longArrayOf(__slot_0, c.toLong(), n.toLong()))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
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

public fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memccpy", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, c.toLong(), n.toLong()))
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

public fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("aligned_alloc", -1, longArrayOf(alignment.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun uname(buf: Utsname?): CInt {
    return LibcDynamicFfi.invoke("uname", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun times(buf: Tms?): ClockT {
    return LibcDynamicFfi.invoke("times", -1, longArrayOf(buf?.value ?: 0L))
}

public fun tcflush(fd: CInt, action: CInt): CInt {
    return LibcDynamicFfi.invoke("tcflush", -1, longArrayOf(fd.toLong(), action.toLong())).toInt()
}

public fun pclose(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("pclose", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun mkdtemp(template: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mkdtemp", -1, longArrayOf(template?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_3 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("linkat", -1, longArrayOf(olddirfd.toLong(), __cstr_1, newdirfd.toLong(), __cstr_3, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("unlinkat", -1, longArrayOf(dirfd.toLong(), __cstr_1, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// netdb.h
public fun getprotobyname(name: String?): Protoent? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getprotobyname", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getprotobynumber(proto: CInt): Protoent? {
    val rawRet = LibcDynamicFfi.invoke("getprotobynumber", -1, longArrayOf(proto.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getservbyname(name: String?, proto: String?): Servent? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __cstr_1 = if (proto == null) 0L else LibcDynamicFfi.allocUtf8CString(proto)
    try {
        val rawRet = LibcDynamicFfi.invoke("getservbyname", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("fchownat", -1, longArrayOf(dirfd.toLong(), __cstr_1, owner.toLong(), group.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("fprintf", 2, longArrayOf(stream?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun printf(format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("printf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("snprintf", 3, longArrayOf(s?.value ?: 0L, n.toLong(), __cstr_2) + variadicArgs).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("sprintf", 2, longArrayOf(s?.value ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("fscanf", 2, longArrayOf(stream?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun scanf(format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("scanf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    val __cstr_1 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("sscanf", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getcharUnlocked(): CInt {
    return LibcDynamicFfi.invoke("getchar_unlocked", -1, longArrayOf()).toInt()
}

public fun putcharUnlocked(c: CInt): CInt {
    return LibcDynamicFfi.invoke("putchar_unlocked", -1, longArrayOf(c.toLong())).toInt()
}

public fun stat(path: String?, buf: Stat?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("stat", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fdopen(fd: CInt, mode: String?): FILE? {
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("fdopen", -1, longArrayOf(fd.toLong(), __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fileno(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fileno", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun creat(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("creat", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun rewinddir(dirp: DIR?) {
    LibcDynamicFfi.invoke("rewinddir", -1, longArrayOf(dirp?.handle ?: 0L))
}

public fun fchown(fd: CInt, owner: UidT, group: GidT): CInt {
    return LibcDynamicFfi.invoke("fchown", -1, longArrayOf(fd.toLong(), owner.toLong(), group.toLong())).toInt()
}

public fun access(path: String?, amode: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("access", -1, longArrayOf(__cstr_0, amode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun alarm(seconds: CUint): CUint {
    return LibcDynamicFfi.invoke("alarm", -1, longArrayOf(seconds.toLong())).toUInt()
}

public fun fchdir(dirfd: CInt): CInt {
    return LibcDynamicFfi.invoke("fchdir", -1, longArrayOf(dirfd.toLong())).toInt()
}

public fun chown(path: String?, uid: UidT, gid: GidT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("chown", -1, longArrayOf(__cstr_0, uid.toLong(), gid.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fpathconf(filedes: CInt, name: CInt): CLong {
    return LibcDynamicFfi.invoke("fpathconf", -1, longArrayOf(filedes.toLong(), name.toLong()))
}

public fun getegid(): GidT {
    return LibcDynamicFfi.invoke("getegid", -1, longArrayOf()).toUShort()
}

public fun geteuid(): UidT {
    return LibcDynamicFfi.invoke("geteuid", -1, longArrayOf()).toUShort()
}

public fun getgroups(ngroupsMax: CInt, groups: CUshort?): CInt {
    val __slot_1 = if (groups == null) 0L else LibcDynamicFfi.allocScalarSlot(groups.toLong())
    try {
        return LibcDynamicFfi.invoke("getgroups", -1, longArrayOf(ngroupsMax.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getlogin(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getlogin", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt {
    val __cstr_2 = if (optstr == null) 0L else LibcDynamicFfi.allocUtf8CString(optstr)
    try {
        return LibcDynamicFfi.invoke("getopt", -1, longArrayOf(argc.toLong(), argv?.value ?: 0L, __cstr_2)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun pathconf(path: String?, name: CInt): CLong {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("pathconf", -1, longArrayOf(__cstr_0, name.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pause(): CInt {
    return LibcDynamicFfi.invoke("pause", -1, longArrayOf()).toInt()
}

public fun seteuid(uid: UidT): CInt {
    return LibcDynamicFfi.invoke("seteuid", -1, longArrayOf(uid.toLong())).toInt()
}

public fun setegid(gid: GidT): CInt {
    return LibcDynamicFfi.invoke("setegid", -1, longArrayOf(gid.toLong())).toInt()
}

public fun sleep(secs: CUint): CUint {
    return LibcDynamicFfi.invoke("sleep", -1, longArrayOf(secs.toLong())).toUInt()
}

public fun ttyname(fd: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ttyname", -1, longArrayOf(fd.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun wait(status: CInt?): PidT {
    val __slot_0 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("wait", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun umask(mask: ModeT): ModeT {
    return LibcDynamicFfi.invoke("umask", -1, longArrayOf(mask.toLong())).toInt()
}

public fun mlock(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("mlock", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun mlockall(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mlockall", -1, longArrayOf(flags.toLong())).toInt()
}

public fun munlock(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("munlock", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun munlockall(): CInt {
    return LibcDynamicFfi.invoke("munlockall", -1, longArrayOf()).toInt()
}

public fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong(), flags.toLong(), fd.toLong(), offset))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun munmap(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("munmap", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("msync", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun truncate(path: String?, length: OffT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("truncate", -1, longArrayOf(__cstr_0, length)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_open", -1, longArrayOf(__cstr_0, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun shmUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun pthreadExit(value: COpaquePointer?): Nothing {
    LibcDynamicFfi.invoke("pthread_exit", -1, longArrayOf(value?.value ?: 0L))
    error("unreachable")
}

public fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setdetachstate", -1, longArrayOf(attr?.value ?: 0L, state.toLong())).toInt()
}

public fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_equal", -1, longArrayOf(t1.toLong(), t2.toLong())).toInt()
}

public fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("strerror_r", -1, longArrayOf(errnum.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun sigaddset(set: CUlonglong?, signum: CInt): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigaddset", -1, longArrayOf(__slot_0, signum.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt {
    return LibcDynamicFfi.invoke("sigaction", -1, longArrayOf(signum.toLong(), act?.value ?: 0L, oldact?.value ?: 0L)).toInt()
}

public fun utimes(filename: String?, times: Timeval?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("utimes", -1, longArrayOf(__cstr_0, times?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun futimens(fd: CInt, times: Timespec?): CInt {
    return LibcDynamicFfi.invoke("futimens", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("utimensat", -1, longArrayOf(dirfd.toLong(), __cstr_1, times?.value ?: 0L, flag.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun dlopen(filename: String?, flag: CInt): COpaquePointer? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        val rawRet = LibcDynamicFfi.invoke("_rtld_dlopen", -1, longArrayOf(__cstr_0, flag.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun dlerror(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("_rtld_dlerror", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? {
    val __cstr_1 = if (symbol == null) 0L else LibcDynamicFfi.allocUtf8CString(symbol)
    try {
        val rawRet = LibcDynamicFfi.invoke("_rtld_dlsym", -1, longArrayOf(handle?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun dlclose(handle: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("_rtld_dlclose", -1, longArrayOf(handle?.value ?: 0L)).toInt()
}

public fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt {
    return LibcDynamicFfi.invoke("_rtld_dladdr", -1, longArrayOf(addr?.value ?: 0L, info?.value ?: 0L)).toInt()
}

// time.h
public fun gmtimeR(timeP: CLonglong?, result: Tm?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime_r", -1, longArrayOf(__slot_0, result?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtimeR(timeP: CLonglong?, result: Tm?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime_r", -1, longArrayOf(__slot_0, result?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun mktime(tm: Tm?): TimeT {
    return LibcDynamicFfi.invoke("mktime", -1, longArrayOf(tm?.value ?: 0L))
}

public fun time(time: CLonglong?): TimeT {
    val __slot_0 = if (time == null) 0L else LibcDynamicFfi.allocScalarSlot(time)
    try {
        return LibcDynamicFfi.invoke("time", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun gmtime(timeP: CLonglong?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtime(timeP: CLonglong?): Tm? {
    val __slot_0 = if (timeP == null) 0L else LibcDynamicFfi.allocScalarSlot(timeP)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun timegm(tm: Tm?): TimeT {
    return LibcDynamicFfi.invoke("timegm", -1, longArrayOf(tm?.value ?: 0L))
}

public fun difftime(time1: TimeT, time0: TimeT): CDouble {
    return LibcDynamicFfi.invokeFp("difftime", 0, false, longArrayOf(time1, time0))
}

public fun gethostname(name: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("gethostname", -1, longArrayOf(name?.value ?: 0L, len.toLong())).toInt()
}

public fun usleep(secs: UsecondsT): CInt {
    return LibcDynamicFfi.invoke("usleep", -1, longArrayOf(secs.toLong())).toInt()
}

public fun putenv(string: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("putenv", -1, longArrayOf(string?.value ?: 0L)).toInt()
}

public fun setlocale(category: CInt, locale: String?): COpaquePointer? {
    val __cstr_1 = if (locale == null) 0L else LibcDynamicFfi.allocUtf8CString(locale)
    try {
        val rawRet = LibcDynamicFfi.invoke("setlocale", -1, longArrayOf(category.toLong(), __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun localeconv(): Lconv? {
    val rawRet = LibcDynamicFfi.invoke("localeconv", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun sigprocmask(how: CInt, set: CUlonglong?, oldset: CUlonglong?): CInt {
    val __slot_1 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_2 = if (oldset == null) 0L else LibcDynamicFfi.allocScalarSlot(oldset.toLong())
    try {
        return LibcDynamicFfi.invoke("sigprocmask", -1, longArrayOf(how.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sigpending(set: CUlonglong?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigpending", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun mkfifo(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("mkfifo", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt {
    return LibcDynamicFfi.invoke("fseeko", -1, longArrayOf(stream?.handle ?: 0L, offset, whence.toLong())).toInt()
}

public fun ftello(stream: FILE?): OffT {
    return LibcDynamicFfi.invoke("ftello", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun mkstemp(template: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("mkstemp", -1, longArrayOf(template?.value ?: 0L)).toInt()
}

public fun tmpnam(ptr: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("tmpnam", -1, longArrayOf(ptr?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    val __cstr_0 = if (ident == null) 0L else LibcDynamicFfi.allocUtf8CString(ident)
    try {
        LibcDynamicFfi.invoke("openlog", -1, longArrayOf(__cstr_0, logopt.toLong(), facility.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun closelog() {
    LibcDynamicFfi.invoke("closelog", -1, longArrayOf())
}

public fun setlogmask(maskpri: CInt): CInt {
    return LibcDynamicFfi.invoke("setlogmask", -1, longArrayOf(maskpri.toLong())).toInt()
}

public fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
    val __cstr_1 = if (message == null) 0L else LibcDynamicFfi.allocUtf8CString(message)
    try {
        LibcDynamicFfi.invoke("syslog", 2, longArrayOf(priority.toLong(), __cstr_1) + variadicArgs)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT {
    val __slot_1 = if (n == null) 0L else LibcDynamicFfi.allocScalarSlot(n.toLong())
    try {
        return LibcDynamicFfi.invoke("getline", -1, longArrayOf(lineptr?.value ?: 0L, __slot_1, stream?.handle ?: 0L))
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt {
    return LibcDynamicFfi.invoke("tcsetattr", -1, longArrayOf(fd.toLong(), optionalActions.toLong(), termios?.value ?: 0L)).toInt()
}

public fun tcgetattr(fd: CInt, termios: Termios?): CInt {
    return LibcDynamicFfi.invoke("tcgetattr", -1, longArrayOf(fd.toLong(), termios?.value ?: 0L)).toInt()
}

public fun tcsendbreak(fd: CInt, duration: CInt): CInt {
    return LibcDynamicFfi.invoke("tcsendbreak", -1, longArrayOf(fd.toLong(), duration.toLong())).toInt()
}

public fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT {
    return LibcDynamicFfi.invoke("confstr", -1, longArrayOf(name.toLong(), buf?.value ?: 0L, len.toLong())).toULong()
}

public fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt {
    val __cstr_0 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("fnmatch", -1, longArrayOf(__cstr_0, __cstr_1, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt {
    val __cstr_0 = if (target == null) 0L else LibcDynamicFfi.allocUtf8CString(target)
    val __cstr_2 = if (linkpath == null) 0L else LibcDynamicFfi.allocUtf8CString(linkpath)
    try {
        return LibcDynamicFfi.invoke("symlinkat", -1, longArrayOf(__cstr_0, newdirfd.toLong(), __cstr_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

// sys/stat.h
public fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("fchmodat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// utime.h
public fun utime(file: String?, buf: Utimbuf?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utime", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// stdlib.h
public fun memalign(blockSize: SizeT, sizeArg: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memalign", -1, longArrayOf(blockSize.toLong(), sizeArg.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// ioLib.h
public fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getcwd", -1, longArrayOf(buf?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// ioLib.h
public fun chdir(attr: String?): CInt {
    val __cstr_0 = if (attr == null) 0L else LibcDynamicFfi.allocUtf8CString(attr)
    try {
        return LibcDynamicFfi.invoke("chdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// pthread.h
public fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadMutexattrSettype(pAttr: PthreadMutexattrT?, pType: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_settype", -1, longArrayOf(pAttr?.value ?: 0L, pType.toLong())).toInt()
}

// pthread.h
public fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_init", -1, longArrayOf(mutex?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_destroy", -1, longArrayOf(mutex?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadMutexLock(mutex: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_lock", -1, longArrayOf(mutex?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_trylock", -1, longArrayOf(mutex?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_timedlock", -1, longArrayOf(attr?.value ?: 0L, spec?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_unlock", -1, longArrayOf(mutex?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadAttrSetname(pAttr: PthreadAttrT?, name: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setname", -1, longArrayOf(pAttr?.value ?: 0L, name?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setstacksize", -1, longArrayOf(attr?.value ?: 0L, stacksize.toLong())).toInt()
}

// pthread.h
public fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt {
    val __slot_1 = if (size == null) 0L else LibcDynamicFfi.allocScalarSlot(size.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstacksize", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// pthread.h
public fun pthreadAttrInit(attr: PthreadAttrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadCreate(pThread: CUlong?, pAttr: PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, value: COpaquePointer?): CInt {
    val __slot_0 = if (pThread == null) 0L else LibcDynamicFfi.allocScalarSlot(pThread.toLong())
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(__slot_0, pAttr?.value ?: 0L, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

// pthread.h
public fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("pthread_setschedparam", -1, longArrayOf(native.toLong(), policy.toLong(), param?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt {
    val __slot_1 = if (policy == null) 0L else LibcDynamicFfi.allocScalarSlot(policy.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_getschedparam", -1, longArrayOf(native.toLong(), __slot_1, param?.value ?: 0L)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// pthread.h
public fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setinheritsched", -1, longArrayOf(attr?.value ?: 0L, inheritsched.toLong())).toInt()
}

// pthread.h
public fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setschedpolicy", -1, longArrayOf(attr?.value ?: 0L, policy.toLong())).toInt()
}

// pthread.h
public fun pthreadAttrDestroy(thread: PthreadAttrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_destroy", -1, longArrayOf(thread?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadDetach(thread: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_detach", -1, longArrayOf(thread.toLong())).toInt()
}

// int pthreadAtfork (void (*)(void), void (*)(void), void (*)(void));
public fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt {
    return LibcDynamicFfi.invoke("pthread_atfork", -1, longArrayOf(prepare?.value ?: 0L, parent?.value ?: 0L, child?.value ?: 0L)).toInt()
}

// stat.h
public fun fstat(fildes: CInt, buf: Stat?): CInt {
    return LibcDynamicFfi.invoke("fstat", -1, longArrayOf(fildes.toLong(), buf?.value ?: 0L)).toInt()
}

// stat.h
public fun lstat(path: String?, buf: Stat?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("lstat", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// unistd.h
public fun ftruncate(fd: CInt, length: OffT): CInt {
    return LibcDynamicFfi.invoke("ftruncate", -1, longArrayOf(fd.toLong(), length)).toInt()
}

// dirent.h
public fun readdirR(pDir: DIR?, entry: Dirent?, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("readdir_r", -1, longArrayOf(pDir?.handle ?: 0L, entry?.value ?: 0L, result?.value ?: 0L)).toInt()
}

// dirent.h
public fun readdir(pDir: DIR?): Dirent? {
    val rawRet = LibcDynamicFfi.invoke("readdir", -1, longArrayOf(pDir?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// fcntl.h or
// ioLib.h
public fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// poll.h
public fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt {
    return LibcDynamicFfi.invoke("poll", -1, longArrayOf(fds?.value ?: 0L, nfds.toLong(), timeout.toLong())).toInt()
}

// pthread.h
public fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadCondattrGetclock(pAttr: PthreadCondattrT?, pClockId: CInt?): CInt {
    val __slot_1 = if (pClockId == null) 0L else LibcDynamicFfi.allocScalarSlot(pClockId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_getclock", -1, longArrayOf(pAttr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// pthread.h
public fun pthreadCondattrSetclock(pAttr: PthreadCondattrT?, clockId: ClockidT): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setclock", -1, longArrayOf(pAttr?.value ?: 0L, clockId.toLong())).toInt()
}

// pthread.h
public fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_init", -1, longArrayOf(cond?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadCondDestroy(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_destroy", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadCondSignal(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_signal", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadCondBroadcast(cond: PthreadCondT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_broadcast", -1, longArrayOf(cond?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_wait", -1, longArrayOf(cond?.value ?: 0L, mutex?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadRwlockattrSetmaxreaders(attr: PthreadRwlockattrT?, attr2: CUint): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_setmaxreaders", -1, longArrayOf(attr?.value ?: 0L, attr2.toLong())).toInt()
}

// pthread.h
public fun pthreadRwlockInit(attr: PthreadRwlockT?, host: PthreadRwlockattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_init", -1, longArrayOf(attr?.value ?: 0L, host?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadRwlockDestroy(attr: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadRwlockRdlock(attr: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_rdlock", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadRwlockTryrdlock(attr: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_tryrdlock", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadRwlockTimedrdlock(attr: PthreadRwlockT?, host: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_timedrdlock", -1, longArrayOf(attr?.value ?: 0L, host?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadRwlockWrlock(attr: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_wrlock", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadRwlockTrywrlock(attr: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_trywrlock", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadRwlockTimedwrlock(attr: PthreadRwlockT?, host: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_timedwrlock", -1, longArrayOf(attr?.value ?: 0L, host?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadRwlockUnlock(attr: PthreadRwlockT?): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlock_unlock", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadKeyCreate(key: CUlong?, dtor: PthreadKeyCreateDtorCallback?): CInt {
    val __slot_0 = if (key == null) 0L else LibcDynamicFfi.allocScalarSlot(key.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_key_create", -1, longArrayOf(__slot_0, dtor?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// pthread.h
public fun pthreadKeyDelete(key: PthreadKeyT): CInt {
    return LibcDynamicFfi.invoke("pthread_key_delete", -1, longArrayOf(key.toLong())).toInt()
}

// pthread.h
public fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_setspecific", -1, longArrayOf(key.toLong(), value?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("pthread_getspecific", -1, longArrayOf(key.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// pthread.h
public fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_cond_timedwait", -1, longArrayOf(cond?.value ?: 0L, mutex?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadAttrGetname(attr: PthreadAttrT?, name: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_getname", -1, longArrayOf(attr?.value ?: 0L, name?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadJoin(thread: PthreadT, status: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_join", -1, longArrayOf(thread.toLong(), status?.value ?: 0L)).toInt()
}

// pthread.h
public fun pthreadSelf(): PthreadT {
    return LibcDynamicFfi.invoke("pthread_self", -1, longArrayOf()).toULong()
}

// clockLib.h
public fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clockId.toLong(), tp?.value ?: 0L)).toInt()
}

// clockLib.h
public fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_settime", -1, longArrayOf(clockId.toLong(), tp?.value ?: 0L)).toInt()
}

// clockLib.h
public fun clockGetres(clockId: ClockidT, res: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_getres", -1, longArrayOf(clockId.toLong(), res?.value ?: 0L)).toInt()
}

// clockLib.h
public fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_nanosleep", -1, longArrayOf(clockId.toLong(), flags.toLong(), rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}

// timerLib.h
public fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("nanosleep", -1, longArrayOf(rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}

// socket.h
public fun accept(s: CInt, addr: Sockaddr?, addrlen: CUint?): CInt {
    val __slot_2 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("accept", -1, longArrayOf(s.toLong(), addr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

// socket.h
public fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt {
    return LibcDynamicFfi.invoke("bind", -1, longArrayOf(fd.toLong(), addr?.value ?: 0L, len.toLong())).toInt()
}

// socket.h
public fun connect(s: CInt, name: Sockaddr?, namelen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("connect", -1, longArrayOf(s.toLong(), name?.value ?: 0L, namelen.toLong())).toInt()
}

// socket.h
public fun getpeername(s: CInt, name: Sockaddr?, namelen: CUint?): CInt {
    val __slot_2 = if (namelen == null) 0L else LibcDynamicFfi.allocScalarSlot(namelen.toLong())
    try {
        return LibcDynamicFfi.invoke("getpeername", -1, longArrayOf(s.toLong(), name?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

// socket.h
public fun getsockname(socket: CInt, address: Sockaddr?, addressLen: CUint?): CInt {
    val __slot_2 = if (addressLen == null) 0L else LibcDynamicFfi.allocScalarSlot(addressLen.toLong())
    try {
        return LibcDynamicFfi.invoke("getsockname", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

// socket.h
public fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CUint?): CInt {
    val __slot_4 = if (optlen == null) 0L else LibcDynamicFfi.allocScalarSlot(optlen.toLong())
    try {
        return LibcDynamicFfi.invoke("getsockopt", -1, longArrayOf(sockfd.toLong(), level.toLong(), optname.toLong(), optval?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

// socket.h
public fun listen(socket: CInt, backlog: CInt): CInt {
    return LibcDynamicFfi.invoke("listen", -1, longArrayOf(socket.toLong(), backlog.toLong())).toInt()
}

// socket.h
public fun recv(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("recv", -1, longArrayOf(s.toLong(), buf?.value ?: 0L, bufLen.toLong(), flags.toLong()))
}

// socket.h
public fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt, from: Sockaddr?, pFromLen: CUint?): SsizeT {
    val __slot_5 = if (pFromLen == null) 0L else LibcDynamicFfi.allocScalarSlot(pFromLen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(s.toLong(), buf?.value ?: 0L, bufLen.toLong(), flags.toLong(), from?.value ?: 0L, __slot_5))
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun recvmsg(socket: CInt, mp: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("recvmsg", -1, longArrayOf(socket.toLong(), mp?.value ?: 0L, flags.toLong()))
}

// socket.h
public fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("send", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong()))
}

public fun sendmsg(socket: CInt, mp: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("sendmsg", -1, longArrayOf(socket.toLong(), mp?.value ?: 0L, flags.toLong()))
}

// socket.h
public fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT {
    return LibcDynamicFfi.invoke("sendto", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), addr?.value ?: 0L, addrlen.toLong()))
}

// socket.h
public fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("setsockopt", -1, longArrayOf(socket.toLong(), level.toLong(), name.toLong(), value?.value ?: 0L, optionLen.toLong())).toInt()
}

// socket.h
public fun shutdown(s: CInt, how: CInt): CInt {
    return LibcDynamicFfi.invoke("shutdown", -1, longArrayOf(s.toLong(), how.toLong())).toInt()
}

// socket.h
public fun socket(domain: CInt, type: CInt, protocol: CInt): CInt {
    return LibcDynamicFfi.invoke("socket", -1, longArrayOf(domain.toLong(), type.toLong(), protocol.toLong())).toInt()
}

// icotl.h
public fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("ioctl", 2, longArrayOf(fd.toLong(), request.toLong()) + variadicArgs).toInt()
}

// fcntl.h
public fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("fcntl", 2, longArrayOf(fd.toLong(), cmd.toLong()) + variadicArgs).toInt()
}

// ntpRfc2553.h for kernel
// netdb.h for user
public fun gaiStrerror(errcode: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("gai_strerror", -1, longArrayOf(errcode.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// ioLib.h or
// unistd.h
public fun close(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("close", -1, longArrayOf(fd.toLong())).toInt()
}

// ioLib.h or
// unistd.h
public fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("read", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong()))
}

// ioLib.h or
// unistd.h
public fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("write", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong()))
}

// ioLib.h or
// unistd.h
public fun isatty(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("isatty", -1, longArrayOf(fd.toLong())).toInt()
}

// ioLib.h or
// unistd.h
public fun dup(src: CInt): CInt {
    return LibcDynamicFfi.invoke("dup", -1, longArrayOf(src.toLong())).toInt()
}

// ioLib.h or
// unistd.h
public fun dup2(src: CInt, dst: CInt): CInt {
    return LibcDynamicFfi.invoke("dup2", -1, longArrayOf(src.toLong(), dst.toLong())).toInt()
}

// ioLib.h or
// unistd.h
public fun pipe(fds: CInt?): CInt {
    val __slot_0 = if (fds == null) 0L else LibcDynamicFfi.allocScalarSlot(fds.toLong())
    try {
        return LibcDynamicFfi.invoke("pipe", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// ioLib.h or
// unistd.h
public fun unlink(pathname: String?): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// unistd.h and
// ioLib.h
public fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT {
    return LibcDynamicFfi.invoke("lseek", -1, longArrayOf(fd.toLong(), offset, whence.toLong()))
}

// netdb.h
public fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt {
    val __cstr_0 = if (node == null) 0L else LibcDynamicFfi.allocUtf8CString(node)
    val __cstr_1 = if (service == null) 0L else LibcDynamicFfi.allocUtf8CString(service)
    try {
        return LibcDynamicFfi.invoke("getaddrinfo", -1, longArrayOf(__cstr_0, __cstr_1, hints?.value ?: 0L, res?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// netdb.h
public fun freeaddrinfo(res: Addrinfo?) {
    LibcDynamicFfi.invoke("freeaddrinfo", -1, longArrayOf(res?.value ?: 0L))
}

// signal.h
public fun signal(signum: CInt, handler: SighandlerT): SighandlerT {
    return LibcDynamicFfi.invoke("signal", -1, longArrayOf(signum.toLong(), handler.toLong())).toULong()
}

// unistd.h
public fun getpid(): PidT {
    return LibcDynamicFfi.invoke("getpid", -1, longArrayOf()).toInt()
}

// unistd.h
public fun getppid(): PidT {
    return LibcDynamicFfi.invoke("getppid", -1, longArrayOf()).toInt()
}

// unistd.h
public fun setpgid(pid: PidT, pgid: PidT): PidT {
    return LibcDynamicFfi.invoke("setpgid", -1, longArrayOf(pid.toLong(), pgid.toLong())).toInt()
}

// wait.h
public fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT {
    val __slot_1 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("waitpid", -1, longArrayOf(pid.toLong(), __slot_1, options.toLong())).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// unistd.h
public fun sysconf(attr: CInt): CLong {
    return LibcDynamicFfi.invoke("sysconf", -1, longArrayOf(attr.toLong()))
}

// stdlib.h
public fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt {
    val __cstr_0 = if (envVarName == null) 0L else LibcDynamicFfi.allocUtf8CString(envVarName)
    val __cstr_1 = if (envVarValue == null) 0L else LibcDynamicFfi.allocUtf8CString(envVarValue)
    try {
        return LibcDynamicFfi.invoke("setenv", -1, longArrayOf(__cstr_0, __cstr_1, overwrite.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// stdlib.h
public fun unsetenv(envVarName: String?): CInt {
    val __cstr_0 = if (envVarName == null) 0L else LibcDynamicFfi.allocUtf8CString(envVarName)
    try {
        return LibcDynamicFfi.invoke("unsetenv", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// stdlib.h
public fun realpath(fileName: String?, resolvedName: COpaquePointer?): COpaquePointer? {
    val __cstr_0 = if (fileName == null) 0L else LibcDynamicFfi.allocUtf8CString(fileName)
    try {
        val rawRet = LibcDynamicFfi.invoke("realpath", -1, longArrayOf(__cstr_0, resolvedName?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// unistd.h
public fun link(src: String?, dst: String?): CInt {
    val __cstr_0 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    val __cstr_1 = if (dst == null) 0L else LibcDynamicFfi.allocUtf8CString(dst)
    try {
        return LibcDynamicFfi.invoke("link", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// unistd.h
public fun readlink(path: String?, buf: COpaquePointer?, bufsize: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("readlink", -1, longArrayOf(__cstr_0, buf?.value ?: 0L, bufsize.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// unistd.h
public fun symlink(path1: String?, path2: String?): CInt {
    val __cstr_0 = if (path1 == null) 0L else LibcDynamicFfi.allocUtf8CString(path1)
    val __cstr_1 = if (path2 == null) 0L else LibcDynamicFfi.allocUtf8CString(path2)
    try {
        return LibcDynamicFfi.invoke("symlink", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// dirent.h
public fun opendir(name: String?): DIR? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("opendir", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else DIR(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// unistd.h
public fun rmdir(path: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("rmdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// stat.h
public fun mkdir(dirName: String?, mode: ModeT): CInt {
    val __cstr_0 = if (dirName == null) 0L else LibcDynamicFfi.allocUtf8CString(dirName)
    try {
        return LibcDynamicFfi.invoke("mkdir", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// stat.h
public fun chmod(path: String?, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("chmod", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// stat.h
public fun fchmod(attr1: CInt, attr2: ModeT): CInt {
    return LibcDynamicFfi.invoke("fchmod", -1, longArrayOf(attr1.toLong(), attr2.toLong())).toInt()
}

// unistd.h
public fun fsync(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("fsync", -1, longArrayOf(fd.toLong())).toInt()
}

// dirent.h
public fun closedir(ptr: DIR?): CInt {
    return LibcDynamicFfi.invoke("closedir", -1, longArrayOf(ptr?.handle ?: 0L)).toInt()
}

// sched.h
public fun schedGetPriorityMax(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_max", -1, longArrayOf(policy.toLong())).toInt()
}

// sched.h
public fun schedGetPriorityMin(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_min", -1, longArrayOf(policy.toLong())).toInt()
}

// sched.h
public fun schedSetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

// sched.h
public fun schedGetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_getparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

// sched.h
public fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setscheduler", -1, longArrayOf(pid.toLong(), policy.toLong(), param?.value ?: 0L)).toInt()
}

// sched.h
public fun schedGetscheduler(pid: PidT): CInt {
    return LibcDynamicFfi.invoke("sched_getscheduler", -1, longArrayOf(pid.toLong())).toInt()
}

// sched.h
public fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sched_rr_get_interval", -1, longArrayOf(pid.toLong(), tp?.value ?: 0L)).toInt()
}

// sched.h
public fun schedYield(): CInt {
    return LibcDynamicFfi.invoke("sched_yield", -1, longArrayOf()).toInt()
}

// errnoLib.h
public fun errnoSet(err: CInt): CInt {
    return LibcDynamicFfi.invoke("errnoSet", -1, longArrayOf(err.toLong())).toInt()
}

// errnoLib.h
public fun errnoGet(): CInt {
    return LibcDynamicFfi.invoke("errnoGet", -1, longArrayOf()).toInt()
}

// unistd.h
public fun setgid(gid: GidT): CInt {
    return LibcDynamicFfi.invoke("setgid", -1, longArrayOf(gid.toLong())).toInt()
}

// unistd.h
public fun getgid(): GidT {
    return LibcDynamicFfi.invoke("getgid", -1, longArrayOf()).toUShort()
}

// unistd.h
public fun setuid(uid: UidT): CInt {
    return LibcDynamicFfi.invoke("setuid", -1, longArrayOf(uid.toLong())).toInt()
}

// unistd.h
public fun getuid(): UidT {
    return LibcDynamicFfi.invoke("getuid", -1, longArrayOf()).toUShort()
}

// signal.h
public fun sigemptyset(set: CUlonglong?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigemptyset", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigfillset(set: CUlonglong?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigfillset", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigdelset(set: CUlonglong?, signum: CInt): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigdelset", -1, longArrayOf(__slot_0, signum.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigismember(set: CUlonglong?, signum: CInt): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigismember", -1, longArrayOf(__slot_0, signum.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// pthread.h for kernel
// signal.h for user
public fun pthreadSigmask(how: CInt, set: CUlonglong?, oset: CUlonglong?): CInt {
    val __slot_1 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_2 = if (oset == null) 0L else LibcDynamicFfi.allocScalarSlot(oset.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_sigmask", -1, longArrayOf(how.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

// signal.h for user
public fun kill(pid: PidT, signo: CInt): CInt {
    return LibcDynamicFfi.invoke("kill", -1, longArrayOf(pid.toLong(), signo.toLong())).toInt()
}

// signal.h for user
public fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt {
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sigqueue", -1, longArrayOf(pid.toLong(), signo.toLong(), __scratch_2)).toInt()
    } finally {
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

// signal.h for user
public fun sigqueue(rtpId: RtpId, signo: CInt, pValue: Sigval?, sigCode: CInt): CInt {
    return LibcDynamicFfi.invoke("_sigqueue", -1, longArrayOf(rtpId.toLong(), signo.toLong(), pValue?.value ?: 0L, sigCode.toLong())).toInt()
}

// signal.h
public fun taskKill(taskId: TaskId, signo: CInt): CInt {
    return LibcDynamicFfi.invoke("taskKill", -1, longArrayOf(taskId.toLong(), signo.toLong())).toInt()
}

// signal.h
public fun raise(signo: CInt): CInt {
    return LibcDynamicFfi.invoke("raise", -1, longArrayOf(signo.toLong())).toInt()
}

// taskLibCommon.h
public fun taskIdSelf(): TaskId {
    return LibcDynamicFfi.invoke("taskIdSelf", -1, longArrayOf()).toInt()
}

public fun taskDelay(ticks: VxTicksT): CInt {
    return LibcDynamicFfi.invoke("taskDelay", -1, longArrayOf(ticks.toLong())).toInt()
}

// taskLib.h
public fun taskNameSet(taskId: TaskId, taskName: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("taskNameSet", -1, longArrayOf(taskId.toLong(), taskName?.value ?: 0L)).toInt()
}

public fun taskNameGet(taskId: TaskId, bufName: COpaquePointer?, bufsize: SizeT): CInt {
    return LibcDynamicFfi.invoke("taskNameGet", -1, longArrayOf(taskId.toLong(), bufName?.value ?: 0L, bufsize.toLong())).toInt()
}

// rtpLibCommon.h
public fun rtpInfoGet(rtpId: RtpId, rtpStruct: RtpDesc?): CInt {
    return LibcDynamicFfi.invoke("rtpInfoGet", -1, longArrayOf(rtpId.toLong(), rtpStruct?.value ?: 0L)).toInt()
}

public fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId {
    val __cstr_0 = if (pubrtpFileName == null) 0L else LibcDynamicFfi.allocUtf8CString(pubrtpFileName)
    try {
        return LibcDynamicFfi.invoke("rtpSpawn", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, envp?.value ?: 0L, priority.toLong(), uStackSize.toLong(), options.toLong(), taskOptions.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// pathLib.h
public fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): Bool {
    val __cstr_0 = if (filepath == null) 0L else LibcDynamicFfi.allocUtf8CString(filepath)
    try {
        return LibcDynamicFfi.invoke("_pathIsAbsolute", -1, longArrayOf(__cstr_0, pNameTail?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("readv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

// randomNumGen.h
public fun randBytes(buf: CUchar?, length: CInt): CInt {
    val __slot_0 = if (buf == null) 0L else LibcDynamicFfi.allocScalarSlot(buf.toLong())
    try {
        return LibcDynamicFfi.invoke("randBytes", -1, longArrayOf(__slot_0, length.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun randABytes(buf: CUchar?, length: CInt): CInt {
    val __slot_0 = if (buf == null) 0L else LibcDynamicFfi.allocScalarSlot(buf.toLong())
    try {
        return LibcDynamicFfi.invoke("randABytes", -1, longArrayOf(__slot_0, length.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun randUBytes(buf: CUchar?, length: CInt): CInt {
    val __slot_0 = if (buf == null) 0L else LibcDynamicFfi.allocScalarSlot(buf.toLong())
    try {
        return LibcDynamicFfi.invoke("randUBytes", -1, longArrayOf(__slot_0, length.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun randSecure(): CInt {
    return LibcDynamicFfi.invoke("randSecure", -1, longArrayOf()).toInt()
}

// mqueue.h
public fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("mq_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mqClose(mqd: MqdT): CInt {
    return LibcDynamicFfi.invoke("mq_close", -1, longArrayOf(mqd.toLong())).toInt()
}

public fun mqUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("mq_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT {
    val __slot_3 = if (msgPrio == null) 0L else LibcDynamicFfi.allocScalarSlot(msgPrio.toLong())
    try {
        return LibcDynamicFfi.invoke("mq_receive", -1, longArrayOf(mqd.toLong(), msgPtr?.value ?: 0L, msgLen.toLong(), __slot_3))
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT {
    val __slot_3 = if (msgPrio == null) 0L else LibcDynamicFfi.allocScalarSlot(msgPrio.toLong())
    try {
        return LibcDynamicFfi.invoke("mq_timedreceive", -1, longArrayOf(mqd.toLong(), msgPtr?.value ?: 0L, msgLen.toLong(), __slot_3, absTimeout?.value ?: 0L))
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt {
    val __cstr_1 = if (msgPtr == null) 0L else LibcDynamicFfi.allocUtf8CString(msgPtr)
    try {
        return LibcDynamicFfi.invoke("mq_send", -1, longArrayOf(mqd.toLong(), __cstr_1, msgLen.toLong(), msgPrio.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt {
    val __cstr_1 = if (msgPtr == null) 0L else LibcDynamicFfi.allocUtf8CString(msgPtr)
    try {
        return LibcDynamicFfi.invoke("mq_timedsend", -1, longArrayOf(mqd.toLong(), __cstr_1, msgLen.toLong(), msgPrio.toLong(), absTimeout?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt {
    return LibcDynamicFfi.invoke("mq_getattr", -1, longArrayOf(mqd.toLong(), attr?.value ?: 0L)).toInt()
}

public fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt {
    return LibcDynamicFfi.invoke("mq_setattr", -1, longArrayOf(mqd.toLong(), newattr?.value ?: 0L, oldattr?.value ?: 0L)).toInt()
}

// vxCpuLib.h
public fun vxCpuEnabledGet(): CpusetT {
    return LibcDynamicFfi.invoke("vxCpuEnabledGet", -1, longArrayOf()).toUInt()
}

// Get set of running CPU's in the system
public fun vxCpuConfiguredGet(): CpusetT {
    return LibcDynamicFfi.invoke("vxCpuConfiguredGet", -1, longArrayOf()).toUInt()
}

public fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT {
    return -1L
}

public fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT {
    return -1L
}

public fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt {
    var memptr = memptr
    // check to see if align is a power of 2 and if align is a multiple
    // of sizeof(void *)
    if ((align and align - 1uL != 0uL) || (align.toInt() % sizeOf<SizeT>() != 0)) {
        return EINVAL
    }
    return run {
        // posixMemalign should not set errno
        val e = errnoGet()
        val temp = memalign(align, size)
        errnoSet(e.toInt())
        if ((temp == null)) {
            ENOMEM
        } else {
            memptr = temp
            0
        }
    }
}
