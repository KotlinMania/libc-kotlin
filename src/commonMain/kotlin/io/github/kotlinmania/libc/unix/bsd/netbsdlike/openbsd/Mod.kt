// port-lint: source unix/bsd/netbsdlike/openbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public typealias ClockT = Long
public typealias SusecondsT = CLong
public typealias DevT = Int
public typealias SigsetT = CUInt
public typealias BlksizeT = Int
public typealias FsblkcntT = ULong
public typealias FsfilcntT = ULong
public typealias IdtypeT = CUInt
public typealias PthreadAttrT = COpaquePointer?
public typealias PthreadMutexT = COpaquePointer?
public typealias PthreadMutexattrT = COpaquePointer?
public typealias PthreadCondT = COpaquePointer?
public typealias PthreadCondattrT = COpaquePointer?
public typealias PthreadRwlockT = COpaquePointer?
public typealias PthreadRwlockattrT = COpaquePointer?
public typealias PthreadSpinlockT = UintptrT
public typealias CaddrT = String?
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
public typealias ENTRY = Entry
public typealias ACTION = CUInt
public typealias PosixSpawnattrT = COpaquePointer?
public typealias PosixSpawnFileActionsT = COpaquePointer?

public data class IpMreqn(
    val imrMultiaddr: InAddr,
    val imrAddress: InAddr,
    val imrIfindex: CInt,
)

public data class GlobT(
    val glPathc: ULong,
    val glMatchc: ULong,
    val glOffs: ULong,
    val glFlags: CInt,
    val glPathv: COpaquePointer?,
)

public data class Tm(
    val tmSec: CInt,
    val tmMin: CInt,
    val tmHour: CInt,
    val tmMday: CInt,
    val tmMon: CInt,
    val tmYear: CInt,
    val tmWday: CInt,
    val tmYday: CInt,
    val tmIsdst: CInt,
    val tmGmtoff: CLong,
    val tmZone: String?,
)

public data class Lconv(
    val decimalPoint: String?,
    val thousandsSep: String?,
    val grouping: String?,
    val intCurrSymbol: String?,
    val currencySymbol: String?,
    val monDecimalPoint: String?,
    val monThousandsSep: String?,
    val monGrouping: String?,
    val positiveSign: String?,
    val negativeSign: String?,
    val intFracDigits: CChar,
    val fracDigits: CChar,
    val pCsPrecedes: CChar,
    val pSepBySpace: CChar,
    val nCsPrecedes: CChar,
    val nSepBySpace: CChar,
    val pSignPosn: CChar,
    val nSignPosn: CChar,
    val intPCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intNCsPrecedes: CChar,
    val intNSepBySpace: CChar,
    val intPSignPosn: CChar,
    val intNSignPosn: CChar,
)

public data class UfsArgs(
    val fspec: String?,
    val exportInfo: ExportArgs,
)

public data class MfsArgs(
    val fspec: String?,
    val exportInfo: ExportArgs,
    val base: String?,
    val size: CULong,
)

public data class IsoArgs(
    val fspec: String?,
    val exportInfo: ExportArgs,
    val flags: CInt,
    val sess: CInt,
)

public data class NfsArgs(
    val version: CInt,
    val addr: Sockaddr?,
    val addrlen: CInt,
    val sotype: CInt,
    val proto: CInt,
    val fh: COpaquePointer?,
    val fhsize: CInt,
    val flags: CInt,
    val wsize: CInt,
    val rsize: CInt,
    val readdirsize: CInt,
    val timeo: CInt,
    val retrans: CInt,
    val maxgrouplist: CInt,
    val readahead: CInt,
    val leaseterm: CInt,
    val deadthresh: CInt,
    val hostname: String?,
    val acregmin: CInt,
    val acregmax: CInt,
    val acdirmin: CInt,
    val acdirmax: CInt,
)

public data class MsdosfsArgs(
    val fspec: String?,
    val exportInfo: ExportArgs,
    val uid: UidT,
    val gid: GidT,
    val mask: ModeT,
    val flags: CInt,
)

public data class NtfsArgs(
    val fspec: String?,
    val exportInfo: ExportArgs,
    val uid: UidT,
    val gid: GidT,
    val mode: ModeT,
    val flag: CULong,
)

public data class UdfArgs(
    val fspec: String?,
    val lastblock: UInt,
)

public data class TmpfsArgs(
    val taVersion: CInt,
    val taNodesMax: InoT,
    val taSizeMax: OffT,
    val taRootUid: UidT,
    val taRootGid: GidT,
    val taRootMode: ModeT,
)

public data class FusefsArgs(
    val name: String?,
    val fd: CInt,
    val maxRead: CInt,
    val allowOther: CInt,
)

public data class Xucred(
    val crUid: UidT,
    val crGid: GidT,
    val crNgroups: CShort,
    val crGroups: List<GidT>,
)

