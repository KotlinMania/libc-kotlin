// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public typealias S16Type = CShort
public typealias U16Type = CUShort
public typealias S32Type = CInt
public typealias U32Type = CUInt
public typealias SlongwordType = CLong
public typealias UlongwordType = CULong
public typealias UChar = CUChar
public typealias UShort = CUShort
public typealias UInt = CUInt
public typealias ULong = CULong
public typealias Int8T = CSchar
public typealias Uint8T = CUChar
public typealias Int16T = CShort
public typealias Uint16T = CUShort
public typealias Int32T = CInt
public typealias Uint32T = CUInt
public typealias IntLeast8T = Int8T
public typealias UintLeast8T = Uint8T
public typealias IntLeast16T = Int16T
public typealias UintLeast16T = Uint16T
public typealias IntLeast32T = Int32T
public typealias UintLeast32T = Uint32T
public typealias IntLeast64T = Int64T
public typealias UintLeast64T = Uint64T
public typealias DevT = UwordType
public typealias UidT = U32Type
public typealias GidT = U32Type
public typealias InoT = UlongwordType
public typealias Ino64T = UquadType
public typealias ModeT = U32Type
public typealias NlinkT = UwordType
public typealias OffT = SlongwordType
public typealias Off64T = SquadType
public typealias PidT = S32Type
public typealias RlimT = UlongwordType
public typealias Rlim64T = UquadType
public typealias BlkcntT = SlongwordType
public typealias Blkcnt64T = SquadType
public typealias FsblkcntT = UlongwordType
public typealias Fsblkcnt64T = UquadType
public typealias FsfilcntT = UlongwordType
public typealias Fsfilcnt64T = UquadType
public typealias FswordT = SwordType
public typealias IdT = U32Type
public typealias ClockT = SlongwordType
public typealias TimeT = SlongwordType
public typealias UsecondsT = U32Type
public typealias SusecondsT = SlongwordType
public typealias Suseconds64T = SquadType
public typealias DaddrT = S32Type
public typealias KeyT = S32Type
public typealias ClockidT = S32Type
public typealias TimerT = UwordType
public typealias BlksizeT = SlongwordType
public typealias FsidT = UquadType
public typealias SsizeT = SwordType
public typealias SyscallSlongT = SlongwordType
public typealias SyscallUlongT = UlongwordType
public typealias CpuMask = UlongwordType
public typealias LoffT = Off64T
public typealias CaddrT = String?
public typealias IntptrT = SwordType
public typealias PtrdiffT = SwordType
public typealias SocklenT = U32Type
public typealias SigAtomicT = CInt
public typealias Time64T = Int64T
public typealias WcharT = CInt
public typealias WintT = CUInt
public typealias InAddrT = UInt
public typealias Float32 = Float
public typealias Float64 = Double
public typealias Float32x = Double
public typealias Float64x = Double
public typealias LocaleT = LocaleStruct?
public typealias Ulong = CULong
public typealias Ushort = CUShort
public typealias Uint = CUInt
public typealias UInt8T = Uint8T
public typealias UInt16T = Uint16T
public typealias UInt32T = Uint32T
public typealias UInt64T = Uint64T
public typealias RegisterT = CInt
public typealias SigsetT = CULong
public typealias FdMask = CLong
public typealias PthreadSpinlockT = CInt
public typealias TssT = CInt
public typealias ThrdT = CLong
public typealias PthreadT = CLong
public typealias PthreadProcessShared = CUInt
public typealias PthreadInheritsched = CUInt
public typealias PthreadContentionscope = CUInt
public typealias PthreadDetachstate = CUInt
public typealias PthreadAttrT = PthreadAttr
public typealias PthreadMutexProtocol = CUInt
public typealias PthreadMutexType = CUInt
public typealias PthreadMutexRobustness = CUInt
public typealias PthreadMutexattrT = PthreadMutexattr
public typealias PthreadMutexT = PthreadMutex
public typealias PthreadCondattrT = PthreadCondattr
public typealias PthreadCondT = PthreadCond
public typealias PthreadRwlockattrT = PthreadRwlockattr
public typealias PthreadRwlockT = PthreadRwlock
public typealias PthreadBarrierattrT = PthreadBarrierattr
public typealias PthreadBarrierT = PthreadBarrier
public typealias PthreadKey = CInt
public typealias PthreadKeyT = PthreadKey
public typealias PthreadOnceT = PthreadOnce
public typealias RlimitResource = CUInt
public typealias RlimitResourceT = RlimitResource
public typealias RusageWho = CInt
public typealias PriorityWhich = CUInt
public typealias SaFamilyT = CUChar
public typealias InPortT = UShort
public typealias SigvalT = Sigval
public typealias SigeventT = Sigevent
public typealias NfdsT = CULong
public typealias TcflagT = CUInt
public typealias CcT = CUChar
public typealias SpeedT = CInt
public typealias GregT = CInt
public typealias GregsetT = LongArray
public typealias IoctlDir = CUInt
public typealias IoctlDatum = CUInt
public typealias ErrorTCodes = CInt
public typealias IntFast8T = CSchar
public typealias UintFast8T = CUChar
public typealias TcpSeq = UInt
public typealias TcpCaState = CUInt
public typealias IdtypeT = CUInt
public typealias MqdT = CInt
public typealias LmidT = CLong
public typealias RegoffT = CInt
public typealias NlItem = CInt
public typealias IconvT = COpaquePointer?

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

