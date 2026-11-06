// port-lint: source unix/solarish/solarish_mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CMSG_FIRSTHDR
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CcT
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.Group
import io.github.kotlinmania.libc.In6Addr
import io.github.kotlinmania.libc.InAddrT
import io.github.kotlinmania.libc.InPortT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.LgrpAffinityT
import io.github.kotlinmania.libc.LgrpRsrcT
import io.github.kotlinmania.libc.LocaleT
import io.github.kotlinmania.libc.PTHREAD_MUTEX_NORMAL
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.Rlimit
import io.github.kotlinmania.libc.SIGUSR1
import io.github.kotlinmania.libc.SIGUSR2
import io.github.kotlinmania.libc.ShmidDs
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.Sigval
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.UintptrT
import io.github.kotlinmania.libc.sysconf

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: DlPhdrInfo?, size: ULong, data: COpaquePointer?): CInt
}

public typealias CaddrT = COpaquePointer?

public typealias ClockidT = CInt

public typealias BlkcntT = CLong

public typealias ClockT = CLong

public typealias DaddrT = CLong

public typealias DevT = CUlong

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias InoT = CUlong

public typealias KeyT = CInt

public typealias MajorT = CUint

public typealias MinorT = CUint

public typealias ModeT = CUint

public typealias NlinkT = CUint

public typealias RlimT = CUlong

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias TimeT = CLong

public typealias TimerT = CInt

public typealias WcharT = CInt

public typealias NfdsT = CUlong

public typealias ProjidT = CInt

public typealias ZoneidT = CInt

public typealias PsetidT = CInt

public typealias ProcessoridT = CInt

public typealias ChipidT = CInt

public typealias CtidT = io.github.kotlinmania.libc.IdT

public typealias SusecondsT = CLong

public typealias OffT = CLong

public typealias UsecondsT = CUint

public typealias SocklenT = CUint

public typealias SaFamilyT = UShort

public typealias PthreadT = CUint

public typealias PthreadKeyT = CUint

public typealias ThreadT = CUint

public typealias BlksizeT = CInt

public typealias NlItem = CInt

public typealias MqdT = COpaquePointer?

public typealias IdT = CInt

public typealias IdtypeT = CUint

public typealias ShmattT = CUlong

public typealias LgrpIdT = io.github.kotlinmania.libc.IdT

public typealias LgrpMemSizeT = CLonglong

public typealias LgrpCookieT = UintptrT

public typealias LgrpContentT = CUint

public typealias LgrpLatBetweenT = CUint

public typealias LgrpMemSizeFlagT = CUint

public typealias LgrpViewT = CUint

public typealias PosixSpawnattrT = COpaquePointer?

public typealias PosixSpawnFileActionsT = COpaquePointer?

public sealed class Timezone {
}

public sealed class UcredT {
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
    public var key: io.github.kotlinmania.libc.KeyT,
)

public open class Sockaddr(public var saFamily: SaFamilyT, public var saData: List<CChar>)

public open class SockaddrIn(
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: io.github.kotlinmania.libc.InAddr,
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
    public var ipiSpecDst: io.github.kotlinmania.libc.InAddr,
    public var ipiAddr: io.github.kotlinmania.libc.InAddr,
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
    public var ifaAddr: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaNetmask: io.github.kotlinmania.libc.Sockaddr?,
    public var ifaDstaddr: io.github.kotlinmania.libc.Sockaddr?,
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
    public var msgNamelen: io.github.kotlinmania.libc.SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: io.github.kotlinmania.libc.SocklenT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: io.github.kotlinmania.libc.SocklenT,
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
    public var pthreadRwlockMutex: io.github.kotlinmania.libc.PthreadMutexT,
    public var pthreadRwlockReadercv: io.github.kotlinmania.libc.PthreadCondT,
    public var pthreadRwlockWritercv: io.github.kotlinmania.libc.PthreadCondT,
)

public open class PthreadRwlockattrT(public var pthreadRwlockattrp: COpaquePointer?)

public open class Dirent(
    public var dIno: io.github.kotlinmania.libc.InoT,
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
    public var aiAddrlen: io.github.kotlinmania.libc.SocklenT,
    public var aiCanonname: COpaquePointer?,
    public var aiAddr: io.github.kotlinmania.libc.Sockaddr?,
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
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFavail: io.github.kotlinmania.libc.FsfilcntT,
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
    public var stDev: io.github.kotlinmania.libc.DevT,
    public var stIno: io.github.kotlinmania.libc.InoT,
    public var stMode: ModeT,
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: io.github.kotlinmania.libc.DevT,
    public var stSize: OffT,
    public var stAtime: io.github.kotlinmania.libc.TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: io.github.kotlinmania.libc.TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: io.github.kotlinmania.libc.TimeT,
    public var stCtimeNsec: CLong,
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var stBlocks: io.github.kotlinmania.libc.BlkcntT,
    public var stFstype: List<CChar>,
)

public open class Termios(
    public var cIflag: io.github.kotlinmania.libc.TcflagT,
    public var cOflag: io.github.kotlinmania.libc.TcflagT,
    public var cCflag: io.github.kotlinmania.libc.TcflagT,
    public var cLflag: io.github.kotlinmania.libc.TcflagT,
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
    public var utTime: io.github.kotlinmania.libc.TimeT,
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
    public var mrAddr: io.github.kotlinmania.libc.CaddrT,
    public var mrMsize: SizeT,
    public var mrFsize: SizeT,
    public var mrOffset: SizeT,
    public var mrProt: CUint,
    public var mrFlags: CUint,
)

