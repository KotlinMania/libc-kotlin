// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public typealias IntmaxT = Long
public typealias UintmaxT = ULong
public typealias LocaleT = COpaquePointer?
public typealias SizeT = ULong
public typealias PtrdiffT = Long
public typealias IntptrT = Long
public typealias UintptrT = ULong
public typealias SsizeT = Long
public typealias PidT = Int
public typealias UidT = UInt
public typealias GidT = UInt
public typealias InAddrT = UInt
public typealias InPortT = UShort
public typealias SighandlerT = ULong
public typealias CcT = CUChar
public typealias SaFamilyT = UShort
public typealias PthreadKeyT = CUInt
public typealias SpeedT = CUInt
public typealias TcflagT = CUInt
public typealias ClockidT = CInt
public typealias KeyT = CInt
public typealias IdT = CUInt
public typealias UsecondsT = UInt
public typealias DevT = ULong
public typealias SocklenT = UInt
public typealias PthreadT = CULong
public typealias ModeT = UInt
public typealias Ino64T = ULong
public typealias Off64T = Long
public typealias Blkcnt64T = Long
public typealias Rlim64T = ULong
public typealias MqdT = CInt
public typealias NfdsT = CULong
public typealias NlItem = CInt
public typealias IdtypeT = CUInt
public typealias LoffT = CLongLong
public typealias U8 = CUChar
public typealias U16 = CUShort
public typealias S16 = CShort
public typealias U32 = CUInt
public typealias S32 = CInt
public typealias Elf32Half = UShort
public typealias Elf32Word = UInt
public typealias Elf32Off = UInt
public typealias Elf32Addr = UInt
public typealias Elf64Half = UShort
public typealias Elf64Word = UInt
public typealias Elf64Off = ULong
public typealias Elf64Addr = ULong
public typealias Elf64Xword = ULong
public typealias ClockT = CLong
public typealias TimeT = CLong
public typealias SusecondsT = CLong
public typealias InoT = ULong
public typealias OffT = Long
public typealias BlkcntT = Long
public typealias ShmattT = CULong
public typealias MsgqnumT = CULong
public typealias MsglenT = CULong
public typealias FsblkcntT = CULongLong
public typealias FsfilcntT = CULongLong
public typealias RlimT = CULongLong

public data class Group(
    val grName: String?,
    val grPasswd: String?,
    val grGid: GidT,
    val grMem: COpaquePointer?,
)

public data class Utimbuf(
    val actime: TimeT,
    val modtime: TimeT,
)

public data class Timeval(
    val tvSec: TimeT,
    val tvUsec: SusecondsT,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: CLong,
)

