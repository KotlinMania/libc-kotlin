@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

private val _unixHaikuNativeNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_createArea(name, (startAddress?.value ?: 0L).toString(), addressSpec.toInt(), size.toString(), lock.toInt(), protection.toInt()) as Int) else 0

public actual fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_cloneArea(name, (destAddress?.value ?: 0L).toString(), addressSpec.toInt(), protection.toInt(), source) as Int) else 0

public actual fun findArea(name: String?): AreaId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_findArea(name) as Int) else 0

public actual fun areaFor(address: COpaquePointer?): AreaId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_areaFor((address?.value ?: 0L).toString()) as Int) else 0

public actual fun deleteArea(id: AreaId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_deleteArea(id) as Int) else 0

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_resizeArea(id, newSize.toString()) as Int) else 0

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_setAreaProtection(id, newProtection.toInt()) as Int) else 0

public actual fun getAreaInfo(id: AreaId, areaInfo: COpaquePointer?, size: ULong): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getAreaInfo(id, (areaInfo?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun getNextAreaInfo(team: TeamId, cookie: COpaquePointer?, areaInfo: COpaquePointer?, size: ULong): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getNextAreaInfo(team, (cookie?.value ?: 0L).toString(), (areaInfo?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun createPort(capacity: Int, name: String?): PortId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_createPort(capacity, name) as Int) else 0

public actual fun findPort(name: String?): PortId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_findPort(name) as Int) else 0

public actual fun readPort(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): SsizeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_readPort(port, (code?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString()) as String).toLong() else 0L

public actual fun readPortEtc(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_readPortEtc(port, (code?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString(), flags.toInt(), timeout.toString()) as String).toLong() else 0L

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_writePort(port, code, (buffer?.value ?: 0L).toString(), bufferSize.toString()) as Int) else 0

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_writePortEtc(port, code, (buffer?.value ?: 0L).toString(), bufferSize.toString(), flags.toInt(), timeout.toString()) as Int) else 0

public actual fun closePort(port: PortId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_closePort(port) as Int) else 0

public actual fun deletePort(port: PortId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_deletePort(port) as Int) else 0

public actual fun portBufferSize(port: PortId): SsizeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_portBufferSize(port) as String).toLong() else 0L

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_portBufferSizeEtc(port, flags.toInt(), timeout.toString()) as String).toLong() else 0L

public actual fun portCount(port: PortId): SsizeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_portCount(port) as String).toLong() else 0L

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_setPortOwner(port, team) as Int) else 0

public actual fun getPortInfo(port: PortId, buf: COpaquePointer?, portInfoSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getPortInfo(port, (buf?.value ?: 0L).toString(), portInfoSize.toString()) as Int) else 0

public actual fun getNextPortInfo(port: PortId, cookie: COpaquePointer?, portInfo: COpaquePointer?, portInfoSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getNextPortInfo(port, (cookie?.value ?: 0L).toString(), (portInfo?.value ?: 0L).toString(), portInfoSize.toString()) as Int) else 0

public actual fun getPortMessageInfoEtc(port: PortId, info: COpaquePointer?, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getPortMessageInfoEtc(port, (info?.value ?: 0L).toString(), infoSize.toString(), flags.toInt(), timeout.toString()) as Int) else 0

public actual fun createSem(count: Int, name: String?): SemId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_createSem(count, name) as Int) else 0

public actual fun deleteSem(id: SemId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_deleteSem(id) as Int) else 0

public actual fun acquireSem(id: SemId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_acquireSem(id) as Int) else 0

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_acquireSemEtc(id, count, flags.toInt(), timeout.toString()) as Int) else 0

public actual fun releaseSem(id: SemId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_releaseSem(id) as Int) else 0

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_releaseSemEtc(id, count, flags.toInt()) as Int) else 0

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_switchSem(semToBeReleased, id) as Int) else 0

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_switchSemEtc(semToBeReleased, id, count, flags.toInt(), timeout.toString()) as Int) else 0

