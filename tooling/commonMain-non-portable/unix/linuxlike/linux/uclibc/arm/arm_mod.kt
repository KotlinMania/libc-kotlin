// port-lint: source unix/linux_like/linux/uclibc/arm/arm_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.Blkcnt64T
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CcT
import io.github.kotlinmania.libc.FsidT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.KeyT
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.MsglenT
import io.github.kotlinmania.libc.MsgqnumT
import io.github.kotlinmania.libc.Off64T
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.ShmattT
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.SpeedT
import io.github.kotlinmania.libc.TcflagT
import io.github.kotlinmania.libc.UidT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public typealias WcharT = CUint

public typealias TimeT = CLong

public typealias ClockT = CLong

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias InoT = CUlong

public typealias OffT = CLong

public typealias PthreadT = CUlong

public typealias SusecondsT = CLong

public typealias NlinkT = CUint

public typealias BlksizeT = CLong

public typealias BlkcntT = CLong

public typealias Fsblkcnt64T = ULong

public typealias Fsfilcnt64T = ULong

public typealias U64 = CUlonglong

public typealias S64 = CLonglong

public open class Cmsghdr(
    public var cmsgLen: SizeT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SocklenT,
    public var msgFlags: CInt,
)

public open class PthreadAttrT(public var size: List<CLong>)

public open class Stat(
    public var stDev: CUlonglong,
    public var pad1: CUshort,
    public var stIno: io.github.kotlinmania.libc.InoT,
    public var stMode: ModeT,
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlonglong,
    public var pad2: CUshort,
    public var stSize: OffT,
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var stBlocks: io.github.kotlinmania.libc.BlkcntT,
    public var stAtime: io.github.kotlinmania.libc.TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: io.github.kotlinmania.libc.TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: io.github.kotlinmania.libc.TimeT,
    public var stCtimeNsec: CLong,
    public var unused4: CUlong,
    public var unused5: CUlong,
)

public open class Stat64(
    public var stDev: CUlonglong,
    public var pad1: CUint,
    public var stIno: io.github.kotlinmania.libc.InoT,
    public var stMode: ModeT,
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlonglong,
    public var pad2: CUint,
    public var stSize: Off64T,
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var stBlocks: Blkcnt64T,
    public var stAtime: io.github.kotlinmania.libc.TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: io.github.kotlinmania.libc.TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: io.github.kotlinmania.libc.TimeT,
    public var stCtimeNsec: CLong,
)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
)

public open class Sysinfo(
    public var uptime: CLong,
    public var loads: List<CUlong>,
    public var totalram: CUlong,
    public var freeram: CUlong,
    public var sharedram: CUlong,
    public var bufferram: CUlong,
    public var totalswap: CUlong,
    public var freeswap: CUlong,
    public var procs: CUshort,
    public var pad: CUshort,
    public var totalhigh: CUlong,
    public var freehigh: CUlong,
    public var memUnit: CUint,
    public var f: List<CChar>,
)

public open class Statfs(
    public var fType: CInt,
    public var fBsize: CInt,
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFsid: FsidT,
    public var fNamelen: CInt,
    public var fFrsize: CInt,
    public var fFlags: CInt,
    public var fSpare: List<CInt>,
)