public open class LgrpAffinityArgsT(
    public var idtype: io.github.kotlinmania.libc.IdtypeT,
    public var id: io.github.kotlinmania.libc.IdT,
    public var lgrp: io.github.kotlinmania.libc.LgrpIdT,
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
    public var ssFamily: io.github.kotlinmania.libc.SaFamilyT,
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
    public var sigevNotifyAttributes: io.github.kotlinmania.libc.PthreadAttrT?,
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
        return (((this.dataPad).toInt() as T?))
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

public val SIGINFO_DATA_SIZE: Int = 60

public open class SiginfoFault(
    public var addr: COpaquePointer?,
    public var trapno: CInt,
    public var pc: COpaquePointer?,
)

public open class SiginfoCldval(
    public var utime: io.github.kotlinmania.libc.ClockT,
    public var status: CInt,
    public var stime: io.github.kotlinmania.libc.ClockT,
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
    public var ctid: io.github.kotlinmania.libc.CtidT,
    public var zoneid: io.github.kotlinmania.libc.ZoneidT,
)

public open class SiginfoKill(
    public var pid: PidT,
    public var value: SiginfoKillval,
    public var ctid: io.github.kotlinmania.libc.CtidT,
    public var zoneid: io.github.kotlinmania.libc.ZoneidT,
)

public val LC_CTYPE: CInt = 0

public val LC_NUMERIC: CInt = 1

public val LC_TIME: CInt = 2

public val LC_COLLATE: CInt = 3

public val LC_MONETARY: CInt = 4

public val LC_MESSAGES: CInt = 5

public val LC_ALL: CInt = 6

public val LC_CTYPE_MASK: CInt = 1 shl LC_CTYPE

public val LC_NUMERIC_MASK: CInt = 1 shl LC_NUMERIC

public val LC_TIME_MASK: CInt = 1 shl LC_TIME

public val LC_COLLATE_MASK: CInt = 1 shl LC_COLLATE

public val LC_MONETARY_MASK: CInt = 1 shl LC_MONETARY

public val LC_MESSAGES_MASK: CInt = 1 shl LC_MESSAGES

public val LC_ALL_MASK: CInt = LC_CTYPE_MASK or LC_NUMERIC_MASK or LC_TIME_MASK or LC_COLLATE_MASK or LC_MONETARY_MASK or LC_MESSAGES_MASK

public val DAY_1: io.github.kotlinmania.libc.NlItem = 1

public val DAY_2: io.github.kotlinmania.libc.NlItem = 2

public val DAY_3: io.github.kotlinmania.libc.NlItem = 3

public val DAY_4: io.github.kotlinmania.libc.NlItem = 4

public val DAY_5: io.github.kotlinmania.libc.NlItem = 5

public val DAY_6: io.github.kotlinmania.libc.NlItem = 6

public val DAY_7: io.github.kotlinmania.libc.NlItem = 7

public val ABDAY_1: io.github.kotlinmania.libc.NlItem = 8

public val ABDAY_2: io.github.kotlinmania.libc.NlItem = 9

public val ABDAY_3: io.github.kotlinmania.libc.NlItem = 10

public val ABDAY_4: io.github.kotlinmania.libc.NlItem = 11

public val ABDAY_5: io.github.kotlinmania.libc.NlItem = 12

public val ABDAY_6: io.github.kotlinmania.libc.NlItem = 13

public val ABDAY_7: io.github.kotlinmania.libc.NlItem = 14

public val MON_1: io.github.kotlinmania.libc.NlItem = 15

public val MON_2: io.github.kotlinmania.libc.NlItem = 16

public val MON_3: io.github.kotlinmania.libc.NlItem = 17

public val MON_4: io.github.kotlinmania.libc.NlItem = 18

public val MON_5: io.github.kotlinmania.libc.NlItem = 19

public val MON_6: io.github.kotlinmania.libc.NlItem = 20

public val MON_7: io.github.kotlinmania.libc.NlItem = 21

public val MON_8: io.github.kotlinmania.libc.NlItem = 22

public val MON_9: io.github.kotlinmania.libc.NlItem = 23

public val MON_10: io.github.kotlinmania.libc.NlItem = 24

public val MON_11: io.github.kotlinmania.libc.NlItem = 25

public val MON_12: io.github.kotlinmania.libc.NlItem = 26

public val ABMON_1: io.github.kotlinmania.libc.NlItem = 27

public val ABMON_2: io.github.kotlinmania.libc.NlItem = 28

public val ABMON_3: io.github.kotlinmania.libc.NlItem = 29

public val ABMON_4: io.github.kotlinmania.libc.NlItem = 30

public val ABMON_5: io.github.kotlinmania.libc.NlItem = 31

public val ABMON_6: io.github.kotlinmania.libc.NlItem = 32

public val ABMON_7: io.github.kotlinmania.libc.NlItem = 33

public val ABMON_8: io.github.kotlinmania.libc.NlItem = 34

public val ABMON_9: io.github.kotlinmania.libc.NlItem = 35

public val ABMON_10: io.github.kotlinmania.libc.NlItem = 36

public val ABMON_11: io.github.kotlinmania.libc.NlItem = 37

public val ABMON_12: io.github.kotlinmania.libc.NlItem = 38

public val RADIXCHAR: io.github.kotlinmania.libc.NlItem = 39

public val THOUSEP: io.github.kotlinmania.libc.NlItem = 40

public val YESSTR: io.github.kotlinmania.libc.NlItem = 41

public val NOSTR: io.github.kotlinmania.libc.NlItem = 42

public val CRNCYSTR: io.github.kotlinmania.libc.NlItem = 43

public val D_T_FMT: io.github.kotlinmania.libc.NlItem = 44

public val D_FMT: io.github.kotlinmania.libc.NlItem = 45

public val T_FMT: io.github.kotlinmania.libc.NlItem = 46

public val AM_STR: io.github.kotlinmania.libc.NlItem = 47

public val PM_STR: io.github.kotlinmania.libc.NlItem = 48

public val CODESET: io.github.kotlinmania.libc.NlItem = 49

public val T_FMT_AMPM: io.github.kotlinmania.libc.NlItem = 50

public val ERA: io.github.kotlinmania.libc.NlItem = 51

public val ERA_D_FMT: io.github.kotlinmania.libc.NlItem = 52

public val ERA_D_T_FMT: io.github.kotlinmania.libc.NlItem = 53

public val ERA_T_FMT: io.github.kotlinmania.libc.NlItem = 54

public val ALT_DIGITS: io.github.kotlinmania.libc.NlItem = 55

public val YESEXPR: io.github.kotlinmania.libc.NlItem = 56

public val NOEXPR: io.github.kotlinmania.libc.NlItem = 57

public val DATE_FMT: io.github.kotlinmania.libc.NlItem = 58

public val MAXSTRMSG: io.github.kotlinmania.libc.NlItem = 58

public val PATH_MAX: CInt = 1024

public val SA_ONSTACK: CInt = 0x00000001

public val SA_RESETHAND: CInt = 0x00000002

public val SA_RESTART: CInt = 0x00000004

public val SA_SIGINFO: CInt = 0x00000008

public val SA_NODEFER: CInt = 0x00000010

public val SA_NOCLDWAIT: CInt = 0x00010000

public val SA_NOCLDSTOP: CInt = 0x00020000

public val SS_ONSTACK: CInt = 1

public val SS_DISABLE: CInt = 2

public val FIOCLEX: CInt = 0x20006601

public val FIONCLEX: CInt = 0x20006602

public val FIONREAD: CInt = 0x4004667f

public val FIONBIO: CInt = 0x8004667e

public val FIOASYNC: CInt = 0x8004667d

public val FIOSETOWN: CInt = 0x8004667c

public val FIOGETOWN: CInt = 0x4004667b

public val SIGCHLD: CInt = 18

public val SIGCLD: CInt = SIGCHLD

public val SIGBUS: CInt = 10

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 3

public val AIO_CANCELED: CInt = 0

public val AIO_ALLDONE: CInt = 1

public val AIO_NOTCANCELED: CInt = 2

public val LIO_NOP: CInt = 0

public val LIO_READ: CInt = 1

public val LIO_WRITE: CInt = 2

public val LIO_NOWAIT: CInt = 0

public val LIO_WAIT: CInt = 1

public val SIGEV_NONE: CInt = 1

public val SIGEV_SIGNAL: CInt = 2

public val SIGEV_THREAD: CInt = 3

public val SIGEV_PORT: CInt = 4

public val CLD_EXITED: CInt = 1

public val CLD_KILLED: CInt = 2

public val CLD_DUMPED: CInt = 3

public val CLD_TRAPPED: CInt = 4

public val CLD_STOPPED: CInt = 5

public val CLD_CONTINUED: CInt = 6

public val IP_RECVDSTADDR: CInt = 0x7

public val IP_PKTINFO: CInt = 0x1a

public val IP_DONTFRAG: CInt = 0x1b

public val IP_SEC_OPT: CInt = 0x22

public val IPV6_UNICAST_HOPS: CInt = 0x5

public val IPV6_MULTICAST_IF: CInt = 0x6

public val IPV6_MULTICAST_HOPS: CInt = 0x7

public val IPV6_MULTICAST_LOOP: CInt = 0x8

public val IPV6_PKTINFO: CInt = 0xb

public val IPV6_RECVPKTINFO: CInt = 0x12

public val IPV6_RECVTCLASS: CInt = 0x19

public val IPV6_DONTFRAG: CInt = 0x21

public val IPV6_SEC_OPT: CInt = 0x22

public val IPV6_TCLASS: CInt = 0x26

public val IPV6_V6ONLY: CInt = 0x27

public val IPV6_BOUND_IF: CInt = 0x41

public val FD_SETSIZE: Int = 65536

public val ST_RDONLY: CUlong = 1uL

public val ST_NOSUID: CUlong = 2uL

public val NI_MAXHOST: io.github.kotlinmania.libc.SocklenT = 1025u

public val NI_MAXSERV: io.github.kotlinmania.libc.SocklenT = 32u

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 32767

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val SEEK_DATA: CInt = 3

public val SEEK_HOLE: CInt = 4

public val IOFBF: CInt = 0

public val IONBF: CInt = 4

public val IOLBF: CInt = 64

public val BUFSIZ: CUint = 1024u

public val FOPEN_MAX: CUint = 20u

public val FILENAME_MAX: CUint = 1024u

public val L_TMPNAM: CUint = 25u

public val TMP_MAX: CUint = 17576u

public val PIPE_BUF: CInt = 5120

public val GRND_NONBLOCK: CUint = 0x0001u

public val GRND_RANDOM: CUint = 0x0002u

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val O_NDELAY: CInt = 0x04

public val O_APPEND: CInt = 8

public val O_DSYNC: CInt = 0x40

public val O_RSYNC: CInt = 0x8000

public val O_CREAT: CInt = 256

public val O_EXCL: CInt = 1024

public val O_NOCTTY: CInt = 2048

public val O_TRUNC: CInt = 512

public val O_NOFOLLOW: CInt = 0x20000

public val O_SEARCH: CInt = 0x200000

public val O_EXEC: CInt = 0x400000

public val O_CLOEXEC: CInt = 0x800000

public val O_ACCMODE: CInt = 0x600003

public val O_XATTR: CInt = 0x4000

public val O_DIRECTORY: CInt = 0x1000000

public val S_IFIFO: ModeT = 4096u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFMT: ModeT = 61440u

public val S_IEXEC: ModeT = 64u

public val S_IWRITE: ModeT = 128u

public val S_IREAD: ModeT = 256u

public val S_IRWXU: ModeT = 448u

public val S_IXUSR: ModeT = 64u

public val S_IWUSR: ModeT = 128u

public val S_IRUSR: ModeT = 256u

public val S_IRWXG: ModeT = 56u

public val S_IXGRP: ModeT = 8u

public val S_IWGRP: ModeT = 16u

public val S_IRGRP: ModeT = 32u

public val S_IRWXO: ModeT = 7u

public val S_IXOTH: ModeT = 1u

public val S_IWOTH: ModeT = 2u

public val S_IROTH: ModeT = 4u

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val F_LOCK: CInt = 1

public val F_TEST: CInt = 3

public val F_TLOCK: CInt = 2

public val F_ULOCK: CInt = 0

public val F_SETLK: CInt = 6

public val F_SETLKW: CInt = 7

public val F_GETLK: CInt = 14

public val F_ALLOCSP: CInt = 10

public val F_FREESP: CInt = 11

public val F_BLOCKS: CInt = 18

public val F_BLKSIZE: CInt = 19

public val F_SHARE: CInt = 40

public val F_UNSHARE: CInt = 41

public val F_ISSTREAM: CInt = 13

public val F_PRIV: CInt = 15

public val F_NPRIV: CInt = 16

public val F_QUOTACTL: CInt = 17

public val F_GETOWN: CInt = 23

public val F_SETOWN: CInt = 24

public val F_REVOKE: CInt = 25

public val F_HASREMOTELOCKS: CInt = 26

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGABRT: CInt = 6

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGSEGV: CInt = 11

public val SIGSYS: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGUSR1: CInt = 16

public val SIGUSR2: CInt = 17

public val SIGPWR: CInt = 19

public val SIGWINCH: CInt = 20

public val SIGURG: CInt = 21

public val SIGPOLL: CInt = 22

public val SIGIO: CInt = SIGPOLL

public val SIGSTOP: CInt = 23

public val SIGTSTP: CInt = 24

public val SIGCONT: CInt = 25

public val SIGTTIN: CInt = 26

public val SIGTTOU: CInt = 27

public val SIGVTALRM: CInt = 28

public val SIGPROF: CInt = 29

public val SIGXCPU: CInt = 30

public val SIGXFSZ: CInt = 31

public val WNOHANG: CInt = 0x40

public val WUNTRACED: CInt = 0x04

public val WEXITED: CInt = 0x01

public val WTRAPPED: CInt = 0x02

public val WSTOPPED: CInt = WUNTRACED

public val WCONTINUED: CInt = 0x08

public val WNOWAIT: CInt = 0x80

public val AT_FDCWD: CInt = 0xffd19553

public val AT_SYMLINK_NOFOLLOW: CInt = 0x1000

public val AT_SYMLINK_FOLLOW: CInt = 0x2000

public val AT_REMOVEDIR: CInt = 0x1

public val AT_TRIGGER: CInt = 0x2

public val AT_EACCESS: CInt = 0x4

public val P_PID: IdtypeT = 0u

public val P_PPID: IdtypeT = 1u

public val P_PGID: IdtypeT = 2u

public val P_SID: IdtypeT = 3u

public val P_CID: IdtypeT = 4u

public val P_UID: IdtypeT = 5u

public val P_GID: IdtypeT = 6u

public val P_ALL: IdtypeT = 7u

public val P_LWPID: IdtypeT = 8u

public val P_TASKID: IdtypeT = 9u

public val P_PROJID: IdtypeT = 10u

public val P_POOLID: IdtypeT = 11u

public val P_ZONEID: IdtypeT = 12u

public val P_CTID: IdtypeT = 13u

public val P_CPUID: IdtypeT = 14u

public val P_PSETID: IdtypeT = 15u

public val PBIND_NONE: io.github.kotlinmania.libc.ProcessoridT = -1

public val PBIND_QUERY: io.github.kotlinmania.libc.ProcessoridT = -2

public val PS_NONE: CInt = -1

public val PS_QUERY: CInt = -2

public val PS_MYID: CInt = -3

public val PS_SOFT: CInt = -4

public val PS_HARD: CInt = -5

public val PS_QUERY_TYPE: CInt = -6

public val PS_PRIVATE: CInt = 2

public val UTIME_OMIT: CLong = -2L

public val UTIME_NOW: CLong = -1L

public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_FIXED: CInt = 0x0010

public val MAP_NORESERVE: CInt = 0x40

public val MAP_ANON: CInt = 0x0100

public val MAP_ANONYMOUS: CInt = 0x0100

public val MAP_RENAME: CInt = 0x20

public val MAP_ALIGN: CInt = 0x200

public val MAP_TEXT: CInt = 0x400

public val MAP_INITDATA: CInt = 0x800

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MS_SYNC: CInt = 0x0004

public val MS_ASYNC: CInt = 0x0001

public val MS_INVALIDATE: CInt = 0x0002

public val MMOBJ_PADDING: CUint = 0x10000u

public val MMOBJ_INTERPRET: CUint = 0x20000u

public val MR_PADDING: CUint = 0x1u

public val MR_HDR_ELF: CUint = 0x2u

public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val ENOTBLK: CInt = 15

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val ENOMSG: CInt = 35

public val EIDRM: CInt = 36

public val ECHRNG: CInt = 37

public val EL2NSYNC: CInt = 38

public val EL3HLT: CInt = 39

public val EL3RST: CInt = 40

public val ELNRNG: CInt = 41

public val EUNATCH: CInt = 42

public val ENOCSI: CInt = 43

public val EL2HLT: CInt = 44

public val EDEADLK: CInt = 45

public val ENOLCK: CInt = 46

public val ECANCELED: CInt = 47

public val ENOTSUP: CInt = 48

public val EDQUOT: CInt = 49

public val EBADE: CInt = 50

public val EBADR: CInt = 51

public val EXFULL: CInt = 52

public val ENOANO: CInt = 53

public val EBADRQC: CInt = 54

public val EBADSLT: CInt = 55

public val EDEADLOCK: CInt = 56

public val EBFONT: CInt = 57

public val EOWNERDEAD: CInt = 58

public val ENOTRECOVERABLE: CInt = 59

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENONET: CInt = 64

public val ENOPKG: CInt = 65

public val EREMOTE: CInt = 66

public val ENOLINK: CInt = 67

public val EADV: CInt = 68

public val ESRMNT: CInt = 69

public val ECOMM: CInt = 70

public val EPROTO: CInt = 71

public val ELOCKUNMAPPED: CInt = 72

public val ENOTACTIVE: CInt = 73

public val EMULTIHOP: CInt = 74

public val EADI: CInt = 75

public val EBADMSG: CInt = 77

public val ENAMETOOLONG: CInt = 78

public val EOVERFLOW: CInt = 79

public val ENOTUNIQ: CInt = 80

public val EBADFD: CInt = 81

public val EREMCHG: CInt = 82

public val ELIBACC: CInt = 83

public val ELIBBAD: CInt = 84

public val ELIBSCN: CInt = 85

public val ELIBMAX: CInt = 86

public val ELIBEXEC: CInt = 87

public val EILSEQ: CInt = 88

public val ENOSYS: CInt = 89

public val ELOOP: CInt = 90

public val ERESTART: CInt = 91

public val ESTRPIPE: CInt = 92

public val ENOTEMPTY: CInt = 93

public val EUSERS: CInt = 94

public val ENOTSOCK: CInt = 95

public val EDESTADDRREQ: CInt = 96

public val EMSGSIZE: CInt = 97

public val EPROTOTYPE: CInt = 98

public val ENOPROTOOPT: CInt = 99

public val EPROTONOSUPPORT: CInt = 120

public val ESOCKTNOSUPPORT: CInt = 121

public val EOPNOTSUPP: CInt = 122

public val EPFNOSUPPORT: CInt = 123

public val EAFNOSUPPORT: CInt = 124

public val EADDRINUSE: CInt = 125

public val EADDRNOTAVAIL: CInt = 126

public val ENETDOWN: CInt = 127

public val ENETUNREACH: CInt = 128

public val ENETRESET: CInt = 129

public val ECONNABORTED: CInt = 130

public val ECONNRESET: CInt = 131

public val ENOBUFS: CInt = 132

public val EISCONN: CInt = 133

public val ENOTCONN: CInt = 134

public val ESHUTDOWN: CInt = 143

public val ETOOMANYREFS: CInt = 144

public val ETIMEDOUT: CInt = 145

public val ECONNREFUSED: CInt = 146

public val EHOSTDOWN: CInt = 147

public val EHOSTUNREACH: CInt = 148

public val EWOULDBLOCK: CInt = EAGAIN

public val EALREADY: CInt = 149

public val EINPROGRESS: CInt = 150

public val ESTALE: CInt = 151

public val EAI_AGAIN: CInt = 2

public val EAI_BADFLAGS: CInt = 3

public val EAI_FAIL: CInt = 4

public val EAI_FAMILY: CInt = 5

public val EAI_MEMORY: CInt = 6

public val EAI_NODATA: CInt = 7

public val EAI_NONAME: CInt = 8

public val EAI_SERVICE: CInt = 9

public val EAI_SOCKTYPE: CInt = 10

public val EAI_SYSTEM: CInt = 11

public val EAI_OVERFLOW: CInt = 12

public val NI_NOFQDN: CUint = 0x0001u

public val NI_NUMERICHOST: CUint = 0x0002u

public val NI_NAMEREQD: CUint = 0x0004u

public val NI_NUMERICSERV: CUint = 0x0008u

public val NI_DGRAM: CUint = 0x0010u

public val NI_WITHSCOPEID: CUint = 0x0020u

public val NI_NUMERICSCOPE: CUint = 0x0040u

public val F_DUPFD: CInt = 0

public val F_DUP2FD: CInt = 9

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETXFL: CInt = 45

public val SIGTRAP: CInt = 5

public val GLOB_APPEND: CInt = 32

public val GLOB_DOOFFS: CInt = 16

public val GLOB_ERR: CInt = 1

public val GLOB_MARK: CInt = 2

public val GLOB_NOCHECK: CInt = 8

public val GLOB_NOSORT: CInt = 4

public val GLOB_NOESCAPE: CInt = 64

public val GLOB_NOSPACE: CInt = -2

public val GLOB_ABORTED: CInt = -1

public val GLOB_NOMATCH: CInt = -3

public val POLLIN: CShort = 0x1

public val POLLPRI: CShort = 0x2

public val POLLOUT: CShort = 0x4

public val POLLERR: CShort = 0x8

public val POLLHUP: CShort = 0x10

public val POLLNVAL: CShort = 0x20

public val POLLNORM: CShort = 0x0040

public val POLLRDNORM: CShort = 0x0040

public val POLLWRNORM: CShort = 0x4

// POLLOUT
public val POLLRDBAND: CShort = 0x0080

public val POLLWRBAND: CShort = 0x0100

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_DONTNEED: CInt = 4

public val POSIX_SPAWN_RESETIDS: CShort = 0x1

public val POSIX_SPAWN_SETPGROUP: CShort = 0x2

public val POSIX_SPAWN_SETSIGDEF: CShort = 0x4

public val POSIX_SPAWN_SETSIGMASK: CShort = 0x8

public val POSIX_SPAWN_SETSCHEDPARAM: CShort = 0x10

public val POSIX_SPAWN_SETSCHEDULER: CShort = 0x20

public val POSIX_SPAWN_SETSIGIGN_NP: CShort = 0x800

public val POSIX_SPAWN_NOSIGCHLD_NP: CShort = 0x1000

public val POSIX_SPAWN_WAITPID_NP: CShort = 0x2000

public val POSIX_SPAWN_NOEXECERR_NP: CShort = 0x4000

public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_CREATE_DETACHED: CInt = 0x40

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val PTHREAD_PROCESS_PRIVATE: CUshort = 0u

public val PTHREAD_STACK_MIN: SizeT = 4096uL

public val SIGSTKSZ: SizeT = 8192uL

// https://illumos.org/man/3c/clockGettime
// https://github.com/illumos/illumos-gate/
// blob/HEAD/usr/src/lib/libc/amd64/sys/__clock_gettime.s
// clockGettime(3c) doesn't seem to accept anything other than CLOCK_REALTIME
// or __CLOCK_REALTIME0
//
// https://github.com/illumos/illumos-gate/
// blob/HEAD/usr/src/uts/common/sys/timeImpl.h
// Confusing! CLOCK_HIGHRES==CLOCK_MONOTONIC==4
// __CLOCK_REALTIME0==0 is an obsoleted version of CLOCK_REALTIME==3
public val CLOCK_REALTIME: io.github.kotlinmania.libc.ClockidT = 3

public val CLOCK_MONOTONIC: io.github.kotlinmania.libc.ClockidT = 4

public val TIMER_RELTIME: CInt = 0

public val TIMER_ABSTIME: CInt = 1

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_NOFILE: CInt = 5

public val RLIMIT_VMEM: CInt = 6

public val RLIMIT_AS: CInt = RLIMIT_VMEM

public val RLIM_NLIMITS: RlimT = 7uL

public val RLIM_INFINITY: RlimT = 0xfffffffffffffffduL

public val RUSAGE_SELF: CInt = 0

public val RUSAGE_CHILDREN: CInt = -1

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val MADV_FREE: CInt = 5

public val MADV_ACCESS_DEFAULT: CInt = 6

public val MADV_ACCESS_LWP: CInt = 7

public val MADV_ACCESS_MANY: CInt = 8

public val AF_UNSPEC: CInt = 0

public val AF_UNIX: CInt = 1

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NS: CInt = 6

public val AF_NBS: CInt = 7

public val AF_ECMA: CInt = 8

public val AF_DATAKIT: CInt = 9

public val AF_CCITT: CInt = 10

public val AF_SNA: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_LAT: CInt = 14

public val AF_HYLINK: CInt = 15

public val AF_APPLETALK: CInt = 16

public val AF_NIT: CInt = 17

public val AF_802: CInt = 18

public val AF_OSI: CInt = 19

public val AF_X25: CInt = 20

public val AF_OSINET: CInt = 21

public val AF_GOSIP: CInt = 22

public val AF_IPX: CInt = 23

public val AF_ROUTE: CInt = 24

public val AF_LINK: CInt = 25

public val AF_INET6: CInt = 26

public val AF_KEY: CInt = 27

public val AF_POLICY: CInt = 29

public val AF_INET_OFFLOAD: CInt = 30

public val AF_TRILL: CInt = 31

public val AF_PACKET: CInt = 32

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_UNIX: CInt = AF_UNIX

public val PF_LOCAL: CInt = PF_UNIX

public val PF_FILE: CInt = PF_UNIX

public val PF_INET: CInt = AF_INET

public val PF_IMPLINK: CInt = AF_IMPLINK

public val PF_PUP: CInt = AF_PUP

public val PF_CHAOS: CInt = AF_CHAOS

public val PF_NS: CInt = AF_NS

public val PF_NBS: CInt = AF_NBS

public val PF_ECMA: CInt = AF_ECMA

public val PF_DATAKIT: CInt = AF_DATAKIT

public val PF_CCITT: CInt = AF_CCITT

public val PF_SNA: CInt = AF_SNA

public val PF_DE_CNET: CInt = AF_DE_CNET

public val PF_DLI: CInt = AF_DLI

public val PF_LAT: CInt = AF_LAT

public val PF_HYLINK: CInt = AF_HYLINK

public val PF_APPLETALK: CInt = AF_APPLETALK

public val PF_NIT: CInt = AF_NIT

public val PF_802: CInt = AF_802

public val PF_OSI: CInt = AF_OSI

public val PF_X25: CInt = AF_X25

public val PF_OSINET: CInt = AF_OSINET

public val PF_GOSIP: CInt = AF_GOSIP

public val PF_IPX: CInt = AF_IPX

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_LINK: CInt = AF_LINK

public val PF_INET6: CInt = AF_INET6

public val PF_KEY: CInt = AF_KEY

public val PF_POLICY: CInt = AF_POLICY

public val PF_INET_OFFLOAD: CInt = AF_INET_OFFLOAD

public val PF_TRILL: CInt = AF_TRILL

public val PF_PACKET: CInt = AF_PACKET

public val SOCK_DGRAM: CInt = 1

public val SOCK_STREAM: CInt = 2

public val SOCK_RAW: CInt = 4

public val SOCK_RDM: CInt = 5

public val SOCK_SEQPACKET: CInt = 6

public val IP_MULTICAST_IF: CInt = 16

public val IP_MULTICAST_TTL: CInt = 17

public val IP_MULTICAST_LOOP: CInt = 18

public val IP_HDRINCL: CInt = 2

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_ADD_MEMBERSHIP: CInt = 19

public val IP_DROP_MEMBERSHIP: CInt = 20

public val IPV6_JOIN_GROUP: CInt = 9

public val IPV6_LEAVE_GROUP: CInt = 10

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 23

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 24

public val IP_BLOCK_SOURCE: CInt = 21

public val IP_UNBLOCK_SOURCE: CInt = 22

public val IP_BOUND_IF: CInt = 0x41

// These TCP socket options are common between illumos and Solaris, while higher
// numbers have generally diverged:
public val TCP_NODELAY: CInt = 0x1

public val TCP_MAXSEG: CInt = 0x2

public val TCP_KEEPALIVE: CInt = 0x8

public val TCP_NOTIFY_THRESHOLD: CInt = 0x10

public val TCP_ABORT_THRESHOLD: CInt = 0x11

public val TCP_CONN_NOTIFY_THRESHOLD: CInt = 0x12

public val TCP_CONN_ABORT_THRESHOLD: CInt = 0x13

public val TCP_RECVDSTADDR: CInt = 0x14

public val TCP_INIT_CWND: CInt = 0x15

public val TCP_KEEPALIVE_THRESHOLD: CInt = 0x16

public val TCP_KEEPALIVE_ABORT_THRESHOLD: CInt = 0x17

public val TCP_CORK: CInt = 0x18

public val TCP_RTO_INITIAL: CInt = 0x19

public val TCP_RTO_MIN: CInt = 0x1a

public val TCP_RTO_MAX: CInt = 0x1b

public val TCP_LINGER2: CInt = 0x1c

public val UDP_NAT_T_ENDPOINT: CInt = 0x0103

public val SOMAXCONN: CInt = 128

public val SOL_SOCKET: CInt = 0xffff

public val SO_DEBUG: CInt = 0x01

public val SO_ACCEPTCONN: CInt = 0x0002

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_OOBINLINE: CInt = 0x0100

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SO_PROTOTYPE: CInt = 0x1009

public val SO_DOMAIN: CInt = 0x100c

public val SO_TIMESTAMP: CInt = 0x1013

public val SO_EXCLBIND: CInt = 0x1015

public val SCM_RIGHTS: CInt = 0x1010

public val SCM_UCRED: CInt = 0x1012

public val SCM_TIMESTAMP: CInt = SO_TIMESTAMP

public val MSG_OOB: CInt = 0x1

public val MSG_PEEK: CInt = 0x2

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_EOR: CInt = 0x8

public val MSG_CTRUNC: CInt = 0x10

public val MSG_TRUNC: CInt = 0x20

public val MSG_WAITALL: CInt = 0x40

public val MSG_DONTWAIT: CInt = 0x80

public val MSG_NOTIFICATION: CInt = 0x100

public val MSG_NOSIGNAL: CInt = 0x200

public val MSG_DUPCTRL: CInt = 0x800

public val MSG_XPG4_2: CInt = 0x8000

public val MSG_MAXIOVLEN: CInt = 16

public val IF_NAMESIZE: SizeT = 32uL

public val IFNAMSIZ: SizeT = 16uL

// https://docs.oracle.com/cd/E23824_01/html/821-1475/if-7p.html
public val IFF_UP: CInt = 0x0000000001

// Address is up
public val IFF_BROADCAST: CInt = 0x0000000002

// Broadcast address valid
public val IFF_DEBUG: CInt = 0x0000000004

// Turn on debugging
public val IFF_LOOPBACK: CInt = 0x0000000008

// Loopback net
public val IFF_POINTOPOINT: CInt = 0x0000000010

// Interface is p-to-p
public val IFF_NOTRAILERS: CInt = 0x0000000020

// Avoid use of trailers
public val IFF_RUNNING: CInt = 0x0000000040

// Resources allocated
public val IFF_NOARP: CInt = 0x0000000080

// No address res. protocol
public val IFF_PROMISC: CInt = 0x0000000100

// Receive all packets
public val IFF_ALLMULTI: CInt = 0x0000000200

// Receive all multicast pkts
public val IFF_INTELLIGENT: CInt = 0x0000000400

// Protocol code on board
public val IFF_MULTICAST: CInt = 0x0000000800

// Supports multicast
// Multicast using broadcst. add.
public val IFF_MULTI_BCAST: CInt = 0x0000001000

public val IFF_UNNUMBERED: CInt = 0x0000002000

// Non-unique address
public val IFF_DHCPRUNNING: CInt = 0x0000004000

// DHCP controls interface
public val IFF_PRIVATE: CInt = 0x0000008000

// Do not advertise
public val IFF_NOXMIT: CInt = 0x0000010000

// Do not transmit pkts
// No address - just on-link subnet
public val IFF_NOLOCAL: CInt = 0x0000020000

public val IFF_DEPRECATED: CInt = 0x0000040000

// Address is deprecated
public val IFF_ADDRCONF: CInt = 0x0000080000

// Addr. from stateless addrconf
public val IFF_ROUTER: CInt = 0x0000100000

// Router on interface
public val IFF_NONUD: CInt = 0x0000200000

// No NUD on interface
public val IFF_ANYCAST: CInt = 0x0000400000

// Anycast address
public val IFF_NORTEXCH: CInt = 0x0000800000

// Don't xchange rout. info
public val IFF_IPV4: CInt = 0x0001000000

// IPv4 interface
public val IFF_IPV6: CInt = 0x0002000000

// IPv6 interface
public val IFF_NOFAILOVER: CInt = 0x0008000000

// in.mpathd test address
public val IFF_FAILED: CInt = 0x0010000000

// Interface has failed
public val IFF_STANDBY: CInt = 0x0020000000

// Interface is a hot-spare
public val IFF_INACTIVE: CInt = 0x0040000000

// Functioning but not used
public val IFF_OFFLINE: CInt = 0x0080000000

// Interface is offline
// If CoS marking is supported
public val IFF_COS_ENABLED: CLonglong = 0x0200000000L

public val IFF_PREFERRED: CLonglong = 0x0400000000L

// Prefer as source addr.
public val IFF_TEMPORARY: CLonglong = 0x0800000000L

// RFC3041
public val IFF_FIXEDMTU: CLonglong = 0x1000000000L

// MTU set with SIOCSLIFMTU
public val IFF_VIRTUAL: CLonglong = 0x2000000000L

// Cannot send/receive pkts
public val IFF_DUPLICATE: CLonglong = 0x4000000000L

// Local address in use
public val IFF_IPMP: CLonglong = 0x8000000000L

// IPMP IP interface
// sys/ipc.h:
public val IPC_ALLOC: CInt = 0x8000

public val IPC_CREAT: CInt = 0x200

public val IPC_EXCL: CInt = 0x400

public val IPC_NOWAIT: CInt = 0x800

public val IPC_PRIVATE: KeyT = 0

public val IPC_RMID: CInt = 10

public val IPC_SET: CInt = 11

public val IPC_SEAT: CInt = 12

// sys/shm.h
public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_SHARE_MMU: CInt = 16384

public val SHM_PAGEABLE: CInt = 32768

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val F_RDLCK: CShort = 1

public val F_WRLCK: CShort = 2

public val F_UNLCK: CShort = 3

public val O_SYNC: CInt = 16

public val O_NONBLOCK: CInt = 128

public val IPPROTO_RAW: CInt = 255

public val PC_LINK_MAX: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_PATH_MAX: CInt = 5

public val PC_PIPE_BUF: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_CHOWN_RESTRICTED: CInt = 9

public val PC_ASYNC_IO: CInt = 10

public val PC_PRIO_IO: CInt = 11

public val PC_SYNC_IO: CInt = 12

public val PC_ALLOC_SIZE_MIN: CInt = 13

public val PC_REC_INCR_XFER_SIZE: CInt = 14

public val PC_REC_MAX_XFER_SIZE: CInt = 15

public val PC_REC_MIN_XFER_SIZE: CInt = 16

public val PC_REC_XFER_ALIGN: CInt = 17

public val PC_SYMLINK_MAX: CInt = 18

public val PC_2_SYMLINKS: CInt = 19

public val PC_ACL_ENABLED: CInt = 20

public val PC_MIN_HOLE_SIZE: CInt = 21

public val PC_CASE_BEHAVIOR: CInt = 22

public val PC_SATTR_ENABLED: CInt = 23

public val PC_SATTR_EXISTS: CInt = 24

public val PC_ACCESS_FILTERING: CInt = 25

public val PC_TIMESTAMP_RESOLUTION: CInt = 26

public val PC_FILESIZEBITS: CInt = 67

public val PC_XATTR_ENABLED: CInt = 100

public val PC_XATTR_EXISTS: CInt = 101

public val POSIX_VDISABLE: CcT = 0

public val SC_ARG_MAX: CInt = 1

public val SC_CHILD_MAX: CInt = 2

public val SC_CLK_TCK: CInt = 3

public val SC_NGROUPS_MAX: CInt = 4

public val SC_OPEN_MAX: CInt = 5

public val SC_JOB_CONTROL: CInt = 6

public val SC_SAVED_IDS: CInt = 7

public val SC_VERSION: CInt = 8

public val SC_PASS_MAX: CInt = 9

public val SC_LOGNAME_MAX: CInt = 10

public val SC_PAGESIZE: CInt = 11

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_XOPEN_VERSION: CInt = 12

public val SC_NPROCESSORS_CONF: CInt = 14

public val SC_NPROCESSORS_ONLN: CInt = 15

public val SC_STREAM_MAX: CInt = 16

public val SC_TZNAME_MAX: CInt = 17

public val SC_AIO_LISTIO_MAX: CInt = 18

public val SC_AIO_MAX: CInt = 19

public val SC_AIO_PRIO_DELTA_MAX: CInt = 20

public val SC_ASYNCHRONOUS_IO: CInt = 21

public val SC_DELAYTIMER_MAX: CInt = 22

public val SC_FSYNC: CInt = 23

public val SC_MAPPED_FILES: CInt = 24

public val SC_MEMLOCK: CInt = 25

public val SC_MEMLOCK_RANGE: CInt = 26

public val SC_MEMORY_PROTECTION: CInt = 27

public val SC_MESSAGE_PASSING: CInt = 28

public val SC_MQ_OPEN_MAX: CInt = 29

public val SC_MQ_PRIO_MAX: CInt = 30

public val SC_PRIORITIZED_IO: CInt = 31

public val SC_PRIORITY_SCHEDULING: CInt = 32

public val SC_REALTIME_SIGNALS: CInt = 33

public val SC_RTSIG_MAX: CInt = 34

public val SC_SEMAPHORES: CInt = 35

public val SC_SEM_NSEMS_MAX: CInt = 36

public val SC_SEM_VALUE_MAX: CInt = 37

public val SC_SHARED_MEMORY_OBJECTS: CInt = 38

public val SC_SIGQUEUE_MAX: CInt = 39

public val SC_SIGRT_MIN: CInt = 40

public val SC_SIGRT_MAX: CInt = 41

public val SC_SYNCHRONIZED_IO: CInt = 42

public val SC_TIMERS: CInt = 43

public val SC_TIMER_MAX: CInt = 44

public val SC_2_C_BIND: CInt = 45

public val SC_2_C_DEV: CInt = 46

public val SC_2_C_VERSION: CInt = 47

public val SC_2_FORT_DEV: CInt = 48

public val SC_2_FORT_RUN: CInt = 49

public val SC_2_LOCALEDEF: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_UPE: CInt = 52

public val SC_2_VERSION: CInt = 53

public val SC_BC_BASE_MAX: CInt = 54

public val SC_BC_DIM_MAX: CInt = 55

public val SC_BC_SCALE_MAX: CInt = 56

public val SC_BC_STRING_MAX: CInt = 57

public val SC_COLL_WEIGHTS_MAX: CInt = 58

public val SC_EXPR_NEST_MAX: CInt = 59

public val SC_LINE_MAX: CInt = 60

public val SC_RE_DUP_MAX: CInt = 61

public val SC_XOPEN_CRYPT: CInt = 62

public val SC_XOPEN_ENH_I18N: CInt = 63

public val SC_XOPEN_SHM: CInt = 64

public val SC_2_CHAR_TERM: CInt = 66

public val SC_XOPEN_XCU_VERSION: CInt = 67

public val SC_ATEXIT_MAX: CInt = 76

public val SC_IOV_MAX: CInt = 77

public val SC_XOPEN_UNIX: CInt = 78

public val SC_T_IOV_MAX: CInt = 79

public val SC_PHYS_PAGES: CInt = 500

public val SC_AVPHYS_PAGES: CInt = 501

public val SC_COHER_BLKSZ: CInt = 503

public val SC_SPLIT_CACHE: CInt = 504

public val SC_ICACHE_SZ: CInt = 505

public val SC_DCACHE_SZ: CInt = 506

public val SC_ICACHE_LINESZ: CInt = 507

public val SC_DCACHE_LINESZ: CInt = 508

public val SC_ICACHE_BLKSZ: CInt = 509

public val SC_DCACHE_BLKSZ: CInt = 510

public val SC_DCACHE_TBLKSZ: CInt = 511

public val SC_ICACHE_ASSOC: CInt = 512

public val SC_DCACHE_ASSOC: CInt = 513

public val SC_MAXPID: CInt = 514

public val SC_STACK_PROT: CInt = 515

public val SC_NPROCESSORS_MAX: CInt = 516

public val SC_CPUID_MAX: CInt = 517

public val SC_EPHID_MAX: CInt = 518

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 568

public val SC_GETGR_R_SIZE_MAX: CInt = 569

public val SC_GETPW_R_SIZE_MAX: CInt = 570

public val SC_LOGIN_NAME_MAX: CInt = 571

public val SC_THREAD_KEYS_MAX: CInt = 572

public val SC_THREAD_STACK_MIN: CInt = 573

public val SC_THREAD_THREADS_MAX: CInt = 574

public val SC_TTY_NAME_MAX: CInt = 575

public val SC_THREADS: CInt = 576

public val SC_THREAD_ATTR_STACKADDR: CInt = 577

public val SC_THREAD_ATTR_STACKSIZE: CInt = 578

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 579

public val SC_THREAD_PRIO_INHERIT: CInt = 580

public val SC_THREAD_PRIO_PROTECT: CInt = 581

public val SC_THREAD_PROCESS_SHARED: CInt = 582

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 583

public val SC_XOPEN_LEGACY: CInt = 717

public val SC_XOPEN_REALTIME: CInt = 718

public val SC_XOPEN_REALTIME_THREADS: CInt = 719

public val SC_XBS5_ILP32_OFF32: CInt = 720

public val SC_XBS5_ILP32_OFFBIG: CInt = 721

public val SC_XBS5_LP64_OFF64: CInt = 722

public val SC_XBS5_LPBIG_OFFBIG: CInt = 723

public val SC_2_PBS: CInt = 724

public val SC_2_PBS_ACCOUNTING: CInt = 725

public val SC_2_PBS_CHECKPOINT: CInt = 726

public val SC_2_PBS_LOCATE: CInt = 728

public val SC_2_PBS_MESSAGE: CInt = 729

public val SC_2_PBS_TRACK: CInt = 730

public val SC_ADVISORY_INFO: CInt = 731

public val SC_BARRIERS: CInt = 732

public val SC_CLOCK_SELECTION: CInt = 733

public val SC_CPUTIME: CInt = 734

public val SC_HOST_NAME_MAX: CInt = 735

public val SC_MONOTONIC_CLOCK: CInt = 736

public val SC_READER_WRITER_LOCKS: CInt = 737

public val SC_REGEXP: CInt = 738

public val SC_SHELL: CInt = 739

public val SC_SPAWN: CInt = 740

public val SC_SPIN_LOCKS: CInt = 741

public val SC_SPORADIC_SERVER: CInt = 742

public val SC_SS_REPL_MAX: CInt = 743

public val SC_SYMLOOP_MAX: CInt = 744

public val SC_THREAD_CPUTIME: CInt = 745

public val SC_THREAD_SPORADIC_SERVER: CInt = 746

public val SC_TIMEOUTS: CInt = 747

public val SC_TRACE: CInt = 748

public val SC_TRACE_EVENT_FILTER: CInt = 749

public val SC_TRACE_EVENT_NAME_MAX: CInt = 750

public val SC_TRACE_INHERIT: CInt = 751

public val SC_TRACE_LOG: CInt = 752

public val SC_TRACE_NAME_MAX: CInt = 753

public val SC_TRACE_SYS_MAX: CInt = 754

public val SC_TRACE_USER_EVENT_MAX: CInt = 755

public val SC_TYPED_MEMORY_OBJECTS: CInt = 756

public val SC_V6_ILP32_OFF32: CInt = 757

public val SC_V6_ILP32_OFFBIG: CInt = 758

public val SC_V6_LP64_OFF64: CInt = 759

public val SC_V6_LPBIG_OFFBIG: CInt = 760

public val SC_XOPEN_STREAMS: CInt = 761

public val SC_IPV6: CInt = 762

public val SC_RAW_SOCKETS: CInt = 763

public val ST_FSTYPSZ: CInt = 16

public val MUTEX_MAGIC: UShort = 0x4d58u

// MX
public val COND_MAGIC: UShort = 0x4356u

// CV
public val RWL_MAGIC: UShort = 0x5257u

// RW
public val NCCS: Int = 19

public val LOG_CRON: CInt = 15 shl 3

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(pthreadMutexFlag1 = 0, pthreadMutexFlag2 = 0, pthreadMutexCeiling = 0, pthreadMutexType = PTHREAD_PROCESS_PRIVATE, pthreadMutexMagic = MUTEX_MAGIC, pthreadMutexLock = 0, pthreadMutexData = 0)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(pthreadCondFlag = List(4) { 0 }, pthreadCondType = PTHREAD_PROCESS_PRIVATE, pthreadCondMagic = COND_MAGIC, pthreadCondData = 0)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(pthreadRwlockReaders = 0, pthreadRwlockType = PTHREAD_PROCESS_PRIVATE, pthreadRwlockMagic = RWL_MAGIC, pthreadRwlockMutex = PTHREAD_MUTEX_INITIALIZER, pthreadRwlockReadercv = PTHREAD_COND_INITIALIZER, pthreadRwlockWritercv = PTHREAD_COND_INITIALIZER)

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_RECURSIVE: CInt = 4

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1).toLong())

