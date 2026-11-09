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
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SIGUSR1
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SIGUSR2
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

public open class InAddr(public var sAddr: InAddrT)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class IpMreqSource(
    public var imrMultiaddr: InAddr,
    public var imrSourceaddr: InAddr,
    public var imrInterface: InAddr,
)

public open class IpcPerm(
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
    public var seq: CUint,
    public var key: KeyT,
)

public open class Sockaddr(public var saFamily: SaFamilyT, public var saData: List<CChar>)

public open class SockaddrIn(
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<CChar>,
)

public open class SockaddrIn6(
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
    public var sin6SrcId: UInt,
)

public open class InPktinfo(
    public var ipiIfindex: CUint,
    public var ipiSpecDst: InAddr,
    public var ipiAddr: InAddr,
)

public open class In6Pktinfo(public var ipi6Addr: In6Addr, public var ipi6Ifindex: CUint)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwAge: COpaquePointer?,
    public var pwComment: COpaquePointer?,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class Ifaddrs(
    public var ifaNext: Ifaddrs?,
    public var ifaName: COpaquePointer?,
    public var ifaFlags: ULong,
    public var ifaAddr: Sockaddr?,
    public var ifaNetmask: Sockaddr?,
    public var ifaDstaddr: Sockaddr?,
    public var ifaData: COpaquePointer?,
)

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

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

public open class PthreadAttrT(public var pthreadAttrp: COpaquePointer?)

public open class PthreadMutexT(
    public var pthreadMutexFlag1: UShort,
    public var pthreadMutexFlag2: UByte,
    public var pthreadMutexCeiling: UByte,
    public var pthreadMutexType: UShort,
    public var pthreadMutexMagic: UShort,
    public var pthreadMutexLock: ULong,
    public var pthreadMutexData: ULong,
)

public open class PthreadMutexattrT(public var pthreadMutexattrp: COpaquePointer?)

public open class PthreadCondT(
    public var pthreadCondFlag: List<UByte>,
    public var pthreadCondType: UShort,
    public var pthreadCondMagic: UShort,
    public var pthreadCondData: ULong,
)

public open class PthreadCondattrT(public var pthreadCondattrp: COpaquePointer?)

public open class PthreadRwlockT(
    public var pthreadRwlockReaders: Int,
    public var pthreadRwlockType: UShort,
    public var pthreadRwlockMagic: UShort,
    public var pthreadRwlockMutex: PthreadMutexT,
    public var pthreadRwlockReadercv: PthreadCondT,
    public var pthreadRwlockWritercv: PthreadCondT,
)

public open class PthreadRwlockattrT(public var pthreadRwlockattrp: COpaquePointer?)

public open class Dirent(
    public var dIno: InoT,
    public var dOff: OffT,
    public var dReclen: UShort,
    public var dName: List<CChar>,
)

public open class GlobT(
    public var glPathc: SizeT,
    public var glPathv: COpaquePointer?,
    public var glOffs: SizeT,
    public var unused1: COpaquePointer?,
    public var unused2: CInt,
    public var unused3: CInt,
    public var unused4: CInt,
    public var unused5: COpaquePointer?,
    public var unused6: COpaquePointer?,
    public var unused7: COpaquePointer?,
    public var unused8: COpaquePointer?,
    public var unused9: COpaquePointer?,
    public var unused10: COpaquePointer?,
)

public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var sparcv9Pad: CInt,
    public var aiAddrlen: SocklenT,
    public var aiCanonname: COpaquePointer?,
    public var aiAddr: Sockaddr?,
    public var aiNext: Addrinfo?,
)

public open class SigsetT(public var bits: List<UInt>)

public open class Sigaction(
    public var saFlags: CInt,
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
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
    public var fBasetype: List<CChar>,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fFstr: List<CChar>,
)

public open class SendfilevecT(
    public var sfvFd: CInt,
    public var sfvFlag: CUint,
    public var sfvOff: OffT,
    public var sfvLen: SizeT,
)

public open class SchedParam(public var schedPriority: CInt, public var schedPad: List<CInt>)

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
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
    public var stFstype: List<CChar>,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cCc: List<CcT>,
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

