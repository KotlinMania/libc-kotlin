@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.cygwin

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
import io.github.kotlinmania.libc.unix.DIR
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
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT

public fun interface SigeventSigevNotifyFunctionCallback {
    public operator fun invoke(value: Sigval)
}

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

public data class Itimerspec(public var itInterval: Timespec = Timespec(), public var itValue: Timespec = Timespec())

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

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = 0uL,
    public var saFlags: CInt = 0,
)

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssFlags: CInt = 0,
    public var ssSize: SizeT = 0uL,
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
    public var tmGmtoff: CLong = 0L,
    public var tmZone: COpaquePointer? = null,
)

public data class Bintime(public var sec: TimeT = 0L, public var frac: ULong = 0uL)

public data class Passwd(
    public var pwName: COpaquePointer? = null,
    public var pwPasswd: COpaquePointer? = null,
    public var pwUid: UidT = 0u,
    public var pwGid: GidT = 0u,
    public var pwComment: COpaquePointer? = null,
    public var pwGecos: COpaquePointer? = null,
    public var pwDir: COpaquePointer? = null,
    public var pwShell: COpaquePointer? = null,
)

public data class IfNameindex(public var ifIndex: CUint = 0u, public var ifName: COpaquePointer? = null)

public data class Ucred(
    public var pid: PidT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
)

public data class Msghdr(
    public var msgName: COpaquePointer? = null,
    public var msgNamelen: SocklenT = 0,
    public var msgIov: Iovec? = null,
    public var msgIovlen: CInt = 0,
    public var msgControl: COpaquePointer? = null,
    public var msgControllen: SocklenT = 0,
    public var msgFlags: CInt = 0,
)

public data class Cmsghdr(
    public var cmsgLen: SizeT = 0uL,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
)

public data class DlInfo(
    public var dliFname: UByteArray = UByteArray(PATH_MAX.toInt()),
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlInfo) return false
        if (!this.dliFname.contentEquals(other.dliFname)) return false
        if (this.dliFbase != other.dliFbase) return false
        if (this.dliSname != other.dliSname) return false
        if (this.dliSaddr != other.dliSaddr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dliFname.contentHashCode()
        result = 31 * result + this.dliFbase.hashCode()
        result = 31 * result + this.dliSname.hashCode()
        result = 31 * result + this.dliSaddr.hashCode()
        return result
    }
}

public data class In6Pktinfo(public var ipi6Addr: In6Addr = In6Addr(), public var ipi6Ifindex: UInt = 0u)

public data class SockaddrIn6(
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

public data class IpMreqSource(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrSourceaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class Addrinfo(
    public var aiFlags: CInt = 0,
    public var aiFamily: CInt = 0,
    public var aiSocktype: CInt = 0,
    public var aiProtocol: CInt = 0,
    public var aiAddrlen: SocklenT = 0,
    public var aiCanonname: COpaquePointer? = null,
    public var aiAddr: Sockaddr? = null,
    public var aiNext: Addrinfo? = null,
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
    public var intNCsPrecedes: CChar = 0u,
    public var intNSepBySpace: CChar = 0u,
    public var intNSignPosn: CChar = 0u,
    public var intPCsPrecedes: CChar = 0u,
    public var intPSepBySpace: CChar = 0u,
    public var intPSignPosn: CChar = 0u,
)

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CChar = 0u,
    public var cCc: UByteArray = UByteArray((NCCS).toInt()),
    public var cIspeed: SpeedT = 0u,
    public var cOspeed: SpeedT = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (this.cLine != other.cLine) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        if (this.cIspeed != other.cIspeed) return false
        if (this.cOspeed != other.cOspeed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cLine.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }
}

public data class SchedParam(public var schedPriority: CInt = 0)

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
)

public data class Hostent(
    public var hName: COpaquePointer? = null,
    public var hAliases: COpaquePointer? = null,
    public var hAddrtype: CShort = 0,
    public var hLength: CShort = 0,
    public var hAddrList: COpaquePointer? = null,
)

public data class Linger(public var lOnoff: CUshort = 0u, public var lLinger: CUshort = 0u)

public data class FdSet(public var fdsBits: ULongArray = ULongArray((FD_SETSIZE / 8 / 8).toInt())) {
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

public data class UcFpxreg(
    public var significand: UShortArray = UShortArray(4),
    public var exponent: UShort = 0u,
    public var padding: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcFpxreg) return false
        if (!this.significand.contentEquals(other.significand)) return false
        if (this.exponent != other.exponent) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.significand.contentHashCode()
        result = 31 * result + this.exponent.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class UcXmmreg(public var element: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcXmmreg) return false
        if (!this.element.contentEquals(other.element)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.element.contentHashCode()
    }
}