public val RTLD_DEFAULT: COpaquePointer? = COpaquePointer((-2).toLong())

public val RTLD_SELF: COpaquePointer? = COpaquePointer((-3).toLong())

public val RTLD_PROBE: COpaquePointer? = COpaquePointer((-4).toLong())

public val RTLD_LAZY: CInt = 0x1

public val RTLD_NOW: CInt = 0x2

public val RTLD_NOLOAD: CInt = 0x4

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_LOCAL: CInt = 0x0

public val RTLD_PARENT: CInt = 0x200

public val RTLD_GROUP: CInt = 0x400

public val RTLD_WORLD: CInt = 0x800

public val RTLD_NODELETE: CInt = 0x1000

public val RTLD_FIRST: CInt = 0x2000

public val RTLD_CONFGEN: CInt = 0x10000

public val PORT_SOURCE_AIO: CInt = 1

public val PORT_SOURCE_TIMER: CInt = 2

public val PORT_SOURCE_USER: CInt = 3

public val PORT_SOURCE_FD: CInt = 4

public val PORT_SOURCE_ALERT: CInt = 5

public val PORT_SOURCE_MQ: CInt = 6

public val PORT_SOURCE_FILE: CInt = 7

public val NONROOT_USR: CShort = 2

public val EMPTY: CShort = 0

