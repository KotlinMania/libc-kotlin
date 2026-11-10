// port-lint: source unix/haiku/native.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.types.CEnumRepr
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.haiku.b64.TimeT

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?): StatusT
}

public fun interface ImageInfoInitRoutineCallback {
    public operator fun invoke()
}

public fun interface OnExitThreadCallbackCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

// support/SupportDefs.h
public typealias StatusT = Int

public typealias BigtimeT = Long

public typealias NanotimeT = Long

public typealias TypeCode = UInt

public typealias PerformCode = UInt

// kernel/OS.h
public typealias AreaId = Int

public typealias PortId = Int

public typealias SemId = Int

public typealias TeamId = Int

public typealias ThreadId = Int

public fun interface ThreadFunc {
    public operator fun invoke(arg0: COpaquePointer?): StatusT
}

// kernel/image.h
public typealias ImageId = Int

public typealias ThreadState = CEnumRepr

public val B_THREAD_RUNNING: ThreadState = 1

public val B_THREAD_READY: ThreadState = B_THREAD_RUNNING + 1

public val B_THREAD_RECEIVING: ThreadState = B_THREAD_READY + 1

public val B_THREAD_ASLEEP: ThreadState = B_THREAD_RECEIVING + 1

public val B_THREAD_SUSPENDED: ThreadState = B_THREAD_ASLEEP + 1

public val B_THREAD_WAITING: ThreadState = B_THREAD_SUSPENDED + 1

public typealias ImageType = CEnumRepr

public val B_APP_IMAGE: ImageType = 1

public val B_LIBRARY_IMAGE: ImageType = B_APP_IMAGE + 1

public val B_ADD_ON_IMAGE: ImageType = B_LIBRARY_IMAGE + 1

public val B_SYSTEM_IMAGE: ImageType = B_ADD_ON_IMAGE + 1

public typealias BeTaskFlags = CEnumRepr

public val B_DEFAULT_MEDIA_PRIORITY: BeTaskFlags = 0x000

public val B_OFFLINE_PROCESSING: BeTaskFlags = 0x001

public val B_STATUS_RENDERING: BeTaskFlags = 0x002

public val B_USER_INPUT_HANDLING: BeTaskFlags = 0x004

public val B_LIVE_VIDEO_MANIPULATION: BeTaskFlags = 0x008

public val B_VIDEO_PLAYBACK: BeTaskFlags = 0x010

public val B_VIDEO_RECORDING: BeTaskFlags = 0x020

public val B_LIVE_AUDIO_MANIPULATION: BeTaskFlags = 0x040

public val B_AUDIO_PLAYBACK: BeTaskFlags = 0x080

public val B_AUDIO_RECORDING: BeTaskFlags = 0x100

public val B_LIVE_3D_RENDERING: BeTaskFlags = 0x200

public val B_NUMBER_CRUNCHING: BeTaskFlags = 0x400

public val B_MIDI_PROCESSING: BeTaskFlags = 0x800

public typealias SchdulerMode = CEnumRepr

public val SCHEDULER_MODE_LOW_LATENCY: SchdulerMode = 0

public val SCHEDULER_MODE_POWER_SAVING: SchdulerMode = SCHEDULER_MODE_LOW_LATENCY + 1

public typealias PathBaseDirectory = CEnumRepr

public val B_FIND_PATH_INSTALLATION_LOCATION_DIRECTORY: PathBaseDirectory = 0

public val B_FIND_PATH_ADD_ONS_DIRECTORY: PathBaseDirectory = B_FIND_PATH_INSTALLATION_LOCATION_DIRECTORY + 1

public val B_FIND_PATH_APPS_DIRECTORY: PathBaseDirectory = B_FIND_PATH_ADD_ONS_DIRECTORY + 1

public val B_FIND_PATH_BIN_DIRECTORY: PathBaseDirectory = B_FIND_PATH_APPS_DIRECTORY + 1

public val B_FIND_PATH_BOOT_DIRECTORY: PathBaseDirectory = B_FIND_PATH_BIN_DIRECTORY + 1

public val B_FIND_PATH_CACHE_DIRECTORY: PathBaseDirectory = B_FIND_PATH_BOOT_DIRECTORY + 1

public val B_FIND_PATH_DATA_DIRECTORY: PathBaseDirectory = B_FIND_PATH_CACHE_DIRECTORY + 1

public val B_FIND_PATH_DEVELOP_DIRECTORY: PathBaseDirectory = B_FIND_PATH_DATA_DIRECTORY + 1

public val B_FIND_PATH_DEVELOP_LIB_DIRECTORY: PathBaseDirectory = B_FIND_PATH_DEVELOP_DIRECTORY + 1

public val B_FIND_PATH_DOCUMENTATION_DIRECTORY: PathBaseDirectory = B_FIND_PATH_DEVELOP_LIB_DIRECTORY + 1

public val B_FIND_PATH_ETC_DIRECTORY: PathBaseDirectory = B_FIND_PATH_DOCUMENTATION_DIRECTORY + 1

public val B_FIND_PATH_FONTS_DIRECTORY: PathBaseDirectory = B_FIND_PATH_ETC_DIRECTORY + 1

public val B_FIND_PATH_HEADERS_DIRECTORY: PathBaseDirectory = B_FIND_PATH_FONTS_DIRECTORY + 1

public val B_FIND_PATH_LIB_DIRECTORY: PathBaseDirectory = B_FIND_PATH_HEADERS_DIRECTORY + 1

public val B_FIND_PATH_LOG_DIRECTORY: PathBaseDirectory = B_FIND_PATH_LIB_DIRECTORY + 1

public val B_FIND_PATH_MEDIA_NODES_DIRECTORY: PathBaseDirectory = B_FIND_PATH_LOG_DIRECTORY + 1

public val B_FIND_PATH_PACKAGES_DIRECTORY: PathBaseDirectory = B_FIND_PATH_MEDIA_NODES_DIRECTORY + 1

public val B_FIND_PATH_PREFERENCES_DIRECTORY: PathBaseDirectory = B_FIND_PATH_PACKAGES_DIRECTORY + 1

public val B_FIND_PATH_SERVERS_DIRECTORY: PathBaseDirectory = B_FIND_PATH_PREFERENCES_DIRECTORY + 1

public val B_FIND_PATH_SETTINGS_DIRECTORY: PathBaseDirectory = B_FIND_PATH_SERVERS_DIRECTORY + 1

public val B_FIND_PATH_SOUNDS_DIRECTORY: PathBaseDirectory = B_FIND_PATH_SETTINGS_DIRECTORY + 1

public val B_FIND_PATH_SPOOL_DIRECTORY: PathBaseDirectory = B_FIND_PATH_SOUNDS_DIRECTORY + 1

public val B_FIND_PATH_TRANSLATORS_DIRECTORY: PathBaseDirectory = B_FIND_PATH_SPOOL_DIRECTORY + 1

public val B_FIND_PATH_VAR_DIRECTORY: PathBaseDirectory = B_FIND_PATH_TRANSLATORS_DIRECTORY + 1

public val B_FIND_PATH_IMAGE_PATH: PathBaseDirectory = 1000

public val B_FIND_PATH_PACKAGE_PATH: PathBaseDirectory = B_FIND_PATH_IMAGE_PATH + 1

public typealias DirectoryWhich = CEnumRepr

public val B_DESKTOP_DIRECTORY: DirectoryWhich = 0

public val B_TRASH_DIRECTORY: DirectoryWhich = B_DESKTOP_DIRECTORY + 1

public val B_SYSTEM_DIRECTORY: DirectoryWhich = 1000

public val B_SYSTEM_ADDONS_DIRECTORY: DirectoryWhich = 1002

public val B_SYSTEM_BOOT_DIRECTORY: DirectoryWhich = B_SYSTEM_ADDONS_DIRECTORY + 1

public val B_SYSTEM_FONTS_DIRECTORY: DirectoryWhich = B_SYSTEM_BOOT_DIRECTORY + 1

public val B_SYSTEM_LIB_DIRECTORY: DirectoryWhich = B_SYSTEM_FONTS_DIRECTORY + 1

public val B_SYSTEM_SERVERS_DIRECTORY: DirectoryWhich = B_SYSTEM_LIB_DIRECTORY + 1

public val B_SYSTEM_APPS_DIRECTORY: DirectoryWhich = B_SYSTEM_SERVERS_DIRECTORY + 1

public val B_SYSTEM_BIN_DIRECTORY: DirectoryWhich = B_SYSTEM_APPS_DIRECTORY + 1

public val B_SYSTEM_DOCUMENTATION_DIRECTORY: DirectoryWhich = 1010

public val B_SYSTEM_PREFERENCES_DIRECTORY: DirectoryWhich = B_SYSTEM_DOCUMENTATION_DIRECTORY + 1

public val B_SYSTEM_TRANSLATORS_DIRECTORY: DirectoryWhich = B_SYSTEM_PREFERENCES_DIRECTORY + 1

public val B_SYSTEM_MEDIA_NODES_DIRECTORY: DirectoryWhich = B_SYSTEM_TRANSLATORS_DIRECTORY + 1

public val B_SYSTEM_SOUNDS_DIRECTORY: DirectoryWhich = B_SYSTEM_MEDIA_NODES_DIRECTORY + 1

public val B_SYSTEM_DATA_DIRECTORY: DirectoryWhich = B_SYSTEM_SOUNDS_DIRECTORY + 1

public val B_SYSTEM_DEVELOP_DIRECTORY: DirectoryWhich = B_SYSTEM_DATA_DIRECTORY + 1

public val B_SYSTEM_PACKAGES_DIRECTORY: DirectoryWhich = B_SYSTEM_DEVELOP_DIRECTORY + 1

public val B_SYSTEM_HEADERS_DIRECTORY: DirectoryWhich = B_SYSTEM_PACKAGES_DIRECTORY + 1

public val B_SYSTEM_ETC_DIRECTORY: DirectoryWhich = 2008

public val B_SYSTEM_SETTINGS_DIRECTORY: DirectoryWhich = 2010

public val B_SYSTEM_LOG_DIRECTORY: DirectoryWhich = 2012

public val B_SYSTEM_SPOOL_DIRECTORY: DirectoryWhich = B_SYSTEM_LOG_DIRECTORY + 1

public val B_SYSTEM_TEMP_DIRECTORY: DirectoryWhich = B_SYSTEM_SPOOL_DIRECTORY + 1

