@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.COpaquePointer

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChRelease(channel: Int): Int =
    0

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    0

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    0

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    0

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    0

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    0

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    0

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    0

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    0

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    0

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    0

public actual fun sceAudioOutput2Release(): Int =
    0

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    0

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    0

public actual fun sceAudioOutput2GetRestSample(): Int =
    0

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    0

public actual fun sceAudioSRCChRelease(): Int =
    0

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    0

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    0

public actual fun sceAudioInputInitEx(params: COpaquePointer?): Int =
    0

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
}

public actual fun sceAudioGetInputLength(): Int =
    0

public actual fun sceAudioWaitInputEnd(): Int =
    0

public actual fun sceAudioPollInputEnd(): Int =
    0

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    0

public actual fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int =
    0

public actual fun sceAtracDecodeData(atracId: Int, outSamples: COpaquePointer?, outN: COpaquePointer?, outEnd: COpaquePointer?, outRemainFrame: COpaquePointer?): Int =
    0

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: COpaquePointer?): Int =
    0

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: COpaquePointer?, readOffset: COpaquePointer?): Int =
    0

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    0

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: COpaquePointer?): Int =
    0

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    0

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    0

public actual fun sceAtracGetNextSample(atracId: Int, outN: COpaquePointer?): Int =
    0

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: COpaquePointer?): Int =
    0

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: COpaquePointer?): Int =
    0

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: COpaquePointer?): Int =
    0

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: COpaquePointer?): Int =
    0

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: COpaquePointer?, puiLoopStatus: COpaquePointer?): Int =
    0

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: COpaquePointer?): Int =
    0

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: COpaquePointer?, puiDataByte: COpaquePointer?): Int =
    0

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: COpaquePointer?, piLoopStartSample: COpaquePointer?, piLoopEndSample: COpaquePointer?): Int =
    0

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    0

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int =
    0

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    0

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    0

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int =
    0

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    0

public actual fun sceCtrlGetSamplingCycle(pcycle: COpaquePointer?): Int =
    0

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    0

public actual fun sceCtrlGetSamplingMode(pmode: COpaquePointer?): Int =
    0

public actual fun sceCtrlPeekBufferPositive(padData: COpaquePointer?, count: Int): Int =
    0

public actual fun sceCtrlPeekBufferNegative(padData: COpaquePointer?, count: Int): Int =
    0

public actual fun sceCtrlReadBufferPositive(padData: COpaquePointer?, count: Int): Int =
    0

public actual fun sceCtrlReadBufferNegative(padData: COpaquePointer?, count: Int): Int =
    0

public actual fun sceCtrlPeekLatch(latchData: COpaquePointer?): Int =
    0

public actual fun sceCtrlReadLatch(latchData: COpaquePointer?): Int =
    0

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    0

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: COpaquePointer?, idleback: COpaquePointer?): Int =
    0

public actual fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt =
    0u

public actual fun sceDisplayGetMode(pmode: COpaquePointer?, pwidth: COpaquePointer?, pheight: COpaquePointer?): Int =
    0

public actual fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt =
    0u

public actual fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: COpaquePointer?, pixelFormat: COpaquePointer?, sync: DisplaySetBufSync): Int =
    0

public actual fun sceDisplayGetVcount(): UInt =
    0u

public actual fun sceDisplayWaitVblank(): Int =
    0

public actual fun sceDisplayWaitVblankCB(): Int =
    0

public actual fun sceDisplayWaitVblankStart(): Int =
    0

public actual fun sceDisplayWaitVblankStartCB(): Int =
    0

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    0

public actual fun sceDisplayGetCurrentHcount(): Int =
    0

public actual fun sceDisplayGetFramePerSec(): Float =
    0.0f

public actual fun sceDisplayIsForeground(): Int =
    0

public actual fun sceDisplayIsVblank(): Int =
    0

public actual fun sceGeEdramGetSize(): UInt =
    0u

public actual fun sceGeEdramGetAddr(): COpaquePointer? =
    null

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    0

public actual fun sceGeGetCmd(cmd: Int): UInt =
    0u

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int =
    0

public actual fun sceGeGetStack(stackId: Int, stack: COpaquePointer?): Int =
    0

public actual fun sceGeSaveContext(context: COpaquePointer?): Int =
    0

public actual fun sceGeRestoreContext(context: COpaquePointer?): Int =
    0

public actual fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    0

public actual fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int =
    0

public actual fun sceGeListDeQueue(qid: Int): Int =
    0

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int =
    0

public actual fun sceGeListSync(qid: Int, syncType: Int): GeListState =
    GeListState.entries.first()

public actual fun sceGeDrawSync(syncType: Int): GeListState =
    GeListState.entries.first()

public actual fun sceGeBreak(mode: Int, pParam: COpaquePointer?): Int =
    0

public actual fun sceGeContinue(): Int =
    0

public actual fun sceGeSetCallback(cb: COpaquePointer?): Int =
    0

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    0

public actual fun sceKernelExitGame() {
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    0

public actual fun sceKernelLoadExec(file: COpaquePointer?, param: COpaquePointer?): Int =
    0

public actual fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? =
    null

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    0

public actual fun sceKernelTotalFreeMemSize(): ULong =
    0uL

public actual fun sceKernelMaxFreeMemSize(): ULong =
    0uL

public actual fun sceKernelDevkitVersion(): UInt =
    0u

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    0

public actual fun sceKernelGetCompiledSdkVersion(): UInt =
    0u

public actual fun sceKernelLibcTime(t: COpaquePointer?): Int =
    0

public actual fun sceKernelLibcClock(): UInt =
    0u

public actual fun sceKernelLibcGettimeofday(tp: COpaquePointer?, tzp: COpaquePointer?): Int =
    0

public actual fun sceKernelDcacheWritebackAll() {
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
}

public actual fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
}

public actual fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
}

public actual fun sceKernelIcacheInvalidateAll() {
}

public actual fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
}

public actual fun sceKernelUtilsMt19937Init(ctx: COpaquePointer?, seed: UInt): Int =
    0

public actual fun sceKernelUtilsMt19937UInt(ctx: COpaquePointer?): UInt =
    0u

public actual fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    0

public actual fun sceKernelUtilsMd5BlockInit(ctx: COpaquePointer?): Int =
    0

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    0

public actual fun sceKernelUtilsMd5BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    0

public actual fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    0

public actual fun sceKernelUtilsSha1BlockInit(ctx: COpaquePointer?): Int =
    0

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int =
    0

public actual fun sceKernelUtilsSha1BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int =
    0

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int =
    0

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    0

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    0

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    0

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: COpaquePointer?): Int =
    0

public actual fun sceKernelCpuSuspendIntr(): UInt =
    0u

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    0

public actual fun sceKernelIsCpuIntrEnable(): Int =
    0

public actual fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    0

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    0

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    0

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int =
    0

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int =
    0

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelGetModuleIdList(readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    0

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    0

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int =
    0

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    0

public actual fun sceKernelStdin(): SceUid =
    SceUid()

public actual fun sceKernelStdout(): SceUid =
    SceUid()

public actual fun sceKernelStderr(): SceUid =
    SceUid()

public actual fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType =
    SceKernelIdListType.entries.first()

public actual fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    0

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int =
    0

public actual fun sceKernelExitThread(status: Int): Int =
    0

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    0

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    0

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    0

public actual fun sceKernelSuspendDispatchThread(): Int =
    0

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    0

public actual fun sceKernelSleepThread(): Int =
    0

public actual fun sceKernelSleepThreadCB(): Int =
    0

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
    0

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    0

public actual fun sceKernelDelaySysClockThread(delay: COpaquePointer?): Int =
    0

public actual fun sceKernelDelaySysClockThreadCB(delay: COpaquePointer?): Int =
    0

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    0

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    0

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    0

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    0

public actual fun sceKernelGetThreadId(): Int =
    0

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    0

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    0

public actual fun sceKernelCheckThreadStack(): Int =
    0

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    0

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: COpaquePointer?): SceUid =
    SceUid()

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
    SceUid()

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
    SceUid()

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
    SceUid()

public actual fun sceKernelSetSysClockAlarm(clock: COpaquePointer?, handler: COpaquePointer?, common: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    0

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid =
    SceUid()

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
    0

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int =
    0

public actual fun sceKernelReferSystemStatus(status: COpaquePointer?): Int =
    0

public actual fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid =
    SceUid()

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
    SceUid()

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
    0

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
    0

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    0L

public actual fun sceKernelSysClock2USec(clock: COpaquePointer?, low: COpaquePointer?, high: COpaquePointer?): Int =
    0

public actual fun sceKernelSysClock2USecWide(clock: Long, low: COpaquePointer?, high: COpaquePointer?): Int =
    0

public actual fun sceKernelGetSystemTime(time: COpaquePointer?): Int =
    0

public actual fun sceKernelGetSystemTimeWide(): Long =
    0L

public actual fun sceKernelGetSystemTimeLow(): UInt =
    0u

public actual fun sceKernelCreateVTimer(name: COpaquePointer?, opt: COpaquePointer?): SceUid =
    SceUid()

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
    SceUid()

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    0

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: COpaquePointer?): Int =
    0

public actual fun sceKernelReferThreadProfiler(): COpaquePointer? =
    null

public actual fun sceKernelReferGlobalProfiler(): COpaquePointer? =
    null

public actual fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    0

public actual fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    0

public actual fun sceUsbActivate(pid: UInt): Int =
    0

public actual fun sceUsbDeactivate(pid: UInt): Int =
    0

public actual fun sceUsbGetState(): Int =
    0

public actual fun sceUsbGetDrvState(driverName: COpaquePointer?): Int =
    0

public actual fun sceUsbCamSetupStill(param: COpaquePointer?): Int =
    0

public actual fun sceUsbCamSetupStillEx(param: COpaquePointer?): Int =
    0

public actual fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    0

public actual fun sceUsbCamStillPollInputEnd(): Int =
    0

public actual fun sceUsbCamStillCancelInput(): Int =
    0

public actual fun sceUsbCamStillGetInputLength(): Int =
    0

public actual fun sceUsbCamSetupVideo(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    0

public actual fun sceUsbCamSetupVideoEx(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    0

public actual fun sceUsbCamStartVideo(): Int =
    0

public actual fun sceUsbCamStopVideo(): Int =
    0

public actual fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int =
    0

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    0

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    0

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    0

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    0

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    0

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    0

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    0

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    0

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    0

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    0

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    0

public actual fun sceUsbCamGetSaturation(saturation: COpaquePointer?): Int =
    0

public actual fun sceUsbCamGetBrightness(brightness: COpaquePointer?): Int =
    0

public actual fun sceUsbCamGetContrast(contrast: COpaquePointer?): Int =
    0

public actual fun sceUsbCamGetSharpness(sharpness: COpaquePointer?): Int =
    0

public actual fun sceUsbCamGetImageEffectMode(effectMode: COpaquePointer?): Int =
    0

public actual fun sceUsbCamGetEvLevel(exposureLevel: COpaquePointer?): Int =
    0

public actual fun sceUsbCamGetReverseMode(reverseFlags: COpaquePointer?): Int =
    0

public actual fun sceUsbCamGetZoom(zoom: COpaquePointer?): Int =
    0

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    0

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    0

public actual fun sceUsbCamGetLensDirection(): Int =
    0

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    0

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    0

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    0

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    0

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    0

public actual fun scePowerIsPowerOnline(): Int =
    0

public actual fun scePowerIsBatteryExist(): Int =
    0

public actual fun scePowerIsBatteryCharging(): Int =
    0

public actual fun scePowerGetBatteryChargingStatus(): Int =
    0

public actual fun scePowerIsLowBattery(): Int =
    0

public actual fun scePowerGetBatteryLifePercent(): Int =
    0

public actual fun scePowerGetBatteryLifeTime(): Int =
    0

public actual fun scePowerGetBatteryTemp(): Int =
    0

public actual fun scePowerGetBatteryElec(): Int =
    0

public actual fun scePowerGetBatteryVolt(): Int =
    0

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    0

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    0

public actual fun scePowerGetCpuClockFrequency(): Int =
    0

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    0

public actual fun scePowerGetCpuClockFrequencyFloat(): Float =
    0.0f

public actual fun scePowerGetBusClockFrequency(): Int =
    0

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    0

public actual fun scePowerGetBusClockFrequencyFloat(): Float =
    0.0f

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    0

public actual fun scePowerLock(unknown: Int): Int =
    0

public actual fun scePowerUnlock(unknown: Int): Int =
    0

public actual fun scePowerTick(t: PowerTick): Int =
    0

public actual fun scePowerGetIdleTimer(): Int =
    0

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    0

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    0

public actual fun scePowerRequestStandby(): Int =
    0

public actual fun scePowerRequestSuspend(): Int =
    0

public actual fun sceWlanDevIsPowerOn(): Int =
    0

public actual fun sceWlanGetSwitchState(): Int =
    0

public actual fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int =
    0

public actual fun sceWlanDevAttach(): Int =
    0

public actual fun sceWlanDevDetach(): Int =
    0

public actual fun sceRtcGetTickResolution(): UInt =
    0u

public actual fun sceRtcGetCurrentTick(tick: COpaquePointer?): Int =
    0

public actual fun sceRtcGetCurrentClock(tm: COpaquePointer?, tz: Int): Int =
    0

public actual fun sceRtcGetCurrentClockLocalTime(tm: COpaquePointer?): Int =
    0

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: COpaquePointer?, tickLocal: COpaquePointer?): Int =
    0

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: COpaquePointer?, tickUtc: COpaquePointer?): Int =
    0