public data class Sockaddr(
    val saLen: CUChar,
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class InAddr(
    val sAddr: InAddrT,
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
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class SockaddrUn(
    val sunLen: CUChar,
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class SockaddrStorage(
    val ssLen: CUChar,
    val ssFamily: SaFamilyT,
    val ssAlign: Uint32T,
)

public data class SockaddrAt(
    val address: UByte,
)

public data class SockaddrAx25(
    val address: UByte,
)

public data class SockaddrX25(
    val address: UByte,
)

public data class SockaddrDl(
    val address: UByte,
)

public data class SockaddrEon(
    val address: UByte,
)

public data class SockaddrInarp(
    val address: UByte,
)

public data class SockaddrIpx(
    val address: UByte,
)

public data class SockaddrIso(
    val address: UByte,
)

public data class SockaddrNs(
    val address: UByte,
)

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: SocklenT,
    val aiAddr: Sockaddr?,
    val aiCanonname: String?,
    val aiNext: Addrinfo?,
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

public data class Dirent(
    val dIno: InoT,
    val dReclen: CUShort,
    val dType: CUChar,
    val dNamlen: CUChar,
    val dName: ByteArray,
)

public data class Dirent64(
    val dIno: Ino64T,
    val dReclen: CUShort,
    val dType: CUChar,
    val dNamlen: CUChar,
    val dName: ByteArray,
)

public data class FdSet(
    val fdsBits: List<FdMask>,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cCc: List<CcT>,
    val ispeed: SpeedT,
    val ospeed: SpeedT,
)

public data class Mallinfo(
    val arena: CInt,
    val ordblks: CInt,
    val smblks: CInt,
    val hblks: CInt,
    val hblkhd: CInt,
    val usmblks: CInt,
    val fsmblks: CInt,
    val uordblks: CInt,
    val fordblks: CInt,
    val keepcost: CInt,
)

public data class Mallinfo2(
    val arena: ULong,
    val ordblks: ULong,
    val smblks: ULong,
    val hblks: ULong,
    val hblkhd: ULong,
    val usmblks: ULong,
    val fsmblks: ULong,
    val uordblks: ULong,
    val fordblks: ULong,
    val keepcost: ULong,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
)

public data class Sigevent(
    val sigevValue: Sigval,
    val sigevSigno: CInt,
    val sigevNotify: CInt,
    val sigevNotifyAttributes: PthreadAttrT?,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val siPid: PidT,
    val siUid: UidT,
    val siAddr: COpaquePointer?,
    val siStatus: CInt,
    val siBand: CLong,
    val siValue: Sigval,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: SyscallSlongT,
)

public data class Timeval(
    val tvSec: Int,
    val tvUsec: Int,
)

public data class LocaleData(
    val address: UByte,
)

public data class Stat(
    val stFstype: CInt,
    val stDev: FsidT,
    val stIno: InoT,
    val stGen: CUInt,
    val stRdev: DevT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stSize: OffT,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAuthor: UidT,
    val stFlags: CUInt,
    val stSpare: IntArray,
)

public data class Stat64(
    val stFstype: CInt,
    val stDev: FsidT,
    val stIno: Ino64T,
    val stGen: CUInt,
    val stRdev: DevT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stSize: Off64T,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
    val stBlksize: BlksizeT,
    val stBlocks: Blkcnt64T,
    val stAuthor: UidT,
    val stFlags: CUInt,
    val stSpare: IntArray,
)

public data class Statx(
    val stxMask: UInt,
    val stxBlksize: UInt,
    val stxAttributes: ULong,
    val stxNlink: UInt,
    val stxUid: UInt,
    val stxGid: UInt,
    val stxMode: UShort,
    val stxIno: ULong,
    val stxSize: ULong,
    val stxBlocks: ULong,
    val stxAttributesMask: ULong,
    val stxAtime: StatxTimestamp,
    val stxBtime: StatxTimestamp,
    val stxCtime: StatxTimestamp,
    val stxMtime: StatxTimestamp,
    val stxRdevMajor: UInt,
    val stxRdevMinor: UInt,
    val stxDevMajor: UInt,
    val stxDevMinor: UInt,
)

public data class StatxTimestamp(
    val tvSec: Long,
    val tvNsec: UInt,
    val statxTimestampPad1: IntArray,
)

public data class Statfs(
    val fType: CUInt,
    val fBsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsblkcntT,
    val fFfree: FsblkcntT,
    val fFsid: FsidT,
    val fNamelen: CULong,
    val fFavail: FsfilcntT,
    val fFrsize: CULong,
    val fFlag: CULong,
    val fSpare: UIntArray,
)

public data class Statfs64(
    val fType: CUInt,
    val fBsize: CULong,
    val fBlocks: Fsblkcnt64T,
    val fBfree: Fsblkcnt64T,
    val fBavail: Fsblkcnt64T,
    val fFiles: Fsblkcnt64T,
    val fFfree: Fsblkcnt64T,
    val fFsid: FsidT,
    val fNamelen: CULong,
    val fFavail: Fsfilcnt64T,
    val fFrsize: CULong,
    val fFlag: CULong,
    val fSpare: UIntArray,
)

public data class Statvfs(
    val fType: CUInt,
    val fBsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFsid: FsidT,
    val fNamemax: CULong,
    val fFavail: FsfilcntT,
    val fFrsize: CULong,
    val fFlag: CULong,
    val fSpare: UIntArray,
)

public data class Statvfs64(
    val fType: CUInt,
    val fBsize: CULong,
    val fBlocks: Fsblkcnt64T,
    val fBfree: Fsblkcnt64T,
    val fBavail: Fsblkcnt64T,
    val fFiles: Fsfilcnt64T,
    val fFfree: Fsfilcnt64T,
    val fFsid: FsidT,
    val fNamemax: CULong,
    val fFavail: Fsfilcnt64T,
    val fFrsize: CULong,
    val fFlag: CULong,
    val fSpare: UIntArray,
)

public data class Aiocb(
    val aioFildes: CInt,
    val aioLioOpcode: CInt,
    val aioReqprio: CInt,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioSigevent: Sigevent,
    val nextPrio: Aiocb?,
    val absPrio: CInt,
    val policy: CInt,
    val errorCode: CInt,
    val returnValue: SsizeT,
    val aioOffset: OffT,
)

public data class MqAttr(
    val mqFlags: CLong,
    val mqMaxmsg: CLong,
    val mqMsgsize: CLong,
    val mqCurmsgs: CLong,
)

public data class ExitStatus(
    val eTermination: CShort,
    val eExit: CShort,
)

public data class SemT(
    val size: ByteArray,
)

public data class Pthread(
    val address: UByte,
)

public data class PthreadMutexattr(
    val prioceiling: CInt,
    val protocol: PthreadMutexProtocol,
    val pshared: PthreadProcessShared,
    val mutexType: PthreadMutexType,
)

public data class PthreadMutex(
    val lock: CUInt,
    val ownerId: CUInt,
    val cnt: CUInt,
    val shpid: CInt,
    val type: CInt,
    val flags: CInt,
)

public data class PthreadCondattr(
    val pshared: PthreadProcessShared,
    val clock: ClockidT,
)

public data class PthreadRwlockattr(
    val pshared: PthreadProcessShared,
)

public data class PthreadBarrierattr(
    val pshared: PthreadProcessShared,
)

public data class PthreadOnce(
    val run: CInt,
    val lock: PthreadSpinlockT,
)

public data class PthreadCond(
    val lock: PthreadSpinlockT,
    val queue: Pthread?,
    val attr: PthreadCondattr?,
    val wrefs: CUInt,
    val data: COpaquePointer?,
)

public data class PthreadAttr(
    val schedparam: SchedParam,
    val stackaddr: COpaquePointer?,
    val stacksize: ULong,
    val guardsize: ULong,
    val detachstate: PthreadDetachstate,
    val inheritsched: PthreadInheritsched,
    val contentionscope: PthreadContentionscope,
    val schedpolicy: CInt,
)

public data class PthreadRwlock(
    val held: PthreadSpinlockT,
    val lock: PthreadSpinlockT,
    val readers: CInt,
    val readerqueue: Pthread?,
    val writerqueue: Pthread?,
    val attr: PthreadRwlockattr?,
    val data: COpaquePointer?,
)

public data class PthreadBarrier(
    val lock: PthreadSpinlockT,
    val queue: Pthread?,
    val pending: CUInt,
    val count: CUInt,
    val attr: PthreadBarrierattr?,
    val data: COpaquePointer?,
)

public data class Seminfo(
    val semmap: CInt,
    val semmni: CInt,
    val semmns: CInt,
    val semmnu: CInt,
    val semmsl: CInt,
    val semopm: CInt,
    val semume: CInt,
    val semusz: CInt,
    val semvmx: CInt,
    val semaem: CInt,
)

public class IOFILE

public data class SchedParam(
    val schedPriority: CInt,
)

public data class Iovec(
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
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
    val spFlag: CULong,
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
    val tmGmtoff: CLong,
    val tmZone: String?,
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

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class Ifaddrs(
    val ifaNext: Ifaddrs?,
    val ifaName: String?,
    val ifaFlags: CUInt,
    val ifaAddr: Sockaddr?,
    val ifaNetmask: Sockaddr?,
    val ifaIfu: Sockaddr?,
    val ifaData: COpaquePointer?,
)

public data class Arpreq(
    val arpPa: Sockaddr,
    val arpHa: Sockaddr,
    val arpFlags: CInt,
    val arpNetmask: Sockaddr,
    val arpDev: ByteArray,
)

public data class ArpreqOld(
    val arpPa: Sockaddr,
    val arpHa: Sockaddr,
    val arpFlags: CInt,
    val arpNetmask: Sockaddr,
)

public data class Arphdr(
    val arHrd: UShort,
    val arPro: UShort,
    val arHln: UByte,
    val arPln: UByte,
    val arOp: UShort,
)

public data class ArpdRequest(
    val req: CUShort,
    val ip: UInt,
    val dev: CULong,
    val stamp: CULong,
    val updated: CULong,
    val ha: UByteArray,
)

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: CUInt,
)

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: Sockaddr,
)

public data class LocaleStruct(
    val locales: List<COpaquePointer?>,
    val ctypeB: CUShort?,
    val ctypeTolower: CInt?,
    val ctypeToupper: CInt?,
    val names: List<String?>,
)

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
    val domainname: ByteArray,
)

public data class Rlimit64(
    val rlimCur: Rlim64T,
    val rlimMax: Rlim64T,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)

public data class DlPhdrInfo(
    val dlpiAddr: ElfAddr,
    val dlpiName: String?,
    val dlpiPhdr: ElfPhdr?,
    val dlpiPhnum: ElfHalf,
    val dlpiAdds: CULongLong,
    val dlpiSubs: CULongLong,
    val dlpiTlsModid: ULong,
    val dlpiTlsData: COpaquePointer?,
)

public data class Flock(
    val lType: CInt,
    val lWhence: CInt,
    val lType2: CShort,
    val lWhence2: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
)

public data class Flock64(
    val lType: CInt,
    val lWhence: CInt,
    val lType2: CShort,
    val lWhence2: CShort,
    val lStart: OffT,
    val lLen: Off64T,
    val lPid: PidT,
)

public data class GlobT(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: CInt,
)

public data class Glob64T(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: CInt,
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

public data class CpuSetT(
    val bits: UIntArray,
    val bits2: ULongArray,
)

public data class IfNameindex(
    val ifIndex: CUInt,
    val ifName: String?,
)

public data class Msginfo(
    val msgpool: CInt,
    val msgmap: CInt,
    val msgmax: CInt,
    val msgmnb: CInt,
    val msgmni: CInt,
    val msgssz: CInt,
    val msgtql: CInt,
    val msgseg: CUShort,
)

public data class Sembuf(
    val semNum: CUShort,
    val semOp: CShort,
    val semFlg: CShort,
)

public data class Mntent(
    val mntFsname: String?,
    val mntDir: String?,
    val mntType: String?,
    val mntOpts: String?,
    val mntFreq: CInt,
    val mntPassno: CInt,
)

public data class PosixSpawnFileActionsT(
    val allocated: CInt,
    val used: CInt,
    val actions: CInt?,
)

public data class PosixSpawnattrT(
    val flags: CShort,
    val pgrp: PidT,
    val sd: SigsetT,
    val ss: SigsetT,
    val sp: SchedParam,
    val policy: CInt,
)

public data class RegmatchT(
    val rmSo: RegoffT,
    val rmEo: RegoffT,
)

public data class Option(
    val name: String?,
    val hasArg: CInt,
    val flag: CInt?,
    val `val`: CInt,
)

public data class Utmpx(
    val utType: CShort,
    val utPid: PidT,
    val utLine: ByteArray,
    val utId: ByteArray,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utExit: ExitStatus,
    val utSession: CLong,
    val utTv: Timeval,
    val utSession2: Int,
    val utTv2: Timeval,
    val utAddrV6: IntArray,
)

public const val AIO_CANCELED: CInt = 0
public const val AIO_NOTCANCELED: CInt = 1
public const val AIO_ALLDONE: CInt = 2
public const val LIO_READ: CInt = 0
public const val LIO_WRITE: CInt = 1
public const val LIO_NOP: CInt = 2
public const val LIO_WAIT: CInt = 0
public const val LIO_NOWAIT: CInt = 1
public val GLOB_ERR: CInt = 1 shl 0
public val GLOB_MARK: CInt = 1 shl 1
public val GLOB_NOSORT: CInt = 1 shl 2
public val GLOB_DOOFFS: CInt = 1 shl 3
public val GLOB_NOCHECK: CInt = 1 shl 4
public val GLOB_APPEND: CInt = 1 shl 5
public val GLOB_NOESCAPE: CInt = 1 shl 6
public const val GLOB_NOSPACE: CInt = 1
public const val GLOB_ABORTED: CInt = 2
public const val GLOB_NOMATCH: CInt = 3
public val GLOB_PERIOD: CInt = 1 shl 7
public val GLOB_ALTDIRFUNC: CInt = 1 shl 9
public val GLOB_BRACE: CInt = 1 shl 10
public val GLOB_NOMAGIC: CInt = 1 shl 11
public val GLOB_TILDE: CInt = 1 shl 12
public val GLOB_ONLYDIR: CInt = 1 shl 13
public val GLOB_TILDE_CHECK: CInt = 1 shl 14
public const val IPC_PRIVATE: KeyT = 0
public const val IPC_CREAT: CInt = 512
public const val IPC_EXCL: CInt = 1024
public const val IPC_NOWAIT: CInt = 2048
public const val IPC_RMID: CInt = 0
public const val IPC_SET: CInt = 1
public const val IPC_STAT: CInt = 2
public const val IPC_INFO: CInt = 3
public const val MSG_STAT: CInt = 11
public const val MSG_INFO: CInt = 12
public const val MSG_NOERROR: CInt = 4096
public const val MSG_EXCEPT: CInt = 8192
public const val SHM_R: CInt = 256
public const val SHM_W: CInt = 128
public const val SHM_RDONLY: CInt = 4096
public const val SHM_RND: CInt = 8192
public const val SHM_REMAP: CInt = 16384
public const val SHM_LOCK: CInt = 11
public const val SHM_UNLOCK: CInt = 12
public const val __FD_SETSIZE: ULong = 256uL
public const val R_OK: CInt = 4
public const val W_OK: CInt = 2
public const val X_OK: CInt = 1
public const val F_OK: CInt = 0
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val SEEK_DATA: CInt = 3
public const val SEEK_HOLE: CInt = 4
public const val L_SET: CInt = 0
public const val L_INCR: CInt = 1
public const val L_XTND: CInt = 2
public const val F_ULOCK: CInt = 0
public const val F_LOCK: CInt = 1
public const val F_TLOCK: CInt = 2
public const val F_TEST: CInt = 3
public const val CLOSE_RANGE_CLOEXEC: CInt = 4
public const val EOF: CInt = -1
public const val WNOHANG: CInt = 1
public const val WUNTRACED: CInt = 2
public const val WSTOPPED: CInt = 2
public const val WCONTINUED: CInt = 4
public const val WNOWAIT: CInt = 8
public const val WEXITED: CInt = 16
public const val __W_CONTINUED: CInt = 65535
public const val __WCOREFLAG: CInt = 128
public const val RAND_MAX: CInt = 2147483647
public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val __LITTLE_ENDIAN: ULong = 1234uL
public const val __BIG_ENDIAN: ULong = 4321uL
public const val __PDP_ENDIAN: ULong = 3412uL
public const val __BYTE_ORDER: ULong = 1234uL
public const val __FLOAT_WORD_ORDER: ULong = 1234uL
public const val LITTLE_ENDIAN: ULong = 1234uL
public const val BIG_ENDIAN: ULong = 4321uL
public const val PDP_ENDIAN: ULong = 3412uL
public const val BYTE_ORDER: ULong = 1234uL
public const val FD_SETSIZE: ULong = 256uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 28uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 24uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 16uL
public const val __SIZEOF_PTHREAD_COND_T: ULong = 20uL
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_ONCE_T: ULong = 8uL
public const val __PTHREAD_SPIN_LOCK_INITIALIZER: CInt = 0
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val RLIM_INFINITY: RlimT = 2147483647uL
public const val RLIM64_INFINITY: Rlim64T = 9223372036854775807
public const val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY
public const val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY
public const val PRIO_MIN: CInt = -20
public const val PRIO_MAX: CInt = 20
public const val NSS_BUFLEN_PASSWD: ULong = 1024uL
public const val SOCK_TYPE_MASK: ULong = 15uL
public const val PF_UNSPEC: CInt = 0
public const val PF_LOCAL: CInt = 1
public const val PF_UNIX: CInt = 1
public const val PF_FILE: CInt = 1
public const val PF_INET: CInt = 2
public const val PF_IMPLINK: CInt = 3
public const val PF_PUP: CInt = 4
public const val PF_CHAOS: CInt = 5
public const val PF_NS: CInt = 6
public const val PF_ISO: CInt = 7
public const val PF_OSI: CInt = 7
public const val PF_ECMA: CInt = 8
public const val PF_DATAKIT: CInt = 9
public const val PF_CCITT: CInt = 10
public const val PF_SNA: CInt = 11
public const val PF_DECnet: CInt = 12
public const val PF_DLI: CInt = 13
public const val PF_LAT: CInt = 14
public const val PF_HYLINK: CInt = 15
public const val PF_APPLETALK: CInt = 16
public const val PF_ROUTE: CInt = 17
public const val PF_XTP: CInt = 19
public const val PF_COIP: CInt = 20
public const val PF_CNT: CInt = 21
public const val PF_RTIP: CInt = 22
public const val PF_IPX: CInt = 23
public const val PF_SIP: CInt = 24
public const val PF_PIP: CInt = 25
public const val PF_INET6: CInt = 26
public const val PF_MAX: CInt = 27
public const val AF_UNSPEC: CInt = 0
public const val AF_LOCAL: CInt = 1
public const val AF_UNIX: CInt = 1
public const val AF_FILE: CInt = 1
public const val AF_INET: CInt = 2
public const val AF_IMPLINK: CInt = 3
public const val AF_PUP: CInt = 4
public const val AF_CHAOS: CInt = 5
public const val AF_NS: CInt = 6
public const val AF_ISO: CInt = 7
public const val AF_OSI: CInt = 7
public const val AF_ECMA: CInt = 8
public const val AF_DATAKIT: CInt = 9
public const val AF_CCITT: CInt = 10
public const val AF_SNA: CInt = 11
public const val AF_DECnet: CInt = 12
public const val AF_DLI: CInt = 13
public const val AF_LAT: CInt = 14
public const val AF_HYLINK: CInt = 15
public const val AF_APPLETALK: CInt = 16
public const val AF_ROUTE: CInt = 17
public const val pseudo_AF_XTP: CInt = 19
public const val AF_COIP: CInt = 20
public const val AF_CNT: CInt = 21
public const val pseudo_AF_RTIP: CInt = 22
public const val AF_IPX: CInt = 23
public const val AF_SIP: CInt = 24
public const val pseudo_AF_PIP: CInt = 25
public const val AF_INET6: CInt = 26
public const val AF_MAX: CInt = 27
public const val SOMAXCONN: CInt = 4096
public const val _SS_SIZE: ULong = 128uL
public const val CMGROUP_MAX: ULong = 16uL
public const val SOL_SOCKET: CInt = 65535
public const val ITIMER_REAL: CInt = 0
public const val ITIMER_VIRTUAL: CInt = 1
public const val ITIMER_PROF: CInt = 2
public const val SOL_IP: CInt = 0
public const val SOL_TCP: CInt = 6
public const val SOL_UDP: CInt = 17
public const val SOL_IPV6: CInt = 41
public const val SOL_ICMPV6: CInt = 58
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
public const val IPV6_ADDRFORM: CInt = 1
public const val IPV6_2292PKTINFO: CInt = 2
public const val IPV6_2292HOPOPTS: CInt = 3
public const val IPV6_2292DSTOPTS: CInt = 4
public const val IPV6_2292RTHDR: CInt = 5
public const val IPV6_2292PKTOPTIONS: CInt = 6
public const val IPV6_CHECKSUM: CInt = 7
public const val IPV6_2292HOPLIMIT: CInt = 8
public const val IPV6_RXINFO: CInt = 2
public const val IPV6_TXINFO: CInt = 2
public const val SCM_SRCINFO: CInt = 2
public const val IPV6_UNICAST_HOPS: CInt = 16
public const val IPV6_MULTICAST_IF: CInt = 17
public const val IPV6_MULTICAST_HOPS: CInt = 18
public const val IPV6_MULTICAST_LOOP: CInt = 19
public const val IPV6_JOIN_GROUP: CInt = 20
public const val IPV6_LEAVE_GROUP: CInt = 21
public const val IPV6_ROUTER_ALERT: CInt = 22
public const val IPV6_MTU_DISCOVER: CInt = 23
public const val IPV6_MTU: CInt = 24
public const val IPV6_RECVERR: CInt = 25
public const val IPV6_V6ONLY: CInt = 26
public const val IPV6_JOIN_ANYCAST: CInt = 27
public const val IPV6_LEAVE_ANYCAST: CInt = 28
public const val IPV6_RECVPKTINFO: CInt = 49
public const val IPV6_PKTINFO: CInt = 50
public const val IPV6_RECVHOPLIMIT: CInt = 51
public const val IPV6_HOPLIMIT: CInt = 52
public const val IPV6_RECVHOPOPTS: CInt = 53
public const val IPV6_HOPOPTS: CInt = 54
public const val IPV6_RTHDRDSTOPTS: CInt = 55
public const val IPV6_RECVRTHDR: CInt = 56
public const val IPV6_RTHDR: CInt = 57
public const val IPV6_RECVDSTOPTS: CInt = 58
public const val IPV6_DSTOPTS: CInt = 59
public const val IPV6_RECVPATHMTU: CInt = 60
public const val IPV6_PATHMTU: CInt = 61
public const val IPV6_DONTFRAG: CInt = 62
public const val IPV6_RECVTCLASS: CInt = 66
public const val IPV6_TCLASS: CInt = 67
public const val IPV6_ADDR_PREFERENCES: CInt = 72
public const val IPV6_MINHOPCOUNT: CInt = 73
public const val IPV6_ADD_MEMBERSHIP: CInt = 20
public const val IPV6_DROP_MEMBERSHIP: CInt = 21
public const val IPV6_RXHOPOPTS: CInt = 3
public const val IPV6_RXDSTOPTS: CInt = 4
public const val IPV6_RTHDR_LOOSE: CInt = 0
public const val IPV6_RTHDR_STRICT: CInt = 1
public const val IPV6_RTHDR_TYPE_0: CInt = 0
public const val IN_CLASSA_NET: UInt = 4278190080u
public const val IN_CLASSA_NSHIFT: ULong = 24uL
public const val IN_CLASSA_HOST: UInt = 16777215u
public const val IN_CLASSA_MAX: UInt = 128u
public const val IN_CLASSB_NET: UInt = 4294901760u
public const val IN_CLASSB_NSHIFT: ULong = 16uL
public const val IN_CLASSB_HOST: UInt = 65535u
public const val IN_CLASSB_MAX: UInt = 65536u
public const val IN_CLASSC_NET: UInt = 4294967040u
public const val IN_CLASSC_NSHIFT: ULong = 8uL
public const val IN_CLASSC_HOST: UInt = 255u
public const val IN_LOOPBACKNET: UInt = 127u
public const val INET_ADDRSTRLEN: ULong = 16uL
public const val INET6_ADDRSTRLEN: ULong = 46uL
public val IPTOS_TOS_MASK: UByte = (0x1E).toUByte()
public val IPTOS_PREC_MASK: UByte = (0xE0).toUByte()
public val IPTOS_ECN_NOT_ECT: UByte = (0x00).toUByte()
public val IPTOS_LOWDELAY: UByte = (0x10).toUByte()
public val IPTOS_THROUGHPUT: UByte = (0x08).toUByte()
public val IPTOS_RELIABILITY: UByte = (0x04).toUByte()
public val IPTOS_MINCOST: UByte = (0x02).toUByte()
public val IPTOS_PREC_NETCONTROL: UByte = (0xe0).toUByte()
public val IPTOS_PREC_INTERNETCONTROL: UByte = (0xc0).toUByte()
public val IPTOS_PREC_CRITIC_ECP: UByte = (0xa0).toUByte()
public val IPTOS_PREC_FLASHOVERRIDE: UByte = (0x80).toUByte()
public val IPTOS_PREC_FLASH: UByte = (0x60).toUByte()
public val IPTOS_PREC_IMMEDIATE: UByte = (0x40).toUByte()
public val IPTOS_PREC_PRIORITY: UByte = (0x20).toUByte()
public val IPTOS_PREC_ROUTINE: UByte = (0x00).toUByte()
public val IPTOS_ECN_MASK: UByte = (0x03).toUByte()
public val IPTOS_ECN_ECT1: UByte = (0x01).toUByte()
public val IPTOS_ECN_ECT0: UByte = (0x02).toUByte()
public val IPTOS_ECN_CE: UByte = (0x03).toUByte()
public val IPOPT_COPY: UByte = (0x80).toUByte()
public val IPOPT_CLASS_MASK: UByte = (0x60).toUByte()
public val IPOPT_NUMBER_MASK: UByte = (0x1f).toUByte()
public val IPOPT_CONTROL: UByte = (0x00).toUByte()
public val IPOPT_RESERVED1: UByte = (0x20).toUByte()
public val IPOPT_MEASUREMENT: UByte = (0x40).toUByte()
public val IPOPT_RESERVED2: UByte = (0x60).toUByte()
public val IPOPT_END: UByte = 0 or IPOPT_CONTROL
public val IPOPT_NOOP: UByte = 1 or IPOPT_CONTROL
public val IPOPT_SEC: UByte = 2 or IPOPT_CONTROL or IPOPT_COPY
public val IPOPT_LSRR: UByte = 3 or IPOPT_CONTROL or IPOPT_COPY
public val IPOPT_TIMESTAMP: UByte = 4 or IPOPT_MEASUREMENT
public val IPOPT_RR: UByte = 7 or IPOPT_CONTROL
public val IPOPT_SID: UByte = 8 or IPOPT_CONTROL or IPOPT_COPY
public val IPOPT_SSRR: UByte = 9 or IPOPT_CONTROL or IPOPT_COPY
public val IPOPT_RA: UByte = 20 or IPOPT_CONTROL or IPOPT_COPY
public val IPVERSION: UByte = (4).toUByte()
public val MAXTTL: UByte = (255).toUByte()
public val IPDEFTTL: UByte = (64).toUByte()
public val IPOPT_OPTVAL: UByte = (0).toUByte()
public val IPOPT_OLEN: UByte = (1).toUByte()
public val IPOPT_OFFSET: UByte = (2).toUByte()
public val IPOPT_MINOFF: UByte = (4).toUByte()
public val MAX_IPOPTLEN: UByte = (40).toUByte()
public const val IPOPT_NOP: UByte = IPOPT_NOOP
public const val IPOPT_EOL: UByte = IPOPT_END
public const val IPOPT_TS: UByte = IPOPT_TIMESTAMP
public val IPOPT_TS_TSONLY: UByte = (0).toUByte()
public val IPOPT_TS_TSANDADDR: UByte = (1).toUByte()
public val IPOPT_TS_PRESPEC: UByte = (3).toUByte()
public val ARPOP_REQUEST: UShort = (1).toUShort()
public val ARPOP_REPLY: UShort = (2).toUShort()
public val ARPOP_RREQUEST: UShort = (3).toUShort()
public val ARPOP_RREPLY: UShort = (4).toUShort()
public val ARPOP_InREQUEST: UShort = (8).toUShort()
public val ARPOP_InREPLY: UShort = (9).toUShort()
public val ARPOP_NAK: UShort = (10).toUShort()
public const val MAX_ADDR_LEN: ULong = 7uL
public val ARPD_UPDATE: CUShort = (0x01).toUShort()
public val ARPD_LOOKUP: CUShort = (0x02).toUShort()
public val ARPD_FLUSH: CUShort = (0x03).toUShort()
public const val ATF_MAGIC: CInt = 0x80
public const val ATF_NETMASK: CInt = 0x20
public const val ATF_DONTPUB: CInt = 0x40
public val ARPHRD_NETROM: UShort = (0).toUShort()
public val ARPHRD_ETHER: UShort = (1).toUShort()
public val ARPHRD_EETHER: UShort = (2).toUShort()
public val ARPHRD_AX25: UShort = (3).toUShort()
public val ARPHRD_PRONET: UShort = (4).toUShort()
public val ARPHRD_CHAOS: UShort = (5).toUShort()
public val ARPHRD_IEEE802: UShort = (6).toUShort()
public val ARPHRD_ARCNET: UShort = (7).toUShort()
public val ARPHRD_APPLETLK: UShort = (8).toUShort()
public val ARPHRD_DLCI: UShort = (15).toUShort()
public val ARPHRD_ATM: UShort = (19).toUShort()
public val ARPHRD_METRICOM: UShort = (23).toUShort()
public val ARPHRD_IEEE1394: UShort = (24).toUShort()
public val ARPHRD_EUI64: UShort = (27).toUShort()
public val ARPHRD_INFINIBAND: UShort = (32).toUShort()
public val ARPHRD_SLIP: UShort = (256).toUShort()
public val ARPHRD_CSLIP: UShort = (257).toUShort()
public val ARPHRD_SLIP6: UShort = (258).toUShort()
public val ARPHRD_CSLIP6: UShort = (259).toUShort()
public val ARPHRD_RSRVD: UShort = (260).toUShort()
public val ARPHRD_ADAPT: UShort = (264).toUShort()
public val ARPHRD_ROSE: UShort = (270).toUShort()
public val ARPHRD_X25: UShort = (271).toUShort()
public val ARPHRD_HWX25: UShort = (272).toUShort()
public val ARPHRD_CAN: UShort = (280).toUShort()
public val ARPHRD_PPP: UShort = (512).toUShort()
public val ARPHRD_CISCO: UShort = (513).toUShort()
public const val ARPHRD_HDLC: UShort = ARPHRD_CISCO
public val ARPHRD_LAPB: UShort = (516).toUShort()
public val ARPHRD_DDCMP: UShort = (517).toUShort()
public val ARPHRD_RAWHDLC: UShort = (518).toUShort()
public val ARPHRD_TUNNEL: UShort = (768).toUShort()
public val ARPHRD_TUNNEL6: UShort = (769).toUShort()
public val ARPHRD_FRAD: UShort = (770).toUShort()
public val ARPHRD_SKIP: UShort = (771).toUShort()
public val ARPHRD_LOOPBACK: UShort = (772).toUShort()
public val ARPHRD_LOCALTLK: UShort = (773).toUShort()
public val ARPHRD_FDDI: UShort = (774).toUShort()
public val ARPHRD_BIF: UShort = (775).toUShort()
public val ARPHRD_SIT: UShort = (776).toUShort()
public val ARPHRD_IPDDP: UShort = (777).toUShort()
public val ARPHRD_IPGRE: UShort = (778).toUShort()
public val ARPHRD_PIMREG: UShort = (779).toUShort()
public val ARPHRD_HIPPI: UShort = (780).toUShort()
public val ARPHRD_ASH: UShort = (781).toUShort()
public val ARPHRD_ECONET: UShort = (782).toUShort()
public val ARPHRD_IRDA: UShort = (783).toUShort()
public val ARPHRD_FCPP: UShort = (784).toUShort()
public val ARPHRD_FCAL: UShort = (785).toUShort()
public val ARPHRD_FCPL: UShort = (786).toUShort()
public val ARPHRD_FCFABRIC: UShort = (787).toUShort()
public val ARPHRD_IEEE802_TR: UShort = (800).toUShort()
public val ARPHRD_IEEE80211: UShort = (801).toUShort()
public val ARPHRD_IEEE80211_PRISM: UShort = (802).toUShort()
public val ARPHRD_IEEE80211_RADIOTAP: UShort = (803).toUShort()
public val ARPHRD_IEEE802154: UShort = (804).toUShort()
public val ARPHRD_VOID: UShort = (0xFFFF).toUShort()
public val ARPHRD_NONE: UShort = (0xFFFE).toUShort()
public const val _POSIX_AIO_LISTIO_MAX: ULong = 2uL
public const val _POSIX_AIO_MAX: ULong = 1uL
public const val _POSIX_ARG_MAX: ULong = 4096uL
public const val _POSIX_CHILD_MAX: ULong = 25uL
public const val _POSIX_DELAYTIMER_MAX: ULong = 32uL
public const val _POSIX_HOST_NAME_MAX: ULong = 255uL
public const val _POSIX_LINK_MAX: ULong = 8uL
public const val _POSIX_LOGIN_NAME_MAX: ULong = 9uL
public const val _POSIX_MAX_CANON: ULong = 255uL
public const val _POSIX_MAX_INPUT: ULong = 255uL
public const val _POSIX_MQ_OPEN_MAX: ULong = 8uL
public const val _POSIX_MQ_PRIO_MAX: ULong = 32uL
public const val _POSIX_NAME_MAX: ULong = 14uL
public const val _POSIX_NGROUPS_MAX: ULong = 8uL
public const val _POSIX_OPEN_MAX: ULong = 20uL
public const val _POSIX_FD_SETSIZE: ULong = 20uL
public const val _POSIX_PATH_MAX: ULong = 256uL
public const val _POSIX_PIPE_BUF: ULong = 512uL
public const val _POSIX_RE_DUP_MAX: ULong = 255uL
public const val _POSIX_RTSIG_MAX: ULong = 8uL
public const val _POSIX_SEM_NSEMS_MAX: ULong = 256uL
public const val _POSIX_SEM_VALUE_MAX: ULong = 32767uL
public const val _POSIX_SIGQUEUE_MAX: ULong = 32uL
public const val _POSIX_SSIZE_MAX: ULong = 32767uL
public const val _POSIX_STREAM_MAX: ULong = 8uL
public const val _POSIX_SYMLINK_MAX: ULong = 255uL
public const val _POSIX_SYMLOOP_MAX: ULong = 8uL
public const val _POSIX_TIMER_MAX: ULong = 32uL
public const val _POSIX_TTY_NAME_MAX: ULong = 9uL
public const val _POSIX_TZNAME_MAX: ULong = 6uL
public const val _POSIX_QLIMIT: ULong = 1uL
public const val _POSIX_HIWAT: ULong = 512uL
public const val _POSIX_UIO_MAXIOV: ULong = 16uL
public const val _POSIX_CLOCKRES_MIN: ULong = 20000000uL
public const val NAME_MAX: ULong = 255uL
public const val NGROUPS_MAX: ULong = 256uL
public const val _POSIX_THREAD_KEYS_MAX: ULong = 128uL
public const val _POSIX_THREAD_DESTRUCTOR_ITERATIONS: ULong = 4uL
public const val _POSIX_THREAD_THREADS_MAX: ULong = 64uL
public const val SEM_VALUE_MAX: CInt = 2147483647
public const val MAXNAMLEN: ULong = 255uL
public const val HOST_NOT_FOUND: CInt = 1
public const val TRY_AGAIN: CInt = 2
public const val NO_RECOVERY: CInt = 3
public const val NO_DATA: CInt = 4
public const val NETDB_INTERNAL: CInt = -1
public const val NETDB_SUCCESS: CInt = 0
public const val NO_ADDRESS: CInt = 4
public const val IPPORT_RESERVED: CInt = 1024
public const val SCOPE_DELIMITER: UByte = 37u
public const val GAI_WAIT: CInt = 0
public const val GAI_NOWAIT: CInt = 1
public const val AI_PASSIVE: CInt = 1
public const val AI_CANONNAME: CInt = 2
public const val AI_NUMERICHOST: CInt = 4
public const val AI_V4MAPPED: CInt = 8
public const val AI_ALL: CInt = 16
public const val AI_ADDRCONFIG: CInt = 32
public const val AI_IDN: CInt = 64
public const val AI_CANONIDN: CInt = 128
public const val AI_NUMERICSERV: CInt = 1024
public const val EAI_BADFLAGS: CInt = -1
public const val EAI_NONAME: CInt = -2
public const val EAI_AGAIN: CInt = -3
public const val EAI_FAIL: CInt = -4
public const val EAI_FAMILY: CInt = -6
public const val EAI_SOCKTYPE: CInt = -7
public const val EAI_SERVICE: CInt = -8
public const val EAI_MEMORY: CInt = -10
public const val EAI_SYSTEM: CInt = -11
public const val EAI_OVERFLOW: CInt = -12
public const val EAI_NODATA: CInt = -5
public const val EAI_ADDRFAMILY: CInt = -9
public const val EAI_INPROGRESS: CInt = -100
public const val EAI_CANCELED: CInt = -101
public const val EAI_NOTCANCELED: CInt = -102
public const val EAI_ALLDONE: CInt = -103
public const val EAI_INTR: CInt = -104
public const val EAI_IDN_ENCODE: CInt = -105
public const val NI_MAXHOST: ULong = 1025uL
public const val NI_MAXSERV: ULong = 32uL
public const val NI_NUMERICHOST: CInt = 1
public const val NI_NUMERICSERV: CInt = 2
public const val NI_NOFQDN: CInt = 4
public const val NI_NAMEREQD: CInt = 8
public const val NI_DGRAM: CInt = 16
public const val NI_IDN: CInt = 32
public const val CLOCK_REALTIME: ClockidT = 0
public const val CLOCK_MONOTONIC: ClockidT = 1
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2
public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 3
public const val CLOCK_MONOTONIC_RAW: ClockidT = 4
public const val CLOCK_REALTIME_COARSE: ClockidT = 5
public const val CLOCK_MONOTONIC_COARSE: ClockidT = 6
public const val TIMER_ABSTIME: CInt = 1
public const val TIME_UTC: CInt = 1
public const val POLLIN: Short = 1
public const val POLLPRI: Short = 2
public const val POLLOUT: Short = 4
public const val POLLRDNORM: Short = 1
public const val POLLRDBAND: Short = 2
public const val POLLWRNORM: Short = 4
public const val POLLWRBAND: Short = 4
public const val POLLERR: Short = 8
public const val POLLHUP: Short = 16
public const val POLLNVAL: Short = 32
public const val __LC_CTYPE: ULong = 0uL
public const val __LC_NUMERIC: ULong = 1uL
public const val __LC_TIME: ULong = 2uL
public const val __LC_COLLATE: ULong = 3uL
public const val __LC_MONETARY: ULong = 4uL
public const val __LC_MESSAGES: ULong = 5uL
public const val __LC_ALL: ULong = 6uL
public const val __LC_PAPER: ULong = 7uL
public const val __LC_NAME: ULong = 8uL
public const val __LC_ADDRESS: ULong = 9uL
public const val __LC_TELEPHONE: ULong = 10uL
public const val __LC_MEASUREMENT: ULong = 11uL
public const val __LC_IDENTIFICATION: ULong = 12uL
public const val LC_CTYPE: CInt = 0
public const val LC_NUMERIC: CInt = 1
public const val LC_TIME: CInt = 2
public const val LC_COLLATE: CInt = 3
public const val LC_MONETARY: CInt = 4
public const val LC_MESSAGES: CInt = 5
public const val LC_ALL: CInt = 6
public const val LC_PAPER: CInt = 7
public const val LC_NAME: CInt = 8
public const val LC_ADDRESS: CInt = 9
public const val LC_TELEPHONE: CInt = 10
public const val LC_MEASUREMENT: CInt = 11
public const val LC_IDENTIFICATION: CInt = 12
public const val LC_CTYPE_MASK: CInt = 1
public const val LC_NUMERIC_MASK: CInt = 2
public const val LC_TIME_MASK: CInt = 4
public const val LC_COLLATE_MASK: CInt = 8
public const val LC_MONETARY_MASK: CInt = 16
public const val LC_MESSAGES_MASK: CInt = 32
public const val LC_PAPER_MASK: CInt = 128
public const val LC_NAME_MASK: CInt = 256
public const val LC_ADDRESS_MASK: CInt = 512
public const val LC_TELEPHONE_MASK: CInt = 1024
public const val LC_MEASUREMENT_MASK: CInt = 2048
public const val LC_IDENTIFICATION_MASK: CInt = 4096
public const val LC_ALL_MASK: CInt = 8127
public const val ABDAY_1: NlItem = 0x20000
public const val ABDAY_2: NlItem = 0x20001
public const val ABDAY_3: NlItem = 0x20002
public const val ABDAY_4: NlItem = 0x20003
public const val ABDAY_5: NlItem = 0x20004
public const val ABDAY_6: NlItem = 0x20005
public const val ABDAY_7: NlItem = 0x20006
public const val DAY_1: NlItem = 0x20007
public const val DAY_2: NlItem = 0x20008
public const val DAY_3: NlItem = 0x20009
public const val DAY_4: NlItem = 0x2000A
public const val DAY_5: NlItem = 0x2000B
public const val DAY_6: NlItem = 0x2000C
public const val DAY_7: NlItem = 0x2000D
public const val ABMON_1: NlItem = 0x2000E
public const val ABMON_2: NlItem = 0x2000F
public const val ABMON_3: NlItem = 0x20010
public const val ABMON_4: NlItem = 0x20011
public const val ABMON_5: NlItem = 0x20012
public const val ABMON_6: NlItem = 0x20013
public const val ABMON_7: NlItem = 0x20014
public const val ABMON_8: NlItem = 0x20015
public const val ABMON_9: NlItem = 0x20016
public const val ABMON_10: NlItem = 0x20017
public const val ABMON_11: NlItem = 0x20018
public const val ABMON_12: NlItem = 0x20019
public const val MON_1: NlItem = 0x2001A
public const val MON_2: NlItem = 0x2001B
public const val MON_3: NlItem = 0x2001C
public const val MON_4: NlItem = 0x2001D
public const val MON_5: NlItem = 0x2001E
public const val MON_6: NlItem = 0x2001F
public const val MON_7: NlItem = 0x20020
public const val MON_8: NlItem = 0x20021
public const val MON_9: NlItem = 0x20022
public const val MON_10: NlItem = 0x20023
public const val MON_11: NlItem = 0x20024
public const val MON_12: NlItem = 0x20025
public const val AM_STR: NlItem = 0x20026
public const val PM_STR: NlItem = 0x20027
public const val D_T_FMT: NlItem = 0x20028
public const val D_FMT: NlItem = 0x20029
public const val T_FMT: NlItem = 0x2002A
public const val T_FMT_AMPM: NlItem = 0x2002B
public const val ERA: NlItem = 0x2002C
public const val ERA_D_FMT: NlItem = 0x2002E
public const val ALT_DIGITS: NlItem = 0x2002F
public const val ERA_D_T_FMT: NlItem = 0x20030
public const val ERA_T_FMT: NlItem = 0x20031
public const val CODESET: NlItem = 14
public const val CRNCYSTR: NlItem = 0x4000F
public const val RADIXCHAR: NlItem = 0x10000
public const val THOUSEP: NlItem = 0x10001
public const val YESEXPR: NlItem = 0x50000
public const val NOEXPR: NlItem = 0x50001
public const val YESSTR: NlItem = 0x50002
public const val NOSTR: NlItem = 0x50003
public const val RB_AUTOBOOT: CInt = 0x0
public const val RB_ASKNAME: CInt = 0x1
public const val RB_SINGLE: CInt = 0x2
public const val RB_KBD: CInt = 0x4
public const val RB_HALT: CInt = 0x8
public const val RB_INITNAME: CInt = 0x10
public const val RB_DFLTROOT: CInt = 0x20
public const val RB_NOBOOTRC: CInt = 0x20
public const val RB_ALTBOOT: CInt = 0x40
public const val RB_UNIPROC: CInt = 0x80
public const val RB_DEBUGGER: CInt = 0x1000
public const val __SIZEOF_SEM_T: ULong = 20uL
public const val IGNBRK: TcflagT = 1u
public const val BRKINT: TcflagT = 2u
public const val IGNPAR: TcflagT = 4u
public const val PARMRK: TcflagT = 8u
public const val INPCK: TcflagT = 16u
public const val ISTRIP: TcflagT = 32u
public const val INLCR: TcflagT = 64u
public const val IGNCR: TcflagT = 128u
public const val ICRNL: TcflagT = 256u
public const val IXON: TcflagT = 512u
public const val IXOFF: TcflagT = 1024u
public const val IXANY: TcflagT = 2048u
public const val IMAXBEL: TcflagT = 8192u
public const val IUCLC: TcflagT = 16384u
public const val OPOST: TcflagT = 1u
public const val ONLCR: TcflagT = 2u
public const val ONOEOT: TcflagT = 8u
public const val OCRNL: TcflagT = 16u
public const val ONOCR: TcflagT = 32u
public const val ONLRET: TcflagT = 64u
public const val NLDLY: TcflagT = 768u
public const val NL0: TcflagT = 0u
public const val NL1: TcflagT = 256u
public const val TABDLY: TcflagT = 3076u
public const val TAB0: TcflagT = 0u
public const val TAB1: TcflagT = 1024u
public const val TAB2: TcflagT = 2048u
public const val TAB3: TcflagT = 4u
public const val CRDLY: TcflagT = 12288u
public const val CR0: TcflagT = 0u
public const val CR1: TcflagT = 4096u
public const val CR2: TcflagT = 8192u
public const val CR3: TcflagT = 12288u
public const val FFDLY: TcflagT = 16384u
public const val FF0: TcflagT = 0u
public const val FF1: TcflagT = 16384u
public const val BSDLY: TcflagT = 32768u
public const val BS0: TcflagT = 0u
public const val BS1: TcflagT = 32768u
public const val VTDLY: TcflagT = 65536u
public const val VT0: TcflagT = 0u
public const val VT1: TcflagT = 65536u
public const val OLCUC: TcflagT = 131072u
public const val OFILL: TcflagT = 262144u
public const val OFDEL: TcflagT = 524288u
public const val CIGNORE: TcflagT = 1u
public const val CSIZE: TcflagT = 768u
public const val CS5: TcflagT = 0u
public const val CS6: TcflagT = 256u
public const val CS7: TcflagT = 512u
public const val CS8: TcflagT = 768u
public const val CSTOPB: TcflagT = 1024u
public const val CREAD: TcflagT = 2048u
public const val PARENB: TcflagT = 4096u
public const val PARODD: TcflagT = 8192u
public const val HUPCL: TcflagT = 16384u
public const val CLOCAL: TcflagT = 32768u
public const val CRTSCTS: TcflagT = 65536u
public const val CRTS_IFLOW: TcflagT = 65536u
public const val CCTS_OFLOW: TcflagT = 65536u
public const val CDTRCTS: TcflagT = 131072u
public const val MDMBUF: TcflagT = 1048576u
public const val CHWFLOW: TcflagT = 1245184u
public const val ECHOKE: TcflagT = 1u
public const val _ECHOE: TcflagT = 2u
public const val ECHOE: TcflagT = 2u
public const val _ECHOK: TcflagT = 4u
public const val ECHOK: TcflagT = 4u
public const val _ECHO: TcflagT = 8u
public const val ECHO: TcflagT = 8u
public const val _ECHONL: TcflagT = 16u
public const val ECHONL: TcflagT = 16u
public const val ECHOPRT: TcflagT = 32u
public const val ECHOCTL: TcflagT = 64u
public const val _ISIG: TcflagT = 128u
public const val ISIG: TcflagT = 128u
public const val _ICANON: TcflagT = 256u
public const val ICANON: TcflagT = 256u
public const val ALTWERASE: TcflagT = 512u
public const val _IEXTEN: TcflagT = 1024u
public const val IEXTEN: TcflagT = 1024u
public const val EXTPROC: TcflagT = 2048u
public const val _TOSTOP: TcflagT = 4194304u
public const val TOSTOP: TcflagT = 4194304u
public const val FLUSHO: TcflagT = 8388608u
public const val NOKERNINFO: TcflagT = 33554432u
public const val PENDIN: TcflagT = 536870912u
public const val _NOFLSH: TcflagT = 2147483648u
public const val NOFLSH: TcflagT = 2147483648u
public const val VEOF: ULong = 0uL
public const val VEOL: ULong = 1uL
public const val VEOL2: ULong = 2uL
public const val VERASE: ULong = 3uL
public const val VWERASE: ULong = 4uL
public const val VKILL: ULong = 5uL
public const val VREPRINT: ULong = 6uL
public const val VINTR: ULong = 8uL
public const val VQUIT: ULong = 9uL
public const val VSUSP: ULong = 10uL
public const val VDSUSP: ULong = 11uL
public const val VSTART: ULong = 12uL
public const val VSTOP: ULong = 13uL
public const val VLNEXT: ULong = 14uL
public const val VDISCARD: ULong = 15uL
public const val VMIN: ULong = 16uL
public const val VTIME: ULong = 17uL
public const val VSTATUS: ULong = 18uL
public const val NCCS: ULong = 20uL
public const val B0: SpeedT = 0u
public const val B50: SpeedT = 50u
public const val B75: SpeedT = 75u
public const val B110: SpeedT = 110u
public const val B134: SpeedT = 134u
public const val B150: SpeedT = 150u
public const val B200: SpeedT = 200u
public const val B300: SpeedT = 300u
public const val B600: SpeedT = 600u
public const val B1200: SpeedT = 1200u
public const val B1800: SpeedT = 1800u
public const val B2400: SpeedT = 2400u
public const val B4800: SpeedT = 4800u
public const val B9600: SpeedT = 9600u
public const val B7200: SpeedT = 7200u
public const val B14400: SpeedT = 14400u
public const val B19200: SpeedT = 19200u
public const val B28800: SpeedT = 28800u
public const val B38400: SpeedT = 38400u
public const val EXTA: SpeedT = B19200
public const val EXTB: SpeedT = B38400
public const val B57600: SpeedT = 57600u
public const val B76800: SpeedT = 76800u
public const val B115200: SpeedT = 115200u
public const val B230400: SpeedT = 230400u
public const val B460800: SpeedT = 460800u
public const val B500000: SpeedT = 500000u
public const val B576000: SpeedT = 576000u
public const val B921600: SpeedT = 921600u
public const val B1000000: SpeedT = 1000000u
public const val B1152000: SpeedT = 1152000u
public const val B1500000: SpeedT = 1500000u
public const val B2000000: SpeedT = 2000000u
public const val B2500000: SpeedT = 2500000u
public const val B3000000: SpeedT = 3000000u
public const val B3500000: SpeedT = 3500000u
public const val B4000000: SpeedT = 4000000u
public const val TCSANOW: CInt = 0
public const val TCSADRAIN: CInt = 1
public const val TCSAFLUSH: CInt = 2
public const val TCSASOFT: CInt = 16
public const val TCIFLUSH: CInt = 1
public const val TCOFLUSH: CInt = 2
public const val TCIOFLUSH: CInt = 3
public const val TCOOFF: CInt = 1
public const val TCOON: CInt = 2
public const val TCIOFF: CInt = 3
public const val TCION: CInt = 4
public const val TTYDEF_IFLAG: TcflagT = 11042u
public const val TTYDEF_LFLAG: TcflagT = 1483u
public const val TTYDEF_CFLAG: TcflagT = 23040u
public const val TTYDEF_SPEED: TcflagT = 9600u
public const val CEOL: UByte = 0u
public val CERASE: UByte = (127).toUByte()
public val CMIN: UByte = (1).toUByte()
public val CQUIT: UByte = (28).toUByte()
public val CTIME: UByte = (0).toUByte()
public const val CBRK: UByte = 0u
public const val RTLD_LAZY: CInt = 1
public const val RTLD_NOW: CInt = 2
public const val RTLD_BINDING_MASK: CInt = 3
public const val RTLD_NOLOAD: CInt = 4
public const val RTLD_DEEPBIND: CInt = 8
public const val RTLD_GLOBAL: CInt = 256
public const val RTLD_LOCAL: CInt = 0
public const val RTLD_NODELETE: CInt = 4096
public const val DLFO_STRUCT_HAS_EH_DBASE: ULong = 1uL
public const val DLFO_STRUCT_HAS_EH_COUNT: ULong = 0uL
public const val LM_ID_BASE: CLong = 0
public const val LM_ID_NEWLM: CLong = -1
public const val SIGINT: CInt = 2
public const val SIGILL: CInt = 4
public const val SIGABRT: CInt = 6
public const val SIGFPE: CInt = 8
public const val SIGSEGV: CInt = 11
public const val SIGTERM: CInt = 15
public const val SIGHUP: CInt = 1
public const val SIGQUIT: CInt = 3
public const val SIGTRAP: CInt = 5
public const val SIGKILL: CInt = 9
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGIOT: CInt = 6
public const val SIGBUS: CInt = 10
public const val SIGSYS: CInt = 12
public const val SIGEMT: CInt = 7
public const val SIGINFO: CInt = 29
public const val SIGLOST: CInt = 32
public const val SIGURG: CInt = 16
public const val SIGSTOP: CInt = 17
public const val SIGTSTP: CInt = 18
public const val SIGCONT: CInt = 19
public const val SIGCHLD: CInt = 20
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGPOLL: CInt = 23
public const val SIGXCPU: CInt = 24
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGXFSZ: CInt = 25
public const val SIGUSR1: CInt = 30
public const val SIGUSR2: CInt = 31
public const val SIGWINCH: CInt = 28
public const val SIGIO: CInt = 23
public const val SIGCLD: CInt = 20
public const val __SIGRTMIN: ULong = 32uL
public const val __SIGRTMAX: ULong = 32uL
public const val _NSIG: ULong = 33uL
public const val NSIG: ULong = 33uL
public const val SA_ONSTACK: CInt = 1
public const val SA_RESTART: CInt = 2
public const val SA_NODEFER: CInt = 16
public const val SA_RESETHAND: CInt = 4
public const val SA_NOCLDSTOP: CInt = 8
public const val SA_SIGINFO: CInt = 64
public const val SA_INTERRUPT: CInt = 0
public const val SA_NOMASK: CInt = 16
public const val SA_ONESHOT: CInt = 4
public const val SA_STACK: CInt = 1
public const val SIG_BLOCK: CInt = 1
public const val SIG_UNBLOCK: CInt = 2
public const val SIG_SETMASK: CInt = 3
public val FPC_IE: UShort = (1).toUShort()
public val FPC_IM: UShort = (1).toUShort()
public val FPC_DE: UShort = (2).toUShort()
public val FPC_DM: UShort = (2).toUShort()
public val FPC_ZE: UShort = (4).toUShort()
public val FPC_ZM: UShort = (4).toUShort()
public val FPC_OE: UShort = (8).toUShort()
public val FPC_OM: UShort = (8).toUShort()
public val FPC_UE: UShort = (16).toUShort()
public val FPC_PE: UShort = (32).toUShort()
public val FPC_PC: UShort = (768).toUShort()
public val FPC_PC_24: UShort = (0).toUShort()
public val FPC_PC_53: UShort = (512).toUShort()
public val FPC_PC_64: UShort = (768).toUShort()
public val FPC_RC: UShort = (3072).toUShort()
public val FPC_RC_RN: UShort = (0).toUShort()
public val FPC_RC_RD: UShort = (1024).toUShort()
public val FPC_RC_RU: UShort = (2048).toUShort()
public val FPC_RC_CHOP: UShort = (3072).toUShort()
public val FPC_IC: UShort = (4096).toUShort()
public val FPC_IC_PROJ: UShort = (0).toUShort()
public val FPC_IC_AFF: UShort = (4096).toUShort()
public val FPS_IE: UShort = (1).toUShort()
public val FPS_DE: UShort = (2).toUShort()
public val FPS_ZE: UShort = (4).toUShort()
public val FPS_OE: UShort = (8).toUShort()
public val FPS_UE: UShort = (16).toUShort()
public val FPS_PE: UShort = (32).toUShort()
public val FPS_SF: UShort = (64).toUShort()
public val FPS_ES: UShort = (128).toUShort()
public val FPS_C0: UShort = (256).toUShort()
public val FPS_C1: UShort = (512).toUShort()
public val FPS_C2: UShort = (1024).toUShort()
public val FPS_TOS: UShort = (14336).toUShort()
public val FPS_TOS_SHIFT: UShort = (11).toUShort()
public val FPS_C3: UShort = (16384).toUShort()
public val FPS_BUSY: UShort = (32768).toUShort()
public const val FPE_INTOVF_TRAP: CInt = 1
public const val FPE_INTDIV_FAULT: CInt = 2
public const val FPE_FLTOVF_FAULT: CInt = 3
public const val FPE_FLTDIV_FAULT: CInt = 4
public const val FPE_FLTUND_FAULT: CInt = 5
public const val FPE_SUBRNG_FAULT: CInt = 7
public const val FPE_FLTDNR_FAULT: CInt = 8
public const val FPE_FLTINX_FAULT: CInt = 9
public const val FPE_EMERR_FAULT: CInt = 10
public const val FPE_EMBND_FAULT: CInt = 11
public const val ILL_INVOPR_FAULT: CInt = 1
public const val ILL_STACK_FAULT: CInt = 2
public const val ILL_FPEOPR_FAULT: CInt = 3
public const val DBG_SINGLE_TRAP: CInt = 1
public const val DBG_BRKPNT_FAULT: CInt = 2
public const val __NGREG: ULong = 19uL
public const val NGREG: ULong = 19uL
public const val MINSIGSTKSZ: ULong = 8192uL
public const val SIGSTKSZ: ULong = 40960uL
public const val __S_IFMT: ModeT = 61440
public const val __S_IFDIR: ModeT = 16384
public const val __S_IFCHR: ModeT = 8192
public const val __S_IFBLK: ModeT = 24576
public const val __S_IFREG: ModeT = 32768
public const val __S_IFLNK: ModeT = 40960
public const val __S_IFSOCK: ModeT = 49152
public const val __S_IFIFO: ModeT = 4096
public const val __S_ISUID: ModeT = 2048
public const val __S_ISGID: ModeT = 1024
public const val __S_ISVTX: ModeT = 512
public const val __S_IREAD: ModeT = 256
public const val __S_IWRITE: ModeT = 128
public const val __S_IEXEC: ModeT = 64
public const val S_INOCACHE: ModeT = 65536
public const val S_IUSEUNK: ModeT = 131072
public const val S_IUNKNOWN: ModeT = 1835008
public const val S_IUNKSHIFT: ModeT = 12
public const val S_IPTRANS: ModeT = 2097152
public const val S_IATRANS: ModeT = 4194304
public const val S_IROOT: ModeT = 8388608
public const val S_ITRANS: ModeT = 14680064
public const val S_IMMAP0: ModeT = 16777216
public const val CMASK: ModeT = 18
public const val UF_SETTABLE: CUInt = 65535u
public const val UF_NODUMP: CUInt = 1u
public const val UF_IMMUTABLE: CUInt = 2u
public const val UF_APPEND: CUInt = 4u
public const val UF_OPAQUE: CUInt = 8u
public const val UF_NOUNLINK: CUInt = 16u
public const val SF_SETTABLE: CUInt = 4294901760u
public const val SF_ARCHIVED: CUInt = 65536u
public const val SF_IMMUTABLE: CUInt = 131072u
public const val SF_APPEND: CUInt = 262144u
public const val SF_NOUNLINK: CUInt = 1048576u
public const val SF_SNAPSHOT: CUInt = 2097152u
public const val UTIME_NOW: CLong = -1
public const val UTIME_OMIT: CLong = -2
public const val S_IFMT: ModeT = 61440
public const val S_IFDIR: ModeT = 16384
public const val S_IFCHR: ModeT = 8192
public const val S_IFBLK: ModeT = 24576
public const val S_IFREG: ModeT = 32768
public const val S_IFIFO: ModeT = 4096
public const val S_IFLNK: ModeT = 40960
public const val S_IFSOCK: ModeT = 49152
public const val S_ISUID: ModeT = 2048
public const val S_ISGID: ModeT = 1024
public const val S_ISVTX: ModeT = 512
public const val S_IRUSR: ModeT = 256
public const val S_IWUSR: ModeT = 128
public const val S_IXUSR: ModeT = 64
public const val S_IRWXU: ModeT = 448
public const val S_IREAD: ModeT = 256
public const val S_IWRITE: ModeT = 128
public const val S_IEXEC: ModeT = 64
public const val S_IRGRP: ModeT = 32
public const val S_IWGRP: ModeT = 16
public const val S_IXGRP: ModeT = 8
public const val S_IRWXG: ModeT = 56
public const val S_IROTH: ModeT = 4
public const val S_IWOTH: ModeT = 2
public const val S_IXOTH: ModeT = 1
public const val S_IRWXO: ModeT = 7
public const val ACCESSPERMS: ModeT = 511
public const val ALLPERMS: ModeT = 4095
public const val DEFFILEMODE: ModeT = 438
public const val S_BLKSIZE: ULong = 512uL
public const val STATX_TYPE: CUInt = 1u
public const val STATX_MODE: CUInt = 2u
public const val STATX_NLINK: CUInt = 4u
public const val STATX_UID: CUInt = 8u
public const val STATX_GID: CUInt = 16u
public const val STATX_ATIME: CUInt = 32u
public const val STATX_MTIME: CUInt = 64u
public const val STATX_CTIME: CUInt = 128u
public const val STATX_INO: CUInt = 256u
public const val STATX_SIZE: CUInt = 512u
public const val STATX_BLOCKS: CUInt = 1024u
public const val STATX_BASIC_STATS: CUInt = 2047u
public const val STATX_ALL: CUInt = 4095u
public const val STATX_BTIME: CUInt = 2048u
public const val STATX_MNT_ID: CUInt = 4096u
public const val STATX_DIOALIGN: CUInt = 8192u
public const val STATX__RESERVED: CUInt = 2147483648u
public const val STATX_ATTR_COMPRESSED: CUInt = 4u
public const val STATX_ATTR_IMMUTABLE: CUInt = 16u
public const val STATX_ATTR_APPEND: CUInt = 32u
public const val STATX_ATTR_NODUMP: CUInt = 64u
public const val STATX_ATTR_ENCRYPTED: CUInt = 2048u
public const val STATX_ATTR_AUTOMOUNT: CUInt = 4096u
public const val STATX_ATTR_MOUNT_ROOT: CUInt = 8192u
public const val STATX_ATTR_VERITY: CUInt = 1048576u
public const val STATX_ATTR_DAX: CUInt = 2097152u
public const val TIOCM_LE: CInt = 1
public const val TIOCM_DTR: CInt = 2
public const val TIOCM_RTS: CInt = 4
public const val TIOCM_ST: CInt = 8
public const val TIOCM_SR: CInt = 16
public const val TIOCM_CTS: CInt = 32
public const val TIOCM_CAR: CInt = 64
public const val TIOCM_CD: CInt = 64
public const val TIOCM_RNG: CInt = 128
public const val TIOCM_RI: CInt = 128
public const val TIOCM_DSR: CInt = 256
public const val TIOCPKT_DATA: CInt = 0
public const val TIOCPKT_FLUSHREAD: CInt = 1
public const val TIOCPKT_FLUSHWRITE: CInt = 2
public const val TIOCPKT_STOP: CInt = 4
public const val TIOCPKT_START: CInt = 8
public const val TIOCPKT_NOSTOP: CInt = 16
public const val TIOCPKT_DOSTOP: CInt = 32
public const val TIOCPKT_IOCTL: CInt = 64
public const val TTYDISC: CInt = 0
public const val TABLDISC: CInt = 3
public const val SLIPDISC: CInt = 4
public const val TANDEM: TcflagT = 1u
public const val CBREAK: TcflagT = 2u
public const val LCASE: TcflagT = 4u
public const val CRMOD: TcflagT = 16u
public const val RAW: TcflagT = 32u
public const val ODDP: TcflagT = 64u
public const val EVENP: TcflagT = 128u
public const val ANYP: TcflagT = 192u
public const val NLDELAY: TcflagT = 768u
public const val NL2: TcflagT = 512u
public const val NL3: TcflagT = 768u
public const val TBDELAY: TcflagT = 3072u
public const val XTABS: TcflagT = 3072u
public const val CRDELAY: TcflagT = 12288u
public const val VTDELAY: TcflagT = 16384u
public const val BSDELAY: TcflagT = 32768u
public const val ALLDELAY: TcflagT = 65280u
public const val CRTBS: TcflagT = 65536u
public const val PRTERA: TcflagT = 131072u
public const val CRTERA: TcflagT = 262144u
public const val TILDE: TcflagT = 524288u
public const val LITOUT: TcflagT = 2097152u
public const val NOHANG: TcflagT = 16777216u
public const val L001000: TcflagT = 33554432u
public const val CRTKIL: TcflagT = 67108864u
public const val PASS8: TcflagT = 134217728u
public const val CTLECH: TcflagT = 268435456u
public const val DECCTQ: TcflagT = 1073741824u
public const val FIONBIO: CULong = 0xa008007euL
public const val FIONREAD: CULong = 0x6008007fuL
public const val TIOCSWINSZ: CULong = 0x90200767uL
public const val TIOCGWINSZ: CULong = 0x50200768uL
public const val TIOCEXCL: CULong = 0x70duL
public const val TIOCNXCL: CULong = 0x70euL
public const val TIOCSCTTY: CULong = 0x761uL
public const val FIOCLEX: CULong = 1uL
public const val O_EXEC: CInt = 4
public const val O_NORW: CInt = 0
public const val O_RDONLY: CInt = 1
public const val O_WRONLY: CInt = 2
public const val O_RDWR: CInt = 3
public const val O_ACCMODE: CInt = 3
public const val O_LARGEFILE: CInt = 0
public const val O_CREAT: CInt = 16
public const val O_EXCL: CInt = 32
public const val O_NOLINK: CInt = 64
public const val O_NOTRANS: CInt = 128
public const val O_NOFOLLOW: CInt = 1048576
public const val O_DIRECTORY: CInt = 2097152
public const val O_APPEND: CInt = 256
public const val O_ASYNC: CInt = 512
public const val O_FSYNC: CInt = 1024
public const val O_SYNC: CInt = 1024
public const val O_NOATIME: CInt = 2048
public const val O_SHLOCK: CInt = 131072
public const val O_EXLOCK: CInt = 262144
public const val O_DSYNC: CInt = 1024
public const val O_RSYNC: CInt = 1024
public const val O_NONBLOCK: CInt = 8
public const val O_NDELAY: CInt = 8
public const val O_HURD: CInt = 458751
public const val O_TRUNC: CInt = 65536
public const val O_CLOEXEC: CInt = 4194304
public const val O_IGNORE_CTTY: CInt = 524288
public const val O_TMPFILE: CInt = 8388608
public const val O_NOCTTY: CInt = 0
public const val FREAD: CInt = 1
public const val FWRITE: CInt = 2
public const val FASYNC: CInt = 512
public const val FCREAT: CInt = 16
public const val FEXCL: CInt = 32
public const val FTRUNC: CInt = 65536
public const val FNOCTTY: CInt = 0
public const val FFSYNC: CInt = 1024
public const val FSYNC: CInt = 1024
public const val FAPPEND: CInt = 256
public const val FNONBLOCK: CInt = 8
public const val FNDELAY: CInt = 8
public const val F_DUPFD: CInt = 0
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val F_GETOWN: CInt = 5
public const val F_SETOWN: CInt = 6
public const val F_GETLK: CInt = 7
public const val F_SETLK: CInt = 8
public const val F_SETLKW: CInt = 9
public const val F_GETLK64: CInt = 10
public const val F_SETLK64: CInt = 11
public const val F_SETLKW64: CInt = 12
public const val F_DUPFD_CLOEXEC: CInt = 1030
public const val FD_CLOEXEC: CInt = 1
public const val F_RDLCK: CInt = 1
public const val F_WRLCK: CInt = 2
public const val F_UNLCK: CInt = 3
public const val POSIX_FADV_NORMAL: CInt = 0
public const val POSIX_FADV_RANDOM: CInt = 1
public const val POSIX_FADV_SEQUENTIAL: CInt = 2
public const val POSIX_FADV_WILLNEED: CInt = 3
public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val AT_FDCWD: CInt = -100
public const val AT_SYMLINK_NOFOLLOW: CInt = 256
public const val AT_REMOVEDIR: CInt = 512
public const val AT_SYMLINK_FOLLOW: CInt = 1024
public const val AT_NO_AUTOMOUNT: CInt = 2048
public const val AT_EMPTY_PATH: CInt = 4096
public const val AT_STATX_SYNC_TYPE: CInt = 24576
public const val AT_STATX_SYNC_AS_STAT: CInt = 0
public const val AT_STATX_FORCE_SYNC: CInt = 8192
public const val AT_STATX_DONT_SYNC: CInt = 16384
public const val AT_RECURSIVE: CInt = 32768
public const val AT_EACCESS: CInt = 512
public const val RWF_HIPRI: CInt = 1
public const val RWF_DSYNC: CInt = 2
public const val RWF_SYNC: CInt = 4
public const val RWF_NOWAIT: CInt = 8
public const val RWF_APPEND: CInt = 16
public const val EPERM: CInt = 1073741825
public const val ENOENT: CInt = 1073741826
public const val ESRCH: CInt = 1073741827
public const val EINTR: CInt = 1073741828
public const val EIO: CInt = 1073741829
public const val ENXIO: CInt = 1073741830
public const val E2BIG: CInt = 1073741831
public const val ENOEXEC: CInt = 1073741832
public const val EBADF: CInt = 1073741833
public const val ECHILD: CInt = 1073741834
public const val EDEADLK: CInt = 1073741835
public const val ENOMEM: CInt = 1073741836
public const val EACCES: CInt = 1073741837
public const val EFAULT: CInt = 1073741838
public const val ENOTBLK: CInt = 1073741839
public const val EBUSY: CInt = 1073741840
public const val EEXIST: CInt = 1073741841
public const val EXDEV: CInt = 1073741842
public const val ENODEV: CInt = 1073741843
public const val ENOTDIR: CInt = 1073741844
public const val EISDIR: CInt = 1073741845
public const val EINVAL: CInt = 1073741846
public const val EMFILE: CInt = 1073741848
public const val ENFILE: CInt = 1073741847
public const val ENOTTY: CInt = 1073741849
public const val ETXTBSY: CInt = 1073741850
public const val EFBIG: CInt = 1073741851
public const val ENOSPC: CInt = 1073741852
public const val ESPIPE: CInt = 1073741853
public const val EROFS: CInt = 1073741854
public const val EMLINK: CInt = 1073741855
public const val EPIPE: CInt = 1073741856
public const val EDOM: CInt = 1073741857
public const val ERANGE: CInt = 1073741858
public const val EAGAIN: CInt = 1073741859
public const val EWOULDBLOCK: CInt = 1073741859
public const val EINPROGRESS: CInt = 1073741860
public const val EALREADY: CInt = 1073741861
public const val ENOTSOCK: CInt = 1073741862
public const val EMSGSIZE: CInt = 1073741864
public const val EPROTOTYPE: CInt = 1073741865
public const val ENOPROTOOPT: CInt = 1073741866
public const val EPROTONOSUPPORT: CInt = 1073741867
public const val ESOCKTNOSUPPORT: CInt = 1073741868
public const val EOPNOTSUPP: CInt = 1073741869
public const val EPFNOSUPPORT: CInt = 1073741870
public const val EAFNOSUPPORT: CInt = 1073741871
public const val EADDRINUSE: CInt = 1073741872
public const val EADDRNOTAVAIL: CInt = 1073741873
public const val ENETDOWN: CInt = 1073741874
public const val ENETUNREACH: CInt = 1073741875
public const val ENETRESET: CInt = 1073741876
public const val ECONNABORTED: CInt = 1073741877
public const val ECONNRESET: CInt = 1073741878
public const val ENOBUFS: CInt = 1073741879
public const val EISCONN: CInt = 1073741880
public const val ENOTCONN: CInt = 1073741881
public const val EDESTADDRREQ: CInt = 1073741863
public const val ESHUTDOWN: CInt = 1073741882
public const val ETOOMANYREFS: CInt = 1073741883
public const val ETIMEDOUT: CInt = 1073741884
public const val ECONNREFUSED: CInt = 1073741885
public const val ELOOP: CInt = 1073741886
public const val ENAMETOOLONG: CInt = 1073741887
public const val EHOSTDOWN: CInt = 1073741888
public const val EHOSTUNREACH: CInt = 1073741889
public const val ENOTEMPTY: CInt = 1073741890
public const val EPROCLIM: CInt = 1073741891
public const val EUSERS: CInt = 1073741892
public const val EDQUOT: CInt = 1073741893
public const val ESTALE: CInt = 1073741894
public const val EREMOTE: CInt = 1073741895
public const val EBADRPC: CInt = 1073741896
public const val ERPCMISMATCH: CInt = 1073741897
public const val EPROGUNAVAIL: CInt = 1073741898
public const val EPROGMISMATCH: CInt = 1073741899
public const val EPROCUNAVAIL: CInt = 1073741900
public const val ENOLCK: CInt = 1073741901
public const val EFTYPE: CInt = 1073741903
public const val EAUTH: CInt = 1073741904
public const val ENEEDAUTH: CInt = 1073741905
public const val ENOSYS: CInt = 1073741902
public const val ELIBEXEC: CInt = 1073741907
public const val ENOTSUP: CInt = 1073741942
public const val EILSEQ: CInt = 1073741930
public const val EBACKGROUND: CInt = 1073741924
public const val EDIED: CInt = 1073741925
public const val EGREGIOUS: CInt = 1073741927
public const val EIEIO: CInt = 1073741928
public const val EGRATUITOUS: CInt = 1073741929
public const val EBADMSG: CInt = 1073741931
public const val EIDRM: CInt = 1073741932
public const val EMULTIHOP: CInt = 1073741933
public const val ENODATA: CInt = 1073741934
public const val ENOLINK: CInt = 1073741935
public const val ENOMSG: CInt = 1073741936
public const val ENOSR: CInt = 1073741937
public const val ENOSTR: CInt = 1073741938
public const val EOVERFLOW: CInt = 1073741939
public const val EPROTO: CInt = 1073741940
public const val ETIME: CInt = 1073741941
public const val ECANCELED: CInt = 1073741943
public const val EOWNERDEAD: CInt = 1073741944
public const val ENOTRECOVERABLE: CInt = 1073741945
public const val EMACH_SEND_IN_PROGRESS: CInt = 268435457
public const val EMACH_SEND_INVALID_DATA: CInt = 268435458
public const val EMACH_SEND_INVALID_DEST: CInt = 268435459
public const val EMACH_SEND_TIMED_OUT: CInt = 268435460
public const val EMACH_SEND_WILL_NOTIFY: CInt = 268435461
public const val EMACH_SEND_NOTIFY_IN_PROGRESS: CInt = 268435462
public const val EMACH_SEND_INTERRUPTED: CInt = 268435463
public const val EMACH_SEND_MSG_TOO_SMALL: CInt = 268435464
public const val EMACH_SEND_INVALID_REPLY: CInt = 268435465
public const val EMACH_SEND_INVALID_RIGHT: CInt = 268435466
public const val EMACH_SEND_INVALID_NOTIFY: CInt = 268435467
public const val EMACH_SEND_INVALID_MEMORY: CInt = 268435468
public const val EMACH_SEND_NO_BUFFER: CInt = 268435469
public const val EMACH_SEND_NO_NOTIFY: CInt = 268435470
public const val EMACH_SEND_INVALID_TYPE: CInt = 268435471
public const val EMACH_SEND_INVALID_HEADER: CInt = 268435472
public const val EMACH_RCV_IN_PROGRESS: CInt = 268451841
public const val EMACH_RCV_INVALID_NAME: CInt = 268451842
public const val EMACH_RCV_TIMED_OUT: CInt = 268451843
public const val EMACH_RCV_TOO_LARGE: CInt = 268451844
public const val EMACH_RCV_INTERRUPTED: CInt = 268451845
public const val EMACH_RCV_PORT_CHANGED: CInt = 268451846
public const val EMACH_RCV_INVALID_NOTIFY: CInt = 268451847
public const val EMACH_RCV_INVALID_DATA: CInt = 268451848
public const val EMACH_RCV_PORT_DIED: CInt = 268451849
public const val EMACH_RCV_IN_SET: CInt = 268451850
public const val EMACH_RCV_HEADER_ERROR: CInt = 268451851
public const val EMACH_RCV_BODY_ERROR: CInt = 268451852
public const val EKERN_INVALID_ADDRESS: CInt = 1
public const val EKERN_PROTECTION_FAILURE: CInt = 2
public const val EKERN_NO_SPACE: CInt = 3
public const val EKERN_INVALID_ARGUMENT: CInt = 4
public const val EKERN_FAILURE: CInt = 5
public const val EKERN_RESOURCE_SHORTAGE: CInt = 6
public const val EKERN_NOT_RECEIVER: CInt = 7
public const val EKERN_NO_ACCESS: CInt = 8
public const val EKERN_MEMORY_FAILURE: CInt = 9
public const val EKERN_MEMORY_ERROR: CInt = 10
public const val EKERN_NOT_IN_SET: CInt = 12
public const val EKERN_NAME_EXISTS: CInt = 13
public const val EKERN_ABORTED: CInt = 14
public const val EKERN_INVALID_NAME: CInt = 15
public const val EKERN_INVALID_TASK: CInt = 16
public const val EKERN_INVALID_RIGHT: CInt = 17
public const val EKERN_INVALID_VALUE: CInt = 18
public const val EKERN_UREFS_OVERFLOW: CInt = 19
public const val EKERN_INVALID_CAPABILITY: CInt = 20
public const val EKERN_RIGHT_EXISTS: CInt = 21
public const val EKERN_INVALID_HOST: CInt = 22
public const val EKERN_MEMORY_PRESENT: CInt = 23
public const val EKERN_WRITE_PROTECTION_FAILURE: CInt = 24
public const val EKERN_TERMINATED: CInt = 26
public const val EKERN_TIMEDOUT: CInt = 27
public const val EKERN_INTERRUPTED: CInt = 28
public const val EMIG_TYPE_ERROR: CInt = -300
public const val EMIG_REPLY_MISMATCH: CInt = -301
public const val EMIG_REMOTE_ERROR: CInt = -302
public const val EMIG_BAD_ID: CInt = -303
public const val EMIG_BAD_ARGUMENTS: CInt = -304
public const val EMIG_NO_REPLY: CInt = -305
public const val EMIG_EXCEPTION: CInt = -306
public const val EMIG_ARRAY_TOO_LARGE: CInt = -307
public const val EMIG_SERVER_DIED: CInt = -308
public const val EMIG_DESTROY_REQUEST: CInt = -309
public const val ED_IO_ERROR: CInt = 2500
public const val ED_WOULD_BLOCK: CInt = 2501
public const val ED_NO_SUCH_DEVICE: CInt = 2502
public const val ED_ALREADY_OPEN: CInt = 2503
public const val ED_DEVICE_DOWN: CInt = 2504
public const val ED_INVALID_OPERATION: CInt = 2505
public const val ED_INVALID_RECNUM: CInt = 2506
public const val ED_INVALID_SIZE: CInt = 2507
public const val ED_NO_MEMORY: CInt = 2508
public const val ED_READ_ONLY: CInt = 2509
public const val _HURD_ERRNOS: ULong = 122uL
public const val SCHED_OTHER: CInt = 0
public const val SCHED_FIFO: CInt = 1
public const val SCHED_RR: CInt = 2
public const val _BITS_TYPES_STRUCT_SCHED_PARAM: ULong = 1uL
public const val __CPU_SETSIZE: ULong = 1024uL
public const val CPU_SETSIZE: ULong = 1024uL
public const val PTHREAD_SPINLOCK_INITIALIZER: CInt = 0
public const val PTHREAD_CANCEL_DISABLE: CInt = 0
public const val PTHREAD_CANCEL_ENABLE: CInt = 1
public const val PTHREAD_CANCEL_DEFERRED: CInt = 0
public const val PTHREAD_CANCEL_ASYNCHRONOUS: CInt = 1
public const val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1
public const val TCP_NODELAY: CInt = 1
public const val TCP_MAXSEG: CInt = 2
public const val TCP_CORK: CInt = 3
public const val TCP_KEEPIDLE: CInt = 4
public const val TCP_KEEPINTVL: CInt = 5
public const val TCP_KEEPCNT: CInt = 6
public const val TCP_SYNCNT: CInt = 7
public const val TCP_LINGER2: CInt = 8
public const val TCP_DEFER_ACCEPT: CInt = 9
public const val TCP_WINDOW_CLAMP: CInt = 10
public const val TCP_INFO: CInt = 11
public const val TCP_QUICKACK: CInt = 12
public const val TCP_CONGESTION: CInt = 13
public const val TCP_MD5SIG: CInt = 14
public const val TCP_COOKIE_TRANSACTIONS: CInt = 15
public const val TCP_THIN_LINEAR_TIMEOUTS: CInt = 16
public const val TCP_THIN_DUPACK: CInt = 17
public const val TCP_USER_TIMEOUT: CInt = 18
public const val TCP_REPAIR: CInt = 19
public const val TCP_REPAIR_QUEUE: CInt = 20
public const val TCP_QUEUE_SEQ: CInt = 21
public const val TCP_REPAIR_OPTIONS: CInt = 22
public const val TCP_FASTOPEN: CInt = 23
public const val TCP_TIMESTAMP: CInt = 24
public const val TCP_NOTSENT_LOWAT: CInt = 25
public const val TCP_CC_INFO: CInt = 26
public const val TCP_SAVE_SYN: CInt = 27
public const val TCP_SAVED_SYN: CInt = 28
public const val TCP_REPAIR_WINDOW: CInt = 29
public const val TCP_FASTOPEN_CONNECT: CInt = 30
public const val TCP_ULP: CInt = 31
public const val TCP_MD5SIG_EXT: CInt = 32
public const val TCP_FASTOPEN_KEY: CInt = 33
public const val TCP_FASTOPEN_NO_COOKIE: CInt = 34
public const val TCP_ZEROCOPY_RECEIVE: CInt = 35
public const val TCP_INQ: CInt = 36
public const val TCP_CM_INQ: CInt = 36
public const val TCP_TX_DELAY: CInt = 37
public const val TCP_REPAIR_ON: CInt = 1
public const val TCP_REPAIR_OFF: CInt = 0
public const val TCP_REPAIR_OFF_NO_WP: CInt = -1
public const val INT8_MIN: Byte = -128
public const val INT16_MIN: Short = -32768
public const val INT32_MIN: Int = -2147483648
public const val INT8_MAX: Byte = 127
public const val INT16_MAX: Short = 32767
public const val INT32_MAX: Int = 2147483647
public val UINT8_MAX: UByte = (255).toUByte()
public val UINT16_MAX: UShort = (65535).toUShort()
public const val UINT32_MAX: UInt = 4294967295u
public const val INT_LEAST8_MIN: IntLeast8T = -128
public const val INT_LEAST16_MIN: IntLeast16T = -32768
public const val INT_LEAST32_MIN: IntLeast32T = -2147483648
public const val INT_LEAST8_MAX: IntLeast8T = 127
public const val INT_LEAST16_MAX: IntLeast16T = 32767
public const val INT_LEAST32_MAX: IntLeast32T = 2147483647
public const val UINT_LEAST8_MAX: UintLeast8T = 255
public const val UINT_LEAST16_MAX: UintLeast16T = 65535
public const val UINT_LEAST32_MAX: UintLeast32T = 4294967295
public const val INT_FAST8_MIN: IntFast8T = -128
public const val INT_FAST16_MIN: IntFast16T = -2147483648
public const val INT_FAST32_MIN: IntFast32T = -2147483648
public const val INT_FAST8_MAX: IntFast8T = 127
public const val INT_FAST16_MAX: IntFast16T = 2147483647
public const val INT_FAST32_MAX: IntFast32T = 2147483647
public const val UINT_FAST8_MAX: UintFast8T = 255
public const val UINT_FAST16_MAX: UintFast16T = 4294967295uL
public const val UINT_FAST32_MAX: UintFast32T = 4294967295uL
public const val INTPTR_MIN: IntptrT = -2147483648
public const val INTPTR_MAX: IntptrT = 2147483647
public const val UINTPTR_MAX: ULong = 4294967295uL
public const val PTRDIFF_MIN: PtrdiffT = -2147483648
public const val PTRDIFF_MAX: PtrdiffT = 2147483647
public const val SIG_ATOMIC_MIN: SigAtomicT = -2147483648
public const val SIG_ATOMIC_MAX: SigAtomicT = 2147483647
public const val SIZE_MAX: ULong = 4294967295uL
public const val WINT_MIN: WintT = 0u
public const val WINT_MAX: WintT = 4294967295u
public const val INT8_WIDTH: ULong = 8uL
public const val UINT8_WIDTH: ULong = 8uL
public const val INT16_WIDTH: ULong = 16uL
public const val UINT16_WIDTH: ULong = 16uL
public const val INT32_WIDTH: ULong = 32uL
public const val UINT32_WIDTH: ULong = 32uL
public const val INT64_WIDTH: ULong = 64uL
public const val UINT64_WIDTH: ULong = 64uL
public const val INT_LEAST8_WIDTH: ULong = 8uL
public const val UINT_LEAST8_WIDTH: ULong = 8uL
public const val INT_LEAST16_WIDTH: ULong = 16uL
public const val UINT_LEAST16_WIDTH: ULong = 16uL
public const val INT_LEAST32_WIDTH: ULong = 32uL
public const val UINT_LEAST32_WIDTH: ULong = 32uL
public const val INT_LEAST64_WIDTH: ULong = 64uL
public const val UINT_LEAST64_WIDTH: ULong = 64uL
public const val INT_FAST8_WIDTH: ULong = 8uL
public const val UINT_FAST8_WIDTH: ULong = 8uL
public const val INT_FAST16_WIDTH: ULong = 32uL
public const val UINT_FAST16_WIDTH: ULong = 32uL
public const val INT_FAST32_WIDTH: ULong = 32uL
public const val UINT_FAST32_WIDTH: ULong = 32uL
public const val INT_FAST64_WIDTH: ULong = 64uL
public const val UINT_FAST64_WIDTH: ULong = 64uL
public const val INTPTR_WIDTH: ULong = 32uL
public const val UINTPTR_WIDTH: ULong = 32uL
public const val INTMAX_WIDTH: ULong = 64uL
public const val UINTMAX_WIDTH: ULong = 64uL
public const val PTRDIFF_WIDTH: ULong = 32uL
public const val SIG_ATOMIC_WIDTH: ULong = 32uL
public const val SIZE_WIDTH: ULong = 32uL
public const val WCHAR_WIDTH: ULong = 32uL
public const val WINT_WIDTH: ULong = 32uL
public val TH_FIN: UByte = (1).toUByte()
public val TH_SYN: UByte = (2).toUByte()
public val TH_RST: UByte = (4).toUByte()
public val TH_PUSH: UByte = (8).toUByte()
public val TH_ACK: UByte = (16).toUByte()
public val TH_URG: UByte = (32).toUByte()
public val TCPOPT_EOL: UByte = (0).toUByte()
public val TCPOPT_NOP: UByte = (1).toUByte()
public val TCPOPT_MAXSEG: UByte = (2).toUByte()
public val TCPOLEN_MAXSEG: UByte = (4).toUByte()
public val TCPOPT_WINDOW: UByte = (3).toUByte()
public val TCPOLEN_WINDOW: UByte = (3).toUByte()
public val TCPOPT_SACK_PERMITTED: UByte = (4).toUByte()
public val TCPOLEN_SACK_PERMITTED: UByte = (2).toUByte()
public val TCPOPT_SACK: UByte = (5).toUByte()
public val TCPOPT_TIMESTAMP: UByte = (8).toUByte()
public val TCPOLEN_TIMESTAMP: UByte = (10).toUByte()
public val TCPOLEN_TSTAMP_APPA: UByte = (12).toUByte()
public const val TCPOPT_TSTAMP_HDR: UInt = 16844810u
public const val TCP_MSS: ULong = 512uL
public const val TCP_MAXWIN: ULong = 65535uL
public const val TCP_MAX_WINSHIFT: ULong = 14uL
public val TCPI_OPT_TIMESTAMPS: UByte = (1).toUByte()
public val TCPI_OPT_SACK: UByte = (2).toUByte()
public val TCPI_OPT_WSCALE: UByte = (4).toUByte()
public val TCPI_OPT_ECN: UByte = (8).toUByte()
public val TCPI_OPT_ECN_SEEN: UByte = (16).toUByte()
public val TCPI_OPT_SYN_DATA: UByte = (32).toUByte()
public const val TCP_MD5SIG_MAXKEYLEN: ULong = 80uL
public const val TCP_MD5SIG_FLAG_PREFIX: ULong = 1uL
public const val TCP_COOKIE_MIN: ULong = 8uL
public const val TCP_COOKIE_MAX: ULong = 16uL
public const val TCP_COOKIE_PAIR_SIZE: ULong = 32uL
public const val TCP_COOKIE_IN_ALWAYS: CInt = 1
public const val TCP_COOKIE_OUT_NEVER: CInt = 2
public const val TCP_S_DATA_IN: CInt = 4
public const val TCP_S_DATA_OUT: CInt = 8
public const val TCP_MSS_DEFAULT: ULong = 536uL
public const val TCP_MSS_DESIRED: ULong = 1220uL
public const val WCOREFLAG: CInt = 128
public const val WAIT_ANY: PidT = -1
public const val WAIT_MYPGRP: PidT = 0
public const val LOCK_SH: CInt = 1
public const val LOCK_EX: CInt = 2
public const val LOCK_UN: CInt = 8
public const val LOCK_NB: CInt = 4
public const val PROT_NONE: CInt = 0
public const val PROT_READ: CInt = 4
public const val PROT_WRITE: CInt = 2
public const val PROT_EXEC: CInt = 1
public const val MAP_FILE: CInt = 1
public const val MAP_ANON: CInt = 2
public const val MAP_ANONYMOUS: CInt = MAP_ANON
public const val MAP_TYPE: CInt = 15
public const val MAP_COPY: CInt = 32
public const val MAP_SHARED: CInt = 16
public const val MAP_PRIVATE: CInt = 0
public const val MAP_FIXED: CInt = 256
public const val MAP_NOEXTEND: CInt = 512
public const val MAP_HASSEMAPHORE: CInt = 1024
public const val MAP_INHERIT: CInt = 2048
public const val MAP_32BIT: CInt = 4096
public const val MAP_EXCL: CInt = 16384
public const val MADV_NORMAL: CInt = 0
public const val MADV_RANDOM: CInt = 1
public const val MADV_SEQUENTIAL: CInt = 2
public const val MADV_WILLNEED: CInt = 3
public const val MADV_DONTNEED: CInt = 4
public const val POSIX_MADV_NORMAL: CInt = 0
public const val POSIX_MADV_RANDOM: CInt = 1
public const val POSIX_MADV_SEQUENTIAL: CInt = 2
public const val POSIX_MADV_WILLNEED: CInt = 3
public const val POSIX_MADV_WONTNEED: CInt = 4
public const val MS_ASYNC: CInt = 1
public const val MS_SYNC: CInt = 0
public const val MS_INVALIDATE: CInt = 2
public const val MREMAP_MAYMOVE: CInt = 1
public const val MREMAP_FIXED: CInt = 2
public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val XATTR_CREATE: CInt = 0x1
public const val XATTR_REPLACE: CInt = 0x2
public const val POSIX_SPAWN_USEVFORK: CInt = 64
public const val POSIX_SPAWN_SETSID: CInt = 128
public val LOG_CRON: CInt = 9 shl 3
public val LOG_AUTHPRIV: CInt = 10 shl 3
public val LOG_FTP: CInt = 11 shl 3
public const val LOG_PERROR: CInt = 0x20
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
public const val IFF_MASTER: CInt = 0x400
public const val IFF_SLAVE: CInt = 0x800
public const val IFF_MULTICAST: CInt = 0x1000
public const val IFF_PORTSEL: CInt = 0x2000
public const val IFF_AUTOMEDIA: CInt = 0x4000
public const val IFF_DYNAMIC: CInt = 0x8000
public const val GRND_NONBLOCK: CUInt = 1u
public const val GRND_RANDOM: CUInt = 2u
public const val GRND_INSECURE: CUInt = 4u
public const val _PC_LINK_MAX: CInt = 0
public const val _PC_MAX_CANON: CInt = 1
public const val _PC_MAX_INPUT: CInt = 2
public const val _PC_NAME_MAX: CInt = 3
public const val _PC_PATH_MAX: CInt = 4
public const val _PC_PIPE_BUF: CInt = 5
public const val _PC_CHOWN_RESTRICTED: CInt = 6
public const val _PC_NO_TRUNC: CInt = 7
public const val _PC_VDISABLE: CInt = 8
public const val _PC_SYNC_IO: CInt = 9
public const val _PC_ASYNC_IO: CInt = 10
public const val _PC_PRIO_IO: CInt = 11
public const val _PC_SOCK_MAXBUF: CInt = 12
public const val _PC_FILESIZEBITS: CInt = 13
public const val _PC_REC_INCR_XFER_SIZE: CInt = 14
public const val _PC_REC_MAX_XFER_SIZE: CInt = 15
public const val _PC_REC_MIN_XFER_SIZE: CInt = 16
public const val _PC_REC_XFER_ALIGN: CInt = 17
public const val _PC_ALLOC_SIZE_MIN: CInt = 18
public const val _PC_SYMLINK_MAX: CInt = 19
public const val _PC_2_SYMLINKS: CInt = 20
public const val _SC_ARG_MAX: CInt = 0
public const val _SC_CHILD_MAX: CInt = 1
public const val _SC_CLK_TCK: CInt = 2
public const val _SC_NGROUPS_MAX: CInt = 3
public const val _SC_OPEN_MAX: CInt = 4
public const val _SC_STREAM_MAX: CInt = 5
public const val _SC_TZNAME_MAX: CInt = 6
public const val _SC_JOB_CONTROL: CInt = 7
public const val _SC_SAVED_IDS: CInt = 8
public const val _SC_REALTIME_SIGNALS: CInt = 9
public const val _SC_PRIORITY_SCHEDULING: CInt = 10
public const val _SC_TIMERS: CInt = 11
public const val _SC_ASYNCHRONOUS_IO: CInt = 12
public const val _SC_PRIORITIZED_IO: CInt = 13
public const val _SC_SYNCHRONIZED_IO: CInt = 14
public const val _SC_FSYNC: CInt = 15
public const val _SC_MAPPED_FILES: CInt = 16
public const val _SC_MEMLOCK: CInt = 17
public const val _SC_MEMLOCK_RANGE: CInt = 18
public const val _SC_MEMORY_PROTECTION: CInt = 19
public const val _SC_MESSAGE_PASSING: CInt = 20
public const val _SC_SEMAPHORES: CInt = 21
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 22
public const val _SC_AIO_LISTIO_MAX: CInt = 23
public const val _SC_AIO_MAX: CInt = 24
public const val _SC_AIO_PRIO_DELTA_MAX: CInt = 25
public const val _SC_DELAYTIMER_MAX: CInt = 26
public const val _SC_MQ_OPEN_MAX: CInt = 27
public const val _SC_MQ_PRIO_MAX: CInt = 28
public const val _SC_VERSION: CInt = 29
public const val _SC_PAGESIZE: CInt = 30
public const val _SC_PAGE_SIZE: CInt = 30
public const val _SC_RTSIG_MAX: CInt = 31
public const val _SC_SEM_NSEMS_MAX: CInt = 32
public const val _SC_SEM_VALUE_MAX: CInt = 33
public const val _SC_SIGQUEUE_MAX: CInt = 34
public const val _SC_TIMER_MAX: CInt = 35
public const val _SC_BC_BASE_MAX: CInt = 36
public const val _SC_BC_DIM_MAX: CInt = 37
public const val _SC_BC_SCALE_MAX: CInt = 38
public const val _SC_BC_STRING_MAX: CInt = 39
public const val _SC_COLL_WEIGHTS_MAX: CInt = 40
public const val _SC_EQUIV_CLASS_MAX: CInt = 41
public const val _SC_EXPR_NEST_MAX: CInt = 42
public const val _SC_LINE_MAX: CInt = 43
public const val _SC_RE_DUP_MAX: CInt = 44
public const val _SC_CHARCLASS_NAME_MAX: CInt = 45
public const val _SC_2_VERSION: CInt = 46
public const val _SC_2_C_BIND: CInt = 47
public const val _SC_2_C_DEV: CInt = 48
public const val _SC_2_FORT_DEV: CInt = 49
public const val _SC_2_FORT_RUN: CInt = 50
public const val _SC_2_SW_DEV: CInt = 51
public const val _SC_2_LOCALEDEF: CInt = 52
public const val _SC_PII: CInt = 53
public const val _SC_PII_XTI: CInt = 54
public const val _SC_PII_SOCKET: CInt = 55
public const val _SC_PII_INTERNET: CInt = 56
public const val _SC_PII_OSI: CInt = 57
public const val _SC_POLL: CInt = 58
public const val _SC_SELECT: CInt = 59
public const val _SC_UIO_MAXIOV: CInt = 60
public const val _SC_IOV_MAX: CInt = 60
public const val _SC_PII_INTERNET_STREAM: CInt = 61
public const val _SC_PII_INTERNET_DGRAM: CInt = 62
public const val _SC_PII_OSI_COTS: CInt = 63
public const val _SC_PII_OSI_CLTS: CInt = 64
public const val _SC_PII_OSI_M: CInt = 65
public const val _SC_T_IOV_MAX: CInt = 66
public const val _SC_THREADS: CInt = 67
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 68
public const val _SC_GETGR_R_SIZE_MAX: CInt = 69
public const val _SC_GETPW_R_SIZE_MAX: CInt = 70
public const val _SC_LOGIN_NAME_MAX: CInt = 71
public const val _SC_TTY_NAME_MAX: CInt = 72
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 73
public const val _SC_THREAD_KEYS_MAX: CInt = 74
public const val _SC_THREAD_STACK_MIN: CInt = 75
public const val _SC_THREAD_THREADS_MAX: CInt = 76
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 77
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 78
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 79
public const val _SC_THREAD_PRIO_INHERIT: CInt = 80
public const val _SC_THREAD_PRIO_PROTECT: CInt = 81
public const val _SC_THREAD_PROCESS_SHARED: CInt = 82
public const val _SC_NPROCESSORS_CONF: CInt = 83
public const val _SC_NPROCESSORS_ONLN: CInt = 84
public const val _SC_PHYS_PAGES: CInt = 85
public const val _SC_AVPHYS_PAGES: CInt = 86
public const val _SC_ATEXIT_MAX: CInt = 87
public const val _SC_PASS_MAX: CInt = 88
public const val _SC_XOPEN_VERSION: CInt = 89
public const val _SC_XOPEN_XCU_VERSION: CInt = 90
public const val _SC_XOPEN_UNIX: CInt = 91
public const val _SC_XOPEN_CRYPT: CInt = 92
public const val _SC_XOPEN_ENH_I18N: CInt = 93
public const val _SC_XOPEN_SHM: CInt = 94
public const val _SC_2_CHAR_TERM: CInt = 95
public const val _SC_2_C_VERSION: CInt = 96
public const val _SC_2_UPE: CInt = 97
public const val _SC_XOPEN_XPG2: CInt = 98
public const val _SC_XOPEN_XPG3: CInt = 99
public const val _SC_XOPEN_XPG4: CInt = 100
public const val _SC_CHAR_BIT: CInt = 101
public const val _SC_CHAR_MAX: CInt = 102
public const val _SC_CHAR_MIN: CInt = 103
public const val _SC_INT_MAX: CInt = 104
public const val _SC_INT_MIN: CInt = 105
public const val _SC_LONG_BIT: CInt = 106
public const val _SC_WORD_BIT: CInt = 107
public const val _SC_MB_LEN_MAX: CInt = 108
public const val _SC_NZERO: CInt = 109
public const val _SC_SSIZE_MAX: CInt = 110
public const val _SC_SCHAR_MAX: CInt = 111
public const val _SC_SCHAR_MIN: CInt = 112
public const val _SC_SHRT_MAX: CInt = 113
public const val _SC_SHRT_MIN: CInt = 114
public const val _SC_UCHAR_MAX: CInt = 115
public const val _SC_UINT_MAX: CInt = 116
public const val _SC_ULONG_MAX: CInt = 117
public const val _SC_USHRT_MAX: CInt = 118
public const val _SC_NL_ARGMAX: CInt = 119
public const val _SC_NL_LANGMAX: CInt = 120
public const val _SC_NL_MSGMAX: CInt = 121
public const val _SC_NL_NMAX: CInt = 122
public const val _SC_NL_SETMAX: CInt = 123
public const val _SC_NL_TEXTMAX: CInt = 124
public const val _SC_XBS5_ILP32_OFF32: CInt = 125
public const val _SC_XBS5_ILP32_OFFBIG: CInt = 126
public const val _SC_XBS5_LP64_OFF64: CInt = 127
public const val _SC_XBS5_LPBIG_OFFBIG: CInt = 128
public const val _SC_XOPEN_LEGACY: CInt = 129
public const val _SC_XOPEN_REALTIME: CInt = 130
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 131
public const val _SC_ADVISORY_INFO: CInt = 132
public const val _SC_BARRIERS: CInt = 133
public const val _SC_BASE: CInt = 134
public const val _SC_C_LANG_SUPPORT: CInt = 135
public const val _SC_C_LANG_SUPPORT_R: CInt = 136
public const val _SC_CLOCK_SELECTION: CInt = 137
public const val _SC_CPUTIME: CInt = 138
public const val _SC_THREAD_CPUTIME: CInt = 139
public const val _SC_DEVICE_IO: CInt = 140
public const val _SC_DEVICE_SPECIFIC: CInt = 141
public const val _SC_DEVICE_SPECIFIC_R: CInt = 142
public const val _SC_FD_MGMT: CInt = 143
public const val _SC_FIFO: CInt = 144
public const val _SC_PIPE: CInt = 145
public const val _SC_FILE_ATTRIBUTES: CInt = 146
public const val _SC_FILE_LOCKING: CInt = 147
public const val _SC_FILE_SYSTEM: CInt = 148
public const val _SC_MONOTONIC_CLOCK: CInt = 149
public const val _SC_MULTI_PROCESS: CInt = 150
public const val _SC_SINGLE_PROCESS: CInt = 151
public const val _SC_NETWORKING: CInt = 152
public const val _SC_READER_WRITER_LOCKS: CInt = 153
public const val _SC_SPIN_LOCKS: CInt = 154
public const val _SC_REGEXP: CInt = 155
public const val _SC_REGEX_VERSION: CInt = 156
public const val _SC_SHELL: CInt = 157
public const val _SC_SIGNALS: CInt = 158
public const val _SC_SPAWN: CInt = 159
public const val _SC_SPORADIC_SERVER: CInt = 160
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 161
public const val _SC_SYSTEM_DATABASE: CInt = 162
public const val _SC_SYSTEM_DATABASE_R: CInt = 163
public const val _SC_TIMEOUTS: CInt = 164
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 165
public const val _SC_USER_GROUPS: CInt = 166
public const val _SC_USER_GROUPS_R: CInt = 167
public const val _SC_2_PBS: CInt = 168
public const val _SC_2_PBS_ACCOUNTING: CInt = 169
public const val _SC_2_PBS_LOCATE: CInt = 170
public const val _SC_2_PBS_MESSAGE: CInt = 171
public const val _SC_2_PBS_TRACK: CInt = 172
public const val _SC_SYMLOOP_MAX: CInt = 173
public const val _SC_STREAMS: CInt = 174
public const val _SC_2_PBS_CHECKPOINT: CInt = 175
public const val _SC_V6_ILP32_OFF32: CInt = 176
public const val _SC_V6_ILP32_OFFBIG: CInt = 177
public const val _SC_V6_LP64_OFF64: CInt = 178
public const val _SC_V6_LPBIG_OFFBIG: CInt = 179
public const val _SC_HOST_NAME_MAX: CInt = 180
public const val _SC_TRACE: CInt = 181
public const val _SC_TRACE_EVENT_FILTER: CInt = 182
public const val _SC_TRACE_INHERIT: CInt = 183
public const val _SC_TRACE_LOG: CInt = 184
public const val _SC_LEVEL1_ICACHE_SIZE: CInt = 185
public const val _SC_LEVEL1_ICACHE_ASSOC: CInt = 186
public const val _SC_LEVEL1_ICACHE_LINESIZE: CInt = 187
public const val _SC_LEVEL1_DCACHE_SIZE: CInt = 188
public const val _SC_LEVEL1_DCACHE_ASSOC: CInt = 189
public const val _SC_LEVEL1_DCACHE_LINESIZE: CInt = 190
public const val _SC_LEVEL2_CACHE_SIZE: CInt = 191
public const val _SC_LEVEL2_CACHE_ASSOC: CInt = 192
public const val _SC_LEVEL2_CACHE_LINESIZE: CInt = 193
public const val _SC_LEVEL3_CACHE_SIZE: CInt = 194
public const val _SC_LEVEL3_CACHE_ASSOC: CInt = 195
public const val _SC_LEVEL3_CACHE_LINESIZE: CInt = 196
public const val _SC_LEVEL4_CACHE_SIZE: CInt = 197
public const val _SC_LEVEL4_CACHE_ASSOC: CInt = 198
public const val _SC_LEVEL4_CACHE_LINESIZE: CInt = 199
public const val _SC_IPV6: CInt = 235
public const val _SC_RAW_SOCKETS: CInt = 236
public const val _SC_V7_ILP32_OFF32: CInt = 237
public const val _SC_V7_ILP32_OFFBIG: CInt = 238
public const val _SC_V7_LP64_OFF64: CInt = 239
public const val _SC_V7_LPBIG_OFFBIG: CInt = 240
public const val _SC_SS_REPL_MAX: CInt = 241
public const val _SC_TRACE_EVENT_NAME_MAX: CInt = 242
public const val _SC_TRACE_NAME_MAX: CInt = 243
public const val _SC_TRACE_SYS_MAX: CInt = 244
public const val _SC_TRACE_USER_EVENT_MAX: CInt = 245
public const val _SC_XOPEN_STREAMS: CInt = 246
public const val _SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 247
public const val _SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 248
public const val _SC_MINSIGSTKSZ: CInt = 249
public const val _SC_SIGSTKSZ: CInt = 250
public const val _CS_PATH: CInt = 0
public const val _CS_V6_WIDTH_RESTRICTED_ENVS: CInt = 1
public const val _CS_GNU_LIBC_VERSION: CInt = 2
public const val _CS_GNU_LIBPTHREAD_VERSION: CInt = 3
public const val _CS_V5_WIDTH_RESTRICTED_ENVS: CInt = 4
public const val _CS_V7_WIDTH_RESTRICTED_ENVS: CInt = 5
public const val _CS_LFS_CFLAGS: CInt = 1000
public const val _CS_LFS_LDFLAGS: CInt = 1001
public const val _CS_LFS_LIBS: CInt = 1002
public const val _CS_LFS_LINTFLAGS: CInt = 1003
public const val _CS_LFS64_CFLAGS: CInt = 1004
public const val _CS_LFS64_LDFLAGS: CInt = 1005
public const val _CS_LFS64_LIBS: CInt = 1006
public const val _CS_LFS64_LINTFLAGS: CInt = 1007
public const val _CS_XBS5_ILP32_OFF32_CFLAGS: CInt = 1100
public const val _CS_XBS5_ILP32_OFF32_LDFLAGS: CInt = 1101
public const val _CS_XBS5_ILP32_OFF32_LIBS: CInt = 1102
public const val _CS_XBS5_ILP32_OFF32_LINTFLAGS: CInt = 1103
public const val _CS_XBS5_ILP32_OFFBIG_CFLAGS: CInt = 1104
public const val _CS_XBS5_ILP32_OFFBIG_LDFLAGS: CInt = 1105
public const val _CS_XBS5_ILP32_OFFBIG_LIBS: CInt = 1106
public const val _CS_XBS5_ILP32_OFFBIG_LINTFLAGS: CInt = 1107
public const val _CS_XBS5_LP64_OFF64_CFLAGS: CInt = 1108
public const val _CS_XBS5_LP64_OFF64_LDFLAGS: CInt = 1109
public const val _CS_XBS5_LP64_OFF64_LIBS: CInt = 1110
public const val _CS_XBS5_LP64_OFF64_LINTFLAGS: CInt = 1111
public const val _CS_XBS5_LPBIG_OFFBIG_CFLAGS: CInt = 1112
public const val _CS_XBS5_LPBIG_OFFBIG_LDFLAGS: CInt = 1113
public const val _CS_XBS5_LPBIG_OFFBIG_LIBS: CInt = 1114
public const val _CS_XBS5_LPBIG_OFFBIG_LINTFLAGS: CInt = 1115
public const val _CS_POSIX_V6_ILP32_OFF32_CFLAGS: CInt = 1116
public const val _CS_POSIX_V6_ILP32_OFF32_LDFLAGS: CInt = 1117
public const val _CS_POSIX_V6_ILP32_OFF32_LIBS: CInt = 1118
public const val _CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: CInt = 1119
public const val _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: CInt = 1120
public const val _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: CInt = 1121
public const val _CS_POSIX_V6_ILP32_OFFBIG_LIBS: CInt = 1122
public const val _CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: CInt = 1123
public const val _CS_POSIX_V6_LP64_OFF64_CFLAGS: CInt = 1124
public const val _CS_POSIX_V6_LP64_OFF64_LDFLAGS: CInt = 1125
public const val _CS_POSIX_V6_LP64_OFF64_LIBS: CInt = 1126
public const val _CS_POSIX_V6_LP64_OFF64_LINTFLAGS: CInt = 1127
public const val _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: CInt = 1128
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: CInt = 1129
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LIBS: CInt = 1130
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: CInt = 1131
public const val _CS_POSIX_V7_ILP32_OFF32_CFLAGS: CInt = 1132
public const val _CS_POSIX_V7_ILP32_OFF32_LDFLAGS: CInt = 1133
public const val _CS_POSIX_V7_ILP32_OFF32_LIBS: CInt = 1134
public const val _CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: CInt = 1135
public const val _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: CInt = 1136
public const val _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: CInt = 1137
public const val _CS_POSIX_V7_ILP32_OFFBIG_LIBS: CInt = 1138
public const val _CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: CInt = 1139
public const val _CS_POSIX_V7_LP64_OFF64_CFLAGS: CInt = 1140
public const val _CS_POSIX_V7_LP64_OFF64_LDFLAGS: CInt = 1141
public const val _CS_POSIX_V7_LP64_OFF64_LIBS: CInt = 1142
public const val _CS_POSIX_V7_LP64_OFF64_LINTFLAGS: CInt = 1143
public const val _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: CInt = 1144
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: CInt = 1145
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LIBS: CInt = 1146
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: CInt = 1147
public const val _CS_V6_ENV: CInt = 1148
public const val _CS_V7_ENV: CInt = 1149
public const val PTHREAD_PROCESS_PRIVATE: PthreadProcessShared = 0u
public const val PTHREAD_PROCESS_SHARED: PthreadProcessShared = 1u
public const val PTHREAD_EXPLICIT_SCHED: PthreadInheritsched = 0u
public const val PTHREAD_INHERIT_SCHED: PthreadInheritsched = 1u
public const val PTHREAD_SCOPE_SYSTEM: PthreadContentionscope = 0u
public const val PTHREAD_SCOPE_PROCESS: PthreadContentionscope = 1u
public const val PTHREAD_CREATE_JOINABLE: PthreadDetachstate = 0u
public const val PTHREAD_CREATE_DETACHED: PthreadDetachstate = 1u
public const val PTHREAD_PRIO_NONE: PthreadMutexProtocol = 0u
public const val PTHREAD_PRIO_INHERIT: PthreadMutexProtocol = 1u
public const val PTHREAD_PRIO_PROTECT: PthreadMutexProtocol = 2u
public const val PTHREAD_MUTEX_TIMED: PthreadMutexType = 0u
public const val PTHREAD_MUTEX_ERRORCHECK: PthreadMutexType = 1u
public const val PTHREAD_MUTEX_RECURSIVE: PthreadMutexType = 2u
public const val PTHREAD_MUTEX_STALLED: PthreadMutexRobustness = 0u
public const val PTHREAD_MUTEX_ROBUST: PthreadMutexRobustness = 256u
public const val RLIMIT_CPU: RlimitResourceT = 0uL
public const val RLIMIT_FSIZE: RlimitResourceT = 1uL
public const val RLIMIT_DATA: RlimitResourceT = 2uL
public const val RLIMIT_STACK: RlimitResourceT = 3uL
public const val RLIMIT_CORE: RlimitResourceT = 4uL
public const val RLIMIT_RSS: RlimitResourceT = 5uL
public const val RLIMIT_MEMLOCK: RlimitResourceT = 6uL
public const val RLIMIT_NPROC: RlimitResourceT = 7uL
public const val RLIMIT_OFILE: RlimitResourceT = 8uL
public const val RLIMIT_NOFILE: RlimitResourceT = 8uL
public const val RLIMIT_SBSIZE: RlimitResourceT = 9uL
public const val RLIMIT_AS: RlimitResourceT = 10uL
public const val RLIMIT_VMEM: RlimitResourceT = 10uL
public const val RLIMIT_NLIMITS: RlimitResourceT = 11uL
public const val RLIM_NLIMITS: RlimitResourceT = 11uL
public const val RUSAGE_SELF: RusageWho = 0
public const val RUSAGE_CHILDREN: RusageWho = -1
public const val PRIO_PROCESS: PriorityWhich = 0u
public const val PRIO_PGRP: PriorityWhich = 1u
public const val PRIO_USER: PriorityWhich = 2u
public const val __UT_LINESIZE: ULong = 32uL
public const val __UT_NAMESIZE: ULong = 32uL
public const val __UT_HOSTSIZE: ULong = 256uL
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_RAW: CInt = 3
public const val SOCK_RDM: CInt = 4
public const val SOCK_SEQPACKET: CInt = 5
public const val SOCK_CLOEXEC: CInt = 4194304
public const val SOCK_NONBLOCK: CInt = 2048
public const val MSG_OOB: CInt = 1
public const val MSG_PEEK: CInt = 2
public const val MSG_DONTROUTE: CInt = 4
public const val MSG_EOR: CInt = 8
public const val MSG_TRUNC: CInt = 16
public const val MSG_CTRUNC: CInt = 32
public const val MSG_WAITALL: CInt = 64
public const val MSG_DONTWAIT: CInt = 128
public const val MSG_NOSIGNAL: CInt = 1024
public const val MSG_CMSG_CLOEXEC: CInt = 0x40000000
public const val SCM_RIGHTS: CInt = 1
public const val SCM_TIMESTAMP: CInt = 2
public const val SCM_CREDS: CInt = 3
public const val SO_DEBUG: CInt = 1
public const val SO_ACCEPTCONN: CInt = 2
public const val SO_REUSEADDR: CInt = 4
public const val SO_KEEPALIVE: CInt = 8
public const val SO_DONTROUTE: CInt = 16
public const val SO_BROADCAST: CInt = 32
public const val SO_USELOOPBACK: CInt = 64
public const val SO_LINGER: CInt = 128
public const val SO_OOBINLINE: CInt = 256
public const val SO_REUSEPORT: CInt = 512
public const val SO_SNDBUF: CInt = 4097
public const val SO_RCVBUF: CInt = 4098
public const val SO_SNDLOWAT: CInt = 4099
public const val SO_RCVLOWAT: CInt = 4100
public const val SO_SNDTIMEO: CInt = 4101
public const val SO_RCVTIMEO: CInt = 4102
public const val SO_ERROR: CInt = 4103
public const val SO_STYLE: CInt = 4104
public const val SO_TYPE: CInt = 4104
public const val IPPROTO_IP: CInt = 0
public const val IPPROTO_ICMP: CInt = 1
public const val IPPROTO_IGMP: CInt = 2
public const val IPPROTO_IPIP: CInt = 4
public const val IPPROTO_TCP: CInt = 6
public const val IPPROTO_EGP: CInt = 8
public const val IPPROTO_PUP: CInt = 12
public const val IPPROTO_UDP: CInt = 17
public const val IPPROTO_IDP: CInt = 22
public const val IPPROTO_TP: CInt = 29
public const val IPPROTO_DCCP: CInt = 33
public const val IPPROTO_IPV6: CInt = 41
public const val IPPROTO_RSVP: CInt = 46
public const val IPPROTO_GRE: CInt = 47
public const val IPPROTO_ESP: CInt = 50
public const val IPPROTO_AH: CInt = 51
public const val IPPROTO_MTP: CInt = 92
public const val IPPROTO_BEETPH: CInt = 94
public const val IPPROTO_ENCAP: CInt = 98
public const val IPPROTO_PIM: CInt = 103
public const val IPPROTO_COMP: CInt = 108
public const val IPPROTO_L2TP: CInt = 115
public const val IPPROTO_SCTP: CInt = 132
public const val IPPROTO_UDPLITE: CInt = 136
public const val IPPROTO_MPLS: CInt = 137
public const val IPPROTO_ETHERNET: CInt = 143
public const val IPPROTO_RAW: CInt = 255
public const val IPPROTO_MPTCP: CInt = 262
public const val IPPROTO_MAX: CInt = 263
public const val IPPROTO_HOPOPTS: CInt = 0
public const val IPPROTO_ROUTING: CInt = 43
public const val IPPROTO_FRAGMENT: CInt = 44
public const val IPPROTO_ICMPV6: CInt = 58
public const val IPPROTO_NONE: CInt = 59
public const val IPPROTO_DSTOPTS: CInt = 60
public const val IPPROTO_MH: CInt = 135
public const val IPPORT_ECHO: InPortT = 7u
public const val IPPORT_DISCARD: InPortT = 9u
public const val IPPORT_SYSTAT: InPortT = 11u
public const val IPPORT_DAYTIME: InPortT = 13u
public const val IPPORT_NETSTAT: InPortT = 15u
public const val IPPORT_FTP: InPortT = 21u
public const val IPPORT_TELNET: InPortT = 23u
public const val IPPORT_SMTP: InPortT = 25u
public const val IPPORT_TIMESERVER: InPortT = 37u
public const val IPPORT_NAMESERVER: InPortT = 42u
public const val IPPORT_WHOIS: InPortT = 43u
public const val IPPORT_MTP: InPortT = 57u
public const val IPPORT_TFTP: InPortT = 69u
public const val IPPORT_RJE: InPortT = 77u
public const val IPPORT_FINGER: InPortT = 79u
public const val IPPORT_TTYLINK: InPortT = 87u
public const val IPPORT_SUPDUP: InPortT = 95u
public const val IPPORT_EXECSERVER: InPortT = 512u
public const val IPPORT_LOGINSERVER: InPortT = 513u
public const val IPPORT_CMDSERVER: InPortT = 514u
public const val IPPORT_EFSSERVER: InPortT = 520u
public const val IPPORT_BIFFUDP: InPortT = 512u
public const val IPPORT_WHOSERVER: InPortT = 513u
public const val IPPORT_ROUTESERVER: InPortT = 520u
public const val IPPORT_USERRESERVED: InPortT = 5000u
public val DT_UNKNOWN: CUChar = (0).toUByte()
public val DT_FIFO: CUChar = (1).toUByte()
public val DT_CHR: CUChar = (2).toUByte()
public val DT_DIR: CUChar = (4).toUByte()
public val DT_BLK: CUChar = (6).toUByte()
public val DT_REG: CUChar = (8).toUByte()
public val DT_LNK: CUChar = (10).toUByte()
public val DT_SOCK: CUChar = (12).toUByte()
public val DT_WHT: CUChar = (14).toUByte()
public const val ST_RDONLY: CULong = 1uL
public const val ST_NOSUID: CULong = 2uL
public const val ST_NOEXEC: CULong = 8uL
public const val ST_SYNCHRONOUS: CULong = 16uL
public const val ST_NOATIME: CULong = 32uL
public const val ST_RELATIME: CULong = 64uL
public const val RTLD_DI_LMID: CInt = 1
public const val RTLD_DI_LINKMAP: CInt = 2
public const val RTLD_DI_CONFIGADDR: CInt = 3
public const val RTLD_DI_SERINFO: CInt = 4
public const val RTLD_DI_SERINFOSIZE: CInt = 5
public const val RTLD_DI_ORIGIN: CInt = 6
public const val RTLD_DI_PROFILENAME: CInt = 7
public const val RTLD_DI_PROFILEOUT: CInt = 8
public const val RTLD_DI_TLS_MODID: CInt = 9
public const val RTLD_DI_TLS_DATA: CInt = 10
public const val RTLD_DI_PHDR: CInt = 11
public const val RTLD_DI_MAX: CInt = 11
public const val SI_ASYNCIO: CInt = -4
public const val SI_MESGQ: CInt = -3
public const val SI_TIMER: CInt = -2
public const val SI_QUEUE: CInt = -1
public const val SI_USER: CInt = 0
public const val ILL_ILLOPC: CInt = 1
public const val ILL_ILLOPN: CInt = 2
public const val ILL_ILLADR: CInt = 3
public const val ILL_ILLTRP: CInt = 4
public const val ILL_PRVOPC: CInt = 5
public const val ILL_PRVREG: CInt = 6
public const val ILL_COPROC: CInt = 7
public const val ILL_BADSTK: CInt = 8
public const val FPE_INTDIV: CInt = 1
public const val FPE_INTOVF: CInt = 2
public const val FPE_FLTDIV: CInt = 3
public const val FPE_FLTOVF: CInt = 4
public const val FPE_FLTUND: CInt = 5
public const val FPE_FLTRES: CInt = 6
public const val FPE_FLTINV: CInt = 7
public const val FPE_FLTSUB: CInt = 8
public const val SEGV_MAPERR: CInt = 1
public const val SEGV_ACCERR: CInt = 2
public const val BUS_ADRALN: CInt = 1
public const val BUS_ADRERR: CInt = 2
public const val BUS_OBJERR: CInt = 3
public const val TRAP_BRKPT: CInt = 1
public const val TRAP_TRACE: CInt = 2
public const val CLD_EXITED: CInt = 1
public const val CLD_KILLED: CInt = 2
public const val CLD_DUMPED: CInt = 3
public const val CLD_TRAPPED: CInt = 4
public const val CLD_STOPPED: CInt = 5
public const val CLD_CONTINUED: CInt = 6
public const val POLL_IN: CInt = 1
public const val POLL_OUT: CInt = 2
public const val POLL_MSG: CInt = 3
public const val POLL_ERR: CInt = 4
public const val POLL_PRI: CInt = 5
public const val POLL_HUP: CInt = 6
public const val SIGEV_SIGNAL: CInt = 0
public const val SIGEV_NONE: CInt = 1
public const val SIGEV_THREAD: CInt = 2
public const val REG_GS: CUInt = 0u
public const val REG_FS: CUInt = 1u
public const val REG_ES: CUInt = 2u
public const val REG_DS: CUInt = 3u
public const val REG_EDI: CUInt = 4u
public const val REG_ESI: CUInt = 5u
public const val REG_EBP: CUInt = 6u
public const val REG_ESP: CUInt = 7u
public const val REG_EBX: CUInt = 8u
public const val REG_EDX: CUInt = 9u
public const val REG_ECX: CUInt = 10u
public const val REG_EAX: CUInt = 11u
public const val REG_TRAPNO: CUInt = 12u
public const val REG_ERR: CUInt = 13u
public const val REG_EIP: CUInt = 14u
public const val REG_CS: CUInt = 15u
public const val REG_EFL: CUInt = 16u
public const val REG_UESP: CUInt = 17u
public const val REG_SS: CUInt = 18u
public const val IOC_VOID: IoctlDir = 0u
public const val IOC_OUT: IoctlDir = 1u
public const val IOC_IN: IoctlDir = 2u
public const val IOC_INOUT: IoctlDir = 3u
public const val IOC_8: IoctlDatum = 0u
public const val IOC_16: IoctlDatum = 1u
public const val IOC_32: IoctlDatum = 2u
public const val IOC_64: IoctlDatum = 3u
public const val TCP_ESTABLISHED: CUInt = 1u
public const val TCP_SYN_SENT: CUInt = 2u
public const val TCP_SYN_RECV: CUInt = 3u
public const val TCP_FIN_WAIT1: CUInt = 4u
public const val TCP_FIN_WAIT2: CUInt = 5u
public const val TCP_TIME_WAIT: CUInt = 6u
public const val TCP_CLOSE: CUInt = 7u
public const val TCP_CLOSE_WAIT: CUInt = 8u
public const val TCP_LAST_ACK: CUInt = 9u
public const val TCP_LISTEN: CUInt = 10u
public const val TCP_CLOSING: CUInt = 11u
public const val TCP_CA_Open: TcpCaState = 0u
public const val TCP_CA_Disorder: TcpCaState = 1u
public const val TCP_CA_CWR: TcpCaState = 2u
public const val TCP_CA_Recovery: TcpCaState = 3u
public const val TCP_CA_Loss: TcpCaState = 4u
public const val TCP_NO_QUEUE: CUInt = 0u
public const val TCP_RECV_QUEUE: CUInt = 1u
public const val TCP_SEND_QUEUE: CUInt = 2u
public const val TCP_QUEUES_NR: CUInt = 3u
public const val P_ALL: IdtypeT = 0u
public const val P_PID: IdtypeT = 1u
public const val P_PGID: IdtypeT = 2u
public const val SS_ONSTACK: CInt = 1
public const val SS_DISABLE: CInt = 4
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(lock = 0, ownerId = 0, cnt = 0, shpid = 0, type = PTHREAD_MUTEX_TIMED.toInt(), flags = 0)

// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { __lock: __PTHREAD_SPIN_LOCK_INITIALIZER, __queue: 0i64 as *mut __pthread, __attr: 0i64 as *mut __pthread_condattr, __wrefs: 0, __data: 0i64 as *mut c_void, } (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { __held: __PTHREAD_SPIN_LOCK_INITIALIZER, __lock: __PTHREAD_SPIN_LOCK_INITIALIZER, __readers: 0, __readerqueue: 0i64 as *mut __pthread, __writerqueue: 0i64 as *mut __pthread, __attr: 0i64 as *mut __pthread_rwlockattr, __data: 0i64 as *mut c_void, } (initializer represented at the FFI boundary)
public const val PTHREAD_STACK_MIN: ULong = 0uL

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr?

public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?

public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun cPUALLOCSIZE(count: CInt): ULong

public expect fun cPUZERO(cpuset: CpuSetT?)

public expect fun cPUSET(cpu: ULong, cpuset: CpuSetT?)

public expect fun cPUCLR(cpu: ULong, cpuset: CpuSetT?)

public expect fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean

public expect fun cPUCOUNTS(size: ULong, cpuset: CpuSetT?): CInt

public expect fun cPUCOUNT(cpuset: CpuSetT?): CInt

public expect fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean

public expect fun iPTOSTOS(tos: UByte): UByte

public expect fun iPTOSPREC(tos: UByte): UByte

public expect fun fDCLR(fd: CInt, set: FdSet?)

public expect fun fDISSET(fd: CInt, set: FdSet?): Boolean

public expect fun fDSET(fd: CInt, set: FdSet?)

public expect fun fDZERO(set: FdSet?)

public expect fun sIGRTMAX(): CInt

public expect fun sIGRTMIN(): CInt

public expect fun lutimes(file: String?, times: Timeval?): CInt

public expect fun futimes(fd: CInt, times: Timeval?): CInt

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt

public expect fun mkfifoat(fd: CInt, path: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun libcCurrentSigrtmin(): CInt

public expect fun libcCurrentSigrtmax(): CInt

public expect fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt

public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt

public expect fun sigsuspend(mask: SigsetT?): CInt

public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt

public expect fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt

public expect fun pipe2(fds: CInt?, flags: CInt): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun pread64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT

public expect fun pwrite64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT

public expect fun readv(fd: CInt, iovec: Iovec?, count: CInt): SsizeT

public expect fun writev(fd: CInt, iovec: Iovec?, count: CInt): SsizeT

public expect fun preadv(fd: CInt, iovec: Iovec?, count: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iovec: Iovec?, count: CInt, offset: OffT): SsizeT

public expect fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong

public expect fun aioRead(aiocbp: Aiocb?): CInt

public expect fun aioWrite(aiocbp: Aiocb?): CInt

public expect fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt

public expect fun aioError(aiocbp: Aiocb?): CInt

public expect fun aioReturn(aiocbp: Aiocb?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt

public expect fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt

public expect fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt

public expect fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt

public expect fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt

public expect fun ftello64(stream: FILE?): Off64T

public expect fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt

public expect fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt

public expect fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt

public expect fun recvmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT

public expect fun sendmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT

public expect fun sendfile(outFd: CInt, inFd: CInt, offset: OffT?, count: ULong): SsizeT

public expect fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: ULong): SsizeT

public expect fun shutdown(fd: CInt, how: CInt): CInt

public expect fun sethostname(name: String?, len: ULong): CInt

public expect fun getdomainname(name: String?, len: ULong): CInt

public expect fun setdomainname(name: String?, len: ULong): CInt

public expect fun ifNameindex(): IfNameindex?

public expect fun ifFreenameindex(ptr: IfNameindex?)

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: Ifaddrs?)

public expect fun uname(buf: Utsname?): CInt

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): Passwd?

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): Group?

