// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public typealias RlimT = UintptrT
public typealias SaFamilyT = UByte
public typealias PthreadKeyT = CInt
public typealias NfdsT = CULong
public typealias TcflagT = CUInt
public typealias SpeedT = CUChar
public typealias ClockT = Int
public typealias ClockidT = Int
public typealias SusecondsT = Int
public typealias WcharT = Int
public typealias OffT = Long
public typealias InoT = Long
public typealias BlkcntT = Long
public typealias BlksizeT = Int
public typealias DevT = Int
public typealias ModeT = UInt
public typealias NlinkT = Int
public typealias UsecondsT = UInt
public typealias SocklenT = UInt
public typealias PthreadT = UintptrT
public typealias PthreadCondattrT = UintptrT
public typealias PthreadMutexattrT = UintptrT
public typealias PthreadRwlockattrT = UintptrT
public typealias SigsetT = ULong
public typealias FsblkcntT = Long
public typealias FsfilcntT = Long
public typealias PthreadAttrT = COpaquePointer?
public typealias NlItem = CInt
public typealias IdT = Int
public typealias IdtypeT = CInt
public typealias FdMask = UInt
public typealias RegoffT = CInt
public typealias KeyT = Int
public typealias MsgqnumT = UInt
public typealias MsglenT = UInt
public typealias Elf32Addr = UInt
public typealias Elf32Half = UShort
public typealias Elf32Off = UInt
public typealias Elf32Sword = Int
public typealias Elf32Word = UInt
public typealias Elf64Addr = ULong
public typealias Elf64Half = UShort
public typealias Elf64Off = ULong
public typealias Elf64Sword = Int
public typealias Elf64Sxword = Long
public typealias Elf64Word = UInt
public typealias Elf64Xword = ULong
public typealias ENTRY = Entry
public typealias ACTION = CInt
public typealias PosixSpawnattrT = COpaquePointer?
public typealias PosixSpawnFileActionsT = COpaquePointer?

public data class InAddr(
    val sAddr: InAddrT,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class Sockaddr(
    val saLen: UByte,
    val saFamily: SaFamilyT,
    val saData: UByteArray,
)

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class SockaddrIn6(
    val sin6Len: UByte,
    val sin6Family: UByte,
    val sin6Port: UShort,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: SocklenT,
    val aiCanonname: String?,
    val aiAddr: Sockaddr?,
    val aiNext: Addrinfo?,
)

public data class Ifaddrs(
    val ifaNext: Ifaddrs?,
    val ifaName: String?,
    val ifaFlags: CUInt,
    val ifaAddr: Sockaddr?,
    val ifaNetmask: Sockaddr?,
    val ifaDstaddr: Sockaddr?,
    val ifaData: COpaquePointer?,
)

public data class FdSet(
    val fdsBits: List<FdMask>,
)

public data class Tm(
    val tmSec: CInt,
    val tmMin: CInt,
    val tmHour: CInt,
    val tmMday: CInt,
    val tmMon: CInt,
    val tmYear: CInt,
    val tmWday: CInt,
    val tmYday: CInt,
    val tmIsdst: CInt,
    val tmGmtoff: CInt,
    val tmZone: String?,
)

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
)

public data class Lconv(
    val decimalPoint: String?,
    val thousandsSep: String?,
    val grouping: String?,
    val intCurrSymbol: String?,
    val currencySymbol: String?,
    val monDecimalPoint: String?,
    val monThousandsSep: String?,
    val monGrouping: String?,
    val positiveSign: String?,
    val negativeSign: String?,
    val intFracDigits: CChar,
    val fracDigits: CChar,
    val pCsPrecedes: CChar,
    val pSepBySpace: CChar,
    val nCsPrecedes: CChar,
    val nSepBySpace: CChar,
    val pSignPosn: CChar,
    val nSignPosn: CChar,
    val intPCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intNCsPrecedes: CChar,
    val intNSepBySpace: CChar,
    val intPSignPosn: CChar,
    val intNSignPosn: CChar,
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

public data class Cmsghdr(
    val cmsgLen: SocklenT,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CChar,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
    val cCc: List<CcT>,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stSize: OffT,
    val stRdev: DevT,
    val stBlksize: BlksizeT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stCrtime: TimeT,
    val stCrtimeNsec: CLong,
    val stType: UInt,
    val stBlocks: BlkcntT,
)

public data class GlobT(
    val glPathc: ULong,
    val glOffs: ULong,
    val glPathv: COpaquePointer?,
)

public data class PthreadMutexT(
    val flags: UInt,
    val lock: Int,
    val owner: Int,
    val ownerCount: Int,
)

public data class PthreadCondT(
    val flags: UInt,
    val mutex: COpaquePointer?,
    val waiterCount: Int,
    val lock: Int,
)

public data class PthreadRwlockT(
    val flags: UInt,
    val owner: Int,
    val lockSem: Int,
    val lockCount: Int,
    val readerCount: Int,
    val writerCount: Int,
    val waiters: List<COpaquePointer?>,
)

public data class PthreadSpinlockT(
    val lock: UInt,
)

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UidT,
    val pwGid: GidT,
    val pwDir: String?,
    val pwShell: String?,
    val pwGecos: String?,
)

public data class Statvfs(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFavail: FsfilcntT,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siErrno: CInt,
    val siPid: PidT,
    val siUid: UidT,
    val siAddr: COpaquePointer?,
    val siStatus: CInt,
    val siBand: CLong,
    val sigval: COpaquePointer?,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
    val saUserdata: COpaquePointer?,
)

public data class SemT(
    val type: Int,
    val namedSemId: Int,
)

public data class Ucred(
    val pid: PidT,
    val uid: UidT,
    val gid: GidT,
)

public data class SockaddrDl(
    val sdlLen: UByte,
    val sdlFamily: UByte,
    val sdlEType: UShort,
    val sdlIndex: UInt,
    val sdlType: UByte,
    val sdlNlen: UByte,
    val sdlAlen: UByte,
    val sdlSlen: UByte,
    val sdlData: UByteArray,
)

public data class Spwd(
    val spNamp: String?,
    val spPwdp: String?,
    val spLstchg: CInt,
    val spMin: CInt,
    val spMax: CInt,
    val spWarn: CInt,
    val spInact: CInt,
    val spExpire: CInt,
    val spFlag: CInt,
)

public data class RegexT(
    val buffer: COpaquePointer?,
    val allocated: ULong,
    val used: ULong,
    val syntax: CULong,
    val fastmap: String?,
    val translate: String?,
    val reNsub: ULong,
    val bitfield: UByte,
)

