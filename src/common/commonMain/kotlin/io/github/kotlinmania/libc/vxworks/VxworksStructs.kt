@file:OptIn(ExperimentalUnsignedTypes::class)
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
public data class PthreadCondattrT(
    public var condAttrStatus: CInt = 0,
    public var condAttrPshared: CInt = 0,
    public var condAttrClockId: ClockidT = 0,
)

// bPthreadCondT.h
public data class PthreadCondT(
    public var condSemId: VxSemId = null,
    public var condValid: CInt = 0,
    public var condInitted: CInt = 0,
    public var condRefCount: CInt = 0,
    public var condMutex: PthreadMutexT? = null,
    public var condAttr: PthreadCondattrT = PthreadCondattrT(),
    public var condSemName: UByteArray = UByteArray((PTHREAD_SHARED_SEM_NAME_MAX).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (this.condSemId != other.condSemId) return false
        if (this.condValid != other.condValid) return false
        if (this.condInitted != other.condInitted) return false
        if (this.condRefCount != other.condRefCount) return false
        if (this.condMutex != other.condMutex) return false
        if (this.condAttr != other.condAttr) return false
        if (!this.condSemName.contentEquals(other.condSemName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.condSemId.hashCode()
        result = 31 * result + this.condValid.hashCode()
        result = 31 * result + this.condInitted.hashCode()
        result = 31 * result + this.condRefCount.hashCode()
        result = 31 * result + this.condMutex.hashCode()
        result = 31 * result + this.condAttr.hashCode()
        result = 31 * result + this.condSemName.contentHashCode()
        return result
    }
}

// bPthreadRwlockattrT.h
public data class PthreadRwlockattrT(
    public var rwlockAttrStatus: CInt = 0,
    public var rwlockAttrPshared: CInt = 0,
    public var rwlockAttrMaxReaders: CUint = 0u,
    public var rwlockAttrConformOpt: CUint = 0u,
)

// bPthreadRwlockT.h
public data class PthreadRwlockT(
    public var rwlockSemId: VxSemId = null,
    public var rwlockReadersRefCount: CUint = 0u,
    public var rwlockValid: CInt = 0,
    public var rwlockInitted: CInt = 0,
    public var rwlockAttr: PthreadRwlockattrT = PthreadRwlockattrT(),
    public var rwlockSemName: UByteArray = UByteArray((PTHREAD_SHARED_SEM_NAME_MAX).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (this.rwlockSemId != other.rwlockSemId) return false
        if (this.rwlockReadersRefCount != other.rwlockReadersRefCount) return false
        if (this.rwlockValid != other.rwlockValid) return false
        if (this.rwlockInitted != other.rwlockInitted) return false
        if (this.rwlockAttr != other.rwlockAttr) return false
        if (!this.rwlockSemName.contentEquals(other.rwlockSemName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rwlockSemId.hashCode()
        result = 31 * result + this.rwlockReadersRefCount.hashCode()
        result = 31 * result + this.rwlockValid.hashCode()
        result = 31 * result + this.rwlockInitted.hashCode()
        result = 31 * result + this.rwlockAttr.hashCode()
        result = 31 * result + this.rwlockSemName.contentHashCode()
        return result
    }
}

// bStructTimeval.h
public data class Timeval(public var tvSec: TimeT = 0L, public var tvUsec: SusecondsT = 0L)

// socket.h
public data class Linger(public var lOnoff: CInt = 0, public var lLinger: CInt = 0)

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

public data class Iovec(public var iovBase: COpaquePointer? = null, public var iovLen: SizeT = 0uL)

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

// poll.h
public data class Pollfd(
    public var fd: CInt = 0,
    public var events: CShort = 0,
    public var revents: CShort = 0,
)

// resource.h
public data class Rlimit(public var rlimCur: RlimT = 0uL, public var rlimMax: RlimT = 0uL)

// stat.h
public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0,
    public var stNlink: NlinkT = 0uL,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stSize: OffT = 0L,
    public var stAtim: Timespec = Timespec(),
    public var stAtime: TimeT = 0L,
    public var stMtim: Timespec = Timespec(),
    public var stMtime: TimeT = 0L,
    public var stCtim: Timespec = Timespec(),
    public var stCtime: TimeT = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stAttrib: CUchar = 0u,
    public var stReserved1: CInt = 0,
    public var stReserved2: CInt = 0,
    public var stReserved3: CInt = 0,
    public var stReserved4: CInt = 0,
)

// bStructTimespec.h
public data class Timespec(public var tvSec: TimeT = 0L, public var tvNsec: CLong = 0L)

// bStructSchedParam.h
public data class SchedParam(
    public var schedPriority: CInt = 0,
    // scheduling priority
    public var schedSsLowPriority: CInt = 0,
    // low scheduling priority
    public var schedSsReplPeriod: Timespec = Timespec(),
    // replenishment period
    public var schedSsInitBudget: Timespec = Timespec(),
    // initial budget
    public var schedSsMaxRepl: CInt = 0,
)

// bPthreadAttrT.h
public data class PthreadAttrT(
    public var threadAttrStatus: CInt = 0,
    public var threadAttrStacksize: SizeT = 0uL,
    public var threadAttrStackaddr: COpaquePointer? = null,
    public var threadAttrGuardsize: SizeT = 0uL,
    public var threadAttrDetachstate: CInt = 0,
    public var threadAttrContentionscope: CInt = 0,
    public var threadAttrInheritsched: CInt = 0,
    public var threadAttrSchedpolicy: CInt = 0,
    public var threadAttrName: COpaquePointer? = null,
    public var threadAttrOptions: CInt = 0,
    public var threadAttrSchedparam: SchedParam = SchedParam(),
)

// signal.h
public data class Sigaction(
    public var saU: SaUT = SaUT(),
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = 0uL,
    public var saFlags: CInt = 0,
)

// bStackT.h
public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssSize: SizeT = 0uL,
    public var ssFlags: CInt = 0,
)

// signal.h
public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siValue: Sigval = Sigval(),
    public var siErrno: CInt = 0,
    public var siStatus: CInt = 0,
    public var siAddr: COpaquePointer? = null,
    public var siUid: UidT = 0u,
    public var siPid: PidT = 0,
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

// pthread.h (krnl)
// bPthreadMutexattrT.h (usr)
public data class PthreadMutexattrT(
    public var mutexAttrStatus: CInt = 0,
    public var mutexAttrPshared: CInt = 0,
    public var mutexAttrProtocol: CInt = 0,
    public var mutexAttrPrioceiling: CInt = 0,
    public var mutexAttrType: CInt = 0,
)

// pthread.h (krnl)
// bPthreadMutexT.h (usr)
public data class PthreadMutexT(
    public var mutexSemId: VxSemId = null,
    // _Vx_SEM_ID ..
    public var mutexValid: CInt = 0,
    public var mutexInitted: CInt = 0,
    public var mutexCondRefCount: CInt = 0,
    public var mutexSavPriority: CInt = 0,
    public var mutexAttr: PthreadMutexattrT = PthreadMutexattrT(),
    public var mutexSemName: UByteArray = UByteArray((PTHREAD_SHARED_SEM_NAME_MAX).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (this.mutexSemId != other.mutexSemId) return false
        if (this.mutexValid != other.mutexValid) return false
        if (this.mutexInitted != other.mutexInitted) return false
        if (this.mutexCondRefCount != other.mutexCondRefCount) return false
        if (this.mutexSavPriority != other.mutexSavPriority) return false
        if (this.mutexAttr != other.mutexAttr) return false
        if (!this.mutexSemName.contentEquals(other.mutexSemName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mutexSemId.hashCode()
        result = 31 * result + this.mutexValid.hashCode()
        result = 31 * result + this.mutexInitted.hashCode()
        result = 31 * result + this.mutexCondRefCount.hashCode()
        result = 31 * result + this.mutexSavPriority.hashCode()
        result = 31 * result + this.mutexAttr.hashCode()
        result = 31 * result + this.mutexSemName.contentHashCode()
        return result
    }
}

// time.h
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

// sys/times.h
public data class Tms(
    public var tmsUtime: ClockT = 0L,
    public var tmsStime: ClockT = 0L,
    public var tmsCutime: ClockT = 0L,
    public var tmsCstime: ClockT = 0L,
)

// utime.h
public data class Utimbuf(public var actime: TimeT = 0L, public var modtime: TimeT = 0L)

// in.h
public data class InAddr(public var sAddr: InAddrT = 0u)

// in.h
public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

public data class In6Addr(public var s6Addr: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is In6Addr) return false
        if (!this.s6Addr.contentEquals(other.s6Addr)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.s6Addr.contentHashCode()
    }
}

// in6.h
public data class Ipv6Mreq(public var ipv6mrMultiaddr: In6Addr = In6Addr(), public var ipv6mrInterface: CUint = 0u)

// netdb.h
public data class Addrinfo(
    public var aiFlags: CInt = 0,
    public var aiFamily: CInt = 0,
    public var aiSocktype: CInt = 0,
    public var aiProtocol: CInt = 0,
    public var aiAddrlen: SizeT = 0uL,
    public var aiCanonname: COpaquePointer? = null,
    public var aiAddr: Sockaddr? = null,
    public var aiNext: Addrinfo? = null,
)

// netdb.h
public data class Servent(
    public var sName: COpaquePointer? = null,
    public var sAliases: COpaquePointer? = null,
    public var sPort: CInt = 0,
    public var sProto: COpaquePointer? = null,
)

// netdb.h
public data class Protoent(
    public var pName: COpaquePointer? = null,
    public var pAliases: COpaquePointer? = null,
    public var pProto: CInt = 0,
)

// netdb.h
public data class Hostent(
    public var hName: COpaquePointer? = null,
    public var hAliases: COpaquePointer? = null,
    public var hAddrtype: CInt = 0,
    public var hLength: CInt = 0,
    public var hAddrList: COpaquePointer? = null,
)

// in.h
public data class SockaddrIn(
    public var sinLen: UByte = 0u,
    public var sinFamily: UByte = 0u,
    public var sinPort: UShort = 0u,
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

// in6.h
public data class SockaddrIn6(
    public var sin6Len: UByte = 0u,
    public var sin6Family: UByte = 0u,
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
)

public data class MqAttr(
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqFlags: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
)

public data class Winsize(
    public var wsRow: CUshort = 0u,
    public var wsCol: CUshort = 0u,
    public var wsXpixel: CUshort = 0u,
    public var wsYpixel: CUshort = 0u,
)

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
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
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }
}

public data class Rusage(
    public var ruUtime: Timeval = Timeval(),
    public var ruStime: Timeval = Timeval(),
    public var ruMaxrss: CLong = 0L,
    public var ruIxrss: CLong = 0L,
    public var ruIdrss: CLong = 0L,
    public var ruIsrss: CLong = 0L,
    public var ruMinflt: CLong = 0L,
    public var ruMajflt: CLong = 0L,
    public var ruNswap: CLong = 0L,
    public var ruInblock: CLong = 0L,
    public var ruOublock: CLong = 0L,
    public var ruMsgsnd: CLong = 0L,
    public var ruMsgrcv: CLong = 0L,
    public var ruNsignals: CLong = 0L,
    public var ruNvcsw: CLong = 0L,
    public var ruNivcsw: CLong = 0L,
)

public class Lconv(
    public var currencySymbol: COpaquePointer? = null,
    public var intCurrSymbol: COpaquePointer? = null,
    public var monDecimalPoint: COpaquePointer? = null,
    public var monGrouping: COpaquePointer? = null,
    public var monThousandsSep: COpaquePointer? = null,
    public var negativeSign: COpaquePointer? = null,
    public var positiveSign: COpaquePointer? = null,
    public var fracDigits: CChar = 0u,
    public var nCsPrecedes: CChar = 0u,
    public var nSepBySpace: CChar = 0u,
    public var nSignPosn: CChar = 0u,
    public var pCsPrecedes: CChar = 0u,
    public var pSepBySpace: CChar = 0u,
    public var pSignPosn: CChar = 0u,
    public var intFracDigits: CChar = 0u,
    public var intNCsPrecedes: CChar = 0u,
    public var intNSepBySpace: CChar = 0u,
    public var intNSignPosn: CChar = 0u,
    public var intPCsPrecedes: CChar = 0u,
    public var intPSepBySpace: CChar = 0u,
    public var intPSignPosn: CChar = 0u,
    public var decimalPoint: COpaquePointer? = null,
    public var grouping: COpaquePointer? = null,
    public var thousandsSep: COpaquePointer? = null,
    public var fracGrouping: COpaquePointer? = null,
    public var fracSep: COpaquePointer? = null,
    public var falseVal: COpaquePointer? = null,
    public var trueVal: COpaquePointer? = null,
    public var no: COpaquePointer? = null,
    public var yes: COpaquePointer? = null,
)

// grp.h
public data class Group(
    public var grName: COpaquePointer? = null,
    public var grPasswd: COpaquePointer? = null,
    public var grGid: CInt = 0,
    public var grMem: COpaquePointer? = null,
)

public data class Utsname(
    public var sysname: UByteArray = UByteArray(80),
    public var nodename: UByteArray = UByteArray(256),
    public var release: UByteArray = UByteArray(80),
    public var version: UByteArray = UByteArray(256),
    public var machine: UByteArray = UByteArray(256),
    public var endian: UByteArray = UByteArray(80),
    public var kernelversion: UByteArray = UByteArray(80),
    public var releaseversion: UByteArray = UByteArray(80),
    public var processor: UByteArray = UByteArray(80),
    public var bsprevision: UByteArray = UByteArray(80),
    public var builddate: UByteArray = UByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utsname) return false
        if (!this.sysname.contentEquals(other.sysname)) return false
        if (!this.nodename.contentEquals(other.nodename)) return false
        if (!this.release.contentEquals(other.release)) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.machine.contentEquals(other.machine)) return false
        if (!this.endian.contentEquals(other.endian)) return false
        if (!this.kernelversion.contentEquals(other.kernelversion)) return false
        if (!this.releaseversion.contentEquals(other.releaseversion)) return false
        if (!this.processor.contentEquals(other.processor)) return false
        if (!this.bsprevision.contentEquals(other.bsprevision)) return false
        if (!this.builddate.contentEquals(other.builddate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sysname.contentHashCode()
        result = 31 * result + this.nodename.contentHashCode()
        result = 31 * result + this.release.contentHashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.machine.contentHashCode()
        result = 31 * result + this.endian.contentHashCode()
        result = 31 * result + this.kernelversion.contentHashCode()
        result = 31 * result + this.releaseversion.contentHashCode()
        result = 31 * result + this.processor.contentHashCode()
        result = 31 * result + this.bsprevision.contentHashCode()
        result = 31 * result + this.builddate.contentHashCode()
        return result
    }
}

// dirent.h
public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dName: UByteArray = UByteArray((PARM_NAME_MAX.toInt() + 1).toInt()),
    public var dType: CUchar = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (!this.dName.contentEquals(other.dName)) return false
        if (this.dType != other.dType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        result = 31 * result + this.dType.hashCode()
        return result
    }
}

