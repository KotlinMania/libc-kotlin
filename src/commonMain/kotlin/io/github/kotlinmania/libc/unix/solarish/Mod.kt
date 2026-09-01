// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

internal const val _TIOC: CInt = 0x5400
internal const val tIOC: CInt = 0x7400
internal const val STR: CInt = 0x5300
internal const val _IOC: CULong = 0x54000000uL

public typealias CaddrT = String?
public typealias ClockidT = CInt
public typealias BlkcntT = CLong
public typealias ClockT = CLong
public typealias DaddrT = CLong
public typealias DevT = CULong
public typealias FsblkcntT = CULong
public typealias FsfilcntT = CULong
public typealias InoT = CULong
public typealias KeyT = CInt
public typealias MajorT = CUInt
public typealias MinorT = CUInt
public typealias ModeT = CUInt
public typealias NlinkT = CUInt
public typealias RlimT = CULong
public typealias SpeedT = CUInt
public typealias TcflagT = CUInt
public typealias TimeT = CLong
public typealias TimerT = CInt
public typealias WcharT = CInt
public typealias NfdsT = CULong
public typealias ProjidT = CInt
public typealias ZoneidT = CInt
public typealias PsetidT = CInt
public typealias ProcessoridT = CInt
public typealias ChipidT = CInt
public typealias CtidT = IdT
public typealias SusecondsT = CLong
public typealias OffT = CLong
public typealias UsecondsT = CUInt
public typealias SocklenT = CUInt
public typealias SaFamilyT = UShort
public typealias PthreadT = CUInt
public typealias PthreadKeyT = CUInt
public typealias ThreadT = CUInt
public typealias BlksizeT = CInt
public typealias NlItem = CInt
public typealias MqdT = COpaquePointer?
public typealias IdT = CInt
public typealias IdtypeT = CUInt
public typealias ShmattT = CULong
public typealias LgrpIdT = IdT
public typealias LgrpMemSizeT = CLongLong
public typealias LgrpCookieT = UintptrT
public typealias LgrpContentT = CUInt
public typealias LgrpLatBetweenT = CUInt
public typealias LgrpMemSizeFlagT = CUInt
public typealias LgrpViewT = CUInt
public typealias PosixSpawnattrT = COpaquePointer?
public typealias PosixSpawnFileActionsT = COpaquePointer?

