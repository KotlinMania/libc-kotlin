// port-lint: source fuchsia/fuchsia_mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.ENODATA
import io.github.kotlinmania.libc.FIONREAD
import io.github.kotlinmania.libc.IpcPerm
import io.github.kotlinmania.libc.O_NONBLOCK
import io.github.kotlinmania.libc.SIGSYS
import io.github.kotlinmania.libc.U64

// Definitions found commonly among almost all Unix derivatives
//
// More functions and definitions can be found in the more specific modules
// according to the platform in question.

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public fun interface SigeventSigevNotifyFunctionCallback {
    public operator fun invoke(arg0: io.github.kotlinmania.libc.Sigval)
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface CloneCbCallback {
    public operator fun invoke(arg0: COpaquePointer?): CInt
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: io.github.kotlinmania.libc.DlPhdrInfo?, size: SizeT, data: COpaquePointer?): CInt
}

// PUB_TYPE
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

public typealias SighandlerT = SizeT

public typealias CcT = CUchar

public typealias SaFamilyT = UShort

public typealias PthreadKeyT = CUint

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias ClockidT = CInt

public typealias KeyT = CInt

public typealias IdT = CUint

public typealias UsecondsT = UInt

public typealias DevT = ULong

public typealias SocklenT = UInt

public typealias PthreadT = CUlong

public typealias ModeT = UInt

public typealias Ino64T = ULong

public typealias Off64T = Long

public typealias Blkcnt64T = Long

public typealias Rlim64T = ULong

public typealias MqdT = CInt

public typealias NfdsT = CUlong

public typealias NlItem = CInt

public typealias IdtypeT = CUint

public typealias LoffT = CLonglong

public typealias U8 = CUchar

public typealias U16 = CUshort

public typealias S16 = CShort

public typealias U32 = CUint

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

public typealias ShmattT = CUlong

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias FsblkcntT = CUlonglong

public typealias FsfilcntT = CUlonglong

public typealias RlimT = CUlonglong

// PUB_STRUCT
// intentionally not public, only used for fdSet
// END_PUB_CONST
public sealed class Timezone {
}

public sealed class DIR {
}

public sealed class Fpos64T {
}

public open class Group(
    public var grName: COpaquePointer?,
    public var grPasswd: COpaquePointer?,
    public var grGid: io.github.kotlinmania.libc.GidT,
    public var grMem: COpaquePointer?,
)

public open class Utimbuf(public var actime: TimeT, public var modtime: TimeT)

public open class Timeval(public var tvSec: TimeT, public var tvUsec: SusecondsT)

public open class Timespec(public var tvSec: TimeT, public var tvNsec: CLong)

// Note(fuchsia): the rlimit and rusage related functions and types don't exist
// within zircon. Are there reasons for keeping them around?
public open class Rlimit(public var rlimCur: RlimT, public var rlimMax: RlimT)

public open class Rusage(
    public var ruUtime: Timeval,
    public var ruStime: Timeval,
    public var ruMaxrss: CLong,
    public var ruIxrss: CLong,
    public var ruIdrss: CLong,
    public var ruIsrss: CLong,
    public var ruMinflt: CLong,
    public var ruMajflt: CLong,
    public var ruNswap: CLong,
    public var ruInblock: CLong,
    public var ruOublock: CLong,
    public var ruMsgsnd: CLong,
    public var ruMsgrcv: CLong,
    public var ruNsignals: CLong,
    public var ruNvcsw: CLong,
    public var ruNivcsw: CLong,
)

public open class InAddr(public var sAddr: InAddrT)

public open class In6Addr(public var s6Addr: List<UByte>)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class IpMreqn(
    public var imrMultiaddr: InAddr,
    public var imrAddress: InAddr,
    public var imrIfindex: CInt,
)

public open class Ipv6Mreq(public var ipv6mrMultiaddr: In6Addr, public var ipv6mrInterface: CUint)

public open class Hostent(
    public var hName: COpaquePointer?,
    public var hAliases: COpaquePointer?,
    public var hAddrtype: CInt,
    public var hLength: CInt,
    public var hAddrList: COpaquePointer?,
)

public open class Iovec(public var iovBase: COpaquePointer?, public var iovLen: SizeT)

public open class Pollfd(
    public var fd: CInt,
    public var events: CShort,
    public var revents: CShort,
)

public open class Winsize(
    public var wsRow: CUshort,
    public var wsCol: CUshort,
    public var wsXpixel: CUshort,
    public var wsYpixel: CUshort,
)

public open class Linger(public var lOnoff: CInt, public var lLinger: CInt)

public open class Sigval(
    // Actually a union of an int and a void*
    public var sivalPtr: COpaquePointer?,
)

// <sys/time.h>
public open class Itimerval(public var itInterval: io.github.kotlinmania.libc.Timeval, public var itValue: io.github.kotlinmania.libc.Timeval)

// <sys/times.h>
public open class Tms(
    public var tmsUtime: io.github.kotlinmania.libc.ClockT,
    public var tmsStime: io.github.kotlinmania.libc.ClockT,
    public var tmsCutime: io.github.kotlinmania.libc.ClockT,
    public var tmsCstime: io.github.kotlinmania.libc.ClockT,
)

public open class Servent(
    public var sName: COpaquePointer?,
    public var sAliases: COpaquePointer?,
    public var sPort: CInt,
    public var sProto: COpaquePointer?,
)

public open class Protoent(
    public var pName: COpaquePointer?,
    public var pAliases: COpaquePointer?,
    public var pProto: CInt,
)

public open class Aiocb(
    public var aioFildes: CInt,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioSigevent: io.github.kotlinmania.libc.Sigevent,
    public var td: COpaquePointer?,
    public var lock: List<CInt>,
    public var err: CInt,
    public var ret: SsizeT,
    public var aioOffset: OffT,
    public var next: COpaquePointer?,
    public var prev: COpaquePointer?,
    public var dummy4: List<CChar>,
)

public open class Sigaction(
    public var saSigaction: io.github.kotlinmania.libc.SighandlerT,
    public var saMask: io.github.kotlinmania.libc.SigsetT,
    public var saFlags: CInt,
    public var saRestorer: SigactionSaRestorerCallback?,
)

public open class Termios(
    public var cIflag: io.github.kotlinmania.libc.TcflagT,
    public var cOflag: io.github.kotlinmania.libc.TcflagT,
    public var cCflag: io.github.kotlinmania.libc.TcflagT,
    public var cLflag: io.github.kotlinmania.libc.TcflagT,
    public var cLine: io.github.kotlinmania.libc.CcT,
    public var cCc: List<io.github.kotlinmania.libc.CcT>,
    public var cIspeed: io.github.kotlinmania.libc.SpeedT,
    public var cOspeed: io.github.kotlinmania.libc.SpeedT,
)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: io.github.kotlinmania.libc.PidT,
)

public open class Ucred(
    public var pid: io.github.kotlinmania.libc.PidT,
    public var uid: io.github.kotlinmania.libc.UidT,
    public var gid: io.github.kotlinmania.libc.GidT,
)

public open class Sockaddr(public var saFamily: SaFamilyT, public var saData: List<CChar>)

public open class SockaddrIn(
    public var sinFamily: SaFamilyT,
    public var sinPort: io.github.kotlinmania.libc.InPortT,
    public var sinAddr: io.github.kotlinmania.libc.InAddr,
    public var sinZero: List<UByte>,
)

public open class SockaddrIn6(
    public var sin6Family: SaFamilyT,
    public var sin6Port: io.github.kotlinmania.libc.InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: io.github.kotlinmania.libc.In6Addr,
    public var sin6ScopeId: UInt,
)

public open class SockaddrVm(
    public var svmFamily: SaFamilyT,
    public var svmReserved1: CUshort,
    public var svmPort: io.github.kotlinmania.libc.InPortT,
    public var svmCid: CUint,
    public var svmZero: List<UByte>,
)

public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    public var aiAddr: io.github.kotlinmania.libc.Sockaddr?,
    public var aiCanonname: COpaquePointer?,
    public var aiNext: Addrinfo?,
)

public open class SockaddrLl(
    public var sllFamily: CUshort,
    public var sllProtocol: CUshort,
    public var sllIfindex: CInt,
    public var sllHatype: CUshort,
    public var sllPkttype: CUchar,
    public var sllHalen: CUchar,
    public var sllAddr: List<CUchar>,
)

public open class FdSet(public var fdsBits: List<CUlong>)

public open class Tm(
    public var tmSec: CInt,
    public var tmMin: CInt,
    public var tmHour: CInt,
    public var tmMday: CInt,
    public var tmMon: CInt,
    public var tmYear: CInt,
    public var tmWday: CInt,
    public var tmYday: CInt,
    public var tmIsdst: CInt,
    public var tmGmtoff: CLong,
    public var tmZone: COpaquePointer?,
)

public open class SchedParam(
    public var schedPriority: CInt,
    public var schedSsLowPriority: CInt,
    public var schedSsReplPeriod: io.github.kotlinmania.libc.Timespec,
    public var schedSsInitBudget: io.github.kotlinmania.libc.Timespec,
    public var schedSsMaxRepl: CInt,
)

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class EpollEvent(public var events: UInt, public var u64: ULong)

public open class Lconv(
    public var decimalPoint: COpaquePointer?,
    public var thousandsSep: COpaquePointer?,
    public var grouping: COpaquePointer?,
    public var intCurrSymbol: COpaquePointer?,
    public var currencySymbol: COpaquePointer?,
    public var monDecimalPoint: COpaquePointer?,
    public var monThousandsSep: COpaquePointer?,
    public var monGrouping: COpaquePointer?,
    public var positiveSign: COpaquePointer?,
    public var negativeSign: COpaquePointer?,
    public var intFracDigits: CChar,
    public var fracDigits: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var nSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var intNSignPosn: CChar,
)

public open class Rlimit64(public var rlimCur: Rlim64T, public var rlimMax: Rlim64T)

public open class GlobT(
    public var glPathc: SizeT,
    public var glPathv: COpaquePointer?,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    public var unused1: COpaquePointer?,
    public var unused2: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
)

public open class Ifaddrs(
    public var ifaNext: Ifaddrs?,
    public var ifaName: COpaquePointer?,
    public var ifaFlags: CUint,
    public var ifaAddr: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaNetmask: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaIfu: io.github.kotlinmania.libc.Sockaddr?,
    // Note(union) This should be a union
    public var ifaData: COpaquePointer?,
)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: io.github.kotlinmania.libc.UidT,
    public var pwGid: io.github.kotlinmania.libc.GidT,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class Spwd(
    public var spNamp: COpaquePointer?,
    public var spPwdp: COpaquePointer?,
    public var spLstchg: CLong,
    public var spMin: CLong,
    public var spMax: CLong,
    public var spWarn: CLong,
    public var spInact: CLong,
    public var spExpire: CLong,
    public var spFlag: CUlong,
)

public open class Statvfs(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFavail: io.github.kotlinmania.libc.FsfilcntT,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class Dqblk(
    public var dqbBhardlimit: ULong,
    public var dqbBsoftlimit: ULong,
    public var dqbCurspace: ULong,
    public var dqbIhardlimit: ULong,
    public var dqbIsoftlimit: ULong,
    public var dqbCurinodes: ULong,
    public var dqbBtime: ULong,
    public var dqbItime: ULong,
    public var dqbValid: UInt,
)

public open class SignalfdSiginfo(
    public var ssiSigno: UInt,
    public var ssiErrno: Int,
    public var ssiCode: Int,
    public var ssiPid: UInt,
    public var ssiUid: UInt,
    public var ssiFd: Int,
    public var ssiTid: UInt,
    public var ssiBand: UInt,
    public var ssiOverrun: UInt,
    public var ssiTrapno: UInt,
    public var ssiStatus: Int,
    public var ssiInt: Int,
    public var ssiPtr: ULong,
    public var ssiUtime: ULong,
    public var ssiStime: ULong,
    public var ssiAddr: ULong,
    public var ssiAddrLsb: UShort,
    public var pad2: UShort,
    public var ssiSyscall: Int,
    public var ssiCallAddr: ULong,
    public var ssiArch: UInt,
    public var pad: List<UByte>,
)

public open class Itimerspec(public var itInterval: io.github.kotlinmania.libc.Timespec, public var itValue: io.github.kotlinmania.libc.Timespec)

public open class FsidT(public var value: List<CInt>)

public open class CpuSetT(public var bits: List<ULong>)

public open class IfNameindex(public var ifIndex: CUint, public var ifName: COpaquePointer?)

// System V IPC
public open class Msginfo(
    public var msgpool: CInt,
    public var msgmap: CInt,
    public var msgmax: CInt,
    public var msgmnb: CInt,
    public var msgmni: CInt,
    public var msgssz: CInt,
    public var msgtql: CInt,
    public var msgseg: CUshort,
)

public open class Mmsghdr(public var msgHdr: io.github.kotlinmania.libc.Msghdr, public var msgLen: CUint)

public open class Sembuf(
    public var semNum: CUshort,
    public var semOp: CShort,
    public var semFlg: CShort,
)

public open class InputEvent(
    public var time: io.github.kotlinmania.libc.Timeval,
    public var type: io.github.kotlinmania.libc.U16,
    public var code: io.github.kotlinmania.libc.U16,
    public var value: io.github.kotlinmania.libc.S32,
)

public open class InputId(
    public var bustype: io.github.kotlinmania.libc.U16,
    public var vendor: io.github.kotlinmania.libc.U16,
    public var product: io.github.kotlinmania.libc.U16,
    public var version: io.github.kotlinmania.libc.U16,
)

public open class InputAbsinfo(
    public var value: io.github.kotlinmania.libc.S32,
    public var minimum: io.github.kotlinmania.libc.S32,
    public var maximum: io.github.kotlinmania.libc.S32,
    public var fuzz: io.github.kotlinmania.libc.S32,
    public var flat: io.github.kotlinmania.libc.S32,
    public var resolution: io.github.kotlinmania.libc.S32,
)

public open class InputKeymapEntry(
    public var flags: io.github.kotlinmania.libc.U8,
    public var len: io.github.kotlinmania.libc.U8,
    public var index: io.github.kotlinmania.libc.U16,
    public var keycode: io.github.kotlinmania.libc.U32,
    public var scancode: List<io.github.kotlinmania.libc.U8>,
)

public open class InputMask(
    public var type: io.github.kotlinmania.libc.U32,
    public var codesSize: io.github.kotlinmania.libc.U32,
    public var codesPtr: U64,
)

public open class FfReplay(public var length: io.github.kotlinmania.libc.U16, public var delay: io.github.kotlinmania.libc.U16)

public open class FfTrigger(public var button: io.github.kotlinmania.libc.U16, public var interval: io.github.kotlinmania.libc.U16)

public open class FfEnvelope(
    public var attackLength: io.github.kotlinmania.libc.U16,
    public var attackLevel: io.github.kotlinmania.libc.U16,
    public var fadeLength: io.github.kotlinmania.libc.U16,
    public var fadeLevel: io.github.kotlinmania.libc.U16,
)

public open class FfConstantEffect(public var level: io.github.kotlinmania.libc.S16, public var envelope: FfEnvelope)

public open class FfRampEffect(
    public var startLevel: io.github.kotlinmania.libc.S16,
    public var endLevel: io.github.kotlinmania.libc.S16,
    public var envelope: FfEnvelope,
)

public open class FfConditionEffect(
    public var rightSaturation: io.github.kotlinmania.libc.U16,
    public var leftSaturation: io.github.kotlinmania.libc.U16,
    public var rightCoeff: io.github.kotlinmania.libc.S16,
    public var leftCoeff: io.github.kotlinmania.libc.S16,
    public var deadband: io.github.kotlinmania.libc.U16,
    public var center: io.github.kotlinmania.libc.S16,
)

public open class FfPeriodicEffect(
    public var waveform: io.github.kotlinmania.libc.U16,
    public var period: io.github.kotlinmania.libc.U16,
    public var magnitude: io.github.kotlinmania.libc.S16,
    public var offset: io.github.kotlinmania.libc.S16,
    public var phase: io.github.kotlinmania.libc.U16,
    public var envelope: FfEnvelope,
    public var customLen: io.github.kotlinmania.libc.U32,
    public var customData: CShort?,
)

public open class FfRumbleEffect(public var strongMagnitude: io.github.kotlinmania.libc.U16, public var weakMagnitude: io.github.kotlinmania.libc.U16)

public open class FfEffect(
    public var type: io.github.kotlinmania.libc.U16,
    public var id: io.github.kotlinmania.libc.S16,
    public var direction: io.github.kotlinmania.libc.U16,
    public var trigger: FfTrigger,
    public var replay: FfReplay,
    // Note(1.0): this is actually a union
    public var u: List<ULong>,
)

public open class DlPhdrInfo(
    public var dlpiAddr: Elf64Addr,
    public var dlpiName: COpaquePointer?,
    public var dlpiPhdr: Elf64Phdr?,
    public var dlpiPhnum: Elf64Half,
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
    public var dlpiTlsModid: SizeT,
    public var dlpiTlsData: COpaquePointer?,
)

public open class Elf32Phdr(
    public var pType: Elf32Word,
    public var pOffset: Elf32Off,
    public var pVaddr: Elf32Addr,
    public var pPaddr: Elf32Addr,
    public var pFilesz: Elf32Word,
    public var pMemsz: Elf32Word,
    public var pFlags: Elf32Word,
    public var pAlign: Elf32Word,
)

public open class Elf64Phdr(
    public var pType: Elf64Word,
    public var pFlags: Elf64Word,
    public var pOffset: Elf64Off,
    public var pVaddr: Elf64Addr,
    public var pPaddr: Elf64Addr,
    public var pFilesz: Elf64Xword,
    public var pMemsz: Elf64Xword,
    public var pAlign: Elf64Xword,
)

public open class Statfs64(
    public var fType: CUlong,
    public var fBsize: CUlong,
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFsid: io.github.kotlinmania.libc.FsidT,
    public var fNamelen: CUlong,
    public var fFrsize: CUlong,
    public var fFlags: CUlong,
    public var fSpare: List<CUlong>,
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
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
)

public open class PthreadAttrT(public var size: List<ULong>)

public open class SigsetT(public var value: List<CUlong>)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmAtime: io.github.kotlinmania.libc.TimeT,
    public var shmDtime: io.github.kotlinmania.libc.TimeT,
    public var shmCtime: io.github.kotlinmania.libc.TimeT,
    public var shmCpid: io.github.kotlinmania.libc.PidT,
    public var shmLpid: io.github.kotlinmania.libc.PidT,
    public var shmNattch: CUlong,
    public var pad1: CUlong,
    public var pad2: CUlong,
)

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var msgStime: io.github.kotlinmania.libc.TimeT,
    public var msgRtime: io.github.kotlinmania.libc.TimeT,
    public var msgCtime: io.github.kotlinmania.libc.TimeT,
    public var msgCbytes: CUlong,
    public var msgQnum: io.github.kotlinmania.libc.MsgqnumT,
    public var msgQbytes: io.github.kotlinmania.libc.MsglenT,
    public var msgLspid: io.github.kotlinmania.libc.PidT,
    public var msgLrpid: io.github.kotlinmania.libc.PidT,
    public var pad1: CUlong,
    public var pad2: CUlong,
)

