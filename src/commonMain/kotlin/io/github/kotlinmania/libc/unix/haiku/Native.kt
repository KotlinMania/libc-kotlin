// port-lint: source unix/haiku/native.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

internal fun haikuConstant(a: Char, b: Char, c: Char, d: Char): UInt =
    ((a.code.toUInt() shl 24) + (b.code.toUInt() shl 16) + (c.code.toUInt() shl 8) + d.code.toUInt())

public data class AreaInfo(
    val area: Int,
    val name: ByteArray,
    val size: ULong,
    val lock: UInt,
    val protection: UInt,
    val team: Int,
    val ramSize: UInt,
    val copyCount: UInt,
    val inCount: UInt,
    val outCount: UInt,
    val address: COpaquePointer?,
)

public data class PortInfo(
    val port: Int,
    val team: Int,
    val name: ByteArray,
    val capacity: Int,
    val queueCount: Int,
    val totalCount: Int,
)

public data class PortMessageInfo(
    val size: ULong,
    val sender: UInt,
    val senderGroup: UInt,
    val senderTeam: Int,
)

public data class TeamInfo(
    val team: Int,
    val threadCount: Int,
    val imageCount: Int,
    val areaCount: Int,
    val debuggerNubThread: Int,
    val debuggerNubPort: Int,
    val argc: Int,
    val args: ByteArray,
    val uid: UInt,
    val gid: UInt,
)

public data class SemInfo(
    val sem: Int,
    val team: Int,
    val name: ByteArray,
    val count: Int,
    val latestHolder: Int,
)

public data class TeamUsageInfo(
    val userTime: Long,
    val kernelTime: Long,
)

public data class ThreadInfo(
    val thread: Int,
    val team: Int,
    val name: ByteArray,
    val state: UInt,
    val priority: Int,
    val sem: Int,
    val userTime: Long,
    val kernelTime: Long,
    val stackBase: COpaquePointer?,
    val stackEnd: COpaquePointer?,
)

public data class CpuInfo(
    val activeTime: Long,
    val enabled: Boolean,
    val currentFrequency: ULong,
)

public data class SystemInfo(
    val bootTime: Long,
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
    val obj: Int,
    val type: UShort,
    val events: UShort,
)

public data class CpuTopologyRootInfo(
    val platform: UInt,
)

public data class CpuTopologyPackageInfo(
    val vendor: UInt,
    val cacheLineSize: UInt,
)

public data class CpuTopologyCoreInfo(
    val model: UInt,
    val defaultFrequency: ULong,
)

public data class AttrInfo(
    val type: UInt,
    val size: Long,
)

public data class IndexInfo(
    val type: UInt,
    val size: Long,
    val modificationTime: Int,
    val creationTime: Int,
    val uid: UInt,
    val gid: UInt,
)

public data class FsInfo(
    val dev: Int,
    val root: Long,
    val flags: UInt,
    val blockSize: Long,
    val ioSize: Long,
    val totalBlocks: Long,
    val freeBlocks: Long,
    val totalNodes: Long,
    val freeNodes: Long,
    val deviceName: ByteArray,
    val volumeName: ByteArray,
    val fshName: ByteArray,
)

public data class ImageInfo(
    val id: Int,
    val imageType: Int,
    val sequence: Int,
    val initOrder: Int,
    val initRoutine: ImageInitializer?,
    val termRoutine: ImageTerminator?,
    val device: Int,
    val node: Long,
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
    val type: UInt,
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
    val pkg: CpuTopologyPackageInfo? = null,
    val core: CpuTopologyCoreInfo? = null,
)

public const val B_THREAD_RUNNING: UInt = 1u
public const val B_THREAD_READY: UInt = 2u
public const val B_THREAD_RECEIVING: UInt = 3u
public const val B_THREAD_ASLEEP: UInt = 4u
public const val B_THREAD_SUSPENDED: UInt = 5u
public const val B_THREAD_WAITING: UInt = 6u

public const val B_APP_IMAGE: UInt = 1u
public const val B_LIBRARY_IMAGE: UInt = 2u
public const val B_ADD_ON_IMAGE: UInt = 3u
public const val B_SYSTEM_IMAGE: UInt = 4u

public const val B_DEFAULT_MEDIA_PRIORITY: UInt = 0x000u
public const val B_OFFLINE_PROCESSING: UInt = 0x001u
public const val B_STATUS_RENDERING: UInt = 0x002u
public const val B_USER_INPUT_HANDLING: UInt = 0x004u
public const val B_LIVE_VIDEO_MANIPULATION: UInt = 0x008u
public const val B_VIDEO_PLAYBACK: UInt = 0x010u
public const val B_VIDEO_RECORDING: UInt = 0x020u
public const val B_LIVE_AUDIO_MANIPULATION: UInt = 0x040u
public const val B_AUDIO_PLAYBACK: UInt = 0x080u
public const val B_AUDIO_RECORDING: UInt = 0x100u
public const val B_LIVE_3D_RENDERING: UInt = 0x200u
public const val B_NUMBER_CRUNCHING: UInt = 0x400u
public const val B_MIDI_PROCESSING: UInt = 0x800u

public const val SCHEDULER_MODE_LOW_LATENCY: UInt = 0u
public const val SCHEDULER_MODE_POWER_SAVING: UInt = 1u

public const val B_FIND_PATH_INSTALLATION_LOCATION_DIRECTORY: UInt = 0u
public const val B_FIND_PATH_ADD_ONS_DIRECTORY: UInt = 1u
public const val B_FIND_PATH_APPS_DIRECTORY: UInt = 2u
public const val B_FIND_PATH_BIN_DIRECTORY: UInt = 3u
public const val B_FIND_PATH_BOOT_DIRECTORY: UInt = 4u
public const val B_FIND_PATH_CACHE_DIRECTORY: UInt = 5u
public const val B_FIND_PATH_DATA_DIRECTORY: UInt = 6u
public const val B_FIND_PATH_DEVELOP_DIRECTORY: UInt = 7u
public const val B_FIND_PATH_DEVELOP_LIB_DIRECTORY: UInt = 8u
public const val B_FIND_PATH_DOCUMENTATION_DIRECTORY: UInt = 9u
public const val B_FIND_PATH_ETC_DIRECTORY: UInt = 10u
public const val B_FIND_PATH_FONTS_DIRECTORY: UInt = 11u
public const val B_FIND_PATH_HEADERS_DIRECTORY: UInt = 12u
public const val B_FIND_PATH_LIB_DIRECTORY: UInt = 13u
public const val B_FIND_PATH_LOG_DIRECTORY: UInt = 14u
public const val B_FIND_PATH_MEDIA_NODES_DIRECTORY: UInt = 15u
public const val B_FIND_PATH_PACKAGES_DIRECTORY: UInt = 16u
public const val B_FIND_PATH_PREFERENCES_DIRECTORY: UInt = 17u
public const val B_FIND_PATH_SERVERS_DIRECTORY: UInt = 18u
public const val B_FIND_PATH_SETTINGS_DIRECTORY: UInt = 19u
public const val B_FIND_PATH_SOUNDS_DIRECTORY: UInt = 20u
public const val B_FIND_PATH_SPOOL_DIRECTORY: UInt = 21u
public const val B_FIND_PATH_TRANSLATORS_DIRECTORY: UInt = 22u
public const val B_FIND_PATH_VAR_DIRECTORY: UInt = 23u
public const val B_FIND_PATH_IMAGE_PATH: UInt = 1000u
public const val B_FIND_PATH_PACKAGE_PATH: UInt = 1001u

public const val B_DESKTOP_DIRECTORY: UInt = 0u
public const val B_TRASH_DIRECTORY: UInt = 1u
public const val B_SYSTEM_DIRECTORY: UInt = 1000u
public const val B_SYSTEM_ADDONS_DIRECTORY: UInt = 1002u
public const val B_SYSTEM_BOOT_DIRECTORY: UInt = 1003u
public const val B_SYSTEM_FONTS_DIRECTORY: UInt = 1004u
public const val B_SYSTEM_LIB_DIRECTORY: UInt = 1005u
public const val B_SYSTEM_SERVERS_DIRECTORY: UInt = 1006u
public const val B_SYSTEM_APPS_DIRECTORY: UInt = 1007u
public const val B_SYSTEM_BIN_DIRECTORY: UInt = 1008u
public const val B_SYSTEM_DOCUMENTATION_DIRECTORY: UInt = 1010u
public const val B_SYSTEM_PREFERENCES_DIRECTORY: UInt = 1011u
public const val B_SYSTEM_TRANSLATORS_DIRECTORY: UInt = 1012u
public const val B_SYSTEM_MEDIA_NODES_DIRECTORY: UInt = 1013u
public const val B_SYSTEM_SOUNDS_DIRECTORY: UInt = 1014u
public const val B_SYSTEM_DATA_DIRECTORY: UInt = 1015u
public const val B_SYSTEM_DEVELOP_DIRECTORY: UInt = 1016u
public const val B_SYSTEM_PACKAGES_DIRECTORY: UInt = 1017u
public const val B_SYSTEM_HEADERS_DIRECTORY: UInt = 1018u
public const val B_SYSTEM_ETC_DIRECTORY: UInt = 2008u
public const val B_SYSTEM_SETTINGS_DIRECTORY: UInt = 2010u
public const val B_SYSTEM_LOG_DIRECTORY: UInt = 2012u
public const val B_SYSTEM_SPOOL_DIRECTORY: UInt = 2013u
public const val B_SYSTEM_TEMP_DIRECTORY: UInt = 2014u
public const val B_SYSTEM_VAR_DIRECTORY: UInt = 2015u
public const val B_SYSTEM_CACHE_DIRECTORY: UInt = 2020u
public const val B_SYSTEM_NONPACKAGED_DIRECTORY: UInt = 2023u
public const val B_SYSTEM_NONPACKAGED_ADDONS_DIRECTORY: UInt = 2024u
public const val B_SYSTEM_NONPACKAGED_TRANSLATORS_DIRECTORY: UInt = 2025u
public const val B_SYSTEM_NONPACKAGED_MEDIA_NODES_DIRECTORY: UInt = 2026u
public const val B_SYSTEM_NONPACKAGED_BIN_DIRECTORY: UInt = 2027u
public const val B_SYSTEM_NONPACKAGED_DATA_DIRECTORY: UInt = 2028u
public const val B_SYSTEM_NONPACKAGED_FONTS_DIRECTORY: UInt = 2029u
public const val B_SYSTEM_NONPACKAGED_SOUNDS_DIRECTORY: UInt = 2030u
public const val B_SYSTEM_NONPACKAGED_DOCUMENTATION_DIRECTORY: UInt = 2031u
public const val B_SYSTEM_NONPACKAGED_LIB_DIRECTORY: UInt = 2032u
public const val B_SYSTEM_NONPACKAGED_HEADERS_DIRECTORY: UInt = 2033u
public const val B_SYSTEM_NONPACKAGED_DEVELOP_DIRECTORY: UInt = 2034u
public const val B_USER_DIRECTORY: UInt = 3000u
public const val B_USER_CONFIG_DIRECTORY: UInt = 3001u
public const val B_USER_ADDONS_DIRECTORY: UInt = 3002u
public const val B_USER_BOOT_DIRECTORY: UInt = 3003u
public const val B_USER_FONTS_DIRECTORY: UInt = 3004u
public const val B_USER_LIB_DIRECTORY: UInt = 3005u
public const val B_USER_SETTINGS_DIRECTORY: UInt = 3006u
public const val B_USER_DESKBAR_DIRECTORY: UInt = 3007u
public const val B_USER_PRINTERS_DIRECTORY: UInt = 3008u
public const val B_USER_TRANSLATORS_DIRECTORY: UInt = 3009u
public const val B_USER_MEDIA_NODES_DIRECTORY: UInt = 3010u
public const val B_USER_SOUNDS_DIRECTORY: UInt = 3011u
public const val B_USER_DATA_DIRECTORY: UInt = 3012u
public const val B_USER_CACHE_DIRECTORY: UInt = 3013u
public const val B_USER_PACKAGES_DIRECTORY: UInt = 3014u
public const val B_USER_HEADERS_DIRECTORY: UInt = 3015u
public const val B_USER_NONPACKAGED_DIRECTORY: UInt = 3016u
public const val B_USER_NONPACKAGED_ADDONS_DIRECTORY: UInt = 3017u
public const val B_USER_NONPACKAGED_TRANSLATORS_DIRECTORY: UInt = 3018u
public const val B_USER_NONPACKAGED_MEDIA_NODES_DIRECTORY: UInt = 3019u
public const val B_USER_NONPACKAGED_BIN_DIRECTORY: UInt = 3020u
public const val B_USER_NONPACKAGED_DATA_DIRECTORY: UInt = 3021u
public const val B_USER_NONPACKAGED_FONTS_DIRECTORY: UInt = 3022u
public const val B_USER_NONPACKAGED_SOUNDS_DIRECTORY: UInt = 3023u
public const val B_USER_NONPACKAGED_DOCUMENTATION_DIRECTORY: UInt = 3024u
public const val B_USER_NONPACKAGED_LIB_DIRECTORY: UInt = 3025u
public const val B_USER_NONPACKAGED_HEADERS_DIRECTORY: UInt = 3026u
public const val B_USER_NONPACKAGED_DEVELOP_DIRECTORY: UInt = 3027u
public const val B_USER_DEVELOP_DIRECTORY: UInt = 3028u
public const val B_USER_DOCUMENTATION_DIRECTORY: UInt = 3029u
public const val B_USER_SERVERS_DIRECTORY: UInt = 3030u
public const val B_USER_APPS_DIRECTORY: UInt = 3031u
public const val B_USER_BIN_DIRECTORY: UInt = 3032u
public const val B_USER_PREFERENCES_DIRECTORY: UInt = 3033u
public const val B_USER_ETC_DIRECTORY: UInt = 3034u
public const val B_USER_LOG_DIRECTORY: UInt = 3035u
public const val B_USER_SPOOL_DIRECTORY: UInt = 3036u
public const val B_USER_VAR_DIRECTORY: UInt = 3037u
public const val B_APPS_DIRECTORY: UInt = 4000u
public const val B_PREFERENCES_DIRECTORY: UInt = 4001u
public const val B_UTILITIES_DIRECTORY: UInt = 4002u
public const val B_PACKAGE_LINKS_DIRECTORY: UInt = 4003u

