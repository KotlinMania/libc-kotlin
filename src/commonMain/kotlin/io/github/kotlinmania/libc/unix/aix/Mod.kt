// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public typealias CaddrT = String?
public typealias ClockidT = CLongLong
public typealias BlkcntT = CLong
public typealias ClockT = CInt
public typealias DaddrT = CLong
public typealias DevT = CULong
public typealias Fpos64T = CLongLong
public typealias FsblkcntT = CULong
public typealias FsfilcntT = CULong
public typealias InoT = CULong
public typealias KeyT = CInt
public typealias ModeT = CUInt
public typealias NlinkT = CShort
public typealias RlimT = CULong
public typealias SpeedT = CUInt
public typealias TcflagT = CUInt
public typealias TimeT = CLong
public typealias Time64T = Long
public typealias TimerT = CLong
public typealias WcharT = CUInt
public typealias NfdsT = CUInt
public typealias ProjidT = CInt
public typealias IdT = CUInt
public typealias Blksize64T = CULongLong
public typealias Blkcnt64T = CULongLong
public typealias SusecondsT = CInt
public typealias UsecondsT = CUInt
public typealias OffT = CLong
public typealias OffsetT = CLongLong
public typealias Off64T = CLongLong
public typealias IdtypeT = CUInt
public typealias SocklenT = CUInt
public typealias SaFamilyT = CUChar
public typealias SignalT = CInt
public typealias PthreadT = CUInt
public typealias PthreadKeyT = CUInt
public typealias ThreadT = PthreadT
public typealias BlksizeT = CLong
public typealias NlItem = CInt
public typealias MqdT = CInt
public typealias ShmattT = CULong
public typealias RegoffT = CLong
public typealias Rlim64T = CULongLong
public typealias SemT = CInt
public typealias PollsetT = CInt
public typealias SctpAssocT = CUInt
public typealias PthreadRwlockattrT = COpaquePointer?
public typealias PthreadCondattrT = COpaquePointer?
public typealias PthreadMutexattrT = COpaquePointer?
public typealias PthreadAttrT = COpaquePointer?
public typealias PthreadBarrierattrT = COpaquePointer?
public typealias PosixSpawnFileActionsT = String?
public typealias IconvT = COpaquePointer?

public enum class UioRw(
    public val value: UInt,
) {
    UIO_READ(0u),
    UIO_WRITE(1u),
    UIO_READ_NO_MOVE(2u),
    UIO_WRITE_NO_MOVE(3u),
    UIO_PWRITE(4u),
}

public enum class ACTION(
    public val value: UInt,
) {
    FIND(0u),
    ENTER(1u),
}

public data class FsidT(
    val `val`: UIntArray,
)

public data class Fsid64T(
    val `val`: List<Uint64T>,
)

