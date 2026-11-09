package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Timespec

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UInt,
    public var stGid: UInt,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stAtim: Timespec,
    public var stMtim: Timespec,
    public var stCtim: Timespec,
    public var stBlksize: BlksizeT,
    public var stBlocks: Long,
    public var reserved: List<Int>,
)

public open class Sockaddr(public var saFamily: SaFamilyT, public var saData: List<UByte>)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UInt,
    public var pwGid: UInt,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
    public var reserved: List<Int>,
)

public open class SemT(public var value: List<Int>)

public open class PthreadAttrT(public var value: List<Int>)

public open class PthreadMutexT(public var value: List<Int>)

public open class PthreadCondT(public var value: List<Int>)

public open class PthreadCondattrT(public var value: List<Int>)

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
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
    public var intFracDigits: Byte,
    public var fracDigits: Byte,
    public var pCsPrecedes: Byte,
    public var pSepBySpace: Byte,
    public var nCsPrecedes: Byte,
    public var nSepBySpace: Byte,
    public var pSignPosn: Byte,
    public var nSignPosn: Byte,
    public var intNCsPrecedes: Byte,
    public var intNSepBySpace: Byte,
    public var intNSignPosn: Byte,
    public var intPCsPrecedes: Byte,
    public var intPSepBySpace: Byte,
    public var intPSignPosn: Byte,
    public var reserved: List<Int>,
)

public open class Tm(
    public var tmSec: Int,
    public var tmMin: Int,
    public var tmHour: Int,
    public var tmMday: Int,
    public var tmMon: Int,
    public var tmYear: Int,
    public var tmWday: Int,
    public var tmYday: Int,
    public var tmIsdst: Int,
    public var tmGmtoff: Int,
    public var tmZone: COpaquePointer?,
    public var reserved: List<Int>,
)

public open class Addrinfo(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: SocklenT,
    public var aiAddr: Sockaddr?,
    public var aiCanonname: COpaquePointer?,
    public var aiNext: Addrinfo?,
    public var reserved: List<Int>,
)

public open class PthreadRwlockT(public var value: List<Int>)

public open class Statvfs(
    public var fBsize: Int,
    public var fFrsize: Int,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsblkcntT,
    public var fFfree: FsblkcntT,
    public var fFavail: FsblkcntT,
    public var fFsid: Int,
    public var fFlag: Int,
    public var fNamemax: Int,
    public var reserved: List<Int>,
)

public open class Dirent(public var dType: UByte, public var dName: List<CChar>)

public open class FdSet(public var value: List<UInt>)

public open class SigsetT(public var value: List<UInt>)

public open class Sigaction(
    public var saHandler: Int,
    public var saMask: SigsetT,
    public var saFlags: Int,
    public var saUser: Int,
    public var reserved: List<Int>,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cCc: List<CcT>,
    public var cSpeed: SpeedT,
    public var reserved: List<Int>,
)

public open class InAddr(public var sAddr: InAddrT)

public open class SockaddrIn(
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<UByte>,
)

public open class SockaddrIn6(
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

public open class SockaddrUn(public var sunFamily: SaFamilyT, public var sunPath: List<CChar>)

public open class SockaddrStorage(public var ssFamily: SaFamilyT, public var ssData: List<UInt>)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class Ipv6Mreq(public var ipv6mrMultiaddr: In6Addr, public var ipv6mrInterface: UInt)