public open class SemT(
    public var semCount: UInt,
    public var semType: UShort,
    public var semMagic: UShort,
    public var semPad1: List<ULong>,
    public var semPad2: List<ULong>,
)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lSysid: CInt,
    public var lPid: PidT,
    public var lPad: List<CLong>,
)

public open class IfNameindex(public var ifIndex: CUint, public var ifName: COpaquePointer?)

public open class MqAttr(
    public var mqFlags: CLong,
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqCurmsgs: CLong,
    public var pad: List<CInt>,
)

public open class PortEvent(
    public var portevEvents: CInt,
    public var portevSource: CUshort,
    public var portevPad: CUshort,
    public var portevObject: UintptrT,
    public var portevUser: COpaquePointer?,
)

public open class PortNotify(public var portnfyPort: CInt, public var portnfyUser: COpaquePointer?)

public open class AioResultT(public var aioReturn: SsizeT, public var aioErrno: CInt)

public open class ExitStatus(public var eTermination: CShort, public var eExit: CShort)

public open class Utmp(
    public var utUser: List<CChar>,
    public var utId: List<CChar>,
    public var utLine: List<CChar>,
    public var utPid: CShort,
    public var utType: CShort,
    public var utExit: ExitStatus,
    public var utTime: TimeT,
)

public open class Timex(
    public var modes: UInt,
    public var offset: Int,
    public var freq: Int,
    public var maxerror: Int,
    public var esterror: Int,
    public var status: Int,
    public var constant: Int,
    public var precision: Int,
    public var tolerance: Int,
    public var ppsfreq: Int,
    public var jitter: Int,
    public var shift: Int,
    public var stabil: Int,
    public var jitcnt: Int,
    public var calcnt: Int,
    public var errcnt: Int,
    public var stbcnt: Int,
)

public open class Ntptimeval(
    public var time: Timeval,
    public var maxerror: Int,
    public var esterror: Int,
)

public open class MmapobjResultT(
    public var mrAddr: CaddrT,
    public var mrMsize: SizeT,
    public var mrFsize: SizeT,
    public var mrOffset: SizeT,
    public var mrProt: CUint,
    public var mrFlags: CUint,
)

public open class LgrpAffinityArgsT(
    public var idtype: IdtypeT,
    public var id: IdT,
    public var lgrp: LgrpIdT,
    public var aff: LgrpAffinityT,
)

public open class ProcessorInfoT(
    public var piState: CInt,
    public var piProcessorType: List<CChar>,
    public var piFputypes: List<CChar>,
    public var piClock: CInt,
)

public open class Option(
    public var name: COpaquePointer?,
    public var hasArg: CInt,
    public var flag: CInt?,
    public var value: CInt,
)

public open class SockaddrUn(public var sunFamily: SaFamilyT, public var sunPath: List<CChar>)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
)

public open class FdSet(public var fdsBits: List<Long>)

public open class SockaddrStorage(
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<UByte>,
    public var ssAlign: Long,
    public var ssPad2: List<UByte>,
)

public open class SockaddrDl(
    public var sdlFamily: CUshort,
    public var sdlIndex: CUshort,
    public var sdlType: CUchar,
    public var sdlNlen: CUchar,
    public var sdlAlen: CUchar,
    public var sdlSlen: CUchar,
    public var sdlData: List<CChar>,
)

