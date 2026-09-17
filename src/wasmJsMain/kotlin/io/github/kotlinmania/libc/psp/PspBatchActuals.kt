// port-lint: source Psp.rs
package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*

public actual fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("sceAudioChReserve requires N-API addon")

public actual fun sceAudioChRelease(channel: Int): Int =
    throw UnsupportedOperationException("sceAudioChRelease requires N-API addon")

public actual fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioOutput requires N-API addon")

public actual fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioOutputBlocking requires N-API addon")

public actual fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioOutputPanned requires N-API addon")

public actual fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioOutputPannedBlocking requires N-API addon")

public actual fun sceAudioGetChannelRestLen(channel: Int): Int =
    throw UnsupportedOperationException("sceAudioGetChannelRestLen requires N-API addon")

public actual fun sceAudioGetChannelRestLength(channel: Int): Int =
    throw UnsupportedOperationException("sceAudioGetChannelRestLength requires N-API addon")

public actual fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int =
    throw UnsupportedOperationException("sceAudioSetChannelDataLen requires N-API addon")

public actual fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int =
    throw UnsupportedOperationException("sceAudioChangeChannelConfig requires N-API addon")

public actual fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int =
    throw UnsupportedOperationException("sceAudioChangeChannelVolume requires N-API addon")

public actual fun sceAudioOutput2Reserve(sampleCount: Int): Int =
    throw UnsupportedOperationException("sceAudioOutput2Reserve requires N-API addon")

public actual fun sceAudioOutput2Release(): Int =
    throw UnsupportedOperationException("sceAudioOutput2Release requires N-API addon")

public actual fun sceAudioOutput2ChangeLength(sampleCount: Int): Int =
    throw UnsupportedOperationException("sceAudioOutput2ChangeLength requires N-API addon")

public actual fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioOutput2OutputBlocking requires N-API addon")

public actual fun sceAudioOutput2GetRestSample(): Int =
    throw UnsupportedOperationException("sceAudioOutput2GetRestSample requires N-API addon")

public actual fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int =
    throw UnsupportedOperationException("sceAudioSRCChReserve requires N-API addon")

public actual fun sceAudioSRCChRelease(): Int =
    throw UnsupportedOperationException("sceAudioSRCChRelease requires N-API addon")

public actual fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceAudioSRCOutputBlocking requires N-API addon")

public actual fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int =
    throw UnsupportedOperationException("sceAudioInputInit requires N-API addon")

public actual fun sceAudioInputInitEx(params: AudioInputParams?): Int =
    throw UnsupportedOperationException("sceAudioInputInitEx requires N-API addon")

public actual fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    throw UnsupportedOperationException("sceAudioInputBlocking requires N-API addon")
}

public actual fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    throw UnsupportedOperationException("sceAudioInput requires N-API addon")
}

public actual fun sceAudioGetInputLength(): Int =
    throw UnsupportedOperationException("sceAudioGetInputLength requires N-API addon")

public actual fun sceAudioWaitInputEnd(): Int =
    throw UnsupportedOperationException("sceAudioWaitInputEnd requires N-API addon")

public actual fun sceAudioPollInputEnd(): Int =
    throw UnsupportedOperationException("sceAudioPollInputEnd requires N-API addon")

public actual fun sceAtracGetAtracID(uiCodecType: UInt): Int =
    throw UnsupportedOperationException("sceAtracGetAtracID requires N-API addon")

public actual fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int =
    throw UnsupportedOperationException("sceAtracSetDataAndGetID requires N-API addon")

public actual fun sceAtracDecodeData(atracId: Int, outSamples: UShort?, outN: Int?, outEnd: Int?, outRemainFrame: Int?): Int =
    throw UnsupportedOperationException("sceAtracDecodeData requires N-API addon")

public actual fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetRemainFrame requires N-API addon")

public actual fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: UInt?, readOffset: UInt?): Int =
    throw UnsupportedOperationException("sceAtracGetStreamDataInfo requires N-API addon")

public actual fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int =
    throw UnsupportedOperationException("sceAtracAddStreamData requires N-API addon")

public actual fun sceAtracGetBitrate(atracId: Int, outBitrate: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetBitrate requires N-API addon")

public actual fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int =
    throw UnsupportedOperationException("sceAtracSetLoopNum requires N-API addon")

public actual fun sceAtracReleaseAtracID(atracId: Int): Int =
    throw UnsupportedOperationException("sceAtracReleaseAtracID requires N-API addon")

public actual fun sceAtracGetNextSample(atracId: Int, outN: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetNextSample requires N-API addon")

public actual fun sceAtracGetMaxSample(atracId: Int, outMax: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetMaxSample requires N-API addon")

public actual fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: Atrac3BufferInfo?): Int =
    throw UnsupportedOperationException("sceAtracGetBufferInfoForReseting requires N-API addon")

public actual fun sceAtracGetChannel(atracId: Int, puiChannel: UInt?): Int =
    throw UnsupportedOperationException("sceAtracGetChannel requires N-API addon")

public actual fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetInternalErrorInfo requires N-API addon")

public actual fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: Int?, puiLoopStatus: UInt?): Int =
    throw UnsupportedOperationException("sceAtracGetLoopStatus requires N-API addon")

public actual fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: UInt?): Int =
    throw UnsupportedOperationException("sceAtracGetNextDecodePosition requires N-API addon")

public actual fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: UInt?, puiDataByte: UInt?): Int =
    throw UnsupportedOperationException("sceAtracGetSecondBufferInfo requires N-API addon")

public actual fun sceAtracGetSoundSample(atracId: Int, piEndSample: Int?, piLoopStartSample: Int?, piLoopEndSample: Int?): Int =
    throw UnsupportedOperationException("sceAtracGetSoundSample requires N-API addon")

public actual fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int =
    throw UnsupportedOperationException("sceAtracResetPlayPosition requires N-API addon")

public actual fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("sceAtracSetData requires N-API addon")

public actual fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("sceAtracSetHalfwayBuffer requires N-API addon")

public actual fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int =
    throw UnsupportedOperationException("sceAtracSetHalfwayBufferAndGetID requires N-API addon")

public actual fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int =
    throw UnsupportedOperationException("sceAtracSetSecondBuffer requires N-API addon")

public actual fun sceCtrlSetSamplingCycle(cycle: Int): Int =
    throw UnsupportedOperationException("sceCtrlSetSamplingCycle requires N-API addon")

public actual fun sceCtrlGetSamplingCycle(pcycle: Int?): Int =
    throw UnsupportedOperationException("sceCtrlGetSamplingCycle requires N-API addon")

public actual fun sceCtrlSetSamplingMode(mode: CtrlMode): Int =
    throw UnsupportedOperationException("sceCtrlSetSamplingMode requires N-API addon")

public actual fun sceCtrlGetSamplingMode(pmode: Int?): Int =
    throw UnsupportedOperationException("sceCtrlGetSamplingMode requires N-API addon")

public actual fun sceCtrlPeekBufferPositive(padData: SceCtrlData?, count: Int): Int =
    throw UnsupportedOperationException("sceCtrlPeekBufferPositive requires N-API addon")

public actual fun sceCtrlPeekBufferNegative(padData: SceCtrlData?, count: Int): Int =
    throw UnsupportedOperationException("sceCtrlPeekBufferNegative requires N-API addon")

public actual fun sceCtrlReadBufferPositive(padData: SceCtrlData?, count: Int): Int =
    throw UnsupportedOperationException("sceCtrlReadBufferPositive requires N-API addon")

public actual fun sceCtrlReadBufferNegative(padData: SceCtrlData?, count: Int): Int =
    throw UnsupportedOperationException("sceCtrlReadBufferNegative requires N-API addon")

public actual fun sceCtrlPeekLatch(latchData: SceCtrlLatch?): Int =
    throw UnsupportedOperationException("sceCtrlPeekLatch requires N-API addon")

public actual fun sceCtrlReadLatch(latchData: SceCtrlLatch?): Int =
    throw UnsupportedOperationException("sceCtrlReadLatch requires N-API addon")

public actual fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int =
    throw UnsupportedOperationException("sceCtrlSetIdleCancelThreshold requires N-API addon")

public actual fun sceCtrlGetIdleCancelThreshold(idlereset: Int?, idleback: Int?): Int =
    throw UnsupportedOperationException("sceCtrlGetIdleCancelThreshold requires N-API addon")

public actual fun sceDisplayGetMode(pmode: Int?, pwidth: Int?, pheight: Int?): Int =
    throw UnsupportedOperationException("sceDisplayGetMode requires N-API addon")

public actual fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong?, pixelFormat: DisplayPixelFormat?, sync: DisplaySetBufSync): Int =
    throw UnsupportedOperationException("sceDisplayGetFrameBuf requires N-API addon")

public actual fun sceDisplayWaitVblank(): Int =
    throw UnsupportedOperationException("sceDisplayWaitVblank requires N-API addon")

public actual fun sceDisplayWaitVblankCB(): Int =
    throw UnsupportedOperationException("sceDisplayWaitVblankCB requires N-API addon")

public actual fun sceDisplayWaitVblankStart(): Int =
    throw UnsupportedOperationException("sceDisplayWaitVblankStart requires N-API addon")

public actual fun sceDisplayWaitVblankStartCB(): Int =
    throw UnsupportedOperationException("sceDisplayWaitVblankStartCB requires N-API addon")

public actual fun sceDisplayGetAccumulatedHcount(): Int =
    throw UnsupportedOperationException("sceDisplayGetAccumulatedHcount requires N-API addon")

public actual fun sceDisplayGetCurrentHcount(): Int =
    throw UnsupportedOperationException("sceDisplayGetCurrentHcount requires N-API addon")

public actual fun sceDisplayIsForeground(): Int =
    throw UnsupportedOperationException("sceDisplayIsForeground requires N-API addon")

public actual fun sceDisplayIsVblank(): Int =
    throw UnsupportedOperationException("sceDisplayIsVblank requires N-API addon")

public actual fun sceGeEdramGetAddr(): COpaquePointer? =
    throw UnsupportedOperationException("sceGeEdramGetAddr requires N-API addon")

public actual fun sceGeEdramSetAddrTranslation(width: Int): Int =
    throw UnsupportedOperationException("sceGeEdramSetAddrTranslation requires N-API addon")

public actual fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceGeGetMtx requires N-API addon")

public actual fun sceGeGetStack(stackId: Int, stack: GeStack?): Int =
    throw UnsupportedOperationException("sceGeGetStack requires N-API addon")

public actual fun sceGeSaveContext(context: GeContext?): Int =
    throw UnsupportedOperationException("sceGeSaveContext requires N-API addon")

public actual fun sceGeRestoreContext(context: GeContext?): Int =
    throw UnsupportedOperationException("sceGeRestoreContext requires N-API addon")

public actual fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int =
    throw UnsupportedOperationException("sceGeListEnQueue requires N-API addon")

public actual fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int =
    throw UnsupportedOperationException("sceGeListEnQueueHead requires N-API addon")

public actual fun sceGeListDeQueue(qid: Int): Int =
    throw UnsupportedOperationException("sceGeListDeQueue requires N-API addon")

public actual fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceGeListUpdateStallAddr requires N-API addon")

public actual fun sceGeBreak(mode: Int, pParam: GeBreakParam?): Int =
    throw UnsupportedOperationException("sceGeBreak requires N-API addon")

public actual fun sceGeContinue(): Int =
    throw UnsupportedOperationException("sceGeContinue requires N-API addon")

public actual fun sceGeSetCallback(cb: GeCallbackData?): Int =
    throw UnsupportedOperationException("sceGeSetCallback requires N-API addon")

public actual fun sceGeUnsetCallback(cbid: Int): Int =
    throw UnsupportedOperationException("sceGeUnsetCallback requires N-API addon")

public actual fun sceKernelExitGame() {
    throw UnsupportedOperationException("sceKernelExitGame requires N-API addon")
}

public actual fun sceKernelRegisterExitCallback(id: SceUid): Int =
    throw UnsupportedOperationException("sceKernelRegisterExitCallback requires N-API addon")

public actual fun sceKernelLoadExec(file: COpaquePointer?, param: SceKernelLoadExecParam?): Int =
    throw UnsupportedOperationException("sceKernelLoadExec requires N-API addon")

public actual fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? =
    throw UnsupportedOperationException("sceKernelGetBlockHeadAddr requires N-API addon")

