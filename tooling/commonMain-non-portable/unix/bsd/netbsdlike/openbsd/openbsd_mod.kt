// port-lint: source unix/bsd/netbsdlike/openbsd/openbsd_mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.BlkcntT
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CMSG_FIRSTHDR
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CRTSCTS
import io.github.kotlinmania.libc.ClockidT
import io.github.kotlinmania.libc.Cmsghdr
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FsidT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.IOCPARM_MASK
import io.github.kotlinmania.libc.InAddrT
import io.github.kotlinmania.libc.InPortT
import io.github.kotlinmania.libc.InoT
import io.github.kotlinmania.libc.IpcPerm
import io.github.kotlinmania.libc.LC_COLLATE
import io.github.kotlinmania.libc.LC_CTYPE
import io.github.kotlinmania.libc.LC_MESSAGES
import io.github.kotlinmania.libc.LC_MONETARY
import io.github.kotlinmania.libc.LC_NUMERIC
import io.github.kotlinmania.libc.LC_TIME
import io.github.kotlinmania.libc.LocaleT
import io.github.kotlinmania.libc.MDMBUF
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.Msghdr
import io.github.kotlinmania.libc.NlinkT
import io.github.kotlinmania.libc.OffT
import io.github.kotlinmania.libc.POLLRDNORM
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.PthreadT
import io.github.kotlinmania.libc.RTF_BFD
import io.github.kotlinmania.libc.RTF_BLACKHOLE
import io.github.kotlinmania.libc.RTF_LLINFO
import io.github.kotlinmania.libc.RTF_MPLS
import io.github.kotlinmania.libc.RTF_PROTO1
import io.github.kotlinmania.libc.RTF_PROTO2
import io.github.kotlinmania.libc.RTF_PROTO3
import io.github.kotlinmania.libc.RTF_REJECT
import io.github.kotlinmania.libc.RTF_STATIC
import io.github.kotlinmania.libc.SaFamilyT
import io.github.kotlinmania.libc.Sigval
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.StackT
import io.github.kotlinmania.libc.TcflagT
import io.github.kotlinmania.libc.Termios
import io.github.kotlinmania.libc.TimeT
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.Timezone
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.UintptrT
import io.github.kotlinmania.libc.Winsize
import io.github.kotlinmania.libc.unix.bsd.O_SYNC

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: DlPhdrInfo?, size: ULong, data: COpaquePointer?): CInt
}

public fun interface LsearchComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

public typealias ClockT = Long

public typealias SusecondsT = CLong

public typealias DevT = Int

public typealias SigsetT = CUint

public typealias BlksizeT = Int

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias IdtypeT = CUint

public typealias PthreadAttrT = COpaquePointer?

public typealias PthreadMutexT = COpaquePointer?

public typealias PthreadMutexattrT = COpaquePointer?

public typealias PthreadCondT = COpaquePointer?

public typealias PthreadCondattrT = COpaquePointer?

public typealias PthreadRwlockT = COpaquePointer?

public typealias PthreadRwlockattrT = COpaquePointer?

public typealias PthreadSpinlockT = UintptrT

public typealias CaddrT = COpaquePointer?

// elf.h
public typealias Elf32Addr = UInt

public typealias Elf32Half = UShort

public typealias Elf32Lword = ULong

public typealias Elf32Off = UInt

public typealias Elf32Sword = Int

public typealias Elf32Word = UInt

public typealias Elf64Addr = ULong

public typealias Elf64Half = UShort

public typealias Elf64Lword = ULong

public typealias Elf64Off = ULong

public typealias Elf64Sword = Int

public typealias Elf64Sxword = Long

public typealias Elf64Word = UInt

public typealias Elf64Xword = ULong

public typealias Action = CUint

// spawn.h
public typealias PosixSpawnattrT = COpaquePointer?

public typealias PosixSpawnFileActionsT = COpaquePointer?

public typealias ElfAddr = Elf64Addr

public typealias ElfHalf = Elf64Half