public open class Statfs(
    public var fType: CUlong,
    public var fBsize: CUlong,
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFsid: io.github.kotlinmania.libc.FsidT,
    public var fNamelen: CUlong,
    public var fFrsize: CUlong,
    public var fFlags: CUlong,
    public var fSpare: List<CUlong>,
)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: io.github.kotlinmania.libc.SocklenT,
    public var msgIov: io.github.kotlinmania.libc.Iovec?,
    public var msgIovlen: CInt,
    public var pad1: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: io.github.kotlinmania.libc.SocklenT,
    public var pad2: io.github.kotlinmania.libc.SocklenT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: io.github.kotlinmania.libc.SocklenT,
    public var pad1: CInt,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class SemT(public var value: List<CInt>)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var pad: List<CInt>,
    public var align: List<Int>,
)

public open class Termios2(
    public var cIflag: io.github.kotlinmania.libc.TcflagT,
    public var cOflag: io.github.kotlinmania.libc.TcflagT,
    public var cCflag: io.github.kotlinmania.libc.TcflagT,
    public var cLflag: io.github.kotlinmania.libc.TcflagT,
    public var cLine: io.github.kotlinmania.libc.CcT,
    public var cCc: List<io.github.kotlinmania.libc.CcT>,
    public var cIspeed: io.github.kotlinmania.libc.SpeedT,
    public var cOspeed: io.github.kotlinmania.libc.SpeedT,
)

public open class In6Pktinfo(public var ipi6Addr: io.github.kotlinmania.libc.In6Addr, public var ipi6Ifindex: CUint)

public open class PthreadMutexattrT(public var size: List<UByte>)

public open class PthreadRwlockattrT(public var size: List<UByte>)

public open class PthreadCondattrT(public var size: List<UByte>)

public open class Sysinfo(
    public var uptime: CUlong,
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
    public var reserved: List<CChar>,
)

public open class SockaddrUn(public var sunFamily: SaFamilyT, public var sunPath: List<CChar>)

public open class SockaddrStorage(
    public var ssFamily: SaFamilyT,
    public var ssPad2: List<UByte>,
    public var ssAlign: SizeT,
)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
    public var domainname: List<CChar>,
)

public open class Dirent(
    public var dIno: io.github.kotlinmania.libc.InoT,
    public var dOff: OffT,
    public var dReclen: CUshort,
    public var dType: CUchar,
    public var dName: List<CChar>,
)

public open class Dirent64(
    public var dIno: io.github.kotlinmania.libc.Ino64T,
    public var dOff: Off64T,
    public var dReclen: CUshort,
    public var dType: CUchar,
    public var dName: List<CChar>,
)

// x32 compatibility
// See https://sourceware.org/bugzilla/showBug.cgi?id=21279
public open class MqAttr(
    public var mqFlags: CLong,
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqCurmsgs: CLong,
    public var pad: List<CLong>,
)

public open class SockaddrNl(
    public var nlFamily: io.github.kotlinmania.libc.SaFamilyT,
    public var nlPad: CUshort,
    public var nlPid: UInt,
    public var nlGroups: UInt,
)

public open class Sigevent(
    public var sigevValue: io.github.kotlinmania.libc.Sigval,
    public var sigevSigno: CInt,
    public var sigevNotify: CInt,
    public var sigevNotifyFunction: SigeventSigevNotifyFunctionCallback,
    public var sigevNotifyAttributes: PthreadAttrT?,
    public var pad: List<CChar>,
)

public open class PthreadMutexT(public var size: List<UByte>)

public open class PthreadRwlockT(public var size: List<UByte>)

public open class PthreadCondT(public var size: List<UByte>)

// PUB_CONST
public val INT_MIN: CInt = -2147483648

public val INT_MAX: CInt = 2147483647

public val SIG_DFL: SighandlerT = 0.toULong()

public val SIG_IGN: SighandlerT = 1.toULong()

public val SIG_ERR: SighandlerT = (0.inv()).toULong()

public val DT_UNKNOWN: UByte = 0u

public val DT_FIFO: UByte = 1u

public val DT_CHR: UByte = 2u

public val DT_DIR: UByte = 4u

public val DT_BLK: UByte = 6u

public val DT_REG: UByte = 8u

public val DT_LNK: UByte = 10u

public val DT_SOCK: UByte = 12u

public val FD_CLOEXEC: CInt = 0x1

public val USRQUOTA: CInt = 0

public val GRPQUOTA: CInt = 1

public val SIGIOT: CInt = 6

public val S_ISUID: ModeT = 2048u

public val S_ISGID: ModeT = 1024u

public val S_ISVTX: ModeT = 512u

public val IF_NAMESIZE: SizeT = 16uL

public val IFNAMSIZ: SizeT = IF_NAMESIZE

public val LOG_EMERG: CInt = 0

public val LOG_ALERT: CInt = 1

public val LOG_CRIT: CInt = 2

public val LOG_ERR: CInt = 3

public val LOG_WARNING: CInt = 4

public val LOG_NOTICE: CInt = 5

public val LOG_INFO: CInt = 6

public val LOG_DEBUG: CInt = 7

public val LOG_KERN: CInt = 0

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

public val LOG_PID: CInt = 0x01

public val LOG_CONS: CInt = 0x02

public val LOG_ODELAY: CInt = 0x04

public val LOG_NDELAY: CInt = 0x08

public val LOG_NOWAIT: CInt = 0x10

public val LOG_PRIMASK: CInt = 7

public val LOG_FACMASK: CInt = 0x3f8

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val PRIO_MIN: CInt = -20

public val PRIO_MAX: CInt = 20

public val IPPROTO_ICMP: CInt = 1

public val IPPROTO_ICMPV6: CInt = 58

public val IPPROTO_TCP: CInt = 6

public val IPPROTO_UDP: CInt = 17

public val IPPROTO_IP: CInt = 0

public val IPPROTO_IPV6: CInt = 41

public val INADDR_LOOPBACK: InAddrT = 2130706433u

public val INADDR_ANY: InAddrT = 0u

public val INADDR_BROADCAST: InAddrT = 4294967295u

public val INADDR_NONE: InAddrT = 4294967295u

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 2147483647

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val IOFBF: CInt = 0

public val IONBF: CInt = 2

public val IOLBF: CInt = 1

public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

// Linux-specific fcntls
public val F_SETLEASE: CInt = 1024

public val F_GETLEASE: CInt = 1025

public val F_NOTIFY: CInt = 1026

public val F_CANCELLK: CInt = 1029

public val F_DUPFD_CLOEXEC: CInt = 1030

public val F_SETPIPE_SZ: CInt = 1031

public val F_GETPIPE_SZ: CInt = 1032

public val F_ADD_SEALS: CInt = 1033

public val F_GET_SEALS: CInt = 1034

public val F_SEAL_SEAL: CInt = 0x0001

public val F_SEAL_SHRINK: CInt = 0x0002

public val F_SEAL_GROW: CInt = 0x0004

public val F_SEAL_WRITE: CInt = 0x0008

// Note(#235): Include file sealing fcntls once we have a way to verify them.
public val SIGTRAP: CInt = 5

public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_CREATE_DETACHED: CInt = 1

public val CLOCK_REALTIME: io.github.kotlinmania.libc.ClockidT = 0

public val CLOCK_MONOTONIC: io.github.kotlinmania.libc.ClockidT = 1

public val CLOCK_PROCESS_CPUTIME_ID: io.github.kotlinmania.libc.ClockidT = 2

public val CLOCK_THREAD_CPUTIME_ID: io.github.kotlinmania.libc.ClockidT = 3

public val CLOCK_MONOTONIC_RAW: io.github.kotlinmania.libc.ClockidT = 4

public val CLOCK_REALTIME_COARSE: io.github.kotlinmania.libc.ClockidT = 5

public val CLOCK_MONOTONIC_COARSE: io.github.kotlinmania.libc.ClockidT = 6

public val CLOCK_BOOTTIME: io.github.kotlinmania.libc.ClockidT = 7

public val CLOCK_REALTIME_ALARM: io.github.kotlinmania.libc.ClockidT = 8

public val CLOCK_BOOTTIME_ALARM: io.github.kotlinmania.libc.ClockidT = 9

public val CLOCK_SGI_CYCLE: io.github.kotlinmania.libc.ClockidT = 10

public val CLOCK_TAI: io.github.kotlinmania.libc.ClockidT = 11

public val TIMER_ABSTIME: CInt = 1

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_LOCKS: CInt = 10

public val RLIMIT_SIGPENDING: CInt = 11

public val RLIMIT_MSGQUEUE: CInt = 12

public val RLIMIT_NICE: CInt = 13

public val RLIMIT_RTPRIO: CInt = 14

public val RUSAGE_SELF: CInt = 0

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val S_IFIFO: ModeT = 4096u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFMT: ModeT = 61440u

public val S_IRWXU: ModeT = 448u

public val S_IXUSR: ModeT = 64u

public val S_IWUSR: ModeT = 128u

public val S_IRUSR: ModeT = 256u

public val S_IRWXG: ModeT = 56u

public val S_IXGRP: ModeT = 8u

public val S_IWGRP: ModeT = 16u

public val S_IRGRP: ModeT = 32u

public val S_IRWXO: ModeT = 7u

public val S_IXOTH: ModeT = 1u

public val S_IWOTH: ModeT = 2u

public val S_IROTH: ModeT = 4u

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGABRT: CInt = 6

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGSEGV: CInt = 11

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val LC_CTYPE: CInt = 0

public val LC_NUMERIC: CInt = 1

public val LC_TIME: CInt = 2

public val LC_COLLATE: CInt = 3

public val LC_MONETARY: CInt = 4

public val LC_MESSAGES: CInt = 5

public val LC_ALL: CInt = 6

public val LC_CTYPE_MASK: CInt = 1 shl LC_CTYPE

public val LC_NUMERIC_MASK: CInt = 1 shl LC_NUMERIC

public val LC_TIME_MASK: CInt = 1 shl LC_TIME

public val LC_COLLATE_MASK: CInt = 1 shl LC_COLLATE

public val LC_MONETARY_MASK: CInt = 1 shl LC_MONETARY

public val LC_MESSAGES_MASK: CInt = 1 shl LC_MESSAGES

// LC_ALL_MASK defined per platform
public val MAP_FILE: CInt = 0x0000

public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_FIXED: CInt = 0x0010

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

// MS_ flags for msync(2)
public val MS_ASYNC: CInt = 0x0001

public val MS_INVALIDATE: CInt = 0x0002

public val MS_SYNC: CInt = 0x0004

// MS_ flags for mount(2)
public val MS_RDONLY: CUlong = 0x01uL

public val MS_NOSUID: CUlong = 0x02uL

public val MS_NODEV: CUlong = 0x04uL

public val MS_NOEXEC: CUlong = 0x08uL

public val MS_SYNCHRONOUS: CUlong = 0x10uL

public val MS_REMOUNT: CUlong = 0x20uL

public val MS_MANDLOCK: CUlong = 0x40uL

public val MS_DIRSYNC: CUlong = 0x80uL

public val MS_NOATIME: CUlong = 0x0400uL

public val MS_NODIRATIME: CUlong = 0x0800uL

public val MS_BIND: CUlong = 0x1000uL

public val MS_MOVE: CUlong = 0x2000uL

public val MS_REC: CUlong = 0x4000uL

public val MS_SILENT: CUlong = 0x8000uL

public val MS_POSIXACL: CUlong = 0x010000uL

public val MS_UNBINDABLE: CUlong = 0x020000uL

public val MS_PRIVATE: CUlong = 0x040000uL

public val MS_SLAVE: CUlong = 0x080000uL

public val MS_SHARED: CUlong = 0x100000uL

public val MS_RELATIME: CUlong = 0x200000uL

public val MS_KERNMOUNT: CUlong = 0x400000uL

public val MS_I_VERSION: CUlong = 0x800000uL

public val MS_STRICTATIME: CUlong = 0x1000000uL

