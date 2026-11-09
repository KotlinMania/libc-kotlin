@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.fuchsia

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
import io.github.kotlinmania.libc.fuchsia.aarch64.IpcPerm
import io.github.kotlinmania.libc.fuchsia.aarch64.U64

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public fun interface SigeventSigevNotifyFunctionCallback {
    public operator fun invoke(arg0: Sigval)
}

// PUB_STRUCT
// intentionally not public, only used for fdSet
// END_PUB_CONST
public data class Group(
    public var grName: COpaquePointer? = null,
    public var grPasswd: COpaquePointer? = null,
    public var grGid: GidT = 0u,
    public var grMem: COpaquePointer? = null,
)

public data class Utimbuf(public var actime: TimeT = 0L, public var modtime: TimeT = 0L)

public data class Timeval(public var tvSec: TimeT = 0L, public var tvUsec: SusecondsT = 0L)

public data class Timespec(public var tvSec: TimeT = 0L, public var tvNsec: CLong = 0L)

// Note(fuchsia): the rlimit and rusage related functions and types don't exist
// within zircon. Are there reasons for keeping them around?
public data class Rlimit(public var rlimCur: RlimT = 0uL, public var rlimMax: RlimT = 0uL)

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

public data class InAddr(public var sAddr: InAddrT = 0u)

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

public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

public data class IpMreqn(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrAddress: InAddr = InAddr(),
    public var imrIfindex: CInt = 0,
)

public data class Ipv6Mreq(public var ipv6mrMultiaddr: In6Addr = In6Addr(), public var ipv6mrInterface: CUint = 0u)

public data class Hostent(
    public var hName: COpaquePointer? = null,
    public var hAliases: COpaquePointer? = null,
    public var hAddrtype: CInt = 0,
    public var hLength: CInt = 0,
    public var hAddrList: COpaquePointer? = null,
)

public data class Iovec(public var iovBase: COpaquePointer? = null, public var iovLen: SizeT = 0uL)

public data class Pollfd(
    public var fd: CInt = 0,
    public var events: CShort = 0,
    public var revents: CShort = 0,
)

public data class Winsize(
    public var wsRow: CUshort = 0u,
    public var wsCol: CUshort = 0u,
    public var wsXpixel: CUshort = 0u,
    public var wsYpixel: CUshort = 0u,
)

public data class Linger(public var lOnoff: CInt = 0, public var lLinger: CInt = 0)

public data class Sigval(
    // Actually a union of an int and a void*
    public var sivalPtr: COpaquePointer? = null,
)

// <sys/time.h>
public data class Itimerval(public var itInterval: Timeval = Timeval(), public var itValue: Timeval = Timeval())

// <sys/times.h>
public data class Tms(
    public var tmsUtime: ClockT = 0L,
    public var tmsStime: ClockT = 0L,
    public var tmsCutime: ClockT = 0L,
    public var tmsCstime: ClockT = 0L,
)

public data class Servent(
    public var sName: COpaquePointer? = null,
    public var sAliases: COpaquePointer? = null,
    public var sPort: CInt = 0,
    public var sProto: COpaquePointer? = null,
)

public data class Protoent(
    public var pName: COpaquePointer? = null,
    public var pAliases: COpaquePointer? = null,
    public var pProto: CInt = 0,
)

public data class Aiocb(
    public var aioFildes: CInt = 0,
    public var aioLioOpcode: CInt = 0,
    public var aioReqprio: CInt = 0,
    public var aioBuf: COpaquePointer? = null,
    public var aioNbytes: SizeT = 0uL,
    public var aioSigevent: Sigevent = Sigevent(),
    public var td: COpaquePointer? = null,
    public var lock: IntArray = IntArray(2),
    public var err: CInt = 0,
    public var ret: SsizeT = 0L,
    public var aioOffset: OffT = 0L,
    public var next: COpaquePointer? = null,
    public var prev: COpaquePointer? = null,
    public var dummy4: UByteArray = UByteArray(16),
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
        if (this.td != other.td) return false
        if (!this.lock.contentEquals(other.lock)) return false
        if (this.err != other.err) return false
        if (this.ret != other.ret) return false
        if (this.aioOffset != other.aioOffset) return false
        if (this.next != other.next) return false
        if (this.prev != other.prev) return false
        if (!this.dummy4.contentEquals(other.dummy4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioFildes.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.td.hashCode()
        result = 31 * result + this.lock.contentHashCode()
        result = 31 * result + this.err.hashCode()
        result = 31 * result + this.ret.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.prev.hashCode()
        result = 31 * result + this.dummy4.contentHashCode()
        return result
    }
}

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = SigsetT(),
    public var saFlags: CInt = 0,
    public var saRestorer: SigactionSaRestorerCallback? = null,
)

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CcT = 0u,
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

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
)

