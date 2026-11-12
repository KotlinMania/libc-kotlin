@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object PspJniBridge {
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
        val stream = PspJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcPspSceAudioChRelease(channel: Int): Int

    @JvmStatic
    external fun libcPspSceAudioOutput(channel: Int, vol: Int, buf: Long): Int

    @JvmStatic
    external fun libcPspSceAudioOutputBlocking(channel: Int, vol: Int, buf: Long): Int

    @JvmStatic
    external fun libcPspSceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: Long): Int

    @JvmStatic
    external fun libcPspSceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: Long): Int

    @JvmStatic
    external fun libcPspSceAudioGetChannelRestLen(channel: Int): Int

    @JvmStatic
    external fun libcPspSceAudioGetChannelRestLength(channel: Int): Int

    @JvmStatic
    external fun libcPspSceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int

    @JvmStatic
    external fun libcPspSceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int

    @JvmStatic
    external fun libcPspSceAudioOutput2Reserve(sampleCount: Int): Int

    @JvmStatic
    external fun libcPspSceAudioOutput2Release(): Int

    @JvmStatic
    external fun libcPspSceAudioOutput2ChangeLength(sampleCount: Int): Int

    @JvmStatic
    external fun libcPspSceAudioOutput2OutputBlocking(vol: Int, buf: Long): Int

    @JvmStatic
    external fun libcPspSceAudioOutput2GetRestSample(): Int

    @JvmStatic
    external fun libcPspSceAudioSRCChRelease(): Int

    @JvmStatic
    external fun libcPspSceAudioSRCOutputBlocking(vol: Int, buf: Long): Int

    @JvmStatic
    external fun libcPspSceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int

    @JvmStatic
    external fun libcPspSceAudioInputInitEx(params: Long): Int

    @JvmStatic
    external fun libcPspSceAudioGetInputLength(): Int

    @JvmStatic
    external fun libcPspSceAudioWaitInputEnd(): Int

    @JvmStatic
    external fun libcPspSceAudioPollInputEnd(): Int

    @JvmStatic
    external fun libcPspSceAtracGetAtracID(uiCodecType: Int): Int

    @JvmStatic
    external fun libcPspSceAtracSetDataAndGetID(buf: Long, bufsize: Long): Int

    @JvmStatic
    external fun libcPspSceAtracDecodeData(atracId: Int, outSamples: Long, outN: Long, outEnd: Long, outRemainFrame: Long): Int

    @JvmStatic
    external fun libcPspSceAtracGetRemainFrame(atracId: Int, outRemainFrame: Long): Int

    @JvmStatic
    external fun libcPspSceAtracGetStreamDataInfo(atracId: Int, writePointer: Long, availableBytes: Long, readOffset: Long): Int

    @JvmStatic
    external fun libcPspSceAtracAddStreamData(atracId: Int, bytesToAdd: Int): Int

    @JvmStatic
    external fun libcPspSceAtracGetBitrate(atracId: Int, outBitrate: Long): Int

    @JvmStatic
    external fun libcPspSceAtracSetLoopNum(atracId: Int, nloops: Int): Int

    @JvmStatic
    external fun libcPspSceAtracReleaseAtracID(atracId: Int): Int

    @JvmStatic
    external fun libcPspSceAtracGetNextSample(atracId: Int, outN: Long): Int

    @JvmStatic
    external fun libcPspSceAtracGetMaxSample(atracId: Int, outMax: Long): Int

    @JvmStatic
    external fun libcPspSceAtracGetBufferInfoForReseting(atracId: Int, uiSample: Int, pbufferInfo: Long): Int

    @JvmStatic
    external fun libcPspSceAtracGetChannel(atracId: Int, puiChannel: Long): Int

    @JvmStatic
    external fun libcPspSceAtracGetInternalErrorInfo(atracId: Int, piResult: Long): Int

    @JvmStatic
    external fun libcPspSceAtracGetLoopStatus(atracId: Int, piLoopNum: Long, puiLoopStatus: Long): Int

    @JvmStatic
    external fun libcPspSceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: Long): Int

    @JvmStatic
    external fun libcPspSceAtracGetSecondBufferInfo(atracId: Int, puiPosition: Long, puiDataByte: Long): Int

    @JvmStatic
    external fun libcPspSceAtracGetSoundSample(atracId: Int, piEndSample: Long, piLoopStartSample: Long, piLoopEndSample: Long): Int

    @JvmStatic
    external fun libcPspSceAtracResetPlayPosition(atracId: Int, uiSample: Int, uiWriteByteFirstBuf: Int, uiWriteByteSecondBuf: Int): Int

    @JvmStatic
    external fun libcPspSceAtracSetData(atracId: Int, pucBufferAddr: Long, uiBufferByte: Int): Int

    @JvmStatic
    external fun libcPspSceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: Long, uiReadByte: Int, uiBufferByte: Int): Int

    @JvmStatic
    external fun libcPspSceAtracSetHalfwayBufferAndGetID(pucBufferAddr: Long, uiReadByte: Int, uiBufferByte: Int): Int

    @JvmStatic
    external fun libcPspSceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: Long, uiSecondBufferByte: Int): Int

    @JvmStatic
    external fun libcPspSceCtrlSetSamplingCycle(cycle: Int): Int

    @JvmStatic
    external fun libcPspSceCtrlGetSamplingCycle(pcycle: Long): Int

    @JvmStatic
    external fun libcPspSceCtrlGetSamplingMode(pmode: Long): Int

    @JvmStatic
    external fun libcPspSceCtrlPeekBufferPositive(padData: Long, count: Int): Int

    @JvmStatic
    external fun libcPspSceCtrlPeekBufferNegative(padData: Long, count: Int): Int

    @JvmStatic
    external fun libcPspSceCtrlReadBufferPositive(padData: Long, count: Int): Int

    @JvmStatic
    external fun libcPspSceCtrlReadBufferNegative(padData: Long, count: Int): Int

    @JvmStatic
    external fun libcPspSceCtrlPeekLatch(latchData: Long): Int

    @JvmStatic
    external fun libcPspSceCtrlReadLatch(latchData: Long): Int

    @JvmStatic
    external fun libcPspSceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int

    @JvmStatic
    external fun libcPspSceCtrlGetIdleCancelThreshold(idlereset: Long, idleback: Long): Int

    @JvmStatic
    external fun libcPspSceDisplayGetMode(pmode: Long, pwidth: Long, pheight: Long): Int

    @JvmStatic
    external fun libcPspSceDisplayGetVcount(): Int

    @JvmStatic
    external fun libcPspSceDisplayWaitVblank(): Int

    @JvmStatic
    external fun libcPspSceDisplayWaitVblankCB(): Int

    @JvmStatic
    external fun libcPspSceDisplayWaitVblankStart(): Int

    @JvmStatic
    external fun libcPspSceDisplayWaitVblankStartCB(): Int

    @JvmStatic
    external fun libcPspSceDisplayGetAccumulatedHcount(): Int

    @JvmStatic
    external fun libcPspSceDisplayGetCurrentHcount(): Int

    @JvmStatic
    external fun libcPspSceDisplayGetFramePerSec(): Float

    @JvmStatic
    external fun libcPspSceDisplayIsForeground(): Int

    @JvmStatic
    external fun libcPspSceDisplayIsVblank(): Int

    @JvmStatic
    external fun libcPspSceGeEdramGetSize(): Int

    @JvmStatic
    external fun libcPspSceGeEdramGetAddr(): Long

    @JvmStatic
    external fun libcPspSceGeEdramSetAddrTranslation(width: Int): Int

    @JvmStatic
    external fun libcPspSceGeGetCmd(cmd: Int): Int

    @JvmStatic
    external fun libcPspSceGeGetStack(stackId: Int, stack: Long): Int

    @JvmStatic
    external fun libcPspSceGeSaveContext(context: Long): Int

    @JvmStatic
    external fun libcPspSceGeRestoreContext(context: Long): Int

    @JvmStatic
    external fun libcPspSceGeListEnQueue(list: Long, stall: Long, cbid: Int, arg: Long): Int

    @JvmStatic
    external fun libcPspSceGeListEnQueueHead(list: Long, stall: Long, cbid: Int, arg: Long): Int

    @JvmStatic
    external fun libcPspSceGeListDeQueue(qid: Int): Int

    @JvmStatic
    external fun libcPspSceGeListUpdateStallAddr(qid: Int, stall: Long): Int

    @JvmStatic
    external fun libcPspSceGeBreak(mode: Int, pParam: Long): Int

    @JvmStatic
    external fun libcPspSceGeContinue(): Int

    @JvmStatic
    external fun libcPspSceGeSetCallback(cb: Long): Int

    @JvmStatic
    external fun libcPspSceGeUnsetCallback(cbid: Int): Int

    @JvmStatic
    external fun libcPspSceKernelExitGame()

    @JvmStatic
    external fun libcPspSceKernelLoadExec(file: Long, param: Long): Int

    @JvmStatic
    external fun libcPspSceKernelTotalFreeMemSize(): Long

    @JvmStatic
    external fun libcPspSceKernelMaxFreeMemSize(): Long

    @JvmStatic
    external fun libcPspSceKernelDevkitVersion(): Int

    @JvmStatic
    external fun libcPspSceKernelSetCompiledSdkVersion(version: Int): Int

    @JvmStatic
    external fun libcPspSceKernelGetCompiledSdkVersion(): Int

    @JvmStatic
    external fun libcPspSceKernelLibcTime(t: Long): Int

    @JvmStatic
    external fun libcPspSceKernelLibcClock(): Int

    @JvmStatic
    external fun libcPspSceKernelLibcGettimeofday(tp: Long, tzp: Long): Int

    @JvmStatic
    external fun libcPspSceKernelDcacheWritebackAll()

    @JvmStatic
    external fun libcPspSceKernelDcacheWritebackInvalidateAll()

    @JvmStatic
    external fun libcPspSceKernelDcacheWritebackRange(p: Long, size: Int)

    @JvmStatic
    external fun libcPspSceKernelDcacheWritebackInvalidateRange(p: Long, size: Int)

    @JvmStatic
    external fun libcPspSceKernelDcacheInvalidateRange(p: Long, size: Int)

    @JvmStatic
    external fun libcPspSceKernelIcacheInvalidateAll()

    @JvmStatic
    external fun libcPspSceKernelIcacheInvalidateRange(p: Long, size: Int)

    @JvmStatic
    external fun libcPspSceKernelUtilsMt19937Init(ctx: Long, seed: Int): Int

    @JvmStatic
    external fun libcPspSceKernelUtilsMt19937UInt(ctx: Long): Int

    @JvmStatic
    external fun libcPspSceKernelUtilsMd5Digest(data: Long, size: Int, digest: Long): Int

    @JvmStatic
    external fun libcPspSceKernelUtilsMd5BlockInit(ctx: Long): Int

    @JvmStatic
    external fun libcPspSceKernelUtilsMd5BlockUpdate(ctx: Long, data: Long, size: Int): Int

    @JvmStatic
    external fun libcPspSceKernelUtilsMd5BlockResult(ctx: Long, digest: Long): Int

    @JvmStatic
    external fun libcPspSceKernelUtilsSha1Digest(data: Long, size: Int, digest: Long): Int

    @JvmStatic
    external fun libcPspSceKernelUtilsSha1BlockInit(ctx: Long): Int

    @JvmStatic
    external fun libcPspSceKernelUtilsSha1BlockUpdate(ctx: Long, data: Long, size: Int): Int

    @JvmStatic
    external fun libcPspSceKernelUtilsSha1BlockResult(ctx: Long, digest: Long): Int

    @JvmStatic
    external fun libcPspSceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: Long, arg: Long): Int

    @JvmStatic
    external fun libcPspSceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int

    @JvmStatic
    external fun libcPspSceKernelEnableSubIntr(intNo: Int, no: Int): Int

    @JvmStatic
    external fun libcPspSceKernelDisableSubIntr(intNo: Int, no: Int): Int

    @JvmStatic
    external fun libcPspSceKernelCpuSuspendIntr(): Int

    @JvmStatic
    external fun libcPspSceKernelCpuResumeIntr(flags: Int)

    @JvmStatic
    external fun libcPspSceKernelCpuResumeIntrWithSync(flags: Int)

    @JvmStatic
    external fun libcPspSceKernelIsCpuIntrSuspended(flags: Int): Int

    @JvmStatic
    external fun libcPspSceKernelIsCpuIntrEnable(): Int

    @JvmStatic
    external fun libcPspSceKernelSelfStopUnloadModule(unknown: Int, argSize: Long, argp: Long): Int

    @JvmStatic
    external fun libcPspSceKernelStopUnloadSelfModule(argSize: Long, argp: Long, status: Long, option: Long): Int

    @JvmStatic
    external fun libcPspSceKernelGetModuleIdList(readBuf: Long, readBufSize: Int, idCount: Long): Int

    @JvmStatic
    external fun libcPspSceKernelVolatileMemLock(unk: Int, ptr: Long, size: Long): Int

    @JvmStatic
    external fun libcPspSceKernelVolatileMemTryLock(unk: Int, ptr: Long, size: Long): Int

    @JvmStatic
    external fun libcPspSceKernelVolatileMemUnlock(unk: Int): Int

    @JvmStatic
    external fun libcPspSceKernelExitThread(status: Int): Int

    @JvmStatic
    external fun libcPspSceKernelExitDeleteThread(status: Int): Int

    @JvmStatic
    external fun libcPspSceKernelSuspendDispatchThread(): Int

    @JvmStatic
    external fun libcPspSceKernelResumeDispatchThread(state: Int): Int

    @JvmStatic
    external fun libcPspSceKernelSleepThread(): Int

    @JvmStatic
    external fun libcPspSceKernelSleepThreadCB(): Int

    @JvmStatic
    external fun libcPspSceKernelDelayThread(delay: Int): Int

    @JvmStatic
    external fun libcPspSceKernelDelayThreadCB(delay: Int): Int

    @JvmStatic
    external fun libcPspSceKernelDelaySysClockThread(delay: Long): Int

    @JvmStatic
    external fun libcPspSceKernelDelaySysClockThreadCB(delay: Long): Int

    @JvmStatic
    external fun libcPspSceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int

    @JvmStatic
    external fun libcPspSceKernelRotateThreadReadyQueue(priority: Int): Int

    @JvmStatic
    external fun libcPspSceKernelGetThreadId(): Int

    @JvmStatic
    external fun libcPspSceKernelGetThreadCurrentPriority(): Int

    @JvmStatic
    external fun libcPspSceKernelCheckThreadStack(): Int

    @JvmStatic
    external fun libcPspSceKernelCheckCallback(): Int

    @JvmStatic
    external fun libcPspSceKernelReferSystemStatus(status: Long): Int

    @JvmStatic
    external fun libcPspSceKernelCreateFpl(name: Long, part: Int, attr: Int, size: Int, blocks: Int, opt: Long): Int

    @JvmStatic
    external fun libcPspSceKernelUSec2SysClock(usec: Int, clock: Long): Int

    @JvmStatic
    external fun libcPspSceKernelUSec2SysClockWide(usec: Int): Long

    @JvmStatic
    external fun libcPspSceKernelSysClock2USec(clock: Long, low: Long, high: Long): Int

    @JvmStatic
    external fun libcPspSceKernelSysClock2USecWide(clock: Long, low: Long, high: Long): Int

    @JvmStatic
    external fun libcPspSceKernelGetSystemTime(time: Long): Int

    @JvmStatic
    external fun libcPspSceKernelGetSystemTimeWide(): Long

    @JvmStatic
    external fun libcPspSceKernelGetSystemTimeLow(): Int

    @JvmStatic
    external fun libcPspSceKernelReferThreadProfiler(): Long

    @JvmStatic
    external fun libcPspSceKernelReferGlobalProfiler(): Long

    @JvmStatic
    external fun libcPspSceUsbStart(driverName: Long, size: Int, args: Long): Int

    @JvmStatic
    external fun libcPspSceUsbStop(driverName: Long, size: Int, args: Long): Int

    @JvmStatic
    external fun libcPspSceUsbActivate(pid: Int): Int

    @JvmStatic
    external fun libcPspSceUsbDeactivate(pid: Int): Int

    @JvmStatic
    external fun libcPspSceUsbGetState(): Int

    @JvmStatic
    external fun libcPspSceUsbGetDrvState(driverName: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamSetupStill(param: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamSetupStillEx(param: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamStillInputBlocking(buf: Long, size: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamStillInput(buf: Long, size: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamStillWaitInputEnd(): Int

    @JvmStatic
    external fun libcPspSceUsbCamStillPollInputEnd(): Int

    @JvmStatic
    external fun libcPspSceUsbCamStillCancelInput(): Int

    @JvmStatic
    external fun libcPspSceUsbCamStillGetInputLength(): Int

    @JvmStatic
    external fun libcPspSceUsbCamSetupVideo(param: Long, workArea: Long, workAreaSize: Int): Int

    @JvmStatic
    external fun libcPspSceUsbCamSetupVideoEx(param: Long, workArea: Long, workAreaSize: Int): Int

    @JvmStatic
    external fun libcPspSceUsbCamStartVideo(): Int

    @JvmStatic
    external fun libcPspSceUsbCamStopVideo(): Int

    @JvmStatic
    external fun libcPspSceUsbCamReadVideoFrameBlocking(buf: Long, size: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamReadVideoFrame(buf: Long, size: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamWaitReadVideoFrameEnd(): Int

    @JvmStatic
    external fun libcPspSceUsbCamPollReadVideoFrameEnd(): Int

    @JvmStatic
    external fun libcPspSceUsbCamGetReadVideoFrameSize(): Int

    @JvmStatic
    external fun libcPspSceUsbCamSetSaturation(saturation: Int): Int

    @JvmStatic
    external fun libcPspSceUsbCamSetBrightness(brightness: Int): Int

    @JvmStatic
    external fun libcPspSceUsbCamSetContrast(contrast: Int): Int

    @JvmStatic
    external fun libcPspSceUsbCamSetSharpness(sharpness: Int): Int

    @JvmStatic
    external fun libcPspSceUsbCamSetReverseMode(reverseFlags: Int): Int

    @JvmStatic
    external fun libcPspSceUsbCamSetZoom(zoom: Int): Int

    @JvmStatic
    external fun libcPspSceUsbCamGetSaturation(saturation: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamGetBrightness(brightness: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamGetContrast(contrast: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamGetSharpness(sharpness: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamGetImageEffectMode(effectMode: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamGetEvLevel(exposureLevel: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamGetReverseMode(reverseFlags: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamGetZoom(zoom: Long): Int

    @JvmStatic
    external fun libcPspSceUsbCamAutoImageReverseSW(on: Int): Int

    @JvmStatic
    external fun libcPspSceUsbCamGetAutoImageReverseState(): Int

    @JvmStatic
    external fun libcPspSceUsbCamGetLensDirection(): Int

    @JvmStatic
    external fun libcPspSceUsbstorBootUnregisterNotify(eventFlag: Int): Int

    @JvmStatic
    external fun libcPspSceUsbstorBootSetCapacity(size: Int): Int

    @JvmStatic
    external fun libcPspScePowerUnregisterCallback(slot: Int): Int

    @JvmStatic
    external fun libcPspScePowerIsPowerOnline(): Int

    @JvmStatic
    external fun libcPspScePowerIsBatteryExist(): Int

    @JvmStatic
    external fun libcPspScePowerIsBatteryCharging(): Int

    @JvmStatic
    external fun libcPspScePowerGetBatteryChargingStatus(): Int

    @JvmStatic
    external fun libcPspScePowerIsLowBattery(): Int

    @JvmStatic
    external fun libcPspScePowerGetBatteryLifePercent(): Int

    @JvmStatic
    external fun libcPspScePowerGetBatteryLifeTime(): Int

    @JvmStatic
    external fun libcPspScePowerGetBatteryTemp(): Int

    @JvmStatic
    external fun libcPspScePowerGetBatteryElec(): Int

    @JvmStatic
    external fun libcPspScePowerGetBatteryVolt(): Int

    @JvmStatic
    external fun libcPspScePowerSetCpuClockFrequency(cpufreq: Int): Int

    @JvmStatic
    external fun libcPspScePowerSetBusClockFrequency(busfreq: Int): Int

    @JvmStatic
    external fun libcPspScePowerGetCpuClockFrequency(): Int

    @JvmStatic
    external fun libcPspScePowerGetCpuClockFrequencyInt(): Int

    @JvmStatic
    external fun libcPspScePowerGetCpuClockFrequencyFloat(): Float

    @JvmStatic
    external fun libcPspScePowerGetBusClockFrequency(): Int

    @JvmStatic
    external fun libcPspScePowerGetBusClockFrequencyInt(): Int

    @JvmStatic
    external fun libcPspScePowerGetBusClockFrequencyFloat(): Float

    @JvmStatic
    external fun libcPspScePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int

    @JvmStatic
    external fun libcPspScePowerLock(unknown: Int): Int

    @JvmStatic
    external fun libcPspScePowerUnlock(unknown: Int): Int

    @JvmStatic
    external fun libcPspScePowerGetIdleTimer(): Int

    @JvmStatic
    external fun libcPspScePowerIdleTimerEnable(unknown: Int): Int

    @JvmStatic
    external fun libcPspScePowerIdleTimerDisable(unknown: Int): Int

    @JvmStatic
    external fun libcPspScePowerRequestStandby(): Int

    @JvmStatic
    external fun libcPspScePowerRequestSuspend(): Int

    @JvmStatic
    external fun libcPspSceWlanDevIsPowerOn(): Int

    @JvmStatic
    external fun libcPspSceWlanGetSwitchState(): Int

    @JvmStatic
    external fun libcPspSceWlanGetEtherAddr(etherAddr: Long): Int

    @JvmStatic
    external fun libcPspSceWlanDevAttach(): Int

    @JvmStatic
    external fun libcPspSceWlanDevDetach(): Int

    @JvmStatic
    external fun libcPspSceRtcGetTickResolution(): Int

    @JvmStatic
    external fun libcPspSceRtcGetCurrentTick(tick: Long): Int

    @JvmStatic
    external fun libcPspSceRtcGetCurrentClock(tm: Long, tz: Int): Int

    @JvmStatic
    external fun libcPspSceRtcGetCurrentClockLocalTime(tm: Long): Int

    @JvmStatic
    external fun libcPspSceRtcConvertUtcToLocalTime(tickUtc: Long, tickLocal: Long): Int

    @JvmStatic
    external fun libcPspSceRtcConvertLocalTimeToUTC(tickLocal: Long, tickUtc: Long): Int

    @JvmStatic
    external fun libcPspSceRtcIsLeapYear(year: Int): Int

    @JvmStatic
    external fun libcPspSceRtcGetDaysInMonth(year: Int, month: Int): Int

    @JvmStatic
    external fun libcPspSceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int

    @JvmStatic
    external fun libcPspSceRtcCheckValid(date: Long): Int

    @JvmStatic
    external fun libcPspSceRtcSetTick(date: Long, tick: Long): Int

    @JvmStatic
    external fun libcPspSceRtcGetTick(date: Long, tick: Long): Int

    @JvmStatic
    external fun libcPspSceRtcCompareTick(tick1: Long, tick2: Long): Int

    @JvmStatic
    external fun libcPspSceRtcTickAddTicks(destTick: Long, srcTick: Long, numTicks: Long): Int

    @JvmStatic
    external fun libcPspSceRtcTickAddMicroseconds(destTick: Long, srcTick: Long, numMs: Long): Int

    @JvmStatic
    external fun libcPspSceRtcTickAddSeconds(destTick: Long, srcTick: Long, numSeconds: Long): Int

    @JvmStatic
    external fun libcPspSceRtcTickAddMinutes(destTick: Long, srcTick: Long, numMinutes: Long): Int

    @JvmStatic
    external fun libcPspSceRtcTickAddHours(destTick: Long, srcTick: Long, numHours: Long): Int

    @JvmStatic
    external fun libcPspSceRtcTickAddDays(destTick: Long, srcTick: Long, numDays: Long): Int

    @JvmStatic
    external fun libcPspSceRtcTickAddWeeks(destTick: Long, srcTick: Long, numWeeks: Long): Int

    @JvmStatic
    external fun libcPspSceRtcTickAddMonths(destTick: Long, srcTick: Long, numMonths: Long): Int

    @JvmStatic
    external fun libcPspSceRtcTickAddYears(destTick: Long, srcTick: Long, numYears: Long): Int

    @JvmStatic
    external fun libcPspSceRtcSetTimeT(date: Long, time: Int): Int

    @JvmStatic
    external fun libcPspSceRtcGetTimeT(date: Long, time: Long): Int

    @JvmStatic
    external fun libcPspSceRtcSetTime64T(date: Long, time: Long): Int

    @JvmStatic
    external fun libcPspSceRtcGetTime64T(date: Long, time: Long): Int

    @JvmStatic
    external fun libcPspSceRtcSetDosTime(date: Long, dosTime: Int): Int

    @JvmStatic
    external fun libcPspSceRtcGetDosTime(date: Long, dosTime: Int): Int

    @JvmStatic
    external fun libcPspSceRtcSetWin32FileTime(date: Long, time: Long): Int

    @JvmStatic
    external fun libcPspSceRtcGetWin32FileTime(date: Long, time: Long): Int

    @JvmStatic
    external fun libcPspSceRtcParseDateTime(destTick: Long, dateString: Long): Int

    @JvmStatic
    external fun libcPspSceRtcFormatRFC3339(pszDateTime: Long, pUtc: Long, timeZoneMinutes: Int): Int

    @JvmStatic
    external fun libcPspSceRtcFormatRFC3339LocalTime(pszDateTime: Long, pUtc: Long): Int

    @JvmStatic
    external fun libcPspSceRtcParseRFC3339(pUtc: Long, pszDateTime: Long): Int

    @JvmStatic
    external fun libcPspSceRtcFormatRFC2822(pszDateTime: Long, pUtc: Long, timeZoneMinutes: Int): Int

    @JvmStatic
    external fun libcPspSceRtcFormatRFC2822LocalTime(pszDateTime: Long, pUtc: Long): Int

    @JvmStatic
    external fun libcPspSceIoRemove(file: Long): Int

    @JvmStatic
    external fun libcPspSceIoMkdir(dir: Long, mode: Int): Int

    @JvmStatic
    external fun libcPspSceIoRmdir(path: Long): Int

    @JvmStatic
    external fun libcPspSceIoChdir(path: Long): Int

    @JvmStatic
    external fun libcPspSceIoRename(oldname: Long, newname: Long): Int

    @JvmStatic
    external fun libcPspSceIoDevctl(dev: Long, cmd: Int, indata: Long, inlen: Int, outdata: Long, outlen: Int): Int

    @JvmStatic
    external fun libcPspSceIoUnassign(dev: Long): Int

    @JvmStatic
    external fun libcPspSceIoGetstat(file: Long, stat: Long): Int

    @JvmStatic
    external fun libcPspSceIoChstat(file: Long, stat: Long, bits: Int): Int

    @JvmStatic
    external fun libcPspSceIoSync(device: Long, unk: Int): Int

    @JvmStatic
    external fun libcPspSceJpegInitMJpeg(): Int

    @JvmStatic
    external fun libcPspSceJpegFinishMJpeg(): Int

    @JvmStatic
    external fun libcPspSceJpegCreateMJpeg(width: Int, height: Int): Int

    @JvmStatic
    external fun libcPspSceJpegDeleteMJpeg(): Int

    @JvmStatic
    external fun libcPspSceJpegDecodeMJpeg(jpegBuf: Long, size: Long, rgba: Long, unk: Int): Int

    @JvmStatic
    external fun libcPspSceUmdCheckMedium(): Int

    @JvmStatic
    external fun libcPspSceUmdGetDiscInfo(info: Long): Int

    @JvmStatic
    external fun libcPspSceUmdActivate(unit: Int, drive: Long): Int

    @JvmStatic
    external fun libcPspSceUmdDeactivate(unit: Int, drive: Long): Int

    @JvmStatic
    external fun libcPspSceUmdWaitDriveStat(state: Int): Int

    @JvmStatic
    external fun libcPspSceUmdWaitDriveStatWithTimer(state: Int, timeout: Int): Int

    @JvmStatic
    external fun libcPspSceUmdWaitDriveStatCB(state: Int, timeout: Int): Int

    @JvmStatic
    external fun libcPspSceUmdCancelWaitDriveStat(): Int

    @JvmStatic
    external fun libcPspSceUmdGetDriveStat(): Int

    @JvmStatic
    external fun libcPspSceUmdGetErrorStat(): Int

    @JvmStatic
    external fun libcPspSceUmdRegisterUMDCallBack(cbid: Int): Int

    @JvmStatic
    external fun libcPspSceUmdUnRegisterUMDCallBack(cbid: Int): Int

    @JvmStatic
    external fun libcPspSceUmdReplacePermit(): Int

    @JvmStatic
    external fun libcPspSceUmdReplaceProhibit(): Int

    @JvmStatic
    external fun libcPspSceMpegInit(): Int

    @JvmStatic
    external fun libcPspSceMpegFinish()

    @JvmStatic
    external fun libcPspSceMpegRingbufferQueryMemSize(packets: Int): Int

    @JvmStatic
    external fun libcPspSceMpegRingbufferConstruct(ringbuffer: Long, packets: Int, data: Long, size: Int, callback: Long, cbParam: Long): Int

    @JvmStatic
    external fun libcPspSceMpegRingbufferDestruct(ringbuffer: Long)

    @JvmStatic
    external fun libcPspSceMpegRingbufferAvailableSize(ringbuffer: Long): Int

    @JvmStatic
    external fun libcPspSceMpegRingbufferPut(ringbuffer: Long, numPackets: Int, available: Int): Int

    @JvmStatic
    external fun libcPspSceMpegQueryMemSize(unk: Int): Int

    @JvmStatic
    external fun libcPspSceMpegQueryStreamSize(buffer: Long, size: Long): Int

    @JvmStatic
    external fun libcPspSceMpegBaseYCrCbCopyVme(yuvBuffer: Long, buffer: Long, type: Int): Int

    @JvmStatic
    external fun libcPspSceMpegBaseCscInit(width: Int): Int

    @JvmStatic
    external fun libcPspSceMpegBaseCscVme(rgbBuffer: Long, rgbBuffer2: Long, width: Int, yCrCbBuffer: Long): Int

    @JvmStatic
    external fun libcPspSceMpegbaseBea18f91(lli: Long): Int

    @JvmStatic
    external fun libcPspSceHprmPeekCurrentKey(key: Long): Int

    @JvmStatic
    external fun libcPspSceHprmPeekLatch(latch: Long): Int

    @JvmStatic
    external fun libcPspSceHprmReadLatch(latch: Long): Int

    @JvmStatic
    external fun libcPspSceHprmIsHeadphoneExist(): Int

    @JvmStatic
    external fun libcPspSceHprmIsRemoteExist(): Int

    @JvmStatic
    external fun libcPspSceHprmIsMicrophoneExist(): Int

    @JvmStatic
    external fun libcPspSceGuDepthBuffer(zbp: Long, zbw: Int)

    @JvmStatic
    external fun libcPspSceGuDispBuffer(width: Int, height: Int, dispbp: Long, dispbw: Int)

    @JvmStatic
    external fun libcPspSceGuDisplay(state: Boolean): Boolean

    @JvmStatic
    external fun libcPspSceGuDepthMask(mask: Int)

    @JvmStatic
    external fun libcPspSceGuDepthOffset(offset: Int)

    @JvmStatic
    external fun libcPspSceGuDepthRange(near: Int, far: Int)

    @JvmStatic
    external fun libcPspSceGuFog(near: Float, far: Float, color: Int)

    @JvmStatic
    external fun libcPspSceGuInit()

    @JvmStatic
    external fun libcPspSceGuTerm()

    @JvmStatic
    external fun libcPspSceGuBreak(mode: Int)

    @JvmStatic
    external fun libcPspSceGuContinue()

    @JvmStatic
    external fun libcPspSceGuGetMemory(size: Int): Long

    @JvmStatic
    external fun libcPspSceGuFinish(): Int

    @JvmStatic
    external fun libcPspSceGuFinishId(id: Int): Int

    @JvmStatic
    external fun libcPspSceGuCallList(list: Long)

    @JvmStatic
    external fun libcPspSceGuCallMode(mode: Int)

    @JvmStatic
    external fun libcPspSceGuCheckList(): Int

    @JvmStatic
    external fun libcPspSceGuSwapBuffers(): Long

    @JvmStatic
    external fun libcPspSceGuBeginObject(vtype: Int, count: Int, indices: Long, vertices: Long)

    @JvmStatic
    external fun libcPspSceGuEndObject()

    @JvmStatic
    external fun libcPspSceGuSetAllStatus(status: Int)

    @JvmStatic
    external fun libcPspSceGuGetAllStatus(): Int

    @JvmStatic
    external fun libcPspSceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float)

    @JvmStatic
    external fun libcPspSceGuLightColor(light: Int, component: Int, color: Int)

    @JvmStatic
    external fun libcPspSceGuClear(flags: Int)

    @JvmStatic
    external fun libcPspSceGuClearColor(color: Int)

    @JvmStatic
    external fun libcPspSceGuClearDepth(depth: Int)

    @JvmStatic
    external fun libcPspSceGuClearStencil(stencil: Int)

    @JvmStatic
    external fun libcPspSceGuPixelMask(mask: Int)

    @JvmStatic
    external fun libcPspSceGuColor(color: Int)

    @JvmStatic
    external fun libcPspSceGuColorMaterial(components: Int)

    @JvmStatic
    external fun libcPspSceGuAmbient(color: Int)

    @JvmStatic
    external fun libcPspSceGuAmbientColor(color: Int)

    @JvmStatic
    external fun libcPspSceGuMaterial(components: Int, color: Int)

    @JvmStatic
    external fun libcPspSceGuModelColor(emissive: Int, ambient: Int, diffuse: Int, specular: Int)

    @JvmStatic
    external fun libcPspSceGuSpecular(power: Float)

    @JvmStatic
    external fun libcPspSceGuTexEnvColor(color: Int)

    @JvmStatic
    external fun libcPspSceGuTexFlush()

    @JvmStatic
    external fun libcPspSceGuTexOffset(u: Float, v: Float)

    @JvmStatic
    external fun libcPspSceGuTexScale(u: Float, v: Float)

    @JvmStatic
    external fun libcPspSceGuTexSlope(slope: Float)

    @JvmStatic
    external fun libcPspSceGuTexSync()

    @JvmStatic
    external fun libcPspSceGuClutLoad(numBlocks: Int, cbp: Long)

    @JvmStatic
    external fun libcPspSceGuOffset(x: Int, y: Int)

    @JvmStatic
    external fun libcPspSceGuScissor(x: Int, y: Int, w: Int, h: Int)

    @JvmStatic
    external fun libcPspSceGuViewport(cx: Int, cy: Int, width: Int, height: Int)

    @JvmStatic
    external fun libcPspSceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: Long, vertices: Long)

    @JvmStatic
    external fun libcPspSceGuPatchDivide(ulevel: Int, vlevel: Int)

    @JvmStatic
    external fun libcPspSceGuPatchFrontFace(a0: Int)

    @JvmStatic
    external fun libcPspSceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: Long, vertices: Long)

    @JvmStatic
    external fun libcPspSceGuMorphWeight(index: Int, weight: Float)

    @JvmStatic
    external fun libcPspSceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: Long, vertices: Long)

    @JvmStatic
    external fun libcPspSceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: Long, vertices: Long)

    @JvmStatic
    external fun libcPspSceGumFastInverse()

    @JvmStatic
    external fun libcPspSceGumFullInverse()

    @JvmStatic
    external fun libcPspSceGumLoadIdentity()

    @JvmStatic
    external fun libcPspSceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float)

    @JvmStatic
    external fun libcPspSceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float)

    @JvmStatic
    external fun libcPspSceGumPopMatrix()

    @JvmStatic
    external fun libcPspSceGumPushMatrix()

    @JvmStatic
    external fun libcPspSceGumRotateX(angle: Float)

    @JvmStatic
    external fun libcPspSceGumRotateY(angle: Float)

    @JvmStatic
    external fun libcPspSceGumRotateZ(angle: Float)

    @JvmStatic
    external fun libcPspSceGumUpdateMatrix()

    @JvmStatic
    external fun libcPspSceMp3ReserveMp3Handle(args: Long): Int

    @JvmStatic
    external fun libcPspSceMp3InitResource(): Int

    @JvmStatic
    external fun libcPspSceMp3TermResource(): Int

    @JvmStatic
    external fun libcPspSceRegOpenRegistry(reg: Long, mode: Int, handle: Long): Int

    @JvmStatic
    external fun libcPspSceRegRemoveRegistry(key: Long): Int

    @JvmStatic
    external fun libcPspSceOpenPSIDGetOpenPSID(openpsid: Long): Int

    @JvmStatic
    external fun libcPspSceUtilityMsgDialogInitStart(params: Long): Int

    @JvmStatic
    external fun libcPspSceUtilityMsgDialogShutdownStart()

    @JvmStatic
    external fun libcPspSceUtilityMsgDialogGetStatus(): Int

    @JvmStatic
    external fun libcPspSceUtilityMsgDialogUpdate(n: Int)

    @JvmStatic
    external fun libcPspSceUtilityMsgDialogAbort(): Int

    @JvmStatic
    external fun libcPspSceUtilityNetconfInitStart(data: Long): Int

    @JvmStatic
    external fun libcPspSceUtilityNetconfShutdownStart(): Int

    @JvmStatic
    external fun libcPspSceUtilityNetconfUpdate(unknown: Int): Int

    @JvmStatic
    external fun libcPspSceUtilityNetconfGetStatus(): Int

    @JvmStatic
    external fun libcPspSceUtilityCheckNetParam(id: Int): Int

    @JvmStatic
    external fun libcPspSceUtilitySavedataInitStart(params: Long): Int

    @JvmStatic
    external fun libcPspSceUtilitySavedataGetStatus(): Int

    @JvmStatic
    external fun libcPspSceUtilitySavedataShutdownStart(): Int

    @JvmStatic
    external fun libcPspSceUtilitySavedataUpdate(unknown: Int)

    @JvmStatic
    external fun libcPspSceUtilityGameSharingInitStart(params: Long): Int

    @JvmStatic
    external fun libcPspSceUtilityGameSharingShutdownStart()

    @JvmStatic
    external fun libcPspSceUtilityGameSharingGetStatus(): Int

    @JvmStatic
    external fun libcPspSceUtilityGameSharingUpdate(n: Int)

    @JvmStatic
    external fun libcPspSceUtilityHtmlViewerInitStart(params: Long): Int

    @JvmStatic
    external fun libcPspSceUtilityHtmlViewerShutdownStart(): Int

    @JvmStatic
    external fun libcPspSceUtilityHtmlViewerUpdate(n: Int): Int

    @JvmStatic
    external fun libcPspSceUtilityHtmlViewerGetStatus(): Int

    @JvmStatic
    external fun libcPspSceUtilityOskInitStart(params: Long): Int

    @JvmStatic
    external fun libcPspSceUtilityOskShutdownStart(): Int

    @JvmStatic
    external fun libcPspSceUtilityOskUpdate(n: Int): Int

    @JvmStatic
    external fun libcPspSceUtilityOskGetStatus(): Int

    @JvmStatic
    external fun libcPspSceUtilityCreateNetParam(conf: Int): Int

    @JvmStatic
    external fun libcPspSceUtilityCopyNetParam(src: Int, dest: Int): Int

    @JvmStatic
    external fun libcPspSceUtilityDeleteNetParam(conf: Int): Int

    @JvmStatic
    external fun libcPspSceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int

    @JvmStatic
    external fun libcPspSceNetTerm(): Int

    @JvmStatic
    external fun libcPspSceNetFreeThreadinfo(thid: Int): Int

    @JvmStatic
    external fun libcPspSceNetThreadAbort(thid: Int): Int

    @JvmStatic
    external fun libcPspSceNetEtherStrton(name: Long, mac: Long)

    @JvmStatic
    external fun libcPspSceNetEtherNtostr(mac: Long, name: Long)

    @JvmStatic
    external fun libcPspSceNetGetLocalEtherAddr(mac: Long): Int

    @JvmStatic
    external fun libcPspSceNetGetMallocStat(stat: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlTerm(): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlConnect(name: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlDisconnect(): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlGetState(event: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlCreate(name: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlJoin(scaninfo: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlGetAdhocId(id: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlCreateEnterGameMode(name: Long, unknown: Int, num: Int, macs: Long, timeout: Int, unknown2: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlJoinEnterGameMode(name: Long, hostmac: Long, timeout: Int, unknown: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlGetGameModeInfo(gamemodeinfo: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlExitGameMode(): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlGetPeerList(length: Long, buf: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlGetPeerInfo(mac: Long, size: Int, peerinfo: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlScan(): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlGetScanInfo(length: Long, buf: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlAddHandler(handler: Long, unknown: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlDelHandler(id: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlGetNameByAddr(mac: Long, nickname: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlGetAddrByName(nickname: Long, length: Long, buf: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocctlGetParameter(params: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocInit(): Int

    @JvmStatic
    external fun libcPspSceNetAdhocTerm(): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPdpCreate(mac: Long, port: Short, bufSize: Int, unk1: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPdpDelete(id: Int, unk1: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPdpSend(id: Int, destMacAddr: Long, port: Short, data: Long, len: Int, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPdpRecv(id: Int, srcMacAddr: Long, port: Long, data: Long, dataLength: Long, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocGetPdpStat(size: Long, stat: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocGameModeCreateMaster(data: Long, size: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocGameModeCreateReplica(mac: Long, data: Long, size: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocGameModeUpdateMaster(): Int

    @JvmStatic
    external fun libcPspSceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocGameModeDeleteMaster(): Int

    @JvmStatic
    external fun libcPspSceNetAdhocGameModeDeleteReplica(id: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPtpOpen(srcmac: Long, srcport: Short, destmac: Long, destport: Short, bufSize: Int, delay: Int, count: Int, unk1: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPtpConnect(id: Int, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPtpListen(srcmac: Long, srcport: Short, bufSize: Int, delay: Int, count: Int, queue: Int, unk1: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPtpAccept(id: Int, mac: Long, port: Long, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPtpSend(id: Int, data: Long, dataSize: Long, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPtpRecv(id: Int, data: Long, dataSize: Long, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPtpFlush(id: Int, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocPtpClose(id: Int, unk1: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocGetPtpStat(size: Long, stat: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingInit(memsize: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingTerm(): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingDelete(matchingId: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingStop(matchingId: Int): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingSelectTarget(matchingId: Int, mac: Long, optLen: Int, optData: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingCancelTarget(matchingId: Int, mac: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: Long, optLen: Int, optData: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingSendData(matchingId: Int, mac: Long, dataLen: Int, data: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingAbortSendData(matchingId: Int, mac: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: Long, optData: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingGetMembers(matchingId: Int, length: Long, buf: Long): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingGetPoolMaxAlloc(): Int

    @JvmStatic
    external fun libcPspSceNetAdhocMatchingGetPoolStat(poolstat: Long): Int

    @JvmStatic
    external fun libcPspSceNetApctlInit(stackSize: Int, initPriority: Int): Int

    @JvmStatic
    external fun libcPspSceNetApctlTerm(): Int

    @JvmStatic
    external fun libcPspSceNetApctlAddHandler(handler: Long, parg: Long): Int

    @JvmStatic
    external fun libcPspSceNetApctlDelHandler(handlerId: Int): Int

    @JvmStatic
    external fun libcPspSceNetApctlConnect(connIndex: Int): Int

    @JvmStatic
    external fun libcPspSceNetApctlDisconnect(): Int

    @JvmStatic
    external fun libcPspSceNetApctlGetState(pstate: Long): Int

    @JvmStatic
    external fun libcPspSceNetInetInit(): Int

    @JvmStatic
    external fun libcPspSceNetInetTerm(): Int

    @JvmStatic
    external fun libcPspSceNetInetAccept(s: Int, addr: Long, addrLen: Long): Int

    @JvmStatic
    external fun libcPspSceNetInetBind(s: Int, myAddr: Long, addrLen: Int): Int

    @JvmStatic
    external fun libcPspSceNetInetConnect(s: Int, servAddr: Long, addrLen: Int): Int

    @JvmStatic
    external fun libcPspSceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: Long, optlEn: Long): Int

    @JvmStatic
    external fun libcPspSceNetInetListen(s: Int, backlog: Int): Int

    @JvmStatic
    external fun libcPspSceNetInetRecv(s: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcPspSceNetInetRecvfrom(s: Int, buf: Long, flags: Long, arg1: Int, from: Long, fromLen: Long): Long

    @JvmStatic
    external fun libcPspSceNetInetSend(s: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcPspSceNetInetSendto(s: Int, buf: Long, len: Long, flags: Int, to: Long, toLen: Int): Long

    @JvmStatic
    external fun libcPspSceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: Long, optLen: Int): Int

    @JvmStatic
    external fun libcPspSceNetInetShutdown(s: Int, how: Int): Int

    @JvmStatic
    external fun libcPspSceNetInetSocket(domain: Int, type: Int, protocol: Int): Int

    @JvmStatic
    external fun libcPspSceNetInetClose(s: Int): Int

    @JvmStatic
    external fun libcPspSceNetInetGetErrno(): Int

    @JvmStatic
    external fun libcPspSceSslInit(unknown1: Int): Int

    @JvmStatic
    external fun libcPspSceSslEnd(): Int

    @JvmStatic
    external fun libcPspSceSslGetUsedMemoryMax(memory: Long): Int

    @JvmStatic
    external fun libcPspSceSslGetUsedMemoryCurrent(memory: Long): Int

    @JvmStatic
    external fun libcPspSceHttpInit(unknown1: Int): Int

    @JvmStatic
    external fun libcPspSceHttpEnd(): Int

    @JvmStatic
    external fun libcPspSceHttpCreateTemplate(agent: Long, unknown1: Int, unknown2: Int): Int

    @JvmStatic
    external fun libcPspSceHttpDeleteTemplate(templateid: Int): Int

    @JvmStatic
    external fun libcPspSceHttpCreateConnection(templateid: Int, host: Long, unknown1: Long, port: Short, unknown2: Int): Int

    @JvmStatic
    external fun libcPspSceHttpCreateConnectionWithURL(templateid: Int, url: Long, unknown1: Int): Int

    @JvmStatic
    external fun libcPspSceHttpDeleteConnection(connectionId: Int): Int

    @JvmStatic
    external fun libcPspSceHttpDeleteRequest(requestId: Int): Int

    @JvmStatic
    external fun libcPspSceHttpSendRequest(requestId: Int, data: Long, dataSize: Int): Int

    @JvmStatic
    external fun libcPspSceHttpAbortRequest(requestId: Int): Int

    @JvmStatic
    external fun libcPspSceHttpReadData(requestId: Int, data: Long, dataSize: Int): Int

    @JvmStatic
    external fun libcPspSceHttpGetContentLength(requestId: Int, contentLength: Long): Int

    @JvmStatic
    external fun libcPspSceHttpGetStatusCode(requestId: Int, statusCode: Long): Int

    @JvmStatic
    external fun libcPspSceHttpSetResolveTimeOut(id: Int, timeout: Int): Int

    @JvmStatic
    external fun libcPspSceHttpSetResolveRetry(id: Int, count: Int): Int

    @JvmStatic
    external fun libcPspSceHttpSetConnectTimeOut(id: Int, timeout: Int): Int

    @JvmStatic
    external fun libcPspSceHttpSetSendTimeOut(id: Int, timeout: Int): Int

    @JvmStatic
    external fun libcPspSceHttpSetRecvTimeOut(id: Int, timeout: Int): Int

    @JvmStatic
    external fun libcPspSceHttpEnableKeepAlive(id: Int): Int

    @JvmStatic
    external fun libcPspSceHttpDisableKeepAlive(id: Int): Int

    @JvmStatic
    external fun libcPspSceHttpEnableRedirect(id: Int): Int

    @JvmStatic
    external fun libcPspSceHttpDisableRedirect(id: Int): Int

    @JvmStatic
    external fun libcPspSceHttpEnableCookie(id: Int): Int

    @JvmStatic
    external fun libcPspSceHttpDisableCookie(id: Int): Int

    @JvmStatic
    external fun libcPspSceHttpSaveSystemCookie(): Int

    @JvmStatic
    external fun libcPspSceHttpLoadSystemCookie(): Int

    @JvmStatic
    external fun libcPspSceHttpAddExtraHeader(id: Int, name: Long, value: Long, unknown1: Int): Int

    @JvmStatic
    external fun libcPspSceHttpDeleteHeader(id: Int, name: Long): Int

    @JvmStatic
    external fun libcPspSceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int

    @JvmStatic
    external fun libcPspSceHttpsEnd(): Int

    @JvmStatic
    external fun libcPspSceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int

    @JvmStatic
    external fun libcPspSceHttpDisableAuth(id: Int): Int

    @JvmStatic
    external fun libcPspSceHttpDisableCache(id: Int): Int

    @JvmStatic
    external fun libcPspSceHttpEnableAuth(id: Int): Int

    @JvmStatic
    external fun libcPspSceHttpEnableCache(id: Int): Int

    @JvmStatic
    external fun libcPspSceHttpEndCache(): Int

    @JvmStatic
    external fun libcPspSceHttpGetAllHeader(request: Int, header: Long, headerSize: Long): Int

    @JvmStatic
    external fun libcPspSceHttpGetNetworkErrno(request: Int, errNum: Long): Int

    @JvmStatic
    external fun libcPspSceHttpGetProxy(id: Int, activateFlag: Long, mode: Long, proxyHost: Long, len: Long, proxyPort: Long): Int

    @JvmStatic
    external fun libcPspSceHttpInitCache(maxSize: Long): Int

    @JvmStatic
    external fun libcPspSceHttpSetAuthInfoCB(id: Int, cbfunc: Long): Int

    @JvmStatic
    external fun libcPspSceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: Long, newProxyPort: Short): Int

    @JvmStatic
    external fun libcPspSceHttpSetResHeaderMaxSize(id: Int, headerSize: Int): Int

    @JvmStatic
    external fun libcPspSceHttpSetMallocFunction(mallocFunc: Long, freeFunc: Long, reallocFunc: Long): Int

    @JvmStatic
    external fun libcPspSceNetResolverInit(): Int

    @JvmStatic
    external fun libcPspSceNetResolverCreate(rid: Long, buf: Long, bufLength: Int): Int

    @JvmStatic
    external fun libcPspSceNetResolverDelete(rid: Int): Int

    @JvmStatic
    external fun libcPspSceNetResolverStartNtoA(rid: Int, hostname: Long, addr: Long, timeout: Int, retry: Int): Int

    @JvmStatic
    external fun libcPspSceNetResolverStartAtoN(rid: Int, addr: Long, hostname: Long, hostnameLen: Int, timeout: Int, retry: Int): Int

    @JvmStatic
    external fun libcPspSceNetResolverStop(rid: Int): Int

    @JvmStatic
    external fun libcPspSceNetResolverTerm(): Int
}

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChRelease(channel: Int): Int =
    PspJniBridge.libcPspSceAudioChRelease(channel)

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceAudioOutput(channel, vol, buf.rawAddress)

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceAudioOutputBlocking(channel, vol, buf.rawAddress)

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceAudioOutputPanned(channel, leftVol, rightVol, buf.rawAddress)

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceAudioOutputPannedBlocking(channel, leftVol, rightVol, buf.rawAddress)

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    PspJniBridge.libcPspSceAudioGetChannelRestLen(channel)

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    PspJniBridge.libcPspSceAudioGetChannelRestLength(channel)

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    PspJniBridge.libcPspSceAudioSetChannelDataLen(channel, sampleCount)

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    PspJniBridge.libcPspSceAudioChangeChannelVolume(channel, leftVol, rightVol)

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    PspJniBridge.libcPspSceAudioOutput2Reserve(sampleCount)

public actual fun sceAudioOutput2Release(): Int =
    PspJniBridge.libcPspSceAudioOutput2Release()

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    PspJniBridge.libcPspSceAudioOutput2ChangeLength(sampleCount)

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceAudioOutput2OutputBlocking(vol, buf.rawAddress)

public actual fun sceAudioOutput2GetRestSample(): Int =
    PspJniBridge.libcPspSceAudioOutput2GetRestSample()

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    0

public actual fun sceAudioSRCChRelease(): Int =
    PspJniBridge.libcPspSceAudioSRCChRelease()

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceAudioSRCOutputBlocking(vol, buf.rawAddress)

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    PspJniBridge.libcPspSceAudioInputInit(unknown1, gain, unknown2)

public actual fun sceAudioInputInitEx(params: MutPtr<AudioInputParams>): Int =
    PspJniBridge.libcPspSceAudioInputInitEx(params.rawAddress)

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr<CVoid>) {
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr<CVoid>) {
}

public actual fun sceAudioGetInputLength(): Int =
    PspJniBridge.libcPspSceAudioGetInputLength()

public actual fun sceAudioWaitInputEnd(): Int =
    PspJniBridge.libcPspSceAudioWaitInputEnd()

public actual fun sceAudioPollInputEnd(): Int =
    PspJniBridge.libcPspSceAudioPollInputEnd()

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    PspJniBridge.libcPspSceAtracGetAtracID(uiCodecType.toInt())

public actual fun sceAtracSetDataAndGetID(buf: MutPtr<CVoid>, bufsize: ULong): Int =
    PspJniBridge.libcPspSceAtracSetDataAndGetID(buf.rawAddress, bufsize.toLong())

public actual fun sceAtracDecodeData(atracId: Int, outSamples: MutPtr<UShort>, outN: MutPtr<Int>, outEnd: MutPtr<Int>, outRemainFrame: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceAtracDecodeData(atracId, outSamples.rawAddress, outN.rawAddress, outEnd.rawAddress, outRemainFrame.rawAddress)

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceAtracGetRemainFrame(atracId, outRemainFrame.rawAddress)

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: MutPtr<MutPtr<UByte>>, availableBytes: MutPtr<UInt>, readOffset: MutPtr<UInt>): Int =
    PspJniBridge.libcPspSceAtracGetStreamDataInfo(atracId, writePointer.rawAddress, availableBytes.rawAddress, readOffset.rawAddress)

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    PspJniBridge.libcPspSceAtracAddStreamData(atracId, bytesToAdd.toInt())

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceAtracGetBitrate(atracId, outBitrate.rawAddress)

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    PspJniBridge.libcPspSceAtracSetLoopNum(atracId, nloops)

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    PspJniBridge.libcPspSceAtracReleaseAtracID(atracId)

public actual fun sceAtracGetNextSample(atracId: Int, outN: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceAtracGetNextSample(atracId, outN.rawAddress)

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceAtracGetMaxSample(atracId, outMax.rawAddress)

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: MutPtr<Atrac3BufferInfo>): Int =
    PspJniBridge.libcPspSceAtracGetBufferInfoForReseting(atracId, uiSample.toInt(), pbufferInfo.rawAddress)

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: MutPtr<UInt>): Int =
    PspJniBridge.libcPspSceAtracGetChannel(atracId, puiChannel.rawAddress)

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceAtracGetInternalErrorInfo(atracId, piResult.rawAddress)

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: MutPtr<Int>, puiLoopStatus: MutPtr<UInt>): Int =
    PspJniBridge.libcPspSceAtracGetLoopStatus(atracId, piLoopNum.rawAddress, puiLoopStatus.rawAddress)

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: MutPtr<UInt>): Int =
    PspJniBridge.libcPspSceAtracGetNextDecodePosition(atracId, puiSamplePosition.rawAddress)

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: MutPtr<UInt>, puiDataByte: MutPtr<UInt>): Int =
    PspJniBridge.libcPspSceAtracGetSecondBufferInfo(atracId, puiPosition.rawAddress, puiDataByte.rawAddress)

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: MutPtr<Int>, piLoopStartSample: MutPtr<Int>, piLoopEndSample: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceAtracGetSoundSample(atracId, piEndSample.rawAddress, piLoopStartSample.rawAddress, piLoopEndSample.rawAddress)

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    PspJniBridge.libcPspSceAtracResetPlayPosition(atracId, uiSample.toInt(), uiWriteByteFirstBuf.toInt(), uiWriteByteSecondBuf.toInt())

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: MutPtr<UByte>, uiBufferByte: UInt): Int =
    PspJniBridge.libcPspSceAtracSetData(atracId, pucBufferAddr.rawAddress, uiBufferByte.toInt())

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: MutPtr<UByte>, uiReadByte: UInt, uiBufferByte: UInt): Int =
    PspJniBridge.libcPspSceAtracSetHalfwayBuffer(atracId, pucBufferAddr.rawAddress, uiReadByte.toInt(), uiBufferByte.toInt())

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: MutPtr<UByte>, uiReadByte: UInt, uiBufferByte: UInt): Int =
    PspJniBridge.libcPspSceAtracSetHalfwayBufferAndGetID(pucBufferAddr.rawAddress, uiReadByte.toInt(), uiBufferByte.toInt())

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: MutPtr<UByte>, uiSecondBufferByte: UInt): Int =
    PspJniBridge.libcPspSceAtracSetSecondBuffer(atracId, pucSecondBufferAddr.rawAddress, uiSecondBufferByte.toInt())

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    PspJniBridge.libcPspSceCtrlSetSamplingCycle(cycle)

public actual fun sceCtrlGetSamplingCycle(pcycle: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceCtrlGetSamplingCycle(pcycle.rawAddress)

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    0

public actual fun sceCtrlGetSamplingMode(pmode: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceCtrlGetSamplingMode(pmode.rawAddress)

public actual fun sceCtrlPeekBufferPositive(padData: MutPtr<SceCtrlData>, count: Int): Int =
    PspJniBridge.libcPspSceCtrlPeekBufferPositive(padData.rawAddress, count)

public actual fun sceCtrlPeekBufferNegative(padData: MutPtr<SceCtrlData>, count: Int): Int =
    PspJniBridge.libcPspSceCtrlPeekBufferNegative(padData.rawAddress, count)

public actual fun sceCtrlReadBufferPositive(padData: MutPtr<SceCtrlData>, count: Int): Int =
    PspJniBridge.libcPspSceCtrlReadBufferPositive(padData.rawAddress, count)

public actual fun sceCtrlReadBufferNegative(padData: MutPtr<SceCtrlData>, count: Int): Int =
    PspJniBridge.libcPspSceCtrlReadBufferNegative(padData.rawAddress, count)

public actual fun sceCtrlPeekLatch(latchData: MutPtr<SceCtrlLatch>): Int =
    PspJniBridge.libcPspSceCtrlPeekLatch(latchData.rawAddress)

public actual fun sceCtrlReadLatch(latchData: MutPtr<SceCtrlLatch>): Int =
    PspJniBridge.libcPspSceCtrlReadLatch(latchData.rawAddress)

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    PspJniBridge.libcPspSceCtrlSetIdleCancelThreshold(idlereset, idleback)

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: MutPtr<Int>, idleback: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceCtrlGetIdleCancelThreshold(idlereset.rawAddress, idleback.rawAddress)

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    0u

public actual fun sceDisplayGetMode(pmode: MutPtr<Int>, pwidth: MutPtr<Int>, pheight: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceDisplayGetMode(pmode.rawAddress, pwidth.rawAddress, pheight.rawAddress)

public actual fun sceDisplaySetFrameBuf(topAddr: ConstPtr<UByte>, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    0u

public actual fun sceDisplayGetFrameBuf(topAddr: MutPtr<MutPtr<CVoid>>, bufferWidth: MutPtr<ULong>, pixelFormat: MutPtr<DisplayPixelFormat>, sync: DisplaySetBufSync): Int =
    0

public actual fun sceDisplayGetVcount(): UInt =
    PspJniBridge.libcPspSceDisplayGetVcount().toUInt()

public actual fun sceDisplayWaitVblank(): Int =
    PspJniBridge.libcPspSceDisplayWaitVblank()

public actual fun sceDisplayWaitVblankCB(): Int =
    PspJniBridge.libcPspSceDisplayWaitVblankCB()

public actual fun sceDisplayWaitVblankStart(): Int =
    PspJniBridge.libcPspSceDisplayWaitVblankStart()

public actual fun sceDisplayWaitVblankStartCB(): Int =
    PspJniBridge.libcPspSceDisplayWaitVblankStartCB()

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    PspJniBridge.libcPspSceDisplayGetAccumulatedHcount()

public actual fun sceDisplayGetCurrentHcount(): Int =
    PspJniBridge.libcPspSceDisplayGetCurrentHcount()

public actual fun sceDisplayGetFramePerSec(): Float =
    PspJniBridge.libcPspSceDisplayGetFramePerSec()

public actual fun sceDisplayIsForeground(): Int =
    PspJniBridge.libcPspSceDisplayIsForeground()

public actual fun sceDisplayIsVblank(): Int =
    PspJniBridge.libcPspSceDisplayIsVblank()

public actual fun sceGeEdramGetSize(): UInt =
    PspJniBridge.libcPspSceGeEdramGetSize().toUInt()

public actual fun sceGeEdramGetAddr(): MutPtr<UByte> =
    MutPtr(PspJniBridge.libcPspSceGeEdramGetAddr())

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    PspJniBridge.libcPspSceGeEdramSetAddrTranslation(width)

public actual fun sceGeGetCmd(cmd: Int): UInt =
    PspJniBridge.libcPspSceGeGetCmd(cmd).toUInt()

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: MutPtr<CVoid>): Int =
    0

public actual fun sceGeGetStack(stackId: Int, stack: MutPtr<GeStack>): Int =
    PspJniBridge.libcPspSceGeGetStack(stackId, stack.rawAddress)

public actual fun sceGeSaveContext(context: MutPtr<GeContext>): Int =
    PspJniBridge.libcPspSceGeSaveContext(context.rawAddress)

public actual fun sceGeRestoreContext(context: ConstPtr<GeContext>): Int =
    PspJniBridge.libcPspSceGeRestoreContext(context.rawAddress)

public actual fun sceGeListEnQueue(list: ConstPtr<CVoid>, stall: MutPtr<CVoid>, cbid: Int, arg: MutPtr<GeListArgs>): Int =
    PspJniBridge.libcPspSceGeListEnQueue(list.rawAddress, stall.rawAddress, cbid, arg.rawAddress)

public actual fun sceGeListEnQueueHead(list: ConstPtr<CVoid>, stall: MutPtr<CVoid>, cbid: Int, arg: MutPtr<GeListArgs>): Int =
    PspJniBridge.libcPspSceGeListEnQueueHead(list.rawAddress, stall.rawAddress, cbid, arg.rawAddress)

public actual fun sceGeListDeQueue(qid: Int): Int =
    PspJniBridge.libcPspSceGeListDeQueue(qid)

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceGeListUpdateStallAddr(qid, stall.rawAddress)

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    GeListState.entries.first()

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    GeListState.entries.first()

public actual fun sceGeBreak(mode: Int, pParam: MutPtr<GeBreakParam>): Int =
    PspJniBridge.libcPspSceGeBreak(mode, pParam.rawAddress)

public actual fun sceGeContinue(): Int =
    PspJniBridge.libcPspSceGeContinue()

public actual fun sceGeSetCallback(cb: MutPtr<GeCallbackData>): Int =
    PspJniBridge.libcPspSceGeSetCallback(cb.rawAddress)

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    PspJniBridge.libcPspSceGeUnsetCallback(cbid)

public actual fun sceKernelExitGame() {
    PspJniBridge.libcPspSceKernelExitGame()
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    0

public actual fun sceKernelLoadExec(file: ConstPtr<UByte>, param: MutPtr<SceKernelLoadExecParam>): Int =
    PspJniBridge.libcPspSceKernelLoadExec(file.rawAddress, param.rawAddress)

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: ConstPtr<UByte>, type: SceSysMemBlockTypes, size: UInt, addr: MutPtr<CVoid>): SceUid =
    SceUid()

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): MutPtr<CVoid> =
    MutPtr(0L)

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    0

public actual fun sceKernelTotalFreeMemSize(): ULong =
    PspJniBridge.libcPspSceKernelTotalFreeMemSize().toULong()

public actual fun sceKernelMaxFreeMemSize(): ULong =
    PspJniBridge.libcPspSceKernelMaxFreeMemSize().toULong()

public actual fun sceKernelDevkitVersion(): UInt =
    PspJniBridge.libcPspSceKernelDevkitVersion().toUInt()

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    PspJniBridge.libcPspSceKernelSetCompiledSdkVersion(version.toInt())

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    PspJniBridge.libcPspSceKernelGetCompiledSdkVersion().toUInt()

public actual fun sceKernelLibcTime(t: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceKernelLibcTime(t.rawAddress)

public actual fun sceKernelLibcClock(): UInt =
    PspJniBridge.libcPspSceKernelLibcClock().toUInt()

public actual fun sceKernelLibcGettimeofday(tp: MutPtr<Timeval>, tzp: MutPtr<Timezone>): Int =
    PspJniBridge.libcPspSceKernelLibcGettimeofday(tp.rawAddress, tzp.rawAddress)

public actual fun sceKernelDcacheWritebackAll() {
    PspJniBridge.libcPspSceKernelDcacheWritebackAll()
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    PspJniBridge.libcPspSceKernelDcacheWritebackInvalidateAll()
}

public actual fun sceKernelDcacheWritebackRange(p: ConstPtr<CVoid>, size: UInt) {
    PspJniBridge.libcPspSceKernelDcacheWritebackRange(p.rawAddress, size.toInt())
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: ConstPtr<CVoid>, size: UInt) {
    PspJniBridge.libcPspSceKernelDcacheWritebackInvalidateRange(p.rawAddress, size.toInt())
}

public actual fun sceKernelDcacheInvalidateRange(p: ConstPtr<CVoid>, size: UInt) {
    PspJniBridge.libcPspSceKernelDcacheInvalidateRange(p.rawAddress, size.toInt())
}

public actual fun sceKernelIcacheInvalidateAll() {
    PspJniBridge.libcPspSceKernelIcacheInvalidateAll()
}

public actual fun sceKernelIcacheInvalidateRange(p: ConstPtr<CVoid>, size: UInt) {
    PspJniBridge.libcPspSceKernelIcacheInvalidateRange(p.rawAddress, size.toInt())
}

public actual fun sceKernelUtilsMt19937Init(ctx: MutPtr<SceKernelUtilsMt19937Context>, seed: UInt): Int =
    PspJniBridge.libcPspSceKernelUtilsMt19937Init(ctx.rawAddress, seed.toInt())

public actual fun sceKernelUtilsMt19937UInt(ctx: MutPtr<SceKernelUtilsMt19937Context>): UInt =
    PspJniBridge.libcPspSceKernelUtilsMt19937UInt(ctx.rawAddress).toUInt()

public actual fun sceKernelUtilsMd5Digest(data: MutPtr<UByte>, size: UInt, digest: MutPtr<UByte>): Int =
    PspJniBridge.libcPspSceKernelUtilsMd5Digest(data.rawAddress, size.toInt(), digest.rawAddress)

public actual fun sceKernelUtilsMd5BlockInit(ctx: MutPtr<SceKernelUtilsMd5Context>): Int =
    PspJniBridge.libcPspSceKernelUtilsMd5BlockInit(ctx.rawAddress)

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: MutPtr<SceKernelUtilsMd5Context>, data: MutPtr<UByte>, size: UInt): Int =
    PspJniBridge.libcPspSceKernelUtilsMd5BlockUpdate(ctx.rawAddress, data.rawAddress, size.toInt())

public actual fun sceKernelUtilsMd5BlockResult(ctx: MutPtr<SceKernelUtilsMd5Context>, digest: MutPtr<UByte>): Int =
    PspJniBridge.libcPspSceKernelUtilsMd5BlockResult(ctx.rawAddress, digest.rawAddress)

public actual fun sceKernelUtilsSha1Digest(data: MutPtr<UByte>, size: UInt, digest: MutPtr<UByte>): Int =
    PspJniBridge.libcPspSceKernelUtilsSha1Digest(data.rawAddress, size.toInt(), digest.rawAddress)

public actual fun sceKernelUtilsSha1BlockInit(ctx: MutPtr<SceKernelUtilsSha1Context>): Int =
    PspJniBridge.libcPspSceKernelUtilsSha1BlockInit(ctx.rawAddress)

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: MutPtr<SceKernelUtilsSha1Context>, data: MutPtr<UByte>, size: UInt): Int =
    PspJniBridge.libcPspSceKernelUtilsSha1BlockUpdate(ctx.rawAddress, data.rawAddress, size.toInt())

public actual fun sceKernelUtilsSha1BlockResult(ctx: MutPtr<SceKernelUtilsSha1Context>, digest: MutPtr<UByte>): Int =
    PspJniBridge.libcPspSceKernelUtilsSha1BlockResult(ctx.rawAddress, digest.rawAddress)

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: MutPtr<CVoid>, arg: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceKernelRegisterSubIntrHandler(intNo, no, handler.rawAddress, arg.rawAddress)

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    PspJniBridge.libcPspSceKernelReleaseSubIntrHandler(intNo, no)

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    PspJniBridge.libcPspSceKernelEnableSubIntr(intNo, no)

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    PspJniBridge.libcPspSceKernelDisableSubIntr(intNo, no)

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: MutPtr<IntrHandlerOptionParam>): Int =
    0

public actual fun sceKernelCpuSuspendIntr(): UInt =
    PspJniBridge.libcPspSceKernelCpuSuspendIntr().toUInt()

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    PspJniBridge.libcPspSceKernelCpuResumeIntr(flags.toInt())
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    PspJniBridge.libcPspSceKernelCpuResumeIntrWithSync(flags.toInt())
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    PspJniBridge.libcPspSceKernelIsCpuIntrSuspended(flags.toInt())

public actual fun sceKernelIsCpuIntrEnable(): Int =
    PspJniBridge.libcPspSceKernelIsCpuIntrEnable()

public actual fun sceKernelLoadModule(path: ConstPtr<UByte>, flags: Int, option: MutPtr<SceKernelLMOption>): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleMs(path: ConstPtr<UByte>, flags: Int, option: MutPtr<SceKernelLMOption>): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: MutPtr<SceKernelLMOption>): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: MutPtr<CVoid>, flags: Int, option: MutPtr<SceKernelLMOption>): SceUid =
    SceUid()

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: MutPtr<CVoid>, status: MutPtr<Int>, option: MutPtr<SceKernelSMOption>): Int =
    0

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: MutPtr<CVoid>, status: MutPtr<Int>, option: MutPtr<SceKernelSMOption>): Int =
    0

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    0

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceKernelSelfStopUnloadModule(unknown, argSize.toLong(), argp.rawAddress)

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: MutPtr<CVoid>, status: MutPtr<Int>, option: MutPtr<SceKernelSMOption>): Int =
    PspJniBridge.libcPspSceKernelStopUnloadSelfModule(argSize.toLong(), argp.rawAddress, status.rawAddress, option.rawAddress)

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: MutPtr<SceKernelModuleInfo>): Int =
    0

public actual fun sceKernelGetModuleIdList(readBuf: MutPtr<SceUid>, readBufSize: Int, idCount: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceKernelGetModuleIdList(readBuf.rawAddress, readBufSize, idCount.rawAddress)

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: MutPtr<MutPtr<CVoid>>, size: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceKernelVolatileMemLock(unk, ptr.rawAddress, size.rawAddress)

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: MutPtr<MutPtr<CVoid>>, size: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceKernelVolatileMemTryLock(unk, ptr.rawAddress, size.rawAddress)

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    PspJniBridge.libcPspSceKernelVolatileMemUnlock(unk)

public actual fun sceKernelStdin(): SceUid =
    SceUid()

public actual fun sceKernelStdout(): SceUid =
    SceUid()

public actual fun sceKernelStderr(): SceUid =
    SceUid()

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    SceKernelIdListType.entries.first()

public actual fun sceKernelCreateThread(name: ConstPtr<UByte>, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: MutPtr<SceKernelThreadOptParam>): SceUid =
    SceUid()

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    0

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: MutPtr<CVoid>): Int =
    0

public actual fun sceKernelExitThread(status: Int): Int =
    PspJniBridge.libcPspSceKernelExitThread(status)

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    PspJniBridge.libcPspSceKernelExitDeleteThread(status)

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    0

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    0

public actual fun sceKernelSuspendDispatchThread(): Int =
    PspJniBridge.libcPspSceKernelSuspendDispatchThread()

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    PspJniBridge.libcPspSceKernelResumeDispatchThread(state)

public actual fun sceKernelSleepThread(): Int =
    PspJniBridge.libcPspSceKernelSleepThread()

public actual fun sceKernelSleepThreadCB(): Int =
    PspJniBridge.libcPspSceKernelSleepThreadCB()

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    0

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    0

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    0

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    0

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelDelayThread(delay: UInt): Int =
    PspJniBridge.libcPspSceKernelDelayThread(delay.toInt())

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    PspJniBridge.libcPspSceKernelDelayThreadCB(delay.toInt())

public actual fun sceKernelDelaySysClockThread(delay: MutPtr<SceKernelSysClock>): Int =
    PspJniBridge.libcPspSceKernelDelaySysClockThread(delay.rawAddress)

public actual fun sceKernelDelaySysClockThreadCB(delay: MutPtr<SceKernelSysClock>): Int =
    PspJniBridge.libcPspSceKernelDelaySysClockThreadCB(delay.rawAddress)

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    PspJniBridge.libcPspSceKernelChangeCurrentThreadAttr(unknown, attr)

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    0

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    PspJniBridge.libcPspSceKernelRotateThreadReadyQueue(priority)

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    0

public actual fun sceKernelGetThreadId(): Int =
    PspJniBridge.libcPspSceKernelGetThreadId()

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    PspJniBridge.libcPspSceKernelGetThreadCurrentPriority()

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    0

public actual fun sceKernelCheckThreadStack(): Int =
    PspJniBridge.libcPspSceKernelCheckThreadStack()

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    0

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: MutPtr<SceKernelThreadInfo>): Int =
    0

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: MutPtr<SceKernelThreadRunStatus>): Int =
    0

public actual fun sceKernelCreateSema(name: ConstPtr<UByte>, attr: UInt, initVal: Int, maxVal: Int, option: MutPtr<SceKernelSemaOptParam>): SceUid =
    SceUid()

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    0

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    0

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    0

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: MutPtr<SceKernelSemaInfo>): Int =
    0

public actual fun sceKernelCreateEventFlag(name: ConstPtr<UByte>, attr: Int, bits: Int, opt: MutPtr<SceKernelEventFlagOptParam>): SceUid =
    SceUid()

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    0

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    0

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr<UInt>): Int =
    0

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr<UInt>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr<UInt>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    0

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: MutPtr<SceKernelEventFlagInfo>): Int =
    0

public actual fun sceKernelCreateMbx(name: ConstPtr<UByte>, attr: UInt, option: MutPtr<SceKernelMbxOptParam>): SceUid =
    SceUid()

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    0

public actual fun sceKernelSendMbx(mbxId: SceUid, message: MutPtr<CVoid>): Int =
    0

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: MutPtr<MutPtr<CVoid>>): Int =
    0

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: MutPtr<Int>): Int =
    0

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: MutPtr<SceKernelMbxInfo>): Int =
    0

public actual fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: MutPtr<CVoid>): SceUid =
    SceUid()

public actual fun sceKernelSetSysClockAlarm(clock: MutPtr<SceKernelSysClock>, handler: MutPtr<SceKernelAlarmHandler>, common: MutPtr<CVoid>): SceUid =
    SceUid()

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    0

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: MutPtr<SceKernelAlarmInfo>): Int =
    0

public actual fun sceKernelCreateCallback(name: ConstPtr<UByte>, func: SceKernelCallbackFunction, arg: MutPtr<CVoid>): SceUid =
    SceUid()

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: MutPtr<SceKernelCallbackInfo>): Int =
    0

public actual fun sceKernelDeleteCallback(cb: SceUid): Int =
    0

public actual fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int =
    0

public actual fun sceKernelCancelCallback(cb: SceUid): Int =
    0

public actual fun sceKernelGetCallbackCount(cb: SceUid): Int =
    0

public actual fun sceKernelCheckCallback(): Int =
    PspJniBridge.libcPspSceKernelCheckCallback()

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: MutPtr<SceUid>, readBufSize: Int, idCount: MutPtr<Int>): Int =
    0

public actual fun sceKernelReferSystemStatus(status: MutPtr<SceKernelSystemStatus>): Int =
    PspJniBridge.libcPspSceKernelReferSystemStatus(status.rawAddress)

public actual fun sceKernelCreateMsgPipe(name: ConstPtr<UByte>, part: Int, attr: Int, unk1: MutPtr<CVoid>, opt: MutPtr<CVoid>): SceUid =
    SceUid()

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    0

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>): Int =
    0

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>): Int =
    0

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: MutPtr<Int>, recv: MutPtr<Int>): Int =
    0

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: MutPtr<SceKernelMppInfo>): Int =
    0

public actual fun sceKernelCreateVpl(name: ConstPtr<UByte>, part: Int, attr: Int, size: UInt, opt: MutPtr<SceKernelVplOptParam>): SceUid =
    SceUid()

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    0

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: MutPtr<MutPtr<CVoid>>): Int =
    0

public actual fun sceKernelFreeVpl(uid: SceUid, data: MutPtr<CVoid>): Int =
    0

public actual fun sceKernelCancelVpl(uid: SceUid, num: MutPtr<Int>): Int =
    0

public actual fun sceKernelReferVplStatus(uid: SceUid, info: MutPtr<SceKernelVplInfo>): Int =
    0

public actual fun sceKernelCreateFpl(name: ConstPtr<UByte>, part: Int, attr: Int, size: UInt, blocks: UInt, opt: MutPtr<SceKernelFplOptParam>): Int =
    PspJniBridge.libcPspSceKernelCreateFpl(name.rawAddress, part, attr, size.toInt(), blocks.toInt(), opt.rawAddress)

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    0

public actual fun sceKernelAllocateFpl(uid: SceUid, data: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int =
    0

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: MutPtr<MutPtr<CVoid>>): Int =
    0

public actual fun sceKernelFreeFpl(uid: SceUid, data: MutPtr<CVoid>): Int =
    0

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: MutPtr<Int>): Int =
    0

public actual fun sceKernelReferFplStatus(uid: SceUid, info: MutPtr<SceKernelFplInfo>): Int =
    0

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: MutPtr<SceKernelSysClock>): Int =
    PspJniBridge.libcPspSceKernelUSec2SysClock(usec.toInt(), clock.rawAddress)

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    PspJniBridge.libcPspSceKernelUSec2SysClockWide(usec.toInt())

public actual fun sceKernelSysClock2USec(clock: MutPtr<SceKernelSysClock>, low: MutPtr<UInt>, high: MutPtr<UInt>): Int =
    PspJniBridge.libcPspSceKernelSysClock2USec(clock.rawAddress, low.rawAddress, high.rawAddress)

public actual fun sceKernelSysClock2USecWide(clock: Long, low: MutPtr<UInt>, high: MutPtr<UInt>): Int =
    PspJniBridge.libcPspSceKernelSysClock2USecWide(clock, low.rawAddress, high.rawAddress)

public actual fun sceKernelGetSystemTime(time: MutPtr<SceKernelSysClock>): Int =
    PspJniBridge.libcPspSceKernelGetSystemTime(time.rawAddress)

public actual fun sceKernelGetSystemTimeWide(): Long =
    PspJniBridge.libcPspSceKernelGetSystemTimeWide()

public actual fun sceKernelGetSystemTimeLow(): UInt =
    PspJniBridge.libcPspSceKernelGetSystemTimeLow().toUInt()

public actual fun sceKernelCreateVTimer(name: ConstPtr<UByte>, opt: MutPtr<SceKernelVTimerOptParam>): SceUid =
    SceUid()

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: MutPtr<SceKernelSysClock>): Int =
    0

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    0L

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: MutPtr<SceKernelSysClock>): Int =
    0

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    0L

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: MutPtr<SceKernelSysClock>): Int =
    0

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    0L

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: MutPtr<SceKernelSysClock>, handler: SceKernelVTimerHandler, common: MutPtr<CVoid>): Int =
    0

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: MutPtr<CVoid>): Int =
    0

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    0

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: MutPtr<SceKernelVTimerInfo>): Int =
    0

public actual fun sceKernelRegisterThreadEventHandler(name: ConstPtr<UByte>, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: MutPtr<CVoid>): SceUid =
    SceUid()

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    0

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: MutPtr<SceKernelThreadEventHandlerInfo>): Int =
    0

public actual fun sceKernelReferThreadProfiler(): MutPtr<DebugProfilerRegs> =
    MutPtr(PspJniBridge.libcPspSceKernelReferThreadProfiler())

public actual fun sceKernelReferGlobalProfiler(): MutPtr<DebugProfilerRegs> =
    MutPtr(PspJniBridge.libcPspSceKernelReferGlobalProfiler())

public actual fun sceUsbStart(driverName: ConstPtr<UByte>, size: Int, args: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceUsbStart(driverName.rawAddress, size, args.rawAddress)

public actual fun sceUsbStop(driverName: ConstPtr<UByte>, size: Int, args: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceUsbStop(driverName.rawAddress, size, args.rawAddress)

public actual fun sceUsbActivate(pid: UInt): Int =
    PspJniBridge.libcPspSceUsbActivate(pid.toInt())

public actual fun sceUsbDeactivate(pid: UInt): Int =
    PspJniBridge.libcPspSceUsbDeactivate(pid.toInt())

public actual fun sceUsbGetState(): Int =
    PspJniBridge.libcPspSceUsbGetState()

public actual fun sceUsbGetDrvState(driverName: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceUsbGetDrvState(driverName.rawAddress)

public actual fun sceUsbCamSetupStill(param: MutPtr<UsbCamSetupStillParam>): Int =
    PspJniBridge.libcPspSceUsbCamSetupStill(param.rawAddress)

public actual fun sceUsbCamSetupStillEx(param: MutPtr<UsbCamSetupStillExParam>): Int =
    PspJniBridge.libcPspSceUsbCamSetupStillEx(param.rawAddress)

public actual fun sceUsbCamStillInputBlocking(buf: MutPtr<UByte>, size: ULong): Int =
    PspJniBridge.libcPspSceUsbCamStillInputBlocking(buf.rawAddress, size.toLong())

public actual fun sceUsbCamStillInput(buf: MutPtr<UByte>, size: ULong): Int =
    PspJniBridge.libcPspSceUsbCamStillInput(buf.rawAddress, size.toLong())

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    PspJniBridge.libcPspSceUsbCamStillWaitInputEnd()

public actual fun sceUsbCamStillPollInputEnd(): Int =
    PspJniBridge.libcPspSceUsbCamStillPollInputEnd()

public actual fun sceUsbCamStillCancelInput(): Int =
    PspJniBridge.libcPspSceUsbCamStillCancelInput()

public actual fun sceUsbCamStillGetInputLength(): Int =
    PspJniBridge.libcPspSceUsbCamStillGetInputLength()

public actual fun sceUsbCamSetupVideo(param: MutPtr<UsbCamSetupVideoParam>, workArea: MutPtr<CVoid>, workAreaSize: Int): Int =
    PspJniBridge.libcPspSceUsbCamSetupVideo(param.rawAddress, workArea.rawAddress, workAreaSize)

public actual fun sceUsbCamSetupVideoEx(param: MutPtr<UsbCamSetupVideoExParam>, workArea: MutPtr<CVoid>, workAreaSize: Int): Int =
    PspJniBridge.libcPspSceUsbCamSetupVideoEx(param.rawAddress, workArea.rawAddress, workAreaSize)

public actual fun sceUsbCamStartVideo(): Int =
    PspJniBridge.libcPspSceUsbCamStartVideo()

public actual fun sceUsbCamStopVideo(): Int =
    PspJniBridge.libcPspSceUsbCamStopVideo()

public actual fun sceUsbCamReadVideoFrameBlocking(buf: MutPtr<UByte>, size: ULong): Int =
    PspJniBridge.libcPspSceUsbCamReadVideoFrameBlocking(buf.rawAddress, size.toLong())

public actual fun sceUsbCamReadVideoFrame(buf: MutPtr<UByte>, size: ULong): Int =
    PspJniBridge.libcPspSceUsbCamReadVideoFrame(buf.rawAddress, size.toLong())

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    PspJniBridge.libcPspSceUsbCamWaitReadVideoFrameEnd()

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    PspJniBridge.libcPspSceUsbCamPollReadVideoFrameEnd()

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    PspJniBridge.libcPspSceUsbCamGetReadVideoFrameSize()

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    PspJniBridge.libcPspSceUsbCamSetSaturation(saturation)

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    PspJniBridge.libcPspSceUsbCamSetBrightness(brightness)

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    PspJniBridge.libcPspSceUsbCamSetContrast(contrast)

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    PspJniBridge.libcPspSceUsbCamSetSharpness(sharpness)

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    0

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    0

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    PspJniBridge.libcPspSceUsbCamSetReverseMode(reverseFlags)

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    PspJniBridge.libcPspSceUsbCamSetZoom(zoom)

public actual fun sceUsbCamGetSaturation(saturation: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceUsbCamGetSaturation(saturation.rawAddress)

public actual fun sceUsbCamGetBrightness(brightness: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceUsbCamGetBrightness(brightness.rawAddress)

public actual fun sceUsbCamGetContrast(contrast: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceUsbCamGetContrast(contrast.rawAddress)

public actual fun sceUsbCamGetSharpness(sharpness: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceUsbCamGetSharpness(sharpness.rawAddress)

public actual fun sceUsbCamGetImageEffectMode(effectMode: MutPtr<UsbCamEffectMode>): Int =
    PspJniBridge.libcPspSceUsbCamGetImageEffectMode(effectMode.rawAddress)

public actual fun sceUsbCamGetEvLevel(exposureLevel: MutPtr<UsbCamEvLevel>): Int =
    PspJniBridge.libcPspSceUsbCamGetEvLevel(exposureLevel.rawAddress)

public actual fun sceUsbCamGetReverseMode(reverseFlags: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceUsbCamGetReverseMode(reverseFlags.rawAddress)

public actual fun sceUsbCamGetZoom(zoom: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceUsbCamGetZoom(zoom.rawAddress)

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    PspJniBridge.libcPspSceUsbCamAutoImageReverseSW(on)

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    PspJniBridge.libcPspSceUsbCamGetAutoImageReverseState()

public actual fun sceUsbCamGetLensDirection(): Int =
    PspJniBridge.libcPspSceUsbCamGetLensDirection()

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    0

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    PspJniBridge.libcPspSceUsbstorBootUnregisterNotify(eventFlag.toInt())

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    PspJniBridge.libcPspSceUsbstorBootSetCapacity(size.toInt())

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    0

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    PspJniBridge.libcPspScePowerUnregisterCallback(slot)

public actual fun scePowerIsPowerOnline(): Int =
    PspJniBridge.libcPspScePowerIsPowerOnline()

public actual fun scePowerIsBatteryExist(): Int =
    PspJniBridge.libcPspScePowerIsBatteryExist()

public actual fun scePowerIsBatteryCharging(): Int =
    PspJniBridge.libcPspScePowerIsBatteryCharging()

public actual fun scePowerGetBatteryChargingStatus(): Int =
    PspJniBridge.libcPspScePowerGetBatteryChargingStatus()

public actual fun scePowerIsLowBattery(): Int =
    PspJniBridge.libcPspScePowerIsLowBattery()

public actual fun scePowerGetBatteryLifePercent(): Int =
    PspJniBridge.libcPspScePowerGetBatteryLifePercent()

public actual fun scePowerGetBatteryLifeTime(): Int =
    PspJniBridge.libcPspScePowerGetBatteryLifeTime()

public actual fun scePowerGetBatteryTemp(): Int =
    PspJniBridge.libcPspScePowerGetBatteryTemp()

public actual fun scePowerGetBatteryElec(): Int =
    PspJniBridge.libcPspScePowerGetBatteryElec()

public actual fun scePowerGetBatteryVolt(): Int =
    PspJniBridge.libcPspScePowerGetBatteryVolt()

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    PspJniBridge.libcPspScePowerSetCpuClockFrequency(cpufreq)

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    PspJniBridge.libcPspScePowerSetBusClockFrequency(busfreq)

public actual fun scePowerGetCpuClockFrequency(): Int =
    PspJniBridge.libcPspScePowerGetCpuClockFrequency()

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    PspJniBridge.libcPspScePowerGetCpuClockFrequencyInt()

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    PspJniBridge.libcPspScePowerGetCpuClockFrequencyFloat()

public actual fun scePowerGetBusClockFrequency(): Int =
    PspJniBridge.libcPspScePowerGetBusClockFrequency()

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    PspJniBridge.libcPspScePowerGetBusClockFrequencyInt()

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    PspJniBridge.libcPspScePowerGetBusClockFrequencyFloat()

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    PspJniBridge.libcPspScePowerSetClockFrequency(pllfreq, cpufreq, busfreq)

public actual fun scePowerLock(unknown: Int): Int =
    PspJniBridge.libcPspScePowerLock(unknown)

public actual fun scePowerUnlock(unknown: Int): Int =
    PspJniBridge.libcPspScePowerUnlock(unknown)

public actual fun scePowerTick(t: PowerTick): Int =
    0

public actual fun scePowerGetIdleTimer(): Int =
    PspJniBridge.libcPspScePowerGetIdleTimer()

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    PspJniBridge.libcPspScePowerIdleTimerEnable(unknown)

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    PspJniBridge.libcPspScePowerIdleTimerDisable(unknown)

public actual fun scePowerRequestStandby(): Int =
    PspJniBridge.libcPspScePowerRequestStandby()

public actual fun scePowerRequestSuspend(): Int =
    PspJniBridge.libcPspScePowerRequestSuspend()

public actual fun sceWlanDevIsPowerOn(): Int =
    PspJniBridge.libcPspSceWlanDevIsPowerOn()

public actual fun sceWlanGetSwitchState(): Int =
    PspJniBridge.libcPspSceWlanGetSwitchState()

public actual fun sceWlanGetEtherAddr(etherAddr: MutPtr<UByte>): Int =
    PspJniBridge.libcPspSceWlanGetEtherAddr(etherAddr.rawAddress)

public actual fun sceWlanDevAttach(): Int =
    PspJniBridge.libcPspSceWlanDevAttach()

public actual fun sceWlanDevDetach(): Int =
    PspJniBridge.libcPspSceWlanDevDetach()

public actual fun sceRtcGetTickResolution(): UInt =
    PspJniBridge.libcPspSceRtcGetTickResolution().toUInt()

public actual fun sceRtcGetCurrentTick(tick: MutPtr<ULong>): Int =
    PspJniBridge.libcPspSceRtcGetCurrentTick(tick.rawAddress)

public actual fun sceRtcGetCurrentClock(tm: MutPtr<ScePspDateTime>, tz: Int): Int =
    PspJniBridge.libcPspSceRtcGetCurrentClock(tm.rawAddress, tz)

public actual fun sceRtcGetCurrentClockLocalTime(tm: MutPtr<ScePspDateTime>): Int =
    PspJniBridge.libcPspSceRtcGetCurrentClockLocalTime(tm.rawAddress)

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: ConstPtr<ULong>, tickLocal: MutPtr<ULong>): Int =
    PspJniBridge.libcPspSceRtcConvertUtcToLocalTime(tickUtc.rawAddress, tickLocal.rawAddress)

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: ConstPtr<ULong>, tickUtc: MutPtr<ULong>): Int =
    PspJniBridge.libcPspSceRtcConvertLocalTimeToUTC(tickLocal.rawAddress, tickUtc.rawAddress)

public actual fun sceRtcIsLeapYear(year: Int): Int =
    PspJniBridge.libcPspSceRtcIsLeapYear(year)

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    PspJniBridge.libcPspSceRtcGetDaysInMonth(year, month)

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    PspJniBridge.libcPspSceRtcGetDayOfWeek(year, month, day)

public actual fun sceRtcCheckValid(date: ConstPtr<ScePspDateTime>): Int =
    PspJniBridge.libcPspSceRtcCheckValid(date.rawAddress)

public actual fun sceRtcSetTick(date: MutPtr<ScePspDateTime>, tick: ConstPtr<ULong>): Int =
    PspJniBridge.libcPspSceRtcSetTick(date.rawAddress, tick.rawAddress)

public actual fun sceRtcGetTick(date: ConstPtr<ScePspDateTime>, tick: MutPtr<ULong>): Int =
    PspJniBridge.libcPspSceRtcGetTick(date.rawAddress, tick.rawAddress)

public actual fun sceRtcCompareTick(tick1: ConstPtr<ULong>, tick2: ConstPtr<ULong>): Int =
    PspJniBridge.libcPspSceRtcCompareTick(tick1.rawAddress, tick2.rawAddress)

public actual fun sceRtcTickAddTicks(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numTicks: ULong): Int =
    PspJniBridge.libcPspSceRtcTickAddTicks(destTick.rawAddress, srcTick.rawAddress, numTicks.toLong())

public actual fun sceRtcTickAddMicroseconds(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numMs: ULong): Int =
    PspJniBridge.libcPspSceRtcTickAddMicroseconds(destTick.rawAddress, srcTick.rawAddress, numMs.toLong())

public actual fun sceRtcTickAddSeconds(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numSeconds: ULong): Int =
    PspJniBridge.libcPspSceRtcTickAddSeconds(destTick.rawAddress, srcTick.rawAddress, numSeconds.toLong())

public actual fun sceRtcTickAddMinutes(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numMinutes: ULong): Int =
    PspJniBridge.libcPspSceRtcTickAddMinutes(destTick.rawAddress, srcTick.rawAddress, numMinutes.toLong())

public actual fun sceRtcTickAddHours(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numHours: ULong): Int =
    PspJniBridge.libcPspSceRtcTickAddHours(destTick.rawAddress, srcTick.rawAddress, numHours.toLong())

public actual fun sceRtcTickAddDays(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numDays: ULong): Int =
    PspJniBridge.libcPspSceRtcTickAddDays(destTick.rawAddress, srcTick.rawAddress, numDays.toLong())

public actual fun sceRtcTickAddWeeks(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numWeeks: ULong): Int =
    PspJniBridge.libcPspSceRtcTickAddWeeks(destTick.rawAddress, srcTick.rawAddress, numWeeks.toLong())

public actual fun sceRtcTickAddMonths(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numMonths: ULong): Int =
    PspJniBridge.libcPspSceRtcTickAddMonths(destTick.rawAddress, srcTick.rawAddress, numMonths.toLong())

public actual fun sceRtcTickAddYears(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numYears: ULong): Int =
    PspJniBridge.libcPspSceRtcTickAddYears(destTick.rawAddress, srcTick.rawAddress, numYears.toLong())

public actual fun sceRtcSetTimeT(date: MutPtr<ScePspDateTime>, time: UInt): Int =
    PspJniBridge.libcPspSceRtcSetTimeT(date.rawAddress, time.toInt())

public actual fun sceRtcGetTimeT(date: ConstPtr<ScePspDateTime>, time: MutPtr<UInt>): Int =
    PspJniBridge.libcPspSceRtcGetTimeT(date.rawAddress, time.rawAddress)

public actual fun sceRtcSetTime64T(date: MutPtr<ScePspDateTime>, time: ULong): Int =
    PspJniBridge.libcPspSceRtcSetTime64T(date.rawAddress, time.toLong())

public actual fun sceRtcGetTime64T(date: ConstPtr<ScePspDateTime>, time: MutPtr<ULong>): Int =
    PspJniBridge.libcPspSceRtcGetTime64T(date.rawAddress, time.rawAddress)

public actual fun sceRtcSetDosTime(date: MutPtr<ScePspDateTime>, dosTime: UInt): Int =
    PspJniBridge.libcPspSceRtcSetDosTime(date.rawAddress, dosTime.toInt())

public actual fun sceRtcGetDosTime(date: MutPtr<ScePspDateTime>, dosTime: UInt): Int =
    PspJniBridge.libcPspSceRtcGetDosTime(date.rawAddress, dosTime.toInt())

public actual fun sceRtcSetWin32FileTime(date: MutPtr<ScePspDateTime>, time: MutPtr<ULong>): Int =
    PspJniBridge.libcPspSceRtcSetWin32FileTime(date.rawAddress, time.rawAddress)

public actual fun sceRtcGetWin32FileTime(date: MutPtr<ScePspDateTime>, time: MutPtr<ULong>): Int =
    PspJniBridge.libcPspSceRtcGetWin32FileTime(date.rawAddress, time.rawAddress)

public actual fun sceRtcParseDateTime(destTick: MutPtr<ULong>, dateString: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceRtcParseDateTime(destTick.rawAddress, dateString.rawAddress)

public actual fun sceRtcFormatRFC3339(pszDateTime: MutPtr<CChar>, pUtc: ConstPtr<ULong>, timeZoneMinutes: Int): Int =
    PspJniBridge.libcPspSceRtcFormatRFC3339(pszDateTime.rawAddress, pUtc.rawAddress, timeZoneMinutes)

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: MutPtr<CChar>, pUtc: ConstPtr<ULong>): Int =
    PspJniBridge.libcPspSceRtcFormatRFC3339LocalTime(pszDateTime.rawAddress, pUtc.rawAddress)

public actual fun sceRtcParseRFC3339(pUtc: MutPtr<ULong>, pszDateTime: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceRtcParseRFC3339(pUtc.rawAddress, pszDateTime.rawAddress)

public actual fun sceRtcFormatRFC2822(pszDateTime: MutPtr<CChar>, pUtc: ConstPtr<ULong>, timeZoneMinutes: Int): Int =
    PspJniBridge.libcPspSceRtcFormatRFC2822(pszDateTime.rawAddress, pUtc.rawAddress, timeZoneMinutes)

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: MutPtr<CChar>, pUtc: ConstPtr<ULong>): Int =
    PspJniBridge.libcPspSceRtcFormatRFC2822LocalTime(pszDateTime.rawAddress, pUtc.rawAddress)

public actual fun sceIoOpen(file: ConstPtr<UByte>, flags: Int, permissions: IoPermissions): SceUid =
    SceUid()

public actual fun sceIoOpenAsync(file: ConstPtr<UByte>, flags: Int, permissions: IoPermissions): SceUid =
    SceUid()

public actual fun sceIoClose(fd: SceUid): Int =
    0

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    0

public actual fun sceIoRead(fd: SceUid, data: MutPtr<CVoid>, size: UInt): Int =
    0

public actual fun sceIoReadAsync(fd: SceUid, data: MutPtr<CVoid>, size: UInt): Int =
    0

public actual fun sceIoWrite(fd: SceUid, data: ConstPtr<CVoid>, size: ULong): Int =
    0

public actual fun sceIoWriteAsync(fd: SceUid, data: ConstPtr<CVoid>, size: UInt): Int =
    0

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    0L

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    0

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    0

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    0

public actual fun sceIoRemove(file: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceIoRemove(file.rawAddress)

public actual fun sceIoMkdir(dir: ConstPtr<UByte>, mode: IoPermissions): Int =
    PspJniBridge.libcPspSceIoMkdir(dir.rawAddress, mode)

public actual fun sceIoRmdir(path: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceIoRmdir(path.rawAddress)

public actual fun sceIoChdir(path: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceIoChdir(path.rawAddress)

public actual fun sceIoRename(oldname: ConstPtr<UByte>, newname: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceIoRename(oldname.rawAddress, newname.rawAddress)

public actual fun sceIoDopen(dirname: ConstPtr<UByte>): SceUid =
    SceUid()

public actual fun sceIoDread(fd: SceUid, dir: MutPtr<SceIoDirent>): Int =
    0

public actual fun sceIoDclose(fd: SceUid): Int =
    0

public actual fun sceIoDevctl(dev: ConstPtr<UByte>, cmd: UInt, indata: MutPtr<CVoid>, inlen: Int, outdata: MutPtr<CVoid>, outlen: Int): Int =
    PspJniBridge.libcPspSceIoDevctl(dev.rawAddress, cmd.toInt(), indata.rawAddress, inlen, outdata.rawAddress, outlen)

public actual fun sceIoAssign(dev1: ConstPtr<UByte>, dev2: ConstPtr<UByte>, dev3: ConstPtr<UByte>, mode: IoAssignPerms, unk1: MutPtr<CVoid>, unk2: Int): Int =
    0

public actual fun sceIoUnassign(dev: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceIoUnassign(dev.rawAddress)

public actual fun sceIoGetstat(file: ConstPtr<UByte>, stat: MutPtr<SceIoStat>): Int =
    PspJniBridge.libcPspSceIoGetstat(file.rawAddress, stat.rawAddress)

public actual fun sceIoChstat(file: ConstPtr<UByte>, stat: MutPtr<SceIoStat>, bits: Int): Int =
    PspJniBridge.libcPspSceIoChstat(file.rawAddress, stat.rawAddress, bits)

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: MutPtr<CVoid>, inlen: Int, outdata: MutPtr<CVoid>, outlen: Int): Int =
    0

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: MutPtr<CVoid>, inlen: Int, outdata: MutPtr<CVoid>, outlen: Int): Int =
    0

public actual fun sceIoSync(device: ConstPtr<UByte>, unk: UInt): Int =
    PspJniBridge.libcPspSceIoSync(device.rawAddress, unk.toInt())

public actual fun sceIoWaitAsync(fd: SceUid, res: MutPtr<Long>): Int =
    0

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: MutPtr<Long>): Int =
    0

public actual fun sceIoPollAsync(fd: SceUid, res: MutPtr<Long>): Int =
    0

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: MutPtr<Long>): Int =
    0

public actual fun sceIoCancel(fd: SceUid): Int =
    0

public actual fun sceIoGetDevType(fd: SceUid): Int =
    0

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    0

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: MutPtr<CVoid>): Int =
    0

public actual fun sceJpegInitMJpeg(): Int =
    PspJniBridge.libcPspSceJpegInitMJpeg()

public actual fun sceJpegFinishMJpeg(): Int =
    PspJniBridge.libcPspSceJpegFinishMJpeg()

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    PspJniBridge.libcPspSceJpegCreateMJpeg(width, height)

public actual fun sceJpegDeleteMJpeg(): Int =
    PspJniBridge.libcPspSceJpegDeleteMJpeg()

public actual fun sceJpegDecodeMJpeg(jpegBuf: MutPtr<UByte>, size: ULong, rgba: MutPtr<CVoid>, unk: UInt): Int =
    PspJniBridge.libcPspSceJpegDecodeMJpeg(jpegBuf.rawAddress, size.toLong(), rgba.rawAddress, unk.toInt())

public actual fun sceUmdCheckMedium(): Int =
    PspJniBridge.libcPspSceUmdCheckMedium()

public actual fun sceUmdGetDiscInfo(info: MutPtr<UmdInfo>): Int =
    PspJniBridge.libcPspSceUmdGetDiscInfo(info.rawAddress)

public actual fun sceUmdActivate(unit: Int, drive: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceUmdActivate(unit, drive.rawAddress)

public actual fun sceUmdDeactivate(unit: Int, drive: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceUmdDeactivate(unit, drive.rawAddress)

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    PspJniBridge.libcPspSceUmdWaitDriveStat(state)

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    PspJniBridge.libcPspSceUmdWaitDriveStatWithTimer(state, timeout.toInt())

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    PspJniBridge.libcPspSceUmdWaitDriveStatCB(state, timeout.toInt())

public actual fun sceUmdCancelWaitDriveStat(): Int =
    PspJniBridge.libcPspSceUmdCancelWaitDriveStat()

public actual fun sceUmdGetDriveStat(): Int =
    PspJniBridge.libcPspSceUmdGetDriveStat()

public actual fun sceUmdGetErrorStat(): Int =
    PspJniBridge.libcPspSceUmdGetErrorStat()

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    PspJniBridge.libcPspSceUmdRegisterUMDCallBack(cbid)

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    PspJniBridge.libcPspSceUmdUnRegisterUMDCallBack(cbid)

public actual fun sceUmdReplacePermit(): Int =
    PspJniBridge.libcPspSceUmdReplacePermit()

public actual fun sceUmdReplaceProhibit(): Int =
    PspJniBridge.libcPspSceUmdReplaceProhibit()

public actual fun sceMpegInit(): Int =
    PspJniBridge.libcPspSceMpegInit()

public actual fun sceMpegFinish() {
    PspJniBridge.libcPspSceMpegFinish()
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    PspJniBridge.libcPspSceMpegRingbufferQueryMemSize(packets)

public actual fun sceMpegRingbufferConstruct(ringbuffer: MutPtr<SceMpegRingbuffer>, packets: Int, data: MutPtr<CVoid>, size: Int, callback: SceMpegRingbufferCb, cbParam: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceMpegRingbufferConstruct(ringbuffer.rawAddress, packets, data.rawAddress, size, 0L, cbParam.rawAddress)

public actual fun sceMpegRingbufferDestruct(ringbuffer: MutPtr<SceMpegRingbuffer>) {
    PspJniBridge.libcPspSceMpegRingbufferDestruct(ringbuffer.rawAddress)
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: MutPtr<SceMpegRingbuffer>): Int =
    PspJniBridge.libcPspSceMpegRingbufferAvailableSize(ringbuffer.rawAddress)

public actual fun sceMpegRingbufferPut(ringbuffer: MutPtr<SceMpegRingbuffer>, numPackets: Int, available: Int): Int =
    PspJniBridge.libcPspSceMpegRingbufferPut(ringbuffer.rawAddress, numPackets, available)

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    PspJniBridge.libcPspSceMpegQueryMemSize(unk)

public actual fun sceMpegCreate(handle: SceMpeg, data: MutPtr<CVoid>, size: Int, ringbuffer: MutPtr<SceMpegRingbuffer>, frameWidth: Int, unk1: Int, unk2: Int): Int =
    0

public actual fun sceMpegDelete(handle: SceMpeg) {
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: MutPtr<CVoid>, offset: MutPtr<Int>): Int =
    0

public actual fun sceMpegQueryStreamSize(buffer: MutPtr<CVoid>, size: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceMpegQueryStreamSize(buffer.rawAddress, size.rawAddress)

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    SceMpegStream()

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
}

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    0

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): MutPtr<CVoid> =
    MutPtr(0L)

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: MutPtr<CVoid>) {
}

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: MutPtr<Int>, outSize: MutPtr<Int>): Int =
    0

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: MutPtr<CVoid>, au: MutPtr<SceMpegAu>): Int =
    0

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: MutPtr<SceMpegAu>, unk: MutPtr<Int>): Int =
    0

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: MutPtr<SceMpegAvcMode>): Int =
    0

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: MutPtr<SceMpegAu>, iframeWidth: Int, buffer: MutPtr<CVoid>, init: MutPtr<Int>): Int =
    0

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: MutPtr<CVoid>, status: MutPtr<Int>): Int =
    0

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: MutPtr<SceMpegAu>, unk: MutPtr<CVoid>): Int =
    0

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: MutPtr<SceMpegAu>, buffer: MutPtr<CVoid>, init: Int): Int =
    0

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: MutPtr<CVoid>, buffer: MutPtr<Int>, type: Int): Int =
    PspJniBridge.libcPspSceMpegBaseYCrCbCopyVme(yuvBuffer.rawAddress, buffer.rawAddress, type)

public actual fun sceMpegBaseCscInit(width: Int): Int =
    PspJniBridge.libcPspSceMpegBaseCscInit(width)

public actual fun sceMpegBaseCscVme(rgbBuffer: MutPtr<CVoid>, rgbBuffer2: MutPtr<CVoid>, width: Int, yCrCbBuffer: MutPtr<SceMpegYCrCbBuffer>): Int =
    PspJniBridge.libcPspSceMpegBaseCscVme(rgbBuffer.rawAddress, rgbBuffer2.rawAddress, width, yCrCbBuffer.rawAddress)

public actual fun sceMpegbaseBea18f91(lli: MutPtr<SceMpegLLI>): Int =
    PspJniBridge.libcPspSceMpegbaseBea18f91(lli.rawAddress)

public actual fun sceHprmPeekCurrentKey(key: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceHprmPeekCurrentKey(key.rawAddress)

public actual fun sceHprmPeekLatch(latch: MutPtr<UIntArray>): Int =
    PspJniBridge.libcPspSceHprmPeekLatch(latch.rawAddress)

public actual fun sceHprmReadLatch(latch: MutPtr<UIntArray>): Int =
    PspJniBridge.libcPspSceHprmReadLatch(latch.rawAddress)

public actual fun sceHprmIsHeadphoneExist(): Int =
    PspJniBridge.libcPspSceHprmIsHeadphoneExist()

public actual fun sceHprmIsRemoteExist(): Int =
    PspJniBridge.libcPspSceHprmIsRemoteExist()

public actual fun sceHprmIsMicrophoneExist(): Int =
    PspJniBridge.libcPspSceHprmIsMicrophoneExist()

public actual fun sceGuDepthBuffer(zbp: MutPtr<CVoid>, zbw: Int) {
    PspJniBridge.libcPspSceGuDepthBuffer(zbp.rawAddress, zbw)
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: MutPtr<CVoid>, dispbw: Int) {
    PspJniBridge.libcPspSceGuDispBuffer(width, height, dispbp.rawAddress, dispbw)
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: MutPtr<CVoid>, fbw: Int) {
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: MutPtr<CVoid>, fbw: Int) {
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    PspJniBridge.libcPspSceGuDisplay(state)

public actual fun sceGuDepthFunc(function: DepthFunc) {
}

public actual fun sceGuDepthMask(mask: Int) {
    PspJniBridge.libcPspSceGuDepthMask(mask)
}

public actual fun sceGuDepthOffset(offset: Int) {
    PspJniBridge.libcPspSceGuDepthOffset(offset)
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    PspJniBridge.libcPspSceGuDepthRange(near, far)
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    PspJniBridge.libcPspSceGuFog(near, far, color.toInt())
}

public actual fun sceGuInit() {
    PspJniBridge.libcPspSceGuInit()
}

public actual fun sceGuTerm() {
    PspJniBridge.libcPspSceGuTerm()
}

public actual fun sceGuBreak(mode: Int) {
    PspJniBridge.libcPspSceGuBreak(mode)
}

public actual fun sceGuContinue() {
    PspJniBridge.libcPspSceGuContinue()
}

public actual fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback =
    null

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
}

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
}

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
}

public actual fun sceGuGetMemory(size: Int): MutPtr<CVoid> =
    MutPtr(PspJniBridge.libcPspSceGuGetMemory(size))

public actual fun sceGuStart(contextType: GuContextType, list: MutPtr<CVoid>) {
}

public actual fun sceGuFinish(): Int =
    PspJniBridge.libcPspSceGuFinish()

public actual fun sceGuFinishId(id: UInt): Int =
    PspJniBridge.libcPspSceGuFinishId(id.toInt())

public actual fun sceGuCallList(list: ConstPtr<CVoid>) {
    PspJniBridge.libcPspSceGuCallList(list.rawAddress)
}

public actual fun sceGuCallMode(mode: Int) {
    PspJniBridge.libcPspSceGuCallMode(mode)
}

public actual fun sceGuCheckList(): Int =
    PspJniBridge.libcPspSceGuCheckList()

public actual fun sceGuSendList(mode: GuQueueMode, list: ConstPtr<CVoid>, context: MutPtr<GeContext>) {
}

public actual fun sceGuSwapBuffers(): MutPtr<CVoid> =
    MutPtr(PspJniBridge.libcPspSceGuSwapBuffers())

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    GeListState.entries.first()

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>) {
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>) {
    PspJniBridge.libcPspSceGuBeginObject(vtype, count, indices.rawAddress, vertices.rawAddress)
}

public actual fun sceGuEndObject() {
    PspJniBridge.libcPspSceGuEndObject()
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    false

public actual fun sceGuSetAllStatus(status: Int) {
    PspJniBridge.libcPspSceGuSetAllStatus(status)
}

public actual fun sceGuGetAllStatus(): Int =
    PspJniBridge.libcPspSceGuGetAllStatus()

public actual fun sceGuEnable(state: GuState) {
}

public actual fun sceGuDisable(state: GuState) {
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    PspJniBridge.libcPspSceGuLightAtt(light, atten0, atten1, atten2)
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    PspJniBridge.libcPspSceGuLightColor(light, component, color.toInt())
}

public actual fun sceGuLightMode(mode: LightMode) {
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
}

public actual fun sceGuClear(flags: Int) {
    PspJniBridge.libcPspSceGuClear(flags)
}

public actual fun sceGuClearColor(color: UInt) {
    PspJniBridge.libcPspSceGuClearColor(color.toInt())
}

public actual fun sceGuClearDepth(depth: UInt) {
    PspJniBridge.libcPspSceGuClearDepth(depth.toInt())
}

public actual fun sceGuClearStencil(stencil: UInt) {
    PspJniBridge.libcPspSceGuClearStencil(stencil.toInt())
}

public actual fun sceGuPixelMask(mask: UInt) {
    PspJniBridge.libcPspSceGuPixelMask(mask.toInt())
}

public actual fun sceGuColor(color: UInt) {
    PspJniBridge.libcPspSceGuColor(color.toInt())
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
}

public actual fun sceGuColorMaterial(components: Int) {
    PspJniBridge.libcPspSceGuColorMaterial(components)
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
}

public actual fun sceGuAmbient(color: UInt) {
    PspJniBridge.libcPspSceGuAmbient(color.toInt())
}

public actual fun sceGuAmbientColor(color: UInt) {
    PspJniBridge.libcPspSceGuAmbientColor(color.toInt())
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    PspJniBridge.libcPspSceGuMaterial(components, color.toInt())
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    PspJniBridge.libcPspSceGuModelColor(emissive.toInt(), ambient.toInt(), diffuse.toInt(), specular.toInt())
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
}

public actual fun sceGuSpecular(power: Float) {
    PspJniBridge.libcPspSceGuSpecular(power)
}

public actual fun sceGuFrontFace(order: FrontFaceDirection) {
}

public actual fun sceGuLogicalOp(op: LogicalOperation) {
}

public actual fun sceGuSetDither(matrix: ScePspIMatrix4) {
}

public actual fun sceGuShadeModel(mode: ShadingModel) {
}

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: MutPtr<CVoid>, dx: Int, dy: Int, destw: Int, dest: MutPtr<CVoid>) {
}

public actual fun sceGuTexEnvColor(color: UInt) {
    PspJniBridge.libcPspSceGuTexEnvColor(color.toInt())
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
}

public actual fun sceGuTexFlush() {
    PspJniBridge.libcPspSceGuTexFlush()
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
}

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: ConstPtr<CVoid>) {
}

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
}

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
}

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
}

