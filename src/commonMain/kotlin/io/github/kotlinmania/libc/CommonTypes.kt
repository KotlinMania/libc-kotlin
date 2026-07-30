// port-lint: source types.rs
package io.github.kotlinmania.libc

/**
 * Common C type aliases shared across all platform modules.
 *
 * In the upstream Rust crate, each platform module (sgx.rs, switch.rs,
 * xous.rs, trusty.rs, etc.) defines these types with identical values.
 * The Rust `cfg_if!` chain selects exactly one platform module per target,
 * so there is never a duplicate at compile time. In the Kotlin port all
 * platform files reside in commonMain and are compiled together, so the
 * shared definitions are consolidated here to avoid redeclarations.
 *
 * Platform-specific sub-packages may declare their own typealias with the
 * same name to shadow the root declaration with a platform-specific width.
 */

// --- Fixed-width integer types (from unix/mod.rs) ---
public typealias IntmaxT = Long
public typealias UintmaxT = ULong
public typealias SizeT = ULong
public typealias PtrdiffT = Long
public typealias IntptrT = Long
public typealias UintptrT = ULong
public typealias SsizeT = Long
public typealias OffT = Long
public typealias WcharT = UInt

// --- C standard integer types (from primitives.rs) ---
public typealias CSchar = Byte
public typealias CUChar = UByte
public typealias CUchar = UByte
public typealias CShort = Short
public typealias CUShort = UShort
public typealias CUshort = UShort
public typealias CLonglong = Long
public typealias CUlonglong = ULong
public typealias CLongLong = Long
public typealias CULongLong = ULong
public typealias CFloat = Float
public typealias CDouble = Double
public typealias CChar = Byte
public typealias CInt = Int
public typealias CUInt = UInt
public typealias CUint = UInt
public typealias CLong = Long
public typealias CUlong = ULong
public typealias CULong = ULong
public typealias Int8T = Byte
public typealias Int16T = Short
public typealias Int32T = Int
public typealias Int64T = Long
public typealias Uint8T = UByte
public typealias Uint16T = UShort
public typealias Uint32T = UInt
public typealias Uint64T = ULong
public typealias Int128 = ByteArray
public typealias Uint128 = ByteArray
public typealias Int128T = ByteArray
public typealias Uint128T = ByteArray

// --- Unix common types (from unix/mod.rs) ---
public typealias PidT = Int
public typealias InAddrT = UInt
public typealias InPortT = UShort
public typealias SighandlerT = ULong
public typealias CcT = CUChar

// --- Linux-like common types (from unix/linux_like/mod.rs) ---
public typealias SaFamilyT = UShort
public typealias SpeedT = CUInt
public typealias TcflagT = CUInt
public typealias ClockidT = CInt
public typealias TimerT = COpaquePointer?
public typealias UsecondsT = UInt
public typealias KeyT = CInt
public typealias IdT = CUInt

// --- File system types (common across platforms) ---
public typealias DevT = ULong
public typealias InoT = ULong
public typealias Ino64T = ULong
public typealias Off64T = Long
public typealias BlkcntT = Long
public typealias BlksizeT = Long
public typealias NlinkT = ULong
public typealias FsblkcntT = ULong
public typealias FsfilcntT = ULong
public typealias FsidT = ULong

// --- Signal types ---
public typealias SigsetT = ULong

// --- Process/user types ---
public typealias UidT = UInt
public typealias GidT = UInt
public typealias ModeT = UInt

// --- Misc common types ---
public typealias NlItem = CInt
public typealias FswordT = Long
public typealias Ioctl = CInt
public typealias SocklenT = UInt
public typealias LocaleT = COpaquePointer?
public typealias PthreadT = ULong
public typealias PthreadAttrT = COpaquePointer?
public typealias PthreadMutexT = COpaquePointer?
public typealias PthreadMutexattrT = COpaquePointer?
public typealias PthreadCondT = COpaquePointer?
public typealias PthreadCondattrT = COpaquePointer?
public typealias PthreadRwlockT = COpaquePointer?
public typealias PthreadRwlockattrT = COpaquePointer?
public typealias PthreadKeyT = CInt
public typealias PthreadOnceT = CInt

// --- Resource limit types ---
public typealias RlimitResourceT = CInt