public typealias ElfPhdr = Elf64Phdr

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
    public var sinAddr: io.github.kotlinmania.libc.InAddr,
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
    public var stDev: io.github.kotlinmania.libc.DevT,
    public var stIno: InoT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: io.github.kotlinmania.libc.DevT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stSize: OffT,
    public var stBlocks: BlkcntT,
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var stFlags: UInt,
    public var stGen: UInt,
    public var stBirthtime: TimeT,
    public var stBirthtimeNsec: CLong,
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
    public var aiNext: io.github.kotlinmania.libc.Addrinfo?,
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
            public var utime: io.github.kotlinmania.libc.ClockT,
            public var stime: io.github.kotlinmania.libc.ClockT,
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
    public var ifruData: io.github.kotlinmania.libc.CaddrT? = null,
    public var ifruIndex: CUint? = null,
) {
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

public val UT_NAMESIZE: Int = 32

public val UT_LINESIZE: Int = 8

public val UT_HOSTSIZE: Int = 256

public val O_CLOEXEC: CInt = 0x10000

public val O_DIRECTORY: CInt = 0x20000

public val O_RSYNC: CInt = O_SYNC

public val MS_SYNC: CInt = 0x0002

public val MS_INVALIDATE: CInt = 0x0004

public val POLLNORM: CShort = POLLRDNORM

public val ENOATTR: CInt = 83

public val EILSEQ: CInt = 84

public val EOVERFLOW: CInt = 87

public val ECANCELED: CInt = 88

public val EIDRM: CInt = 89

public val ENOMSG: CInt = 90

public val ENOTSUP: CInt = 91

public val EBADMSG: CInt = 92

public val ENOTRECOVERABLE: CInt = 93

public val EOWNERDEAD: CInt = 94

public val EPROTO: CInt = 95

public val ELAST: CInt = 95

public val F_DUPFD_CLOEXEC: CInt = 10

public val UTIME_OMIT: CLong = -1L

public val UTIME_NOW: CLong = -2L

public val AT_FDCWD: CInt = -100

public val AT_EACCESS: CInt = 0x01

public val AT_SYMLINK_NOFOLLOW: CInt = 0x02

public val AT_SYMLINK_FOLLOW: CInt = 0x04

public val AT_REMOVEDIR: CInt = 0x08

public val AT_NULL: CInt = 0

public val AT_IGNORE: CInt = 1

public val AT_PAGESZ: CInt = 6

public val AT_HWCAP: CInt = 25

public val AT_HWCAP2: CInt = 26

public val RLIM_NLIMITS: CInt = 9

public val SO_TIMESTAMP: CInt = 0x0800

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_BINDANY: CInt = 0x1000

public val SO_NETPROC: CInt = 0x1020

public val SO_RTABLE: CInt = 0x1021

public val SO_PEERCRED: CInt = 0x1022

public val SO_SPLICE: CInt = 0x1023

public val SO_DOMAIN: CInt = 0x1024

public val SO_PROTOCOL: CInt = 0x1025

// sys/netinet/in.h
// Protocols (RFC 1700)
// NOTE: These are in addition to the constants defined in src/unix/mod.rs
// IPPROTO_IP defined in src/unix/mod.rs
/**
 * Hop-by-hop option header
 */
public val IPPROTO_HOPOPTS: CInt = 0

// IPPROTO_ICMP defined in src/unix/mod.rs
/**
 * group mgmt protocol
 */
public val IPPROTO_IGMP: CInt = 2

/**
 * gateway^2 (deprecated)
 */
public val IPPROTO_GGP: CInt = 3

/**
 * for compatibility
 */
public val IPPROTO_IPIP: CInt = 4

// IPPROTO_TCP defined in src/unix/mod.rs
/**
 * exterior gateway protocol
 */
public val IPPROTO_EGP: CInt = 8

/**
 * pup
 */
public val IPPROTO_PUP: CInt = 12

// IPPROTO_UDP defined in src/unix/mod.rs
/**
 * xns idp
 */
public val IPPROTO_IDP: CInt = 22

/**
 * tp-4 w/ class negotiation
 */
public val IPPROTO_TP: CInt = 29

// IPPROTO_IPV6 defined in src/unix/mod.rs
/**
 * IP6 routing header
 */
public val IPPROTO_ROUTING: CInt = 43

/**
 * IP6 fragmentation header
 */
public val IPPROTO_FRAGMENT: CInt = 44

/**
 * resource reservation
 */
public val IPPROTO_RSVP: CInt = 46

/**
 * General Routing Encap.
 */
public val IPPROTO_GRE: CInt = 47

/**
 * IP6 Encap Sec. Payload
 */
public val IPPROTO_ESP: CInt = 50

/**
 * IP6 Auth Header
 */
public val IPPROTO_AH: CInt = 51

/**
 * IP Mobility RFC 2004
 */
public val IPPROTO_MOBILE: CInt = 55

// IPPROTO_ICMPV6 defined in src/unix/mod.rs
/**
 * IP6 no next header
 */
public val IPPROTO_NONE: CInt = 59

/**
 * IP6 destination option
 */
public val IPPROTO_DSTOPTS: CInt = 60

/**
 * ISO cnlp
 */
public val IPPROTO_EON: CInt = 80

/**
 * Ethernet-in-IP
 */
public val IPPROTO_ETHERIP: CInt = 97

/**
 * encapsulation header
 */
public val IPPROTO_ENCAP: CInt = 98

/**
 * Protocol indep. multicast
 */
public val IPPROTO_PIM: CInt = 103

/**
 * IP Payload Comp. Protocol
 */
public val IPPROTO_IPCOMP: CInt = 108

/**
 * CARP
 */
public val IPPROTO_CARP: CInt = 112

/**
 * unicast MPLS packet
 */
public val IPPROTO_MPLS: CInt = 137

/**
 * PFSYNC
 */
public val IPPROTO_PFSYNC: CInt = 240

public val IPPROTO_MAX: CInt = 256

// Only used internally, so it can be outside the range of valid IP protocols
public val IPPROTO_DIVERT: CInt = 258

public val IP_RECVDSTADDR: CInt = 7

public val IP_SENDSRCADDR: CInt = IP_RECVDSTADDR

public val IP_RECVIF: CInt = 30

// sys/netinet/in.h
public val TCP_MD5SIG: CInt = 0x04

public val TCP_NOPUSH: CInt = 0x10

public val MSG_WAITFORONE: CInt = 0x1000

public val AF_ECMA: CInt = 8

public val AF_ROUTE: CInt = 17

public val AF_ENCAP: CInt = 28

public val AF_SIP: CInt = 29

public val AF_KEY: CInt = 30

public val PSEUDO_AF_HDRCMPLT: CInt = 31

public val AF_BLUETOOTH: CInt = 32

public val AF_MPLS: CInt = 33

public val PSEUDO_AF_PFLOW: CInt = 34

public val PSEUDO_AF_PIPEX: CInt = 35

public val NET_RT_DUMP: CInt = 1

public val NET_RT_FLAGS: CInt = 2

public val NET_RT_IFLIST: CInt = 3

public val NET_RT_STATS: CInt = 4

public val NET_RT_TABLE: CInt = 5

public val NET_RT_IFNAMES: CInt = 6

public val NET_RT_MAXID: CInt = 7

public val IPV6_JOIN_GROUP: CInt = 12

public val IPV6_LEAVE_GROUP: CInt = 13

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_ECMA: CInt = AF_ECMA

public val PF_ENCAP: CInt = AF_ENCAP

public val PF_SIP: CInt = AF_SIP

public val PF_KEY: CInt = AF_KEY

public val PF_BPF: CInt = PSEUDO_AF_HDRCMPLT

public val PF_BLUETOOTH: CInt = AF_BLUETOOTH

public val PF_MPLS: CInt = AF_MPLS

public val PF_PFLOW: CInt = PSEUDO_AF_PFLOW

public val PF_PIPEX: CInt = PSEUDO_AF_PIPEX

public val SCM_TIMESTAMP: CInt = 0x04

public val O_DSYNC: CInt = 128

public val MAP_RENAME: CInt = 0x0000

public val MAP_NORESERVE: CInt = 0x0000

public val MAP_HASSEMAPHORE: CInt = 0x0000

public val MAP_TRYFIXED: CInt = 0

public val EIPSEC: CInt = 82

public val ENOMEDIUM: CInt = 85

public val EMEDIUMTYPE: CInt = 86

public val EAI_BADFLAGS: CInt = -1

public val EAI_NONAME: CInt = -2

public val EAI_AGAIN: CInt = -3

public val EAI_FAIL: CInt = -4

public val EAI_NODATA: CInt = -5

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_MEMORY: CInt = -10

public val EAI_SYSTEM: CInt = -11

public val EAI_OVERFLOW: CInt = -14

public val RUSAGE_THREAD: CInt = 1

public val MAP_COPY: CInt = 0x0002

public val MAP_NOEXTEND: CInt = 0x0000

public val PC_LINK_MAX: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_PATH_MAX: CInt = 5

public val PC_PIPE_BUF: CInt = 6

public val PC_CHOWN_RESTRICTED: CInt = 7

public val PC_NO_TRUNC: CInt = 8

public val PC_VDISABLE: CInt = 9

public val PC_2_SYMLINKS: CInt = 10

public val PC_ALLOC_SIZE_MIN: CInt = 11

public val PC_ASYNC_IO: CInt = 12

public val PC_FILESIZEBITS: CInt = 13

public val PC_PRIO_IO: CInt = 14

public val PC_REC_INCR_XFER_SIZE: CInt = 15

public val PC_REC_MAX_XFER_SIZE: CInt = 16

public val PC_REC_MIN_XFER_SIZE: CInt = 17

public val PC_REC_XFER_ALIGN: CInt = 18

public val PC_SYMLINK_MAX: CInt = 19

public val PC_SYNC_IO: CInt = 20

public val PC_TIMESTAMP_RESOLUTION: CInt = 21

public val CS_PATH: CInt = 1

public val SC_CLK_TCK: CInt = 3

public val SC_SEM_NSEMS_MAX: CInt = 31

public val SC_SEM_VALUE_MAX: CInt = 32

public val SC_HOST_NAME_MAX: CInt = 33

public val SC_MONOTONIC_CLOCK: CInt = 34

public val SC_2_PBS: CInt = 35

public val SC_2_PBS_ACCOUNTING: CInt = 36

public val SC_2_PBS_CHECKPOINT: CInt = 37

public val SC_2_PBS_LOCATE: CInt = 38

public val SC_2_PBS_MESSAGE: CInt = 39

public val SC_2_PBS_TRACK: CInt = 40

public val SC_ADVISORY_INFO: CInt = 41

public val SC_AIO_LISTIO_MAX: CInt = 42

public val SC_AIO_MAX: CInt = 43

public val SC_AIO_PRIO_DELTA_MAX: CInt = 44

public val SC_ASYNCHRONOUS_IO: CInt = 45

public val SC_ATEXIT_MAX: CInt = 46

public val SC_BARRIERS: CInt = 47

public val SC_CLOCK_SELECTION: CInt = 48

public val SC_CPUTIME: CInt = 49

public val SC_DELAYTIMER_MAX: CInt = 50

public val SC_IOV_MAX: CInt = 51

public val SC_IPV6: CInt = 52

public val SC_MAPPED_FILES: CInt = 53

public val SC_MEMLOCK: CInt = 54

public val SC_MEMLOCK_RANGE: CInt = 55

public val SC_MEMORY_PROTECTION: CInt = 56

public val SC_MESSAGE_PASSING: CInt = 57

public val SC_MQ_OPEN_MAX: CInt = 58

public val SC_MQ_PRIO_MAX: CInt = 59

public val SC_PRIORITIZED_IO: CInt = 60

public val SC_PRIORITY_SCHEDULING: CInt = 61

public val SC_RAW_SOCKETS: CInt = 62

public val SC_READER_WRITER_LOCKS: CInt = 63

public val SC_REALTIME_SIGNALS: CInt = 64

public val SC_REGEXP: CInt = 65

public val SC_RTSIG_MAX: CInt = 66

public val SC_SEMAPHORES: CInt = 67

public val SC_SHARED_MEMORY_OBJECTS: CInt = 68

public val SC_SHELL: CInt = 69

public val SC_SIGQUEUE_MAX: CInt = 70

public val SC_SPAWN: CInt = 71

public val SC_SPIN_LOCKS: CInt = 72

public val SC_SPORADIC_SERVER: CInt = 73

public val SC_SS_REPL_MAX: CInt = 74

public val SC_SYNCHRONIZED_IO: CInt = 75

public val SC_SYMLOOP_MAX: CInt = 76

public val SC_THREAD_ATTR_STACKADDR: CInt = 77

public val SC_THREAD_ATTR_STACKSIZE: CInt = 78

public val SC_THREAD_CPUTIME: CInt = 79

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 80

public val SC_THREAD_KEYS_MAX: CInt = 81

public val SC_THREAD_PRIO_INHERIT: CInt = 82

public val SC_THREAD_PRIO_PROTECT: CInt = 83

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 84

public val SC_THREAD_PROCESS_SHARED: CInt = 85

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 86

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 87

public val SC_THREAD_SPORADIC_SERVER: CInt = 88

public val SC_THREAD_STACK_MIN: CInt = 89

public val SC_THREAD_THREADS_MAX: CInt = 90

public val SC_THREADS: CInt = 91

public val SC_TIMEOUTS: CInt = 92

public val SC_TIMER_MAX: CInt = 93

public val SC_TIMERS: CInt = 94

public val SC_TRACE: CInt = 95

public val SC_TRACE_EVENT_FILTER: CInt = 96

public val SC_TRACE_EVENT_NAME_MAX: CInt = 97

public val SC_TRACE_INHERIT: CInt = 98

public val SC_TRACE_LOG: CInt = 99

public val SC_GETGR_R_SIZE_MAX: CInt = 100

public val SC_GETPW_R_SIZE_MAX: CInt = 101

public val SC_LOGIN_NAME_MAX: CInt = 102

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 103

public val SC_TRACE_NAME_MAX: CInt = 104

public val SC_TRACE_SYS_MAX: CInt = 105

public val SC_TRACE_USER_EVENT_MAX: CInt = 106

public val SC_TTY_NAME_MAX: CInt = 107

public val SC_TYPED_MEMORY_OBJECTS: CInt = 108

public val SC_V6_ILP32_OFF32: CInt = 109

public val SC_V6_ILP32_OFFBIG: CInt = 110

public val SC_V6_LP64_OFF64: CInt = 111

public val SC_V6_LPBIG_OFFBIG: CInt = 112

public val SC_V7_ILP32_OFF32: CInt = 113

public val SC_V7_ILP32_OFFBIG: CInt = 114

public val SC_V7_LP64_OFF64: CInt = 115

public val SC_V7_LPBIG_OFFBIG: CInt = 116

public val SC_XOPEN_CRYPT: CInt = 117

public val SC_XOPEN_ENH_I18N: CInt = 118

public val SC_XOPEN_LEGACY: CInt = 119

public val SC_XOPEN_REALTIME: CInt = 120

public val SC_XOPEN_REALTIME_THREADS: CInt = 121

public val SC_XOPEN_STREAMS: CInt = 122

public val SC_XOPEN_UNIX: CInt = 123

public val SC_XOPEN_UUCP: CInt = 124

public val SC_XOPEN_VERSION: CInt = 125

public val SC_PHYS_PAGES: CInt = 500

public val SC_AVPHYS_PAGES: CInt = 501

public val SC_NPROCESSORS_CONF: CInt = 502

public val SC_NPROCESSORS_ONLN: CInt = 503

public val FD_SETSIZE: Int = 1024

public val SCHED_FIFO: CInt = 1

public val SCHED_OTHER: CInt = 2

public val SCHED_RR: CInt = 3

public val ST_NOSUID: CUlong = 2uL

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = null

public val PTHREAD_COND_INITIALIZER: PthreadCondT = null

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = null

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 1

public val PTHREAD_MUTEX_RECURSIVE: CInt = 2

public val PTHREAD_MUTEX_NORMAL: CInt = 3

public val PTHREAD_MUTEX_STRICT_NP: CInt = 4

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_STRICT_NP

public val EVFILT_READ: Short = -1

public val EVFILT_WRITE: Short = -2

public val EVFILT_AIO: Short = -3

public val EVFILT_VNODE: Short = -4

public val EVFILT_PROC: Short = -5

public val EVFILT_SIGNAL: Short = -6

public val EVFILT_TIMER: Short = -7

public val EVFILT_DEVICE: Short = -8

public val EVFILT_EXCEPT: Short = -9

public val EVFILT_USER: Short = -10

public val EV_ADD: UShort = 0x1u

public val EV_DELETE: UShort = 0x2u

public val EV_ENABLE: UShort = 0x4u

public val EV_DISABLE: UShort = 0x8u

public val EV_ONESHOT: UShort = 0x10u

public val EV_CLEAR: UShort = 0x20u

public val EV_RECEIPT: UShort = 0x40u

public val EV_DISPATCH: UShort = 0x80u

public val EV_FLAG1: UShort = 0x2000u

public val EV_ERROR: UShort = 0x4000u

public val EV_EOF: UShort = 0x8000u

public val EV_SYSFLAGS: UShort = 0xf800u

public val NOTE_TRIGGER: UInt = 0x01000000u

public val NOTE_FFNOP: UInt = 0x00000000u

public val NOTE_FFAND: UInt = 0x40000000u

public val NOTE_FFOR: UInt = 0x80000000u

public val NOTE_FFCOPY: UInt = 0xc0000000u

public val NOTE_FFCTRLMASK: UInt = 0xc0000000u

public val NOTE_FFLAGSMASK: UInt = 0x00ffffffu

public val NOTE_LOWAT: UInt = 0x00000001u

public val NOTE_EOF: UInt = 0x00000002u

public val NOTE_OOB: UInt = 0x00000004u

public val NOTE_DELETE: UInt = 0x00000001u

public val NOTE_WRITE: UInt = 0x00000002u

public val NOTE_EXTEND: UInt = 0x00000004u

public val NOTE_ATTRIB: UInt = 0x00000008u

public val NOTE_LINK: UInt = 0x00000010u

public val NOTE_RENAME: UInt = 0x00000020u

public val NOTE_REVOKE: UInt = 0x00000040u

public val NOTE_TRUNCATE: UInt = 0x00000080u

public val NOTE_EXIT: UInt = 0x80000000u

public val NOTE_FORK: UInt = 0x40000000u

public val NOTE_EXEC: UInt = 0x20000000u

public val NOTE_PDATAMASK: UInt = 0x000fffffu

public val NOTE_PCTRLMASK: UInt = 0xf0000000u

public val NOTE_TRACK: UInt = 0x00000001u

public val NOTE_TRACKERR: UInt = 0x00000002u

public val NOTE_CHILD: UInt = 0x00000004u

public val NOTE_CHANGE: UInt = 0x00000001u

public val TMP_MAX: CUint = 0x7fffffffu

public val AI_PASSIVE: CInt = 1

public val AI_CANONNAME: CInt = 2

public val AI_NUMERICHOST: CInt = 4

public val AI_EXT: CInt = 8

public val AI_NUMERICSERV: CInt = 16

public val AI_FQDN: CInt = 32

public val AI_ADDRCONFIG: CInt = 64

public val NI_NUMERICHOST: CInt = 1

public val NI_NUMERICSERV: CInt = 2

public val NI_NOFQDN: CInt = 4

public val NI_NAMEREQD: CInt = 8

public val NI_DGRAM: CInt = 16

public val NI_MAXHOST: SizeT = 256uL

public val RTLD_LOCAL: CInt = 0

public val CTL_MAXNAME: CInt = 12

public val CTLTYPE_NODE: CInt = 1

public val CTLTYPE_INT: CInt = 2

public val CTLTYPE_STRING: CInt = 3

public val CTLTYPE_QUAD: CInt = 4

public val CTLTYPE_STRUCT: CInt = 5

public val CTL_UNSPEC: CInt = 0

public val CTL_KERN: CInt = 1

public val CTL_VM: CInt = 2

public val CTL_FS: CInt = 3

public val CTL_NET: CInt = 4

public val CTL_DEBUG: CInt = 5

public val CTL_HW: CInt = 6

public val CTL_MACHDEP: CInt = 7

public val CTL_DDB: CInt = 9

public val CTL_VFS: CInt = 10

public val CTL_MAXID: CInt = 11

public val HW_NCPUONLINE: CInt = 25

public val KERN_OSTYPE: CInt = 1

public val KERN_OSRELEASE: CInt = 2

public val KERN_OSREV: CInt = 3

public val KERN_VERSION: CInt = 4

public val KERN_MAXVNODES: CInt = 5

public val KERN_MAXPROC: CInt = 6

public val KERN_MAXFILES: CInt = 7

public val KERN_ARGMAX: CInt = 8

public val KERN_SECURELVL: CInt = 9

public val KERN_HOSTNAME: CInt = 10

public val KERN_HOSTID: CInt = 11

public val KERN_CLOCKRATE: CInt = 12

public val KERN_PROF: CInt = 16

public val KERN_POSIX1: CInt = 17

public val KERN_NGROUPS: CInt = 18

public val KERN_JOB_CONTROL: CInt = 19

public val KERN_SAVED_IDS: CInt = 20

public val KERN_BOOTTIME: CInt = 21

public val KERN_DOMAINNAME: CInt = 22

public val KERN_MAXPARTITIONS: CInt = 23

public val KERN_RAWPARTITION: CInt = 24

public val KERN_MAXTHREAD: CInt = 25

public val KERN_NTHREADS: CInt = 26

public val KERN_OSVERSION: CInt = 27

public val KERN_SOMAXCONN: CInt = 28

public val KERN_SOMINCONN: CInt = 29

public val KERN_USERMOUNT: CInt = 30

public val KERN_NOSUIDCOREDUMP: CInt = 32

public val KERN_FSYNC: CInt = 33

public val KERN_SYSVMSG: CInt = 34

public val KERN_SYSVSEM: CInt = 35

public val KERN_SYSVSHM: CInt = 36

public val KERN_ARND: CInt = 37

public val KERN_MSGBUFSIZE: CInt = 38

public val KERN_MALLOCSTATS: CInt = 39

public val KERN_CPTIME: CInt = 40

public val KERN_NCHSTATS: CInt = 41

public val KERN_FORKSTAT: CInt = 42

public val KERN_NSELCOLL: CInt = 43

public val KERN_TTY: CInt = 44

public val KERN_CCPU: CInt = 45

public val KERN_FSCALE: CInt = 46

public val KERN_NPROCS: CInt = 47

public val KERN_MSGBUF: CInt = 48

public val KERN_POOL: CInt = 49

public val KERN_STACKGAPRANDOM: CInt = 50

public val KERN_SYSVIPC_INFO: CInt = 51

public val KERN_SPLASSERT: CInt = 54

public val KERN_PROC_ARGS: CInt = 55

public val KERN_NFILES: CInt = 56

public val KERN_TTYCOUNT: CInt = 57

public val KERN_NUMVNODES: CInt = 58

public val KERN_MBSTAT: CInt = 59

public val KERN_SEMINFO: CInt = 61

public val KERN_SHMINFO: CInt = 62

public val KERN_INTRCNT: CInt = 63

public val KERN_WATCHDOG: CInt = 64

public val KERN_PROC: CInt = 66

public val KERN_MAXCLUSTERS: CInt = 67

public val KERN_EVCOUNT: CInt = 68

public val KERN_TIMECOUNTER: CInt = 69

public val KERN_MAXLOCKSPERUID: CInt = 70

public val KERN_CPTIME2: CInt = 71

public val KERN_CACHEPCT: CInt = 72

public val KERN_FILE: CInt = 73

public val KERN_CONSDEV: CInt = 75

public val KERN_NETLIVELOCKS: CInt = 76

public val KERN_POOL_DEBUG: CInt = 77

public val KERN_PROC_CWD: CInt = 78

public val KERN_PROC_NOBROADCASTKILL: CInt = 79

public val KERN_PROC_VMMAP: CInt = 80

public val KERN_GLOBAL_PTRACE: CInt = 81

public val KERN_CONSBUFSIZE: CInt = 82

public val KERN_CONSBUF: CInt = 83

public val KERN_AUDIO: CInt = 84

public val KERN_CPUSTATS: CInt = 85

public val KERN_PFSTATUS: CInt = 86

public val KERN_TIMEOUT_STATS: CInt = 87

public val KERN_MAXID: CInt = 88

public val KERN_PROC_ALL: CInt = 0

public val KERN_PROC_PID: CInt = 1

public val KERN_PROC_PGRP: CInt = 2

public val KERN_PROC_SESSION: CInt = 3

public val KERN_PROC_TTY: CInt = 4

public val KERN_PROC_UID: CInt = 5

public val KERN_PROC_RUID: CInt = 6

public val KERN_PROC_KTHREAD: CInt = 7

public val KERN_PROC_SHOW_THREADS: CInt = 0x40000000

public val KERN_SYSVIPC_MSG_INFO: CInt = 1

public val KERN_SYSVIPC_SEM_INFO: CInt = 2

public val KERN_SYSVIPC_SHM_INFO: CInt = 3

public val KERN_PROC_ARGV: CInt = 1

public val KERN_PROC_NARGV: CInt = 2

public val KERN_PROC_ENV: CInt = 3

public val KERN_PROC_NENV: CInt = 4

public val KI_NGROUPS: CInt = 16

public val KI_MAXCOMLEN: CInt = 24

public val KI_WMESGLEN: CInt = 8

public val KI_MAXLOGNAME: CInt = 32

public val KI_EMULNAMELEN: CInt = 8

public val KVE_ET_OBJ: CInt = 0x00000001

public val KVE_ET_SUBMAP: CInt = 0x00000002

public val KVE_ET_COPYONWRITE: CInt = 0x00000004

public val KVE_ET_NEEDSCOPY: CInt = 0x00000008

public val KVE_ET_HOLE: CInt = 0x00000010

public val KVE_ET_NOFAULT: CInt = 0x00000020

public val KVE_ET_STACK: CInt = 0x00000040

public val KVE_ET_WC: CInt = 0x000000080

public val KVE_ET_CONCEAL: CInt = 0x000000100

public val KVE_ET_SYSCALL: CInt = 0x000000200

public val KVE_ET_FREEMAPPED: CInt = 0x000000800

public val KVE_PROT_NONE: CInt = 0x00000000

public val KVE_PROT_READ: CInt = 0x00000001

public val KVE_PROT_WRITE: CInt = 0x00000002

public val KVE_PROT_EXEC: CInt = 0x00000004

public val KVE_ADV_NORMAL: CInt = 0x00000000

public val KVE_ADV_RANDOM: CInt = 0x00000001

public val KVE_ADV_SEQUENTIAL: CInt = 0x00000002

public val KVE_INH_SHARE: CInt = 0x00000000

public val KVE_INH_COPY: CInt = 0x00000010

public val KVE_INH_NONE: CInt = 0x00000020

public val KVE_INH_ZERO: CInt = 0x00000030

public val KVE_F_STATIC: CInt = 0x1

public val KVE_F_KMEM: CInt = 0x2

public val CHWFLOW: TcflagT = MDMBUF or CRTSCTS

public val OLCUC: TcflagT = 0x20

public val ONOCR: TcflagT = 0x40

public val ONLRET: TcflagT = 0x80

// https://github.com/openbsd/src/blob/HEAD/sys/sys/mount.h
public val ISOFSMNT_NORRIP: CInt = 0x1

// disable Rock Ridge Ext
public val ISOFSMNT_GENS: CInt = 0x2

// enable generation numbers
public val ISOFSMNT_EXTATT: CInt = 0x4

// enable extended attr
public val ISOFSMNT_NOJOLIET: CInt = 0x8

// disable Joliet Ext
public val ISOFSMNT_SESS: CInt = 0x10

// use isoArgs.sess
public val NFS_ARGSVERSION: CInt = 4

// change when nfsArgs changes
public val NFSMNT_RESVPORT: CInt = 0

// always use reserved ports
public val NFSMNT_SOFT: CInt = 0x1

// soft mount (hard is default)
public val NFSMNT_WSIZE: CInt = 0x2

// set write size
public val NFSMNT_RSIZE: CInt = 0x4

// set read size
public val NFSMNT_TIMEO: CInt = 0x8

// set initial timeout
public val NFSMNT_RETRANS: CInt = 0x10

// set number of request retries
public val NFSMNT_MAXGRPS: CInt = 0x20

// set maximum grouplist size
public val NFSMNT_INT: CInt = 0x40

// allow interrupts on hard mount
public val NFSMNT_NOCONN: CInt = 0x80

// Don't Connect the socket
public val NFSMNT_NQNFS: CInt = 0x100

// Use Nqnfs protocol
public val NFSMNT_NFSV3: CInt = 0x200

// Use NFS Version 3 protocol
public val NFSMNT_KERB: CInt = 0x400

// Use Kerberos authentication
public val NFSMNT_DUMBTIMR: CInt = 0x800

// Don't estimate rtt dynamically
public val NFSMNT_LEASETERM: CInt = 0x1000

// set lease term (nqnfs)
public val NFSMNT_READAHEAD: CInt = 0x2000

// set read ahead
public val NFSMNT_DEADTHRESH: CInt = 0x4000

// set dead server retry thresh
public val NFSMNT_NOAC: CInt = 0x8000

// disable attribute cache
public val NFSMNT_RDIRPLUS: CInt = 0x10000

// Use Readdirplus for V3
public val NFSMNT_READDIRSIZE: CInt = 0x20000

// Set readdir size
// Flags valid only in mount syscall arguments
public val NFSMNT_ACREGMIN: CInt = 0x40000

// acregmin field valid
public val NFSMNT_ACREGMAX: CInt = 0x80000

// acregmax field valid
public val NFSMNT_ACDIRMIN: CInt = 0x100000

// acdirmin field valid
public val NFSMNT_ACDIRMAX: CInt = 0x200000

// acdirmax field valid
// Flags valid only in kernel
public val NFSMNT_INTERNAL: CInt = 0xfffc0000

// Bits set internally
public val NFSMNT_HASWRITEVERF: CInt = 0x40000

// Has write verifier for V3
public val NFSMNT_GOTPATHCONF: CInt = 0x80000

// Got the V3 pathconf info
public val NFSMNT_GOTFSINFO: CInt = 0x100000

// Got the V3 fsinfo
public val NFSMNT_MNTD: CInt = 0x200000

// Mnt server for mnt point
public val NFSMNT_DISMINPROG: CInt = 0x400000

// Dismount in progress
public val NFSMNT_DISMNT: CInt = 0x800000

// Dismounted
public val NFSMNT_SNDLOCK: CInt = 0x1000000

// Send socket lock
public val NFSMNT_WANTSND: CInt = 0x2000000

// Want above
public val NFSMNT_RCVLOCK: CInt = 0x4000000

// Rcv socket lock
public val NFSMNT_WANTRCV: CInt = 0x8000000

// Want above
public val NFSMNT_WAITAUTH: CInt = 0x10000000

// Wait for authentication
public val NFSMNT_HASAUTH: CInt = 0x20000000

// Has authenticator
public val NFSMNT_WANTAUTH: CInt = 0x40000000

// Wants an authenticator
public val NFSMNT_AUTHERR: CInt = 0x80000000

// Authentication error
public val MSDOSFSMNT_SHORTNAME: CInt = 0x1

// Force old DOS short names only
public val MSDOSFSMNT_LONGNAME: CInt = 0x2

// Force Win'95 long names
public val MSDOSFSMNT_NOWIN95: CInt = 0x4

// Completely ignore Win95 entries
public val NTFS_MFLAG_CASEINS: CInt = 0x1

public val NTFS_MFLAG_ALLNAMES: CInt = 0x2

public val TMPFS_ARGS_VERSION: CInt = 1

public val SI_MAXSZ: SizeT = 128uL

public val SI_PAD: SizeT = (SI_MAXSZ / sizeOf<CInt>()) - 3uL

public val MAP_STACK: CInt = 0x4000

public val MAP_CONCEAL: CInt = 0x8000

// https://github.com/openbsd/src/blob/f8a2f73b6503213f5eb24ca315ac7e1f9421c0c9/sys/net/if.h#L135
public val LINK_STATE_UNKNOWN: CInt = 0

// link unknown
public val LINK_STATE_INVALID: CInt = 1

// link invalid
public val LINK_STATE_DOWN: CInt = 2

// link is down
public val LINK_STATE_KALIVE_DOWN: CInt = 3

// keepalive reports down
public val LINK_STATE_UP: CInt = 4

// link is up
public val LINK_STATE_HALF_DUPLEX: CInt = 5

// link is up and half duplex
public val LINK_STATE_FULL_DUPLEX: CInt = 6

// link is up and full duplex
// https://github.com/openbsd/src/blob/HEAD/sys/net/if.h#L187
public val IFF_UP: CInt = 0x1

// interface is up
public val IFF_BROADCAST: CInt = 0x2

// broadcast address valid
public val IFF_DEBUG: CInt = 0x4

// turn on debugging
public val IFF_LOOPBACK: CInt = 0x8

// is a loopback net
public val IFF_POINTOPOINT: CInt = 0x10

// interface is point-to-point link
public val IFF_STATICARP: CInt = 0x20

// only static ARP
public val IFF_RUNNING: CInt = 0x40

// resources allocated
public val IFF_NOARP: CInt = 0x80

// no address resolution protocol
public val IFF_PROMISC: CInt = 0x100

// receive all packets
public val IFF_ALLMULTI: CInt = 0x200

// receive all multicast packets
public val IFF_OACTIVE: CInt = 0x400

// transmission in progress
public val IFF_SIMPLEX: CInt = 0x800

// can't hear own transmissions
public val IFF_LINK0: CInt = 0x1000

// per link layer defined bit
public val IFF_LINK1: CInt = 0x2000

// per link layer defined bit
public val IFF_LINK2: CInt = 0x4000

// per link layer defined bit
public val IFF_MULTICAST: CInt = 0x8000

// supports multicast
public val PTHREAD_STACK_MIN: SizeT = 1u shl MAX_PAGE_SHIFT

public val MINSIGSTKSZ: SizeT = 3u shl MAX_PAGE_SHIFT

public val SIGSTKSZ: SizeT = MINSIGSTKSZ + (1u shl MAX_PAGE_SHIFT) * 4

public val PT_SET_EVENT_MASK: CInt = 12

public val PT_GET_EVENT_MASK: CInt = 13

public val PT_GET_PROCESS_STATE: CInt = 14

public val PT_GET_THREAD_FIRST: CInt = 15

public val PT_GET_THREAD_NEXT: CInt = 16

public val PT_FIRSTMACH: CInt = 32

public val PT_PTS_NAMELEN: CInt = 32

public val SOCK_CLOEXEC: CInt = 0x8000

public val SOCK_NONBLOCK: CInt = 0x4000

public val SOCK_DNS: CInt = 0x1000

public val BIOCGRSIG: CUlong = 0x40044273uL

public val BIOCSRSIG: CUlong = 0x80044272uL

public val BIOCSDLT: CUlong = 0x8004427auL

public val PTRACE_FORK: CInt = 0x0002

public val WCONTINUED: CInt = 0x08

public val WEXITED: CInt = 0x04

public val WSTOPPED: CInt = 0x02

// same as WUNTRACED
public val WNOWAIT: CInt = 0x10

public val WTRAPPED: CInt = 0x20

public val P_ALL: io.github.kotlinmania.libc.IdtypeT = 0u

public val P_PGID: io.github.kotlinmania.libc.IdtypeT = 1u

public val P_PID: io.github.kotlinmania.libc.IdtypeT = 2u

// search.h
public val FIND: io.github.kotlinmania.libc.Action = 0u

public val ENTER: io.github.kotlinmania.libc.Action = 1u

// futex.h
public val FUTEX_WAIT: CInt = 1

public val FUTEX_WAKE: CInt = 2

public val FUTEX_REQUEUE: CInt = 3

public val FUTEX_PRIVATE_FLAG: CInt = 128

// sysctl.h, kinfoProc pEflag constants
public val EPROC_CTTY: Int = 0x01

// controlling tty vnode active
public val EPROC_SLEADER: Int = 0x02

// session leader
public val EPROC_UNVEIL: Int = 0x04

// has unveil settings
public val EPROC_LKUNVEIL: Int = 0x08

// unveil is locked
// Flags for chflags(2)
public val UF_SETTABLE: CUint = 0x0000ffffu

public val UF_NODUMP: CUint = 0x00000001u

public val UF_IMMUTABLE: CUint = 0x00000002u

public val UF_APPEND: CUint = 0x00000004u

public val UF_OPAQUE: CUint = 0x00000008u

public val SF_SETTABLE: CUint = 0xffff0000u

public val SF_ARCHIVED: CUint = 0x00010000u

public val SF_IMMUTABLE: CUint = 0x00020000u

public val SF_APPEND: CUint = 0x00040000u

// sys/execElf.h - Legal values for pType (segment type).
public val PT_NULL: UInt = 0u

public val PT_LOAD: UInt = 1u

public val PT_DYNAMIC: UInt = 2u

public val PT_INTERP: UInt = 3u

public val PT_NOTE: UInt = 4u

public val PT_SHLIB: UInt = 5u

public val PT_PHDR: UInt = 6u

public val PT_TLS: UInt = 7u

public val PT_LOOS: UInt = 0x60000000u

public val PT_HIOS: UInt = 0x6fffffffu

public val PT_LOPROC: UInt = 0x70000000u

public val PT_HIPROC: UInt = 0x7fffffffu

public val PT_GNU_EH_FRAME: UInt = 0x6474e550u

public val PT_GNU_RELRO: UInt = 0x6474e552u

// sys/execElf.h - Legal values for pFlags (segment flags).
public val PF_X: UInt = 0x1u

public val PF_W: UInt = 0x2u

public val PF_R: UInt = 0x4u

public val PF_MASKOS: UInt = 0x0ff00000u

public val PF_MASKPROC: UInt = 0xf0000000u

// sys/ioccom.h
public fun iocparmLen(x: UInt): UInt {
    return (x shr 16) and IOCPARM_MASK
}

public fun iocbasecmd(x: UInt): UInt {
    return x and ((IOCPARM_MASK shl 16).inv())
}

public fun iocgroup(x: UInt): UInt {
    return (x shr 8) and 0xffu
}

public fun ioc(inout: CUlong, group: CUlong, num: CUlong, len: CUlong): CUlong {
    return (inout) or (((len) and IOCPARM_MASK.toULong()) shl 16) or ((group) shl 8) or (num)
}

// sys/mount.h
public val MNT_NOPERM: CInt = 0x00000020

public val MNT_WXALLOWED: CInt = 0x00000800

public val MNT_EXRDONLY: CInt = 0x00000080

public val MNT_DEFEXPORTED: CInt = 0x00000200

public val MNT_EXPORTANON: CInt = 0x00000400

public val MNT_ROOTFS: CInt = 0x00004000

public val MNT_NOATIME: CInt = 0x00008000

public val MNT_DELEXPORT: CInt = 0x00020000

public val MNT_STALLED: CInt = 0x00100000

public val MNT_SWAPPABLE: CInt = 0x00200000

public val MNT_WANTRDWR: CInt = 0x02000000

public val MNT_SOFTDEP: CInt = 0x04000000

public val MNT_DOOMED: CInt = 0x08000000

// For use with vfsFsync and getfsstat
public val MNT_WAIT: CInt = 1

public val MNT_NOWAIT: CInt = 2

public val MNT_LAZY: CInt = 3

// sys/_time.h
public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 4

public val CLOCK_UPTIME: ClockidT = 5

public val CLOCK_BOOTTIME: ClockidT = 6

public val LC_COLLATE_MASK: CInt = 1 shl LC_COLLATE

public val LC_CTYPE_MASK: CInt = 1 shl LC_CTYPE

public val LC_MONETARY_MASK: CInt = 1 shl LC_MONETARY

public val LC_NUMERIC_MASK: CInt = 1 shl LC_NUMERIC

public val LC_TIME_MASK: CInt = 1 shl LC_TIME

public val LC_MESSAGES_MASK: CInt = 1 shl LC_MESSAGES

public val LC_LAST: CInt = 7

public val LC_ALL_MASK: CInt = (1 shl LC_LAST) - 2

public val LC_GLOBAL_LOCALE: LocaleT = (-1 as LocaleT)

// sys/reboot.h
public val RB_ASKNAME: CInt = 0x00001

public val RB_SINGLE: CInt = 0x00002

public val RB_NOSYNC: CInt = 0x00004

public val RB_HALT: CInt = 0x00008

public val RB_INITNAME: CInt = 0x00010

public val RB_KDB: CInt = 0x00040

public val RB_RDONLY: CInt = 0x00080

public val RB_DUMP: CInt = 0x00100

public val RB_MINIROOT: CInt = 0x00200

public val RB_CONFIG: CInt = 0x00400

public val RB_TIMEBAD: CInt = 0x00800

public val RB_POWERDOWN: CInt = 0x01000

public val RB_SERCONS: CInt = 0x02000

public val RB_USERREQ: CInt = 0x04000

public val RB_RESET: CInt = 0x08000

public val RB_GOODRANDOM: CInt = 0x10000

public val RB_UNHIBERNATE: CInt = 0x20000

// net/route.h
public val RTF_CLONING: CInt = 0x100

public val RTF_MULTICAST: CInt = 0x200

public val RTF_LLINFO: CInt = 0x400

public val RTF_PROTO3: CInt = 0x2000

public val RTF_ANNOUNCE: CInt = RTF_PROTO2

public val RTF_CLONED: CInt = 0x10000

public val RTF_CACHED: CInt = 0x20000

public val RTF_MPATH: CInt = 0x40000

public val RTF_MPLS: CInt = 0x100000

public val RTF_LOCAL: CInt = 0x200000

public val RTF_BROADCAST: CInt = 0x400000

public val RTF_CONNECTED: CInt = 0x800000

public val RTF_BFD: CInt = 0x1000000

public val RTF_FMASK: CInt = RTF_LLINFO or RTF_PROTO1 or RTF_PROTO2 or RTF_PROTO3 or RTF_BLACKHOLE or RTF_REJECT or RTF_STATIC or RTF_MPLS or RTF_BFD

public val RTM_VERSION: CInt = 5

public val RTM_RESOLVE: CInt = 0xb

public val RTM_NEWADDR: CInt = 0xc

public val RTM_DELADDR: CInt = 0xd

public val RTM_IFINFO: CInt = 0xe

public val RTM_IFANNOUNCE: CInt = 0xf

public val RTM_DESYNC: CInt = 0x10

public val RTM_INVALIDATE: CInt = 0x11

public val RTM_BFD: CInt = 0x12

public val RTM_PROPOSAL: CInt = 0x13

public val RTM_CHGADDRATTR: CInt = 0x14

public val RTM_80211INFO: CInt = 0x15

public val RTM_SOURCE: CInt = 0x16

public val RTA_SRC: CInt = 0x100

public val RTA_SRCMASK: CInt = 0x200

public val RTA_LABEL: CInt = 0x400

public val RTA_BFD: CInt = 0x800

public val RTA_DNS: CInt = 0x1000

public val RTA_STATIC: CInt = 0x2000

public val RTA_SEARCH: CInt = 0x4000

public val RTAX_SRC: CInt = 8

public val RTAX_SRCMASK: CInt = 9

public val RTAX_LABEL: CInt = 10

public val RTAX_BFD: CInt = 11

public val RTAX_DNS: CInt = 12

public val RTAX_STATIC: CInt = 13

public val RTAX_SEARCH: CInt = 14

public val RTAX_MAX: CInt = 15

public fun align(p: Int): Int {
    return (p + ALIGNBYTES) and ALIGNBYTES.inv()
}

public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    return ((((cmsg)?.hashCode()?.toLong() ?: 0L).toUByte()))?.let { COpaquePointer(it.hashCode().toLong() + (ALIGN(sizeOf<Cmsghdr>()).toInt()).toLong()) }
}

public fun cmsgLen(length: CUint): CUint {
    return ALIGN(sizeOf<Cmsghdr>()).toUInt() + length
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if ((cmsg == null)) {
        return CMSG_FIRSTHDR(mhdr)
    }
    val next = ((cmsg)?.hashCode()?.toLong() ?: 0L).toInt() + ALIGN((cmsg!!.cmsgLen).toInt()) + ALIGN(sizeOf<Cmsghdr>())
    val max = (mhdr!!.msgControl).toInt() + (mhdr!!.msgControllen).toInt()
    return if (next > max) {
        nullMut<Cmsghdr>()
    } else {
        null
    }
}

public fun cmsgSpace(length: CUint): CUint {
    return (ALIGN(sizeOf<Cmsghdr>()) + ALIGN(length.toInt())).toUInt()
}

public fun wstopsig(status: CInt): CInt {
    return status shr 8
}

public fun wifsignaled(status: CInt): Boolean {
    return (status and 127) != 127 && (status and 127) != 0
}

public fun wifstopped(status: CInt): Boolean {
    return (status and 0xff) == 127
}

public fun wifcontinued(status: CInt): Boolean {
    return (status and 65535) == 65535
}

public fun makedev(major: CUint, minor: CUint): io.github.kotlinmania.libc.DevT {
    val major1 = major.toInt()
    val minor1 = minor.toInt()
    var dev = 0
    dev = dev or ((major1 and 0xff) shl 8)
    dev = dev or (minor1 and 0xff)
    dev = dev or ((minor1 and 0xffff00) shl 8)
    return dev
}

