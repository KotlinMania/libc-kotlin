// port-lint: source unix/hurd/hurd_mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CSchar
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.Group
import io.github.kotlinmania.libc.IPTOS_ECN_MASK
import io.github.kotlinmania.libc.In6Addr
import io.github.kotlinmania.libc.Pollfd
import io.github.kotlinmania.libc.Rlimit
import io.github.kotlinmania.libc.Rusage
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.Sigval
import io.github.kotlinmania.libc.Winsize

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface PthreadOnceRoutineCallback {
    public operator fun invoke()
}

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: io.github.kotlinmania.libc.DlPhdrInfo?, size: SizeT, data: COpaquePointer?): CInt
}

// types
public typealias S16Type = CShort

public typealias U16Type = CUshort

public typealias S32Type = CInt

public typealias U32Type = CUint

public typealias SlongwordType = CLong

public typealias UlongwordType = CUlong

public typealias UChar = CUchar

public typealias UShort = CUshort

public typealias UInt = CUint

public typealias ULong = CUlong

public typealias Int8T = CSchar

public typealias Uint8T = CUchar

public typealias Int16T = CShort

public typealias Uint16T = CUshort

public typealias Int32T = CInt

public typealias Uint32T = CUint

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

public typealias CaddrT = COpaquePointer?

public typealias IntptrT = SwordType

public typealias PtrdiffT = SwordType

public typealias SocklenT = U32Type

public typealias SigAtomicT = CInt

public typealias Time64T = Int64T

public typealias WcharT = CInt

public typealias WintT = CUint

public typealias InAddrT = UInt

public typealias Float32 = Float

public typealias Float64 = Double

public typealias Float32x = Double

public typealias Float64x = Double

public typealias LocaleT = LocaleStruct?

public typealias Ulong = CUlong

public typealias Ushort = CUshort

public typealias Uint = CUint

public typealias UInt8T = Uint8T

public typealias UInt16T = Uint16T

public typealias UInt32T = Uint32T

public typealias UInt64T = Uint64T

public typealias RegisterT = CInt

public typealias SigsetT = CUlong

public typealias FdMask = CLong

public typealias PthreadSpinlockT = CInt

public typealias TssT = CInt

public typealias ThrdT = CLong

public typealias PthreadT = CLong

public typealias PthreadProcessShared = CUint

public typealias PthreadInheritsched = CUint

public typealias PthreadContentionscope = CUint

public typealias PthreadDetachstate = CUint

public typealias PthreadAttrT = PthreadAttr

public typealias PthreadMutexProtocol = CUint

public typealias PthreadMutexType = CUint

public typealias PthreadMutexRobustness = CUint

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

public typealias RlimitResource = CUint

public typealias RlimitResourceT = RlimitResource

public typealias RusageWho = CInt

public typealias PriorityWhich = CUint

public typealias SaFamilyT = CUchar

public typealias InPortT = UShort

public typealias SigvalT = Sigval

public typealias SigeventT = Sigevent

public typealias NfdsT = CUlong

public typealias TcflagT = CUint

public typealias CcT = CUchar

public typealias SpeedT = CInt

public typealias GregT = CInt

public typealias GregsetT = List<GregT>

public typealias IoctlDir = CUint

public typealias IoctlDatum = CUint

public typealias ErrorTCodes = CInt

public typealias IntFast8T = CSchar

public typealias UintFast8T = CUchar

public typealias TcpSeq = UInt

public typealias TcpCaState = CUint

public typealias IdtypeT = CUint

public typealias MqdT = CInt

public typealias LmidT = CLong

public typealias RegoffT = CInt

public typealias NlItem = CInt

public typealias IconvT = COpaquePointer?

// structs
// functions
public sealed class Fpos64T {
}

public sealed class Timezone {
}

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class IpMreqn(
    public var imrMultiaddr: InAddr,
    public var imrAddress: InAddr,
    public var imrIfindex: CInt,
)

public open class IpMreqSource(
    public var imrMultiaddr: InAddr,
    public var imrInterface: InAddr,
    public var imrSourceaddr: InAddr,
)

public open class Sockaddr(
    public var saLen: CUchar,
    public var saFamily: SaFamilyT,
    public var saData: List<CChar>,
)

public open class InAddr(public var sAddr: InAddrT)

public open class SockaddrIn(
    public var sinLen: CUchar,
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: io.github.kotlinmania.libc.InAddr,
    public var sinZero: List<CUchar>,
)

public open class SockaddrIn6(
    public var sin6Len: CUchar,
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

public open class SockaddrUn(
    public var sunLen: CUchar,
    public var sunFamily: SaFamilyT,
    public var sunPath: List<CChar>,
)

public open class SockaddrStorage(
    public var ssLen: CUchar,
    public var ssFamily: SaFamilyT,
    public var ssPadding: List<CChar>,
    public var ssAlign: Uint32T,
)

public open class SockaddrAt(public var address: UByte)

public open class SockaddrAx25(public var address: UByte)

public open class SockaddrX25(public var address: UByte)

public open class SockaddrDl(public var address: UByte)

public open class SockaddrEon(public var address: UByte)

public open class SockaddrInarp(public var address: UByte)

public open class SockaddrIpx(public var address: UByte)

public open class SockaddrIso(public var address: UByte)

public open class SockaddrNs(public var address: UByte)

public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: io.github.kotlinmania.libc.SocklenT,
    public var aiAddr: Sockaddr?,
    public var aiCanonname: COpaquePointer?,
    public var aiNext: Addrinfo?,
)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: io.github.kotlinmania.libc.SocklenT,
    public var msgIov: io.github.kotlinmania.libc.Iovec?,
    public var msgIovlen: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: io.github.kotlinmania.libc.SocklenT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: io.github.kotlinmania.libc.SocklenT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class Dirent(
    public var dIno: InoT,
    public var dReclen: CUshort,
    public var dType: CUchar,
    public var dNamlen: CUchar,
    public var dName: List<CChar>,
)

public open class Dirent64(
    public var dIno: Ino64T,
    public var dReclen: CUshort,
    public var dType: CUchar,
    public var dNamlen: CUchar,
    public var dName: List<CChar>,
)

public open class FdSet(public var fdsBits: List<FdMask>)

public open class Termios(
    public var cIflag: io.github.kotlinmania.libc.TcflagT,
    public var cOflag: io.github.kotlinmania.libc.TcflagT,
    public var cCflag: io.github.kotlinmania.libc.TcflagT,
    public var cLflag: io.github.kotlinmania.libc.TcflagT,
    public var cCc: List<io.github.kotlinmania.libc.CcT>,
    public var ispeed: io.github.kotlinmania.libc.SpeedT,
    public var ospeed: io.github.kotlinmania.libc.SpeedT,
)

public open class Mallinfo(
    public var arena: CInt,
    public var ordblks: CInt,
    public var smblks: CInt,
    public var hblks: CInt,
    public var hblkhd: CInt,
    public var usmblks: CInt,
    public var fsmblks: CInt,
    public var uordblks: CInt,
    public var fordblks: CInt,
    public var keepcost: CInt,
)

public open class Mallinfo2(
    public var arena: SizeT,
    public var ordblks: SizeT,
    public var smblks: SizeT,
    public var hblks: SizeT,
    public var hblkhd: SizeT,
    public var usmblks: SizeT,
    public var fsmblks: SizeT,
    public var uordblks: SizeT,
    public var fordblks: SizeT,
    public var keepcost: SizeT,
)

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
)

public open class Sigevent(
    public var sigevValue: Sigval,
    public var sigevSigno: CInt,
    public var sigevNotify: CInt,
    public var unused1: COpaquePointer?,
    // actually a function pointer
    public var sigevNotifyAttributes: PthreadAttr?,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var siPid: PidT,
    public var siUid: UidT,
    public var siAddr: COpaquePointer?,
    public var siStatus: CInt,
    public var siBand: CLong,
    public var siValue: Sigval,
) {
    public open fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public open fun siValue(): Sigval {
        return this.siValue
    }

    public open fun siPid(): io.github.kotlinmania.libc.PidT {
        return this.siPid
    }

    public open fun siUid(): io.github.kotlinmania.libc.UidT {
        return this.siUid
    }

    public open fun siStatus(): CInt {
        return this.siStatus
    }
}

public open class Timespec(public var tvSec: TimeT, public var tvNsec: SyscallSlongT)

public open class Timeval(public var tvSec: Int, public var tvUsec: Int)

public open class LocaleData(public var address: UByte)

public open class Stat(
    public var stFstype: CInt,
    public var stDev: FsidT,
    // Actually stFsid
    public var stIno: InoT,
    public var stGen: CUint,
    public var stRdev: DevT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stSize: OffT,
    public var stAtim: io.github.kotlinmania.libc.Timespec,
    public var stMtim: io.github.kotlinmania.libc.Timespec,
    public var stCtim: io.github.kotlinmania.libc.Timespec,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAuthor: UidT,
    public var stFlags: CUint,
    public var stSpare: List<CInt>,
)

public open class Stat64(
    public var stFstype: CInt,
    public var stDev: FsidT,
    // Actually stFsid
    public var stIno: Ino64T,
    public var stGen: CUint,
    public var stRdev: DevT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stSize: Off64T,
    public var stAtim: io.github.kotlinmania.libc.Timespec,
    public var stMtim: io.github.kotlinmania.libc.Timespec,
    public var stCtim: io.github.kotlinmania.libc.Timespec,
    public var stBlksize: BlksizeT,
    public var stBlocks: Blkcnt64T,
    public var stAuthor: UidT,
    public var stFlags: CUint,
    public var stSpare: List<CInt>,
)

public open class Statx(
    public var stxMask: UInt,
    public var stxBlksize: UInt,
    public var stxAttributes: ULong,
    public var stxNlink: UInt,
    public var stxUid: UInt,
    public var stxGid: UInt,
    public var stxMode: UShort,
    public var statxPad1: List<UShort>,
    public var stxIno: ULong,
    public var stxSize: ULong,
    public var stxBlocks: ULong,
    public var stxAttributesMask: ULong,
    public var stxAtime: io.github.kotlinmania.libc.StatxTimestamp,
    public var stxBtime: io.github.kotlinmania.libc.StatxTimestamp,
    public var stxCtime: io.github.kotlinmania.libc.StatxTimestamp,
    public var stxMtime: io.github.kotlinmania.libc.StatxTimestamp,
    public var stxRdevMajor: UInt,
    public var stxRdevMinor: UInt,
    public var stxDevMajor: UInt,
    public var stxDevMinor: UInt,
    public var statxPad2: List<ULong>,
)

public open class StatxTimestamp(
    public var tvSec: Long,
    public var tvNsec: UInt,
    public var statxTimestampPad1: List<Int>,
)

public open class Statfs(
    public var fType: CUint,
    public var fBsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsblkcntT,
    public var fFfree: FsblkcntT,
    public var fFsid: FsidT,
    public var fNamelen: CUlong,
    public var fFavail: FsfilcntT,
    public var fFrsize: CUlong,
    public var fFlag: CUlong,
    public var fSpare: List<CUint>,
)

public open class Statfs64(
    public var fType: CUint,
    public var fBsize: CUlong,
    public var fBlocks: Fsblkcnt64T,
    public var fBfree: Fsblkcnt64T,
    public var fBavail: Fsblkcnt64T,
    public var fFiles: Fsblkcnt64T,
    public var fFfree: Fsblkcnt64T,
    public var fFsid: FsidT,
    public var fNamelen: CUlong,
    public var fFavail: Fsfilcnt64T,
    public var fFrsize: CUlong,
    public var fFlag: CUlong,
    public var fSpare: List<CUint>,
)

public open class Statvfs(
    public var fType: CUint,
    public var fBsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFsid: FsidT,
    public var fNamemax: CUlong,
    public var fFavail: FsfilcntT,
    public var fFrsize: CUlong,
    public var fFlag: CUlong,
    public var fSpare: List<CUint>,
)

public open class Statvfs64(
    public var fType: CUint,
    public var fBsize: CUlong,
    public var fBlocks: Fsblkcnt64T,
    public var fBfree: Fsblkcnt64T,
    public var fBavail: Fsblkcnt64T,
    public var fFiles: Fsfilcnt64T,
    public var fFfree: Fsfilcnt64T,
    public var fFsid: FsidT,
    public var fNamemax: CUlong,
    public var fFavail: Fsfilcnt64T,
    public var fFrsize: CUlong,
    public var fFlag: CUlong,
    public var fSpare: List<CUint>,
)

public open class Aiocb(
    public var aioFildes: CInt,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioSigevent: io.github.kotlinmania.libc.Sigevent,
    public var nextPrio: Aiocb?,
    public var absPrio: CInt,
    public var policy: CInt,
    public var errorCode: CInt,
    public var returnValue: SsizeT,
    public var aioOffset: OffT,
    public var glibcReserved: List<CChar>,
)

public open class MqAttr(
    public var mqFlags: CLong,
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqCurmsgs: CLong,
)

public open class ExitStatus(public var eTermination: CShort, public var eExit: CShort)

public open class SemT(public var size: List<CChar>)

public open class Pthread(public var address: UByte)

public open class PthreadMutexattr(
    public var prioceiling: CInt,
    public var protocol: PthreadMutexProtocol,
    public var pshared: PthreadProcessShared,
    public var mutexType: PthreadMutexType,
)

public open class PthreadMutex(
    public var lock: CUint,
    public var ownerId: CUint,
    public var cnt: CUint,
    public var shpid: CInt,
    public var type: CInt,
    public var flags: CInt,
    public var reserved1: CUint,
    public var reserved2: CUint,
)

public open class PthreadCondattr(public var pshared: PthreadProcessShared, public var clock: ClockidT)

public open class PthreadRwlockattr(public var pshared: PthreadProcessShared)

public open class PthreadBarrierattr(public var pshared: PthreadProcessShared)

public open class PthreadOnce(public var run: CInt, public var lock: PthreadSpinlockT)

public open class PthreadCond(
    public var lock: PthreadSpinlockT,
    public var queue: Pthread?,
    public var attr: PthreadCondattr?,
    public var wrefs: CUint,
    public var data: COpaquePointer?,
)

public open class PthreadAttr(
    public var schedparam: SchedParam,
    public var stackaddr: COpaquePointer?,
    public var stacksize: SizeT,
    public var guardsize: SizeT,
    public var detachstate: PthreadDetachstate,
    public var inheritsched: PthreadInheritsched,
    public var contentionscope: PthreadContentionscope,
    public var schedpolicy: CInt,
)

public open class PthreadRwlock(
    public var held: PthreadSpinlockT,
    public var lock: PthreadSpinlockT,
    public var readers: CInt,
    public var readerqueue: Pthread?,
    public var writerqueue: Pthread?,
    public var attr: PthreadRwlockattr?,
    public var data: COpaquePointer?,
)

public open class PthreadBarrier(
    public var lock: PthreadSpinlockT,
    public var queue: Pthread?,
    public var pending: CUint,
    public var count: CUint,
    public var attr: PthreadBarrierattr?,
    public var data: COpaquePointer?,
)

public open class Seminfo(
    public var semmap: CInt,
    public var semmni: CInt,
    public var semmns: CInt,
    public var semmnu: CInt,
    public var semmsl: CInt,
    public var semopm: CInt,
    public var semume: CInt,
    public var semusz: CInt,
    public var semvmx: CInt,
    public var semaem: CInt,
)

public open class IoFile(public var unused: List<UByte>)

public open class SchedParam(public var schedPriority: CInt)

public open class Iovec(public var iovBase: COpaquePointer?, public var iovLen: SizeT)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
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

public open class Itimerspec(public var itInterval: io.github.kotlinmania.libc.Timespec, public var itValue: io.github.kotlinmania.libc.Timespec)

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

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
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

public open class Arpreq(
    public var arpPa: io.github.kotlinmania.libc.Sockaddr,
    public var arpHa: io.github.kotlinmania.libc.Sockaddr,
    public var arpFlags: CInt,
    public var arpNetmask: io.github.kotlinmania.libc.Sockaddr,
    public var arpDev: List<CChar>,
)

public open class ArpreqOld(
    public var arpPa: io.github.kotlinmania.libc.Sockaddr,
    public var arpHa: io.github.kotlinmania.libc.Sockaddr,
    public var arpFlags: CInt,
    public var arpNetmask: io.github.kotlinmania.libc.Sockaddr,
)

public open class Arphdr(
    public var arHrd: UShort,
    public var arPro: UShort,
    public var arHln: UByte,
    public var arPln: UByte,
    public var arOp: UShort,
)

public open class ArpdRequest(
    public var req: CUshort,
    public var ip: UInt,
    public var dev: CUlong,
    public var stamp: CUlong,
    public var updated: CUlong,
    public var ha: List<CUchar>,
)

public open class Mmsghdr(public var msgHdr: io.github.kotlinmania.libc.Msghdr, public var msgLen: CUint)

public open class Ifreq(
    /**
     * interface name, e.g. "en0"
     */
    public var ifrName: List<CChar>,
    public var ifrIfru: io.github.kotlinmania.libc.Sockaddr,
)

public open class LocaleStruct(
    public var locales: List<LocaleData?>,
    public var ctypeB: CUshort?,
    public var ctypeTolower: CInt?,
    public var ctypeToupper: CInt?,
    public var names: List<COpaquePointer?>,
)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
    public var domainname: List<CChar>,
)

