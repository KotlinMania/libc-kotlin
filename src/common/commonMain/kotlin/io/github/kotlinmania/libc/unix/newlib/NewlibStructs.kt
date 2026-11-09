package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.newlib.aarch64.Sockaddr
import io.github.kotlinmania.libc.unix.newlib.generic.SigsetT

public fun interface SigactionSaHandlerCallback {
    public operator fun invoke(arg1: CInt)
}

// supports multicast
// The order of the `aiAddr` field in this struct is crucial
// for converting between the Rust and C types.
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

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class InAddr(public var sAddr: InAddrT)

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
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intNSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intPSignPosn: CChar,
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

public open class Sigaction(
    public var saHandler: SigactionSaHandlerCallback,
    public var saMask: SigsetT,
    public var saFlags: CInt,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: Int,
)

public open class FdSet(
    // Unverified
    public var fdsBits: List<CUlong>,
)

public open class Passwd(
    // Unverified
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class Termios(
    // Unverified
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cLine: CcT,
    public var cCc: List<CcT>,
    public var cIspeed: UInt,
    public var cOspeed: UInt,
)

public open class SemT(
    // Unverified
    public var size: List<CChar>,
)

public open class DlInfo(
    // Unverified
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class Utsname(
    // Unverified
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
    public var domainname: List<CChar>,
)

public open class CpuSetT(
    // Unverified
    public var bits: List<UInt>,
)

public open class PthreadAttrT(
    // Unverified
    public var size: List<UByte>,
    public var isInitialized: Int,
    public var stackaddr: COpaquePointer?,
    public var stacksize: Int,
    public var contentionscope: Int,
    public var inheritsched: Int,
    public var schedpolicy: Int,
    public var schedparam: Int,
    public var detachstate: Int,
)

public open class PthreadRwlockattrT(
    // Unverified
    public var size: List<UByte>,
)

public open class PthreadMutexT(
    // Unverified
    public var size: List<UByte>,
)

public open class PthreadRwlockT(
    // Unverified
    public var size: List<UByte>,
)

public open class PthreadMutexattrT(
    // Unverified
    public var size: List<UByte>,
)

public open class PthreadCondT(
    // Unverified
    public var size: List<UByte>,
)

public open class PthreadCondattrT(
    // Unverified
    public var size: List<UByte>,
)
