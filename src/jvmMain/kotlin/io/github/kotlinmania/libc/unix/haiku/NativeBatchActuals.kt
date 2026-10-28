// port-lint: source Native.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public actual fun deleteArea(id: Int): Int =
    throw UnsupportedOperationException("deleteArea not available on JVM — no C library access")

public actual fun resizeArea(id: Int, newSize: ULong): Int =
    throw UnsupportedOperationException("resizeArea not available on JVM — no C library access")

public actual fun setAreaProtection(id: Int, newProtection: UInt): Int =
    throw UnsupportedOperationException("setAreaProtection not available on JVM — no C library access")

public actual fun getAreaInfo(id: Int, areaInfo: AreaInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getAreaInfo not available on JVM — no C library access")

public actual fun getNextAreaInfo(team: Int, cookie: Long?, areaInfo: AreaInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getNextAreaInfo not available on JVM — no C library access")

public actual fun readPort(port: Int, code: Int?, buffer: COpaquePointer?, bufferSize: ULong): Long =
    throw UnsupportedOperationException("readPort not available on JVM — no C library access")

public actual fun readPortEtc(port: Int, code: Int?, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: Long): Long =
    throw UnsupportedOperationException("readPortEtc not available on JVM — no C library access")

public actual fun writePort(port: Int, code: Int, buffer: COpaquePointer?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("writePort not available on JVM — no C library access")

public actual fun writePortEtc(port: Int, code: Int, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: Long): Int =
    throw UnsupportedOperationException("writePortEtc not available on JVM — no C library access")

public actual fun closePort(port: Int): Int =
    throw UnsupportedOperationException("closePort not available on JVM — no C library access")

public actual fun deletePort(port: Int): Int =
    throw UnsupportedOperationException("deletePort not available on JVM — no C library access")

public actual fun portBufferSize(port: Int): Long =
    throw UnsupportedOperationException("portBufferSize not available on JVM — no C library access")

public actual fun portBufferSizeEtc(port: Int, flags: UInt, timeout: Long): Long =
    throw UnsupportedOperationException("portBufferSizeEtc not available on JVM — no C library access")

public actual fun portCount(port: Int): Long =
    throw UnsupportedOperationException("portCount not available on JVM — no C library access")

public actual fun setPortOwner(port: Int, team: Int): Int =
    throw UnsupportedOperationException("setPortOwner not available on JVM — no C library access")

public actual fun getPortInfo(port: Int, buf: PortInfo?, portInfoSize: ULong): Int =
    throw UnsupportedOperationException("getPortInfo not available on JVM — no C library access")

public actual fun getNextPortInfo(port: Int, cookie: Int?, portInfo: PortInfo?, portInfoSize: ULong): Int =
    throw UnsupportedOperationException("getNextPortInfo not available on JVM — no C library access")

public actual fun getPortMessageInfoEtc(port: Int, info: PortMessageInfo?, infoSize: ULong, flags: UInt, timeout: Long): Int =
    throw UnsupportedOperationException("getPortMessageInfoEtc not available on JVM — no C library access")

public actual fun deleteSem(id: Int): Int =
    throw UnsupportedOperationException("deleteSem not available on JVM — no C library access")

public actual fun acquireSem(id: Int): Int =
    throw UnsupportedOperationException("acquireSem not available on JVM — no C library access")

public actual fun acquireSemEtc(id: Int, count: Int, flags: UInt, timeout: Long): Int =
    throw UnsupportedOperationException("acquireSemEtc not available on JVM — no C library access")

public actual fun releaseSem(id: Int): Int =
    throw UnsupportedOperationException("releaseSem not available on JVM — no C library access")

public actual fun releaseSemEtc(id: Int, count: Int, flags: UInt): Int =
    throw UnsupportedOperationException("releaseSemEtc not available on JVM — no C library access")

public actual fun switchSem(semToBeReleased: Int, id: Int): Int =
    throw UnsupportedOperationException("switchSem not available on JVM — no C library access")

public actual fun switchSemEtc(semToBeReleased: Int, id: Int, count: Int, flags: UInt, timeout: Long): Int =
    throw UnsupportedOperationException("switchSemEtc not available on JVM — no C library access")

public actual fun getSemCount(id: Int, threadCount: Int?): Int =
    throw UnsupportedOperationException("getSemCount not available on JVM — no C library access")

public actual fun setSemOwner(id: Int, team: Int): Int =
    throw UnsupportedOperationException("setSemOwner not available on JVM — no C library access")

public actual fun getSemInfo(id: Int, info: SemInfo?, infoSize: ULong): Int =
    throw UnsupportedOperationException("getSemInfo not available on JVM — no C library access")

public actual fun getNextSemInfo(team: Int, cookie: Int?, info: SemInfo?, infoSize: ULong): Int =
    throw UnsupportedOperationException("getNextSemInfo not available on JVM — no C library access")

public actual fun killTeam(team: Int): Int =
    throw UnsupportedOperationException("killTeam not available on JVM — no C library access")

public actual fun getTeamInfo(team: Int, info: TeamInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getTeamInfo not available on JVM — no C library access")

public actual fun getNextTeamInfo(cookie: Int?, info: TeamInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getNextTeamInfo not available on JVM — no C library access")

public actual fun killThread(thread: Int): Int =
    throw UnsupportedOperationException("killThread not available on JVM — no C library access")

public actual fun resumeThread(thread: Int): Int =
    throw UnsupportedOperationException("resumeThread not available on JVM — no C library access")

public actual fun suspendThread(thread: Int): Int =
    throw UnsupportedOperationException("suspendThread not available on JVM — no C library access")

public actual fun renameThread(thread: Int, newName: String?): Int =
    throw UnsupportedOperationException("renameThread not available on JVM — no C library access")

public actual fun setThreadPriority(thread: Int, newPriority: Int): Int =
    throw UnsupportedOperationException("setThreadPriority not available on JVM — no C library access")

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: Long, length: Long): Int =
    throw UnsupportedOperationException("suggestThreadPriority not available on JVM — no C library access")

public actual fun exitThread(status: Int): Unit = throw UnsupportedOperationException("exitThread not available on JVM — no C library access")

public actual fun waitForThread(thread: Int, returnValue: Int?): Int =
    throw UnsupportedOperationException("waitForThread not available on JVM — no C library access")

public actual fun getSchedulerMode(): Int =
    throw UnsupportedOperationException("getSchedulerMode not available on JVM — no C library access")

public actual fun setSchedulerMode(mode: Int): Int =
    throw UnsupportedOperationException("setSchedulerMode not available on JVM — no C library access")

public actual fun sendData(thread: Int, code: Int, buffer: COpaquePointer?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("sendData not available on JVM — no C library access")

public actual fun receiveData(sender: Int?, buffer: COpaquePointer?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("receiveData not available on JVM — no C library access")

public actual fun hasData(thread: Int): Boolean =
    throw UnsupportedOperationException("hasData not available on JVM — no C library access")

public actual fun snooze(amount: Long): Int =
    throw UnsupportedOperationException("snooze not available on JVM — no C library access")

public actual fun snoozeEtc(amount: Long, timeBase: Int, flags: UInt): Int =
    throw UnsupportedOperationException("snoozeEtc not available on JVM — no C library access")

public actual fun snoozeUntil(time: Long, timeBase: Int): Int =
    throw UnsupportedOperationException("snoozeUntil not available on JVM — no C library access")

public actual fun getThreadInfo(id: Int, info: ThreadInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getThreadInfo not available on JVM — no C library access")

public actual fun getNextThreadInfo(team: Int, cookie: Int?, info: ThreadInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getNextThreadInfo not available on JVM — no C library access")

public actual fun getTeamUsageInfo(team: Int, who: Int, info: TeamUsageInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getTeamUsageInfo not available on JVM — no C library access")

public actual fun realTimeClock(): ULong =
    throw UnsupportedOperationException("realTimeClock not available on JVM — no C library access")

public actual fun setRealTimeClock(secsSinceJan1st1970: ULong): Unit = throw UnsupportedOperationException("setRealTimeClock not available on JVM — no C library access")

public actual fun debugger(message: String?): Unit = throw UnsupportedOperationException("debugger not available on JVM — no C library access")

public actual fun disableDebugger(state: Int): Int =
    throw UnsupportedOperationException("disableDebugger not available on JVM — no C library access")

public actual fun getSystemInfo(info: SystemInfo?): Int =
    throw UnsupportedOperationException("getSystemInfo not available on JVM — no C library access")

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: CpuInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getCpuInfoEtc not available on JVM — no C library access")

public actual fun getCpuTopologyInfo(topologyInfos: CpuTopologyNodeInfo?, topologyInfoCount: UInt?): Int =
    throw UnsupportedOperationException("getCpuTopologyInfo not available on JVM — no C library access")

public actual fun isComputerOn(): Int =
    throw UnsupportedOperationException("isComputerOn not available on JVM — no C library access")

public actual fun sendSignal(threadID: Int, signal: UInt): Int =
    throw UnsupportedOperationException("sendSignal not available on JVM — no C library access")

public actual fun setSignalStack(base: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("setSignalStack not available on JVM — no C library access")

public actual fun waitForObjects(infos: ObjectWaitInfo?, numInfos: Int): Long =
    throw UnsupportedOperationException("waitForObjects not available on JVM — no C library access")

public actual fun waitForObjectsEtc(infos: ObjectWaitInfo?, numInfos: Int, flags: UInt, timeout: Long): Long =
    throw UnsupportedOperationException("waitForObjectsEtc not available on JVM — no C library access")

public actual fun fsReadAttr(fd: Int, attribute: String?, type: UInt, pos: Long, buffer: COpaquePointer?, readBytes: ULong): Long =
    throw UnsupportedOperationException("fsReadAttr not available on JVM — no C library access")

public actual fun fsWriteAttr(fd: Int, attribute: String?, type: UInt, pos: Long, buffer: COpaquePointer?, writeBytes: ULong): Long =
    throw UnsupportedOperationException("fsWriteAttr not available on JVM — no C library access")

public actual fun fsRemoveAttr(fd: Int, attribute: String?): Int =
    throw UnsupportedOperationException("fsRemoveAttr not available on JVM — no C library access")

public actual fun fsStatAttr(fd: Int, attribute: String?, attrInfo: AttrInfo?): Int =
    throw UnsupportedOperationException("fsStatAttr not available on JVM — no C library access")

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: Int): Int =
    throw UnsupportedOperationException("fsOpenAttr not available on JVM — no C library access")

public actual fun fsFopenAttr(fd: Int, attribute: String?, type: UInt, openMode: Int): Int =
    throw UnsupportedOperationException("fsFopenAttr not available on JVM — no C library access")

public actual fun fsCloseAttr(fd: Int): Int =
    throw UnsupportedOperationException("fsCloseAttr not available on JVM — no C library access")

public actual fun fsOpenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("fsOpenAttrDir not available on JVM — no C library access")

public actual fun fsLopenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("fsLopenAttrDir not available on JVM — no C library access")

public actual fun fsFopenAttrDir(fd: Int): DIR? =
    throw UnsupportedOperationException("fsFopenAttrDir not available on JVM — no C library access")

public actual fun fsCloseAttrDir(dir: DIR?): Int =
    throw UnsupportedOperationException("fsCloseAttrDir not available on JVM — no C library access")

public actual fun fsReadAttrDir(dir: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadAttrDir not available on JVM — no C library access")

public actual fun fsRewindAttrDir(dir: DIR?): Unit = throw UnsupportedOperationException("fsRewindAttrDir not available on JVM — no C library access")

public actual fun fsCreateIndex(device: Int, name: String?, type: UInt, flags: UInt): Int =
    throw UnsupportedOperationException("fsCreateIndex not available on JVM — no C library access")

public actual fun fsRemoveIndex(device: Int, name: String?): Int =
    throw UnsupportedOperationException("fsRemoveIndex not available on JVM — no C library access")

public actual fun fsStatIndex(device: Int, name: String?, indexInfo: IndexInfo?): Int =
    throw UnsupportedOperationException("fsStatIndex not available on JVM — no C library access")

public actual fun fsOpenIndexDir(device: Int): DIR? =
    throw UnsupportedOperationException("fsOpenIndexDir not available on JVM — no C library access")

public actual fun fsCloseIndexDir(indexDirectory: DIR?): Int =
    throw UnsupportedOperationException("fsCloseIndexDir not available on JVM — no C library access")

public actual fun fsReadIndexDir(indexDirectory: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadIndexDir not available on JVM — no C library access")

public actual fun fsRewindIndexDir(indexDirectory: DIR?): Unit = throw UnsupportedOperationException("fsRewindIndexDir not available on JVM — no C library access")

public actual fun fsStatDev(dev: Int, info: FsInfo?): Int =
    throw UnsupportedOperationException("fsStatDev not available on JVM — no C library access")

public actual fun fsOpenQuery(device: Int, query: String?, flags: UInt): DIR? =
    throw UnsupportedOperationException("fsOpenQuery not available on JVM — no C library access")

public actual fun fsOpenLiveQuery(device: Int, query: String?, flags: UInt, port: Int, token: Int): DIR? =
    throw UnsupportedOperationException("fsOpenLiveQuery not available on JVM — no C library access")

public actual fun fsCloseQuery(d: DIR?): Int =
    throw UnsupportedOperationException("fsCloseQuery not available on JVM — no C library access")

public actual fun fsReadQuery(d: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadQuery not available on JVM — no C library access")

public actual fun getPathForDirent(dent: Dirent?, buf: String?, len: ULong): Int =
    throw UnsupportedOperationException("getPathForDirent not available on JVM — no C library access")

public actual fun fsUnmountVolume(path: String?, flags: UInt): Int =
    throw UnsupportedOperationException("fsUnmountVolume not available on JVM — no C library access")

public actual fun unloadAddOn(image: Int): Int =
    throw UnsupportedOperationException("unloadAddOn not available on JVM — no C library access")

public actual fun getImageSymbol(image: Int, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): Int =
    throw UnsupportedOperationException("getImageSymbol not available on JVM — no C library access")

public actual fun getNthImageSymbol(image: Int, n: Int, nameBuffer: String?, nameLength: Int?, symbolType: Int?, symbolLocation: COpaquePointer?): Int =
    throw UnsupportedOperationException("getNthImageSymbol not available on JVM — no C library access")

public actual fun clearCaches(address: COpaquePointer?, length: ULong, flags: UInt): Unit = throw UnsupportedOperationException("clearCaches not available on JVM — no C library access")

public actual fun getImageInfo(image: Int, info: ImageInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getImageInfo not available on JVM — no C library access")

public actual fun getNextImageInfo(team: Int, cookie: Int?, info: ImageInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getNextImageInfo not available on JVM — no C library access")

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: UInt, subPath: String?, pathBuffer: String?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("findPath not available on JVM — no C library access")

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: UInt, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("findPathEtc not available on JVM — no C library access")

public actual fun findPathForPath(path: String?, baseDirectory: UInt, subPath: String?, pathBuffer: String?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("findPathForPath not available on JVM — no C library access")

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: UInt, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("findPathForPathEtc not available on JVM — no C library access")

public actual fun findPaths(baseDirectory: UInt, subPath: String?, paths: COpaquePointer?, pathCount: ULong?): Int =
    throw UnsupportedOperationException("findPaths not available on JVM — no C library access")

public actual fun findPathsEtc(architecture: String?, baseDirectory: UInt, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: ULong?): Int =
    throw UnsupportedOperationException("findPathsEtc not available on JVM — no C library access")

public actual fun findDirectory(which: UInt, volume: Int, createIt: Boolean, pathString: String?, length: Int): Int =
    throw UnsupportedOperationException("findDirectory not available on JVM — no C library access")

public actual fun getCpuid(info: CpuidInfo?, eaxRegister: UInt, cpuNum: UInt): Int =
    throw UnsupportedOperationException("getCpuid not available on JVM — no C library access")

public actual fun onExitThread(callback: ((COpaquePointer?) -> Unit)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("onExitThread not available on JVM — no C library access")