public val B_SYSTEM_VAR_DIRECTORY: DirectoryWhich = B_SYSTEM_TEMP_DIRECTORY + 1

public val B_SYSTEM_CACHE_DIRECTORY: DirectoryWhich = 2020

public val B_SYSTEM_NONPACKAGED_DIRECTORY: DirectoryWhich = 2023

public val B_SYSTEM_NONPACKAGED_ADDONS_DIRECTORY: DirectoryWhich = B_SYSTEM_NONPACKAGED_DIRECTORY + 1

public val B_SYSTEM_NONPACKAGED_TRANSLATORS_DIRECTORY: DirectoryWhich = B_SYSTEM_NONPACKAGED_ADDONS_DIRECTORY + 1

public val B_SYSTEM_NONPACKAGED_MEDIA_NODES_DIRECTORY: DirectoryWhich = B_SYSTEM_NONPACKAGED_TRANSLATORS_DIRECTORY + 1

public val B_SYSTEM_NONPACKAGED_BIN_DIRECTORY: DirectoryWhich = B_SYSTEM_NONPACKAGED_MEDIA_NODES_DIRECTORY + 1

public val B_SYSTEM_NONPACKAGED_DATA_DIRECTORY: DirectoryWhich = B_SYSTEM_NONPACKAGED_BIN_DIRECTORY + 1

public val B_SYSTEM_NONPACKAGED_FONTS_DIRECTORY: DirectoryWhich = B_SYSTEM_NONPACKAGED_DATA_DIRECTORY + 1

public val B_SYSTEM_NONPACKAGED_SOUNDS_DIRECTORY: DirectoryWhich = B_SYSTEM_NONPACKAGED_FONTS_DIRECTORY + 1

public val B_SYSTEM_NONPACKAGED_DOCUMENTATION_DIRECTORY: DirectoryWhich = B_SYSTEM_NONPACKAGED_SOUNDS_DIRECTORY + 1

public val B_SYSTEM_NONPACKAGED_LIB_DIRECTORY: DirectoryWhich = B_SYSTEM_NONPACKAGED_DOCUMENTATION_DIRECTORY + 1

public val B_SYSTEM_NONPACKAGED_HEADERS_DIRECTORY: DirectoryWhich = B_SYSTEM_NONPACKAGED_LIB_DIRECTORY + 1

public val B_SYSTEM_NONPACKAGED_DEVELOP_DIRECTORY: DirectoryWhich = B_SYSTEM_NONPACKAGED_HEADERS_DIRECTORY + 1

public val B_USER_DIRECTORY: DirectoryWhich = 3000

public val B_USER_CONFIG_DIRECTORY: DirectoryWhich = B_USER_DIRECTORY + 1

public val B_USER_ADDONS_DIRECTORY: DirectoryWhich = B_USER_CONFIG_DIRECTORY + 1

public val B_USER_BOOT_DIRECTORY: DirectoryWhich = B_USER_ADDONS_DIRECTORY + 1

public val B_USER_FONTS_DIRECTORY: DirectoryWhich = B_USER_BOOT_DIRECTORY + 1

public val B_USER_LIB_DIRECTORY: DirectoryWhich = B_USER_FONTS_DIRECTORY + 1

public val B_USER_SETTINGS_DIRECTORY: DirectoryWhich = B_USER_LIB_DIRECTORY + 1

public val B_USER_DESKBAR_DIRECTORY: DirectoryWhich = B_USER_SETTINGS_DIRECTORY + 1

public val B_USER_PRINTERS_DIRECTORY: DirectoryWhich = B_USER_DESKBAR_DIRECTORY + 1

public val B_USER_TRANSLATORS_DIRECTORY: DirectoryWhich = B_USER_PRINTERS_DIRECTORY + 1

public val B_USER_MEDIA_NODES_DIRECTORY: DirectoryWhich = B_USER_TRANSLATORS_DIRECTORY + 1

public val B_USER_SOUNDS_DIRECTORY: DirectoryWhich = B_USER_MEDIA_NODES_DIRECTORY + 1

public val B_USER_DATA_DIRECTORY: DirectoryWhich = B_USER_SOUNDS_DIRECTORY + 1

public val B_USER_CACHE_DIRECTORY: DirectoryWhich = B_USER_DATA_DIRECTORY + 1

public val B_USER_PACKAGES_DIRECTORY: DirectoryWhich = B_USER_CACHE_DIRECTORY + 1

public val B_USER_HEADERS_DIRECTORY: DirectoryWhich = B_USER_PACKAGES_DIRECTORY + 1

public val B_USER_NONPACKAGED_DIRECTORY: DirectoryWhich = B_USER_HEADERS_DIRECTORY + 1

public val B_USER_NONPACKAGED_ADDONS_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_DIRECTORY + 1

public val B_USER_NONPACKAGED_TRANSLATORS_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_ADDONS_DIRECTORY + 1

public val B_USER_NONPACKAGED_MEDIA_NODES_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_TRANSLATORS_DIRECTORY + 1

public val B_USER_NONPACKAGED_BIN_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_MEDIA_NODES_DIRECTORY + 1

public val B_USER_NONPACKAGED_DATA_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_BIN_DIRECTORY + 1

public val B_USER_NONPACKAGED_FONTS_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_DATA_DIRECTORY + 1

public val B_USER_NONPACKAGED_SOUNDS_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_FONTS_DIRECTORY + 1

public val B_USER_NONPACKAGED_DOCUMENTATION_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_SOUNDS_DIRECTORY + 1

public val B_USER_NONPACKAGED_LIB_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_DOCUMENTATION_DIRECTORY + 1

public val B_USER_NONPACKAGED_HEADERS_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_LIB_DIRECTORY + 1

public val B_USER_NONPACKAGED_DEVELOP_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_HEADERS_DIRECTORY + 1

public val B_USER_DEVELOP_DIRECTORY: DirectoryWhich = B_USER_NONPACKAGED_DEVELOP_DIRECTORY + 1

public val B_USER_DOCUMENTATION_DIRECTORY: DirectoryWhich = B_USER_DEVELOP_DIRECTORY + 1

public val B_USER_SERVERS_DIRECTORY: DirectoryWhich = B_USER_DOCUMENTATION_DIRECTORY + 1

public val B_USER_APPS_DIRECTORY: DirectoryWhich = B_USER_SERVERS_DIRECTORY + 1

public val B_USER_BIN_DIRECTORY: DirectoryWhich = B_USER_APPS_DIRECTORY + 1

public val B_USER_PREFERENCES_DIRECTORY: DirectoryWhich = B_USER_BIN_DIRECTORY + 1

public val B_USER_ETC_DIRECTORY: DirectoryWhich = B_USER_PREFERENCES_DIRECTORY + 1

public val B_USER_LOG_DIRECTORY: DirectoryWhich = B_USER_ETC_DIRECTORY + 1

public val B_USER_SPOOL_DIRECTORY: DirectoryWhich = B_USER_LOG_DIRECTORY + 1

public val B_USER_VAR_DIRECTORY: DirectoryWhich = B_USER_SPOOL_DIRECTORY + 1

public val B_APPS_DIRECTORY: DirectoryWhich = 4000

public val B_PREFERENCES_DIRECTORY: DirectoryWhich = B_APPS_DIRECTORY + 1

public val B_UTILITIES_DIRECTORY: DirectoryWhich = B_PREFERENCES_DIRECTORY + 1

public val B_PACKAGE_LINKS_DIRECTORY: DirectoryWhich = B_UTILITIES_DIRECTORY + 1

public typealias TopologyLevelType = CEnumRepr

public val B_TOPOLOGY_UNKNOWN: TopologyLevelType = 0

public val B_TOPOLOGY_ROOT: TopologyLevelType = B_TOPOLOGY_UNKNOWN + 1

public val B_TOPOLOGY_SMT: TopologyLevelType = B_TOPOLOGY_ROOT + 1

public val B_TOPOLOGY_CORE: TopologyLevelType = B_TOPOLOGY_SMT + 1

public val B_TOPOLOGY_PACKAGE: TopologyLevelType = B_TOPOLOGY_CORE + 1

public typealias CpuPlatform = CEnumRepr

public val B_CPU_UNKNOWN: CpuPlatform = 0

public val B_CPU_X86: CpuPlatform = B_CPU_UNKNOWN + 1

public val B_CPU_X86_64: CpuPlatform = B_CPU_X86 + 1

public val B_CPU_PPC: CpuPlatform = B_CPU_X86_64 + 1

public val B_CPU_PPC_64: CpuPlatform = B_CPU_PPC + 1

public val B_CPU_M68K: CpuPlatform = B_CPU_PPC_64 + 1

public val B_CPU_ARM: CpuPlatform = B_CPU_M68K + 1

public val B_CPU_ARM_64: CpuPlatform = B_CPU_ARM + 1

public val B_CPU_ALPHA: CpuPlatform = B_CPU_ARM_64 + 1

public val B_CPU_MIPS: CpuPlatform = B_CPU_ALPHA + 1

public val B_CPU_SH: CpuPlatform = B_CPU_MIPS + 1

public val B_CPU_SPARC: CpuPlatform = B_CPU_SH + 1

public val B_CPU_RISC_V: CpuPlatform = B_CPU_SPARC + 1

public typealias CpuVendor = CEnumRepr

public val B_CPU_VENDOR_UNKNOWN: CpuVendor = 0

public val B_CPU_VENDOR_AMD: CpuVendor = B_CPU_VENDOR_UNKNOWN + 1

public val B_CPU_VENDOR_CYRIX: CpuVendor = B_CPU_VENDOR_AMD + 1

public val B_CPU_VENDOR_IDT: CpuVendor = B_CPU_VENDOR_CYRIX + 1

public val B_CPU_VENDOR_INTEL: CpuVendor = B_CPU_VENDOR_IDT + 1

public val B_CPU_VENDOR_NATIONAL_SEMICONDUCTOR: CpuVendor = B_CPU_VENDOR_INTEL + 1

public val B_CPU_VENDOR_RISE: CpuVendor = B_CPU_VENDOR_NATIONAL_SEMICONDUCTOR + 1

public val B_CPU_VENDOR_TRANSMETA: CpuVendor = B_CPU_VENDOR_RISE + 1

public val B_CPU_VENDOR_VIA: CpuVendor = B_CPU_VENDOR_TRANSMETA + 1