public val MS_ACTIVE: CUlong = 0x40000000uL

public val MS_NOUSER: CUlong = 0x80000000uL

public val MS_MGC_VAL: CUlong = 0xc0ed0000uL

public val MS_MGC_MSK: CUlong = 0xffff0000uL

public val MS_RMT_MASK: CUlong = 0x800051uL

public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val ENOTBLK: CInt = 15

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val EWOULDBLOCK: CInt = EAGAIN

public val SCM_RIGHTS: CInt = 0x01

public val SCM_CREDENTIALS: CInt = 0x02

public val PROT_GROWSDOWN: CInt = 0x1000000

public val PROT_GROWSUP: CInt = 0x2000000

public val MAP_TYPE: CInt = 0x000f

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val MADV_FREE: CInt = 8

public val MADV_REMOVE: CInt = 9

public val MADV_DONTFORK: CInt = 10

public val MADV_DOFORK: CInt = 11

public val MADV_MERGEABLE: CInt = 12

public val MADV_UNMERGEABLE: CInt = 13

public val MADV_HUGEPAGE: CInt = 14

public val MADV_NOHUGEPAGE: CInt = 15

public val MADV_DONTDUMP: CInt = 16

public val MADV_DODUMP: CInt = 17

public val MADV_HWPOISON: CInt = 100

public val MADV_SOFT_OFFLINE: CInt = 101

public val IFF_UP: CInt = 0x1

public val IFF_BROADCAST: CInt = 0x2

public val IFF_DEBUG: CInt = 0x4

public val IFF_LOOPBACK: CInt = 0x8

public val IFF_POINTOPOINT: CInt = 0x10

public val IFF_NOTRAILERS: CInt = 0x20

public val IFF_RUNNING: CInt = 0x40

public val IFF_NOARP: CInt = 0x80

public val IFF_PROMISC: CInt = 0x100

public val IFF_ALLMULTI: CInt = 0x200

public val IFF_MASTER: CInt = 0x400

public val IFF_SLAVE: CInt = 0x800

public val IFF_MULTICAST: CInt = 0x1000

public val IFF_PORTSEL: CInt = 0x2000

public val IFF_AUTOMEDIA: CInt = 0x4000

public val IFF_DYNAMIC: CInt = 0x8000

public val IFF_TUN: CInt = 0x0001

public val IFF_TAP: CInt = 0x0002

public val IFF_NO_PI: CInt = 0x1000

public val SOL_IP: CInt = 0

public val SOL_TCP: CInt = 6

public val SOL_UDP: CInt = 17

public val SOL_IPV6: CInt = 41

public val SOL_ICMPV6: CInt = 58

public val SOL_RAW: CInt = 255

public val SOL_DECNET: CInt = 261

public val SOL_X25: CInt = 262

public val SOL_PACKET: CInt = 263

public val SOL_ATM: CInt = 264

public val SOL_AAL: CInt = 265

public val SOL_IRDA: CInt = 266

public val SOL_NETBEUI: CInt = 267

public val SOL_LLC: CInt = 268

public val SOL_DCCP: CInt = 269

public val SOL_NETLINK: CInt = 270

public val SOL_TIPC: CInt = 271

public val AF_UNSPEC: CInt = 0

public val AF_UNIX: CInt = 1

public val AF_LOCAL: CInt = 1

public val AF_INET: CInt = 2

public val AF_AX25: CInt = 3

public val AF_IPX: CInt = 4

public val AF_APPLETALK: CInt = 5

public val AF_NETROM: CInt = 6

public val AF_BRIDGE: CInt = 7

public val AF_ATMPVC: CInt = 8

public val AF_X25: CInt = 9

public val AF_INET6: CInt = 10

public val AF_ROSE: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_NETBEUI: CInt = 13

public val AF_SECURITY: CInt = 14

public val AF_KEY: CInt = 15

public val AF_NETLINK: CInt = 16

public val AF_ROUTE: CInt = AF_NETLINK

public val AF_PACKET: CInt = 17

public val AF_ASH: CInt = 18

public val AF_ECONET: CInt = 19

public val AF_ATMSVC: CInt = 20

public val AF_RDS: CInt = 21

public val AF_SNA: CInt = 22

public val AF_IRDA: CInt = 23

public val AF_PPPOX: CInt = 24

public val AF_WANPIPE: CInt = 25

public val AF_LLC: CInt = 26

public val AF_CAN: CInt = 29

public val AF_TIPC: CInt = 30

public val AF_BLUETOOTH: CInt = 31

public val AF_IUCV: CInt = 32

public val AF_RXRPC: CInt = 33

public val AF_ISDN: CInt = 34

public val AF_PHONET: CInt = 35

public val AF_IEEE802154: CInt = 36

public val AF_CAIF: CInt = 37

public val AF_ALG: CInt = 38

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_UNIX: CInt = AF_UNIX

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_INET: CInt = AF_INET

public val PF_AX25: CInt = AF_AX25

public val PF_IPX: CInt = AF_IPX

public val PF_APPLETALK: CInt = AF_APPLETALK

public val PF_NETROM: CInt = AF_NETROM

public val PF_BRIDGE: CInt = AF_BRIDGE

public val PF_ATMPVC: CInt = AF_ATMPVC

public val PF_X25: CInt = AF_X25

public val PF_INET6: CInt = AF_INET6

public val PF_ROSE: CInt = AF_ROSE

public val PF_DE_CNET: CInt = AF_DE_CNET

public val PF_NETBEUI: CInt = AF_NETBEUI

public val PF_SECURITY: CInt = AF_SECURITY

public val PF_KEY: CInt = AF_KEY

public val PF_NETLINK: CInt = AF_NETLINK

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_PACKET: CInt = AF_PACKET

public val PF_ASH: CInt = AF_ASH

public val PF_ECONET: CInt = AF_ECONET

public val PF_ATMSVC: CInt = AF_ATMSVC

public val PF_RDS: CInt = AF_RDS

public val PF_SNA: CInt = AF_SNA

public val PF_IRDA: CInt = AF_IRDA

public val PF_PPPOX: CInt = AF_PPPOX

public val PF_WANPIPE: CInt = AF_WANPIPE

public val PF_LLC: CInt = AF_LLC

public val PF_CAN: CInt = AF_CAN

public val PF_TIPC: CInt = AF_TIPC

public val PF_BLUETOOTH: CInt = AF_BLUETOOTH

public val PF_IUCV: CInt = AF_IUCV

public val PF_RXRPC: CInt = AF_RXRPC

public val PF_ISDN: CInt = AF_ISDN

public val PF_PHONET: CInt = AF_PHONET

public val PF_IEEE802154: CInt = AF_IEEE802154

public val PF_CAIF: CInt = AF_CAIF

public val PF_ALG: CInt = AF_ALG

public val SOMAXCONN: CInt = 128

public val MSG_OOB: CInt = 1

public val MSG_PEEK: CInt = 2

public val MSG_DONTROUTE: CInt = 4

public val MSG_CTRUNC: CInt = 8

public val MSG_TRUNC: CInt = 0x20

public val MSG_DONTWAIT: CInt = 0x40

public val MSG_EOR: CInt = 0x80

public val MSG_WAITALL: CInt = 0x100

public val MSG_FIN: CInt = 0x200

public val MSG_SYN: CInt = 0x400

public val MSG_CONFIRM: CInt = 0x800

public val MSG_RST: CInt = 0x1000

public val MSG_ERRQUEUE: CInt = 0x2000

public val MSG_NOSIGNAL: CInt = 0x4000

public val MSG_MORE: CInt = 0x8000

public val MSG_WAITFORONE: CInt = 0x10000

public val MSG_FASTOPEN: CInt = 0x20000000

public val MSG_CMSG_CLOEXEC: CInt = 0x40000000

public val SCM_TIMESTAMP: CInt = SO_TIMESTAMP

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val IP_TOS: CInt = 1

public val IP_TTL: CInt = 2

public val IP_HDRINCL: CInt = 3

public val IP_RECVTOS: CInt = 13

public val IP_FREEBIND: CInt = 15

public val IP_TRANSPARENT: CInt = 19

public val IP_MULTICAST_IF: CInt = 32

public val IP_MULTICAST_TTL: CInt = 33

public val IP_MULTICAST_LOOP: CInt = 34

public val IP_ADD_MEMBERSHIP: CInt = 35

public val IP_DROP_MEMBERSHIP: CInt = 36

public val IPV6_UNICAST_HOPS: CInt = 16

public val IPV6_MULTICAST_IF: CInt = 17

public val IPV6_MULTICAST_HOPS: CInt = 18

public val IPV6_MULTICAST_LOOP: CInt = 19

public val IPV6_ADD_MEMBERSHIP: CInt = 20

public val IPV6_DROP_MEMBERSHIP: CInt = 21

public val IPV6_V6ONLY: CInt = 26

public val IPV6_RECVPKTINFO: CInt = 49

public val IPV6_RECVTCLASS: CInt = 66

public val IPV6_TCLASS: CInt = 67

public val TCP_NODELAY: CInt = 1

public val TCP_MAXSEG: CInt = 2

public val TCP_CORK: CInt = 3

public val TCP_KEEPIDLE: CInt = 4

public val TCP_KEEPINTVL: CInt = 5

public val TCP_KEEPCNT: CInt = 6

public val TCP_SYNCNT: CInt = 7

public val TCP_LINGER2: CInt = 8

public val TCP_DEFER_ACCEPT: CInt = 9

public val TCP_WINDOW_CLAMP: CInt = 10

public val TCP_INFO: CInt = 11

public val TCP_QUICKACK: CInt = 12

public val TCP_CONGESTION: CInt = 13

public val SO_DEBUG: CInt = 1

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_NB: CInt = 4

public val LOCK_UN: CInt = 8

public val SS_ONSTACK: CInt = 1

public val SS_DISABLE: CInt = 2

public val PATH_MAX: CInt = 4096

public val FD_SETSIZE: Int = 1024

public val EPOLLIN: CInt = 0x1

public val EPOLLPRI: CInt = 0x2

public val EPOLLOUT: CInt = 0x4

public val EPOLLRDNORM: CInt = 0x40

public val EPOLLRDBAND: CInt = 0x80

public val EPOLLWRNORM: CInt = 0x100

public val EPOLLWRBAND: CInt = 0x200

public val EPOLLMSG: CInt = 0x400

public val EPOLLERR: CInt = 0x8

public val EPOLLHUP: CInt = 0x10

public val EPOLLET: CInt = 0x80000000

public val EPOLL_CTL_ADD: CInt = 1

public val EPOLL_CTL_MOD: CInt = 3

public val EPOLL_CTL_DEL: CInt = 2

public val MNT_DETACH: CInt = 0x2

public val MNT_EXPIRE: CInt = 0x4

public val Q_GETFMT: CInt = 0x800004

public val Q_GETINFO: CInt = 0x800005

public val Q_SETINFO: CInt = 0x800006

public val QIF_BLIMITS: UInt = 1u

public val QIF_SPACE: UInt = 2u

public val QIF_ILIMITS: UInt = 4u

public val QIF_INODES: UInt = 8u

public val QIF_BTIME: UInt = 16u

public val QIF_ITIME: UInt = 32u

public val QIF_LIMITS: UInt = 5u

public val QIF_USAGE: UInt = 10u

public val QIF_TIMES: UInt = 48u

public val QIF_ALL: UInt = 63u

public val MNT_FORCE: CInt = 0x1

public val Q_SYNC: CInt = 0x800001

public val Q_QUOTAON: CInt = 0x800002

public val Q_QUOTAOFF: CInt = 0x800003

public val Q_GETQUOTA: CInt = 0x800007

public val Q_SETQUOTA: CInt = 0x800008

public val TCIOFF: CInt = 2

public val TCION: CInt = 3

public val TCOOFF: CInt = 0

public val TCOON: CInt = 1

public val TCIFLUSH: CInt = 0

public val TCOFLUSH: CInt = 1

public val TCIOFLUSH: CInt = 2

public val NL0: CInt = 0x00000000

public val NL1: CInt = 0x00000100

public val TAB0: CInt = 0x00000000

public val CR0: CInt = 0x00000000

public val FF0: CInt = 0x00000000

public val BS0: CInt = 0x00000000

public val VT0: CInt = 0x00000000

public val VERASE: Int = 2

public val VKILL: Int = 3

public val VINTR: Int = 0

public val VQUIT: Int = 1

public val VLNEXT: Int = 15

public val IGNBRK: io.github.kotlinmania.libc.TcflagT = 0x00000001u

public val BRKINT: io.github.kotlinmania.libc.TcflagT = 0x00000002u

public val IGNPAR: io.github.kotlinmania.libc.TcflagT = 0x00000004u

public val PARMRK: io.github.kotlinmania.libc.TcflagT = 0x00000008u

public val INPCK: io.github.kotlinmania.libc.TcflagT = 0x00000010u

public val ISTRIP: io.github.kotlinmania.libc.TcflagT = 0x00000020u

public val INLCR: io.github.kotlinmania.libc.TcflagT = 0x00000040u

public val IGNCR: io.github.kotlinmania.libc.TcflagT = 0x00000080u

public val ICRNL: io.github.kotlinmania.libc.TcflagT = 0x00000100u

public val IXANY: io.github.kotlinmania.libc.TcflagT = 0x00000800u

public val IMAXBEL: io.github.kotlinmania.libc.TcflagT = 0x00002000u

public val OPOST: io.github.kotlinmania.libc.TcflagT = 0x1u

public val CS5: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val CRTSCTS: io.github.kotlinmania.libc.TcflagT = 0x80000000u

public val ECHO: io.github.kotlinmania.libc.TcflagT = 0x00000008u

public val OCRNL: io.github.kotlinmania.libc.TcflagT = 8u

public val ONOCR: io.github.kotlinmania.libc.TcflagT = 16u

public val ONLRET: io.github.kotlinmania.libc.TcflagT = 32u

public val OFILL: io.github.kotlinmania.libc.TcflagT = 64u

public val OFDEL: io.github.kotlinmania.libc.TcflagT = 128u

public val CLONE_VM: CInt = 0x100

public val CLONE_FS: CInt = 0x200

public val CLONE_FILES: CInt = 0x400

public val CLONE_SIGHAND: CInt = 0x800

public val CLONE_PTRACE: CInt = 0x2000

public val CLONE_VFORK: CInt = 0x4000

public val CLONE_PARENT: CInt = 0x8000

public val CLONE_THREAD: CInt = 0x10000

public val CLONE_NEWNS: CInt = 0x20000

public val CLONE_SYSVSEM: CInt = 0x40000

public val CLONE_SETTLS: CInt = 0x80000

public val CLONE_PARENT_SETTID: CInt = 0x100000

public val CLONE_CHILD_CLEARTID: CInt = 0x200000

public val CLONE_DETACHED: CInt = 0x400000

public val CLONE_UNTRACED: CInt = 0x800000

public val CLONE_CHILD_SETTID: CInt = 0x01000000

public val CLONE_NEWUTS: CInt = 0x04000000

public val CLONE_NEWIPC: CInt = 0x08000000

public val CLONE_NEWUSER: CInt = 0x10000000

public val CLONE_NEWPID: CInt = 0x20000000

public val CLONE_NEWNET: CInt = 0x40000000

public val CLONE_IO: CInt = 0x80000000

public val CLONE_NEWCGROUP: CInt = 0x02000000

public val WNOHANG: CInt = 0x00000001

public val WUNTRACED: CInt = 0x00000002

public val WSTOPPED: CInt = WUNTRACED

public val WEXITED: CInt = 0x00000004

public val WCONTINUED: CInt = 0x00000008

