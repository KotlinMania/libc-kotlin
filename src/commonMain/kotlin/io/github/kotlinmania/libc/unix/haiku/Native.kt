// port-lint: source unix/haiku/native.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public typealias StatusT = Int
public typealias BigtimeT = Long
public typealias NanotimeT = Long
public typealias TypeCode = UInt
public typealias PerformCode = UInt

internal fun haikuConstant(a: Char, b: Char, c: Char, d: Char): UInt =
    ((a.code.toUInt() shl 24) + (b.code.toUInt() shl 16) + (c.code.toUInt() shl 8) + d.code.toUInt())
public typealias AreaId = Int
public typealias PortId = Int
public typealias SemId = Int
public typealias TeamId = Int
public typealias ThreadId = Int
public typealias ThreadFunc = ((COpaquePointer?) -> StatusT)?
public typealias ImageId = Int

public data class AreaInfo(
    val area: AreaId,
    val name: ByteArray,
    val size: ULong,
    val lock: UInt,
    val protection: UInt,
    val team: TeamId,
    val ramSize: UInt,
    val copyCount: UInt,
    val inCount: UInt,
    val outCount: UInt,
    val address: COpaquePointer?,
)

public data class PortInfo(
    val port: PortId,
    val team: TeamId,
    val name: ByteArray,
    val capacity: Int,
    val queueCount: Int,
    val totalCount: Int,
)

public data class PortMessageInfo(
    val size: ULong,
    val sender: UidT,
    val senderGroup: GidT,
    val senderTeam: TeamId,
)

public data class TeamInfo(
    val team: TeamId,
    val threadCount: Int,
    val imageCount: Int,
    val areaCount: Int,
    val debuggerNubThread: ThreadId,
    val debuggerNubPort: PortId,
    val argc: Int,
    val args: ByteArray,
    val uid: UidT,
    val gid: GidT,
)

public data class SemInfo(
    val sem: SemId,
    val team: TeamId,
    val name: ByteArray,
    val count: Int,
    val latestHolder: ThreadId,
)

public data class TeamUsageInfo(
    val userTime: BigtimeT,
    val kernelTime: BigtimeT,
)

public data class ThreadInfo(
    val thread: ThreadId,
    val team: TeamId,
    val name: ByteArray,
    val state: ThreadState,
    val priority: Int,
    val sem: SemId,
    val userTime: BigtimeT,
    val kernelTime: BigtimeT,
    val stackBase: COpaquePointer?,
    val stackEnd: COpaquePointer?,
)

public data class CpuInfo(
    val activeTime: BigtimeT,
    val enabled: Boolean,
    val currentFrequency: ULong,
)

public data class SystemInfo(
    val bootTime: BigtimeT,
    val cpuCount: UInt,
    val maxPages: ULong,
    val usedPages: ULong,
    val cachedPages: ULong,
    val blockCachePages: ULong,
    val ignoredPages: ULong,
    val neededMemory: ULong,
    val freeMemory: ULong,
    val maxSwapPages: ULong,
    val freeSwapPages: ULong,
    val pageFaults: UInt,
    val maxSems: UInt,
    val usedSems: UInt,
    val maxPorts: UInt,
    val usedPorts: UInt,
    val maxThreads: UInt,
    val usedThreads: UInt,
    val maxTeams: UInt,
    val usedTeams: UInt,
    val kernelName: ByteArray,
    val kernelBuildDate: ByteArray,
    val kernelBuildTime: ByteArray,
    val kernelVersion: Long,
    val abi: UInt,
)

public data class ObjectWaitInfo(
    val `object`: Int,
    val type: UShort,
    val events: UShort,
)

public data class CpuTopologyRootInfo(
    val platform: CpuPlatform,
)

public data class CpuTopologyPackageInfo(
    val vendor: CpuVendor,
    val cacheLineSize: UInt,
)

public data class CpuTopologyCoreInfo(
    val model: UInt,
    val defaultFrequency: ULong,
)

public data class AttrInfo(
    val type: UInt,
    val size: OffT,
)

public data class IndexInfo(
    val type: UInt,
    val size: OffT,
    val modificationTime: TimeT,
    val creationTime: TimeT,
    val uid: UidT,
    val gid: GidT,
)

public data class FsInfo(
    val dev: DevT,
    val root: InoT,
    val flags: UInt,
    val blockSize: OffT,
    val ioSize: OffT,
    val totalBlocks: OffT,
    val freeBlocks: OffT,
    val totalNodes: OffT,
    val freeNodes: OffT,
    val deviceName: ByteArray,
    val volumeName: ByteArray,
    val fshName: ByteArray,
)

public data class ImageInfo(
    val id: ImageId,
    val imageType: CInt,
    val sequence: Int,
    val initOrder: Int,
    val initRoutine: (() -> Unit)?,
    val termRoutine: (() -> Unit)?,
    val device: DevT,
    val node: InoT,
    val name: ByteArray,
    val text: COpaquePointer?,
    val data: COpaquePointer?,
    val textSize: Int,
    val dataSize: Int,
    val apiVersion: Int,
    val abi: Int,
)

public data class CAnonymousEax0(
    val maxEax: UInt,
    val vendorId: ByteArray,
)

public data class CAnonymousEax1(
    val stepping: UInt,
    val model: UInt,
    val family: UInt,
    val tpe: UInt,
    val extendedModel: UInt,
    val extendedFamily: UInt,
    val brandIndex: UInt,
    val clflush: UInt,
    val logicalCpus: UInt,
    val apicId: UInt,
    val features: UInt,
    val extendedFeatures: UInt,
)

public data class CAnonymousEax2(
    val callNum: UByte,
    val cacheDescriptors: UByteArray,
)

public data class CAnonymousEax3(
    val serialNumberHigh: UInt,
    val serialNumberLow: UInt,
)

public data class CAnonymousRegs(
    val eax: UInt,
    val ebx: UInt,
    val edx: UInt,
    val ecx: UInt,
)

public data class CpuTopologyNodeInfo(
    val id: UInt,
    val type: TopologyLevelType,
    val level: UInt,
    val data: CAnonymousCpuTopologyInfoData,
)

