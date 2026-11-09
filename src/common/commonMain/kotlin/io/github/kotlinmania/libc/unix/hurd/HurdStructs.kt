package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.hurd.b64.ElfAddr
import io.github.kotlinmania.libc.unix.hurd.b64.ElfHalf
import io.github.kotlinmania.libc.unix.hurd.b64.ElfPhdr

// structs
// functions
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
    public var sinAddr: InAddr,
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
    public var aiAddrlen: SocklenT,
    public var aiAddr: Sockaddr?,
    public var aiCanonname: COpaquePointer?,
    public var aiNext: Addrinfo?,
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

public open class Cmsghdr(
    public var cmsgLen: SocklenT,
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
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cCc: List<CcT>,
    public var ispeed: SpeedT,
    public var ospeed: SpeedT,
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

    public open fun siPid(): PidT {
        return this.siPid
    }

    public open fun siUid(): UidT {
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
    public var stAtim: Timespec,
    public var stMtim: Timespec,
    public var stCtim: Timespec,
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
    public var stAtim: Timespec,
    public var stMtim: Timespec,
    public var stCtim: Timespec,
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
    public var stxAtime: StatxTimestamp,
    public var stxBtime: StatxTimestamp,
    public var stxCtime: StatxTimestamp,
    public var stxMtime: StatxTimestamp,
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
    public var aioSigevent: Sigevent,
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

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

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
    public var ifaAddr: Sockaddr?,
    public var ifaNetmask: Sockaddr?,
    public var ifaIfu: Sockaddr?,
    // Note(union) This should be a union
    public var ifaData: COpaquePointer?,
)

public open class Arpreq(
    public var arpPa: Sockaddr,
    public var arpHa: Sockaddr,
    public var arpFlags: CInt,
    public var arpNetmask: Sockaddr,
    public var arpDev: List<CChar>,
)

public open class ArpreqOld(
    public var arpPa: Sockaddr,
    public var arpHa: Sockaddr,
    public var arpFlags: CInt,
    public var arpNetmask: Sockaddr,
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

public open class Mmsghdr(public var msgHdr: Msghdr, public var msgLen: CUint)

public open class Ifreq(
    /**
     * interface name, e.g. "en0"
     */
    public var ifrName: List<CChar>,
    public var ifrIfru: Sockaddr,
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
    public var pgrp: PidT,
    public var sd: SigsetT,
    public var ss: SigsetT,
    public var sp: SchedParam,
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
    public var utPid: PidT,
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