public val RUN_LVL: CShort = 1

public val BOOT_TIME: CShort = 2

public val OLD_TIME: CShort = 3

public val NEW_TIME: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val USER_PROCESS: CShort = 7

public val DEAD_PROCESS: CShort = 8

public val ACCOUNTING: CShort = 9

public val DOWN_TIME: CShort = 10

public val TIOC: CInt = ('T'.toInt()) shl 8

public val T_IOC: CInt = ('t'.toInt()) shl 8

public val TCGETA: CInt = TIOC or 1

public val TCSETA: CInt = TIOC or 2

public val TCSETAW: CInt = TIOC or 3

public val TCSETAF: CInt = TIOC or 4

public val TCSBRK: CInt = TIOC or 5

public val TCXONC: CInt = TIOC or 6

public val TCFLSH: CInt = TIOC or 7

public val TCDSET: CInt = TIOC or 32

public val TCGETS: CInt = TIOC or 13

public val TCSETS: CInt = TIOC or 14

public val TCSANOW: CInt = TIOC or 14

public val TCSETSW: CInt = TIOC or 15

public val TCSADRAIN: CInt = TIOC or 15

public val TCSETSF: CInt = TIOC or 16

public val TCSAFLUSH: CInt = TIOC or 16

public val TCIFLUSH: CInt = 0