public const val B_TOPOLOGY_UNKNOWN: UInt = 0u
public const val B_TOPOLOGY_ROOT: UInt = 1u
public const val B_TOPOLOGY_SMT: UInt = 2u
public const val B_TOPOLOGY_CORE: UInt = 3u
public const val B_TOPOLOGY_PACKAGE: UInt = 4u

public const val B_CPU_UNKNOWN: UInt = 0u
public const val B_CPU_x86: UInt = 1u
public const val B_CPU_x86_64: UInt = 2u
public const val B_CPU_PPC: UInt = 3u
public const val B_CPU_PPC_64: UInt = 4u
public const val B_CPU_M68K: UInt = 5u
public const val B_CPU_ARM: UInt = 6u
public const val B_CPU_ARM_64: UInt = 7u
public const val B_CPU_ALPHA: UInt = 8u
public const val B_CPU_MIPS: UInt = 9u
public const val B_CPU_SH: UInt = 10u
public const val B_CPU_SPARC: UInt = 11u
public const val B_CPU_RISC_V: UInt = 12u

public const val B_CPU_VENDOR_UNKNOWN: UInt = 0u
public const val B_CPU_VENDOR_AMD: UInt = 1u
public const val B_CPU_VENDOR_CYRIX: UInt = 2u
public const val B_CPU_VENDOR_IDT: UInt = 3u
public const val B_CPU_VENDOR_INTEL: UInt = 4u
public const val B_CPU_VENDOR_NATIONAL_SEMICONDUCTOR: UInt = 5u
public const val B_CPU_VENDOR_RISE: UInt = 6u
public const val B_CPU_VENDOR_TRANSMETA: UInt = 7u
public const val B_CPU_VENDOR_VIA: UInt = 8u
public const val B_CPU_VENDOR_IBM: UInt = 9u
public const val B_CPU_VENDOR_MOTOROLA: UInt = 10u
public const val B_CPU_VENDOR_NEC: UInt = 11u
public const val B_CPU_VENDOR_HYGON: UInt = 12u
public const val B_CPU_VENDOR_SUN: UInt = 13u
public const val B_CPU_VENDOR_FUJITSU: UInt = 14u

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
public val B_READ_AREA: UInt = 1u shl 0
public val B_WRITE_AREA: UInt = 1u shl 1
public val B_EXECUTE_AREA: UInt = 1u shl 2
public val B_STACK_AREA: UInt = 1u shl 3
public val B_CLONEABLE_AREA: UInt = 1u shl 8
public const val B_CAN_INTERRUPT: UInt = 0x01u
public const val B_CHECK_PERMISSION: UInt = 0x04u
public const val B_KILL_CAN_INTERRUPT: UInt = 0x20u
public const val B_DO_NOT_RESCHEDULE: UInt = 0x02u
public const val B_RELEASE_ALL: UInt = 0x08u
public const val B_RELEASE_IF_WAITING_ONLY: UInt = 0x10u
public const val B_CURRENT_TEAM: Int = 0
public const val B_SYSTEM_TEAM: Int = 1
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
public const val B_GENERAL_ERROR_BASE: Int = Int.MIN_VALUE
public const val B_OS_ERROR_BASE: Int = B_GENERAL_ERROR_BASE + 0x1000
public const val B_APP_ERROR_BASE: Int = B_GENERAL_ERROR_BASE + 0x2000
public const val B_INTERFACE_ERROR_BASE: Int = B_GENERAL_ERROR_BASE + 0x3000
public const val B_MEDIA_ERROR_BASE: Int = B_GENERAL_ERROR_BASE + 0x4000
public const val B_TRANSLATION_ERROR_BASE: Int = B_GENERAL_ERROR_BASE + 0x4800
public const val B_MIDI_ERROR_BASE: Int = B_GENERAL_ERROR_BASE + 0x5000
public const val B_STORAGE_ERROR_BASE: Int = B_GENERAL_ERROR_BASE + 0x6000
public const val B_POSIX_ERROR_BASE: Int = B_GENERAL_ERROR_BASE + 0x7000
public const val B_MAIL_ERROR_BASE: Int = B_GENERAL_ERROR_BASE + 0x8000
public const val B_PRINT_ERROR_BASE: Int = B_GENERAL_ERROR_BASE + 0x9000
public const val B_DEVICE_ERROR_BASE: Int = B_GENERAL_ERROR_BASE + 0xa000
public const val B_ERRORS_END: Int = B_GENERAL_ERROR_BASE + 0xffff
public const val B_NO_MEMORY: Int = B_GENERAL_ERROR_BASE + 0
public const val B_IO_ERROR: Int = B_GENERAL_ERROR_BASE + 1
public const val B_PERMISSION_DENIED: Int = B_GENERAL_ERROR_BASE + 2
public const val B_BAD_INDEX: Int = B_GENERAL_ERROR_BASE + 3
public const val B_BAD_TYPE: Int = B_GENERAL_ERROR_BASE + 4
public const val B_BAD_VALUE: Int = B_GENERAL_ERROR_BASE + 5
public const val B_MISMATCHED_VALUES: Int = B_GENERAL_ERROR_BASE + 6
public const val B_NAME_NOT_FOUND: Int = B_GENERAL_ERROR_BASE + 7
public const val B_NAME_IN_USE: Int = B_GENERAL_ERROR_BASE + 8
public const val B_TIMED_OUT: Int = B_GENERAL_ERROR_BASE + 9
public const val B_INTERRUPTED: Int = B_GENERAL_ERROR_BASE + 10
public const val B_WOULD_BLOCK: Int = B_GENERAL_ERROR_BASE + 11
public const val B_CANCELED: Int = B_GENERAL_ERROR_BASE + 12
public const val B_NO_INIT: Int = B_GENERAL_ERROR_BASE + 13
public const val B_NOT_INITIALIZED: Int = B_GENERAL_ERROR_BASE + 13
public const val B_BUSY: Int = B_GENERAL_ERROR_BASE + 14
public const val B_NOT_ALLOWED: Int = B_GENERAL_ERROR_BASE + 15
public const val B_BAD_DATA: Int = B_GENERAL_ERROR_BASE + 16
public const val B_DONT_DO_THAT: Int = B_GENERAL_ERROR_BASE + 17
public const val B_ERROR: Int = -1
public const val B_OK: Int = 0
public const val B_NO_ERROR: Int = 0
public const val B_BAD_SEM_ID: Int = B_OS_ERROR_BASE + 0
public const val B_NO_MORE_SEMS: Int = B_OS_ERROR_BASE + 1
public const val B_BAD_THREAD_ID: Int = B_OS_ERROR_BASE + 0x100
public const val B_NO_MORE_THREADS: Int = B_OS_ERROR_BASE + 0x101
public const val B_BAD_THREAD_STATE: Int = B_OS_ERROR_BASE + 0x102
public const val B_BAD_TEAM_ID: Int = B_OS_ERROR_BASE + 0x103
public const val B_NO_MORE_TEAMS: Int = B_OS_ERROR_BASE + 0x104
public const val B_BAD_PORT_ID: Int = B_OS_ERROR_BASE + 0x200
public const val B_NO_MORE_PORTS: Int = B_OS_ERROR_BASE + 0x201
public const val B_BAD_IMAGE_ID: Int = B_OS_ERROR_BASE + 0x300
public const val B_BAD_ADDRESS: Int = B_OS_ERROR_BASE + 0x301
public const val B_NOT_AN_EXECUTABLE: Int = B_OS_ERROR_BASE + 0x302
public const val B_MISSING_LIBRARY: Int = B_OS_ERROR_BASE + 0x303
public const val B_MISSING_SYMBOL: Int = B_OS_ERROR_BASE + 0x304
public const val B_UNKNOWN_EXECUTABLE: Int = B_OS_ERROR_BASE + 0x305
public const val B_LEGACY_EXECUTABLE: Int = B_OS_ERROR_BASE + 0x306
public const val B_DEBUGGER_ALREADY_INSTALLED: Int = B_OS_ERROR_BASE + 0x400
public const val B_BAD_REPLY: Int = B_APP_ERROR_BASE + 0
public const val B_DUPLICATE_REPLY: Int = B_APP_ERROR_BASE + 1
public const val B_MESSAGE_TO_SELF: Int = B_APP_ERROR_BASE + 2
public const val B_BAD_HANDLER: Int = B_APP_ERROR_BASE + 3
public const val B_ALREADY_RUNNING: Int = B_APP_ERROR_BASE + 4
public const val B_LAUNCH_FAILED: Int = B_APP_ERROR_BASE + 5
public const val B_AMBIGUOUS_APP_LAUNCH: Int = B_APP_ERROR_BASE + 6
public const val B_UNKNOWN_MIME_TYPE: Int = B_APP_ERROR_BASE + 7
public const val B_BAD_SCRIPT_SYNTAX: Int = B_APP_ERROR_BASE + 8
public const val B_LAUNCH_FAILED_NO_RESOLVE_LINK: Int = B_APP_ERROR_BASE + 9
public const val B_LAUNCH_FAILED_EXECUTABLE: Int = B_APP_ERROR_BASE + 10
public const val B_LAUNCH_FAILED_APP_NOT_FOUND: Int = B_APP_ERROR_BASE + 11
public const val B_LAUNCH_FAILED_APP_IN_TRASH: Int = B_APP_ERROR_BASE + 12
public const val B_LAUNCH_FAILED_NO_PREFERRED_APP: Int = B_APP_ERROR_BASE + 13
public const val B_LAUNCH_FAILED_FILES_APP_NOT_FOUND: Int = B_APP_ERROR_BASE + 14
public const val B_BAD_MIME_SNIFFER_RULE: Int = B_APP_ERROR_BASE + 15
public const val B_NOT_A_MESSAGE: Int = B_APP_ERROR_BASE + 16
public const val B_SHUTDOWN_CANCELLED: Int = B_APP_ERROR_BASE + 17
public const val B_SHUTTING_DOWN: Int = B_APP_ERROR_BASE + 18
public const val B_FILE_ERROR: Int = B_STORAGE_ERROR_BASE + 0
public const val B_FILE_EXISTS: Int = B_STORAGE_ERROR_BASE + 2
public const val B_ENTRY_NOT_FOUND: Int = B_STORAGE_ERROR_BASE + 3
public const val B_NAME_TOO_LONG: Int = B_STORAGE_ERROR_BASE + 4
public const val B_NOT_A_DIRECTORY: Int = B_STORAGE_ERROR_BASE + 5
public const val B_DIRECTORY_NOT_EMPTY: Int = B_STORAGE_ERROR_BASE + 6
public const val B_DEVICE_FULL: Int = B_STORAGE_ERROR_BASE + 7
public const val B_READ_ONLY_DEVICE: Int = B_STORAGE_ERROR_BASE + 8
public const val B_IS_A_DIRECTORY: Int = B_STORAGE_ERROR_BASE + 9
public const val B_NO_MORE_FDS: Int = B_STORAGE_ERROR_BASE + 10
public const val B_CROSS_DEVICE_LINK: Int = B_STORAGE_ERROR_BASE + 11
public const val B_LINK_LIMIT: Int = B_STORAGE_ERROR_BASE + 12
public const val B_BUSTED_PIPE: Int = B_STORAGE_ERROR_BASE + 13
public const val B_UNSUPPORTED: Int = B_STORAGE_ERROR_BASE + 14
public const val B_PARTITION_TOO_SMALL: Int = B_STORAGE_ERROR_BASE + 15
public const val B_PARTIAL_READ: Int = B_STORAGE_ERROR_BASE + 16
public const val B_PARTIAL_WRITE: Int = B_STORAGE_ERROR_BASE + 17
public const val B_BUFFER_OVERFLOW: Int = EOVERFLOW
public const val B_TOO_MANY_ARGS: Int = E2BIG
public const val B_FILE_TOO_LARGE: Int = EFBIG
public const val B_RESULT_NOT_REPRESENTABLE: Int = ERANGE
public const val B_DEVICE_NOT_FOUND: Int = ENODEV
public const val B_NOT_SUPPORTED: Int = EOPNOTSUPP
public const val B_STREAM_NOT_FOUND: Int = B_MEDIA_ERROR_BASE + 0
public const val B_SERVER_NOT_FOUND: Int = B_MEDIA_ERROR_BASE + 1
public const val B_RESOURCE_NOT_FOUND: Int = B_MEDIA_ERROR_BASE + 2
public const val B_RESOURCE_UNAVAILABLE: Int = B_MEDIA_ERROR_BASE + 3
public const val B_BAD_SUBSCRIBER: Int = B_MEDIA_ERROR_BASE + 4
public const val B_SUBSCRIBER_NOT_ENTERED: Int = B_MEDIA_ERROR_BASE + 5
public const val B_BUFFER_NOT_AVAILABLE: Int = B_MEDIA_ERROR_BASE + 6
public const val B_LAST_BUFFER_ERROR: Int = B_MEDIA_ERROR_BASE + 7
public const val B_MEDIA_SYSTEM_FAILURE: Int = B_MEDIA_ERROR_BASE + 100
public const val B_MEDIA_BAD_NODE: Int = B_MEDIA_ERROR_BASE + 101
public const val B_MEDIA_NODE_BUSY: Int = B_MEDIA_ERROR_BASE + 102
public const val B_MEDIA_BAD_FORMAT: Int = B_MEDIA_ERROR_BASE + 103
public const val B_MEDIA_BAD_BUFFER: Int = B_MEDIA_ERROR_BASE + 104
public const val B_MEDIA_TOO_MANY_NODES: Int = B_MEDIA_ERROR_BASE + 105
public const val B_MEDIA_TOO_MANY_BUFFERS: Int = B_MEDIA_ERROR_BASE + 106
public const val B_MEDIA_NODE_ALREADY_EXISTS: Int = B_MEDIA_ERROR_BASE + 107
public const val B_MEDIA_BUFFER_ALREADY_EXISTS: Int = B_MEDIA_ERROR_BASE + 108
public const val B_MEDIA_CANNOT_SEEK: Int = B_MEDIA_ERROR_BASE + 109
public const val B_MEDIA_CANNOT_CHANGE_RUN_MODE: Int = B_MEDIA_ERROR_BASE + 110
public const val B_MEDIA_APP_ALREADY_REGISTERED: Int = B_MEDIA_ERROR_BASE + 111
public const val B_MEDIA_APP_NOT_REGISTERED: Int = B_MEDIA_ERROR_BASE + 112
public const val B_MEDIA_CANNOT_RECLAIM_BUFFERS: Int = B_MEDIA_ERROR_BASE + 113
public const val B_MEDIA_BUFFERS_NOT_RECLAIMED: Int = B_MEDIA_ERROR_BASE + 114
public const val B_MEDIA_TIME_SOURCE_STOPPED: Int = B_MEDIA_ERROR_BASE + 115
public const val B_MEDIA_TIME_SOURCE_BUSY: Int = B_MEDIA_ERROR_BASE + 116
public const val B_MEDIA_BAD_SOURCE: Int = B_MEDIA_ERROR_BASE + 117
public const val B_MEDIA_BAD_DESTINATION: Int = B_MEDIA_ERROR_BASE + 118
public const val B_MEDIA_ALREADY_CONNECTED: Int = B_MEDIA_ERROR_BASE + 119
public const val B_MEDIA_NOT_CONNECTED: Int = B_MEDIA_ERROR_BASE + 120
public const val B_MEDIA_BAD_CLIP_FORMAT: Int = B_MEDIA_ERROR_BASE + 121
public const val B_MEDIA_ADDON_FAILED: Int = B_MEDIA_ERROR_BASE + 122
public const val B_MEDIA_ADDON_DISABLED: Int = B_MEDIA_ERROR_BASE + 123
public const val B_MEDIA_CHANGE_IN_PROGRESS: Int = B_MEDIA_ERROR_BASE + 124
public const val B_MEDIA_STALE_CHANGE_COUNT: Int = B_MEDIA_ERROR_BASE + 125
public const val B_MEDIA_ADDON_RESTRICTED: Int = B_MEDIA_ERROR_BASE + 126
public const val B_MEDIA_NO_HANDLER: Int = B_MEDIA_ERROR_BASE + 127
public const val B_MEDIA_DUPLICATE_FORMAT: Int = B_MEDIA_ERROR_BASE + 128
public const val B_MEDIA_REALTIME_DISABLED: Int = B_MEDIA_ERROR_BASE + 129
public const val B_MEDIA_REALTIME_UNAVAILABLE: Int = B_MEDIA_ERROR_BASE + 130
public const val B_MAIL_NO_DAEMON: Int = B_MAIL_ERROR_BASE + 0
public const val B_MAIL_UNKNOWN_USER: Int = B_MAIL_ERROR_BASE + 1
public const val B_MAIL_WRONG_PASSWORD: Int = B_MAIL_ERROR_BASE + 2
public const val B_MAIL_UNKNOWN_HOST: Int = B_MAIL_ERROR_BASE + 3
public const val B_MAIL_ACCESS_ERROR: Int = B_MAIL_ERROR_BASE + 4
public const val B_MAIL_UNKNOWN_FIELD: Int = B_MAIL_ERROR_BASE + 5
public const val B_MAIL_NO_RECIPIENT: Int = B_MAIL_ERROR_BASE + 6
public const val B_MAIL_INVALID_MAIL: Int = B_MAIL_ERROR_BASE + 7
public const val B_NO_PRINT_SERVER: Int = B_PRINT_ERROR_BASE + 0
public const val B_DEV_INVALID_IOCTL: Int = B_DEVICE_ERROR_BASE + 0
public const val B_DEV_NO_MEMORY: Int = B_DEVICE_ERROR_BASE + 1
public const val B_DEV_BAD_DRIVE_NUM: Int = B_DEVICE_ERROR_BASE + 2
public const val B_DEV_NO_MEDIA: Int = B_DEVICE_ERROR_BASE + 3
public const val B_DEV_UNREADABLE: Int = B_DEVICE_ERROR_BASE + 4
public const val B_DEV_FORMAT_ERROR: Int = B_DEVICE_ERROR_BASE + 5
public const val B_DEV_TIMEOUT: Int = B_DEVICE_ERROR_BASE + 6
public const val B_DEV_RECALIBRATE_ERROR: Int = B_DEVICE_ERROR_BASE + 7
public const val B_DEV_SEEK_ERROR: Int = B_DEVICE_ERROR_BASE + 8
public const val B_DEV_ID_ERROR: Int = B_DEVICE_ERROR_BASE + 9
public const val B_DEV_READ_ERROR: Int = B_DEVICE_ERROR_BASE + 10
public const val B_DEV_WRITE_ERROR: Int = B_DEVICE_ERROR_BASE + 11
public const val B_DEV_NOT_READY: Int = B_DEVICE_ERROR_BASE + 12
public const val B_DEV_MEDIA_CHANGED: Int = B_DEVICE_ERROR_BASE + 13
public const val B_DEV_MEDIA_CHANGE_REQUESTED: Int = B_DEVICE_ERROR_BASE + 14
public const val B_DEV_RESOURCE_CONFLICT: Int = B_DEVICE_ERROR_BASE + 15
public const val B_DEV_CONFIGURATION_ERROR: Int = B_DEVICE_ERROR_BASE + 16
public const val B_DEV_DISABLED_BY_USER: Int = B_DEVICE_ERROR_BASE + 17
public const val B_DEV_DOOR_OPEN: Int = B_DEVICE_ERROR_BASE + 18
public const val B_DEV_INVALID_PIPE: Int = B_DEVICE_ERROR_BASE + 19
public const val B_DEV_CRC_ERROR: Int = B_DEVICE_ERROR_BASE + 20
public const val B_DEV_STALLED: Int = B_DEVICE_ERROR_BASE + 21
public const val B_DEV_BAD_PID: Int = B_DEVICE_ERROR_BASE + 22
public const val B_DEV_UNEXPECTED_PID: Int = B_DEVICE_ERROR_BASE + 23
public const val B_DEV_DATA_OVERRUN: Int = B_DEVICE_ERROR_BASE + 24
public const val B_DEV_DATA_UNDERRUN: Int = B_DEVICE_ERROR_BASE + 25
public const val B_DEV_FIFO_OVERRUN: Int = B_DEVICE_ERROR_BASE + 26
public const val B_DEV_FIFO_UNDERRUN: Int = B_DEVICE_ERROR_BASE + 27
public const val B_DEV_PENDING: Int = B_DEVICE_ERROR_BASE + 28
public const val B_DEV_MULTIPLE_ERRORS: Int = B_DEVICE_ERROR_BASE + 29
public const val B_DEV_TOO_LATE: Int = B_DEVICE_ERROR_BASE + 30
public const val B_TRANSLATION_BASE_ERROR: Int = B_TRANSLATION_ERROR_BASE + 0
public const val B_NO_TRANSLATOR: Int = B_TRANSLATION_ERROR_BASE + 1
public const val B_ILLEGAL_DATA: Int = B_TRANSLATION_ERROR_BASE + 2
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

public fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): Int = throw UnsupportedOperationException("Not implemented on this platform")

public fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: Int): Int = throw UnsupportedOperationException("Not implemented on this platform")

public fun findArea(name: String?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public fun areaFor(address: COpaquePointer?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun deleteArea(id: Int): Int

public expect fun resizeArea(id: Int, newSize: ULong): Int

public expect fun setAreaProtection(id: Int, newProtection: UInt): Int

public expect fun getAreaInfo(id: Int, areaInfo: AreaInfo?, size: ULong): Int

public expect fun getNextAreaInfo(team: Int, cookie: Long?, areaInfo: AreaInfo?, size: ULong): Int

public fun createPort(capacity: Int, name: String?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public fun findPort(name: String?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun readPort(port: Int, code: Int?, buffer: COpaquePointer?, bufferSize: ULong): Long

public expect fun readPortEtc(port: Int, code: Int?, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: Long): Long

public expect fun writePort(port: Int, code: Int, buffer: COpaquePointer?, bufferSize: ULong): Int

public expect fun writePortEtc(port: Int, code: Int, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: Long): Int

public expect fun closePort(port: Int): Int

public expect fun deletePort(port: Int): Int

public expect fun portBufferSize(port: Int): Long

public expect fun portBufferSizeEtc(port: Int, flags: UInt, timeout: Long): Long

public expect fun portCount(port: Int): Long

public expect fun setPortOwner(port: Int, team: Int): Int

public expect fun getPortInfo(port: Int, buf: PortInfo?, portInfoSize: ULong): Int

public expect fun getNextPortInfo(port: Int, cookie: Int?, portInfo: PortInfo?, portInfoSize: ULong): Int

public expect fun getPortMessageInfoEtc(port: Int, info: PortMessageInfo?, infoSize: ULong, flags: UInt, timeout: Long): Int

public fun createSem(count: Int, name: String?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun deleteSem(id: Int): Int

public expect fun acquireSem(id: Int): Int

public expect fun acquireSemEtc(id: Int, count: Int, flags: UInt, timeout: Long): Int

public expect fun releaseSem(id: Int): Int

public expect fun releaseSemEtc(id: Int, count: Int, flags: UInt): Int

public expect fun switchSem(semToBeReleased: Int, id: Int): Int

public expect fun switchSemEtc(semToBeReleased: Int, id: Int, count: Int, flags: UInt, timeout: Long): Int

public expect fun getSemCount(id: Int, threadCount: Int?): Int

public expect fun setSemOwner(id: Int, team: Int): Int

public expect fun getSemInfo(id: Int, info: SemInfo?, infoSize: ULong): Int

public expect fun getNextSemInfo(team: Int, cookie: Int?, info: SemInfo?, infoSize: ULong): Int

public expect fun killTeam(team: Int): Int

public expect fun getTeamInfo(team: Int, info: TeamInfo?, size: ULong): Int

public expect fun getNextTeamInfo(cookie: Int?, info: TeamInfo?, size: ULong): Int

public fun spawnThread(func: ((io.github.kotlinmania.libc.COpaquePointer?) -> Int)?, name: String?, priority: Int, data: COpaquePointer?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun killThread(thread: Int): Int

public expect fun resumeThread(thread: Int): Int

public expect fun suspendThread(thread: Int): Int

public expect fun renameThread(thread: Int, newName: String?): Int

public expect fun setThreadPriority(thread: Int, newPriority: Int): Int

public expect fun suggestThreadPriority(what: UInt, period: Int, jitter: Long, length: Long): Int

public fun estimateMaxSchedulingLatency(th: Int): Long = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun exitThread(status: Int)

public expect fun waitForThread(thread: Int, returnValue: Int?): Int

public expect fun onExitThread(callback: ((COpaquePointer?) -> Unit)?, data: COpaquePointer?): Int

public fun findThread(name: String?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun getSchedulerMode(): Int

public expect fun setSchedulerMode(mode: Int): Int

public expect fun sendData(thread: Int, code: Int, buffer: COpaquePointer?, bufferSize: ULong): Int

public expect fun receiveData(sender: Int?, buffer: COpaquePointer?, bufferSize: ULong): Int

public expect fun hasData(thread: Int): Boolean

public expect fun snooze(amount: Long): Int

public expect fun snoozeEtc(amount: Long, timeBase: Int, flags: UInt): Int

public expect fun snoozeUntil(time: Long, timeBase: Int): Int

public expect fun getThreadInfo(id: Int, info: ThreadInfo?, size: ULong): Int

public expect fun getNextThreadInfo(team: Int, cookie: Int?, info: ThreadInfo?, size: ULong): Int

public fun getPthreadThreadId(thread: ULong): Int = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun getTeamUsageInfo(team: Int, who: Int, info: TeamUsageInfo?, size: ULong): Int

public expect fun realTimeClock(): ULong

public expect fun setRealTimeClock(secsSinceJan1st1970: ULong)

public fun realTimeClockUsecs(): Long = throw UnsupportedOperationException("Not implemented on this platform")

public fun systemTime(): Long = throw UnsupportedOperationException("Not implemented on this platform")

public fun systemTimeNsecs(): Long = throw UnsupportedOperationException("Not implemented on this platform")

public fun setAlarm(`when`: Long, flags: UInt): Long = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun debugger(message: String?)

public expect fun disableDebugger(state: Int): Int

public expect fun getSystemInfo(info: SystemInfo?): Int

public expect fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: CpuInfo?, size: ULong): Int

public fun getCpuInfo(firstCPU: UInt, cpuCount: UInt, info: CpuInfo?): Int =
    getCpuInfoEtc(firstCPU, cpuCount, info, 24uL)

public expect fun getCpuTopologyInfo(topologyInfos: CpuTopologyNodeInfo?, topologyInfoCount: UInt?): Int

public expect fun isComputerOn(): Int

public fun isComputerOnFire(): Double = 0.0

public expect fun sendSignal(threadID: Int, signal: UInt): Int

public expect fun setSignalStack(base: COpaquePointer?, size: ULong)

public expect fun waitForObjects(infos: ObjectWaitInfo?, numInfos: Int): Long

public expect fun waitForObjectsEtc(infos: ObjectWaitInfo?, numInfos: Int, flags: UInt, timeout: Long): Long

public expect fun fsReadAttr(fd: Int, attribute: String?, type: UInt, pos: Long, buffer: COpaquePointer?, readBytes: ULong): Long

public expect fun fsWriteAttr(fd: Int, attribute: String?, type: UInt, pos: Long, buffer: COpaquePointer?, writeBytes: ULong): Long

public expect fun fsRemoveAttr(fd: Int, attribute: String?): Int

public expect fun fsStatAttr(fd: Int, attribute: String?, attrInfo: AttrInfo?): Int

public expect fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: Int): Int

public expect fun fsFopenAttr(fd: Int, attribute: String?, type: UInt, openMode: Int): Int

public expect fun fsCloseAttr(fd: Int): Int

public expect fun fsOpenAttrDir(path: String?): DIR?

public expect fun fsLopenAttrDir(path: String?): DIR?

public expect fun fsFopenAttrDir(fd: Int): DIR?

public expect fun fsCloseAttrDir(dir: DIR?): Int

public expect fun fsReadAttrDir(dir: DIR?): Dirent?

public expect fun fsRewindAttrDir(dir: DIR?)

public expect fun fsCreateIndex(device: Int, name: String?, type: UInt, flags: UInt): Int

public expect fun fsRemoveIndex(device: Int, name: String?): Int

public expect fun fsStatIndex(device: Int, name: String?, indexInfo: IndexInfo?): Int

public expect fun fsOpenIndexDir(device: Int): DIR?

public expect fun fsCloseIndexDir(indexDirectory: DIR?): Int

public expect fun fsReadIndexDir(indexDirectory: DIR?): Dirent?

public expect fun fsRewindIndexDir(indexDirectory: DIR?)

public fun devForPath(path: String?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public fun nextDev(pos: Int?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun fsStatDev(dev: Int, info: FsInfo?): Int

public expect fun fsOpenQuery(device: Int, query: String?, flags: UInt): DIR?

public expect fun fsOpenLiveQuery(device: Int, query: String?, flags: UInt, port: Int, token: Int): DIR?

public expect fun fsCloseQuery(d: DIR?): Int

public expect fun fsReadQuery(d: DIR?): Dirent?

public expect fun getPathForDirent(dent: Dirent?, buf: String?, len: ULong): Int

public fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun fsUnmountVolume(path: String?, flags: UInt): Int

public fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public fun loadAddOn(path: String?): Int = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun unloadAddOn(image: Int): Int

public expect fun getImageSymbol(image: Int, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): Int

public expect fun getNthImageSymbol(image: Int, n: Int, nameBuffer: String?, nameLength: Int?, symbolType: Int?, symbolLocation: COpaquePointer?): Int

public expect fun clearCaches(address: COpaquePointer?, length: ULong, flags: UInt)

public expect fun getImageInfo(image: Int, info: ImageInfo?, size: ULong): Int

public expect fun getNextImageInfo(team: Int, cookie: Int?, info: ImageInfo?, size: ULong): Int

public expect fun findPath(codePointer: COpaquePointer?, baseDirectory: UInt, subPath: String?, pathBuffer: String?, bufferSize: ULong): Int

public expect fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: UInt, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): Int

public expect fun findPathForPath(path: String?, baseDirectory: UInt, subPath: String?, pathBuffer: String?, bufferSize: ULong): Int

public expect fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: UInt, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): Int

public expect fun findPaths(baseDirectory: UInt, subPath: String?, paths: COpaquePointer?, pathCount: ULong?): Int

public expect fun findPathsEtc(architecture: String?, baseDirectory: UInt, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: ULong?): Int

public expect fun findDirectory(which: UInt, volume: Int, createIt: Boolean, pathString: String?, length: Int): Int

public expect fun getCpuid(info: CpuidInfo?, eaxRegister: UInt, cpuNum: UInt): Int
