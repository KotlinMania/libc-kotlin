@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeAcquireSem
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeAcquireSemEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeAreaFor
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeClearCaches
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeCloneArea
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeClosePort
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeCreateArea
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeCreatePort
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeCreateSem
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeDebugger
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeDeleteArea
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeDeletePort
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeDeleteSem
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeDevForPath
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeDisableDebugger
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeEstimateMaxSchedulingLatency
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeExitThread
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFindArea
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFindDirectory
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFindPath
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFindPathEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFindPathForPath
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFindPathForPathEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFindPaths
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFindPathsEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFindPort
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFindThread
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsCloseAttr
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsCloseAttrDir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsCloseIndexDir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsCloseQuery
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsCreateIndex
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsFopenAttr
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsFopenAttrDir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsLopenAttrDir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsMountVolume
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsOpenAttr
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsOpenAttrDir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsOpenIndexDir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsOpenLiveQuery
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsOpenQuery
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsReadAttr
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsReadAttrDir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsReadIndexDir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsReadQuery
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsRemoveAttr
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsRemoveIndex
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsRewindAttrDir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsRewindIndexDir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsStatAttr
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsStatDev
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsStatIndex
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsUnmountVolume
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeFsWriteAttr
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetAreaInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetCpuInfoEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetCpuTopologyInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetCpuid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetImageInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetImageSymbol
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetNextAreaInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetNextImageInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetNextPortInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetNextSemInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetNextTeamInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetNextThreadInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetNthImageSymbol
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetPathForDirent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetPortInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetPortMessageInfoEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetPthreadThreadId
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetSchedulerMode
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetSemCount
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetSemInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetSystemInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetTeamInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetTeamUsageInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeGetThreadInfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeHasData
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeIsComputerOn
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeIsComputerOnFire
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeKillTeam
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeKillThread
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeLoadAddOn
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeLoadImage
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeNextDev
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeOnExitThread
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativePortBufferSize
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativePortBufferSizeEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativePortCount
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeReadPort
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeReadPortEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeRealTimeClock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeRealTimeClockUsecs
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeReceiveData
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeReleaseSem
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeReleaseSemEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeRenameThread
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeResizeArea
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeResumeThread
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSendData
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSendSignal
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSetAlarm
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSetAreaProtection
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSetPortOwner
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSetRealTimeClock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSetSchedulerMode
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSetSemOwner
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSetSignalStack
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSetThreadPriority
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSnooze
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSnoozeEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSnoozeUntil
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSpawnThread
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSuggestThreadPriority
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSuspendThread
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSwitchSem
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSwitchSemEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSystemTime
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeSystemTimeNsecs
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeUnloadAddOn
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeWaitForObjects
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeWaitForObjectsEtc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeWaitForThread
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeWritePort
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNativeWritePortEtc
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun createArea(name: ConstPtr, startAddress: MutPtr, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    libcUnixHaikuNativeCreateArea(name.rawAddress.toCPointer<ByteVar>(), startAddress.rawAddress.toCPointer<ByteVar>(), addressSpec, size, lock, protection)

public actual fun cloneArea(name: ConstPtr, destAddress: MutPtr, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    libcUnixHaikuNativeCloneArea(name.rawAddress.toCPointer<ByteVar>(), destAddress.rawAddress.toCPointer<ByteVar>(), addressSpec, protection, source)

public actual fun findArea(name: ConstPtr): AreaId =
    libcUnixHaikuNativeFindArea(name.rawAddress.toCPointer<ByteVar>())

public actual fun areaFor(address: MutPtr): AreaId =
    libcUnixHaikuNativeAreaFor(address.rawAddress.toCPointer<ByteVar>())

public actual fun deleteArea(id: AreaId): StatusT =
    libcUnixHaikuNativeDeleteArea(id)

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    libcUnixHaikuNativeResizeArea(id, newSize)

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    libcUnixHaikuNativeSetAreaProtection(id, newProtection)

public actual fun getAreaInfo(id: AreaId, areaInfo: MutPtr, size: ULong): StatusT =
    libcUnixHaikuNativeGetAreaInfo(id, areaInfo.rawAddress.toCPointer<ByteVar>(), size)

public actual fun getNextAreaInfo(team: TeamId, cookie: MutPtr, areaInfo: MutPtr, size: ULong): StatusT =
    libcUnixHaikuNativeGetNextAreaInfo(team, cookie.rawAddress.toCPointer<ByteVar>(), areaInfo.rawAddress.toCPointer<ByteVar>(), size)

public actual fun createPort(capacity: Int, name: ConstPtr): PortId =
    libcUnixHaikuNativeCreatePort(capacity, name.rawAddress.toCPointer<ByteVar>())

public actual fun findPort(name: ConstPtr): PortId =
    libcUnixHaikuNativeFindPort(name.rawAddress.toCPointer<ByteVar>())

public actual fun readPort(port: PortId, code: MutPtr, buffer: MutPtr, bufferSize: SizeT): SsizeT =
    libcUnixHaikuNativeReadPort(port, code.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferSize)

public actual fun readPortEtc(port: PortId, code: MutPtr, buffer: MutPtr, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    libcUnixHaikuNativeReadPortEtc(port, code.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferSize, flags, timeout)

public actual fun writePort(port: PortId, code: Int, buffer: ConstPtr, bufferSize: SizeT): StatusT =
    libcUnixHaikuNativeWritePort(port, code, buffer.rawAddress.toCPointer<ByteVar>(), bufferSize)

public actual fun writePortEtc(port: PortId, code: Int, buffer: ConstPtr, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    libcUnixHaikuNativeWritePortEtc(port, code, buffer.rawAddress.toCPointer<ByteVar>(), bufferSize, flags, timeout)

public actual fun closePort(port: PortId): StatusT =
    libcUnixHaikuNativeClosePort(port)

public actual fun deletePort(port: PortId): StatusT =
    libcUnixHaikuNativeDeletePort(port)

public actual fun portBufferSize(port: PortId): SsizeT =
    libcUnixHaikuNativePortBufferSize(port)

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    libcUnixHaikuNativePortBufferSizeEtc(port, flags, timeout)

public actual fun portCount(port: PortId): SsizeT =
    libcUnixHaikuNativePortCount(port)

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    libcUnixHaikuNativeSetPortOwner(port, team)

public actual fun getPortInfo(port: PortId, buf: MutPtr, portInfoSize: SizeT): StatusT =
    libcUnixHaikuNativeGetPortInfo(port, buf.rawAddress.toCPointer<ByteVar>(), portInfoSize)

public actual fun getNextPortInfo(port: PortId, cookie: MutPtr, portInfo: MutPtr, portInfoSize: SizeT): StatusT =
    libcUnixHaikuNativeGetNextPortInfo(port, cookie.rawAddress.toCPointer<ByteVar>(), portInfo.rawAddress.toCPointer<ByteVar>(), portInfoSize)

public actual fun getPortMessageInfoEtc(port: PortId, info: MutPtr, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    libcUnixHaikuNativeGetPortMessageInfoEtc(port, info.rawAddress.toCPointer<ByteVar>(), infoSize, flags, timeout)

public actual fun createSem(count: Int, name: ConstPtr): SemId =
    libcUnixHaikuNativeCreateSem(count, name.rawAddress.toCPointer<ByteVar>())

public actual fun deleteSem(id: SemId): StatusT =
    libcUnixHaikuNativeDeleteSem(id)

public actual fun acquireSem(id: SemId): StatusT =
    libcUnixHaikuNativeAcquireSem(id)

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    libcUnixHaikuNativeAcquireSemEtc(id, count, flags, timeout)

public actual fun releaseSem(id: SemId): StatusT =
    libcUnixHaikuNativeReleaseSem(id)

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    libcUnixHaikuNativeReleaseSemEtc(id, count, flags)

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    libcUnixHaikuNativeSwitchSem(semToBeReleased, id)

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    libcUnixHaikuNativeSwitchSemEtc(semToBeReleased, id, count, flags, timeout)

public actual fun getSemCount(id: SemId, threadCount: MutPtr): StatusT =
    libcUnixHaikuNativeGetSemCount(id, threadCount.rawAddress.toCPointer<ByteVar>())

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    libcUnixHaikuNativeSetSemOwner(id, team)

public actual fun getSemInfo(id: SemId, info: MutPtr, infoSize: SizeT): StatusT =
    libcUnixHaikuNativeGetSemInfo(id, info.rawAddress.toCPointer<ByteVar>(), infoSize)

public actual fun getNextSemInfo(team: TeamId, cookie: MutPtr, info: MutPtr, infoSize: SizeT): StatusT =
    libcUnixHaikuNativeGetNextSemInfo(team, cookie.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), infoSize)

public actual fun killTeam(team: TeamId): StatusT =
    libcUnixHaikuNativeKillTeam(team)

public actual fun getTeamInfo(team: TeamId, info: MutPtr, size: SizeT): StatusT =
    libcUnixHaikuNativeGetTeamInfo(team, info.rawAddress.toCPointer<ByteVar>(), size)

public actual fun getNextTeamInfo(cookie: MutPtr, info: MutPtr, size: SizeT): StatusT =
    libcUnixHaikuNativeGetNextTeamInfo(cookie.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), size)

public actual fun spawnThread(func: ThreadFunc, name: ConstPtr, priority: Int, data: MutPtr): ThreadId =
    libcUnixHaikuNativeSpawnThread(0L.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), priority, data.rawAddress.toCPointer<ByteVar>())

public actual fun killThread(thread: ThreadId): StatusT =
    libcUnixHaikuNativeKillThread(thread)

public actual fun resumeThread(thread: ThreadId): StatusT =
    libcUnixHaikuNativeResumeThread(thread)

public actual fun suspendThread(thread: ThreadId): StatusT =
    libcUnixHaikuNativeSuspendThread(thread)

public actual fun renameThread(thread: ThreadId, newName: ConstPtr): StatusT =
    libcUnixHaikuNativeRenameThread(thread, newName.rawAddress.toCPointer<ByteVar>())

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    libcUnixHaikuNativeSetThreadPriority(thread, newPriority)

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    libcUnixHaikuNativeSuggestThreadPriority(what, period, jitter, length)

public actual fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT =
    libcUnixHaikuNativeEstimateMaxSchedulingLatency(th)

public actual fun exitThread(status: StatusT) {
    libcUnixHaikuNativeExitThread(status)
}

public actual fun waitForThread(thread: ThreadId, returnValue: MutPtr): StatusT =
    libcUnixHaikuNativeWaitForThread(thread, returnValue.rawAddress.toCPointer<ByteVar>())

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: MutPtr): StatusT =
    libcUnixHaikuNativeOnExitThread(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun findThread(name: ConstPtr): ThreadId =
    libcUnixHaikuNativeFindThread(name.rawAddress.toCPointer<ByteVar>())

public actual fun getSchedulerMode(): Int =
    libcUnixHaikuNativeGetSchedulerMode()

public actual fun setSchedulerMode(mode: Int): StatusT =
    libcUnixHaikuNativeSetSchedulerMode(mode)

public actual fun sendData(thread: ThreadId, code: Int, buffer: ConstPtr, bufferSize: SizeT): StatusT =
    libcUnixHaikuNativeSendData(thread, code, buffer.rawAddress.toCPointer<ByteVar>(), bufferSize)

public actual fun receiveData(sender: MutPtr, buffer: MutPtr, bufferSize: SizeT): Int =
    libcUnixHaikuNativeReceiveData(sender.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferSize)

public actual fun hasData(thread: ThreadId): Boolean =
    libcUnixHaikuNativeHasData(thread)

public actual fun snooze(amount: BigtimeT): StatusT =
    libcUnixHaikuNativeSnooze(amount)

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    libcUnixHaikuNativeSnoozeEtc(amount, timeBase, flags)

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    libcUnixHaikuNativeSnoozeUntil(time, timeBase)

public actual fun getThreadInfo(id: ThreadId, info: MutPtr, size: SizeT): StatusT =
    libcUnixHaikuNativeGetThreadInfo(id, info.rawAddress.toCPointer<ByteVar>(), size)

public actual fun getNextThreadInfo(team: TeamId, cookie: MutPtr, info: MutPtr, size: SizeT): StatusT =
    libcUnixHaikuNativeGetNextThreadInfo(team, cookie.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), size)

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    libcUnixHaikuNativeGetPthreadThreadId(thread.toLong().toCPointer<ByteVar>())

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: MutPtr, size: SizeT): StatusT =
    libcUnixHaikuNativeGetTeamUsageInfo(team, who, info.rawAddress.toCPointer<ByteVar>(), size)

