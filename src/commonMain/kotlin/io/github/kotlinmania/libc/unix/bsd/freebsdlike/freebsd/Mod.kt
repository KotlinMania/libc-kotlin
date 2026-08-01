// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.CLOCK_UPTIME
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.CLOCK_REALTIME_FAST
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.CLOCK_MONOTONIC_FAST
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.RLIM_INFINITY
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.RlimT

public const val PATH_MAX: CInt = 4096
public typealias FflagsT = UInt
public typealias VmProtT = UChar
public typealias KvaddrT = ULong
public typealias SegszT = Long
public typealias FixptT = UInt
public typealias LwpidT = Int
public typealias BlksizeT = Int
public typealias KsizeT = ULong
public typealias InpGenT = ULong
public typealias SoGenT = ULong
public typealias ClockidT = CInt
public typealias SemT = Sem
public typealias TimerT = CAnonymousTimer?
public typealias FsblkcntT = ULong
public typealias FsfilcntT = ULong
public typealias IdtypeT = CUInt
public typealias MsglenT = CULong
public typealias MsgqnumT = CULong
public typealias CpulevelT = CInt
public typealias CpuwhichT = CInt
public typealias MqdT = COpaquePointer?
public typealias PthreadSpinlockT = CAnonymousPthreadSpinlock?
public typealias PthreadBarrierattrT = CAnonymousPthreadBarrierattr?
public typealias PthreadBarrierT = CAnonymousPthreadBarrier?
public typealias UuidT = Uuid
public typealias UInt = CUInt
public typealias UChar = CUChar
public typealias ULong = CULong
public typealias UShort = CUShort
public typealias CaddrT = String?
public typealias FhandleT = Fhandle
public typealias AuIdT = UidT
public typealias AuAsidT = PidT
public typealias CpusetidT = CInt
public typealias SctpAssocT = UInt
public typealias EventfdT = ULong

public data class Aiocb(
    val aioFildes: CInt,
    val aioOffset: OffT,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val unused1: IntArray,
    val unused2: COpaquePointer?,
    val aioLioOpcode: CInt,
    val aioReqprio: CInt,
    val unused3: CLong,
    val unused4: CLong,
    val unused5: COpaquePointer?,
    val aioSigevent: Sigevent,
)

public data class Jail(
    val version: UInt,
    val path: String?,
    val hostname: String?,
    val jailname: String?,
    val ip4s: CUInt,
    val ip6s: CUInt,
    val ip4: InAddr?,
    val ip6: In6Addr?,
)

public data class Statvfs(
    val fBavail: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBlocks: FsblkcntT,
    val fFavail: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFiles: FsfilcntT,
    val fBsize: CULong,
    val fFlag: CULong,
    val fFrsize: CULong,
    val fFsid: CULong,
    val fNamemax: CULong,
)

public data class Sem(
    val data: UIntArray,
)

public data class Sembuf(
    val semNum: CUShort,
    val semOp: CShort,
    val semFlg: CShort,
)

public data class InputEvent(
    val time: Timeval,
    val type: UShort,
    val code: UShort,
    val value: Int,
)

public data class InputAbsinfo(
    val value: Int,
    val minimum: Int,
    val maximum: Int,
    val fuzz: Int,
    val flat: Int,
    val resolution: Int,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgCbytes: MsglenT,
    val msgQnum: MsgqnumT,
    val msgQbytes: MsglenT,
    val msgLspid: PidT,
    val msgLrpid: PidT,
    val msgStime: TimeT,
    val msgRtime: TimeT,
    val msgCtime: TimeT,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: SsizeT,
)

public data class Sockcred(
    val scUid: UidT,
    val scEuid: UidT,
    val scGid: GidT,
    val scEgid: GidT,
    val scNgroups: CInt,
    val scGroups: List<GidT>,
)

public data class PtraceVmEntry(
    val pveEntry: CInt,
    val pveTimestamp: CInt,
    val pveStart: CULong,
    val pveEnd: CULong,
    val pveOffset: CULong,
    val pveProt: CUInt,
    val pvePathlen: CUInt,
    val pveFileid: CLong,
    val pveFsid: UInt,
    val pvePath: String?,
)

public data class PtraceLwpinfo(
    val plLwpid: LwpidT,
    val plEvent: CInt,
    val plFlags: CInt,
    val plSigmask: SigsetT,
    val plSiglist: SigsetT,
    val plSiginfo: SiginfoT,
    val plTdname: ByteArray,
    val plChildPid: PidT,
    val plSyscallCode: CUInt,
    val plSyscallNarg: CUInt,
)

public data class PtraceScRet(
    val srRetval: List<RegisterT>,
    val srError: CInt,
)

public data class PtraceCoredump(
    val pcFd: CInt,
    val pcFlags: UInt,
    val pcLimit: OffT,
)

public data class PtraceScRemote(
    val pscrRet: PtraceScRet,
    val pscrSyscall: CUInt,
    val pscrNargs: CUInt,
    val pscrArgs: RegisterT?,
)

public data class CpusetT(
    val bits: LongArray,
    val bits2: LongArray,
    val bits3: LongArray,
    val bits4: LongArray,
)

public data class CapRightsT(
    val crRights: ULongArray,
)

public data class Umutex(
    val mOwner: LwpidT,
    val mFlags: UInt,
    val mCeilings: UIntArray,
    val mRbLink: UintptrT,
    val mSpare: UIntArray,
)

public data class Ucond(
    val cHasWaiters: UInt,
    val cFlags: UInt,
    val cClockid: UInt,
    val cSpare: UIntArray,
)

public data class Uuid(
    val timeLow: UInt,
    val timeMid: UShort,
    val timeHiAndVersion: UShort,
    val clockSeqLow: UByte,
    val node: UByteArray,
)

public data class CAnonymousPthreadSpinlock(
    val sClock: Umutex,
)

public data class CAnonymousPthreadBarrierattr(
    val pshared: CInt,
)

public data class CAnonymousPthreadBarrier(
    val bLock: Umutex,
    val bCv: Ucond,
    val bCycle: Long,
    val bCount: CInt,
    val bWaiters: CInt,
    val bRefcount: CInt,
    val bDestroying: CInt,
)

public data class KinfoVmentry(
    val kveStructsize: CInt,
    val kveType: CInt,
    val kveStart: ULong,
    val kveEnd: ULong,
    val kveOffset: ULong,
    val kveVnFileid: ULong,
    val kveVnFsidFreebsd11: UInt,
    val kveVnFsid: UInt,
    val kveFlags: CInt,
    val kveResident: CInt,
    val kvePrivateResident: CInt,
    val kveProtection: CInt,
    val kveRefCount: CInt,
    val kveShadowCount: CInt,
    val kveVnType: CInt,
    val kveVnSize: ULong,
    val kveVnRdevFreebsd11: UInt,
    val kveVnRdev: UInt,
    val kveVnMode: UShort,
    val kveStatus: UShort,
    val kveVnFsid2: ULong,
    val kveVnRdev2: ULong,
    val kveIsSpare: IntArray,
    val kveIsSpare2: IntArray,
    val kvePath: List<ByteArray>,
)

public data class CAnonymousFilestat(
    val stqeNext: Filestat?,
)

public data class Filestat(
    val fsType: CInt,
    val fsFlags: CInt,
    val fsFflags: CInt,
    val fsUflags: CInt,
    val fsFd: CInt,
    val fsRefCount: CInt,
    val fsOffset: OffT,
    val fsTypedep: COpaquePointer?,
    val fsPath: String?,
    val next: CAnonymousFilestat,
    val fsCapRights: CapRightsT,
)

public data class FilestatList(
    val stqhFirst: Filestat?,
    val stqhLast: COpaquePointer?,
)

public data class Procstat(
    val tpe: CInt,
    val kd: UintptrT,
    val vmentries: COpaquePointer?,
    val files: COpaquePointer?,
    val argv: COpaquePointer?,
    val envv: COpaquePointer?,
    val core: UintptrT,
)

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public data class CAnonymousTimer(
    val priv: IntArray,
)

public data class Pargs(
    val arRef: UInt,
    val arLength: UInt,
    val arArgs: UByteArray,
)

public data class Priority(
    val priClass: UChar,
    val priLevel: UChar,
    val priNative: UChar,
    val priUser: UChar,
)

public data class KvmSwap(
    val kswDevname: ByteArray,
    val kswUsed: UInt,
    val kswTotal: UInt,
    val kswFlags: CInt,
)

public data class Nlist(
    val nName: String?,
    val nType: CUChar,
    val nOther: CChar,
    val nDesc: CShort,
    val nValue: CULong,
)

public data class KvmNlist(
    val nName: String?,
    val nType: CUChar,
    val nValue: KvaddrT,
)

public data class CAnonymousSem(
    val priv: UintptrT,
)

public data class SemidDs(
    val semPerm: IpcPerm,
    val semBase: CAnonymousSem?,
    val semNsems: CUShort,
    val semOtime: TimeT,
    val semCtime: TimeT,
)

public data class Vmtotal(
    val tVm: ULong,
    val tAvm: ULong,
    val tRm: ULong,
    val tArm: ULong,
    val tVmshr: ULong,
    val tAvmshr: ULong,
    val tRmshr: ULong,
    val tArmshr: ULong,
    val tFree: ULong,
    val tRq: Short,
    val tDw: Short,
    val tPw: Short,
    val tSl: Short,
    val tSw: Short,
    val tPad: UShortArray,
)

public data class Sockstat(
    val inpPpcb: ULong,
    val soAddr: ULong,
    val soPcb: ULong,
    val unpConn: ULong,
    val domFamily: CInt,
    val proto: CInt,
    val soRcvSbState: CInt,
    val soSndSbState: CInt,
    val saLocal: SockaddrStorage,
    val saPeer: SockaddrStorage,
    val type: CInt,
    val dname: ByteArray,
    val sendq: CUInt,
    val recvq: CUInt,
)

public data class Shmstat(
    val size: ULong,
    val mode: UShort,
)

public data class SpacectlRange(
    val rOffset: OffT,
    val rLen: OffT,
)

public data class RusageExt(
    val ruxRuntime: ULong,
    val ruxUticks: ULong,
    val ruxSticks: ULong,
    val ruxIticks: ULong,
    val ruxUu: ULong,
    val ruxSu: ULong,
    val ruxTu: ULong,
)

public data class IfClonereq(
    val ifcrTotal: CInt,
    val ifcrCount: CInt,
    val ifcrBuffer: String?,
)

public data class IfMsghdr(
    val ifmMsglen: CUShort,
    val ifmVersion: CUChar,
    val ifmType: CUChar,
    val ifmAddrs: CInt,
    val ifmFlags: CInt,
    val ifmIndex: CUShort,
    val ifmSpare1: CUShort,
    val ifmData: IfData,
)

public data class IfMsghdrl(
    val ifmMsglen: CUShort,
    val ifmVersion: CUChar,
    val ifmType: CUChar,
    val ifmAddrs: CInt,
    val ifmFlags: CInt,
    val ifmIndex: CUShort,
    val ifmSpare1: CUShort,
    val ifmLen: CUShort,
    val ifmDataOff: CUShort,
    val ifmSpare2: CInt,
    val ifmData: IfData,
)

public data class IfaMsghdr(
    val ifamMsglen: CUShort,
    val ifamVersion: CUChar,
    val ifamType: CUChar,
    val ifamAddrs: CInt,
    val ifamFlags: CInt,
    val ifamIndex: CUShort,
    val ifamSpare1: CUShort,
    val ifamMetric: CInt,
)

public data class IfaMsghdrl(
    val ifamMsglen: CUShort,
    val ifamVersion: CUChar,
    val ifamType: CUChar,
    val ifamAddrs: CInt,
    val ifamFlags: CInt,
    val ifamIndex: CUShort,
    val ifamSpare1: CUShort,
    val ifamLen: CUShort,
    val ifamDataOff: CUShort,
    val ifamMetric: CInt,
    val ifamData: IfData,
)

public data class IfmaMsghdr(
    val ifmamMsglen: CUShort,
    val ifmamVersion: CUChar,
    val ifmamType: CUChar,
    val ifmamAddrs: CInt,
    val ifmamFlags: CInt,
    val ifmamIndex: CUShort,
    val ifmamSpare1: CUShort,
)

public data class IfAnnouncemsghdr(
    val ifanMsglen: CUShort,
    val ifanVersion: CUChar,
    val ifanType: CUChar,
    val ifanIndex: CUShort,
    val ifanName: ByteArray,
    val ifanWhat: CUShort,
)

public data class IfreqBuffer(
    val length: ULong,
    val buffer: COpaquePointer?,
)

public data class Ifaliasreq(
    val ifraName: ByteArray,
    val ifraAddr: Sockaddr,
    val ifraBroadaddr: Sockaddr,
    val ifraMask: Sockaddr,
    val ifraVhid: CInt,
)

public data class Oifaliasreq(
    val ifraName: ByteArray,
    val ifraAddr: Sockaddr,
    val ifraBroadaddr: Sockaddr,
    val ifraMask: Sockaddr,
)

public data class Ifmediareq(
    val ifmName: ByteArray,
    val ifmCurrent: CInt,
    val ifmMask: CInt,
    val ifmStatus: CInt,
    val ifmActive: CInt,
    val ifmCount: CInt,
    val ifmUlist: CInt?,
)

public data class Ifdrv(
    val ifdName: ByteArray,
    val ifdCmd: CULong,
    val ifdLen: ULong,
    val ifdData: COpaquePointer?,
)

public data class Ifi2creq(
    val devAddr: UByte,
    val offset: UByte,
    val len: UByte,
    val spare0: UByte,
    val spare1: UInt,
    val data: UByteArray,
)

public data class Ifrsshash(
    val ifrhName: ByteArray,
    val ifrhFunc: UByte,
    val ifrhSpare0: UByte,
    val ifrhSpare1: UShort,
    val ifrhTypes: UInt,
)

public data class Ifmibdata(
    val ifmdName: ByteArray,
    val ifmdPcount: CInt,
    val ifmdFlags: CInt,
    val ifmdSndLen: CInt,
    val ifmdSndMaxlen: CInt,
    val ifmdSndDrops: CInt,
    val ifmdFiller: IntArray,
    val ifmdData: IfData,
)