public data class Timezone(
    val tzMinuteswest: CInt,
    val tzDsttime: CInt,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class Dirent(
    val dOffset: CULong,
    val dIno: InoT,
    val dReclen: CUShort,
    val dNamlen: CUShort,
    val dName: ByteArray,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cCc: List<CcT>,
)

public data class Flock64(
    val lType: CShort,
    val lWhence: CShort,
    val lSysid: CUInt,
    val lPid: PidT,
    val lVfs: CInt,
    val lStart: Off64T,
    val lLen: Off64T,
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

public data class Statvfs64(
    val fBsize: Blksize64T,
    val fFrsize: Blksize64T,
    val fBlocks: Blkcnt64T,
    val fBfree: Blkcnt64T,
    val fBavail: Blkcnt64T,
    val fFiles: Blkcnt64T,
    val fFfree: Blkcnt64T,
    val fFavail: Blkcnt64T,
    val fFsid: Fsid64T,
    val fBasetype: ByteArray,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fFstr: ByteArray,
    val fFiller: ULongArray,
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
    val leftParenthesis: String?,
    val rightParenthesis: String?,
    val intPCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intNCsPrecedes: CChar,
    val intNSepBySpace: CChar,
    val intPSignPosn: CChar,
    val intNSignPosn: CChar,
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

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: CULong,
    val aiCanonname: String?,
    val aiAddr: Sockaddr?,
    val aiNext: Addrinfo?,
    val aiEflags: CInt,
)

public data class InAddr(
    val sAddr: InAddrT,
)

public data class IpMreqSource(
    val imrMultiaddr: InAddr,
    val imrSourceaddr: InAddr,
    val imrInterface: InAddr,
)

public data class Sockaddr(
    val saLen: CUChar,
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class SockaddrDl(
    val sdlLen: CUChar,
    val sdlFamily: CUChar,
    val sdlIndex: CUShort,
    val sdlType: CUChar,
    val sdlNlen: CUChar,
    val sdlAlen: CUChar,
    val sdlSlen: CUChar,
    val sdlData: ByteArray,
)

public data class SockaddrIn(
    val sinLen: CUChar,
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: UByteArray,
)

public data class SockaddrIn6(
    val sin6Len: CUChar,
    val sin6Family: CUChar,
    val sin6Port: Uint16T,
    val sin6Flowinfo: Uint32T,
    val sin6Addr: In6Addr,
    val sin6ScopeId: Uint32T,
)

public data class SockaddrStorage(
    val ssLen: CUChar,
    val ssFamily: SaFamilyT,
    val ssAlign: Int64T,
)

public data class SockaddrUn(
    val sunLen: CUChar,
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class StTimespec(
    val tvSec: TimeT,
    val tvNsec: CInt,
)

public data class Statfs64(
    val fVersion: CInt,
    val fType: CInt,
    val fBsize: Blksize64T,
    val fBlocks: Blkcnt64T,
    val fBfree: Blkcnt64T,
    val fBavail: Blkcnt64T,
    val fFiles: Uint64T,
    val fFfree: Uint64T,
    val fFsid: Fsid64T,
    val fVfstype: CInt,
    val fFsize: Blksize64T,
    val fVfsnumber: CInt,
    val fVfsoff: CInt,
    val fVfslen: CInt,
    val fVfsvers: CInt,
    val fFname: ByteArray,
    val fFpack: ByteArray,
    val fNameMax: CInt,
)

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UidT,
    val pwGid: GidT,
    val pwGecos: String?,
    val pwDir: String?,
    val pwShell: String?,
)

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
)

public data class Xutsname(
    val nid: CUInt,
    val longnid: CULongLong,
)

public data class Cmsghdr(
    val cmsgLen: SocklenT,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class Sigevent(
    val sigevValue: Sigval,
    val sigevSigno: CInt,
    val sigevNotify: CInt,
    val sigevNotifyFunction: ((Sigval) -> Unit)?,
    val sigevNotifyAttributes: PthreadAttrT?,
)

public data class Osigevent(
    val sevtValue: COpaquePointer?,
    val sevtSigno: SignalT,
)

public data class PollCtl(
    val cmd: CShort,
    val events: CShort,
    val fd: CInt,
)

public data class SfParms(
    val headerData: COpaquePointer?,
    val headerLength: CUInt,
    val fileDescriptor: CInt,
    val fileSize: Uint64T,
    val fileOffset: Uint64T,
    val fileBytes: Int64T,
    val trailerData: COpaquePointer?,
    val trailerLength: CUInt,
    val bytesSent: Uint64T,
)

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: CUInt,
)

public data class SchedParam(
    val schedPriority: CInt,
    val schedPolicy: CInt,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
    val pad: IntArray,
)

public data class PosixSpawnattrT(
    val posixAttrFlags: CShort,
    val posixAttrPgroup: PidT,
    val posixAttrSigmask: SigsetT,
    val posixAttrSigdefault: SigsetT,
    val posixAttrSchedpolicy: CInt,
    val posixAttrSchedparam: SchedParam,
)

public data class GlobT(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glPadr: COpaquePointer?,
    val glPtx: COpaquePointer?,
)

public data class Mallinfo(
    val arena: CULong,
    val ordblks: CInt,
    val smblks: CInt,
    val hblks: CInt,
    val hblkhd: CInt,
    val usmblks: CULong,
    val fsmblks: CULong,
    val uordblks: CULong,
    val fordblks: CULong,
    val keepcost: CInt,
)

public data class ExitStatus(
    val eTermination: CShort,
    val eExit: CShort,
)

public data class Utmp(
    val utUser: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utPid: PidT,
    val utType: CShort,
    val utTime: Time64T,
    val utExit: ExitStatus,
    val utHost: ByteArray,
    val dblWordPad: CInt,
    val reservedA: IntArray,
    val reservedV: IntArray,
)

public data class RegmatchT(
    val rmSo: RegoffT,
    val rmEo: RegoffT,
)

public data class RegexT(
    val reNsub: ULong,
    val reComp: COpaquePointer?,
    val reCflags: CInt,
    val reErroff: ULong,
    val reLen: ULong,
    val reUcoll: List<WcharT>,
    val reLsub: List<COpaquePointer?>,
    val reEsub: List<COpaquePointer?>,
    val reMap: COpaquePointer?,
    val maxsub: CInt,
)

public data class Rlimit64(
    val rlimCur: Rlim64T,
    val rlimMax: Rlim64T,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmLpid: PidT,
    val shmCpid: PidT,
    val shmNattch: ShmattT,
    val shmCnattch: ShmattT,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmHandle: Uint32T,
    val shmExtshm: CInt,
    val shmPagesize: Int64T,
    val shmLba: Uint64T,
)

public data class Stat64(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stFlag: CUShort,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSsize: CInt,
    val stAtim: StTimespec,
    val stMtim: StTimespec,
    val stCtim: StTimespec,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stVfstype: CInt,
    val stVfs: CUInt,
    val stType: CUInt,
    val stGen: CUInt,
    val stSize: Off64T,
)

public data class Mntent(
    val mntFsname: String?,
    val mntDir: String?,
    val mntType: String?,
    val mntOpts: String?,
    val mntFreq: CInt,
    val mntPassno: CInt,
)

public data class IpcPerm(
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: ModeT,
    val seq: CUShort,
    val key: KeyT,
)

public data class Entry(
    val key: String?,
    val data: COpaquePointer?,
)

public data class MqAttr(
    val mqFlags: CLong,
    val mqMaxmsg: CLong,
    val mqMsgsize: CLong,
    val mqCurmsgs: CLong,
)

public data class Sembuf(
    val semNum: CUShort,
    val semOp: CShort,
    val semFlg: CShort,
)

public data class IfNameindex(
    val ifIndex: CUInt,
    val ifName: String?,
)

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
)

public data class PollCtlExt(
    val version: UByte,
    val command: UByte,
    val events: CShort,
    val fd: CInt,
    val u: PollCtlExtU,
)

// C union; only one variant is valid at a time.
public data class PollCtlExtU(
    val addr: COpaquePointer? = null,
    val data32: UInt? = null,
    val data: ULong? = null,
)

public const val RTLD_LAZY: CInt = 0x4
public const val RTLD_NOW: CInt = 0x2
public const val RTLD_GLOBAL: CInt = 0x10000
public const val RTLD_LOCAL: CInt = 0x80000
public const val RTLD_MEMBER: CInt = 0x40000
public const val RTLD_NOAUTODEFER: CInt = 0x20000
public const val O_RDONLY: CInt = 0x0
public const val O_WRONLY: CInt = 0x1
public const val O_RDWR: CInt = 0x2
public const val O_NDELAY: CInt = 0x8000
public const val O_APPEND: CInt = 0x8
public const val O_DSYNC: CInt = 0x400000
public const val O_CREAT: CInt = 0x100
public const val O_EXCL: CInt = 0x400
public const val O_NOCTTY: CInt = 0x800
public const val O_TRUNC: CInt = 0x200
public const val O_NOFOLLOW: CInt = 0x1000000
public const val O_DIRECTORY: CInt = 0x80000
public const val O_SEARCH: CInt = 0x20
public const val O_EXEC: CInt = 0x20
public const val O_CLOEXEC: CInt = 0x800000
public val O_ACCMODE: CInt = O_RDONLY or O_WRONLY or O_RDWR or O_EXEC or O_SEARCH
public const val O_DIRECT: CInt = 0x8000000
public const val O_TTY_INIT: CInt = 0
public const val O_RSYNC: CInt = 0x200000
public const val O_LARGEFILE: CInt = 0x4000000
public const val F_DUPFD: CInt = 0
public const val F_DUPFD_CLOEXEC: CInt = 16
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val F_GETLK: CInt = F_GETLK64
public const val F_SETLK: CInt = F_SETLK64
public const val F_SETLKW: CInt = F_SETLKW64
public const val F_GETOWN: CInt = 8
public const val F_SETOWN: CInt = 9
public const val F_CLOSEM: CInt = 10
public const val F_GETLK64: CInt = 11
public const val F_SETLK64: CInt = 12
public const val F_SETLKW64: CInt = 13
public const val F_DUP2FD: CInt = 14
public const val F_TSTLK: CInt = 15
public const val AT_FDCWD: CInt = -2
public const val AT_SYMLINK_NOFOLLOW: CInt = 1
public const val AT_SYMLINK_FOLLOW: CInt = 2
public const val AT_REMOVEDIR: CInt = 1
public const val AT_EACCESS: CInt = 1
public const val O_SYNC: CInt = 16
public const val O_NONBLOCK: CInt = 4
public const val FASYNC: CInt = 0x20000
public const val POSIX_FADV_NORMAL: CInt = 1
public const val POSIX_FADV_SEQUENTIAL: CInt = 2
public const val POSIX_FADV_RANDOM: CInt = 3
public const val POSIX_FADV_WILLNEED: CInt = 4
public const val POSIX_FADV_DONTNEED: CInt = 5
public const val POSIX_FADV_NOREUSE: CInt = 6
public const val GLOB_APPEND: CInt = 0x1
public const val GLOB_DOOFFS: CInt = 0x2
public const val GLOB_ERR: CInt = 0x4
public const val GLOB_MARK: CInt = 0x8
public const val GLOB_NOCHECK: CInt = 0x10
public const val GLOB_NOSORT: CInt = 0x20
public const val GLOB_NOESCAPE: CInt = 0x80
public const val GLOB_NOSPACE: CInt = 0x2000
public const val GLOB_ABORTED: CInt = 0x1000
public const val GLOB_NOMATCH: CInt = 0x4000
public const val GLOB_NOSYS: CInt = 0x8000
public const val DAY_1: NlItem = 13
public const val DAY_2: NlItem = 14
public const val DAY_3: NlItem = 15
public const val DAY_4: NlItem = 16
public const val DAY_5: NlItem = 17
public const val DAY_6: NlItem = 18
public const val DAY_7: NlItem = 19
public const val ABDAY_1: NlItem = 6
public const val ABDAY_2: NlItem = 7
public const val ABDAY_3: NlItem = 8
public const val ABDAY_4: NlItem = 9
public const val ABDAY_5: NlItem = 10
public const val ABDAY_6: NlItem = 11
public const val ABDAY_7: NlItem = 12
public const val MON_1: NlItem = 32
public const val MON_2: NlItem = 33
public const val MON_3: NlItem = 34
public const val MON_4: NlItem = 35
public const val MON_5: NlItem = 36
public const val MON_6: NlItem = 37
public const val MON_7: NlItem = 38
public const val MON_8: NlItem = 39
public const val MON_9: NlItem = 40
public const val MON_10: NlItem = 41
public const val MON_11: NlItem = 42
public const val MON_12: NlItem = 43
public const val ABMON_1: NlItem = 20
public const val ABMON_2: NlItem = 21
public const val ABMON_3: NlItem = 22
public const val ABMON_4: NlItem = 23
public const val ABMON_5: NlItem = 24
public const val ABMON_6: NlItem = 25
public const val ABMON_7: NlItem = 26
public const val ABMON_8: NlItem = 27
public const val ABMON_9: NlItem = 28
public const val ABMON_10: NlItem = 29
public const val ABMON_11: NlItem = 30
public const val ABMON_12: NlItem = 31
public const val RADIXCHAR: NlItem = 44
public const val THOUSEP: NlItem = 45
public const val YESSTR: NlItem = 46
public const val NOSTR: NlItem = 47
public const val CRNCYSTR: NlItem = 48
public const val D_T_FMT: NlItem = 1
public const val D_FMT: NlItem = 2
public const val T_FMT: NlItem = 3
public const val AM_STR: NlItem = 4
public const val PM_STR: NlItem = 5
public const val CODESET: NlItem = 49
public const val T_FMT_AMPM: NlItem = 55
public const val ERA: NlItem = 56
public const val ERA_D_FMT: NlItem = 57
public const val ERA_D_T_FMT: NlItem = 58
public const val ERA_T_FMT: NlItem = 59
public const val ALT_DIGITS: NlItem = 60
public const val YESEXPR: NlItem = 61
public const val NOEXPR: NlItem = 62
public val LC_GLOBAL_LOCALE: LocaleT = -1L.toLocaleT()
public const val LC_COLLATE: CInt = 0
public const val LC_CTYPE: CInt = 1
public const val LC_MONETARY: CInt = 2
public const val LC_NUMERIC: CInt = 3
public const val LC_TIME: CInt = 4
public const val LC_MESSAGES: CInt = 5
public const val LC_ALL: CInt = -1
public const val LC_COLLATE_MASK: CInt = 1
public const val LC_CTYPE_MASK: CInt = 2
public const val LC_MESSAGES_MASK: CInt = 4
public const val LC_MONETARY_MASK: CInt = 8
public const val LC_NUMERIC_MASK: CInt = 16
public const val LC_TIME_MASK: CInt = 32
public val LC_ALL_MASK: CInt = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK
public const val NI_MAXHOST: SocklenT = 1025u
public const val NI_MAXSERV: SocklenT = 32u
public const val NI_NOFQDN: SocklenT = 0x1u
public const val NI_NUMERICHOST: SocklenT = 0x2u
public const val NI_NAMEREQD: SocklenT = 0x4u
public const val NI_NUMERICSERV: SocklenT = 0x8u
public const val NI_DGRAM: SocklenT = 0x10u
public const val NI_NUMERICSCOPE: SocklenT = 0x40u
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
public const val EAI_OVERFLOW: CInt = 13
public const val AI_CANONNAME: CInt = 0x01
public const val AI_PASSIVE: CInt = 0x02
public const val AI_NUMERICHOST: CInt = 0x04
public const val AI_ADDRCONFIG: CInt = 0x08
public const val AI_V4MAPPED: CInt = 0x10
public const val AI_ALL: CInt = 0x20
public const val AI_NUMERICSERV: CInt = 0x40
public const val AI_EXTFLAGS: CInt = 0x80
public val AI_DEFAULT: CInt = AI_V4MAPPED or AI_ADDRCONFIG
public const val IPV6_ADDRFORM: CInt = 22
public const val IPV6_ADDR_PREFERENCES: CInt = 74
public const val IPV6_CHECKSUM: CInt = 39
public const val IPV6_DONTFRAG: CInt = 45
public const val IPV6_DSTOPTS: CInt = 54
public const val IPV6_FLOWINFO_FLOWLABEL: CInt = 0x00ffffff
public const val IPV6_FLOWINFO_PRIORITY: CInt = 0x0f000000
public const val IPV6_FLOWINFO_PRIFLOW: CInt = 0x0fffffff
public const val IPV6_FLOWINFO_SRFLAG: CInt = 0x10000000
public const val IPV6_FLOWINFO_VERSION: CInt = 0xf0000000
public const val IPV6_HOPLIMIT: CInt = 40
public const val IPV6_HOPOPTS: CInt = 52
public const val IPV6_NEXTHOP: CInt = 48
public const val IPV6_PATHMTU: CInt = 46
public const val IPV6_PKTINFO: CInt = 33
public const val IPV6_PREFER_SRC_CGA: CInt = 16
public const val IPV6_PREFER_SRC_COA: CInt = 2
public const val IPV6_PREFER_SRC_HOME: CInt = 1
public const val IPV6_PREFER_SRC_NONCGA: CInt = 32
public const val IPV6_PREFER_SRC_PUBLIC: CInt = 4
public const val IPV6_PREFER_SRC_TMP: CInt = 8
public const val IPV6_RECVDSTOPTS: CInt = 56
public const val IPV6_RECVHOPLIMIT: CInt = 41
public const val IPV6_RECVHOPOPTS: CInt = 53
public const val IPV6_RECVPATHMTU: CInt = 47
public const val IPV6_RECVRTHDR: CInt = 51
public const val IPV6_RECVTCLASS: CInt = 42
public const val IPV6_RTHDR: CInt = 50
public const val IPV6_RTHDRDSTOPTS: CInt = 55
public const val IPV6_TCLASS: CInt = 43
public const val DLT_NULL: CInt = 0x18
public const val DLT_EN10MB: CInt = 0x6
public const val DLT_EN3MB: CInt = 0x1a
public const val DLT_AX25: CInt = 0x5
public const val DLT_PRONET: CInt = 0xd
public const val DLT_IEEE802: CInt = 0x7
public const val DLT_ARCNET: CInt = 0x23
public const val DLT_SLIP: CInt = 0x1c
public const val DLT_PPP: CInt = 0x17
public const val DLT_FDDI: CInt = 0xf
public const val DLT_ATM: CInt = 0x25
public const val DLT_IPOIB: CInt = 0xc7
public const val BIOCSETF: CInt = 0x80104267
public const val BIOCGRTIMEOUT: CInt = 0x4010426e
public const val BIOCGBLEN: CInt = 0x40044266
public const val BIOCSBLEN: CInt = 0xc0044266
public const val BIOCFLUSH: CInt = 0x20004268
public const val BIOCPROMISC: CInt = 0x20004269
public const val BIOCGDLT: CInt = 0x4004426a
public const val BIOCSRTIMEOUT: CInt = 0x8010426d
public const val BIOCGSTATS: CInt = 0x4008426f
public const val BIOCIMMEDIATE: CInt = 0x80044270
public const val BIOCVERSION: CInt = 0x40044271
public const val BIOCSDEVNO: CInt = 0x20004272
public const val BIOCGETIF: CInt = 0x4020426b
public const val BIOCSETIF: CInt = 0x8020426c
public const val BPF_ABS: CInt = 32
public const val BPF_ADD: CInt = 0
public const val BPF_ALIGNMENT: CULong = 4uL
public const val BPF_ALU: CInt = 4
public const val BPF_AND: CInt = 80
public const val BPF_B: CInt = 16
public const val BPF_DIV: CInt = 48
public const val BPF_H: CInt = 8
public const val BPF_IMM: CInt = 0
public const val BPF_IND: CInt = 64
public const val BPF_JA: CInt = 0
public const val BPF_JEQ: CInt = 16
public const val BPF_JGE: CInt = 48
public const val BPF_JGT: CInt = 32
public const val BPF_JMP: CInt = 5
public const val BPF_JSET: CInt = 64
public const val BPF_K: CInt = 0
public const val BPF_LD: CInt = 0
public const val BPF_LDX: CInt = 1
public const val BPF_LEN: CInt = 128
public const val BPF_LSH: CInt = 96
public const val BPF_MAXINSNS: CInt = 512
public const val BPF_MEM: CInt = 96
public const val BPF_MEMWORDS: CInt = 16
public const val BPF_MISC: CInt = 7
public const val BPF_MSH: CInt = 160
public const val BPF_MUL: CInt = 32
public const val BPF_NEG: CInt = 128
public const val BPF_OR: CInt = 64
public const val BPF_RET: CInt = 6
public const val BPF_RSH: CInt = 112
public const val BPF_ST: CInt = 2
public const val BPF_STX: CInt = 3
public const val BPF_SUB: CInt = 16
public const val BPF_W: CInt = 0
public const val BPF_X: CInt = 8
public const val IFNET_SLOWHZ: CInt = 1
public const val IFQ_MAXLEN: CInt = 50
public const val IFF_UP: CInt = 0x1
public const val IFF_BROADCAST: CInt = 0x2
public const val IFF_DEBUG: CInt = 0x4
public const val IFF_LOOPBACK: CInt = 0x8
public const val IFF_POINTOPOINT: CInt = 0x10
public const val IFF_NOTRAILERS: CInt = 0x20
public const val IFF_RUNNING: CInt = 0x40
public const val IFF_NOARP: CInt = 0x80
public const val IFF_PROMISC: CInt = 0x100
public const val IFF_ALLMULTI: CInt = 0x200
public const val IFF_MULTICAST: CInt = 0x80000
public const val IFF_LINK0: CInt = 0x100000
public const val IFF_LINK1: CInt = 0x200000
public const val IFF_LINK2: CInt = 0x400000
public const val IFF_OACTIVE: CInt = 0x400
public const val IFF_SIMPLEX: CInt = 0x800
public const val ARPHRD_ETHER: CInt = 1
public const val ARPHRD_802_5: CInt = 6
public const val ARPHRD_802_3: CInt = 6
public const val ARPHRD_FDDI: CInt = 1
public const val RTM_ADD: CInt = 0x1
public const val RTM_DELETE: CInt = 0x2
public const val RTM_CHANGE: CInt = 0x3
public const val RTM_GET: CInt = 0x4
public const val RTM_LOSING: CInt = 0x5
public const val RTM_REDIRECT: CInt = 0x6
public const val RTM_MISS: CInt = 0x7
public const val RTM_LOCK: CInt = 0x8
public const val RTM_OLDADD: CInt = 0x9
public const val RTM_OLDDEL: CInt = 0xa
public const val RTM_RESOLVE: CInt = 0xb
public const val RTM_NEWADDR: CInt = 0xc
public const val RTM_DELADDR: CInt = 0xd
public const val RTM_IFINFO: CInt = 0xe
public const val RTM_EXPIRE: CInt = 0xf
public const val RTM_RTLOST: CInt = 0x10
public const val RTM_GETNEXT: CInt = 0x11
public const val RTM_SAMEADDR: CInt = 0x12
public const val RTM_SET: CInt = 0x13
public const val RTV_MTU: CInt = 0x1
public const val RTV_HOPCOUNT: CInt = 0x2
public const val RTV_EXPIRE: CInt = 0x4
public const val RTV_RPIPE: CInt = 0x8
public const val RTV_SPIPE: CInt = 0x10
public const val RTV_SSTHRESH: CInt = 0x20
public const val RTV_RTT: CInt = 0x40
public const val RTV_RTTVAR: CInt = 0x80
public const val RTA_DST: CInt = 0x1
public const val RTA_GATEWAY: CInt = 0x2
public const val RTA_NETMASK: CInt = 0x4
public const val RTA_GENMASK: CInt = 0x8
public const val RTA_IFP: CInt = 0x10
public const val RTA_IFA: CInt = 0x20
public const val RTA_AUTHOR: CInt = 0x40
public const val RTA_BRD: CInt = 0x80
public const val RTA_DOWNSTREAM: CInt = 0x100
public const val RTAX_DST: CInt = 0
public const val RTAX_GATEWAY: CInt = 1
public const val RTAX_NETMASK: CInt = 2
public const val RTAX_GENMASK: CInt = 3
public const val RTAX_IFP: CInt = 4
public const val RTAX_IFA: CInt = 5
public const val RTAX_AUTHOR: CInt = 6
public const val RTAX_BRD: CInt = 7
public const val RTAX_MAX: CInt = 8
public const val RTF_UP: CInt = 0x1
public const val RTF_GATEWAY: CInt = 0x2
public const val RTF_HOST: CInt = 0x4
public const val RTF_REJECT: CInt = 0x8
public const val RTF_DYNAMIC: CInt = 0x10
public const val RTF_MODIFIED: CInt = 0x20
public const val RTF_DONE: CInt = 0x40
public const val RTF_MASK: CInt = 0x80
public const val RTF_CLONING: CInt = 0x100
public const val RTF_XRESOLVE: CInt = 0x200
public const val RTF_LLINFO: CInt = 0x400
public const val RTF_STATIC: CInt = 0x800
public const val RTF_BLACKHOLE: CInt = 0x1000
public const val RTF_BUL: CInt = 0x2000
public const val RTF_PROTO2: CInt = 0x4000
public const val RTF_PROTO1: CInt = 0x8000
public const val RTF_CLONE: CInt = 0x10000
public const val RTF_CLONED: CInt = 0x20000
public const val RTF_PROTO3: CInt = 0x40000
public const val RTF_BCE: CInt = 0x80000
public const val RTF_PINNED: CInt = 0x100000
public const val RTF_LOCAL: CInt = 0x200000
public const val RTF_BROADCAST: CInt = 0x400000
public const val RTF_MULTICAST: CInt = 0x800000
public const val RTF_ACTIVE_DGD: CInt = 0x1000000
public const val RTF_STOPSRCH: CInt = 0x2000000
public const val RTF_FREE_IN_PROG: CInt = 0x4000000
public const val RTF_PERMANENT6: CInt = 0x8000000
public const val RTF_UNREACHABLE: CInt = 0x10000000
public const val RTF_CACHED: CInt = 0x20000000
public const val RTF_SMALLMTU: CInt = 0x40000
public const val IPPROTO_HOPOPTS: CInt = 0
public const val IPPROTO_IGMP: CInt = 2
public const val IPPROTO_GGP: CInt = 3
public const val IPPROTO_IPIP: CInt = 4
public const val IPPROTO_EGP: CInt = 8
public const val IPPROTO_PUP: CInt = 12
public const val IPPROTO_IDP: CInt = 22
public const val IPPROTO_TP: CInt = 29
public const val IPPROTO_ROUTING: CInt = 43
public const val IPPROTO_FRAGMENT: CInt = 44
public const val IPPROTO_QOS: CInt = 45
public const val IPPROTO_RSVP: CInt = 46
public const val IPPROTO_GRE: CInt = 47
public const val IPPROTO_ESP: CInt = 50
public const val IPPROTO_AH: CInt = 51
public const val IPPROTO_NONE: CInt = 59
public const val IPPROTO_DSTOPTS: CInt = 60
public const val IPPROTO_LOCAL: CInt = 63
public const val IPPROTO_EON: CInt = 80
public const val IPPROTO_BIP: CInt = 0x53
public const val IPPROTO_SCTP: CInt = 132
public const val IPPROTO_MH: CInt = 135
public const val IPPROTO_GIF: CInt = 140
public const val IPPROTO_RAW: CInt = 255
public const val IP_OPTIONS: CInt = 1
public const val IP_HDRINCL: CInt = 2
public const val IP_TOS: CInt = 3
public const val IP_TTL: CInt = 4
public const val IP_UNICAST_HOPS: CInt = 4
public const val IP_RECVOPTS: CInt = 5
public const val IP_RECVRETOPTS: CInt = 6
public const val IP_RECVDSTADDR: CInt = 7
public const val IP_RETOPTS: CInt = 8
public const val IP_MULTICAST_IF: CInt = 9
public const val IP_MULTICAST_TTL: CInt = 10
public const val IP_MULTICAST_HOPS: CInt = 10
public const val IP_MULTICAST_LOOP: CInt = 11
public const val IP_ADD_MEMBERSHIP: CInt = 12
public const val IP_DROP_MEMBERSHIP: CInt = 13
public const val IP_RECVMACHDR: CInt = 14
public const val IP_RECVIFINFO: CInt = 15
public const val IP_BROADCAST_IF: CInt = 16
public const val IP_DHCPMODE: CInt = 17
public const val IP_RECVIF: CInt = 20
public const val IP_ADDRFORM: CInt = 22
public const val IP_DONTFRAG: CInt = 25
public const val IP_FINDPMTU: CInt = 26
public const val IP_PMTUAGE: CInt = 27
public const val IP_RECVINTERFACE: CInt = 32
public const val IP_RECVTTL: CInt = 34
public const val IP_BLOCK_SOURCE: CInt = 58
public const val IP_UNBLOCK_SOURCE: CInt = 59
public const val IP_ADD_SOURCE_MEMBERSHIP: CInt = 60
public const val IP_DROP_SOURCE_MEMBERSHIP: CInt = 61
public const val IP_DEFAULT_MULTICAST_TTL: CInt = 1
public const val IP_DEFAULT_MULTICAST_LOOP: CInt = 1
public const val IP_INC_MEMBERSHIPS: CInt = 20
public const val IP_INIT_MEMBERSHIP: CInt = 20
public const val IPV6_UNICAST_HOPS: CInt = IP_TTL
public const val IPV6_MULTICAST_IF: CInt = IP_MULTICAST_IF
public const val IPV6_MULTICAST_HOPS: CInt = IP_MULTICAST_TTL
public const val IPV6_MULTICAST_LOOP: CInt = IP_MULTICAST_LOOP
public const val IPV6_RECVPKTINFO: CInt = 35
public const val IPV6_V6ONLY: CInt = 37
public const val IPV6_ADD_MEMBERSHIP: CInt = IP_ADD_MEMBERSHIP
public const val IPV6_DROP_MEMBERSHIP: CInt = IP_DROP_MEMBERSHIP
public const val IPV6_JOIN_GROUP: CInt = IP_ADD_MEMBERSHIP
public const val IPV6_LEAVE_GROUP: CInt = IP_DROP_MEMBERSHIP
public const val MCAST_BLOCK_SOURCE: CInt = 64
public const val MCAST_EXCLUDE: CInt = 2
public const val MCAST_INCLUDE: CInt = 1
public const val MCAST_JOIN_GROUP: CInt = 62
public const val MCAST_JOIN_SOURCE_GROUP: CInt = 66
public const val MCAST_LEAVE_GROUP: CInt = 63
public const val MCAST_LEAVE_SOURCE_GROUP: CInt = 67
public const val MCAST_UNBLOCK_SOURCE: CInt = 65
public const val MAXTTL: CInt = 255
public const val IPDEFTTL: CInt = 64
public const val IPOPT_CONTROL: CInt = 0
public const val IPOPT_EOL: CInt = 0
public const val IPOPT_LSRR: CInt = 131
public const val IPOPT_MINOFF: CInt = 4
public const val IPOPT_NOP: CInt = 1
public const val IPOPT_OFFSET: CInt = 2
public const val IPOPT_OLEN: CInt = 1
public const val IPOPT_OPTVAL: CInt = 0
public const val IPOPT_RESERVED1: CInt = 0x20
public const val IPOPT_RESERVED2: CInt = 0x60
public const val IPOPT_RR: CInt = 7
public const val IPOPT_SSRR: CInt = 137
public const val IPOPT_TS: CInt = 68
public const val IPOPT_TS_PRESPEC: CInt = 3
public const val IPOPT_TS_TSANDADDR: CInt = 1
public const val IPOPT_TS_TSONLY: CInt = 0
public const val IPTOS_LOWDELAY: CInt = 16
public const val IPTOS_PREC_CRITIC_ECP: CInt = 160
public const val IPTOS_PREC_FLASH: CInt = 96
public const val IPTOS_PREC_FLASHOVERRIDE: CInt = 128
public const val IPTOS_PREC_IMMEDIATE: CInt = 64
public const val IPTOS_PREC_INTERNETCONTROL: CInt = 192
public const val IPTOS_PREC_NETCONTROL: CInt = 224
public const val IPTOS_PREC_PRIORITY: CInt = 32
public const val IPTOS_PREC_ROUTINE: CInt = 16
public const val IPTOS_RELIABILITY: CInt = 4
public const val IPTOS_THROUGHPUT: CInt = 8
public const val IPVERSION: CInt = 4
public const val TCP_NODELAY: CInt = 0x1
public const val TCP_MAXSEG: CInt = 0x2
public const val TCP_RFC1323: CInt = 0x4
public const val TCP_KEEPALIVE: CInt = 0x8
public const val TCP_KEEPIDLE: CInt = 0x11
public const val TCP_KEEPINTVL: CInt = 0x12
public const val TCP_KEEPCNT: CInt = 0x13
public const val TCP_NODELAYACK: CInt = 0x14
public const val PTHREAD_BARRIER_SERIAL_THREAD: CInt = 2
public const val PTHREAD_CREATE_JOINABLE: CInt = 0
public const val PTHREAD_CREATE_DETACHED: CInt = 1
public const val PTHREAD_PROCESS_SHARED: CInt = 0
public val PTHREAD_PROCESS_PRIVATE: CUShort = (1).toUShort()
public val PTHREAD_STACK_MIN: ULong = PAGESIZE.toULong() * 4
public const val PTHREAD_MUTEX_NORMAL: CInt = 5
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 3
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 4
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
public const val PTHREAD_MUTEX_ROBUST: CInt = 1
public const val PTHREAD_MUTEX_STALLED: CInt = 0
public const val PTHREAD_PRIO_INHERIT: CInt = 3
public const val PTHREAD_PRIO_NONE: CInt = 1
public const val PTHREAD_PRIO_PROTECT: CInt = 2
public const val REG_EXTENDED: CInt = 1
public const val REG_ICASE: CInt = 2
public const val REG_NEWLINE: CInt = 4
public const val REG_NOSUB: CInt = 8
public const val REG_NOTBOL: CInt = 0x100
public const val REG_NOTEOL: CInt = 0x200
public const val REG_NOMATCH: CInt = 1
public const val REG_BADPAT: CInt = 2
public const val REG_ECOLLATE: CInt = 3
public const val REG_ECTYPE: CInt = 4
public const val REG_EESCAPE: CInt = 5
public const val REG_ESUBREG: CInt = 6
public const val REG_EBRACK: CInt = 7
public const val REG_EPAREN: CInt = 8
public const val REG_EBRACE: CInt = 9
public const val REG_BADBR: CInt = 10
public const val REG_ERANGE: CInt = 11
public const val REG_ESPACE: CInt = 12
public const val REG_BADRPT: CInt = 13
public const val REG_ECHAR: CInt = 14
public const val REG_EBOL: CInt = 15
public const val REG_EEOL: CInt = 16
public const val REG_ENOSYS: CInt = 17
public const val NFSMNT_SOFT: CInt = 0x001
public const val NFSMNT_WSIZE: CInt = 0x002
public const val NFSMNT_RSIZE: CInt = 0x004
public const val NFSMNT_TIMEO: CInt = 0x008
public const val NFSMNT_RETRANS: CInt = 0x010
public const val NFSMNT_HOSTNAME: CInt = 0x020
public const val NFSMNT_INT: CInt = 0x040
public const val NFSMNT_NOAC: CInt = 0x080
public const val NFSMNT_ACREGMIN: CInt = 0x0100
public const val NFSMNT_ACREGMAX: CInt = 0x0200
public const val NFSMNT_ACDIRMIN: CInt = 0x0400
public const val NFSMNT_ACDIRMAX: CInt = 0x0800
public const val CPUSTATES: CInt = 4
public const val POSIX_SPAWN_SETPGROUP: CInt = 0x1
public const val POSIX_SPAWN_SETSIGMASK: CInt = 0x2
public const val POSIX_SPAWN_SETSIGDEF: CInt = 0x4
public const val POSIX_SPAWN_SETSCHEDULER: CInt = 0x8
public const val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x10
public const val POSIX_SPAWN_RESETIDS: CInt = 0x20
public const val POSIX_SPAWN_FORK_HANDLERS: CInt = 0x1000
public const val EOF: CInt = -1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val _IOFBF: CInt = 0
public const val _IONBF: CInt = 4
public const val _IOLBF: CInt = 64
public const val BUFSIZ: CUInt = 4096u
public const val FOPEN_MAX: CUInt = 32767u
public const val FILENAME_MAX: CUInt = 255u
public const val L_tmpnam: CUInt = 21u
public const val TMP_MAX: CUInt = 16384u
public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val RAND_MAX: CInt = 32767
public const val F_OK: CInt = 0
public const val R_OK: CInt = 4
public const val W_OK: CInt = 2
public const val X_OK: CInt = 1
public const val LIO_NOP: CInt = 0
public const val LIO_READ: CInt = 1
public const val LIO_WRITE: CInt = 2
public const val LIO_NOWAIT: CInt = 0
public const val LIO_WAIT: CInt = 1
public const val AIO_ALLDONE: CInt = 2
public const val AIO_CANCELED: CInt = 0
public const val AIO_NOTCANCELED: CInt = 1
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
public const val ENOTREADY: CInt = 46
public const val EWRPROTECT: CInt = 47
public const val EFORMAT: CInt = 48
public const val ENOLCK: CInt = 49
public const val ENOCONNECT: CInt = 50
public const val ESTALE: CInt = 52
public const val EDIST: CInt = 53
public const val EWOULDBLOCK: CInt = EAGAIN
public const val EINPROGRESS: CInt = 55
public const val EALREADY: CInt = 56
public const val ENOTSOCK: CInt = 57
public const val EDESTADDRREQ: CInt = 58
public const val EMSGSIZE: CInt = 59
public const val EPROTOTYPE: CInt = 60
public const val ENOPROTOOPT: CInt = 61
public const val EPROTONOSUPPORT: CInt = 62
public const val ESOCKTNOSUPPORT: CInt = 63
public const val EOPNOTSUPP: CInt = 64
public const val EPFNOSUPPORT: CInt = 65
public const val EAFNOSUPPORT: CInt = 66
public const val EADDRINUSE: CInt = 67
public const val EADDRNOTAVAIL: CInt = 68
public const val ENETDOWN: CInt = 69
public const val ENETUNREACH: CInt = 70
public const val ENETRESET: CInt = 71
public const val ECONNABORTED: CInt = 72
public const val ECONNRESET: CInt = 73
public const val ENOBUFS: CInt = 74
public const val EISCONN: CInt = 75
public const val ENOTCONN: CInt = 76
public const val ESHUTDOWN: CInt = 77
public const val ETIMEDOUT: CInt = 78
public const val ECONNREFUSED: CInt = 79
public const val EHOSTDOWN: CInt = 80
public const val EHOSTUNREACH: CInt = 81
public const val ERESTART: CInt = 82
public const val EPROCLIM: CInt = 83
public const val EUSERS: CInt = 84
public const val ELOOP: CInt = 85
public const val ENAMETOOLONG: CInt = 86
public const val ENOTEMPTY: CInt = 87
public const val EDQUOT: CInt = 88
public const val ECORRUPT: CInt = 89
public const val ESYSERROR: CInt = 90
public const val EREMOTE: CInt = 93
public const val ENOTRECOVERABLE: CInt = 94
public const val EOWNERDEAD: CInt = 95
public const val ENOSYS: CInt = 109
public const val EMEDIA: CInt = 110
public const val ESOFT: CInt = 111
public const val ENOATTR: CInt = 112
public const val ESAD: CInt = 113
public const val ENOTRUST: CInt = 114
public const val ETOOMANYREFS: CInt = 115
public const val EILSEQ: CInt = 116
public const val ECANCELED: CInt = 117
public const val ENOSR: CInt = 118
public const val ETIME: CInt = 119
public const val EBADMSG: CInt = 120
public const val EPROTO: CInt = 121
public const val ENODATA: CInt = 122
public const val ENOSTR: CInt = 123
public const val ENOTSUP: CInt = 124
public const val EMULTIHOP: CInt = 125
public const val ENOLINK: CInt = 126
public const val EOVERFLOW: CInt = 127
public const val LPAR_INFO_FORMAT1: CInt = 1
public const val LPAR_INFO_FORMAT2: CInt = 2
public const val WPAR_INFO_FORMAT: CInt = 3
public const val PROC_MODULE_INFO: CInt = 4
public const val NUM_PROC_MODULE_TYPES: CInt = 5
public const val LPAR_INFO_VRME_NUM_POOLS: CInt = 6
public const val LPAR_INFO_VRME_POOLS: CInt = 7
public const val LPAR_INFO_VRME_LPAR: CInt = 8
public const val LPAR_INFO_VRME_RESET_HWMARKS: CInt = 9
public const val LPAR_INFO_VRME_ALLOW_DESIRED: CInt = 10
public const val EMTP_INFO_FORMAT: CInt = 11
public const val LPAR_INFO_LPM_CAPABILITY: CInt = 12
public const val ENERGYSCALE_INFO: CInt = 13
public const val LOCK_SH: CInt = 1
public const val LOCK_EX: CInt = 2
public const val LOCK_NB: CInt = 4
public const val LOCK_UN: CInt = 8
public const val F_RDLCK: CShort = 1
public const val F_WRLCK: CShort = 2
public const val F_UNLCK: CShort = 3
public const val Q_QUOTAON: CInt = 0x100
public const val Q_QUOTAOFF: CInt = 0x200
public const val Q_SETUSE: CInt = 0x500
public const val Q_SYNC: CInt = 0x600
public const val Q_GETQUOTA: CInt = 0x300
public const val Q_SETQLIM: CInt = 0x400
public const val Q_SETQUOTA: CInt = 0x400
public const val IOCPARM_MASK: CInt = 0x7f
public const val IOC_VOID: CInt = 0x20000000
public const val IOC_OUT: CInt = 0x40000000
public val IOC_IN: CInt = 0x40000000 shl 1
public val IOC_INOUT: CInt = IOC_IN or IOC_OUT
public const val FIOCLEX: CInt = 0x20006601
public const val FIONCLEX: CInt = 0x20006602
public const val FIONREAD: CInt = 0x4004667f
public const val FIONBIO: CInt = 0x8004667e
public const val FIOASYNC: CInt = 0x8004667d
public const val FIOSETOWN: CInt = 0x8004667c
public const val FIOGETOWN: CInt = 0x4004667b
public const val TIOCGETD: CInt = 0x40047400
public const val TIOCSETD: CInt = 0x80047401
public const val TIOCHPCL: CInt = 0x20007402
public const val TIOCMODG: CInt = 0x40047403
public const val TIOCMODS: CInt = 0x80047404
public const val TIOCM_LE: CInt = 0x1
public const val TIOCM_DTR: CInt = 0x2
public const val TIOCM_RTS: CInt = 0x4
public const val TIOCM_ST: CInt = 0x8
public const val TIOCM_SR: CInt = 0x10
public const val TIOCM_CTS: CInt = 0x20
public const val TIOCM_CAR: CInt = 0x40
public const val TIOCM_CD: CInt = 0x40
public const val TIOCM_RNG: CInt = 0x80
public const val TIOCM_RI: CInt = 0x80
public const val TIOCM_DSR: CInt = 0x100
public const val TIOCGETP: CInt = 0x40067408
public const val TIOCSETP: CInt = 0x80067409
public const val TIOCSETN: CInt = 0x8006740a
public const val TIOCEXCL: CInt = 0x2000740d
public const val TIOCNXCL: CInt = 0x2000740e
public const val TIOCFLUSH: CInt = 0x80047410
public const val TIOCSETC: CInt = 0x80067411
public const val TIOCGETC: CInt = 0x40067412
public const val TANDEM: CInt = 0x1
public const val CBREAK: CInt = 0x2
public const val LCASE: CInt = 0x4
public const val MDMBUF: CInt = 0x800000
public const val XTABS: CInt = 0xc00
public const val SIOCADDMULTI: CInt = 0x80206931
public const val SIOCADDRT: CInt = 0x8038720a
public const val SIOCDARP: CInt = 0x804c6920
public const val SIOCDELMULTI: CInt = 0x80206932
public const val SIOCDELRT: CInt = 0x8038720b
public const val SIOCDIFADDR: CInt = 0x80286919
public const val SIOCGARP: CInt = 0xc04c6926
public const val SIOCGIFADDR: CInt = 0xc0286921
public const val SIOCGIFBRDADDR: CInt = 0xc0286923
public const val SIOCGIFCONF: CInt = 0xc0106945
public const val SIOCGIFDSTADDR: CInt = 0xc0286922
public const val SIOCGIFFLAGS: CInt = 0xc0286911
public const val SIOCGIFHWADDR: CInt = 0xc0546995
public const val SIOCGIFMETRIC: CInt = 0xc0286917
public const val SIOCGIFMTU: CInt = 0xc0286956
public const val SIOCGIFNETMASK: CInt = 0xc0286925
public const val SIOCSARP: CInt = 0x804c691e
public const val SIOCSIFADDR: CInt = 0x8028690c
public const val SIOCSIFBRDADDR: CInt = 0x80286913
public const val SIOCSIFDSTADDR: CInt = 0x8028690e
public const val SIOCSIFFLAGS: CInt = 0x80286910
public const val SIOCSIFMETRIC: CInt = 0x80286918
public const val SIOCSIFMTU: CInt = 0x80286958
public const val SIOCSIFNETMASK: CInt = 0x80286916
public const val TIOCUCNTL: CInt = 0x80047466
public const val TIOCCONS: CInt = 0x80047462
public const val TIOCPKT: CInt = 0x80047470
public const val TIOCPKT_DATA: CInt = 0
public const val TIOCPKT_FLUSHREAD: CInt = 1
public const val TIOCPKT_FLUSHWRITE: CInt = 2
public const val TIOCPKT_NOSTOP: CInt = 0x10
public const val TIOCPKT_DOSTOP: CInt = 0x20
public const val TIOCPKT_START: CInt = 8
public const val TIOCPKT_STOP: CInt = 4
public const val IPC_ALLOC: CInt = 32768
public const val IPC_CREAT: CInt = 8192
public const val IPC_EXCL: CInt = 1024
public const val IPC_NOWAIT: CInt = 2048
public const val IPC_RMID: CInt = 0
public const val IPC_SET: CInt = 101
public const val IPC_R: CInt = 256
public const val IPC_W: CInt = 128
public const val IPC_O: CInt = 512
public const val IPC_NOERROR: CInt = 4096
public const val IPC_STAT: CInt = 102
public const val IPC_PRIVATE: KeyT = -1
public const val SHM_LOCK: CInt = 201
public const val SHM_UNLOCK: CInt = 202
public const val L_GETMESSAGES: CInt = 1
public const val L_GETINFO: CInt = 2
public const val L_GETLIBPATH: CInt = 3
public const val L_GETKERNINFO: CInt = 4
public const val L_GETLIB32INFO: CInt = 5
public const val L_GETLIB64INFO: CInt = 6
public const val L_GETPROCINFO: CInt = 7
public const val L_GETXINFO: CInt = 8
public const val PATH_MAX: CInt = 1023
public const val PAGESIZE: CInt = 4096
public const val IOV_MAX: CInt = 16
public const val AIO_LISTIO_MAX: CInt = 4096
public const val PIPE_BUF: ULong = 32768uL
public const val OPEN_MAX: CInt = 65534
public const val MAX_INPUT: CInt = 512
public const val MAX_CANON: CInt = 256
public const val ARG_MAX: CInt = 1048576
public const val BC_BASE_MAX: CInt = 99
public const val BC_DIM_MAX: CInt = 0x800
public const val BC_SCALE_MAX: CInt = 99
public const val BC_STRING_MAX: CInt = 0x800
public const val CHARCLASS_NAME_MAX: CInt = 14
public const val CHILD_MAX: CInt = 128
public const val COLL_WEIGHTS_MAX: CInt = 4
public const val EXPR_NEST_MAX: CInt = 32
public const val NZERO: CInt = 20
public const val F_LOCK: CInt = 1
public const val F_TEST: CInt = 3
public const val F_TLOCK: CInt = 2
public const val F_ULOCK: CInt = 0
public const val BIG_ENDIAN: CInt = 4321
public const val LITTLE_ENDIAN: CInt = 1234
public const val PDP_ENDIAN: CInt = 3412
public const val PROT_NONE: CInt = 0
public const val PROT_READ: CInt = 1
public const val PROT_WRITE: CInt = 2
public const val PROT_EXEC: CInt = 4
public const val MAP_FILE: CInt = 0
public const val MAP_SHARED: CInt = 1
public const val MAP_PRIVATE: CInt = 2
public const val MAP_FIXED: CInt = 0x100
public const val MAP_ANON: CInt = 0x10
public const val MAP_ANONYMOUS: CInt = 0x10
public const val MAP_TYPE: CInt = 0xf0
public const val MCL_CURRENT: CInt = 0x100
public const val MCL_FUTURE: CInt = 0x200
public const val MS_SYNC: CInt = 0x20
public const val MS_ASYNC: CInt = 0x10
public const val MS_INVALIDATE: CInt = 0x40
public const val POSIX_MADV_NORMAL: CInt = 1
public const val POSIX_MADV_RANDOM: CInt = 3
public const val POSIX_MADV_SEQUENTIAL: CInt = 2
public const val POSIX_MADV_WILLNEED: CInt = 4
public const val POSIX_MADV_DONTNEED: CInt = 5
public const val MADV_NORMAL: CInt = 0
public const val MADV_RANDOM: CInt = 1
public const val MADV_SEQUENTIAL: CInt = 2
public const val MADV_WILLNEED: CInt = 3
public const val MADV_DONTNEED: CInt = 4
public const val S_IFMT: ModeT = 61440
public const val S_IFREG: ModeT = 32768
public const val S_IFDIR: ModeT = 16384
public const val S_IFBLK: ModeT = 24576
public const val S_IFCHR: ModeT = 8192
public const val S_IFIFO: ModeT = 4096
public const val S_IRWXU: ModeT = 448
public const val S_IRUSR: ModeT = 256
public const val S_IWUSR: ModeT = 128
public const val S_IXUSR: ModeT = 64
public const val S_IRWXG: ModeT = 56
public const val S_IRGRP: ModeT = 32
public const val S_IWGRP: ModeT = 16
public const val S_IXGRP: ModeT = 8
public const val S_IRWXO: ModeT = 7
public const val S_IROTH: ModeT = 4
public const val S_IWOTH: ModeT = 2
public const val S_IXOTH: ModeT = 1
public const val S_IFLNK: ModeT = 40960
public const val S_IFSOCK: ModeT = 49152
public const val S_IEXEC: ModeT = 64
public const val S_IWRITE: ModeT = 128
public const val S_IREAD: ModeT = 256
public const val MSG_NOERROR: CInt = 4096
public const val SIGSTKSZ: ULong = 4096uL
public const val MINSIGSTKSZ: ULong = 1200uL
public const val MAXPATHLEN: CInt = PATH_MAX + 1
public const val MAXSYMLINKS: CInt = 20
public const val MAXHOSTNAMELEN: CInt = 256
public const val MAXUPRC: CInt = 128
public const val NGROUPS_MAX: CULong = 2048uL
public const val NGROUPS: CULong = NGROUPS_MAX
public const val NOFILE: CInt = OPEN_MAX
public const val POLLIN: CShort = 0x0001
public const val POLLPRI: CShort = 0x0004
public const val POLLOUT: CShort = 0x0002
public const val POLLERR: CShort = 0x4000
public const val POLLHUP: CShort = 0x2000
public const val POLLMSG: CShort = 0x0080
public const val POLLSYNC: CShort = 0x8000
public const val POLLNVAL: CShort = POLLSYNC
public const val POLLNORM: CShort = POLLIN
public const val POLLRDNORM: CShort = 0x0010
public const val POLLWRNORM: CShort = POLLOUT
public const val POLLRDBAND: CShort = 0x0020
public const val POLLWRBAND: CShort = 0x0040
public val PS_ADD: CUChar = (0).toUByte()
public val PS_MOD: CUChar = (1).toUByte()
public val PS_DELETE: CUChar = (2).toUByte()
public val PS_REPLACE: CUChar = (3).toUByte()
public const val PT_TRACE_ME: CInt = 0
public const val PT_READ_I: CInt = 1
public const val PT_READ_D: CInt = 2
public const val PT_WRITE_I: CInt = 4
public const val PT_WRITE_D: CInt = 5
public const val PT_CONTINUE: CInt = 7
public const val PT_KILL: CInt = 8
public const val PT_STEP: CInt = 9
public const val PT_READ_GPR: CInt = 11
public const val PT_READ_FPR: CInt = 12
public const val PT_WRITE_GPR: CInt = 14
public const val PT_WRITE_FPR: CInt = 15
public const val PT_READ_BLOCK: CInt = 17
public const val PT_WRITE_BLOCK: CInt = 19
public const val PT_ATTACH: CInt = 30
public const val PT_DETACH: CInt = 31
public const val PT_REGSET: CInt = 32
public const val PT_REATT: CInt = 33
public const val PT_LDINFO: CInt = 34
public const val PT_MULTI: CInt = 35
public const val PT_NEXT: CInt = 36
public const val PT_SET: CInt = 37
public const val PT_CLEAR: CInt = 38
public const val PT_LDXINFO: CInt = 39
public const val PT_QUERY: CInt = 40
public const val PT_WATCH: CInt = 41
public const val PTT_CONTINUE: CInt = 50
public const val PTT_STEP: CInt = 51
public const val PTT_READ_SPRS: CInt = 52
public const val PTT_WRITE_SPRS: CInt = 53
public const val PTT_READ_GPRS: CInt = 54
public const val PTT_WRITE_GPRS: CInt = 55
public const val PTT_READ_FPRS: CInt = 56
public const val PTT_WRITE_FPRS: CInt = 57
public const val PTT_READ_VEC: CInt = 58
public const val PTT_WRITE_VEC: CInt = 59
public const val PTT_WATCH: CInt = 60
public const val PTT_SET_TRAP: CInt = 61
public const val PTT_CLEAR_TRAP: CInt = 62
public const val PTT_READ_UKEYSET: CInt = 63
public const val PT_GET_UKEY: CInt = 64
public const val PTT_READ_FPSCR_HI: CInt = 65
public const val PTT_WRITE_FPSCR_HI: CInt = 66
public const val PTT_READ_VSX: CInt = 67
public const val PTT_WRITE_VSX: CInt = 68
public const val PTT_READ_TM: CInt = 69
public const val PTRACE_ATTACH: CInt = 14
public const val PTRACE_CONT: CInt = 7
public const val PTRACE_DETACH: CInt = 15
public const val PTRACE_GETFPREGS: CInt = 12
public const val PTRACE_GETREGS: CInt = 10
public const val PTRACE_KILL: CInt = 8
public const val PTRACE_PEEKDATA: CInt = 2
public const val PTRACE_PEEKTEXT: CInt = 1
public const val PTRACE_PEEKUSER: CInt = 3
public const val PTRACE_POKEDATA: CInt = 5
public const val PTRACE_POKETEXT: CInt = 4
public const val PTRACE_POKEUSER: CInt = 6
public const val PTRACE_SETFPREGS: CInt = 13
public const val PTRACE_SETREGS: CInt = 11
public const val PTRACE_SINGLESTEP: CInt = 9
public const val PTRACE_SYSCALL: CInt = 16
public const val PTRACE_TRACEME: CInt = 0
public const val RLIMIT_CPU: CInt = 0
public const val RLIMIT_FSIZE: CInt = 1
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_STACK: CInt = 3
public const val RLIMIT_CORE: CInt = 4
public const val RLIMIT_RSS: CInt = 5
public const val RLIMIT_AS: CInt = 6
public const val RLIMIT_NOFILE: CInt = 7
public const val RLIMIT_THREADS: CInt = 8
public const val RLIMIT_NPROC: CInt = 9
public const val RUSAGE_SELF: CInt = 0
public const val RUSAGE_CHILDREN: CInt = -1
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
public const val RUSAGE_THREAD: CInt = 1
public const val RLIM_SAVED_MAX: CULong = RLIM_INFINITY - 1
public const val RLIM_SAVED_CUR: CULong = RLIM_INFINITY - 2
public const val RLIM_NLIMITS: CInt = 10
public const val SCHED_OTHER: CInt = 0
public const val SCHED_FIFO: CInt = 1
public const val SCHED_RR: CInt = 2
public const val SCHED_LOCAL: CInt = 3
public const val SCHED_GLOBAL: CInt = 4
public const val SCHED_FIFO2: CInt = 5
public const val SCHED_FIFO3: CInt = 6
public const val SCHED_FIFO4: CInt = 7
public const val SEM_UNDO: CInt = 4096
public const val GETNCNT: CInt = 3
public const val GETPID: CInt = 4
public const val GETVAL: CInt = 5
public const val GETALL: CInt = 6
public const val GETZCNT: CInt = 7
public const val SETVAL: CInt = 8
public const val SETALL: CInt = 9
public const val SHMLBA: CInt = 0x10000000
public const val SHMLBA_EXTSHM: CInt = 0x1000
public const val SHM_SHMAT: CInt = 0x80000000
public const val SHM_RDONLY: CInt = 4096
public const val SHM_RND: CInt = 8192
public const val SHM_PIN: CInt = 2048
public const val SHM_LGPAGE: CInt = 2147483648
public const val SHM_MAP: CInt = 2048
public const val SHM_FMAP: CInt = 1024
public const val SHM_COPY: CInt = 16384
public const val SHM_CLEAR: CInt = 0
public const val SHM_HGSEG: CInt = 1073741824
public const val SHM_R: CInt = IPC_R
public const val SHM_W: CInt = IPC_W
public const val SHM_DEST: CInt = 1024
public const val SA_ONSTACK: CInt = 0x00000001
public const val SA_RESETHAND: CInt = 0x00000002
public const val SA_RESTART: CInt = 0x00000008
public const val SA_SIGINFO: CInt = 0x00000100
public const val SA_NODEFER: CInt = 0x00000200
public const val SA_NOCLDWAIT: CInt = 0x00000400
public const val SA_NOCLDSTOP: CInt = 0x00000004
public const val SS_ONSTACK: CInt = 0x00000001
public const val SS_DISABLE: CInt = 0x00000002
public const val SIGCHLD: CInt = 20
public const val SIGBUS: CInt = 10
public const val SIG_BLOCK: CInt = 0
public const val SIG_UNBLOCK: CInt = 1
public const val SIG_SETMASK: CInt = 2
public const val SIGEV_NONE: CInt = 1
public const val SIGEV_SIGNAL: CInt = 2
public const val SIGEV_THREAD: CInt = 3
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
public const val SIGUSR1: CInt = 30
public const val SIGUSR2: CInt = 31
public const val SIGPWR: CInt = 29
public const val SIGWINCH: CInt = 28
public const val SIGURG: CInt = 16
public const val SIGPOLL: CInt = SIGIO
public const val SIGIO: CInt = 23
public const val SIGSTOP: CInt = 17
public const val SIGTSTP: CInt = 18
public const val SIGCONT: CInt = 19
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGVTALRM: CInt = 34
public const val SIGPROF: CInt = 32
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGTRAP: CInt = 5
public const val SIGCLD: CInt = 20
public const val SIGRTMAX: CInt = 57
public const val SIGRTMIN: CInt = 50
public const val SI_USER: CInt = 0
public const val SI_UNDEFINED: CInt = 8
public const val SI_EMPTY: CInt = 9
public const val BUS_ADRALN: CInt = 1
public const val BUS_ADRERR: CInt = 2
public const val BUS_OBJERR: CInt = 3
public const val BUS_UEGARD: CInt = 4
public const val CLD_EXITED: CInt = 10
public const val CLD_KILLED: CInt = 11
public const val CLD_DUMPED: CInt = 12
public const val CLD_TRAPPED: CInt = 13
public const val CLD_STOPPED: CInt = 14
public const val CLD_CONTINUED: CInt = 15
public const val FPE_INTDIV: CInt = 20
public const val FPE_INTOVF: CInt = 21
public const val FPE_FLTDIV: CInt = 22
public const val FPE_FLTOVF: CInt = 23
public const val FPE_FLTUND: CInt = 24
public const val FPE_FLTRES: CInt = 25
public const val FPE_FLTINV: CInt = 26
public const val FPE_FLTSUB: CInt = 27
public const val ILL_ILLOPC: CInt = 30
public const val ILL_ILLOPN: CInt = 31
public const val ILL_ILLADR: CInt = 32
public const val ILL_ILLTRP: CInt = 33
public const val ILL_PRVOPC: CInt = 34
public const val ILL_PRVREG: CInt = 35
public const val ILL_COPROC: CInt = 36
public const val ILL_BADSTK: CInt = 37
public const val ILL_TMBADTHING: CInt = 38
public const val POLL_IN: CInt = 40
public const val POLL_OUT: CInt = 41
public const val POLL_MSG: CInt = -3
public const val POLL_ERR: CInt = 43
public const val POLL_PRI: CInt = 44
public const val POLL_HUP: CInt = 45
public const val SEGV_MAPERR: CInt = 50
public const val SEGV_ACCERR: CInt = 51
public const val SEGV_KEYERR: CInt = 52
public const val TRAP_BRKPT: CInt = 60
public const val TRAP_TRACE: CInt = 61
public const val SI_QUEUE: CInt = 71
public const val SI_TIMER: CInt = 72
public const val SI_ASYNCIO: CInt = 73
public const val SI_MESGQ: CInt = 74
public const val AF_UNSPEC: CInt = 0
public const val AF_UNIX: CInt = 1
public const val AF_INET: CInt = 2
public const val AF_IMPLINK: CInt = 3
public const val AF_PUP: CInt = 4
public const val AF_CHAOS: CInt = 5
public const val AF_NS: CInt = 6
public const val AF_ECMA: CInt = 8
public const val AF_DATAKIT: CInt = 9
public const val AF_CCITT: CInt = 10
public const val AF_SNA: CInt = 11
public const val AF_DECnet: CInt = 12
public const val AF_DLI: CInt = 13
public const val AF_LAT: CInt = 14
public const val SO_TIMESTAMPNS: CInt = 0x100a
public const val SOMAXCONN: CInt = 1024
public const val AF_LOCAL: CInt = AF_UNIX
public const val UIO_MAXIOV: CInt = 1024
public const val pseudo_AF_XTP: CInt = 19
public const val AF_HYLINK: CInt = 15
public const val AF_APPLETALK: CInt = 16
public const val AF_ISO: CInt = 7
public const val AF_OSI: CInt = AF_ISO
public const val AF_ROUTE: CInt = 17
public const val AF_LINK: CInt = 18
public const val AF_INET6: CInt = 24
public const val AF_INTF: CInt = 20
public const val AF_RIF: CInt = 21
public const val AF_NDD: CInt = 23
public const val AF_MAX: CInt = 30
public const val PF_UNSPEC: CInt = AF_UNSPEC
public const val PF_UNIX: CInt = AF_UNIX
public const val PF_INET: CInt = AF_INET
public const val PF_IMPLINK: CInt = AF_IMPLINK
public const val PF_PUP: CInt = AF_PUP
public const val PF_CHAOS: CInt = AF_CHAOS
public const val PF_NS: CInt = AF_NS
public const val PF_ISO: CInt = AF_ISO
public const val PF_OSI: CInt = AF_ISO
public const val PF_ECMA: CInt = AF_ECMA
public const val PF_DATAKIT: CInt = AF_DATAKIT
public const val PF_CCITT: CInt = AF_CCITT
public const val PF_SNA: CInt = AF_SNA
public const val PF_DECnet: CInt = AF_DECnet
public const val PF_DLI: CInt = AF_DLI
public const val PF_LAT: CInt = AF_LAT
public const val PF_HYLINK: CInt = AF_HYLINK
public const val PF_APPLETALK: CInt = AF_APPLETALK
public const val PF_ROUTE: CInt = AF_ROUTE
public const val PF_LINK: CInt = AF_LINK
public const val PF_XTP: CInt = 19
public const val PF_RIF: CInt = AF_RIF
public const val PF_INTF: CInt = AF_INTF
public const val PF_NDD: CInt = AF_NDD
public const val PF_INET6: CInt = AF_INET6
public const val PF_MAX: CInt = AF_MAX
public const val SF_CLOSE: CInt = 1
public const val SF_REUSE: CInt = 2
public const val SF_DONT_CACHE: CInt = 4
public const val SF_SYNC_CACHE: CInt = 8
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_STREAM: CInt = 1
public const val SOCK_RAW: CInt = 3
public const val SOCK_RDM: CInt = 4
public const val SOCK_SEQPACKET: CInt = 5
public const val SOL_SOCKET: CInt = 0xffff
public const val SO_DEBUG: CInt = 0x0001
public const val SO_ACCEPTCONN: CInt = 0x0002
public const val SO_REUSEADDR: CInt = 0x0004
public const val SO_KEEPALIVE: CInt = 0x0008
public const val SO_DONTROUTE: CInt = 0x0010
public const val SO_BROADCAST: CInt = 0x0020
public const val SO_USELOOPBACK: CInt = 0x0040
public const val SO_LINGER: CInt = 0x0080
public const val SO_OOBINLINE: CInt = 0x0100
public const val SO_REUSEPORT: CInt = 0x0200
public const val SO_USE_IFBUFS: CInt = 0x0400
public const val SO_CKSUMRECV: CInt = 0x0800
public const val SO_NOREUSEADDR: CInt = 0x1000
public const val SO_KERNACCEPT: CInt = 0x2000
public const val SO_NOMULTIPATH: CInt = 0x4000
public const val SO_AUDIT: CInt = 0x8000
public const val SO_SNDBUF: CInt = 0x1001
public const val SO_RCVBUF: CInt = 0x1002
public const val SO_SNDLOWAT: CInt = 0x1003
public const val SO_RCVLOWAT: CInt = 0x1004
public const val SO_SNDTIMEO: CInt = 0x1005
public const val SO_RCVTIMEO: CInt = 0x1006
public const val SO_ERROR: CInt = 0x1007
public const val SO_TYPE: CInt = 0x1008
public const val SCM_RIGHTS: CInt = 0x01
public const val MSG_OOB: CInt = 0x1
public const val MSG_PEEK: CInt = 0x2
public const val MSG_DONTROUTE: CInt = 0x4
public const val MSG_EOR: CInt = 0x8
public const val MSG_TRUNC: CInt = 0x10
public const val MSG_CTRUNC: CInt = 0x20
public const val MSG_WAITALL: CInt = 0x40
public const val MSG_MPEG2: CInt = 0x80
public const val MSG_NOSIGNAL: CInt = 0x100
public const val MSG_WAITFORONE: CInt = 0x200
public const val MSG_ARGEXT: CInt = 0x400
public const val MSG_NONBLOCK: CInt = 0x4000
public const val MSG_COMPAT: CInt = 0x8000
public const val MSG_MAXIOVLEN: CInt = 16
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val UTIME_NOW: CInt = -2
public const val UTIME_OMIT: CInt = -3
public const val ST_RDONLY: CULong = 0x0001uL
public const val ST_NOSUID: CULong = 0x0040uL
public const val ST_NODEV: CULong = 0x0080uL
public const val I_NREAD: CInt = 0x20005301
public const val I_PUSH: CInt = 0x20005302
public const val I_POP: CInt = 0x20005303
public const val I_LOOK: CInt = 0x20005304
public const val I_FLUSH: CInt = 0x20005305
public const val I_SRDOPT: CInt = 0x20005306
public const val I_GRDOPT: CInt = 0x20005307
public const val I_STR: CInt = 0x20005308
public const val I_SETSIG: CInt = 0x20005309
public const val I_GETSIG: CInt = 0x2000530a
public const val I_FIND: CInt = 0x2000530b
public const val I_LINK: CInt = 0x2000530c
public const val I_UNLINK: CInt = 0x2000530d
public const val I_PEEK: CInt = 0x2000530f
public const val I_FDINSERT: CInt = 0x20005310
public const val I_SENDFD: CInt = 0x20005311
public const val I_RECVFD: CInt = 0x20005312
public const val I_SWROPT: CInt = 0x20005314
public const val I_GWROPT: CInt = 0x20005315
public const val I_LIST: CInt = 0x20005316
public const val I_PLINK: CInt = 0x2000531d
public const val I_PUNLINK: CInt = 0x2000531e
public const val I_FLUSHBAND: CInt = 0x20005313
public const val I_CKBAND: CInt = 0x20005318
public const val I_GETBAND: CInt = 0x20005319
public const val I_ATMARK: CInt = 0x20005317
public const val I_SETCLTIME: CInt = 0x2000531b
public const val I_GETCLTIME: CInt = 0x2000531c
public const val I_CANPUT: CInt = 0x2000531a
public val LOG_CRON: CInt = 9 shl 3
public val LOG_AUTHPRIV: CInt = 10 shl 3
public const val LOG_NFACILITIES: CInt = 24
public const val LOG_PERROR: CInt = 0x20
public const val SC_ARCH: CInt = 1
public const val SC_IMPL: CInt = 2
public const val SC_VERS: CInt = 3
public const val SC_WIDTH: CInt = 4
public const val SC_NCPUS: CInt = 5
public const val SC_L1C_ATTR: CInt = 6
public const val SC_L1C_ISZ: CInt = 7
public const val SC_L1C_DSZ: CInt = 8
public const val SC_L1C_ICA: CInt = 9
public const val SC_L1C_DCA: CInt = 10
public const val SC_L1C_IBS: CInt = 11
public const val SC_L1C_DBS: CInt = 12
public const val SC_L1C_ILS: CInt = 13
public const val SC_L1C_DLS: CInt = 14
public const val SC_L2C_SZ: CInt = 15
public const val SC_L2C_AS: CInt = 16
public const val SC_TLB_ATTR: CInt = 17
public const val SC_ITLB_SZ: CInt = 18
public const val SC_DTLB_SZ: CInt = 19
public const val SC_ITLB_ATT: CInt = 20
public const val SC_DTLB_ATT: CInt = 21
public const val SC_RESRV_SZ: CInt = 22
public const val SC_PRI_LC: CInt = 23
public const val SC_PRO_LC: CInt = 24
public const val SC_RTC_TYPE: CInt = 25
public const val SC_VIRT_AL: CInt = 26
public const val SC_CAC_CONG: CInt = 27
public const val SC_MOD_ARCH: CInt = 28
public const val SC_MOD_IMPL: CInt = 29
public const val SC_XINT: CInt = 30
public const val SC_XFRAC: CInt = 31
public const val SC_KRN_ATTR: CInt = 32
public const val SC_PHYSMEM: CInt = 33
public const val SC_SLB_ATTR: CInt = 34
public const val SC_SLB_SZ: CInt = 35
public const val SC_MAX_NCPUS: CInt = 37
public const val SC_MAX_REALADDR: CInt = 38
public const val SC_ORIG_ENT_CAP: CInt = 39
public const val SC_ENT_CAP: CInt = 40
public const val SC_DISP_WHE: CInt = 41
public const val SC_CAPINC: CInt = 42
public const val SC_VCAPW: CInt = 43
public const val SC_SPLP_STAT: CInt = 44
public const val SC_SMT_STAT: CInt = 45
public const val SC_SMT_TC: CInt = 46
public const val SC_VMX_VER: CInt = 47
public const val SC_LMB_SZ: CInt = 48
public const val SC_MAX_XCPU: CInt = 49
public const val SC_EC_LVL: CInt = 50
public const val SC_AME_STAT: CInt = 51
public const val SC_ECO_STAT: CInt = 52
public const val SC_DFP_VER: CInt = 53
public const val SC_VRM_STAT: CInt = 54
public const val SC_PHYS_IMP: CInt = 55
public const val SC_PHYS_VER: CInt = 56
public const val SC_SPCM_STATUS: CInt = 57
public const val SC_SPCM_MAX: CInt = 58
public const val SC_TM_VER: CInt = 59
public const val SC_NX_CAP: CInt = 60
public const val SC_PKS_STATE: CInt = 61
public const val SC_MMA_VER: CInt = 62
public const val POWER_RS: CInt = 1
public const val POWER_PC: CInt = 2
public const val IA64: CInt = 3
public const val POWER_RS1: CInt = 0x1
public const val POWER_RSC: CInt = 0x2
public const val POWER_RS2: CInt = 0x4
public const val POWER_601: CInt = 0x8
public const val POWER_604: CInt = 0x10
public const val POWER_603: CInt = 0x20
public const val POWER_620: CInt = 0x40
public const val POWER_630: CInt = 0x80
public const val POWER_A35: CInt = 0x100
public const val POWER_RS64II: CInt = 0x200
public const val POWER_RS64III: CInt = 0x400
public const val POWER_4: CInt = 0x800
public const val POWER_RS64IV: CInt = POWER_4
public const val POWER_MPC7450: CInt = 0x1000
public const val POWER_5: CInt = 0x2000
public const val POWER_6: CInt = 0x4000
public const val POWER_7: CInt = 0x8000
public const val POWER_8: CInt = 0x10000
public const val POWER_9: CInt = 0x20000
public const val FD_SETSIZE: ULong = 65534uL
public const val TIMEOFDAY: CInt = 9
public val CLOCK_REALTIME: ClockidT = TIMEOFDAY.toClockidT()
public const val CLOCK_MONOTONIC: ClockidT = 10
public const val TIMER_ABSTIME: CInt = 999
public const val ITIMER_REAL: CInt = 0
public const val ITIMER_VIRTUAL: CInt = 1
public const val ITIMER_PROF: CInt = 2
public const val ITIMER_VIRT: CInt = 3
public const val ITIMER_REAL1: CInt = 20
public const val ITIMER_REAL_TH: CInt = ITIMER_REAL1
public const val DST_AUST: CInt = 2
public const val DST_CAN: CInt = 6
public const val DST_EET: CInt = 5
public const val DST_MET: CInt = 4
public const val DST_NONE: CInt = 0
public const val DST_USA: CInt = 1
public const val DST_WET: CInt = 3
public const val CSTART: TcflagT = 17u
public const val CSTOP: TcflagT = 19u
public val TCGETA: CInt = TIOC or 5
public val TCSETA: CInt = TIOC or 6
public val TCSETAW: CInt = TIOC or 7
public val TCSETAF: CInt = TIOC or 8
public val TCSBRK: CInt = TIOC or 9
public val TCXONC: CInt = TIOC or 11
public val TCFLSH: CInt = TIOC or 12
public val TCGETS: CInt = TIOC or 1
public val TCSETS: CInt = TIOC or 2
public const val TCSANOW: CInt = 0
public val TCSETSW: CInt = TIOC or 3
public const val TCSADRAIN: CInt = 1
public val TCSETSF: CInt = TIOC or 4
public const val TCSAFLUSH: CInt = 2
public const val TCIFLUSH: CInt = 0
public const val TCOFLUSH: CInt = 1
public const val TCIOFLUSH: CInt = 2
public const val TCOOFF: CInt = 0
public const val TCOON: CInt = 1
public const val TCIOFF: CInt = 2
public const val TCION: CInt = 3
public const val TIOC: CInt = 0x5400
public const val TIOCGWINSZ: CInt = 0x40087468
public const val TIOCSWINSZ: CInt = 0x80087467
public const val TIOCLBIS: CInt = 0x8004747f
public const val TIOCLBIC: CInt = 0x8004747e
public const val TIOCLSET: CInt = 0x8004747d
public const val TIOCLGET: CInt = 0x4004747c
public const val TIOCSBRK: CInt = 0x2000747b
public const val TIOCCBRK: CInt = 0x2000747a
public const val TIOCSDTR: CInt = 0x20007479
public const val TIOCCDTR: CInt = 0x20007478
public const val TIOCSLTC: CInt = 0x80067475
public const val TIOCGLTC: CInt = 0x40067474
public const val TIOCOUTQ: CInt = 0x40047473
public const val TIOCNOTTY: CInt = 0x20007471
public const val TIOCSTOP: CInt = 0x2000746f
public const val TIOCSTART: CInt = 0x2000746e
public const val TIOCGPGRP: CInt = 0x40047477
public const val TIOCSPGRP: CInt = 0x80047476
public const val TIOCGSID: CInt = 0x40047448
public const val TIOCSTI: CInt = 0x80017472
public const val TIOCMSET: CInt = 0x8004746d
public const val TIOCMBIS: CInt = 0x8004746c
public const val TIOCMBIC: CInt = 0x8004746b
public const val TIOCMGET: CInt = 0x4004746a
public const val TIOCREMOTE: CInt = 0x80047469
public const val MAXCOMLEN: CInt = 32
public const val UF_SYSTEM: CInt = 0x1000
public const val AT_FLAGS: CInt = 0x80
public const val AT_GID: CInt = 8
public const val AT_UID: CInt = 4
public const val P_ALL: IdtypeT = 0u
public const val P_PID: IdtypeT = 1u
public const val P_PGID: IdtypeT = 2u
public const val WNOHANG: CInt = 0x1
public const val WUNTRACED: CInt = 0x2
public const val WEXITED: CInt = 0x04
public const val WCONTINUED: CInt = 0x01000000
public const val WNOWAIT: CInt = 0x10
public const val WSTOPPED: CInt = _W_STOPPED
public const val _W_STOPPED: CInt = 0x00000040
public const val _W_SLWTED: CInt = 0x0000007c
public const val _W_SEWTED: CInt = 0x0000007d
public const val _W_SFWTED: CInt = 0x0000007e
public const val _W_STRC: CInt = 0x0000007f
public const val NCCS: ULong = 16uL
public const val OLCUC: TcflagT = 2u
public const val CSIZE: TcflagT = 0x00000030u
public const val CS5: TcflagT = 0x00000000u
public const val CS6: TcflagT = 0x00000010u
public const val CS7: TcflagT = 0x00000020u
public const val CS8: TcflagT = 0x00000030u
public const val CSTOPB: TcflagT = 0x00000040u
public const val ECHO: TcflagT = 0x00000008u
public const val ECHOE: TcflagT = 0x00000010u
public const val ECHOK: TcflagT = 0x00000020u
public const val ECHONL: TcflagT = 0x00000040u
public const val ECHOCTL: TcflagT = 0x00020000u
public const val ECHOPRT: TcflagT = 0x00040000u
public const val ECHOKE: TcflagT = 0x00080000u
public const val IGNBRK: TcflagT = 0x00000001u
public const val BRKINT: TcflagT = 0x00000002u
public const val IGNPAR: TcflagT = 0x00000004u
public const val PARMRK: TcflagT = 0x00000008u
public const val INPCK: TcflagT = 0x00000010u
public const val ISTRIP: TcflagT = 0x00000020u
public const val INLCR: TcflagT = 0x00000040u
public const val IGNCR: TcflagT = 0x00000080u
public const val ICRNL: TcflagT = 0x00000100u
public const val IXON: TcflagT = 0x00000200u
public const val IXOFF: TcflagT = 0x00000400u
public const val IXANY: TcflagT = 0x00001000u
public const val IMAXBEL: TcflagT = 0x00010000u
public const val OPOST: TcflagT = 0x00000001u
public const val ONLCR: TcflagT = 0x00000004u
public const val OCRNL: TcflagT = 0x00000008u
public const val ONOCR: TcflagT = 0x00000010u
public const val ONLRET: TcflagT = 0x00000020u
public const val CREAD: TcflagT = 0x00000080u
public const val IEXTEN: TcflagT = 0x00200000u
public const val TOSTOP: TcflagT = 0x00010000u
public const val FLUSHO: TcflagT = 0x00100000u
public const val PENDIN: TcflagT = 0x20000000u
public const val NOFLSH: TcflagT = 0x00000080u
public const val VINTR: ULong = 0uL
public const val VQUIT: ULong = 1uL
public const val VERASE: ULong = 2uL
public const val VKILL: ULong = 3uL
public const val VEOF: ULong = 4uL
public const val VEOL: ULong = 5uL
public const val VSTART: ULong = 7uL
public const val VSTOP: ULong = 8uL
public const val VSUSP: ULong = 9uL
public const val VMIN: ULong = 4uL
public const val VTIME: ULong = 5uL
public const val VEOL2: ULong = 6uL
public const val VDSUSP: ULong = 10uL
public const val VREPRINT: ULong = 11uL
public const val VDISCRD: ULong = 12uL
public const val VWERSE: ULong = 13uL
public const val VLNEXT: ULong = 14uL
public const val B0: SpeedT = 0x0u
public const val B50: SpeedT = 0x1u
public const val B75: SpeedT = 0x2u
public const val B110: SpeedT = 0x3u
public const val B134: SpeedT = 0x4u
public const val B150: SpeedT = 0x5u
public const val B200: SpeedT = 0x6u
public const val B300: SpeedT = 0x7u
public const val B600: SpeedT = 0x8u
public const val B1200: SpeedT = 0x9u
public const val B1800: SpeedT = 0xau
public const val B2400: SpeedT = 0xbu
public const val B4800: SpeedT = 0xcu
public const val B9600: SpeedT = 0xdu
public const val B19200: SpeedT = 0xeu
public const val B38400: SpeedT = 0xfu
public const val EXTA: SpeedT = B19200
public const val EXTB: SpeedT = B38400
public const val IUCLC: TcflagT = 0x00000800u
public const val OFILL: TcflagT = 0x00000040u
public const val OFDEL: TcflagT = 0x00000080u
public const val CRDLY: TcflagT = 0x00000300u
public const val CR0: TcflagT = 0x00000000u
public const val CR1: TcflagT = 0x00000100u
public const val CR2: TcflagT = 0x00000200u
public const val CR3: TcflagT = 0x00000300u
public const val TABDLY: TcflagT = 0x00000c00u
public const val TAB0: TcflagT = 0x00000000u
public const val TAB1: TcflagT = 0x00000400u
public const val TAB2: TcflagT = 0x00000800u
public const val TAB3: TcflagT = 0x00000c00u
public const val BSDLY: TcflagT = 0x00001000u
public const val BS0: TcflagT = 0x00000000u
public const val BS1: TcflagT = 0x00001000u
public const val FFDLY: TcflagT = 0x00002000u
public const val FF0: TcflagT = 0x00000000u
public const val FF1: TcflagT = 0x00002000u
public const val NLDLY: TcflagT = 0x00004000u
public const val NL0: TcflagT = 0x00000000u
public const val NL1: TcflagT = 0x00004000u
public const val VTDLY: TcflagT = 0x00008000u
public const val VT0: TcflagT = 0x00000000u
public const val VT1: TcflagT = 0x00008000u
public const val OXTABS: TcflagT = 0x00040000u
public const val ONOEOT: TcflagT = 0x00080000u
public const val CBAUD: TcflagT = 0x0000000fu
public const val PARENB: TcflagT = 0x00000100u
public const val PARODD: TcflagT = 0x00000200u
public const val HUPCL: TcflagT = 0x00000400u
public const val CLOCAL: TcflagT = 0x00000800u
public const val CIBAUD: TcflagT = 0x000f0000u
public const val IBSHIFT: TcflagT = 16u
public const val PAREXT: TcflagT = 0x00100000u
public const val ISIG: TcflagT = 0x00000001u
public const val ICANON: TcflagT = 0x00000002u
public const val XCASE: TcflagT = 0x00000004u
public const val ALTWERASE: TcflagT = 0x00400000u
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 11
public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 12
public const val _POSIX_VDISABLE: CInt = 0xff
public const val _PC_LINK_MAX: CInt = 11
public const val _PC_MAX_CANON: CInt = 12
public const val _PC_MAX_INPUT: CInt = 13
public const val _PC_NAME_MAX: CInt = 14
public const val _PC_PATH_MAX: CInt = 16
public const val _PC_PIPE_BUF: CInt = 17
public const val _PC_NO_TRUNC: CInt = 15
public const val _PC_VDISABLE: CInt = 18
public const val _PC_CHOWN_RESTRICTED: CInt = 10
public const val _PC_ASYNC_IO: CInt = 19
public const val _PC_PRIO_IO: CInt = 21
public const val _PC_SYNC_IO: CInt = 20
public const val _PC_ALLOC_SIZE_MIN: CInt = 26
public const val _PC_REC_INCR_XFER_SIZE: CInt = 27
public const val _PC_REC_MAX_XFER_SIZE: CInt = 28
public const val _PC_REC_MIN_XFER_SIZE: CInt = 29
public const val _PC_REC_XFER_ALIGN: CInt = 30
public const val _PC_SYMLINK_MAX: CInt = 25
public const val _PC_2_SYMLINKS: CInt = 31
public const val _PC_TIMESTAMP_RESOLUTION: CInt = 32
public const val _PC_FILESIZEBITS: CInt = 22
public const val _SC_ARG_MAX: CInt = 0
public const val _SC_CHILD_MAX: CInt = 1
public const val _SC_CLK_TCK: CInt = 2
public const val _SC_NGROUPS_MAX: CInt = 3
public const val _SC_OPEN_MAX: CInt = 4
public const val _SC_JOB_CONTROL: CInt = 7
public const val _SC_SAVED_IDS: CInt = 8
public const val _SC_VERSION: CInt = 9
public const val _SC_PASS_MAX: CInt = 45
public const val _SC_PAGESIZE: CInt = _SC_PAGE_SIZE
public const val _SC_PAGE_SIZE: CInt = 48
public const val _SC_XOPEN_VERSION: CInt = 46
public const val _SC_NPROCESSORS_CONF: CInt = 71
public const val _SC_NPROCESSORS_ONLN: CInt = 72
public const val _SC_STREAM_MAX: CInt = 5
public const val _SC_TZNAME_MAX: CInt = 6
public const val _SC_AIO_LISTIO_MAX: CInt = 75
public const val _SC_AIO_MAX: CInt = 76
public const val _SC_AIO_PRIO_DELTA_MAX: CInt = 77
public const val _SC_ASYNCHRONOUS_IO: CInt = 78
public const val _SC_DELAYTIMER_MAX: CInt = 79
public const val _SC_FSYNC: CInt = 80
public const val _SC_MAPPED_FILES: CInt = 84
public const val _SC_MEMLOCK: CInt = 85
public const val _SC_MEMLOCK_RANGE: CInt = 86
public const val _SC_MEMORY_PROTECTION: CInt = 87
public const val _SC_MESSAGE_PASSING: CInt = 88
public const val _SC_MQ_OPEN_MAX: CInt = 89
public const val _SC_MQ_PRIO_MAX: CInt = 90
public const val _SC_PRIORITIZED_IO: CInt = 91
public const val _SC_PRIORITY_SCHEDULING: CInt = 92
public const val _SC_REALTIME_SIGNALS: CInt = 93
public const val _SC_RTSIG_MAX: CInt = 94
public const val _SC_SEMAPHORES: CInt = 95
public const val _SC_SEM_NSEMS_MAX: CInt = 96
public const val _SC_SEM_VALUE_MAX: CInt = 97
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 98
public const val _SC_SIGQUEUE_MAX: CInt = 99
public const val _SC_SYNCHRONIZED_IO: CInt = 100
public const val _SC_TIMERS: CInt = 102
public const val _SC_TIMER_MAX: CInt = 103
public const val _SC_2_C_BIND: CInt = 51
public const val _SC_2_C_DEV: CInt = 32
public const val _SC_2_C_VERSION: CInt = 52
public const val _SC_2_FORT_DEV: CInt = 33
public const val _SC_2_FORT_RUN: CInt = 34
public const val _SC_2_LOCALEDEF: CInt = 35
public const val _SC_2_SW_DEV: CInt = 36
public const val _SC_2_UPE: CInt = 53
public const val _SC_2_VERSION: CInt = 31
public const val _SC_BC_BASE_MAX: CInt = 23
public const val _SC_BC_DIM_MAX: CInt = 24
public const val _SC_BC_SCALE_MAX: CInt = 25
public const val _SC_BC_STRING_MAX: CInt = 26
public const val _SC_COLL_WEIGHTS_MAX: CInt = 50
public const val _SC_EXPR_NEST_MAX: CInt = 28
public const val _SC_LINE_MAX: CInt = 29
public const val _SC_RE_DUP_MAX: CInt = 30
public const val _SC_XOPEN_CRYPT: CInt = 56
public const val _SC_XOPEN_ENH_I18N: CInt = 57
public const val _SC_XOPEN_SHM: CInt = 55
public const val _SC_2_CHAR_TERM: CInt = 54
public const val _SC_XOPEN_XCU_VERSION: CInt = 109
public const val _SC_ATEXIT_MAX: CInt = 47
public const val _SC_IOV_MAX: CInt = 58
public const val _SC_XOPEN_UNIX: CInt = 73
public const val _SC_T_IOV_MAX: CInt = 0
public const val _SC_PHYS_PAGES: CInt = 113
public const val _SC_AVPHYS_PAGES: CInt = 114
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 101
public const val _SC_GETGR_R_SIZE_MAX: CInt = 81
public const val _SC_GETPW_R_SIZE_MAX: CInt = 82
public const val _SC_LOGIN_NAME_MAX: CInt = 83
public const val _SC_THREAD_KEYS_MAX: CInt = 68
public const val _SC_THREAD_STACK_MIN: CInt = 69
public const val _SC_THREAD_THREADS_MAX: CInt = 70
public const val _SC_TTY_NAME_MAX: CInt = 104
public const val _SC_THREADS: CInt = 60
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 61
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 62
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 64
public const val _SC_THREAD_PRIO_INHERIT: CInt = 65
public const val _SC_THREAD_PRIO_PROTECT: CInt = 66
public const val _SC_THREAD_PROCESS_SHARED: CInt = 67
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 59
public const val _SC_XOPEN_LEGACY: CInt = 112
public const val _SC_XOPEN_REALTIME: CInt = 110
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 111
public const val _SC_XBS5_ILP32_OFF32: CInt = 105
public const val _SC_XBS5_ILP32_OFFBIG: CInt = 106
public const val _SC_XBS5_LP64_OFF64: CInt = 107
public const val _SC_XBS5_LPBIG_OFFBIG: CInt = 108
public const val _SC_2_PBS: CInt = 132
public const val _SC_2_PBS_ACCOUNTING: CInt = 133
public const val _SC_2_PBS_CHECKPOINT: CInt = 134
public const val _SC_2_PBS_LOCATE: CInt = 135
public const val _SC_2_PBS_MESSAGE: CInt = 136
public const val _SC_2_PBS_TRACK: CInt = 137
public const val _SC_ADVISORY_INFO: CInt = 130
public const val _SC_BARRIERS: CInt = 138
public const val _SC_CLOCK_SELECTION: CInt = 139
public const val _SC_CPUTIME: CInt = 140
public const val _SC_HOST_NAME_MAX: CInt = 126
public const val _SC_MONOTONIC_CLOCK: CInt = 141
public const val _SC_READER_WRITER_LOCKS: CInt = 142
public const val _SC_REGEXP: CInt = 127
public const val _SC_SHELL: CInt = 128
public const val _SC_SPAWN: CInt = 143
public const val _SC_SPIN_LOCKS: CInt = 144
public const val _SC_SPORADIC_SERVER: CInt = 145
public const val _SC_SS_REPL_MAX: CInt = 156
public const val _SC_SYMLOOP_MAX: CInt = 129
public const val _SC_THREAD_CPUTIME: CInt = 146
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 147
public const val _SC_TIMEOUTS: CInt = 148
public const val _SC_TRACE: CInt = 149
public const val _SC_TRACE_EVENT_FILTER: CInt = 150
public const val _SC_TRACE_EVENT_NAME_MAX: CInt = 157
public const val _SC_TRACE_INHERIT: CInt = 151
public const val _SC_TRACE_LOG: CInt = 152
public const val _SC_TRACE_NAME_MAX: CInt = 158
public const val _SC_TRACE_SYS_MAX: CInt = 159
public const val _SC_TRACE_USER_EVENT_MAX: CInt = 160
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 153
public const val _SC_V6_ILP32_OFF32: CInt = 121
public const val _SC_V6_ILP32_OFFBIG: CInt = 122
public const val _SC_V6_LP64_OFF64: CInt = 123
public const val _SC_V6_LPBIG_OFFBIG: CInt = 124
public const val _SC_XOPEN_STREAMS: CInt = 125
public const val _SC_IPV6: CInt = 154
public const val _SC_RAW_SOCKETS: CInt = 155
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

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr?

public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?

public expect fun fDZERO(set: FdSet?)

public expect fun fDSET(fd: CInt, set: FdSet?)

public expect fun fDCLR(fd: CInt, set: FdSet?)

public expect fun fDISSET(fd: CInt, set: FdSet?): Boolean

public expect fun thrKill(id: ThreadT, sig: CInt): CInt

public expect fun thrSelf(): ThreadT

public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt

public expect fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt

public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt

public expect fun pthreadAttrGetinheritsched(attr: PthreadAttrT?, inheritsched: CInt?): CInt

public expect fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt

public expect fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt

public expect fun pthreadAttrGetschedpolicy(attr: PthreadAttrT?, policy: CInt?): CInt

public expect fun pthreadAttrGetscope(attr: PthreadAttrT?, contentionscope: CInt?): CInt

public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt

public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt

public expect fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: CInt): CInt

