package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.COpaquePointer

internal object NativeRawLibc {
    external fun createArea(name: String?, startAddress: Long, addressSpec: Int, size: Long, lock: Int, protection: Int): Long
    external fun cloneArea(name: String?, destAddress: Long, addressSpec: Int, protection: Int, source: Long): Long
    external fun findArea(name: String?): Long
    external fun areaFor(address: Long): Long
    external fun deleteArea(id: Long): Long
    external fun resizeArea(id: Long, newSize: Long): Long
    external fun setAreaProtection(id: Long, newProtection: Int): Long
    external fun getAreaInfo(id: Long, areaInfo: Long, size: Long): Long
    external fun getNextAreaInfo(team: Long, cookie: Long, areaInfo: Long, size: Long): Long
    external fun createPort(capacity: Int, name: String?): Long
    external fun findPort(name: String?): Long
    external fun readPort(port: Long, code: Long, buffer: Long, bufferSize: Long): Long
    external fun readPortEtc(port: Long, code: Long, buffer: Long, bufferSize: Long, flags: Int, timeout: Long): Long
    external fun writePort(port: Long, code: Int, buffer: Long, bufferSize: Long): Long
    external fun writePortEtc(port: Long, code: Int, buffer: Long, bufferSize: Long, flags: Int, timeout: Long): Long
    external fun closePort(port: Long): Long
    external fun deletePort(port: Long): Long
    external fun portBufferSize(port: Long): Long
    external fun portBufferSizeEtc(port: Long, flags: Int, timeout: Long): Long
    external fun portCount(port: Long): Long
    external fun setPortOwner(port: Long, team: Long): Long
    external fun getPortInfo(port: Long, buf: Long, portInfoSize: Long): Long
    external fun getNextPortInfo(port: Long, cookie: Long, portInfo: Long, portInfoSize: Long): Long
    external fun getPortMessageInfoEtc(port: Long, info: Long, infoSize: Long, flags: Int, timeout: Long): Long
    external fun createSem(count: Int, name: String?): Long
    external fun deleteSem(id: Long): Long
    external fun acquireSem(id: Long): Long
    external fun acquireSemEtc(id: Long, count: Int, flags: Int, timeout: Long): Long
    external fun releaseSem(id: Long): Long
    external fun releaseSemEtc(id: Long, count: Int, flags: Int): Long
    external fun switchSem(semToBeReleased: Long, id: Long): Long
    external fun switchSemEtc(semToBeReleased: Long, id: Long, count: Int, flags: Int, timeout: Long): Long
    external fun getSemCount(id: Long, threadCount: Long): Long
    external fun setSemOwner(id: Long, team: Long): Long
    external fun getSemInfo(id: Long, info: Long, infoSize: Long): Long
    external fun getNextSemInfo(team: Long, cookie: Long, info: Long, infoSize: Long): Long
    external fun killTeam(team: Long): Long
    external fun getTeamInfo(team: Long, info: Long, size: Long): Long
    external fun getNextTeamInfo(cookie: Long, info: Long, size: Long): Long
    external fun spawnThread(func: Long, name: String?, priority: Int, data: Long): Long
    external fun killThread(thread: Long): Long
    external fun resumeThread(thread: Long): Long
    external fun suspendThread(thread: Long): Long
    external fun renameThread(thread: Long, newName: String?): Long
    external fun setThreadPriority(thread: Long, newPriority: Int): Long
    external fun suggestThreadPriority(what: Int, period: Int, jitter: Long, length: Long): Int
    external fun estimateMaxSchedulingLatency(th: Long): Long
    external fun exitThread(status: Long)
    external fun waitForThread(thread: Long, returnValue: Long): Long
    external fun onExitThread(callback: Long, data: Long): Long
    external fun findThread(name: String?): Long
    external fun getSchedulerMode(): Int
    external fun setSchedulerMode(mode: Int): Long
    external fun sendData(thread: Long, code: Int, buffer: Long, bufferSize: Long): Long
    external fun receiveData(sender: Long, buffer: Long, bufferSize: Long): Int
    external fun hasData(thread: Long): Boolean
    external fun snooze(amount: Long): Long
    external fun snoozeEtc(amount: Long, timeBase: Int, flags: Int): Long
    external fun snoozeUntil(time: Long, timeBase: Int): Long
    external fun getThreadInfo(id: Long, info: Long, size: Long): Long
    external fun getNextThreadInfo(team: Long, cookie: Long, info: Long, size: Long): Long
    external fun getPthreadThreadId(thread: Long): Long
    external fun getTeamUsageInfo(team: Long, who: Int, info: Long, size: Long): Long
    external fun realTimeClock(): Long
    external fun setRealTimeClock(secsSinceJan1st1970: Long)
    external fun realTimeClockUsecs(): Long
    external fun systemTime(): Long
    external fun systemTimeNsecs(): Long
    external fun setAlarm(whenBranch: Long, flags: Int): Long
    external fun debugger(message: String?)
    external fun disableDebugger(state: Int): Int
    external fun getSystemInfo(info: Long): Long
    external fun getCpuInfoEtc(firstCPU: Int, cpuCount: Int, info: Long, size: Long): Long
    external fun getCpuTopologyInfo(topologyInfos: Long, topologyInfoCount: Long): Long
    external fun isComputerOn(): Int
    external fun isComputerOnFire(): Double
    external fun sendSignal(threadID: Long, signal: Int): Int
    external fun setSignalStack(base: Long, size: Long)
    external fun waitForObjects(infos: Long, numInfos: Int): Long
    external fun waitForObjectsEtc(infos: Long, numInfos: Int, flags: Int, timeout: Long): Long
    external fun fsReadAttr(fd: Int, attribute: String?, type: Int, pos: Long, buffer: Long, readBytes: Long): Long
    external fun fsWriteAttr(fd: Int, attribute: String?, type: Int, pos: Long, buffer: Long, writeBytes: Long): Long
    external fun fsRemoveAttr(fd: Int, attribute: String?): Int
    external fun fsStatAttr(fd: Int, attribute: String?, attrInfo: Long): Int
    external fun fsOpenAttr(path: String?, attribute: String?, type: Int, openMode: Int): Int
    external fun fsFopenAttr(fd: Int, attribute: String?, type: Int, openMode: Int): Int
    external fun fsCloseAttr(fd: Int): Int
    external fun fsOpenAttrDir(path: String?): Long?
    external fun fsLopenAttrDir(path: String?): Long?
    external fun fsFopenAttrDir(fd: Int): Long?
    external fun fsCloseAttrDir(dir: Long): Int
    external fun fsReadAttrDir(dir: Long): Long?
    external fun fsRewindAttrDir(dir: Long)
    external fun fsCreateIndex(device: Long, name: String?, type: Int, flags: Int): Int
    external fun fsRemoveIndex(device: Long, name: String?): Int
    external fun fsStatIndex(device: Long, name: String?, indexInfo: Long): Int
    external fun fsOpenIndexDir(device: Long): Long?
    external fun fsCloseIndexDir(indexDirectory: Long): Int
    external fun fsReadIndexDir(indexDirectory: Long): Long?
    external fun fsRewindIndexDir(indexDirectory: Long)
    external fun devForPath(path: String?): Long
    external fun nextDev(pos: Long): Long
    external fun fsStatDev(dev: Long, info: Long): Int
    external fun fsOpenQuery(device: Long, query: String?, flags: Int): Long?
    external fun fsOpenLiveQuery(device: Long, query: String?, flags: Int, port: Long, token: Int): Long?
    external fun fsCloseQuery(d: Long): Int
    external fun fsReadQuery(d: Long): Long?
    external fun getPathForDirent(dent: Long, buf: Long, len: Long): Long
    external fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: Int, parameters: String?): Long
    external fun fsUnmountVolume(path: String?, flags: Int): Long
    external fun loadImage(argc: Int, argv: Long, environ: Long): Long
    external fun loadAddOn(path: String?): Long
    external fun unloadAddOn(image: Long): Long
    external fun getImageSymbol(image: Long, name: String?, symbolType: Int, symbolLocation: Long): Long
    external fun getNthImageSymbol(image: Long, n: Int, nameBuffer: Long, nameLength: Long, symbolType: Long, symbolLocation: Long): Long
    external fun clearCaches(address: Long, length: Long, flags: Int)
    external fun getImageInfo(image: Long, info: Long, size: Long): Long
    external fun getNextImageInfo(team: Long, cookie: Long, info: Long, size: Long): Long
    external fun findPath(codePointer: Long, baseDirectory: Long, subPath: String?, pathBuffer: Long, bufferSize: Long): Long
    external fun findPathEtc(codePointer: Long, dependency: String?, architecture: String?, baseDirectory: Long, subPath: String?, flags: Int, pathBuffer: Long, bufferSize: Long): Long
    external fun findPathForPath(path: String?, baseDirectory: Long, subPath: String?, pathBuffer: Long, bufferSize: Long): Long
    external fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: Long, subPath: String?, flags: Int, pathBuffer: Long, bufferSize: Long): Long
    external fun findPaths(baseDirectory: Long, subPath: String?, paths: Long, pathCount: Long): Long
    external fun findPathsEtc(architecture: String?, baseDirectory: Long, subPath: String?, flags: Int, paths: Long, pathCount: Long): Long
    external fun findDirectory(which: Long, volume: Long, createIt: Boolean, pathString: Long, length: Int): Long
    external fun getCpuid(info: Long, eaxRegister: Int, cpuNum: Int): Long
}

public actual fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    NativeRawLibc.createArea(name, startAddress?.value ?: 0L, addressSpec, size, lock, protection)

public actual fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    NativeRawLibc.cloneArea(name, destAddress?.value ?: 0L, addressSpec, protection, source)

public actual fun findArea(name: String?): AreaId =
    NativeRawLibc.findArea(name)

public actual fun areaFor(address: COpaquePointer?): AreaId =
    NativeRawLibc.areaFor(address?.value ?: 0L)

public actual fun deleteArea(id: AreaId): StatusT =
    NativeRawLibc.deleteArea(id)

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    NativeRawLibc.resizeArea(id, newSize)

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    NativeRawLibc.setAreaProtection(id, newProtection)

public actual fun getAreaInfo(id: AreaId, areaInfo: AreaInfo?, size: ULong): StatusT =
    NativeRawLibc.getAreaInfo(id, areaInfo?.toLong() ?: 0L, size)

public actual fun getNextAreaInfo(team: TeamId, cookie: Long?, areaInfo: AreaInfo?, size: ULong): StatusT =
    NativeRawLibc.getNextAreaInfo(team, cookie?.toLong() ?: 0L, areaInfo?.toLong() ?: 0L, size)

public actual fun createPort(capacity: Int, name: String?): PortId =
    NativeRawLibc.createPort(capacity, name)