public data class InAddr(
    val sAddr: InAddrT,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class IpMreqSource(
    val imrMultiaddr: InAddr,
    val imrSourceaddr: InAddr,
    val imrInterface: InAddr,
)

public data class IpcPerm(
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: ModeT,
    val seq: CUInt,
    val key: KeyT,
)

public data class Sockaddr(
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class SockaddrIn(
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class SockaddrIn6(
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
    val sin6SrcId: UInt,
)

public data class InPktinfo(
    val ipiIfindex: CUInt,
    val ipiSpecDst: InAddr,
    val ipiAddr: InAddr,
)

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: CUInt,
)

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UidT,
    val pwGid: GidT,
    val pwAge: String?,
    val pwComment: String?,
    val pwGecos: String?,
    val pwDir: String?,
    val pwShell: String?,
)

public data class Ifaddrs(
    val ifaNext: Ifaddrs?,
    val ifaName: String?,
    val ifaFlags: ULong,
    val ifaAddr: Sockaddr?,
    val ifaNetmask: Sockaddr?,
    val ifaDstaddr: Sockaddr?,
    val ifaData: COpaquePointer?,
)

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
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

public data class PthreadAttrT(
    val pthreadAttrp: COpaquePointer?,
)

public data class PthreadMutexT(
    val pthreadMutexFlag1: UShort,
    val pthreadMutexFlag2: UByte,
    val pthreadMutexCeiling: UByte,
    val pthreadMutexType: UShort,
    val pthreadMutexMagic: UShort,
    val pthreadMutexLock: ULong,
    val pthreadMutexData: ULong,
)

public data class PthreadMutexattrT(
    val pthreadMutexattrp: COpaquePointer?,
)

public data class PthreadCondT(
    val pthreadCondFlag: UByteArray,
    val pthreadCondType: UShort,
    val pthreadCondMagic: UShort,
    val pthreadCondData: ULong,
)

public data class PthreadCondattrT(
    val pthreadCondattrp: COpaquePointer?,
)

public data class PthreadRwlockT(
    val pthreadRwlockReaders: Int,
    val pthreadRwlockType: UShort,
    val pthreadRwlockMagic: UShort,
    val pthreadRwlockMutex: PthreadMutexT,
    val pthreadRwlockReadercv: PthreadCondT,
    val pthreadRwlockWritercv: PthreadCondT,
)

public data class PthreadRwlockattrT(
    val pthreadRwlockattrp: COpaquePointer?,
)

public data class Dirent(
    val dIno: InoT,
    val dOff: OffT,
    val dReclen: UShort,
    val dName: ByteArray,
)

public data class GlobT(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
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

public data class SigsetT(
    val bits: UIntArray,
)

public data class Sigaction(
    val saFlags: CInt,
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
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
    val fBasetype: ByteArray,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fFstr: ByteArray,
)

public data class SendfilevecT(
    val sfvFd: CInt,
    val sfvFlag: CUInt,
    val sfvOff: OffT,
    val sfvLen: ULong,
)

public data class SchedParam(
    val schedPriority: CInt,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stFstype: ByteArray,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cCc: List<CcT>,
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

public data class SemT(
    val semCount: UInt,
    val semType: UShort,
    val semMagic: UShort,
    val semPad1: ULongArray,
    val semPad2: ULongArray,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lSysid: CInt,
    val lPid: PidT,
    val lPad: LongArray,
)

public data class IfNameindex(
    val ifIndex: CUInt,
    val ifName: String?,
)

public data class MqAttr(
    val mqFlags: CLong,
    val mqMaxmsg: CLong,
    val mqMsgsize: CLong,
    val mqCurmsgs: CLong,
)

public data class PortEvent(
    val portevEvents: CInt,
    val portevSource: CUShort,
    val portevPad: CUShort,
    val portevObject: UintptrT,
    val portevUser: COpaquePointer?,
)

public data class PortNotify(
    val portnfyPort: CInt,
    val portnfyUser: COpaquePointer?,
)

public data class AioResultT(
    val aioReturn: SsizeT,
    val aioErrno: CInt,
)

public data class ExitStatus(
    val eTermination: CShort,
    val eExit: CShort,
)

public data class Utmp(
    val utUser: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utPid: CShort,
    val utType: CShort,
    val utExit: ExitStatus,
    val utTime: TimeT,
)

public data class Timex(
    val modes: UInt,
    val offset: Int,
    val freq: Int,
    val maxerror: Int,
    val esterror: Int,
    val status: Int,
    val constant: Int,
    val precision: Int,
    val tolerance: Int,
    val ppsfreq: Int,
    val jitter: Int,
    val shift: Int,
    val stabil: Int,
    val jitcnt: Int,
    val calcnt: Int,
    val errcnt: Int,
    val stbcnt: Int,
)

public data class Ntptimeval(
    val time: Timeval,
    val maxerror: Int,
    val esterror: Int,
)

public data class MmapobjResultT(
    val mrAddr: CaddrT,
    val mrMsize: ULong,
    val mrFsize: ULong,
    val mrOffset: ULong,
    val mrProt: CUInt,
    val mrFlags: CUInt,
)

public data class LgrpAffinityArgsT(
    val idtype: IdtypeT,
    val id: IdT,
    val lgrp: LgrpIdT,
    val aff: LgrpAffinityT,
)

public data class ProcessorInfoT(
    val piState: CInt,
    val piProcessorType: ByteArray,
    val piFputypes: ByteArray,
    val piClock: CInt,
)

public data class Option(
    val name: String?,
    val hasArg: CInt,
    val flag: CInt?,
    val value: CInt,
)

public data class SockaddrUn(
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
)

public data class FdSet(
    val fdsBits: LongArray,
    val fdsBits2: IntArray,
)

public data class SockaddrStorage(
    val ssFamily: SaFamilyT,
    val ssAlign: Long,
)

public data class SockaddrDl(
    val sdlFamily: CUShort,
    val sdlIndex: CUShort,
    val sdlType: CUChar,
    val sdlNlen: CUChar,
    val sdlAlen: CUChar,
    val sdlSlen: CUChar,
    val sdlData: ByteArray,
)

public data class Sigevent(
    val sigevNotify: CInt,
    val sigevSigno: CInt,
    val sigevValue: Sigval,
    val ssSp: COpaquePointer?,
    val sigevNotifyAttributes: PthreadAttrT?,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siErrno: CInt,
    val siPad: CInt,
    val dataPad: IntArray,
    val siAddr: COpaquePointer? = null,
    val siValue: Sigval? = null,
    val siPid: PidT? = null,
    val siUid: UidT? = null,
    val siStatus: CInt? = null,
    val siUtime: CLong? = null,
    val siStime: CLong? = null,
)

// C union; only one variant is valid at a time.
public data class Pad128T(
    val l: IntArray? = null,
)

// C union; only one variant is valid at a time.
public data class Upad128T(
    val l: UIntArray? = null,
)

public const val LC_CTYPE: CInt = 0
public const val LC_NUMERIC: CInt = 1
public const val LC_TIME: CInt = 2
public const val LC_COLLATE: CInt = 3
public const val LC_MONETARY: CInt = 4
public const val LC_MESSAGES: CInt = 5
public const val LC_ALL: CInt = 6
public val LC_CTYPE_MASK: CInt = 1 shl LC_CTYPE
public val LC_NUMERIC_MASK: CInt = 1 shl LC_NUMERIC
public val LC_TIME_MASK: CInt = 1 shl LC_TIME
public val LC_COLLATE_MASK: CInt = 1 shl LC_COLLATE
public val LC_MONETARY_MASK: CInt = 1 shl LC_MONETARY
public val LC_MESSAGES_MASK: CInt = 1 shl LC_MESSAGES
public val LC_ALL_MASK: CInt = LC_CTYPE_MASK or LC_NUMERIC_MASK or LC_TIME_MASK or LC_COLLATE_MASK or LC_MONETARY_MASK or LC_MESSAGES_MASK
public const val DAY_1: NlItem = 1
public const val DAY_2: NlItem = 2
public const val DAY_3: NlItem = 3
public const val DAY_4: NlItem = 4
public const val DAY_5: NlItem = 5
public const val DAY_6: NlItem = 6
public const val DAY_7: NlItem = 7
public const val ABDAY_1: NlItem = 8
public const val ABDAY_2: NlItem = 9
public const val ABDAY_3: NlItem = 10
public const val ABDAY_4: NlItem = 11
public const val ABDAY_5: NlItem = 12
public const val ABDAY_6: NlItem = 13
public const val ABDAY_7: NlItem = 14
public const val MON_1: NlItem = 15
public const val MON_2: NlItem = 16
public const val MON_3: NlItem = 17
public const val MON_4: NlItem = 18
public const val MON_5: NlItem = 19
public const val MON_6: NlItem = 20
public const val MON_7: NlItem = 21
public const val MON_8: NlItem = 22
public const val MON_9: NlItem = 23
public const val MON_10: NlItem = 24
public const val MON_11: NlItem = 25
public const val MON_12: NlItem = 26
public const val ABMON_1: NlItem = 27
public const val ABMON_2: NlItem = 28
public const val ABMON_3: NlItem = 29
public const val ABMON_4: NlItem = 30
public const val ABMON_5: NlItem = 31
public const val ABMON_6: NlItem = 32
public const val ABMON_7: NlItem = 33
public const val ABMON_8: NlItem = 34
public const val ABMON_9: NlItem = 35
public const val ABMON_10: NlItem = 36
public const val ABMON_11: NlItem = 37
public const val ABMON_12: NlItem = 38
public const val RADIXCHAR: NlItem = 39
public const val THOUSEP: NlItem = 40
public const val YESSTR: NlItem = 41
public const val NOSTR: NlItem = 42
public const val CRNCYSTR: NlItem = 43
public const val D_T_FMT: NlItem = 44
public const val D_FMT: NlItem = 45
public const val T_FMT: NlItem = 46
public const val AM_STR: NlItem = 47
public const val PM_STR: NlItem = 48
public const val CODESET: NlItem = 49
public const val T_FMT_AMPM: NlItem = 50
public const val ERA: NlItem = 51
public const val ERA_D_FMT: NlItem = 52
public const val ERA_D_T_FMT: NlItem = 53
public const val ERA_T_FMT: NlItem = 54
public const val ALT_DIGITS: NlItem = 55
public const val YESEXPR: NlItem = 56
public const val NOEXPR: NlItem = 57
public const val _DATE_FMT: NlItem = 58
public const val MAXSTRMSG: NlItem = 58
public const val PATH_MAX: CInt = 1024
public const val SA_ONSTACK: CInt = 0x00000001
public const val SA_RESETHAND: CInt = 0x00000002
public const val SA_RESTART: CInt = 0x00000004
public const val SA_SIGINFO: CInt = 0x00000008
public const val SA_NODEFER: CInt = 0x00000010
public const val SA_NOCLDWAIT: CInt = 0x00010000
public const val SA_NOCLDSTOP: CInt = 0x00020000
public const val SS_ONSTACK: CInt = 1
public const val SS_DISABLE: CInt = 2
public const val FIOCLEX: CInt = 0x20006601
public const val FIONCLEX: CInt = 0x20006602
public const val FIONREAD: CInt = 0x4004667f
public const val FIONBIO: CInt = 0x8004667e.toInt()
public const val FIOASYNC: CInt = 0x8004667d.toInt()
public const val FIOSETOWN: CInt = 0x8004667c.toInt()
public const val FIOGETOWN: CInt = 0x4004667b
public const val SIGCHLD: CInt = 18
public const val SIGCLD: CInt = SIGCHLD
public const val SIGBUS: CInt = 10
public const val SIG_BLOCK: CInt = 1
public const val SIG_UNBLOCK: CInt = 2
public const val SIG_SETMASK: CInt = 3
public const val AIO_CANCELED: CInt = 0
public const val AIO_ALLDONE: CInt = 1
public const val AIO_NOTCANCELED: CInt = 2
public const val LIO_NOP: CInt = 0
public const val LIO_READ: CInt = 1
public const val LIO_WRITE: CInt = 2
public const val LIO_NOWAIT: CInt = 0
public const val LIO_WAIT: CInt = 1
public const val SIGEV_NONE: CInt = 1
public const val SIGEV_SIGNAL: CInt = 2
public const val SIGEV_THREAD: CInt = 3
public const val SIGEV_PORT: CInt = 4
public const val CLD_EXITED: CInt = 1
public const val CLD_KILLED: CInt = 2
public const val CLD_DUMPED: CInt = 3
public const val CLD_TRAPPED: CInt = 4
public const val CLD_STOPPED: CInt = 5
public const val CLD_CONTINUED: CInt = 6
public const val IP_RECVDSTADDR: CInt = 0x7
public const val IP_PKTINFO: CInt = 0x1a
public const val IP_DONTFRAG: CInt = 0x1b
public const val IP_SEC_OPT: CInt = 0x22
public const val IPV6_UNICAST_HOPS: CInt = 0x5
public const val IPV6_MULTICAST_IF: CInt = 0x6
public const val IPV6_MULTICAST_HOPS: CInt = 0x7
public const val IPV6_MULTICAST_LOOP: CInt = 0x8
public const val IPV6_PKTINFO: CInt = 0xb
public const val IPV6_RECVPKTINFO: CInt = 0x12
public const val IPV6_RECVTCLASS: CInt = 0x19
public const val IPV6_DONTFRAG: CInt = 0x21
public const val IPV6_SEC_OPT: CInt = 0x22
public const val IPV6_TCLASS: CInt = 0x26
public const val IPV6_V6ONLY: CInt = 0x27
public const val IPV6_BOUND_IF: CInt = 0x41
public const val FD_SETSIZE: ULong = 65536uL
public const val ST_RDONLY: CULong = 1uL
public const val ST_NOSUID: CULong = 2uL
public const val NI_MAXHOST: SocklenT = 1025u
public const val NI_MAXSERV: SocklenT = 32u
public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val RAND_MAX: CInt = 32767
public const val EOF: CInt = -1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val SEEK_DATA: CInt = 3
public const val SEEK_HOLE: CInt = 4
public const val _IOFBF: CInt = 0
public const val _IONBF: CInt = 4
public const val _IOLBF: CInt = 64
public const val BUFSIZ: CUInt = 1024u
public const val FOPEN_MAX: CUInt = 20u
public const val FILENAME_MAX: CUInt = 1024u
public const val L_tmpnam: CUInt = 25u
public const val TMP_MAX: CUInt = 17576u
public const val PIPE_BUF: CInt = 5120
public const val GRND_NONBLOCK: CUInt = 0x0001u
public const val GRND_RANDOM: CUInt = 0x0002u
public const val O_RDONLY: CInt = 0
public const val O_WRONLY: CInt = 1
public const val O_RDWR: CInt = 2
public const val O_NDELAY: CInt = 0x04
public const val O_APPEND: CInt = 8
public const val O_DSYNC: CInt = 0x40
public const val O_RSYNC: CInt = 0x8000
public const val O_CREAT: CInt = 256
public const val O_EXCL: CInt = 1024
public const val O_NOCTTY: CInt = 2048
public const val O_TRUNC: CInt = 512
public const val O_NOFOLLOW: CInt = 0x20000
public const val O_SEARCH: CInt = 0x200000
public const val O_EXEC: CInt = 0x400000
public const val O_CLOEXEC: CInt = 0x800000
public const val O_ACCMODE: CInt = 0x600003
public const val O_XATTR: CInt = 0x4000
public const val O_DIRECTORY: CInt = 0x1000000
public const val S_IFIFO: ModeT = 4096u
public const val S_IFCHR: ModeT = 8192u
public const val S_IFBLK: ModeT = 24576u
public const val S_IFDIR: ModeT = 16384u
public const val S_IFREG: ModeT = 32768u
public const val S_IFLNK: ModeT = 40960u
public const val S_IFSOCK: ModeT = 49152u
public const val S_IFMT: ModeT = 61440u
public const val S_IEXEC: ModeT = 64u
public const val S_IWRITE: ModeT = 128u
public const val S_IREAD: ModeT = 256u
public const val S_IRWXU: ModeT = 448u
public const val S_IXUSR: ModeT = 64u
public const val S_IWUSR: ModeT = 128u
public const val S_IRUSR: ModeT = 256u
public const val S_IRWXG: ModeT = 56u
public const val S_IXGRP: ModeT = 8u
public const val S_IWGRP: ModeT = 16u
public const val S_IRGRP: ModeT = 32u
public const val S_IRWXO: ModeT = 7u
public const val S_IXOTH: ModeT = 1u
public const val S_IWOTH: ModeT = 2u
public const val S_IROTH: ModeT = 4u
public const val F_OK: CInt = 0
public const val R_OK: CInt = 4
public const val W_OK: CInt = 2
public const val X_OK: CInt = 1
public const val F_LOCK: CInt = 1
public const val F_TEST: CInt = 3
public const val F_TLOCK: CInt = 2
public const val F_ULOCK: CInt = 0
public const val F_SETLK: CInt = 6
public const val F_SETLKW: CInt = 7
public const val F_GETLK: CInt = 14
public const val F_ALLOCSP: CInt = 10
public const val F_FREESP: CInt = 11
public const val F_BLOCKS: CInt = 18
public const val F_BLKSIZE: CInt = 19
public const val F_SHARE: CInt = 40
public const val F_UNSHARE: CInt = 41
public const val F_ISSTREAM: CInt = 13
public const val F_PRIV: CInt = 15
public const val F_NPRIV: CInt = 16
public const val F_QUOTACTL: CInt = 17
public const val F_GETOWN: CInt = 23
public const val F_SETOWN: CInt = 24
public const val F_REVOKE: CInt = 25
public const val F_HASREMOTELOCKS: CInt = 26
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGABRT: CInt = 6
public const val SIGEMT: CInt = 7
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGSEGV: CInt = 11
public const val SIGSYS: CInt = 12
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val SIGUSR1: CInt = 16
public const val SIGUSR2: CInt = 17
public const val SIGPWR: CInt = 19
public const val SIGWINCH: CInt = 20
public const val SIGURG: CInt = 21
public const val SIGPOLL: CInt = 22
public const val SIGIO: CInt = SIGPOLL
public const val SIGSTOP: CInt = 23
public const val SIGTSTP: CInt = 24
public const val SIGCONT: CInt = 25
public const val SIGTTIN: CInt = 26
public const val SIGTTOU: CInt = 27
public const val SIGVTALRM: CInt = 28
public const val SIGPROF: CInt = 29
public const val SIGXCPU: CInt = 30
public const val SIGXFSZ: CInt = 31
public const val WNOHANG: CInt = 0x40
public const val WUNTRACED: CInt = 0x04
public const val WEXITED: CInt = 0x01
public const val WTRAPPED: CInt = 0x02
public const val WSTOPPED: CInt = WUNTRACED
public const val WCONTINUED: CInt = 0x08
public const val WNOWAIT: CInt = 0x80
public const val AT_FDCWD: CInt = 0xffd19553.toInt()
public const val AT_SYMLINK_NOFOLLOW: CInt = 0x1000
public const val AT_SYMLINK_FOLLOW: CInt = 0x2000
public const val AT_REMOVEDIR: CInt = 0x1
public const val _AT_TRIGGER: CInt = 0x2
public const val AT_EACCESS: CInt = 0x4
public const val P_PID: IdtypeT = 0u
public const val P_PPID: IdtypeT = 1u
public const val P_PGID: IdtypeT = 2u
public const val P_SID: IdtypeT = 3u
public const val P_CID: IdtypeT = 4u
public const val P_UID: IdtypeT = 5u
public const val P_GID: IdtypeT = 6u
public const val P_ALL: IdtypeT = 7u
public const val P_LWPID: IdtypeT = 8u
public const val P_TASKID: IdtypeT = 9u
public const val P_PROJID: IdtypeT = 10u
public const val P_POOLID: IdtypeT = 11u
public const val P_ZONEID: IdtypeT = 12u
public const val P_CTID: IdtypeT = 13u
public const val P_CPUID: IdtypeT = 14u
public const val P_PSETID: IdtypeT = 15u
public const val PBIND_NONE: ProcessoridT = -1
public const val PBIND_QUERY: ProcessoridT = -2
public const val PS_NONE: CInt = -1
public const val PS_QUERY: CInt = -2
public const val PS_MYID: CInt = -3
public const val PS_SOFT: CInt = -4
public const val PS_HARD: CInt = -5
public const val PS_QUERY_TYPE: CInt = -6
public const val PS_PRIVATE: CInt = 2
public const val UTIME_OMIT: CLong = -2
public const val UTIME_NOW: CLong = -1
public const val PROT_NONE: CInt = 0
public const val PROT_READ: CInt = 1
public const val PROT_WRITE: CInt = 2
public const val PROT_EXEC: CInt = 4
public const val MAP_SHARED: CInt = 0x0001
public const val MAP_PRIVATE: CInt = 0x0002
public const val MAP_FIXED: CInt = 0x0010
public const val MAP_NORESERVE: CInt = 0x40
public const val MAP_ANON: CInt = 0x0100
public const val MAP_ANONYMOUS: CInt = 0x0100
public const val MAP_RENAME: CInt = 0x20
public const val MAP_ALIGN: CInt = 0x200
public const val MAP_TEXT: CInt = 0x400
public const val MAP_INITDATA: CInt = 0x800
public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val MS_SYNC: CInt = 0x0004
public const val MS_ASYNC: CInt = 0x0001
public const val MS_INVALIDATE: CInt = 0x0002
public const val MMOBJ_PADDING: CUInt = 0x10000u
public const val MMOBJ_INTERPRET: CUInt = 0x20000u
public const val MR_PADDING: CUInt = 0x1u
public const val MR_HDR_ELF: CUInt = 0x2u
public const val EPERM: CInt = 1
public const val ENOENT: CInt = 2
public const val ESRCH: CInt = 3
public const val EINTR: CInt = 4
public const val EIO: CInt = 5
public const val ENXIO: CInt = 6
public const val E2BIG: CInt = 7
public const val ENOEXEC: CInt = 8
public const val EBADF: CInt = 9
public const val ECHILD: CInt = 10
public const val EAGAIN: CInt = 11
public const val ENOMEM: CInt = 12
public const val EACCES: CInt = 13
public const val EFAULT: CInt = 14
public const val ENOTBLK: CInt = 15
public const val EBUSY: CInt = 16
public const val EEXIST: CInt = 17
public const val EXDEV: CInt = 18
public const val ENODEV: CInt = 19
public const val ENOTDIR: CInt = 20
public const val EISDIR: CInt = 21
public const val EINVAL: CInt = 22
public const val ENFILE: CInt = 23
public const val EMFILE: CInt = 24
public const val ENOTTY: CInt = 25
public const val ETXTBSY: CInt = 26
public const val EFBIG: CInt = 27
public const val ENOSPC: CInt = 28
public const val ESPIPE: CInt = 29
public const val EROFS: CInt = 30
public const val EMLINK: CInt = 31
public const val EPIPE: CInt = 32
public const val EDOM: CInt = 33
public const val ERANGE: CInt = 34
public const val ENOMSG: CInt = 35
public const val EIDRM: CInt = 36
public const val ECHRNG: CInt = 37
public const val EL2NSYNC: CInt = 38
public const val EL3HLT: CInt = 39
public const val EL3RST: CInt = 40
public const val ELNRNG: CInt = 41
public const val EUNATCH: CInt = 42
public const val ENOCSI: CInt = 43
public const val EL2HLT: CInt = 44
public const val EDEADLK: CInt = 45
public const val ENOLCK: CInt = 46
public const val ECANCELED: CInt = 47
public const val ENOTSUP: CInt = 48
public const val EDQUOT: CInt = 49
public const val EBADE: CInt = 50
public const val EBADR: CInt = 51
public const val EXFULL: CInt = 52
public const val ENOANO: CInt = 53
public const val EBADRQC: CInt = 54
public const val EBADSLT: CInt = 55
public const val EDEADLOCK: CInt = 56
public const val EBFONT: CInt = 57
public const val EOWNERDEAD: CInt = 58
public const val ENOTRECOVERABLE: CInt = 59
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
public const val ELOCKUNMAPPED: CInt = 72
public const val ENOTACTIVE: CInt = 73
public const val EMULTIHOP: CInt = 74
public const val EADI: CInt = 75
public const val EBADMSG: CInt = 77
public const val ENAMETOOLONG: CInt = 78
public const val EOVERFLOW: CInt = 79
public const val ENOTUNIQ: CInt = 80
public const val EBADFD: CInt = 81
public const val EREMCHG: CInt = 82
public const val ELIBACC: CInt = 83
public const val ELIBBAD: CInt = 84
public const val ELIBSCN: CInt = 85
public const val ELIBMAX: CInt = 86
public const val ELIBEXEC: CInt = 87
public const val EILSEQ: CInt = 88
public const val ENOSYS: CInt = 89
public const val ELOOP: CInt = 90
public const val ERESTART: CInt = 91
public const val ESTRPIPE: CInt = 92
public const val ENOTEMPTY: CInt = 93
public const val EUSERS: CInt = 94
public const val ENOTSOCK: CInt = 95
public const val EDESTADDRREQ: CInt = 96
public const val EMSGSIZE: CInt = 97
public const val EPROTOTYPE: CInt = 98
public const val ENOPROTOOPT: CInt = 99
public const val EPROTONOSUPPORT: CInt = 120
public const val ESOCKTNOSUPPORT: CInt = 121
public const val EOPNOTSUPP: CInt = 122
public const val EPFNOSUPPORT: CInt = 123
public const val EAFNOSUPPORT: CInt = 124
public const val EADDRINUSE: CInt = 125
public const val EADDRNOTAVAIL: CInt = 126
public const val ENETDOWN: CInt = 127
public const val ENETUNREACH: CInt = 128
public const val ENETRESET: CInt = 129
public const val ECONNABORTED: CInt = 130
public const val ECONNRESET: CInt = 131
public const val ENOBUFS: CInt = 132
public const val EISCONN: CInt = 133
public const val ENOTCONN: CInt = 134
public const val ESHUTDOWN: CInt = 143
public const val ETOOMANYREFS: CInt = 144
public const val ETIMEDOUT: CInt = 145
public const val ECONNREFUSED: CInt = 146
public const val EHOSTDOWN: CInt = 147
public const val EHOSTUNREACH: CInt = 148
public const val EWOULDBLOCK: CInt = EAGAIN
public const val EALREADY: CInt = 149
public const val EINPROGRESS: CInt = 150
public const val ESTALE: CInt = 151
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
public const val EAI_OVERFLOW: CInt = 12
public const val NI_NOFQDN: CUInt = 0x0001u
public const val NI_NUMERICHOST: CUInt = 0x0002u
public const val NI_NAMEREQD: CUInt = 0x0004u
public const val NI_NUMERICSERV: CUInt = 0x0008u
public const val NI_DGRAM: CUInt = 0x0010u
public const val NI_WITHSCOPEID: CUInt = 0x0020u
public const val NI_NUMERICSCOPE: CUInt = 0x0040u
public const val F_DUPFD: CInt = 0
public const val F_DUP2FD: CInt = 9
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val F_GETXFL: CInt = 45
public const val SIGTRAP: CInt = 5
public const val GLOB_APPEND: CInt = 32
public const val GLOB_DOOFFS: CInt = 16
public const val GLOB_ERR: CInt = 1
public const val GLOB_MARK: CInt = 2
public const val GLOB_NOCHECK: CInt = 8
public const val GLOB_NOSORT: CInt = 4
public const val GLOB_NOESCAPE: CInt = 64
public const val GLOB_NOSPACE: CInt = -2
public const val GLOB_ABORTED: CInt = -1
public const val GLOB_NOMATCH: CInt = -3
public const val POLLIN: CShort = 0x1
public const val POLLPRI: CShort = 0x2
public const val POLLOUT: CShort = 0x4
public const val POLLERR: CShort = 0x8
public const val POLLHUP: CShort = 0x10
public const val POLLNVAL: CShort = 0x20
public const val POLLNORM: CShort = 0x0040
public const val POLLRDNORM: CShort = 0x0040
public const val POLLWRNORM: CShort = 0x4
public const val POLLRDBAND: CShort = 0x0080
public const val POLLWRBAND: CShort = 0x0100
public const val POSIX_MADV_NORMAL: CInt = 0
public const val POSIX_MADV_RANDOM: CInt = 1
public const val POSIX_MADV_SEQUENTIAL: CInt = 2
public const val POSIX_MADV_WILLNEED: CInt = 3
public const val POSIX_MADV_DONTNEED: CInt = 4
public const val POSIX_SPAWN_RESETIDS: CShort = 0x1
public const val POSIX_SPAWN_SETPGROUP: CShort = 0x2
public const val POSIX_SPAWN_SETSIGDEF: CShort = 0x4
public const val POSIX_SPAWN_SETSIGMASK: CShort = 0x8
public const val POSIX_SPAWN_SETSCHEDPARAM: CShort = 0x10
public const val POSIX_SPAWN_SETSCHEDULER: CShort = 0x20
public const val POSIX_SPAWN_SETSIGIGN_NP: CShort = 0x800
public const val POSIX_SPAWN_NOSIGCHLD_NP: CShort = 0x1000
public const val POSIX_SPAWN_WAITPID_NP: CShort = 0x2000
public const val POSIX_SPAWN_NOEXECERR_NP: CShort = 0x4000
public const val PTHREAD_CREATE_JOINABLE: CInt = 0
public const val PTHREAD_CREATE_DETACHED: CInt = 0x40
public const val PTHREAD_PROCESS_SHARED: CInt = 1
public val PTHREAD_PROCESS_PRIVATE: CUShort = (0).toUShort()
public const val PTHREAD_STACK_MIN: ULong = 4096uL
public const val SIGSTKSZ: ULong = 8192uL
public const val CLOCK_REALTIME: ClockidT = 3
public const val CLOCK_MONOTONIC: ClockidT = 4
public const val TIMER_RELTIME: CInt = 0
public const val TIMER_ABSTIME: CInt = 1
public const val RLIMIT_CPU: CInt = 0
public const val RLIMIT_FSIZE: CInt = 1
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_STACK: CInt = 3
public const val RLIMIT_CORE: CInt = 4
public const val RLIMIT_NOFILE: CInt = 5
public const val RLIMIT_VMEM: CInt = 6
public const val RLIMIT_AS: CInt = RLIMIT_VMEM
public const val RLIM_NLIMITS: RlimT = 7uL
public const val RLIM_INFINITY: RlimT = 0xfffffffffffffffduL
public const val RUSAGE_SELF: CInt = 0
public const val RUSAGE_CHILDREN: CInt = -1
public const val MADV_NORMAL: CInt = 0
public const val MADV_RANDOM: CInt = 1
public const val MADV_SEQUENTIAL: CInt = 2
public const val MADV_WILLNEED: CInt = 3
public const val MADV_DONTNEED: CInt = 4
public const val MADV_FREE: CInt = 5
public const val MADV_ACCESS_DEFAULT: CInt = 6
public const val MADV_ACCESS_LWP: CInt = 7
public const val MADV_ACCESS_MANY: CInt = 8
public const val AF_UNSPEC: CInt = 0
public const val AF_UNIX: CInt = 1
public const val AF_INET: CInt = 2
public const val AF_IMPLINK: CInt = 3
public const val AF_PUP: CInt = 4
public const val AF_CHAOS: CInt = 5
public const val AF_NS: CInt = 6
public const val AF_NBS: CInt = 7
public const val AF_ECMA: CInt = 8
public const val AF_DATAKIT: CInt = 9
public const val AF_CCITT: CInt = 10
public const val AF_SNA: CInt = 11
public const val AF_DECnet: CInt = 12
public const val AF_DLI: CInt = 13
public const val AF_LAT: CInt = 14
public const val AF_HYLINK: CInt = 15
public const val AF_APPLETALK: CInt = 16
public const val AF_NIT: CInt = 17
public const val AF_802: CInt = 18
public const val AF_OSI: CInt = 19
public const val AF_X25: CInt = 20
public const val AF_OSINET: CInt = 21
public const val AF_GOSIP: CInt = 22
public const val AF_IPX: CInt = 23
public const val AF_ROUTE: CInt = 24
public const val AF_LINK: CInt = 25
public const val AF_INET6: CInt = 26
public const val AF_KEY: CInt = 27
public const val AF_POLICY: CInt = 29
public const val AF_INET_OFFLOAD: CInt = 30
public const val AF_TRILL: CInt = 31
public const val AF_PACKET: CInt = 32
public const val PF_UNSPEC: CInt = AF_UNSPEC
public const val PF_UNIX: CInt = AF_UNIX
public const val PF_LOCAL: CInt = PF_UNIX
public const val PF_FILE: CInt = PF_UNIX
public const val PF_INET: CInt = AF_INET
public const val PF_IMPLINK: CInt = AF_IMPLINK
public const val PF_PUP: CInt = AF_PUP
public const val PF_CHAOS: CInt = AF_CHAOS
public const val PF_NS: CInt = AF_NS
public const val PF_NBS: CInt = AF_NBS
public const val PF_ECMA: CInt = AF_ECMA
public const val PF_DATAKIT: CInt = AF_DATAKIT
public const val PF_CCITT: CInt = AF_CCITT
public const val PF_SNA: CInt = AF_SNA
public const val PF_DECnet: CInt = AF_DECnet
public const val PF_DLI: CInt = AF_DLI
public const val PF_LAT: CInt = AF_LAT
public const val PF_HYLINK: CInt = AF_HYLINK
public const val PF_APPLETALK: CInt = AF_APPLETALK
public const val PF_NIT: CInt = AF_NIT
public const val PF_802: CInt = AF_802
public const val PF_OSI: CInt = AF_OSI
public const val PF_X25: CInt = AF_X25
public const val PF_OSINET: CInt = AF_OSINET
public const val PF_GOSIP: CInt = AF_GOSIP
public const val PF_IPX: CInt = AF_IPX
public const val PF_ROUTE: CInt = AF_ROUTE
public const val PF_LINK: CInt = AF_LINK
public const val PF_INET6: CInt = AF_INET6
public const val PF_KEY: CInt = AF_KEY
public const val PF_POLICY: CInt = AF_POLICY
public const val PF_INET_OFFLOAD: CInt = AF_INET_OFFLOAD
public const val PF_TRILL: CInt = AF_TRILL
public const val PF_PACKET: CInt = AF_PACKET
public const val SOCK_DGRAM: CInt = 1
public const val SOCK_STREAM: CInt = 2
public const val SOCK_RAW: CInt = 4
public const val SOCK_RDM: CInt = 5
public const val SOCK_SEQPACKET: CInt = 6
public const val IP_MULTICAST_IF: CInt = 16
public const val IP_MULTICAST_TTL: CInt = 17
public const val IP_MULTICAST_LOOP: CInt = 18
public const val IP_HDRINCL: CInt = 2
public const val IP_TOS: CInt = 3
public const val IP_TTL: CInt = 4
public const val IP_ADD_MEMBERSHIP: CInt = 19
public const val IP_DROP_MEMBERSHIP: CInt = 20
public const val IPV6_JOIN_GROUP: CInt = 9
public const val IPV6_LEAVE_GROUP: CInt = 10
public const val IP_ADD_SOURCE_MEMBERSHIP: CInt = 23
public const val IP_DROP_SOURCE_MEMBERSHIP: CInt = 24
public const val IP_BLOCK_SOURCE: CInt = 21
public const val IP_UNBLOCK_SOURCE: CInt = 22
public const val IP_BOUND_IF: CInt = 0x41
public const val TCP_NODELAY: CInt = 0x1
public const val TCP_MAXSEG: CInt = 0x2
public const val TCP_KEEPALIVE: CInt = 0x8
public const val TCP_NOTIFY_THRESHOLD: CInt = 0x10
public const val TCP_ABORT_THRESHOLD: CInt = 0x11
public const val TCP_CONN_NOTIFY_THRESHOLD: CInt = 0x12
public const val TCP_CONN_ABORT_THRESHOLD: CInt = 0x13
public const val TCP_RECVDSTADDR: CInt = 0x14
public const val TCP_INIT_CWND: CInt = 0x15
public const val TCP_KEEPALIVE_THRESHOLD: CInt = 0x16
public const val TCP_KEEPALIVE_ABORT_THRESHOLD: CInt = 0x17
public const val TCP_CORK: CInt = 0x18
public const val TCP_RTO_INITIAL: CInt = 0x19
public const val TCP_RTO_MIN: CInt = 0x1a
public const val TCP_RTO_MAX: CInt = 0x1b
public const val TCP_LINGER2: CInt = 0x1c
public const val UDP_NAT_T_ENDPOINT: CInt = 0x0103
public const val SOMAXCONN: CInt = 128
public const val SOL_SOCKET: CInt = 0xffff
public const val SO_DEBUG: CInt = 0x01
public const val SO_ACCEPTCONN: CInt = 0x0002
public const val SO_REUSEADDR: CInt = 0x0004
public const val SO_KEEPALIVE: CInt = 0x0008
public const val SO_DONTROUTE: CInt = 0x0010
public const val SO_BROADCAST: CInt = 0x0020
public const val SO_USELOOPBACK: CInt = 0x0040
public const val SO_LINGER: CInt = 0x0080
public const val SO_OOBINLINE: CInt = 0x0100
public const val SO_SNDBUF: CInt = 0x1001
public const val SO_RCVBUF: CInt = 0x1002
public const val SO_SNDLOWAT: CInt = 0x1003
public const val SO_RCVLOWAT: CInt = 0x1004
public const val SO_SNDTIMEO: CInt = 0x1005
public const val SO_RCVTIMEO: CInt = 0x1006
public const val SO_ERROR: CInt = 0x1007
public const val SO_TYPE: CInt = 0x1008
public const val SO_PROTOTYPE: CInt = 0x1009
public const val SO_DOMAIN: CInt = 0x100c
public const val SO_TIMESTAMP: CInt = 0x1013
public const val SO_EXCLBIND: CInt = 0x1015
public const val SCM_RIGHTS: CInt = 0x1010
public const val SCM_UCRED: CInt = 0x1012
public const val SCM_TIMESTAMP: CInt = SO_TIMESTAMP
public const val MSG_OOB: CInt = 0x1
public const val MSG_PEEK: CInt = 0x2
public const val MSG_DONTROUTE: CInt = 0x4
public const val MSG_EOR: CInt = 0x8
public const val MSG_CTRUNC: CInt = 0x10
public const val MSG_TRUNC: CInt = 0x20
public const val MSG_WAITALL: CInt = 0x40
public const val MSG_DONTWAIT: CInt = 0x80
public const val MSG_NOTIFICATION: CInt = 0x100
public const val MSG_NOSIGNAL: CInt = 0x200
public const val MSG_DUPCTRL: CInt = 0x800
public const val MSG_XPG4_2: CInt = 0x8000
public const val MSG_MAXIOVLEN: CInt = 16
public const val IF_NAMESIZE: ULong = 32uL
public const val IFNAMSIZ: ULong = 16uL
public const val IFF_UP: CInt = 0x0000000001
public const val IFF_BROADCAST: CInt = 0x0000000002
public const val IFF_DEBUG: CInt = 0x0000000004
public const val IFF_LOOPBACK: CInt = 0x0000000008
public const val IFF_POINTOPOINT: CInt = 0x0000000010
public const val IFF_NOTRAILERS: CInt = 0x0000000020
public const val IFF_RUNNING: CInt = 0x0000000040
public const val IFF_NOARP: CInt = 0x0000000080
public const val IFF_PROMISC: CInt = 0x0000000100
public const val IFF_ALLMULTI: CInt = 0x0000000200
public const val IFF_INTELLIGENT: CInt = 0x0000000400
public const val IFF_MULTICAST: CInt = 0x0000000800
public const val IFF_MULTI_BCAST: CInt = 0x0000001000
public const val IFF_UNNUMBERED: CInt = 0x0000002000
public const val IFF_DHCPRUNNING: CInt = 0x0000004000
public const val IFF_PRIVATE: CInt = 0x0000008000
public const val IFF_NOXMIT: CInt = 0x0000010000
public const val IFF_NOLOCAL: CInt = 0x0000020000
public const val IFF_DEPRECATED: CInt = 0x0000040000
public const val IFF_ADDRCONF: CInt = 0x0000080000
public const val IFF_ROUTER: CInt = 0x0000100000
public const val IFF_NONUD: CInt = 0x0000200000
public const val IFF_ANYCAST: CInt = 0x0000400000
public const val IFF_NORTEXCH: CInt = 0x0000800000
public const val IFF_IPV4: CInt = 0x0001000000
public const val IFF_IPV6: CInt = 0x0002000000
public const val IFF_NOFAILOVER: CInt = 0x0008000000
public const val IFF_FAILED: CInt = 0x0010000000
public const val IFF_STANDBY: CInt = 0x0020000000
public const val IFF_INACTIVE: CInt = 0x0040000000
public const val IFF_OFFLINE: CInt = 0x0080000000.toInt()
public const val IFF_COS_ENABLED: CLongLong = 0x0200000000
public const val IFF_PREFERRED: CLongLong = 0x0400000000
public const val IFF_TEMPORARY: CLongLong = 0x0800000000
public const val IFF_FIXEDMTU: CLongLong = 0x1000000000
public const val IFF_VIRTUAL: CLongLong = 0x2000000000
public const val IFF_DUPLICATE: CLongLong = 0x4000000000
public const val IFF_IPMP: CLongLong = 0x8000000000
public const val IPC_ALLOC: CInt = 0x8000
public const val IPC_CREAT: CInt = 0x200
public const val IPC_EXCL: CInt = 0x400
public const val IPC_NOWAIT: CInt = 0x800
public const val IPC_PRIVATE: KeyT = 0
public const val IPC_RMID: CInt = 10
public const val IPC_SET: CInt = 11
public const val IPC_SEAT: CInt = 12
public const val SHM_R: CInt = 256
public const val SHM_W: CInt = 128
public const val SHM_RDONLY: CInt = 4096
public const val SHM_RND: CInt = 8192
public const val SHM_SHARE_MMU: CInt = 16384
public const val SHM_PAGEABLE: CInt = 32768
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val F_RDLCK: CShort = 1
public const val F_WRLCK: CShort = 2
public const val F_UNLCK: CShort = 3
public const val O_SYNC: CInt = 16
public const val O_NONBLOCK: CInt = 128
public const val IPPROTO_RAW: CInt = 255
public const val _PC_LINK_MAX: CInt = 1
public const val _PC_MAX_CANON: CInt = 2
public const val _PC_MAX_INPUT: CInt = 3
public const val _PC_NAME_MAX: CInt = 4
public const val _PC_PATH_MAX: CInt = 5
public const val _PC_PIPE_BUF: CInt = 6
public const val _PC_NO_TRUNC: CInt = 7
public const val _PC_VDISABLE: CInt = 8
public const val _PC_CHOWN_RESTRICTED: CInt = 9
public const val _PC_ASYNC_IO: CInt = 10
public const val _PC_PRIO_IO: CInt = 11
public const val _PC_SYNC_IO: CInt = 12
public const val _PC_ALLOC_SIZE_MIN: CInt = 13
public const val _PC_REC_INCR_XFER_SIZE: CInt = 14
public const val _PC_REC_MAX_XFER_SIZE: CInt = 15
public const val _PC_REC_MIN_XFER_SIZE: CInt = 16
public const val _PC_REC_XFER_ALIGN: CInt = 17
public const val _PC_SYMLINK_MAX: CInt = 18
public const val _PC_2_SYMLINKS: CInt = 19
public const val _PC_ACL_ENABLED: CInt = 20
public const val _PC_MIN_HOLE_SIZE: CInt = 21
public const val _PC_CASE_BEHAVIOR: CInt = 22
public const val _PC_SATTR_ENABLED: CInt = 23
public const val _PC_SATTR_EXISTS: CInt = 24
public const val _PC_ACCESS_FILTERING: CInt = 25
public const val _PC_TIMESTAMP_RESOLUTION: CInt = 26
public const val _PC_FILESIZEBITS: CInt = 67
public const val _PC_XATTR_ENABLED: CInt = 100
public const val _PC_XATTR_EXISTS: CInt = 101
public const val _POSIX_VDISABLE: CcT = 0u
public const val _SC_ARG_MAX: CInt = 1
public const val _SC_CHILD_MAX: CInt = 2
public const val _SC_CLK_TCK: CInt = 3
public const val _SC_NGROUPS_MAX: CInt = 4
public const val _SC_OPEN_MAX: CInt = 5
public const val _SC_JOB_CONTROL: CInt = 6
public const val _SC_SAVED_IDS: CInt = 7
public const val _SC_VERSION: CInt = 8
public const val _SC_PASS_MAX: CInt = 9
public const val _SC_LOGNAME_MAX: CInt = 10
public const val _SC_PAGESIZE: CInt = 11
public const val _SC_PAGE_SIZE: CInt = _SC_PAGESIZE
public const val _SC_XOPEN_VERSION: CInt = 12
public const val _SC_NPROCESSORS_CONF: CInt = 14
public const val _SC_NPROCESSORS_ONLN: CInt = 15
public const val _SC_STREAM_MAX: CInt = 16
public const val _SC_TZNAME_MAX: CInt = 17
public const val _SC_AIO_LISTIO_MAX: CInt = 18
public const val _SC_AIO_MAX: CInt = 19
public const val _SC_AIO_PRIO_DELTA_MAX: CInt = 20
public const val _SC_ASYNCHRONOUS_IO: CInt = 21
public const val _SC_DELAYTIMER_MAX: CInt = 22
public const val _SC_FSYNC: CInt = 23
public const val _SC_MAPPED_FILES: CInt = 24
public const val _SC_MEMLOCK: CInt = 25
public const val _SC_MEMLOCK_RANGE: CInt = 26
public const val _SC_MEMORY_PROTECTION: CInt = 27
public const val _SC_MESSAGE_PASSING: CInt = 28
public const val _SC_MQ_OPEN_MAX: CInt = 29
public const val _SC_MQ_PRIO_MAX: CInt = 30
public const val _SC_PRIORITIZED_IO: CInt = 31
public const val _SC_PRIORITY_SCHEDULING: CInt = 32
public const val _SC_REALTIME_SIGNALS: CInt = 33
public const val _SC_RTSIG_MAX: CInt = 34
public const val _SC_SEMAPHORES: CInt = 35
public const val _SC_SEM_NSEMS_MAX: CInt = 36
public const val _SC_SEM_VALUE_MAX: CInt = 37
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 38
public const val _SC_SIGQUEUE_MAX: CInt = 39
public const val _SC_SIGRT_MIN: CInt = 40
public const val _SC_SIGRT_MAX: CInt = 41
public const val _SC_SYNCHRONIZED_IO: CInt = 42
public const val _SC_TIMERS: CInt = 43
public const val _SC_TIMER_MAX: CInt = 44
public const val _SC_2_C_BIND: CInt = 45
public const val _SC_2_C_DEV: CInt = 46
public const val _SC_2_C_VERSION: CInt = 47
public const val _SC_2_FORT_DEV: CInt = 48
public const val _SC_2_FORT_RUN: CInt = 49
public const val _SC_2_LOCALEDEF: CInt = 50
public const val _SC_2_SW_DEV: CInt = 51
public const val _SC_2_UPE: CInt = 52
public const val _SC_2_VERSION: CInt = 53
public const val _SC_BC_BASE_MAX: CInt = 54
public const val _SC_BC_DIM_MAX: CInt = 55
public const val _SC_BC_SCALE_MAX: CInt = 56
public const val _SC_BC_STRING_MAX: CInt = 57
public const val _SC_COLL_WEIGHTS_MAX: CInt = 58
public const val _SC_EXPR_NEST_MAX: CInt = 59
public const val _SC_LINE_MAX: CInt = 60
public const val _SC_RE_DUP_MAX: CInt = 61
public const val _SC_XOPEN_CRYPT: CInt = 62
public const val _SC_XOPEN_ENH_I18N: CInt = 63
public const val _SC_XOPEN_SHM: CInt = 64
public const val _SC_2_CHAR_TERM: CInt = 66
public const val _SC_XOPEN_XCU_VERSION: CInt = 67
public const val _SC_ATEXIT_MAX: CInt = 76
public const val _SC_IOV_MAX: CInt = 77
public const val _SC_XOPEN_UNIX: CInt = 78
public const val _SC_T_IOV_MAX: CInt = 79
public const val _SC_PHYS_PAGES: CInt = 500
public const val _SC_AVPHYS_PAGES: CInt = 501
public const val _SC_COHER_BLKSZ: CInt = 503
public const val _SC_SPLIT_CACHE: CInt = 504
public const val _SC_ICACHE_SZ: CInt = 505
public const val _SC_DCACHE_SZ: CInt = 506
public const val _SC_ICACHE_LINESZ: CInt = 507
public const val _SC_DCACHE_LINESZ: CInt = 508
public const val _SC_ICACHE_BLKSZ: CInt = 509
public const val _SC_DCACHE_BLKSZ: CInt = 510
public const val _SC_DCACHE_TBLKSZ: CInt = 511
public const val _SC_ICACHE_ASSOC: CInt = 512
public const val _SC_DCACHE_ASSOC: CInt = 513
public const val _SC_MAXPID: CInt = 514
public const val _SC_STACK_PROT: CInt = 515
public const val _SC_NPROCESSORS_MAX: CInt = 516
public const val _SC_CPUID_MAX: CInt = 517
public const val _SC_EPHID_MAX: CInt = 518
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 568
public const val _SC_GETGR_R_SIZE_MAX: CInt = 569
public const val _SC_GETPW_R_SIZE_MAX: CInt = 570
public const val _SC_LOGIN_NAME_MAX: CInt = 571
public const val _SC_THREAD_KEYS_MAX: CInt = 572
public const val _SC_THREAD_STACK_MIN: CInt = 573
public const val _SC_THREAD_THREADS_MAX: CInt = 574
public const val _SC_TTY_NAME_MAX: CInt = 575
public const val _SC_THREADS: CInt = 576
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 577
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 578
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 579
public const val _SC_THREAD_PRIO_INHERIT: CInt = 580
public const val _SC_THREAD_PRIO_PROTECT: CInt = 581
public const val _SC_THREAD_PROCESS_SHARED: CInt = 582
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 583
public const val _SC_XOPEN_LEGACY: CInt = 717
public const val _SC_XOPEN_REALTIME: CInt = 718
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 719
public const val _SC_XBS5_ILP32_OFF32: CInt = 720
public const val _SC_XBS5_ILP32_OFFBIG: CInt = 721
public const val _SC_XBS5_LP64_OFF64: CInt = 722
public const val _SC_XBS5_LPBIG_OFFBIG: CInt = 723
public const val _SC_2_PBS: CInt = 724
public const val _SC_2_PBS_ACCOUNTING: CInt = 725
public const val _SC_2_PBS_CHECKPOINT: CInt = 726
public const val _SC_2_PBS_LOCATE: CInt = 728
public const val _SC_2_PBS_MESSAGE: CInt = 729
public const val _SC_2_PBS_TRACK: CInt = 730
public const val _SC_ADVISORY_INFO: CInt = 731
public const val _SC_BARRIERS: CInt = 732
public const val _SC_CLOCK_SELECTION: CInt = 733
public const val _SC_CPUTIME: CInt = 734
public const val _SC_HOST_NAME_MAX: CInt = 735
public const val _SC_MONOTONIC_CLOCK: CInt = 736
public const val _SC_READER_WRITER_LOCKS: CInt = 737
public const val _SC_REGEXP: CInt = 738
public const val _SC_SHELL: CInt = 739
public const val _SC_SPAWN: CInt = 740
public const val _SC_SPIN_LOCKS: CInt = 741
public const val _SC_SPORADIC_SERVER: CInt = 742
public const val _SC_SS_REPL_MAX: CInt = 743
public const val _SC_SYMLOOP_MAX: CInt = 744
public const val _SC_THREAD_CPUTIME: CInt = 745
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 746
public const val _SC_TIMEOUTS: CInt = 747
public const val _SC_TRACE: CInt = 748
public const val _SC_TRACE_EVENT_FILTER: CInt = 749
public const val _SC_TRACE_EVENT_NAME_MAX: CInt = 750
public const val _SC_TRACE_INHERIT: CInt = 751
public const val _SC_TRACE_LOG: CInt = 752
public const val _SC_TRACE_NAME_MAX: CInt = 753
public const val _SC_TRACE_SYS_MAX: CInt = 754
public const val _SC_TRACE_USER_EVENT_MAX: CInt = 755
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 756
public const val _SC_V6_ILP32_OFF32: CInt = 757
public const val _SC_V6_ILP32_OFFBIG: CInt = 758
public const val _SC_V6_LP64_OFF64: CInt = 759
public const val _SC_V6_LPBIG_OFFBIG: CInt = 760
public const val _SC_XOPEN_STREAMS: CInt = 761
public const val _SC_IPV6: CInt = 762
public const val _SC_RAW_SOCKETS: CInt = 763
public const val _ST_FSTYPSZ: CInt = 16
public val _MUTEX_MAGIC: UShort = (0x4d58).toUShort()
public val _COND_MAGIC: UShort = (0x4356).toUShort()
public val _RWL_MAGIC: UShort = (0x5257).toUShort()
public const val NCCS: ULong = 19uL
public val LOG_CRON: CInt = 15 shl 3
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(pthreadMutexFlag1 = 0.toUShort(), pthreadMutexFlag2 = 0.toUByte(), pthreadMutexCeiling = 0.toUByte(), pthreadMutexType = PTHREAD_PROCESS_PRIVATE, pthreadMutexMagic = _MUTEX_MAGIC, pthreadMutexLock = 0uL, pthreadMutexData = 0uL)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(pthreadCondFlag = ubyteArrayOf(0u, 0u, 0u, 0u), pthreadCondType = PTHREAD_PROCESS_PRIVATE, pthreadCondMagic = _COND_MAGIC, pthreadCondData = 0uL)
public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(pthreadRwlockReaders = 0, pthreadRwlockType = PTHREAD_PROCESS_PRIVATE, pthreadRwlockMagic = _RWL_MAGIC, pthreadRwlockMutex = PTHREAD_MUTEX_INITIALIZER, pthreadRwlockReadercv = PTHREAD_COND_INITIALIZER, pthreadRwlockWritercv = PTHREAD_COND_INITIALIZER)
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 2
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 4
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
public const val RTLD_LAZY: CInt = 0x1
public const val RTLD_NOW: CInt = 0x2
public const val RTLD_NOLOAD: CInt = 0x4
public const val RTLD_GLOBAL: CInt = 0x100
public const val RTLD_LOCAL: CInt = 0x0
public const val RTLD_PARENT: CInt = 0x200
public const val RTLD_GROUP: CInt = 0x400
public const val RTLD_WORLD: CInt = 0x800
public const val RTLD_NODELETE: CInt = 0x1000
public const val RTLD_FIRST: CInt = 0x2000
public const val RTLD_CONFGEN: CInt = 0x10000
public const val PORT_SOURCE_AIO: CInt = 1
public const val PORT_SOURCE_TIMER: CInt = 2
public const val PORT_SOURCE_USER: CInt = 3
public const val PORT_SOURCE_FD: CInt = 4
public const val PORT_SOURCE_ALERT: CInt = 5
public const val PORT_SOURCE_MQ: CInt = 6
public const val PORT_SOURCE_FILE: CInt = 7
public const val NONROOT_USR: CShort = 2
public const val EMPTY: CShort = 0
public const val RUN_LVL: CShort = 1
public const val BOOT_TIME: CShort = 2
public const val OLD_TIME: CShort = 3
public const val NEW_TIME: CShort = 4
public const val INIT_PROCESS: CShort = 5
public const val LOGIN_PROCESS: CShort = 6
public const val USER_PROCESS: CShort = 7
public const val DEAD_PROCESS: CShort = 8
public const val ACCOUNTING: CShort = 9
public const val DOWN_TIME: CShort = 10
public val TCGETA: CInt = _TIOC or 1
public val TCSETA: CInt = _TIOC or 2
public val TCSETAW: CInt = _TIOC or 3
public val TCSETAF: CInt = _TIOC or 4
public val TCSBRK: CInt = _TIOC or 5
public val TCXONC: CInt = _TIOC or 6
public val TCFLSH: CInt = _TIOC or 7
public val TCDSET: CInt = _TIOC or 32
public val TCGETS: CInt = _TIOC or 13
public val TCSETS: CInt = _TIOC or 14
public val TCSANOW: CInt = _TIOC or 14
public val TCSETSW: CInt = _TIOC or 15
public val TCSADRAIN: CInt = _TIOC or 15
public val TCSETSF: CInt = _TIOC or 16
public val TCSAFLUSH: CInt = _TIOC or 16
public const val TCIFLUSH: CInt = 0
public const val TCOFLUSH: CInt = 1
public const val TCIOFLUSH: CInt = 2
public const val TCOOFF: CInt = 0
public const val TCOON: CInt = 1
public const val TCIOFF: CInt = 2
public const val TCION: CInt = 3
public const val TIOC: CInt = _TIOC
public val TIOCKBON: CInt = _TIOC or 8
public val TIOCKBOF: CInt = _TIOC or 9
public val TIOCGWINSZ: CInt = _TIOC or 104
public val TIOCSWINSZ: CInt = _TIOC or 103
public val TIOCGSOFTCAR: CInt = _TIOC or 105
public val TIOCSSOFTCAR: CInt = _TIOC or 106
public val TIOCGPPS: CInt = _TIOC or 125
public val TIOCSPPS: CInt = _TIOC or 126
public val TIOCGPPSEV: CInt = _TIOC or 127
public val TIOCGETD: CInt = tIOC or 0
public val TIOCSETD: CInt = tIOC or 1
public val TIOCHPCL: CInt = tIOC or 2
public val TIOCGETP: CInt = tIOC or 8
public val TIOCSETP: CInt = tIOC or 9
public val TIOCSETN: CInt = tIOC or 10
public val TIOCEXCL: CInt = tIOC or 13
public val TIOCNXCL: CInt = tIOC or 14
public val TIOCFLUSH: CInt = tIOC or 16
public val TIOCSETC: CInt = tIOC or 17
public val TIOCGETC: CInt = tIOC or 18
public val TIOCLBIS: CInt = tIOC or 127
public val TIOCLBIC: CInt = tIOC or 126
public val TIOCLSET: CInt = tIOC or 125
public val TIOCLGET: CInt = tIOC or 124
public val TIOCSBRK: CInt = tIOC or 123
public val TIOCCBRK: CInt = tIOC or 122
public val TIOCSDTR: CInt = tIOC or 121
public val TIOCCDTR: CInt = tIOC or 120
public val TIOCSLTC: CInt = tIOC or 117
public val TIOCGLTC: CInt = tIOC or 116
public val TIOCOUTQ: CInt = tIOC or 115
public val TIOCNOTTY: CInt = tIOC or 113
public val TIOCSCTTY: CInt = tIOC or 132
public val TIOCSTOP: CInt = tIOC or 111
public val TIOCSTART: CInt = tIOC or 110
public val TIOCSILOOP: CInt = tIOC or 109
public val TIOCCILOOP: CInt = tIOC or 108
public val TIOCGPGRP: CInt = tIOC or 20
public val TIOCSPGRP: CInt = tIOC or 21
public val TIOCGSID: CInt = tIOC or 22
public val TIOCSTI: CInt = tIOC or 23
public val TIOCMSET: CInt = tIOC or 26
public val TIOCMBIS: CInt = tIOC or 27
public val TIOCMBIC: CInt = tIOC or 28
public val TIOCMGET: CInt = tIOC or 29
public val TIOCREMOTE: CInt = tIOC or 30
public val TIOCSIGNAL: CInt = tIOC or 31
public const val TIOCM_LE: CInt = 1
public const val TIOCM_DTR: CInt = 2
public const val TIOCM_RTS: CInt = 4
public const val TIOCM_ST: CInt = 8
public const val TIOCM_SR: CInt = 16
public const val TIOCM_CTS: CInt = 32
public const val TIOCM_CAR: CInt = 64
public const val TIOCM_CD: CInt = TIOCM_CAR
public const val TIOCM_RNG: CInt = 128
public const val TIOCM_RI: CInt = TIOCM_RNG
public const val TIOCM_DSR: CInt = 256
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
public const val B57600: SpeedT = 16u
public const val B76800: SpeedT = 17u
public const val B115200: SpeedT = 18u
public const val B153600: SpeedT = 19u
public const val B230400: SpeedT = 20u
public const val B307200: SpeedT = 21u
public const val B460800: SpeedT = 22u
public const val B921600: SpeedT = 23u
public const val CSTART: TcflagT = 17u
public const val CSTOP: TcflagT = 19u
public const val CSWTCH: TcflagT = 26u
public const val CBAUD: TcflagT = 15u
public const val CIBAUD: TcflagT = 983040u
public const val CBAUDEXT: TcflagT = 2097152u
public const val CIBAUDEXT: TcflagT = 4194304u
public const val CSIZE: TcflagT = 48u
public const val CS5: TcflagT = 0u
public const val CS6: TcflagT = 16u
public const val CS7: TcflagT = 32u
public const val CS8: TcflagT = 48u
public const val CSTOPB: TcflagT = 64u
public const val ECHO: TcflagT = 8u
public const val ECHOE: TcflagT = 16u
public const val ECHOK: TcflagT = 32u
public const val ECHONL: TcflagT = 64u
public const val ECHOCTL: TcflagT = 512u
public const val ECHOPRT: TcflagT = 1024u
public const val ECHOKE: TcflagT = 2048u
public const val EXTPROC: TcflagT = 65536u
public const val IGNBRK: TcflagT = 1u
public const val BRKINT: TcflagT = 2u
public const val IGNPAR: TcflagT = 4u
public const val PARMRK: TcflagT = 8u
public const val INPCK: TcflagT = 16u
public const val ISTRIP: TcflagT = 32u
public const val INLCR: TcflagT = 64u
public const val IGNCR: TcflagT = 128u
public const val ICRNL: TcflagT = 256u
public const val IUCLC: TcflagT = 512u
public const val IXON: TcflagT = 1024u
public const val IXOFF: TcflagT = 4096u
public const val IXANY: TcflagT = 2048u
public const val IMAXBEL: TcflagT = 8192u
public const val DOSMODE: TcflagT = 32768u
public const val OPOST: TcflagT = 1u
public const val OLCUC: TcflagT = 2u
public const val ONLCR: TcflagT = 4u
public const val OCRNL: TcflagT = 8u
public const val ONOCR: TcflagT = 16u
public const val ONLRET: TcflagT = 32u
public const val OFILL: TcflagT = 64u
public const val OFDEL: TcflagT = 128u
public const val CREAD: TcflagT = 128u
public const val PARENB: TcflagT = 256u
public const val PARODD: TcflagT = 512u
public const val HUPCL: TcflagT = 1024u
public const val CLOCAL: TcflagT = 2048u
public const val CRTSXOFF: TcflagT = 1073741824u
public const val CRTSCTS: TcflagT = 2147483648u
public const val ISIG: TcflagT = 1u
public const val ICANON: TcflagT = 2u
public const val IEXTEN: TcflagT = 32768u
public const val TOSTOP: TcflagT = 256u
public const val FLUSHO: TcflagT = 8192u
public const val PENDIN: TcflagT = 16384u
public const val NOFLSH: TcflagT = 128u
public const val VINTR: ULong = 0uL
public const val VQUIT: ULong = 1uL
public const val VERASE: ULong = 2uL
public const val VKILL: ULong = 3uL
public const val VEOF: ULong = 4uL
public const val VEOL: ULong = 5uL
public const val VEOL2: ULong = 6uL
public const val VMIN: ULong = 4uL
public const val VTIME: ULong = 5uL
public const val VSWTCH: ULong = 7uL
public const val VSTART: ULong = 8uL
public const val VSTOP: ULong = 9uL
public const val VSUSP: ULong = 10uL
public const val VDSUSP: ULong = 11uL
public const val VREPRINT: ULong = 12uL
public const val VDISCARD: ULong = 13uL
public const val VWERASE: ULong = 14uL
public const val VLNEXT: ULong = 15uL
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
public val __I_PUSH_NOCTTY: CInt = STR or 39
public const val SOCK_CLOEXEC: CInt = 0x080000
public const val SOCK_NONBLOCK: CInt = 0x100000
public const val SOCK_NDELAY: CInt = 0x200000
public val SCALE_KG: CInt = 1 shl 6
public val SCALE_KF: CInt = 1 shl 16
public val SCALE_KH: CInt = 1 shl 2
public val MAXTC: CInt = 1 shl 6
public val SCALE_PHASE: CInt = 1 shl 22
public val SCALE_USEC: CInt = 1 shl 16
public val SCALE_UPDATE: CInt = SCALE_KG * MAXTC
public val FINEUSEC: CInt = 1 shl 22
public const val MAXPHASE: CInt = 512000
public val MAXFREQ: CInt = 512 * SCALE_USEC
public val MAXTIME: CInt = 200 shl PPS_AVG
public const val MINSEC: CInt = 16
public const val MAXSEC: CInt = 1200
public const val PPS_AVG: CInt = 2
public const val PPS_SHIFT: CInt = 2
public const val PPS_SHIFTMAX: CInt = 8
public const val PPS_VALID: CInt = 120
public const val MAXGLITCH: CInt = 30
public const val MOD_OFFSET: UInt = 0x0001u
public const val MOD_FREQUENCY: UInt = 0x0002u
public const val MOD_MAXERROR: UInt = 0x0004u
public const val MOD_ESTERROR: UInt = 0x0008u
public const val MOD_STATUS: UInt = 0x0010u
public const val MOD_TIMECONST: UInt = 0x0020u
public const val MOD_CLKB: UInt = 0x4000u
public const val MOD_CLKA: UInt = 0x8000u
public const val STA_PLL: UInt = 0x0001u
public const val STA_PPSFREQ: Int = 0x0002
public const val STA_PPSTIME: Int = 0x0004
public const val STA_FLL: Int = 0x0008
public const val STA_INS: Int = 0x0010
public const val STA_DEL: Int = 0x0020
public const val STA_UNSYNC: Int = 0x0040
public const val STA_FREQHOLD: Int = 0x0080
public const val STA_PPSSIGNAL: Int = 0x0100
public const val STA_PPSJITTER: Int = 0x0200
public const val STA_PPSWANDER: Int = 0x0400
public const val STA_PPSERROR: Int = 0x0800
public const val STA_CLOCKERR: Int = 0x1000
public const val TIME_OK: Int = 0
public const val TIME_INS: Int = 1
public const val TIME_DEL: Int = 2
public const val TIME_OOP: Int = 3
public const val TIME_WAIT: Int = 4
public const val TIME_ERROR: Int = 5
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
public const val SCHED_OTHER: CInt = 0
public const val SCHED_FIFO: CInt = 1
public const val SCHED_RR: CInt = 2
public const val SCHED_SYS: CInt = 3
public const val SCHED_IA: CInt = 4
public const val SCHED_FSS: CInt = 5
public const val SCHED_FX: CInt = 6
public const val PRIV_DEBUG: CUInt = 0x0001u
public const val PRIV_AWARE: CUInt = 0x0002u
public const val PRIV_AWARE_INHERIT: CUInt = 0x0004u
public const val __PROC_PROTECT: CUInt = 0x0008u
public const val NET_MAC_AWARE: CUInt = 0x0010u
public const val NET_MAC_AWARE_INHERIT: CUInt = 0x0020u
public const val PRIV_AWARE_RESET: CUInt = 0x0040u
public const val PRIV_XPOLICY: CUInt = 0x0080u
public const val PRIV_PFEXEC: CUInt = 0x0100u
public const val SI_SYSNAME: CInt = 1
public const val SI_HOSTNAME: CInt = 2
public const val SI_RELEASE: CInt = 3
public const val SI_VERSION: CInt = 4
public const val SI_MACHINE: CInt = 5
public const val SI_ARCHITECTURE: CInt = 6
public const val SI_HW_SERIAL: CInt = 7
public const val SI_HW_PROVIDER: CInt = 8
public const val SI_SET_HOSTNAME: CInt = 258
public const val SI_SET_SRPC_DOMAIN: CInt = 265
public const val SI_PLATFORM: CInt = 513
public const val SI_ISALIST: CInt = 514
public const val SI_DHCP_CACHE: CInt = 515
public const val SI_ARCHITECTURE_32: CInt = 516
public const val SI_ARCHITECTURE_64: CInt = 517
public const val SI_ARCHITECTURE_K: CInt = 518
public const val SI_ARCHITECTURE_NATIVE: CInt = 519
public const val LGRP_COOKIE_NONE: LgrpCookieT = 0uL
public const val LGRP_AFF_NONE: LgrpAffinityT = 0x0.toInt()
public const val LGRP_AFF_WEAK: LgrpAffinityT = 0x10.toInt()
public const val LGRP_AFF_STRONG: LgrpAffinityT = 0x100.toInt()
public const val LGRP_CONTENT_ALL: LgrpContentT = 0u
public const val LGRP_CONTENT_HIERARCHY: LgrpContentT = LGRP_CONTENT_ALL
public const val LGRP_CONTENT_DIRECT: LgrpContentT = 1u
public const val LGRP_LAT_CPU_TO_MEM: LgrpLatBetweenT = 0u
public const val LGRP_MEM_SZ_FREE: LgrpMemSizeFlagT = 0u
public const val LGRP_MEM_SZ_INSTALLED: LgrpMemSizeFlagT = 1u
public const val LGRP_VIEW_CALLER: LgrpViewT = 0u
public const val LGRP_VIEW_OS: LgrpViewT = 1u
public const val P_OFFLINE: CInt = 0x001
public const val P_ONLINE: CInt = 0x002
public const val P_STATUS: CInt = 0x003
public const val P_FAULTED: CInt = 0x004
public const val P_POWEROFF: CInt = 0x005
public const val P_NOINTR: CInt = 0x006
public const val P_SPARE: CInt = 0x007
public const val P_FORCED: CInt = 0x10000000
public const val PI_TYPELEN: CInt = 16
public const val PI_FPUTYPE: CInt = 32
public const val AT_SUN_HWCAP: CUInt = 2009u
public const val SFV_FD_SELF: CInt = -2

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? = null

public fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? = null

public fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? = null

public fun fDCLR(fd: CInt, set: FdSet?) { }

public fun fDISSET(fd: CInt, set: FdSet?): Boolean = false

public fun fDSET(fd: CInt, set: FdSet?) { }

public fun fDZERO(set: FdSet?) { }

public fun sIGRTMAX(): CInt = -1

public fun sIGRTMIN(): CInt = -1

public fun getrlimit(resource: CInt, rlim: Rlimit?): CInt = -1

public fun setrlimit(resource: CInt, rlim: Rlimit?): CInt = -1

public fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt = -1

public fun semDestroy(sem: SemT?): CInt = -1

public fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt = -1

public fun abs(i: CInt): CInt = -1

public fun acct(filename: String?): CInt = -1

public fun dirfd(dirp: DIR?): CInt = -1

public fun labs(i: CLong): CLong = -1L

public fun rand(): CInt = -1

public fun srand(seed: CUInt) { }

public fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt = -1

public fun getrandom(bbuf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT = -1L

public fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt = -1

public fun settimeofday(tp: Timeval?, tz: COpaquePointer?): CInt = -1

public fun getifaddrs(ifap: COpaquePointer?): CInt = -1

public fun freeifaddrs(ifa: Ifaddrs?) { }

public fun stackGetbounds(sp: StackT?): CInt = -1

public fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt = -1

public fun initgroups(name: String?, basegid: GidT): CInt = -1

public fun setgroups(ngroups: CInt, ptr: GidT?): CInt = -1

public fun ioctl(fildes: CInt, request: CInt, vararg args: Any?): CInt = -1

public fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt = -1

public fun errno(): CInt? = null

public fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt = -1

public fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt = -1

public fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt = -1

public fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt = -1

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt = -1

public fun setpwent() { }

public fun endpwent() { }

public fun getpwent(): Passwd? = null

public fun fdatasync(fd: CInt): CInt = -1

public fun nlLanginfoL(item: NlItem, locale: LocaleT): String? = null

public fun duplocale(base: LocaleT): LocaleT = null

public fun freelocale(loc: LocaleT) { }

public fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT = null

public fun uselocale(loc: LocaleT): LocaleT = null

public fun getprogname(): String? = null

public fun setprogname(name: String?) { }

public fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt = -1

public fun getpriority(which: CInt, who: CInt): CInt = -1

public fun setpriority(which: CInt, who: CInt, prio: CInt): CInt = -1

public fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt = -1

public fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt = -1

public fun sethostname(name: String?, len: CInt): CInt = -1

public fun ifNameindex(): IfNameindex? = null

public fun ifFreenameindex(ptr: IfNameindex?) { }

public fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt = -1

public fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt = -1

public fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt = -1

public fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt = -1

public fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt = -1

public fun semGetvalue(sem: SemT?, sval: CInt?): CInt = -1

public fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt = -1

public fun pthreadGetnameNp(tid: PthreadT, name: String?, len: ULong): CInt = -1

public fun pthreadSetnameNp(tid: PthreadT, name: String?): CInt = -1

public fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt = -1

public fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt = -1

public fun globfree(pglob: GlobT?) { }

public fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt = -1

public fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt = -1

public fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt = -1

public fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt = -1

public fun posixSpawnFileActionsInit(fileActions: PosixSpawnFileActionsT): CInt = -1

public fun posixSpawnFileActionsDestroy(fileActions: PosixSpawnFileActionsT): CInt = -1

public fun posixSpawnFileActionsAddopen(fileActions: PosixSpawnFileActionsT, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt = -1

public fun posixSpawnFileActionsAddclose(fileActions: PosixSpawnFileActionsT, fildes: CInt): CInt = -1

public fun posixSpawnFileActionsAdddup2(fileActions: PosixSpawnFileActionsT, fildes: CInt, newfildes: CInt): CInt = -1

public fun posixSpawnFileActionsAddclosefromNp(fileActions: PosixSpawnFileActionsT, lowfiledes: CInt): CInt = -1

public fun posixSpawnFileActionsAddchdir(fileActions: PosixSpawnFileActionsT, path: String?): CInt = -1

public fun posixSpawnFileActionsAddchdirNp(fileActions: PosixSpawnFileActionsT, path: String?): CInt = -1

public fun posixSpawnFileActionsAddfchdir(fileActions: PosixSpawnFileActionsT, fd: CInt): CInt = -1

public fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt = -1

public fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt = -1

public fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt = -1

public fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt = -1

public fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, pgroup: PidT): CInt = -1

public fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, pgroup: PidT?): CInt = -1

public fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt = -1

public fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt = -1

public fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT, policy: CInt): CInt = -1

public fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT, policy: CInt?): CInt = -1

public fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, sigdefault: SigsetT?): CInt = -1

public fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, sigdefault: SigsetT?): CInt = -1

public fun posixSpawnattrSetsigignoreNp(attr: PosixSpawnattrT, sigignore: SigsetT?): CInt = -1

public fun posixSpawnattrGetsigignoreNp(attr: PosixSpawnattrT, sigignore: SigsetT?): CInt = -1

public fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, sigmask: SigsetT?): CInt = -1

public fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, sigmask: SigsetT?): CInt = -1

public fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? = null

public fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt = -1

public fun shmdt(shmaddr: COpaquePointer?): CInt = -1

public fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt = -1

public fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt = -1

public fun shmUnlink(name: String?): CInt = -1

public fun seekdir(dirp: DIR?, loc: CLong) { }

public fun telldir(dirp: DIR?): CLong = -1L

public fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt = -1

public fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt = -1

public fun memalign(align: ULong, size: ULong): COpaquePointer? = null

public fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT = -1L

public fun mkstemps(template: String?, suffixlen: CInt): CInt = -1

public fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt = -1

public fun futimens(dirfd: CInt, times: Timespec?): CInt = -1

public fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt = -1

public fun nlLanginfo(item: NlItem): String? = null

public fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt = -1

public fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT = -1L

public fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT = -1L

public fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT = -1L

public fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT = -1L

