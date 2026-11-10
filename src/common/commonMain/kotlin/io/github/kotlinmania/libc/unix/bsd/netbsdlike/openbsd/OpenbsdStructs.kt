@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

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
import io.github.kotlinmania.libc.new.openbsd.sys.ipc.IpcPerm
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.BlkcntT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.InoT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.NlinkT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.TimeT

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

public data class IpMreqn(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrAddress: InAddr = InAddr(),
    public var imrIfindex: CInt = 0,
)

public data class GlobT(
    public var glPathc: SizeT = 0uL,
    public var glMatchc: SizeT = 0uL,
    public var glOffs: SizeT = 0uL,
    public var glFlags: CInt = 0,
    public var glPathv: COpaquePointer? = null,
    public var unused1: COpaquePointer? = null,
    public var unused2: COpaquePointer? = null,
    public var unused3: COpaquePointer? = null,
    public var unused4: COpaquePointer? = null,
    public var unused5: COpaquePointer? = null,
    public var unused6: COpaquePointer? = null,
    public var unused7: COpaquePointer? = null,
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

public data class UfsArgs(public var fspec: COpaquePointer? = null, public var exportInfo: ExportArgs = ExportArgs())

public data class MfsArgs(
    public var fspec: COpaquePointer? = null,
    public var exportInfo: ExportArgs = ExportArgs(),
    // https://github.com/openbsd/src/blob/HEAD/sys/sys/types.h#L134
    public var base: COpaquePointer? = null,
    public var size: CUlong = 0uL,
)

public data class IsoArgs(
    public var fspec: COpaquePointer? = null,
    public var exportInfo: ExportArgs = ExportArgs(),
    public var flags: CInt = 0,
    public var sess: CInt = 0,
)

public class NfsArgs(
    public var version: CInt = 0,
    public var addr: Sockaddr? = null,
    public var addrlen: CInt = 0,
    public var sotype: CInt = 0,
    public var proto: CInt = 0,
    public var fh: COpaquePointer? = null,
    public var fhsize: CInt = 0,
    public var flags: CInt = 0,
    public var wsize: CInt = 0,
    public var rsize: CInt = 0,
    public var readdirsize: CInt = 0,
    public var timeo: CInt = 0,
    public var retrans: CInt = 0,
    public var maxgrouplist: CInt = 0,
    public var readahead: CInt = 0,
    public var leaseterm: CInt = 0,
    public var deadthresh: CInt = 0,
    public var hostname: COpaquePointer? = null,
    public var acregmin: CInt = 0,
    public var acregmax: CInt = 0,
    public var acdirmin: CInt = 0,
    public var acdirmax: CInt = 0,
)

public data class MsdosfsArgs(
    public var fspec: COpaquePointer? = null,
    public var exportInfo: ExportArgs = ExportArgs(),
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var mask: ModeT = 0u,
    public var flags: CInt = 0,
)

public data class NtfsArgs(
    public var fspec: COpaquePointer? = null,
    public var exportInfo: ExportArgs = ExportArgs(),
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var flag: CUlong = 0uL,
)

public data class UdfArgs(public var fspec: COpaquePointer? = null, public var lastblock: UInt = 0u)

public data class TmpfsArgs(
    public var taVersion: CInt = 0,
    public var taNodesMax: InoT = 0uL,
    public var taSizeMax: OffT = 0L,
    public var taRootUid: UidT = 0u,
    public var taRootGid: GidT = 0u,
    public var taRootMode: ModeT = 0u,
)

public data class FusefsArgs(
    public var name: COpaquePointer? = null,
    public var fd: CInt = 0,
    public var maxRead: CInt = 0,
    public var allowOther: CInt = 0,
)

public data class Xucred(
    public var crUid: UidT = 0u,
    public var crGid: GidT = 0u,
    public var crNgroups: CShort = 0,
    // https://github.com/openbsd/src/blob/HEAD/sys/sys/syslimits.h#L44
    public var crGroups: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xucred) return false
        if (this.crUid != other.crUid) return false
        if (this.crGid != other.crGid) return false
        if (this.crNgroups != other.crNgroups) return false
        if (!this.crGroups.contentEquals(other.crGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crUid.hashCode()
        result = 31 * result + this.crGid.hashCode()
        result = 31 * result + this.crNgroups.hashCode()
        result = 31 * result + this.crGroups.contentHashCode()
        return result
    }
}

public data class ExportArgs(
    public var exFlags: CInt = 0,
    public var exRoot: UidT = 0u,
    public var exAnon: Xucred = Xucred(),
    public var exAddr: Sockaddr? = null,
    public var exAddrlen: CInt = 0,
    public var exMask: Sockaddr? = null,
    public var exMasklen: CInt = 0,
)

public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

public data class InAddr(public var sAddr: InAddrT = 0u)

public data class SockaddrIn(
    public var sinLen: UByte = 0u,
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: ByteArray = ByteArray(8),
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

public data class Splice(
    public var spFd: CInt = 0,
    public var spMax: OffT = 0L,
    public var spIdle: Timeval = Timeval(),
)

public data class Kevent(
    public var ident: UintptrT = 0uL,
    public var filter: CShort = 0,
    public var flags: CUshort = 0u,
    public var fflags: CUint = 0u,
    public var data: Long = 0L,
    public var udata: COpaquePointer? = null,
)

public class Stat(
    public var stMode: ModeT = 0u,
    public var stDev: DevT = 0,
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stSize: OffT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stFlags: UInt = 0u,
    public var stGen: UInt = 0u,
    public var stBirthtime: TimeT = 0L,
    public var stBirthtimeNsec: CLong = 0L,
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
)

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

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
)

public class IfData(
    public var ifiType: CUchar = 0u,
    public var ifiAddrlen: CUchar = 0u,
    public var ifiHdrlen: CUchar = 0u,
    public var ifiLinkState: CUchar = 0u,
    public var ifiMtu: UInt = 0u,
    public var ifiMetric: UInt = 0u,
    public var ifiRdomain: UInt = 0u,
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
    public var ifiOqdrops: ULong = 0uL,
    public var ifiNoproto: ULong = 0uL,
    public var ifiCapabilities: UInt = 0u,
    public var ifiLastchange: Timeval = Timeval(),
)

public data class IfMsghdr(
    public var ifmMsglen: CUshort = 0u,
    public var ifmVersion: CUchar = 0u,
    public var ifmType: CUchar = 0u,
    public var ifmHdrlen: CUshort = 0u,
    public var ifmIndex: CUshort = 0u,
    public var ifmTableid: CUshort = 0u,
    public var ifmPad1: CUchar = 0u,
    public var ifmPad2: CUchar = 0u,
    public var ifmAddrs: CInt = 0,
    public var ifmFlags: CInt = 0,
    public var ifmXflags: CInt = 0,
    public var ifmData: IfData = IfData(),
)

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: CUchar = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: CUchar = 0u,
    public var sdlNlen: CUchar = 0u,
    public var sdlAlen: CUchar = 0u,
    public var sdlSlen: CUchar = 0u,
    public var sdlData: UByteArray = UByteArray(24),
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

public data class Sockpeercred(
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var pid: PidT = 0,
)

public data class Arphdr(
    public var arHrd: UShort = 0u,
    public var arPro: UShort = 0u,
    public var arHln: UByte = 0u,
    public var arPln: UByte = 0u,
    public var arOp: UShort = 0u,
)

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: CInt = 0,
    public var shmLpid: PidT = 0,
    public var shmCpid: PidT = 0,
    public var shmNattch: CShort = 0,
    public var shmAtime: TimeT = 0L,
    public var shmAtimensec: CLong = 0L,
    public var shmDtime: TimeT = 0L,
    public var shmDtimensec: CLong = 0L,
    public var shmCtime: TimeT = 0L,
    public var shmCtimensec: CLong = 0L,
    public var shmInternal: COpaquePointer? = null,
)