public expect fun setspent()

public expect fun endspent()

public expect fun getspent(): Spwd?

public expect fun getspnam(name: String?): Spwd?

public expect fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun putpwent(p: Passwd?, stream: FILE?): CInt

public expect fun putgrent(grp: Group?, stream: FILE?): CInt

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt

public expect fun sgetspentR(s: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt

public expect fun getspentR(spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt

public expect fun getspnamR(name: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt

public expect fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: String?, buflen: CInt): Mntent?

public expect fun utmpname(file: String?): CInt

public expect fun utmpxname(file: String?): CInt

public expect fun getutxent(): Utmpx?

public expect fun getutxid(ut: Utmpx?): Utmpx?

public expect fun getutxline(ut: Utmpx?): Utmpx?

public expect fun pututxline(ut: Utmpx?): Utmpx?

public expect fun setutxent()

public expect fun endutxent()

public expect fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt

public expect fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun initgroups(user: String?, group: GidT): CInt

public expect fun getgrgid(gid: GidT): Group?

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getgrnam(name: String?): Group?

public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt

public expect fun setgroups(ngroups: ULong, ptr: GidT?): CInt

public expect fun acct(filename: String?): CInt

public expect fun setmntent(filename: String?, ty: String?): FILE?

public expect fun getmntent(stream: FILE?): Mntent?

public expect fun addmntent(stream: FILE?, mnt: Mntent?): CInt

public expect fun endmntent(streamp: FILE?): CInt

public expect fun hasmntopt(mnt: Mntent?, opt: String?): String?

public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt

public expect fun pthreadKill(threadid: PthreadT, signo: CInt): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadGetattrNp(thr: PthreadT, attr: PthreadAttrT?): CInt

public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt

public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt

public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt

public expect fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt

public expect fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt

public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, `val`: CInt?): CInt

public expect fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, `val`: CInt): CInt