public actual fun sceGuTexOffset(u: Float, v: Float) {
    PspJniBridge.libcPspSceGuTexOffset(u, v)
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    PspJniBridge.libcPspSceGuTexScale(u, v)
}

public actual fun sceGuTexSlope(slope: Float) {
    PspJniBridge.libcPspSceGuTexSlope(slope)
}

public actual fun sceGuTexSync() {
    PspJniBridge.libcPspSceGuTexSync()
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: ConstPtr<CVoid>) {
    PspJniBridge.libcPspSceGuClutLoad(numBlocks, cbp.rawAddress)
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    PspJniBridge.libcPspSceGuOffset(x.toInt(), y.toInt())
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    PspJniBridge.libcPspSceGuScissor(x, y, w, h)
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    PspJniBridge.libcPspSceGuViewport(cx, cy, width, height)
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>) {
    PspJniBridge.libcPspSceGuDrawBezier(vType, uCount, vCount, indices.rawAddress, vertices.rawAddress)
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    PspJniBridge.libcPspSceGuPatchDivide(ulevel.toInt(), vlevel.toInt())
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    PspJniBridge.libcPspSceGuPatchFrontFace(a0.toInt())
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>) {
    PspJniBridge.libcPspSceGuDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices.rawAddress, vertices.rawAddress)
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    PspJniBridge.libcPspSceGuMorphWeight(index, weight)
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>) {
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>) {
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>) {
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>) {
    PspJniBridge.libcPspSceGumDrawBezier(vType, uCount, vCount, indices.rawAddress, vertices.rawAddress)
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>) {
    PspJniBridge.libcPspSceGumDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices.rawAddress, vertices.rawAddress)
}