public actual fun sceKernelFreePartitionMemory(blockid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelFreePartitionMemory requires N-API addon")

public actual fun sceKernelTotalFreeMemSize(): ULong =
    throw UnsupportedOperationException("sceKernelTotalFreeMemSize requires N-API addon")

public actual fun sceKernelMaxFreeMemSize(): ULong =
    throw UnsupportedOperationException("sceKernelMaxFreeMemSize requires N-API addon")

public actual fun sceKernelSetCompiledSdkVersion(version: UInt): Int =
    throw UnsupportedOperationException("sceKernelSetCompiledSdkVersion requires N-API addon")

public actual fun sceKernelLibcTime(t: Int?): Int =
    throw UnsupportedOperationException("sceKernelLibcTime requires N-API addon")

public actual fun sceKernelLibcGettimeofday(tp: Timeval?, tzp: Timezone?): Int =
    throw UnsupportedOperationException("sceKernelLibcGettimeofday requires N-API addon")

public actual fun sceKernelDcacheWritebackAll() {
    throw UnsupportedOperationException("sceKernelDcacheWritebackAll requires N-API addon")
}

public actual fun sceKernelDcacheWritebackInvalidateAll() {
    throw UnsupportedOperationException("sceKernelDcacheWritebackInvalidateAll requires N-API addon")
}

public actual fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("sceKernelDcacheWritebackRange requires N-API addon")
}

public actual fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("sceKernelDcacheWritebackInvalidateRange requires N-API addon")
}

public actual fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("sceKernelDcacheInvalidateRange requires N-API addon")
}

public actual fun sceKernelIcacheInvalidateAll() {
    throw UnsupportedOperationException("sceKernelIcacheInvalidateAll requires N-API addon")
}

public actual fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    throw UnsupportedOperationException("sceKernelIcacheInvalidateRange requires N-API addon")
}

public actual fun sceKernelUtilsMt19937Init(ctx: SceKernelUtilsMt19937Context?, seed: UInt): Int =
    throw UnsupportedOperationException("sceKernelUtilsMt19937Init requires N-API addon")

public actual fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelUtilsMd5Digest requires N-API addon")

public actual fun sceKernelUtilsMd5BlockInit(ctx: SceKernelUtilsMd5Context?): Int =
    throw UnsupportedOperationException("sceKernelUtilsMd5BlockInit requires N-API addon")