public val WNOWAIT: CInt = 0x01000000

// Options set using PTRACE_SETOPTIONS.
public val PTRACE_O_TRACESYSGOOD: CInt = 0x00000001

public val PTRACE_O_TRACEFORK: CInt = 0x00000002

public val PTRACE_O_TRACEVFORK: CInt = 0x00000004

public val PTRACE_O_TRACECLONE: CInt = 0x00000008

public val PTRACE_O_TRACEEXEC: CInt = 0x00000010

public val PTRACE_O_TRACEVFORKDONE: CInt = 0x00000020

public val PTRACE_O_TRACEEXIT: CInt = 0x00000040

public val PTRACE_O_TRACESECCOMP: CInt = 0x00000080

public val PTRACE_O_EXITKILL: CInt = 0x00100000

public val PTRACE_O_SUSPEND_SECCOMP: CInt = 0x00200000

public val PTRACE_O_MASK: CInt = 0x003000ff

// Wait extended result codes for the above trace options.
public val PTRACE_EVENT_FORK: CInt = 1

public val PTRACE_EVENT_VFORK: CInt = 2

public val PTRACE_EVENT_CLONE: CInt = 3

public val PTRACE_EVENT_EXEC: CInt = 4

public val PTRACE_EVENT_VFORK_DONE: CInt = 5

public val PTRACE_EVENT_EXIT: CInt = 6

public val PTRACE_EVENT_SECCOMP: CInt = 7

// PTRACE_EVENT_STOP was added to glibc in 2.26
// pub const PTRACE_EVENT_STOP: cInt = 128;
public val WNOTHREAD: CInt = 0x20000000

public val WALL: CInt = 0x40000000

public val WCLONE: CInt = 0x80000000

public val SPLICE_F_MOVE: CUint = 0x01u

public val SPLICE_F_NONBLOCK: CUint = 0x02u

public val SPLICE_F_MORE: CUint = 0x04u

public val SPLICE_F_GIFT: CUint = 0x08u

public val RTLD_LOCAL: CInt = 0

public val RTLD_LAZY: CInt = 1

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_RANDOM: CInt = 1

public val POSIX_FADV_SEQUENTIAL: CInt = 2

public val POSIX_FADV_WILLNEED: CInt = 3

public val AT_FDCWD: CInt = -100

public val AT_SYMLINK_NOFOLLOW: CInt = 0x100

public val AT_REMOVEDIR: CInt = 0x200

public val AT_EACCESS: CInt = 0x200

public val AT_SYMLINK_FOLLOW: CInt = 0x400

public val AT_NO_AUTOMOUNT: CInt = 0x800

public val AT_EMPTY_PATH: CInt = 0x1000

public val LOG_CRON: CInt = 9 shl 3

public val LOG_AUTHPRIV: CInt = 10 shl 3

public val LOG_FTP: CInt = 11 shl 3

public val LOG_PERROR: CInt = 0x20

public val PIPE_BUF: Int = 4096

public val SI_LOAD_SHIFT: CUint = 16u

public val CLD_EXITED: CInt = 1

public val CLD_KILLED: CInt = 2

public val CLD_DUMPED: CInt = 3

public val CLD_TRAPPED: CInt = 4

public val CLD_STOPPED: CInt = 5

public val CLD_CONTINUED: CInt = 6

public val SIGEV_SIGNAL: CInt = 0

public val SIGEV_NONE: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val P_ALL: IdtypeT = 0u

public val P_PID: IdtypeT = 1u

public val P_PGID: IdtypeT = 2u

public val UTIME_OMIT: CLong = 1073741822L

public val UTIME_NOW: CLong = 1073741823L

public val POLLIN: CShort = 0x1

public val POLLPRI: CShort = 0x2

public val POLLOUT: CShort = 0x4

public val POLLERR: CShort = 0x8

public val POLLHUP: CShort = 0x10

public val POLLNVAL: CShort = 0x20

public val POLLRDNORM: CShort = 0x040

public val POLLRDBAND: CShort = 0x080

public val ABDAY_1: io.github.kotlinmania.libc.NlItem = 0x20000

public val ABDAY_2: io.github.kotlinmania.libc.NlItem = 0x20001

public val ABDAY_3: io.github.kotlinmania.libc.NlItem = 0x20002

public val ABDAY_4: io.github.kotlinmania.libc.NlItem = 0x20003

public val ABDAY_5: io.github.kotlinmania.libc.NlItem = 0x20004

public val ABDAY_6: io.github.kotlinmania.libc.NlItem = 0x20005

public val ABDAY_7: io.github.kotlinmania.libc.NlItem = 0x20006

public val DAY_1: io.github.kotlinmania.libc.NlItem = 0x20007

public val DAY_2: io.github.kotlinmania.libc.NlItem = 0x20008

public val DAY_3: io.github.kotlinmania.libc.NlItem = 0x20009

public val DAY_4: io.github.kotlinmania.libc.NlItem = 0x2000A

public val DAY_5: io.github.kotlinmania.libc.NlItem = 0x2000B

public val DAY_6: io.github.kotlinmania.libc.NlItem = 0x2000C

public val DAY_7: io.github.kotlinmania.libc.NlItem = 0x2000D

public val ABMON_1: io.github.kotlinmania.libc.NlItem = 0x2000E

public val ABMON_2: io.github.kotlinmania.libc.NlItem = 0x2000F

public val ABMON_3: io.github.kotlinmania.libc.NlItem = 0x20010

public val ABMON_4: io.github.kotlinmania.libc.NlItem = 0x20011

public val ABMON_5: io.github.kotlinmania.libc.NlItem = 0x20012

public val ABMON_6: io.github.kotlinmania.libc.NlItem = 0x20013

public val ABMON_7: io.github.kotlinmania.libc.NlItem = 0x20014

public val ABMON_8: io.github.kotlinmania.libc.NlItem = 0x20015

public val ABMON_9: io.github.kotlinmania.libc.NlItem = 0x20016

public val ABMON_10: io.github.kotlinmania.libc.NlItem = 0x20017

public val ABMON_11: io.github.kotlinmania.libc.NlItem = 0x20018

public val ABMON_12: io.github.kotlinmania.libc.NlItem = 0x20019

public val MON_1: io.github.kotlinmania.libc.NlItem = 0x2001A

public val MON_2: io.github.kotlinmania.libc.NlItem = 0x2001B

public val MON_3: io.github.kotlinmania.libc.NlItem = 0x2001C

public val MON_4: io.github.kotlinmania.libc.NlItem = 0x2001D

public val MON_5: io.github.kotlinmania.libc.NlItem = 0x2001E

public val MON_6: io.github.kotlinmania.libc.NlItem = 0x2001F

public val MON_7: io.github.kotlinmania.libc.NlItem = 0x20020

public val MON_8: io.github.kotlinmania.libc.NlItem = 0x20021

public val MON_9: io.github.kotlinmania.libc.NlItem = 0x20022

public val MON_10: io.github.kotlinmania.libc.NlItem = 0x20023

public val MON_11: io.github.kotlinmania.libc.NlItem = 0x20024

public val MON_12: io.github.kotlinmania.libc.NlItem = 0x20025

public val AM_STR: io.github.kotlinmania.libc.NlItem = 0x20026

public val PM_STR: io.github.kotlinmania.libc.NlItem = 0x20027

public val D_T_FMT: io.github.kotlinmania.libc.NlItem = 0x20028

public val D_FMT: io.github.kotlinmania.libc.NlItem = 0x20029

public val T_FMT: io.github.kotlinmania.libc.NlItem = 0x2002A

public val T_FMT_AMPM: io.github.kotlinmania.libc.NlItem = 0x2002B

public val ERA: io.github.kotlinmania.libc.NlItem = 0x2002C

public val ERA_D_FMT: io.github.kotlinmania.libc.NlItem = 0x2002E

public val ALT_DIGITS: io.github.kotlinmania.libc.NlItem = 0x2002F

public val ERA_D_T_FMT: io.github.kotlinmania.libc.NlItem = 0x20030

public val ERA_T_FMT: io.github.kotlinmania.libc.NlItem = 0x20031

public val CODESET: io.github.kotlinmania.libc.NlItem = 14

public val CRNCYSTR: io.github.kotlinmania.libc.NlItem = 0x4000F

public val RUSAGE_THREAD: CInt = 1

public val RUSAGE_CHILDREN: CInt = -1

public val RADIXCHAR: io.github.kotlinmania.libc.NlItem = 0x10000

public val THOUSEP: io.github.kotlinmania.libc.NlItem = 0x10001

public val YESEXPR: io.github.kotlinmania.libc.NlItem = 0x50000

public val NOEXPR: io.github.kotlinmania.libc.NlItem = 0x50001

public val YESSTR: io.github.kotlinmania.libc.NlItem = 0x50002

public val NOSTR: io.github.kotlinmania.libc.NlItem = 0x50003

public val FILENAME_MAX: CUint = 4096u

public val L_TMPNAM: CUint = 20u

public val PC_LINK_MAX: CInt = 0

public val PC_MAX_CANON: CInt = 1

public val PC_MAX_INPUT: CInt = 2

public val PC_NAME_MAX: CInt = 3

public val PC_PATH_MAX: CInt = 4

public val PC_PIPE_BUF: CInt = 5

public val PC_CHOWN_RESTRICTED: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_SYNC_IO: CInt = 9

public val PC_ASYNC_IO: CInt = 10

public val PC_PRIO_IO: CInt = 11

public val PC_SOCK_MAXBUF: CInt = 12

public val PC_FILESIZEBITS: CInt = 13

public val PC_REC_INCR_XFER_SIZE: CInt = 14

public val PC_REC_MAX_XFER_SIZE: CInt = 15

public val PC_REC_MIN_XFER_SIZE: CInt = 16

public val PC_REC_XFER_ALIGN: CInt = 17

public val PC_ALLOC_SIZE_MIN: CInt = 18

public val PC_SYMLINK_MAX: CInt = 19

public val PC_2_SYMLINKS: CInt = 20

public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_STREAM_MAX: CInt = 5

public val SC_TZNAME_MAX: CInt = 6

public val SC_JOB_CONTROL: CInt = 7

public val SC_SAVED_IDS: CInt = 8

public val SC_REALTIME_SIGNALS: CInt = 9

public val SC_PRIORITY_SCHEDULING: CInt = 10

public val SC_TIMERS: CInt = 11

public val SC_ASYNCHRONOUS_IO: CInt = 12

public val SC_PRIORITIZED_IO: CInt = 13

public val SC_SYNCHRONIZED_IO: CInt = 14

public val SC_FSYNC: CInt = 15

public val SC_MAPPED_FILES: CInt = 16

public val SC_MEMLOCK: CInt = 17

public val SC_MEMLOCK_RANGE: CInt = 18

public val SC_MEMORY_PROTECTION: CInt = 19

public val SC_MESSAGE_PASSING: CInt = 20

public val SC_SEMAPHORES: CInt = 21

public val SC_SHARED_MEMORY_OBJECTS: CInt = 22

public val SC_AIO_LISTIO_MAX: CInt = 23

public val SC_AIO_MAX: CInt = 24

public val SC_AIO_PRIO_DELTA_MAX: CInt = 25

public val SC_DELAYTIMER_MAX: CInt = 26

public val SC_MQ_OPEN_MAX: CInt = 27

public val SC_MQ_PRIO_MAX: CInt = 28

public val SC_VERSION: CInt = 29

public val SC_PAGESIZE: CInt = 30

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_RTSIG_MAX: CInt = 31

public val SC_SEM_NSEMS_MAX: CInt = 32

public val SC_SEM_VALUE_MAX: CInt = 33

public val SC_SIGQUEUE_MAX: CInt = 34

public val SC_TIMER_MAX: CInt = 35

public val SC_BC_BASE_MAX: CInt = 36

public val SC_BC_DIM_MAX: CInt = 37

public val SC_BC_SCALE_MAX: CInt = 38

public val SC_BC_STRING_MAX: CInt = 39

public val SC_COLL_WEIGHTS_MAX: CInt = 40

public val SC_EXPR_NEST_MAX: CInt = 42

public val SC_LINE_MAX: CInt = 43

public val SC_RE_DUP_MAX: CInt = 44

public val SC_2_VERSION: CInt = 46

public val SC_2_C_BIND: CInt = 47

public val SC_2_C_DEV: CInt = 48

public val SC_2_FORT_DEV: CInt = 49

public val SC_2_FORT_RUN: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_LOCALEDEF: CInt = 52

public val SC_UIO_MAXIOV: CInt = 60

public val SC_IOV_MAX: CInt = 60

public val SC_THREADS: CInt = 67

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 68

public val SC_GETGR_R_SIZE_MAX: CInt = 69

public val SC_GETPW_R_SIZE_MAX: CInt = 70

public val SC_LOGIN_NAME_MAX: CInt = 71

public val SC_TTY_NAME_MAX: CInt = 72

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 73

public val SC_THREAD_KEYS_MAX: CInt = 74

public val SC_THREAD_STACK_MIN: CInt = 75

public val SC_THREAD_THREADS_MAX: CInt = 76

public val SC_THREAD_ATTR_STACKADDR: CInt = 77

public val SC_THREAD_ATTR_STACKSIZE: CInt = 78

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 79

public val SC_THREAD_PRIO_INHERIT: CInt = 80

public val SC_THREAD_PRIO_PROTECT: CInt = 81

public val SC_THREAD_PROCESS_SHARED: CInt = 82

public val SC_NPROCESSORS_CONF: CInt = 83

public val SC_NPROCESSORS_ONLN: CInt = 84

public val SC_PHYS_PAGES: CInt = 85

public val SC_AVPHYS_PAGES: CInt = 86

public val SC_ATEXIT_MAX: CInt = 87

public val SC_PASS_MAX: CInt = 88

public val SC_XOPEN_VERSION: CInt = 89

public val SC_XOPEN_XCU_VERSION: CInt = 90

public val SC_XOPEN_UNIX: CInt = 91

public val SC_XOPEN_CRYPT: CInt = 92

public val SC_XOPEN_ENH_I18N: CInt = 93

public val SC_XOPEN_SHM: CInt = 94

public val SC_2_CHAR_TERM: CInt = 95

public val SC_2_UPE: CInt = 97

public val SC_XOPEN_XPG2: CInt = 98

public val SC_XOPEN_XPG3: CInt = 99

public val SC_XOPEN_XPG4: CInt = 100

public val SC_NZERO: CInt = 109

public val SC_XBS5_ILP32_OFF32: CInt = 125

public val SC_XBS5_ILP32_OFFBIG: CInt = 126

public val SC_XBS5_LP64_OFF64: CInt = 127

public val SC_XBS5_LPBIG_OFFBIG: CInt = 128

public val SC_XOPEN_LEGACY: CInt = 129

public val SC_XOPEN_REALTIME: CInt = 130

public val SC_XOPEN_REALTIME_THREADS: CInt = 131

public val SC_ADVISORY_INFO: CInt = 132

public val SC_BARRIERS: CInt = 133

public val SC_CLOCK_SELECTION: CInt = 137

public val SC_CPUTIME: CInt = 138

public val SC_THREAD_CPUTIME: CInt = 139

public val SC_MONOTONIC_CLOCK: CInt = 149

public val SC_READER_WRITER_LOCKS: CInt = 153

public val SC_SPIN_LOCKS: CInt = 154

public val SC_REGEXP: CInt = 155

public val SC_SHELL: CInt = 157

public val SC_SPAWN: CInt = 159

public val SC_SPORADIC_SERVER: CInt = 160

public val SC_THREAD_SPORADIC_SERVER: CInt = 161

public val SC_TIMEOUTS: CInt = 164

