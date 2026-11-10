@file:OptIn(ExperimentalUnsignedTypes::class)
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
public data class InAddr(public var sAddr: InAddrT = 0u)

public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

public data class IpMreqn(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrAddress: InAddr = InAddr(),
    public var imrIfindex: CInt = 0,
)

public data class IpMreqSource(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
    public var imrSourceaddr: InAddr = InAddr(),
)

public data class Sockaddr(public var saFamily: SaFamilyT = 0u, public var saData: UByteArray = UByteArray(14)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }
}

public data class SockaddrIn(
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinFamily.hashCode()
        result = 31 * result + this.sinPort.hashCode()
        result = 31 * result + this.sinAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class SockaddrIn6(
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

// The order of the `aiAddr` field in this struct is crucial
// for converting between the Rust and C types.
public data class Addrinfo(
    public var aiFlags: CInt = 0,
    public var aiFamily: CInt = 0,
    public var aiSocktype: CInt = 0,
    public var aiProtocol: CInt = 0,
    public var aiAddrlen: SocklenT = 0u,
    public var aiAddr: Sockaddr? = null,
    public var aiCanonname: COpaquePointer? = null,
    public var aiNext: Addrinfo? = null,
)

public data class SockaddrLl(
    public var sllFamily: CUshort = 0u,
    public var sllProtocol: CUshort = 0u,
    public var sllIfindex: CInt = 0,
    public var sllHatype: CUshort = 0u,
    public var sllPkttype: CUchar = 0u,
    public var sllHalen: CUchar = 0u,
    public var sllAddr: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrLl) return false
        if (this.sllFamily != other.sllFamily) return false
        if (this.sllProtocol != other.sllProtocol) return false
        if (this.sllIfindex != other.sllIfindex) return false
        if (this.sllHatype != other.sllHatype) return false
        if (this.sllPkttype != other.sllPkttype) return false
        if (this.sllHalen != other.sllHalen) return false
        if (!this.sllAddr.contentEquals(other.sllAddr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sllFamily.hashCode()
        result = 31 * result + this.sllProtocol.hashCode()
        result = 31 * result + this.sllIfindex.hashCode()
        result = 31 * result + this.sllHatype.hashCode()
        result = 31 * result + this.sllPkttype.hashCode()
        result = 31 * result + this.sllHalen.hashCode()
        result = 31 * result + this.sllAddr.contentHashCode()
        return result
    }
}

public data class FdSet(public var fdsBits: ULongArray = ULongArray(FD_SETSIZE / ULONG_SIZE)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (!this.fdsBits.contentEquals(other.fdsBits)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.fdsBits.contentHashCode()
    }
}

public data class Tm(
    public var tmSec: CInt = 0,
    public var tmMin: CInt = 0,
    public var tmHour: CInt = 0,
    public var tmMday: CInt = 0,
    public var tmMon: CInt = 0,
    public var tmYear: CInt = 0,
    public var tmWday: CInt = 0,
    public var tmYday: CInt = 0,
    public var tmIsdst: CInt = 0,
    public var tmGmtoff: CLong = 0L,
    public var tmZone: COpaquePointer? = null,
)

public data class SchedParam(public var schedPriority: CInt = 0)

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
)

public class Lconv(
    public var decimalPoint: COpaquePointer? = null,
    public var thousandsSep: COpaquePointer? = null,
    public var grouping: COpaquePointer? = null,
    public var intCurrSymbol: COpaquePointer? = null,
    public var currencySymbol: COpaquePointer? = null,
    public var monDecimalPoint: COpaquePointer? = null,
    public var monThousandsSep: COpaquePointer? = null,
    public var monGrouping: COpaquePointer? = null,
    public var positiveSign: COpaquePointer? = null,
    public var negativeSign: COpaquePointer? = null,
    public var intFracDigits: CChar = 0u,
    public var fracDigits: CChar = 0u,
    public var pCsPrecedes: CChar = 0u,
    public var pSepBySpace: CChar = 0u,
    public var nCsPrecedes: CChar = 0u,
    public var nSepBySpace: CChar = 0u,
    public var pSignPosn: CChar = 0u,
    public var nSignPosn: CChar = 0u,
    public var intPCsPrecedes: CChar = 0u,
    public var intPSepBySpace: CChar = 0u,
    public var intNCsPrecedes: CChar = 0u,
    public var intNSepBySpace: CChar = 0u,
    public var intPSignPosn: CChar = 0u,
    public var intNSignPosn: CChar = 0u,
)

public data class InPktinfo(
    public var ipiIfindex: CInt = 0,
    public var ipiSpecDst: InAddr = InAddr(),
    public var ipiAddr: InAddr = InAddr(),
)

public data class Ifaddrs(
    public var ifaNext: Ifaddrs? = null,
    public var ifaName: COpaquePointer? = null,
    public var ifaFlags: CUint = 0u,
    public var ifaAddr: Sockaddr? = null,
    public var ifaNetmask: Sockaddr? = null,
    public var ifaIfu: Sockaddr? = null,
    // Note(union) This should be a union
    public var ifaData: COpaquePointer? = null,
)

public data class In6Rtmsg(
    public var rtmsgDst: In6Addr = In6Addr(),
    public var rtmsgSrc: In6Addr = In6Addr(),
    public var rtmsgGateway: In6Addr = In6Addr(),
    public var rtmsgType: UInt = 0u,
    public var rtmsgDstLen: UShort = 0u,
    public var rtmsgSrcLen: UShort = 0u,
    public var rtmsgMetric: UInt = 0u,
    public var rtmsgInfo: CUlong = 0uL,
    public var rtmsgFlags: UInt = 0u,
    public var rtmsgIfindex: CInt = 0,
)

public data class Arpreq(
    public var arpPa: Sockaddr = Sockaddr(),
    public var arpHa: Sockaddr = Sockaddr(),
    public var arpFlags: CInt = 0,
    public var arpNetmask: Sockaddr = Sockaddr(),
    public var arpDev: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Arpreq) return false
        if (this.arpPa != other.arpPa) return false
        if (this.arpHa != other.arpHa) return false
        if (this.arpFlags != other.arpFlags) return false
        if (this.arpNetmask != other.arpNetmask) return false
        if (!this.arpDev.contentEquals(other.arpDev)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.arpPa.hashCode()
        result = 31 * result + this.arpHa.hashCode()
        result = 31 * result + this.arpFlags.hashCode()
        result = 31 * result + this.arpNetmask.hashCode()
        result = 31 * result + this.arpDev.contentHashCode()
        return result
    }
}

public data class ArpreqOld(
    public var arpPa: Sockaddr = Sockaddr(),
    public var arpHa: Sockaddr = Sockaddr(),
    public var arpFlags: CInt = 0,
    public var arpNetmask: Sockaddr = Sockaddr(),
)

public data class Arphdr(
    public var arHrd: UShort = 0u,
    public var arPro: UShort = 0u,
    public var arHln: UByte = 0u,
    public var arPln: UByte = 0u,
    public var arOp: UShort = 0u,
)

public data class Mmsghdr(public var msgHdr: Msghdr = Msghdr(), public var msgLen: CUint = 0u)

public data class SockaddrUn(public var sunFamily: SaFamilyT = 0u, public var sunPath: UByteArray = UByteArray(108)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }
}

public data class SockaddrStorage(
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad2: UByteArray = UByteArray((128 - 2 - 8).toInt()),
    public var ssAlign: SizeT = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        if (this.ssAlign != other.ssAlign) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssPad2.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        return result
    }
}

public data class Utsname(
    public var sysname: UByteArray = UByteArray(65),
    public var nodename: UByteArray = UByteArray(65),
    public var release: UByteArray = UByteArray(65),
    public var version: UByteArray = UByteArray(65),
    public var machine: UByteArray = UByteArray(65),
    public var domainname: UByteArray = UByteArray(65),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utsname) return false
        if (!this.sysname.contentEquals(other.sysname)) return false
        if (!this.nodename.contentEquals(other.nodename)) return false
        if (!this.release.contentEquals(other.release)) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.machine.contentEquals(other.machine)) return false
        if (!this.domainname.contentEquals(other.domainname)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sysname.contentHashCode()
        result = 31 * result + this.nodename.contentHashCode()
        result = 31 * result + this.release.contentHashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.machine.contentHashCode()
        result = 31 * result + this.domainname.contentHashCode()
        return result
    }
}