public data class RegmatchT(
    val rmSo: RegoffT,
    val rmEo: RegoffT,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgQnum: MsgqnumT,
    val msgQbytes: MsglenT,
    val msgLspid: PidT,
    val msgLrpid: PidT,
    val msgStime: TimeT,
    val msgRtime: TimeT,
    val msgCtime: TimeT,
)

public data class IpcPerm(
    val key: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: ModeT,
)

public data class Sembuf(
    val semNum: CUShort,
    val semOp: CShort,
    val semFlg: CShort,
)

public data class Entry(
    val key: String?,
    val data: COpaquePointer?,
)

public data class Option(
    val name: String?,
    val hasArg: CInt,
    val flag: CInt?,
    val `val`: CInt,
)

public data class SockaddrUn(
    val sunLen: UByte,
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: SaFamilyT,
)

public data class Dirent(
    val dDev: DevT,
    val dPdev: DevT,
    val dIno: InoT,
    val dPino: Long,
    val dReclen: CUShort,
    val dName: ByteArray,
)

public data class Sigevent(
    val sigevNotify: CInt,
    val sigevSigno: CInt,
    val sigevValue: Sigval,
    val sigevNotifyAttributes: PthreadAttrT?,
)

public data class Utmpx(
    val utType: CShort,
    val utTv: Timeval,
    val utId: ByteArray,
    val utPid: PidT,
    val utUser: ByteArray,
    val utLine: ByteArray,
    val utHost: ByteArray,
)

