@file:OptIn(ExperimentalUnsignedTypes::class)
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
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.hurd.b64.ElfAddr
import io.github.kotlinmania.libc.unix.hurd.b64.ElfHalf
import io.github.kotlinmania.libc.unix.hurd.b64.ElfPhdr

// structs
// functions
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

public data class Sockaddr(
    public var saLen: CUchar = 0u,
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saLen != other.saLen) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saLen.hashCode()
        result = 31 * result + this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }
}

public data class InAddr(public var sAddr: InAddrT = 0u)

public data class SockaddrIn(
    public var sinLen: CUchar = 0u,
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinLen != other.sinLen) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinLen.hashCode()
        result = 31 * result + this.sinFamily.hashCode()
        result = 31 * result + this.sinPort.hashCode()
        result = 31 * result + this.sinAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class SockaddrIn6(
    public var sin6Len: CUchar = 0u,
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

public data class SockaddrUn(
    public var sunLen: CUchar = 0u,
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(108),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunLen != other.sunLen) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunLen.hashCode()
        result = 31 * result + this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }
}

public data class SockaddrStorage(
    public var ssLen: CUchar = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPadding: UByteArray = UByteArray(122),
    public var ssAlign: Uint32T = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssLen != other.ssLen) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPadding.contentEquals(other.ssPadding)) return false
        if (this.ssAlign != other.ssAlign) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssLen.hashCode()
        result = 31 * result + this.ssFamily.hashCode()
        result = 31 * result + this.ssPadding.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        return result
    }
}

public data class SockaddrAt(public var address: UByte = 0u)

public data class SockaddrAx25(public var address: UByte = 0u)

public data class SockaddrX25(public var address: UByte = 0u)

public data class SockaddrDl(public var address: UByte = 0u)

public data class SockaddrEon(public var address: UByte = 0u)

public data class SockaddrInarp(public var address: UByte = 0u)

public data class SockaddrIpx(public var address: UByte = 0u)

public data class SockaddrIso(public var address: UByte = 0u)

public data class SockaddrNs(public var address: UByte = 0u)

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

public data class Msghdr(
    public var msgName: COpaquePointer? = null,
    public var msgNamelen: SocklenT = 0u,
    public var msgIov: Iovec? = null,
    public var msgIovlen: CInt = 0,
    public var msgControl: COpaquePointer? = null,
    public var msgControllen: SocklenT = 0u,
    public var msgFlags: CInt = 0,
)

public data class Cmsghdr(
    public var cmsgLen: SocklenT = 0u,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
)

public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dReclen: CUshort = 0u,
    public var dType: CUchar = 0u,
    public var dNamlen: CUchar = 0u,
    public var dName: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (this.dNamlen != other.dNamlen) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class Dirent64(
    public var dIno: Ino64T = 0uL,
    public var dReclen: CUshort = 0u,
    public var dType: CUchar = 0u,
    public var dNamlen: CUchar = 0u,
    public var dName: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent64) return false
        if (this.dIno != other.dIno) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (this.dNamlen != other.dNamlen) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class FdSet(public var fdsBits: LongArray = LongArray(8)) {
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

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cCc: UByteArray = UByteArray(20),
    public var ispeed: SpeedT = 0,
    public var ospeed: SpeedT = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        if (this.ispeed != other.ispeed) return false
        if (this.ospeed != other.ospeed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.ispeed.hashCode()
        result = 31 * result + this.ospeed.hashCode()
        return result
    }
}

public data class Mallinfo(
    public var arena: CInt = 0,
    public var ordblks: CInt = 0,
    public var smblks: CInt = 0,
    public var hblks: CInt = 0,
    public var hblkhd: CInt = 0,
    public var usmblks: CInt = 0,
    public var fsmblks: CInt = 0,
    public var uordblks: CInt = 0,
    public var fordblks: CInt = 0,
    public var keepcost: CInt = 0,
)

