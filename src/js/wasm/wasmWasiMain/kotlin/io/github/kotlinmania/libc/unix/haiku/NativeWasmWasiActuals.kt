@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findArea(name: String?): AreaId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun areaFor(address: COpaquePointer?): AreaId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteArea(id: AreaId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAreaInfo(id: AreaId, areaInfo: COpaquePointer?, size: ULong): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNextAreaInfo(team: TeamId, cookie: COpaquePointer?, areaInfo: COpaquePointer?, size: ULong): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createPort(capacity: Int, name: String?): PortId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findPort(name: String?): PortId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readPort(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readPortEtc(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closePort(port: PortId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deletePort(port: PortId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun portBufferSize(port: PortId): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun portCount(port: PortId): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPortInfo(port: PortId, buf: COpaquePointer?, portInfoSize: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNextPortInfo(port: PortId, cookie: COpaquePointer?, portInfo: COpaquePointer?, portInfoSize: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPortMessageInfoEtc(port: PortId, info: COpaquePointer?, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createSem(count: Int, name: String?): SemId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteSem(id: SemId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acquireSem(id: SemId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun releaseSem(id: SemId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSemCount(id: SemId, threadCount: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSemInfo(id: SemId, info: COpaquePointer?, infoSize: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNextSemInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, infoSize: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun killTeam(team: TeamId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTeamInfo(team: TeamId, info: COpaquePointer?, size: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNextTeamInfo(cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun spawnThread(func: ThreadFunc, name: String?, priority: Int, data: COpaquePointer?): ThreadId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun killThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun resumeThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun suspendThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exitThread(status: StatusT): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitForThread(thread: ThreadId, returnValue: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findThread(name: String?): ThreadId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSchedulerMode(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setSchedulerMode(mode: Int): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun receiveData(sender: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hasData(thread: ThreadId): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun snooze(amount: BigtimeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThreadInfo(id: ThreadId, info: COpaquePointer?, size: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNextThreadInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: COpaquePointer?, size: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realTimeClock(): CUlong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realTimeClockUsecs(): BigtimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun systemTime(): BigtimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun systemTimeNsecs(): NanotimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun debugger(message: String?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun disableDebugger(state: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSystemInfo(info: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: COpaquePointer?, size: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCpuTopologyInfo(topologyInfos: COpaquePointer?, topologyInfoCount: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isComputerOn(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isComputerOnFire(): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setSignalStack(base: COpaquePointer?, size: SizeT): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitForObjects(infos: COpaquePointer?, numInfos: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitForObjectsEtc(infos: COpaquePointer?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsCloseAttr(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsOpenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsLopenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsReadAttrDir(dir: DIR?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRewindAttrDir(dir: DIR?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsReadIndexDir(indexDirectory: DIR?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRewindIndexDir(indexDirectory: DIR?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devForPath(path: String?): DevT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nextDev(pos: COpaquePointer?): DevT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsStatDev(dev: DevT, info: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsCloseQuery(d: DIR?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsReadQuery(d: DIR?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPathForDirent(dent: COpaquePointer?, buf: COpaquePointer?, len: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): DevT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): ThreadId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadAddOn(path: String?): ImageId =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unloadAddOn(image: ImageId): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: COpaquePointer?, nameLength: COpaquePointer?, symbolType: COpaquePointer?, symbolLocation: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearCaches(address: COpaquePointer?, length: SizeT, flags: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getImageInfo(image: ImageId, info: COpaquePointer?, size: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNextImageInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: COpaquePointer?, length: Int): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCpuid(info: COpaquePointer?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