public val TCOFLUSH: CInt = 1

public val TCIOFLUSH: CInt = 2

public val TCOOFF: CInt = 0

public val TCOON: CInt = 1

public val TCIOFF: CInt = 2

public val TCION: CInt = 3

public val TIOC1: CInt = TIOC

public val TIOCKBON: CInt = TIOC or 8

public val TIOCKBOF: CInt = TIOC or 9

public val TIOCGWINSZ: CInt = TIOC or 104

public val TIOCSWINSZ: CInt = TIOC or 103

public val TIOCGSOFTCAR: CInt = TIOC or 105

public val TIOCSSOFTCAR: CInt = TIOC or 106

public val TIOCGPPS: CInt = TIOC or 125

public val TIOCSPPS: CInt = TIOC or 126

public val TIOCGPPSEV: CInt = TIOC or 127

public val TIOCGETD: CInt = T_IOC or 0

public val TIOCSETD: CInt = T_IOC or 1

public val TIOCHPCL: CInt = T_IOC or 2

public val TIOCGETP: CInt = T_IOC or 8

public val TIOCSETP: CInt = T_IOC or 9

public val TIOCSETN: CInt = T_IOC or 10

public val TIOCEXCL: CInt = T_IOC or 13

public val TIOCNXCL: CInt = T_IOC or 14