public actual fun findPort(name: String?): PortId =
    NativeRawLibc.findPort(name)

public actual fun readPort(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: SizeT): SsizeT =
    NativeRawLibc.readPort(port, code?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize)

public actual fun readPortEtc(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    NativeRawLibc.readPortEtc(port, code?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize, flags, timeout)

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    NativeRawLibc.writePort(port, code, buffer?.value ?: 0L, bufferSize)

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    NativeRawLibc.writePortEtc(port, code, buffer?.value ?: 0L, bufferSize, flags, timeout)

public actual fun closePort(port: PortId): StatusT =
    NativeRawLibc.closePort(port)

public actual fun deletePort(port: PortId): StatusT =
    NativeRawLibc.deletePort(port)

public actual fun portBufferSize(port: PortId): SsizeT =
    NativeRawLibc.portBufferSize(port)

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    NativeRawLibc.portBufferSizeEtc(port, flags, timeout)

public actual fun portCount(port: PortId): SsizeT =
    NativeRawLibc.portCount(port)

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    NativeRawLibc.setPortOwner(port, team)

public actual fun getPortInfo(port: PortId, buf: PortInfo?, portInfoSize: SizeT): StatusT =
    NativeRawLibc.getPortInfo(port, buf?.toLong() ?: 0L, portInfoSize)

public actual fun getNextPortInfo(port: PortId, cookie: Int?, portInfo: PortInfo?, portInfoSize: SizeT): StatusT =
    NativeRawLibc.getNextPortInfo(port, cookie?.toLong() ?: 0L, portInfo?.toLong() ?: 0L, portInfoSize)

public actual fun getPortMessageInfoEtc(port: PortId, info: PortMessageInfo?, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    NativeRawLibc.getPortMessageInfoEtc(port, info?.toLong() ?: 0L, infoSize, flags, timeout)

public actual fun createSem(count: Int, name: String?): SemId =
    NativeRawLibc.createSem(count, name)

public actual fun deleteSem(id: SemId): StatusT =
    NativeRawLibc.deleteSem(id)

public actual fun acquireSem(id: SemId): StatusT =
    NativeRawLibc.acquireSem(id)

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    NativeRawLibc.acquireSemEtc(id, count, flags, timeout)

public actual fun releaseSem(id: SemId): StatusT =
    NativeRawLibc.releaseSem(id)

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    NativeRawLibc.releaseSemEtc(id, count, flags)

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    NativeRawLibc.switchSem(semToBeReleased, id)

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    NativeRawLibc.switchSemEtc(semToBeReleased, id, count, flags, timeout)

public actual fun getSemCount(id: SemId, threadCount: Int?): StatusT =
    NativeRawLibc.getSemCount(id, threadCount?.toLong() ?: 0L)

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    NativeRawLibc.setSemOwner(id, team)

public actual fun getSemInfo(id: SemId, info: SemInfo?, infoSize: SizeT): StatusT =
    NativeRawLibc.getSemInfo(id, info?.toLong() ?: 0L, infoSize)

public actual fun getNextSemInfo(team: TeamId, cookie: Int?, info: SemInfo?, infoSize: SizeT): StatusT =
    NativeRawLibc.getNextSemInfo(team, cookie?.toLong() ?: 0L, info?.toLong() ?: 0L, infoSize)

public actual fun killTeam(team: TeamId): StatusT =
    NativeRawLibc.killTeam(team)

public actual fun getTeamInfo(team: TeamId, info: TeamInfo?, size: SizeT): StatusT =
    NativeRawLibc.getTeamInfo(team, info?.toLong() ?: 0L, size)

public actual fun getNextTeamInfo(cookie: Int?, info: TeamInfo?, size: SizeT): StatusT =
    NativeRawLibc.getNextTeamInfo(cookie?.toLong() ?: 0L, info?.toLong() ?: 0L, size)

public actual fun spawnThread(func: ThreadFunc, name: String?, priority: Int, data: COpaquePointer?): ThreadId =
    NativeRawLibc.spawnThread(func, name, priority, data?.value ?: 0L)

public actual fun killThread(thread: ThreadId): StatusT =
    NativeRawLibc.killThread(thread)

public actual fun resumeThread(thread: ThreadId): StatusT =
    NativeRawLibc.resumeThread(thread)

public actual fun suspendThread(thread: ThreadId): StatusT =
    NativeRawLibc.suspendThread(thread)

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    NativeRawLibc.renameThread(thread, newName)

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    NativeRawLibc.setThreadPriority(thread, newPriority)

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: io.github.kotlinmania.libc.BigtimeT, length: io.github.kotlinmania.libc.BigtimeT): Int =
    NativeRawLibc.suggestThreadPriority(what, period, jitter, length)

public actual fun estimateMaxSchedulingLatency(th: io.github.kotlinmania.libc.ThreadId): io.github.kotlinmania.libc.BigtimeT =
    NativeRawLibc.estimateMaxSchedulingLatency(th)

public actual fun exitThread(status: StatusT) {
    NativeRawLibc.exitThread(status)
}

public actual fun waitForThread(thread: ThreadId, returnValue: Int?): StatusT =
    NativeRawLibc.waitForThread(thread, returnValue?.toLong() ?: 0L)

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: COpaquePointer?): StatusT =
    NativeRawLibc.onExitThread(callback, data?.value ?: 0L)