public data class Mallinfo2(
    public var arena: SizeT = 0uL,
    public var ordblks: SizeT = 0uL,
    public var smblks: SizeT = 0uL,
    public var hblks: SizeT = 0uL,
    public var hblkhd: SizeT = 0uL,
    public var usmblks: SizeT = 0uL,
    public var fsmblks: SizeT = 0uL,
    public var uordblks: SizeT = 0uL,
    public var fordblks: SizeT = 0uL,
    public var keepcost: SizeT = 0uL,
)

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = 0uL,
    public var saFlags: CInt = 0,
)

public data class Sigevent(
    public var sigevValue: Sigval = Sigval(),
    public var sigevSigno: CInt = 0,
    public var sigevNotify: CInt = 0,
    public var unused1: COpaquePointer? = null,
    // actually a function pointer
    public var sigevNotifyAttributes: PthreadAttr? = null,
)

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siErrno: CInt = 0,
    public var siCode: CInt = 0,
    public var siPid: PidT = 0,
    public var siUid: UidT = 0u,
    public var siAddr: COpaquePointer? = null,
    public var siStatus: CInt = 0,
    public var siBand: CLong = 0L,
    public var siValue: Sigval = Sigval(),
) {
    public fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public fun siValue(): Sigval {
        return this.siValue
    }

    public fun siPid(): PidT {
        return this.siPid
    }

    public fun siUid(): UidT {
        return this.siUid
    }

    public fun siStatus(): CInt {
        return this.siStatus
    }
}

public data class Timespec(public var tvSec: TimeT = 0L, public var tvNsec: SyscallSlongT = 0L)

public data class Timeval(public var tvSec: Int = 0, public var tvUsec: Int = 0)

public data class LocaleData(public var address: UByte = 0u)

public class Stat(
    public var stFstype: CInt = 0,
    public var stDev: FsidT = 0uL,
    // Actually stFsid
    public var stIno: InoT = 0uL,
    public var stGen: CUint = 0u,
    public var stRdev: DevT = 0u,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stSize: OffT = 0L,
    public var stAtim: Timespec = Timespec(),
    public var stMtim: Timespec = Timespec(),
    public var stCtim: Timespec = Timespec(),
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stAuthor: UidT = 0u,
    public var stFlags: CUint = 0u,
    public var stSpare: IntArray = IntArray(11),
)

public class Stat64(
    public var stFstype: CInt = 0,
    public var stDev: FsidT = 0uL,
    // Actually stFsid
    public var stIno: Ino64T = 0uL,
    public var stGen: CUint = 0u,
    public var stRdev: DevT = 0u,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stSize: Off64T = 0L,
    public var stAtim: Timespec = Timespec(),
    public var stMtim: Timespec = Timespec(),
    public var stCtim: Timespec = Timespec(),
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: Blkcnt64T = 0L,
    public var stAuthor: UidT = 0u,
    public var stFlags: CUint = 0u,
    public var stSpare: IntArray = IntArray(8),
)

public class Statx(
    public var stxMask: UInt = 0u,
    public var stxBlksize: UInt = 0u,
    public var stxAttributes: ULong = 0uL,
    public var stxNlink: UInt = 0u,
    public var stxUid: UInt = 0u,
    public var stxGid: UInt = 0u,
    public var stxMode: UShort = 0u,
    public var statxPad1: UShortArray = UShortArray(1),
    public var stxIno: ULong = 0uL,
    public var stxSize: ULong = 0uL,
    public var stxBlocks: ULong = 0uL,
    public var stxAttributesMask: ULong = 0uL,
    public var stxAtime: StatxTimestamp = StatxTimestamp(),
    public var stxBtime: StatxTimestamp = StatxTimestamp(),
    public var stxCtime: StatxTimestamp = StatxTimestamp(),
    public var stxMtime: StatxTimestamp = StatxTimestamp(),
    public var stxRdevMajor: UInt = 0u,
    public var stxRdevMinor: UInt = 0u,
    public var stxDevMajor: UInt = 0u,
    public var stxDevMinor: UInt = 0u,
    public var statxPad2: ULongArray = ULongArray(14),
)

