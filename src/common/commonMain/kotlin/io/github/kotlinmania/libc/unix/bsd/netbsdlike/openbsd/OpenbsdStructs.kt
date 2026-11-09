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
import io.github.kotlinmania.libc.unix.GidT
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
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.IpcPerm

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

public open class IpMreqn(
    public var imrMultiaddr: InAddr,
    public var imrAddress: InAddr,
    public var imrIfindex: CInt,
)

public open class GlobT(
    public var glPathc: SizeT,
    public var glMatchc: SizeT,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    public var glPathv: COpaquePointer?,
    public var unused1: COpaquePointer?,
    public var unused2: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
    public var unused6: COpaquePointer?,
    public var unused7: COpaquePointer?,
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

public open class UfsArgs(public var fspec: COpaquePointer?, public var exportInfo: ExportArgs)

public open class MfsArgs(
    public var fspec: COpaquePointer?,
    public var exportInfo: ExportArgs,
    // https://github.com/openbsd/src/blob/HEAD/sys/sys/types.h#L134
    public var base: COpaquePointer?,
    public var size: CUlong,
)

public open class IsoArgs(
    public var fspec: COpaquePointer?,
    public var exportInfo: ExportArgs,
    public var flags: CInt,
    public var sess: CInt,
)

public open class NfsArgs(
    public var version: CInt,
    public var addr: Sockaddr?,
    public var addrlen: CInt,
    public var sotype: CInt,
    public var proto: CInt,
    public var fh: CUchar?,
    public var fhsize: CInt,
    public var flags: CInt,
    public var wsize: CInt,
    public var rsize: CInt,
    public var readdirsize: CInt,
    public var timeo: CInt,
    public var retrans: CInt,
    public var maxgrouplist: CInt,
    public var readahead: CInt,
    public var leaseterm: CInt,
    public var deadthresh: CInt,
    public var hostname: COpaquePointer?,
    public var acregmin: CInt,
    public var acregmax: CInt,
    public var acdirmin: CInt,
    public var acdirmax: CInt,
)

public open class MsdosfsArgs(
    public var fspec: COpaquePointer?,
    public var exportInfo: ExportArgs,
    public var uid: UidT,
    public var gid: GidT,
    public var mask: ModeT,
    public var flags: CInt,
)

public open class NtfsArgs(
    public var fspec: COpaquePointer?,
    public var exportInfo: ExportArgs,
    public var uid: UidT,
    public var gid: GidT,
    public var mode: ModeT,
    public var flag: CUlong,
)

public open class UdfArgs(public var fspec: COpaquePointer?, public var lastblock: UInt)

public open class TmpfsArgs(
    public var taVersion: CInt,
    public var taNodesMax: InoT,
    public var taSizeMax: OffT,
    public var taRootUid: UidT,
    public var taRootGid: GidT,
    public var taRootMode: ModeT,
)

public open class FusefsArgs(
    public var name: COpaquePointer?,
    public var fd: CInt,
    public var maxRead: CInt,
    public var allowOther: CInt,
)

public open class Xucred(
    public var crUid: UidT,
    public var crGid: GidT,
    public var crNgroups: CShort,
    // https://github.com/openbsd/src/blob/HEAD/sys/sys/syslimits.h#L44
    public var crGroups: List<GidT>,
)

public open class ExportArgs(
    public var exFlags: CInt,
    public var exRoot: UidT,
    public var exAnon: Xucred,
    public var exAddr: Sockaddr?,
    public var exAddrlen: CInt,
    public var exMask: Sockaddr?,
    public var exMasklen: CInt,
)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class InAddr(public var sAddr: InAddrT)

public open class SockaddrIn(
    public var sinLen: UByte,
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<Byte>,
)

public open class Splice(
    public var spFd: CInt,
    public var spMax: OffT,
    public var spIdle: Timeval,
)

public open class Kevent(
    public var ident: UintptrT,
    public var filter: CShort,
    public var flags: CUshort,
    public var fflags: CUint,
    public var data: Long,
    public var udata: COpaquePointer?,
)

public open class Stat(
    public var stMode: ModeT,
    public var stDev: DevT,
    public var stIno: InoT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stSize: OffT,
    public var stBlocks: BlkcntT,
    public var stBlksize: BlksizeT,
    public var stFlags: UInt,
    public var stGen: UInt,
    public var stBirthtime: TimeT,
    public var stBirthtimeNsec: CLong,
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

public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    public var aiAddr: Sockaddr?,
    public var aiCanonname: COpaquePointer?,
    public var aiNext: Addrinfo?,
)

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class IfData(
    public var ifiType: CUchar,
    public var ifiAddrlen: CUchar,
    public var ifiHdrlen: CUchar,
    public var ifiLinkState: CUchar,
    public var ifiMtu: UInt,
    public var ifiMetric: UInt,
    public var ifiRdomain: UInt,
    public var ifiBaudrate: ULong,
    public var ifiIpackets: ULong,
    public var ifiIerrors: ULong,
    public var ifiOpackets: ULong,
    public var ifiOerrors: ULong,
    public var ifiCollisions: ULong,
    public var ifiIbytes: ULong,
    public var ifiObytes: ULong,
    public var ifiImcasts: ULong,
    public var ifiOmcasts: ULong,
    public var ifiIqdrops: ULong,
    public var ifiOqdrops: ULong,
    public var ifiNoproto: ULong,
    public var ifiCapabilities: UInt,
    public var ifiLastchange: Timeval,
)

public open class IfMsghdr(
    public var ifmMsglen: CUshort,
    public var ifmVersion: CUchar,
    public var ifmType: CUchar,
    public var ifmHdrlen: CUshort,
    public var ifmIndex: CUshort,
    public var ifmTableid: CUshort,
    public var ifmPad1: CUchar,
    public var ifmPad2: CUchar,
    public var ifmAddrs: CInt,
    public var ifmFlags: CInt,
    public var ifmXflags: CInt,
    public var ifmData: IfData,
)

public open class SockaddrDl(
    public var sdlLen: CUchar,
    public var sdlFamily: CUchar,
    public var sdlIndex: CUshort,
    public var sdlType: CUchar,
    public var sdlNlen: CUchar,
    public var sdlAlen: CUchar,
    public var sdlSlen: CUchar,
    public var sdlData: List<CChar>,
)

public open class Sockpeercred(
    public var uid: UidT,
    public var gid: GidT,
    public var pid: PidT,
)

public open class Arphdr(
    public var arHrd: UShort,
    public var arPro: UShort,
    public var arHln: UByte,
    public var arPln: UByte,
    public var arOp: UShort,
)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: CInt,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: CShort,
    public var shmAtime: TimeT,
    public var shmAtimensec: CLong,
    public var shmDtime: TimeT,
    public var shmDtimensec: CLong,
    public var shmCtime: TimeT,
    public var shmCtimensec: CLong,
    public var shmInternal: COpaquePointer?,
)

