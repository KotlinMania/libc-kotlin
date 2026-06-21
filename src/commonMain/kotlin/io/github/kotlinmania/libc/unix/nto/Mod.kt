// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias ClockT = UInt
public typealias SaFamilyT = UByte
public typealias SpeedT = CUInt
public typealias TcflagT = CUInt
public typealias ClockidT = CInt
public typealias TimerT = CInt
public typealias KeyT = CUInt
public typealias IdT = CInt
public typealias UsecondsT = UInt
public typealias DevT = UInt
public typealias SocklenT = UInt
public typealias ModeT = UInt
public typealias Rlim64T = ULong
public typealias MqdT = CInt
public typealias NfdsT = CUInt
public typealias IdtypeT = CUInt
public typealias ErrnoT = CInt
public typealias RsizeT = CULong
public typealias Elf32Half = UShort
public typealias Elf32Word = UInt
public typealias Elf32Off = UInt
public typealias Elf32Addr = UInt
public typealias Elf32Lword = ULong
public typealias Elf32Sword = Int
public typealias Elf64Half = UShort
public typealias Elf64Word = UInt
public typealias Elf64Off = ULong
public typealias Elf64Addr = ULong
public typealias Elf64Xword = ULong
public typealias Elf64Sxword = Long
public typealias Elf64Lword = ULong
public typealias Elf64Sword = Int
public typealias Elf32Section = UShort
public typealias Elf64Section = UShort
public typealias Time32t = UInt
public typealias PthreadT = CInt
public typealias RegoffT = SsizeT
public typealias NlinkT = UInt
public typealias BlksizeT = UInt
public typealias SusecondsT = Int
public typealias InoT = ULong
public typealias OffT = Long
public typealias BlkcntT = ULong
public typealias MsgqnumT = ULong
public typealias MsglenT = ULong
public typealias FsblkcntT = ULong
public typealias FsfilcntT = ULong
public typealias RlimT = ULong
public typealias PosixSpawnFileActionsT = COpaquePointer?
public typealias PosixSpawnattrT = UintptrT
public typealias PthreadMutexT = SyncT
public typealias PthreadMutexattrT = SyncAttr
public typealias PthreadCondT = SyncT
public typealias PthreadCondattrT = SyncAttr
public typealias PthreadRwlockattrT = SyncAttr
public typealias PthreadKeyT = CInt
public typealias PthreadSpinlockT = SyncT
public typealias PthreadBarrierattrT = SyncAttr
public typealias SemT = SyncT
public typealias NlItem = CInt

public data class DirentExtra(
    val dDatalen: UShort,
    val dType: UShort,
)