public data class StatxTimestamp(
    public var tvSec: Long = 0L,
    public var tvNsec: UInt = 0u,
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

public data class Statfs(
    public var fType: CUint = 0u,
    public var fBsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsblkcntT = 0uL,
    public var fFfree: FsblkcntT = 0uL,
    public var fFsid: FsidT = 0uL,
    public var fNamelen: CUlong = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fSpare: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statfs) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamelen != other.fNamelen) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fFlag != other.fFlag) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamelen.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Statfs64(
    public var fType: CUint = 0u,
    public var fBsize: CUlong = 0uL,
    public var fBlocks: Fsblkcnt64T = 0uL,
    public var fBfree: Fsblkcnt64T = 0uL,
    public var fBavail: Fsblkcnt64T = 0uL,
    public var fFiles: Fsblkcnt64T = 0uL,
    public var fFfree: Fsblkcnt64T = 0uL,
    public var fFsid: FsidT = 0uL,
    public var fNamelen: CUlong = 0uL,
    public var fFavail: Fsfilcnt64T = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fSpare: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statfs64) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamelen != other.fNamelen) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fFlag != other.fFlag) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamelen.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Statvfs(
    public var fType: CUint = 0u,
    public var fBsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFsid: FsidT = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fSpare: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamemax != other.fNamemax) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fFlag != other.fFlag) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Statvfs64(
    public var fType: CUint = 0u,
    public var fBsize: CUlong = 0uL,
    public var fBlocks: Fsblkcnt64T = 0uL,
    public var fBfree: Fsblkcnt64T = 0uL,
    public var fBavail: Fsblkcnt64T = 0uL,
    public var fFiles: Fsfilcnt64T = 0uL,
    public var fFfree: Fsfilcnt64T = 0uL,
    public var fFsid: FsidT = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fFavail: Fsfilcnt64T = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fSpare: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs64) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamemax != other.fNamemax) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fFlag != other.fFlag) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Aiocb(
    public var aioFildes: CInt = 0,
    public var aioLioOpcode: CInt = 0,
    public var aioReqprio: CInt = 0,
    public var aioBuf: COpaquePointer? = null,
    public var aioNbytes: SizeT = 0uL,
    public var aioSigevent: Sigevent = Sigevent(),
    public var nextPrio: Aiocb? = null,
    public var absPrio: CInt = 0,
    public var policy: CInt = 0,
    public var errorCode: CInt = 0,
    public var returnValue: SsizeT = 0,
    public var aioOffset: OffT = 0L,
    public var glibcReserved: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (this.aioSigevent != other.aioSigevent) return false
        if (this.nextPrio != other.nextPrio) return false
        if (this.absPrio != other.absPrio) return false
        if (this.policy != other.policy) return false
        if (this.errorCode != other.errorCode) return false
        if (this.returnValue != other.returnValue) return false
        if (this.aioOffset != other.aioOffset) return false
        if (!this.glibcReserved.contentEquals(other.glibcReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioFildes.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.nextPrio.hashCode()
        result = 31 * result + this.absPrio.hashCode()
        result = 31 * result + this.policy.hashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.returnValue.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.glibcReserved.contentHashCode()
        return result
    }
}

public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
)

public data class ExitStatus(public var eTermination: CShort = 0, public var eExit: CShort = 0)

public data class SemT(public var size: UByteArray = UByteArray(20)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class Pthread(public var address: UByte = 0u)

public data class PthreadMutexattr(
    public var prioceiling: CInt = 0,
    public var protocol: PthreadMutexProtocol = 0u,
    public var pshared: PthreadProcessShared = 0u,
    public var mutexType: PthreadMutexType = 0u,
)

public data class PthreadMutex(
    public var lock: CUint = 0u,
    public var ownerId: CUint = 0u,
    public var cnt: CUint = 0u,
    public var shpid: CInt = 0,
    public var type: CInt = 0,
    public var flags: CInt = 0,
    public var reserved1: CUint = 0u,
    public var reserved2: CUint = 0u,
)

public data class PthreadCondattr(public var pshared: PthreadProcessShared = 0u, public var clock: ClockidT = 0)

public data class PthreadRwlockattr(public var pshared: PthreadProcessShared = 0u)

public data class PthreadBarrierattr(public var pshared: PthreadProcessShared = 0u)

public data class PthreadOnce(public var run: CInt = 0, public var lock: PthreadSpinlockT = 0)

public data class PthreadCond(
    public var lock: PthreadSpinlockT = 0,
    public var queue: Pthread? = null,
    public var attr: PthreadCondattr? = null,
    public var wrefs: CUint = 0u,
    public var data: COpaquePointer? = null,
)

public data class PthreadAttr(
    public var schedparam: SchedParam = SchedParam(),
    public var stackaddr: COpaquePointer? = null,
    public var stacksize: SizeT = 0uL,
    public var guardsize: SizeT = 0uL,
    public var detachstate: PthreadDetachstate = 0u,
    public var inheritsched: PthreadInheritsched = 0u,
    public var contentionscope: PthreadContentionscope = 0u,
    public var schedpolicy: CInt = 0,
)

public data class PthreadRwlock(
    public var held: PthreadSpinlockT = 0,
    public var lock: PthreadSpinlockT = 0,
    public var readers: CInt = 0,
    public var readerqueue: Pthread? = null,
    public var writerqueue: Pthread? = null,
    public var attr: PthreadRwlockattr? = null,
    public var data: COpaquePointer? = null,
)

public data class PthreadBarrier(
    public var lock: PthreadSpinlockT = 0,
    public var queue: Pthread? = null,
    public var pending: CUint = 0u,
    public var count: CUint = 0u,
    public var attr: PthreadBarrierattr? = null,
    public var data: COpaquePointer? = null,
)

public data class Seminfo(
    public var semmap: CInt = 0,
    public var semmni: CInt = 0,
    public var semmns: CInt = 0,
    public var semmnu: CInt = 0,
    public var semmsl: CInt = 0,
    public var semopm: CInt = 0,
    public var semume: CInt = 0,
    public var semusz: CInt = 0,
    public var semvmx: CInt = 0,
    public var semaem: CInt = 0,
)

public data class IoFile(public var unused: UByteArray = UByteArray(0)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoFile) return false
        if (!this.unused.contentEquals(other.unused)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.unused.contentHashCode()
    }
}

public data class SchedParam(public var schedPriority: CInt = 0)

public data class Iovec(public var iovBase: COpaquePointer? = null, public var iovLen: SizeT = 0uL)

public data class Passwd(
    public var pwName: COpaquePointer? = null,
    public var pwPasswd: COpaquePointer? = null,
    public var pwUid: UidT = 0u,
    public var pwGid: GidT = 0u,
    public var pwGecos: COpaquePointer? = null,
    public var pwDir: COpaquePointer? = null,
    public var pwShell: COpaquePointer? = null,
)

public data class Spwd(
    public var spNamp: COpaquePointer? = null,
    public var spPwdp: COpaquePointer? = null,
    public var spLstchg: CLong = 0L,
    public var spMin: CLong = 0L,
    public var spMax: CLong = 0L,
    public var spWarn: CLong = 0L,
    public var spInact: CLong = 0L,
    public var spExpire: CLong = 0L,
    public var spFlag: CUlong = 0uL,
)

public data class Itimerspec(public var itInterval: Timespec = Timespec(), public var itValue: Timespec = Timespec())

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

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
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

