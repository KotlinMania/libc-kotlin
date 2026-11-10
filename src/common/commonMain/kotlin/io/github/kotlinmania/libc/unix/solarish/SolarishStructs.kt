@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
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
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct = apply {
        fields.add("$name: $value")
    }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append(name).append(" { ").append(fields.joinToString(", ")).append(" }")
        }
    }

    public fun finishNonExhaustive() {
        fields.add("..")
        finish()
    }
}

public data class InAddr(public var sAddr: InAddrT = 0u)

public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

public data class IpMreqSource(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrSourceaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class IpcPerm(
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var seq: CUint = 0u,
    public var key: KeyT = 0,
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
    public var sin6SrcId: UInt = 0u,
)

public data class InPktinfo(
    public var ipiIfindex: CUint = 0u,
    public var ipiSpecDst: InAddr = InAddr(),
    public var ipiAddr: InAddr = InAddr(),
)

public data class In6Pktinfo(public var ipi6Addr: In6Addr = In6Addr(), public var ipi6Ifindex: CUint = 0u)

public data class Passwd(
    public var pwName: COpaquePointer? = null,
    public var pwPasswd: COpaquePointer? = null,
    public var pwUid: UidT = 0u,
    public var pwGid: GidT = 0u,
    public var pwAge: COpaquePointer? = null,
    public var pwComment: COpaquePointer? = null,
    public var pwGecos: COpaquePointer? = null,
    public var pwDir: COpaquePointer? = null,
    public var pwShell: COpaquePointer? = null,
)

public data class Ifaddrs(
    public var ifaNext: Ifaddrs? = null,
    public var ifaName: COpaquePointer? = null,
    public var ifaFlags: ULong = 0uL,
    public var ifaAddr: Sockaddr? = null,
    public var ifaNetmask: Sockaddr? = null,
    public var ifaDstaddr: Sockaddr? = null,
    public var ifaData: COpaquePointer? = null,
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

public data class PthreadAttrT(public var pthreadAttrp: COpaquePointer? = null)

public data class PthreadMutexT(
    public var pthreadMutexFlag1: UShort = 0u,
    public var pthreadMutexFlag2: UByte = 0u,
    public var pthreadMutexCeiling: UByte = 0u,
    public var pthreadMutexType: UShort = 0u,
    public var pthreadMutexMagic: UShort = 0u,
    public var pthreadMutexLock: ULong = 0uL,
    public var pthreadMutexData: ULong = 0uL,
)

public data class PthreadMutexattrT(public var pthreadMutexattrp: COpaquePointer? = null)

public data class PthreadCondT(
    public var pthreadCondFlag: UByteArray = UByteArray(4),
    public var pthreadCondType: UShort = 0u,
    public var pthreadCondMagic: UShort = 0u,
    public var pthreadCondData: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (!this.pthreadCondFlag.contentEquals(other.pthreadCondFlag)) return false
        if (this.pthreadCondType != other.pthreadCondType) return false
        if (this.pthreadCondMagic != other.pthreadCondMagic) return false
        if (this.pthreadCondData != other.pthreadCondData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pthreadCondFlag.contentHashCode()
        result = 31 * result + this.pthreadCondType.hashCode()
        result = 31 * result + this.pthreadCondMagic.hashCode()
        result = 31 * result + this.pthreadCondData.hashCode()
        return result
    }
}

public data class PthreadCondattrT(public var pthreadCondattrp: COpaquePointer? = null)

public data class PthreadRwlockT(
    public var pthreadRwlockReaders: Int = 0,
    public var pthreadRwlockType: UShort = 0u,
    public var pthreadRwlockMagic: UShort = 0u,
    public var pthreadRwlockMutex: PthreadMutexT = PthreadMutexT(),
    public var pthreadRwlockReadercv: PthreadCondT = PthreadCondT(),
    public var pthreadRwlockWritercv: PthreadCondT = PthreadCondT(),
)

public data class PthreadRwlockattrT(public var pthreadRwlockattrp: COpaquePointer? = null)

public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dOff: OffT = 0L,
    public var dReclen: UShort = 0u,
    public var dName: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class GlobT(
    public var glPathc: SizeT = 0uL,
    public var glPathv: COpaquePointer? = null,
    public var glOffs: SizeT = 0uL,
    public var unused1: COpaquePointer? = null,
    public var unused2: CInt = 0,
    public var unused3: CInt = 0,
    public var unused4: CInt = 0,
    public var unused5: COpaquePointer? = null,
    public var unused6: COpaquePointer? = null,
    public var unused7: COpaquePointer? = null,
    public var unused8: COpaquePointer? = null,
    public var unused9: COpaquePointer? = null,
    public var unused10: COpaquePointer? = null,
)

public data class Addrinfo(
    public var aiFlags: CInt = 0,
    public var aiFamily: CInt = 0,
    public var aiSocktype: CInt = 0,
    public var aiProtocol: CInt = 0,
    public var sparcv9Pad: CInt = 0,
    public var aiAddrlen: SocklenT = 0u,
    public var aiCanonname: COpaquePointer? = null,
    public var aiAddr: Sockaddr? = null,
    public var aiNext: Addrinfo? = null,
)

public data class SigsetT(public var bits: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bits.contentHashCode()
    }
}

public data class Sigaction(
    public var saFlags: CInt = 0,
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = SigsetT(),
)

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssSize: SizeT = 0uL,
    public var ssFlags: CInt = 0,
)