// C union; only one variant is valid at a time.
public data class CpuidInfo(
    val eax0: CAnonymousEax0? = null,
    val eax1: CAnonymousEax1? = null,
    val eax2: CAnonymousEax2? = null,
    val eax3: CAnonymousEax3? = null,
    val asChars: ByteArray? = null,
    val regs: CAnonymousRegs? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousCpuTopologyInfoData(
    val root: CpuTopologyRootInfo? = null,
    val `package`: CpuTopologyPackageInfo? = null,
    val core: CpuTopologyCoreInfo? = null,
)

public typealias ThreadState = CUInt

public const val B_THREAD_RUNNING: ThreadState = 1u
public const val B_THREAD_READY: ThreadState = 2u
public const val B_THREAD_RECEIVING: ThreadState = 3u
public const val B_THREAD_ASLEEP: ThreadState = 4u
public const val B_THREAD_SUSPENDED: ThreadState = 5u
public const val B_THREAD_WAITING: ThreadState = 6u
public typealias ImageType = CUInt

public const val B_APP_IMAGE: ImageType = 1u
public const val B_LIBRARY_IMAGE: ImageType = 2u
public const val B_ADD_ON_IMAGE: ImageType = 3u
public const val B_SYSTEM_IMAGE: ImageType = 4u
public typealias BeTaskFlags = CUInt

public const val B_DEFAULT_MEDIA_PRIORITY: BeTaskFlags = 0x000u
public const val B_OFFLINE_PROCESSING: BeTaskFlags = 0x001u
public const val B_STATUS_RENDERING: BeTaskFlags = 0x002u
public const val B_USER_INPUT_HANDLING: BeTaskFlags = 0x004u
public const val B_LIVE_VIDEO_MANIPULATION: BeTaskFlags = 0x008u
public const val B_VIDEO_PLAYBACK: BeTaskFlags = 0x010u
public const val B_VIDEO_RECORDING: BeTaskFlags = 0x020u
public const val B_LIVE_AUDIO_MANIPULATION: BeTaskFlags = 0x040u
public const val B_AUDIO_PLAYBACK: BeTaskFlags = 0x080u
public const val B_AUDIO_RECORDING: BeTaskFlags = 0x100u
public const val B_LIVE_3D_RENDERING: BeTaskFlags = 0x200u
public const val B_NUMBER_CRUNCHING: BeTaskFlags = 0x400u
public const val B_MIDI_PROCESSING: BeTaskFlags = 0x800u
public typealias SchdulerMode = CUInt

public const val SCHEDULER_MODE_LOW_LATENCY: SchdulerMode = 0u
public const val SCHEDULER_MODE_POWER_SAVING: SchdulerMode = 1u
public typealias PathBaseDirectory = CUInt

public const val B_FIND_PATH_INSTALLATION_LOCATION_DIRECTORY: PathBaseDirectory = 0u
public const val B_FIND_PATH_ADD_ONS_DIRECTORY: PathBaseDirectory = 1u
public const val B_FIND_PATH_APPS_DIRECTORY: PathBaseDirectory = 2u
public const val B_FIND_PATH_BIN_DIRECTORY: PathBaseDirectory = 3u
public const val B_FIND_PATH_BOOT_DIRECTORY: PathBaseDirectory = 4u
public const val B_FIND_PATH_CACHE_DIRECTORY: PathBaseDirectory = 5u
public const val B_FIND_PATH_DATA_DIRECTORY: PathBaseDirectory = 6u
public const val B_FIND_PATH_DEVELOP_DIRECTORY: PathBaseDirectory = 7u
public const val B_FIND_PATH_DEVELOP_LIB_DIRECTORY: PathBaseDirectory = 8u
public const val B_FIND_PATH_DOCUMENTATION_DIRECTORY: PathBaseDirectory = 9u
public const val B_FIND_PATH_ETC_DIRECTORY: PathBaseDirectory = 10u
public const val B_FIND_PATH_FONTS_DIRECTORY: PathBaseDirectory = 11u
public const val B_FIND_PATH_HEADERS_DIRECTORY: PathBaseDirectory = 12u
public const val B_FIND_PATH_LIB_DIRECTORY: PathBaseDirectory = 13u
public const val B_FIND_PATH_LOG_DIRECTORY: PathBaseDirectory = 14u
public const val B_FIND_PATH_MEDIA_NODES_DIRECTORY: PathBaseDirectory = 15u
public const val B_FIND_PATH_PACKAGES_DIRECTORY: PathBaseDirectory = 16u
public const val B_FIND_PATH_PREFERENCES_DIRECTORY: PathBaseDirectory = 17u
public const val B_FIND_PATH_SERVERS_DIRECTORY: PathBaseDirectory = 18u
public const val B_FIND_PATH_SETTINGS_DIRECTORY: PathBaseDirectory = 19u
public const val B_FIND_PATH_SOUNDS_DIRECTORY: PathBaseDirectory = 20u
public const val B_FIND_PATH_SPOOL_DIRECTORY: PathBaseDirectory = 21u
public const val B_FIND_PATH_TRANSLATORS_DIRECTORY: PathBaseDirectory = 22u
public const val B_FIND_PATH_VAR_DIRECTORY: PathBaseDirectory = 23u
public const val B_FIND_PATH_IMAGE_PATH: PathBaseDirectory = 1000u
public const val B_FIND_PATH_PACKAGE_PATH: PathBaseDirectory = 1001u
public typealias DirectoryWhich = CUInt

public const val B_DESKTOP_DIRECTORY: DirectoryWhich = 0u
public const val B_TRASH_DIRECTORY: DirectoryWhich = 1u
public const val B_SYSTEM_DIRECTORY: DirectoryWhich = 1000u
public const val B_SYSTEM_ADDONS_DIRECTORY: DirectoryWhich = 1002u
public const val B_SYSTEM_BOOT_DIRECTORY: DirectoryWhich = 1003u
public const val B_SYSTEM_FONTS_DIRECTORY: DirectoryWhich = 1004u
public const val B_SYSTEM_LIB_DIRECTORY: DirectoryWhich = 1005u
public const val B_SYSTEM_SERVERS_DIRECTORY: DirectoryWhich = 1006u
public const val B_SYSTEM_APPS_DIRECTORY: DirectoryWhich = 1007u
public const val B_SYSTEM_BIN_DIRECTORY: DirectoryWhich = 1008u
public const val B_SYSTEM_DOCUMENTATION_DIRECTORY: DirectoryWhich = 1010u
public const val B_SYSTEM_PREFERENCES_DIRECTORY: DirectoryWhich = 1011u
public const val B_SYSTEM_TRANSLATORS_DIRECTORY: DirectoryWhich = 1012u
public const val B_SYSTEM_MEDIA_NODES_DIRECTORY: DirectoryWhich = 1013u
public const val B_SYSTEM_SOUNDS_DIRECTORY: DirectoryWhich = 1014u
public const val B_SYSTEM_DATA_DIRECTORY: DirectoryWhich = 1015u
public const val B_SYSTEM_DEVELOP_DIRECTORY: DirectoryWhich = 1016u
public const val B_SYSTEM_PACKAGES_DIRECTORY: DirectoryWhich = 1017u
public const val B_SYSTEM_HEADERS_DIRECTORY: DirectoryWhich = 1018u
public const val B_SYSTEM_ETC_DIRECTORY: DirectoryWhich = 2008u
public const val B_SYSTEM_SETTINGS_DIRECTORY: DirectoryWhich = 2010u
public const val B_SYSTEM_LOG_DIRECTORY: DirectoryWhich = 2012u
public const val B_SYSTEM_SPOOL_DIRECTORY: DirectoryWhich = 2013u
public const val B_SYSTEM_TEMP_DIRECTORY: DirectoryWhich = 2014u
public const val B_SYSTEM_VAR_DIRECTORY: DirectoryWhich = 2015u
public const val B_SYSTEM_CACHE_DIRECTORY: DirectoryWhich = 2020u
public const val B_SYSTEM_NONPACKAGED_DIRECTORY: DirectoryWhich = 2023u
public const val B_SYSTEM_NONPACKAGED_ADDONS_DIRECTORY: DirectoryWhich = 2024u
public const val B_SYSTEM_NONPACKAGED_TRANSLATORS_DIRECTORY: DirectoryWhich = 2025u
public const val B_SYSTEM_NONPACKAGED_MEDIA_NODES_DIRECTORY: DirectoryWhich = 2026u
public const val B_SYSTEM_NONPACKAGED_BIN_DIRECTORY: DirectoryWhich = 2027u
public const val B_SYSTEM_NONPACKAGED_DATA_DIRECTORY: DirectoryWhich = 2028u
public const val B_SYSTEM_NONPACKAGED_FONTS_DIRECTORY: DirectoryWhich = 2029u
public const val B_SYSTEM_NONPACKAGED_SOUNDS_DIRECTORY: DirectoryWhich = 2030u
public const val B_SYSTEM_NONPACKAGED_DOCUMENTATION_DIRECTORY: DirectoryWhich = 2031u
public const val B_SYSTEM_NONPACKAGED_LIB_DIRECTORY: DirectoryWhich = 2032u
public const val B_SYSTEM_NONPACKAGED_HEADERS_DIRECTORY: DirectoryWhich = 2033u
public const val B_SYSTEM_NONPACKAGED_DEVELOP_DIRECTORY: DirectoryWhich = 2034u
public const val B_USER_DIRECTORY: DirectoryWhich = 3000u
public const val B_USER_CONFIG_DIRECTORY: DirectoryWhich = 3001u
public const val B_USER_ADDONS_DIRECTORY: DirectoryWhich = 3002u
public const val B_USER_BOOT_DIRECTORY: DirectoryWhich = 3003u
public const val B_USER_FONTS_DIRECTORY: DirectoryWhich = 3004u
public const val B_USER_LIB_DIRECTORY: DirectoryWhich = 3005u
public const val B_USER_SETTINGS_DIRECTORY: DirectoryWhich = 3006u
public const val B_USER_DESKBAR_DIRECTORY: DirectoryWhich = 3007u
public const val B_USER_PRINTERS_DIRECTORY: DirectoryWhich = 3008u
public const val B_USER_TRANSLATORS_DIRECTORY: DirectoryWhich = 3009u
public const val B_USER_MEDIA_NODES_DIRECTORY: DirectoryWhich = 3010u
public const val B_USER_SOUNDS_DIRECTORY: DirectoryWhich = 3011u
public const val B_USER_DATA_DIRECTORY: DirectoryWhich = 3012u
public const val B_USER_CACHE_DIRECTORY: DirectoryWhich = 3013u
public const val B_USER_PACKAGES_DIRECTORY: DirectoryWhich = 3014u
public const val B_USER_HEADERS_DIRECTORY: DirectoryWhich = 3015u
public const val B_USER_NONPACKAGED_DIRECTORY: DirectoryWhich = 3016u
public const val B_USER_NONPACKAGED_ADDONS_DIRECTORY: DirectoryWhich = 3017u
public const val B_USER_NONPACKAGED_TRANSLATORS_DIRECTORY: DirectoryWhich = 3018u
public const val B_USER_NONPACKAGED_MEDIA_NODES_DIRECTORY: DirectoryWhich = 3019u
public const val B_USER_NONPACKAGED_BIN_DIRECTORY: DirectoryWhich = 3020u
public const val B_USER_NONPACKAGED_DATA_DIRECTORY: DirectoryWhich = 3021u
public const val B_USER_NONPACKAGED_FONTS_DIRECTORY: DirectoryWhich = 3022u
public const val B_USER_NONPACKAGED_SOUNDS_DIRECTORY: DirectoryWhich = 3023u
public const val B_USER_NONPACKAGED_DOCUMENTATION_DIRECTORY: DirectoryWhich = 3024u
public const val B_USER_NONPACKAGED_LIB_DIRECTORY: DirectoryWhich = 3025u
public const val B_USER_NONPACKAGED_HEADERS_DIRECTORY: DirectoryWhich = 3026u
public const val B_USER_NONPACKAGED_DEVELOP_DIRECTORY: DirectoryWhich = 3027u
public const val B_USER_DEVELOP_DIRECTORY: DirectoryWhich = 3028u
public const val B_USER_DOCUMENTATION_DIRECTORY: DirectoryWhich = 3029u
public const val B_USER_SERVERS_DIRECTORY: DirectoryWhich = 3030u
public const val B_USER_APPS_DIRECTORY: DirectoryWhich = 3031u
public const val B_USER_BIN_DIRECTORY: DirectoryWhich = 3032u
public const val B_USER_PREFERENCES_DIRECTORY: DirectoryWhich = 3033u
public const val B_USER_ETC_DIRECTORY: DirectoryWhich = 3034u
public const val B_USER_LOG_DIRECTORY: DirectoryWhich = 3035u
public const val B_USER_SPOOL_DIRECTORY: DirectoryWhich = 3036u
public const val B_USER_VAR_DIRECTORY: DirectoryWhich = 3037u
public const val B_APPS_DIRECTORY: DirectoryWhich = 4000u
public const val B_PREFERENCES_DIRECTORY: DirectoryWhich = 4001u
public const val B_UTILITIES_DIRECTORY: DirectoryWhich = 4002u
public const val B_PACKAGE_LINKS_DIRECTORY: DirectoryWhich = 4003u
public typealias TopologyLevelType = CUInt

public const val B_TOPOLOGY_UNKNOWN: TopologyLevelType = 0u
public const val B_TOPOLOGY_ROOT: TopologyLevelType = 1u
public const val B_TOPOLOGY_SMT: TopologyLevelType = 2u
public const val B_TOPOLOGY_CORE: TopologyLevelType = 3u
public const val B_TOPOLOGY_PACKAGE: TopologyLevelType = 4u
public typealias CpuPlatform = CUInt

public const val B_CPU_UNKNOWN: CpuPlatform = 0u
public const val B_CPU_x86: CpuPlatform = 1u
public const val B_CPU_x86_64: CpuPlatform = 2u
public const val B_CPU_PPC: CpuPlatform = 3u
public const val B_CPU_PPC_64: CpuPlatform = 4u
public const val B_CPU_M68K: CpuPlatform = 5u
public const val B_CPU_ARM: CpuPlatform = 6u
public const val B_CPU_ARM_64: CpuPlatform = 7u
public const val B_CPU_ALPHA: CpuPlatform = 8u
public const val B_CPU_MIPS: CpuPlatform = 9u
public const val B_CPU_SH: CpuPlatform = 10u
public const val B_CPU_SPARC: CpuPlatform = 11u
public const val B_CPU_RISC_V: CpuPlatform = 12u
public typealias CpuVendor = CUInt

public const val B_CPU_VENDOR_UNKNOWN: CpuVendor = 0u
public const val B_CPU_VENDOR_AMD: CpuVendor = 1u
public const val B_CPU_VENDOR_CYRIX: CpuVendor = 2u
public const val B_CPU_VENDOR_IDT: CpuVendor = 3u
public const val B_CPU_VENDOR_INTEL: CpuVendor = 4u
public const val B_CPU_VENDOR_NATIONAL_SEMICONDUCTOR: CpuVendor = 5u
public const val B_CPU_VENDOR_RISE: CpuVendor = 6u
public const val B_CPU_VENDOR_TRANSMETA: CpuVendor = 7u
public const val B_CPU_VENDOR_VIA: CpuVendor = 8u
public const val B_CPU_VENDOR_IBM: CpuVendor = 9u
public const val B_CPU_VENDOR_MOTOROLA: CpuVendor = 10u
public const val B_CPU_VENDOR_NEC: CpuVendor = 11u
public const val B_CPU_VENDOR_HYGON: CpuVendor = 12u
public const val B_CPU_VENDOR_SUN: CpuVendor = 13u
public const val B_CPU_VENDOR_FUJITSU: CpuVendor = 14u

public const val B_OS_NAME_LENGTH: ULong = 32uL
public const val B_PAGE_SIZE: ULong = 4096uL
public const val B_INFINITE_TIMEOUT: ULong = 9223372036854775807uL
public const val B_RELATIVE_TIMEOUT: UInt = 0x8u
public const val B_ABSOLUTE_TIMEOUT: UInt = 0x10u
public const val B_TIMEOUT_REAL_TIME_BASE: UInt = 0x40u
public val B_ABSOLUTE_REAL_TIME_TIMEOUT: UInt = B_ABSOLUTE_TIMEOUT or B_TIMEOUT_REAL_TIME_BASE
public const val B_NO_LOCK: UInt = 0u
public const val B_LAZY_LOCK: UInt = 1u
public const val B_FULL_LOCK: UInt = 2u
public const val B_CONTIGUOUS: UInt = 3u
public const val B_LOMEM: UInt = 4u
public const val B_32_BIT_FULL_LOCK: UInt = 5u
public const val B_32_BIT_CONTIGUOUS: UInt = 6u
public const val B_ANY_ADDRESS: UInt = 0u
public const val B_EXACT_ADDRESS: UInt = 1u
public const val B_BASE_ADDRESS: UInt = 2u
public const val B_CLONE_ADDRESS: UInt = 3u
public const val B_ANY_KERNEL_ADDRESS: UInt = 4u
public const val B_RANDOMIZED_ANY_ADDRESS: UInt = 6u
public const val B_RANDOMIZED_BASE_ADDRESS: UInt = 7u
public val B_READ_AREA: UInt = 1.toUInt() shl 0
public val B_WRITE_AREA: UInt = 1.toUInt() shl 1
public val B_EXECUTE_AREA: UInt = 1.toUInt() shl 2
public val B_STACK_AREA: UInt = 1.toUInt() shl 3
public val B_CLONEABLE_AREA: UInt = 1.toUInt() shl 8
public const val B_CAN_INTERRUPT: UInt = 0x01u
public const val B_CHECK_PERMISSION: UInt = 0x04u
public const val B_KILL_CAN_INTERRUPT: UInt = 0x20u
public const val B_DO_NOT_RESCHEDULE: UInt = 0x02u
public const val B_RELEASE_ALL: UInt = 0x08u
public const val B_RELEASE_IF_WAITING_ONLY: UInt = 0x10u
public const val B_CURRENT_TEAM: TeamId = 0
public const val B_SYSTEM_TEAM: TeamId = 1
public const val B_TEAM_USAGE_SELF: Int = 0
public const val B_TEAM_USAGE_CHILDREN: Int = -1
public const val B_IDLE_PRIORITY: Int = 0
public const val B_LOWEST_ACTIVE_PRIORITY: Int = 1
public const val B_LOW_PRIORITY: Int = 5
public const val B_NORMAL_PRIORITY: Int = 10
public const val B_DISPLAY_PRIORITY: Int = 15
public const val B_URGENT_DISPLAY_PRIORITY: Int = 20
public const val B_REAL_TIME_DISPLAY_PRIORITY: Int = 100
public const val B_URGENT_PRIORITY: Int = 110
public const val B_REAL_TIME_PRIORITY: Int = 120
public const val B_SYSTEM_TIMEBASE: Int = 0
public const val B_FIRST_REAL_TIME_PRIORITY: Int = B_REAL_TIME_DISPLAY_PRIORITY
public const val B_ONE_SHOT_ABSOLUTE_ALARM: UInt = 1u
public const val B_ONE_SHOT_RELATIVE_ALARM: UInt = 2u
public const val B_PERIODIC_ALARM: UInt = 3u
public val B_OBJECT_TYPE_FD: UShort = (0).toUShort()
public val B_OBJECT_TYPE_SEMAPHORE: UShort = (1).toUShort()
public val B_OBJECT_TYPE_PORT: UShort = (2).toUShort()
public val B_OBJECT_TYPE_THREAD: UShort = (3).toUShort()
public val B_EVENT_READ: UShort = (0x0001).toUShort()
public val B_EVENT_WRITE: UShort = (0x0002).toUShort()
public val B_EVENT_ERROR: UShort = (0x0004).toUShort()
public val B_EVENT_PRIORITY_READ: UShort = (0x0008).toUShort()
public val B_EVENT_PRIORITY_WRITE: UShort = (0x0010).toUShort()
public val B_EVENT_HIGH_PRIORITY_READ: UShort = (0x0020).toUShort()
public val B_EVENT_HIGH_PRIORITY_WRITE: UShort = (0x0040).toUShort()
public val B_EVENT_DISCONNECTED: UShort = (0x0080).toUShort()
public val B_EVENT_ACQUIRE_SEMAPHORE: UShort = (0x0001).toUShort()
public val B_EVENT_INVALID: UShort = (0x1000).toUShort()
public const val B_FS_IS_READONLY: UInt = 0x00000001u
public const val B_FS_IS_REMOVABLE: UInt = 0x00000002u
public const val B_FS_IS_PERSISTENT: UInt = 0x00000004u
public const val B_FS_IS_SHARED: UInt = 0x00000008u
public const val B_FS_HAS_MIME: UInt = 0x00010000u
public const val B_FS_HAS_ATTR: UInt = 0x00020000u
public const val B_FS_HAS_QUERY: UInt = 0x00040000u
public const val B_FS_HAS_SELF_HEALING_LINKS: UInt = 0x00080000u
public const val B_FS_HAS_ALIASES: UInt = 0x00100000u
public const val B_FS_SUPPORTS_NODE_MONITORING: UInt = 0x00200000u
public const val B_FS_SUPPORTS_MONITOR_CHILDREN: UInt = 0x00400000u
public const val B_LIVE_QUERY: UInt = 0x00000001u
public const val B_QUERY_NON_INDEXED: UInt = 0x00000002u
public const val B_MOUNT_READ_ONLY: UInt = 1u
public const val B_MOUNT_VIRTUAL_DEVICE: UInt = 2u
public const val B_FORCE_UNMOUNT: UInt = 1u
public const val B_FLUSH_DCACHE: UInt = 0x0001u
public const val B_FLUSH_ICACHE: UInt = 0x0004u
public const val B_INVALIDATE_DCACHE: UInt = 0x0002u
public const val B_INVALIDATE_ICACHE: UInt = 0x0008u
public const val B_SYMBOL_TYPE_DATA: Int = 0x1
public const val B_SYMBOL_TYPE_TEXT: Int = 0x2
public const val B_SYMBOL_TYPE_ANY: Int = 0x5
public const val B_DEV_NAME_LENGTH: ULong = 128uL
public val B_FILE_NAME_LENGTH: ULong = FILENAME_MAX.toULong()
public val B_PATH_NAME_LENGTH: ULong = PATH_MAX.toULong()
public val B_ATTR_NAME_LENGTH: ULong = B_FILE_NAME_LENGTH - 1u
public val B_MIME_TYPE_LENGTH: ULong = B_ATTR_NAME_LENGTH - 15u
public const val B_MAX_SYMLINKS: ULong = 16uL
public val B_READ_ONLY: UInt = O_RDONLY.toUInt()
public val B_WRITE_ONLY: UInt = O_WRONLY.toUInt()
public val B_READ_WRITE: UInt = O_RDWR.toUInt()
public val B_FAIL_IF_EXISTS: UInt = O_EXCL.toUInt()
public val B_CREATE_FILE: UInt = O_CREAT.toUInt()
public val B_ERASE_FILE: UInt = O_TRUNC.toUInt()
public val B_OPEN_AT_END: UInt = O_APPEND.toUInt()
public const val B_FILE_NODE: UInt = 0x01u
public const val B_SYMLINK_NODE: UInt = 0x02u
public const val B_DIRECTORY_NODE: UInt = 0x04u
public const val B_ANY_NODE: UInt = 0x07u
public const val B_GENERAL_ERROR_BASE: StatusT = Int.MIN_VALUE
public const val B_OS_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x1000
public const val B_APP_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x2000
public const val B_INTERFACE_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x3000
public const val B_MEDIA_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x4000
public const val B_TRANSLATION_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x4800
public const val B_MIDI_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x5000
public const val B_STORAGE_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x6000
public const val B_POSIX_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x7000
public const val B_MAIL_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x8000
public const val B_PRINT_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x9000
public const val B_DEVICE_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0xa000
public const val B_ERRORS_END: StatusT = B_GENERAL_ERROR_BASE + 0xffff
public const val B_NO_MEMORY: StatusT = B_GENERAL_ERROR_BASE + 0
public const val B_IO_ERROR: StatusT = B_GENERAL_ERROR_BASE + 1
public const val B_PERMISSION_DENIED: StatusT = B_GENERAL_ERROR_BASE + 2
public const val B_BAD_INDEX: StatusT = B_GENERAL_ERROR_BASE + 3
public const val B_BAD_TYPE: StatusT = B_GENERAL_ERROR_BASE + 4
public const val B_BAD_VALUE: StatusT = B_GENERAL_ERROR_BASE + 5
public const val B_MISMATCHED_VALUES: StatusT = B_GENERAL_ERROR_BASE + 6
public const val B_NAME_NOT_FOUND: StatusT = B_GENERAL_ERROR_BASE + 7
public const val B_NAME_IN_USE: StatusT = B_GENERAL_ERROR_BASE + 8
public const val B_TIMED_OUT: StatusT = B_GENERAL_ERROR_BASE + 9
public const val B_INTERRUPTED: StatusT = B_GENERAL_ERROR_BASE + 10
public const val B_WOULD_BLOCK: StatusT = B_GENERAL_ERROR_BASE + 11
public const val B_CANCELED: StatusT = B_GENERAL_ERROR_BASE + 12
public const val B_NO_INIT: StatusT = B_GENERAL_ERROR_BASE + 13
public const val B_NOT_INITIALIZED: StatusT = B_GENERAL_ERROR_BASE + 13
public const val B_BUSY: StatusT = B_GENERAL_ERROR_BASE + 14
public const val B_NOT_ALLOWED: StatusT = B_GENERAL_ERROR_BASE + 15
public const val B_BAD_DATA: StatusT = B_GENERAL_ERROR_BASE + 16
public const val B_DONT_DO_THAT: StatusT = B_GENERAL_ERROR_BASE + 17
public const val B_ERROR: StatusT = -1
public const val B_OK: StatusT = 0
public const val B_NO_ERROR: StatusT = 0
public const val B_BAD_SEM_ID: StatusT = B_OS_ERROR_BASE + 0
public const val B_NO_MORE_SEMS: StatusT = B_OS_ERROR_BASE + 1
public const val B_BAD_THREAD_ID: StatusT = B_OS_ERROR_BASE + 0x100
public const val B_NO_MORE_THREADS: StatusT = B_OS_ERROR_BASE + 0x101
public const val B_BAD_THREAD_STATE: StatusT = B_OS_ERROR_BASE + 0x102
public const val B_BAD_TEAM_ID: StatusT = B_OS_ERROR_BASE + 0x103
public const val B_NO_MORE_TEAMS: StatusT = B_OS_ERROR_BASE + 0x104
public const val B_BAD_PORT_ID: StatusT = B_OS_ERROR_BASE + 0x200
public const val B_NO_MORE_PORTS: StatusT = B_OS_ERROR_BASE + 0x201
public const val B_BAD_IMAGE_ID: StatusT = B_OS_ERROR_BASE + 0x300
public const val B_BAD_ADDRESS: StatusT = B_OS_ERROR_BASE + 0x301
public const val B_NOT_AN_EXECUTABLE: StatusT = B_OS_ERROR_BASE + 0x302
public const val B_MISSING_LIBRARY: StatusT = B_OS_ERROR_BASE + 0x303
public const val B_MISSING_SYMBOL: StatusT = B_OS_ERROR_BASE + 0x304
public const val B_UNKNOWN_EXECUTABLE: StatusT = B_OS_ERROR_BASE + 0x305
public const val B_LEGACY_EXECUTABLE: StatusT = B_OS_ERROR_BASE + 0x306
public const val B_DEBUGGER_ALREADY_INSTALLED: StatusT = B_OS_ERROR_BASE + 0x400
public const val B_BAD_REPLY: StatusT = B_APP_ERROR_BASE + 0
public const val B_DUPLICATE_REPLY: StatusT = B_APP_ERROR_BASE + 1
public const val B_MESSAGE_TO_SELF: StatusT = B_APP_ERROR_BASE + 2
public const val B_BAD_HANDLER: StatusT = B_APP_ERROR_BASE + 3
public const val B_ALREADY_RUNNING: StatusT = B_APP_ERROR_BASE + 4
public const val B_LAUNCH_FAILED: StatusT = B_APP_ERROR_BASE + 5
public const val B_AMBIGUOUS_APP_LAUNCH: StatusT = B_APP_ERROR_BASE + 6
public const val B_UNKNOWN_MIME_TYPE: StatusT = B_APP_ERROR_BASE + 7
public const val B_BAD_SCRIPT_SYNTAX: StatusT = B_APP_ERROR_BASE + 8
public const val B_LAUNCH_FAILED_NO_RESOLVE_LINK: StatusT = B_APP_ERROR_BASE + 9
public const val B_LAUNCH_FAILED_EXECUTABLE: StatusT = B_APP_ERROR_BASE + 10
public const val B_LAUNCH_FAILED_APP_NOT_FOUND: StatusT = B_APP_ERROR_BASE + 11
public const val B_LAUNCH_FAILED_APP_IN_TRASH: StatusT = B_APP_ERROR_BASE + 12
public const val B_LAUNCH_FAILED_NO_PREFERRED_APP: StatusT = B_APP_ERROR_BASE + 13
public const val B_LAUNCH_FAILED_FILES_APP_NOT_FOUND: StatusT = B_APP_ERROR_BASE + 14
public const val B_BAD_MIME_SNIFFER_RULE: StatusT = B_APP_ERROR_BASE + 15
public const val B_NOT_A_MESSAGE: StatusT = B_APP_ERROR_BASE + 16
public const val B_SHUTDOWN_CANCELLED: StatusT = B_APP_ERROR_BASE + 17
public const val B_SHUTTING_DOWN: StatusT = B_APP_ERROR_BASE + 18
public const val B_FILE_ERROR: StatusT = B_STORAGE_ERROR_BASE + 0
public const val B_FILE_EXISTS: StatusT = B_STORAGE_ERROR_BASE + 2
public const val B_ENTRY_NOT_FOUND: StatusT = B_STORAGE_ERROR_BASE + 3
public const val B_NAME_TOO_LONG: StatusT = B_STORAGE_ERROR_BASE + 4
public const val B_NOT_A_DIRECTORY: StatusT = B_STORAGE_ERROR_BASE + 5
public const val B_DIRECTORY_NOT_EMPTY: StatusT = B_STORAGE_ERROR_BASE + 6
public const val B_DEVICE_FULL: StatusT = B_STORAGE_ERROR_BASE + 7
public const val B_READ_ONLY_DEVICE: StatusT = B_STORAGE_ERROR_BASE + 8
public const val B_IS_A_DIRECTORY: StatusT = B_STORAGE_ERROR_BASE + 9
public const val B_NO_MORE_FDS: StatusT = B_STORAGE_ERROR_BASE + 10
public const val B_CROSS_DEVICE_LINK: StatusT = B_STORAGE_ERROR_BASE + 11
public const val B_LINK_LIMIT: StatusT = B_STORAGE_ERROR_BASE + 12
public const val B_BUSTED_PIPE: StatusT = B_STORAGE_ERROR_BASE + 13
public const val B_UNSUPPORTED: StatusT = B_STORAGE_ERROR_BASE + 14
public const val B_PARTITION_TOO_SMALL: StatusT = B_STORAGE_ERROR_BASE + 15
public const val B_PARTIAL_READ: StatusT = B_STORAGE_ERROR_BASE + 16
public const val B_PARTIAL_WRITE: StatusT = B_STORAGE_ERROR_BASE + 17
public const val B_BUFFER_OVERFLOW: StatusT = EOVERFLOW
public const val B_TOO_MANY_ARGS: StatusT = E2BIG
public const val B_FILE_TOO_LARGE: StatusT = EFBIG
public const val B_RESULT_NOT_REPRESENTABLE: StatusT = ERANGE
public const val B_DEVICE_NOT_FOUND: StatusT = ENODEV
public const val B_NOT_SUPPORTED: StatusT = EOPNOTSUPP
public const val B_STREAM_NOT_FOUND: StatusT = B_MEDIA_ERROR_BASE + 0
public const val B_SERVER_NOT_FOUND: StatusT = B_MEDIA_ERROR_BASE + 1
public const val B_RESOURCE_NOT_FOUND: StatusT = B_MEDIA_ERROR_BASE + 2
public const val B_RESOURCE_UNAVAILABLE: StatusT = B_MEDIA_ERROR_BASE + 3
public const val B_BAD_SUBSCRIBER: StatusT = B_MEDIA_ERROR_BASE + 4
public const val B_SUBSCRIBER_NOT_ENTERED: StatusT = B_MEDIA_ERROR_BASE + 5
public const val B_BUFFER_NOT_AVAILABLE: StatusT = B_MEDIA_ERROR_BASE + 6
public const val B_LAST_BUFFER_ERROR: StatusT = B_MEDIA_ERROR_BASE + 7
public const val B_MEDIA_SYSTEM_FAILURE: StatusT = B_MEDIA_ERROR_BASE + 100
public const val B_MEDIA_BAD_NODE: StatusT = B_MEDIA_ERROR_BASE + 101
public const val B_MEDIA_NODE_BUSY: StatusT = B_MEDIA_ERROR_BASE + 102
public const val B_MEDIA_BAD_FORMAT: StatusT = B_MEDIA_ERROR_BASE + 103
public const val B_MEDIA_BAD_BUFFER: StatusT = B_MEDIA_ERROR_BASE + 104
public const val B_MEDIA_TOO_MANY_NODES: StatusT = B_MEDIA_ERROR_BASE + 105
public const val B_MEDIA_TOO_MANY_BUFFERS: StatusT = B_MEDIA_ERROR_BASE + 106
public const val B_MEDIA_NODE_ALREADY_EXISTS: StatusT = B_MEDIA_ERROR_BASE + 107
public const val B_MEDIA_BUFFER_ALREADY_EXISTS: StatusT = B_MEDIA_ERROR_BASE + 108
public const val B_MEDIA_CANNOT_SEEK: StatusT = B_MEDIA_ERROR_BASE + 109
public const val B_MEDIA_CANNOT_CHANGE_RUN_MODE: StatusT = B_MEDIA_ERROR_BASE + 110
public const val B_MEDIA_APP_ALREADY_REGISTERED: StatusT = B_MEDIA_ERROR_BASE + 111
public const val B_MEDIA_APP_NOT_REGISTERED: StatusT = B_MEDIA_ERROR_BASE + 112
public const val B_MEDIA_CANNOT_RECLAIM_BUFFERS: StatusT = B_MEDIA_ERROR_BASE + 113
public const val B_MEDIA_BUFFERS_NOT_RECLAIMED: StatusT = B_MEDIA_ERROR_BASE + 114
public const val B_MEDIA_TIME_SOURCE_STOPPED: StatusT = B_MEDIA_ERROR_BASE + 115
public const val B_MEDIA_TIME_SOURCE_BUSY: StatusT = B_MEDIA_ERROR_BASE + 116
public const val B_MEDIA_BAD_SOURCE: StatusT = B_MEDIA_ERROR_BASE + 117
public const val B_MEDIA_BAD_DESTINATION: StatusT = B_MEDIA_ERROR_BASE + 118
public const val B_MEDIA_ALREADY_CONNECTED: StatusT = B_MEDIA_ERROR_BASE + 119
public const val B_MEDIA_NOT_CONNECTED: StatusT = B_MEDIA_ERROR_BASE + 120
public const val B_MEDIA_BAD_CLIP_FORMAT: StatusT = B_MEDIA_ERROR_BASE + 121
public const val B_MEDIA_ADDON_FAILED: StatusT = B_MEDIA_ERROR_BASE + 122
public const val B_MEDIA_ADDON_DISABLED: StatusT = B_MEDIA_ERROR_BASE + 123
public const val B_MEDIA_CHANGE_IN_PROGRESS: StatusT = B_MEDIA_ERROR_BASE + 124
public const val B_MEDIA_STALE_CHANGE_COUNT: StatusT = B_MEDIA_ERROR_BASE + 125
public const val B_MEDIA_ADDON_RESTRICTED: StatusT = B_MEDIA_ERROR_BASE + 126
public const val B_MEDIA_NO_HANDLER: StatusT = B_MEDIA_ERROR_BASE + 127
public const val B_MEDIA_DUPLICATE_FORMAT: StatusT = B_MEDIA_ERROR_BASE + 128
public const val B_MEDIA_REALTIME_DISABLED: StatusT = B_MEDIA_ERROR_BASE + 129
public const val B_MEDIA_REALTIME_UNAVAILABLE: StatusT = B_MEDIA_ERROR_BASE + 130
public const val B_MAIL_NO_DAEMON: StatusT = B_MAIL_ERROR_BASE + 0
public const val B_MAIL_UNKNOWN_USER: StatusT = B_MAIL_ERROR_BASE + 1
public const val B_MAIL_WRONG_PASSWORD: StatusT = B_MAIL_ERROR_BASE + 2
public const val B_MAIL_UNKNOWN_HOST: StatusT = B_MAIL_ERROR_BASE + 3
public const val B_MAIL_ACCESS_ERROR: StatusT = B_MAIL_ERROR_BASE + 4
public const val B_MAIL_UNKNOWN_FIELD: StatusT = B_MAIL_ERROR_BASE + 5
public const val B_MAIL_NO_RECIPIENT: StatusT = B_MAIL_ERROR_BASE + 6
public const val B_MAIL_INVALID_MAIL: StatusT = B_MAIL_ERROR_BASE + 7
public const val B_NO_PRINT_SERVER: StatusT = B_PRINT_ERROR_BASE + 0
public const val B_DEV_INVALID_IOCTL: StatusT = B_DEVICE_ERROR_BASE + 0
public const val B_DEV_NO_MEMORY: StatusT = B_DEVICE_ERROR_BASE + 1
public const val B_DEV_BAD_DRIVE_NUM: StatusT = B_DEVICE_ERROR_BASE + 2
public const val B_DEV_NO_MEDIA: StatusT = B_DEVICE_ERROR_BASE + 3
public const val B_DEV_UNREADABLE: StatusT = B_DEVICE_ERROR_BASE + 4
public const val B_DEV_FORMAT_ERROR: StatusT = B_DEVICE_ERROR_BASE + 5
public const val B_DEV_TIMEOUT: StatusT = B_DEVICE_ERROR_BASE + 6
public const val B_DEV_RECALIBRATE_ERROR: StatusT = B_DEVICE_ERROR_BASE + 7
public const val B_DEV_SEEK_ERROR: StatusT = B_DEVICE_ERROR_BASE + 8
public const val B_DEV_ID_ERROR: StatusT = B_DEVICE_ERROR_BASE + 9
public const val B_DEV_READ_ERROR: StatusT = B_DEVICE_ERROR_BASE + 10
public const val B_DEV_WRITE_ERROR: StatusT = B_DEVICE_ERROR_BASE + 11
public const val B_DEV_NOT_READY: StatusT = B_DEVICE_ERROR_BASE + 12
public const val B_DEV_MEDIA_CHANGED: StatusT = B_DEVICE_ERROR_BASE + 13
public const val B_DEV_MEDIA_CHANGE_REQUESTED: StatusT = B_DEVICE_ERROR_BASE + 14
public const val B_DEV_RESOURCE_CONFLICT: StatusT = B_DEVICE_ERROR_BASE + 15
public const val B_DEV_CONFIGURATION_ERROR: StatusT = B_DEVICE_ERROR_BASE + 16
public const val B_DEV_DISABLED_BY_USER: StatusT = B_DEVICE_ERROR_BASE + 17
public const val B_DEV_DOOR_OPEN: StatusT = B_DEVICE_ERROR_BASE + 18
public const val B_DEV_INVALID_PIPE: StatusT = B_DEVICE_ERROR_BASE + 19
public const val B_DEV_CRC_ERROR: StatusT = B_DEVICE_ERROR_BASE + 20
public const val B_DEV_STALLED: StatusT = B_DEVICE_ERROR_BASE + 21
public const val B_DEV_BAD_PID: StatusT = B_DEVICE_ERROR_BASE + 22
public const val B_DEV_UNEXPECTED_PID: StatusT = B_DEVICE_ERROR_BASE + 23
public const val B_DEV_DATA_OVERRUN: StatusT = B_DEVICE_ERROR_BASE + 24
public const val B_DEV_DATA_UNDERRUN: StatusT = B_DEVICE_ERROR_BASE + 25
public const val B_DEV_FIFO_OVERRUN: StatusT = B_DEVICE_ERROR_BASE + 26
public const val B_DEV_FIFO_UNDERRUN: StatusT = B_DEVICE_ERROR_BASE + 27
public const val B_DEV_PENDING: StatusT = B_DEVICE_ERROR_BASE + 28
public const val B_DEV_MULTIPLE_ERRORS: StatusT = B_DEVICE_ERROR_BASE + 29
public const val B_DEV_TOO_LATE: StatusT = B_DEVICE_ERROR_BASE + 30
public const val B_TRANSLATION_BASE_ERROR: StatusT = B_TRANSLATION_ERROR_BASE + 0
public const val B_NO_TRANSLATOR: StatusT = B_TRANSLATION_ERROR_BASE + 1
public const val B_ILLEGAL_DATA: StatusT = B_TRANSLATION_ERROR_BASE + 2
public val B_AFFINE_TRANSFORM_TYPE: UInt = haikuConstant('A', 'M', 'T', 'X')
public val B_ALIGNMENT_TYPE: UInt = haikuConstant('A', 'L', 'G', 'N')
public val B_ANY_TYPE: UInt = haikuConstant('A', 'N', 'Y', 'T')
public val B_ATOM_TYPE: UInt = haikuConstant('A', 'T', 'O', 'M')
public val B_ATOMREF_TYPE: UInt = haikuConstant('A', 'T', 'M', 'R')
public val B_BOOL_TYPE: UInt = haikuConstant('B', 'O', 'O', 'L')
public val B_CHAR_TYPE: UInt = haikuConstant('C', 'H', 'A', 'R')
public val B_COLOR_8_BIT_TYPE: UInt = haikuConstant('C', 'L', 'R', 'B')
public val B_DOUBLE_TYPE: UInt = haikuConstant('D', 'B', 'L', 'E')
public val B_FLOAT_TYPE: UInt = haikuConstant('F', 'L', 'O', 'T')
public val B_GRAYSCALE_8_BIT_TYPE: UInt = haikuConstant('G', 'R', 'Y', 'B')
public val B_INT16_TYPE: UInt = haikuConstant('S', 'H', 'R', 'T')
public val B_INT32_TYPE: UInt = haikuConstant('L', 'O', 'N', 'G')
public val B_INT64_TYPE: UInt = haikuConstant('L', 'L', 'N', 'G')
public val B_INT8_TYPE: UInt = haikuConstant('B', 'Y', 'T', 'E')
public val B_LARGE_ICON_TYPE: UInt = haikuConstant('I', 'C', 'O', 'N')
public val B_MEDIA_PARAMETER_GROUP_TYPE: UInt = haikuConstant('B', 'M', 'C', 'G')
public val B_MEDIA_PARAMETER_TYPE: UInt = haikuConstant('B', 'M', 'C', 'T')
public val B_MEDIA_PARAMETER_WEB_TYPE: UInt = haikuConstant('B', 'M', 'C', 'W')
public val B_MESSAGE_TYPE: UInt = haikuConstant('M', 'S', 'G', 'G')
public val B_MESSENGER_TYPE: UInt = haikuConstant('M', 'S', 'N', 'G')
public val B_MIME_TYPE: UInt = haikuConstant('M', 'I', 'M', 'E')
public val B_MINI_ICON_TYPE: UInt = haikuConstant('M', 'I', 'C', 'N')
public val B_MONOCHROME_1_BIT_TYPE: UInt = haikuConstant('M', 'N', 'O', 'B')
public val B_OBJECT_TYPE: UInt = haikuConstant('O', 'P', 'T', 'R')
public val B_OFF_T_TYPE: UInt = haikuConstant('O', 'F', 'F', 'T')
public val B_PATTERN_TYPE: UInt = haikuConstant('P', 'A', 'T', 'N')
public val B_POINTER_TYPE: UInt = haikuConstant('P', 'N', 'T', 'R')
public val B_POINT_TYPE: UInt = haikuConstant('B', 'P', 'N', 'T')
public val B_PROPERTY_INFO_TYPE: UInt = haikuConstant('S', 'C', 'T', 'D')
public val B_RAW_TYPE: UInt = haikuConstant('R', 'A', 'W', 'T')
public val B_RECT_TYPE: UInt = haikuConstant('R', 'E', 'C', 'T')
public val B_REF_TYPE: UInt = haikuConstant('R', 'R', 'E', 'F')
public val B_RGB_32_BIT_TYPE: UInt = haikuConstant('R', 'G', 'B', 'B')
public val B_RGB_COLOR_TYPE: UInt = haikuConstant('R', 'G', 'B', 'C')
public val B_SIZE_TYPE: UInt = haikuConstant('S', 'I', 'Z', 'E')
public val B_SIZE_T_TYPE: UInt = haikuConstant('S', 'I', 'Z', 'T')
public val B_SSIZE_T_TYPE: UInt = haikuConstant('S', 'S', 'Z', 'T')
public val B_STRING_TYPE: UInt = haikuConstant('C', 'S', 'T', 'R')
public val B_STRING_LIST_TYPE: UInt = haikuConstant('S', 'T', 'R', 'L')
public val B_TIME_TYPE: UInt = haikuConstant('T', 'I', 'M', 'E')
public val B_UINT16_TYPE: UInt = haikuConstant('U', 'S', 'H', 'T')
public val B_UINT32_TYPE: UInt = haikuConstant('U', 'L', 'N', 'G')
public val B_UINT64_TYPE: UInt = haikuConstant('U', 'L', 'L', 'G')
public val B_UINT8_TYPE: UInt = haikuConstant('U', 'B', 'Y', 'T')
public val B_VECTOR_ICON_TYPE: UInt = haikuConstant('V', 'I', 'C', 'N')
public val B_XATTR_TYPE: UInt = haikuConstant('X', 'A', 'T', 'R')
public val B_NETWORK_ADDRESS_TYPE: UInt = haikuConstant('N', 'W', 'A', 'D')
public val B_MIME_STRING_TYPE: UInt = haikuConstant('M', 'I', 'M', 'S')
public val B_ASCII_TYPE: UInt = haikuConstant('T', 'E', 'X', 'T')

public expect fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId

public expect fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: AreaId): AreaId

public expect fun findArea(name: String?): AreaId

public expect fun areaFor(address: COpaquePointer?): AreaId

public expect fun deleteArea(id: AreaId): StatusT

public expect fun resizeArea(id: AreaId, newSize: ULong): StatusT

public expect fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT

public expect fun getAreaInfo(id: AreaId, areaInfo: AreaInfo?, size: ULong): StatusT

public expect fun getNextAreaInfo(team: TeamId, cookie: Long?, areaInfo: AreaInfo?, size: ULong): StatusT

public expect fun createPort(capacity: Int, name: String?): PortId

public expect fun findPort(name: String?): PortId

public expect fun readPort(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: ULong): SsizeT

public expect fun readPortEtc(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: BigtimeT): SsizeT

public expect fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: ULong): StatusT

public expect fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: BigtimeT): StatusT

public expect fun closePort(port: PortId): StatusT

public expect fun deletePort(port: PortId): StatusT

public expect fun portBufferSize(port: PortId): SsizeT

public expect fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT

public expect fun portCount(port: PortId): SsizeT

public expect fun setPortOwner(port: PortId, team: TeamId): StatusT

public expect fun getPortInfo(port: PortId, buf: PortInfo?, portInfoSize: ULong): StatusT

public expect fun getNextPortInfo(port: PortId, cookie: Int?, portInfo: PortInfo?, portInfoSize: ULong): StatusT