public actual fun sceGumFastInverse() {
    PspJniBridge.libcPspSceGumFastInverse()
}

public actual fun sceGumFullInverse() {
    PspJniBridge.libcPspSceGumFullInverse()
}

public actual fun sceGumLoadIdentity() {
    PspJniBridge.libcPspSceGumLoadIdentity()
}

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4) {
}

public actual fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3) {
}

public actual fun sceGumMatrixMode(mode: MatrixMode) {
}

public actual fun sceGumMultMatrix(m: ScePspFMatrix4) {
}

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    PspJniBridge.libcPspSceGumOrtho(left, right, bottom, top, near, far)
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    PspJniBridge.libcPspSceGumPerspective(fovy, aspect, near, far)
}

public actual fun sceGumPopMatrix() {
    PspJniBridge.libcPspSceGumPopMatrix()
}

public actual fun sceGumPushMatrix() {
    PspJniBridge.libcPspSceGumPushMatrix()
}

public actual fun sceGumRotateX(angle: Float) {
    PspJniBridge.libcPspSceGumRotateX(angle)
}

public actual fun sceGumRotateY(angle: Float) {
    PspJniBridge.libcPspSceGumRotateY(angle)
}

public actual fun sceGumRotateZ(angle: Float) {
    PspJniBridge.libcPspSceGumRotateZ(angle)
}

