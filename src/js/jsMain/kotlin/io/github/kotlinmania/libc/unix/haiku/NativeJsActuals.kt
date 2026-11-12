@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixHaikuNativeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun createArea(name: ConstPtr, startAddress: MutPtr, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeCreateArea(name.rawAddress.toString(), startAddress.rawAddress.toString(), addressSpec.toInt(), size.toString(), lock.toInt(), protection.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cloneArea(name: ConstPtr, destAddress: MutPtr, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeCloneArea(name.rawAddress.toString(), destAddress.rawAddress.toString(), addressSpec.toInt(), protection.toInt(), source) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findArea(name: ConstPtr): AreaId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFindArea(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areaFor(address: MutPtr): AreaId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeAreaFor(address.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteArea(id: AreaId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeDeleteArea(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeResizeArea(id, newSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSetAreaProtection(id, newProtection.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAreaInfo(id: AreaId, areaInfo: MutPtr, size: ULong): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetAreaInfo(id, areaInfo.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextAreaInfo(team: TeamId, cookie: MutPtr, areaInfo: MutPtr, size: ULong): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetNextAreaInfo(team, cookie.rawAddress.toString(), areaInfo.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPort(capacity: Int, name: ConstPtr): PortId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeCreatePort(capacity, name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPort(name: ConstPtr): PortId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFindPort(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPort(port: PortId, code: MutPtr, buffer: MutPtr, bufferSize: SizeT): SsizeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeReadPort(port, code.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPortEtc(port: PortId, code: MutPtr, buffer: MutPtr, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeReadPortEtc(port, code.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString(), flags.toInt(), timeout.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePort(port: PortId, code: Int, buffer: ConstPtr, bufferSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeWritePort(port, code, buffer.rawAddress.toString(), bufferSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePortEtc(port: PortId, code: Int, buffer: ConstPtr, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeWritePortEtc(port, code, buffer.rawAddress.toString(), bufferSize.toString(), flags.toInt(), timeout.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePort(port: PortId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeClosePort(port) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePort(port: PortId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeDeletePort(port) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portBufferSize(port: PortId): SsizeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativePortBufferSize(port) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativePortBufferSizeEtc(port, flags.toInt(), timeout.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun portCount(port: PortId): SsizeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativePortCount(port) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSetPortOwner(port, team) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPortInfo(port: PortId, buf: MutPtr, portInfoSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetPortInfo(port, buf.rawAddress.toString(), portInfoSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextPortInfo(port: PortId, cookie: MutPtr, portInfo: MutPtr, portInfoSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetNextPortInfo(port, cookie.rawAddress.toString(), portInfo.rawAddress.toString(), portInfoSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPortMessageInfoEtc(port: PortId, info: MutPtr, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetPortMessageInfoEtc(port, info.rawAddress.toString(), infoSize.toString(), flags.toInt(), timeout.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSem(count: Int, name: ConstPtr): SemId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeCreateSem(count, name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSem(id: SemId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeDeleteSem(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireSem(id: SemId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeAcquireSem(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeAcquireSemEtc(id, count, flags.toInt(), timeout.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSem(id: SemId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeReleaseSem(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeReleaseSemEtc(id, count, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSwitchSem(semToBeReleased, id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSwitchSemEtc(semToBeReleased, id, count, flags.toInt(), timeout.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSemCount(id: SemId, threadCount: MutPtr): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetSemCount(id, threadCount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSetSemOwner(id, team) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSemInfo(id: SemId, info: MutPtr, infoSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetSemInfo(id, info.rawAddress.toString(), infoSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextSemInfo(team: TeamId, cookie: MutPtr, info: MutPtr, infoSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetNextSemInfo(team, cookie.rawAddress.toString(), info.rawAddress.toString(), infoSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killTeam(team: TeamId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeKillTeam(team) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTeamInfo(team: TeamId, info: MutPtr, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetTeamInfo(team, info.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextTeamInfo(cookie: MutPtr, info: MutPtr, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetNextTeamInfo(cookie.rawAddress.toString(), info.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spawnThread(func: ThreadFunc, name: ConstPtr, priority: Int, data: MutPtr): ThreadId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSpawnThread(0L.toString(), name.rawAddress.toString(), priority, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killThread(thread: ThreadId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeKillThread(thread) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeThread(thread: ThreadId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeResumeThread(thread) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun suspendThread(thread: ThreadId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSuspendThread(thread) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameThread(thread: ThreadId, newName: ConstPtr): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeRenameThread(thread, newName.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSetThreadPriority(thread, newPriority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSuggestThreadPriority(what.toInt(), period, jitter.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeEstimateMaxSchedulingLatency(th) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exitThread(status: StatusT) {
    if (unixHaikuNativeNapiAddon != null) {
        unixHaikuNativeNapiAddon.libcUnixHaikuNativeExitThread(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForThread(thread: ThreadId, returnValue: MutPtr): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeWaitForThread(thread, returnValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: MutPtr): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeOnExitThread(0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findThread(name: ConstPtr): ThreadId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFindThread(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSchedulerMode(): Int =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetSchedulerMode() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSchedulerMode(mode: Int): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSetSchedulerMode(mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendData(thread: ThreadId, code: Int, buffer: ConstPtr, bufferSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSendData(thread, code, buffer.rawAddress.toString(), bufferSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun receiveData(sender: MutPtr, buffer: MutPtr, bufferSize: SizeT): Int =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeReceiveData(sender.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasData(thread: ThreadId): Boolean =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeHasData(thread) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snooze(amount: BigtimeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSnooze(amount.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSnoozeEtc(amount.toString(), timeBase, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSnoozeUntil(time.toString(), timeBase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadInfo(id: ThreadId, info: MutPtr, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetThreadInfo(id, info.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextThreadInfo(team: TeamId, cookie: MutPtr, info: MutPtr, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetNextThreadInfo(team, cookie.rawAddress.toString(), info.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetPthreadThreadId(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: MutPtr, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetTeamUsageInfo(team, who, info.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realTimeClock(): CUlong =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeRealTimeClock() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
    if (unixHaikuNativeNapiAddon != null) {
        unixHaikuNativeNapiAddon.libcUnixHaikuNativeSetRealTimeClock(secsSinceJan1st1970.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun realTimeClockUsecs(): BigtimeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeRealTimeClockUsecs() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTime(): BigtimeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSystemTime() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeNsecs(): NanotimeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSystemTimeNsecs() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSetAlarm(whenBranch.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugger(message: ConstPtr) {
    if (unixHaikuNativeNapiAddon != null) {
        unixHaikuNativeNapiAddon.libcUnixHaikuNativeDebugger(message.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun disableDebugger(state: CInt): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeDisableDebugger(state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemInfo(info: MutPtr): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetSystemInfo(info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: MutPtr, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetCpuInfoEtc(firstCPU.toInt(), cpuCount.toInt(), info.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCpuTopologyInfo(topologyInfos: MutPtr, topologyInfoCount: MutPtr): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetCpuTopologyInfo(topologyInfos.rawAddress.toString(), topologyInfoCount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isComputerOn(): Int =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeIsComputerOn() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isComputerOnFire(): CDouble =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeIsComputerOnFire() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeSendSignal(threadID, signal.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSignalStack(base: MutPtr, size: SizeT) {
    if (unixHaikuNativeNapiAddon != null) {
        unixHaikuNativeNapiAddon.libcUnixHaikuNativeSetSignalStack(base.rawAddress.toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitForObjects(infos: MutPtr, numInfos: CInt): SsizeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeWaitForObjects(infos.rawAddress.toString(), numInfos) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForObjectsEtc(infos: MutPtr, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeWaitForObjectsEtc(infos.rawAddress.toString(), numInfos, flags.toInt(), timeout.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadAttr(fd: CInt, attribute: ConstPtr, type: UInt, pos: OffT, buffer: MutPtr, readBytes: SizeT): SsizeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsReadAttr(fd, attribute.rawAddress.toString(), type.toInt(), pos.toString(), buffer.rawAddress.toString(), readBytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsWriteAttr(fd: CInt, attribute: ConstPtr, type: UInt, pos: OffT, buffer: ConstPtr, writeBytes: SizeT): SsizeT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsWriteAttr(fd, attribute.rawAddress.toString(), type.toInt(), pos.toString(), buffer.rawAddress.toString(), writeBytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRemoveAttr(fd: CInt, attribute: ConstPtr): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsRemoveAttr(fd, attribute.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsStatAttr(fd: CInt, attribute: ConstPtr, attrInfo: MutPtr): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsStatAttr(fd, attribute.rawAddress.toString(), attrInfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenAttr(path: ConstPtr, attribute: ConstPtr, type: UInt, openMode: CInt): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsOpenAttr(path.rawAddress.toString(), attribute.rawAddress.toString(), type.toInt(), openMode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsFopenAttr(fd: CInt, attribute: ConstPtr, type: UInt, openMode: CInt): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsFopenAttr(fd, attribute.rawAddress.toString(), type.toInt(), openMode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseAttr(fd: CInt): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsCloseAttr(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenAttrDir(path: ConstPtr): MutPtr =
    if (unixHaikuNativeNapiAddon != null) MutPtr((unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsOpenAttrDir(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsLopenAttrDir(path: ConstPtr): MutPtr =
    if (unixHaikuNativeNapiAddon != null) MutPtr((unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsLopenAttrDir(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsFopenAttrDir(fd: CInt): MutPtr =
    if (unixHaikuNativeNapiAddon != null) MutPtr((unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsFopenAttrDir(fd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseAttrDir(dir: MutPtr): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsCloseAttrDir(dir.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadAttrDir(dir: MutPtr): MutPtr =
    if (unixHaikuNativeNapiAddon != null) MutPtr((unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsReadAttrDir(dir.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRewindAttrDir(dir: MutPtr) {
    if (unixHaikuNativeNapiAddon != null) {
        unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsRewindAttrDir(dir.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsCreateIndex(device: DevT, name: ConstPtr, type: UInt, flags: UInt): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsCreateIndex(device, name.rawAddress.toString(), type.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRemoveIndex(device: DevT, name: ConstPtr): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsRemoveIndex(device, name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsStatIndex(device: DevT, name: ConstPtr, indexInfo: MutPtr): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsStatIndex(device, name.rawAddress.toString(), indexInfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenIndexDir(device: DevT): MutPtr =
    if (unixHaikuNativeNapiAddon != null) MutPtr((unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsOpenIndexDir(device) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseIndexDir(indexDirectory: MutPtr): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsCloseIndexDir(indexDirectory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadIndexDir(indexDirectory: MutPtr): MutPtr =
    if (unixHaikuNativeNapiAddon != null) MutPtr((unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsReadIndexDir(indexDirectory.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRewindIndexDir(indexDirectory: MutPtr) {
    if (unixHaikuNativeNapiAddon != null) {
        unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsRewindIndexDir(indexDirectory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun devForPath(path: ConstPtr): DevT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeDevForPath(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nextDev(pos: MutPtr): DevT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeNextDev(pos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsStatDev(dev: DevT, info: MutPtr): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsStatDev(dev, info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenQuery(device: DevT, query: ConstPtr, flags: UInt): MutPtr =
    if (unixHaikuNativeNapiAddon != null) MutPtr((unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsOpenQuery(device, query.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsOpenLiveQuery(device: DevT, query: ConstPtr, flags: UInt, port: PortId, token: Int): MutPtr =
    if (unixHaikuNativeNapiAddon != null) MutPtr((unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsOpenLiveQuery(device, query.rawAddress.toString(), flags.toInt(), port, token) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsCloseQuery(d: MutPtr): CInt =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsCloseQuery(d.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsReadQuery(d: MutPtr): MutPtr =
    if (unixHaikuNativeNapiAddon != null) MutPtr((unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsReadQuery(d.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPathForDirent(dent: MutPtr, buf: MutPtr, len: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetPathForDirent(dent.rawAddress.toString(), buf.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsMountVolume(where: ConstPtr, device: ConstPtr, filesystem: ConstPtr, flags: UInt, parameters: ConstPtr): DevT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsMountVolume(where.rawAddress.toString(), device.rawAddress.toString(), filesystem.rawAddress.toString(), flags.toInt(), parameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsUnmountVolume(path: ConstPtr, flags: UInt): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFsUnmountVolume(path.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadImage(argc: Int, argv: MutPtr, environ: MutPtr): ThreadId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeLoadImage(argc, argv.rawAddress.toString(), environ.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadAddOn(path: ConstPtr): ImageId =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeLoadAddOn(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadAddOn(image: ImageId): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeUnloadAddOn(image) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getImageSymbol(image: ImageId, name: ConstPtr, symbolType: Int, symbolLocation: MutPtr): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetImageSymbol(image, name.rawAddress.toString(), symbolType, symbolLocation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: MutPtr, nameLength: MutPtr, symbolType: MutPtr, symbolLocation: MutPtr): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetNthImageSymbol(image, n, nameBuffer.rawAddress.toString(), nameLength.rawAddress.toString(), symbolType.rawAddress.toString(), symbolLocation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearCaches(address: MutPtr, length: SizeT, flags: UInt) {
    if (unixHaikuNativeNapiAddon != null) {
        unixHaikuNativeNapiAddon.libcUnixHaikuNativeClearCaches(address.rawAddress.toString(), length.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getImageInfo(image: ImageId, info: MutPtr, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetImageInfo(image, info.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextImageInfo(team: TeamId, cookie: MutPtr, info: MutPtr, size: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetNextImageInfo(team, cookie.rawAddress.toString(), info.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPath(codePointer: ConstPtr, baseDirectory: PathBaseDirectory, subPath: ConstPtr, pathBuffer: MutPtr, bufferSize: ULong): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFindPath(codePointer.rawAddress.toString(), baseDirectory, subPath.rawAddress.toString(), pathBuffer.rawAddress.toString(), bufferSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathEtc(codePointer: ConstPtr, dependency: ConstPtr, architecture: ConstPtr, baseDirectory: PathBaseDirectory, subPath: ConstPtr, flags: UInt, pathBuffer: MutPtr, bufferSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFindPathEtc(codePointer.rawAddress.toString(), dependency.rawAddress.toString(), architecture.rawAddress.toString(), baseDirectory, subPath.rawAddress.toString(), flags.toInt(), pathBuffer.rawAddress.toString(), bufferSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathForPath(path: ConstPtr, baseDirectory: PathBaseDirectory, subPath: ConstPtr, pathBuffer: MutPtr, bufferSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFindPathForPath(path.rawAddress.toString(), baseDirectory, subPath.rawAddress.toString(), pathBuffer.rawAddress.toString(), bufferSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathForPathEtc(path: ConstPtr, dependency: ConstPtr, architecture: ConstPtr, baseDirectory: PathBaseDirectory, subPath: ConstPtr, flags: UInt, pathBuffer: MutPtr, bufferSize: SizeT): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFindPathForPathEtc(path.rawAddress.toString(), dependency.rawAddress.toString(), architecture.rawAddress.toString(), baseDirectory, subPath.rawAddress.toString(), flags.toInt(), pathBuffer.rawAddress.toString(), bufferSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: ConstPtr, paths: MutPtr, pathCount: MutPtr): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFindPaths(baseDirectory, subPath.rawAddress.toString(), paths.rawAddress.toString(), pathCount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPathsEtc(architecture: ConstPtr, baseDirectory: PathBaseDirectory, subPath: ConstPtr, flags: UInt, paths: MutPtr, pathCount: MutPtr): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFindPathsEtc(architecture.rawAddress.toString(), baseDirectory, subPath.rawAddress.toString(), flags.toInt(), paths.rawAddress.toString(), pathCount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: MutPtr, length: Int): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeFindDirectory(which, volume, createIt, pathString.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCpuid(info: MutPtr, eaxRegister: UInt, cpuNum: UInt): StatusT =
    if (unixHaikuNativeNapiAddon != null) (unixHaikuNativeNapiAddon.libcUnixHaikuNativeGetCpuid(info.rawAddress.toString(), eaxRegister.toInt(), cpuNum.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
