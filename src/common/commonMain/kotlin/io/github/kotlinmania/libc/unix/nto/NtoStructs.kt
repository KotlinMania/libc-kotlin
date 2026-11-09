package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.I128
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.nto.aarch64.McontextT
import io.github.kotlinmania.libc.unix.nto.aarch64.StackT
import io.github.kotlinmania.libc.unix.nto.aarch64.TimeT

public fun interface GlobTGlErrfuncCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: CInt): CInt
}

public fun interface ThreadAttrExitfuncCallback {
    public operator fun invoke(fake: COpaquePointer?)
}

// intentionally not public, only used for fdSet
// QNX Network Stack Versioning:
//
// The `if` block targets the legacy `io - pkt` stack.
// - targetEnv = "nto70": QNX 7.0
// - targetEnv = "nto71": Standard QNX 7.1 (default legacy stack)
//
// The `else` block targets the modern `io - sock` stack.
// - targetEnv = "nto71Iosock": QNX 7.1 with the optional new stack
// - targetEnv = "nto80": QNX 8.0
public open class DirentExtra(
    public var dDatalen: UShort,
    public var dType: UShort,
    public var dReserved: UInt,
)

public open class Stat(
    public var stIno: InoT,
    public var stSize: OffT,
    public var stDev: DevT,
    public var stRdev: DevT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var oldStMtime: Time32t,
    public var oldStAtime: Time32t,
    public var oldStCtime: Time32t,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stBlocksize: BlksizeT,
    public var stNblocks: Int,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stMtim: Timespec,
    public var stAtim: Timespec,
    public var stCtim: Timespec,
)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class InAddr(public var sAddr: InAddrT)

public open class Sockaddr(
    public var saLen: UByte,
    public var saFamily: SaFamilyT,
    public var saData: List<CChar>,
)

public open class SockaddrIn(
    public var sinLen: UByte,
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<Byte>,
)

public open class SockaddrIn6(
    public var sin6Len: UByte,
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

// The order of the `aiAddr` field in this struct is crucial
// for converting between the Rust and C types.
public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    public var aiCanonname: COpaquePointer?,
    public var aiAddr: Sockaddr?,
    public var aiNext: Addrinfo?,
)

public open class FdSet(public var fdsBits: List<CUint>)

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
    public var schedCurpriority: CInt,
    public var reserved: List<CInt>,
)

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class Lconv(
    public var currencySymbol: COpaquePointer?,
    public var intCurrSymbol: COpaquePointer?,
    public var monDecimalPoint: COpaquePointer?,
    public var monGrouping: COpaquePointer?,
    public var monThousandsSep: COpaquePointer?,
    public var negativeSign: COpaquePointer?,
    public var positiveSign: COpaquePointer?,
    public var fracDigits: CChar,
    public var intFracDigits: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var nSignPosn: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intNSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var decimalPoint: COpaquePointer?,
    public var grouping: COpaquePointer?,
    public var thousandsSep: COpaquePointer?,
    public var fracGrouping: COpaquePointer?,
    public var fracSep: COpaquePointer?,
    public var falseVal: COpaquePointer?,
    public var trueVal: COpaquePointer?,
    public var no: COpaquePointer?,
    public var yes: COpaquePointer?,
    public var nostr: COpaquePointer?,
    public var yesstr: COpaquePointer?,
    public var reserved: List<COpaquePointer?>,
)

public open class InPktinfo(public var ipiAddr: InAddr, public var ipiIfindex: CUint)

public open class Ifaddrs(
    public var ifaNext: Ifaddrs?,
    public var ifaName: COpaquePointer?,
    public var ifaFlags: CUint,
    public var ifaAddr: Sockaddr?,
    public var ifaNetmask: Sockaddr?,
    public var ifaDstaddr: Sockaddr?,
    public var ifaData: COpaquePointer?,
)

public open class Arpreq(
    public var arpPa: Sockaddr,
    public var arpHa: Sockaddr,
    public var arpFlags: CInt,
)