public val B_CPU_VENDOR_IBM: CpuVendor = B_CPU_VENDOR_VIA + 1

public val B_CPU_VENDOR_MOTOROLA: CpuVendor = B_CPU_VENDOR_IBM + 1

public val B_CPU_VENDOR_NEC: CpuVendor = B_CPU_VENDOR_MOTOROLA + 1

public val B_CPU_VENDOR_HYGON: CpuVendor = B_CPU_VENDOR_NEC + 1

public val B_CPU_VENDOR_SUN: CpuVendor = B_CPU_VENDOR_HYGON + 1

public val B_CPU_VENDOR_FUJITSU: CpuVendor = B_CPU_VENDOR_SUN + 1

// kernel/OS.h
public data class AreaInfo(
    public var area: AreaId = 0,
    public var name: UByteArray = UByteArray(B_OS_NAME_LENGTH),
    public var size: Int = 0,
    public var lock: UInt = 0u,
    public var protection: UInt = 0u,
    public var team: TeamId = 0,
    public var ramSize: UInt = 0u,
    public var copyCount: UInt = 0u,
    public var inCount: UInt = 0u,
    public var outCount: UInt = 0u,
    public var address: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AreaInfo) return false
        if (this.area != other.area) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.size != other.size) return false
        if (this.lock != other.lock) return false
        if (this.protection != other.protection) return false
        if (this.team != other.team) return false
        if (this.ramSize != other.ramSize) return false
        if (this.copyCount != other.copyCount) return false
        if (this.inCount != other.inCount) return false
        if (this.outCount != other.outCount) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.area.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.lock.hashCode()
        result = 31 * result + this.protection.hashCode()
        result = 31 * result + this.team.hashCode()
        result = 31 * result + this.ramSize.hashCode()
        result = 31 * result + this.copyCount.hashCode()
        result = 31 * result + this.inCount.hashCode()
        result = 31 * result + this.outCount.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }
}

public data class PortInfo(
    public var port: PortId = 0,
    public var team: TeamId = 0,
    public var name: UByteArray = UByteArray(B_OS_NAME_LENGTH),
    public var capacity: Int = 0,
    public var queueCount: Int = 0,
    public var totalCount: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PortInfo) return false
        if (this.port != other.port) return false
        if (this.team != other.team) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.capacity != other.capacity) return false
        if (this.queueCount != other.queueCount) return false
        if (this.totalCount != other.totalCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.port.hashCode()
        result = 31 * result + this.team.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.capacity.hashCode()
        result = 31 * result + this.queueCount.hashCode()
        result = 31 * result + this.totalCount.hashCode()
        return result
    }
}

public data class PortMessageInfo(
    public var size: SizeT = 0uL,
    public var sender: UidT = 0u,
    public var senderGroup: GidT = 0u,
    public var senderTeam: TeamId = 0,
)

public data class TeamInfo(
    public var team: TeamId = 0,
    public var threadCount: Int = 0,
    public var imageCount: Int = 0,
    public var areaCount: Int = 0,
    public var debuggerNubThread: ThreadId = 0,
    public var debuggerNubPort: PortId = 0,
    public var argc: Int = 0,
    public var args: UByteArray = UByteArray(64),
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TeamInfo) return false
        if (this.team != other.team) return false
        if (this.threadCount != other.threadCount) return false
        if (this.imageCount != other.imageCount) return false
        if (this.areaCount != other.areaCount) return false
        if (this.debuggerNubThread != other.debuggerNubThread) return false
        if (this.debuggerNubPort != other.debuggerNubPort) return false
        if (this.argc != other.argc) return false
        if (!this.args.contentEquals(other.args)) return false
        if (this.uid != other.uid) return false
        if (this.gid != other.gid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.team.hashCode()
        result = 31 * result + this.threadCount.hashCode()
        result = 31 * result + this.imageCount.hashCode()
        result = 31 * result + this.areaCount.hashCode()
        result = 31 * result + this.debuggerNubThread.hashCode()
        result = 31 * result + this.debuggerNubPort.hashCode()
        result = 31 * result + this.argc.hashCode()
        result = 31 * result + this.args.contentHashCode()
        result = 31 * result + this.uid.hashCode()
        result = 31 * result + this.gid.hashCode()
        return result
    }
}

public data class SemInfo(
    public var sem: SemId = 0,
    public var team: TeamId = 0,
    public var name: UByteArray = UByteArray(B_OS_NAME_LENGTH),
    public var count: Int = 0,
    public var latestHolder: ThreadId = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemInfo) return false
        if (this.sem != other.sem) return false
        if (this.team != other.team) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.count != other.count) return false
        if (this.latestHolder != other.latestHolder) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sem.hashCode()
        result = 31 * result + this.team.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.latestHolder.hashCode()
        return result
    }
}

public data class TeamUsageInfo(public var userTime: BigtimeT = 0L, public var kernelTime: BigtimeT = 0L)

public data class ThreadInfo(
    public var thread: ThreadId = 0,
    public var team: TeamId = 0,
    public var name: UByteArray = UByteArray(B_OS_NAME_LENGTH),
    public var state: ThreadState = 0,
    public var priority: Int = 0,
    public var sem: SemId = 0,
    public var userTime: BigtimeT = 0L,
    public var kernelTime: BigtimeT = 0L,
    public var stackBase: COpaquePointer? = null,
    public var stackEnd: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ThreadInfo) return false
        if (this.thread != other.thread) return false
        if (this.team != other.team) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.state != other.state) return false
        if (this.priority != other.priority) return false
        if (this.sem != other.sem) return false
        if (this.userTime != other.userTime) return false
        if (this.kernelTime != other.kernelTime) return false
        if (this.stackBase != other.stackBase) return false
        if (this.stackEnd != other.stackEnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.thread.hashCode()
        result = 31 * result + this.team.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.sem.hashCode()
        result = 31 * result + this.userTime.hashCode()
        result = 31 * result + this.kernelTime.hashCode()
        result = 31 * result + this.stackBase.hashCode()
        result = 31 * result + this.stackEnd.hashCode()
        return result
    }
}

public data class CpuInfo(
    public var activeTime: BigtimeT = 0L,
    public var enabled: Boolean = false,
    public var currentFrequency: ULong = 0uL,
)

public class SystemInfo(
    public var bootTime: BigtimeT = 0L,
    public var cpuCount: UInt = 0u,
    public var maxPages: ULong = 0uL,
    public var usedPages: ULong = 0uL,
    public var cachedPages: ULong = 0uL,
    public var blockCachePages: ULong = 0uL,
    public var ignoredPages: ULong = 0uL,
    public var neededMemory: ULong = 0uL,
    public var freeMemory: ULong = 0uL,
    public var maxSwapPages: ULong = 0uL,
    public var freeSwapPages: ULong = 0uL,
    public var pageFaults: UInt = 0u,
    public var maxSems: UInt = 0u,
    public var usedSems: UInt = 0u,
    public var maxPorts: UInt = 0u,
    public var usedPorts: UInt = 0u,
    public var maxThreads: UInt = 0u,
    public var usedThreads: UInt = 0u,
    public var maxTeams: UInt = 0u,
    public var usedTeams: UInt = 0u,
    public var kernelName: UByteArray = UByteArray(B_FILE_NAME_LENGTH),
    public var kernelBuildDate: UByteArray = UByteArray(B_OS_NAME_LENGTH),
    public var kernelBuildTime: UByteArray = UByteArray(B_OS_NAME_LENGTH),
    public var kernelVersion: Long = 0L,
    public var abi: UInt = 0u,
)

public data class ObjectWaitInfo(
    public var obj: Int = 0,
    public var type: UShort = 0u,
    public var events: UShort = 0u,
)

public data class CpuTopologyRootInfo(public var platform: CpuPlatform = 0)

public data class CpuTopologyPackageInfo(public var vendor: CpuVendor = 0, public var cacheLineSize: UInt = 0u)

public data class CpuTopologyCoreInfo(public var model: UInt = 0u, public var defaultFrequency: ULong = 0uL)

// kernel/fsAttr.h
public data class AttrInfo(public var type: UInt = 0u, public var size: OffT = 0L)

// kernel/fsIndex.h
public data class IndexInfo(
    public var type: UInt = 0u,
    public var size: OffT = 0L,
    public var modificationTime: TimeT = 0L,
    public var creationTime: TimeT = 0L,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
)

// kernel/fsInfo.h
public data class FsInfo(
    public var dev: DevT = 0,
    public var root: InoT = 0L,
    public var flags: UInt = 0u,
    public var blockSize: OffT = 0L,
    public var ioSize: OffT = 0L,
    public var totalBlocks: OffT = 0L,
    public var freeBlocks: OffT = 0L,
    public var totalNodes: OffT = 0L,
    public var freeNodes: OffT = 0L,
    public var deviceName: UByteArray = UByteArray(128),
    public var volumeName: UByteArray = UByteArray(B_FILE_NAME_LENGTH),
    public var fshName: UByteArray = UByteArray(B_OS_NAME_LENGTH),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsInfo) return false
        if (this.dev != other.dev) return false
        if (this.root != other.root) return false
        if (this.flags != other.flags) return false
        if (this.blockSize != other.blockSize) return false
        if (this.ioSize != other.ioSize) return false
        if (this.totalBlocks != other.totalBlocks) return false
        if (this.freeBlocks != other.freeBlocks) return false
        if (this.totalNodes != other.totalNodes) return false
        if (this.freeNodes != other.freeNodes) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        if (!this.volumeName.contentEquals(other.volumeName)) return false
        if (!this.fshName.contentEquals(other.fshName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dev.hashCode()
        result = 31 * result + this.root.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.blockSize.hashCode()
        result = 31 * result + this.ioSize.hashCode()
        result = 31 * result + this.totalBlocks.hashCode()
        result = 31 * result + this.freeBlocks.hashCode()
        result = 31 * result + this.totalNodes.hashCode()
        result = 31 * result + this.freeNodes.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        result = 31 * result + this.volumeName.contentHashCode()
        result = 31 * result + this.fshName.contentHashCode()
        return result
    }
}

