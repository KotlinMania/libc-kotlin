package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.COpaquePointer

internal object PspRawLibc {
    external fun sceAudioChReserve(channel: Int, sampleCount: Int, format: Long): Int
    external fun sceAudioChRelease(channel: Int): Int
    external fun sceAudioOutput(channel: Int, vol: Int, buf: Long): Int
    external fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: Long): Int
    external fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: Long): Int
    external fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: Long): Int
    external fun sceAudioGetChannelRestLen(channel: Int): Int
    external fun sceAudioGetChannelRestLength(channel: Int): Int
    external fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int
    external fun sceAudioChangeChannelConfig(channel: Int, format: Long): Int
    external fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int
    external fun sceAudioOutput2Reserve(sampleCount: Int): Int
    external fun sceAudioOutput2Release(): Int
    external fun sceAudioOutput2ChangeLength(sampleCount: Int): Int
    external fun sceAudioOutput2OutputBlocking(vol: Int, buf: Long): Int
    external fun sceAudioOutput2GetRestSample(): Int
    external fun sceAudioSRCChReserve(sampleCount: Int, freq: Long, channels: Int): Int
    external fun sceAudioSRCChRelease(): Int
    external fun sceAudioSRCOutputBlocking(vol: Int, buf: Long): Int
    external fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int
    external fun sceAudioInputInitEx(params: Long): Int
    external fun sceAudioInputBlocking(sampleCount: Int, freq: Long, buf: Long)
    external fun sceAudioInput(sampleCount: Int, freq: Long, buf: Long)
    external fun sceAudioGetInputLength(): Int
    external fun sceAudioWaitInputEnd(): Int
    external fun sceAudioPollInputEnd(): Int
    external fun sceAtracGetAtracID(uiCodecType: Int): Int
    external fun sceAtracSetDataAndGetID(buf: Long, bufsize: Long): Int
    external fun sceAtracDecodeData(atracId: Int, outSamples: Long, outN: Long, outEnd: Long, outRemainFrame: Long): Int
    external fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: Long): Int
    external fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: Long, availableBytes: Long, readOffset: Long): Int
    external fun sceAtracAddStreamData(atracId: Int, bytesToAdd: Int): Int
    external fun sceAtracGetBitrate(atracId: Int, outBitrate: Long): Int
    external fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int
    external fun sceAtracReleaseAtracID(atracId: Int): Int
    external fun sceAtracGetNextSample(atracId: Int, outN: Long): Int
    external fun sceAtracGetMaxSample(atracId: Int, outMax: Long): Int
    external fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: Int, pbufferInfo: Long): Int
    external fun sceAtracGetChannel(atracId: Int, puiChannel: Long): Int
    external fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: Long): Int
    external fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: Long, puiLoopStatus: Long): Int
    external fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: Long): Int
    external fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: Long, puiDataByte: Long): Int
    external fun sceAtracGetSoundSample(atracId: Int, piEndSample: Long, piLoopStartSample: Long, piLoopEndSample: Long): Int
    external fun sceAtracResetPlayPosition(atracId: Int, uiSample: Int, uiWriteByteFirstBuf: Int, uiWriteByteSecondBuf: Int): Int
    external fun sceAtracSetData(atracId: Int, pucBufferAddr: Long, uiBufferByte: Int): Int
    external fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: Long, uiReadByte: Int, uiBufferByte: Int): Int
    external fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: Long, uiReadByte: Int, uiBufferByte: Int): Int
    external fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: Long, uiSecondBufferByte: Int): Int
    external fun sceCtrlSetSamplingCycle(cycle: Int): Int
    external fun sceCtrlGetSamplingCycle(pcycle: Long): Int
    external fun sceCtrlSetSamplingMode(mode: Long): Int
    external fun sceCtrlGetSamplingMode(pmode: Long): Int
    external fun sceCtrlPeekBufferPositive(padData: Long, count: Int): Int
    external fun sceCtrlPeekBufferNegative(padData: Long, count: Int): Int
    external fun sceCtrlReadBufferPositive(padData: Long, count: Int): Int
    external fun sceCtrlReadBufferNegative(padData: Long, count: Int): Int
    external fun sceCtrlPeekLatch(latchData: Long): Int
    external fun sceCtrlReadLatch(latchData: Long): Int
    external fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int
    external fun sceCtrlGetIdleCancelThreshold(idlereset: Long, idleback: Long): Int
    external fun sceDisplaySetMode(mode: Long, width: Long, height: Long): Int
    external fun sceDisplayGetMode(pmode: Long, pwidth: Long, pheight: Long): Int
    external fun sceDisplaySetFrameBuf(topAddr: Long, bufferWidth: Long, pixelFormat: Long, sync: Long): Int
    external fun sceDisplayGetFrameBuf(topAddr: Long, bufferWidth: Long, pixelFormat: Long, sync: Long): Int
    external fun sceDisplayGetVcount(): Int
    external fun sceDisplayWaitVblank(): Int
    external fun sceDisplayWaitVblankCB(): Int
    external fun sceDisplayWaitVblankStart(): Int
    external fun sceDisplayWaitVblankStartCB(): Int
    external fun sceDisplayGetAccumulatedHcount(): Int
    external fun sceDisplayGetCurrentHcount(): Int
    external fun sceDisplayGetFramePerSec(): Float
    external fun sceDisplayIsForeground(): Int
    external fun sceDisplayIsVblank(): Int
    external fun sceGeEdramGetSize(): Int
    external fun sceGeEdramGetAddr(): Long?
    external fun sceGeEdramSetAddrTranslation(width: Int): Int
    external fun sceGeGetCmd(cmd: Int): Int
    external fun sceGeGetMtx(type: Long, matrix: Long): Int
    external fun sceGeGetStack(stackId: Int, stack: Long): Int
    external fun sceGeSaveContext(context: Long): Int
    external fun sceGeRestoreContext(context: Long): Int
    external fun sceGeListEnQueue(list: Long, stall: Long, cbid: Int, arg: Long): Int
    external fun sceGeListEnQueueHead(list: Long, stall: Long, cbid: Int, arg: Long): Int
    external fun sceGeListDeQueue(qid: Int): Int
    external fun sceGeListUpdateStallAddr(qid: Int, stall: Long): Int
    external fun sceGeListSync(qid: Int, syncType: Int): Long
    external fun sceGeDrawSync(syncType: Int): Long
    external fun sceGeBreak(mode: Int, pParam: Long): Int
    external fun sceGeContinue(): Int
    external fun sceGeSetCallback(cb: Long): Int
    external fun sceGeUnsetCallback(cbid: Int): Int
    external fun sceKernelExitGame()
    external fun sceKernelRegisterExitCallback(id: Long): Int
    external fun sceKernelLoadExec(file: Long, param: Long): Int
    external fun sceKernelAllocPartitionMemory(partition: Long, name: Long, type: Long, size: Int, addr: Long): Long
    external fun sceKernelGetBlockHeadAddr(blockid: Long): Long?
    external fun sceKernelFreePartitionMemory(blockid: Long): Int
    external fun sceKernelTotalFreeMemSize(): Long
    external fun sceKernelMaxFreeMemSize(): Long
    external fun sceKernelDevkitVersion(): Int
    external fun sceKernelSetCompiledSdkVersion(version: Int): Int
    external fun sceKernelGetCompiledSdkVersion(): Int
    external fun sceKernelLibcTime(t: Long): Int
    external fun sceKernelLibcClock(): Int
    external fun sceKernelLibcGettimeofday(tp: Long, tzp: Long): Int
    external fun sceKernelDcacheWritebackAll()
    external fun sceKernelDcacheWritebackInvalidateAll()
    external fun sceKernelDcacheWritebackRange(p: Long, size: Int)
    external fun sceKernelDcacheWritebackInvalidateRange(p: Long, size: Int)
    external fun sceKernelDcacheInvalidateRange(p: Long, size: Int)
    external fun sceKernelIcacheInvalidateAll()
    external fun sceKernelIcacheInvalidateRange(p: Long, size: Int)
    external fun sceKernelUtilsMt19937Init(ctx: Long, seed: Int): Int
    external fun sceKernelUtilsMt19937UInt(ctx: Long): Int
    external fun sceKernelUtilsMd5Digest(data: Long, size: Int, digest: Long): Int
    external fun sceKernelUtilsMd5BlockInit(ctx: Long): Int
    external fun sceKernelUtilsMd5BlockUpdate(ctx: Long, data: Long, size: Int): Int
    external fun sceKernelUtilsMd5BlockResult(ctx: Long, digest: Long): Int
    external fun sceKernelUtilsSha1Digest(data: Long, size: Int, digest: Long): Int
    external fun sceKernelUtilsSha1BlockInit(ctx: Long): Int
    external fun sceKernelUtilsSha1BlockUpdate(ctx: Long, data: Long, size: Int): Int
    external fun sceKernelUtilsSha1BlockResult(ctx: Long, digest: Long): Int
    external fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: Long, arg: Long): Int
    external fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int
    external fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int
    external fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int
    external fun queryIntrHandlerInfo(intrCode: Long, subIntrCode: Long, data: Long): Int
    external fun sceKernelCpuSuspendIntr(): Int
    external fun sceKernelCpuResumeIntr(flags: Int)
    external fun sceKernelCpuResumeIntrWithSync(flags: Int)
    external fun sceKernelIsCpuIntrSuspended(flags: Int): Int
    external fun sceKernelIsCpuIntrEnable(): Int
    external fun sceKernelLoadModule(path: Long, flags: Int, option: Long): Long
    external fun sceKernelLoadModuleMs(path: Long, flags: Int, option: Long): Long
    external fun sceKernelLoadModuleByID(fid: Long, flags: Int, option: Long): Long
    external fun sceKernelLoadModuleBufferUsbWlan(bufSize: Long, buf: Long, flags: Int, option: Long): Long
    external fun sceKernelStartModule(modId: Long, argSize: Long, argp: Long, status: Long, option: Long): Int
    external fun sceKernelStopModule(modId: Long, argSize: Long, argp: Long, status: Long, option: Long): Int
    external fun sceKernelUnloadModule(modId: Long): Int
    external fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: Long, argp: Long): Int
    external fun sceKernelStopUnloadSelfModule(argSize: Long, argp: Long, status: Long, option: Long): Int
    external fun sceKernelQueryModuleInfo(modId: Long, info: Long): Int
    external fun sceKernelGetModuleIdList(readBuf: Long, readBufSize: Int, idCount: Long): Int
    external fun sceKernelVolatileMemLock(unk: Int, ptr: Long, size: Long): Int
    external fun sceKernelVolatileMemTryLock(unk: Int, ptr: Long, size: Long): Int
    external fun sceKernelVolatileMemUnlock(unk: Int): Int
    external fun sceKernelStdin(): Long
    external fun sceKernelStdout(): Long
    external fun sceKernelStderr(): Long
    external fun sceKernelGetThreadmanIdType(uid: Long): Long
    external fun sceKernelCreateThread(name: Long, entry: Long, initPriority: Int, stackSize: Int, attr: Int, option: Long): Long
    external fun sceKernelDeleteThread(thid: Long): Int
    external fun sceKernelStartThread(id: Long, argLen: Long, argP: Long): Int
    external fun sceKernelExitThread(status: Int): Int
    external fun sceKernelExitDeleteThread(status: Int): Int
    external fun sceKernelTerminateThread(thid: Long): Int
    external fun sceKernelTerminateDeleteThread(thid: Long): Int
    external fun sceKernelSuspendDispatchThread(): Int
    external fun sceKernelResumeDispatchThread(state: Int): Int
    external fun sceKernelSleepThread(): Int
    external fun sceKernelSleepThreadCB(): Int
    external fun sceKernelWakeupThread(thid: Long): Int
    external fun sceKernelCancelWakeupThread(thid: Long): Int
    external fun sceKernelSuspendThread(thid: Long): Int
    external fun sceKernelResumeThread(thid: Long): Int
    external fun sceKernelWaitThreadEnd(thid: Long, timeout: Long): Int
    external fun sceKernelWaitThreadEndCB(thid: Long, timeout: Long): Int
    external fun sceKernelDelayThread(delay: Int): Int
    external fun sceKernelDelayThreadCB(delay: Int): Int
    external fun sceKernelDelaySysClockThread(delay: Long): Int
    external fun sceKernelDelaySysClockThreadCB(delay: Long): Int
    external fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int
    external fun sceKernelChangeThreadPriority(thid: Long, priority: Int): Int
    external fun sceKernelRotateThreadReadyQueue(priority: Int): Int
    external fun sceKernelReleaseWaitThread(thid: Long): Int
    external fun sceKernelGetThreadId(): Int
    external fun sceKernelGetThreadCurrentPriority(): Int
    external fun sceKernelGetThreadExitStatus(thid: Long): Int
    external fun sceKernelCheckThreadStack(): Int
    external fun sceKernelGetThreadStackFreeSize(thid: Long): Int
    external fun sceKernelReferThreadStatus(thid: Long, info: Long): Int
    external fun sceKernelReferThreadRunStatus(thid: Long, status: Long): Int
    external fun sceKernelCreateSema(name: Long, attr: Int, initVal: Int, maxVal: Int, option: Long): Long
    external fun sceKernelDeleteSema(semaId: Long): Int
    external fun sceKernelSignalSema(semaId: Long, signal: Int): Int
    external fun sceKernelWaitSema(semaId: Long, signal: Int, timeout: Long): Int
    external fun sceKernelWaitSemaCB(semaId: Long, signal: Int, timeout: Long): Int
    external fun sceKernelPollSema(semaId: Long, signal: Int): Int
    external fun sceKernelReferSemaStatus(semaId: Long, info: Long): Int
    external fun sceKernelCreateEventFlag(name: Long, attr: Int, bits: Int, opt: Long): Long
    external fun sceKernelSetEventFlag(evId: Long, bits: Int): Int
    external fun sceKernelClearEventFlag(evId: Long, bits: Int): Int
    external fun sceKernelPollEventFlag(evId: Long, bits: Int, wait: Int, outBits: Long): Int
    external fun sceKernelWaitEventFlag(evId: Long, bits: Int, wait: Int, outBits: Long, timeout: Long): Int
    external fun sceKernelWaitEventFlagCB(evId: Long, bits: Int, wait: Int, outBits: Long, timeout: Long): Int
    external fun sceKernelDeleteEventFlag(evId: Long): Int
    external fun sceKernelReferEventFlagStatus(event: Long, status: Long): Int
    external fun sceKernelCreateMbx(name: Long, attr: Int, option: Long): Long
    external fun sceKernelDeleteMbx(mbxId: Long): Int
    external fun sceKernelSendMbx(mbxId: Long, message: Long): Int
    external fun sceKernelReceiveMbx(mbxId: Long, message: Long, timeout: Long): Int
    external fun sceKernelReceiveMbxCB(mbxId: Long, message: Long, timeout: Long): Int
    external fun sceKernelPollMbx(mbxId: Long, pmessage: Long): Int
    external fun sceKernelCancelReceiveMbx(mbxId: Long, num: Long): Int
    external fun sceKernelReferMbxStatus(mbxId: Long, info: Long): Int
    external fun sceKernelSetAlarm(clock: Int, handler: Long, common: Long): Long
    external fun sceKernelSetSysClockAlarm(clock: Long, handler: Long, common: Long): Long
    external fun sceKernelCancelAlarm(alarmId: Long): Int
    external fun sceKernelReferAlarmStatus(alarmId: Long, info: Long): Int
    external fun sceKernelCreateCallback(name: Long, func: Long, arg: Long): Long
    external fun sceKernelReferCallbackStatus(cb: Long, status: Long): Int
    external fun sceKernelDeleteCallback(cb: Long): Int
    external fun sceKernelNotifyCallback(cb: Long, arg2: Int): Int
    external fun sceKernelCancelCallback(cb: Long): Int
    external fun sceKernelGetCallbackCount(cb: Long): Int
    external fun sceKernelCheckCallback(): Int
    external fun sceKernelGetThreadmanIdList(type: Long, readBuf: Long, readBufSize: Int, idCount: Long): Int
    external fun sceKernelReferSystemStatus(status: Long): Int
    external fun sceKernelCreateMsgPipe(name: Long, part: Int, attr: Int, unk1: Long, opt: Long): Long
    external fun sceKernelDeleteMsgPipe(uid: Long): Int
    external fun sceKernelSendMsgPipe(uid: Long, message: Long, size: Int, unk1: Int, unk2: Long, timeout: Long): Int
    external fun sceKernelSendMsgPipeCB(uid: Long, message: Long, size: Int, unk1: Int, unk2: Long, timeout: Long): Int
    external fun sceKernelTrySendMsgPipe(uid: Long, message: Long, size: Int, unk1: Int, unk2: Long): Int
    external fun sceKernelReceiveMsgPipe(uid: Long, message: Long, size: Int, unk1: Int, unk2: Long, timeout: Long): Int
    external fun sceKernelReceiveMsgPipeCB(uid: Long, message: Long, size: Int, unk1: Int, unk2: Long, timeout: Long): Int
    external fun sceKernelTryReceiveMsgPipe(uid: Long, message: Long, size: Int, unk1: Int, unk2: Long): Int
    external fun sceKernelCancelMsgPipe(uid: Long, send: Long, recv: Long): Int
    external fun sceKernelReferMsgPipeStatus(uid: Long, info: Long): Int
    external fun sceKernelCreateVpl(name: Long, part: Int, attr: Int, size: Int, opt: Long): Long
    external fun sceKernelDeleteVpl(uid: Long): Int
    external fun sceKernelAllocateVpl(uid: Long, size: Int, data: Long, timeout: Long): Int
    external fun sceKernelAllocateVplCB(uid: Long, size: Int, data: Long, timeout: Long): Int
    external fun sceKernelTryAllocateVpl(uid: Long, size: Int, data: Long): Int
    external fun sceKernelFreeVpl(uid: Long, data: Long): Int
    external fun sceKernelCancelVpl(uid: Long, num: Long): Int
    external fun sceKernelReferVplStatus(uid: Long, info: Long): Int
    external fun sceKernelCreateFpl(name: Long, part: Int, attr: Int, size: Int, blocks: Int, opt: Long): Int
    external fun sceKernelDeleteFpl(uid: Long): Int
    external fun sceKernelAllocateFpl(uid: Long, data: Long, timeout: Long): Int
    external fun sceKernelAllocateFplCB(uid: Long, data: Long, timeout: Long): Int
    external fun sceKernelTryAllocateFpl(uid: Long, data: Long): Int
    external fun sceKernelFreeFpl(uid: Long, data: Long): Int
    external fun sceKernelCancelFpl(uid: Long, pnum: Long): Int
    external fun sceKernelReferFplStatus(uid: Long, info: Long): Int
    external fun sceKernelUSec2SysClock(usec: Int, clock: Long): Int
    external fun sceKernelUSec2SysClockWide(usec: Int): Long
    external fun sceKernelSysClock2USec(clock: Long, low: Long, high: Long): Int
    external fun sceKernelSysClock2USecWide(clock: Long, low: Long, high: Long): Int
    external fun sceKernelGetSystemTime(time: Long): Int
    external fun sceKernelGetSystemTimeWide(): Long
    external fun sceKernelGetSystemTimeLow(): Int
    external fun sceKernelCreateVTimer(name: Long, opt: Long): Long
    external fun sceKernelDeleteVTimer(uid: Long): Int
    external fun sceKernelGetVTimerBase(uid: Long, base: Long): Int
    external fun sceKernelGetVTimerBaseWide(uid: Long): Long
    external fun sceKernelGetVTimerTime(uid: Long, time: Long): Int
    external fun sceKernelGetVTimerTimeWide(uid: Long): Long
    external fun sceKernelSetVTimerTime(uid: Long, time: Long): Int
    external fun sceKernelSetVTimerTimeWide(uid: Long, time: Long): Long
    external fun sceKernelStartVTimer(uid: Long): Int
    external fun sceKernelStopVTimer(uid: Long): Int
    external fun sceKernelSetVTimerHandler(uid: Long, time: Long, handler: Long, common: Long): Int
    external fun sceKernelSetVTimerHandlerWide(uid: Long, time: Long, handler: Long, common: Long): Int
    external fun sceKernelCancelVTimerHandler(uid: Long): Int
    external fun sceKernelReferVTimerStatus(uid: Long, info: Long): Int
    external fun sceKernelRegisterThreadEventHandler(name: Long, threadId: Long, mask: Int, handler: Long, common: Long): Long
    external fun sceKernelReleaseThreadEventHandler(uid: Long): Int
    external fun sceKernelReferThreadEventHandlerStatus(uid: Long, info: Long): Int
    external fun sceKernelReferThreadProfiler(): Long?
    external fun sceKernelReferGlobalProfiler(): Long?
    external fun sceUsbStart(driverName: Long, size: Int, args: Long): Int
    external fun sceUsbStop(driverName: Long, size: Int, args: Long): Int
    external fun sceUsbActivate(pid: Int): Int
    external fun sceUsbDeactivate(pid: Int): Int
    external fun sceUsbGetState(): Int
    external fun sceUsbGetDrvState(driverName: Long): Int
    external fun sceUsbCamSetupStill(param: Long): Int
    external fun sceUsbCamSetupStillEx(param: Long): Int
    external fun sceUsbCamStillInputBlocking(buf: Long, size: Long): Int
    external fun sceUsbCamStillInput(buf: Long, size: Long): Int
    external fun sceUsbCamStillWaitInputEnd(): Int
    external fun sceUsbCamStillPollInputEnd(): Int
    external fun sceUsbCamStillCancelInput(): Int
    external fun sceUsbCamStillGetInputLength(): Int
    external fun sceUsbCamSetupVideo(param: Long, workArea: Long, workAreaSize: Int): Int
    external fun sceUsbCamSetupVideoEx(param: Long, workArea: Long, workAreaSize: Int): Int
    external fun sceUsbCamStartVideo(): Int
    external fun sceUsbCamStopVideo(): Int
    external fun sceUsbCamReadVideoFrameBlocking(buf: Long, size: Long): Int
    external fun sceUsbCamReadVideoFrame(buf: Long, size: Long): Int
    external fun sceUsbCamWaitReadVideoFrameEnd(): Int
    external fun sceUsbCamPollReadVideoFrameEnd(): Int
    external fun sceUsbCamGetReadVideoFrameSize(): Int
    external fun sceUsbCamSetSaturation(saturation: Int): Int
    external fun sceUsbCamSetBrightness(brightness: Int): Int
    external fun sceUsbCamSetContrast(contrast: Int): Int
    external fun sceUsbCamSetSharpness(sharpness: Int): Int
    external fun sceUsbCamSetImageEffectMode(effectMode: Long): Int
    external fun sceUsbCamSetEvLevel(exposureLevel: Long): Int
    external fun sceUsbCamSetReverseMode(reverseFlags: Int): Int
    external fun sceUsbCamSetZoom(zoom: Int): Int
    external fun sceUsbCamGetSaturation(saturation: Long): Int
    external fun sceUsbCamGetBrightness(brightness: Long): Int
    external fun sceUsbCamGetContrast(contrast: Long): Int
    external fun sceUsbCamGetSharpness(sharpness: Long): Int
    external fun sceUsbCamGetImageEffectMode(effectMode: Long): Int
    external fun sceUsbCamGetEvLevel(exposureLevel: Long): Int
    external fun sceUsbCamGetReverseMode(reverseFlags: Long): Int
    external fun sceUsbCamGetZoom(zoom: Long): Int
    external fun sceUsbCamAutoImageReverseSW(on: Int): Int
    external fun sceUsbCamGetAutoImageReverseState(): Int
    external fun sceUsbCamGetLensDirection(): Int
    external fun sceUsbstorBootRegisterNotify(eventFlag: Long): Int
    external fun sceUsbstorBootUnregisterNotify(eventFlag: Int): Int
    external fun sceUsbstorBootSetCapacity(size: Int): Int
    external fun scePowerRegisterCallback(slot: Int, cbid: Long): Int
    external fun scePowerUnregisterCallback(slot: Int): Int
    external fun scePowerIsPowerOnline(): Int
    external fun scePowerIsBatteryExist(): Int
    external fun scePowerIsBatteryCharging(): Int
    external fun scePowerGetBatteryChargingStatus(): Int
    external fun scePowerIsLowBattery(): Int
    external fun scePowerGetBatteryLifePercent(): Int
    external fun scePowerGetBatteryLifeTime(): Int
    external fun scePowerGetBatteryTemp(): Int
    external fun scePowerGetBatteryElec(): Int
    external fun scePowerGetBatteryVolt(): Int
    external fun scePowerSetCpuClockFrequency(cpufreq: Int): Int
    external fun scePowerSetBusClockFrequency(busfreq: Int): Int
    external fun scePowerGetCpuClockFrequency(): Int
    external fun scePowerGetCpuClockFrequencyInt(): Int
    external fun scePowerGetCpuClockFrequencyFloat(): Float
    external fun scePowerGetBusClockFrequency(): Int
    external fun scePowerGetBusClockFrequencyInt(): Int
    external fun scePowerGetBusClockFrequencyFloat(): Float
    external fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int
    external fun scePowerLock(unknown: Int): Int
    external fun scePowerUnlock(unknown: Int): Int
    external fun scePowerTick(t: Long): Int
    external fun scePowerGetIdleTimer(): Int
    external fun scePowerIdleTimerEnable(unknown: Int): Int
    external fun scePowerIdleTimerDisable(unknown: Int): Int
    external fun scePowerRequestStandby(): Int
    external fun scePowerRequestSuspend(): Int
    external fun sceWlanDevIsPowerOn(): Int
    external fun sceWlanGetSwitchState(): Int
    external fun sceWlanGetEtherAddr(etherAddr: Long): Int
    external fun sceWlanDevAttach(): Int
    external fun sceWlanDevDetach(): Int
    external fun sceRtcGetTickResolution(): Int
    external fun sceRtcGetCurrentTick(tick: Long): Int
    external fun sceRtcGetCurrentClock(tm: Long, tz: Int): Int
    external fun sceRtcGetCurrentClockLocalTime(tm: Long): Int
    external fun sceRtcConvertUtcToLocalTime(tickUtc: Long, tickLocal: Long): Int
    external fun sceRtcConvertLocalTimeToUTC(tickLocal: Long, tickUtc: Long): Int
    external fun sceRtcIsLeapYear(year: Int): Int
    external fun sceRtcGetDaysInMonth(year: Int, month: Int): Int
    external fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int
    external fun sceRtcCheckValid(date: Long): Int
    external fun sceRtcSetTick(date: Long, tick: Long): Int
    external fun sceRtcGetTick(date: Long, tick: Long): Int
    external fun sceRtcCompareTick(tick1: Long, tick2: Long): Int
    external fun sceRtcTickAddTicks(destTick: Long, srcTick: Long, numTicks: Long): Int
    external fun sceRtcTickAddMicroseconds(destTick: Long, srcTick: Long, numMs: Long): Int
    external fun sceRtcTickAddSeconds(destTick: Long, srcTick: Long, numSeconds: Long): Int
    external fun sceRtcTickAddMinutes(destTick: Long, srcTick: Long, numMinutes: Long): Int
    external fun sceRtcTickAddHours(destTick: Long, srcTick: Long, numHours: Long): Int
    external fun sceRtcTickAddDays(destTick: Long, srcTick: Long, numDays: Long): Int
    external fun sceRtcTickAddWeeks(destTick: Long, srcTick: Long, numWeeks: Long): Int
    external fun sceRtcTickAddMonths(destTick: Long, srcTick: Long, numMonths: Long): Int
    external fun sceRtcTickAddYears(destTick: Long, srcTick: Long, numYears: Long): Int
    external fun sceRtcSetTimeT(date: Long, time: Int): Int
    external fun sceRtcGetTimeT(date: Long, time: Long): Int
    external fun sceRtcSetTime64T(date: Long, time: Long): Int
    external fun sceRtcGetTime64T(date: Long, time: Long): Int
    external fun sceRtcSetDosTime(date: Long, dosTime: Int): Int
    external fun sceRtcGetDosTime(date: Long, dosTime: Int): Int
    external fun sceRtcSetWin32FileTime(date: Long, time: Long): Int
    external fun sceRtcGetWin32FileTime(date: Long, time: Long): Int
    external fun sceRtcParseDateTime(destTick: Long, dateString: Long): Int
    external fun sceRtcFormatRFC3339(pszDateTime: Long, pUtc: Long, timeZoneMinutes: Int): Int
    external fun sceRtcFormatRFC3339LocalTime(pszDateTime: Long, pUtc: Long): Int
    external fun sceRtcParseRFC3339(pUtc: Long, pszDateTime: Long): Int
    external fun sceRtcFormatRFC2822(pszDateTime: Long, pUtc: Long, timeZoneMinutes: Int): Int
    external fun sceRtcFormatRFC2822LocalTime(pszDateTime: Long, pUtc: Long): Int
    external fun sceIoOpen(file: Long, flags: Int, permissions: Long): Long
    external fun sceIoOpenAsync(file: Long, flags: Int, permissions: Long): Long
    external fun sceIoClose(fd: Long): Int
    external fun sceIoCloseAsync(fd: Long): Int
    external fun sceIoRead(fd: Long, data: Long, size: Int): Int
    external fun sceIoReadAsync(fd: Long, data: Long, size: Int): Int
    external fun sceIoWrite(fd: Long, data: Long, size: Long): Int
    external fun sceIoWriteAsync(fd: Long, data: Long, size: Int): Int
    external fun sceIoLseek(fd: Long, offset: Long, whence: Long): Long
    external fun sceIoLseekAsync(fd: Long, offset: Long, whence: Long): Int
    external fun sceIoLseek32(fd: Long, offset: Int, whence: Long): Int
    external fun sceIoLseek32Async(fd: Long, offset: Int, whence: Long): Int
    external fun sceIoRemove(file: Long): Int
    external fun sceIoMkdir(dir: Long, mode: Long): Int
    external fun sceIoRmdir(path: Long): Int
    external fun sceIoChdir(path: Long): Int
    external fun sceIoRename(oldname: Long, newname: Long): Int
    external fun sceIoDopen(dirname: Long): Long
    external fun sceIoDread(fd: Long, dir: Long): Int
    external fun sceIoDclose(fd: Long): Int
    external fun sceIoDevctl(dev: Long, cmd: Int, indata: Long, inlen: Int, outdata: Long, outlen: Int): Int
    external fun sceIoAssign(dev1: Long, dev2: Long, dev3: Long, mode: Long, unk1: Long, unk2: Int): Int
    external fun sceIoUnassign(dev: Long): Int
    external fun sceIoGetstat(file: Long, stat: Long): Int
    external fun sceIoChstat(file: Long, stat: Long, bits: Int): Int
    external fun sceIoIoctl(fd: Long, cmd: Int, indata: Long, inlen: Int, outdata: Long, outlen: Int): Int
    external fun sceIoIoctlAsync(fd: Long, cmd: Int, indata: Long, inlen: Int, outdata: Long, outlen: Int): Int
    external fun sceIoSync(device: Long, unk: Int): Int
    external fun sceIoWaitAsync(fd: Long, res: Long): Int
    external fun sceIoWaitAsyncCB(fd: Long, res: Long): Int
    external fun sceIoPollAsync(fd: Long, res: Long): Int
    external fun sceIoGetAsyncStat(fd: Long, poll: Int, res: Long): Int
    external fun sceIoCancel(fd: Long): Int
    external fun sceIoGetDevType(fd: Long): Int
    external fun sceIoChangeAsyncPriority(fd: Long, pri: Int): Int
    external fun sceIoSetAsyncCallback(fd: Long, cb: Long, argp: Long): Int
    external fun sceJpegInitMJpeg(): Int
    external fun sceJpegFinishMJpeg(): Int
    external fun sceJpegCreateMJpeg(width: Int, height: Int): Int
    external fun sceJpegDeleteMJpeg(): Int
    external fun sceJpegDecodeMJpeg(jpegBuf: Long, size: Long, rgba: Long, unk: Int): Int
    external fun sceUmdCheckMedium(): Int
    external fun sceUmdGetDiscInfo(info: Long): Int
    external fun sceUmdActivate(unit: Int, drive: Long): Int
    external fun sceUmdDeactivate(unit: Int, drive: Long): Int
    external fun sceUmdWaitDriveStat(state: Int): Int
    external fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: Int): Int
    external fun sceUmdWaitDriveStatCB(state: Int, timeout: Int): Int
    external fun sceUmdCancelWaitDriveStat(): Int
    external fun sceUmdGetDriveStat(): Int
    external fun sceUmdGetErrorStat(): Int
    external fun sceUmdRegisterUMDCallBack(cbid: Int): Int
    external fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int
    external fun sceUmdReplacePermit(): Int
    external fun sceUmdReplaceProhibit(): Int
    external fun sceMpegInit(): Int
    external fun sceMpegFinish()
    external fun sceMpegRingbufferQueryMemSize(packets: Int): Int
    external fun sceMpegRingbufferConstruct(ringbuffer: Long, packets: Int, data: Long, size: Int, callback: Long, cbParam: Long): Int
    external fun sceMpegRingbufferDestruct(ringbuffer: Long)
    external fun sceMpegRingbufferAvailableSize(ringbuffer: Long): Int
    external fun sceMpegRingbufferPut(ringbuffer: Long, numPackets: Int, available: Int): Int
    external fun sceMpegQueryMemSize(unk: Int): Int
    external fun sceMpegCreate(handle: Long, data: Long, size: Int, ringbuffer: Long, frameWidth: Int, unk1: Int, unk2: Int): Int
    external fun sceMpegDelete(handle: Long)
    external fun sceMpegQueryStreamOffset(handle: Long, buffer: Long, offset: Long): Int
    external fun sceMpegQueryStreamSize(buffer: Long, size: Long): Int
    external fun sceMpegRegistStream(handle: Long, streamId: Int, unk: Int): Long
    external fun sceMpegUnRegistStream(handle: Long, stream: Long)
    external fun sceMpegFlushAllStream(handle: Long): Int
    external fun sceMpegMallocAvcEsBuf(handle: Long): Long?
    external fun sceMpegFreeAvcEsBuf(handle: Long, buf: Long)
    external fun sceMpegQueryAtracEsSize(handle: Long, esSize: Long, outSize: Long): Int
    external fun sceMpegInitAu(handle: Long, esBuffer: Long, au: Long): Int
    external fun sceMpegGetAvcAu(handle: Long, stream: Long, au: Long, unk: Long): Int
    external fun sceMpegAvcDecodeMode(handle: Long, mode: Long): Int
    external fun sceMpegAvcDecode(handle: Long, au: Long, iframeWidth: Int, buffer: Long, init: Long): Int
    external fun sceMpegAvcDecodeStop(handle: Long, frameWidth: Int, buffer: Long, status: Long): Int
    external fun sceMpegGetAtracAu(handle: Long, stream: Long, au: Long, unk: Long): Int
    external fun sceMpegAtracDecode(handle: Long, au: Long, buffer: Long, init: Int): Int
    external fun sceMpegBaseYCrCbCopyVme(yuvBuffer: Long, buffer: Long, type: Int): Int
    external fun sceMpegBaseCscInit(width: Int): Int
    external fun sceMpegBaseCscVme(rgbBuffer: Long, rgbBuffer2: Long, width: Int, yCrCbBuffer: Long): Int
    external fun sceMpegbaseBea18f91(lli: Long): Int
    external fun sceHprmPeekCurrentKey(key: Long): Int
    external fun sceHprmPeekLatch(latch: Long): Int
    external fun sceHprmReadLatch(latch: Long): Int
    external fun sceHprmIsHeadphoneExist(): Int
    external fun sceHprmIsRemoteExist(): Int
    external fun sceHprmIsMicrophoneExist(): Int
    external fun sceGuDepthBuffer(zbp: Long, zbw: Int)
    external fun sceGuDispBuffer(width: Int, height: Int, dispbp: Long, dispbw: Int)
    external fun sceGuDrawBuffer(psm: Long, fbp: Long, fbw: Int)
    external fun sceGuDrawBufferList(psm: Long, fbp: Long, fbw: Int)
    external fun sceGuDisplay(state: Boolean): Boolean
    external fun sceGuDepthFunc(function: Long)
    external fun sceGuDepthMask(mask: Int)
    external fun sceGuDepthOffset(offset: Int)
    external fun sceGuDepthRange(near: Int, far: Int)
    external fun sceGuFog(near: Float, far: Float, color: Int)
    external fun sceGuInit()
    external fun sceGuTerm()
    external fun sceGuBreak(mode: Int)
    external fun sceGuContinue()
    external fun sceGuSetCallback(signal: Long, callback: Long): Long
    external fun sceGuSignal(behavior: Long, signal: Int)
    external fun sceGuSendCommandf(cmd: Long, argument: Float)
    external fun sceGuSendCommandi(cmd: Long, argument: Int)
    external fun sceGuGetMemory(size: Int): Long?
    external fun sceGuStart(contextType: Long, list: Long)
    external fun sceGuFinish(): Int
    external fun sceGuFinishId(id: Int): Int
    external fun sceGuCallList(list: Long)
    external fun sceGuCallMode(mode: Int)
    external fun sceGuCheckList(): Int
    external fun sceGuSendList(mode: Long, list: Long, context: Long)
    external fun sceGuSwapBuffers(): Long?
    external fun sceGuSync(mode: Long, behavior: Long): Long
    external fun sceGuDrawArray(prim: Long, vtype: Int, count: Int, indices: Long, vertices: Long)
    external fun sceGuBeginObject(vtype: Int, count: Int, indices: Long, vertices: Long)
    external fun sceGuEndObject()
    external fun sceGuSetStatus(state: Long, status: Int)
    external fun sceGuGetStatus(state: Long): Boolean
    external fun sceGuSetAllStatus(status: Int)
    external fun sceGuGetAllStatus(): Int
    external fun sceGuEnable(state: Long)
    external fun sceGuDisable(state: Long)
    external fun sceGuLight(light: Int, type: Long, components: Int, position: Long)
    external fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float)
    external fun sceGuLightColor(light: Int, component: Int, color: Int)
    external fun sceGuLightMode(mode: Long)
    external fun sceGuLightSpot(light: Int, direction: Long, exponent: Float, cutoff: Float)
    external fun sceGuClear(flags: Int)
    external fun sceGuClearColor(color: Int)
    external fun sceGuClearDepth(depth: Int)
    external fun sceGuClearStencil(stencil: Int)
    external fun sceGuPixelMask(mask: Int)
    external fun sceGuColor(color: Int)
    external fun sceGuColorFunc(func: Long, color: Int, mask: Int)
    external fun sceGuColorMaterial(components: Int)
    external fun sceGuAlphaFunc(func: Long, value: Int, mask: Int)
    external fun sceGuAmbient(color: Int)
    external fun sceGuAmbientColor(color: Int)
    external fun sceGuBlendFunc(op: Long, src: Long, dest: Long, srcFix: Int, destFix: Int)
    external fun sceGuMaterial(components: Int, color: Int)
    external fun sceGuModelColor(emissive: Int, ambient: Int, diffuse: Int, specular: Int)
    external fun sceGuStencilFunc(func: Long, ref: Int, mask: Int)
    external fun sceGuStencilOp(fail: Long, zfail: Long, zpass: Long)
    external fun sceGuSpecular(power: Float)
    external fun sceGuFrontFace(order: Long)
    external fun sceGuLogicalOp(op: Long)
    external fun sceGuSetDither(matrix: Long)
    external fun sceGuShadeModel(mode: Long)
    external fun sceGuCopyImage(psm: Long, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: Long, dx: Int, dy: Int, destw: Int, dest: Long)
    external fun sceGuTexEnvColor(color: Int)
    external fun sceGuTexFilter(min: Long, mag: Long)
    external fun sceGuTexFlush()
    external fun sceGuTexFunc(tfx: Long, tcc: Long)
    external fun sceGuTexImage(mipmap: Long, width: Int, height: Int, tbw: Int, tbp: Long)
    external fun sceGuTexLevelMode(mode: Long, bias: Float)
    external fun sceGuTexMapMode(mode: Long, a1: Int, a2: Int)
    external fun sceGuTexMode(tpsm: Long, maxmips: Int, a2: Int, swizzle: Int)
    external fun sceGuTexOffset(u: Float, v: Float)
    external fun sceGuTexProjMapMode(mode: Long)
    external fun sceGuTexScale(u: Float, v: Float)
    external fun sceGuTexSlope(slope: Float)
    external fun sceGuTexSync()
    external fun sceGuTexWrap(u: Long, v: Long)
    external fun sceGuClutLoad(numBlocks: Int, cbp: Long)
    external fun sceGuClutMode(cpsm: Long, shift: Int, mask: Int, a3: Int)
    external fun sceGuOffset(x: Int, y: Int)
    external fun sceGuScissor(x: Int, y: Int, w: Int, h: Int)
    external fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int)
    external fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: Long, vertices: Long)
    external fun sceGuPatchDivide(ulevel: Int, vlevel: Int)
    external fun sceGuPatchFrontFace(a0: Int)
    external fun sceGuPatchPrim(prim: Long)
    external fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: Long, vertices: Long)
    external fun sceGuSetMatrix(type: Long, matrix: Long)
    external fun sceGuBoneMatrix(index: Int, matrix: Long)
    external fun sceGuMorphWeight(index: Int, weight: Float)
    external fun sceGuDrawArrayN(primitiveType: Long, vType: Int, count: Int, a3: Int, indices: Long, vertices: Long)
    external fun sceGumDrawArray(prim: Long, vType: Int, count: Int, indices: Long, vertices: Long)
    external fun sceGumDrawArrayN(prim: Long, vType: Int, count: Int, a3: Int, indices: Long, vertices: Long)
    external fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: Long, vertices: Long)
    external fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: Long, vertices: Long)
    external fun sceGumFastInverse()
    external fun sceGumFullInverse()
    external fun sceGumLoadIdentity()
    external fun sceGumLoadMatrix(m: Long)
    external fun sceGumLookAt(eye: Long, center: Long, up: Long)
    external fun sceGumMatrixMode(mode: Long)
    external fun sceGumMultMatrix(m: Long)
    external fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float)
    external fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float)
    external fun sceGumPopMatrix()
    external fun sceGumPushMatrix()
    external fun sceGumRotateX(angle: Float)
    external fun sceGumRotateY(angle: Float)
    external fun sceGumRotateZ(angle: Float)
    external fun sceGumRotateXYZ(v: Long)
    external fun sceGumRotateZYX(v: Long)
    external fun sceGumScale(v: Long)
    external fun sceGumStoreMatrix(m: Long)
    external fun sceGumTranslate(v: Long)
    external fun sceGumUpdateMatrix()
    external fun sceMp3ReserveMp3Handle(args: Long): Int
    external fun sceMp3ReleaseMp3Handle(handle: Long): Int
    external fun sceMp3InitResource(): Int
    external fun sceMp3TermResource(): Int
    external fun sceMp3Init(handle: Long): Int
    external fun sceMp3Decode(handle: Long, dst: Long): Int
    external fun sceMp3GetInfoToAddStreamData(handle: Long, dst: Long, toWrite: Long, srcPos: Long): Int
    external fun sceMp3NotifyAddStreamData(handle: Long, size: Int): Int
    external fun sceMp3CheckStreamDataNeeded(handle: Long): Int
    external fun sceMp3SetLoopNum(handle: Long, loop: Int): Int
    external fun sceMp3GetLoopNum(handle: Long): Int
    external fun sceMp3GetSumDecodedSample(handle: Long): Int
    external fun sceMp3GetMaxOutputSample(handle: Long): Int
    external fun sceMp3GetSamplingRate(handle: Long): Int
    external fun sceMp3GetBitRate(handle: Long): Int
    external fun sceMp3GetMp3ChannelNum(handle: Long): Int
    external fun sceMp3ResetPlayPosition(handle: Long): Int
    external fun sceRegOpenRegistry(reg: Long, mode: Int, handle: Long): Int
    external fun sceRegFlushRegistry(handle: Long): Int
    external fun sceRegCloseRegistry(handle: Long): Int
    external fun sceRegOpenCategory(handle: Long, name: Long, mode: Int, dirHandle: Long): Int
    external fun sceRegRemoveCategory(handle: Long, name: Long): Int
    external fun sceRegCloseCategory(dirHandle: Long): Int
    external fun sceRegFlushCategory(dirHandle: Long): Int
    external fun sceRegGetKeyInfo(dirHandle: Long, name: Long, keyHandle: Long, type: Long, size: Long): Int
    external fun sceRegGetKeyInfoByName(dirHandle: Long, name: Long, type: Long, size: Long): Int
    external fun sceRegGetKeyValue(dirHandle: Long, keyHandle: Long, buf: Long, size: Long): Int
    external fun sceRegGetKeyValueByName(dirHandle: Long, name: Long, buf: Long, size: Long): Int
    external fun sceRegSetKeyValue(dirHandle: Long, name: Long, buf: Long, size: Long): Int
    external fun sceRegGetKeysNum(dirHandle: Long, num: Long): Int
    external fun sceRegGetKeys(dirHandle: Long, buf: Long, num: Int): Int
    external fun sceRegCreateKey(dirHandle: Long, name: Long, type: Int, size: Long): Int
    external fun sceRegRemoveRegistry(key: Long): Int
    external fun sceOpenPSIDGetOpenPSID(openpsid: Long): Int
    external fun sceUtilityMsgDialogInitStart(params: Long): Int
    external fun sceUtilityMsgDialogShutdownStart()
    external fun sceUtilityMsgDialogGetStatus(): Int
    external fun sceUtilityMsgDialogUpdate(n: Int)
    external fun sceUtilityMsgDialogAbort(): Int
    external fun sceUtilityNetconfInitStart(data: Long): Int
    external fun sceUtilityNetconfShutdownStart(): Int
    external fun sceUtilityNetconfUpdate(unknown: Int): Int
    external fun sceUtilityNetconfGetStatus(): Int
    external fun sceUtilityCheckNetParam(id: Int): Int
    external fun sceUtilityGetNetParam(conf: Int, param: Long, data: Long): Int
    external fun sceUtilitySavedataInitStart(params: Long): Int
    external fun sceUtilitySavedataGetStatus(): Int
    external fun sceUtilitySavedataShutdownStart(): Int
    external fun sceUtilitySavedataUpdate(unknown: Int)
    external fun sceUtilityGameSharingInitStart(params: Long): Int
    external fun sceUtilityGameSharingShutdownStart()
    external fun sceUtilityGameSharingGetStatus(): Int
    external fun sceUtilityGameSharingUpdate(n: Int)
    external fun sceUtilityHtmlViewerInitStart(params: Long): Int
    external fun sceUtilityHtmlViewerShutdownStart(): Int
    external fun sceUtilityHtmlViewerUpdate(n: Int): Int
    external fun sceUtilityHtmlViewerGetStatus(): Int
    external fun sceUtilitySetSystemParamInt(id: Long, value: Int): Int
    external fun sceUtilitySetSystemParamString(id: Long, str: Long): Int
    external fun sceUtilityGetSystemParamInt(id: Long, value: Long): Int
    external fun sceUtilityGetSystemParamString(id: Long, str: Long, len: Int): Int
    external fun sceUtilityOskInitStart(params: Long): Int
    external fun sceUtilityOskShutdownStart(): Int
    external fun sceUtilityOskUpdate(n: Int): Int
    external fun sceUtilityOskGetStatus(): Int
    external fun sceUtilityLoadNetModule(module: Long): Int
    external fun sceUtilityUnloadNetModule(module: Long): Int
    external fun sceUtilityLoadAvModule(module: Long): Int
    external fun sceUtilityUnloadAvModule(module: Long): Int
    external fun sceUtilityLoadUsbModule(module: Long): Int
    external fun sceUtilityUnloadUsbModule(module: Long): Int
    external fun sceUtilityLoadModule(module: Long): Int
    external fun sceUtilityUnloadModule(module: Long): Int
    external fun sceUtilityCreateNetParam(conf: Int): Int
    external fun sceUtilitySetNetParam(param: Long, value: Long): Int
    external fun sceUtilityCopyNetParam(src: Int, dest: Int): Int
    external fun sceUtilityDeleteNetParam(conf: Int): Int
    external fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int
    external fun sceNetTerm(): Int
    external fun sceNetFreeThreadinfo(thid: Int): Int
    external fun sceNetThreadAbort(thid: Int): Int
    external fun sceNetEtherStrton(name: Long, mac: Long)
    external fun sceNetEtherNtostr(mac: Long, name: Long)
    external fun sceNetGetLocalEtherAddr(mac: Long): Int
    external fun sceNetGetMallocStat(stat: Long): Int
    external fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: Long): Int
    external fun sceNetAdhocctlTerm(): Int
    external fun sceNetAdhocctlConnect(name: Long): Int
    external fun sceNetAdhocctlDisconnect(): Int
    external fun sceNetAdhocctlGetState(event: Long): Int
    external fun sceNetAdhocctlCreate(name: Long): Int
    external fun sceNetAdhocctlJoin(scaninfo: Long): Int
    external fun sceNetAdhocctlGetAdhocId(id: Long): Int
    external fun sceNetAdhocctlCreateEnterGameMode(name: Long, unknown: Int, num: Int, macs: Long, timeout: Int, unknown2: Int): Int
    external fun sceNetAdhocctlJoinEnterGameMode(name: Long, hostmac: Long, timeout: Int, unknown: Int): Int
    external fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: Long): Int
    external fun sceNetAdhocctlExitGameMode(): Int
    external fun sceNetAdhocctlGetPeerList(length: Long, buf: Long): Int
    external fun sceNetAdhocctlGetPeerInfo(mac: Long, size: Int, peerinfo: Long): Int
    external fun sceNetAdhocctlScan(): Int
    external fun sceNetAdhocctlGetScanInfo(length: Long, buf: Long): Int
    external fun sceNetAdhocctlAddHandler(handler: Long, unknown: Long): Int
    external fun sceNetAdhocctlDelHandler(id: Int): Int
    external fun sceNetAdhocctlGetNameByAddr(mac: Long, nickname: Long): Int
    external fun sceNetAdhocctlGetAddrByName(nickname: Long, length: Long, buf: Long): Int
    external fun sceNetAdhocctlGetParameter(params: Long): Int
    external fun sceNetAdhocInit(): Int
    external fun sceNetAdhocTerm(): Int
    external fun sceNetAdhocPdpCreate(mac: Long, port: Short, bufSize: Int, unk1: Int): Int
    external fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int
    external fun sceNetAdhocPdpSend(id: Int, destMacAddr: Long, port: Short, data: Long, len: Int, timeout: Int, nonblock: Int): Int
    external fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: Long, port: Long, data: Long, dataLength: Long, timeout: Int, nonblock: Int): Int
    external fun sceNetAdhocGetPdpStat(size: Long, stat: Long): Int
    external fun sceNetAdhocGameModeCreateMaster(data: Long, size: Int): Int
    external fun sceNetAdhocGameModeCreateReplica(mac: Long, data: Long, size: Int): Int
    external fun sceNetAdhocGameModeUpdateMaster(): Int
    external fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int
    external fun sceNetAdhocGameModeDeleteMaster(): Int
    external fun sceNetAdhocGameModeDeleteReplica(id: Int): Int
    external fun sceNetAdhocPtpOpen(srcmac: Long, srcport: Short, destmac: Long, destport: Short, bufSize: Int, delay: Int, count: Int, unk1: Int): Int
    external fun sceNetAdhocPtpConnect(id: Int, timeout: Int, nonblock: Int): Int
    external fun sceNetAdhocPtpListen(srcmac: Long, srcport: Short, bufSize: Int, delay: Int, count: Int, queue: Int, unk1: Int): Int
    external fun sceNetAdhocPtpAccept(id: Int, mac: Long, port: Long, timeout: Int, nonblock: Int): Int
    external fun sceNetAdhocPtpSend(id: Int, data: Long, dataSize: Long, timeout: Int, nonblock: Int): Int
    external fun sceNetAdhocPtpRecv(id: Int, data: Long, dataSize: Long, timeout: Int, nonblock: Int): Int
    external fun sceNetAdhocPtpFlush(id: Int, timeout: Int, nonblock: Int): Int
    external fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int
    external fun sceNetAdhocGetPtpStat(size: Long, stat: Long): Int
    external fun sceNetAdhocMatchingInit(memsize: Int): Int
    external fun sceNetAdhocMatchingTerm(): Int
    external fun sceNetAdhocMatchingCreate(mode: Long, maxPeers: Int, port: Short, bufSize: Int, helloDelay: Int, pingDelay: Int, initCount: Int, msgDelay: Int, callback: Long): Int
    external fun sceNetAdhocMatchingDelete(matchingId: Int): Int
    external fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: Long): Int
    external fun sceNetAdhocMatchingStop(matchingId: Int): Int
    external fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: Long, optLen: Int, optData: Long): Int
    external fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: Long): Int
    external fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: Long, optLen: Int, optData: Long): Int
    external fun sceNetAdhocMatchingSendData(matchingId: Int, mac: Long, dataLen: Int, data: Long): Int
    external fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: Long): Int
    external fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: Long): Int
    external fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: Long, optData: Long): Int
    external fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: Long, buf: Long): Int
    external fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int
    external fun sceNetAdhocMatchingGetPoolStat(poolstat: Long): Int
    external fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int
    external fun sceNetApctlTerm(): Int
    external fun sceNetApctlGetInfo(code: Long, pinfo: Long): Int
    external fun sceNetApctlAddHandler(handler: Long, parg: Long): Int
    external fun sceNetApctlDelHandler(handlerId: Int): Int
    external fun sceNetApctlConnect(connIndex: Int): Int
    external fun sceNetApctlDisconnect(): Int
    external fun sceNetApctlGetState(pstate: Long): Int
    external fun sceNetInetInit(): Int
    external fun sceNetInetTerm(): Int
    external fun sceNetInetAccept(s: Int, addr: Long, addrLen: Long): Int
    external fun sceNetInetBind(s: Int, myAddr: Long, addrLen: Int): Int
    external fun sceNetInetConnect(s: Int, servAddr: Long, addrLen: Int): Int
    external fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: Long, optlEn: Long): Int
    external fun sceNetInetListen(s: Int, backlog: Int): Int
    external fun sceNetInetRecv(s: Int, buf: Long, len: Long, flags: Int): Long
    external fun sceNetInetRecvfrom(s: Int, buf: Long, flags: Long, arg1: Int, from: Long, fromLen: Long): Long
    external fun sceNetInetSend(s: Int, buf: Long, len: Long, flags: Int): Long
    external fun sceNetInetSendto(s: Int, buf: Long, len: Long, flags: Int, to: Long, toLen: Int): Long
    external fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: Long, optLen: Int): Int
    external fun sceNetInetShutdown(s: Int, how: Int): Int
    external fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int
    external fun sceNetInetClose(s: Int): Int
    external fun sceNetInetGetErrno(): Int
    external fun sceSslInit(unknown1: Int): Int
    external fun sceSslEnd(): Int
    external fun sceSslGetUsedMemoryMax(memory: Long): Int
    external fun sceSslGetUsedMemoryCurrent(memory: Long): Int
    external fun sceHttpInit(unknown1: Int): Int
    external fun sceHttpEnd(): Int
    external fun sceHttpCreateTemplate(agent: Long, unknown1: Int, unknown2: Int): Int
    external fun sceHttpDeleteTemplate(templateid: Int): Int
    external fun sceHttpCreateConnection(templateid: Int, host: Long, unknown1: Long, port: Short, unknown2: Int): Int
    external fun sceHttpCreateConnectionWithURL(templateid: Int, url: Long, unknown1: Int): Int
    external fun sceHttpDeleteConnection(connectionId: Int): Int
    external fun sceHttpCreateRequest(connectionId: Int, method: Long, path: Long, contentLength: Long): Int
    external fun sceHttpCreateRequestWithURL(connectionId: Int, method: Long, url: Long, contentLength: Long): Int
    external fun sceHttpDeleteRequest(requestId: Int): Int
    external fun sceHttpSendRequest(requestId: Int, data: Long, dataSize: Int): Int
    external fun sceHttpAbortRequest(requestId: Int): Int
    external fun sceHttpReadData(requestId: Int, data: Long, dataSize: Int): Int
    external fun sceHttpGetContentLength(requestId: Int, contentLength: Long): Int
    external fun sceHttpGetStatusCode(requestId: Int, statusCode: Long): Int
    external fun sceHttpSetResolveTimeOut(id: Int, timeout: Int): Int
    external fun sceHttpSetResolveRetry(id: Int, count: Int): Int
    external fun sceHttpSetConnectTimeOut(id: Int, timeout: Int): Int
    external fun sceHttpSetSendTimeOut(id: Int, timeout: Int): Int
    external fun sceHttpSetRecvTimeOut(id: Int, timeout: Int): Int
    external fun sceHttpEnableKeepAlive(id: Int): Int
    external fun sceHttpDisableKeepAlive(id: Int): Int
    external fun sceHttpEnableRedirect(id: Int): Int
    external fun sceHttpDisableRedirect(id: Int): Int
    external fun sceHttpEnableCookie(id: Int): Int
    external fun sceHttpDisableCookie(id: Int): Int
    external fun sceHttpSaveSystemCookie(): Int
    external fun sceHttpLoadSystemCookie(): Int
    external fun sceHttpAddExtraHeader(id: Int, name: Long, value: Long, unknown1: Int): Int
    external fun sceHttpDeleteHeader(id: Int, name: Long): Int
    external fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int
    external fun sceHttpsEnd(): Int
    external fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int
    external fun sceHttpDisableAuth(id: Int): Int
    external fun sceHttpDisableCache(id: Int): Int
    external fun sceHttpEnableAuth(id: Int): Int
    external fun sceHttpEnableCache(id: Int): Int
    external fun sceHttpEndCache(): Int
    external fun sceHttpGetAllHeader(request: Int, header: Long, headerSize: Long): Int
    external fun sceHttpGetNetworkErrno(request: Int, errNum: Long): Int
    external fun sceHttpGetProxy(id: Int, activateFlag: Long, mode: Long, proxyHost: Long, len: Long, proxyPort: Long): Int
    external fun sceHttpInitCache(maxSize: Long): Int
    external fun sceHttpSetAuthInfoCB(id: Int, cbfunc: Long): Int
    external fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: Long, newProxyPort: Short): Int
    external fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: Int): Int
    external fun sceHttpSetMallocFunction(mallocFunc: Long, freeFunc: Long, reallocFunc: Long): Int
    external fun sceNetResolverInit(): Int
    external fun sceNetResolverCreate(rid: Long, buf: Long, bufLength: Int): Int
    external fun sceNetResolverDelete(rid: Int): Int
    external fun sceNetResolverStartNtoA(rid: Int, hostname: Long, addr: Long, timeout: Int, retry: Int): Int
    external fun sceNetResolverStartAtoN(rid: Int, addr: Long, hostname: Long, hostnameLen: Int, timeout: Int, retry: Int): Int
    external fun sceNetResolverStop(rid: Int): Int
    external fun sceNetResolverTerm(): Int
}

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    PspRawLibc.sceAudioChReserve(channel, sampleCount, format)