public data class Ucred(
    public var pid: PidT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
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

public data class SockaddrVm(
    public var svmFamily: SaFamilyT = 0u,
    public var svmReserved1: CUshort = 0u,
    public var svmPort: InPortT = 0u,
    public var svmCid: CUint = 0u,
    public var svmZero: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrVm) return false
        if (this.svmFamily != other.svmFamily) return false
        if (this.svmReserved1 != other.svmReserved1) return false
        if (this.svmPort != other.svmPort) return false
        if (this.svmCid != other.svmCid) return false
        if (!this.svmZero.contentEquals(other.svmZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svmFamily.hashCode()
        result = 31 * result + this.svmReserved1.hashCode()
        result = 31 * result + this.svmPort.hashCode()
        result = 31 * result + this.svmCid.hashCode()
        result = 31 * result + this.svmZero.contentHashCode()
        return result
    }
}

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

public data class FdSet(public var fdsBits: ULongArray = ULongArray((FD_SETSIZE.toInt() / ULONG_SIZE).toInt())) {
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

public data class SchedParam(
    public var schedPriority: CInt = 0,
    public var schedSsLowPriority: CInt = 0,
    public var schedSsReplPeriod: Timespec = Timespec(),
    public var schedSsInitBudget: Timespec = Timespec(),
    public var schedSsMaxRepl: CInt = 0,
)

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
)

public data class EpollEvent(public var events: UInt = 0u, public var u64: ULong = 0uL)

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

public data class Rlimit64(public var rlimCur: Rlim64T = 0uL, public var rlimMax: Rlim64T = 0uL)

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
    public var fSpare: IntArray = IntArray(6),
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
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
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
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Dqblk(
    public var dqbBhardlimit: ULong = 0uL,
    public var dqbBsoftlimit: ULong = 0uL,
    public var dqbCurspace: ULong = 0uL,
    public var dqbIhardlimit: ULong = 0uL,
    public var dqbIsoftlimit: ULong = 0uL,
    public var dqbCurinodes: ULong = 0uL,
    public var dqbBtime: ULong = 0uL,
    public var dqbItime: ULong = 0uL,
    public var dqbValid: UInt = 0u,
)

public class SignalfdSiginfo(
    public var ssiSigno: UInt = 0u,
    public var ssiErrno: Int = 0,
    public var ssiCode: Int = 0,
    public var ssiPid: UInt = 0u,
    public var ssiUid: UInt = 0u,
    public var ssiFd: Int = 0,
    public var ssiTid: UInt = 0u,
    public var ssiBand: UInt = 0u,
    public var ssiOverrun: UInt = 0u,
    public var ssiTrapno: UInt = 0u,
    public var ssiStatus: Int = 0,
    public var ssiInt: Int = 0,
    public var ssiPtr: ULong = 0uL,
    public var ssiUtime: ULong = 0uL,
    public var ssiStime: ULong = 0uL,
    public var ssiAddr: ULong = 0uL,
    public var ssiAddrLsb: UShort = 0u,
    public var pad2: UShort = 0u,
    public var ssiSyscall: Int = 0,
    public var ssiCallAddr: ULong = 0uL,
    public var ssiArch: UInt = 0u,
    public var pad: UByteArray = UByteArray(28),
)

public data class Itimerspec(public var itInterval: Timespec = Timespec(), public var itValue: Timespec = Timespec())

public data class FsidT(public var value: IntArray = IntArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsidT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

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

public data class Mmsghdr(public var msgHdr: Msghdr = Msghdr(), public var msgLen: CUint = 0u)

public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
)

public data class InputEvent(
    public var time: Timeval = Timeval(),
    public var type: U16 = 0u,
    public var code: U16 = 0u,
    public var value: S32 = 0,
)

public data class InputId(
    public var bustype: U16 = 0u,
    public var vendor: U16 = 0u,
    public var product: U16 = 0u,
    public var version: U16 = 0u,
)

public data class InputAbsinfo(
    public var value: S32 = 0,
    public var minimum: S32 = 0,
    public var maximum: S32 = 0,
    public var fuzz: S32 = 0,
    public var flat: S32 = 0,
    public var resolution: S32 = 0,
)

public data class InputKeymapEntry(
    public var flags: U8 = 0u,
    public var len: U8 = 0u,
    public var index: U16 = 0u,
    public var keycode: U32 = 0u,
    public var scancode: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InputKeymapEntry) return false
        if (this.flags != other.flags) return false
        if (this.len != other.len) return false
        if (this.index != other.index) return false
        if (this.keycode != other.keycode) return false
        if (!this.scancode.contentEquals(other.scancode)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.len.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.keycode.hashCode()
        result = 31 * result + this.scancode.contentHashCode()
        return result
    }
}