public data class IfmibIso88023(
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

public data class CAnonymousPh(
    val ph1: ULong,
    val ph2: ULong,
)

public data class Fid(
    val fidLen: CUShort,
    val fidData0: CUShort,
    val fidData: ByteArray,
)

public data class Fhandle(
    val fhFsid: FsidT,
    val fhFid: Fid,
)

public data class Bintime(
    val sec: TimeT,
    val frac: ULong,
)

public data class Clockinfo(
    val hz: CInt,
    val tick: CInt,
    val spare: CInt,
    val stathz: CInt,
    val profhz: CInt,
)

public typealias DevstatSupportFlags = UInt
public typealias DevstatTypeFlags = UInt
public typealias DevstatPriority = UInt
public typealias DevstatMatchFlags = UInt
public typealias DevstatSelectMode = UInt

public data class CAnonymousStailqEntryDevstat(
    val stqeNext: Devstat?,
)

public data class Devstat(
    val sequence0: UInt,
    val allocated: CInt,
    val startCount: UInt,
    val endCount: UInt,
    val busyFrom: Bintime,
    val devLinks: CAnonymousStailqEntryDevstat,
    val deviceNumber: UInt,
    val deviceName: ByteArray,
    val unitNumber: CInt,
    val bytes: ULongArray,
    val operations: ULongArray,
    val duration: List<Bintime>,
    val busyTime: Bintime,
    val creationTime: Bintime,
    val blockSize: UInt,
    val tagTypes: ULongArray,
    val flags: DevstatSupportFlags,
    val deviceType: DevstatTypeFlags,
    val priority: DevstatPriority,
    val id: COpaquePointer?,
    val sequence1: UInt,
)

public data class DevstatMatch(
    val matchFields: DevstatMatchFlags,
    val deviceType: DevstatTypeFlags,
    val numMatchCategories: CInt,
)

public data class DevstatMatchTable(
    val matchStr: String?,
    val type: DevstatTypeFlags,
    val matchField: DevstatMatchFlags,
)

public data class DeviceSelection(
    val deviceNumber: UInt,
    val deviceName: ByteArray,
    val unitNumber: CInt,
    val selected: CInt,
    val bytes: ULong,
    val position: CInt,
)

public data class Devinfo(
    val devices: Devstat?,
    val memPtr: COpaquePointer?,
    val generation: CLong,
    val numdevs: CInt,
)

public data class Sockcred2(
    val scVersion: CInt,
    val scPid: PidT,
    val scUid: UidT,
    val scEuid: UidT,
    val scGid: GidT,
    val scEgid: GidT,
    val scNgroups: CInt,
    val scGroups: List<GidT>,
)

public data class Ifconf(
    val ifcLen: CInt,
    val ifcIfcu: CAnonymousIfcIfcu,
)

public data class AuMaskT(
    val amSuccess: CUInt,
    val amFailure: CUInt,
)

public data class AuTidT(
    val port: UInt,
    val machine: UInt,
)

public data class AuditinfoT(
    val aiAuid: AuIdT,
    val aiMask: AuMaskT,
    val aiTermid: AuTidT,
    val aiAsid: AuAsidT,
)

public data class TcpFastopen(
    val enable: CInt,
    val psk: UByteArray,
)

public data class TcpFunctionSet(
    val functionSetName: ByteArray,
    val pcbcnt: UInt,
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
    val tcpiDeliveredCe: UInt,
    val tcpiReceivedCe: UInt,
    val tcpiDeliveredE1Bytes: UInt,
    val tcpiDeliveredE0Bytes: UInt,
    val tcpiDeliveredCeBytes: UInt,
    val tcpiReceivedE1Bytes: UInt,
    val tcpiReceivedE0Bytes: UInt,
    val tcpiReceivedCeBytes: UInt,
    val tcpiTotalTlp: UInt,
    val tcpiTotalTlpBytes: ULong,
    val tcpiSndUna: UInt,
    val tcpiSndMax: UInt,
    val tcpiRcvNumsacks: UInt,
    val tcpiRcvAdv: UInt,
    val tcpiDupacks: UInt,
    val tcpiPad: UIntArray,
    val tcpiPad2: UIntArray,
    val tcpiPad3: UIntArray,
)

public data class UmtxTime(
    val timeout: Timespec,
    val flags: UInt,
    val clockid: UInt,
)

public data class ShmLargepageConf(
    val psind: CInt,
    val allocPolicy: CInt,
)

public data class MemoryType(
    val priva: List<UintptrT>,
    val privb: List<UintptrT>,
)

public data class MemoryTypeList(
    val priv: List<UintptrT>,
)

public data class Pidfh(
    val priva: List<ULongArray>,
    val privb: List<UintptrT>,
)

public data class SctpEvent(
    val seAssocId: SctpAssocT,
    val seType: UShort,
    val seOn: UByte,
)

public data class SctpEventSubscribe(
    val sctpDataIoEvent: UByte,
    val sctpAssociationEvent: UByte,
    val sctpAddressEvent: UByte,
    val sctpSendFailureEvent: UByte,
    val sctpPeerErrorEvent: UByte,
    val sctpShutdownEvent: UByte,
    val sctpPartialDeliveryEvent: UByte,
    val sctpAdaptationLayerEvent: UByte,
    val sctpAuthenticationEvent: UByte,
    val sctpSenderDryEvent: UByte,
    val sctpStreamResetEvent: UByte,
)

public data class SctpInitmsg(
    val sinitNumOstreams: UShort,
    val sinitMaxInstreams: UShort,
    val sinitMaxAttempts: UShort,
    val sinitMaxInitTimeo: UShort,
)

public data class SctpSndrcvinfo(
    val sinfoStream: UShort,
    val sinfoSsn: UShort,
    val sinfoFlags: UShort,
    val sinfoPpid: UInt,
    val sinfoContext: UInt,
    val sinfoTimetolive: UInt,
    val sinfoTsn: UInt,
    val sinfoCumtsn: UInt,
    val sinfoAssocId: SctpAssocT,
    val sinfoKeynumber: UShort,
    val sinfoKeynumberValid: UShort,
    val reservePad: List<UByteArray>,
)

public data class SctpExtrcvinfo(
    val sinfoStream: UShort,
    val sinfoSsn: UShort,
    val sinfoFlags: UShort,
    val sinfoPpid: UInt,
    val sinfoContext: UInt,
    val sinfoTimetolive: UInt,
    val sinfoTsn: UInt,
    val sinfoCumtsn: UInt,
    val sinfoAssocId: SctpAssocT,
    val serinfoNextFlags: UShort,
    val serinfoNextStream: UShort,
    val serinfoNextAid: UInt,
    val serinfoNextLength: UInt,
    val serinfoNextPpid: UInt,
    val sinfoKeynumber: UShort,
    val sinfoKeynumberValid: UShort,
    val reservePad: List<UByteArray>,
)

public data class SctpSndinfo(
    val sndSid: UShort,
    val sndFlags: UShort,
    val sndPpid: UInt,
    val sndContext: UInt,
    val sndAssocId: SctpAssocT,
)

public data class SctpPrinfo(
    val prPolicy: UShort,
    val prValue: UInt,
)

public data class SctpDefaultPrinfo(
    val prPolicy: UShort,
    val prValue: UInt,
    val prAssocId: SctpAssocT,
)

public data class SctpAuthinfo(
    val authKeynumber: UShort,
)

public data class SctpRcvinfo(
    val rcvSid: UShort,
    val rcvSsn: UShort,
    val rcvFlags: UShort,
    val rcvPpid: UInt,
    val rcvTsn: UInt,
    val rcvCumtsn: UInt,
    val rcvContext: UInt,
    val rcvAssocId: SctpAssocT,
)

public data class SctpNxtinfo(
    val nxtSid: UShort,
    val nxtFlags: UShort,
    val nxtPpid: UInt,
    val nxtLength: UInt,
    val nxtAssocId: SctpAssocT,
)

public data class SctpRecvvRn(
    val recvvRcvinfo: SctpRcvinfo,
    val recvvNxtinfo: SctpNxtinfo,
)

public data class SctpSendvSpa(
    val sendvFlags: UInt,
    val sendvSndinfo: SctpSndinfo,
    val sendvPrinfo: SctpPrinfo,
    val sendvAuthinfo: SctpAuthinfo,
)

public data class SctpSndAllCompletes(
    val sallStream: UShort,
    val sallFlags: UShort,
    val sallPpid: UInt,
    val sallContext: UInt,
    val sallNumSent: UInt,
    val sallNumFailed: UInt,
)

public data class SctpPcbinfo(
    val epCount: UInt,
    val asocCount: UInt,
    val laddrCount: UInt,
    val raddrCount: UInt,
    val chkCount: UInt,
    val readqCount: UInt,
    val freeChunks: UInt,
    val streamOque: UInt,
)

public data class SctpSockstat(
    val ssAssocId: SctpAssocT,
    val ssTotalSndbuf: UInt,
    val ssTotalRecvBuf: UInt,
)

public data class SctpAssocChange(
    val sacType: UShort,
    val sacFlags: UShort,
    val sacLength: UInt,
    val sacState: UShort,
    val sacError: UShort,
    val sacOutboundStreams: UShort,
    val sacInboundStreams: UShort,
    val sacAssocId: SctpAssocT,
    val sacInfo: UByteArray,
)

public data class SctpPaddrChange(
    val spcType: UShort,
    val spcFlags: UShort,
    val spcLength: UInt,
    val spcAaddr: SockaddrStorage,
    val spcState: UInt,
    val spcError: UInt,
    val spcAssocId: SctpAssocT,
)

public data class SctpRemoteError(
    val sreType: UShort,
    val sreFlags: UShort,
    val sreLength: UInt,
    val sreError: UShort,
    val sreAssocId: SctpAssocT,
    val sreData: UByteArray,
)

public data class SctpSendFailedEvent(
    val ssfeType: UShort,
    val ssfeFlags: UShort,
    val ssfeLength: UInt,
    val ssfeError: UInt,
    val ssfeInfo: SctpSndinfo,
    val ssfeAssocId: SctpAssocT,
    val ssfeData: UByteArray,
)

public data class SctpShutdownEvent(
    val sseType: UShort,
    val sseFlags: UShort,
    val sseLength: UInt,
    val sseAssocId: SctpAssocT,
)

public data class SctpAdaptationEvent(
    val saiType: UShort,
    val saiFlags: UShort,
    val saiLength: UInt,
    val saiAdaptationInd: UInt,
    val saiAssocId: SctpAssocT,
)

public data class SctpSetadaptation(
    val ssbAdaptationInd: UInt,
)

public data class SctpPdapiEvent(
    val pdapiType: UShort,
    val pdapiFlags: UShort,
    val pdapiLength: UInt,
    val pdapiIndication: UInt,
    val pdapiStream: UShort,
    val pdapiSeq: UShort,
    val pdapiAssocId: SctpAssocT,
)

public data class SctpSenderDryEvent(
    val senderDryType: UShort,
    val senderDryFlags: UShort,
    val senderDryLength: UInt,
    val senderDryAssocId: SctpAssocT,
)

public data class SctpStreamResetEvent(
    val strresetType: UShort,
    val strresetFlags: UShort,
    val strresetLength: UInt,
    val strresetAssocId: SctpAssocT,
    val strresetStreamList: UShortArray,
)

public data class SctpStreamChangeEvent(
    val strchangeType: UShort,
    val strchangeFlags: UShort,
    val strchangeLength: UInt,
    val strchangeAssocId: SctpAssocT,
    val strchangeInstrms: UShort,
    val strchangeOutstrms: UShort,
)

public data class Filedesc(
    val fdFiles: Fdescenttbl?,
    val fdMap: CULong?,
    val fdFreefile: CInt,
    val fdRefcnt: CInt,
    val fdHoldcnt: CInt,
    val fdSx: Sx,
    val fdKqlist: Kqlist,
    val fdHoldleaderscount: CInt,
    val fdHoldleaderswakeup: CInt,
)

public data class Fdescenttbl(
    val fdtNfiles: CInt,
    val fdtOfiles: List<COpaquePointer?>,
)

public data class Sx(
    val lockObject: LockObject,
    val sxLock: UintptrT,
)

public data class LockObject(
    val loName: String?,
    val loFlags: CUInt,
    val loData: CUInt,
    val loWitness: COpaquePointer?,
)

public data class Kqlist(
    val tqhFirst: COpaquePointer?,
    val tqhLast: COpaquePointer?,
)

public data class Splice(
    val spFd: CInt,
    val spMax: OffT,
    val spIdle: Timeval,
)

public data class Utmpx(
    val utType: CShort,
    val utTv: Timeval,
    val utId: ByteArray,
    val utPid: PidT,
    val utUser: ByteArray,
    val utLine: ByteArray,
    val utHost: ByteArray,
    val utSpare: ByteArray,
)

public data class Xucred(
    val crVersion: CUInt,
    val crUid: UidT,
    val crNgroups: CShort,
    val crGroups: List<GidT>,
    val crPidCAnonymousUnion: CAnonymousCrPid,
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

public data class MqAttr(
    val mqFlags: CLong,
    val mqMaxmsg: CLong,
    val mqMsgsize: CLong,
    val mqCurmsgs: CLong,
)

public data class Ptsstat(
    val dev: ULong,
    val dev2: UInt,
    val devname: ByteArray,
)

public data class Elf32Auxinfo(
    val aType: CInt,
    val aUn: CAnonymousElf32AuxvUnion,
)

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
)

public data class IfData(
    val ifiType: UByte,
    val ifiPhysical: UByte,
    val ifiAddrlen: UByte,
    val ifiHdrlen: UByte,
    val ifiLinkState: UByte,
    val ifiVhid: UByte,
    val ifiDatalen: UShort,
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
    val ifiOqdrops: ULong,
    val ifiNoproto: ULong,
    val ifiHwassist: ULong,
    val ifiEpoch: CAnonymousIfiEpoch,
    val ifiLastchange: CAnonymousIfiLastchange,
)

public data class Ifstat(
    val ifsName: ByteArray,
    val ascii: ByteArray,
)

public data class Ifrsskey(
    val ifrkName: ByteArray,
    val ifrkFunc: UByte,
    val ifrkSpare0: UByte,
    val ifrkKeylen: UShort,
    val ifrkKey: UByteArray,
)

public data class Ifdownreason(
    val ifdrName: ByteArray,
    val ifdrReason: UInt,
    val ifdrVendor: UInt,
    val ifdrMsg: ByteArray,
)

public data class Sctphdr(
    val srcPort: UShort,
    val destPort: UShort,
    val vTag: UInt,
    val checksum: UInt,
)

public data class SctpChunkhdr(
    val chunkType: UByte,
    val chunkFlags: UByte,
    val chunkLength: UShort,
)

public data class SctpParamhdr(
    val paramType: UShort,
    val paramLength: UShort,
)

public data class SctpGenErrorCause(
    val code: UShort,
    val length: UShort,
    val info: UByteArray,
)

public data class SctpErrorCause(
    val code: UShort,
    val length: UShort,
)

public data class SctpErrorInvalidStream(
    val cause: SctpErrorCause,
    val streamId: UShort,
)

public data class SctpErrorMissingParam(
    val cause: SctpErrorCause,
    val numMissingParams: UInt,
    val tpe: UByteArray,
)

public data class SctpErrorStaleCookie(
    val cause: SctpErrorCause,
    val staleTime: UInt,
)

public data class SctpErrorOutOfResource(
    val cause: SctpErrorCause,
)

public data class SctpErrorUnresolvAddr(
    val cause: SctpErrorCause,
)

public data class SctpErrorUnrecognizedChunk(
    val cause: SctpErrorCause,
    val ch: SctpChunkhdr,
)

public data class SctpErrorNoUserData(
    val cause: SctpErrorCause,
    val tsn: UInt,
)

public data class SctpErrorAuthInvalidHmac(
    val cause: SctpErrorCause,
    val hmacId: UShort,
)

public data class KinfoFile(
    val kfStructsize: CInt,
    val kfType: CInt,
    val kfFd: CInt,
    val kfRefCount: CInt,
    val kfFlags: CInt,
    val kfOffset: Long,
    val priv: UByteArray,
    val kfStatus: UShort,
    val kfIspare0: CInt,
    val kfCapRights: CapRightsT,
    val kfCapSpare: ULong,
    val kfPath: ByteArray,
)

public data class Sigevent(
    val sigevNotify: CInt,
    val sigevSigno: CInt,
    val sigevValue: Sigval,
    val sigevNotifyThreadId: LwpidT,
    val unused1: CInt,
    val unused2: LongArray,
)

public data class UcontextT(
    val ucSigmask: SigsetT,
    val ucMcontext: McontextT,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucFlags: CInt,
    val spare: IntArray,
)

public data class Xinpgen(
    val xigLen: KsizeT,
    val xigCount: UInt,
    val xigSpare32: UInt,
    val xigGen: InpGenT,
    val xigSogen: SoGenT,
    val xigSpare64: ULongArray,
)

public data class InAddr4in6(
    val ia46Addr4: InAddr,
)

public data class InEndpoints(
    val ieFport: UShort,
    val ieLport: UShort,
    val ieDependfaddr: InDependaddr,
    val ieDependladdr: InDependaddr,
    val ie6Zoneid: UInt,
)

public data class InConninfo(
    val incFlags: UByte,
    val incLen: UByte,
    val incFibnum: UShort,
    val incIe: InEndpoints,
)

public data class XktlsSessionOnedir(
    val gennum: ULong,
    val rsrv1: ULongArray,
    val rsrv2: UIntArray,
    val iv: UByteArray,
    val cipherAlgorithm: Int,
    val authAlgorithm: Int,
    val cipherKeyLen: UShort,
    val ivLen: UShort,
    val authKeyLen: UShort,
    val maxFrameLen: UShort,
    val tlsVmajor: UByte,
    val tlsVminor: UByte,
    val tlsHlen: UByte,
    val tlsTlen: UByte,
    val tlsBs: UByte,
    val flags: UByte,
    val drvStLen: UShort,
    val ifnet: ByteArray,
)

public data class XktlsSession(
    val tsz: UInt,
    val fsz: UInt,
    val inpGencnt: ULong,
    val soPcb: KvaddrT,
    val coninf: InConninfo,
    val rxVlanId: CUShort,
    val rcv: XktlsSessionOnedir,
    val snd: XktlsSessionOnedir,
)

// C union; only one variant is valid at a time.
public data class CAnonymousCrPid(
    val crPid: PidT? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousElf32AuxvUnion(
    val aVal: CInt? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfiEpoch(
    val tt: TimeT? = null,
    val ph: ULong? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfiLastchange(
    val tv: Timeval? = null,
    val ph: CAnonymousPh? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val ifruBuffer: IfreqBuffer? = null,
    val ifruFlags: ShortArray? = null,
    val ifruIndex: CShort? = null,
    val ifruJid: CInt? = null,
    val ifruMetric: CInt? = null,
    val ifruMtu: CInt? = null,
    val ifruPhys: CInt? = null,
    val ifruMedia: CInt? = null,
    val ifruData: CaddrT? = null,
    val ifruCap: IntArray? = null,
    val ifruFib: CUInt? = null,
    val ifruVlanPcp: CUChar? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfcIfcu(
    val ifcuBuf: CaddrT? = null,
    val ifcuReq: Ifreq? = null,
)

// C union; only one variant is valid at a time.
public data class InDependaddr(
    val id46Addr: InAddr4in6? = null,
    val id6Addr: In6Addr? = null,
)

public const val LIO_VECTORED: CInt = 4
public const val LIO_WRITEV: CInt = 5
public const val LIO_READV: CInt = 6
public const val CAP_RIGHTS_VERSION_00: Int = 0

internal fun capRight(idx: Int, bit: ULong): ULong = (1uL shl (57 + idx)) or bit
public const val CAP_RIGHTS_VERSION: Int = CAP_RIGHTS_VERSION_00
public val CAP_READ: ULong = capRight(0, 0x0000000000000001uL)
public val CAP_WRITE: ULong = capRight(0, 0x0000000000000002uL)
public val CAP_SEEK_TELL: ULong = capRight(0, 0x0000000000000004uL)
public val CAP_SEEK: ULong = CAP_SEEK_TELL or 0x0000000000000008uL
public val CAP_PREAD: ULong = CAP_SEEK or CAP_READ
public val CAP_PWRITE: ULong = CAP_SEEK or CAP_WRITE
public val CAP_MMAP: ULong = capRight(0, 0x0000000000000010uL)
public val CAP_MMAP_R: ULong = CAP_MMAP or CAP_SEEK or CAP_READ
public val CAP_MMAP_W: ULong = CAP_MMAP or CAP_SEEK or CAP_WRITE
public val CAP_MMAP_X: ULong = CAP_MMAP or CAP_SEEK or 0x0000000000000020uL
public val CAP_MMAP_RW: ULong = CAP_MMAP_R or CAP_MMAP_W
public val CAP_MMAP_RX: ULong = CAP_MMAP_R or CAP_MMAP_X
public val CAP_MMAP_WX: ULong = CAP_MMAP_W or CAP_MMAP_X
public val CAP_MMAP_RWX: ULong = CAP_MMAP_R or CAP_MMAP_W or CAP_MMAP_X
public val CAP_CREATE: ULong = capRight(0, 0x0000000000000040uL)
public val CAP_FEXECVE: ULong = capRight(0, 0x0000000000000080uL)
public val CAP_FSYNC: ULong = capRight(0, 0x0000000000000100uL)
public val CAP_FTRUNCATE: ULong = capRight(0, 0x0000000000000200uL)
public val CAP_LOOKUP: ULong = capRight(0, 0x0000000000000400uL)
public val CAP_FCHDIR: ULong = capRight(0, 0x0000000000000800uL)
public val CAP_FCHFLAGS: ULong = capRight(0, 0x0000000000001000uL)
public val CAP_CHFLAGSAT: ULong = CAP_FCHFLAGS or CAP_LOOKUP
public val CAP_FCHMOD: ULong = capRight(0, 0x0000000000002000uL)
public val CAP_FCHMODAT: ULong = CAP_FCHMOD or CAP_LOOKUP
public val CAP_FCHOWN: ULong = capRight(0, 0x0000000000004000uL)
public val CAP_FCHOWNAT: ULong = CAP_FCHOWN or CAP_LOOKUP
public val CAP_FCNTL: ULong = capRight(0, 0x0000000000008000uL)
public val CAP_FLOCK: ULong = capRight(0, 0x0000000000010000uL)
public val CAP_FPATHCONF: ULong = capRight(0, 0x0000000000020000uL)
public val CAP_FSCK: ULong = capRight(0, 0x0000000000040000uL)
public val CAP_FSTAT: ULong = capRight(0, 0x0000000000080000uL)
public val CAP_FSTATAT: ULong = CAP_FSTAT or CAP_LOOKUP
public val CAP_FSTATFS: ULong = capRight(0, 0x0000000000100000uL)
public val CAP_FUTIMES: ULong = capRight(0, 0x0000000000200000uL)
public val CAP_FUTIMESAT: ULong = CAP_FUTIMES or CAP_LOOKUP
public val CAP_LINKAT_TARGET: ULong = CAP_LOOKUP or 0x0000000000400000uL
public val CAP_MKDIRAT: ULong = CAP_LOOKUP or 0x0000000000800000uL
public val CAP_MKFIFOAT: ULong = CAP_LOOKUP or 0x0000000001000000uL
public val CAP_MKNODAT: ULong = CAP_LOOKUP or 0x0000000002000000uL
public val CAP_RENAMEAT_SOURCE: ULong = CAP_LOOKUP or 0x0000000004000000uL
public val CAP_SYMLINKAT: ULong = CAP_LOOKUP or 0x0000000008000000uL
public val CAP_UNLINKAT: ULong = CAP_LOOKUP or 0x0000000010000000uL
public val CAP_ACCEPT: ULong = capRight(0, 0x0000000020000000uL)
public val CAP_BIND: ULong = capRight(0, 0x0000000040000000uL)
public val CAP_CONNECT: ULong = capRight(0, 0x0000000080000000uL)
public val CAP_GETPEERNAME: ULong = capRight(0, 0x0000000100000000uL)
public val CAP_GETSOCKNAME: ULong = capRight(0, 0x0000000200000000uL)
public val CAP_GETSOCKOPT: ULong = capRight(0, 0x0000000400000000uL)
public val CAP_LISTEN: ULong = capRight(0, 0x0000000800000000uL)
public val CAP_PEELOFF: ULong = capRight(0, 0x0000001000000000uL)
public val CAP_RECV: ULong = CAP_READ
public val CAP_SEND: ULong = CAP_WRITE
public val CAP_SETSOCKOPT: ULong = capRight(0, 0x0000002000000000uL)
public val CAP_SHUTDOWN: ULong = capRight(0, 0x0000004000000000uL)
public val CAP_BINDAT: ULong = CAP_LOOKUP or 0x0000008000000000uL
public val CAP_CONNECTAT: ULong = CAP_LOOKUP or 0x0000010000000000uL
public val CAP_LINKAT_SOURCE: ULong = CAP_LOOKUP or 0x0000020000000000uL
public val CAP_RENAMEAT_TARGET: ULong = CAP_LOOKUP or 0x0000040000000000uL
public val CAP_SOCK_CLIENT: ULong = CAP_CONNECT or CAP_GETPEERNAME or CAP_GETSOCKNAME or CAP_GETSOCKOPT or CAP_PEELOFF or CAP_RECV or CAP_SEND or CAP_SETSOCKOPT or CAP_SHUTDOWN
public val CAP_SOCK_SERVER: ULong = CAP_ACCEPT or CAP_BIND or CAP_GETPEERNAME or CAP_GETSOCKNAME or CAP_GETSOCKOPT or CAP_LISTEN or CAP_PEELOFF or CAP_RECV or CAP_SEND or CAP_SETSOCKOPT or CAP_SHUTDOWN
public val CAP_ALL0: ULong = capRight(0, 0x000007FFFFFFFFFFuL)
public val CAP_UNUSED0_44: ULong = capRight(0, 0x0000080000000000uL)
public val CAP_UNUSED0_57: ULong = capRight(0, 0x0100000000000000uL)
public val CAP_MAC_GET: ULong = capRight(1, 0x0000000000000001uL)
public val CAP_MAC_SET: ULong = capRight(1, 0x0000000000000002uL)
public val CAP_SEM_GETVALUE: ULong = capRight(1, 0x0000000000000004uL)
public val CAP_SEM_POST: ULong = capRight(1, 0x0000000000000008uL)
public val CAP_SEM_WAIT: ULong = capRight(1, 0x0000000000000010uL)
public val CAP_EVENT: ULong = capRight(1, 0x0000000000000020uL)
public val CAP_KQUEUE_EVENT: ULong = capRight(1, 0x0000000000000040uL)
public val CAP_IOCTL: ULong = capRight(1, 0x0000000000000080uL)
public val CAP_TTYHOOK: ULong = capRight(1, 0x0000000000000100uL)
public val CAP_PDGETPID: ULong = capRight(1, 0x0000000000000200uL)
public val CAP_PDWAIT: ULong = capRight(1, 0x0000000000000400uL)
public val CAP_PDKILL: ULong = capRight(1, 0x0000000000000800uL)
public val CAP_EXTATTR_DELETE: ULong = capRight(1, 0x0000000000001000uL)
public val CAP_EXTATTR_GET: ULong = capRight(1, 0x0000000000002000uL)
public val CAP_EXTATTR_LIST: ULong = capRight(1, 0x0000000000004000uL)
public val CAP_EXTATTR_SET: ULong = capRight(1, 0x0000000000008000uL)
public val CAP_ACL_CHECK: ULong = capRight(1, 0x0000000000010000uL)
public val CAP_ACL_DELETE: ULong = capRight(1, 0x0000000000020000uL)
public val CAP_ACL_GET: ULong = capRight(1, 0x0000000000040000uL)
public val CAP_ACL_SET: ULong = capRight(1, 0x0000000000080000uL)
public val CAP_KQUEUE_CHANGE: ULong = capRight(1, 0x0000000000100000uL)
public val CAP_KQUEUE: ULong = CAP_KQUEUE_EVENT or CAP_KQUEUE_CHANGE
public val CAP_ALL1: ULong = capRight(1, 0x00000000001FFFFFuL)
public val CAP_UNUSED1_22: ULong = capRight(1, 0x0000000000200000uL)
public val CAP_UNUSED1_57: ULong = capRight(1, 0x0100000000000000uL)
public val CAP_FCNTL_GETFL: UInt = 1.toUInt() shl 3
public val CAP_FCNTL_SETFL: UInt = 1.toUInt() shl 4
public val CAP_FCNTL_GETOWN: UInt = 1.toUInt() shl 5
public val CAP_FCNTL_SETOWN: UInt = 1.toUInt() shl 6
public const val DEVSTAT_N_TRANS_FLAGS: CInt = 4
public const val DEVSTAT_NAME_LEN: CInt = 16
public const val CPU_SETSIZE: CInt = 1024
public const val SIGEV_THREAD_ID: CInt = 4
public const val EXTATTR_NAMESPACE_EMPTY: CInt = 0
public const val EXTATTR_NAMESPACE_USER: CInt = 1
public const val EXTATTR_NAMESPACE_SYSTEM: CInt = 2
public const val PTHREAD_STACK_MIN: ULong = MINSIGSTKSZ
public const val PTHREAD_MUTEX_ADAPTIVE_NP: CInt = 4
public const val PTHREAD_MUTEX_STALLED: CInt = 0
public const val PTHREAD_MUTEX_ROBUST: CInt = 1
public val SIGSTKSZ: ULong = MINSIGSTKSZ + 32768u
public const val SF_NODISKIO: CInt = 0x00000001
public const val SF_MNOWAIT: CInt = 0x00000002
public const val SF_SYNC: CInt = 0x00000004
public const val SF_USER_READAHEAD: CInt = 0x00000008
public const val SF_NOCACHE: CInt = 0x00000010
public const val O_CLOEXEC: CInt = 0x00100000
public const val O_DIRECTORY: CInt = 0x00020000
public const val O_DSYNC: CInt = 0x01000000
public const val O_EMPTY_PATH: CInt = 0x02000000
public const val O_EXEC: CInt = 0x00040000
public const val O_PATH: CInt = 0x00400000
public const val O_RESOLVE_BENEATH: CInt = 0x00800000
public const val O_SEARCH: CInt = O_EXEC
public const val O_TTY_INIT: CInt = 0x00080000
public const val O_VERIFY: CInt = 0x00200000
public const val F_GETLK: CInt = 11
public const val F_SETLK: CInt = 12
public const val F_SETLKW: CInt = 13
public const val ENOTCAPABLE: CInt = 93
public const val ECAPMODE: CInt = 94
public const val ENOTRECOVERABLE: CInt = 95
public const val EOWNERDEAD: CInt = 96
public const val EINTEGRITY: CInt = 97
public const val RLIMIT_NPTS: CInt = 11
public const val RLIMIT_SWAP: CInt = 12
public const val RLIMIT_KQUEUES: CInt = 13
public const val RLIMIT_UMTXP: CInt = 14
public const val RLIM_NLIMITS: RlimT = 15
public const val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY
public const val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY
public const val CP_USER: CInt = 0
public const val CP_NICE: CInt = 1
public const val CP_SYS: CInt = 2
public const val CP_INTR: CInt = 3
public const val CP_IDLE: CInt = 4
public const val CPUSTATES: CInt = 5
public const val NI_NOFQDN: CInt = 0x00000001
public const val NI_NUMERICHOST: CInt = 0x00000002
public const val NI_NAMEREQD: CInt = 0x00000004
public const val NI_NUMERICSERV: CInt = 0x00000008
public const val NI_DGRAM: CInt = 0x00000010
public const val NI_NUMERICSCOPE: CInt = 0x00000020
public const val XU_NGROUPS: CInt = 16
public const val Q_GETQUOTA: CInt = 0x700
public const val Q_SETQUOTA: CInt = 0x800
public const val MAP_GUARD: CInt = 0x00002000
public const val MAP_EXCL: CInt = 0x00004000
public const val MAP_PREFAULT_READ: CInt = 0x00040000
public const val MAP_ALIGNMENT_SHIFT: CInt = 24
public val MAP_ALIGNMENT_MASK: CInt = 0xff shl MAP_ALIGNMENT_SHIFT
public val MAP_ALIGNED_SUPER: CInt = 1 shl MAP_ALIGNMENT_SHIFT

public fun MAP_ALIGNED(a: CInt): CInt = a shl MAP_ALIGNMENT_SHIFT

public const val POSIX_FADV_NORMAL: CInt = 0
public const val POSIX_FADV_RANDOM: CInt = 1
public const val POSIX_FADV_SEQUENTIAL: CInt = 2
public const val POSIX_FADV_WILLNEED: CInt = 3
public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val POLLINIGNEOF: CShort = 0x2000
public const val POLLRDHUP: CShort = 0x4000
public const val EVFILT_READ: Short = -1
public const val EVFILT_WRITE: Short = -2
public const val EVFILT_AIO: Short = -3
public const val EVFILT_VNODE: Short = -4
public const val EVFILT_PROC: Short = -5
public const val EVFILT_SIGNAL: Short = -6
public const val EVFILT_TIMER: Short = -7
public const val EVFILT_PROCDESC: Short = -8
public const val EVFILT_FS: Short = -9
public const val EVFILT_LIO: Short = -10
public const val EVFILT_USER: Short = -11
public const val EVFILT_SENDFILE: Short = -12
public const val EVFILT_EMPTY: Short = -13
public val EV_ADD: UShort = (0x1).toUShort()
public val EV_DELETE: UShort = (0x2).toUShort()
public val EV_ENABLE: UShort = (0x4).toUShort()
public val EV_DISABLE: UShort = (0x8).toUShort()
public val EV_FORCEONESHOT: UShort = (0x100).toUShort()
public val EV_KEEPUDATA: UShort = (0x200).toUShort()
public val EV_ONESHOT: UShort = (0x10).toUShort()
public val EV_CLEAR: UShort = (0x20).toUShort()
public val EV_RECEIPT: UShort = (0x40).toUShort()
public val EV_DISPATCH: UShort = (0x80).toUShort()
public val EV_SYSFLAGS: UShort = (0xf000).toUShort()
public val EV_DROP: UShort = (0x1000).toUShort()
public val EV_FLAG1: UShort = (0x2000).toUShort()
public val EV_FLAG2: UShort = (0x4000).toUShort()
public val EV_EOF: UShort = (0x8000).toUShort()
public val EV_ERROR: UShort = (0x4000).toUShort()
public const val NOTE_TRIGGER: UInt = 0x01000000u
public const val NOTE_FFNOP: UInt = 0x00000000u
public const val NOTE_FFAND: UInt = 0x40000000u
public const val NOTE_FFOR: UInt = 0x80000000u
public const val NOTE_FFCOPY: UInt = 0xc0000000u
public const val NOTE_FFCTRLMASK: UInt = 0xc0000000u
public const val NOTE_FFLAGSMASK: UInt = 0x00ffffffu
public const val NOTE_LOWAT: UInt = 0x00000001u
public const val NOTE_FILE_POLL: UInt = 0x00000002u
public const val NOTE_DELETE: UInt = 0x00000001u
public const val NOTE_WRITE: UInt = 0x00000002u
public const val NOTE_EXTEND: UInt = 0x00000004u
public const val NOTE_ATTRIB: UInt = 0x00000008u
public const val NOTE_LINK: UInt = 0x00000010u
public const val NOTE_RENAME: UInt = 0x00000020u
public const val NOTE_REVOKE: UInt = 0x00000040u
public const val NOTE_OPEN: UInt = 0x00000080u
public const val NOTE_CLOSE: UInt = 0x00000100u
public const val NOTE_CLOSE_WRITE: UInt = 0x00000200u
public const val NOTE_READ: UInt = 0x00000400u
public const val NOTE_EXIT: UInt = 0x80000000u
public const val NOTE_FORK: UInt = 0x40000000u
public const val NOTE_EXEC: UInt = 0x20000000u
public const val NOTE_PDATAMASK: UInt = 0x000fffffu
public const val NOTE_PCTRLMASK: UInt = 0xf0000000u
public const val NOTE_TRACK: UInt = 0x00000001u
public const val NOTE_TRACKERR: UInt = 0x00000002u
public const val NOTE_CHILD: UInt = 0x00000004u
public const val NOTE_SECONDS: UInt = 0x00000001u
public const val NOTE_MSECONDS: UInt = 0x00000002u
public const val NOTE_USECONDS: UInt = 0x00000004u
public const val NOTE_NSECONDS: UInt = 0x00000008u
public const val NOTE_ABSTIME: UInt = 0x00000010u
public const val MADV_PROTECT: CInt = 10
public const val CTL_UNSPEC: CInt = 0
public const val CTL_SYSCTL: CInt = 0
public const val CTL_KERN: CInt = 1
public const val CTL_VM: CInt = 2
public const val CTL_VFS: CInt = 3
public const val CTL_NET: CInt = 4
public const val CTL_DEBUG: CInt = 5
public const val CTL_HW: CInt = 6
public const val CTL_MACHDEP: CInt = 7
public const val CTL_USER: CInt = 8
public const val CTL_P1003_1B: CInt = 9
public const val CTL_MAXNAME: CInt = 24
public const val CTLTYPE: CInt = 0xf
public const val CTLTYPE_NODE: CInt = 1
public const val CTLTYPE_INT: CInt = 2
public const val CTLTYPE_STRING: CInt = 3
public const val CTLTYPE_S64: CInt = 4
public const val CTLTYPE_OPAQUE: CInt = 5
public const val CTLTYPE_STRUCT: CInt = CTLTYPE_OPAQUE
public const val CTLTYPE_UINT: CInt = 6
public const val CTLTYPE_LONG: CInt = 7
public const val CTLTYPE_ULONG: CInt = 8
public const val CTLTYPE_U64: CInt = 9
public const val CTLTYPE_U8: CInt = 0xa
public const val CTLTYPE_U16: CInt = 0xb
public const val CTLTYPE_S8: CInt = 0xc
public const val CTLTYPE_S16: CInt = 0xd
public const val CTLTYPE_S32: CInt = 0xe
public const val CTLTYPE_U32: CInt = 0xf
public const val CTLFLAG_RD: CInt = -2147483648
public const val CTLFLAG_WR: CInt = 0x40000000
public val CTLFLAG_RW: CInt = CTLFLAG_RD or CTLFLAG_WR
public const val CTLFLAG_DORMANT: CInt = 0x20000000
public const val CTLFLAG_ANYBODY: CInt = 0x10000000
public const val CTLFLAG_SECURE: CInt = 0x08000000
public const val CTLFLAG_PRISON: CInt = 0x04000000
public const val CTLFLAG_DYN: CInt = 0x02000000
public const val CTLFLAG_SKIP: CInt = 0x01000000
public const val CTLMASK_SECURE: CInt = 0x00F00000
public const val CTLFLAG_TUN: CInt = 0x00080000
public val CTLFLAG_RDTUN: CInt = CTLFLAG_RD or CTLFLAG_TUN
public val CTLFLAG_RWTUN: CInt = CTLFLAG_RW or CTLFLAG_TUN
public const val CTLFLAG_MPSAFE: CInt = 0x00040000
public const val CTLFLAG_VNET: CInt = 0x00020000
public const val CTLFLAG_DYING: CInt = 0x00010000
public const val CTLFLAG_CAPRD: CInt = 0x00008000
public const val CTLFLAG_CAPWR: CInt = 0x00004000
public const val CTLFLAG_STATS: CInt = 0x00002000
public const val CTLFLAG_NOFETCH: CInt = 0x00001000
public val CTLFLAG_CAPRW: CInt = CTLFLAG_CAPRD or CTLFLAG_CAPWR
public const val CTLFLAG_NEEDGIANT: CInt = 0x00000800
public const val CTLSHIFT_SECURE: CInt = 20
public val CTLFLAG_SECURE1: CInt = CTLFLAG_SECURE or (0 shl CTLSHIFT_SECURE)
public val CTLFLAG_SECURE2: CInt = CTLFLAG_SECURE or (1 shl CTLSHIFT_SECURE)
public val CTLFLAG_SECURE3: CInt = CTLFLAG_SECURE or (2 shl CTLSHIFT_SECURE)
public const val OID_AUTO: CInt = -1
public const val CTL_SYSCTL_DEBUG: CInt = 0
public const val CTL_SYSCTL_NAME: CInt = 1
public const val CTL_SYSCTL_NEXT: CInt = 2
public const val CTL_SYSCTL_NAME2OID: CInt = 3
public const val CTL_SYSCTL_OIDFMT: CInt = 4
public const val CTL_SYSCTL_OIDDESCR: CInt = 5
public const val CTL_SYSCTL_OIDLABEL: CInt = 6
public const val CTL_SYSCTL_NEXTNOSKIP: CInt = 7
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
public const val KERN_UPDATEINTERVAL: CInt = 23
public const val KERN_OSRELDATE: CInt = 24
public const val KERN_NTP_PLL: CInt = 25
public const val KERN_BOOTFILE: CInt = 26
public const val KERN_MAXFILESPERPROC: CInt = 27
public const val KERN_MAXPROCPERUID: CInt = 28
public const val KERN_DUMPDEV: CInt = 29
public const val KERN_IPC: CInt = 30
public const val KERN_DUMMY: CInt = 31
public const val KERN_PS_STRINGS: CInt = 32
public const val KERN_USRSTACK: CInt = 33
public const val KERN_LOGSIGEXIT: CInt = 34
public const val KERN_IOV_MAX: CInt = 35
public const val KERN_HOSTUUID: CInt = 36
public const val KERN_ARND: CInt = 37
public const val KERN_MAXPHYS: CInt = 38
public const val KERN_PROC_ALL: CInt = 0
public const val KERN_PROC_PID: CInt = 1
public const val KERN_PROC_PGRP: CInt = 2
public const val KERN_PROC_SESSION: CInt = 3
public const val KERN_PROC_TTY: CInt = 4
public const val KERN_PROC_UID: CInt = 5
public const val KERN_PROC_RUID: CInt = 6
public const val KERN_PROC_ARGS: CInt = 7
public const val KERN_PROC_PROC: CInt = 8
public const val KERN_PROC_SV_NAME: CInt = 9
public const val KERN_PROC_RGID: CInt = 10
public const val KERN_PROC_GID: CInt = 11
public const val KERN_PROC_PATHNAME: CInt = 12
public const val KERN_PROC_OVMMAP: CInt = 13
public const val KERN_PROC_OFILEDESC: CInt = 14
public const val KERN_PROC_KSTACK: CInt = 15
public const val KERN_PROC_INC_THREAD: CInt = 0x10
public const val KERN_PROC_VMMAP: CInt = 32
public const val KERN_PROC_FILEDESC: CInt = 33
public const val KERN_PROC_GROUPS: CInt = 34
public const val KERN_PROC_ENV: CInt = 35
public const val KERN_PROC_AUXV: CInt = 36
public const val KERN_PROC_RLIMIT: CInt = 37
public const val KERN_PROC_PS_STRINGS: CInt = 38
public const val KERN_PROC_UMASK: CInt = 39
public const val KERN_PROC_OSREL: CInt = 40
public const val KERN_PROC_SIGTRAMP: CInt = 41
public const val KERN_PROC_CWD: CInt = 42
public const val KERN_PROC_NFDS: CInt = 43
public const val KERN_PROC_SIGFASTBLK: CInt = 44
public const val KIPC_MAXSOCKBUF: CInt = 1
public const val KIPC_SOCKBUF_WASTE: CInt = 2
public const val KIPC_SOMAXCONN: CInt = 3
public const val KIPC_MAX_LINKHDR: CInt = 4
public const val KIPC_MAX_PROTOHDR: CInt = 5
public const val KIPC_MAX_HDR: CInt = 6
public const val KIPC_MAX_DATALEN: CInt = 7
public const val HW_MACHINE: CInt = 1
public const val HW_MODEL: CInt = 2
public const val HW_NCPU: CInt = 3
public const val HW_BYTEORDER: CInt = 4
public const val HW_PHYSMEM: CInt = 5
public const val HW_USERMEM: CInt = 6
public const val HW_PAGESIZE: CInt = 7
public const val HW_DISKNAMES: CInt = 8
public const val HW_DISKSTATS: CInt = 9
public const val HW_FLOATINGPT: CInt = 10
public const val HW_MACHINE_ARCH: CInt = 11
public const val HW_REALMEM: CInt = 12
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
public const val USER_LOCALBASE: CInt = 21
public const val CTL_P1003_1B_ASYNCHRONOUS_IO: CInt = 1
public const val CTL_P1003_1B_MAPPED_FILES: CInt = 2
public const val CTL_P1003_1B_MEMLOCK: CInt = 3
public const val CTL_P1003_1B_MEMLOCK_RANGE: CInt = 4
public const val CTL_P1003_1B_MEMORY_PROTECTION: CInt = 5
public const val CTL_P1003_1B_MESSAGE_PASSING: CInt = 6
public const val CTL_P1003_1B_PRIORITIZED_IO: CInt = 7
public const val CTL_P1003_1B_PRIORITY_SCHEDULING: CInt = 8
public const val CTL_P1003_1B_REALTIME_SIGNALS: CInt = 9
public const val CTL_P1003_1B_SEMAPHORES: CInt = 10
public const val CTL_P1003_1B_FSYNC: CInt = 11
public const val CTL_P1003_1B_SHARED_MEMORY_OBJECTS: CInt = 12
public const val CTL_P1003_1B_SYNCHRONIZED_IO: CInt = 13
public const val CTL_P1003_1B_TIMERS: CInt = 14
public const val CTL_P1003_1B_AIO_LISTIO_MAX: CInt = 15
public const val CTL_P1003_1B_AIO_MAX: CInt = 16
public const val CTL_P1003_1B_AIO_PRIO_DELTA_MAX: CInt = 17
public const val CTL_P1003_1B_DELAYTIMER_MAX: CInt = 18
public const val CTL_P1003_1B_MQ_OPEN_MAX: CInt = 19
public const val CTL_P1003_1B_PAGESIZE: CInt = 20
public const val CTL_P1003_1B_RTSIG_MAX: CInt = 21
public const val CTL_P1003_1B_SEM_NSEMS_MAX: CInt = 22
public const val CTL_P1003_1B_SEM_VALUE_MAX: CInt = 23
public const val CTL_P1003_1B_SIGQUEUE_MAX: CInt = 24
public const val CTL_P1003_1B_TIMER_MAX: CInt = 25
public const val TIOCGPTN: CULong = 0x4004740fuL
public const val TIOCPTMASTER: CULong = 0x2000741cuL
public const val TIOCSIG: CULong = 0x2004745fuL
public const val TIOCM_DCD: CInt = 0x40
public const val H4DISC: CInt = 0x7
public const val VM_TOTAL: CInt = 1
public const val BIOCSETFNR: CULong = 0x80104282uL
public const val FIODGNAME: CULong = 0x80106678uL
public const val FIONWRITE: CULong = 0x40046677uL
public const val FIONSPACE: CULong = 0x40046676uL
public const val FIOSEEKDATA: CULong = 0xc0086661uL
public const val FIOSEEKHOLE: CULong = 0xc0086662uL
public const val FIOSSHMLPGCNF: CULong = 0x80306664uL
public const val JAIL_API_VERSION: UInt = 2u
public const val JAIL_CREATE: CInt = 0x01
public const val JAIL_UPDATE: CInt = 0x02
public const val JAIL_ATTACH: CInt = 0x04
public const val JAIL_DYING: CInt = 0x08
public const val JAIL_SYS_DISABLE: CInt = 0
public const val JAIL_SYS_NEW: CInt = 1
public const val JAIL_SYS_INHERIT: CInt = 2
public const val MNT_ACLS: CInt = 0x08000000
public const val MNT_BYFSID: CInt = 0x08000000
public const val MNT_GJOURNAL: CInt = 0x02000000
public const val MNT_MULTILABEL: CInt = 0x04000000
public const val MNT_NFS4ACLS: CInt = 0x00000010
public const val MNT_SNAPSHOT: CInt = 0x01000000
public const val MNT_UNION: CInt = 0x00000020
public const val MNT_NONBUSY: CInt = 0x04000000
public const val SCM_BINTIME: CInt = 0x04
public const val SCM_REALTIME: CInt = 0x05
public const val SCM_MONOTONIC: CInt = 0x06
public const val SCM_TIME_INFO: CInt = 0x07
public const val SCM_CREDS2: CInt = 0x08
public const val SO_BINTIME: CInt = 0x2000
public const val SO_NO_OFFLOAD: CInt = 0x4000
public const val SO_NO_DDP: CInt = 0x8000
public const val SO_REUSEPORT_LB: CInt = 0x10000
public const val SO_LABEL: CInt = 0x1009
public const val SO_PEERLABEL: CInt = 0x1010
public const val SO_LISTENQLIMIT: CInt = 0x1011
public const val SO_LISTENQLEN: CInt = 0x1012
public const val SO_LISTENINCQLEN: CInt = 0x1013
public const val SO_SETFIB: CInt = 0x1014
public const val SO_USER_COOKIE: CInt = 0x1015
public const val SO_PROTOCOL: CInt = 0x1016
public const val SO_PROTOTYPE: CInt = SO_PROTOCOL
public const val SO_TS_CLOCK: CInt = 0x1017
public const val SO_DOMAIN: CInt = 0x1019
public const val SO_SPLICE: CInt = 0x1023
public const val SO_VENDOR: CInt = -2147483648
public const val SO_TS_REALTIME_MICRO: CInt = 0
public const val SO_TS_BINTIME: CInt = 1
public const val SO_TS_REALTIME: CInt = 2
public const val SO_TS_MONOTONIC: CInt = 3
public const val SO_TS_DEFAULT: CInt = SO_TS_REALTIME_MICRO
public const val SO_TS_CLOCK_MAX: CInt = SO_TS_MONOTONIC
public const val LOCAL_CREDS: CInt = 2
public const val LOCAL_CREDS_PERSISTENT: CInt = 3
public const val LOCAL_CONNWAIT: CInt = 4
public const val LOCAL_VENDOR: CInt = SO_VENDOR
public const val PL_EVENT_NONE: CInt = 0
public const val PL_EVENT_SIGNAL: CInt = 1
public const val PL_FLAG_SA: CInt = 0x01
public const val PL_FLAG_BOUND: CInt = 0x02
public const val PL_FLAG_SCE: CInt = 0x04
public const val PL_FLAG_SCX: CInt = 0x08
public const val PL_FLAG_EXEC: CInt = 0x10
public const val PL_FLAG_SI: CInt = 0x20
public const val PL_FLAG_FORKED: CInt = 0x40
public const val PL_FLAG_CHILD: CInt = 0x80
public const val PL_FLAG_BORN: CInt = 0x100
public const val PL_FLAG_EXITED: CInt = 0x200
public const val PL_FLAG_VFORKED: CInt = 0x400
public const val PL_FLAG_VFORK_DONE: CInt = 0x800
public const val PT_LWPINFO: CInt = 13
public const val PT_GETNUMLWPS: CInt = 14
public const val PT_GETLWPLIST: CInt = 15
public const val PT_CLEARSTEP: CInt = 16
public const val PT_SETSTEP: CInt = 17
public const val PT_SUSPEND: CInt = 18
public const val PT_RESUME: CInt = 19
public const val PT_TO_SCE: CInt = 20
public const val PT_TO_SCX: CInt = 21
public const val PT_SYSCALL: CInt = 22
public const val PT_FOLLOW_FORK: CInt = 23
public const val PT_LWP_EVENTS: CInt = 24
public const val PT_GET_EVENT_MASK: CInt = 25
public const val PT_SET_EVENT_MASK: CInt = 26
public const val PT_GET_SC_ARGS: CInt = 27
public const val PT_GET_SC_RET: CInt = 28
public const val PT_COREDUMP: CInt = 29
public const val PT_GETREGS: CInt = 33
public const val PT_SETREGS: CInt = 34
public const val PT_GETFPREGS: CInt = 35
public const val PT_SETFPREGS: CInt = 36
public const val PT_GETDBREGS: CInt = 37
public const val PT_SETDBREGS: CInt = 38
public const val PT_VM_TIMESTAMP: CInt = 40
public const val PT_VM_ENTRY: CInt = 41
public const val PT_GETREGSET: CInt = 42
public const val PT_SETREGSET: CInt = 43
public const val PT_SC_REMOTE: CInt = 44
public const val PT_FIRSTMACH: CInt = 64
public const val PTRACE_EXEC: CInt = 0x0001
public const val PTRACE_SCE: CInt = 0x0002
public const val PTRACE_SCX: CInt = 0x0004
public val PTRACE_SYSCALL: CInt = PTRACE_SCE or PTRACE_SCX
public const val PTRACE_FORK: CInt = 0x0008
public const val PTRACE_LWP: CInt = 0x0010
public const val PTRACE_VFORK: CInt = 0x0020
public const val PTRACE_DEFAULT: CInt = PTRACE_EXEC
public const val PC_COMPRESS: UInt = 0x00000001u
public const val PC_ALL: UInt = 0x00000002u
public const val PROC_SPROTECT: CInt = 1
public const val PROC_REAP_ACQUIRE: CInt = 2
public const val PROC_REAP_RELEASE: CInt = 3
public const val PROC_REAP_STATUS: CInt = 4
public const val PROC_REAP_GETPIDS: CInt = 5
public const val PROC_REAP_KILL: CInt = 6
public const val PROC_TRACE_CTL: CInt = 7
public const val PROC_TRACE_STATUS: CInt = 8
public const val PROC_TRAPCAP_CTL: CInt = 9
public const val PROC_TRAPCAP_STATUS: CInt = 10
public const val PROC_PDEATHSIG_CTL: CInt = 11
public const val PROC_PDEATHSIG_STATUS: CInt = 12
public const val PROC_ASLR_CTL: CInt = 13
public const val PROC_ASLR_STATUS: CInt = 14
public const val PROC_PROTMAX_CTL: CInt = 15
public const val PROC_PROTMAX_STATUS: CInt = 16
public const val PROC_STACKGAP_CTL: CInt = 17
public const val PROC_STACKGAP_STATUS: CInt = 18
public const val PROC_NO_NEW_PRIVS_CTL: CInt = 19
public const val PROC_NO_NEW_PRIVS_STATUS: CInt = 20
public const val PROC_WXMAP_CTL: CInt = 21
public const val PROC_WXMAP_STATUS: CInt = 22
public const val PROC_PROCCTL_MD_MIN: CInt = 0x10000000
public const val PPROT_SET: CInt = 1
public const val PPROT_CLEAR: CInt = 2
public const val PPROT_DESCEND: CInt = 0x10
public const val PPROT_INHERIT: CInt = 0x20
public const val PROC_TRACE_CTL_ENABLE: CInt = 1
public const val PROC_TRACE_CTL_DISABLE: CInt = 2
public const val PROC_TRACE_CTL_DISABLE_EXEC: CInt = 3
public const val PROC_TRAPCAP_CTL_ENABLE: CInt = 1
public const val PROC_TRAPCAP_CTL_DISABLE: CInt = 2
public const val PROC_ASLR_FORCE_ENABLE: CInt = 1
public const val PROC_ASLR_FORCE_DISABLE: CInt = 2
public const val PROC_ASLR_NOFORCE: CInt = 3
public const val PROC_ASLR_ACTIVE: CInt = -2147483648
public const val PROC_PROTMAX_FORCE_ENABLE: CInt = 1
public const val PROC_PROTMAX_FORCE_DISABLE: CInt = 2
public const val PROC_PROTMAX_NOFORCE: CInt = 3
public const val PROC_PROTMAX_ACTIVE: CInt = -2147483648
public const val PROC_STACKGAP_ENABLE: CInt = 0x0001
public const val PROC_STACKGAP_DISABLE: CInt = 0x0002
public const val PROC_STACKGAP_ENABLE_EXEC: CInt = 0x0004
public const val PROC_STACKGAP_DISABLE_EXEC: CInt = 0x0008
public const val PROC_NO_NEW_PRIVS_ENABLE: CInt = 1
public const val PROC_NO_NEW_PRIVS_DISABLE: CInt = 2
public const val PROC_WX_MAPPINGS_PERMIT: CInt = 0x0001
public const val PROC_WX_MAPPINGS_DISALLOW_EXEC: CInt = 0x0002
public const val PROC_WXORX_ENFORCE: CInt = -2147483648
public const val AF_SLOW: CInt = 33
public const val AF_SCLUSTER: CInt = 34
public const val AF_ARP: CInt = 35
public const val AF_BLUETOOTH: CInt = 36
public const val AF_IEEE80211: CInt = 37
public const val AF_INET_SDP: CInt = 40
public const val AF_INET6_SDP: CInt = 42
public const val IF_MAXUNIT: CInt = 0x7fff
public const val IFF_UP: CInt = 0x1
public const val IFF_BROADCAST: CInt = 0x2
public const val IFF_DEBUG: CInt = 0x4
public const val IFF_LOOPBACK: CInt = 0x8
public const val IFF_POINTOPOINT: CInt = 0x10
public const val IFF_KNOWSEPOCH: CInt = 0x20
public const val IFF_RUNNING: CInt = 0x40
public const val IFF_DRV_RUNNING: CInt = 0x40
public const val IFF_NOARP: CInt = 0x80
public const val IFF_PROMISC: CInt = 0x100
public const val IFF_ALLMULTI: CInt = 0x200
public const val IFF_OACTIVE: CInt = 0x400
public const val IFF_DRV_OACTIVE: CInt = 0x400
public const val IFF_SIMPLEX: CInt = 0x800
public const val IFF_LINK0: CInt = 0x1000
public const val IFF_LINK1: CInt = 0x2000
public const val IFF_LINK2: CInt = 0x4000
public const val IFF_ALTPHYS: CInt = IFF_LINK2
public const val IFF_MULTICAST: CInt = 0x8000
public const val IFF_CANTCONFIG: CInt = 0x10000
public const val IFF_PPROMISC: CInt = 0x20000
public const val IFF_MONITOR: CInt = 0x40000
public const val IFF_STATICARP: CInt = 0x80000
public const val IFF_DYING: CInt = 0x200000
public const val IFF_RENAMING: CInt = 0x400000
public const val IFF_NOGROUP: CInt = 0x800000
public const val LINK_STATE_UNKNOWN: CInt = 0
public const val LINK_STATE_DOWN: CInt = 1
public const val LINK_STATE_UP: CInt = 2
public const val IFCAP_RXCSUM: CInt = 0x00001
public const val IFCAP_TXCSUM: CInt = 0x00002
public const val IFCAP_NETCONS: CInt = 0x00004
public const val IFCAP_VLAN_MTU: CInt = 0x00008
public const val IFCAP_VLAN_HWTAGGING: CInt = 0x00010
public const val IFCAP_JUMBO_MTU: CInt = 0x00020
public const val IFCAP_POLLING: CInt = 0x00040
public const val IFCAP_VLAN_HWCSUM: CInt = 0x00080
public const val IFCAP_TSO4: CInt = 0x00100
public const val IFCAP_TSO6: CInt = 0x00200
public const val IFCAP_LRO: CInt = 0x00400
public const val IFCAP_WOL_UCAST: CInt = 0x00800
public const val IFCAP_WOL_MCAST: CInt = 0x01000
public const val IFCAP_WOL_MAGIC: CInt = 0x02000
public const val IFCAP_TOE4: CInt = 0x04000
public const val IFCAP_TOE6: CInt = 0x08000
public const val IFCAP_VLAN_HWFILTER: CInt = 0x10000
public const val IFCAP_NV: CInt = 0x20000
public const val IFCAP_VLAN_HWTSO: CInt = 0x40000
public const val IFCAP_LINKSTATE: CInt = 0x80000
public const val IFCAP_NETMAP: CInt = 0x100000
public const val IFCAP_RXCSUM_IPV6: CInt = 0x200000
public const val IFCAP_TXCSUM_IPV6: CInt = 0x400000
public const val IFCAP_HWSTATS: CInt = 0x800000
public const val IFCAP_TXRTLMT: CInt = 0x1000000
public const val IFCAP_HWRXTSTMP: CInt = 0x2000000
public const val IFCAP_MEXTPG: CInt = 0x4000000
public const val IFCAP_TXTLS4: CInt = 0x8000000
public const val IFCAP_TXTLS6: CInt = 0x10000000
public const val IFCAP_VXLAN_HWCSUM: CInt = 0x20000000
public const val IFCAP_VXLAN_HWTSO: CInt = 0x40000000
public const val IFCAP_TXTLS_RTLMT: CInt = -2147483648
public val IFCAP_HWCSUM_IPV6: CInt = IFCAP_RXCSUM_IPV6 or IFCAP_TXCSUM_IPV6
public val IFCAP_HWCSUM: CInt = IFCAP_RXCSUM or IFCAP_TXCSUM
public val IFCAP_TSO: CInt = IFCAP_TSO4 or IFCAP_TSO6
public val IFCAP_WOL: CInt = IFCAP_WOL_UCAST or IFCAP_WOL_MCAST or IFCAP_WOL_MAGIC
public val IFCAP_TOE: CInt = IFCAP_TOE4 or IFCAP_TOE6
public val IFCAP_TXTLS: CInt = IFCAP_TXTLS4 or IFCAP_TXTLS6
public val IFCAP_CANTCHANGE: CInt = IFCAP_NETMAP or IFCAP_NV
public const val IFQ_MAXLEN: CInt = 50
public const val IFNET_SLOWHZ: CInt = 1
public const val IFAN_ARRIVAL: CInt = 0
public const val IFAN_DEPARTURE: CInt = 1
public const val IFSTATMAX: CInt = 800
public const val RSS_FUNC_NONE: CInt = 0
public const val RSS_FUNC_PRIVATE: CInt = 1
public const val RSS_FUNC_TOEPLITZ: CInt = 2
public const val RSS_TYPE_IPV4: CInt = 0x00000001
public const val RSS_TYPE_TCP_IPV4: CInt = 0x00000002
public const val RSS_TYPE_IPV6: CInt = 0x00000004
public const val RSS_TYPE_IPV6_EX: CInt = 0x00000008
public const val RSS_TYPE_TCP_IPV6: CInt = 0x00000010
public const val RSS_TYPE_TCP_IPV6_EX: CInt = 0x00000020
public const val RSS_TYPE_UDP_IPV4: CInt = 0x00000040
public const val RSS_TYPE_UDP_IPV6: CInt = 0x00000080
public const val RSS_TYPE_UDP_IPV6_EX: CInt = 0x00000100
public const val RSS_KEYLEN: CInt = 128
public const val IFNET_PCP_NONE: CInt = 0xff
public const val IFDR_MSG_SIZE: CInt = 64
public const val IFDR_REASON_MSG: CInt = 1
public const val IFDR_REASON_VENDOR: CInt = 2
public const val IFMIB_SYSTEM: CInt = 1
public const val IFMIB_IFDATA: CInt = 2
public const val IFDATA_GENERAL: CInt = 1
public const val IFDATA_LINKSPECIFIC: CInt = 2
public const val IFDATA_DRIVERNAME: CInt = 3
public const val IFMIB_IFCOUNT: CInt = 1
public const val NETLINK_GENERIC: CInt = 0
public const val DOT3COMPLIANCE_STATS: CInt = 1
public const val DOT3COMPLIANCE_COLLS: CInt = 2
public const val dot3ChipSetAMD7990: CInt = 1
public const val dot3ChipSetAMD79900: CInt = 2
public const val dot3ChipSetAMD79C940: CInt = 3
public const val dot3ChipSetIntel82586: CInt = 1
public const val dot3ChipSetIntel82596: CInt = 2
public const val dot3ChipSetIntel82557: CInt = 3
public const val dot3ChipSetNational8390: CInt = 1
public const val dot3ChipSetNationalSonic: CInt = 2
public const val dot3ChipSetFujitsu86950: CInt = 1
public const val dot3ChipSetDigitalDC21040: CInt = 1
public const val dot3ChipSetDigitalDC21140: CInt = 2
public const val dot3ChipSetDigitalDC21041: CInt = 3
public const val dot3ChipSetDigitalDC21140A: CInt = 4
public const val dot3ChipSetDigitalDC21142: CInt = 5
public const val dot3ChipSetWesternDigital83C690: CInt = 1
public const val dot3ChipSetWesternDigital83C790: CInt = 2
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
public const val IPPROTO_DCCP: CInt = 33
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
public const val IPPROTO_MOBILE: CInt = 55
public const val IPPROTO_TLSP: CInt = 56
public const val IPPROTO_SKIP: CInt = 57
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
public const val IPPROTO_IPCOMP: CInt = 108
public const val IPPROTO_SCTP: CInt = 132
public const val IPPROTO_MH: CInt = 135
public const val IPPROTO_UDPLITE: CInt = 136
public const val IPPROTO_HIP: CInt = 139
public const val IPPROTO_SHIM6: CInt = 140
public const val IPPROTO_PIM: CInt = 103
public const val IPPROTO_CARP: CInt = 112
public const val IPPROTO_PGM: CInt = 113
public const val IPPROTO_MPLS: CInt = 137
public const val IPPROTO_PFSYNC: CInt = 240
public const val IPPROTO_OLD_DIVERT: CInt = 254
public const val IPPROTO_MAX: CInt = 256
public const val IPPROTO_DONE: CInt = 257
public const val IPPROTO_DIVERT: CInt = 258
public const val IPPROTO_SEND: CInt = 259
public const val TCP_MD5SIG: CInt = 16
public const val TCP_INFO: CInt = 32
public const val TCP_CONGESTION: CInt = 64
public const val TCP_CCALGOOPT: CInt = 65
public const val TCP_MAXUNACKTIME: CInt = 68
public const val TCP_MAXPEAKRATE: CInt = 69
public const val TCP_IDLE_REDUCE: CInt = 70
public const val TCP_REMOTE_UDP_ENCAPS_PORT: CInt = 71
public const val TCP_DELACK: CInt = 72
public const val TCP_FIN_IS_RST: CInt = 73
public const val TCP_LOG_LIMIT: CInt = 74
public const val TCP_SHARED_CWND_ALLOWED: CInt = 75
public const val TCP_PROC_ACCOUNTING: CInt = 76
public const val TCP_USE_CMP_ACKS: CInt = 77
public const val TCP_PERF_INFO: CInt = 78
public const val TCP_LRD: CInt = 79
public const val TCP_KEEPINIT: CInt = 128
public const val TCP_FASTOPEN: CInt = 1025
public const val TCP_PCAP_OUT: CInt = 2048
public const val TCP_PCAP_IN: CInt = 4096
public const val TCP_FUNCTION_BLK: CInt = 8192
public const val TCP_FUNCTION_ALIAS: CInt = 8193
public const val TCP_FASTOPEN_PSK_LEN: CInt = 16
public const val TCP_FUNCTION_NAME_LEN_MAX: CInt = 32
public const val TCP_REUSPORT_LB_NUMA: CInt = 1026
public const val TCP_RACK_MBUF_QUEUE: CInt = 1050
public const val TCP_RACK_TLP_REDUCE: CInt = 1052
public const val TCP_RACK_PACE_MAX_SEG: CInt = 1054
public const val TCP_RACK_PACE_ALWAYS: CInt = 1055
public const val TCP_RACK_PRR_SENDALOT: CInt = 1057
public const val TCP_RACK_MIN_TO: CInt = 1058
public const val TCP_RACK_EARLY_SEG: CInt = 1060
public const val TCP_RACK_REORD_THRESH: CInt = 1061
public const val TCP_RACK_REORD_FADE: CInt = 1062
public const val TCP_RACK_TLP_THRESH: CInt = 1063
public const val TCP_RACK_PKT_DELAY: CInt = 1064
public const val TCP_BBR_IWINTSO: CInt = 1067
public const val TCP_BBR_STARTUP_PG: CInt = 1069
public const val TCP_BBR_DRAIN_PG: CInt = 1070
public const val TCP_BBR_PROBE_RTT_INT: CInt = 1072
public const val TCP_BBR_STARTUP_LOSS_EXIT: CInt = 1074
public const val TCP_BBR_TSLIMITS: CInt = 1076
public const val TCP_BBR_PACE_OH: CInt = 1077
public const val TCP_BBR_USEDEL_RATE: CInt = 1079
public const val TCP_BBR_MIN_RTO: CInt = 1080
public const val TCP_BBR_MAX_RTO: CInt = 1081
public const val TCP_BBR_ALGORITHM: CInt = 1083
public const val TCP_BBR_PACE_PER_SEC: CInt = 1086
public const val TCP_BBR_PACE_DEL_TAR: CInt = 1087
public const val TCP_BBR_PACE_SEG_MAX: CInt = 1088
public const val TCP_BBR_PACE_SEG_MIN: CInt = 1089
public const val TCP_BBR_PACE_CROSS: CInt = 1090
public const val TCP_BBR_TMR_PACE_OH: CInt = 1096
public const val TCP_BBR_RACK_RTT_USE: CInt = 1098
public const val TCP_BBR_RETRAN_WTSO: CInt = 1099
public const val TCP_BBR_PROBE_RTT_GAIN: CInt = 1101
public const val TCP_BBR_PROBE_RTT_LEN: CInt = 1102
public const val TCP_BBR_SEND_IWND_IN_TSO: CInt = 1103
public const val TCP_BBR_USE_RACK_RR: CInt = 1104
public const val TCP_BBR_HDWR_PACE: CInt = 1105
public const val TCP_BBR_UTTER_MAX_TSO: CInt = 1106
public const val TCP_BBR_EXTRA_STATE: CInt = 1107
public const val TCP_BBR_FLOOR_MIN_TSO: CInt = 1108
public const val TCP_BBR_MIN_TOPACEOUT: CInt = 1109
public const val TCP_BBR_TSTMP_RAISES: CInt = 1110
public const val TCP_BBR_POLICER_DETECT: CInt = 1111
public const val TCP_BBR_RACK_INIT_RATE: CInt = 1112
public const val IP_BINDANY: CInt = 24
public const val IP_BINDMULTI: CInt = 25
public const val IP_RSS_LISTEN_BUCKET: CInt = 26
public const val IP_ORIGDSTADDR: CInt = 27
public const val IP_RECVORIGDSTADDR: CInt = IP_ORIGDSTADDR
public const val IP_DONTFRAG: CInt = 67
public const val IP_RECVTOS: CInt = 68
public const val IPV6_BINDANY: CInt = 64
public const val IPV6_ORIGDSTADDR: CInt = 72
public const val IPV6_RECVORIGDSTADDR: CInt = IPV6_ORIGDSTADDR
public const val PF_SLOW: CInt = AF_SLOW
public const val PF_SCLUSTER: CInt = AF_SCLUSTER
public const val PF_ARP: CInt = AF_ARP
public const val PF_BLUETOOTH: CInt = AF_BLUETOOTH
public const val PF_IEEE80211: CInt = AF_IEEE80211
public const val PF_INET_SDP: CInt = AF_INET_SDP
public const val PF_INET6_SDP: CInt = AF_INET6_SDP
public const val NET_RT_DUMP: CInt = 1
public const val NET_RT_FLAGS: CInt = 2
public const val NET_RT_IFLIST: CInt = 3
public const val NET_RT_IFMALIST: CInt = 4
public const val NET_RT_IFLISTL: CInt = 5
public const val IPC_INFO: CInt = 3
public const val MSG_NOERROR: CInt = 4096
public const val SHM_LOCK: CInt = 11
public const val SHM_UNLOCK: CInt = 12
public const val SHM_STAT: CInt = 13
public const val SHM_INFO: CInt = 14
public const val CTL_MAXID: CInt = 10
public const val KERN_MAXID: CInt = 38
public const val HW_MAXID: CInt = 13
public const val USER_MAXID: CInt = 21
public const val CTL_P1003_1B_MAXID: CInt = 26
public const val MSG_NOTIFICATION: CInt = 0x00002000
public const val MSG_NBIO: CInt = 0x00004000
public const val MSG_COMPAT: CInt = 0x00008000
public const val MSG_CMSG_CLOEXEC: CInt = 0x00040000
public const val MSG_NOSIGNAL: CInt = 0x20000
public const val MSG_WAITFORONE: CInt = 0x00080000
public const val EMPTY: CShort = 0
public const val BOOT_TIME: CShort = 1
public const val OLD_TIME: CShort = 2
public const val NEW_TIME: CShort = 3
public const val USER_PROCESS: CShort = 4
public const val INIT_PROCESS: CShort = 5
public const val LOGIN_PROCESS: CShort = 6
public const val DEAD_PROCESS: CShort = 7
public const val SHUTDOWN_TIME: CShort = 8
public const val UTXDB_ACTIVE: CInt = 0
public const val UTXDB_LASTLOGIN: CInt = 1
public const val UTXDB_LOG: CInt = 2
public val LC_COLLATE_MASK: CInt = 1 shl 0
public val LC_CTYPE_MASK: CInt = 1 shl 1
public val LC_MONETARY_MASK: CInt = 1 shl 2
public val LC_NUMERIC_MASK: CInt = 1 shl 3
public val LC_TIME_MASK: CInt = 1 shl 4
public val LC_MESSAGES_MASK: CInt = 1 shl 5
public val LC_ALL_MASK: CInt = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK
public const val WSTOPPED: CInt = 2
public const val WCONTINUED: CInt = 4
public const val WNOWAIT: CInt = 8
public const val WEXITED: CInt = 16
public const val WTRAPPED: CInt = 32
public const val P_PID: IdtypeT = 0u
public const val P_PGID: IdtypeT = 2u
public const val P_ALL: IdtypeT = 7u
public const val UTIME_OMIT: CLong = -2
public const val UTIME_NOW: CLong = -1
public const val B460800: SpeedT = 460800u
public const val B921600: SpeedT = 921600u
public const val AT_FDCWD: CInt = -100
public const val AT_EACCESS: CInt = 0x100
public const val AT_SYMLINK_NOFOLLOW: CInt = 0x200
public const val AT_SYMLINK_FOLLOW: CInt = 0x400
public const val AT_REMOVEDIR: CInt = 0x800
public const val AT_RESOLVE_BENEATH: CInt = 0x2000
public const val AT_EMPTY_PATH: CInt = 0x4000
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
public const val AT_NOTELF: CInt = 10
public const val AT_UID: CInt = 11
public const val AT_EUID: CInt = 12
public const val AT_GID: CInt = 13
public const val AT_EGID: CInt = 14
public const val AT_EXECPATH: CInt = 15
public const val AT_CANARY: CInt = 16
public const val AT_OSRELDATE: CInt = 18
public const val AT_NCPUS: CInt = 19
public const val AT_PAGESIZES: CInt = 20
public const val AT_TIMEKEEP: CInt = 22
public const val AT_HWCAP: CInt = 25
public const val AT_HWCAP2: CInt = 26
public const val AT_USRSTACKBASE: CInt = 35
public const val AT_USRSTACKLIM: CInt = 36
public const val AT_HWCAP3: CInt = 38
public const val AT_HWCAP4: CInt = 39
public const val TABDLY: TcflagT = 0x00000004u
public const val TAB0: TcflagT = 0x00000000u
public const val TAB3: TcflagT = 0x00000004u
public const val _PC_ACL_NFS4: CInt = 64
public const val _SC_CPUSET_SIZE: CInt = 122
public const val _UUID_NODE_LEN: ULong = 6uL
public const val PD_DAEMON: CInt = 0x00000001
public const val PD_CLOEXEC: CInt = 0x00000002
public val PD_ALLOWED_AT_FORK: CInt = PD_DAEMON or PD_CLOEXEC
public val RTP_PRIO_REALTIME: CUShort = (2).toUShort()
public val RTP_PRIO_NORMAL: CUShort = (3).toUShort()
public val RTP_PRIO_IDLE: CUShort = (4).toUShort()
public const val UF_SYSTEM: CULong = 0x00000080uL
public const val UF_SPARSE: CULong = 0x00000100uL
public const val UF_OFFLINE: CULong = 0x00000200uL
public const val UF_REPARSE: CULong = 0x00000400uL
public const val UF_ARCHIVE: CULong = 0x00000800uL
public const val UF_READONLY: CULong = 0x00001000uL
public const val UF_HIDDEN: CULong = 0x00008000uL
public const val SF_SNAPSHOT: CULong = 0x00200000uL
public const val F_ADD_SEALS: CInt = 19
public const val F_GET_SEALS: CInt = 20
public const val F_OGETLK: CInt = 7
public const val F_OSETLK: CInt = 8
public const val F_OSETLKW: CInt = 9
public const val F_RDAHEAD: CInt = 16
public const val F_READAHEAD: CInt = 15
public const val F_SETLK_REMOTE: CInt = 14
public const val F_KINFO: CInt = 22
public const val F_SEAL_GROW: CInt = 4
public const val F_SEAL_SEAL: CInt = 1
public const val F_SEAL_SHRINK: CInt = 2
public const val F_SEAL_WRITE: CInt = 8
public const val SPACECTL_DEALLOC: CInt = 1
public const val HOSTNAME_FOUND: CInt = 0
public const val HOSTNAME_INCORRECTNAME: CInt = 1
public const val HOSTNAME_INVALIDADDR: CInt = 2
public const val HOSTNAME_INVALIDNAME: CInt = 3
public const val RFFDG: CInt = 4
public const val RFPROC: CInt = 16
public const val RFMEM: CInt = 32
public const val RFNOWAIT: CInt = 64
public const val RFCFDG: CInt = 4096
public const val RFTHREAD: CInt = 8192
public const val RFSIGSHARE: CInt = 16384
public const val RFLINUXTHPN: CInt = 65536
public const val RFTSIGZMB: CInt = 524288
public const val RFSPAWN: CInt = (-2147483648)
public const val EFD_SEMAPHORE: CInt = 0x1
public const val EFD_NONBLOCK: CInt = 0x4
public const val EFD_CLOEXEC: CInt = 0x100000
public const val MALLOCX_ZERO: CInt = 0x40
public const val WMESGLEN: ULong = 8uL
public const val LOCKNAMELEN: ULong = 8uL
public const val TDNAMLEN: ULong = 16uL
public const val COMMLEN: ULong = 19uL
public const val KI_EMULNAMELEN: ULong = 16uL
public const val KI_NGROUPS: ULong = 16uL
public const val KI_NSPARE_INT: ULong = 4uL
public const val KI_NSPARE_LONG: ULong = 12uL
public const val KI_CRF_CAPABILITY_MODE: ULong = 0x00000001uL
public const val KI_CRF_GRP_OVERFLOW: ULong = 0x80000000uL
public const val KI_CTTY: ULong = 0x00000001uL
public const val KI_SLEADER: ULong = 0x00000002uL
public const val KI_LOCKBLOCK: ULong = 0x00000004uL
public const val LOGNAMELEN: ULong = 17uL
public const val LOGINCLASSLEN: ULong = 17uL
public const val KF_ATTR_VALID: CInt = 0x0001
public const val KF_TYPE_NONE: CInt = 0
public const val KF_TYPE_VNODE: CInt = 1
public const val KF_TYPE_SOCKET: CInt = 2
public const val KF_TYPE_PIPE: CInt = 3
public const val KF_TYPE_FIFO: CInt = 4
public const val KF_TYPE_KQUEUE: CInt = 5
public const val KF_TYPE_MQUEUE: CInt = 7
public const val KF_TYPE_SHM: CInt = 8
public const val KF_TYPE_SEM: CInt = 9
public const val KF_TYPE_PTS: CInt = 10
public const val KF_TYPE_PROCDESC: CInt = 11
public const val KF_TYPE_DEV: CInt = 12
public const val KF_TYPE_UNKNOWN: CInt = 255
public const val KF_VTYPE_VNON: CInt = 0
public const val KF_VTYPE_VREG: CInt = 1
public const val KF_VTYPE_VDIR: CInt = 2
public const val KF_VTYPE_VBLK: CInt = 3
public const val KF_VTYPE_VCHR: CInt = 4
public const val KF_VTYPE_VLNK: CInt = 5
public const val KF_VTYPE_VSOCK: CInt = 6
public const val KF_VTYPE_VFIFO: CInt = 7
public const val KF_VTYPE_VBAD: CInt = 8
public const val KF_VTYPE_UNKNOWN: CInt = 255
public const val KF_FD_TYPE_CWD: CInt = -1
public const val KF_FD_TYPE_ROOT: CInt = -2
public const val KF_FD_TYPE_JAIL: CInt = -3
public const val KF_FD_TYPE_TRACE: CInt = -4
public const val KF_FD_TYPE_TEXT: CInt = -5
public const val KF_FD_TYPE_CTTY: CInt = -6
public const val KF_FLAG_READ: CInt = 0x00000001
public const val KF_FLAG_WRITE: CInt = 0x00000002
public const val KF_FLAG_APPEND: CInt = 0x00000004
public const val KF_FLAG_ASYNC: CInt = 0x00000008
public const val KF_FLAG_FSYNC: CInt = 0x00000010
public const val KF_FLAG_NONBLOCK: CInt = 0x00000020
public const val KF_FLAG_DIRECT: CInt = 0x00000040
public const val KF_FLAG_HASLOCK: CInt = 0x00000080
public const val KF_FLAG_SHLOCK: CInt = 0x00000100
public const val KF_FLAG_EXLOCK: CInt = 0x00000200
public const val KF_FLAG_NOFOLLOW: CInt = 0x00000400
public const val KF_FLAG_CREAT: CInt = 0x00000800
public const val KF_FLAG_TRUNC: CInt = 0x00001000
public const val KF_FLAG_EXCL: CInt = 0x00002000
public const val KF_FLAG_EXEC: CInt = 0x00004000
public const val KVME_TYPE_NONE: CInt = 0
public const val KVME_TYPE_DEFAULT: CInt = 1
public const val KVME_TYPE_VNODE: CInt = 2
public const val KVME_TYPE_SWAP: CInt = 3
public const val KVME_TYPE_DEVICE: CInt = 4
public const val KVME_TYPE_PHYS: CInt = 5
public const val KVME_TYPE_DEAD: CInt = 6
public const val KVME_TYPE_SG: CInt = 7
public const val KVME_TYPE_MGTDEVICE: CInt = 8
public const val KVME_TYPE_GUARD: CInt = 9
public const val KVME_TYPE_UNKNOWN: CInt = 255
public const val KVME_PROT_READ: CInt = 0x00000001
public const val KVME_PROT_WRITE: CInt = 0x00000002
public const val KVME_PROT_EXEC: CInt = 0x00000004
public const val KVME_FLAG_COW: CInt = 0x00000001
public const val KVME_FLAG_NEEDS_COPY: CInt = 0x00000002
public const val KVME_FLAG_NOCOREDUMP: CInt = 0x00000004
public const val KVME_FLAG_SUPER: CInt = 0x00000008
public const val KVME_FLAG_GROWS_UP: CInt = 0x00000010
public const val KVME_FLAG_GROWS_DOWN: CInt = 0x00000020
public const val KVME_FLAG_USER_WIRED: CInt = 0x00000040
public const val KKST_MAXLEN: CInt = 1024
public const val KKST_STATE_STACKOK: CInt = 0
public const val KKST_STATE_SWAPPED: CInt = 1
public const val KKST_STATE_RUNNING: CInt = 2
public const val PRI_MIN: CInt = 0
public const val PRI_MAX: CInt = 255
public const val PRI_MIN_ITHD: CInt = PRI_MIN
public val PRI_MAX_ITHD: CInt = PRI_MIN_REALTIME - 1
public const val PI_REALTIME: CInt = PRI_MIN_ITHD + 0
public const val PI_AV: CInt = PRI_MIN_ITHD + 4
public const val PI_NET: CInt = PRI_MIN_ITHD + 8
public const val PI_DISK: CInt = PRI_MIN_ITHD + 12
public const val PI_TTY: CInt = PRI_MIN_ITHD + 16
public const val PI_DULL: CInt = PRI_MIN_ITHD + 20
public const val PI_SOFT: CInt = PRI_MIN_ITHD + 24
public const val PRI_MIN_REALTIME: CInt = 48
public val PRI_MAX_REALTIME: CInt = PRI_MIN_KERN - 1
public const val PRI_MIN_KERN: CInt = 80
public val PRI_MAX_KERN: CInt = PRI_MIN_TIMESHARE - 1
public const val PSWP: CInt = PRI_MIN_KERN + 0
public const val PVM: CInt = PRI_MIN_KERN + 4
public const val PINOD: CInt = PRI_MIN_KERN + 8
public const val PRIBIO: CInt = PRI_MIN_KERN + 12
public const val PVFS: CInt = PRI_MIN_KERN + 16
public const val PZERO: CInt = PRI_MIN_KERN + 20
public const val PSOCK: CInt = PRI_MIN_KERN + 24
public const val PWAIT: CInt = PRI_MIN_KERN + 28
public const val PLOCK: CInt = PRI_MIN_KERN + 32
public const val PPAUSE: CInt = PRI_MIN_KERN + 36
public const val PRI_MIN_TIMESHARE: CInt = 120
public val PRI_MAX_TIMESHARE: CInt = PRI_MIN_IDLE - 1
public const val PUSER: CInt = PRI_MIN_TIMESHARE
public const val PRI_MIN_IDLE: CInt = 224
public const val PRI_MAX_IDLE: CInt = PRI_MAX
public const val NZERO: CInt = 0
public const val RUSAGE_THREAD: CInt = 1
public const val ARG_MAX: CInt = 256 * 1024
public const val CHILD_MAX: CInt = 40
public const val MAXCOMLEN: ULong = 19uL
public const val MAXINTERP: CInt = PATH_MAX
public const val MAXLOGNAME: CInt = 33
public const val MAXUPRC: CInt = CHILD_MAX
public const val NCARGS: CInt = ARG_MAX
public val NGROUPS: CInt = NGROUPS_MAX + 1
public val NOFILE: CInt = OPEN_MAX
public const val NOGROUP: CInt = 65535
public const val MAXHOSTNAMELEN: CInt = 256
public const val MAX_CANON: CInt = 255
public const val MAX_INPUT: CInt = 255
public const val NAME_MAX: CInt = 255
public const val MAXSYMLINKS: CInt = 32
public const val NGROUPS_MAX: CInt = 1023
public const val OPEN_MAX: CInt = 64
public const val _POSIX_ARG_MAX: CInt = 4096
public const val _POSIX_LINK_MAX: CInt = 8
public const val _POSIX_MAX_CANON: CInt = 255
public const val _POSIX_MAX_INPUT: CInt = 255
public const val _POSIX_NAME_MAX: CInt = 14
public const val _POSIX_PIPE_BUF: CInt = 512
public const val _POSIX_SSIZE_MAX: CInt = 32767
public const val _POSIX_STREAM_MAX: CInt = 8
public const val BC_BASE_MAX: CInt = 99
public const val BC_DIM_MAX: CInt = 2048
public const val BC_SCALE_MAX: CInt = 99
public const val BC_STRING_MAX: CInt = 1000
public const val CHARCLASS_NAME_MAX: CInt = 14
public const val COLL_WEIGHTS_MAX: CInt = 10
public const val EXPR_NEST_MAX: CInt = 32
public const val LINE_MAX: CInt = 2048
public const val RE_DUP_MAX: CInt = 255
public const val _POSIX2_BC_BASE_MAX: CInt = 99
public const val _POSIX2_BC_DIM_MAX: CInt = 2048
public const val _POSIX2_BC_SCALE_MAX: CInt = 99
public const val _POSIX2_BC_STRING_MAX: CInt = 1000
public const val _POSIX2_CHARCLASS_NAME_MAX: CInt = 14
public const val _POSIX2_COLL_WEIGHTS_MAX: CInt = 2
public const val _POSIX2_EQUIV_CLASS_MAX: CInt = 2
public const val _POSIX2_EXPR_NEST_MAX: CInt = 32
public const val _POSIX2_LINE_MAX: CInt = 2048
public const val _POSIX2_RE_DUP_MAX: CInt = 255
public const val TDF_BORROWING: CInt = 0x00000001
public const val TDF_INPANIC: CInt = 0x00000002
public const val TDF_INMEM: CInt = 0x00000004
public const val TDF_SINTR: CInt = 0x00000008
public const val TDF_TIMEOUT: CInt = 0x00000010
public const val TDF_IDLETD: CInt = 0x00000020
public const val TDF_CANSWAP: CInt = 0x00000040
public const val TDF_KTH_SUSP: CInt = 0x00000100
public const val TDF_ALLPROCSUSP: CInt = 0x00000200
public const val TDF_BOUNDARY: CInt = 0x00000400
public const val TDF_ASTPENDING: CInt = 0x00000800
public const val TDF_SBDRY: CInt = 0x00002000
public const val TDF_UPIBLOCKED: CInt = 0x00004000
public const val TDF_NEEDSUSPCHK: CInt = 0x00008000
public const val TDF_NEEDRESCHED: CInt = 0x00010000
public const val TDF_NEEDSIGCHK: CInt = 0x00020000
public const val TDF_NOLOAD: CInt = 0x00040000
public const val TDF_SERESTART: CInt = 0x00080000
public const val TDF_THRWAKEUP: CInt = 0x00100000
public const val TDF_SEINTR: CInt = 0x00200000
public const val TDF_SWAPINREQ: CInt = 0x00400000
public const val TDF_UNUSED23: CInt = 0x00800000
public const val TDF_SCHED0: CInt = 0x01000000
public const val TDF_SCHED1: CInt = 0x02000000
public const val TDF_SCHED2: CInt = 0x04000000
public const val TDF_SCHED3: CInt = 0x08000000
public const val TDF_ALRMPEND: CInt = 0x10000000
public const val TDF_PROFPEND: CInt = 0x20000000
public const val TDF_MACPEND: CInt = 0x40000000
public const val TDB_SUSPEND: CInt = 0x00000001
public const val TDB_XSIG: CInt = 0x00000002
public const val TDB_USERWR: CInt = 0x00000004
public const val TDB_SCE: CInt = 0x00000008
public const val TDB_SCX: CInt = 0x00000010
public const val TDB_EXEC: CInt = 0x00000020
public const val TDB_FORK: CInt = 0x00000040
public const val TDB_STOPATFORK: CInt = 0x00000080
public const val TDB_CHILD: CInt = 0x00000100
public const val TDB_BORN: CInt = 0x00000200
public const val TDB_EXIT: CInt = 0x00000400
public const val TDB_VFORK: CInt = 0x00000800
public const val TDB_FSTP: CInt = 0x00001000
public const val TDB_STEP: CInt = 0x00002000
public const val TDP_OLDMASK: CInt = 0x00000001
public const val TDP_INKTR: CInt = 0x00000002
public const val TDP_INKTRACE: CInt = 0x00000004
public const val TDP_BUFNEED: CInt = 0x00000008
public const val TDP_COWINPROGRESS: CInt = 0x00000010
public const val TDP_ALTSTACK: CInt = 0x00000020
public const val TDP_DEADLKTREAT: CInt = 0x00000040
public const val TDP_NOFAULTING: CInt = 0x00000080
public const val TDP_OWEUPC: CInt = 0x00000200
public const val TDP_ITHREAD: CInt = 0x00000400
public const val TDP_SYNCIO: CInt = 0x00000800
public const val TDP_SCHED1: CInt = 0x00001000
public const val TDP_SCHED2: CInt = 0x00002000
public const val TDP_SCHED3: CInt = 0x00004000
public const val TDP_SCHED4: CInt = 0x00008000
public const val TDP_GEOM: CInt = 0x00010000
public const val TDP_SOFTDEP: CInt = 0x00020000
public const val TDP_NORUNNINGBUF: CInt = 0x00040000
public const val TDP_WAKEUP: CInt = 0x00080000
public const val TDP_INBDFLUSH: CInt = 0x00100000
public const val TDP_KTHREAD: CInt = 0x00200000
public const val TDP_CALLCHAIN: CInt = 0x00400000
public const val TDP_IGNSUSP: CInt = 0x00800000
public const val TDP_AUDITREC: CInt = 0x01000000
public const val TDP_RFPPWAIT: CInt = 0x02000000
public const val TDP_RESETSPUR: CInt = 0x04000000
public const val TDP_NERRNO: CInt = 0x08000000
public const val TDP_EXECVMSPC: CInt = 0x40000000
public const val TDI_SUSPENDED: CInt = 0x0001
public const val TDI_SLEEPING: CInt = 0x0002
public const val TDI_SWAPPED: CInt = 0x0004
public const val TDI_LOCK: CInt = 0x0008
public const val TDI_IWAIT: CInt = 0x0010
public const val P_ADVLOCK: CInt = 0x00000001
public const val P_CONTROLT: CInt = 0x00000002
public const val P_KPROC: CInt = 0x00000004
public const val P_UNUSED3: CInt = 0x00000008
public const val P_IDLEPROC: CInt = 0x00000008
public const val P_PPWAIT: CInt = 0x00000010
public const val P_PROFIL: CInt = 0x00000020
public const val P_STOPPROF: CInt = 0x00000040
public const val P_HADTHREADS: CInt = 0x00000080
public const val P_SUGID: CInt = 0x00000100
public const val P_SYSTEM: CInt = 0x00000200
public const val P_SINGLE_EXIT: CInt = 0x00000400
public const val P_TRACED: CInt = 0x00000800
public const val P_WAITED: CInt = 0x00001000
public const val P_WEXIT: CInt = 0x00002000
public const val P_EXEC: CInt = 0x00004000
public const val P_WKILLED: CInt = 0x00008000
public const val P_CONTINUED: CInt = 0x00010000
public const val P_STOPPED_SIG: CInt = 0x00020000
public const val P_STOPPED_TRACE: CInt = 0x00040000
public const val P_STOPPED_SINGLE: CInt = 0x00080000
public const val P_PROTECTED: CInt = 0x00100000
public const val P_SIGEVENT: CInt = 0x00200000
public const val P_SINGLE_BOUNDARY: CInt = 0x00400000
public const val P_HWPMC: CInt = 0x00800000
public const val P_JAILED: CInt = 0x01000000
public const val P_TOTAL_STOP: CInt = 0x02000000
public const val P_INEXEC: CInt = 0x04000000
public const val P_STATCHILD: CInt = 0x08000000
public const val P_INMEM: CInt = 0x10000000
public const val P_SWAPPINGOUT: CInt = 0x20000000
public const val P_SWAPPINGIN: CInt = 0x40000000
public const val P_PPTRACE: CInt = -2147483648
public val P_STOPPED: CInt = P_STOPPED_SIG or P_STOPPED_SINGLE or P_STOPPED_TRACE
public const val P2_INHERIT_PROTECTED: CInt = 0x00000001
public const val P2_NOTRACE: CInt = 0x00000002
public const val P2_NOTRACE_EXEC: CInt = 0x00000004
public const val P2_AST_SU: CInt = 0x00000008
public const val P2_PTRACE_FSTP: CInt = 0x00000010
public const val P2_TRAPCAP: CInt = 0x00000020
public const val P2_STKGAP_DISABLE: CInt = 0x00000800
public const val P2_STKGAP_DISABLE_EXEC: CInt = 0x00001000
public const val P_TREE_ORPHANED: CInt = 0x00000001
public const val P_TREE_FIRST_ORPHAN: CInt = 0x00000002
public const val P_TREE_REAPER: CInt = 0x00000004
public const val SIDL: CChar = 1
public const val SRUN: CChar = 2
public const val SSLEEP: CChar = 3
public const val SSTOP: CChar = 4
public const val SZOMB: CChar = 5
public const val SWAIT: CChar = 6
public const val SLOCK: CChar = 7
public const val P_MAGIC: CInt = -1091568946
public const val TDP_SIGFASTBLOCK: CInt = 0x00000100
public const val TDP_UIOHELD: CInt = 0x10000000
public const val TDP_SIGFASTPENDING: CInt = -2147483648
public const val TDP2_COMPAT32RB: CInt = 0x00000002
public const val P2_PROTMAX_ENABLE: CInt = 0x00000200
public const val P2_PROTMAX_DISABLE: CInt = 0x00000400
public const val TDP2_SBPAGES: CInt = 0x00000001
public const val P2_ASLR_ENABLE: CInt = 0x00000040
public const val P2_ASLR_DISABLE: CInt = 0x00000080
public const val P2_ASLR_IGNSTART: CInt = 0x00000100
public const val P_TREE_GRPEXITED: CInt = 0x00000008
public const val PS_FST_VTYPE_VNON: CInt = 1
public const val PS_FST_VTYPE_VREG: CInt = 2
public const val PS_FST_VTYPE_VDIR: CInt = 3
public const val PS_FST_VTYPE_VBLK: CInt = 4
public const val PS_FST_VTYPE_VCHR: CInt = 5
public const val PS_FST_VTYPE_VLNK: CInt = 6
public const val PS_FST_VTYPE_VSOCK: CInt = 7
public const val PS_FST_VTYPE_VFIFO: CInt = 8
public const val PS_FST_VTYPE_VBAD: CInt = 9
public const val PS_FST_VTYPE_UNKNOWN: CInt = 255
public const val PS_FST_TYPE_VNODE: CInt = 1
public const val PS_FST_TYPE_FIFO: CInt = 2
public const val PS_FST_TYPE_SOCKET: CInt = 3
public const val PS_FST_TYPE_PIPE: CInt = 4
public const val PS_FST_TYPE_PTS: CInt = 5
public const val PS_FST_TYPE_KQUEUE: CInt = 6
public const val PS_FST_TYPE_MQUEUE: CInt = 8
public const val PS_FST_TYPE_SHM: CInt = 9
public const val PS_FST_TYPE_SEM: CInt = 10
public const val PS_FST_TYPE_UNKNOWN: CInt = 11
public const val PS_FST_TYPE_NONE: CInt = 12
public const val PS_FST_TYPE_PROCDESC: CInt = 13
public const val PS_FST_TYPE_DEV: CInt = 14
public const val PS_FST_TYPE_EVENTFD: CInt = 15
public const val PS_FST_UFLAG_RDIR: CInt = 0x0001
public const val PS_FST_UFLAG_CDIR: CInt = 0x0002
public const val PS_FST_UFLAG_JAIL: CInt = 0x0004
public const val PS_FST_UFLAG_TRACE: CInt = 0x0008
public const val PS_FST_UFLAG_TEXT: CInt = 0x0010
public const val PS_FST_UFLAG_MMAP: CInt = 0x0020
public const val PS_FST_UFLAG_CTTY: CInt = 0x0040
public const val PS_FST_FFLAG_READ: CInt = 0x0001
public const val PS_FST_FFLAG_WRITE: CInt = 0x0002
public const val PS_FST_FFLAG_NONBLOCK: CInt = 0x0004
public const val PS_FST_FFLAG_APPEND: CInt = 0x0008
public const val PS_FST_FFLAG_SHLOCK: CInt = 0x0010
public const val PS_FST_FFLAG_EXLOCK: CInt = 0x0020
public const val PS_FST_FFLAG_ASYNC: CInt = 0x0040
public const val PS_FST_FFLAG_SYNC: CInt = 0x0080
public const val PS_FST_FFLAG_NOFOLLOW: CInt = 0x0100
public const val PS_FST_FFLAG_CREAT: CInt = 0x0200
public const val PS_FST_FFLAG_TRUNC: CInt = 0x0400
public const val PS_FST_FFLAG_EXCL: CInt = 0x0800
public const val PS_FST_FFLAG_DIRECT: CInt = 0x1000
public const val PS_FST_FFLAG_EXEC: CInt = 0x2000
public const val PS_FST_FFLAG_HASLOCK: CInt = 0x4000
public const val MAXFIDSZ: CInt = 16
public const val MFSNAMELEN: CInt = 16
public const val MNAMELEN: CInt = 88
public const val MNT_SUJ: ULong = 0x100000000uL
public const val MNT_AUTOMOUNTED: ULong = 0x200000000uL
public const val MNT_UNTRUSTED: ULong = 0x800000000uL
public const val MNT_EXTLS: ULong = 0x4000000000uL
public const val MNT_EXTLSCERT: ULong = 0x8000000000uL
public const val MNT_EXTLSCERTUSER: ULong = 0x10000000000uL
public const val MNT_LOCAL: ULong = 0x000001000uL
public const val MNT_QUOTA: ULong = 0x000002000uL
public const val MNT_ROOTFS: ULong = 0x000004000uL
public const val MNT_USER: ULong = 0x000008000uL
public const val MNT_IGNORE: ULong = 0x000800000uL
public const val MNT_VERIFIED: ULong = 0x400000000uL
public const val MNT_NOCOVER: ULong = 0x001000000000uL
public const val MNT_EMPTYDIR: ULong = 0x002000000000uL
public const val MNT_RECURSE: ULong = 0x100000000000uL
public const val MNT_DEFERRED: ULong = 0x200000000000uL
public const val VFS_VFSCONF: CInt = 0
public const val VFS_GENERIC: CInt = 0
public const val VFS_MAXTYPENUM: CInt = 1
public const val VFS_CONF: CInt = 2
public const val MNT_WAIT: CInt = 1
public const val MNT_NOWAIT: CInt = 2
public const val MNT_LAZY: CInt = 3
public const val MNT_SUSPEND: CInt = 4
public const val MAXSECFLAVORS: CInt = 5
public const val VFCF_STATIC: CInt = 0x00010000
public const val VFCF_NETWORK: CInt = 0x00020000
public const val VFCF_READONLY: CInt = 0x00040000
public const val VFCF_SYNTHETIC: CInt = 0x00080000
public const val VFCF_LOOPBACK: CInt = 0x00100000
public const val VFCF_UNICODE: CInt = 0x00200000
public const val VFCF_JAIL: CInt = 0x00400000
public const val VFCF_DELEGADMIN: CInt = 0x00800000
public const val VFCF_SBDRY: CInt = 0x01000000
public const val DST_NONE: CInt = 0
public const val DST_USA: CInt = 1
public const val DST_AUST: CInt = 2
public const val DST_WET: CInt = 3
public const val DST_MET: CInt = 4
public const val DST_EET: CInt = 5
public const val DST_CAN: CInt = 6
public const val CPUCLOCK_WHICH_PID: CInt = 0
public const val CPUCLOCK_WHICH_TID: CInt = 1
public const val MFD_CLOEXEC: CUInt = 0x00000001u
public const val MFD_ALLOW_SEALING: CUInt = 0x00000002u
public const val MFD_HUGETLB: CUInt = 0x00000004u
public const val MFD_HUGE_MASK: CUInt = 0xFC000000u
public val MFD_HUGE_64KB: CUInt = 16.toUInt() shl 26
public val MFD_HUGE_512KB: CUInt = 19.toUInt() shl 26
public val MFD_HUGE_1MB: CUInt = 20.toUInt() shl 26
public val MFD_HUGE_2MB: CUInt = 21.toUInt() shl 26
public val MFD_HUGE_8MB: CUInt = 23.toUInt() shl 26
public val MFD_HUGE_16MB: CUInt = 24.toUInt() shl 26
public val MFD_HUGE_32MB: CUInt = 25.toUInt() shl 26
public val MFD_HUGE_256MB: CUInt = 28.toUInt() shl 26
public val MFD_HUGE_512MB: CUInt = 29.toUInt() shl 26
public val MFD_HUGE_1GB: CUInt = 30.toUInt() shl 26
public val MFD_HUGE_2GB: CUInt = 31.toUInt() shl 26
public val MFD_HUGE_16GB: CUInt = 34.toUInt() shl 26
public const val SHM_LARGEPAGE_ALLOC_DEFAULT: CInt = 0
public const val SHM_LARGEPAGE_ALLOC_NOWAIT: CInt = 1
public const val SHM_LARGEPAGE_ALLOC_HARD: CInt = 2
public val SHM_RENAME_NOREPLACE: CInt = 1 shl 0
public val SHM_RENAME_EXCHANGE: CInt = 1 shl 1
public const val UMTX_OP_WAIT: CInt = 2
public const val UMTX_OP_WAKE: CInt = 3
public const val UMTX_OP_MUTEX_TRYLOCK: CInt = 4
public const val UMTX_OP_MUTEX_LOCK: CInt = 5
public const val UMTX_OP_MUTEX_UNLOCK: CInt = 6
public const val UMTX_OP_SET_CEILING: CInt = 7
public const val UMTX_OP_CV_WAIT: CInt = 8
public const val UMTX_OP_CV_SIGNAL: CInt = 9
public const val UMTX_OP_CV_BROADCAST: CInt = 10
public const val UMTX_OP_WAIT_UINT: CInt = 11
public const val UMTX_OP_RW_RDLOCK: CInt = 12
public const val UMTX_OP_RW_WRLOCK: CInt = 13
public const val UMTX_OP_RW_UNLOCK: CInt = 14
public const val UMTX_OP_WAIT_UINT_PRIVATE: CInt = 15
public const val UMTX_OP_WAKE_PRIVATE: CInt = 16
public const val UMTX_OP_MUTEX_WAIT: CInt = 17
public const val UMTX_OP_NWAKE_PRIVATE: CInt = 21
public const val UMTX_OP_MUTEX_WAKE2: CInt = 22
public const val UMTX_OP_SEM2_WAIT: CInt = 23
public const val UMTX_OP_SEM2_WAKE: CInt = 24
public const val UMTX_OP_SHM: CInt = 25
public const val UMTX_OP_ROBUST_LISTS: CInt = 26
public const val UMTX_ABSTIME: UInt = 1u
public const val CPU_LEVEL_ROOT: CInt = 1
public const val CPU_LEVEL_CPUSET: CInt = 2
public const val CPU_LEVEL_WHICH: CInt = 3
public const val CPU_WHICH_TID: CInt = 1
public const val CPU_WHICH_PID: CInt = 2
public const val CPU_WHICH_CPUSET: CInt = 3
public const val CPU_WHICH_IRQ: CInt = 4
public const val CPU_WHICH_JAIL: CInt = 5
public const val RTF_LLDATA: CInt = 0x400
public const val RTF_FIXEDMTU: CInt = 0x80000
public const val RTM_VERSION: CInt = 5
public const val RTAX_MAX: CInt = 8
public const val SIGTHR: CInt = 32
public const val SIGLWP: CInt = SIGTHR
public const val SIGLIBRT: CInt = 33
public const val SCTP_FUTURE_ASSOC: CInt = 0
public const val SCTP_CURRENT_ASSOC: CInt = 1
public const val SCTP_ALL_ASSOC: CInt = 2
public const val SCTP_NO_NEXT_MSG: CInt = 0x0000
public const val SCTP_NEXT_MSG_AVAIL: CInt = 0x0001
public const val SCTP_NEXT_MSG_ISCOMPLETE: CInt = 0x0002
public const val SCTP_NEXT_MSG_IS_UNORDERED: CInt = 0x0004
public const val SCTP_NEXT_MSG_IS_NOTIFICATION: CInt = 0x0008
public const val SCTP_RECVV_NOINFO: CInt = 0
public const val SCTP_RECVV_RCVINFO: CInt = 1
public const val SCTP_RECVV_NXTINFO: CInt = 2
public const val SCTP_RECVV_RN: CInt = 3
public const val SCTP_SENDV_NOINFO: CInt = 0
public const val SCTP_SENDV_SNDINFO: CInt = 1
public const val SCTP_SENDV_PRINFO: CInt = 2
public const val SCTP_SENDV_AUTHINFO: CInt = 3
public const val SCTP_SENDV_SPA: CInt = 4
public const val SCTP_SEND_SNDINFO_VALID: CInt = 0x00000001
public const val SCTP_SEND_PRINFO_VALID: CInt = 0x00000002
public const val SCTP_SEND_AUTHINFO_VALID: CInt = 0x00000004
public const val SCTP_NOTIFICATION: CInt = 0x0010
public const val SCTP_COMPLETE: CInt = 0x0020
public const val SCTP_EOF: CInt = 0x0100
public const val SCTP_ABORT: CInt = 0x0200
public const val SCTP_UNORDERED: CInt = 0x0400
public const val SCTP_ADDR_OVER: CInt = 0x0800
public const val SCTP_SENDALL: CInt = 0x1000
public const val SCTP_EOR: CInt = 0x2000
public const val SCTP_SACK_IMMEDIATELY: CInt = 0x4000
public const val SCTP_PR_SCTP_NONE: CInt = 0x0000
public const val SCTP_PR_SCTP_TTL: CInt = 0x0001
public const val SCTP_PR_SCTP_PRIO: CInt = 0x0002
public const val SCTP_PR_SCTP_BUF: CInt = SCTP_PR_SCTP_PRIO
public const val SCTP_PR_SCTP_RTX: CInt = 0x0003
public const val SCTP_PR_SCTP_MAX: CInt = SCTP_PR_SCTP_RTX
public const val SCTP_PR_SCTP_ALL: CInt = 0x000f
public const val SCTP_INIT: CInt = 0x0001
public const val SCTP_SNDRCV: CInt = 0x0002
public const val SCTP_EXTRCV: CInt = 0x0003
public const val SCTP_SNDINFO: CInt = 0x0004
public const val SCTP_RCVINFO: CInt = 0x0005
public const val SCTP_NXTINFO: CInt = 0x0006
public const val SCTP_PRINFO: CInt = 0x0007
public const val SCTP_AUTHINFO: CInt = 0x0008
public const val SCTP_DSTADDRV4: CInt = 0x0009
public const val SCTP_DSTADDRV6: CInt = 0x000a
public const val SCTP_RTOINFO: CInt = 0x00000001
public const val SCTP_ASSOCINFO: CInt = 0x00000002
public const val SCTP_INITMSG: CInt = 0x00000003
public const val SCTP_NODELAY: CInt = 0x00000004
public const val SCTP_AUTOCLOSE: CInt = 0x00000005
public const val SCTP_SET_PEER_PRIMARY_ADDR: CInt = 0x00000006
public const val SCTP_PRIMARY_ADDR: CInt = 0x00000007
public const val SCTP_ADAPTATION_LAYER: CInt = 0x00000008
public const val SCTP_ADAPTION_LAYER: CInt = 0x00000008
public const val SCTP_DISABLE_FRAGMENTS: CInt = 0x00000009
public const val SCTP_PEER_ADDR_PARAMS: CInt = 0x0000000a
public const val SCTP_DEFAULT_SEND_PARAM: CInt = 0x0000000b
public const val SCTP_EVENTS: CInt = 0x0000000c
public const val SCTP_I_WANT_MAPPED_V4_ADDR: CInt = 0x0000000d
public const val SCTP_MAXSEG: CInt = 0x0000000e
public const val SCTP_DELAYED_SACK: CInt = 0x0000000f
public const val SCTP_FRAGMENT_INTERLEAVE: CInt = 0x00000010
public const val SCTP_PARTIAL_DELIVERY_POINT: CInt = 0x00000011
public const val SCTP_AUTH_CHUNK: CInt = 0x00000012
public const val SCTP_AUTH_KEY: CInt = 0x00000013
public const val SCTP_HMAC_IDENT: CInt = 0x00000014
public const val SCTP_AUTH_ACTIVE_KEY: CInt = 0x00000015
public const val SCTP_AUTH_DELETE_KEY: CInt = 0x00000016
public const val SCTP_USE_EXT_RCVINFO: CInt = 0x00000017
public const val SCTP_AUTO_ASCONF: CInt = 0x00000018
public const val SCTP_MAXBURST: CInt = 0x00000019
public const val SCTP_MAX_BURST: CInt = 0x00000019
public const val SCTP_CONTEXT: CInt = 0x0000001a
public const val SCTP_EXPLICIT_EOR: CInt = 0x00000001b
public const val SCTP_REUSE_PORT: CInt = 0x00000001c
public const val SCTP_AUTH_DEACTIVATE_KEY: CInt = 0x00000001d
public const val SCTP_EVENT: CInt = 0x0000001e
public const val SCTP_RECVRCVINFO: CInt = 0x0000001f
public const val SCTP_RECVNXTINFO: CInt = 0x00000020
public const val SCTP_DEFAULT_SNDINFO: CInt = 0x00000021
public const val SCTP_DEFAULT_PRINFO: CInt = 0x00000022
public const val SCTP_PEER_ADDR_THLDS: CInt = 0x00000023
public const val SCTP_REMOTE_UDP_ENCAPS_PORT: CInt = 0x00000024
public const val SCTP_ECN_SUPPORTED: CInt = 0x00000025
public const val SCTP_AUTH_SUPPORTED: CInt = 0x00000027
public const val SCTP_ASCONF_SUPPORTED: CInt = 0x00000028
public const val SCTP_RECONFIG_SUPPORTED: CInt = 0x00000029
public const val SCTP_NRSACK_SUPPORTED: CInt = 0x00000030
public const val SCTP_PKTDROP_SUPPORTED: CInt = 0x00000031
public const val SCTP_MAX_CWND: CInt = 0x00000032
public const val SCTP_STATUS: CInt = 0x00000100
public const val SCTP_GET_PEER_ADDR_INFO: CInt = 0x00000101
public const val SCTP_PEER_AUTH_CHUNKS: CInt = 0x00000102
public const val SCTP_LOCAL_AUTH_CHUNKS: CInt = 0x00000103
public const val SCTP_GET_ASSOC_NUMBER: CInt = 0x00000104
public const val SCTP_GET_ASSOC_ID_LIST: CInt = 0x00000105
public const val SCTP_TIMEOUTS: CInt = 0x00000106
public const val SCTP_PR_STREAM_STATUS: CInt = 0x00000107
public const val SCTP_PR_ASSOC_STATUS: CInt = 0x00000108
public const val SCTP_COMM_UP: CInt = 0x0001
public const val SCTP_COMM_LOST: CInt = 0x0002
public const val SCTP_RESTART: CInt = 0x0003
public const val SCTP_SHUTDOWN_COMP: CInt = 0x0004
public const val SCTP_CANT_STR_ASSOC: CInt = 0x0005
public const val SCTP_ASSOC_SUPPORTS_PR: CInt = 0x01
public const val SCTP_ASSOC_SUPPORTS_AUTH: CInt = 0x02
public const val SCTP_ASSOC_SUPPORTS_ASCONF: CInt = 0x03
public const val SCTP_ASSOC_SUPPORTS_MULTIBUF: CInt = 0x04
public const val SCTP_ASSOC_SUPPORTS_RE_CONFIG: CInt = 0x05
public const val SCTP_ASSOC_SUPPORTS_INTERLEAVING: CInt = 0x06
public const val SCTP_ASSOC_SUPPORTS_MAX: CInt = 0x06
public const val SCTP_ADDR_AVAILABLE: CInt = 0x0001
public const val SCTP_ADDR_UNREACHABLE: CInt = 0x0002
public const val SCTP_ADDR_REMOVED: CInt = 0x0003
public const val SCTP_ADDR_ADDED: CInt = 0x0004
public const val SCTP_ADDR_MADE_PRIM: CInt = 0x0005
public const val SCTP_ADDR_CONFIRMED: CInt = 0x0006
public const val SCTP_ACTIVE: CInt = 0x0001
public const val SCTP_INACTIVE: CInt = 0x0002
public const val SCTP_UNCONFIRMED: CInt = 0x0200
public const val SCTP_DATA_UNSENT: CInt = 0x0001
public const val SCTP_DATA_SENT: CInt = 0x0002
public const val SCTP_PARTIAL_DELIVERY_ABORTED: CInt = 0x0001
public const val SCTP_AUTH_NEW_KEY: CInt = 0x0001
public const val SCTP_AUTH_NEWKEY: CInt = SCTP_AUTH_NEW_KEY
public const val SCTP_AUTH_NO_AUTH: CInt = 0x0002
public const val SCTP_AUTH_FREE_KEY: CInt = 0x0003
public const val SCTP_STREAM_RESET_INCOMING_SSN: CInt = 0x0001
public const val SCTP_STREAM_RESET_OUTGOING_SSN: CInt = 0x0002
public const val SCTP_STREAM_RESET_DENIED: CInt = 0x0004
public const val SCTP_STREAM_RESET_FAILED: CInt = 0x0008
public const val SCTP_ASSOC_RESET_DENIED: CInt = 0x0004
public const val SCTP_ASSOC_RESET_FAILED: CInt = 0x0008
public const val SCTP_STREAM_CHANGE_DENIED: CInt = 0x0004
public const val SCTP_STREAM_CHANGE_FAILED: CInt = 0x0008
public const val KENV_DUMP_LOADER: CInt = 4
public const val KENV_DUMP_STATIC: CInt = 5
public const val RB_PAUSE: CInt = 0x100000
public const val RB_REROOT: CInt = 0x200000
public const val RB_POWERCYCLE: CInt = 0x400000
public const val RB_PROBE: CInt = 0x10000000
public const val RB_MULTIPLE: CInt = 0x20000000
public val INC_ISIPV6: CUChar = (0x01).toUByte()
public val INC_IPV6MINMTU: CUChar = (0x02).toUByte()
public const val CLOCK_BOOTTIME: ClockidT = CLOCK_UPTIME
public const val CLOCK_REALTIME_COARSE: ClockidT = CLOCK_REALTIME_FAST
public const val CLOCK_MONOTONIC_COARSE: ClockidT = CLOCK_MONOTONIC_FAST
public const val TFD_NONBLOCK: CInt = O_NONBLOCK
public const val TFD_CLOEXEC: CInt = O_CLOEXEC
public const val TFD_TIMER_ABSTIME: CInt = 0x01
public const val TFD_TIMER_CANCEL_ON_SET: CInt = 0x02
public val CLOSE_RANGE_CLOEXEC: CUInt = 1.toUInt() shl 2
public const val KCMP_FILE: CInt = 100
public const val KCMP_FILEOBJ: CInt = 101
public const val KCMP_FILES: CInt = 102
public const val KCMP_SIGHAND: CInt = 103
public const val KCMP_VM: CInt = 104

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?

public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun mALLOCXALIGN(lg: CUInt): CInt

public expect fun sOCKCREDSIZE(ngrps: ULong): ULong

public expect fun uname(buf: Utsname?): CInt

public expect fun cPUZERO(cpuset: CpusetT?)

public expect fun cPUFILL(cpuset: CpusetT?)

public expect fun cPUSET(cpu: ULong, cpuset: CpusetT?)

public expect fun cPUCLR(cpu: ULong, cpuset: CpusetT?)

public expect fun cPUISSET(cpu: ULong, cpuset: CpusetT?): Boolean

public expect fun cPUCOUNT(cpuset: CpusetT?): CInt

public expect fun sOCKCRED2SIZE(ngrps: ULong): ULong

public expect fun pROTMAX(x: CInt): CInt

public expect fun pROTMAXEXTRACT(x: CInt): CInt

public expect fun fhlink(fhp: FhandleT?, to: String?): CInt

public expect fun fhlinkat(fhp: FhandleT?, tofd: CInt, to: String?): CInt

public expect fun fhreadlink(fhp: FhandleT?, buf: String?, bufsize: ULong): CInt

public expect fun getfhat(fd: CInt, path: String?, fhp: Fhandle?, flag: CInt): CInt

public expect fun error(): CInt?

public expect fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt

public expect fun aioError(aiocbp: Aiocb?): CInt

public expect fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt

public expect fun aioRead(aiocbp: Aiocb?): CInt

public expect fun aioReadv(aiocbp: Aiocb?): CInt

public expect fun aioReturn(aiocbp: Aiocb?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt

public expect fun aioWrite(aiocbp: Aiocb?): CInt

public expect fun aioWritev(aiocbp: Aiocb?): CInt

public expect fun copyFileRange(infd: CInt, inoffp: OffT?, outfd: CInt, outoffp: OffT?, len: ULong, flags: CUInt): SsizeT

public expect fun devnameR(dev: DevT, mode: ModeT, buf: String?, len: CInt): String?

public expect fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt

public expect fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt

public expect fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt

public expect fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT

public expect fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT

public expect fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT

public expect fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT

public expect fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT

public expect fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT

public expect fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT

public expect fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT

public expect fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT

public expect fun fspacectl(fd: CInt, cmd: CInt, rqsr: SpacectlRange?, flags: CInt, rmsr: SpacectlRange?): CInt

public expect fun jail(jail: Jail?): CInt

public expect fun jailAttach(jid: CInt): CInt

public expect fun jailRemove(jid: CInt): CInt

public expect fun jailGet(iov: Iovec?, niov: CUInt, flags: CInt): CInt

public expect fun jailSet(iov: Iovec?, niov: CUInt, flags: CInt): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt

public expect fun getutxuser(user: String?): Utmpx?

public expect fun setutxdb(type: CInt, file: String?): CInt

public expect fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): SsizeT

public expect fun mqGetfdNp(mqd: MqdT): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt

public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt

public expect fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt

public expect fun cfmakesane(termios: Termios?)

public expect fun pdfork(fdp: CInt?, flags: CInt): PidT

public expect fun pdgetpid(fd: CInt, pidp: PidT?): CInt

public expect fun pdkill(fd: CInt, signum: CInt): CInt

public expect fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: Rtprio?): CInt

public expect fun uuidgen(store: Uuid?, count: CInt): CInt

public expect fun thrKill(id: CLong, sig: CInt): CInt

public expect fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt

public expect fun thrSelf(tid: CLong?): CInt

public expect fun pthreadGetthreadidNp(): CInt

public expect fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: ULong, cpusetp: CpusetT?): CInt

public expect fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: ULong, cpusetp: CpusetT?): CInt

public expect fun schedGetaffinity(pid: PidT, cpusetsz: ULong, cpuset: CpusetT?): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsz: ULong, cpuset: CpusetT?): CInt

public expect fun schedGetcpu(): CInt

public expect fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt

public expect fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robust: CInt?): CInt