public actual fun sceAudioChRelease(channel: Int): Int =
    PspRawLibc.sceAudioChRelease(channel)

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    PspRawLibc.sceAudioOutput(channel, vol, buf?.value ?: 0L)

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    PspRawLibc.sceAudioOutputBlocking(channel, vol, buf?.value ?: 0L)

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    PspRawLibc.sceAudioOutputPanned(channel, leftVol, rightVol, buf?.value ?: 0L)

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    PspRawLibc.sceAudioOutputPannedBlocking(channel, leftVol, rightVol, buf?.value ?: 0L)

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    PspRawLibc.sceAudioGetChannelRestLen(channel)

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    PspRawLibc.sceAudioGetChannelRestLength(channel)

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    PspRawLibc.sceAudioSetChannelDataLen(channel, sampleCount)

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    PspRawLibc.sceAudioChangeChannelConfig(channel, format)

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    PspRawLibc.sceAudioChangeChannelVolume(channel, leftVol, rightVol)

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    PspRawLibc.sceAudioOutput2Reserve(sampleCount)

public actual fun sceAudioOutput2Release(): Int =
    PspRawLibc.sceAudioOutput2Release()

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    PspRawLibc.sceAudioOutput2ChangeLength(sampleCount)

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    PspRawLibc.sceAudioOutput2OutputBlocking(vol, buf?.value ?: 0L)

public actual fun sceAudioOutput2GetRestSample(): Int =
    PspRawLibc.sceAudioOutput2GetRestSample()

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    PspRawLibc.sceAudioSRCChReserve(sampleCount, freq, channels)

public actual fun sceAudioSRCChRelease(): Int =
    PspRawLibc.sceAudioSRCChRelease()

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    PspRawLibc.sceAudioSRCOutputBlocking(vol, buf?.value ?: 0L)

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    PspRawLibc.sceAudioInputInit(unknown1, gain, unknown2)

public actual fun sceAudioInputInitEx(params: AudioInputParams?): Int =
    PspRawLibc.sceAudioInputInitEx(params?.toLong() ?: 0L)

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    PspRawLibc.sceAudioInputBlocking(sampleCount, freq, buf?.value ?: 0L)
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    PspRawLibc.sceAudioInput(sampleCount, freq, buf?.value ?: 0L)
}

public actual fun sceAudioGetInputLength(): Int =
    PspRawLibc.sceAudioGetInputLength()

public actual fun sceAudioWaitInputEnd(): Int =
    PspRawLibc.sceAudioWaitInputEnd()

public actual fun sceAudioPollInputEnd(): Int =
    PspRawLibc.sceAudioPollInputEnd()

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    PspRawLibc.sceAtracGetAtracID(uiCodecType)

