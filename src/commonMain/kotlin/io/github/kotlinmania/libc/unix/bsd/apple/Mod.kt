// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public typealias WcharT = Int
public typealias ClockT = CULong
public typealias TimeT = CLong
public typealias SusecondsT = Int
public typealias DevT = Int
public typealias InoT = ULong
public typealias ModeT = UShort
public typealias NlinkT = UShort
public typealias BlksizeT = Int
public typealias RlimT = ULong
public typealias SigsetT = UInt
public typealias ClockidT = CUInt
public typealias FsblkcntT = CUInt
public typealias FsfilcntT = CUInt
public typealias SpeedT = CULong
public typealias TcflagT = CULong
public typealias NlItem = CInt
public typealias IdT = CUInt
public typealias SemT = CInt
public typealias IdtypeT = CUInt
public typealias IntegerT = CInt
public typealias CpuTypeT = IntegerT
public typealias CpuSubtypeT = IntegerT
public typealias NaturalT = UInt
public typealias MachMsgTypeNumberT = NaturalT
public typealias KernReturnT = CInt
public typealias UuidT = UByteArray
public typealias TaskInfoT = IntegerT?
public typealias HostInfoT = IntegerT?
public typealias TaskFlavorT = NaturalT
public typealias RusageInfoT = COpaquePointer?
public typealias VmOffsetT = UintptrT
public typealias VmSizeT = UintptrT
public typealias VmAddressT = VmOffsetT
public typealias QuadT = Long
public typealias UQuadT = ULong
public typealias PosixSpawnattrT = COpaquePointer?
public typealias PosixSpawnFileActionsT = COpaquePointer?
public typealias KeyT = CInt
public typealias ShmattT = CUShort
public typealias SaeAssocidT = UInt
public typealias SaeConnidT = UInt
public typealias MachPortT = CUInt
public typealias HostT = CUInt
public typealias HostFlavorT = IntegerT
public typealias HostInfo64T = IntegerT?
public typealias ProcessorFlavorT = CInt
public typealias ThreadFlavorT = NaturalT
public typealias ThreadInspectT = MachPortT
public typealias ThreadActT = MachPortT
public typealias ThreadActArrayT = ThreadActT?
public typealias PolicyT = CInt
public typealias MachErrorT = KernReturnT
public typealias MachVmAddressT = ULong
public typealias MachVmOffsetT = ULong
public typealias MachVmSizeT = ULong
public typealias VmMapT = MachPortT
public typealias MemEntryNamePortT = MachPortT
public typealias MemoryObjectT = MachPortT
public typealias MemoryObjectOffsetT = CULongLong
public typealias VmInheritT = CUInt
public typealias VmProtT = CInt
public typealias LedgerT = MachPortT
public typealias LedgerArrayT = LedgerT?
public typealias IconvT = COpaquePointer?
public typealias HostCpuLoadInfoT = HostCpuLoadInfo?
public typealias HostCpuLoadInfoDataT = HostCpuLoadInfo
public typealias ProcessorCpuLoadInfoT = ProcessorCpuLoadInfo?
public typealias ProcessorCpuLoadInfoDataT = ProcessorCpuLoadInfo
public typealias ProcessorBasicInfoT = ProcessorBasicInfo?
public typealias ProcessorBasicInfoDataT = ProcessorBasicInfo
public typealias ProcessorSetBasicInfoDataT = ProcessorSetBasicInfo
public typealias ProcessorSetBasicInfoT = ProcessorSetBasicInfo?
public typealias ProcessorSetLoadInfoDataT = ProcessorSetLoadInfo
public typealias ProcessorSetLoadInfoT = ProcessorSetLoadInfo?
public typealias ProcessorInfoT = IntegerT?
public typealias ProcessorInfoArrayT = IntegerT?
public typealias MachTaskBasicInfoDataT = MachTaskBasicInfo
public typealias MachTaskBasicInfoT = MachTaskBasicInfo?
public typealias TaskThreadTimesInfoDataT = TaskThreadTimesInfo
public typealias TaskThreadTimesInfoT = TaskThreadTimesInfo?
public typealias ThreadInfoT = IntegerT?
public typealias ThreadBasicInfoT = ThreadBasicInfo?
public typealias ThreadBasicInfoDataT = ThreadBasicInfo
public typealias ThreadIdentifierInfoT = ThreadIdentifierInfo?
public typealias ThreadIdentifierInfoDataT = ThreadIdentifierInfo
public typealias ThreadExtendedInfoT = ThreadExtendedInfo?
public typealias ThreadExtendedInfoDataT = ThreadExtendedInfo
public typealias ThreadT = MachPortT
public typealias ThreadPolicyFlavorT = NaturalT
public typealias ThreadPolicyT = IntegerT?
public typealias ThreadLatencyQosT = IntegerT
public typealias ThreadThroughputQosT = IntegerT
public typealias ThreadStandardPolicyDataT = ThreadStandardPolicy
public typealias ThreadStandardPolicyT = ThreadStandardPolicy?
public typealias ThreadExtendedPolicyDataT = ThreadExtendedPolicy
public typealias ThreadExtendedPolicyT = ThreadExtendedPolicy?
public typealias ThreadTimeConstraintPolicyDataT = ThreadTimeConstraintPolicy
public typealias ThreadTimeConstraintPolicyT = ThreadTimeConstraintPolicy?
public typealias ThreadPrecedencePolicyDataT = ThreadPrecedencePolicy
public typealias ThreadPrecedencePolicyT = ThreadPrecedencePolicy?
public typealias ThreadAffinityPolicyDataT = ThreadAffinityPolicy
public typealias ThreadAffinityPolicyT = ThreadAffinityPolicy?
public typealias ThreadBackgroundPolicyDataT = ThreadBackgroundPolicy
public typealias ThreadBackgroundPolicyT = ThreadBackgroundPolicy?
public typealias ThreadLatencyQosPolicyDataT = ThreadLatencyQosPolicy
public typealias ThreadLatencyQosPolicyT = ThreadLatencyQosPolicy?
public typealias ThreadThroughputQosPolicyDataT = ThreadThroughputQosPolicy
public typealias ThreadThroughputQosPolicyT = ThreadThroughputQosPolicy?
public typealias PthreadJitWriteCallbackT = ((COpaquePointer?) -> CInt)?
public typealias OsClockidT = UInt
public typealias OsSyncWaitOnAddressFlagsT = UInt
public typealias OsSyncWakeByAddressFlagsT = UInt
public typealias OsUnfairLock = OsUnfairLockS
public typealias OsUnfairLockT = OsUnfairLock?
public typealias OsLogT = COpaquePointer?
public typealias OsLogTypeT = UByte
public typealias OsSignpostIdT = ULong
public typealias OsSignpostTypeT = UByte
public typealias VmStatisticsT = VmStatistics?
public typealias VmStatisticsDataT = VmStatistics
public typealias VmStatistics64T = VmStatistics64?
public typealias VmStatistics64DataT = VmStatistics64
public typealias TaskT = MachPortT
public typealias TaskInspectT = MachPortT
public typealias SysdirSearchPathEnumerationState = CUInt
public typealias CCStatus = Int
public typealias CCCryptorStatus = Int
public typealias CCRNGStatus = CCCryptorStatus
public typealias CopyfileStateT = COpaquePointer?
public typealias CopyfileFlagsT = UInt
public typealias CopyfileCallbackT = ((CInt, CInt, CopyfileStateT, String?, String?, COpaquePointer?) -> CInt)?
public typealias AttrgroupT = UInt
public typealias VolCapabilitiesSetT = UIntArray
public typealias MachTimebaseInfoDataT = MachTimebaseInfo

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class IpMreqn(
    val imrMultiaddr: InAddr,
    val imrAddress: InAddr,
    val imrIfindex: CInt,
)

public data class IpMreqSource(
    val imrMultiaddr: InAddr,
    val imrSourceaddr: InAddr,
    val imrInterface: InAddr,
)

public data class Aiocb(
    val aioFildes: CInt,
    val aioOffset: OffT,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioReqprio: CInt,
    val aioSigevent: Sigevent,
    val aioLioOpcode: CInt,
)