public data class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fBasetype: UByteArray = UByteArray(16),
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fFstr: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs) return false
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
        return result
    }
}

public data class SendfilevecT(
    public var sfvFd: CInt = 0,
    public var sfvFlag: CUint = 0u,
    public var sfvOff: OffT = 0L,
    public var sfvLen: SizeT = 0uL,
)

public data class SchedParam(public var schedPriority: CInt = 0, public var schedPad: IntArray = IntArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchedParam) return false
        if (this.schedPriority != other.schedPriority) return false
        if (!this.schedPad.contentEquals(other.schedPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.schedPriority.hashCode()
        result = 31 * result + this.schedPad.contentHashCode()
        return result
    }
}

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
)

public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stSize: OffT = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stBlocks: BlkcntT = 0L,
    public var stFstype: UByteArray = UByteArray(ST_FSTYPSZ),
)

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

public data class SemT(
    public var semCount: UInt = 0u,
    public var semType: UShort = 0u,
    public var semMagic: UShort = 0u,
    public var semPad1: ULongArray = ULongArray(3),
    public var semPad2: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (this.semCount != other.semCount) return false
        if (this.semType != other.semType) return false
        if (this.semMagic != other.semMagic) return false
        if (!this.semPad1.contentEquals(other.semPad1)) return false
        if (!this.semPad2.contentEquals(other.semPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.semCount.hashCode()
        result = 31 * result + this.semType.hashCode()
        result = 31 * result + this.semMagic.hashCode()
        result = 31 * result + this.semPad1.contentHashCode()
        result = 31 * result + this.semPad2.contentHashCode()
        return result
    }
}

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lSysid: CInt = 0,
    public var lPid: PidT = 0,
    public var lPad: LongArray = LongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Flock) return false
        if (this.lType != other.lType) return false
        if (this.lWhence != other.lWhence) return false
        if (this.lStart != other.lStart) return false
        if (this.lLen != other.lLen) return false
        if (this.lSysid != other.lSysid) return false
        if (this.lPid != other.lPid) return false
        if (!this.lPad.contentEquals(other.lPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lType.hashCode()
        result = 31 * result + this.lWhence.hashCode()
        result = 31 * result + this.lStart.hashCode()
        result = 31 * result + this.lLen.hashCode()
        result = 31 * result + this.lSysid.hashCode()
        result = 31 * result + this.lPid.hashCode()
        result = 31 * result + this.lPad.contentHashCode()
        return result
    }
}

public data class IfNameindex(public var ifIndex: CUint = 0u, public var ifName: COpaquePointer? = null)

public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
    public var pad: IntArray = IntArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MqAttr) return false
        if (this.mqFlags != other.mqFlags) return false
        if (this.mqMaxmsg != other.mqMaxmsg) return false
        if (this.mqMsgsize != other.mqMsgsize) return false
        if (this.mqCurmsgs != other.mqCurmsgs) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mqFlags.hashCode()
        result = 31 * result + this.mqMaxmsg.hashCode()
        result = 31 * result + this.mqMsgsize.hashCode()
        result = 31 * result + this.mqCurmsgs.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}

public data class PortEvent(
    public var portevEvents: CInt = 0,
    public var portevSource: CUshort = 0u,
    public var portevPad: CUshort = 0u,
    public var portevObject: UintptrT = 0uL,
    public var portevUser: COpaquePointer? = null,
)

public data class PortNotify(public var portnfyPort: CInt = 0, public var portnfyUser: COpaquePointer? = null)

public data class AioResultT(public var aioReturn: SsizeT = 0L, public var aioErrno: CInt = 0)

public data class ExitStatus(public var eTermination: CShort = 0, public var eExit: CShort = 0)

