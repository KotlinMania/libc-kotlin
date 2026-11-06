// port-lint: source unix/bsd/apple/apple_mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.BlkcntT
import io.github.kotlinmania.libc.BooleanT
import io.github.kotlinmania.libc.CMSG_FIRSTHDR
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CcT
import io.github.kotlinmania.libc.Cmsghdr
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FsidT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.In6Addr
import io.github.kotlinmania.libc.InAddrT
import io.github.kotlinmania.libc.InPortT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.LocaleT
import io.github.kotlinmania.libc.MallocZoneT
import io.github.kotlinmania.libc.Msghdr
import io.github.kotlinmania.libc.OffT
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.PthreadAttrT
import io.github.kotlinmania.libc.PthreadCondT
import io.github.kotlinmania.libc.PthreadMutexT
import io.github.kotlinmania.libc.PthreadT
import io.github.kotlinmania.libc.SaFamilyT
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.Sigval
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.SockaddrIn6
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.UintptrT
import io.github.kotlinmania.libc.Utsname
import io.github.kotlinmania.libc.Winsize

// Apple (ios/darwin)-specific definitions
//
// This covers *-apple-* triples currently

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public typealias WcharT = Int

public typealias ClockT = CUlong

public typealias TimeT = CLong

public typealias SusecondsT = Int

public typealias DevT = Int

public typealias InoT = ULong

public typealias ModeT = UShort

public typealias NlinkT = UShort

public typealias BlksizeT = Int

public typealias RlimT = ULong

public typealias SigsetT = UInt

public typealias ClockidT = CUint

public typealias FsblkcntT = CUint

public typealias FsfilcntT = CUint

public typealias SpeedT = CUlong

public typealias TcflagT = CUlong

public typealias NlItem = CInt

public typealias IdT = CUint

public typealias SemT = CInt

public typealias IdtypeT = CUint

public typealias IntegerT = CInt

public typealias CpuTypeT = IntegerT

public typealias CpuSubtypeT = IntegerT

public typealias NaturalT = UInt

public typealias MachMsgTypeNumberT = NaturalT

public typealias KernReturnT = CInt

public typealias UuidT = List<UByte>

public typealias TaskInfoT = CInt?

public typealias HostInfoT = CInt?

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

public typealias ShmattT = CUshort

public typealias SaeAssocidT = UInt

public typealias SaeConnidT = UInt

public typealias MachPortT = CUint

public typealias HostT = CUint

public typealias HostFlavorT = IntegerT

public typealias HostInfo64T = CInt?

public typealias ProcessorFlavorT = CInt

public typealias ThreadFlavorT = NaturalT

public typealias ThreadInspectT = io.github.kotlinmania.libc.MachPortT

public typealias ThreadActT = io.github.kotlinmania.libc.MachPortT

public typealias ThreadActArrayT = CUint?

public typealias PolicyT = CInt

public typealias MachErrorT = io.github.kotlinmania.libc.KernReturnT

public typealias MachVmAddressT = ULong

public typealias MachVmOffsetT = ULong

public typealias MachVmSizeT = ULong

public typealias VmMapT = io.github.kotlinmania.libc.MachPortT

public typealias MemEntryNamePortT = io.github.kotlinmania.libc.MachPortT

public typealias MemoryObjectT = io.github.kotlinmania.libc.MachPortT

public typealias MemoryObjectOffsetT = CUlonglong

public typealias VmInheritT = CUint

public typealias VmProtT = CInt

public typealias LedgerT = io.github.kotlinmania.libc.MachPortT

public typealias LedgerArrayT = CUint?

public typealias IconvT = COpaquePointer?

// mach/hostInfo.h
public typealias HostCpuLoadInfoT = HostCpuLoadInfo?

public typealias HostCpuLoadInfoDataT = HostCpuLoadInfo

// mach/processorInfo.h
public typealias ProcessorCpuLoadInfoT = ProcessorCpuLoadInfo?

public typealias ProcessorCpuLoadInfoDataT = ProcessorCpuLoadInfo

public typealias ProcessorBasicInfoT = ProcessorBasicInfo?

public typealias ProcessorBasicInfoDataT = ProcessorBasicInfo

public typealias ProcessorSetBasicInfoDataT = ProcessorSetBasicInfo

public typealias ProcessorSetBasicInfoT = ProcessorSetBasicInfo?

public typealias ProcessorSetLoadInfoDataT = ProcessorSetLoadInfo

public typealias ProcessorSetLoadInfoT = ProcessorSetLoadInfo?

public typealias ProcessorInfoT = CInt?

public typealias ProcessorInfoArrayT = CInt?

public typealias MachTaskBasicInfoDataT = MachTaskBasicInfo

public typealias MachTaskBasicInfoT = MachTaskBasicInfo?

public typealias TaskThreadTimesInfoDataT = TaskThreadTimesInfo

public typealias TaskThreadTimesInfoT = TaskThreadTimesInfo?

public typealias ThreadInfoT = CInt?

public typealias ThreadBasicInfoT = ThreadBasicInfo?

public typealias ThreadBasicInfoDataT = ThreadBasicInfo

public typealias ThreadIdentifierInfoT = ThreadIdentifierInfo?

public typealias ThreadIdentifierInfoDataT = ThreadIdentifierInfo

public typealias ThreadExtendedInfoT = ThreadExtendedInfo?

public typealias ThreadExtendedInfoDataT = ThreadExtendedInfo

public typealias ThreadT = io.github.kotlinmania.libc.MachPortT

public typealias ThreadPolicyFlavorT = NaturalT

public typealias ThreadPolicyT = CInt?

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

public fun interface PthreadJitWriteCallbackTFn {
    public operator fun invoke(ctx: COpaquePointer?): CInt
}

public typealias PthreadJitWriteCallbackT = PthreadJitWriteCallbackTFn?

public typealias OsClockidT = UInt

public typealias OsSyncWaitOnAddressFlagsT = UInt

public typealias OsSyncWakeByAddressFlagsT = UInt

public typealias OsUnfairLock = OsUnfairLockS

public typealias OsUnfairLockT = OsUnfairLockS?

public typealias OsLogT = COpaquePointer?

public typealias OsLogTypeT = UByte

public typealias OsSignpostIdT = ULong

public typealias OsSignpostTypeT = UByte

public typealias VmStatisticsT = VmStatistics?

public typealias VmStatisticsDataT = VmStatistics

public typealias VmStatistics64T = VmStatistics64?

public typealias VmStatistics64DataT = VmStatistics64

public typealias TaskT = io.github.kotlinmania.libc.MachPortT

public typealias TaskInspectT = io.github.kotlinmania.libc.MachPortT

public typealias SysdirSearchPathEnumerationState = CUint

public typealias CCStatus = Int

public typealias CCCryptorStatus = Int

public typealias CCRNGStatus = io.github.kotlinmania.libc.CCCryptorStatus

public typealias CopyfileStateT = COpaquePointer?

public typealias CopyfileFlagsT = UInt

public fun interface CopyfileCallbackTFn {
    public operator fun invoke(arg0: CInt, arg1: CInt, arg2: CopyfileStateT, arg3: COpaquePointer?, arg4: COpaquePointer?, arg5: COpaquePointer?): CInt
}

public typealias CopyfileCallbackT = CopyfileCallbackTFn?

public typealias AttrgroupT = UInt

public typealias VolCapabilitiesSetT = List<UInt>

public typealias MachTimebaseInfoDataT = MachTimebaseInfo

public sealed class Timezone {
}

public sealed class SysdirSearchPathDirectoryT(public val value: UInt) {
    public data object SysdirDirectoryApplication : SysdirSearchPathDirectoryT(1u)
    public data object SysdirDirectoryDemoApplication : SysdirSearchPathDirectoryT(2u)
    public data object SysdirDirectoryDeveloperApplication : SysdirSearchPathDirectoryT(3u)
    public data object SysdirDirectoryAdminApplication : SysdirSearchPathDirectoryT(4u)
    public data object SysdirDirectoryLibrary : SysdirSearchPathDirectoryT(5u)
    public data object SysdirDirectoryDeveloper : SysdirSearchPathDirectoryT(6u)
    public data object SysdirDirectoryUser : SysdirSearchPathDirectoryT(7u)
    public data object SysdirDirectoryDocumentation : SysdirSearchPathDirectoryT(8u)
    public data object SysdirDirectoryDocument : SysdirSearchPathDirectoryT(9u)
    public data object SysdirDirectoryCoreservice : SysdirSearchPathDirectoryT(10u)
    public data object SysdirDirectoryAutosavedInformation : SysdirSearchPathDirectoryT(11u)
    public data object SysdirDirectoryDesktop : SysdirSearchPathDirectoryT(12u)
    public data object SysdirDirectoryCaches : SysdirSearchPathDirectoryT(13u)
    public data object SysdirDirectoryApplicationSupport : SysdirSearchPathDirectoryT(14u)
    public data object SysdirDirectoryDownloads : SysdirSearchPathDirectoryT(15u)
    public data object SysdirDirectoryInputMethods : SysdirSearchPathDirectoryT(16u)
    public data object SysdirDirectoryMovies : SysdirSearchPathDirectoryT(17u)
    public data object SysdirDirectoryMusic : SysdirSearchPathDirectoryT(18u)
    public data object SysdirDirectoryPictures : SysdirSearchPathDirectoryT(19u)
    public data object SysdirDirectoryPrinterDescription : SysdirSearchPathDirectoryT(20u)
    public data object SysdirDirectorySharedPublic : SysdirSearchPathDirectoryT(21u)
    public data object SysdirDirectoryPreferencePanes : SysdirSearchPathDirectoryT(22u)
    public data object SysdirDirectoryAllApplications : SysdirSearchPathDirectoryT(100u)
    public data object SysdirDirectoryAllLibraries : SysdirSearchPathDirectoryT(101u)

    public open fun clone(): SysdirSearchPathDirectoryT {
        return this
    }
}

public sealed class SysdirSearchPathDomainMaskT(public val value: UInt) {
    public data object SysdirDomainMaskUser : SysdirSearchPathDomainMaskT((1u shl 0))
    public data object SysdirDomainMaskLocal : SysdirSearchPathDomainMaskT((1u shl 1))
    public data object SysdirDomainMaskNetwork : SysdirSearchPathDomainMaskT((1u shl 2))
    public data object SysdirDomainMaskSystem : SysdirSearchPathDomainMaskT((1u shl 3))
    public data object SysdirDomainMaskAll : SysdirSearchPathDomainMaskT(0x0ffffu)

    public open fun clone(): SysdirSearchPathDomainMaskT {
        return this
    }
}

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class IpMreqn(
    public var imrMultiaddr: InAddr,
    public var imrAddress: InAddr,
    public var imrIfindex: CInt,
)

public open class IpMreqSource(
    public var imrMultiaddr: InAddr,
    public var imrSourceaddr: InAddr,
    public var imrInterface: InAddr,
)

public open class Aiocb(
    public var aioFildes: CInt,
    public var aioOffset: OffT,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var aioLioOpcode: CInt,
)

public open class GlobT(
    public var glPathc: SizeT,
    public var unused1: CInt,
    public var glOffs: SizeT,
    public var unused2: CInt,
    public var glPathv: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
    public var unused6: COpaquePointer?,
    public var unused7: COpaquePointer?,
    public var unused8: COpaquePointer?,
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

public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    public var aiCanonname: COpaquePointer?,
    public var aiAddr: Sockaddr?,
    public var aiNext: Addrinfo?,
)

public open class MachTimebaseInfo(public var numer: UInt, public var denom: UInt)

public open class Stat(
    public var stDev: DevT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stIno: InoT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stBirthtime: TimeT,
    public var stBirthtimeNsec: CLong,
    public var stSize: OffT,
    public var stBlocks: BlkcntT,
    public var stBlksize: BlksizeT,
    public var stFlags: UInt,
    public var stGen: UInt,
    public var stLspare: Int,
    public var stQspare: List<Long>,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var siPid: PidT,
    public var siUid: UidT,
    public var siStatus: CInt,
    public var siAddr: COpaquePointer?,
    // Requires it to be union for tests
    // pub siValue: crate::sigval,
    public var pad: List<Int>,
) {
    public open fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public open fun siValue(): Sigval {
        open class SiginfoTimer(
            public var siSigno: CInt,
            public var siErrno: CInt,
            public var siCode: CInt,
            public var siPid: PidT,
            public var siUid: UidT,
            public var siStatus: CInt,
            public var siAddr: COpaquePointer?,
            public var siValue: Sigval,
        )
        return (if (((this as SiginfoT?)) == null) null else SiginfoTimer()).siValue
    }

    public open fun siPid(): PidT {
        return this.siPid
    }

    public open fun siUid(): UidT {
        return this.siUid
    }

    public open fun siStatus(): CInt {
        return this.siStatus
    }
}