public open class Arphdr(
    public var arHrd: UShort,
    public var arPro: UShort,
    public var arHln: UByte,
    public var arPln: UByte,
    public var arOp: UShort,
)

public open class Mmsghdr(public var msgHdr: Msghdr, public var msgLen: CUint)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var data: List<UByte>,
) {
    public open fun siAddr(): COpaquePointer? {
        open class SiginfoSiAddr(public var pad: List<UByte>, public var siAddr: COpaquePointer?)
        return (((this as SiginfoT?) as SiginfoSiAddr?)).siAddr
    }

    public open fun siValue(): Sigval {
        open class SiginfoSiValue(public var pad: List<UByte>, public var siValue: Sigval)
        return (((this as SiginfoT?) as SiginfoSiValue?)).siValue
    }

    public open fun siPid(): PidT {
        open class SiginfoSiPid(public var pad: List<UByte>, public var siPid: PidT)
        return (((this as SiginfoT?) as SiginfoSiPid?)).siPid
    }

    public open fun siUid(): UidT {
        open class SiginfoSiUid(public var pad: List<UByte>, public var siUid: UidT)
        return (((this as SiginfoT?) as SiginfoSiUid?)).siUid
    }

    public open fun siStatus(): CInt {
        open class SiginfoSiStatus(public var pad: List<UByte>, public var siStatus: CInt)
        return (((this as SiginfoT?) as SiginfoSiStatus?)).siStatus
    }
}

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saFlags: CInt,
    public var saMask: SigsetT,
)

public open class Sync(public var union: CUint, public var owner: CUint)

public open class Rlimit64(public var rlimCur: Rlim64T, public var rlimMax: Rlim64T)