public data class Rlimit(
    val rlimCur: RlimT,
    val rlimMax: RlimT,
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

public data class InAddr(
    val sAddr: InAddrT,
)

public data class In6Addr(
    val s6Addr: UByteArray,
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

public data class Ipv6Mreq(
    val ipv6mrMultiaddr: In6Addr,
    val ipv6mrInterface: CUInt,
)

public data class Hostent(
    val hName: String?,
    val hAliases: COpaquePointer?,
    val hAddrtype: CInt,
    val hLength: CInt,
    val hAddrList: COpaquePointer?,
)

public data class Iovec(
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)

public data class Pollfd(
    val fd: CInt,
    val events: CShort,
    val revents: CShort,
)

public data class Winsize(
    val wsRow: CUShort,
    val wsCol: CUShort,
    val wsXpixel: CUShort,
    val wsYpixel: CUShort,
)

public data class Linger(
    val lOnoff: CInt,
    val lLinger: CInt,
)

public data class Sigval(
    val sivalPtr: COpaquePointer?,
)

public data class Itimerval(
    val itInterval: Timeval,
    val itValue: Timeval,
)

public data class Tms(
    val tmsUtime: ClockT,
    val tmsStime: ClockT,
    val tmsCutime: ClockT,
    val tmsCstime: ClockT,
)

public data class Servent(
    val sName: String?,
    val sAliases: COpaquePointer?,
    val sPort: CInt,
    val sProto: String?,
)

public data class Protoent(
    val pName: String?,
    val pAliases: COpaquePointer?,
    val pProto: CInt,
)

public data class Aiocb(
    val aioFildes: CInt,
    val aioLioOpcode: CInt,
    val aioReqprio: CInt,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioSigevent: Sigevent,
    val td: COpaquePointer?,
    val lock: IntArray,
    val err: CInt,
    val ret: SsizeT,
    val aioOffset: OffT,
    val next: COpaquePointer?,
    val prev: COpaquePointer?,
    val dummy4: ByteArray,
    val dummy42: ByteArray,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
    val saRestorer: (() -> Unit)?,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CcT,
    val cCc: List<CcT>,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
)

public data class Ucred(
    val pid: PidT,
    val uid: UidT,
    val gid: GidT,
)

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

public data class SockaddrIn6(
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class SockaddrVm(
    val svmFamily: SaFamilyT,
    val svmPort: InPortT,
    val svmCid: CUInt,
    val svmZero: UByteArray,
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

public data class SockaddrLl(
    val sllFamily: CUShort,
    val sllProtocol: CUShort,
    val sllIfindex: CInt,
    val sllHatype: CUShort,
    val sllPkttype: CUChar,
    val sllHalen: CUChar,
    val sllAddr: UByteArray,
)

public data class FdSet(
    val fdsBits: ULongArray,
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

public data class SchedParam(
    val schedPriority: CInt,
    val schedSsLowPriority: CInt,
    val schedSsReplPeriod: Timespec,
    val schedSsInitBudget: Timespec,
    val schedSsMaxRepl: CInt,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class EpollEvent(
    val events: UInt,
    val u64: ULong,
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

public data class Rlimit64(
    val rlimCur: Rlim64T,
    val rlimMax: Rlim64T,
)

public data class GlobT(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: CInt,
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
    val fFsid2: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fSpare: IntArray,
)

public data class Dqblk(
    val dqbBhardlimit: ULong,
    val dqbBsoftlimit: ULong,
    val dqbCurspace: ULong,
    val dqbIhardlimit: ULong,
    val dqbIsoftlimit: ULong,
    val dqbCurinodes: ULong,
    val dqbBtime: ULong,
    val dqbItime: ULong,
    val dqbValid: UInt,
)

public data class SignalfdSiginfo(
    val ssiSigno: UInt,
    val ssiErrno: Int,
    val ssiCode: Int,
    val ssiPid: UInt,
    val ssiUid: UInt,
    val ssiFd: Int,
    val ssiTid: UInt,
    val ssiBand: UInt,
    val ssiOverrun: UInt,
    val ssiTrapno: UInt,
    val ssiStatus: Int,
    val ssiInt: Int,
    val ssiPtr: ULong,
    val ssiUtime: ULong,
    val ssiStime: ULong,
    val ssiAddr: ULong,
    val ssiAddrLsb: UShort,
    val ssiSyscall: Int,
    val ssiCallAddr: ULong,
    val ssiArch: UInt,
)

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public data class FsidT(
    val `val`: IntArray,
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

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: CUInt,
)

public data class Sembuf(
    val semNum: CUShort,
    val semOp: CShort,
    val semFlg: CShort,
)

public data class InputEvent(
    val time: Timeval,
    val type: U16,
    val code: U16,
    val value: S32,
)

public data class InputId(
    val bustype: U16,
    val vendor: U16,
    val product: U16,
    val version: U16,
)

public data class InputAbsinfo(
    val value: S32,
    val minimum: S32,
    val maximum: S32,
    val fuzz: S32,
    val flat: S32,
    val resolution: S32,
)

public data class InputKeymapEntry(
    val flags: U8,
    val len: U8,
    val index: U16,
    val keycode: U32,
    val scancode: List<U8>,
)

public data class InputMask(
    val type: U32,
    val codesSize: U32,
    val codesPtr: U64,
)

public data class FfReplay(
    val length: U16,
    val delay: U16,
)

public data class FfTrigger(
    val button: U16,
    val interval: U16,
)

public data class FfEnvelope(
    val attackLength: U16,
    val attackLevel: U16,
    val fadeLength: U16,
    val fadeLevel: U16,
)

public data class FfConstantEffect(
    val level: S16,
    val envelope: FfEnvelope,
)

public data class FfRampEffect(
    val startLevel: S16,
    val endLevel: S16,
    val envelope: FfEnvelope,
)

public data class FfConditionEffect(
    val rightSaturation: U16,
    val leftSaturation: U16,
    val rightCoeff: S16,
    val leftCoeff: S16,
    val deadband: U16,
    val center: S16,
)

public data class FfPeriodicEffect(
    val waveform: U16,
    val period: U16,
    val magnitude: S16,
    val offset: S16,
    val phase: U16,
    val envelope: FfEnvelope,
    val customLen: U32,
    val customData: S16?,
)

public data class FfRumbleEffect(
    val strongMagnitude: U16,
    val weakMagnitude: U16,
)

public data class FfEffect(
    val type: U16,
    val id: S16,
    val direction: U16,
    val trigger: FfTrigger,
    val replay: FfReplay,
    val u: ULongArray,
    val u2: UIntArray,
)

public data class DlPhdrInfo(
    val dlpiAddr: Elf64Addr,
    val dlpiAddr2: Elf32Addr,
    val dlpiName: String?,
    val dlpiPhdr: Elf64Phdr?,
    val dlpiPhdr2: Elf32Phdr?,
    val dlpiPhnum: Elf64Half,
    val dlpiPhnum2: Elf32Half,
    val dlpiAdds: CULongLong,
    val dlpiSubs: CULongLong,
    val dlpiTlsModid: ULong,
    val dlpiTlsData: COpaquePointer?,
)

public data class Elf32Phdr(
    val pType: Elf32Word,
    val pOffset: Elf32Off,
    val pVaddr: Elf32Addr,
    val pPaddr: Elf32Addr,
    val pFilesz: Elf32Word,
    val pMemsz: Elf32Word,
    val pFlags: Elf32Word,
    val pAlign: Elf32Word,
)

public data class Elf64Phdr(
    val pType: Elf64Word,
    val pFlags: Elf64Word,
    val pOffset: Elf64Off,
    val pVaddr: Elf64Addr,
    val pPaddr: Elf64Addr,
    val pFilesz: Elf64Xword,
    val pMemsz: Elf64Xword,
    val pAlign: Elf64Xword,
)

public data class Statfs64(
    val fType: CULong,
    val fBsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFsid: FsidT,
    val fNamelen: CULong,
    val fFrsize: CULong,
    val fFlags: CULong,
    val fSpare: ULongArray,
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

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
)

public data class PthreadAttrT(
    val size: ULongArray,
)

public data class SigsetT(
    val `val`: ULongArray,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmCpid: PidT,
    val shmLpid: PidT,
    val shmNattch: CULong,
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

public data class Statfs(
    val fType: CULong,
    val fBsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFsid: FsidT,
    val fNamelen: CULong,
    val fFrsize: CULong,
    val fFlags: CULong,
    val fSpare: ULongArray,
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
    val pad1: CInt,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class SemT(
    val `val`: IntArray,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val pad: IntArray,
    val align: List<ULong>,
)

public data class Termios2(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CcT,
    val cCc: List<CcT>,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: CUInt,
)

public data class PthreadMutexattrT(
    val size: UByteArray,
)

public data class PthreadRwlockattrT(
    val size: UByteArray,
)

public data class PthreadCondattrT(
    val size: UByteArray,
)

public data class Sysinfo(
    val uptime: CULong,
    val loads: ULongArray,
    val totalram: CULong,
    val freeram: CULong,
    val sharedram: CULong,
    val bufferram: CULong,
    val totalswap: CULong,
    val freeswap: CULong,
    val procs: CUShort,
    val pad: CUShort,
    val totalhigh: CULong,
    val freehigh: CULong,
    val memUnit: CUInt,
)

public data class SockaddrUn(
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class SockaddrStorage(
    val ssFamily: SaFamilyT,
    val ssAlign: ULong,
)

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
    val domainname: ByteArray,
)

public data class Dirent(
    val dIno: InoT,
    val dOff: OffT,
    val dReclen: CUShort,
    val dType: CUChar,
    val dName: ByteArray,
)

public data class Dirent64(
    val dIno: Ino64T,
    val dOff: Off64T,
    val dReclen: CUShort,
    val dType: CUChar,
    val dName: ByteArray,
)

public data class MqAttr(
    val mqFlags: Long,
    val mqMaxmsg: Long,
    val mqMsgsize: Long,
    val mqCurmsgs: Long,
    val mqFlags2: CLong,
    val mqMaxmsg2: CLong,
    val mqMsgsize2: CLong,
    val mqCurmsgs2: CLong,
)

public data class SockaddrNl(
    val nlFamily: SaFamilyT,
    val nlPid: UInt,
    val nlGroups: UInt,
)

public data class Sigevent(
    val sigevValue: Sigval,
    val sigevSigno: CInt,
    val sigevNotify: CInt,
    val sigevNotifyFunction: ((Sigval) -> Unit)?,
    val sigevNotifyAttributes: PthreadAttrT?,
    val pad: ByteArray,
)

public data class PthreadMutexT(
    val size: UByteArray,
)

public data class PthreadRwlockT(
    val size: UByteArray,
)

public data class PthreadCondT(
    val size: UByteArray,
)

public const val INT_MIN: CInt = -2147483648
public const val INT_MAX: CInt = 2147483647
public val SIG_DFL: SighandlerT = 0.toSighandlerT()
public val SIG_IGN: SighandlerT = 1.toSighandlerT()
public val SIG_ERR: SighandlerT = 0.toSighandlerT().inv()
public val DT_UNKNOWN: UByte = (0).toUByte()
public val DT_FIFO: UByte = (1).toUByte()
public val DT_CHR: UByte = (2).toUByte()
public val DT_DIR: UByte = (4).toUByte()
public val DT_BLK: UByte = (6).toUByte()
public val DT_REG: UByte = (8).toUByte()
public val DT_LNK: UByte = (10).toUByte()
public val DT_SOCK: UByte = (12).toUByte()
public const val FD_CLOEXEC: CInt = 0x1
public const val USRQUOTA: CInt = 0
public const val GRPQUOTA: CInt = 1
public const val SIGIOT: CInt = 6
public const val S_ISUID: ModeT = 2048u
public const val S_ISGID: ModeT = 1024u
public const val S_ISVTX: ModeT = 512u
public const val IF_NAMESIZE: ULong = 16uL
public const val IFNAMSIZ: ULong = IF_NAMESIZE
public const val LOG_EMERG: CInt = 0
public const val LOG_ALERT: CInt = 1
public const val LOG_CRIT: CInt = 2
public const val LOG_ERR: CInt = 3
public const val LOG_WARNING: CInt = 4
public const val LOG_NOTICE: CInt = 5
public const val LOG_INFO: CInt = 6
public const val LOG_DEBUG: CInt = 7
public const val LOG_KERN: CInt = 0
public val LOG_USER: CInt = 1 shl 3
public val LOG_MAIL: CInt = 2 shl 3
public val LOG_DAEMON: CInt = 3 shl 3
public val LOG_AUTH: CInt = 4 shl 3
public val LOG_SYSLOG: CInt = 5 shl 3
public val LOG_LPR: CInt = 6 shl 3
public val LOG_NEWS: CInt = 7 shl 3
public val LOG_UUCP: CInt = 8 shl 3
public val LOG_LOCAL0: CInt = 16 shl 3
public val LOG_LOCAL1: CInt = 17 shl 3
public val LOG_LOCAL2: CInt = 18 shl 3
public val LOG_LOCAL3: CInt = 19 shl 3
public val LOG_LOCAL4: CInt = 20 shl 3
public val LOG_LOCAL5: CInt = 21 shl 3
public val LOG_LOCAL6: CInt = 22 shl 3
public val LOG_LOCAL7: CInt = 23 shl 3
public const val LOG_PID: CInt = 0x01
public const val LOG_CONS: CInt = 0x02
public const val LOG_ODELAY: CInt = 0x04
public const val LOG_NDELAY: CInt = 0x08
public const val LOG_NOWAIT: CInt = 0x10
public const val LOG_PRIMASK: CInt = 7
public const val LOG_FACMASK: CInt = 0x3f8
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
public const val PRIO_MIN: CInt = -20
public const val PRIO_MAX: CInt = 20
public const val IPPROTO_ICMP: CInt = 1
public const val IPPROTO_ICMPV6: CInt = 58
public const val IPPROTO_TCP: CInt = 6
public const val IPPROTO_UDP: CInt = 17
public const val IPPROTO_IP: CInt = 0
public const val IPPROTO_IPV6: CInt = 41
public const val INADDR_LOOPBACK: InAddrT = 2130706433u
public const val INADDR_ANY: InAddrT = 0u
public const val INADDR_BROADCAST: InAddrT = 4294967295u
public const val INADDR_NONE: InAddrT = 4294967295u
public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val RAND_MAX: CInt = 2147483647
public const val EOF: CInt = -1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val _IOFBF: CInt = 0
public const val _IONBF: CInt = 2
public const val _IOLBF: CInt = 1
public const val F_DUPFD: CInt = 0
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val F_SETLEASE: CInt = 1024
public const val F_GETLEASE: CInt = 1025
public const val F_NOTIFY: CInt = 1026
public const val F_CANCELLK: CInt = 1029
public const val F_DUPFD_CLOEXEC: CInt = 1030
public const val F_SETPIPE_SZ: CInt = 1031
public const val F_GETPIPE_SZ: CInt = 1032
public const val F_ADD_SEALS: CInt = 1033
public const val F_GET_SEALS: CInt = 1034
public const val F_SEAL_SEAL: CInt = 0x0001
public const val F_SEAL_SHRINK: CInt = 0x0002
public const val F_SEAL_GROW: CInt = 0x0004
public const val F_SEAL_WRITE: CInt = 0x0008
public const val SIGTRAP: CInt = 5
public const val PTHREAD_CREATE_JOINABLE: CInt = 0
public const val PTHREAD_CREATE_DETACHED: CInt = 1
public const val CLOCK_REALTIME: ClockidT = 0
public const val CLOCK_MONOTONIC: ClockidT = 1
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2
public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 3
public const val CLOCK_MONOTONIC_RAW: ClockidT = 4
public const val CLOCK_REALTIME_COARSE: ClockidT = 5
public const val CLOCK_MONOTONIC_COARSE: ClockidT = 6
public const val CLOCK_BOOTTIME: ClockidT = 7
public const val CLOCK_REALTIME_ALARM: ClockidT = 8
public const val CLOCK_BOOTTIME_ALARM: ClockidT = 9
public const val CLOCK_SGI_CYCLE: ClockidT = 10
public const val CLOCK_TAI: ClockidT = 11
public const val TIMER_ABSTIME: CInt = 1
public const val RLIMIT_CPU: CInt = 0
public const val RLIMIT_FSIZE: CInt = 1
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_STACK: CInt = 3
public const val RLIMIT_CORE: CInt = 4
public const val RLIMIT_LOCKS: CInt = 10
public const val RLIMIT_SIGPENDING: CInt = 11
public const val RLIMIT_MSGQUEUE: CInt = 12
public const val RLIMIT_NICE: CInt = 13
public const val RLIMIT_RTPRIO: CInt = 14
public const val RUSAGE_SELF: CInt = 0
public const val O_RDONLY: CInt = 0
public const val O_WRONLY: CInt = 1
public const val O_RDWR: CInt = 2
public const val S_IFIFO: ModeT = 4096u
public const val S_IFCHR: ModeT = 8192u
public const val S_IFBLK: ModeT = 24576u
public const val S_IFDIR: ModeT = 16384u
public const val S_IFREG: ModeT = 32768u
public const val S_IFLNK: ModeT = 40960u
public const val S_IFSOCK: ModeT = 49152u
public const val S_IFMT: ModeT = 61440u
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
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGABRT: CInt = 6
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGSEGV: CInt = 11
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val PROT_NONE: CInt = 0
public const val PROT_READ: CInt = 1
public const val PROT_WRITE: CInt = 2
public const val PROT_EXEC: CInt = 4
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
public const val MAP_FILE: CInt = 0x0000
public const val MAP_SHARED: CInt = 0x0001
public const val MAP_PRIVATE: CInt = 0x0002
public const val MAP_FIXED: CInt = 0x0010
public const val MS_ASYNC: CInt = 0x0001
public const val MS_INVALIDATE: CInt = 0x0002
public const val MS_SYNC: CInt = 0x0004
public const val MS_RDONLY: CULong = 0x01uL
public const val MS_NOSUID: CULong = 0x02uL
public const val MS_NODEV: CULong = 0x04uL
public const val MS_NOEXEC: CULong = 0x08uL
public const val MS_SYNCHRONOUS: CULong = 0x10uL
public const val MS_REMOUNT: CULong = 0x20uL
public const val MS_MANDLOCK: CULong = 0x40uL
public const val MS_DIRSYNC: CULong = 0x80uL
public const val MS_NOATIME: CULong = 0x0400uL
public const val MS_NODIRATIME: CULong = 0x0800uL
public const val MS_BIND: CULong = 0x1000uL
public const val MS_MOVE: CULong = 0x2000uL
public const val MS_REC: CULong = 0x4000uL
public const val MS_SILENT: CULong = 0x8000uL
public const val MS_POSIXACL: CULong = 0x010000uL
public const val MS_UNBINDABLE: CULong = 0x020000uL
public const val MS_PRIVATE: CULong = 0x040000uL
public const val MS_SLAVE: CULong = 0x080000uL
public const val MS_SHARED: CULong = 0x100000uL
public const val MS_RELATIME: CULong = 0x200000uL
public const val MS_KERNMOUNT: CULong = 0x400000uL
public const val MS_I_VERSION: CULong = 0x800000uL
public const val MS_STRICTATIME: CULong = 0x1000000uL
public const val MS_ACTIVE: CULong = 0x40000000uL
public const val MS_NOUSER: CULong = 0x80000000uL
public const val MS_MGC_VAL: CULong = 0xc0ed0000uL
public const val MS_MGC_MSK: CULong = 0xffff0000uL
public const val MS_RMT_MASK: CULong = 0x800051uL
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
public const val EWOULDBLOCK: CInt = EAGAIN
public const val SCM_RIGHTS: CInt = 0x01
public const val SCM_CREDENTIALS: CInt = 0x02
public const val PROT_GROWSDOWN: CInt = 0x1000000
public const val PROT_GROWSUP: CInt = 0x2000000
public const val MAP_TYPE: CInt = 0x000f
public const val MADV_NORMAL: CInt = 0
public const val MADV_RANDOM: CInt = 1
public const val MADV_SEQUENTIAL: CInt = 2
public const val MADV_WILLNEED: CInt = 3
public const val MADV_DONTNEED: CInt = 4
public const val MADV_FREE: CInt = 8
public const val MADV_REMOVE: CInt = 9
public const val MADV_DONTFORK: CInt = 10
public const val MADV_DOFORK: CInt = 11
public const val MADV_MERGEABLE: CInt = 12
public const val MADV_UNMERGEABLE: CInt = 13
public const val MADV_HUGEPAGE: CInt = 14
public const val MADV_NOHUGEPAGE: CInt = 15
public const val MADV_DONTDUMP: CInt = 16
public const val MADV_DODUMP: CInt = 17
public const val MADV_HWPOISON: CInt = 100
public const val MADV_SOFT_OFFLINE: CInt = 101
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
public const val IFF_TUN: CInt = 0x0001
public const val IFF_TAP: CInt = 0x0002
public const val IFF_NO_PI: CInt = 0x1000
public const val SOL_IP: CInt = 0
public const val SOL_TCP: CInt = 6
public const val SOL_UDP: CInt = 17
public const val SOL_IPV6: CInt = 41
public const val SOL_ICMPV6: CInt = 58
public const val SOL_RAW: CInt = 255
public const val SOL_DECNET: CInt = 261
public const val SOL_X25: CInt = 262
public const val SOL_PACKET: CInt = 263
public const val SOL_ATM: CInt = 264
public const val SOL_AAL: CInt = 265
public const val SOL_IRDA: CInt = 266
public const val SOL_NETBEUI: CInt = 267
public const val SOL_LLC: CInt = 268
public const val SOL_DCCP: CInt = 269
public const val SOL_NETLINK: CInt = 270
public const val SOL_TIPC: CInt = 271
public const val AF_UNSPEC: CInt = 0
public const val AF_UNIX: CInt = 1
public const val AF_LOCAL: CInt = 1
public const val AF_INET: CInt = 2
public const val AF_AX25: CInt = 3
public const val AF_IPX: CInt = 4
public const val AF_APPLETALK: CInt = 5
public const val AF_NETROM: CInt = 6
public const val AF_BRIDGE: CInt = 7
public const val AF_ATMPVC: CInt = 8
public const val AF_X25: CInt = 9
public const val AF_INET6: CInt = 10
public const val AF_ROSE: CInt = 11
public const val AF_DECnet: CInt = 12
public const val AF_NETBEUI: CInt = 13
public const val AF_SECURITY: CInt = 14
public const val AF_KEY: CInt = 15
public const val AF_NETLINK: CInt = 16
public const val AF_ROUTE: CInt = AF_NETLINK
public const val AF_PACKET: CInt = 17
public const val AF_ASH: CInt = 18
public const val AF_ECONET: CInt = 19
public const val AF_ATMSVC: CInt = 20
public const val AF_RDS: CInt = 21
public const val AF_SNA: CInt = 22
public const val AF_IRDA: CInt = 23
public const val AF_PPPOX: CInt = 24
public const val AF_WANPIPE: CInt = 25
public const val AF_LLC: CInt = 26
public const val AF_CAN: CInt = 29
public const val AF_TIPC: CInt = 30
public const val AF_BLUETOOTH: CInt = 31
public const val AF_IUCV: CInt = 32
public const val AF_RXRPC: CInt = 33
public const val AF_ISDN: CInt = 34
public const val AF_PHONET: CInt = 35
public const val AF_IEEE802154: CInt = 36
public const val AF_CAIF: CInt = 37
public const val AF_ALG: CInt = 38
public const val PF_UNSPEC: CInt = AF_UNSPEC
public const val PF_UNIX: CInt = AF_UNIX
public const val PF_LOCAL: CInt = AF_LOCAL
public const val PF_INET: CInt = AF_INET
public const val PF_AX25: CInt = AF_AX25
public const val PF_IPX: CInt = AF_IPX
public const val PF_APPLETALK: CInt = AF_APPLETALK
public const val PF_NETROM: CInt = AF_NETROM
public const val PF_BRIDGE: CInt = AF_BRIDGE
public const val PF_ATMPVC: CInt = AF_ATMPVC
public const val PF_X25: CInt = AF_X25
public const val PF_INET6: CInt = AF_INET6
public const val PF_ROSE: CInt = AF_ROSE
public const val PF_DECnet: CInt = AF_DECnet
public const val PF_NETBEUI: CInt = AF_NETBEUI
public const val PF_SECURITY: CInt = AF_SECURITY
public const val PF_KEY: CInt = AF_KEY
public const val PF_NETLINK: CInt = AF_NETLINK
public const val PF_ROUTE: CInt = AF_ROUTE
public const val PF_PACKET: CInt = AF_PACKET
public const val PF_ASH: CInt = AF_ASH
public const val PF_ECONET: CInt = AF_ECONET
public const val PF_ATMSVC: CInt = AF_ATMSVC
public const val PF_RDS: CInt = AF_RDS
public const val PF_SNA: CInt = AF_SNA
public const val PF_IRDA: CInt = AF_IRDA
public const val PF_PPPOX: CInt = AF_PPPOX
public const val PF_WANPIPE: CInt = AF_WANPIPE
public const val PF_LLC: CInt = AF_LLC
public const val PF_CAN: CInt = AF_CAN
public const val PF_TIPC: CInt = AF_TIPC
public const val PF_BLUETOOTH: CInt = AF_BLUETOOTH
public const val PF_IUCV: CInt = AF_IUCV
public const val PF_RXRPC: CInt = AF_RXRPC
public const val PF_ISDN: CInt = AF_ISDN
public const val PF_PHONET: CInt = AF_PHONET
public const val PF_IEEE802154: CInt = AF_IEEE802154
public const val PF_CAIF: CInt = AF_CAIF
public const val PF_ALG: CInt = AF_ALG
public const val SOMAXCONN: CInt = 128
public const val MSG_OOB: CInt = 1
public const val MSG_PEEK: CInt = 2
public const val MSG_DONTROUTE: CInt = 4
public const val MSG_CTRUNC: CInt = 8
public const val MSG_TRUNC: CInt = 0x20
public const val MSG_DONTWAIT: CInt = 0x40
public const val MSG_EOR: CInt = 0x80
public const val MSG_WAITALL: CInt = 0x100
public const val MSG_FIN: CInt = 0x200
public const val MSG_SYN: CInt = 0x400
public const val MSG_CONFIRM: CInt = 0x800
public const val MSG_RST: CInt = 0x1000
public const val MSG_ERRQUEUE: CInt = 0x2000
public const val MSG_NOSIGNAL: CInt = 0x4000
public const val MSG_MORE: CInt = 0x8000
public const val MSG_WAITFORONE: CInt = 0x10000
public const val MSG_FASTOPEN: CInt = 0x20000000
public const val MSG_CMSG_CLOEXEC: CInt = 0x40000000
public const val SCM_TIMESTAMP: CInt = SO_TIMESTAMP
public const val SOCK_RAW: CInt = 3
public const val SOCK_RDM: CInt = 4
public const val IP_TOS: CInt = 1
public const val IP_TTL: CInt = 2
public const val IP_HDRINCL: CInt = 3
public const val IP_RECVTOS: CInt = 13
public const val IP_FREEBIND: CInt = 15
public const val IP_TRANSPARENT: CInt = 19
public const val IP_MULTICAST_IF: CInt = 32
public const val IP_MULTICAST_TTL: CInt = 33
public const val IP_MULTICAST_LOOP: CInt = 34
public const val IP_ADD_MEMBERSHIP: CInt = 35
public const val IP_DROP_MEMBERSHIP: CInt = 36
public const val IPV6_UNICAST_HOPS: CInt = 16
public const val IPV6_MULTICAST_IF: CInt = 17
public const val IPV6_MULTICAST_HOPS: CInt = 18
public const val IPV6_MULTICAST_LOOP: CInt = 19
public const val IPV6_ADD_MEMBERSHIP: CInt = 20
public const val IPV6_DROP_MEMBERSHIP: CInt = 21
public const val IPV6_V6ONLY: CInt = 26
public const val IPV6_RECVPKTINFO: CInt = 49
public const val IPV6_RECVTCLASS: CInt = 66
public const val IPV6_TCLASS: CInt = 67
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
public const val SO_DEBUG: CInt = 1
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val LOCK_SH: CInt = 1
public const val LOCK_EX: CInt = 2
public const val LOCK_NB: CInt = 4
public const val LOCK_UN: CInt = 8
public const val SS_ONSTACK: CInt = 1
public const val SS_DISABLE: CInt = 2
public const val PATH_MAX: CInt = 4096
public const val FD_SETSIZE: ULong = 1024uL
public const val EPOLLIN: CInt = 0x1
public const val EPOLLPRI: CInt = 0x2
public const val EPOLLOUT: CInt = 0x4
public const val EPOLLRDNORM: CInt = 0x40
public const val EPOLLRDBAND: CInt = 0x80
public const val EPOLLWRNORM: CInt = 0x100
public const val EPOLLWRBAND: CInt = 0x200
public const val EPOLLMSG: CInt = 0x400
public const val EPOLLERR: CInt = 0x8
public const val EPOLLHUP: CInt = 0x10
public const val EPOLLET: CInt = 0x80000000.toInt()
public const val EPOLL_CTL_ADD: CInt = 1
public const val EPOLL_CTL_MOD: CInt = 3
public const val EPOLL_CTL_DEL: CInt = 2
public const val MNT_DETACH: CInt = 0x2
public const val MNT_EXPIRE: CInt = 0x4
public const val Q_GETFMT: CInt = 0x800004
public const val Q_GETINFO: CInt = 0x800005
public const val Q_SETINFO: CInt = 0x800006
public const val QIF_BLIMITS: UInt = 1u
public const val QIF_SPACE: UInt = 2u
public const val QIF_ILIMITS: UInt = 4u
public const val QIF_INODES: UInt = 8u
public const val QIF_BTIME: UInt = 16u
public const val QIF_ITIME: UInt = 32u
public const val QIF_LIMITS: UInt = 5u
public const val QIF_USAGE: UInt = 10u
public const val QIF_TIMES: UInt = 48u
public const val QIF_ALL: UInt = 63u
public const val MNT_FORCE: CInt = 0x1
public const val Q_SYNC: CInt = 0x800001
public const val Q_QUOTAON: CInt = 0x800002
public const val Q_QUOTAOFF: CInt = 0x800003
public const val Q_GETQUOTA: CInt = 0x800007
public const val Q_SETQUOTA: CInt = 0x800008
public const val TCIOFF: CInt = 2
public const val TCION: CInt = 3
public const val TCOOFF: CInt = 0
public const val TCOON: CInt = 1
public const val TCIFLUSH: CInt = 0
public const val TCOFLUSH: CInt = 1
public const val TCIOFLUSH: CInt = 2
public const val NL0: CInt = 0x00000000
public const val NL1: CInt = 0x00000100
public const val TAB0: CInt = 0x00000000
public const val CR0: CInt = 0x00000000
public const val FF0: CInt = 0x00000000
public const val BS0: CInt = 0x00000000
public const val VT0: CInt = 0x00000000
public const val VERASE: ULong = 2uL
public const val VKILL: ULong = 3uL
public const val VINTR: ULong = 0uL
public const val VQUIT: ULong = 1uL
public const val VLNEXT: ULong = 15uL
public const val IGNBRK: TcflagT = 0x00000001u
public const val BRKINT: TcflagT = 0x00000002u
public const val IGNPAR: TcflagT = 0x00000004u
public const val PARMRK: TcflagT = 0x00000008u
public const val INPCK: TcflagT = 0x00000010u
public const val ISTRIP: TcflagT = 0x00000020u
public const val INLCR: TcflagT = 0x00000040u
public const val IGNCR: TcflagT = 0x00000080u
public const val ICRNL: TcflagT = 0x00000100u
public const val IXANY: TcflagT = 0x00000800u
public const val IMAXBEL: TcflagT = 0x00002000u
public const val OPOST: TcflagT = 0x1u
public const val CS5: TcflagT = 0x00000000u
public const val CRTSCTS: TcflagT = 0x80000000u
public const val ECHO: TcflagT = 0x00000008u
public const val OCRNL: TcflagT = 8u
public const val ONOCR: TcflagT = 16u
public const val ONLRET: TcflagT = 32u
public const val OFILL: TcflagT = 64u
public const val OFDEL: TcflagT = 128u
public const val CLONE_VM: CInt = 0x100
public const val CLONE_FS: CInt = 0x200
public const val CLONE_FILES: CInt = 0x400
public const val CLONE_SIGHAND: CInt = 0x800
public const val CLONE_PTRACE: CInt = 0x2000
public const val CLONE_VFORK: CInt = 0x4000
public const val CLONE_PARENT: CInt = 0x8000
public const val CLONE_THREAD: CInt = 0x10000
public const val CLONE_NEWNS: CInt = 0x20000
public const val CLONE_SYSVSEM: CInt = 0x40000
public const val CLONE_SETTLS: CInt = 0x80000
public const val CLONE_PARENT_SETTID: CInt = 0x100000
public const val CLONE_CHILD_CLEARTID: CInt = 0x200000
public const val CLONE_DETACHED: CInt = 0x400000
public const val CLONE_UNTRACED: CInt = 0x800000
public const val CLONE_CHILD_SETTID: CInt = 0x01000000
public const val CLONE_NEWUTS: CInt = 0x04000000
public const val CLONE_NEWIPC: CInt = 0x08000000
public const val CLONE_NEWUSER: CInt = 0x10000000
public const val CLONE_NEWPID: CInt = 0x20000000
public const val CLONE_NEWNET: CInt = 0x40000000
public const val CLONE_IO: CInt = 0x80000000.toInt()
public const val CLONE_NEWCGROUP: CInt = 0x02000000
public const val WNOHANG: CInt = 0x00000001
public const val WUNTRACED: CInt = 0x00000002
public const val WSTOPPED: CInt = WUNTRACED
public const val WEXITED: CInt = 0x00000004
public const val WCONTINUED: CInt = 0x00000008
public const val WNOWAIT: CInt = 0x01000000
public const val PTRACE_O_TRACESYSGOOD: CInt = 0x00000001
public const val PTRACE_O_TRACEFORK: CInt = 0x00000002
public const val PTRACE_O_TRACEVFORK: CInt = 0x00000004
public const val PTRACE_O_TRACECLONE: CInt = 0x00000008
public const val PTRACE_O_TRACEEXEC: CInt = 0x00000010
public const val PTRACE_O_TRACEVFORKDONE: CInt = 0x00000020
public const val PTRACE_O_TRACEEXIT: CInt = 0x00000040
public const val PTRACE_O_TRACESECCOMP: CInt = 0x00000080
public const val PTRACE_O_EXITKILL: CInt = 0x00100000
public const val PTRACE_O_SUSPEND_SECCOMP: CInt = 0x00200000
public const val PTRACE_O_MASK: CInt = 0x003000ff
public const val PTRACE_EVENT_FORK: CInt = 1
public const val PTRACE_EVENT_VFORK: CInt = 2
public const val PTRACE_EVENT_CLONE: CInt = 3
public const val PTRACE_EVENT_EXEC: CInt = 4
public const val PTRACE_EVENT_VFORK_DONE: CInt = 5
public const val PTRACE_EVENT_EXIT: CInt = 6
public const val PTRACE_EVENT_SECCOMP: CInt = 7
public const val PTRACE_EVENT_STOP: CInt = 128
public const val __WNOTHREAD: CInt = 0x20000000
public const val __WALL: CInt = 0x40000000
public const val __WCLONE: CInt = 0x80000000.toInt()
public const val SPLICE_F_MOVE: CUInt = 0x01u
public const val SPLICE_F_NONBLOCK: CUInt = 0x02u
public const val SPLICE_F_MORE: CUInt = 0x04u
public const val SPLICE_F_GIFT: CUInt = 0x08u
public const val RTLD_LOCAL: CInt = 0
public const val RTLD_LAZY: CInt = 1
public const val POSIX_FADV_NORMAL: CInt = 0
public const val POSIX_FADV_RANDOM: CInt = 1
public const val POSIX_FADV_SEQUENTIAL: CInt = 2
public const val POSIX_FADV_WILLNEED: CInt = 3
public const val AT_FDCWD: CInt = -100
public const val AT_SYMLINK_NOFOLLOW: CInt = 0x100
public const val AT_REMOVEDIR: CInt = 0x200
public const val AT_EACCESS: CInt = 0x200
public const val AT_SYMLINK_FOLLOW: CInt = 0x400
public const val AT_NO_AUTOMOUNT: CInt = 0x800
public const val AT_EMPTY_PATH: CInt = 0x1000
public val LOG_CRON: CInt = 9 shl 3
public val LOG_AUTHPRIV: CInt = 10 shl 3
public val LOG_FTP: CInt = 11 shl 3
public const val LOG_PERROR: CInt = 0x20
public const val PIPE_BUF: ULong = 4096uL
public const val SI_LOAD_SHIFT: CUInt = 16u
public const val CLD_EXITED: CInt = 1
public const val CLD_KILLED: CInt = 2
public const val CLD_DUMPED: CInt = 3
public const val CLD_TRAPPED: CInt = 4
public const val CLD_STOPPED: CInt = 5
public const val CLD_CONTINUED: CInt = 6
public const val SIGEV_SIGNAL: CInt = 0
public const val SIGEV_NONE: CInt = 1
public const val SIGEV_THREAD: CInt = 2
public const val P_ALL: IdtypeT = 0u
public const val P_PID: IdtypeT = 1u
public const val P_PGID: IdtypeT = 2u
public const val UTIME_OMIT: CLong = 1073741822
public const val UTIME_NOW: CLong = 1073741823
public const val POLLIN: CShort = 0x1
public const val POLLPRI: CShort = 0x2
public const val POLLOUT: CShort = 0x4
public const val POLLERR: CShort = 0x8
public const val POLLHUP: CShort = 0x10
public const val POLLNVAL: CShort = 0x20
public const val POLLRDNORM: CShort = 0x040
public const val POLLRDBAND: CShort = 0x080
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
public const val RUSAGE_THREAD: CInt = 1
public const val RUSAGE_CHILDREN: CInt = -1
public const val RADIXCHAR: NlItem = 0x10000
public const val THOUSEP: NlItem = 0x10001
public const val YESEXPR: NlItem = 0x50000
public const val NOEXPR: NlItem = 0x50001
public const val YESSTR: NlItem = 0x50002
public const val NOSTR: NlItem = 0x50003
public const val FILENAME_MAX: CUInt = 4096u
public const val L_tmpnam: CUInt = 20u
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
public const val _SC_PAGE_SIZE: CInt = _SC_PAGESIZE
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
public const val _SC_EXPR_NEST_MAX: CInt = 42
public const val _SC_LINE_MAX: CInt = 43
public const val _SC_RE_DUP_MAX: CInt = 44
public const val _SC_2_VERSION: CInt = 46
public const val _SC_2_C_BIND: CInt = 47
public const val _SC_2_C_DEV: CInt = 48
public const val _SC_2_FORT_DEV: CInt = 49
public const val _SC_2_FORT_RUN: CInt = 50
public const val _SC_2_SW_DEV: CInt = 51
public const val _SC_2_LOCALEDEF: CInt = 52
public const val _SC_UIO_MAXIOV: CInt = 60
public const val _SC_IOV_MAX: CInt = 60
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
public const val _SC_2_UPE: CInt = 97
public const val _SC_XOPEN_XPG2: CInt = 98
public const val _SC_XOPEN_XPG3: CInt = 99
public const val _SC_XOPEN_XPG4: CInt = 100
public const val _SC_NZERO: CInt = 109
public const val _SC_XBS5_ILP32_OFF32: CInt = 125
public const val _SC_XBS5_ILP32_OFFBIG: CInt = 126
public const val _SC_XBS5_LP64_OFF64: CInt = 127
public const val _SC_XBS5_LPBIG_OFFBIG: CInt = 128
public const val _SC_XOPEN_LEGACY: CInt = 129
public const val _SC_XOPEN_REALTIME: CInt = 130
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 131
public const val _SC_ADVISORY_INFO: CInt = 132
public const val _SC_BARRIERS: CInt = 133
public const val _SC_CLOCK_SELECTION: CInt = 137
public const val _SC_CPUTIME: CInt = 138
public const val _SC_THREAD_CPUTIME: CInt = 139
public const val _SC_MONOTONIC_CLOCK: CInt = 149
public const val _SC_READER_WRITER_LOCKS: CInt = 153
public const val _SC_SPIN_LOCKS: CInt = 154
public const val _SC_REGEXP: CInt = 155
public const val _SC_SHELL: CInt = 157
public const val _SC_SPAWN: CInt = 159
public const val _SC_SPORADIC_SERVER: CInt = 160
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 161
public const val _SC_TIMEOUTS: CInt = 164
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 165
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
public val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY
public val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY
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
public const val POSIX_MADV_NORMAL: CInt = 0
public const val POSIX_MADV_RANDOM: CInt = 1
public const val POSIX_MADV_SEQUENTIAL: CInt = 2
public const val POSIX_MADV_WILLNEED: CInt = 3
public const val S_IEXEC: ModeT = 64u
public const val S_IWRITE: ModeT = 128u
public const val S_IREAD: ModeT = 256u
public const val F_LOCK: CInt = 1
public const val F_TEST: CInt = 3
public const val F_TLOCK: CInt = 2
public const val F_ULOCK: CInt = 0
public const val IFF_LOWER_UP: CInt = 0x10000
public const val IFF_DORMANT: CInt = 0x20000
public const val IFF_ECHO: CInt = 0x40000
public const val ST_RDONLY: CULong = 1uL
public const val ST_NOSUID: CULong = 2uL
public const val ST_NODEV: CULong = 4uL
public const val ST_NOEXEC: CULong = 8uL
public const val ST_SYNCHRONOUS: CULong = 16uL
public const val ST_MANDLOCK: CULong = 64uL
public const val ST_WRITE: CULong = 128uL
public const val ST_APPEND: CULong = 256uL
public const val ST_IMMUTABLE: CULong = 512uL
public const val ST_NOATIME: CULong = 1024uL
public const val ST_NODIRATIME: CULong = 2048uL
public const val RTLD_NODELETE: CInt = 0x1000
public const val RTLD_NOW: CInt = 0x2
public const val TCP_MD5SIG: CInt = 14

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { size: [0 (initializer represented at the FFI boundary)
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 1
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 2
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
public const val PTHREAD_PROCESS_PRIVATE: CInt = 0
public const val PTHREAD_PROCESS_SHARED: CInt = 1
public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL
public const val RENAME_NOREPLACE: CInt = 1
public const val RENAME_EXCHANGE: CInt = 2
public const val RENAME_WHITEOUT: CInt = 4
public const val SCHED_OTHER: CInt = 0
public const val SCHED_FIFO: CInt = 1
public const val SCHED_RR: CInt = 2
public const val SCHED_BATCH: CInt = 3
public const val SCHED_IDLE: CInt = 5
public const val IPPROTO_HOPOPTS: CInt = 0
public const val IPPROTO_IGMP: CInt = 2
public const val IPPROTO_IPIP: CInt = 4
public const val IPPROTO_EGP: CInt = 8
public const val IPPROTO_PUP: CInt = 12
public const val IPPROTO_IDP: CInt = 22
public const val IPPROTO_TP: CInt = 29
public const val IPPROTO_DCCP: CInt = 33
public const val IPPROTO_ROUTING: CInt = 43
public const val IPPROTO_FRAGMENT: CInt = 44
public const val IPPROTO_RSVP: CInt = 46
public const val IPPROTO_GRE: CInt = 47
public const val IPPROTO_ESP: CInt = 50
public const val IPPROTO_AH: CInt = 51
public const val IPPROTO_NONE: CInt = 59
public const val IPPROTO_DSTOPTS: CInt = 60
public const val IPPROTO_MTP: CInt = 92
public const val IPPROTO_BEETPH: CInt = 94
public const val IPPROTO_ENCAP: CInt = 98
public const val IPPROTO_PIM: CInt = 103
public const val IPPROTO_COMP: CInt = 108
public const val IPPROTO_SCTP: CInt = 132
public const val IPPROTO_MH: CInt = 135
public const val IPPROTO_UDPLITE: CInt = 136
public const val IPPROTO_MPLS: CInt = 137
public const val IPPROTO_RAW: CInt = 255
public const val IPPROTO_MAX: CInt = 256
public const val AF_IB: CInt = 27
public const val AF_MPLS: CInt = 28
public const val AF_NFC: CInt = 39
public const val AF_VSOCK: CInt = 40
public const val PF_IB: CInt = AF_IB
public const val PF_MPLS: CInt = AF_MPLS
public const val PF_NFC: CInt = AF_NFC
public const val PF_VSOCK: CInt = AF_VSOCK
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
public const val MSG_COPY: CInt = 16384
public const val SHM_R: CInt = 256
public const val SHM_W: CInt = 128
public const val SHM_RDONLY: CInt = 4096
public const val SHM_RND: CInt = 8192
public const val SHM_REMAP: CInt = 16384
public const val SHM_EXEC: CInt = 32768
public const val SHM_LOCK: CInt = 11
public const val SHM_UNLOCK: CInt = 12
public const val SHM_HUGETLB: CInt = 2048
public const val SHM_NORESERVE: CInt = 4096
public const val EPOLLRDHUP: CInt = 0x2000
public const val EPOLLEXCLUSIVE: CInt = 0x10000000
public const val EPOLLONESHOT: CInt = 0x40000000
public const val QFMT_VFS_OLD: CInt = 1
public const val QFMT_VFS_V0: CInt = 2
public const val QFMT_VFS_V1: CInt = 4
public const val EFD_SEMAPHORE: CInt = 0x1
public const val LOG_NFACILITIES: CInt = 24
public val RB_AUTOBOOT: CInt = 0x01234567.toInt()
public val RB_HALT_SYSTEM: CInt = 0xcdef0123.toInt()
public val RB_ENABLE_CAD: CInt = 0x89abcdef.toInt()
public val RB_DISABLE_CAD: CInt = 0x00000000.toInt()
public val RB_POWER_OFF: CInt = 0x4321fedc.toInt()
public val RB_SW_SUSPEND: CInt = 0xd000fce2.toInt()
public val RB_KEXEC: CInt = 0x45584543.toInt()
public const val AI_PASSIVE: CInt = 0x0001
public const val AI_CANONNAME: CInt = 0x0002
public const val AI_NUMERICHOST: CInt = 0x0004
public const val AI_V4MAPPED: CInt = 0x0008
public const val AI_ALL: CInt = 0x0010
public const val AI_ADDRCONFIG: CInt = 0x0020
public const val AI_NUMERICSERV: CInt = 0x0400
public const val EAI_BADFLAGS: CInt = -1
public const val EAI_NONAME: CInt = -2
public const val EAI_AGAIN: CInt = -3
public const val EAI_FAIL: CInt = -4
public const val EAI_FAMILY: CInt = -6
public const val EAI_SOCKTYPE: CInt = -7
public const val EAI_SERVICE: CInt = -8
public const val EAI_MEMORY: CInt = -10
public const val EAI_OVERFLOW: CInt = -12
public const val NI_NUMERICHOST: CInt = 1
public const val NI_NUMERICSERV: CInt = 2
public const val NI_NOFQDN: CInt = 4
public const val NI_NAMEREQD: CInt = 8
public const val NI_DGRAM: CInt = 16
public const val SYNC_FILE_RANGE_WAIT_BEFORE: CUInt = 1u
public const val SYNC_FILE_RANGE_WRITE: CUInt = 2u
public const val SYNC_FILE_RANGE_WAIT_AFTER: CUInt = 4u
public const val EAI_SYSTEM: CInt = -11
public const val AIO_CANCELED: CInt = 0
public const val AIO_NOTCANCELED: CInt = 1
public const val AIO_ALLDONE: CInt = 2
public const val LIO_READ: CInt = 0
public const val LIO_WRITE: CInt = 1
public const val LIO_NOP: CInt = 2
public const val LIO_WAIT: CInt = 0
public const val LIO_NOWAIT: CInt = 1
public const val MREMAP_MAYMOVE: CInt = 1
public const val MREMAP_FIXED: CInt = 2
public const val PR_SET_PDEATHSIG: CInt = 1
public const val PR_GET_PDEATHSIG: CInt = 2
public const val PR_GET_DUMPABLE: CInt = 3
public const val PR_SET_DUMPABLE: CInt = 4
public const val PR_GET_UNALIGN: CInt = 5
public const val PR_SET_UNALIGN: CInt = 6
public const val PR_UNALIGN_NOPRINT: CInt = 1
public const val PR_UNALIGN_SIGBUS: CInt = 2
public const val PR_GET_KEEPCAPS: CInt = 7
public const val PR_SET_KEEPCAPS: CInt = 8
public const val PR_GET_FPEMU: CInt = 9
public const val PR_SET_FPEMU: CInt = 10
public const val PR_FPEMU_NOPRINT: CInt = 1
public const val PR_FPEMU_SIGFPE: CInt = 2
public const val PR_GET_FPEXC: CInt = 11
public const val PR_SET_FPEXC: CInt = 12
public const val PR_FP_EXC_SW_ENABLE: CInt = 0x80
public const val PR_FP_EXC_DIV: CInt = 0x010000
public const val PR_FP_EXC_OVF: CInt = 0x020000
public const val PR_FP_EXC_UND: CInt = 0x040000
public const val PR_FP_EXC_RES: CInt = 0x080000
public const val PR_FP_EXC_INV: CInt = 0x100000
public const val PR_FP_EXC_DISABLED: CInt = 0
public const val PR_FP_EXC_NONRECOV: CInt = 1
public const val PR_FP_EXC_ASYNC: CInt = 2
public const val PR_FP_EXC_PRECISE: CInt = 3
public const val PR_GET_TIMING: CInt = 13
public const val PR_SET_TIMING: CInt = 14
public const val PR_TIMING_STATISTICAL: CInt = 0
public const val PR_TIMING_TIMESTAMP: CInt = 1
public const val PR_SET_NAME: CInt = 15
public const val PR_GET_NAME: CInt = 16
public const val PR_GET_ENDIAN: CInt = 19
public const val PR_SET_ENDIAN: CInt = 20
public const val PR_ENDIAN_BIG: CInt = 0
public const val PR_ENDIAN_LITTLE: CInt = 1
public const val PR_ENDIAN_PPC_LITTLE: CInt = 2
public const val PR_GET_SECCOMP: CInt = 21
public const val PR_SET_SECCOMP: CInt = 22
public const val PR_CAPBSET_READ: CInt = 23
public const val PR_CAPBSET_DROP: CInt = 24
public const val PR_GET_TSC: CInt = 25
public const val PR_SET_TSC: CInt = 26
public const val PR_TSC_ENABLE: CInt = 1
public const val PR_TSC_SIGSEGV: CInt = 2
public const val PR_GET_SECUREBITS: CInt = 27
public const val PR_SET_SECUREBITS: CInt = 28
public const val PR_SET_TIMERSLACK: CInt = 29
public const val PR_GET_TIMERSLACK: CInt = 30
public const val PR_TASK_PERF_EVENTS_DISABLE: CInt = 31
public const val PR_TASK_PERF_EVENTS_ENABLE: CInt = 32
public const val PR_MCE_KILL: CInt = 33
public const val PR_MCE_KILL_CLEAR: CInt = 0
public const val PR_MCE_KILL_SET: CInt = 1
public const val PR_MCE_KILL_LATE: CInt = 0
public const val PR_MCE_KILL_EARLY: CInt = 1
public const val PR_MCE_KILL_DEFAULT: CInt = 2
public const val PR_MCE_KILL_GET: CInt = 34
public const val PR_SET_MM: CInt = 35
public const val PR_SET_MM_START_CODE: CInt = 1
public const val PR_SET_MM_END_CODE: CInt = 2
public const val PR_SET_MM_START_DATA: CInt = 3
public const val PR_SET_MM_END_DATA: CInt = 4
public const val PR_SET_MM_START_STACK: CInt = 5
public const val PR_SET_MM_START_BRK: CInt = 6
public const val PR_SET_MM_BRK: CInt = 7
public const val PR_SET_MM_ARG_START: CInt = 8
public const val PR_SET_MM_ARG_END: CInt = 9
public const val PR_SET_MM_ENV_START: CInt = 10
public const val PR_SET_MM_ENV_END: CInt = 11
public const val PR_SET_MM_AUXV: CInt = 12
public const val PR_SET_MM_EXE_FILE: CInt = 13
public const val PR_SET_MM_MAP: CInt = 14
public const val PR_SET_MM_MAP_SIZE: CInt = 15
public const val PR_SET_PTRACER: CInt = 0x59616d61
public const val PR_SET_PTRACER_ANY: CULong = 0xffffffffffffffffuL
public const val PR_SET_CHILD_SUBREAPER: CInt = 36
public const val PR_GET_CHILD_SUBREAPER: CInt = 37
public const val PR_SET_NO_NEW_PRIVS: CInt = 38
public const val PR_GET_NO_NEW_PRIVS: CInt = 39
public const val PR_GET_TID_ADDRESS: CInt = 40
public const val PR_SET_THP_DISABLE: CInt = 41
public const val PR_GET_THP_DISABLE: CInt = 42
public const val PR_MPX_ENABLE_MANAGEMENT: CInt = 43
public const val PR_MPX_DISABLE_MANAGEMENT: CInt = 44
public const val PR_SET_FP_MODE: CInt = 45
public const val PR_GET_FP_MODE: CInt = 46
public val PR_FP_MODE_FR: CInt = 1 shl 0
public val PR_FP_MODE_FRE: CInt = 1 shl 1
public const val PR_CAP_AMBIENT: CInt = 47
public const val PR_CAP_AMBIENT_IS_SET: CInt = 1
public const val PR_CAP_AMBIENT_RAISE: CInt = 2
public const val PR_CAP_AMBIENT_LOWER: CInt = 3
public const val PR_CAP_AMBIENT_CLEAR_ALL: CInt = 4
public const val ITIMER_REAL: CInt = 0
public const val ITIMER_VIRTUAL: CInt = 1
public const val ITIMER_PROF: CInt = 2
public const val TFD_CLOEXEC: CInt = O_CLOEXEC
public const val TFD_NONBLOCK: CInt = O_NONBLOCK
public const val TFD_TIMER_ABSTIME: CInt = 1
public const val XATTR_CREATE: CInt = 0x1
public const val XATTR_REPLACE: CInt = 0x2
public const val _POSIX_VDISABLE: CcT = 0u
public const val FALLOC_FL_KEEP_SIZE: CInt = 0x01
public const val FALLOC_FL_PUNCH_HOLE: CInt = 0x02
public const val FALLOC_FL_COLLAPSE_RANGE: CInt = 0x08
public const val FALLOC_FL_ZERO_RANGE: CInt = 0x10
public const val FALLOC_FL_INSERT_RANGE: CInt = 0x20
public const val FALLOC_FL_UNSHARE_RANGE: CInt = 0x40
public const val ENOATTR: CInt = ENODATA
public const val SO_ORIGINAL_DST: CInt = 80
public const val IUTF8: TcflagT = 0x00004000u
public const val CMSPAR: TcflagT = 1073741824u
public const val MFD_CLOEXEC: CUInt = 0x0001u
public const val MFD_ALLOW_SEALING: CUInt = 0x0002u
public const val PT_NULL: UInt = 0u
public const val PT_LOAD: UInt = 1u
public const val PT_DYNAMIC: UInt = 2u
public const val PT_INTERP: UInt = 3u
public const val PT_NOTE: UInt = 4u
public const val PT_SHLIB: UInt = 5u
public const val PT_PHDR: UInt = 6u
public const val PT_TLS: UInt = 7u
public const val PT_NUM: UInt = 8u
public const val PT_LOOS: UInt = 0x60000000u
public const val PT_GNU_EH_FRAME: UInt = 0x6474e550u
public const val PT_GNU_STACK: UInt = 0x6474e551u
public const val PT_GNU_RELRO: UInt = 0x6474e552u
public const val ETH_P_LOOP: CInt = 0x0060
public const val ETH_P_PUP: CInt = 0x0200
public const val ETH_P_PUPAT: CInt = 0x0201
public const val ETH_P_IP: CInt = 0x0800
public const val ETH_P_X25: CInt = 0x0805
public const val ETH_P_ARP: CInt = 0x0806
public const val ETH_P_BPQ: CInt = 0x08FF
public const val ETH_P_IEEEPUP: CInt = 0x0a00
public const val ETH_P_IEEEPUPAT: CInt = 0x0a01
public const val ETH_P_BATMAN: CInt = 0x4305
public const val ETH_P_DEC: CInt = 0x6000
public const val ETH_P_DNA_DL: CInt = 0x6001
public const val ETH_P_DNA_RC: CInt = 0x6002
public const val ETH_P_DNA_RT: CInt = 0x6003
public const val ETH_P_LAT: CInt = 0x6004
public const val ETH_P_DIAG: CInt = 0x6005
public const val ETH_P_CUST: CInt = 0x6006
public const val ETH_P_SCA: CInt = 0x6007
public const val ETH_P_TEB: CInt = 0x6558
public const val ETH_P_RARP: CInt = 0x8035
public const val ETH_P_ATALK: CInt = 0x809B
public const val ETH_P_AARP: CInt = 0x80F3
public const val ETH_P_8021Q: CInt = 0x8100
public const val ETH_P_IPX: CInt = 0x8137
public const val ETH_P_IPV6: CInt = 0x86DD
public const val ETH_P_PAUSE: CInt = 0x8808
public const val ETH_P_SLOW: CInt = 0x8809
public const val ETH_P_WCCP: CInt = 0x883E
public const val ETH_P_MPLS_UC: CInt = 0x8847
public const val ETH_P_MPLS_MC: CInt = 0x8848
public const val ETH_P_ATMMPOA: CInt = 0x884c
public const val ETH_P_PPP_DISC: CInt = 0x8863
public const val ETH_P_PPP_SES: CInt = 0x8864
public const val ETH_P_LINK_CTL: CInt = 0x886c
public const val ETH_P_ATMFATE: CInt = 0x8884
public const val ETH_P_PAE: CInt = 0x888E
public const val ETH_P_AOE: CInt = 0x88A2
public const val ETH_P_8021AD: CInt = 0x88A8
public const val ETH_P_802_EX1: CInt = 0x88B5
public const val ETH_P_TIPC: CInt = 0x88CA
public const val ETH_P_8021AH: CInt = 0x88E7
public const val ETH_P_MVRP: CInt = 0x88F5
public const val ETH_P_1588: CInt = 0x88F7
public const val ETH_P_PRP: CInt = 0x88FB
public const val ETH_P_FCOE: CInt = 0x8906
public const val ETH_P_TDLS: CInt = 0x890D
public const val ETH_P_FIP: CInt = 0x8914
public const val ETH_P_80221: CInt = 0x8917
public const val ETH_P_LOOPBACK: CInt = 0x9000
public const val ETH_P_QINQ1: CInt = 0x9100
public const val ETH_P_QINQ2: CInt = 0x9200
public const val ETH_P_QINQ3: CInt = 0x9300
public const val ETH_P_EDSA: CInt = 0xDADA
public const val ETH_P_AF_IUCV: CInt = 0xFBFB
public const val ETH_P_802_3_MIN: CInt = 0x0600
public const val ETH_P_802_3: CInt = 0x0001
public const val ETH_P_AX25: CInt = 0x0002
public const val ETH_P_ALL: CInt = 0x0003
public const val ETH_P_802_2: CInt = 0x0004
public const val ETH_P_SNAP: CInt = 0x0005
public const val ETH_P_DDCMP: CInt = 0x0006
public const val ETH_P_WAN_PPP: CInt = 0x0007
public const val ETH_P_PPP_MP: CInt = 0x0008
public const val ETH_P_LOCALTALK: CInt = 0x0009
public const val ETH_P_CAN: CInt = 0x000C
public const val ETH_P_CANFD: CInt = 0x000D
public const val ETH_P_PPPTALK: CInt = 0x0010
public const val ETH_P_TR_802_2: CInt = 0x0011
public const val ETH_P_MOBITEX: CInt = 0x0015
public const val ETH_P_CONTROL: CInt = 0x0016
public const val ETH_P_IRDA: CInt = 0x0017
public const val ETH_P_ECONET: CInt = 0x0018
public const val ETH_P_HDLC: CInt = 0x0019
public const val ETH_P_ARCNET: CInt = 0x001A
public const val ETH_P_DSA: CInt = 0x001B
public const val ETH_P_TRAILER: CInt = 0x001C
public const val ETH_P_PHONET: CInt = 0x00F5
public const val ETH_P_IEEE802154: CInt = 0x00F6
public const val ETH_P_CAIF: CInt = 0x00F7
public const val SFD_CLOEXEC: CInt = 0x080000
public const val NCCS: ULong = 32uL
public const val O_TRUNC: CInt = 0x00040000
public const val O_NOATIME: CInt = 0x00002000
public const val O_CLOEXEC: CInt = 0x00000100
public const val O_TMPFILE: CInt = 0x00004000
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
public const val SA_RESETHAND: CInt = 0x80000000.toInt()
public const val SA_RESTART: CInt = 0x10000000
public const val SA_NOCLDSTOP: CInt = 0x00000001
public const val EPOLL_CLOEXEC: CInt = 0x80000
public const val EFD_CLOEXEC: CInt = 0x80000
public const val BUFSIZ: CUInt = 1024u
public const val TMP_MAX: CUInt = 10000u
public const val FOPEN_MAX: CUInt = 1000u
public const val O_PATH: CInt = 0x00400000
public const val O_EXEC: CInt = O_PATH
public const val O_SEARCH: CInt = O_PATH
public val O_ACCMODE: CInt = 3 or O_SEARCH
public const val O_NDELAY: CInt = O_NONBLOCK
public const val NI_MAXHOST: SocklenT = 255u
public const val PTHREAD_STACK_MIN: ULong = 2048uL
public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val POSIX_MADV_DONTNEED: CInt = 4
public val RLIM_INFINITY: RlimT = 0uL.inv()
public const val RLIMIT_RTTIME: CInt = 15
public const val RLIMIT_NLIMITS: CInt = 16
public const val RLIM_NLIMITS: CInt = RLIMIT_NLIMITS
public const val MAP_ANONYMOUS: CInt = MAP_ANON
public const val SOCK_DCCP: CInt = 6
public const val SOCK_PACKET: CInt = 10
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
public const val SIGUNUSED: CInt = SIGSYS
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
public const val CPU_SETSIZE: CInt = 128
public const val PTRACE_TRACEME: CInt = 0
public const val PTRACE_PEEKTEXT: CInt = 1
public const val PTRACE_PEEKDATA: CInt = 2
public const val PTRACE_PEEKUSER: CInt = 3
public const val PTRACE_POKETEXT: CInt = 4
public const val PTRACE_POKEDATA: CInt = 5
public const val PTRACE_POKEUSER: CInt = 6
public const val PTRACE_CONT: CInt = 7
public const val PTRACE_KILL: CInt = 8
public const val PTRACE_SINGLESTEP: CInt = 9
public const val PTRACE_GETREGS: CInt = 12
public const val PTRACE_SETREGS: CInt = 13
public const val PTRACE_GETFPREGS: CInt = 14
public const val PTRACE_SETFPREGS: CInt = 15
public const val PTRACE_ATTACH: CInt = 16
public const val PTRACE_DETACH: CInt = 17
public const val PTRACE_GETFPXREGS: CInt = 18
public const val PTRACE_SETFPXREGS: CInt = 19
public const val PTRACE_SYSCALL: CInt = 24
public const val PTRACE_SETOPTIONS: CInt = 0x4200
public const val PTRACE_GETEVENTMSG: CInt = 0x4201
public const val PTRACE_GETSIGINFO: CInt = 0x4202
public const val PTRACE_SETSIGINFO: CInt = 0x4203
public const val PTRACE_GETREGSET: CInt = 0x4204
public const val PTRACE_SETREGSET: CInt = 0x4205
public const val PTRACE_SEIZE: CInt = 0x4206
public const val PTRACE_INTERRUPT: CInt = 0x4207
public const val PTRACE_LISTEN: CInt = 0x4208
public const val PTRACE_PEEKSIGINFO: CInt = 0x4209
public const val EPOLLWAKEUP: CInt = 0x20000000
public const val EFD_NONBLOCK: CInt = O_NONBLOCK
public const val SFD_NONBLOCK: CInt = O_NONBLOCK
public const val TCSANOW: CInt = 0
public const val TCSADRAIN: CInt = 1
public const val TCSAFLUSH: CInt = 2
public const val TIOCINQ: CInt = FIONREAD
public const val RTLD_GLOBAL: CInt = 0x100
public const val RTLD_NOLOAD: CInt = 0x4
public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val CBAUD: TcflagT = 4111u
public const val TAB1: CInt = 0x00000800
public const val TAB2: CInt = 0x00001000
public const val TAB3: CInt = 0x00001800
public const val CR1: CInt = 0x00000200
public const val CR2: CInt = 0x00000400
public const val CR3: CInt = 0x00000600
public const val FF1: CInt = 0x00008000
public const val BS1: CInt = 0x00002000
public const val VT1: CInt = 0x00004000
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
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL
public const val O_ASYNC: CInt = 0x00000400
public const val FIOCLEX: CInt = 0x5451
public const val FIONBIO: CInt = 0x5421
public const val RLIMIT_RSS: CInt = 5
public const val RLIMIT_NOFILE: CInt = 7
public const val RLIMIT_AS: CInt = 9
public const val RLIMIT_NPROC: CInt = 6
public const val RLIMIT_MEMLOCK: CInt = 8
public const val O_APPEND: CInt = 0x00100000
public const val O_CREAT: CInt = 0x00010000
public const val O_EXCL: CInt = 0x00020000
public const val O_NOCTTY: CInt = 0x00000200
public const val O_NONBLOCK: CInt = 0x00000010
public val O_SYNC: CInt = 0x00000040 or O_DSYNC
public val O_RSYNC: CInt = O_SYNC
public const val O_DSYNC: CInt = 0x00000020
public const val SOCK_CLOEXEC: CInt = 524288
public const val SOCK_NONBLOCK: CInt = 2048
public const val MAP_ANON: CInt = 0x0020
public const val MAP_GROWSDOWN: CInt = 0x0100
public const val MAP_DENYWRITE: CInt = 0x0800
public const val MAP_EXECUTABLE: CInt = 0x01000
public const val MAP_LOCKED: CInt = 0x02000
public const val MAP_NORESERVE: CInt = 0x04000
public const val MAP_POPULATE: CInt = 0x08000
public const val MAP_NONBLOCK: CInt = 0x010000
public const val MAP_STACK: CInt = 0x020000
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_SEQPACKET: CInt = 5
public const val SOL_SOCKET: CInt = 1
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
public const val EDEADLOCK: CInt = EDEADLK
public const val EMULTIHOP: CInt = 72
public const val EBADMSG: CInt = 74
public const val EOVERFLOW: CInt = 75
public const val ENOTUNIQ: CInt = 76
public const val EBADFD: CInt = 77
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
public const val ENOTSUP: CInt = EOPNOTSUPP
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
public const val EUCLEAN: CInt = 117
public const val ENOTNAM: CInt = 118
public const val ENAVAIL: CInt = 119
public const val EISNAM: CInt = 120
public const val EREMOTEIO: CInt = 121
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
public const val ERFKILL: CInt = 132
public const val EHWPOISON: CInt = 133
public const val SO_REUSEADDR: CInt = 2
public const val SO_TYPE: CInt = 3
public const val SO_ERROR: CInt = 4
public const val SO_DONTROUTE: CInt = 5
public const val SO_BROADCAST: CInt = 6
public const val SO_SNDBUF: CInt = 7
public const val SO_RCVBUF: CInt = 8
public const val SO_KEEPALIVE: CInt = 9
public const val SO_OOBINLINE: CInt = 10
public const val SO_NO_CHECK: CInt = 11
public const val SO_PRIORITY: CInt = 12
public const val SO_LINGER: CInt = 13
public const val SO_BSDCOMPAT: CInt = 14
public const val SO_REUSEPORT: CInt = 15
public const val SO_PASSCRED: CInt = 16
public const val SO_PEERCRED: CInt = 17
public const val SO_RCVLOWAT: CInt = 18
public const val SO_SNDLOWAT: CInt = 19
public const val SO_RCVTIMEO: CInt = 20
public const val SO_SNDTIMEO: CInt = 21
public const val SO_BINDTODEVICE: CInt = 25
public const val SO_TIMESTAMP: CInt = 29
public const val SO_ACCEPTCONN: CInt = 30
public const val SO_SNDBUFFORCE: CInt = 32
public const val SO_RCVBUFFORCE: CInt = 33
public const val SO_TIMESTAMPNS: CInt = 35
public const val SO_MARK: CInt = 36
public const val SO_PROTOCOL: CInt = 38
public const val SO_DOMAIN: CInt = 39
public const val SO_RXQ_OVFL: CInt = 40
public const val SO_PEEK_OFF: CInt = 42
public const val SO_BUSY_POLL: CInt = 46
public const val SO_COOKIE: CInt = 57
public const val SO_BINDTOIFINDEX: CInt = 62
public const val SO_FUCHSIA_MARK: CInt = 10000
public const val SA_ONSTACK: CInt = 0x08000000
public const val SA_SIGINFO: CInt = 0x00000004
public const val SA_NOCLDWAIT: CInt = 0x00000002
public const val SIGCHLD: CInt = 17
public const val SIGBUS: CInt = 7
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGWINCH: CInt = 28
public const val SIGUSR1: CInt = 10
public const val SIGUSR2: CInt = 12
public const val SIGCONT: CInt = 18
public const val SIGSTOP: CInt = 19
public const val SIGTSTP: CInt = 20
public const val SIGURG: CInt = 23
public const val SIGIO: CInt = 29
public const val SIGSYS: CInt = 31
public const val SIGSTKFLT: CInt = 16
public const val SIGPOLL: CInt = 29
public const val SIGPWR: CInt = 30
public const val SIG_SETMASK: CInt = 2
public const val SIG_BLOCK: CInt = 0x000000
public const val SIG_UNBLOCK: CInt = 0x01
public const val EXTPROC: TcflagT = 0x00010000u
public const val MAP_HUGETLB: CInt = 0x040000
public const val F_GETLK: CInt = 5
public const val F_GETOWN: CInt = 9
public const val F_SETLK: CInt = 6
public const val F_SETLKW: CInt = 7
public const val F_SETOWN: CInt = 8
public const val VEOF: ULong = 4uL
public const val VEOL: ULong = 11uL
public const val VEOL2: ULong = 16uL
public const val VMIN: ULong = 6uL
public const val IEXTEN: TcflagT = 0x00008000u
public const val TOSTOP: TcflagT = 0x00000100u
public const val FLUSHO: TcflagT = 0x00001000u
public const val TCGETS: CInt = 0x5401
public const val TCSETS: CInt = 0x5402
public const val TCSETSW: CInt = 0x5403
public const val TCSETSF: CInt = 0x5404
public const val TCGETA: CInt = 0x5405
public const val TCSETA: CInt = 0x5406
public const val TCSETAW: CInt = 0x5407
public const val TCSETAF: CInt = 0x5408
public const val TCSBRK: CInt = 0x5409
public const val TCXONC: CInt = 0x540A
public const val TCFLSH: CInt = 0x540B
public const val TIOCGSOFTCAR: CInt = 0x5419
public const val TIOCSSOFTCAR: CInt = 0x541A
public const val TIOCLINUX: CInt = 0x541C
public const val TIOCGSERIAL: CInt = 0x541E
public const val TIOCEXCL: CInt = 0x540C
public const val TIOCNXCL: CInt = 0x540D
public const val TIOCSCTTY: CInt = 0x540E
public const val TIOCGPGRP: CInt = 0x540F
public const val TIOCSPGRP: CInt = 0x5410
public const val TIOCOUTQ: CInt = 0x5411
public const val TIOCSTI: CInt = 0x5412
public const val TIOCGWINSZ: CInt = 0x5413
public const val TIOCSWINSZ: CInt = 0x5414
public const val TIOCMGET: CInt = 0x5415
public const val TIOCMBIS: CInt = 0x5416
public const val TIOCMBIC: CInt = 0x5417
public const val TIOCMSET: CInt = 0x5418
public const val FIONREAD: CInt = 0x541B
public const val TIOCCONS: CInt = 0x541D
public const val POLLWRNORM: CShort = 0x100
public const val POLLWRBAND: CShort = 0x200
public const val TIOCM_LE: CInt = 0x001
public const val TIOCM_DTR: CInt = 0x002
public const val TIOCM_RTS: CInt = 0x004
public const val TIOCM_ST: CInt = 0x008
public const val TIOCM_SR: CInt = 0x010
public const val TIOCM_CTS: CInt = 0x020
public const val TIOCM_CAR: CInt = 0x040
public const val TIOCM_RNG: CInt = 0x080
public const val TIOCM_DSR: CInt = 0x100
public const val TIOCM_CD: CInt = TIOCM_CAR
public const val TIOCM_RI: CInt = TIOCM_RNG
public const val O_DIRECTORY: CInt = 0x00080000
public const val O_DIRECT: CInt = 0x00000800
public const val O_LARGEFILE: CInt = 0x00001000
public const val O_NOFOLLOW: CInt = 0x00000080
public const val HUGETLB_FLAG_ENCODE_SHIFT: UInt = 26u
public const val MAP_HUGE_SHIFT: UInt = 26u

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun fDCLR(fd: CInt, set: FdSet?)

public expect fun fDISSET(fd: CInt, set: FdSet?): Boolean

public expect fun fDSET(fd: CInt, set: FdSet?)

public expect fun fDZERO(set: FdSet?)

public expect fun cPUZERO(cpuset: CpuSetT?)

public expect fun cPUSET(cpu: ULong, cpuset: CpuSetT?)

public expect fun cPUCLR(cpu: ULong, cpuset: CpuSetT?)

public expect fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean

public expect fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean

public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?

public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr?

public expect fun isalnum(c: CInt): CInt

public expect fun isalpha(c: CInt): CInt

public expect fun iscntrl(c: CInt): CInt

public expect fun isdigit(c: CInt): CInt

public expect fun isgraph(c: CInt): CInt

public expect fun islower(c: CInt): CInt

public expect fun isprint(c: CInt): CInt

public expect fun ispunct(c: CInt): CInt

public expect fun isspace(c: CInt): CInt

public expect fun isupper(c: CInt): CInt

public expect fun isxdigit(c: CInt): CInt

public expect fun isblank(c: CInt): CInt

public expect fun tolower(c: CInt): CInt

public expect fun toupper(c: CInt): CInt

public expect fun fopen(filename: String?, mode: String?): FILE?

public expect fun freopen(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun fflush(file: FILE?): CInt

public expect fun fclose(file: FILE?): CInt

public expect fun remove(filename: String?): CInt

public expect fun rename(oldname: String?, newname: String?): CInt

public expect fun tmpfile(): FILE?

public expect fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt

public expect fun setbuf(stream: FILE?, buf: String?)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: FILE?): CInt

public expect fun fgets(buf: String?, n: CInt, stream: FILE?): String?

public expect fun fputc(c: CInt, stream: FILE?): CInt

public expect fun fputs(s: String?, stream: FILE?): CInt

public expect fun puts(s: String?): CInt

public expect fun ungetc(c: CInt, stream: FILE?): CInt

public expect fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong

public expect fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong

public expect fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: FILE?): CLong

public expect fun rewind(stream: FILE?)

public expect fun fgetpos(stream: FILE?, ptr: FposT?): CInt

public expect fun fsetpos(stream: FILE?, ptr: FposT?): CInt

public expect fun feof(stream: FILE?): CInt

public expect fun ferror(stream: FILE?): CInt

public expect fun perror(s: String?)

public expect fun atof(s: String?): CDouble

public expect fun atoi(s: String?): CInt

public expect fun atol(s: String?): CLong

public expect fun atoll(s: String?): CLongLong

public expect fun strtod(s: String?, endp: COpaquePointer?): CDouble

public expect fun strtof(s: String?, endp: COpaquePointer?): CFloat

public expect fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong

public expect fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong

public expect fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong

public expect fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong

public expect fun calloc(nobj: ULong, size: ULong): COpaquePointer?

public expect fun malloc(size: ULong): COpaquePointer?

public expect fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: (() -> Unit)?): CInt

public expect fun system(s: String?): CInt

public expect fun getenv(s: String?): String?

public expect fun strcpy(dst: String?, src: String?): String?

public expect fun strncpy(dst: String?, src: String?, n: ULong): String?

public expect fun strcat(s: String?, ct: String?): String?

public expect fun strncat(s: String?, ct: String?, n: ULong): String?

public expect fun strcmp(cs: String?, ct: String?): CInt

public expect fun strncmp(cs: String?, ct: String?, n: ULong): CInt

public expect fun strcoll(cs: String?, ct: String?): CInt

public expect fun strchr(cs: String?, c: CInt): String?

public expect fun strrchr(cs: String?, c: CInt): String?

public expect fun strspn(cs: String?, ct: String?): ULong

public expect fun strcspn(cs: String?, ct: String?): ULong

public expect fun strdup(cs: String?): String?

public expect fun strpbrk(cs: String?, ct: String?): String?

public expect fun strstr(cs: String?, ct: String?): String?

public expect fun strlen(cs: String?): ULong

public expect fun strnlen(cs: String?, maxlen: ULong): ULong

public expect fun strerror(n: CInt): String?

public expect fun strtok(s: String?, t: String?): String?

public expect fun strxfrm(s: String?, ct: String?, n: ULong): ULong

public expect fun wcslen(buf: WcharT?): ULong

public expect fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUInt)

public expect fun getpwnam(name: String?): Passwd?

public expect fun getpwuid(uid: UidT): Passwd?

public expect fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt

public expect fun printf(format: String?, vararg args: Any?): CInt

public expect fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt

public expect fun sprintf(s: String?, format: String?, vararg args: Any?): CInt

public expect fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt

public expect fun scanf(format: String?, vararg args: Any?): CInt

public expect fun sscanf(s: String?, format: String?, vararg args: Any?): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt

public expect fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt

public expect fun listen(socket: CInt, backlog: CInt): CInt

public expect fun accept(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt

public expect fun getpeername(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt

public expect fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt

public expect fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt

public expect fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt

public expect fun sendto(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT

public expect fun shutdown(socket: CInt, how: CInt): CInt

public expect fun chmod(path: String?, mode: ModeT): CInt

public expect fun fchmod(fd: CInt, mode: ModeT): CInt

public expect fun fstat(fildes: CInt, buf: Stat?): CInt

public expect fun mkdir(path: String?, mode: ModeT): CInt

public expect fun stat(path: String?, buf: Stat?): CInt

public expect fun pclose(stream: FILE?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun open(path: String?, oflag: CInt, vararg args: Any?): CInt

public expect fun creat(path: String?, mode: ModeT): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt

public expect fun opendir(dirname: String?): DIR?

public expect fun readdir(dirp: DIR?): Dirent?

public expect fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt

public expect fun closedir(dirp: DIR?): CInt

public expect fun rewinddir(dirp: DIR?)

public expect fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg args: Any?): CInt

public expect fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt

public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt

public expect fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt

public expect fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): SsizeT

public expect fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt

public expect fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun alarm(seconds: CUInt): CUInt

public expect fun chdir(dir: String?): CInt

public expect fun chown(path: String?, uid: UidT, gid: GidT): CInt

public expect fun lchown(path: String?, uid: UidT, gid: GidT): CInt

public expect fun close(fd: CInt): CInt

public expect fun dup(fd: CInt): CInt

public expect fun dup2(src: CInt, dst: CInt): CInt

public expect fun execl(path: String?, arg0: String?, vararg args: Any?): CInt

public expect fun execle(path: String?, arg0: String?, vararg args: Any?): CInt

public expect fun execlp(file: String?, arg0: String?, vararg args: Any?): CInt

public expect fun execv(prog: String?, argv: COpaquePointer?): CInt

public expect fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun execvp(c: String?, argv: COpaquePointer?): CInt

public expect fun fork(): PidT

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getcwd(buf: String?, size: ULong): String?

public expect fun getegid(): GidT

public expect fun geteuid(): UidT

public expect fun getgid(): GidT

public expect fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt

public expect fun getlogin(): String?

public expect fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt

public expect fun getpgid(pid: PidT): PidT

public expect fun getpgrp(): PidT

public expect fun getpid(): PidT

public expect fun getppid(): PidT

public expect fun getuid(): UidT

public expect fun isatty(fd: CInt): CInt

public expect fun link(src: String?, dst: String?): CInt

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun pathconf(path: String?, name: CInt): CLong

public expect fun pause(): CInt

public expect fun pipe(fds: CInt?): CInt

public expect fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt

public expect fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT

public expect fun rmdir(path: String?): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun setgid(gid: GidT): CInt

public expect fun setpgid(pid: PidT, pgid: PidT): CInt

public expect fun setsid(): PidT

public expect fun setuid(uid: UidT): CInt

public expect fun sleep(secs: CUInt): CUInt

public expect fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun tcgetpgrp(fd: CInt): PidT

public expect fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt

public expect fun ttyname(fd: CInt): String?

public expect fun unlink(c: String?): CInt

public expect fun wait(status: CInt?): PidT

public expect fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT

public expect fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT

public expect fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT

public expect fun umask(mask: ModeT): ModeT

public expect fun utime(file: String?, buf: Utimbuf?): CInt

public expect fun kill(pid: PidT, sig: CInt): CInt

public expect fun mlock(addr: COpaquePointer?, len: ULong): CInt

public expect fun munlock(addr: COpaquePointer?, len: ULong): CInt

public expect fun mlockall(flags: CInt): CInt

public expect fun munlockall(): CInt

public expect fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer?

public expect fun munmap(addr: COpaquePointer?, len: ULong): CInt

public expect fun ifNametoindex(ifname: String?): CUInt

public expect fun ifIndextoname(ifindex: CUInt, ifname: String?): String?

public expect fun lstat(path: String?, buf: Stat?): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun setenv(name: String?, `val`: String?, overwrite: CInt): CInt

public expect fun unsetenv(name: String?): CInt

public expect fun symlink(path1: String?, path2: String?): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun realpath(pathname: String?, resolved: String?): String?

public expect fun flock(fd: CInt, operation: CInt): CInt

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun times(buf: Tms?): ClockT

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt

public expect fun pthreadExit(value: COpaquePointer?): Nothing

public expect fun pthreadAttrInit(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt

public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): CInt

public expect fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun schedYield(): CInt

public expect fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer?

public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt

public expect fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexLock(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt

public expect fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt

public expect fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt

public expect fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadCondSignal(cond: PthreadCondT?): CInt

public expect fun pthreadCondBroadcast(cond: PthreadCondT?): CInt

public expect fun pthreadCondDestroy(cond: PthreadCondT?): CInt

public expect fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt

public expect fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt

public expect fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt

public expect fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt

public expect fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt

public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt

public expect fun raise(signum: CInt): CInt

public expect fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt

public expect fun utimes(filename: String?, times: Timeval?): CInt

public expect fun dlopen(filename: String?, flag: CInt): COpaquePointer?

public expect fun dlerror(): String?

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?

public expect fun dlclose(handle: COpaquePointer?): CInt

public expect fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt

public expect fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt

public expect fun freeaddrinfo(res: Addrinfo?)

public expect fun gaiStrerror(errcode: CInt): String?

public expect fun resInit(): CInt

public expect fun gmtimeR(timeP: TimeT?, result: Tm?): Tm?

public expect fun localtimeR(timeP: TimeT?, result: Tm?): Tm?

public expect fun mktime(tm: Tm?): TimeT

public expect fun time(time: TimeT?): TimeT

public expect fun gmtime(timeP: TimeT?): Tm?

public expect fun localtime(timeP: TimeT?): Tm?

public expect fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun uname(buf: Utsname?): CInt

public expect fun gethostname(name: String?, len: ULong): CInt

public expect fun getservbyname(name: String?, proto: String?): Servent?

public expect fun getprotobyname(name: String?): Protoent?

public expect fun getprotobynumber(proto: CInt): Protoent?

public expect fun usleep(secs: CUInt): CInt

public expect fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT

public expect fun putenv(string: String?): CInt

public expect fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt

public expect fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt

public expect fun setlocale(category: CInt, locale: String?): String?

public expect fun localeconv(): Lconv?

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semWait(sem: SemT?): CInt

public expect fun semTrywait(sem: SemT?): CInt

public expect fun semPost(sem: SemT?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt

public expect fun statvfs(path: String?, buf: Statvfs?): CInt

public expect fun fstatvfs(fd: CInt, buf: Statvfs?): CInt

public expect fun readlink(path: String?, buf: String?, bufsz: ULong): SsizeT

public expect fun sigemptyset(set: SigsetT?): CInt

public expect fun sigaddset(set: SigsetT?, signum: CInt): CInt

public expect fun sigfillset(set: SigsetT?): CInt

public expect fun sigdelset(set: SigsetT?, signum: CInt): CInt

public expect fun sigismember(set: SigsetT?, signum: CInt): CInt

public expect fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun sigpending(set: SigsetT?): CInt

public expect fun timegm(tm: Tm?): TimeT

public expect fun getsid(pid: PidT): PidT

public expect fun sysconf(name: CInt): CLong

public expect fun mkfifo(path: String?, mode: ModeT): CInt

public expect fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

public expect fun tcdrain(fd: CInt): CInt

public expect fun cfgetispeed(termios: Termios?): SpeedT

public expect fun cfgetospeed(termios: Termios?): SpeedT

public expect fun cfmakeraw(termios: Termios?)

public expect fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt

public expect fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt

public expect fun tcgetattr(fd: CInt, termios: Termios?): CInt

public expect fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt

public expect fun tcflow(fd: CInt, action: CInt): CInt

public expect fun tcflush(fd: CInt, action: CInt): CInt

public expect fun tcgetsid(fd: CInt): PidT

public expect fun tcsendbreak(fd: CInt, duration: CInt): CInt

public expect fun mkstemp(template: String?): CInt

public expect fun mkdtemp(template: String?): String?

public expect fun tmpnam(ptr: String?): String?

public expect fun openlog(ident: String?, logopt: CInt, facility: CInt)

public expect fun closelog()

public expect fun setlogmask(maskpri: CInt): CInt

public expect fun syslog(priority: CInt, message: String?, vararg args: Any?)

public expect fun grantpt(fd: CInt): CInt

public expect fun posixOpenpt(flags: CInt): CInt

public expect fun ptsname(fd: CInt): String?

public expect fun unlockpt(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt

public expect fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt

public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt

public expect fun memalign(align: ULong, size: ULong): COpaquePointer?

public expect fun setgroups(ngroups: ULong, ptr: GidT?): CInt

public expect fun pipe2(fds: CInt?, flags: CInt): CInt

public expect fun statfs(path: String?, buf: Statfs?): CInt

public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun fdopendir(fd: CInt): DIR?

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt

public expect fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt

public expect fun clearenv(): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt

public expect fun setreuid(ruid: UidT, euid: UidT): CInt

public expect fun setregid(rgid: GidT, egid: GidT): CInt

public expect fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt

public expect fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt

public expect fun acct(filename: String?): CInt

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt

public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt

public expect fun lutimes(file: String?, times: Timeval?): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): Passwd?

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt

public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt

public expect fun errnoLocation(): CInt?

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun readahead(fd: CInt, offset: Off64T, count: ULong): SsizeT

public expect fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt

public expect fun timerfdCreate(clockid: CInt, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun quotactl(cmd: CInt, special: String?, id: CInt, data: String?): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun mkostemp(template: String?, flags: CInt): CInt

public expect fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt

public expect fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): String?

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun setfsgid(gid: GidT): CInt

public expect fun setfsuid(uid: UidT): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun ifNameindex(): IfNameindex?

public expect fun ifFreenameindex(ptr: IfNameindex?)

public expect fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUInt): CInt

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: Ifaddrs?)

public expect fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt

public expect fun globfree(pglob: GlobT?)

public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT

public expect fun mkstemps(template: String?, suffixlen: CInt): CInt

public expect fun futimes(fd: CInt, times: Timeval?): CInt

public expect fun nlLanginfo(item: NlItem): String?

public expect fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun getdomainname(name: String?, len: ULong): CInt

public expect fun setdomainname(name: String?, len: ULong): CInt

public expect fun vhangup(): CInt

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt

public expect fun sync()

public expect fun syscall(num: CLong, vararg args: Any?): CLong

public expect fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt

public expect fun umount(target: String?): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun tee(fdIn: CInt, fdOut: CInt, len: ULong, flags: CUInt): SsizeT

public expect fun settimeofday(tv: Timeval?, tz: Timezone?): CInt

public expect fun splice(fdIn: CInt, offIn: LoffT?, fdOut: CInt, offOut: LoffT?, len: ULong, flags: CUInt): SsizeT

public expect fun eventfd(initval: CUInt, flags: CInt): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt

public expect fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt

public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt

public expect fun schedSetparam(pid: PidT, param: SchedParam?): CInt

public expect fun swapoff(puath: String?): CInt

public expect fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: ULong, flags: CUInt): SsizeT

public expect fun mount(src: String?, target: String?, fstype: String?, flags: CULong, data: COpaquePointer?): CInt

public expect fun personality(persona: CULong): CInt

public expect fun schedGetparam(pid: PidT, param: SchedParam?): CInt

public expect fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt

public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun clone(cb: ((COpaquePointer?) -> CInt)?, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg args: Any?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt

public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt

public expect fun sethostname(name: String?, len: ULong): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun umount2(target: String?, flags: CInt): CInt

public expect fun swapon(path: String?, swapflags: CInt): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt

public expect fun sigsuspend(mask: SigsetT?): CInt

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun semClose(sem: SemT?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun initgroups(user: String?, group: GidT): CInt

public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT?

public expect fun getgrnam(name: String?): Group?

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt

public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt

public expect fun getgrgid(gid: GidT): Group?

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): Group?

public expect fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt

public expect fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt
