// port-lint: source Native.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun deleteArea(id: AreaId): StatusT =
    throw UnsupportedOperationException("deleteArea requires manual FFI bridge — not yet implemented")

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    throw UnsupportedOperationException("resizeArea requires manual FFI bridge — not yet implemented")

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    throw UnsupportedOperationException("setAreaProtection requires manual FFI bridge — not yet implemented")

public actual fun getAreaInfo(id: AreaId, areaInfo: AreaInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getAreaInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextAreaInfo(team: TeamId, cookie: Long?, areaInfo: AreaInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextAreaInfo requires manual FFI bridge — not yet implemented")

public actual fun readPort(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: ULong): SsizeT =
    throw UnsupportedOperationException("readPort requires manual FFI bridge — not yet implemented")

public actual fun readPortEtc(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("readPortEtc requires manual FFI bridge — not yet implemented")

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("writePort requires manual FFI bridge — not yet implemented")

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("writePortEtc requires manual FFI bridge — not yet implemented")

public actual fun closePort(port: PortId): StatusT =
    throw UnsupportedOperationException("closePort requires manual FFI bridge — not yet implemented")

public actual fun deletePort(port: PortId): StatusT =
    throw UnsupportedOperationException("deletePort requires manual FFI bridge — not yet implemented")

public actual fun portBufferSize(port: PortId): SsizeT =
    throw UnsupportedOperationException("portBufferSize requires manual FFI bridge — not yet implemented")

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("portBufferSizeEtc requires manual FFI bridge — not yet implemented")

public actual fun portCount(port: PortId): SsizeT =
    throw UnsupportedOperationException("portCount requires manual FFI bridge — not yet implemented")

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    throw UnsupportedOperationException("setPortOwner requires manual FFI bridge — not yet implemented")

public actual fun getPortInfo(port: PortId, buf: PortInfo?, portInfoSize: ULong): StatusT =
    throw UnsupportedOperationException("getPortInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextPortInfo(port: PortId, cookie: Int?, portInfo: PortInfo?, portInfoSize: ULong): StatusT =
    throw UnsupportedOperationException("getNextPortInfo requires manual FFI bridge — not yet implemented")

public actual fun getPortMessageInfoEtc(port: PortId, info: PortMessageInfo?, infoSize: ULong, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("getPortMessageInfoEtc requires manual FFI bridge — not yet implemented")

public actual fun deleteSem(id: SemId): StatusT =
    throw UnsupportedOperationException("deleteSem requires manual FFI bridge — not yet implemented")

public actual fun acquireSem(id: SemId): StatusT =
    throw UnsupportedOperationException("acquireSem requires manual FFI bridge — not yet implemented")

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("acquireSemEtc requires manual FFI bridge — not yet implemented")

public actual fun releaseSem(id: SemId): StatusT =
    throw UnsupportedOperationException("releaseSem requires manual FFI bridge — not yet implemented")

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    throw UnsupportedOperationException("releaseSemEtc requires manual FFI bridge — not yet implemented")

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    throw UnsupportedOperationException("switchSem requires manual FFI bridge — not yet implemented")

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("switchSemEtc requires manual FFI bridge — not yet implemented")

public actual fun getSemCount(id: SemId, threadCount: Int?): StatusT =
    throw UnsupportedOperationException("getSemCount requires manual FFI bridge — not yet implemented")

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    throw UnsupportedOperationException("setSemOwner requires manual FFI bridge — not yet implemented")

public actual fun getSemInfo(id: SemId, info: SemInfo?, infoSize: ULong): StatusT =
    throw UnsupportedOperationException("getSemInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextSemInfo(team: TeamId, cookie: Int?, info: SemInfo?, infoSize: ULong): StatusT =
    throw UnsupportedOperationException("getNextSemInfo requires manual FFI bridge — not yet implemented")

public actual fun killTeam(team: TeamId): StatusT =
    throw UnsupportedOperationException("killTeam requires manual FFI bridge — not yet implemented")

public actual fun getTeamInfo(team: TeamId, info: TeamInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getTeamInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextTeamInfo(cookie: Int?, info: TeamInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextTeamInfo requires manual FFI bridge — not yet implemented")

public actual fun killThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("killThread requires manual FFI bridge — not yet implemented")

public actual fun resumeThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("resumeThread requires manual FFI bridge — not yet implemented")

public actual fun suspendThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("suspendThread requires manual FFI bridge — not yet implemented")

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    throw UnsupportedOperationException("renameThread requires manual FFI bridge — not yet implemented")

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    throw UnsupportedOperationException("setThreadPriority requires manual FFI bridge — not yet implemented")

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    throw UnsupportedOperationException("suggestThreadPriority requires manual FFI bridge — not yet implemented")

public actual fun exitThread(status: StatusT) {
    throw UnsupportedOperationException("exitThread requires manual FFI bridge — not yet implemented")
}

public actual fun waitForThread(thread: ThreadId, returnValue: StatusT?): StatusT =
    throw UnsupportedOperationException("waitForThread requires manual FFI bridge — not yet implemented")

public actual fun getSchedulerMode(): Int =
    throw UnsupportedOperationException("getSchedulerMode requires manual FFI bridge — not yet implemented")

public actual fun setSchedulerMode(mode: Int): StatusT =
    throw UnsupportedOperationException("setSchedulerMode requires manual FFI bridge — not yet implemented")

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("sendData requires manual FFI bridge — not yet implemented")

public actual fun receiveData(sender: ThreadId?, buffer: COpaquePointer?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("receiveData requires manual FFI bridge — not yet implemented")

public actual fun hasData(thread: ThreadId): Boolean =
    throw UnsupportedOperationException("hasData requires manual FFI bridge — not yet implemented")

public actual fun snooze(amount: BigtimeT): StatusT =
    throw UnsupportedOperationException("snooze requires manual FFI bridge — not yet implemented")

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    throw UnsupportedOperationException("snoozeEtc requires manual FFI bridge — not yet implemented")

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    throw UnsupportedOperationException("snoozeUntil requires manual FFI bridge — not yet implemented")

public actual fun getThreadInfo(id: ThreadId, info: ThreadInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getThreadInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextThreadInfo(team: TeamId, cookie: Int?, info: ThreadInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextThreadInfo requires manual FFI bridge — not yet implemented")

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: TeamUsageInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getTeamUsageInfo requires manual FFI bridge — not yet implemented")

public actual fun realTimeClock(): CULong =
    throw UnsupportedOperationException("realTimeClock requires manual FFI bridge — not yet implemented")

public actual fun setRealTimeClock(secsSinceJan1st1970: CULong) {
    throw UnsupportedOperationException("setRealTimeClock requires manual FFI bridge — not yet implemented")
}

public actual fun debugger(message: String?) {
    throw UnsupportedOperationException("debugger requires manual FFI bridge — not yet implemented")
}

public actual fun disableDebugger(state: CInt): CInt =
    throw UnsupportedOperationException("disableDebugger requires manual FFI bridge — not yet implemented")

public actual fun getSystemInfo(info: SystemInfo?): StatusT =
    throw UnsupportedOperationException("getSystemInfo requires manual FFI bridge — not yet implemented")

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: CpuInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getCpuInfoEtc requires manual FFI bridge — not yet implemented")

public actual fun getCpuTopologyInfo(topologyInfos: CpuTopologyNodeInfo?, topologyInfoCount: UInt?): StatusT =
    throw UnsupportedOperationException("getCpuTopologyInfo requires manual FFI bridge — not yet implemented")

public actual fun isComputerOn(): Int =
    throw UnsupportedOperationException("isComputerOn requires manual FFI bridge — not yet implemented")

public actual fun sendSignal(threadID: ThreadId, signal: CUInt): CInt =
    throw UnsupportedOperationException("sendSignal requires manual FFI bridge — not yet implemented")

public actual fun setSignalStack(base: COpaquePointer?, size: ULong) {
    throw UnsupportedOperationException("setSignalStack requires manual FFI bridge — not yet implemented")
}

public actual fun waitForObjects(infos: ObjectWaitInfo?, numInfos: CInt): SsizeT =
    throw UnsupportedOperationException("waitForObjects requires manual FFI bridge — not yet implemented")

public actual fun waitForObjectsEtc(infos: ObjectWaitInfo?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("waitForObjectsEtc requires manual FFI bridge — not yet implemented")

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: ULong): SsizeT =
    throw UnsupportedOperationException("fsReadAttr requires manual FFI bridge — not yet implemented")

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: ULong): SsizeT =
    throw UnsupportedOperationException("fsWriteAttr requires manual FFI bridge — not yet implemented")

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    throw UnsupportedOperationException("fsRemoveAttr requires manual FFI bridge — not yet implemented")

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: AttrInfo?): CInt =
    throw UnsupportedOperationException("fsStatAttr requires manual FFI bridge — not yet implemented")

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    throw UnsupportedOperationException("fsOpenAttr requires manual FFI bridge — not yet implemented")

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    throw UnsupportedOperationException("fsFopenAttr requires manual FFI bridge — not yet implemented")

public actual fun fsCloseAttr(fd: CInt): CInt =
    throw UnsupportedOperationException("fsCloseAttr requires manual FFI bridge — not yet implemented")

public actual fun fsOpenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("fsOpenAttrDir requires manual FFI bridge — not yet implemented")

public actual fun fsLopenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("fsLopenAttrDir requires manual FFI bridge — not yet implemented")

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    throw UnsupportedOperationException("fsFopenAttrDir requires manual FFI bridge — not yet implemented")

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    throw UnsupportedOperationException("fsCloseAttrDir requires manual FFI bridge — not yet implemented")

public actual fun fsReadAttrDir(dir: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadAttrDir requires manual FFI bridge — not yet implemented")

public actual fun fsRewindAttrDir(dir: DIR?) {
    throw UnsupportedOperationException("fsRewindAttrDir requires manual FFI bridge — not yet implemented")
}

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    throw UnsupportedOperationException("fsCreateIndex requires manual FFI bridge — not yet implemented")

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    throw UnsupportedOperationException("fsRemoveIndex requires manual FFI bridge — not yet implemented")

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: IndexInfo?): CInt =
    throw UnsupportedOperationException("fsStatIndex requires manual FFI bridge — not yet implemented")

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    throw UnsupportedOperationException("fsOpenIndexDir requires manual FFI bridge — not yet implemented")

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    throw UnsupportedOperationException("fsCloseIndexDir requires manual FFI bridge — not yet implemented")

public actual fun fsReadIndexDir(indexDirectory: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadIndexDir requires manual FFI bridge — not yet implemented")

public actual fun fsRewindIndexDir(indexDirectory: DIR?) {
    throw UnsupportedOperationException("fsRewindIndexDir requires manual FFI bridge — not yet implemented")
}

public actual fun fsStatDev(dev: DevT, info: FsInfo?): CInt =
    throw UnsupportedOperationException("fsStatDev requires manual FFI bridge — not yet implemented")

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    throw UnsupportedOperationException("fsOpenQuery requires manual FFI bridge — not yet implemented")

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    throw UnsupportedOperationException("fsOpenLiveQuery requires manual FFI bridge — not yet implemented")

public actual fun fsCloseQuery(d: DIR?): CInt =
    throw UnsupportedOperationException("fsCloseQuery requires manual FFI bridge — not yet implemented")

public actual fun fsReadQuery(d: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadQuery requires manual FFI bridge — not yet implemented")

public actual fun getPathForDirent(dent: Dirent?, buf: String?, len: ULong): StatusT =
    throw UnsupportedOperationException("getPathForDirent requires manual FFI bridge — not yet implemented")

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    throw UnsupportedOperationException("fsUnmountVolume requires manual FFI bridge — not yet implemented")

public actual fun unloadAddOn(image: ImageId): StatusT =
    throw UnsupportedOperationException("unloadAddOn requires manual FFI bridge — not yet implemented")

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("getImageSymbol requires manual FFI bridge — not yet implemented")

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: String?, nameLength: Int?, symbolType: Int?, symbolLocation: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("getNthImageSymbol requires manual FFI bridge — not yet implemented")

public actual fun clearCaches(address: COpaquePointer?, length: ULong, flags: UInt) {
    throw UnsupportedOperationException("clearCaches requires manual FFI bridge — not yet implemented")
}

public actual fun getImageInfo(image: ImageId, info: ImageInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getImageInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextImageInfo(team: TeamId, cookie: Int?, info: ImageInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextImageInfo requires manual FFI bridge — not yet implemented")

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPath requires manual FFI bridge — not yet implemented")

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPathEtc requires manual FFI bridge — not yet implemented")

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPathForPath requires manual FFI bridge — not yet implemented")

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPathForPathEtc requires manual FFI bridge — not yet implemented")

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: ULong?): StatusT =
    throw UnsupportedOperationException("findPaths requires manual FFI bridge — not yet implemented")

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: ULong?): StatusT =
    throw UnsupportedOperationException("findPathsEtc requires manual FFI bridge — not yet implemented")

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: String?, length: Int): StatusT =
    throw UnsupportedOperationException("findDirectory requires manual FFI bridge — not yet implemented")

public actual fun getCpuid(info: CpuidInfo?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    throw UnsupportedOperationException("getCpuid requires manual FFI bridge — not yet implemented")

public actual fun onExitThread(callback: ((COpaquePointer?) -> Unit)?, data: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("onExitThread requires manual FFI bridge — not yet implemented")