public fun major(dev: io.github.kotlinmania.libc.DevT): CUint {
    return ((dev.toUInt()) shr 8) and 0xffu
}

public fun minor(dev: io.github.kotlinmania.libc.DevT): CUint {
    val dev1 = dev.toUInt()
    var res = 0
    res = res or ((dev1) and 0xffu)
    res = res or (((dev1) and 0xffff0000u) shr 8)
    return res
}

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt

public expect fun settimeofday(tp: Timeval?, tz: Timezone?): CInt

public expect fun pledge(promises: String?, execpromises: String?): CInt

public expect fun unveil(path: String?, permissions: String?): CInt

public expect fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun chflags(path: String?, flags: CUint): CInt

public expect fun fchflags(fd: CInt, flags: CUint): CInt

public expect fun chflagsat(fd: CInt, path: String?, flags: CUint, atflag: CInt): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt

public expect fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt

public expect fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt

public expect fun kevent(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent?, nevents: CInt, timeout: Timespec?): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun getthrid(): PidT

public expect fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt

public expect fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt

public expect fun pthreadMainNp(): CInt

public expect fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT)

public expect fun pthreadSetNameNp(tid: PthreadT, name: String?)

public expect fun pthreadStacksegNp(thread: PthreadT, sinfo: StackT?): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt

public expect fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT

public expect fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt

public expect fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

// #include <link.h>
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun duplocale(base: LocaleT): LocaleT

// Added in `OpenBSD` 5.5
public expect fun explicitBzero(s: COpaquePointer?, len: SizeT)

public expect fun setproctitle(fmt: String?, vararg variadicArgs: Long)

public expect fun freezero(ptr: COpaquePointer?, size: SizeT)

public expect fun mallocConceal(size: SizeT): COpaquePointer?

public expect fun callocConceal(nmemb: SizeT, size: SizeT): COpaquePointer?

public expect fun srand48Deterministic(seed: CLong)

public expect fun seed48Deterministic(xseed: CUshort?): CUshort?

public expect fun lcong48Deterministic(p: CUshort?)

public expect fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer?

public expect fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer?

public expect fun hcreate(nelt: SizeT): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: io.github.kotlinmania.libc.Entry, action: io.github.kotlinmania.libc.Action): Entry?

// futex.h
public expect fun futex(uaddr: UInt?, op: CInt, value: CInt, timeout: Timespec?, uaddr2: UInt?): CInt

public expect fun mimmutable(addr: COpaquePointer?, len: SizeT): CInt

public expect fun reboot(mode: CInt): CInt

public expect fun statfs(path: String?, buf: Statfs?): CInt

public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt

public expect fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt

public expect fun getfsstat(buf: Statfs?, bufsize: SizeT, flags: CInt): CInt

public expect fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt

public expect fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT

public expect fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer?

public expect fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt

public expect fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer?