public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt

public expect fun pthreadCondattrGetpshared(attr: PthreadCondattrT?, pshared: CInt?): CInt

public expect fun pthreadCondattrSetpshared(attr: PthreadCondattrT?, pshared: CInt): CInt

public expect fun pthreadOnce(control: PthreadOnceT?, routine: (() -> Unit)?): CInt

public expect fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt

public expect fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt

public expect fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt

public expect fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt

public expect fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUInt): CInt

public expect fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt

public expect fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt

public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt

public expect fun pthreadSigmask(how: CInt, newmask: SigsetT?, oldmask: SigsetT?): CInt

public expect fun schedGetparam(pid: PidT, param: SchedParam?): CInt

public expect fun schedSetparam(pid: PidT, param: SchedParam?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt

public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt

public expect fun clockGetres(clockId: ClockidT, res: Timespec?): CInt

public expect fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt

public expect fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt

public expect fun settimeofday(tv: Timeval?, tz: Timezone?): CInt

public expect fun asctimeR(tm: Tm?, buf: String?): String?

public expect fun ctimeR(timep: TimeT?, buf: String?): String?

public expect fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong

public expect fun strptime(s: String?, format: String?, tm: Tm?): String?

public expect fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt

public expect fun fstat(fd: CInt, buf: Stat?): CInt

public expect fun fstat64(fd: CInt, buf: Stat64?): CInt

public expect fun fstatat(fd: CInt, file: String?, buf: Stat?, flag: CInt): CInt

public expect fun fstatat64(fd: CInt, file: String?, buf: Stat64?, flag: CInt): CInt

public expect fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUInt, statxbuf: Statx?): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun ftruncate64(fd: CInt, length: Off64T): CInt