public actual fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int =
    PspRawLibc.sceAtracSetDataAndGetID(buf?.value ?: 0L, bufsize)

public actual fun sceAtracDecodeData(atracId: Int, outSamples: UShort?, outN: Int?, outEnd: Int?, outRemainFrame: Int?): Int =
    PspRawLibc.sceAtracDecodeData(atracId, outSamples?.toLong() ?: 0L, outN?.toLong() ?: 0L, outEnd?.toLong() ?: 0L, outRemainFrame?.toLong() ?: 0L)

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: Int?): Int =
    PspRawLibc.sceAtracGetRemainFrame(atracId, outRemainFrame?.toLong() ?: 0L)

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: UInt?, readOffset: UInt?): Int =
    PspRawLibc.sceAtracGetStreamDataInfo(atracId, writePointer?.value ?: 0L, availableBytes?.toLong() ?: 0L, readOffset?.toLong() ?: 0L)

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    PspRawLibc.sceAtracAddStreamData(atracId, bytesToAdd)

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: Int?): Int =
    PspRawLibc.sceAtracGetBitrate(atracId, outBitrate?.toLong() ?: 0L)

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    PspRawLibc.sceAtracSetLoopNum(atracId, nloops)

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    PspRawLibc.sceAtracReleaseAtracID(atracId)

public actual fun sceAtracGetNextSample(atracId: Int, outN: Int?): Int =
    PspRawLibc.sceAtracGetNextSample(atracId, outN?.toLong() ?: 0L)

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: Int?): Int =
    PspRawLibc.sceAtracGetMaxSample(atracId, outMax?.toLong() ?: 0L)

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: Atrac3BufferInfo?): Int =
    PspRawLibc.sceAtracGetBufferInfoForReseting(atracId, uiSample, pbufferInfo?.toLong() ?: 0L)

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: UInt?): Int =
    PspRawLibc.sceAtracGetChannel(atracId, puiChannel?.toLong() ?: 0L)

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: Int?): Int =
    PspRawLibc.sceAtracGetInternalErrorInfo(atracId, piResult?.toLong() ?: 0L)

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: Int?, puiLoopStatus: UInt?): Int =
    PspRawLibc.sceAtracGetLoopStatus(atracId, piLoopNum?.toLong() ?: 0L, puiLoopStatus?.toLong() ?: 0L)

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: UInt?): Int =
    PspRawLibc.sceAtracGetNextDecodePosition(atracId, puiSamplePosition?.toLong() ?: 0L)

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: UInt?, puiDataByte: UInt?): Int =
    PspRawLibc.sceAtracGetSecondBufferInfo(atracId, puiPosition?.toLong() ?: 0L, puiDataByte?.toLong() ?: 0L)

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: Int?, piLoopStartSample: Int?, piLoopEndSample: Int?): Int =
    PspRawLibc.sceAtracGetSoundSample(atracId, piEndSample?.toLong() ?: 0L, piLoopStartSample?.toLong() ?: 0L, piLoopEndSample?.toLong() ?: 0L)

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    PspRawLibc.sceAtracResetPlayPosition(atracId, uiSample, uiWriteByteFirstBuf, uiWriteByteSecondBuf)

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int =
    PspRawLibc.sceAtracSetData(atracId, pucBufferAddr?.value ?: 0L, uiBufferByte)

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    PspRawLibc.sceAtracSetHalfwayBuffer(atracId, pucBufferAddr?.value ?: 0L, uiReadByte, uiBufferByte)

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    PspRawLibc.sceAtracSetHalfwayBufferAndGetID(pucBufferAddr?.value ?: 0L, uiReadByte, uiBufferByte)

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int =
    PspRawLibc.sceAtracSetSecondBuffer(atracId, pucSecondBufferAddr?.value ?: 0L, uiSecondBufferByte)

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    PspRawLibc.sceCtrlSetSamplingCycle(cycle)

public actual fun sceCtrlGetSamplingCycle(pcycle: Int?): Int =
    PspRawLibc.sceCtrlGetSamplingCycle(pcycle?.toLong() ?: 0L)

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    PspRawLibc.sceCtrlSetSamplingMode(mode)

public actual fun sceCtrlGetSamplingMode(pmode: Int?): Int =
    PspRawLibc.sceCtrlGetSamplingMode(pmode?.toLong() ?: 0L)

public actual fun sceCtrlPeekBufferPositive(padData: SceCtrlData?, count: Int): Int =
    PspRawLibc.sceCtrlPeekBufferPositive(padData?.toLong() ?: 0L, count)

public actual fun sceCtrlPeekBufferNegative(padData: SceCtrlData?, count: Int): Int =
    PspRawLibc.sceCtrlPeekBufferNegative(padData?.toLong() ?: 0L, count)

public actual fun sceCtrlReadBufferPositive(padData: SceCtrlData?, count: Int): Int =
    PspRawLibc.sceCtrlReadBufferPositive(padData?.toLong() ?: 0L, count)

public actual fun sceCtrlReadBufferNegative(padData: SceCtrlData?, count: Int): Int =
    PspRawLibc.sceCtrlReadBufferNegative(padData?.toLong() ?: 0L, count)

public actual fun sceCtrlPeekLatch(latchData: SceCtrlLatch?): Int =
    PspRawLibc.sceCtrlPeekLatch(latchData?.toLong() ?: 0L)

public actual fun sceCtrlReadLatch(latchData: SceCtrlLatch?): Int =
    PspRawLibc.sceCtrlReadLatch(latchData?.toLong() ?: 0L)

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    PspRawLibc.sceCtrlSetIdleCancelThreshold(idlereset, idleback)

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: Int?, idleback: Int?): Int =
    PspRawLibc.sceCtrlGetIdleCancelThreshold(idlereset?.toLong() ?: 0L, idleback?.toLong() ?: 0L)

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    PspRawLibc.sceDisplaySetMode(mode, width, height)

public actual fun sceDisplayGetMode(pmode: Int?, pwidth: Int?, pheight: Int?): Int =
    PspRawLibc.sceDisplayGetMode(pmode?.toLong() ?: 0L, pwidth?.toLong() ?: 0L, pheight?.toLong() ?: 0L)

public actual fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    PspRawLibc.sceDisplaySetFrameBuf(topAddr?.value ?: 0L, bufferWidth, pixelFormat, sync)

public actual fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong?, pixelFormat: DisplayPixelFormat?, sync: DisplaySetBufSync): Int =
    PspRawLibc.sceDisplayGetFrameBuf(topAddr?.value ?: 0L, bufferWidth?.toLong() ?: 0L, pixelFormat?.toLong() ?: 0L, sync)

public actual fun sceDisplayGetVcount(): UInt =
    PspRawLibc.sceDisplayGetVcount()

public actual fun sceDisplayWaitVblank(): Int =
    PspRawLibc.sceDisplayWaitVblank()

public actual fun sceDisplayWaitVblankCB(): Int =
    PspRawLibc.sceDisplayWaitVblankCB()

public actual fun sceDisplayWaitVblankStart(): Int =
    PspRawLibc.sceDisplayWaitVblankStart()

public actual fun sceDisplayWaitVblankStartCB(): Int =
    PspRawLibc.sceDisplayWaitVblankStartCB()

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    PspRawLibc.sceDisplayGetAccumulatedHcount()

public actual fun sceDisplayGetCurrentHcount(): Int =
    PspRawLibc.sceDisplayGetCurrentHcount()

public actual fun sceDisplayGetFramePerSec(): Float =
    PspRawLibc.sceDisplayGetFramePerSec()

public actual fun sceDisplayIsForeground(): Int =
    PspRawLibc.sceDisplayIsForeground()

public actual fun sceDisplayIsVblank(): Int =
    PspRawLibc.sceDisplayIsVblank()

public actual fun sceGeEdramGetSize(): UInt =
    PspRawLibc.sceGeEdramGetSize()

public actual fun sceGeEdramGetAddr(): COpaquePointer? =
    PspRawLibc.sceGeEdramGetAddr().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    PspRawLibc.sceGeEdramSetAddrTranslation(width)

public actual fun sceGeGetCmd(cmd: Int): UInt =
    PspRawLibc.sceGeGetCmd(cmd)

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int =
    PspRawLibc.sceGeGetMtx(type, matrix?.value ?: 0L)

public actual fun sceGeGetStack(stackId: Int, stack: GeStack?): Int =
    PspRawLibc.sceGeGetStack(stackId, stack?.toLong() ?: 0L)

public actual fun sceGeSaveContext(context: GeContext?): Int =
    PspRawLibc.sceGeSaveContext(context?.toLong() ?: 0L)

public actual fun sceGeRestoreContext(context: GeContext?): Int =
    PspRawLibc.sceGeRestoreContext(context?.toLong() ?: 0L)

public actual fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int =
    PspRawLibc.sceGeListEnQueue(list?.value ?: 0L, stall?.value ?: 0L, cbid, arg?.toLong() ?: 0L)

public actual fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int =
    PspRawLibc.sceGeListEnQueueHead(list?.value ?: 0L, stall?.value ?: 0L, cbid, arg?.toLong() ?: 0L)

public actual fun sceGeListDeQueue(qid: Int): Int =
    PspRawLibc.sceGeListDeQueue(qid)

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int =
    PspRawLibc.sceGeListUpdateStallAddr(qid, stall?.value ?: 0L)

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    PspRawLibc.sceGeListSync(qid, syncType)

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    PspRawLibc.sceGeDrawSync(syncType)

public actual fun sceGeBreak(mode: Int, pParam: GeBreakParam?): Int =
    PspRawLibc.sceGeBreak(mode, pParam?.toLong() ?: 0L)

public actual fun sceGeContinue(): Int =
    PspRawLibc.sceGeContinue()

public actual fun sceGeSetCallback(cb: GeCallbackData?): Int =
    PspRawLibc.sceGeSetCallback(cb?.toLong() ?: 0L)

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    PspRawLibc.sceGeUnsetCallback(cbid)

public actual fun sceKernelExitGame() {
    PspRawLibc.sceKernelExitGame()
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    PspRawLibc.sceKernelRegisterExitCallback(id)

public actual fun sceKernelLoadExec(file: COpaquePointer?, param: SceKernelLoadExecParam?): Int =
    PspRawLibc.sceKernelLoadExec(file?.value ?: 0L, param?.toLong() ?: 0L)

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid =
    PspRawLibc.sceKernelAllocPartitionMemory(partition, name?.value ?: 0L, type, size, addr?.value ?: 0L)

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? =
    PspRawLibc.sceKernelGetBlockHeadAddr(blockid).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    PspRawLibc.sceKernelFreePartitionMemory(blockid)

public actual fun sceKernelTotalFreeMemSize(): ULong =
    PspRawLibc.sceKernelTotalFreeMemSize()

public actual fun sceKernelMaxFreeMemSize(): ULong =
    PspRawLibc.sceKernelMaxFreeMemSize()

public actual fun sceKernelDevkitVersion(): UInt =
    PspRawLibc.sceKernelDevkitVersion()

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    PspRawLibc.sceKernelSetCompiledSdkVersion(version)

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    PspRawLibc.sceKernelGetCompiledSdkVersion()

public actual fun sceKernelLibcTime(t: Int?): Int =
    PspRawLibc.sceKernelLibcTime(t?.toLong() ?: 0L)

public actual fun sceKernelLibcClock(): UInt =
    PspRawLibc.sceKernelLibcClock()

public actual fun sceKernelLibcGettimeofday(tp: Timeval?, tzp: Timezone?): Int =
    PspRawLibc.sceKernelLibcGettimeofday(tp?.toLong() ?: 0L, tzp?.toLong() ?: 0L)

public actual fun sceKernelDcacheWritebackAll() {
    PspRawLibc.sceKernelDcacheWritebackAll()
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    PspRawLibc.sceKernelDcacheWritebackInvalidateAll()
}

public actual fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
    PspRawLibc.sceKernelDcacheWritebackRange(p?.value ?: 0L, size)
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
    PspRawLibc.sceKernelDcacheWritebackInvalidateRange(p?.value ?: 0L, size)
}

public actual fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    PspRawLibc.sceKernelDcacheInvalidateRange(p?.value ?: 0L, size)
}

public actual fun sceKernelIcacheInvalidateAll() {
    PspRawLibc.sceKernelIcacheInvalidateAll()
}

public actual fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    PspRawLibc.sceKernelIcacheInvalidateRange(p?.value ?: 0L, size)
}

public actual fun sceKernelUtilsMt19937Init(ctx: SceKernelUtilsMt19937Context?, seed: UInt): Int =
    PspRawLibc.sceKernelUtilsMt19937Init(ctx?.toLong() ?: 0L, seed)

public actual fun sceKernelUtilsMt19937UInt(ctx: SceKernelUtilsMt19937Context?): UInt =
    PspRawLibc.sceKernelUtilsMt19937UInt(ctx?.toLong() ?: 0L)

public actual fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    PspRawLibc.sceKernelUtilsMd5Digest(data?.value ?: 0L, size, digest?.value ?: 0L)

public actual fun sceKernelUtilsMd5BlockInit(ctx: SceKernelUtilsMd5Context?): Int =
    PspRawLibc.sceKernelUtilsMd5BlockInit(ctx?.toLong() ?: 0L)

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: SceKernelUtilsMd5Context?, data: COpaquePointer?, size: UInt): Int =
    PspRawLibc.sceKernelUtilsMd5BlockUpdate(ctx?.toLong() ?: 0L, data?.value ?: 0L, size)

public actual fun sceKernelUtilsMd5BlockResult(ctx: SceKernelUtilsMd5Context?, digest: COpaquePointer?): Int =
    PspRawLibc.sceKernelUtilsMd5BlockResult(ctx?.toLong() ?: 0L, digest?.value ?: 0L)

public actual fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    PspRawLibc.sceKernelUtilsSha1Digest(data?.value ?: 0L, size, digest?.value ?: 0L)

public actual fun sceKernelUtilsSha1BlockInit(ctx: SceKernelUtilsSha1Context?): Int =
    PspRawLibc.sceKernelUtilsSha1BlockInit(ctx?.toLong() ?: 0L)

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: SceKernelUtilsSha1Context?, data: COpaquePointer?, size: UInt): Int =
    PspRawLibc.sceKernelUtilsSha1BlockUpdate(ctx?.toLong() ?: 0L, data?.value ?: 0L, size)

public actual fun sceKernelUtilsSha1BlockResult(ctx: SceKernelUtilsSha1Context?, digest: COpaquePointer?): Int =
    PspRawLibc.sceKernelUtilsSha1BlockResult(ctx?.toLong() ?: 0L, digest?.value ?: 0L)

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int =
    PspRawLibc.sceKernelRegisterSubIntrHandler(intNo, no, handler?.value ?: 0L, arg?.value ?: 0L)

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    PspRawLibc.sceKernelReleaseSubIntrHandler(intNo, no)

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    PspRawLibc.sceKernelEnableSubIntr(intNo, no)

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    PspRawLibc.sceKernelDisableSubIntr(intNo, no)

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: IntrHandlerOptionParam?): Int =
    PspRawLibc.queryIntrHandlerInfo(intrCode, subIntrCode, data?.toLong() ?: 0L)

public actual fun sceKernelCpuSuspendIntr(): UInt =
    PspRawLibc.sceKernelCpuSuspendIntr()

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    PspRawLibc.sceKernelCpuResumeIntr(flags)
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    PspRawLibc.sceKernelCpuResumeIntrWithSync(flags)
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    PspRawLibc.sceKernelIsCpuIntrSuspended(flags)

public actual fun sceKernelIsCpuIntrEnable(): Int =
    PspRawLibc.sceKernelIsCpuIntrEnable()

public actual fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid =
    PspRawLibc.sceKernelLoadModule(path?.value ?: 0L, flags, option?.toLong() ?: 0L)

public actual fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid =
    PspRawLibc.sceKernelLoadModuleMs(path?.value ?: 0L, flags, option?.toLong() ?: 0L)

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: SceKernelLMOption?): SceUid =
    PspRawLibc.sceKernelLoadModuleByID(fid, flags, option?.toLong() ?: 0L)

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid =
    PspRawLibc.sceKernelLoadModuleBufferUsbWlan(bufSize, buf?.value ?: 0L, flags, option?.toLong() ?: 0L)

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    PspRawLibc.sceKernelStartModule(modId, argSize, argp?.value ?: 0L, status?.toLong() ?: 0L, option?.toLong() ?: 0L)

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    PspRawLibc.sceKernelStopModule(modId, argSize, argp?.value ?: 0L, status?.toLong() ?: 0L, option?.toLong() ?: 0L)

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    PspRawLibc.sceKernelUnloadModule(modId)

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int =
    PspRawLibc.sceKernelSelfStopUnloadModule(unknown, argSize, argp?.value ?: 0L)

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    PspRawLibc.sceKernelStopUnloadSelfModule(argSize, argp?.value ?: 0L, status?.toLong() ?: 0L, option?.toLong() ?: 0L)

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: SceKernelModuleInfo?): Int =
    PspRawLibc.sceKernelQueryModuleInfo(modId, info?.toLong() ?: 0L)

public actual fun sceKernelGetModuleIdList(readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int =
    PspRawLibc.sceKernelGetModuleIdList(readBuf?.toLong() ?: 0L, readBufSize, idCount?.toLong() ?: 0L)

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int =
    PspRawLibc.sceKernelVolatileMemLock(unk, ptr?.value ?: 0L, size?.toLong() ?: 0L)

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int =
    PspRawLibc.sceKernelVolatileMemTryLock(unk, ptr?.value ?: 0L, size?.toLong() ?: 0L)

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    PspRawLibc.sceKernelVolatileMemUnlock(unk)

public actual fun sceKernelStdin(): SceUid =
    PspRawLibc.sceKernelStdin()

public actual fun sceKernelStdout(): SceUid =
    PspRawLibc.sceKernelStdout()

public actual fun sceKernelStderr(): SceUid =
    PspRawLibc.sceKernelStderr()

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    PspRawLibc.sceKernelGetThreadmanIdType(uid)

public actual fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: SceKernelThreadOptParam?): SceUid =
    PspRawLibc.sceKernelCreateThread(name?.value ?: 0L, entry, initPriority, stackSize, attr, option?.toLong() ?: 0L)

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    PspRawLibc.sceKernelDeleteThread(thid)

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int =
    PspRawLibc.sceKernelStartThread(id, argLen, argP?.value ?: 0L)

public actual fun sceKernelExitThread(status: Int): Int =
    PspRawLibc.sceKernelExitThread(status)

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    PspRawLibc.sceKernelExitDeleteThread(status)

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    PspRawLibc.sceKernelTerminateThread(thid)

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    PspRawLibc.sceKernelTerminateDeleteThread(thid)

public actual fun sceKernelSuspendDispatchThread(): Int =
    PspRawLibc.sceKernelSuspendDispatchThread()

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    PspRawLibc.sceKernelResumeDispatchThread(state)

public actual fun sceKernelSleepThread(): Int =
    PspRawLibc.sceKernelSleepThread()

public actual fun sceKernelSleepThreadCB(): Int =
    PspRawLibc.sceKernelSleepThreadCB()

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    PspRawLibc.sceKernelWakeupThread(thid)

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    PspRawLibc.sceKernelCancelWakeupThread(thid)

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    PspRawLibc.sceKernelSuspendThread(thid)

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    PspRawLibc.sceKernelResumeThread(thid)

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: UInt?): Int =
    PspRawLibc.sceKernelWaitThreadEnd(thid, timeout?.toLong() ?: 0L)

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: UInt?): Int =
    PspRawLibc.sceKernelWaitThreadEndCB(thid, timeout?.toLong() ?: 0L)

