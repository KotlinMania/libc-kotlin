@file:OptIn(ExperimentalUnsignedTypes::class)

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

public fun interface FnCallback {
    public operator fun invoke(ctx: COpaquePointer?): CInt
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

public typealias UuidT = UByteArray

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

public typealias VolCapabilitiesSetT = UIntArray

public typealias MachTimebaseInfoDataT = MachTimebaseInfo

public class Timezone(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public enum class SysdirSearchPathDirectoryT(public val value: UInt) {
    SYSDIR_DIRECTORY_APPLICATION(1u),
    SYSDIR_DIRECTORY_DEMO_APPLICATION(2u),
    SYSDIR_DIRECTORY_DEVELOPER_APPLICATION(3u),
    SYSDIR_DIRECTORY_ADMIN_APPLICATION(4u),
    SYSDIR_DIRECTORY_LIBRARY(5u),
    SYSDIR_DIRECTORY_DEVELOPER(6u),
    SYSDIR_DIRECTORY_USER(7u),
    SYSDIR_DIRECTORY_DOCUMENTATION(8u),
    SYSDIR_DIRECTORY_DOCUMENT(9u),
    SYSDIR_DIRECTORY_CORESERVICE(10u),
    SYSDIR_DIRECTORY_AUTOSAVED_INFORMATION(11u),
    SYSDIR_DIRECTORY_DESKTOP(12u),
    SYSDIR_DIRECTORY_CACHES(13u),
    SYSDIR_DIRECTORY_APPLICATION_SUPPORT(14u),
    SYSDIR_DIRECTORY_DOWNLOADS(15u),
    SYSDIR_DIRECTORY_INPUT_METHODS(16u),
    SYSDIR_DIRECTORY_MOVIES(17u),
    SYSDIR_DIRECTORY_MUSIC(18u),
    SYSDIR_DIRECTORY_PICTURES(19u),
    SYSDIR_DIRECTORY_PRINTER_DESCRIPTION(20u),
    SYSDIR_DIRECTORY_SHARED_PUBLIC(21u),
    SYSDIR_DIRECTORY_PREFERENCE_PANES(22u),
    SYSDIR_DIRECTORY_ALL_APPLICATIONS(100u),
    SYSDIR_DIRECTORY_ALL_LIBRARIES(101u),
}

public enum class SysdirSearchPathDomainMaskT(public val value: UInt) {
    SYSDIR_DOMAIN_MASK_USER((1u shl 0)),
    SYSDIR_DOMAIN_MASK_LOCAL((1u shl 1)),
    SYSDIR_DOMAIN_MASK_NETWORK((1u shl 2)),
    SYSDIR_DOMAIN_MASK_SYSTEM((1u shl 3)),
    SYSDIR_DOMAIN_MASK_ALL(0x0ffffu),
}