public actual fun findThread(name: String?): ThreadId =
    NativeRawLibc.findThread(name)

public actual fun getSchedulerMode(): Int =
    NativeRawLibc.getSchedulerMode()

public actual fun setSchedulerMode(mode: Int): StatusT =
    NativeRawLibc.setSchedulerMode(mode)

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    NativeRawLibc.sendData(thread, code, buffer?.value ?: 0L, bufferSize)

public actual fun receiveData(sender: Int?, buffer: COpaquePointer?, bufferSize: SizeT): Int =
    NativeRawLibc.receiveData(sender?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize)

public actual fun hasData(thread: ThreadId): Boolean =
    NativeRawLibc.hasData(thread)

public actual fun snooze(amount: BigtimeT): StatusT =
    NativeRawLibc.snooze(amount)

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    NativeRawLibc.snoozeEtc(amount, timeBase, flags)

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    NativeRawLibc.snoozeUntil(time, timeBase)

public actual fun getThreadInfo(id: ThreadId, info: ThreadInfo?, size: SizeT): StatusT =
    NativeRawLibc.getThreadInfo(id, info?.toLong() ?: 0L, size)

public actual fun getNextThreadInfo(team: TeamId, cookie: Int?, info: ThreadInfo?, size: SizeT): StatusT =
    NativeRawLibc.getNextThreadInfo(team, cookie?.toLong() ?: 0L, info?.toLong() ?: 0L, size)

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    NativeRawLibc.getPthreadThreadId(thread)

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: TeamUsageInfo?, size: SizeT): StatusT =
    NativeRawLibc.getTeamUsageInfo(team, who, info?.toLong() ?: 0L, size)