public actual fun sceGumRotateXYZ(v: ScePspFVector3) {
}

public actual fun sceGumRotateZYX(v: ScePspFVector3) {
}

public actual fun sceGumScale(v: ScePspFVector3) {
}

public actual fun sceGumStoreMatrix(m: ScePspFMatrix4) {
}

public actual fun sceGumTranslate(v: ScePspFVector3) {
}

public actual fun sceGumUpdateMatrix() {
    PspJniBridge.libcPspSceGumUpdateMatrix()
}

public actual fun sceMp3ReserveMp3Handle(args: MutPtr<SceMp3InitArg>): Int =
    PspJniBridge.libcPspSceMp3ReserveMp3Handle(args.rawAddress)

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    0

public actual fun sceMp3InitResource(): Int =
    PspJniBridge.libcPspSceMp3InitResource()

public actual fun sceMp3TermResource(): Int =
    PspJniBridge.libcPspSceMp3TermResource()

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    0

public actual fun sceMp3Decode(handle: Mp3Handle, dst: MutPtr<MutPtr<Short>>): Int =
    0

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: MutPtr<MutPtr<UByte>>, toWrite: MutPtr<Int>, srcPos: MutPtr<Int>): Int =
    0

public actual fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int =
    0

public actual fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int =
    0

public actual fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int =
    0