public actual fun realTimeClock(): CUlong =
    libcUnixHaikuNativeRealTimeClock()

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
    libcUnixHaikuNativeSetRealTimeClock(secsSinceJan1st1970)
}

public actual fun realTimeClockUsecs(): BigtimeT =
    libcUnixHaikuNativeRealTimeClockUsecs()

public actual fun systemTime(): BigtimeT =
    libcUnixHaikuNativeSystemTime()

public actual fun systemTimeNsecs(): NanotimeT =
    libcUnixHaikuNativeSystemTimeNsecs()

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    libcUnixHaikuNativeSetAlarm(whenBranch, flags)

public actual fun debugger(message: ConstPtr) {
    libcUnixHaikuNativeDebugger(message.rawAddress.toCPointer<ByteVar>())
}

public actual fun disableDebugger(state: CInt): CInt =
    libcUnixHaikuNativeDisableDebugger(state)

public actual fun getSystemInfo(info: MutPtr): StatusT =
    libcUnixHaikuNativeGetSystemInfo(info.rawAddress.toCPointer<ByteVar>())

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: MutPtr, size: SizeT): StatusT =
    libcUnixHaikuNativeGetCpuInfoEtc(firstCPU, cpuCount, info.rawAddress.toCPointer<ByteVar>(), size)