public data class ArpdRequest(
    public var req: CUshort = 0u,
    public var ip: UInt = 0u,
    public var dev: CUlong = 0uL,
    public var stamp: CUlong = 0uL,
    public var updated: CUlong = 0uL,
    public var ha: UByteArray = UByteArray((MAX_ADDR_LEN).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArpdRequest) return false
        if (this.req != other.req) return false
        if (this.ip != other.ip) return false
        if (this.dev != other.dev) return false
        if (this.stamp != other.stamp) return false
        if (this.updated != other.updated) return false
        if (!this.ha.contentEquals(other.ha)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.req.hashCode()
        result = 31 * result + this.ip.hashCode()
        result = 31 * result + this.dev.hashCode()
        result = 31 * result + this.stamp.hashCode()
        result = 31 * result + this.updated.hashCode()
        result = 31 * result + this.ha.contentHashCode()
        return result
    }
}

public data class Mmsghdr(public var msgHdr: Msghdr = Msghdr(), public var msgLen: CUint = 0u)

public data class Ifreq(
    /**
     * interface name, e.g. "en0"
     */
    public var ifrName: UByteArray = UByteArray((IFNAMSIZ).toInt()),
    public var ifrIfru: Sockaddr = Sockaddr(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifreq) return false
        if (!this.ifrName.contentEquals(other.ifrName)) return false
        if (this.ifrIfru != other.ifrIfru) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrName.contentHashCode()
        result = 31 * result + this.ifrIfru.hashCode()
        return result
    }
}

public data class LocaleStruct(
    public var locales: List<LocaleData?> = List(13) { null },
    public var ctypeB: CUshort? = null,
    public var ctypeTolower: CInt? = null,
    public var ctypeToupper: CInt? = null,
    public var names: List<COpaquePointer?> = List(13) { null },
)

public data class Utsname(
    public var sysname: UByteArray = UByteArray(UTSNAME_LENGTH),
    public var nodename: UByteArray = UByteArray(UTSNAME_LENGTH),
    public var release: UByteArray = UByteArray(UTSNAME_LENGTH),
    public var version: UByteArray = UByteArray(UTSNAME_LENGTH),
    public var machine: UByteArray = UByteArray(UTSNAME_LENGTH),
    public var domainname: UByteArray = UByteArray(UTSNAME_LENGTH),
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

public data class Rlimit64(public var rlimCur: Rlim64T = 0uL, public var rlimMax: Rlim64T = 0uL)

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssSize: SizeT = 0uL,
    public var ssFlags: CInt = 0,
)

public data class DlPhdrInfo(
    public var dlpiAddr: ElfAddr = 0uL,
    public var dlpiName: COpaquePointer? = null,
    public var dlpiPhdr: ElfPhdr? = null,
    public var dlpiPhnum: ElfHalf = 0u,
    public var dlpiAdds: CUlonglong = 0uL,
    public var dlpiSubs: CUlonglong = 0uL,
    public var dlpiTlsModid: SizeT = 0uL,
    public var dlpiTlsData: COpaquePointer? = null,
)

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
)

public data class Flock64(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: Off64T = 0L,
    public var lPid: PidT = 0,
)

public data class GlobT(
    public var glPathc: SizeT = 0uL,
    public var glPathv: COpaquePointer? = null,
    public var glOffs: SizeT = 0uL,
    public var glFlags: CInt = 0,
    public var unused1: COpaquePointer? = null,
    public var unused2: COpaquePointer? = null,
    public var unused3: COpaquePointer? = null,
    public var unused4: COpaquePointer? = null,
    public var unused5: COpaquePointer? = null,
)

public data class Glob64T(
    public var glPathc: SizeT = 0uL,
    public var glPathv: COpaquePointer? = null,
    public var glOffs: SizeT = 0uL,
    public var glFlags: CInt = 0,
    public var unused1: COpaquePointer? = null,
    public var unused2: COpaquePointer? = null,
    public var unused3: COpaquePointer? = null,
    public var unused4: COpaquePointer? = null,
    public var unused5: COpaquePointer? = null,
)