public actual fun getSemCount(id: SemId, threadCount: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getSemCount(id, (threadCount?.value ?: 0L).toString()) as Int) else 0

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_setSemOwner(id, team) as Int) else 0

public actual fun getSemInfo(id: SemId, info: COpaquePointer?, infoSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getSemInfo(id, (info?.value ?: 0L).toString(), infoSize.toString()) as Int) else 0

public actual fun getNextSemInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, infoSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getNextSemInfo(team, (cookie?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), infoSize.toString()) as Int) else 0

public actual fun killTeam(team: TeamId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_killTeam(team) as Int) else 0

public actual fun getTeamInfo(team: TeamId, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getTeamInfo(team, (info?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun getNextTeamInfo(cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getNextTeamInfo((cookie?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun spawnThread(func: ThreadFunc, name: String?, priority: Int, data: COpaquePointer?): ThreadId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_spawnThread(0L.toString(), name, priority, (data?.value ?: 0L).toString()) as Int) else 0

public actual fun killThread(thread: ThreadId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_killThread(thread) as Int) else 0

public actual fun resumeThread(thread: ThreadId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_resumeThread(thread) as Int) else 0

public actual fun suspendThread(thread: ThreadId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_suspendThread(thread) as Int) else 0

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_renameThread(thread, newName) as Int) else 0

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_setThreadPriority(thread, newPriority) as Int) else 0

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_suggestThreadPriority(what.toInt(), period, jitter.toString(), length.toString()) as Int) else 0

public actual fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_estimateMaxSchedulingLatency(th) as String).toLong() else 0L

public actual fun exitThread(status: StatusT) {
    if (_unixHaikuNativeNapiAddon != null) {
        _unixHaikuNativeNapiAddon.libc_unix_haiku_native_exitThread(status)
    }
}

public actual fun waitForThread(thread: ThreadId, returnValue: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_waitForThread(thread, (returnValue?.value ?: 0L).toString()) as Int) else 0

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_onExitThread(0L.toString(), (data?.value ?: 0L).toString()) as Int) else 0

public actual fun findThread(name: String?): ThreadId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_findThread(name) as Int) else 0

public actual fun getSchedulerMode(): Int =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getSchedulerMode() as Int) else 0

public actual fun setSchedulerMode(mode: Int): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_setSchedulerMode(mode) as Int) else 0

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_sendData(thread, code, (buffer?.value ?: 0L).toString(), bufferSize.toString()) as Int) else 0

public actual fun receiveData(sender: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): Int =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_receiveData((sender?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString()) as Int) else 0

public actual fun hasData(thread: ThreadId): Boolean =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_hasData(thread) as Boolean) else false

public actual fun snooze(amount: BigtimeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_snooze(amount.toString()) as Int) else 0

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_snoozeEtc(amount.toString(), timeBase, flags.toInt()) as Int) else 0

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_snoozeUntil(time.toString(), timeBase) as Int) else 0

public actual fun getThreadInfo(id: ThreadId, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getThreadInfo(id, (info?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun getNextThreadInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getNextThreadInfo(team, (cookie?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getPthreadThreadId(thread.toLong().toString()) as Int) else 0

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getTeamUsageInfo(team, who, (info?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun realTimeClock(): CUlong =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_realTimeClock() as String).toULong() else 0uL

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
    if (_unixHaikuNativeNapiAddon != null) {
        _unixHaikuNativeNapiAddon.libc_unix_haiku_native_setRealTimeClock(secsSinceJan1st1970.toString())
    }
}

public actual fun realTimeClockUsecs(): BigtimeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_realTimeClockUsecs() as String).toLong() else 0L

public actual fun systemTime(): BigtimeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_systemTime() as String).toLong() else 0L

public actual fun systemTimeNsecs(): NanotimeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_systemTimeNsecs() as String).toLong() else 0L

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_setAlarm(whenBranch.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun debugger(message: String?) {
    if (_unixHaikuNativeNapiAddon != null) {
        _unixHaikuNativeNapiAddon.libc_unix_haiku_native_debugger(message)
    }
}

public actual fun disableDebugger(state: CInt): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_disableDebugger(state) as Int) else 0

public actual fun getSystemInfo(info: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getSystemInfo((info?.value ?: 0L).toString()) as Int) else 0

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getCpuInfoEtc(firstCPU.toInt(), cpuCount.toInt(), (info?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun getCpuTopologyInfo(topologyInfos: COpaquePointer?, topologyInfoCount: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getCpuTopologyInfo((topologyInfos?.value ?: 0L).toString(), (topologyInfoCount?.value ?: 0L).toString()) as Int) else 0

public actual fun isComputerOn(): Int =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_isComputerOn() as Int) else 0

public actual fun isComputerOnFire(): CDouble =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_isComputerOnFire() as Double) else 0.0

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_sendSignal(threadID, signal.toInt()) as Int) else 0

