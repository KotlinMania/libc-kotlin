package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort

public fun interface SaUTSaHandlerCallback {
    public operator fun invoke(arg0: CInt): Nothing
}

public fun interface SaUTSaSigactionCallback {
    public operator fun invoke(arg0: CInt, arg1: COpaquePointer?, arg2: COpaquePointer?): Nothing
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

// Dummy functions, these don't really exist in VxWorks.
// wait.h macros
// bPthreadCondattrT.h
public open class PthreadCondattrT(
    public var condAttrStatus: CInt,
    public var condAttrPshared: CInt,
    public var condAttrClockId: ClockidT,
)

// bPthreadCondT.h
public open class PthreadCondT(
    public var condSemId: VxSemId,
    public var condValid: CInt,
    public var condInitted: CInt,
    public var condRefCount: CInt,
    public var condMutex: PthreadMutexT?,
    public var condAttr: PthreadCondattrT,
    public var condSemName: List<CChar>,
)

// bPthreadRwlockattrT.h
public open class PthreadRwlockattrT(
    public var rwlockAttrStatus: CInt,
    public var rwlockAttrPshared: CInt,
    public var rwlockAttrMaxReaders: CUint,
    public var rwlockAttrConformOpt: CUint,
)

// bPthreadRwlockT.h
public open class PthreadRwlockT(
    public var rwlockSemId: VxSemId,
    public var rwlockReadersRefCount: CUint,
    public var rwlockValid: CInt,
    public var rwlockInitted: CInt,
    public var rwlockAttr: PthreadRwlockattrT,
    public var rwlockSemName: List<CChar>,
)

// bStructTimeval.h
public open class Timeval(public var tvSec: TimeT, public var tvUsec: SusecondsT)

// socket.h
public open class Linger(public var lOnoff: CInt, public var lLinger: CInt)

public open class Sockaddr(
    public var saLen: CUchar,
    public var saFamily: SaFamilyT,
    public var saData: List<CChar>,
)

public open class Iovec(public var iovBase: COpaquePointer?, public var iovLen: SizeT)

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

// poll.h
public open class Pollfd(
    public var fd: CInt,
    public var events: CShort,
    public var revents: CShort,
)

// resource.h
public open class Rlimit(public var rlimCur: RlimT, public var rlimMax: RlimT)

// stat.h
public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stAtim: Timespec,
    public var stAtime: TimeT,
    public var stMtim: Timespec,
    public var stMtime: TimeT,
    public var stCtim: Timespec,
    public var stCtime: TimeT,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAttrib: CUchar,
    public var stReserved1: CInt,
    public var stReserved2: CInt,
    public var stReserved3: CInt,
    public var stReserved4: CInt,
)

// bStructTimespec.h
public open class Timespec(public var tvSec: TimeT, public var tvNsec: CLong)

// bStructSchedParam.h
public open class SchedParam(
    public var schedPriority: CInt,
    // scheduling priority
    public var schedSsLowPriority: CInt,
    // low scheduling priority
    public var schedSsReplPeriod: Timespec,
    // replenishment period
    public var schedSsInitBudget: Timespec,
    // initial budget
    public var schedSsMaxRepl: CInt,
)

// bPthreadAttrT.h
public open class PthreadAttrT(
    public var threadAttrStatus: CInt,
    public var threadAttrStacksize: SizeT,
    public var threadAttrStackaddr: COpaquePointer?,
    public var threadAttrGuardsize: SizeT,
    public var threadAttrDetachstate: CInt,
    public var threadAttrContentionscope: CInt,
    public var threadAttrInheritsched: CInt,
    public var threadAttrSchedpolicy: CInt,
    public var threadAttrName: COpaquePointer?,
    public var threadAttrOptions: CInt,
    public var threadAttrSchedparam: SchedParam,
)

// signal.h
public open class Sigaction(
    public var saU: SaUT,
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
)

// bStackT.h
public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

// signal.h
public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siValue: Sigval,
    public var siErrno: CInt,
    public var siStatus: CInt,
    public var siAddr: COpaquePointer?,
    public var siUid: UidT,
    public var siPid: PidT,
) {
    public open fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public open fun siValue(): Sigval {
        return this.siValue
    }

    public open fun siPid(): PidT {
        return this.siPid
    }

    public open fun siUid(): UidT {
        return this.siUid
    }

    public open fun siStatus(): CInt {
        return this.siStatus
    }
}

// pthread.h (krnl)
// bPthreadMutexattrT.h (usr)
public open class PthreadMutexattrT(
    public var mutexAttrStatus: CInt,
    public var mutexAttrPshared: CInt,
    public var mutexAttrProtocol: CInt,
    public var mutexAttrPrioceiling: CInt,
    public var mutexAttrType: CInt,
)

// pthread.h (krnl)
// bPthreadMutexT.h (usr)
public open class PthreadMutexT(
    public var mutexSemId: VxSemId,
    // _Vx_SEM_ID ..
    public var mutexValid: CInt,
    public var mutexInitted: CInt,
    public var mutexCondRefCount: CInt,
    public var mutexSavPriority: CInt,
    public var mutexAttr: PthreadMutexattrT,
    public var mutexSemName: List<CChar>,
)

// time.h
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

// sys/times.h
public open class Tms(
    public var tmsUtime: ClockT,
    public var tmsStime: ClockT,
    public var tmsCutime: ClockT,
    public var tmsCstime: ClockT,
)

// utime.h
public open class Utimbuf(public var actime: TimeT, public var modtime: TimeT)

// in.h
public open class InAddr(public var sAddr: InAddrT)

// in.h
public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class In6Addr(public var s6Addr: List<UByte>)