public data class InputMask(
    public var type: U32 = 0u,
    public var codesSize: U32 = 0u,
    public var codesPtr: U64 = 0uL,
)

public data class FfReplay(public var length: U16 = 0u, public var delay: U16 = 0u)

public data class FfTrigger(public var button: U16 = 0u, public var interval: U16 = 0u)

public data class FfEnvelope(
    public var attackLength: U16 = 0u,
    public var attackLevel: U16 = 0u,
    public var fadeLength: U16 = 0u,
    public var fadeLevel: U16 = 0u,
)

public data class FfConstantEffect(public var level: S16 = 0, public var envelope: FfEnvelope = FfEnvelope())

public data class FfRampEffect(
    public var startLevel: S16 = 0,
    public var endLevel: S16 = 0,
    public var envelope: FfEnvelope = FfEnvelope(),
)

public data class FfConditionEffect(
    public var rightSaturation: U16 = 0u,
    public var leftSaturation: U16 = 0u,
    public var rightCoeff: S16 = 0,
    public var leftCoeff: S16 = 0,
    public var deadband: U16 = 0u,
    public var center: S16 = 0,
)

public data class FfPeriodicEffect(
    public var waveform: U16 = 0u,
    public var period: U16 = 0u,
    public var magnitude: S16 = 0,
    public var offset: S16 = 0,
    public var phase: U16 = 0u,
    public var envelope: FfEnvelope = FfEnvelope(),
    public var customLen: U32 = 0u,
    public var customData: CShort? = null,
)

public data class FfRumbleEffect(public var strongMagnitude: U16 = 0u, public var weakMagnitude: U16 = 0u)

public data class FfEffect(
    public var type: U16 = 0u,
    public var id: S16 = 0,
    public var direction: U16 = 0u,
    public var trigger: FfTrigger = FfTrigger(),
    public var replay: FfReplay = FfReplay(),
    // Note(1.0): this is actually a union
    public var u: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FfEffect) return false
        if (this.type != other.type) return false
        if (this.id != other.id) return false
        if (this.direction != other.direction) return false
        if (this.trigger != other.trigger) return false
        if (this.replay != other.replay) return false
        if (!this.u.contentEquals(other.u)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.direction.hashCode()
        result = 31 * result + this.trigger.hashCode()
        result = 31 * result + this.replay.hashCode()
        result = 31 * result + this.u.contentHashCode()
        return result
    }
}

public data class DlPhdrInfo(
    public var dlpiAddr: Elf64Addr = 0uL,
    public var dlpiName: COpaquePointer? = null,
    public var dlpiPhdr: Elf64Phdr? = null,
    public var dlpiPhnum: Elf64Half = 0u,
    public var dlpiAdds: CUlonglong = 0uL,
    public var dlpiSubs: CUlonglong = 0uL,
    public var dlpiTlsModid: SizeT = 0uL,
    public var dlpiTlsData: COpaquePointer? = null,
)