public open class Sigaction(
    // Note(union): this field is actually a union
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class FstoreT(
    public var fstFlags: CUint,
    public var fstPosmode: CInt,
    public var fstOffset: OffT,
    public var fstLength: OffT,
    public var fstBytesalloc: OffT,
)

public open class FpunchholeT(
    public var fpFlags: CUint,
    // unused
    public var reserved: CUint,
    // (to maintain 8-byte alignment)
    public var fpOffset: OffT,
    // IN: start of the region
    public var fpLength: OffT,
)

public open class FtrimactivefileT(public var ftaOffset: OffT, public var ftaLength: OffT)

public open class FspecreadT(
    public var fsrFlags: CUint,
    public var reserved: CUint,
    public var fsrOffset: OffT,
    public var fsrLength: OffT,
)

public open class Radvisory(public var raOffset: OffT, public var raCount: CInt)

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

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class SockaddrIn(
    public var sinLen: UByte,
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: io.github.kotlinmania.libc.InAddr,
    public var sinZero: List<CChar>,
)

public open class Kevent64S(
    public var ident: ULong,
    public var filter: Short,
    public var flags: UShort,
    public var fflags: UInt,
    public var data: Long,
    public var udata: ULong,
    public var ext: List<ULong>,
)

public open class Dqblk(
    public var dqbBhardlimit: ULong,
    public var dqbBsoftlimit: ULong,
    public var dqbCurbytes: ULong,
    public var dqbIhardlimit: UInt,
    public var dqbIsoftlimit: UInt,
    public var dqbCurinodes: UInt,
    public var dqbBtime: UInt,
    public var dqbItime: UInt,
    public var dqbId: UInt,
    public var dqbSpare: List<UInt>,
)

public open class IfMsghdr(
    public var ifmMsglen: CUshort,
    public var ifmVersion: CUchar,
    public var ifmType: CUchar,
    public var ifmAddrs: CInt,
    public var ifmFlags: CInt,
    public var ifmIndex: CUshort,
    public var ifmData: IfData,
)

public open class IfaMsghdr(
    public var ifamMsglen: CUshort,
    public var ifamVersion: CUchar,
    public var ifamType: CUchar,
    public var ifamAddrs: CInt,
    public var ifamFlags: CInt,
    public var ifamIndex: CUshort,
    public var ifamMetric: CInt,
)

public open class IfmaMsghdr(
    public var ifmamMsglen: CUshort,
    public var ifmamVersion: CUchar,
    public var ifmamType: CUchar,
    public var ifmamAddrs: CInt,
    public var ifmamFlags: CInt,
    public var ifmamIndex: CUshort,
)

public open class IfmaMsghdr2(
    public var ifmamMsglen: CUshort,
    public var ifmamVersion: CUchar,
    public var ifmamType: CUchar,
    public var ifmamAddrs: CInt,
    public var ifmamFlags: CInt,
    public var ifmamIndex: CUshort,
    public var ifmamRefcount: Int,
)

public open class RtMetrics(
    public var rmxLocks: UInt,
    public var rmxMtu: UInt,
    public var rmxHopcount: UInt,
    public var rmxExpire: Int,
    public var rmxRecvpipe: UInt,
    public var rmxSendpipe: UInt,
    public var rmxSsthresh: UInt,
    public var rmxRtt: UInt,
    public var rmxRttvar: UInt,
    public var rmxPksent: UInt,
    /**
     * This field does not exist anymore, the u32 is now part of a resized
     * `rmxFiller` array.
     */
    public var rmxState: UInt,
    public var rmxFiller: List<UInt>,
)

public open class RtMsghdr(
    public var rtmMsglen: CUshort,
    public var rtmVersion: CUchar,
    public var rtmType: CUchar,
    public var rtmIndex: CUshort,
    public var rtmFlags: CInt,
    public var rtmAddrs: CInt,
    public var rtmPid: PidT,
    public var rtmSeq: CInt,
    public var rtmErrno: CInt,
    public var rtmUse: CInt,
    public var rtmInits: UInt,
    public var rtmRmx: RtMetrics,
)

public open class RtMsghdr2(
    public var rtmMsglen: CUshort,
    public var rtmVersion: CUchar,
    public var rtmType: CUchar,
    public var rtmIndex: CUshort,
    public var rtmFlags: CInt,
    public var rtmAddrs: CInt,
    public var rtmRefcnt: Int,
    public var rtmParentflags: CInt,
    public var rtmReserved: CInt,
    public var rtmUse: CInt,
    public var rtmInits: UInt,
    public var rtmRmx: RtMetrics,
)

public open class Termios(
    public var cIflag: io.github.kotlinmania.libc.TcflagT,
    public var cOflag: io.github.kotlinmania.libc.TcflagT,
    public var cCflag: io.github.kotlinmania.libc.TcflagT,
    public var cLflag: io.github.kotlinmania.libc.TcflagT,
    public var cCc: List<CcT>,
    public var cIspeed: io.github.kotlinmania.libc.SpeedT,
    public var cOspeed: io.github.kotlinmania.libc.SpeedT,
)

public open class Flock(
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
    public var lType: CShort,
    public var lWhence: CShort,
)

public open class SfHdtr(
    public var headers: Iovec?,
    public var hdrCnt: CInt,
    public var trailers: Iovec?,
    public var trlCnt: CInt,
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
    public var intNCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intNSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var intNSignPosn: CChar,
)

public open class ProcTaskinfo(
    public var ptiVirtualSize: ULong,
    public var ptiResidentSize: ULong,
    public var ptiTotalUser: ULong,
    public var ptiTotalSystem: ULong,
    public var ptiThreadsUser: ULong,
    public var ptiThreadsSystem: ULong,
    public var ptiPolicy: Int,
    public var ptiFaults: Int,
    public var ptiPageins: Int,
    public var ptiCowFaults: Int,
    public var ptiMessagesSent: Int,
    public var ptiMessagesReceived: Int,
    public var ptiSyscallsMach: Int,
    public var ptiSyscallsUnix: Int,
    public var ptiCsw: Int,
    public var ptiThreadnum: Int,
    public var ptiNumrunning: Int,
    public var ptiPriority: Int,
)

public open class ProcBsdinfo(
    public var pbiFlags: UInt,
    public var pbiStatus: UInt,
    public var pbiXstatus: UInt,
    public var pbiPid: UInt,
    public var pbiPpid: UInt,
    public var pbiUid: UidT,
    public var pbiGid: GidT,
    public var pbiRuid: UidT,
    public var pbiRgid: GidT,
    public var pbiSvuid: UidT,
    public var pbiSvgid: GidT,
    public var rfu1: UInt,
    public var pbiComm: List<CChar>,
    public var pbiName: List<CChar>,
    // MAXCOMLEN * 2, but macro isn't happy...
    public var pbiNfiles: UInt,
    public var pbiPgid: UInt,
    public var pbiPjobc: UInt,
    public var eTdev: UInt,
    public var eTpgid: UInt,
    public var pbiNice: Int,
    public var pbiStartTvsec: ULong,
    public var pbiStartTvusec: ULong,
)

public open class ProcTaskallinfo(public var pbsd: ProcBsdinfo, public var ptinfo: ProcTaskinfo)

public open class XswUsage(
    public var xsuTotal: ULong,
    public var xsuAvail: ULong,
    public var xsuUsed: ULong,
    public var xsuPagesize: UInt,
    public var xsuEncrypted: BooleanT,
)

public open class Xucred(
    public var crVersion: CUint,
    public var crUid: UidT,
    public var crNgroups: CShort,
    public var crGroups: List<GidT>,
)

public open class MachHeader(
    public var magic: UInt,
    public var cputype: CpuTypeT,
    public var cpusubtype: CpuSubtypeT,
    public var filetype: UInt,
    public var ncmds: UInt,
    public var sizeofcmds: UInt,
    public var flags: UInt,
)

public open class MachHeader64(
    public var magic: UInt,
    public var cputype: CpuTypeT,
    public var cpusubtype: CpuSubtypeT,
    public var filetype: UInt,
    public var ncmds: UInt,
    public var sizeofcmds: UInt,
    public var flags: UInt,
    public var reserved: UInt,
)

public open class SegmentCommand(
    public var cmd: UInt,
    public var cmdsize: UInt,
    public var segname: List<CChar>,
    public var vmaddr: UInt,
    public var vmsize: UInt,
    public var fileoff: UInt,
    public var filesize: UInt,
    public var maxprot: VmProtT,
    public var initprot: VmProtT,
    public var nsects: UInt,
    public var flags: UInt,
)

public open class SegmentCommand64(
    public var cmd: UInt,
    public var cmdsize: UInt,
    public var segname: List<CChar>,
    public var vmaddr: ULong,
    public var vmsize: ULong,
    public var fileoff: ULong,
    public var filesize: ULong,
    public var maxprot: VmProtT,
    public var initprot: VmProtT,
    public var nsects: UInt,
    public var flags: UInt,
)

public open class LoadCommand(public var cmd: UInt, public var cmdsize: UInt)

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

public open class SockaddrInarp(
    public var sinLen: CUchar,
    public var sinFamily: CUchar,
    public var sinPort: CUshort,
    public var sinAddr: io.github.kotlinmania.libc.InAddr,
    public var sinSrcaddr: io.github.kotlinmania.libc.InAddr,
    public var sinTos: CUshort,
    public var sinOther: CUshort,
)

public open class SockaddrCtl(
    public var scLen: CUchar,
    public var scFamily: CUchar,
    public var ssSysaddr: UShort,
    public var scId: UInt,
    public var scUnit: UInt,
    public var scReserved: List<UInt>,
)

public open class InPktinfo(
    public var ipiIfindex: CUint,
    public var ipiSpecDst: io.github.kotlinmania.libc.InAddr,
    public var ipiAddr: io.github.kotlinmania.libc.InAddr,
)

public open class In6Pktinfo(public var ipi6Addr: In6Addr, public var ipi6Ifindex: CUint)

// sys/ipc.h:
public open class IpcPerm(
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
    public var seq: CUshort,
    public var key: io.github.kotlinmania.libc.KeyT,
)

// sys/sem.h
public open class Sembuf(
    public var semNum: CUshort,
    public var semOp: CShort,
    public var semFlg: CShort,
)

// sys/shm.h
public open class Arphdr(
    public var arHrd: UShort,
    public var arPro: UShort,
    public var arHln: UByte,
    public var arPln: UByte,
    public var arOp: UShort,
)

public open class InAddr(public var sAddr: InAddrT)

// net/ndrv.h
public open class SockaddrNdrv(
    public var sndLen: CUchar,
    public var sndFamily: CUchar,
    public var sndName: List<CUchar>,
)

// sys/socket.h
public open class SaEndpointsT(
    public var saeSrcif: CUint,
    // optional source interface
    public var saeSrcaddr: Sockaddr?,
    // optional source address
    public var saeSrcaddrlen: SocklenT,
    // size of source address
    public var saeDstaddr: Sockaddr?,
    // destination address
    public var saeDstaddrlen: SocklenT,
)

public open class Timex(
    public var modes: CUint,
    public var offset: CLong,
    public var freq: CLong,
    public var maxerror: CLong,
    public var esterror: CLong,
    public var status: CInt,
    public var constant: CLong,
    public var precision: CLong,
    public var tolerance: CLong,
    public var ppsfreq: CLong,
    public var jitter: CLong,
    public var shift: CInt,
    public var stabil: CLong,
    public var jitcnt: CLong,
    public var calcnt: CLong,
    public var errcnt: CLong,
    public var stbcnt: CLong,
)

public open class Ntptimeval(
    public var time: Timespec,
    public var maxerror: CLong,
    public var esterror: CLong,
    public var tai: CLong,
    public var timeState: CInt,
)

public open class ThreadStandardPolicy(public var noData: NaturalT)

public open class ThreadExtendedPolicy(public var timeshare: BooleanT)

public open class ThreadTimeConstraintPolicy(
    public var period: UInt,
    public var computation: UInt,
    public var constraint: UInt,
    public var preemptible: BooleanT,
)

public open class ThreadPrecedencePolicy(public var importance: IntegerT)

public open class ThreadAffinityPolicy(public var affinityTag: IntegerT)

public open class ThreadBackgroundPolicy(public var priority: IntegerT)

public open class ThreadLatencyQosPolicy(public var threadLatencyQosTier: ThreadLatencyQosT)

public open class ThreadThroughputQosPolicy(public var threadThroughputQosTier: ThreadThroughputQosT)

// malloc/malloc.h
public open class MallocStatisticsT(
    public var blocksInUse: CUint,
    public var sizeInUse: SizeT,
    public var maxSizeInUse: SizeT,
    public var sizeAllocated: SizeT,
)

public open class Mstats(
    public var bytesTotal: SizeT,
    public var chunksUsed: SizeT,
    public var bytesUsed: SizeT,
    public var chunksFree: SizeT,
    public var bytesFree: SizeT,
)

public open class VmRangeT(public var address: io.github.kotlinmania.libc.VmAddressT, public var size: io.github.kotlinmania.libc.VmSizeT)

public open class VinfoStat(
    public var vstDev: UInt,
    public var vstMode: UShort,
    public var vstNlink: UShort,
    public var vstIno: ULong,
    public var vstUid: UidT,
    public var vstGid: GidT,
    public var vstAtime: Long,
    public var vstAtimensec: Long,
    public var vstMtime: Long,
    public var vstMtimensec: Long,
    public var vstCtime: Long,
    public var vstCtimensec: Long,
    public var vstBirthtime: Long,
    public var vstBirthtimensec: Long,
    public var vstSize: OffT,
    public var vstBlocks: Long,
    public var vstBlksize: Int,
    public var vstFlags: UInt,
    public var vstGen: UInt,
    public var vstRdev: UInt,
    public var vstQspare: List<Long>,
)

public open class VnodeInfo(
    public var viStat: VinfoStat,
    public var viType: CInt,
    public var viPad: CInt,
    public var viFsid: FsidT,
)

public open class VnodeInfoPath(
    public var vipVi: VnodeInfo,
    // Normally it's `vipPath: [cChar; MAXPATHLEN]` but because libc supports an old rustc
    // version, we go around this limitation like this.
    public var vipPath: List<List<CChar>>,
)

public open class ProcVnodepathinfo(public var pviCdir: VnodeInfoPath, public var pviRdir: VnodeInfoPath)

public open class VmStatistics(
    public var freeCount: NaturalT,
    public var activeCount: NaturalT,
    public var inactiveCount: NaturalT,
    public var wireCount: NaturalT,
    public var zeroFillCount: NaturalT,
    public var reactivations: NaturalT,
    public var pageins: NaturalT,
    public var pageouts: NaturalT,
    public var faults: NaturalT,
    public var cowFaults: NaturalT,
    public var lookups: NaturalT,
    public var hits: NaturalT,
    public var purgeableCount: NaturalT,
    public var purges: NaturalT,
    public var speculativeCount: NaturalT,
)

public open class TaskThreadTimesInfo(public var userTime: TimeValueT, public var systemTime: TimeValueT)

public open class RusageInfoV0(
    public var riUuid: List<UByte>,
    public var riUserTime: ULong,
    public var riSystemTime: ULong,
    public var riPkgIdleWkups: ULong,
    public var riInterruptWkups: ULong,
    public var riPageins: ULong,
    public var riWiredSize: ULong,
    public var riResidentSize: ULong,
    public var riPhysFootprint: ULong,
    public var riProcStartAbstime: ULong,
    public var riProcExitAbstime: ULong,
)

public open class RusageInfoV1(
    public var riUuid: List<UByte>,
    public var riUserTime: ULong,
    public var riSystemTime: ULong,
    public var riPkgIdleWkups: ULong,
    public var riInterruptWkups: ULong,
    public var riPageins: ULong,
    public var riWiredSize: ULong,
    public var riResidentSize: ULong,
    public var riPhysFootprint: ULong,
    public var riProcStartAbstime: ULong,
    public var riProcExitAbstime: ULong,
    public var riChildUserTime: ULong,
    public var riChildSystemTime: ULong,
    public var riChildPkgIdleWkups: ULong,
    public var riChildInterruptWkups: ULong,
    public var riChildPageins: ULong,
    public var riChildElapsedAbstime: ULong,
)

public open class RusageInfoV2(
    public var riUuid: List<UByte>,
    public var riUserTime: ULong,
    public var riSystemTime: ULong,
    public var riPkgIdleWkups: ULong,
    public var riInterruptWkups: ULong,
    public var riPageins: ULong,
    public var riWiredSize: ULong,
    public var riResidentSize: ULong,
    public var riPhysFootprint: ULong,
    public var riProcStartAbstime: ULong,
    public var riProcExitAbstime: ULong,
    public var riChildUserTime: ULong,
    public var riChildSystemTime: ULong,
    public var riChildPkgIdleWkups: ULong,
    public var riChildInterruptWkups: ULong,
    public var riChildPageins: ULong,
    public var riChildElapsedAbstime: ULong,
    public var riDiskioBytesread: ULong,
    public var riDiskioByteswritten: ULong,
)

public open class RusageInfoV3(
    public var riUuid: List<UByte>,
    public var riUserTime: ULong,
    public var riSystemTime: ULong,
    public var riPkgIdleWkups: ULong,
    public var riInterruptWkups: ULong,
    public var riPageins: ULong,
    public var riWiredSize: ULong,
    public var riResidentSize: ULong,
    public var riPhysFootprint: ULong,
    public var riProcStartAbstime: ULong,
    public var riProcExitAbstime: ULong,
    public var riChildUserTime: ULong,
    public var riChildSystemTime: ULong,
    public var riChildPkgIdleWkups: ULong,
    public var riChildInterruptWkups: ULong,
    public var riChildPageins: ULong,
    public var riChildElapsedAbstime: ULong,
    public var riDiskioBytesread: ULong,
    public var riDiskioByteswritten: ULong,
    public var riCpuTimeQosDefault: ULong,
    public var riCpuTimeQosMaintenance: ULong,
    public var riCpuTimeQosBackground: ULong,
    public var riCpuTimeQosUtility: ULong,
    public var riCpuTimeQosLegacy: ULong,
    public var riCpuTimeQosUserInitiated: ULong,
    public var riCpuTimeQosUserInteractive: ULong,
    public var riBilledSystemTime: ULong,
    public var riServicedSystemTime: ULong,
)

public open class RusageInfoV4(
    public var riUuid: List<UByte>,
    public var riUserTime: ULong,
    public var riSystemTime: ULong,
    public var riPkgIdleWkups: ULong,
    public var riInterruptWkups: ULong,
    public var riPageins: ULong,
    public var riWiredSize: ULong,
    public var riResidentSize: ULong,
    public var riPhysFootprint: ULong,
    public var riProcStartAbstime: ULong,
    public var riProcExitAbstime: ULong,
    public var riChildUserTime: ULong,
    public var riChildSystemTime: ULong,
    public var riChildPkgIdleWkups: ULong,
    public var riChildInterruptWkups: ULong,
    public var riChildPageins: ULong,
    public var riChildElapsedAbstime: ULong,
    public var riDiskioBytesread: ULong,
    public var riDiskioByteswritten: ULong,
    public var riCpuTimeQosDefault: ULong,
    public var riCpuTimeQosMaintenance: ULong,
    public var riCpuTimeQosBackground: ULong,
    public var riCpuTimeQosUtility: ULong,
    public var riCpuTimeQosLegacy: ULong,
    public var riCpuTimeQosUserInitiated: ULong,
    public var riCpuTimeQosUserInteractive: ULong,
    public var riBilledSystemTime: ULong,
    public var riServicedSystemTime: ULong,
    public var riLogicalWrites: ULong,
    public var riLifetimeMaxPhysFootprint: ULong,
    public var riInstructions: ULong,
    public var riCycles: ULong,
    public var riBilledEnergy: ULong,
    public var riServicedEnergy: ULong,
    public var riIntervalMaxPhysFootprint: ULong,
    public var riRunnableTime: ULong,
)

public open class ImageOffset(public var uuid: io.github.kotlinmania.libc.UuidT, public var offset: UInt)

public open class Attrlist(
    public var bitmapcount: CUshort,
    public var reserved: UShort,
    public var commonattr: AttrgroupT,
    public var volattr: AttrgroupT,
    public var dirattr: AttrgroupT,
    public var fileattr: AttrgroupT,
    public var forkattr: AttrgroupT,
)

public open class AttrreferenceT(public var attrDataoffset: Int, public var attrLength: UInt)

public open class VolCapabilitiesAttrT(public var capabilities: VolCapabilitiesSetT, public var valid: VolCapabilitiesSetT)

public open class AttributeSetT(
    public var commonattr: AttrgroupT,
    public var volattr: AttrgroupT,
    public var dirattr: AttrgroupT,
    public var fileattr: AttrgroupT,
    public var forkattr: AttrgroupT,
)

public open class VolAttributesAttrT(public var validattr: AttributeSetT, public var nativeattr: AttributeSetT)

public open class TcpConnectionInfo(
    public var tcpiState: UByte,
    public var tcpiSndWscale: UByte,
    public var tcpiRcvWscale: UByte,
    public var pad1: UByte,
    public var tcpiOptions: UInt,
    public var tcpiFlags: UInt,
    public var tcpiRto: UInt,
    public var tcpiMaxseg: UInt,
    public var tcpiSndSsthresh: UInt,
    public var tcpiSndCwnd: UInt,
    public var tcpiSndWnd: UInt,
    public var tcpiSndSbbytes: UInt,
    public var tcpiRcvWnd: UInt,
    public var tcpiRttcur: UInt,
    public var tcpiSrtt: UInt,
    public var tcpiRttvar: UInt,
    public var tcpiTfoCookieReq: UInt,
    public var tcpiTfoCookieRcv: UInt,
    public var tcpiTfoSynLoss: UInt,
    public var tcpiTfoSynDataSent: UInt,
    public var tcpiTfoSynDataAcked: UInt,
    public var tcpiTfoSynDataRcv: UInt,
    public var tcpiTfoCookieReqRcv: UInt,
    public var tcpiTfoCookieSent: UInt,
    public var tcpiTfoCookieInvalid: UInt,
    public var tcpiTfoCookieWrong: UInt,
    public var tcpiTfoNoCookieRcv: UInt,
    public var tcpiTfoHeuristicsDisable: UInt,
    public var tcpiTfoSendBlackhole: UInt,
    public var tcpiTfoRecvBlackhole: UInt,
    public var tcpiTfoOnebyteProxy: UInt,
    public var pad2: UInt,
    public var tcpiTxpackets: ULong,
    public var tcpiTxbytes: ULong,
    public var tcpiTxretransmitbytes: ULong,
    public var tcpiRxpackets: ULong,
    public var tcpiRxbytes: ULong,
    public var tcpiRxoutoforderbytes: ULong,
    public var tcpiRxretransmitpackets: ULong,
)

public open class In6Addrlifetime(
    public var ia6tExpire: TimeT,
    public var ia6tPreferred: TimeT,
    public var ia6tVltime: UInt,
    public var ia6tPltime: UInt,
)

public open class In6Ifstat(
    public var ifs6InReceive: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InHdrerr: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InToobig: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InNoroute: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InAddrerr: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InProtounknown: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InTruncated: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InDiscard: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InDeliver: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutForward: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutRequest: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutDiscard: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutFragok: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutFragfail: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutFragcreat: io.github.kotlinmania.libc.UQuadT,
    public var ifs6ReassReqd: io.github.kotlinmania.libc.UQuadT,
    public var ifs6ReassOk: io.github.kotlinmania.libc.UQuadT,
    public var ifs6AtmfragRcvd: io.github.kotlinmania.libc.UQuadT,
    public var ifs6ReassFail: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InMcast: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutMcast: io.github.kotlinmania.libc.UQuadT,
    public var ifs6CantfowardIcmp6: io.github.kotlinmania.libc.UQuadT,
    public var ifs6AddrExpiryCnt: io.github.kotlinmania.libc.UQuadT,
    public var ifs6PfxExpiryCnt: io.github.kotlinmania.libc.UQuadT,
    public var ifs6DefrtrExpiryCnt: io.github.kotlinmania.libc.UQuadT,
)

public open class Icmp6Ifstat(
    public var ifs6InMsg: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InError: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InDstunreach: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InAdminprohib: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InTimeexceed: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InParamprob: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InPkttoobig: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InEcho: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InEchoreply: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InRoutersolicit: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InRouteradvert: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InNeighborsolicit: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InNeighboradvert: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InRedirect: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InMldquery: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InMldreport: io.github.kotlinmania.libc.UQuadT,
    public var ifs6InMlddone: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutMsg: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutError: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutDstunreach: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutAdminprohib: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutTimeexceed: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutParamprob: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutPkttoobig: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutEcho: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutEchoreply: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutRoutersolicit: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutRouteradvert: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutNeighborsolicit: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutNeighboradvert: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutRedirect: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutMldquery: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutMldreport: io.github.kotlinmania.libc.UQuadT,
    public var ifs6OutMlddone: io.github.kotlinmania.libc.UQuadT,
)

// mach/hostInfo.h
public open class HostCpuLoadInfo(public var cpuTicks: List<io.github.kotlinmania.libc.NaturalT>)

// net/ifMib.h
public open class Ifmibdata(
    /**
     * Name of interface
     */
    public var ifmdName: List<CChar>,
    /**
     * Number of promiscuous listeners
     */
    public var ifmdPcount: CUint,
    /**
     * Interface flags
     */
    public var ifmdFlags: CUint,
    /**
     * Instantaneous length of send queue
     */
    public var ifmdSndLen: CUint,
    /**
     * Maximum length of send queue
     */
    public var ifmdSndMaxlen: CUint,
    /**
     * Number of drops in send queue
     */
    public var ifmdSndDrops: CUint,
    /**
     * For future expansion
     */
    public var ifmdFiller: List<CUint>,
    /**
     * Generic information and statistics
     */
    public var ifmdData: IfData64,
)

public open class IfsIso88023(
    public var dot3StatsAlignmentErrors: UInt,
    public var dot3StatsFCSErrors: UInt,
    public var dot3StatsSingleCollisionFrames: UInt,
    public var dot3StatsMultipleCollisionFrames: UInt,
    public var dot3StatsSQETestErrors: UInt,
    public var dot3StatsDeferredTransmissions: UInt,
    public var dot3StatsLateCollisions: UInt,
    public var dot3StatsExcessiveCollisions: UInt,
    public var dot3StatsInternalMacTransmitErrors: UInt,
    public var dot3StatsCarrierSenseErrors: UInt,
    public var dot3StatsFrameTooLongs: UInt,
    public var dot3StatsInternalMacReceiveErrors: UInt,
    public var dot3StatsEtherChipSet: UInt,
    public var dot3StatsMissedFrames: UInt,
    public var dot3StatsCollFrequencies: List<UInt>,
    public var dot3Compliance: UInt,
)

// kernControl.h
public open class CtlInfo(public var ctlId: UInt, public var ctlName: List<CChar>)

// sys/procInfo.h
public open class ProcFdinfo(public var procFd: Int, public var procFdtype: UInt)

public open class Kevent(
    public var ident: UintptrT,
    public var filter: Short,
    public var flags: UShort,
    public var fflags: UInt,
    public var data: IntptrT,
    public var udata: COpaquePointer?,
)

public open class SemidDs(
    // Note the manpage shows different types than the system header.
    public var semPerm: IpcPerm,
    public var semBase: Int,
    public var semNsems: CUshort,
    public var semOtime: io.github.kotlinmania.libc.TimeT,
    public var semPad1: Int,
    public var semCtime: io.github.kotlinmania.libc.TimeT,
    public var semPad2: Int,
    public var semPad3: List<Int>,
)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: io.github.kotlinmania.libc.ShmattT,
    public var shmAtime: io.github.kotlinmania.libc.TimeT,
    // Note(macos): 64-bit wrong align => wrong offset
    public var shmDtime: io.github.kotlinmania.libc.TimeT,
    // Note(macos): 64-bit wrong align => wrong offset
    public var shmCtime: io.github.kotlinmania.libc.TimeT,
    // Note(macos): 64-bit wrong align => wrong offset
    // Note: 64-bit wrong align => wrong offset:
    public var shmInternal: COpaquePointer?,
)

public open class ProcThreadinfo(
    public var pthUserTime: ULong,
    public var pthSystemTime: ULong,
    public var pthCpuUsage: Int,
    public var pthPolicy: Int,
    public var pthRunState: Int,
    public var pthFlags: Int,
    public var pthSleepTime: Int,
    public var pthCurpri: Int,
    public var pthPriority: Int,
    public var pthMaxpriority: Int,
    public var pthName: List<CChar>,
)

public open class Statfs(
    public var fBsize: UInt,
    public var fIosize: Int,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fOwner: UidT,
    public var fType: UInt,
    public var fFlags: UInt,
    public var fFssubtype: UInt,
    public var fFstypename: List<CChar>,
    public var fMntonname: List<CChar>,
    public var fMntfromname: List<CChar>,
    public var fFlagsExt: UInt,
    public var fReserved: List<UInt>,
)

public open class Dirent(
    public var dIno: ULong,
    public var dSeekoff: ULong,
    public var dReclen: UShort,
    public var dNamlen: UShort,
    public var dType: UByte,
    public var dName: List<CChar>,
)

public open class SockaddrStorage(
    public var ssLen: UByte,
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<UByte>,
    public var ssAlign: Long,
    public var ssPad2: List<UByte>,
)

public open class Utmpx(
    public var utUser: List<CChar>,
    public var utId: List<CChar>,
    public var utLine: List<CChar>,
    public var utPid: PidT,
    public var utType: CShort,
    public var utTv: Timeval,
    public var utHost: List<CChar>,
    public var utPad: List<UInt>,
)

public open class Sigevent(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    public var unused1: COpaquePointer?,
    // actually a function pointer
    public var sigevNotifyAttributes: PthreadAttrT?,
)

public open class ProcessorCpuLoadInfo(public var cpuTicks: List<CUint>)

public open class ProcessorBasicInfo(
    public var cpuType: CpuTypeT,
    public var cpuSubtype: CpuSubtypeT,
    public var running: BooleanT,
    public var slotNum: CInt,
    public var isMaster: BooleanT,
)

public open class ProcessorSetBasicInfo(public var processorCount: CInt, public var defaultPolicy: CInt)

public open class ProcessorSetLoadInfo(
    public var taskCount: CInt,
    public var threadCount: CInt,
    public var loadAverage: IntegerT,
    public var machFactor: IntegerT,
)

public open class TimeValueT(public var seconds: IntegerT, public var microseconds: IntegerT)

public open class ThreadBasicInfo(
    public var userTime: TimeValueT,
    public var systemTime: TimeValueT,
    public var cpuUsage: io.github.kotlinmania.libc.IntegerT,
    public var policy: io.github.kotlinmania.libc.PolicyT,
    public var runState: io.github.kotlinmania.libc.IntegerT,
    public var flags: io.github.kotlinmania.libc.IntegerT,
    public var suspendCount: io.github.kotlinmania.libc.IntegerT,
    public var sleepTime: io.github.kotlinmania.libc.IntegerT,
)

public open class ThreadIdentifierInfo(
    public var threadId: ULong,
    public var threadHandle: ULong,
    public var dispatchQaddr: ULong,
)

public open class ThreadExtendedInfo(
    public var pthUserTime: ULong,
    public var pthSystemTime: ULong,
    public var pthCpuUsage: Int,
    public var pthPolicy: Int,
    public var pthRunState: Int,
    public var pthFlags: Int,
    public var pthSleepTime: Int,
    public var pthCurpri: Int,
    public var pthPriority: Int,
    public var pthMaxpriority: Int,
    public var pthName: List<CChar>,
)

public open class IfData64(
    public var ifiType: CUchar,
    public var ifiTypelen: CUchar,
    public var ifiPhysical: CUchar,
    public var ifiAddrlen: CUchar,
    public var ifiHdrlen: CUchar,
    public var ifiRecvquota: CUchar,
    public var ifiXmitquota: CUchar,
    public var ifiUnused1: CUchar,
    public var ifiMtu: UInt,
    public var ifiMetric: UInt,
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
    public var ifiNoproto: ULong,
    public var ifiRecvtiming: UInt,
    public var ifiXmittiming: UInt,
    public var ifiLastchange: Timeval32,
)

public open class IfMsghdr2(
    public var ifmMsglen: CUshort,
    public var ifmVersion: CUchar,
    public var ifmType: CUchar,
    public var ifmAddrs: CInt,
    public var ifmFlags: CInt,
    public var ifmIndex: CUshort,
    public var ifmSndLen: CInt,
    public var ifmSndMaxlen: CInt,
    public var ifmSndDrops: CInt,
    public var ifmTimer: CInt,
    public var ifmData: IfData64,
)

public open class VmStatistics64(
    public var freeCount: NaturalT,
    public var activeCount: NaturalT,
    public var inactiveCount: NaturalT,
    public var wireCount: NaturalT,
    public var zeroFillCount: ULong,
    public var reactivations: ULong,
    public var pageins: ULong,
    public var pageouts: ULong,
    public var faults: ULong,
    public var cowFaults: ULong,
    public var lookups: ULong,
    public var hits: ULong,
    public var purges: ULong,
    public var purgeableCount: NaturalT,
    public var speculativeCount: NaturalT,
    public var decompressions: ULong,
    public var compressions: ULong,
    public var swapins: ULong,
    public var swapouts: ULong,
    public var compressorPageCount: NaturalT,
    public var throttledCount: NaturalT,
    public var externalPageCount: NaturalT,
    public var internalPageCount: NaturalT,
    public var totalUncompressedPagesInCompressor: ULong,
)

public open class MachTaskBasicInfo(
    public var virtualSize: MachVmSizeT,
    public var residentSize: MachVmSizeT,
    public var residentSizeMax: MachVmSizeT,
    public var userTime: TimeValueT,
    public var systemTime: TimeValueT,
    public var policy: io.github.kotlinmania.libc.PolicyT,
    public var suspendCount: IntegerT,
)

public open class Log2phys(
    public var l2pFlags: CUint,
    public var l2pContigbytes: OffT,
    public var l2pDevoffset: OffT,
)

public open class OsUnfairLockS(public var osUnfairLockOpaque: UInt)

public open class SockaddrVm(
    public var svmLen: CUchar,
    public var svmFamily: SaFamilyT,
    public var svmReserved1: CUshort,
    public var svmPort: CUint,
    public var svmCid: CUint,
)

public open class Ifdevmtu(
    public var ifdmCurrent: CInt,
    public var ifdmMin: CInt,
    public var ifdmMax: CInt,
)

public open class Ifkpi(
    public var ifkModuleId: CUint,
    public var ifkType: CUint,
    public var ifkData: CAnonymousIfkData,
)

public open class Ifreq(public var ifrName: List<CChar>, public var ifrIfru: CAnonymousIfrIfru)

public open class In6Ifreq(public var ifrName: List<CChar>, public var ifrIfru: CAnonymousIfrIfru6)

