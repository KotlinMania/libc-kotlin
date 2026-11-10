@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix

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
import io.github.kotlinmania.libc.Int64T
import io.github.kotlinmania.libc.Uint16T
import io.github.kotlinmania.libc.Uint32T
import io.github.kotlinmania.libc.Uint64T
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SigsetT

public fun interface SigeventSigevNotifyFunctionCallback {
    public operator fun invoke(value: Sigval)
}

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct =
        apply {
            fields.add("$name: $value")
        }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append("$name { ${fields.joinToString(", ")} }")
        }
    }

    public fun finishNonExhaustive() {
        fields.add("..")
        finish()
    }
}

public data class FsidT(
    public var value: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsidT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()
}

public data class Fsid64T(
    public var value: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fsid64T) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()
}

public data class Timezone(
    public var tzMinuteswest: CInt = 0,
    public var tzDsttime: CInt = 0,
)

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class Dirent(
    public var dOffset: CUlong = 0uL,
    public var dIno: InoT = 0uL,
    public var dReclen: CUshort = 0u,
    public var dNamlen: CUshort = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dOffset != other.dOffset) return false
        if (this.dIno != other.dIno) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dNamlen != other.dNamlen) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dOffset.hashCode()
        result = 31 * result + this.dIno.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cCc: UByteArray = UByteArray(NCCS),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        return result
    }
}

public data class Flock64(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lSysid: CUint = 0u,
    public var lPid: PidT = 0,
    public var lVfs: CInt = 0,
    public var lStart: Off64T = 0L,
    public var lLen: Off64T = 0L,
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

public data class Statvfs64(
    public var fBsize: Blksize64T = 0uL,
    public var fFrsize: Blksize64T = 0uL,
    public var fBlocks: Blkcnt64T = 0uL,
    public var fBfree: Blkcnt64T = 0uL,
    public var fBavail: Blkcnt64T = 0uL,
    public var fFiles: Blkcnt64T = 0uL,
    public var fFfree: Blkcnt64T = 0uL,
    public var fFavail: Blkcnt64T = 0uL,
    public var fFsid: Fsid64T = Fsid64T(),
    public var fBasetype: UByteArray = UByteArray(16),
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fFstr: UByteArray = UByteArray(32),
    public var fFiller: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs64) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFsid != other.fFsid) return false
        if (!this.fBasetype.contentEquals(other.fBasetype)) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fFstr.contentEquals(other.fFstr)) return false
        if (!this.fFiller.contentEquals(other.fFiller)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fBsize.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fBasetype.contentHashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fFstr.contentHashCode()
        result = 31 * result + this.fFiller.contentHashCode()
        return result
    }
}

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
    public var leftParenthesis: COpaquePointer? = null,
    public var rightParenthesis: COpaquePointer? = null,
    public var intPCsPrecedes: CChar = 0u,
    public var intPSepBySpace: CChar = 0u,
    public var intNCsPrecedes: CChar = 0u,
    public var intNSepBySpace: CChar = 0u,
    public var intPSignPosn: CChar = 0u,
    public var intNSignPosn: CChar = 0u,
)

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
)

public data class Addrinfo(
    public var aiFlags: CInt = 0,
    public var aiFamily: CInt = 0,
    public var aiSocktype: CInt = 0,
    public var aiProtocol: CInt = 0,
    public var aiAddrlen: CUlong = 0uL,
    public var aiCanonname: COpaquePointer? = null,
    public var aiAddr: Sockaddr? = null,
    public var aiNext: Addrinfo? = null,
    public var aiEflags: CInt = 0,
)

public data class InAddr(
    public var sAddr: InAddrT = 0u,
)

public data class IpMreqSource(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrSourceaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
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

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: CUchar = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: CUchar = 0u,
    public var sdlNlen: CUchar = 0u,
    public var sdlAlen: CUchar = 0u,
    public var sdlSlen: CUchar = 0u,
    public var sdlData: UByteArray = UByteArray(120),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrDl) return false
        if (this.sdlLen != other.sdlLen) return false
        if (this.sdlFamily != other.sdlFamily) return false
        if (this.sdlIndex != other.sdlIndex) return false
        if (this.sdlType != other.sdlType) return false
        if (this.sdlNlen != other.sdlNlen) return false
        if (this.sdlAlen != other.sdlAlen) return false
        if (this.sdlSlen != other.sdlSlen) return false
        if (!this.sdlData.contentEquals(other.sdlData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sdlLen.hashCode()
        result = 31 * result + this.sdlFamily.hashCode()
        result = 31 * result + this.sdlIndex.hashCode()
        result = 31 * result + this.sdlType.hashCode()
        result = 31 * result + this.sdlNlen.hashCode()
        result = 31 * result + this.sdlAlen.hashCode()
        result = 31 * result + this.sdlSlen.hashCode()
        result = 31 * result + this.sdlData.contentHashCode()
        return result
    }
}

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
    public var sin6Family: CUchar = 0u,
    public var sin6Port: Uint16T = 0u,
    public var sin6Flowinfo: Uint32T = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: Uint32T = 0u,
)

