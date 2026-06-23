// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias BlksizeT = Int
public typealias EventfdT = ULong
public typealias FsblkcntT = ULong
public typealias FsfilcntT = ULong
public typealias IdtypeT = CInt
public typealias ShmattT = CUInt
public typealias CpusetT = Cpuset
public typealias PthreadSpinT = PthreadSpinT
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
public typealias IconvT = COpaquePointer?

public enum class FaeAction(public val value: Int) {
    FAE_OPEN(0),
    FAE_DUP2(1),
    FAE_CLOSE(2),
    ;
}

public data class Aiocb(
    val aioOffset: OffT,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioFildes: CInt,
    val aioLioOpcode: CInt,
    val aioReqprio: CInt,
    val aioSigevent: Sigevent,
    val state: CInt,
    val errno: CInt,
    val retval: SsizeT,
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

public data class MqAttr(
    val mqFlags: CLong,
    val mqMaxmsg: CLong,
    val mqMsgsize: CLong,
    val mqCurmsgs: CLong,
)

public data class SigsetT(
    val bits: UIntArray,
)

public data class Stat(
    val stDev: DevT,
    val stMode: ModeT,
    val stIno: InoT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stAtime: TimeT,
    val stAtimensec: CLong,
    val stMtime: TimeT,
    val stMtimensec: CLong,
    val stCtime: TimeT,
    val stCtimensec: CLong,
    val stBirthtime: TimeT,
    val stBirthtimensec: CLong,
    val stSize: OffT,
    val stBlocks: BlkcntT,
    val stBlksize: BlksizeT,
    val stFlags: UInt,
    val stGen: UInt,
    val stSpare: UIntArray,
)

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: SocklenT,
    val aiCanonname: String?,
    val aiAddr: Sockaddr?,
    val aiNext: Addrinfo?,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siErrno: CInt,
    val siAddr: COpaquePointer?,
)

public data class PthreadAttrT(
    val ptaMagic: CUInt,
    val ptaFlags: CInt,
    val ptaPrivate: COpaquePointer?,
)

public data class PthreadMutexT(
    val ptmMagic: CUInt,
    val ptmErrorcheck: PthreadSpinT,
    val ptmOwner: PthreadT,
    val ptmWaiters: COpaquePointer?,
    val ptmRecursed: CUInt,
    val ptmSpare2: COpaquePointer?,
)

public data class PthreadMutexattrT(
    val ptmaMagic: CUInt,
    val ptmaPrivate: COpaquePointer?,
)

public data class PthreadRwlockattrT(
    val ptraMagic: CUInt,
    val ptraPrivate: COpaquePointer?,
)

public data class PthreadCondT(
    val ptcMagic: CUInt,
    val ptcLock: PthreadSpinT,
    val ptcWaitersFirst: COpaquePointer?,
    val ptcWaitersLast: COpaquePointer?,
    val ptcMutex: PthreadMutexT?,
    val ptcPrivate: COpaquePointer?,
)

public data class PthreadCondattrT(
    val ptcaMagic: CUInt,
    val ptcaPrivate: COpaquePointer?,
)

public data class PthreadRwlockT(
    val ptrMagic: CUInt,
    val ptrInterlock: PthreadSpinT,
    val ptrRblockedFirst: COpaquePointer?,
    val ptrRblockedLast: COpaquePointer?,
    val ptrWblockedFirst: COpaquePointer?,
    val ptrWblockedLast: COpaquePointer?,
    val ptrNreaders: CUInt,
    val ptrOwner: PthreadT,
    val ptrPrivate: COpaquePointer?,
)

public data class PthreadSpinlockT(
    val ptsMagic: CUInt,
    val ptsSpin: PthreadSpinT,
    val ptsFlags: CInt,
)

public data class Kevent(
    val ident: UintptrT,
    val filter: UInt,
    val flags: UInt,
    val fflags: UInt,
    val data: Long,
    val udata: COpaquePointer?,
)

public data class Dqblk(
    val dqbBhardlimit: UInt,
    val dqbBsoftlimit: UInt,
    val dqbCurblocks: UInt,
    val dqbIhardlimit: UInt,
    val dqbIsoftlimit: UInt,
    val dqbCurinodes: UInt,
    val dqbBtime: Int,
    val dqbItime: Int,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
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
    val intNCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intNSepBySpace: CChar,
    val intPSignPosn: CChar,
    val intNSignPosn: CChar,
)

public data class Sockcred(
    val scPid: PidT,
    val scUid: UidT,
    val scEuid: UidT,
    val scGid: GidT,
    val scEgid: GidT,
    val scNgroups: CInt,
    val scGroups: List<GidT>,
)

public data class Uucred(
    val crUid: UidT,
    val crGid: GidT,
    val crNgroups: CShort,
    val crGroups: List<GidT>,
)

public data class Unpcbid(
    val unpPid: PidT,
    val unpEuid: UidT,
    val unpEgid: GidT,
)