public data class RegexT(
    public var buffer: COpaquePointer? = null,
    public var allocated: SizeT = 0uL,
    public var used: SizeT = 0uL,
    public var syntax: CUlong = 0uL,
    public var fastmap: COpaquePointer? = null,
    public var translate: COpaquePointer? = null,
    public var reNsub: SizeT = 0uL,
    public var bitfield: UByte = 0u,
)

public data class CpuSetT(public var bits: ULongArray = ULongArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuSetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bits.contentHashCode()
    }
}

public data class IfNameindex(public var ifIndex: CUint = 0u, public var ifName: COpaquePointer? = null)

// System V IPC
public data class Msginfo(
    public var msgpool: CInt = 0,
    public var msgmap: CInt = 0,
    public var msgmax: CInt = 0,
    public var msgmnb: CInt = 0,
    public var msgmni: CInt = 0,
    public var msgssz: CInt = 0,
    public var msgtql: CInt = 0,
    public var msgseg: CUshort = 0u,
)

public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
)

public data class Mntent(
    public var mntFsname: COpaquePointer? = null,
    public var mntDir: COpaquePointer? = null,
    public var mntType: COpaquePointer? = null,
    public var mntOpts: COpaquePointer? = null,
    public var mntFreq: CInt = 0,
    public var mntPassno: CInt = 0,
)

public data class PosixSpawnFileActionsT(
    public var allocated: CInt = 0,
    public var used: CInt = 0,
    public var actions: CInt? = null,
    public var pad: IntArray = IntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PosixSpawnFileActionsT) return false
        if (this.allocated != other.allocated) return false
        if (this.used != other.used) return false
        if (this.actions != other.actions) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.allocated.hashCode()
        result = 31 * result + this.used.hashCode()
        result = 31 * result + this.actions.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}

public data class PosixSpawnattrT(
    public var flags: CShort = 0,
    public var pgrp: PidT = 0,
    public var sd: SigsetT = 0uL,
    public var ss: SigsetT = 0uL,
    public var sp: SchedParam = SchedParam(),
    public var policy: CInt = 0,
    public var pad: IntArray = IntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PosixSpawnattrT) return false
        if (this.flags != other.flags) return false
        if (this.pgrp != other.pgrp) return false
        if (this.sd != other.sd) return false
        if (this.ss != other.ss) return false
        if (this.sp != other.sp) return false
        if (this.policy != other.policy) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.pgrp.hashCode()
        result = 31 * result + this.sd.hashCode()
        result = 31 * result + this.ss.hashCode()
        result = 31 * result + this.sp.hashCode()
        result = 31 * result + this.policy.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}

public data class RegmatchT(public var rmSo: RegoffT = 0, public var rmEo: RegoffT = 0)

public data class Option(
    public var name: COpaquePointer? = null,
    public var hasArg: CInt = 0,
    public var flag: CInt? = null,
    public var value: CInt = 0,
)

public data class Utmpx(
    public var utType: CShort = 0,
    public var utPid: PidT = 0,
    public var utLine: UByteArray = UByteArray(UT_LINESIZE),
    public var utId: UByteArray = UByteArray(4),
    public var utUser: UByteArray = UByteArray(UT_NAMESIZE),
    public var utHost: UByteArray = UByteArray(UT_HOSTSIZE),
    public var utExit: ExitStatus = ExitStatus(),
    public var utSession: Int = 0,
    public var utTv: Timeval = Timeval(),
    public var utAddrV6: IntArray = IntArray(4),
    public var glibcReserved: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (this.utType != other.utType) return false
        if (this.utPid != other.utPid) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.utExit != other.utExit) return false
        if (this.utSession != other.utSession) return false
        if (this.utTv != other.utTv) return false
        if (!this.utAddrV6.contentEquals(other.utAddrV6)) return false
        if (!this.glibcReserved.contentEquals(other.glibcReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utType.hashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utUser.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utExit.hashCode()
        result = 31 * result + this.utSession.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utAddrV6.contentHashCode()
        result = 31 * result + this.glibcReserved.contentHashCode()
        return result
    }
}