public open class Statfs64(
    public var fType: CInt,
    public var fBsize: CInt,
    public var fBlocks: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fBfree: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fBavail: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fFiles: io.github.kotlinmania.libc.Fsfilcnt64T,
    public var fFfree: io.github.kotlinmania.libc.Fsfilcnt64T,
    public var fFsid: FsidT,
    public var fNamelen: CInt,
    public var fFrsize: CInt,
    public var fFlags: CInt,
    public var fSpare: List<CInt>,
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

public open class SigsetT(public var value: List<CUlong>)

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saFlags: CUlong,
    public var saRestorer: SigactionSaRestorerCallback?,
    public var saMask: SigsetT,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cLine: CcT,
    public var cCc: List<CcT>,
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var pad: List<CInt>,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
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

public open class MsqidDs(
    public var msgPerm: io.github.kotlinmania.libc.IpcPerm,
    public var msgStime: io.github.kotlinmania.libc.TimeT,
    public var unused1: CUlong,
    public var msgRtime: io.github.kotlinmania.libc.TimeT,
    public var unused2: CUlong,
    public var msgCtime: io.github.kotlinmania.libc.TimeT,
    public var unused3: CUlong,
    public var msgCbytes: CUlong,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var unused4: CUlong,
    public var unused5: CUlong,
)

public open class ShmidDs(
    public var shmPerm: io.github.kotlinmania.libc.IpcPerm,
    public var shmSegsz: SizeT,
    public var shmAtime: io.github.kotlinmania.libc.TimeT,
    public var unused1: CUlong,
    public var shmDtime: io.github.kotlinmania.libc.TimeT,
    public var unused2: CUlong,
    public var shmCtime: io.github.kotlinmania.libc.TimeT,
    public var unused3: CUlong,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: ShmattT,
    public var unused4: CUlong,
    public var unused5: CUlong,
)

public open class SemT(public var size: List<CChar>)

public val O_CLOEXEC: CInt = 524288

public val SIZEOF_PTHREAD_ATTR_T: Int = 36

public val SIZEOF_PTHREAD_MUTEX_T: Int = 24

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_COND_COMPAT_T: Int = 12

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 32

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

public val SIZEOF_PTHREAD_BARRIER_T: Int = 20

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val NCCS: Int = 32

// I wasn't able to find those constants
// in uclibc build environment for armv7
public val MAP_HUGETLB: CInt = 0x040000

// from linux/other/mod.rs
// autogenerated constants with hand tuned types
public val B0: SpeedT = 0

public val B1000000: SpeedT = 0x1008

public val B110: SpeedT = 0x3

public val B115200: SpeedT = 0x1002

public val B1152000: SpeedT = 0x1009

public val B1200: SpeedT = 0x9

public val B134: SpeedT = 0x4

public val B150: SpeedT = 0x5

public val B1500000: SpeedT = 0x100a

public val B1800: SpeedT = 0xa

public val B19200: SpeedT = 0xe

public val B200: SpeedT = 0x6

public val B2000000: SpeedT = 0x100b

public val B230400: SpeedT = 0x1003

public val B2400: SpeedT = 0xb

public val B2500000: SpeedT = 0x100c

public val B300: SpeedT = 0x7

public val B3000000: SpeedT = 0x100d

public val B3500000: SpeedT = 0x100e

public val B38400: SpeedT = 0xf

public val B4000000: SpeedT = 0x100f

public val B460800: SpeedT = 0x1004

public val B4800: SpeedT = 0xc

public val B50: SpeedT = 0x1

public val B500000: SpeedT = 0x1005

public val B57600: SpeedT = 0x1001

public val B576000: SpeedT = 0x1006

public val B600: SpeedT = 0x8

public val B75: SpeedT = 0x2

public val B921600: SpeedT = 0x1007

public val B9600: SpeedT = 0xd

public val BS1: CInt = 0x2000

public val BSDLY: CInt = 0x2000

public val CBAUD: TcflagT = 0x100f

public val CBAUDEX: TcflagT = 0x1000

public val CIBAUD: TcflagT = 0x100f0000

public val CLOCAL: TcflagT = 0x800

public val CPU_SETSIZE: CInt = 0x400

public val CR1: CInt = 0x200

public val CR2: CInt = 0x400

public val CR3: CInt = 0x600

public val CRDLY: CInt = 0x600

public val CREAD: TcflagT = 0x80

public val CS6: TcflagT = 0x10

public val CS7: TcflagT = 0x20

public val CS8: TcflagT = 0x30

public val CSIZE: TcflagT = 0x30

public val CSTOPB: TcflagT = 0x40

public val EADDRINUSE: CInt = 0x62

public val EADDRNOTAVAIL: CInt = 0x63

public val EADV: CInt = 0x44

public val EAFNOSUPPORT: CInt = 0x61

public val EALREADY: CInt = 0x72

public val EBADE: CInt = 0x34

public val EBADFD: CInt = 0x4d

public val EBADMSG: CInt = 0x4a

public val EBADR: CInt = 0x35

public val EBADRQC: CInt = 0x38

public val EBADSLT: CInt = 0x39

public val EBFONT: CInt = 0x3b

public val ECANCELED: CInt = 0x7d

public val ECHOCTL: TcflagT = 0x200

public val ECHOE: TcflagT = 0x10

public val ECHOK: TcflagT = 0x20

public val ECHOKE: TcflagT = 0x800

public val ECHONL: TcflagT = 0x40

public val ECHOPRT: TcflagT = 0x400

public val ECHRNG: CInt = 0x2c

public val ECOMM: CInt = 0x46

public val ECONNABORTED: CInt = 0x67

public val ECONNREFUSED: CInt = 0x6f

public val ECONNRESET: CInt = 0x68

public val EDEADLK: CInt = 0x23

public val EDESTADDRREQ: CInt = 0x59

public val EDOTDOT: CInt = 0x49

public val EDQUOT: CInt = 0x7a

public val EFD_CLOEXEC: CInt = 0x80000

public val EFD_NONBLOCK: CInt = 0x800

public val EHOSTDOWN: CInt = 0x70

public val EHOSTUNREACH: CInt = 0x71

public val EHWPOISON: CInt = 0x85

public val EIDRM: CInt = 0x2b

public val EILSEQ: CInt = 0x54

public val EINPROGRESS: CInt = 0x73

public val EISCONN: CInt = 0x6a

public val EISNAM: CInt = 0x78

public val EKEYEXPIRED: CInt = 0x7f

public val EKEYREJECTED: CInt = 0x81

public val EKEYREVOKED: CInt = 0x80

public val EL2HLT: CInt = 0x33

public val EL2NSYNC: CInt = 0x2d

public val EL3HLT: CInt = 0x2e

public val EL3RST: CInt = 0x2f

public val ELIBACC: CInt = 0x4f

public val ELIBBAD: CInt = 0x50

public val ELIBEXEC: CInt = 0x53

public val ELIBMAX: CInt = 0x52

public val ELIBSCN: CInt = 0x51

public val ELNRNG: CInt = 0x30

public val ELOOP: CInt = 0x28

public val EMEDIUMTYPE: CInt = 0x7c

public val EMSGSIZE: CInt = 0x5a

public val EMULTIHOP: CInt = 0x48

public val ENAMETOOLONG: CInt = 0x24

public val ENAVAIL: CInt = 0x77

public val ENETDOWN: CInt = 0x64

public val ENETRESET: CInt = 0x66

public val ENETUNREACH: CInt = 0x65

public val ENOANO: CInt = 0x37

public val ENOBUFS: CInt = 0x69

public val ENOCSI: CInt = 0x32

public val ENODATA: CInt = 0x3d

public val ENOKEY: CInt = 0x7e

public val ENOLCK: CInt = 0x25

public val ENOLINK: CInt = 0x43

public val ENOMEDIUM: CInt = 0x7b

public val ENOMSG: CInt = 0x2a

public val ENONET: CInt = 0x40

public val ENOPKG: CInt = 0x41

public val ENOPROTOOPT: CInt = 0x5c

public val ENOSR: CInt = 0x3f

public val ENOSTR: CInt = 0x3c

public val ENOSYS: CInt = 0x26

public val ENOTCONN: CInt = 0x6b

public val ENOTEMPTY: CInt = 0x27

public val ENOTNAM: CInt = 0x76

public val ENOTRECOVERABLE: CInt = 0x83

public val ENOTSOCK: CInt = 0x58

public val ENOTUNIQ: CInt = 0x4c

public val EOPNOTSUPP: CInt = 0x5f

public val EOVERFLOW: CInt = 0x4b

public val EOWNERDEAD: CInt = 0x82

public val EPFNOSUPPORT: CInt = 0x60

public val EPOLL_CLOEXEC: CInt = 0x80000

public val EPROTO: CInt = 0x47

public val EPROTONOSUPPORT: CInt = 0x5d

public val EPROTOTYPE: CInt = 0x5b

public val EREMCHG: CInt = 0x4e

public val EREMOTE: CInt = 0x42

public val EREMOTEIO: CInt = 0x79

public val ERESTART: CInt = 0x55

public val ERFKILL: CInt = 0x84

public val ESHUTDOWN: CInt = 0x6c

public val ESOCKTNOSUPPORT: CInt = 0x5e

public val ESRMNT: CInt = 0x45

public val ESTALE: CInt = 0x74

public val ESTRPIPE: CInt = 0x56

public val ETIME: CInt = 0x3e

public val ETIMEDOUT: CInt = 0x6e

public val ETOOMANYREFS: CInt = 0x6d

public val EUCLEAN: CInt = 0x75

public val EUNATCH: CInt = 0x31

public val EUSERS: CInt = 0x57

public val EXFULL: CInt = 0x36

public val FF1: CInt = 0x8000

public val FFDLY: CInt = 0x8000

public val FLUSHO: TcflagT = 0x1000

public val F_GETLK: CInt = 0x5

public val F_SETLK: CInt = 0x6

public val F_SETLKW: CInt = 0x7

public val HUPCL: TcflagT = 0x400

public val ICANON: TcflagT = 0x2

public val IEXTEN: TcflagT = 0x8000

public val ISIG: TcflagT = 0x1

public val IXOFF: TcflagT = 0x1000

public val IXON: TcflagT = 0x400

public val MAP_ANON: CInt = 0x20

public val MAP_ANONYMOUS: CInt = 0x20

public val MAP_DENYWRITE: CInt = 0x800

public val MAP_EXECUTABLE: CInt = 0x1000

public val MAP_GROWSDOWN: CInt = 0x100

public val MAP_LOCKED: CInt = 0x2000

public val MAP_NONBLOCK: CInt = 0x10000

public val MAP_NORESERVE: CInt = 0x4000

public val MAP_POPULATE: CInt = 0x8000

public val MAP_STACK: CInt = 0x20000

public val NLDLY: TcflagT = 0x100

public val NOFLSH: TcflagT = 0x80

public val OLCUC: TcflagT = 0x2

public val ONLCR: TcflagT = 0x4

public val O_ACCMODE: CInt = 0x3

public val O_APPEND: CInt = 0x400

public val O_ASYNC: CInt = 8192

public val O_CREAT: CInt = 0x40

public val O_DIRECT: CInt = 0x10000

public val O_DIRECTORY: CInt = 0x4000

public val O_DSYNC: CInt = O_SYNC

public val O_EXCL: CInt = 0x80

public val O_FSYNC: CInt = O_SYNC

public val O_LARGEFILE: CInt = 131072

public val O_NDELAY: CInt = O_NONBLOCK

public val O_NOATIME: CInt = 262144

public val O_NOCTTY: CInt = 0x100

public val O_NOFOLLOW: CInt = 0x8000

public val O_NONBLOCK: CInt = 0x800

public val O_PATH: CInt = 2097152

public val O_RSYNC: CInt = O_SYNC

public val O_SYNC: CInt = 4096

public val O_TRUNC: CInt = 0x200

public val PARENB: TcflagT = 0x100

public val PARODD: TcflagT = 0x200

public val PENDIN: TcflagT = 0x4000

public val POLLWRBAND: CShort = 0x200

public val POLLWRNORM: CShort = 0x100

public val PTHREAD_STACK_MIN: SizeT = 16384uL

public val RTLD_GLOBAL: CInt = 0x00100

// These are typed unsigned to match sigaction
public val SA_NOCLDSTOP: CUlong = 0x1uL

public val SA_NOCLDWAIT: CUlong = 0x2uL

public val SA_SIGINFO: CUlong = 0x4uL

public val SA_NODEFER: CUlong = 0x40000000uL

public val SA_ONSTACK: CUlong = 0x8000000uL

public val SA_RESETHAND: CUlong = 0x80000000uL

public val SA_RESTART: CUlong = 0x10000000uL

public val SFD_CLOEXEC: CInt = 0x80000

public val SFD_NONBLOCK: CInt = 0x800

public val SIGBUS: CInt = 0x7

public val SIGCHLD: CInt = 0x11

public val SIGCONT: CInt = 0x12

public val SIGIO: CInt = 0x1d

public val SIGPROF: CInt = 0x1b

public val SIGPWR: CInt = 0x1e

public val SIGSTKFLT: CInt = 0x10

public val SIGSTKSZ: SizeT = 8192uL

public val SIGSTOP: CInt = 0x13

public val SIGSYS: CInt = 0x1f

public val SIGTSTP: CInt = 0x14

public val SIGTTIN: CInt = 0x15

public val SIGTTOU: CInt = 0x16

public val SIGURG: CInt = 0x17

public val SIGUSR1: CInt = 0xa

public val SIGUSR2: CInt = 0xc

public val SIGVTALRM: CInt = 0x1a

public val SIGWINCH: CInt = 0x1c

public val SIGXCPU: CInt = 0x18

public val SIGXFSZ: CInt = 0x19

public val SIG_BLOCK: CInt = 0

public val SIG_SETMASK: CInt = 0x2

public val SIG_UNBLOCK: CInt = 0x1

public val SOCK_DGRAM: CInt = 0x2

public val SOCK_NONBLOCK: CInt = 2048

public val SOCK_SEQPACKET: CInt = 0x5

public val SOCK_STREAM: CInt = 0x1

public val TAB1: CInt = 0x800

public val TAB2: CInt = 0x1000

public val TAB3: CInt = 0x1800

public val TABDLY: CInt = 0x1800

public val TCSADRAIN: CInt = 0x1

public val TCSAFLUSH: CInt = 0x2

public val TCSANOW: CInt = 0

public val TOSTOP: TcflagT = 0x100

public val VDISCARD: Int = 0xd

public val VEOF: Int = 0x4

public val VEOL: Int = 0xb

public val VEOL2: Int = 0x10

public val VMIN: Int = 0x6

public val VREPRINT: Int = 0xc

public val VSTART: Int = 0x8

public val VSTOP: Int = 0x9

public val VSUSP: Int = 0xa

public val VSWTC: Int = 0x7

public val VT1: CInt = 0x4000

public val VTDLY: CInt = 0x4000

public val VTIME: Int = 0x5

public val VWERASE: Int = 0xe

public val XTABS: TcflagT = 0x1800

public val MADV_SOFT_OFFLINE: CInt = 101

// Syscall table is copied from src/unix/notbsd/linux/musl/b32/arm.rs
public val SYS_RESTART_SYSCALL: CLong = 0L

public val SYS_EXIT: CLong = 1L

public val SYS_FORK: CLong = 2L

public val SYS_READ: CLong = 3L

public val SYS_WRITE: CLong = 4L

public val SYS_OPEN: CLong = 5L

public val SYS_CLOSE: CLong = 6L

public val SYS_CREAT: CLong = 8L

public val SYS_LINK: CLong = 9L

public val SYS_UNLINK: CLong = 10L

public val SYS_EXECVE: CLong = 11L

public val SYS_CHDIR: CLong = 12L

public val SYS_MKNOD: CLong = 14L

public val SYS_CHMOD: CLong = 15L

public val SYS_LCHOWN: CLong = 16L

public val SYS_LSEEK: CLong = 19L

public val SYS_GETPID: CLong = 20L

public val SYS_MOUNT: CLong = 21L

public val SYS_SETUID: CLong = 23L

public val SYS_GETUID: CLong = 24L

public val SYS_PTRACE: CLong = 26L

public val SYS_PAUSE: CLong = 29L

public val SYS_ACCESS: CLong = 33L

public val SYS_NICE: CLong = 34L

public val SYS_SYNC: CLong = 36L

public val SYS_KILL: CLong = 37L

public val SYS_RENAME: CLong = 38L

public val SYS_MKDIR: CLong = 39L

public val SYS_RMDIR: CLong = 40L

public val SYS_DUP: CLong = 41L

public val SYS_PIPE: CLong = 42L

public val SYS_TIMES: CLong = 43L

public val SYS_BRK: CLong = 45L

public val SYS_SETGID: CLong = 46L

public val SYS_GETGID: CLong = 47L

public val SYS_GETEUID: CLong = 49L

public val SYS_GETEGID: CLong = 50L

public val SYS_ACCT: CLong = 51L

public val SYS_UMOUNT2: CLong = 52L

public val SYS_IOCTL: CLong = 54L

public val SYS_FCNTL: CLong = 55L

public val SYS_SETPGID: CLong = 57L

public val SYS_UMASK: CLong = 60L

public val SYS_CHROOT: CLong = 61L

public val SYS_USTAT: CLong = 62L

public val SYS_DUP2: CLong = 63L

public val SYS_GETPPID: CLong = 64L

public val SYS_GETPGRP: CLong = 65L

public val SYS_SETSID: CLong = 66L

public val SYS_SIGACTION: CLong = 67L

public val SYS_SETREUID: CLong = 70L

public val SYS_SETREGID: CLong = 71L

public val SYS_SIGSUSPEND: CLong = 72L

public val SYS_SIGPENDING: CLong = 73L

public val SYS_SETHOSTNAME: CLong = 74L

public val SYS_SETRLIMIT: CLong = 75L

public val SYS_GETRUSAGE: CLong = 77L

public val SYS_GETTIMEOFDAY: CLong = 78L

public val SYS_SETTIMEOFDAY: CLong = 79L

public val SYS_GETGROUPS: CLong = 80L

public val SYS_SETGROUPS: CLong = 81L

public val SYS_SYMLINK: CLong = 83L

public val SYS_READLINK: CLong = 85L

public val SYS_USELIB: CLong = 86L

public val SYS_SWAPON: CLong = 87L

public val SYS_REBOOT: CLong = 88L

public val SYS_MUNMAP: CLong = 91L

public val SYS_TRUNCATE: CLong = 92L

public val SYS_FTRUNCATE: CLong = 93L

public val SYS_FCHMOD: CLong = 94L

public val SYS_FCHOWN: CLong = 95L

public val SYS_GETPRIORITY: CLong = 96L

public val SYS_SETPRIORITY: CLong = 97L

public val SYS_STATFS: CLong = 99L

public val SYS_FSTATFS: CLong = 100L

public val SYS_SYSLOG: CLong = 103L

public val SYS_SETITIMER: CLong = 104L

public val SYS_GETITIMER: CLong = 105L

public val SYS_STAT: CLong = 106L

public val SYS_LSTAT: CLong = 107L

public val SYS_FSTAT: CLong = 108L

public val SYS_VHANGUP: CLong = 111L

public val SYS_WAIT4: CLong = 114L

public val SYS_SWAPOFF: CLong = 115L

public val SYS_SYSINFO: CLong = 116L

public val SYS_FSYNC: CLong = 118L

public val SYS_SIGRETURN: CLong = 119L

public val SYS_CLONE: CLong = 120L

public val SYS_SETDOMAINNAME: CLong = 121L

public val SYS_UNAME: CLong = 122L

public val SYS_ADJTIMEX: CLong = 124L

public val SYS_MPROTECT: CLong = 125L

public val SYS_SIGPROCMASK: CLong = 126L

public val SYS_INIT_MODULE: CLong = 128L

public val SYS_DELETE_MODULE: CLong = 129L

public val SYS_QUOTACTL: CLong = 131L

public val SYS_GETPGID: CLong = 132L

public val SYS_FCHDIR: CLong = 133L

public val SYS_BDFLUSH: CLong = 134L

public val SYS_SYSFS: CLong = 135L

public val SYS_PERSONALITY: CLong = 136L

public val SYS_SETFSUID: CLong = 138L

public val SYS_SETFSGID: CLong = 139L

public val SYS_LLSEEK: CLong = 140L

public val SYS_GETDENTS: CLong = 141L

public val SYS_NEWSELECT: CLong = 142L

public val SYS_FLOCK: CLong = 143L

public val SYS_MSYNC: CLong = 144L

public val SYS_READV: CLong = 145L

public val SYS_WRITEV: CLong = 146L

public val SYS_GETSID: CLong = 147L

public val SYS_FDATASYNC: CLong = 148L

public val SYS_SYSCTL: CLong = 149L

public val SYS_MLOCK: CLong = 150L

public val SYS_MUNLOCK: CLong = 151L

public val SYS_MLOCKALL: CLong = 152L

public val SYS_MUNLOCKALL: CLong = 153L

public val SYS_SCHED_SETPARAM: CLong = 154L

public val SYS_SCHED_GETPARAM: CLong = 155L

public val SYS_SCHED_SETSCHEDULER: CLong = 156L

public val SYS_SCHED_GETSCHEDULER: CLong = 157L

public val SYS_SCHED_YIELD: CLong = 158L

public val SYS_SCHED_GET_PRIORITY_MAX: CLong = 159L

public val SYS_SCHED_GET_PRIORITY_MIN: CLong = 160L

public val SYS_SCHED_RR_GET_INTERVAL: CLong = 161L

public val SYS_NANOSLEEP: CLong = 162L

public val SYS_MREMAP: CLong = 163L

public val SYS_SETRESUID: CLong = 164L

public val SYS_GETRESUID: CLong = 165L

public val SYS_POLL: CLong = 168L

public val SYS_NFSSERVCTL: CLong = 169L

public val SYS_SETRESGID: CLong = 170L

public val SYS_GETRESGID: CLong = 171L

public val SYS_PRCTL: CLong = 172L

public val SYS_RT_SIGRETURN: CLong = 173L

public val SYS_RT_SIGACTION: CLong = 174L

public val SYS_RT_SIGPROCMASK: CLong = 175L

public val SYS_RT_SIGPENDING: CLong = 176L

public val SYS_RT_SIGTIMEDWAIT: CLong = 177L

public val SYS_RT_SIGQUEUEINFO: CLong = 178L

public val SYS_RT_SIGSUSPEND: CLong = 179L

public val SYS_PREAD64: CLong = 180L

public val SYS_PWRITE64: CLong = 181L

public val SYS_CHOWN: CLong = 182L

public val SYS_GETCWD: CLong = 183L

public val SYS_CAPGET: CLong = 184L

public val SYS_CAPSET: CLong = 185L

public val SYS_SIGALTSTACK: CLong = 186L

public val SYS_SENDFILE: CLong = 187L

public val SYS_VFORK: CLong = 190L

public val SYS_UGETRLIMIT: CLong = 191L

public val SYS_MMAP2: CLong = 192L

public val SYS_TRUNCATE64: CLong = 193L

public val SYS_FTRUNCATE64: CLong = 194L

public val SYS_STAT64: CLong = 195L

public val SYS_LSTAT64: CLong = 196L

public val SYS_FSTAT64: CLong = 197L

public val SYS_LCHOWN32: CLong = 198L

public val SYS_GETUID32: CLong = 199L

public val SYS_GETGID32: CLong = 200L

public val SYS_GETEUID32: CLong = 201L

public val SYS_GETEGID32: CLong = 202L

public val SYS_SETREUID32: CLong = 203L

public val SYS_SETREGID32: CLong = 204L

public val SYS_GETGROUPS32: CLong = 205L

public val SYS_SETGROUPS32: CLong = 206L

public val SYS_FCHOWN32: CLong = 207L

public val SYS_SETRESUID32: CLong = 208L

public val SYS_GETRESUID32: CLong = 209L

public val SYS_SETRESGID32: CLong = 210L

public val SYS_GETRESGID32: CLong = 211L

public val SYS_CHOWN32: CLong = 212L

public val SYS_SETUID32: CLong = 213L

public val SYS_SETGID32: CLong = 214L

public val SYS_SETFSUID32: CLong = 215L

public val SYS_SETFSGID32: CLong = 216L

public val SYS_GETDENTS64: CLong = 217L

public val SYS_PIVOT_ROOT: CLong = 218L

public val SYS_MINCORE: CLong = 219L

public val SYS_MADVISE: CLong = 220L

public val SYS_FCNTL64: CLong = 221L

public val SYS_GETTID: CLong = 224L

public val SYS_READAHEAD: CLong = 225L

public val SYS_SETXATTR: CLong = 226L

public val SYS_LSETXATTR: CLong = 227L

public val SYS_FSETXATTR: CLong = 228L

public val SYS_GETXATTR: CLong = 229L

public val SYS_LGETXATTR: CLong = 230L

public val SYS_FGETXATTR: CLong = 231L

public val SYS_LISTXATTR: CLong = 232L

public val SYS_LLISTXATTR: CLong = 233L

public val SYS_FLISTXATTR: CLong = 234L

public val SYS_REMOVEXATTR: CLong = 235L

public val SYS_LREMOVEXATTR: CLong = 236L

public val SYS_FREMOVEXATTR: CLong = 237L

public val SYS_TKILL: CLong = 238L

public val SYS_SENDFILE64: CLong = 239L

public val SYS_FUTEX: CLong = 240L

public val SYS_SCHED_SETAFFINITY: CLong = 241L

public val SYS_SCHED_GETAFFINITY: CLong = 242L

public val SYS_IO_SETUP: CLong = 243L

public val SYS_IO_DESTROY: CLong = 244L

public val SYS_IO_GETEVENTS: CLong = 245L

public val SYS_IO_SUBMIT: CLong = 246L

public val SYS_IO_CANCEL: CLong = 247L

public val SYS_EXIT_GROUP: CLong = 248L

public val SYS_LOOKUP_DCOOKIE: CLong = 249L

public val SYS_EPOLL_CREATE: CLong = 250L

public val SYS_EPOLL_CTL: CLong = 251L

public val SYS_EPOLL_WAIT: CLong = 252L

public val SYS_REMAP_FILE_PAGES: CLong = 253L

public val SYS_SET_TID_ADDRESS: CLong = 256L

public val SYS_TIMER_CREATE: CLong = 257L

public val SYS_TIMER_SETTIME: CLong = 258L

public val SYS_TIMER_GETTIME: CLong = 259L

public val SYS_TIMER_GETOVERRUN: CLong = 260L

public val SYS_TIMER_DELETE: CLong = 261L

public val SYS_CLOCK_SETTIME: CLong = 262L

public val SYS_CLOCK_GETTIME: CLong = 263L

public val SYS_CLOCK_GETRES: CLong = 264L

public val SYS_CLOCK_NANOSLEEP: CLong = 265L

public val SYS_STATFS64: CLong = 266L

public val SYS_FSTATFS64: CLong = 267L

public val SYS_TGKILL: CLong = 268L

public val SYS_UTIMES: CLong = 269L

public val SYS_PCICONFIG_IOBASE: CLong = 271L

public val SYS_PCICONFIG_READ: CLong = 272L

public val SYS_PCICONFIG_WRITE: CLong = 273L

public val SYS_MQ_OPEN: CLong = 274L

public val SYS_MQ_UNLINK: CLong = 275L

public val SYS_MQ_TIMEDSEND: CLong = 276L

public val SYS_MQ_TIMEDRECEIVE: CLong = 277L

public val SYS_MQ_NOTIFY: CLong = 278L

public val SYS_MQ_GETSETATTR: CLong = 279L

public val SYS_WAITID: CLong = 280L

public val SYS_SOCKET: CLong = 281L

public val SYS_BIND: CLong = 282L

public val SYS_CONNECT: CLong = 283L

public val SYS_LISTEN: CLong = 284L

public val SYS_ACCEPT: CLong = 285L

public val SYS_GETSOCKNAME: CLong = 286L

public val SYS_GETPEERNAME: CLong = 287L

public val SYS_SOCKETPAIR: CLong = 288L

public val SYS_SEND: CLong = 289L

public val SYS_SENDTO: CLong = 290L

public val SYS_RECV: CLong = 291L

public val SYS_RECVFROM: CLong = 292L

public val SYS_SHUTDOWN: CLong = 293L

public val SYS_SETSOCKOPT: CLong = 294L

public val SYS_GETSOCKOPT: CLong = 295L

public val SYS_SENDMSG: CLong = 296L

public val SYS_RECVMSG: CLong = 297L

public val SYS_SEMOP: CLong = 298L

public val SYS_SEMGET: CLong = 299L

public val SYS_SEMCTL: CLong = 300L

public val SYS_MSGSND: CLong = 301L

public val SYS_MSGRCV: CLong = 302L

public val SYS_MSGGET: CLong = 303L

public val SYS_MSGCTL: CLong = 304L

public val SYS_SHMAT: CLong = 305L

public val SYS_SHMDT: CLong = 306L

public val SYS_SHMGET: CLong = 307L

public val SYS_SHMCTL: CLong = 308L

public val SYS_ADD_KEY: CLong = 309L

public val SYS_REQUEST_KEY: CLong = 310L

public val SYS_KEYCTL: CLong = 311L

public val SYS_SEMTIMEDOP: CLong = 312L

public val SYS_VSERVER: CLong = 313L

public val SYS_IOPRIO_SET: CLong = 314L

public val SYS_IOPRIO_GET: CLong = 315L

public val SYS_INOTIFY_INIT: CLong = 316L

public val SYS_INOTIFY_ADD_WATCH: CLong = 317L

public val SYS_INOTIFY_RM_WATCH: CLong = 318L

public val SYS_MBIND: CLong = 319L

public val SYS_GET_MEMPOLICY: CLong = 320L

public val SYS_SET_MEMPOLICY: CLong = 321L

public val SYS_OPENAT: CLong = 322L

public val SYS_MKDIRAT: CLong = 323L

public val SYS_MKNODAT: CLong = 324L

public val SYS_FCHOWNAT: CLong = 325L

public val SYS_FUTIMESAT: CLong = 326L

public val SYS_FSTATAT64: CLong = 327L

public val SYS_UNLINKAT: CLong = 328L

public val SYS_RENAMEAT: CLong = 329L

public val SYS_LINKAT: CLong = 330L

public val SYS_SYMLINKAT: CLong = 331L

public val SYS_READLINKAT: CLong = 332L

public val SYS_FCHMODAT: CLong = 333L

public val SYS_FACCESSAT: CLong = 334L

public val SYS_PSELECT6: CLong = 335L

public val SYS_PPOLL: CLong = 336L

public val SYS_UNSHARE: CLong = 337L

public val SYS_SET_ROBUST_LIST: CLong = 338L

public val SYS_GET_ROBUST_LIST: CLong = 339L

public val SYS_SPLICE: CLong = 340L

public val SYS_TEE: CLong = 342L

public val SYS_VMSPLICE: CLong = 343L

public val SYS_MOVE_PAGES: CLong = 344L

public val SYS_GETCPU: CLong = 345L

public val SYS_EPOLL_PWAIT: CLong = 346L

public val SYS_KEXEC_LOAD: CLong = 347L

public val SYS_UTIMENSAT: CLong = 348L

public val SYS_SIGNALFD: CLong = 349L

public val SYS_TIMERFD_CREATE: CLong = 350L

public val SYS_EVENTFD: CLong = 351L

public val SYS_FALLOCATE: CLong = 352L

public val SYS_TIMERFD_SETTIME: CLong = 353L

public val SYS_TIMERFD_GETTIME: CLong = 354L

public val SYS_SIGNALFD4: CLong = 355L

public val SYS_EVENTFD2: CLong = 356L

public val SYS_EPOLL_CREATE1: CLong = 357L

public val SYS_DUP3: CLong = 358L

public val SYS_PIPE2: CLong = 359L

public val SYS_INOTIFY_INIT1: CLong = 360L

public val SYS_PREADV: CLong = 361L

public val SYS_PWRITEV: CLong = 362L

public val SYS_RT_TGSIGQUEUEINFO: CLong = 363L

public val SYS_PERF_EVENT_OPEN: CLong = 364L

public val SYS_RECVMMSG: CLong = 365L

public val SYS_ACCEPT4: CLong = 366L

public val SYS_FANOTIFY_INIT: CLong = 367L

public val SYS_FANOTIFY_MARK: CLong = 368L

public val SYS_PRLIMIT64: CLong = 369L

public val SYS_NAME_TO_HANDLE_AT: CLong = 370L

public val SYS_OPEN_BY_HANDLE_AT: CLong = 371L

public val SYS_CLOCK_ADJTIME: CLong = 372L

public val SYS_SYNCFS: CLong = 373L

public val SYS_SENDMMSG: CLong = 374L

public val SYS_SETNS: CLong = 375L

public val SYS_PROCESS_VM_READV: CLong = 376L

public val SYS_PROCESS_VM_WRITEV: CLong = 377L

public val SYS_KCMP: CLong = 378L

public val SYS_FINIT_MODULE: CLong = 379L

public val SYS_SCHED_SETATTR: CLong = 380L

public val SYS_SCHED_GETATTR: CLong = 381L

public val SYS_RENAMEAT2: CLong = 382L

public val SYS_SECCOMP: CLong = 383L

public val SYS_GETRANDOM: CLong = 384L

public val SYS_MEMFD_CREATE: CLong = 385L

public val SYS_BPF: CLong = 386L

public val SYS_EXECVEAT: CLong = 387L

public val SYS_USERFAULTFD: CLong = 388L

public val SYS_MEMBARRIER: CLong = 389L

public val SYS_MLOCK2: CLong = 390L

public val SYS_COPY_FILE_RANGE: CLong = 391L

public val SYS_PREADV2: CLong = 392L

public val SYS_PWRITEV2: CLong = 393L

public val SYS_PKEY_MPROTECT: CLong = 394L

public val SYS_PKEY_ALLOC: CLong = 395L

public val SYS_PKEY_FREE: CLong = 396L

// Note(linux): should be a `cLong` too, but a bug slipped in.
public val SYS_STATX: CInt = 397

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