public data class ImageInfo(
    public var id: ImageId = 0,
    public var imageType: CInt = 0,
    public var sequence: Int = 0,
    public var initOrder: Int = 0,
    // Note(1.0): these should be made optional
    public var initRoutine: ImageInfoInitRoutineCallback = ImageInfoInitRoutineCallback {},
    public var termRoutine: ImageInfoInitRoutineCallback = ImageInfoInitRoutineCallback {},
    public var device: DevT = 0,
    public var node: InoT = 0L,
    public var name: UByteArray = UByteArray(PATH_MAX),
    public var text: COpaquePointer? = null,
    public var data: COpaquePointer? = null,
    public var textSize: Int = 0,
    public var dataSize: Int = 0,
    public var apiVersion: Int = 0,
    public var abi: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageInfo) return false
        if (this.id != other.id) return false
        if (this.imageType != other.imageType) return false
        if (this.sequence != other.sequence) return false
        if (this.initOrder != other.initOrder) return false
        if (this.initRoutine != other.initRoutine) return false
        if (this.termRoutine != other.termRoutine) return false
        if (this.device != other.device) return false
        if (this.node != other.node) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.text != other.text) return false
        if (this.data != other.data) return false
        if (this.textSize != other.textSize) return false
        if (this.dataSize != other.dataSize) return false
        if (this.apiVersion != other.apiVersion) return false
        if (this.abi != other.abi) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.imageType.hashCode()
        result = 31 * result + this.sequence.hashCode()
        result = 31 * result + this.initOrder.hashCode()
        result = 31 * result + this.initRoutine.hashCode()
        result = 31 * result + this.termRoutine.hashCode()
        result = 31 * result + this.device.hashCode()
        result = 31 * result + this.node.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.text.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.textSize.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.apiVersion.hashCode()
        result = 31 * result + this.abi.hashCode()
        return result
    }
}

public data class CAnonymousEax0(public var maxEax: UInt = 0u, public var vendorId: UByteArray = UByteArray(12)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousEax0) return false
        if (this.maxEax != other.maxEax) return false
        if (!this.vendorId.contentEquals(other.vendorId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxEax.hashCode()
        result = 31 * result + this.vendorId.contentHashCode()
        return result
    }
}

public data class CAnonymousEax1(
    public var stepping: UInt = 0u,
    public var model: UInt = 0u,
    public var family: UInt = 0u,
    public var tpe: UInt = 0u,
    public var reserved0: UInt = 0u,
    public var extendedModel: UInt = 0u,
    public var extendedFamily: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var brandIndex: UInt = 0u,
    public var clflush: UInt = 0u,
    public var logicalCpus: UInt = 0u,
    public var apicId: UInt = 0u,
    public var features: UInt = 0u,
    public var extendedFeatures: UInt = 0u,
)

public data class CAnonymousEax2(public var callNum: UByte = 0u, public var cacheDescriptors: UByteArray = UByteArray(15)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousEax2) return false
        if (this.callNum != other.callNum) return false
        if (!this.cacheDescriptors.contentEquals(other.cacheDescriptors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.callNum.hashCode()
        result = 31 * result + this.cacheDescriptors.contentHashCode()
        return result
    }
}

public data class CAnonymousEax3(
    public var reserved: UIntArray = UIntArray(2),
    public var serialNumberHigh: UInt = 0u,
    public var serialNumberLow: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousEax3) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.serialNumberHigh != other.serialNumberHigh) return false
        if (this.serialNumberLow != other.serialNumberLow) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.contentHashCode()
        result = 31 * result + this.serialNumberHigh.hashCode()
        result = 31 * result + this.serialNumberLow.hashCode()
        return result
    }
}

public data class CAnonymousRegs(
    public var eax: UInt = 0u,
    public var ebx: UInt = 0u,
    public var edx: UInt = 0u,
    public var ecx: UInt = 0u,
)

public data class CpuTopologyNodeInfo(
    public var id: UInt = 0u,
    public var type: TopologyLevelType = 0,
    public var level: UInt = 0u,
    public var data: CAnonymousCpuTopologyInfoData = CAnonymousCpuTopologyInfoData(),
)

public data class CpuidInfo(
    public var eax0: CAnonymousEax0 = CAnonymousEax0(),
    public var eax1: CAnonymousEax1 = CAnonymousEax1(),
    public var eax2: CAnonymousEax2 = CAnonymousEax2(),
    public var eax3: CAnonymousEax3 = CAnonymousEax3(),
    public var asChars: UByteArray = UByteArray(16),
    public var regs: CAnonymousRegs = CAnonymousRegs(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuidInfo) return false
        if (this.eax0 != other.eax0) return false
        if (this.eax1 != other.eax1) return false
        if (this.eax2 != other.eax2) return false
        if (this.eax3 != other.eax3) return false
        if (!this.asChars.contentEquals(other.asChars)) return false
        if (this.regs != other.regs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eax0.hashCode()
        result = 31 * result + this.eax1.hashCode()
        result = 31 * result + this.eax2.hashCode()
        result = 31 * result + this.eax3.hashCode()
        result = 31 * result + this.asChars.contentHashCode()
        result = 31 * result + this.regs.hashCode()
        return result
    }

    public fun eq(other: CpuidInfo): Boolean {
        return this.eax0 == other.eax0 || this.eax1 == other.eax1 || this.eax2 == other.eax2 || this.eax3 == other.eax3 || this.asChars.contentEquals(other.asChars) || this.regs == other.regs
    }
}

public data class CAnonymousCpuTopologyInfoData(
    public var root: CpuTopologyRootInfo = CpuTopologyRootInfo(),
    public var pkg: CpuTopologyPackageInfo = CpuTopologyPackageInfo(),
    public var core: CpuTopologyCoreInfo = CpuTopologyCoreInfo(),
) {
    public fun eq(other: CAnonymousCpuTopologyInfoData): Boolean {
        return this.root == other.root || this.pkg == other.pkg || this.core == other.core
    }

    public override fun hashCode(): Int {
        var state = 0
        error("traits")
        return state
    }
}

// kernel/OS.h
public val B_OS_NAME_LENGTH: Int = 32

public val B_PAGE_SIZE: Int = 4096

public val B_INFINITE_TIMEOUT: Int = 9223372036854775807L.toInt()

public val B_RELATIVE_TIMEOUT: UInt = 0x8u

public val B_ABSOLUTE_TIMEOUT: UInt = 0x10u

public val B_TIMEOUT_REAL_TIME_BASE: UInt = 0x40u

public val B_ABSOLUTE_REAL_TIME_TIMEOUT: UInt = B_ABSOLUTE_TIMEOUT or B_TIMEOUT_REAL_TIME_BASE

public val B_NO_LOCK: UInt = 0u

public val B_LAZY_LOCK: UInt = 1u

public val B_FULL_LOCK: UInt = 2u

public val B_CONTIGUOUS: UInt = 3u

public val B_LOMEM: UInt = 4u

public val B_32_BIT_FULL_LOCK: UInt = 5u

public val B_32_BIT_CONTIGUOUS: UInt = 6u

public val B_ANY_ADDRESS: UInt = 0u

public val B_EXACT_ADDRESS: UInt = 1u

public val B_BASE_ADDRESS: UInt = 2u

public val B_CLONE_ADDRESS: UInt = 3u

public val B_ANY_KERNEL_ADDRESS: UInt = 4u

public val B_RANDOMIZED_ANY_ADDRESS: UInt = 6u

public val B_RANDOMIZED_BASE_ADDRESS: UInt = 7u

public val B_READ_AREA: UInt = 1u shl 0

public val B_WRITE_AREA: UInt = 1u shl 1

public val B_EXECUTE_AREA: UInt = 1u shl 2

public val B_STACK_AREA: UInt = 1u shl 3

public val B_CLONEABLE_AREA: UInt = 1u shl 8

public val B_CAN_INTERRUPT: UInt = 0x01u

public val B_CHECK_PERMISSION: UInt = 0x04u

public val B_KILL_CAN_INTERRUPT: UInt = 0x20u

public val B_DO_NOT_RESCHEDULE: UInt = 0x02u

public val B_RELEASE_ALL: UInt = 0x08u

public val B_RELEASE_IF_WAITING_ONLY: UInt = 0x10u

public val B_CURRENT_TEAM: TeamId = 0

public val B_SYSTEM_TEAM: TeamId = 1

public val B_TEAM_USAGE_SELF: Int = 0

public val B_TEAM_USAGE_CHILDREN: Int = -1

public val B_IDLE_PRIORITY: Int = 0

public val B_LOWEST_ACTIVE_PRIORITY: Int = 1

public val B_LOW_PRIORITY: Int = 5

public val B_NORMAL_PRIORITY: Int = 10

public val B_DISPLAY_PRIORITY: Int = 15

public val B_URGENT_DISPLAY_PRIORITY: Int = 20

public val B_REAL_TIME_DISPLAY_PRIORITY: Int = 100

public val B_URGENT_PRIORITY: Int = 110

public val B_REAL_TIME_PRIORITY: Int = 120

public val B_SYSTEM_TIMEBASE: Int = 0

public val B_FIRST_REAL_TIME_PRIORITY: Int = B_REAL_TIME_DISPLAY_PRIORITY

public val B_ONE_SHOT_ABSOLUTE_ALARM: UInt = 1u

public val B_ONE_SHOT_RELATIVE_ALARM: UInt = 2u

public val B_PERIODIC_ALARM: UInt = 3u

public val B_OBJECT_TYPE_FD: UShort = 0u

public val B_OBJECT_TYPE_SEMAPHORE: UShort = 1u

public val B_OBJECT_TYPE_PORT: UShort = 2u

public val B_OBJECT_TYPE_THREAD: UShort = 3u

public val B_EVENT_READ: UShort = 0x0001u

public val B_EVENT_WRITE: UShort = 0x0002u

public val B_EVENT_ERROR: UShort = 0x0004u

public val B_EVENT_PRIORITY_READ: UShort = 0x0008u

public val B_EVENT_PRIORITY_WRITE: UShort = 0x0010u

public val B_EVENT_HIGH_PRIORITY_READ: UShort = 0x0020u

public val B_EVENT_HIGH_PRIORITY_WRITE: UShort = 0x0040u

public val B_EVENT_DISCONNECTED: UShort = 0x0080u

public val B_EVENT_ACQUIRE_SEMAPHORE: UShort = 0x0001u

public val B_EVENT_INVALID: UShort = 0x1000u

// kernel/fsInfo.h
public val B_FS_IS_READONLY: UInt = 0x00000001u

public val B_FS_IS_REMOVABLE: UInt = 0x00000002u

public val B_FS_IS_PERSISTENT: UInt = 0x00000004u