public open class Sigevent(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    public var ssSp: COpaquePointer?,
    public var sigevNotifyAttributes: PthreadAttrT?,
    public var sigevPad2: CInt,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var siPad: CInt,
    public var dataPad: List<CInt>,
) {
    /**
     * The siginfoT will have differing contents based on the delivered signal.  Based on
     * `siSigno`, this determines how many of the `cInt` pad fields contain valid data
     * exposed by the C unions.
     *
     * It is not yet exhausitive for the OS-defined types, and defaults to assuming the
     * entire data pad area is "valid" for otherwise unrecognized signal numbers.
     */
    public open fun dataFieldCount(): Int {
        return when (this.siSigno) {
            SIGSEGV, SIGBUS, SIGILL, SIGTRAP, SIGFPE -> {
                sizeOf<SiginfoFault>() / sizeOf<CInt>()
            }
            SIGCLD -> sizeOf<SiginfoSigcld>() / sizeOf<CInt>()
            SIGHUP, SIGINT, SIGQUIT, SIGABRT, SIGSYS, SIGPIPE, SIGALRM, SIGTERM, SIGUSR1, SIGUSR2, SIGPWR, SIGWINCH, SIGURG -> sizeOf<SiginfoKill>() / sizeOf<CInt>()
            else -> SIGINFO_DATA_SIZE
        }
    }

    public open fun eq(other: SiginfoT): Boolean {
        return if (this.siSigno == other.siSigno && this.siCode == other.siCode && this.siErrno == other.siErrno) {
            // Note(solarish): The `siPad` field in the 64-bit version of the struct is ignored
            // (for now) when doing comparisons.
            val fieldCount = this.dataFieldCount()
            this.dataPad[0 until fieldCount].iter().zip(other.dataPad[0 until fieldCount].iter()).all({ (a, b) -> a == b })
        } else {
            false
        }
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.siSigno).hashCode()
        state = 31 * state + (this.siCode).hashCode()
        state = 31 * state + (this.siErrno).hashCode()
        // Note(solarish): The `siPad` field in the 64-bit version of the struct is ignored
        // (for now) when doing hashing.
        val fieldCount = this.dataFieldCount()
        state = 31 * state + (this.dataPad[0 until fieldCount]).hashCode()
        return state
    }

    public open fun <T> sidata(): T {
        return (null)
    }

    public open fun siAddr(): COpaquePointer? {
        val sifault: SiginfoFault = this.sidata()
        return sifault.addr
    }

    public open fun siUid(): UidT {
        val kill: SiginfoKill = this.sidata()
        return kill.value.uid
    }

    public open fun siValue(): Sigval {
        val kill: SiginfoKill = this.sidata()
        return kill.value.value
    }

    public open fun siPid(): PidT {
        val sigcld: SiginfoSigcld = this.sidata()
        return sigcld.pid
    }

    public open fun siStatus(): CInt {
        val sigcld: SiginfoSigcld = this.sidata()
        return sigcld.value.status
    }

    public open fun siUtime(): CLong {
        val sigcld: SiginfoSigcld = this.sidata()
        return sigcld.value.utime
    }

    public open fun siStime(): CLong {
        val sigcld: SiginfoSigcld = this.sidata()
        return sigcld.value.stime
    }
}

public open class Pad128T(
    // pub _q in this structure would be a "long double", of 16 bytes
    public var l: List<Int>? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "pad128_t").finishNonExhaustive()
    }

    public open fun eq(other: Pad128T): Boolean {
        return this.l == other.l
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            // Note(solarish): state.writeI64(self._q as i64);
            state = 31 * state + (this.l).hashCode()
        }
        return state
    }
}

public open class Upad128T(
    // pub _q in this structure would be a "long double", of 16 bytes
    public var l: List<UInt>? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "upad128_t").finishNonExhaustive()
    }

    public open fun eq(other: Upad128T): Boolean {
        return this.l == other.l
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            // Note(solarish): state.writeI64(self._q as i64);
            state = 31 * state + (this.l).hashCode()
        }
        return state
    }
}

public open class SiginfoFault(
    public var addr: COpaquePointer?,
    public var trapno: CInt,
    public var pc: COpaquePointer?,
)

public open class SiginfoCldval(
    public var utime: ClockT,
    public var status: CInt,
    public var stime: ClockT,
)

public open class SiginfoKillval(
    public var uid: UidT,
    public var value: Sigval,
    // Pad out to match the SIGCLD value size
    public var pad: COpaquePointer?,
)

public open class SiginfoSigcld(
    public var pid: PidT,
    public var value: SiginfoCldval,
    public var ctid: CtidT,
    public var zoneid: ZoneidT,
)

public open class SiginfoKill(
    public var pid: PidT,
    public var value: SiginfoKillval,
    public var ctid: CtidT,
    public var zoneid: ZoneidT,
)