public expect fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt

public expect fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt

public expect fun pthreadAttrSetscope(attr: PthreadAttrT?, contentionscope: CInt): CInt

public expect fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): CInt

public expect fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt

public expect fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt

public expect fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, pshared: CInt?): CInt

public expect fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt

public expect fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, pshared: CInt): CInt

public expect fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt

public expect fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUInt): CInt

public expect fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadCleanupPop(execute: CInt): COpaquePointer?

public expect fun pthreadCleanupPush(routine: ((COpaquePointer?) -> Unit)?, arg: COpaquePointer?): COpaquePointer?

public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt

public expect fun pthreadCondattrGetpshared(attr: PthreadCondattrT?, pshared: CInt?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: PthreadCondattrT?, pshared: CInt): CInt

public expect fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): CInt

public expect fun pthreadGetconcurrency(): CInt

public expect fun pthreadGetcpuclockid(threadId: PthreadT, clockId: ClockidT?): CInt

public expect fun pthreadGetschedparam(thread: PthreadT, policy: CInt?, param: SchedParam?): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun pthreadMutexattrGetprioceiling(attr: PthreadMutexattrT?, prioceiling: CInt?): CInt

public expect fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT?, protocol: CInt?): CInt

public expect fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt

public expect fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robust: CInt?): CInt

public expect fun pthreadMutexattrGettype(attr: PthreadMutexattrT?, type: CInt?): CInt

public expect fun pthreadMutexattrSetprioceiling(attr: PthreadMutexattrT?, prioceiling: CInt): CInt

public expect fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT?, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt

public expect fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robust: CInt): CInt

public expect fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt

public expect fun pthreadMutexGetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt?): CInt

public expect fun pthreadMutexSetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt, oldCeiling: CInt?): CInt

public expect fun pthreadMutexTimedlock(mutex: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: (() -> Unit)?): CInt

public expect fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, pshared: CInt?): CInt

public expect fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, pshared: CInt): CInt

public expect fun pthreadRwlockTimedrdlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt

public expect fun pthreadRwlockTimedwrlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt

public expect fun pthreadSetcancelstate(state: CInt, oldstate: CInt?): CInt

public expect fun pthreadSetcanceltype(type: CInt, oldtype: CInt?): CInt

public expect fun pthreadSetconcurrency(newLevel: CInt): CInt

public expect fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: SchedParam?): CInt

public expect fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt

public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oset: SigsetT?): CInt

public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadTestcancel(): COpaquePointer?

public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong

public expect fun iconvClose(cd: IconvT): CInt

public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT

public expect fun acct(filename: String?): CInt

public expect fun aioCancel(fildes: CInt, aiocbp: Aiocb?): CInt

public expect fun aioError(aiocbp: Aiocb?): CInt

public expect fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt

public expect fun aioRead(aiocbp: Aiocb?): CInt

public expect fun aioReturn(aiocbp: Aiocb?): SsizeT

public expect fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt

public expect fun aioWrite(aiocbp: Aiocb?): CInt

public expect fun basename(path: String?): String?

public expect fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun clearenv(): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt

public expect fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt

public expect fun creat64(path: String?, mode: ModeT): CInt

public expect fun ctermid(s: String?): String?

public expect fun dirfd(dirp: DIR?): CInt

public expect fun dirname(path: String?): String?

public expect fun drand48(): CDouble

public expect fun duplocale(arg1: LocaleT): LocaleT

public expect fun endgrent()

public expect fun endmntent(streamp: FILE?): CInt

public expect fun endpwent()

public expect fun endutent()

public expect fun endutxent()

public expect fun erand48(xseed: CUShort?): CDouble

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun fattach(fildes: CInt, path: String?): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLongLong): CInt

public expect fun fgetgrent(file: FILE?): Group?

public expect fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt

public expect fun fgetpwent(file: FILE?): Passwd?

public expect fun fopen64(filename: String?, mode: String?): FILE?

