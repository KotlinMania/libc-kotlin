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

private object UnixHaikuNativeJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_haiku_native_createArea(name: String?, startAddress: Long, addressSpec: Int, size: Long, lock: Int, protection: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_cloneArea(name: String?, destAddress: Long, addressSpec: Int, protection: Int, source: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_findArea(name: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_native_areaFor(address: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_deleteArea(id: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_resizeArea(id: Int, newSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_setAreaProtection(id: Int, newProtection: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getAreaInfo(id: Int, areaInfo: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getNextAreaInfo(team: Int, cookie: Long, areaInfo: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_createPort(capacity: Int, name: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_native_findPort(name: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_native_readPort(port: Int, code: Long, buffer: Long, bufferSize: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_native_readPortEtc(port: Int, code: Long, buffer: Long, bufferSize: Long, flags: Int, timeout: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_native_writePort(port: Int, code: Int, buffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_writePortEtc(port: Int, code: Int, buffer: Long, bufferSize: Long, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_closePort(port: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_deletePort(port: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_portBufferSize(port: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_native_portBufferSizeEtc(port: Int, flags: Int, timeout: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_native_portCount(port: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_native_setPortOwner(port: Int, team: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getPortInfo(port: Int, buf: Long, portInfoSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getNextPortInfo(port: Int, cookie: Long, portInfo: Long, portInfoSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getPortMessageInfoEtc(port: Int, info: Long, infoSize: Long, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_createSem(count: Int, name: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_native_deleteSem(id: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_acquireSem(id: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_acquireSemEtc(id: Int, count: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_releaseSem(id: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_releaseSemEtc(id: Int, count: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_switchSem(semToBeReleased: Int, id: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_switchSemEtc(semToBeReleased: Int, id: Int, count: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getSemCount(id: Int, threadCount: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_setSemOwner(id: Int, team: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getSemInfo(id: Int, info: Long, infoSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getNextSemInfo(team: Int, cookie: Long, info: Long, infoSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_killTeam(team: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getTeamInfo(team: Int, info: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getNextTeamInfo(cookie: Long, info: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_spawnThread(func: Long, name: String?, priority: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_killThread(thread: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_resumeThread(thread: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_suspendThread(thread: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_renameThread(thread: Int, newName: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_native_setThreadPriority(thread: Int, newPriority: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_suggestThreadPriority(what: Int, period: Int, jitter: Long, length: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_estimateMaxSchedulingLatency(th: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_native_exitThread(status: Int)

    @JvmStatic
    external fun libc_unix_haiku_native_waitForThread(thread: Int, returnValue: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_onExitThread(callback: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_findThread(name: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getSchedulerMode(): Int

    @JvmStatic
    external fun libc_unix_haiku_native_setSchedulerMode(mode: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_sendData(thread: Int, code: Int, buffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_receiveData(sender: Long, buffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_hasData(thread: Int): Boolean

    @JvmStatic
    external fun libc_unix_haiku_native_snooze(amount: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_snoozeEtc(amount: Long, timeBase: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_snoozeUntil(time: Long, timeBase: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getThreadInfo(id: Int, info: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getNextThreadInfo(team: Int, cookie: Long, info: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getPthreadThreadId(thread: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getTeamUsageInfo(team: Int, who: Int, info: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_realTimeClock(): Long

    @JvmStatic
    external fun libc_unix_haiku_native_setRealTimeClock(secsSinceJan1st1970: Long)

    @JvmStatic
    external fun libc_unix_haiku_native_realTimeClockUsecs(): Long

    @JvmStatic
    external fun libc_unix_haiku_native_systemTime(): Long

    @JvmStatic
    external fun libc_unix_haiku_native_systemTimeNsecs(): Long

    @JvmStatic
    external fun libc_unix_haiku_native_setAlarm(whenBranch: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_native_debugger(message: String?)

    @JvmStatic
    external fun libc_unix_haiku_native_disableDebugger(state: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getSystemInfo(info: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getCpuInfoEtc(firstCPU: Int, cpuCount: Int, info: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getCpuTopologyInfo(topologyInfos: Long, topologyInfoCount: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_isComputerOn(): Int

    @JvmStatic
    external fun libc_unix_haiku_native_isComputerOnFire(): Double

    @JvmStatic
    external fun libc_unix_haiku_native_sendSignal(threadID: Int, signal: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_setSignalStack(base: Long, size: Long)

    @JvmStatic
    external fun libc_unix_haiku_native_waitForObjects(infos: Long, numInfos: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_native_waitForObjectsEtc(infos: Long, numInfos: Int, flags: Int, timeout: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_native_fsReadAttr(fd: Int, attribute: String?, type: Int, pos: Long, buffer: Long, readBytes: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_native_fsWriteAttr(fd: Int, attribute: String?, type: Int, pos: Long, buffer: Long, writeBytes: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_native_fsRemoveAttr(fd: Int, attribute: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsStatAttr(fd: Int, attribute: String?, attrInfo: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsOpenAttr(path: String?, attribute: String?, type: Int, openMode: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsFopenAttr(fd: Int, attribute: String?, type: Int, openMode: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsCloseAttr(fd: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsOpenAttrDir(path: String?): Long

    @JvmStatic
    external fun libc_unix_haiku_native_fsLopenAttrDir(path: String?): Long

    @JvmStatic
    external fun libc_unix_haiku_native_fsFopenAttrDir(fd: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_native_fsCloseAttrDir(dir: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsReadAttrDir(dir: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_native_fsRewindAttrDir(dir: Long)

    @JvmStatic
    external fun libc_unix_haiku_native_fsCreateIndex(device: Int, name: String?, type: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsRemoveIndex(device: Int, name: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsStatIndex(device: Int, name: String?, indexInfo: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsOpenIndexDir(device: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_native_fsCloseIndexDir(indexDirectory: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsReadIndexDir(indexDirectory: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_native_fsRewindIndexDir(indexDirectory: Long)

    @JvmStatic
    external fun libc_unix_haiku_native_devForPath(path: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_native_nextDev(pos: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsStatDev(dev: Int, info: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsOpenQuery(device: Int, query: String?, flags: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_native_fsOpenLiveQuery(device: Int, query: String?, flags: Int, port: Int, token: Int): Long

    @JvmStatic
    external fun libc_unix_haiku_native_fsCloseQuery(d: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsReadQuery(d: Long): Long

    @JvmStatic
    external fun libc_unix_haiku_native_getPathForDirent(dent: Long, buf: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsMountVolume(where: String?, device: String?, filesystem: String?, flags: Int, parameters: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_native_fsUnmountVolume(path: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_loadImage(argc: Int, argv: Long, environ: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_loadAddOn(path: String?): Int

    @JvmStatic
    external fun libc_unix_haiku_native_unloadAddOn(image: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getImageSymbol(image: Int, name: String?, symbolType: Int, symbolLocation: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getNthImageSymbol(image: Int, n: Int, nameBuffer: Long, nameLength: Long, symbolType: Long, symbolLocation: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_clearCaches(address: Long, length: Long, flags: Int)

    @JvmStatic
    external fun libc_unix_haiku_native_getImageInfo(image: Int, info: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getNextImageInfo(team: Int, cookie: Long, info: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_findPath(codePointer: Long, baseDirectory: Int, subPath: String?, pathBuffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_findPathEtc(codePointer: Long, dependency: String?, architecture: String?, baseDirectory: Int, subPath: String?, flags: Int, pathBuffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_findPathForPath(path: String?, baseDirectory: Int, subPath: String?, pathBuffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: Int, subPath: String?, flags: Int, pathBuffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_findPaths(baseDirectory: Int, subPath: String?, paths: Long, pathCount: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_findPathsEtc(architecture: String?, baseDirectory: Int, subPath: String?, flags: Int, paths: Long, pathCount: Long): Int

    @JvmStatic
    external fun libc_unix_haiku_native_findDirectory(which: Int, volume: Int, createIt: Boolean, pathString: Long, length: Int): Int

    @JvmStatic
    external fun libc_unix_haiku_native_getCpuid(info: Long, eaxRegister: Int, cpuNum: Int): Int
}

public actual fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_createArea(name, (startAddress?.value ?: 0L), addressSpec.toInt(), size.toLong(), lock.toInt(), protection.toInt())

public actual fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_cloneArea(name, (destAddress?.value ?: 0L), addressSpec.toInt(), protection.toInt(), source)

public actual fun findArea(name: String?): AreaId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_findArea(name)

public actual fun areaFor(address: COpaquePointer?): AreaId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_areaFor((address?.value ?: 0L))

public actual fun deleteArea(id: AreaId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_deleteArea(id)

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_resizeArea(id, newSize.toLong())

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_setAreaProtection(id, newProtection.toInt())

public actual fun getAreaInfo(id: AreaId, areaInfo: COpaquePointer?, size: ULong): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getAreaInfo(id, (areaInfo?.value ?: 0L), size.toLong())

public actual fun getNextAreaInfo(team: TeamId, cookie: COpaquePointer?, areaInfo: COpaquePointer?, size: ULong): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getNextAreaInfo(team, (cookie?.value ?: 0L), (areaInfo?.value ?: 0L), size.toLong())

public actual fun createPort(capacity: Int, name: String?): PortId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_createPort(capacity, name)

public actual fun findPort(name: String?): PortId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_findPort(name)

public actual fun readPort(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): SsizeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_readPort(port, (code?.value ?: 0L), (buffer?.value ?: 0L), bufferSize.toLong())

public actual fun readPortEtc(port: PortId, code: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_readPortEtc(port, (code?.value ?: 0L), (buffer?.value ?: 0L), bufferSize.toLong(), flags.toInt(), timeout)

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_writePort(port, code, (buffer?.value ?: 0L), bufferSize.toLong())

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_writePortEtc(port, code, (buffer?.value ?: 0L), bufferSize.toLong(), flags.toInt(), timeout)

public actual fun closePort(port: PortId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_closePort(port)

public actual fun deletePort(port: PortId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_deletePort(port)

public actual fun portBufferSize(port: PortId): SsizeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_portBufferSize(port)

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_portBufferSizeEtc(port, flags.toInt(), timeout)

public actual fun portCount(port: PortId): SsizeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_portCount(port)

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_setPortOwner(port, team)

public actual fun getPortInfo(port: PortId, buf: COpaquePointer?, portInfoSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getPortInfo(port, (buf?.value ?: 0L), portInfoSize.toLong())

public actual fun getNextPortInfo(port: PortId, cookie: COpaquePointer?, portInfo: COpaquePointer?, portInfoSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getNextPortInfo(port, (cookie?.value ?: 0L), (portInfo?.value ?: 0L), portInfoSize.toLong())

public actual fun getPortMessageInfoEtc(port: PortId, info: COpaquePointer?, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getPortMessageInfoEtc(port, (info?.value ?: 0L), infoSize.toLong(), flags.toInt(), timeout)

public actual fun createSem(count: Int, name: String?): SemId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_createSem(count, name)

public actual fun deleteSem(id: SemId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_deleteSem(id)

public actual fun acquireSem(id: SemId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_acquireSem(id)

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_acquireSemEtc(id, count, flags.toInt(), timeout)

public actual fun releaseSem(id: SemId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_releaseSem(id)

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_releaseSemEtc(id, count, flags.toInt())

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_switchSem(semToBeReleased, id)

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_switchSemEtc(semToBeReleased, id, count, flags.toInt(), timeout)

public actual fun getSemCount(id: SemId, threadCount: COpaquePointer?): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getSemCount(id, (threadCount?.value ?: 0L))

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_setSemOwner(id, team)

public actual fun getSemInfo(id: SemId, info: COpaquePointer?, infoSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getSemInfo(id, (info?.value ?: 0L), infoSize.toLong())

public actual fun getNextSemInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, infoSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getNextSemInfo(team, (cookie?.value ?: 0L), (info?.value ?: 0L), infoSize.toLong())

public actual fun killTeam(team: TeamId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_killTeam(team)

public actual fun getTeamInfo(team: TeamId, info: COpaquePointer?, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getTeamInfo(team, (info?.value ?: 0L), size.toLong())

public actual fun getNextTeamInfo(cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getNextTeamInfo((cookie?.value ?: 0L), (info?.value ?: 0L), size.toLong())

public actual fun spawnThread(func: ThreadFunc, name: String?, priority: Int, data: COpaquePointer?): ThreadId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_spawnThread(0L, name, priority, (data?.value ?: 0L))

public actual fun killThread(thread: ThreadId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_killThread(thread)

public actual fun resumeThread(thread: ThreadId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_resumeThread(thread)

public actual fun suspendThread(thread: ThreadId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_suspendThread(thread)

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_renameThread(thread, newName)

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_setThreadPriority(thread, newPriority)

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_suggestThreadPriority(what.toInt(), period, jitter, length)

public actual fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_estimateMaxSchedulingLatency(th)

public actual fun exitThread(status: StatusT) {
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_exitThread(status)
}

public actual fun waitForThread(thread: ThreadId, returnValue: COpaquePointer?): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_waitForThread(thread, (returnValue?.value ?: 0L))

public actual fun onExitThread(callback: FnCallback1, data: COpaquePointer?): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_onExitThread(0L, (data?.value ?: 0L))

public actual fun findThread(name: String?): ThreadId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_findThread(name)

public actual fun getSchedulerMode(): Int =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getSchedulerMode()

public actual fun setSchedulerMode(mode: Int): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_setSchedulerMode(mode)

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_sendData(thread, code, (buffer?.value ?: 0L), bufferSize.toLong())

public actual fun receiveData(sender: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT): Int =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_receiveData((sender?.value ?: 0L), (buffer?.value ?: 0L), bufferSize.toLong())

public actual fun hasData(thread: ThreadId): Boolean =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_hasData(thread)

public actual fun snooze(amount: BigtimeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_snooze(amount)

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_snoozeEtc(amount, timeBase, flags.toInt())

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_snoozeUntil(time, timeBase)

public actual fun getThreadInfo(id: ThreadId, info: COpaquePointer?, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getThreadInfo(id, (info?.value ?: 0L), size.toLong())

public actual fun getNextThreadInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getNextThreadInfo(team, (cookie?.value ?: 0L), (info?.value ?: 0L), size.toLong())

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getPthreadThreadId(thread.toLong())

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: COpaquePointer?, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getTeamUsageInfo(team, who, (info?.value ?: 0L), size.toLong())

public actual fun realTimeClock(): CUlong =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_realTimeClock().toULong()

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_setRealTimeClock(secsSinceJan1st1970.toLong())
}

public actual fun realTimeClockUsecs(): BigtimeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_realTimeClockUsecs()

public actual fun systemTime(): BigtimeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_systemTime()

public actual fun systemTimeNsecs(): NanotimeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_systemTimeNsecs()

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_setAlarm(whenBranch, flags.toInt())

public actual fun debugger(message: String?) {
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_debugger(message)
}

public actual fun disableDebugger(state: CInt): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_disableDebugger(state)

public actual fun getSystemInfo(info: COpaquePointer?): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getSystemInfo((info?.value ?: 0L))

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: COpaquePointer?, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getCpuInfoEtc(firstCPU.toInt(), cpuCount.toInt(), (info?.value ?: 0L), size.toLong())

public actual fun getCpuTopologyInfo(topologyInfos: COpaquePointer?, topologyInfoCount: COpaquePointer?): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getCpuTopologyInfo((topologyInfos?.value ?: 0L), (topologyInfoCount?.value ?: 0L))

public actual fun isComputerOn(): Int =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_isComputerOn()

public actual fun isComputerOnFire(): CDouble =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_isComputerOnFire()

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_sendSignal(threadID, signal.toInt())

public actual fun setSignalStack(base: COpaquePointer?, size: SizeT) {
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_setSignalStack((base?.value ?: 0L), size.toLong())
}

public actual fun waitForObjects(infos: COpaquePointer?, numInfos: CInt): SsizeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_waitForObjects((infos?.value ?: 0L), numInfos)

public actual fun waitForObjectsEtc(infos: COpaquePointer?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_waitForObjectsEtc((infos?.value ?: 0L), numInfos, flags.toInt(), timeout)

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: SizeT): SsizeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsReadAttr(fd, attribute, type.toInt(), pos, (buffer?.value ?: 0L), readBytes.toLong())

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: SizeT): SsizeT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsWriteAttr(fd, attribute, type.toInt(), pos, (buffer?.value ?: 0L), writeBytes.toLong())

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsRemoveAttr(fd, attribute)

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: COpaquePointer?): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsStatAttr(fd, attribute, (attrInfo?.value ?: 0L))

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsOpenAttr(path, attribute, type.toInt(), openMode)

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsFopenAttr(fd, attribute, type.toInt(), openMode)

public actual fun fsCloseAttr(fd: CInt): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsCloseAttr(fd)

public actual fun fsOpenAttrDir(path: String?): DIR? =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsOpenAttrDir(path).let { if (it == 0L) null else DIR(it) }

public actual fun fsLopenAttrDir(path: String?): DIR? =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsLopenAttrDir(path).let { if (it == 0L) null else DIR(it) }

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsFopenAttrDir(fd).let { if (it == 0L) null else DIR(it) }

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsCloseAttrDir((dir?.handle ?: 0L))

public actual fun fsReadAttrDir(dir: DIR?): COpaquePointer? =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsReadAttrDir((dir?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRewindAttrDir(dir: DIR?) {
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsRewindAttrDir((dir?.handle ?: 0L))
}

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsCreateIndex(device, name, type.toInt(), flags.toInt())

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsRemoveIndex(device, name)

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: COpaquePointer?): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsStatIndex(device, name, (indexInfo?.value ?: 0L))

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsOpenIndexDir(device).let { if (it == 0L) null else DIR(it) }

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsCloseIndexDir((indexDirectory?.handle ?: 0L))

public actual fun fsReadIndexDir(indexDirectory: DIR?): COpaquePointer? =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsReadIndexDir((indexDirectory?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRewindIndexDir(indexDirectory: DIR?) {
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsRewindIndexDir((indexDirectory?.handle ?: 0L))
}

public actual fun devForPath(path: String?): DevT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_devForPath(path)

public actual fun nextDev(pos: COpaquePointer?): DevT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_nextDev((pos?.value ?: 0L))

public actual fun fsStatDev(dev: DevT, info: COpaquePointer?): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsStatDev(dev, (info?.value ?: 0L))

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsOpenQuery(device, query, flags.toInt()).let { if (it == 0L) null else DIR(it) }

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsOpenLiveQuery(device, query, flags.toInt(), port, token).let { if (it == 0L) null else DIR(it) }

public actual fun fsCloseQuery(d: DIR?): CInt =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsCloseQuery((d?.handle ?: 0L))

public actual fun fsReadQuery(d: DIR?): COpaquePointer? =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsReadQuery((d?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getPathForDirent(dent: COpaquePointer?, buf: COpaquePointer?, len: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getPathForDirent((dent?.value ?: 0L), (buf?.value ?: 0L), len.toLong())

public actual fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): DevT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsMountVolume(where, device, filesystem, flags.toInt(), parameters)

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_fsUnmountVolume(path, flags.toInt())

public actual fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): ThreadId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_loadImage(argc, (argv?.value ?: 0L), (environ?.value ?: 0L))

public actual fun loadAddOn(path: String?): ImageId =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_loadAddOn(path)

public actual fun unloadAddOn(image: ImageId): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_unloadAddOn(image)

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getImageSymbol(image, name, symbolType, (symbolLocation?.value ?: 0L))

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: COpaquePointer?, nameLength: COpaquePointer?, symbolType: COpaquePointer?, symbolLocation: COpaquePointer?): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getNthImageSymbol(image, n, (nameBuffer?.value ?: 0L), (nameLength?.value ?: 0L), (symbolType?.value ?: 0L), (symbolLocation?.value ?: 0L))

public actual fun clearCaches(address: COpaquePointer?, length: SizeT, flags: UInt) {
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_clearCaches((address?.value ?: 0L), length.toLong(), flags.toInt())
}

public actual fun getImageInfo(image: ImageId, info: COpaquePointer?, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getImageInfo(image, (info?.value ?: 0L), size.toLong())

public actual fun getNextImageInfo(team: TeamId, cookie: COpaquePointer?, info: COpaquePointer?, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getNextImageInfo(team, (cookie?.value ?: 0L), (info?.value ?: 0L), size.toLong())

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: ULong): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_findPath((codePointer?.value ?: 0L), baseDirectory, subPath, (pathBuffer?.value ?: 0L), bufferSize.toLong())

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_findPathEtc((codePointer?.value ?: 0L), dependency, architecture, baseDirectory, subPath, flags.toInt(), (pathBuffer?.value ?: 0L), bufferSize.toLong())

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_findPathForPath(path, baseDirectory, subPath, (pathBuffer?.value ?: 0L), bufferSize.toLong())

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_findPathForPathEtc(path, dependency, architecture, baseDirectory, subPath, flags.toInt(), (pathBuffer?.value ?: 0L), bufferSize.toLong())

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_findPaths(baseDirectory, subPath, (paths?.value ?: 0L), (pathCount?.value ?: 0L))

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: COpaquePointer?): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_findPathsEtc(architecture, baseDirectory, subPath, flags.toInt(), (paths?.value ?: 0L), (pathCount?.value ?: 0L))

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: COpaquePointer?, length: Int): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_findDirectory(which, volume, createIt, (pathString?.value ?: 0L), length)

public actual fun getCpuid(info: COpaquePointer?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    UnixHaikuNativeJniBridge.libc_unix_haiku_native_getCpuid((info?.value ?: 0L), eaxRegister.toInt(), cpuNum.toInt())