public actual fun sceRtcIsLeapYear(year: Int): Int =
    0

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    0

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    0

public actual fun sceRtcCheckValid(date: COpaquePointer?): Int =
    0

public actual fun sceRtcSetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    0

public actual fun sceRtcGetTick(date: COpaquePointer?, tick: COpaquePointer?): Int =
    0

public actual fun sceRtcCompareTick(tick1: COpaquePointer?, tick2: COpaquePointer?): Int =
    0

public actual fun sceRtcTickAddTicks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numTicks: ULong): Int =
    0

public actual fun sceRtcTickAddMicroseconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMs: ULong): Int =
    0

public actual fun sceRtcTickAddSeconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numSeconds: ULong): Int =
    0

public actual fun sceRtcTickAddMinutes(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMinutes: ULong): Int =
    0

public actual fun sceRtcTickAddHours(destTick: COpaquePointer?, srcTick: COpaquePointer?, numHours: ULong): Int =
    0

public actual fun sceRtcTickAddDays(destTick: COpaquePointer?, srcTick: COpaquePointer?, numDays: ULong): Int =
    0

public actual fun sceRtcTickAddWeeks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numWeeks: ULong): Int =
    0

public actual fun sceRtcTickAddMonths(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMonths: ULong): Int =
    0

public actual fun sceRtcTickAddYears(destTick: COpaquePointer?, srcTick: COpaquePointer?, numYears: ULong): Int =
    0

public actual fun sceRtcSetTimeT(date: COpaquePointer?, time: UInt): Int =
    0

public actual fun sceRtcGetTimeT(date: COpaquePointer?, time: COpaquePointer?): Int =
    0

public actual fun sceRtcSetTime64T(date: COpaquePointer?, time: ULong): Int =
    0

public actual fun sceRtcGetTime64T(date: COpaquePointer?, time: COpaquePointer?): Int =
    0

public actual fun sceRtcSetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    0

public actual fun sceRtcGetDosTime(date: COpaquePointer?, dosTime: UInt): Int =
    0

public actual fun sceRtcSetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    0

public actual fun sceRtcGetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int =
    0

public actual fun sceRtcParseDateTime(destTick: COpaquePointer?, dateString: COpaquePointer?): Int =
    0

public actual fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    0

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    0

public actual fun sceRtcParseRFC3339(pUtc: COpaquePointer?, pszDateTime: COpaquePointer?): Int =
    0

public actual fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int =
    0

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int =
    0