public expect fun getPortMessageInfoEtc(port: PortId, info: PortMessageInfo?, infoSize: ULong, flags: UInt, timeout: BigtimeT): StatusT

public expect fun createSem(count: Int, name: String?): SemId

public expect fun deleteSem(id: SemId): StatusT

public expect fun acquireSem(id: SemId): StatusT

public expect fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT

public expect fun releaseSem(id: SemId): StatusT

public expect fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT

public expect fun switchSem(semToBeReleased: SemId, id: SemId): StatusT

public expect fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT

public expect fun getSemCount(id: SemId, threadCount: Int?): StatusT

public expect fun setSemOwner(id: SemId, team: TeamId): StatusT

public expect fun getSemInfo(id: SemId, info: SemInfo?, infoSize: ULong): StatusT

public expect fun getNextSemInfo(team: TeamId, cookie: Int?, info: SemInfo?, infoSize: ULong): StatusT

public expect fun killTeam(team: TeamId): StatusT

public expect fun getTeamInfo(team: TeamId, info: TeamInfo?, size: ULong): StatusT

public expect fun getNextTeamInfo(cookie: Int?, info: TeamInfo?, size: ULong): StatusT

public expect fun spawnThread(func: ThreadFunc, name: String?, priority: Int, data: COpaquePointer?): ThreadId