public val TIOCFLUSH: CInt = T_IOC or 16

public val TIOCSETC: CInt = T_IOC or 17

public val TIOCGETC: CInt = T_IOC or 18

public val TIOCLBIS: CInt = T_IOC or 127

public val TIOCLBIC: CInt = T_IOC or 126

public val TIOCLSET: CInt = T_IOC or 125

public val TIOCLGET: CInt = T_IOC or 124

public val TIOCSBRK: CInt = T_IOC or 123

public val TIOCCBRK: CInt = T_IOC or 122

public val TIOCSDTR: CInt = T_IOC or 121

public val TIOCCDTR: CInt = T_IOC or 120

public val TIOCSLTC: CInt = T_IOC or 117

public val TIOCGLTC: CInt = T_IOC or 116

public val TIOCOUTQ: CInt = T_IOC or 115

public val TIOCNOTTY: CInt = T_IOC or 113

public val TIOCSCTTY: CInt = T_IOC or 132

public val TIOCSTOP: CInt = T_IOC or 111

public val TIOCSTART: CInt = T_IOC or 110

public val TIOCSILOOP: CInt = T_IOC or 109

public val TIOCCILOOP: CInt = T_IOC or 108

public val TIOCGPGRP: CInt = T_IOC or 20

public val TIOCSPGRP: CInt = T_IOC or 21

public val TIOCGSID: CInt = T_IOC or 22

public val TIOCSTI: CInt = T_IOC or 23

public val TIOCMSET: CInt = T_IOC or 26

public val TIOCMBIS: CInt = T_IOC or 27

public val TIOCMBIC: CInt = T_IOC or 28

public val TIOCMGET: CInt = T_IOC or 29

public val TIOCREMOTE: CInt = T_IOC or 30

public val TIOCSIGNAL: CInt = T_IOC or 31

public val TIOCM_LE: CInt = 1

public val TIOCM_DTR: CInt = 2

public val TIOCM_RTS: CInt = 4

public val TIOCM_ST: CInt = 8

public val TIOCM_SR: CInt = 16

public val TIOCM_CTS: CInt = 32

public val TIOCM_CAR: CInt = 64

public val TIOCM_CD: CInt = TIOCM_CAR

public val TIOCM_RNG: CInt = 128

public val TIOCM_RI: CInt = TIOCM_RNG

public val TIOCM_DSR: CInt = 256

// termios
public val B0: SpeedT = 0u

public val B50: SpeedT = 1u

public val B75: SpeedT = 2u

public val B110: SpeedT = 3u

public val B134: SpeedT = 4u

public val B150: SpeedT = 5u

public val B200: SpeedT = 6u

public val B300: SpeedT = 7u

public val B600: SpeedT = 8u

public val B1200: SpeedT = 9u

public val B1800: SpeedT = 10u

public val B2400: SpeedT = 11u

public val B4800: SpeedT = 12u

public val B9600: SpeedT = 13u

public val B19200: SpeedT = 14u

public val B38400: SpeedT = 15u

public val B57600: SpeedT = 16u

public val B76800: SpeedT = 17u

public val B115200: SpeedT = 18u

public val B153600: SpeedT = 19u

public val B230400: SpeedT = 20u

public val B307200: SpeedT = 21u

public val B460800: SpeedT = 22u

public val B921600: SpeedT = 23u

public val CSTART: io.github.kotlinmania.libc.TcflagT = 17u

public val CSTOP: io.github.kotlinmania.libc.TcflagT = 19u

public val CSWTCH: io.github.kotlinmania.libc.TcflagT = 26u

public val CBAUD: io.github.kotlinmania.libc.TcflagT = 15u

public val CIBAUD: io.github.kotlinmania.libc.TcflagT = 983040u

public val CBAUDEXT: io.github.kotlinmania.libc.TcflagT = 2097152u

public val CIBAUDEXT: io.github.kotlinmania.libc.TcflagT = 4194304u

public val CSIZE: io.github.kotlinmania.libc.TcflagT = 48u

public val CS5: io.github.kotlinmania.libc.TcflagT = 0u

public val CS6: io.github.kotlinmania.libc.TcflagT = 16u

public val CS7: io.github.kotlinmania.libc.TcflagT = 32u

public val CS8: io.github.kotlinmania.libc.TcflagT = 48u

public val CSTOPB: io.github.kotlinmania.libc.TcflagT = 64u

public val ECHO: io.github.kotlinmania.libc.TcflagT = 8u

public val ECHOE: io.github.kotlinmania.libc.TcflagT = 16u

public val ECHOK: io.github.kotlinmania.libc.TcflagT = 32u

public val ECHONL: io.github.kotlinmania.libc.TcflagT = 64u

public val ECHOCTL: io.github.kotlinmania.libc.TcflagT = 512u

public val ECHOPRT: io.github.kotlinmania.libc.TcflagT = 1024u

public val ECHOKE: io.github.kotlinmania.libc.TcflagT = 2048u

public val EXTPROC: io.github.kotlinmania.libc.TcflagT = 65536u

public val IGNBRK: io.github.kotlinmania.libc.TcflagT = 1u

public val BRKINT: io.github.kotlinmania.libc.TcflagT = 2u

public val IGNPAR: io.github.kotlinmania.libc.TcflagT = 4u

public val PARMRK: io.github.kotlinmania.libc.TcflagT = 8u

public val INPCK: io.github.kotlinmania.libc.TcflagT = 16u

public val ISTRIP: io.github.kotlinmania.libc.TcflagT = 32u

public val INLCR: io.github.kotlinmania.libc.TcflagT = 64u

public val IGNCR: io.github.kotlinmania.libc.TcflagT = 128u

public val ICRNL: io.github.kotlinmania.libc.TcflagT = 256u

public val IUCLC: io.github.kotlinmania.libc.TcflagT = 512u

public val IXON: io.github.kotlinmania.libc.TcflagT = 1024u

public val IXOFF: io.github.kotlinmania.libc.TcflagT = 4096u

public val IXANY: io.github.kotlinmania.libc.TcflagT = 2048u

public val IMAXBEL: io.github.kotlinmania.libc.TcflagT = 8192u

public val DOSMODE: io.github.kotlinmania.libc.TcflagT = 32768u

public val OPOST: io.github.kotlinmania.libc.TcflagT = 1u

public val OLCUC: io.github.kotlinmania.libc.TcflagT = 2u

public val ONLCR: io.github.kotlinmania.libc.TcflagT = 4u

public val OCRNL: io.github.kotlinmania.libc.TcflagT = 8u

public val ONOCR: io.github.kotlinmania.libc.TcflagT = 16u

public val ONLRET: io.github.kotlinmania.libc.TcflagT = 32u

public val OFILL: io.github.kotlinmania.libc.TcflagT = 64u

public val OFDEL: io.github.kotlinmania.libc.TcflagT = 128u

public val CREAD: io.github.kotlinmania.libc.TcflagT = 128u

public val PARENB: io.github.kotlinmania.libc.TcflagT = 256u

public val PARODD: io.github.kotlinmania.libc.TcflagT = 512u

public val HUPCL: io.github.kotlinmania.libc.TcflagT = 1024u

public val CLOCAL: io.github.kotlinmania.libc.TcflagT = 2048u

public val CRTSXOFF: io.github.kotlinmania.libc.TcflagT = 1073741824u

public val CRTSCTS: io.github.kotlinmania.libc.TcflagT = 2147483648u

public val ISIG: io.github.kotlinmania.libc.TcflagT = 1u

public val ICANON: io.github.kotlinmania.libc.TcflagT = 2u

public val IEXTEN: io.github.kotlinmania.libc.TcflagT = 32768u

public val TOSTOP: io.github.kotlinmania.libc.TcflagT = 256u

public val FLUSHO: io.github.kotlinmania.libc.TcflagT = 8192u

public val PENDIN: io.github.kotlinmania.libc.TcflagT = 16384u

public val NOFLSH: io.github.kotlinmania.libc.TcflagT = 128u

public val VINTR: Int = 0

public val VQUIT: Int = 1

public val VERASE: Int = 2

public val VKILL: Int = 3

public val VEOF: Int = 4

public val VEOL: Int = 5

public val VEOL2: Int = 6

public val VMIN: Int = 4

public val VTIME: Int = 5

public val VSWTCH: Int = 7

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VSUSP: Int = 10

public val VDSUSP: Int = 11

public val VREPRINT: Int = 12

public val VDISCARD: Int = 13

public val VWERASE: Int = 14

public val VLNEXT: Int = 15

// <sys/stropts.h>
public val STR: CInt = (83u.toInt()) shl 8

public val I_NREAD: CInt = STR or 1

public val I_PUSH: CInt = STR or 2

public val I_POP: CInt = STR or 3

public val I_LOOK: CInt = STR or 4

public val I_FLUSH: CInt = STR or 5

public val I_SRDOPT: CInt = STR or 6

public val I_GRDOPT: CInt = STR or 7

public val I_STR: CInt = STR or 8

public val I_SETSIG: CInt = STR or 9

public val I_GETSIG: CInt = STR or 10

public val I_FIND: CInt = STR or 11

public val I_LINK: CInt = STR or 12

public val I_UNLINK: CInt = STR or 13

public val I_PEEK: CInt = STR or 15

public val I_FDINSERT: CInt = STR or 16

public val I_SENDFD: CInt = STR or 17

public val I_RECVFD: CInt = STR or 14

public val I_SWROPT: CInt = STR or 19

public val I_GWROPT: CInt = STR or 20

public val I_LIST: CInt = STR or 21

public val I_PLINK: CInt = STR or 22

public val I_PUNLINK: CInt = STR or 23

public val I_ANCHOR: CInt = STR or 24

public val I_FLUSHBAND: CInt = STR or 28

public val I_CKBAND: CInt = STR or 29

public val I_GETBAND: CInt = STR or 30

public val I_ATMARK: CInt = STR or 31

public val I_SETCLTIME: CInt = STR or 32

public val I_GETCLTIME: CInt = STR or 33

public val I_CANPUT: CInt = STR or 34

public val I_SERROPT: CInt = STR or 35

public val I_GERROPT: CInt = STR or 36