public actual fun sceKernelDelayThread(delay: UInt): Int =
    PspRawLibc.sceKernelDelayThread(delay)

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    PspRawLibc.sceKernelDelayThreadCB(delay)

public actual fun sceKernelDelaySysClockThread(delay: SceKernelSysClock?): Int =
    PspRawLibc.sceKernelDelaySysClockThread(delay?.toLong() ?: 0L)

public actual fun sceKernelDelaySysClockThreadCB(delay: SceKernelSysClock?): Int =
    PspRawLibc.sceKernelDelaySysClockThreadCB(delay?.toLong() ?: 0L)

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    PspRawLibc.sceKernelChangeCurrentThreadAttr(unknown, attr)

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    PspRawLibc.sceKernelChangeThreadPriority(thid, priority)

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    PspRawLibc.sceKernelRotateThreadReadyQueue(priority)

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    PspRawLibc.sceKernelReleaseWaitThread(thid)

public actual fun sceKernelGetThreadId(): Int =
    PspRawLibc.sceKernelGetThreadId()

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    PspRawLibc.sceKernelGetThreadCurrentPriority()

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    PspRawLibc.sceKernelGetThreadExitStatus(thid)

public actual fun sceKernelCheckThreadStack(): Int =
    PspRawLibc.sceKernelCheckThreadStack()

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    PspRawLibc.sceKernelGetThreadStackFreeSize(thid)

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: SceKernelThreadInfo?): Int =
    PspRawLibc.sceKernelReferThreadStatus(thid, info?.toLong() ?: 0L)

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: SceKernelThreadRunStatus?): Int =
    PspRawLibc.sceKernelReferThreadRunStatus(thid, status?.toLong() ?: 0L)

public actual fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: SceKernelSemaOptParam?): SceUid =
    PspRawLibc.sceKernelCreateSema(name?.value ?: 0L, attr, initVal, maxVal, option?.toLong() ?: 0L)

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    PspRawLibc.sceKernelDeleteSema(semaId)

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    PspRawLibc.sceKernelSignalSema(semaId, signal)

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: UInt?): Int =
    PspRawLibc.sceKernelWaitSema(semaId, signal, timeout?.toLong() ?: 0L)

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: UInt?): Int =
    PspRawLibc.sceKernelWaitSemaCB(semaId, signal, timeout?.toLong() ?: 0L)

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    PspRawLibc.sceKernelPollSema(semaId, signal)

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: SceKernelSemaInfo?): Int =
    PspRawLibc.sceKernelReferSemaStatus(semaId, info?.toLong() ?: 0L)

public actual fun sceKernelCreateEventFlag(name: COpaquePointer?, attr: Int, bits: Int, opt: SceKernelEventFlagOptParam?): SceUid =
    PspRawLibc.sceKernelCreateEventFlag(name?.value ?: 0L, attr, bits, opt?.toLong() ?: 0L)

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    PspRawLibc.sceKernelSetEventFlag(evId, bits)

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    PspRawLibc.sceKernelClearEventFlag(evId, bits)

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?): Int =
    PspRawLibc.sceKernelPollEventFlag(evId, bits, wait, outBits?.toLong() ?: 0L)

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int =
    PspRawLibc.sceKernelWaitEventFlag(evId, bits, wait, outBits?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int =
    PspRawLibc.sceKernelWaitEventFlagCB(evId, bits, wait, outBits?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    PspRawLibc.sceKernelDeleteEventFlag(evId)

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: SceKernelEventFlagInfo?): Int =
    PspRawLibc.sceKernelReferEventFlagStatus(event, status?.toLong() ?: 0L)

public actual fun sceKernelCreateMbx(name: COpaquePointer?, attr: UInt, option: SceKernelMbxOptParam?): SceUid =
    PspRawLibc.sceKernelCreateMbx(name?.value ?: 0L, attr, option?.toLong() ?: 0L)

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    PspRawLibc.sceKernelDeleteMbx(mbxId)

public actual fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int =
    PspRawLibc.sceKernelSendMbx(mbxId, message?.value ?: 0L)

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int =
    PspRawLibc.sceKernelReceiveMbx(mbxId, message?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int =
    PspRawLibc.sceKernelReceiveMbxCB(mbxId, message?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int =
    PspRawLibc.sceKernelPollMbx(mbxId, pmessage?.value ?: 0L)

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: Int?): Int =
    PspRawLibc.sceKernelCancelReceiveMbx(mbxId, num?.toLong() ?: 0L)

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: SceKernelMbxInfo?): Int =
    PspRawLibc.sceKernelReferMbxStatus(mbxId, info?.toLong() ?: 0L)

public actual fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: COpaquePointer?): SceUid =
    PspRawLibc.sceKernelSetAlarm(clock, handler, common?.value ?: 0L)

public actual fun sceKernelSetSysClockAlarm(clock: SceKernelSysClock?, handler: SceKernelAlarmHandler?, common: COpaquePointer?): SceUid =
    PspRawLibc.sceKernelSetSysClockAlarm(clock?.toLong() ?: 0L, handler?.toLong() ?: 0L, common?.value ?: 0L)

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    PspRawLibc.sceKernelCancelAlarm(alarmId)

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: SceKernelAlarmInfo?): Int =
    PspRawLibc.sceKernelReferAlarmStatus(alarmId, info?.toLong() ?: 0L)

public actual fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid =
    PspRawLibc.sceKernelCreateCallback(name?.value ?: 0L, func, arg?.value ?: 0L)

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: SceKernelCallbackInfo?): Int =
    PspRawLibc.sceKernelReferCallbackStatus(cb, status?.toLong() ?: 0L)

public actual fun sceKernelDeleteCallback(cb: SceUid): Int =
    PspRawLibc.sceKernelDeleteCallback(cb)

public actual fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int =
    PspRawLibc.sceKernelNotifyCallback(cb, arg2)

public actual fun sceKernelCancelCallback(cb: SceUid): Int =
    PspRawLibc.sceKernelCancelCallback(cb)

public actual fun sceKernelGetCallbackCount(cb: SceUid): Int =
    PspRawLibc.sceKernelGetCallbackCount(cb)

public actual fun sceKernelCheckCallback(): Int =
    PspRawLibc.sceKernelCheckCallback()

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int =
    PspRawLibc.sceKernelGetThreadmanIdList(type, readBuf?.toLong() ?: 0L, readBufSize, idCount?.toLong() ?: 0L)

public actual fun sceKernelReferSystemStatus(status: SceKernelSystemStatus?): Int =
    PspRawLibc.sceKernelReferSystemStatus(status?.toLong() ?: 0L)

public actual fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid =
    PspRawLibc.sceKernelCreateMsgPipe(name?.value ?: 0L, part, attr, unk1?.value ?: 0L, opt?.value ?: 0L)

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    PspRawLibc.sceKernelDeleteMsgPipe(uid)

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    PspRawLibc.sceKernelSendMsgPipe(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    PspRawLibc.sceKernelSendMsgPipeCB(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    PspRawLibc.sceKernelTrySendMsgPipe(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L)

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    PspRawLibc.sceKernelReceiveMsgPipe(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    PspRawLibc.sceKernelReceiveMsgPipeCB(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    PspRawLibc.sceKernelTryReceiveMsgPipe(uid, message?.value ?: 0L, size, unk1, unk2?.value ?: 0L)

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: Int?, recv: Int?): Int =
    PspRawLibc.sceKernelCancelMsgPipe(uid, send?.toLong() ?: 0L, recv?.toLong() ?: 0L)

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: SceKernelMppInfo?): Int =
    PspRawLibc.sceKernelReferMsgPipeStatus(uid, info?.toLong() ?: 0L)

public actual fun sceKernelCreateVpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, opt: SceKernelVplOptParam?): SceUid =
    PspRawLibc.sceKernelCreateVpl(name?.value ?: 0L, part, attr, size, opt?.toLong() ?: 0L)

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    PspRawLibc.sceKernelDeleteVpl(uid)

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int =
    PspRawLibc.sceKernelAllocateVpl(uid, size, data?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int =
    PspRawLibc.sceKernelAllocateVplCB(uid, size, data?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int =
    PspRawLibc.sceKernelTryAllocateVpl(uid, size, data?.value ?: 0L)

public actual fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int =
    PspRawLibc.sceKernelFreeVpl(uid, data?.value ?: 0L)

public actual fun sceKernelCancelVpl(uid: SceUid, num: Int?): Int =
    PspRawLibc.sceKernelCancelVpl(uid, num?.toLong() ?: 0L)

public actual fun sceKernelReferVplStatus(uid: SceUid, info: SceKernelVplInfo?): Int =
    PspRawLibc.sceKernelReferVplStatus(uid, info?.toLong() ?: 0L)

public actual fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: SceKernelFplOptParam?): Int =
    PspRawLibc.sceKernelCreateFpl(name?.value ?: 0L, part, attr, size, blocks, opt?.toLong() ?: 0L)

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    PspRawLibc.sceKernelDeleteFpl(uid)

public actual fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int =
    PspRawLibc.sceKernelAllocateFpl(uid, data?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int =
    PspRawLibc.sceKernelAllocateFplCB(uid, data?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int =
    PspRawLibc.sceKernelTryAllocateFpl(uid, data?.value ?: 0L)

public actual fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int =
    PspRawLibc.sceKernelFreeFpl(uid, data?.value ?: 0L)

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: Int?): Int =
    PspRawLibc.sceKernelCancelFpl(uid, pnum?.toLong() ?: 0L)

public actual fun sceKernelReferFplStatus(uid: SceUid, info: SceKernelFplInfo?): Int =
    PspRawLibc.sceKernelReferFplStatus(uid, info?.toLong() ?: 0L)

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: SceKernelSysClock?): Int =
    PspRawLibc.sceKernelUSec2SysClock(usec, clock?.toLong() ?: 0L)

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    PspRawLibc.sceKernelUSec2SysClockWide(usec)

public actual fun sceKernelSysClock2USec(clock: SceKernelSysClock?, low: UInt?, high: UInt?): Int =
    PspRawLibc.sceKernelSysClock2USec(clock?.toLong() ?: 0L, low?.toLong() ?: 0L, high?.toLong() ?: 0L)

public actual fun sceKernelSysClock2USecWide(clock: Long, low: UInt?, high: UInt?): Int =
    PspRawLibc.sceKernelSysClock2USecWide(clock, low?.toLong() ?: 0L, high?.toLong() ?: 0L)

public actual fun sceKernelGetSystemTime(time: SceKernelSysClock?): Int =
    PspRawLibc.sceKernelGetSystemTime(time?.toLong() ?: 0L)

public actual fun sceKernelGetSystemTimeWide(): Long =
    PspRawLibc.sceKernelGetSystemTimeWide()

public actual fun sceKernelGetSystemTimeLow(): UInt =
    PspRawLibc.sceKernelGetSystemTimeLow()

public actual fun sceKernelCreateVTimer(name: COpaquePointer?, opt: SceKernelVTimerOptParam?): SceUid =
    PspRawLibc.sceKernelCreateVTimer(name?.value ?: 0L, opt?.toLong() ?: 0L)

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    PspRawLibc.sceKernelDeleteVTimer(uid)

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: SceKernelSysClock?): Int =
    PspRawLibc.sceKernelGetVTimerBase(uid, base?.toLong() ?: 0L)

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    PspRawLibc.sceKernelGetVTimerBaseWide(uid)

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int =
    PspRawLibc.sceKernelGetVTimerTime(uid, time?.toLong() ?: 0L)

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    PspRawLibc.sceKernelGetVTimerTimeWide(uid)

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int =
    PspRawLibc.sceKernelSetVTimerTime(uid, time?.toLong() ?: 0L)

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    PspRawLibc.sceKernelSetVTimerTimeWide(uid, time)

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    PspRawLibc.sceKernelStartVTimer(uid)

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    PspRawLibc.sceKernelStopVTimer(uid)

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: SceKernelSysClock?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int =
    PspRawLibc.sceKernelSetVTimerHandler(uid, time?.toLong() ?: 0L, handler, common?.value ?: 0L)

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int =
    PspRawLibc.sceKernelSetVTimerHandlerWide(uid, time, handler, common?.value ?: 0L)

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    PspRawLibc.sceKernelCancelVTimerHandler(uid)

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: SceKernelVTimerInfo?): Int =
    PspRawLibc.sceKernelReferVTimerStatus(uid, info?.toLong() ?: 0L)

public actual fun sceKernelRegisterThreadEventHandler(name: COpaquePointer?, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: COpaquePointer?): SceUid =
    PspRawLibc.sceKernelRegisterThreadEventHandler(name?.value ?: 0L, threadId, mask, handler, common?.value ?: 0L)

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    PspRawLibc.sceKernelReleaseThreadEventHandler(uid)

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: SceKernelThreadEventHandlerInfo?): Int =
    PspRawLibc.sceKernelReferThreadEventHandlerStatus(uid, info?.toLong() ?: 0L)

public actual fun sceKernelReferThreadProfiler(): DebugProfilerRegs? =
    PspRawLibc.sceKernelReferThreadProfiler()

public actual fun sceKernelReferGlobalProfiler(): DebugProfilerRegs? =
    PspRawLibc.sceKernelReferGlobalProfiler()

public actual fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    PspRawLibc.sceUsbStart(driverName?.value ?: 0L, size, args?.value ?: 0L)

public actual fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    PspRawLibc.sceUsbStop(driverName?.value ?: 0L, size, args?.value ?: 0L)

public actual fun sceUsbActivate(pid: UInt): Int =
    PspRawLibc.sceUsbActivate(pid)

public actual fun sceUsbDeactivate(pid: UInt): Int =
    PspRawLibc.sceUsbDeactivate(pid)

public actual fun sceUsbGetState(): Int =
    PspRawLibc.sceUsbGetState()

public actual fun sceUsbGetDrvState(driverName: COpaquePointer?): Int =
    PspRawLibc.sceUsbGetDrvState(driverName?.value ?: 0L)

public actual fun sceUsbCamSetupStill(param: UsbCamSetupStillParam?): Int =
    PspRawLibc.sceUsbCamSetupStill(param?.toLong() ?: 0L)

public actual fun sceUsbCamSetupStillEx(param: UsbCamSetupStillExParam?): Int =
    PspRawLibc.sceUsbCamSetupStillEx(param?.toLong() ?: 0L)

public actual fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int =
    PspRawLibc.sceUsbCamStillInputBlocking(buf?.value ?: 0L, size)

public actual fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int =
    PspRawLibc.sceUsbCamStillInput(buf?.value ?: 0L, size)

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    PspRawLibc.sceUsbCamStillWaitInputEnd()

public actual fun sceUsbCamStillPollInputEnd(): Int =
    PspRawLibc.sceUsbCamStillPollInputEnd()

public actual fun sceUsbCamStillCancelInput(): Int =
    PspRawLibc.sceUsbCamStillCancelInput()

public actual fun sceUsbCamStillGetInputLength(): Int =
    PspRawLibc.sceUsbCamStillGetInputLength()

public actual fun sceUsbCamSetupVideo(param: UsbCamSetupVideoParam?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    PspRawLibc.sceUsbCamSetupVideo(param?.toLong() ?: 0L, workArea?.value ?: 0L, workAreaSize)

public actual fun sceUsbCamSetupVideoEx(param: UsbCamSetupVideoExParam?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    PspRawLibc.sceUsbCamSetupVideoEx(param?.toLong() ?: 0L, workArea?.value ?: 0L, workAreaSize)

public actual fun sceUsbCamStartVideo(): Int =
    PspRawLibc.sceUsbCamStartVideo()

public actual fun sceUsbCamStopVideo(): Int =
    PspRawLibc.sceUsbCamStopVideo()

public actual fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int =
    PspRawLibc.sceUsbCamReadVideoFrameBlocking(buf?.value ?: 0L, size)

public actual fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int =
    PspRawLibc.sceUsbCamReadVideoFrame(buf?.value ?: 0L, size)

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    PspRawLibc.sceUsbCamWaitReadVideoFrameEnd()

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    PspRawLibc.sceUsbCamPollReadVideoFrameEnd()

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    PspRawLibc.sceUsbCamGetReadVideoFrameSize()

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    PspRawLibc.sceUsbCamSetSaturation(saturation)

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    PspRawLibc.sceUsbCamSetBrightness(brightness)

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    PspRawLibc.sceUsbCamSetContrast(contrast)

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    PspRawLibc.sceUsbCamSetSharpness(sharpness)

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    PspRawLibc.sceUsbCamSetImageEffectMode(effectMode)

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    PspRawLibc.sceUsbCamSetEvLevel(exposureLevel)

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    PspRawLibc.sceUsbCamSetReverseMode(reverseFlags)

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    PspRawLibc.sceUsbCamSetZoom(zoom)

public actual fun sceUsbCamGetSaturation(saturation: Int?): Int =
    PspRawLibc.sceUsbCamGetSaturation(saturation?.toLong() ?: 0L)

public actual fun sceUsbCamGetBrightness(brightness: Int?): Int =
    PspRawLibc.sceUsbCamGetBrightness(brightness?.toLong() ?: 0L)

public actual fun sceUsbCamGetContrast(contrast: Int?): Int =
    PspRawLibc.sceUsbCamGetContrast(contrast?.toLong() ?: 0L)

public actual fun sceUsbCamGetSharpness(sharpness: Int?): Int =
    PspRawLibc.sceUsbCamGetSharpness(sharpness?.toLong() ?: 0L)

public actual fun sceUsbCamGetImageEffectMode(effectMode: UsbCamEffectMode?): Int =
    PspRawLibc.sceUsbCamGetImageEffectMode(effectMode?.toLong() ?: 0L)

public actual fun sceUsbCamGetEvLevel(exposureLevel: UsbCamEvLevel?): Int =
    PspRawLibc.sceUsbCamGetEvLevel(exposureLevel?.toLong() ?: 0L)

public actual fun sceUsbCamGetReverseMode(reverseFlags: Int?): Int =
    PspRawLibc.sceUsbCamGetReverseMode(reverseFlags?.toLong() ?: 0L)

public actual fun sceUsbCamGetZoom(zoom: Int?): Int =
    PspRawLibc.sceUsbCamGetZoom(zoom?.toLong() ?: 0L)

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    PspRawLibc.sceUsbCamAutoImageReverseSW(on)

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    PspRawLibc.sceUsbCamGetAutoImageReverseState()

public actual fun sceUsbCamGetLensDirection(): Int =
    PspRawLibc.sceUsbCamGetLensDirection()

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    PspRawLibc.sceUsbstorBootRegisterNotify(eventFlag)

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    PspRawLibc.sceUsbstorBootUnregisterNotify(eventFlag)

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    PspRawLibc.sceUsbstorBootSetCapacity(size)

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    PspRawLibc.scePowerRegisterCallback(slot, cbid)

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    PspRawLibc.scePowerUnregisterCallback(slot)

public actual fun scePowerIsPowerOnline(): Int =
    PspRawLibc.scePowerIsPowerOnline()

public actual fun scePowerIsBatteryExist(): Int =
    PspRawLibc.scePowerIsBatteryExist()

public actual fun scePowerIsBatteryCharging(): Int =
    PspRawLibc.scePowerIsBatteryCharging()

public actual fun scePowerGetBatteryChargingStatus(): Int =
    PspRawLibc.scePowerGetBatteryChargingStatus()

public actual fun scePowerIsLowBattery(): Int =
    PspRawLibc.scePowerIsLowBattery()

public actual fun scePowerGetBatteryLifePercent(): Int =
    PspRawLibc.scePowerGetBatteryLifePercent()

public actual fun scePowerGetBatteryLifeTime(): Int =
    PspRawLibc.scePowerGetBatteryLifeTime()

public actual fun scePowerGetBatteryTemp(): Int =
    PspRawLibc.scePowerGetBatteryTemp()

public actual fun scePowerGetBatteryElec(): Int =
    PspRawLibc.scePowerGetBatteryElec()

public actual fun scePowerGetBatteryVolt(): Int =
    PspRawLibc.scePowerGetBatteryVolt()

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    PspRawLibc.scePowerSetCpuClockFrequency(cpufreq)

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    PspRawLibc.scePowerSetBusClockFrequency(busfreq)

public actual fun scePowerGetCpuClockFrequency(): Int =
    PspRawLibc.scePowerGetCpuClockFrequency()

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    PspRawLibc.scePowerGetCpuClockFrequencyInt()

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    PspRawLibc.scePowerGetCpuClockFrequencyFloat()

public actual fun scePowerGetBusClockFrequency(): Int =
    PspRawLibc.scePowerGetBusClockFrequency()

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    PspRawLibc.scePowerGetBusClockFrequencyInt()

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    PspRawLibc.scePowerGetBusClockFrequencyFloat()

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    PspRawLibc.scePowerSetClockFrequency(pllfreq, cpufreq, busfreq)

public actual fun scePowerLock(unknown: Int): Int =
    PspRawLibc.scePowerLock(unknown)

public actual fun scePowerUnlock(unknown: Int): Int =
    PspRawLibc.scePowerUnlock(unknown)

public actual fun scePowerTick(t: PowerTick): Int =
    PspRawLibc.scePowerTick(t)

public actual fun scePowerGetIdleTimer(): Int =
    PspRawLibc.scePowerGetIdleTimer()

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    PspRawLibc.scePowerIdleTimerEnable(unknown)

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    PspRawLibc.scePowerIdleTimerDisable(unknown)

public actual fun scePowerRequestStandby(): Int =
    PspRawLibc.scePowerRequestStandby()

public actual fun scePowerRequestSuspend(): Int =
    PspRawLibc.scePowerRequestSuspend()

public actual fun sceWlanDevIsPowerOn(): Int =
    PspRawLibc.sceWlanDevIsPowerOn()

public actual fun sceWlanGetSwitchState(): Int =
    PspRawLibc.sceWlanGetSwitchState()

public actual fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int =
    PspRawLibc.sceWlanGetEtherAddr(etherAddr?.value ?: 0L)

public actual fun sceWlanDevAttach(): Int =
    PspRawLibc.sceWlanDevAttach()

public actual fun sceWlanDevDetach(): Int =
    PspRawLibc.sceWlanDevDetach()

public actual fun sceRtcGetTickResolution(): UInt =
    PspRawLibc.sceRtcGetTickResolution()

public actual fun sceRtcGetCurrentTick(tick: ULong?): Int =
    PspRawLibc.sceRtcGetCurrentTick(tick?.toLong() ?: 0L)

public actual fun sceRtcGetCurrentClock(tm: ScePspDateTime?, tz: Int): Int =
    PspRawLibc.sceRtcGetCurrentClock(tm?.toLong() ?: 0L, tz)

public actual fun sceRtcGetCurrentClockLocalTime(tm: ScePspDateTime?): Int =
    PspRawLibc.sceRtcGetCurrentClockLocalTime(tm?.toLong() ?: 0L)

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: ULong?, tickLocal: ULong?): Int =
    PspRawLibc.sceRtcConvertUtcToLocalTime(tickUtc?.toLong() ?: 0L, tickLocal?.toLong() ?: 0L)

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: ULong?, tickUtc: ULong?): Int =
    PspRawLibc.sceRtcConvertLocalTimeToUTC(tickLocal?.toLong() ?: 0L, tickUtc?.toLong() ?: 0L)