public actual fun realTimeClock(): CUlong =
    NativeRawLibc.realTimeClock()

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
    NativeRawLibc.setRealTimeClock(secsSinceJan1st1970)
}

public actual fun realTimeClockUsecs(): BigtimeT =
    NativeRawLibc.realTimeClockUsecs()

public actual fun systemTime(): BigtimeT =
    NativeRawLibc.systemTime()

public actual fun systemTimeNsecs(): NanotimeT =
    NativeRawLibc.systemTimeNsecs()

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    NativeRawLibc.setAlarm(whenBranch, flags)

public actual fun debugger(message: String?) {
    NativeRawLibc.debugger(message)
}

public actual fun disableDebugger(state: CInt): CInt =
    NativeRawLibc.disableDebugger(state)

public actual fun getSystemInfo(info: SystemInfo?): StatusT =
    NativeRawLibc.getSystemInfo(info?.toLong() ?: 0L)

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: CpuInfo?, size: SizeT): StatusT =
    NativeRawLibc.getCpuInfoEtc(firstCPU, cpuCount, info?.toLong() ?: 0L, size)

public actual fun getCpuTopologyInfo(topologyInfos: CpuTopologyNodeInfo?, topologyInfoCount: UInt?): StatusT =
    NativeRawLibc.getCpuTopologyInfo(topologyInfos?.toLong() ?: 0L, topologyInfoCount?.toLong() ?: 0L)

public actual fun isComputerOn(): Int =
    NativeRawLibc.isComputerOn()

public actual fun isComputerOnFire(): CDouble =
    NativeRawLibc.isComputerOnFire()

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    NativeRawLibc.sendSignal(threadID, signal)

public actual fun setSignalStack(base: COpaquePointer?, size: SizeT) {
    NativeRawLibc.setSignalStack(base?.value ?: 0L, size)
}

public actual fun waitForObjects(infos: ObjectWaitInfo?, numInfos: CInt): SsizeT =
    NativeRawLibc.waitForObjects(infos?.toLong() ?: 0L, numInfos)

public actual fun waitForObjectsEtc(infos: ObjectWaitInfo?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    NativeRawLibc.waitForObjectsEtc(infos?.toLong() ?: 0L, numInfos, flags, timeout)

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: SizeT): SsizeT =
    NativeRawLibc.fsReadAttr(fd, attribute, type, pos, buffer?.value ?: 0L, readBytes)

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: SizeT): SsizeT =
    NativeRawLibc.fsWriteAttr(fd, attribute, type, pos, buffer?.value ?: 0L, writeBytes)

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    NativeRawLibc.fsRemoveAttr(fd, attribute)

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: AttrInfo?): CInt =
    NativeRawLibc.fsStatAttr(fd, attribute, attrInfo?.toLong() ?: 0L)

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    NativeRawLibc.fsOpenAttr(path, attribute, type, openMode)

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    NativeRawLibc.fsFopenAttr(fd, attribute, type, openMode)

public actual fun fsCloseAttr(fd: CInt): CInt =
    NativeRawLibc.fsCloseAttr(fd)

public actual fun fsOpenAttrDir(path: String?): DIR? =
    NativeRawLibc.fsOpenAttrDir(path)

public actual fun fsLopenAttrDir(path: String?): DIR? =
    NativeRawLibc.fsLopenAttrDir(path)

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    NativeRawLibc.fsFopenAttrDir(fd)

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    NativeRawLibc.fsCloseAttrDir(dir?.toLong() ?: 0L)

public actual fun fsReadAttrDir(dir: DIR?): Dirent? =
    NativeRawLibc.fsReadAttrDir(dir?.toLong() ?: 0L)

public actual fun fsRewindAttrDir(dir: DIR?) {
    NativeRawLibc.fsRewindAttrDir(dir?.toLong() ?: 0L)
}

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    NativeRawLibc.fsCreateIndex(device, name, type, flags)

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    NativeRawLibc.fsRemoveIndex(device, name)

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: IndexInfo?): CInt =
    NativeRawLibc.fsStatIndex(device, name, indexInfo?.toLong() ?: 0L)

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    NativeRawLibc.fsOpenIndexDir(device)

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    NativeRawLibc.fsCloseIndexDir(indexDirectory?.toLong() ?: 0L)