public val B_FS_IS_SHARED: UInt = 0x00000008u

public val B_FS_HAS_MIME: UInt = 0x00010000u

public val B_FS_HAS_ATTR: UInt = 0x00020000u

public val B_FS_HAS_QUERY: UInt = 0x00040000u

public val B_FS_HAS_SELF_HEALING_LINKS: UInt = 0x00080000u

public val B_FS_HAS_ALIASES: UInt = 0x00100000u

public val B_FS_SUPPORTS_NODE_MONITORING: UInt = 0x00200000u

public val B_FS_SUPPORTS_MONITOR_CHILDREN: UInt = 0x00400000u

// kernel/fsQuery.h
public val B_LIVE_QUERY: UInt = 0x00000001u

public val B_QUERY_NON_INDEXED: UInt = 0x00000002u

// kernel/fsVolume.h
public val B_MOUNT_READ_ONLY: UInt = 1u

public val B_MOUNT_VIRTUAL_DEVICE: UInt = 2u

public val B_FORCE_UNMOUNT: UInt = 1u

// kernel/image.h
public val B_FLUSH_DCACHE: UInt = 0x0001u

public val B_FLUSH_ICACHE: UInt = 0x0004u

public val B_INVALIDATE_DCACHE: UInt = 0x0002u

public val B_INVALIDATE_ICACHE: UInt = 0x0008u

public val B_SYMBOL_TYPE_DATA: Int = 0x1

public val B_SYMBOL_TYPE_TEXT: Int = 0x2

public val B_SYMBOL_TYPE_ANY: Int = 0x5

// storage/StorageDefs.h
public val B_DEV_NAME_LENGTH: Int = 128

public val B_FILE_NAME_LENGTH: Int = FILENAME_MAX.toInt()

public val B_PATH_NAME_LENGTH: Int = PATH_MAX

public val B_ATTR_NAME_LENGTH: Int = B_FILE_NAME_LENGTH - 1

public val B_MIME_TYPE_LENGTH: Int = B_ATTR_NAME_LENGTH - 15

public val B_MAX_SYMLINKS: Int = 16

// Haiku open modes in BFile are passed as u32
public val B_READ_ONLY: UInt = O_RDONLY.toUInt()

public val B_WRITE_ONLY: UInt = O_WRONLY.toUInt()

public val B_READ_WRITE: UInt = O_RDWR.toUInt()

public val B_FAIL_IF_EXISTS: UInt = O_EXCL.toUInt()

public val B_CREATE_FILE: UInt = O_CREAT.toUInt()

public val B_ERASE_FILE: UInt = O_TRUNC.toUInt()

public val B_OPEN_AT_END: UInt = O_APPEND.toUInt()

public val B_FILE_NODE: UInt = 0x01u

public val B_SYMLINK_NODE: UInt = 0x02u

public val B_DIRECTORY_NODE: UInt = 0x04u

public val B_ANY_NODE: UInt = 0x07u

// support/Errors.h
public val B_GENERAL_ERROR_BASE: StatusT = Int.MIN_VALUE

public val B_OS_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x1000

public val B_APP_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x2000

public val B_INTERFACE_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x3000

public val B_MEDIA_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x4000

public val B_TRANSLATION_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x4800

public val B_MIDI_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x5000

public val B_STORAGE_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x6000

public val B_POSIX_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x7000

public val B_MAIL_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x8000

public val B_PRINT_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0x9000

public val B_DEVICE_ERROR_BASE: StatusT = B_GENERAL_ERROR_BASE + 0xa000

public val B_ERRORS_END: StatusT = B_GENERAL_ERROR_BASE + 0xffff

// General errors
public val B_NO_MEMORY: StatusT = B_GENERAL_ERROR_BASE + 0

public val B_IO_ERROR: StatusT = B_GENERAL_ERROR_BASE + 1

public val B_PERMISSION_DENIED: StatusT = B_GENERAL_ERROR_BASE + 2

public val B_BAD_INDEX: StatusT = B_GENERAL_ERROR_BASE + 3

public val B_BAD_TYPE: StatusT = B_GENERAL_ERROR_BASE + 4

public val B_BAD_VALUE: StatusT = B_GENERAL_ERROR_BASE + 5

public val B_MISMATCHED_VALUES: StatusT = B_GENERAL_ERROR_BASE + 6

public val B_NAME_NOT_FOUND: StatusT = B_GENERAL_ERROR_BASE + 7

public val B_NAME_IN_USE: StatusT = B_GENERAL_ERROR_BASE + 8

public val B_TIMED_OUT: StatusT = B_GENERAL_ERROR_BASE + 9

public val B_INTERRUPTED: StatusT = B_GENERAL_ERROR_BASE + 10

public val B_WOULD_BLOCK: StatusT = B_GENERAL_ERROR_BASE + 11

public val B_CANCELED: StatusT = B_GENERAL_ERROR_BASE + 12

public val B_NO_INIT: StatusT = B_GENERAL_ERROR_BASE + 13

public val B_NOT_INITIALIZED: StatusT = B_GENERAL_ERROR_BASE + 13

public val B_BUSY: StatusT = B_GENERAL_ERROR_BASE + 14

public val B_NOT_ALLOWED: StatusT = B_GENERAL_ERROR_BASE + 15

public val B_BAD_DATA: StatusT = B_GENERAL_ERROR_BASE + 16

public val B_DONT_DO_THAT: StatusT = B_GENERAL_ERROR_BASE + 17

public val B_ERROR: StatusT = -1

public val B_OK: StatusT = 0

public val B_NO_ERROR: StatusT = 0

// Kernel kit errors
public val B_BAD_SEM_ID: StatusT = B_OS_ERROR_BASE + 0

public val B_NO_MORE_SEMS: StatusT = B_OS_ERROR_BASE + 1

public val B_BAD_THREAD_ID: StatusT = B_OS_ERROR_BASE + 0x100

public val B_NO_MORE_THREADS: StatusT = B_OS_ERROR_BASE + 0x101

public val B_BAD_THREAD_STATE: StatusT = B_OS_ERROR_BASE + 0x102

public val B_BAD_TEAM_ID: StatusT = B_OS_ERROR_BASE + 0x103

public val B_NO_MORE_TEAMS: StatusT = B_OS_ERROR_BASE + 0x104

public val B_BAD_PORT_ID: StatusT = B_OS_ERROR_BASE + 0x200

public val B_NO_MORE_PORTS: StatusT = B_OS_ERROR_BASE + 0x201

public val B_BAD_IMAGE_ID: StatusT = B_OS_ERROR_BASE + 0x300

public val B_BAD_ADDRESS: StatusT = B_OS_ERROR_BASE + 0x301

public val B_NOT_AN_EXECUTABLE: StatusT = B_OS_ERROR_BASE + 0x302

public val B_MISSING_LIBRARY: StatusT = B_OS_ERROR_BASE + 0x303

public val B_MISSING_SYMBOL: StatusT = B_OS_ERROR_BASE + 0x304

public val B_UNKNOWN_EXECUTABLE: StatusT = B_OS_ERROR_BASE + 0x305

public val B_LEGACY_EXECUTABLE: StatusT = B_OS_ERROR_BASE + 0x306

public val B_DEBUGGER_ALREADY_INSTALLED: StatusT = B_OS_ERROR_BASE + 0x400

// Application kit errors
public val B_BAD_REPLY: StatusT = B_APP_ERROR_BASE + 0

public val B_DUPLICATE_REPLY: StatusT = B_APP_ERROR_BASE + 1

public val B_MESSAGE_TO_SELF: StatusT = B_APP_ERROR_BASE + 2

public val B_BAD_HANDLER: StatusT = B_APP_ERROR_BASE + 3

public val B_ALREADY_RUNNING: StatusT = B_APP_ERROR_BASE + 4

public val B_LAUNCH_FAILED: StatusT = B_APP_ERROR_BASE + 5

public val B_AMBIGUOUS_APP_LAUNCH: StatusT = B_APP_ERROR_BASE + 6

public val B_UNKNOWN_MIME_TYPE: StatusT = B_APP_ERROR_BASE + 7

public val B_BAD_SCRIPT_SYNTAX: StatusT = B_APP_ERROR_BASE + 8

public val B_LAUNCH_FAILED_NO_RESOLVE_LINK: StatusT = B_APP_ERROR_BASE + 9

public val B_LAUNCH_FAILED_EXECUTABLE: StatusT = B_APP_ERROR_BASE + 10

public val B_LAUNCH_FAILED_APP_NOT_FOUND: StatusT = B_APP_ERROR_BASE + 11

public val B_LAUNCH_FAILED_APP_IN_TRASH: StatusT = B_APP_ERROR_BASE + 12

public val B_LAUNCH_FAILED_NO_PREFERRED_APP: StatusT = B_APP_ERROR_BASE + 13

public val B_LAUNCH_FAILED_FILES_APP_NOT_FOUND: StatusT = B_APP_ERROR_BASE + 14

public val B_BAD_MIME_SNIFFER_RULE: StatusT = B_APP_ERROR_BASE + 15

public val B_NOT_A_MESSAGE: StatusT = B_APP_ERROR_BASE + 16

public val B_SHUTDOWN_CANCELLED: StatusT = B_APP_ERROR_BASE + 17

public val B_SHUTTING_DOWN: StatusT = B_APP_ERROR_BASE + 18

// Storage kit errors
public val B_FILE_ERROR: StatusT = B_STORAGE_ERROR_BASE + 0

public val B_FILE_EXISTS: StatusT = B_STORAGE_ERROR_BASE + 2

public val B_ENTRY_NOT_FOUND: StatusT = B_STORAGE_ERROR_BASE + 3

public val B_NAME_TOO_LONG: StatusT = B_STORAGE_ERROR_BASE + 4

public val B_NOT_A_DIRECTORY: StatusT = B_STORAGE_ERROR_BASE + 5

public val B_DIRECTORY_NOT_EMPTY: StatusT = B_STORAGE_ERROR_BASE + 6

public val B_DEVICE_FULL: StatusT = B_STORAGE_ERROR_BASE + 7

public val B_READ_ONLY_DEVICE: StatusT = B_STORAGE_ERROR_BASE + 8

public val B_IS_A_DIRECTORY: StatusT = B_STORAGE_ERROR_BASE + 9

public val B_NO_MORE_FDS: StatusT = B_STORAGE_ERROR_BASE + 10