// in6.h
public open class Ipv6Mreq(public var ipv6mrMultiaddr: In6Addr, public var ipv6mrInterface: CUint)

// netdb.h
public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SizeT,
    public var aiCanonname: COpaquePointer?,
    public var aiAddr: Sockaddr?,
    public var aiNext: Addrinfo?,
)

// netdb.h
public open class Servent(
    public var sName: COpaquePointer?,
    public var sAliases: COpaquePointer?,
    public var sPort: CInt,
    public var sProto: COpaquePointer?,
)

// netdb.h
public open class Protoent(
    public var pName: COpaquePointer?,
    public var pAliases: COpaquePointer?,
    public var pProto: CInt,
)

// netdb.h
public open class Hostent(
    public var hName: COpaquePointer?,
    public var hAliases: COpaquePointer?,
    public var hAddrtype: CInt,
    public var hLength: CInt,
    public var hAddrList: COpaquePointer?,
)

// in.h
public open class SockaddrIn(
    public var sinLen: UByte,
    public var sinFamily: UByte,
    public var sinPort: UShort,
    public var sinAddr: InAddr,
    public var sinZero: List<CChar>,
)

// in6.h
public open class SockaddrIn6(
    public var sin6Len: UByte,
    public var sin6Family: UByte,
    public var sin6Port: UShort,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class MqAttr(
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqFlags: CLong,
    public var mqCurmsgs: CLong,
)

public open class Winsize(
    public var wsRow: CUshort,
    public var wsCol: CUshort,
    public var wsXpixel: CUshort,
    public var wsYpixel: CUshort,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cCc: List<CcT>,
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
)

public open class Rusage(
    public var ruUtime: Timeval,
    public var ruStime: Timeval,
    public var ruMaxrss: CLong,
    public var ruIxrss: CLong,
    public var ruIdrss: CLong,
    public var ruIsrss: CLong,
    public var ruMinflt: CLong,
    public var ruMajflt: CLong,
    public var ruNswap: CLong,
    public var ruInblock: CLong,
    public var ruOublock: CLong,
    public var ruMsgsnd: CLong,
    public var ruMsgrcv: CLong,
    public var ruNsignals: CLong,
    public var ruNvcsw: CLong,
    public var ruNivcsw: CLong,
)

public open class Lconv(
    public var currencySymbol: COpaquePointer?,
    public var intCurrSymbol: COpaquePointer?,
    public var monDecimalPoint: COpaquePointer?,
    public var monGrouping: COpaquePointer?,
    public var monThousandsSep: COpaquePointer?,
    public var negativeSign: COpaquePointer?,
    public var positiveSign: COpaquePointer?,
    public var fracDigits: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var nSignPosn: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var intFracDigits: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intNSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var decimalPoint: COpaquePointer?,
    public var grouping: COpaquePointer?,
    public var thousandsSep: COpaquePointer?,
    public var fracGrouping: COpaquePointer?,
    public var fracSep: COpaquePointer?,
    public var falseVal: COpaquePointer?,
    public var trueVal: COpaquePointer?,
    public var no: COpaquePointer?,
    public var yes: COpaquePointer?,
)

// grp.h
public open class Group(
    public var grName: COpaquePointer?,
    public var grPasswd: COpaquePointer?,
    public var grGid: CInt,
    public var grMem: COpaquePointer?,
)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
    public var endian: List<CChar>,
    public var kernelversion: List<CChar>,
    public var releaseversion: List<CChar>,
    public var processor: List<CChar>,
    public var bsprevision: List<CChar>,
    public var builddate: List<CChar>,
)

// dirent.h
public open class Dirent(
    public var dIno: InoT,
    public var dName: List<CChar>,
    public var dType: CUchar,
)

public open class SockaddrUn(
    public var sunLen: UByte,
    public var sunFamily: SaFamilyT,
    public var sunPath: List<CChar>,
)

// rtpLibCommon.h
public open class RtpDesc(
    public var status: CInt,
    public var options: UInt,
    public var entrAddr: COpaquePointer?,
    public var initTaskId: TaskId,
    public var parentId: RtpId,
    public var pathName: List<CChar>,
    public var taskCnt: CInt,
    public var textStart: COpaquePointer?,
    public var textEnd: COpaquePointer?,
)

// socket.h
public open class SockaddrStorage(
    public var ssLen: CUchar,
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<CChar>,
    public var ssAlign: Int,
    public var ssPad2: List<CChar>,
)

public open class SaUT(public var saHandler: SaUTSaHandlerCallback?? = null, public var saSigaction: SaUTSaSigactionCallback?? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "sa_u_t").finishNonExhaustive()
    }

    public open fun eq(other: SaUT): Boolean {
        return run {
            val h1 = when (val matchVal = this.saHandler) {
                null -> 0.toInt()
                else -> {
                    val handler = matchVal
                    handler.toInt()
                }
            }
            val h2 = when (val matchVal1 = other.saHandler) {
                null -> 0.toInt()
                else -> {
                    val handler1 = matchVal1
                    handler1.toInt()
                }
            }
            h1 == h2
        }
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            val h = when (val matchVal = this.saHandler) {
                null -> 0.toInt()
                else -> {
                    val handler = matchVal
                    handler.toInt()
                }
            }
            state = 31 * state + (h).hashCode()
        }
        return state
    }
}

public open class Sigval(public var sivalInt: CInt? = null, public var sivalPtr: COpaquePointer?? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "sigval").finishNonExhaustive()
    }

    public open fun eq(other: Sigval): Boolean {
        return this.sivalPtr.toInt() == other.sivalPtr.toInt()
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + ((this.sivalPtr.toInt())).hashCode()
        return state
    }
}