public actual fun sceMp3GetLoopNum(handle: Mp3Handle): Int =
    0

public actual fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int =
    0

public actual fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int =
    0

public actual fun sceMp3GetSamplingRate(handle: Mp3Handle): Int =
    0

public actual fun sceMp3GetBitRate(handle: Mp3Handle): Int =
    0

public actual fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int =
    0

public actual fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int =
    0

public actual fun sceRegOpenRegistry(reg: MutPtr<Key>, mode: Int, handle: MutPtr<RegHandle>): Int =
    PspJniBridge.libcPspSceRegOpenRegistry(reg.rawAddress, mode, handle.rawAddress)

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    0

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    0

public actual fun sceRegOpenCategory(handle: RegHandle, name: ConstPtr<UByte>, mode: Int, dirHandle: MutPtr<RegHandle>): Int =
    0

public actual fun sceRegRemoveCategory(handle: RegHandle, name: ConstPtr<UByte>): Int =
    0

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    0

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    0

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: ConstPtr<UByte>, keyHandle: MutPtr<RegHandle>, type: MutPtr<KeyType>, size: MutPtr<ULong>): Int =
    0

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: ConstPtr<UByte>, type: MutPtr<KeyType>, size: MutPtr<ULong>): Int =
    0

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: MutPtr<CVoid>, size: ULong): Int =
    0

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: ConstPtr<UByte>, buf: MutPtr<CVoid>, size: ULong): Int =
    0

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: ConstPtr<UByte>, buf: ConstPtr<CVoid>, size: ULong): Int =
    0

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: MutPtr<Int>): Int =
    0

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: MutPtr<UByte>, num: Int): Int =
    0

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: ConstPtr<UByte>, type: Int, size: ULong): Int =
    0

