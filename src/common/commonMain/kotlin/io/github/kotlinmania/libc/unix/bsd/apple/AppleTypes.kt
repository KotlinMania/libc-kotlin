package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.UintptrT

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

public typealias TaskInfoT = COpaquePointer?

public typealias HostInfoT = COpaquePointer?

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

public typealias HostInfo64T = COpaquePointer?

public typealias ProcessorFlavorT = CInt

public typealias ThreadFlavorT = NaturalT

public typealias ThreadInspectT = MachPortT

public typealias ThreadActT = MachPortT

public typealias ThreadActArrayT = COpaquePointer?

public typealias PolicyT = CInt

public typealias MachErrorT = KernReturnT

public typealias MachVmAddressT = ULong

public typealias MachVmOffsetT = ULong

public typealias MachVmSizeT = ULong

public typealias VmMapT = MachPortT

public typealias MemEntryNamePortT = MachPortT

public typealias MemoryObjectT = MachPortT

public typealias MemoryObjectOffsetT = CUlonglong

public typealias VmInheritT = CUint

public typealias VmProtT = CInt

public typealias LedgerT = MachPortT

public typealias LedgerArrayT = COpaquePointer?

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

public typealias ProcessorInfoArrayT = COpaquePointer?

public typealias MachTaskBasicInfoDataT = MachTaskBasicInfo

public typealias MachTaskBasicInfoT = MachTaskBasicInfo?

public typealias TaskThreadTimesInfoDataT = TaskThreadTimesInfo

public typealias TaskThreadTimesInfoT = TaskThreadTimesInfo?

public typealias ThreadInfoT = COpaquePointer?

public typealias ThreadBasicInfoT = ThreadBasicInfo?

public typealias ThreadBasicInfoDataT = ThreadBasicInfo

public typealias ThreadIdentifierInfoT = ThreadIdentifierInfo?

public typealias ThreadIdentifierInfoDataT = ThreadIdentifierInfo

public typealias ThreadExtendedInfoT = ThreadExtendedInfo?

public typealias ThreadExtendedInfoDataT = ThreadExtendedInfo

public typealias ThreadT = MachPortT

public typealias ThreadPolicyFlavorT = NaturalT

public typealias ThreadPolicyT = COpaquePointer?

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

public typealias OsUnfairLockT = COpaquePointer?

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

public typealias SysdirSearchPathEnumerationState = CUint

public typealias CCStatus = Int

public typealias CCCryptorStatus = Int

public typealias CCRNGStatus = CCCryptorStatus

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