public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val RAND_MAX: CInt = 2147483647
public const val EOF: CInt = -1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val L_SET: CInt = SEEK_SET
public const val L_INCR: CInt = SEEK_CUR
public const val L_XTND: CInt = SEEK_END
public const val _IOFBF: CInt = 0
public const val _IONBF: CInt = 2
public const val _IOLBF: CInt = 1
public const val F_DUPFD: CInt = 0x0001
public const val F_GETFD: CInt = 0x0002
public const val F_SETFD: CInt = 0x0004
public const val F_GETFL: CInt = 0x0008
public const val F_SETFL: CInt = 0x0010
public const val F_GETLK: CInt = 0x0020
public const val F_SETLK: CInt = 0x0080
public const val F_SETLKW: CInt = 0x0100
public const val F_DUPFD_CLOEXEC: CInt = 0x0200
public const val F_RDLCK: CInt = 0x0040
public const val F_UNLCK: CInt = 0x0200
public const val F_WRLCK: CInt = 0x0400
public const val AT_FDCWD: CInt = -100
public const val AT_SYMLINK_NOFOLLOW: CInt = 0x01
public const val AT_SYMLINK_FOLLOW: CInt = 0x02
public const val AT_REMOVEDIR: CInt = 0x04
public const val AT_EACCESS: CInt = 0x08
public const val POLLIN: CShort = 0x0001
public const val POLLOUT: CShort = 0x0002
public const val POLLRDNORM: CShort = POLLIN
public const val POLLWRNORM: CShort = POLLOUT
public const val POLLRDBAND: CShort = 0x0008
public const val POLLWRBAND: CShort = 0x0010
public const val POLLPRI: CShort = 0x0020
public const val POLLERR: CShort = 0x0004
public const val POLLHUP: CShort = 0x0080
public const val POLLNVAL: CShort = 0x1000
public const val PTHREAD_CREATE_JOINABLE: CInt = 0
public const val PTHREAD_CREATE_DETACHED: CInt = 1
public const val CLOCK_REALTIME: CInt = -1
public const val CLOCK_MONOTONIC: CInt = 0
public const val CLOCK_PROCESS_CPUTIME_ID: CInt = -2
public const val CLOCK_THREAD_CPUTIME_ID: CInt = -3
public const val RLIMIT_CORE: CInt = 0
public const val RLIMIT_CPU: CInt = 1
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_FSIZE: CInt = 3
public const val RLIMIT_NOFILE: CInt = 4
public const val RLIMIT_STACK: CInt = 5
public const val RLIMIT_AS: CInt = 6
public const val RLIM_INFINITY: RlimT = 0xffffffffuL
public const val RLIMIT_NOVMON: CInt = 7
public const val RLIM_NLIMITS: CInt = 8
public const val RUSAGE_SELF: CInt = 0
public const val RTLD_LAZY: CInt = 0
public const val NCCS: ULong = 11uL
public const val O_RDONLY: CInt = 0x0000
public const val O_WRONLY: CInt = 0x0001
public const val O_RDWR: CInt = 0x0002
public const val O_ACCMODE: CInt = 0x0003
public const val O_EXCL: CInt = 0x0100
public const val O_CREAT: CInt = 0x0200
public const val O_TRUNC: CInt = 0x0400
public const val O_NOCTTY: CInt = 0x1000
public const val O_NOTRAVERSE: CInt = 0x2000
public const val O_CLOEXEC: CInt = 0x00000040
public const val O_NONBLOCK: CInt = 0x00000080
public const val O_APPEND: CInt = 0x00000800
public const val O_SYNC: CInt = 0x00010000
public const val O_RSYNC: CInt = 0x00020000
public const val O_DSYNC: CInt = 0x00040000
public const val O_NOFOLLOW: CInt = 0x00080000
public const val O_NOCACHE: CInt = 0x00100000
public const val O_DIRECTORY: CInt = 0x00200000
public const val S_IFIFO: ModeT = 4096u
public const val S_IFCHR: ModeT = 8192u
public const val S_IFBLK: ModeT = 24576u
public const val S_IFDIR: ModeT = 16384u
public const val S_IFREG: ModeT = 32768u
public const val S_IFLNK: ModeT = 40960u
public const val S_IFSOCK: ModeT = 49152u
public const val S_IFMT: ModeT = 61440u
public const val S_IRWXU: ModeT = 448u
public const val S_IRUSR: ModeT = 256u
public const val S_IWUSR: ModeT = 128u
public const val S_IXUSR: ModeT = 64u
public const val S_IRWXG: ModeT = 56u
public const val S_IRGRP: ModeT = 32u
public const val S_IWGRP: ModeT = 16u
public const val S_IXGRP: ModeT = 8u
public const val S_IRWXO: ModeT = 7u
public const val S_IROTH: ModeT = 4u
public const val S_IWOTH: ModeT = 2u
public const val S_IXOTH: ModeT = 1u
public const val F_OK: CInt = 0
public const val R_OK: CInt = 4
public const val W_OK: CInt = 2
public const val X_OK: CInt = 1
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGCHLD: CInt = 5
public const val SIGABRT: CInt = 6
public const val SIGPIPE: CInt = 7
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGSTOP: CInt = 10
public const val SIGSEGV: CInt = 11
public const val SIGCONT: CInt = 12
public const val SIGTSTP: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val SIGTTIN: CInt = 16
public const val SIGTTOU: CInt = 17
public const val SIGUSR1: CInt = 18
public const val SIGUSR2: CInt = 19
public const val SIGWINCH: CInt = 20
public const val SIGKILLTHR: CInt = 21
public const val SIGTRAP: CInt = 22
public const val SIGPOLL: CInt = 23
public const val SIGPROF: CInt = 24
public const val SIGSYS: CInt = 25
public const val SIGURG: CInt = 26
public const val SIGVTALRM: CInt = 27
public const val SIGXCPU: CInt = 28
public const val SIGXFSZ: CInt = 29
public const val SIGBUS: CInt = 30
public const val SIG_BLOCK: CInt = 1
public const val SIG_UNBLOCK: CInt = 2
public const val SIG_SETMASK: CInt = 3
public const val SIGEV_NONE: CInt = 0
public const val SIGEV_SIGNAL: CInt = 1
public const val SIGEV_THREAD: CInt = 2
public const val EAI_AGAIN: CInt = 2
public const val EAI_BADFLAGS: CInt = 3
public const val EAI_FAIL: CInt = 4
public const val EAI_FAMILY: CInt = 5
public const val EAI_MEMORY: CInt = 6
public const val EAI_NODATA: CInt = 7
public const val EAI_NONAME: CInt = 8
public const val EAI_SERVICE: CInt = 9
public const val EAI_SOCKTYPE: CInt = 10
public const val EAI_SYSTEM: CInt = 11
public const val EAI_OVERFLOW: CInt = 14
public const val PROT_NONE: CInt = 0
public const val PROT_READ: CInt = 1
public const val PROT_WRITE: CInt = 2
public const val PROT_EXEC: CInt = 4
public const val LC_ALL: CInt = 0
public const val LC_COLLATE: CInt = 1
public const val LC_CTYPE: CInt = 2
public const val LC_MONETARY: CInt = 3
public const val LC_NUMERIC: CInt = 4
public const val LC_TIME: CInt = 5
public const val LC_MESSAGES: CInt = 6
public const val MAP_FILE: CInt = 0x00
public const val MAP_SHARED: CInt = 0x01
public const val MAP_PRIVATE: CInt = 0x02
public const val MAP_FIXED: CInt = 0x04
public const val MAP_ANONYMOUS: CInt = 0x08
public const val MAP_NORESERVE: CInt = 0x10
public const val MAP_ANON: CInt = MAP_ANONYMOUS
public const val MS_ASYNC: CInt = 0x01
public const val MS_INVALIDATE: CInt = 0x04
public const val MS_SYNC: CInt = 0x02
public const val E2BIG: CInt = -2147454975
public const val ECHILD: CInt = -2147454974
public const val EDEADLK: CInt = -2147454973
public const val EFBIG: CInt = -2147454972
public const val EMLINK: CInt = -2147454971
public const val ENFILE: CInt = -2147454970
public const val ENODEV: CInt = -2147454969
public const val ENOLCK: CInt = -2147454968
public const val ENOSYS: CInt = -2147454967
public const val ENOTTY: CInt = -2147454966
public const val ENXIO: CInt = -2147454965
public const val ESPIPE: CInt = -2147454964
public const val ESRCH: CInt = -2147454963
public const val EFPOS: CInt = -2147454962
public const val ESIGPARM: CInt = -2147454961
public const val EDOM: CInt = -2147454960
public const val ERANGE: CInt = -2147454959
public const val EPROTOTYPE: CInt = -2147454958
public const val EPROTONOSUPPORT: CInt = -2147454957
public const val EPFNOSUPPORT: CInt = -2147454956
public const val EAFNOSUPPORT: CInt = -2147454955
public const val EADDRINUSE: CInt = -2147454954
public const val EADDRNOTAVAIL: CInt = -2147454953
public const val ENETDOWN: CInt = -2147454952
public const val ENETUNREACH: CInt = -2147454951
public const val ENETRESET: CInt = -2147454950
public const val ECONNABORTED: CInt = -2147454949
public const val ECONNRESET: CInt = -2147454948
public const val EISCONN: CInt = -2147454947
public const val ENOTCONN: CInt = -2147454946
public const val ESHUTDOWN: CInt = -2147454945
public const val ECONNREFUSED: CInt = -2147454944
public const val EHOSTUNREACH: CInt = -2147454943
public const val ENOPROTOOPT: CInt = -2147454942
public const val ENOBUFS: CInt = -2147454941
public const val EINPROGRESS: CInt = -2147454940
public const val EALREADY: CInt = -2147454939
public const val EILSEQ: CInt = -2147454938
public const val ENOMSG: CInt = -2147454937
public const val ESTALE: CInt = -2147454936
public const val EOVERFLOW: CInt = -2147454935
public const val EMSGSIZE: CInt = -2147454934
public const val EOPNOTSUPP: CInt = -2147454933
public const val ENOTSOCK: CInt = -2147454932
public const val EHOSTDOWN: CInt = -2147454931
public const val EBADMSG: CInt = -2147454930
public const val ECANCELED: CInt = -2147454929
public const val EDESTADDRREQ: CInt = -2147454928
public const val EDQUOT: CInt = -2147454927
public const val EIDRM: CInt = -2147454926
public const val EMULTIHOP: CInt = -2147454925
public const val ENODATA: CInt = -2147454924
public const val ENOLINK: CInt = -2147454923
public const val ENOSR: CInt = -2147454922
public const val ENOSTR: CInt = -2147454921
public const val ENOTSUP: CInt = -2147454920
public const val EPROTO: CInt = -2147454919
public const val ETIME: CInt = -2147454918
public const val ETXTBSY: CInt = -2147454917
public const val ENOATTR: CInt = -2147454916
public const val ENOMEM: CInt = -2147483648
public const val EACCES: CInt = -2147483646
public const val EINTR: CInt = -2147483638
public const val EIO: CInt = -2147483647
public const val EBUSY: CInt = -2147483634
public const val EFAULT: CInt = -2147478783
public const val ETIMEDOUT: CInt = -2147483639
public const val EAGAIN: CInt = -2147483637
public const val EWOULDBLOCK: CInt = -2147483637
public const val EBADF: CInt = -2147459072
public const val EEXIST: CInt = -2147459070
public const val EINVAL: CInt = -2147483643
public const val ENAMETOOLONG: CInt = -2147459068
public const val ENOENT: CInt = -2147459069
public const val EPERM: CInt = -2147483633
public const val ENOTDIR: CInt = -2147459067
public const val EISDIR: CInt = -2147459063
public const val ENOTEMPTY: CInt = -2147459066
public const val ENOSPC: CInt = -2147459065
public const val EROFS: CInt = -2147459064
public const val EMFILE: CInt = -2147459062
public const val EXDEV: CInt = -2147459061
public const val ELOOP: CInt = -2147459060
public const val ENOEXEC: CInt = -2147478782
public const val EPIPE: CInt = -2147459059
public const val IPPROTO_RAW: CInt = 255
public const val MADV_NORMAL: CInt = 1
public const val MADV_SEQUENTIAL: CInt = 2
public const val MADV_RANDOM: CInt = 3
public const val MADV_WILLNEED: CInt = 4
public const val MADV_DONTNEED: CInt = 5
public const val MADV_FREE: CInt = 6
public const val IFF_UP: CInt = 0x0001
public const val IFF_BROADCAST: CInt = 0x0002
public const val IFF_LOOPBACK: CInt = 0x0008
public const val IFF_POINTOPOINT: CInt = 0x0010
public const val IFF_NOARP: CInt = 0x0040
public const val IFF_AUTOUP: CInt = 0x0080
public const val IFF_PROMISC: CInt = 0x0100
public const val IFF_ALLMULTI: CInt = 0x0200
public const val IFF_SIMPLEX: CInt = 0x0800
public const val IFF_LINK: CInt = 0x1000
public const val IFF_AUTO_CONFIGURED: CInt = 0x2000
public const val IFF_CONFIGURING: CInt = 0x4000
public const val IFF_MULTICAST: CInt = 0x8000
public const val AF_UNSPEC: CInt = 0
public const val AF_INET: CInt = 1
public const val AF_APPLETALK: CInt = 2
public const val AF_ROUTE: CInt = 3
public const val AF_LINK: CInt = 4
public const val AF_INET6: CInt = 5
public const val AF_DLI: CInt = 6
public const val AF_IPX: CInt = 7
public const val AF_NOTIFY: CInt = 8
public const val AF_LOCAL: CInt = 9
public const val AF_UNIX: CInt = AF_LOCAL
public const val AF_BLUETOOTH: CInt = 10
public const val PF_UNSPEC: CInt = AF_UNSPEC
public const val PF_INET: CInt = AF_INET
public const val PF_ROUTE: CInt = AF_ROUTE
public const val PF_LINK: CInt = AF_LINK
public const val PF_INET6: CInt = AF_INET6
public const val PF_LOCAL: CInt = AF_LOCAL
public const val PF_UNIX: CInt = AF_UNIX
public const val PF_BLUETOOTH: CInt = AF_BLUETOOTH
public const val IP_OPTIONS: CInt = 1
public const val IP_HDRINCL: CInt = 2
public const val IP_TOS: CInt = 3
public const val IP_TTL: CInt = 4
public const val IP_RECVOPTS: CInt = 5
public const val IP_RECVRETOPTS: CInt = 6
public const val IP_RECVDSTADDR: CInt = 7
public const val IP_RETOPTS: CInt = 8
public const val IP_MULTICAST_IF: CInt = 9
public const val IP_MULTICAST_TTL: CInt = 10
public const val IP_MULTICAST_LOOP: CInt = 11
public const val IP_ADD_MEMBERSHIP: CInt = 12
public const val IP_DROP_MEMBERSHIP: CInt = 13
public const val IP_BLOCK_SOURCE: CInt = 14
public const val IP_UNBLOCK_SOURCE: CInt = 15
public const val IP_ADD_SOURCE_MEMBERSHIP: CInt = 16
public const val IP_DROP_SOURCE_MEMBERSHIP: CInt = 17
public const val TCP_NODELAY: CInt = 0x01
public const val TCP_MAXSEG: CInt = 0x02
public const val TCP_NOPUSH: CInt = 0x04
public const val TCP_NOOPT: CInt = 0x08
public const val IF_NAMESIZE: ULong = 32uL
public const val IFNAMSIZ: ULong = IF_NAMESIZE
public const val IPV6_MULTICAST_IF: CInt = 24
public const val IPV6_MULTICAST_HOPS: CInt = 25
public const val IPV6_MULTICAST_LOOP: CInt = 26
public const val IPV6_UNICAST_HOPS: CInt = 27
public const val IPV6_JOIN_GROUP: CInt = 28
public const val IPV6_LEAVE_GROUP: CInt = 29
public const val IPV6_V6ONLY: CInt = 30
public const val IPV6_PKTINFO: CInt = 31
public const val IPV6_RECVPKTINFO: CInt = 32
public const val IPV6_HOPLIMIT: CInt = 33
public const val IPV6_RECVHOPLIMIT: CInt = 34
public const val IPV6_HOPOPTS: CInt = 35
public const val IPV6_DSTOPTS: CInt = 36
public const val IPV6_RTHDR: CInt = 37
public const val MSG_OOB: CInt = 0x0001
public const val MSG_PEEK: CInt = 0x0002
public const val MSG_DONTROUTE: CInt = 0x0004
public const val MSG_EOR: CInt = 0x0008
public const val MSG_TRUNC: CInt = 0x0010
public const val MSG_CTRUNC: CInt = 0x0020
public const val MSG_WAITALL: CInt = 0x0040
public const val MSG_DONTWAIT: CInt = 0x0080
public const val MSG_BCAST: CInt = 0x0100
public const val MSG_MCAST: CInt = 0x0200
public const val MSG_EOF: CInt = 0x0400
public const val MSG_NOSIGNAL: CInt = 0x0800
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val LOCK_SH: CInt = 0x01
public const val LOCK_EX: CInt = 0x02
public const val LOCK_NB: CInt = 0x04
public const val LOCK_UN: CInt = 0x08
public const val MINSIGSTKSZ: ULong = 8192uL
public const val SIGSTKSZ: ULong = 16384uL
public const val IOV_MAX: CInt = 1024
public const val PATH_MAX: CInt = 1024
public const val SA_NOCLDSTOP: CInt = 0x01
public const val SA_NOCLDWAIT: CInt = 0x02
public const val SA_RESETHAND: CInt = 0x04
public const val SA_NODEFER: CInt = 0x08
public const val SA_RESTART: CInt = 0x10
public const val SA_ONSTACK: CInt = 0x20
public const val SA_SIGINFO: CInt = 0x40
public const val SA_NOMASK: CInt = SA_NODEFER
public const val SA_STACK: CInt = SA_ONSTACK
public const val SA_ONESHOT: CInt = SA_RESETHAND
public const val SS_ONSTACK: CInt = 0x1
public const val SS_DISABLE: CInt = 0x2
public const val FD_SETSIZE: ULong = 1024uL
public const val RTLD_LOCAL: CInt = 0x0
public const val RTLD_NOW: CInt = 0x1
public const val RTLD_GLOBAL: CInt = 0x2
public const val BUFSIZ: CUInt = 8192u
public const val FILENAME_MAX: CUInt = 256u
public const val FOPEN_MAX: CUInt = 128u
public const val L_tmpnam: CUInt = 512u
public const val TMP_MAX: CUInt = 32768u
public const val _PC_CHOWN_RESTRICTED: CInt = 1
public const val _PC_MAX_CANON: CInt = 2
public const val _PC_MAX_INPUT: CInt = 3
public const val _PC_NAME_MAX: CInt = 4
public const val _PC_NO_TRUNC: CInt = 5
public const val _PC_PATH_MAX: CInt = 6
public const val _PC_PIPE_BUF: CInt = 7
public const val _PC_VDISABLE: CInt = 8
public const val _PC_LINK_MAX: CInt = 25
public const val _PC_SYNC_IO: CInt = 26
public const val _PC_ASYNC_IO: CInt = 27
public const val _PC_PRIO_IO: CInt = 28
public const val _PC_SOCK_MAXBUF: CInt = 29
public const val _PC_FILESIZEBITS: CInt = 30
public const val _PC_REC_INCR_XFER_SIZE: CInt = 31
public const val _PC_REC_MAX_XFER_SIZE: CInt = 32
public const val _PC_REC_MIN_XFER_SIZE: CInt = 33
public const val _PC_REC_XFER_ALIGN: CInt = 34
public const val _PC_ALLOC_SIZE_MIN: CInt = 35
public const val _PC_SYMLINK_MAX: CInt = 36
public const val _PC_2_SYMLINKS: CInt = 37
public const val _PC_XATTR_EXISTS: CInt = 38
public const val _PC_XATTR_ENABLED: CInt = 39
public const val FIONBIO: CULong = 0xbe000000uL
public const val FIONREAD: CULong = 0xbe000001uL
public const val FIOSEEKDATA: CULong = 0xbe000002uL
public const val FIOSEEKHOLE: CULong = 0xbe000003uL
public const val _SC_ARG_MAX: CInt = 15
public const val _SC_CHILD_MAX: CInt = 16
public const val _SC_CLK_TCK: CInt = 17
public const val _SC_JOB_CONTROL: CInt = 18
public const val _SC_NGROUPS_MAX: CInt = 19
public const val _SC_OPEN_MAX: CInt = 20
public const val _SC_SAVED_IDS: CInt = 21
public const val _SC_STREAM_MAX: CInt = 22
public const val _SC_TZNAME_MAX: CInt = 23
public const val _SC_VERSION: CInt = 24
public const val _SC_GETGR_R_SIZE_MAX: CInt = 25
public const val _SC_GETPW_R_SIZE_MAX: CInt = 26
public const val _SC_PAGESIZE: CInt = 27
public const val _SC_PAGE_SIZE: CInt = 27
public const val _SC_SEM_NSEMS_MAX: CInt = 28
public const val _SC_SEM_VALUE_MAX: CInt = 29
public const val _SC_SEMAPHORES: CInt = 30
public const val _SC_THREADS: CInt = 31
public const val _SC_IOV_MAX: CInt = 32
public const val _SC_UIO_MAXIOV: CInt = 32
public const val _SC_NPROCESSORS_CONF: CInt = 34
public const val _SC_NPROCESSORS_ONLN: CInt = 35
public const val _SC_ATEXIT_MAX: CInt = 37
public const val _SC_PASS_MAX: CInt = 39
public const val _SC_PHYS_PAGES: CInt = 40
public const val _SC_AVPHYS_PAGES: CInt = 41
public const val _SC_PIPE: CInt = 42
public const val _SC_SELECT: CInt = 43
public const val _SC_POLL: CInt = 44
public const val _SC_MAPPED_FILES: CInt = 45
public const val _SC_THREAD_PROCESS_SHARED: CInt = 46
public const val _SC_THREAD_STACK_MIN: CInt = 47
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 48
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 49
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 50
public const val _SC_REALTIME_SIGNALS: CInt = 51
public const val _SC_MEMORY_PROTECTION: CInt = 52
public const val _SC_SIGQUEUE_MAX: CInt = 53
public const val _SC_RTSIG_MAX: CInt = 54
public const val _SC_MONOTONIC_CLOCK: CInt = 55
public const val _SC_DELAYTIMER_MAX: CInt = 56
public const val _SC_TIMER_MAX: CInt = 57
public const val _SC_TIMERS: CInt = 58
public const val _SC_CPUTIME: CInt = 59
public const val _SC_THREAD_CPUTIME: CInt = 60
public const val _SC_HOST_NAME_MAX: CInt = 61
public const val _SC_REGEXP: CInt = 62
public const val _SC_SYMLOOP_MAX: CInt = 63
public const val _SC_SHELL: CInt = 64
public const val _SC_TTY_NAME_MAX: CInt = 65
public const val _SC_ADVISORY_INFO: CInt = 66
public const val _SC_BARRIERS: CInt = 67
public const val _SC_CLOCK_SELECTION: CInt = 68
public const val _SC_FSYNC: CInt = 69
public const val _SC_IPV6: CInt = 70
public const val _SC_MEMLOCK: CInt = 71
public const val _SC_MEMLOCK_RANGE: CInt = 72
public const val _SC_MESSAGE_PASSING: CInt = 73
public const val _SC_PRIORITIZED_IO: CInt = 74
public const val _SC_PRIORITY_SCHEDULING: CInt = 75
public const val _SC_READER_WRITER_LOCKS: CInt = 76
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 77
public const val _SC_SPAWN: CInt = 78
public const val _SC_SPIN_LOCKS: CInt = 79
public const val _SC_SPORADIC_SERVER: CInt = 80
public const val _SC_SYNCHRONIZED_IO: CInt = 81
public const val _SC_THREAD_PRIO_INHERIT: CInt = 82
public const val _SC_THREAD_PRIO_PROTECT: CInt = 83
public const val _SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 84
public const val _SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 85
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 86
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 87
public const val _SC_TIMEOUTS: CInt = 88
public const val _SC_TRACE: CInt = 89
public const val _SC_TRACE_EVENT_FILTER: CInt = 90
public const val _SC_TRACE_INHERIT: CInt = 91
public const val _SC_TRACE_LOG: CInt = 92
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 93
public const val _SC_V6_ILP32_OFF32: CInt = 94
public const val _SC_V6_ILP32_OFFBIG: CInt = 95
public const val _SC_V6_LP64_OFF64: CInt = 96
public const val _SC_V6_LPBIG_OFFBIG: CInt = 97
public const val _SC_V7_ILP32_OFF32: CInt = 98
public const val _SC_V7_ILP32_OFFBIG: CInt = 99
public const val _SC_V7_LP64_OFF64: CInt = 100
public const val _SC_V7_LPBIG_OFFBIG: CInt = 101
public const val _SC_2_C_BIND: CInt = 102
public const val _SC_2_C_DEV: CInt = 103
public const val _SC_2_CHAR_TERM: CInt = 104
public const val _SC_2_FORT_DEV: CInt = 105
public const val _SC_2_FORT_RUN: CInt = 106
public const val _SC_2_LOCALEDEF: CInt = 107
public const val _SC_2_PBS: CInt = 108
public const val _SC_2_PBS_ACCOUNTING: CInt = 109
public const val _SC_2_PBS_CHECKPOINT: CInt = 110
public const val _SC_2_PBS_LOCATE: CInt = 111
public const val _SC_2_PBS_MESSAGE: CInt = 112
public const val _SC_2_PBS_TRACK: CInt = 113
public const val _SC_2_SW_DEV: CInt = 114
public const val _SC_2_UPE: CInt = 115
public const val _SC_2_VERSION: CInt = 116
public const val _SC_XOPEN_CRYPT: CInt = 117
public const val _SC_XOPEN_ENH_I18N: CInt = 118
public const val _SC_XOPEN_REALTIME: CInt = 119
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 120
public const val _SC_XOPEN_SHM: CInt = 121
public const val _SC_XOPEN_STREAMS: CInt = 122
public const val _SC_XOPEN_UNIX: CInt = 123
public const val _SC_XOPEN_UUCP: CInt = 124
public const val _SC_XOPEN_VERSION: CInt = 125
public const val _SC_BC_BASE_MAX: CInt = 129
public const val _SC_BC_DIM_MAX: CInt = 130
public const val _SC_BC_SCALE_MAX: CInt = 131
public const val _SC_BC_STRING_MAX: CInt = 132
public const val _SC_COLL_WEIGHTS_MAX: CInt = 133
public const val _SC_EXPR_NEST_MAX: CInt = 134
public const val _SC_LINE_MAX: CInt = 135
public const val _SC_LOGIN_NAME_MAX: CInt = 136
public const val _SC_MQ_OPEN_MAX: CInt = 137
public const val _SC_MQ_PRIO_MAX: CInt = 138
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 139
public const val _SC_THREAD_KEYS_MAX: CInt = 140
public const val _SC_THREAD_THREADS_MAX: CInt = 141
public const val _SC_RE_DUP_MAX: CInt = 142
public const val PTHREAD_STACK_MIN: ULong = 8192uL
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(flags = 0u, lock = 0, owner = -1, ownerCount = 0)

// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { flags: 0, unused: Padding::uninit(), mutex: 0 as *mut _, waiter_count: 0, lock: 0, } (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { flags: 0, owner: -1, lock_sem: 0, lock_count: 0, reader_count: 0, writer_count: 0, waiters: [0 as *mut _ (initializer represented at the FFI boundary)
public const val PTHREAD_MUTEX_DEFAULT: CInt = 0
public const val PTHREAD_MUTEX_NORMAL: CInt = 1
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 2
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 3
public const val FIOCLEX: CULong = 0uL
public const val RUSAGE_CHILDREN: CInt = -1
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_RAW: CInt = 3
public const val SOCK_SEQPACKET: CInt = 5
public const val SOCK_NONBLOCK: CInt = 0x00040000
public const val SOCK_CLOEXEC: CInt = 0x00080000
public const val SOL_SOCKET: CInt = -1
public const val SO_ACCEPTCONN: CInt = 0x00000001
public const val SO_BROADCAST: CInt = 0x00000002
public const val SO_DEBUG: CInt = 0x00000004
public const val SO_DONTROUTE: CInt = 0x00000008
public const val SO_KEEPALIVE: CInt = 0x00000010
public const val SO_OOBINLINE: CInt = 0x00000020
public const val SO_REUSEADDR: CInt = 0x00000040
public const val SO_REUSEPORT: CInt = 0x00000080
public const val SO_USELOOPBACK: CInt = 0x00000100
public const val SO_LINGER: CInt = 0x00000200
public const val SO_SNDBUF: CInt = 0x40000001
public const val SO_SNDLOWAT: CInt = 0x40000002
public const val SO_SNDTIMEO: CInt = 0x40000003
public const val SO_RCVBUF: CInt = 0x40000004
public const val SO_RCVLOWAT: CInt = 0x40000005
public const val SO_RCVTIMEO: CInt = 0x40000006
public const val SO_ERROR: CInt = 0x40000007
public const val SO_TYPE: CInt = 0x40000008
public const val SO_NONBLOCK: CInt = 0x40000009
public const val SO_BINDTODEVICE: CInt = 0x4000000a
public const val SO_PEERCRED: CInt = 0x4000000b
public const val SCM_RIGHTS: CInt = 0x01
public const val SOMAXCONN: CInt = 32
public const val NI_MAXHOST: ULong = 1025uL
public const val WNOHANG: CInt = 0x01
public const val WUNTRACED: CInt = 0x02
public const val WCONTINUED: CInt = 0x04
public const val WEXITED: CInt = 0x08
public const val WSTOPPED: CInt = 0x10
public const val WNOWAIT: CInt = 0x20
public const val BUS_ADRALN: CInt = 40
public const val BUS_ADRERR: CInt = 41
public const val BUS_OBJERR: CInt = 42
public const val CLD_EXITED: CInt = 60
public const val CLD_KILLED: CInt = 61
public const val CLD_DUMPED: CInt = 62
public const val CLD_TRAPPED: CInt = 63
public const val CLD_STOPPED: CInt = 64
public const val CLD_CONTINUED: CInt = 65
public const val P_ALL: IdtypeT = 0u
public const val P_PID: IdtypeT = 1u
public const val P_PGID: IdtypeT = 2u
public const val UTIME_OMIT: CLong = 1000000001
public const val UTIME_NOW: CLong = 1000000000
public const val VINTR: ULong = 0uL
public const val VQUIT: ULong = 1uL
public const val VERASE: ULong = 2uL
public const val VKILL: ULong = 3uL
public const val VEOF: ULong = 4uL
public const val VEOL: ULong = 5uL
public const val VMIN: ULong = 4uL
public const val VTIME: ULong = 5uL
public const val VEOL2: ULong = 6uL
public const val VSWTCH: ULong = 7uL
public const val VSTART: ULong = 8uL
public const val VSTOP: ULong = 9uL
public const val VSUSP: ULong = 10uL
public const val IGNBRK: TcflagT = 0x01u
public const val BRKINT: TcflagT = 0x02u
public const val IGNPAR: TcflagT = 0x04u
public const val PARMRK: TcflagT = 0x08u
public const val INPCK: TcflagT = 0x10u
public const val ISTRIP: TcflagT = 0x20u
public const val INLCR: TcflagT = 0x40u
public const val IGNCR: TcflagT = 0x80u
public const val ICRNL: TcflagT = 0x100u
public const val IUCLC: TcflagT = 0x200u
public const val IXON: TcflagT = 0x400u
public const val IXANY: TcflagT = 0x800u
public const val IXOFF: TcflagT = 0x1000u
public const val OPOST: TcflagT = 0x00000001u
public const val OLCUC: TcflagT = 0x00000002u
public const val ONLCR: TcflagT = 0x00000004u
public const val OCRNL: TcflagT = 0x00000008u
public const val ONOCR: TcflagT = 0x00000010u
public const val ONLRET: TcflagT = 0x00000020u
public const val OFILL: TcflagT = 0x00000040u
public const val OFDEL: TcflagT = 0x00000080u
public const val NLDLY: TcflagT = 0x00000100u
public const val NL0: TcflagT = 0x00000000u
public const val NL1: TcflagT = 0x00000100u
public const val CRDLY: TcflagT = 0x00000600u
public const val CR0: TcflagT = 0x00000000u
public const val CR1: TcflagT = 0x00000200u
public const val CR2: TcflagT = 0x00000400u
public const val CR3: TcflagT = 0x00000600u
public const val TABDLY: TcflagT = 0x00001800u
public const val TAB0: TcflagT = 0x00000000u
public const val TAB1: TcflagT = 0x00000800u
public const val TAB2: TcflagT = 0x00001000u
public const val TAB3: TcflagT = 0x00001800u
public const val BSDLY: TcflagT = 0x00002000u
public const val BS0: TcflagT = 0x00000000u
public const val BS1: TcflagT = 0x00002000u
public const val VTDLY: TcflagT = 0x00004000u
public const val VT0: TcflagT = 0x00000000u
public const val VT1: TcflagT = 0x00004000u
public const val FFDLY: TcflagT = 0x00008000u
public const val FF0: TcflagT = 0x00000000u
public const val FF1: TcflagT = 0x00008000u
public const val CSIZE: TcflagT = 0x00000020u
public const val CS5: TcflagT = 0x00000000u
public const val CS6: TcflagT = 0x00000000u
public const val CS7: TcflagT = 0x00000000u
public const val CS8: TcflagT = 0x00000020u
public const val CSTOPB: TcflagT = 0x00000040u
public const val CREAD: TcflagT = 0x00000080u
public const val PARENB: TcflagT = 0x00000100u
public const val PARODD: TcflagT = 0x00000200u
public const val HUPCL: TcflagT = 0x00000400u
public const val CLOCAL: TcflagT = 0x00000800u
public const val XLOBLK: TcflagT = 0x00001000u
public const val CTSFLOW: TcflagT = 0x00002000u
public const val RTSFLOW: TcflagT = 0x00004000u
public val CRTSCTS: TcflagT = RTSFLOW or CTSFLOW
public const val ISIG: TcflagT = 0x00000001u
public const val ICANON: TcflagT = 0x00000002u
public const val XCASE: TcflagT = 0x00000004u
public const val ECHO: TcflagT = 0x00000008u
public const val ECHOE: TcflagT = 0x00000010u
public const val ECHOK: TcflagT = 0x00000020u
public const val ECHONL: TcflagT = 0x00000040u
public const val NOFLSH: TcflagT = 0x00000080u
public const val TOSTOP: TcflagT = 0x00000100u
public const val IEXTEN: TcflagT = 0x00000200u
public const val ECHOCTL: TcflagT = 0x00000400u
public const val ECHOPRT: TcflagT = 0x00000800u
public const val ECHOKE: TcflagT = 0x00001000u
public const val FLUSHO: TcflagT = 0x00002000u
public const val PENDIN: TcflagT = 0x00004000u
public const val TCGB_CTS: CInt = 0x01
public const val TCGB_DSR: CInt = 0x02
public const val TCGB_RI: CInt = 0x04
public const val TCGB_DCD: CInt = 0x08
public const val TIOCM_CTS: CInt = TCGB_CTS
public const val TIOCM_CD: CInt = TCGB_DCD
public const val TIOCM_CAR: CInt = TCGB_DCD
public const val TIOCM_RI: CInt = TCGB_RI
public const val TIOCM_RNG: CInt = TCGB_RI
public const val TIOCM_DSR: CInt = TCGB_DSR
public const val TIOCM_DTR: CInt = 0x10
public const val TIOCM_RTS: CInt = 0x20
public const val B0: SpeedT = 0x00u
public const val B50: SpeedT = 0x01u
public const val B75: SpeedT = 0x02u
public const val B110: SpeedT = 0x03u
public const val B134: SpeedT = 0x04u
public const val B150: SpeedT = 0x05u
public const val B200: SpeedT = 0x06u
public const val B300: SpeedT = 0x07u
public const val B600: SpeedT = 0x08u
public const val B1200: SpeedT = 0x09u
public const val B1800: SpeedT = 0x0Au
public const val B2400: SpeedT = 0x0Bu
public const val B4800: SpeedT = 0x0Cu
public const val B9600: SpeedT = 0x0Du
public const val B19200: SpeedT = 0x0Eu
public const val B38400: SpeedT = 0x0Fu
public const val B57600: SpeedT = 0x10u
public const val B115200: SpeedT = 0x11u
public const val B230400: SpeedT = 0x12u
public const val B31250: SpeedT = 0x13u
public const val TCSANOW: CInt = 0x01
public const val TCSADRAIN: CInt = 0x02
public const val TCSAFLUSH: CInt = 0x04
public const val TCOOFF: CInt = 0x01
public const val TCOON: CInt = 0x02
public const val TCIOFF: CInt = 0x04
public const val TCION: CInt = 0x08
public const val TCIFLUSH: CInt = 0x01
public const val TCOFLUSH: CInt = 0x02
public const val TCIOFLUSH: CInt = 0x03
public const val TCGETA: CULong = 0x8000uL
public const val TCSETA: CULong = TCGETA + 1u
public const val TCSETAF: CULong = TCGETA + 2u
public const val TCSETAW: CULong = TCGETA + 3u
public const val TCSBRK: CULong = TCGETA + 5u
public const val TCFLSH: CULong = TCGETA + 6u
public const val TCXONC: CULong = TCGETA + 7u
public const val TCGETBITS: CULong = TCGETA + 9u
public const val TCSETDTR: CULong = TCGETA + 10u
public const val TCSETRTS: CULong = TCGETA + 11u
public const val TIOCGWINSZ: CULong = TCGETA + 12u
public const val TIOCSWINSZ: CULong = TCGETA + 13u
public const val TIOCGPGRP: CULong = TCGETA + 15u
public const val TIOCSPGRP: CULong = TCGETA + 16u
public const val TIOCSCTTY: CULong = TCGETA + 17u
public const val TIOCMGET: CULong = TCGETA + 18u
public const val TIOCMSET: CULong = TCGETA + 19u
public const val TIOCSBRK: CULong = TCGETA + 20u
public const val TIOCCBRK: CULong = TCGETA + 21u
public const val TIOCMBIS: CULong = TCGETA + 22u
public const val TIOCMBIC: CULong = TCGETA + 23u
public const val TIOCGSID: CULong = TCGETA + 24u
public const val TIOCOUTQ: CULong = TCGETA + 25u
public const val TIOCEXCL: CULong = TCGETA + 26u
public const val TIOCNXCL: CULong = TCGETA + 27u
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
public const val EMPTY: CShort = 0
public const val BOOT_TIME: CShort = 1
public const val OLD_TIME: CShort = 2
public const val NEW_TIME: CShort = 3
public const val USER_PROCESS: CShort = 4
public const val INIT_PROCESS: CShort = 5
public const val LOGIN_PROCESS: CShort = 6
public const val DEAD_PROCESS: CShort = 7
public val LOG_PID: CInt = 1 shl 12
public val LOG_CONS: CInt = 2 shl 12
public val LOG_ODELAY: CInt = 4 shl 12
public val LOG_NDELAY: CInt = 8 shl 12
public val LOG_SERIAL: CInt = 16 shl 12
public val LOG_PERROR: CInt = 32 shl 12
public val LOG_NOWAIT: CInt = 64 shl 12
public const val POSIX_SPAWN_RESETIDS: CInt = 0x01
public const val POSIX_SPAWN_SETPGROUP: CInt = 0x02
public const val POSIX_SPAWN_SETSIGDEF: CInt = 0x10
public const val POSIX_SPAWN_SETSIGMASK: CInt = 0x20
public const val POSIX_SPAWN_SETSID: CInt = 0x40

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr?

