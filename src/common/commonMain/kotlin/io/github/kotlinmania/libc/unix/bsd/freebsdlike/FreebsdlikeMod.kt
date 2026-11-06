package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import OffT

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: DlPhdrInfo?, size: ULong, data: COpaquePointer?): CInt
}

public typealias ModeT = UShort

public typealias PthreadAttrT = COpaquePointer?

public typealias RlimT = Long

public typealias PthreadMutexT = COpaquePointer?

public typealias PthreadMutexattrT = COpaquePointer?

public typealias PthreadCondT = COpaquePointer?

public typealias PthreadCondattrT = COpaquePointer?

public typealias PthreadRwlockT = COpaquePointer?

public typealias PthreadRwlockattrT = COpaquePointer?

public typealias PthreadKeyT = CInt

public typealias TcflagT = CUint

public typealias SpeedT = CUint

public typealias NlItem = CInt

public typealias IdT = Long

public typealias VmSizeT = UintptrT

public typealias KeyT = CLong

// elf.h
public typealias Elf32Addr = UInt

public typealias Elf32Half = UShort

public typealias Elf32Lword = ULong

public typealias Elf32Off = UInt

public typealias Elf32Sword = Int

public typealias Elf32Word = UInt

public typealias Elf64Addr = ULong

public typealias Elf64Half = UShort

public typealias Elf64Lword = ULong

public typealias Elf64Off = ULong

public typealias Elf64Sword = Int

public typealias Elf64Sxword = Long

public typealias Elf64Word = UInt

public typealias Elf64Xword = ULong

public typealias IconvT = COpaquePointer?

// It's an alias over "struct __kvm_t". However, its fields aren't supposed to be used directly,
// making the type definition system dependent. Better not bind it exactly.
public typealias KvmT = Unit

public typealias PosixSpawnattrT = COpaquePointer?

public typealias PosixSpawnFileActionsT = COpaquePointer?

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

// Non-public helper constant
public val SIZEOF_LONG: Int = sizeOf<CLong>()

public val AIO_LISTIO_MAX: CInt = 16

public val AIO_CANCELED: CInt = 1

public val AIO_NOTCANCELED: CInt = 2

public val AIO_ALLDONE: CInt = 3

public val LIO_NOP: CInt = 0

public val LIO_WRITE: CInt = 1

public val LIO_READ: CInt = 2

public val LIO_WAIT: CInt = 1

public val LIO_NOWAIT: CInt = 0

public val SIGEV_NONE: CInt = 0

public val SIGEV_SIGNAL: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val SIGEV_KEVENT: CInt = 3

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

public val ALTMON_1: NlItem = 58

public val ALTMON_2: NlItem = 59

public val ALTMON_3: NlItem = 60

public val ALTMON_4: NlItem = 61

public val ALTMON_5: NlItem = 62

public val ALTMON_6: NlItem = 63

public val ALTMON_7: NlItem = 64

public val ALTMON_8: NlItem = 65

public val ALTMON_9: NlItem = 66

public val ALTMON_10: NlItem = 67

public val ALTMON_11: NlItem = 68

public val ALTMON_12: NlItem = 69

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val SEEK_DATA: CInt = 3

public val SEEK_HOLE: CInt = 4

public val IOFBF: CInt = 0

public val IONBF: CInt = 2

public val IOLBF: CInt = 1

public val BUFSIZ: CUint = 1024u

public val FOPEN_MAX: CUint = 20u

public val FILENAME_MAX: CUint = 1024u

public val L_TMPNAM: CUint = 1024u

public val TMP_MAX: CUint = 308915776u

public val O_NOCTTY: CInt = 32768

public val O_DIRECT: CInt = 0x00010000

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

public val F_DUPFD_CLOEXEC: CInt = 17

public val F_DUP2FD: CInt = 10

public val F_DUP2FD_CLOEXEC: CInt = 18

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

public val MAP_FILE: CInt = 0x0000

public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_FIXED: CInt = 0x0010

public val MAP_ANON: CInt = 0x1000

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MNT_EXPUBLIC: CInt = 0x20000000

public val MNT_NOATIME: CInt = 0x10000000

public val MNT_NOCLUSTERR: CInt = 0x40000000

public val MNT_NOCLUSTERW: CInt = 0x80000000

public val MNT_NOSYMFOLLOW: CInt = 0x00400000

public val MNT_SOFTDEP: CInt = 0x00200000

public val MNT_SUIDDIR: CInt = 0x00100000

public val MNT_EXRDONLY: CInt = 0x00000080

public val MNT_DEFEXPORTED: CInt = 0x00000200

public val MNT_EXPORTANON: CInt = 0x00000400

public val MNT_EXKERB: CInt = 0x00000800

public val MNT_DELEXPORT: CInt = 0x00020000

public val MS_SYNC: CInt = 0x0000

public val MS_ASYNC: CInt = 0x0001

public val MS_INVALIDATE: CInt = 0x0002

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

public val EWOULDBLOCK: CInt = 35

public val EINPROGRESS: CInt = 36

public val EALREADY: CInt = 37

public val ENOTSOCK: CInt = 38

public val EDESTADDRREQ: CInt = 39

public val EMSGSIZE: CInt = 40

public val EPROTOTYPE: CInt = 41

public val ENOPROTOOPT: CInt = 42

public val EPROTONOSUPPORT: CInt = 43

public val ESOCKTNOSUPPORT: CInt = 44

public val EOPNOTSUPP: CInt = 45

public val ENOTSUP: CInt = EOPNOTSUPP

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

public val EIDRM: CInt = 82

public val ENOMSG: CInt = 83

public val EOVERFLOW: CInt = 84

public val ECANCELED: CInt = 85

public val EILSEQ: CInt = 86

public val ENOATTR: CInt = 87

public val EDOOFUS: CInt = 88

public val EBADMSG: CInt = 89

public val EMULTIHOP: CInt = 90

public val ENOLINK: CInt = 91

public val EPROTO: CInt = 92

public val POLLSTANDARD: CShort = (POLLIN or POLLPRI or POLLOUT or POLLRDNORM or POLLRDBAND or POLLWRBAND or POLLERR or POLLHUP or POLLNVAL).toShort()

public val AI_PASSIVE: CInt = 0x00000001

public val AI_CANONNAME: CInt = 0x00000002

public val AI_NUMERICHOST: CInt = 0x00000004

public val AI_NUMERICSERV: CInt = 0x00000008

public val AI_ALL: CInt = 0x00000100

public val AI_ADDRCONFIG: CInt = 0x00000400

public val AI_V4MAPPED: CInt = 0x00000800

public val EAI_AGAIN: CInt = 2

public val EAI_BADFLAGS: CInt = 3

public val EAI_FAIL: CInt = 4

public val EAI_FAMILY: CInt = 5

public val EAI_MEMORY: CInt = 6

public val EAI_NONAME: CInt = 8

public val EAI_SERVICE: CInt = 9

public val EAI_SOCKTYPE: CInt = 10

public val EAI_SYSTEM: CInt = 11

public val EAI_OVERFLOW: CInt = 14

public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

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

public val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1

public val PTHREAD_PROCESS_PRIVATE: CInt = 0

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_CREATE_DETACHED: CInt = 1

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_RSS: CInt = 5

