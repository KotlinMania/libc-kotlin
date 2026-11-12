@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun createArea(name: ConstPtr<CChar>, startAddress: MutPtr<MutPtr<CVoid>>, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeCreateArea")

public actual fun cloneArea(name: ConstPtr<CChar>, destAddress: MutPtr<MutPtr<CVoid>>, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeCloneArea")

public actual fun findArea(name: ConstPtr<CChar>): AreaId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFindArea")

public actual fun areaFor(address: MutPtr<CVoid>): AreaId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeAreaFor")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeDeleteArea")
private external fun wasiLibcUnixHaikuNativeDeleteArea(id: Int): Int

public actual fun deleteArea(id: AreaId): StatusT =
    wasiLibcUnixHaikuNativeDeleteArea(id).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeResizeArea")
private external fun wasiLibcUnixHaikuNativeResizeArea(id: Int, newSize: Long): Int

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    wasiLibcUnixHaikuNativeResizeArea(id, newSize.toLong()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSetAreaProtection")
private external fun wasiLibcUnixHaikuNativeSetAreaProtection(id: Int, newProtection: Int): Int

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    wasiLibcUnixHaikuNativeSetAreaProtection(id, newProtection.toInt()).toInt()

public actual fun getAreaInfo(id: AreaId, areaInfo: MutPtr<AreaInfo>, size: ULong): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetAreaInfo")

public actual fun getNextAreaInfo(team: TeamId, cookie: MutPtr<Long>, areaInfo: MutPtr<AreaInfo>, size: ULong): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetNextAreaInfo")

public actual fun createPort(capacity: Int, name: ConstPtr<CChar>): PortId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeCreatePort")

public actual fun findPort(name: ConstPtr<CChar>): PortId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFindPort")

public actual fun readPort(port: PortId, code: MutPtr<Int>, buffer: MutPtr<CVoid>, bufferSize: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeReadPort")

public actual fun readPortEtc(port: PortId, code: MutPtr<Int>, buffer: MutPtr<CVoid>, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeReadPortEtc")

public actual fun writePort(port: PortId, code: Int, buffer: ConstPtr<CVoid>, bufferSize: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeWritePort")

public actual fun writePortEtc(port: PortId, code: Int, buffer: ConstPtr<CVoid>, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeWritePortEtc")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeClosePort")
private external fun wasiLibcUnixHaikuNativeClosePort(port: Int): Int

public actual fun closePort(port: PortId): StatusT =
    wasiLibcUnixHaikuNativeClosePort(port).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeDeletePort")
private external fun wasiLibcUnixHaikuNativeDeletePort(port: Int): Int

public actual fun deletePort(port: PortId): StatusT =
    wasiLibcUnixHaikuNativeDeletePort(port).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativePortBufferSize")
private external fun wasiLibcUnixHaikuNativePortBufferSize(port: Int): Long

public actual fun portBufferSize(port: PortId): SsizeT =
    wasiLibcUnixHaikuNativePortBufferSize(port).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativePortBufferSizeEtc")
private external fun wasiLibcUnixHaikuNativePortBufferSizeEtc(port: Int, flags: Int, timeout: Long): Long

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    wasiLibcUnixHaikuNativePortBufferSizeEtc(port, flags.toInt(), timeout).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativePortCount")
private external fun wasiLibcUnixHaikuNativePortCount(port: Int): Long

public actual fun portCount(port: PortId): SsizeT =
    wasiLibcUnixHaikuNativePortCount(port).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSetPortOwner")
private external fun wasiLibcUnixHaikuNativeSetPortOwner(port: Int, team: Int): Int

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    wasiLibcUnixHaikuNativeSetPortOwner(port, team).toInt()

public actual fun getPortInfo(port: PortId, buf: MutPtr<PortInfo>, portInfoSize: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetPortInfo")

public actual fun getNextPortInfo(port: PortId, cookie: MutPtr<Int>, portInfo: MutPtr<PortInfo>, portInfoSize: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetNextPortInfo")

public actual fun getPortMessageInfoEtc(port: PortId, info: MutPtr<PortMessageInfo>, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetPortMessageInfoEtc")

public actual fun createSem(count: Int, name: ConstPtr<CChar>): SemId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeCreateSem")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeDeleteSem")
private external fun wasiLibcUnixHaikuNativeDeleteSem(id: Int): Int

public actual fun deleteSem(id: SemId): StatusT =
    wasiLibcUnixHaikuNativeDeleteSem(id).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeAcquireSem")
private external fun wasiLibcUnixHaikuNativeAcquireSem(id: Int): Int

public actual fun acquireSem(id: SemId): StatusT =
    wasiLibcUnixHaikuNativeAcquireSem(id).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeAcquireSemEtc")
private external fun wasiLibcUnixHaikuNativeAcquireSemEtc(id: Int, count: Int, flags: Int, timeout: Long): Int

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    wasiLibcUnixHaikuNativeAcquireSemEtc(id, count, flags.toInt(), timeout).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeReleaseSem")
private external fun wasiLibcUnixHaikuNativeReleaseSem(id: Int): Int

public actual fun releaseSem(id: SemId): StatusT =
    wasiLibcUnixHaikuNativeReleaseSem(id).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeReleaseSemEtc")
private external fun wasiLibcUnixHaikuNativeReleaseSemEtc(id: Int, count: Int, flags: Int): Int

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    wasiLibcUnixHaikuNativeReleaseSemEtc(id, count, flags.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSwitchSem")
private external fun wasiLibcUnixHaikuNativeSwitchSem(semToBeReleased: Int, id: Int): Int

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    wasiLibcUnixHaikuNativeSwitchSem(semToBeReleased, id).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSwitchSemEtc")
private external fun wasiLibcUnixHaikuNativeSwitchSemEtc(semToBeReleased: Int, id: Int, count: Int, flags: Int, timeout: Long): Int

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    wasiLibcUnixHaikuNativeSwitchSemEtc(semToBeReleased, id, count, flags.toInt(), timeout).toInt()

public actual fun getSemCount(id: SemId, threadCount: MutPtr<Int>): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetSemCount")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSetSemOwner")
private external fun wasiLibcUnixHaikuNativeSetSemOwner(id: Int, team: Int): Int

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    wasiLibcUnixHaikuNativeSetSemOwner(id, team).toInt()

public actual fun getSemInfo(id: SemId, info: MutPtr<SemInfo>, infoSize: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetSemInfo")

public actual fun getNextSemInfo(team: TeamId, cookie: MutPtr<Int>, info: MutPtr<SemInfo>, infoSize: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetNextSemInfo")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeKillTeam")
private external fun wasiLibcUnixHaikuNativeKillTeam(team: Int): Int

public actual fun killTeam(team: TeamId): StatusT =
    wasiLibcUnixHaikuNativeKillTeam(team).toInt()

public actual fun getTeamInfo(team: TeamId, info: MutPtr<TeamInfo>, size: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetTeamInfo")

public actual fun getNextTeamInfo(cookie: MutPtr<Int>, info: MutPtr<TeamInfo>, size: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetNextTeamInfo")

public actual fun spawnThread(func: ThreadFunc, name: ConstPtr<CChar>, priority: Int, data: MutPtr<CVoid>): ThreadId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeSpawnThread")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeKillThread")
private external fun wasiLibcUnixHaikuNativeKillThread(thread: Int): Int

public actual fun killThread(thread: ThreadId): StatusT =
    wasiLibcUnixHaikuNativeKillThread(thread).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeResumeThread")
private external fun wasiLibcUnixHaikuNativeResumeThread(thread: Int): Int

public actual fun resumeThread(thread: ThreadId): StatusT =
    wasiLibcUnixHaikuNativeResumeThread(thread).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSuspendThread")
private external fun wasiLibcUnixHaikuNativeSuspendThread(thread: Int): Int

public actual fun suspendThread(thread: ThreadId): StatusT =
    wasiLibcUnixHaikuNativeSuspendThread(thread).toInt()

public actual fun renameThread(thread: ThreadId, newName: ConstPtr<CChar>): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeRenameThread")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSetThreadPriority")
private external fun wasiLibcUnixHaikuNativeSetThreadPriority(thread: Int, newPriority: Int): Int

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    wasiLibcUnixHaikuNativeSetThreadPriority(thread, newPriority).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSuggestThreadPriority")
private external fun wasiLibcUnixHaikuNativeSuggestThreadPriority(what: Int, period: Int, jitter: Long, length: Long): Int

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    wasiLibcUnixHaikuNativeSuggestThreadPriority(what.toInt(), period, jitter, length).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeEstimateMaxSchedulingLatency")
private external fun wasiLibcUnixHaikuNativeEstimateMaxSchedulingLatency(th: Int): Long

public actual fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT =
    wasiLibcUnixHaikuNativeEstimateMaxSchedulingLatency(th).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeExitThread")
private external fun wasiLibcUnixHaikuNativeExitThread(status: Int): Unit

public actual fun exitThread(status: StatusT): Unit =
    wasiLibcUnixHaikuNativeExitThread(status)

public actual fun waitForThread(thread: ThreadId, returnValue: MutPtr<StatusT>): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeWaitForThread")

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: MutPtr<CVoid>): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeOnExitThread")

public actual fun findThread(name: ConstPtr<CChar>): ThreadId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFindThread")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeGetSchedulerMode")
private external fun wasiLibcUnixHaikuNativeGetSchedulerMode(): Int

public actual fun getSchedulerMode(): Int =
    wasiLibcUnixHaikuNativeGetSchedulerMode().toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSetSchedulerMode")
private external fun wasiLibcUnixHaikuNativeSetSchedulerMode(mode: Int): Int

public actual fun setSchedulerMode(mode: Int): StatusT =
    wasiLibcUnixHaikuNativeSetSchedulerMode(mode).toInt()

public actual fun sendData(thread: ThreadId, code: Int, buffer: ConstPtr<CVoid>, bufferSize: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeSendData")

public actual fun receiveData(sender: MutPtr<ThreadId>, buffer: MutPtr<CVoid>, bufferSize: SizeT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeReceiveData")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeHasData")
private external fun wasiLibcUnixHaikuNativeHasData(thread: Int): Int

public actual fun hasData(thread: ThreadId): Boolean =
    (wasiLibcUnixHaikuNativeHasData(thread) != 0)

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSnooze")
private external fun wasiLibcUnixHaikuNativeSnooze(amount: Long): Int

public actual fun snooze(amount: BigtimeT): StatusT =
    wasiLibcUnixHaikuNativeSnooze(amount).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSnoozeEtc")
private external fun wasiLibcUnixHaikuNativeSnoozeEtc(amount: Long, timeBase: Int, flags: Int): Int

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    wasiLibcUnixHaikuNativeSnoozeEtc(amount, timeBase, flags.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSnoozeUntil")
private external fun wasiLibcUnixHaikuNativeSnoozeUntil(time: Long, timeBase: Int): Int

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    wasiLibcUnixHaikuNativeSnoozeUntil(time, timeBase).toInt()

public actual fun getThreadInfo(id: ThreadId, info: MutPtr<ThreadInfo>, size: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetThreadInfo")

public actual fun getNextThreadInfo(team: TeamId, cookie: MutPtr<Int>, info: MutPtr<ThreadInfo>, size: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetNextThreadInfo")

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetPthreadThreadId")

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: MutPtr<TeamUsageInfo>, size: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetTeamUsageInfo")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeRealTimeClock")
private external fun wasiLibcUnixHaikuNativeRealTimeClock(): Long

public actual fun realTimeClock(): CUlong =
    wasiLibcUnixHaikuNativeRealTimeClock().toULong()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSetRealTimeClock")
private external fun wasiLibcUnixHaikuNativeSetRealTimeClock(secsSinceJan1st1970: Long): Unit

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong): Unit =
    wasiLibcUnixHaikuNativeSetRealTimeClock(secsSinceJan1st1970.toLong())

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeRealTimeClockUsecs")
private external fun wasiLibcUnixHaikuNativeRealTimeClockUsecs(): Long

public actual fun realTimeClockUsecs(): BigtimeT =
    wasiLibcUnixHaikuNativeRealTimeClockUsecs().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSystemTime")
private external fun wasiLibcUnixHaikuNativeSystemTime(): Long

public actual fun systemTime(): BigtimeT =
    wasiLibcUnixHaikuNativeSystemTime().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSystemTimeNsecs")
private external fun wasiLibcUnixHaikuNativeSystemTimeNsecs(): Long

public actual fun systemTimeNsecs(): NanotimeT =
    wasiLibcUnixHaikuNativeSystemTimeNsecs().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSetAlarm")
private external fun wasiLibcUnixHaikuNativeSetAlarm(whenBranch: Long, flags: Int): Long

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    wasiLibcUnixHaikuNativeSetAlarm(whenBranch, flags.toInt()).toLong()

public actual fun debugger(message: ConstPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeDebugger")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeDisableDebugger")
private external fun wasiLibcUnixHaikuNativeDisableDebugger(state: Int): Int

public actual fun disableDebugger(state: CInt): CInt =
    wasiLibcUnixHaikuNativeDisableDebugger(state).toInt()

public actual fun getSystemInfo(info: MutPtr<SystemInfo>): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetSystemInfo")

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: MutPtr<CpuInfo>, size: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetCpuInfoEtc")

public actual fun getCpuTopologyInfo(topologyInfos: MutPtr<CpuTopologyNodeInfo>, topologyInfoCount: MutPtr<UInt>): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetCpuTopologyInfo")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeIsComputerOn")
private external fun wasiLibcUnixHaikuNativeIsComputerOn(): Int

public actual fun isComputerOn(): Int =
    wasiLibcUnixHaikuNativeIsComputerOn().toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeIsComputerOnFire")
private external fun wasiLibcUnixHaikuNativeIsComputerOnFire(): Double

public actual fun isComputerOnFire(): CDouble =
    wasiLibcUnixHaikuNativeIsComputerOnFire().toDouble()

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeSendSignal")
private external fun wasiLibcUnixHaikuNativeSendSignal(threadID: Int, signal: Int): Int

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    wasiLibcUnixHaikuNativeSendSignal(threadID, signal.toInt()).toInt()

public actual fun setSignalStack(base: MutPtr<CVoid>, size: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeSetSignalStack")

public actual fun waitForObjects(infos: MutPtr<ObjectWaitInfo>, numInfos: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeWaitForObjects")

public actual fun waitForObjectsEtc(infos: MutPtr<ObjectWaitInfo>, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeWaitForObjectsEtc")

public actual fun fsReadAttr(fd: CInt, attribute: ConstPtr<CChar>, type: UInt, pos: OffT, buffer: MutPtr<CVoid>, readBytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsReadAttr")

public actual fun fsWriteAttr(fd: CInt, attribute: ConstPtr<CChar>, type: UInt, pos: OffT, buffer: ConstPtr<CVoid>, writeBytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsWriteAttr")

public actual fun fsRemoveAttr(fd: CInt, attribute: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsRemoveAttr")

public actual fun fsStatAttr(fd: CInt, attribute: ConstPtr<CChar>, attrInfo: MutPtr<AttrInfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsStatAttr")

public actual fun fsOpenAttr(path: ConstPtr<CChar>, attribute: ConstPtr<CChar>, type: UInt, openMode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsOpenAttr")

public actual fun fsFopenAttr(fd: CInt, attribute: ConstPtr<CChar>, type: UInt, openMode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsFopenAttr")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeFsCloseAttr")
private external fun wasiLibcUnixHaikuNativeFsCloseAttr(fd: Int): Int

public actual fun fsCloseAttr(fd: CInt): CInt =
    wasiLibcUnixHaikuNativeFsCloseAttr(fd).toInt()

public actual fun fsOpenAttrDir(path: ConstPtr<CChar>): MutPtr<DIR> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsOpenAttrDir")

public actual fun fsLopenAttrDir(path: ConstPtr<CChar>): MutPtr<DIR> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsLopenAttrDir")

public actual fun fsFopenAttrDir(fd: CInt): MutPtr<DIR> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsFopenAttrDir")

public actual fun fsCloseAttrDir(dir: MutPtr<DIR>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsCloseAttrDir")

public actual fun fsReadAttrDir(dir: MutPtr<DIR>): MutPtr<Dirent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsReadAttrDir")

public actual fun fsRewindAttrDir(dir: MutPtr<DIR>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsRewindAttrDir")

public actual fun fsCreateIndex(device: DevT, name: ConstPtr<CChar>, type: UInt, flags: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsCreateIndex")

public actual fun fsRemoveIndex(device: DevT, name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsRemoveIndex")

public actual fun fsStatIndex(device: DevT, name: ConstPtr<CChar>, indexInfo: MutPtr<IndexInfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsStatIndex")

public actual fun fsOpenIndexDir(device: DevT): MutPtr<DIR> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsOpenIndexDir")

public actual fun fsCloseIndexDir(indexDirectory: MutPtr<DIR>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsCloseIndexDir")

public actual fun fsReadIndexDir(indexDirectory: MutPtr<DIR>): MutPtr<Dirent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsReadIndexDir")

public actual fun fsRewindIndexDir(indexDirectory: MutPtr<DIR>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsRewindIndexDir")

public actual fun devForPath(path: ConstPtr<CChar>): DevT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeDevForPath")

public actual fun nextDev(pos: MutPtr<Int>): DevT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeNextDev")

public actual fun fsStatDev(dev: DevT, info: MutPtr<FsInfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsStatDev")

public actual fun fsOpenQuery(device: DevT, query: ConstPtr<CChar>, flags: UInt): MutPtr<DIR> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsOpenQuery")

public actual fun fsOpenLiveQuery(device: DevT, query: ConstPtr<CChar>, flags: UInt, port: PortId, token: Int): MutPtr<DIR> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsOpenLiveQuery")

public actual fun fsCloseQuery(d: MutPtr<DIR>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsCloseQuery")

public actual fun fsReadQuery(d: MutPtr<DIR>): MutPtr<Dirent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsReadQuery")

public actual fun getPathForDirent(dent: MutPtr<Dirent>, buf: MutPtr<CChar>, len: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetPathForDirent")

public actual fun fsMountVolume(where: ConstPtr<CChar>, device: ConstPtr<CChar>, filesystem: ConstPtr<CChar>, flags: UInt, parameters: ConstPtr<CChar>): DevT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsMountVolume")

public actual fun fsUnmountVolume(path: ConstPtr<CChar>, flags: UInt): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFsUnmountVolume")

public actual fun loadImage(argc: Int, argv: MutPtr<ConstPtr<CChar>>, environ: MutPtr<ConstPtr<CChar>>): ThreadId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeLoadImage")

public actual fun loadAddOn(path: ConstPtr<CChar>): ImageId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeLoadAddOn")

@kotlin.wasm.WasmImport("libc", "libcUnixHaikuNativeUnloadAddOn")
private external fun wasiLibcUnixHaikuNativeUnloadAddOn(image: Int): Int

public actual fun unloadAddOn(image: ImageId): StatusT =
    wasiLibcUnixHaikuNativeUnloadAddOn(image).toInt()

public actual fun getImageSymbol(image: ImageId, name: ConstPtr<CChar>, symbolType: Int, symbolLocation: MutPtr<MutPtr<CVoid>>): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetImageSymbol")

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: MutPtr<CChar>, nameLength: MutPtr<Int>, symbolType: MutPtr<Int>, symbolLocation: MutPtr<MutPtr<CVoid>>): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetNthImageSymbol")

public actual fun clearCaches(address: MutPtr<CVoid>, length: SizeT, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeClearCaches")

public actual fun getImageInfo(image: ImageId, info: MutPtr<ImageInfo>, size: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetImageInfo")

public actual fun getNextImageInfo(team: TeamId, cookie: MutPtr<Int>, info: MutPtr<ImageInfo>, size: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetNextImageInfo")

public actual fun findPath(codePointer: ConstPtr<CVoid>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, pathBuffer: MutPtr<CChar>, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFindPath")

public actual fun findPathEtc(codePointer: ConstPtr<CVoid>, dependency: ConstPtr<CChar>, architecture: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, flags: UInt, pathBuffer: MutPtr<CChar>, bufferSize: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFindPathEtc")

public actual fun findPathForPath(path: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, pathBuffer: MutPtr<CChar>, bufferSize: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFindPathForPath")

public actual fun findPathForPathEtc(path: ConstPtr<CChar>, dependency: ConstPtr<CChar>, architecture: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, flags: UInt, pathBuffer: MutPtr<CChar>, bufferSize: SizeT): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFindPathForPathEtc")

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, paths: MutPtr<MutPtr<MutPtr<CChar>>>, pathCount: MutPtr<SizeT>): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFindPaths")

public actual fun findPathsEtc(architecture: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, flags: UInt, paths: MutPtr<MutPtr<MutPtr<CChar>>>, pathCount: MutPtr<SizeT>): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFindPathsEtc")

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: MutPtr<CChar>, length: Int): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeFindDirectory")

public actual fun getCpuid(info: MutPtr<CpuidInfo>, eaxRegister: UInt, cpuNum: UInt): StatusT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixHaikuNativeGetCpuid")
