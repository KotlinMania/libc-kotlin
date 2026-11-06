package io.github.kotlinmania.libc.unix.solarish

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: DlPhdrInfo?, size: ULong, data: COpaquePointer?): CInt
}

public typealias CaddrT = COpaquePointer?

public typealias ClockidT = CInt

public typealias BlkcntT = CLong

public typealias ClockT = CLong

public typealias DaddrT = CLong

public typealias DevT = CUlong

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias InoT = CUlong

public typealias KeyT = CInt

public typealias MajorT = CUint

public typealias MinorT = CUint

public typealias ModeT = CUint

public typealias NlinkT = CUint

public typealias RlimT = CUlong

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias TimeT = CLong

public typealias TimerT = CInt

public typealias WcharT = CInt

public typealias NfdsT = CUlong

public typealias ProjidT = CInt

public typealias ZoneidT = CInt

public typealias PsetidT = CInt

public typealias ProcessoridT = CInt

public typealias ChipidT = CInt

public typealias CtidT = IdT

public typealias SusecondsT = CLong

public typealias OffT = CLong

public typealias UsecondsT = CUint

public typealias SocklenT = CUint

public typealias SaFamilyT = UShort

public typealias PthreadT = CUint

public typealias PthreadKeyT = CUint

public typealias ThreadT = CUint

public typealias BlksizeT = CInt

public typealias NlItem = CInt

public typealias MqdT = COpaquePointer?

public typealias IdT = CInt

public typealias IdtypeT = CUint

public typealias ShmattT = CUlong

public typealias LgrpIdT = IdT

public typealias LgrpMemSizeT = CLonglong

public typealias LgrpCookieT = UintptrT

public typealias LgrpContentT = CUint

public typealias LgrpLatBetweenT = CUint

public typealias LgrpMemSizeFlagT = CUint

public typealias LgrpViewT = CUint

public typealias PosixSpawnattrT = COpaquePointer?

public typealias PosixSpawnFileActionsT = COpaquePointer?

public fun <T> SiginfoT.sidata(): T {
    return (((this.dataPad).toInt() as T?))
}

public fun SiginfoT.siAddr(): COpaquePointer? {
    val sifault: SiginfoFault = this.sidata()
    return sifault.addr
}

public fun SiginfoT.siUid(): UidT {
    val kill: SiginfoKill = this.sidata()
    return kill.value.uid
}

public fun SiginfoT.siValue(): Sigval {
    val kill: SiginfoKill = this.sidata()
    return kill.value.value
}

public fun SiginfoT.siPid(): PidT {
    val sigcld: SiginfoSigcld = this.sidata()
    return sigcld.pid
}

public fun SiginfoT.siStatus(): CInt {
    val sigcld: SiginfoSigcld = this.sidata()
    return sigcld.value.status
}

public fun SiginfoT.siUtime(): CLong {
    val sigcld: SiginfoSigcld = this.sidata()
    return sigcld.value.utime
}

public fun SiginfoT.siStime(): CLong {
    val sigcld: SiginfoSigcld = this.sidata()
    return sigcld.value.stime
}

public val LC_CTYPE: CInt = 0

public val LC_NUMERIC: CInt = 1

public val LC_TIME: CInt = 2

public val LC_COLLATE: CInt = 3

public val LC_MONETARY: CInt = 4

public val LC_MESSAGES: CInt = 5

public val LC_ALL: CInt = 6

public val LC_CTYPE_MASK: CInt = 1 shl LC_CTYPE

public val LC_NUMERIC_MASK: CInt = 1 shl LC_NUMERIC

public val LC_TIME_MASK: CInt = 1 shl LC_TIME

public val LC_COLLATE_MASK: CInt = 1 shl LC_COLLATE

public val LC_MONETARY_MASK: CInt = 1 shl LC_MONETARY

public val LC_MESSAGES_MASK: CInt = 1 shl LC_MESSAGES

public val LC_ALL_MASK: CInt = LC_CTYPE_MASK or LC_NUMERIC_MASK or LC_TIME_MASK or LC_COLLATE_MASK or LC_MONETARY_MASK or LC_MESSAGES_MASK

public val DAY_1: NlItem = 1

public val DAY_2: NlItem = 2

public val DAY_3: NlItem = 3

public val DAY_4: NlItem = 4

public val DAY_5: NlItem = 5

public val DAY_6: NlItem = 6

public val DAY_7: NlItem = 7

public val ABDAY_1: NlItem = 8

public val ABDAY_2: NlItem = 9

public val ABDAY_3: NlItem = 10

public val ABDAY_4: NlItem = 11

public val ABDAY_5: NlItem = 12

public val ABDAY_6: NlItem = 13

public val ABDAY_7: NlItem = 14

public val MON_1: NlItem = 15

public val MON_2: NlItem = 16

public val MON_3: NlItem = 17

public val MON_4: NlItem = 18

public val MON_5: NlItem = 19

public val MON_6: NlItem = 20

public val MON_7: NlItem = 21

public val MON_8: NlItem = 22

public val MON_9: NlItem = 23

public val MON_10: NlItem = 24

public val MON_11: NlItem = 25

public val MON_12: NlItem = 26

public val ABMON_1: NlItem = 27

public val ABMON_2: NlItem = 28

public val ABMON_3: NlItem = 29

public val ABMON_4: NlItem = 30

public val ABMON_5: NlItem = 31

public val ABMON_6: NlItem = 32

public val ABMON_7: NlItem = 33

public val ABMON_8: NlItem = 34

public val ABMON_9: NlItem = 35

public val ABMON_10: NlItem = 36

public val ABMON_11: NlItem = 37

public val ABMON_12: NlItem = 38

public val RADIXCHAR: NlItem = 39

public val THOUSEP: NlItem = 40

public val YESSTR: NlItem = 41

public val NOSTR: NlItem = 42

public val CRNCYSTR: NlItem = 43

public val D_T_FMT: NlItem = 44

public val D_FMT: NlItem = 45

public val T_FMT: NlItem = 46

public val AM_STR: NlItem = 47

public val PM_STR: NlItem = 48

public val CODESET: NlItem = 49

public val T_FMT_AMPM: NlItem = 50

public val ERA: NlItem = 51

public val ERA_D_FMT: NlItem = 52

public val ERA_D_T_FMT: NlItem = 53

public val ERA_T_FMT: NlItem = 54

public val ALT_DIGITS: NlItem = 55

public val YESEXPR: NlItem = 56

public val NOEXPR: NlItem = 57

public val DATE_FMT: NlItem = 58

public val MAXSTRMSG: NlItem = 58

public val PATH_MAX: CInt = 1024

public val SA_ONSTACK: CInt = 0x00000001

public val SA_RESETHAND: CInt = 0x00000002

public val SA_RESTART: CInt = 0x00000004

public val SA_SIGINFO: CInt = 0x00000008

public val SA_NODEFER: CInt = 0x00000010

public val SA_NOCLDWAIT: CInt = 0x00010000

public val SA_NOCLDSTOP: CInt = 0x00020000

public val SS_ONSTACK: CInt = 1

public val SS_DISABLE: CInt = 2

public val FIOCLEX: CInt = 0x20006601

public val FIONCLEX: CInt = 0x20006602

public val FIONREAD: CInt = 0x4004667f

public val FIONBIO: CInt = 0x8004667e

public val FIOASYNC: CInt = 0x8004667d

public val FIOSETOWN: CInt = 0x8004667c

public val FIOGETOWN: CInt = 0x4004667b

public val SIGCHLD: CInt = 18

public val SIGCLD: CInt = SIGCHLD

public val SIGBUS: CInt = 10

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 3

public val AIO_CANCELED: CInt = 0

public val AIO_ALLDONE: CInt = 1

public val AIO_NOTCANCELED: CInt = 2

public val LIO_NOP: CInt = 0

public val LIO_READ: CInt = 1

public val LIO_WRITE: CInt = 2

public val LIO_NOWAIT: CInt = 0

public val LIO_WAIT: CInt = 1

public val SIGEV_NONE: CInt = 1

public val SIGEV_SIGNAL: CInt = 2

public val SIGEV_THREAD: CInt = 3

public val SIGEV_PORT: CInt = 4

public val CLD_EXITED: CInt = 1

public val CLD_KILLED: CInt = 2

public val CLD_DUMPED: CInt = 3

public val CLD_TRAPPED: CInt = 4

public val CLD_STOPPED: CInt = 5

public val CLD_CONTINUED: CInt = 6

public val IP_RECVDSTADDR: CInt = 0x7

public val IP_PKTINFO: CInt = 0x1a

public val IP_DONTFRAG: CInt = 0x1b

public val IP_SEC_OPT: CInt = 0x22

public val IPV6_UNICAST_HOPS: CInt = 0x5

public val IPV6_MULTICAST_IF: CInt = 0x6

public val IPV6_MULTICAST_HOPS: CInt = 0x7

public val IPV6_MULTICAST_LOOP: CInt = 0x8

public val IPV6_PKTINFO: CInt = 0xb

public val IPV6_RECVPKTINFO: CInt = 0x12

public val IPV6_RECVTCLASS: CInt = 0x19

public val IPV6_DONTFRAG: CInt = 0x21

public val IPV6_SEC_OPT: CInt = 0x22

public val IPV6_TCLASS: CInt = 0x26

public val IPV6_V6ONLY: CInt = 0x27

public val IPV6_BOUND_IF: CInt = 0x41

public val ST_RDONLY: CUlong = 1uL

public val ST_NOSUID: CUlong = 2uL

public val NI_MAXHOST: SocklenT = 1025u

public val NI_MAXSERV: SocklenT = 32u

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 32767

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val SEEK_DATA: CInt = 3

public val SEEK_HOLE: CInt = 4

public val IOFBF: CInt = 0

public val IONBF: CInt = 4

public val IOLBF: CInt = 64

public val BUFSIZ: CUint = 1024u

public val FOPEN_MAX: CUint = 20u

public val FILENAME_MAX: CUint = 1024u

public val L_TMPNAM: CUint = 25u

public val TMP_MAX: CUint = 17576u

public val PIPE_BUF: CInt = 5120

public val GRND_NONBLOCK: CUint = 0x0001u

public val GRND_RANDOM: CUint = 0x0002u

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val O_NDELAY: CInt = 0x04

public val O_APPEND: CInt = 8

public val O_DSYNC: CInt = 0x40

public val O_RSYNC: CInt = 0x8000

public val O_CREAT: CInt = 256

public val O_EXCL: CInt = 1024

public val O_NOCTTY: CInt = 2048

public val O_TRUNC: CInt = 512

public val O_NOFOLLOW: CInt = 0x20000

public val O_SEARCH: CInt = 0x200000

public val O_EXEC: CInt = 0x400000

public val O_CLOEXEC: CInt = 0x800000

public val O_ACCMODE: CInt = 0x600003

public val O_XATTR: CInt = 0x4000

public val O_DIRECTORY: CInt = 0x1000000

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

public val F_SETLK: CInt = 6

public val F_SETLKW: CInt = 7

public val F_GETLK: CInt = 14

public val F_ALLOCSP: CInt = 10

public val F_FREESP: CInt = 11

public val F_BLOCKS: CInt = 18

public val F_BLKSIZE: CInt = 19

public val F_SHARE: CInt = 40

public val F_UNSHARE: CInt = 41

public val F_ISSTREAM: CInt = 13

public val F_PRIV: CInt = 15

public val F_NPRIV: CInt = 16

public val F_QUOTACTL: CInt = 17

public val F_GETOWN: CInt = 23

public val F_SETOWN: CInt = 24

public val F_REVOKE: CInt = 25

public val F_HASREMOTELOCKS: CInt = 26

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGABRT: CInt = 6

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGSEGV: CInt = 11

public val SIGSYS: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGUSR1: CInt = 16

public val SIGUSR2: CInt = 17

public val SIGPWR: CInt = 19

public val SIGWINCH: CInt = 20

public val SIGURG: CInt = 21

public val SIGPOLL: CInt = 22

public val SIGIO: CInt = SIGPOLL

public val SIGSTOP: CInt = 23

public val SIGTSTP: CInt = 24

public val SIGCONT: CInt = 25

public val SIGTTIN: CInt = 26

public val SIGTTOU: CInt = 27

public val SIGVTALRM: CInt = 28

public val SIGPROF: CInt = 29

public val SIGXCPU: CInt = 30

public val SIGXFSZ: CInt = 31

public val WNOHANG: CInt = 0x40

public val WUNTRACED: CInt = 0x04

public val WEXITED: CInt = 0x01

public val WTRAPPED: CInt = 0x02

public val WSTOPPED: CInt = WUNTRACED

public val WCONTINUED: CInt = 0x08

public val WNOWAIT: CInt = 0x80

public val AT_FDCWD: CInt = 0xffd19553

public val AT_SYMLINK_NOFOLLOW: CInt = 0x1000

public val AT_SYMLINK_FOLLOW: CInt = 0x2000

public val AT_REMOVEDIR: CInt = 0x1

public val AT_TRIGGER: CInt = 0x2

public val AT_EACCESS: CInt = 0x4

public val P_PID: IdtypeT = 0u

public val P_PPID: IdtypeT = 1u

public val P_PGID: IdtypeT = 2u

public val P_SID: IdtypeT = 3u

public val P_CID: IdtypeT = 4u

public val P_UID: IdtypeT = 5u

public val P_GID: IdtypeT = 6u

public val P_ALL: IdtypeT = 7u

public val P_LWPID: IdtypeT = 8u

public val P_TASKID: IdtypeT = 9u

public val P_PROJID: IdtypeT = 10u

public val P_POOLID: IdtypeT = 11u

public val P_ZONEID: IdtypeT = 12u

public val P_CTID: IdtypeT = 13u

public val P_CPUID: IdtypeT = 14u

public val P_PSETID: IdtypeT = 15u

public val PBIND_NONE: ProcessoridT = -1

public val PBIND_QUERY: ProcessoridT = -2

public val PS_NONE: CInt = -1

public val PS_QUERY: CInt = -2

public val PS_MYID: CInt = -3

public val PS_SOFT: CInt = -4

public val PS_HARD: CInt = -5

public val PS_QUERY_TYPE: CInt = -6

public val PS_PRIVATE: CInt = 2

public val UTIME_OMIT: CLong = -2L

public val UTIME_NOW: CLong = -1L

public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_FIXED: CInt = 0x0010

public val MAP_NORESERVE: CInt = 0x40

public val MAP_ANON: CInt = 0x0100

public val MAP_ANONYMOUS: CInt = 0x0100

public val MAP_RENAME: CInt = 0x20

public val MAP_ALIGN: CInt = 0x200

public val MAP_TEXT: CInt = 0x400

public val MAP_INITDATA: CInt = 0x800

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MS_SYNC: CInt = 0x0004

public val MS_ASYNC: CInt = 0x0001

public val MS_INVALIDATE: CInt = 0x0002

public val MMOBJ_PADDING: CUint = 0x10000u

public val MMOBJ_INTERPRET: CUint = 0x20000u

public val MR_PADDING: CUint = 0x1u

public val MR_HDR_ELF: CUint = 0x2u

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

public val ENOMSG: CInt = 35

public val EIDRM: CInt = 36

public val ECHRNG: CInt = 37

public val EL2NSYNC: CInt = 38

public val EL3HLT: CInt = 39

public val EL3RST: CInt = 40

public val ELNRNG: CInt = 41

public val EUNATCH: CInt = 42

public val ENOCSI: CInt = 43

public val EL2HLT: CInt = 44

public val EDEADLK: CInt = 45

public val ENOLCK: CInt = 46

public val ECANCELED: CInt = 47

public val ENOTSUP: CInt = 48

public val EDQUOT: CInt = 49

public val EBADE: CInt = 50

public val EBADR: CInt = 51

public val EXFULL: CInt = 52

public val ENOANO: CInt = 53

public val EBADRQC: CInt = 54

public val EBADSLT: CInt = 55

public val EDEADLOCK: CInt = 56

public val EBFONT: CInt = 57

public val EOWNERDEAD: CInt = 58

public val ENOTRECOVERABLE: CInt = 59

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

public val ELOCKUNMAPPED: CInt = 72

public val ENOTACTIVE: CInt = 73

public val EMULTIHOP: CInt = 74

public val EADI: CInt = 75

public val EBADMSG: CInt = 77

public val ENAMETOOLONG: CInt = 78

public val EOVERFLOW: CInt = 79

public val ENOTUNIQ: CInt = 80

public val EBADFD: CInt = 81

public val EREMCHG: CInt = 82

public val ELIBACC: CInt = 83

public val ELIBBAD: CInt = 84

public val ELIBSCN: CInt = 85

public val ELIBMAX: CInt = 86

public val ELIBEXEC: CInt = 87

public val EILSEQ: CInt = 88

public val ENOSYS: CInt = 89

public val ELOOP: CInt = 90

public val ERESTART: CInt = 91

public val ESTRPIPE: CInt = 92

public val ENOTEMPTY: CInt = 93

public val EUSERS: CInt = 94

public val ENOTSOCK: CInt = 95

public val EDESTADDRREQ: CInt = 96

public val EMSGSIZE: CInt = 97

public val EPROTOTYPE: CInt = 98

public val ENOPROTOOPT: CInt = 99

public val EPROTONOSUPPORT: CInt = 120

public val ESOCKTNOSUPPORT: CInt = 121

public val EOPNOTSUPP: CInt = 122

public val EPFNOSUPPORT: CInt = 123

public val EAFNOSUPPORT: CInt = 124

public val EADDRINUSE: CInt = 125

public val EADDRNOTAVAIL: CInt = 126

public val ENETDOWN: CInt = 127

public val ENETUNREACH: CInt = 128

public val ENETRESET: CInt = 129

public val ECONNABORTED: CInt = 130

public val ECONNRESET: CInt = 131

public val ENOBUFS: CInt = 132

public val EISCONN: CInt = 133

public val ENOTCONN: CInt = 134

public val ESHUTDOWN: CInt = 143

public val ETOOMANYREFS: CInt = 144

public val ETIMEDOUT: CInt = 145

public val ECONNREFUSED: CInt = 146

public val EHOSTDOWN: CInt = 147

public val EHOSTUNREACH: CInt = 148

public val EWOULDBLOCK: CInt = EAGAIN

public val EALREADY: CInt = 149

public val EINPROGRESS: CInt = 150

public val ESTALE: CInt = 151

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

public val EAI_OVERFLOW: CInt = 12

public val NI_NOFQDN: CUint = 0x0001u

public val NI_NUMERICHOST: CUint = 0x0002u

public val NI_NAMEREQD: CUint = 0x0004u

public val NI_NUMERICSERV: CUint = 0x0008u

public val NI_DGRAM: CUint = 0x0010u

public val NI_WITHSCOPEID: CUint = 0x0020u

public val NI_NUMERICSCOPE: CUint = 0x0040u

public val F_DUPFD: CInt = 0

public val F_DUP2FD: CInt = 9

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETXFL: CInt = 45

public val SIGTRAP: CInt = 5

public val GLOB_APPEND: CInt = 32

public val GLOB_DOOFFS: CInt = 16

public val GLOB_ERR: CInt = 1

public val GLOB_MARK: CInt = 2

public val GLOB_NOCHECK: CInt = 8

public val GLOB_NOSORT: CInt = 4

public val GLOB_NOESCAPE: CInt = 64

public val GLOB_NOSPACE: CInt = -2

public val GLOB_ABORTED: CInt = -1

public val GLOB_NOMATCH: CInt = -3

public val POLLIN: CShort = 0x1

public val POLLPRI: CShort = 0x2

public val POLLOUT: CShort = 0x4

public val POLLERR: CShort = 0x8

public val POLLHUP: CShort = 0x10

public val POLLNVAL: CShort = 0x20

public val POLLNORM: CShort = 0x0040

public val POLLRDNORM: CShort = 0x0040

public val POLLWRNORM: CShort = 0x4

// POLLOUT
public val POLLRDBAND: CShort = 0x0080

public val POLLWRBAND: CShort = 0x0100

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_DONTNEED: CInt = 4

public val POSIX_SPAWN_RESETIDS: CShort = 0x1

public val POSIX_SPAWN_SETPGROUP: CShort = 0x2

public val POSIX_SPAWN_SETSIGDEF: CShort = 0x4

public val POSIX_SPAWN_SETSIGMASK: CShort = 0x8

public val POSIX_SPAWN_SETSCHEDPARAM: CShort = 0x10

public val POSIX_SPAWN_SETSCHEDULER: CShort = 0x20

public val POSIX_SPAWN_SETSIGIGN_NP: CShort = 0x800

public val POSIX_SPAWN_NOSIGCHLD_NP: CShort = 0x1000

public val POSIX_SPAWN_WAITPID_NP: CShort = 0x2000

public val POSIX_SPAWN_NOEXECERR_NP: CShort = 0x4000

public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_CREATE_DETACHED: CInt = 0x40

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val PTHREAD_PROCESS_PRIVATE: CUshort = 0u

public val PTHREAD_STACK_MIN: SizeT = 4096uL

public val SIGSTKSZ: SizeT = 8192uL

// https://illumos.org/man/3c/clockGettime
// https://github.com/illumos/illumos-gate/
// blob/HEAD/usr/src/lib/libc/amd64/sys/__clock_gettime.s
// clockGettime(3c) doesn't seem to accept anything other than CLOCK_REALTIME
// or __CLOCK_REALTIME0
//
// https://github.com/illumos/illumos-gate/
// blob/HEAD/usr/src/uts/common/sys/timeImpl.h
// Confusing! CLOCK_HIGHRES==CLOCK_MONOTONIC==4
// __CLOCK_REALTIME0==0 is an obsoleted version of CLOCK_REALTIME==3
public val CLOCK_REALTIME: ClockidT = 3

public val CLOCK_MONOTONIC: ClockidT = 4

public val TIMER_RELTIME: CInt = 0

public val TIMER_ABSTIME: CInt = 1

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_NOFILE: CInt = 5

public val RLIMIT_VMEM: CInt = 6

public val RLIMIT_AS: CInt = RLIMIT_VMEM

public val RLIM_NLIMITS: RlimT = 7uL

public val RLIM_INFINITY: RlimT = 0xfffffffffffffffduL

public val RUSAGE_SELF: CInt = 0

public val RUSAGE_CHILDREN: CInt = -1

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val MADV_FREE: CInt = 5

public val MADV_ACCESS_DEFAULT: CInt = 6

public val MADV_ACCESS_LWP: CInt = 7

public val MADV_ACCESS_MANY: CInt = 8

public val AF_UNSPEC: CInt = 0

public val AF_UNIX: CInt = 1

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NS: CInt = 6

public val AF_NBS: CInt = 7

public val AF_ECMA: CInt = 8

public val AF_DATAKIT: CInt = 9

public val AF_CCITT: CInt = 10

public val AF_SNA: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_LAT: CInt = 14

public val AF_HYLINK: CInt = 15

public val AF_APPLETALK: CInt = 16

public val AF_NIT: CInt = 17

public val AF_802: CInt = 18

public val AF_OSI: CInt = 19

public val AF_X25: CInt = 20

public val AF_OSINET: CInt = 21

public val AF_GOSIP: CInt = 22

public val AF_IPX: CInt = 23

public val AF_ROUTE: CInt = 24

public val AF_LINK: CInt = 25

public val AF_INET6: CInt = 26

public val AF_KEY: CInt = 27

public val AF_POLICY: CInt = 29

public val AF_INET_OFFLOAD: CInt = 30

public val AF_TRILL: CInt = 31

public val AF_PACKET: CInt = 32

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_UNIX: CInt = AF_UNIX

public val PF_LOCAL: CInt = PF_UNIX

public val PF_FILE: CInt = PF_UNIX

public val PF_INET: CInt = AF_INET

public val PF_IMPLINK: CInt = AF_IMPLINK

public val PF_PUP: CInt = AF_PUP

public val PF_CHAOS: CInt = AF_CHAOS

public val PF_NS: CInt = AF_NS

public val PF_NBS: CInt = AF_NBS

public val PF_ECMA: CInt = AF_ECMA

public val PF_DATAKIT: CInt = AF_DATAKIT

public val PF_CCITT: CInt = AF_CCITT

public val PF_SNA: CInt = AF_SNA

public val PF_DE_CNET: CInt = AF_DE_CNET

public val PF_DLI: CInt = AF_DLI

public val PF_LAT: CInt = AF_LAT

public val PF_HYLINK: CInt = AF_HYLINK

public val PF_APPLETALK: CInt = AF_APPLETALK

public val PF_NIT: CInt = AF_NIT

public val PF_802: CInt = AF_802

public val PF_OSI: CInt = AF_OSI

public val PF_X25: CInt = AF_X25

public val PF_OSINET: CInt = AF_OSINET

public val PF_GOSIP: CInt = AF_GOSIP

public val PF_IPX: CInt = AF_IPX

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_LINK: CInt = AF_LINK

public val PF_INET6: CInt = AF_INET6

public val PF_KEY: CInt = AF_KEY

public val PF_POLICY: CInt = AF_POLICY

public val PF_INET_OFFLOAD: CInt = AF_INET_OFFLOAD

public val PF_TRILL: CInt = AF_TRILL

public val PF_PACKET: CInt = AF_PACKET

public val SOCK_DGRAM: CInt = 1

public val SOCK_STREAM: CInt = 2