// elf.h
public open class Elf32Phdr(
    public var pType: Elf32Word,
    public var pOffset: Elf32Off,
    public var pVaddr: Elf32Addr,
    public var pPaddr: Elf32Addr,
    public var pFilesz: Elf32Word,
    public var pMemsz: Elf32Word,
    public var pFlags: Elf32Word,
    public var pAlign: Elf32Word,
)

public open class Elf64Phdr(
    public var pType: Elf64Word,
    public var pFlags: Elf64Word,
    public var pOffset: Elf64Off,
    public var pVaddr: Elf64Addr,
    public var pPaddr: Elf64Addr,
    public var pFilesz: Elf64Xword,
    public var pMemsz: Elf64Xword,
    public var pAlign: Elf64Xword,
)

// link.h
public open class DlPhdrInfo(
    public var dlpiAddr: ElfAddr,
    public var dlpiName: COpaquePointer?,
    public var dlpiPhdr: Elf64Phdr?,
    public var dlpiPhnum: ElfHalf,
)

// sys/sysctl.h
public open class KinfoProc(
    public var pForw: ULong,
    public var pBack: ULong,
    public var pPaddr: ULong,
    public var pAddr: ULong,
    public var pFd: ULong,
    public var pStats: ULong,
    public var pLimit: ULong,
    public var pVmspace: ULong,
    public var pSigacts: ULong,
    public var pSess: ULong,
    public var pTsess: ULong,
    public var pRu: ULong,
    public var pEflag: Int,
    public var pExitsig: Int,
    public var pFlag: Int,
    public var pPid: Int,
    public var pPpid: Int,
    public var pSid: Int,
    public var pPgid: Int,
    public var pTpgid: Int,
    public var pUid: UInt,
    public var pRuid: UInt,
    public var pGid: UInt,
    public var pRgid: UInt,
    public var pGroups: List<UInt>,
    public var pNgroups: Short,
    public var pJobc: Short,
    public var pTdev: UInt,
    public var pEstcpu: UInt,
    public var pRtimeSec: UInt,
    public var pRtimeUsec: UInt,
    public var pCpticks: Int,
    public var pPctcpu: UInt,
    public var pSwtime: UInt,
    public var pSlptime: UInt,
    public var pSchedflags: Int,
    public var pUticks: ULong,
    public var pSticks: ULong,
    public var pIticks: ULong,
    public var pTracep: ULong,
    public var pTraceflag: Int,
    public var pHoldcnt: Int,
    public var pSiglist: Int,
    public var pSigmask: UInt,
    public var pSigignore: UInt,
    public var pSigcatch: UInt,
    public var pStat: Byte,
    public var pPriority: UByte,
    public var pUsrpri: UByte,
    public var pNice: UByte,
    public var pXstat: UShort,
    public var pSpare: UShort,
    public var pComm: List<CChar>,
    public var pWmesg: List<CChar>,
    public var pWchan: ULong,
    public var pLogin: List<CChar>,
    public var pVmRssize: Int,
    public var pVmTsize: Int,
    public var pVmDsize: Int,
    public var pVmSsize: Int,
    public var pUvalid: Long,
    public var pUstartSec: ULong,
    public var pUstartUsec: UInt,
    public var pUutimeSec: UInt,
    public var pUutimeUsec: UInt,
    public var pUstimeSec: UInt,
    public var pUstimeUsec: UInt,
    public var pUruMaxrss: ULong,
    public var pUruIxrss: ULong,
    public var pUruIdrss: ULong,
    public var pUruIsrss: ULong,
    public var pUruMinflt: ULong,
    public var pUruMajflt: ULong,
    public var pUruNswap: ULong,
    public var pUruInblock: ULong,
    public var pUruOublock: ULong,
    public var pUruMsgsnd: ULong,
    public var pUruMsgrcv: ULong,
    public var pUruNsignals: ULong,
    public var pUruNvcsw: ULong,
    public var pUruNivcsw: ULong,
    public var pUctimeSec: UInt,
    public var pUctimeUsec: UInt,
    public var pPsflags: UInt,
    public var pAcflag: UInt,
    public var pSvuid: UInt,
    public var pSvgid: UInt,
    public var pEmul: List<CChar>,
    public var pRlimRssCur: ULong,
    public var pCpuid: ULong,
    public var pVmMapSize: ULong,
    public var pTid: Int,
    public var pRtableid: UInt,
    public var pPledge: ULong,
    public var pName: List<CChar>,
)