public data class SockaddrDl(
    val sdlLen: CUChar,
    val sdlFamily: CUChar,
    val sdlIndex: CUShort,
    val sdlType: UByte,
    val sdlNlen: UByte,
    val sdlAlen: UByte,
    val sdlSlen: UByte,
    val sdlData: ByteArray,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmLpid: PidT,
    val shmCpid: PidT,
    val shmNattch: ShmattT,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
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

public data class Aux32Info(
    val aType: Elf32Word,
    val aV: Elf32Word,
)

public data class Aux64Info(
    val aType: Elf64Word,
    val aV: Elf64Xword,
)

public data class DlPhdrInfo(
    val dlpiAddr: ElfAddr,
    val dlpiName: String?,
    val dlpiPhdr: ElfPhdr?,
    val dlpiPhnum: ElfHalf,
    val dlpiAdds: CULongLong,
    val dlpiSubs: CULongLong,
    val dlpiTlsModid: ULong,
    val dlpiTlsData: COpaquePointer?,
)

public data class AcceptFilterArg(
    val afName: ByteArray,
    val afArg: ByteArray,
)

public data class KiSigsetT(
    val bits: UIntArray,
)

public data class KinfoProc2(
    val pForw: ULong,
    val pBack: ULong,
    val pPaddr: ULong,
    val pAddr: ULong,
    val pFd: ULong,
    val pCwdi: ULong,
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
    val pSiglist: KiSigsetT,
    val pSigmask: KiSigsetT,
    val pSigignore: KiSigsetT,
    val pSigcatch: KiSigsetT,
    val pStat: Byte,
    val pPriority: UByte,
    val pUsrpri: UByte,
    val pNice: UByte,
    val pXstat: UShort,
    val pAcflag: UShort,
    val pComm: ByteArray,
    val pWmesg: ByteArray,
    val pWchan: ULong,
    val pLogin: ByteArray,
    val pVmRssize: Int,
    val pVmTsize: Int,
    val pVmDsize: Int,
    val pVmSsize: Int,
    val pUvalid: Long,
    val pUstartSec: UInt,
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
    val pCpuid: ULong,
    val pRealflag: ULong,
    val pNlwps: ULong,
    val pNrlwps: ULong,
    val pRealstat: ULong,
    val pSvuid: UInt,
    val pSvgid: UInt,
    val pEname: ByteArray,
    val pVmVsize: Long,
    val pVmMsize: Long,
)

public data class KinfoLwp(
    val lForw: ULong,
    val lBack: ULong,
    val lLaddr: ULong,
    val lAddr: ULong,
    val lLid: Int,
    val lFlag: Int,
    val lSwtime: UInt,
    val lSlptime: UInt,
    val lSchedflags: Int,
    val lHoldcnt: Int,
    val lPriority: UByte,
    val lUsrpri: UByte,
    val lStat: Byte,
    val lWmesg: ByteArray,
    val lWchan: ULong,
    val lCpuid: ULong,
    val lRtimeSec: UInt,
    val lRtimeUsec: UInt,
    val lCpticks: UInt,
    val lPctcpu: UInt,
    val lPid: UInt,
    val lName: ByteArray,
)

public data class KinfoVmentry(
    val kveStart: ULong,
    val kveEnd: ULong,
    val kveOffset: ULong,
    val kveType: UInt,
    val kveFlags: UInt,
    val kveCount: UInt,
    val kveWiredCount: UInt,
    val kveAdvice: UInt,
    val kveAttributes: UInt,
    val kveProtection: UInt,
    val kveMaxProtection: UInt,
    val kveRefCount: UInt,
    val kveInheritance: UInt,
    val kveVnFileid: ULong,
    val kveVnSize: ULong,
    val kveVnFsid: ULong,
    val kveVnRdev: ULong,
    val kveVnType: UInt,
    val kveVnMode: UInt,
    val kvePath: ByteArray,
)

public data class CAnonymousPosixSpawnFaeOpen(
    val path: String?,
    val oflag: CInt,
    val mode: ModeT,
)

public data class CAnonymousPosixSpawnFaeDup2(
    val newfildes: CInt,
)

public data class PosixSpawnattrT(
    val saFlags: CShort,
    val saPgroup: PidT,
    val saSchedparam: SchedParam,
    val saSchedpolicy: CInt,
    val saSigdefault: SigsetT,
    val saSigmask: SigsetT,
)

public data class PosixSpawnFileActionsEntryT(
    val faeAction: FaeAction,
    val faeFildes: CInt,
    val faeData: CAnonymousPosixSpawnFae,
)

public data class PosixSpawnFileActionsT(
    val size: CUInt,
    val len: CUInt,
    val fae: PosixSpawnFileActionsEntryT?,
)

public data class PtraceLwpinfo(
    val plLwpid: LwpidT,
    val plEvent: CInt,
)

public data class PtraceLwpstatus(
    val plLwpid: LwpidT,
    val plSigpend: SigsetT,
    val plSigmask: SigsetT,
    val plName: ByteArray,
    val plPrivate: COpaquePointer?,
)

public data class PtraceSiginfo(
    val psiSiginfo: SiginfoT,
    val psiLwpid: LwpidT,
)

public data class PtraceEvent(
    val peSetEvent: CInt,
)

public data class Sysctldesc(
    val descrNum: Int,
    val descrVer: UInt,
    val descrLen: UInt,
    val descrStr: ByteArray,
)

public data class TcpInfo(
    val tcpiState: UByte,
    val tcpiCaState: UByte,
    val tcpiRetransmits: UByte,
    val tcpiProbes: UByte,
    val tcpiBackoff: UByte,
    val tcpiOptions: UByte,
    val tcpSndWscale: UByte,
    val tcpRcvWscale: UByte,
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
    val tcpiSndBwnd: UInt,
    val tcpiSndNxt: UInt,
    val tcpiRcvNxt: UInt,
    val tcpiToeTid: UInt,
    val tcpiSndRexmitpack: UInt,
    val tcpiRcvOoopack: UInt,
    val tcpiSndZerowin: UInt,
    val tcpiPad: UIntArray,
)

public data class InPktinfo(
    val ipiAddr: InAddr,
    val ipiIfindex: CUInt,
)

public data class Arphdr(
    val arHrd: UShort,
    val arPro: UShort,
    val arHln: UByte,
    val arPln: UByte,
    val arOp: UShort,
)

public data class InAddr(
    val sAddr: InAddrT,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class Dirent(
    val dFileno: InoT,
    val dReclen: UShort,
    val dNamlen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: SaFamilyT,
)

public data class Sigevent(
    val sigevNotify: CInt,
    val sigevSigno: CInt,
    val sigevValue: Sigval,
    val sigevNotifyAttributes: COpaquePointer?,
)

// C union; only one variant is valid at a time.
public data class CAnonymousPosixSpawnFae(
    val open: CAnonymousPosixSpawnFaeOpen? = null,
    val dup2: CAnonymousPosixSpawnFaeDup2? = null,
)

public const val AT_FDCWD: CInt = -100
public const val AT_EACCESS: CInt = 0x100
public const val AT_SYMLINK_NOFOLLOW: CInt = 0x200
public const val AT_SYMLINK_FOLLOW: CInt = 0x400
public const val AT_REMOVEDIR: CInt = 0x800
public const val AT_NULL: CInt = 0
public const val AT_IGNORE: CInt = 1
public const val AT_EXECFD: CInt = 2
public const val AT_PHDR: CInt = 3
public const val AT_PHENT: CInt = 4
public const val AT_PHNUM: CInt = 5
public const val AT_PAGESZ: CInt = 6
public const val AT_BASE: CInt = 7
public const val AT_FLAGS: CInt = 8
public const val AT_ENTRY: CInt = 9
public const val AT_DCACHEBSIZE: CInt = 10
public const val AT_ICACHEBSIZE: CInt = 11
public const val AT_UCACHEBSIZE: CInt = 12
public const val AT_STACKBASE: CInt = 13
public const val AT_EUID: CInt = 2000
public const val AT_RUID: CInt = 2001
public const val AT_EGID: CInt = 2002
public const val AT_RGID: CInt = 2003
public const val AT_SUN_LDELF: CInt = 2004
public const val AT_SUN_LDSHDR: CInt = 2005
public const val AT_SUN_LDNAME: CInt = 2006
public const val AT_SUN_PLATFORM: CInt = 2008
public const val AT_SUN_HWCAP: CInt = 2009
public const val AT_SUN_IFLUSH: CInt = 2010
public const val AT_SUN_CPU: CInt = 2011
public const val AT_SUN_EMUL_ENTRY: CInt = 2012
public const val AT_SUN_EMUL_EXECFD: CInt = 2013
public const val AT_SUN_EXECNAME: CInt = 2014
public const val EXTATTR_NAMESPACE_USER: CInt = 1
public const val EXTATTR_NAMESPACE_SYSTEM: CInt = 2
public val LC_COLLATE_MASK: CInt = 1 shl LC_COLLATE
public val LC_CTYPE_MASK: CInt = 1 shl LC_CTYPE
public val LC_MONETARY_MASK: CInt = 1 shl LC_MONETARY
public val LC_NUMERIC_MASK: CInt = 1 shl LC_NUMERIC
public val LC_TIME_MASK: CInt = 1 shl LC_TIME
public val LC_MESSAGES_MASK: CInt = 1 shl LC_MESSAGES
public val LC_ALL_MASK: CInt = 0.inv()
public const val ERA: NlItem = 52
public const val ERA_D_FMT: NlItem = 53
public const val ERA_D_T_FMT: NlItem = 54
public const val ERA_T_FMT: NlItem = 55
public const val ALT_DIGITS: NlItem = 56
public const val O_CLOEXEC: CInt = 0x400000
public const val O_ALT_IO: CInt = 0x40000
public const val O_NOSIGPIPE: CInt = 0x1000000
public const val O_SEARCH: CInt = 0x800000
public const val O_DIRECTORY: CInt = 0x200000
public const val O_DIRECT: CInt = 0x00080000
public const val O_RSYNC: CInt = 0x00020000
public const val MS_SYNC: CInt = 0x4
public const val MS_INVALIDATE: CInt = 0x2
public const val RLIMIT_SBSIZE: CInt = 9
public const val RLIMIT_AS: CInt = 10
public const val RLIMIT_NTHR: CInt = 11
public const val RLIM_NLIMITS: CInt = 12
public const val EIDRM: CInt = 82
public const val ENOMSG: CInt = 83
public const val EOVERFLOW: CInt = 84
public const val EILSEQ: CInt = 85
public const val ENOTSUP: CInt = 86
public const val ECANCELED: CInt = 87
public const val EBADMSG: CInt = 88
public const val ENODATA: CInt = 89
public const val ENOSR: CInt = 90
public const val ENOSTR: CInt = 91
public const val ETIME: CInt = 92
public const val ENOATTR: CInt = 93
public const val EMULTIHOP: CInt = 94
public const val ENOLINK: CInt = 95
public const val EPROTO: CInt = 96
public const val EOWNERDEAD: CInt = 97
public const val ENOTRECOVERABLE: CInt = 98
public const val ELAST: CInt = 98
public const val F_DUPFD_CLOEXEC: CInt = 12
public const val F_CLOSEM: CInt = 10
public const val F_GETNOSIGPIPE: CInt = 13
public const val F_SETNOSIGPIPE: CInt = 14
public const val F_MAXFD: CInt = 11
public const val F_GETPATH: CInt = 15
public const val FUTEX_WAIT: CInt = 0
public const val FUTEX_WAKE: CInt = 1
public const val FUTEX_FD: CInt = 2
public const val FUTEX_REQUEUE: CInt = 3
public const val FUTEX_CMP_REQUEUE: CInt = 4
public const val FUTEX_WAKE_OP: CInt = 5
public const val FUTEX_LOCK_PI: CInt = 6
public const val FUTEX_UNLOCK_PI: CInt = 7
public const val FUTEX_TRYLOCK_PI: CInt = 8
public const val FUTEX_WAIT_BITSET: CInt = 9
public const val FUTEX_WAKE_BITSET: CInt = 10
public const val FUTEX_WAIT_REQUEUE_PI: CInt = 11
public const val FUTEX_CMP_REQUEUE_PI: CInt = 12
public val FUTEX_PRIVATE_FLAG: CInt = 1 shl 7
public val FUTEX_CLOCK_REALTIME: CInt = 1 shl 8
public val FUTEX_CMD_MASK: CInt = (FUTEX_PRIVATE_FLAG | FUTEX_CLOCK_REALTIME).inv()
public val FUTEX_WAITERS: UInt = 1 shl 31
public val FUTEX_OWNER_DIED: UInt = 1 shl 30
public val FUTEX_SYNCOBJ_1: UInt = 1 shl 29
public val FUTEX_SYNCOBJ_0: UInt = 1 shl 28
public val FUTEX_TID_MASK: UInt = (1 shl 28) - 1
public val FUTEX_BITSET_MATCH_ANY: UInt = 0.inv()
public const val IP_RECVDSTADDR: CInt = 7
public const val IP_SENDSRCADDR: CInt = IP_RECVDSTADDR
public const val IP_RECVIF: CInt = 20
public const val IP_PKTINFO: CInt = 25
public const val IP_RECVPKTINFO: CInt = 26
public const val IPV6_JOIN_GROUP: CInt = 12
public const val IPV6_LEAVE_GROUP: CInt = 13
public const val TCP_KEEPIDLE: CInt = 3
public const val TCP_KEEPINTVL: CInt = 5
public const val TCP_KEEPCNT: CInt = 6
public const val TCP_KEEPINIT: CInt = 7
public const val TCP_MD5SIG: CInt = 0x10
public const val TCP_CONGCTL: CInt = 0x20
public const val SOCK_CONN_DGRAM: CInt = 6
public const val SOCK_DCCP: CInt = SOCK_CONN_DGRAM
public const val SOCK_NOSIGPIPE: CInt = 0x40000000
public const val SOCK_FLAGS_MASK: CInt = 0xf0000000
public const val SO_SNDTIMEO: CInt = 0x100b
public const val SO_RCVTIMEO: CInt = 0x100c
public const val SO_NOSIGPIPE: CInt = 0x0800
public const val SO_ACCEPTFILTER: CInt = 0x1000
public const val SO_TIMESTAMP: CInt = 0x2000
public const val SO_OVERFLOWED: CInt = 0x1009
public const val SO_NOHEADER: CInt = 0x100a
public const val LOCAL_OCREDS: CInt = 0x0001
public const val LOCAL_CONNWAIT: CInt = 0x0002
public const val LOCAL_PEEREID: CInt = 0x0003
public const val LOCAL_CREDS: CInt = 0x0004
public const val IPPROTO_HOPOPTS: CInt = 0
public const val IPPROTO_IGMP: CInt = 2
public const val IPPROTO_GGP: CInt = 3
public const val IPPROTO_IPIP: CInt = 4
public const val IPPROTO_EGP: CInt = 8
public const val IPPROTO_PUP: CInt = 12
public const val IPPROTO_IDP: CInt = 22
public const val IPPROTO_TP: CInt = 29
public const val IPPROTO_DCCP: CInt = 33
public const val IPPROTO_ROUTING: CInt = 43
public const val IPPROTO_FRAGMENT: CInt = 44
public const val IPPROTO_RSVP: CInt = 46
public const val IPPROTO_GRE: CInt = 47
public const val IPPROTO_ESP: CInt = 50
public const val IPPROTO_AH: CInt = 51
public const val IPPROTO_MOBILE: CInt = 55
public const val IPPROTO_IPV6_ICMP: CInt = 58
public const val IPPROTO_NONE: CInt = 59
public const val IPPROTO_DSTOPTS: CInt = 60
public const val IPPROTO_EON: CInt = 80
public const val IPPROTO_ETHERIP: CInt = 97
public const val IPPROTO_ENCAP: CInt = 98
public const val IPPROTO_PIM: CInt = 103
public const val IPPROTO_IPCOMP: CInt = 108
public const val IPPROTO_VRRP: CInt = 112
public const val IPPROTO_CARP: CInt = 112
public const val IPPROTO_L2TP: CInt = 115
public const val IPPROTO_SCTP: CInt = 132
public const val IPPROTO_PFSYNC: CInt = 240
public const val IPPROTO_MAX: CInt = 256
public const val IPPROTO_DONE: CInt = 257
public const val CTL_IPPROTO_IPSEC: CInt = 258
public const val AF_OROUTE: CInt = 17
public const val AF_ARP: CInt = 28
public const val pseudo_AF_KEY: CInt = 29
public const val pseudo_AF_HDRCMPLT: CInt = 30
public const val AF_BLUETOOTH: CInt = 31
public const val AF_IEEE80211: CInt = 32
public const val AF_MPLS: CInt = 33
public const val AF_ROUTE: CInt = 34
public const val NET_RT_DUMP: CInt = 1
public const val NET_RT_FLAGS: CInt = 2
public const val NET_RT_OOOIFLIST: CInt = 3
public const val NET_RT_OOIFLIST: CInt = 4
public const val NET_RT_OIFLIST: CInt = 5
public const val NET_RT_IFLIST: CInt = 6
public const val PF_OROUTE: CInt = AF_OROUTE
public const val PF_ARP: CInt = AF_ARP
public const val PF_KEY: CInt = pseudo_AF_KEY
public const val PF_BLUETOOTH: CInt = AF_BLUETOOTH
public const val PF_MPLS: CInt = AF_MPLS
public const val PF_ROUTE: CInt = AF_ROUTE
public const val MSG_NBIO: CInt = 0x1000
public const val MSG_WAITFORONE: CInt = 0x2000
public const val MSG_NOTIFICATION: CInt = 0x4000
public const val SCM_TIMESTAMP: CInt = 0x08
public const val SCM_CREDS: CInt = 0x10
public const val O_DSYNC: CInt = 0x10000
public const val MAP_RENAME: CInt = 0x20
public const val MAP_NORESERVE: CInt = 0x40
public const val MAP_HASSEMAPHORE: CInt = 0x200
public const val MAP_TRYFIXED: CInt = 0x400
public const val MAP_WIRED: CInt = 0x800
public const val MAP_STACK: CInt = 0x2000
public const val MAP_ALIGNMENT_SHIFT: CInt = 24
public val MAP_ALIGNMENT_MASK: CInt = 0xff shl MAP_ALIGNMENT_SHIFT
public val MAP_ALIGNMENT_64KB: CInt = 16 shl MAP_ALIGNMENT_SHIFT
public val MAP_ALIGNMENT_16MB: CInt = 24 shl MAP_ALIGNMENT_SHIFT
public val MAP_ALIGNMENT_4GB: CInt = 32 shl MAP_ALIGNMENT_SHIFT
public val MAP_ALIGNMENT_1TB: CInt = 40 shl MAP_ALIGNMENT_SHIFT
public val MAP_ALIGNMENT_256TB: CInt = 48 shl MAP_ALIGNMENT_SHIFT
public val MAP_ALIGNMENT_64PB: CInt = 56 shl MAP_ALIGNMENT_SHIFT
public const val MAP_REMAPDUP: CInt = 0x004
public const val DCCP_TYPE_REQUEST: CInt = 0
public const val DCCP_TYPE_RESPONSE: CInt = 1
public const val DCCP_TYPE_DATA: CInt = 2
public const val DCCP_TYPE_ACK: CInt = 3
public const val DCCP_TYPE_DATAACK: CInt = 4
public const val DCCP_TYPE_CLOSEREQ: CInt = 5
public const val DCCP_TYPE_CLOSE: CInt = 6
public const val DCCP_TYPE_RESET: CInt = 7
public const val DCCP_TYPE_MOVE: CInt = 8
public const val DCCP_FEATURE_CC: CInt = 1
public const val DCCP_FEATURE_ECN: CInt = 2
public const val DCCP_FEATURE_ACKRATIO: CInt = 3
public const val DCCP_FEATURE_ACKVECTOR: CInt = 4
public const val DCCP_FEATURE_MOBILITY: CInt = 5
public const val DCCP_FEATURE_LOSSWINDOW: CInt = 6
public const val DCCP_FEATURE_CONN_NONCE: CInt = 8
public const val DCCP_FEATURE_IDENTREG: CInt = 7
public const val DCCP_OPT_PADDING: CInt = 0
public const val DCCP_OPT_DATA_DISCARD: CInt = 1
public const val DCCP_OPT_SLOW_RECV: CInt = 2
public const val DCCP_OPT_BUF_CLOSED: CInt = 3
public const val DCCP_OPT_CHANGE_L: CInt = 32
public const val DCCP_OPT_CONFIRM_L: CInt = 33
public const val DCCP_OPT_CHANGE_R: CInt = 34
public const val DCCP_OPT_CONFIRM_R: CInt = 35
public const val DCCP_OPT_INIT_COOKIE: CInt = 36
public const val DCCP_OPT_NDP_COUNT: CInt = 37
public const val DCCP_OPT_ACK_VECTOR0: CInt = 38
public const val DCCP_OPT_ACK_VECTOR1: CInt = 39
public const val DCCP_OPT_RECV_BUF_DROPS: CInt = 40
public const val DCCP_OPT_TIMESTAMP: CInt = 41
public const val DCCP_OPT_TIMESTAMP_ECHO: CInt = 42
public const val DCCP_OPT_ELAPSEDTIME: CInt = 43
public const val DCCP_OPT_DATACHECKSUM: CInt = 44
public const val DCCP_REASON_UNSPEC: CInt = 0
public const val DCCP_REASON_CLOSED: CInt = 1
public const val DCCP_REASON_INVALID: CInt = 2
public const val DCCP_REASON_OPTION_ERR: CInt = 3
public const val DCCP_REASON_FEA_ERR: CInt = 4
public const val DCCP_REASON_CONN_REF: CInt = 5
public const val DCCP_REASON_BAD_SNAME: CInt = 6
public const val DCCP_REASON_BAD_COOKIE: CInt = 7
public const val DCCP_REASON_INV_MOVE: CInt = 8
public const val DCCP_REASON_UNANSW_CH: CInt = 10
public const val DCCP_REASON_FRUITLESS_NEG: CInt = 11
public const val DCCP_CCID: CInt = 1
public const val DCCP_CSLEN: CInt = 2
public const val DCCP_MAXSEG: CInt = 4
public const val DCCP_SERVICE: CInt = 8
public const val DCCP_NDP_LIMIT: CInt = 16
public const val DCCP_SEQ_NUM_LIMIT: CInt = 16777216
public const val DCCP_MAX_OPTIONS: CInt = 32
public const val DCCP_MAX_PKTS: CInt = 100
public const val _PC_LINK_MAX: CInt = 1
public const val _PC_MAX_CANON: CInt = 2
public const val _PC_MAX_INPUT: CInt = 3
public const val _PC_NAME_MAX: CInt = 4
public const val _PC_PATH_MAX: CInt = 5
public const val _PC_PIPE_BUF: CInt = 6
public const val _PC_CHOWN_RESTRICTED: CInt = 7
public const val _PC_NO_TRUNC: CInt = 8
public const val _PC_VDISABLE: CInt = 9
public const val _PC_SYNC_IO: CInt = 10
public const val _PC_FILESIZEBITS: CInt = 11
public const val _PC_SYMLINK_MAX: CInt = 12
public const val _PC_2_SYMLINKS: CInt = 13
public const val _PC_ACL_EXTENDED: CInt = 14
public const val _PC_MIN_HOLE_SIZE: CInt = 15
public const val _CS_PATH: CInt = 1
public const val _SC_SYNCHRONIZED_IO: CInt = 31
public const val _SC_IOV_MAX: CInt = 32
public const val _SC_MAPPED_FILES: CInt = 33
public const val _SC_MEMLOCK: CInt = 34
public const val _SC_MEMLOCK_RANGE: CInt = 35
public const val _SC_MEMORY_PROTECTION: CInt = 36
public const val _SC_LOGIN_NAME_MAX: CInt = 37
public const val _SC_MONOTONIC_CLOCK: CInt = 38
public const val _SC_CLK_TCK: CInt = 39
public const val _SC_ATEXIT_MAX: CInt = 40
public const val _SC_THREADS: CInt = 41
public const val _SC_SEMAPHORES: CInt = 42
public const val _SC_BARRIERS: CInt = 43
public const val _SC_TIMERS: CInt = 44
public const val _SC_SPIN_LOCKS: CInt = 45
public const val _SC_READER_WRITER_LOCKS: CInt = 46
public const val _SC_GETGR_R_SIZE_MAX: CInt = 47
public const val _SC_GETPW_R_SIZE_MAX: CInt = 48
public const val _SC_CLOCK_SELECTION: CInt = 49
public const val _SC_ASYNCHRONOUS_IO: CInt = 50
public const val _SC_AIO_LISTIO_MAX: CInt = 51
public const val _SC_AIO_MAX: CInt = 52
public const val _SC_MESSAGE_PASSING: CInt = 53
public const val _SC_MQ_OPEN_MAX: CInt = 54
public const val _SC_MQ_PRIO_MAX: CInt = 55
public const val _SC_PRIORITY_SCHEDULING: CInt = 56
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 57
public const val _SC_THREAD_KEYS_MAX: CInt = 58
public const val _SC_THREAD_STACK_MIN: CInt = 59
public const val _SC_THREAD_THREADS_MAX: CInt = 60
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 61
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 62
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 63
public const val _SC_THREAD_PRIO_INHERIT: CInt = 64
public const val _SC_THREAD_PRIO_PROTECT: CInt = 65
public const val _SC_THREAD_PROCESS_SHARED: CInt = 66
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 67
public const val _SC_TTY_NAME_MAX: CInt = 68
public const val _SC_HOST_NAME_MAX: CInt = 69
public const val _SC_PASS_MAX: CInt = 70
public const val _SC_REGEXP: CInt = 71
public const val _SC_SHELL: CInt = 72
public const val _SC_SYMLOOP_MAX: CInt = 73
public const val _SC_V6_ILP32_OFF32: CInt = 74
public const val _SC_V6_ILP32_OFFBIG: CInt = 75
public const val _SC_V6_LP64_OFF64: CInt = 76
public const val _SC_V6_LPBIG_OFFBIG: CInt = 77
public const val _SC_2_PBS: CInt = 80
public const val _SC_2_PBS_ACCOUNTING: CInt = 81
public const val _SC_2_PBS_CHECKPOINT: CInt = 82
public const val _SC_2_PBS_LOCATE: CInt = 83
public const val _SC_2_PBS_MESSAGE: CInt = 84
public const val _SC_2_PBS_TRACK: CInt = 85
public const val _SC_SPAWN: CInt = 86
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 87
public const val _SC_TIMER_MAX: CInt = 88
public const val _SC_SEM_NSEMS_MAX: CInt = 89
public const val _SC_CPUTIME: CInt = 90
public const val _SC_THREAD_CPUTIME: CInt = 91
public const val _SC_DELAYTIMER_MAX: CInt = 92
public const val _SC_PHYS_PAGES: CInt = 121
public const val _SC_NPROCESSORS_CONF: CInt = 1001
public const val _SC_NPROCESSORS_ONLN: CInt = 1002
public const val _SC_SCHED_RT_TS: CInt = 2001
public const val _SC_SCHED_PRI_MIN: CInt = 2002
public const val _SC_SCHED_PRI_MAX: CInt = 2003
public const val FD_SETSIZE: ULong = 0x100uL
public const val ST_NOSUID: CULong = 8uL
public const val MNT_UNION: CInt = 0x00000020
public const val MNT_NOCOREDUMP: CInt = 0x00008000
public const val MNT_RELATIME: CInt = 0x00020000
public const val MNT_IGNORE: CInt = 0x00100000
public const val MNT_NFS4ACLS: CInt = 0x00200000
public const val MNT_DISCARD: CInt = 0x00800000
public const val MNT_EXTATTR: CInt = 0x01000000
public const val MNT_LOG: CInt = 0x02000000
public const val MNT_NOATIME: CInt = 0x04000000
public const val MNT_AUTOMOUNTED: CInt = 0x10000000
public const val MNT_SYMPERM: CInt = 0x20000000
public const val MNT_NODEVMTIME: CInt = 0x40000000
public const val MNT_SOFTDEP: CInt = 0x80000000
public const val MNT_POSIX1EACLS: CInt = 0x00000800
public const val MNT_ACLS: CInt = MNT_POSIX1EACLS
public const val MNT_WAIT: CInt = 1
public const val MNT_NOWAIT: CInt = 2
public const val MNT_LAZY: CInt = 3
public const val IOCPARM_SHIFT: UInt = 16u
public const val IOCGROUP_SHIFT: UInt = 8u
public const val NTP_API: CInt = 4
public const val LITTLE_ENDIAN: CInt = 1234
public const val BIG_ENDIAN: CInt = 4321
public const val PL_EVENT_NONE: CInt = 0
public const val PL_EVENT_SIGNAL: CInt = 1
public const val PL_EVENT_SUSPENDED: CInt = 2
// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { ptm_magic: 0x33330003, ptm_errorcheck: 0, ptm_pad1: Padding::uninit(), ptm_unused: Padding::uninit(), ptm_pad2: Padding::uninit(), ptm_waiters: 0 as *mut _, ptm_owner: 0, ptm_recursed: 0, ptm_spare2: 0 as *mut _, } (initializer represented at the FFI boundary)
// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { ptm_magic: 0x33330003, ptm_errorcheck: 0, ptm_unused: Padding::uninit(), ptm_waiters: 0 as *mut _, ptm_owner: 0, ptm_recursed: 0, ptm_spare2: 0 as *mut _, } (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { ptc_magic: 0x55550005, ptc_lock: 0, ptc_waiters_first: 0 as *mut _, ptc_waiters_last: 0 as *mut _, ptc_mutex: 0 as *mut _, ptc_private: 0 as *mut _, } (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { ptr_magic: 0x99990009, ptr_interlock: 0, ptr_rblocked_first: 0 as *mut _, ptr_rblocked_last: 0 as *mut _, ptr_wblocked_first: 0 as *mut _, ptr_wblocked_last: 0 as *mut _, ptr_nreaders: 0, ptr_owner: 0, ptr_private: 0 as *mut _, } (initializer represented at the FFI boundary)
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 1
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 2
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
public const val SCHED_NONE: CInt = -1
public const val SCHED_OTHER: CInt = 0
public const val SCHED_FIFO: CInt = 1
public const val SCHED_RR: CInt = 2
public const val EVFILT_AIO: UInt = 2u
public const val EVFILT_PROC: UInt = 4u
public const val EVFILT_READ: UInt = 0u
public const val EVFILT_SIGNAL: UInt = 5u
public const val EVFILT_TIMER: UInt = 6u
public const val EVFILT_VNODE: UInt = 3u
public const val EVFILT_WRITE: UInt = 1u
public const val EVFILT_FS: UInt = 7u
public const val EVFILT_USER: UInt = 8u
public const val EVFILT_EMPTY: UInt = 9u
public const val EV_ADD: UInt = 0x1u
public const val EV_DELETE: UInt = 0x2u
public const val EV_ENABLE: UInt = 0x4u
public const val EV_DISABLE: UInt = 0x8u
public const val EV_ONESHOT: UInt = 0x10u
public const val EV_CLEAR: UInt = 0x20u
public const val EV_RECEIPT: UInt = 0x40u
public const val EV_DISPATCH: UInt = 0x80u
public const val EV_FLAG1: UInt = 0x2000u
public const val EV_ERROR: UInt = 0x4000u
public const val EV_EOF: UInt = 0x8000u
public const val EV_SYSFLAGS: UInt = 0xf000u
public const val NOTE_TRIGGER: UInt = 0x01000000u
public const val NOTE_FFNOP: UInt = 0x00000000u
public const val NOTE_FFAND: UInt = 0x40000000u
public const val NOTE_FFOR: UInt = 0x80000000u
public const val NOTE_FFCOPY: UInt = 0xc0000000u
public const val NOTE_FFCTRLMASK: UInt = 0xc0000000u
public const val NOTE_FFLAGSMASK: UInt = 0x00ffffffu
public const val NOTE_LOWAT: UInt = 0x00000001u
public const val NOTE_DELETE: UInt = 0x00000001u
public const val NOTE_WRITE: UInt = 0x00000002u
public const val NOTE_EXTEND: UInt = 0x00000004u
public const val NOTE_ATTRIB: UInt = 0x00000008u
public const val NOTE_LINK: UInt = 0x00000010u
public const val NOTE_RENAME: UInt = 0x00000020u
public const val NOTE_REVOKE: UInt = 0x00000040u
public const val NOTE_EXIT: UInt = 0x80000000u
public const val NOTE_FORK: UInt = 0x40000000u
public const val NOTE_EXEC: UInt = 0x20000000u
public const val NOTE_PDATAMASK: UInt = 0x000fffffu
public const val NOTE_PCTRLMASK: UInt = 0xf0000000u
public const val NOTE_TRACK: UInt = 0x00000001u
public const val NOTE_TRACKERR: UInt = 0x00000002u
public const val NOTE_CHILD: UInt = 0x00000004u
public const val NOTE_MSECONDS: UInt = 0x00000000u
public const val NOTE_SECONDS: UInt = 0x00000001u
public const val NOTE_USECONDS: UInt = 0x00000002u
public const val NOTE_NSECONDS: UInt = 0x00000003u
public const val NOTE_ABSTIME: UInt = 0x000000010u
public const val TMP_MAX: CUInt = 308915776u
public const val AI_PASSIVE: CInt = 0x00000001
public const val AI_CANONNAME: CInt = 0x00000002
public const val AI_NUMERICHOST: CInt = 0x00000004
public const val AI_NUMERICSERV: CInt = 0x00000008
public const val AI_ADDRCONFIG: CInt = 0x00000400
public const val AI_SRV: CInt = 0x00000800
public const val NI_MAXHOST: SocklenT = 1025
public const val NI_MAXSERV: SocklenT = 32
public const val NI_NOFQDN: CInt = 0x00000001
public const val NI_NUMERICHOST: CInt = 0x000000002
public const val NI_NAMEREQD: CInt = 0x000000004
public const val NI_NUMERICSERV: CInt = 0x000000008
public const val NI_DGRAM: CInt = 0x00000010
public const val NI_WITHSCOPEID: CInt = 0x00000020
public const val NI_NUMERICSCOPE: CInt = 0x00000040
public const val RTLD_NOLOAD: CInt = 0x2000
public const val RTLD_LOCAL: CInt = 0x200
public const val CTL_MAXNAME: CInt = 12
public const val SYSCTL_NAMELEN: CInt = 32
public const val SYSCTL_DEFSIZE: CInt = 8
public const val CTLTYPE_NODE: CInt = 1
public const val CTLTYPE_INT: CInt = 2
public const val CTLTYPE_STRING: CInt = 3
public const val CTLTYPE_QUAD: CInt = 4
public const val CTLTYPE_STRUCT: CInt = 5
public const val CTLTYPE_BOOL: CInt = 6
public const val CTLFLAG_READONLY: CInt = 0x00000000
public const val CTLFLAG_READWRITE: CInt = 0x00000070
public const val CTLFLAG_ANYWRITE: CInt = 0x00000080
public const val CTLFLAG_PRIVATE: CInt = 0x00000100
public const val CTLFLAG_PERMANENT: CInt = 0x00000200
public const val CTLFLAG_OWNDATA: CInt = 0x00000400
public const val CTLFLAG_IMMEDIATE: CInt = 0x00000800
public const val CTLFLAG_HEX: CInt = 0x00001000
public const val CTLFLAG_ROOT: CInt = 0x00002000
public const val CTLFLAG_ANYNUMBER: CInt = 0x00004000
public const val CTLFLAG_HIDDEN: CInt = 0x00008000
public const val CTLFLAG_ALIAS: CInt = 0x00010000
public const val CTLFLAG_MMAP: CInt = 0x00020000
public const val CTLFLAG_OWNDESC: CInt = 0x00040000
public const val CTLFLAG_UNSIGNED: CInt = 0x00080000
public const val SYSCTL_VERS_MASK: CInt = 0xff000000
public const val SYSCTL_VERS_0: CInt = 0x00000000
public const val SYSCTL_VERS_1: CInt = 0x01000000
public const val SYSCTL_VERSION: CInt = SYSCTL_VERS_1
public const val CTL_EOL: CInt = -1
public const val CTL_QUERY: CInt = -2
public const val CTL_CREATE: CInt = -3
public const val CTL_CREATESYM: CInt = -4
public const val CTL_DESTROY: CInt = -5
public const val CTL_MMAP: CInt = -6
public const val CTL_DESCRIBE: CInt = -7
public const val CTL_UNSPEC: CInt = 0
public const val CTL_KERN: CInt = 1
public const val CTL_VM: CInt = 2
public const val CTL_VFS: CInt = 3
public const val CTL_NET: CInt = 4
public const val CTL_DEBUG: CInt = 5
public const val CTL_HW: CInt = 6
public const val CTL_MACHDEP: CInt = 7
public const val CTL_USER: CInt = 8
public const val CTL_DDB: CInt = 9
public const val CTL_PROC: CInt = 10
public const val CTL_VENDOR: CInt = 11
public const val CTL_EMUL: CInt = 12
public const val CTL_SECURITY: CInt = 13
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
public const val KERN_VNODE: CInt = 13
public const val KERN_PROC: CInt = 14
public const val KERN_FILE: CInt = 15
public const val KERN_PROF: CInt = 16
public const val KERN_POSIX1: CInt = 17
public const val KERN_NGROUPS: CInt = 18
public const val KERN_JOB_CONTROL: CInt = 19
public const val KERN_SAVED_IDS: CInt = 20
public const val KERN_OBOOTTIME: CInt = 21
public const val KERN_DOMAINNAME: CInt = 22
public const val KERN_MAXPARTITIONS: CInt = 23
public const val KERN_RAWPARTITION: CInt = 24
public const val KERN_NTPTIME: CInt = 25
public const val KERN_TIMEX: CInt = 26
public const val KERN_AUTONICETIME: CInt = 27
public const val KERN_AUTONICEVAL: CInt = 28
public const val KERN_RTC_OFFSET: CInt = 29
public const val KERN_ROOT_DEVICE: CInt = 30
public const val KERN_MSGBUFSIZE: CInt = 31
public const val KERN_FSYNC: CInt = 32
public const val KERN_OLDSYSVMSG: CInt = 33
public const val KERN_OLDSYSVSEM: CInt = 34
public const val KERN_OLDSYSVSHM: CInt = 35
public const val KERN_OLDSHORTCORENAME: CInt = 36
public const val KERN_SYNCHRONIZED_IO: CInt = 37
public const val KERN_IOV_MAX: CInt = 38
public const val KERN_MBUF: CInt = 39
public const val KERN_MAPPED_FILES: CInt = 40
public const val KERN_MEMLOCK: CInt = 41
public const val KERN_MEMLOCK_RANGE: CInt = 42
public const val KERN_MEMORY_PROTECTION: CInt = 43
public const val KERN_LOGIN_NAME_MAX: CInt = 44
public const val KERN_DEFCORENAME: CInt = 45
public const val KERN_LOGSIGEXIT: CInt = 46
public const val KERN_PROC2: CInt = 47
public const val KERN_PROC_ARGS: CInt = 48
public const val KERN_FSCALE: CInt = 49
public const val KERN_CCPU: CInt = 50
public const val KERN_CP_TIME: CInt = 51
public const val KERN_OLDSYSVIPC_INFO: CInt = 52
public const val KERN_MSGBUF: CInt = 53
public const val KERN_CONSDEV: CInt = 54
public const val KERN_MAXPTYS: CInt = 55
public const val KERN_PIPE: CInt = 56
public const val KERN_MAXPHYS: CInt = 57
public const val KERN_SBMAX: CInt = 58
public const val KERN_TKSTAT: CInt = 59
public const val KERN_MONOTONIC_CLOCK: CInt = 60
public const val KERN_URND: CInt = 61
public const val KERN_LABELSECTOR: CInt = 62
public const val KERN_LABELOFFSET: CInt = 63
public const val KERN_LWP: CInt = 64
public const val KERN_FORKFSLEEP: CInt = 65
public const val KERN_POSIX_THREADS: CInt = 66
public const val KERN_POSIX_SEMAPHORES: CInt = 67
public const val KERN_POSIX_BARRIERS: CInt = 68
public const val KERN_POSIX_TIMERS: CInt = 69
public const val KERN_POSIX_SPIN_LOCKS: CInt = 70
public const val KERN_POSIX_READER_WRITER_LOCKS: CInt = 71
public const val KERN_DUMP_ON_PANIC: CInt = 72
public const val KERN_SOMAXKVA: CInt = 73
public const val KERN_ROOT_PARTITION: CInt = 74
public const val KERN_DRIVERS: CInt = 75
public const val KERN_BUF: CInt = 76
public const val KERN_FILE2: CInt = 77
public const val KERN_VERIEXEC: CInt = 78
public const val KERN_CP_ID: CInt = 79
public const val KERN_HARDCLOCK_TICKS: CInt = 80
public const val KERN_ARND: CInt = 81
public const val KERN_SYSVIPC: CInt = 82
public const val KERN_BOOTTIME: CInt = 83
public const val KERN_EVCNT: CInt = 84
public const val KERN_PROC_ALL: CInt = 0
public const val KERN_PROC_PID: CInt = 1
public const val KERN_PROC_PGRP: CInt = 2
public const val KERN_PROC_SESSION: CInt = 3
public const val KERN_PROC_TTY: CInt = 4
public const val KERN_PROC_UID: CInt = 5
public const val KERN_PROC_RUID: CInt = 6
public const val KERN_PROC_GID: CInt = 7
public const val KERN_PROC_RGID: CInt = 8
public const val KERN_PROC_ARGV: CInt = 1
public const val KERN_PROC_NARGV: CInt = 2
public const val KERN_PROC_ENV: CInt = 3
public const val KERN_PROC_NENV: CInt = 4
public const val KERN_PROC_PATHNAME: CInt = 5
public const val VM_PROC: CInt = 16
public const val VM_PROC_MAP: CInt = 1
public const val EAI_AGAIN: CInt = 2
public const val EAI_BADFLAGS: CInt = 3
public const val EAI_FAIL: CInt = 4
public const val EAI_FAMILY: CInt = 5
public const val EAI_MEMORY: CInt = 6
public const val EAI_NODATA: CInt = 7
public const val EAI_NONAME: CInt = 8
public const val EAI_SERVICE: CInt = 9
public const val EAI_SOCKTYPE: CInt = 10
public const val EAI_SYSTEM: CInt = 11
public const val EAI_OVERFLOW: CInt = 14
public const val AIO_CANCELED: CInt = 1
public const val AIO_NOTCANCELED: CInt = 2
public const val AIO_ALLDONE: CInt = 3
public const val LIO_NOP: CInt = 0
public const val LIO_WRITE: CInt = 1
public const val LIO_READ: CInt = 2
public const val LIO_WAIT: CInt = 1
public const val LIO_NOWAIT: CInt = 0
public const val SIGEV_NONE: CInt = 0
public const val SIGEV_SIGNAL: CInt = 1
public const val SIGEV_THREAD: CInt = 2
public const val WSTOPPED: CInt = 0x00000002
public const val WCONTINUED: CInt = 0x00000010
public const val WEXITED: CInt = 0x000000020
public const val WNOWAIT: CInt = 0x00010000
public const val WALTSIG: CInt = 0x00000004
public const val WALLSIG: CInt = 0x00000008
public const val WTRAPPED: CInt = 0x00000040
public const val WNOZOMBIE: CInt = 0x00020000
public const val P_ALL: IdtypeT = 0
public const val P_PID: IdtypeT = 1
public const val P_PGID: IdtypeT = 4
public const val UTIME_OMIT: CLong = 1073741822
public const val UTIME_NOW: CLong = 1073741823
public const val B460800: SpeedT = 460800
public const val B921600: SpeedT = 921600
public const val ONOCR: TcflagT = 0x20
public const val ONLRET: TcflagT = 0x40
public const val CDTRCTS: TcflagT = 0x00020000
public val CHWFLOW: TcflagT = MDMBUF or CRTSCTS or CDTRCTS
public const val SOCK_CLOEXEC: CInt = 0x10000000
public const val SOCK_NONBLOCK: CInt = 0x20000000
public const val FIOSEEKDATA: CULong = 0xc0086661uL
public const val FIOSEEKHOLE: CULong = 0xc0086662uL
public const val OFIOGETBMAP: CULong = 0xc004667auL
public const val FIOGETBMAP: CULong = 0xc008667auL
public const val FIONWRITE: CULong = 0x40046679uL
public const val FIONSPACE: CULong = 0x40046678uL
public const val FIBMAP: CULong = 0xc008667auL
public const val SIGSTKSZ: ULong = 40960uL
public const val REG_ILLSEQ: CInt = 17
public const val PT_DUMPCORE: CInt = 12
public const val PT_LWPINFO: CInt = 13
public const val PT_SYSCALL: CInt = 14
public const val PT_SYSCALLEMU: CInt = 15
public const val PT_SET_EVENT_MASK: CInt = 16
public const val PT_GET_EVENT_MASK: CInt = 17
public const val PT_GET_PROCESS_STATE: CInt = 18
public const val PT_SET_SIGINFO: CInt = 19
public const val PT_GET_SIGINFO: CInt = 20
public const val PT_RESUME: CInt = 21
public const val PT_SUSPEND: CInt = 22
public const val PT_STOP: CInt = 23
public const val PT_LWPSTATUS: CInt = 24
public const val PT_LWPNEXT: CInt = 25
public const val PT_SET_SIGPASS: CInt = 26
public const val PT_GET_SIGPASS: CInt = 27
public const val PT_FIRSTMACH: CInt = 32
public const val POSIX_SPAWN_RETURNERROR: CInt = 0x40
public const val SF_APPEND: CULong = 0x00040000uL
public const val SF_ARCHIVED: CULong = 0x00010000uL
public const val SF_IMMUTABLE: CULong = 0x00020000uL
public const val SF_LOG: CULong = 0x00400000uL
public const val SF_SETTABLE: CULong = 0xffff0000uL
public const val SF_SNAPINVAL: CULong = 0x00800000uL
public const val SF_SNAPSHOT: CULong = 0x00200000uL
public const val UF_APPEND: CULong = 0x00000004uL
public const val UF_IMMUTABLE: CULong = 0x00000002uL
public const val UF_NODUMP: CULong = 0x00000001uL
public const val UF_OPAQUE: CULong = 0x00000008uL
public const val UF_SETTABLE: CULong = 0x0000ffffuL
public const val KVME_PROT_READ: CInt = 0x00000001
public const val KVME_PROT_WRITE: CInt = 0x00000002
public const val KVME_PROT_EXEC: CInt = 0x00000004
public const val KVME_FLAG_COW: CInt = 0x00000001
public const val KVME_FLAG_NEEDS_COPY: CInt = 0x00000002
public const val KVME_FLAG_NOCOREDUMP: CInt = 0x000000004
public const val KVME_FLAG_PAGEABLE: CInt = 0x000000008
public const val KVME_FLAG_GROWS_UP: CInt = 0x000000010
public const val KVME_FLAG_GROWS_DOWN: CInt = 0x000000020
public const val NGROUPS_MAX: CInt = 16
public const val KI_NGROUPS: CInt = 16
public const val KI_MAXCOMLEN: CInt = 24
public const val KI_WMESGLEN: CInt = 8
public const val KI_MAXLOGNAME: CInt = 24
public const val KI_MAXEMULLEN: CInt = 16
public const val KI_LNAMELEN: CInt = 20
public const val LSIDL: CInt = 1
public const val LSRUN: CInt = 2
public const val LSSLEEP: CInt = 3
public const val LSSTOP: CInt = 4
public const val LSZOMB: CInt = 5
public const val LSONPROC: CInt = 7
public const val LSSUSPENDED: CInt = 8
public const val XATTR_CREATE: CInt = 0x01
public const val XATTR_REPLACE: CInt = 0x02
public const val EXTATTR_NAMESPACE_EMPTY: CInt = 0
public const val GRND_NONBLOCK: CUInt = 0x1u
public const val GRND_RANDOM: CUInt = 0x2u
public const val GRND_INSECURE: CUInt = 0x4u
public const val RB_ASKNAME: CInt = 0x000000001
public const val RB_SINGLE: CInt = 0x000000002
public const val RB_NOSYNC: CInt = 0x000000004
public const val RB_HALT: CInt = 0x000000008
public const val RB_INITNAME: CInt = 0x000000010
public const val RB_KDB: CInt = 0x000000040
public const val RB_RDONLY: CInt = 0x000000080
public const val RB_DUMP: CInt = 0x000000100
public const val RB_MINIROOT: CInt = 0x000000200
public const val RB_STRING: CInt = 0x000000400
public val RB_POWERDOWN: CInt = RB_HALT or 0x000000800
public const val RB_USERCONF: CInt = 0x000001000
public const val RTF_MASK: CInt = 0x80
public const val RTF_CONNECTED: CInt = 0x100
public const val RTF_ANNOUNCE: CInt = 0x20000
public const val RTF_SRC: CInt = 0x10000
public const val RTF_LOCAL: CInt = 0x40000
public const val RTF_BROADCAST: CInt = 0x80000
public const val RTF_UPDATING: CInt = 0x100000
public const val RTF_DONTCHANGEIFA: CInt = 0x200000
public const val RTM_VERSION: CInt = 4
public const val RTM_LOCK: CInt = 0x8
public const val RTM_IFANNOUNCE: CInt = 0x10
public const val RTM_IEEE80211: CInt = 0x11
public const val RTM_SETGATE: CInt = 0x12
public const val RTM_LLINFO_UPD: CInt = 0x13
public const val RTM_IFINFO: CInt = 0x14
public const val RTM_OCHGADDR: CInt = 0x15
public const val RTM_NEWADDR: CInt = 0x16
public const val RTM_DELADDR: CInt = 0x17
public const val RTM_CHGADDR: CInt = 0x18
public const val RTA_TAG: CInt = 0x100
public const val RTAX_TAG: CInt = 8
public const val RTAX_MAX: CInt = 9
public const val EFD_SEMAPHORE: CInt = O_RDWR
public const val EFD_NONBLOCK: CInt = O_NONBLOCK
public const val EFD_CLOEXEC: CInt = O_CLOEXEC
public const val TFD_CLOEXEC: Int = O_CLOEXEC
public const val TFD_NONBLOCK: Int = O_NONBLOCK
public const val TFD_TIMER_ABSTIME: Int = O_WRONLY
public const val TFD_TIMER_CANCEL_ON_SET: Int = O_RDWR

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?
public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?
public expect fun dirfd(dirp: DIR?): CInt
public expect fun sOCKCREDSIZE(ngrps: ULong): ULong
public expect fun pROTMPROTECT(x: CInt): CInt
public expect fun pROTMPROTECTEXTRACT(x: CInt): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt
public expect fun reallocarr(ptr: COpaquePointer?, number: ULong, size: ULong): CInt
public expect fun chflags(path: String?, flags: CULong): CInt
public expect fun fchflags(fd: CInt, flags: CULong): CInt
public expect fun lchflags(path: String?, flags: CULong): CInt
public expect fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT
public expect fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT
public expect fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT
public expect fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt
public expect fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt
public expect fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt
public expect fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT
public expect fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT
public expect fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT
public expect fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt
public expect fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): CInt
public expect fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): CInt
public expect fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): CInt
public expect fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt
public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt
public expect fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT
public expect fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt
public expect fun lutimes(file: String?, times: Timeval?): CInt
public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt
public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt
public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt
public expect fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt
public expect fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt
public expect fun sysctlnametomib(sname: String?, name: CInt?, namelenp: ULong?): CInt
public expect fun kevent(kq: CInt, changelist: Kevent?, nchanges: ULong, eventlist: Kevent?, nevents: ULong, timeout: Timespec?): CInt
public expect fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?, size: ULong): CInt
public expect fun mqOpen(name: String?, oflag: CInt, ...): MqdT
public expect fun mqClose(mqd: MqdT): CInt
public expect fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt
public expect fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt
public expect fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT
public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt
public expect fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt
public expect fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT
public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt
public expect fun mqUnlink(name: String?): CInt
public expect fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt
public expect fun utrace(label: String?, addr: COpaquePointer?, len: ULong): CInt
public expect fun pthreadGetnameNp(t: PthreadT, name: String?, len: ULong): CInt
public expect fun pthreadSetnameNp(t: PthreadT, name: String?, arg: COpaquePointer?): CInt
public expect fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt
public expect fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt
public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt
public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt
public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt
public expect fun pthreadGetaffinityNp(thread: PthreadT, size: ULong, set: CpusetT?): CInt
public expect fun pthreadSetaffinityNp(thread: PthreadT, size: ULong, set: CpusetT?): CInt
public expect fun cpusetCreate(): CpusetT?
public expect fun cpusetDestroy(set: CpusetT?)
public expect fun cpusetClr(cpu: CpuidT, set: CpusetT?): CInt
public expect fun cpusetSet(cpu: CpuidT, set: CpusetT?): CInt
public expect fun cpusetIsset(cpu: CpuidT, set: CpusetT?): CInt
public expect fun cpusetSize(set: CpusetT?): ULong
public expect fun cpusetZero(set: CpusetT?)
public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt
public expect fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt
public expect fun duplocale(base: LocaleT): LocaleT
public expect fun freelocale(loc: LocaleT)
public expect fun localeconvL(loc: LocaleT): Lconv?
public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT
public expect fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt
public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt
public expect fun kqueue1(flags: CInt): CInt
public expect fun lwpSelf(): LwpidT
public expect fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer?
public expect fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt
public expect fun dlauxinfo(): COpaquePointer?
public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT
public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong
public expect fun iconvClose(cd: IconvT): CInt
public expect fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt
public expect fun timerDelete(timerid: TimerT): CInt
public expect fun timerGetoverrun(timerid: TimerT): CInt
public expect fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt
public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt
public expect fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer?
public expect fun explicitMemset(b: COpaquePointer?, c: CInt, len: ULong)
public expect fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt
public expect fun setproctitle(fmt: String?, ...)
public expect fun mremap(oldp: COpaquePointer?, oldsize: ULong, newp: COpaquePointer?, newsize: ULong, flags: CInt): COpaquePointer?
public expect fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt
public expect fun schedSetparam(pid: PidT, param: SchedParam?): CInt
public expect fun schedGetparam(pid: PidT, param: SchedParam?): CInt
public expect fun schedGetscheduler(pid: PidT): CInt
public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt
public expect fun pollts(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: SigsetT?): CInt
public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT
public expect fun reboot(mode: CInt, bootstr: String?): CInt
public expect fun lwpPark(clock: ClockidT, flags: CInt, ts: Timespec?, unpark: LwpidT, hint: COpaquePointer?, unparkhint: COpaquePointer?): CInt
public expect fun lwpUnpark(lwp: LwpidT, hint: COpaquePointer?): CInt
public expect fun lwpUnparkAll(targets: LwpidT?, ntargets: ULong, hint: COpaquePointer?): CInt
public expect fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt
public expect fun getvfsstat(buf: Statvfs?, bufsize: ULong, flags: CInt): CInt
public expect fun eventfd(`val`: CUInt, flags: CInt): CInt
public expect fun eventfdRead(efd: CInt, valp: EventfdT?): CInt
public expect fun eventfdWrite(efd: CInt, `val`: EventfdT): CInt
public expect fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt
public expect fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt
public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt
public expect fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?)
public expect fun aioRead(aiocbp: Aiocb?): CInt
public expect fun aioWrite(aiocbp: Aiocb?): CInt
public expect fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt
public expect fun aioError(aiocbp: Aiocb?): CInt
public expect fun aioReturn(aiocbp: Aiocb?): SsizeT
public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt
public expect fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt
public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt
public expect fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun efopen(p: String?, m: String?): FILE
public expect fun emalloc(n: ULong): COpaquePointer?
public expect fun ecalloc(n: ULong, c: ULong): COpaquePointer?
public expect fun erealloc(p: COpaquePointer?, n: ULong): COpaquePointer?
public expect fun ereallocarr(p: COpaquePointer?, n: ULong, s: ULong)
public expect fun estrdup(s: String?): String?
public expect fun estrndup(s: String?, len: ULong): String?
public expect fun estrlcpy(dst: String?, src: String?, len: ULong): ULong
public expect fun estrlcat(dst: String?, src: String?, len: ULong): ULong
public expect fun estrtoi(nptr: String?, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT
public expect fun estrtou(nptr: String?, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT
public expect fun easprintf(string: COpaquePointer?, fmt: String?, ...): CInt
public expect fun evasprintf(string: COpaquePointer?, fmt: String?, ...): CInt
public expect fun esetfunc(cb: ((CInt, String?, ...) -> Unit)?): ((CInt, String?, ...) -> Unit)?
public expect fun securePath(path: String?): CInt
public expect fun snprintb(buf: String?, buflen: ULong, fmt: String?, `val`: ULong): CInt
public expect fun snprintbM(buf: String?, buflen: ULong, fmt: String?, `val`: ULong, max: ULong): CInt
public expect fun getbootfile(): String?
public expect fun getbyteorder(): CInt
public expect fun getdiskrawname(buf: String?, buflen: ULong, name: String?): String?
public expect fun getdiskcookedname(buf: String?, buflen: ULong, name: String?): String?
public expect fun getfsspecname(buf: String?, buflen: ULong, spec: String?): String?
public expect fun strpct(buf: String?, bufsiz: ULong, numerator: UintmaxT, denominator: UintmaxT, precision: ULong): String?
public expect fun strspct(buf: String?, bufsiz: ULong, numerator: IntmaxT, denominator: IntmaxT, precision: ULong): String?
public expect fun login(ut: Utmp?)
public expect fun loginx(ut: Utmpx?)
public expect fun logout(line: String?)
public expect fun logoutx(line: String?, status: CInt, tpe: CInt)
public expect fun logwtmp(line: String?, name: String?, host: String?)
public expect fun logwtmpx(line: String?, name: String?, host: String?, status: CInt, tpe: CInt)
public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT
public expect fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT
public expect fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong): SsizeT
public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): CInt
public expect fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): CInt
public expect fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt
public expect fun listxattr(path: String?, list: String?, size: ULong): SsizeT
public expect fun llistxattr(path: String?, list: String?, size: ULong): SsizeT
public expect fun flistxattr(filedes: CInt, list: String?, size: ULong): SsizeT
public expect fun removexattr(path: String?, name: String?): CInt
public expect fun lremovexattr(path: String?, name: String?): CInt
public expect fun fremovexattr(fd: CInt, path: String?, name: String?): CInt
public expect fun stringToFlags(stringP: COpaquePointer?, setp: CULong?, clrp: CULong?): CInt
public expect fun flagsToString(flags: CULong, def: String?): CInt
public expect fun kinfoGetvmmap(pid: PidT, cntp: ULong?): KinfoVmentry?
public expect fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong
public expect fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer?
public expect fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: CInt): CInt
public expect fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer?
public expect fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: ULong, fd: CInt, fmt: String?): CInt