public fun accept4(fd: CInt, address: Sockaddr?, addressLen: SocklenT?, flags: CInt): CInt = -1

public fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT = null

public fun mqClose(mqd: MqdT): CInt = -1

public fun mqUnlink(name: String?): CInt = -1

public fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT = -1L

public fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT = -1L

public fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt = -1

public fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt = -1

public fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt = -1

public fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt = -1

public fun portCreate(): CInt = -1

public fun portAssociate(port: CInt, source: CInt, `object`: UintptrT, events: CInt, user: COpaquePointer?): CInt = -1

public fun portDissociate(port: CInt, source: CInt, `object`: UintptrT): CInt = -1

public fun portGet(port: CInt, pe: PortEvent?, timeout: Timespec?): CInt = -1

public fun portGetn(port: CInt, peList: PortEvent?, max: CUInt, nget: CUInt?, timeout: Timespec?): CInt = -1

public fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt = -1

public fun portSendn(portList: CInt?, errorList: CInt?, nent: CUInt, events: CInt, user: COpaquePointer?): CInt = -1

public fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt = -1

public fun sigaltstack(ss: StackT?, oss: StackT?): CInt = -1

public fun sigsuspend(mask: SigsetT?): CInt = -1

public fun semClose(sem: SemT?): CInt = -1