public data class SockaddrStorage(
    public var ssLen: CUchar = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssAlign: Int64T = 0L,
    public var ssPad2: UByteArray = UByteArray(1265),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssLen != other.ssLen) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssAlign != other.ssAlign) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssLen.hashCode()
        result = 31 * result + this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        result = 31 * result + this.ssPad2.contentHashCode()
        return result
    }
}

public data class SockaddrUn(
    public var sunLen: CUchar = 0u,
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(1023),
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

public data class StTimespec(
    public var tvSec: TimeT = 0L,
    public var tvNsec: CInt = 0,
)

public class Statfs64(
    public var fVersion: CInt = 0,
    public var fType: CInt = 0,
    public var fBsize: Blksize64T = 0uL,
    public var fBlocks: Blkcnt64T = 0uL,
    public var fBfree: Blkcnt64T = 0uL,
    public var fBavail: Blkcnt64T = 0uL,
    public var fFiles: Uint64T = 0uL,
    public var fFfree: Uint64T = 0uL,
    public var fFsid: Fsid64T = Fsid64T(),
    public var fVfstype: CInt = 0,
    public var fFsize: Blksize64T = 0uL,
    public var fVfsnumber: CInt = 0,
    public var fVfsoff: CInt = 0,
    public var fVfslen: CInt = 0,
    public var fVfsvers: CInt = 0,
    public var fFname: UByteArray = UByteArray(32),
    public var fFpack: UByteArray = UByteArray(32),
    public var fNameMax: CInt = 0,
)

public data class Passwd(
    public var pwName: COpaquePointer? = null,
    public var pwPasswd: COpaquePointer? = null,
    public var pwUid: UidT = 0u,
    public var pwGid: GidT = 0u,
    public var pwGecos: COpaquePointer? = null,
    public var pwDir: COpaquePointer? = null,
    public var pwShell: COpaquePointer? = null,
)

public data class Utsname(
    public var sysname: UByteArray = UByteArray(32),
    public var nodename: UByteArray = UByteArray(32),
    public var release: UByteArray = UByteArray(32),
    public var version: UByteArray = UByteArray(32),
    public var machine: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utsname) return false
        if (!this.sysname.contentEquals(other.sysname)) return false
        if (!this.nodename.contentEquals(other.nodename)) return false
        if (!this.release.contentEquals(other.release)) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.machine.contentEquals(other.machine)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sysname.contentHashCode()
        result = 31 * result + this.nodename.contentHashCode()
        result = 31 * result + this.release.contentHashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.machine.contentHashCode()
        return result
    }
}

public data class Xutsname(
    public var nid: CUint = 0u,
    public var reserved: CInt = 0,
    public var longnid: CUlonglong = 0uL,
)

public data class Cmsghdr(
    public var cmsgLen: SocklenT = 0u,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
)

public data class Sigevent(
    public var sigevValue: Sigval = Sigval(),
    public var sigevSigno: CInt = 0,
    public var sigevNotify: CInt = 0,
    public var sigevNotifyFunction: SigeventSigevNotifyFunctionCallback = SigeventSigevNotifyFunctionCallback { _ ->  },
    public var sigevNotifyAttributes: COpaquePointer? = null,
)

public data class Osigevent(
    public var sevtValue: COpaquePointer? = null,
    public var sevtSigno: SignalT = 0,
)

public data class PollCtl(
    public var cmd: CShort = 0,
    public var events: CShort = 0,
    public var fd: CInt = 0,
)

public data class SfParms(
    public var headerData: COpaquePointer? = null,
    public var headerLength: CUint = 0u,
    public var fileDescriptor: CInt = 0,
    public var fileSize: Uint64T = 0uL,
    public var fileOffset: Uint64T = 0uL,
    public var fileBytes: Int64T = 0L,
    public var trailerData: COpaquePointer? = null,
    public var trailerLength: CUint = 0u,
    public var bytesSent: Uint64T = 0uL,
)

public data class Mmsghdr(
    public var msgHdr: Msghdr = Msghdr(),
    public var msgLen: CUint = 0u,
)

public data class SchedParam(
    public var schedPriority: CInt = 0,
    public var schedPolicy: CInt = 0,
    public var schedReserved: IntArray = IntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchedParam) return false
        if (this.schedPriority != other.schedPriority) return false
        if (this.schedPolicy != other.schedPolicy) return false
        if (!this.schedReserved.contentEquals(other.schedReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.schedPriority.hashCode()
        result = 31 * result + this.schedPolicy.hashCode()
        result = 31 * result + this.schedReserved.contentHashCode()
        return result
    }
}

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssSize: SizeT = 0uL,
    public var ssFlags: CInt = 0,
    public var pad: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackT) return false
        if (this.ssSp != other.ssSp) return false
        if (this.ssSize != other.ssSize) return false
        if (this.ssFlags != other.ssFlags) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssSp.hashCode()
        result = 31 * result + this.ssSize.hashCode()
        result = 31 * result + this.ssFlags.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}

public data class PosixSpawnattrT(
    public var posixAttrFlags: CShort = 0,
    public var posixAttrPgroup: PidT = 0,
    public var posixAttrSigmask: SigsetT = SigsetT(),
    public var posixAttrSigdefault: SigsetT = SigsetT(),
    public var posixAttrSchedpolicy: CInt = 0,
    public var posixAttrSchedparam: SchedParam = SchedParam(),
)

public data class GlobT(
    public var glPathc: SizeT = 0uL,
    public var glPathv: COpaquePointer? = null,
    public var glOffs: SizeT = 0uL,
    public var glPadr: COpaquePointer? = null,
    public var glPtx: COpaquePointer? = null,
)

public data class Mallinfo(
    public var arena: CUlong = 0uL,
    public var ordblks: CInt = 0,
    public var smblks: CInt = 0,
    public var hblks: CInt = 0,
    public var hblkhd: CInt = 0,
    public var usmblks: CUlong = 0uL,
    public var fsmblks: CUlong = 0uL,
    public var uordblks: CUlong = 0uL,
    public var fordblks: CUlong = 0uL,
    public var keepcost: CInt = 0,
)

public data class ExitStatus(
    public var eTermination: CShort = 0,
    public var eExit: CShort = 0,
)

public data class Utmp(
    public var utUser: UByteArray = UByteArray(256),
    public var utId: UByteArray = UByteArray(14),
    public var utLine: UByteArray = UByteArray(64),
    public var utPid: PidT = 0,
    public var utType: CShort = 0,
    public var utTime: Time64T = 0L,
    public var utExit: ExitStatus = ExitStatus(),
    public var utHost: UByteArray = UByteArray(256),
    public var dblWordPad: CInt = 0,
    public var reservedA: IntArray = IntArray(2),
    public var reservedV: IntArray = IntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmp) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (this.utPid != other.utPid) return false
        if (this.utType != other.utType) return false
        if (this.utTime != other.utTime) return false
        if (this.utExit != other.utExit) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.dblWordPad != other.dblWordPad) return false
        if (!this.reservedA.contentEquals(other.reservedA)) return false
        if (!this.reservedV.contentEquals(other.reservedV)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utUser.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utType.hashCode()
        result = 31 * result + this.utTime.hashCode()
        result = 31 * result + this.utExit.hashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.dblWordPad.hashCode()
        result = 31 * result + this.reservedA.contentHashCode()
        result = 31 * result + this.reservedV.contentHashCode()
        return result
    }
}

public data class RegmatchT(
    public var rmSo: RegoffT = 0L,
    public var rmEo: RegoffT = 0L,
)

public data class RegexT(
    public var reNsub: SizeT = 0uL,
    public var reComp: COpaquePointer? = null,
    public var reCflags: CInt = 0,
    public var reErroff: SizeT = 0uL,
    public var reLen: SizeT = 0uL,
    public var reUcoll: UIntArray = UIntArray(2),
    public var reLsub: List<COpaquePointer> = List(24) { COpaquePointer(0L) },
    public var reEsub: List<COpaquePointer> = List(24) { COpaquePointer(0L) },
    public var reMap: COpaquePointer? = null,
    public var maxsub: CInt = 0,
    public var unused: List<COpaquePointer> = List(34) { COpaquePointer(0L) },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegexT) return false
        if (this.reNsub != other.reNsub) return false
        if (this.reComp != other.reComp) return false
        if (this.reCflags != other.reCflags) return false
        if (this.reErroff != other.reErroff) return false
        if (this.reLen != other.reLen) return false
        if (!this.reUcoll.contentEquals(other.reUcoll)) return false
        if (this.reLsub != other.reLsub) return false
        if (this.reEsub != other.reEsub) return false
        if (this.reMap != other.reMap) return false
        if (this.maxsub != other.maxsub) return false
        if (this.unused != other.unused) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reNsub.hashCode()
        result = 31 * result + this.reComp.hashCode()
        result = 31 * result + this.reCflags.hashCode()
        result = 31 * result + this.reErroff.hashCode()
        result = 31 * result + this.reLen.hashCode()
        result = 31 * result + this.reUcoll.contentHashCode()
        result = 31 * result + this.reLsub.hashCode()
        result = 31 * result + this.reEsub.hashCode()
        result = 31 * result + this.reMap.hashCode()
        result = 31 * result + this.maxsub.hashCode()
        result = 31 * result + this.unused.hashCode()
        return result
    }
}

public data class Rlimit64(
    public var rlimCur: Rlim64T = 0uL,
    public var rlimMax: Rlim64T = 0uL,
)

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    public var shmLpid: PidT = 0,
    public var shmCpid: PidT = 0,
    public var shmNattch: ShmattT = 0uL,
    public var shmCnattch: ShmattT = 0uL,
    public var shmAtime: TimeT = 0L,
    public var shmDtime: TimeT = 0L,
    public var shmCtime: TimeT = 0L,
    public var shmHandle: Uint32T = 0u,
    public var shmExtshm: CInt = 0,
    public var shmPagesize: Int64T = 0L,
    public var shmLba: Uint64T = 0uL,
    public var shmReserved0: Int64T = 0L,
    public var shmReserved1: Int64T = 0L,
)

public class Stat64(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0,
    public var stFlag: CUshort = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stSsize: CInt = 0,
    public var stAtim: StTimespec = StTimespec(),
    public var stMtim: StTimespec = StTimespec(),
    public var stCtim: StTimespec = StTimespec(),
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stVfstype: CInt = 0,
    public var stVfs: CUint = 0u,
    public var stType: CUint = 0u,
    public var stGen: CUint = 0u,
    public var stReserved: UIntArray = UIntArray(10),
    public var stSize: Off64T = 0L,
)

public data class Mntent(
    public var mntFsname: COpaquePointer? = null,
    public var mntDir: COpaquePointer? = null,
    public var mntType: COpaquePointer? = null,
    public var mntOpts: COpaquePointer? = null,
    public var mntFreq: CInt = 0,
    public var mntPassno: CInt = 0,
)

public data class IpcPerm(
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var seq: CUshort = 0u,
    public var reserved: CUshort = 0u,
    public var key: KeyT = 0,
)

public data class Entry(
    public var key: COpaquePointer? = null,
    public var data: COpaquePointer? = null,
)

public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
)

public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
)

public data class IfNameindex(
    public var ifIndex: CUint = 0u,
    public var ifName: COpaquePointer? = null,
)

public data class Itimerspec(
    public var itInterval: Timespec = Timespec(),
    public var itValue: Timespec = Timespec(),
)

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    // Note(union): this field is actually a union
    public var saMask: SigsetT = SigsetT(),
    public var saFlags: CInt = 0,
)

public data class PollCtlExt(
    public var version: UByte = 0u,
    public var command: UByte = 0u,
    public var events: CShort = 0,
    public var fd: CInt = 0,
    public var u: PollCtlExtU = PollCtlExtU(),
    public var reserved64: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PollCtlExt) return false
        if (this.version != other.version) return false
        if (this.command != other.command) return false
        if (this.events != other.events) return false
        if (this.fd != other.fd) return false
        if (this.u != other.u) return false
        if (!this.reserved64.contentEquals(other.reserved64)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.command.hashCode()
        result = 31 * result + this.events.hashCode()
        result = 31 * result + this.fd.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.reserved64.contentHashCode()
        return result
    }
}

public data class PollCtlExtU(
    public var addr: COpaquePointer? = null,
    public var data32: UInt = 0u,
    public var data: ULong = 0uL,
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__poll_ctl_ext_u").finishNonExhaustive()
    }

    public fun eq(other: PollCtlExtU): Boolean = this.addr == other.addr && this.data32 == other.data32 && this.data == other.data

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.addr).hashCode()
            state = 31 * state + (this.data32).hashCode()
            state = 31 * state + (this.data).hashCode()
        }
        return state
    }
}