public data class GlobT(
    val glPathc: ULong,
    val glOffs: ULong,
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

public data class MachTimebaseInfo(
    val numer: UInt,
    val denom: UInt,
)

public data class Stat(
    val stDev: DevT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stIno: InoT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stBirthtime: TimeT,
    val stBirthtimeNsec: CLong,
    val stSize: OffT,
    val stBlocks: BlkcntT,
    val stBlksize: BlksizeT,
    val stFlags: UInt,
    val stGen: UInt,
    val stLspare: Int,
    val stQspare: LongArray,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val siPid: PidT,
    val siUid: UidT,
    val siStatus: CInt,
    val siAddr: COpaquePointer?,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)

public data class FstoreT(
    val fstFlags: CUInt,
    val fstPosmode: CInt,
    val fstOffset: OffT,
    val fstLength: OffT,
    val fstBytesalloc: OffT,
)

public data class FpunchholeT(
    val fpFlags: CUInt,
    val reserved: CUInt,
    val fpOffset: OffT,
    val fpLength: OffT,
)

public data class FtrimactivefileT(
    val ftaOffset: OffT,
    val ftaLength: OffT,
)

public data class FspecreadT(
    val fsrFlags: CUInt,
    val reserved: CUInt,
    val fsrOffset: OffT,
    val fsrLength: OffT,
)

public data class Radvisory(
    val raOffset: OffT,
    val raCount: CInt,
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

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class Kevent64S(
    val ident: ULong,
    val filter: Short,
    val flags: UShort,
    val fflags: UInt,
    val data: Long,
    val udata: ULong,
    val ext: ULongArray,
)

public data class Dqblk(
    val dqbBhardlimit: ULong,
    val dqbBsoftlimit: ULong,
    val dqbCurbytes: ULong,
    val dqbIhardlimit: UInt,
    val dqbIsoftlimit: UInt,
    val dqbCurinodes: UInt,
    val dqbBtime: UInt,
    val dqbItime: UInt,
    val dqbId: UInt,
    val dqbSpare: UIntArray,
)

public data class IfMsghdr(
    val ifmMsglen: CUShort,
    val ifmVersion: CUChar,
    val ifmType: CUChar,
    val ifmAddrs: CInt,
    val ifmFlags: CInt,
    val ifmIndex: CUShort,
    val ifmData: IfData,
)

public data class IfaMsghdr(
    val ifamMsglen: CUShort,
    val ifamVersion: CUChar,
    val ifamType: CUChar,
    val ifamAddrs: CInt,
    val ifamFlags: CInt,
    val ifamIndex: CUShort,
    val ifamMetric: CInt,
)

public data class IfmaMsghdr(
    val ifmamMsglen: CUShort,
    val ifmamVersion: CUChar,
    val ifmamType: CUChar,
    val ifmamAddrs: CInt,
    val ifmamFlags: CInt,
    val ifmamIndex: CUShort,
)

public data class IfmaMsghdr2(
    val ifmamMsglen: CUShort,
    val ifmamVersion: CUChar,
    val ifmamType: CUChar,
    val ifmamAddrs: CInt,
    val ifmamFlags: CInt,
    val ifmamIndex: CUShort,
    val ifmamRefcount: Int,
)

public data class RtMetrics(
    val rmxLocks: UInt,
    val rmxMtu: UInt,
    val rmxHopcount: UInt,
    val rmxExpire: Int,
    val rmxRecvpipe: UInt,
    val rmxSendpipe: UInt,
    val rmxSsthresh: UInt,
    val rmxRtt: UInt,
    val rmxRttvar: UInt,
    val rmxPksent: UInt,
    val rmxState: UInt,
    val rmxFiller: UIntArray,
)

public data class RtMsghdr(
    val rtmMsglen: CUShort,
    val rtmVersion: CUChar,
    val rtmType: CUChar,
    val rtmIndex: CUShort,
    val rtmFlags: CInt,
    val rtmAddrs: CInt,
    val rtmPid: PidT,
    val rtmSeq: CInt,
    val rtmErrno: CInt,
    val rtmUse: CInt,
    val rtmInits: UInt,
    val rtmRmx: RtMetrics,
)

public data class RtMsghdr2(
    val rtmMsglen: CUShort,
    val rtmVersion: CUChar,
    val rtmType: CUChar,
    val rtmIndex: CUShort,
    val rtmFlags: CInt,
    val rtmAddrs: CInt,
    val rtmRefcnt: Int,
    val rtmParentflags: CInt,
    val rtmReserved: CInt,
    val rtmUse: CInt,
    val rtmInits: UInt,
    val rtmRmx: RtMetrics,
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

public data class Flock(
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
    val lType: CShort,
    val lWhence: CShort,
)

public data class SfHdtr(
    val headers: Iovec?,
    val hdrCnt: CInt,
    val trailers: Iovec?,
    val trlCnt: CInt,
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

public data class ProcTaskinfo(
    val ptiVirtualSize: ULong,
    val ptiResidentSize: ULong,
    val ptiTotalUser: ULong,
    val ptiTotalSystem: ULong,
    val ptiThreadsUser: ULong,
    val ptiThreadsSystem: ULong,
    val ptiPolicy: Int,
    val ptiFaults: Int,
    val ptiPageins: Int,
    val ptiCowFaults: Int,
    val ptiMessagesSent: Int,
    val ptiMessagesReceived: Int,
    val ptiSyscallsMach: Int,
    val ptiSyscallsUnix: Int,
    val ptiCsw: Int,
    val ptiThreadnum: Int,
    val ptiNumrunning: Int,
    val ptiPriority: Int,
)

public data class ProcBsdinfo(
    val pbiFlags: UInt,
    val pbiStatus: UInt,
    val pbiXstatus: UInt,
    val pbiPid: UInt,
    val pbiPpid: UInt,
    val pbiUid: UidT,
    val pbiGid: GidT,
    val pbiRuid: UidT,
    val pbiRgid: GidT,
    val pbiSvuid: UidT,
    val pbiSvgid: GidT,
    val rfu1: UInt,
    val pbiComm: ByteArray,
    val pbiName: ByteArray,
    val pbiNfiles: UInt,
    val pbiPgid: UInt,
    val pbiPjobc: UInt,
    val eTdev: UInt,
    val eTpgid: UInt,
    val pbiNice: Int,
    val pbiStartTvsec: ULong,
    val pbiStartTvusec: ULong,
)

public data class ProcTaskallinfo(
    val pbsd: ProcBsdinfo,
    val ptinfo: ProcTaskinfo,
)

public data class XswUsage(
    val xsuTotal: ULong,
    val xsuAvail: ULong,
    val xsuUsed: ULong,
    val xsuPagesize: UInt,
    val xsuEncrypted: BooleanT,
)

public data class Xucred(
    val crVersion: CUInt,
    val crUid: UidT,
    val crNgroups: CShort,
    val crGroups: List<GidT>,
)

public data class MachHeader(
    val magic: UInt,
    val cputype: CpuTypeT,
    val cpusubtype: CpuSubtypeT,
    val filetype: UInt,
    val ncmds: UInt,
    val sizeofcmds: UInt,
    val flags: UInt,
)

public data class MachHeader64(
    val magic: UInt,
    val cputype: CpuTypeT,
    val cpusubtype: CpuSubtypeT,
    val filetype: UInt,
    val ncmds: UInt,
    val sizeofcmds: UInt,
    val flags: UInt,
    val reserved: UInt,
)

public data class SegmentCommand(
    val cmd: UInt,
    val cmdsize: UInt,
    val segname: ByteArray,
    val vmaddr: UInt,
    val vmsize: UInt,
    val fileoff: UInt,
    val filesize: UInt,
    val maxprot: VmProtT,
    val initprot: VmProtT,
    val nsects: UInt,
    val flags: UInt,
)

public data class SegmentCommand64(
    val cmd: UInt,
    val cmdsize: UInt,
    val segname: ByteArray,
    val vmaddr: ULong,
    val vmsize: ULong,
    val fileoff: ULong,
    val filesize: ULong,
    val maxprot: VmProtT,
    val initprot: VmProtT,
    val nsects: UInt,
    val flags: UInt,
)

public data class LoadCommand(
    val cmd: UInt,
    val cmdsize: UInt,
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

public data class SockaddrInarp(
    val sinLen: CUChar,
    val sinFamily: CUChar,
    val sinPort: CUShort,
    val sinAddr: InAddr,
    val sinSrcaddr: InAddr,
    val sinTos: CUShort,
    val sinOther: CUShort,
)

public data class SockaddrCtl(
    val scLen: CUChar,
    val scFamily: CUChar,
    val ssSysaddr: UShort,
    val scId: UInt,
    val scUnit: UInt,
    val scReserved: UIntArray,
)

public data class InPktinfo(
    val ipiIfindex: CUInt,
    val ipiSpecDst: InAddr,
    val ipiAddr: InAddr,
)

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: CUInt,
)

public data class IpcPerm(
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: ModeT,
    val seq: CUShort,
    val key: KeyT,
)

public data class Sembuf(
    val semNum: CUShort,
    val semOp: CShort,
    val semFlg: CShort,
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

public data class SockaddrNdrv(
    val sndLen: CUChar,
    val sndFamily: CUChar,
    val sndName: UByteArray,
)

public data class SaEndpointsT(
    val saeSrcif: CUInt,
    val saeSrcaddr: Sockaddr?,
    val saeSrcaddrlen: SocklenT,
    val saeDstaddr: Sockaddr?,
    val saeDstaddrlen: SocklenT,
)

public data class Timex(
    val modes: CUInt,
    val offset: CLong,
    val freq: CLong,
    val maxerror: CLong,
    val esterror: CLong,
    val status: CInt,
    val constant: CLong,
    val precision: CLong,
    val tolerance: CLong,
    val ppsfreq: CLong,
    val jitter: CLong,
    val shift: CInt,
    val stabil: CLong,
    val jitcnt: CLong,
    val calcnt: CLong,
    val errcnt: CLong,
    val stbcnt: CLong,
)

public data class Ntptimeval(
    val time: Timespec,
    val maxerror: CLong,
    val esterror: CLong,
    val tai: CLong,
    val timeState: CInt,
)

public data class ThreadStandardPolicy(
    val noData: NaturalT,
)

public data class ThreadExtendedPolicy(
    val timeshare: BooleanT,
)

public data class ThreadTimeConstraintPolicy(
    val period: UInt,
    val computation: UInt,
    val constraint: UInt,
    val preemptible: BooleanT,
)

public data class ThreadPrecedencePolicy(
    val importance: IntegerT,
)

public data class ThreadAffinityPolicy(
    val affinityTag: IntegerT,
)

public data class ThreadBackgroundPolicy(
    val priority: IntegerT,
)

public data class ThreadLatencyQosPolicy(
    val threadLatencyQosTier: ThreadLatencyQosT,
)

public data class ThreadThroughputQosPolicy(
    val threadThroughputQosTier: ThreadThroughputQosT,
)

public data class MallocStatisticsT(
    val blocksInUse: CUInt,
    val sizeInUse: ULong,
    val maxSizeInUse: ULong,
    val sizeAllocated: ULong,
)

public data class Mstats(
    val bytesTotal: ULong,
    val chunksUsed: ULong,
    val bytesUsed: ULong,
    val chunksFree: ULong,
    val bytesFree: ULong,
)

public data class VmRangeT(
    val address: VmAddressT,
    val size: VmSizeT,
)

public data class VinfoStat(
    val vstDev: UInt,
    val vstMode: UShort,
    val vstNlink: UShort,
    val vstIno: ULong,
    val vstUid: UidT,
    val vstGid: GidT,
    val vstAtime: Long,
    val vstAtimensec: Long,
    val vstMtime: Long,
    val vstMtimensec: Long,
    val vstCtime: Long,
    val vstCtimensec: Long,
    val vstBirthtime: Long,
    val vstBirthtimensec: Long,
    val vstSize: OffT,
    val vstBlocks: Long,
    val vstBlksize: Int,
    val vstFlags: UInt,
    val vstGen: UInt,
    val vstRdev: UInt,
    val vstQspare: LongArray,
)

public data class VnodeInfo(
    val viStat: VinfoStat,
    val viType: CInt,
    val viPad: CInt,
    val viFsid: FsidT,
)

public data class VnodeInfoPath(
    val vipVi: VnodeInfo,
    val vipPath: List<ByteArray>,
)

public data class ProcVnodepathinfo(
    val pviCdir: VnodeInfoPath,
    val pviRdir: VnodeInfoPath,
)

public data class VmStatistics(
    val freeCount: NaturalT,
    val activeCount: NaturalT,
    val inactiveCount: NaturalT,
    val wireCount: NaturalT,
    val zeroFillCount: NaturalT,
    val reactivations: NaturalT,
    val pageins: NaturalT,
    val pageouts: NaturalT,
    val faults: NaturalT,
    val cowFaults: NaturalT,
    val lookups: NaturalT,
    val hits: NaturalT,
    val purgeableCount: NaturalT,
    val purges: NaturalT,
    val speculativeCount: NaturalT,
)

public data class TaskThreadTimesInfo(
    val userTime: TimeValueT,
    val systemTime: TimeValueT,
)

public data class RusageInfoV0(
    val riUuid: UByteArray,
    val riUserTime: ULong,
    val riSystemTime: ULong,
    val riPkgIdleWkups: ULong,
    val riInterruptWkups: ULong,
    val riPageins: ULong,
    val riWiredSize: ULong,
    val riResidentSize: ULong,
    val riPhysFootprint: ULong,
    val riProcStartAbstime: ULong,
    val riProcExitAbstime: ULong,
)

public data class RusageInfoV1(
    val riUuid: UByteArray,
    val riUserTime: ULong,
    val riSystemTime: ULong,
    val riPkgIdleWkups: ULong,
    val riInterruptWkups: ULong,
    val riPageins: ULong,
    val riWiredSize: ULong,
    val riResidentSize: ULong,
    val riPhysFootprint: ULong,
    val riProcStartAbstime: ULong,
    val riProcExitAbstime: ULong,
    val riChildUserTime: ULong,
    val riChildSystemTime: ULong,
    val riChildPkgIdleWkups: ULong,
    val riChildInterruptWkups: ULong,
    val riChildPageins: ULong,
    val riChildElapsedAbstime: ULong,
)

public data class RusageInfoV2(
    val riUuid: UByteArray,
    val riUserTime: ULong,
    val riSystemTime: ULong,
    val riPkgIdleWkups: ULong,
    val riInterruptWkups: ULong,
    val riPageins: ULong,
    val riWiredSize: ULong,
    val riResidentSize: ULong,
    val riPhysFootprint: ULong,
    val riProcStartAbstime: ULong,
    val riProcExitAbstime: ULong,
    val riChildUserTime: ULong,
    val riChildSystemTime: ULong,
    val riChildPkgIdleWkups: ULong,
    val riChildInterruptWkups: ULong,
    val riChildPageins: ULong,
    val riChildElapsedAbstime: ULong,
    val riDiskioBytesread: ULong,
    val riDiskioByteswritten: ULong,
)

public data class RusageInfoV3(
    val riUuid: UByteArray,
    val riUserTime: ULong,
    val riSystemTime: ULong,
    val riPkgIdleWkups: ULong,
    val riInterruptWkups: ULong,
    val riPageins: ULong,
    val riWiredSize: ULong,
    val riResidentSize: ULong,
    val riPhysFootprint: ULong,
    val riProcStartAbstime: ULong,
    val riProcExitAbstime: ULong,
    val riChildUserTime: ULong,
    val riChildSystemTime: ULong,
    val riChildPkgIdleWkups: ULong,
    val riChildInterruptWkups: ULong,
    val riChildPageins: ULong,
    val riChildElapsedAbstime: ULong,
    val riDiskioBytesread: ULong,
    val riDiskioByteswritten: ULong,
    val riCpuTimeQosDefault: ULong,
    val riCpuTimeQosMaintenance: ULong,
    val riCpuTimeQosBackground: ULong,
    val riCpuTimeQosUtility: ULong,
    val riCpuTimeQosLegacy: ULong,
    val riCpuTimeQosUserInitiated: ULong,
    val riCpuTimeQosUserInteractive: ULong,
    val riBilledSystemTime: ULong,
    val riServicedSystemTime: ULong,
)

public data class RusageInfoV4(
    val riUuid: UByteArray,
    val riUserTime: ULong,
    val riSystemTime: ULong,
    val riPkgIdleWkups: ULong,
    val riInterruptWkups: ULong,
    val riPageins: ULong,
    val riWiredSize: ULong,
    val riResidentSize: ULong,
    val riPhysFootprint: ULong,
    val riProcStartAbstime: ULong,
    val riProcExitAbstime: ULong,
    val riChildUserTime: ULong,
    val riChildSystemTime: ULong,
    val riChildPkgIdleWkups: ULong,
    val riChildInterruptWkups: ULong,
    val riChildPageins: ULong,
    val riChildElapsedAbstime: ULong,
    val riDiskioBytesread: ULong,
    val riDiskioByteswritten: ULong,
    val riCpuTimeQosDefault: ULong,
    val riCpuTimeQosMaintenance: ULong,
    val riCpuTimeQosBackground: ULong,
    val riCpuTimeQosUtility: ULong,
    val riCpuTimeQosLegacy: ULong,
    val riCpuTimeQosUserInitiated: ULong,
    val riCpuTimeQosUserInteractive: ULong,
    val riBilledSystemTime: ULong,
    val riServicedSystemTime: ULong,
    val riLogicalWrites: ULong,
    val riLifetimeMaxPhysFootprint: ULong,
    val riInstructions: ULong,
    val riCycles: ULong,
    val riBilledEnergy: ULong,
    val riServicedEnergy: ULong,
    val riIntervalMaxPhysFootprint: ULong,
    val riRunnableTime: ULong,
)

public data class ImageOffset(
    val uuid: UuidT,
    val offset: UInt,
)

public data class Attrlist(
    val bitmapcount: CUShort,
    val reserved: UShort,
    val commonattr: AttrgroupT,
    val volattr: AttrgroupT,
    val dirattr: AttrgroupT,
    val fileattr: AttrgroupT,
    val forkattr: AttrgroupT,
)

public data class AttrreferenceT(
    val attrDataoffset: Int,
    val attrLength: UInt,
)

public data class VolCapabilitiesAttrT(
    val capabilities: VolCapabilitiesSetT,
    val valid: VolCapabilitiesSetT,
)

public data class AttributeSetT(
    val commonattr: AttrgroupT,
    val volattr: AttrgroupT,
    val dirattr: AttrgroupT,
    val fileattr: AttrgroupT,
    val forkattr: AttrgroupT,
)

public data class VolAttributesAttrT(
    val validattr: AttributeSetT,
    val nativeattr: AttributeSetT,
)

public data class TcpConnectionInfo(
    val tcpiState: UByte,
    val tcpiSndWscale: UByte,
    val tcpiRcvWscale: UByte,
    val tcpiOptions: UInt,
    val tcpiFlags: UInt,
    val tcpiRto: UInt,
    val tcpiMaxseg: UInt,
    val tcpiSndSsthresh: UInt,
    val tcpiSndCwnd: UInt,
    val tcpiSndWnd: UInt,
    val tcpiSndSbbytes: UInt,
    val tcpiRcvWnd: UInt,
    val tcpiRttcur: UInt,
    val tcpiSrtt: UInt,
    val tcpiRttvar: UInt,
    val tcpiTfoCookieReq: UInt,
    val tcpiTfoCookieRcv: UInt,
    val tcpiTfoSynLoss: UInt,
    val tcpiTfoSynDataSent: UInt,
    val tcpiTfoSynDataAcked: UInt,
    val tcpiTfoSynDataRcv: UInt,
    val tcpiTfoCookieReqRcv: UInt,
    val tcpiTfoCookieSent: UInt,
    val tcpiTfoCookieInvalid: UInt,
    val tcpiTfoCookieWrong: UInt,
    val tcpiTfoNoCookieRcv: UInt,
    val tcpiTfoHeuristicsDisable: UInt,
    val tcpiTfoSendBlackhole: UInt,
    val tcpiTfoRecvBlackhole: UInt,
    val tcpiTfoOnebyteProxy: UInt,
    val tcpiTxpackets: ULong,
    val tcpiTxbytes: ULong,
    val tcpiTxretransmitbytes: ULong,
    val tcpiRxpackets: ULong,
    val tcpiRxbytes: ULong,
    val tcpiRxoutoforderbytes: ULong,
    val tcpiRxretransmitpackets: ULong,
)

public data class In6Addrlifetime(
    val ia6tExpire: TimeT,
    val ia6tPreferred: TimeT,
    val ia6tVltime: UInt,
    val ia6tPltime: UInt,
)

public data class In6Ifstat(
    val ifs6InReceive: UQuadT,
    val ifs6InHdrerr: UQuadT,
    val ifs6InToobig: UQuadT,
    val ifs6InNoroute: UQuadT,
    val ifs6InAddrerr: UQuadT,
    val ifs6InProtounknown: UQuadT,
    val ifs6InTruncated: UQuadT,
    val ifs6InDiscard: UQuadT,
    val ifs6InDeliver: UQuadT,
    val ifs6OutForward: UQuadT,
    val ifs6OutRequest: UQuadT,
    val ifs6OutDiscard: UQuadT,
    val ifs6OutFragok: UQuadT,
    val ifs6OutFragfail: UQuadT,
    val ifs6OutFragcreat: UQuadT,
    val ifs6ReassReqd: UQuadT,
    val ifs6ReassOk: UQuadT,
    val ifs6AtmfragRcvd: UQuadT,
    val ifs6ReassFail: UQuadT,
    val ifs6InMcast: UQuadT,
    val ifs6OutMcast: UQuadT,
    val ifs6CantfowardIcmp6: UQuadT,
    val ifs6AddrExpiryCnt: UQuadT,
    val ifs6PfxExpiryCnt: UQuadT,
    val ifs6DefrtrExpiryCnt: UQuadT,
)

public data class Icmp6Ifstat(
    val ifs6InMsg: UQuadT,
    val ifs6InError: UQuadT,
    val ifs6InDstunreach: UQuadT,
    val ifs6InAdminprohib: UQuadT,
    val ifs6InTimeexceed: UQuadT,
    val ifs6InParamprob: UQuadT,
    val ifs6InPkttoobig: UQuadT,
    val ifs6InEcho: UQuadT,
    val ifs6InEchoreply: UQuadT,
    val ifs6InRoutersolicit: UQuadT,
    val ifs6InRouteradvert: UQuadT,
    val ifs6InNeighborsolicit: UQuadT,
    val ifs6InNeighboradvert: UQuadT,
    val ifs6InRedirect: UQuadT,
    val ifs6InMldquery: UQuadT,
    val ifs6InMldreport: UQuadT,
    val ifs6InMlddone: UQuadT,
    val ifs6OutMsg: UQuadT,
    val ifs6OutError: UQuadT,
    val ifs6OutDstunreach: UQuadT,
    val ifs6OutAdminprohib: UQuadT,
    val ifs6OutTimeexceed: UQuadT,
    val ifs6OutParamprob: UQuadT,
    val ifs6OutPkttoobig: UQuadT,
    val ifs6OutEcho: UQuadT,
    val ifs6OutEchoreply: UQuadT,
    val ifs6OutRoutersolicit: UQuadT,
    val ifs6OutRouteradvert: UQuadT,
    val ifs6OutNeighborsolicit: UQuadT,
    val ifs6OutNeighboradvert: UQuadT,
    val ifs6OutRedirect: UQuadT,
    val ifs6OutMldquery: UQuadT,
    val ifs6OutMldreport: UQuadT,
    val ifs6OutMlddone: UQuadT,
)

public data class HostCpuLoadInfo(
    val cpuTicks: List<NaturalT>,
)

public data class Ifmibdata(
    val ifmdName: ByteArray,
    val ifmdPcount: CUInt,
    val ifmdFlags: CUInt,
    val ifmdSndLen: CUInt,
    val ifmdSndMaxlen: CUInt,
    val ifmdSndDrops: CUInt,
    val ifmdFiller: UIntArray,
    val ifmdData: IfData64,
)

public data class IfsIso88023(
    val dot3StatsAlignmentErrors: UInt,
    val dot3StatsFCSErrors: UInt,
    val dot3StatsSingleCollisionFrames: UInt,
    val dot3StatsMultipleCollisionFrames: UInt,
    val dot3StatsSQETestErrors: UInt,
    val dot3StatsDeferredTransmissions: UInt,
    val dot3StatsLateCollisions: UInt,
    val dot3StatsExcessiveCollisions: UInt,
    val dot3StatsInternalMacTransmitErrors: UInt,
    val dot3StatsCarrierSenseErrors: UInt,
    val dot3StatsFrameTooLongs: UInt,
    val dot3StatsInternalMacReceiveErrors: UInt,
    val dot3StatsEtherChipSet: UInt,
    val dot3StatsMissedFrames: UInt,
    val dot3StatsCollFrequencies: UIntArray,
    val dot3Compliance: UInt,
)

public data class CtlInfo(
    val ctlId: UInt,
    val ctlName: ByteArray,
)

public data class ProcFdinfo(
    val procFd: Int,
    val procFdtype: UInt,
)

public data class Kevent(
    val ident: UintptrT,
    val filter: Short,
    val flags: UShort,
    val fflags: UInt,
    val data: IntptrT,
    val udata: COpaquePointer?,
)

public data class SemidDs(
    val semPerm: IpcPerm,
    val semBase: Int,
    val semNsems: CUShort,
    val semOtime: TimeT,
    val semPad1: Int,
    val semCtime: TimeT,
    val semPad2: Int,
    val semPad3: IntArray,
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

public data class ProcThreadinfo(
    val pthUserTime: ULong,
    val pthSystemTime: ULong,
    val pthCpuUsage: Int,
    val pthPolicy: Int,
    val pthRunState: Int,
    val pthFlags: Int,
    val pthSleepTime: Int,
    val pthCurpri: Int,
    val pthPriority: Int,
    val pthMaxpriority: Int,
    val pthName: ByteArray,
)

public data class Statfs(
    val fBsize: UInt,
    val fIosize: Int,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: FsidT,
    val fOwner: UidT,
    val fType: UInt,
    val fFlags: UInt,
    val fFssubtype: UInt,
    val fFstypename: ByteArray,
    val fMntonname: ByteArray,
    val fMntfromname: ByteArray,
    val fFlagsExt: UInt,
    val fReserved: UIntArray,
)

public data class Dirent(
    val dIno: ULong,
    val dSeekoff: ULong,
    val dReclen: UShort,
    val dNamlen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: SaFamilyT,
    val ssAlign: Long,
)

public data class Utmpx(
    val utUser: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utPid: PidT,
    val utType: CShort,
    val utTv: Timeval,
    val utHost: ByteArray,
)

public data class Sigevent(
    val sigevNotify: CInt,
    val sigevSigno: CInt,
    val sigevValue: Sigval,
    val sigevNotifyAttributes: PthreadAttrT?,
)

public data class ProcessorCpuLoadInfo(
    val cpuTicks: UIntArray,
)

public data class ProcessorBasicInfo(
    val cpuType: CpuTypeT,
    val cpuSubtype: CpuSubtypeT,
    val running: BooleanT,
    val slotNum: CInt,
    val isMaster: BooleanT,
)

public data class ProcessorSetBasicInfo(
    val processorCount: CInt,
    val defaultPolicy: CInt,
)

public data class ProcessorSetLoadInfo(
    val taskCount: CInt,
    val threadCount: CInt,
    val loadAverage: IntegerT,
    val machFactor: IntegerT,
)

public data class TimeValueT(
    val seconds: IntegerT,
    val microseconds: IntegerT,
)

public data class ThreadBasicInfo(
    val userTime: TimeValueT,
    val systemTime: TimeValueT,
    val cpuUsage: IntegerT,
    val policy: PolicyT,
    val runState: IntegerT,
    val flags: IntegerT,
    val suspendCount: IntegerT,
    val sleepTime: IntegerT,
)

public data class ThreadIdentifierInfo(
    val threadId: ULong,
    val threadHandle: ULong,
    val dispatchQaddr: ULong,
)

public data class ThreadExtendedInfo(
    val pthUserTime: ULong,
    val pthSystemTime: ULong,
    val pthCpuUsage: Int,
    val pthPolicy: Int,
    val pthRunState: Int,
    val pthFlags: Int,
    val pthSleepTime: Int,
    val pthCurpri: Int,
    val pthPriority: Int,
    val pthMaxpriority: Int,
    val pthName: ByteArray,
)

public data class IfData64(
    val ifiType: CUChar,
    val ifiTypelen: CUChar,
    val ifiPhysical: CUChar,
    val ifiAddrlen: CUChar,
    val ifiHdrlen: CUChar,
    val ifiRecvquota: CUChar,
    val ifiXmitquota: CUChar,
    val ifiUnused1: CUChar,
    val ifiMtu: UInt,
    val ifiMetric: UInt,
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
    val ifiNoproto: ULong,
    val ifiRecvtiming: UInt,
    val ifiXmittiming: UInt,
    val ifiLastchange: Timeval,
    val ifiLastchange2: Timeval32,
)

public data class IfMsghdr2(
    val ifmMsglen: CUShort,
    val ifmVersion: CUChar,
    val ifmType: CUChar,
    val ifmAddrs: CInt,
    val ifmFlags: CInt,
    val ifmIndex: CUShort,
    val ifmSndLen: CInt,
    val ifmSndMaxlen: CInt,
    val ifmSndDrops: CInt,
    val ifmTimer: CInt,
    val ifmData: IfData64,
)

public data class VmStatistics64(
    val freeCount: NaturalT,
    val activeCount: NaturalT,
    val inactiveCount: NaturalT,
    val wireCount: NaturalT,
    val zeroFillCount: ULong,
    val reactivations: ULong,
    val pageins: ULong,
    val pageouts: ULong,
    val faults: ULong,
    val cowFaults: ULong,
    val lookups: ULong,
    val hits: ULong,
    val purges: ULong,
    val purgeableCount: NaturalT,
    val speculativeCount: NaturalT,
    val decompressions: ULong,
    val compressions: ULong,
    val swapins: ULong,
    val swapouts: ULong,
    val compressorPageCount: NaturalT,
    val throttledCount: NaturalT,
    val externalPageCount: NaturalT,
    val internalPageCount: NaturalT,
    val totalUncompressedPagesInCompressor: ULong,
)

public data class MachTaskBasicInfo(
    val virtualSize: MachVmSizeT,
    val residentSize: MachVmSizeT,
    val residentSizeMax: MachVmSizeT,
    val userTime: TimeValueT,
    val systemTime: TimeValueT,
    val policy: PolicyT,
    val suspendCount: IntegerT,
)

public data class Log2phys(
    val l2pFlags: CUInt,
    val l2pContigbytes: OffT,
    val l2pDevoffset: OffT,
)

public data class OsUnfairLockS(
    val osUnfairLockOpaque: UInt,
)

public data class SockaddrVm(
    val svmLen: CUChar,
    val svmFamily: SaFamilyT,
    val svmReserved1: CUShort,
    val svmPort: CUInt,
    val svmCid: CUInt,
)

public data class Ifdevmtu(
    val ifdmCurrent: CInt,
    val ifdmMin: CInt,
    val ifdmMax: CInt,
)

public data class Ifkpi(
    val ifkModuleId: CUInt,
    val ifkType: CUInt,
    val ifkData: CAnonymousIfkData,
)

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
)

public data class In6Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru6,
)

public data class Ifconf(
    val ifcLen: CInt,
    val ifcIfcu: CAnonymousIfcIfcu,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfkData(
    val ifkPtr: COpaquePointer? = null,
    val ifkValue: CInt? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val ifruFlags: CShort? = null,
    val ifruMetrics: CInt? = null,
    val ifruMtu: CInt? = null,
    val ifruPhys: CInt? = null,
    val ifruMedia: CInt? = null,
    val ifruIntval: CInt? = null,
    val ifruData: String? = null,
    val ifruDevmtu: Ifdevmtu? = null,
    val ifruKpi: Ifkpi? = null,
    val ifruWakeFlags: UInt? = null,
    val ifruRouteRefcnt: UInt? = null,
    val ifruCap: IntArray? = null,
    val ifruFunctionalType: UInt? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfcIfcu(
    val ifcuBuf: String? = null,
    val ifcuReq: Ifreq? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru6(
    val ifruAddr: SockaddrIn6? = null,
    val ifruDstaddr: SockaddrIn6? = null,
    val ifruFlags: CInt? = null,
    val ifruFlags6: CInt? = null,
    val ifruMetrics: CInt? = null,
    val ifruIntval: CInt? = null,
    val ifruData: String? = null,
    val ifruLifetime: In6Addrlifetime? = null,
    val ifruStat: In6Ifstat? = null,
    val ifruIcmp6stat: Icmp6Ifstat? = null,
    val ifruScopeId: UIntArray? = null,
)

// C union; only one variant is valid at a time.
public data class Semun(
    val `val`: CInt? = null,
    val buf: SemidDs? = null,
    val array: CUShort? = null,
)

public const val _UTX_USERSIZE: ULong = 256uL
public const val _UTX_LINESIZE: ULong = 32uL
public const val _UTX_IDSIZE: ULong = 4uL
public const val _UTX_HOSTSIZE: ULong = 256uL
public const val EMPTY: CShort = 0
public const val RUN_LVL: CShort = 1
public const val BOOT_TIME: CShort = 2
public const val OLD_TIME: CShort = 3
public const val NEW_TIME: CShort = 4
public const val INIT_PROCESS: CShort = 5
public const val LOGIN_PROCESS: CShort = 6
public const val USER_PROCESS: CShort = 7
public const val DEAD_PROCESS: CShort = 8
public const val ACCOUNTING: CShort = 9
public const val SIGNATURE: CShort = 10
public const val SHUTDOWN_TIME: CShort = 11
public val LC_COLLATE_MASK: CInt = 1 shl 0
public val LC_CTYPE_MASK: CInt = 1 shl 1
public val LC_MESSAGES_MASK: CInt = 1 shl 2
public val LC_MONETARY_MASK: CInt = 1 shl 3
public val LC_NUMERIC_MASK: CInt = 1 shl 4
public val LC_TIME_MASK: CInt = 1 shl 5
public val LC_ALL_MASK: CInt = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK
public const val CODESET: NlItem = 0
public const val D_T_FMT: NlItem = 1
public const val D_FMT: NlItem = 2
public const val T_FMT: NlItem = 3
public const val T_FMT_AMPM: NlItem = 4
public const val AM_STR: NlItem = 5
public const val PM_STR: NlItem = 6
public const val DAY_1: NlItem = 7
public const val DAY_2: NlItem = 8
public const val DAY_3: NlItem = 9
public const val DAY_4: NlItem = 10
public const val DAY_5: NlItem = 11
public const val DAY_6: NlItem = 12
public const val DAY_7: NlItem = 13
public const val ABDAY_1: NlItem = 14
public const val ABDAY_2: NlItem = 15
public const val ABDAY_3: NlItem = 16
public const val ABDAY_4: NlItem = 17
public const val ABDAY_5: NlItem = 18
public const val ABDAY_6: NlItem = 19
public const val ABDAY_7: NlItem = 20
public const val MON_1: NlItem = 21
public const val MON_2: NlItem = 22
public const val MON_3: NlItem = 23
public const val MON_4: NlItem = 24
public const val MON_5: NlItem = 25
public const val MON_6: NlItem = 26
public const val MON_7: NlItem = 27
public const val MON_8: NlItem = 28
public const val MON_9: NlItem = 29
public const val MON_10: NlItem = 30
public const val MON_11: NlItem = 31
public const val MON_12: NlItem = 32
public const val ABMON_1: NlItem = 33
public const val ABMON_2: NlItem = 34
public const val ABMON_3: NlItem = 35
public const val ABMON_4: NlItem = 36
public const val ABMON_5: NlItem = 37
public const val ABMON_6: NlItem = 38
public const val ABMON_7: NlItem = 39
public const val ABMON_8: NlItem = 40
public const val ABMON_9: NlItem = 41
public const val ABMON_10: NlItem = 42
public const val ABMON_11: NlItem = 43
public const val ABMON_12: NlItem = 44
public const val CLOCK_REALTIME: ClockidT = 0u
public const val CLOCK_MONOTONIC_RAW: ClockidT = 4u
public const val CLOCK_MONOTONIC_RAW_APPROX: ClockidT = 5u
public const val CLOCK_MONOTONIC: ClockidT = 6u
public const val CLOCK_UPTIME_RAW: ClockidT = 8u
public const val CLOCK_UPTIME_RAW_APPROX: ClockidT = 9u
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 12u
public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 16u
public const val ERA: NlItem = 45
public const val ERA_D_FMT: NlItem = 46
public const val ERA_D_T_FMT: NlItem = 47
public const val ERA_T_FMT: NlItem = 48
public const val ALT_DIGITS: NlItem = 49
public const val RADIXCHAR: NlItem = 50
public const val THOUSEP: NlItem = 51
public const val YESEXPR: NlItem = 52
public const val NOEXPR: NlItem = 53
public const val YESSTR: NlItem = 54
public const val NOSTR: NlItem = 55
public const val CRNCYSTR: NlItem = 56
public const val D_MD_ORDER: NlItem = 57
public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val RAND_MAX: CInt = 2147483647
public const val EOF: CInt = -1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val SEEK_HOLE: CInt = 3
public const val SEEK_DATA: CInt = 4
public const val _IOFBF: CInt = 0
public const val _IONBF: CInt = 2
public const val _IOLBF: CInt = 1
public const val BUFSIZ: CUInt = 1024u
public const val FOPEN_MAX: CUInt = 20u
public const val FILENAME_MAX: CUInt = 1024u
public const val L_tmpnam: CUInt = 1024u
public const val TMP_MAX: CUInt = 308915776u
public const val _PC_LINK_MAX: CInt = 1
public const val _PC_MAX_CANON: CInt = 2
public const val _PC_MAX_INPUT: CInt = 3
public const val _PC_NAME_MAX: CInt = 4
public const val _PC_PATH_MAX: CInt = 5
public const val _PC_PIPE_BUF: CInt = 6
public const val _PC_CHOWN_RESTRICTED: CInt = 7
public const val _PC_NO_TRUNC: CInt = 8
public const val _PC_VDISABLE: CInt = 9
public const val _PC_NAME_CHARS_MAX: CInt = 10
public const val _PC_CASE_SENSITIVE: CInt = 11
public const val _PC_CASE_PRESERVING: CInt = 12
public const val _PC_EXTENDED_SECURITY_NP: CInt = 13
public const val _PC_AUTH_OPAQUE_NP: CInt = 14
public const val _PC_2_SYMLINKS: CInt = 15
public const val _PC_ALLOC_SIZE_MIN: CInt = 16
public const val _PC_ASYNC_IO: CInt = 17
public const val _PC_FILESIZEBITS: CInt = 18
public const val _PC_PRIO_IO: CInt = 19
public const val _PC_REC_INCR_XFER_SIZE: CInt = 20
public const val _PC_REC_MAX_XFER_SIZE: CInt = 21
public const val _PC_REC_MIN_XFER_SIZE: CInt = 22
public const val _PC_REC_XFER_ALIGN: CInt = 23
public const val _PC_SYMLINK_MAX: CInt = 24
public const val _PC_SYNC_IO: CInt = 25
public const val _PC_XATTR_SIZE_BITS: CInt = 26
public const val _PC_MIN_HOLE_SIZE: CInt = 27
public const val O_EVTONLY: CInt = 0x00008000
public const val O_NOCTTY: CInt = 0x00020000
public const val O_DIRECTORY: CInt = 0x00100000
public const val O_SYMLINK: CInt = 0x00200000
public const val O_DSYNC: CInt = 0x00400000
public const val O_CLOEXEC: CInt = 0x01000000
public const val O_NOFOLLOW_ANY: CInt = 0x20000000
public const val O_EXEC: CInt = 0x40000000
public val O_SEARCH: CInt = O_EXEC or O_DIRECTORY
public const val S_IFIFO: ModeT = 4096u
public const val S_IFCHR: ModeT = 8192u
public const val S_IFBLK: ModeT = 24576u
public const val S_IFDIR: ModeT = 16384u
public const val S_IFREG: ModeT = 32768u
public const val S_IFLNK: ModeT = 40960u
public const val S_IFSOCK: ModeT = 49152u
public const val S_IFMT: ModeT = 61440u
public const val S_IEXEC: ModeT = 64u
public const val S_IWRITE: ModeT = 128u
public const val S_IREAD: ModeT = 256u
public const val S_IRWXU: ModeT = 448u
public const val S_IXUSR: ModeT = 64u
public const val S_IWUSR: ModeT = 128u
public const val S_IRUSR: ModeT = 256u
public const val S_IRWXG: ModeT = 56u
public const val S_IXGRP: ModeT = 8u
public const val S_IWGRP: ModeT = 16u
public const val S_IRGRP: ModeT = 32u
public const val S_IRWXO: ModeT = 7u
public const val S_IXOTH: ModeT = 1u
public const val S_IWOTH: ModeT = 2u
public const val S_IROTH: ModeT = 4u
public const val F_OK: CInt = 0
public const val R_OK: CInt = 4
public const val W_OK: CInt = 2
public const val X_OK: CInt = 1
public const val F_LOCK: CInt = 1
public const val F_TEST: CInt = 3
public const val F_TLOCK: CInt = 2
public const val F_ULOCK: CInt = 0
public const val F_GETLK: CInt = 7
public const val F_SETLK: CInt = 8
public const val F_SETLKW: CInt = 9
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGABRT: CInt = 6
public const val SIGEMT: CInt = 7
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGSEGV: CInt = 11
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val PROT_NONE: CInt = 0
public const val PROT_READ: CInt = 1
public const val PROT_WRITE: CInt = 2
public const val PROT_EXEC: CInt = 4
public const val PT_TRACE_ME: CInt = 0
public const val PT_READ_I: CInt = 1
public const val PT_READ_D: CInt = 2
public const val PT_READ_U: CInt = 3
public const val PT_WRITE_I: CInt = 4
public const val PT_WRITE_D: CInt = 5
public const val PT_WRITE_U: CInt = 6
public const val PT_CONTINUE: CInt = 7
public const val PT_KILL: CInt = 8
public const val PT_STEP: CInt = 9
public const val PT_ATTACH: CInt = 10
public const val PT_DETACH: CInt = 11
public const val PT_SIGEXC: CInt = 12
public const val PT_THUPDATE: CInt = 13
public const val PT_ATTACHEXC: CInt = 14
public const val PT_FORCEQUOTA: CInt = 30
public const val PT_DENY_ATTACH: CInt = 31
public const val PT_FIRSTMACH: CInt = 32
public const val MAP_FILE: CInt = 0x0000
public const val MAP_SHARED: CInt = 0x0001
public const val MAP_PRIVATE: CInt = 0x0002
public const val MAP_FIXED: CInt = 0x0010
public const val MAP_ANON: CInt = 0x1000
public const val MAP_ANONYMOUS: CInt = MAP_ANON
public const val CPU_STATE_USER: CInt = 0
public const val CPU_STATE_SYSTEM: CInt = 1
public const val CPU_STATE_IDLE: CInt = 2
public const val CPU_STATE_NICE: CInt = 3
public const val CPU_STATE_MAX: CInt = 4
public const val PROCESSOR_BASIC_INFO: CInt = 1
public const val PROCESSOR_CPU_LOAD_INFO: CInt = 2
public const val PROCESSOR_PM_REGS_INFO: CInt = 0x10000001
public const val PROCESSOR_TEMPERATURE: CInt = 0x10000002
public const val PROCESSOR_SET_LOAD_INFO: CInt = 4
public const val PROCESSOR_SET_BASIC_INFO: CInt = 5
public const val VM_FLAGS_FIXED: CInt = 0x0000
public const val VM_FLAGS_ANYWHERE: CInt = 0x0001
public const val VM_FLAGS_PURGABLE: CInt = 0x0002
public const val VM_FLAGS_RANDOM_ADDR: CInt = 0x0008
public const val VM_FLAGS_NO_CACHE: CInt = 0x0010
public const val VM_FLAGS_RESILIENT_CODESIGN: CInt = 0x0020
public const val VM_FLAGS_RESILIENT_MEDIA: CInt = 0x0040
public const val VM_FLAGS_OVERWRITE: CInt = 0x4000
public const val VM_FLAGS_SUPERPAGE_MASK: CInt = 0x70000
public const val VM_FLAGS_RETURN_DATA_ADDR: CInt = 0x100000
public const val VM_FLAGS_RETURN_4K_DATA_ADDR: CInt = 0x800000
public const val VM_FLAGS_ALIAS_MASK: CInt = -16777216
public const val VM_FLAGS_USER_ALLOCATE: CInt = -16302049
public const val VM_FLAGS_USER_MAP: CInt = -6864865
public val VM_FLAGS_USER_REMAP: CInt = VM_FLAGS_FIXED or VM_FLAGS_ANYWHERE or VM_FLAGS_RANDOM_ADDR or VM_FLAGS_OVERWRITE or VM_FLAGS_RETURN_DATA_ADDR or VM_FLAGS_RESILIENT_CODESIGN
public const val VM_FLAGS_SUPERPAGE_SHIFT: CInt = 16
public const val SUPERPAGE_NONE: CInt = 0
public const val SUPERPAGE_SIZE_ANY: CInt = 1
public val VM_FLAGS_SUPERPAGE_NONE: CInt = SUPERPAGE_NONE shl VM_FLAGS_SUPERPAGE_SHIFT
public val VM_FLAGS_SUPERPAGE_SIZE_ANY: CInt = SUPERPAGE_SIZE_ANY shl VM_FLAGS_SUPERPAGE_SHIFT
public const val SUPERPAGE_SIZE_2MB: CInt = 2
public val VM_FLAGS_SUPERPAGE_SIZE_2MB: CInt = SUPERPAGE_SIZE_2MB shl VM_FLAGS_SUPERPAGE_SHIFT
public const val VM_MEMORY_MALLOC: CInt = 1
public const val VM_MEMORY_MALLOC_SMALL: CInt = 2
public const val VM_MEMORY_MALLOC_LARGE: CInt = 3
public const val VM_MEMORY_MALLOC_HUGE: CInt = 4
public const val VM_MEMORY_SBRK: CInt = 5
public const val VM_MEMORY_REALLOC: CInt = 6
public const val VM_MEMORY_MALLOC_TINY: CInt = 7
public const val VM_MEMORY_MALLOC_LARGE_REUSABLE: CInt = 8
public const val VM_MEMORY_MALLOC_LARGE_REUSED: CInt = 9
public const val VM_MEMORY_ANALYSIS_TOOL: CInt = 10
public const val VM_MEMORY_MALLOC_NANO: CInt = 11
public const val VM_MEMORY_MACH_MSG: CInt = 20
public const val VM_MEMORY_IOKIT: CInt = 21
public const val VM_MEMORY_STACK: CInt = 30
public const val VM_MEMORY_GUARD: CInt = 31
public const val VM_MEMORY_SHARED_PMAP: CInt = 32
public const val VM_MEMORY_DYLIB: CInt = 33
public const val VM_MEMORY_OBJC_DISPATCHERS: CInt = 34
public const val VM_MEMORY_UNSHARED_PMAP: CInt = 35
public const val VM_MEMORY_APPKIT: CInt = 40
public const val VM_MEMORY_FOUNDATION: CInt = 41
public const val VM_MEMORY_COREGRAPHICS: CInt = 42
public const val VM_MEMORY_CORESERVICES: CInt = 43
public const val VM_MEMORY_CARBON: CInt = VM_MEMORY_CORESERVICES
public const val VM_MEMORY_JAVA: CInt = 44
public const val VM_MEMORY_COREDATA: CInt = 45
public const val VM_MEMORY_COREDATA_OBJECTIDS: CInt = 46
public const val VM_MEMORY_ATS: CInt = 50
public const val VM_MEMORY_LAYERKIT: CInt = 51
public const val VM_MEMORY_CGIMAGE: CInt = 52
public const val VM_MEMORY_TCMALLOC: CInt = 53
public const val VM_MEMORY_COREGRAPHICS_DATA: CInt = 54
public const val VM_MEMORY_COREGRAPHICS_SHARED: CInt = 55
public const val VM_MEMORY_COREGRAPHICS_FRAMEBUFFERS: CInt = 56
public const val VM_MEMORY_COREGRAPHICS_BACKINGSTORES: CInt = 57
public const val VM_MEMORY_COREGRAPHICS_XALLOC: CInt = 58
public const val VM_MEMORY_COREGRAPHICS_MISC: CInt = VM_MEMORY_COREGRAPHICS
public const val VM_MEMORY_DYLD: CInt = 60
public const val VM_MEMORY_DYLD_MALLOC: CInt = 61
public const val VM_MEMORY_SQLITE: CInt = 62
public const val VM_MEMORY_JAVASCRIPT_CORE: CInt = 63
public const val VM_MEMORY_JAVASCRIPT_JIT_EXECUTABLE_ALLOCATOR: CInt = 64
public const val VM_MEMORY_JAVASCRIPT_JIT_REGISTER_FILE: CInt = 65
public const val VM_MEMORY_GLSL: CInt = 66
public const val VM_MEMORY_OPENCL: CInt = 67
public const val VM_MEMORY_COREIMAGE: CInt = 68
public const val VM_MEMORY_WEBCORE_PURGEABLE_BUFFERS: CInt = 69
public const val VM_MEMORY_IMAGEIO: CInt = 70
public const val VM_MEMORY_COREPROFILE: CInt = 71
public const val VM_MEMORY_ASSETSD: CInt = 72
public const val VM_MEMORY_OS_ALLOC_ONCE: CInt = 73
public const val VM_MEMORY_LIBDISPATCH: CInt = 74
public const val VM_MEMORY_ACCELERATE: CInt = 75
public const val VM_MEMORY_COREUI: CInt = 76
public const val VM_MEMORY_COREUIFILE: CInt = 77
public const val VM_MEMORY_GENEALOGY: CInt = 78
public const val VM_MEMORY_RAWCAMERA: CInt = 79
public const val VM_MEMORY_CORPSEINFO: CInt = 80
public const val VM_MEMORY_ASL: CInt = 81
public const val VM_MEMORY_SWIFT_RUNTIME: CInt = 82
public const val VM_MEMORY_SWIFT_METADATA: CInt = 83
public const val VM_MEMORY_DHMM: CInt = 84
public const val VM_MEMORY_SCENEKIT: CInt = 86
public const val VM_MEMORY_SKYWALK: CInt = 87
public const val VM_MEMORY_APPLICATION_SPECIFIC_1: CInt = 240
public const val VM_MEMORY_APPLICATION_SPECIFIC_16: CInt = 255
public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val MS_ASYNC: CInt = 0x0001
public const val MS_INVALIDATE: CInt = 0x0002
public const val MS_SYNC: CInt = 0x0010
public const val MS_KILLPAGES: CInt = 0x0004
public const val MS_DEACTIVATE: CInt = 0x0008
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
public const val EDEADLK: CInt = 11
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
public const val EAGAIN: CInt = 35
public const val EWOULDBLOCK: CInt = EAGAIN
public const val EINPROGRESS: CInt = 36
public const val EALREADY: CInt = 37
public const val ENOTSOCK: CInt = 38
public const val EDESTADDRREQ: CInt = 39
public const val EMSGSIZE: CInt = 40
public const val EPROTOTYPE: CInt = 41
public const val ENOPROTOOPT: CInt = 42
public const val EPROTONOSUPPORT: CInt = 43
public const val ESOCKTNOSUPPORT: CInt = 44
public const val ENOTSUP: CInt = 45
public const val EPFNOSUPPORT: CInt = 46
public const val EAFNOSUPPORT: CInt = 47
public const val EADDRINUSE: CInt = 48
public const val EADDRNOTAVAIL: CInt = 49
public const val ENETDOWN: CInt = 50
public const val ENETUNREACH: CInt = 51
public const val ENETRESET: CInt = 52
public const val ECONNABORTED: CInt = 53
public const val ECONNRESET: CInt = 54
public const val ENOBUFS: CInt = 55
public const val EISCONN: CInt = 56
public const val ENOTCONN: CInt = 57
public const val ESHUTDOWN: CInt = 58
public const val ETOOMANYREFS: CInt = 59
public const val ETIMEDOUT: CInt = 60
public const val ECONNREFUSED: CInt = 61
public const val ELOOP: CInt = 62
public const val ENAMETOOLONG: CInt = 63
public const val EHOSTDOWN: CInt = 64
public const val EHOSTUNREACH: CInt = 65
public const val ENOTEMPTY: CInt = 66
public const val EPROCLIM: CInt = 67
public const val EUSERS: CInt = 68
public const val EDQUOT: CInt = 69
public const val ESTALE: CInt = 70
public const val EREMOTE: CInt = 71
public const val EBADRPC: CInt = 72
public const val ERPCMISMATCH: CInt = 73
public const val EPROGUNAVAIL: CInt = 74
public const val EPROGMISMATCH: CInt = 75
public const val EPROCUNAVAIL: CInt = 76
public const val ENOLCK: CInt = 77
public const val ENOSYS: CInt = 78
public const val EFTYPE: CInt = 79
public const val EAUTH: CInt = 80
public const val ENEEDAUTH: CInt = 81
public const val EPWROFF: CInt = 82
public const val EDEVERR: CInt = 83
public const val EOVERFLOW: CInt = 84
public const val EBADEXEC: CInt = 85
public const val EBADARCH: CInt = 86
public const val ESHLIBVERS: CInt = 87
public const val EBADMACHO: CInt = 88
public const val ECANCELED: CInt = 89
public const val EIDRM: CInt = 90
public const val ENOMSG: CInt = 91
public const val EILSEQ: CInt = 92
public const val ENOATTR: CInt = 93
public const val EBADMSG: CInt = 94
public const val EMULTIHOP: CInt = 95
public const val ENODATA: CInt = 96
public const val ENOLINK: CInt = 97
public const val ENOSR: CInt = 98
public const val ENOSTR: CInt = 99
public const val EPROTO: CInt = 100
public const val ETIME: CInt = 101
public const val EOPNOTSUPP: CInt = 102
public const val ENOPOLICY: CInt = 103
public const val ENOTRECOVERABLE: CInt = 104
public const val EOWNERDEAD: CInt = 105
public const val EQFULL: CInt = 106
public const val ELAST: CInt = 106
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
public const val F_DUPFD: CInt = 0
public const val F_DUPFD_CLOEXEC: CInt = 67
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val F_PREALLOCATE: CInt = 42
public const val F_RDADVISE: CInt = 44
public const val F_RDAHEAD: CInt = 45
public const val F_NOCACHE: CInt = 48
public const val F_LOG2PHYS: CInt = 49
public const val F_GETPATH: CInt = 50
public const val F_FULLFSYNC: CInt = 51
public const val F_FREEZE_FS: CInt = 53
public const val F_THAW_FS: CInt = 54
public const val F_GLOBAL_NOCACHE: CInt = 55
public const val F_NODIRECT: CInt = 62
public const val F_LOG2PHYS_EXT: CInt = 65
public const val F_BARRIERFSYNC: CInt = 85
public const val F_OFD_SETLK: CInt = 90
public const val F_OFD_SETLKW: CInt = 91
public const val F_OFD_GETLK: CInt = 92
public const val F_PUNCHHOLE: CInt = 99
public const val F_TRIM_ACTIVE_FILE: CInt = 100
public const val F_SPECULATIVE_READ: CInt = 101
public const val F_GETPATH_NOFIRMLINK: CInt = 102
public const val F_TRANSFEREXTENTS: CInt = 110
public const val F_ALLOCATECONTIG: CUInt = 0x02u
public const val F_ALLOCATEALL: CUInt = 0x04u
public const val F_ALLOCATEPERSIST: CUInt = 0x08u
public const val F_PEOFPOSMODE: CInt = 3
public const val F_VOLPOSMODE: CInt = 4
public const val AT_FDCWD: CInt = -2
public const val AT_EACCESS: CInt = 0x0010
public const val AT_SYMLINK_NOFOLLOW: CInt = 0x0020
public const val AT_SYMLINK_FOLLOW: CInt = 0x0040
public const val AT_REMOVEDIR: CInt = 0x0080
public const val TIOCMODG: CULong = 0x40047403uL
public const val TIOCMODS: CULong = 0x80047404uL
public const val TIOCM_LE: CInt = 0x1
public const val TIOCM_DTR: CInt = 0x2
public const val TIOCM_RTS: CInt = 0x4
public const val TIOCM_ST: CInt = 0x8
public const val TIOCM_SR: CInt = 0x10
public const val TIOCM_CTS: CInt = 0x20
public const val TIOCM_CAR: CInt = 0x40
public const val TIOCM_CD: CInt = 0x40
public const val TIOCM_RNG: CInt = 0x80
public const val TIOCM_RI: CInt = 0x80
public const val TIOCM_DSR: CInt = 0x100
public const val TIOCEXCL: CInt = 0x2000740d
public const val TIOCNXCL: CInt = 0x2000740e
public const val TIOCFLUSH: CULong = 0x80047410uL
public const val TIOCGETD: CULong = 0x4004741auL
public const val TIOCSETD: CULong = 0x8004741buL
public const val TIOCIXON: CUInt = 0x20007481u
public const val TIOCIXOFF: CUInt = 0x20007480u
public const val TIOCSDTR: CUInt = 0x20007479u
public const val TIOCCDTR: CUInt = 0x20007478u
public const val TIOCGPGRP: CULong = 0x40047477uL
public const val TIOCSPGRP: CULong = 0x80047476uL
public const val TIOCOUTQ: CULong = 0x40047473uL
public const val TIOCSTI: CULong = 0x80017472uL
public const val TIOCNOTTY: CUInt = 0x20007471u
public const val TIOCPKT: CULong = 0x80047470uL
public const val TIOCPKT_DATA: CInt = 0x0
public const val TIOCPKT_FLUSHREAD: CInt = 0x1
public const val TIOCPKT_FLUSHWRITE: CInt = 0x2
public const val TIOCPKT_STOP: CInt = 0x4
public const val TIOCPKT_START: CInt = 0x8
public const val TIOCPKT_NOSTOP: CInt = 0x10
public const val TIOCPKT_DOSTOP: CInt = 0x20
public const val TIOCPKT_IOCTL: CInt = 0x40
public const val TIOCSTOP: CUInt = 0x2000746fu
public const val TIOCSTART: CUInt = 0x2000746eu
public const val TIOCMSET: CULong = 0x8004746duL
public const val TIOCMBIS: CULong = 0x8004746cuL
public const val TIOCMBIC: CULong = 0x8004746buL
public const val TIOCMGET: CULong = 0x4004746auL
public const val TIOCREMOTE: CULong = 0x80047469uL
public const val TIOCGWINSZ: CULong = 0x40087468uL
public const val TIOCSWINSZ: CULong = 0x80087467uL
public const val TIOCUCNTL: CULong = 0x80047466uL
public const val TIOCSTAT: CUInt = 0x20007465u
public const val TIOCSCONS: CUInt = 0x20007463u
public const val TIOCCONS: CULong = 0x80047462uL
public const val TIOCSCTTY: CUInt = 0x20007461u
public const val TIOCEXT: CULong = 0x80047460uL
public const val TIOCSIG: CUInt = 0x2000745fu
public const val TIOCDRAIN: CUInt = 0x2000745eu
public const val TIOCMSDTRWAIT: CULong = 0x8004745buL
public const val TIOCMGDTRWAIT: CULong = 0x4004745auL
public const val TIOCSDRAINWAIT: CULong = 0x80047457uL
public const val TIOCGDRAINWAIT: CULong = 0x40047456uL
public const val TIOCDSIMICROCODE: CUInt = 0x20007455u
public const val TIOCPTYGRANT: CUInt = 0x20007454u
public const val TIOCPTYGNAME: CUInt = 0x40807453u
public const val TIOCPTYUNLK: CUInt = 0x20007452u
public const val TIOCGETA: CULong = 0x40487413uL
public const val TIOCSETA: CULong = 0x80487414uL
public const val TIOCSETAW: CULong = 0x80487415uL
public const val TIOCSETAF: CULong = 0x80487416uL
public const val BIOCGRSIG: CULong = 0x40044272uL
public const val BIOCSRSIG: CULong = 0x80044273uL
public const val BIOCSDLT: CULong = 0x80044278uL
public const val BIOCGSEESENT: CULong = 0x40044276uL
public const val BIOCSSEESENT: CULong = 0x80044277uL
public const val BIOCGDLTLIST: CULong = 0xc00c4279uL
public const val FIODTYPE: CULong = 0x4004667auL
public const val B0: SpeedT = 0u
public const val B50: SpeedT = 50u
public const val B75: SpeedT = 75u
public const val B110: SpeedT = 110u
public const val B134: SpeedT = 134u
public const val B150: SpeedT = 150u
public const val B200: SpeedT = 200u
public const val B300: SpeedT = 300u
public const val B600: SpeedT = 600u
public const val B1200: SpeedT = 1200u
public const val B1800: SpeedT = 1800u
public const val B2400: SpeedT = 2400u
public const val B4800: SpeedT = 4800u
public const val B9600: SpeedT = 9600u
public const val B19200: SpeedT = 19200u
public const val B38400: SpeedT = 38400u
public const val B7200: SpeedT = 7200u
public const val B14400: SpeedT = 14400u
public const val B28800: SpeedT = 28800u
public const val B57600: SpeedT = 57600u
public const val B76800: SpeedT = 76800u
public const val B115200: SpeedT = 115200u
public const val B230400: SpeedT = 230400u
public const val EXTA: SpeedT = 19200u
public const val EXTB: SpeedT = 38400u
public const val SIGTRAP: CInt = 5
public const val GLOB_APPEND: CInt = 0x0001
public const val GLOB_DOOFFS: CInt = 0x0002
public const val GLOB_ERR: CInt = 0x0004
public const val GLOB_MARK: CInt = 0x0008
public const val GLOB_NOCHECK: CInt = 0x0010
public const val GLOB_NOSORT: CInt = 0x0020
public const val GLOB_NOESCAPE: CInt = 0x2000
public const val GLOB_NOSPACE: CInt = -1
public const val GLOB_ABORTED: CInt = -2
public const val GLOB_NOMATCH: CInt = -3
public const val POSIX_MADV_NORMAL: CInt = 0
public const val POSIX_MADV_RANDOM: CInt = 1
public const val POSIX_MADV_SEQUENTIAL: CInt = 2
public const val POSIX_MADV_WILLNEED: CInt = 3
public const val POSIX_MADV_DONTNEED: CInt = 4
public const val _SC_IOV_MAX: CInt = 56
public const val _SC_GETGR_R_SIZE_MAX: CInt = 70
public const val _SC_GETPW_R_SIZE_MAX: CInt = 71
public const val _SC_LOGIN_NAME_MAX: CInt = 73
public const val _SC_MQ_PRIO_MAX: CInt = 75
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 82
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 83
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 85
public const val _SC_THREAD_KEYS_MAX: CInt = 86
public const val _SC_THREAD_PRIO_INHERIT: CInt = 87
public const val _SC_THREAD_PRIO_PROTECT: CInt = 88
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 89
public const val _SC_THREAD_PROCESS_SHARED: CInt = 90
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 91
public const val _SC_THREAD_STACK_MIN: CInt = 93
public const val _SC_THREAD_THREADS_MAX: CInt = 94
public const val _SC_THREADS: CInt = 96
public const val _SC_TTY_NAME_MAX: CInt = 101
public const val _SC_ATEXIT_MAX: CInt = 107
public const val _SC_XOPEN_CRYPT: CInt = 108
public const val _SC_XOPEN_ENH_I18N: CInt = 109
public const val _SC_XOPEN_LEGACY: CInt = 110
public const val _SC_XOPEN_REALTIME: CInt = 111
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 112
public const val _SC_XOPEN_SHM: CInt = 113
public const val _SC_XOPEN_UNIX: CInt = 115
public const val _SC_XOPEN_VERSION: CInt = 116
public const val _SC_XOPEN_XCU_VERSION: CInt = 121
public const val _SC_PHYS_PAGES: CInt = 200
public const val PTHREAD_STACK_MIN: ULong = 16384uL
public const val RLIMIT_CPU: CInt = 0
public const val RLIMIT_FSIZE: CInt = 1
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_STACK: CInt = 3
public const val RLIMIT_CORE: CInt = 4
public const val RLIMIT_AS: CInt = 5
public const val RLIMIT_RSS: CInt = RLIMIT_AS
public const val RLIMIT_MEMLOCK: CInt = 6
public const val RLIMIT_NPROC: CInt = 7
public const val RLIMIT_NOFILE: CInt = 8
public const val RLIM_NLIMITS: CInt = 9
public const val _RLIMIT_POSIX_FLAG: CInt = 0x1000
public const val RLIM_INFINITY: RlimT = 0x7fff_ffff_ffff_ffff
public const val RUSAGE_SELF: CInt = 0
public const val RUSAGE_CHILDREN: CInt = -1
public const val MADV_NORMAL: CInt = 0
public const val MADV_RANDOM: CInt = 1
public const val MADV_SEQUENTIAL: CInt = 2
public const val MADV_WILLNEED: CInt = 3
public const val MADV_DONTNEED: CInt = 4
public const val MADV_FREE: CInt = 5
public const val MADV_ZERO_WIRED_PAGES: CInt = 6
public const val MADV_FREE_REUSABLE: CInt = 7
public const val MADV_FREE_REUSE: CInt = 8
public const val MADV_CAN_REUSE: CInt = 9
public const val MADV_ZERO: CInt = 11
public const val MINCORE_INCORE: CInt = 0x1
public const val MINCORE_REFERENCED: CInt = 0x2
public const val MINCORE_MODIFIED: CInt = 0x4
public const val MINCORE_REFERENCED_OTHER: CInt = 0x8
public const val MINCORE_MODIFIED_OTHER: CInt = 0x10
public const val CTLIOCGINFO: CULong = 0xc0644e03uL
public const val IPPROTO_HOPOPTS: CInt = 0
public const val IPPROTO_IGMP: CInt = 2
public const val IPPROTO_GGP: CInt = 3
public const val IPPROTO_IPIP: CInt = 4
public const val IPPROTO_ST: CInt = 7
public const val IPPROTO_EGP: CInt = 8
public const val IPPROTO_PIGP: CInt = 9
public const val IPPROTO_RCCMON: CInt = 10
public const val IPPROTO_NVPII: CInt = 11
public const val IPPROTO_PUP: CInt = 12
public const val IPPROTO_ARGUS: CInt = 13
public const val IPPROTO_EMCON: CInt = 14
public const val IPPROTO_XNET: CInt = 15
public const val IPPROTO_CHAOS: CInt = 16
public const val IPPROTO_MUX: CInt = 18
public const val IPPROTO_MEAS: CInt = 19
public const val IPPROTO_HMP: CInt = 20
public const val IPPROTO_PRM: CInt = 21
public const val IPPROTO_IDP: CInt = 22
public const val IPPROTO_TRUNK1: CInt = 23
public const val IPPROTO_TRUNK2: CInt = 24
public const val IPPROTO_LEAF1: CInt = 25
public const val IPPROTO_LEAF2: CInt = 26
public const val IPPROTO_RDP: CInt = 27
public const val IPPROTO_IRTP: CInt = 28
public const val IPPROTO_TP: CInt = 29
public const val IPPROTO_BLT: CInt = 30
public const val IPPROTO_NSP: CInt = 31
public const val IPPROTO_INP: CInt = 32
public const val IPPROTO_SEP: CInt = 33
public const val IPPROTO_3PC: CInt = 34
public const val IPPROTO_IDPR: CInt = 35
public const val IPPROTO_XTP: CInt = 36
public const val IPPROTO_DDP: CInt = 37
public const val IPPROTO_CMTP: CInt = 38
public const val IPPROTO_TPXX: CInt = 39
public const val IPPROTO_IL: CInt = 40
public const val IPPROTO_SDRP: CInt = 42
public const val IPPROTO_ROUTING: CInt = 43
public const val IPPROTO_FRAGMENT: CInt = 44
public const val IPPROTO_IDRP: CInt = 45
public const val IPPROTO_RSVP: CInt = 46
public const val IPPROTO_GRE: CInt = 47
public const val IPPROTO_MHRP: CInt = 48
public const val IPPROTO_BHA: CInt = 49
public const val IPPROTO_ESP: CInt = 50
public const val IPPROTO_AH: CInt = 51
public const val IPPROTO_INLSP: CInt = 52
public const val IPPROTO_SWIPE: CInt = 53
public const val IPPROTO_NHRP: CInt = 54
public const val IPPROTO_NONE: CInt = 59
public const val IPPROTO_DSTOPTS: CInt = 60
public const val IPPROTO_AHIP: CInt = 61
public const val IPPROTO_CFTP: CInt = 62
public const val IPPROTO_HELLO: CInt = 63
public const val IPPROTO_SATEXPAK: CInt = 64
public const val IPPROTO_KRYPTOLAN: CInt = 65
public const val IPPROTO_RVD: CInt = 66
public const val IPPROTO_IPPC: CInt = 67
public const val IPPROTO_ADFS: CInt = 68
public const val IPPROTO_SATMON: CInt = 69
public const val IPPROTO_VISA: CInt = 70
public const val IPPROTO_IPCV: CInt = 71
public const val IPPROTO_CPNX: CInt = 72
public const val IPPROTO_CPHB: CInt = 73
public const val IPPROTO_WSN: CInt = 74
public const val IPPROTO_PVP: CInt = 75
public const val IPPROTO_BRSATMON: CInt = 76
public const val IPPROTO_ND: CInt = 77
public const val IPPROTO_WBMON: CInt = 78
public const val IPPROTO_WBEXPAK: CInt = 79
public const val IPPROTO_EON: CInt = 80
public const val IPPROTO_VMTP: CInt = 81
public const val IPPROTO_SVMTP: CInt = 82
public const val IPPROTO_VINES: CInt = 83
public const val IPPROTO_TTP: CInt = 84
public const val IPPROTO_IGP: CInt = 85
public const val IPPROTO_DGP: CInt = 86
public const val IPPROTO_TCF: CInt = 87
public const val IPPROTO_IGRP: CInt = 88
public const val IPPROTO_OSPFIGP: CInt = 89
public const val IPPROTO_SRPC: CInt = 90
public const val IPPROTO_LARP: CInt = 91
public const val IPPROTO_MTP: CInt = 92
public const val IPPROTO_AX25: CInt = 93
public const val IPPROTO_IPEIP: CInt = 94
public const val IPPROTO_MICP: CInt = 95
public const val IPPROTO_SCCSP: CInt = 96
public const val IPPROTO_ETHERIP: CInt = 97
public const val IPPROTO_ENCAP: CInt = 98
public const val IPPROTO_APES: CInt = 99
public const val IPPROTO_GMTP: CInt = 100
public const val IPPROTO_PIM: CInt = 103
public const val IPPROTO_IPCOMP: CInt = 108
public const val IPPROTO_PGM: CInt = 113
public const val IPPROTO_SCTP: CInt = 132
public const val IPPROTO_DIVERT: CInt = 254
public const val IPPROTO_RAW: CInt = 255
public const val IPPROTO_MAX: CInt = 256
public const val IPPROTO_DONE: CInt = 257
public const val AF_UNSPEC: CInt = 0
public const val AF_LOCAL: CInt = 1
public const val AF_UNIX: CInt = AF_LOCAL
public const val AF_INET: CInt = 2
public const val AF_IMPLINK: CInt = 3
public const val AF_PUP: CInt = 4
public const val AF_CHAOS: CInt = 5
public const val AF_NS: CInt = 6
public const val AF_ISO: CInt = 7
public const val AF_OSI: CInt = AF_ISO
public const val AF_ECMA: CInt = 8
public const val AF_DATAKIT: CInt = 9
public const val AF_CCITT: CInt = 10
public const val AF_SNA: CInt = 11
public const val AF_DECnet: CInt = 12
public const val AF_DLI: CInt = 13
public const val AF_LAT: CInt = 14
public const val AF_HYLINK: CInt = 15
public const val AF_APPLETALK: CInt = 16
public const val AF_ROUTE: CInt = 17
public const val AF_LINK: CInt = 18
public const val pseudo_AF_XTP: CInt = 19
public const val AF_COIP: CInt = 20
public const val AF_CNT: CInt = 21
public const val pseudo_AF_RTIP: CInt = 22
public const val AF_IPX: CInt = 23
public const val AF_SIP: CInt = 24
public const val pseudo_AF_PIP: CInt = 25
public const val AF_NDRV: CInt = 27
public const val AF_ISDN: CInt = 28
public const val AF_E164: CInt = AF_ISDN
public const val pseudo_AF_KEY: CInt = 29
public const val AF_INET6: CInt = 30
public const val AF_NATM: CInt = 31
public const val AF_SYSTEM: CInt = 32
public const val AF_NETBIOS: CInt = 33
public const val AF_PPP: CInt = 34
public const val pseudo_AF_HDRCMPLT: CInt = 35
public const val AF_IEEE80211: CInt = 37
public const val AF_UTUN: CInt = 38
public const val AF_VSOCK: CInt = 40
public const val AF_SYS_CONTROL: CInt = 2
public const val SYSPROTO_EVENT: CInt = 1
public const val SYSPROTO_CONTROL: CInt = 2
public const val PF_UNSPEC: CInt = AF_UNSPEC
public const val PF_LOCAL: CInt = AF_LOCAL
public const val PF_UNIX: CInt = PF_LOCAL
public const val PF_INET: CInt = AF_INET
public const val PF_IMPLINK: CInt = AF_IMPLINK
public const val PF_PUP: CInt = AF_PUP
public const val PF_CHAOS: CInt = AF_CHAOS
public const val PF_NS: CInt = AF_NS
public const val PF_ISO: CInt = AF_ISO
public const val PF_OSI: CInt = AF_ISO
public const val PF_ECMA: CInt = AF_ECMA
public const val PF_DATAKIT: CInt = AF_DATAKIT
public const val PF_CCITT: CInt = AF_CCITT
public const val PF_SNA: CInt = AF_SNA
public const val PF_DECnet: CInt = AF_DECnet
public const val PF_DLI: CInt = AF_DLI
public const val PF_LAT: CInt = AF_LAT
public const val PF_HYLINK: CInt = AF_HYLINK
public const val PF_APPLETALK: CInt = AF_APPLETALK
public const val PF_ROUTE: CInt = AF_ROUTE
public const val PF_LINK: CInt = AF_LINK
public const val PF_XTP: CInt = pseudo_AF_XTP
public const val PF_COIP: CInt = AF_COIP
public const val PF_CNT: CInt = AF_CNT
public const val PF_SIP: CInt = AF_SIP
public const val PF_IPX: CInt = AF_IPX
public const val PF_RTIP: CInt = pseudo_AF_RTIP
public const val PF_PIP: CInt = pseudo_AF_PIP
public const val PF_NDRV: CInt = AF_NDRV
public const val PF_ISDN: CInt = AF_ISDN
public const val PF_KEY: CInt = pseudo_AF_KEY
public const val PF_INET6: CInt = AF_INET6
public const val PF_NATM: CInt = AF_NATM
public const val PF_SYSTEM: CInt = AF_SYSTEM
public const val PF_NETBIOS: CInt = AF_NETBIOS
public const val PF_PPP: CInt = AF_PPP
public const val PF_VSOCK: CInt = AF_VSOCK
public const val NET_RT_DUMP: CInt = 1
public const val NET_RT_FLAGS: CInt = 2
public const val NET_RT_IFLIST: CInt = 3
public const val SOMAXCONN: CInt = 128
public const val SOCK_MAXADDRLEN: CInt = 255
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_RAW: CInt = 3
public const val SOCK_RDM: CInt = 4
public const val SOCK_SEQPACKET: CInt = 5
public const val IP_TTL: CInt = 4
public const val IP_HDRINCL: CInt = 2
public const val IP_RECVDSTADDR: CInt = 7
public const val IP_ADD_MEMBERSHIP: CInt = 12
public const val IP_DROP_MEMBERSHIP: CInt = 13
public const val IP_RECVIF: CInt = 20
public const val IP_RECVTTL: CInt = 24
public const val IP_BOUND_IF: CInt = 25
public const val IP_PKTINFO: CInt = 26
public const val IP_RECVTOS: CInt = 27
public const val IP_DONTFRAG: CInt = 28
public const val IPV6_JOIN_GROUP: CInt = 12
public const val IPV6_LEAVE_GROUP: CInt = 13
public const val IPV6_CHECKSUM: CInt = 26
public const val IPV6_RECVTCLASS: CInt = 35
public const val IPV6_TCLASS: CInt = 36
public const val IPV6_RECVHOPLIMIT: CInt = 37
public const val IPV6_PKTINFO: CInt = 46
public const val IPV6_HOPLIMIT: CInt = 47
public const val IPV6_RECVPKTINFO: CInt = 61
public const val IP_ADD_SOURCE_MEMBERSHIP: CInt = 70
public const val IP_DROP_SOURCE_MEMBERSHIP: CInt = 71
public const val IP_BLOCK_SOURCE: CInt = 72
public const val IP_UNBLOCK_SOURCE: CInt = 73
public const val IPV6_BOUND_IF: CInt = 125
public const val TCP_NOPUSH: CInt = 4
public const val TCP_NOOPT: CInt = 8
public const val TCP_KEEPALIVE: CInt = 0x10
public const val TCP_KEEPINTVL: CInt = 0x101
public const val TCP_KEEPCNT: CInt = 0x102
public const val TCP_FASTOPEN: CInt = 0x105
public const val TCP_CONNECTION_INFO: CInt = 0x106
public const val SOL_LOCAL: CInt = 0
public const val LOCAL_PEERCRED: CInt = 0x001
public const val LOCAL_PEERPID: CInt = 0x002
public const val LOCAL_PEEREPID: CInt = 0x003
public const val LOCAL_PEERUUID: CInt = 0x004
public const val LOCAL_PEEREUUID: CInt = 0x005
public const val LOCAL_PEERTOKEN: CInt = 0x006
public const val SOL_SOCKET: CInt = 0xffff
public const val SO_DEBUG: CInt = 0x01
public const val SO_ACCEPTCONN: CInt = 0x0002
public const val SO_REUSEADDR: CInt = 0x0004
public const val SO_KEEPALIVE: CInt = 0x0008
public const val SO_DONTROUTE: CInt = 0x0010
public const val SO_BROADCAST: CInt = 0x0020
public const val SO_USELOOPBACK: CInt = 0x0040
public const val SO_LINGER: CInt = 0x0080
public const val SO_OOBINLINE: CInt = 0x0100
public const val SO_REUSEPORT: CInt = 0x0200
public const val SO_TIMESTAMP: CInt = 0x0400
public const val SO_TIMESTAMP_MONOTONIC: CInt = 0x0800
public const val SO_DONTTRUNC: CInt = 0x2000
public const val SO_WANTMORE: CInt = 0x4000
public const val SO_WANTOOBFLAG: CInt = 0x8000
public const val SO_SNDBUF: CInt = 0x1001
public const val SO_RCVBUF: CInt = 0x1002
public const val SO_SNDLOWAT: CInt = 0x1003
public const val SO_RCVLOWAT: CInt = 0x1004
public const val SO_SNDTIMEO: CInt = 0x1005
public const val SO_RCVTIMEO: CInt = 0x1006
public const val SO_ERROR: CInt = 0x1007
public const val SO_TYPE: CInt = 0x1008
public const val SO_LABEL: CInt = 0x1010
public const val SO_PEERLABEL: CInt = 0x1011
public const val SO_NREAD: CInt = 0x1020
public const val SO_NKE: CInt = 0x1021
public const val SO_NOSIGPIPE: CInt = 0x1022
public const val SO_NOADDRERR: CInt = 0x1023
public const val SO_NWRITE: CInt = 0x1024
public const val SO_REUSESHAREUID: CInt = 0x1025
public const val SO_NOTIFYCONFLICT: CInt = 0x1026
public const val SO_LINGER_SEC: CInt = 0x1080
public const val SO_RANDOMPORT: CInt = 0x1082
public const val SO_NP_EXTENSIONS: CInt = 0x1083
public const val MSG_OOB: CInt = 0x1
public const val MSG_PEEK: CInt = 0x2
public const val MSG_DONTROUTE: CInt = 0x4
public const val MSG_EOR: CInt = 0x8
public const val MSG_TRUNC: CInt = 0x10
public const val MSG_CTRUNC: CInt = 0x20
public const val MSG_WAITALL: CInt = 0x40
public const val MSG_DONTWAIT: CInt = 0x80
public const val MSG_EOF: CInt = 0x100
public const val MSG_FLUSH: CInt = 0x400
public const val MSG_HOLD: CInt = 0x800
public const val MSG_SEND: CInt = 0x1000
public const val MSG_HAVEMORE: CInt = 0x2000
public const val MSG_RCVMORE: CInt = 0x4000
public const val MSG_NEEDSA: CInt = 0x10000
public const val MSG_NOSIGNAL: CInt = 0x80000
public const val SCM_TIMESTAMP: CInt = 0x02
public const val SCM_CREDS: CInt = 0x03
public const val IFF_UP: CInt = 0x1
public const val IFF_BROADCAST: CInt = 0x2
public const val IFF_DEBUG: CInt = 0x4
public const val IFF_LOOPBACK: CInt = 0x8
public const val IFF_POINTOPOINT: CInt = 0x10
public const val IFF_NOTRAILERS: CInt = 0x20
public const val IFF_RUNNING: CInt = 0x40
public const val IFF_NOARP: CInt = 0x80
public const val IFF_PROMISC: CInt = 0x100
public const val IFF_ALLMULTI: CInt = 0x200
public const val IFF_OACTIVE: CInt = 0x400
public const val IFF_SIMPLEX: CInt = 0x800
public const val IFF_LINK0: CInt = 0x1000
public const val IFF_LINK1: CInt = 0x2000
public const val IFF_LINK2: CInt = 0x4000
public const val IFF_ALTPHYS: CInt = IFF_LINK2
public const val IFF_MULTICAST: CInt = 0x8000
public const val SCOPE6_ID_MAX: ULong = 16uL
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val SAE_ASSOCID_ANY: SaeAssocidT = 0u
public const val SAE_ASSOCID_ALL: SaeAssocidT = 0xffffffffu
public const val SAE_CONNID_ANY: SaeConnidT = 0u
public const val SAE_CONNID_ALL: SaeConnidT = 0xffffffffu
public const val CONNECT_RESUME_ON_READ_WRITE: CUInt = 0x1u
public const val CONNECT_DATA_IDEMPOTENT: CUInt = 0x2u
public const val CONNECT_DATA_AUTHENTICATED: CUInt = 0x4u
public const val LOCK_SH: CInt = 1
public const val LOCK_EX: CInt = 2
public const val LOCK_NB: CInt = 4
public const val LOCK_UN: CInt = 8
public const val MAP_COPY: CInt = 0x0002
public const val MAP_RENAME: CInt = 0x0020
public const val MAP_NORESERVE: CInt = 0x0040
public const val MAP_NOEXTEND: CInt = 0x0100
public const val MAP_HASSEMAPHORE: CInt = 0x0200
public const val MAP_NOCACHE: CInt = 0x0400
public const val MAP_JIT: CInt = 0x0800
public const val _SC_ARG_MAX: CInt = 1
public const val _SC_CHILD_MAX: CInt = 2
public const val _SC_CLK_TCK: CInt = 3
public const val _SC_NGROUPS_MAX: CInt = 4
public const val _SC_OPEN_MAX: CInt = 5
public const val _SC_JOB_CONTROL: CInt = 6
public const val _SC_SAVED_IDS: CInt = 7
public const val _SC_VERSION: CInt = 8
public const val _SC_BC_BASE_MAX: CInt = 9
public const val _SC_BC_DIM_MAX: CInt = 10
public const val _SC_BC_SCALE_MAX: CInt = 11
public const val _SC_BC_STRING_MAX: CInt = 12
public const val _SC_COLL_WEIGHTS_MAX: CInt = 13
public const val _SC_EXPR_NEST_MAX: CInt = 14
public const val _SC_LINE_MAX: CInt = 15
public const val _SC_RE_DUP_MAX: CInt = 16
public const val _SC_2_VERSION: CInt = 17
public const val _SC_2_C_BIND: CInt = 18
public const val _SC_2_C_DEV: CInt = 19
public const val _SC_2_CHAR_TERM: CInt = 20
public const val _SC_2_FORT_DEV: CInt = 21
public const val _SC_2_FORT_RUN: CInt = 22
public const val _SC_2_LOCALEDEF: CInt = 23
public const val _SC_2_SW_DEV: CInt = 24
public const val _SC_2_UPE: CInt = 25
public const val _SC_STREAM_MAX: CInt = 26
public const val _SC_TZNAME_MAX: CInt = 27
public const val _SC_ASYNCHRONOUS_IO: CInt = 28
public const val _SC_PAGESIZE: CInt = 29
public const val _SC_MEMLOCK: CInt = 30
public const val _SC_MEMLOCK_RANGE: CInt = 31
public const val _SC_MEMORY_PROTECTION: CInt = 32
public const val _SC_MESSAGE_PASSING: CInt = 33
public const val _SC_PRIORITIZED_IO: CInt = 34
public const val _SC_PRIORITY_SCHEDULING: CInt = 35
public const val _SC_REALTIME_SIGNALS: CInt = 36
public const val _SC_SEMAPHORES: CInt = 37
public const val _SC_FSYNC: CInt = 38
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 39
public const val _SC_SYNCHRONIZED_IO: CInt = 40
public const val _SC_TIMERS: CInt = 41
public const val _SC_AIO_LISTIO_MAX: CInt = 42
public const val _SC_AIO_MAX: CInt = 43
public const val _SC_AIO_PRIO_DELTA_MAX: CInt = 44
public const val _SC_DELAYTIMER_MAX: CInt = 45
public const val _SC_MQ_OPEN_MAX: CInt = 46
public const val _SC_MAPPED_FILES: CInt = 47
public const val _SC_RTSIG_MAX: CInt = 48
public const val _SC_SEM_NSEMS_MAX: CInt = 49
public const val _SC_SEM_VALUE_MAX: CInt = 50
public const val _SC_SIGQUEUE_MAX: CInt = 51
public const val _SC_TIMER_MAX: CInt = 52
public const val _SC_NPROCESSORS_CONF: CInt = 57
public const val _SC_NPROCESSORS_ONLN: CInt = 58
public const val _SC_2_PBS: CInt = 59
public const val _SC_2_PBS_ACCOUNTING: CInt = 60
public const val _SC_2_PBS_CHECKPOINT: CInt = 61
public const val _SC_2_PBS_LOCATE: CInt = 62
public const val _SC_2_PBS_MESSAGE: CInt = 63
public const val _SC_2_PBS_TRACK: CInt = 64
public const val _SC_ADVISORY_INFO: CInt = 65
public const val _SC_BARRIERS: CInt = 66
public const val _SC_CLOCK_SELECTION: CInt = 67
public const val _SC_CPUTIME: CInt = 68
public const val _SC_FILE_LOCKING: CInt = 69
public const val _SC_HOST_NAME_MAX: CInt = 72
public const val _SC_MONOTONIC_CLOCK: CInt = 74
public const val _SC_READER_WRITER_LOCKS: CInt = 76
public const val _SC_REGEXP: CInt = 77
public const val _SC_SHELL: CInt = 78
public const val _SC_SPAWN: CInt = 79
public const val _SC_SPIN_LOCKS: CInt = 80
public const val _SC_SPORADIC_SERVER: CInt = 81
public const val _SC_THREAD_CPUTIME: CInt = 84
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 92
public const val _SC_TIMEOUTS: CInt = 95
public const val _SC_TRACE: CInt = 97
public const val _SC_TRACE_EVENT_FILTER: CInt = 98
public const val _SC_TRACE_INHERIT: CInt = 99
public const val _SC_TRACE_LOG: CInt = 100
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 102
public const val _SC_V6_ILP32_OFF32: CInt = 103
public const val _SC_V6_ILP32_OFFBIG: CInt = 104
public const val _SC_V6_LP64_OFF64: CInt = 105
public const val _SC_V6_LPBIG_OFFBIG: CInt = 106
public const val _SC_IPV6: CInt = 118
public const val _SC_RAW_SOCKETS: CInt = 119
public const val _SC_SYMLOOP_MAX: CInt = 120
public const val _SC_PAGE_SIZE: CInt = _SC_PAGESIZE
public const val _SC_XOPEN_STREAMS: CInt = 114
public const val _SC_XBS5_ILP32_OFF32: CInt = 122
public const val _SC_XBS5_ILP32_OFFBIG: CInt = 123
public const val _SC_XBS5_LP64_OFF64: CInt = 124
public const val _SC_XBS5_LPBIG_OFFBIG: CInt = 125
public const val _SC_SS_REPL_MAX: CInt = 126
public const val _SC_TRACE_EVENT_NAME_MAX: CInt = 127
public const val _SC_TRACE_NAME_MAX: CInt = 128
public const val _SC_TRACE_SYS_MAX: CInt = 129
public const val _SC_TRACE_USER_EVENT_MAX: CInt = 130
public const val _SC_PASS_MAX: CInt = 131
public const val _CS_PATH: CInt = 1
public const val _CS_DARWIN_USER_DIR: CInt = 65536
public const val _CS_DARWIN_USER_TEMP_DIR: CInt = 65537
public const val _CS_DARWIN_USER_CACHE_DIR: CInt = 65538
public val OS_UNFAIR_LOCK_INIT: OsUnfairLock = OsUnfairLock(osUnfairLockOpaque = 0)
public const val OS_LOG_TYPE_DEFAULT: OsLogTypeT = 0x00u
public const val OS_LOG_TYPE_INFO: OsLogTypeT = 0x01u
public const val OS_LOG_TYPE_DEBUG: OsLogTypeT = 0x02u
public const val OS_LOG_TYPE_ERROR: OsLogTypeT = 0x10u
public const val OS_LOG_TYPE_FAULT: OsLogTypeT = 0x11u
public const val OS_SIGNPOST_EVENT: OsSignpostTypeT = 0x00u
public const val OS_SIGNPOST_INTERVAL_BEGIN: OsSignpostTypeT = 0x01u
public const val OS_SIGNPOST_INTERVAL_END: OsSignpostTypeT = 0x02u
public const val MINSIGSTKSZ: ULong = 32768uL
public const val SIGSTKSZ: ULong = 131072uL
public const val FD_SETSIZE: ULong = 1024uL
public const val ST_NOSUID: CULong = 2uL
public const val EVFILT_READ: Short = -1
public const val EVFILT_WRITE: Short = -2
public const val EVFILT_AIO: Short = -3
public const val EVFILT_VNODE: Short = -4
public const val EVFILT_PROC: Short = -5
public const val EVFILT_SIGNAL: Short = -6
public const val EVFILT_TIMER: Short = -7
public const val EVFILT_MACHPORT: Short = -8
public const val EVFILT_FS: Short = -9
public const val EVFILT_USER: Short = -10
public const val EVFILT_VM: Short = -12
public val EV_ADD: UShort = (0x1).toUShort()
public val EV_DELETE: UShort = (0x2).toUShort()
public val EV_ENABLE: UShort = (0x4).toUShort()
public val EV_DISABLE: UShort = (0x8).toUShort()
public val EV_ONESHOT: UShort = (0x10).toUShort()
public val EV_CLEAR: UShort = (0x20).toUShort()
public val EV_RECEIPT: UShort = (0x40).toUShort()
public val EV_DISPATCH: UShort = (0x80).toUShort()
public val EV_FLAG0: UShort = (0x1000).toUShort()
public val EV_POLL: UShort = (0x1000).toUShort()
public val EV_FLAG1: UShort = (0x2000).toUShort()
public val EV_OOBAND: UShort = (0x2000).toUShort()
public val EV_ERROR: UShort = (0x4000).toUShort()
public val EV_EOF: UShort = (0x8000).toUShort()
public val EV_SYSFLAGS: UShort = (0xf000).toUShort()
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
public const val NOTE_NONE: UInt = 0x00000080u
public const val NOTE_EXIT: UInt = 0x80000000u
public const val NOTE_FORK: UInt = 0x40000000u
public const val NOTE_EXEC: UInt = 0x20000000u
public const val NOTE_REAP: UInt = 0x10000000u
public const val NOTE_SIGNAL: UInt = 0x08000000u
public const val NOTE_EXITSTATUS: UInt = 0x04000000u
public const val NOTE_EXIT_DETAIL: UInt = 0x02000000u
public const val NOTE_PDATAMASK: UInt = 0x000fffffu
public const val NOTE_PCTRLMASK: UInt = 0xfff00000u
public const val NOTE_EXIT_REPARENTED: UInt = 0x00080000u
public const val NOTE_EXIT_DETAIL_MASK: UInt = 0x00070000u
public const val NOTE_EXIT_DECRYPTFAIL: UInt = 0x00010000u
public const val NOTE_EXIT_MEMORY: UInt = 0x00020000u
public const val NOTE_EXIT_CSERROR: UInt = 0x00040000u
public const val NOTE_VM_PRESSURE: UInt = 0x80000000u
public const val NOTE_VM_PRESSURE_TERMINATE: UInt = 0x40000000u
public const val NOTE_VM_PRESSURE_SUDDEN_TERMINATE: UInt = 0x20000000u
public const val NOTE_VM_ERROR: UInt = 0x10000000u
public const val NOTE_SECONDS: UInt = 0x00000001u
public const val NOTE_USECONDS: UInt = 0x00000002u
public const val NOTE_NSECONDS: UInt = 0x00000004u
public const val NOTE_ABSOLUTE: UInt = 0x00000008u
public const val NOTE_LEEWAY: UInt = 0x00000010u
public const val NOTE_CRITICAL: UInt = 0x00000020u
public const val NOTE_BACKGROUND: UInt = 0x00000040u
public const val NOTE_MACH_CONTINUOUS_TIME: UInt = 0x00000080u
public const val NOTE_MACHTIME: UInt = 0x00000100u
public const val NOTE_TRACK: UInt = 0x00000001u
public const val NOTE_TRACKERR: UInt = 0x00000002u
public const val NOTE_CHILD: UInt = 0x00000004u
public const val OCRNL: TcflagT = 0x00000010u
public const val ONOCR: TcflagT = 0x00000020u
public const val ONLRET: TcflagT = 0x00000040u
public const val OFILL: TcflagT = 0x00000080u
public const val NLDLY: TcflagT = 0x00000300u
public const val TABDLY: TcflagT = 0x00000c04u
public const val CRDLY: TcflagT = 0x00003000u
public const val FFDLY: TcflagT = 0x00004000u
public const val BSDLY: TcflagT = 0x00008000u
public const val VTDLY: TcflagT = 0x00010000u
public const val OFDEL: TcflagT = 0x00020000u
public const val NL0: TcflagT = 0x00000000u
public const val NL1: TcflagT = 0x00000100u
public const val TAB0: TcflagT = 0x00000000u
public const val TAB1: TcflagT = 0x00000400u
public const val TAB2: TcflagT = 0x00000800u
public const val CR0: TcflagT = 0x00000000u
public const val CR1: TcflagT = 0x00001000u
public const val CR2: TcflagT = 0x00002000u
public const val CR3: TcflagT = 0x00003000u
public const val FF0: TcflagT = 0x00000000u
public const val FF1: TcflagT = 0x00004000u
public const val BS0: TcflagT = 0x00000000u
public const val BS1: TcflagT = 0x00008000u
public const val TAB3: TcflagT = 0x00000004u
public const val VT0: TcflagT = 0x00000000u
public const val VT1: TcflagT = 0x00010000u
public const val IUTF8: TcflagT = 0x00004000u
public const val CRTSCTS: TcflagT = 0x00030000u
public const val NI_MAXHOST: SocklenT = 1025u
public const val NI_MAXSERV: SocklenT = 32u
public const val NI_NOFQDN: CInt = 0x00000001
public const val NI_NUMERICHOST: CInt = 0x00000002
public const val NI_NAMEREQD: CInt = 0x00000004
public const val NI_NUMERICSERV: CInt = 0x00000008
public const val NI_NUMERICSCOPE: CInt = 0x00000100
public const val NI_DGRAM: CInt = 0x00000010
public const val Q_GETQUOTA: CInt = 0x300
public const val Q_SETQUOTA: CInt = 0x400
public const val RENAME_SWAP: CUInt = 0x00000002u
public const val RENAME_EXCL: CUInt = 0x00000004u
public const val RTLD_LOCAL: CInt = 0x4
public const val RTLD_FIRST: CInt = 0x100
public const val RTLD_NODELETE: CInt = 0x80
public const val RTLD_NOLOAD: CInt = 0x10
public const val RTLD_GLOBAL: CInt = 0x8
public const val _WSTOPPED: CInt = 127
public val LOG_NETINFO: CInt = 12 shl 3
public val LOG_REMOTEAUTH: CInt = 13 shl 3
public val LOG_INSTALL: CInt = 14 shl 3
public val LOG_RAS: CInt = 15 shl 3
public val LOG_LAUNCHD: CInt = 24 shl 3
public const val LOG_NFACILITIES: CInt = 25
public const val CTLTYPE: CInt = 0xf
public const val CTLTYPE_NODE: CInt = 1
public const val CTLTYPE_INT: CInt = 2
public const val CTLTYPE_STRING: CInt = 3
public const val CTLTYPE_QUAD: CInt = 4
public const val CTLTYPE_OPAQUE: CInt = 5
public const val CTLTYPE_STRUCT: CInt = CTLTYPE_OPAQUE
public const val CTLFLAG_RD: CInt = -2147483648
public const val CTLFLAG_WR: CInt = 0x40000000
public val CTLFLAG_RW: CInt = CTLFLAG_RD or CTLFLAG_WR
public const val CTLFLAG_NOLOCK: CInt = 0x20000000
public const val CTLFLAG_ANYBODY: CInt = 0x10000000
public const val CTLFLAG_SECURE: CInt = 0x08000000
public const val CTLFLAG_MASKED: CInt = 0x04000000
public const val CTLFLAG_NOAUTO: CInt = 0x02000000
public const val CTLFLAG_KERN: CInt = 0x01000000
public const val CTLFLAG_LOCKED: CInt = 0x00800000
public const val CTLFLAG_OID2: CInt = 0x00400000
public const val CTL_UNSPEC: CInt = 0
public const val CTL_KERN: CInt = 1
public const val CTL_VM: CInt = 2
public const val CTL_VFS: CInt = 3
public const val CTL_NET: CInt = 4
public const val CTL_DEBUG: CInt = 5
public const val CTL_HW: CInt = 6
public const val CTL_MACHDEP: CInt = 7
public const val CTL_USER: CInt = 8
public const val CTL_MAXID: CInt = 9
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
public const val KERN_BOOTTIME: CInt = 21
public const val KERN_NISDOMAINNAME: CInt = 22
public const val KERN_DOMAINNAME: CInt = KERN_NISDOMAINNAME
public const val KERN_MAXPARTITIONS: CInt = 23
public const val KERN_KDEBUG: CInt = 24
public const val KERN_UPDATEINTERVAL: CInt = 25
public const val KERN_OSRELDATE: CInt = 26
public const val KERN_NTP_PLL: CInt = 27
public const val KERN_BOOTFILE: CInt = 28
public const val KERN_MAXFILESPERPROC: CInt = 29
public const val KERN_MAXPROCPERUID: CInt = 30
public const val KERN_DUMPDEV: CInt = 31
public const val KERN_IPC: CInt = 32
public const val KERN_DUMMY: CInt = 33
public const val KERN_PS_STRINGS: CInt = 34
public const val KERN_USRSTACK32: CInt = 35
public const val KERN_LOGSIGEXIT: CInt = 36
public const val KERN_SYMFILE: CInt = 37
public const val KERN_PROCARGS: CInt = 38
public const val KERN_NETBOOT: CInt = 40
public const val KERN_SYSV: CInt = 42
public const val KERN_AFFINITY: CInt = 43
public const val KERN_TRANSLATE: CInt = 44
public const val KERN_CLASSIC: CInt = KERN_TRANSLATE
public const val KERN_EXEC: CInt = 45
public const val KERN_CLASSICHANDLER: CInt = KERN_EXEC
public const val KERN_AIOMAX: CInt = 46
public const val KERN_AIOPROCMAX: CInt = 47
public const val KERN_AIOTHREADS: CInt = 48
public const val KERN_COREFILE: CInt = 50
public const val KERN_COREDUMP: CInt = 51
public const val KERN_SUGID_COREDUMP: CInt = 52
public const val KERN_PROCDELAYTERM: CInt = 53
public const val KERN_SHREG_PRIVATIZABLE: CInt = 54
public const val KERN_LOW_PRI_WINDOW: CInt = 56
public const val KERN_LOW_PRI_DELAY: CInt = 57
public const val KERN_POSIX: CInt = 58
public const val KERN_USRSTACK64: CInt = 59
public const val KERN_NX_PROTECTION: CInt = 60
public const val KERN_TFP: CInt = 61
public const val KERN_PROCNAME: CInt = 62
public const val KERN_THALTSTACK: CInt = 63
public const val KERN_SPECULATIVE_READS: CInt = 64
public const val KERN_OSVERSION: CInt = 65
public const val KERN_SAFEBOOT: CInt = 66
public const val KERN_RAGEVNODE: CInt = 68
public const val KERN_TTY: CInt = 69
public const val KERN_CHECKOPENEVT: CInt = 70
public const val KERN_THREADNAME: CInt = 71
public const val KERN_MAXID: CInt = 72
public const val KERN_RAGE_PROC: CInt = 1
public const val KERN_RAGE_THREAD: CInt = 2
public const val KERN_UNRAGE_PROC: CInt = 3
public const val KERN_UNRAGE_THREAD: CInt = 4
public const val KERN_OPENEVT_PROC: CInt = 1
public const val KERN_UNOPENEVT_PROC: CInt = 2
public const val KERN_TFP_POLICY: CInt = 1
public const val KERN_TFP_POLICY_DENY: CInt = 0
public const val KERN_TFP_POLICY_DEFAULT: CInt = 2
public const val KERN_KDEFLAGS: CInt = 1
public const val KERN_KDDFLAGS: CInt = 2
public const val KERN_KDENABLE: CInt = 3
public const val KERN_KDSETBUF: CInt = 4
public const val KERN_KDGETBUF: CInt = 5
public const val KERN_KDSETUP: CInt = 6
public const val KERN_KDREMOVE: CInt = 7
public const val KERN_KDSETREG: CInt = 8
public const val KERN_KDGETREG: CInt = 9
public const val KERN_KDREADTR: CInt = 10
public const val KERN_KDPIDTR: CInt = 11
public const val KERN_KDTHRMAP: CInt = 12
public const val KERN_KDPIDEX: CInt = 14
public const val KERN_KDSETRTCDEC: CInt = 15
public const val KERN_KDGETENTROPY: CInt = 16
public const val KERN_KDWRITETR: CInt = 17
public const val KERN_KDWRITEMAP: CInt = 18
public const val KERN_KDENABLE_BG_TRACE: CInt = 19
public const val KERN_KDDISABLE_BG_TRACE: CInt = 20
public const val KERN_KDREADCURTHRMAP: CInt = 21
public const val KERN_KDSET_TYPEFILTER: CInt = 22
public const val KERN_KDBUFWAIT: CInt = 23
public const val KERN_KDCPUMAP: CInt = 24
public const val KERN_PROC_ALL: CInt = 0
public const val KERN_PROC_PID: CInt = 1
public const val KERN_PROC_PGRP: CInt = 2
public const val KERN_PROC_SESSION: CInt = 3
public const val KERN_PROC_TTY: CInt = 4
public const val KERN_PROC_UID: CInt = 5
public const val KERN_PROC_RUID: CInt = 6
public const val KERN_PROC_LCID: CInt = 7
public const val KERN_SUCCESS: CInt = 0
public const val KERN_INVALID_ADDRESS: CInt = 1
public const val KERN_PROTECTION_FAILURE: CInt = 2
public const val KERN_NO_SPACE: CInt = 3
public const val KERN_INVALID_ARGUMENT: CInt = 4
public const val KERN_FAILURE: CInt = 5
public const val KERN_RESOURCE_SHORTAGE: CInt = 6
public const val KERN_NOT_RECEIVER: CInt = 7
public const val KERN_NO_ACCESS: CInt = 8
public const val KERN_MEMORY_FAILURE: CInt = 9
public const val KERN_MEMORY_ERROR: CInt = 10
public const val KERN_ALREADY_IN_SET: CInt = 11
public const val KERN_NOT_IN_SET: CInt = 12
public const val KERN_NAME_EXISTS: CInt = 13
public const val KERN_ABORTED: CInt = 14
public const val KERN_INVALID_NAME: CInt = 15
public const val KERN_INVALID_TASK: CInt = 16
public const val KERN_INVALID_RIGHT: CInt = 17
public const val KERN_INVALID_VALUE: CInt = 18
public const val KERN_UREFS_OVERFLOW: CInt = 19
public const val KERN_INVALID_CAPABILITY: CInt = 20
public const val KERN_RIGHT_EXISTS: CInt = 21
public const val KERN_INVALID_HOST: CInt = 22
public const val KERN_MEMORY_PRESENT: CInt = 23
public const val KERN_MEMORY_DATA_MOVED: CInt = 24
public const val KERN_MEMORY_RESTART_COPY: CInt = 25
public const val KERN_INVALID_PROCESSOR_SET: CInt = 26
public const val KERN_POLICY_LIMIT: CInt = 27
public const val KERN_INVALID_POLICY: CInt = 28
public const val KERN_INVALID_OBJECT: CInt = 29
public const val KERN_ALREADY_WAITING: CInt = 30
public const val KERN_DEFAULT_SET: CInt = 31
public const val KERN_EXCEPTION_PROTECTED: CInt = 32
public const val KERN_INVALID_LEDGER: CInt = 33
public const val KERN_INVALID_MEMORY_CONTROL: CInt = 34
public const val KERN_INVALID_SECURITY: CInt = 35
public const val KERN_NOT_DEPRESSED: CInt = 36
public const val KERN_TERMINATED: CInt = 37
public const val KERN_LOCK_SET_DESTROYED: CInt = 38
public const val KERN_LOCK_UNSTABLE: CInt = 39
public const val KERN_LOCK_OWNED: CInt = 40
public const val KERN_LOCK_OWNED_SELF: CInt = 41
public const val KERN_SEMAPHORE_DESTROYED: CInt = 42
public const val KERN_RPC_SERVER_TERMINATED: CInt = 43
public const val KERN_RPC_TERMINATE_ORPHAN: CInt = 44
public const val KERN_RPC_CONTINUE_ORPHAN: CInt = 45
public const val KERN_NOT_SUPPORTED: CInt = 46
public const val KERN_NODE_DOWN: CInt = 47
public const val KERN_NOT_WAITING: CInt = 48
public const val KERN_OPERATION_TIMED_OUT: CInt = 49
public const val KERN_CODESIGN_ERROR: CInt = 50
public const val KERN_POLICY_STATIC: CInt = 51
public const val KERN_INSUFFICIENT_BUFFER_SIZE: CInt = 52
public const val KIPC_MAXSOCKBUF: CInt = 1
public const val KIPC_SOCKBUF_WASTE: CInt = 2
public const val KIPC_SOMAXCONN: CInt = 3
public const val KIPC_MAX_LINKHDR: CInt = 4
public const val KIPC_MAX_PROTOHDR: CInt = 5
public const val KIPC_MAX_HDR: CInt = 6
public const val KIPC_MAX_DATALEN: CInt = 7
public const val KIPC_MBSTAT: CInt = 8
public const val KIPC_NMBCLUSTERS: CInt = 9
public const val KIPC_SOQLIMITCOMPAT: CInt = 10
public const val VM_METER: CInt = 1
public const val VM_LOADAVG: CInt = 2
public const val VM_MACHFACTOR: CInt = 4
public const val VM_SWAPUSAGE: CInt = 5
public const val VM_MAXID: CInt = 6
public const val VM_PROT_NONE: VmProtT = 0x00
public const val VM_PROT_READ: VmProtT = 0x01
public const val VM_PROT_WRITE: VmProtT = 0x02
public const val VM_PROT_EXECUTE: VmProtT = 0x04
public const val MEMORY_OBJECT_NULL: MemoryObjectT = 0u
public const val HW_MACHINE: CInt = 1
public const val HW_MODEL: CInt = 2
public const val HW_NCPU: CInt = 3
public const val HW_BYTEORDER: CInt = 4
public const val HW_PHYSMEM: CInt = 5
public const val HW_USERMEM: CInt = 6
public const val HW_PAGESIZE: CInt = 7
public const val HW_DISKNAMES: CInt = 8
public const val HW_DISKSTATS: CInt = 9
public const val HW_EPOCH: CInt = 10
public const val HW_FLOATINGPT: CInt = 11
public const val HW_MACHINE_ARCH: CInt = 12
public const val HW_VECTORUNIT: CInt = 13
public const val HW_BUS_FREQ: CInt = 14
public const val HW_CPU_FREQ: CInt = 15
public const val HW_CACHELINE: CInt = 16
public const val HW_L1ICACHESIZE: CInt = 17
public const val HW_L1DCACHESIZE: CInt = 18
public const val HW_L2SETTINGS: CInt = 19
public const val HW_L2CACHESIZE: CInt = 20
public const val HW_L3SETTINGS: CInt = 21
public const val HW_L3CACHESIZE: CInt = 22
public const val HW_TB_FREQ: CInt = 23
public const val HW_MEMSIZE: CInt = 24
public const val HW_AVAILCPU: CInt = 25
public const val HW_TARGET: CInt = 26
public const val HW_PRODUCT: CInt = 27
public const val HW_MAXID: CInt = 28
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
public const val USER_MAXID: CInt = 21
public const val CTL_DEBUG_NAME: CInt = 0
public const val CTL_DEBUG_VALUE: CInt = 1
public const val CTL_DEBUG_MAXID: CInt = 20
public const val PRIO_DARWIN_THREAD: CInt = 3
public const val PRIO_DARWIN_PROCESS: CInt = 4
public const val PRIO_DARWIN_BG: CInt = 0x1000
public const val PRIO_DARWIN_NONUI: CInt = 0x1001
public const val AI_PASSIVE: CInt = 0x00000001
public const val AI_CANONNAME: CInt = 0x00000002
public const val AI_NUMERICHOST: CInt = 0x00000004
public const val AI_NUMERICSERV: CInt = 0x00001000
public const val AI_ALL: CInt = 0x00000100
public const val AI_V4MAPPED_CFG: CInt = 0x00000200
public const val AI_ADDRCONFIG: CInt = 0x00000400
public const val AI_V4MAPPED: CInt = 0x00000800
public val AI_DEFAULT: CInt = AI_V4MAPPED_CFG or AI_ADDRCONFIG
public const val AI_UNUSABLE: CInt = 0x10000000
public const val SIGEV_NONE: CInt = 0
public const val SIGEV_SIGNAL: CInt = 1
public const val SIGEV_THREAD: CInt = 3
public const val AIO_CANCELED: CInt = 2
public const val AIO_NOTCANCELED: CInt = 4
public const val AIO_ALLDONE: CInt = 1
public const val AIO_LISTIO_MAX: CInt = 16
public const val LIO_NOP: CInt = 0
public const val LIO_WRITE: CInt = 2
public const val LIO_READ: CInt = 1
public const val LIO_WAIT: CInt = 2
public const val LIO_NOWAIT: CInt = 1
public const val WEXITED: CInt = 0x00000004
public const val WSTOPPED: CInt = 0x00000008
public const val WCONTINUED: CInt = 0x00000010
public const val WNOWAIT: CInt = 0x00000020
public const val P_ALL: IdtypeT = 0u
public const val P_PID: IdtypeT = 1u
public const val P_PGID: IdtypeT = 2u
public const val UTIME_OMIT: CLong = -2
public const val UTIME_NOW: CLong = -1
public const val XATTR_NOFOLLOW: CInt = 0x0001
public const val XATTR_CREATE: CInt = 0x0002
public const val XATTR_REPLACE: CInt = 0x0004
public const val XATTR_NOSECURITY: CInt = 0x0008
public const val XATTR_NODEFAULT: CInt = 0x0010
public const val XATTR_SHOWCOMPRESSION: CInt = 0x0020
public const val NET_RT_IFLIST2: CInt = 0x0006
public const val RTF_DELCLONE: CInt = 0x80
public const val RTF_CLONING: CInt = 0x100
public const val RTF_XRESOLVE: CInt = 0x200
public const val RTF_LLINFO: CInt = 0x400
public const val RTF_NOIFREF: CInt = 0x2000
public const val RTF_PRCLONING: CInt = 0x10000
public const val RTF_WASCLONED: CInt = 0x20000
public const val RTF_PROTO3: CInt = 0x40000
public const val RTF_PINNED: CInt = 0x100000
public const val RTF_LOCAL: CInt = 0x200000
public const val RTF_BROADCAST: CInt = 0x400000
public const val RTF_MULTICAST: CInt = 0x800000
public const val RTF_IFSCOPE: CInt = 0x1000000
public const val RTF_CONDEMNED: CInt = 0x2000000
public const val RTF_IFREF: CInt = 0x4000000
public const val RTF_PROXY: CInt = 0x8000000
public const val RTF_ROUTER: CInt = 0x10000000
public const val RTF_DEAD: CInt = 0x20000000
public const val RTF_GLOBAL: CInt = 0x40000000
public const val RTM_VERSION: CInt = 5
public const val RTM_LOCK: CInt = 0x8
public const val RTM_OLDADD: CInt = 0x9
public const val RTM_OLDDEL: CInt = 0xa
public const val RTM_RESOLVE: CInt = 0xb
public const val RTM_NEWADDR: CInt = 0xc
public const val RTM_DELADDR: CInt = 0xd
public const val RTM_IFINFO: CInt = 0xe
public const val RTM_NEWMADDR: CInt = 0xf
public const val RTM_DELMADDR: CInt = 0x10
public const val RTM_IFINFO2: CInt = 0x12
public const val RTM_NEWMADDR2: CInt = 0x13
public const val RTM_GET2: CInt = 0x14
public const val RTV_MTU: CInt = 0x1
public const val RTV_HOPCOUNT: CInt = 0x2
public const val RTV_EXPIRE: CInt = 0x4
public const val RTV_RPIPE: CInt = 0x8
public const val RTV_SPIPE: CInt = 0x10
public const val RTV_SSTHRESH: CInt = 0x20
public const val RTV_RTT: CInt = 0x40
public const val RTV_RTTVAR: CInt = 0x80
public const val RTAX_MAX: CInt = 8
public const val KERN_PROCARGS2: CInt = 49
public const val PROC_PIDTASKALLINFO: CInt = 2
public const val PROC_PIDTBSDINFO: CInt = 3
public const val PROC_PIDTASKINFO: CInt = 4
public const val PROC_PIDTHREADINFO: CInt = 5
public const val PROC_PIDVNODEPATHINFO: CInt = 9
public const val PROC_PIDPATHINFO_MAXSIZE: CInt = 4096
public const val PROC_PIDLISTFDS: CInt = 1

// PROC_PIDLISTFD_SIZE = size_of<ProcFdinfo>() (struct size; computed at the FFI boundary)
public const val PROX_FDTYPE_ATALK: CInt = 0
public const val PROX_FDTYPE_VNODE: CInt = 1
public const val PROX_FDTYPE_SOCKET: CInt = 2
public const val PROX_FDTYPE_PSHM: CInt = 3
public const val PROX_FDTYPE_PSEM: CInt = 4
public const val PROX_FDTYPE_KQUEUE: CInt = 5
public const val PROX_FDTYPE_PIPE: CInt = 6
public const val PROX_FDTYPE_FSEVENTS: CInt = 7
public const val PROX_FDTYPE_NETPOLICY: CInt = 9
public const val PROX_FDTYPE_CHANNEL: CInt = 10
public const val PROX_FDTYPE_NEXUS: CInt = 11
public const val PROC_CSM_ALL: CUInt = 0x0001u
public const val PROC_CSM_NOSMT: CUInt = 0x0002u
public const val PROC_CSM_TECS: CUInt = 0x0004u
public const val MAXCOMLEN: ULong = 16uL
public const val MAXTHREADNAMESIZE: ULong = 64uL
public const val XUCRED_VERSION: CUInt = 0u
public const val LC_SEGMENT: UInt = 0x1u
public const val LC_SEGMENT_64: UInt = 0x19u
public const val MH_MAGIC: UInt = 0xfeedfaceu
public const val MH_MAGIC_64: UInt = 0xfeedfacfu
public const val UTUN_OPT_FLAGS: CInt = 1
public const val UTUN_OPT_IFNAME: CInt = 2
public const val DLT_NULL: CUInt = 0u
public const val DLT_EN10MB: CUInt = 1u
public const val DLT_EN3MB: CUInt = 2u
public const val DLT_AX25: CUInt = 3u
public const val DLT_PRONET: CUInt = 4u
public const val DLT_CHAOS: CUInt = 5u
public const val DLT_IEEE802: CUInt = 6u
public const val DLT_ARCNET: CUInt = 7u
public const val DLT_SLIP: CUInt = 8u
public const val DLT_PPP: CUInt = 9u
public const val DLT_FDDI: CUInt = 10u
public const val DLT_ATM_RFC1483: CUInt = 11u
public const val DLT_RAW: CUInt = 12u
public const val DLT_LOOP: CUInt = 108u
public const val BPF_ALIGNMENT: CInt = 4
public const val MNT_NODEV: CInt = 0x00000010
public const val MNT_UNION: CInt = 0x00000020
public const val MNT_CPROTECT: CInt = 0x00000080
public const val MNT_QUARANTINE: CInt = 0x00000400
public const val MNT_LOCAL: CInt = 0x00001000
public const val MNT_QUOTA: CInt = 0x00002000
public const val MNT_ROOTFS: CInt = 0x00004000
public const val MNT_DOVOLFS: CInt = 0x00008000
public const val MNT_DONTBROWSE: CInt = 0x00100000
public const val MNT_IGNORE_OWNERSHIP: CInt = 0x00200000
public const val MNT_AUTOMOUNTED: CInt = 0x00400000
public const val MNT_JOURNALED: CInt = 0x00800000
public const val MNT_NOUSERXATTR: CInt = 0x01000000
public const val MNT_DEFWRITE: CInt = 0x02000000
public const val MNT_MULTILABEL: CInt = 0x04000000
public const val MNT_NOATIME: CInt = 0x10000000
public const val MNT_SNAPSHOT: CInt = 0x40000000
public const val MNT_NOBLOCK: CInt = 0x00020000
public const val POSIX_SPAWN_RESETIDS: CInt = 0x0001
public const val POSIX_SPAWN_SETPGROUP: CInt = 0x0002
public const val POSIX_SPAWN_SETSIGDEF: CInt = 0x0004
public const val POSIX_SPAWN_SETSIGMASK: CInt = 0x0008
public const val POSIX_SPAWN_SETEXEC: CInt = 0x0040
public const val POSIX_SPAWN_START_SUSPENDED: CInt = 0x0080
public const val POSIX_SPAWN_CLOEXEC_DEFAULT: CInt = 0x4000
public const val IPC_CREAT: CInt = 0x200
public const val IPC_EXCL: CInt = 0x400
public const val IPC_NOWAIT: CInt = 0x800
public const val IPC_PRIVATE: KeyT = 0
public const val IPC_RMID: CInt = 0
public const val IPC_SET: CInt = 1
public const val IPC_STAT: CInt = 2
public const val IPC_R: CInt = 0x100
public const val IPC_W: CInt = 0x80
public const val IPC_M: CInt = 0x1000
public const val SEM_UNDO: CInt = 4096
public const val GETNCNT: CInt = 3
public const val GETPID: CInt = 4
public const val GETVAL: CInt = 5
public const val GETALL: CInt = 6
public const val GETZCNT: CInt = 7
public const val SETVAL: CInt = 8
public const val SETALL: CInt = 9
public const val SHM_RDONLY: CInt = 0x1000
public const val SHM_RND: CInt = 0x2000
public const val SHMLBA: CInt = 16 * 1024
public const val SHM_R: CInt = IPC_R
public const val SHM_W: CInt = IPC_W
public const val UF_SETTABLE: CUInt = 0x0000ffffu
public const val UF_NODUMP: CUInt = 0x00000001u
public const val UF_IMMUTABLE: CUInt = 0x00000002u
public const val UF_APPEND: CUInt = 0x00000004u
public const val UF_OPAQUE: CUInt = 0x00000008u
public const val UF_COMPRESSED: CUInt = 0x00000020u
public const val UF_TRACKED: CUInt = 0x00000040u
public const val SF_SETTABLE: CUInt = 0x3fff0000u
public const val SF_ARCHIVED: CUInt = 0x00010000u
public const val SF_IMMUTABLE: CUInt = 0x00020000u
public const val SF_APPEND: CUInt = 0x00040000u
public const val UF_HIDDEN: CUInt = 0x00008000u
public const val NTP_API: CInt = 4
public const val MAXPHASE: CLong = 500000000
public const val MAXFREQ: CLong = 500000
public const val MINSEC: CInt = 256
public const val MAXSEC: CInt = 2048
public const val NANOSECOND: CLong = 1000000000
public const val SCALE_PPM: CInt = 65
public const val MAXTC: CInt = 10
public const val MOD_OFFSET: CUInt = 0x0001u
public const val MOD_FREQUENCY: CUInt = 0x0002u
public const val MOD_MAXERROR: CUInt = 0x0004u
public const val MOD_ESTERROR: CUInt = 0x0008u
public const val MOD_STATUS: CUInt = 0x0010u
public const val MOD_TIMECONST: CUInt = 0x0020u
public const val MOD_PPSMAX: CUInt = 0x0040u
public const val MOD_TAI: CUInt = 0x0080u
public const val MOD_MICRO: CUInt = 0x1000u
public const val MOD_NANO: CUInt = 0x2000u
public const val MOD_CLKB: CUInt = 0x4000u
public const val MOD_CLKA: CUInt = 0x8000u
public const val STA_PLL: CInt = 0x0001
public const val STA_PPSFREQ: CInt = 0x0002
public const val STA_PPSTIME: CInt = 0x0004
public const val STA_FLL: CInt = 0x0008
public const val STA_INS: CInt = 0x0010
public const val STA_DEL: CInt = 0x0020
public const val STA_UNSYNC: CInt = 0x0040
public const val STA_FREQHOLD: CInt = 0x0080
public const val STA_PPSSIGNAL: CInt = 0x0100
public const val STA_PPSJITTER: CInt = 0x0200
public const val STA_PPSWANDER: CInt = 0x0400
public const val STA_PPSERROR: CInt = 0x0800
public const val STA_CLOCKERR: CInt = 0x1000
public const val STA_NANO: CInt = 0x2000
public const val STA_MODE: CInt = 0x4000
public const val STA_CLK: CInt = 0x8000
public val STA_RONLY: CInt = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK
public const val TIME_OK: CInt = 0
public const val TIME_INS: CInt = 1
public const val TIME_DEL: CInt = 2
public const val TIME_OOP: CInt = 3
public const val TIME_WAIT: CInt = 4
public const val TIME_ERROR: CInt = 5
public const val MNT_WAIT: CInt = 1
public const val MNT_NOWAIT: CInt = 2
public const val THREAD_STANDARD_POLICY: CInt = 1
public const val THREAD_STANDARD_POLICY_COUNT: CInt = 0
public const val THREAD_EXTENDED_POLICY: CInt = 1
public const val THREAD_TIME_CONSTRAINT_POLICY: CInt = 2
public const val THREAD_PRECEDENCE_POLICY: CInt = 3
public const val THREAD_AFFINITY_POLICY: CInt = 4
public const val THREAD_AFFINITY_TAG_NULL: CInt = 0
public const val THREAD_BACKGROUND_POLICY: CInt = 5
public const val THREAD_BACKGROUND_POLICY_DARWIN_BG: CInt = 0x1000
public const val THREAD_LATENCY_QOS_POLICY: CInt = 7
public const val THREAD_THROUGHPUT_QOS_POLICY: CInt = 8
public const val TH_STATE_RUNNING: CInt = 1
public const val TH_STATE_STOPPED: CInt = 2
public const val TH_STATE_WAITING: CInt = 3
public const val TH_STATE_UNINTERRUPTIBLE: CInt = 4
public const val TH_STATE_HALTED: CInt = 5
public const val TH_FLAGS_SWAPPED: CInt = 0x1
public const val TH_FLAGS_IDLE: CInt = 0x2
public const val TH_FLAGS_GLOBAL_FORCED_IDLE: CInt = 0x4
public const val THREAD_BASIC_INFO: CInt = 3
public const val THREAD_IDENTIFIER_INFO: CInt = 4
public const val THREAD_EXTENDED_INFO: CInt = 5
public const val kCCSuccess: Int = 0
public const val kCCParamError: Int = -4300
public const val kCCBufferTooSmall: Int = -4301
public const val kCCMemoryFailure: Int = -4302
public const val kCCAlignmentError: Int = -4303
public const val kCCDecodeError: Int = -4304
public const val kCCUnimplemented: Int = -4305
public const val kCCOverflow: Int = -4306
public const val kCCRNGFailure: Int = -4307
public const val kCCUnspecifiedError: Int = -4308
public const val kCCCallSequenceError: Int = -4309
public const val kCCKeySizeError: Int = -4310
public const val kCCInvalidKey: Int = -4311
public const val HOST_LOAD_INFO: Int = 1
public const val HOST_VM_INFO: Int = 2
public const val HOST_CPU_LOAD_INFO: Int = 3
public const val HOST_VM_INFO64: Int = 4
public const val HOST_EXTMOD_INFO64: Int = 5
public const val HOST_EXPIRED_TASK_INFO: Int = 6
public const val VM_PAGE_QUERY_PAGE_PRESENT: Int = 0x1
public const val VM_PAGE_QUERY_PAGE_FICTITIOUS: Int = 0x2
public const val VM_PAGE_QUERY_PAGE_REF: Int = 0x4
public const val VM_PAGE_QUERY_PAGE_DIRTY: Int = 0x8
public const val VM_PAGE_QUERY_PAGE_PAGED_OUT: Int = 0x10
public const val VM_PAGE_QUERY_PAGE_COPIED: Int = 0x20
public const val VM_PAGE_QUERY_PAGE_SPECULATIVE: Int = 0x40
public const val VM_PAGE_QUERY_PAGE_EXTERNAL: Int = 0x80
public const val VM_PAGE_QUERY_PAGE_CS_VALIDATED: Int = 0x100
public const val VM_PAGE_QUERY_PAGE_CS_TAINTED: Int = 0x200
public const val VM_PAGE_QUERY_PAGE_CS_NX: Int = 0x400
public const val TASK_THREAD_TIMES_INFO: UInt = 3u
public const val HOST_CPU_LOAD_INFO_COUNT: UInt = 4u
public const val MACH_TASK_BASIC_INFO: UInt = 20u
public const val MACH_PORT_NULL: Int = 0
public const val RUSAGE_INFO_V0: CInt = 0
public const val RUSAGE_INFO_V1: CInt = 1
public const val RUSAGE_INFO_V2: CInt = 2
public const val RUSAGE_INFO_V3: CInt = 3
public const val RUSAGE_INFO_V4: CInt = 4
public val COPYFILE_ACL: CopyfileFlagsT = 1.toUInt() shl 0
public val COPYFILE_STAT: CopyfileFlagsT = 1.toUInt() shl 1
public val COPYFILE_XATTR: CopyfileFlagsT = 1.toUInt() shl 2
public val COPYFILE_DATA: CopyfileFlagsT = 1.toUInt() shl 3
public val COPYFILE_SECURITY: CopyfileFlagsT = COPYFILE_STAT or COPYFILE_ACL
public val COPYFILE_METADATA: CopyfileFlagsT = COPYFILE_SECURITY or COPYFILE_XATTR
public val COPYFILE_RECURSIVE: CopyfileFlagsT = 1.toUInt() shl 15
public val COPYFILE_CHECK: CopyfileFlagsT = 1.toUInt() shl 16
public val COPYFILE_EXCL: CopyfileFlagsT = 1.toUInt() shl 17
public val COPYFILE_NOFOLLOW_SRC: CopyfileFlagsT = 1.toUInt() shl 18
public val COPYFILE_NOFOLLOW_DST: CopyfileFlagsT = 1.toUInt() shl 19
public val COPYFILE_MOVE: CopyfileFlagsT = 1.toUInt() shl 20
public val COPYFILE_UNLINK: CopyfileFlagsT = 1.toUInt() shl 21
public val COPYFILE_PACK: CopyfileFlagsT = 1.toUInt() shl 22
public val COPYFILE_UNPACK: CopyfileFlagsT = 1.toUInt() shl 23
public val COPYFILE_CLONE: CopyfileFlagsT = 1.toUInt() shl 24
public val COPYFILE_CLONE_FORCE: CopyfileFlagsT = 1.toUInt() shl 25
public val COPYFILE_RUN_IN_PLACE: CopyfileFlagsT = 1.toUInt() shl 26
public val COPYFILE_DATA_SPARSE: CopyfileFlagsT = 1.toUInt() shl 27
public val COPYFILE_PRESERVE_DST_TRACKED: CopyfileFlagsT = 1.toUInt() shl 28
public val COPYFILE_VERBOSE: CopyfileFlagsT = 1.toUInt() shl 30
public const val COPYFILE_RECURSE_ERROR: CInt = 0
public const val COPYFILE_RECURSE_FILE: CInt = 1
public const val COPYFILE_RECURSE_DIR: CInt = 2
public const val COPYFILE_RECURSE_DIR_CLEANUP: CInt = 3
public const val COPYFILE_COPY_DATA: CInt = 4
public const val COPYFILE_COPY_XATTR: CInt = 5
public const val COPYFILE_START: CInt = 1
public const val COPYFILE_FINISH: CInt = 2
public const val COPYFILE_ERR: CInt = 3
public const val COPYFILE_PROGRESS: CInt = 4
public const val COPYFILE_CONTINUE: CInt = 0
public const val COPYFILE_SKIP: CInt = 1
public const val COPYFILE_QUIT: CInt = 2
public const val COPYFILE_STATE_SRC_FD: CInt = 1
public const val COPYFILE_STATE_SRC_FILENAME: CInt = 2
public const val COPYFILE_STATE_DST_FD: CInt = 3
public const val COPYFILE_STATE_DST_FILENAME: CInt = 4
public const val COPYFILE_STATE_QUARANTINE: CInt = 5
public const val COPYFILE_STATE_STATUS_CB: CInt = 6
public const val COPYFILE_STATE_STATUS_CTX: CInt = 7
public const val COPYFILE_STATE_COPIED: CInt = 8
public const val COPYFILE_STATE_XATTRNAME: CInt = 9
public const val COPYFILE_STATE_WAS_CLONED: CInt = 10
public const val COPYFILE_STATE_SRC_BSIZE: CInt = 11
public const val COPYFILE_STATE_DST_BSIZE: CInt = 12
public const val COPYFILE_STATE_BSIZE: CInt = 13
public val ATTR_BIT_MAP_COUNT: CUShort = (5).toUShort()
public const val FSOPT_NOFOLLOW: UInt = 0x1u
public const val FSOPT_NOFOLLOW_ANY: UInt = 0x800u
public const val FSOPT_REPORT_FULLSIZE: UInt = 0x4u
public const val FSOPT_PACK_INVAL_ATTRS: UInt = 0x8u
public const val FSOPT_ATTR_CMN_EXTENDED: UInt = 0x20u
public const val FSOPT_RETURN_REALDEV: UInt = 0x200u
public const val ATTR_CMN_NAME: AttrgroupT = 0x00000001u
public const val ATTR_CMN_DEVID: AttrgroupT = 0x00000002u
public const val ATTR_CMN_FSID: AttrgroupT = 0x00000004u
public const val ATTR_CMN_OBJTYPE: AttrgroupT = 0x00000008u
public const val ATTR_CMN_OBJTAG: AttrgroupT = 0x00000010u
public const val ATTR_CMN_OBJID: AttrgroupT = 0x00000020u
public const val ATTR_CMN_OBJPERMANENTID: AttrgroupT = 0x00000040u
public const val ATTR_CMN_PAROBJID: AttrgroupT = 0x00000080u
public const val ATTR_CMN_SCRIPT: AttrgroupT = 0x00000100u
public const val ATTR_CMN_CRTIME: AttrgroupT = 0x00000200u
public const val ATTR_CMN_MODTIME: AttrgroupT = 0x00000400u
public const val ATTR_CMN_CHGTIME: AttrgroupT = 0x00000800u
public const val ATTR_CMN_ACCTIME: AttrgroupT = 0x00001000u
public const val ATTR_CMN_BKUPTIME: AttrgroupT = 0x00002000u
public const val ATTR_CMN_FNDRINFO: AttrgroupT = 0x00004000u
public const val ATTR_CMN_OWNERID: AttrgroupT = 0x00008000u
public const val ATTR_CMN_GRPID: AttrgroupT = 0x00010000u
public const val ATTR_CMN_ACCESSMASK: AttrgroupT = 0x00020000u
public const val ATTR_CMN_FLAGS: AttrgroupT = 0x00040000u
public const val ATTR_CMN_GEN_COUNT: AttrgroupT = 0x00080000u
public const val ATTR_CMN_DOCUMENT_ID: AttrgroupT = 0x00100000u
public const val ATTR_CMN_USERACCESS: AttrgroupT = 0x00200000u
public const val ATTR_CMN_EXTENDED_SECURITY: AttrgroupT = 0x00400000u
public const val ATTR_CMN_UUID: AttrgroupT = 0x00800000u
public const val ATTR_CMN_GRPUUID: AttrgroupT = 0x01000000u
public const val ATTR_CMN_FILEID: AttrgroupT = 0x02000000u
public const val ATTR_CMN_PARENTID: AttrgroupT = 0x04000000u
public const val ATTR_CMN_FULLPATH: AttrgroupT = 0x08000000u
public const val ATTR_CMN_ADDEDTIME: AttrgroupT = 0x10000000u
public const val ATTR_CMN_DATA_PROTECT_FLAGS: AttrgroupT = 0x40000000u
public const val ATTR_CMN_RETURNED_ATTRS: AttrgroupT = 0x80000000u
public const val ATTR_VOL_FSTYPE: AttrgroupT = 0x00000001u
public const val ATTR_VOL_SIGNATURE: AttrgroupT = 0x00000002u
public const val ATTR_VOL_SIZE: AttrgroupT = 0x00000004u
public const val ATTR_VOL_SPACEFREE: AttrgroupT = 0x00000008u
public const val ATTR_VOL_SPACEAVAIL: AttrgroupT = 0x00000010u
public const val ATTR_VOL_MINALLOCATION: AttrgroupT = 0x00000020u
public const val ATTR_VOL_ALLOCATIONCLUMP: AttrgroupT = 0x00000040u
public const val ATTR_VOL_IOBLOCKSIZE: AttrgroupT = 0x00000080u
public const val ATTR_VOL_OBJCOUNT: AttrgroupT = 0x00000100u
public const val ATTR_VOL_FILECOUNT: AttrgroupT = 0x00000200u
public const val ATTR_VOL_DIRCOUNT: AttrgroupT = 0x00000400u
public const val ATTR_VOL_MAXOBJCOUNT: AttrgroupT = 0x00000800u
public const val ATTR_VOL_MOUNTPOINT: AttrgroupT = 0x00001000u
public const val ATTR_VOL_NAME: AttrgroupT = 0x00002000u
public const val ATTR_VOL_MOUNTFLAGS: AttrgroupT = 0x00004000u
public const val ATTR_VOL_MOUNTEDDEVICE: AttrgroupT = 0x00008000u
public const val ATTR_VOL_ENCODINGSUSED: AttrgroupT = 0x00010000u
public const val ATTR_VOL_CAPABILITIES: AttrgroupT = 0x00020000u
public const val ATTR_VOL_UUID: AttrgroupT = 0x00040000u
public const val ATTR_VOL_SPACEUSED: AttrgroupT = 0x00800000u
public const val ATTR_VOL_QUOTA_SIZE: AttrgroupT = 0x10000000u
public const val ATTR_VOL_RESERVED_SIZE: AttrgroupT = 0x20000000u
public const val ATTR_VOL_ATTRIBUTES: AttrgroupT = 0x40000000u
public const val ATTR_VOL_INFO: AttrgroupT = 0x80000000u
public const val ATTR_DIR_LINKCOUNT: AttrgroupT = 0x00000001u
public const val ATTR_DIR_ENTRYCOUNT: AttrgroupT = 0x00000002u
public const val ATTR_DIR_MOUNTSTATUS: AttrgroupT = 0x00000004u
public const val ATTR_DIR_ALLOCSIZE: AttrgroupT = 0x00000008u
public const val ATTR_DIR_IOBLOCKSIZE: AttrgroupT = 0x00000010u
public const val ATTR_DIR_DATALENGTH: AttrgroupT = 0x00000020u
public const val ATTR_FILE_LINKCOUNT: AttrgroupT = 0x00000001u
public const val ATTR_FILE_TOTALSIZE: AttrgroupT = 0x00000002u
public const val ATTR_FILE_ALLOCSIZE: AttrgroupT = 0x00000004u
public const val ATTR_FILE_IOBLOCKSIZE: AttrgroupT = 0x00000008u
public const val ATTR_FILE_DEVTYPE: AttrgroupT = 0x00000020u
public const val ATTR_FILE_FORKCOUNT: AttrgroupT = 0x00000080u
public const val ATTR_FILE_FORKLIST: AttrgroupT = 0x00000100u
public const val ATTR_FILE_DATALENGTH: AttrgroupT = 0x00000200u
public const val ATTR_FILE_DATAALLOCSIZE: AttrgroupT = 0x00000400u
public const val ATTR_FILE_RSRCLENGTH: AttrgroupT = 0x00001000u
public const val ATTR_FILE_RSRCALLOCSIZE: AttrgroupT = 0x00002000u
public const val ATTR_CMNEXT_RELPATH: AttrgroupT = 0x00000004u
public const val ATTR_CMNEXT_PRIVATESIZE: AttrgroupT = 0x00000008u
public const val ATTR_CMNEXT_LINKID: AttrgroupT = 0x00000010u
public const val ATTR_CMNEXT_NOFIRMLINKPATH: AttrgroupT = 0x00000020u
public const val ATTR_CMNEXT_REALDEVID: AttrgroupT = 0x00000040u
public const val ATTR_CMNEXT_REALFSID: AttrgroupT = 0x00000080u
public const val ATTR_CMNEXT_CLONEID: AttrgroupT = 0x00000100u
public const val ATTR_CMNEXT_EXT_FLAGS: AttrgroupT = 0x00000200u
public const val ATTR_CMNEXT_RECURSIVE_GENCOUNT: AttrgroupT = 0x00000400u
public const val DIR_MNTSTATUS_MNTPOINT: UInt = 0x1u
public const val VOL_CAPABILITIES_FORMAT: ULong = 0uL
public const val VOL_CAPABILITIES_INTERFACES: ULong = 1uL
public const val VOL_CAP_FMT_PERSISTENTOBJECTIDS: AttrgroupT = 0x00000001u
public const val VOL_CAP_FMT_SYMBOLICLINKS: AttrgroupT = 0x00000002u
public const val VOL_CAP_FMT_HARDLINKS: AttrgroupT = 0x00000004u
public const val VOL_CAP_FMT_JOURNAL: AttrgroupT = 0x00000008u
public const val VOL_CAP_FMT_JOURNAL_ACTIVE: AttrgroupT = 0x00000010u
public const val VOL_CAP_FMT_NO_ROOT_TIMES: AttrgroupT = 0x00000020u
public const val VOL_CAP_FMT_SPARSE_FILES: AttrgroupT = 0x00000040u
public const val VOL_CAP_FMT_ZERO_RUNS: AttrgroupT = 0x00000080u
public const val VOL_CAP_FMT_CASE_SENSITIVE: AttrgroupT = 0x00000100u
public const val VOL_CAP_FMT_CASE_PRESERVING: AttrgroupT = 0x00000200u
public const val VOL_CAP_FMT_FAST_STATFS: AttrgroupT = 0x00000400u
public const val VOL_CAP_FMT_2TB_FILESIZE: AttrgroupT = 0x00000800u
public const val VOL_CAP_FMT_OPENDENYMODES: AttrgroupT = 0x00001000u
public const val VOL_CAP_FMT_HIDDEN_FILES: AttrgroupT = 0x00002000u
public const val VOL_CAP_FMT_PATH_FROM_ID: AttrgroupT = 0x00004000u
public const val VOL_CAP_FMT_NO_VOLUME_SIZES: AttrgroupT = 0x00008000u
public const val VOL_CAP_FMT_DECMPFS_COMPRESSION: AttrgroupT = 0x00010000u
public const val VOL_CAP_FMT_64BIT_OBJECT_IDS: AttrgroupT = 0x00020000u
public const val VOL_CAP_FMT_DIR_HARDLINKS: AttrgroupT = 0x00040000u
public const val VOL_CAP_FMT_DOCUMENT_ID: AttrgroupT = 0x00080000u
public const val VOL_CAP_FMT_WRITE_GENERATION_COUNT: AttrgroupT = 0x00100000u
public const val VOL_CAP_FMT_NO_IMMUTABLE_FILES: AttrgroupT = 0x00200000u
public const val VOL_CAP_FMT_NO_PERMISSIONS: AttrgroupT = 0x00400000u
public const val VOL_CAP_FMT_SHARED_SPACE: AttrgroupT = 0x00800000u
public const val VOL_CAP_FMT_VOL_GROUPS: AttrgroupT = 0x01000000u
public const val VOL_CAP_FMT_SEALED: AttrgroupT = 0x02000000u
public const val VOL_CAP_INT_SEARCHFS: AttrgroupT = 0x00000001u
public const val VOL_CAP_INT_ATTRLIST: AttrgroupT = 0x00000002u
public const val VOL_CAP_INT_NFSEXPORT: AttrgroupT = 0x00000004u
public const val VOL_CAP_INT_READDIRATTR: AttrgroupT = 0x00000008u
public const val VOL_CAP_INT_EXCHANGEDATA: AttrgroupT = 0x00000010u
public const val VOL_CAP_INT_COPYFILE: AttrgroupT = 0x00000020u
public const val VOL_CAP_INT_ALLOCATE: AttrgroupT = 0x00000040u
public const val VOL_CAP_INT_VOL_RENAME: AttrgroupT = 0x00000080u
public const val VOL_CAP_INT_ADVLOCK: AttrgroupT = 0x00000100u
public const val VOL_CAP_INT_FLOCK: AttrgroupT = 0x00000200u
public const val VOL_CAP_INT_EXTENDED_SECURITY: AttrgroupT = 0x00000400u
public const val VOL_CAP_INT_USERACCESS: AttrgroupT = 0x00000800u
public const val VOL_CAP_INT_MANLOCK: AttrgroupT = 0x00001000u
public const val VOL_CAP_INT_NAMEDSTREAMS: AttrgroupT = 0x00002000u
public const val VOL_CAP_INT_EXTENDED_ATTR: AttrgroupT = 0x00004000u
public const val VOL_CAP_INT_CLONE: AttrgroupT = 0x00010000u
public const val VOL_CAP_INT_SNAPSHOT: AttrgroupT = 0x00020000u
public const val VOL_CAP_INT_RENAME_SWAP: AttrgroupT = 0x00040000u
public const val VOL_CAP_INT_RENAME_EXCL: AttrgroupT = 0x00080000u
public const val VOL_CAP_INT_RENAME_OPENFAIL: AttrgroupT = 0x00100000u
public const val OS_CLOCK_MACH_ABSOLUTE_TIME: OsClockidT = 32u
public const val OS_SYNC_WAIT_ON_ADDRESS_NONE: OsSyncWaitOnAddressFlagsT = 0x00000000u
public const val OS_SYNC_WAIT_ON_ADDRESS_SHARED: OsSyncWaitOnAddressFlagsT = 0x00000001u
public const val OS_SYNC_WAKE_BY_ADDRESS_NONE: OsSyncWakeByAddressFlagsT = 0x00000000u
public const val OS_SYNC_WAKE_BY_ADDRESS_SHARED: OsSyncWakeByAddressFlagsT = 0x00000001u
public const val SIDL: UInt = 1u
public const val SRUN: UInt = 2u
public const val SSLEEP: UInt = 3u
public const val SSTOP: UInt = 4u
public const val SZOMB: UInt = 5u
public const val VMADDR_CID_ANY: CUInt = 0xFFFFFFFFu
public const val VMADDR_CID_HYPERVISOR: CUInt = 0u
public const val VMADDR_CID_RESERVED: CUInt = 1u
public const val VMADDR_CID_HOST: CUInt = 2u
public const val VMADDR_PORT_ANY: CUInt = 0xFFFFFFFFu
public const val IFMIB_SYSTEM: CInt = 1
public const val IFMIB_IFDATA: CInt = 2
public const val IFMIB_IFALLDATA: CInt = 3
public const val IFDATA_GENERAL: CInt = 1
public const val IFDATA_LINKSPECIFIC: CInt = 2
public const val IFDATA_ADDRS: CInt = 3
public const val IFDATA_MULTIADDRS: CInt = 4
public const val IFMIB_IFCOUNT: CInt = 1
public const val NETLINK_GENERIC: CInt = 0
public const val DOT3COMPLIANCE_STATS: CInt = 1
public const val DOT3COMPLIANCE_COLLS: CInt = 2
public const val MAX_KCTL_NAME: ULong = 96uL

// __DARWIN_ALIGNBYTES32 is size_of<u32>() - 1.
public fun __DARWIN_ALIGN32(p: ULong): ULong = (p + 3uL) and (3uL).inv()

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?

public expect fun setgrent()

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt

public expect fun aioRead(aiocbp: Aiocb?): CInt

public expect fun aioWrite(aiocbp: Aiocb?): CInt

public expect fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt

public expect fun aioError(aiocbp: Aiocb?): CInt

public expect fun aioReturn(aiocbp: Aiocb?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt

public expect fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt

public expect fun chflags(path: String?, flags: CUInt): CInt

public expect fun fchflags(fd: CInt, flags: CUInt): CInt

public expect fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun lutimes(file: String?, times: Timeval?): CInt

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun getutxent(): Utmpx?

public expect fun getutxid(ut: Utmpx?): Utmpx?

public expect fun getutxline(ut: Utmpx?): Utmpx?

public expect fun pututxline(ut: Utmpx?): Utmpx?

public expect fun setutxent()

public expect fun endutxent()

public expect fun utmpxname(file: String?): CInt

public expect fun asctime(tm: Tm?): String?

public expect fun ctime(clock: TimeT?): String?

public expect fun getdate(datestr: String?): Tm?

public expect fun strptime(buf: String?, format: String?, timeptr: Tm?): String?

public expect fun asctimeR(tm: Tm?, result: String?): String?

public expect fun ctimeR(clock: TimeT?, result: String?): String?

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt

public expect fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): CInt

public expect fun sysctlnametomib(name: String?, mibp: CInt?, sizep: ULong?): CInt

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt

public expect fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt

public expect fun shmOpen(name: String?, oflag: CInt, vararg args: Any?): CInt

public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt

public expect fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt

public expect fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt

public expect fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt

public expect fun machAbsoluteTime(): ULong

public expect fun machTimebaseInfo(info: MachTimebaseInfo?): CInt

public expect fun machHostSelf(): MachPortT

public expect fun machThreadSelf(): MachPortT

public expect fun pthreadCondTimedwaitRelativeNp(cond: PthreadCondT?, lock: PthreadMutexT?, timeout: Timespec?): CInt

public expect fun pthreadAttrGetscope(attr: PthreadAttrT?, contentionscope: CInt?): CInt

public expect fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt

public expect fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt

public expect fun pthreadAttrSetscope(attr: PthreadAttrT?, contentionscope: CInt): CInt

public expect fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt

public expect fun pthreadSetnameNp(name: String?): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt

public expect fun pthreadMachThreadNp(thread: PthreadT): MachPortT

public expect fun pthreadFromMachThreadNp(port: MachPortT): PthreadT

public expect fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer?

public expect fun pthreadGetStacksizeNp(thread: PthreadT): ULong

public expect fun pthreadMainNp(): CInt

public expect fun pthreadThreadidNp(thread: PthreadT, threadId: ULong?): CInt

public expect fun pthreadJitWriteProtectNp(enabled: CInt)

public expect fun pthreadJitWriteProtectSupportedNp(): CInt

public expect fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt

public expect fun pthreadJitWriteFreezeCallbacksNp()

public expect fun pthreadCpuNumberNp(cpuNumberOut: ULong?): CInt

public expect fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT): CInt

public expect fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt

public expect fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt

public expect fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: ULong, flags: OsSyncWakeByAddressFlagsT): CInt

public expect fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: ULong, flags: OsSyncWakeByAddressFlagsT): CInt

public expect fun osUnfairLockLock(lock: OsUnfairLockT)

public expect fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean

public expect fun osUnfairLockUnlock(lock: OsUnfairLockT)

public expect fun osUnfairLockAssertOwner(lock: OsUnfairLockT)

public expect fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT)

public expect fun osLogCreate(subsystem: String?, category: String?): OsLogT

public expect fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean

public expect fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: COpaquePointer?): OsSignpostIdT

public expect fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT

public expect fun osSignpostEnabled(log: OsLogT): Boolean

public expect fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT

public expect fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT?, getDefault: BooleanT?): KernReturnT

public expect fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: MachMsgTypeNumberT?): KernReturnT