public fun getdtablesize(): CInt = -1

public fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt = -1

public fun thrSelf(): ThreadT = throw UnsupportedOperationException("Not implemented on this platform")

public fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt = -1

public fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? = null

public fun getgrnam(name: String?): Group? = null

public fun pthreadKill(thread: PthreadT, sig: CInt): CInt = -1

public fun schedGetPriorityMin(policy: CInt): CInt = -1

public fun schedGetPriorityMax(policy: CInt): CInt = -1

public fun schedGetparam(pid: PidT, param: SchedParam?): CInt = -1

public fun schedSetparam(pid: PidT, param: SchedParam?): CInt = -1

public fun schedGetscheduler(pid: PidT): CInt = -1

public fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt = -1

public fun semUnlink(name: String?): CInt = -1

public fun daemon(nochdir: CInt, noclose: CInt): CInt = -1

public fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt = -1

public fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt = -1

public fun sigwait(set: SigsetT?, sig: CInt?): CInt = -1

public fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt = -1

public fun getgrgid(gid: GidT): Group? = null

public fun setgrent() { }

public fun endgrent() { }

public fun getgrent(): Group? = null

public fun popen(command: String?, mode: String?): FILE? = null

public fun dup3(src: CInt, dst: CInt, flags: CInt): CInt = -1