public open class KinfoVmentry(
    public var kveStart: CUlong,
    public var kveEnd: CUlong,
    public var kveGuard: CUlong,
    public var kveFspace: CUlong,
    public var kveFspaceAugment: CUlong,
    public var kveOffset: ULong,
    public var kveWiredCount: CInt,
    public var kveEtype: CInt,
    public var kveProtection: CInt,
    public var kveMaxProtection: CInt,
    public var kveAdvice: CInt,
    public var kveInheritance: CInt,
    public var kveFlags: UByte,
)

public open class PtraceState(
    public var peReportEvent: CInt,
    public var peOtherPid: PidT,
    public var peTid: PidT,
)

public open class PtraceThreadState(public var ptsTid: PidT, public var ptsName: List<CChar>)

// search.h
public open class Entry(public var key: COpaquePointer?, public var data: COpaquePointer?)

public open class Ifreq(public var ifrName: List<CChar>, public var ifrIfru: CAnonymousIfrIfru)

public open class TcpInfo(
    public var tcpiState: UByte,
    public var tcpiCaState: UByte,
    public var tcpiRetransmits: UByte,
    public var tcpiProbes: UByte,
    public var tcpiBackoff: UByte,
    public var tcpiOptions: UByte,
    public var tcpiSndWscale: UByte,
    public var tcpiRcvWscale: UByte,
    public var tcpiRto: UInt,
    public var tcpiAto: UInt,
    public var tcpiSndMss: UInt,
    public var tcpiRcvMss: UInt,
    public var tcpiUnacked: UInt,
    public var tcpiSacked: UInt,
    public var tcpiLost: UInt,
    public var tcpiRetrans: UInt,
    public var tcpiFackets: UInt,
    public var tcpiLastDataSent: UInt,
    public var tcpiLastAckSent: UInt,
    public var tcpiLastDataRecv: UInt,
    public var tcpiLastAckRecv: UInt,
    public var tcpiPmtu: UInt,
    public var tcpiRcvSsthresh: UInt,
    public var tcpiRtt: UInt,
    public var tcpiRttvar: UInt,
    public var tcpiSndSsthresh: UInt,
    public var tcpiSndCwnd: UInt,
    public var tcpiAdvmss: UInt,
    public var tcpiReordering: UInt,
    public var tcpiRcvRtt: UInt,
    public var tcpiRcvSpace: UInt,
    public var tcpiSndWnd: UInt,
    public var tcpiSndNxt: UInt,
    public var tcpiRcvNxt: UInt,
    public var tcpiToeTid: UInt,
    public var tcpiSndRexmitpack: UInt,
    public var tcpiRcvOoopack: UInt,
    public var tcpiSndZerowin: UInt,
    public var tcpiRttmin: UInt,
    public var tcpiMaxSndwnd: UInt,
    public var tcpiRcvAdv: UInt,
    public var tcpiRcvUp: UInt,
    public var tcpiSndUna: UInt,
    public var tcpiSndUp: UInt,
    public var tcpiSndWl1: UInt,
    public var tcpiSndWl2: UInt,
    public var tcpiSndMax: UInt,
    public var tcpiTsRecent: UInt,
    public var tcpiTsRecentAge: UInt,
    public var tcpiRfbufCnt: UInt,
    public var tcpiRfbufTs: UInt,
    public var tcpiSoRcvSbCc: UInt,
    public var tcpiSoRcvSbHiwat: UInt,
    public var tcpiSoRcvSbLowat: UInt,
    public var tcpiSoRcvSbWat: UInt,
    public var tcpiSoSndSbCc: UInt,
    public var tcpiSoSndSbHiwat: UInt,
    public var tcpiSoSndSbLowat: UInt,
    public var tcpiSoSndSbWat: UInt,
)