public val B_CROSS_DEVICE_LINK: StatusT = B_STORAGE_ERROR_BASE + 11

public val B_LINK_LIMIT: StatusT = B_STORAGE_ERROR_BASE + 12

public val B_BUSTED_PIPE: StatusT = B_STORAGE_ERROR_BASE + 13

public val B_UNSUPPORTED: StatusT = B_STORAGE_ERROR_BASE + 14

public val B_PARTITION_TOO_SMALL: StatusT = B_STORAGE_ERROR_BASE + 15

public val B_PARTIAL_READ: StatusT = B_STORAGE_ERROR_BASE + 16

public val B_PARTIAL_WRITE: StatusT = B_STORAGE_ERROR_BASE + 17

// Mapped posix errors
public val B_BUFFER_OVERFLOW: StatusT = EOVERFLOW

public val B_TOO_MANY_ARGS: StatusT = E2BIG

public val B_FILE_TOO_LARGE: StatusT = EFBIG

public val B_RESULT_NOT_REPRESENTABLE: StatusT = ERANGE

public val B_DEVICE_NOT_FOUND: StatusT = ENODEV

public val B_NOT_SUPPORTED: StatusT = EOPNOTSUPP

// Media kit errors
public val B_STREAM_NOT_FOUND: StatusT = B_MEDIA_ERROR_BASE + 0

public val B_SERVER_NOT_FOUND: StatusT = B_MEDIA_ERROR_BASE + 1

public val B_RESOURCE_NOT_FOUND: StatusT = B_MEDIA_ERROR_BASE + 2

public val B_RESOURCE_UNAVAILABLE: StatusT = B_MEDIA_ERROR_BASE + 3

public val B_BAD_SUBSCRIBER: StatusT = B_MEDIA_ERROR_BASE + 4

public val B_SUBSCRIBER_NOT_ENTERED: StatusT = B_MEDIA_ERROR_BASE + 5

public val B_BUFFER_NOT_AVAILABLE: StatusT = B_MEDIA_ERROR_BASE + 6

public val B_LAST_BUFFER_ERROR: StatusT = B_MEDIA_ERROR_BASE + 7

public val B_MEDIA_SYSTEM_FAILURE: StatusT = B_MEDIA_ERROR_BASE + 100

public val B_MEDIA_BAD_NODE: StatusT = B_MEDIA_ERROR_BASE + 101

public val B_MEDIA_NODE_BUSY: StatusT = B_MEDIA_ERROR_BASE + 102

public val B_MEDIA_BAD_FORMAT: StatusT = B_MEDIA_ERROR_BASE + 103

public val B_MEDIA_BAD_BUFFER: StatusT = B_MEDIA_ERROR_BASE + 104

public val B_MEDIA_TOO_MANY_NODES: StatusT = B_MEDIA_ERROR_BASE + 105

public val B_MEDIA_TOO_MANY_BUFFERS: StatusT = B_MEDIA_ERROR_BASE + 106

public val B_MEDIA_NODE_ALREADY_EXISTS: StatusT = B_MEDIA_ERROR_BASE + 107

public val B_MEDIA_BUFFER_ALREADY_EXISTS: StatusT = B_MEDIA_ERROR_BASE + 108

public val B_MEDIA_CANNOT_SEEK: StatusT = B_MEDIA_ERROR_BASE + 109

public val B_MEDIA_CANNOT_CHANGE_RUN_MODE: StatusT = B_MEDIA_ERROR_BASE + 110

public val B_MEDIA_APP_ALREADY_REGISTERED: StatusT = B_MEDIA_ERROR_BASE + 111

public val B_MEDIA_APP_NOT_REGISTERED: StatusT = B_MEDIA_ERROR_BASE + 112

public val B_MEDIA_CANNOT_RECLAIM_BUFFERS: StatusT = B_MEDIA_ERROR_BASE + 113

public val B_MEDIA_BUFFERS_NOT_RECLAIMED: StatusT = B_MEDIA_ERROR_BASE + 114

public val B_MEDIA_TIME_SOURCE_STOPPED: StatusT = B_MEDIA_ERROR_BASE + 115

public val B_MEDIA_TIME_SOURCE_BUSY: StatusT = B_MEDIA_ERROR_BASE + 116

public val B_MEDIA_BAD_SOURCE: StatusT = B_MEDIA_ERROR_BASE + 117

public val B_MEDIA_BAD_DESTINATION: StatusT = B_MEDIA_ERROR_BASE + 118

public val B_MEDIA_ALREADY_CONNECTED: StatusT = B_MEDIA_ERROR_BASE + 119

public val B_MEDIA_NOT_CONNECTED: StatusT = B_MEDIA_ERROR_BASE + 120

public val B_MEDIA_BAD_CLIP_FORMAT: StatusT = B_MEDIA_ERROR_BASE + 121

public val B_MEDIA_ADDON_FAILED: StatusT = B_MEDIA_ERROR_BASE + 122

public val B_MEDIA_ADDON_DISABLED: StatusT = B_MEDIA_ERROR_BASE + 123

public val B_MEDIA_CHANGE_IN_PROGRESS: StatusT = B_MEDIA_ERROR_BASE + 124

public val B_MEDIA_STALE_CHANGE_COUNT: StatusT = B_MEDIA_ERROR_BASE + 125

public val B_MEDIA_ADDON_RESTRICTED: StatusT = B_MEDIA_ERROR_BASE + 126

public val B_MEDIA_NO_HANDLER: StatusT = B_MEDIA_ERROR_BASE + 127

public val B_MEDIA_DUPLICATE_FORMAT: StatusT = B_MEDIA_ERROR_BASE + 128

public val B_MEDIA_REALTIME_DISABLED: StatusT = B_MEDIA_ERROR_BASE + 129

public val B_MEDIA_REALTIME_UNAVAILABLE: StatusT = B_MEDIA_ERROR_BASE + 130

// Mail kit errors
public val B_MAIL_NO_DAEMON: StatusT = B_MAIL_ERROR_BASE + 0

public val B_MAIL_UNKNOWN_USER: StatusT = B_MAIL_ERROR_BASE + 1

public val B_MAIL_WRONG_PASSWORD: StatusT = B_MAIL_ERROR_BASE + 2

public val B_MAIL_UNKNOWN_HOST: StatusT = B_MAIL_ERROR_BASE + 3

public val B_MAIL_ACCESS_ERROR: StatusT = B_MAIL_ERROR_BASE + 4

public val B_MAIL_UNKNOWN_FIELD: StatusT = B_MAIL_ERROR_BASE + 5

public val B_MAIL_NO_RECIPIENT: StatusT = B_MAIL_ERROR_BASE + 6

public val B_MAIL_INVALID_MAIL: StatusT = B_MAIL_ERROR_BASE + 7

// Print kit errors
public val B_NO_PRINT_SERVER: StatusT = B_PRINT_ERROR_BASE + 0

// Device kit errors
public val B_DEV_INVALID_IOCTL: StatusT = B_DEVICE_ERROR_BASE + 0

public val B_DEV_NO_MEMORY: StatusT = B_DEVICE_ERROR_BASE + 1

public val B_DEV_BAD_DRIVE_NUM: StatusT = B_DEVICE_ERROR_BASE + 2

public val B_DEV_NO_MEDIA: StatusT = B_DEVICE_ERROR_BASE + 3

public val B_DEV_UNREADABLE: StatusT = B_DEVICE_ERROR_BASE + 4

public val B_DEV_FORMAT_ERROR: StatusT = B_DEVICE_ERROR_BASE + 5

public val B_DEV_TIMEOUT: StatusT = B_DEVICE_ERROR_BASE + 6

public val B_DEV_RECALIBRATE_ERROR: StatusT = B_DEVICE_ERROR_BASE + 7

public val B_DEV_SEEK_ERROR: StatusT = B_DEVICE_ERROR_BASE + 8

public val B_DEV_ID_ERROR: StatusT = B_DEVICE_ERROR_BASE + 9

public val B_DEV_READ_ERROR: StatusT = B_DEVICE_ERROR_BASE + 10

public val B_DEV_WRITE_ERROR: StatusT = B_DEVICE_ERROR_BASE + 11

public val B_DEV_NOT_READY: StatusT = B_DEVICE_ERROR_BASE + 12

public val B_DEV_MEDIA_CHANGED: StatusT = B_DEVICE_ERROR_BASE + 13

public val B_DEV_MEDIA_CHANGE_REQUESTED: StatusT = B_DEVICE_ERROR_BASE + 14

public val B_DEV_RESOURCE_CONFLICT: StatusT = B_DEVICE_ERROR_BASE + 15

public val B_DEV_CONFIGURATION_ERROR: StatusT = B_DEVICE_ERROR_BASE + 16

public val B_DEV_DISABLED_BY_USER: StatusT = B_DEVICE_ERROR_BASE + 17

public val B_DEV_DOOR_OPEN: StatusT = B_DEVICE_ERROR_BASE + 18

public val B_DEV_INVALID_PIPE: StatusT = B_DEVICE_ERROR_BASE + 19

public val B_DEV_CRC_ERROR: StatusT = B_DEVICE_ERROR_BASE + 20

public val B_DEV_STALLED: StatusT = B_DEVICE_ERROR_BASE + 21

public val B_DEV_BAD_PID: StatusT = B_DEVICE_ERROR_BASE + 22

public val B_DEV_UNEXPECTED_PID: StatusT = B_DEVICE_ERROR_BASE + 23

public val B_DEV_DATA_OVERRUN: StatusT = B_DEVICE_ERROR_BASE + 24

public val B_DEV_DATA_UNDERRUN: StatusT = B_DEVICE_ERROR_BASE + 25

public val B_DEV_FIFO_OVERRUN: StatusT = B_DEVICE_ERROR_BASE + 26

public val B_DEV_FIFO_UNDERRUN: StatusT = B_DEVICE_ERROR_BASE + 27

public val B_DEV_PENDING: StatusT = B_DEVICE_ERROR_BASE + 28

public val B_DEV_MULTIPLE_ERRORS: StatusT = B_DEVICE_ERROR_BASE + 29

public val B_DEV_TOO_LATE: StatusT = B_DEVICE_ERROR_BASE + 30

// translation kit errors
public val B_TRANSLATION_BASE_ERROR: StatusT = B_TRANSLATION_ERROR_BASE + 0

public val B_NO_TRANSLATOR: StatusT = B_TRANSLATION_ERROR_BASE + 1