public actual fun sceKernelUtilsMd5BlockUpdate(ctx: SceKernelUtilsMd5Context?, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("sceKernelUtilsMd5BlockUpdate requires N-API addon")

public actual fun sceKernelUtilsMd5BlockResult(ctx: SceKernelUtilsMd5Context?, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelUtilsMd5BlockResult requires N-API addon")

public actual fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelUtilsSha1Digest requires N-API addon")

public actual fun sceKernelUtilsSha1BlockInit(ctx: SceKernelUtilsSha1Context?): Int =
    throw UnsupportedOperationException("sceKernelUtilsSha1BlockInit requires N-API addon")

public actual fun sceKernelUtilsSha1BlockUpdate(ctx: SceKernelUtilsSha1Context?, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("sceKernelUtilsSha1BlockUpdate requires N-API addon")

public actual fun sceKernelUtilsSha1BlockResult(ctx: SceKernelUtilsSha1Context?, digest: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelUtilsSha1BlockResult requires N-API addon")

public actual fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelRegisterSubIntrHandler requires N-API addon")

public actual fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int =
    throw UnsupportedOperationException("sceKernelReleaseSubIntrHandler requires N-API addon")

public actual fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int =
    throw UnsupportedOperationException("sceKernelEnableSubIntr requires N-API addon")

public actual fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int =
    throw UnsupportedOperationException("sceKernelDisableSubIntr requires N-API addon")

public actual fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: IntrHandlerOptionParam?): Int =
    throw UnsupportedOperationException("queryIntrHandlerInfo requires N-API addon")

public actual fun sceKernelCpuResumeIntr(flags: UInt) {
    throw UnsupportedOperationException("sceKernelCpuResumeIntr requires N-API addon")
}

public actual fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    throw UnsupportedOperationException("sceKernelCpuResumeIntrWithSync requires N-API addon")
}

public actual fun sceKernelIsCpuIntrSuspended(flags: UInt): Int =
    throw UnsupportedOperationException("sceKernelIsCpuIntrSuspended requires N-API addon")

public actual fun sceKernelIsCpuIntrEnable(): Int =
    throw UnsupportedOperationException("sceKernelIsCpuIntrEnable requires N-API addon")

public actual fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    throw UnsupportedOperationException("sceKernelStartModule requires N-API addon")

public actual fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    throw UnsupportedOperationException("sceKernelStopModule requires N-API addon")

public actual fun sceKernelUnloadModule(modId: SceUid): Int =
    throw UnsupportedOperationException("sceKernelUnloadModule requires N-API addon")

public actual fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelSelfStopUnloadModule requires N-API addon")

public actual fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int =
    throw UnsupportedOperationException("sceKernelStopUnloadSelfModule requires N-API addon")

public actual fun sceKernelQueryModuleInfo(modId: SceUid, info: SceKernelModuleInfo?): Int =
    throw UnsupportedOperationException("sceKernelQueryModuleInfo requires N-API addon")

public actual fun sceKernelGetModuleIdList(readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int =
    throw UnsupportedOperationException("sceKernelGetModuleIdList requires N-API addon")

public actual fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int =
    throw UnsupportedOperationException("sceKernelVolatileMemLock requires N-API addon")

public actual fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int =
    throw UnsupportedOperationException("sceKernelVolatileMemTryLock requires N-API addon")

public actual fun sceKernelVolatileMemUnlock(unk: Int): Int =
    throw UnsupportedOperationException("sceKernelVolatileMemUnlock requires N-API addon")

public actual fun sceKernelDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteThread requires N-API addon")

public actual fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelStartThread requires N-API addon")

public actual fun sceKernelExitThread(status: Int): Int =
    throw UnsupportedOperationException("sceKernelExitThread requires N-API addon")

public actual fun sceKernelExitDeleteThread(status: Int): Int =
    throw UnsupportedOperationException("sceKernelExitDeleteThread requires N-API addon")

public actual fun sceKernelTerminateThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelTerminateThread requires N-API addon")

public actual fun sceKernelTerminateDeleteThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelTerminateDeleteThread requires N-API addon")

public actual fun sceKernelSuspendDispatchThread(): Int =
    throw UnsupportedOperationException("sceKernelSuspendDispatchThread requires N-API addon")

public actual fun sceKernelResumeDispatchThread(state: Int): Int =
    throw UnsupportedOperationException("sceKernelResumeDispatchThread requires N-API addon")

public actual fun sceKernelSleepThread(): Int =
    throw UnsupportedOperationException("sceKernelSleepThread requires N-API addon")

public actual fun sceKernelSleepThreadCB(): Int =
    throw UnsupportedOperationException("sceKernelSleepThreadCB requires N-API addon")

public actual fun sceKernelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelWakeupThread requires N-API addon")

public actual fun sceKernelCancelWakeupThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelCancelWakeupThread requires N-API addon")

public actual fun sceKernelSuspendThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelSuspendThread requires N-API addon")

public actual fun sceKernelResumeThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelResumeThread requires N-API addon")

public actual fun sceKernelWaitThreadEnd(thid: SceUid, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitThreadEnd requires N-API addon")

public actual fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitThreadEndCB requires N-API addon")

public actual fun sceKernelDelayThread(delay: UInt): Int =
    throw UnsupportedOperationException("sceKernelDelayThread requires N-API addon")

public actual fun sceKernelDelayThreadCB(delay: UInt): Int =
    throw UnsupportedOperationException("sceKernelDelayThreadCB requires N-API addon")

public actual fun sceKernelDelaySysClockThread(delay: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelDelaySysClockThread requires N-API addon")

public actual fun sceKernelDelaySysClockThreadCB(delay: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelDelaySysClockThreadCB requires N-API addon")

public actual fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int =
    throw UnsupportedOperationException("sceKernelChangeCurrentThreadAttr requires N-API addon")

public actual fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int =
    throw UnsupportedOperationException("sceKernelChangeThreadPriority requires N-API addon")

public actual fun sceKernelRotateThreadReadyQueue(priority: Int): Int =
    throw UnsupportedOperationException("sceKernelRotateThreadReadyQueue requires N-API addon")

public actual fun sceKernelReleaseWaitThread(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelReleaseWaitThread requires N-API addon")

public actual fun sceKernelGetThreadId(): Int =
    throw UnsupportedOperationException("sceKernelGetThreadId requires N-API addon")

public actual fun sceKernelGetThreadCurrentPriority(): Int =
    throw UnsupportedOperationException("sceKernelGetThreadCurrentPriority requires N-API addon")

public actual fun sceKernelGetThreadExitStatus(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelGetThreadExitStatus requires N-API addon")

public actual fun sceKernelCheckThreadStack(): Int =
    throw UnsupportedOperationException("sceKernelCheckThreadStack requires N-API addon")

public actual fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelGetThreadStackFreeSize requires N-API addon")

public actual fun sceKernelReferThreadStatus(thid: SceUid, info: SceKernelThreadInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferThreadStatus requires N-API addon")

public actual fun sceKernelReferThreadRunStatus(thid: SceUid, status: SceKernelThreadRunStatus?): Int =
    throw UnsupportedOperationException("sceKernelReferThreadRunStatus requires N-API addon")

public actual fun sceKernelDeleteSema(semaId: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteSema requires N-API addon")

public actual fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("sceKernelSignalSema requires N-API addon")

public actual fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitSema requires N-API addon")

public actual fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitSemaCB requires N-API addon")

public actual fun sceKernelPollSema(semaId: SceUid, signal: Int): Int =
    throw UnsupportedOperationException("sceKernelPollSema requires N-API addon")

public actual fun sceKernelReferSemaStatus(semaId: SceUid, info: SceKernelSemaInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferSemaStatus requires N-API addon")

public actual fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("sceKernelSetEventFlag requires N-API addon")

public actual fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int =
    throw UnsupportedOperationException("sceKernelClearEventFlag requires N-API addon")

public actual fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?): Int =
    throw UnsupportedOperationException("sceKernelPollEventFlag requires N-API addon")

public actual fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitEventFlag requires N-API addon")

public actual fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelWaitEventFlagCB requires N-API addon")

public actual fun sceKernelDeleteEventFlag(evId: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteEventFlag requires N-API addon")

public actual fun sceKernelReferEventFlagStatus(event: SceUid, status: SceKernelEventFlagInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferEventFlagStatus requires N-API addon")

public actual fun sceKernelDeleteMbx(mbxId: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteMbx requires N-API addon")

public actual fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelSendMbx requires N-API addon")

public actual fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelReceiveMbx requires N-API addon")

public actual fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelReceiveMbxCB requires N-API addon")

public actual fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelPollMbx requires N-API addon")

public actual fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: Int?): Int =
    throw UnsupportedOperationException("sceKernelCancelReceiveMbx requires N-API addon")

public actual fun sceKernelReferMbxStatus(mbxId: SceUid, info: SceKernelMbxInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferMbxStatus requires N-API addon")

public actual fun sceKernelCancelAlarm(alarmId: SceUid): Int =
    throw UnsupportedOperationException("sceKernelCancelAlarm requires N-API addon")

public actual fun sceKernelReferAlarmStatus(alarmId: SceUid, info: SceKernelAlarmInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferAlarmStatus requires N-API addon")

public actual fun sceKernelReferCallbackStatus(cb: SceUid, status: SceKernelCallbackInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferCallbackStatus requires N-API addon")

public actual fun sceKernelDeleteCallback(cb: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteCallback requires N-API addon")

public actual fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int =
    throw UnsupportedOperationException("sceKernelNotifyCallback requires N-API addon")

public actual fun sceKernelCancelCallback(cb: SceUid): Int =
    throw UnsupportedOperationException("sceKernelCancelCallback requires N-API addon")

public actual fun sceKernelGetCallbackCount(cb: SceUid): Int =
    throw UnsupportedOperationException("sceKernelGetCallbackCount requires N-API addon")

public actual fun sceKernelCheckCallback(): Int =
    throw UnsupportedOperationException("sceKernelCheckCallback requires N-API addon")

public actual fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int =
    throw UnsupportedOperationException("sceKernelGetThreadmanIdList requires N-API addon")

public actual fun sceKernelReferSystemStatus(status: SceKernelSystemStatus?): Int =
    throw UnsupportedOperationException("sceKernelReferSystemStatus requires N-API addon")

public actual fun sceKernelDeleteMsgPipe(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteMsgPipe requires N-API addon")

public actual fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelSendMsgPipe requires N-API addon")

public actual fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelSendMsgPipeCB requires N-API addon")

public actual fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelTrySendMsgPipe requires N-API addon")

public actual fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelReceiveMsgPipe requires N-API addon")

public actual fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelReceiveMsgPipeCB requires N-API addon")

public actual fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelTryReceiveMsgPipe requires N-API addon")

public actual fun sceKernelCancelMsgPipe(uid: SceUid, send: Int?, recv: Int?): Int =
    throw UnsupportedOperationException("sceKernelCancelMsgPipe requires N-API addon")

public actual fun sceKernelReferMsgPipeStatus(uid: SceUid, info: SceKernelMppInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferMsgPipeStatus requires N-API addon")

public actual fun sceKernelDeleteVpl(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteVpl requires N-API addon")

public actual fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelAllocateVpl requires N-API addon")

public actual fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelAllocateVplCB requires N-API addon")

public actual fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelTryAllocateVpl requires N-API addon")

public actual fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelFreeVpl requires N-API addon")

public actual fun sceKernelCancelVpl(uid: SceUid, num: Int?): Int =
    throw UnsupportedOperationException("sceKernelCancelVpl requires N-API addon")

public actual fun sceKernelReferVplStatus(uid: SceUid, info: SceKernelVplInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferVplStatus requires N-API addon")

public actual fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: SceKernelFplOptParam?): Int =
    throw UnsupportedOperationException("sceKernelCreateFpl requires N-API addon")

public actual fun sceKernelDeleteFpl(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteFpl requires N-API addon")

public actual fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelAllocateFpl requires N-API addon")

public actual fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int =
    throw UnsupportedOperationException("sceKernelAllocateFplCB requires N-API addon")

public actual fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelTryAllocateFpl requires N-API addon")

public actual fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelFreeFpl requires N-API addon")

public actual fun sceKernelCancelFpl(uid: SceUid, pnum: Int?): Int =
    throw UnsupportedOperationException("sceKernelCancelFpl requires N-API addon")

public actual fun sceKernelReferFplStatus(uid: SceUid, info: SceKernelFplInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferFplStatus requires N-API addon")

public actual fun sceKernelUSec2SysClock(usec: UInt, clock: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelUSec2SysClock requires N-API addon")

public actual fun sceKernelUSec2SysClockWide(usec: UInt): Long =
    throw UnsupportedOperationException("sceKernelUSec2SysClockWide requires N-API addon")

public actual fun sceKernelSysClock2USec(clock: SceKernelSysClock?, low: UInt?, high: UInt?): Int =
    throw UnsupportedOperationException("sceKernelSysClock2USec requires N-API addon")

public actual fun sceKernelSysClock2USecWide(clock: Long, low: UInt?, high: UInt?): Int =
    throw UnsupportedOperationException("sceKernelSysClock2USecWide requires N-API addon")

public actual fun sceKernelGetSystemTime(time: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelGetSystemTime requires N-API addon")

public actual fun sceKernelGetSystemTimeWide(): Long =
    throw UnsupportedOperationException("sceKernelGetSystemTimeWide requires N-API addon")

public actual fun sceKernelDeleteVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelDeleteVTimer requires N-API addon")

public actual fun sceKernelGetVTimerBase(uid: SceUid, base: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelGetVTimerBase requires N-API addon")

public actual fun sceKernelGetVTimerBaseWide(uid: SceUid): Long =
    throw UnsupportedOperationException("sceKernelGetVTimerBaseWide requires N-API addon")

public actual fun sceKernelGetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelGetVTimerTime requires N-API addon")

public actual fun sceKernelGetVTimerTimeWide(uid: SceUid): Long =
    throw UnsupportedOperationException("sceKernelGetVTimerTimeWide requires N-API addon")

public actual fun sceKernelSetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int =
    throw UnsupportedOperationException("sceKernelSetVTimerTime requires N-API addon")

public actual fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long =
    throw UnsupportedOperationException("sceKernelSetVTimerTimeWide requires N-API addon")

public actual fun sceKernelStartVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelStartVTimer requires N-API addon")

public actual fun sceKernelStopVTimer(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelStopVTimer requires N-API addon")

public actual fun sceKernelSetVTimerHandler(uid: SceUid, time: SceKernelSysClock?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelSetVTimerHandler requires N-API addon")

public actual fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceKernelSetVTimerHandlerWide requires N-API addon")

public actual fun sceKernelCancelVTimerHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelCancelVTimerHandler requires N-API addon")

public actual fun sceKernelReferVTimerStatus(uid: SceUid, info: SceKernelVTimerInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferVTimerStatus requires N-API addon")

public actual fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int =
    throw UnsupportedOperationException("sceKernelReleaseThreadEventHandler requires N-API addon")

public actual fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: SceKernelThreadEventHandlerInfo?): Int =
    throw UnsupportedOperationException("sceKernelReferThreadEventHandlerStatus requires N-API addon")

public actual fun sceKernelReferThreadProfiler(): DebugProfilerRegs? =
    throw UnsupportedOperationException("sceKernelReferThreadProfiler requires N-API addon")

public actual fun sceKernelReferGlobalProfiler(): DebugProfilerRegs? =
    throw UnsupportedOperationException("sceKernelReferGlobalProfiler requires N-API addon")

public actual fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUsbStart requires N-API addon")

public actual fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUsbStop requires N-API addon")

public actual fun sceUsbActivate(pid: UInt): Int =
    throw UnsupportedOperationException("sceUsbActivate requires N-API addon")

public actual fun sceUsbDeactivate(pid: UInt): Int =
    throw UnsupportedOperationException("sceUsbDeactivate requires N-API addon")

public actual fun sceUsbGetState(): Int =
    throw UnsupportedOperationException("sceUsbGetState requires N-API addon")

public actual fun sceUsbGetDrvState(driverName: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUsbGetDrvState requires N-API addon")

public actual fun sceUsbCamSetupStill(param: UsbCamSetupStillParam?): Int =
    throw UnsupportedOperationException("sceUsbCamSetupStill requires N-API addon")

public actual fun sceUsbCamSetupStillEx(param: UsbCamSetupStillExParam?): Int =
    throw UnsupportedOperationException("sceUsbCamSetupStillEx requires N-API addon")

public actual fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceUsbCamStillInputBlocking requires N-API addon")

public actual fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceUsbCamStillInput requires N-API addon")

public actual fun sceUsbCamStillWaitInputEnd(): Int =
    throw UnsupportedOperationException("sceUsbCamStillWaitInputEnd requires N-API addon")

public actual fun sceUsbCamStillPollInputEnd(): Int =
    throw UnsupportedOperationException("sceUsbCamStillPollInputEnd requires N-API addon")

public actual fun sceUsbCamStillCancelInput(): Int =
    throw UnsupportedOperationException("sceUsbCamStillCancelInput requires N-API addon")

public actual fun sceUsbCamStillGetInputLength(): Int =
    throw UnsupportedOperationException("sceUsbCamStillGetInputLength requires N-API addon")

public actual fun sceUsbCamSetupVideo(param: UsbCamSetupVideoParam?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetupVideo requires N-API addon")

public actual fun sceUsbCamSetupVideoEx(param: UsbCamSetupVideoExParam?, workArea: COpaquePointer?, workAreaSize: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetupVideoEx requires N-API addon")

public actual fun sceUsbCamStartVideo(): Int =
    throw UnsupportedOperationException("sceUsbCamStartVideo requires N-API addon")

public actual fun sceUsbCamStopVideo(): Int =
    throw UnsupportedOperationException("sceUsbCamStopVideo requires N-API addon")

public actual fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceUsbCamReadVideoFrameBlocking requires N-API addon")

public actual fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceUsbCamReadVideoFrame requires N-API addon")

public actual fun sceUsbCamWaitReadVideoFrameEnd(): Int =
    throw UnsupportedOperationException("sceUsbCamWaitReadVideoFrameEnd requires N-API addon")

public actual fun sceUsbCamPollReadVideoFrameEnd(): Int =
    throw UnsupportedOperationException("sceUsbCamPollReadVideoFrameEnd requires N-API addon")

public actual fun sceUsbCamGetReadVideoFrameSize(): Int =
    throw UnsupportedOperationException("sceUsbCamGetReadVideoFrameSize requires N-API addon")

public actual fun sceUsbCamSetSaturation(saturation: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetSaturation requires N-API addon")

public actual fun sceUsbCamSetBrightness(brightness: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetBrightness requires N-API addon")

public actual fun sceUsbCamSetContrast(contrast: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetContrast requires N-API addon")

public actual fun sceUsbCamSetSharpness(sharpness: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetSharpness requires N-API addon")

public actual fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int =
    throw UnsupportedOperationException("sceUsbCamSetImageEffectMode requires N-API addon")

public actual fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int =
    throw UnsupportedOperationException("sceUsbCamSetEvLevel requires N-API addon")

public actual fun sceUsbCamSetReverseMode(reverseFlags: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetReverseMode requires N-API addon")

public actual fun sceUsbCamSetZoom(zoom: Int): Int =
    throw UnsupportedOperationException("sceUsbCamSetZoom requires N-API addon")

public actual fun sceUsbCamGetSaturation(saturation: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetSaturation requires N-API addon")

public actual fun sceUsbCamGetBrightness(brightness: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetBrightness requires N-API addon")

public actual fun sceUsbCamGetContrast(contrast: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetContrast requires N-API addon")

public actual fun sceUsbCamGetSharpness(sharpness: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetSharpness requires N-API addon")

public actual fun sceUsbCamGetImageEffectMode(effectMode: UsbCamEffectMode?): Int =
    throw UnsupportedOperationException("sceUsbCamGetImageEffectMode requires N-API addon")

public actual fun sceUsbCamGetEvLevel(exposureLevel: UsbCamEvLevel?): Int =
    throw UnsupportedOperationException("sceUsbCamGetEvLevel requires N-API addon")

public actual fun sceUsbCamGetReverseMode(reverseFlags: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetReverseMode requires N-API addon")

public actual fun sceUsbCamGetZoom(zoom: Int?): Int =
    throw UnsupportedOperationException("sceUsbCamGetZoom requires N-API addon")

public actual fun sceUsbCamAutoImageReverseSW(on: Int): Int =
    throw UnsupportedOperationException("sceUsbCamAutoImageReverseSW requires N-API addon")

public actual fun sceUsbCamGetAutoImageReverseState(): Int =
    throw UnsupportedOperationException("sceUsbCamGetAutoImageReverseState requires N-API addon")

public actual fun sceUsbCamGetLensDirection(): Int =
    throw UnsupportedOperationException("sceUsbCamGetLensDirection requires N-API addon")

public actual fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int =
    throw UnsupportedOperationException("sceUsbstorBootRegisterNotify requires N-API addon")

public actual fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int =
    throw UnsupportedOperationException("sceUsbstorBootUnregisterNotify requires N-API addon")

public actual fun sceUsbstorBootSetCapacity(size: UInt): Int =
    throw UnsupportedOperationException("sceUsbstorBootSetCapacity requires N-API addon")

public actual fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int =
    throw UnsupportedOperationException("scePowerRegisterCallback requires N-API addon")

public actual fun scePowerUnregisterCallback(slot: Int): Int =
    throw UnsupportedOperationException("scePowerUnregisterCallback requires N-API addon")

public actual fun scePowerIsPowerOnline(): Int =
    throw UnsupportedOperationException("scePowerIsPowerOnline requires N-API addon")

public actual fun scePowerIsBatteryExist(): Int =
    throw UnsupportedOperationException("scePowerIsBatteryExist requires N-API addon")

public actual fun scePowerIsBatteryCharging(): Int =
    throw UnsupportedOperationException("scePowerIsBatteryCharging requires N-API addon")

public actual fun scePowerGetBatteryChargingStatus(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryChargingStatus requires N-API addon")

public actual fun scePowerIsLowBattery(): Int =
    throw UnsupportedOperationException("scePowerIsLowBattery requires N-API addon")

public actual fun scePowerGetBatteryLifePercent(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryLifePercent requires N-API addon")

public actual fun scePowerGetBatteryLifeTime(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryLifeTime requires N-API addon")

public actual fun scePowerGetBatteryTemp(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryTemp requires N-API addon")

public actual fun scePowerGetBatteryElec(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryElec requires N-API addon")

public actual fun scePowerGetBatteryVolt(): Int =
    throw UnsupportedOperationException("scePowerGetBatteryVolt requires N-API addon")

public actual fun scePowerSetCpuClockFrequency(cpufreq: Int): Int =
    throw UnsupportedOperationException("scePowerSetCpuClockFrequency requires N-API addon")

public actual fun scePowerSetBusClockFrequency(busfreq: Int): Int =
    throw UnsupportedOperationException("scePowerSetBusClockFrequency requires N-API addon")

public actual fun scePowerGetCpuClockFrequency(): Int =
    throw UnsupportedOperationException("scePowerGetCpuClockFrequency requires N-API addon")

public actual fun scePowerGetCpuClockFrequencyInt(): Int =
    throw UnsupportedOperationException("scePowerGetCpuClockFrequencyInt requires N-API addon")

public actual fun scePowerGetBusClockFrequency(): Int =
    throw UnsupportedOperationException("scePowerGetBusClockFrequency requires N-API addon")

public actual fun scePowerGetBusClockFrequencyInt(): Int =
    throw UnsupportedOperationException("scePowerGetBusClockFrequencyInt requires N-API addon")

public actual fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int =
    throw UnsupportedOperationException("scePowerSetClockFrequency requires N-API addon")

public actual fun scePowerLock(unknown: Int): Int =
    throw UnsupportedOperationException("scePowerLock requires N-API addon")

public actual fun scePowerUnlock(unknown: Int): Int =
    throw UnsupportedOperationException("scePowerUnlock requires N-API addon")

public actual fun scePowerTick(t: PowerTick): Int =
    throw UnsupportedOperationException("scePowerTick requires N-API addon")

public actual fun scePowerGetIdleTimer(): Int =
    throw UnsupportedOperationException("scePowerGetIdleTimer requires N-API addon")

public actual fun scePowerIdleTimerEnable(unknown: Int): Int =
    throw UnsupportedOperationException("scePowerIdleTimerEnable requires N-API addon")

public actual fun scePowerIdleTimerDisable(unknown: Int): Int =
    throw UnsupportedOperationException("scePowerIdleTimerDisable requires N-API addon")

public actual fun scePowerRequestStandby(): Int =
    throw UnsupportedOperationException("scePowerRequestStandby requires N-API addon")

public actual fun scePowerRequestSuspend(): Int =
    throw UnsupportedOperationException("scePowerRequestSuspend requires N-API addon")

public actual fun sceWlanDevIsPowerOn(): Int =
    throw UnsupportedOperationException("sceWlanDevIsPowerOn requires N-API addon")

public actual fun sceWlanGetSwitchState(): Int =
    throw UnsupportedOperationException("sceWlanGetSwitchState requires N-API addon")

public actual fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceWlanGetEtherAddr requires N-API addon")

public actual fun sceWlanDevAttach(): Int =
    throw UnsupportedOperationException("sceWlanDevAttach requires N-API addon")

public actual fun sceWlanDevDetach(): Int =
    throw UnsupportedOperationException("sceWlanDevDetach requires N-API addon")

public actual fun sceRtcGetCurrentTick(tick: ULong?): Int =
    throw UnsupportedOperationException("sceRtcGetCurrentTick requires N-API addon")

public actual fun sceRtcGetCurrentClock(tm: ScePspDateTime?, tz: Int): Int =
    throw UnsupportedOperationException("sceRtcGetCurrentClock requires N-API addon")

public actual fun sceRtcGetCurrentClockLocalTime(tm: ScePspDateTime?): Int =
    throw UnsupportedOperationException("sceRtcGetCurrentClockLocalTime requires N-API addon")

public actual fun sceRtcConvertUtcToLocalTime(tickUtc: ULong?, tickLocal: ULong?): Int =
    throw UnsupportedOperationException("sceRtcConvertUtcToLocalTime requires N-API addon")

public actual fun sceRtcConvertLocalTimeToUTC(tickLocal: ULong?, tickUtc: ULong?): Int =
    throw UnsupportedOperationException("sceRtcConvertLocalTimeToUTC requires N-API addon")

public actual fun sceRtcIsLeapYear(year: Int): Int =
    throw UnsupportedOperationException("sceRtcIsLeapYear requires N-API addon")

public actual fun sceRtcGetDaysInMonth(year: Int, month: Int): Int =
    throw UnsupportedOperationException("sceRtcGetDaysInMonth requires N-API addon")

public actual fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int =
    throw UnsupportedOperationException("sceRtcGetDayOfWeek requires N-API addon")

public actual fun sceRtcCheckValid(date: ScePspDateTime?): Int =
    throw UnsupportedOperationException("sceRtcCheckValid requires N-API addon")

public actual fun sceRtcSetTick(date: ScePspDateTime?, tick: ULong?): Int =
    throw UnsupportedOperationException("sceRtcSetTick requires N-API addon")

public actual fun sceRtcGetTick(date: ScePspDateTime?, tick: ULong?): Int =
    throw UnsupportedOperationException("sceRtcGetTick requires N-API addon")

public actual fun sceRtcCompareTick(tick1: ULong?, tick2: ULong?): Int =
    throw UnsupportedOperationException("sceRtcCompareTick requires N-API addon")

public actual fun sceRtcTickAddTicks(destTick: ULong?, srcTick: ULong?, numTicks: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddTicks requires N-API addon")

public actual fun sceRtcTickAddMicroseconds(destTick: ULong?, srcTick: ULong?, numMs: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddMicroseconds requires N-API addon")

public actual fun sceRtcTickAddSeconds(destTick: ULong?, srcTick: ULong?, numSeconds: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddSeconds requires N-API addon")

public actual fun sceRtcTickAddMinutes(destTick: ULong?, srcTick: ULong?, numMinutes: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddMinutes requires N-API addon")

public actual fun sceRtcTickAddHours(destTick: ULong?, srcTick: ULong?, numHours: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddHours requires N-API addon")

public actual fun sceRtcTickAddDays(destTick: ULong?, srcTick: ULong?, numDays: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddDays requires N-API addon")

public actual fun sceRtcTickAddWeeks(destTick: ULong?, srcTick: ULong?, numWeeks: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddWeeks requires N-API addon")

public actual fun sceRtcTickAddMonths(destTick: ULong?, srcTick: ULong?, numMonths: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddMonths requires N-API addon")

public actual fun sceRtcTickAddYears(destTick: ULong?, srcTick: ULong?, numYears: ULong): Int =
    throw UnsupportedOperationException("sceRtcTickAddYears requires N-API addon")

public actual fun sceRtcSetTimeT(date: ScePspDateTime?, time: UInt): Int =
    throw UnsupportedOperationException("sceRtcSetTimeT requires N-API addon")

public actual fun sceRtcGetTimeT(date: ScePspDateTime?, time: UInt?): Int =
    throw UnsupportedOperationException("sceRtcGetTimeT requires N-API addon")

public actual fun sceRtcSetTime64T(date: ScePspDateTime?, time: ULong): Int =
    throw UnsupportedOperationException("sceRtcSetTime64T requires N-API addon")

public actual fun sceRtcGetTime64T(date: ScePspDateTime?, time: ULong?): Int =
    throw UnsupportedOperationException("sceRtcGetTime64T requires N-API addon")

public actual fun sceRtcSetDosTime(date: ScePspDateTime?, dosTime: UInt): Int =
    throw UnsupportedOperationException("sceRtcSetDosTime requires N-API addon")

public actual fun sceRtcGetDosTime(date: ScePspDateTime?, dosTime: UInt): Int =
    throw UnsupportedOperationException("sceRtcGetDosTime requires N-API addon")

public actual fun sceRtcSetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int =
    throw UnsupportedOperationException("sceRtcSetWin32FileTime requires N-API addon")

public actual fun sceRtcGetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int =
    throw UnsupportedOperationException("sceRtcGetWin32FileTime requires N-API addon")

public actual fun sceRtcParseDateTime(destTick: ULong?, dateString: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceRtcParseDateTime requires N-API addon")

public actual fun sceRtcFormatRFC3339(pszDateTime: String?, pUtc: ULong?, timeZoneMinutes: Int): Int =
    throw UnsupportedOperationException("sceRtcFormatRFC3339 requires N-API addon")

public actual fun sceRtcFormatRFC3339LocalTime(pszDateTime: String?, pUtc: ULong?): Int =
    throw UnsupportedOperationException("sceRtcFormatRFC3339LocalTime requires N-API addon")

public actual fun sceRtcParseRFC3339(pUtc: ULong?, pszDateTime: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceRtcParseRFC3339 requires N-API addon")

public actual fun sceRtcFormatRFC2822(pszDateTime: String?, pUtc: ULong?, timeZoneMinutes: Int): Int =
    throw UnsupportedOperationException("sceRtcFormatRFC2822 requires N-API addon")

public actual fun sceRtcFormatRFC2822LocalTime(pszDateTime: String?, pUtc: ULong?): Int =
    throw UnsupportedOperationException("sceRtcFormatRFC2822LocalTime requires N-API addon")

public actual fun sceIoClose(fd: SceUid): Int =
    throw UnsupportedOperationException("sceIoClose requires N-API addon")

public actual fun sceIoCloseAsync(fd: SceUid): Int =
    throw UnsupportedOperationException("sceIoCloseAsync requires N-API addon")

public actual fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("sceIoRead requires N-API addon")

public actual fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("sceIoReadAsync requires N-API addon")

public actual fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceIoWrite requires N-API addon")

public actual fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int =
    throw UnsupportedOperationException("sceIoWriteAsync requires N-API addon")

public actual fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long =
    throw UnsupportedOperationException("sceIoLseek requires N-API addon")

public actual fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int =
    throw UnsupportedOperationException("sceIoLseekAsync requires N-API addon")

public actual fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("sceIoLseek32 requires N-API addon")

public actual fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int =
    throw UnsupportedOperationException("sceIoLseek32Async requires N-API addon")

public actual fun sceIoRemove(file: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoRemove requires N-API addon")

public actual fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int =
    throw UnsupportedOperationException("sceIoMkdir requires N-API addon")

public actual fun sceIoRmdir(path: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoRmdir requires N-API addon")

public actual fun sceIoChdir(path: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoChdir requires N-API addon")

public actual fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoRename requires N-API addon")

public actual fun sceIoDread(fd: SceUid, dir: SceIoDirent?): Int =
    throw UnsupportedOperationException("sceIoDread requires N-API addon")

public actual fun sceIoDclose(fd: SceUid): Int =
    throw UnsupportedOperationException("sceIoDclose requires N-API addon")

public actual fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    throw UnsupportedOperationException("sceIoDevctl requires N-API addon")

public actual fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int =
    throw UnsupportedOperationException("sceIoAssign requires N-API addon")

public actual fun sceIoUnassign(dev: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoUnassign requires N-API addon")

public actual fun sceIoGetstat(file: COpaquePointer?, stat: SceIoStat?): Int =
    throw UnsupportedOperationException("sceIoGetstat requires N-API addon")

public actual fun sceIoChstat(file: COpaquePointer?, stat: SceIoStat?, bits: Int): Int =
    throw UnsupportedOperationException("sceIoChstat requires N-API addon")

public actual fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    throw UnsupportedOperationException("sceIoIoctl requires N-API addon")

public actual fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int =
    throw UnsupportedOperationException("sceIoIoctlAsync requires N-API addon")

public actual fun sceIoSync(device: COpaquePointer?, unk: UInt): Int =
    throw UnsupportedOperationException("sceIoSync requires N-API addon")

public actual fun sceIoWaitAsync(fd: SceUid, res: Long?): Int =
    throw UnsupportedOperationException("sceIoWaitAsync requires N-API addon")

public actual fun sceIoWaitAsyncCB(fd: SceUid, res: Long?): Int =
    throw UnsupportedOperationException("sceIoWaitAsyncCB requires N-API addon")

public actual fun sceIoPollAsync(fd: SceUid, res: Long?): Int =
    throw UnsupportedOperationException("sceIoPollAsync requires N-API addon")

public actual fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: Long?): Int =
    throw UnsupportedOperationException("sceIoGetAsyncStat requires N-API addon")

public actual fun sceIoCancel(fd: SceUid): Int =
    throw UnsupportedOperationException("sceIoCancel requires N-API addon")

public actual fun sceIoGetDevType(fd: SceUid): Int =
    throw UnsupportedOperationException("sceIoGetDevType requires N-API addon")

public actual fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int =
    throw UnsupportedOperationException("sceIoChangeAsyncPriority requires N-API addon")

public actual fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceIoSetAsyncCallback requires N-API addon")

public actual fun sceJpegInitMJpeg(): Int =
    throw UnsupportedOperationException("sceJpegInitMJpeg requires N-API addon")

public actual fun sceJpegFinishMJpeg(): Int =
    throw UnsupportedOperationException("sceJpegFinishMJpeg requires N-API addon")

public actual fun sceJpegCreateMJpeg(width: Int, height: Int): Int =
    throw UnsupportedOperationException("sceJpegCreateMJpeg requires N-API addon")

public actual fun sceJpegDeleteMJpeg(): Int =
    throw UnsupportedOperationException("sceJpegDeleteMJpeg requires N-API addon")

public actual fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int =
    throw UnsupportedOperationException("sceJpegDecodeMJpeg requires N-API addon")

public actual fun sceUmdCheckMedium(): Int =
    throw UnsupportedOperationException("sceUmdCheckMedium requires N-API addon")

public actual fun sceUmdGetDiscInfo(info: UmdInfo?): Int =
    throw UnsupportedOperationException("sceUmdGetDiscInfo requires N-API addon")

public actual fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUmdActivate requires N-API addon")

public actual fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUmdDeactivate requires N-API addon")

public actual fun sceUmdWaitDriveStat(state: Int): Int =
    throw UnsupportedOperationException("sceUmdWaitDriveStat requires N-API addon")

public actual fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceUmdWaitDriveStatWithTimer requires N-API addon")

public actual fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceUmdWaitDriveStatCB requires N-API addon")

public actual fun sceUmdCancelWaitDriveStat(): Int =
    throw UnsupportedOperationException("sceUmdCancelWaitDriveStat requires N-API addon")

public actual fun sceUmdGetDriveStat(): Int =
    throw UnsupportedOperationException("sceUmdGetDriveStat requires N-API addon")

public actual fun sceUmdGetErrorStat(): Int =
    throw UnsupportedOperationException("sceUmdGetErrorStat requires N-API addon")

public actual fun sceUmdRegisterUMDCallBack(cbid: Int): Int =
    throw UnsupportedOperationException("sceUmdRegisterUMDCallBack requires N-API addon")

public actual fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int =
    throw UnsupportedOperationException("sceUmdUnRegisterUMDCallBack requires N-API addon")

public actual fun sceUmdReplacePermit(): Int =
    throw UnsupportedOperationException("sceUmdReplacePermit requires N-API addon")

public actual fun sceUmdReplaceProhibit(): Int =
    throw UnsupportedOperationException("sceUmdReplaceProhibit requires N-API addon")

public actual fun sceMpegInit(): Int =
    throw UnsupportedOperationException("sceMpegInit requires N-API addon")

public actual fun sceMpegFinish() {
    throw UnsupportedOperationException("sceMpegFinish requires N-API addon")
}

public actual fun sceMpegRingbufferQueryMemSize(packets: Int): Int =
    throw UnsupportedOperationException("sceMpegRingbufferQueryMemSize requires N-API addon")

public actual fun sceMpegRingbufferConstruct(ringbuffer: SceMpegRingbuffer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceMpegRingbufferConstruct requires N-API addon")

public actual fun sceMpegRingbufferDestruct(ringbuffer: SceMpegRingbuffer?) {
    throw UnsupportedOperationException("sceMpegRingbufferDestruct requires N-API addon")
}

public actual fun sceMpegRingbufferAvailableSize(ringbuffer: SceMpegRingbuffer?): Int =
    throw UnsupportedOperationException("sceMpegRingbufferAvailableSize requires N-API addon")

public actual fun sceMpegRingbufferPut(ringbuffer: SceMpegRingbuffer?, numPackets: Int, available: Int): Int =
    throw UnsupportedOperationException("sceMpegRingbufferPut requires N-API addon")

public actual fun sceMpegQueryMemSize(unk: Int): Int =
    throw UnsupportedOperationException("sceMpegQueryMemSize requires N-API addon")

public actual fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: SceMpegRingbuffer?, frameWidth: Int, unk1: Int, unk2: Int): Int =
    throw UnsupportedOperationException("sceMpegCreate requires N-API addon")

public actual fun sceMpegDelete(handle: SceMpeg) {
    throw UnsupportedOperationException("sceMpegDelete requires N-API addon")
}

public actual fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: Int?): Int =
    throw UnsupportedOperationException("sceMpegQueryStreamOffset requires N-API addon")

public actual fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: Int?): Int =
    throw UnsupportedOperationException("sceMpegQueryStreamSize requires N-API addon")

public actual fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
    throw UnsupportedOperationException("sceMpegUnRegistStream requires N-API addon")
}

public actual fun sceMpegFlushAllStream(handle: SceMpeg): Int =
    throw UnsupportedOperationException("sceMpegFlushAllStream requires N-API addon")

public actual fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer? =
    throw UnsupportedOperationException("sceMpegMallocAvcEsBuf requires N-API addon")

public actual fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?) {
    throw UnsupportedOperationException("sceMpegFreeAvcEsBuf requires N-API addon")
}

public actual fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: Int?, outSize: Int?): Int =
    throw UnsupportedOperationException("sceMpegQueryAtracEsSize requires N-API addon")

public actual fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: SceMpegAu?): Int =
    throw UnsupportedOperationException("sceMpegInitAu requires N-API addon")

public actual fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: Int?): Int =
    throw UnsupportedOperationException("sceMpegGetAvcAu requires N-API addon")

public actual fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: SceMpegAvcMode?): Int =
    throw UnsupportedOperationException("sceMpegAvcDecodeMode requires N-API addon")

public actual fun sceMpegAvcDecode(handle: SceMpeg, au: SceMpegAu?, iframeWidth: Int, buffer: COpaquePointer?, init: Int?): Int =
    throw UnsupportedOperationException("sceMpegAvcDecode requires N-API addon")

public actual fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: Int?): Int =
    throw UnsupportedOperationException("sceMpegAvcDecodeStop requires N-API addon")

public actual fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceMpegGetAtracAu requires N-API addon")

public actual fun sceMpegAtracDecode(handle: SceMpeg, au: SceMpegAu?, buffer: COpaquePointer?, init: Int): Int =
    throw UnsupportedOperationException("sceMpegAtracDecode requires N-API addon")

public actual fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: Int?, type: Int): Int =
    throw UnsupportedOperationException("sceMpegBaseYCrCbCopyVme requires N-API addon")

public actual fun sceMpegBaseCscInit(width: Int): Int =
    throw UnsupportedOperationException("sceMpegBaseCscInit requires N-API addon")

public actual fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: SceMpegYCrCbBuffer?): Int =
    throw UnsupportedOperationException("sceMpegBaseCscVme requires N-API addon")

public actual fun sceMpegbaseBEA18F91(lli: SceMpegLLI?): Int =
    throw UnsupportedOperationException("sceMpegbaseBEA18F91 requires N-API addon")

public actual fun sceHprmPeekCurrentKey(key: Int?): Int =
    throw UnsupportedOperationException("sceHprmPeekCurrentKey requires N-API addon")

public actual fun sceHprmPeekLatch(latch: UIntArray?): Int =
    throw UnsupportedOperationException("sceHprmPeekLatch requires N-API addon")

public actual fun sceHprmReadLatch(latch: UIntArray?): Int =
    throw UnsupportedOperationException("sceHprmReadLatch requires N-API addon")

public actual fun sceHprmIsHeadphoneExist(): Int =
    throw UnsupportedOperationException("sceHprmIsHeadphoneExist requires N-API addon")

public actual fun sceHprmIsRemoteExist(): Int =
    throw UnsupportedOperationException("sceHprmIsRemoteExist requires N-API addon")

public actual fun sceHprmIsMicrophoneExist(): Int =
    throw UnsupportedOperationException("sceHprmIsMicrophoneExist requires N-API addon")

public actual fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
    throw UnsupportedOperationException("sceGuDepthBuffer requires N-API addon")
}

public actual fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
    throw UnsupportedOperationException("sceGuDispBuffer requires N-API addon")
}

public actual fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    throw UnsupportedOperationException("sceGuDrawBuffer requires N-API addon")
}

public actual fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    throw UnsupportedOperationException("sceGuDrawBufferList requires N-API addon")
}

public actual fun sceGuDisplay(state: Boolean): Boolean =
    throw UnsupportedOperationException("sceGuDisplay requires N-API addon")

public actual fun sceGuDepthFunc(function: DepthFunc) {
    throw UnsupportedOperationException("sceGuDepthFunc requires N-API addon")
}

public actual fun sceGuDepthMask(mask: Int) {
    throw UnsupportedOperationException("sceGuDepthMask requires N-API addon")
}

public actual fun sceGuDepthOffset(offset: Int) {
    throw UnsupportedOperationException("sceGuDepthOffset requires N-API addon")
}

public actual fun sceGuDepthRange(near: Int, far: Int) {
    throw UnsupportedOperationException("sceGuDepthRange requires N-API addon")
}

public actual fun sceGuFog(near: Float, far: Float, color: UInt) {
    throw UnsupportedOperationException("sceGuFog requires N-API addon")
}

public actual fun sceGuInit() {
    throw UnsupportedOperationException("sceGuInit requires N-API addon")
}

public actual fun sceGuTerm() {
    throw UnsupportedOperationException("sceGuTerm requires N-API addon")
}

public actual fun sceGuBreak(mode: Int) {
    throw UnsupportedOperationException("sceGuBreak requires N-API addon")
}

public actual fun sceGuContinue() {
    throw UnsupportedOperationException("sceGuContinue requires N-API addon")
}

public actual fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
    throw UnsupportedOperationException("sceGuSignal requires N-API addon")
}

public actual fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
    throw UnsupportedOperationException("sceGuSendCommandf requires N-API addon")
}

public actual fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
    throw UnsupportedOperationException("sceGuSendCommandi requires N-API addon")
}

public actual fun sceGuGetMemory(size: Int): COpaquePointer? =
    throw UnsupportedOperationException("sceGuGetMemory requires N-API addon")

public actual fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuStart requires N-API addon")
}

public actual fun sceGuFinish(): Int =
    throw UnsupportedOperationException("sceGuFinish requires N-API addon")

public actual fun sceGuFinishId(id: UInt): Int =
    throw UnsupportedOperationException("sceGuFinishId requires N-API addon")

public actual fun sceGuCallList(list: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuCallList requires N-API addon")
}

public actual fun sceGuCallMode(mode: Int) {
    throw UnsupportedOperationException("sceGuCallMode requires N-API addon")
}

public actual fun sceGuCheckList(): Int =
    throw UnsupportedOperationException("sceGuCheckList requires N-API addon")

public actual fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: GeContext?) {
    throw UnsupportedOperationException("sceGuSendList requires N-API addon")
}

public actual fun sceGuSwapBuffers(): COpaquePointer? =
    throw UnsupportedOperationException("sceGuSwapBuffers requires N-API addon")

public actual fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuDrawArray requires N-API addon")
}

public actual fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuBeginObject requires N-API addon")
}

public actual fun sceGuEndObject() {
    throw UnsupportedOperationException("sceGuEndObject requires N-API addon")
}

public actual fun sceGuSetStatus(state: GuState, status: Int) {
    throw UnsupportedOperationException("sceGuSetStatus requires N-API addon")
}

public actual fun sceGuGetStatus(state: GuState): Boolean =
    throw UnsupportedOperationException("sceGuGetStatus requires N-API addon")

public actual fun sceGuSetAllStatus(status: Int) {
    throw UnsupportedOperationException("sceGuSetAllStatus requires N-API addon")
}

public actual fun sceGuGetAllStatus(): Int =
    throw UnsupportedOperationException("sceGuGetAllStatus requires N-API addon")

public actual fun sceGuEnable(state: GuState) {
    throw UnsupportedOperationException("sceGuEnable requires N-API addon")
}

public actual fun sceGuDisable(state: GuState) {
    throw UnsupportedOperationException("sceGuDisable requires N-API addon")
}

public actual fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGuLight requires N-API addon")
}

public actual fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    throw UnsupportedOperationException("sceGuLightAtt requires N-API addon")
}

public actual fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    throw UnsupportedOperationException("sceGuLightColor requires N-API addon")
}

public actual fun sceGuLightMode(mode: LightMode) {
    throw UnsupportedOperationException("sceGuLightMode requires N-API addon")
}

public actual fun sceGuLightSpot(light: Int, direction: ScePspFVector3?, exponent: Float, cutoff: Float) {
    throw UnsupportedOperationException("sceGuLightSpot requires N-API addon")
}

public actual fun sceGuClear(flags: Int) {
    throw UnsupportedOperationException("sceGuClear requires N-API addon")
}

public actual fun sceGuClearColor(color: UInt) {
    throw UnsupportedOperationException("sceGuClearColor requires N-API addon")
}

public actual fun sceGuClearDepth(depth: UInt) {
    throw UnsupportedOperationException("sceGuClearDepth requires N-API addon")
}

public actual fun sceGuClearStencil(stencil: UInt) {
    throw UnsupportedOperationException("sceGuClearStencil requires N-API addon")
}

public actual fun sceGuPixelMask(mask: UInt) {
    throw UnsupportedOperationException("sceGuPixelMask requires N-API addon")
}

public actual fun sceGuColor(color: UInt) {
    throw UnsupportedOperationException("sceGuColor requires N-API addon")
}

public actual fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
    throw UnsupportedOperationException("sceGuColorFunc requires N-API addon")
}

public actual fun sceGuColorMaterial(components: Int) {
    throw UnsupportedOperationException("sceGuColorMaterial requires N-API addon")
}

public actual fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
    throw UnsupportedOperationException("sceGuAlphaFunc requires N-API addon")
}

public actual fun sceGuAmbient(color: UInt) {
    throw UnsupportedOperationException("sceGuAmbient requires N-API addon")
}

public actual fun sceGuAmbientColor(color: UInt) {
    throw UnsupportedOperationException("sceGuAmbientColor requires N-API addon")
}

public actual fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
    throw UnsupportedOperationException("sceGuBlendFunc requires N-API addon")
}

public actual fun sceGuMaterial(components: Int, color: UInt) {
    throw UnsupportedOperationException("sceGuMaterial requires N-API addon")
}

public actual fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    throw UnsupportedOperationException("sceGuModelColor requires N-API addon")
}

public actual fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
    throw UnsupportedOperationException("sceGuStencilFunc requires N-API addon")
}

public actual fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
    throw UnsupportedOperationException("sceGuStencilOp requires N-API addon")
}

public actual fun sceGuSpecular(power: Float) {
    throw UnsupportedOperationException("sceGuSpecular requires N-API addon")
}

public actual fun sceGuFrontFace(order: FrontFaceDirection) {
    throw UnsupportedOperationException("sceGuFrontFace requires N-API addon")
}

public actual fun sceGuLogicalOp(op: LogicalOperation) {
    throw UnsupportedOperationException("sceGuLogicalOp requires N-API addon")
}

public actual fun sceGuSetDither(matrix: ScePspIMatrix4?) {
    throw UnsupportedOperationException("sceGuSetDither requires N-API addon")
}

public actual fun sceGuShadeModel(mode: ShadingModel) {
    throw UnsupportedOperationException("sceGuShadeModel requires N-API addon")
}

public actual fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuCopyImage requires N-API addon")
}

public actual fun sceGuTexEnvColor(color: UInt) {
    throw UnsupportedOperationException("sceGuTexEnvColor requires N-API addon")
}

public actual fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
    throw UnsupportedOperationException("sceGuTexFilter requires N-API addon")
}

public actual fun sceGuTexFlush() {
    throw UnsupportedOperationException("sceGuTexFlush requires N-API addon")
}

public actual fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
    throw UnsupportedOperationException("sceGuTexFunc requires N-API addon")
}

public actual fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuTexImage requires N-API addon")
}

public actual fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
    throw UnsupportedOperationException("sceGuTexLevelMode requires N-API addon")
}

public actual fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
    throw UnsupportedOperationException("sceGuTexMapMode requires N-API addon")
}

public actual fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
    throw UnsupportedOperationException("sceGuTexMode requires N-API addon")
}

public actual fun sceGuTexOffset(u: Float, v: Float) {
    throw UnsupportedOperationException("sceGuTexOffset requires N-API addon")
}

public actual fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
    throw UnsupportedOperationException("sceGuTexProjMapMode requires N-API addon")
}

public actual fun sceGuTexScale(u: Float, v: Float) {
    throw UnsupportedOperationException("sceGuTexScale requires N-API addon")
}

public actual fun sceGuTexSlope(slope: Float) {
    throw UnsupportedOperationException("sceGuTexSlope requires N-API addon")
}

public actual fun sceGuTexSync() {
    throw UnsupportedOperationException("sceGuTexSync requires N-API addon")
}

public actual fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
    throw UnsupportedOperationException("sceGuTexWrap requires N-API addon")
}

public actual fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuClutLoad requires N-API addon")
}

public actual fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
    throw UnsupportedOperationException("sceGuClutMode requires N-API addon")
}

public actual fun sceGuOffset(x: UInt, y: UInt) {
    throw UnsupportedOperationException("sceGuOffset requires N-API addon")
}

public actual fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    throw UnsupportedOperationException("sceGuScissor requires N-API addon")
}

public actual fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    throw UnsupportedOperationException("sceGuViewport requires N-API addon")
}

public actual fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuDrawBezier requires N-API addon")
}

public actual fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    throw UnsupportedOperationException("sceGuPatchDivide requires N-API addon")
}

public actual fun sceGuPatchFrontFace(a0: UInt) {
    throw UnsupportedOperationException("sceGuPatchFrontFace requires N-API addon")
}

public actual fun sceGuPatchPrim(prim: PatchPrimitive) {
    throw UnsupportedOperationException("sceGuPatchPrim requires N-API addon")
}

public actual fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuDrawSpline requires N-API addon")
}

public actual fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4?) {
    throw UnsupportedOperationException("sceGuSetMatrix requires N-API addon")
}

public actual fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4?) {
    throw UnsupportedOperationException("sceGuBoneMatrix requires N-API addon")
}

public actual fun sceGuMorphWeight(index: Int, weight: Float) {
    throw UnsupportedOperationException("sceGuMorphWeight requires N-API addon")
}

public actual fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGuDrawArrayN requires N-API addon")
}

public actual fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGumDrawArray requires N-API addon")
}

public actual fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGumDrawArrayN requires N-API addon")
}

public actual fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGumDrawBezier requires N-API addon")
}

public actual fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    throw UnsupportedOperationException("sceGumDrawSpline requires N-API addon")
}

public actual fun sceGumFastInverse() {
    throw UnsupportedOperationException("sceGumFastInverse requires N-API addon")
}

public actual fun sceGumFullInverse() {
    throw UnsupportedOperationException("sceGumFullInverse requires N-API addon")
}

public actual fun sceGumLoadIdentity() {
    throw UnsupportedOperationException("sceGumLoadIdentity requires N-API addon")
}

public actual fun sceGumLoadMatrix(m: ScePspFMatrix4?) {
    throw UnsupportedOperationException("sceGumLoadMatrix requires N-API addon")
}

public actual fun sceGumLookAt(eye: ScePspFVector3?, center: ScePspFVector3?, up: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGumLookAt requires N-API addon")
}

public actual fun sceGumMatrixMode(mode: MatrixMode) {
    throw UnsupportedOperationException("sceGumMatrixMode requires N-API addon")
}

public actual fun sceGumMultMatrix(m: ScePspFMatrix4?) {
    throw UnsupportedOperationException("sceGumMultMatrix requires N-API addon")
}

public actual fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    throw UnsupportedOperationException("sceGumOrtho requires N-API addon")
}

public actual fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    throw UnsupportedOperationException("sceGumPerspective requires N-API addon")
}

public actual fun sceGumPopMatrix() {
    throw UnsupportedOperationException("sceGumPopMatrix requires N-API addon")
}

public actual fun sceGumPushMatrix() {
    throw UnsupportedOperationException("sceGumPushMatrix requires N-API addon")
}

public actual fun sceGumRotateX(angle: Float) {
    throw UnsupportedOperationException("sceGumRotateX requires N-API addon")
}

public actual fun sceGumRotateY(angle: Float) {
    throw UnsupportedOperationException("sceGumRotateY requires N-API addon")
}

public actual fun sceGumRotateZ(angle: Float) {
    throw UnsupportedOperationException("sceGumRotateZ requires N-API addon")
}

public actual fun sceGumRotateXYZ(v: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGumRotateXYZ requires N-API addon")
}

public actual fun sceGumRotateZYX(v: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGumRotateZYX requires N-API addon")
}

public actual fun sceGumScale(v: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGumScale requires N-API addon")
}

public actual fun sceGumStoreMatrix(m: ScePspFMatrix4?) {
    throw UnsupportedOperationException("sceGumStoreMatrix requires N-API addon")
}

public actual fun sceGumTranslate(v: ScePspFVector3?) {
    throw UnsupportedOperationException("sceGumTranslate requires N-API addon")
}

public actual fun sceGumUpdateMatrix() {
    throw UnsupportedOperationException("sceGumUpdateMatrix requires N-API addon")
}

public actual fun sceMp3ReserveMp3Handle(args: SceMp3InitArg?): Int =
    throw UnsupportedOperationException("sceMp3ReserveMp3Handle requires N-API addon")

public actual fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3ReleaseMp3Handle requires N-API addon")

public actual fun sceMp3InitResource(): Int =
    throw UnsupportedOperationException("sceMp3InitResource requires N-API addon")

public actual fun sceMp3TermResource(): Int =
    throw UnsupportedOperationException("sceMp3TermResource requires N-API addon")

public actual fun sceMp3Init(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3Init requires N-API addon")

public actual fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceMp3Decode requires N-API addon")

public actual fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: Int?, srcPos: Int?): Int =
    throw UnsupportedOperationException("sceMp3GetInfoToAddStreamData requires N-API addon")

public actual fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int =
    throw UnsupportedOperationException("sceMp3NotifyAddStreamData requires N-API addon")

public actual fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3CheckStreamDataNeeded requires N-API addon")

public actual fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int =
    throw UnsupportedOperationException("sceMp3SetLoopNum requires N-API addon")

public actual fun sceMp3GetLoopNum(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetLoopNum requires N-API addon")

public actual fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetSumDecodedSample requires N-API addon")

public actual fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetMaxOutputSample requires N-API addon")

public actual fun sceMp3GetSamplingRate(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetSamplingRate requires N-API addon")

public actual fun sceMp3GetBitRate(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetBitRate requires N-API addon")

public actual fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3GetMp3ChannelNum requires N-API addon")

public actual fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int =
    throw UnsupportedOperationException("sceMp3ResetPlayPosition requires N-API addon")

public actual fun sceRegOpenRegistry(reg: Key?, mode: Int, handle: RegHandle?): Int =
    throw UnsupportedOperationException("sceRegOpenRegistry requires N-API addon")

public actual fun sceRegFlushRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("sceRegFlushRegistry requires N-API addon")

public actual fun sceRegCloseRegistry(handle: RegHandle): Int =
    throw UnsupportedOperationException("sceRegCloseRegistry requires N-API addon")

public actual fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: RegHandle?): Int =
    throw UnsupportedOperationException("sceRegOpenCategory requires N-API addon")

public actual fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceRegRemoveCategory requires N-API addon")

public actual fun sceRegCloseCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("sceRegCloseCategory requires N-API addon")

public actual fun sceRegFlushCategory(dirHandle: RegHandle): Int =
    throw UnsupportedOperationException("sceRegFlushCategory requires N-API addon")

public actual fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: RegHandle?, type: KeyType?, size: ULong?): Int =
    throw UnsupportedOperationException("sceRegGetKeyInfo requires N-API addon")

public actual fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: KeyType?, size: ULong?): Int =
    throw UnsupportedOperationException("sceRegGetKeyInfoByName requires N-API addon")

public actual fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceRegGetKeyValue requires N-API addon")

public actual fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceRegGetKeyValueByName requires N-API addon")

public actual fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("sceRegSetKeyValue requires N-API addon")

public actual fun sceRegGetKeysNum(dirHandle: RegHandle, num: Int?): Int =
    throw UnsupportedOperationException("sceRegGetKeysNum requires N-API addon")

public actual fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int =
    throw UnsupportedOperationException("sceRegGetKeys requires N-API addon")

public actual fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int =
    throw UnsupportedOperationException("sceRegCreateKey requires N-API addon")

public actual fun sceRegRemoveRegistry(key: Key?): Int =
    throw UnsupportedOperationException("sceRegRemoveRegistry requires N-API addon")

public actual fun sceOpenPSIDGetOpenPSID(openpsid: OpenPSID?): Int =
    throw UnsupportedOperationException("sceOpenPSIDGetOpenPSID requires N-API addon")

public actual fun sceUtilityMsgDialogInitStart(params: UtilityMsgDialogParams?): Int =
    throw UnsupportedOperationException("sceUtilityMsgDialogInitStart requires N-API addon")

public actual fun sceUtilityMsgDialogShutdownStart() {
    throw UnsupportedOperationException("sceUtilityMsgDialogShutdownStart requires N-API addon")
}

public actual fun sceUtilityMsgDialogGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilityMsgDialogGetStatus requires N-API addon")

public actual fun sceUtilityMsgDialogUpdate(n: Int) {
    throw UnsupportedOperationException("sceUtilityMsgDialogUpdate requires N-API addon")
}

public actual fun sceUtilityMsgDialogAbort(): Int =
    throw UnsupportedOperationException("sceUtilityMsgDialogAbort requires N-API addon")

public actual fun sceUtilityNetconfInitStart(data: UtilityNetconfData?): Int =
    throw UnsupportedOperationException("sceUtilityNetconfInitStart requires N-API addon")

public actual fun sceUtilityNetconfShutdownStart(): Int =
    throw UnsupportedOperationException("sceUtilityNetconfShutdownStart requires N-API addon")

public actual fun sceUtilityNetconfUpdate(unknown: Int): Int =
    throw UnsupportedOperationException("sceUtilityNetconfUpdate requires N-API addon")

public actual fun sceUtilityNetconfGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilityNetconfGetStatus requires N-API addon")

public actual fun sceUtilityCheckNetParam(id: Int): Int =
    throw UnsupportedOperationException("sceUtilityCheckNetParam requires N-API addon")

public actual fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: UtilityNetData?): Int =
    throw UnsupportedOperationException("sceUtilityGetNetParam requires N-API addon")

