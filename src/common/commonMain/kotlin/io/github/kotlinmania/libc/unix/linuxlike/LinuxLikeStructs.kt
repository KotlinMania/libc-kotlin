package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.S32
import io.github.kotlinmania.libc.unix.linuxlike.linux.U16
import io.github.kotlinmania.libc.unix.linuxlike.linux.U32
import io.github.kotlinmania.libc.unix.linuxlike.linux.U8
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.S64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.U64

// intentionally not public, only used for fdSet
// https://github.com/search?q=repo%3Atorvalds%2Flinux+%22%23define+_IOC_NONE%22&type=code
// LFS64 extensions
//
// * musl and Emscripten has 64-bit versions only so aliases the LFS64 symbols to the standard ones
// * ulibc doesn't have preadv64/pwritev64
// The statx syscall, available on some libcs.
public open class InAddr(public var sAddr: InAddrT)

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

public open class Sockaddr(public var saFamily: SaFamilyT, public var saData: List<CChar>)

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

public open class SchedParam(public var schedPriority: CInt)

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

public open class InPktinfo(
    public var ipiIfindex: CInt,
    public var ipiSpecDst: InAddr,
    public var ipiAddr: InAddr,
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

public open class In6Rtmsg(
    public var rtmsgDst: In6Addr,
    public var rtmsgSrc: In6Addr,
    public var rtmsgGateway: In6Addr,
    public var rtmsgType: UInt,
    public var rtmsgDstLen: UShort,
    public var rtmsgSrcLen: UShort,
    public var rtmsgMetric: UInt,
    public var rtmsgInfo: CUlong,
    public var rtmsgFlags: UInt,
    public var rtmsgIfindex: CInt,
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

public open class Mmsghdr(public var msgHdr: Msghdr, public var msgLen: CUint)

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

public open class IfNameindex(public var ifIndex: CUint, public var ifName: COpaquePointer?)

public open class FileCloneRange(
    public var srcFd: S64,
    public var srcOffset: U64,
    public var srcLength: U64,
    public var destOffset: U64,
)

// linux/filter.h
public open class SockFilter(
    public var code: U16,
    public var jt: U8,
    public var jf: U8,
    public var k: U32,
)

public open class SockFprog(public var len: CUshort, public var filter: SockFilter?)

public open class Statx(
    public var stxMask: U32,
    public var stxBlksize: U32,
    public var stxAttributes: U64,
    public var stxNlink: U32,
    public var stxUid: U32,
    public var stxGid: U32,
    public var stxMode: U16,
    public var statxPad1: List<U16>,
    public var stxIno: U64,
    public var stxSize: U64,
    public var stxBlocks: U64,
    public var stxAttributesMask: U64,
    public var stxAtime: StatxTimestamp,
    public var stxBtime: StatxTimestamp,
    public var stxCtime: StatxTimestamp,
    public var stxMtime: StatxTimestamp,
    public var stxRdevMajor: U32,
    public var stxRdevMinor: U32,
    public var stxDevMajor: U32,
    public var stxDevMinor: U32,
    public var stxMntId: U64,
    public var stxDioMemAlign: U32,
    public var stxDioOffsetAlign: U32,
    public var statxPad3: List<U64>,
)

public open class StatxTimestamp(
    public var tvSec: S64,
    public var tvNsec: U32,
    public var statxTimestampPad1: List<S32>,
)

public open class EpollEvent(public var events: UInt, public var u64: ULong) {
    public open fun eq(other: EpollEvent): Boolean {
        return this.events == other.events && this.u64 == other.u64
    }

    public override fun hashCode(): Int {
        var state = 0
        val events = this.events
        val u64 = this.u64
        state = 31 * state + (events).hashCode()
        state = 31 * state + (u64).hashCode()
        return state
    }
}

public open class Sigevent(
    public var sigevValue: Sigval,
    public var sigevSigno: CInt,
    public var sigevNotify: CInt,
    // Actually a union.  We only expose sigevNotifyThreadId because it's
    // the most useful member
    public var sigevNotifyThreadId: CInt,
    public var unused1: List<CInt>,
) {
    public open fun eq(other: Sigevent): Boolean {
        return this.sigevValue == other.sigevValue && this.sigevSigno == other.sigevSigno && this.sigevNotify == other.sigevNotify && this.sigevNotifyThreadId == other.sigevNotifyThreadId
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.sigevValue).hashCode()
        state = 31 * state + (this.sigevSigno).hashCode()
        state = 31 * state + (this.sigevNotify).hashCode()
        state = 31 * state + (this.sigevNotifyThreadId).hashCode()
        return state
    }
}