public val B_ILLEGAL_DATA: StatusT = B_TRANSLATION_ERROR_BASE + 2

// support/TypeConstants.h
public val B_AFFINE_TRANSFORM_TYPE: UInt = (('A'.code.toUInt()) shl 24) + (('M'.code.toUInt()) shl 16) + (('T'.code.toUInt()) shl 8) + ('X'.code.toUInt())

public val B_ALIGNMENT_TYPE: UInt = (('A'.code.toUInt()) shl 24) + (('L'.code.toUInt()) shl 16) + (('G'.code.toUInt()) shl 8) + ('N'.code.toUInt())

public val B_ANY_TYPE: UInt = (('A'.code.toUInt()) shl 24) + (('N'.code.toUInt()) shl 16) + (('Y'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_ATOM_TYPE: UInt = (('A'.code.toUInt()) shl 24) + (('T'.code.toUInt()) shl 16) + (('O'.code.toUInt()) shl 8) + ('M'.code.toUInt())

public val B_ATOMREF_TYPE: UInt = (('A'.code.toUInt()) shl 24) + (('T'.code.toUInt()) shl 16) + (('M'.code.toUInt()) shl 8) + ('R'.code.toUInt())

public val B_BOOL_TYPE: UInt = (('B'.code.toUInt()) shl 24) + (('O'.code.toUInt()) shl 16) + (('O'.code.toUInt()) shl 8) + ('L'.code.toUInt())

public val B_CHAR_TYPE: UInt = (('C'.code.toUInt()) shl 24) + (('H'.code.toUInt()) shl 16) + (('A'.code.toUInt()) shl 8) + ('R'.code.toUInt())

public val B_COLOR_8_BIT_TYPE: UInt = (('C'.code.toUInt()) shl 24) + (('L'.code.toUInt()) shl 16) + (('R'.code.toUInt()) shl 8) + ('B'.code.toUInt())

public val B_DOUBLE_TYPE: UInt = (('D'.code.toUInt()) shl 24) + (('B'.code.toUInt()) shl 16) + (('L'.code.toUInt()) shl 8) + ('E'.code.toUInt())

public val B_FLOAT_TYPE: UInt = (('F'.code.toUInt()) shl 24) + (('L'.code.toUInt()) shl 16) + (('O'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_GRAYSCALE_8_BIT_TYPE: UInt = (('G'.code.toUInt()) shl 24) + (('R'.code.toUInt()) shl 16) + (('Y'.code.toUInt()) shl 8) + ('B'.code.toUInt())

public val B_INT16_TYPE: UInt = (('S'.code.toUInt()) shl 24) + (('H'.code.toUInt()) shl 16) + (('R'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_INT32_TYPE: UInt = (('L'.code.toUInt()) shl 24) + (('O'.code.toUInt()) shl 16) + (('N'.code.toUInt()) shl 8) + ('G'.code.toUInt())

public val B_INT64_TYPE: UInt = (('L'.code.toUInt()) shl 24) + (('L'.code.toUInt()) shl 16) + (('N'.code.toUInt()) shl 8) + ('G'.code.toUInt())

public val B_INT8_TYPE: UInt = (('B'.code.toUInt()) shl 24) + (('Y'.code.toUInt()) shl 16) + (('T'.code.toUInt()) shl 8) + ('E'.code.toUInt())

public val B_LARGE_ICON_TYPE: UInt = (('I'.code.toUInt()) shl 24) + (('C'.code.toUInt()) shl 16) + (('O'.code.toUInt()) shl 8) + ('N'.code.toUInt())

public val B_MEDIA_PARAMETER_GROUP_TYPE: UInt = (('B'.code.toUInt()) shl 24) + (('M'.code.toUInt()) shl 16) + (('C'.code.toUInt()) shl 8) + ('G'.code.toUInt())

public val B_MEDIA_PARAMETER_TYPE: UInt = (('B'.code.toUInt()) shl 24) + (('M'.code.toUInt()) shl 16) + (('C'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_MEDIA_PARAMETER_WEB_TYPE: UInt = (('B'.code.toUInt()) shl 24) + (('M'.code.toUInt()) shl 16) + (('C'.code.toUInt()) shl 8) + ('W'.code.toUInt())

public val B_MESSAGE_TYPE: UInt = (('M'.code.toUInt()) shl 24) + (('S'.code.toUInt()) shl 16) + (('G'.code.toUInt()) shl 8) + ('G'.code.toUInt())

public val B_MESSENGER_TYPE: UInt = (('M'.code.toUInt()) shl 24) + (('S'.code.toUInt()) shl 16) + (('N'.code.toUInt()) shl 8) + ('G'.code.toUInt())

public val B_MIME_TYPE: UInt = (('M'.code.toUInt()) shl 24) + (('I'.code.toUInt()) shl 16) + (('M'.code.toUInt()) shl 8) + ('E'.code.toUInt())

public val B_MINI_ICON_TYPE: UInt = (('M'.code.toUInt()) shl 24) + (('I'.code.toUInt()) shl 16) + (('C'.code.toUInt()) shl 8) + ('N'.code.toUInt())

public val B_MONOCHROME_1_BIT_TYPE: UInt = (('M'.code.toUInt()) shl 24) + (('N'.code.toUInt()) shl 16) + (('O'.code.toUInt()) shl 8) + ('B'.code.toUInt())

public val B_OBJECT_TYPE: UInt = (('O'.code.toUInt()) shl 24) + (('P'.code.toUInt()) shl 16) + (('T'.code.toUInt()) shl 8) + ('R'.code.toUInt())

public val B_OFF_T_TYPE: UInt = (('O'.code.toUInt()) shl 24) + (('F'.code.toUInt()) shl 16) + (('F'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_PATTERN_TYPE: UInt = (('P'.code.toUInt()) shl 24) + (('A'.code.toUInt()) shl 16) + (('T'.code.toUInt()) shl 8) + ('N'.code.toUInt())

public val B_POINTER_TYPE: UInt = (('P'.code.toUInt()) shl 24) + (('N'.code.toUInt()) shl 16) + (('T'.code.toUInt()) shl 8) + ('R'.code.toUInt())

public val B_POINT_TYPE: UInt = (('B'.code.toUInt()) shl 24) + (('P'.code.toUInt()) shl 16) + (('N'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_PROPERTY_INFO_TYPE: UInt = (('S'.code.toUInt()) shl 24) + (('C'.code.toUInt()) shl 16) + (('T'.code.toUInt()) shl 8) + ('D'.code.toUInt())

public val B_RAW_TYPE: UInt = (('R'.code.toUInt()) shl 24) + (('A'.code.toUInt()) shl 16) + (('W'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_RECT_TYPE: UInt = (('R'.code.toUInt()) shl 24) + (('E'.code.toUInt()) shl 16) + (('C'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_REF_TYPE: UInt = (('R'.code.toUInt()) shl 24) + (('R'.code.toUInt()) shl 16) + (('E'.code.toUInt()) shl 8) + ('F'.code.toUInt())

public val B_RGB_32_BIT_TYPE: UInt = (('R'.code.toUInt()) shl 24) + (('G'.code.toUInt()) shl 16) + (('B'.code.toUInt()) shl 8) + ('B'.code.toUInt())

public val B_RGB_COLOR_TYPE: UInt = (('R'.code.toUInt()) shl 24) + (('G'.code.toUInt()) shl 16) + (('B'.code.toUInt()) shl 8) + ('C'.code.toUInt())

public val B_SIZE_TYPE: UInt = (('S'.code.toUInt()) shl 24) + (('I'.code.toUInt()) shl 16) + (('Z'.code.toUInt()) shl 8) + ('E'.code.toUInt())

public val B_SIZE_T_TYPE: UInt = (('S'.code.toUInt()) shl 24) + (('I'.code.toUInt()) shl 16) + (('Z'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_SSIZE_T_TYPE: UInt = (('S'.code.toUInt()) shl 24) + (('S'.code.toUInt()) shl 16) + (('Z'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_STRING_TYPE: UInt = (('C'.code.toUInt()) shl 24) + (('S'.code.toUInt()) shl 16) + (('T'.code.toUInt()) shl 8) + ('R'.code.toUInt())

public val B_STRING_LIST_TYPE: UInt = (('S'.code.toUInt()) shl 24) + (('T'.code.toUInt()) shl 16) + (('R'.code.toUInt()) shl 8) + ('L'.code.toUInt())

public val B_TIME_TYPE: UInt = (('T'.code.toUInt()) shl 24) + (('I'.code.toUInt()) shl 16) + (('M'.code.toUInt()) shl 8) + ('E'.code.toUInt())

public val B_UINT16_TYPE: UInt = (('U'.code.toUInt()) shl 24) + (('S'.code.toUInt()) shl 16) + (('H'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_UINT32_TYPE: UInt = (('U'.code.toUInt()) shl 24) + (('L'.code.toUInt()) shl 16) + (('N'.code.toUInt()) shl 8) + ('G'.code.toUInt())

public val B_UINT64_TYPE: UInt = (('U'.code.toUInt()) shl 24) + (('L'.code.toUInt()) shl 16) + (('L'.code.toUInt()) shl 8) + ('G'.code.toUInt())

public val B_UINT8_TYPE: UInt = (('U'.code.toUInt()) shl 24) + (('B'.code.toUInt()) shl 16) + (('Y'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_VECTOR_ICON_TYPE: UInt = (('V'.code.toUInt()) shl 24) + (('I'.code.toUInt()) shl 16) + (('C'.code.toUInt()) shl 8) + ('N'.code.toUInt())

public val B_XATTR_TYPE: UInt = (('X'.code.toUInt()) shl 24) + (('A'.code.toUInt()) shl 16) + (('T'.code.toUInt()) shl 8) + ('R'.code.toUInt())

public val B_NETWORK_ADDRESS_TYPE: UInt = (('N'.code.toUInt()) shl 24) + (('W'.code.toUInt()) shl 16) + (('A'.code.toUInt()) shl 8) + ('D'.code.toUInt())

public val B_MIME_STRING_TYPE: UInt = (('M'.code.toUInt()) shl 24) + (('I'.code.toUInt()) shl 16) + (('M'.code.toUInt()) shl 8) + ('S'.code.toUInt())

public val B_ASCII_TYPE: UInt = (('T'.code.toUInt()) shl 24) + (('E'.code.toUInt()) shl 16) + (('X'.code.toUInt()) shl 8) + ('T'.code.toUInt())

public val B_APP_IMAGE_SYMBOL: COpaquePointer? = null

// kernel/OS.h
public expect fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId

public expect fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: AreaId): AreaId

public expect fun findArea(name: String?): AreaId

public expect fun areaFor(address: COpaquePointer?): AreaId

public expect fun deleteArea(id: AreaId): StatusT

public expect fun resizeArea(id: AreaId, newSize: ULong): StatusT

public expect fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT

public expect fun getAreaInfo(id: AreaId, areaInfo: COpaquePointer?, size: ULong): StatusT

public expect fun getNextAreaInfo(team: TeamId, cookie: COpaquePointer?, areaInfo: COpaquePointer?, size: ULong): StatusT

public expect fun createPort(capacity: Int, name: String?): PortId

public expect fun findPort(name: String?): PortId

public expect fun readPort(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): SsizeT

public expect fun readPortEtc(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT

public expect fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT

public expect fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT

public expect fun closePort(port: PortId): StatusT

public expect fun deletePort(port: PortId): StatusT

public expect fun portBufferSize(port: PortId): SsizeT

public expect fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT

public expect fun portCount(port: PortId): SsizeT

public expect fun setPortOwner(port: PortId, team: TeamId): StatusT

public expect fun getPortInfo(port: PortId, buf: COpaquePointer?, portInfoSize: SizeT): StatusT

public expect fun getNextPortInfo(port: PortId, cookie: COpaquePointer?, portInfo: COpaquePointer?, portInfoSize: SizeT): StatusT

public expect fun getPortMessageInfoEtc(port: PortId, info: COpaquePointer?, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT

public expect fun createSem(count: Int, name: String?): SemId

public expect fun deleteSem(id: SemId): StatusT

public expect fun acquireSem(id: SemId): StatusT

public expect fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT

public expect fun releaseSem(id: SemId): StatusT

public expect fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT

public expect fun switchSem(semToBeReleased: SemId, id: SemId): StatusT

public expect fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT

public expect fun getSemCount(id: SemId, threadCount: COpaquePointer?): StatusT

public expect fun setSemOwner(id: SemId, team: TeamId): StatusT

public expect fun getSemInfo(id: SemId, info: COpaquePointer?, infoSize: SizeT): StatusT

public expect fun getNextSemInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, infoSize: SizeT): StatusT

public expect fun killTeam(team: TeamId): StatusT

public expect fun getTeamInfo(team: TeamId, info: COpaquePointer?, size: SizeT): StatusT

public expect fun getNextTeamInfo(cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT

public expect fun spawnThread(func: ThreadFunc, name: String?, priority: Int, data: COpaquePointer?): ThreadId

public expect fun killThread(thread: ThreadId): StatusT

public expect fun resumeThread(thread: ThreadId): StatusT

public expect fun suspendThread(thread: ThreadId): StatusT

public expect fun renameThread(thread: ThreadId, newName: String?): StatusT

public expect fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT

public expect fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int

public expect fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT

public expect fun exitThread(status: StatusT)

public expect fun waitForThread(thread: ThreadId, returnValue: COpaquePointer?): StatusT

public expect fun onExitThread(callback: OnExitThreadCallbackCallback, data: COpaquePointer?): StatusT

public expect fun findThread(name: String?): ThreadId

public expect fun getSchedulerMode(): Int

public expect fun setSchedulerMode(mode: Int): StatusT

public expect fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT

public expect fun receiveData(sender: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): Int

public expect fun hasData(thread: ThreadId): Boolean

public expect fun snooze(amount: BigtimeT): StatusT

public expect fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT

public expect fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT

public expect fun getThreadInfo(id: ThreadId, info: COpaquePointer?, size: SizeT): StatusT

public expect fun getNextThreadInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT

public expect fun getPthreadThreadId(thread: PthreadT): ThreadId

public expect fun getTeamUsageInfo(team: TeamId, who: Int, info: COpaquePointer?, size: SizeT): StatusT

public expect fun realTimeClock(): CUlong

public expect fun setRealTimeClock(secsSinceJan1st1970: CUlong)

public expect fun realTimeClockUsecs(): BigtimeT

public expect fun systemTime(): BigtimeT

public expect fun systemTimeNsecs(): NanotimeT

// setTimezone() is deprecated and a no-op
public expect fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT

public expect fun debugger(message: String?)

public expect fun disableDebugger(state: CInt): CInt

public expect fun getSystemInfo(info: COpaquePointer?): StatusT

public expect fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: COpaquePointer?, size: SizeT): StatusT

public expect fun getCpuTopologyInfo(topologyInfos: COpaquePointer?, topologyInfoCount: COpaquePointer?): StatusT

public expect fun isComputerOn(): Int

public expect fun isComputerOnFire(): CDouble

public expect fun sendSignal(threadID: ThreadId, signal: CUint): CInt

public expect fun setSignalStack(base: COpaquePointer?, size: SizeT)

public expect fun waitForObjects(infos: COpaquePointer?, numInfos: CInt): SsizeT

public expect fun waitForObjectsEtc(infos: COpaquePointer?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT

// kernel/fsAttr.h
public expect fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: SizeT): SsizeT

public expect fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: SizeT): SsizeT

public expect fun fsRemoveAttr(fd: CInt, attribute: String?): CInt

public expect fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: COpaquePointer?): CInt

public expect fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt

public expect fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt

public expect fun fsCloseAttr(fd: CInt): CInt

public expect fun fsOpenAttrDir(path: String?): DIR?

public expect fun fsLopenAttrDir(path: String?): DIR?

public expect fun fsFopenAttrDir(fd: CInt): DIR?

public expect fun fsCloseAttrDir(dir: DIR?): CInt

public expect fun fsReadAttrDir(dir: DIR?): COpaquePointer?

public expect fun fsRewindAttrDir(dir: DIR?)

// kernel/fsImage.h
public expect fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt

public expect fun fsRemoveIndex(device: DevT, name: String?): CInt

public expect fun fsStatIndex(device: DevT, name: String?, indexInfo: COpaquePointer?): CInt

public expect fun fsOpenIndexDir(device: DevT): DIR?

public expect fun fsCloseIndexDir(indexDirectory: DIR?): CInt

public expect fun fsReadIndexDir(indexDirectory: DIR?): COpaquePointer?

public expect fun fsRewindIndexDir(indexDirectory: DIR?)

// kernel/fsInfo.h
public expect fun devForPath(path: String?): DevT

public expect fun nextDev(pos: COpaquePointer?): DevT

public expect fun fsStatDev(dev: DevT, info: COpaquePointer?): CInt

// kernel/fsQuery.h
public expect fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR?

public expect fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR?

public expect fun fsCloseQuery(d: DIR?): CInt

public expect fun fsReadQuery(d: DIR?): COpaquePointer?

public expect fun getPathForDirent(dent: COpaquePointer?, buf: COpaquePointer?, len: SizeT): StatusT

// kernel/fsVolume.h
public expect fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): DevT

public expect fun fsUnmountVolume(path: String?, flags: UInt): StatusT

// kernel/image.h
public expect fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): ThreadId

public expect fun loadAddOn(path: String?): ImageId

public expect fun unloadAddOn(image: ImageId): StatusT

public expect fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT

public expect fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: COpaquePointer?, nameLength: COpaquePointer?, symbolType: COpaquePointer?, symbolLocation: COpaquePointer?): StatusT

public expect fun clearCaches(address: COpaquePointer?, length: SizeT, flags: UInt)

public expect fun getImageInfo(image: ImageId, info: COpaquePointer?, size: SizeT): StatusT

public expect fun getNextImageInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT

public expect fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: ULong): StatusT

public expect fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT

public expect fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT

public expect fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT

public expect fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT

public expect fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT

public expect fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: COpaquePointer?, length: Int): StatusT

public expect fun getCpuid(info: COpaquePointer?, eaxRegister: UInt, cpuNum: UInt): StatusT

// The following functions are defined as macros in C/C++
public fun getCpuInfo(firstCPU: UInt, cpuCount: UInt, info: COpaquePointer?): StatusT {
    return getCpuInfoEtc(firstCPU, cpuCount, info, 8.toULong())
}

public fun getAreaInfo(id: AreaId, info: COpaquePointer?): StatusT {
    return getAreaInfo(id, info, (8).toULong())
}

public fun getNextAreaInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?): StatusT {
    return getNextAreaInfo(team, cookie, info, (8).toULong())
}

public fun getPortInfo(port: PortId, buf: COpaquePointer?): StatusT {
    return getPortInfo(port, buf, 8.toULong())
}

public fun getNextPortInfo(port: PortId, cookie: COpaquePointer?, portInfo: COpaquePointer?): StatusT {
    return getNextPortInfo(port, cookie, portInfo, 8.toULong())
}

public fun getPortMessageInfoEtc(port: PortId, info: COpaquePointer?, flags: UInt, timeout: BigtimeT): StatusT {
    return getPortMessageInfoEtc(port, info, 8.toULong(), flags, timeout)
}

public fun getSemInfo(id: SemId, info: COpaquePointer?): StatusT {
    return getSemInfo(id, info, 8.toULong())
}

public fun getNextSemInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?): StatusT {
    return getNextSemInfo(team, cookie, info, 8.toULong())
}

public fun getTeamInfo(team: TeamId, info: COpaquePointer?): StatusT {
    return getTeamInfo(team, info, 8.toULong())
}

public fun getNextTeamInfo(cookie: COpaquePointer?, info: COpaquePointer?): StatusT {
    return getNextTeamInfo(cookie, info, 8.toULong())
}

public fun getTeamUsageInfo(team: TeamId, who: Int, info: COpaquePointer?): StatusT {
    return getTeamUsageInfo(team, who, info, 8.toULong())
}

public fun getThreadInfo(id: ThreadId, info: COpaquePointer?): StatusT {
    return getThreadInfo(id, info, 8.toULong())
}

public fun getNextThreadInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?): StatusT {
    return getNextThreadInfo(team, cookie, info, 8.toULong())
}

// kernel/image.h
public fun getImageInfo(image: ImageId, info: COpaquePointer?): StatusT {
    return getImageInfo(image, info, 8.toULong())
}

public fun getNextImageInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?): StatusT {
    return getNextImageInfo(team, cookie, info, 8.toULong())
}