public actual fun sceUtilitySavedataInitStart(params: SceUtilitySavedataParam?): Int =
    throw UnsupportedOperationException("sceUtilitySavedataInitStart requires N-API addon")

public actual fun sceUtilitySavedataGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilitySavedataGetStatus requires N-API addon")

public actual fun sceUtilitySavedataShutdownStart(): Int =
    throw UnsupportedOperationException("sceUtilitySavedataShutdownStart requires N-API addon")

public actual fun sceUtilitySavedataUpdate(unknown: Int) {
    throw UnsupportedOperationException("sceUtilitySavedataUpdate requires N-API addon")
}

public actual fun sceUtilityGameSharingInitStart(params: UtilityGameSharingParams?): Int =
    throw UnsupportedOperationException("sceUtilityGameSharingInitStart requires N-API addon")

public actual fun sceUtilityGameSharingShutdownStart() {
    throw UnsupportedOperationException("sceUtilityGameSharingShutdownStart requires N-API addon")
}

public actual fun sceUtilityGameSharingGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilityGameSharingGetStatus requires N-API addon")

public actual fun sceUtilityGameSharingUpdate(n: Int) {
    throw UnsupportedOperationException("sceUtilityGameSharingUpdate requires N-API addon")
}

public actual fun sceUtilityHtmlViewerInitStart(params: UtilityHtmlViewerParam?): Int =
    throw UnsupportedOperationException("sceUtilityHtmlViewerInitStart requires N-API addon")

public actual fun sceUtilityHtmlViewerShutdownStart(): Int =
    throw UnsupportedOperationException("sceUtilityHtmlViewerShutdownStart requires N-API addon")

public actual fun sceUtilityHtmlViewerUpdate(n: Int): Int =
    throw UnsupportedOperationException("sceUtilityHtmlViewerUpdate requires N-API addon")

public actual fun sceUtilityHtmlViewerGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilityHtmlViewerGetStatus requires N-API addon")

public actual fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int =
    throw UnsupportedOperationException("sceUtilitySetSystemParamInt requires N-API addon")

public actual fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUtilitySetSystemParamString requires N-API addon")

public actual fun sceUtilityGetSystemParamInt(id: SystemParamId, value: Int?): Int =
    throw UnsupportedOperationException("sceUtilityGetSystemParamInt requires N-API addon")

public actual fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int =
    throw UnsupportedOperationException("sceUtilityGetSystemParamString requires N-API addon")

public actual fun sceUtilityOskInitStart(params: SceUtilityOskParams?): Int =
    throw UnsupportedOperationException("sceUtilityOskInitStart requires N-API addon")

public actual fun sceUtilityOskShutdownStart(): Int =
    throw UnsupportedOperationException("sceUtilityOskShutdownStart requires N-API addon")

