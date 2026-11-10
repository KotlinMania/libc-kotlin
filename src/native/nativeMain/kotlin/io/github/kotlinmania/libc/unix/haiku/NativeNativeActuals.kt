@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_createArea(name, startAddress?.value?.toCPointer<ByteVar>(), addressSpec, size, lock, protection)

public actual fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_cloneArea(name, destAddress?.value?.toCPointer<ByteVar>(), addressSpec, protection, source)

public actual fun findArea(name: String?): AreaId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_findArea(name)

public actual fun areaFor(address: COpaquePointer?): AreaId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_areaFor(address?.value?.toCPointer<ByteVar>())

public actual fun deleteArea(id: AreaId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_deleteArea(id)

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_resizeArea(id, newSize)

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_setAreaProtection(id, newProtection)

public actual fun getAreaInfo(id: AreaId, areaInfo: COpaquePointer?, size: ULong): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getAreaInfo(id, areaInfo?.value?.toCPointer<ByteVar>(), size)

public actual fun getNextAreaInfo(team: TeamId, cookie: COpaquePointer?, areaInfo: COpaquePointer?, size: ULong): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getNextAreaInfo(team, cookie?.value?.toCPointer<ByteVar>(), areaInfo?.value?.toCPointer<ByteVar>(), size)

public actual fun createPort(capacity: Int, name: String?): PortId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_createPort(capacity, name)

public actual fun findPort(name: String?): PortId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_findPort(name)

public actual fun readPort(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_readPort(port, code?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun readPortEtc(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_readPortEtc(port, code?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize, flags, timeout)

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_writePort(port, code, buffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_writePortEtc(port, code, buffer?.value?.toCPointer<ByteVar>(), bufferSize, flags, timeout)

public actual fun closePort(port: PortId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_closePort(port)

public actual fun deletePort(port: PortId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_deletePort(port)

public actual fun portBufferSize(port: PortId): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_portBufferSize(port)

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_portBufferSizeEtc(port, flags, timeout)

public actual fun portCount(port: PortId): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_portCount(port)

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_setPortOwner(port, team)

public actual fun getPortInfo(port: PortId, buf: COpaquePointer?, portInfoSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getPortInfo(port, buf?.value?.toCPointer<ByteVar>(), portInfoSize)

public actual fun getNextPortInfo(port: PortId, cookie: COpaquePointer?, portInfo: COpaquePointer?, portInfoSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getNextPortInfo(port, cookie?.value?.toCPointer<ByteVar>(), portInfo?.value?.toCPointer<ByteVar>(), portInfoSize)

public actual fun getPortMessageInfoEtc(port: PortId, info: COpaquePointer?, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getPortMessageInfoEtc(port, info?.value?.toCPointer<ByteVar>(), infoSize, flags, timeout)

public actual fun createSem(count: Int, name: String?): SemId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_createSem(count, name)

public actual fun deleteSem(id: SemId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_deleteSem(id)

public actual fun acquireSem(id: SemId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_acquireSem(id)

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_acquireSemEtc(id, count, flags, timeout)

public actual fun releaseSem(id: SemId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_releaseSem(id)

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_releaseSemEtc(id, count, flags)

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_switchSem(semToBeReleased, id)

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_switchSemEtc(semToBeReleased, id, count, flags, timeout)

public actual fun getSemCount(id: SemId, threadCount: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getSemCount(id, threadCount?.value?.toCPointer<ByteVar>())

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_setSemOwner(id, team)

public actual fun getSemInfo(id: SemId, info: COpaquePointer?, infoSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getSemInfo(id, info?.value?.toCPointer<ByteVar>(), infoSize)

public actual fun getNextSemInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, infoSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getNextSemInfo(team, cookie?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), infoSize)

public actual fun killTeam(team: TeamId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_killTeam(team)

public actual fun getTeamInfo(team: TeamId, info: COpaquePointer?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getTeamInfo(team, info?.value?.toCPointer<ByteVar>(), size)

public actual fun getNextTeamInfo(cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getNextTeamInfo(cookie?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), size)

public actual fun spawnThread(func: ThreadFunc, name: String?, priority: Int, data: COpaquePointer?): ThreadId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_spawnThread(0L.toCPointer<ByteVar>(), name, priority, data?.value?.toCPointer<ByteVar>())

public actual fun killThread(thread: ThreadId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_killThread(thread)

public actual fun resumeThread(thread: ThreadId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_resumeThread(thread)

public actual fun suspendThread(thread: ThreadId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_suspendThread(thread)

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_renameThread(thread, newName)

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_setThreadPriority(thread, newPriority)

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_suggestThreadPriority(what, period, jitter, length)

public actual fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_estimateMaxSchedulingLatency(th)

public actual fun exitThread(status: StatusT) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_exitThread(status)
}

public actual fun waitForThread(thread: ThreadId, returnValue: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_waitForThread(thread, returnValue?.value?.toCPointer<ByteVar>())

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_onExitThread(0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun findThread(name: String?): ThreadId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_findThread(name)

public actual fun getSchedulerMode(): Int =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getSchedulerMode()

public actual fun setSchedulerMode(mode: Int): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_setSchedulerMode(mode)

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_sendData(thread, code, buffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun receiveData(sender: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): Int =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_receiveData(sender?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun hasData(thread: ThreadId): Boolean =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_hasData(thread)

public actual fun snooze(amount: BigtimeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_snooze(amount)

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_snoozeEtc(amount, timeBase, flags)

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_snoozeUntil(time, timeBase)

public actual fun getThreadInfo(id: ThreadId, info: COpaquePointer?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getThreadInfo(id, info?.value?.toCPointer<ByteVar>(), size)

public actual fun getNextThreadInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getNextThreadInfo(team, cookie?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), size)

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getPthreadThreadId(thread.toLong().toCPointer<ByteVar>())

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: COpaquePointer?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getTeamUsageInfo(team, who, info?.value?.toCPointer<ByteVar>(), size)

public actual fun realTimeClock(): CUlong =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_realTimeClock()

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_setRealTimeClock(secsSinceJan1st1970)
}

public actual fun realTimeClockUsecs(): BigtimeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_realTimeClockUsecs()

public actual fun systemTime(): BigtimeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_systemTime()

public actual fun systemTimeNsecs(): NanotimeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_systemTimeNsecs()

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_setAlarm(whenBranch, flags)

public actual fun debugger(message: String?) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_debugger(message)
}

public actual fun disableDebugger(state: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_disableDebugger(state)

public actual fun getSystemInfo(info: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getSystemInfo(info?.value?.toCPointer<ByteVar>())

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: COpaquePointer?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getCpuInfoEtc(firstCPU, cpuCount, info?.value?.toCPointer<ByteVar>(), size)

public actual fun getCpuTopologyInfo(topologyInfos: COpaquePointer?, topologyInfoCount: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getCpuTopologyInfo(topologyInfos?.value?.toCPointer<ByteVar>(), topologyInfoCount?.value?.toCPointer<ByteVar>())

public actual fun isComputerOn(): Int =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_isComputerOn()

public actual fun isComputerOnFire(): CDouble =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_isComputerOnFire()

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_sendSignal(threadID, signal)

public actual fun setSignalStack(base: COpaquePointer?, size: SizeT) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_setSignalStack(base?.value?.toCPointer<ByteVar>(), size)
}

public actual fun waitForObjects(infos: COpaquePointer?, numInfos: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_waitForObjects(infos?.value?.toCPointer<ByteVar>(), numInfos)

public actual fun waitForObjectsEtc(infos: COpaquePointer?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_waitForObjectsEtc(infos?.value?.toCPointer<ByteVar>(), numInfos, flags, timeout)

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsReadAttr(fd, attribute, type, pos, buffer?.value?.toCPointer<ByteVar>(), readBytes)

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsWriteAttr(fd, attribute, type, pos, buffer?.value?.toCPointer<ByteVar>(), writeBytes)

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsRemoveAttr(fd, attribute)

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsStatAttr(fd, attribute, attrInfo?.value?.toCPointer<ByteVar>())

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsOpenAttr(path, attribute, type, openMode)

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsFopenAttr(fd, attribute, type, openMode)

public actual fun fsCloseAttr(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsCloseAttr(fd)

public actual fun fsOpenAttrDir(path: String?): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsOpenAttrDir(path)?.let { DIR(it.toLong()) }

public actual fun fsLopenAttrDir(path: String?): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsLopenAttrDir(path)?.let { DIR(it.toLong()) }

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsFopenAttrDir(fd)?.let { DIR(it.toLong()) }

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsCloseAttrDir(dir?.handle?.toCPointer<ByteVar>())

public actual fun fsReadAttrDir(dir: DIR?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsReadAttrDir(dir?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fsRewindAttrDir(dir: DIR?) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsRewindAttrDir(dir?.handle?.toCPointer<ByteVar>())
}

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsCreateIndex(device, name, type, flags)

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsRemoveIndex(device, name)

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsStatIndex(device, name, indexInfo?.value?.toCPointer<ByteVar>())

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsOpenIndexDir(device)?.let { DIR(it.toLong()) }

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsCloseIndexDir(indexDirectory?.handle?.toCPointer<ByteVar>())

public actual fun fsReadIndexDir(indexDirectory: DIR?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsReadIndexDir(indexDirectory?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fsRewindIndexDir(indexDirectory: DIR?) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsRewindIndexDir(indexDirectory?.handle?.toCPointer<ByteVar>())
}

public actual fun devForPath(path: String?): DevT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_devForPath(path)

public actual fun nextDev(pos: COpaquePointer?): DevT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_nextDev(pos?.value?.toCPointer<ByteVar>())

public actual fun fsStatDev(dev: DevT, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsStatDev(dev, info?.value?.toCPointer<ByteVar>())

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsOpenQuery(device, query, flags)?.let { DIR(it.toLong()) }

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsOpenLiveQuery(device, query, flags, port, token)?.let { DIR(it.toLong()) }

public actual fun fsCloseQuery(d: DIR?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsCloseQuery(d?.handle?.toCPointer<ByteVar>())

public actual fun fsReadQuery(d: DIR?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsReadQuery(d?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getPathForDirent(dent: COpaquePointer?, buf: COpaquePointer?, len: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getPathForDirent(dent?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), len)

public actual fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): DevT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsMountVolume(where, device, filesystem, flags, parameters)

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_fsUnmountVolume(path, flags)

public actual fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): ThreadId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_loadImage(argc, argv?.value?.toCPointer<ByteVar>(), environ?.value?.toCPointer<ByteVar>())

public actual fun loadAddOn(path: String?): ImageId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_loadAddOn(path)

public actual fun unloadAddOn(image: ImageId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_unloadAddOn(image)

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getImageSymbol(image, name, symbolType, symbolLocation?.value?.toCPointer<ByteVar>())

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: COpaquePointer?, nameLength: COpaquePointer?, symbolType: COpaquePointer?, symbolLocation: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getNthImageSymbol(image, n, nameBuffer?.value?.toCPointer<ByteVar>(), nameLength?.value?.toCPointer<ByteVar>(), symbolType?.value?.toCPointer<ByteVar>(), symbolLocation?.value?.toCPointer<ByteVar>())

public actual fun clearCaches(address: COpaquePointer?, length: SizeT, flags: UInt) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_clearCaches(address?.value?.toCPointer<ByteVar>(), length, flags)
}

public actual fun getImageInfo(image: ImageId, info: COpaquePointer?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getImageInfo(image, info?.value?.toCPointer<ByteVar>(), size)

public actual fun getNextImageInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getNextImageInfo(team, cookie?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), size)

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: ULong): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_findPath(codePointer?.value?.toCPointer<ByteVar>(), baseDirectory, subPath, pathBuffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_findPathEtc(codePointer?.value?.toCPointer<ByteVar>(), dependency, architecture, baseDirectory, subPath, flags, pathBuffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_findPathForPath(path, baseDirectory, subPath, pathBuffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_findPathForPathEtc(path, dependency, architecture, baseDirectory, subPath, flags, pathBuffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_findPaths(baseDirectory, subPath, paths?.value?.toCPointer<ByteVar>(), pathCount?.value?.toCPointer<ByteVar>())

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_findPathsEtc(architecture, baseDirectory, subPath, flags, paths?.value?.toCPointer<ByteVar>(), pathCount?.value?.toCPointer<ByteVar>())

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: COpaquePointer?, length: Int): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_findDirectory(which, volume, createIt, pathString?.value?.toCPointer<ByteVar>(), length)

public actual fun getCpuid(info: COpaquePointer?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_native_getCpuid(info?.value?.toCPointer<ByteVar>(), eaxRegister, cpuNum)