public data class Fpstate(
    public var cwd: UShort = 0u,
    public var swd: UShort = 0u,
    public var ftw: UShort = 0u,
    public var fop: UShort = 0u,
    public var rip: ULong = 0uL,
    public var rdp: ULong = 0uL,
    public var mxcsr: UInt = 0u,
    public var mxcrMask: UInt = 0u,
    public var st: List<UcFpxreg> = List(8) { UcFpxreg() },
    public var xmm: List<UcXmmreg> = List(16) { UcXmmreg() },
    public var padding: UIntArray = UIntArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fpstate) return false
        if (this.cwd != other.cwd) return false
        if (this.swd != other.swd) return false
        if (this.ftw != other.ftw) return false
        if (this.fop != other.fop) return false
        if (this.rip != other.rip) return false
        if (this.rdp != other.rdp) return false
        if (this.mxcsr != other.mxcsr) return false
        if (this.mxcrMask != other.mxcrMask) return false
        if (this.st != other.st) return false
        if (this.xmm != other.xmm) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cwd.hashCode()
        result = 31 * result + this.swd.hashCode()
        result = 31 * result + this.ftw.hashCode()
        result = 31 * result + this.fop.hashCode()
        result = 31 * result + this.rip.hashCode()
        result = 31 * result + this.rdp.hashCode()
        result = 31 * result + this.mxcsr.hashCode()
        result = 31 * result + this.mxcrMask.hashCode()
        result = 31 * result + this.st.hashCode()
        result = 31 * result + this.xmm.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public class McontextT(
    public var p1home: ULong = 0uL,
    public var p2home: ULong = 0uL,
    public var p3home: ULong = 0uL,
    public var p4home: ULong = 0uL,
    public var p5home: ULong = 0uL,
    public var p6home: ULong = 0uL,
    public var ctxflags: UInt = 0u,
    public var mxcsr: UInt = 0u,
    public var cs: UShort = 0u,
    public var ds: UShort = 0u,
    public var es: UShort = 0u,
    public var fs: UShort = 0u,
    public var gs: UShort = 0u,
    public var ss: UShort = 0u,
    public var eflags: UInt = 0u,
    public var dr0: ULong = 0uL,
    public var dr1: ULong = 0uL,
    public var dr2: ULong = 0uL,
    public var dr3: ULong = 0uL,
    public var dr6: ULong = 0uL,
    public var dr7: ULong = 0uL,
    public var rax: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var rsp: ULong = 0uL,
    public var rbp: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rdi: ULong = 0uL,
    public var r8: ULong = 0uL,
    public var r9: ULong = 0uL,
    public var r10: ULong = 0uL,
    public var r11: ULong = 0uL,
    public var r12: ULong = 0uL,
    public var r13: ULong = 0uL,
    public var r14: ULong = 0uL,
    public var r15: ULong = 0uL,
    public var rip: ULong = 0uL,
    public var fpregs: Fpstate = Fpstate(),
    public var vregs: ULongArray = ULongArray(52),
    public var vcx: ULong = 0uL,
    public var dbc: ULong = 0uL,
    public var btr: ULong = 0uL,
    public var bfr: ULong = 0uL,
    public var etr: ULong = 0uL,
    public var efr: ULong = 0uL,
    public var oldmask: ULong = 0uL,
    public var cr2: ULong = 0uL,
)

public data class Sigevent(
    public var sigevValue: Sigval = Sigval(),
    public var sigevSigno: CInt = 0,
    public var sigevNotify: CInt = 0,
    public var sigevNotifyFunction: SigeventSigevNotifyFunctionCallback? = null,
    public var sigevNotifyAttributes: COpaquePointer? = null,
)

public data class UcontextT(
    public var ucMcontext: McontextT = McontextT(),
    public var ucLink: UcontextT? = null,
    public var ucSigmask: SigsetT = 0uL,
    public var ucStack: StackT = StackT(),
    public var ucFlags: CUlong = 0uL,
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

public data class SockaddrStorage(
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssAlign: Long = 0L,
    public var ssPad2: UByteArray = UByteArray(112),
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

public class Stat(
    public var stDev: DevT = 0u,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0u,
    public var stSize: OffT = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stBlocks: BlkcntT = 0L,
    public var stBirthtime: TimeT = 0L,
    public var stBirthtimeNsec: CLong = 0L,
)

public data class InAddr(public var sAddr: InAddrT = 0u)

public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

public data class InPktinfo(public var ipiAddr: InAddr = InAddr(), public var ipiIfindex: UInt = 0u)

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
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
)

public data class Statfs(
    public var fType: CLong = 0L,
    public var fBsize: CLong = 0L,
    public var fBlocks: CLong = 0L,
    public var fBfree: CLong = 0L,
    public var fBavail: CLong = 0L,
    public var fFiles: CLong = 0L,
    public var fFfree: CLong = 0L,
    public var fFsid: CLong = 0L,
    public var fNamelen: CLong = 0L,
    public var fSpare: LongArray = LongArray(6),
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
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

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
    public var sysname: UByteArray = UByteArray(66),
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

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siPid: PidT = 0,
    public var siUid: UidT = 0u,
    public var siErrno: CInt = 0,
    public var pad: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siPid != other.siPid) return false
        if (this.siUid != other.siUid) return false
        if (this.siErrno != other.siErrno) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siPid.hashCode()
        result = 31 * result + this.siUid.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public fun siAddr(): COpaquePointer? {
        data class SiginfoSiAddr(
            public var siSigno: CInt = 0,
            public var siCode: CInt = 0,
            public var siPid: PidT = 0,
            public var siUid: UidT = 0u,
            public var siErrno: CInt = 0,
            public var siAddr: COpaquePointer? = null,
        )
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoSiAddr?))!!.siAddr
    }

    public fun siStatus(): CInt {
        data class SiginfoSigchld(
            public var siSigno: CInt = 0,
            public var siCode: CInt = 0,
            public var siPid: PidT = 0,
            public var siUid: UidT = 0u,
            public var siErrno: CInt = 0,
            public var siStatus: CInt = 0,
        )
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoSigchld?))!!.siStatus
    }

    public fun siPid(): PidT {
        return this.siPid
    }

    public fun siUid(): UidT {
        return this.siUid
    }

    public fun siValue(): Sigval {
        data class SiginfoSiValue(
            public var siSigno: CInt = 0,
            public var siCode: CInt = 0,
            public var siPid: PidT = 0,
            public var siUid: UidT = 0u,
            public var siErrno: CInt = 0,
            public var siValue: Sigval = Sigval(),
        )
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoSiValue?))!!.siValue
    }
}

public data class Dirent(
    public var dVersion: UInt = 0u,
    public var dIno: InoT = 0uL,
    public var dType: CUchar = 0u,
    public var dUnused1: UByteArray = UByteArray(3),
    public var dInternal1: UInt = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dVersion != other.dVersion) return false
        if (this.dIno != other.dIno) return false
        if (this.dType != other.dType) return false
        if (!this.dUnused1.contentEquals(other.dUnused1)) return false
        if (this.dInternal1 != other.dInternal1) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dVersion.hashCode()
        result = 31 * result + this.dIno.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dUnused1.contentHashCode()
        result = 31 * result + this.dInternal1.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class MaxAlignT(public var priv: DoubleArray = DoubleArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.priv.contentHashCode()
    }
}

public data class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr = Sockaddr(),
    public var ifruBroadaddr: Sockaddr = Sockaddr(),
    public var ifruDstaddr: Sockaddr = Sockaddr(),
    public var ifruNetmask: Sockaddr = Sockaddr(),
    public var ifruHwaddr: Sockaddr = Sockaddr(),
    public var ifruFlags: CInt = 0,
    public var ifruMetric: CInt = 0,
    public var ifruMtu: CInt = 0,
    public var ifruIfindex: CInt = 0,
    public var ifruData: COpaquePointer? = null,
    public var ifruPad: UByteArray = UByteArray(28),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruNetmask != other.ifruNetmask) return false
        if (this.ifruHwaddr != other.ifruHwaddr) return false
        if (this.ifruFlags != other.ifruFlags) return false
        if (this.ifruMetric != other.ifruMetric) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruIfindex != other.ifruIfindex) return false
        if (this.ifruData != other.ifruData) return false
        if (!this.ifruPad.contentEquals(other.ifruPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruNetmask.hashCode()
        result = 31 * result + this.ifruHwaddr.hashCode()
        result = 31 * result + this.ifruFlags.hashCode()
        result = 31 * result + this.ifruMetric.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruIfindex.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruPad.contentHashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }
}

public data class Ifreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifrName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifrIfru: CAnonymousIfrIfru = CAnonymousIfrIfru(),
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

public data class CAnonymousIfcIfcu(public var ifcuBuf: CaddrT = null, public var ifcuReq: Ifreq? = null) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifc_ifcu").finishNonExhaustive()
    }
}

public data class Ifconf(public var ifcLen: CInt = 0, public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu())

public data class Utmpx(
    public var utType: CShort = 0,
    public var utPid: PidT = 0,
    public var utLine: UByteArray = UByteArray((UT_LINESIZE).toInt()),
    public var utId: UByteArray = UByteArray((UT_IDLEN).toInt()),
    public var utTime: TimeT = 0L,
    public var utUser: UByteArray = UByteArray((UT_NAMESIZE).toInt()),
    public var utHost: UByteArray = UByteArray((UT_HOSTSIZE).toInt()),
    public var utAddr: CLong = 0L,
    public var utTv: Timeval = Timeval(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (this.utType != other.utType) return false
        if (this.utPid != other.utPid) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (this.utTime != other.utTime) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.utAddr != other.utAddr) return false
        if (this.utTv != other.utTv) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utType.hashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utTime.hashCode()
        result = 31 * result + this.utUser.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utAddr.hashCode()
        result = 31 * result + this.utTv.hashCode()
        return result
    }
}