public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?

public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun fDCLR(fd: CInt, set: FdSet?)

public expect fun fDISSET(fd: CInt, set: FdSet?): Boolean

public expect fun fDSET(fd: CInt, set: FdSet?)

public expect fun fDZERO(set: FdSet?)

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, priority: CInt): CInt

public expect fun endusershell()

public expect fun getpass(prompt: String?): String?

public expect fun getusershell(): String?

public expect fun issetugid(): CInt

public expect fun setusershell()

public expect fun utimensat(fd: CInt, path: String?, times: Timespec?, flag: CInt): CInt

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt

public expect fun errnop(): CInt?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUInt)

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: Ifaddrs?)

public expect fun ppoll(fds: Pollfd?, numfds: NfdsT, timeout: Timespec?, sigMask: SigsetT?): CInt

public expect fun getspent(): Spwd?

public expect fun getspentR(pwd: Spwd?, buf: String?, bufferSize: ULong, res: COpaquePointer?): CInt

public expect fun setspent()

public expect fun endspent()

public expect fun getspnam(name: String?): Spwd?

public expect fun getspnamR(name: String?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): CInt

public expect fun sgetspent(line: String?): Spwd?

public expect fun sgetspentR(line: String?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): CInt

public expect fun fgetspent(file: FILE?): Spwd?