public expect fun truncate64(file: String?, length: Off64T): CInt

public expect fun lstat(file: String?, buf: Stat?): CInt

public expect fun lstat64(file: String?, buf: Stat64?): CInt

public expect fun statfs(path: String?, buf: Statfs?): CInt

public expect fun statfs64(file: String?, buf: Statfs64?): CInt

public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt

public expect fun fstatfs64(fildes: CInt, buf: Statfs64?): CInt

public expect fun statvfs(file: String?, buf: Statvfs?): CInt

public expect fun statvfs64(file: String?, buf: Statvfs64?): CInt

public expect fun fstatvfs(fildes: CInt, buf: Statvfs?): CInt

public expect fun fstatvfs64(fildes: CInt, buf: Statvfs64?): CInt

public expect fun open(file: String?, oflag: CInt, vararg args: Any?): CInt

public expect fun open64(file: String?, oflag: CInt, vararg args: Any?): CInt

public expect fun openat(fd: CInt, file: String?, oflag: CInt, vararg args: Any?): CInt

public expect fun openat64(fd: CInt, file: String?, oflag: CInt, vararg args: Any?): CInt

public expect fun fopen64(filename: String?, mode: String?): FILE?

public expect fun freopen64(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun creat64(path: String?, mode: ModeT): CInt

public expect fun mkostemp(template: String?, flags: CInt): CInt

public expect fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt

public expect fun mkstemps(template: String?, suffixlen: CInt): CInt

public expect fun tmpfile64(): FILE?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun getdtablesize(): CInt

public expect fun closeRange(first: CUInt, last: CUInt, flags: CInt): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt

public expect fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT

public expect fun getpt(): CInt

public expect fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt

public expect fun loginTty(fd: CInt): CInt

public expect fun ctermid(s: String?): String?

public expect fun clearenv(): CInt

public expect fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt

public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt

public expect fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt

public expect fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt

public expect fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt

public expect fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt

public expect fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt

public expect fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt

public expect fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT?, from: CInt): CInt