public actual fun sceRegRemoveRegistry(key: MutPtr<Key>): Int =
    PspJniBridge.libcPspSceRegRemoveRegistry(key.rawAddress)

public actual fun sceOpenPSIDGetOpenPSID(openpsid: MutPtr<OpenPSID>): Int =
    PspJniBridge.libcPspSceOpenPSIDGetOpenPSID(openpsid.rawAddress)

public actual fun sceUtilityMsgDialogInitStart(params: MutPtr<UtilityMsgDialogParams>): Int =
    PspJniBridge.libcPspSceUtilityMsgDialogInitStart(params.rawAddress)

public actual fun sceUtilityMsgDialogShutdownStart() {
    PspJniBridge.libcPspSceUtilityMsgDialogShutdownStart()
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    PspJniBridge.libcPspSceUtilityMsgDialogGetStatus()

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    PspJniBridge.libcPspSceUtilityMsgDialogUpdate(n)
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    PspJniBridge.libcPspSceUtilityMsgDialogAbort()

public actual fun sceUtilityNetconfInitStart(data: MutPtr<UtilityNetconfData>): Int =
    PspJniBridge.libcPspSceUtilityNetconfInitStart(data.rawAddress)

public actual fun sceUtilityNetconfShutdownStart(): Int =
    PspJniBridge.libcPspSceUtilityNetconfShutdownStart()

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    PspJniBridge.libcPspSceUtilityNetconfUpdate(unknown)

public actual fun sceUtilityNetconfGetStatus(): Int =
    PspJniBridge.libcPspSceUtilityNetconfGetStatus()

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    PspJniBridge.libcPspSceUtilityCheckNetParam(id)

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: MutPtr<UtilityNetData>): Int =
    0

public actual fun sceUtilitySavedataInitStart(params: MutPtr<SceUtilitySavedataParam>): Int =
    PspJniBridge.libcPspSceUtilitySavedataInitStart(params.rawAddress)

public actual fun sceUtilitySavedataGetStatus(): Int =
    PspJniBridge.libcPspSceUtilitySavedataGetStatus()

public actual fun sceUtilitySavedataShutdownStart(): Int =
    PspJniBridge.libcPspSceUtilitySavedataShutdownStart()

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    PspJniBridge.libcPspSceUtilitySavedataUpdate(unknown)
}

public actual fun sceUtilityGameSharingInitStart(params: MutPtr<UtilityGameSharingParams>): Int =
    PspJniBridge.libcPspSceUtilityGameSharingInitStart(params.rawAddress)

public actual fun sceUtilityGameSharingShutdownStart() {
    PspJniBridge.libcPspSceUtilityGameSharingShutdownStart()
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    PspJniBridge.libcPspSceUtilityGameSharingGetStatus()

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    PspJniBridge.libcPspSceUtilityGameSharingUpdate(n)
}

public actual fun sceUtilityHtmlViewerInitStart(params: MutPtr<UtilityHtmlViewerParam>): Int =
    PspJniBridge.libcPspSceUtilityHtmlViewerInitStart(params.rawAddress)

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    PspJniBridge.libcPspSceUtilityHtmlViewerShutdownStart()

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    PspJniBridge.libcPspSceUtilityHtmlViewerUpdate(n)

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    PspJniBridge.libcPspSceUtilityHtmlViewerGetStatus()

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    0

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: ConstPtr<UByte>): Int =
    0

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: MutPtr<Int>): Int =
    0

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: MutPtr<UByte>, len: Int): Int =
    0

public actual fun sceUtilityOskInitStart(params: MutPtr<SceUtilityOskParams>): Int =
    PspJniBridge.libcPspSceUtilityOskInitStart(params.rawAddress)

public actual fun sceUtilityOskShutdownStart(): Int =
    PspJniBridge.libcPspSceUtilityOskShutdownStart()

public actual fun sceUtilityOskUpdate(n: Int): Int =
    PspJniBridge.libcPspSceUtilityOskUpdate(n)

public actual fun sceUtilityOskGetStatus(): Int =
    PspJniBridge.libcPspSceUtilityOskGetStatus()

public actual fun sceUtilityLoadNetModule(module: NetModule): Int =
    0

public actual fun sceUtilityUnloadNetModule(module: NetModule): Int =
    0

public actual fun sceUtilityLoadAvModule(module: AvModule): Int =
    0

public actual fun sceUtilityUnloadAvModule(module: AvModule): Int =
    0

public actual fun sceUtilityLoadUsbModule(module: UsbModule): Int =
    0

public actual fun sceUtilityUnloadUsbModule(module: UsbModule): Int =
    0

public actual fun sceUtilityLoadModule(module: Module): Int =
    0

public actual fun sceUtilityUnloadModule(module: Module): Int =
    0

public actual fun sceUtilityCreateNetParam(conf: Int): Int =
    PspJniBridge.libcPspSceUtilityCreateNetParam(conf)

public actual fun sceUtilitySetNetParam(param: NetParam, value: ConstPtr<CVoid>): Int =
    0

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    PspJniBridge.libcPspSceUtilityCopyNetParam(src, dest)

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    PspJniBridge.libcPspSceUtilityDeleteNetParam(conf)

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    PspJniBridge.libcPspSceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack)

public actual fun sceNetTerm(): Int =
    PspJniBridge.libcPspSceNetTerm()

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    PspJniBridge.libcPspSceNetFreeThreadinfo(thid)

public actual fun sceNetThreadAbort(thid: Int): Int =
    PspJniBridge.libcPspSceNetThreadAbort(thid)

public actual fun sceNetEtherStrton(name: MutPtr<UByte>, mac: MutPtr<UByte>) {
    PspJniBridge.libcPspSceNetEtherStrton(name.rawAddress, mac.rawAddress)
}

public actual fun sceNetEtherNtostr(mac: MutPtr<UByte>, name: MutPtr<UByte>) {
    PspJniBridge.libcPspSceNetEtherNtostr(mac.rawAddress, name.rawAddress)
}

public actual fun sceNetGetLocalEtherAddr(mac: MutPtr<UByte>): Int =
    PspJniBridge.libcPspSceNetGetLocalEtherAddr(mac.rawAddress)

public actual fun sceNetGetMallocStat(stat: MutPtr<SceNetMallocStat>): Int =
    PspJniBridge.libcPspSceNetGetMallocStat(stat.rawAddress)

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: MutPtr<SceNetAdhocctlAdhocId>): Int =
    PspJniBridge.libcPspSceNetAdhocctlInit(stacksize, priority, adhocId.rawAddress)

public actual fun sceNetAdhocctlTerm(): Int =
    PspJniBridge.libcPspSceNetAdhocctlTerm()