public data class Utmp(
    public var utUser: UByteArray = UByteArray(8),
    public var utId: UByteArray = UByteArray(4),
    public var utLine: UByteArray = UByteArray(12),
    public var utPid: CShort = 0,
    public var utType: CShort = 0,
    public var utExit: ExitStatus = ExitStatus(),
    public var utTime: TimeT = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmp) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (this.utPid != other.utPid) return false
        if (this.utType != other.utType) return false
        if (this.utExit != other.utExit) return false
        if (this.utTime != other.utTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utUser.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utType.hashCode()
        result = 31 * result + this.utExit.hashCode()
        result = 31 * result + this.utTime.hashCode()
        return result
    }
}

public class Timex(
    public var modes: UInt = 0u,
    public var offset: Int = 0,
    public var freq: Int = 0,
    public var maxerror: Int = 0,
    public var esterror: Int = 0,
    public var status: Int = 0,
    public var constant: Int = 0,
    public var precision: Int = 0,
    public var tolerance: Int = 0,
    public var ppsfreq: Int = 0,
    public var jitter: Int = 0,
    public var shift: Int = 0,
    public var stabil: Int = 0,
    public var jitcnt: Int = 0,
    public var calcnt: Int = 0,
    public var errcnt: Int = 0,
    public var stbcnt: Int = 0,
)

public data class Ntptimeval(
    public var time: Timeval = Timeval(),
    public var maxerror: Int = 0,
    public var esterror: Int = 0,
)

public data class MmapobjResultT(
    public var mrAddr: CaddrT = null,
    public var mrMsize: SizeT = 0uL,
    public var mrFsize: SizeT = 0uL,
    public var mrOffset: SizeT = 0uL,
    public var mrProt: CUint = 0u,
    public var mrFlags: CUint = 0u,
)

public data class LgrpAffinityArgsT(
    public var idtype: IdtypeT = 0u,
    public var id: IdT = 0,
    public var lgrp: LgrpIdT = 0,
    public var aff: LgrpAffinityT = 0,
)

public data class ProcessorInfoT(
    public var piState: CInt = 0,
    public var piProcessorType: UByteArray = UByteArray(PI_TYPELEN),
    public var piFputypes: UByteArray = UByteArray(PI_FPUTYPE),
    public var piClock: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessorInfoT) return false
        if (this.piState != other.piState) return false
        if (!this.piProcessorType.contentEquals(other.piProcessorType)) return false
        if (!this.piFputypes.contentEquals(other.piFputypes)) return false
        if (this.piClock != other.piClock) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.piState.hashCode()
        result = 31 * result + this.piProcessorType.contentHashCode()
        result = 31 * result + this.piFputypes.contentHashCode()
        result = 31 * result + this.piClock.hashCode()
        return result
    }
}

public data class Option(
    public var name: COpaquePointer? = null,
    public var hasArg: CInt = 0,
    public var flag: CInt? = null,
    public var value: CInt = 0,
)

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

public data class Utsname(
    public var sysname: UByteArray = UByteArray(257),
    public var nodename: UByteArray = UByteArray(257),
    public var release: UByteArray = UByteArray(257),
    public var version: UByteArray = UByteArray(257),
    public var machine: UByteArray = UByteArray(257),
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

public data class FdSet(public var fdsBits: LongArray = LongArray(FD_SETSIZE / 64)) {
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

public data class SockaddrStorage(
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssAlign: Long = 0L,
    public var ssPad2: UByteArray = UByteArray(240),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssAlign != other.ssAlign) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        result = 31 * result + this.ssPad2.contentHashCode()
        return result
    }
}

public data class SockaddrDl(
    public var sdlFamily: CUshort = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: CUchar = 0u,
    public var sdlNlen: CUchar = 0u,
    public var sdlAlen: CUchar = 0u,
    public var sdlSlen: CUchar = 0u,
    public var sdlData: UByteArray = UByteArray(244),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrDl) return false
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
        var result = this.sdlFamily.hashCode()
        result = 31 * result + this.sdlIndex.hashCode()
        result = 31 * result + this.sdlType.hashCode()
        result = 31 * result + this.sdlNlen.hashCode()
        result = 31 * result + this.sdlAlen.hashCode()
        result = 31 * result + this.sdlSlen.hashCode()
        result = 31 * result + this.sdlData.contentHashCode()
        return result
    }
}

public data class Sigevent(
    public var sigevNotify: CInt = 0,
    public var sigevSigno: CInt = 0,
    public var sigevValue: Sigval = Sigval(),
    public var ssSp: COpaquePointer? = null,
    public var sigevNotifyAttributes: PthreadAttrT? = null,
    public var sigevPad2: CInt = 0,
)

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siErrno: CInt = 0,
    public var siPad: CInt = 0,
    public var dataPad: IntArray = IntArray(SIGINFO_DATA_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siPad != other.siPad) return false
        if (!this.dataPad.contentEquals(other.dataPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siPad.hashCode()
        result = 31 * result + this.dataPad.contentHashCode()
        return result
    }

    /**
     * The siginfoT will have differing contents based on the delivered signal.  Based on
     * `siSigno`, this determines how many of the `cInt` pad fields contain valid data
     * exposed by the C unions.
     *
     * It is not yet exhausitive for the OS-defined types, and defaults to assuming the
     * entire data pad area is "valid" for otherwise unrecognized signal numbers.
     */
    public fun dataFieldCount(): Int {
        return when (this.siSigno) {
            SIGSEGV, SIGBUS, SIGILL, SIGTRAP, SIGFPE -> {
                8 / 8
            }
            SIGCLD -> 8 / 8
            SIGHUP, SIGINT, SIGQUIT, SIGABRT, SIGSYS, SIGPIPE, SIGALRM, SIGTERM, SIGUSR1, SIGUSR2, SIGPWR, SIGWINCH, SIGURG -> 8 / 8
            else -> SIGINFO_DATA_SIZE
        }
    }

    public fun eq(other: SiginfoT): Boolean {
        return if (this.siSigno == other.siSigno && this.siCode == other.siCode && this.siErrno == other.siErrno) {
            // Note(solarish): The `siPad` field in the 64-bit version of the struct is ignored
            // (for now) when doing comparisons.
            val fieldCount = this.dataFieldCount()
            this.dataPad.slice(0 until fieldCount).zip(other.dataPad.slice(0 until fieldCount)).all({ (a, b) -> a == b })
        } else {
            false
        }
    }

    public inline fun <reified T> sidata(): T {
        return ((((((this.dataPad) as Any?) as CInt?) as Any?) as T?))!!
    }

    public fun siAddr(): COpaquePointer? {
        val sifault: SiginfoFault = this.sidata()
        return sifault.addr
    }

    public fun siUid(): UidT {
        val kill: SiginfoKill = this.sidata()
        return kill.value.uid
    }

    public fun siValue(): Sigval {
        val kill: SiginfoKill = this.sidata()
        return kill.value.value
    }

    public fun siPid(): PidT {
        val sigcld: SiginfoSigcld = this.sidata()
        return sigcld.pid
    }

    public fun siStatus(): CInt {
        val sigcld: SiginfoSigcld = this.sidata()
        return sigcld.value.status
    }

    public fun siUtime(): CLong {
        val sigcld: SiginfoSigcld = this.sidata()
        return sigcld.value.utime
    }

    public fun siStime(): CLong {
        val sigcld: SiginfoSigcld = this.sidata()
        return sigcld.value.stime
    }
}

public data class Pad128T(
    // pub _q in this structure would be a "long double", of 16 bytes
    public var l: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pad128T) return false
        if (!this.l.contentEquals(other.l)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.l.contentHashCode()
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "pad128_t").finishNonExhaustive()
    }

    public fun eq(other: Pad128T): Boolean {
        return this.l.contentEquals(other.l)
    }
}

public data class Upad128T(
    // pub _q in this structure would be a "long double", of 16 bytes
    public var l: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Upad128T) return false
        if (!this.l.contentEquals(other.l)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.l.contentHashCode()
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "upad128_t").finishNonExhaustive()
    }

    public fun eq(other: Upad128T): Boolean {
        return this.l.contentEquals(other.l)
    }
}

public data class SiginfoFault(
    public var addr: COpaquePointer? = null,
    public var trapno: CInt = 0,
    public var pc: COpaquePointer? = null,
)

public data class SiginfoCldval(
    public var utime: ClockT = 0L,
    public var status: CInt = 0,
    public var stime: ClockT = 0L,
)

public data class SiginfoKillval(
    public var uid: UidT = 0u,
    public var value: Sigval = Sigval(),
    // Pad out to match the SIGCLD value size
    public var pad: COpaquePointer? = null,
)

public data class SiginfoSigcld(
    public var pid: PidT = 0,
    public var value: SiginfoCldval = SiginfoCldval(),
    public var ctid: CtidT = 0,
    public var zoneid: ZoneidT = 0,
)

public data class SiginfoKill(
    public var pid: PidT = 0,
    public var value: SiginfoKillval = SiginfoKillval(),
    public var ctid: CtidT = 0,
    public var zoneid: ZoneidT = 0,
)