public data class SockaddrUn(
    public var sunLen: UByte = 0u,
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(104),
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

// rtpLibCommon.h
public data class RtpDesc(
    public var status: CInt = 0,
    public var options: UInt = 0u,
    public var entrAddr: COpaquePointer? = null,
    public var initTaskId: TaskId = 0,
    public var parentId: RtpId = 0,
    public var pathName: UByteArray = UByteArray((VX_RTP_NAME_LENGTH.toInt() + 1).toInt()),
    public var taskCnt: CInt = 0,
    public var textStart: COpaquePointer? = null,
    public var textEnd: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtpDesc) return false
        if (this.status != other.status) return false
        if (this.options != other.options) return false
        if (this.entrAddr != other.entrAddr) return false
        if (this.initTaskId != other.initTaskId) return false
        if (this.parentId != other.parentId) return false
        if (!this.pathName.contentEquals(other.pathName)) return false
        if (this.taskCnt != other.taskCnt) return false
        if (this.textStart != other.textStart) return false
        if (this.textEnd != other.textEnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.status.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.entrAddr.hashCode()
        result = 31 * result + this.initTaskId.hashCode()
        result = 31 * result + this.parentId.hashCode()
        result = 31 * result + this.pathName.contentHashCode()
        result = 31 * result + this.taskCnt.hashCode()
        result = 31 * result + this.textStart.hashCode()
        result = 31 * result + this.textEnd.hashCode()
        return result
    }
}

