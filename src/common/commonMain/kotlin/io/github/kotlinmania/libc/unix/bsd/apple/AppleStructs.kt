@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.apple

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
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.BlkcntT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.bsd.NCCS
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SockaddrIn6
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.IfData
import io.github.kotlinmania.libc.unix.bsd.apple.b64.Timeval32
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT

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

public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

public data class IpMreqn(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrAddress: InAddr = InAddr(),
    public var imrIfindex: CInt = 0,
)

public data class IpMreqSource(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrSourceaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class Aiocb(
    public var aioFildes: CInt = 0,
    public var aioOffset: OffT = 0L,
    public var aioBuf: COpaquePointer? = null,
    public var aioNbytes: SizeT = 0uL,
    public var aioReqprio: CInt = 0,
    public var aioSigevent: Sigevent = Sigevent(),
    public var aioLioOpcode: CInt = 0,
)

public data class GlobT(
    public var glPathc: SizeT = 0uL,
    public var unused1: CInt = 0,
    public var glOffs: SizeT = 0uL,
    public var unused2: CInt = 0,
    public var glPathv: COpaquePointer? = null,
    public var unused3: COpaquePointer? = null,
    public var unused4: COpaquePointer? = null,
    public var unused5: COpaquePointer? = null,
    public var unused6: COpaquePointer? = null,
    public var unused7: COpaquePointer? = null,
    public var unused8: COpaquePointer? = null,
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

public data class Addrinfo(
    public var aiFlags: CInt = 0,
    public var aiFamily: CInt = 0,
    public var aiSocktype: CInt = 0,
    public var aiProtocol: CInt = 0,
    public var aiAddrlen: SocklenT = 0u,
    public var aiCanonname: COpaquePointer? = null,
    public var aiAddr: Sockaddr? = null,
    public var aiNext: Addrinfo? = null,
)

public data class MachTimebaseInfo(public var numer: UInt = 0u, public var denom: UInt = 0u)

public class Stat(
    public var stDev: DevT = 0,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stIno: InoT = 0uL,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stBirthtime: TimeT = 0L,
    public var stBirthtimeNsec: CLong = 0L,
    public var stSize: OffT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stFlags: UInt = 0u,
    public var stGen: UInt = 0u,
    public var stLspare: Int = 0,
    public var stQspare: LongArray = LongArray(2),
)

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siErrno: CInt = 0,
    public var siCode: CInt = 0,
    public var siPid: PidT = 0,
    public var siUid: UidT = 0u,
    public var siStatus: CInt = 0,
    public var siAddr: COpaquePointer? = null,
    // Requires it to be union for tests
    // pub siValue: crate::sigval,
    public var pad: IntArray = IntArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siCode != other.siCode) return false
        if (this.siPid != other.siPid) return false
        if (this.siUid != other.siUid) return false
        if (this.siStatus != other.siStatus) return false
        if (this.siAddr != other.siAddr) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siPid.hashCode()
        result = 31 * result + this.siUid.hashCode()
        result = 31 * result + this.siStatus.hashCode()
        result = 31 * result + this.siAddr.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public fun siValue(): Sigval {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var siPid: PidT = 0,
            public var siUid: UidT = 0u,
            public var siStatus: CInt = 0,
            public var siAddr: COpaquePointer? = null,
            public var siValue: Sigval = Sigval(),
        )
        return (((((this as Any?) as SiginfoT?)) as Any?) as SiginfoTimer?)!!.siValue
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

public data class Sigaction(
    // Note(union): this field is actually a union
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = 0u,
    public var saFlags: CInt = 0,
)

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssSize: SizeT = 0uL,
    public var ssFlags: CInt = 0,
)

public data class FstoreT(
    public var fstFlags: CUint = 0u,
    public var fstPosmode: CInt = 0,
    public var fstOffset: OffT = 0L,
    public var fstLength: OffT = 0L,
    public var fstBytesalloc: OffT = 0L,
)

public data class FpunchholeT(
    public var fpFlags: CUint = 0u,
    // unused
    public var reserved: CUint = 0u,
    // (to maintain 8-byte alignment)
    public var fpOffset: OffT = 0L,
    // IN: start of the region
    public var fpLength: OffT = 0L,
)

public data class FtrimactivefileT(public var ftaOffset: OffT = 0L, public var ftaLength: OffT = 0L)

public data class FspecreadT(
    public var fsrFlags: CUint = 0u,
    public var reserved: CUint = 0u,
    public var fsrOffset: OffT = 0L,
    public var fsrLength: OffT = 0L,
)

public data class Radvisory(public var raOffset: OffT = 0L, public var raCount: CInt = 0)

public data class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0u,
    public var fBfree: FsblkcntT = 0u,
    public var fBavail: FsblkcntT = 0u,
    public var fFiles: FsfilcntT = 0u,
    public var fFfree: FsfilcntT = 0u,
    public var fFavail: FsfilcntT = 0u,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
)

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
)

public data class SockaddrIn(
    public var sinLen: UByte = 0u,
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

public data class Kevent64S(
    public var ident: ULong = 0uL,
    public var filter: Short = 0,
    public var flags: UShort = 0u,
    public var fflags: UInt = 0u,
    public var data: Long = 0L,
    public var udata: ULong = 0uL,
    public var ext: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kevent64S) return false
        if (this.ident != other.ident) return false
        if (this.filter != other.filter) return false
        if (this.flags != other.flags) return false
        if (this.fflags != other.fflags) return false
        if (this.data != other.data) return false
        if (this.udata != other.udata) return false
        if (!this.ext.contentEquals(other.ext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ident.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fflags.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.udata.hashCode()
        result = 31 * result + this.ext.contentHashCode()
        return result
    }
}

public data class Dqblk(
    public var dqbBhardlimit: ULong = 0uL,
    public var dqbBsoftlimit: ULong = 0uL,
    public var dqbCurbytes: ULong = 0uL,
    public var dqbIhardlimit: UInt = 0u,
    public var dqbIsoftlimit: UInt = 0u,
    public var dqbCurinodes: UInt = 0u,
    public var dqbBtime: UInt = 0u,
    public var dqbItime: UInt = 0u,
    public var dqbId: UInt = 0u,
    public var dqbSpare: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dqblk) return false
        if (this.dqbBhardlimit != other.dqbBhardlimit) return false
        if (this.dqbBsoftlimit != other.dqbBsoftlimit) return false
        if (this.dqbCurbytes != other.dqbCurbytes) return false
        if (this.dqbIhardlimit != other.dqbIhardlimit) return false
        if (this.dqbIsoftlimit != other.dqbIsoftlimit) return false
        if (this.dqbCurinodes != other.dqbCurinodes) return false
        if (this.dqbBtime != other.dqbBtime) return false
        if (this.dqbItime != other.dqbItime) return false
        if (this.dqbId != other.dqbId) return false
        if (!this.dqbSpare.contentEquals(other.dqbSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dqbBhardlimit.hashCode()
        result = 31 * result + this.dqbBsoftlimit.hashCode()
        result = 31 * result + this.dqbCurbytes.hashCode()
        result = 31 * result + this.dqbIhardlimit.hashCode()
        result = 31 * result + this.dqbIsoftlimit.hashCode()
        result = 31 * result + this.dqbCurinodes.hashCode()
        result = 31 * result + this.dqbBtime.hashCode()
        result = 31 * result + this.dqbItime.hashCode()
        result = 31 * result + this.dqbId.hashCode()
        result = 31 * result + this.dqbSpare.contentHashCode()
        return result
    }
}

public data class IfMsghdr(
    public var ifmMsglen: CUshort = 0u,
    public var ifmVersion: CUchar = 0u,
    public var ifmType: CUchar = 0u,
    public var ifmAddrs: CInt = 0,
    public var ifmFlags: CInt = 0,
    public var ifmIndex: CUshort = 0u,
    public var ifmData: IfData = IfData(),
)

public data class IfaMsghdr(
    public var ifamMsglen: CUshort = 0u,
    public var ifamVersion: CUchar = 0u,
    public var ifamType: CUchar = 0u,
    public var ifamAddrs: CInt = 0,
    public var ifamFlags: CInt = 0,
    public var ifamIndex: CUshort = 0u,
    public var ifamMetric: CInt = 0,
)

public data class IfmaMsghdr(
    public var ifmamMsglen: CUshort = 0u,
    public var ifmamVersion: CUchar = 0u,
    public var ifmamType: CUchar = 0u,
    public var ifmamAddrs: CInt = 0,
    public var ifmamFlags: CInt = 0,
    public var ifmamIndex: CUshort = 0u,
)

public data class IfmaMsghdr2(
    public var ifmamMsglen: CUshort = 0u,
    public var ifmamVersion: CUchar = 0u,
    public var ifmamType: CUchar = 0u,
    public var ifmamAddrs: CInt = 0,
    public var ifmamFlags: CInt = 0,
    public var ifmamIndex: CUshort = 0u,
    public var ifmamRefcount: Int = 0,
)

public data class RtMetrics(
    public var rmxLocks: UInt = 0u,
    public var rmxMtu: UInt = 0u,
    public var rmxHopcount: UInt = 0u,
    public var rmxExpire: Int = 0,
    public var rmxRecvpipe: UInt = 0u,
    public var rmxSendpipe: UInt = 0u,
    public var rmxSsthresh: UInt = 0u,
    public var rmxRtt: UInt = 0u,
    public var rmxRttvar: UInt = 0u,
    public var rmxPksent: UInt = 0u,
    /**
     * This field does not exist anymore, the u32 is now part of a resized
     * `rmxFiller` array.
     */
    public var rmxState: UInt = 0u,
    public var rmxFiller: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtMetrics) return false
        if (this.rmxLocks != other.rmxLocks) return false
        if (this.rmxMtu != other.rmxMtu) return false
        if (this.rmxHopcount != other.rmxHopcount) return false
        if (this.rmxExpire != other.rmxExpire) return false
        if (this.rmxRecvpipe != other.rmxRecvpipe) return false
        if (this.rmxSendpipe != other.rmxSendpipe) return false
        if (this.rmxSsthresh != other.rmxSsthresh) return false
        if (this.rmxRtt != other.rmxRtt) return false
        if (this.rmxRttvar != other.rmxRttvar) return false
        if (this.rmxPksent != other.rmxPksent) return false
        if (this.rmxState != other.rmxState) return false
        if (!this.rmxFiller.contentEquals(other.rmxFiller)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rmxLocks.hashCode()
        result = 31 * result + this.rmxMtu.hashCode()
        result = 31 * result + this.rmxHopcount.hashCode()
        result = 31 * result + this.rmxExpire.hashCode()
        result = 31 * result + this.rmxRecvpipe.hashCode()
        result = 31 * result + this.rmxSendpipe.hashCode()
        result = 31 * result + this.rmxSsthresh.hashCode()
        result = 31 * result + this.rmxRtt.hashCode()
        result = 31 * result + this.rmxRttvar.hashCode()
        result = 31 * result + this.rmxPksent.hashCode()
        result = 31 * result + this.rmxState.hashCode()
        result = 31 * result + this.rmxFiller.contentHashCode()
        return result
    }
}

