// port-lint: source unix/linux_like/linux/gnu/b64/s390x.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadMutexT

public typealias BlksizeT = Long
public typealias NlinkT = ULong
public typealias SusecondsT = Long
public typealias WcharT = Int
public typealias GregT = ULong
public typealias U64 = ULong
public typealias S64 = Long

public data class Sigaction(
    val saSigaction: ULong,
    val saFlags: Int,
    val saRestorer: io.github.kotlinmania.libc.SignalRestorer?,
    val saMask: SigsetT,
)

public data class Statfs(
    val fType: UInt,
    val fBsize: UInt,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fNamelen: UInt,
    val fFrsize: UInt,
    val fFlags: UInt,
    val fSpare: UIntArray,
)

public data class Flock(
    val lType: Short,
    val lWhence: Short,
    val lStart: Long,
    val lLen: Long,
    val lPid: Int,
)

public data class Flock64(
    val lType: Short,
    val lWhence: Short,
    val lStart: Long,
    val lLen: Long,
    val lPid: Int,
)

public data class SiginfoT(
    val handle: Long = 0L,
    val siSigno: Int,
    val siErrno: Int,
    val siCode: Int,
    val siAddr: COpaquePointer? = null,
    val siValue: Sigval? = null,
    val siPid: Int? = null,
    val siUid: UInt? = null,
    val siStatus: Int? = null,
    val siUtime: Long? = null,
    val siStime: Long? = null,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: Int,
    val ssSize: ULong,
)

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stNlink: ULong,
    val stMode: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stAtime: Int,
    val stAtimeNsec: Long,
    val stMtime: Int,
    val stMtimeNsec: Long,
    val stCtime: Int,
    val stCtimeNsec: Long,
    val stBlksize: Long,
    val stBlocks: Long,
)

public data class Stat64(
    val stDev: ULong,
    val stIno: ULong,
    val stNlink: ULong,
    val stMode: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stAtime: Int,
    val stAtimeNsec: Long,
    val stMtime: Int,
    val stMtimeNsec: Long,
    val stCtime: Int,
    val stCtimeNsec: Long,
    val stBlksize: Long,
    val stBlocks: Long,
)

public data class PthreadAttrT(
    val size: ULongArray,
)

public data class IpcPerm(
    val key: Int,
    val uid: UInt,
    val gid: UInt,
    val cuid: UInt,
    val cgid: UInt,
    val mode: UInt,
    val seq: UShort,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: Int,
    val shmDtime: Int,
    val shmCtime: Int,
    val shmCpid: Int,
    val shmLpid: Int,
    val shmNattch: ULong,
)

public data class Statvfs(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFsid: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
    val fSpare: IntArray,
)

public data class PswT(
    val mask: ULong,
    val addr: ULong,
)

public data class FpregsetT(
    val fpc: UInt,
    val fprs: List<FpregT>,
)

public data class McontextT(
    val psw: PswT,
    val gregs: ULongArray,
    val aregs: UIntArray,
    val fpregs: FpregsetT,
)

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmask: SigsetT,
)

public data class Statfs64(
    val fType: UInt,
    val fBsize: UInt,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fNamelen: UInt,
    val fFrsize: UInt,
    val fFlags: UInt,
    val fSpare: UIntArray,
)

public data class Statvfs64(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFsid: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
    val fSpare: IntArray,
)

public data class FpregT(
    val d: Double,
)

public const val POSIX_FADV_DONTNEED: Int = 6
public const val POSIX_FADV_NOREUSE: Int = 7
public const val VEOF: ULong = 4uL
public const val RTLD_DEEPBIND: Int = 0x8
public const val RTLD_GLOBAL: Int = 0x100
public const val RTLD_NOLOAD: Int = 0x4
public const val SFD_CLOEXEC: Int = 0x080000
public const val NCCS: ULong = 32uL
public const val O_TRUNC: Int = 512
public const val O_NOATIME: Int = 262144
public const val O_CLOEXEC: Int = 0x80000
public const val O_PATH: Int = 2097152
public val O_TMPFILE: Int = 4194304 or O_DIRECTORY
public const val EBFONT: Int = 59
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
public const val EDOTDOT: Int = 73
public const val SA_NODEFER: Int = 0x40000000
public const val SA_RESETHAND: Int = 0x80000000.toInt()
public const val SA_RESTART: Int = 0x10000000
public const val SA_NOCLDSTOP: Int = 0x00000001
public const val EPOLL_CLOEXEC: Int = 0x80000
public const val EFD_CLOEXEC: Int = 0x80000
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL
public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
public const val EUCLEAN: Int = 117
public const val ENOTNAM: Int = 118
public const val ENAVAIL: Int = 119
public const val EISNAM: Int = 120
public const val EREMOTEIO: Int = 121
public const val EADDRINUSE: Int = 98
public const val EADDRNOTAVAIL: Int = 99
public const val ECONNABORTED: Int = 103
public const val ECONNREFUSED: Int = 111
public const val ECONNRESET: Int = 104
public const val EDEADLK: Int = 35
public const val ENOSYS: Int = 38
public const val ENOTCONN: Int = 107
public const val ETIMEDOUT: Int = 110
public const val O_APPEND: Int = 1024
public const val O_CREAT: Int = 64
public const val O_EXCL: Int = 128
public const val O_NONBLOCK: Int = 2048
public const val SA_NOCLDWAIT: Int = 2
public const val SA_ONSTACK: Int = 0x08000000
public const val SA_SIGINFO: Int = 4
public const val SIGBUS: Int = 7
public const val SIGSTKSZ: ULong = 0x2000uL
public const val MINSIGSTKSZ: ULong = 2048uL
public const val SIG_SETMASK: Int = 2
public const val SOCK_STREAM: Int = 1
public const val SOCK_DGRAM: Int = 2
public const val O_NOCTTY: Int = 256
public const val O_SYNC: Int = 1052672
public const val O_RSYNC: Int = 1052672
public const val O_DSYNC: Int = 4096
public const val O_FSYNC: Int = 0x101000
public const val O_DIRECT: Int = 0x4000
public const val O_DIRECTORY: Int = 0x10000
public const val O_NOFOLLOW: Int = 0x20000
public const val MADV_SOFT_OFFLINE: Int = 101
public const val MAP_GROWSDOWN: Int = 0x0100
public const val MAP_LOCKED: Int = 0x02000
public const val MAP_NORESERVE: Int = 0x04000
public const val MAP_ANON: Int = 0x0020
public const val MAP_ANONYMOUS: Int = 0x0020
public const val MAP_DENYWRITE: Int = 0x0800
public const val MAP_EXECUTABLE: Int = 0x01000
public const val MAP_POPULATE: Int = 0x08000
public const val MAP_NONBLOCK: Int = 0x010000
public const val MAP_STACK: Int = 0x020000
public const val MAP_HUGETLB: Int = 0x040000
public const val MAP_SYNC: Int = 0x080000
public const val EDEADLOCK: Int = 35
public const val ENAMETOOLONG: Int = 36
public const val ENOLCK: Int = 37
public const val ENOTEMPTY: Int = 39
public const val ELOOP: Int = 40
public const val ENOMSG: Int = 42
public const val EIDRM: Int = 43
public const val ECHRNG: Int = 44
public const val EL2NSYNC: Int = 45
public const val EL3HLT: Int = 46
public const val EL3RST: Int = 47
public const val ELNRNG: Int = 48
public const val EUNATCH: Int = 49
public const val ENOCSI: Int = 50
public const val EL2HLT: Int = 51
public const val EBADE: Int = 52
public const val EBADR: Int = 53
public const val EXFULL: Int = 54
public const val ENOANO: Int = 55
public const val EBADRQC: Int = 56
public const val EBADSLT: Int = 57
public const val EMULTIHOP: Int = 72
public const val EOVERFLOW: Int = 75
public const val ENOTUNIQ: Int = 76
public const val EBADFD: Int = 77
public const val EBADMSG: Int = 74
public const val EREMCHG: Int = 78
public const val ELIBACC: Int = 79
public const val ELIBBAD: Int = 80
public const val ELIBSCN: Int = 81
public const val ELIBMAX: Int = 82
public const val ELIBEXEC: Int = 83
public const val EILSEQ: Int = 84
public const val ERESTART: Int = 85
public const val ESTRPIPE: Int = 86
public const val EUSERS: Int = 87
public const val ENOTSOCK: Int = 88
public const val EDESTADDRREQ: Int = 89
public const val EMSGSIZE: Int = 90
public const val EPROTOTYPE: Int = 91
public const val ENOPROTOOPT: Int = 92
public const val EPROTONOSUPPORT: Int = 93
public const val ESOCKTNOSUPPORT: Int = 94
public const val EOPNOTSUPP: Int = 95
public const val EPFNOSUPPORT: Int = 96
public const val EAFNOSUPPORT: Int = 97
public const val ENETDOWN: Int = 100
public const val ENETUNREACH: Int = 101
public const val ENETRESET: Int = 102
public const val ENOBUFS: Int = 105
public const val EISCONN: Int = 106
public const val ESHUTDOWN: Int = 108
public const val ETOOMANYREFS: Int = 109
public const val EHOSTDOWN: Int = 112
public const val EHOSTUNREACH: Int = 113
public const val EALREADY: Int = 114
public const val EINPROGRESS: Int = 115
public const val ESTALE: Int = 116
public const val EDQUOT: Int = 122
public const val ENOMEDIUM: Int = 123
public const val EMEDIUMTYPE: Int = 124
public const val ECANCELED: Int = 125
public const val ENOKEY: Int = 126
public const val EKEYEXPIRED: Int = 127
public const val EKEYREVOKED: Int = 128
public const val EKEYREJECTED: Int = 129
public const val EOWNERDEAD: Int = 130
public const val ENOTRECOVERABLE: Int = 131
public const val EHWPOISON: Int = 133
public const val ERFKILL: Int = 132
public const val SIGTTIN: Int = 21
public const val SIGTTOU: Int = 22
public const val SIGXCPU: Int = 24
public const val SIGXFSZ: Int = 25
public const val SIGVTALRM: Int = 26
public const val SIGPROF: Int = 27
public const val SIGWINCH: Int = 28
public const val SIGCHLD: Int = 17
public const val SIGUSR1: Int = 10
public const val SIGUSR2: Int = 12
public const val SIGCONT: Int = 18
public const val SIGSTOP: Int = 19
public const val SIGTSTP: Int = 20
public const val SIGURG: Int = 23
public const val SIGIO: Int = 29
public const val SIGSYS: Int = 31
public const val SIGSTKFLT: Int = 16
public const val SIGUNUSED: Int = 31
public const val SIGPOLL: Int = 29
public const val SIGPWR: Int = 30
public const val SIG_BLOCK: Int = 0x000000
public const val SIG_UNBLOCK: Int = 0x01
public const val O_ASYNC: Int = 0x2000
public const val O_NDELAY: Int = 0x800
public const val VEOL: ULong = 11uL
public const val VEOL2: ULong = 16uL
public const val VMIN: ULong = 6uL
public const val IEXTEN: UInt = 0x00008000u
public const val TOSTOP: UInt = 0x00000100u
public const val FLUSHO: UInt = 0x00001000u
public const val EXTPROC: UInt = 0x00010000u
public const val PTRACE_DETACH: UInt = 17u
public const val MCL_CURRENT: Int = 0x0001
public const val MCL_FUTURE: Int = 0x0002
public const val MCL_ONFAULT: Int = 0x0004
public const val EFD_NONBLOCK: Int = 0x800
public const val F_RDLCK: Int = 0
public const val F_WRLCK: Int = 1
public const val F_UNLCK: Int = 2
public const val F_GETLK: Int = 5
public const val F_GETOWN: Int = 9
public const val F_SETOWN: Int = 8
public const val F_SETLK: Int = 6
public const val F_SETLKW: Int = 7
public const val F_OFD_GETLK: Int = 36
public const val F_OFD_SETLK: Int = 37
public const val F_OFD_SETLKW: Int = 38
public const val SFD_NONBLOCK: Int = 0x0800
public const val TCSANOW: Int = 0
public const val TCSADRAIN: Int = 1
public const val TCSAFLUSH: Int = 2
public const val VTIME: ULong = 5uL
public const val VSWTC: ULong = 7uL
public const val VSTART: ULong = 8uL
public const val VSTOP: ULong = 9uL
public const val VSUSP: ULong = 10uL
public const val VREPRINT: ULong = 12uL
public const val VDISCARD: ULong = 13uL
public const val VWERASE: ULong = 14uL
public const val OLCUC: UInt = 2u
public const val ONLCR: UInt = 4u
public const val NLDLY: UInt = 256u
public const val CRDLY: UInt = 1536u
public const val CR1: UInt = 0x00000200u
public const val CR2: UInt = 0x00000400u
public const val CR3: UInt = 0x00000600u
public const val TABDLY: UInt = 6144u
public const val TAB1: UInt = 0x00000800u
public const val TAB2: UInt = 0x00001000u
public const val TAB3: UInt = 0x00001800u
public const val BSDLY: UInt = 8192u
public const val BS1: UInt = 0x00002000u
public const val FFDLY: UInt = 32768u
public const val FF1: UInt = 0x00008000u
public const val VTDLY: UInt = 16384u
public const val VT1: UInt = 0x00004000u
public const val XTABS: UInt = 6144u
public const val CBAUD: UInt = 4111u
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
public const val EXTA: UInt = B19200
public const val EXTB: UInt = B38400
public const val CSIZE: UInt = 48u
public const val CS6: UInt = 16u
public const val CS7: UInt = 32u
public const val CS8: UInt = 48u
public const val CSTOPB: UInt = 64u
public const val CREAD: UInt = 128u
public const val PARENB: UInt = 256u
public const val PARODD: UInt = 512u
public const val HUPCL: UInt = 1024u
public const val CLOCAL: UInt = 2048u
public const val CBAUDEX: UInt = 4096u
public const val B57600: UInt = 4097u
public const val B115200: UInt = 4098u
public const val B230400: UInt = 4099u
public const val B460800: UInt = 4100u
public const val B500000: UInt = 4101u
public const val B576000: UInt = 4102u
public const val B921600: UInt = 4103u
public const val B1000000: UInt = 4104u
public const val B1152000: UInt = 4105u
public const val B1500000: UInt = 4106u
public const val B2000000: UInt = 4107u
public const val B2500000: UInt = 4108u
public const val B3000000: UInt = 4109u
public const val B3500000: UInt = 4110u
public const val B4000000: UInt = 4111u
public const val CIBAUD: UInt = 269418496u
public const val ISIG: UInt = 1u
public const val ICANON: UInt = 2u
public const val ECHOE: UInt = 16u
public const val ECHOK: UInt = 32u
public const val ECHONL: UInt = 64u
public const val NOFLSH: UInt = 128u
public const val ECHOCTL: UInt = 512u
public const val ECHOPRT: UInt = 1024u
public const val ECHOKE: UInt = 2048u
public const val PENDIN: UInt = 16384u
public const val POLLWRNORM: Short = 0x100
public const val POLLWRBAND: Short = 0x200
public const val IXON: UInt = 1024u
public const val IXOFF: UInt = 4096u
public const val SYS_EXIT: Long = 1
public const val SYS_FORK: Long = 2
public const val SYS_READ: Long = 3
public const val SYS_WRITE: Long = 4
public const val SYS_OPEN: Long = 5
public const val SYS_CLOSE: Long = 6
public const val SYS_RESTART_SYSCALL: Long = 7
public const val SYS_CREAT: Long = 8
public const val SYS_LINK: Long = 9
public const val SYS_UNLINK: Long = 10
public const val SYS_EXECVE: Long = 11
public const val SYS_CHDIR: Long = 12
public const val SYS_MKNOD: Long = 14
public const val SYS_CHMOD: Long = 15
public const val SYS_LSEEK: Long = 19
public const val SYS_GETPID: Long = 20
public const val SYS_MOUNT: Long = 21
public const val SYS_UMOUNT: Long = 22
public const val SYS_PTRACE: Long = 26
public const val SYS_ALARM: Long = 27
public const val SYS_PAUSE: Long = 29
public const val SYS_UTIME: Long = 30
public const val SYS_ACCESS: Long = 33
public const val SYS_NICE: Long = 34
public const val SYS_SYNC: Long = 36
public const val SYS_KILL: Long = 37
public const val SYS_RENAME: Long = 38
public const val SYS_MKDIR: Long = 39
public const val SYS_RMDIR: Long = 40
public const val SYS_DUP: Long = 41
public const val SYS_PIPE: Long = 42
public const val SYS_TIMES: Long = 43
public const val SYS_BRK: Long = 45
public const val SYS_SIGNAL: Long = 48
public const val SYS_ACCT: Long = 51
public const val SYS_UMOUNT2: Long = 52
public const val SYS_IOCTL: Long = 54
public const val SYS_FCNTL: Long = 55
public const val SYS_SETPGID: Long = 57
public const val SYS_UMASK: Long = 60
public const val SYS_CHROOT: Long = 61
public const val SYS_USTAT: Long = 62
public const val SYS_DUP2: Long = 63
public const val SYS_GETPPID: Long = 64
public const val SYS_GETPGRP: Long = 65
public const val SYS_SETSID: Long = 66
public const val SYS_SIGACTION: Long = 67
public const val SYS_SIGSUSPEND: Long = 72
public const val SYS_SIGPENDING: Long = 73
public const val SYS_SETHOSTNAME: Long = 74
public const val SYS_SETRLIMIT: Long = 75
public const val SYS_GETRUSAGE: Long = 77
public const val SYS_GETTIMEOFDAY: Long = 78
public const val SYS_SETTIMEOFDAY: Long = 79
public const val SYS_SYMLINK: Long = 83
public const val SYS_READLINK: Long = 85
public const val SYS_USELIB: Long = 86
public const val SYS_SWAPON: Long = 87
public const val SYS_REBOOT: Long = 88
public const val SYS_READDIR: Long = 89
public const val SYS_MMAP: Long = 90
public const val SYS_MUNMAP: Long = 91
public const val SYS_TRUNCATE: Long = 92
public const val SYS_FTRUNCATE: Long = 93
public const val SYS_FCHMOD: Long = 94
public const val SYS_GETPRIORITY: Long = 96
public const val SYS_SETPRIORITY: Long = 97
public const val SYS_STATFS: Long = 99
public const val SYS_FSTATFS: Long = 100
public const val SYS_SOCKETCALL: Long = 102
public const val SYS_SYSLOG: Long = 103
public const val SYS_SETITIMER: Long = 104
public const val SYS_GETITIMER: Long = 105
public const val SYS_STAT: Long = 106
public const val SYS_LSTAT: Long = 107
public const val SYS_FSTAT: Long = 108
public const val SYS_LOOKUP_DCOOKIE: Long = 110
public const val SYS_VHANGUP: Long = 111
public const val SYS_IDLE: Long = 112
public const val SYS_WAIT4: Long = 114
public const val SYS_SWAPOFF: Long = 115
public const val SYS_SYSINFO: Long = 116
public const val SYS_IPC: Long = 117
public const val SYS_FSYNC: Long = 118
public const val SYS_SIGRETURN: Long = 119
public const val SYS_CLONE: Long = 120
public const val SYS_SETDOMAINNAME: Long = 121
public const val SYS_UNAME: Long = 122
public const val SYS_ADJTIMEX: Long = 124
public const val SYS_MPROTECT: Long = 125
public const val SYS_SIGPROCMASK: Long = 126
public const val SYS_CREATE_MODULE: Long = 127
public const val SYS_INIT_MODULE: Long = 128
public const val SYS_DELETE_MODULE: Long = 129
public const val SYS_GET_KERNEL_SYMS: Long = 130
public const val SYS_QUOTACTL: Long = 131
public const val SYS_GETPGID: Long = 132
public const val SYS_FCHDIR: Long = 133
public const val SYS_BDFLUSH: Long = 134
public const val SYS_SYSFS: Long = 135
public const val SYS_PERSONALITY: Long = 136
public const val SYS_AFS_SYSCALL: Long = 137
public const val SYS_GETDENTS: Long = 141
public const val SYS_FLOCK: Long = 143
public const val SYS_MSYNC: Long = 144
public const val SYS_READV: Long = 145
public const val SYS_WRITEV: Long = 146
public const val SYS_GETSID: Long = 147
public const val SYS_FDATASYNC: Long = 148
public const val SYS__SYSCTL: Long = 149
public const val SYS_MLOCK: Long = 150
public const val SYS_MUNLOCK: Long = 151
public const val SYS_MLOCKALL: Long = 152
public const val SYS_MUNLOCKALL: Long = 153
public const val SYS_SCHED_SETPARAM: Long = 154
public const val SYS_SCHED_GETPARAM: Long = 155
public const val SYS_SCHED_SETSCHEDULER: Long = 156
public const val SYS_SCHED_GETSCHEDULER: Long = 157
public const val SYS_SCHED_YIELD: Long = 158
public const val SYS_SCHED_GET_PRIORITY_MAX: Long = 159
public const val SYS_SCHED_GET_PRIORITY_MIN: Long = 160
public const val SYS_SCHED_RR_GET_INTERVAL: Long = 161
public const val SYS_NANOSLEEP: Long = 162
public const val SYS_MREMAP: Long = 163
public const val SYS_QUERY_MODULE: Long = 167
public const val SYS_POLL: Long = 168
public const val SYS_NFSSERVCTL: Long = 169
public const val SYS_PRCTL: Long = 172
public const val SYS_RT_SIGRETURN: Long = 173
public const val SYS_RT_SIGACTION: Long = 174
public const val SYS_RT_SIGPROCMASK: Long = 175
public const val SYS_RT_SIGPENDING: Long = 176
public const val SYS_RT_SIGTIMEDWAIT: Long = 177
public const val SYS_RT_SIGQUEUEINFO: Long = 178
public const val SYS_RT_SIGSUSPEND: Long = 179
public const val SYS_PREAD64: Long = 180
public const val SYS_PWRITE64: Long = 181
public const val SYS_GETCWD: Long = 183
public const val SYS_CAPGET: Long = 184
public const val SYS_CAPSET: Long = 185
public const val SYS_SIGALTSTACK: Long = 186
public const val SYS_SENDFILE: Long = 187
public const val SYS_GETPMSG: Long = 188
public const val SYS_PUTPMSG: Long = 189
public const val SYS_VFORK: Long = 190
public const val SYS_PIVOT_ROOT: Long = 217
public const val SYS_MINCORE: Long = 218
public const val SYS_MADVISE: Long = 219
public const val SYS_GETDENTS64: Long = 220
public const val SYS_READAHEAD: Long = 222
public const val SYS_SETXATTR: Long = 224
public const val SYS_LSETXATTR: Long = 225
public const val SYS_FSETXATTR: Long = 226
public const val SYS_GETXATTR: Long = 227
public const val SYS_LGETXATTR: Long = 228
public const val SYS_FGETXATTR: Long = 229
public const val SYS_LISTXATTR: Long = 230
public const val SYS_LLISTXATTR: Long = 231
public const val SYS_FLISTXATTR: Long = 232
public const val SYS_REMOVEXATTR: Long = 233
public const val SYS_LREMOVEXATTR: Long = 234
public const val SYS_FREMOVEXATTR: Long = 235
public const val SYS_GETTID: Long = 236
public const val SYS_TKILL: Long = 237
public const val SYS_FUTEX: Long = 238
public const val SYS_SCHED_SETAFFINITY: Long = 239
public const val SYS_SCHED_GETAFFINITY: Long = 240
public const val SYS_TGKILL: Long = 241
public const val SYS_IO_SETUP: Long = 243
public const val SYS_IO_DESTROY: Long = 244
public const val SYS_IO_GETEVENTS: Long = 245
public const val SYS_IO_SUBMIT: Long = 246
public const val SYS_IO_CANCEL: Long = 247
public const val SYS_EXIT_GROUP: Long = 248
public const val SYS_EPOLL_CREATE: Long = 249
public const val SYS_EPOLL_CTL: Long = 250
public const val SYS_EPOLL_WAIT: Long = 251
public const val SYS_SET_TID_ADDRESS: Long = 252
public const val SYS_FADVISE64: Long = 253
public const val SYS_TIMER_CREATE: Long = 254
public const val SYS_TIMER_SETTIME: Long = 255
public const val SYS_TIMER_GETTIME: Long = 256
public const val SYS_TIMER_GETOVERRUN: Long = 257
public const val SYS_TIMER_DELETE: Long = 258
public const val SYS_CLOCK_SETTIME: Long = 259
public const val SYS_CLOCK_GETTIME: Long = 260
public const val SYS_CLOCK_GETRES: Long = 261
public const val SYS_CLOCK_NANOSLEEP: Long = 262
public const val SYS_STATFS64: Long = 265
public const val SYS_FSTATFS64: Long = 266
public const val SYS_REMAP_FILE_PAGES: Long = 267
public const val SYS_MBIND: Long = 268
public const val SYS_GET_MEMPOLICY: Long = 269
public const val SYS_SET_MEMPOLICY: Long = 270
public const val SYS_MQ_OPEN: Long = 271
public const val SYS_MQ_UNLINK: Long = 272
public const val SYS_MQ_TIMEDSEND: Long = 273
public const val SYS_MQ_TIMEDRECEIVE: Long = 274
public const val SYS_MQ_NOTIFY: Long = 275
public const val SYS_MQ_GETSETATTR: Long = 276
public const val SYS_KEXEC_LOAD: Long = 277
public const val SYS_ADD_KEY: Long = 278
public const val SYS_REQUEST_KEY: Long = 279
public const val SYS_KEYCTL: Long = 280
public const val SYS_WAITID: Long = 281
public const val SYS_IOPRIO_SET: Long = 282
public const val SYS_IOPRIO_GET: Long = 283
public const val SYS_INOTIFY_INIT: Long = 284
public const val SYS_INOTIFY_ADD_WATCH: Long = 285
public const val SYS_INOTIFY_RM_WATCH: Long = 286
public const val SYS_MIGRATE_PAGES: Long = 287
public const val SYS_OPENAT: Long = 288
public const val SYS_MKDIRAT: Long = 289
public const val SYS_MKNODAT: Long = 290
public const val SYS_FCHOWNAT: Long = 291
public const val SYS_FUTIMESAT: Long = 292
public const val SYS_UNLINKAT: Long = 294
public const val SYS_RENAMEAT: Long = 295
public const val SYS_LINKAT: Long = 296
public const val SYS_SYMLINKAT: Long = 297
public const val SYS_READLINKAT: Long = 298
public const val SYS_FCHMODAT: Long = 299
public const val SYS_FACCESSAT: Long = 300
public const val SYS_PSELECT6: Long = 301
public const val SYS_PPOLL: Long = 302
public const val SYS_UNSHARE: Long = 303
public const val SYS_SET_ROBUST_LIST: Long = 304
public const val SYS_GET_ROBUST_LIST: Long = 305
public const val SYS_SPLICE: Long = 306
public const val SYS_SYNC_FILE_RANGE: Long = 307
public const val SYS_TEE: Long = 308
public const val SYS_VMSPLICE: Long = 309
public const val SYS_MOVE_PAGES: Long = 310
public const val SYS_GETCPU: Long = 311
public const val SYS_EPOLL_PWAIT: Long = 312
public const val SYS_UTIMES: Long = 313
public const val SYS_FALLOCATE: Long = 314
public const val SYS_UTIMENSAT: Long = 315
public const val SYS_SIGNALFD: Long = 316
public const val SYS_TIMERFD: Long = 317
public const val SYS_EVENTFD: Long = 318
public const val SYS_TIMERFD_CREATE: Long = 319
public const val SYS_TIMERFD_SETTIME: Long = 320
public const val SYS_TIMERFD_GETTIME: Long = 321
public const val SYS_SIGNALFD4: Long = 322
public const val SYS_EVENTFD2: Long = 323
public const val SYS_INOTIFY_INIT1: Long = 324
public const val SYS_PIPE2: Long = 325
public const val SYS_DUP3: Long = 326
public const val SYS_EPOLL_CREATE1: Long = 327
public const val SYS_PREADV: Long = 328
public const val SYS_PWRITEV: Long = 329
public const val SYS_RT_TGSIGQUEUEINFO: Long = 330
public const val SYS_PERF_EVENT_OPEN: Long = 331
public const val SYS_FANOTIFY_INIT: Long = 332
public const val SYS_FANOTIFY_MARK: Long = 333
public const val SYS_PRLIMIT64: Long = 334
public const val SYS_NAME_TO_HANDLE_AT: Long = 335
public const val SYS_OPEN_BY_HANDLE_AT: Long = 336
public const val SYS_CLOCK_ADJTIME: Long = 337
public const val SYS_SYNCFS: Long = 338
public const val SYS_SETNS: Long = 339
public const val SYS_PROCESS_VM_READV: Long = 340
public const val SYS_PROCESS_VM_WRITEV: Long = 341
public const val SYS_S390_RUNTIME_INSTR: Long = 342
public const val SYS_KCMP: Long = 343
public const val SYS_FINIT_MODULE: Long = 344
public const val SYS_SCHED_SETATTR: Long = 345
public const val SYS_SCHED_GETATTR: Long = 346
public const val SYS_RENAMEAT2: Long = 347
public const val SYS_SECCOMP: Long = 348
public const val SYS_GETRANDOM: Long = 349
public const val SYS_MEMFD_CREATE: Long = 350
public const val SYS_BPF: Long = 351
public const val SYS_S390_PCI_MMIO_WRITE: Long = 352
public const val SYS_S390_PCI_MMIO_READ: Long = 353
public const val SYS_EXECVEAT: Long = 354
public const val SYS_USERFAULTFD: Long = 355
public const val SYS_MEMBARRIER: Long = 356
public const val SYS_RECVMMSG: Long = 357
public const val SYS_SENDMMSG: Long = 358
public const val SYS_SOCKET: Long = 359
public const val SYS_SOCKETPAIR: Long = 360
public const val SYS_BIND: Long = 361
public const val SYS_CONNECT: Long = 362
public const val SYS_LISTEN: Long = 363
public const val SYS_ACCEPT4: Long = 364
public const val SYS_GETSOCKOPT: Long = 365
public const val SYS_SETSOCKOPT: Long = 366
public const val SYS_GETSOCKNAME: Long = 367
public const val SYS_GETPEERNAME: Long = 368
public const val SYS_SENDTO: Long = 369
public const val SYS_SENDMSG: Long = 370
public const val SYS_RECVFROM: Long = 371
public const val SYS_RECVMSG: Long = 372
public const val SYS_SHUTDOWN: Long = 373
public const val SYS_MLOCK2: Long = 374
public const val SYS_COPY_FILE_RANGE: Long = 375
public const val SYS_PREADV2: Long = 376
public const val SYS_PWRITEV2: Long = 377
public const val SYS_LCHOWN: Long = 198
public const val SYS_SETUID: Long = 213
public const val SYS_GETUID: Long = 199
public const val SYS_SETGID: Long = 214
public const val SYS_GETGID: Long = 200
public const val SYS_GETEUID: Long = 201
public const val SYS_SETREUID: Long = 203
public const val SYS_SETREGID: Long = 204
public const val SYS_GETRLIMIT: Long = 191
public const val SYS_GETGROUPS: Long = 205
public const val SYS_FCHOWN: Long = 207
public const val SYS_SETRESUID: Long = 208
public const val SYS_SETRESGID: Long = 210
public const val SYS_GETRESGID: Long = 211
public const val SYS_SELECT: Long = 142
public const val SYS_GETEGID: Long = 202
public const val SYS_SETGROUPS: Long = 206
public const val SYS_GETRESUID: Long = 209
public const val SYS_CHOWN: Long = 212
public const val SYS_SETFSUID: Long = 215
public const val SYS_SETFSGID: Long = 216
public const val SYS_NEWFSTATAT: Long = 293
public const val SYS_STATX: Long = 379
public const val SYS_RSEQ: Long = 383
public const val SYS_PIDFD_SEND_SIGNAL: Long = 424
public const val SYS_IO_URING_SETUP: Long = 425
public const val SYS_IO_URING_ENTER: Long = 426
public const val SYS_IO_URING_REGISTER: Long = 427
public const val SYS_OPEN_TREE: Long = 428
public const val SYS_MOVE_MOUNT: Long = 429
public const val SYS_FSOPEN: Long = 430
public const val SYS_FSCONFIG: Long = 431
public const val SYS_FSMOUNT: Long = 432
public const val SYS_FSPICK: Long = 433
public const val SYS_PIDFD_OPEN: Long = 434
public const val SYS_CLONE3: Long = 435
public const val SYS_CLOSE_RANGE: Long = 436
public const val SYS_OPENAT2: Long = 437
public const val SYS_PIDFD_GETFD: Long = 438
public const val SYS_FACCESSAT2: Long = 439
public const val SYS_PROCESS_MADVISE: Long = 440
public const val SYS_EPOLL_PWAIT2: Long = 441
public const val SYS_MOUNT_SETATTR: Long = 442
public const val SYS_QUOTACTL_FD: Long = 443
public const val SYS_LANDLOCK_CREATE_RULESET: Long = 444
public const val SYS_LANDLOCK_ADD_RULE: Long = 445
public const val SYS_LANDLOCK_RESTRICT_SELF: Long = 446
public const val SYS_MEMFD_SECRET: Long = 447
public const val SYS_PROCESS_MRELEASE: Long = 448
public const val SYS_FUTEX_WAITV: Long = 449
public const val SYS_SET_MEMPOLICY_HOME_NODE: Long = 450
public const val SYS_MSEAL: Long = 462

public expect fun sysctl(name: Int?, namelen: Int, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int

public expect fun getcontext(ucp: UcontextT?): Int

public expect fun setcontext(ucp: UcontextT?): Int

public expect fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: Int, vararg args: Any?)

public expect fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): Int