public val I_ESETSIG: CInt = STR or 37

public val I_EGETSIG: CInt = STR or 38

public val I_PUSH_NOCTTY: CInt = STR or 39

// 3SOCKET flags
public val SOCK_CLOEXEC: CInt = 0x080000

public val SOCK_NONBLOCK: CInt = 0x100000

public val SOCK_NDELAY: CInt = 0x200000

// <sys/timex.h>
public val SCALE_KG: CInt = 1 shl 6

public val SCALE_KF: CInt = 1 shl 16

public val SCALE_KH: CInt = 1 shl 2

public val MAXTC: CInt = 1 shl 6

public val SCALE_PHASE: CInt = 1 shl 22

public val SCALE_USEC: CInt = 1 shl 16

public val SCALE_UPDATE: CInt = SCALE_KG * MAXTC

public val FINEUSEC: CInt = 1 shl 22

public val MAXPHASE: CInt = 512000

public val MAXFREQ: CInt = 512 * SCALE_USEC

public val MAXTIME: CInt = 200 shl PPS_AVG

public val MINSEC: CInt = 16

public val MAXSEC: CInt = 1200

public val PPS_AVG: CInt = 2

public val PPS_SHIFT: CInt = 2

public val PPS_SHIFTMAX: CInt = 8

public val PPS_VALID: CInt = 120

public val MAXGLITCH: CInt = 30

public val MOD_OFFSET: UInt = 0x0001u

public val MOD_FREQUENCY: UInt = 0x0002u

public val MOD_MAXERROR: UInt = 0x0004u

public val MOD_ESTERROR: UInt = 0x0008u

public val MOD_STATUS: UInt = 0x0010u

public val MOD_TIMECONST: UInt = 0x0020u

public val MOD_CLKB: UInt = 0x4000u

public val MOD_CLKA: UInt = 0x8000u

public val STA_PLL: UInt = 0x0001u

public val STA_PPSFREQ: Int = 0x0002

public val STA_PPSTIME: Int = 0x0004

public val STA_FLL: Int = 0x0008

public val STA_INS: Int = 0x0010

public val STA_DEL: Int = 0x0020

public val STA_UNSYNC: Int = 0x0040

public val STA_FREQHOLD: Int = 0x0080

public val STA_PPSSIGNAL: Int = 0x0100

public val STA_PPSJITTER: Int = 0x0200

public val STA_PPSWANDER: Int = 0x0400

public val STA_PPSERROR: Int = 0x0800

public val STA_CLOCKERR: Int = 0x1000

public val STA_RONLY: Int = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR

public val TIME_OK: Int = 0

public val TIME_INS: Int = 1

public val TIME_DEL: Int = 2

public val TIME_OOP: Int = 3

public val TIME_WAIT: Int = 4

public val TIME_ERROR: Int = 5

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val SCHED_SYS: CInt = 3

public val SCHED_IA: CInt = 4

public val SCHED_FSS: CInt = 5

public val SCHED_FX: CInt = 6

// sys/priv.h
public val PRIV_DEBUG: CUint = 0x0001u

public val PRIV_AWARE: CUint = 0x0002u

public val PRIV_AWARE_INHERIT: CUint = 0x0004u

public val PROC_PROTECT: CUint = 0x0008u

public val NET_MAC_AWARE: CUint = 0x0010u

public val NET_MAC_AWARE_INHERIT: CUint = 0x0020u

public val PRIV_AWARE_RESET: CUint = 0x0040u

public val PRIV_XPOLICY: CUint = 0x0080u

public val PRIV_PFEXEC: CUint = 0x0100u

// sys/systeminfo.h
public val SI_SYSNAME: CInt = 1

public val SI_HOSTNAME: CInt = 2

public val SI_RELEASE: CInt = 3

public val SI_VERSION: CInt = 4

public val SI_MACHINE: CInt = 5

public val SI_ARCHITECTURE: CInt = 6

public val SI_HW_SERIAL: CInt = 7

public val SI_HW_PROVIDER: CInt = 8

public val SI_SET_HOSTNAME: CInt = 258

public val SI_SET_SRPC_DOMAIN: CInt = 265

public val SI_PLATFORM: CInt = 513

public val SI_ISALIST: CInt = 514

public val SI_DHCP_CACHE: CInt = 515

public val SI_ARCHITECTURE_32: CInt = 516

public val SI_ARCHITECTURE_64: CInt = 517

public val SI_ARCHITECTURE_K: CInt = 518

public val SI_ARCHITECTURE_NATIVE: CInt = 519

// sys/lgrpUser.h
public val LGRP_COOKIE_NONE: io.github.kotlinmania.libc.LgrpCookieT = 0uL

public val LGRP_AFF_NONE: LgrpAffinityT = 0x0

public val LGRP_AFF_WEAK: LgrpAffinityT = 0x10

public val LGRP_AFF_STRONG: LgrpAffinityT = 0x100

public val LGRP_CONTENT_ALL: io.github.kotlinmania.libc.LgrpContentT = 0u

public val LGRP_CONTENT_HIERARCHY: io.github.kotlinmania.libc.LgrpContentT = LGRP_CONTENT_ALL

public val LGRP_CONTENT_DIRECT: io.github.kotlinmania.libc.LgrpContentT = 1u

public val LGRP_LAT_CPU_TO_MEM: io.github.kotlinmania.libc.LgrpLatBetweenT = 0u

public val LGRP_MEM_SZ_FREE: io.github.kotlinmania.libc.LgrpMemSizeFlagT = 0u

public val LGRP_MEM_SZ_INSTALLED: io.github.kotlinmania.libc.LgrpMemSizeFlagT = 1u

public val LGRP_VIEW_CALLER: io.github.kotlinmania.libc.LgrpViewT = 0u

public val LGRP_VIEW_OS: io.github.kotlinmania.libc.LgrpViewT = 1u

// sys/processor.h
public val P_OFFLINE: CInt = 0x001

public val P_ONLINE: CInt = 0x002

public val P_STATUS: CInt = 0x003

public val P_FAULTED: CInt = 0x004

public val P_POWEROFF: CInt = 0x005

public val P_NOINTR: CInt = 0x006

public val P_SPARE: CInt = 0x007

public val P_FORCED: CInt = 0x10000000

public val PI_TYPELEN: CInt = 16

public val PI_FPUTYPE: CInt = 32

// sys/auxv.h
public val AT_SUN_HWCAP: CUint = 2009u

// As per sys/socket.h, header alignment must be 8 bytes on SPARC
// and 4 bytes everywhere else:
public val CMSG_HDR_ALIGNMENT: Int = 8

public val CMSG_HDR_ALIGNMENT1: Int = 4

public val CMSG_DATA_ALIGNMENT: Int = sizeOf<CInt>()

public val NEWDEV: CInt = 1

// sys/sendfile.h
public val SFV_FD_SELF: CInt = -2

public fun cmsgHdrAlign(p: Int): Int {
    return (p + CMSG_HDR_ALIGNMENT - 1) and (CMSG_HDR_ALIGNMENT - 1).inv()
}

public fun cmsgDataAlign(p: Int): Int {
    return (p + CMSG_DATA_ALIGNMENT - 1) and (CMSG_DATA_ALIGNMENT - 1).inv()
}

public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    return CMSG_DATA_ALIGN(((cmsg)?.let { COpaquePointer(it.hashCode().toLong() + (1).toLong()) }).toInt()).toUByte()
}

public fun cmsgLen(length: CUint): CUint {
    return CMSG_DATA_ALIGN(sizeOf<Cmsghdr>()).toUInt() + length
}

public fun cmsgFirsthdr(mhdr: io.github.kotlinmania.libc.Msghdr?): Cmsghdr? {
    return if (((mhdr!!.msgControllen).toInt()) < sizeOf<Cmsghdr>()) {
        nullMut<Cmsghdr>()
    } else {
        (mhdr!!.msgControl as Cmsghdr?)
    }
}

public fun cmsgNxthdr(mhdr: io.github.kotlinmania.libc.Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if ((cmsg == null)) {
        return CMSG_FIRSTHDR(mhdr)
    }
    val next = CMSG_HDR_ALIGN(((cmsg)?.hashCode()?.toLong() ?: 0L).toInt() + (cmsg!!.cmsgLen).toInt() + sizeOf<Cmsghdr>())
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + (mhdr!!.msgControllen).toInt()
    return if (next > max) {
        nullMut<Cmsghdr>()
    } else {
        null
    }
}

public fun cmsgSpace(length: CUint): CUint {
    return CMSG_HDR_ALIGN(sizeOf<Cmsghdr>().toInt() + length.toInt()).toUInt()
}

public fun fdClr(fd: CInt, set: FdSet?) {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    set!!.fdsBits[fd1 / bits] = set!!.fdsBits[fd1 / bits] and (1L shl (fd1 % bits)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    return (set!!.fdsBits[fd1 / bits] and (1L shl (fd1 % bits))) != 0L
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val bits = 8 * 8
    val fd1 = fd.toInt()
    set!!.fdsBits[fd1 / bits] = set!!.fdsBits[fd1 / bits] or (1L shl (fd1 % bits))
    return
}

public fun fdZero(set: FdSet?) {
    for (slot in set!!.fdsBits.iterMut()) {
        slot = 0
    }
}

public fun sigrtmax(): CInt {
    return sysconf(SC_SIGRT_MAX).toInt()
}

public fun sigrtmin(): CInt {
    return sysconf(SC_SIGRT_MIN).toInt()
}

public fun wifexited(status: CInt): Boolean {
    return (status and 0xFF) == 0
}

public fun wexitstatus(status: CInt): CInt {
    return (status shr 8) and 0xFF
}

public fun wtermsig(status: CInt): CInt {
    return status and 0x7F
}

public fun wifcontinued(status: CInt): Boolean {
    return (status and 0xffff) == 0xffff
}

public fun wstopsig(status: CInt): CInt {
    return (status and 0xff00) shr 8
}

public fun wifsignaled(status: CInt): Boolean {
    return ((status and 0xff) > 0) && (status and 0xff00 == 0)
}

public fun wifstopped(status: CInt): Boolean {
    return ((status and 0xff) == 0x7f) && ((status and 0xff00) != 0)
}

public fun wcoredump(status: CInt): Boolean {
    return (status and 0x80) != 0
}

public fun mrGetType(flags: CUint): CUint {
    return flags and 0x0000ffffu
}

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt

public expect fun abs(i: CInt): CInt

public expect fun acct(filename: String?): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun getrandom(bbuf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun settimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?)

public expect fun stackGetbounds(sp: io.github.kotlinmania.libc.StackT?): CInt

public expect fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt

public expect fun initgroups(name: String?, basegid: GidT): CInt

public expect fun setgroups(ngroups: CInt, ptr: GidT?): CInt

public expect fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun errno(): CInt?

public expect fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): Passwd?

public expect fun fdatasync(fd: CInt): CInt

public expect fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer?

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun getprogname(): COpaquePointer?

public expect fun setprogname(name: String?)

public expect fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt

public expect fun getpriority(which: CInt, who: CInt): CInt