public fun uname(buf: Utsname?): CInt = -1

public fun pipe2(fds: CInt?, flags: CInt): CInt = -1

public fun makeutx(ux: Utmpx?): Utmpx? = null

public fun modutx(ux: Utmpx?): Utmpx? = null

public fun updwtmpx(file: String?, ut: Utmpx?) { }

public fun utmpxname(file: String?): CInt = -1

public fun getutxent(): Utmpx? = null

public fun getutxid(ut: Utmpx?): Utmpx? = null

public fun getutxline(ut: Utmpx?): Utmpx? = null

public fun pututxline(ut: Utmpx?): Utmpx? = null

public fun setutxent() { }

public fun endutxent() { }

public fun endutent() { }

public fun getutent(): Utmp? = null

public fun getutid(u: Utmp?): Utmp? = null

public fun getutline(u: Utmp?): Utmp? = null

public fun pututline(u: Utmp?): Utmp? = null

public fun setutent() { }

public fun utmpname(file: String?): CInt = -1

public fun getutmp(ux: Utmpx?, u: Utmp?) { }

public fun getutmpx(u: Utmp?, ux: Utmpx?) { }

public fun updwtmp(file: String?, u: Utmp?) { }

public fun ntpAdjtime(buf: Timex?): CInt = -1

public fun ntpGettime(buf: Ntptimeval?): CInt = -1

public fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: TimerT?): CInt = -1

public fun timerDelete(timerid: TimerT): CInt = -1

public fun timerGetoverrun(timerid: TimerT): CInt = -1

public fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt = -1

public fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt = -1

public fun ucredGet(pid: PidT): UcredT = null

public fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt = -1

public fun ucredFree(ucred: UcredT) { }

public fun ucredGeteuid(ucred: UcredT): UidT = throw UnsupportedOperationException("Not implemented on this platform")

public fun ucredGetruid(ucred: UcredT): UidT = throw UnsupportedOperationException("Not implemented on this platform")

public fun ucredGetsuid(ucred: UcredT): UidT = throw UnsupportedOperationException("Not implemented on this platform")

public fun ucredGetegid(ucred: UcredT): GidT = throw UnsupportedOperationException("Not implemented on this platform")

public fun ucredGetrgid(ucred: UcredT): GidT = throw UnsupportedOperationException("Not implemented on this platform")

public fun ucredGetsgid(ucred: UcredT): GidT = throw UnsupportedOperationException("Not implemented on this platform")

public fun ucredGetgroups(ucred: UcredT, groups: COpaquePointer?): CInt = -1

public fun ucredGetpid(ucred: UcredT): PidT = -1

public fun ucredGetprojid(ucred: UcredT): ProjidT = throw UnsupportedOperationException("Not implemented on this platform")