public open class Ifconf(public var ifcLen: CInt, public var ifcIfcu: CAnonymousIfcIfcu) {
    public open fun eq(other: Ifconf): Boolean {
        val lenPtr1 = addrOf(this.ifcLen)
        val lenPtr2 = addrOf(other.ifcLen)
        val ifcuPtr1 = addrOf(this.ifcIfcu)
        val ifcuPtr2 = addrOf(other.ifcIfcu)
        // SAFETY: `ifconf` implements `Copy` so the reads are valid
        val len1 = lenPtr1.readUnaligned()
        val len2 = lenPtr2.readUnaligned()
        val ifcu1 = ifcuPtr1.readUnaligned()
        val ifcu2 = ifcuPtr2.readUnaligned()
        return len1 == len2 && ifcu1 == ifcu2
    }
}

public open class CAnonymousIfkData(public var ifkPtr: COpaquePointer?? = null, public var ifkValue: CInt? = null) {
    public open fun eq(other: CAnonymousIfkData): Boolean {
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

public open class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr? = null,
    public var ifruDstaddr: Sockaddr? = null,
    public var ifruBroadaddr: Sockaddr? = null,
    public var ifruFlags: CShort? = null,
    public var ifruMetrics: CInt? = null,
    public var ifruMtu: CInt? = null,
    public var ifruPhys: CInt? = null,
    public var ifruMedia: CInt? = null,
    public var ifruIntval: CInt? = null,
    public var ifruData: COpaquePointer?? = null,
    public var ifruDevmtu: Ifdevmtu? = null,
    public var ifruKpi: Ifkpi? = null,
    public var ifruWakeFlags: UInt? = null,
    public var ifruRouteRefcnt: UInt? = null,
    public var ifruCap: List<CInt>? = null,
    public var ifruFunctionalType: UInt? = null,
) {
    public open fun eq(other: CAnonymousIfrIfru): Boolean {
        return this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruBroadaddr == other.ifruBroadaddr && this.ifruFlags == other.ifruFlags && this.ifruMetrics == other.ifruMetrics && this.ifruMtu == other.ifruMtu && this.ifruPhys == other.ifruPhys && this.ifruMedia == other.ifruMedia && this.ifruIntval == other.ifruIntval && this.ifruData == other.ifruData && this.ifruDevmtu == other.ifruDevmtu && this.ifruKpi == other.ifruKpi && this.ifruWakeFlags == other.ifruWakeFlags && this.ifruRouteRefcnt == other.ifruRouteRefcnt && this.ifruCap.iter().zip(other.ifruCap.iter()).all({ (a, b) -> a == b }) && this.ifruFunctionalType == other.ifruFunctionalType
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.ifruAddr).hashCode()
            state = 31 * state + (this.ifruDstaddr).hashCode()
            state = 31 * state + (this.ifruBroadaddr).hashCode()
            state = 31 * state + (this.ifruFlags).hashCode()
            state = 31 * state + (this.ifruMetrics).hashCode()
            state = 31 * state + (this.ifruMtu).hashCode()
            state = 31 * state + (this.ifruPhys).hashCode()
            state = 31 * state + (this.ifruMedia).hashCode()
            state = 31 * state + (this.ifruIntval).hashCode()
            state = 31 * state + (this.ifruData).hashCode()
            state = 31 * state + (this.ifruDevmtu).hashCode()
            state = 31 * state + (this.ifruKpi).hashCode()
            state = 31 * state + (this.ifruWakeFlags).hashCode()
            state = 31 * state + (this.ifruRouteRefcnt).hashCode()
            state = 31 * state + (this.ifruCap).hashCode()
            state = 31 * state + (this.ifruFunctionalType).hashCode()
        }
        return state
    }
}

public open class CAnonymousIfcIfcu(public var ifcuBuf: COpaquePointer?? = null, public var ifcuReq: Ifreq?? = null) {
    public open fun eq(other: CAnonymousIfcIfcu): Boolean {
        return this.ifcuBuf == other.ifcuBuf && this.ifcuReq == other.ifcuReq
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.ifcuBuf).hashCode()
        state = 31 * state + (this.ifcuReq).hashCode()
        return state
    }
}

public open class CAnonymousIfrIfru6(
    public var ifruAddr: SockaddrIn6? = null,
    public var ifruDstaddr: SockaddrIn6? = null,
    public var ifruFlags: CInt? = null,
    public var ifruFlags6: CInt? = null,
    public var ifruMetrics: CInt? = null,
    public var ifruIntval: CInt? = null,
    public var ifruData: COpaquePointer?? = null,
    public var ifruLifetime: In6Addrlifetime? = null,
    public var ifruStat: In6Ifstat? = null,
    public var ifruIcmp6stat: Icmp6Ifstat? = null,
    public var ifruScopeId: List<UInt>? = null,
) {
    public open fun eq(other: CAnonymousIfrIfru6): Boolean {
        return this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruFlags == other.ifruFlags && this.ifruFlags6 == other.ifruFlags6 && this.ifruMetrics == other.ifruMetrics && this.ifruIntval == other.ifruIntval && this.ifruData == other.ifruData && this.ifruScopeId.iter().zip(other.ifruScopeId.iter()).all({ (a, b) -> a == b })
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.ifruAddr).hashCode()
            state = 31 * state + (this.ifruDstaddr).hashCode()
            state = 31 * state + (this.ifruFlags).hashCode()
            state = 31 * state + (this.ifruFlags6).hashCode()
            state = 31 * state + (this.ifruMetrics).hashCode()
            state = 31 * state + (this.ifruIntval).hashCode()
            state = 31 * state + (this.ifruData).hashCode()
            state = 31 * state + (this.ifruScopeId).hashCode()
        }
        return state
    }
}

public open class Semun(
    public var value: CInt? = null,
    public var buf: SemidDs?? = null,
    public var array: CUshort?? = null,
) {
    public open fun eq(other: Semun): Boolean {
        return this.value == other.value
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.value).hashCode()
        return state
    }
}

public val UTX_USERSIZE: Int = 256

public val UTX_LINESIZE: Int = 32

public val UTX_IDSIZE: Int = 4

public val UTX_HOSTSIZE: Int = 256

public val EMPTY: CShort = 0

public val RUN_LVL: CShort = 1

public val BOOT_TIME: CShort = 2

public val OLD_TIME: CShort = 3

public val NEW_TIME: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val USER_PROCESS: CShort = 7

public val DEAD_PROCESS: CShort = 8

public val ACCOUNTING: CShort = 9

public val SIGNATURE: CShort = 10

public val SHUTDOWN_TIME: CShort = 11

public val LC_COLLATE_MASK: CInt = 1 shl 0

public val LC_CTYPE_MASK: CInt = 1 shl 1

public val LC_MESSAGES_MASK: CInt = 1 shl 2

public val LC_MONETARY_MASK: CInt = 1 shl 3

public val LC_NUMERIC_MASK: CInt = 1 shl 4

public val LC_TIME_MASK: CInt = 1 shl 5

public val LC_ALL_MASK: CInt = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK

public val CODESET: io.github.kotlinmania.libc.NlItem = 0

public val D_T_FMT: io.github.kotlinmania.libc.NlItem = 1

public val D_FMT: io.github.kotlinmania.libc.NlItem = 2

public val T_FMT: io.github.kotlinmania.libc.NlItem = 3

public val T_FMT_AMPM: io.github.kotlinmania.libc.NlItem = 4

public val AM_STR: io.github.kotlinmania.libc.NlItem = 5

public val PM_STR: io.github.kotlinmania.libc.NlItem = 6

public val DAY_1: io.github.kotlinmania.libc.NlItem = 7

public val DAY_2: io.github.kotlinmania.libc.NlItem = 8

public val DAY_3: io.github.kotlinmania.libc.NlItem = 9

public val DAY_4: io.github.kotlinmania.libc.NlItem = 10

public val DAY_5: io.github.kotlinmania.libc.NlItem = 11

public val DAY_6: io.github.kotlinmania.libc.NlItem = 12

public val DAY_7: io.github.kotlinmania.libc.NlItem = 13

public val ABDAY_1: io.github.kotlinmania.libc.NlItem = 14

public val ABDAY_2: io.github.kotlinmania.libc.NlItem = 15

public val ABDAY_3: io.github.kotlinmania.libc.NlItem = 16

public val ABDAY_4: io.github.kotlinmania.libc.NlItem = 17

public val ABDAY_5: io.github.kotlinmania.libc.NlItem = 18

public val ABDAY_6: io.github.kotlinmania.libc.NlItem = 19

public val ABDAY_7: io.github.kotlinmania.libc.NlItem = 20

public val MON_1: io.github.kotlinmania.libc.NlItem = 21

public val MON_2: io.github.kotlinmania.libc.NlItem = 22

public val MON_3: io.github.kotlinmania.libc.NlItem = 23

public val MON_4: io.github.kotlinmania.libc.NlItem = 24

public val MON_5: io.github.kotlinmania.libc.NlItem = 25

public val MON_6: io.github.kotlinmania.libc.NlItem = 26

public val MON_7: io.github.kotlinmania.libc.NlItem = 27

public val MON_8: io.github.kotlinmania.libc.NlItem = 28

public val MON_9: io.github.kotlinmania.libc.NlItem = 29

public val MON_10: io.github.kotlinmania.libc.NlItem = 30

public val MON_11: io.github.kotlinmania.libc.NlItem = 31

public val MON_12: io.github.kotlinmania.libc.NlItem = 32

public val ABMON_1: io.github.kotlinmania.libc.NlItem = 33

public val ABMON_2: io.github.kotlinmania.libc.NlItem = 34

public val ABMON_3: io.github.kotlinmania.libc.NlItem = 35

public val ABMON_4: io.github.kotlinmania.libc.NlItem = 36

public val ABMON_5: io.github.kotlinmania.libc.NlItem = 37

public val ABMON_6: io.github.kotlinmania.libc.NlItem = 38

public val ABMON_7: io.github.kotlinmania.libc.NlItem = 39

public val ABMON_8: io.github.kotlinmania.libc.NlItem = 40

public val ABMON_9: io.github.kotlinmania.libc.NlItem = 41

public val ABMON_10: io.github.kotlinmania.libc.NlItem = 42

public val ABMON_11: io.github.kotlinmania.libc.NlItem = 43

public val ABMON_12: io.github.kotlinmania.libc.NlItem = 44

public val CLOCK_REALTIME: io.github.kotlinmania.libc.ClockidT = 0u

public val CLOCK_MONOTONIC_RAW: io.github.kotlinmania.libc.ClockidT = 4u

public val CLOCK_MONOTONIC_RAW_APPROX: io.github.kotlinmania.libc.ClockidT = 5u

public val CLOCK_MONOTONIC: io.github.kotlinmania.libc.ClockidT = 6u

public val CLOCK_UPTIME_RAW: io.github.kotlinmania.libc.ClockidT = 8u

public val CLOCK_UPTIME_RAW_APPROX: io.github.kotlinmania.libc.ClockidT = 9u

public val CLOCK_PROCESS_CPUTIME_ID: io.github.kotlinmania.libc.ClockidT = 12u

public val CLOCK_THREAD_CPUTIME_ID: io.github.kotlinmania.libc.ClockidT = 16u

public val ERA: io.github.kotlinmania.libc.NlItem = 45

public val ERA_D_FMT: io.github.kotlinmania.libc.NlItem = 46

public val ERA_D_T_FMT: io.github.kotlinmania.libc.NlItem = 47

public val ERA_T_FMT: io.github.kotlinmania.libc.NlItem = 48

public val ALT_DIGITS: io.github.kotlinmania.libc.NlItem = 49

public val RADIXCHAR: io.github.kotlinmania.libc.NlItem = 50

public val THOUSEP: io.github.kotlinmania.libc.NlItem = 51

public val YESEXPR: io.github.kotlinmania.libc.NlItem = 52

public val NOEXPR: io.github.kotlinmania.libc.NlItem = 53

public val YESSTR: io.github.kotlinmania.libc.NlItem = 54

public val NOSTR: io.github.kotlinmania.libc.NlItem = 55

public val CRNCYSTR: io.github.kotlinmania.libc.NlItem = 56

public val D_MD_ORDER: io.github.kotlinmania.libc.NlItem = 57

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 2147483647

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val SEEK_HOLE: CInt = 3

public val SEEK_DATA: CInt = 4

public val IOFBF: CInt = 0

public val IONBF: CInt = 2

public val IOLBF: CInt = 1

public val BUFSIZ: CUint = 1024u

public val FOPEN_MAX: CUint = 20u

public val FILENAME_MAX: CUint = 1024u

public val L_TMPNAM: CUint = 1024u

public val TMP_MAX: CUint = 308915776u

public val PC_LINK_MAX: CInt = 1

public val PC_MAX_CANON: CInt = 2

public val PC_MAX_INPUT: CInt = 3

public val PC_NAME_MAX: CInt = 4

public val PC_PATH_MAX: CInt = 5

public val PC_PIPE_BUF: CInt = 6

public val PC_CHOWN_RESTRICTED: CInt = 7

public val PC_NO_TRUNC: CInt = 8

public val PC_VDISABLE: CInt = 9

public val PC_NAME_CHARS_MAX: CInt = 10

public val PC_CASE_SENSITIVE: CInt = 11

public val PC_CASE_PRESERVING: CInt = 12

public val PC_EXTENDED_SECURITY_NP: CInt = 13

public val PC_AUTH_OPAQUE_NP: CInt = 14

public val PC_2_SYMLINKS: CInt = 15

public val PC_ALLOC_SIZE_MIN: CInt = 16

public val PC_ASYNC_IO: CInt = 17

public val PC_FILESIZEBITS: CInt = 18

public val PC_PRIO_IO: CInt = 19

public val PC_REC_INCR_XFER_SIZE: CInt = 20

public val PC_REC_MAX_XFER_SIZE: CInt = 21

public val PC_REC_MIN_XFER_SIZE: CInt = 22

public val PC_REC_XFER_ALIGN: CInt = 23

public val PC_SYMLINK_MAX: CInt = 24

public val PC_SYNC_IO: CInt = 25

public val PC_XATTR_SIZE_BITS: CInt = 26

public val PC_MIN_HOLE_SIZE: CInt = 27

public val O_EVTONLY: CInt = 0x00008000

public val O_NOCTTY: CInt = 0x00020000

public val O_DIRECTORY: CInt = 0x00100000

public val O_SYMLINK: CInt = 0x00200000

public val O_DSYNC: CInt = 0x00400000

public val O_CLOEXEC: CInt = 0x01000000

public val O_NOFOLLOW_ANY: CInt = 0x20000000

public val O_EXEC: CInt = 0x40000000

public val O_SEARCH: CInt = O_EXEC or O_DIRECTORY

public val S_IFIFO: ModeT = 4096u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFMT: ModeT = 61440u

public val S_IEXEC: ModeT = 64u

public val S_IWRITE: ModeT = 128u

public val S_IREAD: ModeT = 256u

public val S_IRWXU: ModeT = 448u

public val S_IXUSR: ModeT = 64u

public val S_IWUSR: ModeT = 128u

public val S_IRUSR: ModeT = 256u

public val S_IRWXG: ModeT = 56u

public val S_IXGRP: ModeT = 8u

public val S_IWGRP: ModeT = 16u

public val S_IRGRP: ModeT = 32u

public val S_IRWXO: ModeT = 7u

public val S_IXOTH: ModeT = 1u

public val S_IWOTH: ModeT = 2u

public val S_IROTH: ModeT = 4u

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val F_LOCK: CInt = 1

public val F_TEST: CInt = 3

public val F_TLOCK: CInt = 2

public val F_ULOCK: CInt = 0

public val F_GETLK: CInt = 7

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGABRT: CInt = 6

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGSEGV: CInt = 11

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val PT_TRACE_ME: CInt = 0

public val PT_READ_I: CInt = 1

public val PT_READ_D: CInt = 2

public val PT_READ_U: CInt = 3

public val PT_WRITE_I: CInt = 4

public val PT_WRITE_D: CInt = 5

public val PT_WRITE_U: CInt = 6

public val PT_CONTINUE: CInt = 7

public val PT_KILL: CInt = 8

public val PT_STEP: CInt = 9

public val PT_ATTACH: CInt = 10

public val PT_DETACH: CInt = 11

public val PT_SIGEXC: CInt = 12

public val PT_THUPDATE: CInt = 13

public val PT_ATTACHEXC: CInt = 14

public val PT_FORCEQUOTA: CInt = 30

public val PT_DENY_ATTACH: CInt = 31

public val PT_FIRSTMACH: CInt = 32

public val MAP_FILE: CInt = 0x0000

public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_FIXED: CInt = 0x0010

public val MAP_ANON: CInt = 0x1000

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val CPU_STATE_USER: CInt = 0

public val CPU_STATE_SYSTEM: CInt = 1

public val CPU_STATE_IDLE: CInt = 2

public val CPU_STATE_NICE: CInt = 3

public val CPU_STATE_MAX: CInt = 4

public val PROCESSOR_BASIC_INFO: CInt = 1

public val PROCESSOR_CPU_LOAD_INFO: CInt = 2

public val PROCESSOR_PM_REGS_INFO: CInt = 0x10000001

public val PROCESSOR_TEMPERATURE: CInt = 0x10000002

public val PROCESSOR_SET_LOAD_INFO: CInt = 4

public val PROCESSOR_SET_BASIC_INFO: CInt = 5

public val VM_FLAGS_FIXED: CInt = 0x0000

public val VM_FLAGS_ANYWHERE: CInt = 0x0001

public val VM_FLAGS_PURGABLE: CInt = 0x0002

public val VM_FLAGS_RANDOM_ADDR: CInt = 0x0008

public val VM_FLAGS_NO_CACHE: CInt = 0x0010

public val VM_FLAGS_RESILIENT_CODESIGN: CInt = 0x0020

public val VM_FLAGS_RESILIENT_MEDIA: CInt = 0x0040

public val VM_FLAGS_OVERWRITE: CInt = 0x4000

public val VM_FLAGS_SUPERPAGE_MASK: CInt = 0x70000

public val VM_FLAGS_RETURN_DATA_ADDR: CInt = 0x100000

public val VM_FLAGS_RETURN_4K_DATA_ADDR: CInt = 0x800000

public val VM_FLAGS_ALIAS_MASK: CInt = 0xFF000000.toInt()

public val VM_FLAGS_USER_ALLOCATE: CInt = 0xff07401f.toInt()

public val VM_FLAGS_USER_MAP: CInt = 0xff97401f.toInt()

public val VM_FLAGS_USER_REMAP: CInt = VM_FLAGS_FIXED or VM_FLAGS_ANYWHERE or VM_FLAGS_RANDOM_ADDR or VM_FLAGS_OVERWRITE or VM_FLAGS_RETURN_DATA_ADDR or VM_FLAGS_RESILIENT_CODESIGN

public val VM_FLAGS_SUPERPAGE_SHIFT: CInt = 16

public val SUPERPAGE_NONE: CInt = 0

public val SUPERPAGE_SIZE_ANY: CInt = 1

public val VM_FLAGS_SUPERPAGE_NONE: CInt = SUPERPAGE_NONE shl VM_FLAGS_SUPERPAGE_SHIFT

public val VM_FLAGS_SUPERPAGE_SIZE_ANY: CInt = SUPERPAGE_SIZE_ANY shl VM_FLAGS_SUPERPAGE_SHIFT

public val SUPERPAGE_SIZE_2MB: CInt = 2

public val VM_FLAGS_SUPERPAGE_SIZE_2MB: CInt = SUPERPAGE_SIZE_2MB shl VM_FLAGS_SUPERPAGE_SHIFT

public val VM_MEMORY_MALLOC: CInt = 1

public val VM_MEMORY_MALLOC_SMALL: CInt = 2

public val VM_MEMORY_MALLOC_LARGE: CInt = 3

public val VM_MEMORY_MALLOC_HUGE: CInt = 4

public val VM_MEMORY_SBRK: CInt = 5

public val VM_MEMORY_REALLOC: CInt = 6

public val VM_MEMORY_MALLOC_TINY: CInt = 7

public val VM_MEMORY_MALLOC_LARGE_REUSABLE: CInt = 8

public val VM_MEMORY_MALLOC_LARGE_REUSED: CInt = 9

public val VM_MEMORY_ANALYSIS_TOOL: CInt = 10

public val VM_MEMORY_MALLOC_NANO: CInt = 11

public val VM_MEMORY_MACH_MSG: CInt = 20

public val VM_MEMORY_IOKIT: CInt = 21

public val VM_MEMORY_STACK: CInt = 30

public val VM_MEMORY_GUARD: CInt = 31

public val VM_MEMORY_SHARED_PMAP: CInt = 32

public val VM_MEMORY_DYLIB: CInt = 33

public val VM_MEMORY_OBJC_DISPATCHERS: CInt = 34

public val VM_MEMORY_UNSHARED_PMAP: CInt = 35

public val VM_MEMORY_APPKIT: CInt = 40

public val VM_MEMORY_FOUNDATION: CInt = 41

public val VM_MEMORY_COREGRAPHICS: CInt = 42

public val VM_MEMORY_CORESERVICES: CInt = 43

public val VM_MEMORY_CARBON: CInt = VM_MEMORY_CORESERVICES

public val VM_MEMORY_JAVA: CInt = 44

public val VM_MEMORY_COREDATA: CInt = 45

public val VM_MEMORY_COREDATA_OBJECTIDS: CInt = 46

public val VM_MEMORY_ATS: CInt = 50

public val VM_MEMORY_LAYERKIT: CInt = 51

public val VM_MEMORY_CGIMAGE: CInt = 52

public val VM_MEMORY_TCMALLOC: CInt = 53

public val VM_MEMORY_COREGRAPHICS_DATA: CInt = 54

public val VM_MEMORY_COREGRAPHICS_SHARED: CInt = 55

public val VM_MEMORY_COREGRAPHICS_FRAMEBUFFERS: CInt = 56

public val VM_MEMORY_COREGRAPHICS_BACKINGSTORES: CInt = 57

public val VM_MEMORY_COREGRAPHICS_XALLOC: CInt = 58

public val VM_MEMORY_COREGRAPHICS_MISC: CInt = VM_MEMORY_COREGRAPHICS

public val VM_MEMORY_DYLD: CInt = 60

public val VM_MEMORY_DYLD_MALLOC: CInt = 61

public val VM_MEMORY_SQLITE: CInt = 62

public val VM_MEMORY_JAVASCRIPT_CORE: CInt = 63

public val VM_MEMORY_JAVASCRIPT_JIT_EXECUTABLE_ALLOCATOR: CInt = 64

public val VM_MEMORY_JAVASCRIPT_JIT_REGISTER_FILE: CInt = 65

public val VM_MEMORY_GLSL: CInt = 66

public val VM_MEMORY_OPENCL: CInt = 67

public val VM_MEMORY_COREIMAGE: CInt = 68

public val VM_MEMORY_WEBCORE_PURGEABLE_BUFFERS: CInt = 69

public val VM_MEMORY_IMAGEIO: CInt = 70

public val VM_MEMORY_COREPROFILE: CInt = 71

public val VM_MEMORY_ASSETSD: CInt = 72

public val VM_MEMORY_OS_ALLOC_ONCE: CInt = 73

public val VM_MEMORY_LIBDISPATCH: CInt = 74

public val VM_MEMORY_ACCELERATE: CInt = 75

public val VM_MEMORY_COREUI: CInt = 76

public val VM_MEMORY_COREUIFILE: CInt = 77

public val VM_MEMORY_GENEALOGY: CInt = 78

public val VM_MEMORY_RAWCAMERA: CInt = 79

public val VM_MEMORY_CORPSEINFO: CInt = 80

public val VM_MEMORY_ASL: CInt = 81

public val VM_MEMORY_SWIFT_RUNTIME: CInt = 82

public val VM_MEMORY_SWIFT_METADATA: CInt = 83

public val VM_MEMORY_DHMM: CInt = 84

public val VM_MEMORY_SCENEKIT: CInt = 86

public val VM_MEMORY_SKYWALK: CInt = 87

public val VM_MEMORY_APPLICATION_SPECIFIC_1: CInt = 240