public expect fun killThread(thread: ThreadId): StatusT

public expect fun resumeThread(thread: ThreadId): StatusT

public expect fun suspendThread(thread: ThreadId): StatusT

public expect fun renameThread(thread: ThreadId, newName: String?): StatusT

public expect fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT

public expect fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int

public expect fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT

public expect fun exitThread(status: StatusT)

public expect fun waitForThread(thread: ThreadId, returnValue: StatusT?): StatusT

public expect fun onExitThread(callback: ((COpaquePointer?) -> Unit)?, data: COpaquePointer?): StatusT

public expect fun findThread(name: String?): ThreadId

public expect fun getSchedulerMode(): Int

public expect fun setSchedulerMode(mode: Int): StatusT

public expect fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: ULong): StatusT

public expect fun receiveData(sender: ThreadId?, buffer: COpaquePointer?, bufferSize: ULong): Int

public expect fun hasData(thread: ThreadId): Boolean

public expect fun snooze(amount: BigtimeT): StatusT

public expect fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT

public expect fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT

public expect fun getThreadInfo(id: ThreadId, info: ThreadInfo?, size: ULong): StatusT

public expect fun getNextThreadInfo(team: TeamId, cookie: Int?, info: ThreadInfo?, size: ULong): StatusT

public expect fun getPthreadThreadId(thread: PthreadT): ThreadId