// elf.h
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

// link.h
public data class DlPhdrInfo(
    public var dlpiAddr: ElfAddr = 0u,
    public var dlpiName: COpaquePointer? = null,
    public var dlpiPhdr: Elf64Phdr? = null,
    public var dlpiPhnum: ElfHalf = 0u,
)

// sys/sysctl.h
public class KinfoProc {
    public var pForw: ULong = 0uL

    public var pBack: ULong = 0uL

    public var pPaddr: ULong = 0uL

    public var pAddr: ULong = 0uL

    public var pFd: ULong = 0uL

    public var pStats: ULong = 0uL

    public var pLimit: ULong = 0uL

    public var pVmspace: ULong = 0uL

    public var pSigacts: ULong = 0uL

    public var pSess: ULong = 0uL

    public var pTsess: ULong = 0uL

    public var pRu: ULong = 0uL

    public var pEflag: Int = 0

    public var pExitsig: Int = 0

    public var pFlag: Int = 0

    public var pPid: Int = 0

    public var pPpid: Int = 0

    public var pSid: Int = 0

    public var pPgid: Int = 0

    public var pTpgid: Int = 0

    public var pUid: UInt = 0u

    public var pRuid: UInt = 0u

    public var pGid: UInt = 0u

    public var pRgid: UInt = 0u