public val VM_MEMORY_APPLICATION_SPECIFIC_16: CInt = 255

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MS_ASYNC: CInt = 0x0001

public val MS_INVALIDATE: CInt = 0x0002

public val MS_SYNC: CInt = 0x0010

public val MS_KILLPAGES: CInt = 0x0004

public val MS_DEACTIVATE: CInt = 0x0008

public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EDEADLK: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val ENOTBLK: CInt = 15

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val EAGAIN: CInt = 35

public val EWOULDBLOCK: CInt = EAGAIN

public val EINPROGRESS: CInt = 36

public val EALREADY: CInt = 37

public val ENOTSOCK: CInt = 38

public val EDESTADDRREQ: CInt = 39

public val EMSGSIZE: CInt = 40

public val EPROTOTYPE: CInt = 41

public val ENOPROTOOPT: CInt = 42

public val EPROTONOSUPPORT: CInt = 43

public val ESOCKTNOSUPPORT: CInt = 44

public val ENOTSUP: CInt = 45

public val EPFNOSUPPORT: CInt = 46

public val EAFNOSUPPORT: CInt = 47

public val EADDRINUSE: CInt = 48

public val EADDRNOTAVAIL: CInt = 49

public val ENETDOWN: CInt = 50

public val ENETUNREACH: CInt = 51

public val ENETRESET: CInt = 52

public val ECONNABORTED: CInt = 53

public val ECONNRESET: CInt = 54

public val ENOBUFS: CInt = 55

public val EISCONN: CInt = 56

public val ENOTCONN: CInt = 57

public val ESHUTDOWN: CInt = 58

public val ETOOMANYREFS: CInt = 59

public val ETIMEDOUT: CInt = 60

public val ECONNREFUSED: CInt = 61

public val ELOOP: CInt = 62

public val ENAMETOOLONG: CInt = 63

public val EHOSTDOWN: CInt = 64

public val EHOSTUNREACH: CInt = 65

public val ENOTEMPTY: CInt = 66

public val EPROCLIM: CInt = 67

public val EUSERS: CInt = 68

public val EDQUOT: CInt = 69

public val ESTALE: CInt = 70

public val EREMOTE: CInt = 71

public val EBADRPC: CInt = 72

public val ERPCMISMATCH: CInt = 73

public val EPROGUNAVAIL: CInt = 74

public val EPROGMISMATCH: CInt = 75

public val EPROCUNAVAIL: CInt = 76

public val ENOLCK: CInt = 77

public val ENOSYS: CInt = 78

public val EFTYPE: CInt = 79

public val EAUTH: CInt = 80

public val ENEEDAUTH: CInt = 81

public val EPWROFF: CInt = 82

public val EDEVERR: CInt = 83

public val EOVERFLOW: CInt = 84

public val EBADEXEC: CInt = 85

public val EBADARCH: CInt = 86

public val ESHLIBVERS: CInt = 87

public val EBADMACHO: CInt = 88

public val ECANCELED: CInt = 89

public val EIDRM: CInt = 90

public val ENOMSG: CInt = 91

public val EILSEQ: CInt = 92

public val ENOATTR: CInt = 93

public val EBADMSG: CInt = 94

public val EMULTIHOP: CInt = 95

public val ENODATA: CInt = 96

public val ENOLINK: CInt = 97

public val ENOSR: CInt = 98

public val ENOSTR: CInt = 99

public val EPROTO: CInt = 100

public val ETIME: CInt = 101

public val EOPNOTSUPP: CInt = 102

public val ENOPOLICY: CInt = 103

public val ENOTRECOVERABLE: CInt = 104

public val EOWNERDEAD: CInt = 105

public val EQFULL: CInt = 106

public val ELAST: CInt = 106

public val EAI_AGAIN: CInt = 2

public val EAI_BADFLAGS: CInt = 3

public val EAI_FAIL: CInt = 4

public val EAI_FAMILY: CInt = 5

public val EAI_MEMORY: CInt = 6

public val EAI_NODATA: CInt = 7

public val EAI_NONAME: CInt = 8

public val EAI_SERVICE: CInt = 9

public val EAI_SOCKTYPE: CInt = 10

public val EAI_SYSTEM: CInt = 11

public val EAI_OVERFLOW: CInt = 14

public val F_DUPFD: CInt = 0

public val F_DUPFD_CLOEXEC: CInt = 67

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_PREALLOCATE: CInt = 42

public val F_RDADVISE: CInt = 44

public val F_RDAHEAD: CInt = 45

public val F_NOCACHE: CInt = 48

public val F_LOG2PHYS: CInt = 49

public val F_GETPATH: CInt = 50

public val F_FULLFSYNC: CInt = 51

public val F_FREEZE_FS: CInt = 53

public val F_THAW_FS: CInt = 54

public val F_GLOBAL_NOCACHE: CInt = 55

public val F_NODIRECT: CInt = 62

public val F_LOG2PHYS_EXT: CInt = 65

public val F_BARRIERFSYNC: CInt = 85

// See https://github.com/apple/darwin-xnu/blob/main/bsd/sys/fcntl.h
public val F_OFD_SETLK: CInt = 90

// Acquire or release open file description lock
public val F_OFD_SETLKW: CInt = 91

// (as F_OFD_SETLK but blocking if conflicting lock)
public val F_OFD_GETLK: CInt = 92

// Examine OFD lock
public val F_PUNCHHOLE: CInt = 99

public val F_TRIM_ACTIVE_FILE: CInt = 100

public val F_SPECULATIVE_READ: CInt = 101

public val F_GETPATH_NOFIRMLINK: CInt = 102

public val F_TRANSFEREXTENTS: CInt = 110

public val F_ALLOCATECONTIG: CUint = 0x02u

public val F_ALLOCATEALL: CUint = 0x04u

public val F_ALLOCATEPERSIST: CUint = 0x08u

public val F_PEOFPOSMODE: CInt = 3

public val F_VOLPOSMODE: CInt = 4

public val AT_FDCWD: CInt = -2

public val AT_EACCESS: CInt = 0x0010

public val AT_SYMLINK_NOFOLLOW: CInt = 0x0020

public val AT_SYMLINK_FOLLOW: CInt = 0x0040

public val AT_REMOVEDIR: CInt = 0x0080

public val TIOCMODG: CUlong = 0x40047403uL

public val TIOCMODS: CUlong = 0x80047404uL

public val TIOCM_LE: CInt = 0x1

public val TIOCM_DTR: CInt = 0x2

public val TIOCM_RTS: CInt = 0x4

public val TIOCM_ST: CInt = 0x8

public val TIOCM_SR: CInt = 0x10

public val TIOCM_CTS: CInt = 0x20

public val TIOCM_CAR: CInt = 0x40

public val TIOCM_CD: CInt = 0x40

public val TIOCM_RNG: CInt = 0x80

public val TIOCM_RI: CInt = 0x80

public val TIOCM_DSR: CInt = 0x100

public val TIOCEXCL: CInt = 0x2000740d

public val TIOCNXCL: CInt = 0x2000740e

public val TIOCFLUSH: CUlong = 0x80047410uL

public val TIOCGETD: CUlong = 0x4004741auL

public val TIOCSETD: CUlong = 0x8004741buL

public val TIOCIXON: CUint = 0x20007481u

public val TIOCIXOFF: CUint = 0x20007480u

public val TIOCSDTR: CUint = 0x20007479u

public val TIOCCDTR: CUint = 0x20007478u

public val TIOCGPGRP: CUlong = 0x40047477uL

public val TIOCSPGRP: CUlong = 0x80047476uL

public val TIOCOUTQ: CUlong = 0x40047473uL

public val TIOCSTI: CUlong = 0x80017472uL

public val TIOCNOTTY: CUint = 0x20007471u

public val TIOCPKT: CUlong = 0x80047470uL

public val TIOCPKT_DATA: CInt = 0x0

public val TIOCPKT_FLUSHREAD: CInt = 0x1

public val TIOCPKT_FLUSHWRITE: CInt = 0x2

public val TIOCPKT_STOP: CInt = 0x4

public val TIOCPKT_START: CInt = 0x8

public val TIOCPKT_NOSTOP: CInt = 0x10

public val TIOCPKT_DOSTOP: CInt = 0x20

public val TIOCPKT_IOCTL: CInt = 0x40

public val TIOCSTOP: CUint = 0x2000746fu

public val TIOCSTART: CUint = 0x2000746eu

public val TIOCMSET: CUlong = 0x8004746duL

public val TIOCMBIS: CUlong = 0x8004746cuL

public val TIOCMBIC: CUlong = 0x8004746buL

public val TIOCMGET: CUlong = 0x4004746auL

public val TIOCREMOTE: CUlong = 0x80047469uL

public val TIOCGWINSZ: CUlong = 0x40087468uL

public val TIOCSWINSZ: CUlong = 0x80087467uL

public val TIOCUCNTL: CUlong = 0x80047466uL

public val TIOCSTAT: CUint = 0x20007465u

public val TIOCSCONS: CUint = 0x20007463u

public val TIOCCONS: CUlong = 0x80047462uL

public val TIOCSCTTY: CUint = 0x20007461u

public val TIOCEXT: CUlong = 0x80047460uL

public val TIOCSIG: CUint = 0x2000745fu

public val TIOCDRAIN: CUint = 0x2000745eu

public val TIOCMSDTRWAIT: CUlong = 0x8004745buL

public val TIOCMGDTRWAIT: CUlong = 0x4004745auL

public val TIOCSDRAINWAIT: CUlong = 0x80047457uL

public val TIOCGDRAINWAIT: CUlong = 0x40047456uL

public val TIOCDSIMICROCODE: CUint = 0x20007455u

public val TIOCPTYGRANT: CUint = 0x20007454u

public val TIOCPTYGNAME: CUint = 0x40807453u

public val TIOCPTYUNLK: CUint = 0x20007452u

public val TIOCGETA: CUlong = 0x40487413uL

public val TIOCSETA: CUlong = 0x80487414uL

public val TIOCSETAW: CUlong = 0x80487415uL

public val TIOCSETAF: CUlong = 0x80487416uL

public val BIOCGRSIG: CUlong = 0x40044272uL

public val BIOCSRSIG: CUlong = 0x80044273uL

public val BIOCSDLT: CUlong = 0x80044278uL

public val BIOCGSEESENT: CUlong = 0x40044276uL

public val BIOCSSEESENT: CUlong = 0x80044277uL

public val BIOCGDLTLIST: CUlong = 0xc00c4279uL

public val FIODTYPE: CUlong = 0x4004667auL

public val B0: SpeedT = 0uL

public val B50: SpeedT = 50uL

public val B75: SpeedT = 75uL

public val B110: SpeedT = 110uL

public val B134: SpeedT = 134uL

public val B150: SpeedT = 150uL

public val B200: SpeedT = 200uL

public val B300: SpeedT = 300uL

public val B600: SpeedT = 600uL

public val B1200: SpeedT = 1200uL

public val B1800: SpeedT = 1800uL

public val B2400: SpeedT = 2400uL

public val B4800: SpeedT = 4800uL

public val B9600: SpeedT = 9600uL

public val B19200: SpeedT = 19200uL

public val B38400: SpeedT = 38400uL

public val B7200: SpeedT = 7200uL

public val B14400: SpeedT = 14400uL

public val B28800: SpeedT = 28800uL

public val B57600: SpeedT = 57600uL

public val B76800: SpeedT = 76800uL

public val B115200: SpeedT = 115200uL

public val B230400: SpeedT = 230400uL

public val EXTA: SpeedT = 19200uL

public val EXTB: SpeedT = 38400uL

public val SIGTRAP: CInt = 5

public val GLOB_APPEND: CInt = 0x0001

public val GLOB_DOOFFS: CInt = 0x0002

public val GLOB_ERR: CInt = 0x0004

public val GLOB_MARK: CInt = 0x0008

public val GLOB_NOCHECK: CInt = 0x0010

public val GLOB_NOSORT: CInt = 0x0020

public val GLOB_NOESCAPE: CInt = 0x2000

public val GLOB_NOSPACE: CInt = -1

public val GLOB_ABORTED: CInt = -2

public val GLOB_NOMATCH: CInt = -3

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_DONTNEED: CInt = 4

public val SC_IOV_MAX: CInt = 56

public val SC_GETGR_R_SIZE_MAX: CInt = 70

public val SC_GETPW_R_SIZE_MAX: CInt = 71

public val SC_LOGIN_NAME_MAX: CInt = 73

public val SC_MQ_PRIO_MAX: CInt = 75

public val SC_THREAD_ATTR_STACKADDR: CInt = 82

public val SC_THREAD_ATTR_STACKSIZE: CInt = 83

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 85

public val SC_THREAD_KEYS_MAX: CInt = 86

public val SC_THREAD_PRIO_INHERIT: CInt = 87

public val SC_THREAD_PRIO_PROTECT: CInt = 88

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 89

public val SC_THREAD_PROCESS_SHARED: CInt = 90

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 91

public val SC_THREAD_STACK_MIN: CInt = 93

public val SC_THREAD_THREADS_MAX: CInt = 94

public val SC_THREADS: CInt = 96

public val SC_TTY_NAME_MAX: CInt = 101

public val SC_ATEXIT_MAX: CInt = 107

public val SC_XOPEN_CRYPT: CInt = 108

public val SC_XOPEN_ENH_I18N: CInt = 109

public val SC_XOPEN_LEGACY: CInt = 110

public val SC_XOPEN_REALTIME: CInt = 111

public val SC_XOPEN_REALTIME_THREADS: CInt = 112

public val SC_XOPEN_SHM: CInt = 113

public val SC_XOPEN_UNIX: CInt = 115

public val SC_XOPEN_VERSION: CInt = 116

public val SC_XOPEN_XCU_VERSION: CInt = 121

public val SC_PHYS_PAGES: CInt = 200

public val PTHREAD_STACK_MIN: SizeT = 16384uL

public val PTHREAD_STACK_MIN1: SizeT = 8192uL

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_AS: CInt = 5

public val RLIMIT_RSS: CInt = RLIMIT_AS

public val RLIMIT_MEMLOCK: CInt = 6

public val RLIMIT_NPROC: CInt = 7

public val RLIMIT_NOFILE: CInt = 8

public val RLIM_NLIMITS: CInt = 9

public val RLIMIT_POSIX_FLAG: CInt = 0x1000

public val RLIM_INFINITY: RlimT = 0x7fffffffffffffffuL

public val RUSAGE_SELF: CInt = 0

public val RUSAGE_CHILDREN: CInt = -1

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val MADV_FREE: CInt = 5

public val MADV_ZERO_WIRED_PAGES: CInt = 6

public val MADV_FREE_REUSABLE: CInt = 7

public val MADV_FREE_REUSE: CInt = 8

public val MADV_CAN_REUSE: CInt = 9

public val MADV_ZERO: CInt = 11

public val MINCORE_INCORE: CInt = 0x1

public val MINCORE_REFERENCED: CInt = 0x2

public val MINCORE_MODIFIED: CInt = 0x4

public val MINCORE_REFERENCED_OTHER: CInt = 0x8

public val MINCORE_MODIFIED_OTHER: CInt = 0x10

public val CTLIOCGINFO: CUlong = 0xc0644e03uL

//
// sys/netinet/in.h
// Protocols (RFC 1700)
// NOTE: These are in addition to the constants defined in src/unix/mod.rs
// IPPROTO_IP defined in src/unix/mod.rs
/**
 * IP6 hop-by-hop options
 */
public val IPPROTO_HOPOPTS: CInt = 0

// IPPROTO_ICMP defined in src/unix/mod.rs
/**
 * group mgmt protocol
 */
public val IPPROTO_IGMP: CInt = 2

/**
 * gateway<sup>2</sup> (deprecated)
 */
public val IPPROTO_GGP: CInt = 3

/**
 * for compatibility
 */
public val IPPROTO_IPIP: CInt = 4

// IPPROTO_TCP defined in src/unix/mod.rs
/**
 * Stream protocol II.
 */
public val IPPROTO_ST: CInt = 7

/**
 * exterior gateway protocol
 */
public val IPPROTO_EGP: CInt = 8

/**
 * private interior gateway
 */
public val IPPROTO_PIGP: CInt = 9

/**
 * BBN RCC Monitoring
 */
public val IPPROTO_RCCMON: CInt = 10

/**
 * network voice protocol
 */
public val IPPROTO_NVPII: CInt = 11

/**
 * pup
 */
public val IPPROTO_PUP: CInt = 12

/**
 * Argus
 */
public val IPPROTO_ARGUS: CInt = 13

/**
 * EMCON
 */
public val IPPROTO_EMCON: CInt = 14

/**
 * Cross Net Debugger
 */
public val IPPROTO_XNET: CInt = 15

/**
 * Chaos
 */
public val IPPROTO_CHAOS: CInt = 16

// IPPROTO_UDP defined in src/unix/mod.rs
/**
 * Multiplexing
 */
public val IPPROTO_MUX: CInt = 18

/**
 * DCN Measurement Subsystems
 */
public val IPPROTO_MEAS: CInt = 19

/**
 * Host Monitoring
 */
public val IPPROTO_HMP: CInt = 20

/**
 * Packet Radio Measurement
 */
public val IPPROTO_PRM: CInt = 21

/**
 * xns idp
 */
public val IPPROTO_IDP: CInt = 22

/**
 * Trunk-1
 */
public val IPPROTO_TRUNK1: CInt = 23

/**
 * Trunk-2
 */
public val IPPROTO_TRUNK2: CInt = 24

/**
 * Leaf-1
 */
public val IPPROTO_LEAF1: CInt = 25

/**
 * Leaf-2
 */
public val IPPROTO_LEAF2: CInt = 26

/**
 * Reliable Data
 */
public val IPPROTO_RDP: CInt = 27

/**
 * Reliable Transaction
 */
public val IPPROTO_IRTP: CInt = 28

/**
 * tp-4 w/ class negotiation
 */
public val IPPROTO_TP: CInt = 29

/**
 * Bulk Data Transfer
 */
public val IPPROTO_BLT: CInt = 30

/**
 * Network Services
 */
public val IPPROTO_NSP: CInt = 31

/**
 * Merit Internodal
 */
public val IPPROTO_INP: CInt = 32

/**
 * Sequential Exchange
 */
public val IPPROTO_SEP: CInt = 33

/**
 * Third Party Connect
 */
public val IPPROTO_3PC: CInt = 34

/**
 * InterDomain Policy Routing
 */
public val IPPROTO_IDPR: CInt = 35

/**
 * XTP
 */
public val IPPROTO_XTP: CInt = 36

/**
 * Datagram Delivery
 */
public val IPPROTO_DDP: CInt = 37

/**
 * Control Message Transport
 */
public val IPPROTO_CMTP: CInt = 38

/**
 * TP++ Transport
 */
public val IPPROTO_TPXX: CInt = 39

/**
 * IL transport protocol
 */
public val IPPROTO_IL: CInt = 40

// IPPROTO_IPV6 defined in src/unix/mod.rs
/**
 * Source Demand Routing
 */
public val IPPROTO_SDRP: CInt = 42

/**
 * IP6 routing header
 */
public val IPPROTO_ROUTING: CInt = 43

/**
 * IP6 fragmentation header
 */
public val IPPROTO_FRAGMENT: CInt = 44

/**
 * InterDomain Routing
 */
public val IPPROTO_IDRP: CInt = 45

/**
 * resource reservation
 */
public val IPPROTO_RSVP: CInt = 46

/**
 * General Routing Encap.
 */
public val IPPROTO_GRE: CInt = 47

/**
 * Mobile Host Routing
 */
public val IPPROTO_MHRP: CInt = 48

/**
 * BHA
 */
public val IPPROTO_BHA: CInt = 49

/**
 * IP6 Encap Sec. Payload
 */
public val IPPROTO_ESP: CInt = 50

/**
 * IP6 Auth Header
 */
public val IPPROTO_AH: CInt = 51

/**
 * Integ. Net Layer Security
 */
public val IPPROTO_INLSP: CInt = 52

/**
 * IP with encryption
 */
public val IPPROTO_SWIPE: CInt = 53

/**
 * Next Hop Resolution
 */
public val IPPROTO_NHRP: CInt = 54

// 55-57: Unassigned
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
 * any host internal protocol
 */
public val IPPROTO_AHIP: CInt = 61

/**
 * CFTP
 */
public val IPPROTO_CFTP: CInt = 62

/**
 * "hello" routing protocol
 */
public val IPPROTO_HELLO: CInt = 63

/**
 * SATNET/Backroom EXPAK
 */
public val IPPROTO_SATEXPAK: CInt = 64

/**
 * Kryptolan
 */
public val IPPROTO_KRYPTOLAN: CInt = 65

/**
 * Remote Virtual Disk
 */
public val IPPROTO_RVD: CInt = 66

/**
 * Pluribus Packet Core
 */
public val IPPROTO_IPPC: CInt = 67

/**
 * Any distributed FS
 */
public val IPPROTO_ADFS: CInt = 68

/**
 * Satnet Monitoring
 */
public val IPPROTO_SATMON: CInt = 69

/**
 * VISA Protocol
 */
public val IPPROTO_VISA: CInt = 70

/**
 * Packet Core Utility
 */
public val IPPROTO_IPCV: CInt = 71

/**
 * Comp. Prot. Net. Executive
 */
public val IPPROTO_CPNX: CInt = 72

/**
 * Comp. Prot. HeartBeat
 */
public val IPPROTO_CPHB: CInt = 73

/**
 * Wang Span Network
 */
public val IPPROTO_WSN: CInt = 74

/**
 * Packet Video Protocol
 */
public val IPPROTO_PVP: CInt = 75

/**
 * BackRoom SATNET Monitoring
 */
public val IPPROTO_BRSATMON: CInt = 76

/**
 * Sun net disk proto (temp.)
 */
public val IPPROTO_ND: CInt = 77

/**
 * WIDEBAND Monitoring
 */
public val IPPROTO_WBMON: CInt = 78

/**
 * WIDEBAND EXPAK
 */
public val IPPROTO_WBEXPAK: CInt = 79

/**
 * ISO cnlp
 */
public val IPPROTO_EON: CInt = 80

/**
 * VMTP
 */
public val IPPROTO_VMTP: CInt = 81

/**
 * Secure VMTP
 */
public val IPPROTO_SVMTP: CInt = 82

/**
 * Banyon VINES
 */
public val IPPROTO_VINES: CInt = 83

/**
 * TTP
 */
public val IPPROTO_TTP: CInt = 84

/**
 * NSFNET-IGP
 */
public val IPPROTO_IGP: CInt = 85

/**
 * dissimilar gateway prot.
 */
public val IPPROTO_DGP: CInt = 86

/**
 * TCF
 */
public val IPPROTO_TCF: CInt = 87

/**
 * Cisco/GXS IGRP
 */
public val IPPROTO_IGRP: CInt = 88

/**
 * OSPFIGP
 */
public val IPPROTO_OSPFIGP: CInt = 89

/**
 * Strite RPC protocol
 */
public val IPPROTO_SRPC: CInt = 90

/**
 * Locus Address Resoloution
 */
public val IPPROTO_LARP: CInt = 91

/**
 * Multicast Transport
 */
public val IPPROTO_MTP: CInt = 92

/**
 * AX.25 Frames
 */
public val IPPROTO_AX25: CInt = 93

/**
 * IP encapsulated in IP
 */
public val IPPROTO_IPEIP: CInt = 94

/**
 * Mobile Int.ing control
 */
public val IPPROTO_MICP: CInt = 95

/**
 * Semaphore Comm. security
 */
public val IPPROTO_SCCSP: CInt = 96

/**
 * Ethernet IP encapsulation
 */
public val IPPROTO_ETHERIP: CInt = 97

/**
 * encapsulation header
 */
public val IPPROTO_ENCAP: CInt = 98

/**
 * any private encr. scheme
 */
public val IPPROTO_APES: CInt = 99

/**
 * GMTP
 */
public val IPPROTO_GMTP: CInt = 100

// 101-254: Partly Unassigned
/**
 * Protocol Independent Mcast
 */
public val IPPROTO_PIM: CInt = 103

/**
 * payload compression (IPComp)
 */
public val IPPROTO_IPCOMP: CInt = 108

/**
 * PGM
 */
public val IPPROTO_PGM: CInt = 113

/**
 * SCTP
 */
public val IPPROTO_SCTP: CInt = 132

// 255: Reserved
// BSD Private, local use, namespace incursion
/**
 * divert pseudo-protocol
 */
public val IPPROTO_DIVERT: CInt = 254

/**
 * raw IP packet
 */
public val IPPROTO_RAW: CInt = 255

public val IPPROTO_MAX: CInt = 256

/**
 * last return value of *_input(), meaning "all job for this pkt is done".
 */
public val IPPROTO_DONE: CInt = 257

public val AF_UNSPEC: CInt = 0

public val AF_LOCAL: CInt = 1

public val AF_UNIX: CInt = AF_LOCAL

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NS: CInt = 6

public val AF_ISO: CInt = 7

public val AF_OSI: CInt = AF_ISO

public val AF_ECMA: CInt = 8

public val AF_DATAKIT: CInt = 9

public val AF_CCITT: CInt = 10

public val AF_SNA: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_LAT: CInt = 14

public val AF_HYLINK: CInt = 15

public val AF_APPLETALK: CInt = 16

public val AF_ROUTE: CInt = 17

public val AF_LINK: CInt = 18

public val PSEUDO_AF_XTP: CInt = 19

public val AF_COIP: CInt = 20

public val AF_CNT: CInt = 21

public val PSEUDO_AF_RTIP: CInt = 22

public val AF_IPX: CInt = 23

public val AF_SIP: CInt = 24

public val PSEUDO_AF_PIP: CInt = 25

public val AF_NDRV: CInt = 27

public val AF_ISDN: CInt = 28

public val AF_E164: CInt = AF_ISDN

public val PSEUDO_AF_KEY: CInt = 29

public val AF_INET6: CInt = 30

public val AF_NATM: CInt = 31

public val AF_SYSTEM: CInt = 32

public val AF_NETBIOS: CInt = 33

public val AF_PPP: CInt = 34

public val PSEUDO_AF_HDRCMPLT: CInt = 35

public val AF_IEEE80211: CInt = 37

public val AF_UTUN: CInt = 38

public val AF_VSOCK: CInt = 40

public val AF_SYS_CONTROL: CInt = 2

public val SYSPROTO_EVENT: CInt = 1

public val SYSPROTO_CONTROL: CInt = 2

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_UNIX: CInt = PF_LOCAL

public val PF_INET: CInt = AF_INET

public val PF_IMPLINK: CInt = AF_IMPLINK

public val PF_PUP: CInt = AF_PUP

public val PF_CHAOS: CInt = AF_CHAOS

public val PF_NS: CInt = AF_NS

public val PF_ISO: CInt = AF_ISO

public val PF_OSI: CInt = AF_ISO

public val PF_ECMA: CInt = AF_ECMA

public val PF_DATAKIT: CInt = AF_DATAKIT

public val PF_CCITT: CInt = AF_CCITT

public val PF_SNA: CInt = AF_SNA

public val PF_DE_CNET: CInt = AF_DE_CNET

public val PF_DLI: CInt = AF_DLI

public val PF_LAT: CInt = AF_LAT

public val PF_HYLINK: CInt = AF_HYLINK

public val PF_APPLETALK: CInt = AF_APPLETALK

public val PF_ROUTE: CInt = AF_ROUTE

public val PF_LINK: CInt = AF_LINK

public val PF_XTP: CInt = PSEUDO_AF_XTP

public val PF_COIP: CInt = AF_COIP

public val PF_CNT: CInt = AF_CNT

public val PF_SIP: CInt = AF_SIP

public val PF_IPX: CInt = AF_IPX

public val PF_RTIP: CInt = PSEUDO_AF_RTIP

public val PF_PIP: CInt = PSEUDO_AF_PIP

public val PF_NDRV: CInt = AF_NDRV

public val PF_ISDN: CInt = AF_ISDN

public val PF_KEY: CInt = PSEUDO_AF_KEY

public val PF_INET6: CInt = AF_INET6

public val PF_NATM: CInt = AF_NATM

public val PF_SYSTEM: CInt = AF_SYSTEM

public val PF_NETBIOS: CInt = AF_NETBIOS

public val PF_PPP: CInt = AF_PPP

public val PF_VSOCK: CInt = AF_VSOCK

public val NET_RT_DUMP: CInt = 1

public val NET_RT_FLAGS: CInt = 2

public val NET_RT_IFLIST: CInt = 3

public val SOMAXCONN: CInt = 128

public val SOCK_MAXADDRLEN: CInt = 255

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val IP_TTL: CInt = 4

public val IP_HDRINCL: CInt = 2

public val IP_RECVDSTADDR: CInt = 7

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IP_RECVIF: CInt = 20

public val IP_RECVTTL: CInt = 24

public val IP_BOUND_IF: CInt = 25

public val IP_PKTINFO: CInt = 26

public val IP_RECVTOS: CInt = 27

public val IP_DONTFRAG: CInt = 28

public val IPV6_JOIN_GROUP: CInt = 12

public val IPV6_LEAVE_GROUP: CInt = 13

public val IPV6_CHECKSUM: CInt = 26

public val IPV6_RECVTCLASS: CInt = 35

public val IPV6_TCLASS: CInt = 36

public val IPV6_RECVHOPLIMIT: CInt = 37

public val IPV6_PKTINFO: CInt = 46

public val IPV6_HOPLIMIT: CInt = 47

public val IPV6_RECVPKTINFO: CInt = 61

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 70

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 71

public val IP_BLOCK_SOURCE: CInt = 72

public val IP_UNBLOCK_SOURCE: CInt = 73

public val IPV6_BOUND_IF: CInt = 125

public val TCP_NOPUSH: CInt = 4

public val TCP_NOOPT: CInt = 8

public val TCP_KEEPALIVE: CInt = 0x10

public val TCP_KEEPINTVL: CInt = 0x101

public val TCP_KEEPCNT: CInt = 0x102

/**
 * Enable/Disable TCP Fastopen on this socket
 */
public val TCP_FASTOPEN: CInt = 0x105

public val TCP_CONNECTION_INFO: CInt = 0x106

public val SOL_LOCAL: CInt = 0

/**
 * Retrieve peer credentials.
 */
public val LOCAL_PEERCRED: CInt = 0x001

/**
 * Retrieve peer PID.
 */
public val LOCAL_PEERPID: CInt = 0x002

/**
 * Retrieve effective peer PID.
 */
public val LOCAL_PEEREPID: CInt = 0x003

/**
 * Retrieve peer UUID.
 */
public val LOCAL_PEERUUID: CInt = 0x004

/**
 * Retrieve effective peer UUID.
 */
public val LOCAL_PEEREUUID: CInt = 0x005

/**
 * Retrieve peer audit token.
 */
public val LOCAL_PEERTOKEN: CInt = 0x006

public val SOL_SOCKET: CInt = 0xffff

public val SO_DEBUG: CInt = 0x01

public val SO_ACCEPTCONN: CInt = 0x0002

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_OOBINLINE: CInt = 0x0100

public val SO_REUSEPORT: CInt = 0x0200

public val SO_TIMESTAMP: CInt = 0x0400

public val SO_TIMESTAMP_MONOTONIC: CInt = 0x0800

public val SO_DONTTRUNC: CInt = 0x2000

public val SO_WANTMORE: CInt = 0x4000

public val SO_WANTOOBFLAG: CInt = 0x8000

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SO_LABEL: CInt = 0x1010

public val SO_PEERLABEL: CInt = 0x1011

public val SO_NREAD: CInt = 0x1020

public val SO_NKE: CInt = 0x1021

public val SO_NOSIGPIPE: CInt = 0x1022

public val SO_NOADDRERR: CInt = 0x1023

public val SO_NWRITE: CInt = 0x1024

public val SO_REUSESHAREUID: CInt = 0x1025

public val SO_NOTIFYCONFLICT: CInt = 0x1026

public val SO_LINGER_SEC: CInt = 0x1080

public val SO_RANDOMPORT: CInt = 0x1082

public val SO_NP_EXTENSIONS: CInt = 0x1083

public val MSG_OOB: CInt = 0x1

public val MSG_PEEK: CInt = 0x2

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_EOR: CInt = 0x8

public val MSG_TRUNC: CInt = 0x10

public val MSG_CTRUNC: CInt = 0x20

public val MSG_WAITALL: CInt = 0x40

public val MSG_DONTWAIT: CInt = 0x80

public val MSG_EOF: CInt = 0x100

public val MSG_FLUSH: CInt = 0x400

public val MSG_HOLD: CInt = 0x800

public val MSG_SEND: CInt = 0x1000

public val MSG_HAVEMORE: CInt = 0x2000

public val MSG_RCVMORE: CInt = 0x4000

public val MSG_NEEDSA: CInt = 0x10000

public val MSG_NOSIGNAL: CInt = 0x80000

public val SCM_TIMESTAMP: CInt = 0x02

public val SCM_CREDS: CInt = 0x03

// https://github.com/aosm/xnu/blob/HEAD/bsd/net/if.h#L140-L156
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
public val IFF_NOTRAILERS: CInt = 0x20

// obsolete: avoid use of trailers
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
public val IFF_ALTPHYS: CInt = IFF_LINK2

// use alternate physical connection
public val IFF_MULTICAST: CInt = 0x8000

// supports multicast
public val SCOPE6_ID_MAX: SizeT = 16uL

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val SAE_ASSOCID_ANY: io.github.kotlinmania.libc.SaeAssocidT = 0u

/**
 * ((saeAssocidT)(-1ULL))
 */
public val SAE_ASSOCID_ALL: io.github.kotlinmania.libc.SaeAssocidT = 0xffffffffu

public val SAE_CONNID_ANY: io.github.kotlinmania.libc.SaeConnidT = 0u

/**
 * ((saeConnidT)(-1ULL))
 */
public val SAE_CONNID_ALL: io.github.kotlinmania.libc.SaeConnidT = 0xffffffffu

// connectx() flag parameters
/**
 * resume connect() on read/write
 */
public val CONNECT_RESUME_ON_READ_WRITE: CUint = 0x1u

/**
 * data is idempotent
 */
public val CONNECT_DATA_IDEMPOTENT: CUint = 0x2u

/**
 * data includes security that replaces the TFO-cookie
 */
public val CONNECT_DATA_AUTHENTICATED: CUint = 0x4u

public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_NB: CInt = 4

public val LOCK_UN: CInt = 8

public val MAP_COPY: CInt = 0x0002

public val MAP_RENAME: CInt = 0x0020

public val MAP_NORESERVE: CInt = 0x0040

public val MAP_NOEXTEND: CInt = 0x0100

public val MAP_HASSEMAPHORE: CInt = 0x0200

public val MAP_NOCACHE: CInt = 0x0400

public val MAP_JIT: CInt = 0x0800

public val SC_ARG_MAX: CInt = 1

public val SC_CHILD_MAX: CInt = 2

public val SC_CLK_TCK: CInt = 3

public val SC_NGROUPS_MAX: CInt = 4

public val SC_OPEN_MAX: CInt = 5

public val SC_JOB_CONTROL: CInt = 6

public val SC_SAVED_IDS: CInt = 7

public val SC_VERSION: CInt = 8

public val SC_BC_BASE_MAX: CInt = 9

public val SC_BC_DIM_MAX: CInt = 10

public val SC_BC_SCALE_MAX: CInt = 11

public val SC_BC_STRING_MAX: CInt = 12

public val SC_COLL_WEIGHTS_MAX: CInt = 13

public val SC_EXPR_NEST_MAX: CInt = 14

public val SC_LINE_MAX: CInt = 15

public val SC_RE_DUP_MAX: CInt = 16

public val SC_2_VERSION: CInt = 17

public val SC_2_C_BIND: CInt = 18

public val SC_2_C_DEV: CInt = 19

public val SC_2_CHAR_TERM: CInt = 20

public val SC_2_FORT_DEV: CInt = 21

public val SC_2_FORT_RUN: CInt = 22

public val SC_2_LOCALEDEF: CInt = 23

public val SC_2_SW_DEV: CInt = 24

public val SC_2_UPE: CInt = 25

public val SC_STREAM_MAX: CInt = 26

public val SC_TZNAME_MAX: CInt = 27

public val SC_ASYNCHRONOUS_IO: CInt = 28

public val SC_PAGESIZE: CInt = 29

public val SC_MEMLOCK: CInt = 30

public val SC_MEMLOCK_RANGE: CInt = 31

public val SC_MEMORY_PROTECTION: CInt = 32

public val SC_MESSAGE_PASSING: CInt = 33

public val SC_PRIORITIZED_IO: CInt = 34

public val SC_PRIORITY_SCHEDULING: CInt = 35

public val SC_REALTIME_SIGNALS: CInt = 36

public val SC_SEMAPHORES: CInt = 37

public val SC_FSYNC: CInt = 38

public val SC_SHARED_MEMORY_OBJECTS: CInt = 39

public val SC_SYNCHRONIZED_IO: CInt = 40

public val SC_TIMERS: CInt = 41

public val SC_AIO_LISTIO_MAX: CInt = 42

public val SC_AIO_MAX: CInt = 43

public val SC_AIO_PRIO_DELTA_MAX: CInt = 44

public val SC_DELAYTIMER_MAX: CInt = 45

public val SC_MQ_OPEN_MAX: CInt = 46

public val SC_MAPPED_FILES: CInt = 47

public val SC_RTSIG_MAX: CInt = 48

public val SC_SEM_NSEMS_MAX: CInt = 49

public val SC_SEM_VALUE_MAX: CInt = 50

public val SC_SIGQUEUE_MAX: CInt = 51

public val SC_TIMER_MAX: CInt = 52

public val SC_NPROCESSORS_CONF: CInt = 57

public val SC_NPROCESSORS_ONLN: CInt = 58

public val SC_2_PBS: CInt = 59

public val SC_2_PBS_ACCOUNTING: CInt = 60

public val SC_2_PBS_CHECKPOINT: CInt = 61

public val SC_2_PBS_LOCATE: CInt = 62

public val SC_2_PBS_MESSAGE: CInt = 63

public val SC_2_PBS_TRACK: CInt = 64

public val SC_ADVISORY_INFO: CInt = 65

public val SC_BARRIERS: CInt = 66

public val SC_CLOCK_SELECTION: CInt = 67

public val SC_CPUTIME: CInt = 68

public val SC_FILE_LOCKING: CInt = 69

public val SC_HOST_NAME_MAX: CInt = 72

public val SC_MONOTONIC_CLOCK: CInt = 74

public val SC_READER_WRITER_LOCKS: CInt = 76

public val SC_REGEXP: CInt = 77

public val SC_SHELL: CInt = 78

public val SC_SPAWN: CInt = 79

public val SC_SPIN_LOCKS: CInt = 80

public val SC_SPORADIC_SERVER: CInt = 81

public val SC_THREAD_CPUTIME: CInt = 84

public val SC_THREAD_SPORADIC_SERVER: CInt = 92

public val SC_TIMEOUTS: CInt = 95

public val SC_TRACE: CInt = 97

public val SC_TRACE_EVENT_FILTER: CInt = 98

public val SC_TRACE_INHERIT: CInt = 99

public val SC_TRACE_LOG: CInt = 100

public val SC_TYPED_MEMORY_OBJECTS: CInt = 102

public val SC_V6_ILP32_OFF32: CInt = 103

public val SC_V6_ILP32_OFFBIG: CInt = 104

public val SC_V6_LP64_OFF64: CInt = 105

public val SC_V6_LPBIG_OFFBIG: CInt = 106

public val SC_IPV6: CInt = 118

public val SC_RAW_SOCKETS: CInt = 119

public val SC_SYMLOOP_MAX: CInt = 120

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_XOPEN_STREAMS: CInt = 114

public val SC_XBS5_ILP32_OFF32: CInt = 122

public val SC_XBS5_ILP32_OFFBIG: CInt = 123

public val SC_XBS5_LP64_OFF64: CInt = 124

public val SC_XBS5_LPBIG_OFFBIG: CInt = 125

public val SC_SS_REPL_MAX: CInt = 126

public val SC_TRACE_EVENT_NAME_MAX: CInt = 127

public val SC_TRACE_NAME_MAX: CInt = 128

public val SC_TRACE_SYS_MAX: CInt = 129

public val SC_TRACE_USER_EVENT_MAX: CInt = 130

public val SC_PASS_MAX: CInt = 131

// `confstr` keys (only the values guaranteed by `man confstr`).
public val CS_PATH: CInt = 1

public val CS_DARWIN_USER_DIR: CInt = 65536

public val CS_DARWIN_USER_TEMP_DIR: CInt = 65537

public val CS_DARWIN_USER_CACHE_DIR: CInt = 65538

public val OS_UNFAIR_LOCK_INIT: OsUnfairLock = OsUnfairLock()

public val OS_LOG_TYPE_DEFAULT: io.github.kotlinmania.libc.OsLogTypeT = 0x00u

public val OS_LOG_TYPE_INFO: io.github.kotlinmania.libc.OsLogTypeT = 0x01u

public val OS_LOG_TYPE_DEBUG: io.github.kotlinmania.libc.OsLogTypeT = 0x02u

public val OS_LOG_TYPE_ERROR: io.github.kotlinmania.libc.OsLogTypeT = 0x10u

public val OS_LOG_TYPE_FAULT: io.github.kotlinmania.libc.OsLogTypeT = 0x11u

public val OS_SIGNPOST_EVENT: io.github.kotlinmania.libc.OsSignpostTypeT = 0x00u

public val OS_SIGNPOST_INTERVAL_BEGIN: io.github.kotlinmania.libc.OsSignpostTypeT = 0x01u

public val OS_SIGNPOST_INTERVAL_END: io.github.kotlinmania.libc.OsSignpostTypeT = 0x02u

public val MINSIGSTKSZ: SizeT = 32768uL

public val SIGSTKSZ: SizeT = 131072uL

public val FD_SETSIZE: Int = 1024

public val ST_NOSUID: CUlong = 2uL

public val EVFILT_READ: Short = -1

public val EVFILT_WRITE: Short = -2

public val EVFILT_AIO: Short = -3

public val EVFILT_VNODE: Short = -4

public val EVFILT_PROC: Short = -5

public val EVFILT_SIGNAL: Short = -6

public val EVFILT_TIMER: Short = -7

public val EVFILT_MACHPORT: Short = -8

public val EVFILT_FS: Short = -9

public val EVFILT_USER: Short = -10

public val EVFILT_VM: Short = -12

public val EV_ADD: UShort = 0x1u

public val EV_DELETE: UShort = 0x2u

public val EV_ENABLE: UShort = 0x4u

public val EV_DISABLE: UShort = 0x8u

public val EV_ONESHOT: UShort = 0x10u

public val EV_CLEAR: UShort = 0x20u

public val EV_RECEIPT: UShort = 0x40u

public val EV_DISPATCH: UShort = 0x80u

public val EV_FLAG0: UShort = 0x1000u

public val EV_POLL: UShort = 0x1000u

public val EV_FLAG1: UShort = 0x2000u

public val EV_OOBAND: UShort = 0x2000u

public val EV_ERROR: UShort = 0x4000u

public val EV_EOF: UShort = 0x8000u

public val EV_SYSFLAGS: UShort = 0xf000u

public val NOTE_TRIGGER: UInt = 0x01000000u

public val NOTE_FFNOP: UInt = 0x00000000u

public val NOTE_FFAND: UInt = 0x40000000u

public val NOTE_FFOR: UInt = 0x80000000u

public val NOTE_FFCOPY: UInt = 0xc0000000u

public val NOTE_FFCTRLMASK: UInt = 0xc0000000u

public val NOTE_FFLAGSMASK: UInt = 0x00ffffffu

public val NOTE_LOWAT: UInt = 0x00000001u

public val NOTE_DELETE: UInt = 0x00000001u

public val NOTE_WRITE: UInt = 0x00000002u

public val NOTE_EXTEND: UInt = 0x00000004u

public val NOTE_ATTRIB: UInt = 0x00000008u

public val NOTE_LINK: UInt = 0x00000010u

public val NOTE_RENAME: UInt = 0x00000020u

public val NOTE_REVOKE: UInt = 0x00000040u

public val NOTE_NONE: UInt = 0x00000080u

public val NOTE_EXIT: UInt = 0x80000000u

public val NOTE_FORK: UInt = 0x40000000u

public val NOTE_EXEC: UInt = 0x20000000u

public val NOTE_REAP: UInt = 0x10000000u

public val NOTE_SIGNAL: UInt = 0x08000000u

public val NOTE_EXITSTATUS: UInt = 0x04000000u

public val NOTE_EXIT_DETAIL: UInt = 0x02000000u

public val NOTE_PDATAMASK: UInt = 0x000fffffu

public val NOTE_PCTRLMASK: UInt = 0xfff00000u

public val NOTE_EXIT_REPARENTED: UInt = 0x00080000u

public val NOTE_EXIT_DETAIL_MASK: UInt = 0x00070000u

public val NOTE_EXIT_DECRYPTFAIL: UInt = 0x00010000u

public val NOTE_EXIT_MEMORY: UInt = 0x00020000u

public val NOTE_EXIT_CSERROR: UInt = 0x00040000u

public val NOTE_VM_PRESSURE: UInt = 0x80000000u

public val NOTE_VM_PRESSURE_TERMINATE: UInt = 0x40000000u

public val NOTE_VM_PRESSURE_SUDDEN_TERMINATE: UInt = 0x20000000u

public val NOTE_VM_ERROR: UInt = 0x10000000u

public val NOTE_SECONDS: UInt = 0x00000001u

public val NOTE_USECONDS: UInt = 0x00000002u

public val NOTE_NSECONDS: UInt = 0x00000004u

public val NOTE_ABSOLUTE: UInt = 0x00000008u

public val NOTE_LEEWAY: UInt = 0x00000010u

public val NOTE_CRITICAL: UInt = 0x00000020u

public val NOTE_BACKGROUND: UInt = 0x00000040u

public val NOTE_MACH_CONTINUOUS_TIME: UInt = 0x00000080u

public val NOTE_MACHTIME: UInt = 0x00000100u

public val NOTE_TRACK: UInt = 0x00000001u

public val NOTE_TRACKERR: UInt = 0x00000002u

public val NOTE_CHILD: UInt = 0x00000004u

public val OCRNL: io.github.kotlinmania.libc.TcflagT = 0x00000010uL

public val ONOCR: io.github.kotlinmania.libc.TcflagT = 0x00000020uL

public val ONLRET: io.github.kotlinmania.libc.TcflagT = 0x00000040uL

public val OFILL: io.github.kotlinmania.libc.TcflagT = 0x00000080uL

public val NLDLY: io.github.kotlinmania.libc.TcflagT = 0x00000300uL

public val TABDLY: io.github.kotlinmania.libc.TcflagT = 0x00000c04uL

public val CRDLY: io.github.kotlinmania.libc.TcflagT = 0x00003000uL

public val FFDLY: io.github.kotlinmania.libc.TcflagT = 0x00004000uL

public val BSDLY: io.github.kotlinmania.libc.TcflagT = 0x00008000uL

public val VTDLY: io.github.kotlinmania.libc.TcflagT = 0x00010000uL

public val OFDEL: io.github.kotlinmania.libc.TcflagT = 0x00020000uL

public val NL0: io.github.kotlinmania.libc.TcflagT = 0x00000000uL

public val NL1: io.github.kotlinmania.libc.TcflagT = 0x00000100uL

public val TAB0: io.github.kotlinmania.libc.TcflagT = 0x00000000uL

public val TAB1: io.github.kotlinmania.libc.TcflagT = 0x00000400uL

public val TAB2: io.github.kotlinmania.libc.TcflagT = 0x00000800uL