public data class Stat(
    val stIno: InoT,
    val stSize: OffT,
    val stDev: DevT,
    val stRdev: DevT,
    val stUid: UidT,
    val stGid: GidT,
    val oldStMtime: Time32t,
    val oldStAtime: Time32t,
    val oldStCtime: Time32t,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stBlocksize: BlksizeT,
    val stNblocks: Int,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stMtim: Timespec,
    val stAtim: Timespec,
    val stCtim: Timespec,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class InAddr(
    val sAddr: InAddrT,
)

public data class Sockaddr(
    val saLen: UByte,
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class SockaddrIn6(
    val sin6Len: UByte,
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
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

public data class FdSet(
    val fdsBits: UIntArray,
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

public data class SchedParam(
    val schedPriority: CInt,
    val schedCurpriority: CInt,
)

public data class SchedParam(
    val schedPriority: CInt,
    val schedCurpriority: CInt,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class Lconv(
    val currencySymbol: String?,
    val intCurrSymbol: String?,
    val monDecimalPoint: String?,
    val monGrouping: String?,
    val monThousandsSep: String?,
    val negativeSign: String?,
    val positiveSign: String?,
    val fracDigits: CChar,
    val intFracDigits: CChar,
    val nCsPrecedes: CChar,
    val nSepBySpace: CChar,
    val nSignPosn: CChar,
    val pCsPrecedes: CChar,
    val pSepBySpace: CChar,
    val pSignPosn: CChar,
    val intNCsPrecedes: CChar,
    val intNSepBySpace: CChar,
    val intNSignPosn: CChar,
    val intPCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intPSignPosn: CChar,
    val decimalPoint: String?,
    val grouping: String?,
    val thousandsSep: String?,
    val fracGrouping: String?,
    val fracSep: String?,
    val false: String?,
    val true: String?,
    val no: String?,
    val yes: String?,
    val nostr: String?,
    val yesstr: String?,
)

public data class InPktinfo(
    val ipiAddr: InAddr,
    val ipiIfindex: CUInt,
)

public data class Ifaddrs(
    val ifaNext: Ifaddrs?,
    val ifaName: String?,
    val ifaFlags: CUInt,
    val ifaAddr: Sockaddr?,
    val ifaNetmask: Sockaddr?,
    val ifaDstaddr: Sockaddr?,
    val ifaData: COpaquePointer?,
)

public data class Arpreq(
    val arpPa: Sockaddr,
    val arpHa: Sockaddr,
    val arpFlags: CInt,
)

public data class Arphdr(
    val arHrd: UShort,
    val arPro: UShort,
    val arHln: UByte,
    val arPln: UByte,
    val arOp: UShort,
)

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: CUInt,
)

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: SsizeT,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siErrno: CInt,
    val data: UByteArray,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saFlags: CInt,
    val saMask: SigsetT,
)

public data class Sync(
    val union: CUInt,
    val owner: CUInt,
)

public data class Rlimit64(
    val rlimCur: Rlim64T,
    val rlimMax: Rlim64T,
)

public data class GlobT(
    val glPathc: ULong,
    val glMatchc: CInt,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: CInt,
    val glErrfunc: ((String?, CInt) -> CInt)?,
)

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UidT,
    val pwGid: GidT,
    val pwAge: String?,
    val pwComment: String?,
    val pwGecos: String?,
    val pwDir: String?,
    val pwShell: String?,
)

public data class IfNameindex(
    val ifIndex: CUInt,
    val ifName: String?,
)

public data class Sembuf(
    val semNum: CUShort,
    val semOp: CShort,
    val semFlg: CShort,
)

public data class Elf32Ehdr(
    val eIdent: UByteArray,
    val eType: Elf32Half,
    val eMachine: Elf32Half,
    val eVersion: Elf32Word,
    val eEntry: Elf32Addr,
    val ePhoff: Elf32Off,
    val eShoff: Elf32Off,
    val eFlags: Elf32Word,
    val eEhsize: Elf32Half,
    val ePhentsize: Elf32Half,
    val ePhnum: Elf32Half,
    val eShentsize: Elf32Half,
    val eShnum: Elf32Half,
    val eShstrndx: Elf32Half,
)

public data class Elf64Ehdr(
    val eIdent: UByteArray,
    val eType: Elf64Half,
    val eMachine: Elf64Half,
    val eVersion: Elf64Word,
    val eEntry: Elf64Addr,
    val ePhoff: Elf64Off,
    val eShoff: Elf64Off,
    val eFlags: Elf64Word,
    val eEhsize: Elf64Half,
    val ePhentsize: Elf64Half,
    val ePhnum: Elf64Half,
    val eShentsize: Elf64Half,
    val eShnum: Elf64Half,
    val eShstrndx: Elf64Half,
)

public data class Elf32Sym(
    val stName: Elf32Word,
    val stValue: Elf32Addr,
    val stSize: Elf32Word,
    val stInfo: CUChar,
    val stOther: CUChar,
    val stShndx: Elf32Section,
)

public data class Elf64Sym(
    val stName: Elf64Word,
    val stInfo: CUChar,
    val stOther: CUChar,
    val stShndx: Elf64Section,
    val stValue: Elf64Addr,
    val stSize: Elf64Xword,
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

public data class Elf32Shdr(
    val shName: Elf32Word,
    val shType: Elf32Word,
    val shFlags: Elf32Word,
    val shAddr: Elf32Addr,
    val shOffset: Elf32Off,
    val shSize: Elf32Word,
    val shLink: Elf32Word,
    val shInfo: Elf32Word,
    val shAddralign: Elf32Word,
    val shEntsize: Elf32Word,
)

public data class Elf64Shdr(
    val shName: Elf64Word,
    val shType: Elf64Word,
    val shFlags: Elf64Xword,
    val shAddr: Elf64Addr,
    val shOffset: Elf64Off,
    val shSize: Elf64Xword,
    val shLink: Elf64Word,
    val shInfo: Elf64Word,
    val shAddralign: Elf64Xword,
    val shEntsize: Elf64Xword,
)

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: CUInt,
)

public data class InotifyEvent(
    val wd: CInt,
    val mask: UInt,
    val cookie: UInt,
    val len: UInt,
)

public data class RegmatchT(
    val rmSo: RegoffT,
    val rmEo: RegoffT,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: CInt,
    val msgControl: COpaquePointer?,
    val msgControllen: SocklenT,
    val msgFlags: CInt,
)

public data class Cmsghdr(
    val cmsgLen: SocklenT,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cCc: List<CcT>,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class Mallinfo(
    val arena: CInt,
    val ordblks: CInt,
    val smblks: CInt,
    val hblks: CInt,
    val hblkhd: CInt,
    val usmblks: CInt,
    val fsmblks: CInt,
    val uordblks: CInt,
    val fordblks: CInt,
    val keepcost: CInt,
)

public data class Flock(
    val lType: Short,
    val lWhence: Short,
    val lZero1: Int,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
    val lSysid: UInt,
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
    val fBasetype: ByteArray,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fFiller: UIntArray,
)

public data class Aiocb(
    val aioFildes: CInt,
    val aioReqprio: CInt,
    val aioOffset: OffT,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioSigevent: Sigevent,
    val aioLioOpcode: CInt,
    val aioLioState: COpaquePointer?,
    val aioNext: Aiocb?,
    val aioFlag: CUInt,
    val aioIotype: CUInt,
    val aioResult: SsizeT,
    val aioError: CUInt,
    val aioSuspend: COpaquePointer?,
    val aioPlist: COpaquePointer?,
    val aioPolicy: CInt,
    val aioParam: SchedParam,
)

public data class PthreadAttrT(
    val data1: CLong,
    val data2: UByteArray,
)

public data class IpcPerm(
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: ModeT,
    val seq: CUInt,
    val key: KeyT,
)

public data class RegexT(
    val reMagic: CInt,
    val reNsub: ULong,
    val reEndp: String?,
    val reG: COpaquePointer?,
)

public data class ThreadAttr(
    val flags: CInt,
    val stacksize: ULong,
    val stackaddr: COpaquePointer?,
    val exitfunc: ((COpaquePointer?) -> Unit)?,
    val policy: CInt,
    val param: SchedParam,
    val guardsize: CUInt,
    val prealloc: CUInt,
    val spare: IntArray,
)

public data class SyncAttr(
    val protocol: CInt,
    val flags: CInt,
    val prioceiling: CInt,
    val clockid: CInt,
    val count: CInt,
)

public data class Sockcred(
    val scUid: UidT,
    val scEuid: UidT,
    val scGid: GidT,
    val scEgid: GidT,
    val scNgroups: CInt,
    val scGroups: List<GidT>,
)

public data class BpfProgram(
    val bfLen: CUInt,
    val bfInsns: BpfInsn?,
)

public data class BpfStat(
    val bsRecv: ULong,
    val bsDrop: ULong,
    val bsCapt: ULong,
)

public data class BpfStat(
    val bsRecv: CUInt,
    val bsDrop: CUInt,
)

public data class BpfVersion(
    val bvMajor: CUShort,
    val bvMinor: CUShort,
)

public data class BpfHdr(
    val bhTstamp: Timeval,
    val bhCaplen: UInt,
    val bhDatalen: UInt,
    val bhHdrlen: UShort,
)

public data class BpfInsn(
    val code: UShort,
    val jt: CUChar,
    val jf: CUChar,
    val k: UInt,
)

public data class BpfDltlist(
    val bflLen: CUInt,
    val bflList: CUInt?,
)

public data class Unpcbid(
    val unpPid: PidT,
    val unpEuid: UidT,
    val unpEgid: GidT,
)

public data class DlPhdrInfo(
    val dlpiAddr: Elf64Addr,
    val dlpiName: String?,
    val dlpiPhdr: Elf64Phdr?,
    val dlpiPhnum: Elf64Half,
)

public data class UcontextT(
    val ucLink: UcontextT?,
    val ucSigmask: SigsetT,
    val ucStack: StackT,
    val ucMcontext: McontextT,
)

public data class SockaddrUn(
    val sunLen: UByte,
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: SaFamilyT,
    val ssAlign: Long,
)

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
)

public data class Sigevent(
    val sigevNotify: CInt,
    val sigevSigno: CInt,
    val sigevValue: Sigval,
    val sigevUn2: ULong,
)

public data class Dirent(
    val dIno: InoT,
    val dOffset: OffT,
    val dReclen: CShort,
    val dNamelen: CShort,
    val dName: ByteArray,
)

public data class SigsetT(
    val val: UIntArray,
)

public data class MqAttr(
    val mqMaxmsg: CLong,
    val mqMsgsize: CLong,
    val mqFlags: CLong,
    val mqCurmsgs: CLong,
    val mqSendwait: CLong,
    val mqRecvwait: CLong,
)

public data class SockaddrDl(
    val sdlLen: CUChar,
    val sdlFamily: SaFamilyT,
    val sdlIndex: UShort,
    val sdlType: CUChar,
    val sdlNlen: CUChar,
    val sdlAlen: CUChar,
    val sdlSlen: CUChar,
    val sdlData: ByteArray,
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

public data class Msg(
    val msgNext: Msg?,
    val msgType: CLong,
    val msgTs: CUShort,
    val msgSpot: CShort,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgFirst: Msg?,
    val msgLast: Msg?,
    val msgCbytes: MsglenT,
    val msgQnum: MsgqnumT,
    val msgQbytes: MsglenT,
    val msgLspid: PidT,
    val msgLrpid: PidT,
    val msgStime: TimeT,
    val msgRtime: TimeT,
    val msgCtime: TimeT,
)

public data class SyncT(
    val u: CUInt,
    val owner: CUInt,
)

public class PthreadBarrierT

public data class PthreadRwlockT(
    val active: CInt,
    val blockedwriters: CInt,
    val blockedreaders: CInt,
    val heavy: CInt,
    val lock: PthreadMutexT,
    val rcond: PthreadCondT,
    val wcond: PthreadCondT,
    val owner: CUInt,
    val spare: CUInt,
)

public data class MaxAlignT(
    val ll: CLongLong,
    val ld: ByteArray,
)

public const val _SYSNAME_SIZE: ULong = 256 + 1
public const val RLIM_INFINITY: RlimT = 0xfffffffffffffffd
public const val O_LARGEFILE: CInt = 32768
public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val RAND_MAX: CInt = 32767
public const val EOF: CInt = -1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val _IOFBF: CInt = 0
public const val _IONBF: CInt = 2
public const val _IOLBF: CInt = 1
public const val F_DUPFD: CInt = 0
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val F_DUPFD_CLOEXEC: CInt = 5
public const val SIGTRAP: CInt = 5
public const val CLOCK_REALTIME: ClockidT = 0
public const val CLOCK_MONOTONIC: ClockidT = 2
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 3
public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 4
public const val TIMER_ABSTIME: CUInt = 0x80000000u
public const val RUSAGE_SELF: CInt = 0
public const val F_OK: CInt = 0
public const val X_OK: CInt = 1
public const val W_OK: CInt = 2
public const val R_OK: CInt = 4
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGABRT: CInt = 6
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGSEGV: CInt = 11
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val PROT_NONE: CInt = 0x00000000
public const val PROT_READ: CInt = 0x00000100
public const val PROT_WRITE: CInt = 0x00000200
public const val PROT_EXEC: CInt = 0x00000400
public const val MAP_FILE: CInt = 0
public const val MAP_SHARED: CInt = 1
public const val MAP_PRIVATE: CInt = 2
public const val MAP_FIXED: CInt = 0x10
public const val MS_ASYNC: CInt = 1
public const val MS_INVALIDATE: CInt = 4
public const val MS_SYNC: CInt = 2
public const val SCM_RIGHTS: CInt = 0x01
public const val SCM_TIMESTAMP: CInt = 0x02
public const val SCM_CREDS: CInt = 0x04
public const val IFF_NOTRAILERS: CInt = 0x00000020
public const val AF_INET6: CInt = 24
public const val AF_BLUETOOTH: CInt = 31
public const val pseudo_AF_KEY: CInt = 29
public const val MSG_NOSIGNAL: CInt = 0x0800
public const val MSG_WAITFORONE: CInt = 0x2000
public const val IP_IPSEC_POLICY_COMPAT: CInt = 22
public const val IP_PKTINFO: CInt = 25
public const val IPPROTO_DIVERT: CInt = 259
public const val IPV6_IPSEC_POLICY_COMPAT: CInt = 28
public const val TCP_KEEPALIVE: CInt = 0x04
public const val ARPHRD_ARCNET: UShort = 7u
public const val SO_BINDTODEVICE: CInt = 0x0800
public const val EAI_NODATA: CInt = 7
public const val IPTOS_ECN_NOT_ECT: UByte = 0x00u
public const val RTF_BROADCAST: UInt = 0x80000u
public const val UDP_ENCAP: CInt = 100
public const val HW_IOSTATS: CInt = 9
public const val HW_MACHINE_ARCH: CInt = 10
public const val HW_ALIGNBYTES: CInt = 11
public const val HW_CNMAGIC: CInt = 12
public const val HW_PHYSMEM64: CInt = 13
public const val HW_USERMEM64: CInt = 14
public const val HW_IOSTATNAMES: CInt = 15
public const val HW_MAXID: CInt = 15
public const val CTL_UNSPEC: CInt = 0
public const val CTL_QNX: CInt = 9
public const val CTL_PROC: CInt = 10
public const val CTL_VENDOR: CInt = 11
public const val CTL_EMUL: CInt = 12
public const val CTL_SECURITY: CInt = 13
public const val CTL_MAXID: CInt = 14
public const val AF_ARP: CInt = 28
public const val AF_IEEE80211: CInt = 32
public const val AF_NATM: CInt = 27
public const val AF_NS: CInt = 6
public const val BIOCGDLTLIST: CInt = -1072676233
public const val BIOCGETIF: CInt = 1083196011
public const val BIOCGSEESENT: CInt = 1074020984
public const val BIOCGSTATS: CInt = 1082147439
public const val BIOCSDLT: CInt = -2147204490
public const val BIOCSETIF: CInt = -2138029460
public const val BIOCSSEESENT: CInt = -2147204487
public const val FIONSPACE: CInt = 1074030200
public const val FIONWRITE: CInt = 1074030201
public const val IFF_ACCEPTRTADV: CInt = 0x40000000
public const val IFF_IP6FORWARDING: CInt = 0x20000000
public const val IFF_SHIM: CInt = 0x80000000
public const val KERN_ARND: CInt = 81
public const val KERN_IOV_MAX: CInt = 38
public const val KERN_LOGSIGEXIT: CInt = 46
public const val KERN_MAXID: CInt = 83
public const val KERN_PROC_ARGS: CInt = 48
public const val KERN_PROC_ENV: CInt = 3
public const val KERN_PROC_GID: CInt = 7
public const val KERN_PROC_RGID: CInt = 8
public const val LOCAL_CONNWAIT: CInt = 0x0002
public const val LOCAL_CREDS: CInt = 0x0001
public const val LOCAL_PEEREID: CInt = 0x0003
public const val MSG_NOTIFICATION: CInt = 0x0400
public const val NET_RT_IFLIST: CInt = 4
public const val NI_NUMERICSCOPE: CInt = 0x00000040
public const val PF_ARP: CInt = 28
public const val PF_NATM: CInt = 27
public const val pseudo_AF_HDRCMPLT: CInt = 30
public const val SIOCGIFADDR: CInt = -1064277727
public const val SO_FIB: CInt = 0x100a
public const val SO_TXPRIO: CInt = 0x100b
public const val SO_SETFIB: CInt = 0x100a
public const val SO_VLANPRIO: CInt = 0x100c
public const val USER_ATEXIT_MAX: CInt = 21
public const val USER_MAXID: CInt = 22
public const val SO_OVERFLOWED: CInt = 0x1009
public const val SCM_CREDS: CInt = 0x03
public const val AF_INET6: CInt = 28
public const val AF_BLUETOOTH: CInt = 36
public const val pseudo_AF_KEY: CInt = 27
public const val MSG_NOSIGNAL: CInt = 0x20000
public const val MSG_WAITFORONE: CInt = 0x00080000
public const val IPPROTO_DIVERT: CInt = 258
public const val RTF_BROADCAST: UInt = 0x400000u
public const val UDP_ENCAP: CInt = 1
public const val HW_MACHINE_ARCH: CInt = 11
public const val AF_ARP: CInt = 35
public const val AF_IEEE80211: CInt = 37
public const val AF_NATM: CInt = 29
public const val BIOCGDLTLIST: CULong = 0xffffffffc0104279uL
public const val BIOCGETIF: CInt = 0x4020426b
public const val BIOCGSEESENT: CInt = 0x40044276
public const val BIOCGSTATS: CInt = 0x4008426f
public const val BIOCSDLT: CInt = 0x80044278
public const val BIOCSETIF: CInt = 0x8020426c
public const val BIOCSSEESENT: CInt = 0x80044277
public const val KERN_ARND: CInt = 37
public const val KERN_IOV_MAX: CInt = 35
public const val KERN_LOGSIGEXIT: CInt = 34
public const val KERN_PROC_ARGS: CInt = 7
public const val KERN_PROC_ENV: CInt = 35
public const val KERN_PROC_GID: CInt = 11
public const val KERN_PROC_RGID: CInt = 10
public const val LOCAL_CONNWAIT: CInt = 4
public const val LOCAL_CREDS: CInt = 2
public const val MSG_NOTIFICATION: CInt = 0x00002000
public const val NET_RT_IFLIST: CInt = 3
public const val NI_NUMERICSCOPE: CInt = 0x00000020
public const val PF_ARP: CInt = AF_ARP
public const val PF_NATM: CInt = AF_NATM
public const val pseudo_AF_HDRCMPLT: CInt = 31
public const val SIOCGIFADDR: CInt = 0xc0206921
public const val SO_SETFIB: CInt = 0x1014
public const val MAP_TYPE: CInt = 0x3
public const val IFF_UP: CInt = 0x00000001
public const val IFF_BROADCAST: CInt = 0x00000002
public const val IFF_DEBUG: CInt = 0x00000004
public const val IFF_LOOPBACK: CInt = 0x00000008
public const val IFF_POINTOPOINT: CInt = 0x00000010
public const val IFF_RUNNING: CInt = 0x00000040
public const val IFF_NOARP: CInt = 0x00000080
public const val IFF_PROMISC: CInt = 0x00000100
public const val IFF_ALLMULTI: CInt = 0x00000200
public const val IFF_MULTICAST: CInt = 0x00008000
public const val AF_UNSPEC: CInt = 0
public const val AF_UNIX: CInt = AF_LOCAL
public const val AF_LOCAL: CInt = 1
public const val AF_INET: CInt = 2
public const val AF_IPX: CInt = 23
public const val AF_APPLETALK: CInt = 16
public const val AF_ROUTE: CInt = 17
public const val AF_SNA: CInt = 11
public const val AF_ISDN: CInt = 26
public const val PF_UNSPEC: CInt = AF_UNSPEC
public const val PF_UNIX: CInt = PF_LOCAL
public const val PF_LOCAL: CInt = AF_LOCAL
public const val PF_INET: CInt = AF_INET
public const val PF_IPX: CInt = AF_IPX
public const val PF_APPLETALK: CInt = AF_APPLETALK
public const val PF_INET6: CInt = AF_INET6
public const val PF_KEY: CInt = pseudo_AF_KEY
public const val PF_ROUTE: CInt = AF_ROUTE
public const val PF_SNA: CInt = AF_SNA
public const val PF_BLUETOOTH: CInt = AF_BLUETOOTH
public const val PF_ISDN: CInt = AF_ISDN
public const val SOMAXCONN: CInt = 128
public const val MSG_OOB: CInt = 0x0001
public const val MSG_PEEK: CInt = 0x0002
public const val MSG_DONTROUTE: CInt = 0x0004
public const val MSG_CTRUNC: CInt = 0x0020
public const val MSG_TRUNC: CInt = 0x0010
public const val MSG_DONTWAIT: CInt = 0x0080
public const val MSG_EOR: CInt = 0x0008
public const val MSG_WAITALL: CInt = 0x0040
public const val IP_TOS: CInt = 3
public const val IP_TTL: CInt = 4
public const val IP_HDRINCL: CInt = 2
public const val IP_OPTIONS: CInt = 1
public const val IP_RECVOPTS: CInt = 5
public const val IP_RETOPTS: CInt = 8
public const val IP_MULTICAST_IF: CInt = 9
public const val IP_MULTICAST_TTL: CInt = 10
public const val IP_MULTICAST_LOOP: CInt = 11
public const val IP_ADD_MEMBERSHIP: CInt = 12
public const val IP_DROP_MEMBERSHIP: CInt = 13
public const val IP_DEFAULT_MULTICAST_TTL: CInt = 1
public const val IP_DEFAULT_MULTICAST_LOOP: CInt = 1
public const val IPPROTO_HOPOPTS: CInt = 0
public const val IPPROTO_IGMP: CInt = 2
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
public const val IPPROTO_NONE: CInt = 59
public const val IPPROTO_DSTOPTS: CInt = 60
public const val IPPROTO_ENCAP: CInt = 98
public const val IPPROTO_PIM: CInt = 103
public const val IPPROTO_SCTP: CInt = 132
public const val IPPROTO_RAW: CInt = 255
public const val IPPROTO_MAX: CInt = 256
public const val IPPROTO_CARP: CInt = 112
public const val IPPROTO_DONE: CInt = 257
public const val IPPROTO_EON: CInt = 80
public const val IPPROTO_ETHERIP: CInt = 97
public const val IPPROTO_GGP: CInt = 3
public const val IPPROTO_IPCOMP: CInt = 108
public const val IPPROTO_MOBILE: CInt = 55
public const val IPV6_RTHDR_LOOSE: CInt = 0
public const val IPV6_RTHDR_STRICT: CInt = 1
public const val IPV6_UNICAST_HOPS: CInt = 4
public const val IPV6_MULTICAST_IF: CInt = 9
public const val IPV6_MULTICAST_HOPS: CInt = 10
public const val IPV6_MULTICAST_LOOP: CInt = 11
public const val IPV6_JOIN_GROUP: CInt = 12
public const val IPV6_LEAVE_GROUP: CInt = 13
public const val IPV6_CHECKSUM: CInt = 26
public const val IPV6_V6ONLY: CInt = 27
public const val IPV6_RTHDRDSTOPTS: CInt = 35
public const val IPV6_RECVPKTINFO: CInt = 36
public const val IPV6_RECVHOPLIMIT: CInt = 37
public const val IPV6_RECVRTHDR: CInt = 38
public const val IPV6_RECVHOPOPTS: CInt = 39
public const val IPV6_RECVDSTOPTS: CInt = 40
public const val IPV6_RECVPATHMTU: CInt = 43
public const val IPV6_PATHMTU: CInt = 44
public const val IPV6_PKTINFO: CInt = 46
public const val IPV6_HOPLIMIT: CInt = 47
public const val IPV6_NEXTHOP: CInt = 48
public const val IPV6_HOPOPTS: CInt = 49
public const val IPV6_DSTOPTS: CInt = 50
public const val IPV6_RECVTCLASS: CInt = 57
public const val IPV6_TCLASS: CInt = 61
public const val IPV6_DONTFRAG: CInt = 62
public const val TCP_NODELAY: CInt = 0x01
public const val TCP_MAXSEG: CInt = 0x02
public const val TCP_MD5SIG: CInt = 0x10
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val LOCK_SH: CInt = 0x1
public const val LOCK_EX: CInt = 0x2
public const val LOCK_NB: CInt = 0x4
public const val LOCK_UN: CInt = 0x8
public const val SS_ONSTACK: CInt = 1
public const val SS_DISABLE: CInt = 2
public const val PATH_MAX: CInt = 1024
public const val UIO_MAXIOV: CInt = 1024
public const val FD_SETSIZE: ULong = 256uL
public const val TCIOFF: CInt = 0x0002
public const val TCION: CInt = 0x0003
public const val TCOOFF: CInt = 0x0000
public const val TCOON: CInt = 0x0001
public const val TCIFLUSH: CInt = 0
public const val TCOFLUSH: CInt = 1
public const val TCIOFLUSH: CInt = 2
public const val NL0: TcflagT = 0x000
public const val NL1: TcflagT = 0x100
public const val TAB0: TcflagT = 0x0000
public const val CR0: TcflagT = 0x000
public const val FF0: TcflagT = 0x0000
public const val BS0: TcflagT = 0x0000
public const val VT0: TcflagT = 0x0000
public const val VERASE: ULong = 2uL
public const val VKILL: ULong = 3uL
public const val VINTR: ULong = 0uL
public const val VQUIT: ULong = 1uL
public const val VLNEXT: ULong = 15uL
public const val IGNBRK: TcflagT = 0x00000001
public const val BRKINT: TcflagT = 0x00000002
public const val IGNPAR: TcflagT = 0x00000004
public const val PARMRK: TcflagT = 0x00000008
public const val INPCK: TcflagT = 0x00000010
public const val ISTRIP: TcflagT = 0x00000020
public const val INLCR: TcflagT = 0x00000040
public const val IGNCR: TcflagT = 0x00000080
public const val ICRNL: TcflagT = 0x00000100
public const val IXANY: TcflagT = 0x00000800
public const val IMAXBEL: TcflagT = 0x00002000
public const val OPOST: TcflagT = 0x00000001
public const val CS5: TcflagT = 0x00
public const val ECHO: TcflagT = 0x00000008
public const val OCRNL: TcflagT = 0x00000008
public const val ONOCR: TcflagT = 0x00000010
public const val ONLRET: TcflagT = 0x00000020
public const val OFILL: TcflagT = 0x00000040
public const val OFDEL: TcflagT = 0x00000080
public const val WNOHANG: CInt = 0x0040
public const val WUNTRACED: CInt = 0x0004
public const val WSTOPPED: CInt = WUNTRACED
public const val WEXITED: CInt = 0x0001
public const val WCONTINUED: CInt = 0x0008
public const val WNOWAIT: CInt = 0x0080
public const val WTRAPPED: CInt = 0x0002
public const val RTLD_LOCAL: CInt = 0x0200
public const val RTLD_LAZY: CInt = 0x0001
public const val POSIX_FADV_NORMAL: CInt = 0
public const val POSIX_FADV_RANDOM: CInt = 2
public const val POSIX_FADV_SEQUENTIAL: CInt = 1
public const val POSIX_FADV_WILLNEED: CInt = 3
public const val AT_FDCWD: CInt = -100
public const val AT_EACCESS: CInt = 0x0001
public const val AT_SYMLINK_NOFOLLOW: CInt = 0x0002
public const val AT_SYMLINK_FOLLOW: CInt = 0x0004
public const val AT_REMOVEDIR: CInt = 0x0008
public val LOG_CRON: CInt = 9 shl 3
public val LOG_AUTHPRIV: CInt = 10 shl 3
public val LOG_FTP: CInt = 11 shl 3
public const val LOG_PERROR: CInt = 0x20
public const val PIPE_BUF: ULong = 5120uL
public const val CLD_EXITED: CInt = 1
public const val CLD_KILLED: CInt = 2
public const val CLD_DUMPED: CInt = 3
public const val CLD_TRAPPED: CInt = 4
public const val CLD_STOPPED: CInt = 5
public const val CLD_CONTINUED: CInt = 6
public const val UTIME_OMIT: CLong = 0x40000002
public const val UTIME_NOW: CLong = 0x40000001
public val POLLIN: CShort = POLLRDNORM or POLLRDBAND
public const val POLLPRI: CShort = 0x0008
public const val POLLOUT: CShort = 0x0002
public const val POLLERR: CShort = 0x0020
public const val POLLHUP: CShort = 0x0040
public const val POLLNVAL: CShort = 0x1000
public const val POLLRDNORM: CShort = 0x0001
public const val POLLRDBAND: CShort = 0x0004
public const val IPTOS_LOWDELAY: UByte = 0x10u
public const val IPTOS_THROUGHPUT: UByte = 0x08u
public const val IPTOS_RELIABILITY: UByte = 0x04u
public const val IPTOS_MINCOST: UByte = 0x02u
public const val IPTOS_PREC_NETCONTROL: UByte = 0xe0u
public const val IPTOS_PREC_INTERNETCONTROL: UByte = 0xc0u
public const val IPTOS_PREC_CRITIC_ECP: UByte = 0xa0u
public const val IPTOS_PREC_FLASHOVERRIDE: UByte = 0x80u
public const val IPTOS_PREC_FLASH: UByte = 0x60u
public const val IPTOS_PREC_IMMEDIATE: UByte = 0x40u
public const val IPTOS_PREC_PRIORITY: UByte = 0x20u
public const val IPTOS_PREC_ROUTINE: UByte = 0x00u
public const val IPTOS_ECN_MASK: UByte = 0x03u
public const val IPTOS_ECN_ECT1: UByte = 0x01u
public const val IPTOS_ECN_ECT0: UByte = 0x02u
public const val IPTOS_ECN_CE: UByte = 0x03u
public const val IPOPT_CONTROL: UByte = 0x00u
public const val IPOPT_RESERVED1: UByte = 0x20u
public const val IPOPT_RESERVED2: UByte = 0x60u
public const val IPOPT_LSRR: UByte = 131u
public const val IPOPT_RR: UByte = 7u
public const val IPOPT_SSRR: UByte = 137u
public const val IPDEFTTL: UByte = 64u
public const val IPOPT_OPTVAL: UByte = 0u
public const val IPOPT_OLEN: UByte = 1u
public const val IPOPT_OFFSET: UByte = 2u
public const val IPOPT_MINOFF: UByte = 4u
public const val IPOPT_NOP: UByte = 1u
public const val IPOPT_EOL: UByte = 0u
public const val IPOPT_TS: UByte = 68u
public const val IPOPT_TS_TSONLY: UByte = 0u
public const val IPOPT_TS_TSANDADDR: UByte = 1u
public const val IPOPT_TS_PRESPEC: UByte = 3u
public const val MAX_IPOPTLEN: UByte = 40u
public const val IPVERSION: UByte = 4u
public const val MAXTTL: UByte = 255u
public const val ARPHRD_ETHER: UShort = 1u
public const val ARPHRD_IEEE802: UShort = 6u
public const val ARPHRD_IEEE1394: UShort = 24u
public const val SOL_SOCKET: CInt = 0xffff
public const val SO_DEBUG: CInt = 0x0001
public const val SO_REUSEADDR: CInt = 0x0004
public const val SO_TYPE: CInt = 0x1008
public const val SO_ERROR: CInt = 0x1007
public const val SO_DONTROUTE: CInt = 0x0010
public const val SO_BROADCAST: CInt = 0x0020
public const val SO_SNDBUF: CInt = 0x1001
public const val SO_RCVBUF: CInt = 0x1002
public const val SO_KEEPALIVE: CInt = 0x0008
public const val SO_OOBINLINE: CInt = 0x0100
public const val SO_LINGER: CInt = 0x0080
public const val SO_REUSEPORT: CInt = 0x0200
public const val SO_RCVLOWAT: CInt = 0x1004
public const val SO_SNDLOWAT: CInt = 0x1003
public const val SO_RCVTIMEO: CInt = 0x1006
public const val SO_SNDTIMEO: CInt = 0x1005
public const val SO_TIMESTAMP: CInt = 0x0400
public const val SO_ACCEPTCONN: CInt = 0x0002
public const val TIOCM_LE: CInt = 0x0100
public const val TIOCM_DTR: CInt = 0x0001
public const val TIOCM_RTS: CInt = 0x0002
public const val TIOCM_ST: CInt = 0x0200
public const val TIOCM_SR: CInt = 0x0400
public const val TIOCM_CTS: CInt = 0x1000
public const val TIOCM_CAR: CInt = TIOCM_CD
public const val TIOCM_CD: CInt = 0x8000
public const val TIOCM_RNG: CInt = TIOCM_RI
public const val TIOCM_RI: CInt = 0x4000
public const val TIOCM_DSR: CInt = 0x2000
public const val SCHED_OTHER: CInt = 3
public const val SCHED_FIFO: CInt = 1
public const val SCHED_RR: CInt = 2
public const val IPC_PRIVATE: KeyT = 0
public const val IPC_CREAT: CInt = 512
public const val IPC_EXCL: CInt = 1024
public const val IPC_NOWAIT: CInt = 2048
public const val IPC_RMID: CInt = 0
public const val IPC_SET: CInt = 1
public const val IPC_STAT: CInt = 2
public const val MSG_NOERROR: CInt = 4096
public const val LOG_NFACILITIES: CInt = 24
public const val AI_PASSIVE: CInt = 0x00000001
public const val AI_CANONNAME: CInt = 0x00000002
public const val AI_NUMERICHOST: CInt = 0x00000004
public const val AI_NUMERICSERV: CInt = 0x00000008
public const val EAI_BADFLAGS: CInt = 3
public const val EAI_NONAME: CInt = 8
public const val EAI_AGAIN: CInt = 2
public const val EAI_FAIL: CInt = 4
public const val EAI_FAMILY: CInt = 5
public const val EAI_SOCKTYPE: CInt = 10
public const val EAI_SERVICE: CInt = 9
public const val EAI_MEMORY: CInt = 6
public const val EAI_SYSTEM: CInt = 11
public const val EAI_OVERFLOW: CInt = 14
public const val NI_NUMERICHOST: CInt = 0x00000002
public const val NI_NUMERICSERV: CInt = 0x00000008
public const val NI_NOFQDN: CInt = 0x00000001
public const val NI_NAMEREQD: CInt = 0x00000004
public const val NI_DGRAM: CInt = 0x00000010
public const val AIO_CANCELED: CInt = 0
public const val AIO_NOTCANCELED: CInt = 2
public const val AIO_ALLDONE: CInt = 1
public const val LIO_READ: CInt = 1
public const val LIO_WRITE: CInt = 2
public const val LIO_NOP: CInt = 0
public const val LIO_WAIT: CInt = 1
public const val LIO_NOWAIT: CInt = 0
public const val ITIMER_REAL: CInt = 0
public const val ITIMER_VIRTUAL: CInt = 1
public const val ITIMER_PROF: CInt = 2
public const val POSIX_SPAWN_RESETIDS: CInt = 0x00000010
public const val POSIX_SPAWN_SETPGROUP: CInt = 0x00000001
public const val POSIX_SPAWN_SETSIGDEF: CInt = 0x00000004
public const val POSIX_SPAWN_SETSIGMASK: CInt = 0x00000002
public const val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x00000400
public const val POSIX_SPAWN_SETSCHEDULER: CInt = 0x00000040
public const val RTF_UP: CUShort = 0x0001u
public const val RTF_GATEWAY: CUShort = 0x0002u
public const val RTF_HOST: CUShort = 0x0004u
public const val RTF_DYNAMIC: CUShort = 0x0010u
public const val RTF_MODIFIED: CUShort = 0x0020u
public const val RTF_REJECT: CUShort = 0x0008u
public const val RTF_STATIC: CUShort = 0x0800u
public const val RTF_XRESOLVE: CUShort = 0x0200u
public const val RTM_NEWADDR: UShort = 0xcu
public const val RTM_DELADDR: UShort = 0xdu
public const val RTA_DST: CUShort = 0x1u
public const val RTA_GATEWAY: CUShort = 0x2u
public const val IN_ACCESS: UInt = 0x00000001u
public const val IN_MODIFY: UInt = 0x00000002u
public const val IN_ATTRIB: UInt = 0x00000004u
public const val IN_CLOSE_WRITE: UInt = 0x00000008u
public const val IN_CLOSE_NOWRITE: UInt = 0x00000010u
public val IN_CLOSE: UInt = IN_CLOSE_WRITE or IN_CLOSE_NOWRITE
public const val IN_OPEN: UInt = 0x00000020u
public const val IN_MOVED_FROM: UInt = 0x00000040u
public const val IN_MOVED_TO: UInt = 0x00000080u
public val IN_MOVE: UInt = IN_MOVED_FROM or IN_MOVED_TO
public const val IN_CREATE: UInt = 0x00000100u
public const val IN_DELETE: UInt = 0x00000200u
public const val IN_DELETE_SELF: UInt = 0x00000400u
public const val IN_MOVE_SELF: UInt = 0x00000800u
public const val IN_UNMOUNT: UInt = 0x00002000u
public const val IN_Q_OVERFLOW: UInt = 0x00004000u
public const val IN_IGNORED: UInt = 0x00008000u
public const val IN_ONLYDIR: UInt = 0x01000000u
public const val IN_DONT_FOLLOW: UInt = 0x02000000u
public const val IN_ISDIR: UInt = 0x40000000u
public const val IN_ONESHOT: UInt = 0x80000000u
public const val REG_EXTENDED: CInt = 1
public const val REG_ICASE: CInt = 2
public const val REG_NEWLINE: CInt = 8
public const val REG_NOSUB: CInt = 4
public const val REG_NOTBOL: CInt = 1
public const val REG_NOTEOL: CInt = 2
public const val REG_ENOSYS: CInt = 17
public const val REG_NOMATCH: CInt = 1
public const val REG_BADPAT: CInt = 2
public const val REG_ECOLLATE: CInt = 3
public const val REG_ECTYPE: CInt = 4
public const val REG_EESCAPE: CInt = 5
public const val REG_ESUBREG: CInt = 6
public const val REG_EBRACK: CInt = 7
public const val REG_EPAREN: CInt = 8
public const val REG_EBRACE: CInt = 9
public const val REG_BADBR: CInt = 10
public const val REG_ERANGE: CInt = 11
public const val REG_ESPACE: CInt = 12
public const val REG_BADRPT: CInt = 13
public const val EOK: CInt = 0
public const val EWOULDBLOCK: CInt = EAGAIN
public const val EPERM: CInt = 1
public const val ENOENT: CInt = 2
public const val ESRCH: CInt = 3
public const val EINTR: CInt = 4
public const val EIO: CInt = 5
public const val ENXIO: CInt = 6
public const val E2BIG: CInt = 7
public const val ENOEXEC: CInt = 8
public const val EBADF: CInt = 9
public const val ECHILD: CInt = 10
public const val EAGAIN: CInt = 11
public const val ENOMEM: CInt = 12
public const val EACCES: CInt = 13
public const val EFAULT: CInt = 14
public const val ENOTBLK: CInt = 15
public const val EBUSY: CInt = 16
public const val EEXIST: CInt = 17
public const val EXDEV: CInt = 18
public const val ENODEV: CInt = 19
public const val ENOTDIR: CInt = 20
public const val EISDIR: CInt = 21
public const val EINVAL: CInt = 22
public const val ENFILE: CInt = 23
public const val EMFILE: CInt = 24
public const val ENOTTY: CInt = 25
public const val ETXTBSY: CInt = 26
public const val EFBIG: CInt = 27
public const val ENOSPC: CInt = 28
public const val ESPIPE: CInt = 29
public const val EROFS: CInt = 30
public const val EMLINK: CInt = 31
public const val EPIPE: CInt = 32
public const val EDOM: CInt = 33
public const val ERANGE: CInt = 34
public const val ENOMSG: CInt = 35
public const val EIDRM: CInt = 36
public const val ECHRNG: CInt = 37
public const val EL2NSYNC: CInt = 38
public const val EL3HLT: CInt = 39
public const val EL3RST: CInt = 40
public const val ELNRNG: CInt = 41
public const val EUNATCH: CInt = 42
public const val ENOCSI: CInt = 43
public const val EL2HLT: CInt = 44
public const val EDEADLK: CInt = 45
public const val ENOLCK: CInt = 46
public const val ECANCELED: CInt = 47
public const val EDQUOT: CInt = 49
public const val EBADE: CInt = 50
public const val EBADR: CInt = 51
public const val EXFULL: CInt = 52
public const val ENOANO: CInt = 53
public const val EBADRQC: CInt = 54
public const val EBADSLT: CInt = 55
public const val EDEADLOCK: CInt = 56
public const val EBFONT: CInt = 57
public const val EOWNERDEAD: CInt = 58
public const val ENOSTR: CInt = 60
public const val ENODATA: CInt = 61
public const val ETIME: CInt = 62
public const val ENOSR: CInt = 63
public const val ENONET: CInt = 64
public const val ENOPKG: CInt = 65
public const val EREMOTE: CInt = 66
public const val ENOLINK: CInt = 67
public const val EADV: CInt = 68
public const val ESRMNT: CInt = 69
public const val ECOMM: CInt = 70
public const val EPROTO: CInt = 71
public const val EMULTIHOP: CInt = 74
public const val EBADMSG: CInt = 77
public const val ENAMETOOLONG: CInt = 78
public const val EOVERFLOW: CInt = 79
public const val ENOTUNIQ: CInt = 80
public const val EBADFD: CInt = 81
public const val EREMCHG: CInt = 82
public const val ELIBACC: CInt = 83
public const val ELIBBAD: CInt = 84
public const val ELIBSCN: CInt = 85
public const val ELIBMAX: CInt = 86
public const val ELIBEXEC: CInt = 87
public const val EILSEQ: CInt = 88
public const val ENOSYS: CInt = 89
public const val ELOOP: CInt = 90
public const val ERESTART: CInt = 91
public const val ESTRPIPE: CInt = 92
public const val ENOTEMPTY: CInt = 93
public const val EUSERS: CInt = 94
public const val ENOTRECOVERABLE: CInt = 95
public const val EOPNOTSUPP: CInt = 103
public const val EFPOS: CInt = 110
public const val ESTALE: CInt = 122
public const val EINPROGRESS: CInt = 236
public const val EALREADY: CInt = 237
public const val ENOTSOCK: CInt = 238
public const val EDESTADDRREQ: CInt = 239
public const val EMSGSIZE: CInt = 240
public const val EPROTOTYPE: CInt = 241
public const val ENOPROTOOPT: CInt = 242
public const val EPROTONOSUPPORT: CInt = 243
public const val ESOCKTNOSUPPORT: CInt = 244
public const val EPFNOSUPPORT: CInt = 246
public const val EAFNOSUPPORT: CInt = 247
public const val EADDRINUSE: CInt = 248
public const val EADDRNOTAVAIL: CInt = 249
public const val ENETDOWN: CInt = 250
public const val ENETUNREACH: CInt = 251
public const val ENETRESET: CInt = 252
public const val ECONNABORTED: CInt = 253
public const val ECONNRESET: CInt = 254
public const val ENOBUFS: CInt = 255
public const val EISCONN: CInt = 256
public const val ENOTCONN: CInt = 257
public const val ESHUTDOWN: CInt = 258
public const val ETOOMANYREFS: CInt = 259
public const val ETIMEDOUT: CInt = 260
public const val ECONNREFUSED: CInt = 261
public const val EHOSTDOWN: CInt = 264
public const val EHOSTUNREACH: CInt = 265
public const val EBADRPC: CInt = 272
public const val ERPCMISMATCH: CInt = 273
public const val EPROGUNAVAIL: CInt = 274
public const val EPROGMISMATCH: CInt = 275
public const val EPROCUNAVAIL: CInt = 276
public const val ENOREMOTE: CInt = 300
public const val ENONDP: CInt = 301
public const val EBADFSYS: CInt = 302
public const val EMORE: CInt = 309
public const val ECTRLTERM: CInt = 310
public const val ENOLIC: CInt = 311
public const val ESRVRFAULT: CInt = 312
public const val EENDIAN: CInt = 313
public const val ESECTYPEINVAL: CInt = 314
public const val RUSAGE_CHILDREN: CInt = -1
public const val L_tmpnam: CUInt = 255u
public const val _PC_LINK_MAX: CInt = 1
public const val _PC_MAX_CANON: CInt = 2
public const val _PC_MAX_INPUT: CInt = 3
public const val _PC_NAME_MAX: CInt = 4
public const val _PC_PATH_MAX: CInt = 5
public const val _PC_PIPE_BUF: CInt = 6
public const val _PC_CHOWN_RESTRICTED: CInt = 9
public const val _PC_NO_TRUNC: CInt = 7
public const val _PC_VDISABLE: CInt = 8
public const val _PC_SYNC_IO: CInt = 14
public const val _PC_ASYNC_IO: CInt = 12
public const val _PC_PRIO_IO: CInt = 13
public const val _PC_SOCK_MAXBUF: CInt = 15
public const val _PC_FILESIZEBITS: CInt = 16
public const val _PC_REC_INCR_XFER_SIZE: CInt = 22
public const val _PC_REC_MAX_XFER_SIZE: CInt = 23
public const val _PC_REC_MIN_XFER_SIZE: CInt = 24
public const val _PC_REC_XFER_ALIGN: CInt = 25
public const val _PC_ALLOC_SIZE_MIN: CInt = 21
public const val _PC_SYMLINK_MAX: CInt = 17
public const val _PC_2_SYMLINKS: CInt = 20
public const val _SC_PAGE_SIZE: CInt = _SC_PAGESIZE
public const val _SC_ARG_MAX: CInt = 1
public const val _SC_CHILD_MAX: CInt = 2
public const val _SC_CLK_TCK: CInt = 3
public const val _SC_NGROUPS_MAX: CInt = 4
public const val _SC_OPEN_MAX: CInt = 5
public const val _SC_JOB_CONTROL: CInt = 6
public const val _SC_SAVED_IDS: CInt = 7
public const val _SC_VERSION: CInt = 8
public const val _SC_PASS_MAX: CInt = 9
public const val _SC_PAGESIZE: CInt = 11
public const val _SC_XOPEN_VERSION: CInt = 12
public const val _SC_STREAM_MAX: CInt = 13
public const val _SC_TZNAME_MAX: CInt = 14
public const val _SC_AIO_LISTIO_MAX: CInt = 15
public const val _SC_AIO_MAX: CInt = 16
public const val _SC_AIO_PRIO_DELTA_MAX: CInt = 17
public const val _SC_DELAYTIMER_MAX: CInt = 18
public const val _SC_MQ_OPEN_MAX: CInt = 19
public const val _SC_MQ_PRIO_MAX: CInt = 20
public const val _SC_RTSIG_MAX: CInt = 21
public const val _SC_SEM_NSEMS_MAX: CInt = 22
public const val _SC_SEM_VALUE_MAX: CInt = 23
public const val _SC_SIGQUEUE_MAX: CInt = 24
public const val _SC_TIMER_MAX: CInt = 25
public const val _SC_ASYNCHRONOUS_IO: CInt = 26
public const val _SC_FSYNC: CInt = 27
public const val _SC_MAPPED_FILES: CInt = 28
public const val _SC_MEMLOCK: CInt = 29
public const val _SC_MEMLOCK_RANGE: CInt = 30
public const val _SC_MEMORY_PROTECTION: CInt = 31
public const val _SC_MESSAGE_PASSING: CInt = 32
public const val _SC_PRIORITIZED_IO: CInt = 33
public const val _SC_PRIORITY_SCHEDULING: CInt = 34
public const val _SC_REALTIME_SIGNALS: CInt = 35
public const val _SC_SEMAPHORES: CInt = 36
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 37
public const val _SC_SYNCHRONIZED_IO: CInt = 38
public const val _SC_TIMERS: CInt = 39
public const val _SC_GETGR_R_SIZE_MAX: CInt = 40
public const val _SC_GETPW_R_SIZE_MAX: CInt = 41
public const val _SC_LOGIN_NAME_MAX: CInt = 42
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 43
public const val _SC_THREAD_KEYS_MAX: CInt = 44
public const val _SC_THREAD_STACK_MIN: CInt = 45
public const val _SC_THREAD_THREADS_MAX: CInt = 46
public const val _SC_TTY_NAME_MAX: CInt = 47
public const val _SC_THREADS: CInt = 48
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 49
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 50
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 51
public const val _SC_THREAD_PRIO_INHERIT: CInt = 52
public const val _SC_THREAD_PRIO_PROTECT: CInt = 53
public const val _SC_THREAD_PROCESS_SHARED: CInt = 54
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 55
public const val _SC_2_CHAR_TERM: CInt = 56
public const val _SC_2_C_BIND: CInt = 57
public const val _SC_2_C_DEV: CInt = 58
public const val _SC_2_C_VERSION: CInt = 59
public const val _SC_2_FORT_DEV: CInt = 60
public const val _SC_2_FORT_RUN: CInt = 61
public const val _SC_2_LOCALEDEF: CInt = 62
public const val _SC_2_SW_DEV: CInt = 63
public const val _SC_2_UPE: CInt = 64
public const val _SC_2_VERSION: CInt = 65
public const val _SC_ATEXIT_MAX: CInt = 66
public const val _SC_AVPHYS_PAGES: CInt = 67
public const val _SC_BC_BASE_MAX: CInt = 68
public const val _SC_BC_DIM_MAX: CInt = 69
public const val _SC_BC_SCALE_MAX: CInt = 70
public const val _SC_BC_STRING_MAX: CInt = 71
public const val _SC_CHARCLASS_NAME_MAX: CInt = 72
public const val _SC_CHAR_BIT: CInt = 73
public const val _SC_CHAR_MAX: CInt = 74
public const val _SC_CHAR_MIN: CInt = 75
public const val _SC_COLL_WEIGHTS_MAX: CInt = 76
public const val _SC_EQUIV_CLASS_MAX: CInt = 77
public const val _SC_EXPR_NEST_MAX: CInt = 78
public const val _SC_INT_MAX: CInt = 79
public const val _SC_INT_MIN: CInt = 80
public const val _SC_LINE_MAX: CInt = 81
public const val _SC_LONG_BIT: CInt = 82
public const val _SC_MB_LEN_MAX: CInt = 83
public const val _SC_NL_ARGMAX: CInt = 84
public const val _SC_NL_LANGMAX: CInt = 85
public const val _SC_NL_MSGMAX: CInt = 86
public const val _SC_NL_NMAX: CInt = 87
public const val _SC_NL_SETMAX: CInt = 88
public const val _SC_NL_TEXTMAX: CInt = 89
public const val _SC_NPROCESSORS_CONF: CInt = 90
public const val _SC_NPROCESSORS_ONLN: CInt = 91
public const val _SC_NZERO: CInt = 92
public const val _SC_PHYS_PAGES: CInt = 93
public const val _SC_PII: CInt = 94
public const val _SC_PII_INTERNET: CInt = 95
public const val _SC_PII_INTERNET_DGRAM: CInt = 96
public const val _SC_PII_INTERNET_STREAM: CInt = 97
public const val _SC_PII_OSI: CInt = 98
public const val _SC_PII_OSI_CLTS: CInt = 99
public const val _SC_PII_OSI_COTS: CInt = 100
public const val _SC_PII_OSI_M: CInt = 101
public const val _SC_PII_SOCKET: CInt = 102
public const val _SC_PII_XTI: CInt = 103
public const val _SC_POLL: CInt = 104
public const val _SC_RE_DUP_MAX: CInt = 105
public const val _SC_SCHAR_MAX: CInt = 106
public const val _SC_SCHAR_MIN: CInt = 107
public const val _SC_SELECT: CInt = 108
public const val _SC_SHRT_MAX: CInt = 109
public const val _SC_SHRT_MIN: CInt = 110
public const val _SC_SSIZE_MAX: CInt = 111
public const val _SC_T_IOV_MAX: CInt = 112
public const val _SC_UCHAR_MAX: CInt = 113
public const val _SC_UINT_MAX: CInt = 114
public const val _SC_UIO_MAXIOV: CInt = 115
public const val _SC_ULONG_MAX: CInt = 116
public const val _SC_USHRT_MAX: CInt = 117
public const val _SC_WORD_BIT: CInt = 118
public const val _SC_XOPEN_CRYPT: CInt = 119
public const val _SC_XOPEN_ENH_I18N: CInt = 120
public const val _SC_XOPEN_SHM: CInt = 121
public const val _SC_XOPEN_UNIX: CInt = 122
public const val _SC_XOPEN_XCU_VERSION: CInt = 123
public const val _SC_XOPEN_XPG2: CInt = 124
public const val _SC_XOPEN_XPG3: CInt = 125
public const val _SC_XOPEN_XPG4: CInt = 126
public const val _SC_XBS5_ILP32_OFF32: CInt = 127
public const val _SC_XBS5_ILP32_OFFBIG: CInt = 128
public const val _SC_XBS5_LP64_OFF64: CInt = 129
public const val _SC_XBS5_LPBIG_OFFBIG: CInt = 130
public const val _SC_ADVISORY_INFO: CInt = 131
public const val _SC_CPUTIME: CInt = 132
public const val _SC_SPAWN: CInt = 133
public const val _SC_SPORADIC_SERVER: CInt = 134
public const val _SC_THREAD_CPUTIME: CInt = 135
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 136
public const val _SC_TIMEOUTS: CInt = 137
public const val _SC_BARRIERS: CInt = 138
public const val _SC_CLOCK_SELECTION: CInt = 139
public const val _SC_MONOTONIC_CLOCK: CInt = 140
public const val _SC_READER_WRITER_LOCKS: CInt = 141
public const val _SC_SPIN_LOCKS: CInt = 142
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 143
public const val _SC_TRACE_EVENT_FILTER: CInt = 144
public const val _SC_TRACE: CInt = 145
public const val _SC_TRACE_INHERIT: CInt = 146
public const val _SC_TRACE_LOG: CInt = 147
public const val _SC_2_PBS: CInt = 148
public const val _SC_2_PBS_ACCOUNTING: CInt = 149
public const val _SC_2_PBS_CHECKPOINT: CInt = 150
public const val _SC_2_PBS_LOCATE: CInt = 151
public const val _SC_2_PBS_MESSAGE: CInt = 152
public const val _SC_2_PBS_TRACK: CInt = 153
public const val _SC_HOST_NAME_MAX: CInt = 154
public const val _SC_IOV_MAX: CInt = 155
public const val _SC_IPV6: CInt = 156
public const val _SC_RAW_SOCKETS: CInt = 157
public const val _SC_REGEXP: CInt = 158
public const val _SC_SHELL: CInt = 159
public const val _SC_SS_REPL_MAX: CInt = 160
public const val _SC_SYMLOOP_MAX: CInt = 161
public const val _SC_TRACE_EVENT_NAME_MAX: CInt = 162
public const val _SC_TRACE_NAME_MAX: CInt = 163
public const val _SC_TRACE_SYS_MAX: CInt = 164
public const val _SC_TRACE_USER_EVENT_MAX: CInt = 165
public const val _SC_V6_ILP32_OFF32: CInt = 166
public const val _SC_V6_ILP32_OFFBIG: CInt = 167
public const val _SC_V6_LP64_OFF64: CInt = 168
public const val _SC_V6_LPBIG_OFFBIG: CInt = 169
public const val _SC_XOPEN_REALTIME: CInt = 170
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 171
public const val _SC_XOPEN_LEGACY: CInt = 172
public const val _SC_XOPEN_STREAMS: CInt = 173
public const val _SC_V7_ILP32_OFF32: CInt = 176
public const val _SC_V7_ILP32_OFFBIG: CInt = 177
public const val _SC_V7_LP64_OFF64: CInt = 178
public const val _SC_V7_LPBIG_OFFBIG: CInt = 179
public const val GLOB_ERR: CInt = 0x0001
public const val GLOB_MARK: CInt = 0x0002
public const val GLOB_NOSORT: CInt = 0x0004
public const val GLOB_DOOFFS: CInt = 0x0008
public const val GLOB_NOCHECK: CInt = 0x0010
public const val GLOB_APPEND: CInt = 0x0020
public const val GLOB_NOESCAPE: CInt = 0x0040
public const val GLOB_NOSPACE: CInt = 1
public const val GLOB_ABORTED: CInt = 2
public const val GLOB_NOMATCH: CInt = 3
public const val S_IEXEC: ModeT = S_IXUSR
public const val S_IWRITE: ModeT = S_IWUSR
public const val S_IREAD: ModeT = S_IRUSR
public const val S_IFIFO: ModeT = 0o1_0000
public const val S_IFCHR: ModeT = 0o2_0000
public const val S_IFDIR: ModeT = 0o4_0000
public const val S_IFBLK: ModeT = 0o6_0000
public const val S_IFREG: ModeT = 0o10_0000
public const val S_IFLNK: ModeT = 0o12_0000
public const val S_IFSOCK: ModeT = 0o14_0000
public const val S_IFMT: ModeT = 0o17_0000
public const val S_IXOTH: ModeT = 1
public const val S_IWOTH: ModeT = 2
public const val S_IROTH: ModeT = 4
public const val S_IRWXO: ModeT = 7
public const val S_IXGRP: ModeT = 8
public const val S_IWGRP: ModeT = 16
public const val S_IRGRP: ModeT = 32
public const val S_IRWXG: ModeT = 56
public const val S_IXUSR: ModeT = 64
public const val S_IWUSR: ModeT = 128
public const val S_IRUSR: ModeT = 256
public const val S_IRWXU: ModeT = 448
public const val F_LOCK: CInt = 1
public const val F_TEST: CInt = 3
public const val F_TLOCK: CInt = 2
public const val F_ULOCK: CInt = 0
public const val ST_RDONLY: CULong = 0x01uL
public const val ST_NOSUID: CULong = 0x04uL
public const val ST_NOEXEC: CULong = 0x02uL
public const val ST_NOATIME: CULong = 0x20uL
public const val RTLD_NODELETE: CInt = 0x1000
public const val RTLD_NOW: CInt = 0x0002
public const val EMPTY: CShort = 0
public const val RUN_LVL: CShort = 1
public const val BOOT_TIME: CShort = 2
public const val NEW_TIME: CShort = 4
public const val OLD_TIME: CShort = 3
public const val INIT_PROCESS: CShort = 5
public const val LOGIN_PROCESS: CShort = 6
public const val USER_PROCESS: CShort = 7
public const val DEAD_PROCESS: CShort = 8
public const val ACCOUNTING: CShort = 9
public const val ENOTSUP: CInt = 48
public const val BUFSIZ: CUInt = 1024u
public const val TMP_MAX: CUInt = 26 * 26 * 26
public const val FOPEN_MAX: CUInt = 16u
public const val FILENAME_MAX: CUInt = 255u
public const val NI_MAXHOST: SocklenT = 1025
public const val M_KEEP: CInt = 4
public const val REG_STARTEND: CInt = 4
public const val VEOF: ULong = 4uL
public const val RTLD_GLOBAL: CInt = 0x0100
public const val RTLD_NOLOAD: CInt = 0x0004
public const val O_RDONLY: CInt = 0
public const val O_WRONLY: CInt = 1
public const val O_RDWR: CInt = 2
public const val O_EXEC: CInt = 3
public const val O_ASYNC: CInt = 65536
public const val O_NDELAY: CInt = O_NONBLOCK
public const val O_TRUNC: CInt = 512
public const val O_CLOEXEC: CInt = 8192
public const val O_DIRECTORY: CInt = 1048576
public const val O_ACCMODE: CInt = 7
public const val O_APPEND: CInt = 8
public const val O_CREAT: CInt = 256
public const val O_EXCL: CInt = 1024
public const val O_NOCTTY: CInt = 2048
public const val O_NONBLOCK: CInt = 128
public const val O_SYNC: CInt = 32
public const val O_RSYNC: CInt = 64
public const val O_DSYNC: CInt = 16
public const val O_NOFOLLOW: CInt = 4096
public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val SOCK_SEQPACKET: CInt = 5
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_RAW: CInt = 3
public const val SOCK_RDM: CInt = 4
public const val SOCK_CLOEXEC: CInt = 0x10000000
public const val SA_SIGINFO: CInt = 0x0002
public const val SA_NOCLDWAIT: CInt = 0x0020
public const val SA_NODEFER: CInt = 0x0010
public const val SA_RESETHAND: CInt = 0x0004
public const val SA_NOCLDSTOP: CInt = 0x0001
public const val SIGTTIN: CInt = 26
public const val SIGTTOU: CInt = 27
public const val SIGXCPU: CInt = 30
public const val SIGXFSZ: CInt = 31
public const val SIGVTALRM: CInt = 28
public const val SIGPROF: CInt = 29
public const val SIGWINCH: CInt = 20
public const val SIGCHLD: CInt = 18
public const val SIGBUS: CInt = 10
public const val SIGUSR1: CInt = 16
public const val SIGUSR2: CInt = 17
public const val SIGCONT: CInt = 25
public const val SIGSTOP: CInt = 23
public const val SIGTSTP: CInt = 24
public const val SIGURG: CInt = 21
public const val SIGIO: CInt = SIGPOLL
public const val SIGSYS: CInt = 12
public const val SIGPOLL: CInt = 22
public const val SIGPWR: CInt = 19
public const val SIG_SETMASK: CInt = 2
public const val SIG_BLOCK: CInt = 0
public const val SIG_UNBLOCK: CInt = 1
public const val POLLWRNORM: CShort = POLLOUT
public const val POLLWRBAND: CShort = 0x0010
public const val F_SETLK: CInt = 106
public const val F_SETLKW: CInt = 107
public const val F_ALLOCSP: CInt = 110
public const val F_FREESP: CInt = 111
public const val F_GETLK: CInt = 114
public const val F_RDLCK: CInt = 1
public const val F_WRLCK: CInt = 2
public const val F_UNLCK: CInt = 3
public const val NCCS: ULong = 40uL
public const val MAP_ANON: CInt = MAP_ANONYMOUS
public const val MAP_ANONYMOUS: CInt = 0x00080000
public const val MCL_CURRENT: CInt = 0x000000001
public const val MCL_FUTURE: CInt = 0x000000002
public const val _TIO_CBAUD: TcflagT = 15
public const val CBAUD: TcflagT = _TIO_CBAUD
public const val TAB1: TcflagT = 0x0800
public const val TAB2: TcflagT = 0x1000
public const val TAB3: TcflagT = 0x1800
public const val CR1: TcflagT = 0x200
public const val CR2: TcflagT = 0x400
public const val CR3: TcflagT = 0x600
public const val FF1: TcflagT = 0x8000
public const val BS1: TcflagT = 0x2000
public const val VT1: TcflagT = 0x4000
public const val VWERASE: ULong = 14uL
public const val VREPRINT: ULong = 12uL
public const val VSUSP: ULong = 10uL
public const val VSTART: ULong = 8uL
public const val VSTOP: ULong = 9uL
public const val VDISCARD: ULong = 13uL
public const val VTIME: ULong = 17uL
public const val IXON: TcflagT = 0x00000400
public const val IXOFF: TcflagT = 0x00001000
public const val ONLCR: TcflagT = 0x00000004
public const val CSIZE: TcflagT = 0x00000030
public const val CS6: TcflagT = 0x10
public const val CS7: TcflagT = 0x20
public const val CS8: TcflagT = 0x30
public const val CSTOPB: TcflagT = 0x00000040
public const val CREAD: TcflagT = 0x00000080
public const val PARENB: TcflagT = 0x00000100
public const val PARODD: TcflagT = 0x00000200
public const val HUPCL: TcflagT = 0x00000400
public const val CLOCAL: TcflagT = 0x00000800
public const val ECHOKE: TcflagT = 0x00000800
public const val ECHOE: TcflagT = 0x00000010
public const val ECHOK: TcflagT = 0x00000020
public const val ECHONL: TcflagT = 0x00000040
public const val ECHOCTL: TcflagT = 0x00000200
public const val ISIG: TcflagT = 0x00000001
public const val ICANON: TcflagT = 0x00000002
public const val NOFLSH: TcflagT = 0x00000080
public const val OLCUC: TcflagT = 0x00000002
public const val NLDLY: TcflagT = 0x00000100
public const val CRDLY: TcflagT = 0x00000600
public const val TABDLY: TcflagT = 0x00001800
public const val BSDLY: TcflagT = 0x00002000
public const val FFDLY: TcflagT = 0x00008000
public const val VTDLY: TcflagT = 0x00004000
public const val XTABS: TcflagT = 0x1800
public const val B0: SpeedT = 0
public const val B50: SpeedT = 1
public const val B75: SpeedT = 2
public const val B110: SpeedT = 3
public const val B134: SpeedT = 4
public const val B150: SpeedT = 5
public const val B200: SpeedT = 6
public const val B300: SpeedT = 7
public const val B600: SpeedT = 8
public const val B1200: SpeedT = 9
public const val B1800: SpeedT = 10
public const val B2400: SpeedT = 11
public const val B4800: SpeedT = 12
public const val B9600: SpeedT = 13
public const val B19200: SpeedT = 14
public const val B38400: SpeedT = 15
public const val EXTA: SpeedT = 14
public const val EXTB: SpeedT = 15
public const val B57600: SpeedT = 57600
public const val B115200: SpeedT = 115200
public const val VEOL: ULong = 5uL
public const val VEOL2: ULong = 6uL
public const val VMIN: ULong = 16uL
public const val IEXTEN: TcflagT = 0x00008000
public const val TOSTOP: TcflagT = 0x00000100
public const val TCSANOW: CInt = 0x0001
public const val TCSADRAIN: CInt = 0x0002
public const val TCSAFLUSH: CInt = 0x0004
public const val HW_MACHINE: CInt = 1
public const val HW_MODEL: CInt = 2
public const val HW_NCPU: CInt = 3
public const val HW_BYTEORDER: CInt = 4
public const val HW_PHYSMEM: CInt = 5
public const val HW_USERMEM: CInt = 6
public const val HW_PAGESIZE: CInt = 7
public const val HW_DISKNAMES: CInt = 8
public const val CTL_KERN: CInt = 1
public const val CTL_VM: CInt = 2
public const val CTL_VFS: CInt = 3
public const val CTL_NET: CInt = 4
public const val CTL_DEBUG: CInt = 5
public const val CTL_HW: CInt = 6
public const val CTL_MACHDEP: CInt = 7
public const val CTL_USER: CInt = 8
public const val DAY_1: NlItem = 8
public const val DAY_2: NlItem = 9
public const val DAY_3: NlItem = 10
public const val DAY_4: NlItem = 11
public const val DAY_5: NlItem = 12
public const val DAY_6: NlItem = 13
public const val DAY_7: NlItem = 14
public const val MON_1: NlItem = 22
public const val MON_2: NlItem = 23
public const val MON_3: NlItem = 24
public const val MON_4: NlItem = 25
public const val MON_5: NlItem = 26
public const val MON_6: NlItem = 27
public const val MON_7: NlItem = 28
public const val MON_8: NlItem = 29
public const val MON_9: NlItem = 30
public const val MON_10: NlItem = 31
public const val MON_11: NlItem = 32
public const val MON_12: NlItem = 33
public const val ABDAY_1: NlItem = 15
public const val ABDAY_2: NlItem = 16
public const val ABDAY_3: NlItem = 17
public const val ABDAY_4: NlItem = 18
public const val ABDAY_5: NlItem = 19
public const val ABDAY_6: NlItem = 20
public const val ABDAY_7: NlItem = 21
public const val ABMON_1: NlItem = 34
public const val ABMON_2: NlItem = 35
public const val ABMON_3: NlItem = 36
public const val ABMON_4: NlItem = 37
public const val ABMON_5: NlItem = 38
public const val ABMON_6: NlItem = 39
public const val ABMON_7: NlItem = 40
public const val ABMON_8: NlItem = 41
public const val ABMON_9: NlItem = 42
public const val ABMON_10: NlItem = 43
public const val ABMON_11: NlItem = 44
public const val ABMON_12: NlItem = 45
public const val AF_CCITT: CInt = 10
public const val AF_CHAOS: CInt = 5
public const val AF_CNT: CInt = 21
public const val AF_COIP: CInt = 20
public const val AF_DATAKIT: CInt = 9
public const val AF_DECnet: CInt = 12
public const val AF_DLI: CInt = 13
public const val AF_E164: CInt = 26
public const val AF_ECMA: CInt = 8
public const val AF_HYLINK: CInt = 15
public const val AF_IMPLINK: CInt = 3
public const val AF_ISO: CInt = 7
public const val AF_LAT: CInt = 14
public const val AF_LINK: CInt = 18
public const val AF_OSI: CInt = 7
public const val AF_PUP: CInt = 4
public const val ALT_DIGITS: NlItem = 50
public const val AM_STR: NlItem = 6
public const val B76800: SpeedT = 76800
public const val BIOCFLUSH: CInt = 17000
public const val BIOCGBLEN: CInt = 1074020966
public const val BIOCGDLT: CInt = 1074020970
public const val BIOCGHDRCMPLT: CInt = 1074020980
public const val BIOCGRTIMEOUT: CInt = 1074807406
public const val BIOCIMMEDIATE: CInt = -2147204496
public const val BIOCPROMISC: CInt = 17001
public const val BIOCSBLEN: CInt = -1073462682
public const val BIOCSETF: CInt = -2146418073
public const val BIOCSHDRCMPLT: CInt = -2147204491
public const val BIOCSRTIMEOUT: CInt = -2146418067
public const val BIOCVERSION: CInt = 1074020977
public const val BPF_ALIGNMENT: ULong = <c_long>()
public const val CHAR_BIT: ULong = 8uL
public const val CODESET: NlItem = 1
public const val CRNCYSTR: NlItem = 55
public const val D_FLAG_FILTER: CInt = 0x00000001
public const val D_FLAG_STAT: CInt = 0x00000002
public const val D_FLAG_STAT_FORM_MASK: CInt = 0x000000f0
public const val D_FLAG_STAT_FORM_T32_2001: CInt = 0x00000010
public const val D_FLAG_STAT_FORM_T32_2008: CInt = 0x00000020
public const val D_FLAG_STAT_FORM_T64_2008: CInt = 0x00000030
public const val D_FLAG_STAT_FORM_UNSET: CInt = 0x00000000
public const val D_FMT: NlItem = 3
public const val D_GETFLAG: CInt = 1
public const val D_SETFLAG: CInt = 2
public const val D_T_FMT: NlItem = 2
public const val ERA: NlItem = 46
public const val ERA_D_FMT: NlItem = 47
public const val ERA_D_T_FMT: NlItem = 48
public const val ERA_T_FMT: NlItem = 49
public const val RADIXCHAR: NlItem = 51
public const val THOUSEP: NlItem = 52
public const val YESEXPR: NlItem = 53
public const val NOEXPR: NlItem = 54
public const val F_GETOWN: CInt = 35
public const val FIONBIO: CInt = -2147195266
public const val FIOASYNC: CInt = -2147195267
public const val FIOCLEX: CInt = 26113
public const val FIOGETOWN: CInt = 1074030203
public const val FIONCLEX: CInt = 26114
public const val FIONREAD: CInt = 1074030207
public const val FIOSETOWN: CInt = -2147195268
public const val F_SETOWN: CInt = 36
public const val IFF_LINK0: CInt = 0x00001000
public const val IFF_LINK1: CInt = 0x00002000
public const val IFF_LINK2: CInt = 0x00004000
public const val IFF_OACTIVE: CInt = 0x00000400
public const val IFF_SIMPLEX: CInt = 0x00000800
public const val IHFLOW: TcflagT = 0x00000001
public const val IIDLE: TcflagT = 0x00000008
public const val IP_RECVDSTADDR: CInt = 7
public const val IP_RECVIF: CInt = 20
public const val IPTOS_ECN_NOTECT: UByte = 0x00u
public const val IUCLC: TcflagT = 0x00000200
public const val IUTF8: TcflagT = 0x0004000
public const val KERN_ARGMAX: CInt = 8
public const val KERN_BOOTTIME: CInt = 21
public const val KERN_CLOCKRATE: CInt = 12
public const val KERN_FILE: CInt = 15
public const val KERN_HOSTID: CInt = 11
public const val KERN_HOSTNAME: CInt = 10
public const val KERN_JOB_CONTROL: CInt = 19
public const val KERN_MAXFILES: CInt = 7
public const val KERN_MAXPROC: CInt = 6
public const val KERN_MAXVNODES: CInt = 5
public const val KERN_NGROUPS: CInt = 18
public const val KERN_OSRELEASE: CInt = 2
public const val KERN_OSREV: CInt = 3
public const val KERN_OSTYPE: CInt = 1
public const val KERN_POSIX1: CInt = 17
public const val KERN_PROC: CInt = 14
public const val KERN_PROC_ALL: CInt = 0
public const val KERN_PROC_PGRP: CInt = 2
public const val KERN_PROC_PID: CInt = 1
public const val KERN_PROC_RUID: CInt = 6
public const val KERN_PROC_SESSION: CInt = 3
public const val KERN_PROC_TTY: CInt = 4
public const val KERN_PROC_UID: CInt = 5
public const val KERN_PROF: CInt = 16
public const val KERN_SAVED_IDS: CInt = 20
public const val KERN_SECURELVL: CInt = 9
public const val KERN_VERSION: CInt = 4
public const val KERN_VNODE: CInt = 13
public const val LC_ALL: CInt = 63
public const val LC_COLLATE: CInt = 1
public const val LC_CTYPE: CInt = 2
public const val LC_MESSAGES: CInt = 32
public const val LC_MONETARY: CInt = 4
public const val LC_NUMERIC: CInt = 8
public const val LC_TIME: CInt = 16
public const val MAP_STACK: CInt = 0x00001000
public const val MNT_NOEXEC: CInt = 0x02
public const val MNT_NOSUID: CInt = 0x04
public const val MNT_RDONLY: CInt = 0x01
public const val NET_RT_DUMP: CInt = 1
public const val NET_RT_FLAGS: CInt = 2
public const val OHFLOW: TcflagT = 0x00000002
public const val P_ALL: IdtypeT = 0
public const val PARSTK: TcflagT = 0x00000004
public const val PF_CCITT: CInt = 10
public const val PF_CHAOS: CInt = 5
public const val PF_CNT: CInt = 21
public const val PF_COIP: CInt = 20
public const val PF_DATAKIT: CInt = 9
public const val PF_DECnet: CInt = 12
public const val PF_DLI: CInt = 13
public const val PF_ECMA: CInt = 8
public const val PF_HYLINK: CInt = 15
public const val PF_IMPLINK: CInt = 3
public const val PF_ISO: CInt = 7
public const val PF_LAT: CInt = 14
public const val PF_LINK: CInt = 18
public const val PF_OSI: CInt = 7
public const val PF_PIP: CInt = 25
public const val PF_PUP: CInt = 4
public const val PF_RTIP: CInt = 22
public const val PF_XTP: CInt = 19
public const val PM_STR: NlItem = 7
public const val POSIX_MADV_DONTNEED: CInt = 4
public const val POSIX_MADV_NORMAL: CInt = 0
public const val POSIX_MADV_RANDOM: CInt = 2
public const val POSIX_MADV_SEQUENTIAL: CInt = 1
public const val POSIX_MADV_WILLNEED: CInt = 3
public const val _POSIX_VDISABLE: CInt = 0
public const val P_PGID: IdtypeT = 2
public const val P_PID: IdtypeT = 1
public const val PRIO_PGRP: CInt = 1
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_USER: CInt = 2
public const val pseudo_AF_PIP: CInt = 25
public const val pseudo_AF_RTIP: CInt = 22
public const val pseudo_AF_XTP: CInt = 19
public const val REG_ASSERT: CInt = 15
public const val REG_ATOI: CInt = 255
public const val REG_BACKR: CInt = 0x400
public const val REG_BASIC: CInt = 0x00
public const val REG_DUMP: CInt = 0x80
public const val REG_EMPTY: CInt = 14
public const val REG_INVARG: CInt = 16
public const val REG_ITOA: CInt = 256
public const val REG_LARGE: CInt = 0x200
public const val REG_NOSPEC: CInt = 0x10
public const val REG_OK: CInt = 0
public const val REG_PEND: CInt = 0x20
public const val REG_TRACE: CInt = 0x100
public const val RLIMIT_AS: CInt = 6
public const val RLIMIT_CORE: CInt = 4
public const val RLIMIT_CPU: CInt = 0
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_FSIZE: CInt = 1
public const val RLIMIT_MEMLOCK: CInt = 7
public const val RLIMIT_NOFILE: CInt = 5
public const val RLIMIT_NPROC: CInt = 8
public const val RLIMIT_RSS: CInt = 6
public const val RLIMIT_STACK: CInt = 3
public const val RLIMIT_VMEM: CInt = 6
public const val RLIM_NLIMITS: CInt = 14
public const val SCHED_ADJTOHEAD: CInt = 5
public const val SCHED_ADJTOTAIL: CInt = 6
public const val SCHED_MAXPOLICY: CInt = 7
public const val SCHED_SETPRIO: CInt = 7
public const val SCHED_SPORADIC: CInt = 4
public const val SIGCLD: CInt = SIGCHLD
public const val SIGDEADLK: CInt = 7
public const val SIGEMT: CInt = 7
public const val SIGEV_NONE: CInt = 0
public const val SIGEV_SIGNAL: CInt = 129
public const val SIGEV_THREAD: CInt = 135
public const val SO_USELOOPBACK: CInt = 0x0040
public const val _SS_ALIGNSIZE: ULong = <i64>()
public const val _SS_MAXSIZE: ULong = 128uL
public const val _SS_PAD1SIZE: ULong = _SS_ALIGNSIZE - 2
public const val _SS_PAD2SIZE: ULong = _SS_MAXSIZE - 2 - _SS_PAD1SIZE - _SS_ALIGNSIZE
public val TC_CPOSIX: TcflagT = CLOCAL or CREAD or CSIZE or CSTOPB or HUPCL or PARENB or PARODD
public const val TCGETS: CInt = 0x404c540d
public const val TC_OPOSIX: TcflagT = OPOST
public const val T_FMT_AMPM: NlItem = 5
public const val TIOCCBRK: CInt = 29818
public const val TIOCCDTR: CInt = 29816
public const val TIOCDRAIN: CInt = 29790
public const val TIOCEXCL: CInt = 29709
public const val TIOCFLUSH: CInt = -2147191792
public const val TIOCGETA: CInt = 1078752275
public const val TIOCGPGRP: CInt = 1074033783
public const val TIOCGWINSZ: CInt = 1074295912
public const val TIOCMBIC: CInt = -2147191701
public const val TIOCMBIS: CInt = -2147191700
public const val TIOCMGET: CInt = 1074033770
public const val TIOCMSET: CInt = -2147191699
public const val TIOCNOTTY: CInt = 29809
public const val TIOCNXCL: CInt = 29710
public const val TIOCOUTQ: CInt = 1074033779
public const val TIOCPKT: CInt = -2147191696
public const val TIOCPKT_DATA: CInt = 0x00
public const val TIOCPKT_DOSTOP: CInt = 0x20
public const val TIOCPKT_FLUSHREAD: CInt = 0x01
public const val TIOCPKT_FLUSHWRITE: CInt = 0x02
public const val TIOCPKT_IOCTL: CInt = 0x40
public const val TIOCPKT_NOSTOP: CInt = 0x10
public const val TIOCPKT_START: CInt = 0x08
public const val TIOCPKT_STOP: CInt = 0x04
public const val TIOCSBRK: CInt = 29819
public const val TIOCSCTTY: CInt = 29793
public const val TIOCSDTR: CInt = 29817
public const val TIOCSETA: CInt = -2142473196
public const val TIOCSETAF: CInt = -2142473194
public const val TIOCSETAW: CInt = -2142473195
public const val TIOCSPGRP: CInt = -2147191690
public const val TIOCSTART: CInt = 29806
public const val TIOCSTI: CInt = -2147388302
public const val TIOCSTOP: CInt = 29807
public const val TIOCSWINSZ: CInt = -2146929561
public const val USER_CS_PATH: CInt = 1
public const val USER_BC_BASE_MAX: CInt = 2
public const val USER_BC_DIM_MAX: CInt = 3
public const val USER_BC_SCALE_MAX: CInt = 4
public const val USER_BC_STRING_MAX: CInt = 5
public const val USER_COLL_WEIGHTS_MAX: CInt = 6
public const val USER_EXPR_NEST_MAX: CInt = 7
public const val USER_LINE_MAX: CInt = 8
public const val USER_RE_DUP_MAX: CInt = 9
public const val USER_POSIX2_VERSION: CInt = 10
public const val USER_POSIX2_C_BIND: CInt = 11
public const val USER_POSIX2_C_DEV: CInt = 12
public const val USER_POSIX2_CHAR_TERM: CInt = 13
public const val USER_POSIX2_FORT_DEV: CInt = 14
public const val USER_POSIX2_FORT_RUN: CInt = 15
public const val USER_POSIX2_LOCALEDEF: CInt = 16
public const val USER_POSIX2_SW_DEV: CInt = 17
public const val USER_POSIX2_UPE: CInt = 18
public const val USER_STREAM_MAX: CInt = 19
public const val USER_TZNAME_MAX: CInt = 20
public const val VDOWN: ULong = 31uL
public const val VINS: ULong = 32uL
public const val VDEL: ULong = 33uL
public const val VRUB: ULong = 34uL
public const val VCAN: ULong = 35uL
public const val VHOME: ULong = 36uL
public const val VEND: ULong = 37uL
public const val VSPARE3: ULong = 38uL
public const val VSPARE4: ULong = 39uL
public const val VSWTCH: ULong = 7uL
public const val VDSUSP: ULong = 11uL
public const val VFWD: ULong = 18uL
public const val VLOGIN: ULong = 19uL
public const val VPREFIX: ULong = 20uL
public const val VSUFFIX: ULong = 24uL
public const val VLEFT: ULong = 28uL
public const val VRIGHT: ULong = 29uL
public const val VUP: ULong = 30uL
public const val XCASE: TcflagT = 0x00000004
public const val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1
public const val PTHREAD_CREATE_JOINABLE: CInt = 0x00
public const val PTHREAD_CREATE_DETACHED: CInt = 0x01
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 1
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 2
public const val PTHREAD_MUTEX_NORMAL: CInt = 3
public const val PTHREAD_STACK_MIN: ULong = 256uL
public const val PTHREAD_MUTEX_DEFAULT: CInt = 0
public const val PTHREAD_MUTEX_STALLED: CInt = 0x00
public const val PTHREAD_MUTEX_ROBUST: CInt = 0x10
public const val PTHREAD_PROCESS_PRIVATE: CInt = 0x00
public const val PTHREAD_PROCESS_SHARED: CInt = 0x01
public const val PTHREAD_KEYS_MAX: ULong = 128uL
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(u = 0x80000000, owner = 0xffffffff)
public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(u = CLOCK_REALTIME.toUInt(), owner = 0xfffffffb)
public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(active = 0, blockedwriters = 0, blockedreaders = 0, heavy = 0, lock = PTHREAD_MUTEX_INITIALIZER, rcond = PTHREAD_COND_INITIALIZER, wcond = PTHREAD_COND_INITIALIZER, owner = -2i32.toUInt(), spare = 0)

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr?
public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?
public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?
public expect fun fDCLR(fd: CInt, set: FdSet?): ()
public expect fun fDISSET(fd: CInt, set: FdSet?): Boolean
public expect fun fDSET(fd: CInt, set: FdSet?): ()
public expect fun fDZERO(set: FdSet?): ()
public expect fun dEXTRAFIRST(d: Dirent?): DirentExtra?
public expect fun dEXTRAVALID(x: DirentExtra?, d: Dirent?): Boolean
public expect fun dEXTRANEXT(x: DirentExtra?): DirentExtra?
public expect fun sOCKCREDSIZE(ngrps: ULong): ULong

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CUInt): CInt
public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CUInt, timeout: Timespec?): CInt
public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: ULong, flags: CInt): SsizeT
public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: ULong, flags: CInt, timeout: Timespec?): SsizeT
public expect fun semDestroy(sem: SemT?): CInt
public expect fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt
public expect fun fdatasync(fd: CInt): CInt
public expect fun getpriority(which: CInt, who: IdT): CInt
public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt
public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt
public expect fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt
public expect fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt
public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt
public expect fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt
public expect fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt
public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt
public expect fun memalign(align: ULong, size: ULong): COpaquePointer?
public expect fun setgroups(ngroups: CInt, ptr: GidT?): CInt
public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt
public expect fun futimens(fd: CInt, times: Timespec?): CInt
public expect fun nlLanginfo(item: NlItem): String?
public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt
public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt
public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt
public expect fun pthreadCondattrSetpshared(attr: PthreadCondattrT?, pshared: CInt): CInt
public expect fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt
public expect fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, val: CInt?): CInt
public expect fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, val: CInt): CInt
public expect fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): String?
public expect fun clearenv(): CInt
public expect fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt
public expect fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT
public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun getifaddrs(ifap: COpaquePointer?): CInt
public expect fun freeifaddrs(ifa: Ifaddrs?)
public expect fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt
public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT
public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT
public expect fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT
public expect fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT
public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt
public expect fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT
public expect fun loginTty(fd: CInt): CInt
public expect fun uname(buf: Utsname?): CInt
public expect fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt
public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt
public expect fun abs(i: CInt): CInt
public expect fun labs(i: CLong): CLong
public expect fun rand(): CInt
public expect fun srand(seed: CUInt)
public expect fun setpwent()
public expect fun endpwent()
public expect fun getpwent(): Passwd?
public expect fun setgrent()
public expect fun endgrent()
public expect fun getgrent(): Group?
public expect fun setspent()
public expect fun endspent()
public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt
public expect fun ftok(pathname: String?, projId: CInt): KeyT
public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt
public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt
public expect fun mkostemp(template: String?, flags: CInt): CInt
public expect fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt
public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt
public expect fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt
public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt
public expect fun ifNameindex(): IfNameindex?
public expect fun ifFreenameindex(ptr: IfNameindex?)
public expect fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt
public expect fun globfree(pglob: GlobT?)
public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt
public expect fun shmUnlink(name: String?): CInt
public expect fun seekdir(dirp: DIR?, loc: CLong)
public expect fun telldir(dirp: DIR?): CLong
public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt
public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT
public expect fun mkstemps(template: String?, suffixlen: CInt): CInt
public expect fun getdomainname(name: String?, len: ULong): CInt
public expect fun setdomainname(name: String?, len: ULong): CInt
public expect fun sync()
public expect fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt
public expect fun umount(target: String?, flags: CInt): CInt
public expect fun schedGetPriorityMax(policy: CInt): CInt
public expect fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt
public expect fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt
public expect fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt
public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt
public expect fun schedSetparam(pid: PidT, param: SchedParam?): CInt
public expect fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt
public expect fun schedGetparam(pid: PidT, param: SchedParam?): CInt
public expect fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt
public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt
public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt
public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt
public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt
public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt
public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt
public expect fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt
public expect fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt
public expect fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, pshared: CInt?): CInt
public expect fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, pshared: CInt): CInt
public expect fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUInt): CInt
public expect fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt
public expect fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt
public expect fun schedGetscheduler(pid: PidT): CInt
public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt
public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt
public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt
public expect fun sethostname(name: String?, len: ULong): CInt
public expect fun schedGetPriorityMin(policy: CInt): CInt
public expect fun pthreadCondattrGetpshared(attr: PthreadCondattrT?, pshared: CInt?): CInt
public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt
public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt
public expect fun sigsuspend(mask: SigsetT?): CInt
public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun semClose(sem: SemT?): CInt
public expect fun getdtablesize(): CInt
public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun initgroups(user: String?, group: GidT): CInt
public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt
public expect fun semOpen(name: String?, oflag: CInt, ...): SemT?
public expect fun getgrnam(name: String?): Group?
public expect fun pthreadCancel(thread: PthreadT): CInt
public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt
public expect fun semUnlink(name: String?): CInt
public expect fun daemon(nochdir: CInt, noclose: CInt): CInt
public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt
public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt
public expect fun getgrgid(gid: GidT): Group?
public expect fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt
public expect fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt
public expect fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robustness: CInt?): CInt
public expect fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt
public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt
public expect fun getitimer(which: CInt, currValue: Itimerval?): CInt
public expect fun setitimer(which: CInt, value: Itimerval?, ovalue: Itimerval?): CInt
public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt
public expect fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt
public expect fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt
public expect fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt
public expect fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt
public expect fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt
public expect fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt
public expect fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt
public expect fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt
public expect fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt
public expect fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt
public expect fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt
public expect fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt
public expect fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt
public expect fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt
public expect fun popen(command: String?, mode: String?): FILE?
public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt
public expect fun inotifyRmWatch(fd: CInt, wd: CInt): CInt
public expect fun inotifyInit(): CInt
public expect fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt
public expect fun gettid(): PidT
public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt
public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt
public expect fun mallopt(param: CInt, value: Long): CInt
public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt
public expect fun ctermid(s: String?): String?
public expect fun ioctl(fd: CInt, request: CInt, ...): CInt
public expect fun mallinfo(): Mallinfo
public expect fun getpwentR(pwd: Passwd?, buf: String?, bufsize: CInt, result: COpaquePointer?): CInt
public expect fun pthreadGetnameNp(thread: PthreadT, name: String?, len: CInt): CInt
public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt
public expect fun sysctl(: CInt?, : CUInt, : COpaquePointer?, : ULong?, : COpaquePointer?, : ULong): CInt
public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt
public expect fun setrlimit(resource: CInt, rlp: Rlimit?): CInt
public expect fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: Sigevent?): CInt
public expect fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt
public expect fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt
public expect fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt
public expect fun regexec(preg: RegexT?, str: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt
public expect fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong
public expect fun regfree(preg: RegexT?)
public expect fun dirfd(dirp: DIR?): CInt
public expect fun dircntl(dir: DIR?, cmd: CInt, ...): CInt
public expect fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt
public expect fun aioError(aiocbp: Aiocb?): CInt
public expect fun aioFsync(operation: CInt, aiocbp: Aiocb?): CInt
public expect fun aioRead(aiocbp: Aiocb?): CInt
public expect fun aioReturn(aiocpb: Aiocb?): SsizeT
public expect fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt
public expect fun aioWrite(aiocpb: Aiocb?): CInt
public expect fun mqClose(mqdes: MqdT): CInt
public expect fun mqGetattr(mqdes: MqdT, mqstat: MqAttr?): CInt
public expect fun mqNotify(mqdes: MqdT, notification: Sigevent?): CInt
public expect fun mqOpen(name: String?, oflag: CInt, ...): MqdT
public expect fun mqReceive(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT
public expect fun mqSend(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt
public expect fun mqSetattr(mqdes: MqdT, mqstat: MqAttr?, omqstat: MqAttr?): CInt
public expect fun mqTimedreceive(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT
public expect fun mqTimedsend(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt
public expect fun mqUnlink(name: String?): CInt
public expect fun getErrnoPtr(): CInt?
public expect fun myThreadExit(valuePtr: COpaquePointer?)
public expect fun cxaAtexit(cb: (() -> Unit)?, arg: COpaquePointer?, dso: COpaquePointer?): CInt