public expect fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robust: CInt): CInt

public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt

public expect fun statfs(path: String?, buf: Statfs?): CInt

public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun xuname(nmln: CInt, buf: COpaquePointer?): CInt

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: ULong, flags: CInt): SsizeT

public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: ULong, flags: CInt, timeout: Timespec?): SsizeT

public expect fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer?

public expect fun fhopen(fhp: FhandleT?, flags: CInt): CInt

public expect fun fhstat(fhp: Fhandle?, buf: Stat?): CInt

public expect fun fhstatfs(fhp: FhandleT?, buf: Statfs?): CInt

public expect fun getfh(path: String?, fhp: FhandleT?): CInt

public expect fun lgetfh(path: String?, fhp: FhandleT?): CInt

public expect fun getfsstat(buf: Statfs?, bufsize: CLong, mode: CInt): CInt

public expect fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt

public expect fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt

public expect fun nmount(iov: Iovec?, niov: CUInt, flags: CInt): CInt

public expect fun setproctitle(fmt: String?, vararg args: Any?)

public expect fun rfork(flags: CInt): CInt

public expect fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: ULong, mask: CpusetT?): CInt

public expect fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: ULong, mask: CpusetT?): CInt

public expect fun cpuset(setid: CpusetidT?): CInt

public expect fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: CpusetidT?): CInt