public data class ExportArgs(
    val exFlags: CInt,
    val exRoot: UidT,
    val exAnon: Xucred,
    val exAddr: Sockaddr?,
    val exAddrlen: CInt,
    val exMask: Sockaddr?,
    val exMasklen: CInt,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class InAddr(
    val sAddr: InAddrT,
)

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class Splice(
    val spFd: CInt,
    val spMax: OffT,
    val spIdle: Timeval,
)

public data class Kevent(
    val ident: UintptrT,
    val filter: CShort,
    val flags: CUShort,
    val fflags: CUInt,
    val data: Long,
    val udata: COpaquePointer?,
)

public data class Stat(
    val stMode: ModeT,
    val stDev: DevT,
    val stIno: InoT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stSize: OffT,
    val stBlocks: BlkcntT,
    val stBlksize: BlksizeT,
    val stFlags: UInt,
    val stGen: UInt,
    val stBirthtime: TimeT,
    val stBirthtimeNsec: CLong,
)

public data class Statvfs(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFavail: FsfilcntT,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
)

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: SocklenT,
    val aiAddr: Sockaddr?,
    val aiCanonname: String?,
    val aiNext: Addrinfo?,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class IfData(
    val ifiType: CUChar,
    val ifiAddrlen: CUChar,
    val ifiHdrlen: CUChar,
    val ifiLinkState: CUChar,
    val ifiMtu: UInt,
    val ifiMetric: UInt,
    val ifiRdomain: UInt,
    val ifiBaudrate: ULong,
    val ifiIpackets: ULong,
    val ifiIerrors: ULong,
    val ifiOpackets: ULong,
    val ifiOerrors: ULong,
    val ifiCollisions: ULong,
    val ifiIbytes: ULong,
    val ifiObytes: ULong,
    val ifiImcasts: ULong,
    val ifiOmcasts: ULong,
    val ifiIqdrops: ULong,
    val ifiOqdrops: ULong,
    val ifiNoproto: ULong,
    val ifiCapabilities: UInt,
    val ifiLastchange: Timeval,
)

public data class IfMsghdr(
    val ifmMsglen: CUShort,
    val ifmVersion: CUChar,
    val ifmType: CUChar,
    val ifmHdrlen: CUShort,
    val ifmIndex: CUShort,
    val ifmTableid: CUShort,
    val ifmPad1: CUChar,
    val ifmPad2: CUChar,
    val ifmAddrs: CInt,
    val ifmFlags: CInt,
    val ifmXflags: CInt,
    val ifmData: IfData,
)

public data class SockaddrDl(
    val sdlLen: CUChar,
    val sdlFamily: CUChar,
    val sdlIndex: CUShort,
    val sdlType: CUChar,
    val sdlNlen: CUChar,
    val sdlAlen: CUChar,
    val sdlSlen: CUChar,
    val sdlData: ByteArray,
)

public data class Sockpeercred(
    val uid: UidT,
    val gid: GidT,
    val pid: PidT,
)

public data class Arphdr(
    val arHrd: UShort,
    val arPro: UShort,
    val arHln: UByte,
    val arPln: UByte,
    val arOp: UShort,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: CInt,
    val shmLpid: PidT,
    val shmCpid: PidT,
    val shmNattch: CShort,
    val shmAtime: TimeT,
    val shmAtimensec: CLong,
    val shmDtime: TimeT,
    val shmDtimensec: CLong,
    val shmCtime: TimeT,
    val shmCtimensec: CLong,
    val shmInternal: COpaquePointer?,
)

public data class Elf32Phdr(
    val pType: Elf32Word,
    val pOffset: Elf32Off,
    val pVaddr: Elf32Addr,
    val pPaddr: Elf32Addr,
    val pFilesz: Elf32Word,
    val pMemsz: Elf32Word,
    val pFlags: Elf32Word,
    val pAlign: Elf32Word,
)

public data class Elf64Phdr(
    val pType: Elf64Word,
    val pFlags: Elf64Word,
    val pOffset: Elf64Off,
    val pVaddr: Elf64Addr,
    val pPaddr: Elf64Addr,
    val pFilesz: Elf64Xword,
    val pMemsz: Elf64Xword,
    val pAlign: Elf64Xword,
)

public data class DlPhdrInfo(
    val dlpiAddr: ElfAddr,
    val dlpiName: String?,
    val dlpiPhdr: ElfPhdr?,
    val dlpiPhnum: ElfHalf,
)

public data class KinfoProc(
    val pForw: ULong,
    val pBack: ULong,
    val pPaddr: ULong,
    val pAddr: ULong,
    val pFd: ULong,
    val pStats: ULong,
    val pLimit: ULong,
    val pVmspace: ULong,
    val pSigacts: ULong,
    val pSess: ULong,
    val pTsess: ULong,
    val pRu: ULong,
    val pEflag: Int,
    val pExitsig: Int,
    val pFlag: Int,
    val pPid: Int,
    val pPpid: Int,
    val pSid: Int,
    val pPgid: Int,
    val pTpgid: Int,
    val pUid: UInt,
    val pRuid: UInt,
    val pGid: UInt,
    val pRgid: UInt,
    val pGroups: UIntArray,
    val pNgroups: Short,
    val pJobc: Short,
    val pTdev: UInt,
    val pEstcpu: UInt,
    val pRtimeSec: UInt,
    val pRtimeUsec: UInt,
    val pCpticks: Int,
    val pPctcpu: UInt,
    val pSwtime: UInt,
    val pSlptime: UInt,
    val pSchedflags: Int,
    val pUticks: ULong,
    val pSticks: ULong,
    val pIticks: ULong,
    val pTracep: ULong,
    val pTraceflag: Int,
    val pHoldcnt: Int,
    val pSiglist: Int,
    val pSigmask: UInt,
    val pSigignore: UInt,
    val pSigcatch: UInt,
    val pStat: Byte,
    val pPriority: UByte,
    val pUsrpri: UByte,
    val pNice: UByte,
    val pXstat: UShort,
    val pSpare: UShort,
    val pComm: ByteArray,
    val pWmesg: ByteArray,
    val pWchan: ULong,
    val pLogin: ByteArray,
    val pVmRssize: Int,
    val pVmTsize: Int,
    val pVmDsize: Int,
    val pVmSsize: Int,
    val pUvalid: Long,
    val pUstartSec: ULong,
    val pUstartUsec: UInt,
    val pUutimeSec: UInt,
    val pUutimeUsec: UInt,
    val pUstimeSec: UInt,
    val pUstimeUsec: UInt,
    val pUruMaxrss: ULong,
    val pUruIxrss: ULong,
    val pUruIdrss: ULong,
    val pUruIsrss: ULong,
    val pUruMinflt: ULong,
    val pUruMajflt: ULong,
    val pUruNswap: ULong,
    val pUruInblock: ULong,
    val pUruOublock: ULong,
    val pUruMsgsnd: ULong,
    val pUruMsgrcv: ULong,
    val pUruNsignals: ULong,
    val pUruNvcsw: ULong,
    val pUruNivcsw: ULong,
    val pUctimeSec: UInt,
    val pUctimeUsec: UInt,
    val pPsflags: UInt,
    val pAcflag: UInt,
    val pSvuid: UInt,
    val pSvgid: UInt,
    val pEmul: ByteArray,
    val pRlimRssCur: ULong,
    val pCpuid: ULong,
    val pVmMapSize: ULong,
    val pTid: Int,
    val pRtableid: UInt,
    val pPledge: ULong,
    val pName: ByteArray,
)

public data class KinfoVmentry(
    val kveStart: CULong,
    val kveEnd: CULong,
    val kveGuard: CULong,
    val kveFspace: CULong,
    val kveFspaceAugment: CULong,
    val kveOffset: ULong,
    val kveWiredCount: CInt,
    val kveEtype: CInt,
    val kveProtection: CInt,
    val kveMaxProtection: CInt,
    val kveAdvice: CInt,
    val kveInheritance: CInt,
    val kveFlags: UByte,
)

public data class PtraceState(
    val peReportEvent: CInt,
    val peOtherPid: PidT,
    val peTid: PidT,
)

public data class PtraceThreadState(
    val ptsTid: PidT,
    val ptsName: ByteArray,
)

public data class Entry(
    val key: String?,
    val data: COpaquePointer?,
)

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
)

public data class TcpInfo(
    val tcpiState: UByte,
    val tcpiCaState: UByte,
    val tcpiRetransmits: UByte,
    val tcpiProbes: UByte,
    val tcpiBackoff: UByte,
    val tcpiOptions: UByte,
    val tcpiSndWscale: UByte,
    val tcpiRcvWscale: UByte,
    val tcpiRto: UInt,
    val tcpiAto: UInt,
    val tcpiSndMss: UInt,
    val tcpiRcvMss: UInt,
    val tcpiUnacked: UInt,
    val tcpiSacked: UInt,
    val tcpiLost: UInt,
    val tcpiRetrans: UInt,
    val tcpiFackets: UInt,
    val tcpiLastDataSent: UInt,
    val tcpiLastAckSent: UInt,
    val tcpiLastDataRecv: UInt,
    val tcpiLastAckRecv: UInt,
    val tcpiPmtu: UInt,
    val tcpiRcvSsthresh: UInt,
    val tcpiRtt: UInt,
    val tcpiRttvar: UInt,
    val tcpiSndSsthresh: UInt,
    val tcpiSndCwnd: UInt,
    val tcpiAdvmss: UInt,
    val tcpiReordering: UInt,
    val tcpiRcvRtt: UInt,
    val tcpiRcvSpace: UInt,
    val tcpiSndWnd: UInt,
    val tcpiSndNxt: UInt,
    val tcpiRcvNxt: UInt,
    val tcpiToeTid: UInt,
    val tcpiSndRexmitpack: UInt,
    val tcpiRcvOoopack: UInt,
    val tcpiSndZerowin: UInt,
    val tcpiRttmin: UInt,
    val tcpiMaxSndwnd: UInt,
    val tcpiRcvAdv: UInt,
    val tcpiRcvUp: UInt,
    val tcpiSndUna: UInt,
    val tcpiSndUp: UInt,
    val tcpiSndWl1: UInt,
    val tcpiSndWl2: UInt,
    val tcpiSndMax: UInt,
    val tcpiTsRecent: UInt,
    val tcpiTsRecentAge: UInt,
    val tcpiRfbufCnt: UInt,
    val tcpiRfbufTs: UInt,
    val tcpiSoRcvSbCc: UInt,
    val tcpiSoRcvSbHiwat: UInt,
    val tcpiSoRcvSbLowat: UInt,
    val tcpiSoRcvSbWat: UInt,
    val tcpiSoSndSbCc: UInt,
    val tcpiSoSndSbHiwat: UInt,
    val tcpiSoSndSbLowat: UInt,
    val tcpiSoSndSbWat: UInt,
)