public expect fun getTeamUsageInfo(team: TeamId, who: Int, info: TeamUsageInfo?, size: ULong): StatusT

public expect fun realTimeClock(): CULong

public expect fun setRealTimeClock(secsSinceJan1st1970: CULong)

public expect fun realTimeClockUsecs(): BigtimeT

public expect fun systemTime(): BigtimeT

public expect fun systemTimeNsecs(): NanotimeT

public expect fun setAlarm(`when`: BigtimeT, flags: UInt): BigtimeT

public expect fun debugger(message: String?)

public expect fun disableDebugger(state: CInt): CInt

public expect fun getSystemInfo(info: SystemInfo?): StatusT

public expect fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: CpuInfo?, size: ULong): StatusT

public expect fun getCpuTopologyInfo(topologyInfos: CpuTopologyNodeInfo?, topologyInfoCount: UInt?): StatusT

public expect fun isComputerOn(): Int

public expect fun isComputerOnFire(): CDouble

public expect fun sendSignal(threadID: ThreadId, signal: CUInt): CInt

public expect fun setSignalStack(base: COpaquePointer?, size: ULong)

public expect fun waitForObjects(infos: ObjectWaitInfo?, numInfos: CInt): SsizeT

public expect fun waitForObjectsEtc(infos: ObjectWaitInfo?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT

public expect fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: ULong): SsizeT