public actual fun sceRtcIsLeapYear(year: Int): Int =
    PspRawLibc.sceRtcIsLeapYear(year)

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    PspRawLibc.sceRtcGetDaysInMonth(year, month)

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    PspRawLibc.sceRtcGetDayOfWeek(year, month, day)

public actual fun sceRtcCheckValid(date: ScePspDateTime?): Int =
    PspRawLibc.sceRtcCheckValid(date?.toLong() ?: 0L)

public actual fun sceRtcSetTick(date: ScePspDateTime?, tick: ULong?): Int =
    PspRawLibc.sceRtcSetTick(date?.toLong() ?: 0L, tick?.toLong() ?: 0L)

public actual fun sceRtcGetTick(date: ScePspDateTime?, tick: ULong?): Int =
    PspRawLibc.sceRtcGetTick(date?.toLong() ?: 0L, tick?.toLong() ?: 0L)

public actual fun sceRtcCompareTick(tick1: ULong?, tick2: ULong?): Int =
    PspRawLibc.sceRtcCompareTick(tick1?.toLong() ?: 0L, tick2?.toLong() ?: 0L)

public actual fun sceRtcTickAddTicks(destTick: ULong?, srcTick: ULong?, numTicks: ULong): Int =
    PspRawLibc.sceRtcTickAddTicks(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numTicks)

public actual fun sceRtcTickAddMicroseconds(destTick: ULong?, srcTick: ULong?, numMs: ULong): Int =
    PspRawLibc.sceRtcTickAddMicroseconds(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numMs)

public actual fun sceRtcTickAddSeconds(destTick: ULong?, srcTick: ULong?, numSeconds: ULong): Int =
    PspRawLibc.sceRtcTickAddSeconds(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numSeconds)

public actual fun sceRtcTickAddMinutes(destTick: ULong?, srcTick: ULong?, numMinutes: ULong): Int =
    PspRawLibc.sceRtcTickAddMinutes(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numMinutes)

public actual fun sceRtcTickAddHours(destTick: ULong?, srcTick: ULong?, numHours: ULong): Int =
    PspRawLibc.sceRtcTickAddHours(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numHours)

public actual fun sceRtcTickAddDays(destTick: ULong?, srcTick: ULong?, numDays: ULong): Int =
    PspRawLibc.sceRtcTickAddDays(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numDays)

public actual fun sceRtcTickAddWeeks(destTick: ULong?, srcTick: ULong?, numWeeks: ULong): Int =
    PspRawLibc.sceRtcTickAddWeeks(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numWeeks)

public actual fun sceRtcTickAddMonths(destTick: ULong?, srcTick: ULong?, numMonths: ULong): Int =
    PspRawLibc.sceRtcTickAddMonths(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numMonths)

public actual fun sceRtcTickAddYears(destTick: ULong?, srcTick: ULong?, numYears: ULong): Int =
    PspRawLibc.sceRtcTickAddYears(destTick?.toLong() ?: 0L, srcTick?.toLong() ?: 0L, numYears)

public actual fun sceRtcSetTimeT(date: ScePspDateTime?, time: UInt): Int =
    PspRawLibc.sceRtcSetTimeT(date?.toLong() ?: 0L, time)

public actual fun sceRtcGetTimeT(date: ScePspDateTime?, time: UInt?): Int =
    PspRawLibc.sceRtcGetTimeT(date?.toLong() ?: 0L, time?.toLong() ?: 0L)

public actual fun sceRtcSetTime64T(date: ScePspDateTime?, time: ULong): Int =
    PspRawLibc.sceRtcSetTime64T(date?.toLong() ?: 0L, time)

public actual fun sceRtcGetTime64T(date: ScePspDateTime?, time: ULong?): Int =
    PspRawLibc.sceRtcGetTime64T(date?.toLong() ?: 0L, time?.toLong() ?: 0L)

public actual fun sceRtcSetDosTime(date: ScePspDateTime?, dosTime: UInt): Int =
    PspRawLibc.sceRtcSetDosTime(date?.toLong() ?: 0L, dosTime)

public actual fun sceRtcGetDosTime(date: ScePspDateTime?, dosTime: UInt): Int =
    PspRawLibc.sceRtcGetDosTime(date?.toLong() ?: 0L, dosTime)

public actual fun sceRtcSetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int =
    PspRawLibc.sceRtcSetWin32FileTime(date?.toLong() ?: 0L, time?.toLong() ?: 0L)

public actual fun sceRtcGetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int =
    PspRawLibc.sceRtcGetWin32FileTime(date?.toLong() ?: 0L, time?.toLong() ?: 0L)

public actual fun sceRtcParseDateTime(destTick: ULong?, dateString: COpaquePointer?): Int =
    PspRawLibc.sceRtcParseDateTime(destTick?.toLong() ?: 0L, dateString?.value ?: 0L)

public actual fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: ULong?, timeZoneMinutes: Int): Int =
    PspRawLibc.sceRtcFormatRFC3339(pszDateTime?.value ?: 0L, pUtc?.toLong() ?: 0L, timeZoneMinutes)

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: ULong?): Int =
    PspRawLibc.sceRtcFormatRFC3339LocalTime(pszDateTime?.value ?: 0L, pUtc?.toLong() ?: 0L)

public actual fun sceRtcParseRFC3339(pUtc: ULong?, pszDateTime: COpaquePointer?): Int =
    PspRawLibc.sceRtcParseRFC3339(pUtc?.toLong() ?: 0L, pszDateTime?.value ?: 0L)

public actual fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: ULong?, timeZoneMinutes: Int): Int =
    PspRawLibc.sceRtcFormatRFC2822(pszDateTime?.value ?: 0L, pUtc?.toLong() ?: 0L, timeZoneMinutes)

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: ULong?): Int =
    PspRawLibc.sceRtcFormatRFC2822LocalTime(pszDateTime?.value ?: 0L, pUtc?.toLong() ?: 0L)

public actual fun sceIoOpen(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    PspRawLibc.sceIoOpen(file?.value ?: 0L, flags, permissions)

public actual fun sceIoOpenAsync(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    PspRawLibc.sceIoOpenAsync(file?.value ?: 0L, flags, permissions)

public actual fun sceIoClose(fd: SceUid): Int =
    PspRawLibc.sceIoClose(fd)

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    PspRawLibc.sceIoCloseAsync(fd)

public actual fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    PspRawLibc.sceIoRead(fd, data?.value ?: 0L, size)

public actual fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    PspRawLibc.sceIoReadAsync(fd, data?.value ?: 0L, size)

public actual fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int =
    PspRawLibc.sceIoWrite(fd, data?.value ?: 0L, size)

public actual fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    PspRawLibc.sceIoWriteAsync(fd, data?.value ?: 0L, size)

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    PspRawLibc.sceIoLseek(fd, offset, whence)

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    PspRawLibc.sceIoLseekAsync(fd, offset, whence)

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    PspRawLibc.sceIoLseek32(fd, offset, whence)

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    PspRawLibc.sceIoLseek32Async(fd, offset, whence)

public actual fun sceIoRemove(file: COpaquePointer?): Int =
    PspRawLibc.sceIoRemove(file?.value ?: 0L)

public actual fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int =
    PspRawLibc.sceIoMkdir(dir?.value ?: 0L, mode)

public actual fun sceIoRmdir(path: COpaquePointer?): Int =
    PspRawLibc.sceIoRmdir(path?.value ?: 0L)

public actual fun sceIoChdir(path: COpaquePointer?): Int =
    PspRawLibc.sceIoChdir(path?.value ?: 0L)

public actual fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int =
    PspRawLibc.sceIoRename(oldname?.value ?: 0L, newname?.value ?: 0L)

public actual fun sceIoDopen(dirname: COpaquePointer?): SceUid =
    PspRawLibc.sceIoDopen(dirname?.value ?: 0L)

public actual fun sceIoDread(fd: SceUid, dir: SceIoDirent?): Int =
    PspRawLibc.sceIoDread(fd, dir?.toLong() ?: 0L)

public actual fun sceIoDclose(fd: SceUid): Int =
    PspRawLibc.sceIoDclose(fd)

public actual fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    PspRawLibc.sceIoDevctl(dev?.value ?: 0L, cmd, indata?.value ?: 0L, inlen, outdata?.value ?: 0L, outlen)

public actual fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int =
    PspRawLibc.sceIoAssign(dev1?.value ?: 0L, dev2?.value ?: 0L, dev3?.value ?: 0L, mode, unk1?.value ?: 0L, unk2)

public actual fun sceIoUnassign(dev: COpaquePointer?): Int =
    PspRawLibc.sceIoUnassign(dev?.value ?: 0L)

public actual fun sceIoGetstat(file: COpaquePointer?, stat: SceIoStat?): Int =
    PspRawLibc.sceIoGetstat(file?.value ?: 0L, stat?.toLong() ?: 0L)

public actual fun sceIoChstat(file: COpaquePointer?, stat: SceIoStat?, bits: Int): Int =
    PspRawLibc.sceIoChstat(file?.value ?: 0L, stat?.toLong() ?: 0L, bits)

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    PspRawLibc.sceIoIoctl(fd, cmd, indata?.value ?: 0L, inlen, outdata?.value ?: 0L, outlen)

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    PspRawLibc.sceIoIoctlAsync(fd, cmd, indata?.value ?: 0L, inlen, outdata?.value ?: 0L, outlen)

public actual fun sceIoSync(device: COpaquePointer?, unk: UInt): Int =
    PspRawLibc.sceIoSync(device?.value ?: 0L, unk)

public actual fun sceIoWaitAsync(fd: SceUid, res: Long?): Int =
    PspRawLibc.sceIoWaitAsync(fd, res?.toLong() ?: 0L)

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: Long?): Int =
    PspRawLibc.sceIoWaitAsyncCB(fd, res?.toLong() ?: 0L)

public actual fun sceIoPollAsync(fd: SceUid, res: Long?): Int =
    PspRawLibc.sceIoPollAsync(fd, res?.toLong() ?: 0L)

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: Long?): Int =
    PspRawLibc.sceIoGetAsyncStat(fd, poll, res?.toLong() ?: 0L)

public actual fun sceIoCancel(fd: SceUid): Int =
    PspRawLibc.sceIoCancel(fd)

public actual fun sceIoGetDevType(fd: SceUid): Int =
    PspRawLibc.sceIoGetDevType(fd)

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    PspRawLibc.sceIoChangeAsyncPriority(fd, pri)

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int =
    PspRawLibc.sceIoSetAsyncCallback(fd, cb, argp?.value ?: 0L)

public actual fun sceJpegInitMJpeg(): Int =
    PspRawLibc.sceJpegInitMJpeg()

public actual fun sceJpegFinishMJpeg(): Int =
    PspRawLibc.sceJpegFinishMJpeg()

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    PspRawLibc.sceJpegCreateMJpeg(width, height)

public actual fun sceJpegDeleteMJpeg(): Int =
    PspRawLibc.sceJpegDeleteMJpeg()

public actual fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int =
    PspRawLibc.sceJpegDecodeMJpeg(jpegBuf?.value ?: 0L, size, rgba?.value ?: 0L, unk)

public actual fun sceUmdCheckMedium(): Int =
    PspRawLibc.sceUmdCheckMedium()

public actual fun sceUmdGetDiscInfo(info: UmdInfo?): Int =
    PspRawLibc.sceUmdGetDiscInfo(info?.toLong() ?: 0L)

public actual fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int =
    PspRawLibc.sceUmdActivate(unit, drive?.value ?: 0L)

public actual fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int =
    PspRawLibc.sceUmdDeactivate(unit, drive?.value ?: 0L)

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    PspRawLibc.sceUmdWaitDriveStat(state)

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    PspRawLibc.sceUmdWaitDriveStatWithTimer(state, timeout)

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    PspRawLibc.sceUmdWaitDriveStatCB(state, timeout)

public actual fun sceUmdCancelWaitDriveStat(): Int =
    PspRawLibc.sceUmdCancelWaitDriveStat()

public actual fun sceUmdGetDriveStat(): Int =
    PspRawLibc.sceUmdGetDriveStat()

public actual fun sceUmdGetErrorStat(): Int =
    PspRawLibc.sceUmdGetErrorStat()

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    PspRawLibc.sceUmdRegisterUMDCallBack(cbid)

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    PspRawLibc.sceUmdUnRegisterUMDCallBack(cbid)

public actual fun sceUmdReplacePermit(): Int =
    PspRawLibc.sceUmdReplacePermit()

public actual fun sceUmdReplaceProhibit(): Int =
    PspRawLibc.sceUmdReplaceProhibit()

public actual fun sceMpegInit(): Int =
    PspRawLibc.sceMpegInit()

public actual fun sceMpegFinish() {
    PspRawLibc.sceMpegFinish()
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    PspRawLibc.sceMpegRingbufferQueryMemSize(packets)

public actual fun sceMpegRingbufferConstruct(ringbuffer: SceMpegRingbuffer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int =
    PspRawLibc.sceMpegRingbufferConstruct(ringbuffer?.toLong() ?: 0L, packets, data?.value ?: 0L, size, callback, cbParam?.value ?: 0L)

public actual fun sceMpegRingbufferDestruct(ringbuffer: SceMpegRingbuffer?) {
    PspRawLibc.sceMpegRingbufferDestruct(ringbuffer?.toLong() ?: 0L)
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: SceMpegRingbuffer?): Int =
    PspRawLibc.sceMpegRingbufferAvailableSize(ringbuffer?.toLong() ?: 0L)

public actual fun sceMpegRingbufferPut(ringbuffer: SceMpegRingbuffer?, numPackets: Int, available: Int): Int =
    PspRawLibc.sceMpegRingbufferPut(ringbuffer?.toLong() ?: 0L, numPackets, available)

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    PspRawLibc.sceMpegQueryMemSize(unk)

public actual fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: SceMpegRingbuffer?, frameWidth: Int, unk1: Int, unk2: Int): Int =
    PspRawLibc.sceMpegCreate(handle, data?.value ?: 0L, size, ringbuffer?.toLong() ?: 0L, frameWidth, unk1, unk2)

public actual fun sceMpegDelete(handle: SceMpeg) {
    PspRawLibc.sceMpegDelete(handle)
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: Int?): Int =
    PspRawLibc.sceMpegQueryStreamOffset(handle, buffer?.value ?: 0L, offset?.toLong() ?: 0L)

public actual fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: Int?): Int =
    PspRawLibc.sceMpegQueryStreamSize(buffer?.value ?: 0L, size?.toLong() ?: 0L)

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    PspRawLibc.sceMpegRegistStream(handle, streamId, unk)

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
    PspRawLibc.sceMpegUnRegistStream(handle, stream)
}

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    PspRawLibc.sceMpegFlushAllStream(handle)

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer? =
    PspRawLibc.sceMpegMallocAvcEsBuf(handle).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?) {
    PspRawLibc.sceMpegFreeAvcEsBuf(handle, buf?.value ?: 0L)
}

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: Int?, outSize: Int?): Int =
    PspRawLibc.sceMpegQueryAtracEsSize(handle, esSize?.toLong() ?: 0L, outSize?.toLong() ?: 0L)

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: SceMpegAu?): Int =
    PspRawLibc.sceMpegInitAu(handle, esBuffer?.value ?: 0L, au?.toLong() ?: 0L)

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: Int?): Int =
    PspRawLibc.sceMpegGetAvcAu(handle, stream, au?.toLong() ?: 0L, unk?.toLong() ?: 0L)

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: SceMpegAvcMode?): Int =
    PspRawLibc.sceMpegAvcDecodeMode(handle, mode?.toLong() ?: 0L)

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: SceMpegAu?, iframeWidth: Int, buffer: COpaquePointer?, init: Int?): Int =
    PspRawLibc.sceMpegAvcDecode(handle, au?.toLong() ?: 0L, iframeWidth, buffer?.value ?: 0L, init?.toLong() ?: 0L)

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: Int?): Int =
    PspRawLibc.sceMpegAvcDecodeStop(handle, frameWidth, buffer?.value ?: 0L, status?.toLong() ?: 0L)

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: COpaquePointer?): Int =
    PspRawLibc.sceMpegGetAtracAu(handle, stream, au?.toLong() ?: 0L, unk?.value ?: 0L)

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: SceMpegAu?, buffer: COpaquePointer?, init: Int): Int =
    PspRawLibc.sceMpegAtracDecode(handle, au?.toLong() ?: 0L, buffer?.value ?: 0L, init)

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: Int?, type: Int): Int =
    PspRawLibc.sceMpegBaseYCrCbCopyVme(yuvBuffer?.value ?: 0L, buffer?.toLong() ?: 0L, type)

public actual fun sceMpegBaseCscInit(width: Int): Int =
    PspRawLibc.sceMpegBaseCscInit(width)

public actual fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: SceMpegYCrCbBuffer?): Int =
    PspRawLibc.sceMpegBaseCscVme(rgbBuffer?.value ?: 0L, rgbBuffer2?.value ?: 0L, width, yCrCbBuffer?.toLong() ?: 0L)

public actual fun sceMpegbaseBea18f91(lli: SceMpegLLI?): Int =
    PspRawLibc.sceMpegbaseBea18f91(lli?.toLong() ?: 0L)

public actual fun sceHprmPeekCurrentKey(key: Int?): Int =
    PspRawLibc.sceHprmPeekCurrentKey(key?.toLong() ?: 0L)

public actual fun sceHprmPeekLatch(latch: List<UInt>?): Int =
    PspRawLibc.sceHprmPeekLatch(latch?.toLong() ?: 0L)

public actual fun sceHprmReadLatch(latch: List<UInt>?): Int =
    PspRawLibc.sceHprmReadLatch(latch?.toLong() ?: 0L)

public actual fun sceHprmIsHeadphoneExist(): Int =
    PspRawLibc.sceHprmIsHeadphoneExist()

public actual fun sceHprmIsRemoteExist(): Int =
    PspRawLibc.sceHprmIsRemoteExist()

public actual fun sceHprmIsMicrophoneExist(): Int =
    PspRawLibc.sceHprmIsMicrophoneExist()

public actual fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
    PspRawLibc.sceGuDepthBuffer(zbp?.value ?: 0L, zbw)
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
    PspRawLibc.sceGuDispBuffer(width, height, dispbp?.value ?: 0L, dispbw)
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    PspRawLibc.sceGuDrawBuffer(psm, fbp?.value ?: 0L, fbw)
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    PspRawLibc.sceGuDrawBufferList(psm, fbp?.value ?: 0L, fbw)
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    PspRawLibc.sceGuDisplay(state)

public actual fun sceGuDepthFunc(function: DepthFunc) {
    PspRawLibc.sceGuDepthFunc(function)
}

public actual fun sceGuDepthMask(mask: Int) {
    PspRawLibc.sceGuDepthMask(mask)
}

public actual fun sceGuDepthOffset(offset: Int) {
    PspRawLibc.sceGuDepthOffset(offset)
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    PspRawLibc.sceGuDepthRange(near, far)
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    PspRawLibc.sceGuFog(near, far, color)
}

public actual fun sceGuInit() {
    PspRawLibc.sceGuInit()
}

public actual fun sceGuTerm() {
    PspRawLibc.sceGuTerm()
}

public actual fun sceGuBreak(mode: Int) {
    PspRawLibc.sceGuBreak(mode)
}

public actual fun sceGuContinue() {
    PspRawLibc.sceGuContinue()
}

public actual fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback =
    PspRawLibc.sceGuSetCallback(signal, callback)

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
    PspRawLibc.sceGuSignal(behavior, signal)
}

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
    PspRawLibc.sceGuSendCommandf(cmd, argument)
}

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
    PspRawLibc.sceGuSendCommandi(cmd, argument)
}

public actual fun sceGuGetMemory(size: Int): COpaquePointer? =
    PspRawLibc.sceGuGetMemory(size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
    PspRawLibc.sceGuStart(contextType, list?.value ?: 0L)
}

public actual fun sceGuFinish(): Int =
    PspRawLibc.sceGuFinish()

public actual fun sceGuFinishId(id: UInt): Int =
    PspRawLibc.sceGuFinishId(id)

public actual fun sceGuCallList(list: COpaquePointer?) {
    PspRawLibc.sceGuCallList(list?.value ?: 0L)
}

public actual fun sceGuCallMode(mode: Int) {
    PspRawLibc.sceGuCallMode(mode)
}

public actual fun sceGuCheckList(): Int =
    PspRawLibc.sceGuCheckList()

public actual fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: GeContext?) {
    PspRawLibc.sceGuSendList(mode, list?.value ?: 0L, context?.toLong() ?: 0L)
}

public actual fun sceGuSwapBuffers(): COpaquePointer? =
    PspRawLibc.sceGuSwapBuffers().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    PspRawLibc.sceGuSync(mode, behavior)

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspRawLibc.sceGuDrawArray(prim, vtype, count, indices?.value ?: 0L, vertices?.value ?: 0L)
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspRawLibc.sceGuBeginObject(vtype, count, indices?.value ?: 0L, vertices?.value ?: 0L)
}

public actual fun sceGuEndObject() {
    PspRawLibc.sceGuEndObject()
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
    PspRawLibc.sceGuSetStatus(state, status)
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    PspRawLibc.sceGuGetStatus(state)

public actual fun sceGuSetAllStatus(status: Int) {
    PspRawLibc.sceGuSetAllStatus(status)
}

public actual fun sceGuGetAllStatus(): Int =
    PspRawLibc.sceGuGetAllStatus()

public actual fun sceGuEnable(state: GuState) {
    PspRawLibc.sceGuEnable(state)
}

public actual fun sceGuDisable(state: GuState) {
    PspRawLibc.sceGuDisable(state)
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
    PspRawLibc.sceGuLight(light, type, components, position)
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    PspRawLibc.sceGuLightAtt(light, atten0, atten1, atten2)
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    PspRawLibc.sceGuLightColor(light, component, color)
}

public actual fun sceGuLightMode(mode: LightMode) {
    PspRawLibc.sceGuLightMode(mode)
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
    PspRawLibc.sceGuLightSpot(light, direction, exponent, cutoff)
}

public actual fun sceGuClear(flags: Int) {
    PspRawLibc.sceGuClear(flags)
}

public actual fun sceGuClearColor(color: UInt) {
    PspRawLibc.sceGuClearColor(color)
}

public actual fun sceGuClearDepth(depth: UInt) {
    PspRawLibc.sceGuClearDepth(depth)
}

public actual fun sceGuClearStencil(stencil: UInt) {
    PspRawLibc.sceGuClearStencil(stencil)
}

public actual fun sceGuPixelMask(mask: UInt) {
    PspRawLibc.sceGuPixelMask(mask)
}

public actual fun sceGuColor(color: UInt) {
    PspRawLibc.sceGuColor(color)
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
    PspRawLibc.sceGuColorFunc(func, color, mask)
}

public actual fun sceGuColorMaterial(components: Int) {
    PspRawLibc.sceGuColorMaterial(components)
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
    PspRawLibc.sceGuAlphaFunc(func, value, mask)
}

public actual fun sceGuAmbient(color: UInt) {
    PspRawLibc.sceGuAmbient(color)
}

public actual fun sceGuAmbientColor(color: UInt) {
    PspRawLibc.sceGuAmbientColor(color)
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
    PspRawLibc.sceGuBlendFunc(op, src, dest, srcFix, destFix)
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    PspRawLibc.sceGuMaterial(components, color)
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    PspRawLibc.sceGuModelColor(emissive, ambient, diffuse, specular)
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
    PspRawLibc.sceGuStencilFunc(func, ref, mask)
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
    PspRawLibc.sceGuStencilOp(fail, zfail, zpass)
}

public actual fun sceGuSpecular(power: Float) {
    PspRawLibc.sceGuSpecular(power)
}

public actual fun sceGuFrontFace(order: FrontFaceDirection) {
    PspRawLibc.sceGuFrontFace(order)
}

public actual fun sceGuLogicalOp(op: LogicalOperation) {
    PspRawLibc.sceGuLogicalOp(op)
}

public actual fun sceGuSetDither(matrix: ScePspIMatrix4) {
    PspRawLibc.sceGuSetDither(matrix)
}

public actual fun sceGuShadeModel(mode: ShadingModel) {
    PspRawLibc.sceGuShadeModel(mode)
}

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?) {
    PspRawLibc.sceGuCopyImage(psm, sx, sy, width, height, srcw, src?.value ?: 0L, dx, dy, destw, dest?.value ?: 0L)
}

public actual fun sceGuTexEnvColor(color: UInt) {
    PspRawLibc.sceGuTexEnvColor(color)
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
    PspRawLibc.sceGuTexFilter(min, mag)
}

public actual fun sceGuTexFlush() {
    PspRawLibc.sceGuTexFlush()
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
    PspRawLibc.sceGuTexFunc(tfx, tcc)
}

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?) {
    PspRawLibc.sceGuTexImage(mipmap, width, height, tbw, tbp?.value ?: 0L)
}

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
    PspRawLibc.sceGuTexLevelMode(mode, bias)
}

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
    PspRawLibc.sceGuTexMapMode(mode, a1, a2)
}

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
    PspRawLibc.sceGuTexMode(tpsm, maxmips, a2, swizzle)
}

public actual fun sceGuTexOffset(u: Float, v: Float) {
    PspRawLibc.sceGuTexOffset(u, v)
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
    PspRawLibc.sceGuTexProjMapMode(mode)
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    PspRawLibc.sceGuTexScale(u, v)
}

public actual fun sceGuTexSlope(slope: Float) {
    PspRawLibc.sceGuTexSlope(slope)
}

public actual fun sceGuTexSync() {
    PspRawLibc.sceGuTexSync()
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
    PspRawLibc.sceGuTexWrap(u, v)
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
    PspRawLibc.sceGuClutLoad(numBlocks, cbp?.value ?: 0L)
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
    PspRawLibc.sceGuClutMode(cpsm, shift, mask, a3)
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    PspRawLibc.sceGuOffset(x, y)
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    PspRawLibc.sceGuScissor(x, y, w, h)
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    PspRawLibc.sceGuViewport(cx, cy, width, height)
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspRawLibc.sceGuDrawBezier(vType, uCount, vCount, indices?.value ?: 0L, vertices?.value ?: 0L)
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    PspRawLibc.sceGuPatchDivide(ulevel, vlevel)
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    PspRawLibc.sceGuPatchFrontFace(a0)
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
    PspRawLibc.sceGuPatchPrim(prim)
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspRawLibc.sceGuDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices?.value ?: 0L, vertices?.value ?: 0L)
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
    PspRawLibc.sceGuSetMatrix(type, matrix)
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
    PspRawLibc.sceGuBoneMatrix(index, matrix)
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    PspRawLibc.sceGuMorphWeight(index, weight)
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspRawLibc.sceGuDrawArrayN(primitiveType, vType, count, a3, indices?.value ?: 0L, vertices?.value ?: 0L)
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspRawLibc.sceGumDrawArray(prim, vType, count, indices?.value ?: 0L, vertices?.value ?: 0L)
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspRawLibc.sceGumDrawArrayN(prim, vType, count, a3, indices?.value ?: 0L, vertices?.value ?: 0L)
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspRawLibc.sceGumDrawBezier(vType, uCount, vCount, indices?.value ?: 0L, vertices?.value ?: 0L)
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    PspRawLibc.sceGumDrawSpline(vType, uCount, vCount, uEdge, vEdge, indices?.value ?: 0L, vertices?.value ?: 0L)
}

public actual fun sceGumFastInverse() {
    PspRawLibc.sceGumFastInverse()
}

public actual fun sceGumFullInverse() {
    PspRawLibc.sceGumFullInverse()
}

public actual fun sceGumLoadIdentity() {
    PspRawLibc.sceGumLoadIdentity()
}

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4) {
    PspRawLibc.sceGumLoadMatrix(m)
}

public actual fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3) {
    PspRawLibc.sceGumLookAt(eye, center, up)
}

public actual fun sceGumMatrixMode(mode: MatrixMode) {
    PspRawLibc.sceGumMatrixMode(mode)
}

public actual fun sceGumMultMatrix(m: ScePspFMatrix4) {
    PspRawLibc.sceGumMultMatrix(m)
}

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    PspRawLibc.sceGumOrtho(left, right, bottom, top, near, far)
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    PspRawLibc.sceGumPerspective(fovy, aspect, near, far)
}

public actual fun sceGumPopMatrix() {
    PspRawLibc.sceGumPopMatrix()
}

public actual fun sceGumPushMatrix() {
    PspRawLibc.sceGumPushMatrix()
}

public actual fun sceGumRotateX(angle: Float) {
    PspRawLibc.sceGumRotateX(angle)
}

public actual fun sceGumRotateY(angle: Float) {
    PspRawLibc.sceGumRotateY(angle)
}

public actual fun sceGumRotateZ(angle: Float) {
    PspRawLibc.sceGumRotateZ(angle)
}

public actual fun sceGumRotateXYZ(v: ScePspFVector3) {
    PspRawLibc.sceGumRotateXYZ(v)
}

public actual fun sceGumRotateZYX(v: ScePspFVector3) {
    PspRawLibc.sceGumRotateZYX(v)
}

public actual fun sceGumScale(v: ScePspFVector3) {
    PspRawLibc.sceGumScale(v)
}

public actual fun sceGumStoreMatrix(m: ScePspFMatrix4) {
    PspRawLibc.sceGumStoreMatrix(m)
}

public actual fun sceGumTranslate(v: ScePspFVector3) {
    PspRawLibc.sceGumTranslate(v)
}

public actual fun sceGumUpdateMatrix() {
    PspRawLibc.sceGumUpdateMatrix()
}

public actual fun sceMp3ReserveMp3Handle(args: SceMp3InitArg?): Int =
    PspRawLibc.sceMp3ReserveMp3Handle(args?.toLong() ?: 0L)

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    PspRawLibc.sceMp3ReleaseMp3Handle(handle)

public actual fun sceMp3InitResource(): Int =
    PspRawLibc.sceMp3InitResource()

public actual fun sceMp3TermResource(): Int =
    PspRawLibc.sceMp3TermResource()

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    PspRawLibc.sceMp3Init(handle)

public actual fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int =
    PspRawLibc.sceMp3Decode(handle, dst?.value ?: 0L)

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: Int?, srcPos: Int?): Int =
    PspRawLibc.sceMp3GetInfoToAddStreamData(handle, dst?.value ?: 0L, toWrite?.toLong() ?: 0L, srcPos?.toLong() ?: 0L)

public actual fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int =
    PspRawLibc.sceMp3NotifyAddStreamData(handle, size)

public actual fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int =
    PspRawLibc.sceMp3CheckStreamDataNeeded(handle)

public actual fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int =
    PspRawLibc.sceMp3SetLoopNum(handle, loop)

public actual fun sceMp3GetLoopNum(handle: Mp3Handle): Int =
    PspRawLibc.sceMp3GetLoopNum(handle)

public actual fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int =
    PspRawLibc.sceMp3GetSumDecodedSample(handle)

public actual fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int =
    PspRawLibc.sceMp3GetMaxOutputSample(handle)

public actual fun sceMp3GetSamplingRate(handle: Mp3Handle): Int =
    PspRawLibc.sceMp3GetSamplingRate(handle)

public actual fun sceMp3GetBitRate(handle: Mp3Handle): Int =
    PspRawLibc.sceMp3GetBitRate(handle)

public actual fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int =
    PspRawLibc.sceMp3GetMp3ChannelNum(handle)

public actual fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int =
    PspRawLibc.sceMp3ResetPlayPosition(handle)

public actual fun sceRegOpenRegistry(reg: Key?, mode: Int, handle: RegHandle?): Int =
    PspRawLibc.sceRegOpenRegistry(reg?.toLong() ?: 0L, mode, handle?.toLong() ?: 0L)

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    PspRawLibc.sceRegFlushRegistry(handle)

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    PspRawLibc.sceRegCloseRegistry(handle)

public actual fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: RegHandle?): Int =
    PspRawLibc.sceRegOpenCategory(handle, name?.value ?: 0L, mode, dirHandle?.toLong() ?: 0L)

public actual fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int =
    PspRawLibc.sceRegRemoveCategory(handle, name?.value ?: 0L)

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    PspRawLibc.sceRegCloseCategory(dirHandle)

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    PspRawLibc.sceRegFlushCategory(dirHandle)

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: RegHandle?, type: KeyType?, size: ULong?): Int =
    PspRawLibc.sceRegGetKeyInfo(dirHandle, name?.value ?: 0L, keyHandle?.toLong() ?: 0L, type?.toLong() ?: 0L, size?.toLong() ?: 0L)

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: KeyType?, size: ULong?): Int =
    PspRawLibc.sceRegGetKeyInfoByName(dirHandle, name?.value ?: 0L, type?.toLong() ?: 0L, size?.toLong() ?: 0L)

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int =
    PspRawLibc.sceRegGetKeyValue(dirHandle, keyHandle, buf?.value ?: 0L, size)

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    PspRawLibc.sceRegGetKeyValueByName(dirHandle, name?.value ?: 0L, buf?.value ?: 0L, size)

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    PspRawLibc.sceRegSetKeyValue(dirHandle, name?.value ?: 0L, buf?.value ?: 0L, size)

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: Int?): Int =
    PspRawLibc.sceRegGetKeysNum(dirHandle, num?.toLong() ?: 0L)

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int =
    PspRawLibc.sceRegGetKeys(dirHandle, buf?.value ?: 0L, num)

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int =
    PspRawLibc.sceRegCreateKey(dirHandle, name?.value ?: 0L, type, size)

public actual fun sceRegRemoveRegistry(key: Key?): Int =
    PspRawLibc.sceRegRemoveRegistry(key?.toLong() ?: 0L)

public actual fun sceOpenPSIDGetOpenPSID(openpsid: OpenPSID?): Int =
    PspRawLibc.sceOpenPSIDGetOpenPSID(openpsid?.toLong() ?: 0L)

public actual fun sceUtilityMsgDialogInitStart(params: UtilityMsgDialogParams?): Int =
    PspRawLibc.sceUtilityMsgDialogInitStart(params?.toLong() ?: 0L)

public actual fun sceUtilityMsgDialogShutdownStart() {
    PspRawLibc.sceUtilityMsgDialogShutdownStart()
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    PspRawLibc.sceUtilityMsgDialogGetStatus()

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    PspRawLibc.sceUtilityMsgDialogUpdate(n)
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    PspRawLibc.sceUtilityMsgDialogAbort()

public actual fun sceUtilityNetconfInitStart(data: UtilityNetconfData?): Int =
    PspRawLibc.sceUtilityNetconfInitStart(data?.toLong() ?: 0L)

public actual fun sceUtilityNetconfShutdownStart(): Int =
    PspRawLibc.sceUtilityNetconfShutdownStart()

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    PspRawLibc.sceUtilityNetconfUpdate(unknown)

public actual fun sceUtilityNetconfGetStatus(): Int =
    PspRawLibc.sceUtilityNetconfGetStatus()

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    PspRawLibc.sceUtilityCheckNetParam(id)

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: UtilityNetData?): Int =
    PspRawLibc.sceUtilityGetNetParam(conf, param, data?.toLong() ?: 0L)

public actual fun sceUtilitySavedataInitStart(params: SceUtilitySavedataParam?): Int =
    PspRawLibc.sceUtilitySavedataInitStart(params?.toLong() ?: 0L)

public actual fun sceUtilitySavedataGetStatus(): Int =
    PspRawLibc.sceUtilitySavedataGetStatus()

public actual fun sceUtilitySavedataShutdownStart(): Int =
    PspRawLibc.sceUtilitySavedataShutdownStart()

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    PspRawLibc.sceUtilitySavedataUpdate(unknown)
}

public actual fun sceUtilityGameSharingInitStart(params: UtilityGameSharingParams?): Int =
    PspRawLibc.sceUtilityGameSharingInitStart(params?.toLong() ?: 0L)

public actual fun sceUtilityGameSharingShutdownStart() {
    PspRawLibc.sceUtilityGameSharingShutdownStart()
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    PspRawLibc.sceUtilityGameSharingGetStatus()

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    PspRawLibc.sceUtilityGameSharingUpdate(n)
}

public actual fun sceUtilityHtmlViewerInitStart(params: UtilityHtmlViewerParam?): Int =
    PspRawLibc.sceUtilityHtmlViewerInitStart(params?.toLong() ?: 0L)

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    PspRawLibc.sceUtilityHtmlViewerShutdownStart()

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    PspRawLibc.sceUtilityHtmlViewerUpdate(n)

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    PspRawLibc.sceUtilityHtmlViewerGetStatus()

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    PspRawLibc.sceUtilitySetSystemParamInt(id, value)

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int =
    PspRawLibc.sceUtilitySetSystemParamString(id, str?.value ?: 0L)

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: Int?): Int =
    PspRawLibc.sceUtilityGetSystemParamInt(id, value?.toLong() ?: 0L)

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int =
    PspRawLibc.sceUtilityGetSystemParamString(id, str?.value ?: 0L, len)

public actual fun sceUtilityOskInitStart(params: SceUtilityOskParams?): Int =
    PspRawLibc.sceUtilityOskInitStart(params?.toLong() ?: 0L)

public actual fun sceUtilityOskShutdownStart(): Int =
    PspRawLibc.sceUtilityOskShutdownStart()

public actual fun sceUtilityOskUpdate(n: Int): Int =
    PspRawLibc.sceUtilityOskUpdate(n)

public actual fun sceUtilityOskGetStatus(): Int =
    PspRawLibc.sceUtilityOskGetStatus()

public actual fun sceUtilityLoadNetModule(module: NetModule): Int =
    PspRawLibc.sceUtilityLoadNetModule(module)