public expect fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt

public expect fun capEnter(): CInt

public expect fun capGetmode(modep: CUInt?): CInt

public expect fun capFcntlsGet(fd: CInt, fcntlrightsp: UInt?): CInt

public expect fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt

public expect fun capIoctlsGet(fd: CInt, cmds: ULong?, maxcmds: ULong): Long

public expect fun capIoctlsLimit(fd: CInt, cmds: ULong?, ncmds: ULong): CInt

public expect fun capRightsInit(version: CInt, rights: CapRightsT?, vararg args: Any?): CapRightsT?

public expect fun capRightsGet(version: CInt, fd: CInt, rightsp: CapRightsT?): CInt

public expect fun capRightsSet(rights: CapRightsT?, vararg args: Any?): CapRightsT?

public expect fun capRightsClear(rights: CapRightsT?, vararg args: Any?): CapRightsT?

public expect fun capRightsIsSet(rights: CapRightsT?, vararg args: Any?): Boolean

public expect fun capRightsIsValid(rights: CapRightsT?): Boolean

public expect fun capRightsLimit(fd: CInt, rights: CapRightsT?): CInt

public expect fun capRightsMerge(dst: CapRightsT?, src: CapRightsT?): CapRightsT?

public expect fun capRightsRemove(dst: CapRightsT?, src: CapRightsT?): CapRightsT?