public val RLIMIT_MEMLOCK: CInt = 6

public val RLIMIT_NPROC: CInt = 7

public val RLIMIT_NOFILE: CInt = 8

public val RLIMIT_SBSIZE: CInt = 9

public val RLIMIT_VMEM: CInt = 10

public val RLIMIT_AS: CInt = RLIMIT_VMEM

public val RLIM_INFINITY: RlimT = 0x7fffffffffffffffL

public val RUSAGE_SELF: CInt = 0

public val RUSAGE_CHILDREN: CInt = -1

public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_VIRTUAL: ClockidT = 1

public val CLOCK_PROF: ClockidT = 2

public val CLOCK_MONOTONIC: ClockidT = 4

public val CLOCK_UPTIME: ClockidT = 5

public val CLOCK_UPTIME_PRECISE: ClockidT = 7

public val CLOCK_UPTIME_FAST: ClockidT = 8

public val CLOCK_REALTIME_PRECISE: ClockidT = 9

public val CLOCK_REALTIME_FAST: ClockidT = 10

public val CLOCK_MONOTONIC_PRECISE: ClockidT = 11

public val CLOCK_MONOTONIC_FAST: ClockidT = 12

public val CLOCK_SECOND: ClockidT = 13

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 14

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 15

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val MADV_FREE: CInt = 5

public val MADV_NOSYNC: CInt = 6

public val MADV_AUTOSYNC: CInt = 7

public val MADV_NOCORE: CInt = 8

public val MADV_CORE: CInt = 9

public val MINCORE_INCORE: CInt = 0x1

public val MINCORE_REFERENCED: CInt = 0x2

public val MINCORE_MODIFIED: CInt = 0x4

public val MINCORE_REFERENCED_OTHER: CInt = 0x8

public val MINCORE_MODIFIED_OTHER: CInt = 0x10

public val AF_UNSPEC: CInt = 0

public val AF_LOCAL: CInt = 1

public val AF_UNIX: CInt = AF_LOCAL

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NETBIOS: CInt = 6

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

public val AF_ISDN: CInt = 26

public val AF_E164: CInt = AF_ISDN

public val PSEUDO_AF_KEY: CInt = 27

public val AF_INET6: CInt = 28

public val AF_NATM: CInt = 29

public val AF_ATM: CInt = 30

public val PSEUDO_AF_HDRCMPLT: CInt = 31

public val AF_NETGRAPH: CInt = 32

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_UNIX: CInt = PF_LOCAL

public val PF_INET: CInt = AF_INET

public val PF_IMPLINK: CInt = AF_IMPLINK

public val PF_PUP: CInt = AF_PUP

public val PF_CHAOS: CInt = AF_CHAOS

public val PF_NETBIOS: CInt = AF_NETBIOS

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

public val PF_ISDN: CInt = AF_ISDN

public val PF_KEY: CInt = PSEUDO_AF_KEY

public val PF_INET6: CInt = AF_INET6

public val PF_NATM: CInt = AF_NATM

public val PF_ATM: CInt = AF_ATM

public val PF_NETGRAPH: CInt = AF_NETGRAPH

public val PIOD_READ_D: CInt = 1

public val PIOD_WRITE_D: CInt = 2

public val PIOD_READ_I: CInt = 3

public val PIOD_WRITE_I: CInt = 4

public val PT_TRACE_ME: CInt = 0

public val PT_READ_I: CInt = 1

public val PT_READ_D: CInt = 2

public val PT_WRITE_I: CInt = 4

public val PT_WRITE_D: CInt = 5

public val PT_CONTINUE: CInt = 7

public val PT_KILL: CInt = 8

public val PT_STEP: CInt = 9

public val PT_ATTACH: CInt = 10

public val PT_DETACH: CInt = 11

public val PT_IO: CInt = 12

public val SOMAXCONN: CInt = 128

public val MSG_OOB: CInt = 0x00000001

public val MSG_PEEK: CInt = 0x00000002

public val MSG_DONTROUTE: CInt = 0x00000004

public val MSG_EOR: CInt = 0x00000008

public val MSG_TRUNC: CInt = 0x00000010

public val MSG_CTRUNC: CInt = 0x00000020

public val MSG_WAITALL: CInt = 0x00000040

public val MSG_DONTWAIT: CInt = 0x00000080

public val MSG_EOF: CInt = 0x00000100

public val SCM_TIMESTAMP: CInt = 0x02

public val SCM_CREDS: CInt = 0x03

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_CLOEXEC: CInt = 0x10000000

public val SOCK_NONBLOCK: CInt = 0x20000000

public val SOCK_MAXADDRLEN: CInt = 255

public val IP_TTL: CInt = 4

public val IP_HDRINCL: CInt = 2

public val IP_RECVDSTADDR: CInt = 7

public val IP_SENDSRCADDR: CInt = IP_RECVDSTADDR

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IP_RECVIF: CInt = 20

public val IP_RECVTTL: CInt = 65

public val IPV6_RECVHOPLIMIT: CInt = 37

public val IPV6_JOIN_GROUP: CInt = 12

public val IPV6_LEAVE_GROUP: CInt = 13

public val IPV6_CHECKSUM: CInt = 26

public val IPV6_RECVPKTINFO: CInt = 36

public val IPV6_PKTINFO: CInt = 46

public val IPV6_HOPLIMIT: CInt = 47

public val IPV6_RECVTCLASS: CInt = 57

public val IPV6_TCLASS: CInt = 61

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 70

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 71

public val IP_BLOCK_SOURCE: CInt = 72

public val IP_UNBLOCK_SOURCE: CInt = 73

public val TCP_NOPUSH: CInt = 4

public val TCP_NOOPT: CInt = 8

public val TCP_KEEPIDLE: CInt = 256

public val TCP_KEEPINTVL: CInt = 512

public val TCP_KEEPCNT: CInt = 1024

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

public val SO_NOSIGPIPE: CInt = 0x0800

public val SO_ACCEPTFILTER: CInt = 0x1000

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val LOCAL_PEERCRED: CInt = 1

// net/route.h
public val RTF_XRESOLVE: CInt = 0x200

public val RTF_LLINFO: CInt = 0x400

public val RTF_PROTO3: CInt = 0x40000

public val RTF_PINNED: CInt = 0x100000

public val RTF_LOCAL: CInt = 0x200000

public val RTF_BROADCAST: CInt = 0x400000

public val RTF_MULTICAST: CInt = 0x800000

public val RTM_LOCK: CInt = 0x8

public val RTM_RESOLVE: CInt = 0xb

public val RTM_NEWADDR: CInt = 0xc

public val RTM_DELADDR: CInt = 0xd

public val RTM_IFINFO: CInt = 0xe

public val RTM_NEWMADDR: CInt = 0xf

public val RTM_DELMADDR: CInt = 0x10

public val RTM_IFANNOUNCE: CInt = 0x11

public val RTM_IEEE80211: CInt = 0x12

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_NB: CInt = 4

public val LOCK_UN: CInt = 8

public val MAP_COPY: CInt = 0x0002

public val MAP_RENAME: CInt = 0x0020

public val MAP_NORESERVE: CInt = 0x0040

public val MAP_HASSEMAPHORE: CInt = 0x0200