public actual fun sceUtilityUnloadNetModule(module: NetModule): Int =
    PspRawLibc.sceUtilityUnloadNetModule(module)

public actual fun sceUtilityLoadAvModule(module: AvModule): Int =
    PspRawLibc.sceUtilityLoadAvModule(module)

public actual fun sceUtilityUnloadAvModule(module: AvModule): Int =
    PspRawLibc.sceUtilityUnloadAvModule(module)

public actual fun sceUtilityLoadUsbModule(module: UsbModule): Int =
    PspRawLibc.sceUtilityLoadUsbModule(module)

public actual fun sceUtilityUnloadUsbModule(module: UsbModule): Int =
    PspRawLibc.sceUtilityUnloadUsbModule(module)

public actual fun sceUtilityLoadModule(module: Module): Int =
    PspRawLibc.sceUtilityLoadModule(module)

public actual fun sceUtilityUnloadModule(module: Module): Int =
    PspRawLibc.sceUtilityUnloadModule(module)

public actual fun sceUtilityCreateNetParam(conf: Int): Int =
    PspRawLibc.sceUtilityCreateNetParam(conf)

public actual fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int =
    PspRawLibc.sceUtilitySetNetParam(param, value?.value ?: 0L)

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    PspRawLibc.sceUtilityCopyNetParam(src, dest)

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    PspRawLibc.sceUtilityDeleteNetParam(conf)

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    PspRawLibc.sceNetInit(poolsize, calloutprio, calloutstack, netintrprio, netintrstack)

public actual fun sceNetTerm(): Int =
    PspRawLibc.sceNetTerm()

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    PspRawLibc.sceNetFreeThreadinfo(thid)

public actual fun sceNetThreadAbort(thid: Int): Int =
    PspRawLibc.sceNetThreadAbort(thid)

public actual fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
    PspRawLibc.sceNetEtherStrton(name?.value ?: 0L, mac?.value ?: 0L)
}

public actual fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
    PspRawLibc.sceNetEtherNtostr(mac?.value ?: 0L, name?.value ?: 0L)
}

public actual fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int =
    PspRawLibc.sceNetGetLocalEtherAddr(mac?.value ?: 0L)

public actual fun sceNetGetMallocStat(stat: SceNetMallocStat?): Int =
    PspRawLibc.sceNetGetMallocStat(stat?.toLong() ?: 0L)

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: SceNetAdhocctlAdhocId?): Int =
    PspRawLibc.sceNetAdhocctlInit(stacksize, priority, adhocId?.toLong() ?: 0L)

public actual fun sceNetAdhocctlTerm(): Int =
    PspRawLibc.sceNetAdhocctlTerm()

public actual fun sceNetAdhocctlConnect(name: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocctlConnect(name?.value ?: 0L)

public actual fun sceNetAdhocctlDisconnect(): Int =
    PspRawLibc.sceNetAdhocctlDisconnect()

public actual fun sceNetAdhocctlGetState(event: Int?): Int =
    PspRawLibc.sceNetAdhocctlGetState(event?.toLong() ?: 0L)

public actual fun sceNetAdhocctlCreate(name: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocctlCreate(name?.value ?: 0L)

public actual fun sceNetAdhocctlJoin(scaninfo: SceNetAdhocctlScanInfo?): Int =
    PspRawLibc.sceNetAdhocctlJoin(scaninfo?.toLong() ?: 0L)

public actual fun sceNetAdhocctlGetAdhocId(id: SceNetAdhocctlAdhocId?): Int =
    PspRawLibc.sceNetAdhocctlGetAdhocId(id?.toLong() ?: 0L)

public actual fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int =
    PspRawLibc.sceNetAdhocctlCreateEnterGameMode(name?.value ?: 0L, unknown, num, macs?.value ?: 0L, timeout, unknown2)

public actual fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int =
    PspRawLibc.sceNetAdhocctlJoinEnterGameMode(name?.value ?: 0L, hostmac?.value ?: 0L, timeout, unknown)

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: SceNetAdhocctlGameModeInfo?): Int =
    PspRawLibc.sceNetAdhocctlGetGameModeInfo(gamemodeinfo?.toLong() ?: 0L)

public actual fun sceNetAdhocctlExitGameMode(): Int =
    PspRawLibc.sceNetAdhocctlExitGameMode()

public actual fun sceNetAdhocctlGetPeerList(length: Int?, buf: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocctlGetPeerList(length?.toLong() ?: 0L, buf?.value ?: 0L)

public actual fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: SceNetAdhocctlPeerInfo?): Int =
    PspRawLibc.sceNetAdhocctlGetPeerInfo(mac?.value ?: 0L, size, peerinfo?.toLong() ?: 0L)

public actual fun sceNetAdhocctlScan(): Int =
    PspRawLibc.sceNetAdhocctlScan()

public actual fun sceNetAdhocctlGetScanInfo(length: Int?, buf: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocctlGetScanInfo(length?.toLong() ?: 0L, buf?.value ?: 0L)

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocctlAddHandler(handler, unknown?.value ?: 0L)

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    PspRawLibc.sceNetAdhocctlDelHandler(id)

public actual fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocctlGetNameByAddr(mac?.value ?: 0L, nickname?.value ?: 0L)

public actual fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: Int?, buf: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocctlGetAddrByName(nickname?.value ?: 0L, length?.toLong() ?: 0L, buf?.value ?: 0L)

public actual fun sceNetAdhocctlGetParameter(params: SceNetAdhocctlParams?): Int =
    PspRawLibc.sceNetAdhocctlGetParameter(params?.toLong() ?: 0L)

public actual fun sceNetAdhocInit(): Int =
    PspRawLibc.sceNetAdhocInit()

public actual fun sceNetAdhocTerm(): Int =
    PspRawLibc.sceNetAdhocTerm()

public actual fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int =
    PspRawLibc.sceNetAdhocPdpCreate(mac?.value ?: 0L, port, bufSize, unk1)

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    PspRawLibc.sceNetAdhocPdpDelete(id, unk1)

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int =
    PspRawLibc.sceNetAdhocPdpSend(id, destMacAddr?.value ?: 0L, port, data?.value ?: 0L, len, timeout, nonblock)

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: UShort?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    PspRawLibc.sceNetAdhocPdpRecv(id, srcMacAddr?.value ?: 0L, port?.toLong() ?: 0L, data?.value ?: 0L, dataLength?.value ?: 0L, timeout, nonblock)

public actual fun sceNetAdhocGetPdpStat(size: Int?, stat: SceNetAdhocPdpStat?): Int =
    PspRawLibc.sceNetAdhocGetPdpStat(size?.toLong() ?: 0L, stat?.toLong() ?: 0L)

public actual fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int =
    PspRawLibc.sceNetAdhocGameModeCreateMaster(data?.value ?: 0L, size)

public actual fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int =
    PspRawLibc.sceNetAdhocGameModeCreateReplica(mac?.value ?: 0L, data?.value ?: 0L, size)

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    PspRawLibc.sceNetAdhocGameModeUpdateMaster()

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    PspRawLibc.sceNetAdhocGameModeUpdateReplica(id, unk1)

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    PspRawLibc.sceNetAdhocGameModeDeleteMaster()

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    PspRawLibc.sceNetAdhocGameModeDeleteReplica(id)

public actual fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    PspRawLibc.sceNetAdhocPtpOpen(srcmac?.value ?: 0L, srcport, destmac?.value ?: 0L, destport, bufSize, delay, count, unk1)

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    PspRawLibc.sceNetAdhocPtpConnect(id, timeout, nonblock)

public actual fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    PspRawLibc.sceNetAdhocPtpListen(srcmac?.value ?: 0L, srcport, bufSize, delay, count, queue, unk1)

public actual fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: UShort?, timeout: UInt, nonblock: Int): Int =
    PspRawLibc.sceNetAdhocPtpAccept(id, mac?.value ?: 0L, port?.toLong() ?: 0L, timeout, nonblock)

public actual fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int =
    PspRawLibc.sceNetAdhocPtpSend(id, data?.value ?: 0L, dataSize?.toLong() ?: 0L, timeout, nonblock)

public actual fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int =
    PspRawLibc.sceNetAdhocPtpRecv(id, data?.value ?: 0L, dataSize?.toLong() ?: 0L, timeout, nonblock)

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    PspRawLibc.sceNetAdhocPtpFlush(id, timeout, nonblock)

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    PspRawLibc.sceNetAdhocPtpClose(id, unk1)

public actual fun sceNetAdhocGetPtpStat(size: Int?, stat: SceNetAdhocPtpStat?): Int =
    PspRawLibc.sceNetAdhocGetPtpStat(size?.toLong() ?: 0L, stat?.toLong() ?: 0L)

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    PspRawLibc.sceNetAdhocMatchingInit(memsize)

public actual fun sceNetAdhocMatchingTerm(): Int =
    PspRawLibc.sceNetAdhocMatchingTerm()

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    PspRawLibc.sceNetAdhocMatchingCreate(mode, maxPeers, port, bufSize, helloDelay, pingDelay, initCount, msgDelay, callback)

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    PspRawLibc.sceNetAdhocMatchingDelete(matchingId)

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocMatchingStart(matchingId, evthPri, evthStack, inthPri, inthStack, optLen, optData?.value ?: 0L)

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    PspRawLibc.sceNetAdhocMatchingStop(matchingId)

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocMatchingSelectTarget(matchingId, mac?.value ?: 0L, optLen, optData?.value ?: 0L)

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocMatchingCancelTarget(matchingId, mac?.value ?: 0L)

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocMatchingCancelTargetWithOpt(matchingId, mac?.value ?: 0L, optLen, optData?.value ?: 0L)

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocMatchingSendData(matchingId, mac?.value ?: 0L, dataLen, data?.value ?: 0L)

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocMatchingAbortSendData(matchingId, mac?.value ?: 0L)

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocMatchingSetHelloOpt(matchingId, optLen, optData?.value ?: 0L)

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: Int?, optData: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocMatchingGetHelloOpt(matchingId, optLen?.toLong() ?: 0L, optData?.value ?: 0L)

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: Int?, buf: COpaquePointer?): Int =
    PspRawLibc.sceNetAdhocMatchingGetMembers(matchingId, length?.toLong() ?: 0L, buf?.value ?: 0L)

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    PspRawLibc.sceNetAdhocMatchingGetPoolMaxAlloc()

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: AdhocPoolStat?): Int =
    PspRawLibc.sceNetAdhocMatchingGetPoolStat(poolstat?.toLong() ?: 0L)

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    PspRawLibc.sceNetApctlInit(stackSize, initPriority)

public actual fun sceNetApctlTerm(): Int =
    PspRawLibc.sceNetApctlTerm()

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: SceNetApctlInfo?): Int =
    PspRawLibc.sceNetApctlGetInfo(code, pinfo?.toLong() ?: 0L)

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int =
    PspRawLibc.sceNetApctlAddHandler(handler, parg?.value ?: 0L)

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    PspRawLibc.sceNetApctlDelHandler(handlerId)

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    PspRawLibc.sceNetApctlConnect(connIndex)

public actual fun sceNetApctlDisconnect(): Int =
    PspRawLibc.sceNetApctlDisconnect()

public actual fun sceNetApctlGetState(pstate: ApctlState?): Int =
    PspRawLibc.sceNetApctlGetState(pstate?.toLong() ?: 0L)

public actual fun sceNetInetInit(): Int =
    PspRawLibc.sceNetInetInit()

public actual fun sceNetInetTerm(): Int =
    PspRawLibc.sceNetInetTerm()

public actual fun sceNetInetAccept(s: Int, addr: Sockaddr?, addrLen: UInt?): Int =
    PspRawLibc.sceNetInetAccept(s, addr?.toLong() ?: 0L, addrLen?.toLong() ?: 0L)

public actual fun sceNetInetBind(s: Int, myAddr: Sockaddr?, addrLen: SocklenT): Int =
    PspRawLibc.sceNetInetBind(s, myAddr?.toLong() ?: 0L, addrLen)

public actual fun sceNetInetConnect(s: Int, servAddr: Sockaddr?, addrLen: SocklenT): Int =
    PspRawLibc.sceNetInetConnect(s, servAddr?.toLong() ?: 0L, addrLen)

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: UInt?): Int =
    PspRawLibc.sceNetInetGetsockopt(s, level, optName, optVal?.value ?: 0L, optlEn?.toLong() ?: 0L)

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    PspRawLibc.sceNetInetListen(s, backlog)

public actual fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    PspRawLibc.sceNetInetRecv(s, buf?.value ?: 0L, len, flags)

public actual fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: Sockaddr?, fromLen: UInt?): ULong =
    PspRawLibc.sceNetInetRecvfrom(s, buf?.value ?: 0L, flags, arg1, from?.toLong() ?: 0L, fromLen?.toLong() ?: 0L)

public actual fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    PspRawLibc.sceNetInetSend(s, buf?.value ?: 0L, len, flags)

public actual fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, toLen: SocklenT): ULong =
    PspRawLibc.sceNetInetSendto(s, buf?.value ?: 0L, len, flags, to?.toLong() ?: 0L, toLen)

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int =
    PspRawLibc.sceNetInetSetsockopt(s, level, optName, optVal?.value ?: 0L, optLen)

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    PspRawLibc.sceNetInetShutdown(s, how)

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    PspRawLibc.sceNetInetSocket(domain, type, protocol)

public actual fun sceNetInetClose(s: Int): Int =
    PspRawLibc.sceNetInetClose(s)

public actual fun sceNetInetGetErrno(): Int =
    PspRawLibc.sceNetInetGetErrno()

public actual fun sceSslInit(unknown1: Int): Int =
    PspRawLibc.sceSslInit(unknown1)

public actual fun sceSslEnd(): Int =
    PspRawLibc.sceSslEnd()

public actual fun sceSslGetUsedMemoryMax(memory: UInt?): Int =
    PspRawLibc.sceSslGetUsedMemoryMax(memory?.toLong() ?: 0L)

public actual fun sceSslGetUsedMemoryCurrent(memory: UInt?): Int =
    PspRawLibc.sceSslGetUsedMemoryCurrent(memory?.toLong() ?: 0L)

public actual fun sceHttpInit(unknown1: UInt): Int =
    PspRawLibc.sceHttpInit(unknown1)

public actual fun sceHttpEnd(): Int =
    PspRawLibc.sceHttpEnd()

public actual fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int =
    PspRawLibc.sceHttpCreateTemplate(agent?.value ?: 0L, unknown1, unknown2)

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    PspRawLibc.sceHttpDeleteTemplate(templateid)

public actual fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int =
    PspRawLibc.sceHttpCreateConnection(templateid, host?.value ?: 0L, unknown1?.value ?: 0L, port, unknown2)

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int =
    PspRawLibc.sceHttpCreateConnectionWithURL(templateid, url?.value ?: 0L, unknown1)

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    PspRawLibc.sceHttpDeleteConnection(connectionId)

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int =
    PspRawLibc.sceHttpCreateRequest(connectionId, method, path?.value ?: 0L, contentLength)

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int =
    PspRawLibc.sceHttpCreateRequestWithURL(connectionId, method, url?.value ?: 0L, contentLength)

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    PspRawLibc.sceHttpDeleteRequest(requestId)

public actual fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    PspRawLibc.sceHttpSendRequest(requestId, data?.value ?: 0L, dataSize)

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    PspRawLibc.sceHttpAbortRequest(requestId)

public actual fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    PspRawLibc.sceHttpReadData(requestId, data?.value ?: 0L, dataSize)

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: ULong?): Int =
    PspRawLibc.sceHttpGetContentLength(requestId, contentLength?.toLong() ?: 0L)

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: Int?): Int =
    PspRawLibc.sceHttpGetStatusCode(requestId, statusCode?.toLong() ?: 0L)

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    PspRawLibc.sceHttpSetResolveTimeOut(id, timeout)

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    PspRawLibc.sceHttpSetResolveRetry(id, count)

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    PspRawLibc.sceHttpSetConnectTimeOut(id, timeout)

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    PspRawLibc.sceHttpSetSendTimeOut(id, timeout)

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    PspRawLibc.sceHttpSetRecvTimeOut(id, timeout)

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    PspRawLibc.sceHttpEnableKeepAlive(id)

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    PspRawLibc.sceHttpDisableKeepAlive(id)

public actual fun sceHttpEnableRedirect(id: Int): Int =
    PspRawLibc.sceHttpEnableRedirect(id)

public actual fun sceHttpDisableRedirect(id: Int): Int =
    PspRawLibc.sceHttpDisableRedirect(id)

public actual fun sceHttpEnableCookie(id: Int): Int =
    PspRawLibc.sceHttpEnableCookie(id)

public actual fun sceHttpDisableCookie(id: Int): Int =
    PspRawLibc.sceHttpDisableCookie(id)

public actual fun sceHttpSaveSystemCookie(): Int =
    PspRawLibc.sceHttpSaveSystemCookie()

public actual fun sceHttpLoadSystemCookie(): Int =
    PspRawLibc.sceHttpLoadSystemCookie()

public actual fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int =
    PspRawLibc.sceHttpAddExtraHeader(id, name?.value ?: 0L, value?.value ?: 0L, unknown1)

public actual fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int =
    PspRawLibc.sceHttpDeleteHeader(id, name?.value ?: 0L)

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    PspRawLibc.sceHttpsInit(unknown1, unknown2, unknown3, unknown4)

public actual fun sceHttpsEnd(): Int =
    PspRawLibc.sceHttpsEnd()

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    PspRawLibc.sceHttpsLoadDefaultCert(unknown1, unknown2)

public actual fun sceHttpDisableAuth(id: Int): Int =
    PspRawLibc.sceHttpDisableAuth(id)

public actual fun sceHttpDisableCache(id: Int): Int =
    PspRawLibc.sceHttpDisableCache(id)

public actual fun sceHttpEnableAuth(id: Int): Int =
    PspRawLibc.sceHttpEnableAuth(id)

public actual fun sceHttpEnableCache(id: Int): Int =
    PspRawLibc.sceHttpEnableCache(id)

public actual fun sceHttpEndCache(): Int =
    PspRawLibc.sceHttpEndCache()

public actual fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: UInt?): Int =
    PspRawLibc.sceHttpGetAllHeader(request, header?.value ?: 0L, headerSize?.toLong() ?: 0L)

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: Int?): Int =
    PspRawLibc.sceHttpGetNetworkErrno(request, errNum?.toLong() ?: 0L)

public actual fun sceHttpGetProxy(id: Int, activateFlag: Int?, mode: Int?, proxyHost: COpaquePointer?, len: ULong, proxyPort: UShort?): Int =
    PspRawLibc.sceHttpGetProxy(id, activateFlag?.toLong() ?: 0L, mode?.toLong() ?: 0L, proxyHost?.value ?: 0L, len, proxyPort?.toLong() ?: 0L)

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    PspRawLibc.sceHttpInitCache(maxSize)

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    PspRawLibc.sceHttpSetAuthInfoCB(id, cbfunc)

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int =
    PspRawLibc.sceHttpSetProxy(id, activateFlag, mode, newProxyHost?.value ?: 0L, newProxyPort)

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    PspRawLibc.sceHttpSetResHeaderMaxSize(id, headerSize)

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    PspRawLibc.sceHttpSetMallocFunction(mallocFunc, freeFunc, reallocFunc)

public actual fun sceNetResolverInit(): Int =
    PspRawLibc.sceNetResolverInit()

public actual fun sceNetResolverCreate(rid: Int?, buf: COpaquePointer?, bufLength: UInt): Int =
    PspRawLibc.sceNetResolverCreate(rid?.toLong() ?: 0L, buf?.value ?: 0L, bufLength)

public actual fun sceNetResolverDelete(rid: Int): Int =
    PspRawLibc.sceNetResolverDelete(rid)

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: InAddr?, timeout: UInt, retry: Int): Int =
    PspRawLibc.sceNetResolverStartNtoA(rid, hostname?.value ?: 0L, addr?.toLong() ?: 0L, timeout, retry)

public actual fun sceNetResolverStartAtoN(rid: Int, addr: InAddr?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    PspRawLibc.sceNetResolverStartAtoN(rid, addr?.toLong() ?: 0L, hostname?.value ?: 0L, hostnameLen, timeout, retry)

public actual fun sceNetResolverStop(rid: Int): Int =
    PspRawLibc.sceNetResolverStop(rid)

public actual fun sceNetResolverTerm(): Int =
    PspRawLibc.sceNetResolverTerm()