public expect fun capRightsContains(big: CapRightsT?, little: CapRightsT?): Boolean

public expect fun capSandboxed(): Boolean

public expect fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer?

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLongLong): CInt

public expect fun fls(value: CInt): CInt

public expect fun flsl(value: CLong): CInt

public expect fun flsll(value: CLongLong): CInt

public expect fun mallocStatsPrint(writeCb: ((COpaquePointer?, String?) -> Unit)?, cbopaque: COpaquePointer?, opt: String?)

public expect fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt

public expect fun mallctlnametomib(name: String?, mibp: ULong?, miplen: ULong?): CInt

public expect fun mallctlbymib(mib: ULong?, mible: ULong, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt

public expect fun mallocx(size: ULong, flags: CInt): COpaquePointer?

public expect fun rallocx(ptr: COpaquePointer?, size: ULong, flags: CInt): COpaquePointer?

public expect fun xallocx(ptr: COpaquePointer?, size: ULong, extra: ULong, flags: CInt): ULong

public expect fun sallocx(ptr: COpaquePointer?, flags: CInt): ULong

public expect fun dallocx(ptr: COpaquePointer?, flags: CInt)

public expect fun sdallocx(ptr: COpaquePointer?, size: ULong, flags: CInt)

public expect fun nallocx(size: ULong, flags: CInt): ULong

public expect fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt

public expect fun getpagesize(): CInt

public expect fun getpagesizes(pagesize: ULong?, nelem: CInt): CInt

public expect fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: ClockidT?): CInt