public data class IfNameindex(public var ifIndex: CUint = 0u, public var ifName: COpaquePointer? = null)

public data class FileCloneRange(
    public var srcFd: S64 = 0L,
    public var srcOffset: U64 = 0uL,
    public var srcLength: U64 = 0uL,
    public var destOffset: U64 = 0uL,
)

// linux/filter.h
public data class SockFilter(
    public var code: U16 = 0u,
    public var jt: U8 = 0u,
    public var jf: U8 = 0u,
    public var k: U32 = 0u,
)

public data class SockFprog(public var len: CUshort = 0u, public var filter: SockFilter? = null)

public class Statx(
    public var stxMask: U32 = 0u,
    public var stxBlksize: U32 = 0u,
    public var stxAttributes: U64 = 0uL,
    public var stxNlink: U32 = 0u,
    public var stxUid: U32 = 0u,
    public var stxGid: U32 = 0u,
    public var stxMode: U16 = 0u,
    public var statxPad1: UShortArray = UShortArray(1),
    public var stxIno: U64 = 0uL,
    public var stxSize: U64 = 0uL,
    public var stxBlocks: U64 = 0uL,
    public var stxAttributesMask: U64 = 0uL,
    public var stxAtime: StatxTimestamp = StatxTimestamp(),
    public var stxBtime: StatxTimestamp = StatxTimestamp(),
    public var stxCtime: StatxTimestamp = StatxTimestamp(),
    public var stxMtime: StatxTimestamp = StatxTimestamp(),
    public var stxRdevMajor: U32 = 0u,
    public var stxRdevMinor: U32 = 0u,
    public var stxDevMajor: U32 = 0u,
    public var stxDevMinor: U32 = 0u,
    public var stxMntId: U64 = 0uL,
    public var stxDioMemAlign: U32 = 0u,
    public var stxDioOffsetAlign: U32 = 0u,
    public var statxPad3: ULongArray = ULongArray(12),
)

public data class StatxTimestamp(
    public var tvSec: S64 = 0L,
    public var tvNsec: U32 = 0u,
    public var statxTimestampPad1: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StatxTimestamp) return false
        if (this.tvSec != other.tvSec) return false
        if (this.tvNsec != other.tvNsec) return false
        if (!this.statxTimestampPad1.contentEquals(other.statxTimestampPad1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tvSec.hashCode()
        result = 31 * result + this.tvNsec.hashCode()
        result = 31 * result + this.statxTimestampPad1.contentHashCode()
        return result
    }
}

public data class EpollEvent(public var events: UInt = 0u, public var u64: ULong = 0uL) {
    public fun eq(other: EpollEvent): Boolean {
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

public data class Sigevent(
    public var sigevValue: Sigval = Sigval(),
    public var sigevSigno: CInt = 0,
    public var sigevNotify: CInt = 0,
    // Actually a union.  We only expose sigevNotifyThreadId because it's
    // the most useful member
    public var sigevNotifyThreadId: CInt = 0,
    public var unused1: IntArray = IntArray(11),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigevent) return false
        if (this.sigevValue != other.sigevValue) return false
        if (this.sigevSigno != other.sigevSigno) return false
        if (this.sigevNotify != other.sigevNotify) return false
        if (this.sigevNotifyThreadId != other.sigevNotifyThreadId) return false
        if (!this.unused1.contentEquals(other.unused1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sigevValue.hashCode()
        result = 31 * result + this.sigevSigno.hashCode()
        result = 31 * result + this.sigevNotify.hashCode()
        result = 31 * result + this.sigevNotifyThreadId.hashCode()
        result = 31 * result + this.unused1.contentHashCode()
        return result
    }

    public fun eq(other: Sigevent): Boolean {
        return this.sigevValue == other.sigevValue && this.sigevSigno == other.sigevSigno && this.sigevNotify == other.sigevNotify && this.sigevNotifyThreadId == other.sigevNotifyThreadId
    }
}