// socket.h
public data class SockaddrStorage(
    public var ssLen: CUchar = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray((SS_PAD1SIZE).toInt()),
    public var ssAlign: Int = 0,
    public var ssPad2: UByteArray = UByteArray((SS_PAD2SIZE).toInt()),
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

public data class SaUT(public var saHandler: SaUTSaHandlerCallback? = null, public var saSigaction: SaUTSaSigactionCallback? = null) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "sa_u_t").finishNonExhaustive()
    }

    public fun eq(other: SaUT): Boolean {
        return run {
            val h1 = when (val matchVal = this.saHandler) {
                null -> 0.toInt()
                else -> {
                    val handler = matchVal
                    ((handler)?.hashCode()?.toLong() ?: 0L).toInt()
                }
            }
            val h2 = when (val matchVal1 = other.saHandler) {
                null -> 0.toInt()
                else -> {
                    val handler1 = matchVal1
                    ((handler1)?.hashCode()?.toLong() ?: 0L).toInt()
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
                    ((handler)?.hashCode()?.toLong() ?: 0L).toInt()
                }
            }
            state = 31 * state + (h).hashCode()
        }
        return state
    }
}

public data class Sigval(public var sivalInt: CInt = 0, public var sivalPtr: COpaquePointer? = null) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "sigval").finishNonExhaustive()
    }

    public fun eq(other: Sigval): Boolean {
        return ((this.sivalPtr)?.rawValue ?: 0L).toInt() == ((other.sivalPtr)?.rawValue ?: 0L).toInt()
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + ((((this.sivalPtr)?.rawValue ?: 0L).toInt())).hashCode()
        return state
    }
}