public val SC_TYPED_MEMORY_OBJECTS: CInt = 165

public val SC_2_PBS: CInt = 168

public val SC_2_PBS_ACCOUNTING: CInt = 169

public val SC_2_PBS_LOCATE: CInt = 170

public val SC_2_PBS_MESSAGE: CInt = 171

public val SC_2_PBS_TRACK: CInt = 172

public val SC_SYMLOOP_MAX: CInt = 173

public val SC_STREAMS: CInt = 174

public val SC_2_PBS_CHECKPOINT: CInt = 175

public val SC_V6_ILP32_OFF32: CInt = 176

public val SC_V6_ILP32_OFFBIG: CInt = 177

public val SC_V6_LP64_OFF64: CInt = 178

public val SC_V6_LPBIG_OFFBIG: CInt = 179

public val SC_HOST_NAME_MAX: CInt = 180

public val SC_TRACE: CInt = 181

public val SC_TRACE_EVENT_FILTER: CInt = 182

public val SC_TRACE_INHERIT: CInt = 183

public val SC_TRACE_LOG: CInt = 184

public val SC_IPV6: CInt = 235

public val SC_RAW_SOCKETS: CInt = 236

public val SC_V7_ILP32_OFF32: CInt = 237

public val SC_V7_ILP32_OFFBIG: CInt = 238

public val SC_V7_LP64_OFF64: CInt = 239

public val SC_V7_LPBIG_OFFBIG: CInt = 240

public val SC_SS_REPL_MAX: CInt = 241

public val SC_TRACE_EVENT_NAME_MAX: CInt = 242

public val SC_TRACE_NAME_MAX: CInt = 243

public val SC_TRACE_SYS_MAX: CInt = 244

public val SC_TRACE_USER_EVENT_MAX: CInt = 245

public val SC_XOPEN_STREAMS: CInt = 246

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 247

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 248

public val RLIM_SAVED_MAX: io.github.kotlinmania.libc.RlimT = RLIM_INFINITY

public val RLIM_SAVED_CUR: io.github.kotlinmania.libc.RlimT = RLIM_INFINITY

public val GLOB_ERR: CInt = 1 shl 0

public val GLOB_MARK: CInt = 1 shl 1

public val GLOB_NOSORT: CInt = 1 shl 2

public val GLOB_DOOFFS: CInt = 1 shl 3

public val GLOB_NOCHECK: CInt = 1 shl 4

public val GLOB_APPEND: CInt = 1 shl 5

public val GLOB_NOESCAPE: CInt = 1 shl 6

public val GLOB_NOSPACE: CInt = 1

public val GLOB_ABORTED: CInt = 2

public val GLOB_NOMATCH: CInt = 3

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val S_IEXEC: ModeT = 64u

public val S_IWRITE: ModeT = 128u

public val S_IREAD: ModeT = 256u

public val F_LOCK: CInt = 1

public val F_TEST: CInt = 3

public val F_TLOCK: CInt = 2

public val F_ULOCK: CInt = 0

public val IFF_LOWER_UP: CInt = 0x10000

public val IFF_DORMANT: CInt = 0x20000

public val IFF_ECHO: CInt = 0x40000

public val ST_RDONLY: CUlong = 1uL

public val ST_NOSUID: CUlong = 2uL

public val ST_NODEV: CUlong = 4uL

public val ST_NOEXEC: CUlong = 8uL

public val ST_SYNCHRONOUS: CUlong = 16uL

public val ST_MANDLOCK: CUlong = 64uL

public val ST_WRITE: CUlong = 128uL

public val ST_APPEND: CUlong = 256uL

public val ST_IMMUTABLE: CUlong = 512uL

public val ST_NOATIME: CUlong = 1024uL

public val ST_NODIRATIME: CUlong = 2048uL

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1L).toLong())

public val RTLD_DEFAULT: COpaquePointer? = null

public val RTLD_NODELETE: CInt = 0x1000

public val RTLD_NOW: CInt = 0x2

public val TCP_MD5SIG: CInt = 14

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(size = List(SIZEOF_PTHREAD_MUTEX_T) { 0 })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(size = List(SIZEOF_PTHREAD_COND_T) { 0 })

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(size = List(SIZEOF_PTHREAD_RWLOCK_T) { 0 })

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_PROCESS_PRIVATE: CInt = 0

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val SIZEOF_PTHREAD_COND_T: Int = 48

public val RENAME_NOREPLACE: CInt = 1

public val RENAME_EXCHANGE: CInt = 2

public val RENAME_WHITEOUT: CInt = 4

public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val SCHED_BATCH: CInt = 3

public val SCHED_IDLE: CInt = 5

// netinet/in.h
// NOTE: These are in addition to the constants defined in src/unix/mod.rs
// IPPROTO_IP defined in src/unix/mod.rs
/**
 * Hop-by-hop option header
 */
public val IPPROTO_HOPOPTS: CInt = 0

// IPPROTO_ICMP defined in src/unix/mod.rs
/**
 * group mgmt protocol
 */
public val IPPROTO_IGMP: CInt = 2

/**
 * for compatibility
 */
public val IPPROTO_IPIP: CInt = 4

// IPPROTO_TCP defined in src/unix/mod.rs
/**
 * exterior gateway protocol
 */
public val IPPROTO_EGP: CInt = 8

/**
 * pup
 */
public val IPPROTO_PUP: CInt = 12

// IPPROTO_UDP defined in src/unix/mod.rs
/**
 * xns idp
 */
public val IPPROTO_IDP: CInt = 22

/**
 * tp-4 w/ class negotiation
 */
public val IPPROTO_TP: CInt = 29

/**
 * DCCP
 */
public val IPPROTO_DCCP: CInt = 33

// IPPROTO_IPV6 defined in src/unix/mod.rs
/**
 * IP6 routing header
 */
public val IPPROTO_ROUTING: CInt = 43

/**
 * IP6 fragmentation header
 */
public val IPPROTO_FRAGMENT: CInt = 44

/**
 * resource reservation
 */
public val IPPROTO_RSVP: CInt = 46

/**
 * General Routing Encap.
 */
public val IPPROTO_GRE: CInt = 47

/**
 * IP6 Encap Sec. Payload
 */
public val IPPROTO_ESP: CInt = 50

/**
 * IP6 Auth Header
 */
public val IPPROTO_AH: CInt = 51

// IPPROTO_ICMPV6 defined in src/unix/mod.rs
/**
 * IP6 no next header
 */
public val IPPROTO_NONE: CInt = 59

/**
 * IP6 destination option
 */
public val IPPROTO_DSTOPTS: CInt = 60

public val IPPROTO_MTP: CInt = 92

public val IPPROTO_BEETPH: CInt = 94

/**
 * encapsulation header
 */
public val IPPROTO_ENCAP: CInt = 98

/**
 * Protocol indep. multicast
 */
public val IPPROTO_PIM: CInt = 103

/**
 * IP Payload Comp. Protocol
 */
public val IPPROTO_COMP: CInt = 108

/**
 * SCTP
 */
public val IPPROTO_SCTP: CInt = 132

public val IPPROTO_MH: CInt = 135

public val IPPROTO_UDPLITE: CInt = 136

public val IPPROTO_MPLS: CInt = 137

/**
 * raw IP packet
 */
public val IPPROTO_RAW: CInt = 255

public val IPPROTO_MAX: CInt = 256

public val AF_IB: CInt = 27

public val AF_MPLS: CInt = 28

public val AF_NFC: CInt = 39

public val AF_VSOCK: CInt = 40

public val PF_IB: CInt = AF_IB

public val PF_MPLS: CInt = AF_MPLS

public val PF_NFC: CInt = AF_NFC

public val PF_VSOCK: CInt = AF_VSOCK

// System V IPC
public val IPC_PRIVATE: io.github.kotlinmania.libc.KeyT = 0

public val IPC_CREAT: CInt = 512

public val IPC_EXCL: CInt = 1024

public val IPC_NOWAIT: CInt = 2048

public val IPC_RMID: CInt = 0

public val IPC_SET: CInt = 1

public val IPC_STAT: CInt = 2

public val IPC_INFO: CInt = 3

public val MSG_STAT: CInt = 11

public val MSG_INFO: CInt = 12

public val MSG_NOERROR: CInt = 4096

public val MSG_EXCEPT: CInt = 8192

public val MSG_COPY: CInt = 16384

public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_REMAP: CInt = 16384

public val SHM_EXEC: CInt = 32768

public val SHM_LOCK: CInt = 11

public val SHM_UNLOCK: CInt = 12

public val SHM_HUGETLB: CInt = 2048

public val SHM_NORESERVE: CInt = 4096

public val EPOLLRDHUP: CInt = 0x2000

public val EPOLLEXCLUSIVE: CInt = 0x10000000

public val EPOLLONESHOT: CInt = 0x40000000

public val QFMT_VFS_OLD: CInt = 1

public val QFMT_VFS_V0: CInt = 2

public val QFMT_VFS_V1: CInt = 4

public val EFD_SEMAPHORE: CInt = 0x1

public val LOG_NFACILITIES: CInt = 24

public val SEM_FAILED: io.github.kotlinmania.libc.SemT? = null

public val RB_AUTOBOOT: CInt = 0x01234567u.toInt()

public val RB_HALT_SYSTEM: CInt = 0xcdef0123u.toInt()

public val RB_ENABLE_CAD: CInt = 0x89abcdefu.toInt()

public val RB_DISABLE_CAD: CInt = 0x00000000u.toInt()

public val RB_POWER_OFF: CInt = 0x4321fedcu.toInt()

public val RB_SW_SUSPEND: CInt = 0xd000fce2u.toInt()

public val RB_KEXEC: CInt = 0x45584543u.toInt()

public val AI_PASSIVE: CInt = 0x0001

public val AI_CANONNAME: CInt = 0x0002

public val AI_NUMERICHOST: CInt = 0x0004

public val AI_V4MAPPED: CInt = 0x0008

public val AI_ALL: CInt = 0x0010

public val AI_ADDRCONFIG: CInt = 0x0020

public val AI_NUMERICSERV: CInt = 0x0400

public val EAI_BADFLAGS: CInt = -1

public val EAI_NONAME: CInt = -2

public val EAI_AGAIN: CInt = -3

public val EAI_FAIL: CInt = -4

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_MEMORY: CInt = -10

public val EAI_OVERFLOW: CInt = -12

public val NI_NUMERICHOST: CInt = 1

public val NI_NUMERICSERV: CInt = 2

public val NI_NOFQDN: CInt = 4

public val NI_NAMEREQD: CInt = 8

public val NI_DGRAM: CInt = 16

public val SYNC_FILE_RANGE_WAIT_BEFORE: CUint = 1u

public val SYNC_FILE_RANGE_WRITE: CUint = 2u

public val SYNC_FILE_RANGE_WAIT_AFTER: CUint = 4u

public val EAI_SYSTEM: CInt = -11

public val AIO_CANCELED: CInt = 0

public val AIO_NOTCANCELED: CInt = 1

public val AIO_ALLDONE: CInt = 2

public val LIO_READ: CInt = 0

public val LIO_WRITE: CInt = 1

public val LIO_NOP: CInt = 2

public val LIO_WAIT: CInt = 0

public val LIO_NOWAIT: CInt = 1

public val MREMAP_MAYMOVE: CInt = 1

public val MREMAP_FIXED: CInt = 2

public val PR_SET_PDEATHSIG: CInt = 1

public val PR_GET_PDEATHSIG: CInt = 2

public val PR_GET_DUMPABLE: CInt = 3

public val PR_SET_DUMPABLE: CInt = 4

public val PR_GET_UNALIGN: CInt = 5

public val PR_SET_UNALIGN: CInt = 6

public val PR_UNALIGN_NOPRINT: CInt = 1

public val PR_UNALIGN_SIGBUS: CInt = 2

public val PR_GET_KEEPCAPS: CInt = 7

public val PR_SET_KEEPCAPS: CInt = 8

public val PR_GET_FPEMU: CInt = 9

public val PR_SET_FPEMU: CInt = 10

public val PR_FPEMU_NOPRINT: CInt = 1

public val PR_FPEMU_SIGFPE: CInt = 2

public val PR_GET_FPEXC: CInt = 11

public val PR_SET_FPEXC: CInt = 12

public val PR_FP_EXC_SW_ENABLE: CInt = 0x80

public val PR_FP_EXC_DIV: CInt = 0x010000

public val PR_FP_EXC_OVF: CInt = 0x020000

public val PR_FP_EXC_UND: CInt = 0x040000

public val PR_FP_EXC_RES: CInt = 0x080000

public val PR_FP_EXC_INV: CInt = 0x100000

public val PR_FP_EXC_DISABLED: CInt = 0

public val PR_FP_EXC_NONRECOV: CInt = 1

public val PR_FP_EXC_ASYNC: CInt = 2

public val PR_FP_EXC_PRECISE: CInt = 3

public val PR_GET_TIMING: CInt = 13

public val PR_SET_TIMING: CInt = 14

public val PR_TIMING_STATISTICAL: CInt = 0

public val PR_TIMING_TIMESTAMP: CInt = 1

public val PR_SET_NAME: CInt = 15

public val PR_GET_NAME: CInt = 16

public val PR_GET_ENDIAN: CInt = 19

public val PR_SET_ENDIAN: CInt = 20

public val PR_ENDIAN_BIG: CInt = 0

public val PR_ENDIAN_LITTLE: CInt = 1

public val PR_ENDIAN_PPC_LITTLE: CInt = 2

public val PR_GET_SECCOMP: CInt = 21

public val PR_SET_SECCOMP: CInt = 22

public val PR_CAPBSET_READ: CInt = 23

public val PR_CAPBSET_DROP: CInt = 24

public val PR_GET_TSC: CInt = 25

public val PR_SET_TSC: CInt = 26

public val PR_TSC_ENABLE: CInt = 1

public val PR_TSC_SIGSEGV: CInt = 2

public val PR_GET_SECUREBITS: CInt = 27

public val PR_SET_SECUREBITS: CInt = 28

public val PR_SET_TIMERSLACK: CInt = 29

public val PR_GET_TIMERSLACK: CInt = 30

public val PR_TASK_PERF_EVENTS_DISABLE: CInt = 31

public val PR_TASK_PERF_EVENTS_ENABLE: CInt = 32

public val PR_MCE_KILL: CInt = 33

public val PR_MCE_KILL_CLEAR: CInt = 0

public val PR_MCE_KILL_SET: CInt = 1

public val PR_MCE_KILL_LATE: CInt = 0

public val PR_MCE_KILL_EARLY: CInt = 1

public val PR_MCE_KILL_DEFAULT: CInt = 2

public val PR_MCE_KILL_GET: CInt = 34

public val PR_SET_MM: CInt = 35

public val PR_SET_MM_START_CODE: CInt = 1

public val PR_SET_MM_END_CODE: CInt = 2

public val PR_SET_MM_START_DATA: CInt = 3

public val PR_SET_MM_END_DATA: CInt = 4

public val PR_SET_MM_START_STACK: CInt = 5

public val PR_SET_MM_START_BRK: CInt = 6

public val PR_SET_MM_BRK: CInt = 7

public val PR_SET_MM_ARG_START: CInt = 8

public val PR_SET_MM_ARG_END: CInt = 9

public val PR_SET_MM_ENV_START: CInt = 10

public val PR_SET_MM_ENV_END: CInt = 11

public val PR_SET_MM_AUXV: CInt = 12

public val PR_SET_MM_EXE_FILE: CInt = 13

public val PR_SET_MM_MAP: CInt = 14

public val PR_SET_MM_MAP_SIZE: CInt = 15

