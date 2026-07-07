// port-lint: source unix/linux_like/linux/uclibc/arm/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.arm

import io.github.kotlinmania.libc.*

public typealias WcharT = CUInt
public typealias TimeT = CLong
public typealias ClockT = CLong
public typealias FsblkcntT = CULong
public typealias FsfilcntT = CULong
public typealias InoT = CULong
public typealias OffT = CLong
public typealias PthreadT = CULong
public typealias SusecondsT = CLong
public typealias NlinkT = CUInt
public typealias BlksizeT = CLong
public typealias BlkcntT = CLong
public typealias Fsblkcnt64T = ULong
public typealias Fsfilcnt64T = ULong
public typealias U64 = CULongLong
public typealias S64 = CLongLong

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: CInt,
    val msgControl: COpaquePointer?,
    val msgControllen: SocklenT,
    val msgFlags: CInt,
)

public data class PthreadAttrT(
    val size: LongArray,
)

public data class Stat(
    val stDev: CULongLong,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: CULongLong,
    val stSize: OffT,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
)

public data class Stat64(
    val stDev: CULongLong,
    val pad1: CUInt,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: CULongLong,
    val pad2: CUInt,
    val stSize: Off64T,
    val stBlksize: BlksizeT,
    val stBlocks: Blkcnt64T,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stIno: Ino64T,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
)

public data class Sysinfo(
    val uptime: CLong,
    val loads: ULongArray,
    val totalram: CULong,
    val freeram: CULong,
    val sharedram: CULong,
    val bufferram: CULong,
    val totalswap: CULong,
    val freeswap: CULong,
    val procs: CUShort,
    val pad: CUShort,
    val totalhigh: CULong,
    val freehigh: CULong,
    val memUnit: CUInt,
    val f: ByteArray,
)

public data class Statfs(
    val fType: CInt,
    val fBsize: CInt,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFsid: FsidT,
    val fNamelen: CInt,
    val fFrsize: CInt,
    val fFlags: CInt,
    val fSpare: IntArray,
)

public data class Statfs64(
    val fType: CInt,
    val fBsize: CInt,
    val fBlocks: Fsblkcnt64T,
    val fBfree: Fsblkcnt64T,
    val fBavail: Fsblkcnt64T,
    val fFiles: Fsfilcnt64T,
    val fFfree: Fsfilcnt64T,
    val fFsid: FsidT,
    val fNamelen: CInt,
    val fFrsize: CInt,
    val fFlags: CInt,
    val fSpare: IntArray,
)

public data class Statvfs64(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fSpare: IntArray,
)