public data class Dirent(
    val dFileno: InoT,
    val dOff: OffT,
    val dReclen: UShort,
    val dType: UByte,
    val dNamlen: UByte,
    val dName: ByteArray,
)

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: SaFamilyT,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siErrno: CInt,
    val siAddr: String?,
)

public data class Lastlog(
    val llTime: TimeT,
    val llLine: ByteArray,
    val llHost: ByteArray,
)

public data class Utmp(
    val utLine: ByteArray,
    val utName: ByteArray,
    val utHost: ByteArray,
    val utTime: TimeT,
)

public data class Statfs(
    val fFlags: UInt,
    val fBsize: UInt,
    val fIosize: UInt,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: Long,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: Long,
    val fSyncwrites: ULong,
    val fSyncreads: ULong,
    val fAsyncwrites: ULong,
    val fAsyncreads: ULong,
    val fFsid: FsidT,
    val fNamemax: UInt,
    val fOwner: UidT,
    val fCtime: ULong,
    val fFstypename: ByteArray,
    val fMntonname: ByteArray,
    val fMntfromname: ByteArray,
    val fMntfromspec: ByteArray,
    val mountInfo: MountInfo,
)

// C union; only one variant is valid at a time.
public data class MountInfo(
    val ufsArgs: UfsArgs? = null,
    val mfsArgs: MfsArgs? = null,
    val nfsArgs: NfsArgs? = null,
    val isoArgs: IsoArgs? = null,
    val msdosfsArgs: MsdosfsArgs? = null,
    val ntfsArgs: NtfsArgs? = null,
    val tmpfsArgs: TmpfsArgs? = null,
    val align: ByteArray? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val ifruFlags: CShort? = null,
    val ifruMetric: CInt? = null,
    val ifruVnetid: Long? = null,
    val ifruMedia: ULong? = null,
    val ifruData: CaddrT? = null,
    val ifruIndex: CUInt? = null,
)