public data class Elf32Phdr(
    public var pType: Elf32Word = 0u,
    public var pOffset: Elf32Off = 0u,
    public var pVaddr: Elf32Addr = 0u,
    public var pPaddr: Elf32Addr = 0u,
    public var pFilesz: Elf32Word = 0u,
    public var pMemsz: Elf32Word = 0u,
    public var pFlags: Elf32Word = 0u,
    public var pAlign: Elf32Word = 0u,
)

public data class Elf64Phdr(
    public var pType: Elf64Word = 0u,
    public var pFlags: Elf64Word = 0u,
    public var pOffset: Elf64Off = 0uL,
    public var pVaddr: Elf64Addr = 0uL,
    public var pPaddr: Elf64Addr = 0uL,
    public var pFilesz: Elf64Xword = 0uL,
    public var pMemsz: Elf64Xword = 0uL,
    public var pAlign: Elf64Xword = 0uL,
)

public data class Statfs64(
    public var fType: CUlong = 0uL,
    public var fBsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fFlags: CUlong = 0uL,
    public var fSpare: ULongArray = ULongArray(4),
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
        if (this.fFrsize != other.fFrsize) return false
        if (this.fFlags != other.fFlags) return false
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
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Statvfs64(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFavail: ULong = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fSpare: IntArray = IntArray(6),
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
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
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
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssFlags: CInt = 0,
    public var ssSize: SizeT = 0uL,
)

public data class PthreadAttrT(public var size: ULongArray = ULongArray(7)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class SigsetT(public var value: ULongArray = ULongArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    public var shmAtime: TimeT = 0L,
    public var shmDtime: TimeT = 0L,
    public var shmCtime: TimeT = 0L,
    public var shmCpid: PidT = 0,
    public var shmLpid: PidT = 0,
    public var shmNattch: CUlong = 0uL,
    public var pad1: CUlong = 0uL,
    public var pad2: CUlong = 0uL,
)

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgStime: TimeT = 0L,
    public var msgRtime: TimeT = 0L,
    public var msgCtime: TimeT = 0L,
    public var msgCbytes: CUlong = 0uL,
    public var msgQnum: MsgqnumT = 0uL,
    public var msgQbytes: MsglenT = 0uL,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var pad1: CUlong = 0uL,
    public var pad2: CUlong = 0uL,
)

public data class Statfs(
    public var fType: CUlong = 0uL,
    public var fBsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fFlags: CUlong = 0uL,
    public var fSpare: ULongArray = ULongArray(4),
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
        if (this.fFrsize != other.fFrsize) return false
        if (this.fFlags != other.fFlags) return false
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
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Msghdr(
    public var msgName: COpaquePointer? = null,
    public var msgNamelen: SocklenT = 0u,
    public var msgIov: Iovec? = null,
    public var msgIovlen: CInt = 0,
    public var pad1: CInt = 0,
    public var msgControl: COpaquePointer? = null,
    public var msgControllen: SocklenT = 0u,
    public var pad2: SocklenT = 0u,
    public var msgFlags: CInt = 0,
)

public data class Cmsghdr(
    public var cmsgLen: SocklenT = 0u,
    public var pad1: CInt = 0,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
)

public data class SemT(public var value: IntArray = IntArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siErrno: CInt = 0,
    public var siCode: CInt = 0,
    public var pad: IntArray = IntArray(29),
    public var align: IntArray = IntArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siCode != other.siCode) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (!this.align.contentEquals(other.align)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.align.contentHashCode()
        return result
    }
}

public data class Termios2(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CcT = 0u,
    public var cCc: UByteArray = UByteArray(19),
    public var cIspeed: SpeedT = 0u,
    public var cOspeed: SpeedT = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios2) return false
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

public data class In6Pktinfo(public var ipi6Addr: In6Addr = In6Addr(), public var ipi6Ifindex: CUint = 0u)

public data class PthreadMutexattrT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_MUTEXATTR_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class PthreadRwlockattrT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_RWLOCKATTR_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class PthreadCondattrT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_CONDATTR_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class Sysinfo(
    public var uptime: CUlong = 0uL,
    public var loads: ULongArray = ULongArray(3),
    public var totalram: CUlong = 0uL,
    public var freeram: CUlong = 0uL,
    public var sharedram: CUlong = 0uL,
    public var bufferram: CUlong = 0uL,
    public var totalswap: CUlong = 0uL,
    public var freeswap: CUlong = 0uL,
    public var procs: CUshort = 0u,
    public var pad: CUshort = 0u,
    public var totalhigh: CUlong = 0uL,
    public var freehigh: CUlong = 0uL,
    public var memUnit: CUint = 0u,
    public var reserved: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sysinfo) return false
        if (this.uptime != other.uptime) return false
        if (!this.loads.contentEquals(other.loads)) return false
        if (this.totalram != other.totalram) return false
        if (this.freeram != other.freeram) return false
        if (this.sharedram != other.sharedram) return false
        if (this.bufferram != other.bufferram) return false
        if (this.totalswap != other.totalswap) return false
        if (this.freeswap != other.freeswap) return false
        if (this.procs != other.procs) return false
        if (this.pad != other.pad) return false
        if (this.totalhigh != other.totalhigh) return false
        if (this.freehigh != other.freehigh) return false
        if (this.memUnit != other.memUnit) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uptime.hashCode()
        result = 31 * result + this.loads.contentHashCode()
        result = 31 * result + this.totalram.hashCode()
        result = 31 * result + this.freeram.hashCode()
        result = 31 * result + this.sharedram.hashCode()
        result = 31 * result + this.bufferram.hashCode()
        result = 31 * result + this.totalswap.hashCode()
        result = 31 * result + this.freeswap.hashCode()
        result = 31 * result + this.procs.hashCode()
        result = 31 * result + this.pad.hashCode()
        result = 31 * result + this.totalhigh.hashCode()
        result = 31 * result + this.freehigh.hashCode()
        result = 31 * result + this.memUnit.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
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

public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dOff: OffT = 0L,
    public var dReclen: CUshort = 0u,
    public var dType: CUchar = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class Dirent64(
    public var dIno: Ino64T = 0uL,
    public var dOff: Off64T = 0L,
    public var dReclen: CUshort = 0u,
    public var dType: CUchar = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent64) return false
        if (this.dIno != other.dIno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

// x32 compatibility
// See https://sourceware.org/bugzilla/showBug.cgi?id=21279
public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
    public var pad: LongArray = LongArray(4),
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

public data class SockaddrNl(
    public var nlFamily: SaFamilyT = 0u,
    public var nlPad: CUshort = 0u,
    public var nlPid: UInt = 0u,
    public var nlGroups: UInt = 0u,
)

public data class Sigevent(
    public var sigevValue: Sigval = Sigval(),
    public var sigevSigno: CInt = 0,
    public var sigevNotify: CInt = 0,
    public var sigevNotifyFunction: SigeventSigevNotifyFunctionCallback = SigeventSigevNotifyFunctionCallback { _ ->  },
    public var sigevNotifyAttributes: PthreadAttrT? = null,
    public var pad: UByteArray = UByteArray((56 - 3 * 8).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigevent) return false
        if (this.sigevValue != other.sigevValue) return false
        if (this.sigevSigno != other.sigevSigno) return false
        if (this.sigevNotify != other.sigevNotify) return false
        if (this.sigevNotifyFunction != other.sigevNotifyFunction) return false
        if (this.sigevNotifyAttributes != other.sigevNotifyAttributes) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sigevValue.hashCode()
        result = 31 * result + this.sigevSigno.hashCode()
        result = 31 * result + this.sigevNotify.hashCode()
        result = 31 * result + this.sigevNotifyFunction.hashCode()
        result = 31 * result + this.sigevNotifyAttributes.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}

public data class PthreadMutexT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_MUTEX_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class PthreadRwlockT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_RWLOCK_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class PthreadCondT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_COND_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}
