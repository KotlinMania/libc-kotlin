// port-lint: source unix/linux_like/l4re/uclibc/aarch64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64

import io.github.kotlinmania.libc.*

public typealias WcharT = CUInt
public typealias TimeT = CLong
public typealias ClockT = CLong
public typealias FsblkcntT = CULong
public typealias FsfilcntT = CULong
public typealias InoT = CULong
public typealias NlinkT = CULong
public typealias OffT = CLong
public typealias FswordT = CLong
public typealias SusecondsT = CLong
public typealias BlksizeT = CLong
public typealias BlkcntT = CLong
public typealias Fsblkcnt64T = CULong
public typealias Fsfilcnt64T = CULong
public typealias U64 = CULong

public data class Stat(
    val stDev: CULong,
    val pad1: CUShort,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: CULong,
    val pad2: CUShort,
    val stSize: Off64T,
    val stBlksize: BlksizeT,
    val stBlocks: Blkcnt64T,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
    val uclibcUnused4: CULong,
    val uclibcUnused5: CULong,
)

public data class Stat64(
    val stDev: CULong,
    val pad1: CUInt,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: CULong,
    val pad2: CUInt,
    val stSize: Off64T,
    val stBlksize: BlksizeT,
    val stBlocks: Blkcnt64T,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
    val stIno2: Ino64T,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: TimeT,
    val unused1: CULong,
    val shmDtime: TimeT,
    val unused2: CULong,
    val shmCtime: TimeT,
    val unused3: CULong,
    val shmCpid: PidT,
    val shmLpid: PidT,
    val shmNattch: ShmattT,
    val unused4: CULong,
    val unused5: CULong,
)

public data class Sigaction(
    val saHandler: SighandlerT,
    val saFlags: CULong,
    val saRestorer: (() -> Unit)?,
    val saMask: SigsetT,
)

public data class SigsetT(
    val `val`: ULongArray,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val pad: IntArray,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CcT,
    val cCc: List<CcT>,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

// C union; only one variant is valid at a time.
public data class SemT(
    val size: ByteArray? = null,
    val align: CLongLong? = null,
)

public const val O_CLOEXEC: CInt = 524288
public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 36uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL
public const val __SIZEOF_PTHREAD_COND_COMPAT_T: ULong = 12uL
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL
public const val NCCS: ULong = 32uL
public const val FIOQSIZE: Ioctl = 0x545E
public const val MAP_HUGETLB: CInt = 0x040000
public const val B0: SpeedT = 0u
public const val B1000000: SpeedT = 0x1008u
public const val B110: SpeedT = 0x3u
public const val B115200: SpeedT = 0x1002u
public const val B1152000: SpeedT = 0x1009u
public const val B1200: SpeedT = 0x9u
public const val B134: SpeedT = 0x4u
public const val B150: SpeedT = 0x5u
public const val B1500000: SpeedT = 0x100au
public const val B1800: SpeedT = 0xau
public const val B19200: SpeedT = 0xeu
public const val B200: SpeedT = 0x6u
public const val B2000000: SpeedT = 0x100bu
public const val B230400: SpeedT = 0x1003u
public const val B2400: SpeedT = 0xbu
public const val B2500000: SpeedT = 0x100cu
public const val B300: SpeedT = 0x7u
public const val B3000000: SpeedT = 0x100du
public const val B3500000: SpeedT = 0x100eu
public const val B38400: SpeedT = 0xfu
public const val B4000000: SpeedT = 0x100fu
public const val B460800: SpeedT = 0x1004u
public const val B4800: SpeedT = 0xcu
public const val B50: SpeedT = 0x1u
public const val B500000: SpeedT = 0x1005u
public const val B57600: SpeedT = 0x1001u
public const val B576000: SpeedT = 0x1006u
public const val B600: SpeedT = 0x8u
public const val B75: SpeedT = 0x2u
public const val B921600: SpeedT = 0x1007u
public const val B9600: SpeedT = 0xdu
public const val BS1: CInt = 0x2000
public const val BSDLY: CInt = 0x2000
public const val CBAUD: TcflagT = 0x100fu
public const val CBAUDEX: TcflagT = 0x1000u
public const val CIBAUD: TcflagT = 0x100f0000u
public const val CLOCAL: TcflagT = 0x800u
public const val CPU_SETSIZE: CInt = 0x400
public const val CR1: CInt = 0x200
public const val CR2: CInt = 0x400
public const val CR3: CInt = 0x600
public const val CRDLY: CInt = 0x600
public const val CREAD: TcflagT = 0x80u
public const val CS6: TcflagT = 0x10u
public const val CS7: TcflagT = 0x20u
public const val CS8: TcflagT = 0x30u
public const val CSIZE: TcflagT = 0x30u
public const val CSTOPB: TcflagT = 0x40u
public const val EADDRINUSE: CInt = 0x62
public const val EADDRNOTAVAIL: CInt = 0x63
public const val EADV: CInt = 0x44
public const val EAFNOSUPPORT: CInt = 0x61
public const val EALREADY: CInt = 0x72
public const val EBADE: CInt = 0x34
public const val EBADFD: CInt = 0x4d
public const val EBADMSG: CInt = 0x4a
public const val EBADR: CInt = 0x35
public const val EBADRQC: CInt = 0x38
public const val EBADSLT: CInt = 0x39
public const val EBFONT: CInt = 0x3b
public const val ECANCELED: CInt = 0x7d
public const val ECHOCTL: TcflagT = 0x200u
public const val ECHOE: TcflagT = 0x10u
public const val ECHOK: TcflagT = 0x20u
public const val ECHOKE: TcflagT = 0x800u
public const val ECHONL: TcflagT = 0x40u
public const val ECHOPRT: TcflagT = 0x400u
public const val ECHRNG: CInt = 0x2c
public const val ECOMM: CInt = 0x46
public const val ECONNABORTED: CInt = 0x67
public const val ECONNREFUSED: CInt = 0x6f
public const val ECONNRESET: CInt = 0x68
public const val EDESTADDRREQ: CInt = 0x59
public const val EDOTDOT: CInt = 0x49
public const val EDQUOT: CInt = 0x7a
public const val EHOSTDOWN: CInt = 0x70
public const val EHOSTUNREACH: CInt = 0x71
public const val EIDRM: CInt = 0x2b
public const val EILSEQ: CInt = 0x54
public const val EINPROGRESS: CInt = 0x73
public const val EISCONN: CInt = 0x6a
public const val EISNAM: CInt = 0x78
public const val EKEYEXPIRED: CInt = 0x7f
public const val EKEYREJECTED: CInt = 0x81
public const val EKEYREVOKED: CInt = 0x80
public const val EL2HLT: CInt = 0x33
public const val EL2NSYNC: CInt = 0x2d
public const val EL3HLT: CInt = 0x2e
public const val EL3RST: CInt = 0x2f
public const val ELIBACC: CInt = 0x4f
public const val ELIBBAD: CInt = 0x50
public const val ELIBEXEC: CInt = 0x53
public const val ELIBMAX: CInt = 0x52
public const val ELIBSCN: CInt = 0x51
public const val ELNRNG: CInt = 0x30
public const val ELOOP: CInt = 0x28
public const val EMEDIUMTYPE: CInt = 0x7c
public const val EMSGSIZE: CInt = 0x5a
public const val EMULTIHOP: CInt = 0x48
public const val ENAMETOOLONG: CInt = 0x24
public const val ENAVAIL: CInt = 0x77
public const val ENETDOWN: CInt = 0x64
public const val ENETRESET: CInt = 0x66
public const val ENETUNREACH: CInt = 0x65
public const val ENOANO: CInt = 0x37
public const val ENOBUFS: CInt = 0x69
public const val ENOCSI: CInt = 0x32
public const val ENODATA: CInt = 0x3d
public const val ENOKEY: CInt = 0x7e
public const val ENOLCK: CInt = 0x25
public const val ENOLINK: CInt = 0x43
public const val ENOMEDIUM: CInt = 0x7b
public const val ENOMSG: CInt = 0x2a
public const val ENONET: CInt = 0x40
public const val ENOPKG: CInt = 0x41
public const val ENOPROTOOPT: CInt = 0x5c
public const val ENOSR: CInt = 0x3f
public const val ENOSTR: CInt = 0x3c
public const val ENOSYS: CInt = 0x26
public const val ENOTCONN: CInt = 0x6b
public const val ENOTEMPTY: CInt = 0x27
public const val ENOTNAM: CInt = 0x76
public const val ENOTRECOVERABLE: CInt = 0x83
public const val ENOTSOCK: CInt = 0x58
public const val ENOTUNIQ: CInt = 0x4c
public const val EOPNOTSUPP: CInt = 0x5f
public const val EOVERFLOW: CInt = 0x4b
public const val EOWNERDEAD: CInt = 0x82
public const val EPFNOSUPPORT: CInt = 0x60
public const val EPOLL_CLOEXEC: CInt = 0x80000
public const val EPROTO: CInt = 0x47
public const val EPROTONOSUPPORT: CInt = 0x5d
public const val EPROTOTYPE: CInt = 0x5b
public const val EREMCHG: CInt = 0x4e
public const val EREMOTE: CInt = 0x42
public const val EREMOTEIO: CInt = 0x79
public const val ERESTART: CInt = 0x55
public const val ESHUTDOWN: CInt = 0x6c
public const val ESOCKTNOSUPPORT: CInt = 0x5e
public const val ESRMNT: CInt = 0x45
public const val ESTALE: CInt = 0x74
public const val ESTRPIPE: CInt = 0x56
public const val ETIME: CInt = 0x3e
public const val ETIMEDOUT: CInt = 0x6e
public const val ETOOMANYREFS: CInt = 0x6d
public const val EUCLEAN: CInt = 0x75
public const val EUNATCH: CInt = 0x31
public const val EUSERS: CInt = 0x57
public const val EXFULL: CInt = 0x36
public const val FF1: CInt = 0x8000
public const val FFDLY: CInt = 0x8000
public const val FLUSHO: TcflagT = 0x1000u
public const val F_GETLK: CInt = 0x5
public const val F_SETLK: CInt = 0x6
public const val F_SETLKW: CInt = 0x7
public const val HUPCL: TcflagT = 0x400u
public const val ICANON: TcflagT = 0x2u
public const val IEXTEN: TcflagT = 0x8000u
public const val ISIG: TcflagT = 0x1u
public const val IXOFF: TcflagT = 0x1000u
public const val IXON: TcflagT = 0x400u
public const val MAP_ANON: CInt = 0x20
public const val MAP_ANONYMOUS: CInt = 0x20
public const val MAP_DENYWRITE: CInt = 0x800
public const val MAP_EXECUTABLE: CInt = 0x1000
public const val MAP_GROWSDOWN: CInt = 0x100
public const val MAP_LOCKED: CInt = 0x2000
public const val MAP_NONBLOCK: CInt = 0x10000
public const val MAP_NORESERVE: CInt = 0x4000
public const val MAP_POPULATE: CInt = 0x8000
public const val MAP_STACK: CInt = 0x20000
public const val MINSIGSTKSZ: CInt = 5120
public const val NLDLY: TcflagT = 0x100u
public const val NOFLSH: TcflagT = 0x80u
public const val OLCUC: TcflagT = 0x2u
public const val ONLCR: TcflagT = 0x4u
public const val O_ACCMODE: CInt = 0x3
public const val O_APPEND: CInt = 0x400
public const val O_ASYNC: CInt = 8192
public const val O_CREAT: CInt = 0x40
public const val O_DIRECT: CInt = 0x10000
public const val O_DIRECTORY: CInt = 0x4000
public val O_DSYNC: CInt = O_SYNC
public const val O_EXCL: CInt = 0x80
public val O_FSYNC: CInt = O_SYNC
public const val O_LARGEFILE: CInt = 131072
public val O_NDELAY: CInt = O_NONBLOCK
public const val O_NOATIME: CInt = 262144
public const val O_NOCTTY: CInt = 0x100
public const val O_NOFOLLOW: CInt = 0x8000
public const val O_NONBLOCK: CInt = 0x800
public const val O_PATH: CInt = 2097152
public val O_RSYNC: CInt = O_SYNC
public const val O_SYNC: CInt = 4096
public const val O_TRUNC: CInt = 0x200
public const val PARENB: TcflagT = 0x100u
public const val PARODD: TcflagT = 0x200u
public const val PENDIN: TcflagT = 0x4000u
public const val POLLWRBAND: CShort = 0x200
public const val POLLWRNORM: CShort = 0x100
public const val RTLD_GLOBAL: CInt = 0x00100
public const val SA_NOCLDSTOP: CULong = 0x1uL
public const val SA_NOCLDWAIT: CULong = 0x2uL
public const val SA_SIGINFO: CULong = 0x4uL
public const val SA_NODEFER: CULong = 0x40000000uL
public const val SA_ONSTACK: CULong = 0x8000000uL
public const val SA_RESETHAND: CULong = 0x80000000uL
public const val SA_RESTART: CULong = 0x10000000uL
public const val SIGBUS: CInt = 0x7
public const val SIGCHLD: CInt = 0x11
public const val SIGCONT: CInt = 0x12
public const val SIGIO: CInt = 0x1d
public const val SIGPOLL: CInt = SIGIO
public const val SIGPROF: CInt = 0x1b
public const val SIGPWR: CInt = 0x1e
public const val SIGSTKFLT: CInt = 0x10
public const val SIGSTKSZ: CInt = 16384
public const val SIGSTOP: CInt = 0x13
public const val SIGSYS: CInt = 0x1f
public const val SIGTSTP: CInt = 0x14
public const val SIGTTIN: CInt = 0x15
public const val SIGTTOU: CInt = 0x16
public const val SIGURG: CInt = 0x17
public const val SIGUSR1: CInt = 0xa
public const val SIGUSR2: CInt = 0xc
public const val SIGVTALRM: CInt = 0x1a
public const val SIGWINCH: CInt = 0x1c
public const val SIGXCPU: CInt = 0x18
public const val SIGXFSZ: CInt = 0x19
public const val SIG_BLOCK: CInt = 0
public const val SIG_UNBLOCK: CInt = 0x1
public const val SIG_SETMASK: CInt = 0x2
public const val SOCK_DGRAM: CInt = 0x2
public const val SOCK_NONBLOCK: CInt = 2048
public const val SOCK_SEQPACKET: CInt = 0x5
public const val SOCK_STREAM: CInt = 0x1
public const val TAB1: CInt = 0x800
public const val TAB2: CInt = 0x1000
public const val TAB3: CInt = 0x1800
public const val TABDLY: CInt = 0x1800
public const val TCSADRAIN: CInt = 0x1
public const val TCSAFLUSH: CInt = 0x2
public const val TCSANOW: CInt = 0
public const val TOSTOP: TcflagT = 0x100u
public const val VDISCARD: ULong = 0xduL
public const val VEOF: ULong = 0x4uL
public const val VEOL: ULong = 0xbuL
public const val VEOL2: ULong = 0x10uL
public const val VMIN: ULong = 0x6uL
public const val VREPRINT: ULong = 0xcuL
public const val VSTART: ULong = 0x8uL
public const val VSTOP: ULong = 0x9uL
public const val VSUSP: ULong = 0xauL
public const val VSWTC: ULong = 0x7uL
public const val VT1: CInt = 0x4000
public const val VTDLY: CInt = 0x4000
public const val VTIME: ULong = 0x5uL
public const val VWERASE: ULong = 0xeuL
public const val XTABS: TcflagT = 0x1800u