public expect fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: ULong): SsizeT

public expect fun fsRemoveAttr(fd: CInt, attribute: String?): CInt

public expect fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: AttrInfo?): CInt

public expect fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt

public expect fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt

public expect fun fsCloseAttr(fd: CInt): CInt

public expect fun fsOpenAttrDir(path: String?): DIR?

public expect fun fsLopenAttrDir(path: String?): DIR?

public expect fun fsFopenAttrDir(fd: CInt): DIR?

public expect fun fsCloseAttrDir(dir: DIR?): CInt

public expect fun fsReadAttrDir(dir: DIR?): Dirent?

public expect fun fsRewindAttrDir(dir: DIR?)

public expect fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt

public expect fun fsRemoveIndex(device: DevT, name: String?): CInt

public expect fun fsStatIndex(device: DevT, name: String?, indexInfo: IndexInfo?): CInt

public expect fun fsOpenIndexDir(device: DevT): DIR?

public expect fun fsCloseIndexDir(indexDirectory: DIR?): CInt

public expect fun fsReadIndexDir(indexDirectory: DIR?): Dirent?

public expect fun fsRewindIndexDir(indexDirectory: DIR?)

public expect fun devForPath(path: String?): DevT

public expect fun nextDev(pos: Int?): DevT

public expect fun fsStatDev(dev: DevT, info: FsInfo?): CInt