public val MAP_STACK: CInt = 0x0400

public val MAP_NOSYNC: CInt = 0x0800

public val MAP_NOCORE: CInt = 0x020000

public val IPPROTO_RAW: CInt = 255

public val PC_LINK_MAX: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_PATH_MAX: CInt = 5

public val PC_PIPE_BUF: CInt = 6

public val PC_CHOWN_RESTRICTED: CInt = 7

public val PC_NO_TRUNC: CInt = 8

public val PC_VDISABLE: CInt = 9

public val PC_ALLOC_SIZE_MIN: CInt = 10

public val PC_FILESIZEBITS: CInt = 12

public val PC_REC_INCR_XFER_SIZE: CInt = 14

public val PC_REC_MAX_XFER_SIZE: CInt = 15

public val PC_REC_MIN_XFER_SIZE: CInt = 16

public val PC_REC_XFER_ALIGN: CInt = 17

public val PC_SYMLINK_MAX: CInt = 18

public val PC_MIN_HOLE_SIZE: CInt = 21

public val PC_ASYNC_IO: CInt = 53

public val PC_PRIO_IO: CInt = 54

public val PC_SYNC_IO: CInt = 55

public val PC_ACL_EXTENDED: CInt = 59

public val PC_ACL_PATH_MAX: CInt = 60

public val PC_CAP_PRESENT: CInt = 61

public val PC_INF_PRESENT: CInt = 62

public val PC_MAC_PRESENT: CInt = 63

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

public val SC_MAPPED_FILES: CInt = 29

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

public val SC_PAGESIZE: CInt = 47

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_RTSIG_MAX: CInt = 48

public val SC_SEM_NSEMS_MAX: CInt = 49

public val SC_SEM_VALUE_MAX: CInt = 50

public val SC_SIGQUEUE_MAX: CInt = 51

public val SC_TIMER_MAX: CInt = 52

public val SC_IOV_MAX: CInt = 56

public val SC_NPROCESSORS_CONF: CInt = 57

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

public val SC_NPROCESSORS_ONLN: CInt = 58

public val SC_GETGR_R_SIZE_MAX: CInt = 70

public val SC_GETPW_R_SIZE_MAX: CInt = 71

public val SC_HOST_NAME_MAX: CInt = 72

public val SC_LOGIN_NAME_MAX: CInt = 73

public val SC_MONOTONIC_CLOCK: CInt = 74

public val SC_MQ_PRIO_MAX: CInt = 75

public val SC_READER_WRITER_LOCKS: CInt = 76

public val SC_REGEXP: CInt = 77

public val SC_SHELL: CInt = 78

public val SC_SPAWN: CInt = 79

public val SC_SPIN_LOCKS: CInt = 80

public val SC_SPORADIC_SERVER: CInt = 81

public val SC_THREAD_ATTR_STACKADDR: CInt = 82

public val SC_THREAD_ATTR_STACKSIZE: CInt = 83

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 85

public val SC_THREAD_KEYS_MAX: CInt = 86

public val SC_THREAD_PRIO_INHERIT: CInt = 87

public val SC_THREAD_PRIO_PROTECT: CInt = 88

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 89

public val SC_THREAD_PROCESS_SHARED: CInt = 90

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 91

public val SC_THREAD_SPORADIC_SERVER: CInt = 92

public val SC_THREAD_STACK_MIN: CInt = 93

public val SC_THREAD_THREADS_MAX: CInt = 94

public val SC_TIMEOUTS: CInt = 95

public val SC_THREADS: CInt = 96

public val SC_TRACE: CInt = 97

public val SC_TRACE_EVENT_FILTER: CInt = 98

public val SC_TRACE_INHERIT: CInt = 99

public val SC_TRACE_LOG: CInt = 100

public val SC_TTY_NAME_MAX: CInt = 101

public val SC_TYPED_MEMORY_OBJECTS: CInt = 102

public val SC_V6_ILP32_OFF32: CInt = 103

public val SC_V6_ILP32_OFFBIG: CInt = 104

public val SC_V6_LP64_OFF64: CInt = 105

public val SC_V6_LPBIG_OFFBIG: CInt = 106

public val SC_ATEXIT_MAX: CInt = 107

public val SC_XOPEN_CRYPT: CInt = 108

public val SC_XOPEN_ENH_I18N: CInt = 109

public val SC_XOPEN_LEGACY: CInt = 110

public val SC_XOPEN_REALTIME: CInt = 111

public val SC_XOPEN_REALTIME_THREADS: CInt = 112

public val SC_XOPEN_SHM: CInt = 113

public val SC_XOPEN_STREAMS: CInt = 114

public val SC_XOPEN_UNIX: CInt = 115

public val SC_XOPEN_VERSION: CInt = 116

public val SC_XOPEN_XCU_VERSION: CInt = 117

public val SC_IPV6: CInt = 118

public val SC_RAW_SOCKETS: CInt = 119

public val SC_SYMLOOP_MAX: CInt = 120

public val SC_PHYS_PAGES: CInt = 121

public val CS_PATH: CInt = 1

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = null

public val PTHREAD_COND_INITIALIZER: PthreadCondT = null

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = null

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 1

public val PTHREAD_MUTEX_RECURSIVE: CInt = 2

public val PTHREAD_MUTEX_NORMAL: CInt = 3

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_ERRORCHECK

public val SCHED_FIFO: CInt = 1

public val SCHED_OTHER: CInt = 2

public val SCHED_RR: CInt = 3

public val FD_SETSIZE: Int = 1024

public val ST_NOSUID: CUlong = 2uL

public val NI_MAXHOST: SizeT = 1025uL

public val XUCRED_VERSION: CUint = 0u

public val RTLD_LOCAL: CInt = 0

public val RTLD_NODELETE: CInt = 0x1000

public val RTLD_NOLOAD: CInt = 0x2000

public val RTLD_GLOBAL: CInt = 0x100

public val LOG_NTP: CInt = 12 shl 3

public val LOG_SECURITY: CInt = 13 shl 3

public val LOG_CONSOLE: CInt = 14 shl 3

public val LOG_NFACILITIES: CInt = 24

public val TIOCEXCL: CUlong = 0x2000740duL

public val TIOCNXCL: CUlong = 0x2000740euL

public val TIOCFLUSH: CUlong = 0x80047410uL

public val TIOCGETA: CUlong = 0x402c7413uL

public val TIOCSETA: CUlong = 0x802c7414uL

public val TIOCSETAW: CUlong = 0x802c7415uL

public val TIOCSETAF: CUlong = 0x802c7416uL

public val TIOCGETD: CUlong = 0x4004741auL

public val TIOCSETD: CUlong = 0x8004741buL

public val TIOCGDRAINWAIT: CUlong = 0x40047456uL

public val TIOCSDRAINWAIT: CUlong = 0x80047457uL

public val TIOCMGDTRWAIT: CUlong = 0x4004745auL

public val TIOCMSDTRWAIT: CUlong = 0x8004745buL

public val TIOCDRAIN: CUlong = 0x2000745euL

public val TIOCEXT: CUlong = 0x80047460uL

public val TIOCSCTTY: CUlong = 0x20007461uL

public val TIOCCONS: CUlong = 0x80047462uL