public expect fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT?, tcfd: CInt): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun euidaccess(pathname: String?, mode: CInt): CInt

public expect fun eaccess(pathname: String?, mode: CInt): CInt

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun stat(file: String?, buf: Stat?): CInt

public expect fun stat64(file: String?, buf: Stat64?): CInt

public expect fun readdir(dirp: DIR?): Dirent?

public expect fun readdir64(dirp: DIR?): Dirent64?

public expect fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt

public expect fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun dirfd(dirp: DIR?): CInt

public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt

public expect fun errnoLocation(): CInt?

public expect fun mmap64(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer?

public expect fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: CInt, vararg args: Any?): COpaquePointer?

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt

public expect fun sync()

public expect fun syncfs(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt

public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt

public expect fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt

public expect fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt

public expect fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun getpriority(which: PriorityWhich, who: IdT): CInt

public expect fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt

public expect fun getrandom(buffer: COpaquePointer?, length: ULong, flags: CUInt): SsizeT

public expect fun getentropy(buffer: COpaquePointer?, length: ULong): CInt

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer?

public expect fun strchrnul(s: String?, c: CInt): String?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUInt)

public expect fun drand48(): CDouble

public expect fun erand48(xseed: CUShort?): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: CUShort?): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: CUShort?): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: CUShort?): CUShort?

public expect fun lcong48(p: CUShort?)

public expect fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?)

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun memalign(align: ULong, size: ULong): COpaquePointer?

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun mallinfo(): Mallinfo

public expect fun mallinfo2(): Mallinfo2

public expect fun mallocInfo(options: CInt, stream: FILE?): CInt

public expect fun mallocUsableSize(ptr: COpaquePointer?): ULong

public expect fun mallocTrim(pad: ULong): CInt

public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT

public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong

public expect fun iconvClose(cd: IconvT): CInt

public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt

public expect fun backtrace(buf: COpaquePointer?, sz: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt

public expect fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong

public expect fun regfree(preg: RegexT?)

public expect fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt

public expect fun globfree(pglob: GlobT?)

public expect fun glob64(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: Glob64T?): CInt

public expect fun globfree64(pglob: Glob64T?)

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT

public expect fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT

public expect fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong): SsizeT

public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt

public expect fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt

public expect fun listxattr(path: String?, list: String?, size: ULong): SsizeT

public expect fun llistxattr(path: String?, list: String?, size: ULong): SsizeT

public expect fun flistxattr(filedes: CInt, list: String?, size: ULong): SsizeT

public expect fun removexattr(path: String?, name: String?): CInt

public expect fun lremovexattr(path: String?, name: String?): CInt

public expect fun fremovexattr(filedes: CInt, name: String?): CInt

public expect fun dirname(path: String?): String?

public expect fun posixBasename(path: String?): String?

public expect fun gnuBasename(path: String?): String?

public expect fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer?

public expect fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt

public expect fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun nlLanginfo(item: NlItem): String?

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): String?

public expect fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt

public expect fun gnuGetLibcRelease(): String?

public expect fun gnuGetLibcVersion(): String?