public expect fun freelocale(loc: LocaleT)

public expect fun freopen64(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt

public expect fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt

public expect fun fstat64(fildes: CInt, buf: Stat64?): CInt

public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt

public expect fun fstatfs64(fd: CInt, buf: Statfs64?): CInt

public expect fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt

public expect fun ftello64(stream: FILE?): Off64T

public expect fun ftok(path: String?, id: CInt): KeyT

public expect fun ftruncate64(fd: CInt, length: Off64T): CInt

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun getcontext(ucp: UcontextT?): CInt

public expect fun getdomainname(name: String?, len: CInt): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrent(): Group?

public expect fun getgrgid(gid: GidT): Group?

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getgrnam(name: String?): Group?

public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getgrset(user: String?): String?

public expect fun gethostid(): CLong

public expect fun getmntent(stream: FILE?): Mntent?

public expect fun getnameinfo(sa: Sockaddr?, salen: ULong, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: CInt): CInt

public expect fun getpagesize(): CInt

public expect fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun getpwent(): Passwd?

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun getitimer(which: CInt, currValue: Itimerval?): CInt

public expect fun getutent(): Utmp?

public expect fun getutid(u: Utmp?): Utmp?

public expect fun getutline(u: Utmp?): Utmp?

public expect fun getutxent(): Utmpx?

public expect fun getutxid(ut: Utmpx?): Utmpx?

public expect fun getutxline(ut: Utmpx?): Utmpx?

public expect fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt

public expect fun globfree(pglob: GlobT?)

public expect fun hasmntopt(mnt: Mntent?, opt: String?): String?

public expect fun hcreate(nelt: ULong): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: Entry, action: ACTION): Entry?

