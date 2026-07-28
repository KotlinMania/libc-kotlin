// port-lint: source unix/linux_like/linux/gnu/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias WcharT = Int
public typealias NlinkT = ULong
public typealias BlksizeT = Long
public typealias GregT = Long
public typealias SusecondsT = Long
public typealias U64 = CULongLong
public typealias S64 = CLongLong

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

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val pad: IntArray,
    val align: ULongArray,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stNlink: NlinkT,
    val stMode: ModeT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAtime: TimeT,
    val stAtimeNsec: Long,
    val stMtime: TimeT,
    val stMtimeNsec: Long,
    val stCtime: TimeT,
    val stCtimeNsec: Long,
)

public data class Stat64(
    val stDev: DevT,
    val stIno: Ino64T,
    val stNlink: NlinkT,
    val stMode: ModeT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stBlksize: BlksizeT,
    val stBlocks: Blkcnt64T,
    val stAtime: TimeT,
    val stAtimeNsec: Long,
    val stMtime: TimeT,
    val stMtimeNsec: Long,
    val stCtime: TimeT,
    val stCtimeNsec: Long,
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

public data class PthreadAttrT(
    val size: UIntArray,
    val size: ULongArray,
)

public data class LibcFpxreg(
    val significand: UShortArray,
    val exponent: UShort,
    val private: UShortArray,
)

public data class LibcXmmreg(
    val element: UIntArray,
)

public data class LibcFpstate(
    val cwd: UShort,
    val swd: UShort,
    val ftw: UShort,
    val fop: UShort,
    val rip: ULong,
    val rdp: ULong,
    val mxcsr: UInt,
    val mxcrMask: UInt,
    val st: List<LibcFpxreg>,
    val xmm: List<LibcXmmreg>,
    val private: ULongArray,
)

public data class UserRegsStruct(
    val r15: CULongLong,
    val r14: CULongLong,
    val r13: CULongLong,
    val r12: CULongLong,
    val rbp: CULongLong,
    val rbx: CULongLong,
    val r11: CULongLong,
    val r10: CULongLong,
    val r9: CULongLong,
    val r8: CULongLong,
    val rax: CULongLong,
    val rcx: CULongLong,
    val rdx: CULongLong,
    val rsi: CULongLong,
    val rdi: CULongLong,
    val origRax: CULongLong,
    val rip: CULongLong,
    val cs: CULongLong,
    val eflags: CULongLong,
    val rsp: CULongLong,
    val ss: CULongLong,
    val fsBase: CULongLong,
    val gsBase: CULongLong,
    val ds: CULongLong,
    val es: CULongLong,
    val fs: CULongLong,
    val gs: CULongLong,
)

public data class User(
    val regs: UserRegsStruct,
    val uFpvalid: CInt,
    val i387: UserFpregsStruct,
    val uTsize: CULongLong,
    val uDsize: CULongLong,
    val uSsize: CULongLong,
    val startCode: CULongLong,
    val startStack: CULongLong,
    val signal: CLongLong,
    val uAr0: UserRegsStruct?,
    val uFpstate: UserFpregsStruct?,
    val magic: CULongLong,
    val uComm: ByteArray,
    val uDebugreg: ULongArray,
)

public data class McontextT(
    val gregs: List<GregT>,
    val fpregs: LibcFpstate?,
    val private: ULongArray,
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

public data class PtraceRseqConfiguration(
    val rseqAbiPointer: U64,
    val rseqAbiSize: U32,
    val signature: U32,
    val flags: U32,
    val pad: U32,
)

public data class CloneArgs(
    val flags: CULongLong,
    val pidfd: CULongLong,
    val childTid: CULongLong,
    val parentTid: CULongLong,
    val exitSignal: CULongLong,
    val stack: CULongLong,
    val stackSize: CULongLong,
    val tls: CULongLong,
    val setTid: CULongLong,
    val setTidSize: CULongLong,
    val cgroup: CULongLong,
)

public data class UserFpregsStruct(
    val cwd: CUShort,
    val swd: CUShort,
    val ftw: CUShort,
    val fop: CUShort,
    val rip: CULongLong,
    val rdp: CULongLong,
    val mxcsr: CUInt,
    val mxcrMask: CUInt,
    val stSpace: UIntArray,
    val xmmSpace: UIntArray,
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

public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val VEOF: ULong = 4uL
public const val RTLD_DEEPBIND: CInt = 0x8
public const val RTLD_GLOBAL: CInt = 0x100
public const val RTLD_NOLOAD: CInt = 0x4
public const val O_APPEND: CInt = 1024
public const val O_CREAT: CInt = 64
public const val O_EXCL: CInt = 128
public const val O_NOCTTY: CInt = 256
public const val O_NONBLOCK: CInt = 2048
public const val O_SYNC: CInt = 1052672
public const val O_RSYNC: CInt = 1052672
public const val O_DSYNC: CInt = 4096
public const val O_FSYNC: CInt = 0x101000
public const val O_NOATIME: CInt = 262144
public const val O_PATH: CInt = 2097152
public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY
public const val MADV_SOFT_OFFLINE: CInt = 101
public const val MAP_GROWSDOWN: CInt = 0x0100
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
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SA_ONSTACK: CInt = 0x08000000
public const val SA_SIGINFO: CInt = 0x00000004
public const val SA_NOCLDWAIT: CInt = 0x00000002
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGWINCH: CInt = 28
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
public const val POLLWRNORM: CShort = 0x100
public const val POLLWRBAND: CShort = 0x200
public const val O_ASYNC: CInt = 0x2000
public const val O_NDELAY: CInt = 0x800
public const val PTRACE_DETACH: CUInt = 17u
public const val PTRACE_GET_RSEQ_CONFIGURATION: CUInt = 0x420fu
public const val EFD_NONBLOCK: CInt = 0x800
public const val F_GETLK: CInt = 5
public const val F_GETOWN: CInt = 9
public const val F_SETOWN: CInt = 8
public const val F_SETLK: CInt = 6
public const val F_SETLKW: CInt = 7
public const val F_OFD_GETLK: CInt = 36
public const val F_OFD_SETLK: CInt = 37
public const val F_OFD_SETLKW: CInt = 38
public const val F_RDLCK: CInt = 0
public const val F_WRLCK: CInt = 1
public const val F_UNLCK: CInt = 2
public const val SFD_NONBLOCK: CInt = 0x0800
public const val TCSANOW: CInt = 0
public const val TCSADRAIN: CInt = 1
public const val TCSAFLUSH: CInt = 2
public const val SFD_CLOEXEC: CInt = 0x080000
public const val NCCS: ULong = 32uL
public const val O_TRUNC: CInt = 512
public const val O_CLOEXEC: CInt = 0x80000
public const val EBFONT: CInt = 59
public const val ENOSTR: CInt = 60
public const val ENODATA: CInt = 61
public const val ETIME: CInt = 62
public const val ENOSR: CInt = 63
public const val ENONET: CInt = 64
public const val ENOPKG: CInt = 65
public const val EREMOTE: CInt = 66
public const val ENOLINK: CInt = 67
public const val EADV: CInt = 68
public const val ESRMNT: CInt = 69
public const val ECOMM: CInt = 70
public const val EPROTO: CInt = 71
public const val EDOTDOT: CInt = 73
public const val SA_NODEFER: CInt = 0x40000000
public const val SA_RESETHAND: CInt = 0x80000000
public const val SA_RESTART: CInt = 0x10000000
public const val SA_NOCLDSTOP: CInt = 0x00000001
public const val EPOLL_CLOEXEC: CInt = 0x80000
public const val EFD_CLOEXEC: CInt = 0x80000
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL
public const val O_DIRECT: CInt = 0x4000
public const val O_DIRECTORY: CInt = 0x10000
public const val O_NOFOLLOW: CInt = 0x20000
public const val MAP_HUGETLB: CInt = 0x040000
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
public const val MAP_SYNC: CInt = 0x080000
public const val EDEADLOCK: CInt = 35
public const val EUCLEAN: CInt = 117
public const val ENOTNAM: CInt = 118
public const val ENAVAIL: CInt = 119
public const val EISNAM: CInt = 120
public const val EREMOTEIO: CInt = 121
public const val PTRACE_GETFPREGS: CUInt = 14u
public const val PTRACE_SETFPREGS: CUInt = 15u
public const val PTRACE_GETFPXREGS: CUInt = 18u
public const val PTRACE_SETFPXREGS: CUInt = 19u
public const val PTRACE_GETREGS: CUInt = 12u
public const val PTRACE_SETREGS: CUInt = 13u
public const val PTRACE_PEEKSIGINFO_SHARED: CUInt = 1u
public const val PTRACE_SYSEMU: CUInt = 31u
public const val PTRACE_SYSEMU_SINGLESTEP: CUInt = 32u
public const val PR_GET_SPECULATION_CTRL: CInt = 52
public const val PR_SET_SPECULATION_CTRL: CInt = 53
public const val PR_SPEC_NOT_AFFECTED: CUInt = 0u
public val PR_SPEC_PRCTL: CUInt = 1 shl 0
public val PR_SPEC_ENABLE: CUInt = 1 shl 1
public val PR_SPEC_DISABLE: CUInt = 1 shl 2
public val PR_SPEC_FORCE_DISABLE: CUInt = 1 shl 3
public val PR_SPEC_DISABLE_NOEXEC: CUInt = 1 shl 4
public const val PR_SPEC_STORE_BYPASS: CInt = 0
public const val PR_SPEC_INDIRECT_BRANCH: CInt = 1
public const val PR_SPEC_L1D_FLUSH: CInt = 2
public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val MCL_ONFAULT: CInt = 0x0004
public const val SIGSTKSZ: ULong = 8192uL
public const val MINSIGSTKSZ: ULong = 2048uL
public const val CBAUD: TcflagT = 4111
public const val TAB1: TcflagT = 0x00000800
public const val TAB2: TcflagT = 0x00001000
public const val TAB3: TcflagT = 0x00001800
public const val CR1: TcflagT = 0x00000200
public const val CR2: TcflagT = 0x00000400
public const val CR3: TcflagT = 0x00000600
public const val FF1: TcflagT = 0x00008000
public const val BS1: TcflagT = 0x00002000
public const val VT1: TcflagT = 0x00004000
public const val VWERASE: ULong = 14uL
public const val VREPRINT: ULong = 12uL
public const val VSUSP: ULong = 10uL
public const val VSTART: ULong = 8uL
public const val VSTOP: ULong = 9uL
public const val VDISCARD: ULong = 13uL
public const val VTIME: ULong = 5uL
public const val IXON: TcflagT = 0x00000400
public const val IXOFF: TcflagT = 0x00001000
public const val ONLCR: TcflagT = 0x4
public const val CSIZE: TcflagT = 0x00000030
public const val CS6: TcflagT = 0x00000010
public const val CS7: TcflagT = 0x00000020
public const val CS8: TcflagT = 0x00000030
public const val CSTOPB: TcflagT = 0x00000040
public const val CREAD: TcflagT = 0x00000080
public const val PARENB: TcflagT = 0x00000100
public const val PARODD: TcflagT = 0x00000200
public const val HUPCL: TcflagT = 0x00000400
public const val CLOCAL: TcflagT = 0x00000800
public const val ECHOKE: TcflagT = 0x00000800
public const val ECHOE: TcflagT = 0x00000010
public const val ECHOK: TcflagT = 0x00000020
public const val ECHONL: TcflagT = 0x00000040
public const val ECHOPRT: TcflagT = 0x00000400
public const val ECHOCTL: TcflagT = 0x00000200
public const val ISIG: TcflagT = 0x00000001
public const val ICANON: TcflagT = 0x00000002
public const val PENDIN: TcflagT = 0x00004000
public const val NOFLSH: TcflagT = 0x00000080
public const val CIBAUD: TcflagT = 269418496
public const val CBAUDEX: TcflagT = 4096
public const val VSWTC: ULong = 7uL
public const val OLCUC: TcflagT = 2
public const val NLDLY: TcflagT = 256
public const val CRDLY: TcflagT = 1536
public const val TABDLY: TcflagT = 6144
public const val BSDLY: TcflagT = 8192
public const val FFDLY: TcflagT = 32768
public const val VTDLY: TcflagT = 16384
public const val XTABS: TcflagT = 6144
public const val B0: SpeedT = 0
public const val B50: SpeedT = 1
public const val B75: SpeedT = 2
public const val B110: SpeedT = 3
public const val B134: SpeedT = 4
public const val B150: SpeedT = 5
public const val B200: SpeedT = 6
public const val B300: SpeedT = 7
public const val B600: SpeedT = 8
public const val B1200: SpeedT = 9
public const val B1800: SpeedT = 10
public const val B2400: SpeedT = 11
public const val B4800: SpeedT = 12
public const val B9600: SpeedT = 13
public const val B19200: SpeedT = 14
public const val B38400: SpeedT = 15
public const val EXTA: SpeedT = B19200
public const val EXTB: SpeedT = B38400
public const val B57600: SpeedT = 4097
public const val B115200: SpeedT = 4098
public const val B230400: SpeedT = 4099
public const val B460800: SpeedT = 4100
public const val B500000: SpeedT = 4101
public const val B576000: SpeedT = 4102
public const val B921600: SpeedT = 4103
public const val B1000000: SpeedT = 4104
public const val B1152000: SpeedT = 4105
public const val B1500000: SpeedT = 4106
public const val B2000000: SpeedT = 4107
public const val B2500000: SpeedT = 4108
public const val B3000000: SpeedT = 4109
public const val B3500000: SpeedT = 4110
public const val B4000000: SpeedT = 4111
public const val VEOL: ULong = 11uL
public const val VEOL2: ULong = 16uL
public const val VMIN: ULong = 6uL
public const val IEXTEN: TcflagT = 0x00008000
public const val TOSTOP: TcflagT = 0x00000100
public const val FLUSHO: TcflagT = 0x00001000
public const val EXTPROC: TcflagT = 0x00010000
public const val R15: CInt = 0
public const val R14: CInt = 1
public const val R13: CInt = 2
public const val R12: CInt = 3
public const val RBP: CInt = 4
public const val RBX: CInt = 5
public const val R11: CInt = 6
public const val R10: CInt = 7
public const val R9: CInt = 8
public const val R8: CInt = 9
public const val RAX: CInt = 10
public const val RCX: CInt = 11
public const val RDX: CInt = 12
public const val RSI: CInt = 13
public const val RDI: CInt = 14
public const val ORIG_RAX: CInt = 15
public const val RIP: CInt = 16
public const val CS: CInt = 17
public const val EFLAGS: CInt = 18
public const val RSP: CInt = 19
public const val SS: CInt = 20
public const val FS_BASE: CInt = 21
public const val GS_BASE: CInt = 22
public const val DS: CInt = 23
public const val ES: CInt = 24
public const val FS: CInt = 25
public const val GS: CInt = 26
public const val REG_R8: CInt = 0
public const val REG_R9: CInt = 1
public const val REG_R10: CInt = 2
public const val REG_R11: CInt = 3
public const val REG_R12: CInt = 4
public const val REG_R13: CInt = 5
public const val REG_R14: CInt = 6
public const val REG_R15: CInt = 7
public const val REG_RDI: CInt = 8
public const val REG_RSI: CInt = 9
public const val REG_RBP: CInt = 10
public const val REG_RBX: CInt = 11
public const val REG_RDX: CInt = 12
public const val REG_RAX: CInt = 13
public const val REG_RCX: CInt = 14
public const val REG_RSP: CInt = 15
public const val REG_RIP: CInt = 16
public const val REG_EFL: CInt = 17
public const val REG_CSGSFS: CInt = 18
public const val REG_ERR: CInt = 19
public const val REG_TRAPNO: CInt = 20
public const val REG_OLDMASK: CInt = 21
public const val REG_CR2: CInt = 22

public expect fun getcontext(ucp: UcontextT?): CInt

public expect fun setcontext(ucp: UcontextT?): CInt

public expect fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: CInt, vararg args: Any?)

public expect fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt
