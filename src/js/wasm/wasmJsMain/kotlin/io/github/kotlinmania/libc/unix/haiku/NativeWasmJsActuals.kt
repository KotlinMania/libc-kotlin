@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

public actual fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    0

public actual fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    0

public actual fun findArea(name: String?): AreaId =
    0

public actual fun areaFor(address: COpaquePointer?): AreaId =
    0

public actual fun deleteArea(id: AreaId): StatusT =
    0

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    0

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    0

public actual fun getAreaInfo(id: AreaId, areaInfo: COpaquePointer?, size: ULong): StatusT =
    0

public actual fun getNextAreaInfo(team: TeamId, cookie: COpaquePointer?, areaInfo: COpaquePointer?, size: ULong): StatusT =
    0

public actual fun createPort(capacity: Int, name: String?): PortId =
    0

public actual fun findPort(name: String?): PortId =
    0

public actual fun readPort(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): SsizeT =
    0L

public actual fun readPortEtc(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    0L

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    0

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    0

public actual fun closePort(port: PortId): StatusT =
    0

public actual fun deletePort(port: PortId): StatusT =
    0

public actual fun portBufferSize(port: PortId): SsizeT =
    0L

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    0L

public actual fun portCount(port: PortId): SsizeT =
    0L

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    0

public actual fun getPortInfo(port: PortId, buf: COpaquePointer?, portInfoSize: SizeT): StatusT =
    0

public actual fun getNextPortInfo(port: PortId, cookie: COpaquePointer?, portInfo: COpaquePointer?, portInfoSize: SizeT): StatusT =
    0

public actual fun getPortMessageInfoEtc(port: PortId, info: COpaquePointer?, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    0

public actual fun createSem(count: Int, name: String?): SemId =
    0

public actual fun deleteSem(id: SemId): StatusT =
    0

public actual fun acquireSem(id: SemId): StatusT =
    0

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    0

public actual fun releaseSem(id: SemId): StatusT =
    0

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    0

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    0

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    0

public actual fun getSemCount(id: SemId, threadCount: COpaquePointer?): StatusT =
    0

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    0

public actual fun getSemInfo(id: SemId, info: COpaquePointer?, infoSize: SizeT): StatusT =
    0

public actual fun getNextSemInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, infoSize: SizeT): StatusT =
    0

public actual fun killTeam(team: TeamId): StatusT =
    0

public actual fun getTeamInfo(team: TeamId, info: COpaquePointer?, size: SizeT): StatusT =
    0

public actual fun getNextTeamInfo(cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    0

public actual fun spawnThread(func: ThreadFunc, name: String?, priority: Int, data: COpaquePointer?): ThreadId =
    0

public actual fun killThread(thread: ThreadId): StatusT =
    0

public actual fun resumeThread(thread: ThreadId): StatusT =
    0

public actual fun suspendThread(thread: ThreadId): StatusT =
    0

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    0

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    0

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    0

public actual fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT =
    0L

public actual fun exitThread(status: StatusT) {
}

public actual fun waitForThread(thread: ThreadId, returnValue: COpaquePointer?): StatusT =
    0

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: COpaquePointer?): StatusT =
    0

public actual fun findThread(name: String?): ThreadId =
    0

public actual fun getSchedulerMode(): Int =
    0

public actual fun setSchedulerMode(mode: Int): StatusT =
    0

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    0

public actual fun receiveData(sender: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): Int =
    0

public actual fun hasData(thread: ThreadId): Boolean =
    false

public actual fun snooze(amount: BigtimeT): StatusT =
    0

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    0

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    0

public actual fun getThreadInfo(id: ThreadId, info: COpaquePointer?, size: SizeT): StatusT =
    0

public actual fun getNextThreadInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    0

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    0

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: COpaquePointer?, size: SizeT): StatusT =
    0

public actual fun realTimeClock(): CUlong =
    0uL

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
}

public actual fun realTimeClockUsecs(): BigtimeT =
    0L

public actual fun systemTime(): BigtimeT =
    0L

public actual fun systemTimeNsecs(): NanotimeT =
    0L

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    0L

public actual fun debugger(message: String?) {
}

public actual fun disableDebugger(state: CInt): CInt =
    0

public actual fun getSystemInfo(info: COpaquePointer?): StatusT =
    0

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: COpaquePointer?, size: SizeT): StatusT =
    0

public actual fun getCpuTopologyInfo(topologyInfos: COpaquePointer?, topologyInfoCount: COpaquePointer?): StatusT =
    0

public actual fun isComputerOn(): Int =
    0

public actual fun isComputerOnFire(): CDouble =
    0.0

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    0

public actual fun setSignalStack(base: COpaquePointer?, size: SizeT) {
}

public actual fun waitForObjects(infos: COpaquePointer?, numInfos: CInt): SsizeT =
    0L

public actual fun waitForObjectsEtc(infos: COpaquePointer?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    0L

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: SizeT): SsizeT =
    0L

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: SizeT): SsizeT =
    0L

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    0

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: COpaquePointer?): CInt =
    0

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    0

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    0

public actual fun fsCloseAttr(fd: CInt): CInt =
    0

public actual fun fsOpenAttrDir(path: String?): DIR? =
    null

public actual fun fsLopenAttrDir(path: String?): DIR? =
    null

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    null

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    0

public actual fun fsReadAttrDir(dir: DIR?): COpaquePointer? =
    null

public actual fun fsRewindAttrDir(dir: DIR?) {
}

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    0

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    0

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: COpaquePointer?): CInt =
    0

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    null

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    0

public actual fun fsReadIndexDir(indexDirectory: DIR?): COpaquePointer? =
    null

public actual fun fsRewindIndexDir(indexDirectory: DIR?) {
}

public actual fun devForPath(path: String?): DevT =
    0

public actual fun nextDev(pos: COpaquePointer?): DevT =
    0

public actual fun fsStatDev(dev: DevT, info: COpaquePointer?): CInt =
    0

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    null

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    null

public actual fun fsCloseQuery(d: DIR?): CInt =
    0

public actual fun fsReadQuery(d: DIR?): COpaquePointer? =
    null

public actual fun getPathForDirent(dent: COpaquePointer?, buf: COpaquePointer?, len: SizeT): StatusT =
    0

public actual fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): DevT =
    0

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    0

public actual fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): ThreadId =
    0

public actual fun loadAddOn(path: String?): ImageId =
    0

public actual fun unloadAddOn(image: ImageId): StatusT =
    0

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    0

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: COpaquePointer?, nameLength: COpaquePointer?, symbolType: COpaquePointer?, symbolLocation: COpaquePointer?): StatusT =
    0

public actual fun clearCaches(address: COpaquePointer?, length: SizeT, flags: UInt) {
}

public actual fun getImageInfo(image: ImageId, info: COpaquePointer?, size: SizeT): StatusT =
    0

public actual fun getNextImageInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    0

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: ULong): StatusT =
    0

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    0

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    0

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    0

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    0

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    0

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: COpaquePointer?, length: Int): StatusT =
    0

public actual fun getCpuid(info: COpaquePointer?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    0