public val TIOCGSID: CUlong = 0x40047463uL

public val TIOCSTAT: CUlong = 0x20007465uL

public val TIOCUCNTL: CUlong = 0x80047466uL

public val TIOCSWINSZ: CUlong = 0x80087467uL

public val TIOCGWINSZ: CUlong = 0x40087468uL

public val TIOCMGET: CUlong = 0x4004746auL

public val TIOCM_LE: CInt = 0x1

public val TIOCM_DTR: CInt = 0x2

public val TIOCM_RTS: CInt = 0x4

public val TIOCM_ST: CInt = 0x8

public val TIOCM_SR: CInt = 0x10

public val TIOCM_CTS: CInt = 0x20

public val TIOCM_RI: CInt = 0x80

public val TIOCM_DSR: CInt = 0x100

public val TIOCM_CD: CInt = 0x40

public val TIOCM_CAR: CInt = 0x40

public val TIOCM_RNG: CInt = 0x80

public val TIOCMBIC: CUlong = 0x8004746buL

public val TIOCMBIS: CUlong = 0x8004746cuL

public val TIOCMSET: CUlong = 0x8004746duL

public val TIOCSTART: CUlong = 0x2000746euL

public val TIOCSTOP: CUlong = 0x2000746fuL

public val TIOCPKT: CUlong = 0x80047470uL

public val TIOCPKT_DATA: CInt = 0x0

public val TIOCPKT_FLUSHREAD: CInt = 0x1

public val TIOCPKT_FLUSHWRITE: CInt = 0x2

public val TIOCPKT_STOP: CInt = 0x4

public val TIOCPKT_START: CInt = 0x8

public val TIOCPKT_NOSTOP: CInt = 0x10

public val TIOCPKT_DOSTOP: CInt = 0x20

public val TIOCPKT_IOCTL: CInt = 0x40

public val TIOCNOTTY: CUlong = 0x20007471uL

public val TIOCSTI: CUlong = 0x80017472uL

public val TIOCOUTQ: CUlong = 0x40047473uL

public val TIOCSPGRP: CUlong = 0x80047476uL

public val TIOCGPGRP: CUlong = 0x40047477uL

public val TIOCCDTR: CUlong = 0x20007478uL

public val TIOCSDTR: CUlong = 0x20007479uL

public val TTYDISC: CInt = 0x0

public val SLIPDISC: CInt = 0x4

public val PPPDISC: CInt = 0x5

public val NETGRAPHDISC: CInt = 0x6

public val BIOCGRSIG: CUlong = 0x40044272uL

public val BIOCSRSIG: CUlong = 0x80044273uL

public val BIOCSDLT: CUlong = 0x80044278uL

public val BIOCGSEESENT: CUlong = 0x40044276uL

public val BIOCSSEESENT: CUlong = 0x80044277uL

public val FIODTYPE: CUlong = 0x4004667auL

public val FIOGETLBA: CUlong = 0x40046679uL

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

public val B7200: SpeedT = 7200u

public val B14400: SpeedT = 14400u

public val B28800: SpeedT = 28800u

public val B57600: SpeedT = 57600u

public val B76800: SpeedT = 76800u

public val B115200: SpeedT = 115200u

public val B230400: SpeedT = 230400u

public val EXTA: SpeedT = 19200u

public val EXTB: SpeedT = 38400u

public val SEM_FAILED: SemT? = null

public val CRTSCTS: TcflagT = 0x00030000u

public val CCTS_OFLOW: TcflagT = 0x00010000u

public val CRTS_IFLOW: TcflagT = 0x00020000u

public val CDTR_IFLOW: TcflagT = 0x00040000u

public val CDSR_OFLOW: TcflagT = 0x00080000u

public val CCAR_OFLOW: TcflagT = 0x00100000u

public val VERASE2: Int = 7

public val OCRNL: TcflagT = 0x10u

public val ONOCR: TcflagT = 0x20u

public val ONLRET: TcflagT = 0x40u

public val CMGROUP_MAX: Int = 16

public val EUI64_LEN: Int = 8

// https://github.com/freebsd/freebsd/blob/HEAD/sys/net/bpf.h
public val BPF_ALIGNMENT: Int = SIZEOF_LONG

// Values for rtprio struct (prio field) and syscall (function argument)
public val RTP_PRIO_MIN: CUshort = 0u

public val RTP_PRIO_MAX: CUshort = 31u

public val RTP_LOOKUP: CInt = 0

public val RTP_SET: CInt = 1

// Flags for chflags(2)
public val UF_SETTABLE: CUlong = 0x0000ffffuL

public val UF_NODUMP: CUlong = 0x00000001uL

public val UF_IMMUTABLE: CUlong = 0x00000002uL

public val UF_APPEND: CUlong = 0x00000004uL

public val UF_OPAQUE: CUlong = 0x00000008uL

public val UF_NOUNLINK: CUlong = 0x00000010uL

public val SF_SETTABLE: CUlong = 0xffff0000uL

public val SF_ARCHIVED: CUlong = 0x00010000uL

public val SF_IMMUTABLE: CUlong = 0x00020000uL

public val SF_APPEND: CUlong = 0x00040000uL

public val SF_NOUNLINK: CUlong = 0x00100000uL

public val TIMER_ABSTIME: CInt = 1

// <sys/timex.h>
public val NTP_API: CInt = 4

public val MAXPHASE: CLong = 500000000L

public val MAXFREQ: CLong = 500000L

public val MINSEC: CInt = 256

public val MAXSEC: CInt = 2048

public val NANOSECOND: CLong = 1000000000L

public val SCALE_PPM: CInt = 65

public val MAXTC: CInt = 10

public val MOD_OFFSET: CUint = 0x0001u

public val MOD_FREQUENCY: CUint = 0x0002u

public val MOD_MAXERROR: CUint = 0x0004u

public val MOD_ESTERROR: CUint = 0x0008u

public val MOD_STATUS: CUint = 0x0010u

public val MOD_TIMECONST: CUint = 0x0020u

public val MOD_PPSMAX: CUint = 0x0040u

public val MOD_TAI: CUint = 0x0080u

public val MOD_MICRO: CUint = 0x1000u

public val MOD_NANO: CUint = 0x2000u

public val MOD_CLKB: CUint = 0x4000u

public val MOD_CLKA: CUint = 0x8000u

public val STA_PLL: CInt = 0x0001

public val STA_PPSFREQ: CInt = 0x0002

public val STA_PPSTIME: CInt = 0x0004

public val STA_FLL: CInt = 0x0008

public val STA_INS: CInt = 0x0010

public val STA_DEL: CInt = 0x0020

public val STA_UNSYNC: CInt = 0x0040

public val STA_FREQHOLD: CInt = 0x0080

public val STA_PPSSIGNAL: CInt = 0x0100

public val STA_PPSJITTER: CInt = 0x0200

public val STA_PPSWANDER: CInt = 0x0400

public val STA_PPSERROR: CInt = 0x0800

public val STA_CLOCKERR: CInt = 0x1000

public val STA_NANO: CInt = 0x2000

public val STA_MODE: CInt = 0x4000

public val STA_CLK: CInt = 0x8000

public val STA_RONLY: CInt = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK

public val TIME_OK: CInt = 0

public val TIME_INS: CInt = 1

public val TIME_DEL: CInt = 2

public val TIME_OOP: CInt = 3

public val TIME_WAIT: CInt = 4

public val TIME_ERROR: CInt = 5

public val REG_ENOSYS: CInt = -1

public val REG_ILLSEQ: CInt = 17

public val IPC_PRIVATE: KeyT = 0L

public val IPC_CREAT: CInt = 512

public val IPC_EXCL: CInt = 1024

public val IPC_NOWAIT: CInt = 2048

public val IPC_RMID: CInt = 0

public val IPC_SET: CInt = 1

public val IPC_STAT: CInt = 2

public val IPC_R: CInt = 256

public val IPC_W: CInt = 128

public val IPC_M: CInt = 4096

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val KENV_GET: CInt = 0

public val KENV_SET: CInt = 1

public val KENV_UNSET: CInt = 2

public val KENV_DUMP: CInt = 3

public val KENV_MNAMELEN: CInt = 128

public val KENV_MVALLEN: CInt = 128

public val RB_ASKNAME: CInt = 0x001

public val RB_SINGLE: CInt = 0x002

public val RB_NOSYNC: CInt = 0x004

public val RB_HALT: CInt = 0x008

public val RB_INITNAME: CInt = 0x010

public val RB_DFLTROOT: CInt = 0x020

public val RB_KDB: CInt = 0x040

public val RB_RDONLY: CInt = 0x080

public val RB_DUMP: CInt = 0x100

public val RB_MINIROOT: CInt = 0x200

public val RB_VERBOSE: CInt = 0x800

public val RB_SERIAL: CInt = 0x1000

public val RB_CDROM: CInt = 0x2000

public val RB_POWEROFF: CInt = 0x4000

public val RB_GDB: CInt = 0x8000

public val RB_MUTE: CInt = 0x10000

public val RB_SELFTEST: CInt = 0x20000

// For getrandom()
public val GRND_NONBLOCK: CUint = 0x1u

public val GRND_RANDOM: CUint = 0x2u

public val GRND_INSECURE: CUint = 0x4u

// DIFF(main): changed to `cShort` in f62eb023ab
public val POSIX_SPAWN_RESETIDS: CInt = 0x01

public val POSIX_SPAWN_SETPGROUP: CInt = 0x02

public val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x04

public val POSIX_SPAWN_SETSCHEDULER: CInt = 0x08

public val POSIX_SPAWN_SETSIGDEF: CInt = 0x10

public val POSIX_SPAWN_SETSIGMASK: CInt = 0x20

public fun semDestroy(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_destroy", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt {
    return LibcDynamicFfi.invoke("sem_init", -1, longArrayOf(sem?.value ?: 0L, pshared.toLong(), value.toLong())).toInt()
}

public fun daemon(nochdir: CInt, noclose: CInt): CInt {
    return LibcDynamicFfi.invoke("daemon", -1, longArrayOf(nochdir.toLong(), noclose.toLong())).toInt()
}

public fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt {
    val __slot_2 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("accept4", -1, longArrayOf(s.toLong(), addr?.value ?: 0L, __slot_2, flags.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun chflags(path: String?, flags: CUlong): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("chflags", -1, longArrayOf(__cstr_0, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun chflagsat(fd: CInt, path: String?, flags: CUlong, atflag: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("chflagsat", -1, longArrayOf(fd.toLong(), __cstr_1, flags.toLong(), atflag.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_nanosleep", -1, longArrayOf(clkId.toLong(), flags.toLong(), rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}

public fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_getres", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_settime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt {
    val __slot_1 = if (clkId == null) 0L else LibcDynamicFfi.allocScalarSlot(clkId.toLong())
    try {
        return LibcDynamicFfi.invoke("clock_getcpuclockid", -1, longArrayOf(pid.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (clkId == null) 0L else LibcDynamicFfi.allocScalarSlot(clkId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_getcpuclockid", -1, longArrayOf(__scratch_0, __slot_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun dirfd(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("dirfd", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

public fun duplocale(base: LocaleT): LocaleT {
    val rawRet = LibcDynamicFfi.invoke("duplocale", -1, longArrayOf(base?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun endutxent() {
    LibcDynamicFfi.invoke("endutxent", -1, longArrayOf())
}

public fun fchflags(fd: CInt, flags: CUlong): CInt {
    return LibcDynamicFfi.invoke("fchflags", -1, longArrayOf(fd.toLong(), flags.toLong())).toInt()
}

// DIFF(main): changed to `* const *` in e77f551de9
public fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fexecve", -1, longArrayOf(fd.toLong(), argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
}

public fun futimens(fd: CInt, times: Timespec?): CInt {
    return LibcDynamicFfi.invoke("futimens", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun getdomainname(name: COpaquePointer?, len: CInt): CInt {
    return LibcDynamicFfi.invoke("getdomainname", -1, longArrayOf(name?.value ?: 0L, len.toLong())).toInt()
}

public fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrent_r", -1, longArrayOf(grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getpwent_r", -1, longArrayOf(pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __slot_2 = if (groups == null) 0L else LibcDynamicFfi.allocScalarSlot(groups.toLong())
    val __slot_3 = if (ngroups == null) 0L else LibcDynamicFfi.allocScalarSlot(ngroups.toLong())
    try {
        return LibcDynamicFfi.invoke("getgrouplist", -1, longArrayOf(__cstr_0, basegid.toLong(), __slot_2, __slot_3)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(sa?.value ?: 0L, salen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, servlen.toLong(), flags.toLong())).toInt()
}

public fun getpriority(which: CInt, who: CInt): CInt {
    return LibcDynamicFfi.invoke("getpriority", -1, longArrayOf(which.toLong(), who.toLong())).toInt()
}

public fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt {
    val __slot_0 = if (rgid == null) 0L else LibcDynamicFfi.allocScalarSlot(rgid.toLong())
    val __slot_1 = if (egid == null) 0L else LibcDynamicFfi.allocScalarSlot(egid.toLong())
    val __slot_2 = if (sgid == null) 0L else LibcDynamicFfi.allocScalarSlot(sgid.toLong())
    try {
        return LibcDynamicFfi.invoke("getresgid", -1, longArrayOf(__slot_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt {
    val __slot_0 = if (ruid == null) 0L else LibcDynamicFfi.allocScalarSlot(ruid.toLong())
    val __slot_1 = if (euid == null) 0L else LibcDynamicFfi.allocScalarSlot(euid.toLong())
    val __slot_2 = if (suid == null) 0L else LibcDynamicFfi.allocScalarSlot(suid.toLong())
    try {
        return LibcDynamicFfi.invoke("getresuid", -1, longArrayOf(__slot_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getutxent(): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxid(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxid", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxline", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun initgroups(name: String?, basegid: GidT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("initgroups", -1, longArrayOf(__cstr_0, basegid.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("kevent", -1, longArrayOf(kq.toLong(), changelist?.value ?: 0L, nchanges.toLong(), eventlist?.value ?: 0L, nevents.toLong(), timeout?.value ?: 0L)).toInt()
}

public fun lchflags(path: String?, flags: CUlong): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("lchflags", -1, longArrayOf(__cstr_0, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun lutimes(file: String?, times: Timeval?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("lutimes", -1, longArrayOf(__cstr_0, times?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memrchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mkfifoat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mknodat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), __scratch_3)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun mallocUsableSize(ptr: COpaquePointer?): SizeT {
    return LibcDynamicFfi.invoke("malloc_usable_size", -1, longArrayOf(ptr?.value ?: 0L)).toULong()
}

public fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("mincore", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), vec?.value ?: 0L)).toInt()
}

public fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT {
    val __cstr_1 = if (locale == null) 0L else LibcDynamicFfi.allocUtf8CString(locale)
    try {
        val rawRet = LibcDynamicFfi.invoke("newlocale", -1, longArrayOf(mask.toLong(), __cstr_1, base?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo_l", -1, longArrayOf(item.toLong(), locale?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pipe2(fds: CInt?, flags: CInt): CInt {
    val __slot_0 = if (fds == null) 0L else LibcDynamicFfi.allocScalarSlot(fds.toLong())
    try {
        return LibcDynamicFfi.invoke("pipe2", -1, longArrayOf(__slot_0, flags.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt {
    return LibcDynamicFfi.invoke("posix_fallocate", -1, longArrayOf(fd.toLong(), offset, len)).toInt()
}

public fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_fadvise", -1, longArrayOf(fd.toLong(), offset, len, advise.toLong())).toInt()
}

public fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("ppoll", -1, longArrayOf(fds?.value ?: 0L, __scratch_1, timeout?.value ?: 0L, sigmask?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("preadv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun pthreadAttrGetNp(tid: PthreadT, attr: COpaquePointer?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_attr_get_np", -1, longArrayOf(__scratch_0, attr?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt {
    val __slot_1 = if (guardsize == null) 0L else LibcDynamicFfi.allocScalarSlot(guardsize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getguardsize", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setguardsize", -1, longArrayOf(attr?.value ?: 0L, guardsize.toLong())).toInt()
}

public fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt {
    val __slot_2 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstack", -1, longArrayOf(attr?.value ?: 0L, stackaddr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: ClockidT?): CInt {
    val __slot_1 = if (clockId == null) 0L else LibcDynamicFfi.allocScalarSlot(clockId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_getclock", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt {
    val __slot_1 = if (pshared == null) 0L else LibcDynamicFfi.allocScalarSlot(pshared.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_getpshared", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setclock", -1, longArrayOf(attr?.value ?: 0L, clockId.toLong())).toInt()
}

public fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, pshared.toLong())).toInt()
}

public fun pthreadMainNp(): CInt {
    return LibcDynamicFfi.invoke("pthread_main_np", -1, longArrayOf()).toInt()
}

public fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_timedlock", -1, longArrayOf(lock?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt {
    val __slot_1 = if (pshared == null) 0L else LibcDynamicFfi.allocScalarSlot(pshared.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutexattr_getpshared", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, pshared.toLong())).toInt()
}

public fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: CInt?): CInt {
    val __slot_1 = if (value == null) 0L else LibcDynamicFfi.allocScalarSlot(value.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_rwlockattr_getpshared", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, value.toLong())).toInt()
}

public fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_barrierattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt {
    return LibcDynamicFfi.invoke("pthread_barrierattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt {
    val __slot_1 = if (shared == null) 0L else LibcDynamicFfi.allocScalarSlot(shared.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_barrierattr_getpshared", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_barrierattr_setpshared", -1, longArrayOf(attr?.value ?: 0L, shared.toLong())).toInt()
}

public fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUint): CInt {
    return LibcDynamicFfi.invoke("pthread_barrier_init", -1, longArrayOf(barrier?.value ?: 0L, attr?.value ?: 0L, count.toLong())).toInt()
}

public fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt {
    return LibcDynamicFfi.invoke("pthread_barrier_destroy", -1, longArrayOf(barrier?.value ?: 0L)).toInt()
}

public fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt {
    return LibcDynamicFfi.invoke("pthread_barrier_wait", -1, longArrayOf(barrier?.value ?: 0L)).toInt()
}

public fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("pthread_get_name_np", -1, longArrayOf(__scratch_0, name?.value ?: 0L, len.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        LibcDynamicFfi.invoke("pthread_set_name_np", -1, longArrayOf(__scratch_0, __cstr_1))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_getname_np", -1, longArrayOf(__scratch_0, buffer?.value ?: 0L, length.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("pthread_setname_np", -1, longArrayOf(__scratch_0, __cstr_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_setschedparam", -1, longArrayOf(__scratch_0, policy.toLong(), param?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (policy == null) 0L else LibcDynamicFfi.allocScalarSlot(policy.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_getschedparam", -1, longArrayOf(__scratch_0, __slot_1, param?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt {
    return LibcDynamicFfi.invoke("ptrace", -1, longArrayOf(request.toLong(), pid.toLong(), addr?.value ?: 0L, data.toLong())).toInt()
}

public fun utrace(addr: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("utrace", -1, longArrayOf(addr?.value ?: 0L, len.toLong())).toInt()
}

public fun pututxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("pututxline", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pwritev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("querylocale", -1, longArrayOf(mask.toLong(), loc?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun rtprio(function: CInt, pid: PidT, rtp: Rtprio?): CInt {
    return LibcDynamicFfi.invoke("rtprio", -1, longArrayOf(function.toLong(), pid.toLong(), rtp?.value ?: 0L)).toInt()
}

public fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sched_rr_get_interval", -1, longArrayOf(pid.toLong(), t?.value ?: 0L)).toInt()
}

public fun schedGetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_getparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedSetparam(pid: PidT, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setparam", -1, longArrayOf(pid.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedGetscheduler(pid: PidT): CInt {
    return LibcDynamicFfi.invoke("sched_getscheduler", -1, longArrayOf(pid.toLong())).toInt()
}

public fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("sched_setscheduler", -1, longArrayOf(pid.toLong(), policy.toLong(), param?.value ?: 0L)).toInt()
}

public fun semGetvalue(sem: SemT?, sval: CInt?): CInt {
    val __slot_1 = if (sval == null) 0L else LibcDynamicFfi.allocScalarSlot(sval.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_getvalue", -1, longArrayOf(sem?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sem_timedwait", -1, longArrayOf(sem?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: SfHdtr?, sbytes: OffT?, flags: CInt): CInt {
    val __slot_5 = if (sbytes == null) 0L else LibcDynamicFfi.allocScalarSlot(sbytes)
    try {
        return LibcDynamicFfi.invoke("sendfile", -1, longArrayOf(fd.toLong(), s.toLong(), offset, nbytes.toLong(), hdtr?.value ?: 0L, __slot_5, flags.toLong())).toInt()
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun setdomainname(name: String?, len: CInt): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("setdomainname", -1, longArrayOf(__cstr_0, len.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun sethostname(name: String?, len: CInt): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sethostname", -1, longArrayOf(__cstr_0, len.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun setpriority(which: CInt, who: CInt, prio: CInt): CInt {
    return LibcDynamicFfi.invoke("setpriority", -1, longArrayOf(which.toLong(), who.toLong(), prio.toLong())).toInt()
}

public fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt {
    return LibcDynamicFfi.invoke("setresgid", -1, longArrayOf(rgid.toLong(), egid.toLong(), sgid.toLong())).toInt()
}

public fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt {
    return LibcDynamicFfi.invoke("setresuid", -1, longArrayOf(ruid.toLong(), euid.toLong(), suid.toLong())).toInt()
}

public fun settimeofday(tv: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("settimeofday", -1, longArrayOf(tv?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun setutxent() {
    LibcDynamicFfi.invoke("setutxent", -1, longArrayOf())
}

public fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_open", -1, longArrayOf(__cstr_0, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sigtimedwait", -1, longArrayOf(set?.value ?: 0L, info?.value ?: 0L, timeout?.value ?: 0L)).toInt()
}

public fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt {
    return LibcDynamicFfi.invoke("sigwaitinfo", -1, longArrayOf(set?.value ?: 0L, info?.value ?: 0L)).toInt()
}

public fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt {
    val __slot_0 = if (name == null) 0L else LibcDynamicFfi.allocScalarSlot(name.toLong())
    val __slot_3 = if (oldlenp == null) 0L else LibcDynamicFfi.allocScalarSlot(oldlenp.toLong())
    try {
        return LibcDynamicFfi.invoke("sysctl", -1, longArrayOf(__slot_0, namelen.toLong(), oldp?.value ?: 0L, __slot_3, newp?.value ?: 0L, newlen.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __slot_2 = if (oldlenp == null) 0L else LibcDynamicFfi.allocScalarSlot(oldlenp.toLong())
    try {
        return LibcDynamicFfi.invoke("sysctlbyname", -1, longArrayOf(__cstr_0, oldp?.value ?: 0L, __slot_2, newp?.value ?: 0L, newlen.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sysctlnametomib(name: String?, mibp: CInt?, sizep: SizeT?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __slot_1 = if (mibp == null) 0L else LibcDynamicFfi.allocScalarSlot(mibp.toLong())
    val __slot_2 = if (sizep == null) 0L else LibcDynamicFfi.allocScalarSlot(sizep.toLong())
    try {
        return LibcDynamicFfi.invoke("sysctlnametomib", -1, longArrayOf(__cstr_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun uselocale(loc: LocaleT): LocaleT {
    val rawRet = LibcDynamicFfi.invoke("uselocale", -1, longArrayOf(loc?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("utimensat", -1, longArrayOf(dirfd.toLong(), __cstr_1, times?.value ?: 0L, flag.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun ntpAdjtime(buf: Timex?): CInt {
    return LibcDynamicFfi.invoke("ntp_adjtime", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun ntpGettime(buf: Ntptimeval?): CInt {
    return LibcDynamicFfi.invoke("ntp_gettime", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

// #include <link.h>
public fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dl_iterate_phdr", -1, longArrayOf(callback?.value ?: 0L, data?.value ?: 0L)).toInt()
}

public fun iconvOpen(tocode: String?, fromcode: String?): IconvT {
    val __cstr_0 = if (tocode == null) 0L else LibcDynamicFfi.allocUtf8CString(tocode)
    val __cstr_1 = if (fromcode == null) 0L else LibcDynamicFfi.allocUtf8CString(fromcode)
    try {
        val rawRet = LibcDynamicFfi.invoke("iconv_open", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT {
    val __slot_2 = if (inbytesleft == null) 0L else LibcDynamicFfi.allocScalarSlot(inbytesleft.toLong())
    val __slot_4 = if (outbytesleft == null) 0L else LibcDynamicFfi.allocScalarSlot(outbytesleft.toLong())
    try {
        return LibcDynamicFfi.invoke("iconv", -1, longArrayOf(cd?.value ?: 0L, inbuf?.value ?: 0L, __slot_2, outbuf?.value ?: 0L, __slot_4)).toULong()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun iconvClose(cd: IconvT): CInt {
    return LibcDynamicFfi.invoke("iconv_close", -1, longArrayOf(cd?.value ?: 0L)).toInt()
}

// Added in `FreeBSD` 11.0
// Added in `DragonFly BSD` 5.4
public fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    LibcDynamicFfi.invoke("explicit_bzero", -1, longArrayOf(s?.value ?: 0L, len.toLong()))
}

// ISO/IEC 9899:2011 ("ISO C11") K.3.7.4.1
public fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt {
    return LibcDynamicFfi.invoke("memset_s", -1, longArrayOf(s?.value ?: 0L, smax.toLong(), c.toLong(), n.toLong())).toInt()
}

public fun gethostid(): CLong {
    return LibcDynamicFfi.invoke("gethostid", -1, longArrayOf())
}

public fun sethostid(hostid: CLong) {
    LibcDynamicFfi.invoke("sethostid", -1, longArrayOf(hostid))
}

public fun eui64Aton(a: String?, e: Eui64?): CInt {
    val __cstr_0 = if (a == null) 0L else LibcDynamicFfi.allocUtf8CString(a)
    try {
        return LibcDynamicFfi.invoke("eui64_aton", -1, longArrayOf(__cstr_0, e?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun eui64Ntoa(id: Eui64?, a: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("eui64_ntoa", -1, longArrayOf(id?.value ?: 0L, a?.value ?: 0L, len.toLong())).toInt()
}

public fun eui64Ntohost(hostname: COpaquePointer?, len: SizeT, id: Eui64?): CInt {
    return LibcDynamicFfi.invoke("eui64_ntohost", -1, longArrayOf(hostname?.value ?: 0L, len.toLong(), id?.value ?: 0L)).toInt()
}

public fun eui64Hostton(hostname: String?, id: Eui64?): CInt {
    val __cstr_0 = if (hostname == null) 0L else LibcDynamicFfi.allocUtf8CString(hostname)
    try {
        return LibcDynamicFfi.invoke("eui64_hostton", -1, longArrayOf(__cstr_0, id?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun eaccess(path: String?, mode: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("eaccess", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun kenv(action: CInt, name: String?, value: COpaquePointer?, len: CInt): CInt {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("kenv", -1, longArrayOf(action.toLong(), __cstr_1, value?.value ?: 0L, len.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun reboot(howto: CInt): CInt {
    return LibcDynamicFfi.invoke("reboot", -1, longArrayOf(howto.toLong())).toInt()
}

public fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("exect", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    val __cstr_1 = if (searchPath == null) 0L else LibcDynamicFfi.allocUtf8CString(searchPath)
    try {
        return LibcDynamicFfi.invoke("execvP", -1, longArrayOf(__cstr_0, __cstr_1, argv?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mkostemp(template: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemp", -1, longArrayOf(template?.value ?: 0L, flags.toLong())).toInt()
}

public fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong(), flags.toLong())).toInt()
}

public fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __slot_0 = if (pid == null) 0L else LibcDynamicFfi.allocScalarSlot(pid.toLong())
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn", -1, longArrayOf(__slot_0, __cstr_1, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __slot_0 = if (pid == null) 0L else LibcDynamicFfi.allocScalarSlot(pid.toLong())
    val __cstr_1 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("posix_spawnp", -1, longArrayOf(__slot_0, __cstr_1, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnattrInit(attr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_getsigdefault", -1, longArrayOf(attr?.value ?: 0L, default?.value ?: 0L)).toInt()
}

public fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setsigdefault", -1, longArrayOf(attr?.value ?: 0L, default?.value ?: 0L)).toInt()
}

public fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_getsigmask", -1, longArrayOf(attr?.value ?: 0L, default?.value ?: 0L)).toInt()
}

public fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setsigmask", -1, longArrayOf(attr?.value ?: 0L, default?.value ?: 0L)).toInt()
}

public fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt {
    val __slot_1 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getflags", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setflags", -1, longArrayOf(attr?.value ?: 0L, flags.toLong())).toInt()
}

public fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt {
    val __slot_1 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getpgroup", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setpgroup", -1, longArrayOf(attr?.value ?: 0L, flags.toLong())).toInt()
}

public fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: CInt?): CInt {
    val __slot_1 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getschedpolicy", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setschedpolicy", -1, longArrayOf(attr?.value ?: 0L, flags.toLong())).toInt()
}

public fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_getschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_init", -1, longArrayOf(actions?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_destroy", -1, longArrayOf(actions?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_2 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addopen", -1, longArrayOf(actions?.value ?: 0L, fd.toLong(), __cstr_2, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addclose", -1, longArrayOf(actions?.value ?: 0L, fd.toLong())).toInt()
}

public fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_adddup2", -1, longArrayOf(actions?.value ?: 0L, fd.toLong(), newfd.toLong())).toInt()
}

public fun mqClose(mqd: MqdT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mq_close", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mq_getattr", -1, longArrayOf(__scratch_0, attr?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mq_notify", -1, longArrayOf(__scratch_0, notification?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        LibcDynamicFfi.invoke("mq_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs)
        return null as MqdT
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (msgPrio == null) 0L else LibcDynamicFfi.allocScalarSlot(msgPrio.toLong())
    try {
        return LibcDynamicFfi.invoke("mq_receive", -1, longArrayOf(__scratch_0, msgPtr?.value ?: 0L, msgLen.toLong(), __slot_3))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __cstr_1 = if (msgPtr == null) 0L else LibcDynamicFfi.allocUtf8CString(msgPtr)
    try {
        return LibcDynamicFfi.invoke("mq_send", -1, longArrayOf(__scratch_0, __cstr_1, msgLen.toLong(), msgPrio.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mq_setattr", -1, longArrayOf(__scratch_0, newattr?.value ?: 0L, oldattr?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (msgPrio == null) 0L else LibcDynamicFfi.allocScalarSlot(msgPrio.toLong())
    try {
        return LibcDynamicFfi.invoke("mq_timedreceive", -1, longArrayOf(__scratch_0, msgPtr?.value ?: 0L, msgLen.toLong(), __slot_3, absTimeout?.value ?: 0L))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __cstr_1 = if (msgPtr == null) 0L else LibcDynamicFfi.allocUtf8CString(msgPtr)
    try {
        return LibcDynamicFfi.invoke("mq_timedsend", -1, longArrayOf(__scratch_0, __cstr_1, msgLen.toLong(), msgPrio.toLong(), absTimeout?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mqUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("mq_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("getrandom", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong(), flags.toLong()))
}

public fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("getentropy", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    val __slot_1 = if (aslave == null) 0L else LibcDynamicFfi.allocScalarSlot(aslave.toLong())
    try {
        return LibcDynamicFfi.invoke("openpty", -1, longArrayOf(__slot_0, __slot_1, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    try {
        return LibcDynamicFfi.invoke("forkpty", -1, longArrayOf(__slot_0, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun loginTty(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("login_tty", -1, longArrayOf(fd.toLong())).toInt()
}

public fun fparseln(stream: FILE?, len: SizeT?, lineno: SizeT?, delim: String?, flags: CInt): COpaquePointer? {
    val __slot_1 = if (len == null) 0L else LibcDynamicFfi.allocScalarSlot(len.toLong())
    val __slot_2 = if (lineno == null) 0L else LibcDynamicFfi.allocScalarSlot(lineno.toLong())
    val __cstr_3 = if (delim == null) 0L else LibcDynamicFfi.allocUtf8CString(delim)
    try {
        val rawRet = LibcDynamicFfi.invoke("fparseln", -1, longArrayOf(stream?.handle ?: 0L, __slot_1, __slot_2, __cstr_3, flags.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT {
    return LibcDynamicFfi.invoke("backtrace", -1, longArrayOf(addrlist?.value ?: 0L, len.toLong())).toULong()
}

public fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("backtrace_symbols", -1, longArrayOf(addrlist?.value ?: 0L, len.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("backtrace_symbols_fd", -1, longArrayOf(addrlist?.value ?: 0L, len.toLong(), fd.toLong())).toInt()
}

public fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): COpaquePointer? {
    val __cstr_0 = if (execfile == null) 0L else LibcDynamicFfi.allocUtf8CString(execfile)
    val __cstr_1 = if (corefile == null) 0L else LibcDynamicFfi.allocUtf8CString(corefile)
    val __cstr_2 = if (swapfile == null) 0L else LibcDynamicFfi.allocUtf8CString(swapfile)
    val __cstr_4 = if (errstr == null) 0L else LibcDynamicFfi.allocUtf8CString(errstr)
    try {
        val rawRet = LibcDynamicFfi.invoke("kvm_open", -1, longArrayOf(__cstr_0, __cstr_1, __cstr_2, flags.toLong(), __cstr_4))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
        if (__cstr_4 != 0L) LibcDynamicFfi.freeMem(__cstr_4)
    }
}

public fun kvmClose(kd: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("kvm_close", -1, longArrayOf(kd?.value ?: 0L)).toInt()
}

public fun kvmGetprocs(kd: COpaquePointer?, op: CInt, arg: CInt, cnt: CInt?): KinfoProc? {
    val __slot_3 = if (cnt == null) 0L else LibcDynamicFfi.allocScalarSlot(cnt.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("kvm_getprocs", -1, longArrayOf(kd?.value ?: 0L, op.toLong(), arg.toLong(), __slot_3))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun kvmGetloadavg(kd: COpaquePointer?, loadavg: CDouble?, nelem: CInt): CInt {
    val __slot_1 = if (loadavg == null) 0L else LibcDynamicFfi.allocScalarSlot(loadavg.toRawBits())
    try {
        return LibcDynamicFfi.invoke("kvm_getloadavg", -1, longArrayOf(kd?.value ?: 0L, __slot_1, nelem.toLong())).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: COpaquePointer?): COpaquePointer? {
    val __cstr_0 = if (execfile == null) 0L else LibcDynamicFfi.allocUtf8CString(execfile)
    val __cstr_1 = if (corefile == null) 0L else LibcDynamicFfi.allocUtf8CString(corefile)
    val __cstr_2 = if (swapfile == null) 0L else LibcDynamicFfi.allocUtf8CString(swapfile)
    try {
        val rawRet = LibcDynamicFfi.invoke("kvm_openfiles", -1, longArrayOf(__cstr_0, __cstr_1, __cstr_2, flags.toLong(), errbuf?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun kvmRead(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("kvm_read", -1, longArrayOf(kd?.value ?: 0L, addr.toLong(), buf?.value ?: 0L, nbytes.toLong()))
}

public fun kvmWrite(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("kvm_write", -1, longArrayOf(kd?.value ?: 0L, addr.toLong(), buf?.value ?: 0L, nbytes.toLong()))
}