public expect fun fgetspentR(file: FILE?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt

public expect fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt

public expect fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt

public expect fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt

public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt

public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt

public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt

public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt

public expect fun valloc(numBytes: ULong): COpaquePointer?

public expect fun mallocUsableSize(ptr: COpaquePointer?): ULong

public expect fun memalign(align: ULong, size: ULong): COpaquePointer?

public expect fun setgroups(ngroups: CInt, ptr: GidT?): CInt

public expect fun initgroups(name: String?, basegid: GidT): CInt

public expect fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt

public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt

public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt

public expect fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt

public expect fun globfree(pglob: GlobT?)

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT

public expect fun nlLanginfo(item: NlItem): String?

public expect fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt

public expect fun accept4(socket: CInt, address: Sockaddr?, addressLength: SocklenT?, flags: CInt): CInt

public expect fun writev(fd: CInt, iov: Iovec?, count: CInt): SsizeT

public expect fun readv(fd: CInt, iov: Iovec?, count: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getgrouplist(user: String?, basegroup: GidT, grouplist: GidT?, groupcount: CInt?): CInt

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun sigsuspend(mask: SigsetT?): CInt

public expect fun semClose(sem: SemT?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT?

public expect fun getgrnam(name: String?): Group?

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getpwent(): Passwd?

public expect fun setpwent()

public expect fun endpwent()

public expect fun endgrent()

public expect fun getgrent(): Group?

public expect fun setgrent()

public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt

public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt

public expect fun getgrgid(gid: GidT): Group?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun sethostname(name: String?, len: ULong): CInt

public expect fun uname(buf: Utsname?): CInt

public expect fun getutxent(): Utmpx?

public expect fun getutxid(ut: Utmpx?): Utmpx?

public expect fun getutxline(ut: Utmpx?): Utmpx?

public expect fun pututxline(ut: Utmpx?): Utmpx?

public expect fun setutxent()

public expect fun endutxent()

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt

public expect fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt

public expect fun getitimer(which: CInt, currValue: Itimerval?): CInt

public expect fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt

public expect fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt

public expect fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong

public expect fun regfree(preg: RegexT?)

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtype: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt

public expect fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt

public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer?

public expect fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer?

public expect fun hcreate(nelt: ULong): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: ENTRY, action: ACTION): ENTRY?

public expect fun drand48(): CDouble

public expect fun erand48(xseed: CUShort?): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: CUShort?): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: CUShort?): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: CUShort?): CUShort?

public expect fun lcong48(p: CUShort?)

public expect fun clearenv(): CInt

public expect fun ctermid(s: String?): String?

public expect fun sync()

public expect fun getpagesize(): CInt

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsInit(fileActions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnFileActionsDestroy(fileActions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnFileActionsAddopen(fileActions: PosixSpawnFileActionsT?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(fileActions: PosixSpawnFileActionsT?, fildes: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(fileActions: PosixSpawnFileActionsT?, fildes: CInt, newfildes: CInt): CInt

public expect fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt

public expect fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt

public expect fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt

public expect fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, pgroup: PidT?): CInt

public expect fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, pgroup: PidT): CInt

public expect fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, sigdefault: SigsetT?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, sigdefault: SigsetT?): CInt

public expect fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, sigmask: SigsetT?): CInt

public expect fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, sigmask: SigsetT?): CInt

public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt

public expect fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt

public expect fun strncasecmpL(string1: String?, string2: String?, length: ULong, locale: LocaleT): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt

public expect fun memmem(source: COpaquePointer?, sourceLength: ULong, search: COpaquePointer?, searchLength: ULong): COpaquePointer?

public expect fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT?): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, buffer: String?, length: ULong): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt
