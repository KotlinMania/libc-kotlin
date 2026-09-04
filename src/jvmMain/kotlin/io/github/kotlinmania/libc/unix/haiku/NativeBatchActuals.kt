// port-lint: source Native.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public actual fun deleteArea(id: AreaId): StatusT =
    throw UnsupportedOperationException("deleteArea not available on JVM — no C library access")

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    throw UnsupportedOperationException("resizeArea not available on JVM — no C library access")

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    throw UnsupportedOperationException("setAreaProtection not available on JVM — no C library access")

public actual fun getAreaInfo(id: AreaId, areaInfo: AreaInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getAreaInfo not available on JVM — no C library access")

public actual fun getNextAreaInfo(team: TeamId, cookie: Long?, areaInfo: AreaInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextAreaInfo not available on JVM — no C library access")

public actual fun readPort(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: ULong): SsizeT =
    throw UnsupportedOperationException("readPort not available on JVM — no C library access")

public actual fun readPortEtc(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("readPortEtc not available on JVM — no C library access")

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("writePort not available on JVM — no C library access")

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("writePortEtc not available on JVM — no C library access")

public actual fun closePort(port: PortId): StatusT =
    throw UnsupportedOperationException("closePort not available on JVM — no C library access")

public actual fun deletePort(port: PortId): StatusT =
    throw UnsupportedOperationException("deletePort not available on JVM — no C library access")

public actual fun portBufferSize(port: PortId): SsizeT =
    throw UnsupportedOperationException("portBufferSize not available on JVM — no C library access")

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("portBufferSizeEtc not available on JVM — no C library access")

public actual fun portCount(port: PortId): SsizeT =
    throw UnsupportedOperationException("portCount not available on JVM — no C library access")

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    throw UnsupportedOperationException("setPortOwner not available on JVM — no C library access")

public actual fun getPortInfo(port: PortId, buf: PortInfo?, portInfoSize: ULong): StatusT =
    throw UnsupportedOperationException("getPortInfo not available on JVM — no C library access")

public actual fun getNextPortInfo(port: PortId, cookie: Int?, portInfo: PortInfo?, portInfoSize: ULong): StatusT =
    throw UnsupportedOperationException("getNextPortInfo not available on JVM — no C library access")

public actual fun getPortMessageInfoEtc(port: PortId, info: PortMessageInfo?, infoSize: ULong, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("getPortMessageInfoEtc not available on JVM — no C library access")

public actual fun deleteSem(id: SemId): StatusT =
    throw UnsupportedOperationException("deleteSem not available on JVM — no C library access")

public actual fun acquireSem(id: SemId): StatusT =
    throw UnsupportedOperationException("acquireSem not available on JVM — no C library access")

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("acquireSemEtc not available on JVM — no C library access")

public actual fun releaseSem(id: SemId): StatusT =
    throw UnsupportedOperationException("releaseSem not available on JVM — no C library access")

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    throw UnsupportedOperationException("releaseSemEtc not available on JVM — no C library access")

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    throw UnsupportedOperationException("switchSem not available on JVM — no C library access")

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    throw UnsupportedOperationException("switchSemEtc not available on JVM — no C library access")

public actual fun getSemCount(id: SemId, threadCount: Int?): StatusT =
    throw UnsupportedOperationException("getSemCount not available on JVM — no C library access")

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    throw UnsupportedOperationException("setSemOwner not available on JVM — no C library access")

public actual fun getSemInfo(id: SemId, info: SemInfo?, infoSize: ULong): StatusT =
    throw UnsupportedOperationException("getSemInfo not available on JVM — no C library access")

public actual fun getNextSemInfo(team: TeamId, cookie: Int?, info: SemInfo?, infoSize: ULong): StatusT =
    throw UnsupportedOperationException("getNextSemInfo not available on JVM — no C library access")

public actual fun killTeam(team: TeamId): StatusT =
    throw UnsupportedOperationException("killTeam not available on JVM — no C library access")

public actual fun getTeamInfo(team: TeamId, info: TeamInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getTeamInfo not available on JVM — no C library access")

public actual fun getNextTeamInfo(cookie: Int?, info: TeamInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextTeamInfo not available on JVM — no C library access")

public actual fun killThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("killThread not available on JVM — no C library access")

public actual fun resumeThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("resumeThread not available on JVM — no C library access")

public actual fun suspendThread(thread: ThreadId): StatusT =
    throw UnsupportedOperationException("suspendThread not available on JVM — no C library access")

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    throw UnsupportedOperationException("renameThread not available on JVM — no C library access")

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    throw UnsupportedOperationException("setThreadPriority not available on JVM — no C library access")

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    throw UnsupportedOperationException("suggestThreadPriority not available on JVM — no C library access")

public actual fun exitThread(status: StatusT) {
    throw UnsupportedOperationException("exitThread not available on JVM — no C library access")
}

public actual fun waitForThread(thread: ThreadId, returnValue: StatusT?): StatusT =
    throw UnsupportedOperationException("waitForThread not available on JVM — no C library access")

public actual fun getSchedulerMode(): Int =
    throw UnsupportedOperationException("getSchedulerMode not available on JVM — no C library access")

public actual fun setSchedulerMode(mode: Int): StatusT =
    throw UnsupportedOperationException("setSchedulerMode not available on JVM — no C library access")

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("sendData not available on JVM — no C library access")

public actual fun receiveData(sender: ThreadId?, buffer: COpaquePointer?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("receiveData not available on JVM — no C library access")

public actual fun hasData(thread: ThreadId): Boolean =
    throw UnsupportedOperationException("hasData not available on JVM — no C library access")

public actual fun snooze(amount: BigtimeT): StatusT =
    throw UnsupportedOperationException("snooze not available on JVM — no C library access")

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    throw UnsupportedOperationException("snoozeEtc not available on JVM — no C library access")

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    throw UnsupportedOperationException("snoozeUntil not available on JVM — no C library access")

public actual fun getThreadInfo(id: ThreadId, info: ThreadInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getThreadInfo not available on JVM — no C library access")

public actual fun getNextThreadInfo(team: TeamId, cookie: Int?, info: ThreadInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextThreadInfo not available on JVM — no C library access")

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: TeamUsageInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getTeamUsageInfo not available on JVM — no C library access")

public actual fun realTimeClock(): CULong =
    throw UnsupportedOperationException("realTimeClock not available on JVM — no C library access")

public actual fun setRealTimeClock(secsSinceJan1st1970: CULong) {
    throw UnsupportedOperationException("setRealTimeClock not available on JVM — no C library access")
}

public actual fun debugger(message: String?) {
    throw UnsupportedOperationException("debugger not available on JVM — no C library access")
}

public actual fun disableDebugger(state: CInt): CInt =
    throw UnsupportedOperationException("disableDebugger not available on JVM — no C library access")

public actual fun getSystemInfo(info: SystemInfo?): StatusT =
    throw UnsupportedOperationException("getSystemInfo not available on JVM — no C library access")

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: CpuInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getCpuInfoEtc not available on JVM — no C library access")

public actual fun getCpuTopologyInfo(topologyInfos: CpuTopologyNodeInfo?, topologyInfoCount: UInt?): StatusT =
    throw UnsupportedOperationException("getCpuTopologyInfo not available on JVM — no C library access")

public actual fun isComputerOn(): Int =
    throw UnsupportedOperationException("isComputerOn not available on JVM — no C library access")

public actual fun sendSignal(threadID: ThreadId, signal: CUInt): CInt =
    throw UnsupportedOperationException("sendSignal not available on JVM — no C library access")

public actual fun setSignalStack(base: COpaquePointer?, size: ULong) {
    throw UnsupportedOperationException("setSignalStack not available on JVM — no C library access")
}

public actual fun waitForObjects(infos: ObjectWaitInfo?, numInfos: CInt): SsizeT =
    throw UnsupportedOperationException("waitForObjects not available on JVM — no C library access")

public actual fun waitForObjectsEtc(infos: ObjectWaitInfo?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    throw UnsupportedOperationException("waitForObjectsEtc not available on JVM — no C library access")

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: ULong): SsizeT =
    throw UnsupportedOperationException("fsReadAttr not available on JVM — no C library access")

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: ULong): SsizeT =
    throw UnsupportedOperationException("fsWriteAttr not available on JVM — no C library access")

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    throw UnsupportedOperationException("fsRemoveAttr not available on JVM — no C library access")

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: AttrInfo?): CInt =
    throw UnsupportedOperationException("fsStatAttr not available on JVM — no C library access")

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    throw UnsupportedOperationException("fsOpenAttr not available on JVM — no C library access")

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    throw UnsupportedOperationException("fsFopenAttr not available on JVM — no C library access")

public actual fun fsCloseAttr(fd: CInt): CInt =
    throw UnsupportedOperationException("fsCloseAttr not available on JVM — no C library access")

public actual fun fsOpenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("fsOpenAttrDir not available on JVM — no C library access")

public actual fun fsLopenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("fsLopenAttrDir not available on JVM — no C library access")

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    throw UnsupportedOperationException("fsFopenAttrDir not available on JVM — no C library access")

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    throw UnsupportedOperationException("fsCloseAttrDir not available on JVM — no C library access")

public actual fun fsReadAttrDir(dir: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadAttrDir not available on JVM — no C library access")

public actual fun fsRewindAttrDir(dir: DIR?) {
    throw UnsupportedOperationException("fsRewindAttrDir not available on JVM — no C library access")
}

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    throw UnsupportedOperationException("fsCreateIndex not available on JVM — no C library access")

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    throw UnsupportedOperationException("fsRemoveIndex not available on JVM — no C library access")

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: IndexInfo?): CInt =
    throw UnsupportedOperationException("fsStatIndex not available on JVM — no C library access")

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    throw UnsupportedOperationException("fsOpenIndexDir not available on JVM — no C library access")

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    throw UnsupportedOperationException("fsCloseIndexDir not available on JVM — no C library access")

public actual fun fsReadIndexDir(indexDirectory: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadIndexDir not available on JVM — no C library access")

public actual fun fsRewindIndexDir(indexDirectory: DIR?) {
    throw UnsupportedOperationException("fsRewindIndexDir not available on JVM — no C library access")
}

public actual fun fsStatDev(dev: DevT, info: FsInfo?): CInt =
    throw UnsupportedOperationException("fsStatDev not available on JVM — no C library access")

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    throw UnsupportedOperationException("fsOpenQuery not available on JVM — no C library access")

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    throw UnsupportedOperationException("fsOpenLiveQuery not available on JVM — no C library access")

public actual fun fsCloseQuery(d: DIR?): CInt =
    throw UnsupportedOperationException("fsCloseQuery not available on JVM — no C library access")

public actual fun fsReadQuery(d: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadQuery not available on JVM — no C library access")

public actual fun getPathForDirent(dent: Dirent?, buf: String?, len: ULong): StatusT =
    throw UnsupportedOperationException("getPathForDirent not available on JVM — no C library access")

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    throw UnsupportedOperationException("fsUnmountVolume not available on JVM — no C library access")

public actual fun unloadAddOn(image: ImageId): StatusT =
    throw UnsupportedOperationException("unloadAddOn not available on JVM — no C library access")

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("getImageSymbol not available on JVM — no C library access")

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: String?, nameLength: Int?, symbolType: Int?, symbolLocation: COpaquePointer?): StatusT =
    throw UnsupportedOperationException("getNthImageSymbol not available on JVM — no C library access")

public actual fun clearCaches(address: COpaquePointer?, length: ULong, flags: UInt) {
    throw UnsupportedOperationException("clearCaches not available on JVM — no C library access")
}

public actual fun getImageInfo(image: ImageId, info: ImageInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getImageInfo not available on JVM — no C library access")

public actual fun getNextImageInfo(team: TeamId, cookie: Int?, info: ImageInfo?, size: ULong): StatusT =
    throw UnsupportedOperationException("getNextImageInfo not available on JVM — no C library access")

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPath not available on JVM — no C library access")

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPathEtc not available on JVM — no C library access")

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPathForPath not available on JVM — no C library access")

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): StatusT =
    throw UnsupportedOperationException("findPathForPathEtc not available on JVM — no C library access")

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: ULong?): StatusT =
    throw UnsupportedOperationException("findPaths not available on JVM — no C library access")

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: ULong?): StatusT =
    throw UnsupportedOperationException("findPathsEtc not available on JVM — no C library access")

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: String?, length: Int): StatusT =
    throw UnsupportedOperationException("findDirectory not available on JVM — no C library access")

public actual fun getCpuid(info: CpuidInfo?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    throw UnsupportedOperationException("getCpuid not available on JVM — no C library access")