public val SOCK_RAW: CInt = 4

public val SOCK_RDM: CInt = 5

public val SOCK_SEQPACKET: CInt = 6

public val IP_MULTICAST_IF: CInt = 16

public val IP_MULTICAST_TTL: CInt = 17

public val IP_MULTICAST_LOOP: CInt = 18

public val IP_HDRINCL: CInt = 2

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_ADD_MEMBERSHIP: CInt = 19

public val IP_DROP_MEMBERSHIP: CInt = 20

public val IPV6_JOIN_GROUP: CInt = 9

public val IPV6_LEAVE_GROUP: CInt = 10

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 23

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 24

public val IP_BLOCK_SOURCE: CInt = 21

public val IP_UNBLOCK_SOURCE: CInt = 22

public val IP_BOUND_IF: CInt = 0x41

// These TCP socket options are common between illumos and Solaris, while higher
// numbers have generally diverged:
public val TCP_NODELAY: CInt = 0x1

public val TCP_MAXSEG: CInt = 0x2

public val TCP_KEEPALIVE: CInt = 0x8

public val TCP_NOTIFY_THRESHOLD: CInt = 0x10

public val TCP_ABORT_THRESHOLD: CInt = 0x11

public val TCP_CONN_NOTIFY_THRESHOLD: CInt = 0x12

public val TCP_CONN_ABORT_THRESHOLD: CInt = 0x13

public val TCP_RECVDSTADDR: CInt = 0x14

public val TCP_INIT_CWND: CInt = 0x15

public val TCP_KEEPALIVE_THRESHOLD: CInt = 0x16

public val TCP_KEEPALIVE_ABORT_THRESHOLD: CInt = 0x17

public val TCP_CORK: CInt = 0x18

public val TCP_RTO_INITIAL: CInt = 0x19

public val TCP_RTO_MIN: CInt = 0x1a

public val TCP_RTO_MAX: CInt = 0x1b

public val TCP_LINGER2: CInt = 0x1c

public val UDP_NAT_T_ENDPOINT: CInt = 0x0103

public val SOMAXCONN: CInt = 128

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

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SO_PROTOTYPE: CInt = 0x1009

public val SO_DOMAIN: CInt = 0x100c

public val SO_TIMESTAMP: CInt = 0x1013

public val SO_EXCLBIND: CInt = 0x1015

public val SCM_RIGHTS: CInt = 0x1010

public val SCM_UCRED: CInt = 0x1012

public val SCM_TIMESTAMP: CInt = SO_TIMESTAMP

public val MSG_OOB: CInt = 0x1

public val MSG_PEEK: CInt = 0x2

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_EOR: CInt = 0x8

public val MSG_CTRUNC: CInt = 0x10

public val MSG_TRUNC: CInt = 0x20

public val MSG_WAITALL: CInt = 0x40

public val MSG_DONTWAIT: CInt = 0x80

public val MSG_NOTIFICATION: CInt = 0x100

public val MSG_NOSIGNAL: CInt = 0x200

public val MSG_DUPCTRL: CInt = 0x800

public val MSG_XPG4_2: CInt = 0x8000

public val MSG_MAXIOVLEN: CInt = 16

public val IF_NAMESIZE: SizeT = 32uL

public val IFNAMSIZ: SizeT = 16uL

// https://docs.oracle.com/cd/E23824_01/html/821-1475/if-7p.html
public val IFF_UP: CInt = 0x0000000001

// Address is up
public val IFF_BROADCAST: CInt = 0x0000000002

// Broadcast address valid
public val IFF_DEBUG: CInt = 0x0000000004

// Turn on debugging
public val IFF_LOOPBACK: CInt = 0x0000000008

// Loopback net
public val IFF_POINTOPOINT: CInt = 0x0000000010

// Interface is p-to-p
public val IFF_NOTRAILERS: CInt = 0x0000000020

// Avoid use of trailers
public val IFF_RUNNING: CInt = 0x0000000040

// Resources allocated
public val IFF_NOARP: CInt = 0x0000000080

// No address res. protocol
public val IFF_PROMISC: CInt = 0x0000000100

// Receive all packets
public val IFF_ALLMULTI: CInt = 0x0000000200

// Receive all multicast pkts
public val IFF_INTELLIGENT: CInt = 0x0000000400

// Protocol code on board
public val IFF_MULTICAST: CInt = 0x0000000800

// Supports multicast
// Multicast using broadcst. add.
public val IFF_MULTI_BCAST: CInt = 0x0000001000

public val IFF_UNNUMBERED: CInt = 0x0000002000

// Non-unique address
public val IFF_DHCPRUNNING: CInt = 0x0000004000

// DHCP controls interface
public val IFF_PRIVATE: CInt = 0x0000008000

// Do not advertise
public val IFF_NOXMIT: CInt = 0x0000010000

// Do not transmit pkts
// No address - just on-link subnet
public val IFF_NOLOCAL: CInt = 0x0000020000

public val IFF_DEPRECATED: CInt = 0x0000040000

// Address is deprecated
public val IFF_ADDRCONF: CInt = 0x0000080000

// Addr. from stateless addrconf
public val IFF_ROUTER: CInt = 0x0000100000

// Router on interface
public val IFF_NONUD: CInt = 0x0000200000

// No NUD on interface
public val IFF_ANYCAST: CInt = 0x0000400000

// Anycast address
public val IFF_NORTEXCH: CInt = 0x0000800000

// Don't xchange rout. info
public val IFF_IPV4: CInt = 0x0001000000

// IPv4 interface
public val IFF_IPV6: CInt = 0x0002000000

// IPv6 interface
public val IFF_NOFAILOVER: CInt = 0x0008000000

// in.mpathd test address
public val IFF_FAILED: CInt = 0x0010000000

// Interface has failed
public val IFF_STANDBY: CInt = 0x0020000000

// Interface is a hot-spare
public val IFF_INACTIVE: CInt = 0x0040000000

// Functioning but not used
public val IFF_OFFLINE: CInt = 0x0080000000

// Interface is offline
// If CoS marking is supported
public val IFF_COS_ENABLED: CLonglong = 0x0200000000L

public val IFF_PREFERRED: CLonglong = 0x0400000000L

// Prefer as source addr.
public val IFF_TEMPORARY: CLonglong = 0x0800000000L

// RFC3041
public val IFF_FIXEDMTU: CLonglong = 0x1000000000L

// MTU set with SIOCSLIFMTU
public val IFF_VIRTUAL: CLonglong = 0x2000000000L

// Cannot send/receive pkts
public val IFF_DUPLICATE: CLonglong = 0x4000000000L

// Local address in use
public val IFF_IPMP: CLonglong = 0x8000000000L

// IPMP IP interface
// sys/ipc.h:
public val IPC_ALLOC: CInt = 0x8000

public val IPC_CREAT: CInt = 0x200

public val IPC_EXCL: CInt = 0x400

public val IPC_NOWAIT: CInt = 0x800

public val IPC_PRIVATE: KeyT = 0

public val IPC_RMID: CInt = 10

public val IPC_SET: CInt = 11

public val IPC_SEAT: CInt = 12

// sys/shm.h
public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_SHARE_MMU: CInt = 16384

public val SHM_PAGEABLE: CInt = 32768

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val F_RDLCK: CShort = 1

public val F_WRLCK: CShort = 2

public val F_UNLCK: CShort = 3

public val O_SYNC: CInt = 16

public val O_NONBLOCK: CInt = 128

public val IPPROTO_RAW: CInt = 255

public val PC_LINK_MAX: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_PATH_MAX: CInt = 5

public val PC_PIPE_BUF: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_CHOWN_RESTRICTED: CInt = 9

public val PC_ASYNC_IO: CInt = 10

public val PC_PRIO_IO: CInt = 11

public val PC_SYNC_IO: CInt = 12

public val PC_ALLOC_SIZE_MIN: CInt = 13

public val PC_REC_INCR_XFER_SIZE: CInt = 14

public val PC_REC_MAX_XFER_SIZE: CInt = 15

public val PC_REC_MIN_XFER_SIZE: CInt = 16

public val PC_REC_XFER_ALIGN: CInt = 17

public val PC_SYMLINK_MAX: CInt = 18

public val PC_2_SYMLINKS: CInt = 19

public val PC_ACL_ENABLED: CInt = 20

public val PC_MIN_HOLE_SIZE: CInt = 21

public val PC_CASE_BEHAVIOR: CInt = 22

public val PC_SATTR_ENABLED: CInt = 23

public val PC_SATTR_EXISTS: CInt = 24

public val PC_ACCESS_FILTERING: CInt = 25

public val PC_TIMESTAMP_RESOLUTION: CInt = 26

public val PC_FILESIZEBITS: CInt = 67

public val PC_XATTR_ENABLED: CInt = 100

public val PC_XATTR_EXISTS: CInt = 101

public val POSIX_VDISABLE: CcT = 0u

public val SC_ARG_MAX: CInt = 1

public val SC_CHILD_MAX: CInt = 2

public val SC_CLK_TCK: CInt = 3

public val SC_NGROUPS_MAX: CInt = 4

public val SC_OPEN_MAX: CInt = 5

public val SC_JOB_CONTROL: CInt = 6

public val SC_SAVED_IDS: CInt = 7

public val SC_VERSION: CInt = 8

public val SC_PASS_MAX: CInt = 9

public val SC_LOGNAME_MAX: CInt = 10

public val SC_PAGESIZE: CInt = 11

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_XOPEN_VERSION: CInt = 12

public val SC_NPROCESSORS_CONF: CInt = 14

public val SC_NPROCESSORS_ONLN: CInt = 15

public val SC_STREAM_MAX: CInt = 16

public val SC_TZNAME_MAX: CInt = 17

public val SC_AIO_LISTIO_MAX: CInt = 18

public val SC_AIO_MAX: CInt = 19

public val SC_AIO_PRIO_DELTA_MAX: CInt = 20

public val SC_ASYNCHRONOUS_IO: CInt = 21

public val SC_DELAYTIMER_MAX: CInt = 22

public val SC_FSYNC: CInt = 23

public val SC_MAPPED_FILES: CInt = 24

public val SC_MEMLOCK: CInt = 25

public val SC_MEMLOCK_RANGE: CInt = 26

public val SC_MEMORY_PROTECTION: CInt = 27

public val SC_MESSAGE_PASSING: CInt = 28

public val SC_MQ_OPEN_MAX: CInt = 29

public val SC_MQ_PRIO_MAX: CInt = 30

public val SC_PRIORITIZED_IO: CInt = 31

public val SC_PRIORITY_SCHEDULING: CInt = 32

public val SC_REALTIME_SIGNALS: CInt = 33

public val SC_RTSIG_MAX: CInt = 34

public val SC_SEMAPHORES: CInt = 35

public val SC_SEM_NSEMS_MAX: CInt = 36

public val SC_SEM_VALUE_MAX: CInt = 37

public val SC_SHARED_MEMORY_OBJECTS: CInt = 38

public val SC_SIGQUEUE_MAX: CInt = 39

public val SC_SIGRT_MIN: CInt = 40

public val SC_SIGRT_MAX: CInt = 41

public val SC_SYNCHRONIZED_IO: CInt = 42

public val SC_TIMERS: CInt = 43

public val SC_TIMER_MAX: CInt = 44

public val SC_2_C_BIND: CInt = 45

public val SC_2_C_DEV: CInt = 46

public val SC_2_C_VERSION: CInt = 47

public val SC_2_FORT_DEV: CInt = 48

public val SC_2_FORT_RUN: CInt = 49

public val SC_2_LOCALEDEF: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_UPE: CInt = 52

public val SC_2_VERSION: CInt = 53

public val SC_BC_BASE_MAX: CInt = 54

public val SC_BC_DIM_MAX: CInt = 55

public val SC_BC_SCALE_MAX: CInt = 56

public val SC_BC_STRING_MAX: CInt = 57

public val SC_COLL_WEIGHTS_MAX: CInt = 58

public val SC_EXPR_NEST_MAX: CInt = 59

public val SC_LINE_MAX: CInt = 60

public val SC_RE_DUP_MAX: CInt = 61

public val SC_XOPEN_CRYPT: CInt = 62

public val SC_XOPEN_ENH_I18N: CInt = 63

public val SC_XOPEN_SHM: CInt = 64

public val SC_2_CHAR_TERM: CInt = 66

public val SC_XOPEN_XCU_VERSION: CInt = 67

public val SC_ATEXIT_MAX: CInt = 76

public val SC_IOV_MAX: CInt = 77

public val SC_XOPEN_UNIX: CInt = 78

public val SC_T_IOV_MAX: CInt = 79

public val SC_PHYS_PAGES: CInt = 500

public val SC_AVPHYS_PAGES: CInt = 501

public val SC_COHER_BLKSZ: CInt = 503

public val SC_SPLIT_CACHE: CInt = 504

public val SC_ICACHE_SZ: CInt = 505

public val SC_DCACHE_SZ: CInt = 506

public val SC_ICACHE_LINESZ: CInt = 507

public val SC_DCACHE_LINESZ: CInt = 508

public val SC_ICACHE_BLKSZ: CInt = 509

public val SC_DCACHE_BLKSZ: CInt = 510

public val SC_DCACHE_TBLKSZ: CInt = 511

public val SC_ICACHE_ASSOC: CInt = 512

public val SC_DCACHE_ASSOC: CInt = 513

public val SC_MAXPID: CInt = 514

public val SC_STACK_PROT: CInt = 515

public val SC_NPROCESSORS_MAX: CInt = 516

public val SC_CPUID_MAX: CInt = 517

public val SC_EPHID_MAX: CInt = 518

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 568

public val SC_GETGR_R_SIZE_MAX: CInt = 569

public val SC_GETPW_R_SIZE_MAX: CInt = 570

public val SC_LOGIN_NAME_MAX: CInt = 571

public val SC_THREAD_KEYS_MAX: CInt = 572

public val SC_THREAD_STACK_MIN: CInt = 573

public val SC_THREAD_THREADS_MAX: CInt = 574

public val SC_TTY_NAME_MAX: CInt = 575

public val SC_THREADS: CInt = 576

public val SC_THREAD_ATTR_STACKADDR: CInt = 577

public val SC_THREAD_ATTR_STACKSIZE: CInt = 578

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 579

public val SC_THREAD_PRIO_INHERIT: CInt = 580

public val SC_THREAD_PRIO_PROTECT: CInt = 581

public val SC_THREAD_PROCESS_SHARED: CInt = 582

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 583

public val SC_XOPEN_LEGACY: CInt = 717

public val SC_XOPEN_REALTIME: CInt = 718

public val SC_XOPEN_REALTIME_THREADS: CInt = 719

public val SC_XBS5_ILP32_OFF32: CInt = 720

public val SC_XBS5_ILP32_OFFBIG: CInt = 721

public val SC_XBS5_LP64_OFF64: CInt = 722

public val SC_XBS5_LPBIG_OFFBIG: CInt = 723

public val SC_2_PBS: CInt = 724

public val SC_2_PBS_ACCOUNTING: CInt = 725

public val SC_2_PBS_CHECKPOINT: CInt = 726

public val SC_2_PBS_LOCATE: CInt = 728

public val SC_2_PBS_MESSAGE: CInt = 729

public val SC_2_PBS_TRACK: CInt = 730

public val SC_ADVISORY_INFO: CInt = 731

public val SC_BARRIERS: CInt = 732

public val SC_CLOCK_SELECTION: CInt = 733

public val SC_CPUTIME: CInt = 734

public val SC_HOST_NAME_MAX: CInt = 735

public val SC_MONOTONIC_CLOCK: CInt = 736

public val SC_READER_WRITER_LOCKS: CInt = 737

public val SC_REGEXP: CInt = 738

public val SC_SHELL: CInt = 739

public val SC_SPAWN: CInt = 740

public val SC_SPIN_LOCKS: CInt = 741

public val SC_SPORADIC_SERVER: CInt = 742

public val SC_SS_REPL_MAX: CInt = 743

public val SC_SYMLOOP_MAX: CInt = 744

public val SC_THREAD_CPUTIME: CInt = 745

public val SC_THREAD_SPORADIC_SERVER: CInt = 746

public val SC_TIMEOUTS: CInt = 747

public val SC_TRACE: CInt = 748

public val SC_TRACE_EVENT_FILTER: CInt = 749

public val SC_TRACE_EVENT_NAME_MAX: CInt = 750

public val SC_TRACE_INHERIT: CInt = 751

public val SC_TRACE_LOG: CInt = 752

public val SC_TRACE_NAME_MAX: CInt = 753

public val SC_TRACE_SYS_MAX: CInt = 754

public val SC_TRACE_USER_EVENT_MAX: CInt = 755

public val SC_TYPED_MEMORY_OBJECTS: CInt = 756

public val SC_V6_ILP32_OFF32: CInt = 757

public val SC_V6_ILP32_OFFBIG: CInt = 758

public val SC_V6_LP64_OFF64: CInt = 759

public val SC_V6_LPBIG_OFFBIG: CInt = 760

public val SC_XOPEN_STREAMS: CInt = 761

public val SC_IPV6: CInt = 762

public val SC_RAW_SOCKETS: CInt = 763

public val ST_FSTYPSZ: CInt = 16

public val MUTEX_MAGIC: UShort = 0x4d58u

// MX
public val COND_MAGIC: UShort = 0x4356u

// CV
public val RWL_MAGIC: UShort = 0x5257u

// RW
public val NCCS: Int = 19

public val LOG_CRON: CInt = 15 shl 3

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(pthreadMutexFlag1 = 0, pthreadMutexFlag2 = 0, pthreadMutexCeiling = 0, pthreadMutexType = PTHREAD_PROCESS_PRIVATE, pthreadMutexMagic = MUTEX_MAGIC, pthreadMutexLock = 0, pthreadMutexData = 0)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(pthreadCondFlag = List(4) { 0 }, pthreadCondType = PTHREAD_PROCESS_PRIVATE, pthreadCondMagic = COND_MAGIC, pthreadCondData = 0)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(pthreadRwlockReaders = 0, pthreadRwlockType = PTHREAD_PROCESS_PRIVATE, pthreadRwlockMagic = RWL_MAGIC, pthreadRwlockMutex = PTHREAD_MUTEX_INITIALIZER, pthreadRwlockReadercv = PTHREAD_COND_INITIALIZER, pthreadRwlockWritercv = PTHREAD_COND_INITIALIZER)

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_RECURSIVE: CInt = 4

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1).toLong())

public val RTLD_DEFAULT: COpaquePointer? = COpaquePointer((-2).toLong())

public val RTLD_SELF: COpaquePointer? = COpaquePointer((-3).toLong())

public val RTLD_PROBE: COpaquePointer? = COpaquePointer((-4).toLong())

public val RTLD_LAZY: CInt = 0x1

public val RTLD_NOW: CInt = 0x2

public val RTLD_NOLOAD: CInt = 0x4

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_LOCAL: CInt = 0x0

public val RTLD_PARENT: CInt = 0x200

public val RTLD_GROUP: CInt = 0x400

public val RTLD_WORLD: CInt = 0x800

public val RTLD_NODELETE: CInt = 0x1000

public val RTLD_FIRST: CInt = 0x2000

public val RTLD_CONFGEN: CInt = 0x10000

public val PORT_SOURCE_AIO: CInt = 1

public val PORT_SOURCE_TIMER: CInt = 2

public val PORT_SOURCE_USER: CInt = 3

public val PORT_SOURCE_FD: CInt = 4

public val PORT_SOURCE_ALERT: CInt = 5

public val PORT_SOURCE_MQ: CInt = 6

public val PORT_SOURCE_FILE: CInt = 7

public val NONROOT_USR: CShort = 2

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

public val DOWN_TIME: CShort = 10

public val TIOC: CInt = ('T'.toInt()) shl 8

public val T_IOC: CInt = ('t'.toInt()) shl 8

public val TCGETA: CInt = TIOC or 1

public val TCSETA: CInt = TIOC or 2

public val TCSETAW: CInt = TIOC or 3

public val TCSETAF: CInt = TIOC or 4

public val TCSBRK: CInt = TIOC or 5

public val TCXONC: CInt = TIOC or 6

public val TCFLSH: CInt = TIOC or 7

public val TCDSET: CInt = TIOC or 32

public val TCGETS: CInt = TIOC or 13

public val TCSETS: CInt = TIOC or 14

public val TCSANOW: CInt = TIOC or 14

public val TCSETSW: CInt = TIOC or 15

public val TCSADRAIN: CInt = TIOC or 15

public val TCSETSF: CInt = TIOC or 16

public val TCSAFLUSH: CInt = TIOC or 16

public val TCIFLUSH: CInt = 0

public val TCOFLUSH: CInt = 1

public val TCIOFLUSH: CInt = 2

public val TCOOFF: CInt = 0

public val TCOON: CInt = 1

public val TCIOFF: CInt = 2

public val TCION: CInt = 3

public val TIOC1: CInt = TIOC

public val TIOCKBON: CInt = TIOC or 8

public val TIOCKBOF: CInt = TIOC or 9

public val TIOCGWINSZ: CInt = TIOC or 104

public val TIOCSWINSZ: CInt = TIOC or 103

public val TIOCGSOFTCAR: CInt = TIOC or 105

public val TIOCSSOFTCAR: CInt = TIOC or 106

public val TIOCGPPS: CInt = TIOC or 125

public val TIOCSPPS: CInt = TIOC or 126

public val TIOCGPPSEV: CInt = TIOC or 127

public val TIOCGETD: CInt = T_IOC or 0

public val TIOCSETD: CInt = T_IOC or 1

public val TIOCHPCL: CInt = T_IOC or 2

public val TIOCGETP: CInt = T_IOC or 8

public val TIOCSETP: CInt = T_IOC or 9

public val TIOCSETN: CInt = T_IOC or 10

public val TIOCEXCL: CInt = T_IOC or 13

public val TIOCNXCL: CInt = T_IOC or 14

public val TIOCFLUSH: CInt = T_IOC or 16

public val TIOCSETC: CInt = T_IOC or 17

public val TIOCGETC: CInt = T_IOC or 18

public val TIOCLBIS: CInt = T_IOC or 127

public val TIOCLBIC: CInt = T_IOC or 126

public val TIOCLSET: CInt = T_IOC or 125

public val TIOCLGET: CInt = T_IOC or 124

public val TIOCSBRK: CInt = T_IOC or 123

public val TIOCCBRK: CInt = T_IOC or 122

public val TIOCSDTR: CInt = T_IOC or 121

public val TIOCCDTR: CInt = T_IOC or 120

public val TIOCSLTC: CInt = T_IOC or 117

public val TIOCGLTC: CInt = T_IOC or 116

public val TIOCOUTQ: CInt = T_IOC or 115

public val TIOCNOTTY: CInt = T_IOC or 113

public val TIOCSCTTY: CInt = T_IOC or 132

public val TIOCSTOP: CInt = T_IOC or 111

public val TIOCSTART: CInt = T_IOC or 110

public val TIOCSILOOP: CInt = T_IOC or 109

public val TIOCCILOOP: CInt = T_IOC or 108

public val TIOCGPGRP: CInt = T_IOC or 20

public val TIOCSPGRP: CInt = T_IOC or 21

public val TIOCGSID: CInt = T_IOC or 22

public val TIOCSTI: CInt = T_IOC or 23

public val TIOCMSET: CInt = T_IOC or 26

public val TIOCMBIS: CInt = T_IOC or 27

public val TIOCMBIC: CInt = T_IOC or 28

public val TIOCMGET: CInt = T_IOC or 29

public val TIOCREMOTE: CInt = T_IOC or 30

public val TIOCSIGNAL: CInt = T_IOC or 31

public val TIOCM_LE: CInt = 1

public val TIOCM_DTR: CInt = 2

public val TIOCM_RTS: CInt = 4

public val TIOCM_ST: CInt = 8

public val TIOCM_SR: CInt = 16

public val TIOCM_CTS: CInt = 32

public val TIOCM_CAR: CInt = 64

public val TIOCM_CD: CInt = TIOCM_CAR

public val TIOCM_RNG: CInt = 128

public val TIOCM_RI: CInt = TIOCM_RNG

public val TIOCM_DSR: CInt = 256

// termios
public val B0: SpeedT = 0u

public val B50: SpeedT = 1u

public val B75: SpeedT = 2u

public val B110: SpeedT = 3u

public val B134: SpeedT = 4u

public val B150: SpeedT = 5u

public val B200: SpeedT = 6u

public val B300: SpeedT = 7u

public val B600: SpeedT = 8u

public val B1200: SpeedT = 9u

public val B1800: SpeedT = 10u

public val B2400: SpeedT = 11u

public val B4800: SpeedT = 12u

public val B9600: SpeedT = 13u

public val B19200: SpeedT = 14u

public val B38400: SpeedT = 15u

public val B57600: SpeedT = 16u

public val B76800: SpeedT = 17u

public val B115200: SpeedT = 18u

public val B153600: SpeedT = 19u

public val B230400: SpeedT = 20u

public val B307200: SpeedT = 21u

public val B460800: SpeedT = 22u

public val B921600: SpeedT = 23u

public val CSTART: TcflagT = 17u

public val CSTOP: TcflagT = 19u

public val CSWTCH: TcflagT = 26u

public val CBAUD: TcflagT = 15u

public val CIBAUD: TcflagT = 983040u

public val CBAUDEXT: TcflagT = 2097152u

public val CIBAUDEXT: TcflagT = 4194304u

public val CSIZE: TcflagT = 48u

public val CS5: TcflagT = 0u

public val CS6: TcflagT = 16u

public val CS7: TcflagT = 32u

public val CS8: TcflagT = 48u

public val CSTOPB: TcflagT = 64u

public val ECHO: TcflagT = 8u

public val ECHOE: TcflagT = 16u

public val ECHOK: TcflagT = 32u

public val ECHONL: TcflagT = 64u

public val ECHOCTL: TcflagT = 512u

public val ECHOPRT: TcflagT = 1024u

public val ECHOKE: TcflagT = 2048u

public val EXTPROC: TcflagT = 65536u

public val IGNBRK: TcflagT = 1u

public val BRKINT: TcflagT = 2u

public val IGNPAR: TcflagT = 4u

public val PARMRK: TcflagT = 8u

public val INPCK: TcflagT = 16u

public val ISTRIP: TcflagT = 32u

public val INLCR: TcflagT = 64u

public val IGNCR: TcflagT = 128u

public val ICRNL: TcflagT = 256u

public val IUCLC: TcflagT = 512u

public val IXON: TcflagT = 1024u

public val IXOFF: TcflagT = 4096u

public val IXANY: TcflagT = 2048u

public val IMAXBEL: TcflagT = 8192u

public val DOSMODE: TcflagT = 32768u

public val OPOST: TcflagT = 1u

public val OLCUC: TcflagT = 2u

public val ONLCR: TcflagT = 4u

public val OCRNL: TcflagT = 8u

public val ONOCR: TcflagT = 16u

public val ONLRET: TcflagT = 32u

public val OFILL: TcflagT = 64u

public val OFDEL: TcflagT = 128u

public val CREAD: TcflagT = 128u

public val PARENB: TcflagT = 256u

public val PARODD: TcflagT = 512u

public val HUPCL: TcflagT = 1024u

public val CLOCAL: TcflagT = 2048u

public val CRTSXOFF: TcflagT = 1073741824u

public val CRTSCTS: TcflagT = 2147483648u

public val ISIG: TcflagT = 1u

public val ICANON: TcflagT = 2u

public val IEXTEN: TcflagT = 32768u

public val TOSTOP: TcflagT = 256u

public val FLUSHO: TcflagT = 8192u

public val PENDIN: TcflagT = 16384u

public val NOFLSH: TcflagT = 128u

public val VINTR: Int = 0

public val VQUIT: Int = 1

public val VERASE: Int = 2

public val VKILL: Int = 3

public val VEOF: Int = 4

public val VEOL: Int = 5

public val VEOL2: Int = 6

public val VMIN: Int = 4

public val VTIME: Int = 5

public val VSWTCH: Int = 7

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VSUSP: Int = 10

public val VDSUSP: Int = 11

public val VREPRINT: Int = 12

public val VDISCARD: Int = 13

public val VWERASE: Int = 14

public val VLNEXT: Int = 15

// <sys/stropts.h>
public val STR: CInt = (83u.toInt()) shl 8

public val I_NREAD: CInt = STR or 1

public val I_PUSH: CInt = STR or 2

public val I_POP: CInt = STR or 3

public val I_LOOK: CInt = STR or 4

public val I_FLUSH: CInt = STR or 5

public val I_SRDOPT: CInt = STR or 6

public val I_GRDOPT: CInt = STR or 7

public val I_STR: CInt = STR or 8

public val I_SETSIG: CInt = STR or 9

public val I_GETSIG: CInt = STR or 10

public val I_FIND: CInt = STR or 11

public val I_LINK: CInt = STR or 12

public val I_UNLINK: CInt = STR or 13

public val I_PEEK: CInt = STR or 15

public val I_FDINSERT: CInt = STR or 16

public val I_SENDFD: CInt = STR or 17

public val I_RECVFD: CInt = STR or 14

public val I_SWROPT: CInt = STR or 19

public val I_GWROPT: CInt = STR or 20

public val I_LIST: CInt = STR or 21

public val I_PLINK: CInt = STR or 22

public val I_PUNLINK: CInt = STR or 23

public val I_ANCHOR: CInt = STR or 24

public val I_FLUSHBAND: CInt = STR or 28

public val I_CKBAND: CInt = STR or 29

public val I_GETBAND: CInt = STR or 30

public val I_ATMARK: CInt = STR or 31

public val I_SETCLTIME: CInt = STR or 32

public val I_GETCLTIME: CInt = STR or 33

public val I_CANPUT: CInt = STR or 34

public val I_SERROPT: CInt = STR or 35

public val I_GERROPT: CInt = STR or 36

public val I_ESETSIG: CInt = STR or 37

public val I_EGETSIG: CInt = STR or 38

public val I_PUSH_NOCTTY: CInt = STR or 39

// 3SOCKET flags
public val SOCK_CLOEXEC: CInt = 0x080000

public val SOCK_NONBLOCK: CInt = 0x100000

public val SOCK_NDELAY: CInt = 0x200000

// <sys/timex.h>
public val SCALE_KG: CInt = 1 shl 6

public val SCALE_KF: CInt = 1 shl 16

public val SCALE_KH: CInt = 1 shl 2

public val MAXTC: CInt = 1 shl 6

public val SCALE_PHASE: CInt = 1 shl 22

public val SCALE_USEC: CInt = 1 shl 16

public val SCALE_UPDATE: CInt = SCALE_KG * MAXTC

public val FINEUSEC: CInt = 1 shl 22

public val MAXPHASE: CInt = 512000

public val MAXFREQ: CInt = 512 * SCALE_USEC

public val MAXTIME: CInt = 200 shl PPS_AVG

public val MINSEC: CInt = 16

public val MAXSEC: CInt = 1200

public val PPS_AVG: CInt = 2

public val PPS_SHIFT: CInt = 2

public val PPS_SHIFTMAX: CInt = 8

public val PPS_VALID: CInt = 120

public val MAXGLITCH: CInt = 30

public val MOD_OFFSET: UInt = 0x0001u

public val MOD_FREQUENCY: UInt = 0x0002u

public val MOD_MAXERROR: UInt = 0x0004u

public val MOD_ESTERROR: UInt = 0x0008u

public val MOD_STATUS: UInt = 0x0010u

public val MOD_TIMECONST: UInt = 0x0020u

public val MOD_CLKB: UInt = 0x4000u

public val MOD_CLKA: UInt = 0x8000u

public val STA_PLL: UInt = 0x0001u

public val STA_PPSFREQ: Int = 0x0002

public val STA_PPSTIME: Int = 0x0004

public val STA_FLL: Int = 0x0008

public val STA_INS: Int = 0x0010

public val STA_DEL: Int = 0x0020

public val STA_UNSYNC: Int = 0x0040

public val STA_FREQHOLD: Int = 0x0080

public val STA_PPSSIGNAL: Int = 0x0100

public val STA_PPSJITTER: Int = 0x0200

public val STA_PPSWANDER: Int = 0x0400

public val STA_PPSERROR: Int = 0x0800

public val STA_CLOCKERR: Int = 0x1000

public val STA_RONLY: Int = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR

public val TIME_OK: Int = 0

public val TIME_INS: Int = 1

public val TIME_DEL: Int = 2

public val TIME_OOP: Int = 3

public val TIME_WAIT: Int = 4

public val TIME_ERROR: Int = 5

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val SCHED_SYS: CInt = 3

public val SCHED_IA: CInt = 4

public val SCHED_FSS: CInt = 5

public val SCHED_FX: CInt = 6

// sys/priv.h
public val PRIV_DEBUG: CUint = 0x0001u

public val PRIV_AWARE: CUint = 0x0002u

public val PRIV_AWARE_INHERIT: CUint = 0x0004u

public val PROC_PROTECT: CUint = 0x0008u

public val NET_MAC_AWARE: CUint = 0x0010u

public val NET_MAC_AWARE_INHERIT: CUint = 0x0020u

public val PRIV_AWARE_RESET: CUint = 0x0040u

public val PRIV_XPOLICY: CUint = 0x0080u

public val PRIV_PFEXEC: CUint = 0x0100u

// sys/systeminfo.h
public val SI_SYSNAME: CInt = 1

public val SI_HOSTNAME: CInt = 2

public val SI_RELEASE: CInt = 3

public val SI_VERSION: CInt = 4

public val SI_MACHINE: CInt = 5

public val SI_ARCHITECTURE: CInt = 6

public val SI_HW_SERIAL: CInt = 7

public val SI_HW_PROVIDER: CInt = 8

public val SI_SET_HOSTNAME: CInt = 258

public val SI_SET_SRPC_DOMAIN: CInt = 265

public val SI_PLATFORM: CInt = 513

public val SI_ISALIST: CInt = 514

public val SI_DHCP_CACHE: CInt = 515

public val SI_ARCHITECTURE_32: CInt = 516

public val SI_ARCHITECTURE_64: CInt = 517

public val SI_ARCHITECTURE_K: CInt = 518

public val SI_ARCHITECTURE_NATIVE: CInt = 519

// sys/lgrpUser.h
public val LGRP_COOKIE_NONE: LgrpCookieT = 0uL

public val LGRP_AFF_NONE: LgrpAffinityT = 0x0

public val LGRP_AFF_WEAK: LgrpAffinityT = 0x10

public val LGRP_AFF_STRONG: LgrpAffinityT = 0x100

public val LGRP_CONTENT_ALL: LgrpContentT = 0u

public val LGRP_CONTENT_HIERARCHY: LgrpContentT = LGRP_CONTENT_ALL

public val LGRP_CONTENT_DIRECT: LgrpContentT = 1u

public val LGRP_LAT_CPU_TO_MEM: LgrpLatBetweenT = 0u

public val LGRP_MEM_SZ_FREE: LgrpMemSizeFlagT = 0u

public val LGRP_MEM_SZ_INSTALLED: LgrpMemSizeFlagT = 1u

public val LGRP_VIEW_CALLER: LgrpViewT = 0u

public val LGRP_VIEW_OS: LgrpViewT = 1u

// sys/processor.h
public val P_OFFLINE: CInt = 0x001

public val P_ONLINE: CInt = 0x002

public val P_STATUS: CInt = 0x003

public val P_FAULTED: CInt = 0x004

public val P_POWEROFF: CInt = 0x005

public val P_NOINTR: CInt = 0x006

public val P_SPARE: CInt = 0x007

public val P_FORCED: CInt = 0x10000000

public val PI_TYPELEN: CInt = 16

public val PI_FPUTYPE: CInt = 32

// sys/auxv.h
public val AT_SUN_HWCAP: CUint = 2009u

// As per sys/socket.h, header alignment must be 8 bytes on SPARC
// and 4 bytes everywhere else:
public val CMSG_HDR_ALIGNMENT: Int = 8

public val CMSG_HDR_ALIGNMENT1: Int = 4

public val CMSG_DATA_ALIGNMENT: Int = sizeOf<CInt>()

public val NEWDEV: CInt = 1

// sys/sendfile.h
public val SFV_FD_SELF: CInt = -2

public fun cmsgHdrAlign(p: Int): Int {
    return (p + CMSG_HDR_ALIGNMENT - 1) and (CMSG_HDR_ALIGNMENT - 1).inv()
}

public fun cmsgDataAlign(p: Int): Int {
    return (p + CMSG_DATA_ALIGNMENT - 1) and (CMSG_DATA_ALIGNMENT - 1).inv()
}

public fun getrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("strerror_r", -1, longArrayOf(errnum.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun semDestroy(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_destroy", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt {
    return LibcDynamicFfi.invoke("sem_init", -1, longArrayOf(sem?.value ?: 0L, pshared.toLong(), value.toLong())).toInt()
}

public fun abs(i: CInt): CInt {
    return LibcDynamicFfi.invoke("abs", -1, longArrayOf(i.toLong())).toInt()
}

public fun acct(filename: String?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("acct", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun dirfd(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("dirfd", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

public fun labs(i: CLong): CLong {
    return LibcDynamicFfi.invoke("labs", -1, longArrayOf(i))
}

public fun rand(): CInt {
    return LibcDynamicFfi.invoke("rand", -1, longArrayOf()).toInt()
}

public fun srand(seed: CUint) {
    LibcDynamicFfi.invoke("srand", -1, longArrayOf(seed.toLong()))
}

public fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("getentropy", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun getrandom(bbuf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("getrandom", -1, longArrayOf(bbuf?.value ?: 0L, buflen.toLong(), flags.toLong()))
}

public fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun settimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("settimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun getifaddrs(ifap: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getifaddrs", -1, longArrayOf(ifap?.value ?: 0L)).toInt()
}

public fun freeifaddrs(ifa: Ifaddrs?) {
    LibcDynamicFfi.invoke("freeifaddrs", -1, longArrayOf(ifa?.value ?: 0L))
}

public fun stackGetbounds(sp: StackT?): CInt {
    return LibcDynamicFfi.invoke("stack_getbounds", -1, longArrayOf(sp?.value ?: 0L)).toInt()
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

public fun initgroups(name: String?, basegid: GidT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("initgroups", -1, longArrayOf(__cstr_0, basegid.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun setgroups(ngroups: CInt, ptr: GidT?): CInt {
    val __slot_1 = if (ptr == null) 0L else LibcDynamicFfi.allocScalarSlot(ptr.toLong())
    try {
        return LibcDynamicFfi.invoke("setgroups", -1, longArrayOf(ngroups.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("ioctl", 2, longArrayOf(fildes.toLong(), request.toLong()) + variadicArgs).toInt()
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun errno(): CInt? {
    val rawRet = LibcDynamicFfi.invoke("___errno", -1, longArrayOf())
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
}

public fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_getres", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_nanosleep", -1, longArrayOf(clkId.toLong(), flags.toLong(), rqtp?.value ?: 0L, rmtp?.value ?: 0L)).toInt()
}

public fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_settime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(sa?.value ?: 0L, salen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, servlen.toLong(), flags.toLong())).toInt()
}

public fun setpwent() {
    LibcDynamicFfi.invoke("setpwent", -1, longArrayOf())
}

public fun endpwent() {
    LibcDynamicFfi.invoke("endpwent", -1, longArrayOf())
}

public fun getpwent(): Passwd? {
    val rawRet = LibcDynamicFfi.invoke("getpwent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fdatasync(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("fdatasync", -1, longArrayOf(fd.toLong())).toInt()
}

public fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo_l", -1, longArrayOf(item.toLong(), locale?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun duplocale(base: LocaleT): LocaleT {
    val rawRet = LibcDynamicFfi.invoke("duplocale", -1, longArrayOf(base?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun freelocale(loc: LocaleT) {
    LibcDynamicFfi.invoke("freelocale", -1, longArrayOf(loc?.value ?: 0L))
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

public fun uselocale(loc: LocaleT): LocaleT {
    val rawRet = LibcDynamicFfi.invoke("uselocale", -1, longArrayOf(loc?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getprogname(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getprogname", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setprogname(name: String?) {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        LibcDynamicFfi.invoke("setprogname", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt {
    val __slot_0 = if (loadavg == null) 0L else LibcDynamicFfi.allocScalarSlot(loadavg.toRawBits())
    try {
        return LibcDynamicFfi.invoke("getloadavg", -1, longArrayOf(__slot_0, nelem.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun getpriority(which: CInt, who: CInt): CInt {
    return LibcDynamicFfi.invoke("getpriority", -1, longArrayOf(which.toLong(), who.toLong())).toInt()
}

public fun setpriority(which: CInt, who: CInt, prio: CInt): CInt {
    return LibcDynamicFfi.invoke("setpriority", -1, longArrayOf(which.toLong(), who.toLong(), prio.toLong())).toInt()
}

public fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mknodat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong(), dev.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("mkfifoat", -1, longArrayOf(dirfd.toLong(), __cstr_1, mode.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
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

public fun ifNameindex(): IfNameindex? {
    val rawRet = LibcDynamicFfi.invoke("if_nameindex", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ifFreenameindex(ptr: IfNameindex?) {
    LibcDynamicFfi.invoke("if_freenameindex", -1, longArrayOf(ptr?.value ?: 0L))
}

public fun pthreadCreate(native: CUint?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt {
    val __slot_0 = if (native == null) 0L else LibcDynamicFfi.allocScalarSlot(native.toLong())
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(__slot_0, attr?.value ?: 0L, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt {
    val __slot_2 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstack", -1, longArrayOf(attr?.value ?: 0L, stackaddr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: CInt?): CInt {
    val __slot_1 = if (clockId == null) 0L else LibcDynamicFfi.allocScalarSlot(clockId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_getclock", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setclock", -1, longArrayOf(attr?.value ?: 0L, clockId.toLong())).toInt()
}

public fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("sem_timedwait", -1, longArrayOf(sem?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun semGetvalue(sem: SemT?, sval: CInt?): CInt {
    val __slot_1 = if (sval == null) 0L else LibcDynamicFfi.allocScalarSlot(sval.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_getvalue", -1, longArrayOf(sem?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_timedlock", -1, longArrayOf(lock?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun pthreadGetnameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_getname_np", -1, longArrayOf(tid.toLong(), name?.value ?: 0L, len.toLong())).toInt()
}

public fun pthreadSetnameNp(tid: PthreadT, name: String?): CInt {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("pthread_setname_np", -1, longArrayOf(tid.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt {
    return LibcDynamicFfi.invoke("waitid", -1, longArrayOf(idtype.toLong(), id.toLong(), infop?.value ?: 0L, options.toLong())).toInt()
}

public fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: GlobT?): CInt {
    val __cstr_0 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    try {
        return LibcDynamicFfi.invoke("glob", -1, longArrayOf(__cstr_0, flags.toLong(), errfunc?.value ?: 0L, pglob?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun globfree(pglob: GlobT?) {
    LibcDynamicFfi.invoke("globfree", -1, longArrayOf(pglob?.value ?: 0L))
}

public fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt {
    return LibcDynamicFfi.invoke("posix_fallocate", -1, longArrayOf(fd.toLong(), offset, len)).toInt()
}

public fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
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

public fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_init", -1, longArrayOf(fileActions?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_destroy", -1, longArrayOf(fileActions?.value ?: 0L)).toInt()
}

public fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_2 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addopen", -1, longArrayOf(fileActions?.value ?: 0L, fildes.toLong(), __cstr_2, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addclose", -1, longArrayOf(fileActions?.value ?: 0L, fildes.toLong())).toInt()
}

public fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_adddup2", -1, longArrayOf(fileActions?.value ?: 0L, fildes.toLong(), newfildes.toLong())).toInt()
}

public fun posixSpawnFileActionsAddclosefromNp(fileActions: COpaquePointer?, lowfiledes: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addclosefrom_np", -1, longArrayOf(fileActions?.value ?: 0L, lowfiledes.toLong())).toInt()
}

public fun posixSpawnFileActionsAddchdir(fileActions: COpaquePointer?, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addchdir", -1, longArrayOf(fileActions?.value ?: 0L, __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnFileActionsAddchdirNp(fileActions: COpaquePointer?, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addchdir_np", -1, longArrayOf(fileActions?.value ?: 0L, __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun posixSpawnFileActionsAddfchdir(fileActions: COpaquePointer?, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addfchdir", -1, longArrayOf(fileActions?.value ?: 0L, fd.toLong())).toInt()
}

public fun posixSpawnattrInit(attr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_init", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_destroy", -1, longArrayOf(attr?.value ?: 0L)).toInt()
}

public fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setflags", -1, longArrayOf(attr?.value ?: 0L, flags.toLong())).toInt()
}

public fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt {
    val __slot_1 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getflags", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setpgroup", -1, longArrayOf(attr?.value ?: 0L, pgroup.toLong())).toInt()
}

public fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: PidT?): CInt {
    val __slot_1 = if (pgroup == null) 0L else LibcDynamicFfi.allocScalarSlot(pgroup.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getpgroup", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_getschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setschedpolicy", -1, longArrayOf(attr?.value ?: 0L, policy.toLong())).toInt()
}

public fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, policy: CInt?): CInt {
    val __slot_1 = if (policy == null) 0L else LibcDynamicFfi.allocScalarSlot(policy.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_getschedpolicy", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setsigdefault", -1, longArrayOf(attr?.value ?: 0L, sigdefault?.value ?: 0L)).toInt()
}

public fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_getsigdefault", -1, longArrayOf(attr?.value ?: 0L, sigdefault?.value ?: 0L)).toInt()
}

public fun posixSpawnattrSetsigignoreNp(attr: COpaquePointer?, sigignore: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setsigignore_np", -1, longArrayOf(attr?.value ?: 0L, sigignore?.value ?: 0L)).toInt()
}

public fun posixSpawnattrGetsigignoreNp(attr: COpaquePointer?, sigignore: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_getsigignore_np", -1, longArrayOf(attr?.value ?: 0L, sigignore?.value ?: 0L)).toInt()
}

public fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_setsigmask", -1, longArrayOf(attr?.value ?: 0L, sigmask?.value ?: 0L)).toInt()
}

public fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("posix_spawnattr_getsigmask", -1, longArrayOf(attr?.value ?: 0L, sigmask?.value ?: 0L)).toInt()
}

public fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("shmat", -1, longArrayOf(shmid.toLong(), shmaddr?.value ?: 0L, shmflg.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt {
    return LibcDynamicFfi.invoke("shmctl", -1, longArrayOf(shmid.toLong(), cmd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun shmdt(shmaddr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("shmdt", -1, longArrayOf(shmaddr?.value ?: 0L)).toInt()
}

public fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt {
    return LibcDynamicFfi.invoke("shmget", -1, longArrayOf(key.toLong(), size.toLong(), shmflg.toLong())).toInt()
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

public fun seekdir(dirp: DIR?, loc: CLong) {
    LibcDynamicFfi.invoke("seekdir", -1, longArrayOf(dirp?.handle ?: 0L, loc))
}

public fun telldir(dirp: DIR?): CLong {
    return LibcDynamicFfi.invoke("telldir", -1, longArrayOf(dirp?.handle ?: 0L))
}

public fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("msync", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun memalign(align: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memalign", -1, longArrayOf(align.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: CUint?): SsizeT {
    val __slot_5 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), addr?.value ?: 0L, __slot_5))
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt {
    return LibcDynamicFfi.invoke("mkstemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong())).toInt()
}

public fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("futimesat", -1, longArrayOf(fd.toLong(), __cstr_1, times?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun futimens(dirfd: CInt, times: Timespec?): CInt {
    return LibcDynamicFfi.invoke("futimens", -1, longArrayOf(dirfd.toLong(), times?.value ?: 0L)).toInt()
}

public fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("utimensat", -1, longArrayOf(dirfd.toLong(), __cstr_1, times?.value ?: 0L, flag.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun nlLanginfo(item: NlItem): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo", -1, longArrayOf(item.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("__xnet_bind", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, addressLen.toLong())).toInt()
}

public fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("readv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("__xnet_sendmsg", -1, longArrayOf(fd.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("__xnet_recvmsg", -1, longArrayOf(fd.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun accept4(fd: CInt, address: Sockaddr?, addressLen: CUint?, flags: CInt): CInt {
    val __slot_2 = if (addressLen == null) 0L else LibcDynamicFfi.allocScalarSlot(addressLen.toLong())
    try {
        return LibcDynamicFfi.invoke("accept4", -1, longArrayOf(fd.toLong(), address?.value ?: 0L, __slot_2, flags.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("mq_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs)
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mqClose(mqd: MqdT): CInt {
    return LibcDynamicFfi.invoke("mq_close", -1, longArrayOf(mqd?.value ?: 0L)).toInt()
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
        return LibcDynamicFfi.invoke("mq_receive", -1, longArrayOf(mqd?.value ?: 0L, msgPtr?.value ?: 0L, msgLen.toLong(), __slot_3))
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT {
    val __slot_3 = if (msgPrio == null) 0L else LibcDynamicFfi.allocScalarSlot(msgPrio.toLong())
    try {
        return LibcDynamicFfi.invoke("mq_timedreceive", -1, longArrayOf(mqd?.value ?: 0L, msgPtr?.value ?: 0L, msgLen.toLong(), __slot_3, absTimeout?.value ?: 0L))
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt {
    val __cstr_1 = if (msgPtr == null) 0L else LibcDynamicFfi.allocUtf8CString(msgPtr)
    try {
        return LibcDynamicFfi.invoke("mq_send", -1, longArrayOf(mqd?.value ?: 0L, __cstr_1, msgLen.toLong(), msgPrio.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt {
    val __cstr_1 = if (msgPtr == null) 0L else LibcDynamicFfi.allocUtf8CString(msgPtr)
    try {
        return LibcDynamicFfi.invoke("mq_timedsend", -1, longArrayOf(mqd?.value ?: 0L, __cstr_1, msgLen.toLong(), msgPrio.toLong(), absTimeout?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt {
    return LibcDynamicFfi.invoke("mq_getattr", -1, longArrayOf(mqd?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt {
    return LibcDynamicFfi.invoke("mq_setattr", -1, longArrayOf(mqd?.value ?: 0L, newattr?.value ?: 0L, oldattr?.value ?: 0L)).toInt()
}

public fun portCreate(): CInt {
    return LibcDynamicFfi.invoke("port_create", -1, longArrayOf()).toInt()
}

public fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("port_associate", -1, longArrayOf(port.toLong(), source.toLong(), obj.toLong(), events.toLong(), user?.value ?: 0L)).toInt()
}

public fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt {
    return LibcDynamicFfi.invoke("port_dissociate", -1, longArrayOf(port.toLong(), source.toLong(), obj.toLong())).toInt()
}

public fun portGet(port: CInt, pe: PortEvent?, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("port_get", -1, longArrayOf(port.toLong(), pe?.value ?: 0L, timeout?.value ?: 0L)).toInt()
}

public fun portGetn(port: CInt, peList: PortEvent?, max: CUint, nget: CUint?, timeout: Timespec?): CInt {
    val __slot_3 = if (nget == null) 0L else LibcDynamicFfi.allocScalarSlot(nget.toLong())
    try {
        return LibcDynamicFfi.invoke("port_getn", -1, longArrayOf(port.toLong(), peList?.value ?: 0L, max.toLong(), __slot_3, timeout?.value ?: 0L)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("port_send", -1, longArrayOf(port.toLong(), events.toLong(), user?.value ?: 0L)).toInt()
}

public fun portSendn(portList: CInt?, errorList: CInt?, nent: CUint, events: CInt, user: COpaquePointer?): CInt {
    val __slot_0 = if (portList == null) 0L else LibcDynamicFfi.allocScalarSlot(portList.toLong())
    val __slot_1 = if (errorList == null) 0L else LibcDynamicFfi.allocScalarSlot(errorList.toLong())
    try {
        return LibcDynamicFfi.invoke("port_sendn", -1, longArrayOf(__slot_0, __slot_1, nent.toLong(), events.toLong(), user?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrgid_r", -1, longArrayOf(gid.toLong(), grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun sigaltstack(ss: StackT?, oss: StackT?): CInt {
    return LibcDynamicFfi.invoke("sigaltstack", -1, longArrayOf(ss?.value ?: 0L, oss?.value ?: 0L)).toInt()
}

public fun sigsuspend(mask: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("sigsuspend", -1, longArrayOf(mask?.value ?: 0L)).toInt()
}

public fun semClose(sem: SemT?): CInt {
    return LibcDynamicFfi.invoke("sem_close", -1, longArrayOf(sem?.value ?: 0L)).toInt()
}

public fun getdtablesize(): CInt {
    return LibcDynamicFfi.invoke("getdtablesize", -1, longArrayOf()).toInt()
}

public fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getgrnam_r", -1, longArrayOf(__cstr_0, grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun thrSelf(): ThreadT {
    return LibcDynamicFfi.invoke("thr_self", -1, longArrayOf()).toUInt()
}

public fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("pthread_sigmask", -1, longArrayOf(how.toLong(), set?.value ?: 0L, oldset?.value ?: 0L)).toInt()
}

public fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): SemT? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("sem_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs)
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getgrnam(name: String?): Group? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getgrnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun pthreadKill(thread: PthreadT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_kill", -1, longArrayOf(thread.toLong(), sig.toLong())).toInt()
}

public fun schedGetPriorityMin(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_min", -1, longArrayOf(policy.toLong())).toInt()
}

public fun schedGetPriorityMax(policy: CInt): CInt {
    return LibcDynamicFfi.invoke("sched_get_priority_max", -1, longArrayOf(policy.toLong())).toInt()
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

public fun semUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("sem_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun daemon(nochdir: CInt, noclose: CInt): CInt {
    return LibcDynamicFfi.invoke("daemon", -1, longArrayOf(nochdir.toLong(), noclose.toLong())).toInt()
}

public fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getpwnam_r", -1, longArrayOf(__cstr_0, pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getpwuid_r", -1, longArrayOf(uid.toLong(), pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun nativeGetpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: CInt): Passwd? {
    val rawRet = LibcDynamicFfi.invoke("native_getpwent_r", -1, longArrayOf(pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun nativeGetgrentR(grp: Group?, buf: COpaquePointer?, buflen: CInt): Group? {
    val rawRet = LibcDynamicFfi.invoke("native_getgrent_r", -1, longArrayOf(grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun sigwait(set: SigsetT?, sig: CInt?): CInt {
    val __slot_1 = if (sig == null) 0L else LibcDynamicFfi.allocScalarSlot(sig.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwait", -1, longArrayOf(set?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt {
    return LibcDynamicFfi.invoke("pthread_atfork", -1, longArrayOf(prepare?.value ?: 0L, parent?.value ?: 0L, child?.value ?: 0L)).toInt()
}

public fun getgrgid(gid: GidT): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrgid", -1, longArrayOf(gid.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setgrent() {
    LibcDynamicFfi.invoke("setgrent", -1, longArrayOf())
}

public fun endgrent() {
    LibcDynamicFfi.invoke("endgrent", -1, longArrayOf())
}

public fun getgrent(): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun popen(command: String?, mode: String?): FILE? {
    val __cstr_0 = if (command == null) 0L else LibcDynamicFfi.allocUtf8CString(command)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("popen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun dup3(src: CInt, dst: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("dup3", -1, longArrayOf(src.toLong(), dst.toLong(), flags.toLong())).toInt()
}

public fun uname(buf: Utsname?): CInt {
    return LibcDynamicFfi.invoke("uname", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun pipe2(fds: CInt?, flags: CInt): CInt {
    val __slot_0 = if (fds == null) 0L else LibcDynamicFfi.allocScalarSlot(fds.toLong())
    try {
        return LibcDynamicFfi.invoke("pipe2", -1, longArrayOf(__slot_0, flags.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun makeutx(ux: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("makeutx", -1, longArrayOf(ux?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun modutx(ux: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("modutx", -1, longArrayOf(ux?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun updwtmpx(file: String?, ut: Utmpx?) {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        LibcDynamicFfi.invoke("updwtmpx", -1, longArrayOf(__cstr_0, ut?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun utmpxname(file: String?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utmpxname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
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

public fun pututxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("pututxline", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setutxent() {
    LibcDynamicFfi.invoke("setutxent", -1, longArrayOf())
}

public fun endutxent() {
    LibcDynamicFfi.invoke("endutxent", -1, longArrayOf())
}

public fun endutent() {
    LibcDynamicFfi.invoke("endutent", -1, longArrayOf())
}

public fun getutent(): Utmp? {
    val rawRet = LibcDynamicFfi.invoke("getutent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutid(u: Utmp?): Utmp? {
    val rawRet = LibcDynamicFfi.invoke("getutid", -1, longArrayOf(u?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutline(u: Utmp?): Utmp? {
    val rawRet = LibcDynamicFfi.invoke("getutline", -1, longArrayOf(u?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pututline(u: Utmp?): Utmp? {
    val rawRet = LibcDynamicFfi.invoke("pututline", -1, longArrayOf(u?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setutent() {
    LibcDynamicFfi.invoke("setutent", -1, longArrayOf())
}

public fun utmpname(file: String?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utmpname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getutmp(ux: Utmpx?, u: Utmp?) {
    LibcDynamicFfi.invoke("getutmp", -1, longArrayOf(ux?.value ?: 0L, u?.value ?: 0L))
}

public fun getutmpx(u: Utmp?, ux: Utmpx?) {
    LibcDynamicFfi.invoke("getutmpx", -1, longArrayOf(u?.value ?: 0L, ux?.value ?: 0L))
}

public fun updwtmp(file: String?, u: Utmp?) {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        LibcDynamicFfi.invoke("updwtmp", -1, longArrayOf(__cstr_0, u?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ntpAdjtime(buf: Timex?): CInt {
    return LibcDynamicFfi.invoke("ntp_adjtime", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun ntpGettime(buf: Ntptimeval?): CInt {
    return LibcDynamicFfi.invoke("ntp_gettime", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: CInt?): CInt {
    val __slot_2 = if (timerid == null) 0L else LibcDynamicFfi.allocScalarSlot(timerid.toLong())
    try {
        return LibcDynamicFfi.invoke("timer_create", -1, longArrayOf(clockId.toLong(), evp?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun timerDelete(timerid: TimerT): CInt {
    return LibcDynamicFfi.invoke("timer_delete", -1, longArrayOf(timerid.toLong())).toInt()
}

public fun timerGetoverrun(timerid: TimerT): CInt {
    return LibcDynamicFfi.invoke("timer_getoverrun", -1, longArrayOf(timerid.toLong())).toInt()
}

public fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timer_gettime", -1, longArrayOf(timerid.toLong(), value?.value ?: 0L)).toInt()
}

public fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timer_settime", -1, longArrayOf(timerid.toLong(), flags.toLong(), value?.value ?: 0L, ovalue?.value ?: 0L)).toInt()
}

public fun ucredGet(pid: PidT): UcredT? {
    val rawRet = LibcDynamicFfi.invoke("ucred_get", -1, longArrayOf(pid.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getpeerucred", -1, longArrayOf(fd.toLong(), ucred?.value ?: 0L)).toInt()
}

public fun ucredFree(ucred: UcredT?) {
    LibcDynamicFfi.invoke("ucred_free", -1, longArrayOf(ucred?.value ?: 0L))
}

public fun ucredGeteuid(ucred: UcredT?): UidT {
    return LibcDynamicFfi.invoke("ucred_geteuid", -1, longArrayOf(ucred?.value ?: 0L)).toUShort()
}

public fun ucredGetruid(ucred: UcredT?): UidT {
    return LibcDynamicFfi.invoke("ucred_getruid", -1, longArrayOf(ucred?.value ?: 0L)).toUShort()
}

public fun ucredGetsuid(ucred: UcredT?): UidT {
    return LibcDynamicFfi.invoke("ucred_getsuid", -1, longArrayOf(ucred?.value ?: 0L)).toUShort()
}

public fun ucredGetegid(ucred: UcredT?): GidT {
    return LibcDynamicFfi.invoke("ucred_getegid", -1, longArrayOf(ucred?.value ?: 0L)).toUShort()
}

public fun ucredGetrgid(ucred: UcredT?): GidT {
    return LibcDynamicFfi.invoke("ucred_getrgid", -1, longArrayOf(ucred?.value ?: 0L)).toUShort()
}

public fun ucredGetsgid(ucred: UcredT?): GidT {
    return LibcDynamicFfi.invoke("ucred_getsgid", -1, longArrayOf(ucred?.value ?: 0L)).toUShort()
}

public fun ucredGetgroups(ucred: UcredT?, groups: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("ucred_getgroups", -1, longArrayOf(ucred?.value ?: 0L, groups?.value ?: 0L)).toInt()
}

public fun ucredGetpid(ucred: UcredT?): PidT {
    return LibcDynamicFfi.invoke("ucred_getpid", -1, longArrayOf(ucred?.value ?: 0L)).toInt()
}

public fun ucredGetprojid(ucred: UcredT?): ProjidT {
    return LibcDynamicFfi.invoke("ucred_getprojid", -1, longArrayOf(ucred?.value ?: 0L)).toInt()
}

public fun ucredGetzoneid(ucred: UcredT?): ZoneidT {
    return LibcDynamicFfi.invoke("ucred_getzoneid", -1, longArrayOf(ucred?.value ?: 0L)).toInt()
}

public fun ucredGetpflags(ucred: UcredT?, flags: CUint): CUint {
    return LibcDynamicFfi.invoke("ucred_getpflags", -1, longArrayOf(ucred?.value ?: 0L, flags.toLong())).toUInt()
}

public fun ucredSize(): SizeT {
    return LibcDynamicFfi.invoke("ucred_size", -1, longArrayOf()).toULong()
}

public fun psetCreate(newpset: CInt?): CInt {
    val __slot_0 = if (newpset == null) 0L else LibcDynamicFfi.allocScalarSlot(newpset.toLong())
    try {
        return LibcDynamicFfi.invoke("pset_create", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun psetDestroy(pset: PsetidT): CInt {
    return LibcDynamicFfi.invoke("pset_destroy", -1, longArrayOf(pset.toLong())).toInt()
}

public fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: CInt?): CInt {
    val __slot_2 = if (opset == null) 0L else LibcDynamicFfi.allocScalarSlot(opset.toLong())
    try {
        return LibcDynamicFfi.invoke("pset_assign", -1, longArrayOf(pset.toLong(), cpu.toLong(), __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun psetInfo(pset: PsetidT, tpe: CInt?, numcpus: CUint?, cpulist: CInt?): CInt {
    val __slot_1 = if (tpe == null) 0L else LibcDynamicFfi.allocScalarSlot(tpe.toLong())
    val __slot_2 = if (numcpus == null) 0L else LibcDynamicFfi.allocScalarSlot(numcpus.toLong())
    val __slot_3 = if (cpulist == null) 0L else LibcDynamicFfi.allocScalarSlot(cpulist.toLong())
    try {
        return LibcDynamicFfi.invoke("pset_info", -1, longArrayOf(pset.toLong(), __slot_1, __slot_2, __slot_3)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: CInt?): CInt {
    val __slot_3 = if (opset == null) 0L else LibcDynamicFfi.allocScalarSlot(opset.toLong())
    try {
        return LibcDynamicFfi.invoke("pset_bind", -1, longArrayOf(pset.toLong(), idtype.toLong(), id.toLong(), __slot_3)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun psetList(pset: CInt?, numpsets: CUint?): CInt {
    val __slot_0 = if (pset == null) 0L else LibcDynamicFfi.allocScalarSlot(pset.toLong())
    val __slot_1 = if (numpsets == null) 0L else LibcDynamicFfi.allocScalarSlot(numpsets.toLong())
    try {
        return LibcDynamicFfi.invoke("pset_list", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun psetSetattr(pset: PsetidT, attr: CUint): CInt {
    return LibcDynamicFfi.invoke("pset_setattr", -1, longArrayOf(pset.toLong(), attr.toLong())).toInt()
}

public fun psetGetattr(pset: PsetidT, attr: CUint?): CInt {
    val __slot_1 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pset_getattr", -1, longArrayOf(pset.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: CInt?): CInt {
    val __slot_3 = if (oldBinding == null) 0L else LibcDynamicFfi.allocScalarSlot(oldBinding.toLong())
    try {
        return LibcDynamicFfi.invoke("processor_bind", -1, longArrayOf(idtype.toLong(), id.toLong(), newBinding.toLong(), __slot_3)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun pOnline(processorid: ProcessoridT, flag: CInt): CInt {
    return LibcDynamicFfi.invoke("p_online", -1, longArrayOf(processorid.toLong(), flag.toLong())).toInt()
}

public fun processorInfo(processorid: ProcessoridT, infop: ProcessorInfoT?): CInt {
    return LibcDynamicFfi.invoke("processor_info", -1, longArrayOf(processorid.toLong(), infop?.value ?: 0L)).toInt()
}

public fun getexecname(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getexecname", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun gethostid(): CLong {
    return LibcDynamicFfi.invoke("gethostid", -1, longArrayOf())
}

public fun getpflags(flags: CUint): CUint {
    return LibcDynamicFfi.invoke("getpflags", -1, longArrayOf(flags.toLong())).toUInt()
}

public fun setpflags(flags: CUint, value: CUint): CInt {
    return LibcDynamicFfi.invoke("setpflags", -1, longArrayOf(flags.toLong(), value.toLong())).toInt()
}

public fun sysinfo(command: CInt, buf: COpaquePointer?, count: CLong): CInt {
    return LibcDynamicFfi.invoke("sysinfo", -1, longArrayOf(command.toLong(), buf?.value ?: 0L, count)).toInt()
}

public fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("faccessat", -1, longArrayOf(fd.toLong(), __cstr_1, amode.toLong(), flag.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// #include <link.h>
public fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dl_iterate_phdr", -1, longArrayOf(callback?.value ?: 0L, data?.value ?: 0L)).toInt()
}

public fun getpagesize(): CInt {
    return LibcDynamicFfi.invoke("getpagesize", -1, longArrayOf()).toInt()
}

public fun getpagesizes(pagesize: SizeT?, nelem: CInt): CInt {
    val __slot_0 = if (pagesize == null) 0L else LibcDynamicFfi.allocScalarSlot(pagesize.toLong())
    try {
        return LibcDynamicFfi.invoke("getpagesizes", -1, longArrayOf(__slot_0, nelem.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun mmapobj(fd: CInt, flags: CUint, storage: MmapobjResultT?, elements: CUint?, arg: COpaquePointer?): CInt {
    val __slot_3 = if (elements == null) 0L else LibcDynamicFfi.allocScalarSlot(elements.toLong())
    try {
        return LibcDynamicFfi.invoke("mmapobj", -1, longArrayOf(fd.toLong(), flags.toLong(), storage?.value ?: 0L, __slot_3, arg?.value ?: 0L)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun meminfo(inaddr: ULong?, addrCount: CInt, infoReq: CUint?, infoCount: CInt, outdata: ULong?, validity: CUint?): CInt {
    val __slot_0 = if (inaddr == null) 0L else LibcDynamicFfi.allocScalarSlot(inaddr.toLong())
    val __slot_2 = if (infoReq == null) 0L else LibcDynamicFfi.allocScalarSlot(infoReq.toLong())
    val __slot_4 = if (outdata == null) 0L else LibcDynamicFfi.allocScalarSlot(outdata.toLong())
    val __slot_5 = if (validity == null) 0L else LibcDynamicFfi.allocScalarSlot(validity.toLong())
    try {
        return LibcDynamicFfi.invoke("meminfo", -1, longArrayOf(__slot_0, addrCount.toLong(), __slot_2, infoCount.toLong(), __slot_4, __slot_5)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? {
    val __cstr_1 = if (delim == null) 0L else LibcDynamicFfi.allocUtf8CString(delim)
    try {
        val rawRet = LibcDynamicFfi.invoke("strsep", -1, longArrayOf(string?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getisax(array: UInt?, n: CUint): CUint {
    val __slot_0 = if (array == null) 0L else LibcDynamicFfi.allocScalarSlot(array.toLong())
    try {
        return LibcDynamicFfi.invoke("getisax", -1, longArrayOf(__slot_0, n.toLong())).toUInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun backtrace(buffer: COpaquePointer?, size: CInt): CInt {
    return LibcDynamicFfi.invoke("backtrace", -1, longArrayOf(buffer?.value ?: 0L, size.toLong())).toInt()
}

public fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("backtrace_symbols", -1, longArrayOf(buffer?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) {
    LibcDynamicFfi.invoke("backtrace_symbols_fd", -1, longArrayOf(buffer?.value ?: 0L, size.toLong(), fd.toLong()))
}

public fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt {
    val __cstr_2 = if (optstring == null) 0L else LibcDynamicFfi.allocUtf8CString(optstring)
    val __slot_4 = if (longindex == null) 0L else LibcDynamicFfi.allocScalarSlot(longindex.toLong())
    try {
        return LibcDynamicFfi.invoke("getopt_long", -1, longArrayOf(argc.toLong(), argv?.value ?: 0L, __cstr_2, longopts?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun sync() {
    LibcDynamicFfi.invoke("sync", -1, longArrayOf())
}

public fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_cancel", -1, longArrayOf(fd.toLong(), aiocbp?.value ?: 0L)).toInt()
}

public fun aioError(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_error", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_fsync", -1, longArrayOf(op.toLong(), aiocbp?.value ?: 0L)).toInt()
}

public fun aioRead(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_read", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun aioReturn(aiocbp: Aiocb?): SsizeT {
    return LibcDynamicFfi.invoke("aio_return", -1, longArrayOf(aiocbp?.value ?: 0L))
}

public fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("aio_suspend", -1, longArrayOf(aiocbList?.value ?: 0L, nitems.toLong(), timeout?.value ?: 0L)).toInt()
}

public fun aioWaitn(aiocbList: COpaquePointer?, nent: CUint, nwait: CUint?, timeout: Timespec?): CInt {
    val __slot_2 = if (nwait == null) 0L else LibcDynamicFfi.allocScalarSlot(nwait.toLong())
    try {
        return LibcDynamicFfi.invoke("aio_waitn", -1, longArrayOf(aiocbList?.value ?: 0L, nent.toLong(), __slot_2, timeout?.value ?: 0L)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun aioWrite(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_write", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("lio_listio", -1, longArrayOf(mode.toLong(), aiocbList?.value ?: 0L, nitems.toLong(), sevp?.value ?: 0L)).toInt()
}

public fun major(version: CInt, devnum: DevT): MajorT {
    return LibcDynamicFfi.invoke("__major", -1, longArrayOf(version.toLong(), devnum.toLong())).toUInt()
}

public fun minor(version: CInt, devnum: DevT): MinorT {
    return LibcDynamicFfi.invoke("__minor", -1, longArrayOf(version.toLong(), devnum.toLong())).toUInt()
}

public fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT {
    return LibcDynamicFfi.invoke("__makedev", -1, longArrayOf(version.toLong(), majdev.toLong(), mindev.toLong())).toULong()
}

public fun arc4random(): UInt {
    return LibcDynamicFfi.invoke("arc4random", -1, longArrayOf()).toUInt()
}

public fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    LibcDynamicFfi.invoke("arc4random_buf", -1, longArrayOf(buf?.value ?: 0L, nbytes.toLong()))
}

public fun arc4randomUniform(upperBound: UInt): UInt {
    return LibcDynamicFfi.invoke("arc4random_uniform", -1, longArrayOf(upperBound.toLong())).toUInt()
}

public fun secureGetenv(name: String?): COpaquePointer? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("secure_getenv", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?): SizeT {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("strftime", -1, longArrayOf(s?.value ?: 0L, maxsize.toLong(), __cstr_2, timeptr?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun strftimeL(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?, loc: LocaleT): SizeT {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("strftime_l", -1, longArrayOf(s?.value ?: 0L, maxsize.toLong(), __cstr_2, timeptr?.value ?: 0L, loc?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun sendfile(outFd: CInt, inFd: CInt, off: CLong?, len: SizeT): SsizeT {
    val __slot_2 = if (off == null) 0L else LibcDynamicFfi.allocScalarSlot(off)
    try {
        return LibcDynamicFfi.invoke("sendfile", -1, longArrayOf(outFd.toLong(), inFd.toLong(), __slot_2, len.toLong()))
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sendfilev(fildes: CInt, vec: SendfilevecT?, sfvcnt: CInt, xferred: SizeT?): SsizeT {
    val __slot_3 = if (xferred == null) 0L else LibcDynamicFfi.allocScalarSlot(xferred.toLong())
    try {
        return LibcDynamicFfi.invoke("sendfilev", -1, longArrayOf(fildes.toLong(), vec?.value ?: 0L, sfvcnt.toLong(), __slot_3))
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun lgrpInit(view: LgrpViewT): LgrpCookieT {
    return LibcDynamicFfi.invoke("lgrp_init", -1, longArrayOf(view.toLong())).toULong()
}

public fun lgrpFini(cookie: LgrpCookieT): CInt {
    return LibcDynamicFfi.invoke("lgrp_fini", -1, longArrayOf(cookie.toLong())).toInt()
}

public fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT {
    LibcDynamicFfi.invoke("lgrp_affinity_get", -1, longArrayOf(idtype.toLong(), id.toLong(), lgrp.toLong()))
    return null as LgrpAffinityT
}

public fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt {
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("lgrp_affinity_set", -1, longArrayOf(idtype.toLong(), id.toLong(), lgrp.toLong(), __scratch_3)).toInt()
    } finally {
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: CInt?, count: CUint, content: LgrpContentT): CInt {
    val __slot_2 = if (cpuids == null) 0L else LibcDynamicFfi.allocScalarSlot(cpuids.toLong())
    try {
        return LibcDynamicFfi.invoke("lgrp_cpus", -1, longArrayOf(cookie.toLong(), lgrp.toLong(), __slot_2, count.toLong(), content.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT {
    return LibcDynamicFfi.invoke("lgrp_mem_size", -1, longArrayOf(cookie.toLong(), lgrp.toLong(), tpe.toLong(), content.toLong()))
}

public fun lgrpNlgrps(cookie: LgrpCookieT): CInt {
    return LibcDynamicFfi.invoke("lgrp_nlgrps", -1, longArrayOf(cookie.toLong())).toInt()
}

public fun lgrpView(cookie: LgrpCookieT): LgrpViewT {
    return LibcDynamicFfi.invoke("lgrp_view", -1, longArrayOf(cookie.toLong())).toUInt()
}

public fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT {
    return LibcDynamicFfi.invoke("lgrp_home", -1, longArrayOf(idtype.toLong(), id.toLong())).toInt()
}

public fun lgrpVersion(version: CInt): CInt {
    return LibcDynamicFfi.invoke("lgrp_version", -1, longArrayOf(version.toLong())).toInt()
}

public fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: CInt?, count: CUint, tpe: LgrpRsrcT): CInt {
    val __slot_2 = if (lgrps == null) 0L else LibcDynamicFfi.allocScalarSlot(lgrps.toLong())
    val __scratch_4 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("lgrp_resources", -1, longArrayOf(cookie.toLong(), lgrp.toLong(), __slot_2, count.toLong(), __scratch_4)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__scratch_4 != 0L) LibcDynamicFfi.freeMem(__scratch_4)
    }
}

public fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT {
    return LibcDynamicFfi.invoke("lgrp_root", -1, longArrayOf(cookie.toLong())).toInt()
}

public fun major(device: DevT): MajorT {
    return major(NEWDEV, device)
}

public fun minor(device: DevT): MinorT {
    return minor(NEWDEV, device)
}

public fun makedev(maj: MajorT, min: MinorT): DevT {
    return makedev(NEWDEV, maj, min)
}