public actual fun sceUtilityOskUpdate(n: Int): Int =
    throw UnsupportedOperationException("sceUtilityOskUpdate requires N-API addon")

public actual fun sceUtilityOskGetStatus(): Int =
    throw UnsupportedOperationException("sceUtilityOskGetStatus requires N-API addon")

public actual fun sceUtilityLoadNetModule(module: NetModule): Int =
    throw UnsupportedOperationException("sceUtilityLoadNetModule requires N-API addon")

public actual fun sceUtilityUnloadNetModule(module: NetModule): Int =
    throw UnsupportedOperationException("sceUtilityUnloadNetModule requires N-API addon")

public actual fun sceUtilityLoadAvModule(module: AvModule): Int =
    throw UnsupportedOperationException("sceUtilityLoadAvModule requires N-API addon")

public actual fun sceUtilityUnloadAvModule(module: AvModule): Int =
    throw UnsupportedOperationException("sceUtilityUnloadAvModule requires N-API addon")

public actual fun sceUtilityLoadUsbModule(module: UsbModule): Int =
    throw UnsupportedOperationException("sceUtilityLoadUsbModule requires N-API addon")

public actual fun sceUtilityUnloadUsbModule(module: UsbModule): Int =
    throw UnsupportedOperationException("sceUtilityUnloadUsbModule requires N-API addon")