public val CR0: io.github.kotlinmania.libc.TcflagT = 0x00000000uL

public val CR1: io.github.kotlinmania.libc.TcflagT = 0x00001000uL

public val CR2: io.github.kotlinmania.libc.TcflagT = 0x00002000uL

public val CR3: io.github.kotlinmania.libc.TcflagT = 0x00003000uL

public val FF0: io.github.kotlinmania.libc.TcflagT = 0x00000000uL

public val FF1: io.github.kotlinmania.libc.TcflagT = 0x00004000uL

public val BS0: io.github.kotlinmania.libc.TcflagT = 0x00000000uL

public val BS1: io.github.kotlinmania.libc.TcflagT = 0x00008000uL

public val TAB3: io.github.kotlinmania.libc.TcflagT = 0x00000004uL

public val VT0: io.github.kotlinmania.libc.TcflagT = 0x00000000uL

public val VT1: io.github.kotlinmania.libc.TcflagT = 0x00010000uL

public val IUTF8: io.github.kotlinmania.libc.TcflagT = 0x00004000uL

public val CRTSCTS: io.github.kotlinmania.libc.TcflagT = 0x00030000uL

public val NI_MAXHOST: SocklenT = 1025u

public val NI_MAXSERV: SocklenT = 32u

public val NI_NOFQDN: CInt = 0x00000001

public val NI_NUMERICHOST: CInt = 0x00000002

public val NI_NAMEREQD: CInt = 0x00000004

public val NI_NUMERICSERV: CInt = 0x00000008

public val NI_NUMERICSCOPE: CInt = 0x00000100

public val NI_DGRAM: CInt = 0x00000010

public val Q_GETQUOTA: CInt = 0x300

public val Q_SETQUOTA: CInt = 0x400

public val RENAME_SWAP: CUint = 0x00000002u

public val RENAME_EXCL: CUint = 0x00000004u

public val RTLD_LOCAL: CInt = 0x4

public val RTLD_FIRST: CInt = 0x100

public val RTLD_NODELETE: CInt = 0x80

public val RTLD_NOLOAD: CInt = 0x10

public val RTLD_GLOBAL: CInt = 0x8

public val RTLD_MAIN_ONLY: COpaquePointer? = COpaquePointer((-5).toLong())

public val WSTOPPED: CInt = 127

public val LOG_NETINFO: CInt = 12 shl 3

public val LOG_REMOTEAUTH: CInt = 13 shl 3

public val LOG_INSTALL: CInt = 14 shl 3

public val LOG_RAS: CInt = 15 shl 3

public val LOG_LAUNCHD: CInt = 24 shl 3

public val LOG_NFACILITIES: CInt = 25

public val CTLTYPE: CInt = 0xf

public val CTLTYPE_NODE: CInt = 1

public val CTLTYPE_INT: CInt = 2

public val CTLTYPE_STRING: CInt = 3

public val CTLTYPE_QUAD: CInt = 4

public val CTLTYPE_OPAQUE: CInt = 5

public val CTLTYPE_STRUCT: CInt = CTLTYPE_OPAQUE

public val CTLFLAG_RD: CInt = 0x80000000.toInt()

public val CTLFLAG_WR: CInt = 0x40000000

public val CTLFLAG_RW: CInt = CTLFLAG_RD or CTLFLAG_WR

public val CTLFLAG_NOLOCK: CInt = 0x20000000

public val CTLFLAG_ANYBODY: CInt = 0x10000000

public val CTLFLAG_SECURE: CInt = 0x08000000

public val CTLFLAG_MASKED: CInt = 0x04000000

public val CTLFLAG_NOAUTO: CInt = 0x02000000

public val CTLFLAG_KERN: CInt = 0x01000000

public val CTLFLAG_LOCKED: CInt = 0x00800000

public val CTLFLAG_OID2: CInt = 0x00400000

public val CTL_UNSPEC: CInt = 0

public val CTL_KERN: CInt = 1

public val CTL_VM: CInt = 2

public val CTL_VFS: CInt = 3

public val CTL_NET: CInt = 4

public val CTL_DEBUG: CInt = 5

public val CTL_HW: CInt = 6

public val CTL_MACHDEP: CInt = 7

public val CTL_USER: CInt = 8

public val CTL_MAXID: CInt = 9

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

public val KERN_VNODE: CInt = 13

public val KERN_PROC: CInt = 14

public val KERN_FILE: CInt = 15

public val KERN_PROF: CInt = 16

public val KERN_POSIX1: CInt = 17

public val KERN_NGROUPS: CInt = 18

public val KERN_JOB_CONTROL: CInt = 19

public val KERN_SAVED_IDS: CInt = 20

public val KERN_BOOTTIME: CInt = 21

public val KERN_NISDOMAINNAME: CInt = 22

public val KERN_DOMAINNAME: CInt = KERN_NISDOMAINNAME

public val KERN_MAXPARTITIONS: CInt = 23

public val KERN_KDEBUG: CInt = 24

public val KERN_UPDATEINTERVAL: CInt = 25

public val KERN_OSRELDATE: CInt = 26

public val KERN_NTP_PLL: CInt = 27

public val KERN_BOOTFILE: CInt = 28

public val KERN_MAXFILESPERPROC: CInt = 29

public val KERN_MAXPROCPERUID: CInt = 30

public val KERN_DUMPDEV: CInt = 31

public val KERN_IPC: CInt = 32

public val KERN_DUMMY: CInt = 33

public val KERN_PS_STRINGS: CInt = 34

public val KERN_USRSTACK32: CInt = 35

public val KERN_LOGSIGEXIT: CInt = 36

public val KERN_SYMFILE: CInt = 37

public val KERN_PROCARGS: CInt = 38

public val KERN_NETBOOT: CInt = 40

public val KERN_SYSV: CInt = 42

public val KERN_AFFINITY: CInt = 43

public val KERN_TRANSLATE: CInt = 44

public val KERN_CLASSIC: CInt = KERN_TRANSLATE

public val KERN_EXEC: CInt = 45

public val KERN_CLASSICHANDLER: CInt = KERN_EXEC

public val KERN_AIOMAX: CInt = 46

public val KERN_AIOPROCMAX: CInt = 47

public val KERN_AIOTHREADS: CInt = 48

public val KERN_COREFILE: CInt = 50

public val KERN_COREDUMP: CInt = 51

public val KERN_SUGID_COREDUMP: CInt = 52

public val KERN_PROCDELAYTERM: CInt = 53

public val KERN_SHREG_PRIVATIZABLE: CInt = 54

public val KERN_LOW_PRI_WINDOW: CInt = 56

public val KERN_LOW_PRI_DELAY: CInt = 57

public val KERN_POSIX: CInt = 58

public val KERN_USRSTACK64: CInt = 59

public val KERN_NX_PROTECTION: CInt = 60

public val KERN_TFP: CInt = 61

public val KERN_PROCNAME: CInt = 62

public val KERN_THALTSTACK: CInt = 63

public val KERN_SPECULATIVE_READS: CInt = 64

public val KERN_OSVERSION: CInt = 65

public val KERN_SAFEBOOT: CInt = 66

public val KERN_RAGEVNODE: CInt = 68

public val KERN_TTY: CInt = 69

public val KERN_CHECKOPENEVT: CInt = 70

public val KERN_THREADNAME: CInt = 71

public val KERN_MAXID: CInt = 72

public val KERN_RAGE_PROC: CInt = 1

public val KERN_RAGE_THREAD: CInt = 2

public val KERN_UNRAGE_PROC: CInt = 3

public val KERN_UNRAGE_THREAD: CInt = 4

public val KERN_OPENEVT_PROC: CInt = 1

public val KERN_UNOPENEVT_PROC: CInt = 2

public val KERN_TFP_POLICY: CInt = 1

public val KERN_TFP_POLICY_DENY: CInt = 0

public val KERN_TFP_POLICY_DEFAULT: CInt = 2

public val KERN_KDEFLAGS: CInt = 1

public val KERN_KDDFLAGS: CInt = 2

public val KERN_KDENABLE: CInt = 3

public val KERN_KDSETBUF: CInt = 4

public val KERN_KDGETBUF: CInt = 5

public val KERN_KDSETUP: CInt = 6

public val KERN_KDREMOVE: CInt = 7

public val KERN_KDSETREG: CInt = 8

public val KERN_KDGETREG: CInt = 9

public val KERN_KDREADTR: CInt = 10

public val KERN_KDPIDTR: CInt = 11

public val KERN_KDTHRMAP: CInt = 12

public val KERN_KDPIDEX: CInt = 14

public val KERN_KDSETRTCDEC: CInt = 15

public val KERN_KDGETENTROPY: CInt = 16

public val KERN_KDWRITETR: CInt = 17

public val KERN_KDWRITEMAP: CInt = 18

public val KERN_KDENABLE_BG_TRACE: CInt = 19

public val KERN_KDDISABLE_BG_TRACE: CInt = 20

public val KERN_KDREADCURTHRMAP: CInt = 21

public val KERN_KDSET_TYPEFILTER: CInt = 22

public val KERN_KDBUFWAIT: CInt = 23

public val KERN_KDCPUMAP: CInt = 24

public val KERN_PROC_ALL: CInt = 0

public val KERN_PROC_PID: CInt = 1

public val KERN_PROC_PGRP: CInt = 2

public val KERN_PROC_SESSION: CInt = 3

public val KERN_PROC_TTY: CInt = 4

public val KERN_PROC_UID: CInt = 5

public val KERN_PROC_RUID: CInt = 6

public val KERN_PROC_LCID: CInt = 7

public val KERN_SUCCESS: CInt = 0

public val KERN_INVALID_ADDRESS: CInt = 1

public val KERN_PROTECTION_FAILURE: CInt = 2

public val KERN_NO_SPACE: CInt = 3

public val KERN_INVALID_ARGUMENT: CInt = 4

public val KERN_FAILURE: CInt = 5

public val KERN_RESOURCE_SHORTAGE: CInt = 6

public val KERN_NOT_RECEIVER: CInt = 7

public val KERN_NO_ACCESS: CInt = 8

public val KERN_MEMORY_FAILURE: CInt = 9

public val KERN_MEMORY_ERROR: CInt = 10

public val KERN_ALREADY_IN_SET: CInt = 11

public val KERN_NOT_IN_SET: CInt = 12

public val KERN_NAME_EXISTS: CInt = 13

public val KERN_ABORTED: CInt = 14

public val KERN_INVALID_NAME: CInt = 15

public val KERN_INVALID_TASK: CInt = 16

public val KERN_INVALID_RIGHT: CInt = 17

public val KERN_INVALID_VALUE: CInt = 18

public val KERN_UREFS_OVERFLOW: CInt = 19

public val KERN_INVALID_CAPABILITY: CInt = 20

public val KERN_RIGHT_EXISTS: CInt = 21

public val KERN_INVALID_HOST: CInt = 22

public val KERN_MEMORY_PRESENT: CInt = 23

public val KERN_MEMORY_DATA_MOVED: CInt = 24

public val KERN_MEMORY_RESTART_COPY: CInt = 25

public val KERN_INVALID_PROCESSOR_SET: CInt = 26

public val KERN_POLICY_LIMIT: CInt = 27

public val KERN_INVALID_POLICY: CInt = 28

public val KERN_INVALID_OBJECT: CInt = 29

public val KERN_ALREADY_WAITING: CInt = 30

public val KERN_DEFAULT_SET: CInt = 31

public val KERN_EXCEPTION_PROTECTED: CInt = 32

public val KERN_INVALID_LEDGER: CInt = 33

public val KERN_INVALID_MEMORY_CONTROL: CInt = 34

public val KERN_INVALID_SECURITY: CInt = 35

public val KERN_NOT_DEPRESSED: CInt = 36

public val KERN_TERMINATED: CInt = 37

public val KERN_LOCK_SET_DESTROYED: CInt = 38

public val KERN_LOCK_UNSTABLE: CInt = 39

public val KERN_LOCK_OWNED: CInt = 40

public val KERN_LOCK_OWNED_SELF: CInt = 41

public val KERN_SEMAPHORE_DESTROYED: CInt = 42

public val KERN_RPC_SERVER_TERMINATED: CInt = 43

public val KERN_RPC_TERMINATE_ORPHAN: CInt = 44

public val KERN_RPC_CONTINUE_ORPHAN: CInt = 45

public val KERN_NOT_SUPPORTED: CInt = 46

public val KERN_NODE_DOWN: CInt = 47

public val KERN_NOT_WAITING: CInt = 48

public val KERN_OPERATION_TIMED_OUT: CInt = 49

public val KERN_CODESIGN_ERROR: CInt = 50

public val KERN_POLICY_STATIC: CInt = 51

public val KERN_INSUFFICIENT_BUFFER_SIZE: CInt = 52

public val KIPC_MAXSOCKBUF: CInt = 1

public val KIPC_SOCKBUF_WASTE: CInt = 2

public val KIPC_SOMAXCONN: CInt = 3

public val KIPC_MAX_LINKHDR: CInt = 4

public val KIPC_MAX_PROTOHDR: CInt = 5

public val KIPC_MAX_HDR: CInt = 6

public val KIPC_MAX_DATALEN: CInt = 7

public val KIPC_MBSTAT: CInt = 8

public val KIPC_NMBCLUSTERS: CInt = 9

public val KIPC_SOQLIMITCOMPAT: CInt = 10

public val VM_METER: CInt = 1

public val VM_LOADAVG: CInt = 2

public val VM_MACHFACTOR: CInt = 4

public val VM_SWAPUSAGE: CInt = 5

public val VM_MAXID: CInt = 6

public val VM_PROT_NONE: io.github.kotlinmania.libc.VmProtT = 0x00

public val VM_PROT_READ: io.github.kotlinmania.libc.VmProtT = 0x01

public val VM_PROT_WRITE: io.github.kotlinmania.libc.VmProtT = 0x02

public val VM_PROT_EXECUTE: io.github.kotlinmania.libc.VmProtT = 0x04

public val MEMORY_OBJECT_NULL: io.github.kotlinmania.libc.MemoryObjectT = 0u

public val HW_MACHINE: CInt = 1

public val HW_MODEL: CInt = 2

public val HW_NCPU: CInt = 3

public val HW_BYTEORDER: CInt = 4

public val HW_PHYSMEM: CInt = 5

public val HW_USERMEM: CInt = 6

public val HW_PAGESIZE: CInt = 7

public val HW_DISKNAMES: CInt = 8

public val HW_DISKSTATS: CInt = 9

public val HW_EPOCH: CInt = 10

public val HW_FLOATINGPT: CInt = 11

public val HW_MACHINE_ARCH: CInt = 12

public val HW_VECTORUNIT: CInt = 13

public val HW_BUS_FREQ: CInt = 14

public val HW_CPU_FREQ: CInt = 15

public val HW_CACHELINE: CInt = 16

public val HW_L1ICACHESIZE: CInt = 17

public val HW_L1DCACHESIZE: CInt = 18

public val HW_L2SETTINGS: CInt = 19

public val HW_L2CACHESIZE: CInt = 20

public val HW_L3SETTINGS: CInt = 21

public val HW_L3CACHESIZE: CInt = 22

public val HW_TB_FREQ: CInt = 23

public val HW_MEMSIZE: CInt = 24

public val HW_AVAILCPU: CInt = 25

public val HW_TARGET: CInt = 26

public val HW_PRODUCT: CInt = 27

public val HW_MAXID: CInt = 28

public val USER_CS_PATH: CInt = 1

public val USER_BC_BASE_MAX: CInt = 2

public val USER_BC_DIM_MAX: CInt = 3

public val USER_BC_SCALE_MAX: CInt = 4

public val USER_BC_STRING_MAX: CInt = 5

public val USER_COLL_WEIGHTS_MAX: CInt = 6

public val USER_EXPR_NEST_MAX: CInt = 7

public val USER_LINE_MAX: CInt = 8

public val USER_RE_DUP_MAX: CInt = 9

public val USER_POSIX2_VERSION: CInt = 10

public val USER_POSIX2_C_BIND: CInt = 11

public val USER_POSIX2_C_DEV: CInt = 12

public val USER_POSIX2_CHAR_TERM: CInt = 13

public val USER_POSIX2_FORT_DEV: CInt = 14

public val USER_POSIX2_FORT_RUN: CInt = 15

public val USER_POSIX2_LOCALEDEF: CInt = 16

public val USER_POSIX2_SW_DEV: CInt = 17

public val USER_POSIX2_UPE: CInt = 18

public val USER_STREAM_MAX: CInt = 19

public val USER_TZNAME_MAX: CInt = 20

public val USER_MAXID: CInt = 21

public val CTL_DEBUG_NAME: CInt = 0

public val CTL_DEBUG_VALUE: CInt = 1

public val CTL_DEBUG_MAXID: CInt = 20

public val PRIO_DARWIN_THREAD: CInt = 3

public val PRIO_DARWIN_PROCESS: CInt = 4

public val PRIO_DARWIN_BG: CInt = 0x1000

public val PRIO_DARWIN_NONUI: CInt = 0x1001

public val SEM_FAILED: CInt? = (-1).toInt()

public val AI_PASSIVE: CInt = 0x00000001

public val AI_CANONNAME: CInt = 0x00000002

public val AI_NUMERICHOST: CInt = 0x00000004

public val AI_NUMERICSERV: CInt = 0x00001000

public val AI_MASK: CInt = AI_PASSIVE or AI_CANONNAME or AI_NUMERICHOST or AI_NUMERICSERV or AI_ADDRCONFIG

public val AI_ALL: CInt = 0x00000100

public val AI_V4MAPPED_CFG: CInt = 0x00000200

public val AI_ADDRCONFIG: CInt = 0x00000400

public val AI_V4MAPPED: CInt = 0x00000800

public val AI_DEFAULT: CInt = AI_V4MAPPED_CFG or AI_ADDRCONFIG

public val AI_UNUSABLE: CInt = 0x10000000

public val SIGEV_NONE: CInt = 0

public val SIGEV_SIGNAL: CInt = 1

public val SIGEV_THREAD: CInt = 3

public val AIO_CANCELED: CInt = 2

public val AIO_NOTCANCELED: CInt = 4

public val AIO_ALLDONE: CInt = 1

public val AIO_LISTIO_MAX: CInt = 16

public val LIO_NOP: CInt = 0

public val LIO_WRITE: CInt = 2

public val LIO_READ: CInt = 1

public val LIO_WAIT: CInt = 2

public val LIO_NOWAIT: CInt = 1

public val WEXITED: CInt = 0x00000004

public val WSTOPPED1: CInt = 0x00000008

public val WCONTINUED: CInt = 0x00000010

public val WNOWAIT: CInt = 0x00000020

public val P_ALL: IdtypeT = 0u

public val P_PID: IdtypeT = 1u

public val P_PGID: IdtypeT = 2u

public val UTIME_OMIT: CLong = -2L

public val UTIME_NOW: CLong = -1L

public val XATTR_NOFOLLOW: CInt = 0x0001

public val XATTR_CREATE: CInt = 0x0002

public val XATTR_REPLACE: CInt = 0x0004

public val XATTR_NOSECURITY: CInt = 0x0008

public val XATTR_NODEFAULT: CInt = 0x0010

public val XATTR_SHOWCOMPRESSION: CInt = 0x0020

public val NET_RT_IFLIST2: CInt = 0x0006

// net/route.h
public val RTF_DELCLONE: CInt = 0x80

public val RTF_CLONING: CInt = 0x100

public val RTF_XRESOLVE: CInt = 0x200

public val RTF_LLINFO: CInt = 0x400

public val RTF_NOIFREF: CInt = 0x2000

public val RTF_PRCLONING: CInt = 0x10000

public val RTF_WASCLONED: CInt = 0x20000

public val RTF_PROTO3: CInt = 0x40000

public val RTF_PINNED: CInt = 0x100000

public val RTF_LOCAL: CInt = 0x200000

public val RTF_BROADCAST: CInt = 0x400000

public val RTF_MULTICAST: CInt = 0x800000

public val RTF_IFSCOPE: CInt = 0x1000000

public val RTF_CONDEMNED: CInt = 0x2000000

public val RTF_IFREF: CInt = 0x4000000

public val RTF_PROXY: CInt = 0x8000000.toInt()

public val RTF_ROUTER: CInt = 0x10000000

public val RTF_DEAD: CInt = 0x20000000

public val RTF_GLOBAL: CInt = 0x40000000

public val RTM_VERSION: CInt = 5

// Message types
public val RTM_LOCK: CInt = 0x8

public val RTM_OLDADD: CInt = 0x9

public val RTM_OLDDEL: CInt = 0xa

public val RTM_RESOLVE: CInt = 0xb

public val RTM_NEWADDR: CInt = 0xc

public val RTM_DELADDR: CInt = 0xd

public val RTM_IFINFO: CInt = 0xe

public val RTM_NEWMADDR: CInt = 0xf

public val RTM_DELMADDR: CInt = 0x10

public val RTM_IFINFO2: CInt = 0x12

public val RTM_NEWMADDR2: CInt = 0x13

public val RTM_GET2: CInt = 0x14

// Bitmask values for rtmInits and rmxLocks.
public val RTV_MTU: CInt = 0x1

public val RTV_HOPCOUNT: CInt = 0x2

public val RTV_EXPIRE: CInt = 0x4

public val RTV_RPIPE: CInt = 0x8

public val RTV_SPIPE: CInt = 0x10

public val RTV_SSTHRESH: CInt = 0x20

public val RTV_RTT: CInt = 0x40

public val RTV_RTTVAR: CInt = 0x80

public val RTAX_MAX: CInt = 8

public val KERN_PROCARGS2: CInt = 49

public val PROC_PIDTASKALLINFO: CInt = 2

public val PROC_PIDTBSDINFO: CInt = 3

public val PROC_PIDTASKINFO: CInt = 4

public val PROC_PIDTHREADINFO: CInt = 5

public val PROC_PIDVNODEPATHINFO: CInt = 9

public val PROC_PIDPATHINFO_MAXSIZE: CInt = 4096

public val PROC_PIDLISTFDS: CInt = 1

public val PROC_PIDLISTFD_SIZE: CInt = 0

public val PROX_FDTYPE_ATALK: CInt = 0

public val PROX_FDTYPE_VNODE: CInt = 1

public val PROX_FDTYPE_SOCKET: CInt = 2

public val PROX_FDTYPE_PSHM: CInt = 3

public val PROX_FDTYPE_PSEM: CInt = 4

public val PROX_FDTYPE_KQUEUE: CInt = 5

public val PROX_FDTYPE_PIPE: CInt = 6

public val PROX_FDTYPE_FSEVENTS: CInt = 7

public val PROX_FDTYPE_NETPOLICY: CInt = 9

public val PROX_FDTYPE_CHANNEL: CInt = 10

public val PROX_FDTYPE_NEXUS: CInt = 11

public val PROC_CSM_ALL: CUint = 0x0001u

public val PROC_CSM_NOSMT: CUint = 0x0002u

public val PROC_CSM_TECS: CUint = 0x0004u

public val MAXCOMLEN: Int = 16

public val MAXTHREADNAMESIZE: Int = 64

public val XUCRED_VERSION: CUint = 0u

public val LC_SEGMENT: UInt = 0x1u

public val LC_SEGMENT_64: UInt = 0x19u

public val MH_MAGIC: UInt = 0xfeedfaceu

public val MH_MAGIC_64: UInt = 0xfeedfacfu

// net/ifUtun.h
public val UTUN_OPT_FLAGS: CInt = 1

public val UTUN_OPT_IFNAME: CInt = 2

// net/bpf.h
public val DLT_NULL: CUint = 0u

// no link-layer encapsulation
public val DLT_EN10MB: CUint = 1u

// Ethernet (10Mb)
public val DLT_EN3MB: CUint = 2u

// Experimental Ethernet (3Mb)
public val DLT_AX25: CUint = 3u

// Amateur Radio AX.25
public val DLT_PRONET: CUint = 4u