    public var pGroups: UIntArray = UIntArray(KI_NGROUPS)

    public var pNgroups: Short = 0

    public var pJobc: Short = 0

    public var pTdev: UInt = 0u

    public var pEstcpu: UInt = 0u

    public var pRtimeSec: UInt = 0u

    public var pRtimeUsec: UInt = 0u

    public var pCpticks: Int = 0

    public var pPctcpu: UInt = 0u

    public var pSwtime: UInt = 0u

    public var pSlptime: UInt = 0u

    public var pSchedflags: Int = 0

    public var pUticks: ULong = 0uL

    public var pSticks: ULong = 0uL

    public var pIticks: ULong = 0uL

    public var pTracep: ULong = 0uL

    public var pTraceflag: Int = 0

    public var pHoldcnt: Int = 0

    public var pSiglist: Int = 0

    public var pSigmask: UInt = 0u

    public var pSigignore: UInt = 0u

    public var pSigcatch: UInt = 0u

    public var pStat: Byte = 0

    public var pPriority: UByte = 0u

    public var pUsrpri: UByte = 0u

    public var pNice: UByte = 0u

    public var pXstat: UShort = 0u

    public var pSpare: UShort = 0u

    public var pComm: UByteArray = UByteArray(KI_MAXCOMLEN)

    public var pWmesg: UByteArray = UByteArray(KI_WMESGLEN)

    public var pWchan: ULong = 0uL

    public var pLogin: UByteArray = UByteArray(KI_MAXLOGNAME)

    public var pVmRssize: Int = 0

    public var pVmTsize: Int = 0

    public var pVmDsize: Int = 0

    public var pVmSsize: Int = 0

    public var pUvalid: Long = 0L

    public var pUstartSec: ULong = 0uL

    public var pUstartUsec: UInt = 0u

    public var pUutimeSec: UInt = 0u

    public var pUutimeUsec: UInt = 0u

    public var pUstimeSec: UInt = 0u

    public var pUstimeUsec: UInt = 0u

    public var pUruMaxrss: ULong = 0uL

    public var pUruIxrss: ULong = 0uL

    public var pUruIdrss: ULong = 0uL

    public var pUruIsrss: ULong = 0uL

    public var pUruMinflt: ULong = 0uL

    public var pUruMajflt: ULong = 0uL

    public var pUruNswap: ULong = 0uL

    public var pUruInblock: ULong = 0uL

    public var pUruOublock: ULong = 0uL

    public var pUruMsgsnd: ULong = 0uL

    public var pUruMsgrcv: ULong = 0uL

    public var pUruNsignals: ULong = 0uL

    public var pUruNvcsw: ULong = 0uL

    public var pUruNivcsw: ULong = 0uL

    public var pUctimeSec: UInt = 0u

    public var pUctimeUsec: UInt = 0u