public actual fun setSignalStack(base: COpaquePointer?, size: SizeT) {
    if (_unixHaikuNativeNapiAddon != null) {
        _unixHaikuNativeNapiAddon.libc_unix_haiku_native_setSignalStack((base?.value ?: 0L).toString(), size.toString())
    }
}

public actual fun waitForObjects(infos: COpaquePointer?, numInfos: CInt): SsizeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_waitForObjects((infos?.value ?: 0L).toString(), numInfos) as String).toLong() else 0L

public actual fun waitForObjectsEtc(infos: COpaquePointer?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_waitForObjectsEtc((infos?.value ?: 0L).toString(), numInfos, flags.toInt(), timeout.toString()) as String).toLong() else 0L

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: SizeT): SsizeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsReadAttr(fd, attribute, type.toInt(), pos.toString(), (buffer?.value ?: 0L).toString(), readBytes.toString()) as String).toLong() else 0L

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: SizeT): SsizeT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsWriteAttr(fd, attribute, type.toInt(), pos.toString(), (buffer?.value ?: 0L).toString(), writeBytes.toString()) as String).toLong() else 0L

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsRemoveAttr(fd, attribute) as Int) else 0

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: COpaquePointer?): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsStatAttr(fd, attribute, (attrInfo?.value ?: 0L).toString()) as Int) else 0

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsOpenAttr(path, attribute, type.toInt(), openMode) as Int) else 0

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsFopenAttr(fd, attribute, type.toInt(), openMode) as Int) else 0

public actual fun fsCloseAttr(fd: CInt): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsCloseAttr(fd) as Int) else 0

public actual fun fsOpenAttrDir(path: String?): DIR? =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsOpenAttrDir(path) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun fsLopenAttrDir(path: String?): DIR? =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsLopenAttrDir(path) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsFopenAttrDir(fd) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsCloseAttrDir((dir?.handle ?: 0L).toString()) as Int) else 0

public actual fun fsReadAttrDir(dir: DIR?): COpaquePointer? =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsReadAttrDir((dir?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun fsRewindAttrDir(dir: DIR?) {
    if (_unixHaikuNativeNapiAddon != null) {
        _unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsRewindAttrDir((dir?.handle ?: 0L).toString())
    }
}

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsCreateIndex(device, name, type.toInt(), flags.toInt()) as Int) else 0

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsRemoveIndex(device, name) as Int) else 0

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: COpaquePointer?): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsStatIndex(device, name, (indexInfo?.value ?: 0L).toString()) as Int) else 0

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsOpenIndexDir(device) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsCloseIndexDir((indexDirectory?.handle ?: 0L).toString()) as Int) else 0

public actual fun fsReadIndexDir(indexDirectory: DIR?): COpaquePointer? =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsReadIndexDir((indexDirectory?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun fsRewindIndexDir(indexDirectory: DIR?) {
    if (_unixHaikuNativeNapiAddon != null) {
        _unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsRewindIndexDir((indexDirectory?.handle ?: 0L).toString())
    }
}

public actual fun devForPath(path: String?): DevT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_devForPath(path) as Int) else 0

public actual fun nextDev(pos: COpaquePointer?): DevT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_nextDev((pos?.value ?: 0L).toString()) as Int) else 0