// Proteon ProNET Token Ring
public val DLT_CHAOS: CUint = 5u

// Chaos
public val DLT_IEEE802: CUint = 6u

// IEEE 802 Networks
public val DLT_ARCNET: CUint = 7u

// ARCNET
public val DLT_SLIP: CUint = 8u

// Serial Line IP
public val DLT_PPP: CUint = 9u

// Point-to-point Protocol
public val DLT_FDDI: CUint = 10u

// FDDI
public val DLT_ATM_RFC1483: CUint = 11u

// LLC/SNAP encapsulated atm
public val DLT_RAW: CUint = 12u

// raw IP
public val DLT_LOOP: CUint = 108u

// https://github.com/apple/darwin-xnu/blob/HEAD/bsd/net/bpf.h#L100
// sizeof(i32)
public val BPF_ALIGNMENT: CInt = 4

// sys/mount.h
public val MNT_NODEV: CInt = 0x00000010

public val MNT_UNION: CInt = 0x00000020

public val MNT_CPROTECT: CInt = 0x00000080

// MAC labeled / "quarantined" flag
public val MNT_QUARANTINE: CInt = 0x00000400

// Flags set by internal operations.
public val MNT_LOCAL: CInt = 0x00001000

public val MNT_QUOTA: CInt = 0x00002000

public val MNT_ROOTFS: CInt = 0x00004000

public val MNT_DOVOLFS: CInt = 0x00008000

public val MNT_DONTBROWSE: CInt = 0x00100000

public val MNT_IGNORE_OWNERSHIP: CInt = 0x00200000

public val MNT_AUTOMOUNTED: CInt = 0x00400000

public val MNT_JOURNALED: CInt = 0x00800000

public val MNT_NOUSERXATTR: CInt = 0x01000000

public val MNT_DEFWRITE: CInt = 0x02000000

public val MNT_MULTILABEL: CInt = 0x04000000

public val MNT_NOATIME: CInt = 0x10000000

public val MNT_SNAPSHOT: CInt = 0x40000000

// External filesystem command modifier flags.
public val MNT_NOBLOCK: CInt = 0x00020000

// sys/spawn.h:
// DIFF(main): changed to `cShort` in f62eb023ab
public val POSIX_SPAWN_RESETIDS: CInt = 0x0001

public val POSIX_SPAWN_SETPGROUP: CInt = 0x0002

public val POSIX_SPAWN_SETSIGDEF: CInt = 0x0004

public val POSIX_SPAWN_SETSIGMASK: CInt = 0x0008

public val POSIX_SPAWN_SETEXEC: CInt = 0x0040

public val POSIX_SPAWN_START_SUSPENDED: CInt = 0x0080

public val POSIX_SPAWN_CLOEXEC_DEFAULT: CInt = 0x4000

// sys/ipc.h:
public val IPC_CREAT: CInt = 0x200

public val IPC_EXCL: CInt = 0x400

public val IPC_NOWAIT: CInt = 0x800

public val IPC_PRIVATE: KeyT = 0

public val IPC_RMID: CInt = 0

public val IPC_SET: CInt = 1

public val IPC_STAT: CInt = 2

public val IPC_R: CInt = 0x100

public val IPC_W: CInt = 0x80

public val IPC_M: CInt = 0x1000

// sys/sem.h
public val SEM_UNDO: CInt = 4096

public val GETNCNT: CInt = 3

public val GETPID: CInt = 4

public val GETVAL: CInt = 5

public val GETALL: CInt = 6

public val GETZCNT: CInt = 7

public val SETVAL: CInt = 8

public val SETALL: CInt = 9

// sys/shm.h
public val SHM_RDONLY: CInt = 0x1000

public val SHM_RND: CInt = 0x2000

public val SHMLBA: CInt = 16 * 1024

public val SHMLBA1: CInt = 4096

public val SHM_R: CInt = IPC_R

public val SHM_W: CInt = IPC_W

// Flags for chflags(2)
public val UF_SETTABLE: CUint = 0x0000ffffu

public val UF_NODUMP: CUint = 0x00000001u

public val UF_IMMUTABLE: CUint = 0x00000002u

public val UF_APPEND: CUint = 0x00000004u

public val UF_OPAQUE: CUint = 0x00000008u

public val UF_COMPRESSED: CUint = 0x00000020u

public val UF_TRACKED: CUint = 0x00000040u

public val SF_SETTABLE: CUint = 0x3fff0000u

public val SF_ARCHIVED: CUint = 0x00010000u

public val SF_IMMUTABLE: CUint = 0x00020000u

public val SF_APPEND: CUint = 0x00040000u

public val UF_HIDDEN: CUint = 0x00008000u

// <sys/timex.h>
public val NTP_API: CInt = 4

public val MAXPHASE: CLong = 500000000L

public val MAXFREQ: CLong = 500000L

public val MINSEC: CInt = 256

public val MAXSEC: CInt = 2048

public val NANOSECOND: CLong = 1000000000L

public val SCALE_PPM: CInt = 65

public val MAXTC: CInt = 10

public val MOD_OFFSET: CUint = 0x0001u

public val MOD_FREQUENCY: CUint = 0x0002u

public val MOD_MAXERROR: CUint = 0x0004u

public val MOD_ESTERROR: CUint = 0x0008u

public val MOD_STATUS: CUint = 0x0010u

public val MOD_TIMECONST: CUint = 0x0020u

public val MOD_PPSMAX: CUint = 0x0040u

public val MOD_TAI: CUint = 0x0080u

public val MOD_MICRO: CUint = 0x1000u

public val MOD_NANO: CUint = 0x2000u

public val MOD_CLKB: CUint = 0x4000u

public val MOD_CLKA: CUint = 0x8000u

public val STA_PLL: CInt = 0x0001

public val STA_PPSFREQ: CInt = 0x0002

public val STA_PPSTIME: CInt = 0x0004

public val STA_FLL: CInt = 0x0008

public val STA_INS: CInt = 0x0010

public val STA_DEL: CInt = 0x0020

public val STA_UNSYNC: CInt = 0x0040

public val STA_FREQHOLD: CInt = 0x0080

public val STA_PPSSIGNAL: CInt = 0x0100

public val STA_PPSJITTER: CInt = 0x0200

public val STA_PPSWANDER: CInt = 0x0400

public val STA_PPSERROR: CInt = 0x0800

public val STA_CLOCKERR: CInt = 0x1000

public val STA_NANO: CInt = 0x2000

public val STA_MODE: CInt = 0x4000

public val STA_CLK: CInt = 0x8000

public val STA_RONLY: CInt = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK

public val TIME_OK: CInt = 0

public val TIME_INS: CInt = 1

public val TIME_DEL: CInt = 2

public val TIME_OOP: CInt = 3

public val TIME_WAIT: CInt = 4

public val TIME_ERROR: CInt = 5

// <sys/mount.h>
public val MNT_WAIT: CInt = 1

public val MNT_NOWAIT: CInt = 2

// <mach/threadPolicy.h>
public val THREAD_STANDARD_POLICY: CInt = 1

public val THREAD_STANDARD_POLICY_COUNT: CInt = 0

public val THREAD_EXTENDED_POLICY: CInt = 1

public val THREAD_TIME_CONSTRAINT_POLICY: CInt = 2

public val THREAD_PRECEDENCE_POLICY: CInt = 3

public val THREAD_AFFINITY_POLICY: CInt = 4

public val THREAD_AFFINITY_TAG_NULL: CInt = 0

public val THREAD_BACKGROUND_POLICY: CInt = 5

public val THREAD_BACKGROUND_POLICY_DARWIN_BG: CInt = 0x1000

public val THREAD_LATENCY_QOS_POLICY: CInt = 7

public val THREAD_THROUGHPUT_QOS_POLICY: CInt = 8

// <mach/threadInfo.h>
public val TH_STATE_RUNNING: CInt = 1

public val TH_STATE_STOPPED: CInt = 2

public val TH_STATE_WAITING: CInt = 3

public val TH_STATE_UNINTERRUPTIBLE: CInt = 4

public val TH_STATE_HALTED: CInt = 5

public val TH_FLAGS_SWAPPED: CInt = 0x1

public val TH_FLAGS_IDLE: CInt = 0x2

public val TH_FLAGS_GLOBAL_FORCED_IDLE: CInt = 0x4

public val THREAD_BASIC_INFO: CInt = 3

public val THREAD_IDENTIFIER_INFO: CInt = 4

public val THREAD_EXTENDED_INFO: CInt = 5

// CommonCrypto/CommonCryptoError.h
public val K_CC_SUCCESS: Int = 0

public val K_CC_PARAM_ERROR: Int = -4300

public val K_CC_BUFFER_TOO_SMALL: Int = -4301

public val K_CC_MEMORY_FAILURE: Int = -4302

public val K_CC_ALIGNMENT_ERROR: Int = -4303

public val K_CC_DECODE_ERROR: Int = -4304

public val K_CC_UNIMPLEMENTED: Int = -4305

public val K_CC_OVERFLOW: Int = -4306

public val K_CCRNG_FAILURE: Int = -4307

public val K_CC_UNSPECIFIED_ERROR: Int = -4308

public val K_CC_CALL_SEQUENCE_ERROR: Int = -4309

public val K_CC_KEY_SIZE_ERROR: Int = -4310

public val K_CC_INVALID_KEY: Int = -4311

// mach/hostInfo.h
public val HOST_LOAD_INFO: Int = 1

public val HOST_VM_INFO: Int = 2

public val HOST_CPU_LOAD_INFO: Int = 3

public val HOST_VM_INFO64: Int = 4

public val HOST_EXTMOD_INFO64: Int = 5

public val HOST_EXPIRED_TASK_INFO: Int = 6

// mach/vmStatistics.h
public val VM_PAGE_QUERY_PAGE_PRESENT: Int = 0x1

public val VM_PAGE_QUERY_PAGE_FICTITIOUS: Int = 0x2

public val VM_PAGE_QUERY_PAGE_REF: Int = 0x4

public val VM_PAGE_QUERY_PAGE_DIRTY: Int = 0x8

public val VM_PAGE_QUERY_PAGE_PAGED_OUT: Int = 0x10

public val VM_PAGE_QUERY_PAGE_COPIED: Int = 0x20

public val VM_PAGE_QUERY_PAGE_SPECULATIVE: Int = 0x40

public val VM_PAGE_QUERY_PAGE_EXTERNAL: Int = 0x80

public val VM_PAGE_QUERY_PAGE_CS_VALIDATED: Int = 0x100

public val VM_PAGE_QUERY_PAGE_CS_TAINTED: Int = 0x200

public val VM_PAGE_QUERY_PAGE_CS_NX: Int = 0x400

// mach/taskInfo.h
public val TASK_THREAD_TIMES_INFO: UInt = 3u

public val HOST_CPU_LOAD_INFO_COUNT: UInt = 4u

public val MACH_TASK_BASIC_INFO: UInt = 20u

public val MACH_PORT_NULL: Int = 0

public val RUSAGE_INFO_V0: CInt = 0

public val RUSAGE_INFO_V1: CInt = 1

public val RUSAGE_INFO_V2: CInt = 2

public val RUSAGE_INFO_V3: CInt = 3

public val RUSAGE_INFO_V4: CInt = 4

// copyfile.h
public val COPYFILE_ACL: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 0

public val COPYFILE_STAT: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 1

public val COPYFILE_XATTR: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 2

public val COPYFILE_DATA: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 3

public val COPYFILE_SECURITY: io.github.kotlinmania.libc.CopyfileFlagsT = COPYFILE_STAT or COPYFILE_ACL

public val COPYFILE_METADATA: io.github.kotlinmania.libc.CopyfileFlagsT = COPYFILE_SECURITY or COPYFILE_XATTR

public val COPYFILE_RECURSIVE: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 15

public val COPYFILE_CHECK: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 16

public val COPYFILE_EXCL: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 17

public val COPYFILE_NOFOLLOW_SRC: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 18

public val COPYFILE_NOFOLLOW_DST: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 19

public val COPYFILE_MOVE: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 20

public val COPYFILE_UNLINK: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 21

public val COPYFILE_NOFOLLOW: io.github.kotlinmania.libc.CopyfileFlagsT = COPYFILE_NOFOLLOW_SRC or COPYFILE_NOFOLLOW_DST

public val COPYFILE_PACK: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 22

public val COPYFILE_UNPACK: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 23

public val COPYFILE_CLONE: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 24

public val COPYFILE_CLONE_FORCE: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 25

public val COPYFILE_RUN_IN_PLACE: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 26

public val COPYFILE_DATA_SPARSE: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 27

public val COPYFILE_PRESERVE_DST_TRACKED: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 28

public val COPYFILE_VERBOSE: io.github.kotlinmania.libc.CopyfileFlagsT = 1u shl 30

public val COPYFILE_RECURSE_ERROR: CInt = 0

public val COPYFILE_RECURSE_FILE: CInt = 1

public val COPYFILE_RECURSE_DIR: CInt = 2

public val COPYFILE_RECURSE_DIR_CLEANUP: CInt = 3

public val COPYFILE_COPY_DATA: CInt = 4

public val COPYFILE_COPY_XATTR: CInt = 5

public val COPYFILE_START: CInt = 1

public val COPYFILE_FINISH: CInt = 2

public val COPYFILE_ERR: CInt = 3

public val COPYFILE_PROGRESS: CInt = 4

public val COPYFILE_CONTINUE: CInt = 0

public val COPYFILE_SKIP: CInt = 1

public val COPYFILE_QUIT: CInt = 2

public val COPYFILE_STATE_SRC_FD: CInt = 1

public val COPYFILE_STATE_SRC_FILENAME: CInt = 2

public val COPYFILE_STATE_DST_FD: CInt = 3

public val COPYFILE_STATE_DST_FILENAME: CInt = 4

public val COPYFILE_STATE_QUARANTINE: CInt = 5

public val COPYFILE_STATE_STATUS_CB: CInt = 6

public val COPYFILE_STATE_STATUS_CTX: CInt = 7

public val COPYFILE_STATE_COPIED: CInt = 8

public val COPYFILE_STATE_XATTRNAME: CInt = 9

public val COPYFILE_STATE_WAS_CLONED: CInt = 10

public val COPYFILE_STATE_SRC_BSIZE: CInt = 11

public val COPYFILE_STATE_DST_BSIZE: CInt = 12

public val COPYFILE_STATE_BSIZE: CInt = 13

// <sys/attr.h>
public val ATTR_BIT_MAP_COUNT: CUshort = 5u

public val FSOPT_NOFOLLOW: UInt = 0x1u

public val FSOPT_NOFOLLOW_ANY: UInt = 0x800u

public val FSOPT_REPORT_FULLSIZE: UInt = 0x4u

public val FSOPT_PACK_INVAL_ATTRS: UInt = 0x8u

public val FSOPT_ATTR_CMN_EXTENDED: UInt = 0x20u

public val FSOPT_RETURN_REALDEV: UInt = 0x200u

public val ATTR_CMN_NAME: AttrgroupT = 0x00000001u

public val ATTR_CMN_DEVID: AttrgroupT = 0x00000002u

public val ATTR_CMN_FSID: AttrgroupT = 0x00000004u

public val ATTR_CMN_OBJTYPE: AttrgroupT = 0x00000008u

public val ATTR_CMN_OBJTAG: AttrgroupT = 0x00000010u

public val ATTR_CMN_OBJID: AttrgroupT = 0x00000020u

public val ATTR_CMN_OBJPERMANENTID: AttrgroupT = 0x00000040u

public val ATTR_CMN_PAROBJID: AttrgroupT = 0x00000080u

public val ATTR_CMN_SCRIPT: AttrgroupT = 0x00000100u

public val ATTR_CMN_CRTIME: AttrgroupT = 0x00000200u

public val ATTR_CMN_MODTIME: AttrgroupT = 0x00000400u

public val ATTR_CMN_CHGTIME: AttrgroupT = 0x00000800u

public val ATTR_CMN_ACCTIME: AttrgroupT = 0x00001000u

public val ATTR_CMN_BKUPTIME: AttrgroupT = 0x00002000u

public val ATTR_CMN_FNDRINFO: AttrgroupT = 0x00004000u

public val ATTR_CMN_OWNERID: AttrgroupT = 0x00008000u

public val ATTR_CMN_GRPID: AttrgroupT = 0x00010000u

public val ATTR_CMN_ACCESSMASK: AttrgroupT = 0x00020000u

public val ATTR_CMN_FLAGS: AttrgroupT = 0x00040000u

public val ATTR_CMN_GEN_COUNT: AttrgroupT = 0x00080000u

public val ATTR_CMN_DOCUMENT_ID: AttrgroupT = 0x00100000u

public val ATTR_CMN_USERACCESS: AttrgroupT = 0x00200000u

public val ATTR_CMN_EXTENDED_SECURITY: AttrgroupT = 0x00400000u

public val ATTR_CMN_UUID: AttrgroupT = 0x00800000u

public val ATTR_CMN_GRPUUID: AttrgroupT = 0x01000000u

public val ATTR_CMN_FILEID: AttrgroupT = 0x02000000u

public val ATTR_CMN_PARENTID: AttrgroupT = 0x04000000u

public val ATTR_CMN_FULLPATH: AttrgroupT = 0x08000000u

public val ATTR_CMN_ADDEDTIME: AttrgroupT = 0x10000000u

public val ATTR_CMN_DATA_PROTECT_FLAGS: AttrgroupT = 0x40000000u

public val ATTR_CMN_RETURNED_ATTRS: AttrgroupT = 0x80000000u

public val ATTR_VOL_FSTYPE: AttrgroupT = 0x00000001u

public val ATTR_VOL_SIGNATURE: AttrgroupT = 0x00000002u

public val ATTR_VOL_SIZE: AttrgroupT = 0x00000004u

public val ATTR_VOL_SPACEFREE: AttrgroupT = 0x00000008u

public val ATTR_VOL_SPACEAVAIL: AttrgroupT = 0x00000010u

public val ATTR_VOL_MINALLOCATION: AttrgroupT = 0x00000020u

public val ATTR_VOL_ALLOCATIONCLUMP: AttrgroupT = 0x00000040u

public val ATTR_VOL_IOBLOCKSIZE: AttrgroupT = 0x00000080u

public val ATTR_VOL_OBJCOUNT: AttrgroupT = 0x00000100u

public val ATTR_VOL_FILECOUNT: AttrgroupT = 0x00000200u

public val ATTR_VOL_DIRCOUNT: AttrgroupT = 0x00000400u

public val ATTR_VOL_MAXOBJCOUNT: AttrgroupT = 0x00000800u

public val ATTR_VOL_MOUNTPOINT: AttrgroupT = 0x00001000u

public val ATTR_VOL_NAME: AttrgroupT = 0x00002000u

public val ATTR_VOL_MOUNTFLAGS: AttrgroupT = 0x00004000u

public val ATTR_VOL_MOUNTEDDEVICE: AttrgroupT = 0x00008000u

public val ATTR_VOL_ENCODINGSUSED: AttrgroupT = 0x00010000u

public val ATTR_VOL_CAPABILITIES: AttrgroupT = 0x00020000u

public val ATTR_VOL_UUID: AttrgroupT = 0x00040000u

public val ATTR_VOL_SPACEUSED: AttrgroupT = 0x00800000u

public val ATTR_VOL_QUOTA_SIZE: AttrgroupT = 0x10000000u

public val ATTR_VOL_RESERVED_SIZE: AttrgroupT = 0x20000000u

public val ATTR_VOL_ATTRIBUTES: AttrgroupT = 0x40000000u

public val ATTR_VOL_INFO: AttrgroupT = 0x80000000u

public val ATTR_DIR_LINKCOUNT: AttrgroupT = 0x00000001u

public val ATTR_DIR_ENTRYCOUNT: AttrgroupT = 0x00000002u

public val ATTR_DIR_MOUNTSTATUS: AttrgroupT = 0x00000004u

public val ATTR_DIR_ALLOCSIZE: AttrgroupT = 0x00000008u

public val ATTR_DIR_IOBLOCKSIZE: AttrgroupT = 0x00000010u

public val ATTR_DIR_DATALENGTH: AttrgroupT = 0x00000020u

public val ATTR_FILE_LINKCOUNT: AttrgroupT = 0x00000001u

public val ATTR_FILE_TOTALSIZE: AttrgroupT = 0x00000002u

public val ATTR_FILE_ALLOCSIZE: AttrgroupT = 0x00000004u

public val ATTR_FILE_IOBLOCKSIZE: AttrgroupT = 0x00000008u

public val ATTR_FILE_DEVTYPE: AttrgroupT = 0x00000020u

public val ATTR_FILE_FORKCOUNT: AttrgroupT = 0x00000080u

public val ATTR_FILE_FORKLIST: AttrgroupT = 0x00000100u

public val ATTR_FILE_DATALENGTH: AttrgroupT = 0x00000200u

public val ATTR_FILE_DATAALLOCSIZE: AttrgroupT = 0x00000400u

public val ATTR_FILE_RSRCLENGTH: AttrgroupT = 0x00001000u

public val ATTR_FILE_RSRCALLOCSIZE: AttrgroupT = 0x00002000u

public val ATTR_CMNEXT_RELPATH: AttrgroupT = 0x00000004u

public val ATTR_CMNEXT_PRIVATESIZE: AttrgroupT = 0x00000008u

public val ATTR_CMNEXT_LINKID: AttrgroupT = 0x00000010u

public val ATTR_CMNEXT_NOFIRMLINKPATH: AttrgroupT = 0x00000020u

public val ATTR_CMNEXT_REALDEVID: AttrgroupT = 0x00000040u

public val ATTR_CMNEXT_REALFSID: AttrgroupT = 0x00000080u

public val ATTR_CMNEXT_CLONEID: AttrgroupT = 0x00000100u

public val ATTR_CMNEXT_EXT_FLAGS: AttrgroupT = 0x00000200u

public val ATTR_CMNEXT_RECURSIVE_GENCOUNT: AttrgroupT = 0x00000400u

public val DIR_MNTSTATUS_MNTPOINT: UInt = 0x1u

public val VOL_CAPABILITIES_FORMAT: Int = 0

public val VOL_CAPABILITIES_INTERFACES: Int = 1

public val VOL_CAP_FMT_PERSISTENTOBJECTIDS: AttrgroupT = 0x00000001u

public val VOL_CAP_FMT_SYMBOLICLINKS: AttrgroupT = 0x00000002u

public val VOL_CAP_FMT_HARDLINKS: AttrgroupT = 0x00000004u

public val VOL_CAP_FMT_JOURNAL: AttrgroupT = 0x00000008u

public val VOL_CAP_FMT_JOURNAL_ACTIVE: AttrgroupT = 0x00000010u

public val VOL_CAP_FMT_NO_ROOT_TIMES: AttrgroupT = 0x00000020u

public val VOL_CAP_FMT_SPARSE_FILES: AttrgroupT = 0x00000040u

public val VOL_CAP_FMT_ZERO_RUNS: AttrgroupT = 0x00000080u

public val VOL_CAP_FMT_CASE_SENSITIVE: AttrgroupT = 0x00000100u

public val VOL_CAP_FMT_CASE_PRESERVING: AttrgroupT = 0x00000200u

public val VOL_CAP_FMT_FAST_STATFS: AttrgroupT = 0x00000400u

public val VOL_CAP_FMT_2TB_FILESIZE: AttrgroupT = 0x00000800u

public val VOL_CAP_FMT_OPENDENYMODES: AttrgroupT = 0x00001000u

public val VOL_CAP_FMT_HIDDEN_FILES: AttrgroupT = 0x00002000u

public val VOL_CAP_FMT_PATH_FROM_ID: AttrgroupT = 0x00004000u

public val VOL_CAP_FMT_NO_VOLUME_SIZES: AttrgroupT = 0x00008000u

public val VOL_CAP_FMT_DECMPFS_COMPRESSION: AttrgroupT = 0x00010000u

public val VOL_CAP_FMT_64BIT_OBJECT_IDS: AttrgroupT = 0x00020000u