public actual fun getCpuTopologyInfo(topologyInfos: MutPtr, topologyInfoCount: MutPtr): StatusT =
    libcUnixHaikuNativeGetCpuTopologyInfo(topologyInfos.rawAddress.toCPointer<ByteVar>(), topologyInfoCount.rawAddress.toCPointer<ByteVar>())

public actual fun isComputerOn(): Int =
    libcUnixHaikuNativeIsComputerOn()

public actual fun isComputerOnFire(): CDouble =
    libcUnixHaikuNativeIsComputerOnFire()

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    libcUnixHaikuNativeSendSignal(threadID, signal)

public actual fun setSignalStack(base: MutPtr, size: SizeT) {
    libcUnixHaikuNativeSetSignalStack(base.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun waitForObjects(infos: MutPtr, numInfos: CInt): SsizeT =
    libcUnixHaikuNativeWaitForObjects(infos.rawAddress.toCPointer<ByteVar>(), numInfos)

public actual fun waitForObjectsEtc(infos: MutPtr, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    libcUnixHaikuNativeWaitForObjectsEtc(infos.rawAddress.toCPointer<ByteVar>(), numInfos, flags, timeout)

public actual fun fsReadAttr(fd: CInt, attribute: ConstPtr, type: UInt, pos: OffT, buffer: MutPtr, readBytes: SizeT): SsizeT =
    libcUnixHaikuNativeFsReadAttr(fd, attribute.rawAddress.toCPointer<ByteVar>(), type, pos, buffer.rawAddress.toCPointer<ByteVar>(), readBytes)

public actual fun fsWriteAttr(fd: CInt, attribute: ConstPtr, type: UInt, pos: OffT, buffer: ConstPtr, writeBytes: SizeT): SsizeT =
    libcUnixHaikuNativeFsWriteAttr(fd, attribute.rawAddress.toCPointer<ByteVar>(), type, pos, buffer.rawAddress.toCPointer<ByteVar>(), writeBytes)

public actual fun fsRemoveAttr(fd: CInt, attribute: ConstPtr): CInt =
    libcUnixHaikuNativeFsRemoveAttr(fd, attribute.rawAddress.toCPointer<ByteVar>())

public actual fun fsStatAttr(fd: CInt, attribute: ConstPtr, attrInfo: MutPtr): CInt =
    libcUnixHaikuNativeFsStatAttr(fd, attribute.rawAddress.toCPointer<ByteVar>(), attrInfo.rawAddress.toCPointer<ByteVar>())

public actual fun fsOpenAttr(path: ConstPtr, attribute: ConstPtr, type: UInt, openMode: CInt): CInt =
    libcUnixHaikuNativeFsOpenAttr(path.rawAddress.toCPointer<ByteVar>(), attribute.rawAddress.toCPointer<ByteVar>(), type, openMode)

public actual fun fsFopenAttr(fd: CInt, attribute: ConstPtr, type: UInt, openMode: CInt): CInt =
    libcUnixHaikuNativeFsFopenAttr(fd, attribute.rawAddress.toCPointer<ByteVar>(), type, openMode)

public actual fun fsCloseAttr(fd: CInt): CInt =
    libcUnixHaikuNativeFsCloseAttr(fd)

public actual fun fsOpenAttrDir(path: ConstPtr): MutPtr =
    MutPtr(libcUnixHaikuNativeFsOpenAttrDir(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fsLopenAttrDir(path: ConstPtr): MutPtr =
    MutPtr(libcUnixHaikuNativeFsLopenAttrDir(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fsFopenAttrDir(fd: CInt): MutPtr =
    MutPtr(libcUnixHaikuNativeFsFopenAttrDir(fd)?.toLong() ?: 0L)

public actual fun fsCloseAttrDir(dir: MutPtr): CInt =
    libcUnixHaikuNativeFsCloseAttrDir(dir.rawAddress.toCPointer<ByteVar>())

public actual fun fsReadAttrDir(dir: MutPtr): MutPtr =
    MutPtr(libcUnixHaikuNativeFsReadAttrDir(dir.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fsRewindAttrDir(dir: MutPtr) {
    libcUnixHaikuNativeFsRewindAttrDir(dir.rawAddress.toCPointer<ByteVar>())
}

public actual fun fsCreateIndex(device: DevT, name: ConstPtr, type: UInt, flags: UInt): CInt =
    libcUnixHaikuNativeFsCreateIndex(device, name.rawAddress.toCPointer<ByteVar>(), type, flags)

public actual fun fsRemoveIndex(device: DevT, name: ConstPtr): CInt =
    libcUnixHaikuNativeFsRemoveIndex(device, name.rawAddress.toCPointer<ByteVar>())

public actual fun fsStatIndex(device: DevT, name: ConstPtr, indexInfo: MutPtr): CInt =
    libcUnixHaikuNativeFsStatIndex(device, name.rawAddress.toCPointer<ByteVar>(), indexInfo.rawAddress.toCPointer<ByteVar>())

public actual fun fsOpenIndexDir(device: DevT): MutPtr =
    MutPtr(libcUnixHaikuNativeFsOpenIndexDir(device)?.toLong() ?: 0L)

public actual fun fsCloseIndexDir(indexDirectory: MutPtr): CInt =
    libcUnixHaikuNativeFsCloseIndexDir(indexDirectory.rawAddress.toCPointer<ByteVar>())

public actual fun fsReadIndexDir(indexDirectory: MutPtr): MutPtr =
    MutPtr(libcUnixHaikuNativeFsReadIndexDir(indexDirectory.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fsRewindIndexDir(indexDirectory: MutPtr) {
    libcUnixHaikuNativeFsRewindIndexDir(indexDirectory.rawAddress.toCPointer<ByteVar>())
}

public actual fun devForPath(path: ConstPtr): DevT =
    libcUnixHaikuNativeDevForPath(path.rawAddress.toCPointer<ByteVar>())

public actual fun nextDev(pos: MutPtr): DevT =
    libcUnixHaikuNativeNextDev(pos.rawAddress.toCPointer<ByteVar>())

public actual fun fsStatDev(dev: DevT, info: MutPtr): CInt =
    libcUnixHaikuNativeFsStatDev(dev, info.rawAddress.toCPointer<ByteVar>())

public actual fun fsOpenQuery(device: DevT, query: ConstPtr, flags: UInt): MutPtr =
    MutPtr(libcUnixHaikuNativeFsOpenQuery(device, query.rawAddress.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L)

public actual fun fsOpenLiveQuery(device: DevT, query: ConstPtr, flags: UInt, port: PortId, token: Int): MutPtr =
    MutPtr(libcUnixHaikuNativeFsOpenLiveQuery(device, query.rawAddress.toCPointer<ByteVar>(), flags, port, token)?.toLong() ?: 0L)

public actual fun fsCloseQuery(d: MutPtr): CInt =
    libcUnixHaikuNativeFsCloseQuery(d.rawAddress.toCPointer<ByteVar>())

public actual fun fsReadQuery(d: MutPtr): MutPtr =
    MutPtr(libcUnixHaikuNativeFsReadQuery(d.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getPathForDirent(dent: MutPtr, buf: MutPtr, len: SizeT): StatusT =
    libcUnixHaikuNativeGetPathForDirent(dent.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), len)

public actual fun fsMountVolume(where: ConstPtr, device: ConstPtr, filesystem: ConstPtr, flags: UInt, parameters: ConstPtr): DevT =
    libcUnixHaikuNativeFsMountVolume(where.rawAddress.toCPointer<ByteVar>(), device.rawAddress.toCPointer<ByteVar>(), filesystem.rawAddress.toCPointer<ByteVar>(), flags, parameters.rawAddress.toCPointer<ByteVar>())

public actual fun fsUnmountVolume(path: ConstPtr, flags: UInt): StatusT =
    libcUnixHaikuNativeFsUnmountVolume(path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun loadImage(argc: Int, argv: MutPtr, environ: MutPtr): ThreadId =
    libcUnixHaikuNativeLoadImage(argc, argv.rawAddress.toCPointer<ByteVar>(), environ.rawAddress.toCPointer<ByteVar>())

public actual fun loadAddOn(path: ConstPtr): ImageId =
    libcUnixHaikuNativeLoadAddOn(path.rawAddress.toCPointer<ByteVar>())

public actual fun unloadAddOn(image: ImageId): StatusT =
    libcUnixHaikuNativeUnloadAddOn(image)

public actual fun getImageSymbol(image: ImageId, name: ConstPtr, symbolType: Int, symbolLocation: MutPtr): StatusT =
    libcUnixHaikuNativeGetImageSymbol(image, name.rawAddress.toCPointer<ByteVar>(), symbolType, symbolLocation.rawAddress.toCPointer<ByteVar>())

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: MutPtr, nameLength: MutPtr, symbolType: MutPtr, symbolLocation: MutPtr): StatusT =
    libcUnixHaikuNativeGetNthImageSymbol(image, n, nameBuffer.rawAddress.toCPointer<ByteVar>(), nameLength.rawAddress.toCPointer<ByteVar>(), symbolType.rawAddress.toCPointer<ByteVar>(), symbolLocation.rawAddress.toCPointer<ByteVar>())

public actual fun clearCaches(address: MutPtr, length: SizeT, flags: UInt) {
    libcUnixHaikuNativeClearCaches(address.rawAddress.toCPointer<ByteVar>(), length, flags)
}

public actual fun getImageInfo(image: ImageId, info: MutPtr, size: SizeT): StatusT =
    libcUnixHaikuNativeGetImageInfo(image, info.rawAddress.toCPointer<ByteVar>(), size)

public actual fun getNextImageInfo(team: TeamId, cookie: MutPtr, info: MutPtr, size: SizeT): StatusT =
    libcUnixHaikuNativeGetNextImageInfo(team, cookie.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), size)

public actual fun findPath(codePointer: ConstPtr, baseDirectory: PathBaseDirectory, subPath: ConstPtr, pathBuffer: MutPtr, bufferSize: ULong): StatusT =
    libcUnixHaikuNativeFindPath(codePointer.rawAddress.toCPointer<ByteVar>(), baseDirectory, subPath.rawAddress.toCPointer<ByteVar>(), pathBuffer.rawAddress.toCPointer<ByteVar>(), bufferSize)

public actual fun findPathEtc(codePointer: ConstPtr, dependency: ConstPtr, architecture: ConstPtr, baseDirectory: PathBaseDirectory, subPath: ConstPtr, flags: UInt, pathBuffer: MutPtr, bufferSize: SizeT): StatusT =
    libcUnixHaikuNativeFindPathEtc(codePointer.rawAddress.toCPointer<ByteVar>(), dependency.rawAddress.toCPointer<ByteVar>(), architecture.rawAddress.toCPointer<ByteVar>(), baseDirectory, subPath.rawAddress.toCPointer<ByteVar>(), flags, pathBuffer.rawAddress.toCPointer<ByteVar>(), bufferSize)

public actual fun findPathForPath(path: ConstPtr, baseDirectory: PathBaseDirectory, subPath: ConstPtr, pathBuffer: MutPtr, bufferSize: SizeT): StatusT =
    libcUnixHaikuNativeFindPathForPath(path.rawAddress.toCPointer<ByteVar>(), baseDirectory, subPath.rawAddress.toCPointer<ByteVar>(), pathBuffer.rawAddress.toCPointer<ByteVar>(), bufferSize)

public actual fun findPathForPathEtc(path: ConstPtr, dependency: ConstPtr, architecture: ConstPtr, baseDirectory: PathBaseDirectory, subPath: ConstPtr, flags: UInt, pathBuffer: MutPtr, bufferSize: SizeT): StatusT =
    libcUnixHaikuNativeFindPathForPathEtc(path.rawAddress.toCPointer<ByteVar>(), dependency.rawAddress.toCPointer<ByteVar>(), architecture.rawAddress.toCPointer<ByteVar>(), baseDirectory, subPath.rawAddress.toCPointer<ByteVar>(), flags, pathBuffer.rawAddress.toCPointer<ByteVar>(), bufferSize)

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: ConstPtr, paths: MutPtr, pathCount: MutPtr): StatusT =
    libcUnixHaikuNativeFindPaths(baseDirectory, subPath.rawAddress.toCPointer<ByteVar>(), paths.rawAddress.toCPointer<ByteVar>(), pathCount.rawAddress.toCPointer<ByteVar>())

public actual fun findPathsEtc(architecture: ConstPtr, baseDirectory: PathBaseDirectory, subPath: ConstPtr, flags: UInt, paths: MutPtr, pathCount: MutPtr): StatusT =
    libcUnixHaikuNativeFindPathsEtc(architecture.rawAddress.toCPointer<ByteVar>(), baseDirectory, subPath.rawAddress.toCPointer<ByteVar>(), flags, paths.rawAddress.toCPointer<ByteVar>(), pathCount.rawAddress.toCPointer<ByteVar>())

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: MutPtr, length: Int): StatusT =
    libcUnixHaikuNativeFindDirectory(which, volume, createIt, pathString.rawAddress.toCPointer<ByteVar>(), length)

public actual fun getCpuid(info: MutPtr, eaxRegister: UInt, cpuNum: UInt): StatusT =
    libcUnixHaikuNativeGetCpuid(info.rawAddress.toCPointer<ByteVar>(), eaxRegister, cpuNum)