public expect fun ifFreenameindex(ptr: IfNameindex?)

public expect fun ifNameindex(): IfNameindex?

public expect fun initgroups(name: String?, basegid: GidT): CInt

public expect fun ioctl(fildes: CInt, request: CInt, vararg args: Any?): CInt

public expect fun jrand48(xseed: CUShort?): CLong

public expect fun lcong48(p: CUShort?)

public expect fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer?

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nent: CInt, sevp: Sigevent?): CInt

public expect fun loadquery(flags: CInt, buf: COpaquePointer?, buflen: CUInt, vararg args: Any?): CInt

public expect fun lparGetInfo(command: CInt, buf: COpaquePointer?, bufsize: ULong): CInt

public expect fun lparSetResources(id: CInt, resource: COpaquePointer?): CInt

public expect fun lrand48(): CLong

public expect fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer?

public expect fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T

public expect fun lstat64(path: String?, buf: Stat64?): CInt

public expect fun madvise(addr: CaddrT, len: ULong, advice: CInt): CInt

public expect fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: CInt, vararg args: Any?)

public expect fun mallinfo(): Mallinfo

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer?

public expect fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt

public expect fun mincore(addr: CaddrT, len: ULong, vec: String?): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun mount(device: String?, path: String?, flags: CInt): CInt

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt

public expect fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT

public expect fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT

public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mrand48(): CLong

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun nlLanginfo(item: NlItem): String?

public expect fun nlLanginfoL(item: NlItem, loc: LocaleT): String?

public expect fun nrand48(xseed: CUShort?): CLong

public expect fun open64(path: String?, oflag: CInt, vararg args: Any?): CInt

public expect fun pollsetCreate(maxfd: CInt): PollsetT

public expect fun pollsetCtl(ps: PollsetT, pollctlArray: PollCtl?, arrayLength: CInt): CInt

public expect fun pollsetDestroy(ps: PollsetT): CInt

public expect fun pollsetPoll(ps: PollsetT, polldataArray: Pollfd?, arrayLength: CInt, timeout: CInt): CInt

public expect fun pollsetQuery(ps: PollsetT, pollfdQuery: Pollfd?): CInt

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt

public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt

public expect fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt

public expect fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt

public expect fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt

public expect fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt

public expect fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt

public expect fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt

public expect fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt

public expect fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun pread64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT

public expect fun ptrace64(request: CInt, id: CLongLong, addr: CLongLong, data: CInt, buff: CInt?): CInt

public expect fun pututline(u: Utmp?): Utmp?

public expect fun pututxline(ut: Utmpx?): Utmpx?

public expect fun pwrite64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT

public expect fun quotactl(cmd: String?, special: CInt, id: CInt, data: CaddrT): CInt

public expect fun rand(): CInt

public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT

public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt

public expect fun recvmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong

public expect fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt

public expect fun regfree(preg: RegexT?)

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun schedGetparam(pid: PidT, param: SchedParam?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt

public expect fun schedSetparam(pid: PidT, param: SchedParam?): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt

public expect fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: COpaquePointer?, size: ULong?): CInt

public expect fun sctpPeeloff(s: CInt, id: CUInt?): CInt

public expect fun seed48(xseed: CUShort?): CUShort?

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun semClose(sem: SemT?): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT?

public expect fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt

public expect fun sendFile(socket: CInt?, iobuf: SfParms?, flags: CUInt): SsizeT

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt

public expect fun sendmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun setcontext(ucp: UcontextT?): CInt

public expect fun setdomainname(name: String?, len: CInt): CInt

public expect fun setgroups(ngroups: CInt, ptr: GidT?): CInt

public expect fun setgrent()

public expect fun sethostid(hostid: CInt): CInt

public expect fun sethostname(name: String?, len: CInt): CInt

public expect fun setmntent(filename: String?, ty: String?): FILE?

public expect fun setpriority(which: CInt, who: IdT, priority: CInt): CInt

public expect fun setpwent()

public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt

public expect fun settimeofday(tv: Timeval?, tz: Timezone?): CInt

public expect fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt

public expect fun setutent()

public expect fun setutxent()

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun sigsuspend(mask: SigsetT?): CInt

public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt

public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt

public expect fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt

public expect fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt

public expect fun srand(seed: CUInt)

public expect fun srand48(seed: CLong)

public expect fun stat64(path: String?, buf: Stat64?): CInt

public expect fun stat64at(dirfd: CInt, path: String?, buf: Stat64?, flags: CInt): CInt

public expect fun statfs(path: String?, buf: Statfs?): CInt

public expect fun statfs64(path: String?, buf: Statfs64?): CInt

public expect fun statvfs64(path: String?, buf: Statvfs64?): CInt

public expect fun statx(path: String?, buf: Stat?, length: CInt, command: CInt): CInt

public expect fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt

public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt

public expect fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong

public expect fun strncasecmpL(string1: String?, string2: String?, length: ULong, locale: LocaleT): CInt

public expect fun strptime(s: String?, format: String?, tm: Tm?): String?

public expect fun strsep(string: COpaquePointer?, delim: String?): String?

public expect fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt

public expect fun swapoff(path: String?): CInt

public expect fun swapon(path: String?): CInt

public expect fun sync()

public expect fun telldir(dirp: DIR?): CLong

public expect fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt

public expect fun truncate64(path: String?, length: Off64T): CInt

public expect fun uname(buf: Utsname?): CInt

public expect fun updwtmp(file: String?, u: Utmp?)

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun utmpname(file: String?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt

public expect fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt

public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun errno(): CInt?