public expect fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR?

public expect fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR?

public expect fun fsCloseQuery(d: DIR?): CInt

public expect fun fsReadQuery(d: DIR?): Dirent?

public expect fun getPathForDirent(dent: Dirent?, buf: String?, len: ULong): StatusT

public expect fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): DevT

public expect fun fsUnmountVolume(path: String?, flags: UInt): StatusT

public expect fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): ThreadId

public expect fun loadAddOn(path: String?): ImageId

public expect fun unloadAddOn(image: ImageId): StatusT

public expect fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT

public expect fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: String?, nameLength: Int?, symbolType: Int?, symbolLocation: COpaquePointer?): StatusT

public expect fun clearCaches(address: COpaquePointer?, length: ULong, flags: UInt)

public expect fun getImageInfo(image: ImageId, info: ImageInfo?, size: ULong): StatusT

public expect fun getNextImageInfo(team: TeamId, cookie: Int?, info: ImageInfo?, size: ULong): StatusT

public expect fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: String?, bufferSize: ULong): StatusT

public expect fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): StatusT

public expect fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: String?, bufferSize: ULong): StatusT

public expect fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): StatusT

public expect fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: ULong?): StatusT

public expect fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: ULong?): StatusT

public expect fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: String?, length: Int): StatusT

public expect fun getCpuid(info: CpuidInfo?, eaxRegister: UInt, cpuNum: UInt): StatusT