public actual fun sceUtilityLoadModule(module: Module): Int =
    throw UnsupportedOperationException("sceUtilityLoadModule requires N-API addon")

public actual fun sceUtilityUnloadModule(module: Module): Int =
    throw UnsupportedOperationException("sceUtilityUnloadModule requires N-API addon")

public actual fun sceUtilityCreateNetParam(conf: Int): Int =
    throw UnsupportedOperationException("sceUtilityCreateNetParam requires N-API addon")

public actual fun sceUtilitySetNetParam(param: NetParam, `val`: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceUtilitySetNetParam requires N-API addon")

public actual fun sceUtilityCopyNetParam(src: Int, dest: Int): Int =
    throw UnsupportedOperationException("sceUtilityCopyNetParam requires N-API addon")

public actual fun sceUtilityDeleteNetParam(conf: Int): Int =
    throw UnsupportedOperationException("sceUtilityDeleteNetParam requires N-API addon")

public actual fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int =
    throw UnsupportedOperationException("sceNetInit requires N-API addon")

public actual fun sceNetTerm(): Int =
    throw UnsupportedOperationException("sceNetTerm requires N-API addon")

public actual fun sceNetFreeThreadinfo(thid: Int): Int =
    throw UnsupportedOperationException("sceNetFreeThreadinfo requires N-API addon")

public actual fun sceNetThreadAbort(thid: Int): Int =
    throw UnsupportedOperationException("sceNetThreadAbort requires N-API addon")

public actual fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
    throw UnsupportedOperationException("sceNetEtherStrton requires N-API addon")
}

public actual fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
    throw UnsupportedOperationException("sceNetEtherNtostr requires N-API addon")
}

public actual fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetGetLocalEtherAddr requires N-API addon")

public actual fun sceNetGetMallocStat(stat: SceNetMallocStat?): Int =
    throw UnsupportedOperationException("sceNetGetMallocStat requires N-API addon")

public actual fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: SceNetAdhocctlAdhocId?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlInit requires N-API addon")

public actual fun sceNetAdhocctlTerm(): Int =
    throw UnsupportedOperationException("sceNetAdhocctlTerm requires N-API addon")