public open class Rlimit64(public var rlimCur: Rlim64T, public var rlimMax: Rlim64T)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class DlPhdrInfo(
    public var dlpiAddr: ElfAddr,
    public var dlpiName: COpaquePointer?,
    public var dlpiPhdr: ElfPhdr?,
    public var dlpiPhnum: ElfHalf,
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
    public var dlpiTlsModid: SizeT,
    public var dlpiTlsData: COpaquePointer?,
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
    public var lStart: OffT,
    public var lLen: Off64T,
    public var lPid: PidT,
)

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

public open class Glob64T(
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

public open class RegexT(
    public var buffer: COpaquePointer?,
    public var allocated: SizeT,
    public var used: SizeT,
    public var syntax: CUlong,
    public var fastmap: COpaquePointer?,
    public var translate: COpaquePointer?,
    public var reNsub: SizeT,
    public var bitfield: UByte,
)

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

public open class Sembuf(
    public var semNum: CUshort,
    public var semOp: CShort,
    public var semFlg: CShort,
)

public open class Mntent(
    public var mntFsname: COpaquePointer?,
    public var mntDir: COpaquePointer?,
    public var mntType: COpaquePointer?,
    public var mntOpts: COpaquePointer?,
    public var mntFreq: CInt,
    public var mntPassno: CInt,
)

public open class PosixSpawnFileActionsT(
    public var allocated: CInt,
    public var used: CInt,
    public var actions: CInt?,
    public var pad: List<CInt>,
)

public open class PosixSpawnattrT(
    public var flags: CShort,
    public var pgrp: io.github.kotlinmania.libc.PidT,
    public var sd: io.github.kotlinmania.libc.SigsetT,
    public var ss: io.github.kotlinmania.libc.SigsetT,
    public var sp: io.github.kotlinmania.libc.SchedParam,
    public var policy: CInt,
    public var pad: List<CInt>,
)

public open class RegmatchT(public var rmSo: RegoffT, public var rmEo: RegoffT)

public open class Option(
    public var name: COpaquePointer?,
    public var hasArg: CInt,
    public var flag: CInt?,
    public var value: CInt,
)

public open class Utmpx(
    public var utType: CShort,
    public var utPid: io.github.kotlinmania.libc.PidT,
    public var utLine: List<CChar>,
    public var utId: List<CChar>,
    public var utUser: List<CChar>,
    public var utHost: List<CChar>,
    public var utExit: ExitStatus,
    public var utSession: Int,
    public var utTv: Timeval,
    public var utAddrV6: List<Int>,
    public var glibcReserved: List<CChar>,
)

// const
// aio.h
public val AIO_CANCELED: CInt = 0

public val AIO_NOTCANCELED: CInt = 1

public val AIO_ALLDONE: CInt = 2

public val LIO_READ: CInt = 0

public val LIO_WRITE: CInt = 1

public val LIO_NOP: CInt = 2

public val LIO_WAIT: CInt = 0

public val LIO_NOWAIT: CInt = 1

// glob.h
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

public val GLOB_PERIOD: CInt = 1 shl 7

public val GLOB_ALTDIRFUNC: CInt = 1 shl 9

public val GLOB_BRACE: CInt = 1 shl 10

public val GLOB_NOMAGIC: CInt = 1 shl 11

public val GLOB_TILDE: CInt = 1 shl 12

public val GLOB_ONLYDIR: CInt = 1 shl 13

public val GLOB_TILDE_CHECK: CInt = 1 shl 14

// ipc.h
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

// shm.h
public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_REMAP: CInt = 16384

public val SHM_LOCK: CInt = 11

public val SHM_UNLOCK: CInt = 12

// unistd.h
public val FD_SETSIZE: Int = 256

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val F_OK: CInt = 0

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val SEEK_DATA: CInt = 3

public val SEEK_HOLE: CInt = 4

public val L_SET: CInt = 0

public val L_INCR: CInt = 1

public val L_XTND: CInt = 2

public val F_ULOCK: CInt = 0

public val F_LOCK: CInt = 1

public val F_TLOCK: CInt = 2

public val F_TEST: CInt = 3

public val CLOSE_RANGE_CLOEXEC: CInt = 4

// stdio.h
public val EOF: CInt = -1

// stdlib.h
public val WNOHANG: CInt = 1

public val WUNTRACED: CInt = 2

public val WSTOPPED: CInt = 2

public val WCONTINUED: CInt = 4

public val WNOWAIT: CInt = 8

public val WEXITED: CInt = 16

public val W_CONTINUED: CInt = 65535

public val WCOREFLAG: CInt = 128

public val RAND_MAX: CInt = 2147483647

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val LITTLE_ENDIAN: Int = 1234

public val BIG_ENDIAN: Int = 4321

public val PDP_ENDIAN: Int = 3412

public val BYTE_ORDER: Int = 1234

public val FLOAT_WORD_ORDER: Int = 1234

public val LITTLE_ENDIAN1: Int = 1234

public val BIG_ENDIAN1: Int = 4321

public val PDP_ENDIAN1: Int = 3412

public val BYTE_ORDER1: Int = 1234

// sys/select.h
public val FD_SETSIZE1: Int = 256

public val SIZEOF_PTHREAD_MUTEX_T: Int = 32

public val SIZEOF_PTHREAD_ATTR_T: Int = 32

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 28

public val SIZEOF_PTHREAD_BARRIER_T: Int = 24

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 16

public val SIZEOF_PTHREAD_COND_T: Int = 20

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 8

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 4

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val SIZEOF_PTHREAD_ONCE_T: Int = 8

public val PTHREAD_SPIN_LOCK_INITIALIZER: CInt = 0

public val PTHREAD_MUTEX_NORMAL: CInt = 0

// sys/resource.h
public val RLIM_INFINITY: io.github.kotlinmania.libc.RlimT = 2147483647uL

public val RLIM64_INFINITY: io.github.kotlinmania.libc.Rlim64T = 9223372036854775807

public val RLIM_SAVED_MAX: io.github.kotlinmania.libc.RlimT = RLIM_INFINITY

public val RLIM_SAVED_CUR: io.github.kotlinmania.libc.RlimT = RLIM_INFINITY

public val PRIO_MIN: CInt = -20

public val PRIO_MAX: CInt = 20

// pwd.h
public val NSS_BUFLEN_PASSWD: Int = 1024

// sys/socket.h
public val SOCK_TYPE_MASK: Int = 15

public val PF_UNSPEC: CInt = 0

public val PF_LOCAL: CInt = 1

public val PF_UNIX: CInt = 1

public val PF_FILE: CInt = 1

public val PF_INET: CInt = 2

public val PF_IMPLINK: CInt = 3

public val PF_PUP: CInt = 4

public val PF_CHAOS: CInt = 5

public val PF_NS: CInt = 6

public val PF_ISO: CInt = 7

public val PF_OSI: CInt = 7

public val PF_ECMA: CInt = 8

public val PF_DATAKIT: CInt = 9

public val PF_CCITT: CInt = 10

public val PF_SNA: CInt = 11

public val PF_DE_CNET: CInt = 12

public val PF_DLI: CInt = 13

public val PF_LAT: CInt = 14

public val PF_HYLINK: CInt = 15

public val PF_APPLETALK: CInt = 16

public val PF_ROUTE: CInt = 17

public val PF_XTP: CInt = 19

public val PF_COIP: CInt = 20

public val PF_CNT: CInt = 21

public val PF_RTIP: CInt = 22

public val PF_IPX: CInt = 23

public val PF_SIP: CInt = 24

public val PF_PIP: CInt = 25

public val PF_INET6: CInt = 26

public val PF_MAX: CInt = 27

public val AF_UNSPEC: CInt = 0

public val AF_LOCAL: CInt = 1

public val AF_UNIX: CInt = 1

public val AF_FILE: CInt = 1

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NS: CInt = 6

public val AF_ISO: CInt = 7

public val AF_OSI: CInt = 7

public val AF_ECMA: CInt = 8

public val AF_DATAKIT: CInt = 9

public val AF_CCITT: CInt = 10

public val AF_SNA: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_LAT: CInt = 14

public val AF_HYLINK: CInt = 15

public val AF_APPLETALK: CInt = 16

public val AF_ROUTE: CInt = 17

public val PSEUDO_AF_XTP: CInt = 19

public val AF_COIP: CInt = 20

public val AF_CNT: CInt = 21

public val PSEUDO_AF_RTIP: CInt = 22

public val AF_IPX: CInt = 23

public val AF_SIP: CInt = 24

public val PSEUDO_AF_PIP: CInt = 25

public val AF_INET6: CInt = 26

public val AF_MAX: CInt = 27

public val SOMAXCONN: CInt = 4096

public val SS_SIZE: Int = 128

public val CMGROUP_MAX: Int = 16

public val SOL_SOCKET: CInt = 65535

// sys/time.h
public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

// netinet/in.h
public val SOL_IP: CInt = 0

public val SOL_TCP: CInt = 6

public val SOL_UDP: CInt = 17

public val SOL_IPV6: CInt = 41

public val SOL_ICMPV6: CInt = 58

public val IP_OPTIONS: CInt = 1

public val IP_HDRINCL: CInt = 2

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_RECVOPTS: CInt = 5

public val IP_RECVRETOPTS: CInt = 6

public val IP_RECVDSTADDR: CInt = 7

public val IP_RETOPTS: CInt = 8

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IPV6_ADDRFORM: CInt = 1

public val IPV6_2292PKTINFO: CInt = 2

public val IPV6_2292HOPOPTS: CInt = 3

public val IPV6_2292DSTOPTS: CInt = 4

public val IPV6_2292RTHDR: CInt = 5

public val IPV6_2292PKTOPTIONS: CInt = 6

public val IPV6_CHECKSUM: CInt = 7

public val IPV6_2292HOPLIMIT: CInt = 8

public val IPV6_RXINFO: CInt = 2

public val IPV6_TXINFO: CInt = 2

public val SCM_SRCINFO: CInt = 2

public val IPV6_UNICAST_HOPS: CInt = 16

public val IPV6_MULTICAST_IF: CInt = 17

public val IPV6_MULTICAST_HOPS: CInt = 18

public val IPV6_MULTICAST_LOOP: CInt = 19

public val IPV6_JOIN_GROUP: CInt = 20

public val IPV6_LEAVE_GROUP: CInt = 21

public val IPV6_ROUTER_ALERT: CInt = 22

public val IPV6_MTU_DISCOVER: CInt = 23

public val IPV6_MTU: CInt = 24

public val IPV6_RECVERR: CInt = 25

public val IPV6_V6ONLY: CInt = 26

public val IPV6_JOIN_ANYCAST: CInt = 27

public val IPV6_LEAVE_ANYCAST: CInt = 28

public val IPV6_RECVPKTINFO: CInt = 49

public val IPV6_PKTINFO: CInt = 50

public val IPV6_RECVHOPLIMIT: CInt = 51

public val IPV6_HOPLIMIT: CInt = 52

public val IPV6_RECVHOPOPTS: CInt = 53

public val IPV6_HOPOPTS: CInt = 54

public val IPV6_RTHDRDSTOPTS: CInt = 55

public val IPV6_RECVRTHDR: CInt = 56

public val IPV6_RTHDR: CInt = 57

public val IPV6_RECVDSTOPTS: CInt = 58

public val IPV6_DSTOPTS: CInt = 59

public val IPV6_RECVPATHMTU: CInt = 60

public val IPV6_PATHMTU: CInt = 61

public val IPV6_DONTFRAG: CInt = 62

public val IPV6_RECVTCLASS: CInt = 66

public val IPV6_TCLASS: CInt = 67

public val IPV6_ADDR_PREFERENCES: CInt = 72

public val IPV6_MINHOPCOUNT: CInt = 73

public val IPV6_ADD_MEMBERSHIP: CInt = 20

public val IPV6_DROP_MEMBERSHIP: CInt = 21

public val IPV6_RXHOPOPTS: CInt = 3

public val IPV6_RXDSTOPTS: CInt = 4

public val IPV6_RTHDR_LOOSE: CInt = 0

public val IPV6_RTHDR_STRICT: CInt = 1

public val IPV6_RTHDR_TYPE_0: CInt = 0

public val IN_CLASSA_NET: UInt = 4278190080u

public val IN_CLASSA_NSHIFT: Int = 24

public val IN_CLASSA_HOST: UInt = 16777215u

public val IN_CLASSA_MAX: UInt = 128u

public val IN_CLASSB_NET: UInt = 4294901760u

public val IN_CLASSB_NSHIFT: Int = 16

public val IN_CLASSB_HOST: UInt = 65535u

public val IN_CLASSB_MAX: UInt = 65536u

public val IN_CLASSC_NET: UInt = 4294967040u

public val IN_CLASSC_NSHIFT: Int = 8

public val IN_CLASSC_HOST: UInt = 255u

public val IN_LOOPBACKNET: UInt = 127u

public val INET_ADDRSTRLEN: Int = 16

public val INET6_ADDRSTRLEN: Int = 46

// netinet/ip.h
public val IPTOS_TOS_MASK: UByte = 0x1Eu

public val IPTOS_PREC_MASK: UByte = 0xE0u

public val IPTOS_ECN_NOT_ECT: UByte = 0x00u

public val IPTOS_LOWDELAY: UByte = 0x10u

public val IPTOS_THROUGHPUT: UByte = 0x08u

public val IPTOS_RELIABILITY: UByte = 0x04u

public val IPTOS_MINCOST: UByte = 0x02u

public val IPTOS_PREC_NETCONTROL: UByte = 0xe0u

public val IPTOS_PREC_INTERNETCONTROL: UByte = 0xc0u

public val IPTOS_PREC_CRITIC_ECP: UByte = 0xa0u

public val IPTOS_PREC_FLASHOVERRIDE: UByte = 0x80u

public val IPTOS_PREC_FLASH: UByte = 0x60u

public val IPTOS_PREC_IMMEDIATE: UByte = 0x40u

public val IPTOS_PREC_PRIORITY: UByte = 0x20u

public val IPTOS_PREC_ROUTINE: UByte = 0x00u

public val IPTOS_ECN_MASK: UByte = 0x03u

public val IPTOS_ECN_ECT1: UByte = 0x01u

public val IPTOS_ECN_ECT0: UByte = 0x02u

public val IPTOS_ECN_CE: UByte = 0x03u

public val IPOPT_COPY: UByte = 0x80u

public val IPOPT_CLASS_MASK: UByte = 0x60u

public val IPOPT_NUMBER_MASK: UByte = 0x1fu

public val IPOPT_CONTROL: UByte = 0x00u

public val IPOPT_RESERVED1: UByte = 0x20u

public val IPOPT_MEASUREMENT: UByte = 0x40u

public val IPOPT_RESERVED2: UByte = 0x60u

public val IPOPT_END: UByte = (0u or IPOPT_CONTROL).toUByte()

public val IPOPT_NOOP: UByte = (1u or IPOPT_CONTROL).toUByte()

public val IPOPT_SEC: UByte = (2u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_LSRR: UByte = (3u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_TIMESTAMP: UByte = (4u or IPOPT_MEASUREMENT).toUByte()

public val IPOPT_RR: UByte = (7u or IPOPT_CONTROL).toUByte()

public val IPOPT_SID: UByte = (8u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_SSRR: UByte = (9u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPOPT_RA: UByte = (20u or IPOPT_CONTROL or IPOPT_COPY).toUByte()

public val IPVERSION: UByte = 4u

public val MAXTTL: UByte = 255u

public val IPDEFTTL: UByte = 64u

public val IPOPT_OPTVAL: UByte = 0u

public val IPOPT_OLEN: UByte = 1u

public val IPOPT_OFFSET: UByte = 2u

public val IPOPT_MINOFF: UByte = 4u

public val MAX_IPOPTLEN: UByte = 40u

public val IPOPT_NOP: UByte = IPOPT_NOOP

public val IPOPT_EOL: UByte = IPOPT_END

public val IPOPT_TS: UByte = IPOPT_TIMESTAMP

public val IPOPT_TS_TSONLY: UByte = 0u

public val IPOPT_TS_TSANDADDR: UByte = 1u

public val IPOPT_TS_PRESPEC: UByte = 3u

// net/ifArp.h
public val ARPOP_REQUEST: UShort = 1u

public val ARPOP_REPLY: UShort = 2u

public val ARPOP_RREQUEST: UShort = 3u

public val ARPOP_RREPLY: UShort = 4u

public val ARPOP_IN_REQUEST: UShort = 8u

public val ARPOP_IN_REPLY: UShort = 9u

public val ARPOP_NAK: UShort = 10u

public val MAX_ADDR_LEN: Int = 7

public val ARPD_UPDATE: CUshort = 0x01u

public val ARPD_LOOKUP: CUshort = 0x02u

public val ARPD_FLUSH: CUshort = 0x03u

public val ATF_MAGIC: CInt = 0x80

public val ATF_NETMASK: CInt = 0x20

public val ATF_DONTPUB: CInt = 0x40

public val ARPHRD_NETROM: UShort = 0u

public val ARPHRD_ETHER: UShort = 1u

public val ARPHRD_EETHER: UShort = 2u

public val ARPHRD_AX25: UShort = 3u

public val ARPHRD_PRONET: UShort = 4u

public val ARPHRD_CHAOS: UShort = 5u

public val ARPHRD_IEEE802: UShort = 6u

public val ARPHRD_ARCNET: UShort = 7u

public val ARPHRD_APPLETLK: UShort = 8u

public val ARPHRD_DLCI: UShort = 15u

public val ARPHRD_ATM: UShort = 19u

public val ARPHRD_METRICOM: UShort = 23u

public val ARPHRD_IEEE1394: UShort = 24u

public val ARPHRD_EUI64: UShort = 27u

public val ARPHRD_INFINIBAND: UShort = 32u

public val ARPHRD_SLIP: UShort = 256u

public val ARPHRD_CSLIP: UShort = 257u

public val ARPHRD_SLIP6: UShort = 258u

public val ARPHRD_CSLIP6: UShort = 259u

public val ARPHRD_RSRVD: UShort = 260u

public val ARPHRD_ADAPT: UShort = 264u

public val ARPHRD_ROSE: UShort = 270u

public val ARPHRD_X25: UShort = 271u

public val ARPHRD_HWX25: UShort = 272u

public val ARPHRD_CAN: UShort = 280u

public val ARPHRD_PPP: UShort = 512u

public val ARPHRD_CISCO: UShort = 513u

public val ARPHRD_HDLC: UShort = ARPHRD_CISCO

public val ARPHRD_LAPB: UShort = 516u

public val ARPHRD_DDCMP: UShort = 517u

public val ARPHRD_RAWHDLC: UShort = 518u

public val ARPHRD_TUNNEL: UShort = 768u

public val ARPHRD_TUNNEL6: UShort = 769u

public val ARPHRD_FRAD: UShort = 770u

public val ARPHRD_SKIP: UShort = 771u

public val ARPHRD_LOOPBACK: UShort = 772u

public val ARPHRD_LOCALTLK: UShort = 773u

public val ARPHRD_FDDI: UShort = 774u

public val ARPHRD_BIF: UShort = 775u

public val ARPHRD_SIT: UShort = 776u

public val ARPHRD_IPDDP: UShort = 777u

public val ARPHRD_IPGRE: UShort = 778u

public val ARPHRD_PIMREG: UShort = 779u

public val ARPHRD_HIPPI: UShort = 780u

public val ARPHRD_ASH: UShort = 781u

public val ARPHRD_ECONET: UShort = 782u

public val ARPHRD_IRDA: UShort = 783u

public val ARPHRD_FCPP: UShort = 784u

public val ARPHRD_FCAL: UShort = 785u

public val ARPHRD_FCPL: UShort = 786u

public val ARPHRD_FCFABRIC: UShort = 787u

public val ARPHRD_IEEE802_TR: UShort = 800u

public val ARPHRD_IEEE80211: UShort = 801u

public val ARPHRD_IEEE80211_PRISM: UShort = 802u

public val ARPHRD_IEEE80211_RADIOTAP: UShort = 803u

public val ARPHRD_IEEE802154: UShort = 804u

public val ARPHRD_VOID: UShort = 0xFFFFu

public val ARPHRD_NONE: UShort = 0xFFFEu

// bits/posix1Lim.h
public val POSIX_AIO_LISTIO_MAX: Int = 2

public val POSIX_AIO_MAX: Int = 1

public val POSIX_ARG_MAX: Int = 4096

public val POSIX_CHILD_MAX: Int = 25

public val POSIX_DELAYTIMER_MAX: Int = 32

public val POSIX_HOST_NAME_MAX: Int = 255

public val POSIX_LINK_MAX: Int = 8

public val POSIX_LOGIN_NAME_MAX: Int = 9

public val POSIX_MAX_CANON: Int = 255

public val POSIX_MAX_INPUT: Int = 255

public val POSIX_MQ_OPEN_MAX: Int = 8

public val POSIX_MQ_PRIO_MAX: Int = 32

public val POSIX_NAME_MAX: Int = 14

public val POSIX_NGROUPS_MAX: Int = 8

public val POSIX_OPEN_MAX: Int = 20

public val POSIX_FD_SETSIZE: Int = 20

public val POSIX_PATH_MAX: Int = 256

public val POSIX_PIPE_BUF: Int = 512

public val POSIX_RE_DUP_MAX: Int = 255

public val POSIX_RTSIG_MAX: Int = 8

public val POSIX_SEM_NSEMS_MAX: Int = 256

public val POSIX_SEM_VALUE_MAX: Int = 32767

public val POSIX_SIGQUEUE_MAX: Int = 32

public val POSIX_SSIZE_MAX: Int = 32767

public val POSIX_STREAM_MAX: Int = 8

public val POSIX_SYMLINK_MAX: Int = 255

public val POSIX_SYMLOOP_MAX: Int = 8

public val POSIX_TIMER_MAX: Int = 32

public val POSIX_TTY_NAME_MAX: Int = 9

public val POSIX_TZNAME_MAX: Int = 6

public val POSIX_QLIMIT: Int = 1

public val POSIX_HIWAT: Int = 512

public val POSIX_UIO_MAXIOV: Int = 16

public val POSIX_CLOCKRES_MIN: Int = 20000000

public val NAME_MAX: Int = 255

public val NGROUPS_MAX: Int = 256

public val POSIX_THREAD_KEYS_MAX: Int = 128

public val POSIX_THREAD_DESTRUCTOR_ITERATIONS: Int = 4

public val POSIX_THREAD_THREADS_MAX: Int = 64

public val SEM_VALUE_MAX: CInt = 2147483647

public val MAXNAMLEN: Int = 255

// netdb.h
public val PATH_HEQUIV: List<UByte> = "/etc/hosts.equiv\u0000".encodeToByteArray()

public val PATH_HOSTS: List<UByte> = "/etc/hosts\u0000".encodeToByteArray()

public val PATH_NETWORKS: List<UByte> = "/etc/networks\u0000".encodeToByteArray()

public val PATH_NSSWITCH_CONF: List<UByte> = "/etc/nsswitch.conf\u0000".encodeToByteArray()

public val PATH_PROTOCOLS: List<UByte> = "/etc/protocols\u0000".encodeToByteArray()

public val PATH_SERVICES: List<UByte> = "/etc/services\u0000".encodeToByteArray()

public val HOST_NOT_FOUND: CInt = 1

public val TRY_AGAIN: CInt = 2

public val NO_RECOVERY: CInt = 3

public val NO_DATA: CInt = 4

public val NETDB_INTERNAL: CInt = -1

public val NETDB_SUCCESS: CInt = 0

public val NO_ADDRESS: CInt = 4

public val IPPORT_RESERVED: CInt = 1024

public val SCOPE_DELIMITER: UByte = 37u

public val GAI_WAIT: CInt = 0

public val GAI_NOWAIT: CInt = 1

public val AI_PASSIVE: CInt = 1

public val AI_CANONNAME: CInt = 2

public val AI_NUMERICHOST: CInt = 4

public val AI_V4MAPPED: CInt = 8

public val AI_ALL: CInt = 16

public val AI_ADDRCONFIG: CInt = 32

public val AI_IDN: CInt = 64

public val AI_CANONIDN: CInt = 128

public val AI_NUMERICSERV: CInt = 1024

public val EAI_BADFLAGS: CInt = -1

public val EAI_NONAME: CInt = -2

public val EAI_AGAIN: CInt = -3

public val EAI_FAIL: CInt = -4

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_MEMORY: CInt = -10

public val EAI_SYSTEM: CInt = -11

public val EAI_OVERFLOW: CInt = -12

public val EAI_NODATA: CInt = -5

public val EAI_ADDRFAMILY: CInt = -9

public val EAI_INPROGRESS: CInt = -100

public val EAI_CANCELED: CInt = -101

public val EAI_NOTCANCELED: CInt = -102

public val EAI_ALLDONE: CInt = -103

public val EAI_INTR: CInt = -104

public val EAI_IDN_ENCODE: CInt = -105

public val NI_MAXHOST: Int = 1025

public val NI_MAXSERV: Int = 32

public val NI_NUMERICHOST: CInt = 1

public val NI_NUMERICSERV: CInt = 2

public val NI_NOFQDN: CInt = 4

public val NI_NAMEREQD: CInt = 8

public val NI_DGRAM: CInt = 16

public val NI_IDN: CInt = 32

// time.h
public val CLOCK_REALTIME: io.github.kotlinmania.libc.ClockidT = 0

public val CLOCK_MONOTONIC: io.github.kotlinmania.libc.ClockidT = 1

public val CLOCK_PROCESS_CPUTIME_ID: io.github.kotlinmania.libc.ClockidT = 2

public val CLOCK_THREAD_CPUTIME_ID: io.github.kotlinmania.libc.ClockidT = 3

public val CLOCK_MONOTONIC_RAW: io.github.kotlinmania.libc.ClockidT = 4

public val CLOCK_REALTIME_COARSE: io.github.kotlinmania.libc.ClockidT = 5

public val CLOCK_MONOTONIC_COARSE: io.github.kotlinmania.libc.ClockidT = 6

public val TIMER_ABSTIME: CInt = 1

public val TIME_UTC: CInt = 1

// sys/poll.h
public val POLLIN: Short = 1

public val POLLPRI: Short = 2

public val POLLOUT: Short = 4

public val POLLRDNORM: Short = 1

public val POLLRDBAND: Short = 2

public val POLLWRNORM: Short = 4

public val POLLWRBAND: Short = 4

public val POLLERR: Short = 8

public val POLLHUP: Short = 16

public val POLLNVAL: Short = 32

// locale.h
public val LC_CTYPE: Int = 0

public val LC_NUMERIC: Int = 1

public val LC_TIME: Int = 2

public val LC_COLLATE: Int = 3

public val LC_MONETARY: Int = 4

public val LC_MESSAGES: Int = 5

public val LC_ALL: Int = 6

public val LC_PAPER: Int = 7

public val LC_NAME: Int = 8

public val LC_ADDRESS: Int = 9

public val LC_TELEPHONE: Int = 10

public val LC_MEASUREMENT: Int = 11

public val LC_IDENTIFICATION: Int = 12

public val LC_CTYPE1: CInt = 0

public val LC_NUMERIC1: CInt = 1

public val LC_TIME1: CInt = 2

public val LC_COLLATE1: CInt = 3

public val LC_MONETARY1: CInt = 4

public val LC_MESSAGES1: CInt = 5

public val LC_ALL1: CInt = 6

public val LC_PAPER1: CInt = 7

public val LC_NAME1: CInt = 8

public val LC_ADDRESS1: CInt = 9

public val LC_TELEPHONE1: CInt = 10

public val LC_MEASUREMENT1: CInt = 11

public val LC_IDENTIFICATION1: CInt = 12

public val LC_CTYPE_MASK: CInt = 1

public val LC_NUMERIC_MASK: CInt = 2

public val LC_TIME_MASK: CInt = 4

public val LC_COLLATE_MASK: CInt = 8

public val LC_MONETARY_MASK: CInt = 16

public val LC_MESSAGES_MASK: CInt = 32

public val LC_PAPER_MASK: CInt = 128

public val LC_NAME_MASK: CInt = 256

public val LC_ADDRESS_MASK: CInt = 512

public val LC_TELEPHONE_MASK: CInt = 1024

public val LC_MEASUREMENT_MASK: CInt = 2048

public val LC_IDENTIFICATION_MASK: CInt = 4096

public val LC_ALL_MASK: CInt = 8127

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

public val RADIXCHAR: io.github.kotlinmania.libc.NlItem = 0x10000

public val THOUSEP: io.github.kotlinmania.libc.NlItem = 0x10001

public val YESEXPR: io.github.kotlinmania.libc.NlItem = 0x50000

public val NOEXPR: io.github.kotlinmania.libc.NlItem = 0x50001

public val YESSTR: io.github.kotlinmania.libc.NlItem = 0x50002

public val NOSTR: io.github.kotlinmania.libc.NlItem = 0x50003

// reboot.h
public val RB_AUTOBOOT: CInt = 0x0

public val RB_ASKNAME: CInt = 0x1

public val RB_SINGLE: CInt = 0x2

public val RB_KBD: CInt = 0x4

public val RB_HALT: CInt = 0x8

public val RB_INITNAME: CInt = 0x10

public val RB_DFLTROOT: CInt = 0x20

public val RB_NOBOOTRC: CInt = 0x20

public val RB_ALTBOOT: CInt = 0x40

public val RB_UNIPROC: CInt = 0x80

public val RB_DEBUGGER: CInt = 0x1000

// semaphore.h
public val SIZEOF_SEM_T: Int = 20

public val SEM_FAILED: io.github.kotlinmania.libc.SemT? = null

// termios.h
public val IGNBRK: io.github.kotlinmania.libc.TcflagT = 1u

public val BRKINT: io.github.kotlinmania.libc.TcflagT = 2u

public val IGNPAR: io.github.kotlinmania.libc.TcflagT = 4u

public val PARMRK: io.github.kotlinmania.libc.TcflagT = 8u

public val INPCK: io.github.kotlinmania.libc.TcflagT = 16u

public val ISTRIP: io.github.kotlinmania.libc.TcflagT = 32u

public val INLCR: io.github.kotlinmania.libc.TcflagT = 64u

public val IGNCR: io.github.kotlinmania.libc.TcflagT = 128u

public val ICRNL: io.github.kotlinmania.libc.TcflagT = 256u

public val IXON: io.github.kotlinmania.libc.TcflagT = 512u

public val IXOFF: io.github.kotlinmania.libc.TcflagT = 1024u

public val IXANY: io.github.kotlinmania.libc.TcflagT = 2048u

public val IMAXBEL: io.github.kotlinmania.libc.TcflagT = 8192u

public val IUCLC: io.github.kotlinmania.libc.TcflagT = 16384u

public val OPOST: io.github.kotlinmania.libc.TcflagT = 1u

public val ONLCR: io.github.kotlinmania.libc.TcflagT = 2u

public val ONOEOT: io.github.kotlinmania.libc.TcflagT = 8u

public val OCRNL: io.github.kotlinmania.libc.TcflagT = 16u

public val ONOCR: io.github.kotlinmania.libc.TcflagT = 32u

public val ONLRET: io.github.kotlinmania.libc.TcflagT = 64u

public val NLDLY: io.github.kotlinmania.libc.TcflagT = 768u

public val NL0: io.github.kotlinmania.libc.TcflagT = 0u

public val NL1: io.github.kotlinmania.libc.TcflagT = 256u

public val TABDLY: io.github.kotlinmania.libc.TcflagT = 3076u

public val TAB0: io.github.kotlinmania.libc.TcflagT = 0u

public val TAB1: io.github.kotlinmania.libc.TcflagT = 1024u

public val TAB2: io.github.kotlinmania.libc.TcflagT = 2048u

public val TAB3: io.github.kotlinmania.libc.TcflagT = 4u

public val CRDLY: io.github.kotlinmania.libc.TcflagT = 12288u

public val CR0: io.github.kotlinmania.libc.TcflagT = 0u

public val CR1: io.github.kotlinmania.libc.TcflagT = 4096u

public val CR2: io.github.kotlinmania.libc.TcflagT = 8192u

public val CR3: io.github.kotlinmania.libc.TcflagT = 12288u

public val FFDLY: io.github.kotlinmania.libc.TcflagT = 16384u

public val FF0: io.github.kotlinmania.libc.TcflagT = 0u

public val FF1: io.github.kotlinmania.libc.TcflagT = 16384u

public val BSDLY: io.github.kotlinmania.libc.TcflagT = 32768u

public val BS0: io.github.kotlinmania.libc.TcflagT = 0u

public val BS1: io.github.kotlinmania.libc.TcflagT = 32768u

public val VTDLY: io.github.kotlinmania.libc.TcflagT = 65536u

public val VT0: io.github.kotlinmania.libc.TcflagT = 0u

public val VT1: io.github.kotlinmania.libc.TcflagT = 65536u

public val OLCUC: io.github.kotlinmania.libc.TcflagT = 131072u

public val OFILL: io.github.kotlinmania.libc.TcflagT = 262144u

public val OFDEL: io.github.kotlinmania.libc.TcflagT = 524288u

public val CIGNORE: io.github.kotlinmania.libc.TcflagT = 1u

public val CSIZE: io.github.kotlinmania.libc.TcflagT = 768u

public val CS5: io.github.kotlinmania.libc.TcflagT = 0u

public val CS6: io.github.kotlinmania.libc.TcflagT = 256u

public val CS7: io.github.kotlinmania.libc.TcflagT = 512u

public val CS8: io.github.kotlinmania.libc.TcflagT = 768u

public val CSTOPB: io.github.kotlinmania.libc.TcflagT = 1024u

public val CREAD: io.github.kotlinmania.libc.TcflagT = 2048u

public val PARENB: io.github.kotlinmania.libc.TcflagT = 4096u

public val PARODD: io.github.kotlinmania.libc.TcflagT = 8192u

public val HUPCL: io.github.kotlinmania.libc.TcflagT = 16384u

public val CLOCAL: io.github.kotlinmania.libc.TcflagT = 32768u

public val CRTSCTS: io.github.kotlinmania.libc.TcflagT = 65536u

public val CRTS_IFLOW: io.github.kotlinmania.libc.TcflagT = 65536u

public val CCTS_OFLOW: io.github.kotlinmania.libc.TcflagT = 65536u

public val CDTRCTS: io.github.kotlinmania.libc.TcflagT = 131072u

public val MDMBUF: io.github.kotlinmania.libc.TcflagT = 1048576u

public val CHWFLOW: io.github.kotlinmania.libc.TcflagT = 1245184u

public val ECHOKE: io.github.kotlinmania.libc.TcflagT = 1u

public val ECHOE: io.github.kotlinmania.libc.TcflagT = 2u

public val ECHOE1: io.github.kotlinmania.libc.TcflagT = 2u

public val ECHOK: io.github.kotlinmania.libc.TcflagT = 4u

public val ECHOK1: io.github.kotlinmania.libc.TcflagT = 4u

public val ECHO: io.github.kotlinmania.libc.TcflagT = 8u

public val ECHO1: io.github.kotlinmania.libc.TcflagT = 8u

public val ECHONL: io.github.kotlinmania.libc.TcflagT = 16u

public val ECHONL1: io.github.kotlinmania.libc.TcflagT = 16u

public val ECHOPRT: io.github.kotlinmania.libc.TcflagT = 32u

public val ECHOCTL: io.github.kotlinmania.libc.TcflagT = 64u

public val ISIG: io.github.kotlinmania.libc.TcflagT = 128u

public val ISIG1: io.github.kotlinmania.libc.TcflagT = 128u

public val ICANON: io.github.kotlinmania.libc.TcflagT = 256u

public val ICANON1: io.github.kotlinmania.libc.TcflagT = 256u

public val ALTWERASE: io.github.kotlinmania.libc.TcflagT = 512u

public val IEXTEN: io.github.kotlinmania.libc.TcflagT = 1024u

public val IEXTEN1: io.github.kotlinmania.libc.TcflagT = 1024u

public val EXTPROC: io.github.kotlinmania.libc.TcflagT = 2048u

public val TOSTOP: io.github.kotlinmania.libc.TcflagT = 4194304u

public val TOSTOP1: io.github.kotlinmania.libc.TcflagT = 4194304u

public val FLUSHO: io.github.kotlinmania.libc.TcflagT = 8388608u

public val NOKERNINFO: io.github.kotlinmania.libc.TcflagT = 33554432u

public val PENDIN: io.github.kotlinmania.libc.TcflagT = 536870912u

public val NOFLSH: io.github.kotlinmania.libc.TcflagT = 2147483648u

public val NOFLSH1: io.github.kotlinmania.libc.TcflagT = 2147483648u

public val VEOF: Int = 0

public val VEOL: Int = 1

public val VEOL2: Int = 2

public val VERASE: Int = 3

public val VWERASE: Int = 4

public val VKILL: Int = 5

public val VREPRINT: Int = 6

public val VINTR: Int = 8

public val VQUIT: Int = 9

public val VSUSP: Int = 10

public val VDSUSP: Int = 11

public val VSTART: Int = 12

public val VSTOP: Int = 13

public val VLNEXT: Int = 14

public val VDISCARD: Int = 15

public val VMIN: Int = 16

public val VTIME: Int = 17

public val VSTATUS: Int = 18

public val NCCS: Int = 20

public val B0: io.github.kotlinmania.libc.SpeedT = 0

public val B50: io.github.kotlinmania.libc.SpeedT = 50

public val B75: io.github.kotlinmania.libc.SpeedT = 75

public val B110: io.github.kotlinmania.libc.SpeedT = 110

public val B134: io.github.kotlinmania.libc.SpeedT = 134

public val B150: io.github.kotlinmania.libc.SpeedT = 150

public val B200: io.github.kotlinmania.libc.SpeedT = 200

public val B300: io.github.kotlinmania.libc.SpeedT = 300

public val B600: io.github.kotlinmania.libc.SpeedT = 600

public val B1200: io.github.kotlinmania.libc.SpeedT = 1200

public val B1800: io.github.kotlinmania.libc.SpeedT = 1800

public val B2400: io.github.kotlinmania.libc.SpeedT = 2400

public val B4800: io.github.kotlinmania.libc.SpeedT = 4800

public val B9600: io.github.kotlinmania.libc.SpeedT = 9600

public val B7200: io.github.kotlinmania.libc.SpeedT = 7200

public val B14400: io.github.kotlinmania.libc.SpeedT = 14400

public val B19200: io.github.kotlinmania.libc.SpeedT = 19200

public val B28800: io.github.kotlinmania.libc.SpeedT = 28800

public val B38400: io.github.kotlinmania.libc.SpeedT = 38400

public val EXTA: io.github.kotlinmania.libc.SpeedT = B19200

public val EXTB: io.github.kotlinmania.libc.SpeedT = B38400

public val B57600: io.github.kotlinmania.libc.SpeedT = 57600

public val B76800: io.github.kotlinmania.libc.SpeedT = 76800

public val B115200: io.github.kotlinmania.libc.SpeedT = 115200

public val B230400: io.github.kotlinmania.libc.SpeedT = 230400

public val B460800: io.github.kotlinmania.libc.SpeedT = 460800

public val B500000: io.github.kotlinmania.libc.SpeedT = 500000

public val B576000: io.github.kotlinmania.libc.SpeedT = 576000

public val B921600: io.github.kotlinmania.libc.SpeedT = 921600

public val B1000000: io.github.kotlinmania.libc.SpeedT = 1000000

public val B1152000: io.github.kotlinmania.libc.SpeedT = 1152000

public val B1500000: io.github.kotlinmania.libc.SpeedT = 1500000

public val B2000000: io.github.kotlinmania.libc.SpeedT = 2000000

public val B2500000: io.github.kotlinmania.libc.SpeedT = 2500000

public val B3000000: io.github.kotlinmania.libc.SpeedT = 3000000

public val B3500000: io.github.kotlinmania.libc.SpeedT = 3500000

public val B4000000: io.github.kotlinmania.libc.SpeedT = 4000000

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val TCSASOFT: CInt = 16

public val TCIFLUSH: CInt = 1

public val TCOFLUSH: CInt = 2

public val TCIOFLUSH: CInt = 3

public val TCOOFF: CInt = 1

public val TCOON: CInt = 2

public val TCIOFF: CInt = 3

public val TCION: CInt = 4

public val TTYDEF_IFLAG: io.github.kotlinmania.libc.TcflagT = 11042u

public val TTYDEF_LFLAG: io.github.kotlinmania.libc.TcflagT = 1483u

public val TTYDEF_CFLAG: io.github.kotlinmania.libc.TcflagT = 23040u

public val TTYDEF_SPEED: io.github.kotlinmania.libc.TcflagT = 9600u

public val CEOL: UByte = 0u

public val CERASE: UByte = 127u

public val CMIN: UByte = 1u

public val CQUIT: UByte = 28u

public val CTIME: UByte = 0u

public val CBRK: UByte = 0u

// dlfcn.h
public val RTLD_DEFAULT: COpaquePointer? = null

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1L).toLong())

public val RTLD_LAZY: CInt = 1

public val RTLD_NOW: CInt = 2

public val RTLD_BINDING_MASK: CInt = 3

public val RTLD_NOLOAD: CInt = 4

public val RTLD_DEEPBIND: CInt = 8

public val RTLD_GLOBAL: CInt = 256

public val RTLD_LOCAL: CInt = 0

public val RTLD_NODELETE: CInt = 4096

public val DLFO_STRUCT_HAS_EH_DBASE: Int = 1

public val DLFO_STRUCT_HAS_EH_COUNT: Int = 0

public val LM_ID_BASE: CLong = 0L

public val LM_ID_NEWLM: CLong = -1L

// bits/signumGeneric.h
public val SIGINT: CInt = 2

public val SIGILL: CInt = 4

public val SIGABRT: CInt = 6

public val SIGFPE: CInt = 8

public val SIGSEGV: CInt = 11

public val SIGTERM: CInt = 15

public val SIGHUP: CInt = 1

public val SIGQUIT: CInt = 3

public val SIGTRAP: CInt = 5

public val SIGKILL: CInt = 9

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGIOT: CInt = 6

public val SIGBUS: CInt = 10

public val SIGSYS: CInt = 12

public val SIGEMT: CInt = 7

public val SIGINFO: CInt = 29

public val SIGLOST: CInt = 32

public val SIGURG: CInt = 16

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGCONT: CInt = 19

public val SIGCHLD: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGPOLL: CInt = 23

public val SIGXCPU: CInt = 24

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGXFSZ: CInt = 25

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val SIGWINCH: CInt = 28

public val SIGIO: CInt = 23

public val SIGCLD: CInt = 20

public val SIGRTMIN: Int = 32

public val SIGRTMAX: Int = 32

public val NSIG: Int = 33

public val NSIG1: Int = 33

// bits/sigaction.h
public val SA_ONSTACK: CInt = 1

public val SA_RESTART: CInt = 2

public val SA_NODEFER: CInt = 16

public val SA_RESETHAND: CInt = 4

public val SA_NOCLDSTOP: CInt = 8

public val SA_SIGINFO: CInt = 64

public val SA_INTERRUPT: CInt = 0

public val SA_NOMASK: CInt = 16

public val SA_ONESHOT: CInt = 4

public val SA_STACK: CInt = 1

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 3

// bits/sigcontext.h
public val FPC_IE: UShort = 1u

public val FPC_IM: UShort = 1u

public val FPC_DE: UShort = 2u

public val FPC_DM: UShort = 2u

public val FPC_ZE: UShort = 4u

public val FPC_ZM: UShort = 4u

public val FPC_OE: UShort = 8u

public val FPC_OM: UShort = 8u

public val FPC_UE: UShort = 16u

public val FPC_PE: UShort = 32u

public val FPC_PC: UShort = 768u

public val FPC_PC_24: UShort = 0u

public val FPC_PC_53: UShort = 512u

public val FPC_PC_64: UShort = 768u

public val FPC_RC: UShort = 3072u

public val FPC_RC_RN: UShort = 0u

public val FPC_RC_RD: UShort = 1024u

public val FPC_RC_RU: UShort = 2048u

public val FPC_RC_CHOP: UShort = 3072u

public val FPC_IC: UShort = 4096u

public val FPC_IC_PROJ: UShort = 0u

public val FPC_IC_AFF: UShort = 4096u

public val FPS_IE: UShort = 1u

public val FPS_DE: UShort = 2u

public val FPS_ZE: UShort = 4u

public val FPS_OE: UShort = 8u

public val FPS_UE: UShort = 16u

public val FPS_PE: UShort = 32u

public val FPS_SF: UShort = 64u

public val FPS_ES: UShort = 128u

public val FPS_C0: UShort = 256u

public val FPS_C1: UShort = 512u

public val FPS_C2: UShort = 1024u

public val FPS_TOS: UShort = 14336u

public val FPS_TOS_SHIFT: UShort = 11u

public val FPS_C3: UShort = 16384u

public val FPS_BUSY: UShort = 32768u

public val FPE_INTOVF_TRAP: CInt = 1

public val FPE_INTDIV_FAULT: CInt = 2

public val FPE_FLTOVF_FAULT: CInt = 3

public val FPE_FLTDIV_FAULT: CInt = 4

public val FPE_FLTUND_FAULT: CInt = 5

public val FPE_SUBRNG_FAULT: CInt = 7

public val FPE_FLTDNR_FAULT: CInt = 8

public val FPE_FLTINX_FAULT: CInt = 9

public val FPE_EMERR_FAULT: CInt = 10

public val FPE_EMBND_FAULT: CInt = 11

public val ILL_INVOPR_FAULT: CInt = 1

public val ILL_STACK_FAULT: CInt = 2

public val ILL_FPEOPR_FAULT: CInt = 3

public val DBG_SINGLE_TRAP: CInt = 1

public val DBG_BRKPNT_FAULT: CInt = 2

public val NGREG: Int = 19

public val NGREG1: Int = 19

// bits/sigstack.h
public val MINSIGSTKSZ: Int = 8192

public val SIGSTKSZ: Int = 40960

// sys/stat.h
public val S_IFMT: ModeT = 61440u

public val S_IFDIR: ModeT = 16384u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFIFO: ModeT = 4096u

public val S_ISUID: ModeT = 2048u

public val S_ISGID: ModeT = 1024u

public val S_ISVTX: ModeT = 512u

public val S_IREAD: ModeT = 256u

public val S_IWRITE: ModeT = 128u

public val S_IEXEC: ModeT = 64u

public val S_INOCACHE: ModeT = 65536u

public val S_IUSEUNK: ModeT = 131072u

public val S_IUNKNOWN: ModeT = 1835008u

public val S_IUNKSHIFT: ModeT = 12u

public val S_IPTRANS: ModeT = 2097152u

public val S_IATRANS: ModeT = 4194304u

public val S_IROOT: ModeT = 8388608u

public val S_ITRANS: ModeT = 14680064u

public val S_IMMAP0: ModeT = 16777216u

public val CMASK: ModeT = 18u

public val UF_SETTABLE: CUint = 65535u

public val UF_NODUMP: CUint = 1u

public val UF_IMMUTABLE: CUint = 2u

public val UF_APPEND: CUint = 4u

public val UF_OPAQUE: CUint = 8u

public val UF_NOUNLINK: CUint = 16u

public val SF_SETTABLE: CUint = 4294901760u

public val SF_ARCHIVED: CUint = 65536u

public val SF_IMMUTABLE: CUint = 131072u

public val SF_APPEND: CUint = 262144u

public val SF_NOUNLINK: CUint = 1048576u

public val SF_SNAPSHOT: CUint = 2097152u

public val UTIME_NOW: CLong = -1L

public val UTIME_OMIT: CLong = -2L

public val S_IFMT1: ModeT = 61440u

public val S_IFDIR1: ModeT = 16384u

public val S_IFCHR1: ModeT = 8192u

public val S_IFBLK1: ModeT = 24576u

public val S_IFREG1: ModeT = 32768u

public val S_IFIFO1: ModeT = 4096u

public val S_IFLNK1: ModeT = 40960u

public val S_IFSOCK1: ModeT = 49152u

public val S_ISUID1: ModeT = 2048u

public val S_ISGID1: ModeT = 1024u

public val S_ISVTX1: ModeT = 512u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRWXU: ModeT = 448u

public val S_IREAD1: ModeT = 256u

public val S_IWRITE1: ModeT = 128u

public val S_IEXEC1: ModeT = 64u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IRWXG: ModeT = 56u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public val S_IRWXO: ModeT = 7u

public val ACCESSPERMS: ModeT = 511u

public val ALLPERMS: ModeT = 4095u

public val DEFFILEMODE: ModeT = 438u

public val S_BLKSIZE: Int = 512

public val STATX_TYPE: CUint = 1u

public val STATX_MODE: CUint = 2u

public val STATX_NLINK: CUint = 4u

public val STATX_UID: CUint = 8u

public val STATX_GID: CUint = 16u

public val STATX_ATIME: CUint = 32u

public val STATX_MTIME: CUint = 64u

public val STATX_CTIME: CUint = 128u

public val STATX_INO: CUint = 256u

public val STATX_SIZE: CUint = 512u

public val STATX_BLOCKS: CUint = 1024u

public val STATX_BASIC_STATS: CUint = 2047u

public val STATX_ALL: CUint = 4095u

public val STATX_BTIME: CUint = 2048u

public val STATX_MNT_ID: CUint = 4096u

public val STATX_DIOALIGN: CUint = 8192u

public val STATX__RESERVED: CUint = 2147483648u

public val STATX_ATTR_COMPRESSED: CUint = 4u

public val STATX_ATTR_IMMUTABLE: CUint = 16u

public val STATX_ATTR_APPEND: CUint = 32u

public val STATX_ATTR_NODUMP: CUint = 64u

public val STATX_ATTR_ENCRYPTED: CUint = 2048u

public val STATX_ATTR_AUTOMOUNT: CUint = 4096u

public val STATX_ATTR_MOUNT_ROOT: CUint = 8192u

public val STATX_ATTR_VERITY: CUint = 1048576u

public val STATX_ATTR_DAX: CUint = 2097152u

// sys/ioctl.h
public val TIOCM_LE: CInt = 1

public val TIOCM_DTR: CInt = 2

public val TIOCM_RTS: CInt = 4

public val TIOCM_ST: CInt = 8

public val TIOCM_SR: CInt = 16

public val TIOCM_CTS: CInt = 32

public val TIOCM_CAR: CInt = 64

public val TIOCM_CD: CInt = 64

public val TIOCM_RNG: CInt = 128

public val TIOCM_RI: CInt = 128

public val TIOCM_DSR: CInt = 256

public val TIOCPKT_DATA: CInt = 0

public val TIOCPKT_FLUSHREAD: CInt = 1

public val TIOCPKT_FLUSHWRITE: CInt = 2

public val TIOCPKT_STOP: CInt = 4

public val TIOCPKT_START: CInt = 8

public val TIOCPKT_NOSTOP: CInt = 16

public val TIOCPKT_DOSTOP: CInt = 32

public val TIOCPKT_IOCTL: CInt = 64

public val TTYDISC: CInt = 0

public val TABLDISC: CInt = 3

public val SLIPDISC: CInt = 4

public val TANDEM: io.github.kotlinmania.libc.TcflagT = 1u

public val CBREAK: io.github.kotlinmania.libc.TcflagT = 2u

public val LCASE: io.github.kotlinmania.libc.TcflagT = 4u

public val CRMOD: io.github.kotlinmania.libc.TcflagT = 16u

public val RAW: io.github.kotlinmania.libc.TcflagT = 32u

public val ODDP: io.github.kotlinmania.libc.TcflagT = 64u

public val EVENP: io.github.kotlinmania.libc.TcflagT = 128u

public val ANYP: io.github.kotlinmania.libc.TcflagT = 192u

public val NLDELAY: io.github.kotlinmania.libc.TcflagT = 768u

public val NL2: io.github.kotlinmania.libc.TcflagT = 512u

public val NL3: io.github.kotlinmania.libc.TcflagT = 768u

public val TBDELAY: io.github.kotlinmania.libc.TcflagT = 3072u

public val XTABS: io.github.kotlinmania.libc.TcflagT = 3072u

public val CRDELAY: io.github.kotlinmania.libc.TcflagT = 12288u

public val VTDELAY: io.github.kotlinmania.libc.TcflagT = 16384u

public val BSDELAY: io.github.kotlinmania.libc.TcflagT = 32768u

public val ALLDELAY: io.github.kotlinmania.libc.TcflagT = 65280u

public val CRTBS: io.github.kotlinmania.libc.TcflagT = 65536u

public val PRTERA: io.github.kotlinmania.libc.TcflagT = 131072u

public val CRTERA: io.github.kotlinmania.libc.TcflagT = 262144u

public val TILDE: io.github.kotlinmania.libc.TcflagT = 524288u

public val LITOUT: io.github.kotlinmania.libc.TcflagT = 2097152u

public val NOHANG: io.github.kotlinmania.libc.TcflagT = 16777216u

public val L001000: io.github.kotlinmania.libc.TcflagT = 33554432u

public val CRTKIL: io.github.kotlinmania.libc.TcflagT = 67108864u

public val PASS8: io.github.kotlinmania.libc.TcflagT = 134217728u

public val CTLECH: io.github.kotlinmania.libc.TcflagT = 268435456u

public val DECCTQ: io.github.kotlinmania.libc.TcflagT = 1073741824u

public val FIONBIO: CUlong = 0xa008007euL

public val FIONREAD: CUlong = 0x6008007fuL

public val TIOCSWINSZ: CUlong = 0x90200767uL

public val TIOCGWINSZ: CUlong = 0x50200768uL

public val TIOCEXCL: CUlong = 0x70duL

public val TIOCNXCL: CUlong = 0x70euL

public val TIOCSCTTY: CUlong = 0x761uL

public val FIOCLEX: CUlong = 1uL

// fcntl.h
public val O_EXEC: CInt = 4

public val O_NORW: CInt = 0

public val O_RDONLY: CInt = 1

public val O_WRONLY: CInt = 2

public val O_RDWR: CInt = 3

public val O_ACCMODE: CInt = 3

public val O_LARGEFILE: CInt = 0

public val O_CREAT: CInt = 16

public val O_EXCL: CInt = 32

public val O_NOLINK: CInt = 64

public val O_NOTRANS: CInt = 128

public val O_NOFOLLOW: CInt = 1048576

public val O_DIRECTORY: CInt = 2097152

public val O_APPEND: CInt = 256

public val O_ASYNC: CInt = 512

public val O_FSYNC: CInt = 1024

public val O_SYNC: CInt = 1024

public val O_NOATIME: CInt = 2048

public val O_SHLOCK: CInt = 131072

public val O_EXLOCK: CInt = 262144

public val O_DSYNC: CInt = 1024

public val O_RSYNC: CInt = 1024

public val O_NONBLOCK: CInt = 8

public val O_NDELAY: CInt = 8

public val O_HURD: CInt = 458751

public val O_TRUNC: CInt = 65536

public val O_CLOEXEC: CInt = 4194304

public val O_IGNORE_CTTY: CInt = 524288

public val O_TMPFILE: CInt = 8388608

public val O_NOCTTY: CInt = 0

public val FREAD: CInt = 1

public val FWRITE: CInt = 2

public val FASYNC: CInt = 512

public val FCREAT: CInt = 16

public val FEXCL: CInt = 32

public val FTRUNC: CInt = 65536

public val FNOCTTY: CInt = 0

public val FFSYNC: CInt = 1024

public val FSYNC: CInt = 1024

public val FAPPEND: CInt = 256

public val FNONBLOCK: CInt = 8

public val FNDELAY: CInt = 8

public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETOWN: CInt = 5

public val F_SETOWN: CInt = 6

public val F_GETLK: CInt = 7

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val F_GETLK64: CInt = 10

public val F_SETLK64: CInt = 11

public val F_SETLKW64: CInt = 12

public val F_DUPFD_CLOEXEC: CInt = 1030

public val FD_CLOEXEC: CInt = 1

public val F_RDLCK: CInt = 1

public val F_WRLCK: CInt = 2

public val F_UNLCK: CInt = 3

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_RANDOM: CInt = 1

public val POSIX_FADV_SEQUENTIAL: CInt = 2

public val POSIX_FADV_WILLNEED: CInt = 3

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val AT_FDCWD: CInt = -100

public val AT_SYMLINK_NOFOLLOW: CInt = 256

public val AT_REMOVEDIR: CInt = 512

public val AT_SYMLINK_FOLLOW: CInt = 1024

public val AT_NO_AUTOMOUNT: CInt = 2048

public val AT_EMPTY_PATH: CInt = 4096

public val AT_STATX_SYNC_TYPE: CInt = 24576

public val AT_STATX_SYNC_AS_STAT: CInt = 0

public val AT_STATX_FORCE_SYNC: CInt = 8192

public val AT_STATX_DONT_SYNC: CInt = 16384

public val AT_RECURSIVE: CInt = 32768

public val AT_EACCESS: CInt = 512

// sys/uio.h
public val RWF_HIPRI: CInt = 1

public val RWF_DSYNC: CInt = 2

public val RWF_SYNC: CInt = 4

public val RWF_NOWAIT: CInt = 8

public val RWF_APPEND: CInt = 16

// errno.h
public val EPERM: CInt = 1073741825

public val ENOENT: CInt = 1073741826

public val ESRCH: CInt = 1073741827

public val EINTR: CInt = 1073741828

public val EIO: CInt = 1073741829

public val ENXIO: CInt = 1073741830

public val E2BIG: CInt = 1073741831

public val ENOEXEC: CInt = 1073741832

public val EBADF: CInt = 1073741833

public val ECHILD: CInt = 1073741834

public val EDEADLK: CInt = 1073741835

public val ENOMEM: CInt = 1073741836

public val EACCES: CInt = 1073741837

public val EFAULT: CInt = 1073741838

public val ENOTBLK: CInt = 1073741839

public val EBUSY: CInt = 1073741840

public val EEXIST: CInt = 1073741841

public val EXDEV: CInt = 1073741842

public val ENODEV: CInt = 1073741843

public val ENOTDIR: CInt = 1073741844

public val EISDIR: CInt = 1073741845

public val EINVAL: CInt = 1073741846

public val EMFILE: CInt = 1073741848

public val ENFILE: CInt = 1073741847

public val ENOTTY: CInt = 1073741849

public val ETXTBSY: CInt = 1073741850

public val EFBIG: CInt = 1073741851

public val ENOSPC: CInt = 1073741852

public val ESPIPE: CInt = 1073741853

public val EROFS: CInt = 1073741854

public val EMLINK: CInt = 1073741855

public val EPIPE: CInt = 1073741856

public val EDOM: CInt = 1073741857

public val ERANGE: CInt = 1073741858

public val EAGAIN: CInt = 1073741859

public val EWOULDBLOCK: CInt = 1073741859

public val EINPROGRESS: CInt = 1073741860

public val EALREADY: CInt = 1073741861

public val ENOTSOCK: CInt = 1073741862

public val EMSGSIZE: CInt = 1073741864

public val EPROTOTYPE: CInt = 1073741865

public val ENOPROTOOPT: CInt = 1073741866

public val EPROTONOSUPPORT: CInt = 1073741867

public val ESOCKTNOSUPPORT: CInt = 1073741868

public val EOPNOTSUPP: CInt = 1073741869

public val EPFNOSUPPORT: CInt = 1073741870

public val EAFNOSUPPORT: CInt = 1073741871

public val EADDRINUSE: CInt = 1073741872

public val EADDRNOTAVAIL: CInt = 1073741873

public val ENETDOWN: CInt = 1073741874

public val ENETUNREACH: CInt = 1073741875

public val ENETRESET: CInt = 1073741876

public val ECONNABORTED: CInt = 1073741877

public val ECONNRESET: CInt = 1073741878

public val ENOBUFS: CInt = 1073741879

public val EISCONN: CInt = 1073741880

public val ENOTCONN: CInt = 1073741881

public val EDESTADDRREQ: CInt = 1073741863

public val ESHUTDOWN: CInt = 1073741882

public val ETOOMANYREFS: CInt = 1073741883

public val ETIMEDOUT: CInt = 1073741884

public val ECONNREFUSED: CInt = 1073741885

public val ELOOP: CInt = 1073741886

public val ENAMETOOLONG: CInt = 1073741887

public val EHOSTDOWN: CInt = 1073741888

public val EHOSTUNREACH: CInt = 1073741889

public val ENOTEMPTY: CInt = 1073741890

public val EPROCLIM: CInt = 1073741891

public val EUSERS: CInt = 1073741892

public val EDQUOT: CInt = 1073741893

public val ESTALE: CInt = 1073741894

public val EREMOTE: CInt = 1073741895

public val EBADRPC: CInt = 1073741896

public val ERPCMISMATCH: CInt = 1073741897

public val EPROGUNAVAIL: CInt = 1073741898

public val EPROGMISMATCH: CInt = 1073741899

public val EPROCUNAVAIL: CInt = 1073741900

public val ENOLCK: CInt = 1073741901

public val EFTYPE: CInt = 1073741903

public val EAUTH: CInt = 1073741904

public val ENEEDAUTH: CInt = 1073741905

public val ENOSYS: CInt = 1073741902

public val ELIBEXEC: CInt = 1073741907

public val ENOTSUP: CInt = 1073741942

public val EILSEQ: CInt = 1073741930

public val EBACKGROUND: CInt = 1073741924

public val EDIED: CInt = 1073741925

public val EGREGIOUS: CInt = 1073741927

public val EIEIO: CInt = 1073741928

public val EGRATUITOUS: CInt = 1073741929

public val EBADMSG: CInt = 1073741931

public val EIDRM: CInt = 1073741932

public val EMULTIHOP: CInt = 1073741933

public val ENODATA: CInt = 1073741934

public val ENOLINK: CInt = 1073741935

public val ENOMSG: CInt = 1073741936

public val ENOSR: CInt = 1073741937

public val ENOSTR: CInt = 1073741938

public val EOVERFLOW: CInt = 1073741939

public val EPROTO: CInt = 1073741940

public val ETIME: CInt = 1073741941

public val ECANCELED: CInt = 1073741943

public val EOWNERDEAD: CInt = 1073741944

public val ENOTRECOVERABLE: CInt = 1073741945

public val EMACH_SEND_IN_PROGRESS: CInt = 268435457

public val EMACH_SEND_INVALID_DATA: CInt = 268435458

public val EMACH_SEND_INVALID_DEST: CInt = 268435459

public val EMACH_SEND_TIMED_OUT: CInt = 268435460

public val EMACH_SEND_WILL_NOTIFY: CInt = 268435461

public val EMACH_SEND_NOTIFY_IN_PROGRESS: CInt = 268435462

public val EMACH_SEND_INTERRUPTED: CInt = 268435463

public val EMACH_SEND_MSG_TOO_SMALL: CInt = 268435464

public val EMACH_SEND_INVALID_REPLY: CInt = 268435465

public val EMACH_SEND_INVALID_RIGHT: CInt = 268435466

public val EMACH_SEND_INVALID_NOTIFY: CInt = 268435467

public val EMACH_SEND_INVALID_MEMORY: CInt = 268435468

public val EMACH_SEND_NO_BUFFER: CInt = 268435469

public val EMACH_SEND_NO_NOTIFY: CInt = 268435470

public val EMACH_SEND_INVALID_TYPE: CInt = 268435471

public val EMACH_SEND_INVALID_HEADER: CInt = 268435472

public val EMACH_RCV_IN_PROGRESS: CInt = 268451841

public val EMACH_RCV_INVALID_NAME: CInt = 268451842

public val EMACH_RCV_TIMED_OUT: CInt = 268451843

public val EMACH_RCV_TOO_LARGE: CInt = 268451844

public val EMACH_RCV_INTERRUPTED: CInt = 268451845

public val EMACH_RCV_PORT_CHANGED: CInt = 268451846

public val EMACH_RCV_INVALID_NOTIFY: CInt = 268451847

public val EMACH_RCV_INVALID_DATA: CInt = 268451848

public val EMACH_RCV_PORT_DIED: CInt = 268451849

public val EMACH_RCV_IN_SET: CInt = 268451850

public val EMACH_RCV_HEADER_ERROR: CInt = 268451851

public val EMACH_RCV_BODY_ERROR: CInt = 268451852

public val EKERN_INVALID_ADDRESS: CInt = 1

public val EKERN_PROTECTION_FAILURE: CInt = 2

public val EKERN_NO_SPACE: CInt = 3

public val EKERN_INVALID_ARGUMENT: CInt = 4

public val EKERN_FAILURE: CInt = 5

public val EKERN_RESOURCE_SHORTAGE: CInt = 6

public val EKERN_NOT_RECEIVER: CInt = 7

public val EKERN_NO_ACCESS: CInt = 8

public val EKERN_MEMORY_FAILURE: CInt = 9

public val EKERN_MEMORY_ERROR: CInt = 10

public val EKERN_NOT_IN_SET: CInt = 12

public val EKERN_NAME_EXISTS: CInt = 13

public val EKERN_ABORTED: CInt = 14

public val EKERN_INVALID_NAME: CInt = 15

public val EKERN_INVALID_TASK: CInt = 16

public val EKERN_INVALID_RIGHT: CInt = 17

public val EKERN_INVALID_VALUE: CInt = 18

public val EKERN_UREFS_OVERFLOW: CInt = 19

public val EKERN_INVALID_CAPABILITY: CInt = 20

public val EKERN_RIGHT_EXISTS: CInt = 21

public val EKERN_INVALID_HOST: CInt = 22

public val EKERN_MEMORY_PRESENT: CInt = 23

public val EKERN_WRITE_PROTECTION_FAILURE: CInt = 24

public val EKERN_TERMINATED: CInt = 26

public val EKERN_TIMEDOUT: CInt = 27

public val EKERN_INTERRUPTED: CInt = 28

public val EMIG_TYPE_ERROR: CInt = -300

public val EMIG_REPLY_MISMATCH: CInt = -301

public val EMIG_REMOTE_ERROR: CInt = -302

public val EMIG_BAD_ID: CInt = -303

public val EMIG_BAD_ARGUMENTS: CInt = -304

public val EMIG_NO_REPLY: CInt = -305

public val EMIG_EXCEPTION: CInt = -306

public val EMIG_ARRAY_TOO_LARGE: CInt = -307

public val EMIG_SERVER_DIED: CInt = -308

public val EMIG_DESTROY_REQUEST: CInt = -309

public val ED_IO_ERROR: CInt = 2500

public val ED_WOULD_BLOCK: CInt = 2501

public val ED_NO_SUCH_DEVICE: CInt = 2502

public val ED_ALREADY_OPEN: CInt = 2503

public val ED_DEVICE_DOWN: CInt = 2504

public val ED_INVALID_OPERATION: CInt = 2505

public val ED_INVALID_RECNUM: CInt = 2506

public val ED_INVALID_SIZE: CInt = 2507

public val ED_NO_MEMORY: CInt = 2508

public val ED_READ_ONLY: CInt = 2509

public val HURD_ERRNOS: Int = 122

// sched.h
public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val BITS_TYPES_STRUCT_SCHED_PARAM: Int = 1

public val CPU_SETSIZE: Int = 1024

public val CPU_SETSIZE1: Int = 1024

// pthread.h
public val PTHREAD_SPINLOCK_INITIALIZER: CInt = 0

public val PTHREAD_CANCEL_DISABLE: CInt = 0

public val PTHREAD_CANCEL_ENABLE: CInt = 1

public val PTHREAD_CANCEL_DEFERRED: CInt = 0

public val PTHREAD_CANCEL_ASYNCHRONOUS: CInt = 1

public val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1

// netinet/tcp.h
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

public val TCP_MD5SIG: CInt = 14

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

public val TCP_NOTSENT_LOWAT: CInt = 25

public val TCP_CC_INFO: CInt = 26

public val TCP_SAVE_SYN: CInt = 27

public val TCP_SAVED_SYN: CInt = 28

public val TCP_REPAIR_WINDOW: CInt = 29

public val TCP_FASTOPEN_CONNECT: CInt = 30

public val TCP_ULP: CInt = 31

public val TCP_MD5SIG_EXT: CInt = 32

public val TCP_FASTOPEN_KEY: CInt = 33

public val TCP_FASTOPEN_NO_COOKIE: CInt = 34

public val TCP_ZEROCOPY_RECEIVE: CInt = 35

public val TCP_INQ: CInt = 36

public val TCP_CM_INQ: CInt = 36

public val TCP_TX_DELAY: CInt = 37

public val TCP_REPAIR_ON: CInt = 1

public val TCP_REPAIR_OFF: CInt = 0

public val TCP_REPAIR_OFF_NO_WP: CInt = -1

// stdint.h
public val INT8_MIN: Byte = -128

public val INT16_MIN: Short = -32768

public val INT32_MIN: Int = -2147483648

public val INT8_MAX: Byte = 127

public val INT16_MAX: Short = 32767

public val INT32_MAX: Int = 2147483647

public val UINT8_MAX: UByte = 255u

public val UINT16_MAX: UShort = 65535u

public val UINT32_MAX: UInt = 4294967295u

public val INT_LEAST8_MIN: IntLeast8T = -128

public val INT_LEAST16_MIN: IntLeast16T = -32768

public val INT_LEAST32_MIN: IntLeast32T = -2147483648

public val INT_LEAST8_MAX: IntLeast8T = 127

public val INT_LEAST16_MAX: IntLeast16T = 32767

public val INT_LEAST32_MAX: IntLeast32T = 2147483647

public val UINT_LEAST8_MAX: UintLeast8T = 255u

public val UINT_LEAST16_MAX: UintLeast16T = 65535u

public val UINT_LEAST32_MAX: UintLeast32T = 4294967295u

public val INT_FAST8_MIN: IntFast8T = -128

public val INT_FAST16_MIN: IntFast16T = -2147483648

public val INT_FAST32_MIN: IntFast32T = -2147483648

public val INT_FAST8_MAX: IntFast8T = 127

public val INT_FAST16_MAX: IntFast16T = 2147483647

public val INT_FAST32_MAX: IntFast32T = 2147483647

public val UINT_FAST8_MAX: UintFast8T = 255u

public val UINT_FAST16_MAX: UintFast16T = 4294967295

public val UINT_FAST32_MAX: UintFast32T = 4294967295

public val INTPTR_MIN: IntptrT = -2147483648L

public val INTPTR_MAX: IntptrT = 2147483647L

public val UINTPTR_MAX: Int = 4294967295

public val PTRDIFF_MIN: PtrdiffT = -2147483648L

public val PTRDIFF_MAX: PtrdiffT = 2147483647L

public val SIG_ATOMIC_MIN: SigAtomicT = -2147483648

public val SIG_ATOMIC_MAX: SigAtomicT = 2147483647

public val SIZE_MAX: Int = 4294967295

public val WINT_MIN: WintT = 0u

public val WINT_MAX: WintT = 4294967295u

public val INT8_WIDTH: Int = 8

public val UINT8_WIDTH: Int = 8

public val INT16_WIDTH: Int = 16

public val UINT16_WIDTH: Int = 16

public val INT32_WIDTH: Int = 32

public val UINT32_WIDTH: Int = 32

public val INT64_WIDTH: Int = 64

public val UINT64_WIDTH: Int = 64

public val INT_LEAST8_WIDTH: Int = 8

public val UINT_LEAST8_WIDTH: Int = 8

public val INT_LEAST16_WIDTH: Int = 16

public val UINT_LEAST16_WIDTH: Int = 16

public val INT_LEAST32_WIDTH: Int = 32

public val UINT_LEAST32_WIDTH: Int = 32

public val INT_LEAST64_WIDTH: Int = 64

public val UINT_LEAST64_WIDTH: Int = 64

public val INT_FAST8_WIDTH: Int = 8

public val UINT_FAST8_WIDTH: Int = 8

public val INT_FAST16_WIDTH: Int = 32

public val UINT_FAST16_WIDTH: Int = 32

public val INT_FAST32_WIDTH: Int = 32

public val UINT_FAST32_WIDTH: Int = 32

public val INT_FAST64_WIDTH: Int = 64

public val UINT_FAST64_WIDTH: Int = 64

public val INTPTR_WIDTH: Int = 32

public val UINTPTR_WIDTH: Int = 32

public val INTMAX_WIDTH: Int = 64

public val UINTMAX_WIDTH: Int = 64

public val PTRDIFF_WIDTH: Int = 32

public val SIG_ATOMIC_WIDTH: Int = 32

public val SIZE_WIDTH: Int = 32

public val WCHAR_WIDTH: Int = 32

public val WINT_WIDTH: Int = 32

public val TH_FIN: UByte = 1u

public val TH_SYN: UByte = 2u

public val TH_RST: UByte = 4u

public val TH_PUSH: UByte = 8u

public val TH_ACK: UByte = 16u

public val TH_URG: UByte = 32u

public val TCPOPT_EOL: UByte = 0u

public val TCPOPT_NOP: UByte = 1u

public val TCPOPT_MAXSEG: UByte = 2u

public val TCPOLEN_MAXSEG: UByte = 4u

public val TCPOPT_WINDOW: UByte = 3u

public val TCPOLEN_WINDOW: UByte = 3u

public val TCPOPT_SACK_PERMITTED: UByte = 4u

public val TCPOLEN_SACK_PERMITTED: UByte = 2u

public val TCPOPT_SACK: UByte = 5u

public val TCPOPT_TIMESTAMP: UByte = 8u

public val TCPOLEN_TIMESTAMP: UByte = 10u

public val TCPOLEN_TSTAMP_APPA: UByte = 12u

public val TCPOPT_TSTAMP_HDR: UInt = 16844810u

public val TCP_MSS: Int = 512

public val TCP_MAXWIN: Int = 65535

public val TCP_MAX_WINSHIFT: Int = 14

public val TCPI_OPT_TIMESTAMPS: UByte = 1u

public val TCPI_OPT_SACK: UByte = 2u

public val TCPI_OPT_WSCALE: UByte = 4u

public val TCPI_OPT_ECN: UByte = 8u

public val TCPI_OPT_ECN_SEEN: UByte = 16u

public val TCPI_OPT_SYN_DATA: UByte = 32u

public val TCP_MD5SIG_MAXKEYLEN: Int = 80

public val TCP_MD5SIG_FLAG_PREFIX: Int = 1

public val TCP_COOKIE_MIN: Int = 8

public val TCP_COOKIE_MAX: Int = 16

public val TCP_COOKIE_PAIR_SIZE: Int = 32

public val TCP_COOKIE_IN_ALWAYS: CInt = 1

public val TCP_COOKIE_OUT_NEVER: CInt = 2

public val TCP_S_DATA_IN: CInt = 4

public val TCP_S_DATA_OUT: CInt = 8

public val TCP_MSS_DEFAULT: Int = 536

public val TCP_MSS_DESIRED: Int = 1220

// sys/wait.h
public val WCOREFLAG1: CInt = 128

public val WAIT_ANY: PidT = -1

public val WAIT_MYPGRP: PidT = 0

// sys/file.h
public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_UN: CInt = 8

public val LOCK_NB: CInt = 4

// sys/mman.h
public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 4

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 1

public val MAP_FILE: CInt = 1

public val MAP_ANON: CInt = 2

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val MAP_TYPE: CInt = 15

public val MAP_COPY: CInt = 32

public val MAP_SHARED: CInt = 16

public val MAP_PRIVATE: CInt = 0

public val MAP_FIXED: CInt = 256

public val MAP_NOEXTEND: CInt = 512

public val MAP_HASSEMAPHORE: CInt = 1024

public val MAP_INHERIT: CInt = 2048

public val MAP_32BIT: CInt = 4096

public val MAP_EXCL: CInt = 16384

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_WONTNEED: CInt = 4

public val MS_ASYNC: CInt = 1

public val MS_SYNC: CInt = 0

public val MS_INVALIDATE: CInt = 2

public val MREMAP_MAYMOVE: CInt = 1

public val MREMAP_FIXED: CInt = 2

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

// sys/xattr.h
public val XATTR_CREATE: CInt = 0x1

public val XATTR_REPLACE: CInt = 0x2

// spawn.h
public val POSIX_SPAWN_USEVFORK: CInt = 64

public val POSIX_SPAWN_SETSID: CInt = 128

// sys/syslog.h
public val LOG_CRON: CInt = 9 shl 3

public val LOG_AUTHPRIV: CInt = 10 shl 3

public val LOG_FTP: CInt = 11 shl 3

public val LOG_PERROR: CInt = 0x20

// net/if.h
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

// random.h
public val GRND_NONBLOCK: CUint = 1u

public val GRND_RANDOM: CUint = 2u

public val GRND_INSECURE: CUint = 4u

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

public val SC_PAGE_SIZE: CInt = 30

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

public val SC_EQUIV_CLASS_MAX: CInt = 41

public val SC_EXPR_NEST_MAX: CInt = 42

public val SC_LINE_MAX: CInt = 43

public val SC_RE_DUP_MAX: CInt = 44

public val SC_CHARCLASS_NAME_MAX: CInt = 45

public val SC_2_VERSION: CInt = 46

public val SC_2_C_BIND: CInt = 47

public val SC_2_C_DEV: CInt = 48

public val SC_2_FORT_DEV: CInt = 49

public val SC_2_FORT_RUN: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_LOCALEDEF: CInt = 52

public val SC_PII: CInt = 53

public val SC_PII_XTI: CInt = 54

public val SC_PII_SOCKET: CInt = 55

public val SC_PII_INTERNET: CInt = 56

public val SC_PII_OSI: CInt = 57

public val SC_POLL: CInt = 58

public val SC_SELECT: CInt = 59

public val SC_UIO_MAXIOV: CInt = 60

public val SC_IOV_MAX: CInt = 60

public val SC_PII_INTERNET_STREAM: CInt = 61

public val SC_PII_INTERNET_DGRAM: CInt = 62

public val SC_PII_OSI_COTS: CInt = 63

public val SC_PII_OSI_CLTS: CInt = 64

public val SC_PII_OSI_M: CInt = 65

public val SC_T_IOV_MAX: CInt = 66

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

public val SC_2_C_VERSION: CInt = 96

public val SC_2_UPE: CInt = 97

public val SC_XOPEN_XPG2: CInt = 98

public val SC_XOPEN_XPG3: CInt = 99

public val SC_XOPEN_XPG4: CInt = 100

public val SC_CHAR_BIT: CInt = 101

public val SC_CHAR_MAX: CInt = 102

public val SC_CHAR_MIN: CInt = 103

public val SC_INT_MAX: CInt = 104

public val SC_INT_MIN: CInt = 105

public val SC_LONG_BIT: CInt = 106

public val SC_WORD_BIT: CInt = 107

public val SC_MB_LEN_MAX: CInt = 108

public val SC_NZERO: CInt = 109

public val SC_SSIZE_MAX: CInt = 110

public val SC_SCHAR_MAX: CInt = 111

public val SC_SCHAR_MIN: CInt = 112

public val SC_SHRT_MAX: CInt = 113

public val SC_SHRT_MIN: CInt = 114

public val SC_UCHAR_MAX: CInt = 115

public val SC_UINT_MAX: CInt = 116

public val SC_ULONG_MAX: CInt = 117

public val SC_USHRT_MAX: CInt = 118

public val SC_NL_ARGMAX: CInt = 119

public val SC_NL_LANGMAX: CInt = 120

public val SC_NL_MSGMAX: CInt = 121

public val SC_NL_NMAX: CInt = 122

public val SC_NL_SETMAX: CInt = 123

public val SC_NL_TEXTMAX: CInt = 124

public val SC_XBS5_ILP32_OFF32: CInt = 125

public val SC_XBS5_ILP32_OFFBIG: CInt = 126

public val SC_XBS5_LP64_OFF64: CInt = 127

public val SC_XBS5_LPBIG_OFFBIG: CInt = 128

public val SC_XOPEN_LEGACY: CInt = 129

public val SC_XOPEN_REALTIME: CInt = 130

public val SC_XOPEN_REALTIME_THREADS: CInt = 131

public val SC_ADVISORY_INFO: CInt = 132

public val SC_BARRIERS: CInt = 133

public val SC_BASE: CInt = 134

public val SC_C_LANG_SUPPORT: CInt = 135

public val SC_C_LANG_SUPPORT_R: CInt = 136

public val SC_CLOCK_SELECTION: CInt = 137

public val SC_CPUTIME: CInt = 138

public val SC_THREAD_CPUTIME: CInt = 139

public val SC_DEVICE_IO: CInt = 140

public val SC_DEVICE_SPECIFIC: CInt = 141

public val SC_DEVICE_SPECIFIC_R: CInt = 142

public val SC_FD_MGMT: CInt = 143

public val SC_FIFO: CInt = 144

public val SC_PIPE: CInt = 145

public val SC_FILE_ATTRIBUTES: CInt = 146

public val SC_FILE_LOCKING: CInt = 147

public val SC_FILE_SYSTEM: CInt = 148

public val SC_MONOTONIC_CLOCK: CInt = 149

public val SC_MULTI_PROCESS: CInt = 150

public val SC_SINGLE_PROCESS: CInt = 151

public val SC_NETWORKING: CInt = 152

public val SC_READER_WRITER_LOCKS: CInt = 153

public val SC_SPIN_LOCKS: CInt = 154

public val SC_REGEXP: CInt = 155

public val SC_REGEX_VERSION: CInt = 156

public val SC_SHELL: CInt = 157

public val SC_SIGNALS: CInt = 158

public val SC_SPAWN: CInt = 159

public val SC_SPORADIC_SERVER: CInt = 160

public val SC_THREAD_SPORADIC_SERVER: CInt = 161

public val SC_SYSTEM_DATABASE: CInt = 162

public val SC_SYSTEM_DATABASE_R: CInt = 163

public val SC_TIMEOUTS: CInt = 164

public val SC_TYPED_MEMORY_OBJECTS: CInt = 165

public val SC_USER_GROUPS: CInt = 166

public val SC_USER_GROUPS_R: CInt = 167

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

public val SC_LEVEL1_ICACHE_SIZE: CInt = 185

public val SC_LEVEL1_ICACHE_ASSOC: CInt = 186

public val SC_LEVEL1_ICACHE_LINESIZE: CInt = 187

public val SC_LEVEL1_DCACHE_SIZE: CInt = 188

public val SC_LEVEL1_DCACHE_ASSOC: CInt = 189

public val SC_LEVEL1_DCACHE_LINESIZE: CInt = 190

public val SC_LEVEL2_CACHE_SIZE: CInt = 191

public val SC_LEVEL2_CACHE_ASSOC: CInt = 192

public val SC_LEVEL2_CACHE_LINESIZE: CInt = 193

public val SC_LEVEL3_CACHE_SIZE: CInt = 194

public val SC_LEVEL3_CACHE_ASSOC: CInt = 195

public val SC_LEVEL3_CACHE_LINESIZE: CInt = 196

public val SC_LEVEL4_CACHE_SIZE: CInt = 197

public val SC_LEVEL4_CACHE_ASSOC: CInt = 198

public val SC_LEVEL4_CACHE_LINESIZE: CInt = 199

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

public val SC_MINSIGSTKSZ: CInt = 249

public val SC_SIGSTKSZ: CInt = 250

public val CS_PATH: CInt = 0

public val CS_V6_WIDTH_RESTRICTED_ENVS: CInt = 1

public val CS_GNU_LIBC_VERSION: CInt = 2

public val CS_GNU_LIBPTHREAD_VERSION: CInt = 3

public val CS_V5_WIDTH_RESTRICTED_ENVS: CInt = 4

public val CS_V7_WIDTH_RESTRICTED_ENVS: CInt = 5

public val CS_LFS_CFLAGS: CInt = 1000

public val CS_LFS_LDFLAGS: CInt = 1001

public val CS_LFS_LIBS: CInt = 1002

public val CS_LFS_LINTFLAGS: CInt = 1003

public val CS_LFS64_CFLAGS: CInt = 1004

public val CS_LFS64_LDFLAGS: CInt = 1005

public val CS_LFS64_LIBS: CInt = 1006

public val CS_LFS64_LINTFLAGS: CInt = 1007

public val CS_XBS5_ILP32_OFF32_CFLAGS: CInt = 1100

public val CS_XBS5_ILP32_OFF32_LDFLAGS: CInt = 1101

public val CS_XBS5_ILP32_OFF32_LIBS: CInt = 1102

public val CS_XBS5_ILP32_OFF32_LINTFLAGS: CInt = 1103

public val CS_XBS5_ILP32_OFFBIG_CFLAGS: CInt = 1104

public val CS_XBS5_ILP32_OFFBIG_LDFLAGS: CInt = 1105

public val CS_XBS5_ILP32_OFFBIG_LIBS: CInt = 1106

public val CS_XBS5_ILP32_OFFBIG_LINTFLAGS: CInt = 1107

public val CS_XBS5_LP64_OFF64_CFLAGS: CInt = 1108

public val CS_XBS5_LP64_OFF64_LDFLAGS: CInt = 1109

public val CS_XBS5_LP64_OFF64_LIBS: CInt = 1110

public val CS_XBS5_LP64_OFF64_LINTFLAGS: CInt = 1111

public val CS_XBS5_LPBIG_OFFBIG_CFLAGS: CInt = 1112

public val CS_XBS5_LPBIG_OFFBIG_LDFLAGS: CInt = 1113

public val CS_XBS5_LPBIG_OFFBIG_LIBS: CInt = 1114

public val CS_XBS5_LPBIG_OFFBIG_LINTFLAGS: CInt = 1115

public val CS_POSIX_V6_ILP32_OFF32_CFLAGS: CInt = 1116

public val CS_POSIX_V6_ILP32_OFF32_LDFLAGS: CInt = 1117

public val CS_POSIX_V6_ILP32_OFF32_LIBS: CInt = 1118

public val CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: CInt = 1119

public val CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: CInt = 1120

public val CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: CInt = 1121

public val CS_POSIX_V6_ILP32_OFFBIG_LIBS: CInt = 1122

public val CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: CInt = 1123

public val CS_POSIX_V6_LP64_OFF64_CFLAGS: CInt = 1124

public val CS_POSIX_V6_LP64_OFF64_LDFLAGS: CInt = 1125

public val CS_POSIX_V6_LP64_OFF64_LIBS: CInt = 1126

public val CS_POSIX_V6_LP64_OFF64_LINTFLAGS: CInt = 1127

public val CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: CInt = 1128

public val CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: CInt = 1129

public val CS_POSIX_V6_LPBIG_OFFBIG_LIBS: CInt = 1130

public val CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: CInt = 1131

public val CS_POSIX_V7_ILP32_OFF32_CFLAGS: CInt = 1132

public val CS_POSIX_V7_ILP32_OFF32_LDFLAGS: CInt = 1133

public val CS_POSIX_V7_ILP32_OFF32_LIBS: CInt = 1134

public val CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: CInt = 1135

public val CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: CInt = 1136

public val CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: CInt = 1137

public val CS_POSIX_V7_ILP32_OFFBIG_LIBS: CInt = 1138

public val CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: CInt = 1139

public val CS_POSIX_V7_LP64_OFF64_CFLAGS: CInt = 1140

public val CS_POSIX_V7_LP64_OFF64_LDFLAGS: CInt = 1141

public val CS_POSIX_V7_LP64_OFF64_LIBS: CInt = 1142

public val CS_POSIX_V7_LP64_OFF64_LINTFLAGS: CInt = 1143

public val CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: CInt = 1144

public val CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: CInt = 1145

public val CS_POSIX_V7_LPBIG_OFFBIG_LIBS: CInt = 1146

public val CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: CInt = 1147

public val CS_V6_ENV: CInt = 1148

public val CS_V7_ENV: CInt = 1149

public val PTHREAD_PROCESS_PRIVATE: PthreadProcessShared = 0u

public val PTHREAD_PROCESS_SHARED: PthreadProcessShared = 1u

public val PTHREAD_EXPLICIT_SCHED: PthreadInheritsched = 0u

public val PTHREAD_INHERIT_SCHED: PthreadInheritsched = 1u

public val PTHREAD_SCOPE_SYSTEM: PthreadContentionscope = 0u

public val PTHREAD_SCOPE_PROCESS: PthreadContentionscope = 1u

public val PTHREAD_CREATE_JOINABLE: PthreadDetachstate = 0u

public val PTHREAD_CREATE_DETACHED: PthreadDetachstate = 1u

public val PTHREAD_PRIO_NONE: PthreadMutexProtocol = 0u

public val PTHREAD_PRIO_INHERIT: PthreadMutexProtocol = 1u

public val PTHREAD_PRIO_PROTECT: PthreadMutexProtocol = 2u

public val PTHREAD_MUTEX_TIMED: PthreadMutexType = 0u

public val PTHREAD_MUTEX_ERRORCHECK: PthreadMutexType = 1u

public val PTHREAD_MUTEX_RECURSIVE: PthreadMutexType = 2u

public val PTHREAD_MUTEX_STALLED: PthreadMutexRobustness = 0u

public val PTHREAD_MUTEX_ROBUST: PthreadMutexRobustness = 256u

public val RLIMIT_CPU: io.github.kotlinmania.libc.RlimitResourceT = 0u

public val RLIMIT_FSIZE: io.github.kotlinmania.libc.RlimitResourceT = 1u

public val RLIMIT_DATA: io.github.kotlinmania.libc.RlimitResourceT = 2u

public val RLIMIT_STACK: io.github.kotlinmania.libc.RlimitResourceT = 3u

public val RLIMIT_CORE: io.github.kotlinmania.libc.RlimitResourceT = 4u

public val RLIMIT_RSS: io.github.kotlinmania.libc.RlimitResourceT = 5u

public val RLIMIT_MEMLOCK: io.github.kotlinmania.libc.RlimitResourceT = 6u

public val RLIMIT_NPROC: io.github.kotlinmania.libc.RlimitResourceT = 7u

public val RLIMIT_OFILE: io.github.kotlinmania.libc.RlimitResourceT = 8u

public val RLIMIT_NOFILE: io.github.kotlinmania.libc.RlimitResourceT = 8u

public val RLIMIT_SBSIZE: io.github.kotlinmania.libc.RlimitResourceT = 9u

public val RLIMIT_AS: io.github.kotlinmania.libc.RlimitResourceT = 10u

public val RLIMIT_VMEM: io.github.kotlinmania.libc.RlimitResourceT = 10u

public val RLIMIT_NLIMITS: io.github.kotlinmania.libc.RlimitResourceT = 11u

public val RLIM_NLIMITS: io.github.kotlinmania.libc.RlimitResourceT = 11u

public val RUSAGE_SELF: RusageWho = 0

public val RUSAGE_CHILDREN: RusageWho = -1

public val PRIO_PROCESS: PriorityWhich = 0u

public val PRIO_PGRP: PriorityWhich = 1u

public val PRIO_USER: PriorityWhich = 2u

public val UT_LINESIZE: Int = 32

public val UT_NAMESIZE: Int = 32

public val UT_HOSTSIZE: Int = 256

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_CLOEXEC: CInt = 4194304

public val SOCK_NONBLOCK: CInt = 2048

public val MSG_OOB: CInt = 1

public val MSG_PEEK: CInt = 2

public val MSG_DONTROUTE: CInt = 4

public val MSG_EOR: CInt = 8

public val MSG_TRUNC: CInt = 16

public val MSG_CTRUNC: CInt = 32

public val MSG_WAITALL: CInt = 64

public val MSG_DONTWAIT: CInt = 128

public val MSG_NOSIGNAL: CInt = 1024

public val MSG_CMSG_CLOEXEC: CInt = 0x40000000

public val SCM_RIGHTS: CInt = 1

public val SCM_TIMESTAMP: CInt = 2

public val SCM_CREDS: CInt = 3

public val SO_DEBUG: CInt = 1

public val SO_ACCEPTCONN: CInt = 2

public val SO_REUSEADDR: CInt = 4

public val SO_KEEPALIVE: CInt = 8

public val SO_DONTROUTE: CInt = 16

public val SO_BROADCAST: CInt = 32

public val SO_USELOOPBACK: CInt = 64

public val SO_LINGER: CInt = 128

public val SO_OOBINLINE: CInt = 256

public val SO_REUSEPORT: CInt = 512

public val SO_SNDBUF: CInt = 4097

public val SO_RCVBUF: CInt = 4098

public val SO_SNDLOWAT: CInt = 4099

public val SO_RCVLOWAT: CInt = 4100

public val SO_SNDTIMEO: CInt = 4101

public val SO_RCVTIMEO: CInt = 4102

public val SO_ERROR: CInt = 4103

public val SO_STYLE: CInt = 4104

public val SO_TYPE: CInt = 4104

public val IPPROTO_IP: CInt = 0

public val IPPROTO_ICMP: CInt = 1

public val IPPROTO_IGMP: CInt = 2

public val IPPROTO_IPIP: CInt = 4

public val IPPROTO_TCP: CInt = 6

public val IPPROTO_EGP: CInt = 8

public val IPPROTO_PUP: CInt = 12

public val IPPROTO_UDP: CInt = 17

public val IPPROTO_IDP: CInt = 22

public val IPPROTO_TP: CInt = 29

public val IPPROTO_DCCP: CInt = 33

public val IPPROTO_IPV6: CInt = 41

public val IPPROTO_RSVP: CInt = 46

public val IPPROTO_GRE: CInt = 47

public val IPPROTO_ESP: CInt = 50

public val IPPROTO_AH: CInt = 51

public val IPPROTO_MTP: CInt = 92

public val IPPROTO_BEETPH: CInt = 94

public val IPPROTO_ENCAP: CInt = 98

public val IPPROTO_PIM: CInt = 103

public val IPPROTO_COMP: CInt = 108

public val IPPROTO_L2TP: CInt = 115

public val IPPROTO_SCTP: CInt = 132

public val IPPROTO_UDPLITE: CInt = 136

public val IPPROTO_MPLS: CInt = 137

public val IPPROTO_ETHERNET: CInt = 143

public val IPPROTO_RAW: CInt = 255

public val IPPROTO_MPTCP: CInt = 262

public val IPPROTO_MAX: CInt = 263

public val IPPROTO_HOPOPTS: CInt = 0

public val IPPROTO_ROUTING: CInt = 43

public val IPPROTO_FRAGMENT: CInt = 44

public val IPPROTO_ICMPV6: CInt = 58

public val IPPROTO_NONE: CInt = 59

public val IPPROTO_DSTOPTS: CInt = 60

public val IPPROTO_MH: CInt = 135

public val IPPORT_ECHO: InPortT = 7u

public val IPPORT_DISCARD: InPortT = 9u

public val IPPORT_SYSTAT: InPortT = 11u

public val IPPORT_DAYTIME: InPortT = 13u

public val IPPORT_NETSTAT: InPortT = 15u

public val IPPORT_FTP: InPortT = 21u

public val IPPORT_TELNET: InPortT = 23u

public val IPPORT_SMTP: InPortT = 25u

public val IPPORT_TIMESERVER: InPortT = 37u

public val IPPORT_NAMESERVER: InPortT = 42u

public val IPPORT_WHOIS: InPortT = 43u

public val IPPORT_MTP: InPortT = 57u

public val IPPORT_TFTP: InPortT = 69u

public val IPPORT_RJE: InPortT = 77u

public val IPPORT_FINGER: InPortT = 79u

public val IPPORT_TTYLINK: InPortT = 87u

public val IPPORT_SUPDUP: InPortT = 95u

public val IPPORT_EXECSERVER: InPortT = 512u

public val IPPORT_LOGINSERVER: InPortT = 513u

public val IPPORT_CMDSERVER: InPortT = 514u

public val IPPORT_EFSSERVER: InPortT = 520u

public val IPPORT_BIFFUDP: InPortT = 512u

public val IPPORT_WHOSERVER: InPortT = 513u

public val IPPORT_ROUTESERVER: InPortT = 520u

public val IPPORT_USERRESERVED: InPortT = 5000u

public val DT_UNKNOWN: CUchar = 0u

public val DT_FIFO: CUchar = 1u

public val DT_CHR: CUchar = 2u

public val DT_DIR: CUchar = 4u

public val DT_BLK: CUchar = 6u

public val DT_REG: CUchar = 8u

public val DT_LNK: CUchar = 10u

public val DT_SOCK: CUchar = 12u

public val DT_WHT: CUchar = 14u

public val ST_RDONLY: CUlong = 1uL

public val ST_NOSUID: CUlong = 2uL

public val ST_NOEXEC: CUlong = 8uL

public val ST_SYNCHRONOUS: CUlong = 16uL

public val ST_NOATIME: CUlong = 32uL

public val ST_RELATIME: CUlong = 64uL

public val RTLD_DI_LMID: CInt = 1

public val RTLD_DI_LINKMAP: CInt = 2

public val RTLD_DI_CONFIGADDR: CInt = 3

public val RTLD_DI_SERINFO: CInt = 4

public val RTLD_DI_SERINFOSIZE: CInt = 5

public val RTLD_DI_ORIGIN: CInt = 6

public val RTLD_DI_PROFILENAME: CInt = 7

public val RTLD_DI_PROFILEOUT: CInt = 8

public val RTLD_DI_TLS_MODID: CInt = 9

public val RTLD_DI_TLS_DATA: CInt = 10

public val RTLD_DI_PHDR: CInt = 11

public val RTLD_DI_MAX: CInt = 11

public val SI_ASYNCIO: CInt = -4

public val SI_MESGQ: CInt = -3

public val SI_TIMER: CInt = -2

public val SI_QUEUE: CInt = -1

public val SI_USER: CInt = 0

public val ILL_ILLOPC: CInt = 1

public val ILL_ILLOPN: CInt = 2

public val ILL_ILLADR: CInt = 3

public val ILL_ILLTRP: CInt = 4

public val ILL_PRVOPC: CInt = 5

public val ILL_PRVREG: CInt = 6

public val ILL_COPROC: CInt = 7

public val ILL_BADSTK: CInt = 8

public val FPE_INTDIV: CInt = 1

public val FPE_INTOVF: CInt = 2

public val FPE_FLTDIV: CInt = 3

public val FPE_FLTOVF: CInt = 4

public val FPE_FLTUND: CInt = 5

public val FPE_FLTRES: CInt = 6

public val FPE_FLTINV: CInt = 7

public val FPE_FLTSUB: CInt = 8

public val SEGV_MAPERR: CInt = 1

public val SEGV_ACCERR: CInt = 2

public val BUS_ADRALN: CInt = 1

public val BUS_ADRERR: CInt = 2

public val BUS_OBJERR: CInt = 3

public val TRAP_BRKPT: CInt = 1

public val TRAP_TRACE: CInt = 2

public val CLD_EXITED: CInt = 1

public val CLD_KILLED: CInt = 2

public val CLD_DUMPED: CInt = 3

public val CLD_TRAPPED: CInt = 4

public val CLD_STOPPED: CInt = 5

public val CLD_CONTINUED: CInt = 6

public val POLL_IN: CInt = 1

public val POLL_OUT: CInt = 2

public val POLL_MSG: CInt = 3

public val POLL_ERR: CInt = 4

public val POLL_PRI: CInt = 5

public val POLL_HUP: CInt = 6

public val SIGEV_SIGNAL: CInt = 0

public val SIGEV_NONE: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val REG_GS: CUint = 0u

public val REG_FS: CUint = 1u

public val REG_ES: CUint = 2u

public val REG_DS: CUint = 3u

public val REG_EDI: CUint = 4u

public val REG_ESI: CUint = 5u

public val REG_EBP: CUint = 6u

public val REG_ESP: CUint = 7u

public val REG_EBX: CUint = 8u

public val REG_EDX: CUint = 9u

public val REG_ECX: CUint = 10u

public val REG_EAX: CUint = 11u

public val REG_TRAPNO: CUint = 12u

public val REG_ERR: CUint = 13u

public val REG_EIP: CUint = 14u

public val REG_CS: CUint = 15u

public val REG_EFL: CUint = 16u

public val REG_UESP: CUint = 17u

public val REG_SS: CUint = 18u

public val IOC_VOID: IoctlDir = 0u

public val IOC_OUT: IoctlDir = 1u

public val IOC_IN: IoctlDir = 2u

public val IOC_INOUT: IoctlDir = 3u

public val IOC_8: IoctlDatum = 0u

public val IOC_16: IoctlDatum = 1u

public val IOC_32: IoctlDatum = 2u

public val IOC_64: IoctlDatum = 3u

public val TCP_ESTABLISHED: CUint = 1u

public val TCP_SYN_SENT: CUint = 2u

public val TCP_SYN_RECV: CUint = 3u

public val TCP_FIN_WAIT1: CUint = 4u

public val TCP_FIN_WAIT2: CUint = 5u

public val TCP_TIME_WAIT: CUint = 6u

public val TCP_CLOSE: CUint = 7u

public val TCP_CLOSE_WAIT: CUint = 8u

public val TCP_LAST_ACK: CUint = 9u

public val TCP_LISTEN: CUint = 10u

public val TCP_CLOSING: CUint = 11u

public val TCP_CA_OPEN: TcpCaState = 0u

public val TCP_CA_DISORDER: TcpCaState = 1u

public val TCP_CA_CWR: TcpCaState = 2u

public val TCP_CA_RECOVERY: TcpCaState = 3u

public val TCP_CA_LOSS: TcpCaState = 4u

public val TCP_NO_QUEUE: CUint = 0u

public val TCP_RECV_QUEUE: CUint = 1u

public val TCP_SEND_QUEUE: CUint = 2u

public val TCP_QUEUES_NR: CUint = 3u

public val P_ALL: IdtypeT = 0u

public val P_PID: IdtypeT = 1u

public val P_PGID: IdtypeT = 2u

public val SS_ONSTACK: CInt = 1

public val SS_DISABLE: CInt = 4

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(lock = 0, ownerId = 0, cnt = 0, shpid = 0, type = PTHREAD_MUTEX_TIMED.toInt(), flags = 0, reserved1 = 0, reserved2 = 0)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(lock = PTHREAD_SPIN_LOCK_INITIALIZER, queue = null, attr = null, wrefs = 0, data = null)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(held = PTHREAD_SPIN_LOCK_INITIALIZER, lock = PTHREAD_SPIN_LOCK_INITIALIZER, readers = 0, readerqueue = null, writerqueue = null, attr = null, data = null)

public val PTHREAD_STACK_MIN: SizeT = 0uL

// Non-public helper constants
public val UTSNAME_LENGTH: Int = 1024

public fun cmsgAlign(len: Int): Int {
    return (len + sizeOf<Int>() - 1) and (sizeOf<Int>() - 1).inv()
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toInt() >= sizeOf<Cmsghdr>()) {
        (if (mhdr!!.msgControl == null) null else Cmsghdr())
    } else {
        nullMut<Cmsghdr>()
    }
}

public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    return ((((cmsg)?.hashCode()?.toLong() ?: 0L).toUByte()))?.let { COpaquePointer(it.hashCode().toLong() + (CMSG_ALIGN(sizeOf<Cmsghdr>()).toInt()).toLong()) }
}

public fun cmsgSpace(length: CUint): CUint {
    return (CMSG_ALIGN(length.toInt()) + CMSG_ALIGN(sizeOf<Cmsghdr>())).toUInt()
}

public fun cmsgLen(length: CUint): CUint {
    return CMSG_ALIGN(sizeOf<Cmsghdr>()).toUInt() + length
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if (((cmsg!!.cmsgLen).toInt()) < sizeOf<Cmsghdr>()) {
        return nullMut<Cmsghdr>()
    }
    val next = null
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + (mhdr!!.msgControllen).toInt()
    return if (((next)?.let { COpaquePointer(it.hashCode().toLong() + (1).toLong()) }).toInt() > max || ((next)?.hashCode()?.toLong() ?: 0L).toInt() + CMSG_ALIGN((next!!.cmsgLen).toInt()) > max) {
        nullMut<Cmsghdr>()
    } else {
        (if (next == null) null else Cmsghdr())
    }
}

public fun cpuAllocSize(count: CInt): SizeT {
    val dummy: CpuSetT = null
    val sizeInBits = 8 * 8
    return ((count.toULong() + sizeInBits - 1uL) / 8uL).toULong()
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
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * 8
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0uL != (cpuset.bits[idx] and (1uL shl offset))
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = 8
    for (i in cpuset.bits[0 until (size / sizeOfMask)].iter()) {
        s += i.countOnes()
    }
    return s.toInt()
}

public fun cpuCount(cpuset: CpuSetT): CInt {
    return CPU_COUNT_S(sizeOf<CpuSetT>(), cpuset)
}

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean {
    return set1.bits == set2.bits
}

public fun iptosTos(tos: UByte): UByte {
    return (tos and IPTOS_TOS_MASK).toUByte()
}

public fun iptosPrec(tos: UByte): UByte {
    return (tos and IPTOS_PREC_MASK).toUByte()
}

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

public expect fun lutimes(file: String?, times: io.github.kotlinmania.libc.Timeval?): CInt

public expect fun futimes(fd: CInt, times: io.github.kotlinmania.libc.Timeval?): CInt

public expect fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt

public expect fun mkfifoat(fd: CInt, path: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun libcCurrentSigrtmin(): CInt

public expect fun libcCurrentSigrtmax(): CInt

public expect fun wait4(pid: io.github.kotlinmania.libc.PidT, status: CInt?, options: CInt, rusage: Rusage?): io.github.kotlinmania.libc.PidT

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt

public expect fun sigwait(set: CUlong?, sig: CInt?): CInt

public expect fun sigsuspend(mask: CUlong?): CInt

public expect fun sigtimedwait(set: CUlong?, info: SiginfoT?, timeout: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun sigwaitinfo(set: CUlong?, info: SiginfoT?): CInt

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun pipe2(fds: CInt?, flags: CInt): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT

public expect fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT

public expect fun readv(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt): SsizeT

public expect fun writev(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt): SsizeT

public expect fun preadv(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt, offset: OffT): SsizeT

public expect fun preadv64(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun pwritev64(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

public expect fun aioRead(aiocbp: Aiocb?): CInt

public expect fun aioWrite(aiocbp: Aiocb?): CInt

public expect fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt

public expect fun aioError(aiocbp: Aiocb?): CInt

public expect fun aioReturn(aiocbp: Aiocb?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: io.github.kotlinmania.libc.Sigevent?): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): io.github.kotlinmania.libc.MqdT

public expect fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT

public expect fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: io.github.kotlinmania.libc.Timespec?): SsizeT

public expect fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt

public expect fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt

public expect fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt

public expect fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt

public expect fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt

public expect fun ftello64(stream: FILE?): Off64T

public expect fun bind(fd: CInt, addr: Sockaddr?, len: io.github.kotlinmania.libc.SocklenT): CInt

public expect fun accept4(fd: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, len: CUint?, flg: CInt): CInt

public expect fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: CUlong?): CInt

public expect fun recvmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT

public expect fun sendmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): SsizeT

public expect fun sendfile(outFd: CInt, inFd: CInt, offset: CLong?, count: SizeT): SsizeT

public expect fun sendfile64(outFd: CInt, inFd: CInt, offset: SquadType?, count: SizeT): SsizeT

public expect fun shutdown(fd: CInt, how: CInt): CInt

public expect fun sethostname(name: String?, len: SizeT): CInt

public expect fun getdomainname(name: COpaquePointer?, len: SizeT): CInt

public expect fun setdomainname(name: String?, len: SizeT): CInt

public expect fun ifNameindex(): IfNameindex?

public expect fun ifFreenameindex(ptr: IfNameindex?)

public expect fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?)

public expect fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt

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

public expect fun getpwentR(pwd: io.github.kotlinmania.libc.Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun fgetpwentR(stream: FILE?, pwd: io.github.kotlinmania.libc.Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun fgetgrentR(stream: FILE?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun putpwent(p: io.github.kotlinmania.libc.Passwd?, stream: FILE?): CInt

public expect fun putgrent(grp: Group?, stream: FILE?): CInt

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: io.github.kotlinmania.libc.UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun fgetspentR(fp: FILE?, spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

public expect fun sgetspentR(s: String?, spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

public expect fun getspentR(spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

public expect fun getspnamR(name: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

// mntent.h
public expect fun getmntentR(stream: FILE?, mntbuf: io.github.kotlinmania.libc.Mntent?, buf: COpaquePointer?, buflen: CInt): io.github.kotlinmania.libc.Mntent?

public expect fun utmpname(file: String?): CInt

public expect fun utmpxname(file: String?): CInt

public expect fun getutxent(): Utmpx?

public expect fun getutxid(ut: Utmpx?): Utmpx?

public expect fun getutxline(ut: Utmpx?): Utmpx?

public expect fun pututxline(ut: Utmpx?): Utmpx?

public expect fun setutxent()

public expect fun endutxent()

public expect fun getresuid(ruid: CUint?, euid: CUint?, suid: CUint?): CInt

public expect fun getresgid(rgid: CUint?, egid: CUint?, sgid: CUint?): CInt

public expect fun setresuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT, suid: io.github.kotlinmania.libc.UidT): CInt

public expect fun setresgid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT, sgid: io.github.kotlinmania.libc.GidT): CInt

public expect fun initgroups(user: String?, group: io.github.kotlinmania.libc.GidT): CInt

public expect fun getgrgid(gid: io.github.kotlinmania.libc.GidT): Group?

public expect fun getgrgidR(gid: io.github.kotlinmania.libc.GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrnam(name: String?): Group?

public expect fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrouplist(user: String?, group: io.github.kotlinmania.libc.GidT, groups: CUint?, ngroups: CInt?): CInt

public expect fun setgroups(ngroups: SizeT, ptr: CUint?): CInt

public expect fun acct(filename: String?): CInt

public expect fun setmntent(filename: String?, ty: String?): FILE?

public expect fun getmntent(stream: FILE?): io.github.kotlinmania.libc.Mntent?

public expect fun addmntent(stream: FILE?, mnt: io.github.kotlinmania.libc.Mntent?): CInt

public expect fun endmntent(streamp: FILE?): CInt

public expect fun hasmntopt(mnt: io.github.kotlinmania.libc.Mntent?, opt: String?): COpaquePointer?

public expect fun pthreadCreate(native: CLong?, attr: PthreadAttr?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadKill(threadid: io.github.kotlinmania.libc.PthreadT, signo: CInt): CInt

public expect fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadGetattrNp(thr: io.github.kotlinmania.libc.PthreadT, attr: PthreadAttr?): CInt

public expect fun pthreadAttrGetguardsize(attr: PthreadAttr?, guardsize: SizeT?): CInt

public expect fun pthreadAttrSetguardsize(attr: PthreadAttr?, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: PthreadAttr?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt

public expect fun pthreadMutexattrGetpshared(attr: PthreadMutexattr?, pshared: CInt?): CInt

public expect fun pthreadMutexattrSetpshared(attr: PthreadMutexattr?, pshared: CInt): CInt

public expect fun pthreadMutexTimedlock(lock: PthreadMutex?, abstime: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattr?, value: CInt?): CInt

public expect fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattr?, value: CInt): CInt

public expect fun pthreadCondattrGetclock(attr: PthreadCondattr?, clockId: CInt?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattr?, clockId: ClockidT): CInt

public expect fun pthreadCondattrGetpshared(attr: PthreadCondattr?, pshared: CInt?): CInt

public expect fun pthreadCondattrSetpshared(attr: PthreadCondattr?, pshared: CInt): CInt

public expect fun pthreadOnce(control: PthreadOnce?, routine: PthreadOnceRoutineCallback): CInt

public expect fun pthreadBarrierattrInit(attr: PthreadBarrierattr?): CInt

public expect fun pthreadBarrierattrDestroy(attr: PthreadBarrierattr?): CInt

public expect fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattr?, shared: CInt?): CInt

public expect fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattr?, shared: CInt): CInt

public expect fun pthreadBarrierInit(barrier: PthreadBarrier?, attr: PthreadBarrierattr?, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: PthreadBarrier?): CInt

public expect fun pthreadBarrierWait(barrier: PthreadBarrier?): CInt

public expect fun pthreadSpinInit(lock: CInt?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: CInt?): CInt

public expect fun pthreadSpinLock(lock: CInt?): CInt

public expect fun pthreadSpinTrylock(lock: CInt?): CInt

public expect fun pthreadSpinUnlock(lock: CInt?): CInt

public expect fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt

public expect fun pthreadSigmask(how: CInt, newmask: CUlong?, oldmask: CUlong?): CInt

public expect fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt

public expect fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun pthreadGetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun pthreadSetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun pthreadGetcpuclockid(thread: io.github.kotlinmania.libc.PthreadT, clkId: CInt?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semTimedwait(sem: SemT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt

public expect fun clockGetres(clockId: ClockidT, res: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun clockGettime(clockId: ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun clockSettime(clockId: ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun clockGetcpuclockid(pid: io.github.kotlinmania.libc.PidT, clkId: CInt?): CInt

public expect fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt

public expect fun settimeofday(tv: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt

public expect fun asctimeR(tm: io.github.kotlinmania.libc.Tm?, buf: COpaquePointer?): COpaquePointer?

public expect fun ctimeR(timep: CLong?, buf: COpaquePointer?): COpaquePointer?

public expect fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?): SizeT

public expect fun strptime(s: String?, format: String?, tm: io.github.kotlinmania.libc.Tm?): COpaquePointer?

public expect fun timerCreate(clockid: io.github.kotlinmania.libc.ClockidT, sevp: io.github.kotlinmania.libc.Sigevent?, timerid: UwordType?): CInt

public expect fun timerDelete(timerid: io.github.kotlinmania.libc.TimerT): CInt

public expect fun timerGetoverrun(timerid: io.github.kotlinmania.libc.TimerT): CInt

public expect fun timerGettime(timerid: io.github.kotlinmania.libc.TimerT, currValue: io.github.kotlinmania.libc.Itimerspec?): CInt

public expect fun timerSettime(timerid: io.github.kotlinmania.libc.TimerT, flags: CInt, newValue: io.github.kotlinmania.libc.Itimerspec?, oldValue: io.github.kotlinmania.libc.Itimerspec?): CInt

public expect fun fstat(fd: CInt, buf: Stat?): CInt

public expect fun fstat64(fd: CInt, buf: Stat64?): CInt

public expect fun fstatat(fd: CInt, file: String?, buf: Stat?, flag: CInt): CInt

public expect fun fstatat64(fd: CInt, file: String?, buf: Stat64?, flag: CInt): CInt

public expect fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: Statx?): CInt

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

public expect fun open(file: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun open64(file: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun openat(fd: CInt, file: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun openat64(fd: CInt, file: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun fopen64(filename: String?, mode: String?): FILE?

public expect fun freopen64(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun creat64(path: String?, mode: ModeT): CInt

public expect fun mkostemp(template: COpaquePointer?, flags: CInt): CInt

public expect fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun tmpfile64(): FILE?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun getdtablesize(): CInt

// Added in `glibc` 2.34
public expect fun closeRange(first: CUint, last: CUint, flags: CInt): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt

public expect fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): io.github.kotlinmania.libc.PidT

public expect fun getpt(): CInt

public expect fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun loginTty(fd: CInt): CInt

public expect fun ctermid(s: COpaquePointer?): COpaquePointer?

public expect fun clearenv(): CInt

public expect fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

// posix/spawn.h
public expect fun posixSpawn(pid: CInt?, path: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: CInt?, file: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt

public expect fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: CUlong?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: CUlong?): CInt

public expect fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: CUlong?): CInt

public expect fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: CUlong?): CInt

public expect fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt

public expect fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: CInt?): CInt

public expect fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: io.github.kotlinmania.libc.PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt

// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddchdirNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, path: String?): CInt

// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddfchdirNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, fd: CInt): CInt

// Added in `glibc` 2.34
public expect fun posixSpawnFileActionsAddclosefromNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, from: CInt): CInt

// Added in `glibc` 2.35
public expect fun posixSpawnFileActionsAddtcsetpgrpNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, tcfd: CInt): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun euidaccess(pathname: String?, mode: CInt): CInt

public expect fun eaccess(pathname: String?, mode: CInt): CInt

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun stat(file: String?, buf: Stat?): CInt

public expect fun stat64(file: String?, buf: Stat64?): CInt

public expect fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent?

public expect fun readdir64(dirp: DIR?): io.github.kotlinmania.libc.Dirent64?

public expect fun readdirR(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt

public expect fun readdir64R(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent64?, result: COpaquePointer?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun dirfd(dirp: DIR?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun errnoLocation(): CInt?

public expect fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer?

public expect fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun sync()

public expect fun syncfs(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt

public expect fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: io.github.kotlinmania.libc.Rlimit64?): CInt

public expect fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt

public expect fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: io.github.kotlinmania.libc.Rlimit64?): CInt

public expect fun getpriority(which: io.github.kotlinmania.libc.PriorityWhich, who: io.github.kotlinmania.libc.IdT): CInt

public expect fun setpriority(which: io.github.kotlinmania.libc.PriorityWhich, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt

public expect fun getrandom(buffer: COpaquePointer?, length: SizeT, flags: CUint): SsizeT

public expect fun getentropy(buffer: COpaquePointer?, length: SizeT): CInt

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

public expect fun strchrnul(s: String?, c: CInt): COpaquePointer?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun drand48(): CDouble

public expect fun erand48(xseed: CUshort?): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: CUshort?): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: CUshort?): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: CUshort?): CUshort?

public expect fun lcong48(p: CUshort?)

public expect fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?)

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun mallinfo(): io.github.kotlinmania.libc.Mallinfo

public expect fun mallinfo2(): io.github.kotlinmania.libc.Mallinfo2

public expect fun mallocInfo(options: CInt, stream: FILE?): CInt

public expect fun mallocUsableSize(ptr: COpaquePointer?): SizeT

public expect fun mallocTrim(pad: SizeT): CInt

public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT

public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT

public expect fun iconvClose(cd: IconvT): CInt

public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt

public expect fun backtrace(buf: COpaquePointer?, sz: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt

public expect fun regexec(preg: io.github.kotlinmania.libc.RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT

public expect fun regfree(preg: io.github.kotlinmania.libc.RegexT?)

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt

public expect fun globfree(pglob: io.github.kotlinmania.libc.GlobT?)

public expect fun glob64(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: Glob64T?): CInt

public expect fun globfree64(pglob: Glob64T?)

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt

public expect fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt

public expect fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun removexattr(path: String?, name: String?): CInt

public expect fun lremovexattr(path: String?, name: String?): CInt

public expect fun fremovexattr(filedes: CInt, name: String?): CInt

public expect fun dirname(path: COpaquePointer?): COpaquePointer?

/**
 * POSIX version of `basename(3)`, defined in `libgen.h`.
 */
public expect fun posixBasename(path: COpaquePointer?): COpaquePointer?

/**
 * GNU version of `basename(3)`, defined in `string.h`.
 */
public expect fun gnuBasename(path: String?): COpaquePointer?

public expect fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer?

public expect fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt

public expect fun dladdr1(addr: COpaquePointer?, info: io.github.kotlinmania.libc.DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt

public expect fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT

public expect fun freelocale(loc: io.github.kotlinmania.libc.LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT

public expect fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT

public expect fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer?

public expect fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: io.github.kotlinmania.libc.LocaleT): COpaquePointer?

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt

public expect fun gnuGetLibcRelease(): COpaquePointer?

public expect fun gnuGetLibcVersion(): COpaquePointer?

public fun makedev(major: CUint, minor: CUint): io.github.kotlinmania.libc.DevT {
    val major1 = (major as io.github.kotlinmania.libc.DevT)
    val minor1 = (minor as io.github.kotlinmania.libc.DevT)
    var dev = 0
    dev = dev or (major1 shl 8)
    dev = dev or minor1
    return dev
}

public fun major(dev: io.github.kotlinmania.libc.DevT): CUint {
    return ((dev shr 8) and 0xff).toUInt()
}

public fun minor(dev: io.github.kotlinmania.libc.DevT): CUint {
    return (dev and 0xffff00ff).toUInt()
}

public fun sigrtmax(): CInt {
    return libcCurrentSigrtmax()
}

public fun sigrtmin(): CInt {
    return libcCurrentSigrtmin()
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

public fun wExitcode(ret: CInt, sig: CInt): CInt {
    return (ret shl 8) or sig
}

public fun wStopcode(sig: CInt): CInt {
    return (sig shl 8) or 0x7f
}

public fun qcmd(cmd: CInt, type: CInt): CInt {
    return (cmd shl 8) or (type and 0x00ff)
}

public fun ipoptCopied(o: UByte): UByte {
    return (o and IPOPT_COPY).toUByte()
}

public fun ipoptClass(o: UByte): UByte {
    return (o and IPOPT_CLASS_MASK).toUByte()
}

public fun ipoptNumber(o: UByte): UByte {
    return (o and IPOPT_NUMBER_MASK).toUByte()
}

public fun iptosEcn(x: UByte): UByte {
    return (x and IPTOS_ECN_MASK).toUByte()
}
