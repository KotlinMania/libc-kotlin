@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

private object PspJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_psp_sceAudioChRelease(channel: Int): Int

    @JvmStatic
    external fun libc_psp_sceAudioOutput(channel: Int, vol: Int, buf: Long): Int

    @JvmStatic
    external fun libc_psp_sceAudioOutputBlocking(channel: Int, vol: Int, buf: Long): Int

    @JvmStatic
    external fun libc_psp_sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: Long): Int

    @JvmStatic
    external fun libc_psp_sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: Long): Int

    @JvmStatic
    external fun libc_psp_sceAudioGetChannelRestLen(channel: Int): Int

    @JvmStatic
    external fun libc_psp_sceAudioGetChannelRestLength(channel: Int): Int

    @JvmStatic
    external fun libc_psp_sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int

    @JvmStatic
    external fun libc_psp_sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int

    @JvmStatic
    external fun libc_psp_sceAudioOutput2Reserve(sampleCount: Int): Int

    @JvmStatic
    external fun libc_psp_sceAudioOutput2Release(): Int

    @JvmStatic
    external fun libc_psp_sceAudioOutput2ChangeLength(sampleCount: Int): Int

    @JvmStatic
    external fun libc_psp_sceAudioOutput2OutputBlocking(vol: Int, buf: Long): Int

    @JvmStatic
    external fun libc_psp_sceAudioOutput2GetRestSample(): Int

    @JvmStatic
    external fun libc_psp_sceAudioSRCChRelease(): Int

    @JvmStatic
    external fun libc_psp_sceAudioSRCOutputBlocking(vol: Int, buf: Long): Int

    @JvmStatic
    external fun libc_psp_sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int

    @JvmStatic
    external fun libc_psp_sceAudioInputInitEx(params: Long): Int

    @JvmStatic
    external fun libc_psp_sceAudioGetInputLength(): Int

    @JvmStatic
    external fun libc_psp_sceAudioWaitInputEnd(): Int

    @JvmStatic
    external fun libc_psp_sceAudioPollInputEnd(): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetAtracID(uiCodecType: Int): Int

    @JvmStatic
    external fun libc_psp_sceAtracSetDataAndGetID(buf: Long, bufsize: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracDecodeData(atracId: Int, outSamples: Long, outN: Long, outEnd: Long, outRemainFrame: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetRemainFrame(atracId: Int, outRemainFrame: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetStreamDataInfo(atracId: Int, writePointer: Long, availableBytes: Long, readOffset: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracAddStreamData(atracId: Int, bytesToAdd: Int): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetBitrate(atracId: Int, outBitrate: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracSetLoopNum(atracId: Int, nloops: Int): Int

    @JvmStatic
    external fun libc_psp_sceAtracReleaseAtracID(atracId: Int): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetNextSample(atracId: Int, outN: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetMaxSample(atracId: Int, outMax: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: Int, pbufferInfo: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetChannel(atracId: Int, puiChannel: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetInternalErrorInfo(atracId: Int, piResult: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetLoopStatus(atracId: Int, piLoopNum: Long, puiLoopStatus: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: Long, puiDataByte: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracGetSoundSample(atracId: Int, piEndSample: Long, piLoopStartSample: Long, piLoopEndSample: Long): Int

    @JvmStatic
    external fun libc_psp_sceAtracResetPlayPosition(atracId: Int, uiSample: Int, uiWriteByteFirstBuf: Int, uiWriteByteSecondBuf: Int): Int

    @JvmStatic
    external fun libc_psp_sceAtracSetData(atracId: Int, pucBufferAddr: Long, uiBufferByte: Int): Int

    @JvmStatic
    external fun libc_psp_sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: Long, uiReadByte: Int, uiBufferByte: Int): Int

    @JvmStatic
    external fun libc_psp_sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: Long, uiReadByte: Int, uiBufferByte: Int): Int

    @JvmStatic
    external fun libc_psp_sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: Long, uiSecondBufferByte: Int): Int

    @JvmStatic
    external fun libc_psp_sceCtrlSetSamplingCycle(cycle: Int): Int

    @JvmStatic
    external fun libc_psp_sceCtrlGetSamplingCycle(pcycle: Long): Int

    @JvmStatic
    external fun libc_psp_sceCtrlGetSamplingMode(pmode: Long): Int

    @JvmStatic
    external fun libc_psp_sceCtrlPeekBufferPositive(padData: Long, count: Int): Int

    @JvmStatic
    external fun libc_psp_sceCtrlPeekBufferNegative(padData: Long, count: Int): Int

    @JvmStatic
    external fun libc_psp_sceCtrlReadBufferPositive(padData: Long, count: Int): Int

    @JvmStatic
    external fun libc_psp_sceCtrlReadBufferNegative(padData: Long, count: Int): Int

    @JvmStatic
    external fun libc_psp_sceCtrlPeekLatch(latchData: Long): Int

    @JvmStatic
    external fun libc_psp_sceCtrlReadLatch(latchData: Long): Int

    @JvmStatic
    external fun libc_psp_sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int

    @JvmStatic
    external fun libc_psp_sceCtrlGetIdleCancelThreshold(idlereset: Long, idleback: Long): Int

    @JvmStatic
    external fun libc_psp_sceDisplayGetMode(pmode: Long, pwidth: Long, pheight: Long): Int

    @JvmStatic
    external fun libc_psp_sceDisplayGetVcount(): Int

    @JvmStatic
    external fun libc_psp_sceDisplayWaitVblank(): Int

    @JvmStatic
    external fun libc_psp_sceDisplayWaitVblankCB(): Int

    @JvmStatic
    external fun libc_psp_sceDisplayWaitVblankStart(): Int

    @JvmStatic
    external fun libc_psp_sceDisplayWaitVblankStartCB(): Int

    @JvmStatic
    external fun libc_psp_sceDisplayGetAccumulatedHcount(): Int

    @JvmStatic
    external fun libc_psp_sceDisplayGetCurrentHcount(): Int

    @JvmStatic
    external fun libc_psp_sceDisplayGetFramePerSec(): Float

    @JvmStatic
    external fun libc_psp_sceDisplayIsForeground(): Int

    @JvmStatic
    external fun libc_psp_sceDisplayIsVblank(): Int

    @JvmStatic
    external fun libc_psp_sceGeEdramGetSize(): Int

    @JvmStatic
    external fun libc_psp_sceGeEdramGetAddr(): Long

    @JvmStatic
    external fun libc_psp_sceGeEdramSetAddrTranslation(width: Int): Int

    @JvmStatic
    external fun libc_psp_sceGeGetCmd(cmd: Int): Int

    @JvmStatic
    external fun libc_psp_sceGeGetStack(stackId: Int, stack: Long): Int

    @JvmStatic
    external fun libc_psp_sceGeSaveContext(context: Long): Int

    @JvmStatic
    external fun libc_psp_sceGeRestoreContext(context: Long): Int

    @JvmStatic
    external fun libc_psp_sceGeListEnQueue(list: Long, stall: Long, cbid: Int, arg: Long): Int

    @JvmStatic
    external fun libc_psp_sceGeListEnQueueHead(list: Long, stall: Long, cbid: Int, arg: Long): Int

    @JvmStatic
    external fun libc_psp_sceGeListDeQueue(qid: Int): Int

    @JvmStatic
    external fun libc_psp_sceGeListUpdateStallAddr(qid: Int, stall: Long): Int

    @JvmStatic
    external fun libc_psp_sceGeBreak(mode: Int, pParam: Long): Int

    @JvmStatic
    external fun libc_psp_sceGeContinue(): Int

    @JvmStatic
    external fun libc_psp_sceGeSetCallback(cb: Long): Int

    @JvmStatic
    external fun libc_psp_sceGeUnsetCallback(cbid: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelExitGame()

    @JvmStatic
    external fun libc_psp_sceKernelLoadExec(file: Long, param: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelTotalFreeMemSize(): Long

    @JvmStatic
    external fun libc_psp_sceKernelMaxFreeMemSize(): Long

    @JvmStatic
    external fun libc_psp_sceKernelDevkitVersion(): Int

    @JvmStatic
    external fun libc_psp_sceKernelSetCompiledSdkVersion(version: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelGetCompiledSdkVersion(): Int

    @JvmStatic
    external fun libc_psp_sceKernelLibcTime(t: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelLibcClock(): Int

    @JvmStatic
    external fun libc_psp_sceKernelLibcGettimeofday(tp: Long, tzp: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelDcacheWritebackAll()

    @JvmStatic
    external fun libc_psp_sceKernelDcacheWritebackInvalidateAll()

    @JvmStatic
    external fun libc_psp_sceKernelDcacheWritebackRange(p: Long, size: Int)

    @JvmStatic
    external fun libc_psp_sceKernelDcacheWritebackInvalidateRange(p: Long, size: Int)

    @JvmStatic
    external fun libc_psp_sceKernelDcacheInvalidateRange(p: Long, size: Int)

    @JvmStatic
    external fun libc_psp_sceKernelIcacheInvalidateAll()

    @JvmStatic
    external fun libc_psp_sceKernelIcacheInvalidateRange(p: Long, size: Int)

    @JvmStatic
    external fun libc_psp_sceKernelUtilsMt19937Init(ctx: Long, seed: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelUtilsMt19937UInt(ctx: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelUtilsMd5Digest(data: Long, size: Int, digest: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelUtilsMd5BlockInit(ctx: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelUtilsMd5BlockUpdate(ctx: Long, data: Long, size: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelUtilsMd5BlockResult(ctx: Long, digest: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelUtilsSha1Digest(data: Long, size: Int, digest: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelUtilsSha1BlockInit(ctx: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelUtilsSha1BlockUpdate(ctx: Long, data: Long, size: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelUtilsSha1BlockResult(ctx: Long, digest: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: Long, arg: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelEnableSubIntr(intNo: Int, no: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelDisableSubIntr(intNo: Int, no: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelCpuSuspendIntr(): Int

    @JvmStatic
    external fun libc_psp_sceKernelCpuResumeIntr(flags: Int)

    @JvmStatic
    external fun libc_psp_sceKernelCpuResumeIntrWithSync(flags: Int)

    @JvmStatic
    external fun libc_psp_sceKernelIsCpuIntrSuspended(flags: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelIsCpuIntrEnable(): Int

    @JvmStatic
    external fun libc_psp_sceKernelSelfStopUnloadModule(unknown: Int, argSize: Long, argp: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelStopUnloadSelfModule(argSize: Long, argp: Long, status: Long, option: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelGetModuleIdList(readBuf: Long, readBufSize: Int, idCount: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelVolatileMemLock(unk: Int, ptr: Long, size: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelVolatileMemTryLock(unk: Int, ptr: Long, size: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelVolatileMemUnlock(unk: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelExitThread(status: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelExitDeleteThread(status: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelSuspendDispatchThread(): Int

    @JvmStatic
    external fun libc_psp_sceKernelResumeDispatchThread(state: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelSleepThread(): Int

    @JvmStatic
    external fun libc_psp_sceKernelSleepThreadCB(): Int

    @JvmStatic
    external fun libc_psp_sceKernelDelayThread(delay: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelDelayThreadCB(delay: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelDelaySysClockThread(delay: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelDelaySysClockThreadCB(delay: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelRotateThreadReadyQueue(priority: Int): Int

    @JvmStatic
    external fun libc_psp_sceKernelGetThreadId(): Int

    @JvmStatic
    external fun libc_psp_sceKernelGetThreadCurrentPriority(): Int

    @JvmStatic
    external fun libc_psp_sceKernelCheckThreadStack(): Int

    @JvmStatic
    external fun libc_psp_sceKernelCheckCallback(): Int

    @JvmStatic
    external fun libc_psp_sceKernelReferSystemStatus(status: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelCreateFpl(name: Long, part: Int, attr: Int, size: Int, blocks: Int, opt: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelUSec2SysClock(usec: Int, clock: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelUSec2SysClockWide(usec: Int): Long

    @JvmStatic
    external fun libc_psp_sceKernelSysClock2USec(clock: Long, low: Long, high: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelSysClock2USecWide(clock: Long, low: Long, high: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelGetSystemTime(time: Long): Int

    @JvmStatic
    external fun libc_psp_sceKernelGetSystemTimeWide(): Long

    @JvmStatic
    external fun libc_psp_sceKernelGetSystemTimeLow(): Int

    @JvmStatic
    external fun libc_psp_sceKernelReferThreadProfiler(): Long

    @JvmStatic
    external fun libc_psp_sceKernelReferGlobalProfiler(): Long

    @JvmStatic
    external fun libc_psp_sceUsbStart(driverName: Long, size: Int, args: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbStop(driverName: Long, size: Int, args: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbActivate(pid: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbDeactivate(pid: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbGetState(): Int

    @JvmStatic
    external fun libc_psp_sceUsbGetDrvState(driverName: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamSetupStill(param: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamSetupStillEx(param: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamStillInputBlocking(buf: Long, size: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamStillInput(buf: Long, size: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamStillWaitInputEnd(): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamStillPollInputEnd(): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamStillCancelInput(): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamStillGetInputLength(): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamSetupVideo(param: Long, workArea: Long, workAreaSize: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamSetupVideoEx(param: Long, workArea: Long, workAreaSize: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamStartVideo(): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamStopVideo(): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamReadVideoFrameBlocking(buf: Long, size: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamReadVideoFrame(buf: Long, size: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamWaitReadVideoFrameEnd(): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamPollReadVideoFrameEnd(): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamGetReadVideoFrameSize(): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamSetSaturation(saturation: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamSetBrightness(brightness: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamSetContrast(contrast: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamSetSharpness(sharpness: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamSetReverseMode(reverseFlags: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamSetZoom(zoom: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamGetSaturation(saturation: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamGetBrightness(brightness: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamGetContrast(contrast: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamGetSharpness(sharpness: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamGetImageEffectMode(effectMode: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamGetEvLevel(exposureLevel: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamGetReverseMode(reverseFlags: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamGetZoom(zoom: Long): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamAutoImageReverseSW(on: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamGetAutoImageReverseState(): Int

    @JvmStatic
    external fun libc_psp_sceUsbCamGetLensDirection(): Int

    @JvmStatic
    external fun libc_psp_sceUsbstorBootUnregisterNotify(eventFlag: Int): Int

    @JvmStatic
    external fun libc_psp_sceUsbstorBootSetCapacity(size: Int): Int

    @JvmStatic
    external fun libc_psp_scePowerUnregisterCallback(slot: Int): Int

    @JvmStatic
    external fun libc_psp_scePowerIsPowerOnline(): Int

    @JvmStatic
    external fun libc_psp_scePowerIsBatteryExist(): Int

    @JvmStatic
    external fun libc_psp_scePowerIsBatteryCharging(): Int

    @JvmStatic
    external fun libc_psp_scePowerGetBatteryChargingStatus(): Int

    @JvmStatic
    external fun libc_psp_scePowerIsLowBattery(): Int

    @JvmStatic
    external fun libc_psp_scePowerGetBatteryLifePercent(): Int

    @JvmStatic
    external fun libc_psp_scePowerGetBatteryLifeTime(): Int

    @JvmStatic
    external fun libc_psp_scePowerGetBatteryTemp(): Int

    @JvmStatic
    external fun libc_psp_scePowerGetBatteryElec(): Int

    @JvmStatic
    external fun libc_psp_scePowerGetBatteryVolt(): Int

    @JvmStatic
    external fun libc_psp_scePowerSetCpuClockFrequency(cpufreq: Int): Int

    @JvmStatic
    external fun libc_psp_scePowerSetBusClockFrequency(busfreq: Int): Int

    @JvmStatic
    external fun libc_psp_scePowerGetCpuClockFrequency(): Int

    @JvmStatic
    external fun libc_psp_scePowerGetCpuClockFrequencyInt(): Int

    @JvmStatic
    external fun libc_psp_scePowerGetCpuClockFrequencyFloat(): Float

    @JvmStatic
    external fun libc_psp_scePowerGetBusClockFrequency(): Int

    @JvmStatic
    external fun libc_psp_scePowerGetBusClockFrequencyInt(): Int

    @JvmStatic
    external fun libc_psp_scePowerGetBusClockFrequencyFloat(): Float

    @JvmStatic
    external fun libc_psp_scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int

    @JvmStatic
    external fun libc_psp_scePowerLock(unknown: Int): Int

    @JvmStatic
    external fun libc_psp_scePowerUnlock(unknown: Int): Int

    @JvmStatic
    external fun libc_psp_scePowerGetIdleTimer(): Int

    @JvmStatic
    external fun libc_psp_scePowerIdleTimerEnable(unknown: Int): Int

    @JvmStatic
    external fun libc_psp_scePowerIdleTimerDisable(unknown: Int): Int

    @JvmStatic
    external fun libc_psp_scePowerRequestStandby(): Int

    @JvmStatic
    external fun libc_psp_scePowerRequestSuspend(): Int

    @JvmStatic
    external fun libc_psp_sceWlanDevIsPowerOn(): Int

    @JvmStatic
    external fun libc_psp_sceWlanGetSwitchState(): Int

    @JvmStatic
    external fun libc_psp_sceWlanGetEtherAddr(etherAddr: Long): Int

    @JvmStatic
    external fun libc_psp_sceWlanDevAttach(): Int

    @JvmStatic
    external fun libc_psp_sceWlanDevDetach(): Int

    @JvmStatic
    external fun libc_psp_sceRtcGetTickResolution(): Int

    @JvmStatic
    external fun libc_psp_sceRtcGetCurrentTick(tick: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcGetCurrentClock(tm: Long, tz: Int): Int

    @JvmStatic
    external fun libc_psp_sceRtcGetCurrentClockLocalTime(tm: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcConvertUtcToLocalTime(tickUtc: Long, tickLocal: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcConvertLocalTimeToUTC(tickLocal: Long, tickUtc: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcIsLeapYear(year: Int): Int

    @JvmStatic
    external fun libc_psp_sceRtcGetDaysInMonth(year: Int, month: Int): Int

    @JvmStatic
    external fun libc_psp_sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int

    @JvmStatic
    external fun libc_psp_sceRtcCheckValid(date: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcSetTick(date: Long, tick: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcGetTick(date: Long, tick: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcCompareTick(tick1: Long, tick2: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcTickAddTicks(destTick: Long, srcTick: Long, numTicks: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcTickAddMicroseconds(destTick: Long, srcTick: Long, numMs: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcTickAddSeconds(destTick: Long, srcTick: Long, numSeconds: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcTickAddMinutes(destTick: Long, srcTick: Long, numMinutes: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcTickAddHours(destTick: Long, srcTick: Long, numHours: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcTickAddDays(destTick: Long, srcTick: Long, numDays: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcTickAddWeeks(destTick: Long, srcTick: Long, numWeeks: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcTickAddMonths(destTick: Long, srcTick: Long, numMonths: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcTickAddYears(destTick: Long, srcTick: Long, numYears: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcSetTimeT(date: Long, time: Int): Int

    @JvmStatic
    external fun libc_psp_sceRtcGetTimeT(date: Long, time: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcSetTime64T(date: Long, time: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcGetTime64T(date: Long, time: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcSetDosTime(date: Long, dosTime: Int): Int

    @JvmStatic
    external fun libc_psp_sceRtcGetDosTime(date: Long, dosTime: Int): Int

    @JvmStatic
    external fun libc_psp_sceRtcSetWin32FileTime(date: Long, time: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcGetWin32FileTime(date: Long, time: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcParseDateTime(destTick: Long, dateString: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcFormatRFC3339(pszDateTime: Long, pUtc: Long, timeZoneMinutes: Int): Int

    @JvmStatic
    external fun libc_psp_sceRtcFormatRFC3339LocalTime(pszDateTime: Long, pUtc: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcParseRFC3339(pUtc: Long, pszDateTime: Long): Int

    @JvmStatic
    external fun libc_psp_sceRtcFormatRFC2822(pszDateTime: Long, pUtc: Long, timeZoneMinutes: Int): Int

    @JvmStatic
    external fun libc_psp_sceRtcFormatRFC2822LocalTime(pszDateTime: Long, pUtc: Long): Int

    @JvmStatic
    external fun libc_psp_sceIoRemove(file: Long): Int

    @JvmStatic
    external fun libc_psp_sceIoMkdir(dir: Long, mode: Int): Int

    @JvmStatic
    external fun libc_psp_sceIoRmdir(path: Long): Int

    @JvmStatic
    external fun libc_psp_sceIoChdir(path: Long): Int

    @JvmStatic
    external fun libc_psp_sceIoRename(oldname: Long, newname: Long): Int

    @JvmStatic
    external fun libc_psp_sceIoDevctl(dev: Long, cmd: Int, indata: Long, inlen: Int, outdata: Long, outlen: Int): Int

    @JvmStatic
    external fun libc_psp_sceIoUnassign(dev: Long): Int

    @JvmStatic
    external fun libc_psp_sceIoGetstat(file: Long, stat: Long): Int

    @JvmStatic
    external fun libc_psp_sceIoChstat(file: Long, stat: Long, bits: Int): Int

    @JvmStatic
    external fun libc_psp_sceIoSync(device: Long, unk: Int): Int

    @JvmStatic
    external fun libc_psp_sceJpegInitMJpeg(): Int

    @JvmStatic
    external fun libc_psp_sceJpegFinishMJpeg(): Int

    @JvmStatic
    external fun libc_psp_sceJpegCreateMJpeg(width: Int, height: Int): Int

    @JvmStatic
    external fun libc_psp_sceJpegDeleteMJpeg(): Int

    @JvmStatic
    external fun libc_psp_sceJpegDecodeMJpeg(jpegBuf: Long, size: Long, rgba: Long, unk: Int): Int

    @JvmStatic
    external fun libc_psp_sceUmdCheckMedium(): Int

    @JvmStatic
    external fun libc_psp_sceUmdGetDiscInfo(info: Long): Int

    @JvmStatic
    external fun libc_psp_sceUmdActivate(unit: Int, drive: Long): Int

    @JvmStatic
    external fun libc_psp_sceUmdDeactivate(unit: Int, drive: Long): Int

    @JvmStatic
    external fun libc_psp_sceUmdWaitDriveStat(state: Int): Int

    @JvmStatic
    external fun libc_psp_sceUmdWaitDriveStatWithTimer(state: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_psp_sceUmdWaitDriveStatCB(state: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_psp_sceUmdCancelWaitDriveStat(): Int

    @JvmStatic
    external fun libc_psp_sceUmdGetDriveStat(): Int

    @JvmStatic
    external fun libc_psp_sceUmdGetErrorStat(): Int

    @JvmStatic
    external fun libc_psp_sceUmdRegisterUMDCallBack(cbid: Int): Int

    @JvmStatic
    external fun libc_psp_sceUmdUnRegisterUMDCallBack(cbid: Int): Int

    @JvmStatic
    external fun libc_psp_sceUmdReplacePermit(): Int

    @JvmStatic
    external fun libc_psp_sceUmdReplaceProhibit(): Int

    @JvmStatic
    external fun libc_psp_sceMpegInit(): Int

    @JvmStatic
    external fun libc_psp_sceMpegFinish()

    @JvmStatic
    external fun libc_psp_sceMpegRingbufferQueryMemSize(packets: Int): Int

    @JvmStatic
    external fun libc_psp_sceMpegRingbufferConstruct(ringbuffer: Long, packets: Int, data: Long, size: Int, callback: Long, cbParam: Long): Int

    @JvmStatic
    external fun libc_psp_sceMpegRingbufferDestruct(ringbuffer: Long)

    @JvmStatic
    external fun libc_psp_sceMpegRingbufferAvailableSize(ringbuffer: Long): Int

    @JvmStatic
    external fun libc_psp_sceMpegRingbufferPut(ringbuffer: Long, numPackets: Int, available: Int): Int

    @JvmStatic
    external fun libc_psp_sceMpegQueryMemSize(unk: Int): Int

    @JvmStatic
    external fun libc_psp_sceMpegQueryStreamSize(buffer: Long, size: Long): Int

    @JvmStatic
    external fun libc_psp_sceMpegBaseYCrCbCopyVme(yuvBuffer: Long, buffer: Long, type: Int): Int

    @JvmStatic
    external fun libc_psp_sceMpegBaseCscInit(width: Int): Int

    @JvmStatic
    external fun libc_psp_sceMpegBaseCscVme(rgbBuffer: Long, rgbBuffer2: Long, width: Int, yCrCbBuffer: Long): Int

    @JvmStatic
    external fun libc_psp_sceMpegbaseBea18f91(lli: Long): Int

    @JvmStatic
    external fun libc_psp_sceHprmPeekCurrentKey(key: Long): Int

    @JvmStatic
    external fun libc_psp_sceHprmPeekLatch(latch: Long): Int

    @JvmStatic
    external fun libc_psp_sceHprmReadLatch(latch: Long): Int

    @JvmStatic
    external fun libc_psp_sceHprmIsHeadphoneExist(): Int

    @JvmStatic
    external fun libc_psp_sceHprmIsRemoteExist(): Int

    @JvmStatic
    external fun libc_psp_sceHprmIsMicrophoneExist(): Int

    @JvmStatic
    external fun libc_psp_sceGuDepthBuffer(zbp: Long, zbw: Int)

    @JvmStatic
    external fun libc_psp_sceGuDispBuffer(width: Int, height: Int, dispbp: Long, dispbw: Int)

    @JvmStatic
    external fun libc_psp_sceGuDisplay(state: Boolean): Boolean

    @JvmStatic
    external fun libc_psp_sceGuDepthMask(mask: Int)

    @JvmStatic
    external fun libc_psp_sceGuDepthOffset(offset: Int)

    @JvmStatic
    external fun libc_psp_sceGuDepthRange(near: Int, far: Int)

    @JvmStatic
    external fun libc_psp_sceGuFog(near: Float, far: Float, color: Int)

    @JvmStatic
    external fun libc_psp_sceGuInit()

    @JvmStatic
    external fun libc_psp_sceGuTerm()

    @JvmStatic
    external fun libc_psp_sceGuBreak(mode: Int)

    @JvmStatic
    external fun libc_psp_sceGuContinue()

    @JvmStatic
    external fun libc_psp_sceGuGetMemory(size: Int): Long

    @JvmStatic
    external fun libc_psp_sceGuFinish(): Int

    @JvmStatic
    external fun libc_psp_sceGuFinishId(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceGuCallList(list: Long)

    @JvmStatic
    external fun libc_psp_sceGuCallMode(mode: Int)

    @JvmStatic
    external fun libc_psp_sceGuCheckList(): Int

    @JvmStatic
    external fun libc_psp_sceGuSwapBuffers(): Long

    @JvmStatic
    external fun libc_psp_sceGuBeginObject(vtype: Int, count: Int, indices: Long, vertices: Long)

    @JvmStatic
    external fun libc_psp_sceGuEndObject()

    @JvmStatic
    external fun libc_psp_sceGuSetAllStatus(status: Int)

    @JvmStatic
    external fun libc_psp_sceGuGetAllStatus(): Int

    @JvmStatic
    external fun libc_psp_sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float)

    @JvmStatic
    external fun libc_psp_sceGuLightColor(light: Int, component: Int, color: Int)

    @JvmStatic
    external fun libc_psp_sceGuClear(flags: Int)

    @JvmStatic
    external fun libc_psp_sceGuClearColor(color: Int)

    @JvmStatic
    external fun libc_psp_sceGuClearDepth(depth: Int)

    @JvmStatic
    external fun libc_psp_sceGuClearStencil(stencil: Int)

    @JvmStatic
    external fun libc_psp_sceGuPixelMask(mask: Int)

    @JvmStatic
    external fun libc_psp_sceGuColor(color: Int)

    @JvmStatic
    external fun libc_psp_sceGuColorMaterial(components: Int)

    @JvmStatic
    external fun libc_psp_sceGuAmbient(color: Int)

    @JvmStatic
    external fun libc_psp_sceGuAmbientColor(color: Int)

    @JvmStatic
    external fun libc_psp_sceGuMaterial(components: Int, color: Int)

    @JvmStatic
    external fun libc_psp_sceGuModelColor(emissive: Int, ambient: Int, diffuse: Int, specular: Int)

    @JvmStatic
    external fun libc_psp_sceGuSpecular(power: Float)

    @JvmStatic
    external fun libc_psp_sceGuTexEnvColor(color: Int)

    @JvmStatic
    external fun libc_psp_sceGuTexFlush()

    @JvmStatic
    external fun libc_psp_sceGuTexOffset(u: Float, v: Float)

    @JvmStatic
    external fun libc_psp_sceGuTexScale(u: Float, v: Float)

    @JvmStatic
    external fun libc_psp_sceGuTexSlope(slope: Float)

    @JvmStatic
    external fun libc_psp_sceGuTexSync()

    @JvmStatic
    external fun libc_psp_sceGuClutLoad(numBlocks: Int, cbp: Long)

    @JvmStatic
    external fun libc_psp_sceGuOffset(x: Int, y: Int)

    @JvmStatic
    external fun libc_psp_sceGuScissor(x: Int, y: Int, w: Int, h: Int)

    @JvmStatic
    external fun libc_psp_sceGuViewport(cx: Int, cy: Int, width: Int, height: Int)

    @JvmStatic
    external fun libc_psp_sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: Long, vertices: Long)

    @JvmStatic
    external fun libc_psp_sceGuPatchDivide(ulevel: Int, vlevel: Int)

    @JvmStatic
    external fun libc_psp_sceGuPatchFrontFace(a0: Int)

    @JvmStatic
    external fun libc_psp_sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: Long, vertices: Long)

    @JvmStatic
    external fun libc_psp_sceGuMorphWeight(index: Int, weight: Float)

    @JvmStatic
    external fun libc_psp_sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: Long, vertices: Long)

    @JvmStatic
    external fun libc_psp_sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: Long, vertices: Long)

    @JvmStatic
    external fun libc_psp_sceGumFastInverse()

    @JvmStatic
    external fun libc_psp_sceGumFullInverse()

    @JvmStatic
    external fun libc_psp_sceGumLoadIdentity()

    @JvmStatic
    external fun libc_psp_sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float)

    @JvmStatic
    external fun libc_psp_sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float)

    @JvmStatic
    external fun libc_psp_sceGumPopMatrix()

    @JvmStatic
    external fun libc_psp_sceGumPushMatrix()

    @JvmStatic
    external fun libc_psp_sceGumRotateX(angle: Float)

    @JvmStatic
    external fun libc_psp_sceGumRotateY(angle: Float)

    @JvmStatic
    external fun libc_psp_sceGumRotateZ(angle: Float)

    @JvmStatic
    external fun libc_psp_sceGumUpdateMatrix()

    @JvmStatic
    external fun libc_psp_sceMp3ReserveMp3Handle(args: Long): Int

    @JvmStatic
    external fun libc_psp_sceMp3InitResource(): Int

    @JvmStatic
    external fun libc_psp_sceMp3TermResource(): Int

    @JvmStatic
    external fun libc_psp_sceRegOpenRegistry(reg: Long, mode: Int, handle: Long): Int

    @JvmStatic
    external fun libc_psp_sceRegRemoveRegistry(key: Long): Int

    @JvmStatic
    external fun libc_psp_sceOpenPSIDGetOpenPSID(openpsid: Long): Int

    @JvmStatic
    external fun libc_psp_sceUtilityMsgDialogInitStart(params: Long): Int

    @JvmStatic
    external fun libc_psp_sceUtilityMsgDialogShutdownStart()

    @JvmStatic
    external fun libc_psp_sceUtilityMsgDialogGetStatus(): Int

    @JvmStatic
    external fun libc_psp_sceUtilityMsgDialogUpdate(n: Int)

    @JvmStatic
    external fun libc_psp_sceUtilityMsgDialogAbort(): Int

    @JvmStatic
    external fun libc_psp_sceUtilityNetconfInitStart(data: Long): Int

    @JvmStatic
    external fun libc_psp_sceUtilityNetconfShutdownStart(): Int

    @JvmStatic
    external fun libc_psp_sceUtilityNetconfUpdate(unknown: Int): Int

    @JvmStatic
    external fun libc_psp_sceUtilityNetconfGetStatus(): Int

    @JvmStatic
    external fun libc_psp_sceUtilityCheckNetParam(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceUtilitySavedataInitStart(params: Long): Int

    @JvmStatic
    external fun libc_psp_sceUtilitySavedataGetStatus(): Int

    @JvmStatic
    external fun libc_psp_sceUtilitySavedataShutdownStart(): Int

    @JvmStatic
    external fun libc_psp_sceUtilitySavedataUpdate(unknown: Int)

    @JvmStatic
    external fun libc_psp_sceUtilityGameSharingInitStart(params: Long): Int

    @JvmStatic
    external fun libc_psp_sceUtilityGameSharingShutdownStart()

    @JvmStatic
    external fun libc_psp_sceUtilityGameSharingGetStatus(): Int

    @JvmStatic
    external fun libc_psp_sceUtilityGameSharingUpdate(n: Int)

    @JvmStatic
    external fun libc_psp_sceUtilityHtmlViewerInitStart(params: Long): Int

    @JvmStatic
    external fun libc_psp_sceUtilityHtmlViewerShutdownStart(): Int

    @JvmStatic
    external fun libc_psp_sceUtilityHtmlViewerUpdate(n: Int): Int

    @JvmStatic
    external fun libc_psp_sceUtilityHtmlViewerGetStatus(): Int

    @JvmStatic
    external fun libc_psp_sceUtilityOskInitStart(params: Long): Int

    @JvmStatic
    external fun libc_psp_sceUtilityOskShutdownStart(): Int

    @JvmStatic
    external fun libc_psp_sceUtilityOskUpdate(n: Int): Int

    @JvmStatic
    external fun libc_psp_sceUtilityOskGetStatus(): Int

    @JvmStatic
    external fun libc_psp_sceUtilityCreateNetParam(conf: Int): Int

    @JvmStatic
    external fun libc_psp_sceUtilityCopyNetParam(src: Int, dest: Int): Int

    @JvmStatic
    external fun libc_psp_sceUtilityDeleteNetParam(conf: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetTerm(): Int

    @JvmStatic
    external fun libc_psp_sceNetFreeThreadinfo(thid: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetThreadAbort(thid: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetEtherStrton(name: Long, mac: Long)

    @JvmStatic
    external fun libc_psp_sceNetEtherNtostr(mac: Long, name: Long)

    @JvmStatic
    external fun libc_psp_sceNetGetLocalEtherAddr(mac: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetGetMallocStat(stat: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlTerm(): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlConnect(name: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlDisconnect(): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlGetState(event: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlCreate(name: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlJoin(scaninfo: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlGetAdhocId(id: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlCreateEnterGameMode(name: Long, unknown: Int, num: Int, macs: Long, timeout: Int, unknown2: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlJoinEnterGameMode(name: Long, hostmac: Long, timeout: Int, unknown: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlGetGameModeInfo(gamemodeinfo: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlExitGameMode(): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlGetPeerList(length: Long, buf: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlGetPeerInfo(mac: Long, size: Int, peerinfo: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlScan(): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlGetScanInfo(length: Long, buf: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlAddHandler(handler: Long, unknown: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlDelHandler(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlGetNameByAddr(mac: Long, nickname: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlGetAddrByName(nickname: Long, length: Long, buf: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocctlGetParameter(params: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocInit(): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocTerm(): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPdpCreate(mac: Long, port: Short, bufSize: Int, unk1: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPdpDelete(id: Int, unk1: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPdpSend(id: Int, destMacAddr: Long, port: Short, data: Long, len: Int, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPdpRecv(id: Int, srcMacAddr: Long, port: Long, data: Long, dataLength: Long, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocGetPdpStat(size: Long, stat: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocGameModeCreateMaster(data: Long, size: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocGameModeCreateReplica(mac: Long, data: Long, size: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocGameModeUpdateMaster(): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocGameModeDeleteMaster(): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocGameModeDeleteReplica(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPtpOpen(srcmac: Long, srcport: Short, destmac: Long, destport: Short, bufSize: Int, delay: Int, count: Int, unk1: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPtpConnect(id: Int, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPtpListen(srcmac: Long, srcport: Short, bufSize: Int, delay: Int, count: Int, queue: Int, unk1: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPtpAccept(id: Int, mac: Long, port: Long, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPtpSend(id: Int, data: Long, dataSize: Long, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPtpRecv(id: Int, data: Long, dataSize: Long, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPtpFlush(id: Int, timeout: Int, nonblock: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocPtpClose(id: Int, unk1: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocGetPtpStat(size: Long, stat: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingInit(memsize: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingTerm(): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingDelete(matchingId: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingStop(matchingId: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: Long, optLen: Int, optData: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: Long, optLen: Int, optData: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingSendData(matchingId: Int, mac: Long, dataLen: Int, data: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: Long, optData: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingGetMembers(matchingId: Int, length: Long, buf: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingGetPoolMaxAlloc(): Int

    @JvmStatic
    external fun libc_psp_sceNetAdhocMatchingGetPoolStat(poolstat: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetApctlInit(stackSize: Int, initPriority: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetApctlTerm(): Int

    @JvmStatic
    external fun libc_psp_sceNetApctlAddHandler(handler: Long, parg: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetApctlDelHandler(handlerId: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetApctlConnect(connIndex: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetApctlDisconnect(): Int

    @JvmStatic
    external fun libc_psp_sceNetApctlGetState(pstate: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetInetInit(): Int

    @JvmStatic
    external fun libc_psp_sceNetInetTerm(): Int

    @JvmStatic
    external fun libc_psp_sceNetInetAccept(s: Int, addr: Long, addrLen: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetInetBind(s: Int, myAddr: Long, addrLen: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetInetConnect(s: Int, servAddr: Long, addrLen: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: Long, optlEn: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetInetListen(s: Int, backlog: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetInetRecv(s: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_psp_sceNetInetRecvfrom(s: Int, buf: Long, flags: Long, arg1: Int, from: Long, fromLen: Long): Long

    @JvmStatic
    external fun libc_psp_sceNetInetSend(s: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_psp_sceNetInetSendto(s: Int, buf: Long, len: Long, flags: Int, to: Long, toLen: Int): Long

    @JvmStatic
    external fun libc_psp_sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: Long, optLen: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetInetShutdown(s: Int, how: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetInetClose(s: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetInetGetErrno(): Int

    @JvmStatic
    external fun libc_psp_sceSslInit(unknown1: Int): Int

    @JvmStatic
    external fun libc_psp_sceSslEnd(): Int

    @JvmStatic
    external fun libc_psp_sceSslGetUsedMemoryMax(memory: Long): Int

    @JvmStatic
    external fun libc_psp_sceSslGetUsedMemoryCurrent(memory: Long): Int

    @JvmStatic
    external fun libc_psp_sceHttpInit(unknown1: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpEnd(): Int

    @JvmStatic
    external fun libc_psp_sceHttpCreateTemplate(agent: Long, unknown1: Int, unknown2: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpDeleteTemplate(templateid: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpCreateConnection(templateid: Int, host: Long, unknown1: Long, port: Short, unknown2: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpCreateConnectionWithURL(templateid: Int, url: Long, unknown1: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpDeleteConnection(connectionId: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpDeleteRequest(requestId: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpSendRequest(requestId: Int, data: Long, dataSize: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpAbortRequest(requestId: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpReadData(requestId: Int, data: Long, dataSize: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpGetContentLength(requestId: Int, contentLength: Long): Int

    @JvmStatic
    external fun libc_psp_sceHttpGetStatusCode(requestId: Int, statusCode: Long): Int

    @JvmStatic
    external fun libc_psp_sceHttpSetResolveTimeOut(id: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpSetResolveRetry(id: Int, count: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpSetConnectTimeOut(id: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpSetSendTimeOut(id: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpSetRecvTimeOut(id: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpEnableKeepAlive(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpDisableKeepAlive(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpEnableRedirect(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpDisableRedirect(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpEnableCookie(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpDisableCookie(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpSaveSystemCookie(): Int

    @JvmStatic
    external fun libc_psp_sceHttpLoadSystemCookie(): Int

    @JvmStatic
    external fun libc_psp_sceHttpAddExtraHeader(id: Int, name: Long, value: Long, unknown1: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpDeleteHeader(id: Int, name: Long): Int

    @JvmStatic
    external fun libc_psp_sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpsEnd(): Int

    @JvmStatic
    external fun libc_psp_sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpDisableAuth(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpDisableCache(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpEnableAuth(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpEnableCache(id: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpEndCache(): Int

    @JvmStatic
    external fun libc_psp_sceHttpGetAllHeader(request: Int, header: Long, headerSize: Long): Int

    @JvmStatic
    external fun libc_psp_sceHttpGetNetworkErrno(request: Int, errNum: Long): Int

    @JvmStatic
    external fun libc_psp_sceHttpGetProxy(id: Int, activateFlag: Long, mode: Long, proxyHost: Long, len: Long, proxyPort: Long): Int

    @JvmStatic
    external fun libc_psp_sceHttpInitCache(maxSize: Long): Int

    @JvmStatic
    external fun libc_psp_sceHttpSetAuthInfoCB(id: Int, cbfunc: Long): Int

    @JvmStatic
    external fun libc_psp_sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: Long, newProxyPort: Short): Int

    @JvmStatic
    external fun libc_psp_sceHttpSetResHeaderMaxSize(id: Int, headerSize: Int): Int

    @JvmStatic
    external fun libc_psp_sceHttpSetMallocFunction(mallocFunc: Long, freeFunc: Long, reallocFunc: Long): Int

    @JvmStatic
    external fun libc_psp_sceNetResolverInit(): Int

    @JvmStatic
    external fun libc_psp_sceNetResolverCreate(rid: Long, buf: Long, bufLength: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetResolverDelete(rid: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetResolverStartNtoA(rid: Int, hostname: Long, addr: Long, timeout: Int, retry: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetResolverStartAtoN(rid: Int, addr: Long, hostname: Long, hostnameLen: Int, timeout: Int, retry: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetResolverStop(rid: Int): Int

    @JvmStatic
    external fun libc_psp_sceNetResolverTerm(): Int
}

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChRelease(channel: Int): Int =
    PspJniBridge.libc_psp_sceAudioChRelease(channel)

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAudioOutput(channel, vol, (buf?.value ?: 0L))

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAudioOutputBlocking(channel, vol, (buf?.value ?: 0L))

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAudioOutputPanned(channel, leftVol, rightVol, (buf?.value ?: 0L))

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAudioOutputPannedBlocking(channel, leftVol, rightVol, (buf?.value ?: 0L))

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    PspJniBridge.libc_psp_sceAudioGetChannelRestLen(channel)

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    PspJniBridge.libc_psp_sceAudioGetChannelRestLength(channel)

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    PspJniBridge.libc_psp_sceAudioSetChannelDataLen(channel, sampleCount)

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    PspJniBridge.libc_psp_sceAudioChangeChannelVolume(channel, leftVol, rightVol)

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    PspJniBridge.libc_psp_sceAudioOutput2Reserve(sampleCount)

public actual fun sceAudioOutput2Release(): Int =
    PspJniBridge.libc_psp_sceAudioOutput2Release()

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    PspJniBridge.libc_psp_sceAudioOutput2ChangeLength(sampleCount)

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAudioOutput2OutputBlocking(vol, (buf?.value ?: 0L))

public actual fun sceAudioOutput2GetRestSample(): Int =
    PspJniBridge.libc_psp_sceAudioOutput2GetRestSample()

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    0

public actual fun sceAudioSRCChRelease(): Int =
    PspJniBridge.libc_psp_sceAudioSRCChRelease()

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAudioSRCOutputBlocking(vol, (buf?.value ?: 0L))

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    PspJniBridge.libc_psp_sceAudioInputInit(unknown1, gain, unknown2)

public actual fun sceAudioInputInitEx(params: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAudioInputInitEx((params?.value ?: 0L))

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
}

public actual fun sceAudioGetInputLength(): Int =
    PspJniBridge.libc_psp_sceAudioGetInputLength()

public actual fun sceAudioWaitInputEnd(): Int =
    PspJniBridge.libc_psp_sceAudioWaitInputEnd()

public actual fun sceAudioPollInputEnd(): Int =
    PspJniBridge.libc_psp_sceAudioPollInputEnd()

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    PspJniBridge.libc_psp_sceAtracGetAtracID(uiCodecType.toInt())

public actual fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int =
    PspJniBridge.libc_psp_sceAtracSetDataAndGetID((buf?.value ?: 0L), bufsize.toLong())

public actual fun sceAtracDecodeData(atracId: Int, outSamples: COpaquePointer?, outN: COpaquePointer?, outEnd: COpaquePointer?, outRemainFrame: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracDecodeData(atracId, (outSamples?.value ?: 0L), (outN?.value ?: 0L), (outEnd?.value ?: 0L), (outRemainFrame?.value ?: 0L))

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetRemainFrame(atracId, (outRemainFrame?.value ?: 0L))

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: COpaquePointer?, readOffset: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetStreamDataInfo(atracId, (writePointer?.value ?: 0L), (availableBytes?.value ?: 0L), (readOffset?.value ?: 0L))

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    PspJniBridge.libc_psp_sceAtracAddStreamData(atracId, bytesToAdd.toInt())

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetBitrate(atracId, (outBitrate?.value ?: 0L))

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    PspJniBridge.libc_psp_sceAtracSetLoopNum(atracId, nloops)

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    PspJniBridge.libc_psp_sceAtracReleaseAtracID(atracId)

public actual fun sceAtracGetNextSample(atracId: Int, outN: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetNextSample(atracId, (outN?.value ?: 0L))

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetMaxSample(atracId, (outMax?.value ?: 0L))

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetBufferInfoForReseting(atracId, uiSample.toInt(), (pbufferInfo?.value ?: 0L))

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetChannel(atracId, (puiChannel?.value ?: 0L))

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetInternalErrorInfo(atracId, (piResult?.value ?: 0L))

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: COpaquePointer?, puiLoopStatus: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetLoopStatus(atracId, (piLoopNum?.value ?: 0L), (puiLoopStatus?.value ?: 0L))

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetNextDecodePosition(atracId, (puiSamplePosition?.value ?: 0L))

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: COpaquePointer?, puiDataByte: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetSecondBufferInfo(atracId, (puiPosition?.value ?: 0L), (puiDataByte?.value ?: 0L))

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: COpaquePointer?, piLoopStartSample: COpaquePointer?, piLoopEndSample: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceAtracGetSoundSample(atracId, (piEndSample?.value ?: 0L), (piLoopStartSample?.value ?: 0L), (piLoopEndSample?.value ?: 0L))

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    PspJniBridge.libc_psp_sceAtracResetPlayPosition(atracId, uiSample.toInt(), uiWriteByteFirstBuf.toInt(), uiWriteByteSecondBuf.toInt())

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int =
    PspJniBridge.libc_psp_sceAtracSetData(atracId, (pucBufferAddr?.value ?: 0L), uiBufferByte.toInt())

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    PspJniBridge.libc_psp_sceAtracSetHalfwayBuffer(atracId, (pucBufferAddr?.value ?: 0L), uiReadByte.toInt(), uiBufferByte.toInt())

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    PspJniBridge.libc_psp_sceAtracSetHalfwayBufferAndGetID((pucBufferAddr?.value ?: 0L), uiReadByte.toInt(), uiBufferByte.toInt())

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int =
    PspJniBridge.libc_psp_sceAtracSetSecondBuffer(atracId, (pucSecondBufferAddr?.value ?: 0L), uiSecondBufferByte.toInt())

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    PspJniBridge.libc_psp_sceCtrlSetSamplingCycle(cycle)

public actual fun sceCtrlGetSamplingCycle(pcycle: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceCtrlGetSamplingCycle((pcycle?.value ?: 0L))

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    0

public actual fun sceCtrlGetSamplingMode(pmode: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceCtrlGetSamplingMode((pmode?.value ?: 0L))

public actual fun sceCtrlPeekBufferPositive(padData: COpaquePointer?, count: Int): Int =
    PspJniBridge.libc_psp_sceCtrlPeekBufferPositive((padData?.value ?: 0L), count)

public actual fun sceCtrlPeekBufferNegative(padData: COpaquePointer?, count: Int): Int =
    PspJniBridge.libc_psp_sceCtrlPeekBufferNegative((padData?.value ?: 0L), count)

public actual fun sceCtrlReadBufferPositive(padData: COpaquePointer?, count: Int): Int =
    PspJniBridge.libc_psp_sceCtrlReadBufferPositive((padData?.value ?: 0L), count)

public actual fun sceCtrlReadBufferNegative(padData: COpaquePointer?, count: Int): Int =
    PspJniBridge.libc_psp_sceCtrlReadBufferNegative((padData?.value ?: 0L), count)

public actual fun sceCtrlPeekLatch(latchData: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceCtrlPeekLatch((latchData?.value ?: 0L))

public actual fun sceCtrlReadLatch(latchData: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceCtrlReadLatch((latchData?.value ?: 0L))

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    PspJniBridge.libc_psp_sceCtrlSetIdleCancelThreshold(idlereset, idleback)

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: COpaquePointer?, idleback: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceCtrlGetIdleCancelThreshold((idlereset?.value ?: 0L), (idleback?.value ?: 0L))

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    0u

public actual fun sceDisplayGetMode(pmode: COpaquePointer?, pwidth: COpaquePointer?, pheight: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceDisplayGetMode((pmode?.value ?: 0L), (pwidth?.value ?: 0L), (pheight?.value ?: 0L))

public actual fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    0u

public actual fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: COpaquePointer?, pixelFormat: COpaquePointer?, sync: DisplaySetBufSync): Int =
    0

public actual fun sceDisplayGetVcount(): UInt =
    PspJniBridge.libc_psp_sceDisplayGetVcount().toUInt()

public actual fun sceDisplayWaitVblank(): Int =
    PspJniBridge.libc_psp_sceDisplayWaitVblank()

public actual fun sceDisplayWaitVblankCB(): Int =
    PspJniBridge.libc_psp_sceDisplayWaitVblankCB()

public actual fun sceDisplayWaitVblankStart(): Int =
    PspJniBridge.libc_psp_sceDisplayWaitVblankStart()

public actual fun sceDisplayWaitVblankStartCB(): Int =
    PspJniBridge.libc_psp_sceDisplayWaitVblankStartCB()

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    PspJniBridge.libc_psp_sceDisplayGetAccumulatedHcount()

public actual fun sceDisplayGetCurrentHcount(): Int =
    PspJniBridge.libc_psp_sceDisplayGetCurrentHcount()

public actual fun sceDisplayGetFramePerSec(): Float =
    PspJniBridge.libc_psp_sceDisplayGetFramePerSec()

public actual fun sceDisplayIsForeground(): Int =
    PspJniBridge.libc_psp_sceDisplayIsForeground()

public actual fun sceDisplayIsVblank(): Int =
    PspJniBridge.libc_psp_sceDisplayIsVblank()

public actual fun sceGeEdramGetSize(): UInt =
    PspJniBridge.libc_psp_sceGeEdramGetSize().toUInt()

public actual fun sceGeEdramGetAddr(): COpaquePointer? =
    PspJniBridge.libc_psp_sceGeEdramGetAddr().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    PspJniBridge.libc_psp_sceGeEdramSetAddrTranslation(width)

public actual fun sceGeGetCmd(cmd: Int): UInt =
    PspJniBridge.libc_psp_sceGeGetCmd(cmd).toUInt()

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int =
    0

public actual fun sceGeGetStack(stackId: Int, stack: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceGeGetStack(stackId, (stack?.value ?: 0L))

public actual fun sceGeSaveContext(context: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceGeSaveContext((context?.value ?: 0L))

public actual fun sceGeRestoreContext(context: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceGeRestoreContext((context?.value ?: 0L))

public actual fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceGeListEnQueue((list?.value ?: 0L), (stall?.value ?: 0L), cbid, (arg?.value ?: 0L))

public actual fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceGeListEnQueueHead((list?.value ?: 0L), (stall?.value ?: 0L), cbid, (arg?.value ?: 0L))

public actual fun sceGeListDeQueue(qid: Int): Int =
    PspJniBridge.libc_psp_sceGeListDeQueue(qid)

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceGeListUpdateStallAddr(qid, (stall?.value ?: 0L))

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    null as GeListState

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    null as GeListState

public actual fun sceGeBreak(mode: Int, pParam: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceGeBreak(mode, (pParam?.value ?: 0L))

public actual fun sceGeContinue(): Int =
    PspJniBridge.libc_psp_sceGeContinue()

public actual fun sceGeSetCallback(cb: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceGeSetCallback((cb?.value ?: 0L))

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    PspJniBridge.libc_psp_sceGeUnsetCallback(cbid)

public actual fun sceKernelExitGame() {
    PspJniBridge.libc_psp_sceKernelExitGame()
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    0

public actual fun sceKernelLoadExec(file: COpaquePointer?, param: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelLoadExec((file?.value ?: 0L), (param?.value ?: 0L))

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? =
    null

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    0

public actual fun sceKernelTotalFreeMemSize(): ULong =
    PspJniBridge.libc_psp_sceKernelTotalFreeMemSize().toULong()

public actual fun sceKernelMaxFreeMemSize(): ULong =
    PspJniBridge.libc_psp_sceKernelMaxFreeMemSize().toULong()

public actual fun sceKernelDevkitVersion(): UInt =
    PspJniBridge.libc_psp_sceKernelDevkitVersion().toUInt()

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    PspJniBridge.libc_psp_sceKernelSetCompiledSdkVersion(version.toInt())

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    PspJniBridge.libc_psp_sceKernelGetCompiledSdkVersion().toUInt()

public actual fun sceKernelLibcTime(t: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelLibcTime((t?.value ?: 0L))

public actual fun sceKernelLibcClock(): UInt =
    PspJniBridge.libc_psp_sceKernelLibcClock().toUInt()

public actual fun sceKernelLibcGettimeofday(tp: COpaquePointer?, tzp: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelLibcGettimeofday((tp?.value ?: 0L), (tzp?.value ?: 0L))

public actual fun sceKernelDcacheWritebackAll() {
    PspJniBridge.libc_psp_sceKernelDcacheWritebackAll()
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    PspJniBridge.libc_psp_sceKernelDcacheWritebackInvalidateAll()
}

public actual fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
    PspJniBridge.libc_psp_sceKernelDcacheWritebackRange((p?.value ?: 0L), size.toInt())
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
    PspJniBridge.libc_psp_sceKernelDcacheWritebackInvalidateRange((p?.value ?: 0L), size.toInt())
}

public actual fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    PspJniBridge.libc_psp_sceKernelDcacheInvalidateRange((p?.value ?: 0L), size.toInt())
}

public actual fun sceKernelIcacheInvalidateAll() {
    PspJniBridge.libc_psp_sceKernelIcacheInvalidateAll()
}

public actual fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    PspJniBridge.libc_psp_sceKernelIcacheInvalidateRange((p?.value ?: 0L), size.toInt())
}

public actual fun sceKernelUtilsMt19937Init(ctx: COpaquePointer?, seed: UInt): Int =
    PspJniBridge.libc_psp_sceKernelUtilsMt19937Init((ctx?.value ?: 0L), seed.toInt())

public actual fun sceKernelUtilsMt19937UInt(ctx: COpaquePointer?): UInt =
    PspJniBridge.libc_psp_sceKernelUtilsMt19937UInt((ctx?.value ?: 0L)).toUInt()

public actual fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelUtilsMd5Digest((data?.value ?: 0L), size.toInt(), (digest?.value ?: 0L))

public actual fun sceKernelUtilsMd5BlockInit(ctx: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelUtilsMd5BlockInit((ctx?.value ?: 0L))

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    PspJniBridge.libc_psp_sceKernelUtilsMd5BlockUpdate((ctx?.value ?: 0L), (data?.value ?: 0L), size.toInt())

public actual fun sceKernelUtilsMd5BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelUtilsMd5BlockResult((ctx?.value ?: 0L), (digest?.value ?: 0L))

public actual fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelUtilsSha1Digest((data?.value ?: 0L), size.toInt(), (digest?.value ?: 0L))

public actual fun sceKernelUtilsSha1BlockInit(ctx: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelUtilsSha1BlockInit((ctx?.value ?: 0L))

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    PspJniBridge.libc_psp_sceKernelUtilsSha1BlockUpdate((ctx?.value ?: 0L), (data?.value ?: 0L), size.toInt())

public actual fun sceKernelUtilsSha1BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelUtilsSha1BlockResult((ctx?.value ?: 0L), (digest?.value ?: 0L))

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelRegisterSubIntrHandler(intNo, no, (handler?.value ?: 0L), (arg?.value ?: 0L))

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    PspJniBridge.libc_psp_sceKernelReleaseSubIntrHandler(intNo, no)

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    PspJniBridge.libc_psp_sceKernelEnableSubIntr(intNo, no)

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    PspJniBridge.libc_psp_sceKernelDisableSubIntr(intNo, no)

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: COpaquePointer?): Int =
    0

public actual fun sceKernelCpuSuspendIntr(): UInt =
    PspJniBridge.libc_psp_sceKernelCpuSuspendIntr().toUInt()

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    PspJniBridge.libc_psp_sceKernelCpuResumeIntr(flags.toInt())
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    PspJniBridge.libc_psp_sceKernelCpuResumeIntrWithSync(flags.toInt())
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    PspJniBridge.libc_psp_sceKernelIsCpuIntrSuspended(flags.toInt())

public actual fun sceKernelIsCpuIntrEnable(): Int =
    PspJniBridge.libc_psp_sceKernelIsCpuIntrEnable()

public actual fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    0

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    0

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    0

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelSelfStopUnloadModule(unknown, argSize.toLong(), (argp?.value ?: 0L))

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelStopUnloadSelfModule(argSize.toLong(), (argp?.value ?: 0L), (status?.value ?: 0L), (option?.value ?: 0L))

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelGetModuleIdList(readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelGetModuleIdList((readBuf?.value ?: 0L), readBufSize, (idCount?.value ?: 0L))

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelVolatileMemLock(unk, (ptr?.value ?: 0L), (size?.value ?: 0L))

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelVolatileMemTryLock(unk, (ptr?.value ?: 0L), (size?.value ?: 0L))

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    PspJniBridge.libc_psp_sceKernelVolatileMemUnlock(unk)

public actual fun sceKernelStdin(): SceUid =
    null as SceUid

public actual fun sceKernelStdout(): SceUid =
    null as SceUid

public actual fun sceKernelStderr(): SceUid =
    null as SceUid

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    null as SceKernelIdListType

public actual fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    0

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int =
    0

public actual fun sceKernelExitThread(status: Int): Int =
    PspJniBridge.libc_psp_sceKernelExitThread(status)

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    PspJniBridge.libc_psp_sceKernelExitDeleteThread(status)

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    0

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    0

public actual fun sceKernelSuspendDispatchThread(): Int =
    PspJniBridge.libc_psp_sceKernelSuspendDispatchThread()

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    PspJniBridge.libc_psp_sceKernelResumeDispatchThread(state)

public actual fun sceKernelSleepThread(): Int =
    PspJniBridge.libc_psp_sceKernelSleepThread()

public actual fun sceKernelSleepThreadCB(): Int =
    PspJniBridge.libc_psp_sceKernelSleepThreadCB()

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    0

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    0

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    0

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    0

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelDelayThread(delay: UInt): Int =
    PspJniBridge.libc_psp_sceKernelDelayThread(delay.toInt())

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    PspJniBridge.libc_psp_sceKernelDelayThreadCB(delay.toInt())

public actual fun sceKernelDelaySysClockThread(delay: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelDelaySysClockThread((delay?.value ?: 0L))

public actual fun sceKernelDelaySysClockThreadCB(delay: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelDelaySysClockThreadCB((delay?.value ?: 0L))

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    PspJniBridge.libc_psp_sceKernelChangeCurrentThreadAttr(unknown, attr)

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    0

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    PspJniBridge.libc_psp_sceKernelRotateThreadReadyQueue(priority)

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    0

public actual fun sceKernelGetThreadId(): Int =
    PspJniBridge.libc_psp_sceKernelGetThreadId()

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    PspJniBridge.libc_psp_sceKernelGetThreadCurrentPriority()

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    0

public actual fun sceKernelCheckThreadStack(): Int =
    PspJniBridge.libc_psp_sceKernelCheckThreadStack()

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    0

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    0

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    0

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    0

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateEventFlag(name: COpaquePointer?, attr: Int, bits: Int, opt: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    0

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    0

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?): Int =
    0

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    0

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateMbx(name: COpaquePointer?, attr: UInt, option: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    0

public actual fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int =
    0

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int =
    0

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: COpaquePointer?): Int =
    0

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelSetSysClockAlarm(clock: COpaquePointer?, handler: COpaquePointer?, common: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    0

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: COpaquePointer?): Int =
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
    PspJniBridge.libc_psp_sceKernelCheckCallback()

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    0

public actual fun sceKernelReferSystemStatus(status: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelReferSystemStatus((status?.value ?: 0L))

public actual fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    0

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    0

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    0

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: COpaquePointer?, recv: COpaquePointer?): Int =
    0

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateVpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, opt: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    0

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int =
    0

public actual fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int =
    0

public actual fun sceKernelCancelVpl(uid: SceUid, num: COpaquePointer?): Int =
    0

public actual fun sceKernelReferVplStatus(uid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelCreateFpl((name?.value ?: 0L), part, attr, size.toInt(), blocks.toInt(), (opt?.value ?: 0L))

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    0

public actual fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: COpaquePointer?): Int =
    0

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int =
    0

public actual fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int =
    0

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: COpaquePointer?): Int =
    0

public actual fun sceKernelReferFplStatus(uid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelUSec2SysClock(usec.toInt(), (clock?.value ?: 0L))

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    PspJniBridge.libc_psp_sceKernelUSec2SysClockWide(usec.toInt())

public actual fun sceKernelSysClock2USec(clock: COpaquePointer?, low: COpaquePointer?, high: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelSysClock2USec((clock?.value ?: 0L), (low?.value ?: 0L), (high?.value ?: 0L))

public actual fun sceKernelSysClock2USecWide(clock: Long, low: COpaquePointer?, high: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelSysClock2USecWide(clock, (low?.value ?: 0L), (high?.value ?: 0L))

public actual fun sceKernelGetSystemTime(time: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceKernelGetSystemTime((time?.value ?: 0L))

public actual fun sceKernelGetSystemTimeWide(): Long =
    PspJniBridge.libc_psp_sceKernelGetSystemTimeWide()

public actual fun sceKernelGetSystemTimeLow(): UInt =
    PspJniBridge.libc_psp_sceKernelGetSystemTimeLow().toUInt()

public actual fun sceKernelCreateVTimer(name: COpaquePointer?, opt: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: COpaquePointer?): Int =
    0

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    0L

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: COpaquePointer?): Int =
    0

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    0L

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: COpaquePointer?): Int =
    0

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    0L

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    0

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: COpaquePointer?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int =
    0

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int =
    0

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    0

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelRegisterThreadEventHandler(name: COpaquePointer?, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    0

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelReferThreadProfiler(): COpaquePointer? =
    PspJniBridge.libc_psp_sceKernelReferThreadProfiler().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceKernelReferGlobalProfiler(): COpaquePointer? =
    PspJniBridge.libc_psp_sceKernelReferGlobalProfiler().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbStart((driverName?.value ?: 0L), size, (args?.value ?: 0L))

public actual fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbStop((driverName?.value ?: 0L), size, (args?.value ?: 0L))

public actual fun sceUsbActivate(pid: UInt): Int =
    PspJniBridge.libc_psp_sceUsbActivate(pid.toInt())

public actual fun sceUsbDeactivate(pid: UInt): Int =
    PspJniBridge.libc_psp_sceUsbDeactivate(pid.toInt())

public actual fun sceUsbGetState(): Int =
    PspJniBridge.libc_psp_sceUsbGetState()

public actual fun sceUsbGetDrvState(driverName: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbGetDrvState((driverName?.value ?: 0L))

public actual fun sceUsbCamSetupStill(param: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbCamSetupStill((param?.value ?: 0L))

public actual fun sceUsbCamSetupStillEx(param: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbCamSetupStillEx((param?.value ?: 0L))

public actual fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int =
    PspJniBridge.libc_psp_sceUsbCamStillInputBlocking((buf?.value ?: 0L), size.toLong())

public actual fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int =
    PspJniBridge.libc_psp_sceUsbCamStillInput((buf?.value ?: 0L), size.toLong())

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    PspJniBridge.libc_psp_sceUsbCamStillWaitInputEnd()

public actual fun sceUsbCamStillPollInputEnd(): Int =
    PspJniBridge.libc_psp_sceUsbCamStillPollInputEnd()

public actual fun sceUsbCamStillCancelInput(): Int =
    PspJniBridge.libc_psp_sceUsbCamStillCancelInput()

public actual fun sceUsbCamStillGetInputLength(): Int =
    PspJniBridge.libc_psp_sceUsbCamStillGetInputLength()

public actual fun sceUsbCamSetupVideo(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    PspJniBridge.libc_psp_sceUsbCamSetupVideo((param?.value ?: 0L), (workArea?.value ?: 0L), workAreaSize)

public actual fun sceUsbCamSetupVideoEx(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    PspJniBridge.libc_psp_sceUsbCamSetupVideoEx((param?.value ?: 0L), (workArea?.value ?: 0L), workAreaSize)

public actual fun sceUsbCamStartVideo(): Int =
    PspJniBridge.libc_psp_sceUsbCamStartVideo()

public actual fun sceUsbCamStopVideo(): Int =
    PspJniBridge.libc_psp_sceUsbCamStopVideo()

public actual fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int =
    PspJniBridge.libc_psp_sceUsbCamReadVideoFrameBlocking((buf?.value ?: 0L), size.toLong())

public actual fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int =
    PspJniBridge.libc_psp_sceUsbCamReadVideoFrame((buf?.value ?: 0L), size.toLong())

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    PspJniBridge.libc_psp_sceUsbCamWaitReadVideoFrameEnd()

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    PspJniBridge.libc_psp_sceUsbCamPollReadVideoFrameEnd()

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    PspJniBridge.libc_psp_sceUsbCamGetReadVideoFrameSize()

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    PspJniBridge.libc_psp_sceUsbCamSetSaturation(saturation)

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    PspJniBridge.libc_psp_sceUsbCamSetBrightness(brightness)

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    PspJniBridge.libc_psp_sceUsbCamSetContrast(contrast)

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    PspJniBridge.libc_psp_sceUsbCamSetSharpness(sharpness)

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    0

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    0

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    PspJniBridge.libc_psp_sceUsbCamSetReverseMode(reverseFlags)

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    PspJniBridge.libc_psp_sceUsbCamSetZoom(zoom)

public actual fun sceUsbCamGetSaturation(saturation: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbCamGetSaturation((saturation?.value ?: 0L))

public actual fun sceUsbCamGetBrightness(brightness: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbCamGetBrightness((brightness?.value ?: 0L))

public actual fun sceUsbCamGetContrast(contrast: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbCamGetContrast((contrast?.value ?: 0L))

public actual fun sceUsbCamGetSharpness(sharpness: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbCamGetSharpness((sharpness?.value ?: 0L))

public actual fun sceUsbCamGetImageEffectMode(effectMode: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbCamGetImageEffectMode((effectMode?.value ?: 0L))

public actual fun sceUsbCamGetEvLevel(exposureLevel: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbCamGetEvLevel((exposureLevel?.value ?: 0L))

public actual fun sceUsbCamGetReverseMode(reverseFlags: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbCamGetReverseMode((reverseFlags?.value ?: 0L))

public actual fun sceUsbCamGetZoom(zoom: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUsbCamGetZoom((zoom?.value ?: 0L))

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    PspJniBridge.libc_psp_sceUsbCamAutoImageReverseSW(on)

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    PspJniBridge.libc_psp_sceUsbCamGetAutoImageReverseState()

public actual fun sceUsbCamGetLensDirection(): Int =
    PspJniBridge.libc_psp_sceUsbCamGetLensDirection()

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    0

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    PspJniBridge.libc_psp_sceUsbstorBootUnregisterNotify(eventFlag.toInt())

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    PspJniBridge.libc_psp_sceUsbstorBootSetCapacity(size.toInt())

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    0

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    PspJniBridge.libc_psp_scePowerUnregisterCallback(slot)

public actual fun scePowerIsPowerOnline(): Int =
    PspJniBridge.libc_psp_scePowerIsPowerOnline()

public actual fun scePowerIsBatteryExist(): Int =
    PspJniBridge.libc_psp_scePowerIsBatteryExist()

public actual fun scePowerIsBatteryCharging(): Int =
    PspJniBridge.libc_psp_scePowerIsBatteryCharging()

public actual fun scePowerGetBatteryChargingStatus(): Int =
    PspJniBridge.libc_psp_scePowerGetBatteryChargingStatus()

public actual fun scePowerIsLowBattery(): Int =
    PspJniBridge.libc_psp_scePowerIsLowBattery()

public actual fun scePowerGetBatteryLifePercent(): Int =
    PspJniBridge.libc_psp_scePowerGetBatteryLifePercent()

public actual fun scePowerGetBatteryLifeTime(): Int =
    PspJniBridge.libc_psp_scePowerGetBatteryLifeTime()

public actual fun scePowerGetBatteryTemp(): Int =
    PspJniBridge.libc_psp_scePowerGetBatteryTemp()

public actual fun scePowerGetBatteryElec(): Int =
    PspJniBridge.libc_psp_scePowerGetBatteryElec()

public actual fun scePowerGetBatteryVolt(): Int =
    PspJniBridge.libc_psp_scePowerGetBatteryVolt()

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    PspJniBridge.libc_psp_scePowerSetCpuClockFrequency(cpufreq)

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    PspJniBridge.libc_psp_scePowerSetBusClockFrequency(busfreq)

public actual fun scePowerGetCpuClockFrequency(): Int =
    PspJniBridge.libc_psp_scePowerGetCpuClockFrequency()

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    PspJniBridge.libc_psp_scePowerGetCpuClockFrequencyInt()

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    PspJniBridge.libc_psp_scePowerGetCpuClockFrequencyFloat()

public actual fun scePowerGetBusClockFrequency(): Int =
    PspJniBridge.libc_psp_scePowerGetBusClockFrequency()

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    PspJniBridge.libc_psp_scePowerGetBusClockFrequencyInt()

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    PspJniBridge.libc_psp_scePowerGetBusClockFrequencyFloat()

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    PspJniBridge.libc_psp_scePowerSetClockFrequency(pllfreq, cpufreq, busfreq)

public actual fun scePowerLock(unknown: Int): Int =
    PspJniBridge.libc_psp_scePowerLock(unknown)

public actual fun scePowerUnlock(unknown: Int): Int =
    PspJniBridge.libc_psp_scePowerUnlock(unknown)

public actual fun scePowerTick(t: PowerTick): Int =
    0

public actual fun scePowerGetIdleTimer(): Int =
    PspJniBridge.libc_psp_scePowerGetIdleTimer()

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    PspJniBridge.libc_psp_scePowerIdleTimerEnable(unknown)

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    PspJniBridge.libc_psp_scePowerIdleTimerDisable(unknown)

public actual fun scePowerRequestStandby(): Int =
    PspJniBridge.libc_psp_scePowerRequestStandby()

public actual fun scePowerRequestSuspend(): Int =
    PspJniBridge.libc_psp_scePowerRequestSuspend()

public actual fun sceWlanDevIsPowerOn(): Int =
    PspJniBridge.libc_psp_sceWlanDevIsPowerOn()

public actual fun sceWlanGetSwitchState(): Int =
    PspJniBridge.libc_psp_sceWlanGetSwitchState()

public actual fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceWlanGetEtherAddr((etherAddr?.value ?: 0L))

public actual fun sceWlanDevAttach(): Int =
    PspJniBridge.libc_psp_sceWlanDevAttach()

public actual fun sceWlanDevDetach(): Int =
    PspJniBridge.libc_psp_sceWlanDevDetach()

public actual fun sceRtcGetTickResolution(): UInt =
    PspJniBridge.libc_psp_sceRtcGetTickResolution().toUInt()

public actual fun sceRtcGetCurrentTick(tick: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcGetCurrentTick((tick?.value ?: 0L))

public actual fun sceRtcGetCurrentClock(tm: COpaquePointer?, tz: Int): Int =
    PspJniBridge.libc_psp_sceRtcGetCurrentClock((tm?.value ?: 0L), tz)

public actual fun sceRtcGetCurrentClockLocalTime(tm: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcGetCurrentClockLocalTime((tm?.value ?: 0L))

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: COpaquePointer?, tickLocal: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcConvertUtcToLocalTime((tickUtc?.value ?: 0L), (tickLocal?.value ?: 0L))

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: COpaquePointer?, tickUtc: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcConvertLocalTimeToUTC((tickLocal?.value ?: 0L), (tickUtc?.value ?: 0L))

public actual fun sceRtcIsLeapYear(year: Int): Int =
    PspJniBridge.libc_psp_sceRtcIsLeapYear(year)

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    PspJniBridge.libc_psp_sceRtcGetDaysInMonth(year, month)

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    PspJniBridge.libc_psp_sceRtcGetDayOfWeek(year, month, day)

public actual fun sceRtcCheckValid(date: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcCheckValid((date?.value ?: 0L))

public actual fun sceRtcSetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcSetTick((date?.value ?: 0L), (tick?.value ?: 0L))

public actual fun sceRtcGetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcGetTick((date?.value ?: 0L), (tick?.value ?: 0L))

public actual fun sceRtcCompareTick(tick1: COpaquePointer?, tick2: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcCompareTick((tick1?.value ?: 0L), (tick2?.value ?: 0L))

public actual fun sceRtcTickAddTicks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numTicks: ULong): Int =
    PspJniBridge.libc_psp_sceRtcTickAddTicks((destTick?.value ?: 0L), (srcTick?.value ?: 0L), numTicks.toLong())

public actual fun sceRtcTickAddMicroseconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMs: ULong): Int =
    PspJniBridge.libc_psp_sceRtcTickAddMicroseconds((destTick?.value ?: 0L), (srcTick?.value ?: 0L), numMs.toLong())

public actual fun sceRtcTickAddSeconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numSeconds: ULong): Int =
    PspJniBridge.libc_psp_sceRtcTickAddSeconds((destTick?.value ?: 0L), (srcTick?.value ?: 0L), numSeconds.toLong())

public actual fun sceRtcTickAddMinutes(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMinutes: ULong): Int =
    PspJniBridge.libc_psp_sceRtcTickAddMinutes((destTick?.value ?: 0L), (srcTick?.value ?: 0L), numMinutes.toLong())

public actual fun sceRtcTickAddHours(destTick: COpaquePointer?, srcTick: COpaquePointer?, numHours: ULong): Int =
    PspJniBridge.libc_psp_sceRtcTickAddHours((destTick?.value ?: 0L), (srcTick?.value ?: 0L), numHours.toLong())

public actual fun sceRtcTickAddDays(destTick: COpaquePointer?, srcTick: COpaquePointer?, numDays: ULong): Int =
    PspJniBridge.libc_psp_sceRtcTickAddDays((destTick?.value ?: 0L), (srcTick?.value ?: 0L), numDays.toLong())

public actual fun sceRtcTickAddWeeks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numWeeks: ULong): Int =
    PspJniBridge.libc_psp_sceRtcTickAddWeeks((destTick?.value ?: 0L), (srcTick?.value ?: 0L), numWeeks.toLong())

public actual fun sceRtcTickAddMonths(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMonths: ULong): Int =
    PspJniBridge.libc_psp_sceRtcTickAddMonths((destTick?.value ?: 0L), (srcTick?.value ?: 0L), numMonths.toLong())

public actual fun sceRtcTickAddYears(destTick: COpaquePointer?, srcTick: COpaquePointer?, numYears: ULong): Int =
    PspJniBridge.libc_psp_sceRtcTickAddYears((destTick?.value ?: 0L), (srcTick?.value ?: 0L), numYears.toLong())

public actual fun sceRtcSetTimeT(date: COpaquePointer?, time: UInt): Int =
    PspJniBridge.libc_psp_sceRtcSetTimeT((date?.value ?: 0L), time.toInt())

public actual fun sceRtcGetTimeT(date: COpaquePointer?, time: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcGetTimeT((date?.value ?: 0L), (time?.value ?: 0L))

public actual fun sceRtcSetTime64T(date: COpaquePointer?, time: ULong): Int =
    PspJniBridge.libc_psp_sceRtcSetTime64T((date?.value ?: 0L), time.toLong())

public actual fun sceRtcGetTime64T(date: COpaquePointer?, time: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcGetTime64T((date?.value ?: 0L), (time?.value ?: 0L))

public actual fun sceRtcSetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    PspJniBridge.libc_psp_sceRtcSetDosTime((date?.value ?: 0L), dosTime.toInt())

public actual fun sceRtcGetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    PspJniBridge.libc_psp_sceRtcGetDosTime((date?.value ?: 0L), dosTime.toInt())

public actual fun sceRtcSetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcSetWin32FileTime((date?.value ?: 0L), (time?.value ?: 0L))

public actual fun sceRtcGetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcGetWin32FileTime((date?.value ?: 0L), (time?.value ?: 0L))

public actual fun sceRtcParseDateTime(destTick: COpaquePointer?, dateString: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcParseDateTime((destTick?.value ?: 0L), (dateString?.value ?: 0L))

public actual fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    PspJniBridge.libc_psp_sceRtcFormatRFC3339((pszDateTime?.value ?: 0L), (pUtc?.value ?: 0L), timeZoneMinutes)

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcFormatRFC3339LocalTime((pszDateTime?.value ?: 0L), (pUtc?.value ?: 0L))

public actual fun sceRtcParseRFC3339(pUtc: COpaquePointer?, pszDateTime: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcParseRFC3339((pUtc?.value ?: 0L), (pszDateTime?.value ?: 0L))

public actual fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    PspJniBridge.libc_psp_sceRtcFormatRFC2822((pszDateTime?.value ?: 0L), (pUtc?.value ?: 0L), timeZoneMinutes)

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRtcFormatRFC2822LocalTime((pszDateTime?.value ?: 0L), (pUtc?.value ?: 0L))

public actual fun sceIoOpen(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    null as SceUid

public actual fun sceIoOpenAsync(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    null as SceUid

public actual fun sceIoClose(fd: SceUid): Int =
    0

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    0

public actual fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    0

public actual fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    0

public actual fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    0

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    0L

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    0

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    0

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    0

public actual fun sceIoRemove(file: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceIoRemove((file?.value ?: 0L))

public actual fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int =
    PspJniBridge.libc_psp_sceIoMkdir((dir?.value ?: 0L), mode)

public actual fun sceIoRmdir(path: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceIoRmdir((path?.value ?: 0L))

public actual fun sceIoChdir(path: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceIoChdir((path?.value ?: 0L))

public actual fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceIoRename((oldname?.value ?: 0L), (newname?.value ?: 0L))

public actual fun sceIoDopen(dirname: COpaquePointer?): SceUid =
    null as SceUid

public actual fun sceIoDread(fd: SceUid, dir: COpaquePointer?): Int =
    0

public actual fun sceIoDclose(fd: SceUid): Int =
    0

public actual fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    PspJniBridge.libc_psp_sceIoDevctl((dev?.value ?: 0L), cmd.toInt(), (indata?.value ?: 0L), inlen, (outdata?.value ?: 0L), outlen)

public actual fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int =
    0

public actual fun sceIoUnassign(dev: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceIoUnassign((dev?.value ?: 0L))

public actual fun sceIoGetstat(file: COpaquePointer?, stat: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceIoGetstat((file?.value ?: 0L), (stat?.value ?: 0L))

public actual fun sceIoChstat(file: COpaquePointer?, stat: COpaquePointer?, bits: Int): Int =
    PspJniBridge.libc_psp_sceIoChstat((file?.value ?: 0L), (stat?.value ?: 0L), bits)

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    0

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    0

public actual fun sceIoSync(device: COpaquePointer?, unk: UInt): Int =
    PspJniBridge.libc_psp_sceIoSync((device?.value ?: 0L), unk.toInt())

public actual fun sceIoWaitAsync(fd: SceUid, res: COpaquePointer?): Int =
    0

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: COpaquePointer?): Int =
    0

public actual fun sceIoPollAsync(fd: SceUid, res: COpaquePointer?): Int =
    0

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: COpaquePointer?): Int =
    0

public actual fun sceIoCancel(fd: SceUid): Int =
    0

public actual fun sceIoGetDevType(fd: SceUid): Int =
    0

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    0

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int =
    0

public actual fun sceJpegInitMJpeg(): Int =
    PspJniBridge.libc_psp_sceJpegInitMJpeg()

public actual fun sceJpegFinishMJpeg(): Int =
    PspJniBridge.libc_psp_sceJpegFinishMJpeg()

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    PspJniBridge.libc_psp_sceJpegCreateMJpeg(width, height)

public actual fun sceJpegDeleteMJpeg(): Int =
    PspJniBridge.libc_psp_sceJpegDeleteMJpeg()

public actual fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int =
    PspJniBridge.libc_psp_sceJpegDecodeMJpeg((jpegBuf?.value ?: 0L), size.toLong(), (rgba?.value ?: 0L), unk.toInt())

public actual fun sceUmdCheckMedium(): Int =
    PspJniBridge.libc_psp_sceUmdCheckMedium()

public actual fun sceUmdGetDiscInfo(info: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUmdGetDiscInfo((info?.value ?: 0L))

public actual fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUmdActivate(unit, (drive?.value ?: 0L))

public actual fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUmdDeactivate(unit, (drive?.value ?: 0L))

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    PspJniBridge.libc_psp_sceUmdWaitDriveStat(state)

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    PspJniBridge.libc_psp_sceUmdWaitDriveStatWithTimer(state, timeout.toInt())

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    PspJniBridge.libc_psp_sceUmdWaitDriveStatCB(state, timeout.toInt())

public actual fun sceUmdCancelWaitDriveStat(): Int =
    PspJniBridge.libc_psp_sceUmdCancelWaitDriveStat()

public actual fun sceUmdGetDriveStat(): Int =
    PspJniBridge.libc_psp_sceUmdGetDriveStat()

public actual fun sceUmdGetErrorStat(): Int =
    PspJniBridge.libc_psp_sceUmdGetErrorStat()

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    PspJniBridge.libc_psp_sceUmdRegisterUMDCallBack(cbid)

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    PspJniBridge.libc_psp_sceUmdUnRegisterUMDCallBack(cbid)

public actual fun sceUmdReplacePermit(): Int =
    PspJniBridge.libc_psp_sceUmdReplacePermit()

public actual fun sceUmdReplaceProhibit(): Int =
    PspJniBridge.libc_psp_sceUmdReplaceProhibit()

public actual fun sceMpegInit(): Int =
    PspJniBridge.libc_psp_sceMpegInit()

public actual fun sceMpegFinish() {
    PspJniBridge.libc_psp_sceMpegFinish()
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    PspJniBridge.libc_psp_sceMpegRingbufferQueryMemSize(packets)

public actual fun sceMpegRingbufferConstruct(ringbuffer: COpaquePointer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceMpegRingbufferConstruct((ringbuffer?.value ?: 0L), packets, (data?.value ?: 0L), size, 0L, (cbParam?.value ?: 0L))

public actual fun sceMpegRingbufferDestruct(ringbuffer: COpaquePointer?) {
    PspJniBridge.libc_psp_sceMpegRingbufferDestruct((ringbuffer?.value ?: 0L))
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceMpegRingbufferAvailableSize((ringbuffer?.value ?: 0L))

public actual fun sceMpegRingbufferPut(ringbuffer: COpaquePointer?, numPackets: Int, available: Int): Int =
    PspJniBridge.libc_psp_sceMpegRingbufferPut((ringbuffer?.value ?: 0L), numPackets, available)

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    PspJniBridge.libc_psp_sceMpegQueryMemSize(unk)

public actual fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: COpaquePointer?, frameWidth: Int, unk1: Int, unk2: Int): Int =
    0

public actual fun sceMpegDelete(handle: SceMpeg) {
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: COpaquePointer?): Int =
    0

public actual fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceMpegQueryStreamSize((buffer?.value ?: 0L), (size?.value ?: 0L))

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    null as SceMpegStream

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
}

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    0

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer? =
    null

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?) {
}

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: COpaquePointer?, outSize: COpaquePointer?): Int =
    0

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: COpaquePointer?): Int =
    0

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: COpaquePointer?, unk: COpaquePointer?): Int =
    0

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: COpaquePointer?): Int =
    0

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: COpaquePointer?, iframeWidth: Int, buffer: COpaquePointer?, init: COpaquePointer?): Int =
    0

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: COpaquePointer?): Int =
    0

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: COpaquePointer?, unk: COpaquePointer?): Int =
    0

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: COpaquePointer?, buffer: COpaquePointer?, init: Int): Int =
    0

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: COpaquePointer?, type: Int): Int =
    PspJniBridge.libc_psp_sceMpegBaseYCrCbCopyVme((yuvBuffer?.value ?: 0L), (buffer?.value ?: 0L), type)

public actual fun sceMpegBaseCscInit(width: Int): Int =
    PspJniBridge.libc_psp_sceMpegBaseCscInit(width)

public actual fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceMpegBaseCscVme((rgbBuffer?.value ?: 0L), (rgbBuffer2?.value ?: 0L), width, (yCrCbBuffer?.value ?: 0L))

public actual fun sceMpegbaseBea18f91(lli: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceMpegbaseBea18f91((lli?.value ?: 0L))

public actual fun sceHprmPeekCurrentKey(key: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceHprmPeekCurrentKey((key?.value ?: 0L))

public actual fun sceHprmPeekLatch(latch: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceHprmPeekLatch((latch?.value ?: 0L))

public actual fun sceHprmReadLatch(latch: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceHprmReadLatch((latch?.value ?: 0L))

public actual fun sceHprmIsHeadphoneExist(): Int =
    PspJniBridge.libc_psp_sceHprmIsHeadphoneExist()

public actual fun sceHprmIsRemoteExist(): Int =
    PspJniBridge.libc_psp_sceHprmIsRemoteExist()

public actual fun sceHprmIsMicrophoneExist(): Int =
    PspJniBridge.libc_psp_sceHprmIsMicrophoneExist()

public actual fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
    PspJniBridge.libc_psp_sceGuDepthBuffer((zbp?.value ?: 0L), zbw)
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
    PspJniBridge.libc_psp_sceGuDispBuffer(width, height, (dispbp?.value ?: 0L), dispbw)
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    PspJniBridge.libc_psp_sceGuDisplay(state)

public actual fun sceGuDepthFunc(function: DepthFunc) {
}

public actual fun sceGuDepthMask(mask: Int) {
    PspJniBridge.libc_psp_sceGuDepthMask(mask)
}

public actual fun sceGuDepthOffset(offset: Int) {
    PspJniBridge.libc_psp_sceGuDepthOffset(offset)
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    PspJniBridge.libc_psp_sceGuDepthRange(near, far)
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    PspJniBridge.libc_psp_sceGuFog(near, far, color.toInt())
}

public actual fun sceGuInit() {
    PspJniBridge.libc_psp_sceGuInit()
}

public actual fun sceGuTerm() {
    PspJniBridge.libc_psp_sceGuTerm()
}

public actual fun sceGuBreak(mode: Int) {
    PspJniBridge.libc_psp_sceGuBreak(mode)
}

public actual fun sceGuContinue() {
    PspJniBridge.libc_psp_sceGuContinue()
}

public actual fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback =
    null

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
}

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
}

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
}

public actual fun sceGuGetMemory(size: Int): COpaquePointer? =
    PspJniBridge.libc_psp_sceGuGetMemory(size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
}

public actual fun sceGuFinish(): Int =
    PspJniBridge.libc_psp_sceGuFinish()

public actual fun sceGuFinishId(id: UInt): Int =
    PspJniBridge.libc_psp_sceGuFinishId(id.toInt())

public actual fun sceGuCallList(list: COpaquePointer?) {
    PspJniBridge.libc_psp_sceGuCallList((list?.value ?: 0L))
}

public actual fun sceGuCallMode(mode: Int) {
    PspJniBridge.libc_psp_sceGuCallMode(mode)
}

public actual fun sceGuCheckList(): Int =
    PspJniBridge.libc_psp_sceGuCheckList()

public actual fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: COpaquePointer?) {
}

public actual fun sceGuSwapBuffers(): COpaquePointer? =
    PspJniBridge.libc_psp_sceGuSwapBuffers().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    null as GeListState

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspJniBridge.libc_psp_sceGuBeginObject(vtype, count, (indices?.value ?: 0L), (vertices?.value ?: 0L))
}

public actual fun sceGuEndObject() {
    PspJniBridge.libc_psp_sceGuEndObject()
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    false

public actual fun sceGuSetAllStatus(status: Int) {
    PspJniBridge.libc_psp_sceGuSetAllStatus(status)
}

public actual fun sceGuGetAllStatus(): Int =
    PspJniBridge.libc_psp_sceGuGetAllStatus()

public actual fun sceGuEnable(state: GuState) {
}

public actual fun sceGuDisable(state: GuState) {
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    PspJniBridge.libc_psp_sceGuLightAtt(light, atten0, atten1, atten2)
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    PspJniBridge.libc_psp_sceGuLightColor(light, component, color.toInt())
}

public actual fun sceGuLightMode(mode: LightMode) {
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
}

public actual fun sceGuClear(flags: Int) {
    PspJniBridge.libc_psp_sceGuClear(flags)
}

public actual fun sceGuClearColor(color: UInt) {
    PspJniBridge.libc_psp_sceGuClearColor(color.toInt())
}

public actual fun sceGuClearDepth(depth: UInt) {
    PspJniBridge.libc_psp_sceGuClearDepth(depth.toInt())
}

public actual fun sceGuClearStencil(stencil: UInt) {
    PspJniBridge.libc_psp_sceGuClearStencil(stencil.toInt())
}

public actual fun sceGuPixelMask(mask: UInt) {
    PspJniBridge.libc_psp_sceGuPixelMask(mask.toInt())
}

public actual fun sceGuColor(color: UInt) {
    PspJniBridge.libc_psp_sceGuColor(color.toInt())
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
}

public actual fun sceGuColorMaterial(components: Int) {
    PspJniBridge.libc_psp_sceGuColorMaterial(components)
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
}

public actual fun sceGuAmbient(color: UInt) {
    PspJniBridge.libc_psp_sceGuAmbient(color.toInt())
}

public actual fun sceGuAmbientColor(color: UInt) {
    PspJniBridge.libc_psp_sceGuAmbientColor(color.toInt())
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    PspJniBridge.libc_psp_sceGuMaterial(components, color.toInt())
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    PspJniBridge.libc_psp_sceGuModelColor(emissive.toInt(), ambient.toInt(), diffuse.toInt(), specular.toInt())
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
}

public actual fun sceGuSpecular(power: Float) {
    PspJniBridge.libc_psp_sceGuSpecular(power)
}

public actual fun sceGuFrontFace(order: FrontFaceDirection) {
}

public actual fun sceGuLogicalOp(op: LogicalOperation) {
}

public actual fun sceGuSetDither(matrix: ScePspIMatrix4) {
}

public actual fun sceGuShadeModel(mode: ShadingModel) {
}

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?) {
}

public actual fun sceGuTexEnvColor(color: UInt) {
    PspJniBridge.libc_psp_sceGuTexEnvColor(color.toInt())
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
}

public actual fun sceGuTexFlush() {
    PspJniBridge.libc_psp_sceGuTexFlush()
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
}

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?) {
}

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
}

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
}

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
}

public actual fun sceGuTexOffset(u: Float, v: Float) {
    PspJniBridge.libc_psp_sceGuTexOffset(u, v)
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    PspJniBridge.libc_psp_sceGuTexScale(u, v)
}

public actual fun sceGuTexSlope(slope: Float) {
    PspJniBridge.libc_psp_sceGuTexSlope(slope)
}

public actual fun sceGuTexSync() {
    PspJniBridge.libc_psp_sceGuTexSync()
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
    PspJniBridge.libc_psp_sceGuClutLoad(numBlocks, (cbp?.value ?: 0L))
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    PspJniBridge.libc_psp_sceGuOffset(x.toInt(), y.toInt())
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    PspJniBridge.libc_psp_sceGuScissor(x, y, w, h)
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    PspJniBridge.libc_psp_sceGuViewport(cx, cy, width, height)
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspJniBridge.libc_psp_sceGuDrawBezier(vType, uCount, vCount, (indices?.value ?: 0L), (vertices?.value ?: 0L))
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    PspJniBridge.libc_psp_sceGuPatchDivide(ulevel.toInt(), vlevel.toInt())
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    PspJniBridge.libc_psp_sceGuPatchFrontFace(a0.toInt())
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspJniBridge.libc_psp_sceGuDrawSpline(vType, uCount, vCount, uEdge, vEdge, (indices?.value ?: 0L), (vertices?.value ?: 0L))
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    PspJniBridge.libc_psp_sceGuMorphWeight(index, weight)
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspJniBridge.libc_psp_sceGumDrawBezier(vType, uCount, vCount, (indices?.value ?: 0L), (vertices?.value ?: 0L))
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspJniBridge.libc_psp_sceGumDrawSpline(vType, uCount, vCount, uEdge, vEdge, (indices?.value ?: 0L), (vertices?.value ?: 0L))
}

public actual fun sceGumFastInverse() {
    PspJniBridge.libc_psp_sceGumFastInverse()
}

public actual fun sceGumFullInverse() {
    PspJniBridge.libc_psp_sceGumFullInverse()
}

public actual fun sceGumLoadIdentity() {
    PspJniBridge.libc_psp_sceGumLoadIdentity()
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
    PspJniBridge.libc_psp_sceGumOrtho(left, right, bottom, top, near, far)
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    PspJniBridge.libc_psp_sceGumPerspective(fovy, aspect, near, far)
}

public actual fun sceGumPopMatrix() {
    PspJniBridge.libc_psp_sceGumPopMatrix()
}

public actual fun sceGumPushMatrix() {
    PspJniBridge.libc_psp_sceGumPushMatrix()
}

public actual fun sceGumRotateX(angle: Float) {
    PspJniBridge.libc_psp_sceGumRotateX(angle)
}

public actual fun sceGumRotateY(angle: Float) {
    PspJniBridge.libc_psp_sceGumRotateY(angle)
}

public actual fun sceGumRotateZ(angle: Float) {
    PspJniBridge.libc_psp_sceGumRotateZ(angle)
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
    PspJniBridge.libc_psp_sceGumUpdateMatrix()
}

public actual fun sceMp3ReserveMp3Handle(args: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceMp3ReserveMp3Handle((args?.value ?: 0L))

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    0

public actual fun sceMp3InitResource(): Int =
    PspJniBridge.libc_psp_sceMp3InitResource()

public actual fun sceMp3TermResource(): Int =
    PspJniBridge.libc_psp_sceMp3TermResource()

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    0

public actual fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int =
    0

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: COpaquePointer?, srcPos: COpaquePointer?): Int =
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

public actual fun sceRegOpenRegistry(reg: COpaquePointer?, mode: Int, handle: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRegOpenRegistry((reg?.value ?: 0L), mode, (handle?.value ?: 0L))

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    0

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    0

public actual fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: COpaquePointer?): Int =
    0

public actual fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int =
    0

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    0

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    0

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: COpaquePointer?, type: COpaquePointer?, size: COpaquePointer?): Int =
    0

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: COpaquePointer?, size: COpaquePointer?): Int =
    0

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: COpaquePointer?): Int =
    0

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int =
    0

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int =
    0

public actual fun sceRegRemoveRegistry(key: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceRegRemoveRegistry((key?.value ?: 0L))

public actual fun sceOpenPSIDGetOpenPSID(openpsid: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceOpenPSIDGetOpenPSID((openpsid?.value ?: 0L))

public actual fun sceUtilityMsgDialogInitStart(params: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUtilityMsgDialogInitStart((params?.value ?: 0L))

public actual fun sceUtilityMsgDialogShutdownStart() {
    PspJniBridge.libc_psp_sceUtilityMsgDialogShutdownStart()
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    PspJniBridge.libc_psp_sceUtilityMsgDialogGetStatus()

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    PspJniBridge.libc_psp_sceUtilityMsgDialogUpdate(n)
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    PspJniBridge.libc_psp_sceUtilityMsgDialogAbort()

public actual fun sceUtilityNetconfInitStart(data: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUtilityNetconfInitStart((data?.value ?: 0L))

public actual fun sceUtilityNetconfShutdownStart(): Int =
    PspJniBridge.libc_psp_sceUtilityNetconfShutdownStart()

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    PspJniBridge.libc_psp_sceUtilityNetconfUpdate(unknown)

public actual fun sceUtilityNetconfGetStatus(): Int =
    PspJniBridge.libc_psp_sceUtilityNetconfGetStatus()

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    PspJniBridge.libc_psp_sceUtilityCheckNetParam(id)

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: COpaquePointer?): Int =
    0

public actual fun sceUtilitySavedataInitStart(params: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUtilitySavedataInitStart((params?.value ?: 0L))

public actual fun sceUtilitySavedataGetStatus(): Int =
    PspJniBridge.libc_psp_sceUtilitySavedataGetStatus()

public actual fun sceUtilitySavedataShutdownStart(): Int =
    PspJniBridge.libc_psp_sceUtilitySavedataShutdownStart()

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    PspJniBridge.libc_psp_sceUtilitySavedataUpdate(unknown)
}

public actual fun sceUtilityGameSharingInitStart(params: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUtilityGameSharingInitStart((params?.value ?: 0L))

public actual fun sceUtilityGameSharingShutdownStart() {
    PspJniBridge.libc_psp_sceUtilityGameSharingShutdownStart()
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    PspJniBridge.libc_psp_sceUtilityGameSharingGetStatus()

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    PspJniBridge.libc_psp_sceUtilityGameSharingUpdate(n)
}

public actual fun sceUtilityHtmlViewerInitStart(params: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUtilityHtmlViewerInitStart((params?.value ?: 0L))

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    PspJniBridge.libc_psp_sceUtilityHtmlViewerShutdownStart()

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    PspJniBridge.libc_psp_sceUtilityHtmlViewerUpdate(n)

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    PspJniBridge.libc_psp_sceUtilityHtmlViewerGetStatus()

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    0

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int =
    0

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: COpaquePointer?): Int =
    0

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int =
    0

public actual fun sceUtilityOskInitStart(params: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceUtilityOskInitStart((params?.value ?: 0L))

public actual fun sceUtilityOskShutdownStart(): Int =
    PspJniBridge.libc_psp_sceUtilityOskShutdownStart()

public actual fun sceUtilityOskUpdate(n: Int): Int =
    PspJniBridge.libc_psp_sceUtilityOskUpdate(n)

public actual fun sceUtilityOskGetStatus(): Int =
    PspJniBridge.libc_psp_sceUtilityOskGetStatus()

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
    PspJniBridge.libc_psp_sceUtilityCreateNetParam(conf)

public actual fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int =
    0

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    PspJniBridge.libc_psp_sceUtilityCopyNetParam(src, dest)

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    PspJniBridge.libc_psp_sceUtilityDeleteNetParam(conf)

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    PspJniBridge.libc_psp_sceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack)

public actual fun sceNetTerm(): Int =
    PspJniBridge.libc_psp_sceNetTerm()

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    PspJniBridge.libc_psp_sceNetFreeThreadinfo(thid)

public actual fun sceNetThreadAbort(thid: Int): Int =
    PspJniBridge.libc_psp_sceNetThreadAbort(thid)

public actual fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
    PspJniBridge.libc_psp_sceNetEtherStrton((name?.value ?: 0L), (mac?.value ?: 0L))
}

public actual fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
    PspJniBridge.libc_psp_sceNetEtherNtostr((mac?.value ?: 0L), (name?.value ?: 0L))
}

public actual fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetGetLocalEtherAddr((mac?.value ?: 0L))

public actual fun sceNetGetMallocStat(stat: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetGetMallocStat((stat?.value ?: 0L))

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlInit(stacksize, priority, (adhocId?.value ?: 0L))

public actual fun sceNetAdhocctlTerm(): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlTerm()

public actual fun sceNetAdhocctlConnect(name: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlConnect((name?.value ?: 0L))

public actual fun sceNetAdhocctlDisconnect(): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlDisconnect()

public actual fun sceNetAdhocctlGetState(event: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlGetState((event?.value ?: 0L))

public actual fun sceNetAdhocctlCreate(name: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlCreate((name?.value ?: 0L))

public actual fun sceNetAdhocctlJoin(scaninfo: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlJoin((scaninfo?.value ?: 0L))

public actual fun sceNetAdhocctlGetAdhocId(id: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlGetAdhocId((id?.value ?: 0L))

public actual fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlCreateEnterGameMode((name?.value ?: 0L), unknown, num, (macs?.value ?: 0L), timeout.toInt(), unknown2)

public actual fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlJoinEnterGameMode((name?.value ?: 0L), (hostmac?.value ?: 0L), timeout.toInt(), unknown)

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlGetGameModeInfo((gamemodeinfo?.value ?: 0L))

public actual fun sceNetAdhocctlExitGameMode(): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlExitGameMode()

public actual fun sceNetAdhocctlGetPeerList(length: COpaquePointer?, buf: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlGetPeerList((length?.value ?: 0L), (buf?.value ?: 0L))

public actual fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlGetPeerInfo((mac?.value ?: 0L), size, (peerinfo?.value ?: 0L))

public actual fun sceNetAdhocctlScan(): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlScan()

public actual fun sceNetAdhocctlGetScanInfo(length: COpaquePointer?, buf: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlGetScanInfo((length?.value ?: 0L), (buf?.value ?: 0L))

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlAddHandler(0L, (unknown?.value ?: 0L))

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlDelHandler(id)

public actual fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlGetNameByAddr((mac?.value ?: 0L), (nickname?.value ?: 0L))

public actual fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: COpaquePointer?, buf: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlGetAddrByName((nickname?.value ?: 0L), (length?.value ?: 0L), (buf?.value ?: 0L))

public actual fun sceNetAdhocctlGetParameter(params: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocctlGetParameter((params?.value ?: 0L))

public actual fun sceNetAdhocInit(): Int =
    PspJniBridge.libc_psp_sceNetAdhocInit()

public actual fun sceNetAdhocTerm(): Int =
    PspJniBridge.libc_psp_sceNetAdhocTerm()

public actual fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPdpCreate((mac?.value ?: 0L), port.toShort(), bufSize.toInt(), unk1)

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPdpDelete(id, unk1)

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPdpSend(id, (destMacAddr?.value ?: 0L), port.toShort(), (data?.value ?: 0L), len.toInt(), timeout.toInt(), nonblock)

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: COpaquePointer?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPdpRecv(id, (srcMacAddr?.value ?: 0L), (port?.value ?: 0L), (data?.value ?: 0L), (dataLength?.value ?: 0L), timeout.toInt(), nonblock)

public actual fun sceNetAdhocGetPdpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocGetPdpStat((size?.value ?: 0L), (stat?.value ?: 0L))

public actual fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocGameModeCreateMaster((data?.value ?: 0L), size)

public actual fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocGameModeCreateReplica((mac?.value ?: 0L), (data?.value ?: 0L), size)

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    PspJniBridge.libc_psp_sceNetAdhocGameModeUpdateMaster()

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocGameModeUpdateReplica(id, unk1)

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    PspJniBridge.libc_psp_sceNetAdhocGameModeDeleteMaster()

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocGameModeDeleteReplica(id)

public actual fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPtpOpen((srcmac?.value ?: 0L), srcport.toShort(), (destmac?.value ?: 0L), destport.toShort(), bufSize.toInt(), delay.toInt(), count, unk1)

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPtpConnect(id, timeout.toInt(), nonblock)

public actual fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPtpListen((srcmac?.value ?: 0L), srcport.toShort(), bufSize.toInt(), delay.toInt(), count, queue, unk1)

public actual fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPtpAccept(id, (mac?.value ?: 0L), (port?.value ?: 0L), timeout.toInt(), nonblock)

public actual fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPtpSend(id, (data?.value ?: 0L), (dataSize?.value ?: 0L), timeout.toInt(), nonblock)

public actual fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPtpRecv(id, (data?.value ?: 0L), (dataSize?.value ?: 0L), timeout.toInt(), nonblock)

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPtpFlush(id, timeout.toInt(), nonblock)

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocPtpClose(id, unk1)

public actual fun sceNetAdhocGetPtpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocGetPtpStat((size?.value ?: 0L), (stat?.value ?: 0L))

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingInit(memsize)

public actual fun sceNetAdhocMatchingTerm(): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingTerm()

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    0

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingDelete(matchingId)

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingStart(matchingId, evthPri, evthStack, inthPri, inthStack, optLen, (optData?.value ?: 0L))

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingStop(matchingId)

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingSelectTarget(matchingId, (mac?.value ?: 0L), optLen, (optData?.value ?: 0L))

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingCancelTarget(matchingId, (mac?.value ?: 0L))

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingCancelTargetWithOpt(matchingId, (mac?.value ?: 0L), optLen, (optData?.value ?: 0L))

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingSendData(matchingId, (mac?.value ?: 0L), dataLen, (data?.value ?: 0L))

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingAbortSendData(matchingId, (mac?.value ?: 0L))

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingSetHelloOpt(matchingId, optLen, (optData?.value ?: 0L))

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: COpaquePointer?, optData: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingGetHelloOpt(matchingId, (optLen?.value ?: 0L), (optData?.value ?: 0L))

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: COpaquePointer?, buf: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingGetMembers(matchingId, (length?.value ?: 0L), (buf?.value ?: 0L))

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingGetPoolMaxAlloc()

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetAdhocMatchingGetPoolStat((poolstat?.value ?: 0L))

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    PspJniBridge.libc_psp_sceNetApctlInit(stackSize, initPriority)

public actual fun sceNetApctlTerm(): Int =
    PspJniBridge.libc_psp_sceNetApctlTerm()

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: COpaquePointer?): Int =
    0

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetApctlAddHandler(0L, (parg?.value ?: 0L))

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    PspJniBridge.libc_psp_sceNetApctlDelHandler(handlerId)

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    PspJniBridge.libc_psp_sceNetApctlConnect(connIndex)

public actual fun sceNetApctlDisconnect(): Int =
    PspJniBridge.libc_psp_sceNetApctlDisconnect()

public actual fun sceNetApctlGetState(pstate: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetApctlGetState((pstate?.value ?: 0L))

public actual fun sceNetInetInit(): Int =
    PspJniBridge.libc_psp_sceNetInetInit()

public actual fun sceNetInetTerm(): Int =
    PspJniBridge.libc_psp_sceNetInetTerm()

public actual fun sceNetInetAccept(s: Int, addr: COpaquePointer?, addrLen: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetInetAccept(s, (addr?.value ?: 0L), (addrLen?.value ?: 0L))

public actual fun sceNetInetBind(s: Int, myAddr: COpaquePointer?, addrLen: SocklenT): Int =
    PspJniBridge.libc_psp_sceNetInetBind(s, (myAddr?.value ?: 0L), addrLen.toInt())

public actual fun sceNetInetConnect(s: Int, servAddr: COpaquePointer?, addrLen: SocklenT): Int =
    PspJniBridge.libc_psp_sceNetInetConnect(s, (servAddr?.value ?: 0L), addrLen.toInt())

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceNetInetGetsockopt(s, level, optName, (optVal?.value ?: 0L), (optlEn?.value ?: 0L))

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    PspJniBridge.libc_psp_sceNetInetListen(s, backlog)

public actual fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    PspJniBridge.libc_psp_sceNetInetRecv(s, (buf?.value ?: 0L), len.toLong(), flags).toULong()

public actual fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: COpaquePointer?, fromLen: COpaquePointer?): ULong =
    PspJniBridge.libc_psp_sceNetInetRecvfrom(s, (buf?.value ?: 0L), flags.toLong(), arg1, (from?.value ?: 0L), (fromLen?.value ?: 0L)).toULong()

public actual fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    PspJniBridge.libc_psp_sceNetInetSend(s, (buf?.value ?: 0L), len.toLong(), flags).toULong()

public actual fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, toLen: SocklenT): ULong =
    PspJniBridge.libc_psp_sceNetInetSendto(s, (buf?.value ?: 0L), len.toLong(), flags, (to?.value ?: 0L), toLen.toInt()).toULong()

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int =
    PspJniBridge.libc_psp_sceNetInetSetsockopt(s, level, optName, (optVal?.value ?: 0L), optLen.toInt())

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    PspJniBridge.libc_psp_sceNetInetShutdown(s, how)

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    PspJniBridge.libc_psp_sceNetInetSocket(domain, type, protocol)

public actual fun sceNetInetClose(s: Int): Int =
    PspJniBridge.libc_psp_sceNetInetClose(s)

public actual fun sceNetInetGetErrno(): Int =
    PspJniBridge.libc_psp_sceNetInetGetErrno()

public actual fun sceSslInit(unknown1: Int): Int =
    PspJniBridge.libc_psp_sceSslInit(unknown1)

public actual fun sceSslEnd(): Int =
    PspJniBridge.libc_psp_sceSslEnd()

public actual fun sceSslGetUsedMemoryMax(memory: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceSslGetUsedMemoryMax((memory?.value ?: 0L))

public actual fun sceSslGetUsedMemoryCurrent(memory: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceSslGetUsedMemoryCurrent((memory?.value ?: 0L))

public actual fun sceHttpInit(unknown1: UInt): Int =
    PspJniBridge.libc_psp_sceHttpInit(unknown1.toInt())

public actual fun sceHttpEnd(): Int =
    PspJniBridge.libc_psp_sceHttpEnd()

public actual fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int =
    PspJniBridge.libc_psp_sceHttpCreateTemplate((agent?.value ?: 0L), unknown1, unknown2)

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    PspJniBridge.libc_psp_sceHttpDeleteTemplate(templateid)

public actual fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int =
    PspJniBridge.libc_psp_sceHttpCreateConnection(templateid, (host?.value ?: 0L), (unknown1?.value ?: 0L), port.toShort(), unknown2)

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int =
    PspJniBridge.libc_psp_sceHttpCreateConnectionWithURL(templateid, (url?.value ?: 0L), unknown1)

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    PspJniBridge.libc_psp_sceHttpDeleteConnection(connectionId)

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int =
    0

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int =
    0

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    PspJniBridge.libc_psp_sceHttpDeleteRequest(requestId)

public actual fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    PspJniBridge.libc_psp_sceHttpSendRequest(requestId, (data?.value ?: 0L), dataSize.toInt())

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    PspJniBridge.libc_psp_sceHttpAbortRequest(requestId)

public actual fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    PspJniBridge.libc_psp_sceHttpReadData(requestId, (data?.value ?: 0L), dataSize.toInt())

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceHttpGetContentLength(requestId, (contentLength?.value ?: 0L))

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceHttpGetStatusCode(requestId, (statusCode?.value ?: 0L))

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    PspJniBridge.libc_psp_sceHttpSetResolveTimeOut(id, timeout.toInt())

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    PspJniBridge.libc_psp_sceHttpSetResolveRetry(id, count)

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    PspJniBridge.libc_psp_sceHttpSetConnectTimeOut(id, timeout.toInt())

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    PspJniBridge.libc_psp_sceHttpSetSendTimeOut(id, timeout.toInt())

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    PspJniBridge.libc_psp_sceHttpSetRecvTimeOut(id, timeout.toInt())

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    PspJniBridge.libc_psp_sceHttpEnableKeepAlive(id)

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    PspJniBridge.libc_psp_sceHttpDisableKeepAlive(id)

public actual fun sceHttpEnableRedirect(id: Int): Int =
    PspJniBridge.libc_psp_sceHttpEnableRedirect(id)

public actual fun sceHttpDisableRedirect(id: Int): Int =
    PspJniBridge.libc_psp_sceHttpDisableRedirect(id)

public actual fun sceHttpEnableCookie(id: Int): Int =
    PspJniBridge.libc_psp_sceHttpEnableCookie(id)

public actual fun sceHttpDisableCookie(id: Int): Int =
    PspJniBridge.libc_psp_sceHttpDisableCookie(id)

public actual fun sceHttpSaveSystemCookie(): Int =
    PspJniBridge.libc_psp_sceHttpSaveSystemCookie()

public actual fun sceHttpLoadSystemCookie(): Int =
    PspJniBridge.libc_psp_sceHttpLoadSystemCookie()

public actual fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int =
    PspJniBridge.libc_psp_sceHttpAddExtraHeader(id, (name?.value ?: 0L), (value?.value ?: 0L), unknown1)

public actual fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceHttpDeleteHeader(id, (name?.value ?: 0L))

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    PspJniBridge.libc_psp_sceHttpsInit(unknown1, unknown2, unknown3, unknown4)

public actual fun sceHttpsEnd(): Int =
    PspJniBridge.libc_psp_sceHttpsEnd()

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    PspJniBridge.libc_psp_sceHttpsLoadDefaultCert(unknown1, unknown2)

public actual fun sceHttpDisableAuth(id: Int): Int =
    PspJniBridge.libc_psp_sceHttpDisableAuth(id)

public actual fun sceHttpDisableCache(id: Int): Int =
    PspJniBridge.libc_psp_sceHttpDisableCache(id)

public actual fun sceHttpEnableAuth(id: Int): Int =
    PspJniBridge.libc_psp_sceHttpEnableAuth(id)

public actual fun sceHttpEnableCache(id: Int): Int =
    PspJniBridge.libc_psp_sceHttpEnableCache(id)

public actual fun sceHttpEndCache(): Int =
    PspJniBridge.libc_psp_sceHttpEndCache()

public actual fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceHttpGetAllHeader(request, (header?.value ?: 0L), (headerSize?.value ?: 0L))

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceHttpGetNetworkErrno(request, (errNum?.value ?: 0L))

public actual fun sceHttpGetProxy(id: Int, activateFlag: COpaquePointer?, mode: COpaquePointer?, proxyHost: COpaquePointer?, len: ULong, proxyPort: COpaquePointer?): Int =
    PspJniBridge.libc_psp_sceHttpGetProxy(id, (activateFlag?.value ?: 0L), (mode?.value ?: 0L), (proxyHost?.value ?: 0L), len.toLong(), (proxyPort?.value ?: 0L))

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    PspJniBridge.libc_psp_sceHttpInitCache(maxSize.toLong())

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    PspJniBridge.libc_psp_sceHttpSetAuthInfoCB(id, 0L)

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int =
    PspJniBridge.libc_psp_sceHttpSetProxy(id, activateFlag, mode, (newProxyHost?.value ?: 0L), newProxyPort.toShort())

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    PspJniBridge.libc_psp_sceHttpSetResHeaderMaxSize(id, headerSize.toInt())

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    PspJniBridge.libc_psp_sceHttpSetMallocFunction(0L, 0L, 0L)

public actual fun sceNetResolverInit(): Int =
    PspJniBridge.libc_psp_sceNetResolverInit()

public actual fun sceNetResolverCreate(rid: COpaquePointer?, buf: COpaquePointer?, bufLength: UInt): Int =
    PspJniBridge.libc_psp_sceNetResolverCreate((rid?.value ?: 0L), (buf?.value ?: 0L), bufLength.toInt())

public actual fun sceNetResolverDelete(rid: Int): Int =
    PspJniBridge.libc_psp_sceNetResolverDelete(rid)

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: COpaquePointer?, timeout: UInt, retry: Int): Int =
    PspJniBridge.libc_psp_sceNetResolverStartNtoA(rid, (hostname?.value ?: 0L), (addr?.value ?: 0L), timeout.toInt(), retry)

public actual fun sceNetResolverStartAtoN(rid: Int, addr: COpaquePointer?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    PspJniBridge.libc_psp_sceNetResolverStartAtoN(rid, (addr?.value ?: 0L), (hostname?.value ?: 0L), hostnameLen.toInt(), timeout.toInt(), retry)

public actual fun sceNetResolverStop(rid: Int): Int =
    PspJniBridge.libc_psp_sceNetResolverStop(rid)

public actual fun sceNetResolverTerm(): Int =
    PspJniBridge.libc_psp_sceNetResolverTerm()