public actual fun sceIoOpen(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    SceUid()

public actual fun sceIoOpenAsync(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid =
    SceUid()

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
    0

public actual fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int =
    0

public actual fun sceIoRmdir(path: COpaquePointer?): Int =
    0

public actual fun sceIoChdir(path: COpaquePointer?): Int =
    0

public actual fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int =
    0

public actual fun sceIoDopen(dirname: COpaquePointer?): SceUid =
    SceUid()

public actual fun sceIoDread(fd: SceUid, dir: COpaquePointer?): Int =
    0

public actual fun sceIoDclose(fd: SceUid): Int =
    0

public actual fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    0

public actual fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int =
    0

public actual fun sceIoUnassign(dev: COpaquePointer?): Int =
    0

public actual fun sceIoGetstat(file: COpaquePointer?, stat: COpaquePointer?): Int =
    0

public actual fun sceIoChstat(file: COpaquePointer?, stat: COpaquePointer?, bits: Int): Int =
    0

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    0

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    0

public actual fun sceIoSync(device: COpaquePointer?, unk: UInt): Int =
    0

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
    0

public actual fun sceJpegFinishMJpeg(): Int =
    0

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    0

public actual fun sceJpegDeleteMJpeg(): Int =
    0

public actual fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int =
    0

public actual fun sceUmdCheckMedium(): Int =
    0

public actual fun sceUmdGetDiscInfo(info: COpaquePointer?): Int =
    0

public actual fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int =
    0

public actual fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int =
    0

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    0

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    0

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    0

public actual fun sceUmdCancelWaitDriveStat(): Int =
    0

public actual fun sceUmdGetDriveStat(): Int =
    0

public actual fun sceUmdGetErrorStat(): Int =
    0

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    0

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    0

public actual fun sceUmdReplacePermit(): Int =
    0

public actual fun sceUmdReplaceProhibit(): Int =
    0

public actual fun sceMpegInit(): Int =
    0

public actual fun sceMpegFinish() {
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    0

public actual fun sceMpegRingbufferConstruct(ringbuffer: COpaquePointer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int =
    0

public actual fun sceMpegRingbufferDestruct(ringbuffer: COpaquePointer?) {
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: COpaquePointer?): Int =
    0

public actual fun sceMpegRingbufferPut(ringbuffer: COpaquePointer?, numPackets: Int, available: Int): Int =
    0

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    0

public actual fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: COpaquePointer?, frameWidth: Int, unk1: Int, unk2: Int): Int =
    0

public actual fun sceMpegDelete(handle: SceMpeg) {
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: COpaquePointer?): Int =
    0

public actual fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: COpaquePointer?): Int =
    0

public actual fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream =
    SceMpegStream()

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
    0

public actual fun sceMpegBaseCscInit(width: Int): Int =
    0

public actual fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: COpaquePointer?): Int =
    0

public actual fun sceMpegbaseBea18f91(lli: COpaquePointer?): Int =
    0

public actual fun sceHprmPeekCurrentKey(key: COpaquePointer?): Int =
    0

public actual fun sceHprmPeekLatch(latch: COpaquePointer?): Int =
    0

public actual fun sceHprmReadLatch(latch: COpaquePointer?): Int =
    0

public actual fun sceHprmIsHeadphoneExist(): Int =
    0

public actual fun sceHprmIsRemoteExist(): Int =
    0

public actual fun sceHprmIsMicrophoneExist(): Int =
    0

public actual fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    false

public actual fun sceGuDepthFunc(function: DepthFunc) {
}

public actual fun sceGuDepthMask(mask: Int) {
}

public actual fun sceGuDepthOffset(offset: Int) {
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
}

public actual fun sceGuInit() {
}

public actual fun sceGuTerm() {
}

public actual fun sceGuBreak(mode: Int) {
}

public actual fun sceGuContinue() {
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
    null

public actual fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
}

public actual fun sceGuFinish(): Int =
    0

public actual fun sceGuFinishId(id: UInt): Int =
    0

public actual fun sceGuCallList(list: COpaquePointer?) {
}

public actual fun sceGuCallMode(mode: Int) {
}

public actual fun sceGuCheckList(): Int =
    0

public actual fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: COpaquePointer?) {
}

public actual fun sceGuSwapBuffers(): COpaquePointer? =
    null

public actual fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState =
    GeListState.entries.first()

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGuEndObject() {
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    false

public actual fun sceGuSetAllStatus(status: Int) {
}

public actual fun sceGuGetAllStatus(): Int =
    0

public actual fun sceGuEnable(state: GuState) {
}

public actual fun sceGuDisable(state: GuState) {
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
}

public actual fun sceGuLightMode(mode: LightMode) {
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
}

public actual fun sceGuClear(flags: Int) {
}

public actual fun sceGuClearColor(color: UInt) {
}

public actual fun sceGuClearDepth(depth: UInt) {
}

public actual fun sceGuClearStencil(stencil: UInt) {
}

public actual fun sceGuPixelMask(mask: UInt) {
}

public actual fun sceGuColor(color: UInt) {
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
}

public actual fun sceGuColorMaterial(components: Int) {
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
}

public actual fun sceGuAmbient(color: UInt) {
}

public actual fun sceGuAmbientColor(color: UInt) {
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
}

public actual fun sceGuSpecular(power: Float) {
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
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
}

public actual fun sceGuTexFlush() {
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
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
}

public actual fun sceGuTexScale(u: Float, v: Float) {
}

public actual fun sceGuTexSlope(slope: Float) {
}

public actual fun sceGuTexSync() {
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
}

public actual fun sceGumFastInverse() {
}

public actual fun sceGumFullInverse() {
}

public actual fun sceGumLoadIdentity() {
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
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
}

public actual fun sceGumPopMatrix() {
}

public actual fun sceGumPushMatrix() {
}

public actual fun sceGumRotateX(angle: Float) {
}

public actual fun sceGumRotateY(angle: Float) {
}

public actual fun sceGumRotateZ(angle: Float) {
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
}

public actual fun sceMp3ReserveMp3Handle(args: COpaquePointer?): Int =
    0

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    0

public actual fun sceMp3InitResource(): Int =
    0

public actual fun sceMp3TermResource(): Int =
    0

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
    0

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
    0

public actual fun sceOpenPSIDGetOpenPSID(openpsid: COpaquePointer?): Int =
    0

public actual fun sceUtilityMsgDialogInitStart(params: COpaquePointer?): Int =
    0

public actual fun sceUtilityMsgDialogShutdownStart() {
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    0

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    0

public actual fun sceUtilityNetconfInitStart(data: COpaquePointer?): Int =
    0

public actual fun sceUtilityNetconfShutdownStart(): Int =
    0

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    0

public actual fun sceUtilityNetconfGetStatus(): Int =
    0

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    0

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: COpaquePointer?): Int =
    0

public actual fun sceUtilitySavedataInitStart(params: COpaquePointer?): Int =
    0

public actual fun sceUtilitySavedataGetStatus(): Int =
    0

public actual fun sceUtilitySavedataShutdownStart(): Int =
    0

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
}

public actual fun sceUtilityGameSharingInitStart(params: COpaquePointer?): Int =
    0

public actual fun sceUtilityGameSharingShutdownStart() {
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    0

public actual fun sceUtilityGameSharingUpdate(n: Int) {
}

public actual fun sceUtilityHtmlViewerInitStart(params: COpaquePointer?): Int =
    0

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    0

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    0

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    0

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    0

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int =
    0

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: COpaquePointer?): Int =
    0

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int =
    0

public actual fun sceUtilityOskInitStart(params: COpaquePointer?): Int =
    0

public actual fun sceUtilityOskShutdownStart(): Int =
    0

public actual fun sceUtilityOskUpdate(n: Int): Int =
    0

public actual fun sceUtilityOskGetStatus(): Int =
    0

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
    0

public actual fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int =
    0

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    0

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    0

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    0

public actual fun sceNetTerm(): Int =
    0

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    0

public actual fun sceNetThreadAbort(thid: Int): Int =
    0

public actual fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
}

public actual fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
}

public actual fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int =
    0