public open class Dirent(
    public var dFileno: InoT,
    public var dOff: OffT,
    public var dReclen: UShort,
    public var dType: UByte,
    public var dNamlen: UByte,
    public var dPadding: List<UByte>,
    public var dName: List<CChar>,
)

public open class SockaddrStorage(
    public var ssLen: UByte,
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<UByte>,
    public var ssPad2: Long,
    public var ssPad3: List<UByte>,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var siAddr: COpaquePointer?,
    public var pad: List<UByte>,
) {
    public open fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public open fun siCode(): CInt {
        return this.siCode
    }

    public open fun siErrno(): CInt {
        return this.siErrno
    }

    public open fun siPid(): PidT {
        open class SiginfoTimer(
            public var siSigno: CInt,
            public var siCode: CInt,
            public var siErrno: CInt,
            public var pad: List<CInt>,
            public var pid: PidT,
        )
        return (if (((this as SiginfoT?)) == null) null else SiginfoTimer()).pid
    }

    public open fun siUid(): UidT {
        open class SiginfoTimer(
            public var siSigno: CInt,
            public var siCode: CInt,
            public var siErrno: CInt,
            public var pad: List<CInt>,
            public var pid: PidT,
            public var uid: UidT,
        )
        return (if (((this as SiginfoT?)) == null) null else SiginfoTimer()).uid
    }

    public open fun siValue(): Sigval {
        open class SiginfoTimer(
            public var siSigno: CInt,
            public var siCode: CInt,
            public var siErrno: CInt,
            public var pad: List<CInt>,
            public var pid: PidT,
            public var uid: UidT,
            public var value: Sigval,
        )
        return (if (((this as SiginfoT?)) == null) null else SiginfoTimer()).value
    }

    public open fun siStatus(): CInt {
        open class SiginfoProc(
            public var siSigno: CInt,
            public var siCode: CInt,
            public var siErrno: CInt,
            public var pad: List<CInt>,
            public var pid: PidT,
            public var uid: UidT,
            public var utime: ClockT,
            public var stime: ClockT,
            public var status: CInt,
        )
        return (((this as SiginfoT?) as SiginfoProc?)).status
    }
}