    public var pPsflags: UInt = 0u

    public var pAcflag: UInt = 0u

    public var pSvuid: UInt = 0u

    public var pSvgid: UInt = 0u

    public var pEmul: UByteArray = UByteArray(KI_EMULNAMELEN)

    public var pRlimRssCur: ULong = 0uL

    public var pCpuid: ULong = 0uL

    public var pVmMapSize: ULong = 0uL

    public var pTid: Int = 0

    public var pRtableid: UInt = 0u

    public var pPledge: ULong = 0uL

    public var pName: UByteArray = UByteArray(KI_MAXCOMLEN)
}

public data class KinfoVmentry(
    public var kveStart: CUlong = 0uL,
    public var kveEnd: CUlong = 0uL,
    public var kveGuard: CUlong = 0uL,
    public var kveFspace: CUlong = 0uL,
    public var kveFspaceAugment: CUlong = 0uL,
    public var kveOffset: ULong = 0uL,
    public var kveWiredCount: CInt = 0,
    public var kveEtype: CInt = 0,
    public var kveProtection: CInt = 0,
    public var kveMaxProtection: CInt = 0,
    public var kveAdvice: CInt = 0,
    public var kveInheritance: CInt = 0,
    public var kveFlags: UByte = 0u,
)

public data class PtraceState(
    public var peReportEvent: CInt = 0,
    public var peOtherPid: PidT = 0,
    public var peTid: PidT = 0,
)

public data class PtraceThreadState(public var ptsTid: PidT = 0, public var ptsName: UByteArray = UByteArray(PT_PTS_NAMELEN)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceThreadState) return false
        if (this.ptsTid != other.ptsTid) return false
        if (!this.ptsName.contentEquals(other.ptsName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptsTid.hashCode()
        result = 31 * result + this.ptsName.contentHashCode()
        return result
    }
}

// search.h
public data class Entry(public var key: COpaquePointer? = null, public var data: COpaquePointer? = null)

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

public class TcpInfo(
    public var tcpiState: UByte = 0u,
    public var tcpiCaState: UByte = 0u,
    public var tcpiRetransmits: UByte = 0u,
    public var tcpiProbes: UByte = 0u,
    public var tcpiBackoff: UByte = 0u,
    public var tcpiOptions: UByte = 0u,
    public var tcpiSndWscale: UByte = 0u,
    public var tcpiRcvWscale: UByte = 0u,
    public var tcpiRto: UInt = 0u,
    public var tcpiAto: UInt = 0u,
    public var tcpiSndMss: UInt = 0u,
    public var tcpiRcvMss: UInt = 0u,
    public var tcpiUnacked: UInt = 0u,
    public var tcpiSacked: UInt = 0u,
    public var tcpiLost: UInt = 0u,
    public var tcpiRetrans: UInt = 0u,
    public var tcpiFackets: UInt = 0u,
    public var tcpiLastDataSent: UInt = 0u,
    public var tcpiLastAckSent: UInt = 0u,
    public var tcpiLastDataRecv: UInt = 0u,
    public var tcpiLastAckRecv: UInt = 0u,
    public var tcpiPmtu: UInt = 0u,
    public var tcpiRcvSsthresh: UInt = 0u,
    public var tcpiRtt: UInt = 0u,
    public var tcpiRttvar: UInt = 0u,
    public var tcpiSndSsthresh: UInt = 0u,
    public var tcpiSndCwnd: UInt = 0u,
    public var tcpiAdvmss: UInt = 0u,
    public var tcpiReordering: UInt = 0u,
    public var tcpiRcvRtt: UInt = 0u,
    public var tcpiRcvSpace: UInt = 0u,
    public var tcpiSndWnd: UInt = 0u,
    public var tcpiSndNxt: UInt = 0u,
    public var tcpiRcvNxt: UInt = 0u,
    public var tcpiToeTid: UInt = 0u,
    public var tcpiSndRexmitpack: UInt = 0u,
    public var tcpiRcvOoopack: UInt = 0u,
    public var tcpiSndZerowin: UInt = 0u,
    public var tcpiRttmin: UInt = 0u,
    public var tcpiMaxSndwnd: UInt = 0u,
    public var tcpiRcvAdv: UInt = 0u,
    public var tcpiRcvUp: UInt = 0u,
    public var tcpiSndUna: UInt = 0u,
    public var tcpiSndUp: UInt = 0u,
    public var tcpiSndWl1: UInt = 0u,
    public var tcpiSndWl2: UInt = 0u,
    public var tcpiSndMax: UInt = 0u,
    public var tcpiTsRecent: UInt = 0u,
    public var tcpiTsRecentAge: UInt = 0u,
    public var tcpiRfbufCnt: UInt = 0u,
    public var tcpiRfbufTs: UInt = 0u,
    public var tcpiSoRcvSbCc: UInt = 0u,
    public var tcpiSoRcvSbHiwat: UInt = 0u,
    public var tcpiSoRcvSbLowat: UInt = 0u,
    public var tcpiSoRcvSbWat: UInt = 0u,
    public var tcpiSoSndSbCc: UInt = 0u,
    public var tcpiSoSndSbHiwat: UInt = 0u,
    public var tcpiSoSndSbLowat: UInt = 0u,
    public var tcpiSoSndSbWat: UInt = 0u,
)