public actual fun sceNetAdhocctlConnect(name: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceNetAdhocctlConnect(name.rawAddress)

public actual fun sceNetAdhocctlDisconnect(): Int =
    PspJniBridge.libcPspSceNetAdhocctlDisconnect()

public actual fun sceNetAdhocctlGetState(event: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceNetAdhocctlGetState(event.rawAddress)

public actual fun sceNetAdhocctlCreate(name: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceNetAdhocctlCreate(name.rawAddress)

public actual fun sceNetAdhocctlJoin(scaninfo: MutPtr<SceNetAdhocctlScanInfo>): Int =
    PspJniBridge.libcPspSceNetAdhocctlJoin(scaninfo.rawAddress)

public actual fun sceNetAdhocctlGetAdhocId(id: MutPtr<SceNetAdhocctlAdhocId>): Int =
    PspJniBridge.libcPspSceNetAdhocctlGetAdhocId(id.rawAddress)

public actual fun sceNetAdhocctlCreateEnterGameMode(name: ConstPtr<UByte>, unknown: Int, num: Int, macs: MutPtr<UByte>, timeout: UInt, unknown2: Int): Int =
    PspJniBridge.libcPspSceNetAdhocctlCreateEnterGameMode(name.rawAddress, unknown, num, macs.rawAddress, timeout.toInt(), unknown2)

public actual fun sceNetAdhocctlJoinEnterGameMode(name: ConstPtr<UByte>, hostmac: MutPtr<UByte>, timeout: UInt, unknown: Int): Int =
    PspJniBridge.libcPspSceNetAdhocctlJoinEnterGameMode(name.rawAddress, hostmac.rawAddress, timeout.toInt(), unknown)

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: MutPtr<SceNetAdhocctlGameModeInfo>): Int =
    PspJniBridge.libcPspSceNetAdhocctlGetGameModeInfo(gamemodeinfo.rawAddress)

public actual fun sceNetAdhocctlExitGameMode(): Int =
    PspJniBridge.libcPspSceNetAdhocctlExitGameMode()

public actual fun sceNetAdhocctlGetPeerList(length: MutPtr<Int>, buf: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetAdhocctlGetPeerList(length.rawAddress, buf.rawAddress)

public actual fun sceNetAdhocctlGetPeerInfo(mac: MutPtr<UByte>, size: Int, peerinfo: MutPtr<SceNetAdhocctlPeerInfo>): Int =
    PspJniBridge.libcPspSceNetAdhocctlGetPeerInfo(mac.rawAddress, size, peerinfo.rawAddress)

public actual fun sceNetAdhocctlScan(): Int =
    PspJniBridge.libcPspSceNetAdhocctlScan()

public actual fun sceNetAdhocctlGetScanInfo(length: MutPtr<Int>, buf: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetAdhocctlGetScanInfo(length.rawAddress, buf.rawAddress)

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetAdhocctlAddHandler(0L, unknown.rawAddress)

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    PspJniBridge.libcPspSceNetAdhocctlDelHandler(id)

public actual fun sceNetAdhocctlGetNameByAddr(mac: MutPtr<UByte>, nickname: MutPtr<UByte>): Int =
    PspJniBridge.libcPspSceNetAdhocctlGetNameByAddr(mac.rawAddress, nickname.rawAddress)

public actual fun sceNetAdhocctlGetAddrByName(nickname: MutPtr<UByte>, length: MutPtr<Int>, buf: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetAdhocctlGetAddrByName(nickname.rawAddress, length.rawAddress, buf.rawAddress)

public actual fun sceNetAdhocctlGetParameter(params: MutPtr<SceNetAdhocctlParams>): Int =
    PspJniBridge.libcPspSceNetAdhocctlGetParameter(params.rawAddress)

public actual fun sceNetAdhocInit(): Int =
    PspJniBridge.libcPspSceNetAdhocInit()

public actual fun sceNetAdhocTerm(): Int =
    PspJniBridge.libcPspSceNetAdhocTerm()

public actual fun sceNetAdhocPdpCreate(mac: MutPtr<UByte>, port: UShort, bufSize: UInt, unk1: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPdpCreate(mac.rawAddress, port.toShort(), bufSize.toInt(), unk1)

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPdpDelete(id, unk1)

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: MutPtr<UByte>, port: UShort, data: MutPtr<CVoid>, len: UInt, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPdpSend(id, destMacAddr.rawAddress, port.toShort(), data.rawAddress, len.toInt(), timeout.toInt(), nonblock)

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: MutPtr<UByte>, port: MutPtr<UShort>, data: MutPtr<CVoid>, dataLength: MutPtr<CVoid>, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPdpRecv(id, srcMacAddr.rawAddress, port.rawAddress, data.rawAddress, dataLength.rawAddress, timeout.toInt(), nonblock)

public actual fun sceNetAdhocGetPdpStat(size: MutPtr<Int>, stat: MutPtr<SceNetAdhocPdpStat>): Int =
    PspJniBridge.libcPspSceNetAdhocGetPdpStat(size.rawAddress, stat.rawAddress)

public actual fun sceNetAdhocGameModeCreateMaster(data: MutPtr<CVoid>, size: Int): Int =
    PspJniBridge.libcPspSceNetAdhocGameModeCreateMaster(data.rawAddress, size)

public actual fun sceNetAdhocGameModeCreateReplica(mac: MutPtr<UByte>, data: MutPtr<CVoid>, size: Int): Int =
    PspJniBridge.libcPspSceNetAdhocGameModeCreateReplica(mac.rawAddress, data.rawAddress, size)

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    PspJniBridge.libcPspSceNetAdhocGameModeUpdateMaster()

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    PspJniBridge.libcPspSceNetAdhocGameModeUpdateReplica(id, unk1)

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    PspJniBridge.libcPspSceNetAdhocGameModeDeleteMaster()

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    PspJniBridge.libcPspSceNetAdhocGameModeDeleteReplica(id)

public actual fun sceNetAdhocPtpOpen(srcmac: MutPtr<UByte>, srcport: UShort, destmac: MutPtr<UByte>, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPtpOpen(srcmac.rawAddress, srcport.toShort(), destmac.rawAddress, destport.toShort(), bufSize.toInt(), delay.toInt(), count, unk1)

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPtpConnect(id, timeout.toInt(), nonblock)

public actual fun sceNetAdhocPtpListen(srcmac: MutPtr<UByte>, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPtpListen(srcmac.rawAddress, srcport.toShort(), bufSize.toInt(), delay.toInt(), count, queue, unk1)

public actual fun sceNetAdhocPtpAccept(id: Int, mac: MutPtr<UByte>, port: MutPtr<UShort>, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPtpAccept(id, mac.rawAddress, port.rawAddress, timeout.toInt(), nonblock)

public actual fun sceNetAdhocPtpSend(id: Int, data: MutPtr<CVoid>, dataSize: MutPtr<Int>, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPtpSend(id, data.rawAddress, dataSize.rawAddress, timeout.toInt(), nonblock)

public actual fun sceNetAdhocPtpRecv(id: Int, data: MutPtr<CVoid>, dataSize: MutPtr<Int>, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPtpRecv(id, data.rawAddress, dataSize.rawAddress, timeout.toInt(), nonblock)

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPtpFlush(id, timeout.toInt(), nonblock)

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    PspJniBridge.libcPspSceNetAdhocPtpClose(id, unk1)

public actual fun sceNetAdhocGetPtpStat(size: MutPtr<Int>, stat: MutPtr<SceNetAdhocPtpStat>): Int =
    PspJniBridge.libcPspSceNetAdhocGetPtpStat(size.rawAddress, stat.rawAddress)

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingInit(memsize)

public actual fun sceNetAdhocMatchingTerm(): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingTerm()

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    0

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingDelete(matchingId)

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingStart(matchingId, evthPri, evthStack, inthPri, inthStack, optLen, optData.rawAddress)

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingStop(matchingId)

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: MutPtr<UByte>, optLen: Int, optData: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingSelectTarget(matchingId, mac.rawAddress, optLen, optData.rawAddress)

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: MutPtr<UByte>): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingCancelTarget(matchingId, mac.rawAddress)

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: MutPtr<UByte>, optLen: Int, optData: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingCancelTargetWithOpt(matchingId, mac.rawAddress, optLen, optData.rawAddress)

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: MutPtr<UByte>, dataLen: Int, data: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingSendData(matchingId, mac.rawAddress, dataLen, data.rawAddress)

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: MutPtr<UByte>): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingAbortSendData(matchingId, mac.rawAddress)

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingSetHelloOpt(matchingId, optLen, optData.rawAddress)

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: MutPtr<Int>, optData: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingGetHelloOpt(matchingId, optLen.rawAddress, optData.rawAddress)

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: MutPtr<Int>, buf: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingGetMembers(matchingId, length.rawAddress, buf.rawAddress)

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingGetPoolMaxAlloc()

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: MutPtr<AdhocPoolStat>): Int =
    PspJniBridge.libcPspSceNetAdhocMatchingGetPoolStat(poolstat.rawAddress)

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    PspJniBridge.libcPspSceNetApctlInit(stackSize, initPriority)

public actual fun sceNetApctlTerm(): Int =
    PspJniBridge.libcPspSceNetApctlTerm()

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: MutPtr<SceNetApctlInfo>): Int =
    0

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: MutPtr<CVoid>): Int =
    PspJniBridge.libcPspSceNetApctlAddHandler(0L, parg.rawAddress)

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    PspJniBridge.libcPspSceNetApctlDelHandler(handlerId)

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    PspJniBridge.libcPspSceNetApctlConnect(connIndex)

public actual fun sceNetApctlDisconnect(): Int =
    PspJniBridge.libcPspSceNetApctlDisconnect()

public actual fun sceNetApctlGetState(pstate: MutPtr<ApctlState>): Int =
    PspJniBridge.libcPspSceNetApctlGetState(pstate.rawAddress)

public actual fun sceNetInetInit(): Int =
    PspJniBridge.libcPspSceNetInetInit()

public actual fun sceNetInetTerm(): Int =
    PspJniBridge.libcPspSceNetInetTerm()

public actual fun sceNetInetAccept(s: Int, addr: MutPtr<Sockaddr>, addrLen: MutPtr<SocklenT>): Int =
    PspJniBridge.libcPspSceNetInetAccept(s, addr.rawAddress, addrLen.rawAddress)

public actual fun sceNetInetBind(s: Int, myAddr: ConstPtr<Sockaddr>, addrLen: SocklenT): Int =
    PspJniBridge.libcPspSceNetInetBind(s, myAddr.rawAddress, addrLen.toInt())

public actual fun sceNetInetConnect(s: Int, servAddr: ConstPtr<Sockaddr>, addrLen: SocklenT): Int =
    PspJniBridge.libcPspSceNetInetConnect(s, servAddr.rawAddress, addrLen.toInt())

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: MutPtr<CVoid>, optlEn: MutPtr<SocklenT>): Int =
    PspJniBridge.libcPspSceNetInetGetsockopt(s, level, optName, optVal.rawAddress, optlEn.rawAddress)

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    PspJniBridge.libcPspSceNetInetListen(s, backlog)

public actual fun sceNetInetRecv(s: Int, buf: MutPtr<CVoid>, len: ULong, flags: Int): ULong =
    PspJniBridge.libcPspSceNetInetRecv(s, buf.rawAddress, len.toLong(), flags).toULong()

public actual fun sceNetInetRecvfrom(s: Int, buf: MutPtr<CVoid>, flags: ULong, arg1: Int, from: MutPtr<Sockaddr>, fromLen: MutPtr<SocklenT>): ULong =
    PspJniBridge.libcPspSceNetInetRecvfrom(s, buf.rawAddress, flags.toLong(), arg1, from.rawAddress, fromLen.rawAddress).toULong()

public actual fun sceNetInetSend(s: Int, buf: ConstPtr<CVoid>, len: ULong, flags: Int): ULong =
    PspJniBridge.libcPspSceNetInetSend(s, buf.rawAddress, len.toLong(), flags).toULong()

public actual fun sceNetInetSendto(s: Int, buf: ConstPtr<CVoid>, len: ULong, flags: Int, to: ConstPtr<Sockaddr>, toLen: SocklenT): ULong =
    PspJniBridge.libcPspSceNetInetSendto(s, buf.rawAddress, len.toLong(), flags, to.rawAddress, toLen.toInt()).toULong()

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: ConstPtr<CVoid>, optLen: SocklenT): Int =
    PspJniBridge.libcPspSceNetInetSetsockopt(s, level, optName, optVal.rawAddress, optLen.toInt())

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    PspJniBridge.libcPspSceNetInetShutdown(s, how)

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    PspJniBridge.libcPspSceNetInetSocket(domain, type, protocol)

public actual fun sceNetInetClose(s: Int): Int =
    PspJniBridge.libcPspSceNetInetClose(s)

public actual fun sceNetInetGetErrno(): Int =
    PspJniBridge.libcPspSceNetInetGetErrno()

public actual fun sceSslInit(unknown1: Int): Int =
    PspJniBridge.libcPspSceSslInit(unknown1)

public actual fun sceSslEnd(): Int =
    PspJniBridge.libcPspSceSslEnd()

public actual fun sceSslGetUsedMemoryMax(memory: MutPtr<UInt>): Int =
    PspJniBridge.libcPspSceSslGetUsedMemoryMax(memory.rawAddress)

public actual fun sceSslGetUsedMemoryCurrent(memory: MutPtr<UInt>): Int =
    PspJniBridge.libcPspSceSslGetUsedMemoryCurrent(memory.rawAddress)

public actual fun sceHttpInit(unknown1: UInt): Int =
    PspJniBridge.libcPspSceHttpInit(unknown1.toInt())

public actual fun sceHttpEnd(): Int =
    PspJniBridge.libcPspSceHttpEnd()

public actual fun sceHttpCreateTemplate(agent: MutPtr<UByte>, unknown1: Int, unknown2: Int): Int =
    PspJniBridge.libcPspSceHttpCreateTemplate(agent.rawAddress, unknown1, unknown2)

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    PspJniBridge.libcPspSceHttpDeleteTemplate(templateid)

public actual fun sceHttpCreateConnection(templateid: Int, host: MutPtr<UByte>, unknown1: MutPtr<UByte>, port: UShort, unknown2: Int): Int =
    PspJniBridge.libcPspSceHttpCreateConnection(templateid, host.rawAddress, unknown1.rawAddress, port.toShort(), unknown2)

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: ConstPtr<UByte>, unknown1: Int): Int =
    PspJniBridge.libcPspSceHttpCreateConnectionWithURL(templateid, url.rawAddress, unknown1)

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    PspJniBridge.libcPspSceHttpDeleteConnection(connectionId)

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: MutPtr<UByte>, contentLength: ULong): Int =
    0

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: MutPtr<UByte>, contentLength: ULong): Int =
    0

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    PspJniBridge.libcPspSceHttpDeleteRequest(requestId)

public actual fun sceHttpSendRequest(requestId: Int, data: MutPtr<CVoid>, dataSize: UInt): Int =
    PspJniBridge.libcPspSceHttpSendRequest(requestId, data.rawAddress, dataSize.toInt())

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    PspJniBridge.libcPspSceHttpAbortRequest(requestId)

public actual fun sceHttpReadData(requestId: Int, data: MutPtr<CVoid>, dataSize: UInt): Int =
    PspJniBridge.libcPspSceHttpReadData(requestId, data.rawAddress, dataSize.toInt())

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: MutPtr<ULong>): Int =
    PspJniBridge.libcPspSceHttpGetContentLength(requestId, contentLength.rawAddress)

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceHttpGetStatusCode(requestId, statusCode.rawAddress)

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    PspJniBridge.libcPspSceHttpSetResolveTimeOut(id, timeout.toInt())

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    PspJniBridge.libcPspSceHttpSetResolveRetry(id, count)

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    PspJniBridge.libcPspSceHttpSetConnectTimeOut(id, timeout.toInt())

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    PspJniBridge.libcPspSceHttpSetSendTimeOut(id, timeout.toInt())

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    PspJniBridge.libcPspSceHttpSetRecvTimeOut(id, timeout.toInt())

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    PspJniBridge.libcPspSceHttpEnableKeepAlive(id)

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    PspJniBridge.libcPspSceHttpDisableKeepAlive(id)

public actual fun sceHttpEnableRedirect(id: Int): Int =
    PspJniBridge.libcPspSceHttpEnableRedirect(id)

public actual fun sceHttpDisableRedirect(id: Int): Int =
    PspJniBridge.libcPspSceHttpDisableRedirect(id)

public actual fun sceHttpEnableCookie(id: Int): Int =
    PspJniBridge.libcPspSceHttpEnableCookie(id)

public actual fun sceHttpDisableCookie(id: Int): Int =
    PspJniBridge.libcPspSceHttpDisableCookie(id)

public actual fun sceHttpSaveSystemCookie(): Int =
    PspJniBridge.libcPspSceHttpSaveSystemCookie()

public actual fun sceHttpLoadSystemCookie(): Int =
    PspJniBridge.libcPspSceHttpLoadSystemCookie()

public actual fun sceHttpAddExtraHeader(id: Int, name: MutPtr<UByte>, value: MutPtr<UByte>, unknown1: Int): Int =
    PspJniBridge.libcPspSceHttpAddExtraHeader(id, name.rawAddress, value.rawAddress, unknown1)

public actual fun sceHttpDeleteHeader(id: Int, name: ConstPtr<UByte>): Int =
    PspJniBridge.libcPspSceHttpDeleteHeader(id, name.rawAddress)

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    PspJniBridge.libcPspSceHttpsInit(unknown1, unknown2, unknown3, unknown4)

public actual fun sceHttpsEnd(): Int =
    PspJniBridge.libcPspSceHttpsEnd()

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    PspJniBridge.libcPspSceHttpsLoadDefaultCert(unknown1, unknown2)

public actual fun sceHttpDisableAuth(id: Int): Int =
    PspJniBridge.libcPspSceHttpDisableAuth(id)

public actual fun sceHttpDisableCache(id: Int): Int =
    PspJniBridge.libcPspSceHttpDisableCache(id)

public actual fun sceHttpEnableAuth(id: Int): Int =
    PspJniBridge.libcPspSceHttpEnableAuth(id)

public actual fun sceHttpEnableCache(id: Int): Int =
    PspJniBridge.libcPspSceHttpEnableCache(id)

public actual fun sceHttpEndCache(): Int =
    PspJniBridge.libcPspSceHttpEndCache()

public actual fun sceHttpGetAllHeader(request: Int, header: MutPtr<MutPtr<UByte>>, headerSize: MutPtr<UInt>): Int =
    PspJniBridge.libcPspSceHttpGetAllHeader(request, header.rawAddress, headerSize.rawAddress)

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: MutPtr<Int>): Int =
    PspJniBridge.libcPspSceHttpGetNetworkErrno(request, errNum.rawAddress)

public actual fun sceHttpGetProxy(id: Int, activateFlag: MutPtr<Int>, mode: MutPtr<Int>, proxyHost: MutPtr<UByte>, len: ULong, proxyPort: MutPtr<UShort>): Int =
    PspJniBridge.libcPspSceHttpGetProxy(id, activateFlag.rawAddress, mode.rawAddress, proxyHost.rawAddress, len.toLong(), proxyPort.rawAddress)

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    PspJniBridge.libcPspSceHttpInitCache(maxSize.toLong())

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    PspJniBridge.libcPspSceHttpSetAuthInfoCB(id, 0L)

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: ConstPtr<UByte>, newProxyPort: UShort): Int =
    PspJniBridge.libcPspSceHttpSetProxy(id, activateFlag, mode, newProxyHost.rawAddress, newProxyPort.toShort())

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    PspJniBridge.libcPspSceHttpSetResHeaderMaxSize(id, headerSize.toInt())

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    PspJniBridge.libcPspSceHttpSetMallocFunction(0L, 0L, 0L)

public actual fun sceNetResolverInit(): Int =
    PspJniBridge.libcPspSceNetResolverInit()

public actual fun sceNetResolverCreate(rid: MutPtr<Int>, buf: MutPtr<CVoid>, bufLength: UInt): Int =
    PspJniBridge.libcPspSceNetResolverCreate(rid.rawAddress, buf.rawAddress, bufLength.toInt())

public actual fun sceNetResolverDelete(rid: Int): Int =
    PspJniBridge.libcPspSceNetResolverDelete(rid)

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: ConstPtr<UByte>, addr: MutPtr<InAddr>, timeout: UInt, retry: Int): Int =
    PspJniBridge.libcPspSceNetResolverStartNtoA(rid, hostname.rawAddress, addr.rawAddress, timeout.toInt(), retry)

public actual fun sceNetResolverStartAtoN(rid: Int, addr: ConstPtr<InAddr>, hostname: MutPtr<UByte>, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    PspJniBridge.libcPspSceNetResolverStartAtoN(rid, addr.rawAddress, hostname.rawAddress, hostnameLen.toInt(), timeout.toInt(), retry)

public actual fun sceNetResolverStop(rid: Int): Int =
    PspJniBridge.libcPspSceNetResolverStop(rid)

public actual fun sceNetResolverTerm(): Int =
    PspJniBridge.libcPspSceNetResolverTerm()