public fun ucredGetzoneid(ucred: UcredT): ZoneidT = throw UnsupportedOperationException("Not implemented on this platform")

public fun ucredGetpflags(ucred: UcredT, flags: CUInt): CUInt = 0u

public fun ucredSize(): ULong = 0uL

public fun psetCreate(newpset: PsetidT?): CInt = -1

public fun psetDestroy(pset: PsetidT): CInt = -1

public fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: PsetidT?): CInt = -1

public fun psetInfo(pset: PsetidT, tpe: CInt?, numcpus: CUInt?, cpulist: ProcessoridT?): CInt = -1

public fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: PsetidT?): CInt = -1

public fun psetList(pset: PsetidT?, numpsets: CUInt?): CInt = -1

public fun psetSetattr(pset: PsetidT, attr: CUInt): CInt = -1

public fun psetGetattr(pset: PsetidT, attr: CUInt?): CInt = -1

public fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: ProcessoridT?): CInt = -1

public fun pOnline(processorid: ProcessoridT, flag: CInt): CInt = -1

public fun processorInfo(processorid: ProcessoridT, infop: ProcessorInfoT?): CInt = -1

public fun getexecname(): String? = null

public fun gethostid(): CLong = -1L

public fun getpflags(flags: CUInt): CUInt = 0u

public fun setpflags(flags: CUInt, value: CUInt): CInt = -1

public fun sysinfo(command: CInt, buf: String?, count: CLong): CInt = -1

public fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt = -1

public fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt = -1

public fun getpagesize(): CInt = -1

public fun getpagesizes(pagesize: ULong?, nelem: CInt): CInt = -1

public fun mmapobj(fd: CInt, flags: CUInt, storage: MmapobjResultT?, elements: CUInt?, arg: COpaquePointer?): CInt = -1

public fun meminfo(inaddr: ULong?, addrCount: CInt, infoReq: CUInt?, infoCount: CInt, outdata: ULong?, validity: CUInt?): CInt = -1

public fun strsep(string: COpaquePointer?, delim: String?): String? = null

public fun getisax(array: UInt?, n: CUInt): CUInt = 0u

public fun backtrace(buffer: COpaquePointer?, size: CInt): CInt = -1

public fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? = null

public fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) { }

public fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt = -1

public fun sync() { }

public fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt = -1

public fun aioError(aiocbp: Aiocb?): CInt = -1

public fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt = -1

public fun aioRead(aiocbp: Aiocb?): CInt = -1

public fun aioReturn(aiocbp: Aiocb?): SsizeT = -1L

public fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt = -1

public fun aioWaitn(aiocbList: COpaquePointer?, nent: CUInt, nwait: CUInt?, timeout: Timespec?): CInt = -1

public fun aioWrite(aiocbp: Aiocb?): CInt = -1

public fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt = -1

public fun major(version: CInt, devnum: DevT): MajorT = throw UnsupportedOperationException("Not implemented on this platform")

public fun minor(version: CInt, devnum: DevT): MinorT = throw UnsupportedOperationException("Not implemented on this platform")

public fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT = throw UnsupportedOperationException("Not implemented on this platform")

public fun arc4random(): UInt = 0u

public fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong) { }

public fun arc4randomUniform(upperBound: UInt): UInt = 0u

public fun secureGetenv(name: String?): String? = null

public fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong = 0uL

public fun strftimeL(s: String?, maxsize: ULong, format: String?, timeptr: Tm?, loc: LocaleT): ULong = 0uL

public fun sendfile(outFd: CInt, inFd: CInt, off: OffT?, len: ULong): SsizeT = -1L

public fun sendfilev(fildes: CInt, vec: SendfilevecT?, sfvcnt: CInt, xferred: ULong?): SsizeT = -1L

public fun lgrpInit(view: LgrpViewT): LgrpCookieT = throw UnsupportedOperationException("Not implemented on this platform")

public fun lgrpFini(cookie: LgrpCookieT): CInt = -1

public fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT = throw UnsupportedOperationException("Not implemented on this platform")

public fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt = -1

public fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: ProcessoridT?, count: CUInt, content: LgrpContentT): CInt = -1

public fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT = throw UnsupportedOperationException("Not implemented on this platform")

public fun lgrpNlgrps(cookie: LgrpCookieT): CInt = -1

public fun lgrpView(cookie: LgrpCookieT): LgrpViewT = throw UnsupportedOperationException("Not implemented on this platform")

public fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT = throw UnsupportedOperationException("Not implemented on this platform")

public fun lgrpVersion(version: CInt): CInt = -1

public fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: LgrpIdT?, count: CUInt, tpe: LgrpRsrcT): CInt = -1

public fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT = throw UnsupportedOperationException("Not implemented on this platform")
