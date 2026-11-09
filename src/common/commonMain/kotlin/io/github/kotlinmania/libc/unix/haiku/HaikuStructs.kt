package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
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
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.haiku.b64.TimeT

public open class InAddr(public var sAddr: InAddrT)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class Sockaddr(
    public var saLen: UByte,
    public var saFamily: SaFamilyT,
    public var saData: List<UByte>,
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
    public var sin6Family: UByte,
    public var sin6Port: UShort,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

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

public open class Ifaddrs(
    public var ifaNext: Ifaddrs?,
    public var ifaName: COpaquePointer?,
    public var ifaFlags: CUint,
    public var ifaAddr: Sockaddr?,
    public var ifaNetmask: Sockaddr?,
    public var ifaDstaddr: Sockaddr?,
    public var ifaData: COpaquePointer?,
)

public open class FdSet(
    // size for 1024 bits, and a fdMask with size u32
    public var fdsBits: List<FdMask>,
)

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
    public var tmGmtoff: CInt,
    public var tmZone: COpaquePointer?,
)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
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

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cLine: CChar,
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
    public var cCc: List<CcT>,
)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
)

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stSize: OffT,
    public var stRdev: DevT,
    public var stBlksize: BlksizeT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stCrtime: TimeT,
    public var stCrtimeNsec: CLong,
    public var stType: UInt,
    public var stBlocks: BlkcntT,
)

public open class GlobT(
    public var glPathc: SizeT,
    public var unused1: SizeT,
    public var glOffs: SizeT,
    public var unused2: SizeT,
    public var glPathv: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
    public var unused6: COpaquePointer?,
    public var unused7: COpaquePointer?,
    public var unused8: COpaquePointer?,
)

public open class PthreadMutexT(
    public var flags: UInt,
    public var lock: Int,
    public var unused: Int,
    public var owner: Int,
    public var ownerCount: Int,
)

public open class PthreadCondT(
    public var flags: UInt,
    public var unused: Int,
    public var mutex: COpaquePointer?,
    public var waiterCount: Int,
    public var lock: Int,
)

public open class PthreadRwlockT(
    public var flags: UInt,
    public var owner: Int,
    public var lockSem: Int,
    // this is actually a union
    public var lockCount: Int,
    public var readerCount: Int,
    public var writerCount: Int,
    public var waiters: List<COpaquePointer?>,
)

public open class PthreadSpinlockT(public var lock: UInt)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
    public var pwGecos: COpaquePointer?,
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
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var siPid: PidT,
    public var siUid: UidT,
    public var siAddr: COpaquePointer?,
    public var siStatus: CInt,
    public var siBand: CLong,
    public var sigval: COpaquePointer?,
) {
    public open fun siAddr(): COpaquePointer? {
        return this.siAddr
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

public open class Sigaction(
    public var saSigaction: SighandlerT,
    // actually a union with saHandler
    public var saMask: SigsetT,
    public var saFlags: CInt,
    public var saUserdata: COpaquePointer?,
)

public open class SemT(
    public var type: Int,
    public var namedSemId: Int,
    // actually a union with unnamedSem (i32)
    public var padding: List<Int>,
)

public open class Ucred(
    public var pid: PidT,
    public var uid: UidT,
    public var gid: GidT,
)

public open class SockaddrDl(
    public var sdlLen: UByte,
    public var sdlFamily: UByte,
    public var sdlEType: UShort,
    public var sdlIndex: UInt,
    public var sdlType: UByte,
    public var sdlNlen: UByte,
    public var sdlAlen: UByte,
    public var sdlSlen: UByte,
    public var sdlData: List<UByte>,
)

public open class Spwd(
    public var spNamp: COpaquePointer?,
    public var spPwdp: COpaquePointer?,
    public var spLstchg: CInt,
    public var spMin: CInt,
    public var spMax: CInt,
    public var spWarn: CInt,
    public var spInact: CInt,
    public var spExpire: CInt,
    public var spFlag: CInt,
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

public open class RegmatchT(public var rmSo: RegoffT, public var rmEo: RegoffT)

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var msgStime: TimeT,
    public var msgRtime: TimeT,
    public var msgCtime: TimeT,
)

public open class IpcPerm(
    public var key: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
)

public open class Sembuf(
    public var semNum: CUshort,
    public var semOp: CShort,
    public var semFlg: CShort,
)

public open class Entry(public var key: COpaquePointer?, public var data: COpaquePointer?)

public open class Option(
    public var name: COpaquePointer?,
    public var hasArg: CInt,
    public var flag: CInt?,
    public var value: CInt,
)

public open class SockaddrUn(
    public var sunLen: UByte,
    public var sunFamily: SaFamilyT,
    public var sunPath: List<CChar>,
)

public open class SockaddrStorage(
    public var ssLen: UByte,
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<UByte>,
    public var ssPad2: ULong,
    public var ssPad3: List<UByte>,
)

public open class Dirent(
    public var dDev: DevT,
    public var dPdev: DevT,
    public var dIno: InoT,
    public var dPino: Long,
    public var dReclen: CUshort,
    public var dName: List<CChar>,
)

public open class Sigevent(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    public var unused1: COpaquePointer?,
    // actually a function pointer
    public var sigevNotifyAttributes: COpaquePointer?,
)

public open class Utmpx(
    public var utType: CShort,
    public var utTv: Timeval,
    public var utId: List<CChar>,
    public var utPid: PidT,
    public var utUser: List<CChar>,
    public var utLine: List<CChar>,
    public var utHost: List<CChar>,
    public var utReserved: List<CChar>,
)