public actual fun sceNetGetMallocStat(stat: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlTerm(): Int =
    0

public actual fun sceNetAdhocctlConnect(name: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlDisconnect(): Int =
    0

public actual fun sceNetAdhocctlGetState(event: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlCreate(name: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlJoin(scaninfo: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlGetAdhocId(id: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int =
    0

public actual fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int =
    0

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlExitGameMode(): Int =
    0

public actual fun sceNetAdhocctlGetPeerList(length: COpaquePointer?, buf: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlScan(): Int =
    0

public actual fun sceNetAdhocctlGetScanInfo(length: COpaquePointer?, buf: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    0

public actual fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: COpaquePointer?, buf: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocctlGetParameter(params: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocInit(): Int =
    0

public actual fun sceNetAdhocTerm(): Int =
    0

public actual fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int =
    0

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    0

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int =
    0

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: COpaquePointer?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    0

public actual fun sceNetAdhocGetPdpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int =
    0

public actual fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int =
    0

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    0

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    0

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    0

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    0

public actual fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    0

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    0

public actual fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    0

public actual fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    0

public actual fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    0

public actual fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    0

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    0

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    0

public actual fun sceNetAdhocGetPtpStat(size: COpaquePointer?, stat: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    0

public actual fun sceNetAdhocMatchingTerm(): Int =
    0

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    0

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    0

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    0

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: COpaquePointer?, optData: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: COpaquePointer?, buf: COpaquePointer?): Int =
    0

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    0

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: COpaquePointer?): Int =
    0

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    0

public actual fun sceNetApctlTerm(): Int =
    0

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: COpaquePointer?): Int =
    0

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int =
    0

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    0

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    0

public actual fun sceNetApctlDisconnect(): Int =
    0

public actual fun sceNetApctlGetState(pstate: COpaquePointer?): Int =
    0

public actual fun sceNetInetInit(): Int =
    0

public actual fun sceNetInetTerm(): Int =
    0

public actual fun sceNetInetAccept(s: Int, addr: COpaquePointer?, addrLen: COpaquePointer?): Int =
    0

public actual fun sceNetInetBind(s: Int, myAddr: COpaquePointer?, addrLen: SocklenT): Int =
    0

public actual fun sceNetInetConnect(s: Int, servAddr: COpaquePointer?, addrLen: SocklenT): Int =
    0

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: COpaquePointer?): Int =
    0

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    0

public actual fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    0uL

public actual fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: COpaquePointer?, fromLen: COpaquePointer?): ULong =
    0uL

public actual fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    0uL

public actual fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, toLen: SocklenT): ULong =
    0uL

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int =
    0

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    0

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    0

public actual fun sceNetInetClose(s: Int): Int =
    0

public actual fun sceNetInetGetErrno(): Int =
    0

public actual fun sceSslInit(unknown1: Int): Int =
    0

public actual fun sceSslEnd(): Int =
    0

public actual fun sceSslGetUsedMemoryMax(memory: COpaquePointer?): Int =
    0

public actual fun sceSslGetUsedMemoryCurrent(memory: COpaquePointer?): Int =
    0

public actual fun sceHttpInit(unknown1: UInt): Int =
    0

public actual fun sceHttpEnd(): Int =
    0

public actual fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int =
    0

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    0

public actual fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int =
    0

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int =
    0

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    0

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int =
    0

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int =
    0

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    0

public actual fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    0

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    0

public actual fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    0

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: COpaquePointer?): Int =
    0

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: COpaquePointer?): Int =
    0

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    0

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    0

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    0

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    0

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    0

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    0

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    0

public actual fun sceHttpEnableRedirect(id: Int): Int =
    0

public actual fun sceHttpDisableRedirect(id: Int): Int =
    0

public actual fun sceHttpEnableCookie(id: Int): Int =
    0

public actual fun sceHttpDisableCookie(id: Int): Int =
    0

public actual fun sceHttpSaveSystemCookie(): Int =
    0

public actual fun sceHttpLoadSystemCookie(): Int =
    0

public actual fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int =
    0

public actual fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int =
    0

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    0

public actual fun sceHttpsEnd(): Int =
    0

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    0

public actual fun sceHttpDisableAuth(id: Int): Int =
    0

public actual fun sceHttpDisableCache(id: Int): Int =
    0

public actual fun sceHttpEnableAuth(id: Int): Int =
    0

public actual fun sceHttpEnableCache(id: Int): Int =
    0

public actual fun sceHttpEndCache(): Int =
    0

public actual fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: COpaquePointer?): Int =
    0

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: COpaquePointer?): Int =
    0

public actual fun sceHttpGetProxy(id: Int, activateFlag: COpaquePointer?, mode: COpaquePointer?, proxyHost: COpaquePointer?, len: ULong, proxyPort: COpaquePointer?): Int =
    0

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    0

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    0

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int =
    0

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    0

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    0

public actual fun sceNetResolverInit(): Int =
    0

public actual fun sceNetResolverCreate(rid: COpaquePointer?, buf: COpaquePointer?, bufLength: UInt): Int =
    0

public actual fun sceNetResolverDelete(rid: Int): Int =
    0

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: COpaquePointer?, timeout: UInt, retry: Int): Int =
    0

public actual fun sceNetResolverStartAtoN(rid: Int, addr: COpaquePointer?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    0

public actual fun sceNetResolverStop(rid: Int): Int =
    0

public actual fun sceNetResolverTerm(): Int =
    0