public actual fun sceNetAdhocctlConnect(name: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlConnect requires N-API addon")

public actual fun sceNetAdhocctlDisconnect(): Int =
    throw UnsupportedOperationException("sceNetAdhocctlDisconnect requires N-API addon")

public actual fun sceNetAdhocctlGetState(event: Int?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetState requires N-API addon")

public actual fun sceNetAdhocctlCreate(name: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlCreate requires N-API addon")

public actual fun sceNetAdhocctlJoin(scaninfo: SceNetAdhocctlScanInfo?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlJoin requires N-API addon")

public actual fun sceNetAdhocctlGetAdhocId(id: SceNetAdhocctlAdhocId?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetAdhocId requires N-API addon")

public actual fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocctlCreateEnterGameMode requires N-API addon")

public actual fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocctlJoinEnterGameMode requires N-API addon")

public actual fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: SceNetAdhocctlGameModeInfo?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetGameModeInfo requires N-API addon")

public actual fun sceNetAdhocctlExitGameMode(): Int =
    throw UnsupportedOperationException("sceNetAdhocctlExitGameMode requires N-API addon")

public actual fun sceNetAdhocctlGetPeerList(length: Int?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetPeerList requires N-API addon")

public actual fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: SceNetAdhocctlPeerInfo?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetPeerInfo requires N-API addon")

public actual fun sceNetAdhocctlScan(): Int =
    throw UnsupportedOperationException("sceNetAdhocctlScan requires N-API addon")

public actual fun sceNetAdhocctlGetScanInfo(length: Int?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetScanInfo requires N-API addon")

public actual fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlAddHandler requires N-API addon")

public actual fun sceNetAdhocctlDelHandler(id: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocctlDelHandler requires N-API addon")

public actual fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetNameByAddr requires N-API addon")

public actual fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: Int?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetAddrByName requires N-API addon")

public actual fun sceNetAdhocctlGetParameter(params: SceNetAdhocctlParams?): Int =
    throw UnsupportedOperationException("sceNetAdhocctlGetParameter requires N-API addon")

public actual fun sceNetAdhocInit(): Int =
    throw UnsupportedOperationException("sceNetAdhocInit requires N-API addon")

public actual fun sceNetAdhocTerm(): Int =
    throw UnsupportedOperationException("sceNetAdhocTerm requires N-API addon")

public actual fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPdpCreate requires N-API addon")

public actual fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPdpDelete requires N-API addon")

public actual fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPdpSend requires N-API addon")

public actual fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: UShort?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPdpRecv requires N-API addon")

public actual fun sceNetAdhocGetPdpStat(size: Int?, stat: SceNetAdhocPdpStat?): Int =
    throw UnsupportedOperationException("sceNetAdhocGetPdpStat requires N-API addon")

public actual fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeCreateMaster requires N-API addon")

public actual fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeCreateReplica requires N-API addon")

public actual fun sceNetAdhocGameModeUpdateMaster(): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeUpdateMaster requires N-API addon")

public actual fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeUpdateReplica requires N-API addon")

public actual fun sceNetAdhocGameModeDeleteMaster(): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeDeleteMaster requires N-API addon")

public actual fun sceNetAdhocGameModeDeleteReplica(id: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocGameModeDeleteReplica requires N-API addon")

public actual fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpOpen requires N-API addon")

public actual fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpConnect requires N-API addon")

public actual fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpListen requires N-API addon")

public actual fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: UShort?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpAccept requires N-API addon")

public actual fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpSend requires N-API addon")

public actual fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpRecv requires N-API addon")

public actual fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpFlush requires N-API addon")

public actual fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocPtpClose requires N-API addon")

public actual fun sceNetAdhocGetPtpStat(size: Int?, stat: SceNetAdhocPtpStat?): Int =
    throw UnsupportedOperationException("sceNetAdhocGetPtpStat requires N-API addon")

public actual fun sceNetAdhocMatchingInit(memsize: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingInit requires N-API addon")

public actual fun sceNetAdhocMatchingTerm(): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingTerm requires N-API addon")

public actual fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingCreate requires N-API addon")

public actual fun sceNetAdhocMatchingDelete(matchingId: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingDelete requires N-API addon")

public actual fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingStart requires N-API addon")

public actual fun sceNetAdhocMatchingStop(matchingId: Int): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingStop requires N-API addon")

public actual fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingSelectTarget requires N-API addon")

public actual fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingCancelTarget requires N-API addon")

public actual fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingCancelTargetWithOpt requires N-API addon")

public actual fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingSendData requires N-API addon")

public actual fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingAbortSendData requires N-API addon")

public actual fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingSetHelloOpt requires N-API addon")

public actual fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: Int?, optData: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingGetHelloOpt requires N-API addon")

public actual fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: Int?, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingGetMembers requires N-API addon")

public actual fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingGetPoolMaxAlloc requires N-API addon")

public actual fun sceNetAdhocMatchingGetPoolStat(poolstat: AdhocPoolStat?): Int =
    throw UnsupportedOperationException("sceNetAdhocMatchingGetPoolStat requires N-API addon")

public actual fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int =
    throw UnsupportedOperationException("sceNetApctlInit requires N-API addon")

public actual fun sceNetApctlTerm(): Int =
    throw UnsupportedOperationException("sceNetApctlTerm requires N-API addon")

public actual fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: SceNetApctlInfo?): Int =
    throw UnsupportedOperationException("sceNetApctlGetInfo requires N-API addon")

public actual fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceNetApctlAddHandler requires N-API addon")

public actual fun sceNetApctlDelHandler(handlerId: Int): Int =
    throw UnsupportedOperationException("sceNetApctlDelHandler requires N-API addon")

public actual fun sceNetApctlConnect(connIndex: Int): Int =
    throw UnsupportedOperationException("sceNetApctlConnect requires N-API addon")

public actual fun sceNetApctlDisconnect(): Int =
    throw UnsupportedOperationException("sceNetApctlDisconnect requires N-API addon")

public actual fun sceNetApctlGetState(pstate: ApctlState?): Int =
    throw UnsupportedOperationException("sceNetApctlGetState requires N-API addon")

public actual fun sceNetInetInit(): Int =
    throw UnsupportedOperationException("sceNetInetInit requires N-API addon")

public actual fun sceNetInetTerm(): Int =
    throw UnsupportedOperationException("sceNetInetTerm requires N-API addon")

public actual fun sceNetInetAccept(s: Int, addr: Sockaddr?, addrLen: SocklenT?): Int =
    throw UnsupportedOperationException("sceNetInetAccept requires N-API addon")

public actual fun sceNetInetBind(s: Int, myAddr: Sockaddr?, addrLen: SocklenT): Int =
    throw UnsupportedOperationException("sceNetInetBind requires N-API addon")

public actual fun sceNetInetConnect(s: Int, servAddr: Sockaddr?, addrLen: SocklenT): Int =
    throw UnsupportedOperationException("sceNetInetConnect requires N-API addon")

public actual fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: SocklenT?): Int =
    throw UnsupportedOperationException("sceNetInetGetsockopt requires N-API addon")

public actual fun sceNetInetListen(s: Int, backlog: Int): Int =
    throw UnsupportedOperationException("sceNetInetListen requires N-API addon")

public actual fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("sceNetInetRecv requires N-API addon")

public actual fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: Sockaddr?, fromLen: SocklenT?): ULong =
    throw UnsupportedOperationException("sceNetInetRecvfrom requires N-API addon")

public actual fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("sceNetInetSend requires N-API addon")

public actual fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, toLen: SocklenT): ULong =
    throw UnsupportedOperationException("sceNetInetSendto requires N-API addon")

public actual fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int =
    throw UnsupportedOperationException("sceNetInetSetsockopt requires N-API addon")

public actual fun sceNetInetShutdown(s: Int, how: Int): Int =
    throw UnsupportedOperationException("sceNetInetShutdown requires N-API addon")

public actual fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int =
    throw UnsupportedOperationException("sceNetInetSocket requires N-API addon")

public actual fun sceNetInetClose(s: Int): Int =
    throw UnsupportedOperationException("sceNetInetClose requires N-API addon")

public actual fun sceNetInetGetErrno(): Int =
    throw UnsupportedOperationException("sceNetInetGetErrno requires N-API addon")

public actual fun sceSslInit(unknown1: Int): Int =
    throw UnsupportedOperationException("sceSslInit requires N-API addon")

public actual fun sceSslEnd(): Int =
    throw UnsupportedOperationException("sceSslEnd requires N-API addon")

public actual fun sceSslGetUsedMemoryMax(memory: UInt?): Int =
    throw UnsupportedOperationException("sceSslGetUsedMemoryMax requires N-API addon")

public actual fun sceSslGetUsedMemoryCurrent(memory: UInt?): Int =
    throw UnsupportedOperationException("sceSslGetUsedMemoryCurrent requires N-API addon")

public actual fun sceHttpInit(unknown1: UInt): Int =
    throw UnsupportedOperationException("sceHttpInit requires N-API addon")

public actual fun sceHttpEnd(): Int =
    throw UnsupportedOperationException("sceHttpEnd requires N-API addon")

public actual fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int =
    throw UnsupportedOperationException("sceHttpCreateTemplate requires N-API addon")

public actual fun sceHttpDeleteTemplate(templateid: Int): Int =
    throw UnsupportedOperationException("sceHttpDeleteTemplate requires N-API addon")

public actual fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int =
    throw UnsupportedOperationException("sceHttpCreateConnection requires N-API addon")

public actual fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int =
    throw UnsupportedOperationException("sceHttpCreateConnectionWithURL requires N-API addon")

public actual fun sceHttpDeleteConnection(connectionId: Int): Int =
    throw UnsupportedOperationException("sceHttpDeleteConnection requires N-API addon")

public actual fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int =
    throw UnsupportedOperationException("sceHttpCreateRequest requires N-API addon")

public actual fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int =
    throw UnsupportedOperationException("sceHttpCreateRequestWithURL requires N-API addon")

public actual fun sceHttpDeleteRequest(requestId: Int): Int =
    throw UnsupportedOperationException("sceHttpDeleteRequest requires N-API addon")

public actual fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    throw UnsupportedOperationException("sceHttpSendRequest requires N-API addon")

public actual fun sceHttpAbortRequest(requestId: Int): Int =
    throw UnsupportedOperationException("sceHttpAbortRequest requires N-API addon")

public actual fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int =
    throw UnsupportedOperationException("sceHttpReadData requires N-API addon")

public actual fun sceHttpGetContentLength(requestId: Int, contentLength: ULong?): Int =
    throw UnsupportedOperationException("sceHttpGetContentLength requires N-API addon")

public actual fun sceHttpGetStatusCode(requestId: Int, statusCode: Int?): Int =
    throw UnsupportedOperationException("sceHttpGetStatusCode requires N-API addon")

public actual fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceHttpSetResolveTimeOut requires N-API addon")

public actual fun sceHttpSetResolveRetry(id: Int, count: Int): Int =
    throw UnsupportedOperationException("sceHttpSetResolveRetry requires N-API addon")

public actual fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceHttpSetConnectTimeOut requires N-API addon")

public actual fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceHttpSetSendTimeOut requires N-API addon")

public actual fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int =
    throw UnsupportedOperationException("sceHttpSetRecvTimeOut requires N-API addon")

public actual fun sceHttpEnableKeepAlive(id: Int): Int =
    throw UnsupportedOperationException("sceHttpEnableKeepAlive requires N-API addon")

public actual fun sceHttpDisableKeepAlive(id: Int): Int =
    throw UnsupportedOperationException("sceHttpDisableKeepAlive requires N-API addon")

public actual fun sceHttpEnableRedirect(id: Int): Int =
    throw UnsupportedOperationException("sceHttpEnableRedirect requires N-API addon")

public actual fun sceHttpDisableRedirect(id: Int): Int =
    throw UnsupportedOperationException("sceHttpDisableRedirect requires N-API addon")

public actual fun sceHttpEnableCookie(id: Int): Int =
    throw UnsupportedOperationException("sceHttpEnableCookie requires N-API addon")

public actual fun sceHttpDisableCookie(id: Int): Int =
    throw UnsupportedOperationException("sceHttpDisableCookie requires N-API addon")

public actual fun sceHttpSaveSystemCookie(): Int =
    throw UnsupportedOperationException("sceHttpSaveSystemCookie requires N-API addon")

public actual fun sceHttpLoadSystemCookie(): Int =
    throw UnsupportedOperationException("sceHttpLoadSystemCookie requires N-API addon")

public actual fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int =
    throw UnsupportedOperationException("sceHttpAddExtraHeader requires N-API addon")

public actual fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int =
    throw UnsupportedOperationException("sceHttpDeleteHeader requires N-API addon")

public actual fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int =
    throw UnsupportedOperationException("sceHttpsInit requires N-API addon")

public actual fun sceHttpsEnd(): Int =
    throw UnsupportedOperationException("sceHttpsEnd requires N-API addon")

public actual fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int =
    throw UnsupportedOperationException("sceHttpsLoadDefaultCert requires N-API addon")

public actual fun sceHttpDisableAuth(id: Int): Int =
    throw UnsupportedOperationException("sceHttpDisableAuth requires N-API addon")

public actual fun sceHttpDisableCache(id: Int): Int =
    throw UnsupportedOperationException("sceHttpDisableCache requires N-API addon")

public actual fun sceHttpEnableAuth(id: Int): Int =
    throw UnsupportedOperationException("sceHttpEnableAuth requires N-API addon")

public actual fun sceHttpEnableCache(id: Int): Int =
    throw UnsupportedOperationException("sceHttpEnableCache requires N-API addon")

public actual fun sceHttpEndCache(): Int =
    throw UnsupportedOperationException("sceHttpEndCache requires N-API addon")

public actual fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: UInt?): Int =
    throw UnsupportedOperationException("sceHttpGetAllHeader requires N-API addon")

public actual fun sceHttpGetNetworkErrno(request: Int, errNum: Int?): Int =
    throw UnsupportedOperationException("sceHttpGetNetworkErrno requires N-API addon")

public actual fun sceHttpGetProxy(id: Int, activateFlag: Int?, mode: Int?, proxyHost: COpaquePointer?, len: ULong, proxyPort: UShort?): Int =
    throw UnsupportedOperationException("sceHttpGetProxy requires N-API addon")

public actual fun sceHttpInitCache(maxSize: ULong): Int =
    throw UnsupportedOperationException("sceHttpInitCache requires N-API addon")

public actual fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int =
    throw UnsupportedOperationException("sceHttpSetAuthInfoCB requires N-API addon")

public actual fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int =
    throw UnsupportedOperationException("sceHttpSetProxy requires N-API addon")

public actual fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int =
    throw UnsupportedOperationException("sceHttpSetResHeaderMaxSize requires N-API addon")

public actual fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int =
    throw UnsupportedOperationException("sceHttpSetMallocFunction requires N-API addon")

public actual fun sceNetResolverInit(): Int =
    throw UnsupportedOperationException("sceNetResolverInit requires N-API addon")

public actual fun sceNetResolverCreate(rid: Int?, buf: COpaquePointer?, bufLength: UInt): Int =
    throw UnsupportedOperationException("sceNetResolverCreate requires N-API addon")

public actual fun sceNetResolverDelete(rid: Int): Int =
    throw UnsupportedOperationException("sceNetResolverDelete requires N-API addon")

public actual fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: InAddr?, timeout: UInt, retry: Int): Int =
    throw UnsupportedOperationException("sceNetResolverStartNtoA requires N-API addon")

public actual fun sceNetResolverStartAtoN(rid: Int, addr: InAddr?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int =
    throw UnsupportedOperationException("sceNetResolverStartAtoN requires N-API addon")

public actual fun sceNetResolverStop(rid: Int): Int =
    throw UnsupportedOperationException("sceNetResolverStop requires N-API addon")

public actual fun sceNetResolverTerm(): Int =
    throw UnsupportedOperationException("sceNetResolverTerm requires N-API addon")

