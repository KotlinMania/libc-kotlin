package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.COpaquePointer

public actual fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    js("require('@kotlinmania/libc-native-bindings').createArea(name, startAddress?.value ?: 0L, addressSpec, size, lock, protection)") as AreaId

public actual fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    js("require('@kotlinmania/libc-native-bindings').cloneArea(name, destAddress?.value ?: 0L, addressSpec, protection, source)") as AreaId

public actual fun findArea(name: String?): AreaId =
    js("require('@kotlinmania/libc-native-bindings').findArea(name)") as AreaId

public actual fun areaFor(address: COpaquePointer?): AreaId =
    js("require('@kotlinmania/libc-native-bindings').areaFor(address?.value ?: 0L)") as AreaId

public actual fun deleteArea(id: AreaId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').deleteArea(id)") as StatusT

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    js("require('@kotlinmania/libc-native-bindings').resizeArea(id, newSize)") as StatusT

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    js("require('@kotlinmania/libc-native-bindings').setAreaProtection(id, newProtection)") as StatusT

public actual fun getAreaInfo(id: AreaId, areaInfo: AreaInfo?, size: ULong): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getAreaInfo(id, areaInfo?.toLong() ?: 0L, size)") as StatusT

public actual fun getNextAreaInfo(team: TeamId, cookie: Long?, areaInfo: AreaInfo?, size: ULong): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getNextAreaInfo(team, cookie?.toLong() ?: 0L, areaInfo?.toLong() ?: 0L, size)") as StatusT

public actual fun createPort(capacity: Int, name: String?): PortId =
    js("require('@kotlinmania/libc-native-bindings').createPort(capacity, name)") as PortId

public actual fun findPort(name: String?): PortId =
    js("require('@kotlinmania/libc-native-bindings').findPort(name)") as PortId

public actual fun readPort(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readPort(port, code?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize)") as SsizeT

public actual fun readPortEtc(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readPortEtc(port, code?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize, flags, timeout)") as SsizeT

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').writePort(port, code, buffer?.value ?: 0L, bufferSize)") as StatusT

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').writePortEtc(port, code, buffer?.value ?: 0L, bufferSize, flags, timeout)") as StatusT

public actual fun closePort(port: PortId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').closePort(port)") as StatusT

public actual fun deletePort(port: PortId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').deletePort(port)") as StatusT

public actual fun portBufferSize(port: PortId): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').portBufferSize(port)") as SsizeT

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').portBufferSizeEtc(port, flags, timeout)") as SsizeT

public actual fun portCount(port: PortId): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').portCount(port)") as SsizeT

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').setPortOwner(port, team)") as StatusT

public actual fun getPortInfo(port: PortId, buf: PortInfo?, portInfoSize: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getPortInfo(port, buf?.toLong() ?: 0L, portInfoSize)") as StatusT

public actual fun getNextPortInfo(port: PortId, cookie: Int?, portInfo: PortInfo?, portInfoSize: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getNextPortInfo(port, cookie?.toLong() ?: 0L, portInfo?.toLong() ?: 0L, portInfoSize)") as StatusT

public actual fun getPortMessageInfoEtc(port: PortId, info: PortMessageInfo?, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getPortMessageInfoEtc(port, info?.toLong() ?: 0L, infoSize, flags, timeout)") as StatusT

public actual fun createSem(count: Int, name: String?): SemId =
    js("require('@kotlinmania/libc-native-bindings').createSem(count, name)") as SemId

public actual fun deleteSem(id: SemId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').deleteSem(id)") as StatusT

public actual fun acquireSem(id: SemId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').acquireSem(id)") as StatusT

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').acquireSemEtc(id, count, flags, timeout)") as StatusT

public actual fun releaseSem(id: SemId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').releaseSem(id)") as StatusT

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    js("require('@kotlinmania/libc-native-bindings').releaseSemEtc(id, count, flags)") as StatusT

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').switchSem(semToBeReleased, id)") as StatusT

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').switchSemEtc(semToBeReleased, id, count, flags, timeout)") as StatusT

public actual fun getSemCount(id: SemId, threadCount: Int?): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getSemCount(id, threadCount?.toLong() ?: 0L)") as StatusT

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').setSemOwner(id, team)") as StatusT

public actual fun getSemInfo(id: SemId, info: SemInfo?, infoSize: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getSemInfo(id, info?.toLong() ?: 0L, infoSize)") as StatusT

public actual fun getNextSemInfo(team: TeamId, cookie: Int?, info: SemInfo?, infoSize: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getNextSemInfo(team, cookie?.toLong() ?: 0L, info?.toLong() ?: 0L, infoSize)") as StatusT

public actual fun killTeam(team: TeamId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').killTeam(team)") as StatusT

public actual fun getTeamInfo(team: TeamId, info: TeamInfo?, size: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getTeamInfo(team, info?.toLong() ?: 0L, size)") as StatusT

public actual fun getNextTeamInfo(cookie: Int?, info: TeamInfo?, size: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getNextTeamInfo(cookie?.toLong() ?: 0L, info?.toLong() ?: 0L, size)") as StatusT

public actual fun spawnThread(func: ThreadFunc, name: String?, priority: Int, data: COpaquePointer?): ThreadId =
    js("require('@kotlinmania/libc-native-bindings').spawnThread(func, name, priority, data?.value ?: 0L)") as ThreadId

public actual fun killThread(thread: ThreadId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').killThread(thread)") as StatusT

public actual fun resumeThread(thread: ThreadId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').resumeThread(thread)") as StatusT

public actual fun suspendThread(thread: ThreadId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').suspendThread(thread)") as StatusT

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    js("require('@kotlinmania/libc-native-bindings').renameThread(thread, newName)") as StatusT

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    js("require('@kotlinmania/libc-native-bindings').setThreadPriority(thread, newPriority)") as StatusT

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: io.github.kotlinmania.libc.BigtimeT, length: io.github.kotlinmania.libc.BigtimeT): Int =
    js("require('@kotlinmania/libc-native-bindings').suggestThreadPriority(what, period, jitter, length)") as Int

public actual fun estimateMaxSchedulingLatency(th: io.github.kotlinmania.libc.ThreadId): io.github.kotlinmania.libc.BigtimeT =
    js("require('@kotlinmania/libc-native-bindings').estimateMaxSchedulingLatency(th)") as io.github.kotlinmania.libc.BigtimeT

public actual fun exitThread(status: StatusT) {
    js("require('@kotlinmania/libc-native-bindings').exitThread(status)")
}

public actual fun waitForThread(thread: ThreadId, returnValue: Int?): StatusT =
    js("require('@kotlinmania/libc-native-bindings').waitForThread(thread, returnValue?.toLong() ?: 0L)") as StatusT

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: COpaquePointer?): StatusT =
    js("require('@kotlinmania/libc-native-bindings').onExitThread(callback, data?.value ?: 0L)") as StatusT

public actual fun findThread(name: String?): ThreadId =
    js("require('@kotlinmania/libc-native-bindings').findThread(name)") as ThreadId

public actual fun getSchedulerMode(): Int =
    js("require('@kotlinmania/libc-native-bindings').getSchedulerMode()") as Int

public actual fun setSchedulerMode(mode: Int): StatusT =
    js("require('@kotlinmania/libc-native-bindings').setSchedulerMode(mode)") as StatusT

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').sendData(thread, code, buffer?.value ?: 0L, bufferSize)") as StatusT

public actual fun receiveData(sender: Int?, buffer: COpaquePointer?, bufferSize: SizeT): Int =
    js("require('@kotlinmania/libc-native-bindings').receiveData(sender?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize)") as Int

public actual fun hasData(thread: ThreadId): Boolean =
    js("require('@kotlinmania/libc-native-bindings').hasData(thread)") as Boolean

public actual fun snooze(amount: BigtimeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').snooze(amount)") as StatusT

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    js("require('@kotlinmania/libc-native-bindings').snoozeEtc(amount, timeBase, flags)") as StatusT

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    js("require('@kotlinmania/libc-native-bindings').snoozeUntil(time, timeBase)") as StatusT

public actual fun getThreadInfo(id: ThreadId, info: ThreadInfo?, size: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getThreadInfo(id, info?.toLong() ?: 0L, size)") as StatusT

public actual fun getNextThreadInfo(team: TeamId, cookie: Int?, info: ThreadInfo?, size: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getNextThreadInfo(team, cookie?.toLong() ?: 0L, info?.toLong() ?: 0L, size)") as StatusT

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    js("require('@kotlinmania/libc-native-bindings').getPthreadThreadId(thread)") as ThreadId

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: TeamUsageInfo?, size: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getTeamUsageInfo(team, who, info?.toLong() ?: 0L, size)") as StatusT

public actual fun realTimeClock(): CUlong =
    js("require('@kotlinmania/libc-native-bindings').realTimeClock()") as CUlong

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
    js("require('@kotlinmania/libc-native-bindings').setRealTimeClock(secsSinceJan1st1970)")
}

public actual fun realTimeClockUsecs(): BigtimeT =
    js("require('@kotlinmania/libc-native-bindings').realTimeClockUsecs()") as BigtimeT

public actual fun systemTime(): BigtimeT =
    js("require('@kotlinmania/libc-native-bindings').systemTime()") as BigtimeT

public actual fun systemTimeNsecs(): NanotimeT =
    js("require('@kotlinmania/libc-native-bindings').systemTimeNsecs()") as NanotimeT

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    js("require('@kotlinmania/libc-native-bindings').setAlarm(whenBranch, flags)") as BigtimeT

public actual fun debugger(message: String?) {
    js("require('@kotlinmania/libc-native-bindings').debugger(message)")
}

public actual fun disableDebugger(state: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').disableDebugger(state)") as CInt

public actual fun getSystemInfo(info: SystemInfo?): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getSystemInfo(info?.toLong() ?: 0L)") as StatusT

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: CpuInfo?, size: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getCpuInfoEtc(firstCPU, cpuCount, info?.toLong() ?: 0L, size)") as StatusT

public actual fun getCpuTopologyInfo(topologyInfos: CpuTopologyNodeInfo?, topologyInfoCount: UInt?): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getCpuTopologyInfo(topologyInfos?.toLong() ?: 0L, topologyInfoCount?.toLong() ?: 0L)") as StatusT

public actual fun isComputerOn(): Int =
    js("require('@kotlinmania/libc-native-bindings').isComputerOn()") as Int

public actual fun isComputerOnFire(): CDouble =
    js("require('@kotlinmania/libc-native-bindings').isComputerOnFire()") as CDouble

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendSignal(threadID, signal)") as CInt

public actual fun setSignalStack(base: COpaquePointer?, size: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').setSignalStack(base?.value ?: 0L, size)")
}

public actual fun waitForObjects(infos: ObjectWaitInfo?, numInfos: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').waitForObjects(infos?.toLong() ?: 0L, numInfos)") as SsizeT

public actual fun waitForObjectsEtc(infos: ObjectWaitInfo?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').waitForObjectsEtc(infos?.toLong() ?: 0L, numInfos, flags, timeout)") as SsizeT

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').fsReadAttr(fd, attribute, type, pos, buffer?.value ?: 0L, readBytes)") as SsizeT

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').fsWriteAttr(fd, attribute, type, pos, buffer?.value ?: 0L, writeBytes)") as SsizeT

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsRemoveAttr(fd, attribute)") as CInt

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: AttrInfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsStatAttr(fd, attribute, attrInfo?.toLong() ?: 0L)") as CInt

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsOpenAttr(path, attribute, type, openMode)") as CInt

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsFopenAttr(fd, attribute, type, openMode)") as CInt

public actual fun fsCloseAttr(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsCloseAttr(fd)") as CInt

public actual fun fsOpenAttrDir(path: String?): DIR? =
    js("require('@kotlinmania/libc-native-bindings').fsOpenAttrDir(path)") as DIR?

public actual fun fsLopenAttrDir(path: String?): DIR? =
    js("require('@kotlinmania/libc-native-bindings').fsLopenAttrDir(path)") as DIR?

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    js("require('@kotlinmania/libc-native-bindings').fsFopenAttrDir(fd)") as DIR?

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsCloseAttrDir(dir?.toLong() ?: 0L)") as CInt

public actual fun fsReadAttrDir(dir: DIR?): Dirent? =
    js("require('@kotlinmania/libc-native-bindings').fsReadAttrDir(dir?.toLong() ?: 0L)") as Dirent?

public actual fun fsRewindAttrDir(dir: DIR?) {
    js("require('@kotlinmania/libc-native-bindings').fsRewindAttrDir(dir?.toLong() ?: 0L)")
}

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsCreateIndex(device, name, type, flags)") as CInt

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsRemoveIndex(device, name)") as CInt

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: IndexInfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsStatIndex(device, name, indexInfo?.toLong() ?: 0L)") as CInt

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    js("require('@kotlinmania/libc-native-bindings').fsOpenIndexDir(device)") as DIR?

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsCloseIndexDir(indexDirectory?.toLong() ?: 0L)") as CInt

public actual fun fsReadIndexDir(indexDirectory: DIR?): Dirent? =
    js("require('@kotlinmania/libc-native-bindings').fsReadIndexDir(indexDirectory?.toLong() ?: 0L)") as Dirent?

public actual fun fsRewindIndexDir(indexDirectory: DIR?) {
    js("require('@kotlinmania/libc-native-bindings').fsRewindIndexDir(indexDirectory?.toLong() ?: 0L)")
}

public actual fun devForPath(path: String?): DevT =
    js("require('@kotlinmania/libc-native-bindings').devForPath(path)") as DevT

public actual fun nextDev(pos: Int?): DevT =
    js("require('@kotlinmania/libc-native-bindings').nextDev(pos?.toLong() ?: 0L)") as DevT

public actual fun fsStatDev(dev: DevT, info: FsInfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsStatDev(dev, info?.toLong() ?: 0L)") as CInt

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    js("require('@kotlinmania/libc-native-bindings').fsOpenQuery(device, query, flags)") as DIR?

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    js("require('@kotlinmania/libc-native-bindings').fsOpenLiveQuery(device, query, flags, port, token)") as DIR?

public actual fun fsCloseQuery(d: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsCloseQuery(d?.toLong() ?: 0L)") as CInt

public actual fun fsReadQuery(d: DIR?): Dirent? =
    js("require('@kotlinmania/libc-native-bindings').fsReadQuery(d?.toLong() ?: 0L)") as Dirent?

public actual fun getPathForDirent(dent: Dirent?, buf: COpaquePointer?, len: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getPathForDirent(dent?.toLong() ?: 0L, buf?.value ?: 0L, len)") as StatusT

public actual fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): DevT =
    js("require('@kotlinmania/libc-native-bindings').fsMountVolume(where, device, filesystem, flags, parameters)") as DevT

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    js("require('@kotlinmania/libc-native-bindings').fsUnmountVolume(path, flags)") as StatusT

public actual fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): ThreadId =
    js("require('@kotlinmania/libc-native-bindings').loadImage(argc, argv?.value ?: 0L, environ?.value ?: 0L)") as ThreadId

public actual fun loadAddOn(path: String?): ImageId =
    js("require('@kotlinmania/libc-native-bindings').loadAddOn(path)") as ImageId

public actual fun unloadAddOn(image: ImageId): StatusT =
    js("require('@kotlinmania/libc-native-bindings').unloadAddOn(image)") as StatusT

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getImageSymbol(image, name, symbolType, symbolLocation?.value ?: 0L)") as StatusT

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: COpaquePointer?, nameLength: Int?, symbolType: Int?, symbolLocation: COpaquePointer?): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getNthImageSymbol(image, n, nameBuffer?.value ?: 0L, nameLength?.toLong() ?: 0L, symbolType?.toLong() ?: 0L, symbolLocation?.value ?: 0L)") as StatusT

public actual fun clearCaches(address: COpaquePointer?, length: SizeT, flags: UInt) {
    js("require('@kotlinmania/libc-native-bindings').clearCaches(address?.value ?: 0L, length, flags)")
}

public actual fun getImageInfo(image: ImageId, info: ImageInfo?, size: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getImageInfo(image, info?.toLong() ?: 0L, size)") as StatusT

public actual fun getNextImageInfo(team: TeamId, cookie: Int?, info: ImageInfo?, size: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getNextImageInfo(team, cookie?.toLong() ?: 0L, info?.toLong() ?: 0L, size)") as StatusT

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: ULong): StatusT =
    js("require('@kotlinmania/libc-native-bindings').findPath(codePointer?.value ?: 0L, baseDirectory, subPath, pathBuffer?.value ?: 0L, bufferSize)") as StatusT

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').findPathEtc(codePointer?.value ?: 0L, dependency, architecture, baseDirectory, subPath, flags, pathBuffer?.value ?: 0L, bufferSize)") as StatusT

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').findPathForPath(path, baseDirectory, subPath, pathBuffer?.value ?: 0L, bufferSize)") as StatusT

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    js("require('@kotlinmania/libc-native-bindings').findPathForPathEtc(path, dependency, architecture, baseDirectory, subPath, flags, pathBuffer?.value ?: 0L, bufferSize)") as StatusT

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: SizeT?): StatusT =
    js("require('@kotlinmania/libc-native-bindings').findPaths(baseDirectory, subPath, paths?.value ?: 0L, pathCount?.toLong() ?: 0L)") as StatusT

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: SizeT?): StatusT =
    js("require('@kotlinmania/libc-native-bindings').findPathsEtc(architecture, baseDirectory, subPath, flags, paths?.value ?: 0L, pathCount?.toLong() ?: 0L)") as StatusT

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: COpaquePointer?, length: Int): StatusT =
    js("require('@kotlinmania/libc-native-bindings').findDirectory(which, volume, createIt, pathString?.value ?: 0L, length)") as StatusT

public actual fun getCpuid(info: CpuidInfo?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    js("require('@kotlinmania/libc-native-bindings').getCpuid(info?.toLong() ?: 0L, eaxRegister, cpuNum)") as StatusT