public val VOL_CAP_FMT_DIR_HARDLINKS: AttrgroupT = 0x00040000u

public val VOL_CAP_FMT_DOCUMENT_ID: AttrgroupT = 0x00080000u

public val VOL_CAP_FMT_WRITE_GENERATION_COUNT: AttrgroupT = 0x00100000u

public val VOL_CAP_FMT_NO_IMMUTABLE_FILES: AttrgroupT = 0x00200000u

public val VOL_CAP_FMT_NO_PERMISSIONS: AttrgroupT = 0x00400000u

public val VOL_CAP_FMT_SHARED_SPACE: AttrgroupT = 0x00800000u

public val VOL_CAP_FMT_VOL_GROUPS: AttrgroupT = 0x01000000u

public val VOL_CAP_FMT_SEALED: AttrgroupT = 0x02000000u

public val VOL_CAP_INT_SEARCHFS: AttrgroupT = 0x00000001u

public val VOL_CAP_INT_ATTRLIST: AttrgroupT = 0x00000002u

public val VOL_CAP_INT_NFSEXPORT: AttrgroupT = 0x00000004u

public val VOL_CAP_INT_READDIRATTR: AttrgroupT = 0x00000008u

public val VOL_CAP_INT_EXCHANGEDATA: AttrgroupT = 0x00000010u

public val VOL_CAP_INT_COPYFILE: AttrgroupT = 0x00000020u

public val VOL_CAP_INT_ALLOCATE: AttrgroupT = 0x00000040u

public val VOL_CAP_INT_VOL_RENAME: AttrgroupT = 0x00000080u

public val VOL_CAP_INT_ADVLOCK: AttrgroupT = 0x00000100u

public val VOL_CAP_INT_FLOCK: AttrgroupT = 0x00000200u

public val VOL_CAP_INT_EXTENDED_SECURITY: AttrgroupT = 0x00000400u

public val VOL_CAP_INT_USERACCESS: AttrgroupT = 0x00000800u

public val VOL_CAP_INT_MANLOCK: AttrgroupT = 0x00001000u

public val VOL_CAP_INT_NAMEDSTREAMS: AttrgroupT = 0x00002000u

public val VOL_CAP_INT_EXTENDED_ATTR: AttrgroupT = 0x00004000u

public val VOL_CAP_INT_CLONE: AttrgroupT = 0x00010000u

public val VOL_CAP_INT_SNAPSHOT: AttrgroupT = 0x00020000u

public val VOL_CAP_INT_RENAME_SWAP: AttrgroupT = 0x00040000u

public val VOL_CAP_INT_RENAME_EXCL: AttrgroupT = 0x00080000u

public val VOL_CAP_INT_RENAME_OPENFAIL: AttrgroupT = 0x00100000u

// os/clock.h
public val OS_CLOCK_MACH_ABSOLUTE_TIME: OsClockidT = 32u

// os/osSyncWaitOnAddress.h
public val OS_SYNC_WAIT_ON_ADDRESS_NONE: OsSyncWaitOnAddressFlagsT = 0x00000000u

public val OS_SYNC_WAIT_ON_ADDRESS_SHARED: OsSyncWaitOnAddressFlagsT = 0x00000001u

public val OS_SYNC_WAKE_BY_ADDRESS_NONE: OsSyncWakeByAddressFlagsT = 0x00000000u

public val OS_SYNC_WAKE_BY_ADDRESS_SHARED: OsSyncWakeByAddressFlagsT = 0x00000001u

// <proc.h>
/**
 * Process being created by fork.
 */
public val SIDL: UInt = 1u

/**
 * Currently runnable.
 */
public val SRUN: UInt = 2u

/**
 * Sleeping on an address.
 */
public val SSLEEP: UInt = 3u

/**
 * Process debugging or suspension.
 */
public val SSTOP: UInt = 4u

/**
 * Awaiting collection by parent.
 */
public val SZOMB: UInt = 5u

// sys/vsock.h
public val VMADDR_CID_ANY: CUint = 0xFFFFFFFFu

public val VMADDR_CID_HYPERVISOR: CUint = 0u

public val VMADDR_CID_RESERVED: CUint = 1u

public val VMADDR_CID_HOST: CUint = 2u

public val VMADDR_PORT_ANY: CUint = 0xFFFFFFFFu

public fun darwinAlign32(p: Int): Int {
    val DARWIN_ALIGNBYTES32: Int = 0 - 1
    return (p + DARWIN_ALIGNBYTES32) and DARWIN_ALIGNBYTES32.inv()
}

public val THREAD_EXTENDED_POLICY_COUNT: MachMsgTypeNumberT = (0 / 0).toUInt()

public val THREAD_TIME_CONSTRAINT_POLICY_COUNT: MachMsgTypeNumberT = (0 / 0).toUInt()

public val THREAD_PRECEDENCE_POLICY_COUNT: MachMsgTypeNumberT = (0 / 0).toUInt()

public val THREAD_AFFINITY_POLICY_COUNT: MachMsgTypeNumberT = (0 / 0).toUInt()

public val THREAD_BACKGROUND_POLICY_COUNT: MachMsgTypeNumberT = (0 / 0).toUInt()

public val THREAD_LATENCY_QOS_POLICY_COUNT: MachMsgTypeNumberT = (0 / 0).toUInt()

public val THREAD_THROUGHPUT_QOS_POLICY_COUNT: MachMsgTypeNumberT = (0 / 0).toUInt()

public val THREAD_BASIC_INFO_COUNT: MachMsgTypeNumberT = (0 / 0).toUInt()

public val THREAD_IDENTIFIER_INFO_COUNT: MachMsgTypeNumberT = (0 / 0).toUInt()

public val THREAD_EXTENDED_INFO_COUNT: MachMsgTypeNumberT = (0 / 0).toUInt()

public val TASK_THREAD_TIMES_INFO_COUNT: UInt = (0 / 0).toUInt()

public val MACH_TASK_BASIC_INFO_COUNT: UInt = (0 / 0).toUInt()

public val HOST_VM_INFO64_COUNT: MachMsgTypeNumberT = (0 / 0).toUInt()

// bsd/net/ifMib.h
/**
 * Non-interface-specific
 */
public val IFMIB_SYSTEM: CInt = 1

/**
 * Per-interface data table
 */
public val IFMIB_IFDATA: CInt = 2

/**
 * All interfaces data at once
 */
public val IFMIB_IFALLDATA: CInt = 3

/**
 * Generic stats for all kinds of ifaces
 */
public val IFDATA_GENERAL: CInt = 1

/**
 * Specific to the type of interface
 */
public val IFDATA_LINKSPECIFIC: CInt = 2

/**
 * Addresses assigned to interface
 */
public val IFDATA_ADDRS: CInt = 3

/**
 * Multicast addresses assigned to interface
 */
public val IFDATA_MULTIADDRS: CInt = 4

/**
 * Number of interfaces configured
 */
public val IFMIB_IFCOUNT: CInt = 1

/**
 * Functions not specific to a type of iface
 */
public val NETLINK_GENERIC: CInt = 0

public val DOT3COMPLIANCE_STATS: CInt = 1

public val DOT3COMPLIANCE_COLLS: CInt = 2

// kernControl.h
public val MAX_KCTL_NAME: Int = 96

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if ((cmsg == null)) {
        return CMSG_FIRSTHDR(mhdr)
    }
    val cmsgLen = (cmsg!!.cmsgLen).toInt()
    val next = ((cmsg)?.hashCode()?.toLong() ?: 0L).toInt() + DARWIN_ALIGN32(cmsgLen)
    val max = (mhdr!!.msgControl).toInt() + (mhdr!!.msgControllen).toInt()
    return if (next + DARWIN_ALIGN32(0) > max) {
        null
    } else {
        null
    }
}

public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    return ((((cmsg)?.hashCode()?.toLong() ?: 0L).toUByte()))?.let { COpaquePointer(it.hashCode().toLong() + (DARWIN_ALIGN32(0)).toLong()) }
}

public fun cmsgSpace(length: CUint): CUint {
    return (DARWIN_ALIGN32(0) + DARWIN_ALIGN32(length.toInt())).toUInt()
}

public fun cmsgLen(length: CUint): CUint {
    return (DARWIN_ALIGN32(0) + length.toInt()).toUInt()
}

public fun vmMakeTag(id: UByte): UInt {
    return (id.toUInt()) shl 24u.toInt()
}

public fun wstopsig(status: CInt): CInt {
    return status shr 8
}

public fun wstatus(status: CInt): CInt {
    return status and 0x7f
}

public fun wifcontinued(status: CInt): Boolean {
    return WSTATUS(status) == WSTOPPED && WSTOPSIG(status) == 0x13
}

public fun wifsignaled(status: CInt): Boolean {
    return WSTATUS(status) != WSTOPPED && WSTATUS(status) != 0
}

public fun wifstopped(status: CInt): Boolean {
    return WSTATUS(status) == WSTOPPED && WSTOPSIG(status) != 0x13
}

public fun makedev(major: Int, minor: Int): DevT {
    return (major shl 24) or minor
}

public fun major(dev: DevT): Int {
    return (dev shr 24) and 0xff
}

public fun minor(dev: DevT): Int {
    return dev and 0xffffff
}

public expect fun setgrent()

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun semDestroy(sem: CInt?): CInt

public expect fun semInit(sem: CInt?, pshared: CInt, value: CUint): CInt

public expect fun aioRead(aiocbp: Aiocb?): CInt

public expect fun aioWrite(aiocbp: Aiocb?): CInt

public expect fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt

public expect fun aioError(aiocbp: Aiocb?): CInt

public expect fun aioReturn(aiocbp: Aiocb?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt

public expect fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt

public expect fun chflags(path: String?, flags: CUint): CInt

public expect fun fchflags(fd: CInt, flags: CUint): CInt

public expect fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

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

public expect fun asctime(tm: io.github.kotlinmania.libc.Tm?): COpaquePointer?

public expect fun ctime(clock: CLong?): COpaquePointer?

public expect fun getdate(datestr: String?): io.github.kotlinmania.libc.Tm?

public expect fun strptime(buf: String?, format: String?, timeptr: io.github.kotlinmania.libc.Tm?): COpaquePointer?

public expect fun asctimeR(tm: io.github.kotlinmania.libc.Tm?, result: COpaquePointer?): COpaquePointer?

public expect fun ctimeR(clock: CLong?, result: COpaquePointer?): COpaquePointer?

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt

public expect fun sysctlnametomib(name: String?, mibp: CInt?, sizep: SizeT?): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt

public expect fun shmOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun machAbsoluteTime(): ULong

public expect fun machTimebaseInfo(info: io.github.kotlinmania.libc.MachTimebaseInfo?): CInt

public expect fun machHostSelf(): MachPortT

public expect fun machThreadSelf(): MachPortT

public expect fun pthreadCondTimedwaitRelativeNp(cond: PthreadCondT?, lock: PthreadMutexT?, timeout: Timespec?): CInt

public expect fun pthreadAttrGetscope(attr: PthreadAttrT?, contentionscope: CInt?): CInt

public expect fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt

public expect fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt

public expect fun pthreadAttrSetscope(attr: PthreadAttrT?, contentionscope: CInt): CInt

public expect fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt

public expect fun pthreadSetnameNp(name: String?): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadMachThreadNp(thread: PthreadT): io.github.kotlinmania.libc.MachPortT

public expect fun pthreadFromMachThreadNp(port: io.github.kotlinmania.libc.MachPortT): PthreadT

public expect fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer?

public expect fun pthreadGetStacksizeNp(thread: PthreadT): SizeT

public expect fun pthreadMainNp(): CInt

public expect fun pthreadThreadidNp(thread: PthreadT, threadId: ULong?): CInt

public expect fun pthreadJitWriteProtectNp(enabled: CInt)

public expect fun pthreadJitWriteProtectSupportedNp(): CInt

// An array of pthreadJitWriteWithCallbackNp must declare
// the list of callbacks e.g.
// @linkSection= "__DATA_CONST,__pth_jit_func"
// static callbacks: [libc::pthreadJitWriteCallbackT; 2] = [nativeJitWriteCb,
// std::mem::reinterpret::<libc::pthreadJitWriteCallbackT>(std::ptr::null())];
// (a handy PTHREAD_JIT_WRITE_CALLBACK_NP macro for other languages).
public expect fun pthreadJitWriteWithCallbackNp(callback: io.github.kotlinmania.libc.PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt

public expect fun pthreadJitWriteFreezeCallbacksNp()

public expect fun pthreadCpuNumberNp(cpuNumberOut: SizeT?): CInt

// Available starting with macOS 14.4.
public expect fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt

public expect fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt

public expect fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt

public expect fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt

public expect fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt

public expect fun osUnfairLockLock(lock: OsUnfairLockT)

public expect fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean

public expect fun osUnfairLockUnlock(lock: OsUnfairLockT)

public expect fun osUnfairLockAssertOwner(lock: OsUnfairLockT)

public expect fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT)

public expect fun osLogCreate(subsystem: String?, category: String?): io.github.kotlinmania.libc.OsLogT

public expect fun osLogTypeEnabled(oslog: io.github.kotlinmania.libc.OsLogT, tpe: io.github.kotlinmania.libc.OsLogTypeT): Boolean

public expect fun osSignpostIdMakeWithPointer(log: io.github.kotlinmania.libc.OsLogT, ptr: COpaquePointer?): io.github.kotlinmania.libc.OsSignpostIdT

public expect fun osSignpostIdGenerate(log: io.github.kotlinmania.libc.OsLogT): io.github.kotlinmania.libc.OsSignpostIdT

public expect fun osSignpostEnabled(log: io.github.kotlinmania.libc.OsLogT): Boolean

public expect fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT

public expect fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: UInt?, getDefault: BooleanT?): KernReturnT

public expect fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: UInt?): KernReturnT

public expect fun error(): CInt?

public expect fun backtrace(buf: COpaquePointer?, sz: CInt): CInt

public expect fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer?

public expect fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt)

public expect fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt

public expect fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: ImageOffset?, size: CInt)

public expect fun backtraceAsync(array: COpaquePointer?, length: SizeT, taskId: UInt?): SizeT

public expect fun statfs(path: String?, buf: Statfs?): CInt

public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt

public expect fun kevent(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent?, nevents: CInt, timeout: Timespec?): CInt

public expect fun kevent64(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent64S?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent64S?, nevents: CInt, flags: CUint, timeout: Timespec?): CInt

public expect fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt

public expect fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt

public expect fun quotactl(special: String?, cmd: CInt, id: CInt, data: COpaquePointer?): CInt

public expect fun sethostname(name: String?, len: CInt): CInt

public expect fun sendfile(fd: CInt, s: CInt, offset: OffT, len: OffT?, hdtr: io.github.kotlinmania.libc.SfHdtr?, flags: CInt): CInt

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt

public expect fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT

public expect fun loginTty(fd: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT): CInt

public expect fun localeconvL(loc: LocaleT): Lconv?

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer?

public expect fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt

public expect fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt

public expect fun getdomainname(name: COpaquePointer?, len: CInt): CInt

public expect fun setdomainname(name: String?, len: CInt): CInt

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT

public expect fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT

public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt

public expect fun listxattr(path: String?, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT

public expect fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT

public expect fun removexattr(path: String?, name: String?, flags: CInt): CInt

public expect fun renamexNp(from: String?, to: String?, flags: CUint): CInt

public expect fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUint): CInt

public expect fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt

public expect fun getgrouplist(name: String?, basegid: CInt, groups: CInt?, ngroups: CInt?): CInt

public expect fun initgroups(user: String?, basegroup: CInt): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt

public expect fun brk(addr: COpaquePointer?): COpaquePointer?

public expect fun sbrk(increment: CInt): COpaquePointer?

public expect fun settimeofday(tv: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt

public expect fun dyldImageCount(): UInt

public expect fun dyldGetImageHeader(imageIndex: UInt): MachHeader?

public expect fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT

public expect fun dyldGetImageName(imageIndex: UInt): COpaquePointer?

public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: UInt?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: UInt?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: UInt?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: UInt?): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt

public expect fun posixSpawnattrSetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, subpref: CInt?, ocount: SizeT?): CInt

public expect fun posixSpawnattrGetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, subpref: CInt?, ocount: SizeT?): CInt

public expect fun posixSpawnattrGetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, ocount: SizeT?): CInt

public expect fun posixSpawnattrSetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, ocount: SizeT?): CInt

public expect fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt

public expect fun uname(buf: Utsname?): CInt

public expect fun connectx(socket: CInt, endpoints: SaEndpointsT?, associd: SaeAssocidT, flags: CUint, iov: Iovec?, iovcnt: CUint, len: SizeT?, connid: UInt?): CInt

public expect fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt

public expect fun ntpAdjtime(buf: Timex?): CInt

public expect fun ntpGettime(buf: Ntptimeval?): CInt

public expect fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt

public expect fun getfsstat(mntbufp: Statfs?, bufsize: CInt, flags: CInt): CInt

// Copy-on-write functions.
// According to the man page `flags` is an `int` but in the header
// this is a `uint32T`.
public expect fun clonefile(src: String?, dst: String?, flags: UInt): CInt

public expect fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt

public expect fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt

public expect fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt

public expect fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt

public expect fun copyfileStateFree(s: CopyfileStateT): CInt

public expect fun copyfileStateAlloc(): CopyfileStateT

public expect fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt

public expect fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt

public expect fun machErrorString(errorValue: io.github.kotlinmania.libc.MachErrorT): COpaquePointer?

// Added in macOS 10.13
// ISO/IEC 9899:2011 ("ISO C11") K.3.7.4.1
public expect fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt

// Added in macOS 10.5
public expect fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: SizeT)

public expect fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: SizeT)

public expect fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: SizeT)

// Inherited from BSD but available from Big Sur only
public expect fun strtonum(numstr: String?, minval: CLonglong, maxval: CLonglong, errstrp: COpaquePointer?): CLonglong

public expect fun mstats(): Mstats

public expect fun mallocPrintf(format: String?, vararg variadicArgs: Long)

public expect fun mallocZoneCheck(zone: MallocZoneT?): BooleanT

public expect fun mallocZonePrint(zone: MallocZoneT?, verbose: BooleanT)

public expect fun mallocZoneStatistics(zone: MallocZoneT?, stats: MallocStatisticsT?)

public expect fun mallocZoneLog(zone: MallocZoneT?, address: COpaquePointer?)

public expect fun mallocZonePrintPtrInfo(ptr: COpaquePointer?)

public expect fun mallocDefaultZone(): MallocZoneT?

public expect fun mallocZoneFromPtr(ptr: COpaquePointer?): MallocZoneT?

public expect fun mallocZoneMalloc(zone: MallocZoneT?, size: SizeT): COpaquePointer?

public expect fun mallocZoneValloc(zone: MallocZoneT?, size: SizeT): COpaquePointer?

public expect fun mallocZoneCalloc(zone: MallocZoneT?, numItems: SizeT, size: SizeT): COpaquePointer?

public expect fun mallocZoneRealloc(zone: MallocZoneT?, ptr: COpaquePointer?, size: SizeT): COpaquePointer?

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

public expect fun procPidRusage(pid: CInt, flavor: CInt, buffer: COpaquePointer?): CInt

// Available from Big Sur
public expect fun procSetNoSmt(): CInt

public expect fun procSetthreadNoSmt(): CInt

public expect fun procSetCsm(flags: UInt): CInt

public expect fun procSetthreadCsm(flags: UInt): CInt

/**
 * # Notes
 *
 * `id` is of type [uuidT].
 */
public expect fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): CInt

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong)

public expect fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: SizeT): io.github.kotlinmania.libc.CCRNGStatus

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

// Note(1.0): should this actually be deprecated?
public expect fun nsgetExecutablePath(buf: COpaquePointer?, bufsize: UInt?): CInt

// crtExterns.h
public expect fun nsgetArgv(): COpaquePointer?

public expect fun nsgetArgc(): CInt?

public expect fun nsgetEnviron(): COpaquePointer?

public expect fun nsgetProgname(): COpaquePointer?

public expect fun machVmMap(targetTask: io.github.kotlinmania.libc.VmMapT, address: ULong?, size: io.github.kotlinmania.libc.MachVmSizeT, mask: io.github.kotlinmania.libc.MachVmOffsetT, flags: CInt, obj: io.github.kotlinmania.libc.MemEntryNamePortT, offset: io.github.kotlinmania.libc.MemoryObjectOffsetT, copy: BooleanT, curProtection: io.github.kotlinmania.libc.VmProtT, maxProtection: io.github.kotlinmania.libc.VmProtT, inheritance: io.github.kotlinmania.libc.VmInheritT): io.github.kotlinmania.libc.KernReturnT

public expect fun vmAllocate(targetTask: VmMapT, address: UintptrT?, size: VmSizeT, flags: CInt): io.github.kotlinmania.libc.KernReturnT

public expect fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): io.github.kotlinmania.libc.KernReturnT

public expect fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: UInt?): io.github.kotlinmania.libc.KernReturnT

public expect fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: UInt?, outProcessorInfo: COpaquePointer?, outProcessorInfoCnt: UInt?): io.github.kotlinmania.libc.KernReturnT

public expect var MACH_TASK_SELF: io.github.kotlinmania.libc.MachPortT

public expect fun taskForPid(host: io.github.kotlinmania.libc.MachPortT, pid: PidT, task: CUint?): io.github.kotlinmania.libc.KernReturnT

public expect fun taskInfo(host: io.github.kotlinmania.libc.MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: UInt?): io.github.kotlinmania.libc.KernReturnT

public expect fun taskCreate(targetTask: io.github.kotlinmania.libc.TaskT, ledgers: io.github.kotlinmania.libc.LedgerArrayT, ledgersCnt: io.github.kotlinmania.libc.MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: CUint?): io.github.kotlinmania.libc.KernReturnT

public expect fun taskTerminate(targetTask: io.github.kotlinmania.libc.TaskT): io.github.kotlinmania.libc.KernReturnT

public expect fun taskThreads(targetTask: io.github.kotlinmania.libc.TaskInspectT, actList: COpaquePointer?, actListCnt: UInt?): io.github.kotlinmania.libc.KernReturnT

public expect fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: UInt?): io.github.kotlinmania.libc.KernReturnT

// sysdir.h
public expect fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): io.github.kotlinmania.libc.SysdirSearchPathEnumerationState

public expect fun sysdirGetNextSearchPathEnumeration(state: io.github.kotlinmania.libc.SysdirSearchPathEnumerationState, path: COpaquePointer?): io.github.kotlinmania.libc.SysdirSearchPathEnumerationState

public expect val VM_PAGE_SIZE: VmSizeT

public expect fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt

public expect fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt

public expect fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: CUlong): CInt

public expect fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt

public expect fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt

public expect fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt

public expect fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: ULong): CInt

public expect fun mallocSize(ptr: COpaquePointer?): SizeT

public expect fun mallocGoodSize(size: SizeT): SizeT

public expect fun dirname(path: COpaquePointer?): COpaquePointer?

public expect fun basename(path: COpaquePointer?): COpaquePointer?

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun freadlink(fd: CInt, buf: COpaquePointer?, size: SizeT): CInt

public expect fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt

public expect fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?)

public fun machTaskSelf(): io.github.kotlinmania.libc.MachPortT {
    return MACH_TASK_SELF
}

public expect fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

public expect fun taskSetInfo(targetTask: io.github.kotlinmania.libc.TaskT, flavor: io.github.kotlinmania.libc.TaskFlavorT, taskInfoIn: io.github.kotlinmania.libc.TaskInfoT, taskInfoInCnt: io.github.kotlinmania.libc.MachMsgTypeNumberT): io.github.kotlinmania.libc.KernReturnT

// These require a dependency on `libiconv`, and including this when built as
// part of `std` means every Rust program gets it. Ideally we would have a link
// modifier to only include these if they are used, but we do not.
public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT

public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT

public expect fun iconvClose(cd: IconvT): CInt