public val PR_SET_PTRACER: CInt = 0x59616d61

public val PR_SET_PTRACER_ANY: CUlong = 0xffffffffffffffffuL

public val PR_SET_CHILD_SUBREAPER: CInt = 36

public val PR_GET_CHILD_SUBREAPER: CInt = 37

public val PR_SET_NO_NEW_PRIVS: CInt = 38

public val PR_GET_NO_NEW_PRIVS: CInt = 39

public val PR_GET_TID_ADDRESS: CInt = 40

public val PR_SET_THP_DISABLE: CInt = 41

public val PR_GET_THP_DISABLE: CInt = 42

public val PR_MPX_ENABLE_MANAGEMENT: CInt = 43

public val PR_MPX_DISABLE_MANAGEMENT: CInt = 44

public val PR_SET_FP_MODE: CInt = 45

public val PR_GET_FP_MODE: CInt = 46

public val PR_FP_MODE_FR: CInt = 1 shl 0

public val PR_FP_MODE_FRE: CInt = 1 shl 1

public val PR_CAP_AMBIENT: CInt = 47

public val PR_CAP_AMBIENT_IS_SET: CInt = 1

public val PR_CAP_AMBIENT_RAISE: CInt = 2

public val PR_CAP_AMBIENT_LOWER: CInt = 3

public val PR_CAP_AMBIENT_CLEAR_ALL: CInt = 4

public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

public val TFD_CLOEXEC: CInt = O_CLOEXEC

public val TFD_NONBLOCK: CInt = O_NONBLOCK

public val TFD_TIMER_ABSTIME: CInt = 1

public val XATTR_CREATE: CInt = 0x1

public val XATTR_REPLACE: CInt = 0x2

public val POSIX_VDISABLE: io.github.kotlinmania.libc.CcT = 0u

public val FALLOC_FL_KEEP_SIZE: CInt = 0x01

public val FALLOC_FL_PUNCH_HOLE: CInt = 0x02

public val FALLOC_FL_COLLAPSE_RANGE: CInt = 0x08

public val FALLOC_FL_ZERO_RANGE: CInt = 0x10

public val FALLOC_FL_INSERT_RANGE: CInt = 0x20

public val FALLOC_FL_UNSHARE_RANGE: CInt = 0x40

// On Linux, libc doesn't define this constant, libattr does instead.
// We still define it for Linux as it's defined by libc on other platforms,
// and it's mentioned in the man pages for getxattr and setxattr.
public val ENOATTR: CInt = ENODATA

public val SO_ORIGINAL_DST: CInt = 80

public val IUTF8: io.github.kotlinmania.libc.TcflagT = 0x00004000u

public val CMSPAR: io.github.kotlinmania.libc.TcflagT = 1073741824u

public val MFD_CLOEXEC: CUint = 0x0001u

public val MFD_ALLOW_SEALING: CUint = 0x0002u

// these are used in the pType field of Elf32Phdr and Elf64Phdr, which has
// the type Elf32Word and Elf64Word respectively. Luckily, both of those are u32
// so we can use that type here to avoid having to cast.
public val PT_NULL: UInt = 0u

public val PT_LOAD: UInt = 1u

public val PT_DYNAMIC: UInt = 2u

public val PT_INTERP: UInt = 3u

public val PT_NOTE: UInt = 4u

public val PT_SHLIB: UInt = 5u

public val PT_PHDR: UInt = 6u

public val PT_TLS: UInt = 7u

public val PT_NUM: UInt = 8u

public val PT_LOOS: UInt = 0x60000000u

public val PT_GNU_EH_FRAME: UInt = 0x6474e550u

public val PT_GNU_STACK: UInt = 0x6474e551u

public val PT_GNU_RELRO: UInt = 0x6474e552u

// Ethernet protocol IDs.
public val ETH_P_LOOP: CInt = 0x0060

public val ETH_P_PUP: CInt = 0x0200

public val ETH_P_PUPAT: CInt = 0x0201

public val ETH_P_IP: CInt = 0x0800

public val ETH_P_X25: CInt = 0x0805

public val ETH_P_ARP: CInt = 0x0806

public val ETH_P_BPQ: CInt = 0x08FF

public val ETH_P_IEEEPUP: CInt = 0x0a00

public val ETH_P_IEEEPUPAT: CInt = 0x0a01

public val ETH_P_BATMAN: CInt = 0x4305

public val ETH_P_DEC: CInt = 0x6000

public val ETH_P_DNA_DL: CInt = 0x6001

public val ETH_P_DNA_RC: CInt = 0x6002

public val ETH_P_DNA_RT: CInt = 0x6003

public val ETH_P_LAT: CInt = 0x6004

public val ETH_P_DIAG: CInt = 0x6005

public val ETH_P_CUST: CInt = 0x6006

public val ETH_P_SCA: CInt = 0x6007

public val ETH_P_TEB: CInt = 0x6558

public val ETH_P_RARP: CInt = 0x8035

public val ETH_P_ATALK: CInt = 0x809B

public val ETH_P_AARP: CInt = 0x80F3

public val ETH_P_8021Q: CInt = 0x8100

public val ETH_P_IPX: CInt = 0x8137

public val ETH_P_IPV6: CInt = 0x86DD

public val ETH_P_PAUSE: CInt = 0x8808

public val ETH_P_SLOW: CInt = 0x8809

public val ETH_P_WCCP: CInt = 0x883E

public val ETH_P_MPLS_UC: CInt = 0x8847

public val ETH_P_MPLS_MC: CInt = 0x8848

public val ETH_P_ATMMPOA: CInt = 0x884c

public val ETH_P_PPP_DISC: CInt = 0x8863

public val ETH_P_PPP_SES: CInt = 0x8864

public val ETH_P_LINK_CTL: CInt = 0x886c

public val ETH_P_ATMFATE: CInt = 0x8884

public val ETH_P_PAE: CInt = 0x888E

public val ETH_P_AOE: CInt = 0x88A2

public val ETH_P_8021AD: CInt = 0x88A8

public val ETH_P_802_EX1: CInt = 0x88B5

public val ETH_P_TIPC: CInt = 0x88CA

public val ETH_P_8021AH: CInt = 0x88E7

public val ETH_P_MVRP: CInt = 0x88F5

public val ETH_P_1588: CInt = 0x88F7

public val ETH_P_PRP: CInt = 0x88FB

public val ETH_P_FCOE: CInt = 0x8906

public val ETH_P_TDLS: CInt = 0x890D

public val ETH_P_FIP: CInt = 0x8914

public val ETH_P_80221: CInt = 0x8917

public val ETH_P_LOOPBACK: CInt = 0x9000

public val ETH_P_QINQ1: CInt = 0x9100

public val ETH_P_QINQ2: CInt = 0x9200

public val ETH_P_QINQ3: CInt = 0x9300

public val ETH_P_EDSA: CInt = 0xDADA

public val ETH_P_AF_IUCV: CInt = 0xFBFB

public val ETH_P_802_3_MIN: CInt = 0x0600

public val ETH_P_802_3: CInt = 0x0001

public val ETH_P_AX25: CInt = 0x0002

public val ETH_P_ALL: CInt = 0x0003

public val ETH_P_802_2: CInt = 0x0004

public val ETH_P_SNAP: CInt = 0x0005

public val ETH_P_DDCMP: CInt = 0x0006

public val ETH_P_WAN_PPP: CInt = 0x0007

public val ETH_P_PPP_MP: CInt = 0x0008

public val ETH_P_LOCALTALK: CInt = 0x0009

public val ETH_P_CAN: CInt = 0x000C

public val ETH_P_CANFD: CInt = 0x000D

public val ETH_P_PPPTALK: CInt = 0x0010

public val ETH_P_TR_802_2: CInt = 0x0011

public val ETH_P_MOBITEX: CInt = 0x0015

public val ETH_P_CONTROL: CInt = 0x0016

public val ETH_P_IRDA: CInt = 0x0017

public val ETH_P_ECONET: CInt = 0x0018

public val ETH_P_HDLC: CInt = 0x0019

public val ETH_P_ARCNET: CInt = 0x001A

public val ETH_P_DSA: CInt = 0x001B

public val ETH_P_TRAILER: CInt = 0x001C

public val ETH_P_PHONET: CInt = 0x00F5

public val ETH_P_IEEE802154: CInt = 0x00F6

public val ETH_P_CAIF: CInt = 0x00F7

public val SFD_CLOEXEC: CInt = 0x080000

public val NCCS: Int = 32

public val O_TRUNC: CInt = 0x00040000

public val O_NOATIME: CInt = 0x00002000

public val O_CLOEXEC: CInt = 0x00000100

public val O_TMPFILE: CInt = 0x00004000

public val EBFONT: CInt = 59

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENONET: CInt = 64

public val ENOPKG: CInt = 65

public val EREMOTE: CInt = 66

public val ENOLINK: CInt = 67

public val EADV: CInt = 68

public val ESRMNT: CInt = 69

public val ECOMM: CInt = 70

public val EPROTO: CInt = 71

public val EDOTDOT: CInt = 73

public val SA_NODEFER: CInt = 0x40000000

public val SA_RESETHAND: CInt = 0x80000000

public val SA_RESTART: CInt = 0x10000000

public val SA_NOCLDSTOP: CInt = 0x00000001

public val EPOLL_CLOEXEC: CInt = 0x80000

public val EFD_CLOEXEC: CInt = 0x80000

public val BUFSIZ: CUint = 1024u

public val TMP_MAX: CUint = 10000u

public val FOPEN_MAX: CUint = 1000u

public val O_PATH: CInt = 0x00400000

public val O_EXEC: CInt = O_PATH

public val O_SEARCH: CInt = O_PATH

public val O_ACCMODE: CInt = 3 or O_SEARCH

public val O_NDELAY: CInt = O_NONBLOCK

public val NI_MAXHOST: io.github.kotlinmania.libc.SocklenT = 255u

public val PTHREAD_STACK_MIN: SizeT = 2048uL

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val POSIX_MADV_DONTNEED: CInt = 4

public val RLIM_INFINITY: io.github.kotlinmania.libc.RlimT = 0uL.inv()

public val RLIMIT_RTTIME: CInt = 15

public val RLIMIT_NLIMITS: CInt = 16

public val RLIM_NLIMITS: CInt = RLIMIT_NLIMITS

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val SOCK_DCCP: CInt = 6

public val SOCK_PACKET: CInt = 10

public val TCP_COOKIE_TRANSACTIONS: CInt = 15

public val TCP_THIN_LINEAR_TIMEOUTS: CInt = 16

public val TCP_THIN_DUPACK: CInt = 17

public val TCP_USER_TIMEOUT: CInt = 18

public val TCP_REPAIR: CInt = 19

public val TCP_REPAIR_QUEUE: CInt = 20

public val TCP_QUEUE_SEQ: CInt = 21

public val TCP_REPAIR_OPTIONS: CInt = 22

public val TCP_FASTOPEN: CInt = 23

public val TCP_TIMESTAMP: CInt = 24

public val SIGUNUSED: CInt = SIGSYS

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

public val CPU_SETSIZE: CInt = 128

public val PTRACE_TRACEME: CInt = 0

public val PTRACE_PEEKTEXT: CInt = 1

public val PTRACE_PEEKDATA: CInt = 2

public val PTRACE_PEEKUSER: CInt = 3

public val PTRACE_POKETEXT: CInt = 4

public val PTRACE_POKEDATA: CInt = 5

public val PTRACE_POKEUSER: CInt = 6

public val PTRACE_CONT: CInt = 7

public val PTRACE_KILL: CInt = 8

public val PTRACE_SINGLESTEP: CInt = 9

public val PTRACE_GETREGS: CInt = 12

public val PTRACE_SETREGS: CInt = 13

public val PTRACE_GETFPREGS: CInt = 14

public val PTRACE_SETFPREGS: CInt = 15

public val PTRACE_ATTACH: CInt = 16

public val PTRACE_DETACH: CInt = 17

public val PTRACE_GETFPXREGS: CInt = 18

public val PTRACE_SETFPXREGS: CInt = 19

public val PTRACE_SYSCALL: CInt = 24

public val PTRACE_SETOPTIONS: CInt = 0x4200

public val PTRACE_GETEVENTMSG: CInt = 0x4201

public val PTRACE_GETSIGINFO: CInt = 0x4202

public val PTRACE_SETSIGINFO: CInt = 0x4203

public val PTRACE_GETREGSET: CInt = 0x4204

public val PTRACE_SETREGSET: CInt = 0x4205

public val PTRACE_SEIZE: CInt = 0x4206

public val PTRACE_INTERRUPT: CInt = 0x4207

public val PTRACE_LISTEN: CInt = 0x4208

public val PTRACE_PEEKSIGINFO: CInt = 0x4209

public val EPOLLWAKEUP: CInt = 0x20000000

public val EFD_NONBLOCK: CInt = O_NONBLOCK

public val SFD_NONBLOCK: CInt = O_NONBLOCK

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val TIOCINQ: CInt = FIONREAD

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_NOLOAD: CInt = 0x4

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val CBAUD: io.github.kotlinmania.libc.TcflagT = 4111u

public val TAB1: CInt = 0x00000800

public val TAB2: CInt = 0x00001000

public val TAB3: CInt = 0x00001800

public val CR1: CInt = 0x00000200

public val CR2: CInt = 0x00000400

public val CR3: CInt = 0x00000600

public val FF1: CInt = 0x00008000

public val BS1: CInt = 0x00002000

public val VT1: CInt = 0x00004000

public val VWERASE: Int = 14

public val VREPRINT: Int = 12

public val VSUSP: Int = 10

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VDISCARD: Int = 13

public val VTIME: Int = 5

public val IXON: io.github.kotlinmania.libc.TcflagT = 0x00000400u

public val IXOFF: io.github.kotlinmania.libc.TcflagT = 0x00001000u

public val ONLCR: io.github.kotlinmania.libc.TcflagT = 0x4u

public val CSIZE: io.github.kotlinmania.libc.TcflagT = 0x00000030u

public val CS6: io.github.kotlinmania.libc.TcflagT = 0x00000010u

public val CS7: io.github.kotlinmania.libc.TcflagT = 0x00000020u

public val CS8: io.github.kotlinmania.libc.TcflagT = 0x00000030u

public val CSTOPB: io.github.kotlinmania.libc.TcflagT = 0x00000040u

public val CREAD: io.github.kotlinmania.libc.TcflagT = 0x00000080u

public val PARENB: io.github.kotlinmania.libc.TcflagT = 0x00000100u

public val PARODD: io.github.kotlinmania.libc.TcflagT = 0x00000200u

public val HUPCL: io.github.kotlinmania.libc.TcflagT = 0x00000400u

public val CLOCAL: io.github.kotlinmania.libc.TcflagT = 0x00000800u

public val ECHOKE: io.github.kotlinmania.libc.TcflagT = 0x00000800u

public val ECHOE: io.github.kotlinmania.libc.TcflagT = 0x00000010u

public val ECHOK: io.github.kotlinmania.libc.TcflagT = 0x00000020u

public val ECHONL: io.github.kotlinmania.libc.TcflagT = 0x00000040u

public val ECHOPRT: io.github.kotlinmania.libc.TcflagT = 0x00000400u

public val ECHOCTL: io.github.kotlinmania.libc.TcflagT = 0x00000200u

public val ISIG: io.github.kotlinmania.libc.TcflagT = 0x00000001u

public val ICANON: io.github.kotlinmania.libc.TcflagT = 0x00000002u

public val PENDIN: io.github.kotlinmania.libc.TcflagT = 0x00004000u

public val NOFLSH: io.github.kotlinmania.libc.TcflagT = 0x00000080u

public val CIBAUD: io.github.kotlinmania.libc.TcflagT = 269418496u

public val CBAUDEX: io.github.kotlinmania.libc.TcflagT = 4096u

public val VSWTC: Int = 7

public val OLCUC: io.github.kotlinmania.libc.TcflagT = 2u

public val NLDLY: io.github.kotlinmania.libc.TcflagT = 256u

public val CRDLY: io.github.kotlinmania.libc.TcflagT = 1536u

public val TABDLY: io.github.kotlinmania.libc.TcflagT = 6144u

public val BSDLY: io.github.kotlinmania.libc.TcflagT = 8192u

public val FFDLY: io.github.kotlinmania.libc.TcflagT = 32768u

public val VTDLY: io.github.kotlinmania.libc.TcflagT = 16384u

public val XTABS: io.github.kotlinmania.libc.TcflagT = 6144u

public val B0: io.github.kotlinmania.libc.SpeedT = 0u

public val B50: io.github.kotlinmania.libc.SpeedT = 1u

public val B75: io.github.kotlinmania.libc.SpeedT = 2u

public val B110: io.github.kotlinmania.libc.SpeedT = 3u

public val B134: io.github.kotlinmania.libc.SpeedT = 4u

public val B150: io.github.kotlinmania.libc.SpeedT = 5u

public val B200: io.github.kotlinmania.libc.SpeedT = 6u

public val B300: io.github.kotlinmania.libc.SpeedT = 7u

public val B600: io.github.kotlinmania.libc.SpeedT = 8u

public val B1200: io.github.kotlinmania.libc.SpeedT = 9u

public val B1800: io.github.kotlinmania.libc.SpeedT = 10u

public val B2400: io.github.kotlinmania.libc.SpeedT = 11u

public val B4800: io.github.kotlinmania.libc.SpeedT = 12u

public val B9600: io.github.kotlinmania.libc.SpeedT = 13u

public val B19200: io.github.kotlinmania.libc.SpeedT = 14u

public val B38400: io.github.kotlinmania.libc.SpeedT = 15u

public val EXTA: io.github.kotlinmania.libc.SpeedT = B19200

public val EXTB: io.github.kotlinmania.libc.SpeedT = B38400

public val B57600: io.github.kotlinmania.libc.SpeedT = 4097u

public val B115200: io.github.kotlinmania.libc.SpeedT = 4098u

public val B230400: io.github.kotlinmania.libc.SpeedT = 4099u

public val B460800: io.github.kotlinmania.libc.SpeedT = 4100u

public val B500000: io.github.kotlinmania.libc.SpeedT = 4101u

public val B576000: io.github.kotlinmania.libc.SpeedT = 4102u

public val B921600: io.github.kotlinmania.libc.SpeedT = 4103u

public val B1000000: io.github.kotlinmania.libc.SpeedT = 4104u

public val B1152000: io.github.kotlinmania.libc.SpeedT = 4105u

public val B1500000: io.github.kotlinmania.libc.SpeedT = 4106u

public val B2000000: io.github.kotlinmania.libc.SpeedT = 4107u

public val B2500000: io.github.kotlinmania.libc.SpeedT = 4108u

public val B3000000: io.github.kotlinmania.libc.SpeedT = 4109u

public val B3500000: io.github.kotlinmania.libc.SpeedT = 4110u

public val B4000000: io.github.kotlinmania.libc.SpeedT = 4111u

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 56

public val SIZEOF_PTHREAD_MUTEX_T: Int = 40

public val O_ASYNC: CInt = 0x00000400

public val FIOCLEX: CInt = 0x5451

public val FIONBIO: CInt = 0x5421

public val RLIMIT_RSS: CInt = 5

public val RLIMIT_NOFILE: CInt = 7

public val RLIMIT_AS: CInt = 9

public val RLIMIT_NPROC: CInt = 6

public val RLIMIT_MEMLOCK: CInt = 8

public val O_APPEND: CInt = 0x00100000

public val O_CREAT: CInt = 0x00010000

public val O_EXCL: CInt = 0x00020000

public val O_NOCTTY: CInt = 0x00000200

public val O_NONBLOCK: CInt = 0x00000010

public val O_SYNC: CInt = 0x00000040 or O_DSYNC

public val O_RSYNC: CInt = O_SYNC

public val O_DSYNC: CInt = 0x00000020

public val SOCK_CLOEXEC: CInt = 524288

public val SOCK_NONBLOCK: CInt = 2048

public val MAP_ANON: CInt = 0x0020

public val MAP_GROWSDOWN: CInt = 0x0100

public val MAP_DENYWRITE: CInt = 0x0800

public val MAP_EXECUTABLE: CInt = 0x01000

public val MAP_LOCKED: CInt = 0x02000

public val MAP_NORESERVE: CInt = 0x04000

public val MAP_POPULATE: CInt = 0x08000

public val MAP_NONBLOCK: CInt = 0x010000

public val MAP_STACK: CInt = 0x020000

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_SEQPACKET: CInt = 5

public val SOL_SOCKET: CInt = 1

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

public val EDEADLOCK: CInt = EDEADLK

public val EMULTIHOP: CInt = 72

public val EBADMSG: CInt = 74

public val EOVERFLOW: CInt = 75

public val ENOTUNIQ: CInt = 76

public val EBADFD: CInt = 77

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

public val ENOTSUP: CInt = EOPNOTSUPP

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

public val EUCLEAN: CInt = 117

public val ENOTNAM: CInt = 118

public val ENAVAIL: CInt = 119

public val EISNAM: CInt = 120

public val EREMOTEIO: CInt = 121

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

public val ERFKILL: CInt = 132

public val EHWPOISON: CInt = 133

public val SO_REUSEADDR: CInt = 2

public val SO_TYPE: CInt = 3

public val SO_ERROR: CInt = 4

public val SO_DONTROUTE: CInt = 5

public val SO_BROADCAST: CInt = 6

public val SO_SNDBUF: CInt = 7

public val SO_RCVBUF: CInt = 8

public val SO_KEEPALIVE: CInt = 9

public val SO_OOBINLINE: CInt = 10

public val SO_NO_CHECK: CInt = 11

public val SO_PRIORITY: CInt = 12

public val SO_LINGER: CInt = 13

public val SO_BSDCOMPAT: CInt = 14

public val SO_REUSEPORT: CInt = 15

public val SO_PASSCRED: CInt = 16

public val SO_PEERCRED: CInt = 17

public val SO_RCVLOWAT: CInt = 18

public val SO_SNDLOWAT: CInt = 19

public val SO_RCVTIMEO: CInt = 20

public val SO_SNDTIMEO: CInt = 21

public val SO_BINDTODEVICE: CInt = 25

public val SO_TIMESTAMP: CInt = 29

public val SO_ACCEPTCONN: CInt = 30

public val SO_SNDBUFFORCE: CInt = 32

public val SO_RCVBUFFORCE: CInt = 33

public val SO_TIMESTAMPNS: CInt = 35

public val SO_MARK: CInt = 36

public val SO_PROTOCOL: CInt = 38

public val SO_DOMAIN: CInt = 39

public val SO_RXQ_OVFL: CInt = 40

public val SO_PEEK_OFF: CInt = 42

public val SO_BUSY_POLL: CInt = 46

public val SO_COOKIE: CInt = 57

public val SO_BINDTOIFINDEX: CInt = 62

public val SO_FUCHSIA_MARK: CInt = 10000

public val SA_ONSTACK: CInt = 0x08000000

public val SA_SIGINFO: CInt = 0x00000004

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SIGCHLD: CInt = 17

public val SIGBUS: CInt = 7

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGUSR1: CInt = 10

public val SIGUSR2: CInt = 12

public val SIGCONT: CInt = 18

public val SIGSTOP: CInt = 19

public val SIGTSTP: CInt = 20

public val SIGURG: CInt = 23

public val SIGIO: CInt = 29

public val SIGSYS: CInt = 31

public val SIGSTKFLT: CInt = 16

public val SIGPOLL: CInt = 29

public val SIGPWR: CInt = 30

public val SIG_SETMASK: CInt = 2

public val SIG_BLOCK: CInt = 0x000000

public val SIG_UNBLOCK: CInt = 0x01

public val EXTPROC: io.github.kotlinmania.libc.TcflagT = 0x00010000u

public val MAP_HUGETLB: CInt = 0x040000

public val F_GETLK: CInt = 5

public val F_GETOWN: CInt = 9

public val F_SETLK: CInt = 6

public val F_SETLKW: CInt = 7

public val F_SETOWN: CInt = 8

public val VEOF: Int = 4

public val VEOL: Int = 11

public val VEOL2: Int = 16

public val VMIN: Int = 6

public val IEXTEN: io.github.kotlinmania.libc.TcflagT = 0x00008000u

public val TOSTOP: io.github.kotlinmania.libc.TcflagT = 0x00000100u

public val FLUSHO: io.github.kotlinmania.libc.TcflagT = 0x00001000u

public val TCGETS: CInt = 0x5401

public val TCSETS: CInt = 0x5402

public val TCSETSW: CInt = 0x5403

public val TCSETSF: CInt = 0x5404

public val TCGETA: CInt = 0x5405

public val TCSETA: CInt = 0x5406

public val TCSETAW: CInt = 0x5407

public val TCSETAF: CInt = 0x5408

public val TCSBRK: CInt = 0x5409

public val TCXONC: CInt = 0x540A

public val TCFLSH: CInt = 0x540B

public val TIOCGSOFTCAR: CInt = 0x5419

public val TIOCSSOFTCAR: CInt = 0x541A

public val TIOCLINUX: CInt = 0x541C

public val TIOCGSERIAL: CInt = 0x541E

public val TIOCEXCL: CInt = 0x540C

public val TIOCNXCL: CInt = 0x540D

public val TIOCSCTTY: CInt = 0x540E

public val TIOCGPGRP: CInt = 0x540F

public val TIOCSPGRP: CInt = 0x5410

public val TIOCOUTQ: CInt = 0x5411

public val TIOCSTI: CInt = 0x5412

public val TIOCGWINSZ: CInt = 0x5413

public val TIOCSWINSZ: CInt = 0x5414

public val TIOCMGET: CInt = 0x5415

public val TIOCMBIS: CInt = 0x5416

public val TIOCMBIC: CInt = 0x5417

public val TIOCMSET: CInt = 0x5418

public val FIONREAD: CInt = 0x541B

public val TIOCCONS: CInt = 0x541D

public val POLLWRNORM: CShort = 0x100

public val POLLWRBAND: CShort = 0x200

public val TIOCM_LE: CInt = 0x001

public val TIOCM_DTR: CInt = 0x002

public val TIOCM_RTS: CInt = 0x004

public val TIOCM_ST: CInt = 0x008

public val TIOCM_SR: CInt = 0x010

public val TIOCM_CTS: CInt = 0x020

public val TIOCM_CAR: CInt = 0x040

public val TIOCM_RNG: CInt = 0x080

public val TIOCM_DSR: CInt = 0x100

public val TIOCM_CD: CInt = TIOCM_CAR

public val TIOCM_RI: CInt = TIOCM_RNG

public val O_DIRECTORY: CInt = 0x00080000

public val O_DIRECT: CInt = 0x00000800

public val O_LARGEFILE: CInt = 0x00001000

public val O_NOFOLLOW: CInt = 0x00000080

public val HUGETLB_FLAG_ENCODE_SHIFT: UInt = 26u

public val MAP_HUGE_SHIFT: UInt = 26u

public val ULONG_SIZE: Int = 64

public fun fdClr(fd: CInt, set: FdSet?) {
    val fd1 = fd.toInt()
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set!!.fdsBits[fd1 / size] and (1 shl (fd1 % size)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val fd1 = fd.toInt()
    val size = 8 * 8
    return (set!!.fdsBits[fd1 / size] and (1 shl (fd1 % size))) != 0
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val fd1 = fd.toInt()
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set!!.fdsBits[fd1 / size] or (1 shl (fd1 % size))
    return
}

public fun fdZero(set: FdSet?) {
    for (slot in set!!.fdsBits.iterMut()) {
        slot = 0
    }
}

public fun cpuZero(cpuset: CpuSetT) {
    for (slot in cpuset.bits.iterMut()) {
        slot = 0
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset)
    Unit
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
    Unit
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * 8
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0uL != (cpuset.bits[idx] and (1uL shl offset))
}

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean {
    return set1.bits == set2.bits
}

public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    return ((cmsg)?.let { COpaquePointer(it.hashCode().toLong() + (1).toLong()) }).toUByte()
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    return if (((cmsg!!.cmsgLen).toULong()) < sizeOf<Cmsghdr>()) {
        nullMut<Cmsghdr>()
    } else if (CMSG_NEXT(cmsg).add(sizeOf<Cmsghdr>()) >= MHDR_END(mhdr)) {
        nullMut<Cmsghdr>()
    } else {
        CMSG_NEXT(cmsg).cast()
    }
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toULong() >= sizeOf<Cmsghdr>()) {
        mhdr!!.msgControl.cast()
    } else {
        nullMut<Cmsghdr>()
    }
}

public fun cmsgAlign(len: SizeT): SizeT {
    return (len + sizeOf<SizeT>() - 1uL) and (sizeOf<SizeT>() - 1uL).inv()
}

public fun cmsgSpace(len: CUint): CUint {
    return (CMSG_ALIGN(len.toULong()) + CMSG_ALIGN(sizeOf<Cmsghdr>())).toUInt()
}

public fun cmsgLen(len: CUint): CUint {
    return (CMSG_ALIGN(sizeOf<Cmsghdr>()) + len.toULong()).toUInt()
}

public fun wifstopped(status: CInt): Boolean {
    return (status and 0xff) == 0x7f
}

public fun wstopsig(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wifcontinued(status: CInt): Boolean {
    return status == 0xffff
}

public fun wifsignaled(status: CInt): Boolean {
    return ((status and 0x7f) + 1).toByte() >= 2.toByte()
}

public fun wtermsig(status: CInt): CInt {
    return status and 0x7f
}

public fun wifexited(status: CInt): Boolean {
    return (status and 0x7f) == 0
}

public fun wexitstatus(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wcoredump(status: CInt): Boolean {
    return (status and 0x80) != 0
}

public fun qcmd(cmd: CInt, type: CInt): CInt {
    return (cmd shl 8) or (type and 0x00ff)
}

public fun makedev(major: CUint, minor: CUint): io.github.kotlinmania.libc.DevT {
    val major1 = major.toULong()
    val minor1 = minor.toULong()
    var dev = 0
    dev = dev or ((major1 and 0x00000fffuL) shl 8)
    dev = dev or ((major1 and 0xfffff000uL) shl 32)
    dev = dev or ((minor1 and 0x000000ffuL) shl 0)
    dev = dev or ((minor1 and 0xffffff00uL) shl 12)
    return dev
}

public fun major(dev: io.github.kotlinmania.libc.DevT): CUint {
    var major = 0
    major = major or ((dev and 0x00000000000fff00uL) shr 8)
    major = major or ((dev and 0xfffff00000000000uL) shr 32)
    return major.toUInt()
}

public fun minor(dev: io.github.kotlinmania.libc.DevT): CUint {
    var minor = 0
    minor = minor or ((dev and 0x00000000000000ffuL) shr 0)
    minor = minor or ((dev and 0x00000ffffff00000uL) shr 12)
    return minor.toUInt()
}

public fun cmsgLen(cmsg: Cmsghdr?): SsizeT {
    return (((cmsg!!.cmsgLen).toULong() + sizeOf<CLong>() - 1) and (sizeOf<CLong>() - 1).inv()).toLong()
}

public fun cmsgNext(cmsg: Cmsghdr?): CUchar? {
    return ((cmsg)?.let { COpaquePointer(it.hashCode().toLong() + (CMSG_LEN(cmsg)).toLong()) }).toUByte()
}

public fun mhdrEnd(mhdr: Msghdr?): CUchar? {
    return mhdr!!.msgControl.offset((mhdr!!.msgControllen).toInt()).cast()
}

public sealed class FILE {
}

public sealed class FposT {
}

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

public expect fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: FILE?, buf: COpaquePointer?)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: FILE?): CInt