public expect fun error(): CInt?

public expect fun backtrace(buf: COpaquePointer?, sz: CInt): CInt

public expect fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer?

public expect fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt)

public expect fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt

public expect fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: ImageOffset?, size: CInt)

public expect fun backtraceAsync(array: COpaquePointer?, length: ULong, taskId: UInt?): ULong

public expect fun statfs(path: String?, buf: Statfs?): CInt

public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt

public expect fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt

public expect fun kevent64(kq: CInt, changelist: Kevent64S?, nchanges: CInt, eventlist: Kevent64S?, nevents: CInt, flags: CUInt, timeout: Timespec?): CInt

public expect fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt

public expect fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: String?, data: CInt): CInt

public expect fun quotactl(special: String?, cmd: CInt, id: CInt, data: String?): CInt

public expect fun sethostname(name: String?, len: CInt): CInt

public expect fun sendfile(fd: CInt, s: CInt, offset: OffT, len: OffT?, hdtr: SfHdtr?, flags: CInt): CInt

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt

public expect fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT

public expect fun loginTty(fd: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT): CInt

public expect fun localeconvL(loc: LocaleT): Lconv?

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun querylocale(mask: CInt, loc: LocaleT): String?

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getdomainname(name: String?, len: CInt): CInt

public expect fun setdomainname(name: String?, len: CInt): CInt

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): SsizeT

