// port-lint: source Native.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun deleteArea(id: Int): Int =
    throw UnsupportedOperationException("deleteArea requires manual FFI bridge — not yet implemented")

public actual fun resizeArea(id: Int, newSize: ULong): Int =
    throw UnsupportedOperationException("resizeArea requires manual FFI bridge — not yet implemented")

public actual fun setAreaProtection(id: Int, newProtection: UInt): Int =
    throw UnsupportedOperationException("setAreaProtection requires manual FFI bridge — not yet implemented")

public actual fun getAreaInfo(id: Int, areaInfo: AreaInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getAreaInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextAreaInfo(team: Int, cookie: Long?, areaInfo: AreaInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getNextAreaInfo requires manual FFI bridge — not yet implemented")

public actual fun readPort(port: Int, code: Int?, buffer: COpaquePointer?, bufferSize: ULong): Long =
    throw UnsupportedOperationException("readPort requires manual FFI bridge — not yet implemented")

public actual fun readPortEtc(port: Int, code: Int?, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: Long): Long =
    throw UnsupportedOperationException("readPortEtc requires manual FFI bridge — not yet implemented")

public actual fun writePort(port: Int, code: Int, buffer: COpaquePointer?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("writePort requires manual FFI bridge — not yet implemented")

public actual fun writePortEtc(port: Int, code: Int, buffer: COpaquePointer?, bufferSize: ULong, flags: UInt, timeout: Long): Int =
    throw UnsupportedOperationException("writePortEtc requires manual FFI bridge — not yet implemented")

public actual fun closePort(port: Int): Int =
    throw UnsupportedOperationException("closePort requires manual FFI bridge — not yet implemented")

public actual fun deletePort(port: Int): Int =
    throw UnsupportedOperationException("deletePort requires manual FFI bridge — not yet implemented")

public actual fun portBufferSize(port: Int): Long =
    throw UnsupportedOperationException("portBufferSize requires manual FFI bridge — not yet implemented")

public actual fun portBufferSizeEtc(port: Int, flags: UInt, timeout: Long): Long =
    throw UnsupportedOperationException("portBufferSizeEtc requires manual FFI bridge — not yet implemented")

public actual fun portCount(port: Int): Long =
    throw UnsupportedOperationException("portCount requires manual FFI bridge — not yet implemented")

public actual fun setPortOwner(port: Int, team: Int): Int =
    throw UnsupportedOperationException("setPortOwner requires manual FFI bridge — not yet implemented")

public actual fun getPortInfo(port: Int, buf: PortInfo?, portInfoSize: ULong): Int =
    throw UnsupportedOperationException("getPortInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextPortInfo(port: Int, cookie: Int?, portInfo: PortInfo?, portInfoSize: ULong): Int =
    throw UnsupportedOperationException("getNextPortInfo requires manual FFI bridge — not yet implemented")

public actual fun getPortMessageInfoEtc(port: Int, info: PortMessageInfo?, infoSize: ULong, flags: UInt, timeout: Long): Int =
    throw UnsupportedOperationException("getPortMessageInfoEtc requires manual FFI bridge — not yet implemented")

public actual fun deleteSem(id: Int): Int =
    throw UnsupportedOperationException("deleteSem requires manual FFI bridge — not yet implemented")

public actual fun acquireSem(id: Int): Int =
    throw UnsupportedOperationException("acquireSem requires manual FFI bridge — not yet implemented")

public actual fun acquireSemEtc(id: Int, count: Int, flags: UInt, timeout: Long): Int =
    throw UnsupportedOperationException("acquireSemEtc requires manual FFI bridge — not yet implemented")

public actual fun releaseSem(id: Int): Int =
    throw UnsupportedOperationException("releaseSem requires manual FFI bridge — not yet implemented")

public actual fun releaseSemEtc(id: Int, count: Int, flags: UInt): Int =
    throw UnsupportedOperationException("releaseSemEtc requires manual FFI bridge — not yet implemented")

public actual fun switchSem(semToBeReleased: Int, id: Int): Int =
    throw UnsupportedOperationException("switchSem requires manual FFI bridge — not yet implemented")

public actual fun switchSemEtc(semToBeReleased: Int, id: Int, count: Int, flags: UInt, timeout: Long): Int =
    throw UnsupportedOperationException("switchSemEtc requires manual FFI bridge — not yet implemented")

public actual fun getSemCount(id: Int, threadCount: Int?): Int =
    throw UnsupportedOperationException("getSemCount requires manual FFI bridge — not yet implemented")

public actual fun setSemOwner(id: Int, team: Int): Int =
    throw UnsupportedOperationException("setSemOwner requires manual FFI bridge — not yet implemented")

public actual fun getSemInfo(id: Int, info: SemInfo?, infoSize: ULong): Int =
    throw UnsupportedOperationException("getSemInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextSemInfo(team: Int, cookie: Int?, info: SemInfo?, infoSize: ULong): Int =
    throw UnsupportedOperationException("getNextSemInfo requires manual FFI bridge — not yet implemented")

public actual fun killTeam(team: Int): Int =
    throw UnsupportedOperationException("killTeam requires manual FFI bridge — not yet implemented")

public actual fun getTeamInfo(team: Int, info: TeamInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getTeamInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextTeamInfo(cookie: Int?, info: TeamInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getNextTeamInfo requires manual FFI bridge — not yet implemented")

public actual fun killThread(thread: Int): Int =
    throw UnsupportedOperationException("killThread requires manual FFI bridge — not yet implemented")

public actual fun resumeThread(thread: Int): Int =
    throw UnsupportedOperationException("resumeThread requires manual FFI bridge — not yet implemented")

public actual fun suspendThread(thread: Int): Int =
    throw UnsupportedOperationException("suspendThread requires manual FFI bridge — not yet implemented")

public actual fun renameThread(thread: Int, newName: String?): Int =
    throw UnsupportedOperationException("renameThread requires manual FFI bridge — not yet implemented")

public actual fun setThreadPriority(thread: Int, newPriority: Int): Int =
    throw UnsupportedOperationException("setThreadPriority requires manual FFI bridge — not yet implemented")

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: Long, length: Long): Int =
    throw UnsupportedOperationException("suggestThreadPriority requires manual FFI bridge — not yet implemented")

public actual fun exitThread(status: Int): Unit = throw UnsupportedOperationException("exitThread requires manual FFI bridge — not yet implemented")

public actual fun waitForThread(thread: Int, returnValue: Int?): Int =
    throw UnsupportedOperationException("waitForThread requires manual FFI bridge — not yet implemented")

public actual fun getSchedulerMode(): Int =
    throw UnsupportedOperationException("getSchedulerMode requires manual FFI bridge — not yet implemented")

public actual fun setSchedulerMode(mode: Int): Int =
    throw UnsupportedOperationException("setSchedulerMode requires manual FFI bridge — not yet implemented")

public actual fun sendData(thread: Int, code: Int, buffer: COpaquePointer?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("sendData requires manual FFI bridge — not yet implemented")

public actual fun receiveData(sender: Int?, buffer: COpaquePointer?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("receiveData requires manual FFI bridge — not yet implemented")

public actual fun hasData(thread: Int): Boolean =
    throw UnsupportedOperationException("hasData requires manual FFI bridge — not yet implemented")

public actual fun snooze(amount: Long): Int =
    throw UnsupportedOperationException("snooze requires manual FFI bridge — not yet implemented")

public actual fun snoozeEtc(amount: Long, timeBase: Int, flags: UInt): Int =
    throw UnsupportedOperationException("snoozeEtc requires manual FFI bridge — not yet implemented")

public actual fun snoozeUntil(time: Long, timeBase: Int): Int =
    throw UnsupportedOperationException("snoozeUntil requires manual FFI bridge — not yet implemented")

public actual fun getThreadInfo(id: Int, info: ThreadInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getThreadInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextThreadInfo(team: Int, cookie: Int?, info: ThreadInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getNextThreadInfo requires manual FFI bridge — not yet implemented")

public actual fun getTeamUsageInfo(team: Int, who: Int, info: TeamUsageInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getTeamUsageInfo requires manual FFI bridge — not yet implemented")

public actual fun realTimeClock(): ULong =
    throw UnsupportedOperationException("realTimeClock requires manual FFI bridge — not yet implemented")

public actual fun setRealTimeClock(secsSinceJan1st1970: ULong): Unit = throw UnsupportedOperationException("setRealTimeClock requires manual FFI bridge — not yet implemented")

public actual fun debugger(message: String?): Unit = throw UnsupportedOperationException("debugger requires manual FFI bridge — not yet implemented")

public actual fun disableDebugger(state: Int): Int =
    throw UnsupportedOperationException("disableDebugger requires manual FFI bridge — not yet implemented")

public actual fun getSystemInfo(info: SystemInfo?): Int =
    throw UnsupportedOperationException("getSystemInfo requires manual FFI bridge — not yet implemented")

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: CpuInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getCpuInfoEtc requires manual FFI bridge — not yet implemented")

public actual fun getCpuTopologyInfo(topologyInfos: CpuTopologyNodeInfo?, topologyInfoCount: UInt?): Int =
    throw UnsupportedOperationException("getCpuTopologyInfo requires manual FFI bridge — not yet implemented")

public actual fun isComputerOn(): Int =
    throw UnsupportedOperationException("isComputerOn requires manual FFI bridge — not yet implemented")

public actual fun sendSignal(threadID: Int, signal: UInt): Int =
    throw UnsupportedOperationException("sendSignal requires manual FFI bridge — not yet implemented")

public actual fun setSignalStack(base: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("setSignalStack requires manual FFI bridge — not yet implemented")

public actual fun waitForObjects(infos: ObjectWaitInfo?, numInfos: Int): Long =
    throw UnsupportedOperationException("waitForObjects requires manual FFI bridge — not yet implemented")

public actual fun waitForObjectsEtc(infos: ObjectWaitInfo?, numInfos: Int, flags: UInt, timeout: Long): Long =
    throw UnsupportedOperationException("waitForObjectsEtc requires manual FFI bridge — not yet implemented")

public actual fun fsReadAttr(fd: Int, attribute: String?, type: UInt, pos: Long, buffer: COpaquePointer?, readBytes: ULong): Long =
    throw UnsupportedOperationException("fsReadAttr requires manual FFI bridge — not yet implemented")

public actual fun fsWriteAttr(fd: Int, attribute: String?, type: UInt, pos: Long, buffer: COpaquePointer?, writeBytes: ULong): Long =
    throw UnsupportedOperationException("fsWriteAttr requires manual FFI bridge — not yet implemented")

public actual fun fsRemoveAttr(fd: Int, attribute: String?): Int =
    throw UnsupportedOperationException("fsRemoveAttr requires manual FFI bridge — not yet implemented")

public actual fun fsStatAttr(fd: Int, attribute: String?, attrInfo: AttrInfo?): Int =
    throw UnsupportedOperationException("fsStatAttr requires manual FFI bridge — not yet implemented")

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: Int): Int =
    throw UnsupportedOperationException("fsOpenAttr requires manual FFI bridge — not yet implemented")

public actual fun fsFopenAttr(fd: Int, attribute: String?, type: UInt, openMode: Int): Int =
    throw UnsupportedOperationException("fsFopenAttr requires manual FFI bridge — not yet implemented")

public actual fun fsCloseAttr(fd: Int): Int =
    throw UnsupportedOperationException("fsCloseAttr requires manual FFI bridge — not yet implemented")

public actual fun fsOpenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("fsOpenAttrDir requires manual FFI bridge — not yet implemented")

public actual fun fsLopenAttrDir(path: String?): DIR? =
    throw UnsupportedOperationException("fsLopenAttrDir requires manual FFI bridge — not yet implemented")

public actual fun fsFopenAttrDir(fd: Int): DIR? =
    throw UnsupportedOperationException("fsFopenAttrDir requires manual FFI bridge — not yet implemented")

public actual fun fsCloseAttrDir(dir: DIR?): Int =
    throw UnsupportedOperationException("fsCloseAttrDir requires manual FFI bridge — not yet implemented")

public actual fun fsReadAttrDir(dir: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadAttrDir requires manual FFI bridge — not yet implemented")

public actual fun fsRewindAttrDir(dir: DIR?): Unit = throw UnsupportedOperationException("fsRewindAttrDir requires manual FFI bridge — not yet implemented")

public actual fun fsCreateIndex(device: Int, name: String?, type: UInt, flags: UInt): Int =
    throw UnsupportedOperationException("fsCreateIndex requires manual FFI bridge — not yet implemented")

public actual fun fsRemoveIndex(device: Int, name: String?): Int =
    throw UnsupportedOperationException("fsRemoveIndex requires manual FFI bridge — not yet implemented")

public actual fun fsStatIndex(device: Int, name: String?, indexInfo: IndexInfo?): Int =
    throw UnsupportedOperationException("fsStatIndex requires manual FFI bridge — not yet implemented")

public actual fun fsOpenIndexDir(device: Int): DIR? =
    throw UnsupportedOperationException("fsOpenIndexDir requires manual FFI bridge — not yet implemented")

public actual fun fsCloseIndexDir(indexDirectory: DIR?): Int =
    throw UnsupportedOperationException("fsCloseIndexDir requires manual FFI bridge — not yet implemented")

public actual fun fsReadIndexDir(indexDirectory: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadIndexDir requires manual FFI bridge — not yet implemented")

public actual fun fsRewindIndexDir(indexDirectory: DIR?): Unit = throw UnsupportedOperationException("fsRewindIndexDir requires manual FFI bridge — not yet implemented")

public actual fun fsStatDev(dev: Int, info: FsInfo?): Int =
    throw UnsupportedOperationException("fsStatDev requires manual FFI bridge — not yet implemented")

public actual fun fsOpenQuery(device: Int, query: String?, flags: UInt): DIR? =
    throw UnsupportedOperationException("fsOpenQuery requires manual FFI bridge — not yet implemented")

public actual fun fsOpenLiveQuery(device: Int, query: String?, flags: UInt, port: Int, token: Int): DIR? =
    throw UnsupportedOperationException("fsOpenLiveQuery requires manual FFI bridge — not yet implemented")

public actual fun fsCloseQuery(d: DIR?): Int =
    throw UnsupportedOperationException("fsCloseQuery requires manual FFI bridge — not yet implemented")

public actual fun fsReadQuery(d: DIR?): Dirent? =
    throw UnsupportedOperationException("fsReadQuery requires manual FFI bridge — not yet implemented")

public actual fun getPathForDirent(dent: Dirent?, buf: String?, len: ULong): Int =
    throw UnsupportedOperationException("getPathForDirent requires manual FFI bridge — not yet implemented")

public actual fun fsUnmountVolume(path: String?, flags: UInt): Int =
    throw UnsupportedOperationException("fsUnmountVolume requires manual FFI bridge — not yet implemented")

public actual fun unloadAddOn(image: Int): Int =
    throw UnsupportedOperationException("unloadAddOn requires manual FFI bridge — not yet implemented")

public actual fun getImageSymbol(image: Int, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): Int =
    throw UnsupportedOperationException("getImageSymbol requires manual FFI bridge — not yet implemented")

public actual fun getNthImageSymbol(image: Int, n: Int, nameBuffer: String?, nameLength: Int?, symbolType: Int?, symbolLocation: COpaquePointer?): Int =
    throw UnsupportedOperationException("getNthImageSymbol requires manual FFI bridge — not yet implemented")

public actual fun clearCaches(address: COpaquePointer?, length: ULong, flags: UInt): Unit = throw UnsupportedOperationException("clearCaches requires manual FFI bridge — not yet implemented")

public actual fun getImageInfo(image: Int, info: ImageInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getImageInfo requires manual FFI bridge — not yet implemented")

public actual fun getNextImageInfo(team: Int, cookie: Int?, info: ImageInfo?, size: ULong): Int =
    throw UnsupportedOperationException("getNextImageInfo requires manual FFI bridge — not yet implemented")

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: UInt, subPath: String?, pathBuffer: String?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("findPath requires manual FFI bridge — not yet implemented")

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: UInt, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("findPathEtc requires manual FFI bridge — not yet implemented")

public actual fun findPathForPath(path: String?, baseDirectory: UInt, subPath: String?, pathBuffer: String?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("findPathForPath requires manual FFI bridge — not yet implemented")

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: UInt, subPath: String?, flags: UInt, pathBuffer: String?, bufferSize: ULong): Int =
    throw UnsupportedOperationException("findPathForPathEtc requires manual FFI bridge — not yet implemented")

public actual fun findPaths(baseDirectory: UInt, subPath: String?, paths: COpaquePointer?, pathCount: ULong?): Int =
    throw UnsupportedOperationException("findPaths requires manual FFI bridge — not yet implemented")

public actual fun findPathsEtc(architecture: String?, baseDirectory: UInt, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: ULong?): Int =
    throw UnsupportedOperationException("findPathsEtc requires manual FFI bridge — not yet implemented")

public actual fun findDirectory(which: UInt, volume: Int, createIt: Boolean, pathString: String?, length: Int): Int =
    throw UnsupportedOperationException("findDirectory requires manual FFI bridge — not yet implemented")

public actual fun getCpuid(info: CpuidInfo?, eaxRegister: UInt, cpuNum: UInt): Int =
    throw UnsupportedOperationException("getCpuid requires manual FFI bridge — not yet implemented")

public actual fun onExitThread(callback: ((COpaquePointer?) -> Unit)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("onExitThread requires manual FFI bridge — not yet implemented")