public actual fun fsReadIndexDir(indexDirectory: DIR?): Dirent? =
    NativeRawLibc.fsReadIndexDir(indexDirectory?.toLong() ?: 0L)

public actual fun fsRewindIndexDir(indexDirectory: DIR?) {
    NativeRawLibc.fsRewindIndexDir(indexDirectory?.toLong() ?: 0L)
}

public actual fun devForPath(path: String?): DevT =
    NativeRawLibc.devForPath(path)

public actual fun nextDev(pos: Int?): DevT =
    NativeRawLibc.nextDev(pos?.toLong() ?: 0L)

public actual fun fsStatDev(dev: DevT, info: FsInfo?): CInt =
    NativeRawLibc.fsStatDev(dev, info?.toLong() ?: 0L)

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    NativeRawLibc.fsOpenQuery(device, query, flags)

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    NativeRawLibc.fsOpenLiveQuery(device, query, flags, port, token)

public actual fun fsCloseQuery(d: DIR?): CInt =
    NativeRawLibc.fsCloseQuery(d?.toLong() ?: 0L)

public actual fun fsReadQuery(d: DIR?): Dirent? =
    NativeRawLibc.fsReadQuery(d?.toLong() ?: 0L)

public actual fun getPathForDirent(dent: Dirent?, buf: COpaquePointer?, len: SizeT): StatusT =
    NativeRawLibc.getPathForDirent(dent?.toLong() ?: 0L, buf?.value ?: 0L, len)

public actual fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): DevT =
    NativeRawLibc.fsMountVolume(where, device, filesystem, flags, parameters)

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    NativeRawLibc.fsUnmountVolume(path, flags)

public actual fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): ThreadId =
    NativeRawLibc.loadImage(argc, argv?.value ?: 0L, environ?.value ?: 0L)

public actual fun loadAddOn(path: String?): ImageId =
    NativeRawLibc.loadAddOn(path)

public actual fun unloadAddOn(image: ImageId): StatusT =
    NativeRawLibc.unloadAddOn(image)

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    NativeRawLibc.getImageSymbol(image, name, symbolType, symbolLocation?.value ?: 0L)

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: COpaquePointer?, nameLength: Int?, symbolType: Int?, symbolLocation: COpaquePointer?): StatusT =
    NativeRawLibc.getNthImageSymbol(image, n, nameBuffer?.value ?: 0L, nameLength?.toLong() ?: 0L, symbolType?.toLong() ?: 0L, symbolLocation?.value ?: 0L)

public actual fun clearCaches(address: COpaquePointer?, length: SizeT, flags: UInt) {
    NativeRawLibc.clearCaches(address?.value ?: 0L, length, flags)
}

public actual fun getImageInfo(image: ImageId, info: ImageInfo?, size: SizeT): StatusT =
    NativeRawLibc.getImageInfo(image, info?.toLong() ?: 0L, size)

public actual fun getNextImageInfo(team: TeamId, cookie: Int?, info: ImageInfo?, size: SizeT): StatusT =
    NativeRawLibc.getNextImageInfo(team, cookie?.toLong() ?: 0L, info?.toLong() ?: 0L, size)

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: ULong): StatusT =
    NativeRawLibc.findPath(codePointer?.value ?: 0L, baseDirectory, subPath, pathBuffer?.value ?: 0L, bufferSize)

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    NativeRawLibc.findPathEtc(codePointer?.value ?: 0L, dependency, architecture, baseDirectory, subPath, flags, pathBuffer?.value ?: 0L, bufferSize)

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    NativeRawLibc.findPathForPath(path, baseDirectory, subPath, pathBuffer?.value ?: 0L, bufferSize)

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    NativeRawLibc.findPathForPathEtc(path, dependency, architecture, baseDirectory, subPath, flags, pathBuffer?.value ?: 0L, bufferSize)

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: SizeT?): StatusT =
    NativeRawLibc.findPaths(baseDirectory, subPath, paths?.value ?: 0L, pathCount?.toLong() ?: 0L)

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: SizeT?): StatusT =
    NativeRawLibc.findPathsEtc(architecture, baseDirectory, subPath, flags, paths?.value ?: 0L, pathCount?.toLong() ?: 0L)

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: COpaquePointer?, length: Int): StatusT =
    NativeRawLibc.findDirectory(which, volume, createIt, pathString?.value ?: 0L, length)

public actual fun getCpuid(info: CpuidInfo?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    NativeRawLibc.getCpuid(info?.toLong() ?: 0L, eaxRegister, cpuNum)