public const val UT_NAMESIZE: ULong = 32uL
public const val UT_LINESIZE: ULong = 8uL
public const val UT_HOSTSIZE: ULong = 256uL
public const val O_CLOEXEC: CInt = 0x10000
public const val O_DIRECTORY: CInt = 0x20000
public const val O_RSYNC: CInt = O_SYNC
public const val MS_SYNC: CInt = 0x0002
public const val MS_INVALIDATE: CInt = 0x0004
public const val POLLNORM: CShort = POLLRDNORM
public const val ENOATTR: CInt = 83
public const val EILSEQ: CInt = 84
public const val EOVERFLOW: CInt = 87
public const val ECANCELED: CInt = 88
public const val EIDRM: CInt = 89
public const val ENOMSG: CInt = 90
public const val ENOTSUP: CInt = 91
public const val EBADMSG: CInt = 92
public const val ENOTRECOVERABLE: CInt = 93
public const val EOWNERDEAD: CInt = 94
public const val EPROTO: CInt = 95
public const val ELAST: CInt = 95
public const val F_DUPFD_CLOEXEC: CInt = 10
public const val UTIME_OMIT: CLong = -1
public const val UTIME_NOW: CLong = -2
public const val AT_FDCWD: CInt = -100
public const val AT_EACCESS: CInt = 0x01
public const val AT_SYMLINK_NOFOLLOW: CInt = 0x02
public const val AT_SYMLINK_FOLLOW: CInt = 0x04
public const val AT_REMOVEDIR: CInt = 0x08
public const val AT_NULL: CInt = 0
public const val AT_IGNORE: CInt = 1
public const val AT_PAGESZ: CInt = 6
public const val AT_HWCAP: CInt = 25
public const val AT_HWCAP2: CInt = 26
public const val RLIM_NLIMITS: CInt = 9
public const val SO_TIMESTAMP: CInt = 0x0800
public const val SO_SNDTIMEO: CInt = 0x1005
public const val SO_RCVTIMEO: CInt = 0x1006
public const val SO_BINDANY: CInt = 0x1000
public const val SO_NETPROC: CInt = 0x1020
public const val SO_RTABLE: CInt = 0x1021
public const val SO_PEERCRED: CInt = 0x1022
public const val SO_SPLICE: CInt = 0x1023
public const val SO_DOMAIN: CInt = 0x1024
public const val SO_PROTOCOL: CInt = 0x1025
public const val IPPROTO_HOPOPTS: CInt = 0
public const val IPPROTO_IGMP: CInt = 2
public const val IPPROTO_GGP: CInt = 3
public const val IPPROTO_IPIP: CInt = 4
public const val IPPROTO_EGP: CInt = 8
public const val IPPROTO_PUP: CInt = 12
public const val IPPROTO_IDP: CInt = 22
public const val IPPROTO_TP: CInt = 29
public const val IPPROTO_ROUTING: CInt = 43
public const val IPPROTO_FRAGMENT: CInt = 44
public const val IPPROTO_RSVP: CInt = 46
public const val IPPROTO_GRE: CInt = 47
public const val IPPROTO_ESP: CInt = 50
public const val IPPROTO_AH: CInt = 51
public const val IPPROTO_MOBILE: CInt = 55
public const val IPPROTO_NONE: CInt = 59
public const val IPPROTO_DSTOPTS: CInt = 60
public const val IPPROTO_EON: CInt = 80
public const val IPPROTO_ETHERIP: CInt = 97
public const val IPPROTO_ENCAP: CInt = 98
public const val IPPROTO_PIM: CInt = 103
public const val IPPROTO_IPCOMP: CInt = 108
public const val IPPROTO_CARP: CInt = 112
public const val IPPROTO_MPLS: CInt = 137
public const val IPPROTO_PFSYNC: CInt = 240
public const val IPPROTO_MAX: CInt = 256
public const val IPPROTO_DIVERT: CInt = 258
public const val IP_RECVDSTADDR: CInt = 7
public const val IP_SENDSRCADDR: CInt = IP_RECVDSTADDR
public const val IP_RECVIF: CInt = 30
public const val TCP_MD5SIG: CInt = 0x04
public const val TCP_NOPUSH: CInt = 0x10
public const val MSG_WAITFORONE: CInt = 0x1000
public const val AF_ECMA: CInt = 8
public const val AF_ROUTE: CInt = 17
public const val AF_ENCAP: CInt = 28
public const val AF_SIP: CInt = 29
public const val AF_KEY: CInt = 30
public const val pseudo_AF_HDRCMPLT: CInt = 31
public const val AF_BLUETOOTH: CInt = 32
public const val AF_MPLS: CInt = 33
public const val pseudo_AF_PFLOW: CInt = 34
public const val pseudo_AF_PIPEX: CInt = 35
public const val NET_RT_DUMP: CInt = 1
public const val NET_RT_FLAGS: CInt = 2
public const val NET_RT_IFLIST: CInt = 3
public const val NET_RT_STATS: CInt = 4
public const val NET_RT_TABLE: CInt = 5
public const val NET_RT_IFNAMES: CInt = 6
public const val NET_RT_MAXID: CInt = 7
public const val IPV6_JOIN_GROUP: CInt = 12
public const val IPV6_LEAVE_GROUP: CInt = 13
public const val PF_ROUTE: CInt = AF_ROUTE
public const val PF_ECMA: CInt = AF_ECMA
public const val PF_ENCAP: CInt = AF_ENCAP
public const val PF_SIP: CInt = AF_SIP
public const val PF_KEY: CInt = AF_KEY
public const val PF_BPF: CInt = pseudo_AF_HDRCMPLT
public const val PF_BLUETOOTH: CInt = AF_BLUETOOTH
public const val PF_MPLS: CInt = AF_MPLS
public const val PF_PFLOW: CInt = pseudo_AF_PFLOW
public const val PF_PIPEX: CInt = pseudo_AF_PIPEX
public const val SCM_TIMESTAMP: CInt = 0x04
public const val O_DSYNC: CInt = 128
public const val MAP_RENAME: CInt = 0x0000
public const val MAP_NORESERVE: CInt = 0x0000
public const val MAP_HASSEMAPHORE: CInt = 0x0000
public const val MAP_TRYFIXED: CInt = 0
public const val EIPSEC: CInt = 82
public const val ENOMEDIUM: CInt = 85
public const val EMEDIUMTYPE: CInt = 86
public const val EAI_BADFLAGS: CInt = -1
public const val EAI_NONAME: CInt = -2
public const val EAI_AGAIN: CInt = -3
public const val EAI_FAIL: CInt = -4
public const val EAI_NODATA: CInt = -5
public const val EAI_FAMILY: CInt = -6
public const val EAI_SOCKTYPE: CInt = -7
public const val EAI_SERVICE: CInt = -8
public const val EAI_MEMORY: CInt = -10
public const val EAI_SYSTEM: CInt = -11
public const val EAI_OVERFLOW: CInt = -14
public const val RUSAGE_THREAD: CInt = 1
public const val MAP_COPY: CInt = 0x0002
public const val MAP_NOEXTEND: CInt = 0x0000
public const val _PC_LINK_MAX: CInt = 1
public const val _PC_MAX_CANON: CInt = 2
public const val _PC_MAX_INPUT: CInt = 3
public const val _PC_NAME_MAX: CInt = 4
public const val _PC_PATH_MAX: CInt = 5
public const val _PC_PIPE_BUF: CInt = 6
public const val _PC_CHOWN_RESTRICTED: CInt = 7
public const val _PC_NO_TRUNC: CInt = 8
public const val _PC_VDISABLE: CInt = 9
public const val _PC_2_SYMLINKS: CInt = 10
public const val _PC_ALLOC_SIZE_MIN: CInt = 11
public const val _PC_ASYNC_IO: CInt = 12
public const val _PC_FILESIZEBITS: CInt = 13
public const val _PC_PRIO_IO: CInt = 14
public const val _PC_REC_INCR_XFER_SIZE: CInt = 15
public const val _PC_REC_MAX_XFER_SIZE: CInt = 16
public const val _PC_REC_MIN_XFER_SIZE: CInt = 17
public const val _PC_REC_XFER_ALIGN: CInt = 18
public const val _PC_SYMLINK_MAX: CInt = 19
public const val _PC_SYNC_IO: CInt = 20
public const val _PC_TIMESTAMP_RESOLUTION: CInt = 21
public const val _CS_PATH: CInt = 1
public const val _SC_CLK_TCK: CInt = 3
public const val _SC_SEM_NSEMS_MAX: CInt = 31
public const val _SC_SEM_VALUE_MAX: CInt = 32
public const val _SC_HOST_NAME_MAX: CInt = 33
public const val _SC_MONOTONIC_CLOCK: CInt = 34
public const val _SC_2_PBS: CInt = 35
public const val _SC_2_PBS_ACCOUNTING: CInt = 36
public const val _SC_2_PBS_CHECKPOINT: CInt = 37
public const val _SC_2_PBS_LOCATE: CInt = 38
public const val _SC_2_PBS_MESSAGE: CInt = 39
public const val _SC_2_PBS_TRACK: CInt = 40
public const val _SC_ADVISORY_INFO: CInt = 41
public const val _SC_AIO_LISTIO_MAX: CInt = 42
public const val _SC_AIO_MAX: CInt = 43
public const val _SC_AIO_PRIO_DELTA_MAX: CInt = 44
public const val _SC_ASYNCHRONOUS_IO: CInt = 45
public const val _SC_ATEXIT_MAX: CInt = 46
public const val _SC_BARRIERS: CInt = 47
public const val _SC_CLOCK_SELECTION: CInt = 48
public const val _SC_CPUTIME: CInt = 49
public const val _SC_DELAYTIMER_MAX: CInt = 50
public const val _SC_IOV_MAX: CInt = 51
public const val _SC_IPV6: CInt = 52
public const val _SC_MAPPED_FILES: CInt = 53
public const val _SC_MEMLOCK: CInt = 54
public const val _SC_MEMLOCK_RANGE: CInt = 55
public const val _SC_MEMORY_PROTECTION: CInt = 56
public const val _SC_MESSAGE_PASSING: CInt = 57
public const val _SC_MQ_OPEN_MAX: CInt = 58
public const val _SC_MQ_PRIO_MAX: CInt = 59
public const val _SC_PRIORITIZED_IO: CInt = 60
public const val _SC_PRIORITY_SCHEDULING: CInt = 61
public const val _SC_RAW_SOCKETS: CInt = 62
public const val _SC_READER_WRITER_LOCKS: CInt = 63
public const val _SC_REALTIME_SIGNALS: CInt = 64
public const val _SC_REGEXP: CInt = 65
public const val _SC_RTSIG_MAX: CInt = 66
public const val _SC_SEMAPHORES: CInt = 67
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 68
public const val _SC_SHELL: CInt = 69
public const val _SC_SIGQUEUE_MAX: CInt = 70
public const val _SC_SPAWN: CInt = 71
public const val _SC_SPIN_LOCKS: CInt = 72
public const val _SC_SPORADIC_SERVER: CInt = 73
public const val _SC_SS_REPL_MAX: CInt = 74
public const val _SC_SYNCHRONIZED_IO: CInt = 75
public const val _SC_SYMLOOP_MAX: CInt = 76
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 77
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 78
public const val _SC_THREAD_CPUTIME: CInt = 79
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 80
public const val _SC_THREAD_KEYS_MAX: CInt = 81
public const val _SC_THREAD_PRIO_INHERIT: CInt = 82
public const val _SC_THREAD_PRIO_PROTECT: CInt = 83
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 84
public const val _SC_THREAD_PROCESS_SHARED: CInt = 85
public const val _SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 86
public const val _SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 87
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 88
public const val _SC_THREAD_STACK_MIN: CInt = 89
public const val _SC_THREAD_THREADS_MAX: CInt = 90
public const val _SC_THREADS: CInt = 91
public const val _SC_TIMEOUTS: CInt = 92
public const val _SC_TIMER_MAX: CInt = 93
public const val _SC_TIMERS: CInt = 94
public const val _SC_TRACE: CInt = 95
public const val _SC_TRACE_EVENT_FILTER: CInt = 96
public const val _SC_TRACE_EVENT_NAME_MAX: CInt = 97
public const val _SC_TRACE_INHERIT: CInt = 98
public const val _SC_TRACE_LOG: CInt = 99
public const val _SC_GETGR_R_SIZE_MAX: CInt = 100
public const val _SC_GETPW_R_SIZE_MAX: CInt = 101
public const val _SC_LOGIN_NAME_MAX: CInt = 102
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 103
public const val _SC_TRACE_NAME_MAX: CInt = 104
public const val _SC_TRACE_SYS_MAX: CInt = 105
public const val _SC_TRACE_USER_EVENT_MAX: CInt = 106
public const val _SC_TTY_NAME_MAX: CInt = 107
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 108
public const val _SC_V6_ILP32_OFF32: CInt = 109
public const val _SC_V6_ILP32_OFFBIG: CInt = 110
public const val _SC_V6_LP64_OFF64: CInt = 111
public const val _SC_V6_LPBIG_OFFBIG: CInt = 112
public const val _SC_V7_ILP32_OFF32: CInt = 113
public const val _SC_V7_ILP32_OFFBIG: CInt = 114
public const val _SC_V7_LP64_OFF64: CInt = 115
public const val _SC_V7_LPBIG_OFFBIG: CInt = 116
public const val _SC_XOPEN_CRYPT: CInt = 117
public const val _SC_XOPEN_ENH_I18N: CInt = 118
public const val _SC_XOPEN_LEGACY: CInt = 119
public const val _SC_XOPEN_REALTIME: CInt = 120
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 121
public const val _SC_XOPEN_STREAMS: CInt = 122
public const val _SC_XOPEN_UNIX: CInt = 123
public const val _SC_XOPEN_UUCP: CInt = 124
public const val _SC_XOPEN_VERSION: CInt = 125
public const val _SC_PHYS_PAGES: CInt = 500
public const val _SC_AVPHYS_PAGES: CInt = 501
public const val _SC_NPROCESSORS_CONF: CInt = 502
public const val _SC_NPROCESSORS_ONLN: CInt = 503
public const val FD_SETSIZE: ULong = 1024uL
public const val SCHED_FIFO: CInt = 1
public const val SCHED_OTHER: CInt = 2
public const val SCHED_RR: CInt = 3
public const val ST_NOSUID: CULong = 2uL
public const val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = null_mut()
public const val PTHREAD_COND_INITIALIZER: PthreadCondT = null_mut()
public const val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = null_mut()
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 1
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 2
public const val PTHREAD_MUTEX_NORMAL: CInt = 3
public const val PTHREAD_MUTEX_STRICT_NP: CInt = 4
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_STRICT_NP
public const val EVFILT_READ: Short = -1
public const val EVFILT_WRITE: Short = -2
public const val EVFILT_AIO: Short = -3
public const val EVFILT_VNODE: Short = -4
public const val EVFILT_PROC: Short = -5
public const val EVFILT_SIGNAL: Short = -6
public const val EVFILT_TIMER: Short = -7
public const val EVFILT_DEVICE: Short = -8
public const val EVFILT_EXCEPT: Short = -9
public const val EVFILT_USER: Short = -10
public val EV_ADD: UShort = (0x1).toUShort()
public val EV_DELETE: UShort = (0x2).toUShort()
public val EV_ENABLE: UShort = (0x4).toUShort()
public val EV_DISABLE: UShort = (0x8).toUShort()
public val EV_ONESHOT: UShort = (0x10).toUShort()
public val EV_CLEAR: UShort = (0x20).toUShort()
public val EV_RECEIPT: UShort = (0x40).toUShort()
public val EV_DISPATCH: UShort = (0x80).toUShort()
public val EV_FLAG1: UShort = (0x2000).toUShort()
public val EV_ERROR: UShort = (0x4000).toUShort()
public val EV_EOF: UShort = (0x8000).toUShort()
public val EV_SYSFLAGS: UShort = (0xf800).toUShort()
public const val NOTE_TRIGGER: UInt = 0x01000000u
public const val NOTE_FFNOP: UInt = 0x00000000u
public const val NOTE_FFAND: UInt = 0x40000000u
public const val NOTE_FFOR: UInt = 0x80000000u
public const val NOTE_FFCOPY: UInt = 0xc0000000u
public const val NOTE_FFCTRLMASK: UInt = 0xc0000000u
public const val NOTE_FFLAGSMASK: UInt = 0x00ffffffu
public const val NOTE_LOWAT: UInt = 0x00000001u
public const val NOTE_EOF: UInt = 0x00000002u
public const val NOTE_OOB: UInt = 0x00000004u
public const val NOTE_DELETE: UInt = 0x00000001u
public const val NOTE_WRITE: UInt = 0x00000002u
public const val NOTE_EXTEND: UInt = 0x00000004u
public const val NOTE_ATTRIB: UInt = 0x00000008u
public const val NOTE_LINK: UInt = 0x00000010u
public const val NOTE_RENAME: UInt = 0x00000020u
public const val NOTE_REVOKE: UInt = 0x00000040u
public const val NOTE_TRUNCATE: UInt = 0x00000080u
public const val NOTE_EXIT: UInt = 0x80000000u
public const val NOTE_FORK: UInt = 0x40000000u
public const val NOTE_EXEC: UInt = 0x20000000u
public const val NOTE_PDATAMASK: UInt = 0x000fffffu
public const val NOTE_PCTRLMASK: UInt = 0xf0000000u
public const val NOTE_TRACK: UInt = 0x00000001u
public const val NOTE_TRACKERR: UInt = 0x00000002u
public const val NOTE_CHILD: UInt = 0x00000004u
public const val NOTE_CHANGE: UInt = 0x00000001u
public const val TMP_MAX: CUInt = 0x7fffffffu
public const val AI_PASSIVE: CInt = 1
public const val AI_CANONNAME: CInt = 2
public const val AI_NUMERICHOST: CInt = 4
public const val AI_EXT: CInt = 8
public const val AI_NUMERICSERV: CInt = 16
public const val AI_FQDN: CInt = 32
public const val AI_ADDRCONFIG: CInt = 64
public const val NI_NUMERICHOST: CInt = 1
public const val NI_NUMERICSERV: CInt = 2
public const val NI_NOFQDN: CInt = 4
public const val NI_NAMEREQD: CInt = 8
public const val NI_DGRAM: CInt = 16
public const val NI_MAXHOST: ULong = 256uL
public const val RTLD_LOCAL: CInt = 0
public const val CTL_MAXNAME: CInt = 12
public const val CTLTYPE_NODE: CInt = 1
public const val CTLTYPE_INT: CInt = 2
public const val CTLTYPE_STRING: CInt = 3
public const val CTLTYPE_QUAD: CInt = 4
public const val CTLTYPE_STRUCT: CInt = 5
public const val CTL_UNSPEC: CInt = 0
public const val CTL_KERN: CInt = 1
public const val CTL_VM: CInt = 2
public const val CTL_FS: CInt = 3
public const val CTL_NET: CInt = 4
public const val CTL_DEBUG: CInt = 5
public const val CTL_HW: CInt = 6
public const val CTL_MACHDEP: CInt = 7
public const val CTL_DDB: CInt = 9
public const val CTL_VFS: CInt = 10
public const val CTL_MAXID: CInt = 11
public const val HW_NCPUONLINE: CInt = 25
public const val KERN_OSTYPE: CInt = 1
public const val KERN_OSRELEASE: CInt = 2
public const val KERN_OSREV: CInt = 3
public const val KERN_VERSION: CInt = 4
public const val KERN_MAXVNODES: CInt = 5
public const val KERN_MAXPROC: CInt = 6
public const val KERN_MAXFILES: CInt = 7
public const val KERN_ARGMAX: CInt = 8
public const val KERN_SECURELVL: CInt = 9
public const val KERN_HOSTNAME: CInt = 10
public const val KERN_HOSTID: CInt = 11
public const val KERN_CLOCKRATE: CInt = 12
public const val KERN_PROF: CInt = 16
public const val KERN_POSIX1: CInt = 17
public const val KERN_NGROUPS: CInt = 18
public const val KERN_JOB_CONTROL: CInt = 19
public const val KERN_SAVED_IDS: CInt = 20
public const val KERN_BOOTTIME: CInt = 21
public const val KERN_DOMAINNAME: CInt = 22
public const val KERN_MAXPARTITIONS: CInt = 23
public const val KERN_RAWPARTITION: CInt = 24
public const val KERN_MAXTHREAD: CInt = 25
public const val KERN_NTHREADS: CInt = 26
public const val KERN_OSVERSION: CInt = 27
public const val KERN_SOMAXCONN: CInt = 28
public const val KERN_SOMINCONN: CInt = 29
public const val KERN_USERMOUNT: CInt = 30
public const val KERN_NOSUIDCOREDUMP: CInt = 32
public const val KERN_FSYNC: CInt = 33
public const val KERN_SYSVMSG: CInt = 34
public const val KERN_SYSVSEM: CInt = 35
public const val KERN_SYSVSHM: CInt = 36
public const val KERN_ARND: CInt = 37
public const val KERN_MSGBUFSIZE: CInt = 38
public const val KERN_MALLOCSTATS: CInt = 39
public const val KERN_CPTIME: CInt = 40
public const val KERN_NCHSTATS: CInt = 41
public const val KERN_FORKSTAT: CInt = 42
public const val KERN_NSELCOLL: CInt = 43
public const val KERN_TTY: CInt = 44
public const val KERN_CCPU: CInt = 45
public const val KERN_FSCALE: CInt = 46
public const val KERN_NPROCS: CInt = 47
public const val KERN_MSGBUF: CInt = 48
public const val KERN_POOL: CInt = 49
public const val KERN_STACKGAPRANDOM: CInt = 50
public const val KERN_SYSVIPC_INFO: CInt = 51
public const val KERN_SPLASSERT: CInt = 54
public const val KERN_PROC_ARGS: CInt = 55
public const val KERN_NFILES: CInt = 56
public const val KERN_TTYCOUNT: CInt = 57
public const val KERN_NUMVNODES: CInt = 58
public const val KERN_MBSTAT: CInt = 59
public const val KERN_SEMINFO: CInt = 61
public const val KERN_SHMINFO: CInt = 62
public const val KERN_INTRCNT: CInt = 63
public const val KERN_WATCHDOG: CInt = 64
public const val KERN_PROC: CInt = 66
public const val KERN_MAXCLUSTERS: CInt = 67
public const val KERN_EVCOUNT: CInt = 68
public const val KERN_TIMECOUNTER: CInt = 69
public const val KERN_MAXLOCKSPERUID: CInt = 70
public const val KERN_CPTIME2: CInt = 71
public const val KERN_CACHEPCT: CInt = 72
public const val KERN_FILE: CInt = 73
public const val KERN_CONSDEV: CInt = 75
public const val KERN_NETLIVELOCKS: CInt = 76
public const val KERN_POOL_DEBUG: CInt = 77
public const val KERN_PROC_CWD: CInt = 78
public const val KERN_PROC_NOBROADCASTKILL: CInt = 79
public const val KERN_PROC_VMMAP: CInt = 80
public const val KERN_GLOBAL_PTRACE: CInt = 81
public const val KERN_CONSBUFSIZE: CInt = 82
public const val KERN_CONSBUF: CInt = 83
public const val KERN_AUDIO: CInt = 84
public const val KERN_CPUSTATS: CInt = 85
public const val KERN_PFSTATUS: CInt = 86
public const val KERN_TIMEOUT_STATS: CInt = 87
public const val KERN_MAXID: CInt = 88
public const val KERN_PROC_ALL: CInt = 0
public const val KERN_PROC_PID: CInt = 1
public const val KERN_PROC_PGRP: CInt = 2
public const val KERN_PROC_SESSION: CInt = 3
public const val KERN_PROC_TTY: CInt = 4
public const val KERN_PROC_UID: CInt = 5
public const val KERN_PROC_RUID: CInt = 6
public const val KERN_PROC_KTHREAD: CInt = 7
public const val KERN_PROC_SHOW_THREADS: CInt = 0x40000000
public const val KERN_SYSVIPC_MSG_INFO: CInt = 1
public const val KERN_SYSVIPC_SEM_INFO: CInt = 2
public const val KERN_SYSVIPC_SHM_INFO: CInt = 3
public const val KERN_PROC_ARGV: CInt = 1
public const val KERN_PROC_NARGV: CInt = 2
public const val KERN_PROC_ENV: CInt = 3
public const val KERN_PROC_NENV: CInt = 4
public const val KI_NGROUPS: CInt = 16
public const val KI_MAXCOMLEN: CInt = 24
public const val KI_WMESGLEN: CInt = 8
public const val KI_MAXLOGNAME: CInt = 32
public const val KI_EMULNAMELEN: CInt = 8
public const val KVE_ET_OBJ: CInt = 0x00000001
public const val KVE_ET_SUBMAP: CInt = 0x00000002
public const val KVE_ET_COPYONWRITE: CInt = 0x00000004
public const val KVE_ET_NEEDSCOPY: CInt = 0x00000008
public const val KVE_ET_HOLE: CInt = 0x00000010
public const val KVE_ET_NOFAULT: CInt = 0x00000020
public const val KVE_ET_STACK: CInt = 0x00000040
public const val KVE_ET_WC: CInt = 0x000000080
public const val KVE_ET_CONCEAL: CInt = 0x000000100
public const val KVE_ET_SYSCALL: CInt = 0x000000200
public const val KVE_ET_FREEMAPPED: CInt = 0x000000800
public const val KVE_PROT_NONE: CInt = 0x00000000
public const val KVE_PROT_READ: CInt = 0x00000001
public const val KVE_PROT_WRITE: CInt = 0x00000002
public const val KVE_PROT_EXEC: CInt = 0x00000004
public const val KVE_ADV_NORMAL: CInt = 0x00000000
public const val KVE_ADV_RANDOM: CInt = 0x00000001
public const val KVE_ADV_SEQUENTIAL: CInt = 0x00000002
public const val KVE_INH_SHARE: CInt = 0x00000000
public const val KVE_INH_COPY: CInt = 0x00000010
public const val KVE_INH_NONE: CInt = 0x00000020
public const val KVE_INH_ZERO: CInt = 0x00000030
public const val KVE_F_STATIC: CInt = 0x1
public const val KVE_F_KMEM: CInt = 0x2
public val CHWFLOW: TcflagT = MDMBUF or CRTSCTS
public const val OLCUC: TcflagT = 0x20u
public const val ONOCR: TcflagT = 0x40u
public const val ONLRET: TcflagT = 0x80u
public const val ISOFSMNT_NORRIP: CInt = 0x1
public const val ISOFSMNT_GENS: CInt = 0x2
public const val ISOFSMNT_EXTATT: CInt = 0x4
public const val ISOFSMNT_NOJOLIET: CInt = 0x8
public const val ISOFSMNT_SESS: CInt = 0x10
public const val NFS_ARGSVERSION: CInt = 4
public const val NFSMNT_RESVPORT: CInt = 0
public const val NFSMNT_SOFT: CInt = 0x1
public const val NFSMNT_WSIZE: CInt = 0x2
public const val NFSMNT_RSIZE: CInt = 0x4
public const val NFSMNT_TIMEO: CInt = 0x8
public const val NFSMNT_RETRANS: CInt = 0x10
public const val NFSMNT_MAXGRPS: CInt = 0x20
public const val NFSMNT_INT: CInt = 0x40
public const val NFSMNT_NOCONN: CInt = 0x80
public const val NFSMNT_NQNFS: CInt = 0x100
public const val NFSMNT_NFSV3: CInt = 0x200
public const val NFSMNT_KERB: CInt = 0x400
public const val NFSMNT_DUMBTIMR: CInt = 0x800
public const val NFSMNT_LEASETERM: CInt = 0x1000
public const val NFSMNT_READAHEAD: CInt = 0x2000
public const val NFSMNT_DEADTHRESH: CInt = 0x4000
public const val NFSMNT_NOAC: CInt = 0x8000
public const val NFSMNT_RDIRPLUS: CInt = 0x10000
public const val NFSMNT_READDIRSIZE: CInt = 0x20000
public const val NFSMNT_ACREGMIN: CInt = 0x40000
public const val NFSMNT_ACREGMAX: CInt = 0x80000
public const val NFSMNT_ACDIRMIN: CInt = 0x100000
public const val NFSMNT_ACDIRMAX: CInt = 0x200000
public const val NFSMNT_INTERNAL: CInt = 0xfffc0000.toInt()
public const val NFSMNT_HASWRITEVERF: CInt = 0x40000
public const val NFSMNT_GOTPATHCONF: CInt = 0x80000
public const val NFSMNT_GOTFSINFO: CInt = 0x100000
public const val NFSMNT_MNTD: CInt = 0x200000
public const val NFSMNT_DISMINPROG: CInt = 0x400000
public const val NFSMNT_DISMNT: CInt = 0x800000
public const val NFSMNT_SNDLOCK: CInt = 0x1000000
public const val NFSMNT_WANTSND: CInt = 0x2000000
public const val NFSMNT_RCVLOCK: CInt = 0x4000000
public const val NFSMNT_WANTRCV: CInt = 0x8000000
public const val NFSMNT_WAITAUTH: CInt = 0x10000000
public const val NFSMNT_HASAUTH: CInt = 0x20000000
public const val NFSMNT_WANTAUTH: CInt = 0x40000000
public const val NFSMNT_AUTHERR: CInt = 0x80000000.toInt()
public const val MSDOSFSMNT_SHORTNAME: CInt = 0x1
public const val MSDOSFSMNT_LONGNAME: CInt = 0x2
public const val MSDOSFSMNT_NOWIN95: CInt = 0x4
public const val NTFS_MFLAG_CASEINS: CInt = 0x1
public const val NTFS_MFLAG_ALLNAMES: CInt = 0x2
public const val TMPFS_ARGS_VERSION: CInt = 1
public const val MAP_STACK: CInt = 0x4000
public const val MAP_CONCEAL: CInt = 0x8000
public const val LINK_STATE_UNKNOWN: CInt = 0
public const val LINK_STATE_INVALID: CInt = 1
public const val LINK_STATE_DOWN: CInt = 2
public const val LINK_STATE_KALIVE_DOWN: CInt = 3
public const val LINK_STATE_UP: CInt = 4
public const val LINK_STATE_HALF_DUPLEX: CInt = 5
public const val LINK_STATE_FULL_DUPLEX: CInt = 6
public const val IFF_UP: CInt = 0x1
public const val IFF_BROADCAST: CInt = 0x2
public const val IFF_DEBUG: CInt = 0x4
public const val IFF_LOOPBACK: CInt = 0x8
public const val IFF_POINTOPOINT: CInt = 0x10
public const val IFF_STATICARP: CInt = 0x20
public const val IFF_RUNNING: CInt = 0x40
public const val IFF_NOARP: CInt = 0x80
public const val IFF_PROMISC: CInt = 0x100
public const val IFF_ALLMULTI: CInt = 0x200
public const val IFF_OACTIVE: CInt = 0x400
public const val IFF_SIMPLEX: CInt = 0x800
public const val IFF_LINK0: CInt = 0x1000
public const val IFF_LINK1: CInt = 0x2000
public const val IFF_LINK2: CInt = 0x4000
public const val IFF_MULTICAST: CInt = 0x8000
public val PTHREAD_STACK_MIN: ULong = 1 shl _MAX_PAGE_SHIFT
public val MINSIGSTKSZ: ULong = 3 shl _MAX_PAGE_SHIFT
public val SIGSTKSZ: ULong = MINSIGSTKSZ + (1 shl _MAX_PAGE_SHIFT) * 4u
public const val PT_SET_EVENT_MASK: CInt = 12
public const val PT_GET_EVENT_MASK: CInt = 13
public const val PT_GET_PROCESS_STATE: CInt = 14
public const val PT_GET_THREAD_FIRST: CInt = 15
public const val PT_GET_THREAD_NEXT: CInt = 16
public const val PT_FIRSTMACH: CInt = 32
public const val PT_PTS_NAMELEN: CInt = 32
public const val SOCK_CLOEXEC: CInt = 0x8000
public const val SOCK_NONBLOCK: CInt = 0x4000
public const val SOCK_DNS: CInt = 0x1000
public const val BIOCGRSIG: CULong = 0x40044273uL
public const val BIOCSRSIG: CULong = 0x80044272uL
public const val BIOCSDLT: CULong = 0x8004427auL
public const val PTRACE_FORK: CInt = 0x0002
public const val WCONTINUED: CInt = 0x08
public const val WEXITED: CInt = 0x04
public const val WSTOPPED: CInt = 0x02
public const val WNOWAIT: CInt = 0x10
public const val WTRAPPED: CInt = 0x20
public const val P_ALL: IdtypeT = 0u
public const val P_PGID: IdtypeT = 1u
public const val P_PID: IdtypeT = 2u
public const val FIND: ACTION = 0u
public const val ENTER: ACTION = 1u
public const val FUTEX_WAIT: CInt = 1
public const val FUTEX_WAKE: CInt = 2
public const val FUTEX_REQUEUE: CInt = 3
public const val FUTEX_PRIVATE_FLAG: CInt = 128
public const val EPROC_CTTY: Int = 0x01
public const val EPROC_SLEADER: Int = 0x02
public const val EPROC_UNVEIL: Int = 0x04
public const val EPROC_LKUNVEIL: Int = 0x08
public const val UF_SETTABLE: CUInt = 0x0000ffffu
public const val UF_NODUMP: CUInt = 0x00000001u
public const val UF_IMMUTABLE: CUInt = 0x00000002u
public const val UF_APPEND: CUInt = 0x00000004u
public const val UF_OPAQUE: CUInt = 0x00000008u
public const val SF_SETTABLE: CUInt = 0xffff0000u
public const val SF_ARCHIVED: CUInt = 0x00010000u
public const val SF_IMMUTABLE: CUInt = 0x00020000u
public const val SF_APPEND: CUInt = 0x00040000u
public const val PT_NULL: UInt = 0u
public const val PT_LOAD: UInt = 1u
public const val PT_DYNAMIC: UInt = 2u
public const val PT_INTERP: UInt = 3u
public const val PT_NOTE: UInt = 4u
public const val PT_SHLIB: UInt = 5u
public const val PT_PHDR: UInt = 6u
public const val PT_TLS: UInt = 7u
public const val PT_LOOS: UInt = 0x60000000u
public const val PT_HIOS: UInt = 0x6fffffffu
public const val PT_LOPROC: UInt = 0x70000000u
public const val PT_HIPROC: UInt = 0x7fffffffu
public const val PT_GNU_EH_FRAME: UInt = 0x6474e550u
public const val PT_GNU_RELRO: UInt = 0x6474e552u
public const val PF_X: UInt = 0x1u
public const val PF_W: UInt = 0x2u
public const val PF_R: UInt = 0x4u
public const val PF_MASKOS: UInt = 0x0ff00000u
public const val PF_MASKPROC: UInt = 0xf0000000u
public const val MNT_NOPERM: CInt = 0x00000020
public const val MNT_WXALLOWED: CInt = 0x00000800
public const val MNT_EXRDONLY: CInt = 0x00000080
public const val MNT_DEFEXPORTED: CInt = 0x00000200
public const val MNT_EXPORTANON: CInt = 0x00000400
public const val MNT_ROOTFS: CInt = 0x00004000
public const val MNT_NOATIME: CInt = 0x00008000
public const val MNT_DELEXPORT: CInt = 0x00020000
public const val MNT_STALLED: CInt = 0x00100000
public const val MNT_SWAPPABLE: CInt = 0x00200000
public const val MNT_WANTRDWR: CInt = 0x02000000
public const val MNT_SOFTDEP: CInt = 0x04000000
public const val MNT_DOOMED: CInt = 0x08000000
public const val MNT_WAIT: CInt = 1
public const val MNT_NOWAIT: CInt = 2
public const val MNT_LAZY: CInt = 3
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2
public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 4
public const val CLOCK_UPTIME: ClockidT = 5
public const val CLOCK_BOOTTIME: ClockidT = 6
public val LC_COLLATE_MASK: CInt = 1 shl LC_COLLATE
public val LC_CTYPE_MASK: CInt = 1 shl LC_CTYPE
public val LC_MONETARY_MASK: CInt = 1 shl LC_MONETARY
public val LC_NUMERIC_MASK: CInt = 1 shl LC_NUMERIC
public val LC_TIME_MASK: CInt = 1 shl LC_TIME
public val LC_MESSAGES_MASK: CInt = 1 shl LC_MESSAGES
public val LC_ALL_MASK: CInt = (1 shl _LC_LAST) - 2
public val LC_GLOBAL_LOCALE: LocaleT = -1L.toLocaleT()
public const val RB_ASKNAME: CInt = 0x00001
public const val RB_SINGLE: CInt = 0x00002
public const val RB_NOSYNC: CInt = 0x00004
public const val RB_HALT: CInt = 0x00008
public const val RB_INITNAME: CInt = 0x00010
public const val RB_KDB: CInt = 0x00040
public const val RB_RDONLY: CInt = 0x00080
public const val RB_DUMP: CInt = 0x00100
public const val RB_MINIROOT: CInt = 0x00200
public const val RB_CONFIG: CInt = 0x00400
public const val RB_TIMEBAD: CInt = 0x00800
public const val RB_POWERDOWN: CInt = 0x01000
public const val RB_SERCONS: CInt = 0x02000
public const val RB_USERREQ: CInt = 0x04000
public const val RB_RESET: CInt = 0x08000
public const val RB_GOODRANDOM: CInt = 0x10000
public const val RB_UNHIBERNATE: CInt = 0x20000
public const val RTF_CLONING: CInt = 0x100
public const val RTF_MULTICAST: CInt = 0x200
public const val RTF_LLINFO: CInt = 0x400
public const val RTF_PROTO3: CInt = 0x2000
public const val RTF_ANNOUNCE: CInt = RTF_PROTO2
public const val RTF_CLONED: CInt = 0x10000
public const val RTF_CACHED: CInt = 0x20000
public const val RTF_MPATH: CInt = 0x40000
public const val RTF_MPLS: CInt = 0x100000
public const val RTF_LOCAL: CInt = 0x200000
public const val RTF_BROADCAST: CInt = 0x400000
public const val RTF_CONNECTED: CInt = 0x800000
public const val RTF_BFD: CInt = 0x1000000
public val RTF_FMASK: CInt = RTF_LLINFO or RTF_PROTO1 or RTF_PROTO2 or RTF_PROTO3 or RTF_BLACKHOLE or RTF_REJECT or RTF_STATIC or RTF_MPLS or RTF_BFD
public const val RTM_VERSION: CInt = 5
public const val RTM_RESOLVE: CInt = 0xb
public const val RTM_NEWADDR: CInt = 0xc
public const val RTM_DELADDR: CInt = 0xd
public const val RTM_IFINFO: CInt = 0xe
public const val RTM_IFANNOUNCE: CInt = 0xf
public const val RTM_DESYNC: CInt = 0x10
public const val RTM_INVALIDATE: CInt = 0x11
public const val RTM_BFD: CInt = 0x12
public const val RTM_PROPOSAL: CInt = 0x13
public const val RTM_CHGADDRATTR: CInt = 0x14
public const val RTM_80211INFO: CInt = 0x15
public const val RTM_SOURCE: CInt = 0x16
public const val RTA_SRC: CInt = 0x100
public const val RTA_SRCMASK: CInt = 0x200
public const val RTA_LABEL: CInt = 0x400
public const val RTA_BFD: CInt = 0x800
public const val RTA_DNS: CInt = 0x1000
public const val RTA_STATIC: CInt = 0x2000
public const val RTA_SEARCH: CInt = 0x4000
public const val RTAX_SRC: CInt = 8
public const val RTAX_SRCMASK: CInt = 9
public const val RTAX_LABEL: CInt = 10
public const val RTAX_BFD: CInt = 11
public const val RTAX_DNS: CInt = 12
public const val RTAX_STATIC: CInt = 13
public const val RTAX_SEARCH: CInt = 14
public const val RTAX_MAX: CInt = 15

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?

public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt

public expect fun settimeofday(tp: Timeval?, tz: Timezone?): CInt

public expect fun pledge(promises: String?, execpromises: String?): CInt

public expect fun unveil(path: String?, permissions: String?): CInt

public expect fun strtonum(nptr: String?, minval: CLongLong, maxval: CLongLong, errstr: COpaquePointer?): CLongLong

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun chflags(path: String?, flags: CUInt): CInt

public expect fun fchflags(fd: CInt, flags: CUInt): CInt

public expect fun chflagsat(fd: CInt, path: String?, flags: CUInt, atflag: CInt): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: CInt): CInt

public expect fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt

public expect fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt

public expect fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt

public expect fun getthrid(): PidT

public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt

public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt

public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt

public expect fun pthreadMainNp(): CInt

public expect fun pthreadGetNameNp(tid: PthreadT, name: String?, len: ULong)

public expect fun pthreadSetNameNp(tid: PthreadT, name: String?)

public expect fun pthreadStacksegNp(thread: PthreadT, sinfo: StackT?): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt

public expect fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT

public expect fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt

public expect fun utrace(label: String?, addr: COpaquePointer?, len: ULong): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer?

public expect fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun explicitBzero(s: COpaquePointer?, len: ULong)

public expect fun setproctitle(fmt: String?, vararg args: Any?)

public expect fun freezero(ptr: COpaquePointer?, size: ULong)

public expect fun mallocConceal(size: ULong): COpaquePointer?

public expect fun callocConceal(nmemb: ULong, size: ULong): COpaquePointer?

public expect fun srand48Deterministic(seed: CLong)

public expect fun seed48Deterministic(xseed: CUShort?): CUShort?

public expect fun lcong48Deterministic(p: CUShort?)

public expect fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer?

public expect fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer?

public expect fun hcreate(nelt: ULong): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: ENTRY, action: ACTION): ENTRY?

public expect fun futex(uaddr: UInt?, op: CInt, `val`: CInt, timeout: Timespec?, uaddr2: UInt?): CInt

public expect fun mimmutable(addr: COpaquePointer?, len: ULong): CInt

public expect fun reboot(mode: CInt): CInt

public expect fun statfs(path: String?, buf: Statfs?): CInt

public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt

public expect fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt

public expect fun getfsstat(buf: Statfs?, bufsize: ULong, flags: CInt): CInt

public expect fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt

public expect fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong

public expect fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer?

public expect fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: CInt): CInt

public expect fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer?