public expect fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): SsizeT

public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): CInt

public expect fun listxattr(path: String?, list: String?, size: ULong, flags: CInt): SsizeT

public expect fun flistxattr(filedes: CInt, list: String?, size: ULong, flags: CInt): SsizeT

public expect fun removexattr(path: String?, name: String?, flags: CInt): CInt

public expect fun renamexNp(from: String?, to: String?, flags: CUInt): CInt

public expect fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUInt): CInt

public expect fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt

public expect fun getgrouplist(name: String?, basegid: CInt, groups: CInt?, ngroups: CInt?): CInt

public expect fun initgroups(user: String?, basegroup: CInt): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt

public expect fun brk(addr: COpaquePointer?): COpaquePointer?

public expect fun sbrk(increment: CInt): COpaquePointer?

public expect fun settimeofday(tv: Timeval?, tz: Timezone?): CInt

public expect fun dyldImageCount(): UInt

public expect fun dyldGetImageHeader(imageIndex: UInt): MachHeader?

public expect fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT

public expect fun dyldGetImageName(imageIndex: UInt): String?

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

public expect fun posixSpawnattrSetarchprefNp(attr: PosixSpawnattrT?, count: ULong, pref: CpuTypeT?, subpref: CpuSubtypeT?, ocount: ULong?): CInt

public expect fun posixSpawnattrGetarchprefNp(attr: PosixSpawnattrT?, count: ULong, pref: CpuTypeT?, subpref: CpuSubtypeT?, ocount: ULong?): CInt

public expect fun posixSpawnattrGetbinprefNp(attr: PosixSpawnattrT?, count: ULong, pref: CpuTypeT?, ocount: ULong?): CInt

public expect fun posixSpawnattrSetbinprefNp(attr: PosixSpawnattrT?, count: ULong, pref: CpuTypeT?, ocount: ULong?): CInt

public expect fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt

public expect fun uname(buf: Utsname?): CInt

public expect fun connectx(socket: CInt, endpoints: SaEndpointsT?, associd: SaeAssocidT, flags: CUInt, iov: Iovec?, iovcnt: CUInt, len: ULong?, connid: SaeConnidT?): CInt

public expect fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt

public expect fun ntpAdjtime(buf: Timex?): CInt

public expect fun ntpGettime(buf: Ntptimeval?): CInt

public expect fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt

public expect fun getfsstat(mntbufp: Statfs?, bufsize: CInt, flags: CInt): CInt

public expect fun clonefile(src: String?, dst: String?, flags: UInt): CInt

public expect fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt

public expect fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt

public expect fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt

public expect fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt

public expect fun copyfileStateFree(s: CopyfileStateT): CInt

public expect fun copyfileStateAlloc(): CopyfileStateT

public expect fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt

public expect fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt

public expect fun machErrorString(errorValue: MachErrorT): String?

public expect fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt

public expect fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: ULong)

public expect fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: ULong)

public expect fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: ULong)

public expect fun strtonum(numstr: String?, minval: CLongLong, maxval: CLongLong, errstrp: COpaquePointer?): CLongLong

public expect fun mstats(): Mstats

public expect fun mallocPrintf(format: String?, vararg args: Any?)

public expect fun mallocZoneCheck(zone: MallocZoneT?): BooleanT

public expect fun mallocZonePrint(zone: MallocZoneT?, verbose: BooleanT)

public expect fun mallocZoneStatistics(zone: MallocZoneT?, stats: MallocStatisticsT?)

public expect fun mallocZoneLog(zone: MallocZoneT?, address: COpaquePointer?)

public expect fun mallocZonePrintPtrInfo(ptr: COpaquePointer?)

public expect fun mallocDefaultZone(): MallocZoneT?

public expect fun mallocZoneFromPtr(ptr: COpaquePointer?): MallocZoneT?

public expect fun mallocZoneMalloc(zone: MallocZoneT?, size: ULong): COpaquePointer?

public expect fun mallocZoneValloc(zone: MallocZoneT?, size: ULong): COpaquePointer?

public expect fun mallocZoneCalloc(zone: MallocZoneT?, numItems: ULong, size: ULong): COpaquePointer?

public expect fun mallocZoneRealloc(zone: MallocZoneT?, ptr: COpaquePointer?, size: ULong): COpaquePointer?

public expect fun mallocZoneFree(zone: MallocZoneT?, ptr: COpaquePointer?)

public expect fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt

public expect fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt

public expect fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt

public expect fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt

public expect fun procLibversion(major: CInt?, minor: CInt?): CInt

public expect fun procPidRusage(pid: CInt, flavor: CInt, buffer: RusageInfoT?): CInt

public expect fun procSetNoSmt(): CInt

public expect fun procSetthreadNoSmt(): CInt

public expect fun procSetCsm(flags: UInt): CInt

public expect fun procSetthreadCsm(flags: UInt): CInt

public expect fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): CInt

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong)

public expect fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: ULong): CCRNGStatus

public expect fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt

public expect fun nSGetExecutablePath(buf: String?, bufsize: UInt?): CInt

public expect fun nSGetArgv(): COpaquePointer?

public expect fun nSGetArgc(): CInt?

public expect fun nSGetEnviron(): COpaquePointer?

public expect fun nSGetProgname(): COpaquePointer?

public expect fun machVmMap(targetTask: VmMapT, address: MachVmAddressT?, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, `object`: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT

public expect fun vmAllocate(targetTask: VmMapT, address: VmAddressT?, size: VmSizeT, flags: CInt): KernReturnT

public expect fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT

public expect fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: MachMsgTypeNumberT?): KernReturnT

public expect fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: NaturalT?, outProcessorInfo: ProcessorInfoArrayT?, outProcessorInfoCnt: MachMsgTypeNumberT?): KernReturnT

public expect fun taskForPid(host: MachPortT, pid: PidT, task: MachPortT?): KernReturnT

public expect fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: MachMsgTypeNumberT?): KernReturnT

public expect fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: TaskT?): KernReturnT

public expect fun taskTerminate(targetTask: TaskT): KernReturnT

public expect fun taskThreads(targetTask: TaskInspectT, actList: ThreadActArrayT?, actListCnt: MachMsgTypeNumberT?): KernReturnT

public expect fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: MachMsgTypeNumberT?): KernReturnT

public expect fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState

public expect fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: String?): SysdirSearchPathEnumerationState

public expect fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt

public expect fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt

public expect fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: CULong): CInt

public expect fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt

public expect fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt

public expect fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt

public expect fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: ULong): CInt

public expect fun mallocSize(ptr: COpaquePointer?): ULong

public expect fun mallocGoodSize(size: ULong): ULong

public expect fun dirname(path: String?): String?

public expect fun basename(path: String?): String?

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun freadlink(fd: CInt, buf: String?, size: ULong): CInt

public expect fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt

public expect fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?)

public expect fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer?

public expect fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT

public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT

public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong

public expect fun iconvClose(cd: IconvT): CInt