public open class GlobT(
    public var glPathc: SizeT,
    public var glMatchc: CInt,
    public var glPathv: COpaquePointer?,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    public var glErrfunc: GlobTGlErrfuncCallback,
    public var unused1: COpaquePointer?,
    public var unused2: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwAge: COpaquePointer?,
    public var pwComment: COpaquePointer?,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class IfNameindex(public var ifIndex: CUint, public var ifName: COpaquePointer?)

public open class Sembuf(
    public var semNum: CUshort,
    public var semOp: CShort,
    public var semFlg: CShort,
)

public open class Elf32Ehdr(
    public var eIdent: List<CUchar>,
    public var eType: Elf32Half,
    public var eMachine: Elf32Half,
    public var eVersion: Elf32Word,
    public var eEntry: Elf32Addr,
    public var ePhoff: Elf32Off,
    public var eShoff: Elf32Off,
    public var eFlags: Elf32Word,
    public var eEhsize: Elf32Half,
    public var ePhentsize: Elf32Half,
    public var ePhnum: Elf32Half,
    public var eShentsize: Elf32Half,
    public var eShnum: Elf32Half,
    public var eShstrndx: Elf32Half,
)

public open class Elf64Ehdr(
    public var eIdent: List<CUchar>,
    public var eType: Elf64Half,
    public var eMachine: Elf64Half,
    public var eVersion: Elf64Word,
    public var eEntry: Elf64Addr,
    public var ePhoff: Elf64Off,
    public var eShoff: Elf64Off,
    public var eFlags: Elf64Word,
    public var eEhsize: Elf64Half,
    public var ePhentsize: Elf64Half,
    public var ePhnum: Elf64Half,
    public var eShentsize: Elf64Half,
    public var eShnum: Elf64Half,
    public var eShstrndx: Elf64Half,
)

public open class Elf32Sym(
    public var stName: Elf32Word,
    public var stValue: Elf32Addr,
    public var stSize: Elf32Word,
    public var stInfo: CUchar,
    public var stOther: CUchar,
    public var stShndx: Elf32Section,
)

public open class Elf64Sym(
    public var stName: Elf64Word,
    public var stInfo: CUchar,
    public var stOther: CUchar,
    public var stShndx: Elf64Section,
    public var stValue: Elf64Addr,
    public var stSize: Elf64Xword,
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

public open class Elf32Shdr(
    public var shName: Elf32Word,
    public var shType: Elf32Word,
    public var shFlags: Elf32Word,
    public var shAddr: Elf32Addr,
    public var shOffset: Elf32Off,
    public var shSize: Elf32Word,
    public var shLink: Elf32Word,
    public var shInfo: Elf32Word,
    public var shAddralign: Elf32Word,
    public var shEntsize: Elf32Word,
)

public open class Elf64Shdr(
    public var shName: Elf64Word,
    public var shType: Elf64Word,
    public var shFlags: Elf64Xword,
    public var shAddr: Elf64Addr,
    public var shOffset: Elf64Off,
    public var shSize: Elf64Xword,
    public var shLink: Elf64Word,
    public var shInfo: Elf64Word,
    public var shAddralign: Elf64Xword,
    public var shEntsize: Elf64Xword,
)

public open class In6Pktinfo(public var ipi6Addr: In6Addr, public var ipi6Ifindex: CUint)

public open class InotifyEvent(
    public var wd: CInt,
    public var mask: UInt,
    public var cookie: UInt,
    public var len: UInt,
)

public open class RegmatchT(public var rmSo: RegoffT, public var rmEo: RegoffT)

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

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cCc: List<CcT>,
    public var reserved: List<CUint>,
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
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

public open class Flock(
    public var lType: Short,
    public var lWhence: Short,
    public var lZero1: Int,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
    public var lSysid: UInt,
)

public open class Statvfs(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFavail: FsfilcntT,
    public var fFsid: CUlong,
    public var fBasetype: List<CChar>,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fFiller: List<CUint>,
)

public open class Aiocb(
    public var aioFildes: CInt,
    public var aioReqprio: CInt,
    public var aioOffset: OffT,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioSigevent: Sigevent,
    public var aioLioOpcode: CInt,
    public var aioLioState: COpaquePointer?,
    public var aioPad: List<CInt>,
    public var aioNext: Aiocb?,
    public var aioFlag: CUint,
    public var aioIotype: CUint,
    public var aioResult: SsizeT,
    public var aioError: CUint,
    public var aioSuspend: COpaquePointer?,
    public var aioPlist: COpaquePointer?,
    public var aioPolicy: CInt,
    public var aioParam: SchedParam,
)

public open class PthreadAttrT(public var data1: CLong, public var data2: List<UByte>)

public open class IpcPerm(
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
    public var seq: CUint,
    public var key: KeyT,
    public var reserved: List<CInt>,
)

public open class RegexT(
    public var reMagic: CInt,
    public var reNsub: SizeT,
    public var reEndp: COpaquePointer?,
    public var reG: COpaquePointer?,
)

public open class ThreadAttr(
    public var flags: CInt,
    public var stacksize: SizeT,
    public var stackaddr: COpaquePointer?,
    public var exitfunc: ThreadAttrExitfuncCallback?,
    public var policy: CInt,
    public var param: SchedParam,
    public var guardsize: CUint,
    public var prealloc: CUint,
    public var spare: List<CInt>,
)

public open class SyncAttr(
    public var protocol: CInt,
    public var flags: CInt,
    public var prioceiling: CInt,
    public var clockid: CInt,
    public var count: CInt,
    public var reserved: List<CInt>,
)

public open class Sockcred(
    public var scUid: UidT,
    public var scEuid: UidT,
    public var scGid: GidT,
    public var scEgid: GidT,
    public var scNgroups: CInt,
    public var scGroups: List<GidT>,
)

public open class BpfProgram(public var bfLen: CUint, public var bfInsns: BpfInsn?)

public open class BpfStat(
    public var bsRecv: ULong,
    public var bsDrop: ULong,
    public var bsCapt: ULong,
    public var bsPadding: List<ULong>,
)

public open class BpfVersion(public var bvMajor: CUshort, public var bvMinor: CUshort)

public open class BpfHdr(
    public var bhTstamp: Timeval,
    public var bhCaplen: UInt,
    public var bhDatalen: UInt,
    public var bhHdrlen: UShort,
)

public open class BpfInsn(
    public var code: UShort,
    public var jt: CUchar,
    public var jf: CUchar,
    public var k: UInt,
)

public open class BpfDltlist(public var bflLen: CUint, public var bflList: CUint?)

public open class Unpcbid(
    public var unpPid: PidT,
    public var unpEuid: UidT,
    public var unpEgid: GidT,
)

public open class DlPhdrInfo(
    public var dlpiAddr: Elf64Addr,
    public var dlpiName: COpaquePointer?,
    public var dlpiPhdr: Elf64Phdr?,
    public var dlpiPhnum: Elf64Half,
)

public open class UcontextT(
    public var ucLink: UcontextT?,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    public var ucMcontext: McontextT,
)

public open class SockaddrUn(
    public var sunLen: UByte,
    public var sunFamily: SaFamilyT,
    public var sunPath: List<CChar>,
)

public open class SockaddrStorage(
    public var ssLen: UByte,
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<CChar>,
    public var ssAlign: Long,
    public var ssPad2: List<CChar>,
)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
)

public open class Sigevent(
    public var sigevNotify: CInt,
    public var padding1: CInt,
    public var sigevSigno: CInt,
    // union
    public var padding2: CInt,
    public var sigevValue: Sigval,
    public var sigevUn2: Int,
)

public open class Dirent(
    public var dIno: InoT,
    public var dOffset: OffT,
    public var dReclen: CShort,
    public var dNamelen: CShort,
    public var dName: List<CChar>,
)

public open class SigsetT(public var value: List<UInt>)

public open class MqAttr(
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqFlags: CLong,
    public var mqCurmsgs: CLong,
    public var mqSendwait: CLong,
    public var mqRecvwait: CLong,
)

public open class SockaddrDl(
    public var sdlLen: CUchar,
    public var sdlFamily: SaFamilyT,
    public var sdlIndex: UShort,
    public var sdlType: CUchar,
    public var sdlNlen: CUchar,
    public var sdlAlen: CUchar,
    public var sdlSlen: CUchar,
    public var sdlData: List<CChar>,
)

public open class Msg(
    public var msgNext: Msg?,
    public var msgType: CLong,
    public var msgTs: CUshort,
    public var msgSpot: CShort,
    public var pad: List<UByte>,
)

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var msgFirst: Msg?,
    public var msgLast: Msg?,
    public var msgCbytes: MsglenT,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var msgStime: TimeT,
    public var msgPad1: CLong,
    public var msgRtime: TimeT,
    public var msgPad2: CLong,
    public var msgCtime: TimeT,
    public var msgPad3: CLong,
    public var msgPad4: List<CLong>,
)

public open class SyncT(
    public var u: CUint,
    // union
    public var owner: CUint,
)

public open class PthreadBarrierT(
    // union
    public var pad: List<UByte>,
)

public open class PthreadRwlockT(
    public var active: CInt,
    public var blockedwriters: CInt,
    public var blockedreaders: CInt,
    public var heavy: CInt,
    public var lock: PthreadMutexT,
    // union
    public var rcond: PthreadCondT,
    // union
    public var wcond: PthreadCondT,
    // union
    public var owner: CUint,
    public var spare: CUint,
)

// There is no canonical definition of cLongdouble in Rust. For both AArch64 and x8664,
// however, the size and alignment properties are that of the gcc __int128 which corresponds (at
// least on rustc 1.78+ with LLVM 18, see
// https://blog.rust-lang.org/2024/03/30/i128-layout-update/) to i128. Use this instead until we
// get native f128 support.
//
// The definition was taken from the definition of the _Maxalignt struct in the QNX SDK.
// However, on QNX7, there is a different definition of std::maxAlignT (the C++ version of
// this type). In practice, this doesn't make a difference for the _alignment_ properties of the
// type - however, it changes the size, so using in in any other form than the zero-sized array
// form would be bogus and it would potentially change the size of the data type. On QNX8, this
// got fixed and both C and C++ are using the same definition.
public open class MaxAlignT(public var ll: CLonglong, public var ld: I128)