public data class SigsetT(
    val `val`: ULongArray,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saFlags: CULong,
    val saRestorer: (() -> Unit)?,
    val saMask: SigsetT,
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

public data class IpcPerm(
    val key: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: CUShort,
    val seq: CUShort,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgStime: TimeT,
    val msgRtime: TimeT,
    val msgCtime: TimeT,
    val msgCbytes: CULong,
    val msgQnum: MsgqnumT,
    val msgQbytes: MsglenT,
    val msgLspid: PidT,
    val msgLrpid: PidT,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmCpid: PidT,
    val shmLpid: PidT,
    val shmNattch: ShmattT,
)

public data class SemT(
    val size: ByteArray,
    val size: ByteArray,
)

public const val O_CLOEXEC: CInt = 524288
public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 36uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 24uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_COND_COMPAT_T: ULong = 12uL
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 20uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL
public const val NCCS: ULong = 32uL
public const val MAP_HUGETLB: CInt = 0x040000
public const val B0: SpeedT = 0
public const val B1000000: SpeedT = 0x1008
public const val B110: SpeedT = 0x3
public const val B115200: SpeedT = 0x1002
public const val B1152000: SpeedT = 0x1009
public const val B1200: SpeedT = 0x9
public const val B134: SpeedT = 0x4
public const val B150: SpeedT = 0x5
public const val B1500000: SpeedT = 0x100a
public const val B1800: SpeedT = 0xa
public const val B19200: SpeedT = 0xe
public const val B200: SpeedT = 0x6
public const val B2000000: SpeedT = 0x100b
public const val B230400: SpeedT = 0x1003
public const val B2400: SpeedT = 0xb
public const val B2500000: SpeedT = 0x100c
public const val B300: SpeedT = 0x7
public const val B3000000: SpeedT = 0x100d
public const val B3500000: SpeedT = 0x100e
public const val B38400: SpeedT = 0xf
public const val B4000000: SpeedT = 0x100f
public const val B460800: SpeedT = 0x1004
public const val B4800: SpeedT = 0xc
public const val B50: SpeedT = 0x1
public const val B500000: SpeedT = 0x1005
public const val B57600: SpeedT = 0x1001
public const val B576000: SpeedT = 0x1006
public const val B600: SpeedT = 0x8
public const val B75: SpeedT = 0x2
public const val B921600: SpeedT = 0x1007
public const val B9600: SpeedT = 0xd
public const val BS1: CInt = 0x2000
public const val BSDLY: CInt = 0x2000
public const val CBAUD: TcflagT = 0x100f
public const val CBAUDEX: TcflagT = 0x1000
public const val CIBAUD: TcflagT = 0x100f0000
public const val CLOCAL: TcflagT = 0x800
public const val CPU_SETSIZE: CInt = 0x400
public const val CR1: CInt = 0x200
public const val CR2: CInt = 0x400
public const val CR3: CInt = 0x600
public const val CRDLY: CInt = 0x600
public const val CREAD: TcflagT = 0x80
public const val CS6: TcflagT = 0x10
public const val CS7: TcflagT = 0x20
public const val CS8: TcflagT = 0x30
public const val CSIZE: TcflagT = 0x30
public const val CSTOPB: TcflagT = 0x40
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
public const val ECHOCTL: TcflagT = 0x200
public const val ECHOE: TcflagT = 0x10
public const val ECHOK: TcflagT = 0x20
public const val ECHOKE: TcflagT = 0x800
public const val ECHONL: TcflagT = 0x40
public const val ECHOPRT: TcflagT = 0x400
public const val ECHRNG: CInt = 0x2c
public const val ECOMM: CInt = 0x46
public const val ECONNABORTED: CInt = 0x67
public const val ECONNREFUSED: CInt = 0x6f
public const val ECONNRESET: CInt = 0x68
public const val EDEADLK: CInt = 0x23
public const val EDESTADDRREQ: CInt = 0x59
public const val EDOTDOT: CInt = 0x49
public const val EDQUOT: CInt = 0x7a
public const val EFD_CLOEXEC: CInt = 0x80000
public const val EFD_NONBLOCK: CInt = 0x800
public const val EHOSTDOWN: CInt = 0x70
public const val EHOSTUNREACH: CInt = 0x71
public const val EHWPOISON: CInt = 0x85
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
public const val ERFKILL: CInt = 0x84
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
public const val FLUSHO: TcflagT = 0x1000
public const val F_GETLK: CInt = 0x5
public const val F_SETLK: CInt = 0x6
public const val F_SETLKW: CInt = 0x7
public const val HUPCL: TcflagT = 0x400
public const val ICANON: TcflagT = 0x2
public const val IEXTEN: TcflagT = 0x8000
public const val ISIG: TcflagT = 0x1
public const val IXOFF: TcflagT = 0x1000
public const val IXON: TcflagT = 0x400
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
public const val NLDLY: TcflagT = 0x100
public const val NOFLSH: TcflagT = 0x80
public const val OLCUC: TcflagT = 0x2
public const val ONLCR: TcflagT = 0x4
public const val O_ACCMODE: CInt = 0x3
public const val O_APPEND: CInt = 0x400
public const val O_ASYNC: CInt = 8192
public const val O_CREAT: CInt = 0x40
public const val O_DIRECT: CInt = 0x10000
public const val O_DIRECTORY: CInt = 0x4000
public const val O_DSYNC: CInt = O_SYNC
public const val O_EXCL: CInt = 0x80
public const val O_FSYNC: CInt = O_SYNC
public const val O_LARGEFILE: CInt = 131072
public const val O_NDELAY: CInt = O_NONBLOCK
public const val O_NOATIME: CInt = 262144
public const val O_NOCTTY: CInt = 0x100
public const val O_NOFOLLOW: CInt = 0x8000
public const val O_NONBLOCK: CInt = 0x800
public const val O_PATH: CInt = 2097152
public const val O_RSYNC: CInt = O_SYNC
public const val O_SYNC: CInt = 4096
public const val O_TRUNC: CInt = 0x200
public const val PARENB: TcflagT = 0x100
public const val PARODD: TcflagT = 0x200
public const val PENDIN: TcflagT = 0x4000
public const val POLLWRBAND: CShort = 0x200
public const val POLLWRNORM: CShort = 0x100
public const val PTHREAD_STACK_MIN: ULong = 16384uL
public const val RTLD_GLOBAL: CInt = 0x00100
public const val SA_NOCLDSTOP: CULong = 0x1uL
public const val SA_NOCLDWAIT: CULong = 0x2uL
public const val SA_SIGINFO: CULong = 0x4uL
public const val SA_NODEFER: CULong = 0x40000000uL
public const val SA_ONSTACK: CULong = 0x8000000uL
public const val SA_RESETHAND: CULong = 0x80000000uL
public const val SA_RESTART: CULong = 0x10000000uL
public const val SFD_CLOEXEC: CInt = 0x80000
public const val SFD_NONBLOCK: CInt = 0x800
public const val SIGBUS: CInt = 0x7
public const val SIGCHLD: CInt = 0x11
public const val SIGCONT: CInt = 0x12
public const val SIGIO: CInt = 0x1d
public const val SIGPROF: CInt = 0x1b
public const val SIGPWR: CInt = 0x1e
public const val SIGSTKFLT: CInt = 0x10
public const val SIGSTKSZ: ULong = 8192uL
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
public const val SIG_SETMASK: CInt = 0x2
public const val SIG_UNBLOCK: CInt = 0x1
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
public const val TOSTOP: TcflagT = 0x100
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
public const val XTABS: TcflagT = 0x1800
public const val MADV_SOFT_OFFLINE: CInt = 101
public const val SYS_restart_syscall: CLong = 0
public const val SYS_exit: CLong = 1
public const val SYS_fork: CLong = 2
public const val SYS_read: CLong = 3
public const val SYS_write: CLong = 4
public const val SYS_open: CLong = 5
public const val SYS_close: CLong = 6
public const val SYS_creat: CLong = 8
public const val SYS_link: CLong = 9
public const val SYS_unlink: CLong = 10
public const val SYS_execve: CLong = 11
public const val SYS_chdir: CLong = 12
public const val SYS_mknod: CLong = 14
public const val SYS_chmod: CLong = 15
public const val SYS_lchown: CLong = 16
public const val SYS_lseek: CLong = 19
public const val SYS_getpid: CLong = 20
public const val SYS_mount: CLong = 21
public const val SYS_setuid: CLong = 23
public const val SYS_getuid: CLong = 24
public const val SYS_ptrace: CLong = 26
public const val SYS_pause: CLong = 29
public const val SYS_access: CLong = 33
public const val SYS_nice: CLong = 34
public const val SYS_sync: CLong = 36
public const val SYS_kill: CLong = 37
public const val SYS_rename: CLong = 38
public const val SYS_mkdir: CLong = 39
public const val SYS_rmdir: CLong = 40
public const val SYS_dup: CLong = 41
public const val SYS_pipe: CLong = 42
public const val SYS_times: CLong = 43
public const val SYS_brk: CLong = 45
public const val SYS_setgid: CLong = 46
public const val SYS_getgid: CLong = 47
public const val SYS_geteuid: CLong = 49
public const val SYS_getegid: CLong = 50
public const val SYS_acct: CLong = 51
public const val SYS_umount2: CLong = 52
public const val SYS_ioctl: CLong = 54
public const val SYS_fcntl: CLong = 55
public const val SYS_setpgid: CLong = 57
public const val SYS_umask: CLong = 60
public const val SYS_chroot: CLong = 61
public const val SYS_ustat: CLong = 62
public const val SYS_dup2: CLong = 63
public const val SYS_getppid: CLong = 64
public const val SYS_getpgrp: CLong = 65
public const val SYS_setsid: CLong = 66
public const val SYS_sigaction: CLong = 67
public const val SYS_setreuid: CLong = 70
public const val SYS_setregid: CLong = 71
public const val SYS_sigsuspend: CLong = 72
public const val SYS_sigpending: CLong = 73
public const val SYS_sethostname: CLong = 74
public const val SYS_setrlimit: CLong = 75
public const val SYS_getrusage: CLong = 77
public const val SYS_gettimeofday: CLong = 78
public const val SYS_settimeofday: CLong = 79
public const val SYS_getgroups: CLong = 80
public const val SYS_setgroups: CLong = 81
public const val SYS_symlink: CLong = 83
public const val SYS_readlink: CLong = 85
public const val SYS_uselib: CLong = 86
public const val SYS_swapon: CLong = 87
public const val SYS_reboot: CLong = 88
public const val SYS_munmap: CLong = 91
public const val SYS_truncate: CLong = 92
public const val SYS_ftruncate: CLong = 93
public const val SYS_fchmod: CLong = 94
public const val SYS_fchown: CLong = 95
public const val SYS_getpriority: CLong = 96
public const val SYS_setpriority: CLong = 97
public const val SYS_statfs: CLong = 99
public const val SYS_fstatfs: CLong = 100
public const val SYS_syslog: CLong = 103
public const val SYS_setitimer: CLong = 104
public const val SYS_getitimer: CLong = 105
public const val SYS_stat: CLong = 106
public const val SYS_lstat: CLong = 107
public const val SYS_fstat: CLong = 108
public const val SYS_vhangup: CLong = 111
public const val SYS_wait4: CLong = 114
public const val SYS_swapoff: CLong = 115
public const val SYS_sysinfo: CLong = 116
public const val SYS_fsync: CLong = 118
public const val SYS_sigreturn: CLong = 119
public const val SYS_clone: CLong = 120
public const val SYS_setdomainname: CLong = 121
public const val SYS_uname: CLong = 122
public const val SYS_adjtimex: CLong = 124
public const val SYS_mprotect: CLong = 125
public const val SYS_sigprocmask: CLong = 126
public const val SYS_init_module: CLong = 128
public const val SYS_delete_module: CLong = 129
public const val SYS_quotactl: CLong = 131
public const val SYS_getpgid: CLong = 132
public const val SYS_fchdir: CLong = 133
public const val SYS_bdflush: CLong = 134
public const val SYS_sysfs: CLong = 135
public const val SYS_personality: CLong = 136
public const val SYS_setfsuid: CLong = 138
public const val SYS_setfsgid: CLong = 139
public const val SYS__llseek: CLong = 140
public const val SYS_getdents: CLong = 141
public const val SYS__newselect: CLong = 142
public const val SYS_flock: CLong = 143
public const val SYS_msync: CLong = 144
public const val SYS_readv: CLong = 145
public const val SYS_writev: CLong = 146
public const val SYS_getsid: CLong = 147
public const val SYS_fdatasync: CLong = 148
public const val SYS__sysctl: CLong = 149
public const val SYS_mlock: CLong = 150
public const val SYS_munlock: CLong = 151
public const val SYS_mlockall: CLong = 152
public const val SYS_munlockall: CLong = 153
public const val SYS_sched_setparam: CLong = 154
public const val SYS_sched_getparam: CLong = 155
public const val SYS_sched_setscheduler: CLong = 156
public const val SYS_sched_getscheduler: CLong = 157
public const val SYS_sched_yield: CLong = 158
public const val SYS_sched_get_priority_max: CLong = 159
public const val SYS_sched_get_priority_min: CLong = 160
public const val SYS_sched_rr_get_interval: CLong = 161
public const val SYS_nanosleep: CLong = 162
public const val SYS_mremap: CLong = 163
public const val SYS_setresuid: CLong = 164
public const val SYS_getresuid: CLong = 165
public const val SYS_poll: CLong = 168
public const val SYS_nfsservctl: CLong = 169
public const val SYS_setresgid: CLong = 170
public const val SYS_getresgid: CLong = 171
public const val SYS_prctl: CLong = 172
public const val SYS_rt_sigreturn: CLong = 173
public const val SYS_rt_sigaction: CLong = 174
public const val SYS_rt_sigprocmask: CLong = 175
public const val SYS_rt_sigpending: CLong = 176
public const val SYS_rt_sigtimedwait: CLong = 177
public const val SYS_rt_sigqueueinfo: CLong = 178
public const val SYS_rt_sigsuspend: CLong = 179
public const val SYS_pread64: CLong = 180
public const val SYS_pwrite64: CLong = 181
public const val SYS_chown: CLong = 182
public const val SYS_getcwd: CLong = 183
public const val SYS_capget: CLong = 184
public const val SYS_capset: CLong = 185
public const val SYS_sigaltstack: CLong = 186
public const val SYS_sendfile: CLong = 187
public const val SYS_vfork: CLong = 190
public const val SYS_ugetrlimit: CLong = 191
public const val SYS_mmap2: CLong = 192
public const val SYS_truncate64: CLong = 193
public const val SYS_ftruncate64: CLong = 194
public const val SYS_stat64: CLong = 195
public const val SYS_lstat64: CLong = 196
public const val SYS_fstat64: CLong = 197
public const val SYS_lchown32: CLong = 198
public const val SYS_getuid32: CLong = 199
public const val SYS_getgid32: CLong = 200
public const val SYS_geteuid32: CLong = 201
public const val SYS_getegid32: CLong = 202
public const val SYS_setreuid32: CLong = 203
public const val SYS_setregid32: CLong = 204
public const val SYS_getgroups32: CLong = 205
public const val SYS_setgroups32: CLong = 206
public const val SYS_fchown32: CLong = 207
public const val SYS_setresuid32: CLong = 208
public const val SYS_getresuid32: CLong = 209
public const val SYS_setresgid32: CLong = 210
public const val SYS_getresgid32: CLong = 211
public const val SYS_chown32: CLong = 212
public const val SYS_setuid32: CLong = 213
public const val SYS_setgid32: CLong = 214
public const val SYS_setfsuid32: CLong = 215
public const val SYS_setfsgid32: CLong = 216
public const val SYS_getdents64: CLong = 217
public const val SYS_pivot_root: CLong = 218
public const val SYS_mincore: CLong = 219
public const val SYS_madvise: CLong = 220
public const val SYS_fcntl64: CLong = 221
public const val SYS_gettid: CLong = 224
public const val SYS_readahead: CLong = 225
public const val SYS_setxattr: CLong = 226
public const val SYS_lsetxattr: CLong = 227
public const val SYS_fsetxattr: CLong = 228
public const val SYS_getxattr: CLong = 229
public const val SYS_lgetxattr: CLong = 230
public const val SYS_fgetxattr: CLong = 231
public const val SYS_listxattr: CLong = 232
public const val SYS_llistxattr: CLong = 233
public const val SYS_flistxattr: CLong = 234
public const val SYS_removexattr: CLong = 235
public const val SYS_lremovexattr: CLong = 236
public const val SYS_fremovexattr: CLong = 237
public const val SYS_tkill: CLong = 238
public const val SYS_sendfile64: CLong = 239
public const val SYS_futex: CLong = 240
public const val SYS_sched_setaffinity: CLong = 241
public const val SYS_sched_getaffinity: CLong = 242
public const val SYS_io_setup: CLong = 243
public const val SYS_io_destroy: CLong = 244
public const val SYS_io_getevents: CLong = 245
public const val SYS_io_submit: CLong = 246
public const val SYS_io_cancel: CLong = 247
public const val SYS_exit_group: CLong = 248
public const val SYS_lookup_dcookie: CLong = 249
public const val SYS_epoll_create: CLong = 250
public const val SYS_epoll_ctl: CLong = 251
public const val SYS_epoll_wait: CLong = 252
public const val SYS_remap_file_pages: CLong = 253
public const val SYS_set_tid_address: CLong = 256
public const val SYS_timer_create: CLong = 257
public const val SYS_timer_settime: CLong = 258
public const val SYS_timer_gettime: CLong = 259
public const val SYS_timer_getoverrun: CLong = 260
public const val SYS_timer_delete: CLong = 261
public const val SYS_clock_settime: CLong = 262
public const val SYS_clock_gettime: CLong = 263
public const val SYS_clock_getres: CLong = 264
public const val SYS_clock_nanosleep: CLong = 265
public const val SYS_statfs64: CLong = 266
public const val SYS_fstatfs64: CLong = 267
public const val SYS_tgkill: CLong = 268
public const val SYS_utimes: CLong = 269
public const val SYS_pciconfig_iobase: CLong = 271
public const val SYS_pciconfig_read: CLong = 272
public const val SYS_pciconfig_write: CLong = 273
public const val SYS_mq_open: CLong = 274
public const val SYS_mq_unlink: CLong = 275
public const val SYS_mq_timedsend: CLong = 276
public const val SYS_mq_timedreceive: CLong = 277
public const val SYS_mq_notify: CLong = 278
public const val SYS_mq_getsetattr: CLong = 279
public const val SYS_waitid: CLong = 280
public const val SYS_socket: CLong = 281
public const val SYS_bind: CLong = 282
public const val SYS_connect: CLong = 283
public const val SYS_listen: CLong = 284
public const val SYS_accept: CLong = 285
public const val SYS_getsockname: CLong = 286
public const val SYS_getpeername: CLong = 287
public const val SYS_socketpair: CLong = 288
public const val SYS_send: CLong = 289
public const val SYS_sendto: CLong = 290
public const val SYS_recv: CLong = 291
public const val SYS_recvfrom: CLong = 292
public const val SYS_shutdown: CLong = 293
public const val SYS_setsockopt: CLong = 294
public const val SYS_getsockopt: CLong = 295
public const val SYS_sendmsg: CLong = 296
public const val SYS_recvmsg: CLong = 297
public const val SYS_semop: CLong = 298
public const val SYS_semget: CLong = 299
public const val SYS_semctl: CLong = 300
public const val SYS_msgsnd: CLong = 301
public const val SYS_msgrcv: CLong = 302
public const val SYS_msgget: CLong = 303
public const val SYS_msgctl: CLong = 304
public const val SYS_shmat: CLong = 305
public const val SYS_shmdt: CLong = 306
public const val SYS_shmget: CLong = 307
public const val SYS_shmctl: CLong = 308
public const val SYS_add_key: CLong = 309
public const val SYS_request_key: CLong = 310
public const val SYS_keyctl: CLong = 311
public const val SYS_semtimedop: CLong = 312
public const val SYS_vserver: CLong = 313
public const val SYS_ioprio_set: CLong = 314
public const val SYS_ioprio_get: CLong = 315
public const val SYS_inotify_init: CLong = 316
public const val SYS_inotify_add_watch: CLong = 317
public const val SYS_inotify_rm_watch: CLong = 318
public const val SYS_mbind: CLong = 319
public const val SYS_get_mempolicy: CLong = 320
public const val SYS_set_mempolicy: CLong = 321
public const val SYS_openat: CLong = 322
public const val SYS_mkdirat: CLong = 323
public const val SYS_mknodat: CLong = 324
public const val SYS_fchownat: CLong = 325
public const val SYS_futimesat: CLong = 326
public const val SYS_fstatat64: CLong = 327
public const val SYS_unlinkat: CLong = 328
public const val SYS_renameat: CLong = 329
public const val SYS_linkat: CLong = 330
public const val SYS_symlinkat: CLong = 331
public const val SYS_readlinkat: CLong = 332
public const val SYS_fchmodat: CLong = 333
public const val SYS_faccessat: CLong = 334
public const val SYS_pselect6: CLong = 335
public const val SYS_ppoll: CLong = 336
public const val SYS_unshare: CLong = 337
public const val SYS_set_robust_list: CLong = 338
public const val SYS_get_robust_list: CLong = 339
public const val SYS_splice: CLong = 340
public const val SYS_tee: CLong = 342
public const val SYS_vmsplice: CLong = 343
public const val SYS_move_pages: CLong = 344
public const val SYS_getcpu: CLong = 345
public const val SYS_epoll_pwait: CLong = 346
public const val SYS_kexec_load: CLong = 347
public const val SYS_utimensat: CLong = 348
public const val SYS_signalfd: CLong = 349
public const val SYS_timerfd_create: CLong = 350
public const val SYS_eventfd: CLong = 351
public const val SYS_fallocate: CLong = 352
public const val SYS_timerfd_settime: CLong = 353
public const val SYS_timerfd_gettime: CLong = 354
public const val SYS_signalfd4: CLong = 355
public const val SYS_eventfd2: CLong = 356
public const val SYS_epoll_create1: CLong = 357
public const val SYS_dup3: CLong = 358
public const val SYS_pipe2: CLong = 359
public const val SYS_inotify_init1: CLong = 360
public const val SYS_preadv: CLong = 361
public const val SYS_pwritev: CLong = 362
public const val SYS_rt_tgsigqueueinfo: CLong = 363
public const val SYS_perf_event_open: CLong = 364
public const val SYS_recvmmsg: CLong = 365
public const val SYS_accept4: CLong = 366
public const val SYS_fanotify_init: CLong = 367
public const val SYS_fanotify_mark: CLong = 368
public const val SYS_prlimit64: CLong = 369
public const val SYS_name_to_handle_at: CLong = 370
public const val SYS_open_by_handle_at: CLong = 371
public const val SYS_clock_adjtime: CLong = 372
public const val SYS_syncfs: CLong = 373
public const val SYS_sendmmsg: CLong = 374
public const val SYS_setns: CLong = 375
public const val SYS_process_vm_readv: CLong = 376
public const val SYS_process_vm_writev: CLong = 377
public const val SYS_kcmp: CLong = 378
public const val SYS_finit_module: CLong = 379
public const val SYS_sched_setattr: CLong = 380
public const val SYS_sched_getattr: CLong = 381
public const val SYS_renameat2: CLong = 382
public const val SYS_seccomp: CLong = 383
public const val SYS_getrandom: CLong = 384
public const val SYS_memfd_create: CLong = 385
public const val SYS_bpf: CLong = 386
public const val SYS_execveat: CLong = 387
public const val SYS_userfaultfd: CLong = 388
public const val SYS_membarrier: CLong = 389
public const val SYS_mlock2: CLong = 390
public const val SYS_copy_file_range: CLong = 391
public const val SYS_preadv2: CLong = 392
public const val SYS_pwritev2: CLong = 393
public const val SYS_pkey_mprotect: CLong = 394
public const val SYS_pkey_alloc: CLong = 395
public const val SYS_pkey_free: CLong = 396
public const val SYS_statx: CInt = 397
public const val SYS_pidfd_send_signal: CLong = 424
public const val SYS_io_uring_setup: CLong = 425
public const val SYS_io_uring_enter: CLong = 426
public const val SYS_io_uring_register: CLong = 427
public const val SYS_open_tree: CLong = 428
public const val SYS_move_mount: CLong = 429
public const val SYS_fsopen: CLong = 430
public const val SYS_fsconfig: CLong = 431
public const val SYS_fsmount: CLong = 432
public const val SYS_fspick: CLong = 433
public const val SYS_pidfd_open: CLong = 434
public const val SYS_clone3: CLong = 435
public const val SYS_close_range: CLong = 436
public const val SYS_openat2: CLong = 437
public const val SYS_pidfd_getfd: CLong = 438
public const val SYS_faccessat2: CLong = 439
public const val SYS_process_madvise: CLong = 440
public const val SYS_epoll_pwait2: CLong = 441
public const val SYS_mount_setattr: CLong = 442
public const val SYS_quotactl_fd: CLong = 443
public const val SYS_landlock_create_ruleset: CLong = 444
public const val SYS_landlock_add_rule: CLong = 445
public const val SYS_landlock_restrict_self: CLong = 446
public const val SYS_memfd_secret: CLong = 447
public const val SYS_process_mrelease: CLong = 448
public const val SYS_futex_waitv: CLong = 449
public const val SYS_set_mempolicy_home_node: CLong = 450