public expect fun strchrnul(s: String?, c: CInt): String?

public expect fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt

public expect fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt

public expect fun memfdCreate(name: String?, flags: CUInt): CInt

public expect fun setaudit(auditinfo: AuditinfoT?): CInt

public expect fun eventfd(initval: CUInt, flags: CInt): CInt

public expect fun eventfdRead(fd: CInt, value: EventfdT?): CInt

public expect fun eventfdWrite(fd: CInt, value: EventfdT): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt

public expect fun setproctitleFast(fmt: String?, vararg args: Any?)

public expect fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt

public expect fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt

public expect fun umtxOp(obj: COpaquePointer?, op: CInt, `val`: CULong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt

public expect fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt

public expect fun sctpBindx(s: CInt, addrs: Sockaddr?, num: CInt, tpe: CInt): CInt

public expect fun sctpConnectx(s: CInt, addrs: Sockaddr?, addrcnt: CInt, id: SctpAssocT?): CInt

public expect fun sctpGetaddrlen(family: SaFamilyT): CInt

public expect fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt

public expect fun sctpFreepaddrs(addrs: Sockaddr?)

public expect fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt

public expect fun sctpFreeladdrs(addrs: Sockaddr?)

public expect fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: COpaquePointer?, size: SocklenT?): CInt