public actual fun fsStatDev(dev: DevT, info: COpaquePointer?): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsStatDev(dev, (info?.value ?: 0L).toString()) as Int) else 0

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsOpenQuery(device, query, flags.toInt()) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsOpenLiveQuery(device, query, flags.toInt(), port, token) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun fsCloseQuery(d: DIR?): CInt =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsCloseQuery((d?.handle ?: 0L).toString()) as Int) else 0

public actual fun fsReadQuery(d: DIR?): COpaquePointer? =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsReadQuery((d?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getPathForDirent(dent: COpaquePointer?, buf: COpaquePointer?, len: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getPathForDirent((dent?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): DevT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsMountVolume(where, device, filesystem, flags.toInt(), parameters) as Int) else 0

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_fsUnmountVolume(path, flags.toInt()) as Int) else 0

public actual fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): ThreadId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_loadImage(argc, (argv?.value ?: 0L).toString(), (environ?.value ?: 0L).toString()) as Int) else 0

public actual fun loadAddOn(path: String?): ImageId =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_loadAddOn(path) as Int) else 0

public actual fun unloadAddOn(image: ImageId): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_unloadAddOn(image) as Int) else 0

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getImageSymbol(image, name, symbolType, (symbolLocation?.value ?: 0L).toString()) as Int) else 0

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: COpaquePointer?, nameLength: COpaquePointer?, symbolType: COpaquePointer?, symbolLocation: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getNthImageSymbol(image, n, (nameBuffer?.value ?: 0L).toString(), (nameLength?.value ?: 0L).toString(), (symbolType?.value ?: 0L).toString(), (symbolLocation?.value ?: 0L).toString()) as Int) else 0

public actual fun clearCaches(address: COpaquePointer?, length: SizeT, flags: UInt) {
    if (_unixHaikuNativeNapiAddon != null) {
        _unixHaikuNativeNapiAddon.libc_unix_haiku_native_clearCaches((address?.value ?: 0L).toString(), length.toString(), flags.toInt())
    }
}

public actual fun getImageInfo(image: ImageId, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getImageInfo(image, (info?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun getNextImageInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getNextImageInfo(team, (cookie?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), size.toString()) as Int) else 0

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: ULong): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_findPath((codePointer?.value ?: 0L).toString(), baseDirectory, subPath, (pathBuffer?.value ?: 0L).toString(), bufferSize.toString()) as Int) else 0

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_findPathEtc((codePointer?.value ?: 0L).toString(), dependency, architecture, baseDirectory, subPath, flags.toInt(), (pathBuffer?.value ?: 0L).toString(), bufferSize.toString()) as Int) else 0

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_findPathForPath(path, baseDirectory, subPath, (pathBuffer?.value ?: 0L).toString(), bufferSize.toString()) as Int) else 0

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_findPathForPathEtc(path, dependency, architecture, baseDirectory, subPath, flags.toInt(), (pathBuffer?.value ?: 0L).toString(), bufferSize.toString()) as Int) else 0

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_findPaths(baseDirectory, subPath, (paths?.value ?: 0L).toString(), (pathCount?.value ?: 0L).toString()) as Int) else 0

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_findPathsEtc(architecture, baseDirectory, subPath, flags.toInt(), (paths?.value ?: 0L).toString(), (pathCount?.value ?: 0L).toString()) as Int) else 0

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: COpaquePointer?, length: Int): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_findDirectory(which, volume, createIt, (pathString?.value ?: 0L).toString(), length) as Int) else 0

public actual fun getCpuid(info: COpaquePointer?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    if (_unixHaikuNativeNapiAddon != null) (_unixHaikuNativeNapiAddon.libc_unix_haiku_native_getCpuid((info?.value ?: 0L).toString(), eaxRegister.toInt(), cpuNum.toInt()) as Int) else 0
