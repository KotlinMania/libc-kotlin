@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixHaikuNativeJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "libc_jni.dll"
                "macos" -> "liblibc_jni.dylib"
                else -> "liblibc_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/libc/native/$hostPlatform-$hostArch/$libFileName"
        val stream = UnixHaikuNativeJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("libc_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixHaikuNativeCreateArea(name: Long, startAddress: Long, addressSpec: Int, size: Long, lock: Int, protection: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeCloneArea(name: Long, destAddress: Long, addressSpec: Int, protection: Int, source: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFindArea(name: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeAreaFor(address: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeDeleteArea(id: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeResizeArea(id: Int, newSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSetAreaProtection(id: Int, newProtection: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetAreaInfo(id: Int, areaInfo: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetNextAreaInfo(team: Int, cookie: Long, areaInfo: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeCreatePort(capacity: Int, name: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFindPort(name: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeReadPort(port: Int, code: Long, buffer: Long, bufferSize: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNativeReadPortEtc(port: Int, code: Long, buffer: Long, bufferSize: Long, flags: Int, timeout: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNativeWritePort(port: Int, code: Int, buffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeWritePortEtc(port: Int, code: Int, buffer: Long, bufferSize: Long, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeClosePort(port: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeDeletePort(port: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativePortBufferSize(port: Int): Long

    @JvmStatic
    external fun libcUnixHaikuNativePortBufferSizeEtc(port: Int, flags: Int, timeout: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNativePortCount(port: Int): Long

    @JvmStatic
    external fun libcUnixHaikuNativeSetPortOwner(port: Int, team: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetPortInfo(port: Int, buf: Long, portInfoSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetNextPortInfo(port: Int, cookie: Long, portInfo: Long, portInfoSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetPortMessageInfoEtc(port: Int, info: Long, infoSize: Long, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeCreateSem(count: Int, name: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeDeleteSem(id: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeAcquireSem(id: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeAcquireSemEtc(id: Int, count: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeReleaseSem(id: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeReleaseSemEtc(id: Int, count: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSwitchSem(semToBeReleased: Int, id: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSwitchSemEtc(semToBeReleased: Int, id: Int, count: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetSemCount(id: Int, threadCount: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSetSemOwner(id: Int, team: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetSemInfo(id: Int, info: Long, infoSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetNextSemInfo(team: Int, cookie: Long, info: Long, infoSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeKillTeam(team: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetTeamInfo(team: Int, info: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetNextTeamInfo(cookie: Long, info: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSpawnThread(func: Long, name: Long, priority: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeKillThread(thread: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeResumeThread(thread: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSuspendThread(thread: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeRenameThread(thread: Int, newName: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSetThreadPriority(thread: Int, newPriority: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSuggestThreadPriority(what: Int, period: Int, jitter: Long, length: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeEstimateMaxSchedulingLatency(th: Int): Long

    @JvmStatic
    external fun libcUnixHaikuNativeExitThread(status: Int)

    @JvmStatic
    external fun libcUnixHaikuNativeWaitForThread(thread: Int, returnValue: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeOnExitThread(callback: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFindThread(name: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetSchedulerMode(): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSetSchedulerMode(mode: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSendData(thread: Int, code: Int, buffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeReceiveData(sender: Long, buffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeHasData(thread: Int): Boolean

    @JvmStatic
    external fun libcUnixHaikuNativeSnooze(amount: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSnoozeEtc(amount: Long, timeBase: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSnoozeUntil(time: Long, timeBase: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetThreadInfo(id: Int, info: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetNextThreadInfo(team: Int, cookie: Long, info: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetPthreadThreadId(thread: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetTeamUsageInfo(team: Int, who: Int, info: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeRealTimeClock(): Long

    @JvmStatic
    external fun libcUnixHaikuNativeSetRealTimeClock(secsSinceJan1st1970: Long)

    @JvmStatic
    external fun libcUnixHaikuNativeRealTimeClockUsecs(): Long

    @JvmStatic
    external fun libcUnixHaikuNativeSystemTime(): Long

    @JvmStatic
    external fun libcUnixHaikuNativeSystemTimeNsecs(): Long

    @JvmStatic
    external fun libcUnixHaikuNativeSetAlarm(whenBranch: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixHaikuNativeDebugger(message: Long)

    @JvmStatic
    external fun libcUnixHaikuNativeDisableDebugger(state: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetSystemInfo(info: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetCpuInfoEtc(firstCPU: Int, cpuCount: Int, info: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetCpuTopologyInfo(topologyInfos: Long, topologyInfoCount: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeIsComputerOn(): Int

    @JvmStatic
    external fun libcUnixHaikuNativeIsComputerOnFire(): Double

    @JvmStatic
    external fun libcUnixHaikuNativeSendSignal(threadID: Int, signal: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeSetSignalStack(base: Long, size: Long)

    @JvmStatic
    external fun libcUnixHaikuNativeWaitForObjects(infos: Long, numInfos: Int): Long

    @JvmStatic
    external fun libcUnixHaikuNativeWaitForObjectsEtc(infos: Long, numInfos: Int, flags: Int, timeout: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNativeFsReadAttr(fd: Int, attribute: Long, type: Int, pos: Long, buffer: Long, readBytes: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNativeFsWriteAttr(fd: Int, attribute: Long, type: Int, pos: Long, buffer: Long, writeBytes: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNativeFsRemoveAttr(fd: Int, attribute: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsStatAttr(fd: Int, attribute: Long, attrInfo: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsOpenAttr(path: Long, attribute: Long, type: Int, openMode: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsFopenAttr(fd: Int, attribute: Long, type: Int, openMode: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsCloseAttr(fd: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsOpenAttrDir(path: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNativeFsLopenAttrDir(path: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNativeFsFopenAttrDir(fd: Int): Long

    @JvmStatic
    external fun libcUnixHaikuNativeFsCloseAttrDir(dir: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsReadAttrDir(dir: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNativeFsRewindAttrDir(dir: Long)

    @JvmStatic
    external fun libcUnixHaikuNativeFsCreateIndex(device: Int, name: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsRemoveIndex(device: Int, name: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsStatIndex(device: Int, name: Long, indexInfo: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsOpenIndexDir(device: Int): Long

    @JvmStatic
    external fun libcUnixHaikuNativeFsCloseIndexDir(indexDirectory: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsReadIndexDir(indexDirectory: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNativeFsRewindIndexDir(indexDirectory: Long)

    @JvmStatic
    external fun libcUnixHaikuNativeDevForPath(path: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeNextDev(pos: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsStatDev(dev: Int, info: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsOpenQuery(device: Int, query: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixHaikuNativeFsOpenLiveQuery(device: Int, query: Long, flags: Int, port: Int, token: Int): Long

    @JvmStatic
    external fun libcUnixHaikuNativeFsCloseQuery(d: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsReadQuery(d: Long): Long

    @JvmStatic
    external fun libcUnixHaikuNativeGetPathForDirent(dent: Long, buf: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsMountVolume(where: Long, device: Long, filesystem: Long, flags: Int, parameters: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFsUnmountVolume(path: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeLoadImage(argc: Int, argv: Long, environ: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeLoadAddOn(path: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeUnloadAddOn(image: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetImageSymbol(image: Int, name: Long, symbolType: Int, symbolLocation: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetNthImageSymbol(image: Int, n: Int, nameBuffer: Long, nameLength: Long, symbolType: Long, symbolLocation: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeClearCaches(address: Long, length: Long, flags: Int)

    @JvmStatic
    external fun libcUnixHaikuNativeGetImageInfo(image: Int, info: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetNextImageInfo(team: Int, cookie: Long, info: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFindPath(codePointer: Long, baseDirectory: Int, subPath: Long, pathBuffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFindPathEtc(codePointer: Long, dependency: Long, architecture: Long, baseDirectory: Int, subPath: Long, flags: Int, pathBuffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFindPathForPath(path: Long, baseDirectory: Int, subPath: Long, pathBuffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFindPathForPathEtc(path: Long, dependency: Long, architecture: Long, baseDirectory: Int, subPath: Long, flags: Int, pathBuffer: Long, bufferSize: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFindPaths(baseDirectory: Int, subPath: Long, paths: Long, pathCount: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFindPathsEtc(architecture: Long, baseDirectory: Int, subPath: Long, flags: Int, paths: Long, pathCount: Long): Int

    @JvmStatic
    external fun libcUnixHaikuNativeFindDirectory(which: Int, volume: Int, createIt: Boolean, pathString: Long, length: Int): Int

    @JvmStatic
    external fun libcUnixHaikuNativeGetCpuid(info: Long, eaxRegister: Int, cpuNum: Int): Int
}

public actual fun createArea(name: ConstPtr<CChar>, startAddress: MutPtr<MutPtr<CVoid>>, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeCreateArea(name.rawAddress, startAddress.rawAddress, addressSpec.toInt(), size.toLong(), lock.toInt(), protection.toInt())

public actual fun cloneArea(name: ConstPtr<CChar>, destAddress: MutPtr<MutPtr<CVoid>>, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeCloneArea(name.rawAddress, destAddress.rawAddress, addressSpec.toInt(), protection.toInt(), source)

public actual fun findArea(name: ConstPtr<CChar>): AreaId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFindArea(name.rawAddress)

public actual fun areaFor(address: MutPtr<CVoid>): AreaId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeAreaFor(address.rawAddress)

public actual fun deleteArea(id: AreaId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeDeleteArea(id)

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeResizeArea(id, newSize.toLong())

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSetAreaProtection(id, newProtection.toInt())

public actual fun getAreaInfo(id: AreaId, areaInfo: MutPtr<AreaInfo>, size: ULong): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetAreaInfo(id, areaInfo.rawAddress, size.toLong())

public actual fun getNextAreaInfo(team: TeamId, cookie: MutPtr<Long>, areaInfo: MutPtr<AreaInfo>, size: ULong): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetNextAreaInfo(team, cookie.rawAddress, areaInfo.rawAddress, size.toLong())

public actual fun createPort(capacity: Int, name: ConstPtr<CChar>): PortId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeCreatePort(capacity, name.rawAddress)

public actual fun findPort(name: ConstPtr<CChar>): PortId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFindPort(name.rawAddress)

public actual fun readPort(port: PortId, code: MutPtr<Int>, buffer: MutPtr<CVoid>, bufferSize: SizeT): SsizeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeReadPort(port, code.rawAddress, buffer.rawAddress, bufferSize.toLong())

public actual fun readPortEtc(port: PortId, code: MutPtr<Int>, buffer: MutPtr<CVoid>, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeReadPortEtc(port, code.rawAddress, buffer.rawAddress, bufferSize.toLong(), flags.toInt(), timeout)

public actual fun writePort(port: PortId, code: Int, buffer: ConstPtr<CVoid>, bufferSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeWritePort(port, code, buffer.rawAddress, bufferSize.toLong())

public actual fun writePortEtc(port: PortId, code: Int, buffer: ConstPtr<CVoid>, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeWritePortEtc(port, code, buffer.rawAddress, bufferSize.toLong(), flags.toInt(), timeout)

public actual fun closePort(port: PortId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeClosePort(port)

public actual fun deletePort(port: PortId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeDeletePort(port)

public actual fun portBufferSize(port: PortId): SsizeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativePortBufferSize(port)

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativePortBufferSizeEtc(port, flags.toInt(), timeout)

public actual fun portCount(port: PortId): SsizeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativePortCount(port)

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSetPortOwner(port, team)

public actual fun getPortInfo(port: PortId, buf: MutPtr<PortInfo>, portInfoSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetPortInfo(port, buf.rawAddress, portInfoSize.toLong())

public actual fun getNextPortInfo(port: PortId, cookie: MutPtr<Int>, portInfo: MutPtr<PortInfo>, portInfoSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetNextPortInfo(port, cookie.rawAddress, portInfo.rawAddress, portInfoSize.toLong())

public actual fun getPortMessageInfoEtc(port: PortId, info: MutPtr<PortMessageInfo>, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetPortMessageInfoEtc(port, info.rawAddress, infoSize.toLong(), flags.toInt(), timeout)

public actual fun createSem(count: Int, name: ConstPtr<CChar>): SemId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeCreateSem(count, name.rawAddress)

public actual fun deleteSem(id: SemId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeDeleteSem(id)

public actual fun acquireSem(id: SemId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeAcquireSem(id)

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeAcquireSemEtc(id, count, flags.toInt(), timeout)

public actual fun releaseSem(id: SemId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeReleaseSem(id)

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeReleaseSemEtc(id, count, flags.toInt())

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSwitchSem(semToBeReleased, id)

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSwitchSemEtc(semToBeReleased, id, count, flags.toInt(), timeout)

public actual fun getSemCount(id: SemId, threadCount: MutPtr<Int>): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetSemCount(id, threadCount.rawAddress)

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSetSemOwner(id, team)

public actual fun getSemInfo(id: SemId, info: MutPtr<SemInfo>, infoSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetSemInfo(id, info.rawAddress, infoSize.toLong())

public actual fun getNextSemInfo(team: TeamId, cookie: MutPtr<Int>, info: MutPtr<SemInfo>, infoSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetNextSemInfo(team, cookie.rawAddress, info.rawAddress, infoSize.toLong())

public actual fun killTeam(team: TeamId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeKillTeam(team)

public actual fun getTeamInfo(team: TeamId, info: MutPtr<TeamInfo>, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetTeamInfo(team, info.rawAddress, size.toLong())

public actual fun getNextTeamInfo(cookie: MutPtr<Int>, info: MutPtr<TeamInfo>, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetNextTeamInfo(cookie.rawAddress, info.rawAddress, size.toLong())

public actual fun spawnThread(func: ThreadFunc, name: ConstPtr<CChar>, priority: Int, data: MutPtr<CVoid>): ThreadId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSpawnThread(0L, name.rawAddress, priority, data.rawAddress)

public actual fun killThread(thread: ThreadId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeKillThread(thread)

public actual fun resumeThread(thread: ThreadId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeResumeThread(thread)

public actual fun suspendThread(thread: ThreadId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSuspendThread(thread)

public actual fun renameThread(thread: ThreadId, newName: ConstPtr<CChar>): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeRenameThread(thread, newName.rawAddress)

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSetThreadPriority(thread, newPriority)

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: BigtimeT, length: BigtimeT): Int =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSuggestThreadPriority(what.toInt(), period, jitter, length)

public actual fun estimateMaxSchedulingLatency(th: ThreadId): BigtimeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeEstimateMaxSchedulingLatency(th)

public actual fun exitThread(status: StatusT) {
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeExitThread(status)
}

public actual fun waitForThread(thread: ThreadId, returnValue: MutPtr<StatusT>): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeWaitForThread(thread, returnValue.rawAddress)

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: MutPtr<CVoid>): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeOnExitThread(0L, data.rawAddress)

public actual fun findThread(name: ConstPtr<CChar>): ThreadId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFindThread(name.rawAddress)

public actual fun getSchedulerMode(): Int =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetSchedulerMode()

public actual fun setSchedulerMode(mode: Int): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSetSchedulerMode(mode)

public actual fun sendData(thread: ThreadId, code: Int, buffer: ConstPtr<CVoid>, bufferSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSendData(thread, code, buffer.rawAddress, bufferSize.toLong())

public actual fun receiveData(sender: MutPtr<ThreadId>, buffer: MutPtr<CVoid>, bufferSize: SizeT): Int =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeReceiveData(sender.rawAddress, buffer.rawAddress, bufferSize.toLong())

public actual fun hasData(thread: ThreadId): Boolean =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeHasData(thread)

public actual fun snooze(amount: BigtimeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSnooze(amount)

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSnoozeEtc(amount, timeBase, flags.toInt())

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSnoozeUntil(time, timeBase)

public actual fun getThreadInfo(id: ThreadId, info: MutPtr<ThreadInfo>, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetThreadInfo(id, info.rawAddress, size.toLong())

public actual fun getNextThreadInfo(team: TeamId, cookie: MutPtr<Int>, info: MutPtr<ThreadInfo>, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetNextThreadInfo(team, cookie.rawAddress, info.rawAddress, size.toLong())

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetPthreadThreadId(thread.toLong())

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: MutPtr<TeamUsageInfo>, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetTeamUsageInfo(team, who, info.rawAddress, size.toLong())

public actual fun realTimeClock(): CUlong =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeRealTimeClock().toULong()

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSetRealTimeClock(secsSinceJan1st1970.toLong())
}

public actual fun realTimeClockUsecs(): BigtimeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeRealTimeClockUsecs()

public actual fun systemTime(): BigtimeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSystemTime()

public actual fun systemTimeNsecs(): NanotimeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSystemTimeNsecs()

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSetAlarm(whenBranch, flags.toInt())

public actual fun debugger(message: ConstPtr<CChar>) {
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeDebugger(message.rawAddress)
}

public actual fun disableDebugger(state: CInt): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeDisableDebugger(state)

public actual fun getSystemInfo(info: MutPtr<SystemInfo>): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetSystemInfo(info.rawAddress)

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: MutPtr<CpuInfo>, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetCpuInfoEtc(firstCPU.toInt(), cpuCount.toInt(), info.rawAddress, size.toLong())

public actual fun getCpuTopologyInfo(topologyInfos: MutPtr<CpuTopologyNodeInfo>, topologyInfoCount: MutPtr<UInt>): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetCpuTopologyInfo(topologyInfos.rawAddress, topologyInfoCount.rawAddress)

public actual fun isComputerOn(): Int =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeIsComputerOn()

public actual fun isComputerOnFire(): CDouble =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeIsComputerOnFire()

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSendSignal(threadID, signal.toInt())

public actual fun setSignalStack(base: MutPtr<CVoid>, size: SizeT) {
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeSetSignalStack(base.rawAddress, size.toLong())
}

public actual fun waitForObjects(infos: MutPtr<ObjectWaitInfo>, numInfos: CInt): SsizeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeWaitForObjects(infos.rawAddress, numInfos)

public actual fun waitForObjectsEtc(infos: MutPtr<ObjectWaitInfo>, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeWaitForObjectsEtc(infos.rawAddress, numInfos, flags.toInt(), timeout)

public actual fun fsReadAttr(fd: CInt, attribute: ConstPtr<CChar>, type: UInt, pos: OffT, buffer: MutPtr<CVoid>, readBytes: SizeT): SsizeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsReadAttr(fd, attribute.rawAddress, type.toInt(), pos, buffer.rawAddress, readBytes.toLong())

public actual fun fsWriteAttr(fd: CInt, attribute: ConstPtr<CChar>, type: UInt, pos: OffT, buffer: ConstPtr<CVoid>, writeBytes: SizeT): SsizeT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsWriteAttr(fd, attribute.rawAddress, type.toInt(), pos, buffer.rawAddress, writeBytes.toLong())

public actual fun fsRemoveAttr(fd: CInt, attribute: ConstPtr<CChar>): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsRemoveAttr(fd, attribute.rawAddress)

public actual fun fsStatAttr(fd: CInt, attribute: ConstPtr<CChar>, attrInfo: MutPtr<AttrInfo>): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsStatAttr(fd, attribute.rawAddress, attrInfo.rawAddress)

public actual fun fsOpenAttr(path: ConstPtr<CChar>, attribute: ConstPtr<CChar>, type: UInt, openMode: CInt): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsOpenAttr(path.rawAddress, attribute.rawAddress, type.toInt(), openMode)

public actual fun fsFopenAttr(fd: CInt, attribute: ConstPtr<CChar>, type: UInt, openMode: CInt): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsFopenAttr(fd, attribute.rawAddress, type.toInt(), openMode)

public actual fun fsCloseAttr(fd: CInt): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsCloseAttr(fd)

public actual fun fsOpenAttrDir(path: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsOpenAttrDir(path.rawAddress))

public actual fun fsLopenAttrDir(path: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsLopenAttrDir(path.rawAddress))

public actual fun fsFopenAttrDir(fd: CInt): MutPtr<DIR> =
    MutPtr(UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsFopenAttrDir(fd))

public actual fun fsCloseAttrDir(dir: MutPtr<DIR>): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsCloseAttrDir(dir.rawAddress)

public actual fun fsReadAttrDir(dir: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsReadAttrDir(dir.rawAddress))

public actual fun fsRewindAttrDir(dir: MutPtr<DIR>) {
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsRewindAttrDir(dir.rawAddress)
}

public actual fun fsCreateIndex(device: DevT, name: ConstPtr<CChar>, type: UInt, flags: UInt): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsCreateIndex(device, name.rawAddress, type.toInt(), flags.toInt())

public actual fun fsRemoveIndex(device: DevT, name: ConstPtr<CChar>): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsRemoveIndex(device, name.rawAddress)

public actual fun fsStatIndex(device: DevT, name: ConstPtr<CChar>, indexInfo: MutPtr<IndexInfo>): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsStatIndex(device, name.rawAddress, indexInfo.rawAddress)

public actual fun fsOpenIndexDir(device: DevT): MutPtr<DIR> =
    MutPtr(UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsOpenIndexDir(device))

public actual fun fsCloseIndexDir(indexDirectory: MutPtr<DIR>): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsCloseIndexDir(indexDirectory.rawAddress)

public actual fun fsReadIndexDir(indexDirectory: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsReadIndexDir(indexDirectory.rawAddress))

public actual fun fsRewindIndexDir(indexDirectory: MutPtr<DIR>) {
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsRewindIndexDir(indexDirectory.rawAddress)
}

public actual fun devForPath(path: ConstPtr<CChar>): DevT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeDevForPath(path.rawAddress)

public actual fun nextDev(pos: MutPtr<Int>): DevT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeNextDev(pos.rawAddress)

public actual fun fsStatDev(dev: DevT, info: MutPtr<FsInfo>): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsStatDev(dev, info.rawAddress)

public actual fun fsOpenQuery(device: DevT, query: ConstPtr<CChar>, flags: UInt): MutPtr<DIR> =
    MutPtr(UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsOpenQuery(device, query.rawAddress, flags.toInt()))

public actual fun fsOpenLiveQuery(device: DevT, query: ConstPtr<CChar>, flags: UInt, port: PortId, token: Int): MutPtr<DIR> =
    MutPtr(UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsOpenLiveQuery(device, query.rawAddress, flags.toInt(), port, token))

public actual fun fsCloseQuery(d: MutPtr<DIR>): CInt =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsCloseQuery(d.rawAddress)

public actual fun fsReadQuery(d: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsReadQuery(d.rawAddress))

public actual fun getPathForDirent(dent: MutPtr<Dirent>, buf: MutPtr<CChar>, len: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetPathForDirent(dent.rawAddress, buf.rawAddress, len.toLong())

public actual fun fsMountVolume(where: ConstPtr<CChar>, device: ConstPtr<CChar>, filesystem: ConstPtr<CChar>, flags: UInt, parameters: ConstPtr<CChar>): DevT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsMountVolume(where.rawAddress, device.rawAddress, filesystem.rawAddress, flags.toInt(), parameters.rawAddress)

public actual fun fsUnmountVolume(path: ConstPtr<CChar>, flags: UInt): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFsUnmountVolume(path.rawAddress, flags.toInt())

public actual fun loadImage(argc: Int, argv: MutPtr<ConstPtr<CChar>>, environ: MutPtr<ConstPtr<CChar>>): ThreadId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeLoadImage(argc, argv.rawAddress, environ.rawAddress)

public actual fun loadAddOn(path: ConstPtr<CChar>): ImageId =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeLoadAddOn(path.rawAddress)

public actual fun unloadAddOn(image: ImageId): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeUnloadAddOn(image)

public actual fun getImageSymbol(image: ImageId, name: ConstPtr<CChar>, symbolType: Int, symbolLocation: MutPtr<MutPtr<CVoid>>): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetImageSymbol(image, name.rawAddress, symbolType, symbolLocation.rawAddress)

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: MutPtr<CChar>, nameLength: MutPtr<Int>, symbolType: MutPtr<Int>, symbolLocation: MutPtr<MutPtr<CVoid>>): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetNthImageSymbol(image, n, nameBuffer.rawAddress, nameLength.rawAddress, symbolType.rawAddress, symbolLocation.rawAddress)

public actual fun clearCaches(address: MutPtr<CVoid>, length: SizeT, flags: UInt) {
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeClearCaches(address.rawAddress, length.toLong(), flags.toInt())
}

public actual fun getImageInfo(image: ImageId, info: MutPtr<ImageInfo>, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetImageInfo(image, info.rawAddress, size.toLong())

public actual fun getNextImageInfo(team: TeamId, cookie: MutPtr<Int>, info: MutPtr<ImageInfo>, size: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetNextImageInfo(team, cookie.rawAddress, info.rawAddress, size.toLong())

public actual fun findPath(codePointer: ConstPtr<CVoid>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, pathBuffer: MutPtr<CChar>, bufferSize: ULong): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFindPath(codePointer.rawAddress, baseDirectory, subPath.rawAddress, pathBuffer.rawAddress, bufferSize.toLong())

public actual fun findPathEtc(codePointer: ConstPtr<CVoid>, dependency: ConstPtr<CChar>, architecture: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, flags: UInt, pathBuffer: MutPtr<CChar>, bufferSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFindPathEtc(codePointer.rawAddress, dependency.rawAddress, architecture.rawAddress, baseDirectory, subPath.rawAddress, flags.toInt(), pathBuffer.rawAddress, bufferSize.toLong())

public actual fun findPathForPath(path: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, pathBuffer: MutPtr<CChar>, bufferSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFindPathForPath(path.rawAddress, baseDirectory, subPath.rawAddress, pathBuffer.rawAddress, bufferSize.toLong())

public actual fun findPathForPathEtc(path: ConstPtr<CChar>, dependency: ConstPtr<CChar>, architecture: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, flags: UInt, pathBuffer: MutPtr<CChar>, bufferSize: SizeT): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFindPathForPathEtc(path.rawAddress, dependency.rawAddress, architecture.rawAddress, baseDirectory, subPath.rawAddress, flags.toInt(), pathBuffer.rawAddress, bufferSize.toLong())

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, paths: MutPtr<MutPtr<MutPtr<CChar>>>, pathCount: MutPtr<SizeT>): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFindPaths(baseDirectory, subPath.rawAddress, paths.rawAddress, pathCount.rawAddress)

public actual fun findPathsEtc(architecture: ConstPtr<CChar>, baseDirectory: PathBaseDirectory, subPath: ConstPtr<CChar>, flags: UInt, paths: MutPtr<MutPtr<MutPtr<CChar>>>, pathCount: MutPtr<SizeT>): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFindPathsEtc(architecture.rawAddress, baseDirectory, subPath.rawAddress, flags.toInt(), paths.rawAddress, pathCount.rawAddress)

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: MutPtr<CChar>, length: Int): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeFindDirectory(which, volume, createIt, pathString.rawAddress, length)

public actual fun getCpuid(info: MutPtr<CpuidInfo>, eaxRegister: UInt, cpuNum: UInt): StatusT =
    UnixHaikuNativeJniBridge.libcUnixHaikuNativeGetCpuid(info.rawAddress, eaxRegister.toInt(), cpuNum.toInt())