public expect fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer?

public expect fun fputc(c: CInt, stream: FILE?): CInt

public expect fun fputs(s: String?, stream: FILE?): CInt

public expect fun puts(s: String?): CInt

public expect fun ungetc(c: CInt, stream: FILE?): CInt

public expect fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

public expect fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

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

public expect fun atoll(s: String?): CLonglong

public expect fun strtod(s: String?, endp: COpaquePointer?): CDouble

public expect fun strtof(s: String?, endp: COpaquePointer?): CFloat

public expect fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong

public expect fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong

public expect fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong

public expect fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong

public expect fun calloc(nobj: SizeT, size: SizeT): COpaquePointer?

public expect fun malloc(size: SizeT): COpaquePointer?

public expect fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: SigactionSaRestorerCallback): CInt

public expect fun system(s: String?): CInt

public expect fun getenv(s: String?): COpaquePointer?

public expect fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer?

public expect fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer?

public expect fun strcmp(cs: String?, ct: String?): CInt

public expect fun strncmp(cs: String?, ct: String?, n: SizeT): CInt

public expect fun strcoll(cs: String?, ct: String?): CInt

public expect fun strchr(cs: String?, c: CInt): COpaquePointer?

public expect fun strrchr(cs: String?, c: CInt): COpaquePointer?

public expect fun strspn(cs: String?, ct: String?): SizeT

public expect fun strcspn(cs: String?, ct: String?): SizeT

public expect fun strdup(cs: String?): COpaquePointer?

public expect fun strpbrk(cs: String?, ct: String?): COpaquePointer?

public expect fun strstr(cs: String?, ct: String?): COpaquePointer?

public expect fun strlen(cs: String?): SizeT

public expect fun strnlen(cs: String?, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): COpaquePointer?

public expect fun strtok(s: COpaquePointer?, t: String?): COpaquePointer?

public expect fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT

public expect fun wcslen(buf: WcharT?): SizeT

public expect fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getpwnam(name: String?): Passwd?

public expect fun getpwuid(uid: io.github.kotlinmania.libc.UidT): Passwd?

public expect fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun printf(format: String?, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun scanf(format: String?, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt

public expect fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt

public expect fun listen(socket: CInt, backlog: CInt): CInt

public expect fun accept(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt

public expect fun getpeername(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt

public expect fun getsockname(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt

public expect fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt

public expect fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt

public expect fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT

public expect fun shutdown(socket: CInt, how: CInt): CInt

public expect fun chmod(path: String?, mode: ModeT): CInt

public expect fun fchmod(fd: CInt, mode: ModeT): CInt

public expect fun fstat(fildes: CInt, buf: Stat?): CInt

public expect fun mkdir(path: String?, mode: ModeT): CInt

public expect fun stat(path: String?, buf: Stat?): CInt

public expect fun pclose(stream: FILE?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: String?, mode: ModeT): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun opendir(dirname: String?): DIR?

public expect fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent?

public expect fun readdirR(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt

public expect fun closedir(dirp: DIR?): CInt

public expect fun rewinddir(dirp: DIR?)

public expect fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt

public expect fun fchown(fd: CInt, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT): CInt

public expect fun fchownat(dirfd: CInt, pathname: String?, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT, flags: CInt): CInt

public expect fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT

public expect fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt

public expect fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun chdir(dir: String?): CInt

public expect fun chown(path: String?, uid: UidT, gid: GidT): CInt

public expect fun lchown(path: String?, uid: UidT, gid: GidT): CInt

public expect fun close(fd: CInt): CInt

public expect fun dup(fd: CInt): CInt

public expect fun dup2(src: CInt, dst: CInt): CInt

public expect fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt

public expect fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt

public expect fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execv(prog: String?, argv: COpaquePointer?): CInt

public expect fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun execvp(c: String?, argv: COpaquePointer?): CInt

public expect fun fork(): PidT

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun getegid(): GidT

public expect fun geteuid(): UidT

public expect fun getgid(): GidT

public expect fun getgroups(ngroupsMax: CInt, groups: UInt?): CInt

public expect fun getlogin(): COpaquePointer?

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

public expect fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt

public expect fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

public expect fun rmdir(path: String?): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun setgid(gid: GidT): CInt

public expect fun setpgid(pid: PidT, pgid: PidT): CInt

public expect fun setsid(): PidT

public expect fun setuid(uid: UidT): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun tcgetpgrp(fd: CInt): PidT

public expect fun tcsetpgrp(fd: CInt, pgrp: io.github.kotlinmania.libc.PidT): CInt

public expect fun ttyname(fd: CInt): COpaquePointer?

public expect fun unlink(c: String?): CInt

public expect fun wait(status: CInt?): PidT

public expect fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT

public expect fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

public expect fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun umask(mask: ModeT): ModeT

public expect fun utime(file: String?, buf: Utimbuf?): CInt

public expect fun kill(pid: PidT, sig: CInt): CInt

public expect fun mlock(addr: COpaquePointer?, len: SizeT): CInt

public expect fun munlock(addr: COpaquePointer?, len: SizeT): CInt

public expect fun mlockall(flags: CInt): CInt

public expect fun munlockall(): CInt

public expect fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer?

public expect fun munmap(addr: COpaquePointer?, len: SizeT): CInt

public expect fun ifNametoindex(ifname: String?): CUint

public expect fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer?

public expect fun lstat(path: String?, buf: Stat?): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun setenv(name: String?, value: String?, overwrite: CInt): CInt

public expect fun unsetenv(name: String?): CInt

public expect fun symlink(path1: String?, path2: String?): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer?

public expect fun flock(fd: CInt, operation: CInt): CInt

public expect fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt

public expect fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT

public expect fun pthreadSelf(): io.github.kotlinmania.libc.PthreadT

public expect fun pthreadJoin(native: io.github.kotlinmania.libc.PthreadT, value: COpaquePointer?): CInt

public expect fun pthreadExit(value: COpaquePointer?): Nothing

public expect fun pthreadAttrInit(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt

public expect fun pthreadAttrDestroy(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt

public expect fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stacksize: ULong?): CInt

public expect fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackSize: SizeT): CInt

public expect fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.PthreadAttrT?, state: CInt): CInt

public expect fun pthreadDetach(thread: io.github.kotlinmania.libc.PthreadT): CInt

public expect fun schedYield(): CInt

public expect fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt

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

public expect fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt

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

public expect fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: String?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: UInt?): CInt

public expect fun raise(signum: CInt): CInt

public expect fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt

public expect fun utimes(filename: String?, times: io.github.kotlinmania.libc.Timeval?): CInt

public expect fun dlopen(filename: String?, flag: CInt): COpaquePointer?

public expect fun dlerror(): COpaquePointer?

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?

public expect fun dlclose(handle: COpaquePointer?): CInt

public expect fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt

public expect fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt

public expect fun freeaddrinfo(res: Addrinfo?)

public expect fun gaiStrerror(errcode: CInt): COpaquePointer?

public expect fun resInit(): CInt

public expect fun gmtimeR(timeP: CLong?, result: Tm?): Tm?

public expect fun localtimeR(timeP: CLong?, result: Tm?): Tm?

public expect fun mktime(tm: Tm?): TimeT

public expect fun time(time: CLong?): TimeT

public expect fun gmtime(timeP: CLong?): Tm?

public expect fun localtime(timeP: CLong?): Tm?

public expect fun mknod(pathname: String?, mode: ModeT, dev: io.github.kotlinmania.libc.DevT): CInt

public expect fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt

public expect fun gethostname(name: COpaquePointer?, len: SizeT): CInt

public expect fun getservbyname(name: String?, proto: String?): Servent?

public expect fun getprotobyname(name: String?): Protoent?

public expect fun getprotobynumber(proto: CInt): Protoent?

public expect fun usleep(secs: CUint): CInt

public expect fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun putenv(string: COpaquePointer?): CInt

public expect fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt

public expect fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt

public expect fun setlocale(category: CInt, locale: String?): COpaquePointer?

public expect fun localeconv(): Lconv?

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semWait(sem: SemT?): CInt

public expect fun semTrywait(sem: SemT?): CInt

public expect fun semPost(sem: SemT?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt

public expect fun statvfs(path: String?, buf: Statvfs?): CInt

public expect fun fstatvfs(fd: CInt, buf: Statvfs?): CInt

public expect fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT

public expect fun sigemptyset(set: SigsetT?): CInt

public expect fun sigaddset(set: SigsetT?, signum: CInt): CInt

public expect fun sigfillset(set: SigsetT?): CInt

public expect fun sigdelset(set: SigsetT?, signum: CInt): CInt

public expect fun sigismember(set: SigsetT?, signum: CInt): CInt

public expect fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun sigpending(set: SigsetT?): CInt

public expect fun timegm(tm: io.github.kotlinmania.libc.Tm?): TimeT

public expect fun getsid(pid: PidT): PidT

public expect fun sysconf(name: CInt): CLong

public expect fun mkfifo(path: String?, mode: ModeT): CInt

public expect fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

public expect fun tcdrain(fd: CInt): CInt

public expect fun cfgetispeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT

public expect fun cfgetospeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT

public expect fun cfmakeraw(termios: io.github.kotlinmania.libc.Termios?)

public expect fun cfsetispeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt

public expect fun cfsetospeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt

public expect fun cfsetspeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt

public expect fun tcgetattr(fd: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt

public expect fun tcsetattr(fd: CInt, optionalActions: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt

public expect fun tcflow(fd: CInt, action: CInt): CInt

public expect fun tcflush(fd: CInt, action: CInt): CInt

public expect fun tcgetsid(fd: CInt): io.github.kotlinmania.libc.PidT

public expect fun tcsendbreak(fd: CInt, duration: CInt): CInt

public expect fun mkstemp(template: COpaquePointer?): CInt

public expect fun mkdtemp(template: COpaquePointer?): COpaquePointer?

public expect fun tmpnam(ptr: COpaquePointer?): COpaquePointer?

public expect fun openlog(ident: String?, logopt: CInt, facility: CInt)

public expect fun closelog()

public expect fun setlogmask(maskpri: CInt): CInt

public expect fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long)

public expect fun grantpt(fd: CInt): CInt

public expect fun posixOpenpt(flags: CInt): CInt

public expect fun ptsname(fd: CInt): COpaquePointer?

public expect fun unlockpt(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun pthreadGetattrNp(native: io.github.kotlinmania.libc.PthreadT, attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt

public expect fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun setgroups(ngroups: SizeT, ptr: UInt?): CInt

public expect fun pipe2(fds: CInt?, flags: CInt): CInt

public expect fun statfs(path: String?, buf: Statfs?): CInt

public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt

public expect fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT

public expect fun freelocale(loc: io.github.kotlinmania.libc.LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT

public expect fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT

public expect fun fdopendir(fd: CInt): DIR?

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: CInt?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt

public expect fun accept4(fd: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, len: UInt?, flg: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun clearenv(): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt

public expect fun setreuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT): CInt

public expect fun setregid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT): CInt

public expect fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): CInt

public expect fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): CInt

public expect fun acct(filename: String?): CInt

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun setresgid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT, sgid: io.github.kotlinmania.libc.GidT): CInt

public expect fun setresuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT, suid: io.github.kotlinmania.libc.UidT): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: io.github.kotlinmania.libc.Winsize?): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun lutimes(file: String?, times: io.github.kotlinmania.libc.Timeval?): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): Passwd?

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

// System V IPC
public expect fun shmget(key: io.github.kotlinmania.libc.KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt

public expect fun ftok(pathname: String?, projId: CInt): io.github.kotlinmania.libc.KeyT

public expect fun semget(key: io.github.kotlinmania.libc.KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: io.github.kotlinmania.libc.Sembuf?, nsops: SizeT): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt

public expect fun msgget(key: io.github.kotlinmania.libc.KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun errnoLocation(): CInt?

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT

public expect fun signalfd(fd: CInt, mask: io.github.kotlinmania.libc.SigsetT?, flags: CInt): CInt

public expect fun timerfdCreate(clockid: CInt, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt

public expect fun pwritev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun mkostemp(template: COpaquePointer?, flags: CInt): CInt

public expect fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt

public expect fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: io.github.kotlinmania.libc.LocaleT): COpaquePointer?

public expect fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun setfsgid(gid: io.github.kotlinmania.libc.GidT): CInt

public expect fun setfsuid(uid: io.github.kotlinmania.libc.UidT): CInt

// Not available now on Android
public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun ifNameindex(): IfNameindex?

public expect fun ifFreenameindex(ptr: IfNameindex?)

public expect fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?)

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt

public expect fun globfree(pglob: io.github.kotlinmania.libc.GlobT?)

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun futimes(fd: CInt, times: io.github.kotlinmania.libc.Timeval?): CInt

public expect fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer?

public expect fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt

public expect fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

public expect fun getdomainname(name: COpaquePointer?, len: SizeT): CInt

public expect fun setdomainname(name: String?, len: SizeT): CInt

public expect fun vhangup(): CInt

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun sync()

public expect fun syscall(num: CLong, vararg variadicArgs: Long): CLong

public expect fun schedGetaffinity(pid: io.github.kotlinmania.libc.PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

public expect fun schedSetaffinity(pid: io.github.kotlinmania.libc.PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

public expect fun umount(target: String?): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT

public expect fun settimeofday(tv: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt

public expect fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun schedRrGetInterval(pid: io.github.kotlinmania.libc.PidT, tp: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun semTimedwait(sem: SemT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt

public expect fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun swapoff(puath: String?): CInt

public expect fun vmsplice(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, nrSegs: SizeT, flags: CUint): SsizeT

public expect fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt

public expect fun personality(persona: CUlong): CInt

public expect fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun ppoll(fds: io.github.kotlinmania.libc.Pollfd?, nfds: NfdsT, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: SigsetT?): CInt

public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt

public expect fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt

public expect fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: ULong?): CInt

public expect fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT): CInt

public expect fun sethostname(name: String?, len: SizeT): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun umount2(target: String?, flags: CInt): CInt

public expect fun swapon(path: String?, swapflags: CInt): CInt

public expect fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun sigsuspend(mask: io.github.kotlinmania.libc.SigsetT?): CInt

public expect fun getgrgidR(gid: io.github.kotlinmania.libc.GidT, grp: io.github.kotlinmania.libc.Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun semClose(sem: SemT?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: io.github.kotlinmania.libc.Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun initgroups(user: String?, group: io.github.kotlinmania.libc.GidT): CInt

public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): SemT?

public expect fun getgrnam(name: String?): io.github.kotlinmania.libc.Group?

public expect fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt

public expect fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: io.github.kotlinmania.libc.UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt

public expect fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt

public expect fun getgrgid(gid: io.github.kotlinmania.libc.GidT): io.github.kotlinmania.libc.Group?

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): io.github.kotlinmania.libc.Group?

public expect fun getgrouplist(user: String?, group: io.github.kotlinmania.libc.GidT, groups: UInt?, ngroups: CInt?): CInt

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun pthreadCreate(native: CUlong?, attr: io.github.kotlinmania.libc.PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt
