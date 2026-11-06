// port-lint: source unix/linux_like/linux/gnu/b32/csky/csky_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.csky

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.Blkcnt64T
import io.github.kotlinmania.libc.BlksizeT
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DevT
import io.github.kotlinmania.libc.FsblkcntT
import io.github.kotlinmania.libc.FsfilcntT
import io.github.kotlinmania.libc.FsidT
import io.github.kotlinmania.libc.FswordT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.InoT
import io.github.kotlinmania.libc.KeyT
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.MsglenT
import io.github.kotlinmania.libc.MsgqnumT
import io.github.kotlinmania.libc.NlinkT
import io.github.kotlinmania.libc.Off64T
import io.github.kotlinmania.libc.OffT
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.ShmattT
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.SigsetT
import io.github.kotlinmania.libc.SpeedT
import io.github.kotlinmania.libc.TcflagT
import io.github.kotlinmania.libc.TimeT
import io.github.kotlinmania.libc.UidT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public typealias WcharT = UInt

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
    public var saRestorer: SigactionSaRestorerCallback?,
)

public open class Statfs(
    public var fType: FswordT,
    public var fBsize: FswordT,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFsid: FsidT,
    public var fNamelen: FswordT,
    public var fFrsize: FswordT,
    public var fSpare: List<FswordT>,
)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
)

public open class Flock64(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: Off64T,
    public var lLen: Off64T,
    public var lPid: PidT,
)

public open class IpcPerm(
    public var key: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: CUshort,
    public var pad1: CUshort,
    public var seq: CUshort,
    public var pad2: CUshort,
    public var unused1: CUlong,
    public var unused2: CUlong,
)

public open class Stat64(
    public var stDev: DevT,
    public var pad1: CUint,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var pad2: CUint,
    public var stSize: Off64T,
    public var stBlksize: BlksizeT,
    public var stBlocks: Blkcnt64T,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
)

public open class Statfs64(
    public var fType: FswordT,
    public var fBsize: FswordT,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fNamelen: FswordT,
    public var fFrsize: FswordT,
    public var fFlags: FswordT,
    public var fSpare: List<FswordT>,
)

public open class Statvfs64(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFavail: ULong,
    public var fFsid: CUlong,
    public var fUnused: CInt,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class ShmidDs(
    public var shmPerm: io.github.kotlinmania.libc.IpcPerm,
    public var shmSegsz: SizeT,
    public var shmAtime: TimeT,
    public var unused1: CUlong,
    public var shmDtime: TimeT,
    public var unused2: CUlong,
    public var shmCtime: TimeT,
    public var unused3: CUlong,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: ShmattT,
    public var unused4: CUlong,
    public var unused5: CUlong,
)

public open class MsqidDs(
    public var msgPerm: io.github.kotlinmania.libc.IpcPerm,
    public var msgStime: TimeT,
    public var glibcReserved1: CUlong,
    public var msgRtime: TimeT,
    public var glibcReserved2: CUlong,
    public var msgCtime: TimeT,
    public var glibcReserved3: CUlong,
    public var msgCbytes: CUlong,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var glibcReserved4: CUlong,
    public var glibcReserved5: CUlong,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var pad: List<CInt>,
    public var align: List<Int>,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
)

public open class MaxAlignT(public var priv: List<Long>)

public val VEOF: Int = 4

public val RTLD_DEEPBIND: CInt = 0x8

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_NOLOAD: CInt = 0x4

public val O_DIRECT: CInt = 0x4000

public val O_DIRECTORY: CInt = 0x10000

public val O_NOFOLLOW: CInt = 0x20000

public val O_LARGEFILE: CInt = 32768

public val O_APPEND: CInt = 1024

public val O_CREAT: CInt = 64

public val O_EXCL: CInt = 128

public val O_NOCTTY: CInt = 256

public val O_NONBLOCK: CInt = 2048

public val O_SYNC: CInt = 1052672

public val O_RSYNC: CInt = 1052672

public val O_DSYNC: CInt = 4096

public val O_FSYNC: CInt = 0x101000

public val O_ASYNC: CInt = 0x2000

public val O_NDELAY: CInt = 0x800

public val MADV_SOFT_OFFLINE: CInt = 101

public val MAP_LOCKED: CInt = 0x02000

public val MAP_NORESERVE: CInt = 0x04000

public val MAP_ANON: CInt = 0x0020

public val MAP_ANONYMOUS: CInt = 0x0020

public val MAP_DENYWRITE: CInt = 0x0800

public val MAP_EXECUTABLE: CInt = 0x01000

public val MAP_POPULATE: CInt = 0x08000

public val MAP_NONBLOCK: CInt = 0x010000

public val MAP_STACK: CInt = 0x020000

public val MAP_HUGETLB: CInt = 0x040000

public val MAP_GROWSDOWN: CInt = 0x0100

public val MAP_SYNC: CInt = 0x080000

public val EDEADLOCK: CInt = 35

public val EUCLEAN: CInt = 117

public val ENOTNAM: CInt = 118

public val ENAVAIL: CInt = 119

public val EISNAM: CInt = 120

public val EREMOTEIO: CInt = 121

public val EDEADLK: CInt = 35

public val ENAMETOOLONG: CInt = 36

public val ENOLCK: CInt = 37

public val ENOSYS: CInt = 38

public val ENOTEMPTY: CInt = 39

public val ELOOP: CInt = 40

public val ENOMSG: CInt = 42

public val EIDRM: CInt = 43

public val ECHRNG: CInt = 44

public val EL2NSYNC: CInt = 45

public val EL3HLT: CInt = 46

public val EL3RST: CInt = 47

public val ELNRNG: CInt = 48

public val EUNATCH: CInt = 49

public val ENOCSI: CInt = 50

public val EL2HLT: CInt = 51

public val EBADE: CInt = 52

public val EBADR: CInt = 53

public val EXFULL: CInt = 54

public val ENOANO: CInt = 55

public val EBADRQC: CInt = 56

public val EBADSLT: CInt = 57

public val EMULTIHOP: CInt = 72

public val EOVERFLOW: CInt = 75

public val ENOTUNIQ: CInt = 76

public val EBADFD: CInt = 77

public val EBADMSG: CInt = 74

public val EREMCHG: CInt = 78

public val ELIBACC: CInt = 79

public val ELIBBAD: CInt = 80

public val ELIBSCN: CInt = 81

public val ELIBMAX: CInt = 82

public val ELIBEXEC: CInt = 83

public val EILSEQ: CInt = 84

public val ERESTART: CInt = 85

public val ESTRPIPE: CInt = 86

public val EUSERS: CInt = 87

public val ENOTSOCK: CInt = 88

public val EDESTADDRREQ: CInt = 89

public val EMSGSIZE: CInt = 90

public val EPROTOTYPE: CInt = 91

public val ENOPROTOOPT: CInt = 92

public val EPROTONOSUPPORT: CInt = 93

public val ESOCKTNOSUPPORT: CInt = 94

public val EOPNOTSUPP: CInt = 95

public val EPFNOSUPPORT: CInt = 96

public val EAFNOSUPPORT: CInt = 97

public val EADDRINUSE: CInt = 98

public val EADDRNOTAVAIL: CInt = 99

public val ENETDOWN: CInt = 100

public val ENETUNREACH: CInt = 101

public val ENETRESET: CInt = 102

public val ECONNABORTED: CInt = 103

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EISCONN: CInt = 106

public val ENOTCONN: CInt = 107

public val ESHUTDOWN: CInt = 108

public val ETOOMANYREFS: CInt = 109

public val ETIMEDOUT: CInt = 110

public val ECONNREFUSED: CInt = 111

public val EHOSTDOWN: CInt = 112

public val EHOSTUNREACH: CInt = 113

public val EALREADY: CInt = 114

public val EINPROGRESS: CInt = 115

public val ESTALE: CInt = 116

public val EDQUOT: CInt = 122

public val ENOMEDIUM: CInt = 123

public val EMEDIUMTYPE: CInt = 124

public val ECANCELED: CInt = 125

public val ENOKEY: CInt = 126

public val EKEYEXPIRED: CInt = 127

public val EKEYREVOKED: CInt = 128

public val EKEYREJECTED: CInt = 129

public val EOWNERDEAD: CInt = 130

public val ENOTRECOVERABLE: CInt = 131

public val EHWPOISON: CInt = 133

public val ERFKILL: CInt = 132

public val SA_SIGINFO: CInt = 0x00000004

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MCL_ONFAULT: CInt = 0x0004

public val POLLWRNORM: CShort = 0x100

public val POLLWRBAND: CShort = 0x200

public val F_GETLK: CInt = 5

public val F_GETOWN: CInt = 9

public val F_SETOWN: CInt = 8

public val EFD_NONBLOCK: CInt = 0x800

public val SFD_NONBLOCK: CInt = 0x0800

public val SIGCHLD: CInt = 17

public val SIGBUS: CInt = 7

public val SIGUSR1: CInt = 10

public val SIGUSR2: CInt = 12

public val SIGCONT: CInt = 18

public val SIGSTOP: CInt = 19

public val SIGTSTP: CInt = 20

public val SIGURG: CInt = 23

public val SIGIO: CInt = 29

public val SIGSYS: CInt = 31

public val SIGSTKFLT: CInt = 16

public val SIGUNUSED: CInt = 31

public val SIGPOLL: CInt = 29

public val SIGPWR: CInt = 30

public val SIG_SETMASK: CInt = 2

public val SIG_BLOCK: CInt = 0x000000

public val SIG_UNBLOCK: CInt = 0x01

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGSTKSZ: SizeT = 8192uL

public val MINSIGSTKSZ: SizeT = 2048uL

public val CBAUD: TcflagT = 4111

public val TAB1: TcflagT = 0x00000800

public val TAB2: TcflagT = 0x00001000

public val TAB3: TcflagT = 0x00001800

public val CR1: TcflagT = 0x00000200

public val CR2: TcflagT = 0x00000400

public val CR3: TcflagT = 0x00000600

public val FF1: TcflagT = 0x00008000

public val BS1: TcflagT = 0x00002000

public val VT1: TcflagT = 0x00004000

public val VWERASE: Int = 14

public val VREPRINT: Int = 12

public val VSUSP: Int = 10

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VDISCARD: Int = 13

public val VTIME: Int = 5

public val IXON: TcflagT = 0x00000400

public val IXOFF: TcflagT = 0x00001000

public val ONLCR: TcflagT = 0x4

public val CSIZE: TcflagT = 0x00000030

public val CS6: TcflagT = 0x00000010

public val CS7: TcflagT = 0x00000020

public val CS8: TcflagT = 0x00000030

public val CSTOPB: TcflagT = 0x00000040

public val CREAD: TcflagT = 0x00000080

public val PARENB: TcflagT = 0x00000100

public val PARODD: TcflagT = 0x00000200

public val HUPCL: TcflagT = 0x00000400

public val CLOCAL: TcflagT = 0x00000800

public val ECHOKE: TcflagT = 0x00000800

public val ECHOE: TcflagT = 0x00000010

public val ECHOK: TcflagT = 0x00000020

public val ECHONL: TcflagT = 0x00000040

public val ECHOPRT: TcflagT = 0x00000400

public val ECHOCTL: TcflagT = 0x00000200

public val ISIG: TcflagT = 0x00000001

public val ICANON: TcflagT = 0x00000002

public val PENDIN: TcflagT = 0x00004000

public val NOFLSH: TcflagT = 0x00000080

public val CIBAUD: TcflagT = 269418496

public val CBAUDEX: TcflagT = 4096

public val VSWTC: Int = 7

public val OLCUC: TcflagT = 2

public val NLDLY: TcflagT = 256

public val CRDLY: TcflagT = 1536

public val TABDLY: TcflagT = 6144

public val BSDLY: TcflagT = 8192

public val FFDLY: TcflagT = 32768

public val VTDLY: TcflagT = 16384

public val XTABS: TcflagT = 6144

public val B0: SpeedT = 0

public val B50: SpeedT = 1

public val B75: SpeedT = 2

public val B110: SpeedT = 3

public val B134: SpeedT = 4

public val B150: SpeedT = 5

public val B200: SpeedT = 6

public val B300: SpeedT = 7

public val B600: SpeedT = 8

public val B1200: SpeedT = 9

public val B1800: SpeedT = 10

public val B2400: SpeedT = 11

public val B4800: SpeedT = 12

public val B9600: SpeedT = 13

public val B19200: SpeedT = 14

public val B38400: SpeedT = 15

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val B57600: SpeedT = 4097

public val B115200: SpeedT = 4098

public val B230400: SpeedT = 4099

public val B460800: SpeedT = 4100

public val B500000: SpeedT = 4101

public val B576000: SpeedT = 4102

public val B921600: SpeedT = 4103

public val B1000000: SpeedT = 4104

public val B1152000: SpeedT = 4105

public val B1500000: SpeedT = 4106

public val B2000000: SpeedT = 4107

public val B2500000: SpeedT = 4108

public val B3000000: SpeedT = 4109

public val B3500000: SpeedT = 4110

public val B4000000: SpeedT = 4111

public val VEOL: Int = 11

public val VEOL2: Int = 16

public val VMIN: Int = 6

public val IEXTEN: TcflagT = 0x00008000

public val TOSTOP: TcflagT = 0x00000100

public val FLUSHO: TcflagT = 0x00001000

public val EXTPROC: TcflagT = 0x00010000

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

// Syscall table
public val SYS_READ: CLong = 63L

public val SYS_WRITE: CLong = 64L

public val SYS_CLOSE: CLong = 57L

public val SYS_FSTAT: CLong = 80L

public val SYS_LSEEK: CLong = 62L

public val SYS_MMAP: CLong = 222L

public val SYS_MPROTECT: CLong = 226L

public val SYS_MUNMAP: CLong = 215L

public val SYS_BRK: CLong = 214L

public val SYS_RT_SIGACTION: CLong = 134L

public val SYS_RT_SIGPROCMASK: CLong = 135L

public val SYS_RT_SIGRETURN: CLong = 139L

public val SYS_IOCTL: CLong = 29L

public val SYS_PREAD64: CLong = 67L

public val SYS_PWRITE64: CLong = 68L

public val SYS_READV: CLong = 65L

public val SYS_WRITEV: CLong = 66L

public val SYS_SCHED_YIELD: CLong = 124L

public val SYS_MREMAP: CLong = 216L

public val SYS_MSYNC: CLong = 227L

public val SYS_MINCORE: CLong = 232L

public val SYS_MADVISE: CLong = 233L

public val SYS_SHMGET: CLong = 194L

public val SYS_SHMAT: CLong = 196L

public val SYS_SHMCTL: CLong = 195L

public val SYS_DUP: CLong = 23L

public val SYS_NANOSLEEP: CLong = 101L

public val SYS_GETITIMER: CLong = 102L

public val SYS_SETITIMER: CLong = 103L

public val SYS_GETPID: CLong = 172L

public val SYS_SENDFILE: CLong = 71L

public val SYS_SOCKET: CLong = 198L

public val SYS_CONNECT: CLong = 203L

public val SYS_ACCEPT: CLong = 202L

public val SYS_SENDTO: CLong = 206L

public val SYS_RECVFROM: CLong = 207L

public val SYS_SENDMSG: CLong = 211L

public val SYS_RECVMSG: CLong = 212L

public val SYS_SHUTDOWN: CLong = 210L

public val SYS_BIND: CLong = 200L

public val SYS_LISTEN: CLong = 201L

public val SYS_GETSOCKNAME: CLong = 204L

public val SYS_GETPEERNAME: CLong = 205L

public val SYS_SOCKETPAIR: CLong = 199L

public val SYS_SETSOCKOPT: CLong = 208L

public val SYS_GETSOCKOPT: CLong = 209L

public val SYS_CLONE: CLong = 220L

public val SYS_EXECVE: CLong = 221L

public val SYS_EXIT: CLong = 93L

public val SYS_WAIT4: CLong = 260L

public val SYS_KILL: CLong = 129L

public val SYS_UNAME: CLong = 160L

public val SYS_SEMGET: CLong = 190L

public val SYS_SEMOP: CLong = 193L

public val SYS_SEMCTL: CLong = 191L

public val SYS_SHMDT: CLong = 197L

public val SYS_MSGGET: CLong = 186L

public val SYS_MSGSND: CLong = 189L

public val SYS_MSGRCV: CLong = 188L

public val SYS_MSGCTL: CLong = 187L

public val SYS_FCNTL: CLong = 25L

public val SYS_FLOCK: CLong = 32L

public val SYS_FSYNC: CLong = 82L

public val SYS_FDATASYNC: CLong = 83L

public val SYS_TRUNCATE: CLong = 45L

public val SYS_FTRUNCATE: CLong = 46L

public val SYS_GETCWD: CLong = 17L

public val SYS_CHDIR: CLong = 49L

public val SYS_FCHDIR: CLong = 50L

public val SYS_FCHMOD: CLong = 52L

public val SYS_FCHOWN: CLong = 55L

public val SYS_UMASK: CLong = 166L

public val SYS_GETTIMEOFDAY: CLong = 169L

public val SYS_GETRLIMIT: CLong = 163L

public val SYS_GETRUSAGE: CLong = 165L

public val SYS_SYSINFO: CLong = 179L

public val SYS_TIMES: CLong = 153L

public val SYS_PTRACE: CLong = 117L

public val SYS_GETUID: CLong = 174L

public val SYS_SYSLOG: CLong = 116L

public val SYS_GETGID: CLong = 176L

public val SYS_SETUID: CLong = 146L

public val SYS_SETGID: CLong = 144L

public val SYS_GETEUID: CLong = 175L

public val SYS_GETEGID: CLong = 177L

public val SYS_SETPGID: CLong = 154L

public val SYS_GETPPID: CLong = 173L

public val SYS_SETSID: CLong = 157L

public val SYS_SETREUID: CLong = 145L

public val SYS_SETREGID: CLong = 143L

public val SYS_GETGROUPS: CLong = 158L

public val SYS_SETGROUPS: CLong = 159L

public val SYS_SETRESUID: CLong = 147L

public val SYS_GETRESUID: CLong = 148L

public val SYS_SETRESGID: CLong = 149L

public val SYS_GETRESGID: CLong = 150L

public val SYS_GETPGID: CLong = 155L

public val SYS_SETFSUID: CLong = 151L

public val SYS_SETFSGID: CLong = 152L

public val SYS_GETSID: CLong = 156L

public val SYS_CAPGET: CLong = 90L

public val SYS_CAPSET: CLong = 91L

public val SYS_RT_SIGPENDING: CLong = 136L

public val SYS_RT_SIGTIMEDWAIT: CLong = 137L

public val SYS_RT_SIGQUEUEINFO: CLong = 138L

public val SYS_RT_SIGSUSPEND: CLong = 133L

public val SYS_SIGALTSTACK: CLong = 132L

public val SYS_PERSONALITY: CLong = 92L

public val SYS_STATFS: CLong = 43L

public val SYS_FSTATFS: CLong = 44L

public val SYS_GETPRIORITY: CLong = 141L

public val SYS_SETPRIORITY: CLong = 140L

public val SYS_SCHED_SETPARAM: CLong = 118L

public val SYS_SCHED_GETPARAM: CLong = 121L

public val SYS_SCHED_SETSCHEDULER: CLong = 119L

public val SYS_SCHED_GETSCHEDULER: CLong = 120L

public val SYS_SCHED_GET_PRIORITY_MAX: CLong = 125L

public val SYS_SCHED_GET_PRIORITY_MIN: CLong = 126L

public val SYS_SCHED_RR_GET_INTERVAL: CLong = 127L

public val SYS_MLOCK: CLong = 228L

public val SYS_MUNLOCK: CLong = 229L

public val SYS_MLOCKALL: CLong = 230L

public val SYS_MUNLOCKALL: CLong = 231L

public val SYS_VHANGUP: CLong = 58L

public val SYS_PIVOT_ROOT: CLong = 41L

public val SYS_PRCTL: CLong = 167L

public val SYS_ADJTIMEX: CLong = 171L

public val SYS_SETRLIMIT: CLong = 164L

public val SYS_CHROOT: CLong = 51L

public val SYS_SYNC: CLong = 81L

public val SYS_ACCT: CLong = 89L

public val SYS_SETTIMEOFDAY: CLong = 170L

public val SYS_MOUNT: CLong = 40L

public val SYS_UMOUNT2: CLong = 39L

public val SYS_SWAPON: CLong = 224L

public val SYS_SWAPOFF: CLong = 225L

public val SYS_REBOOT: CLong = 142L

public val SYS_SETHOSTNAME: CLong = 161L

public val SYS_SETDOMAINNAME: CLong = 162L

public val SYS_INIT_MODULE: CLong = 105L

public val SYS_DELETE_MODULE: CLong = 106L

public val SYS_QUOTACTL: CLong = 60L

public val SYS_NFSSERVCTL: CLong = 42L

public val SYS_GETTID: CLong = 178L

public val SYS_READAHEAD: CLong = 213L

public val SYS_SETXATTR: CLong = 5L

public val SYS_LSETXATTR: CLong = 6L

public val SYS_FSETXATTR: CLong = 7L

public val SYS_GETXATTR: CLong = 8L

public val SYS_LGETXATTR: CLong = 9L

public val SYS_FGETXATTR: CLong = 10L

public val SYS_LISTXATTR: CLong = 11L

public val SYS_LLISTXATTR: CLong = 12L

public val SYS_FLISTXATTR: CLong = 13L

public val SYS_REMOVEXATTR: CLong = 14L

public val SYS_LREMOVEXATTR: CLong = 15L

public val SYS_FREMOVEXATTR: CLong = 16L

public val SYS_TKILL: CLong = 130L

public val SYS_FUTEX: CLong = 98L

public val SYS_SCHED_SETAFFINITY: CLong = 122L

public val SYS_SCHED_GETAFFINITY: CLong = 123L

public val SYS_IO_SETUP: CLong = 0L

public val SYS_IO_DESTROY: CLong = 1L

public val SYS_IO_GETEVENTS: CLong = 4L

public val SYS_IO_SUBMIT: CLong = 2L

public val SYS_IO_CANCEL: CLong = 3L

public val SYS_LOOKUP_DCOOKIE: CLong = 18L

public val SYS_REMAP_FILE_PAGES: CLong = 234L

public val SYS_GETDENTS64: CLong = 61L

public val SYS_SET_TID_ADDRESS: CLong = 96L

public val SYS_RESTART_SYSCALL: CLong = 128L

public val SYS_SEMTIMEDOP: CLong = 192L

public val SYS_FADVISE64: CLong = 223L

public val SYS_TIMER_CREATE: CLong = 107L

public val SYS_TIMER_SETTIME: CLong = 110L

public val SYS_TIMER_GETTIME: CLong = 108L

public val SYS_TIMER_GETOVERRUN: CLong = 109L

public val SYS_TIMER_DELETE: CLong = 111L

public val SYS_CLOCK_SETTIME: CLong = 112L

public val SYS_CLOCK_GETTIME: CLong = 113L

public val SYS_CLOCK_GETRES: CLong = 114L

public val SYS_CLOCK_NANOSLEEP: CLong = 115L

public val SYS_EXIT_GROUP: CLong = 94L

public val SYS_EPOLL_CTL: CLong = 21L

public val SYS_TGKILL: CLong = 131L

public val SYS_MBIND: CLong = 235L

public val SYS_SET_MEMPOLICY: CLong = 237L

public val SYS_GET_MEMPOLICY: CLong = 236L

public val SYS_MQ_OPEN: CLong = 180L

public val SYS_MQ_UNLINK: CLong = 181L

public val SYS_MQ_TIMEDSEND: CLong = 182L

public val SYS_MQ_TIMEDRECEIVE: CLong = 183L

public val SYS_MQ_NOTIFY: CLong = 184L

public val SYS_MQ_GETSETATTR: CLong = 185L

public val SYS_KEXEC_LOAD: CLong = 104L

public val SYS_WAITID: CLong = 95L

public val SYS_ADD_KEY: CLong = 217L

public val SYS_REQUEST_KEY: CLong = 218L

public val SYS_KEYCTL: CLong = 219L

public val SYS_IOPRIO_SET: CLong = 30L

public val SYS_IOPRIO_GET: CLong = 31L

public val SYS_INOTIFY_ADD_WATCH: CLong = 27L

public val SYS_INOTIFY_RM_WATCH: CLong = 28L

public val SYS_MIGRATE_PAGES: CLong = 238L

public val SYS_OPENAT: CLong = 56L

public val SYS_MKDIRAT: CLong = 34L

public val SYS_MKNODAT: CLong = 33L

public val SYS_FCHOWNAT: CLong = 54L

public val SYS_NEWFSTATAT: CLong = 79L

public val SYS_UNLINKAT: CLong = 35L

public val SYS_LINKAT: CLong = 37L

public val SYS_SYMLINKAT: CLong = 36L

public val SYS_READLINKAT: CLong = 78L

public val SYS_FCHMODAT: CLong = 53L

public val SYS_FACCESSAT: CLong = 48L

public val SYS_PSELECT6: CLong = 72L

public val SYS_PPOLL: CLong = 73L

public val SYS_UNSHARE: CLong = 97L

public val SYS_SET_ROBUST_LIST: CLong = 99L

public val SYS_GET_ROBUST_LIST: CLong = 100L

public val SYS_SPLICE: CLong = 76L

public val SYS_TEE: CLong = 77L

public val SYS_SYNC_FILE_RANGE: CLong = 84L

public val SYS_VMSPLICE: CLong = 75L

public val SYS_MOVE_PAGES: CLong = 239L

public val SYS_UTIMENSAT: CLong = 88L

public val SYS_EPOLL_PWAIT: CLong = 22L

public val SYS_TIMERFD_CREATE: CLong = 85L

public val SYS_FALLOCATE: CLong = 47L

public val SYS_TIMERFD_SETTIME: CLong = 86L

public val SYS_TIMERFD_GETTIME: CLong = 87L

public val SYS_ACCEPT4: CLong = 242L

public val SYS_SIGNALFD4: CLong = 74L

public val SYS_EVENTFD2: CLong = 19L

public val SYS_EPOLL_CREATE1: CLong = 20L

public val SYS_DUP3: CLong = 24L

public val SYS_PIPE2: CLong = 59L

public val SYS_INOTIFY_INIT1: CLong = 26L

public val SYS_PREADV: CLong = 69L

public val SYS_PWRITEV: CLong = 70L

public val SYS_RT_TGSIGQUEUEINFO: CLong = 240L

public val SYS_PERF_EVENT_OPEN: CLong = 241L

public val SYS_RECVMMSG: CLong = 243L

public val SYS_FANOTIFY_INIT: CLong = 262L

public val SYS_FANOTIFY_MARK: CLong = 263L

public val SYS_PRLIMIT64: CLong = 261L

public val SYS_NAME_TO_HANDLE_AT: CLong = 264L

public val SYS_OPEN_BY_HANDLE_AT: CLong = 265L

public val SYS_CLOCK_ADJTIME: CLong = 266L

public val SYS_SYNCFS: CLong = 267L

public val SYS_SENDMMSG: CLong = 269L

public val SYS_SETNS: CLong = 268L

public val SYS_GETCPU: CLong = 168L

public val SYS_PROCESS_VM_READV: CLong = 270L

public val SYS_PROCESS_VM_WRITEV: CLong = 271L

public val SYS_KCMP: CLong = 272L

public val SYS_FINIT_MODULE: CLong = 273L

public val SYS_SCHED_SETATTR: CLong = 274L

public val SYS_SCHED_GETATTR: CLong = 275L

public val SYS_RENAMEAT2: CLong = 276L

public val SYS_SECCOMP: CLong = 277L

public val SYS_GETRANDOM: CLong = 278L

public val SYS_MEMFD_CREATE: CLong = 279L

public val SYS_BPF: CLong = 280L

public val SYS_EXECVEAT: CLong = 281L

public val SYS_USERFAULTFD: CLong = 282L

public val SYS_MEMBARRIER: CLong = 283L

public val SYS_MLOCK2: CLong = 284L

public val SYS_COPY_FILE_RANGE: CLong = 285L

public val SYS_PREADV2: CLong = 286L

public val SYS_PWRITEV2: CLong = 287L

public val SYS_PKEY_MPROTECT: CLong = 288L

public val SYS_PKEY_ALLOC: CLong = 289L

public val SYS_PKEY_FREE: CLong = 290L

public val SYS_STATX: CLong = 291L

public val SYS_RSEQ: CLong = 293L

public val SYS_SYSCALL: CLong = 294L

public val SYS_PIDFD_SEND_SIGNAL: CLong = 424L

public val SYS_IO_URING_SETUP: CLong = 425L

public val SYS_IO_URING_ENTER: CLong = 426L

public val SYS_IO_URING_REGISTER: CLong = 427L

public val SYS_OPEN_TREE: CLong = 428L

public val SYS_MOVE_MOUNT: CLong = 429L

public val SYS_FSOPEN: CLong = 430L

public val SYS_FSCONFIG: CLong = 431L

public val SYS_FSMOUNT: CLong = 432L

public val SYS_FSPICK: CLong = 433L

public val SYS_PIDFD_OPEN: CLong = 434L

public val SYS_CLONE3: CLong = 435L

public val SYS_CLOSE_RANGE: CLong = 436L

public val SYS_OPENAT2: CLong = 437L

public val SYS_PIDFD_GETFD: CLong = 438L

public val SYS_FACCESSAT2: CLong = 439L

public val SYS_PROCESS_MADVISE: CLong = 440L

public val SYS_EPOLL_PWAIT2: CLong = 441L

public val SYS_MOUNT_SETATTR: CLong = 442L

public val SYS_QUOTACTL_FD: CLong = 443L

public val SYS_LANDLOCK_CREATE_RULESET: CLong = 444L

public val SYS_LANDLOCK_ADD_RULE: CLong = 445L

public val SYS_LANDLOCK_RESTRICT_SELF: CLong = 446L

public val SYS_MEMFD_SECRET: CLong = 447L

public val SYS_PROCESS_MRELEASE: CLong = 448L

public val SYS_FUTEX_WAITV: CLong = 449L

public val SYS_SET_MEMPOLICY_HOME_NODE: CLong = 450L