public open class Lastlog(
    public var llTime: TimeT,
    public var llLine: List<CChar>,
    public var llHost: List<CChar>,
)

public open class Utmp(
    public var utLine: List<CChar>,
    public var utName: List<CChar>,
    public var utHost: List<CChar>,
    public var utTime: TimeT,
)

public open class Statfs(
    public var fFlags: UInt,
    public var fBsize: UInt,
    public var fIosize: UInt,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: Long,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFavail: Long,
    public var fSyncwrites: ULong,
    public var fSyncreads: ULong,
    public var fAsyncwrites: ULong,
    public var fAsyncreads: ULong,
    public var fFsid: FsidT,
    public var fNamemax: UInt,
    public var fOwner: UidT,
    public var fCtime: ULong,
    public var fFstypename: List<CChar>,
    public var fMntonname: List<CChar>,
    public var fMntfromname: List<CChar>,
    public var fMntfromspec: List<CChar>,
    public var mountInfo: MountInfo,
)

public open class MountInfo(
    public var ufsArgs: UfsArgs? = null,
    public var mfsArgs: MfsArgs? = null,
    public var nfsArgs: NfsArgs? = null,
    public var isoArgs: IsoArgs? = null,
    public var msdosfsArgs: MsdosfsArgs? = null,
    public var ntfsArgs: NtfsArgs? = null,
    public var tmpfsArgs: TmpfsArgs? = null,
    public var align: List<CChar>? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "mount_info").finishNonExhaustive()
    }

    public open fun eq(other: MountInfo): Boolean {
        return this.align.iter().zip(other.align.iter()).all({ (a, b) -> a == b })
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.align).hashCode()
        return state
    }
}

public open class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr? = null,
    public var ifruDstaddr: Sockaddr? = null,
    public var ifruBroadaddr: Sockaddr? = null,
    public var ifruFlags: CShort? = null,
    public var ifruMetric: CInt? = null,
    public var ifruVnetid: Long? = null,
    public var ifruMedia: ULong? = null,
    public var ifruData: CaddrT? = null,
    public var ifruIndex: CUint? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousIfrIfru): Boolean {
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