public expect fun sctpSendv(sd: CInt, iov: Iovec?, iovcnt: CInt, addrs: Sockaddr?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUInt, flags: CInt): SsizeT

public expect fun sctpRecvv(sd: CInt, iov: Iovec?, iovcnt: CInt, from: Sockaddr?, fromlen: SocklenT?, info: COpaquePointer?, infolen: SocklenT?, infotype: CUInt?, flags: CInt?): SsizeT

public expect fun timerfdCreate(clockid: CInt, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt

public expect fun closefrom(lowfd: CInt)

public expect fun closeRange(lowfd: CUInt, highfd: CUInt, flags: CInt): CInt

public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CULong, idx2: CULong): CInt

public expect fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer?

public expect fun memstatStrerror(error: CInt): String?

public expect fun memstatMtlAlloc(): MemoryTypeList?

public expect fun memstatMtlFirst(list: MemoryTypeList?): MemoryType?

public expect fun memstatMtlNext(mtp: MemoryType?): MemoryType?

public expect fun memstatMtlFind(list: MemoryTypeList?, allocator: CInt, name: String?): MemoryType?

public expect fun memstatMtlFree(list: MemoryTypeList?)

public expect fun memstatMtlGeterror(list: MemoryTypeList?): CInt

public expect fun memstatGetName(mtp: MemoryType?): String?

