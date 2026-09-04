// port-lint: source Native.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public actual fun deleteArea(id: AreaId): StatusT =
    throw UnsupportedOperationException("deleteArea requires N-API addon")

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    throw UnsupportedOperationException("resizeArea requires N-API addon")

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    throw UnsupportedOperationException("setAreaProtection requires N-API addon")

public actual fun getAreaInfo(id: AreaId, areaInfo: AreaInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getAreaInfo requires N-API addon")

public actual fun getNextAreaInfo(team: TeamId, cookie: Long?, areaInfo: AreaInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextAreaInfo requires N-API addon")

public actual fun readPort(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: ULong): SsizeT =
    throw UnsupportedOperationException("readPort requires N-API addon")

public actual fun readPortEtc(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("readPortEtc requires N-API addon")

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("writePort requires N-API addon")

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("writePortEtc requires N-API addon")

public actual fun closePort(port: PortId): StatusT =
    throw UnsupportedOperationException("closePort requires N-API addon")

public actual fun deletePort(port: PortId): StatusT =
    throw UnsupportedOperationException("deletePort requires N-API addon")

public actual fun portBufferSize(port: PortId): SsizeT =
    throw UnsupportedOperationException("portBufferSize requires N-API addon")

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("portBufferSizeEtc requires N-API addon")

public actual fun portCount(port: PortId): SsizeT =
    throw UnsupportedOperationException("portCount requires N-API addon")

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    throw UnsupportedOperationException("setPortOwner requires N-API addon")

public actual fun getPortInfo(port: PortId, buf: PortInfo?, portInfoSize: ULong): StatusT =
    throw UnsupportedOperationException("getPortInfo requires N-API addon")

public actual fun getNextPortInfo(port: PortId, cookie: Int?, portInfo: PortInfo?, portInfoSize: ULong): StatusT =
    throw UnsupportedOperationException("getNextPortInfo requires N-API addon")

public actual fun getPortMessageInfoEtc(port: PortId, info: PortMessageInfo?, infoSize: ULong, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("getPortMessageInfoEtc requires N-API addon")

public actual fun deleteSem(id: SemId): StatusT =
    throw UnsupportedOperationException("deleteSem requires N-API addon")

public actual fun acquireSem(id: SemId): StatusT =
    throw UnsupportedOperationException("acquireSem requires N-API addon")

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("acquireSemEtc requires N-API addon")

public actual fun releaseSem(id: SemId): StatusT =
    throw UnsupportedOperationException("releaseSem requires N-API addon")

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    throw UnsupportedOperationException("releaseSemEtc requires N-API addon")

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    throw UnsupportedOperationException("switchSem requires N-API addon")

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("switchSemEtc requires N-API addon")

public actual fun getSemCount(id: SemId, threadCount: Int?): StatusT =
    throw UnsupportedOperationException("getSemCount requires N-API addon")

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    throw UnsupportedOperationException("setSemOwner requires N-API addon")

public actual fun getSemInfo(id: SemId, info: SemInfo?, infoSize: ULong): StatusT =
    throw UnsupportedOperationException("getSemInfo requires N-API addon")

public actual fun getNextSemInfo(team: TeamId, cookie: Int?, info: SemInfo?, infoSize: ULong): StatusT =
    throw UnsupportedOperationException("getNextSemInfo requires N-API addon")

public actual fun killTeam(team: TeamId): StatusT =
    throw UnsupportedOperationException("killTeam requires N-API addon")

public actual fun getTeamInfo(team: TeamId, info: TeamInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getTeamInfo requires N-API addon")

public actual fun getNextTeamInfo(cookie: Int?, info: TeamInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextTeamInfo requires N-API addon")

public actual fun killThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("killThread requires N-API addon")

public actual fun resumeThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("resumeThread requires N-API addon")

public actual fun suspendThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("suspendThread requires N-API addon")

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    throw UnsupportedOperationException("renameThread requires N-API addon")

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    throw UnsupportedOperationException("setThreadPriority requires N-API addon")

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    throw UnsupportedOperationException("suggestThreadPriority requires N-API addon")

public actual fun exitThread(status: StatusT) {
    throw UnsupportedOperationException("exitThread requires N-API addon")
}

public actual fun waitForThread(thread: ThreadId, returnValue: StatusT?): StatusT =
    throw UnsupportedOperationException("waitForThread requires N-API addon")

public actual fun getSchedulerMode(): Int =
    throw UnsupportedOperationException("getSchedulerMode requires N-API addon")

public actual fun setSchedulerMode(mode: Int): StatusT =
    throw UnsupportedOperationException("setSchedulerMode requires N-API addon")

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("sendData requires N-API addon")

public actual fun receiveData(sender: ThreadId?, buffer: COpaquePointer?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("receiveData requires N-API addon")

public actual fun hasData(thread: ThreadId): Boolean =
    throw UnsupportedOperationException("hasData requires N-API addon")

public actual fun snooze(amount: BigtimeT): StatusT =
    throw UnsupportedOperationException("snooze requires N-API addon")

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    throw UnsupportedOperationException("snoozeEtc requires N-API addon")

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    throw UnsupportedOperationException("snoozeUntil requires N-API addon")

public actual fun getThreadInfo(id: ThreadId, info: ThreadInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getThreadInfo requires N-API addon")

public actual fun getNextThreadInfo(team: TeamId, cookie: Int?, info: ThreadInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextThreadInfo requires N-API addon")

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: TeamUsageInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getTeamUsageInfo requires N-API addon")

public actual fun realTimeClock(): CULong =
    throw UnsupportedOperationException("realTimeClock requires N-API addon")

public actual fun setRealTimeClock(secsSinceJan1st1970: CULong) {
    throw UnsupportedOperationException("setRealTimeClock requires N-API addon")
}

public actual fun debugger(message: String?) {
    throw UnsupportedOperationException("debugger requires N-API addon")
}

public actual fun disableDebugger(state: CInt): CInt =
    throw UnsupportedOperationException("disableDebugger requires N-API addon")

public actual fun getSystemInfo(info: SystemInfo?): StatusT =
    throw UnsupportedOperationException("getSystemInfo requires N-API addon")

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: CpuInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getCpuInfoEtc requires N-API addon")

public actual fun getCpuTopologyInfo(topologyInfos: CpuTopologyNodeInfo?, topologyInfoCount: UInt?): StatusT =
    throw UnsupportedOperationException("getCpuTopologyInfo requires N-API addon")

public actual fun isComputerOn(): Int =
    throw UnsupportedOperationException("isComputerOn requires N-API addon")

public actual fun sendSignal(threadID: ThreadId, signal: CUInt): CInt =
    throw UnsupportedOperationException("sendSignal requires N-API addon")

public actual fun setSignalStack(base: COpaquePointer?, size: ULong) {
    throw UnsupportedOperationException("setSignalStack requires N-API addon")
}

public actual fun waitForObjects(infos: ObjectWaitInfo?, numInfos: CInt): SsizeT =
    throw UnsupportedOperationException("waitForObjects requires N-API addon")

public actual fun waitForObjectsEtc(infos: ObjectWaitInfo?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("waitForObjectsEtc requires N-API addon")

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: ULong): SsizeT =
    throw UnsupportedOperationException("fsReadAttr requires N-API addon")

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: ULong): SsizeT =
    throw UnsupportedOperationException("fsWriteAttr requires N-API addon")

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    throw UnsupportedOperationException("fsRemoveAttr requires N-API addon")

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: AttrInfo?): CInt =
    throw UnsupportedOperationException("fsStatAttr requires N-API addon")

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    throw UnsupportedOperationException("fsOpenAttr requires N-API addon")

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    throw UnsupportedOperationException("fsFopenAttr requires N-API addon")

public actual fun fsCloseAttr(fd: CInt): CInt =
    throw UnsupportedOperationException("fsCloseAttr requires N-API addon")

public actual fun fsOpenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("fsOpenAttrDir requires N-API addon")

public actual fun fsLopenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("fsLopenAttrDir requires N-API addon")

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    throw UnsupportedOperationException("fsFopenAttrDir requires N-API addon")

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    throw UnsupportedOperationException("fsCloseAttrDir requires N-API addon")

public actual fun fsReadAttrDir(dir: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadAttrDir requires N-API addon")

public actual fun fsRewindAttrDir(dir: DIR?) {
    throw UnsupportedOperationException("fsRewindAttrDir requires N-API addon")
}

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    throw UnsupportedOperationException("fsCreateIndex requires N-API addon")

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    throw UnsupportedOperationException("fsRemoveIndex requires N-API addon")

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: IndexInfo?): CInt =
    throw UnsupportedOperationException("fsStatIndex requires N-API addon")

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    throw UnsupportedOperationException("fsOpenIndexDir requires N-API addon")

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    throw UnsupportedOperationException("fsCloseIndexDir requires N-API addon")

public actual fun fsReadIndexDir(indexDirectory: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadIndexDir requires N-API addon")

public actual fun fsRewindIndexDir(indexDirectory: DIR?) {
    throw UnsupportedOperationException("fsRewindIndexDir requires N-API addon")
}

public actual fun fsStatDev(dev: DevT, info: FsInfo?): CInt =
    throw UnsupportedOperationException("fsStatDev requires N-API addon")

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    throw UnsupportedOperationException("fsOpenQuery requires N-API addon")

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    throw UnsupportedOperationException("fsOpenLiveQuery requires N-API addon")

public actual fun fsCloseQuery(d: DIR?): CInt =
    throw UnsupportedOperationException("fsCloseQuery requires N-API addon")

public actual fun fsReadQuery(d: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadQuery requires N-API addon")

public actual fun getPathForDirent(dent: Dirent?, buf: String?, len: ULong): StatusT =
    throw UnsupportedOperationException("getPathForDirent requires N-API addon")

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    throw UnsupportedOperationException("fsUnmountVolume requires N-API addon")

public actual fun unloadAddOn(image: ImageId): StatusT =
    throw UnsupportedOperationException("unloadAddOn requires N-API addon")

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("getImageSymbol requires N-API addon")

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: String?, nameLength: Int?, symbolType: Int?, symbolLocation: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("getNthImageSymbol requires N-API addon")

public actual fun clearCaches(address: COpaquePointer?, length: ULong, flags: UInt) {
    throw UnsupportedOperationException("clearCaches requires N-API addon")
}

public actual fun getImageInfo(image: ImageId, info: ImageInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getImageInfo requires N-API addon")

public actual fun getNextImageInfo(team: TeamId, cookie: Int?, info: ImageInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextImageInfo requires N-API addon")

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPath requires N-API addon")

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPathEtc requires N-API addon")

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPathForPath requires N-API addon")

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPathForPathEtc requires N-API addon")

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: ULong?): StatusT =
    throw UnsupportedOperationException("findPaths requires N-API addon")

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: ULong?): StatusT =
    throw UnsupportedOperationException("findPathsEtc requires N-API addon")

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: String?, length: Int): StatusT =
    throw UnsupportedOperationException("findDirectory requires N-API addon")

public actual fun getCpuid(info: CpuidInfo?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    throw UnsupportedOperationException("getCpuid requires N-API addon")