public data class RtMsghdr(
    public var rtmMsglen: CUshort = 0u,
    public var rtmVersion: CUchar = 0u,
    public var rtmType: CUchar = 0u,
    public var rtmIndex: CUshort = 0u,
    public var rtmFlags: CInt = 0,
    public var rtmAddrs: CInt = 0,
    public var rtmPid: PidT = 0,
    public var rtmSeq: CInt = 0,
    public var rtmErrno: CInt = 0,
    public var rtmUse: CInt = 0,
    public var rtmInits: UInt = 0u,
    public var rtmRmx: RtMetrics = RtMetrics(),
)

public data class RtMsghdr2(
    public var rtmMsglen: CUshort = 0u,
    public var rtmVersion: CUchar = 0u,
    public var rtmType: CUchar = 0u,
    public var rtmIndex: CUshort = 0u,
    public var rtmFlags: CInt = 0,
    public var rtmAddrs: CInt = 0,
    public var rtmRefcnt: Int = 0,
    public var rtmParentflags: CInt = 0,
    public var rtmReserved: CInt = 0,
    public var rtmUse: CInt = 0,
    public var rtmInits: UInt = 0u,
    public var rtmRmx: RtMetrics = RtMetrics(),
)

public data class Termios(
    public var cIflag: TcflagT = 0uL,
    public var cOflag: TcflagT = 0uL,
    public var cCflag: TcflagT = 0uL,
    public var cLflag: TcflagT = 0uL,
    public var cCc: UByteArray = UByteArray((NCCS).toInt()),
    public var cIspeed: SpeedT = 0uL,
    public var cOspeed: SpeedT = 0uL,
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

public data class Flock(
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
)

public data class SfHdtr(
    public var headers: Iovec? = null,
    public var hdrCnt: CInt = 0,
    public var trailers: Iovec? = null,
    public var trlCnt: CInt = 0,
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
    public var intNCsPrecedes: CChar = 0u,
    public var intPSepBySpace: CChar = 0u,
    public var intNSepBySpace: CChar = 0u,
    public var intPSignPosn: CChar = 0u,
    public var intNSignPosn: CChar = 0u,
)

public class ProcTaskinfo(
    public var ptiVirtualSize: ULong = 0uL,
    public var ptiResidentSize: ULong = 0uL,
    public var ptiTotalUser: ULong = 0uL,
    public var ptiTotalSystem: ULong = 0uL,
    public var ptiThreadsUser: ULong = 0uL,
    public var ptiThreadsSystem: ULong = 0uL,
    public var ptiPolicy: Int = 0,
    public var ptiFaults: Int = 0,
    public var ptiPageins: Int = 0,
    public var ptiCowFaults: Int = 0,
    public var ptiMessagesSent: Int = 0,
    public var ptiMessagesReceived: Int = 0,
    public var ptiSyscallsMach: Int = 0,
    public var ptiSyscallsUnix: Int = 0,
    public var ptiCsw: Int = 0,
    public var ptiThreadnum: Int = 0,
    public var ptiNumrunning: Int = 0,
    public var ptiPriority: Int = 0,
)

public class ProcBsdinfo(
    public var pbiFlags: UInt = 0u,
    public var pbiStatus: UInt = 0u,
    public var pbiXstatus: UInt = 0u,
    public var pbiPid: UInt = 0u,
    public var pbiPpid: UInt = 0u,
    public var pbiUid: UidT = 0u,
    public var pbiGid: GidT = 0u,
    public var pbiRuid: UidT = 0u,
    public var pbiRgid: GidT = 0u,
    public var pbiSvuid: UidT = 0u,
    public var pbiSvgid: GidT = 0u,
    public var rfu1: UInt = 0u,
    public var pbiComm: UByteArray = UByteArray((MAXCOMLEN).toInt()),
    public var pbiName: UByteArray = UByteArray(32),
    // MAXCOMLEN * 2, but macro isn't happy...
    public var pbiNfiles: UInt = 0u,
    public var pbiPgid: UInt = 0u,
    public var pbiPjobc: UInt = 0u,
    public var eTdev: UInt = 0u,
    public var eTpgid: UInt = 0u,
    public var pbiNice: Int = 0,
    public var pbiStartTvsec: ULong = 0uL,
    public var pbiStartTvusec: ULong = 0uL,
)

public data class ProcTaskallinfo(public var pbsd: ProcBsdinfo = ProcBsdinfo(), public var ptinfo: ProcTaskinfo = ProcTaskinfo())

public data class XswUsage(
    public var xsuTotal: ULong = 0uL,
    public var xsuAvail: ULong = 0uL,
    public var xsuUsed: ULong = 0uL,
    public var xsuPagesize: UInt = 0u,
    public var xsuEncrypted: BooleanT = 0,
)

public data class Xucred(
    public var crVersion: CUint = 0u,
    public var crUid: UidT = 0u,
    public var crNgroups: CShort = 0,
    public var crGroups: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xucred) return false
        if (this.crVersion != other.crVersion) return false
        if (this.crUid != other.crUid) return false
        if (this.crNgroups != other.crNgroups) return false
        if (!this.crGroups.contentEquals(other.crGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crVersion.hashCode()
        result = 31 * result + this.crUid.hashCode()
        result = 31 * result + this.crNgroups.hashCode()
        result = 31 * result + this.crGroups.contentHashCode()
        return result
    }
}

public data class MachHeader(
    public var magic: UInt = 0u,
    public var cputype: CpuTypeT = 0,
    public var cpusubtype: CpuSubtypeT = 0,
    public var filetype: UInt = 0u,
    public var ncmds: UInt = 0u,
    public var sizeofcmds: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class MachHeader64(
    public var magic: UInt = 0u,
    public var cputype: CpuTypeT = 0,
    public var cpusubtype: CpuSubtypeT = 0,
    public var filetype: UInt = 0u,
    public var ncmds: UInt = 0u,
    public var sizeofcmds: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class SegmentCommand(
    public var cmd: UInt = 0u,
    public var cmdsize: UInt = 0u,
    public var segname: UByteArray = UByteArray(16),
    public var vmaddr: UInt = 0u,
    public var vmsize: UInt = 0u,
    public var fileoff: UInt = 0u,
    public var filesize: UInt = 0u,
    public var maxprot: VmProtT = 0,
    public var initprot: VmProtT = 0,
    public var nsects: UInt = 0u,
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SegmentCommand) return false
        if (this.cmd != other.cmd) return false
        if (this.cmdsize != other.cmdsize) return false
        if (!this.segname.contentEquals(other.segname)) return false
        if (this.vmaddr != other.vmaddr) return false
        if (this.vmsize != other.vmsize) return false
        if (this.fileoff != other.fileoff) return false
        if (this.filesize != other.filesize) return false
        if (this.maxprot != other.maxprot) return false
        if (this.initprot != other.initprot) return false
        if (this.nsects != other.nsects) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmd.hashCode()
        result = 31 * result + this.cmdsize.hashCode()
        result = 31 * result + this.segname.contentHashCode()
        result = 31 * result + this.vmaddr.hashCode()
        result = 31 * result + this.vmsize.hashCode()
        result = 31 * result + this.fileoff.hashCode()
        result = 31 * result + this.filesize.hashCode()
        result = 31 * result + this.maxprot.hashCode()
        result = 31 * result + this.initprot.hashCode()
        result = 31 * result + this.nsects.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class SegmentCommand64(
    public var cmd: UInt = 0u,
    public var cmdsize: UInt = 0u,
    public var segname: UByteArray = UByteArray(16),
    public var vmaddr: ULong = 0uL,
    public var vmsize: ULong = 0uL,
    public var fileoff: ULong = 0uL,
    public var filesize: ULong = 0uL,
    public var maxprot: VmProtT = 0,
    public var initprot: VmProtT = 0,
    public var nsects: UInt = 0u,
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SegmentCommand64) return false
        if (this.cmd != other.cmd) return false
        if (this.cmdsize != other.cmdsize) return false
        if (!this.segname.contentEquals(other.segname)) return false
        if (this.vmaddr != other.vmaddr) return false
        if (this.vmsize != other.vmsize) return false
        if (this.fileoff != other.fileoff) return false
        if (this.filesize != other.filesize) return false
        if (this.maxprot != other.maxprot) return false
        if (this.initprot != other.initprot) return false
        if (this.nsects != other.nsects) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmd.hashCode()
        result = 31 * result + this.cmdsize.hashCode()
        result = 31 * result + this.segname.contentHashCode()
        result = 31 * result + this.vmaddr.hashCode()
        result = 31 * result + this.vmsize.hashCode()
        result = 31 * result + this.fileoff.hashCode()
        result = 31 * result + this.filesize.hashCode()
        result = 31 * result + this.maxprot.hashCode()
        result = 31 * result + this.initprot.hashCode()
        result = 31 * result + this.nsects.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class LoadCommand(public var cmd: UInt = 0u, public var cmdsize: UInt = 0u)

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: CUchar = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: CUchar = 0u,
    public var sdlNlen: CUchar = 0u,
    public var sdlAlen: CUchar = 0u,
    public var sdlSlen: CUchar = 0u,
    public var sdlData: UByteArray = UByteArray(12),
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

public data class SockaddrInarp(
    public var sinLen: CUchar = 0u,
    public var sinFamily: CUchar = 0u,
    public var sinPort: CUshort = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinSrcaddr: InAddr = InAddr(),
    public var sinTos: CUshort = 0u,
    public var sinOther: CUshort = 0u,
)

public data class SockaddrCtl(
    public var scLen: CUchar = 0u,
    public var scFamily: CUchar = 0u,
    public var ssSysaddr: UShort = 0u,
    public var scId: UInt = 0u,
    public var scUnit: UInt = 0u,
    public var scReserved: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrCtl) return false
        if (this.scLen != other.scLen) return false
        if (this.scFamily != other.scFamily) return false
        if (this.ssSysaddr != other.ssSysaddr) return false
        if (this.scId != other.scId) return false
        if (this.scUnit != other.scUnit) return false
        if (!this.scReserved.contentEquals(other.scReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scLen.hashCode()
        result = 31 * result + this.scFamily.hashCode()
        result = 31 * result + this.ssSysaddr.hashCode()
        result = 31 * result + this.scId.hashCode()
        result = 31 * result + this.scUnit.hashCode()
        result = 31 * result + this.scReserved.contentHashCode()
        return result
    }
}

public data class InPktinfo(
    public var ipiIfindex: CUint = 0u,
    public var ipiSpecDst: InAddr = InAddr(),
    public var ipiAddr: InAddr = InAddr(),
)

public data class In6Pktinfo(public var ipi6Addr: In6Addr = In6Addr(), public var ipi6Ifindex: CUint = 0u)

// sys/ipc.h:
public data class IpcPerm(
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var seq: CUshort = 0u,
    public var key: KeyT = 0,
)

// sys/sem.h
public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
)

// sys/shm.h
public data class Arphdr(
    public var arHrd: UShort = 0u,
    public var arPro: UShort = 0u,
    public var arHln: UByte = 0u,
    public var arPln: UByte = 0u,
    public var arOp: UShort = 0u,
)

public data class InAddr(public var sAddr: InAddrT = 0u)

// net/ndrv.h
public data class SockaddrNdrv(
    public var sndLen: CUchar = 0u,
    public var sndFamily: CUchar = 0u,
    public var sndName: UByteArray = UByteArray((IFNAMSIZ).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrNdrv) return false
        if (this.sndLen != other.sndLen) return false
        if (this.sndFamily != other.sndFamily) return false
        if (!this.sndName.contentEquals(other.sndName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sndLen.hashCode()
        result = 31 * result + this.sndFamily.hashCode()
        result = 31 * result + this.sndName.contentHashCode()
        return result
    }
}

// sys/socket.h
public data class SaEndpointsT(
    public var saeSrcif: CUint = 0u,
    // optional source interface
    public var saeSrcaddr: Sockaddr? = null,
    // optional source address
    public var saeSrcaddrlen: SocklenT = 0u,
    // size of source address
    public var saeDstaddr: Sockaddr? = null,
    // destination address
    public var saeDstaddrlen: SocklenT = 0u,
)

public class Timex(
    public var modes: CUint = 0u,
    public var offset: CLong = 0L,
    public var freq: CLong = 0L,
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
    public var status: CInt = 0,
    public var constant: CLong = 0L,
    public var precision: CLong = 0L,
    public var tolerance: CLong = 0L,
    public var ppsfreq: CLong = 0L,
    public var jitter: CLong = 0L,
    public var shift: CInt = 0,
    public var stabil: CLong = 0L,
    public var jitcnt: CLong = 0L,
    public var calcnt: CLong = 0L,
    public var errcnt: CLong = 0L,
    public var stbcnt: CLong = 0L,
)

public data class Ntptimeval(
    public var time: Timespec = Timespec(),
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
    public var tai: CLong = 0L,
    public var timeState: CInt = 0,
)

public data class ThreadStandardPolicy(public var noData: NaturalT = 0u)

public data class ThreadExtendedPolicy(public var timeshare: BooleanT = 0)

public data class ThreadTimeConstraintPolicy(
    public var period: UInt = 0u,
    public var computation: UInt = 0u,
    public var constraint: UInt = 0u,
    public var preemptible: BooleanT = 0,
)

public data class ThreadPrecedencePolicy(public var importance: IntegerT = 0)

public data class ThreadAffinityPolicy(public var affinityTag: IntegerT = 0)

public data class ThreadBackgroundPolicy(public var priority: IntegerT = 0)

public data class ThreadLatencyQosPolicy(public var threadLatencyQosTier: ThreadLatencyQosT = 0)

public data class ThreadThroughputQosPolicy(public var threadThroughputQosTier: ThreadThroughputQosT = 0)

// malloc/malloc.h
public data class MallocStatisticsT(
    public var blocksInUse: CUint = 0u,
    public var sizeInUse: SizeT = 0uL,
    public var maxSizeInUse: SizeT = 0uL,
    public var sizeAllocated: SizeT = 0uL,
)

public data class Mstats(
    public var bytesTotal: SizeT = 0uL,
    public var chunksUsed: SizeT = 0uL,
    public var bytesUsed: SizeT = 0uL,
    public var chunksFree: SizeT = 0uL,
    public var bytesFree: SizeT = 0uL,
)

public data class VmRangeT(public var address: VmAddressT = 0uL, public var size: VmSizeT = 0uL)

public class VinfoStat(
    public var vstDev: UInt = 0u,
    public var vstMode: UShort = 0u,
    public var vstNlink: UShort = 0u,
    public var vstIno: ULong = 0uL,
    public var vstUid: UidT = 0u,
    public var vstGid: GidT = 0u,
    public var vstAtime: Long = 0L,
    public var vstAtimensec: Long = 0L,
    public var vstMtime: Long = 0L,
    public var vstMtimensec: Long = 0L,
    public var vstCtime: Long = 0L,
    public var vstCtimensec: Long = 0L,
    public var vstBirthtime: Long = 0L,
    public var vstBirthtimensec: Long = 0L,
    public var vstSize: OffT = 0L,
    public var vstBlocks: Long = 0L,
    public var vstBlksize: Int = 0,
    public var vstFlags: UInt = 0u,
    public var vstGen: UInt = 0u,
    public var vstRdev: UInt = 0u,
    public var vstQspare: LongArray = LongArray(2),
)

public data class VnodeInfo(
    public var viStat: VinfoStat = VinfoStat(),
    public var viType: CInt = 0,
    public var viPad: CInt = 0,
    public var viFsid: FsidT = FsidT(),
)

public data class VnodeInfoPath(
    public var vipVi: VnodeInfo = VnodeInfo(),
    // Normally it's `vipPath: [cChar; MAXPATHLEN]` but because libc supports an old rustc
    // version, we go around this limitation like this.
    public var vipPath: List<UByteArray> = List(32) { UByteArray(0) },
)

public data class ProcVnodepathinfo(public var pviCdir: VnodeInfoPath = VnodeInfoPath(), public var pviRdir: VnodeInfoPath = VnodeInfoPath())

public data class VmStatistics(
    public var freeCount: NaturalT = 0u,
    public var activeCount: NaturalT = 0u,
    public var inactiveCount: NaturalT = 0u,
    public var wireCount: NaturalT = 0u,
    public var zeroFillCount: NaturalT = 0u,
    public var reactivations: NaturalT = 0u,
    public var pageins: NaturalT = 0u,
    public var pageouts: NaturalT = 0u,
    public var faults: NaturalT = 0u,
    public var cowFaults: NaturalT = 0u,
    public var lookups: NaturalT = 0u,
    public var hits: NaturalT = 0u,
    public var purgeableCount: NaturalT = 0u,
    public var purges: NaturalT = 0u,
    public var speculativeCount: NaturalT = 0u,
)

public data class TaskThreadTimesInfo(public var userTime: TimeValueT = TimeValueT(), public var systemTime: TimeValueT = TimeValueT())

public data class RusageInfoV0(
    public var riUuid: UByteArray = UByteArray(16),
    public var riUserTime: ULong = 0uL,
    public var riSystemTime: ULong = 0uL,
    public var riPkgIdleWkups: ULong = 0uL,
    public var riInterruptWkups: ULong = 0uL,
    public var riPageins: ULong = 0uL,
    public var riWiredSize: ULong = 0uL,
    public var riResidentSize: ULong = 0uL,
    public var riPhysFootprint: ULong = 0uL,
    public var riProcStartAbstime: ULong = 0uL,
    public var riProcExitAbstime: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RusageInfoV0) return false
        if (!this.riUuid.contentEquals(other.riUuid)) return false
        if (this.riUserTime != other.riUserTime) return false
        if (this.riSystemTime != other.riSystemTime) return false
        if (this.riPkgIdleWkups != other.riPkgIdleWkups) return false
        if (this.riInterruptWkups != other.riInterruptWkups) return false
        if (this.riPageins != other.riPageins) return false
        if (this.riWiredSize != other.riWiredSize) return false
        if (this.riResidentSize != other.riResidentSize) return false
        if (this.riPhysFootprint != other.riPhysFootprint) return false
        if (this.riProcStartAbstime != other.riProcStartAbstime) return false
        if (this.riProcExitAbstime != other.riProcExitAbstime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.riUuid.contentHashCode()
        result = 31 * result + this.riUserTime.hashCode()
        result = 31 * result + this.riSystemTime.hashCode()
        result = 31 * result + this.riPkgIdleWkups.hashCode()
        result = 31 * result + this.riInterruptWkups.hashCode()
        result = 31 * result + this.riPageins.hashCode()
        result = 31 * result + this.riWiredSize.hashCode()
        result = 31 * result + this.riResidentSize.hashCode()
        result = 31 * result + this.riPhysFootprint.hashCode()
        result = 31 * result + this.riProcStartAbstime.hashCode()
        result = 31 * result + this.riProcExitAbstime.hashCode()
        return result
    }
}

public class RusageInfoV1(
    public var riUuid: UByteArray = UByteArray(16),
    public var riUserTime: ULong = 0uL,
    public var riSystemTime: ULong = 0uL,
    public var riPkgIdleWkups: ULong = 0uL,
    public var riInterruptWkups: ULong = 0uL,
    public var riPageins: ULong = 0uL,
    public var riWiredSize: ULong = 0uL,
    public var riResidentSize: ULong = 0uL,
    public var riPhysFootprint: ULong = 0uL,
    public var riProcStartAbstime: ULong = 0uL,
    public var riProcExitAbstime: ULong = 0uL,
    public var riChildUserTime: ULong = 0uL,
    public var riChildSystemTime: ULong = 0uL,
    public var riChildPkgIdleWkups: ULong = 0uL,
    public var riChildInterruptWkups: ULong = 0uL,
    public var riChildPageins: ULong = 0uL,
    public var riChildElapsedAbstime: ULong = 0uL,
)

public class RusageInfoV2(
    public var riUuid: UByteArray = UByteArray(16),
    public var riUserTime: ULong = 0uL,
    public var riSystemTime: ULong = 0uL,
    public var riPkgIdleWkups: ULong = 0uL,
    public var riInterruptWkups: ULong = 0uL,
    public var riPageins: ULong = 0uL,
    public var riWiredSize: ULong = 0uL,
    public var riResidentSize: ULong = 0uL,
    public var riPhysFootprint: ULong = 0uL,
    public var riProcStartAbstime: ULong = 0uL,
    public var riProcExitAbstime: ULong = 0uL,
    public var riChildUserTime: ULong = 0uL,
    public var riChildSystemTime: ULong = 0uL,
    public var riChildPkgIdleWkups: ULong = 0uL,
    public var riChildInterruptWkups: ULong = 0uL,
    public var riChildPageins: ULong = 0uL,
    public var riChildElapsedAbstime: ULong = 0uL,
    public var riDiskioBytesread: ULong = 0uL,
    public var riDiskioByteswritten: ULong = 0uL,
)

public class RusageInfoV3(
    public var riUuid: UByteArray = UByteArray(16),
    public var riUserTime: ULong = 0uL,
    public var riSystemTime: ULong = 0uL,
    public var riPkgIdleWkups: ULong = 0uL,
    public var riInterruptWkups: ULong = 0uL,
    public var riPageins: ULong = 0uL,
    public var riWiredSize: ULong = 0uL,
    public var riResidentSize: ULong = 0uL,
    public var riPhysFootprint: ULong = 0uL,
    public var riProcStartAbstime: ULong = 0uL,
    public var riProcExitAbstime: ULong = 0uL,
    public var riChildUserTime: ULong = 0uL,
    public var riChildSystemTime: ULong = 0uL,
    public var riChildPkgIdleWkups: ULong = 0uL,
    public var riChildInterruptWkups: ULong = 0uL,
    public var riChildPageins: ULong = 0uL,
    public var riChildElapsedAbstime: ULong = 0uL,
    public var riDiskioBytesread: ULong = 0uL,
    public var riDiskioByteswritten: ULong = 0uL,
    public var riCpuTimeQosDefault: ULong = 0uL,
    public var riCpuTimeQosMaintenance: ULong = 0uL,
    public var riCpuTimeQosBackground: ULong = 0uL,
    public var riCpuTimeQosUtility: ULong = 0uL,
    public var riCpuTimeQosLegacy: ULong = 0uL,
    public var riCpuTimeQosUserInitiated: ULong = 0uL,
    public var riCpuTimeQosUserInteractive: ULong = 0uL,
    public var riBilledSystemTime: ULong = 0uL,
    public var riServicedSystemTime: ULong = 0uL,
)

public class RusageInfoV4(
    public var riUuid: UByteArray = UByteArray(16),
    public var riUserTime: ULong = 0uL,
    public var riSystemTime: ULong = 0uL,
    public var riPkgIdleWkups: ULong = 0uL,
    public var riInterruptWkups: ULong = 0uL,
    public var riPageins: ULong = 0uL,
    public var riWiredSize: ULong = 0uL,
    public var riResidentSize: ULong = 0uL,
    public var riPhysFootprint: ULong = 0uL,
    public var riProcStartAbstime: ULong = 0uL,
    public var riProcExitAbstime: ULong = 0uL,
    public var riChildUserTime: ULong = 0uL,
    public var riChildSystemTime: ULong = 0uL,
    public var riChildPkgIdleWkups: ULong = 0uL,
    public var riChildInterruptWkups: ULong = 0uL,
    public var riChildPageins: ULong = 0uL,
    public var riChildElapsedAbstime: ULong = 0uL,
    public var riDiskioBytesread: ULong = 0uL,
    public var riDiskioByteswritten: ULong = 0uL,
    public var riCpuTimeQosDefault: ULong = 0uL,
    public var riCpuTimeQosMaintenance: ULong = 0uL,
    public var riCpuTimeQosBackground: ULong = 0uL,
    public var riCpuTimeQosUtility: ULong = 0uL,
    public var riCpuTimeQosLegacy: ULong = 0uL,
    public var riCpuTimeQosUserInitiated: ULong = 0uL,
    public var riCpuTimeQosUserInteractive: ULong = 0uL,
    public var riBilledSystemTime: ULong = 0uL,
    public var riServicedSystemTime: ULong = 0uL,
    public var riLogicalWrites: ULong = 0uL,
    public var riLifetimeMaxPhysFootprint: ULong = 0uL,
    public var riInstructions: ULong = 0uL,
    public var riCycles: ULong = 0uL,
    public var riBilledEnergy: ULong = 0uL,
    public var riServicedEnergy: ULong = 0uL,
    public var riIntervalMaxPhysFootprint: ULong = 0uL,
    public var riRunnableTime: ULong = 0uL,
)

public data class ImageOffset(public var uuid: UuidT = UByteArray(16), public var offset: UInt = 0u)

public data class Attrlist(
    public var bitmapcount: CUshort = 0u,
    public var reserved: UShort = 0u,
    public var commonattr: AttrgroupT = 0u,
    public var volattr: AttrgroupT = 0u,
    public var dirattr: AttrgroupT = 0u,
    public var fileattr: AttrgroupT = 0u,
    public var forkattr: AttrgroupT = 0u,
)

public data class AttrreferenceT(public var attrDataoffset: Int = 0, public var attrLength: UInt = 0u)

public data class VolCapabilitiesAttrT(public var capabilities: VolCapabilitiesSetT = UIntArray(4), public var valid: VolCapabilitiesSetT = UIntArray(4))

public data class AttributeSetT(
    public var commonattr: AttrgroupT = 0u,
    public var volattr: AttrgroupT = 0u,
    public var dirattr: AttrgroupT = 0u,
    public var fileattr: AttrgroupT = 0u,
    public var forkattr: AttrgroupT = 0u,
)

public data class VolAttributesAttrT(public var validattr: AttributeSetT = AttributeSetT(), public var nativeattr: AttributeSetT = AttributeSetT())

public class TcpConnectionInfo(
    public var tcpiState: UByte = 0u,
    public var tcpiSndWscale: UByte = 0u,
    public var tcpiRcvWscale: UByte = 0u,
    public var pad1: UByte = 0u,
    public var tcpiOptions: UInt = 0u,
    public var tcpiFlags: UInt = 0u,
    public var tcpiRto: UInt = 0u,
    public var tcpiMaxseg: UInt = 0u,
    public var tcpiSndSsthresh: UInt = 0u,
    public var tcpiSndCwnd: UInt = 0u,
    public var tcpiSndWnd: UInt = 0u,
    public var tcpiSndSbbytes: UInt = 0u,
    public var tcpiRcvWnd: UInt = 0u,
    public var tcpiRttcur: UInt = 0u,
    public var tcpiSrtt: UInt = 0u,
    public var tcpiRttvar: UInt = 0u,
    public var tcpiTfoCookieReq: UInt = 0u,
    public var tcpiTfoCookieRcv: UInt = 0u,
    public var tcpiTfoSynLoss: UInt = 0u,
    public var tcpiTfoSynDataSent: UInt = 0u,
    public var tcpiTfoSynDataAcked: UInt = 0u,
    public var tcpiTfoSynDataRcv: UInt = 0u,
    public var tcpiTfoCookieReqRcv: UInt = 0u,
    public var tcpiTfoCookieSent: UInt = 0u,
    public var tcpiTfoCookieInvalid: UInt = 0u,
    public var tcpiTfoCookieWrong: UInt = 0u,
    public var tcpiTfoNoCookieRcv: UInt = 0u,
    public var tcpiTfoHeuristicsDisable: UInt = 0u,
    public var tcpiTfoSendBlackhole: UInt = 0u,
    public var tcpiTfoRecvBlackhole: UInt = 0u,
    public var tcpiTfoOnebyteProxy: UInt = 0u,
    public var pad2: UInt = 0u,
    public var tcpiTxpackets: ULong = 0uL,
    public var tcpiTxbytes: ULong = 0uL,
    public var tcpiTxretransmitbytes: ULong = 0uL,
    public var tcpiRxpackets: ULong = 0uL,
    public var tcpiRxbytes: ULong = 0uL,
    public var tcpiRxoutoforderbytes: ULong = 0uL,
    public var tcpiRxretransmitpackets: ULong = 0uL,
)

public data class In6Addrlifetime(
    public var ia6tExpire: TimeT = 0L,
    public var ia6tPreferred: TimeT = 0L,
    public var ia6tVltime: UInt = 0u,
    public var ia6tPltime: UInt = 0u,
)

public class In6Ifstat(
    public var ifs6InReceive: UQuadT = 0uL,
    public var ifs6InHdrerr: UQuadT = 0uL,
    public var ifs6InToobig: UQuadT = 0uL,
    public var ifs6InNoroute: UQuadT = 0uL,
    public var ifs6InAddrerr: UQuadT = 0uL,
    public var ifs6InProtounknown: UQuadT = 0uL,
    public var ifs6InTruncated: UQuadT = 0uL,
    public var ifs6InDiscard: UQuadT = 0uL,
    public var ifs6InDeliver: UQuadT = 0uL,
    public var ifs6OutForward: UQuadT = 0uL,
    public var ifs6OutRequest: UQuadT = 0uL,
    public var ifs6OutDiscard: UQuadT = 0uL,
    public var ifs6OutFragok: UQuadT = 0uL,
    public var ifs6OutFragfail: UQuadT = 0uL,
    public var ifs6OutFragcreat: UQuadT = 0uL,
    public var ifs6ReassReqd: UQuadT = 0uL,
    public var ifs6ReassOk: UQuadT = 0uL,
    public var ifs6AtmfragRcvd: UQuadT = 0uL,
    public var ifs6ReassFail: UQuadT = 0uL,
    public var ifs6InMcast: UQuadT = 0uL,
    public var ifs6OutMcast: UQuadT = 0uL,
    public var ifs6CantfowardIcmp6: UQuadT = 0uL,
    public var ifs6AddrExpiryCnt: UQuadT = 0uL,
    public var ifs6PfxExpiryCnt: UQuadT = 0uL,
    public var ifs6DefrtrExpiryCnt: UQuadT = 0uL,
)

public class Icmp6Ifstat(
    public var ifs6InMsg: UQuadT = 0uL,
    public var ifs6InError: UQuadT = 0uL,
    public var ifs6InDstunreach: UQuadT = 0uL,
    public var ifs6InAdminprohib: UQuadT = 0uL,
    public var ifs6InTimeexceed: UQuadT = 0uL,
    public var ifs6InParamprob: UQuadT = 0uL,
    public var ifs6InPkttoobig: UQuadT = 0uL,
    public var ifs6InEcho: UQuadT = 0uL,
    public var ifs6InEchoreply: UQuadT = 0uL,
    public var ifs6InRoutersolicit: UQuadT = 0uL,
    public var ifs6InRouteradvert: UQuadT = 0uL,
    public var ifs6InNeighborsolicit: UQuadT = 0uL,
    public var ifs6InNeighboradvert: UQuadT = 0uL,
    public var ifs6InRedirect: UQuadT = 0uL,
    public var ifs6InMldquery: UQuadT = 0uL,
    public var ifs6InMldreport: UQuadT = 0uL,
    public var ifs6InMlddone: UQuadT = 0uL,
    public var ifs6OutMsg: UQuadT = 0uL,
    public var ifs6OutError: UQuadT = 0uL,
    public var ifs6OutDstunreach: UQuadT = 0uL,
    public var ifs6OutAdminprohib: UQuadT = 0uL,
    public var ifs6OutTimeexceed: UQuadT = 0uL,
    public var ifs6OutParamprob: UQuadT = 0uL,
    public var ifs6OutPkttoobig: UQuadT = 0uL,
    public var ifs6OutEcho: UQuadT = 0uL,
    public var ifs6OutEchoreply: UQuadT = 0uL,
    public var ifs6OutRoutersolicit: UQuadT = 0uL,
    public var ifs6OutRouteradvert: UQuadT = 0uL,
    public var ifs6OutNeighborsolicit: UQuadT = 0uL,
    public var ifs6OutNeighboradvert: UQuadT = 0uL,
    public var ifs6OutRedirect: UQuadT = 0uL,
    public var ifs6OutMldquery: UQuadT = 0uL,
    public var ifs6OutMldreport: UQuadT = 0uL,
    public var ifs6OutMlddone: UQuadT = 0uL,
)

// mach/hostInfo.h
public data class HostCpuLoadInfo(public var cpuTicks: UIntArray = UIntArray(CPU_STATE_MAX.toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HostCpuLoadInfo) return false
        if (!this.cpuTicks.contentEquals(other.cpuTicks)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.cpuTicks.contentHashCode()
    }
}

// net/ifMib.h
public data class Ifmibdata(
    /**
     * Name of interface
     */
    public var ifmdName: UByteArray = UByteArray((IFNAMSIZ).toInt()),
    /**
     * Number of promiscuous listeners
     */
    public var ifmdPcount: CUint = 0u,
    /**
     * Interface flags
     */
    public var ifmdFlags: CUint = 0u,
    /**
     * Instantaneous length of send queue
     */
    public var ifmdSndLen: CUint = 0u,
    /**
     * Maximum length of send queue
     */
    public var ifmdSndMaxlen: CUint = 0u,
    /**
     * Number of drops in send queue
     */
    public var ifmdSndDrops: CUint = 0u,
    /**
     * For future expansion
     */
    public var ifmdFiller: UIntArray = UIntArray(4),
    /**
     * Generic information and statistics
     */
    public var ifmdData: IfData64 = IfData64(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifmibdata) return false
        if (!this.ifmdName.contentEquals(other.ifmdName)) return false
        if (this.ifmdPcount != other.ifmdPcount) return false
        if (this.ifmdFlags != other.ifmdFlags) return false
        if (this.ifmdSndLen != other.ifmdSndLen) return false
        if (this.ifmdSndMaxlen != other.ifmdSndMaxlen) return false
        if (this.ifmdSndDrops != other.ifmdSndDrops) return false
        if (!this.ifmdFiller.contentEquals(other.ifmdFiller)) return false
        if (this.ifmdData != other.ifmdData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifmdName.contentHashCode()
        result = 31 * result + this.ifmdPcount.hashCode()
        result = 31 * result + this.ifmdFlags.hashCode()
        result = 31 * result + this.ifmdSndLen.hashCode()
        result = 31 * result + this.ifmdSndMaxlen.hashCode()
        result = 31 * result + this.ifmdSndDrops.hashCode()
        result = 31 * result + this.ifmdFiller.contentHashCode()
        result = 31 * result + this.ifmdData.hashCode()
        return result
    }
}

public data class IfsIso88023(
    public var dot3StatsAlignmentErrors: UInt = 0u,
    public var dot3StatsFCSErrors: UInt = 0u,
    public var dot3StatsSingleCollisionFrames: UInt = 0u,
    public var dot3StatsMultipleCollisionFrames: UInt = 0u,
    public var dot3StatsSQETestErrors: UInt = 0u,
    public var dot3StatsDeferredTransmissions: UInt = 0u,
    public var dot3StatsLateCollisions: UInt = 0u,
    public var dot3StatsExcessiveCollisions: UInt = 0u,
    public var dot3StatsInternalMacTransmitErrors: UInt = 0u,
    public var dot3StatsCarrierSenseErrors: UInt = 0u,
    public var dot3StatsFrameTooLongs: UInt = 0u,
    public var dot3StatsInternalMacReceiveErrors: UInt = 0u,
    public var dot3StatsEtherChipSet: UInt = 0u,
    public var dot3StatsMissedFrames: UInt = 0u,
    public var dot3StatsCollFrequencies: UIntArray = UIntArray(16),
    public var dot3Compliance: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IfsIso88023) return false
        if (this.dot3StatsAlignmentErrors != other.dot3StatsAlignmentErrors) return false
        if (this.dot3StatsFCSErrors != other.dot3StatsFCSErrors) return false
        if (this.dot3StatsSingleCollisionFrames != other.dot3StatsSingleCollisionFrames) return false
        if (this.dot3StatsMultipleCollisionFrames != other.dot3StatsMultipleCollisionFrames) return false
        if (this.dot3StatsSQETestErrors != other.dot3StatsSQETestErrors) return false
        if (this.dot3StatsDeferredTransmissions != other.dot3StatsDeferredTransmissions) return false
        if (this.dot3StatsLateCollisions != other.dot3StatsLateCollisions) return false
        if (this.dot3StatsExcessiveCollisions != other.dot3StatsExcessiveCollisions) return false
        if (this.dot3StatsInternalMacTransmitErrors != other.dot3StatsInternalMacTransmitErrors) return false
        if (this.dot3StatsCarrierSenseErrors != other.dot3StatsCarrierSenseErrors) return false
        if (this.dot3StatsFrameTooLongs != other.dot3StatsFrameTooLongs) return false
        if (this.dot3StatsInternalMacReceiveErrors != other.dot3StatsInternalMacReceiveErrors) return false
        if (this.dot3StatsEtherChipSet != other.dot3StatsEtherChipSet) return false
        if (this.dot3StatsMissedFrames != other.dot3StatsMissedFrames) return false
        if (!this.dot3StatsCollFrequencies.contentEquals(other.dot3StatsCollFrequencies)) return false
        if (this.dot3Compliance != other.dot3Compliance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot3StatsAlignmentErrors.hashCode()
        result = 31 * result + this.dot3StatsFCSErrors.hashCode()
        result = 31 * result + this.dot3StatsSingleCollisionFrames.hashCode()
        result = 31 * result + this.dot3StatsMultipleCollisionFrames.hashCode()
        result = 31 * result + this.dot3StatsSQETestErrors.hashCode()
        result = 31 * result + this.dot3StatsDeferredTransmissions.hashCode()
        result = 31 * result + this.dot3StatsLateCollisions.hashCode()
        result = 31 * result + this.dot3StatsExcessiveCollisions.hashCode()
        result = 31 * result + this.dot3StatsInternalMacTransmitErrors.hashCode()
        result = 31 * result + this.dot3StatsCarrierSenseErrors.hashCode()
        result = 31 * result + this.dot3StatsFrameTooLongs.hashCode()
        result = 31 * result + this.dot3StatsInternalMacReceiveErrors.hashCode()
        result = 31 * result + this.dot3StatsEtherChipSet.hashCode()
        result = 31 * result + this.dot3StatsMissedFrames.hashCode()
        result = 31 * result + this.dot3StatsCollFrequencies.contentHashCode()
        result = 31 * result + this.dot3Compliance.hashCode()
        return result
    }
}

// kernControl.h
public data class CtlInfo(public var ctlId: UInt = 0u, public var ctlName: UByteArray = UByteArray((MAX_KCTL_NAME).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtlInfo) return false
        if (this.ctlId != other.ctlId) return false
        if (!this.ctlName.contentEquals(other.ctlName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ctlId.hashCode()
        result = 31 * result + this.ctlName.contentHashCode()
        return result
    }
}

// sys/procInfo.h
public data class ProcFdinfo(public var procFd: Int = 0, public var procFdtype: UInt = 0u)

public data class Kevent(
    public var ident: UintptrT = 0uL,
    public var filter: Short = 0,
    public var flags: UShort = 0u,
    public var fflags: UInt = 0u,
    public var data: IntptrT = 0L,
    public var udata: COpaquePointer? = null,
)

public data class SemidDs(
    // Note the manpage shows different types than the system header.
    public var semPerm: IpcPerm = IpcPerm(),
    public var semBase: Int = 0,
    public var semNsems: CUshort = 0u,
    public var semOtime: TimeT = 0L,
    public var semPad1: Int = 0,
    public var semCtime: TimeT = 0L,
    public var semPad2: Int = 0,
    public var semPad3: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemidDs) return false
        if (this.semPerm != other.semPerm) return false
        if (this.semBase != other.semBase) return false
        if (this.semNsems != other.semNsems) return false
        if (this.semOtime != other.semOtime) return false
        if (this.semPad1 != other.semPad1) return false
        if (this.semCtime != other.semCtime) return false
        if (this.semPad2 != other.semPad2) return false
        if (!this.semPad3.contentEquals(other.semPad3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.semPerm.hashCode()
        result = 31 * result + this.semBase.hashCode()
        result = 31 * result + this.semNsems.hashCode()
        result = 31 * result + this.semOtime.hashCode()
        result = 31 * result + this.semPad1.hashCode()
        result = 31 * result + this.semCtime.hashCode()
        result = 31 * result + this.semPad2.hashCode()
        result = 31 * result + this.semPad3.contentHashCode()
        return result
    }
}

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    public var shmLpid: PidT = 0,
    public var shmCpid: PidT = 0,
    public var shmNattch: ShmattT = 0u,
    public var shmAtime: TimeT = 0L,
    // Note(macos): 64-bit wrong align => wrong offset
    public var shmDtime: TimeT = 0L,
    // Note(macos): 64-bit wrong align => wrong offset
    public var shmCtime: TimeT = 0L,
    // Note(macos): 64-bit wrong align => wrong offset
    // Note: 64-bit wrong align => wrong offset:
    public var shmInternal: COpaquePointer? = null,
)

public data class ProcThreadinfo(
    public var pthUserTime: ULong = 0uL,
    public var pthSystemTime: ULong = 0uL,
    public var pthCpuUsage: Int = 0,
    public var pthPolicy: Int = 0,
    public var pthRunState: Int = 0,
    public var pthFlags: Int = 0,
    public var pthSleepTime: Int = 0,
    public var pthCurpri: Int = 0,
    public var pthPriority: Int = 0,
    public var pthMaxpriority: Int = 0,
    public var pthName: UByteArray = UByteArray((MAXTHREADNAMESIZE).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcThreadinfo) return false
        if (this.pthUserTime != other.pthUserTime) return false
        if (this.pthSystemTime != other.pthSystemTime) return false
        if (this.pthCpuUsage != other.pthCpuUsage) return false
        if (this.pthPolicy != other.pthPolicy) return false
        if (this.pthRunState != other.pthRunState) return false
        if (this.pthFlags != other.pthFlags) return false
        if (this.pthSleepTime != other.pthSleepTime) return false
        if (this.pthCurpri != other.pthCurpri) return false
        if (this.pthPriority != other.pthPriority) return false
        if (this.pthMaxpriority != other.pthMaxpriority) return false
        if (!this.pthName.contentEquals(other.pthName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pthUserTime.hashCode()
        result = 31 * result + this.pthSystemTime.hashCode()
        result = 31 * result + this.pthCpuUsage.hashCode()
        result = 31 * result + this.pthPolicy.hashCode()
        result = 31 * result + this.pthRunState.hashCode()
        result = 31 * result + this.pthFlags.hashCode()
        result = 31 * result + this.pthSleepTime.hashCode()
        result = 31 * result + this.pthCurpri.hashCode()
        result = 31 * result + this.pthPriority.hashCode()
        result = 31 * result + this.pthMaxpriority.hashCode()
        result = 31 * result + this.pthName.contentHashCode()
        return result
    }
}

public class Statfs(
    public var fBsize: UInt = 0u,
    public var fIosize: Int = 0,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fOwner: UidT = 0u,
    public var fType: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var fFssubtype: UInt = 0u,
    public var fFstypename: UByteArray = UByteArray(16),
    public var fMntonname: UByteArray = UByteArray(1024),
    public var fMntfromname: UByteArray = UByteArray(1024),
    public var fFlagsExt: UInt = 0u,
    public var fReserved: UIntArray = UIntArray(7),
)

public data class Dirent(
    public var dIno: ULong = 0uL,
    public var dSeekoff: ULong = 0uL,
    public var dReclen: UShort = 0u,
    public var dNamlen: UShort = 0u,
    public var dType: UByte = 0u,
    public var dName: UByteArray = UByteArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dSeekoff != other.dSeekoff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dNamlen != other.dNamlen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dSeekoff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class SockaddrStorage(
    public var ssLen: UByte = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssAlign: Long = 0L,
    public var ssPad2: UByteArray = UByteArray(112),
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

public data class Utmpx(
    public var utUser: UByteArray = UByteArray((UTX_USERSIZE).toInt()),
    public var utId: UByteArray = UByteArray((UTX_IDSIZE).toInt()),
    public var utLine: UByteArray = UByteArray((UTX_LINESIZE).toInt()),
    public var utPid: PidT = 0,
    public var utType: CShort = 0,
    public var utTv: Timeval = Timeval(),
    public var utHost: UByteArray = UByteArray((UTX_HOSTSIZE).toInt()),
    public var utPad: UIntArray = UIntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (this.utPid != other.utPid) return false
        if (this.utType != other.utType) return false
        if (this.utTv != other.utTv) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (!this.utPad.contentEquals(other.utPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utUser.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utType.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utPad.contentHashCode()
        return result
    }
}

public data class Sigevent(
    public var sigevNotify: CInt = 0,
    public var sigevSigno: CInt = 0,
    public var sigevValue: Sigval = Sigval(),
    public var unused1: COpaquePointer? = null,
    // actually a function pointer
    public var sigevNotifyAttributes: PthreadAttrT? = null,
)

public data class ProcessorCpuLoadInfo(public var cpuTicks: UIntArray = UIntArray(CPU_STATE_MAX.toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessorCpuLoadInfo) return false
        if (!this.cpuTicks.contentEquals(other.cpuTicks)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.cpuTicks.contentHashCode()
    }
}

public data class ProcessorBasicInfo(
    public var cpuType: CpuTypeT = 0,
    public var cpuSubtype: CpuSubtypeT = 0,
    public var running: BooleanT = 0,
    public var slotNum: CInt = 0,
    public var isMaster: BooleanT = 0,
)

public data class ProcessorSetBasicInfo(public var processorCount: CInt = 0, public var defaultPolicy: CInt = 0)

public data class ProcessorSetLoadInfo(
    public var taskCount: CInt = 0,
    public var threadCount: CInt = 0,
    public var loadAverage: IntegerT = 0,
    public var machFactor: IntegerT = 0,
)

public data class TimeValueT(public var seconds: IntegerT = 0, public var microseconds: IntegerT = 0)

public data class ThreadBasicInfo(
    public var userTime: TimeValueT = TimeValueT(),
    public var systemTime: TimeValueT = TimeValueT(),
    public var cpuUsage: IntegerT = 0,
    public var policy: PolicyT = 0,
    public var runState: IntegerT = 0,
    public var flags: IntegerT = 0,
    public var suspendCount: IntegerT = 0,
    public var sleepTime: IntegerT = 0,
)

public data class ThreadIdentifierInfo(
    public var threadId: ULong = 0uL,
    public var threadHandle: ULong = 0uL,
    public var dispatchQaddr: ULong = 0uL,
)

public data class ThreadExtendedInfo(
    public var pthUserTime: ULong = 0uL,
    public var pthSystemTime: ULong = 0uL,
    public var pthCpuUsage: Int = 0,
    public var pthPolicy: Int = 0,
    public var pthRunState: Int = 0,
    public var pthFlags: Int = 0,
    public var pthSleepTime: Int = 0,
    public var pthCurpri: Int = 0,
    public var pthPriority: Int = 0,
    public var pthMaxpriority: Int = 0,
    public var pthName: UByteArray = UByteArray((MAXTHREADNAMESIZE).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ThreadExtendedInfo) return false
        if (this.pthUserTime != other.pthUserTime) return false
        if (this.pthSystemTime != other.pthSystemTime) return false
        if (this.pthCpuUsage != other.pthCpuUsage) return false
        if (this.pthPolicy != other.pthPolicy) return false
        if (this.pthRunState != other.pthRunState) return false
        if (this.pthFlags != other.pthFlags) return false
        if (this.pthSleepTime != other.pthSleepTime) return false
        if (this.pthCurpri != other.pthCurpri) return false
        if (this.pthPriority != other.pthPriority) return false
        if (this.pthMaxpriority != other.pthMaxpriority) return false
        if (!this.pthName.contentEquals(other.pthName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pthUserTime.hashCode()
        result = 31 * result + this.pthSystemTime.hashCode()
        result = 31 * result + this.pthCpuUsage.hashCode()
        result = 31 * result + this.pthPolicy.hashCode()
        result = 31 * result + this.pthRunState.hashCode()
        result = 31 * result + this.pthFlags.hashCode()
        result = 31 * result + this.pthSleepTime.hashCode()
        result = 31 * result + this.pthCurpri.hashCode()
        result = 31 * result + this.pthPriority.hashCode()
        result = 31 * result + this.pthMaxpriority.hashCode()
        result = 31 * result + this.pthName.contentHashCode()
        return result
    }
}

public class IfData64(
    public var ifiType: CUchar = 0u,
    public var ifiTypelen: CUchar = 0u,
    public var ifiPhysical: CUchar = 0u,
    public var ifiAddrlen: CUchar = 0u,
    public var ifiHdrlen: CUchar = 0u,
    public var ifiRecvquota: CUchar = 0u,
    public var ifiXmitquota: CUchar = 0u,
    public var ifiUnused1: CUchar = 0u,
    public var ifiMtu: UInt = 0u,
    public var ifiMetric: UInt = 0u,
    public var ifiBaudrate: ULong = 0uL,
    public var ifiIpackets: ULong = 0uL,
    public var ifiIerrors: ULong = 0uL,
    public var ifiOpackets: ULong = 0uL,
    public var ifiOerrors: ULong = 0uL,
    public var ifiCollisions: ULong = 0uL,
    public var ifiIbytes: ULong = 0uL,
    public var ifiObytes: ULong = 0uL,
    public var ifiImcasts: ULong = 0uL,
    public var ifiOmcasts: ULong = 0uL,
    public var ifiIqdrops: ULong = 0uL,
    public var ifiNoproto: ULong = 0uL,
    public var ifiRecvtiming: UInt = 0u,
    public var ifiXmittiming: UInt = 0u,
    public var ifiLastchange: Timeval32 = Timeval32(),
)

public data class IfMsghdr2(
    public var ifmMsglen: CUshort = 0u,
    public var ifmVersion: CUchar = 0u,
    public var ifmType: CUchar = 0u,
    public var ifmAddrs: CInt = 0,
    public var ifmFlags: CInt = 0,
    public var ifmIndex: CUshort = 0u,
    public var ifmSndLen: CInt = 0,
    public var ifmSndMaxlen: CInt = 0,
    public var ifmSndDrops: CInt = 0,
    public var ifmTimer: CInt = 0,
    public var ifmData: IfData64 = IfData64(),
)

public class VmStatistics64(
    public var freeCount: NaturalT = 0u,
    public var activeCount: NaturalT = 0u,
    public var inactiveCount: NaturalT = 0u,
    public var wireCount: NaturalT = 0u,
    public var zeroFillCount: ULong = 0uL,
    public var reactivations: ULong = 0uL,
    public var pageins: ULong = 0uL,
    public var pageouts: ULong = 0uL,
    public var faults: ULong = 0uL,
    public var cowFaults: ULong = 0uL,
    public var lookups: ULong = 0uL,
    public var hits: ULong = 0uL,
    public var purges: ULong = 0uL,
    public var purgeableCount: NaturalT = 0u,
    public var speculativeCount: NaturalT = 0u,
    public var decompressions: ULong = 0uL,
    public var compressions: ULong = 0uL,
    public var swapins: ULong = 0uL,
    public var swapouts: ULong = 0uL,
    public var compressorPageCount: NaturalT = 0u,
    public var throttledCount: NaturalT = 0u,
    public var externalPageCount: NaturalT = 0u,
    public var internalPageCount: NaturalT = 0u,
    public var totalUncompressedPagesInCompressor: ULong = 0uL,
)

public data class MachTaskBasicInfo(
    public var virtualSize: MachVmSizeT = 0uL,
    public var residentSize: MachVmSizeT = 0uL,
    public var residentSizeMax: MachVmSizeT = 0uL,
    public var userTime: TimeValueT = TimeValueT(),
    public var systemTime: TimeValueT = TimeValueT(),
    public var policy: PolicyT = 0,
    public var suspendCount: IntegerT = 0,
)

public data class Log2phys(
    public var l2pFlags: CUint = 0u,
    public var l2pContigbytes: OffT = 0L,
    public var l2pDevoffset: OffT = 0L,
)

public data class OsUnfairLockS(public var osUnfairLockOpaque: UInt = 0u)

public data class SockaddrVm(
    public var svmLen: CUchar = 0u,
    public var svmFamily: SaFamilyT = 0u,
    public var svmReserved1: CUshort = 0u,
    public var svmPort: CUint = 0u,
    public var svmCid: CUint = 0u,
)

public data class Ifdevmtu(
    public var ifdmCurrent: CInt = 0,
    public var ifdmMin: CInt = 0,
    public var ifdmMax: CInt = 0,
)

public data class Ifkpi(
    public var ifkModuleId: CUint = 0u,
    public var ifkType: CUint = 0u,
    public var ifkData: CAnonymousIfkData = CAnonymousIfkData(),
)

public data class Ifreq(public var ifrName: UByteArray = UByteArray((IFNAMSIZ).toInt()), public var ifrIfru: CAnonymousIfrIfru = CAnonymousIfrIfru()) {
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

public data class In6Ifreq(public var ifrName: UByteArray = UByteArray((IFNAMSIZ).toInt()), public var ifrIfru: CAnonymousIfrIfru6 = CAnonymousIfrIfru6()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is In6Ifreq) return false
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

public data class Ifconf(public var ifcLen: CInt = 0, public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu()) {
    public fun eq(other: Ifconf): Boolean {
        val lenPtr1 = this.ifcLen
        val lenPtr2 = other.ifcLen
        val ifcuPtr1 = this.ifcIfcu
        val ifcuPtr2 = other.ifcIfcu
        // SAFETY: `ifconf` implements `Copy` so the reads are valid
        val len1 = lenPtr1
        val len2 = lenPtr2
        val ifcu1 = ifcuPtr1
        val ifcu2 = ifcuPtr2
        return len1 == len2 && ifcu1 == ifcu2
    }
}

public data class CAnonymousIfkData(public var ifkPtr: COpaquePointer? = null, public var ifkValue: CInt = 0) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifk_data").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfkData): Boolean {
        return this.ifkPtr == other.ifkPtr && this.ifkValue == other.ifkValue
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.ifkPtr).hashCode()
            state = 31 * state + (this.ifkValue).hashCode()
        }
        return state
    }
}

public data class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr = Sockaddr(),
    public var ifruDstaddr: Sockaddr = Sockaddr(),
    public var ifruBroadaddr: Sockaddr = Sockaddr(),
    public var ifruFlags: CShort = 0,
    public var ifruMetrics: CInt = 0,
    public var ifruMtu: CInt = 0,
    public var ifruPhys: CInt = 0,
    public var ifruMedia: CInt = 0,
    public var ifruIntval: CInt = 0,
    public var ifruData: COpaquePointer? = null,
    public var ifruDevmtu: Ifdevmtu = Ifdevmtu(),
    public var ifruKpi: Ifkpi = Ifkpi(),
    public var ifruWakeFlags: UInt = 0u,
    public var ifruRouteRefcnt: UInt = 0u,
    public var ifruCap: IntArray = IntArray(2),
    public var ifruFunctionalType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruFlags != other.ifruFlags) return false
        if (this.ifruMetrics != other.ifruMetrics) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruPhys != other.ifruPhys) return false
        if (this.ifruMedia != other.ifruMedia) return false
        if (this.ifruIntval != other.ifruIntval) return false
        if (this.ifruData != other.ifruData) return false
        if (this.ifruDevmtu != other.ifruDevmtu) return false
        if (this.ifruKpi != other.ifruKpi) return false
        if (this.ifruWakeFlags != other.ifruWakeFlags) return false
        if (this.ifruRouteRefcnt != other.ifruRouteRefcnt) return false
        if (!this.ifruCap.contentEquals(other.ifruCap)) return false
        if (this.ifruFunctionalType != other.ifruFunctionalType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruFlags.hashCode()
        result = 31 * result + this.ifruMetrics.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruPhys.hashCode()
        result = 31 * result + this.ifruMedia.hashCode()
        result = 31 * result + this.ifruIntval.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruDevmtu.hashCode()
        result = 31 * result + this.ifruKpi.hashCode()
        result = 31 * result + this.ifruWakeFlags.hashCode()
        result = 31 * result + this.ifruRouteRefcnt.hashCode()
        result = 31 * result + this.ifruCap.contentHashCode()
        result = 31 * result + this.ifruFunctionalType.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfrIfru): Boolean {
        return this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruBroadaddr == other.ifruBroadaddr && this.ifruFlags == other.ifruFlags && this.ifruMetrics == other.ifruMetrics && this.ifruMtu == other.ifruMtu && this.ifruPhys == other.ifruPhys && this.ifruMedia == other.ifruMedia && this.ifruIntval == other.ifruIntval && this.ifruData == other.ifruData && this.ifruDevmtu == other.ifruDevmtu && this.ifruKpi == other.ifruKpi && this.ifruWakeFlags == other.ifruWakeFlags && this.ifruRouteRefcnt == other.ifruRouteRefcnt && this.ifruCap.zip(other.ifruCap).all({ (a, b) -> a == b }) && this.ifruFunctionalType == other.ifruFunctionalType
    }
}

public data class CAnonymousIfcIfcu(public var ifcuBuf: COpaquePointer? = null, public var ifcuReq: Ifreq? = null) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifc_ifcu").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfcIfcu): Boolean {
        return this.ifcuBuf == other.ifcuBuf && this.ifcuReq == other.ifcuReq
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.ifcuBuf).hashCode()
        state = 31 * state + (this.ifcuReq).hashCode()
        return state
    }
}

public data class CAnonymousIfrIfru6(
    public var ifruAddr: SockaddrIn6 = SockaddrIn6(),
    public var ifruDstaddr: SockaddrIn6 = SockaddrIn6(),
    public var ifruFlags: CInt = 0,
    public var ifruFlags6: CInt = 0,
    public var ifruMetrics: CInt = 0,
    public var ifruIntval: CInt = 0,
    public var ifruData: COpaquePointer? = null,
    public var ifruLifetime: In6Addrlifetime = In6Addrlifetime(),
    public var ifruStat: In6Ifstat = In6Ifstat(),
    public var ifruIcmp6stat: Icmp6Ifstat = Icmp6Ifstat(),
    public var ifruScopeId: UIntArray = UIntArray(SCOPE6_ID_MAX.toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru6) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruFlags != other.ifruFlags) return false
        if (this.ifruFlags6 != other.ifruFlags6) return false
        if (this.ifruMetrics != other.ifruMetrics) return false
        if (this.ifruIntval != other.ifruIntval) return false
        if (this.ifruData != other.ifruData) return false
        if (this.ifruLifetime != other.ifruLifetime) return false
        if (this.ifruStat != other.ifruStat) return false
        if (this.ifruIcmp6stat != other.ifruIcmp6stat) return false
        if (!this.ifruScopeId.contentEquals(other.ifruScopeId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruFlags.hashCode()
        result = 31 * result + this.ifruFlags6.hashCode()
        result = 31 * result + this.ifruMetrics.hashCode()
        result = 31 * result + this.ifruIntval.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruLifetime.hashCode()
        result = 31 * result + this.ifruStat.hashCode()
        result = 31 * result + this.ifruIcmp6stat.hashCode()
        result = 31 * result + this.ifruScopeId.contentHashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru6").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfrIfru6): Boolean {
        return this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruFlags == other.ifruFlags && this.ifruFlags6 == other.ifruFlags6 && this.ifruMetrics == other.ifruMetrics && this.ifruIntval == other.ifruIntval && this.ifruData == other.ifruData && this.ifruScopeId.zip(other.ifruScopeId).all({ (a, b) -> a == b })
    }
}

public data class Semun(
    public var value: CInt = 0,
    public var buf: SemidDs? = null,
    public var array: CUshort? = null,
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "semun").finishNonExhaustive()
    }

    public fun eq(other: Semun): Boolean {
        return this.value == other.value
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.value).hashCode()
        return state
    }
}
