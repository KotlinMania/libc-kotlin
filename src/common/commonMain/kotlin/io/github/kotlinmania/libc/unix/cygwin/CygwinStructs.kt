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

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

public open class CpuSetT(public var bits: List<ULong>)

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
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
    public var tmGmtoff: CLong,
    public var tmZone: COpaquePointer?,
)

public open class Bintime(public var sec: TimeT, public var frac: ULong)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwComment: COpaquePointer?,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class IfNameindex(public var ifIndex: CUint, public var ifName: COpaquePointer?)

public open class Ucred(
    public var pid: PidT,
    public var uid: UidT,
    public var gid: GidT,
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
    public var cmsgLen: SizeT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class DlInfo(
    public var dliFname: List<CChar>,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class In6Pktinfo(public var ipi6Addr: In6Addr, public var ipi6Ifindex: UInt)

public open class SockaddrIn6(
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

public open class IpMreqSource(
    public var imrMultiaddr: InAddr,
    public var imrSourceaddr: InAddr,
    public var imrInterface: InAddr,
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

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cLine: CChar,
    public var cCc: List<CcT>,
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
)

public open class SchedParam(public var schedPriority: CInt)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
)

public open class Hostent(
    public var hName: COpaquePointer?,
    public var hAliases: COpaquePointer?,
    public var hAddrtype: CShort,
    public var hLength: CShort,
    public var hAddrList: COpaquePointer?,
)

public open class Linger(public var lOnoff: CUshort, public var lLinger: CUshort)

public open class FdSet(public var fdsBits: List<FdMask>)

public open class UcFpxreg(
    public var significand: List<UShort>,
    public var exponent: UShort,
    public var padding: List<UShort>,
)

public open class UcXmmreg(public var element: List<UInt>)

public open class Fpstate(
    public var cwd: UShort,
    public var swd: UShort,
    public var ftw: UShort,
    public var fop: UShort,
    public var rip: ULong,
    public var rdp: ULong,
    public var mxcsr: UInt,
    public var mxcrMask: UInt,
    public var st: List<UcFpxreg>,
    public var xmm: List<UcXmmreg>,
    public var padding: List<UInt>,
)

public open class McontextT(
    public var p1home: ULong,
    public var p2home: ULong,
    public var p3home: ULong,
    public var p4home: ULong,
    public var p5home: ULong,
    public var p6home: ULong,
    public var ctxflags: UInt,
    public var mxcsr: UInt,
    public var cs: UShort,
    public var ds: UShort,
    public var es: UShort,
    public var fs: UShort,
    public var gs: UShort,
    public var ss: UShort,
    public var eflags: UInt,
    public var dr0: ULong,
    public var dr1: ULong,
    public var dr2: ULong,
    public var dr3: ULong,
    public var dr6: ULong,
    public var dr7: ULong,
    public var rax: ULong,
    public var rcx: ULong,
    public var rdx: ULong,
    public var rbx: ULong,
    public var rsp: ULong,
    public var rbp: ULong,
    public var rsi: ULong,
    public var rdi: ULong,
    public var r8: ULong,
    public var r9: ULong,
    public var r10: ULong,
    public var r11: ULong,
    public var r12: ULong,
    public var r13: ULong,
    public var r14: ULong,
    public var r15: ULong,
    public var rip: ULong,
    public var fpregs: Fpstate,
    public var vregs: List<ULong>,
    public var vcx: ULong,
    public var dbc: ULong,
    public var btr: ULong,
    public var bfr: ULong,
    public var etr: ULong,
    public var efr: ULong,
    public var oldmask: ULong,
    public var cr2: ULong,
)

public open class Sigevent(
    public var sigevValue: Sigval,
    public var sigevSigno: CInt,
    public var sigevNotify: CInt,
    public var sigevNotifyFunction: SigeventSigevNotifyFunctionCallback?,
    public var sigevNotifyAttributes: COpaquePointer?,
)

public open class UcontextT(
    public var ucMcontext: McontextT,
    public var ucLink: UcontextT?,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    public var ucFlags: CUlong,
)

public open class Sockaddr(public var saFamily: SaFamilyT, public var saData: List<CChar>)

public open class SockaddrStorage(
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<CChar>,
    public var ssAlign: Long,
    public var ssPad2: List<CChar>,
)

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stBirthtime: TimeT,
    public var stBirthtimeNsec: CLong,
)

public open class InAddr(public var sAddr: InAddrT)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class InPktinfo(public var ipiAddr: InAddr, public var ipiIfindex: UInt)

public open class SockaddrIn(
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<UByte>,
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

public open class Statfs(
    public var fType: CLong,
    public var fBsize: CLong,
    public var fBlocks: CLong,
    public var fBfree: CLong,
    public var fBavail: CLong,
    public var fFiles: CLong,
    public var fFfree: CLong,
    public var fFsid: CLong,
    public var fNamelen: CLong,
    public var fSpare: List<CLong>,
)

public open class SockaddrUn(public var sunFamily: SaFamilyT, public var sunPath: List<CChar>)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
    public var domainname: List<CChar>,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siPid: PidT,
    public var siUid: UidT,
    public var siErrno: CInt,
    public var pad: List<UInt>,
) {
    public open fun siAddr(): COpaquePointer? {
        open class SiginfoSiAddr(
            public var siSigno: CInt,
            public var siCode: CInt,
            public var siPid: PidT,
            public var siUid: UidT,
            public var siErrno: CInt,
            public var siAddr: COpaquePointer?,
        )
        return (((this as SiginfoT?) as SiginfoSiAddr?)).siAddr
    }

    public open fun siStatus(): CInt {
        open class SiginfoSigchld(
            public var siSigno: CInt,
            public var siCode: CInt,
            public var siPid: PidT,
            public var siUid: UidT,
            public var siErrno: CInt,
            public var siStatus: CInt,
        )
        return (((this as SiginfoT?) as SiginfoSigchld?)).siStatus
    }

    public open fun siPid(): PidT {
        return this.siPid
    }

    public open fun siUid(): UidT {
        return this.siUid
    }

    public open fun siValue(): Sigval {
        open class SiginfoSiValue(
            public var siSigno: CInt,
            public var siCode: CInt,
            public var siPid: PidT,
            public var siUid: UidT,
            public var siErrno: CInt,
            public var siValue: Sigval,
        )
        return (((this as SiginfoT?) as SiginfoSiValue?)).siValue
    }
}

public open class Dirent(
    public var dVersion: UInt,
    public var dIno: InoT,
    public var dType: CUchar,
    public var dUnused1: List<CUchar>,
    public var dInternal1: UInt,
    public var dName: List<CChar>,
)

public open class MaxAlignT(public var priv: List<Double>)

public open class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr? = null,
    public var ifruBroadaddr: Sockaddr? = null,
    public var ifruDstaddr: Sockaddr? = null,
    public var ifruNetmask: Sockaddr? = null,
    public var ifruHwaddr: Sockaddr? = null,
    public var ifruFlags: CInt? = null,
    public var ifruMetric: CInt? = null,
    public var ifruMtu: CInt? = null,
    public var ifruIfindex: CInt? = null,
    public var ifruData: COpaquePointer?? = null,
    public var ifruPad: List<CChar>? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }
}

public open class Ifreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifrName: List<CChar>,
    public var ifrIfru: CAnonymousIfrIfru,
)

public open class CAnonymousIfcIfcu(public var ifcuBuf: CaddrT? = null, public var ifcuReq: Ifreq?? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifc_ifcu").finishNonExhaustive()
    }
}

public open class Ifconf(public var ifcLen: CInt, public var ifcIfcu: CAnonymousIfcIfcu)

public open class Utmpx(
    public var utType: CShort,
    public var utPid: PidT,
    public var utLine: List<CChar>,
    public var utId: List<CChar>,
    public var utTime: TimeT,
    public var utUser: List<CChar>,
    public var utHost: List<CChar>,
    public var utAddr: CLong,
    public var utTv: Timeval,
)