// --- 64-bit types ---
public typealias U64 = ULong

// --- Common struct types (defined once, shared across platform modules) ---
public data class Sockaddr(
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class SockaddrIn(
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: UByteArray,
)

public data class InAddr(
    val sAddr: InAddrT,
)

public data class In6Addr(
    val s6Addr: ByteArray,
)

public data class SockaddrIn6(
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: CUInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: CUInt,
)

public data class SockaddrUn(
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class SockaddrStorage(
    val ssFamily: SaFamilyT,
    val padding: ByteArray,
)

public data class Ipv6Mreq(
    val ipv6mrMultiaddr: In6Addr,
    val ipv6mrInterface: CUInt,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class IpMreqn(
    val imrMultiaddr: InAddr,
    val imrAddress: InAddr,
    val imrIfindex: CInt,
)

public data class IpMreqSource(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
    val imrSourceaddr: InAddr,
)

public data class Linger(
    val lOnoff: CInt,
    val lLinger: CInt,
)

public data class Timeval(
    val tvSec: TimeT,
    val tvUsec: SusecondsT,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: CLong,
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
    val tmGmtoff: CLong,
    val tmZone: String?,
)

public data class Timezone(
    val tzMinuteswest: CInt,
    val tzDsttime: CInt,
)

public data class Itimerval(
    val itInterval: Timeval,
    val itValue: Timeval,
)

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public data class Rlimit(
    val rlimCur: ULong,
    val rlimMax: ULong,
)

public data class Rlimit64(
    val rlimCur: ULong,
    val rlimMax: ULong,
)

public data class Rusage(
    val ruUtime: Timeval,
    val ruStime: Timeval,
    val ruMaxrss: CLong,
    val ruIxrss: CLong,
    val ruIdrss: CLong,
    val ruIsrss: CLong,
    val ruMinflt: CLong,
    val ruMajflt: CLong,
    val ruNswap: CLong,
    val ruInblock: CLong,
    val ruOublock: CLong,
    val ruMsgsnd: CLong,
    val ruMsgrcv: CLong,
    val ruNsignals: CLong,
    val ruNvcsw: CLong,
    val ruNivcsw: CLong,
)

public data class FdSet(
    val fdsBits: ULongArray,
)

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: COpaquePointer?,
    val msgIovlen: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: CInt,
)

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: CUInt,
)

public data class Iovec(
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)

public data class Group(
    val grName: String?,
    val grPasswd: String?,
    val grGid: GidT,
    val grMem: Array<String?>,
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

public data class Spwd(
    val spNamp: String?,
    val spPwdp: String?,
    val spLstchg: CLong,
    val spMin: CLong,
    val spMax: CLong,
    val spWarn: CLong,
    val spInact: CLong,
    val spExpire: CLong,
    val spFlag: ULong,
)

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: SocklenT,
    val aiAddr: COpaquePointer?,
    val aiCanonname: String?,
    val aiNext: Addrinfo?,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CCsT,
    val cCc: UByteArray,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class Winsize(
    val wsRow: CUShort,
    val wsCol: CUShort,
    val wsXpixel: CUShort,
    val wsYpixel: CUShort,
)

public data class Sigval(
    val sivalInt: CInt,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
)

public data class SchedParam(
    val schedPriority: CInt,
)

public data class Sigaction(
    val saHandler: ULong,
    val saMask: SigsetT,
    val saFlags: CInt,
    val saRestorer: COpaquePointer?,
)

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
    val domainname: ByteArray,
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
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
)

public data class Dirent(
    val dIno: InoT,
    val dOff: OffT,
    val dReclen: CUShort,
    val dType: CUChar,
    val dName: ByteArray,
)

// --- Additional type aliases ---
public typealias CCsT = CUChar
public typealias TimeT = CLong
public typealias SusecondsT = CLong
public typealias Suseconds64T = CLong
public typealias ClockT = CLong
public typealias RlimT = ULong
public typealias SegszT = CLong
public typealias SemT = COpaquePointer?
public typealias MqdT = CInt
public typealias MsgqnumT = ULong
public typealias MsglenT = ULong
public typealias UcredT = COpaquePointer?
public typealias KvmT = COpaquePointer?
public typealias ShmattT = UShort
public typealias Fsblkcnt64T = ULong
public typealias Fsfilcnt64T = ULong
public typealias Blkcnt64T = CLong
public typealias NfdsT = CUInt
public typealias PthreadBarrierT = COpaquePointer?
public typealias PthreadBarrierattrT = COpaquePointer?
public typealias PosixSpawnattrT = COpaquePointer?
public typealias CpuSetT = ULong

// --- Additional integer aliases used across platforms ---
public typealias U8 = UByte
public typealias U16 = UShort
public typealias U32 = UInt
public typealias U64 = ULong
public typealias S16 = Short
public typealias S32 = Int
public typealias S64 = Long
public typealias Fpos64T = Long
public typealias Rlim64T = ULong
public typealias PthreadSpinlockT = CInt
public typealias LwpidT = CInt
public typealias PosixSpawnFileActionsT = COpaquePointer?
public typealias BooleanT = CInt
public typealias MallocZoneT = COpaquePointer?
public typealias IdtypeT = CInt
public typealias KvaddrT = ULong
public typealias FflagsT = CUInt
public typealias FixptT = CUInt
public typealias CpuidT = CULong
public typealias CpulevelT = CInt
public typealias CpuwhichT = CInt
public typealias Cpuset = ULong
public typealias RegexT = COpaquePointer?
public typealias RegoffT = CLong
public typealias VmSizeT = ULong
public typealias VmProtT = CInt
public typealias Vnstat = CInt
public typealias Priority = CInt
public typealias Sem = COpaquePointer?
public typealias Filedesc = CInt
public typealias Timeval32 = Int
public typealias Pargs = COpaquePointer?
public typealias VxSemaphore = COpaquePointer?

// --- Additional struct types ---
public data class Aiocb(
    val aioFildes: CInt,
    val aioOffset: OffT,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioReqprio: CInt,
    val aiocbSigevent: COpaquePointer?,
    val aioOpcode: CInt,
    val aioStatus: CInt,
)

public data class Pollfd(
    val fd: CInt,
    val events: CShort,
    val revents: CShort,
)

public data class EpollEvent(
    val events: CUInt,
    val data: ULong,
)

public data class Kevent(
    val ident: ULong,
    val filter: CShort,
    val flags: CUShort,
    val fflags: CUInt,
    val data: CLong,
    val udata: COpaquePointer?,
)

public data class KinfoProc(
    val pPid: CInt,
    val pPpid: CInt,
    val pUid: UidT,
    val pGid: GidT,
)

public data class Stat64(
    val stDev: DevT,
    val stIno: Ino64T,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: Off64T,
    val stBlksize: BlksizeT,
    val stBlocks: Blkcnt64T,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
)

public data class Statfs(
    val fBsize: CLong,
    val fIosize: CLong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fOwner: UidT,
    val fType: CUInt,
    val fFlags: CUInt,
    val fSyncwrites: CLong,
    val fAsyncwrites: CLong,
    val fSid: ByteArray,
    val fNamemax: CLong,
    val fCharacterused: CLong,
    val fSpare: ULongArray,
)

public data class Statfs64(
    val fBsize: CLong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
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
)

public data class Statvfs64(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
)

public data class Dirent64(
    val dIno: Ino64T,
    val dOff: Off64T,
    val dReclen: CUShort,
    val dType: CUChar,
    val dName: ByteArray,
)

public data class IpcPerm(
    val key: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: CUInt,
    val seq: CUShort,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgStime: TimeT,
    val msgRtime: TimeT,
    val msgCtime: TimeT,
    val msgCbytes: ULong,
    val msgQnum: ULong,
    val msgLspid: CInt,
    val msgLRpid: CInt,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmCpid: CInt,
    val shmLpid: CInt,
    val shmNattch: ULong,
)

public data class Sembuf(
    val semNum: CUShort,
    val semOp: CShort,
    val semFlg: CShort,
)

public data class Utmpx(
    val utType: CShort,
    val utPid: PidT,
    val utLine: ByteArray,
    val utId: ByteArray,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utExit: CShort,
    val utSession: CInt,
    val utTv: Timeval,
    val utAddrV6: UIntArray,
)

public data class Utmp(
    val utType: CShort,
    val utPid: PidT,
    val utLine: ByteArray,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utExit: CShort,
    val utSession: CInt,
    val utTv: Timeval,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class GlobT(
    val glPathc: ULong,
    val glPathv: Array<String?>?,
    val glOffs: ULong,
    val glFlags: CInt,
)

public data class MqAttr(
    val mqFlags: CLong,
    val mqMaxmsg: CLong,
    val mqMsgsize: CLong,
    val mqCurmsgs: CLong,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siErrno: CInt,
    val siPid: PidT,
    val siUid: UidT,
    val siStatus: CInt,
    val siAddr: COpaquePointer?,
)

public data class Sigevent(
    val sigevValue: Sigval,
    val sigevSigno: CInt,
    val sigevNotify: CInt,
    val sigevNotifyAttributes: COpaquePointer?,
)

public data class Sigset64T(
    val sigSet: ULongArray,
)

public data class Timex(
    val modes: CUInt,
    val offset: CLong,
    val freq: CLong,
    val maxerror: CLong,
    val esterror: CLong,
    val status: CInt,
    val constant: CLong,
    val precision: CLong,
    val tolerance: CLong,
    val time: Timeval,
    val tick: CLong,
    val ppsfreq: CLong,
    val jitter: CLong,
    val shift: CInt,
    val stabil: CLong,
    val jitcnt: CLong,
    val calcnt: CLong,
    val errcnt: CLong,
    val stbcnt: CLong,
)

public data class Sysinfo(
    val uptime: CLong,
    val loads: ULongArray,
    val totalram: ULong,
    val freeram: ULong,
    val sharedram: ULong,
    val bufferram: ULong,
    val totalswap: ULong,
    val freeswap: ULong,
    val procs: CUShort,
    val totalhigh: ULong,
    val freehigh: ULong,
    val memUnit: CUInt,
)

public data class Mntent(
    val mntFsname: String?,
    val mntDir: String?,
    val mntType: String?,
    val mntOpts: String?,
    val mntFreq: CInt,
    val mntPassno: CInt,
)

public data class SockFilter(
    val code: CUShort,
    val jt: CUChar,
    val jf: CUChar,
    val k: CUInt,
)

public data class SockFprog(
    val len: CUShort,
    val filter: COpaquePointer?,
)

public data class Rtprio(
    val typeField: CUShort,
    val prio: CUShort,
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
    val intFracDigits: Char,
    val fracDigits: Char,
    val pCsPrecedes: Char,
    val pSepBySpace: Char,
    val nCsPrecedes: Char,
    val nSepBySpace: Char,
    val pSignPosn: Char,
    val nSignPosn: Char,
    val intPCsPrecedes: Char,
    val intPSepBySpace: Char,
    val intNCsPrecedes: Char,
    val intNSepBySpace: Char,
    val intPSignPosn: Char,
    val intNSignPosn: Char,
)

public data class IfData(
    val ifiType: CUShort,
    val ifiAddrlen: CUChar,
    val ifiHdrlen: CUChar,
    val ifiIndex: CUShort,
    val ifiMtu: ULong,
    val ifiMetric: ULong,
    val ifiBaudrate: ULong,
    val ifiIpackets: ULong,
    val ifiIerrors: ULong,
    val ifiOpackets: ULong,
    val ifiOerrors: ULong,
    val ifiCollisions: ULong,
    val ifiIbytes: ULong,
    val ifiObytes: ULong,
    val ifiImcasts: ULong,
    val ifiOmcasts: ULong,
    val ifiIqdrops: ULong,
    val ifiOqdrops: ULong,
    val ifiNoproto: ULong,
)

public data class McontextT(
    val mcGs: ULongArray,
    val mcFs: ULongArray,
)

public data class FpregsetT(
    val fpr: COpaquePointer?,
)

// --- Helper functions ---
public fun ULong.toSighandlerT(): SighandlerT = this
public fun Int.toSighandlerT(): SighandlerT = this.toULong()
public fun CInt.toClockidT(): ClockidT = this
public fun COpaquePointer?.toLocaleT(): LocaleT = this

// --- Constants ---
public const val INT_MIN: CInt = -2147483648
public const val INT_MAX: CInt = 2147483647