public data class Dirent(
    public var dFileno: InoT = 0uL,
    public var dOff: OffT = 0L,
    public var dReclen: UShort = 0u,
    public var dType: UByte = 0u,
    public var dNamlen: UByte = 0u,
    public var dPadding: UByteArray = UByteArray(4),
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dFileno != other.dFileno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (this.dNamlen != other.dNamlen) return false
        if (!this.dPadding.contentEquals(other.dPadding)) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dFileno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dPadding.contentHashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class SockaddrStorage(
    public var ssLen: UByte = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssPad2: Long = 0L,
    public var ssPad3: UByteArray = UByteArray(240),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssLen != other.ssLen) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssPad2 != other.ssPad2) return false
        if (!this.ssPad3.contentEquals(other.ssPad3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssLen.hashCode()
        result = 31 * result + this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssPad2.hashCode()
        result = 31 * result + this.ssPad3.contentHashCode()
        return result
    }
}

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siErrno: CInt = 0,
    public var siAddr: COpaquePointer? = null,
    public var pad: UByteArray = UByteArray(108),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siAddr != other.siAddr) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siAddr.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public fun siCode(): CInt {
        return this.siCode
    }

    public fun siErrno(): CInt {
        return this.siErrno
    }

    public fun siPid(): PidT {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siCode: CInt = 0,
            public var siErrno: CInt = 0,
            public var pad: IntArray = IntArray(SI_PAD.toInt()),
            public var pid: PidT = 0,
        ) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is SiginfoTimer) return false
                if (this.siSigno != other.siSigno) return false
                if (this.siCode != other.siCode) return false
                if (this.siErrno != other.siErrno) return false
                if (!this.pad.contentEquals(other.pad)) return false
                if (this.pid != other.pid) return false
                return true
            }

            override fun hashCode(): Int {
                var result = this.siSigno.hashCode()
                result = 31 * result + this.siCode.hashCode()
                result = 31 * result + this.siErrno.hashCode()
                result = 31 * result + this.pad.contentHashCode()
                result = 31 * result + this.pid.hashCode()
                return result
            }
        }
        return (((((this as Any?) as SiginfoT?)) as Any?) as SiginfoTimer?)!!.pid
    }

    public fun siUid(): UidT {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siCode: CInt = 0,
            public var siErrno: CInt = 0,
            public var pad: IntArray = IntArray(SI_PAD.toInt()),
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
        ) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is SiginfoTimer) return false
                if (this.siSigno != other.siSigno) return false
                if (this.siCode != other.siCode) return false
                if (this.siErrno != other.siErrno) return false
                if (!this.pad.contentEquals(other.pad)) return false
                if (this.pid != other.pid) return false
                if (this.uid != other.uid) return false
                return true
            }

            override fun hashCode(): Int {
                var result = this.siSigno.hashCode()
                result = 31 * result + this.siCode.hashCode()
                result = 31 * result + this.siErrno.hashCode()
                result = 31 * result + this.pad.contentHashCode()
                result = 31 * result + this.pid.hashCode()
                result = 31 * result + this.uid.hashCode()
                return result
            }
        }
        return (((((this as Any?) as SiginfoT?)) as Any?) as SiginfoTimer?)!!.uid
    }

    public fun siValue(): Sigval {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siCode: CInt = 0,
            public var siErrno: CInt = 0,
            public var pad: IntArray = IntArray(SI_PAD.toInt()),
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
            public var value: Sigval = Sigval(),
        ) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is SiginfoTimer) return false
                if (this.siSigno != other.siSigno) return false
                if (this.siCode != other.siCode) return false
                if (this.siErrno != other.siErrno) return false
                if (!this.pad.contentEquals(other.pad)) return false
                if (this.pid != other.pid) return false
                if (this.uid != other.uid) return false
                if (this.value != other.value) return false
                return true
            }

            override fun hashCode(): Int {
                var result = this.siSigno.hashCode()
                result = 31 * result + this.siCode.hashCode()
                result = 31 * result + this.siErrno.hashCode()
                result = 31 * result + this.pad.contentHashCode()
                result = 31 * result + this.pid.hashCode()
                result = 31 * result + this.uid.hashCode()
                result = 31 * result + this.value.hashCode()
                return result
            }
        }
        return (((((this as Any?) as SiginfoT?)) as Any?) as SiginfoTimer?)!!.value
    }

    public fun siStatus(): CInt {
        data class SiginfoProc(
            public var siSigno: CInt = 0,
            public var siCode: CInt = 0,
            public var siErrno: CInt = 0,
            public var pad: IntArray = IntArray(SI_PAD.toInt()),
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
            public var utime: ClockT = 0L,
            public var stime: ClockT = 0L,
            public var status: CInt = 0,
        ) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is SiginfoProc) return false
                if (this.siSigno != other.siSigno) return false
                if (this.siCode != other.siCode) return false
                if (this.siErrno != other.siErrno) return false
                if (!this.pad.contentEquals(other.pad)) return false
                if (this.pid != other.pid) return false
                if (this.uid != other.uid) return false
                if (this.utime != other.utime) return false
                if (this.stime != other.stime) return false
                if (this.status != other.status) return false
                return true
            }

            override fun hashCode(): Int {
                var result = this.siSigno.hashCode()
                result = 31 * result + this.siCode.hashCode()
                result = 31 * result + this.siErrno.hashCode()
                result = 31 * result + this.pad.contentHashCode()
                result = 31 * result + this.pid.hashCode()
                result = 31 * result + this.uid.hashCode()
                result = 31 * result + this.utime.hashCode()
                result = 31 * result + this.stime.hashCode()
                result = 31 * result + this.status.hashCode()
                return result
            }
        }
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoProc?))!!.status
    }
}

public data class Lastlog(
    public var llTime: TimeT = 0L,
    public var llLine: UByteArray = UByteArray(UT_LINESIZE),
    public var llHost: UByteArray = UByteArray(UT_HOSTSIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lastlog) return false
        if (this.llTime != other.llTime) return false
        if (!this.llLine.contentEquals(other.llLine)) return false
        if (!this.llHost.contentEquals(other.llHost)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.llTime.hashCode()
        result = 31 * result + this.llLine.contentHashCode()
        result = 31 * result + this.llHost.contentHashCode()
        return result
    }
}

public data class Utmp(
    public var utLine: UByteArray = UByteArray(UT_LINESIZE),
    public var utName: UByteArray = UByteArray(UT_NAMESIZE),
    public var utHost: UByteArray = UByteArray(UT_HOSTSIZE),
    public var utTime: TimeT = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmp) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utName.contentEquals(other.utName)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.utTime != other.utTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utLine.contentHashCode()
        result = 31 * result + this.utName.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utTime.hashCode()
        return result
    }
}

public class Statfs(
    public var fFlags: UInt = 0u,
    public var fBsize: UInt = 0u,
    public var fIosize: UInt = 0u,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: Long = 0L,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFavail: Long = 0L,
    public var fSyncwrites: ULong = 0uL,
    public var fSyncreads: ULong = 0uL,
    public var fAsyncwrites: ULong = 0uL,
    public var fAsyncreads: ULong = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamemax: UInt = 0u,
    public var fOwner: UidT = 0u,
    public var fCtime: ULong = 0uL,
    public var fFstypename: UByteArray = UByteArray(16),
    public var fMntonname: UByteArray = UByteArray(90),
    public var fMntfromname: UByteArray = UByteArray(90),
    public var fMntfromspec: UByteArray = UByteArray(90),
    public var mountInfo: MountInfo = MountInfo(),
)

public data class MountInfo(
    public var ufsArgs: UfsArgs = UfsArgs(),
    public var mfsArgs: MfsArgs = MfsArgs(),
    public var nfsArgs: NfsArgs = NfsArgs(),
    public var isoArgs: IsoArgs = IsoArgs(),
    public var msdosfsArgs: MsdosfsArgs = MsdosfsArgs(),
    public var ntfsArgs: NtfsArgs = NtfsArgs(),
    public var tmpfsArgs: TmpfsArgs = TmpfsArgs(),
    public var align: UByteArray = UByteArray(160),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MountInfo) return false
        if (this.ufsArgs != other.ufsArgs) return false
        if (this.mfsArgs != other.mfsArgs) return false
        if (this.nfsArgs != other.nfsArgs) return false
        if (this.isoArgs != other.isoArgs) return false
        if (this.msdosfsArgs != other.msdosfsArgs) return false
        if (this.ntfsArgs != other.ntfsArgs) return false
        if (this.tmpfsArgs != other.tmpfsArgs) return false
        if (!this.align.contentEquals(other.align)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ufsArgs.hashCode()
        result = 31 * result + this.mfsArgs.hashCode()
        result = 31 * result + this.nfsArgs.hashCode()
        result = 31 * result + this.isoArgs.hashCode()
        result = 31 * result + this.msdosfsArgs.hashCode()
        result = 31 * result + this.ntfsArgs.hashCode()
        result = 31 * result + this.tmpfsArgs.hashCode()
        result = 31 * result + this.align.contentHashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "mount_info").finishNonExhaustive()
    }

    public fun eq(other: MountInfo): Boolean {
        return this.align.zip(other.align).all({ (a, b) -> a == b })
    }
}

public data class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr = Sockaddr(),
    public var ifruDstaddr: Sockaddr = Sockaddr(),
    public var ifruBroadaddr: Sockaddr = Sockaddr(),
    public var ifruFlags: CShort = 0,
    public var ifruMetric: CInt = 0,
    public var ifruVnetid: Long = 0L,
    public var ifruMedia: ULong = 0uL,
    public var ifruData: CaddrT = null,
    public var ifruIndex: CUint = 0u,
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfrIfru): Boolean {
        return this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruBroadaddr == other.ifruBroadaddr && this.ifruFlags == other.ifruFlags && this.ifruMetric == other.ifruMetric && this.ifruVnetid == other.ifruVnetid && this.ifruMedia == other.ifruMedia && this.ifruData == other.ifruData && this.ifruIndex == other.ifruIndex
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.ifruAddr).hashCode()
            state = 31 * state + (this.ifruDstaddr).hashCode()
            state = 31 * state + (this.ifruBroadaddr).hashCode()
            state = 31 * state + (this.ifruFlags).hashCode()
            state = 31 * state + (this.ifruMetric).hashCode()
            state = 31 * state + (this.ifruVnetid).hashCode()
            state = 31 * state + (this.ifruMedia).hashCode()
            state = 31 * state + (this.ifruData).hashCode()
            state = 31 * state + (this.ifruIndex).hashCode()
        }
        return state
    }
}