public expect fun setpriority(which: CInt, who: CInt, prio: CInt): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun sethostname(name: String?, len: CInt): CInt

public expect fun ifNameindex(): IfNameindex?

public expect fun ifFreenameindex(ptr: IfNameindex?)

public expect fun pthreadCreate(native: CUint?, attr: io.github.kotlinmania.libc.PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt

public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: CInt?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt

public expect fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt

public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt

public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadGetnameNp(tid: io.github.kotlinmania.libc.PthreadT, name: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadSetnameNp(tid: io.github.kotlinmania.libc.PthreadT, name: String?): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt

public expect fun globfree(pglob: io.github.kotlinmania.libc.GlobT?)

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt

public expect fun posixSpawnFileActionsAddclosefromNp(fileActions: COpaquePointer?, lowfiledes: CInt): CInt

public expect fun posixSpawnFileActionsAddchdir(fileActions: COpaquePointer?, path: String?): CInt

public expect fun posixSpawnFileActionsAddchdirNp(fileActions: COpaquePointer?, path: String?): CInt

public expect fun posixSpawnFileActionsAddfchdir(fileActions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: PidT?): CInt

public expect fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, policy: CInt?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: SigsetT?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: SigsetT?): CInt

public expect fun posixSpawnattrSetsigignoreNp(attr: COpaquePointer?, sigignore: SigsetT?): CInt

public expect fun posixSpawnattrGetsigignoreNp(attr: COpaquePointer?, sigignore: SigsetT?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: SigsetT?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: SigsetT?): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): SsizeT

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt

public expect fun futimens(dirfd: CInt, times: Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt

public expect fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer?

public expect fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt

public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

public expect fun accept4(fd: CInt, address: Sockaddr?, addressLen: CUint?, flags: CInt): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): io.github.kotlinmania.libc.MqdT

public expect fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT

public expect fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT

public expect fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt

public expect fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt

public expect fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt

public expect fun portCreate(): CInt

public expect fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: COpaquePointer?): CInt

public expect fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt

public expect fun portGet(port: CInt, pe: PortEvent?, timeout: Timespec?): CInt

public expect fun portGetn(port: CInt, peList: PortEvent?, max: CUint, nget: CUint?, timeout: Timespec?): CInt

public expect fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt

public expect fun portSendn(portList: CInt?, errorList: CInt?, nent: CUint, events: CInt, user: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun sigsuspend(mask: io.github.kotlinmania.libc.SigsetT?): CInt

public expect fun semClose(sem: SemT?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun thrSelf(): io.github.kotlinmania.libc.ThreadT

public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): SemT?

public expect fun getgrnam(name: String?): Group?

public expect fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetparam(pid: PidT, param: SchedParam?): CInt

public expect fun schedSetparam(pid: PidT, param: SchedParam?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun nativeGetpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: CInt): Passwd?

public expect fun nativeGetgrentR(grp: Group?, buf: COpaquePointer?, buflen: CInt): Group?

public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): Group?

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): Group?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt

public expect fun pipe2(fds: CInt?, flags: CInt): CInt

public expect fun makeutx(ux: Utmpx?): Utmpx?

public expect fun modutx(ux: Utmpx?): Utmpx?

public expect fun updwtmpx(file: String?, ut: Utmpx?)

public expect fun utmpxname(file: String?): CInt

public expect fun getutxent(): Utmpx?

public expect fun getutxid(ut: Utmpx?): Utmpx?

public expect fun getutxline(ut: Utmpx?): Utmpx?

public expect fun pututxline(ut: Utmpx?): Utmpx?

public expect fun setutxent()

public expect fun endutxent()

public expect fun endutent()

public expect fun getutent(): Utmp?

public expect fun getutid(u: Utmp?): Utmp?

public expect fun getutline(u: Utmp?): Utmp?

public expect fun pututline(u: Utmp?): Utmp?

public expect fun setutent()

public expect fun utmpname(file: String?): CInt

public expect fun getutmp(ux: Utmpx?, u: Utmp?)

public expect fun getutmpx(u: Utmp?, ux: Utmpx?)

public expect fun updwtmp(file: String?, u: Utmp?)

public expect fun ntpAdjtime(buf: Timex?): CInt

public expect fun ntpGettime(buf: Ntptimeval?): CInt

public expect fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: CInt?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt

public expect fun ucredGet(pid: PidT): UcredT?

public expect fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt

public expect fun ucredFree(ucred: UcredT?)

public expect fun ucredGeteuid(ucred: UcredT?): UidT

public expect fun ucredGetruid(ucred: UcredT?): UidT

public expect fun ucredGetsuid(ucred: UcredT?): UidT

public expect fun ucredGetegid(ucred: UcredT?): GidT

public expect fun ucredGetrgid(ucred: UcredT?): GidT

public expect fun ucredGetsgid(ucred: UcredT?): GidT

public expect fun ucredGetgroups(ucred: UcredT?, groups: COpaquePointer?): CInt

public expect fun ucredGetpid(ucred: UcredT?): PidT

public expect fun ucredGetprojid(ucred: UcredT?): ProjidT

public expect fun ucredGetzoneid(ucred: UcredT?): ZoneidT

public expect fun ucredGetpflags(ucred: UcredT?, flags: CUint): CUint

public expect fun ucredSize(): SizeT

public expect fun psetCreate(newpset: CInt?): CInt

public expect fun psetDestroy(pset: io.github.kotlinmania.libc.PsetidT): CInt

public expect fun psetAssign(pset: io.github.kotlinmania.libc.PsetidT, cpu: io.github.kotlinmania.libc.ProcessoridT, opset: CInt?): CInt

public expect fun psetInfo(pset: io.github.kotlinmania.libc.PsetidT, tpe: CInt?, numcpus: CUint?, cpulist: CInt?): CInt

public expect fun psetBind(pset: io.github.kotlinmania.libc.PsetidT, idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, opset: CInt?): CInt

public expect fun psetList(pset: CInt?, numpsets: CUint?): CInt

public expect fun psetSetattr(pset: PsetidT, attr: CUint): CInt

public expect fun psetGetattr(pset: PsetidT, attr: CUint?): CInt

public expect fun processorBind(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, newBinding: io.github.kotlinmania.libc.ProcessoridT, oldBinding: CInt?): CInt

public expect fun pOnline(processorid: io.github.kotlinmania.libc.ProcessoridT, flag: CInt): CInt

public expect fun processorInfo(processorid: io.github.kotlinmania.libc.ProcessoridT, infop: ProcessorInfoT?): CInt

public expect fun getexecname(): COpaquePointer?

public expect fun gethostid(): CLong

public expect fun getpflags(flags: CUint): CUint

public expect fun setpflags(flags: CUint, value: CUint): CInt

public expect fun sysinfo(command: CInt, buf: COpaquePointer?, count: CLong): CInt

public expect fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt

// #include <link.h>
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt

public expect fun getpagesize(): CInt

public expect fun getpagesizes(pagesize: SizeT?, nelem: CInt): CInt

public expect fun mmapobj(fd: CInt, flags: CUint, storage: MmapobjResultT?, elements: CUint?, arg: COpaquePointer?): CInt

public expect fun meminfo(inaddr: ULong?, addrCount: CInt, infoReq: CUint?, infoCount: CInt, outdata: ULong?, validity: CUint?): CInt

public expect fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer?

public expect fun getisax(array: UInt?, n: CUint): CUint

public expect fun backtrace(buffer: COpaquePointer?, size: CInt): CInt

public expect fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer?

public expect fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt)

public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt

public expect fun sync()

public expect fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt

public expect fun aioError(aiocbp: Aiocb?): CInt

public expect fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt

public expect fun aioRead(aiocbp: Aiocb?): CInt

public expect fun aioReturn(aiocbp: Aiocb?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt

public expect fun aioWaitn(aiocbList: COpaquePointer?, nent: CUint, nwait: CUint?, timeout: Timespec?): CInt

public expect fun aioWrite(aiocbp: Aiocb?): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt

public expect fun major(version: CInt, devnum: io.github.kotlinmania.libc.DevT): io.github.kotlinmania.libc.MajorT

public expect fun minor(version: CInt, devnum: io.github.kotlinmania.libc.DevT): io.github.kotlinmania.libc.MinorT

public expect fun makedev(version: CInt, majdev: io.github.kotlinmania.libc.MajorT, mindev: io.github.kotlinmania.libc.MinorT): io.github.kotlinmania.libc.DevT

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT)

public expect fun arc4randomUniform(upperBound: UInt): UInt

public expect fun secureGetenv(name: String?): COpaquePointer?

public expect fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: io.github.kotlinmania.libc.Tm?): SizeT

public expect fun strftimeL(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: io.github.kotlinmania.libc.Tm?, loc: LocaleT): SizeT

public expect fun sendfile(outFd: CInt, inFd: CInt, off: CLong?, len: SizeT): SsizeT

public expect fun sendfilev(fildes: CInt, vec: SendfilevecT?, sfvcnt: CInt, xferred: SizeT?): SsizeT

public expect fun lgrpInit(view: LgrpViewT): LgrpCookieT

public expect fun lgrpFini(cookie: LgrpCookieT): CInt

public expect fun lgrpAffinityGet(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, lgrp: io.github.kotlinmania.libc.LgrpIdT): LgrpAffinityT

public expect fun lgrpAffinitySet(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, lgrp: io.github.kotlinmania.libc.LgrpIdT, aff: LgrpAffinityT): CInt

public expect fun lgrpCpus(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, cpuids: CInt?, count: CUint, content: io.github.kotlinmania.libc.LgrpContentT): CInt

public expect fun lgrpMemSize(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, tpe: io.github.kotlinmania.libc.LgrpMemSizeFlagT, content: io.github.kotlinmania.libc.LgrpContentT): io.github.kotlinmania.libc.LgrpMemSizeT

public expect fun lgrpNlgrps(cookie: io.github.kotlinmania.libc.LgrpCookieT): CInt

public expect fun lgrpView(cookie: io.github.kotlinmania.libc.LgrpCookieT): io.github.kotlinmania.libc.LgrpViewT

public expect fun lgrpHome(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT): io.github.kotlinmania.libc.LgrpIdT

public expect fun lgrpVersion(version: CInt): CInt

public expect fun lgrpResources(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, lgrps: CInt?, count: CUint, tpe: LgrpRsrcT): CInt

public expect fun lgrpRoot(cookie: io.github.kotlinmania.libc.LgrpCookieT): io.github.kotlinmania.libc.LgrpIdT

public fun major(device: io.github.kotlinmania.libc.DevT): io.github.kotlinmania.libc.MajorT {
    return major(NEWDEV, device)
}

public fun minor(device: io.github.kotlinmania.libc.DevT): io.github.kotlinmania.libc.MinorT {
    return minor(NEWDEV, device)
}

public fun makedev(maj: io.github.kotlinmania.libc.MajorT, min: io.github.kotlinmania.libc.MinorT): io.github.kotlinmania.libc.DevT {
    return makedev(NEWDEV, maj, min)
}