public expect fun kvmDpcpuSetcpu(kd: KvmT?, cpu: CUInt): CInt

public expect fun kvmGetargv(kd: KvmT?, p: KinfoProc?, nchr: CInt): COpaquePointer?

public expect fun kvmGetcptime(kd: KvmT?, cpTime: CLong?): CInt

public expect fun kvmGetenvv(kd: KvmT?, p: KinfoProc?, nchr: CInt): COpaquePointer?

public expect fun kvmGeterr(kd: KvmT?): String?

public expect fun kvmGetmaxcpu(kd: KvmT?): CInt

public expect fun kvmGetncpus(kd: KvmT?): CInt

public expect fun kvmGetpcpu(kd: KvmT?, cpu: CInt): COpaquePointer?

public expect fun kvmCounterU64Fetch(kd: KvmT?, base: CULong): ULong

public expect fun kvmGetswapinfo(kd: KvmT?, info: KvmSwap?, maxswap: CInt, flags: CInt): CInt

public expect fun kvmNative(kd: KvmT?): CInt

public expect fun kvmNlist(kd: KvmT?, nl: Nlist?): CInt

public expect fun kvmNlist2(kd: KvmT?, nl: KvmNlist?): CInt

public expect fun kvmReadZpcpu(kd: KvmT?, base: CULong, buf: COpaquePointer?, size: ULong, cpu: CInt): SsizeT

public expect fun kvmRead2(kd: KvmT?, addr: KvaddrT, buf: COpaquePointer?, nbytes: ULong): SsizeT

public expect fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt

public expect fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt

public expect fun realhostname(host: String?, hsize: ULong, ip: InAddr?): CInt

public expect fun realhostnameSa(host: String?, hsize: ULong, addr: Sockaddr?, addrlen: CInt): CInt

public expect fun kldIsloaded(name: String?): CInt

public expect fun kldLoad(name: String?): CInt

public expect fun kinfoGetvmmap(pid: PidT, cntp: CInt?): KinfoVmentry?

public expect fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt)

public expect fun humanizeNumber(buf: String?, len: ULong, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt

public expect fun flopen(path: String?, flags: CInt, vararg args: Any?): CInt

public expect fun flopenat(fd: CInt, path: String?, flags: CInt, vararg args: Any?): CInt

public expect fun getlocalbase(): String?

public expect fun pidfileOpen(path: String?, mode: ModeT, pidptr: PidT?): Pidfh?

public expect fun pidfileWrite(path: Pidfh?): CInt

public expect fun pidfileClose(path: Pidfh?): CInt

public expect fun pidfileRemove(path: Pidfh?): CInt

public expect fun pidfileFileno(path: Pidfh?): CInt

public expect fun procstatOpenSysctl(): Procstat?

public expect fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: CInt): FilestatList?

public expect fun procstatFreefiles(procstat: Procstat?, head: FilestatList?)

public expect fun procstatGetprocs(procstat: Procstat?, what: CInt, arg: CInt, count: CUInt?): KinfoProc?

public expect fun procstatFreeprocs(procstat: Procstat?, p: KinfoProc?)

public expect fun procstatGetvmmap(procstat: Procstat?, kp: KinfoProc?, count: CUInt?): KinfoVmentry?

public expect fun procstatFreevmmap(procstat: Procstat?, vmmap: KinfoVmentry?)

public expect fun procstatClose(procstat: Procstat?)

public expect fun procstatFreeargv(procstat: Procstat?)

public expect fun procstatFreeenvv(procstat: Procstat?)

public expect fun procstatFreegroups(procstat: Procstat?, groups: GidT?)

public expect fun procstatFreeptlwpinfo(procstat: Procstat?, pl: PtraceLwpinfo?)

public expect fun procstatGetargv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer?

public expect fun procstatGetenvv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer?

public expect fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: CUInt?): GidT?

public expect fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: CInt?): CInt

public expect fun procstatGetpathname(procstat: Procstat?, kp: KinfoProc?, pathname: String?, maxlen: ULong): CInt

public expect fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: CInt, rlimit: Rlimit?): CInt

public expect fun procstatGetumask(procstat: Procstat?, kp: KinfoProc?, maskp: CUShort?): CInt

public expect fun procstatOpenCore(filename: String?): Procstat?

public expect fun procstatOpenKvm(nlistf: String?, memf: String?): Procstat?

public expect fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: String?): CInt

public expect fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Vnstat?, errbuf: String?): CInt

public expect fun procstatGetPtsInfo(proc: Procstat?, fst: Filestat?, pts: Ptsstat?, errbuf: String?): CInt

public expect fun procstatGetShmInfo(proc: Procstat?, fst: Filestat?, shm: Shmstat?, errbuf: String?): CInt

public expect fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: TimerT?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt

public expect fun devstatGetnumdevs(kd: KvmT?): CInt

public expect fun devstatGetgeneration(kd: KvmT?): CLong

public expect fun devstatGetversion(kd: KvmT?): CInt

public expect fun devstatCheckversion(kd: KvmT?): CInt

public expect fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: CInt?, numSelections: CInt?, selectGeneration: CLong?, currentGeneration: CLong, devices: Devstat?, numdevs: CInt, matches: DevstatMatch?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt

public expect fun devstatBuildmatch(matchStr: String?, matches: COpaquePointer?, numMatches: CInt?): CInt
