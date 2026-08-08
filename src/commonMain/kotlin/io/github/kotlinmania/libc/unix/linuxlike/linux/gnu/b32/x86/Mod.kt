// port-lint: source unix/linux_like/linux/gnu/b32/x86/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public typealias WcharT = Int
public typealias GregT = Int

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
    val saRestorer: (() -> Unit)?,
)

public data class Statfs(
    val fType: FswordT,
    val fBsize: FswordT,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFsid: FsidT,
    val fNamelen: FswordT,
    val fFrsize: FswordT,
    val fFlags: FswordT,
    val fSpare: List<FswordT>,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
)

public data class Flock64(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: Off64T,
    val lLen: Off64T,
    val lPid: PidT,
)

public data class LibcFpreg(
    val significand: UShortArray,
    val exponent: UShort,
)

public data class LibcFpstate(
    val cw: CULong,
    val sw: CULong,
    val tag: CULong,
    val ipoff: CULong,
    val cssel: CULong,
    val dataoff: CULong,
    val datasel: CULong,
    val st: List<LibcFpreg>,
    val status: CULong,
)

public data class UserFpregsStruct(
    val cwd: CLong,
    val swd: CLong,
    val twd: CLong,
    val fip: CLong,
    val fcs: CLong,
    val foo: CLong,
    val fos: CLong,
    val stSpace: LongArray,
)

public data class UserRegsStruct(
    val ebx: CLong,
    val ecx: CLong,
    val edx: CLong,
    val esi: CLong,
    val edi: CLong,
    val ebp: CLong,
    val eax: CLong,
    val xds: CLong,
    val xes: CLong,
    val xfs: CLong,
    val xgs: CLong,
    val origEax: CLong,
    val eip: CLong,
    val xcs: CLong,
    val eflags: CLong,
    val esp: CLong,
    val xss: CLong,
)

public data class User(
    val regs: UserRegsStruct,
    val uFpvalid: CInt,
    val i387: UserFpregsStruct,
    val uTsize: CULong,
    val uDsize: CULong,
    val uSsize: CULong,
    val startCode: CULong,
    val startStack: CULong,
    val signal: CLong,
    val uAr0: UserRegsStruct?,
    val uFpstate: UserFpregsStruct?,
    val magic: CULong,
    val uComm: ByteArray,
    val uDebugreg: IntArray,
)

public data class McontextT(
    val gregs: List<GregT>,
    val fpregs: LibcFpstate?,
    val oldmask: CULong,
    val cr2: CULong,
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

public data class Stat64(
    val stDev: DevT,
    val stIno: CULong,
    val stIno2: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: Off64T,
    val stBlksize: BlksizeT,
    val stBlocks: Blkcnt64T,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stIno3: Ino64T,
)

public data class Statfs64(
    val fType: FswordT,
    val fBsize: FswordT,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: FsidT,
    val fNamelen: FswordT,
    val fFrsize: FswordT,
    val fFlags: FswordT,
    val fSpare: List<FswordT>,
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

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val pad: IntArray,
    val align: List<ULong>,
    val siAddr: COpaquePointer? = null,
    val siValue: Sigval? = null,
    val siPid: PidT? = null,
    val siUid: UidT? = null,
    val siStatus: CInt? = null,
    val siUtime: CLong? = null,
    val siStime: CLong? = null,
) {
    public fun siAddr(): COpaquePointer? = siAddr
    public fun siValue(): Sigval? = siValue
    public fun siPid(): PidT = siPid ?: 0
    public fun siUid(): UidT = siUid ?: 0u
    public fun siStatus(): CInt = siStatus ?: 0
    public fun siUtime(): CLong = siUtime ?: 0L
    public fun siStime(): CLong = siStime ?: 0L
}

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
)

public data class UserFpxregsStruct(
    val cwd: CUShort,
    val swd: CUShort,
    val twd: CUShort,
    val fop: CUShort,
    val fip: CLong,
    val fcs: CLong,
    val foo: CLong,
    val fos: CLong,
    val mxcsr: CLong,
    val stSpace: LongArray,
    val xmmSpace: LongArray,
)

public data class UcontextT(
    val ucFlags: CULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmask: SigsetT,
    val private: UByteArray,
    val ssp: ULongArray,
)

public data class MaxAlignT(
    val priv: List<Double>,
)

public const val VEOF: ULong = 4uL
public const val RTLD_DEEPBIND: CInt = 0x8
public const val RTLD_GLOBAL: CInt = 0x100
public const val RTLD_NOLOAD: CInt = 0x4
public const val O_DIRECT: CInt = 0x4000
public const val O_DIRECTORY: CInt = 0x10000
public const val O_NOFOLLOW: CInt = 0x20000
public const val O_LARGEFILE: CInt = 32768
public const val O_APPEND: CInt = 1024
public const val O_CREAT: CInt = 64
public const val O_EXCL: CInt = 128
public const val O_NOCTTY: CInt = 256
public const val O_NONBLOCK: CInt = 2048
public const val O_SYNC: CInt = 1052672
public const val O_RSYNC: CInt = 1052672
public const val O_DSYNC: CInt = 4096
public const val O_FSYNC: CInt = 0x101000
public const val O_ASYNC: CInt = 0x2000
public const val O_NDELAY: CInt = 0x800
public const val MADV_SOFT_OFFLINE: CInt = 101
public const val MAP_LOCKED: CInt = 0x02000
public const val MAP_NORESERVE: CInt = 0x04000
public const val MAP_32BIT: CInt = 0x0040
public const val MAP_ANON: CInt = 0x0020
public const val MAP_ANONYMOUS: CInt = 0x0020
public const val MAP_DENYWRITE: CInt = 0x0800
public const val MAP_EXECUTABLE: CInt = 0x01000
public const val MAP_POPULATE: CInt = 0x08000
public const val MAP_NONBLOCK: CInt = 0x010000
public const val MAP_STACK: CInt = 0x020000
public const val MAP_HUGETLB: CInt = 0x040000
public const val MAP_GROWSDOWN: CInt = 0x0100
public const val MAP_SYNC: CInt = 0x080000
public const val EDEADLOCK: CInt = 35
public const val EUCLEAN: CInt = 117
public const val ENOTNAM: CInt = 118
public const val ENAVAIL: CInt = 119
public const val EISNAM: CInt = 120
public const val EREMOTEIO: CInt = 121
public const val EDEADLK: CInt = 35
public const val ENAMETOOLONG: CInt = 36
public const val ENOLCK: CInt = 37
public const val ENOSYS: CInt = 38
public const val ENOTEMPTY: CInt = 39
public const val ELOOP: CInt = 40
public const val ENOMSG: CInt = 42
public const val EIDRM: CInt = 43
public const val ECHRNG: CInt = 44
public const val EL2NSYNC: CInt = 45
public const val EL3HLT: CInt = 46
public const val EL3RST: CInt = 47
public const val ELNRNG: CInt = 48
public const val EUNATCH: CInt = 49
public const val ENOCSI: CInt = 50
public const val EL2HLT: CInt = 51
public const val EBADE: CInt = 52
public const val EBADR: CInt = 53
public const val EXFULL: CInt = 54
public const val ENOANO: CInt = 55
public const val EBADRQC: CInt = 56
public const val EBADSLT: CInt = 57
public const val EMULTIHOP: CInt = 72
public const val EOVERFLOW: CInt = 75
public const val ENOTUNIQ: CInt = 76
public const val EBADFD: CInt = 77
public const val EBADMSG: CInt = 74
public const val EREMCHG: CInt = 78
public const val ELIBACC: CInt = 79
public const val ELIBBAD: CInt = 80
public const val ELIBSCN: CInt = 81
public const val ELIBMAX: CInt = 82
public const val ELIBEXEC: CInt = 83
public const val EILSEQ: CInt = 84
public const val ERESTART: CInt = 85
public const val ESTRPIPE: CInt = 86
public const val EUSERS: CInt = 87
public const val ENOTSOCK: CInt = 88
public const val EDESTADDRREQ: CInt = 89
public const val EMSGSIZE: CInt = 90
public const val EPROTOTYPE: CInt = 91
public const val ENOPROTOOPT: CInt = 92
public const val EPROTONOSUPPORT: CInt = 93
public const val ESOCKTNOSUPPORT: CInt = 94
public const val EOPNOTSUPP: CInt = 95
public const val EPFNOSUPPORT: CInt = 96
public const val EAFNOSUPPORT: CInt = 97
public const val EADDRINUSE: CInt = 98
public const val EADDRNOTAVAIL: CInt = 99
public const val ENETDOWN: CInt = 100
public const val ENETUNREACH: CInt = 101
public const val ENETRESET: CInt = 102
public const val ECONNABORTED: CInt = 103
public const val ECONNRESET: CInt = 104
public const val ENOBUFS: CInt = 105
public const val EISCONN: CInt = 106
public const val ENOTCONN: CInt = 107
public const val ESHUTDOWN: CInt = 108
public const val ETOOMANYREFS: CInt = 109
public const val ETIMEDOUT: CInt = 110
public const val ECONNREFUSED: CInt = 111
public const val EHOSTDOWN: CInt = 112
public const val EHOSTUNREACH: CInt = 113
public const val EALREADY: CInt = 114
public const val EINPROGRESS: CInt = 115
public const val ESTALE: CInt = 116
public const val EDQUOT: CInt = 122
public const val ENOMEDIUM: CInt = 123
public const val EMEDIUMTYPE: CInt = 124
public const val ECANCELED: CInt = 125
public const val ENOKEY: CInt = 126
public const val EKEYEXPIRED: CInt = 127
public const val EKEYREVOKED: CInt = 128
public const val EKEYREJECTED: CInt = 129
public const val EOWNERDEAD: CInt = 130
public const val ENOTRECOVERABLE: CInt = 131
public const val EHWPOISON: CInt = 133
public const val ERFKILL: CInt = 132
public const val SA_SIGINFO: CInt = 0x00000004
public const val SA_NOCLDWAIT: CInt = 0x00000002
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val F_GETLK: CInt = 12
public const val F_GETOWN: CInt = 9
public const val F_SETOWN: CInt = 8
public const val PTRACE_GETFPXREGS: CUInt = 18u
public const val PTRACE_SETFPXREGS: CUInt = 19u
public const val PTRACE_SYSEMU: CUInt = 31u
public const val PTRACE_SYSEMU_SINGLESTEP: CUInt = 32u
public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val MCL_ONFAULT: CInt = 0x0004
public const val POLLWRNORM: CShort = 0x100
public const val POLLWRBAND: CShort = 0x200
public const val EFD_NONBLOCK: CInt = 0x800
public const val SFD_NONBLOCK: CInt = 0x0800
public const val SIGCHLD: CInt = 17
public const val SIGBUS: CInt = 7
public const val SIGUSR1: CInt = 10
public const val SIGUSR2: CInt = 12
public const val SIGCONT: CInt = 18
public const val SIGSTOP: CInt = 19
public const val SIGTSTP: CInt = 20
public const val SIGURG: CInt = 23
public const val SIGIO: CInt = 29
public const val SIGSYS: CInt = 31
public const val SIGSTKFLT: CInt = 16
public const val SIGUNUSED: CInt = 31
public const val SIGPOLL: CInt = 29
public const val SIGPWR: CInt = 30
public const val SIG_SETMASK: CInt = 2
public const val SIG_BLOCK: CInt = 0x000000
public const val SIG_UNBLOCK: CInt = 0x01
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGWINCH: CInt = 28
public const val SIGSTKSZ: ULong = 8192uL
public const val MINSIGSTKSZ: ULong = 2048uL
public const val CBAUD: TcflagT = 4111u
public const val TAB1: TcflagT = 0x00000800u
public const val TAB2: TcflagT = 0x00001000u
public const val TAB3: TcflagT = 0x00001800u
public const val CR1: TcflagT = 0x00000200u
public const val CR2: TcflagT = 0x00000400u
public const val CR3: TcflagT = 0x00000600u
public const val FF1: TcflagT = 0x00008000u
public const val BS1: TcflagT = 0x00002000u
public const val VT1: TcflagT = 0x00004000u
public const val VWERASE: ULong = 14uL
public const val VREPRINT: ULong = 12uL
public const val VSUSP: ULong = 10uL
public const val VSTART: ULong = 8uL
public const val VSTOP: ULong = 9uL
public const val VDISCARD: ULong = 13uL
public const val VTIME: ULong = 5uL
public const val IXON: TcflagT = 0x00000400u
public const val IXOFF: TcflagT = 0x00001000u
public const val ONLCR: TcflagT = 0x4u
public const val CSIZE: TcflagT = 0x00000030u
public const val CS6: TcflagT = 0x00000010u
public const val CS7: TcflagT = 0x00000020u
public const val CS8: TcflagT = 0x00000030u
public const val CSTOPB: TcflagT = 0x00000040u
public const val CREAD: TcflagT = 0x00000080u
public const val PARENB: TcflagT = 0x00000100u
public const val PARODD: TcflagT = 0x00000200u
public const val HUPCL: TcflagT = 0x00000400u
public const val CLOCAL: TcflagT = 0x00000800u
public const val ECHOKE: TcflagT = 0x00000800u
public const val ECHOE: TcflagT = 0x00000010u
public const val ECHOK: TcflagT = 0x00000020u
public const val ECHONL: TcflagT = 0x00000040u
public const val ECHOPRT: TcflagT = 0x00000400u
public const val ECHOCTL: TcflagT = 0x00000200u
public const val ISIG: TcflagT = 0x00000001u
public const val ICANON: TcflagT = 0x00000002u
public const val PENDIN: TcflagT = 0x00004000u
public const val NOFLSH: TcflagT = 0x00000080u
public const val CIBAUD: TcflagT = 269418496u
public const val CBAUDEX: TcflagT = 4096u
public const val VSWTC: ULong = 7uL
public const val OLCUC: TcflagT = 2u
public const val NLDLY: TcflagT = 256u
public const val CRDLY: TcflagT = 1536u
public const val TABDLY: TcflagT = 6144u
public const val BSDLY: TcflagT = 8192u
public const val FFDLY: TcflagT = 32768u
public const val VTDLY: TcflagT = 16384u
public const val XTABS: TcflagT = 6144u
public const val B0: SpeedT = 0u
public const val B50: SpeedT = 1u
public const val B75: SpeedT = 2u
public const val B110: SpeedT = 3u
public const val B134: SpeedT = 4u
public const val B150: SpeedT = 5u
public const val B200: SpeedT = 6u
public const val B300: SpeedT = 7u
public const val B600: SpeedT = 8u
public const val B1200: SpeedT = 9u
public const val B1800: SpeedT = 10u
public const val B2400: SpeedT = 11u
public const val B4800: SpeedT = 12u
public const val B9600: SpeedT = 13u
public const val B19200: SpeedT = 14u
public const val B38400: SpeedT = 15u
public const val EXTA: SpeedT = B19200
public const val EXTB: SpeedT = B38400
public const val B57600: SpeedT = 4097u
public const val B115200: SpeedT = 4098u
public const val B230400: SpeedT = 4099u
public const val B460800: SpeedT = 4100u
public const val B500000: SpeedT = 4101u
public const val B576000: SpeedT = 4102u
public const val B921600: SpeedT = 4103u
public const val B1000000: SpeedT = 4104u
public const val B1152000: SpeedT = 4105u
public const val B1500000: SpeedT = 4106u
public const val B2000000: SpeedT = 4107u
public const val B2500000: SpeedT = 4108u
public const val B3000000: SpeedT = 4109u
public const val B3500000: SpeedT = 4110u
public const val B4000000: SpeedT = 4111u
public const val VEOL: ULong = 11uL
public const val VEOL2: ULong = 16uL
public const val VMIN: ULong = 6uL
public const val IEXTEN: TcflagT = 0x00008000u
public const val TOSTOP: TcflagT = 0x00000100u
public const val FLUSHO: TcflagT = 0x00001000u
public const val EXTPROC: TcflagT = 0x00010000u
public const val TCSANOW: CInt = 0
public const val TCSADRAIN: CInt = 1
public const val TCSAFLUSH: CInt = 2
public const val SYS_restart_syscall: CLong = 0
public const val SYS_exit: CLong = 1
public const val SYS_fork: CLong = 2
public const val SYS_read: CLong = 3
public const val SYS_write: CLong = 4
public const val SYS_open: CLong = 5
public const val SYS_close: CLong = 6
public const val SYS_waitpid: CLong = 7
public const val SYS_creat: CLong = 8
public const val SYS_link: CLong = 9
public const val SYS_unlink: CLong = 10
public const val SYS_execve: CLong = 11
public const val SYS_chdir: CLong = 12
public const val SYS_time: CLong = 13
public const val SYS_mknod: CLong = 14
public const val SYS_chmod: CLong = 15
public const val SYS_lchown: CLong = 16
public const val SYS_break: CLong = 17
public const val SYS_oldstat: CLong = 18
public const val SYS_lseek: CLong = 19
public const val SYS_getpid: CLong = 20
public const val SYS_mount: CLong = 21
public const val SYS_umount: CLong = 22
public const val SYS_setuid: CLong = 23
public const val SYS_getuid: CLong = 24
public const val SYS_stime: CLong = 25
public const val SYS_ptrace: CLong = 26
public const val SYS_alarm: CLong = 27
public const val SYS_oldfstat: CLong = 28
public const val SYS_pause: CLong = 29
public const val SYS_utime: CLong = 30
public const val SYS_stty: CLong = 31
public const val SYS_gtty: CLong = 32
public const val SYS_access: CLong = 33
public const val SYS_nice: CLong = 34
public const val SYS_ftime: CLong = 35
public const val SYS_sync: CLong = 36
public const val SYS_kill: CLong = 37
public const val SYS_rename: CLong = 38
public const val SYS_mkdir: CLong = 39
public const val SYS_rmdir: CLong = 40
public const val SYS_dup: CLong = 41
public const val SYS_pipe: CLong = 42
public const val SYS_times: CLong = 43
public const val SYS_prof: CLong = 44
public const val SYS_brk: CLong = 45
public const val SYS_setgid: CLong = 46
public const val SYS_getgid: CLong = 47
public const val SYS_signal: CLong = 48
public const val SYS_geteuid: CLong = 49
public const val SYS_getegid: CLong = 50
public const val SYS_acct: CLong = 51
public const val SYS_umount2: CLong = 52
public const val SYS_lock: CLong = 53
public const val SYS_ioctl: CLong = 54
public const val SYS_fcntl: CLong = 55
public const val SYS_mpx: CLong = 56
public const val SYS_setpgid: CLong = 57
public const val SYS_ulimit: CLong = 58
public const val SYS_oldolduname: CLong = 59
public const val SYS_umask: CLong = 60
public const val SYS_chroot: CLong = 61
public const val SYS_ustat: CLong = 62
public const val SYS_dup2: CLong = 63
public const val SYS_getppid: CLong = 64
public const val SYS_getpgrp: CLong = 65
public const val SYS_setsid: CLong = 66
public const val SYS_sigaction: CLong = 67
public const val SYS_sgetmask: CLong = 68
public const val SYS_ssetmask: CLong = 69
public const val SYS_setreuid: CLong = 70
public const val SYS_setregid: CLong = 71
public const val SYS_sigsuspend: CLong = 72
public const val SYS_sigpending: CLong = 73
public const val SYS_sethostname: CLong = 74
public const val SYS_setrlimit: CLong = 75
public const val SYS_getrlimit: CLong = 76
public const val SYS_getrusage: CLong = 77
public const val SYS_gettimeofday: CLong = 78
public const val SYS_settimeofday: CLong = 79
public const val SYS_getgroups: CLong = 80
public const val SYS_setgroups: CLong = 81
public const val SYS_select: CLong = 82
public const val SYS_symlink: CLong = 83
public const val SYS_oldlstat: CLong = 84
public const val SYS_readlink: CLong = 85
public const val SYS_uselib: CLong = 86
public const val SYS_swapon: CLong = 87
public const val SYS_reboot: CLong = 88
public const val SYS_readdir: CLong = 89
public const val SYS_mmap: CLong = 90
public const val SYS_munmap: CLong = 91
public const val SYS_truncate: CLong = 92
public const val SYS_ftruncate: CLong = 93
public const val SYS_fchmod: CLong = 94
public const val SYS_fchown: CLong = 95
public const val SYS_getpriority: CLong = 96
public const val SYS_setpriority: CLong = 97
public const val SYS_profil: CLong = 98
public const val SYS_statfs: CLong = 99
public const val SYS_fstatfs: CLong = 100
public const val SYS_ioperm: CLong = 101
public const val SYS_socketcall: CLong = 102
public const val SYS_syslog: CLong = 103
public const val SYS_setitimer: CLong = 104
public const val SYS_getitimer: CLong = 105
public const val SYS_stat: CLong = 106
public const val SYS_lstat: CLong = 107
public const val SYS_fstat: CLong = 108
public const val SYS_olduname: CLong = 109
public const val SYS_iopl: CLong = 110
public const val SYS_vhangup: CLong = 111
public const val SYS_idle: CLong = 112
public const val SYS_vm86old: CLong = 113
public const val SYS_wait4: CLong = 114
public const val SYS_swapoff: CLong = 115
public const val SYS_sysinfo: CLong = 116
public const val SYS_ipc: CLong = 117
public const val SYS_fsync: CLong = 118
public const val SYS_sigreturn: CLong = 119
public const val SYS_clone: CLong = 120
public const val SYS_setdomainname: CLong = 121
public const val SYS_uname: CLong = 122
public const val SYS_modify_ldt: CLong = 123
public const val SYS_adjtimex: CLong = 124
public const val SYS_mprotect: CLong = 125
public const val SYS_sigprocmask: CLong = 126
public const val SYS_create_module: CLong = 127
public const val SYS_init_module: CLong = 128
public const val SYS_delete_module: CLong = 129
public const val SYS_get_kernel_syms: CLong = 130
public const val SYS_quotactl: CLong = 131
public const val SYS_getpgid: CLong = 132
public const val SYS_fchdir: CLong = 133
public const val SYS_bdflush: CLong = 134
public const val SYS_sysfs: CLong = 135
public const val SYS_personality: CLong = 136
public const val SYS_afs_syscall: CLong = 137
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
public const val SYS_vm86: CLong = 166
public const val SYS_query_module: CLong = 167
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
public const val SYS_getpmsg: CLong = 188
public const val SYS_putpmsg: CLong = 189
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
public const val SYS_pivot_root: CLong = 217
public const val SYS_mincore: CLong = 218
public const val SYS_madvise: CLong = 219
public const val SYS_getdents64: CLong = 220
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
public const val SYS_set_thread_area: CLong = 243
public const val SYS_get_thread_area: CLong = 244
public const val SYS_io_setup: CLong = 245
public const val SYS_io_destroy: CLong = 246
public const val SYS_io_getevents: CLong = 247
public const val SYS_io_submit: CLong = 248
public const val SYS_io_cancel: CLong = 249
public const val SYS_fadvise64: CLong = 250
public const val SYS_exit_group: CLong = 252
public const val SYS_lookup_dcookie: CLong = 253
public const val SYS_epoll_create: CLong = 254
public const val SYS_epoll_ctl: CLong = 255
public const val SYS_epoll_wait: CLong = 256
public const val SYS_remap_file_pages: CLong = 257
public const val SYS_set_tid_address: CLong = 258
public const val SYS_timer_create: CLong = 259
public const val SYS_timer_settime: CLong = 260
public const val SYS_timer_gettime: CLong = 261
public const val SYS_timer_getoverrun: CLong = 262
public const val SYS_timer_delete: CLong = 263
public const val SYS_clock_settime: CLong = 264
public const val SYS_clock_gettime: CLong = 265
public const val SYS_clock_getres: CLong = 266
public const val SYS_clock_nanosleep: CLong = 267
public const val SYS_statfs64: CLong = 268
public const val SYS_fstatfs64: CLong = 269
public const val SYS_tgkill: CLong = 270
public const val SYS_utimes: CLong = 271
public const val SYS_fadvise64_64: CLong = 272
public const val SYS_vserver: CLong = 273
public const val SYS_mbind: CLong = 274
public const val SYS_get_mempolicy: CLong = 275
public const val SYS_set_mempolicy: CLong = 276
public const val SYS_mq_open: CLong = 277
public const val SYS_mq_unlink: CLong = 278
public const val SYS_mq_timedsend: CLong = 279
public const val SYS_mq_timedreceive: CLong = 280
public const val SYS_mq_notify: CLong = 281
public const val SYS_mq_getsetattr: CLong = 282
public const val SYS_kexec_load: CLong = 283
public const val SYS_waitid: CLong = 284
public const val SYS_add_key: CLong = 286
public const val SYS_request_key: CLong = 287
public const val SYS_keyctl: CLong = 288
public const val SYS_ioprio_set: CLong = 289
public const val SYS_ioprio_get: CLong = 290
public const val SYS_inotify_init: CLong = 291
public const val SYS_inotify_add_watch: CLong = 292
public const val SYS_inotify_rm_watch: CLong = 293
public const val SYS_migrate_pages: CLong = 294
public const val SYS_openat: CLong = 295
public const val SYS_mkdirat: CLong = 296
public const val SYS_mknodat: CLong = 297
public const val SYS_fchownat: CLong = 298
public const val SYS_futimesat: CLong = 299
public const val SYS_fstatat64: CLong = 300
public const val SYS_unlinkat: CLong = 301
public const val SYS_renameat: CLong = 302
public const val SYS_linkat: CLong = 303
public const val SYS_symlinkat: CLong = 304
public const val SYS_readlinkat: CLong = 305
public const val SYS_fchmodat: CLong = 306
public const val SYS_faccessat: CLong = 307
public const val SYS_pselect6: CLong = 308
public const val SYS_ppoll: CLong = 309
public const val SYS_unshare: CLong = 310
public const val SYS_set_robust_list: CLong = 311
public const val SYS_get_robust_list: CLong = 312
public const val SYS_splice: CLong = 313
public const val SYS_sync_file_range: CLong = 314
public const val SYS_tee: CLong = 315
public const val SYS_vmsplice: CLong = 316
public const val SYS_move_pages: CLong = 317
public const val SYS_getcpu: CLong = 318
public const val SYS_epoll_pwait: CLong = 319
public const val SYS_utimensat: CLong = 320
public const val SYS_signalfd: CLong = 321
public const val SYS_timerfd_create: CLong = 322
public const val SYS_eventfd: CLong = 323
public const val SYS_fallocate: CLong = 324
public const val SYS_timerfd_settime: CLong = 325
public const val SYS_timerfd_gettime: CLong = 326
public const val SYS_signalfd4: CLong = 327
public const val SYS_eventfd2: CLong = 328
public const val SYS_epoll_create1: CLong = 329
public const val SYS_dup3: CLong = 330
public const val SYS_pipe2: CLong = 331
public const val SYS_inotify_init1: CLong = 332
public const val SYS_preadv: CLong = 333
public const val SYS_pwritev: CLong = 334
public const val SYS_rt_tgsigqueueinfo: CLong = 335
public const val SYS_perf_event_open: CLong = 336
public const val SYS_recvmmsg: CLong = 337
public const val SYS_fanotify_init: CLong = 338
public const val SYS_fanotify_mark: CLong = 339
public const val SYS_prlimit64: CLong = 340
public const val SYS_name_to_handle_at: CLong = 341
public const val SYS_open_by_handle_at: CLong = 342
public const val SYS_clock_adjtime: CLong = 343
public const val SYS_syncfs: CLong = 344
public const val SYS_sendmmsg: CLong = 345
public const val SYS_setns: CLong = 346
public const val SYS_process_vm_readv: CLong = 347
public const val SYS_process_vm_writev: CLong = 348
public const val SYS_kcmp: CLong = 349
public const val SYS_finit_module: CLong = 350
public const val SYS_sched_setattr: CLong = 351
public const val SYS_sched_getattr: CLong = 352
public const val SYS_renameat2: CLong = 353
public const val SYS_seccomp: CLong = 354
public const val SYS_getrandom: CLong = 355
public const val SYS_memfd_create: CLong = 356
public const val SYS_bpf: CLong = 357
public const val SYS_execveat: CLong = 358
public const val SYS_socket: CLong = 359
public const val SYS_socketpair: CLong = 360
public const val SYS_bind: CLong = 361
public const val SYS_connect: CLong = 362
public const val SYS_listen: CLong = 363
public const val SYS_accept4: CLong = 364
public const val SYS_getsockopt: CLong = 365
public const val SYS_setsockopt: CLong = 366
public const val SYS_getsockname: CLong = 367
public const val SYS_getpeername: CLong = 368
public const val SYS_sendto: CLong = 369
public const val SYS_sendmsg: CLong = 370
public const val SYS_recvfrom: CLong = 371
public const val SYS_recvmsg: CLong = 372
public const val SYS_shutdown: CLong = 373
public const val SYS_userfaultfd: CLong = 374
public const val SYS_membarrier: CLong = 375
public const val SYS_mlock2: CLong = 376
public const val SYS_copy_file_range: CLong = 377
public const val SYS_preadv2: CLong = 378
public const val SYS_pwritev2: CLong = 379
public const val SYS_pkey_mprotect: CLong = 380
public const val SYS_pkey_alloc: CLong = 381
public const val SYS_pkey_free: CLong = 382
public const val SYS_statx: CLong = 383
public const val SYS_rseq: CLong = 386
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
public const val SYS_fchmodat2: CLong = 452
public const val SYS_mseal: CLong = 462
public const val EBX: CInt = 0
public const val ECX: CInt = 1
public const val EDX: CInt = 2
public const val ESI: CInt = 3
public const val EDI: CInt = 4
public const val EBP: CInt = 5
public const val EAX: CInt = 6
public const val DS: CInt = 7
public const val ES: CInt = 8
public const val FS: CInt = 9
public const val GS: CInt = 10
public const val ORIG_EAX: CInt = 11
public const val EIP: CInt = 12
public const val CS: CInt = 13
public const val EFL: CInt = 14
public const val UESP: CInt = 15
public const val SS: CInt = 16
public const val REG_GS: CInt = 0
public const val REG_FS: CInt = 1
public const val REG_ES: CInt = 2
public const val REG_DS: CInt = 3
public const val REG_EDI: CInt = 4
public const val REG_ESI: CInt = 5
public const val REG_EBP: CInt = 6
public const val REG_ESP: CInt = 7
public const val REG_EBX: CInt = 8
public const val REG_EDX: CInt = 9
public const val REG_ECX: CInt = 10
public const val REG_EAX: CInt = 11
public const val REG_TRAPNO: CInt = 12
public const val REG_ERR: CInt = 13
public const val REG_EIP: CInt = 14
public const val REG_CS: CInt = 15
public const val REG_EFL: CInt = 16
public const val REG_UESP: CInt = 17
public const val REG_SS: CInt = 18

public expect fun getcontext(ucp: UcontextT?): CInt

public expect fun setcontext(ucp: UcontextT?): CInt

public expect fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: CInt, vararg args: Any?)

public expect fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt
